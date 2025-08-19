#!/usr/bin/env python3
"""
Targeted Cart Search for Meijer API

This script searches for the specific cart operations mentioned by the user:
1. Adding "Meijer Whole Milk, Gallon" to cart (quantity 1)
2. Changing quantity to 10
3. Viewing rewards
4. Getting cart items
5. Deleting "Buttermilk Bread" from cart
"""

import re
import sys


def search_specific_operations(log_file_path: str) -> None:
    """Search for specific cart operations in the log file."""
    print(f"🔍 Searching for specific cart operations in: {log_file_path}")
    print("=" * 80)

    try:
        with open(log_file_path, "r", encoding="utf-8", errors="ignore") as f:
            content = f.read()

            print("📋 Searching for specific cart operations...")
            print()

            # 1. Add to cart operations (POST requests to cart endpoints)
            print("1️⃣ ADD TO CART OPERATIONS:")
            print("-" * 40)
            add_matches = re.finditer(
                r"POST.*cart.*add|POST.*digital/occ/v3/carts", content, re.IGNORECASE
            )
            add_count = 0
            for match in add_matches:
                add_count += 1
                start = max(0, match.start() - 100)
                end = min(len(content), match.end() + 100)
                context = content[start:end]
                print(f"   {add_count}. {context.strip()}")
                if add_count >= 5:  # Limit to first 5
                    break
            print(f"   Total add operations found: {add_count}")
            print()

            # 2. Quantity operations
            print("2️⃣ QUANTITY OPERATIONS:")
            print("-" * 40)
            qty_1_matches = re.finditer(r"quantity.*1|qty.*1", content, re.IGNORECASE)
            qty_10_matches = re.finditer(
                r"quantity.*10|qty.*10", content, re.IGNORECASE
            )

            qty_1_count = len(list(qty_1_matches))
            qty_10_count = len(list(qty_10_matches))

            print(f"   Quantity 1: {qty_1_count} matches")
            print(f"   Quantity 10: {qty_10_count} matches")
            print()

            # 3. Rewards operations
            print("3️⃣ REWARDS OPERATIONS:")
            print("-" * 40)
            rewards_matches = re.finditer(
                r"GET.*rewards|rewards.*GET", content, re.IGNORECASE
            )
            rewards_count = 0
            for match in rewards_matches:
                rewards_count += 1
                start = max(0, match.start() - 100)
                end = min(len(content), match.end() + 100)
                context = content[start:end]
                print(f"   {rewards_count}. {context.strip()}")
                if rewards_count >= 3:  # Limit to first 3
                    break
            print(f"   Total rewards operations found: {rewards_count}")
            print()

            # 4. Get cart operations
            print("4️⃣ GET CART OPERATIONS:")
            print("-" * 40)
            get_cart_matches = re.finditer(
                r"GET.*digital/occ/v3/carts/current", content, re.IGNORECASE
            )
            get_cart_count = 0
            for match in get_cart_matches:
                get_cart_count += 1
                start = max(0, match.start() - 100)
                end = min(len(content), match.end() + 100)
                context = content[start:end]
                print(f"   {get_cart_count}. {context.strip()}")
                if get_cart_count >= 3:  # Limit to first 3
                    break
            print(f"   Total get cart operations found: {get_cart_count}")
            print()

            # 5. Delete operations
            print("5️⃣ DELETE OPERATIONS:")
            print("-" * 40)
            delete_matches = re.finditer(
                r"DELETE.*cart|remove.*cart", content, re.IGNORECASE
            )
            delete_count = 0
            for match in delete_matches:
                delete_count += 1
                start = max(0, match.start() - 100)
                end = min(len(content), match.end() + 100)
                context = content[start:end]
                print(f"   {delete_count}. {context.strip()}")
                if delete_count >= 3:  # Limit to first 3
                    break
            print(f"   Total delete operations found: {delete_count}")
            print()

            # 6. Product-specific operations
            print("6️⃣ PRODUCT OPERATIONS:")
            print("-" * 40)
            milk_matches = re.finditer(
                r"milk.*gallon|whole.*milk", content, re.IGNORECASE
            )
            bread_matches = re.finditer(
                r"buttermilk.*bread|bread", content, re.IGNORECASE
            )

            milk_count = len(list(milk_matches))
            bread_count = len(list(bread_matches))

            print(f"   Milk operations: {milk_count} matches")
            print(f"   Bread operations: {bread_count} matches")
            print()

            # Summary
            print("📊 SUMMARY:")
            print("=" * 40)
            print(f"✅ Add to cart: {add_count}")
            print(f"✅ Quantity 1: {qty_1_count}")
            print(f"✅ Quantity 10: {qty_10_count}")
            print(f"✅ Rewards operations: {rewards_count}")
            print(f"✅ Get cart: {get_cart_count}")
            print(f"✅ Delete operations: {delete_count}")
            print(f"✅ Milk operations: {milk_count}")
            print(f"✅ Bread operations: {bread_count}")

    except FileNotFoundError:
        print(f"❌ Error: File '{log_file_path}' not found")
        sys.exit(1)
    except Exception as e:
        print(f"❌ Error reading file: {e}")
        sys.exit(1)


def main():
    """Main function."""
    if len(sys.argv) != 2:
        print("Usage: python3 targeted_cart_search.py <log_file_path>")
        sys.exit(1)

    log_file_path = sys.argv[1]
    search_specific_operations(log_file_path)


if __name__ == "__main__":
    main()
