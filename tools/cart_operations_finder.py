#!/usr/bin/env python3
"""
Cart Operations Finder for Meijer API

This script searches for specific cart operations mentioned by the user:
1. Adding "Meijer Whole Milk, Gallon" to cart (quantity 1)
2. Changing quantity to 10
3. Viewing rewards
4. Getting cart items
5. Deleting "Buttermilk Bread" from cart
"""

import json
import re
import sys
from datetime import datetime


def search_cart_operations(log_file_path: str) -> None:
    """Search for specific cart operations in the log file."""
    print(f"🔍 Searching for specific cart operations in: {log_file_path}")
    print("=" * 80)

    try:
        with open(log_file_path, "r", encoding="utf-8", errors="ignore") as f:
            content = f.read()

            # Search for specific cart operations
            operations = []

            # 1. Add to cart operations
            add_patterns = [
                (r"POST.*cart.*add", "Add to cart"),
                (r"POST.*digital/occ/v3/carts", "Add to cart (OCC)"),
                (r"quantity.*1", "Quantity 1"),
                (r"qty.*1", "Quantity 1"),
            ]

            for pattern, description in add_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    start = max(0, match.start() - 200)
                    end = min(len(content), match.end() + 200)
                    context = content[start:end]
                    operations.append(
                        {
                            "type": description,
                            "context": context.strip(),
                            "position": match.start(),
                        }
                    )

            # 2. Quantity change operations
            qty_patterns = [
                (r"quantity.*10", "Quantity 10"),
                (r"qty.*10", "Quantity 10"),
                (r"PUT.*cart", "Update cart"),
                (r"PATCH.*cart", "Update cart"),
            ]

            for pattern, description in qty_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    start = max(0, match.start() - 200)
                    end = min(len(content), match.end() + 200)
                    context = content[start:end]
                    operations.append(
                        {
                            "type": description,
                            "context": context.strip(),
                            "position": match.start(),
                        }
                    )

            # 3. Rewards operations
            rewards_patterns = [
                (r"rewards", "View rewards"),
                (r"mperks", "MPerks"),
                (r"GET.*rewards", "Get rewards"),
            ]

            for pattern, description in rewards_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    start = max(0, match.start() - 200)
                    end = min(len(content), match.end() + 200)
                    context = content[start:end]
                    operations.append(
                        {
                            "type": description,
                            "context": context.strip(),
                            "position": match.start(),
                        }
                    )

            # 4. Get cart operations
            get_cart_patterns = [
                (r"GET.*cart", "Get cart"),
                (r"GET.*digital/occ/v3/carts/current", "Get current cart"),
            ]

            for pattern, description in get_cart_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    start = max(0, match.start() - 200)
                    end = min(len(content), match.end() + 200)
                    context = content[start:end]
                    operations.append(
                        {
                            "type": description,
                            "context": context.strip(),
                            "position": match.start(),
                        }
                    )

            # 5. Delete operations
            delete_patterns = [
                (r"DELETE.*cart", "Delete from cart"),
                (r"remove.*cart", "Remove from cart"),
            ]

            for pattern, description in delete_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    start = max(0, match.start() - 200)
                    end = min(len(content), match.end() + 200)
                    context = content[start:end]
                    operations.append(
                        {
                            "type": description,
                            "context": context.strip(),
                            "position": match.start(),
                        }
                    )

            # 6. Product-specific operations
            product_patterns = [
                (r"milk.*gallon", "Milk gallon"),
                (r"whole.*milk", "Whole milk"),
                (r"buttermilk.*bread", "Buttermilk bread"),
                (r"bread", "Bread"),
            ]

            for pattern, description in product_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    start = max(0, match.start() - 200)
                    end = min(len(content), match.end() + 200)
                    context = content[start:end]
                    operations.append(
                        {
                            "type": description,
                            "context": context.strip(),
                            "position": match.start(),
                        }
                    )

            # Sort operations by position
            operations.sort(key=lambda x: x["position"])

            # Print results
            print(f"📊 Found {len(operations)} cart-related operations:")
            print()

            for i, op in enumerate(operations[:20], 1):  # Show first 20
                print(f"{i}. {op['type']}")
                print(f"   Context: {op['context'][:100]}...")
                print()

            if len(operations) > 20:
                print(f"... and {len(operations) - 20} more operations")

            # Save detailed results
            results = {
                "log_file": log_file_path,
                "analysis_timestamp": datetime.now().isoformat(),
                "total_operations": len(operations),
                "operations": operations,
            }

            output_file = "cart_operations_detailed.json"
            with open(output_file, "w") as f:
                json.dump(results, f, indent=2)

            print(f"💾 Detailed results saved to: {output_file}")

    except FileNotFoundError:
        print(f"❌ Error: File '{log_file_path}' not found")
        sys.exit(1)
    except Exception as e:
        print(f"❌ Error reading file: {e}")
        sys.exit(1)


def main():
    """Main function."""
    if len(sys.argv) != 2:
        print("Usage: python3 cart_operations_finder.py <log_file_path>")
        sys.exit(1)

    log_file_path = sys.argv[1]
    search_cart_operations(log_file_path)


if __name__ == "__main__":
    main()
