"""
Utility functions for Meijer CLI.

This module contains helper functions used across the CLI commands.
"""

import logging
import os
from datetime import datetime
from pathlib import Path
from typing import List, TextIO

import click

from ..client import Meijer


def get_meijer_client() -> Meijer:
    """
    Get an authenticated Meijer client instance.

    Returns:
        Meijer: Authenticated client instance

    Raises:
        click.ClickException: If authentication fails
    """
    logger = logging.getLogger(__name__)
    logger.debug("Initializing Meijer client")

    try:
        # First try to load from local auth.txt file
        local_auth_path = "auth.txt"
        if os.path.exists(local_auth_path):
            logger.debug(f"Found local auth file: {local_auth_path}")
            client = Meijer(auth=local_auth_path)
        else:
            logger.debug("No local auth.txt found, using default authentication")
            # Fall back to default behavior
            client = Meijer()

        logger.debug(f"Client authentication status: {client.auth_status.name}")

        if client.auth_status.name != "AUTHENTICATED":
            logger.error(
                f"Authentication failed with status: {client.auth_status.name}"
            )
            raise click.ClickException(
                "❌ Authentication failed! Please check your credentials.\n"
                "   Ensure you have auth.txt or ~/.config/meijer.txt configured"
            )

        logger.debug("Meijer client initialized successfully")
        return client
    except Exception as e:
        logger.error(f"Failed to initialize Meijer client: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to initialize Meijer client: {e}")


def display_items_table(items: List, title: str = "Shopping List Items") -> None:
    """
    Display items in a formatted table.

    Args:
        items: List of shopping list items
        title: Title for the table display
    """
    logger = logging.getLogger(__name__)
    logger.debug(f"Displaying {len(items)} items with title: {title}")

    if not items:
        logger.debug("No items to display")
        click.echo(f"📝 {title}: No items found")
        return

    # Prepare table data
    table_data = []
    for i, item in enumerate(items, 1):
        logger.debug(f"Processing item {i}: {getattr(item, 'name', 'Unknown')}")
        table_data.append(
            [
                i,
                "✅"
                if getattr(item, "checked", getattr(item, "is_complete", False))
                else "⏳",
                getattr(item, "name", getattr(item, "item_description", "Unknown")),
                getattr(item, "quantity", 1),
                getattr(item, "notes", ""),
            ]
        )

    # Display table
    headers = ["#", "Status", "Item", "Qty", "Notes"]
    click.echo(f"\n📋 {title}")
    click.echo("=" * 60)

    try:
        from tabulate import tabulate

        logger.debug("Using tabulate for table formatting")
        click.echo(tabulate(table_data, headers=headers, tablefmt="grid"))
    except ImportError:
        logger.debug("Tabulate not available, using fallback formatting")
        # Fallback to simple formatting
        click.echo(f"{'#':<3} {'Status':<8} {'Item':<30} {'Qty':<4} {'Notes':<15}")
        click.echo("-" * 60)
        for row in table_data:
            click.echo(f"{row[0]:<3} {row[1]:<8} {row[2]:<30} {row[3]:<4} {row[4]:<15}")


def add_items_from_file(client: Meijer, file_input: TextIO) -> int:
    """
    Add items from a file to the shopping list.

    Args:
        client: Meijer client instance
        file_input: File-like object to read from

    Returns:
        int: Number of items successfully added
    """
    logger = logging.getLogger(__name__)
    logger.debug("Adding items from file input")

    added_count = 0
    lines = file_input.readlines()

    for line_num, line in enumerate(lines, 1):
        line = line.strip()
        if not line or line.startswith("#"):
            continue

        try:
            # Parse line format: "Item Name [Qty] [Notes]"
            parts = line.split(" ", 1)
            if len(parts) == 1:
                item_name = parts[0]
                quantity = 1
                notes = ""
            else:
                item_name = parts[0]
                remaining = parts[1]

                # Check for quantity in brackets at end
                if remaining.endswith("]") and "[" in remaining:
                    last_bracket = remaining.rfind("[")
                    if last_bracket > 0:
                        notes = remaining[:last_bracket].strip()
                        qty_part = remaining[last_bracket + 1 : -1].strip()
                        try:
                            quantity = int(qty_part)
                        except ValueError:
                            quantity = 1
                            notes = remaining.strip()
                    else:
                        quantity = 1
                        notes = remaining.strip()
                else:
                    quantity = 1
                    notes = remaining.strip()

            # Add item to list
            success = client.list.add(item_name, quantity, notes)
            if success:
                added_count += 1
                click.echo(f"  ✅ Added: {item_name} (Qty: {quantity})")
            else:
                click.echo(f"  ❌ Failed to add: {item_name}")

        except Exception as e:
            click.echo(f"  ❌ Error processing line {line_num}: {e}")

    return added_count


