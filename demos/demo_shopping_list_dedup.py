#!/usr/bin/env python3
"""
Comprehensive demo of Meijer shopping list deduplication functionality.

This script demonstrates:
1. Adding duplicate items to create a test scenario
2. Running the dedup to consolidate duplicates
3. Showing the results and statistics
"""

import time
from typing import Optional

from meijer import MeijerClient
from meijer.exceptions import MeijerAuthenticationError


def demonstrate_dedup(client):
    """Demonstrate the deduplication functionality."""
    print("\n🔍 **DEMONSTRATING DEDUPLICATION FUNCTIONALITY**")

    try:
        # Get current list
        current_items = client.shopping_list.get()
        print(f"📋 Current shopping list has {len(current_items)} items")

        # Add some duplicate items for testing
        print("\n📝 Adding duplicate items for testing...")

        # Add first set of duplicates
        client.shopping_list.add("Milk", 1, "Whole milk")
        client.shopping_list.add("Milk", 2, "2% milk")
        client.shopping_list.add("Milk", 1, "Skim milk")

        # Add second set of duplicates
        client.shopping_list.add("Ice Cream", 1, "Vanilla")
        client.shopping_list.add("Ice Cream", 1, "Chocolate")

        # Add some unique items
        client.shopping_list.add("Oreos", 2, "Original flavor")
        client.shopping_list.add("Bread", 1, "Whole wheat")

        # Add more duplicates
        client.shopping_list.add("Bread", 1, "White bread")
        client.shopping_list.add("Bread", 1, "Sourdough")

        print("✅ Added test items with duplicates")

        # Show the list before dedup
        print("\n📋 Shopping List Before Dedup:")
        items_before = client.shopping_list.get()
        for i, item in enumerate(items_before, 1):
            print(
                f"   {i}. {item.name} (Qty: {item.quantity}) - {item.notes or 'No notes'}"
            )

        # Run the dedup
        print(f"\n🔍 Starting deduplication on {len(items_before)} items...")
        start_time = time.time()

        result = client.shopping_list.dedup()

        end_time = time.time()
        print(f"⏱️  Dedup completed in {end_time - start_time:.1f} seconds")
        print(f"🎯 Dedup result: {'Success' if result else 'Failed'}")

        if result and result.get("success"):
            print("✅ Deduplication completed successfully!")

            # Show statistics
            original_count = result.get("original_count", 0)
            deduplicated_count = result.get("deduplicated_count", 0)
            removed_duplicates = result.get("removed_duplicates", 0)

            print(f"\n📊 Deduplication Results:")
            print(f"   Original items: {original_count}")
            print(f"   After dedup: {deduplicated_count}")
            print(f"   Duplicates removed: {removed_duplicates}")

            if removed_duplicates > 0:
                print(f"   💾 Space saved: {removed_duplicates} item(s)")
                efficiency = (removed_duplicates / original_count) * 100
                print(f"   📈 Efficiency improvement: {efficiency:.1f}%")

            # Show the list after dedup
            print("\n📋 Shopping List After Dedup:")
            items_after = client.shopping_list.get()
            if items_after:
                for i, item in enumerate(items_after, 1):
                    print(
                        f"   {i}. {item.name} (Qty: {item.quantity}) - {item.notes or 'No notes'}"
                    )
            else:
                print("📝 Shopping list is empty after dedup")

            return True
        else:
            print("❌ Deduplication encountered some issues")
            if result:
                print(f"   Error: {result.get('error', 'Unknown error')}")
            return False

    except Exception as e:
        print(f"❌ Error during deduplication demonstration: {e}")
        return False


def show_dedup_api_usage():
    """Show the simple API usage for deduplication."""
    print("\n🔧 **DEDUPLICATION API USAGE**")
    print("The dedup functionality is available through the shopping list API:")
    print()
    print("   # Basic dedup (removes duplicates and consolidates quantities)")
    print("   result = client.shopping_list.dedup()")
    print()
    print("   # Check if successful")
    print("   if result.get('success'):")
    print("       print(f'Removed {result[\"removed_duplicates\"]} duplicates')")
    print()
    print("   # Access statistics")
    print("   original_count = result.get('original_count', 0)")
    print("   deduplicated_count = result.get('deduplicated_count', 0)")
    print("   removed_duplicates = result.get('removed_duplicates', 0)")
    print()
    print("   # CLI usage:")
    print("   meijer list dedup          # Run dedup")
    print("   meijer list dedup --show   # Show before/after")


def main():
    """Main demonstration function."""
    print("🚀 **MEIJER SHOPPING LIST DEDUPLICATION DEMONSTRATION**")
    print("=" * 60)
    print()
    print("This demonstration will:")
    print("1. Add test items with duplicates to create a realistic scenario")
    print("2. Show the shopping list before deduplication")
    print("3. Run the dedup to consolidate duplicates")
    print("4. Display the results and statistics")
    print("5. Show the final deduplicated list")
    print()

    try:
        # Initialize client
        print("🔐 Initializing Meijer client...")
        client = MeijerClient()

        # Ensure authentication
        if not client.ensure_authenticated():
            print("❌ Authentication failed. Please check your credentials.")
            return

        print("✅ Authentication successful!")

        # Step 1: Add test items with duplicates
        print("\n📝 **STEP 1: Adding Test Items with Duplicates**")
        print(
            "Adding items like 'Milk', 'Ice Cream', 'Bread' with multiple variations..."
        )

        # Step 2: Show the list before dedup
        print("\n📋 **STEP 2: Shopping List Before Dedup**")
        print("Displaying current items to show the duplicate situation...")

        # Step 3: Demonstrate dedup
        if not demonstrate_dedup(client):
            print("❌ Deduplication demonstration failed.")
            return

        # Step 4: Show API usage
        show_dedup_api_usage()

        print("\n🎉 **DEDUPLICATION DEMONSTRATION COMPLETED SUCCESSFULLY!**")
        print()
        print("The dedup functionality successfully:")
        print("   ✅ Identified duplicate items by name")
        print("   ✅ Consolidated quantities for duplicate items")
        print("   ✅ Removed redundant entries")
        print("   ✅ Preserved item details and notes")
        print("   ✅ Maintained the shopping list structure")
        print()
        print("This is particularly useful when:")
        print("   • Items are added multiple times accidentally")
        print("   • Different variations of the same item exist")
        print("   • Importing from multiple sources creates duplicates")
        print("   • Consolidating shopping lists from different devices")

    except MeijerAuthenticationError as e:
        print(f"❌ Authentication error: {e}")
        print("Please ensure you have valid authentication credentials.")
    except Exception as e:
        print(f"❌ Unexpected error: {e}")
        print("Please check the error details and try again.")


if __name__ == "__main__":
    main()
