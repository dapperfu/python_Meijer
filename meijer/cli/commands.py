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


# Email 2FA Commands
@click.group()
def email_2fa_group():
    """Manage email 2FA configuration and testing."""
    pass


@email_2fa_group.command("setup")
@click.option("--force", "-f", is_flag=True, help="Overwrite existing configuration")
def email_2fa_setup(force: bool):
    """Create email configuration template for 2FA."""
    try:
        from meijer.email_2fa import create_email_config_template

        if force:
            click.echo(
                "🔄 Creating email configuration template (overwriting existing)..."
            )
        else:
            click.echo("📧 Creating email configuration template...")

        create_email_config_template()
        click.echo("\n📝 Next steps:")
        click.echo("1. Edit the created email.txt file with your server details")
        click.echo(
            "2. For Gmail, generate an 'App Password' in your Google Account settings"
        )
        click.echo("3. Test the connection with: meijer email-2fa test")

    except Exception as e:
        raise click.ClickException(f"❌ Failed to create email configuration: {e}")


@email_2fa_group.command("test")
def email_2fa_test():
    """Test email 2FA connection and authentication."""
    try:
        from meijer.email_2fa import Email2FAHandler

        click.echo("🧪 Testing email 2FA connection...")

        email_handler = Email2FAHandler()

        if email_handler.test_connection():
            click.echo("✅ Email connection test successful!")

            # Test getting latest verification code
            click.echo("🔍 Checking for existing verification codes...")
            code = email_handler.get_latest_verification_code()

            if code:
                click.echo(f"📧 Found verification code: {code}")
            else:
                click.echo("📧 No recent verification codes found")

        else:
            click.echo("❌ Email connection test failed!")
            click.echo("💡 Check your email configuration and try again")

    except FileNotFoundError:
        click.echo("❌ Email configuration file not found!")
        click.echo("💡 Run 'meijer email-2fa setup' to create the configuration")
    except Exception as e:
        raise click.ClickException(f"❌ Email 2FA test failed: {e}")


@email_2fa_group.command("wait")
@click.option("--timeout", "-t", default=300, help="Timeout in seconds (default: 300)")
def email_2fa_wait(timeout: int):
    """Wait for a verification code to arrive via email."""
    try:
        from meijer.email_2fa import Email2FAHandler

        click.echo(f"⏳ Waiting for verification code (timeout: {timeout}s)...")

        email_handler = Email2FAHandler()

        code = email_handler.wait_for_verification_code(timeout)

        if code:
            click.echo(f"✅ Verification code received: {code}")
        else:
            click.echo("❌ No verification code received within timeout")

    except FileNotFoundError:
        click.echo("❌ Email configuration file not found!")
        click.echo("💡 Run 'meijer email-2fa setup' to create the configuration")
    except Exception as e:
        raise click.ClickException(f"❌ Failed to wait for verification code: {e}")


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


# Stores Commands
@click.group()
def stores_group():
    """Manage store information and search."""
    pass