def export_to_text(items: List, file_path: Path) -> None:
    """
    Export shopping list items to a text file.

    Args:
        items: List of shopping list items
        file_path: Path to export file
    """
    with open(file_path, "w", encoding="utf-8") as f:
        f.write(
            f"# Meijer Shopping List - {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}\n"
        )
        f.write("# Format: Item Name [Quantity] [Notes]\n")
        f.write("# Lines starting with # are comments\n\n")

        for item in items:
            name = getattr(item, "name", getattr(item, "item_description", "Unknown"))
            quantity = getattr(item, "quantity", 1)
            notes = getattr(item, "notes", "")

            if notes:
                f.write(f"{name} [{quantity}] {notes}\n")
            else:
                f.write(f"{name} [{quantity}]\n")

    click.echo(f"📄 Exported {len(items)} items to {file_path}")


def export_to_csv(items: List, file_path: Path) -> None:
    """
    Export shopping list items to a CSV file.

    Args:
        items: List of shopping list items
        file_path: Path to export file
    """
    import csv

    with open(file_path, "w", newline="", encoding="utf-8") as f:
        writer = csv.writer(f)
        writer.writerow(["Item", "Quantity", "Notes", "Status", "Added Date"])

        for item in items:
            name = getattr(item, "name", getattr(item, "item_description", "Unknown"))
            quantity = getattr(item, "quantity", 1)
            notes = getattr(item, "notes", "")
            status = (
                "Completed"
                if getattr(item, "checked", getattr(item, "is_complete", False))
                else "Pending"
            )

            writer.writerow([name, quantity, notes, status, ""])

    click.echo(f"📊 Exported {len(items)} items to {file_path}")


def export_to_json(items: List, file_path: Path) -> None:
    """
    Export shopping list items to a JSON file.

    Args:
        items: List of shopping list items
        file_path: Path to export file
    """
    import json

    export_data = {
        "export_date": datetime.now().isoformat(),
        "total_items": len(items),
        "items": [],
    }

    for item in items:
        item_data = {
            "name": getattr(item, "name", getattr(item, "item_description", "Unknown")),
            "quantity": getattr(item, "quantity", 1),
            "notes": getattr(item, "notes", ""),
            "status": "completed"
            if getattr(item, "checked", getattr(item, "is_complete", False))
            else "pending",
            "upc": getattr(item, "upc", None),
            "brand": getattr(item, "brand", None),
            "category": getattr(item, "category", None),
        }
        export_data["items"].append(item_data)

    with open(file_path, "w", encoding="utf-8") as f:
        json.dump(export_data, f, indent=2, ensure_ascii=False)

    click.echo(f"📄 Exported {len(items)} items to {file_path}")


def import_from_text(client: Meijer, file_path: Path) -> int:
    """
    Import shopping list items from a text file.

    Args:
        client: Meijer client instance
        file_path: Path to import file

    Returns:
        int: Number of items successfully imported
    """
    try:
        with open(file_path, "r", encoding="utf-8") as f:
            return add_items_from_file(client, f)
    except Exception as e:
        raise click.ClickException(f"❌ Failed to read file {file_path}: {e}")


def import_from_csv(client: Meijer, file_path: Path) -> int:
    """
    Import shopping list items from a CSV file.

    Args:
        client: Meijer client instance
        file_path: Path to import file

    Returns:
        int: Number of items successfully imported
    """
    import csv

    try:
        with open(file_path, "r", encoding="utf-8") as f:
            reader = csv.DictReader(f)
            imported_count = 0

            for row_num, row in enumerate(reader, 1):
                try:
                    item_name = row.get("Item", "").strip()
                    if not item_name:
                        continue

                    quantity = int(row.get("Quantity", 1))
                    notes = row.get("Notes", "").strip()

                    success = client.list.add(item_name, quantity, notes)
                    if success:
                        imported_count += 1
                        click.echo(f"  ✅ Imported: {item_name} (Qty: {quantity})")
                    else:
                        click.echo(f"  ❌ Failed to import: {item_name}")

                except Exception as e:
                    click.echo(f"  ❌ Error processing row {row_num}: {e}")

            return imported_count

    except Exception as e:
        raise click.ClickException(f"❌ Failed to read CSV file {file_path}: {e}")


def import_from_json(client: Meijer, file_path: Path) -> int:
    """
    Import shopping list items from a JSON file.

    Args:
        client: Meijer client instance
        file_path: Path to import file

    Returns:
        int: Number of items successfully imported
    """
    import json

    try:
        with open(file_path, "r", encoding="utf-8") as f:
            data = json.load(f)

            items = data.get("items", [])
            if not items:
                click.echo("⚠️  No items found in JSON file")
                return 0

            imported_count = 0
            for item_data in items:
                try:
                    item_name = item_data.get("name", "").strip()
                    if not item_name:
                        continue

                    quantity = int(item_data.get("quantity", 1))
                    notes = item_data.get("notes", "").strip()

                    success = client.list.add(item_name, quantity, notes)
                    if success:
                        imported_count += 1
                        click.echo(f"  ✅ Imported: {item_name} (Qty: {quantity})")
                    else:
                        click.echo(f"  ❌ Failed to import: {item_name}")

                except Exception as e:
                    click.echo(f"  ❌ Error processing item: {e}")

            return imported_count

    except Exception as e:
        raise click.ClickException(f"❌ Failed to read JSON file {file_path}: {e}")
