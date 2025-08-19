#!/usr/bin/env python3
"""
Cart Operation Analyzer for Meijer API

This script analyzes mitmproxy log files to find cart-related operations
including adding items, changing quantities, viewing rewards, and removing items.
"""

import json
import re
import sys
from datetime import datetime


class CartOperationAnalyzer:
    """Analyzes cart operations in mitmproxy log files."""

    def __init__(self, log_file_path: str):
        """Initialize the analyzer with a log file path."""
        self.log_file_path = log_file_path
        self.cart_operations = []
        self.rewards_operations = []
        self.milk_operations = []
        self.bread_operations = []
        self.quantity_changes = []

    def analyze_log(self) -> None:
        """Analyze the log file for cart operations."""
        print(f"🔍 Analyzing cart operations in: {self.log_file_path}")
        print("=" * 80)

        try:
            with open(self.log_file_path, "r", encoding="utf-8", errors="ignore") as f:
                content = f.read()

                # Search for cart-related operations
                self._find_cart_operations(content)
                self._find_rewards_operations(content)
                self._find_milk_operations(content)
                self._find_bread_operations(content)
                self._find_quantity_changes(content)

        except Exception as e:
            print(f"❌ Error reading log file: {e}")
            return

        self._generate_report()

    def _find_cart_operations(self, content: str) -> None:
        """Find cart-related operations in the log content."""
        # Look for cart endpoints and operations
        cart_patterns = [
            r"POST.*cart.*add",
            r"POST.*cart.*remove",
            r"GET.*cart",
            r"PUT.*cart",
            r"PATCH.*cart",
            r"DELETE.*cart",
            r"POST.*addtocart",
            r"POST.*removefromcart",
            r"GET.*getcart",
            r"POST.*clearcart",
        ]

        for pattern in cart_patterns:
            matches = re.finditer(pattern, content, re.IGNORECASE)
            for match in matches:
                # Get context around the match
                start = max(0, match.start() - 200)
                end = min(len(content), match.end() + 200)
                context = content[start:end]

                self.cart_operations.append(
                    {
                        "operation": match.group(),
                        "context": context,
                        "position": match.start(),
                    }
                )

    def _find_rewards_operations(self, content: str) -> None:
        """Find rewards-related operations in the log content."""
        rewards_patterns = [
            r"GET.*rewards",
            r"POST.*rewards",
            r"GET.*mperks",
            r"POST.*mperks",
            r"GET.*offers",
            r"POST.*offers",
        ]

        for pattern in rewards_patterns:
            matches = re.finditer(pattern, content, re.IGNORECASE)
            for match in matches:
                start = max(0, match.start() - 200)
                end = min(len(content), match.end() + 200)
                context = content[start:end]

                self.rewards_operations.append(
                    {
                        "operation": match.group(),
                        "context": context,
                        "position": match.start(),
                    }
                )

    def _find_milk_operations(self, content: str) -> None:
        """Find milk-related operations in the log content."""
        milk_patterns = [
            r"milk.*gallon",
            r"whole.*milk",
            r"add.*milk",
            r"quantity.*milk",
            r"update.*milk",
        ]

        for pattern in milk_patterns:
            matches = re.finditer(pattern, content, re.IGNORECASE)
            for match in matches:
                start = max(0, match.start() - 300)
                end = min(len(content), match.end() + 300)
                context = content[start:end]

                self.milk_operations.append(
                    {
                        "operation": match.group(),
                        "context": context,
                        "position": match.start(),
                    }
                )

    def _find_bread_operations(self, content: str) -> None:
        """Find bread-related operations in the log content."""
        bread_patterns = [
            r"buttermilk.*bread",
            r"bread.*remove",
            r"delete.*bread",
            r"remove.*bread",
        ]

        for pattern in bread_patterns:
            matches = re.finditer(pattern, content, re.IGNORECASE)
            for match in matches:
                start = max(0, match.start() - 300)
                end = min(len(content), match.end() + 300)
                context = content[start:end]

                self.bread_operations.append(
                    {
                        "operation": match.group(),
                        "context": context,
                        "position": match.start(),
                    }
                )

    def _find_quantity_changes(self, content: str) -> None:
        """Find quantity change operations in the log content."""
        quantity_patterns = [
            r"quantity.*10",
            r"quantity.*1",
            r"qty.*10",
            r"qty.*1",
            r"update.*quantity",
            r"change.*quantity",
        ]

        for pattern in quantity_patterns:
            matches = re.finditer(pattern, content, re.IGNORECASE)
            for match in matches:
                start = max(0, match.start() - 300)
                end = min(len(content), match.end() + 300)
                context = content[start:end]

                self.quantity_changes.append(
                    {
                        "operation": match.group(),
                        "context": context,
                        "position": match.start(),
                    }
                )

    def _generate_report(self) -> None:
        """Generate a comprehensive report of findings."""
        print("\n📊 CART OPERATIONS ANALYSIS REPORT")
        print("=" * 80)

        print(f"\n🛒 Cart Operations Found: {len(self.cart_operations)}")
        if self.cart_operations:
            for i, op in enumerate(self.cart_operations[:5], 1):  # Show first 5
                print(f"  {i}. {op['operation']}")
                print(f"     Context: {op['context'][:100]}...")
                print()

        print(f"\n🎁 Rewards Operations Found: {len(self.rewards_operations)}")
        if self.rewards_operations:
            for i, op in enumerate(self.rewards_operations[:3], 1):  # Show first 3
                print(f"  {i}. {op['operation']}")
                print(f"     Context: {op['context'][:100]}...")
                print()

        print(f"\n🥛 Milk Operations Found: {len(self.milk_operations)}")
        if self.milk_operations:
            for i, op in enumerate(self.milk_operations[:3], 1):  # Show first 3
                print(f"  {i}. {op['operation']}")
                print(f"     Context: {op['context'][:100]}...")
                print()

        print(f"\n🍞 Bread Operations Found: {len(self.bread_operations)}")
        if self.bread_operations:
            for i, op in enumerate(self.bread_operations[:3], 1):  # Show first 3
                print(f"  {i}. {op['operation']}")
                print(f"     Context: {op['context'][:100]}...")
                print()

        print(f"\n🔢 Quantity Changes Found: {len(self.quantity_changes)}")
        if self.quantity_changes:
            for i, op in enumerate(self.quantity_changes[:3], 1):  # Show first 3
                print(f"  {i}. {op['operation']}")
                print(f"     Context: {op['context'][:100]}...")
                print()

        # Save detailed report to file
        report = {
            "timestamp": datetime.now().isoformat(),
            "log_file": self.log_file_path,
            "summary": {
                "cart_operations": len(self.cart_operations),
                "rewards_operations": len(self.rewards_operations),
                "milk_operations": len(self.milk_operations),
                "bread_operations": len(self.bread_operations),
                "quantity_changes": len(self.quantity_changes),
            },
            "cart_operations": self.cart_operations[:10],  # Limit to first 10
            "rewards_operations": self.rewards_operations[:5],
            "milk_operations": self.milk_operations[:5],
            "bread_operations": self.bread_operations[:5],
            "quantity_changes": self.quantity_changes[:5],
        }

        report_file = "cart_operations_analysis.json"
        with open(report_file, "w") as f:
            json.dump(report, f, indent=2, default=str)

        print(f"\n💾 Detailed report saved to: {report_file}")

        # Summary
        print("\n📋 SUMMARY")
        print("=" * 40)
        print(
            f"Total operations found: {len(self.cart_operations) + len(self.rewards_operations) + len(self.milk_operations) + len(self.bread_operations) + len(self.quantity_changes)}"
        )

        if not any(
            [
                self.cart_operations,
                self.rewards_operations,
                self.milk_operations,
                self.bread_operations,
                self.quantity_changes,
            ]
        ):
            print("❌ No cart operations found in the log file.")
            print("   This could mean:")
            print("   - The log file doesn't contain the expected operations")
            print("   - The operations used different endpoints than expected")
            print("   - The log file format is different than expected")


def main():
    """Main function to run the cart operation analyzer."""
    if len(sys.argv) != 2:
        print("Usage: python3 cart_operation_analyzer.py <log_file>")
        print(
            "Example: python3 cart_operation_analyzer.py meijer_mitm_20250818_130318.log"
        )
        sys.exit(1)

    log_file = sys.argv[1]

    # Create and run analyzer
    analyzer = CartOperationAnalyzer(log_file)
    analyzer.analyze_log()


if __name__ == "__main__":
    main()