@stores_group.command("search")
@click.option("--city", "-c", help="Search for stores in a specific city")
@click.option("--zip", "-z", help="Search for stores near a ZIP code")
@click.option("--near", "-n", help="Search for stores near coordinates (lat,lng)")
@click.option("--radius", "-r", default=50, help="Search radius in miles (default: 50)")
@click.option(
    "--services",
    "-s",
    multiple=True,
    help="Filter by services (curbside, delivery, pharmacy, gas)",
)
@click.option(
    "--limit", "-l", default=20, help="Maximum number of stores to return (default: 20)"
)
@click.option(
    "--format",
    "-f",
    type=click.Choice(["table", "json", "csv"]),
    default="table",
    help="Output format",
)
def stores_search(
    city: str,
    zip: str,
    near: str,
    radius: int,
    services: tuple,
    limit: int,
    format: str,
):
    """Search for Meijer stores with various filters."""
    logger = logging.getLogger(__name__)
    logger.debug(
        f"Stores search called: city={city}, zip={zip}, near={near}, radius={radius}, services={services}, limit={limit}"
    )

    try:
        client = get_meijer_client()
        stores = []

        # Determine search method
        if near:
            try:
                lat_str, lng_str = near.split(",")
                latitude = float(lat_str.strip())
                longitude = float(lng_str.strip())
                logger.debug(f"Searching near coordinates: {latitude}, {longitude}")
                stores = client.find_stores_nearby(latitude, longitude, radius, limit)
            except ValueError:
                raise click.ClickException(
                    "❌ Invalid coordinates format. Use 'lat,lng' (e.g., '42.2808,-83.7430')"
                )
        elif city:
            logger.debug(f"Searching for stores in city: {city}")
            stores = client.get_stores(city=city)
        elif zip:
            logger.debug(f"Searching for stores near ZIP: {zip}")
            stores = client.get_stores(zip_code=zip)
        else:
            logger.debug("Searching for all stores")
            stores = client.get_stores()

        if not stores:
            click.echo("🏪 No stores found matching your criteria!")
            return

        # Apply service filters
        if services:
            logger.debug(f"Filtering by services: {services}")
            filtered_stores = []
            for store in stores:
                store_services = []
                if store.has_curbside_pickup:
                    store_services.append("curbside")
                if store.has_delivery:
                    store_services.append("delivery")
                if store.has_pharmacy:
                    store_services.append("pharmacy")
                if store.gas_station and store.gas_station.fuel_prices:
                    store_services.append("gas")

                # Check if store has any of the requested services
                if any(
                    service.lower() in [s.lower() for s in store_services]
                    for service in services
                ):
                    filtered_stores.append(store)
            stores = filtered_stores

        # Limit results
        stores = stores[:limit]

        if not stores:
            click.echo("🏪 No stores found matching your service criteria!")
            return

        # Display results
        if format == "json":
            import json

            stores_data = []
            for store in stores:
                store_dict = {
                    "unit_id": store.unit_id,
                    "name": store.name,
                    "address": store.address,
                    "city": store.city,
                    "state": store.state,
                    "zip_code": store.zip_code,
                    "phone": store.phone_number,
                    "latitude": store.latitude,
                    "longitude": store.longitude,
                    "services": {
                        "curbside_pickup": store.has_curbside_pickup,
                        "delivery": store.has_delivery,
                        "pharmacy": store.has_pharmacy,
                        "gas_station": store.gas_station is not None,
                    },
                    "hours": str(store.hours) if store.hours else None,
                }
                stores_data.append(store_dict)
            click.echo(json.dumps(stores_data, indent=2))
        elif format == "csv":
            import csv
            import io

            output = io.StringIO()
            writer = csv.writer(output)
            writer.writerow(
                [
                    "Unit ID",
                    "Name",
                    "Address",
                    "City",
                    "State",
                    "ZIP",
                    "Phone",
                    "Curbside",
                    "Delivery",
                    "Pharmacy",
                    "Gas",
                ]
            )
            for store in stores:
                writer.writerow(
                    [
                        store.unit_id,
                        store.name,
                        store.address,
                        store.city,
                        store.state,
                        store.zip_code,
                        store.phone_number,
                        "Yes" if store.has_curbside_pickup else "No",
                        "Yes" if store.has_delivery else "No",
                        "Yes" if store.has_pharmacy else "No",
                        "Yes" if store.gas_station else "No",
                    ]
                )
            click.echo(output.getvalue())
        else:
            # Default table format
            from rich.console import Console
            from rich.table import Table

            console = Console()
            table = Table(
                title=f"Meijer Stores ({len(stores)} found)",
                show_header=True,
                header_style="bold cyan",
            )

            table.add_column("#", style="cyan", no_wrap=True)
            table.add_column("Name", style="cyan", no_wrap=True)
            table.add_column("Location", style="cyan", no_wrap=True)
            table.add_column("Phone", style="cyan", no_wrap=True)
            table.add_column("Services", style="cyan", no_wrap=True)

            for i, store in enumerate(stores, 1):
                location = f"{store.city}, {store.state} {store.zip_code}"
                services = []
                if store.has_curbside_pickup:
                    services.append("🚗")
                if store.has_delivery:
                    services.append("📦")
                if store.has_pharmacy:
                    services.append("💊")
                if store.gas_station:
                    services.append("⛽")

                services_str = " ".join(services) if services else "None"

                table.add_row(
                    str(i),
                    store.name,
                    location,
                    store.phone_number or "N/A",
                    services_str,
                )

            console.print(table)

        logger.debug(f"Displayed {len(stores)} stores")

    except Exception as e:
        logger.error(f"Failed to search stores: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to search stores: {e}")


