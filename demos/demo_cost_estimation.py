#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Demo script for shopping list cost estimation feature
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing, numpy-style docstrings
 * - Dependencies: meijer package, rich, openpyxl
 */

Demo script for Meijer shopping list cost estimation.

This script demonstrates the new cost estimation feature that:
- Estimates costs for shopping list items
- Matches items to actual products
- Provides location information
- Exports to CSV and Excel formats
- Includes checkboxes for shopping list use
"""

import logging
import sys
from pathlib import Path
from typing import Any, Dict, List

# Add the parent directory to the path so we can import meijer
sys.path.insert(0, str(Path(__file__).parent.parent))

from meijer.cli.utils import (
    estimate_list_cost,
    export_cost_estimate_to_csv,
    export_cost_estimate_to_excel,
)
from meijer.client import Meijer


def setup_logging() -> None:
    """Set up logging for the demo."""
    logging.basicConfig(
        level=logging.INFO,
        format="%(asctime)s - %(name)s - %(levelname)s - %(message)s",
    )


def create_sample_shopping_list(client: Meijer) -> None:
    """Create a sample shopping list with common items for demonstration."""
    print("🛒 Creating sample shopping list...")

    sample_items = [
        ("Milk", 1, "2% milk"),
        ("Bread", 2, "Whole wheat bread"),
        ("Bananas", 1, "Fresh bananas"),
        ("Chicken breast", 1, "Boneless skinless"),
        ("Cheese", 1, "Cheddar cheese"),
        ("Apples", 1, "Gala apples"),
        ("Pasta", 2, "Spaghetti"),
        ("Tomato sauce", 1, "Marinara sauce"),
        ("Yogurt", 1, "Greek yogurt"),
        ("Cereal", 1, "Cheerios"),
    ]

    added_count = 0
    for item_name, quantity, notes in sample_items:
        try:
            success = client.list.add_item_with_details(
                upc=f"ITEM_{hash(item_name) % 10000}",
                description=item_name,
                quantity=quantity,
                notes=notes,
            )
            if success:
                added_count += 1
                print(f"  ✅ Added: {item_name} (qty: {quantity})")
            else:
                print(f"  ❌ Failed to add: {item_name}")
        except Exception as e:
            print(f"  ❌ Error adding {item_name}: {e}")

    print(f"📝 Sample shopping list created with {added_count} items\n")


def demonstrate_cost_estimation(client: Meijer) -> None:
    """Demonstrate the cost estimation functionality."""
    print("💰 Demonstrating Cost Estimation Feature")
    print("=" * 50)

    # Get the shopping list
    try:
        items = client.list.get()
        if not items:
            print("📝 Shopping list is empty. Please add some items first.")
            return

        print(f"🔍 Estimating costs for {len(items)} items...")
        print("🎯 Using all available methods: cart → shop_scan → search → keywords")

        # Estimate costs
        cost_data = estimate_list_cost(
            client=client,
            items=items,
            store_id=None,  # Use default store
            include_location=True,
            include_matched=True,
        )

        if not cost_data:
            print("❌ Failed to estimate costs")
            return

        # Display results
        print("\n📊 Cost Estimation Results:")
        print("-" * 50)

        total_cost = 0
        for i, item in enumerate(cost_data, 1):
            item_cost = item["estimated_cost"] * item["quantity"]
            total_cost += item_cost

            print(
                f"{i:2d}. {item['name']:<20} "
                f"Qty: {item['quantity']} "
                f"Est: ${item['estimated_cost']:>6.2f} "
                f"Total: ${item_cost:>7.2f}"
            )

            # Show methodology
            methodology = item.get("methodology", "Unknown")
            methodology_emoji = {
                "cart": "🛒",
                "shop_scan": "📱",
                "search": "🔍",
                "keywords": "🏷️",
                "error": "❌",
            }.get(methodology, "❓")
            print(f"    └─ Method: {methodology_emoji} {methodology.upper()}")

            if item.get("matched_product"):
                print(f"    └─ Matched: {item['matched_product'][:50]}...")

            if item.get("location"):
                print(f"    └─ Location: {item['location']}")

            confidence = item.get("match_confidence", "Unknown")
            confidence_emoji = {
                "High": "🟢",
                "Medium": "🟡",
                "Low": "🔴",
                "Error": "❌",
            }.get(confidence, "❓")
            print(f"    └─ Confidence: {confidence_emoji} {confidence}")
            print()

        print(f"💰 Total Estimated Cost: ${total_cost:.2f}")
        print(f"📝 Items Processed: {len(cost_data)}")

        # Show methodology breakdown
        methodology_counts = {}
        for item in cost_data:
            methodology = item.get("methodology", "Unknown")
            methodology_counts[methodology] = methodology_counts.get(methodology, 0) + 1

        print("\n🎯 Methodology Breakdown:")
        for methodology, count in methodology_counts.items():
            methodology_emoji = {
                "cart": "🛒",
                "shop_scan": "📱",
                "search": "🔍",
                "keywords": "🏷️",
                "error": "❌",
            }.get(methodology, "❓")
            print(f"   {methodology_emoji} {methodology}: {count} item(s)")

        # Show confidence breakdown
        confidence_counts = {}
        for item in cost_data:
            confidence = item.get("match_confidence", "Unknown")
            confidence_counts[confidence] = confidence_counts.get(confidence, 0) + 1

        print("\n🎯 Match Confidence Summary:")
        for confidence, count in confidence_counts.items():
            confidence_emoji = {
                "High": "🟢",
                "Medium": "🟡",
                "Low": "🔴",
                "Error": "❌",
            }.get(confidence, "❓")
            print(f"   {confidence_emoji} {confidence}: {count} item(s)")

    except Exception as e:
        print(f"❌ Error during cost estimation: {e}")
        logging.error(f"Cost estimation failed: {e}", exc_info=True)


def demonstrate_export_functionality(cost_data: List[Dict[str, Any]]) -> None:
    """Demonstrate the export functionality for CSV and Excel."""
    print("\n📊 Demonstrating Export Functionality")
    print("=" * 50)

    if not cost_data:
        print("❌ No cost data to export")
        return

    # Create output directory
    output_dir = Path("cost_estimates")
    output_dir.mkdir(exist_ok=True)

    # Export to CSV
    csv_path = output_dir / "shopping_list_cost_estimate.csv"
    try:
        export_cost_estimate_to_csv(
            cost_data=cost_data,
            file_path=str(csv_path),
            include_location=True,
            include_matched=True,
        )
        print(f"✅ CSV export successful: {csv_path}")
    except Exception as e:
        print(f"❌ CSV export failed: {e}")

    # Export to Excel
    excel_path = output_dir / "shopping_list_cost_estimate.xlsx"
    try:
        export_cost_estimate_to_excel(
            cost_data=cost_data,
            file_path=str(excel_path),
            include_location=True,
            include_matched=True,
        )
        print(f"✅ Excel export successful: {excel_path}")
    except Exception as e:
        print(f"❌ Excel export failed: {e}")

    print(f"\n📁 Files saved to: {output_dir.absolute()}")
    print("   - CSV: Shopping list with cost estimates")
    print("   - Excel: Formatted shopping list with checkboxes")


def show_usage_examples() -> None:
    """Show examples of how to use the cost estimation feature."""
    print("\n📚 Usage Examples")
    print("=" * 50)

    print("CLI Commands:")
    print("  # Basic cost estimation (all methods)")
    print("  meijer list estimate")
    print()
    print("  # Export to CSV (format auto-detected)")
    print("  meijer list estimate --output costs.csv")
    print()
    print("  # Export to Excel (format auto-detected)")
    print("  meijer list estimate --output costs.xlsx")
    print()
    print("  # Use specific methods in order")
    print("  meijer list estimate --methods cart shop_scan")
    print("  meijer list estimate --methods search keywords")
    print()
    print("  # Specify store ID")
    print("  meijer list estimate --store-id 217")
    print()
    print("  # Customize columns")
    print("  meijer list estimate --no-include-location --no-include-matched")
    print()

    print("Python API:")
    print("  from meijer.cli.utils import estimate_list_cost")
    print("  # Use all methods (default)")
    print("  cost_data = estimate_list_cost(client, items)")
    print()
    print("  # Use specific methods in order")
    print(
        "  cost_data = estimate_list_cost(client, items, preferred_methods=['cart', 'shop_scan'])"
    )
    print()
    print("  # Export with methodology")
    print("  from meijer.cli.utils import export_cost_estimate_to_excel")
    print("  export_cost_estimate_to_excel(cost_data, 'output.xlsx')")

    print("\n🎯 Available Methods:")
    print("  🛒 cart      - Add to cart, check subtotal (most accurate)")
    print("  📱 shop_scan - Shop & Scan API pricing")
    print("  🔍 search    - Text search with product matching")
    print("  🏷️ keywords  - Category-based estimation (fallback)")


def main() -> None:
    """Main demo function."""
    print("🛒 Meijer Shopping List Cost Estimation Demo")
    print("=" * 60)
    print()

    setup_logging()

    try:
        # Initialize Meijer client
        print("🔐 Initializing Meijer client...")
        client = Meijer()

        if client.auth_status.name != "AUTHENTICATED":
            print("❌ Authentication failed! Please check your credentials.")
            print("   Ensure you have auth.txt or ~/.config/meijer.txt configured")
            return

        print("✅ Authentication successful!")
        print()

        # Create sample shopping list
        create_sample_shopping_list(client)

        # Demonstrate cost estimation
        demonstrate_cost_estimation(client)

        # Get cost data for export demo
        items = client.list.get()
        if items:
            cost_data = estimate_list_cost(client, items)
            demonstrate_export_functionality(cost_data)

        # Show usage examples
        show_usage_examples()

        print("\n🎉 Demo completed successfully!")
        print("   The cost estimation feature provides:")
        print("   - Automatic product matching and pricing")
        print("   - Location information for efficient shopping")
        print("   - Multiple export formats (CSV, Excel)")
        print("   - Shopping list checkboxes in Excel")
        print("   - Cost summaries and confidence ratings")

    except Exception as e:
        print(f"❌ Demo failed: {e}")
        logging.error(f"Demo failed: {e}", exc_info=True)
        return 1

    return 0


if __name__ == "__main__":
    sys.exit(main())
