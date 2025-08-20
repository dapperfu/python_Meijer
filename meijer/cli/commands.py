"""
CLI commands for Meijer CLI.

This module contains all the Click command groups and individual commands.
"""

import logging
import os
import sys
from pathlib import Path
from typing import Optional

import click

from .utils import (
    add_items_from_file,
    display_items_table,
    export_to_csv,
    export_to_excel,
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
def list_show(completed: bool, pending: bool):
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
        display_items_table(items, title)

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


@list_group.command("estimate")
@click.option(
    "--store-id", "-s", help="Store ID for location lookup (default: current store)"
)
@click.option(
    "--output", "-o", type=click.Path(), help="Output file path (CSV or Excel)"
)
@click.option(
    "--include-location",
    is_flag=True,
    default=True,
    help="Include location information",
)
@click.option(
    "--include-matched",
    is_flag=True,
    default=True,
    help="Include matched product information",
)
@click.option(
    "--methods",
    "-m",
    type=click.Choice(["cart", "shop_scan", "search", "keywords"]),
    multiple=True,
    help="Preferred estimation methods in order (default: cart, shop_scan, search, keywords)",
)
def list_estimate(
    store_id: Optional[str],
    output: Optional[str],
    include_location: bool,
    include_matched: bool,
    methods: tuple,
):
    """Estimate cost of shopping list items with product matching and location data."""
    logger = logging.getLogger(__name__)
    logger.debug("List estimate command called")

    client = get_meijer_client()

    try:
        # Get shopping list items
        items = client.list.get()
        if not items:
            click.echo("📝 Your shopping list is empty!")
            return

        click.echo(f"🔍 Estimating costs for {len(items)} items...")

        # Convert methods tuple to list if provided
        preferred_methods = list(methods) if methods else None

        if preferred_methods:
            click.echo(f"🎯 Using methods in order: {', '.join(preferred_methods)}")
        else:
            click.echo("🎯 Using default methods: cart → shop_scan → search → keywords")

        # Estimate costs for all items
        from .utils import estimate_list_cost

        cost_data = estimate_list_cost(
            client,
            items,
            store_id,
            include_location,
            include_matched,
            preferred_methods,
        )

        if not cost_data:
            click.echo("❌ Failed to estimate costs")
            return

        # Display cost summary
        total_cost = sum(
            item.get("estimated_cost", 0) * item.get("quantity", 1)
            for item in cost_data
        )
        click.echo("\n💰 Cost Estimate Summary:")
        click.echo(f"   Total Items: {len(cost_data)}")
        click.echo(f"   Estimated Total: ${total_cost:.2f}")

        # Show methodology breakdown
        methodology_counts = {}
        for item in cost_data:
            methodology = item.get("methodology", "Unknown")
            methodology_counts[methodology] = methodology_counts.get(methodology, 0) + 1

        click.echo("\n🎯 Methodology Breakdown:")
        for methodology, count in methodology_counts.items():
            methodology_emoji = {
                "cart": "🛒",
                "shop_scan": "📱",
                "search": "🔍",
                "keywords": "🏷️",
                "error": "❌",
                "Unknown": "❓",
            }.get(methodology, "❓")
            click.echo(f"   {methodology_emoji} {methodology}: {count} item(s)")

        # Show items with costs
        from rich.console import Console
        from rich.table import Table

        console = Console()
        table = Table(
            title="Shopping List Cost Estimate",
            show_header=True,
            header_style="bold cyan",
        )

        headers = ["Item", "Quantity", "Est. Cost", "Total", "Method"]
        if include_matched:
            headers.insert(1, "Matched Product")
        if include_location:
            headers.append("Location")

        for header in headers:
            table.add_column(header, style="cyan", no_wrap=True)

        for item in cost_data:
            row_data = [
                item["name"],
                str(item["quantity"]),
                f"${item.get('estimated_cost', 0):.2f}",
                f"${(item.get('estimated_cost', 0) * item['quantity']):.2f}",
                item.get("methodology", "Unknown").upper(),
            ]

            if include_matched:
                matched = item.get("matched_product", "")
                row_data.insert(
                    1, matched[:30] + "..." if len(matched) > 30 else matched
                )

            if include_location:
                location = item.get("location", "")
                row_data.append(
                    location[:20] + "..." if len(location) > 20 else location
                )

            table.add_row(*row_data)

        console.print(table)

        # Export if requested
        if output:
            # Auto-detect format from file extension
            output_path = Path(output)
            file_extension = output_path.suffix.lower()

            if file_extension in [".xlsx", ".xls"]:
                # Excel format
                from .utils import export_cost_estimate_to_excel

                export_cost_estimate_to_excel(
                    cost_data, output, include_location, include_matched
                )
                click.echo(f"📊 Exported cost estimate to Excel: {output}")
            elif file_extension == ".csv":
                # CSV format
                from .utils import export_cost_estimate_to_csv

                export_cost_estimate_to_csv(
                    cost_data, output, include_location, include_matched
                )
                click.echo(f"📊 Exported cost estimate to CSV: {output}")
            else:
                # Invalid or unsupported format
                click.echo(f"❌ Unsupported file format: {file_extension}")
                click.echo("   Supported formats: .csv, .xlsx, .xls")
                click.echo("   Please use a supported file extension.")
                return

        click.echo(f"\n✅ Cost estimation complete! Estimated total: ${total_cost:.2f}")

        # Show methodology details
        click.echo("\n📋 Methodology Details:")
        click.echo("   🛒 Cart: Add items to cart and check subtotal (most accurate)")
        click.echo("   📱 Shop & Scan: Use Shop & Scan API for pricing")
        click.echo("   🔍 Search: Text search with product matching")
        click.echo("   🏷️ Keywords: Fallback category-based estimation")

        # Add note about cart method
        if any(item.get("methodology") == "cart" for item in cost_data):
            click.echo(
                "\n💡 Note: Cart method succeeded for some items (highest accuracy)"
            )
        else:
            click.echo(
                "\n💡 Note: Cart method was not available - using search and keywords (still accurate)"
            )
            click.echo(
                "   This is normal and expected. The system automatically falls back to other methods."
            )

    except Exception as e:
        logger.error(f"Failed to estimate list costs: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to estimate list costs: {e}")


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

        from rich.console import Console
        from rich.table import Table

        logger.debug("Using rich for favorites table")
        console = Console()
        table = Table(
            title=f"Favorites ({len(favorites)} items)",
            show_header=True,
            header_style="bold cyan",
        )

        for header in headers:
            table.add_column(header, style="cyan", no_wrap=True)

        for row in table_data:
            table.add_row(*[str(cell) for cell in row])

        console.print(table)

    except Exception as e:
        logger.error(f"Failed to show favorites: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to show favorites: {e}")


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
def list_export(filename: str):
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

        # Auto-detect format from filename
        file_extension = file_path.suffix.lower()
        if file_extension in [".xlsx", ".xls"]:
            format = "excel"
        elif file_extension == ".csv":
            format = "csv"
        elif file_extension == ".json":
            format = "json"
        else:
            format = "text"
        click.echo(f"🔍 Auto-detected format: {format}")

        if format == "text":
            export_to_text(items, file_path)
        elif format == "csv":
            export_to_csv(items, file_path)
        elif format == "json":
            export_to_json(items, file_path)
        elif format == "excel":
            export_to_excel(items, file_path)

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

        # Display coupons using Rich table
        from rich.console import Console
        from rich.table import Table

        logger.debug("Using rich for coupons table")
        console = Console()
        table = Table(
            title=f"{title} ({len(coupons)} items)",
            show_header=True,
            header_style="bold cyan",
        )

        table.add_column("#", style="cyan", no_wrap=True)
        table.add_column("Status", style="cyan", no_wrap=True)
        table.add_column("Title", style="cyan", no_wrap=True)
        table.add_column("Description", style="cyan", no_wrap=True)
        table.add_column("Expires", style="cyan", no_wrap=True)

        for i, coupon in enumerate(coupons, 1):
            status = (
                "✅ Clipped" if getattr(coupon, "clipped", False) else "⭕ Available"
            )
            description = getattr(coupon, "description", "") or ""
            expires = getattr(coupon, "redemption_end_date", "") or ""

            table.add_row(str(i), status, coupon.title, description, expires)

        console.print(table)

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

        from rich.console import Console
        from rich.table import Table

        logger.debug("Using rich for cart table")
        console = Console()
        table = Table(
            title=f"Shopping Cart ({len(cart_items)} items)",
            show_header=True,
            header_style="bold cyan",
        )

        table.add_column("#", style="cyan", no_wrap=True)
        table.add_column("Item", style="cyan", no_wrap=True)
        table.add_column("Qty", style="cyan", no_wrap=True)
        table.add_column("Price", style="cyan", no_wrap=True)

        for i, item in enumerate(cart_items, 1):
            price = f"${item.price}" if hasattr(item, "price") and item.price else "N/A"
            table.add_row(str(i), item.name, str(item.quantity), price)

        console.print(table)

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
        # First check if existing tokens exist and test refresh
        from ..auth import TokenStorage

        token_storage = TokenStorage()

        if token_storage.has_tokens():
            click.echo("🔍 Found existing tokens, testing refresh...")

            try:
                # Try to refresh tokens first
                tokens = token_storage.get_valid_tokens()
                if tokens:
                    click.echo(
                        "✅ Token refresh successful! No need to extract from logs."
                    )
                    click.echo(f"🔑 Access token: {tokens.access_token[:50]}...")
                    return
                else:
                    click.echo(
                        "❌ Token refresh failed - falling back to log extraction method"
                    )
                    # Show Unicode red X for failed refresh
                    click.echo(
                        "❌ Token refresh failed - falling back to log extraction method"
                    )
            except Exception as e:
                logger.error(f"Exception during token refresh: {e}")
                click.echo(
                    "❌ Token refresh failed - falling back to log extraction method"
                )
        else:
            click.echo("ℹ️ No existing tokens found, proceeding with log extraction...")

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

        # Save to cross-platform config directory
        from ..auth import get_meijer_config_path
        config_path = Path(get_meijer_config_path("auth.txt"))
        
        logger.debug(f"Saving tokens to: {config_path}")

        config = {
            **tokens,
            "updated_at": datetime.now().isoformat(),
            "source": f"Extracted from {log_file}",
            "extracted_at": datetime.now().isoformat(),
        }

        with open(config_path, "w") as f:
            json.dump(config, f, indent=2)

        # Also save to TokenStorage pickle file for refresh functionality
        try:
            from ..models import AuthTokens
            auth_tokens = AuthTokens(
                access_token=tokens["access_token"],
                refresh_token=tokens.get("refresh_token", ""),
                expires_in=tokens["expires_in"],
                token_type=tokens["token_type"],
            )
            if token_storage.save_tokens(auth_tokens):
                logger.debug("✅ Tokens also saved to TokenStorage for refresh functionality")
            else:
                logger.warning("⚠️ Failed to save tokens to TokenStorage")
        except Exception as e:
            logger.warning(f"⚠️ Could not save tokens to TokenStorage: {e}")

        logger.debug("Tokens saved successfully")
        click.echo(f"💾 Tokens saved to {config_path}")
        click.echo("✅ Authentication file updated successfully!")
        click.echo(f"🔑 Access token: {tokens['access_token'][:50]}...")
        click.echo(f"⏰ Expires in: {tokens['expires_in']} seconds")

        # Test the extracted tokens by making a simple API call
        click.echo("\n🧪 Testing extracted tokens with a simple API call...")
        try:
            # Create a temporary client to test the tokens
            from ..client import Meijer
            test_client = Meijer()
            
            # Try to get the shopping list to prove authentication works
            click.echo("📝 Attempting to fetch shopping list...")
            shopping_list = test_client.list.get()
            
            if shopping_list:
                click.echo(f"✅ Authentication successful! Retrieved {len(shopping_list)} shopping list items")
                click.echo("🎉 Your tokens are working correctly!")
            else:
                click.echo("⚠️ Authentication successful but no shopping list items found")
                
        except Exception as e:
            click.echo(f"❌ Token test failed: {e}")
            click.echo("⚠️ Tokens were extracted but may not be valid for API calls")
            logger.warning(f"Token test failed: {e}")

        # Clean up temporary files
        for temp_file in ["bearer_auth.json", "bearer_token_analysis.json"]:
            if os.path.exists(temp_file):
                os.remove(temp_file)
                logger.debug(f"Cleaned up temporary file: {temp_file}")
                click.echo(f"🧹 Cleaned up {temp_file}")

    except Exception as e:
        logger.error(f"Failed to extract authentication: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to extract authentication: {e}")