@stores_group.command("show")
@click.argument("store_id")
def stores_show(store_id: str):
    """Show detailed information for a specific store."""
    logger = logging.getLogger(__name__)
    logger.debug(f"Stores show called for store ID: {store_id}")

    try:
        client = get_meijer_client()
        store = client.get_store_by_id(store_id)

        if not store:
            raise click.ClickException(f"❌ Store with ID {store_id} not found")

        # Display store details
        from rich.console import Console
        from rich.panel import Panel
        from rich.table import Table

        console = Console()

        # Store header
        header = f"🏪 {store.name}"
        console.print(Panel(header, style="bold cyan"))

        # Basic info
        basic_info = Table(show_header=False, box=None)
        basic_info.add_column("Field", style="bold")
        basic_info.add_column("Value")

        basic_info.add_row("Unit ID", store.unit_id)
        basic_info.add_row("Address", store.address)
        basic_info.add_row("City", f"{store.city}, {store.state} {store.zip_code}")
        basic_info.add_row("Phone", store.phone_number or "N/A")
        if store.latitude and store.longitude:
            basic_info.add_row(
                "Coordinates", f"{store.latitude:.6f}, {store.longitude:.6f}"
            )

        console.print(basic_info)
        console.print()

        # Services
        services = Table(title="Available Services", show_header=False, box=None)
        services.add_column("Service", style="bold")
        services.add_column("Status", style="bold")

        services.add_row(
            "Curbside Pickup", "✅ Yes" if store.has_curbside_pickup else "❌ No"
        )
        services.add_row("Delivery", "✅ Yes" if store.has_delivery else "❌ No")
        services.add_row("Pharmacy", "✅ Yes" if store.has_pharmacy else "❌ No")
        services.add_row("Gas Station", "✅ Yes" if store.gas_station else "❌ No")

        console.print(services)
        console.print()

        # Store hours
        if store.hours:
            hours_table = Table(title="Store Hours", show_header=False, box=None)
            hours_table.add_column("Day", style="bold")
            hours_table.add_column("Hours")

            if store.hours.is_24_hours:
                hours_table.add_row("All Days", "24 Hours")
            else:
                hours_table.add_row(
                    "Weekdays",
                    f"{store.hours.open_time.strftime('%I:%M %p')} - {store.hours.close_time.strftime('%I:%M %p')}",
                )
                hours_table.add_row(
                    "Weekends",
                    f"{store.hours.open_time.strftime('%I:%M %p')} - {store.hours.close_time.strftime('%I:%M %p')}",
                )

            console.print(hours_table)
            console.print()

        # Gas station info
        if store.gas_station and store.gas_station.fuel_prices:
            gas_table = Table(
                title="Gas Station", show_header=True, header_style="bold cyan"
            )
            gas_table.add_column("Fuel Type", style="cyan")
            gas_table.add_column("Price", style="cyan")
            gas_table.add_column("Updated", style="cyan")

            for fuel in store.gas_station.fuel_prices:
                gas_table.add_row(
                    fuel.fuel_type,
                    f"${fuel.price:.3f}",
                    fuel.price_effective_date.strftime("%m/%d/%Y %I:%M %p")
                    if fuel.price_effective_date
                    else "N/A",
                )

            console.print(gas_table)

        logger.debug(f"Displayed details for store {store_id}")

    except Exception as e:
        logger.error(f"Failed to show store details: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to show store details: {e}")


