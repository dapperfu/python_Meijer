"""
CLI commands for Meijer CLI.

This module contains all the Click command groups and individual commands.
"""

import logging
import sys
from pathlib import Path
from typing import Optional

import click

from .utils import (
    add_items_from_file,
    display_items_table,
    export_to_csv,
    export_to_json,
    export_to_text,
    get_meijer_client,
    import_from_csv,
    import_from_json,
    import_from_text,
)


# Shopping List Commands
@click.group()
def list_group():
    """Manage shopping list operations."""
    pass


@list_group.command("show")
@click.option("--completed", is_flag=True, help="Show only completed items")
@click.option("--pending", is_flag=True, help="Show only pending items")
@click.option("--tabulate", is_flag=True, help="Force tabulate table format (for testing)")
@click.option("--rich", is_flag=True, help="Force rich table format (for testing)")
def list_show(completed: bool, pending: bool, tabulate: bool, rich: bool):
    """Show shopping list items."""
    logger = logging.getLogger(__name__)
    logger.debug(
        f"List show command called with completed={completed}, pending={pending}"
    )

    client = get_meijer_client()

    try:
        logger.debug("Fetching shopping list items")
        items = client.list.get()
        logger.debug(f"Retrieved {len(items)} items from shopping list")

        if not items:
            logger.debug("Shopping list is empty")
            click.echo("📝 Your shopping list is empty!")
            return

        # Filter items based on flags
        if completed:
            logger.debug("Filtering for completed items only")
            items = [item for item in items if item.checked]
            title = "Completed Items"
        elif pending:
            logger.debug("Filtering for pending items only")
            items = [item for item in items if not item.checked]
            title = "Pending Items"
        else:
            title = f"Shopping List ({len(items)} items)"

        logger.debug(f"Displaying {len(items)} filtered items")
        # Determine table format based on flags
        if tabulate:
            table_format = "tabulate"
        elif rich:
            table_format = "rich"
        else:
            table_format = "auto"  # Default behavior
        
        display_items_table(items, title, table_format=table_format)

        # Show summary
        total = len(items)
        completed_count = len([item for item in items if item.checked])
        pending_count = total - completed_count

        logger.debug(
            f"Summary: total={total}, completed={completed_count}, pending={pending_count}"
        )
        click.echo(
            f"\n📊 Summary: {total} total, {completed_count} completed, {pending_count} pending"
        )

    except Exception as e:
        logger.error(f"Failed to show shopping list: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to show shopping list: {e}")


@list_group.command("favorites")
def list_favorites():
    """Show favorite items."""
    logger = logging.getLogger(__name__)
    logger.debug("List favorites command called")

    client = get_meijer_client()

    try:
        logger.debug("Fetching favorite items")
        favorites = client.list.get_favorites()
        logger.debug(f"Retrieved {len(favorites)} favorite items")

        if not favorites:
            logger.debug("No favorite items found")
            click.echo("📝 No favorite items found!")
            return

        # Prepare table data
        logger.debug("Preparing favorites table data")
        table_data = []
        for i, item in enumerate(favorites, 1):
            logger.debug(f"Processing favorite item {i}: {item.name}")
            # Check if item is in active list by looking at list_item_id
            # If it's a favorite item, it might not have the same structure as regular list items
            in_list_status = (
                "✅ In List"
                if hasattr(item, "list_item_id") and item.list_item_id
                else "⭕ Not in List"
            )

            table_data.append(
                [
                    i,
                    item.name[:40] + "..." if len(item.name) > 40 else item.name,
                    item.quantity,
                    in_list_status,
                ]
            )

        headers = ["#", "Favorite Item", "Qty", "Status"]

        try:
            from tabulate import tabulate

            logger.debug("Using tabulate for favorites table")
            click.echo(f"\n📊 Favorites ({len(favorites)} items):")
            click.echo(tabulate(table_data, headers=headers, tablefmt="fancy_grid"))
        except ImportError:
            logger.debug("Tabulate not available, using fallback formatting")
            click.echo(f"\n📊 Favorites ({len(favorites)} items):")
            click.echo(
                "╒══════════════════════════════════════════════════════════════════════════════════════════════════╕"
            )
            click.echo(f"│ {'#':<3} {'Favorite Item':<40} {'Qty':<4} {'Status':<15} │")
            click.echo(
                "╞══════════════════════════════════════════════════════════════════════════════════════════════════╡"
            )
            for row in table_data:
                click.echo(f"│ {row[0]:<3} {row[1]:<40} {row[2]:<4} {row[3]:<15} │")
            click.echo(
                "╘══════════════════════════════════════════════════════════════════════════════════════════════════╛"
            )

    except Exception as e:
        logger.error(f"Failed to show favorites: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to show favorites: {e}")


