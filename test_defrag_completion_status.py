#!/usr/bin/env python3
"""
Test script to verify that defrag preserves completion status of items.

This script:
1. Gets the current shopping list
2. Marks some items as completed
3. Runs defrag
4. Verifies that previously completed items are still completed
"""

import os
import sys

sys.path.insert(0, os.path.join(os.path.dirname(__file__), "."))

import time

from meijer import Meijer


def test_defrag_completion_status():
    """Test that defrag preserves completion status."""
    print("🧪 Testing Defrag Completion Status Preservation")
    print("=" * 60)

    try:
        # Initialize client
        print("🔌 Connecting to Meijer API...")
        client = Meijer()

        # Check authentication
        if client.auth_status.name != "AUTHENTICATED":
            print("❌ Authentication failed!")
            print("   Please ensure you have ~/.config/meijer/auth.json configured")
            return False

        print("✅ Successfully authenticated!")

        # Get current shopping list
        print("\n📋 Getting current shopping list...")
        current_items = client.list.get()

        if len(current_items) < 2:
            print("📝 Shopping list needs at least 2 items to test completion status!")
            print("\n🛒 To test defrag completion status, add some items first:")
            print("   • Use the Meijer app")
            print(
                "   • Or use: client.list.add_item_with_details('UPC', description='Item Name')"
            )
            return False

        print(f"📊 Found {len(current_items)} items in shopping list")

        # Show current items and their completion status
        print("\n📄 Current items (before completion status test):")
        completed_items = []
        for i, item in enumerate(current_items, 1):
            status_icon = "✅" if item.is_complete else "⭕"
            print(f"  {i:2d}. {status_icon} {item.name}")
            if item.is_complete:
                completed_items.append(item.name)

        print(
            f"\n📊 Current completion status: {len(completed_items)} completed, {len(current_items) - len(completed_items)} remaining"
        )

        # If no items are completed, mark the first item as completed for testing
        if not completed_items:
            print(
                "\n🔄 No completed items found. Marking first item as completed for testing..."
            )
            first_item = current_items[0]
            success = client.list.complete_item(str(first_item.list_item_id))
            if success:
                completed_items.append(first_item.name)
                print(f"✅ Marked '{first_item.name}' as completed")
            else:
                print(f"❌ Failed to mark '{first_item.name}' as completed")
                return False

        print(
            f"\n🎯 Items that should remain completed after defrag: {completed_items}"
        )

        # Run defrag
        print(f"\n🔧 Running defrag on {len(current_items)} items...")
        print("⏳ This may take a moment to search for locations...")

        start_time = time.time()
        defrag_result = client.list.defrag()
        end_time = time.time()

        if not defrag_result.get("success"):
            print("❌ Defrag failed!")
            return False

        print(
            f"✅ Defrag completed successfully in {end_time - start_time:.1f} seconds!"
        )

        # Get defragged list
        print("\n📋 Getting defragged shopping list...")
        defragged_items = client.list.get()

        if not defragged_items:
            print("❌ No items found after defrag!")
            return False

        print(f"📊 Found {len(defragged_items)} items in defragged list")

        # Check completion status preservation
        print("\n🔍 Checking completion status preservation...")
        still_completed = []
        completion_status_preserved = True

        for item in defragged_items:
            if item.name in completed_items:
                if item.is_complete:
                    still_completed.append(item.name)
                    print(f"✅ '{item.name}' - Completion status preserved")
                else:
                    print(f"❌ '{item.name}' - Completion status LOST!")
                    completion_status_preserved = False

        # Show final results
        print("\n📊 Final Results:")
        print(f"   Items that should be completed: {len(completed_items)}")
        print(f"   Items still completed: {len(still_completed)}")
        print(
            f"   Completion status preserved: {'✅ YES' if completion_status_preserved else '❌ NO'}"
        )

        if completion_status_preserved:
            print("\n🎉 SUCCESS: Defrag correctly preserved completion status!")
            return True
        else:
            print("\n💥 FAILURE: Defrag did not preserve completion status!")
            return False

    except Exception as e:
        print(f"❌ Error during test: {e}")
        return False


if __name__ == "__main__":
    success = test_defrag_completion_status()
    sys.exit(0 if success else 1)