@stores_group.command("nearby")
@click.option(
    "--latitude", "-lat", type=float, required=True, help="Latitude coordinate"
)
@click.option(
    "--longitude", "-lng", type=float, required=True, help="Longitude coordinate"
)
@click.option("--radius", "-r", default=25, help="Search radius in miles (default: 25)")
@click.option(
    "--limit", "-l", default=10, help="Maximum number of stores to return (default: 10)"
)
@click.option(
    "--sort",
    "-s",
    type=click.Choice(["distance", "name"]),
    default="distance",
    help="Sort order",
)
def stores_nearby(
    latitude: float, longitude: float, radius: int, limit: int, sort: str
):
    """Find stores near specific coordinates."""
    logger = logging.getLogger(__name__)
    logger.debug(
        f"Stores nearby called: lat={latitude}, lng={longitude}, radius={radius}, limit={limit}, sort={sort}"
    )

    try:
        client = get_meijer_client()
        stores = client.find_stores_nearby(latitude, longitude, radius, limit)

        if not stores:
            click.echo("🏪 No stores found within the specified radius!")
            return

        # Sort stores
        if sort == "distance":
            # Note: API already returns stores sorted by distance
            pass
        elif sort == "name":
            stores = sorted(stores, key=lambda s: s.name)

        # Display results
        from rich.console import Console
        from rich.table import Table

        console = Console()
        table = Table(
            title=f"Stores within {radius} miles of ({latitude:.6f}, {longitude:.6f})",
            show_header=True,
            header_style="bold cyan",
        )

        table.add_column("#", style="cyan", no_wrap=True)
        table.add_column("Name", style="cyan", no_wrap=True)
        table.add_column("Distance", style="cyan", no_wrap=True)
        table.add_column("Location", style="cyan", no_wrap=True)
        table.add_column("Services", style="cyan", no_wrap=True)

        for i, store in enumerate(stores, 1):
            location = f"{store.city}, {store.state}"
            services = []
            if store.has_curbside_pickup:
                services.append("🚗")
            if store.has_delivery:
                services.append("📦")
            if store.has_pharmacy:
                services.append("💊")
            if store.gas_station:
                services.append("⛽")

            services_str = " ".join(services) if services else "None"

            table.add_row(
                str(i),
                store.name,
                f"{getattr(store, 'distance', 'N/A')} mi"
                if hasattr(store, "distance")
                else "N/A",
                location,
                services_str,
            )

        console.print(table)

        logger.debug(f"Displayed {len(stores)} nearby stores")

    except Exception as e:
        logger.error(f"Failed to find nearby stores: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to find nearby stores: {e}")


