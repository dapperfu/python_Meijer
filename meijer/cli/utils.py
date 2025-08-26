"""
Utility functions for Meijer CLI.

This module contains helper functions used across the CLI commands.
"""

import logging
from datetime import datetime
from pathlib import Path
from typing import Any, Dict, List, Optional, TextIO

import click

from ..client import Meijer


def get_meijer_client(proxy: str = None, local: str = None) -> Meijer:
    """
    Get an authenticated Meijer client instance.

    Args:
        proxy: Proxy server address (e.g., "127.0.0.1:8080")
        local: Local Flask backend URL (e.g., "http://127.0.0.1:5000")

    Returns:
        Meijer: Authenticated client instance

    Raises:
        click.ClickException: If authentication fails
    """
    logger = logging.getLogger(__name__)
    logger.debug("Initializing Meijer client")

    try:
        # Use the new token storage system instead of local auth files
        logger.debug("Using token storage system for authentication")

        # Create client with local backend if specified
        if local:
            logger.debug(f"Creating client with local Flask backend: {local}")
            client = Meijer(base_url=local)
        else:
            client = Meijer()

        # Configure proxy if specified
        if proxy:
            logger.debug(f"Configuring proxy: {proxy}")
            try:
                # Parse proxy address (e.g., "127.0.0.1:8080")
                if ":" in proxy:
                    proxy_host, proxy_port_str = proxy.split(":", 1)
                    proxy_port = int(proxy_port_str)
                    client.configure_proxy(proxy_host, proxy_port)
                    logger.info(f"🔒 Proxy configured: {proxy_host}:{proxy_port}")
                else:
                    # Default to port 8080 if no port specified
                    client.configure_proxy(proxy, 8080)
                    logger.info(f"🔒 Proxy configured: {proxy}:8080")
            except ValueError as e:
                logger.warning(f"Invalid proxy format '{proxy}': {e}")
                logger.info("💡 Expected format: host:port (e.g., 127.0.0.1:8080)")

        logger.debug(f"Client authentication status: {client.auth_status.name}")

        if client.auth_status.name != "AUTHENTICATED":
            logger.error(
                f"Authentication failed with status: {client.auth_status.name}"
            )
            raise click.ClickException(
                "❌ Authentication failed! Please check your credentials.\n"
                "   Run 'meijer auth' to extract new tokens from mitmproxy logs"
            )

        logger.debug("Meijer client initialized successfully")
        return client
    except Exception as e:
        logger.error(f"Failed to initialize Meijer client: {e}", exc_info=True)
        raise click.ClickException(f"❌ Failed to initialize Meijer client: {e}")