@list_group.command("add")
@click.argument("item", required=False)
@click.option("--quantity", "-q", default=1, help="Quantity to add")
@click.option("--notes", "-n", help="Additional notes for the item")
@click.option("--file", "-f", type=click.Path(exists=True), help="Read items from file")
def list_add(item: Optional[str], quantity: int, notes: str, file: str):
    """Add item(s) to shopping list."""
    client = get_meijer_client()

    try:
        if file:
            # Add items from file
            with open(file, "r") as f:
                add_items_from_file(client, f)
        elif not item and not sys.stdin.isatty():
            # Add items from stdin (pipe)
            add_items_from_file(client, sys.stdin)
        elif item:
            # Add single item
            if item.isdigit() and len(item) >= 8:
                # Treat as UPC
                success = client.list.add_item(upc=item, quantity=quantity)
                if success:
                    click.echo(f"✅ Added UPC {item} to shopping list")
                else:
                    raise click.ClickException(f"❌ Failed to add UPC {item}")
            else:
                # Treat as description
                success = client.list.add_item_with_details(
                    upc=f"ITEM_{hash(item) % 10000}",  # Generate unique identifier
                    description=item,
                    quantity=quantity,
                    notes=notes,
                )
                if success:
                    click.echo(f"✅ Added '{item}' to shopping list")
                else:
                    raise click.ClickException(f"❌ Failed to add '{item}'")
        else:
            raise click.ClickException(
                "❌ No item specified and no input provided.\n"
                "   Usage: meijer list add <item> OR meijer list add < file.txt"
            )

    except Exception as e:
        raise click.ClickException(f"❌ Failed to add item: {e}")


@list_group.command("clear")
def list_clear():
    """Clear completed items from shopping list."""
    client = get_meijer_client()

    try:
        items = client.list.get()
        if not items:
            click.echo("📝 Shopping list is already empty!")
            return

        completed_items = [item for item in items if item.checked]
        if not completed_items:
            click.echo("📝 No completed items to clear!")
            return

        click.echo(f"🗑️  Clearing {len(completed_items)} completed items...")

        # Delete completed items
        deleted_count = 0
        for item in completed_items:
            if client.list.delete_item(str(item.list_item_id)):
                deleted_count += 1
                click.echo(f"  ✅ Deleted: {item.name}")
            else:
                click.echo(f"  ❌ Failed to delete: {item.name}")

        click.echo(f"\n📊 Cleared {deleted_count} completed items")

    except Exception as e:
        raise click.ClickException(f"❌ Failed to clear completed items: {e}")


@list_group.command("clearall")
@click.confirmation_option(
    prompt="⚠️  Are you sure you want to clear ALL items? This cannot be undone!"
)
def list_clearall():
    """Clear all items from shopping list (completed and pending)."""
    client = get_meijer_client()

    try:
        items = client.list.get()
        if not items:
            click.echo("📝 Shopping list is already empty!")
            return

        click.echo(f"🗑️  Clearing ALL {len(items)} items...")

        # Mark everything as complete first, then clear
        click.echo("📝 Marking all items as complete...")
        completed_count = 0
        for item in items:
            if not item.checked:
                if client.list.complete_item(str(item.list_item_id)):
                    completed_count += 1
                    click.echo(f"  ✅ Marked complete: {item.name}")
                else:
                    click.echo(f"  ❌ Failed to mark complete: {item.name}")

        click.echo(f"📊 Marked {completed_count} items as complete")

        # Now clear all completed items
        click.echo("🗑️  Clearing all completed items...")
        all_items = client.list.get()  # Get updated list
        deleted_count = 0
        for item in all_items:
            if client.list.delete_item(str(item.list_item_id)):
                deleted_count += 1
                click.echo(f"  ✅ Deleted: {item.name}")
            else:
                click.echo(f"  ❌ Failed to delete: {item.name}")

        click.echo(f"\n📊 Cleared {deleted_count} items total")

    except Exception as e:
        raise click.ClickException(f"❌ Failed to clear all items: {e}")