@stores_group.command("gas")
@click.option("--city", "-c", help="Show gas prices for stores in a specific city")
@click.option("--zip", "-z", help="Show gas prices for stores near a ZIP code")
@click.option("--radius", "-r", default=25, help="Search radius in miles (default: 25)")
def stores_gas(city: str, zip: str, radius: int):
    """Show gas station information and prices."""
    logger = logging.getLogger(__name__)
    logger.debug(f"Stores gas called: city={city}, zip={zip}, radius={radius}")

    try:
        client = get_meijer_client()
        stores = []

        if city:
            stores = client.get_stores(city=city)
        elif zip:
            stores = client.get_stores(zip_code=zip)
        else:
            # Get stores near default location (Ann Arbor)
            stores = client.find_stores_nearby(42.2808, -83.7430, radius)

        # Filter stores with gas stations
        gas_stores = [
            store
            for store in stores
            if store.gas_station and store.gas_station.fuel_prices
        ]

        if not gas_stores:
            click.echo("⛽ No gas stations found in the specified area!")
            return

        # Display gas prices
        from rich.console import Console
        from rich.table import Table

        console = Console()
        table = Table(
            title=f"Gas Prices ({len(gas_stores)} stations)",
            show_header=True,
            header_style="bold cyan",
        )

        table.add_column("Store", style="cyan", no_wrap=True)
        table.add_column("Location", style="cyan", no_wrap=True)
        table.add_column("Regular", style="cyan", no_wrap=True)
        table.add_column("Mid", style="cyan", no_wrap=True)
        table.add_column("Premium", style="cyan", no_wrap=True)
        table.add_column("Diesel", style="cyan", no_wrap=True)
        table.add_column("Updated", style="cyan", no_wrap=True)

        for store in gas_stores:
            gas = store.gas_station
            prices = {}

            # Extract prices by fuel type
            for fuel in gas.fuel_prices:
                if (
                    "regular" in fuel.fuel_type.lower()
                    or "unl" in fuel.fuel_type.lower()
                ):
                    prices["regular"] = fuel.price
                elif "mid" in fuel.fuel_type.lower():
                    prices["mid"] = fuel.price
                elif (
                    "premium" in fuel.fuel_type.lower()
                    or "prem" in fuel.fuel_type.lower()
                ):
                    prices["premium"] = fuel.price
                elif (
                    "diesel" in fuel.fuel_type.lower()
                    or "dsl" in fuel.fuel_type.lower()
                ):
                    prices["diesel"] = fuel.price

            location = f"{store.city}, {store.state}"
            updated = (
                gas.fuel_prices[0].price_effective_date.strftime("%m/%d %I:%M %p")
                if gas.fuel_prices
                else "N/A"
            )

            table.add_row(
                store.name,
                location,
                f"${prices.get('regular', 'N/A'):.3f}"
                if prices.get("regular")
                else "N/A",
                f"${prices.get('mid', 'N/A'):.3f}" if prices.get("mid") else "N/A",
                f"${prices.get('premium', 'N/A'):.3f}"
                if prices.get("premium")
                else "N/A",
                f"${prices.get('diesel', 'N/A'):.3f}"
                if prices.get("diesel")
                else "N/A",
                updated,
            )

        console.print(table)

        logger.debug(f"Displayed gas prices for {len(gas_stores)} stations")

    except Exception as e:
        logger.error(f"Failed to show gas prices: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to show gas prices: {e}")


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
def auth_command():
    """Authenticate with Meijer API by extracting tokens from mitmproxy logs."""
    click.echo("🔐 Meijer Authentication")
    click.echo("=" * 50)

    # First check if we have existing tokens and try to refresh them
    from ..auth import TokenStorage

    token_storage = TokenStorage()
    if token_storage.has_tokens():
        click.echo("🔍 Found existing tokens, testing refresh...")
        try:
            tokens = token_storage.get_valid_tokens()
            if tokens and tokens.refresh_token and tokens.refresh_token.strip():
                if token_storage.refresh_tokens(tokens.refresh_token):
                    click.echo(
                        "✅ Token refresh successful! No need to extract from logs."
                    )
                    click.echo(f"🔑 Access token: {tokens.access_token[:30]}...")
                    click.echo(f"🔄 Refresh token: {tokens.refresh_token[:30]}...")
                    click.echo(f"⏰ Expires in: {tokens.expires_in} seconds")
                    click.echo("\n🎉 Your tokens are fresh and ready to use!")
                    return
                else:
                    click.echo("❌ Token refresh failed")
            else:
                click.echo(
                    "⚠️ No refresh token available - tokens cannot be refreshed automatically"
                )
        except Exception as e:
            click.echo(f"❌ Error during token refresh: {e}")

    click.echo("📋 Extracting tokens from mitmproxy logs...")

    # Find the most recent log file
    import glob

    log_files = glob.glob("meijer_mitm_*.log")
    if not log_files:
        click.echo("❌ No meijer mitmproxy log files found!")
        click.echo(
            "💡 Make sure you have captured authentication traffic with mitmproxy"
        )
        return

    # Sort by modification time, newest first
    log_files.sort(key=lambda x: os.path.getmtime(x), reverse=True)
    latest_log = log_files[0]
    click.echo(f"📁 Using log file: {latest_log}")

    # Run the enhanced token extraction
    import subprocess
    import sys

    try:
        # Run the enhanced extraction tool
        result = subprocess.run(
            [sys.executable, "tools/extract_bearer_token.py", latest_log],
            capture_output=True,
            text=True,
            cwd=os.getcwd(),
        )

        if result.returncode == 0:
            click.echo("\n" + result.stdout)

            # Check if we got OAuth2 tokens with refresh capability
            if "✅ Tokens can be refreshed automatically!" in result.stdout:
                click.echo("\n🎉 Success! You now have tokens with refresh capability.")
                click.echo(
                    "   These tokens can be refreshed automatically when they expire."
                )
            elif (
                "⚠️ No refresh token - tokens cannot be refreshed automatically"
                in result.stdout
            ):
                click.echo("\n⚠️ Note: These tokens cannot be refreshed automatically.")
                click.echo(
                    "   To get refreshable tokens, you need to capture an OAuth2 token exchange."
                )
                click.echo(
                    "   Try logging in to the Meijer app again and capture the authentication flow."
                )

            # Now test the extracted tokens with an API call
            click.echo("\n🧪 Testing extracted tokens with API call...")
            try:
                # Create a temporary client to test the tokens
                from ..client import Meijer

                test_client = Meijer()

                # Try to get the shopping list to verify tokens work
                items = test_client.list.get()
                click.echo("✅ API call successful! Extracted tokens are working.")
                click.echo(f"📋 Found {len(items)} items in shopping list")

            except Exception as e:
                click.echo(f"❌ API call failed: {e}")
                click.echo("💡 The extracted tokens may be expired or invalid")

        else:
            click.echo(f"❌ Token extraction failed: {result.stderr}")

    except Exception as e:
        click.echo(f"❌ Error running token extraction: {e}")
        click.echo(
            "💡 Make sure the extraction tool is available at tools/extract_bearer_token.py"
        )

    click.echo("\n💡 To get refreshable tokens:")
    click.echo("   1. Clear your current tokens: rm ~/.config/meijer/meijer_tokens.pkl")
    click.echo("   2. Log out of the Meijer app")
    click.echo("   3. Start mitmproxy capture")
    click.echo("   4. Log back into the Meijer app")
    click.echo("   5. Run 'meijer auth' again")


