#!/usr/bin/env python3
"""
UPC Edge Case Demo for Shop & Scan Functionality.

This demo script tests specific UPCs that demonstrate different pricing scenarios:
- Clearance items without special UPCs
- Buy One Get X% Off deals
- Percentage-based clearance discounts
- Quantity-based pricing (Buy X Get Y deals)

Each UPC is tested individually to isolate edge case behavior.
"""

import logging
import sys
from typing import Dict, List, Optional

from meijer.client import Meijer
from meijer.models import MeijerItem
from meijer.shop_scan import ShopNScan


class UPCEdgeCaseDemo:
    """Demo class for testing UPC edge cases with Shop & Scan."""

    def __init__(self, meijer_client: Meijer):
        """Initialize the demo with a Meijer client."""
        self.meijer = meijer_client
        self.shop_scan = ShopNScan(meijer_client)
        self.logger = logging.getLogger(__name__)

        # Test UPCs with their expected behaviors
        self.test_upcs = {
            "713733252843": {
                "description": "Clearance item without special clearance UPC specific to store 71",
                "expected_behavior": "Should show clearance pricing but no special UPC handling",
                "test_scenarios": ["basic_lookup", "cart_addition", "pricing_analysis"],
            },
            "719812800516": {
                "description": "Buy one get 40% off - second item costs 60% of first",
                "expected_behavior": "BOGO deal where second item gets 40% discount",
                "test_scenarios": [
                    "single_item",
                    "two_items",
                    "pricing_calculation",
                    "deal_validation",
                ],
            },
            "070896523112": {
                "description": "50% off clearance item",
                "expected_behavior": "Should show up in JSON reply when adding to cart with 50% discount",
                "test_scenarios": [
                    "clearance_pricing",
                    "cart_json_analysis",
                    "discount_validation",
                ],
            },
            "629307040245": {
                "description": "Buy 5 and get $5 off total (normally $3.99, becomes $2.99 each when 5+ in cart)",
                "expected_behavior": "Quantity-based pricing with threshold discount",
                "test_scenarios": [
                    "single_item",
                    "four_items",
                    "five_items",
                    "six_items",
                    "pricing_threshold",
                ],
            },
        }

    def print_header(self, title: str):
        """Print a formatted header."""
        print("\n" + "=" * 60)
        print(f" {title}")
        print("=" * 60)

    def print_upc_info(self, upc: str):
        """Print information about a specific UPC."""
        info = self.test_upcs[upc]
        print(f"\nUPC: {upc}")
        print(f"Description: {info['description']}")
        print(f"Expected Behavior: {info['expected_behavior']}")
        print(f"Test Scenarios: {', '.join(info['test_scenarios'])}")

    def test_basic_lookup(self, upc: str) -> Optional[MeijerItem]:
        """Test basic barcode lookup for a UPC."""
        print(f"\n--- Testing Basic Lookup for UPC {upc} ---")

        try:
            result = self.shop_scan.lookup_barcode_price(upc)

            if result:
                print(f"✓ Product found: {result.title}")
                print(f"  Brand: {result.brand}")
                print(f"  Category: {result.category}")
                print(f"  Regular Price: ${result.price}")
                if result.sale_price:
                    print(f"  Sale Price: ${result.sale_price}")
                if result.unit_price:
                    print(f"  Unit Price: ${result.unit_price}")
                if result.tags:
                    print(f"  Tags: {', '.join(result.tags)}")
                if result.is_weighted:
                    print(
                        f"  Weighted Item: {result.weight_amount} {result.weight_unit}"
                    )

                return result
            else:
                print(f"✗ Product not found for UPC {upc}")
                return None

        except Exception as e:
            print(f"✗ Error during lookup: {e}")
            return None

    def test_cart_operations(self, upc: str, quantities: List[int] = None):
        """Test cart operations for a UPC with different quantities."""
        if quantities is None:
            quantities = [1, 2, 5]  # Default test quantities

        print(f"\n--- Testing Cart Operations for UPC {upc} ---")

        # Clear cart first
        print("Clearing cart...")
        clear_success = self.shop_scan.clear_cart()
        if clear_success:
            print("✓ Cart cleared successfully")
        else:
            print("⚠️  Cart clear may have failed, continuing anyway...")

        for quantity in quantities:
            print(f"\nTesting quantity: {quantity}")

            # Add items to cart
            print(f"Adding {quantity} item(s) to cart...")
            success = self.shop_scan.add_to_cart(upc, quantity)

            if success:
                print(f"✓ Successfully added {quantity} item(s)")

                # Get cart contents
                cart_items = self.shop_scan.get_cart()
                print(f"Cart now contains {len(cart_items)} item(s)")

                # Analyze pricing
                self._analyze_cart_pricing(cart_items, upc, quantity)

            else:
                print(f"✗ Failed to add {quantity} item(s) to cart")

        # Clear cart after testing
        print("\nClearing cart after testing...")
        clear_success = self.shop_scan.clear_cart()
        if clear_success:
            print("✓ Cart cleared successfully")
        else:
            print("⚠️  Cart clear may have failed")

    def _analyze_cart_pricing(
        self, cart_items: List[MeijerItem], upc: str, quantity: int
    ):
        """Analyze pricing in the cart for edge case detection."""
        print(f"  Pricing Analysis for {quantity} item(s):")

        if not cart_items:
            print("    No items in cart")
            return

        # Find items matching our UPC
        matching_items = [item for item in cart_items if item.upc == upc]

        if not matching_items:
            print(f"    No items found with UPC {upc}")
            return

        total_price = sum(item.price for item in matching_items)
        avg_price = total_price / len(matching_items)

        print(f"    Total Price: ${total_price:.2f}")
        print(f"    Average Price per Item: ${avg_price:.2f}")

        # Check for pricing anomalies that might indicate edge cases
        if len(matching_items) > 1:
            prices = [item.price for item in matching_items]
            price_variations = set(prices)

            if len(price_variations) > 1:
                print(f"    ⚠️  Price variations detected: {price_variations}")
                print("    This might indicate BOGO deals or quantity discounts")

            # Check for BOGO patterns
            if len(matching_items) == 2:
                price_diff = abs(prices[0] - prices[1])
                if price_diff > 0:
                    discount_percent = (price_diff / max(prices)) * 100
                    print(
                        f"    🎯 Potential BOGO deal: {discount_percent:.1f}% discount on second item"
                    )

        # Check for clearance indicators
        clearance_items = [
            item
            for item in matching_items
            if item.sale_price and item.sale_price < item.price
        ]
        if clearance_items:
            print(
                f"    🏷️  Clearance items detected: {len(clearance_items)} item(s) on sale"
            )
            for item in clearance_items:
                discount = ((item.price - item.sale_price) / item.price) * 100
                print(
                    f"      {item.title}: {discount:.1f}% off (${item.price} → ${item.sale_price})"
                )

    def test_quantity_threshold_pricing(self, upc: str):
        """Test quantity threshold pricing (like Buy 5 Get $5 Off)."""
        print(f"\n--- Testing Quantity Threshold Pricing for UPC {upc} ---")

        # Test various quantities to find threshold
        test_quantities = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        print("Testing different quantities to identify pricing thresholds...")

        # Clear cart first
        clear_success = self.shop_scan.clear_cart()
        if clear_success:
            print("✓ Cart cleared successfully")
        else:
            print("⚠️  Cart clear may have failed, continuing anyway...")

        pricing_data = {}

        for quantity in test_quantities:
            # Add items to cart
            success = self.shop_scan.add_to_cart(upc, quantity)

            if success:
                cart_items = self.shop_scan.get_cart()
                matching_items = [item for item in cart_items if item.upc == upc]

                if matching_items:
                    total_price = sum(item.price for item in matching_items)
                    avg_price = total_price / len(matching_items)

                    pricing_data[quantity] = {
                        "total_price": total_price,
                        "avg_price": avg_price,
                        "unit_price": avg_price,
                    }

                    print(
                        f"  Qty {quantity}: Total=${total_price:.2f}, Avg=${avg_price:.2f}"
                    )
                else:
                    print(f"  Qty {quantity}: No items found in cart")
            else:
                print(f"  Qty {quantity}: Failed to add to cart")

        # Analyze pricing patterns
        self._analyze_pricing_patterns(pricing_data)

        # Clear cart
        clear_success = self.shop_scan.clear_cart()
        if clear_success:
            print("✓ Cart cleared successfully")
        else:
            print("⚠️  Cart clear may have failed")

    def _analyze_pricing_patterns(self, pricing_data: Dict[int, Dict]):
        """Analyze pricing patterns to identify thresholds and discounts."""
        print("\n  --- Pricing Pattern Analysis ---")

        if not pricing_data:
            print("    No pricing data available")
            return

        quantities = sorted(pricing_data.keys())

        if len(quantities) < 2:
            print("    Insufficient data for pattern analysis")
            return

        # Look for price breaks
        price_breaks = []
        for i in range(1, len(quantities)):
            prev_qty = quantities[i - 1]
            curr_qty = quantities[i]

            prev_price = pricing_data[prev_qty]["unit_price"]
            curr_price = pricing_data[curr_qty]["unit_price"]

            if abs(curr_price - prev_price) > 0.01:  # Significant price change
                price_breaks.append(
                    {
                        "threshold": curr_qty,
                        "old_price": prev_price,
                        "new_price": curr_price,
                        "savings_per_unit": prev_price - curr_price,
                    }
                )

        if price_breaks:
            print("    🎯 Price breaks detected:")
            for break_info in price_breaks:
                threshold = break_info["threshold"]
                old_price = break_info["old_price"]
                new_price = break_info["new_price"]
                savings = break_info["savings_per_unit"]

                print(
                    f"      At quantity {threshold}: ${old_price:.2f} → ${new_price:.2f} (save ${savings:.2f} each)"
                )

                # Calculate total savings at threshold
                total_savings = savings * threshold
                print(f"        Total savings at threshold: ${total_savings:.2f}")
        else:
            print("    No significant price breaks detected")

        # Check for bulk discounts
        if len(quantities) >= 5:
            small_qty_avg = (
                sum(pricing_data[q]["unit_price"] for q in quantities[:3]) / 3
            )
            large_qty_avg = (
                sum(pricing_data[q]["unit_price"] for q in quantities[-3:]) / 3
            )

            if large_qty_avg < small_qty_avg:
                discount = ((small_qty_avg - large_qty_avg) / small_qty_avg) * 100
                print(
                    f"    📦 Bulk discount detected: {discount:.1f}% off for larger quantities"
                )

    def run_upc_test(self, upc: str):
        """Run comprehensive test for a specific UPC."""
        if upc not in self.test_upcs:
            print(f"Unknown UPC: {upc}")
            return

        self.print_header(f"Testing UPC: {upc}")
        self.print_upc_info(upc)

        # Test 1: Basic lookup
        product = self.test_basic_lookup(upc)
        if not product:
            print("Skipping cart tests due to lookup failure")
            return

        # Test 2: Cart operations with different quantities
        if upc == "629307040245":  # Buy 5 Get $5 Off
            self.test_quantity_threshold_pricing(upc)
        else:
            self.test_cart_operations(upc)

        print(f"\n✓ Completed testing for UPC {upc}")

    def run_all_upc_tests(self):
        """Run tests for all UPCs in order."""
        print("Starting comprehensive UPC edge case testing...")

        # Test order: Start with simpler cases, then move to complex ones
        test_order = [
            "713733252843",  # Clearance item (simple)
            "070896523112",  # 50% clearance (simple)
            "719812800516",  # BOGO deal (medium complexity)
            "629307040245",  # Quantity threshold (most complex)
        ]

        for upc in test_order:
            try:
                self.run_upc_test(upc)
            except Exception as e:
                print(f"✗ Error testing UPC {upc}: {e}")
                continue

        print("\n" + "=" * 60)
        print(" All UPC edge case tests completed")
        print("=" * 60)

    def interactive_test(self):
        """Run interactive testing where user chooses UPCs to test."""
        print("Interactive UPC Edge Case Testing")
        print("Available UPCs:")

        for i, (upc, info) in enumerate(self.test_upcs.items(), 1):
            print(f"  {i}. {upc} - {info['description']}")

        print("  0. Test all UPCs")
        print("  q. Quit")

        while True:
            choice = input("\nEnter your choice (0-4, or q to quit): ").strip().lower()

            if choice == "q":
                print("Goodbye!")
                break
            elif choice == "0":
                self.run_all_upc_tests()
                break
            elif choice in ["1", "2", "3", "4"]:
                upc_list = list(self.test_upcs.keys())
                selected_upc = upc_list[int(choice) - 1]
                self.run_upc_test(selected_upc)

                continue_test = input("\nTest another UPC? (y/n): ").strip().lower()
                if continue_test != "y":
                    break
            else:
                print("Invalid choice. Please enter 0-4 or q.")


def main():
    """Main function to run the UPC edge case demo."""
    print("UPC Edge Case Demo for Shop & Scan Functionality")
    print("This demo tests specific UPCs for different pricing scenarios.")

    # Check if we have authentication
    try:
        # Try to load existing tokens
        meijer = Meijer()

        # Test authentication
        if not meijer.is_authenticated():
            print("\n⚠️  Not authenticated. Please run authentication first.")
            print("You can use the auth demo or CLI to authenticate.")
            return

        print("✓ Authenticated successfully")

    except Exception as e:
        print(f"\n✗ Error initializing Meijer client: {e}")
        print("Please ensure you have valid authentication tokens.")
        return

    # Create demo instance
    demo = UPCEdgeCaseDemo(meijer)

    # Check command line arguments
    if len(sys.argv) > 1:
        upc = sys.argv[1]
        if upc in demo.test_upcs:
            demo.run_upc_test(upc)
        else:
            print(f"Unknown UPC: {upc}")
            print("Available UPCs:")
            for upc_code in demo.test_upcs.keys():
                print(f"  {upc_code}")
    else:
        # Run interactive mode
        demo.interactive_test()


if __name__ == "__main__":
    main()