@list_group.command("defrag")
@click.option("--store-id", help="Store ID for location lookup")
@click.option(
    "-r", "--reverse", is_flag=True, help="Sort items in reverse order (descending)"
)
@click.option(
    "-z",
    "--zig",
    is_flag=True,
    help="Alternate B aisle sorting (B1 ascending, B2 descending, etc.)",
)
def list_defrag(store_id: Optional[str], reverse: bool, zig: bool):
    """Defragment shopping list by organizing items by aisle."""
    client = get_meijer_client()

    try:
        click.echo("🔧 Starting shopping list defrag...")
        click.echo("⏳ This may take a moment to search for product locations...")

        if reverse:
            click.echo("🔄 Using reverse sorting (descending order)")
        if zig:
            click.echo(
                "🔄 Using zig-zag B aisle sorting (B1 ascending, B2 descending, etc.)"
            )

        success = client.list.defrag(store_id=store_id, reverse=reverse, zig=zig)

        if success:
            click.echo("🎉 Defrag completed successfully!")
            click.echo(
                "📋 Your shopping list is now organized by aisle for efficient shopping!"
            )
        else:
            raise click.ClickException("❌ Defrag failed!")
    except Exception as e:
        raise click.ClickException(f"❌ Defrag failed: {e}")


@list_group.command("export")
@click.argument("filename", type=click.Path(), default="shopping_list.txt")
@click.option(
    "--format",
    "-f",
    type=click.Choice(["text", "csv", "json"]),
    default="text",
    help="Export format",
)
def list_export(filename: str, format: str):
    """Export shopping list to a file with full details for round-trip import."""
    client = get_meijer_client()

    try:
        items = client.list.get()

        if not items:
            click.echo("📝 Shopping list is empty - nothing to export!")
            return

        # Create directory if it doesn't exist
        file_path = Path(filename)
        file_path.parent.mkdir(parents=True, exist_ok=True)

        if format == "text":
            export_to_text(items, file_path)
        elif format == "csv":
            export_to_csv(items, file_path)
        elif format == "json":
            export_to_json(items, file_path)

        click.echo(f"✅ Exported {len(items)} items to {filename}")
        click.echo(f"📁 File saved to: {file_path.absolute()}")

    except Exception as e:
        raise click.ClickException(f"❌ Export failed: {e}")


@list_group.command("import")
@click.argument("filename", type=click.Path(exists=True))
@click.option("--clear", "-c", is_flag=True, help="Clear existing list before import")
@click.option(
    "--format",
    "-f",
    type=click.Choice(["auto", "text", "csv", "json"]),
    default="auto",
    help="Import format (auto-detect if not specified)",
)
def list_import(filename: str, clear: bool, format: str):
    """Import shopping list from a file with full details."""
    client = get_meijer_client()

    try:
        file_path = Path(filename)

        # Clear existing list if requested
        if clear:
            click.echo("🗑️  Clearing existing shopping list...")
            items = client.list.get()
            cleared_count = 0
            for item in items:
                if client.list.delete_item(str(item.list_item_id)):
                    cleared_count += 1
            click.echo(f"📊 Cleared {cleared_count} existing items")

        # Auto-detect format if not specified
        if format == "auto":
            if filename.endswith(".csv"):
                format = "csv"
            elif filename.endswith(".json"):
                format = "json"
            else:
                format = "text"

        # Import based on format
        if format == "text":
            imported_count = import_from_text(client, file_path)
        elif format == "csv":
            imported_count = import_from_csv(client, file_path)
        elif format == "json":
            imported_count = import_from_json(client, file_path)
        else:
            raise click.ClickException(f"❌ Unsupported format: {format}")

        click.echo(f"\n📊 Import Summary: {imported_count} items imported")
        click.echo(f"📁 File processed: {file_path.absolute()}")

    except Exception as e:
        raise click.ClickException(f"❌ Import failed: {e}")


