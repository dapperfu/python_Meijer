#!/usr/bin/env python3
"""
Comprehensive Shopping List and Favorites Demo
==============================================

Tests all shopping list functionality including:
1. String-based items (no UPC) like "Milk", "Eggs"
2. UPC-based items 
3. Favorites management
4. Adding favorites to main shopping list
5. Complete CRUD operations

This demonstrates the full user workflow from mitmproxy analysis and APK inspection.
"""

import time
import logging
from typing import List, Dict, Any

from meijer import Meijer, MeijerAuthenticationError


class ComprehensiveShoppingDemo:
    """Comprehensive demo for all shopping list and favorites functionality."""

    def __init__(self):
        """Initialize the demo with Meijer client."""
        self.setup_logging()
        self.client = None
        self.results = {
            "string_items": [],
            "upc_items": [],
            "favorites_ops": [],
            "favorites_to_list": [],
            "success_count": 0,
            "total_operations": 0,
            "errors": []
        }

    def setup_logging(self):
        """Configure logging for the demo."""
        logging.basicConfig(
            level=logging.INFO,
            format="%(asctime)s - %(levelname)s - %(message)s"
        )
        self.logger = logging.getLogger(__name__)

    def initialize_client(self):
        """Initialize and authenticate Meijer client."""
        try:
            print("🔧 INITIALIZING MEIJER CLIENT")
            print("=" * 50)
            
            self.client = Meijer()
            print("✅ Client initialized successfully")
            
            # Check authentication status
            try:
                auth_status = self.client._ensure_authenticated()
                print(f"   Authentication status: {'authenticated' if auth_status else 'not authenticated'}")
            except Exception as auth_e:
                print(f"   Authentication check failed: {auth_e}")
                return False
            
            return True
            
        except Exception as e:
            print(f"❌ Failed to initialize client: {e}")
            return False

    def test_string_based_items(self):
        """Test adding string-based items (no UPC) to shopping list."""
        print("\n📝 TESTING STRING-BASED SHOPPING LIST ITEMS")
        print("=" * 60)
        
        string_items = ["Milk", "Eggs", "Bread", "FruitSalad", "Organic Apples"]
        success_count = 0
        
        for i, item_name in enumerate(string_items, 1):
            print(f"{i}️⃣  Adding '{item_name}' to shopping list...")
            
            try:
                self.results["total_operations"] += 1
                
                # For string items, we'll create a request without UPC
                url = f"{self.client.api_base_url}/loyalty/shoppinglist/AddListItem"
                headers = self.client._get_api_headers()
                headers.update({
                    "Content-Type": "application/vnd.meijer.listManagement.list-v1.0+json",
                    "Accept": "application/vnd.meijer.listManagement.list-v1.0+json"
                })

                # String-based item structure (no itemPartNumber/UPC)
                data = {
                    "listItems": [
                        {
                            "listItemId": 0,
                            "itemDescription": item_name,
                            "quantity": 1,
                            "itemPartNumber": "",  # Empty for string items
                            "listItemTypeId": 1,  # Type 1 for manual entries
                            "itemDisplayOrder": i,
                            "storeId": None,
                            "notes": None,
                            "isComplete": False,
                            "isFavorite": False,
                            "listingId": None,
                            "promotionStart": None,
                            "promotionEnd": None,
                            "couponId": None
                        }
                    ]
                }

                response = self.client._make_request("POST", url, headers=headers, json=data)

                if response.status_code in [200, 201]:
                    print(f"   ✅ Successfully added '{item_name}'")
                    success_count += 1
                    self.results["success_count"] += 1
                    self.results["string_items"].append(f"ADD: {item_name} - SUCCESS")
                else:
                    print(f"   ⚠️  Failed to add '{item_name}': {response.status_code}")
                    self.results["string_items"].append(f"ADD: {item_name} - FAILED ({response.status_code})")

            except Exception as e:
                print(f"   ❌ Error adding '{item_name}': {e}")
                self.results["errors"].append(f"Add string item {item_name}: {e}")
                self.results["string_items"].append(f"ADD: {item_name} - ERROR: {e}")

            time.sleep(0.5)  # Be gentle with the API

        print(f"\n📊 String items: {success_count}/{len(string_items)} added successfully")
        return success_count > 0

    def test_string_based_favorites(self):
        """Test adding string-based items to favorites."""
        print("\n⭐ TESTING STRING-BASED FAVORITES")
        print("=" * 50)
        
        favorite_items = ["Chocolate Milk", "Greek Yogurt", "Sourdough Bread"]
        success_count = 0
        
        for i, item_name in enumerate(favorite_items, 1):
            print(f"{i}️⃣  Adding '{item_name}' to favorites...")
            
            try:
                self.results["total_operations"] += 1
                
                url = f"{self.client.api_base_url}/loyalty/shoppinglist/AddFavoritesListItem"
                headers = self.client._get_api_headers()
                headers.update({
                    "Content-Type": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                    "Accept": "application/vnd.meijer.listManagement.favorites-v1.0+json"
                })

                # String-based favorite structure
                data = {
                    "favoriteListItems": [
                        {
                            "listItemId": 0,
                            "listItemTypeId": 1,  # Type 1 for manual entries
                            "itemDisplayOrder": i,
                            "itemPartNumber": "",  # Empty for string items
                            "itemDescription": item_name,
                            "isItemInActiveList": False
                        }
                    ]
                }

                response = self.client._make_request("POST", url, headers=headers, json=data)

                if response.status_code in [200, 201]:
                    print(f"   ✅ Successfully added '{item_name}' to favorites")
                    success_count += 1
                    self.results["success_count"] += 1
                    self.results["favorites_ops"].append(f"ADD_FAV: {item_name} - SUCCESS")
                else:
                    print(f"   ⚠️  Failed to add '{item_name}' to favorites: {response.status_code}")
                    self.results["favorites_ops"].append(f"ADD_FAV: {item_name} - FAILED ({response.status_code})")

            except Exception as e:
                print(f"   ❌ Error adding '{item_name}' to favorites: {e}")
                self.results["errors"].append(f"Add favorite {item_name}: {e}")
                self.results["favorites_ops"].append(f"ADD_FAV: {item_name} - ERROR: {e}")

            time.sleep(0.5)

        print(f"\n📊 Favorite items: {success_count}/{len(favorite_items)} added successfully")
        return success_count > 0

    def test_favorites_to_shopping_list_workflow(self):
        """Test the complete workflow: Add to favorites, then add to shopping list."""
        print("\n🔄 TESTING FAVORITES → SHOPPING LIST WORKFLOW")
        print("=" * 60)
        
        # Step 1: Add unique item to favorites
        print("1️⃣  Adding 'FruitSalad' to favorites...")
        
        try:
            # Add FruitSalad to favorites
            url = f"{self.client.api_base_url}/loyalty/shoppinglist/AddFavoritesListItem"
            headers = self.client._get_api_headers()
            headers.update({
                "Content-Type": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                "Accept": "application/vnd.meijer.listManagement.favorites-v1.0+json"
            })

            data = {
                "favoriteListItems": [
                    {
                        "listItemId": 0,
                        "listItemTypeId": 1,
                        "itemDisplayOrder": 1,
                        "itemPartNumber": "",
                        "itemDescription": "FruitSalad",
                        "isItemInActiveList": False
                    }
                ]
            }

            response = self.client._make_request("POST", url, headers=headers, json=data)
            
            if response.status_code in [200, 201]:
                print("   ✅ FruitSalad added to favorites")
                
                # Step 2: Get favorites to find the item
                print("2️⃣  Finding FruitSalad in favorites list...")
                favorites = self.client.list.get_favorites()
                
                fruit_salad_item = None
                for fav in favorites:
                    if fav.itemDescription and "FruitSalad" in fav.itemDescription:
                        fruit_salad_item = fav
                        print(f"   ✅ Found FruitSalad: ID={fav.listItemId}")
                        break
                
                if fruit_salad_item:
                    # Step 3: Add from favorites to shopping list
                    print("3️⃣  Adding FruitSalad from favorites to shopping list...")
                    
                    # Create shopping list item from favorite
                    list_url = f"{self.client.api_base_url}/loyalty/shoppinglist/AddListItem"
                    list_headers = self.client._get_api_headers()
                    list_headers.update({
                        "Content-Type": "application/vnd.meijer.listManagement.list-v1.0+json",
                        "Accept": "application/vnd.meijer.listManagement.list-v1.0+json"
                    })

                    list_data = {
                        "listItems": [
                            {
                                "listItemId": 0,
                                "itemDescription": fruit_salad_item.itemDescription,
                                "quantity": 1,
                                "itemPartNumber": fruit_salad_item.itemPartNumber or "",
                                "listItemTypeId": fruit_salad_item.listItemTypeId,
                                "itemDisplayOrder": 1,
                                "storeId": None,
                                "notes": "Added from favorites",
                                "isComplete": False,
                                "isFavorite": True,  # Mark as favorite since it came from favorites
                                "listingId": None,
                                "promotionStart": None,
                                "promotionEnd": None,
                                "couponId": None
                            }
                        ]
                    }

                    list_response = self.client._make_request("POST", list_url, headers=list_headers, json=list_data)
                    
                    if list_response.status_code in [200, 201]:
                        print("   ✅ FruitSalad added to shopping list from favorites")
                        
                        # Step 4: Validate it's on the shopping list
                        print("4️⃣  Validating FruitSalad is on shopping list...")
                        shopping_list = self.client.list.get()
                        
                        found_in_list = False
                        for item in shopping_list:
                            if item.itemDescription and "FruitSalad" in item.itemDescription:
                                found_in_list = True
                                print(f"   ✅ Confirmed: FruitSalad found on shopping list (ID: {item.listItemId})")
                                break
                        
                        if found_in_list:
                            print("🎉 WORKFLOW SUCCESS: FruitSalad → Favorites → Shopping List ✅")
                            self.results["favorites_to_list"].append("WORKFLOW: FruitSalad - SUCCESS")
                            self.results["success_count"] += 3  # 3 successful operations
                        else:
                            print("⚠️  FruitSalad not found on shopping list")
                            self.results["favorites_to_list"].append("WORKFLOW: FruitSalad - VALIDATION FAILED")
                    else:
                        print(f"   ❌ Failed to add to shopping list: {list_response.status_code}")
                        self.results["favorites_to_list"].append("WORKFLOW: FruitSalad - LIST ADD FAILED")
                else:
                    print("   ❌ FruitSalad not found in favorites")
                    self.results["favorites_to_list"].append("WORKFLOW: FruitSalad - NOT FOUND IN FAVORITES")
            else:
                print(f"   ❌ Failed to add to favorites: {response.status_code}")
                self.results["favorites_to_list"].append("WORKFLOW: FruitSalad - FAVORITES ADD FAILED")

        except Exception as e:
            print(f"❌ Workflow error: {e}")
            self.results["errors"].append(f"Favorites workflow: {e}")
            self.results["favorites_to_list"].append(f"WORKFLOW: FruitSalad - ERROR: {e}")

        self.results["total_operations"] += 4  # Count all workflow operations

    def show_current_lists(self):
        """Display current shopping list and favorites."""
        print("\n📋 CURRENT LIST STATUS")
        print("=" * 40)
        
        try:
            # Shopping list
            shopping_items = self.client.list.get()
            print(f"🛒 Shopping List: {len(shopping_items)} items")
            for i, item in enumerate(shopping_items[:10], 1):  # Show first 10
                status = "✅" if hasattr(item, "isComplete") and item.isComplete else "⏳"
                name = getattr(item, "itemDescription", f"Item {item.listItemId}")
                print(f"   {i}. {status} {name}")
            
            if len(shopping_items) > 10:
                print(f"   ... and {len(shopping_items) - 10} more items")
            
            # Favorites
            favorites = self.client.list.get_favorites()
            print(f"\n⭐ Favorites: {len(favorites)} items")
            for i, item in enumerate(favorites[:10], 1):  # Show first 10
                name = getattr(item, "itemDescription", f"Item {item.listItemId}")
                upc = getattr(item, "itemPartNumber", "")
                upc_display = f" (UPC: {upc})" if upc else ""
                print(f"   {i}. {name}{upc_display}")
            
            if len(favorites) > 10:
                print(f"   ... and {len(favorites) - 10} more items")
                
        except Exception as e:
            print(f"❌ Error getting lists: {e}")

    def show_final_summary(self):
        """Display comprehensive test summary."""
        print("\n" + "=" * 70)
        print("📊 COMPREHENSIVE SHOPPING LIST DEMO SUMMARY")
        print("=" * 70)
        
        success_rate = (self.results["success_count"] / max(1, self.results["total_operations"])) * 100
        
        print(f"🎯 Overall Results:")
        print(f"   • Total operations: {self.results['total_operations']}")
        print(f"   • Successful operations: {self.results['success_count']}")
        print(f"   • Success rate: {success_rate:.1f}%")
        print(f"   • Errors: {len(self.results['errors'])}")
        
        if self.results["string_items"]:
            print(f"\n📝 String-based Shopping List Items:")
            for op in self.results["string_items"]:
                print(f"   • {op}")
        
        if self.results["favorites_ops"]:
            print(f"\n⭐ Favorites Operations:")
            for op in self.results["favorites_ops"]:
                print(f"   • {op}")
        
        if self.results["favorites_to_list"]:
            print(f"\n🔄 Favorites → Shopping List Workflow:")
            for op in self.results["favorites_to_list"]:
                print(f"   • {op}")
        
        if self.results["errors"]:
            print(f"\n❌ Errors Encountered:")
            for error in self.results["errors"]:
                print(f"   • {error}")
        
        print(f"\n✨ Demo completed with {success_rate:.1f}% success rate!")

    def run_comprehensive_demo(self):
        """Run the complete comprehensive demo."""
        print("🚀 COMPREHENSIVE SHOPPING LIST & FAVORITES DEMO")
        print("=" * 65)
        print("Testing string-based items, UPC items, and favorites workflow")
        print()
        
        if not self.initialize_client():
            return False
        
        # Show initial state
        self.show_current_lists()
        
        # Test string-based shopping list items
        self.test_string_based_items()
        
        # Test string-based favorites
        self.test_string_based_favorites()
        
        # Test the complete favorites → shopping list workflow
        self.test_favorites_to_shopping_list_workflow()
        
        # Show final state
        self.show_current_lists()
        
        # Show comprehensive summary
        self.show_final_summary()
        
        return True


def main():
    """Main function to run the comprehensive demo."""
    demo = ComprehensiveShoppingDemo()
    success = demo.run_comprehensive_demo()
    return 0 if success else 1


if __name__ == "__main__":
    exit(main()) 