def display_items_table(items: List, title: str = "Shopping List Items") -> None:
    """
    Display items in a formatted table using Rich.

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

    # Always use Rich for table formatting
    from rich.console import Console
    from rich.table import Table

    logger.debug("Using rich for table formatting")
    console = Console()
    table = Table(title=title, show_header=True, header_style="bold cyan")

    for header in headers:
        table.add_column(header, style="cyan", no_wrap=True)

    for row in table_data:
        table.add_row(*[str(cell) for cell in row])

    console.print(table)


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
    logger.debug(f"Processing {len(lines)} lines from file")

    for line_num, line in enumerate(lines, 1):
        line = line.strip()
        if not line or line.startswith("#"):
            logger.debug(
                f"Skipping line {line_num}: {'empty' if not line else 'comment'}"
            )
            continue

        try:
            logger.debug(f"Processing line {line_num}: {line}")
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
                            logger.debug(f"Parsed quantity: {quantity}")
                        except ValueError:
                            quantity = 1
                            notes = remaining.strip()
                            logger.debug("Failed to parse quantity, using default: 1")
                    else:
                        quantity = 1
                        notes = remaining.strip()
                else:
                    quantity = 1
                    notes = remaining.strip()

            logger.debug(
                f"Adding item: {item_name}, quantity: {quantity}, notes: {notes}"
            )
            # Add item to list
            success = client.list.add(item_name, quantity, notes)
            if success:
                added_count += 1
                logger.debug(f"Successfully added item: {item_name}")
                click.echo(f"  ✅ Added: {item_name} (Qty: {quantity})")
            else:
                logger.warning(f"Failed to add item: {item_name}")
                click.echo(f"  ❌ Failed to add: {item_name}")

        except Exception as e:
            logger.error(f"Error processing line {line_num}: {e}", exc_info=True)
            click.echo(f"  ❌ Error processing line {line_num}: {e}")

    logger.debug(f"File processing complete. Added {added_count} items")
    return added_count


def export_to_text(items: List, file_path: Path) -> None:
    """
    Export shopping list items to a text file with comprehensive details.

    Args:
        items: List of shopping list items
        file_path: Path to export file
    """
    logger = logging.getLogger(__name__)
    logger.debug(f"Exporting {len(items)} items to text file: {file_path}")

    with open(file_path, "w", encoding="utf-8") as f:
        f.write(
            f"# Meijer Shopping List - {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}\n"
        )
        f.write(
            "# Format: Item Name [UPC] [Quantity] [Unit Price] [Total Price] [Methodology] [Notes] [Status] [Location]\n"
        )
        f.write("# Lines starting with # are comments\n\n")

        for item in items:
            name = getattr(item, "name", getattr(item, "item_description", "Unknown"))
            upc = getattr(item, "upc", getattr(item, "id", ""))
            quantity = getattr(item, "quantity", 1)
            unit_price = getattr(
                item, "unit_price", getattr(item, "estimated_cost", "")
            )
            total_price = getattr(item, "total_price", "")
            methodology = getattr(item, "methodology", "")
            notes = getattr(item, "notes", "")
            status = "Completed" if getattr(item, "checked", False) else "Pending"
            location = getattr(item, "location", "")

            # Calculate total price if not provided but unit price is available
            if not total_price and unit_price and quantity:
                total_price = unit_price * quantity

            # Format the line with all available information
            line_parts = [name]

            if upc:
                line_parts.append(f"UPC:{upc}")
            if quantity and quantity != 1:
                line_parts.append(f"Qty:{quantity}")
            if unit_price:
                line_parts.append(f"Price:${unit_price:.2f}")
            if total_price:
                line_parts.append(f"Total:${total_price:.2f}")
            if methodology:
                line_parts.append(f"Method:{methodology.upper()}")
            if notes:
                line_parts.append(f"Notes:{notes}")
            if status == "Completed":
                line_parts.append("✓")
            if location:
                line_parts.append(f"Loc:{location}")

            f.write(" ".join(line_parts) + "\n")

            logger.debug(
                f"Exporting item: {name}, quantity: {quantity}, notes: {notes}"
            )

    logger.debug("Text export completed successfully")
    click.echo(f"📄 Exported {len(items)} items to {file_path}")


def export_to_csv(items: List, file_path: Path) -> None:
    """
    Export shopping list items to a CSV file.

    Args:
        items: List of shopping list items
        file_path: Path to export file
    """
    logger = logging.getLogger(__name__)
    logger.debug(f"Exporting {len(items)} items to CSV file: {file_path}")

    import csv

    with open(file_path, "w", newline="", encoding="utf-8") as f:
        writer = csv.writer(f)
        writer.writerow(["Item", "Quantity", "Notes", "Status"])

        for item in items:
            name = getattr(item, "name", getattr(item, "item_description", "Unknown"))
            quantity = getattr(item, "quantity", 1)
            notes = getattr(item, "notes", "")
            status = "Completed" if getattr(item, "checked", False) else "Pending"

            logger.debug(
                f"Exporting CSV item: {name}, quantity: {quantity}, status: {status}"
            )

            writer.writerow([name, quantity, notes, status])

    logger.debug("CSV export completed successfully")
    click.echo(f"📊 Exported {len(items)} items to {file_path}")


def export_to_json(items: List, file_path: Path) -> None:
    """
    Export shopping list items to a JSON file.

    Args:
        items: List of shopping list items
        file_path: Path to export file
    """
    logger = logging.getLogger(__name__)
    logger.debug(f"Exporting {len(items)} items to JSON file: {file_path}")

    import json

    export_data = {
        "exported_at": datetime.now().isoformat(),
        "total_items": len(items),
        "items": [],
    }

    for item in items:
        item_data = {
            "name": getattr(item, "name", getattr(item, "item_description", "Unknown")),
            "quantity": getattr(item, "quantity", 1),
            "notes": getattr(item, "notes", ""),
            "checked": getattr(item, "checked", False),
            "item_id": getattr(item, "id", None),
        }
        logger.debug(f"Exporting JSON item: {item_data['name']}")
        export_data["items"].append(item_data)

    with open(file_path, "w", encoding="utf-8") as f:
        json.dump(export_data, f, indent=2, ensure_ascii=False)

    logger.debug("JSON export completed successfully")
    click.echo(f"📄 Exported {len(items)} items to {file_path}")


def import_from_text(client, file_path: Path) -> List[str]:
    """
    Import shopping list items from a text file.

    Args:
        client: Meijer client instance (not used, but kept for consistency)
        file_path: Path to import file

    Returns:
        List[str]: List of item names
    """
    logger = logging.getLogger(__name__)
    logger.debug(f"Importing items from text file: {file_path}")

    items = []
    with open(file_path, "r", encoding="utf-8") as f:
        for line_num, line in enumerate(f, 1):
            line = line.strip()
            if line and not line.startswith("#"):
                logger.debug(f"Importing line {line_num}: {line}")
                items.append(line)

    logger.debug(f"Text import completed. Found {len(items)} items")
    return items


def import_from_csv(client, file_path: Path) -> List[tuple]:
    """
    Import shopping list items from a CSV file.

    Args:
        client: Meijer client instance (not used, but kept for consistency)
        file_path: Path to import file

    Returns:
        List[tuple]: List of (name, quantity, notes) tuples
    """
    logger = logging.getLogger(__name__)
    logger.debug(f"Importing items from CSV file: {file_path}")

    import csv

    items = []
    with open(file_path, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for row_num, row in enumerate(reader, 1):
            name = row.get("Item", "").strip()
            quantity = int(row.get("Quantity", 1))
            notes = row.get("Notes", "").strip()

            if name:
                logger.debug(
                    f"Importing CSV row {row_num}: {name}, quantity: {quantity}"
                )
                items.append((name, quantity, notes))

    logger.debug(f"CSV import completed. Found {len(items)} items")
    return items


def import_from_json(client, file_path: Path) -> List[tuple]:
    """
    Import shopping list items from a JSON file.

    Args:
        client: Meijer client instance (not used, but kept for consistency)
        file_path: Path to import file

    Returns:
        List[tuple]: List of (name, quantity, notes) tuples
    """
    logger = logging.getLogger(__name__)
    logger.debug(f"Importing items from JSON file: {file_path}")

    import json

    with open(file_path, "r", encoding="utf-8") as f:
        data = json.load(f)

    items = []
    for item in data.get("items", []):
        name = item.get("name", "").strip()
        quantity = int(item.get("quantity", 1))
        notes = item.get("notes", "").strip()

        if name:
            logger.debug(f"Importing JSON item: {name}, quantity: {quantity}")
            items.append((name, quantity, notes))

    logger.debug(f"JSON import completed. Found {len(items)} items")
    return items


def import_from_excel(client, file_path: Path) -> List[tuple]:
    """
    Import shopping list items from an Excel file.

    Args:
        client: Meijer client instance (not used, but kept for consistency)
        file_path: Path to import file

    Returns:
        List[tuple]: List of (name, quantity, notes) tuples
    """
    logger = logging.getLogger(__name__)
    logger.debug(f"Importing items from Excel file: {file_path}")

    try:
        import openpyxl
    except ImportError:
        raise ImportError(
            "openpyxl is required for Excel import. Install with: pip install openpyxl"
        )

    items = []
    workbook = openpyxl.load_workbook(file_path)

    # Try to find the first sheet with data
    sheet = None
    for sheet_name in workbook.sheetnames:
        ws = workbook[sheet_name]
        if ws.max_row > 1:  # More than just headers
            sheet = ws
            break

    if not sheet:
        logger.warning("No data found in Excel file")
        return items

    # Look for headers in the first row
    headers = []
    for col in range(1, sheet.max_column + 1):
        cell_value = sheet.cell(row=1, column=col).value
        if cell_value:
            headers.append(str(cell_value).strip().lower())
        else:
            headers.append("")

    # Find column indices
    name_col = None
    quantity_col = None
    notes_col = None

    for i, header in enumerate(headers):
        if "item" in header or "name" in header:
            name_col = i + 1
        elif "quantity" in header or "qty" in header:
            quantity_col = i + 1
        elif "notes" in header or "note" in header:
            notes_col = i + 1

    # If we can't find specific headers, assume first column is name
    if name_col is None:
        name_col = 1

    # Read data rows
    for row_num in range(2, sheet.max_row + 1):
        name = sheet.cell(row=row_num, column=name_col).value
        if name and str(name).strip():
            name = str(name).strip()

            # Get quantity (default to 1 if not found)
            quantity = 1
            if quantity_col:
                qty_value = sheet.cell(row=row_num, column=quantity_col).value
                if qty_value is not None:
                    try:
                        quantity = int(qty_value)
                    except (ValueError, TypeError):
                        quantity = 1

            # Get notes
            notes = ""
            if notes_col:
                notes_value = sheet.cell(row=row_num, column=notes_col).value
                if notes_value:
                    notes = str(notes_value).strip()

            logger.debug(f"Importing Excel row {row_num}: {name}, quantity: {quantity}")
            items.append((name, quantity, notes))

    workbook.close()
    logger.debug(f"Excel import completed. Found {len(items)} items")
    return items


def estimate_list_cost(
    client,
    items,
    store_id: Optional[str] = None,
    include_location: bool = True,
    include_matched: bool = True,
    preferred_methods: Optional[List[str]] = None,
) -> List[Dict[str, Any]]:
    """
    Estimate costs for shopping list items using multiple methods.

    Methods tried in order of preference:
    1. Cart: Add items to cart and get real subtotal (most accurate)
    2. Shop & Scan: Use Shop & Scan API for pricing
    3. Search: Text search with product matching
    4. Keywords: Fallback keyword-based estimation

    Args:
        client: Meijer client instance
        items: List of shopping list items
        store_id: Store ID for location lookup
        include_location: Whether to include location information
        include_matched: Whether to include matched product information
        preferred_methods: List of preferred methods in order (e.g., ['cart', 'shop_scan', 'search'])

    Returns:
        List of dictionaries with cost estimation data including methodology
    """
    logger = logging.getLogger(__name__)
    logger.debug(f"Estimating costs for {len(items)} items using multiple methods")

    if not store_id:
        # Try to get store ID from current context
        try:
            stores = client.get_stores()
            if stores:
                store_id = str(stores[0].store_id)
            else:
                store_id = "217"  # Default store from logs
        except Exception as e:
            logger.warning(f"⚠️  Failed to get stores: {e}")
            store_id = "217"  # Default store from logs

    logger.info(f"🔍 Using store ID: {store_id} for cost estimation")

    # Define method preferences - search first to get UPC, then cart methods
    if preferred_methods is None:
        preferred_methods = ["search_then_cart"]

    cost_data = []

    for item in items:
        try:
            item_name = getattr(
                item, "name", getattr(item, "item_description", "Unknown")
            )
            quantity = getattr(item, "quantity", 1)

            logger.debug(f"🔍 Processing item: {item_name}")

            # Initialize cost data for this item
            item_cost_data = {
                "name": item_name,
                "quantity": quantity,
                "estimated_cost": 0.0,
                "matched_product": "",
                "location": "",
                "match_confidence": "Low",
                "methodology": "Unknown",
                "method_details": "",
            }

            # New workflow: Search first to get UPC, then try cart methods with that UPC
            cost_found = False

            print(f"🔍 Starting new search-first workflow for '{item_name}'")
            logger.info(f"🔍 Starting new search-first workflow for '{item_name}'")

            try:
                # Step 1: Search to get UPC and initial price
                print(f"🔍 Step 1: Searching for '{item_name}' to get UPC and price...")
                search_upc, search_price, search_product, search_location = (
                    _search_for_product(client, item, store_id, include_location)
                )
                print(
                    f"🔍 Search results: UPC={search_upc}, Price={search_price}, Product='{search_product}', Location='{search_location}'"
                )

                if search_upc:
                    print(f"🔍 Found UPC from search: {search_upc}")
                    logger.info(f"🔍 Found UPC from search: {search_upc}")

                    # Step 2: Try cart methods with the UPC
                    print(f"🔍 Step 2: Trying cart methods with UPC {search_upc}...")

                    # Try Shop & Scan first
                    print(f"🔍 Calling Shop & Scan method with UPC {search_upc}...")
                    cart_price = _try_shop_scan_with_upc(client, search_upc, store_id)
                    print(f"🔍 Shop & Scan returned: {cart_price}")
                    if cart_price:
                        print(f"🔍 Got Shop & Scan price: ${cart_price:.2f}")
                        item_cost_data["estimated_cost"] = cart_price
                        item_cost_data["methodology"] = "shop_scan"
                        item_cost_data["method_details"] = (
                            f"Shop & Scan via search UPC {search_upc}"
                        )
                        item_cost_data["match_confidence"] = "High"
                        cost_found = True
                    else:
                        # Try regular cart method
                        cart_price = _try_cart_with_upc(
                            client, search_upc, store_id, quantity
                        )
                        if cart_price:
                            print(f"🔍 Got cart price: ${cart_price:.2f}")
                            item_cost_data["estimated_cost"] = cart_price
                            item_cost_data["methodology"] = "cart"
                            item_cost_data["method_details"] = (
                                f"Cart via search UPC {search_upc}"
                            )
                            item_cost_data["match_confidence"] = "High"
                            cost_found = True

                    # Step 3: Use search data for product info and location
                    if search_product:
                        item_cost_data["matched_product"] = search_product
                    if search_location:
                        item_cost_data["location"] = search_location

                    # Step 4: Fall back to search price if cart methods failed
                    if not cost_found and search_price:
                        print(f"🔍 Falling back to search price: ${search_price:.2f}")
                        item_cost_data["estimated_cost"] = search_price
                        item_cost_data["methodology"] = "search"
                        item_cost_data["method_details"] = (
                            f"Search result price for UPC {search_upc}"
                        )
                        item_cost_data["match_confidence"] = "Medium"
                        cost_found = True

                    if cost_found:
                        logger.info(
                            f"✅ Found cost for {item_name}: ${item_cost_data['estimated_cost']:.2f} via {item_cost_data['methodology']}"
                        )
                else:
                    print(f"🔍 No UPC found in search results for '{item_name}'")
                    logger.info(f"🔍 No UPC found in search results for '{item_name}'")

            except Exception as e:
                logger.error(
                    f"❌ Error in search-first workflow for '{item_name}': {e}"
                )
                print(f"❌ Error in search-first workflow for '{item_name}': {e}")

            # If no method worked, set to N/A
            if not cost_found:
                item_cost_data["estimated_cost"] = 0.0
                item_cost_data["methodology"] = "unavailable"
                item_cost_data["method_details"] = "No pricing method available"
                item_cost_data["match_confidence"] = "None"
                logger.info(
                    f"⚠️  No pricing method available for {item_name}, setting to N/A"
                )

            cost_data.append(item_cost_data)

        except Exception as e:
            logger.error(f"❌ Error processing item '{item_name}': {e}")
            logger.error(f"❌ Exception details: {type(e).__name__}: {str(e)}")
            import traceback

            logger.error(f"❌ Traceback: {traceback.format_exc()}")
            # Add error item with default values
            cost_data.append(
                {
                    "name": getattr(
                        item, "name", getattr(item, "item_description", "Unknown")
                    ),
                    "quantity": getattr(item, "quantity", 1),
                    "estimated_cost": 0.0,
                    "matched_product": "Error processing item",
                    "location": "Error",
                    "match_confidence": "Error",
                    "methodology": "error",
                    "method_details": f"Failed to process: {str(e)}",
                }
            )

    logger.info(f"✅ Cost estimation complete for {len(cost_data)} items")

    # Log summary of method usage
    methodology_counts = {}
    for item in cost_data:
        methodology = item.get("methodology", "Unknown")
        methodology_counts[methodology] = methodology_counts.get(methodology, 0) + 1

    logger.info("📊 Method usage summary:")
    for methodology, count in methodology_counts.items():
        logger.info(f"   {methodology}: {count} item(s)")

    return cost_data


def _search_for_product(client, item, store_id: str, include_location: bool) -> tuple:
    """
    Search for a product to get UPC, price, product name, and location.

    Returns:
        tuple: (upc, price, product_name, location)
    """
    logger = logging.getLogger(__name__)

    try:
        item_name = getattr(item, "name", getattr(item, "item_description", "Unknown"))
        search_query = item_name.split(",")[0].strip()

        from ..search import Search

        search_client = Search(client)

        search_results = search_client.search(
            query=search_query, results_per_page=3, store_id=store_id
        )

        if search_results and search_results.results:
            top_result = search_results.results[0]

            # Extract UPC
            upc = None
            if hasattr(top_result, "ean") and top_result.ean:
                upc = str(top_result.ean)
            elif hasattr(top_result, "upc") and top_result.upc:
                upc = str(top_result.upc)

            # Extract price
            price = None
            if hasattr(top_result, "price") and top_result.price:
                price = float(top_result.price)

            # Extract product name
            product_name = getattr(top_result, "title", "")

            # Extract location from group_ids
            location = ""
            if include_location and hasattr(top_result, "raw_data"):
                raw_data = top_result.raw_data
                if "data" in raw_data and "group_ids" in raw_data["data"]:
                    group_ids = raw_data["data"]["group_ids"]
                    l3_groups = [g for g in group_ids if g.startswith("L3-")]
                    if l3_groups:
                        location = l3_groups[0]

            return upc, price, product_name, location

    except Exception as e:
        logger.debug(f"Search failed: {e}")

    return None, None, None, None


def _try_shop_scan_with_upc(client, upc: str, store_id: str) -> Optional[float]:
    """
    Try to get price using Shop & Scan functionality.

    The Shop & Scan methods now automatically manage sessions via decorators.

    Returns:
        Optional[float]: Unit price if found, None otherwise
    """
    logger = logging.getLogger(__name__)

    try:
        # Check if Shop & Scan is available
        if not hasattr(client, "shop_scan"):
            logger.debug("Shop & Scan not available")
            return None

        # Validate UPC format
        if not upc:
            logger.debug(f"Invalid UPC format: {upc}")
            return None

        # Convert UPC to string and validate format
        upc_str = str(upc)
        if not upc_str.startswith(("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")):
            logger.debug(f"Invalid UPC format: {upc_str}")
            return None

        logger.info(f"📱 Shop & Scan: Testing UPC {upc}...")

        # Step 1: Add multiple items to get accurate pricing (helps with sales/BOGO)
        test_quantity = 10  # Use 10 items to get accurate unit pricing
        print(f"📱 Adding {test_quantity} items with UPC {upc} to Shop & Scan cart...")
        logger.debug(
            f"📱 Adding {test_quantity} items with UPC {upc} to Shop & Scan cart..."
        )

        # The decorator will automatically start a session if needed
        if not client.shop_scan.add_to_cart(upc, test_quantity, store_id):
            print(f"📱 Failed to add UPC {upc} to Shop & Scan cart")
            logger.debug(f"📱 Failed to add UPC {upc} to Shop & Scan cart")
            return None

        # Step 2: Get detailed cart information to extract pricing
        print("📱 Getting detailed cart information...")
        logger.debug("📱 Getting detailed cart information...")
        cart_data = client.shop_scan.get_cart_detailed(store_id)

        if not cart_data:
            print("📱 Failed to get cart details")
            logger.debug("📱 Failed to get cart details")
            return None

        # Step 3: Extract pricing information from cart
        total_price = None
        actual_quantity = None

        # Try to extract pricing from various cart data structures
        if "total" in cart_data:
            total_price = float(cart_data["total"])
        elif "subtotal" in cart_data:
            total_price = float(cart_data["subtotal"])
        elif "cartTotals" in cart_data:
            # Shop & Scan specific structure
            cart_totals = cart_data["cartTotals"]
            if "cartNowTotal" in cart_totals:
                total_price = float(cart_totals["cartNowTotal"])
        elif "items" in cart_data and cart_data["items"]:
            # Extract from items
            for cart_item in cart_data["items"]:
                if "price" in cart_item and "quantity" in cart_item:
                    total_price = float(cart_item["price"]) * int(cart_item["quantity"])
                    actual_quantity = int(cart_item["quantity"])
                    break

        # Step 4: Calculate unit price
        unit_price = None
        if total_price is not None and total_price > 0:
            unit_price = total_price / (actual_quantity or test_quantity)
            print(
                f"📱 Got total price: ${total_price:.2f} for {test_quantity} items = ${unit_price:.2f} each"
            )
            logger.info(
                f"✅ Shop & Scan succeeded for UPC {upc}: ${unit_price:.2f} (from {test_quantity} items @ ${total_price:.2f} total)"
            )

        # Step 5: Clean up - remove items from cart
        print("📱 Cleaning up Shop & Scan cart...")
        logger.debug("📱 Cleaning up Shop & Scan cart...")
        client.shop_scan.remove_from_cart(upc, store_id)

        # End the session to clean up
        client.shop_scan.end_session()

        return unit_price

    except Exception as e:
        print(f"📱 Shop & Scan failed for UPC {upc}: {e}")
        logger.debug(f"📱 Shop & Scan failed for UPC {upc}: {e}")
        # Try to end session even if there was an error
        try:
            if hasattr(client, "shop_scan"):
                client.shop_scan.end_session()
        except:
            pass
        return None


def _try_cart_with_upc(
    client, upc: str, store_id: str, quantity: int
) -> Optional[float]:
    """
    Try to get price by adding UPC to cart and checking cost difference.

    Returns:
        Optional[float]: Unit price if found, None otherwise
    """
    logger = logging.getLogger(__name__)

    try:
        if not hasattr(client, "cart") or not hasattr(client.cart, "add_item_by_upc"):
            return None

        # Get initial cart subtotal
        try:
            current_cart = client.cart.get_current_cart()
            initial_subtotal = client.cart.subtotal
        except Exception as e:
            logger.debug(f"Cannot access cart: {e}")
            return None

        # Add item to cart
        success = client.cart.add_item_by_upc(upc, quantity)
        if success:
            # Get updated cart to see new subtotal
            updated_cart = client.cart.get_current_cart()
            new_subtotal = client.cart.subtotal

            # Calculate cost difference
            cost_difference = new_subtotal - initial_subtotal
            if cost_difference > 0:
                unit_cost = cost_difference / quantity

                # Remove item from cart to restore original state
                try:
                    cart_items = client.cart.items
                    for cart_item in cart_items:
                        if cart_item.product_code == upc:
                            client.cart.remove_item(cart_item.entry_number)
                            break
                except Exception:
                    logger.warning("⚠️  Failed to remove test item from cart")

                return unit_cost

    except Exception as e:
        logger.debug(f"Cart method failed for UPC {upc}: {e}")

    return None


def _try_cart_method(
    client, item, item_cost_data: Dict[str, Any], store_id: str, include_location: bool
) -> bool:
    """
    Try to get cost by adding item to cart and checking subtotal.

    Returns:
        bool: True if cost was found, False otherwise
    """
    logger = logging.getLogger(__name__)

    try:
        # Check if cart functionality is available
        if not hasattr(client, "cart") or not hasattr(client.cart, "add_item_by_upc"):
            logger.debug("🛒 Cart method skipped: cart functionality not available")
            return False

        # Check if cart is accessible
        try:
            current_cart = client.cart.get_current_cart()
            initial_subtotal = client.cart.subtotal
        except Exception as e:
            logger.debug(f"🛒 Cart method skipped: cannot access cart ({e})")
            return False

        # Try to add the item to cart
        item_name = getattr(item, "name", getattr(item, "item_description", "Unknown"))
        quantity = getattr(item, "quantity", 1)

        # If we have a UPC, use it; otherwise try to search for one
        upc = None
        if hasattr(item, "item_part_number") and item.item_part_number:
            upc = item.item_part_number
            if not upc.startswith(("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")):
                upc = None

        if not upc:
            # Try to find UPC via search
            try:
                from ..search import Search

                search_client = Search(client)
                search_results = search_client.search(
                    item_name, results_per_page=1, store_id=store_id
                )
                if (
                    search_results
                    and search_results.results
                    and hasattr(search_results.results[0], "ean")
                ):
                    upc = str(
                        search_results.results[0].ean
                    )  # Constructor.io uses 'ean' field
            except Exception:
                pass

        if not upc:
            logger.debug(f"🛒 Cart method skipped: no UPC available for '{item_name}'")
            logger.info(f"🛒 Cart method failed for '{item_name}': no UPC available")
            return False

        logger.debug(f"🛒 Attempting to add '{item_name}' (UPC: {upc}) to cart...")

        # Add item to cart
        success = client.cart.add_item_by_upc(upc, quantity)
        if success:
            # Get updated cart to see new subtotal
            updated_cart = client.cart.get_current_cart()
            new_subtotal = client.cart.subtotal

            # Calculate cost difference
            cost_difference = new_subtotal - initial_subtotal
            if cost_difference > 0:
                # Calculate per-unit cost
                unit_cost = cost_difference / quantity
                item_cost_data["estimated_cost"] = unit_cost
                item_cost_data["methodology"] = "cart"
                item_cost_data["method_details"] = (
                    f"Added to cart via UPC {upc}, cost difference: ${cost_difference:.2f}"
                )
                item_cost_data["match_confidence"] = "High"

                # Get product details for location and matching
                if include_location:
                    try:
                        product_detail = client.get_product_detail(upc, store_id)
                        if product_detail and hasattr(product_detail, "aisle_primary"):
                            aisle = getattr(product_detail, "aisle_primary", "")
                            section = getattr(product_detail, "section", "")
                            bay = getattr(product_detail, "bay", "")

                            if aisle:
                                if section and bay:
                                    item_cost_data["location"] = (
                                        f"{aisle}:{section}-{bay}"
                                    )
                                elif section:
                                    item_cost_data["location"] = f"{aisle}:{section}"
                                else:
                                    item_cost_data["location"] = aisle
                    except Exception:
                        pass

                # Remove item from cart to restore original state
                try:
                    # Find the item we just added and remove it
                    cart_items = client.cart.items
                    for cart_item in cart_items:
                        if cart_item.product_code == upc:
                            client.cart.remove_item(cart_item.entry_number)
                            break
                except Exception:
                    logger.warning("⚠️  Failed to remove test item from cart")

                logger.info(
                    f"✅ Cart method succeeded for '{item_name}': ${unit_cost:.2f}"
                )
                return True
            else:
                logger.debug(
                    f"🛒 Cart method failed: no cost difference detected for '{item_name}'"
                )
        else:
            logger.debug(f"🛒 Cart method failed: could not add '{item_name}' to cart")

        return False

    except Exception as e:
        logger.debug(f"🛒 Cart method failed for '{item_name}': {e}")
        return False


def _try_shop_scan_method(
    client,
    item,
    item_cost_data: Dict[str, Any],
    store_id: str,
    include_location: bool,
    upc: str = None,
) -> bool:
    """
    Try to get cost using Shop & Scan cart functionality.

    Creates a new Shop & Scan cart, adds the product, gets the price, then cleans up.

    Returns:
        bool: True if cost was found, False otherwise
    """
    logger = logging.getLogger(__name__)

    try:
        # Check if Shop & Scan is available
        if not hasattr(client, "shop_scan"):
            logger.debug("Shop & Scan not available")
            return False

        item_name = getattr(item, "name", getattr(item, "item_description", "Unknown"))

        # Get UPC from parameter or try to extract from item
        if not upc:
            if hasattr(item, "item_part_number") and item.item_part_number:
                upc = item.item_part_number
            else:
                logger.debug(
                    f"📱 Shop & Scan skipped: no UPC available for '{item_name}'"
                )
                return False

        # Validate UPC format
        if not upc or not upc.startswith(
            ("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
        ):
            logger.debug(
                f"📱 Shop & Scan skipped: invalid UPC format '{upc}' for '{item_name}'"
            )
            return False

        logger.info(f"📱 Shop & Scan: Testing UPC {upc} for '{item_name}'...")

        # Step 1: Clear the Shop & Scan cart to start fresh
        logger.debug("📱 Clearing Shop & Scan cart...")
        if not client.shop_scan.clear_cart(store_id):
            logger.debug("📱 Failed to clear Shop & Scan cart")
            return False

        # Step 2: Add multiple items to get accurate pricing (helps with sales/BOGO)
        test_quantity = 10  # Use 10 items to get accurate unit pricing
        logger.debug(
            f"📱 Adding {test_quantity} items with UPC {upc} to Shop & Scan cart..."
        )

        if not client.shop_scan.add_to_cart(upc, test_quantity, store_id):
            logger.debug(f"📱 Failed to add UPC {upc} to Shop & Scan cart")
            return False

        # Step 3: Get detailed cart information to extract pricing
        logger.debug("📱 Getting detailed cart information...")
        cart_data = client.shop_scan.get_cart_detailed(store_id)

        if not cart_data:
            logger.debug("📱 Failed to get cart details")
            # Clean up before returning
            client.shop_scan.clear_cart(store_id)
            return False

        # Step 4: Extract pricing information from cart
        total_price = None
        actual_quantity = None
        product_name = None

        # Try to extract pricing from various cart data structures
        if "total" in cart_data:
            total_price = float(cart_data["total"])
        elif "subtotal" in cart_data:
            total_price = float(cart_data["subtotal"])
        elif "items" in cart_data and cart_data["items"]:
            # Extract from items
            for cart_item in cart_data["items"]:
                if "price" in cart_item and "quantity" in cart_item:
                    total_price = float(cart_item["price"]) * int(cart_item["quantity"])
                    actual_quantity = int(cart_item["quantity"])
                    if "name" in cart_item:
                        product_name = cart_item["name"]
                    break

        # Step 5: Calculate unit price
        if total_price is not None and total_price > 0:
            unit_price = total_price / (actual_quantity or test_quantity)

            item_cost_data["estimated_cost"] = unit_price
            item_cost_data["matched_product"] = product_name or item_name
            item_cost_data["methodology"] = "shop_scan"
            item_cost_data["method_details"] = (
                f"Shop & Scan cart: {test_quantity} items @ ${total_price:.2f} total = ${unit_price:.2f} each"
            )
            item_cost_data["match_confidence"] = "High"

            # Try to get location information
            if include_location:
                try:
                    product_detail = client.get_product_detail(upc, store_id)
                    if product_detail and hasattr(product_detail, "aisle_primary"):
                        aisle = getattr(product_detail, "aisle_primary", "")
                        section = getattr(product_detail, "section", "")
                        bay = getattr(product_detail, "bay", "")

                        if aisle:
                            if section and bay:
                                item_cost_data["location"] = f"{aisle}:{section}-{bay}"
                            elif section:
                                item_cost_data["location"] = f"{aisle}:{section}"
                            else:
                                item_cost_data["location"] = aisle
                except Exception:
                    pass

            # Step 6: Clean up - clear the cart
            logger.debug("📱 Cleaning up Shop & Scan cart...")
            client.shop_scan.clear_cart(store_id)

            logger.info(
                f"✅ Shop & Scan succeeded for '{item_name}': ${unit_price:.2f}"
            )
            return True
        else:
            logger.debug(
                f"📱 No pricing information found in cart data for '{item_name}'"
            )
            # Clean up before returning
            client.shop_scan.clear_cart(store_id)
            return False

    except Exception as e:
        logger.debug(f"📱 Shop & Scan method failed for '{item_name}': {e}")
        # Try to clean up even if there was an error
        try:
            if hasattr(client, "shop_scan"):
                client.shop_scan.clear_cart(store_id)
        except:
            pass
        return False


def _try_search_method(
    client, item, item_cost_data: Dict[str, Any], store_id: str, include_location: bool
) -> bool:
    """
    Try to get cost using text search and product matching.

    Returns:
        bool: True if cost was found, False otherwise
    """
    try:
        item_name = getattr(item, "name", getattr(item, "item_description", "Unknown"))

        # Clean up search query - remove common prefixes/suffixes
        search_query = item_name.split(",")[0].strip()

        # Initialize search client
        try:
            from ..search import Search

            search_client = Search(client)

            # Search for the item
            search_results = search_client.search(
                query=search_query, results_per_page=3, store_id=store_id
            )

            if search_results and search_results.results:
                # Found search results - use the best match
                top_result = search_results.results[0]

                # Try multiple ways to get the UPC - ALWAYS return as string
                upc = None
                if hasattr(top_result, "ean") and top_result.ean:
                    upc = str(top_result.ean)  # Constructor.io uses 'ean' field for UPC
                elif hasattr(top_result, "upc") and top_result.upc:
                    upc = str(top_result.upc)
                elif hasattr(top_result, "product_code") and top_result.product_code:
                    upc = str(top_result.product_code)
                elif hasattr(top_result, "raw_data") and top_result.raw_data:
                    # Try to extract UPC from raw data
                    raw_data = top_result.raw_data
                    if "data" in raw_data and "ean" in raw_data["data"]:
                        upc = str(raw_data["data"]["ean"])
                    elif "data" in raw_data and "product_code" in raw_data["data"]:
                        upc = str(raw_data["data"]["product_code"])
                    elif "data" in raw_data and "upc" in raw_data["data"]:
                        upc = str(raw_data["data"]["upc"])

                logger.debug(f"🔍 Extracted UPC: {upc}")
                logger.debug(f"🔍 Search result attributes: {dir(top_result)}")
                logger.debug(
                    f"🔍 Search result ean: {getattr(top_result, 'ean', 'N/A')}"
                )
                logger.debug(
                    f"🔍 Search result upc: {getattr(top_result, 'upc', 'N/A')}"
                )
                logger.debug(
                    f"🔍 Search result price: {getattr(top_result, 'price', 'N/A')}"
                )

                # Try to get product detail if we have a UPC
                if upc:
                    try:
                        product_detail = client.get_product_detail(upc, store_id)
                        if (
                            product_detail
                            and hasattr(product_detail, "price")
                            and product_detail.price
                        ):
                            item_cost_data["estimated_cost"] = float(
                                product_detail.price
                            )
                            item_cost_data["matched_product"] = getattr(
                                product_detail, "title", top_result.title
                            )
                            item_cost_data["methodology"] = "search"
                            item_cost_data["method_details"] = (
                                f"Text search: '{search_query}' -> UPC {top_result.upc}"
                            )
                            item_cost_data["match_confidence"] = "Medium"

                            if include_location and hasattr(
                                product_detail, "aisle_primary"
                            ):
                                aisle = getattr(product_detail, "aisle_primary", "")
                                section = getattr(product_detail, "section", "")
                                bay = getattr(product_detail, "bay", "")

                                if aisle:
                                    if section and bay:
                                        item_cost_data["location"] = (
                                            f"{aisle}:{section}-{bay}"
                                        )
                                    elif section:
                                        item_cost_data["location"] = (
                                            f"{aisle}:{section}"
                                        )
                                    else:
                                        item_cost_data["location"] = aisle

                            return True
                    except Exception as e:
                        logger.debug(
                            f"Product detail search failed for {top_result.upc}: {e}"
                        )

                # Use search result directly if product detail failed but we have price
                if hasattr(top_result, "price") and top_result.price:
                    item_cost_data["estimated_cost"] = float(top_result.price)
                    item_cost_data["matched_product"] = top_result.title
                    item_cost_data["methodology"] = "search"
                    item_cost_data["method_details"] = (
                        f"Text search result: '{search_query}' -> UPC {upc or 'N/A'}"
                    )
                    item_cost_data["match_confidence"] = "Medium"

                    if include_location and hasattr(top_result, "raw_data"):
                        # Try to extract location from search result data
                        raw_data = top_result.raw_data
                        if "data" in raw_data and "group_ids" in raw_data["data"]:
                            group_ids = raw_data["data"]["group_ids"]
                            l3_groups = [g for g in group_ids if g.startswith("L3-")]
                            if l3_groups:
                                item_cost_data["location"] = l3_groups[0]

                    return True

                # If we have a UPC but no price, still mark as found but with N/A price
                if upc:
                    item_cost_data["estimated_cost"] = 0.0  # N/A
                    item_cost_data["matched_product"] = top_result.title
                    item_cost_data["methodology"] = "search"
                    item_cost_data["method_details"] = (
                        f"Text search found product but no price: '{search_query}' -> UPC {upc}"
                    )
                    item_cost_data["match_confidence"] = "Medium"

                    if include_location and hasattr(top_result, "raw_data"):
                        # Try to extract location from search result data
                        raw_data = top_result.raw_data
                        if "data" in raw_data and "group_ids" in raw_data["data"]:
                            group_ids = raw_data["data"]["group_ids"]
                            l3_groups = [g for g in group_ids if g.startswith("L3-")]
                            if l3_groups:
                                item_cost_data["location"] = l3_groups[0]

                    return True

        except ImportError:
            logger.warning("⚠️  Search functionality not available")

        return False

    except Exception as e:
        logger.debug(f"Search method failed: {e}")
        return False


def _try_keyword_method(item, item_cost_data: Dict[str, Any]) -> bool:
    """
    Try to get cost using keyword-based estimation.

    Returns:
        bool: True if cost was found, False otherwise
    """
    try:
        item_name = getattr(item, "name", getattr(item, "item_description", "Unknown"))
        estimated_cost = _estimate_cost_by_keywords(item_name)

        if estimated_cost > 0:
            item_cost_data["estimated_cost"] = estimated_cost
            item_cost_data["methodology"] = "keywords"
            item_cost_data["method_details"] = "Keyword-based category estimation"
            item_cost_data["match_confidence"] = "Low"
            return True

        return False

    except Exception as e:
        logger.debug(f"Keyword method failed: {e}")
        return False


def _estimate_cost_by_keywords(item_name: str) -> float:
    """
    Estimate cost based on item name keywords.

    Args:
        item_name: Name of the item

    Returns:
        Estimated cost in dollars
    """
    item_lower = item_name.lower()

    # Food categories with typical price ranges
    if any(word in item_lower for word in ["milk", "cheese", "yogurt", "cream"]):
        return 4.99  # Dairy products
    elif any(word in item_lower for word in ["chicken", "beef", "pork", "meat"]):
        return 8.99  # Meat products
    elif any(word in item_lower for word in ["apple", "banana", "orange", "fruit"]):
        return 3.99  # Fresh fruit
    elif any(word in item_lower for word in ["potato", "onion", "carrot", "vegetable"]):
        return 2.99  # Fresh vegetables
    elif any(word in item_lower for word in ["bread", "bun", "roll"]):
        return 3.49  # Bread products
    elif any(word in item_lower for word in ["cereal", "oatmeal"]):
        return 4.49  # Breakfast cereals
    elif any(word in item_lower for word in ["soup", "broth"]):
        return 2.49  # Canned soups
    elif any(word in item_lower for word in ["pasta", "noodle", "spaghetti"]):
        return 1.99  # Pasta products
    elif any(word in item_lower for word in ["sauce", "ketchup", "mustard"]):
        return 2.99  # Condiments
    elif any(word in item_lower for word in ["chips", "crackers", "snack"]):
        return 3.99  # Snack foods
    elif any(word in item_lower for word in ["soda", "pop", "drink", "beverage"]):
        return 5.99  # Beverages
    elif any(word in item_lower for word in ["toothpaste", "soap", "shampoo"]):
        return 4.99  # Personal care
    elif any(word in item_lower for word in ["paper", "towel", "tissue"]):
        return 6.99  # Paper products
    else:
        return 5.99  # Default estimate for unknown items


def export_cost_estimate_to_csv(
    cost_data: List[Dict[str, Any]],
    file_path: str,
    include_location: bool = True,
    include_matched: bool = True,
) -> None:
    """
    Export cost estimate data to CSV file.

    Args:
        cost_data: List of cost estimation data
        file_path: Path to export file
        include_location: Whether to include location column
        include_matched: Whether to include matched product column
    """
    logger = logging.getLogger(__name__)
    logger.debug(f"Exporting cost estimate to CSV: {file_path}")

    import csv

    with open(file_path, "w", newline="", encoding="utf-8") as f:
        writer = csv.writer(f)

        # Build headers
        headers = [
            "List Item",
            "Quantity",
            "Estimated Cost",
            "Total Cost",
            "Methodology",
        ]
        if include_matched:
            headers.insert(1, "Matched Item")
        if include_location:
            headers.append("Location")

        writer.writerow(headers)

        # Write data rows
        for item in cost_data:
            row = [
                item["name"],
                item["quantity"],
                f"${item['estimated_cost']:.2f}",
                f"${item['estimated_cost'] * item['quantity']:.2f}",
            ]

            if include_matched:
                row.insert(1, item.get("matched_product", ""))
            if include_location:
                row.append(item.get("location", ""))

            writer.writerow(row)

        # Add total row
        total_cost = sum(
            item["estimated_cost"] * item["quantity"] for item in cost_data
        )
        total_row = [
            "TOTAL",
            "",
            "",
            f"${total_cost:.2f}",
            "",
        ]  # Added methodology for total row
        if include_matched:
            total_row.insert(1, "")
        if include_location:
            total_row.append("")

        writer.writerow([])  # Empty row
        writer.writerow(total_row)

    logger.debug("CSV export completed successfully")
    click.echo(f"📊 Exported cost estimate to CSV: {file_path}")


def export_cost_estimate_to_excel(
    cost_data: List[Dict[str, Any]],
    file_path: str,
    include_location: bool = True,
    include_matched: bool = True,
) -> None:
    """
    Export cost estimate data to Excel file with formatting and checkboxes.

    Args:
        cost_data: List of cost estimation data
        file_path: Path to export file
        include_location: Whether to include location column
        include_matched: Whether to include matched product column
    """
    logger = logging.getLogger(__name__)
    logger.debug(f"Exporting cost estimate to Excel: {file_path}")

    try:
        from openpyxl import Workbook
        from openpyxl.styles import Alignment, Border, Font, PatternFill, Side
        from openpyxl.utils import get_column_letter
    except ImportError:
        raise click.ClickException(
            "❌ openpyxl is required for Excel export. Install with: pip install openpyxl"
        )

    # Create workbook and worksheet
    wb = Workbook()
    ws = wb.active
    ws.title = "Shopping List Cost Estimate"

    # Define styles
    header_font = Font(bold=True, color="FFFFFF")
    header_fill = PatternFill(
        start_color="366092", end_color="366092", fill_type="solid"
    )
    header_alignment = Alignment(horizontal="center", vertical="center")

    total_font = Font(bold=True, color="FFFFFF")
    total_fill = PatternFill(
        start_color="C0504D", end_color="C0504D", fill_type="solid"
    )
    total_alignment = Alignment(horizontal="center", vertical="center")

    border = Border(
        left=Side(style="thin"),
        right=Side(style="thin"),
        top=Side(style="thin"),
        bottom=Side(style="thin"),
    )

    # Build headers
    headers = [
        "☐",
        "List Item",
        "Quantity",
        "Estimated Cost",
        "Total Cost",
        "Methodology",
    ]
    if include_matched:
        headers.insert(2, "Matched Item")
    if include_location:
        headers.append("Location")

    # Write headers
    for col, header in enumerate(headers, 1):
        cell = ws.cell(row=1, column=col, value=header)
        cell.font = header_font
        cell.fill = header_fill
        cell.alignment = header_alignment
        cell.border = border

    # Write data rows
    for row_idx, item in enumerate(cost_data, 2):
        col = 1

        # Checkbox column (☐ for unchecked)
        ws.cell(row=row_idx, column=col, value="☐").border = border
        col += 1

        # List Item
        ws.cell(row=row_idx, column=col, value=item["name"]).border = border
        col += 1

        # Matched Item (if included)
        if include_matched:
            ws.cell(
                row=row_idx, column=col, value=item.get("matched_product", "")
            ).border = border
            col += 1

        # Quantity
        ws.cell(row=row_idx, column=col, value=item["quantity"]).border = border
        col += 1

        # Estimated Cost
        ws.cell(
            row=row_idx, column=col, value=f"${item['estimated_cost']:.2f}"
        ).border = border
        col += 1

        # Total Cost
        ws.cell(
            row=row_idx,
            column=col,
            value=f"${item['estimated_cost'] * item['quantity']:.2f}",
        ).border = border
        col += 1

        # Methodology
        ws.cell(
            row=row_idx, column=col, value=item.get("methodology", "Unknown").upper()
        ).border = border
        col += 1

        # Location (if included)
        if include_location:
            ws.cell(
                row=row_idx, column=col, value=item.get("location", "")
            ).border = border

    # Add total row
    total_row = row_idx + 1
    total_cost = sum(item["estimated_cost"] * item["quantity"] for item in cost_data)

    # Empty row for spacing
    ws.cell(row=total_row, column=1, value="")
    total_row += 1

    # Total row
    col = 1
    ws.cell(row=total_row, column=col, value="TOTAL").font = total_font
    ws.cell(row=total_row, column=col, value="TOTAL").fill = total_font
    ws.cell(row=total_row, column=col, value="TOTAL").alignment = total_alignment
    ws.cell(row=total_row, column=col, value="TOTAL").border = border
    col += 1

    if include_matched:
        col += 1  # Skip matched item column

    ws.cell(row=total_row, column=col, value="").font = total_font
    ws.cell(row=total_row, column=col, value="").fill = total_font
    ws.cell(row=total_row, column=col, value="").border = border
    col += 1

    ws.cell(row=total_row, column=col, value="").font = total_font
    ws.cell(row=total_row, column=col, value="").fill = total_font
    ws.cell(row=total_row, column=col, value="").border = border
    col += 1

    ws.cell(row=total_row, column=col, value=f"${total_cost:.2f}").font = total_font
    ws.cell(row=total_row, column=col, value=f"${total_cost:.2f}").fill = total_font
    ws.cell(
        row=total_row, column=col, value=f"${total_cost:.2f}"
    ).alignment = total_alignment
    ws.cell(row=total_row, column=col, value=f"${total_cost:.2f}").border = border

    # Skip methodology column for total row
    col += 1

    if include_location:
        col += 1
        ws.cell(row=total_row, column=col, value="").font = total_font
        ws.cell(row=total_row, column=col, value="").fill = total_font
        ws.cell(row=total_row, column=col, value="").border = border

    # Auto-adjust column widths
    for column in ws.columns:
        max_length = 0
        column_letter = get_column_letter(column[0].column)
        for cell in column:
            try:
                if len(str(cell.value)) > max_length:
                    max_length = len(str(cell.value))
            except:
                pass
        adjusted_width = min(max_length + 2, 50)  # Cap at 50 characters
        ws.column_dimensions[column_letter].width = adjusted_width

    # Save the workbook
    wb.save(file_path)

    logger.debug("Excel export completed successfully")
    click.echo(f"📊 Exported cost estimate to Excel: {file_path}")


def export_to_excel(items: List, file_path: Path) -> None:
    """
    Export shopping list items to an Excel file.

    Args:
        items: List of shopping list items
        file_path: Path to export file
    """
    logger = logging.getLogger(__name__)
    logger.debug(f"Exporting {len(items)} items to Excel file: {file_path}")

    try:
        from openpyxl import Workbook
        from openpyxl.styles import Alignment, Border, Font, PatternFill, Side
        from openpyxl.utils import get_column_letter
    except ImportError:
        raise click.ClickException(
            "❌ openpyxl is required for Excel export. Install with: pip install openpyxl"
        )

    # Create workbook and worksheet
    wb = Workbook()
    ws = wb.active
    ws.title = "Shopping List"

    # Define styles
    header_font = Font(bold=True, color="FFFFFF")
    header_fill = PatternFill(
        start_color="366092", end_color="366092", fill_type="solid"
    )
    header_alignment = Alignment(horizontal="center", vertical="center")

    border = Border(
        left=Side(style="thin"),
        right=Side(style="thin"),
        top=Side(style="thin"),
        bottom=Side(style="thin"),
    )

    # Write headers - basic shopping list format
    headers = ["☐", "Item", "Quantity", "Notes", "Status"]

    for col, header in enumerate(headers, 1):
        cell = ws.cell(row=1, column=col, value=header)
        cell.font = header_font
        cell.fill = header_fill
        cell.alignment = header_alignment
        cell.border = border

    # Write data rows
    for row_idx, item in enumerate(items, 2):
        col = 1

        # Checkbox column (☐ for unchecked, ☑ for checked)
        checkbox = "☑" if getattr(item, "checked", False) else "☐"
        ws.cell(row=row_idx, column=col, value=checkbox).border = border
        col += 1

        # Item name
        name = getattr(item, "name", getattr(item, "item_description", "Unknown"))
        ws.cell(row=row_idx, column=col, value=name).border = border
        col += 1

        # Quantity
        quantity = getattr(item, "quantity", 1)
        ws.cell(row=row_idx, column=col, value=quantity).border = border
        col += 1

        # Notes
        notes = getattr(item, "notes", "")
        ws.cell(row=row_idx, column=col, value=notes).border = border
        col += 1

        # Status
        status = "Completed" if getattr(item, "checked", False) else "Pending"
        ws.cell(row=row_idx, column=col, value=status).border = border

    # Auto-adjust column widths
    for column in ws.columns:
        max_length = 0
        column_letter = get_column_letter(column[0].column)
        for cell in column:
            try:
                if len(str(cell.value)) > max_length:
                    max_length = len(str(cell.value))
            except:
                pass
        adjusted_width = min(max_length + 2, 50)  # Cap at 50 characters
        ws.column_dimensions[column_letter].width = adjusted_width

    # Save the workbook
    wb.save(file_path)

    logger.debug("Excel export completed successfully")
    click.echo(f"📊 Exported {len(items)} items to {file_path}")