@list_group.command("interactive")
def list_interactive():
    """Interactive shopping list management."""
    client = get_meijer_client()

    try:
        click.echo("🔄 Starting interactive mode...")
        click.echo("📝 Type 'help' for available commands, 'quit' to exit")

        while True:
            try:
                command = input("\n🛒 meijer> ").strip().lower()

                if command in ["quit", "exit", "q"]:
                    click.echo("👋 Goodbye!")
                    break
                elif command in ["help", "h", "?"]:
                    click.echo("""
📋 Available Commands:
  show          - Show current shopping list
  add <item>    - Add item to list
  clear         - Clear completed items
  export        - Export list to file
  quit          - Exit interactive mode
  help          - Show this help
                    """)
                elif command == "show":
                    items = client.list.get()
                    if items:
                        display_items_table(items, "Current Shopping List")
                    else:
                        click.echo("📝 Shopping list is empty!")
                elif command.startswith("add "):
                    item_name = command[4:].strip()
                    if item_name:
                        success = client.list.add_item_with_details(
                            upc=f"ITEM_{hash(item_name) % 10000}",
                            description=item_name,
                            quantity=1,
                            notes="",
                        )
                        if success:
                            click.echo(f"✅ Added '{item_name}' to shopping list")
                        else:
                            click.echo(f"❌ Failed to add '{item_name}'")
                    else:
                        click.echo("❌ Please specify an item to add")
                elif command == "clear":
                    items = client.list.get()
                    completed_items = [item for item in items if item.checked]
                    if completed_items:
                        click.echo(
                            f"🗑️  Clearing {len(completed_items)} completed items..."
                        )
                        for item in completed_items:
                            client.list.delete_item(str(item.list_item_id))
                        click.echo("✅ Completed items cleared")
                    else:
                        click.echo("📝 No completed items to clear")
                elif command == "export":
                    filename = input(
                        "📁 Enter filename (default: shopping_list.txt): "
                    ).strip()
                    if not filename:
                        filename = "shopping_list.txt"

                    file_path = Path(filename)
                    items = client.list.get()
                    if items:
                        export_to_text(items, file_path)
                        click.echo(f"✅ Exported to {file_path.absolute()}")
                    else:
                        click.echo("📝 Nothing to export - list is empty")
                else:
                    click.echo(f"❌ Unknown command: {command}")
                    click.echo("💡 Type 'help' for available commands")

            except KeyboardInterrupt:
                click.echo("\n👋 Goodbye!")
                break
            except Exception as e:
                click.echo(f"❌ Error: {e}")

    except Exception as e:
        raise click.ClickException(f"❌ Interactive mode failed: {e}")


# Individual Commands
@click.command()
def ad_command():
    """Browse weekly ad items and add them to your shopping list."""
    try:
        from ..ad_browser import browse_weekly_ad

        client = get_meijer_client()
        browse_weekly_ad(client)

    except ImportError as e:
        raise click.ClickException(f"❌ Failed to import ad browser module: {e}")
    except Exception as e:
        raise click.ClickException(f"❌ Failed to start ad browser: {e}")


