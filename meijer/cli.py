#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create comprehensive CLI tool with Click for Meijer shopping list management
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: click, meijer package, tabulate, sys, os
 */

Meijer CLI Tool
===============

A comprehensive command-line interface for managing Meijer shopping lists.
"""

import sys
import os
import json
import re
import time
from typing import List, Optional, TextIO
from pathlib import Path
from datetime import datetime

import click

try:
    from tabulate import tabulate

    TABULATE_AVAILABLE = True
except ImportError:
    TABULATE_AVAILABLE = False

try:
    from .client import Meijer

    MEIJER_AVAILABLE = True
except ImportError:
    MEIJER_AVAILABLE = False
    click.echo(
        "❌ Meijer package not available. Install with: pip install -e .", err=True
    )
    sys.exit(1)


def get_meijer_client() -> Meijer:
    """
    Get an authenticated Meijer client instance.

    Returns:
        Meijer: Authenticated client instance

    Raises:
        click.ClickException: If authentication fails
    """
    try:
        # First try to load from local auth.txt file
        local_auth_path = "auth.txt"
        if os.path.exists(local_auth_path):
            client = Meijer(auth=local_auth_path)
        else:
            # Fall back to default behavior
            client = Meijer()

        if client.auth_status.name != "AUTHENTICATED":
            raise click.ClickException(
                "❌ Authentication failed! Please check your credentials.\n"
                "   Ensure you have auth.txt or ~/.config/meijer.txt configured"
            )

        return client
    except Exception as e:
        raise click.ClickException(f"❌ Failed to initialize Meijer client: {e}")


def display_items_table(items: List, title: str = "Shopping List Items") -> None:
    """
    Display items in a formatted table.

    Args:
        items: List of shopping list items
        title: Title for the table display
    """
    if not items:
        click.echo(f"📝 {title}: No items found")
        return

    # Prepare table data
    table_data = []
    for i, item in enumerate(items, 1):
        table_data.append(
            [
                i,
                item.name[:40] + "..." if len(item.name) > 40 else item.name,
                item.quantity,
                "✅ Done" if item.checked else "⏳ Pending",
                item.notes[:30] + "..."
                if item.notes and len(item.notes) > 30
                else item.notes or "None",
            ]
        )

    headers = ["#", "Item", "Qty", "Status", "Notes"]

    if TABULATE_AVAILABLE:
        click.echo(f"\n📊 {title}:")
        click.echo(tabulate(table_data, headers=headers, tablefmt="grid"))
    else:
        click.echo(f"\n📊 {title}:")
        click.echo("=" * 80)
        click.echo(f"{'#':<3} {'Item':<40} {'Qty':<4} {'Status':<10} {'Notes':<30}")
        click.echo("-" * 80)
        for row in table_data:
            click.echo(
                f"{row[0]:<3} {row[1]:<40} {row[2]:<4} {row[3]:<10} {row[4]:<30}"
            )


def add_items_from_file(client: Meijer, file_input: TextIO) -> int:
    """
    Add items from a file input (stdin or file).

    Args:
        client: Meijer client instance
        file_input: File-like object to read from

    Returns:
        int: Number of items successfully added
    """
    added_count = 0
    failed_count = 0

    click.echo("📝 Reading items from input...")

    for line_num, line in enumerate(file_input, 1):
        line = line.strip()
        if not line or line.startswith("#"):  # Skip empty lines and comments
            continue

        try:
            # Try to add the item
            success = client.list.add_item_with_details(
                upc=f"ITEM_{line_num}",  # Generate a unique identifier
                description=line,
                quantity=1,
            )

            if success:
                added_count += 1
                click.echo(f"  ✅ Added: {line}")
            else:
                failed_count += 1
                click.echo(f"  ❌ Failed: {line}")

        except Exception as e:
            failed_count += 1
            click.echo(f"  ❌ Error adding '{line}': {e}")

    click.echo(f"\n📊 Summary: {added_count} added, {failed_count} failed")
    return added_count


def export_to_text(items: List, file_path: Path) -> None:
    """
    Export shopping list items to a plain text file.
    
    Format: Item Name | Quantity | Notes | Status
    
    Args:
        items: List of shopping list items
        file_path: Path to save the export file
    """
    with open(file_path, "w", encoding="utf-8") as f:
        f.write("# Meijer Shopping List Export\n")
        f.write(f"# Exported on: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}\n")
        f.write(f"# Total items: {len(items)}\n")
        f.write("# Format: Item Name | Quantity | Notes | Status\n")
        f.write("# Status: PENDING or COMPLETED\n")
        f.write("#\n")
        
        for item in items:
            # Escape any pipe characters in the item name or notes
            item_name = item.name.replace("|", "\\|")
            notes = (item.notes or "").replace("|", "\\|")
            status = "COMPLETED" if item.checked else "PENDING"
            
            f.write(f"{item_name} | {item.quantity} | {notes} | {status}\n")


def export_to_csv(items: List, file_path: Path) -> None:
    """
    Export shopping list items to a CSV file.
    
    Args:
        items: List of shopping list items
        file_path: Path to save the export file
    """
    import csv
    
    with open(file_path, "w", newline="", encoding="utf-8") as f:
        writer = csv.writer(f)
        writer.writerow(["Item Name", "Quantity", "Notes", "Status"])
        
        for item in items:
            status = "COMPLETED" if item.checked else "PENDING"
            writer.writerow([item.name, item.quantity, item.notes or "", status])


def export_to_json(items: List, file_path: Path) -> None:
    """
    Export shopping list items to a JSON file.
    
    Args:
        items: List of shopping list items
        file_path: Path to save the export file
    """
    import json
    
    export_data = {
        "export_info": {
            "exported_at": datetime.now().isoformat(),
            "total_items": len(items),
            "format_version": "1.0"
        },
        "items": []
    }
    
    for item in items:
        item_data = {
            "name": item.name,
            "quantity": item.quantity,
            "notes": item.notes,
            "status": "COMPLETED" if item.checked else "PENDING",
            "item_id": item.item_id,
            "list_item_id": item.list_item_id,
            "item_type": "PRODUCT" if item.is_product else "MANUAL"
        }
        export_data["items"].append(item_data)
    
    with open(file_path, "w", encoding="utf-8") as f:
        json.dump(export_data, f, indent=2, ensure_ascii=False)


def import_from_text(client: Meijer, file_path: Path) -> int:
    """
    Import shopping list items from a plain text file.
    
    Expected format: Item Name | Quantity | Notes | Status
    
    Args:
        client: Meijer client instance
        file_path: Path to the import file
        
    Returns:
        int: Number of items successfully imported
    """
    imported_count = 0
    failed_count = 0
    
    with open(file_path, "r", encoding="utf-8") as f:
        for line_num, line in enumerate(f, 1):
            line = line.strip()
            
            # Skip empty lines, comments, and header lines
            if not line or line.startswith("#"):
                continue
                
            try:
                # Parse the line: Item Name | Quantity | Notes | Status
                parts = line.split(" | ")
                if len(parts) < 2:
                    click.echo(f"  ⚠️  Line {line_num}: Invalid format, skipping")
                    continue
                
                item_name = parts[0].strip()
                quantity = int(parts[1].strip()) if len(parts) > 1 else 1
                notes = parts[2].strip() if len(parts) > 2 else None
                status = parts[3].strip() if len(parts) > 3 else "PENDING"
                
                # Unescape pipe characters
                if item_name:
                    item_name = item_name.replace("\\|", "|")
                if notes:
                    notes = notes.replace("\\|", "|")
                
                # Add the item
                success = client.list.add_item_with_details(
                    upc=f"ITEM_{line_num}_{hash(item_name) % 10000}",
                    description=item_name,
                    quantity=quantity,
                    notes=notes
                )
                
                if success:
                    imported_count += 1
                    click.echo(f"  ✅ Imported: {item_name} (qty: {quantity})")
                    
                    # Mark as completed if status indicates it
                    if status.upper() == "COMPLETED":
                        # Note: We can't mark as completed during import, but we can note it
                        click.echo(f"     ℹ️  Item marked as completed in import (will be pending in list)")
                else:
                    failed_count += 1
                    click.echo(f"  ❌ Failed to import: {item_name}")
                    
            except (ValueError, IndexError) as e:
                failed_count += 1
                click.echo(f"  ❌ Line {line_num}: Parse error - {e}")
            except Exception as e:
                failed_count += 1
                click.echo(f"  ❌ Line {line_num}: Error importing '{line}': {e}")
    
    click.echo(f"\n📊 Import Summary: {imported_count} imported, {failed_count} failed")
    return imported_count


def import_from_csv(client: Meijer, file_path: Path) -> int:
    """
    Import shopping list items from a CSV file.
    
    Expected columns: Item Name, Quantity, Notes, Status
    
    Args:
        client: Meijer client instance
        file_path: Path to the import file
        
    Returns:
        int: Number of items successfully imported
    """
    import csv
    
    imported_count = 0
    failed_count = 0
    
    with open(file_path, "r", newline="", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        
        # Validate required columns
        required_columns = {"Item Name", "Quantity", "Notes", "Status"}
        if not required_columns.issubset(set(reader.fieldnames or [])):
            raise click.ClickException("❌ CSV file missing required columns: Item Name, Quantity, Notes, Status")
        
        for row_num, row in enumerate(reader, 1):
            try:
                item_name = row["Item Name"].strip()
                if not item_name:
                    continue
                
                quantity = int(row["Quantity"]) if row["Quantity"] else 1
                notes = row["Notes"].strip() if row["Notes"] else None
                status = row["Status"].strip() if row["Status"] else "PENDING"
                
                # Add the item
                success = client.list.add_item_with_details(
                    upc=f"ITEM_{row_num}_{hash(item_name) % 10000}",
                    description=item_name,
                    quantity=quantity,
                    notes=notes
                )
                
                if success:
                    imported_count += 1
                    click.echo(f"  ✅ Imported: {item_name} (qty: {quantity})")
                    
                    if status.upper() == "COMPLETED":
                        click.echo(f"     ℹ️  Item marked as completed in import (will be pending in list)")
                else:
                    failed_count += 1
                    click.echo(f"  ❌ Failed to import: {item_name}")
                    
            except (ValueError, KeyError) as e:
                failed_count += 1
                click.echo(f"  ❌ Row {row_num}: Parse error - {e}")
            except Exception as e:
                failed_count += 1
                click.echo(f"  ❌ Row {row_num}: Error importing row: {e}")
    
    click.echo(f"\n📊 Import Summary: {imported_count} imported, {failed_count} failed")
    return imported_count


def import_from_json(client: Meijer, file_path: Path) -> int:
    """
    Import shopping list items from a JSON file.
    
    Expected format: JSON with items array containing name, quantity, notes, status
    
    Args:
        client: Meijer client instance
        file_path: Path to the import file
        
    Returns:
        int: Number of items successfully imported
    """
    import json
    
    imported_count = 0
    failed_count = 0
    
    with open(file_path, "r", encoding="utf-8") as f:
        data = json.load(f)
    
    # Validate JSON structure
    if not isinstance(data, dict) or "items" not in data:
        raise click.ClickException("❌ Invalid JSON format: missing 'items' array")
    
    items = data["items"]
    if not isinstance(items, list):
        raise click.ClickException("❌ Invalid JSON format: 'items' is not an array")
    
    for item_num, item_data in enumerate(items, 1):
        try:
            if not isinstance(item_data, dict):
                click.echo(f"  ⚠️  Item {item_num}: Invalid item format, skipping")
                continue
            
            item_name = item_data.get("name", "").strip()
            if not item_name:
                click.echo(f"  ⚠️  Item {item_num}: Missing name, skipping")
                continue
            
            quantity = int(item_data.get("quantity", 1))
            notes = item_data.get("notes")
            status = item_data.get("status", "PENDING")
            
            # Add the item
            success = client.list.add_item_with_details(
                upc=f"ITEM_{item_num}_{hash(item_name) % 10000}",
                description=item_name,
                quantity=quantity,
                notes=notes
            )
            
            if success:
                imported_count += 1
                click.echo(f"  ✅ Imported: {item_name} (qty: {quantity})")
                
                if status.upper() == "COMPLETED":
                    click.echo(f"     ℹ️  Item marked as completed in import (will be pending in list)")
            else:
                failed_count += 1
                click.echo(f"  ❌ Failed to import: {item_name}")
                
        except (ValueError, KeyError) as e:
            failed_count += 1
            click.echo(f"  ❌ Item {item_num}: Parse error - {e}")
        except Exception as e:
            failed_count += 1
            click.echo(f"  ❌ Item {item_num}: Error importing: {e}")
    
    click.echo(f"\n📊 Import Summary: {imported_count} imported, {failed_count} failed")
    return imported_count


@click.group()
@click.version_option(version="1.0.0", prog_name="meijer")
def cli():
    """
    🛒 Meijer Shopping List CLI Tool

    Manage your Meijer shopping lists from the command line.

    Examples:
        meijer list show                    # Show current shopping list
        meijer list add "Milk"              # Add item by description
        meijer list add 0123456789          # Add item by UPC
        meijer list add < items.txt         # Add items from file
        echo "Milk" | meijer list add       # Add item from stdin
        meijer list clear                   # Clear completed items
        meijer list defrag                  # Organize list by aisle
        meijer list export list.txt         # Export list to text file
        meijer list import list.txt         # Import list from file
        meijer settings vehicle --show      # Show current vehicle
        meijer settings vehicle --update "Honda"  # Update vehicle
        meijer settings preferences --show  # Show all preferences
        meijer settings account --show      # Show account details
        meijer settings summary             # Show settings summary
    """
    pass


@cli.group()
def list():
    """Manage shopping list operations."""
    pass


@list.command("show")
@click.option("--completed", is_flag=True, help="Show only completed items")
@click.option("--pending", is_flag=True, help="Show only pending items")
def list_show(completed: bool, pending: bool):
    """Show shopping list items."""
    client = get_meijer_client()

    try:
        items = client.list.get()

        if not items:
            click.echo("📝 Your shopping list is empty!")
            return

        # Filter items based on flags
        if completed:
            items = [item for item in items if item.checked]
            title = "Completed Items"
        elif pending:
            items = [item for item in items if not item.checked]
            title = "Pending Items"
        else:
            title = f"Shopping List ({len(items)} items)"

        display_items_table(items, title)

        # Show summary
        total = len(items)
        completed_count = len([item for item in items if item.checked])
        pending_count = total - completed_count

        click.echo(
            f"\n📊 Summary: {total} total, {completed_count} completed, {pending_count} pending"
        )

    except Exception as e:
        raise click.ClickException(f"❌ Failed to show shopping list: {e}")


@list.command("favorites")
def list_favorites():
    """Show favorite items."""
    client = get_meijer_client()

    try:
        favorites = client.list.get_favorites()

        if not favorites:
            click.echo("📝 No favorite items found!")
            return

        # Prepare table data
        table_data = []
        for i, item in enumerate(favorites, 1):
            # Check if item is in active list by looking at list_item_id
            # If it's a favorite item, it might not have the same structure as regular list items
            in_list_status = "✅ In List" if hasattr(item, 'list_item_id') and item.list_item_id else "⭕ Not in List"
            
            table_data.append(
                [
                    i,
                    item.name[:40] + "..." if len(item.name) > 40 else item.name,
                    item.quantity,
                    in_list_status,
                ]
            )

        headers = ["#", "Favorite Item", "Qty", "Status"]

        if TABULATE_AVAILABLE:
            click.echo(f"\n📊 Favorites ({len(favorites)} items):")
            click.echo(tabulate(table_data, headers=headers, tablefmt="grid"))
        else:
            click.echo(f"\n📊 Favorites ({len(favorites)} items):")
            click.echo("=" * 60)
            click.echo(f"{'#':<3} {'Favorite Item':<40} {'Qty':<4} {'Status':<15}")
            click.echo("-" * 60)
            for row in table_data:
                click.echo(f"{row[0]:<3} {row[1]:<40} {row[2]:<4} {row[3]:<15}")

    except Exception as e:
        raise click.ClickException(f"❌ Failed to show favorites: {e}")


@list.command("add")
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


@list.command("clear")
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


@list.command("clearall")
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


@list.command("defrag")
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


@list.command("export")
@click.argument("filename", type=click.Path(), default="shopping_list.txt")
@click.option("--format", "-f", type=click.Choice(["text", "csv", "json"]), default="text", help="Export format")
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


@list.command("import")
@click.argument("filename", type=click.Path(exists=True))
@click.option("--clear", "-c", is_flag=True, help="Clear existing list before import")
@click.option("--format", "-f", type=click.Choice(["auto", "text", "csv", "json"]), default="auto", help="Import format (auto-detect if not specified)")
def list_import(filename: str, clear: bool, format: str):
    """Import shopping list from a file with full details."""
    client = get_meijer_client()

    try:
        file_path = Path(filename)
        
        if not file_path.exists():
            raise click.ClickException(f"❌ File not found: {filename}")

        # Auto-detect format if not specified
        if format == "auto":
            if filename.endswith('.csv'):
                format = "csv"
            elif filename.endswith('.json'):
                format = "json"
            else:
                format = "text"

        # Clear existing list if requested
        if clear:
            click.echo("🗑️ Clearing existing shopping list...")
            items = client.list.get()
            if items:
                deleted_count = 0
                for item in items:
                    if client.list.delete_item(str(item.list_item_id)):
                        deleted_count += 1
                        click.echo(f"  🗑️ Deleted: {item.name}")
                    else:
                        click.echo(f"  ❌ Failed to delete: {item.name}")
                click.echo(f"✅ Cleared {deleted_count} existing items")
            else:
                click.echo("📝 Shopping list was already empty")

        # Import items
        if format == "text":
            imported_count = import_from_text(client, file_path)
        elif format == "csv":
            imported_count = import_from_csv(client, file_path)
        elif format == "json":
            imported_count = import_from_json(client, file_path)

        click.echo(f"✅ Successfully imported {imported_count} items from {filename}")

    except Exception as e:
        raise click.ClickException(f"❌ Import failed: {e}")


@list.command("interactive")
def list_interactive():
    """Interactive TUI for shopping list management."""
    try:
        # Try to import rich for interactive TUI
        from rich.console import Console
        from rich.table import Table
        from rich.prompt import Prompt, Confirm
        from rich.panel import Panel
        from rich.text import Text

        RICH_AVAILABLE = True
    except ImportError:
        RICH_AVAILABLE = False
        click.echo("❌ Rich library not available for interactive mode.")
        click.echo("   Install with: pip install rich")
        click.echo("   Falling back to basic interactive mode...")

    client = get_meijer_client()

    if RICH_AVAILABLE:
        # Rich-based interactive mode
        console = Console()

        while True:
            console.clear()
            console.print(
                Panel.fit(
                    "🛒 Meijer Shopping List - Interactive Mode", style="bold blue"
                )
            )

            # Show current list
            items = client.list.get()
            if items:
                table = Table(title="Current Shopping List")
                table.add_column("#", style="cyan", no_wrap=True)
                table.add_column("Item", style="magenta")
                table.add_column("Qty", style="green")
                table.add_column("Status", style="yellow")
                table.add_column("Notes", style="dim")

                for i, item in enumerate(items, 1):
                    status = "✅ Done" if item.checked else "⏳ Pending"
                    notes = (
                        item.notes[:30] + "..."
                        if item.notes and len(item.notes) > 30
                        else item.notes or ""
                    )
                    table.add_row(str(i), item.name, str(item.quantity), status, notes)

                console.print(table)
            else:
                console.print("📝 Shopping list is empty", style="dim")

            # Show menu
            console.print("\n[bold]Actions:[/bold]")
            console.print("1. Add item")
            console.print("2. Mark item complete/incomplete")
            console.print("3. Delete item")
            console.print("4. Add from favorites")
            console.print("5. Defrag list")
            console.print("6. Refresh")
            console.print("0. Exit")

            choice = Prompt.ask(
                "\n[bold cyan]Choose action[/bold cyan]",
                choices=["0", "1", "2", "3", "4", "5", "6"],
            )

            if choice == "0":
                break
            elif choice == "1":
                item_name = Prompt.ask("Enter item name")
                quantity = int(Prompt.ask("Quantity", default="1"))
                notes = Prompt.ask("Notes (optional)")

                success = client.list.add_item_with_details(
                    upc=f"ITEM_{hash(item_name) % 10000}",
                    description=item_name,
                    quantity=quantity,
                    notes=notes,
                )

                if success:
                    console.print(f"✅ Added '{item_name}'", style="green")
                else:
                    console.print(f"❌ Failed to add '{item_name}'", style="red")

                Prompt.ask("Press Enter to continue")

            elif choice == "2":
                if not items:
                    console.print("📝 No items to modify", style="dim")
                    Prompt.ask("Press Enter to continue")
                    continue

                item_num = int(
                    Prompt.ask(
                        "Enter item number",
                        choices=[str(i) for i in range(1, len(items) + 1)],
                    )
                )
                item = items[item_num - 1]

                if item.checked:
                    success = client.list.uncomplete_item(str(item.list_item_id))
                    action = "uncompleted"
                else:
                    success = client.list.complete_item(str(item.list_item_id))
                    action = "completed"

                if success:
                    console.print(f"✅ Marked '{item.name}' as {action}", style="green")
                else:
                    console.print(f"❌ Failed to modify '{item.name}'", style="red")

                Prompt.ask("Press Enter to continue")

            elif choice == "3":
                if not items:
                    console.print("📝 No items to delete", style="dim")
                    Prompt.ask("Press Enter to continue")
                    continue

                item_num = int(
                    Prompt.ask(
                        "Enter item number",
                        choices=[str(i) for i in range(1, len(items) + 1)],
                    )
                )
                item = items[item_num - 1]

                if Confirm.ask(f"Delete '{item.name}'?"):
                    success = client.list.delete_item(str(item.list_item_id))
                    if success:
                        console.print(f"✅ Deleted '{item.name}'", style="green")
                    else:
                        console.print(f"❌ Failed to delete '{item.name}'", style="red")

                Prompt.ask("Press Enter to continue")

            elif choice == "4":
                favorites = client.list.get_favorites()
                if not favorites:
                    console.print("📝 No favorite items found", style="dim")
                    Prompt.ask("Press Enter to continue")
                    continue

                # Show favorites table
                fav_table = Table(title="Favorites")
                fav_table.add_column("#", style="cyan", no_wrap=True)
                fav_table.add_column("Favorite Item", style="magenta")
                fav_table.add_column("Status", style="yellow")

                for i, fav in enumerate(favorites, 1):
                    # Check if item is in active list by looking at list_item_id
                    # If it's a favorite item, it might not have the same structure as regular list items
                    status = (
                        "✅ In List" if hasattr(fav, 'list_item_id') and fav.list_item_id else "⭕ Not in List"
                    )
                    fav_table.add_row(str(i), fav.name, status)

                console.print(fav_table)

                item_num = int(
                    Prompt.ask(
                        "Enter favorite number to add",
                        choices=[str(i) for i in range(1, len(favorites) + 1)],
                    )
                )
                favorite = favorites[item_num - 1]

                success = client.list.add_item_with_details(
                    upc=favorite.item_part_number or f"FAV_{favorite.list_item_id}",
                    description=favorite.name,
                    quantity=1,
                )

                if success:
                    console.print(f"✅ Added favorite '{favorite.name}'", style="green")
                else:
                    console.print(
                        f"❌ Failed to add favorite '{favorite.name}'", style="red"
                    )

                Prompt.ask("Press Enter to continue")

            elif choice == "5":
                if Confirm.ask("Defrag shopping list? This will reorganize by aisle."):
                    # Ask for defrag options
                    reverse = Confirm.ask("Use reverse sorting (descending order)?")
                    zig = Confirm.ask(
                        "Use zig-zag B aisle sorting (B1 ascending, B2 descending, etc.)?"
                    )

                    click.echo("🔧 Starting defrag...")
                    if reverse:
                        click.echo("🔄 Using reverse sorting (descending order)")
                    if zig:
                        click.echo(
                            "🔄 Using zig-zag B aisle sorting (B1 ascending, B2 descending, etc.)"
                        )

                    success = client.list.defrag(reverse=reverse, zig=zig)
                    if success:
                        console.print("✅ Defrag completed!", style="green")
                    else:
                        console.print("❌ Defrag failed!", style="red")

                Prompt.ask("Press Enter to continue")

            elif choice == "6":
                # Just refresh the display
                continue

        console.print("👋 Goodbye!", style="bold green")

    else:
        # Basic interactive mode (fallback)
        click.echo("🛒 Meijer Shopping List - Basic Interactive Mode")
        click.echo("📝 Rich library not available. Install with: pip install rich")
        click.echo("💡 Use individual commands for better functionality:")
        click.echo("   meijer list show")
        click.echo("   meijer list add <item>")
        click.echo("   meijer list defrag")


def extract_tokens_from_mitmproxy_log(log_file: str) -> Optional[dict]:
    """Extract tokens using proper mitmproxy tools."""
    try:
        with open(log_file, "rb") as f:
            reader = FlowReader(f)

            for flow in reader.stream():
                # Method 1: Look for OAuth2 token responses
                if (
                    flow.response
                    and hasattr(flow.request, "url")
                    and "id.meijer.com/oauth2/default/v1/token" in flow.request.url
                    and flow.response.status_code == 200
                    and flow.response.content
                ):
                    try:
                        response_data = json.loads(
                            flow.response.content.decode("utf-8")
                        )

                        if all(
                            key in response_data
                            for key in ["access_token", "refresh_token", "id_token"]
                        ):
                            return {
                                "access_token": response_data["access_token"],
                                "refresh_token": response_data["refresh_token"],
                                "id_token": response_data["id_token"],
                                "expires_in": response_data.get("expires_in", 28800),
                                "token_type": response_data.get("token_type", "Bearer"),
                                "scope": response_data.get("scope", ""),
                            }
                    except (json.JSONDecodeError, UnicodeDecodeError):
                        continue

                # Method 2: Look for Bearer tokens in request headers
                if (
                    hasattr(flow.request, "headers")
                    and "authorization" in flow.request.headers
                ):
                    auth_header = flow.request.headers["authorization"]
                    if auth_header.startswith("Bearer "):
                        bearer_token = auth_header[7:]  # Remove "Bearer " prefix
                        
                        # Check if this is a Meijer API request
                        if (
                            hasattr(flow.request, "url")
                            and "meijer.com" in flow.request.url
                            and bearer_token
                        ):
                            # Extract additional info from the JWT token if possible
                            try:
                                import jwt
                                # Decode without verification to get payload
                                payload = jwt.decode(bearer_token, options={"verify_signature": False})
                                
                                return {
                                    "access_token": bearer_token,
                                    "refresh_token": "",  # Not available from request headers
                                    "id_token": bearer_token,  # Use as ID token
                                    "expires_in": payload.get("exp", 0) - int(time.time()) if payload.get("exp") else 28800,
                                    "token_type": "Bearer",
                                    "scope": " ".join(payload.get("scope", [])),
                                    "user_id": payload.get("sub", ""),
                                    "expires_at": payload.get("exp", 0),
                                }
                            except (ImportError, Exception):
                                # Fallback if JWT decoding fails
                                return {
                                    "access_token": bearer_token,
                                    "refresh_token": "",  # Not available from request headers
                                    "id_token": bearer_token,  # Use as ID token
                                    "expires_in": 28800,  # Default
                                    "token_type": "Bearer",
                                    "scope": "",
                                }

    except Exception:
        pass

    return None


def extract_tokens_with_regex(log_file: str) -> Optional[dict]:
    """Fallback method using regex parsing."""
    try:
        meijer_requests = []

        with open(log_file, "r", encoding="utf-8", errors="ignore") as f:
            for line_num, line in enumerate(f, 1):
                try:
                    # Look for Meijer API requests with Bearer tokens
                    if "meijer.com" in line.lower() and "authorization:" in line.lower():
                        # Extract Bearer token from authorization header
                        bearer_match = re.search(r"authorization:\s*Bearer\s+([A-Za-z0-9\-._~+/]+=*)", line, re.IGNORECASE)
                        if bearer_match:
                            bearer_token = bearer_match.group(1)
                            
                            # Extract timestamp if available
                            timestamp = None
                            timestamp_match = re.search(r"(\d{10,13})", line)
                            if timestamp_match:
                                timestamp_str = timestamp_match.group(1)
                                try:
                                    timestamp = int(timestamp_str)
                                    if timestamp > 9999999999:
                                        timestamp = timestamp / 1000
                                except (ValueError, TypeError):
                                    pass

                            meijer_requests.append(
                                {
                                    "line": line_num,
                                    "timestamp": timestamp or 0,
                                    "token": bearer_token,
                                    "content": line[:200] + "..."
                                    if len(line) > 200
                                    else line,
                                }
                            )
                            continue

                    # Also look for any Bearer token in Meijer-related lines
                    if "meijer.com" in line.lower() and "bearer" in line.lower():
                        bearer_match = re.search(r"Bearer\s+([A-Za-z0-9\-._~+/]+=*)", line, re.IGNORECASE)
                        if bearer_match:
                            bearer_token = bearer_match.group(1)

                            # Extract timestamp if available
                            timestamp = None
                            timestamp_match = re.search(r"(\d{10,13})", line)
                            if timestamp_match:
                                timestamp_str = timestamp_match.group(1)
                                try:
                                    timestamp = int(timestamp_str)
                                    if timestamp > 9999999999:
                                        timestamp = timestamp / 1000
                                except (ValueError, TypeError):
                                    pass

                            meijer_requests.append(
                                {
                                    "line": line_num,
                                    "timestamp": timestamp or 0,
                                    "token": bearer_token,
                                    "content": line[:200] + "..."
                                    if len(line) > 200
                                    else line,
                                }
                            )

                except Exception:
                    continue

        if not meijer_requests:
            return None

        # Sort by timestamp and get the most recent
        meijer_requests.sort(key=lambda x: x["timestamp"], reverse=True)
        latest_request = meijer_requests[0]

        # Try to decode JWT to get expiration info
        try:
            import jwt
            payload = jwt.decode(latest_request["token"], options={"verify_signature": False})
            expires_in = payload.get("exp", 0) - int(time.time()) if payload.get("exp") else 28800
        except (ImportError, Exception):
            expires_in = 28800

        return {
            "access_token": latest_request["token"],
            "refresh_token": "",  # Not available with regex method
            "id_token": latest_request["token"],  # Use as ID token
            "expires_in": expires_in,
            "token_type": "Bearer",
            "scope": "",
        }

    except Exception:
        return None


@cli.command()
@click.argument("log_file", type=click.Path(exists=True))
def auth(log_file: str):
    """Extract authentication tokens from mitmproxy log and save to ~/.config/meijer.txt."""
    try:
        click.echo(f"🔍 Analyzing mitmproxy log: {log_file}")
        click.echo("⏳ This may take a moment for large log files...")

        # Use the existing extract_bearer_token.py tool
        import subprocess
        import sys
        import os
        
        # Get the path to the tools directory
        tools_dir = os.path.join(os.path.dirname(os.path.dirname(__file__)), "tools")
        extract_script = os.path.join(tools_dir, "extract_bearer_token.py")
        
        if not os.path.exists(extract_script):
            raise click.ClickException(f"❌ Tool not found: {extract_script}")
        
        # Run the extract_bearer_token.py tool
        click.echo("🔧 Using extract_bearer_token.py tool...")
        result = subprocess.run(
            [sys.executable, extract_script, log_file],
            capture_output=True,
            text=True,
            cwd=os.getcwd()
        )
        
        if result.returncode != 0:
            click.echo(f"⚠️  Tool output: {result.stderr}")
            raise click.ClickException("❌ Failed to run extract_bearer_token.py tool")
        
        # Check if the tool created output files
        bearer_auth_json = "bearer_auth.json"
        if not os.path.exists(bearer_auth_json):
            raise click.ClickException("❌ No authentication tokens found in log file")
        
        # Load the extracted token
        import json
        with open(bearer_auth_json, "r") as f:
            token_data = json.load(f)
        
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
            payload = jwt.decode(tokens["access_token"], options={"verify_signature": False})
            if payload.get("exp"):
                import time
                expires_in = payload.get("exp") - int(time.time())
                if expires_in > 0:
                    tokens["expires_in"] = expires_in
                    tokens["expires_at"] = payload.get("exp")
        except (ImportError, Exception):
            pass  # Use default values if JWT decoding fails
        
        # Save to ~/.config/meijer.txt
        config_path = os.path.expanduser("~/.config/meijer.txt")
        os.makedirs(os.path.dirname(config_path), exist_ok=True)

        config = {
            **tokens,
            "updated_at": datetime.now().isoformat(),
            "source": f"Extracted from {log_file}",
            "extracted_at": datetime.now().isoformat(),
        }

        with open(config_path, "w") as f:
            json.dump(config, f, indent=2)

        click.echo(f"💾 Tokens saved to {config_path}")
        click.echo("✅ Authentication file updated successfully!")
        click.echo(f"🔑 Access token: {tokens['access_token'][:50]}...")
        click.echo(f"⏰ Expires in: {tokens['expires_in']} seconds")
        
        # Clean up temporary files
        for temp_file in ["bearer_auth.json", "bearer_auth.txt", "bearer_token_analysis.json"]:
            if os.path.exists(temp_file):
                os.remove(temp_file)
                click.echo(f"🧹 Cleaned up {temp_file}")

    except Exception as e:
        raise click.ClickException(f"❌ Failed to extract authentication: {e}")


@cli.command()
def status():
    """Show authentication and connection status."""
    try:
        client = get_meijer_client()

        click.echo("🔐 Authentication Status:")
        click.echo(f"  Status: {client.auth_status.name}")
        click.echo(f"  Method: {client.auth_status}")

        # Test API connection
        try:
            items = client.list.get()
            click.echo(f"  API: ✅ Connected ({len(items)} items in list)")
        except Exception as e:
            click.echo(f"  API: ❌ Error: {e}")

    except Exception as e:
        click.echo(f"❌ Status check failed: {e}")


@cli.group()
def settings():
    """Manage Meijer account settings and preferences."""
    pass


@settings.command("vehicle")
@click.option("--show", is_flag=True, help="Show current vehicle information")
@click.option("--update", help="Update vehicle description (e.g., 'Honda', 'VW')")
def settings_vehicle(show: bool, update: str):
    """Manage vehicle information for fuel rewards."""
    client = get_meijer_client()
    
    try:
        if show or not update:
            # Show current vehicle information
            vehicle = client.settings.get_vehicle_information()
            
            if vehicle:
                click.echo("🚗 Current Vehicle Information:")
                click.echo(f"  Vehicle ID: {vehicle.vehicle_id}")
                click.echo(f"  Description: {vehicle.vehicle_description}")
                click.echo(f"  Account ID: {vehicle.account_id}")
            else:
                click.echo("❌ No vehicle information found")
                return
        
        if update:
            # Update vehicle information
            click.echo(f"🔧 Updating vehicle to: {update}")
            success = client.settings.update_vehicle_information(update)
            
            if success:
                click.echo(f"✅ Vehicle updated to: {update}")
                
                # Show updated information
                updated_vehicle = client.settings.get_vehicle_information()
                if updated_vehicle:
                    click.echo(f"  Verified: {updated_vehicle.vehicle_description}")
            else:
                click.echo("❌ Failed to update vehicle")
                
    except Exception as e:
        raise click.ClickException(f"❌ Vehicle operation failed: {e}")


@settings.command("preferences")
@click.option("--show", is_flag=True, help="Show current preferences")
@click.option("--choices", is_flag=True, help="Show available preference choices")
@click.option("--update", nargs=2, help="Update preference: TYPE VALUE (e.g., 'Substitutions' 'No Substitutions')")
def settings_preferences(show: bool, choices: bool, update: tuple):
    """Manage customer preferences."""
    client = get_meijer_client()
    
    try:
        if show or not update:
            # Show current preferences
            preferences = client.settings.get_customer_preferences()
            
            if preferences:
                click.echo(f"⚙️  Customer Preferences ({len(preferences)} found):")
                
                # Prepare table data
                table_data = []
                for i, pref in enumerate(preferences, 1):
                    table_data.append([
                        i,
                        pref.preference_type_name,
                        pref.preference_value,
                        pref.owning_program_name,
                        pref.data_type_name,
                        "Yes" if pref.is_preference_discrete_choice else "No"
                    ])
                
                headers = ["#", "Preference Type", "Current Value", "Program", "Data Type", "Discrete Choice"]
                
                if TABULATE_AVAILABLE:
                    click.echo(tabulate(table_data, headers=headers, tablefmt="grid"))
                else:
                    for row in table_data:
                        click.echo(f"  {row[0]}. {row[1]}: {row[2]} ({row[3]})")
            else:
                click.echo("❌ No preferences found")
                return
        
        if choices:
            # Show available discrete choices
            choices_list = client.settings.get_preference_discrete_choices()
            
            if choices_list:
                click.echo("🎯 Available Preference Choices:")
                
                table_data = []
                for choice in choices_list:
                    table_data.append([
                        choice.digital_preference_discrete_choice_id,
                        choice.digital_preference_discrete_choice_value
                    ])
                
                headers = ["Choice ID", "Choice Value"]
                
                if TABULATE_AVAILABLE:
                    click.echo(tabulate(table_data, headers=headers, tablefmt="grid"))
                else:
                    for choice in choices_list:
                        click.echo(f"  {choice.digital_preference_discrete_choice_id}: {choice.digital_preference_discrete_choice_value}")
            else:
                click.echo("❌ No discrete choices found")
        
        if update:
            # Update preference
            preference_type, preference_value = update
            click.echo(f"🔧 Updating preference '{preference_type}' to: {preference_value}")
            
            success = client.settings.update_customer_preference(
                preference_type, 
                preference_value, 
                "DigitalGrocery"  # Default program
            )
            
            if success:
                click.echo(f"✅ Preference '{preference_type}' updated successfully")
            else:
                click.echo(f"❌ Failed to update preference '{preference_type}'")
                
    except Exception as e:
        raise click.ClickException(f"❌ Preferences operation failed: {e}")


@settings.command("account")
@click.option("--show", is_flag=True, help="Show account details")
@click.option("--update", help="Update account field (format: FIELD=VALUE)")
def settings_account(show: bool, update: str):
    """Manage account information."""
    client = get_meijer_client()
    
    try:
        if show or not update:
            # Show account details
            account = client.settings.get_account_details()
            
            if account:
                click.echo("👤 Account Details:")
                click.echo(f"  Account ID: {account.get('accountId')}")
                click.echo(f"  Name: {account.get('firstName')} {account.get('lastName')}")
                click.echo(f"  Email: {account.get('email')}")
                click.echo(f"  Birth Date: {account.get('birthDate')}")
                click.echo(f"  ZIP Code: {account.get('zip')}")
                click.echo(f"  Store ID: {account.get('storeId')}")
                click.echo(f"  mPerks ID: {account.get('mPerksId')}")
                click.echo(f"  Account Status: {account.get('accountStatus')}")
            else:
                click.echo("❌ No account details found")
                return
        
        if update:
            # Parse update field
            if "=" not in update:
                raise click.ClickException("❌ Update format must be FIELD=VALUE (e.g., 'firstName=John')")
            
            field, value = update.split("=", 1)
            click.echo(f"🔧 Updating account field '{field}' to: {value}")
            
            # Note: This is a simplified update - in production you'd want more validation
            updates = {field: value}
            success = client.settings.update_account_details(updates)
            
            if success:
                click.echo(f"✅ Account field '{field}' updated successfully")
            else:
                click.echo(f"❌ Failed to update account field '{field}'")
                
    except Exception as e:
        raise click.ClickException(f"❌ Account operation failed: {e}")


@settings.command("summary")
def settings_summary():
    """Show a summary of all settings."""
    client = get_meijer_client()
    
    try:
        click.echo("🔧 Settings Summary")
        click.echo("=" * 50)
        
        # Vehicle information
        click.echo("\n🚗 Vehicle Information:")
        vehicle = client.settings.get_vehicle_information()
        if vehicle:
            click.echo(f"  Current Vehicle: {vehicle.vehicle_description}")
            click.echo(f"  Vehicle ID: {vehicle.vehicle_id}")
        else:
            click.echo("  No vehicle information")
        
        # Preferences summary
        click.echo("\n⚙️  Preferences Summary:")
        preferences = client.settings.get_customer_preferences()
        if preferences:
            click.echo(f"  Total Preferences: {len(preferences)}")
            
            # Group by program
            programs = {}
            for pref in preferences:
                program = pref.owning_program_name
                if program not in programs:
                    programs[program] = []
                programs[program].append(pref)
            
            for program, prefs in programs.items():
                click.echo(f"    {program}: {len(prefs)} preferences")
        else:
            click.echo("  No preferences found")
        
        # Account summary
        click.echo("\n👤 Account Summary:")
        account = client.settings.get_account_details()
        if account:
            click.echo(f"  Name: {account.get('firstName')} {account.get('lastName')}")
            click.echo(f"  Store ID: {account.get('storeId')}")
            click.echo(f"  mPerks ID: {account.get('mPerksId')}")
        else:
            click.echo("  No account details found")
            
    except Exception as e:
        raise click.ClickException(f"❌ Settings summary failed: {e}")


@cli.command()
def version():
    """Show version information."""
    click.echo("🛒 Meijer CLI Tool v1.0.0")
    click.echo("📦 Built with Click and Meijer API")
    click.echo("🔧 Enhanced with tabulate for beautiful tables")


def extract_tokens_from_analysis_report(report_file_path: str) -> Optional[dict]:
    """Extract tokens from the analysis report JSON file."""
    try:
        with open(report_file_path, "r") as f:
            report_data = json.load(f)

        # Look for authentication flows with token responses
        for flow in report_data.get("authentication_flows", []):
            if (
                flow.get("url") == "https://id.meijer.com/oauth2/default/v1/token"
                and flow.get("status_code") == 200
                and flow.get("response_body")
            ):
                try:
                    response_data = json.loads(flow["response_body"])

                    # Check if this contains the tokens we need
                    if all(
                        key in response_data
                        for key in ["access_token", "refresh_token", "id_token"]
                    ):
                        return {
                            "access_token": response_data["access_token"],
                            "refresh_token": response_data["refresh_token"],
                            "id_token": response_data["id_token"],
                            "expires_in": response_data.get("expires_in", 28800),
                            "token_type": response_data.get("token_type", "Bearer"),
                            "scope": response_data.get("scope", ""),
                        }
                except (json.JSONDecodeError, KeyError):
                    continue

    except Exception:
        pass

    return None


if __name__ == "__main__":
    cli()