@click.command()
@click.option("--user", "-u", help="Username/email for authentication")
@click.option("--password", "-p", help="Password for authentication")
@click.option(
    "--save-credentials",
    is_flag=True,
    help="Save credentials to login.txt for fallback use",
)
@click.option(
    "--clear-credentials", is_flag=True, help="Clear saved credentials from login.txt"
)
def login_command(
    user: Optional[str],
    password: Optional[str],
    save_credentials: bool,
    clear_credentials: bool,
):
    """Authenticate with Meijer using username/password or fallback credentials."""
    logger = logging.getLogger(__name__)
    logger.debug(
        f"Login command called with user={user}, save_credentials={save_credentials}, clear_credentials={clear_credentials}"
    )

    try:
        from meijer.enhanced_auth import EnhancedMeijerAuth

        # Handle credential clearing
        if clear_credentials:
            auth = EnhancedMeijerAuth()
            if auth.clear_credentials():
                click.echo("✅ Credentials cleared successfully")
            else:
                click.echo("❌ Failed to clear credentials")
            return

        # Smart fallback logic: check login.txt before prompting
        fallback_username = None
        fallback_password = None

        if not user or not password:
            import os

            from meijer.auth import get_meijer_config_path

            login_file = os.path.join(get_meijer_config_path(""), "login.txt")
            if os.path.exists(login_file):
                try:
                    with open(login_file, "r") as f:
                        lines = [line.strip() for line in f.readlines()]

                    if len(lines) >= 1 and lines[0]:  # First line has username
                        fallback_username = lines[0]
                        click.echo(
                            f"👤 Found username in login.txt: {fallback_username}"
                        )

                    if len(lines) >= 2 and lines[1]:  # Second line has password
                        fallback_password = lines[1]
                        click.echo("🔑 Found password in login.txt")

                except Exception as e:
                    logger.warning(f"Failed to read login.txt: {e}")
                    click.echo("⚠️ Error reading login.txt, will prompt for credentials")

        # Use fallback credentials where available, prompt for missing ones
        if not user and fallback_username:
            user = fallback_username
            click.echo(f"✅ Using username from login.txt: {user}")

        if not password and fallback_password:
            password = fallback_password
            click.echo("✅ Using password from login.txt")

        # Prompt for any missing credentials
        if not user:
            user = click.prompt("👤 Username/Email", type=str)
        if not password:
            password = click.prompt("🔑 Password", type=str, hide_input=True)

        # Create enhanced authentication instance
        auth = EnhancedMeijerAuth(user, password)

        # Save credentials if requested
        if save_credentials:
            if auth.token_storage.save_credentials_to_file(user, password):
                click.echo("💾 Credentials saved to login.txt for fallback use")
            else:
                click.echo("⚠️ Failed to save credentials to login.txt")

        # Attempt authentication (force fresh login)
        click.echo("🔐 Attempting fresh authentication...")
        tokens = auth.authenticate(force_login=True)

        if tokens:
            click.echo("🎉 Authentication successful!")
            click.echo(f"🔑 Access token: {tokens.access_token[:30]}...")
            click.echo(f"⏰ Expires in: {tokens.expires_in} seconds")

            # Test API call capability
            auth_header = auth.get_auth_header()
            if auth_header:
                click.echo(f"🔒 Auth header ready: {auth_header[:50]}...")
                click.echo("🎉 Ready for API calls!")
            else:
                click.echo("❌ No auth header available")
        else:
            click.echo("❌ Authentication failed")
            click.echo("\n💡 Try these alternatives:")
            click.echo("   1. Run 'meijer auth' to capture tokens from browser login")
            click.echo("   2. Check your username and password")
            click.echo("   3. Ensure network connectivity")
            click.echo("   4. Try again later if there are temporary issues")

    except Exception as e:
        logger.error(f"Failed to authenticate: {e}", exc_info=True)
        raise click.ClickException(f"❌ Authentication failed: {e}")