@click.command()
def gas_command():
    """Show gas station information."""
    client = get_meijer_client()

    try:
        # Get account info to find home store
        account_info = client.account.get()
        home_store_id = account_info.get("homeStoreId") if account_info else None

        if home_store_id:
            click.echo(f"🏠 Home Store: {home_store_id}")
        else:
            click.echo("🏠 No home store configured")

        # Show gas prices for default store (217)
        store_id = "217"
        click.echo(f"⛽ Checking gas prices for store {store_id}...")

        try:
            gas_info = client.gas.get_prices(store_id)
            if gas_info:
                click.echo("⛽ Current Gas Prices:")
                for fuel_type, price in gas_info.items():
                    click.echo(f"  {fuel_type}: ${price:.3f}/gal")
            else:
                click.echo("❌ No gas price information available")
        except Exception as e:
            click.echo(f"❌ Failed to get gas prices: {e}")

    except Exception as e:
        raise click.ClickException(f"❌ Failed to get gas information: {e}")


@click.command()
def status_command():
    """Show authentication status."""
    logger = logging.getLogger(__name__)
    logger.debug("Status command called")

    try:
        logger.debug("Getting Meijer client for status check")
        client = get_meijer_client()

        logger.debug(f"Client authentication status: {client.auth_status.name}")
        logger.debug(f"User ID: {client.user_id}")
        logger.debug(f"Home store ID: {client.home_store_id}")

        click.echo(f"🔐 Authentication Status: {client.auth_status.name}")
        click.echo(f"👤 User ID: {client.user_id}")
        click.echo(f"🏪 Home Store: {client.home_store_id}")

        # Check token expiry
        if hasattr(client, "token_expires_at") and client.token_expires_at:
            from datetime import datetime

            now = datetime.now()
            expires = client.token_expires_at
            logger.debug(f"Token expires at: {expires}")

            if isinstance(expires, str):
                try:
                    expires = datetime.fromisoformat(expires.replace("Z", "+00:00"))
                    logger.debug(f"Parsed expiry time: {expires}")
                except Exception as parse_error:
                    logger.warning(f"Failed to parse expiry time: {parse_error}")
                    expires = None

            if expires:
                if expires > now:
                    time_left = expires - now
                    logger.debug(f"Token expires in: {time_left}")
                    click.echo(f"⏰ Token expires in: {time_left}")
                else:
                    logger.warning("Token has expired")
                    click.echo("⚠️  Token has expired!")
            else:
                logger.debug("Token expiry time unknown")
                click.echo("⏰ Token expiry: Unknown")
        else:
            logger.debug("Token expiry information not available")
            click.echo("⏰ Token expiry: Not available")

    except Exception as e:
        logger.error(f"Failed to get status: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to get status: {e}")


@click.command()
def settings_command():
    """Show current account settings."""
    logger = logging.getLogger(__name__)
    logger.debug("Settings command called")

    try:
        logger.debug("Getting Meijer client for settings")
        client = get_meijer_client()
        click.echo("⚙️  Account Settings:")

        # Get account info
        logger.debug("Fetching account information")
        account_info = client.account.get()
        if account_info:
            logger.debug(f"Retrieved account info: {account_info}")
            click.echo(
                f"  👤 Name: {account_info.get('firstName', 'N/A')} {account_info.get('lastName', 'N/A')}"
            )
            click.echo(f"  📧 Email: {account_info.get('email', 'N/A')}")
            click.echo(f"  🏠 Home Store: {account_info.get('homeStoreId', 'N/A')}")
            click.echo(f"  📱 Phone: {account_info.get('phoneNumber', 'N/A')}")
        else:
            logger.warning("Failed to retrieve account information")
            click.echo("  ❌ Failed to get account information")

    except Exception as e:
        logger.error(f"Failed to get settings: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to get settings: {e}")


# Coupons Commands
@click.group()
def coupons_group():
    """Manage coupons and offers."""
    pass


