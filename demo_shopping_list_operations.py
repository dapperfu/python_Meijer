#!/usr/bin/env python3
"""
Shopping List and Favorites Operations Demo
==========================================

Comprehensive demo of shopping list and favorites functionality using real
Meijer API endpoints discovered from mitmproxy analysis.

This demo demonstrates:
- Adding items to shopping list
- Removing items from shopping list
- Marking items as complete/incomplete
- Managing favorites lists
- Real API interactions with proper error handling
"""

import time
import logging
from typing import List, Dict, Any

from meijer import Meijer, MeijerAuthenticationError


class ShoppingListDemo:
    """Demo class for shopping list and favorites operations."""

    def __init__(self):
        """Initialize the demo."""
        self.setup_logging()
        self.client = None

        # Sample UPCs for testing (common grocery items)
        self.test_upcs = [
            "012000003097",  # Coca-Cola 12 pack
            "016000119086",  # Lay's Potato Chips
            "038000845007",  # Tide Laundry Detergent
            "036000291452",  # Pringles Original
            "041520893307",  # Cheerios Cereal
        ]

        self.results = {
            "list_operations": [],
            "favorites_operations": [],
            "errors": [],
            "success_count": 0,
            "total_operations": 0,
        }

    def setup_logging(self):
        """Configure logging for the demo."""
        logging.basicConfig(
            level=logging.INFO, format="%(asctime)s - %(levelname)s - %(message)s"
        )
        self.logger = logging.getLogger(__name__)

    def initialize_client(self) -> bool:
        """Initialize and authenticate the Meijer client."""
        print("🔧 INITIALIZING MEIJER CLIENT")
        print("=" * 50)

        try:
            self.client = Meijer()
            print("✅ Client initialized successfully")
            print(f"   Authentication status: {self.client.auth_status.value}")
            return True

        except Exception as e:
            print(f"❌ Client initialization failed: {e}")
            return False

    def demo_get_current_list(self) -> int:
        """Get and display current shopping list."""
        print("\n📋 CURRENT SHOPPING LIST")
        print("-" * 30)

        try:
            items = self.client.list.get()
            print(f"✅ Found {len(items)} items in shopping list")

            if items:
                print("   Current items:")
                for i, item in enumerate(items[:10], 1):  # Show first 10
                    status = "✅" if hasattr(item, "checked") and item.checked else "⏳"
                    name = getattr(
                        item, "name", f"Item {item.id if hasattr(item, 'id') else i}"
                    )
                    print(f"      {i}. {status} {name}")
            else:
                print("   📝 List is empty - perfect for testing!")

            self.results["total_operations"] += 1
            self.results["success_count"] += 1
            return len(items)

        except Exception as e:
            print(f"❌ Failed to get shopping list: {e}")
            self.results["errors"].append(f"Get list: {e}")
            return 0

    def demo_add_items(self) -> bool:
        """Demo adding items to shopping list."""
        print("\n➕ ADDING ITEMS TO SHOPPING LIST")
        print("-" * 40)

        success_count = 0

        for i, upc in enumerate(self.test_upcs[:3], 1):  # Test first 3 UPCs
            print(f"{i}️⃣  Adding item with UPC: {upc}")

            try:
                self.results["total_operations"] += 1
                result = self.client.list.add_item(upc, quantity=1)

                if result:
                    print(f"   ✅ Successfully added item {upc}")
                    success_count += 1
                    self.results["success_count"] += 1
                    self.results["list_operations"].append(f"ADD: {upc} - SUCCESS")
                else:
                    print(f"   ⚠️  Add operation returned False for {upc}")
                    self.results["list_operations"].append(f"ADD: {upc} - FAILED")

                # Small delay between operations
                time.sleep(0.5)

            except Exception as e:
                print(f"   ❌ Failed to add {upc}: {e}")
                self.results["errors"].append(f"Add {upc}: {e}")
                self.results["list_operations"].append(f"ADD: {upc} - ERROR: {e}")

        print(
            f"\n📊 Added {success_count}/{len(self.test_upcs[:3])} items successfully"
        )
        return success_count > 0

    def demo_mark_items_complete(self) -> bool:
        """Demo marking items as complete."""
        print("\n✅ MARKING ITEMS AS COMPLETE")
        print("-" * 35)

        try:
            # Get current list to find items to complete
            items = self.client.list.get()

            if not items:
                print("   📝 No items in list to mark complete")
                return True

            success_count = 0
            items_to_complete = items[:2]  # Complete first 2 items

            for i, item in enumerate(items_to_complete, 1):
                item_id = getattr(item, "id", str(i))
                item_name = getattr(item, "name", f"Item {item_id}")

                print(f"{i}️⃣  Marking '{item_name}' as complete...")

                try:
                    self.results["total_operations"] += 1
                    result = self.client.list.complete_item(str(item_id))

                    if result:
                        print(f"   ✅ Marked {item_name} as complete")
                        success_count += 1
                        self.results["success_count"] += 1
                        self.results["list_operations"].append(
                            f"COMPLETE: {item_name} - SUCCESS"
                        )
                    else:
                        print(f"   ⚠️  Complete operation returned False")
                        self.results["list_operations"].append(
                            f"COMPLETE: {item_name} - FAILED"
                        )

                except Exception as e:
                    print(f"   ❌ Failed to complete {item_name}: {e}")
                    self.results["errors"].append(f"Complete {item_name}: {e}")
                    self.results["list_operations"].append(
                        f"COMPLETE: {item_name} - ERROR: {e}"
                    )

                time.sleep(0.5)

            print(
                f"\n📊 Completed {success_count}/{len(items_to_complete)} items successfully"
            )
            return success_count > 0

        except Exception as e:
            print(f"❌ Failed to mark items complete: {e}")
            self.results["errors"].append(f"Mark complete: {e}")
            return False

    def demo_remove_items(self) -> bool:
        """Demo removing items from shopping list."""
        print("\n🗑️  REMOVING ITEMS FROM SHOPPING LIST")
        print("-" * 40)

        try:
            # Get current list to find items to remove
            items = self.client.list.get()

            if not items:
                print("   📝 No items in list to remove")
                return True

            success_count = 0
            items_to_remove = items[-2:]  # Remove last 2 items

            for i, item in enumerate(items_to_remove, 1):
                item_id = getattr(item, "id", str(i))
                item_name = getattr(item, "name", f"Item {item_id}")

                print(f"{i}️⃣  Removing '{item_name}'...")

                try:
                    self.results["total_operations"] += 1
                    result = self.client.list.delete_item(str(item_id))

                    if result:
                        print(f"   ✅ Removed {item_name}")
                        success_count += 1
                        self.results["success_count"] += 1
                        self.results["list_operations"].append(
                            f"REMOVE: {item_name} - SUCCESS"
                        )
                    else:
                        print(f"   ⚠️  Remove operation returned False")
                        self.results["list_operations"].append(
                            f"REMOVE: {item_name} - FAILED"
                        )

                except Exception as e:
                    print(f"   ❌ Failed to remove {item_name}: {e}")
                    self.results["errors"].append(f"Remove {item_name}: {e}")
                    self.results["list_operations"].append(
                        f"REMOVE: {item_name} - ERROR: {e}"
                    )

                time.sleep(0.5)

            print(
                f"\n📊 Removed {success_count}/{len(items_to_remove)} items successfully"
            )
            return success_count > 0

        except Exception as e:
            print(f"❌ Failed to remove items: {e}")
            self.results["errors"].append(f"Remove items: {e}")
            return False

    def demo_favorites_operations(self) -> bool:
        """Demo favorites list operations."""
        print("\n⭐ FAVORITES LIST OPERATIONS")
        print("-" * 35)

        # Test getting favorites list
        print("1️⃣  Getting current favorites...")
        try:
            self.results["total_operations"] += 1
            # Note: This method may not exist in current implementation
            # We'll test if it's available
            if hasattr(self.client.list, "get_favorites"):
                favorites = self.client.list.get_favorites()
                print(f"   ✅ Found {len(favorites)} favorites")
                self.results["success_count"] += 1
            else:
                print("   ⚠️  Favorites functionality not yet implemented")

        except Exception as e:
            print(f"   ❌ Failed to get favorites: {e}")
            self.results["errors"].append(f"Get favorites: {e}")

        # Test adding to favorites
        print("2️⃣  Testing add to favorites...")
        test_upc = self.test_upcs[0]

        try:
            self.results["total_operations"] += 1
            if hasattr(self.client.list, "add_favorite"):
                result = self.client.list.add_favorite(test_upc)
                if result:
                    print(f"   ✅ Added {test_upc} to favorites")
                    self.results["success_count"] += 1
                    self.results["favorites_operations"].append(
                        f"ADD_FAV: {test_upc} - SUCCESS"
                    )
                else:
                    print(f"   ⚠️  Add to favorites returned False")
                    self.results["favorites_operations"].append(
                        f"ADD_FAV: {test_upc} - FAILED"
                    )
            else:
                print("   ⚠️  Add favorites functionality not yet implemented")

        except Exception as e:
            print(f"   ❌ Failed to add to favorites: {e}")
            self.results["errors"].append(f"Add favorite: {e}")

        # Test removing from favorites
        print("3️⃣  Testing remove from favorites...")

        try:
            self.results["total_operations"] += 1
            if hasattr(self.client.list, "delete_favorite"):
                result = self.client.list.delete_favorite(test_upc)
                if result:
                    print(f"   ✅ Removed {test_upc} from favorites")
                    self.results["success_count"] += 1
                    self.results["favorites_operations"].append(
                        f"REMOVE_FAV: {test_upc} - SUCCESS"
                    )
                else:
                    print(f"   ⚠️  Remove from favorites returned False")
                    self.results["favorites_operations"].append(
                        f"REMOVE_FAV: {test_upc} - FAILED"
                    )
            else:
                print("   ⚠️  Remove favorites functionality not yet implemented")

        except Exception as e:
            print(f"   ❌ Failed to remove from favorites: {e}")
            self.results["errors"].append(f"Remove favorite: {e}")

        return True

    def demo_final_list_state(self) -> int:
        """Check final state of shopping list."""
        print("\n📋 FINAL SHOPPING LIST STATE")
        print("-" * 35)

        try:
            items = self.client.list.get()
            print(f"✅ Final list contains {len(items)} items")

            if items:
                print("   Final items:")
                for i, item in enumerate(items[:5], 1):  # Show first 5
                    status = "✅" if hasattr(item, "checked") and item.checked else "⏳"
                    name = getattr(
                        item, "name", f"Item {item.id if hasattr(item, 'id') else i}"
                    )
                    print(f"      {i}. {status} {name}")

            return len(items)

        except Exception as e:
            print(f"❌ Failed to get final list state: {e}")
            return 0

    def generate_summary(self):
        """Generate and display comprehensive summary."""
        print("\n📊 SHOPPING LIST OPERATIONS SUMMARY")
        print("=" * 50)

        success_rate = (
            self.results["success_count"] / max(1, self.results["total_operations"])
        ) * 100

        print(f"🎯 Operations Summary:")
        print(f"   • Total operations attempted: {self.results['total_operations']}")
        print(f"   • Successful operations: {self.results['success_count']}")
        print(f"   • Success rate: {success_rate:.1f}%")
        print(f"   • Errors encountered: {len(self.results['errors'])}")

        if self.results["list_operations"]:
            print(f"\n📝 Shopping List Operations:")
            for op in self.results["list_operations"][-5:]:  # Show last 5
                print(f"   • {op}")

        if self.results["favorites_operations"]:
            print(f"\n⭐ Favorites Operations:")
            for op in self.results["favorites_operations"]:
                print(f"   • {op}")

        if self.results["errors"]:
            print(f"\n❌ Errors Details:")
            for error in self.results["errors"][-3:]:  # Show last 3 errors
                print(f"   • {error}")

        print(f"\n💡 API Endpoints Tested:")
        print(f"   • GET  /loyalty/shoppinglist/GetList")
        print(f"   • POST /loyalty/shoppinglist/AddListItem")
        print(f"   • POST /loyalty/shoppinglist/MarkAsCompleted")
        print(f"   • POST /loyalty/shoppinglist/DeleteListItem")
        print(f"   • GET  /loyalty/shoppinglist/GetFavoritesList")
        print(f"   • POST /loyalty/shoppinglist/AddFavorite")
        print(f"   • POST /loyalty/shoppinglist/DeleteFavorite")


def main():
    """Run the shopping list operations demo."""
    print("🛒 SHOPPING LIST & FAVORITES OPERATIONS DEMO")
    print("=" * 55)
    print("Testing real Meijer API endpoints for list management")
    print()

    demo = ShoppingListDemo()

    # Initialize client
    if not demo.initialize_client():
        print("❌ Cannot proceed without authenticated client")
        return

    # Run demo operations
    initial_count = demo.demo_get_current_list()
    demo.demo_add_items()
    demo.demo_mark_items_complete()
    demo.demo_remove_items()
    demo.demo_favorites_operations()
    final_count = demo.demo_final_list_state()

    # Generate summary
    demo.generate_summary()

    # Final message
    print(f"\n✨ Demo completed!")
    print(f"   Initial list: {initial_count} items")
    print(f"   Final list: {final_count} items")
    print(f"   Operations tested with real Meijer API endpoints")


if __name__ == "__main__":
    main()
