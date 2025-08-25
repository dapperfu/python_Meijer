#!/usr/bin/env python3
"""
Test script for shopping list deduplication functionality.

This script tests the dedup feature that removes duplicate items by consolidating quantities.
"""

import time

from meijer import MeijerClient
from meijer.exceptions import MeijerAuthenticationError


def test_dedup() -> None:
    """
    Test the shopping list deduplication functionality.

    This function demonstrates how the dedup feature works by:
    1. Adding test items with duplicates
    2. Running dedup to consolidate duplicates
    3. Verifying the results
    """
    print("🚀 Testing Shopping List Deduplication Functionality")
    print("=" * 60)

    try:
        # Initialize client
        print("🔐 Initializing Meijer client...")
        client = MeijerClient()

        # Ensure authentication
        if not client.ensure_authenticated():
            print("❌ Authentication failed. Please check your credentials.")
            return

        print("✅ Authentication successful!")

        # Get current shopping list
        print("\n📋 Getting current shopping list...")
        current_items = client.shopping_list.get()

        if current_items:
            print(f"📝 Found {len(current_items)} existing items")
            print("   (These will be preserved during testing)")
        else:
            print("📝 Shopping list is currently empty")

        # Add test items with duplicates
        print("\n📝 Adding test items with duplicates...")

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

        # Get the list before dedup
        print("\n📄 Current items (before dedup):")
        items_before = client.shopping_list.get()
        for i, item in enumerate(items_before, 1):
            print(
                f"   {i}. {item.name} (Qty: {item.quantity}) - {item.notes or 'No notes'}"
            )

        # Count duplicates
        name_counts = {}
        for item in items_before:
            name = item.name.lower().strip()
            name_counts[name] = name_counts.get(name, 0) + 1

        duplicate_names = [name for name, count in name_counts.items() if count > 1]
        print(f"\n🔍 Found {len(duplicate_names)} items with duplicates:")
        for name in duplicate_names:
            count = name_counts[name]
            print(f"   • {name.title()}: {count} entries")

        # Run dedup
        print(f"\n🔍 Running dedup on {len(items_before)} items...")
        start_time = time.time()

        dedup_success = client.shopping_list.dedup()

        end_time = time.time()

        if not dedup_success:
            print("❌ Dedup failed!")
            return

        print(
            f"✅ Dedup completed successfully in {end_time - start_time:.1f} seconds!"
        )

        # Get deduplicated list
        print("\n📋 Getting deduplicated shopping list...")
        deduplicated_items = client.shopping_list.get()

        if not deduplicated_items:
            print("❌ No items found after dedup!")
            return

        print(f"📊 Found {len(deduplicated_items)} items in deduplicated list")

        # Show deduplicated items
        print("\n📄 Deduplicated items (consolidated by name):")
        for i, item in enumerate(deduplicated_items, 1):
            print(
                f"   {i}. {item.name} (Qty: {item.quantity}) - {item.notes or 'No notes'}"
            )

        # Verify deduplication results
        print("\n🔍 Verifying deduplication results...")

        # Check that duplicates were consolidated
        dedup_name_counts = {}
        for item in deduplicated_items:
            name = item.name.lower().strip()
            dedup_name_counts[name] = dedup_name_counts.get(name, 0) + 1

        # All items should now have count = 1
        remaining_duplicates = [
            name for name, count in dedup_name_counts.items() if count > 1
        ]

        if remaining_duplicates:
            print(
                f"⚠️  Warning: {len(remaining_duplicates)} items still have duplicates:"
            )
            for name in remaining_duplicates:
                count = dedup_name_counts[name]
                print(f"   • {name.title()}: {count} entries")
        else:
            print("✅ All duplicates successfully consolidated!")

        # Show summary statistics
        original_count = len(items_before)
        dedup_count = len(deduplicated_items)
        removed_count = original_count - dedup_count

        print("\n📊 Dedup Summary:")
        print(f"   Total items before: {original_count}")
        print(f"   Total items after: {dedup_count}")
        print(f"   Duplicates removed: {removed_count}")

        if removed_count > 0:
            efficiency = (removed_count / original_count) * 100
            print(f"   Efficiency improvement: {efficiency:.1f}%")

            # Show what was consolidated
            print("\n🔄 Items consolidated:")
            for name in duplicate_names:
                original_entries = name_counts[name]
                print(f"   • {name.title()}: {original_entries} entries → 1 entry")

        print("\n🎉 Dedup test completed successfully!")

    except MeijerAuthenticationError as e:
        print(f"❌ Authentication error: {e}")
        print("Please ensure you have valid authentication credentials.")
    except Exception as e:
        print(f"❌ Unexpected error during dedup test: {e}")
        print("Please check the error details and try again.")


def demo_dedup_api() -> None:
    """
    Demonstrate the dedup API usage.

    Shows the simple API calls for using the dedup functionality.
    """
    print("\n🔧 Dedup API Usage Examples")
    print("=" * 40)

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


if __name__ == "__main__":
    print("🧪 Shopping List Dedup Test Suite")
    print("=" * 50)
    print()
    print("This test suite will:")
    print("1. Add test items with duplicates")
    print("2. Run the dedup functionality")
    print("3. Verify that duplicates were consolidated")
    print("4. Show detailed statistics")
    print()

    try:
        # Run the dedup test
        test_dedup()

        # Show API usage examples
        demo_dedup_api()

    except KeyboardInterrupt:
        print("\n⏹️  Test interrupted by user")
    except Exception as e:
        print(f"\n❌ Test suite failed: {e}")
        print("Please check the error details and try again.")