@coupons_group.command("list")
@click.option("--clipped", is_flag=True, help="Show only clipped coupons")
@click.option("--available", is_flag=True, help="Show only available coupons")
def coupons_list(clipped: bool, available: bool):
    """List available coupons."""
    logger = logging.getLogger(__name__)
    logger.debug(
        f"Coupons list command called with clipped={clipped}, available={available}"
    )

    try:
        client = get_meijer_client()

        if clipped:
            logger.debug("Fetching clipped coupons")
            # For now, get all coupons and filter for clipped ones
            coupons = client.get_coupons()
            coupons = [c for c in coupons if getattr(c, "clipped", False)]
            title = "Clipped Coupons"
        elif available:
            logger.debug("Fetching available coupons")
            # For now, get all coupons and filter for non-clipped ones
            coupons = client.get_coupons()
            coupons = [c for c in coupons if not getattr(c, "clipped", False)]
            title = "Available Coupons"
        else:
            logger.debug("Fetching all coupons")
            coupons = client.get_coupons()
            title = "All Coupons"

        logger.debug(f"Retrieved {len(coupons)} coupons")

        if not coupons:
            click.echo(f"📝 No {title.lower()} found!")
            return

        # Display coupons in a simple format
        click.echo(f"\n🎫 {title} ({len(coupons)} items):")
        click.echo("=" * 80)

        for i, coupon in enumerate(coupons, 1):
            status = (
                "✅ Clipped" if getattr(coupon, "clipped", False) else "⭕ Available"
            )
            click.echo(f"{i:2d}. {status} - {coupon.title}")
            if hasattr(coupon, "description") and coupon.description:
                click.echo(f"     {coupon.description}")
            if hasattr(coupon, "redemption_end_date") and coupon.redemption_end_date:
                click.echo(f"     Expires: {coupon.redemption_end_date}")
            click.echo()

        logger.debug(f"Displayed {len(coupons)} coupons")

    except Exception as e:
        logger.error(f"Failed to list coupons: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to list coupons: {e}")


# Cart Commands
@click.group()
def cart_group():
    """Manage shopping cart and fulfillment."""
    pass


@cart_group.command("show")
def cart_show():
    """Show current shopping cart."""
    logger = logging.getLogger(__name__)
    logger.debug("Cart show command called")

    try:
        client = get_meijer_client()

        if not client.cart:
            logger.warning("Cart module not available")
            click.echo("❌ Cart functionality not available")
            return

        logger.debug("Fetching cart contents")
        cart_items = client.cart.get_items()
        logger.debug(f"Retrieved {len(cart_items)} cart items")

        if not cart_items:
            click.echo("🛒 Your shopping cart is empty!")
            return

        click.echo(f"\n🛒 Shopping Cart ({len(cart_items)} items):")
        click.echo("=" * 60)

        for i, item in enumerate(cart_items, 1):
            click.echo(f"{i:2d}. {item.name} - Qty: {item.quantity}")
            if hasattr(item, "price") and item.price:
                click.echo(f"     Price: ${item.price}")

        logger.debug(f"Displayed {len(cart_items)} cart items")

    except Exception as e:
        logger.error(f"Failed to show cart: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to show cart: {e}")


# Settings Commands
@click.group()
def settings_group():
    """Manage account settings and preferences."""
    pass


# Authentication Commands
@click.command()
@click.option("--log-file", help="Specific mitmproxy log file to use")
def auth_command(log_file: str = None):
    """Extract authentication tokens from mitmproxy logs."""
    logger = logging.getLogger(__name__)
    logger.debug(f"Auth command called with log_file: {log_file}")

    try:
        # If no log file specified, automatically find the latest one
        if not log_file:
            import glob
            import os

            logger.debug(
                "No log file specified, searching for latest meijer_mitm_*.log"
            )
            # Find all meijer_mitm_*.log files
            log_pattern = "meijer_mitm_*.log"
            log_files = glob.glob(log_pattern)
            logger.debug(f"Found log files: {log_files}")

            if not log_files:
                logger.error("No mitmproxy log files found")
                raise click.ClickException(
                    "❌ No mitmproxy log files found. Expected pattern: meijer_mitm_*.log"
                )

            # Sort by modification time and get the latest
            log_files.sort(key=lambda x: os.path.getmtime(x), reverse=True)
            log_file = log_files[0]
            logger.debug(f"Selected latest log file: {log_file}")

            click.echo(f"🔍 Automatically found latest log file: {log_file}")
        else:
            logger.debug(f"Using specified log file: {log_file}")
            click.echo(f"🔍 Using specified log file: {log_file}")

        click.echo("⏳ This may take a moment for large log files...")

        # Use the existing extract_bearer_token.py tool
        import os
        import subprocess
        import sys

        # Get the path to the tools directory
        tools_dir = os.path.join(
            os.path.dirname(os.path.dirname(os.path.dirname(__file__))), "tools"
        )
        extract_script = os.path.join(tools_dir, "extract_bearer_token.py")
        logger.debug(f"Extract script path: {extract_script}")

        if not os.path.exists(extract_script):
            logger.error(f"Extract script not found: {extract_script}")
            raise click.ClickException(f"❌ Tool not found: {extract_script}")

        # Run the extract_bearer_token.py tool
        logger.debug("Running extract_bearer_token.py tool")
        click.echo("🔧 Using extract_bearer_token.py tool...")
        result = subprocess.run(
            [sys.executable, extract_script, log_file],
            capture_output=True,
            text=True,
            cwd=os.getcwd(),
        )

        if result.returncode != 0:
            logger.error(f"Extract tool failed with return code: {result.returncode}")
            logger.error(f"Tool stderr: {result.stderr}")
            click.echo(f"⚠️  Tool output: {result.stderr}")
            raise click.ClickException("❌ Failed to run extract_bearer_token.py tool")

        # Check if the tool created output files
        bearer_auth_json = "bearer_auth.json"
        if not os.path.exists(bearer_auth_json):
            logger.error("No bearer_auth.json file created by extract tool")
            raise click.ClickException("❌ No authentication tokens found in log file")

        # Load the extracted token
        import json
        from datetime import datetime

        logger.debug("Loading extracted token data")
        with open(bearer_auth_json, "r") as f:
            token_data = json.load(f)
        logger.debug(f"Token data keys: {list(token_data.keys())}")

        # Convert to the format expected by the client
        tokens = {
            "access_token": token_data["bearer_token"],
            "refresh_token": "",  # Not available from request headers
            "id_token": token_data["bearer_token"],  # Use as ID token
            "expires_in": 28800,  # Default, could be extracted from JWT
            "token_type": "Bearer",
            "scope": "",
            "user_agent": token_data.get("user_agent", ""),
        }

        # Try to extract expiration from JWT if possible
        try:
            import jwt

            logger.debug("Attempting to decode JWT for expiry information")
            payload = jwt.decode(
                tokens["access_token"], options={"verify_signature": False}
            )
            if payload.get("exp"):
                import time

                expires_in = payload.get("exp") - int(time.time())
                if expires_in > 0:
                    tokens["expires_in"] = expires_in
                    tokens["expires_at"] = payload.get("exp")
                    logger.debug(f"JWT expiry extracted: {expires_in} seconds")
                else:
                    logger.warning("JWT has already expired")
        except (ImportError, Exception) as jwt_error:
            logger.debug(f"JWT decoding failed: {jwt_error}")

        # Save to ~/.config/meijer.txt
        config_path = os.path.expanduser("~/.config/meijer.txt")
        os.makedirs(os.path.dirname(config_path), exist_ok=True)
        logger.debug(f"Saving tokens to: {config_path}")

        config = {
            **tokens,
            "updated_at": datetime.now().isoformat(),
            "source": f"Extracted from {log_file}",
            "extracted_at": datetime.now().isoformat(),
        }

        with open(config_path, "w") as f:
            json.dump(config, f, indent=2)

        logger.debug("Tokens saved successfully")
        click.echo(f"💾 Tokens saved to {config_path}")
        click.echo("✅ Authentication file updated successfully!")
        click.echo(f"🔑 Access token: {tokens['access_token'][:50]}...")
        click.echo(f"⏰ Expires in: {tokens['expires_in']} seconds")

        # Clean up temporary files
        for temp_file in ["bearer_auth.json", "bearer_token_analysis.json"]:
            if os.path.exists(temp_file):
                os.remove(temp_file)
                logger.debug(f"Cleaned up temporary file: {temp_file}")
                click.echo(f"🧹 Cleaned up {temp_file}")

    except Exception as e:
        logger.error(f"Failed to extract authentication: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to extract authentication: {e}")
