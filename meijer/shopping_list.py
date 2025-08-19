"""
Shopping list management for Meijer API.

This module provides functionality for managing shopping lists, including
adding/removing items, managing favorites, and list operations.
"""

import json
from typing import TYPE_CHECKING, Any, Dict, List, Optional
from urllib.parse import urljoin

try:
    from .search import Search

    SEARCH_AVAILABLE = True
except ImportError:
    SEARCH_AVAILABLE = False

from .exceptions import MeijerAuthenticationError
from .models import ListItem

if TYPE_CHECKING:
    from .client import Meijer


class MeijerList:
    """
    Meijer Shopping List management.

    Provides complete shopping list functionality including:
    - Getting shopping list items
    - Adding new items
    - Completing/uncompleting items
    - Clearing completed items
    - Managing favorites
    """

    def __init__(self, meijer_client: "Meijer"):
        """Initialize shopping list with reference to Meijer client."""
        self.meijer = meijer_client
        self.logger = meijer_client.logger

        # Real shopping list API endpoints from APK analysis (Hq/d.java)
        self.endpoints = {
            "get_list": "/loyalty/shoppinglist/GetList",
            "add_item": "/loyalty/shoppinglist/AddListItem",
            "delete_item": "/loyalty/shoppinglist/DeleteListItem/{itemId}",
            "mark_complete": "/loyalty/shoppinglist/MarkAsCompleted/{itemId}",
            "mark_incomplete": "/loyalty/shoppinglist/MarkAsNotCompleted/{itemId}",
            "update_item": "/loyalty/shoppinglist/UpdateListItem/{itemId}",
            "reorder_item": "/loyalty/shoppinglist/listItem/order",
            "delete_all": "/loyalty/shoppinglist/DeleteAllListItems",
            "get_favorites": "/loyalty/shoppinglist/GetFavoritesList",
            "add_favorite": "/loyalty/shoppinglist/AddFavoritesListItem",
            "delete_favorite": "/loyalty/shoppinglist/DeleteBulkListItems",  # Add missing endpoint
            "delete_bulk_favorites": "/loyalty/shoppinglist/DeleteBulkListItems",
        }

    def get(self) -> List[ListItem]:
        """Get shopping list items."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["get_list"])
            headers = self.meijer._get_api_headers()
            headers.update(
                {"Accept": "application/meijer.shoppingList.ShoppingList-v1.0+json"}
            )

            response = self.meijer._make_request("GET", url, headers=headers)

            if response.status_code == 200:
                data = response.json()
                self.logger.info("🔍 RAW API RESPONSE for shopping list:")
                self.logger.info(f"   - Response data: {data}")

                items = []
                for item_data in data.get("listItems", []):
                    self.logger.info(f"🔍 RAW ITEM DATA: {item_data}")

                    # Map API response keys to ListItem constructor parameters
                    mapped_data = self._map_api_response_to_listitem(item_data)
                    self.logger.info(f"🔍 MAPPED ITEM DATA: {mapped_data}")
                    item = ListItem(**mapped_data)
                    # Attach API handle so item.complete setter can call remote endpoints
                    item._list_api = self
                    items.append(item)
                return items
            else:
                self.logger.error(
                    f"Failed to get shopping list: {response.status_code}"
                )
                if response.status_code == 401:
                    raise MeijerAuthenticationError(
                        "Authentication failed - token may be expired"
                    )
                elif response.status_code == 404:
                    # List doesn't exist yet, return empty list
                    return []
                else:
                    # Other errors should raise an exception
                    raise Exception(
                        f"API error {response.status_code}: {response.text}"
                    )

        except MeijerAuthenticationError:
            # Re-raise authentication errors
            raise
        except Exception as e:
            self.logger.error(f"Error getting shopping list: {e}")
            raise

    def add(self, item_name: str, quantity: int = 1, notes: str = None) -> bool:
        """
        Add item to shopping list with a simple interface.

        This is a convenience method for the CLI that creates a UPC from the item name.

        Args:
            item_name: Name/description of the item to add
            quantity: Quantity to add
            notes: Optional notes for the item

        Returns:
            bool: True if successful, False otherwise
        """
        # Generate a simple UPC from the item name hash
        upc = f"ITEM_{hash(item_name) % 10000}"
        return self.add_item_with_details(
            upc=upc, quantity=quantity, description=item_name, notes=notes
        )

    def add_item_with_details(
        self,
        upc: str,
        quantity: int = 1,
        description: Optional[str] = None,
        notes: Optional[str] = None,
        display_order: int = 1,
    ) -> bool:
        """Add item to shopping list with custom description and notes."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["add_item"])
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis (Hq/d.java)
            headers.update(
                {
                    "Content-Type": "application/vnd.meijer.listManagement.list-v1.0+json",
                    "Accept": "application/vnd.meijer.listManagement.list-v1.0+json",
                }
            )

            # Real request body structure from APK (ShoppingListAddItemRequest + ShoppingListItemWireModel)
            data = {
                "listItems": [
                    {
                        "listItemId": 0,  # New item
                        "itemDescription": description or f"Product {upc}",
                        "quantity": quantity,
                        "itemPartNumber": upc,  # UPC goes here
                        "listItemTypeId": 1,  # Standard item type
                        "itemDisplayOrder": display_order,
                        "storeId": None,
                        "notes": notes,
                        "isComplete": False,
                        "isFavorite": False,
                        "listingId": None,
                        "promotionStart": None,
                        "promotionEnd": None,
                        "couponId": None,
                    }
                ]
            }

            response = self.meijer._make_request(
                "POST", url, headers=headers, json_data=data
            )

            if response.status_code in [200, 201]:
                self.logger.info(f"Added item {description or upc} to shopping list")
                return True
            else:
                self.logger.error(
                    f"Failed to add item: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error adding item to shopping list: {e}")
            return False

    def complete_item(self, item_id: str) -> bool:
        """Mark item as completed using real APK-discovered endpoint."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            # Use real endpoint with itemId path parameter from APK (Hq/d.java)
            endpoint = self.endpoints["mark_complete"].format(itemId=item_id)
            url = urljoin(self.meijer.api_base_url, endpoint)
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis
            headers.update(
                {"Accept": "application/vnd.meijer.listManagement.listItem-v1.0+json"}
            )

            # PUT request with no body, itemId in path
            response = self.meijer._make_request("PUT", url, headers=headers)

            if response.status_code in [
                200,
                201,
                204,
                205,
            ]:  # 205 = Reset Content (success)
                self.logger.info(f"Completed item {item_id}")
                return True
            else:
                self.logger.error(
                    f"Failed to complete item: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error completing item: {e}")
            return False

    def mark_as_not_completed(self, item_id: str) -> bool:
        """Mark item as not completed using real APK-discovered endpoint."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            # Use real endpoint with itemId path parameter from APK (Hq/d.java)
            endpoint = self.endpoints["mark_incomplete"].format(itemId=item_id)
            url = urljoin(self.meijer.api_base_url, endpoint)
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis
            headers.update(
                {"Accept": "application/vnd.meijer.listManagement.listItem-v1.0+json"}
            )

            # PUT request with no body, itemId in path
            response = self.meijer._make_request("PUT", url, headers=headers)

            if response.status_code in [
                200,
                201,
                204,
                205,
            ]:  # 205 = Reset Content (success)
                self.logger.info(f"Marked item {item_id} as not completed")
                return True
            else:
                self.logger.error(
                    f"Failed to mark item as not completed: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error marking item as not completed: {e}")
            return False

    def delete_item(self, item_id: str) -> bool:
        """
        Delete an item from the shopping list.

        Args:
            item_id: ID of the item to delete

        Returns:
            bool: True if deletion was successful, False otherwise
        """
        try:
            # Use the correct endpoint format with path parameter
            url = f"{self.meijer.api_base_url}/loyalty/shoppinglist/DeleteListItem/{item_id}"

            # DELETE request with no body (path parameter)
            response = self.meijer._make_request("DELETE", url)

            if response.status_code == 200:
                self.logger.info(f"✅ Deleted item {item_id}")
                return True
            else:
                self.logger.error(
                    f"❌ Failed to delete item {item_id}: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"❌ Error deleting item {item_id}: {e}")
            return False

    def clear_list(self) -> bool:
        """
        Clear all items from the shopping list using the bulk delete endpoint.

        Returns:
            bool: True if clearing was successful, False otherwise
        """
        try:
            # Check if list is already empty
            items = self.get()
            if not items:
                self.logger.info("ℹ️  Shopping list is already empty")
                return True

            self.logger.info(
                f"🗑️  Clearing {len(items)} items from shopping list using bulk delete..."
            )

            # Use the bulk delete endpoint for efficiency
            url = urljoin(self.meijer.api_base_url, self.endpoints["delete_all"])
            headers = self.meijer._get_api_headers()

            # Use the appropriate content type for bulk operations
            headers.update(
                {
                    "Content-Type": "application/vnd.meijer.listManagement.list-v1.0+json",
                    "Accept": "application/vnd.meijer.listManagement.list-v1.0+json",
                }
            )

            # Send DELETE request to clear all items
            response = self.meijer._make_request("DELETE", url, headers=headers)

            if response.status_code == 200:
                self.logger.info(
                    f"✅ Successfully cleared {len(items)} items from shopping list"
                )
                return True
            else:
                self.logger.warning(
                    f"⚠️  Bulk clear failed with status {response.status_code}, falling back to individual deletion..."
                )

                # Fallback to individual deletion if bulk clear fails
                deleted_count = 0
                for item in items:
                    if self.delete_item(str(item.list_item_id)):
                        deleted_count += 1
                    else:
                        self.logger.warning(f"⚠️  Failed to delete item: {item.name}")

                self.logger.info(
                    f"✅ Cleared {deleted_count} items from shopping list (fallback method)"
                )
                return deleted_count == len(items)

        except Exception as e:
            self.logger.error(f"❌ Error clearing shopping list: {e}")
            return False

    def get_favorites(self) -> List[ListItem]:
        """Get favorites list items using real APK-discovered endpoint."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["get_favorites"])
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis (Hq/d.java)
            headers.update({"Accept": "application/vnd.meijer.favorites-v1.0+json"})

            response = self.meijer._make_request("GET", url, headers=headers)

            if response.status_code == 200:
                data = response.json()
                self.logger.info(
                    f"Get favorites response: Found {data.get('totalCount', 0)} total favorites"
                )
                items = []
                # Use correct field name from API response: 'favoriteListItems' not 'favoriteItems'
                for item_data in data.get("favoriteListItems", []):
                    # Map API response keys to ListItem constructor parameters
                    mapped_data = self._map_api_response_to_listitem(item_data)
                    item = ListItem(**mapped_data)
                    item._list_api = self
                    items.append(item)
                return items
            else:
                self.logger.error(
                    f"Failed to get favorites list: {response.status_code}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Error getting favorites list: {e}")
            return []

    def add_favorite(self, upc: str) -> bool:
        """Add item to favorites by UPC using real APK-discovered endpoint."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["add_favorite"])
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis (Hq/d.java)
            headers.update(
                {
                    "Content-Type": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                    "Accept": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                }
            )

            # Real request body structure from APK (AddFavoritesItemsRequest + FavoriteListItemWireModel)
            data = {
                "favoriteListItems": [
                    {
                        "listItemId": 0,  # New favorite
                        "listItemTypeId": 1,  # Standard item type
                        "itemDisplayOrder": 1,
                        "itemPartNumber": upc,  # UPC goes here
                        "itemDescription": f"Product {upc}",
                        "isItemInActiveList": False,
                    }
                ]
            }

            response = self.meijer._make_request(
                "POST", url, headers=headers, json_data=data
            )

            if response.status_code in [200, 201]:  # 201 = Created (success)
                self.logger.info(f"Added item {upc} to favorites")
                # Log the response to understand the structure
                try:
                    response_data = response.json()
                    self.logger.info(f"Add favorite response: {response_data}")
                except (json.JSONDecodeError, ValueError):
                    self.logger.info(
                        f"Add favorite response (non-JSON): {response.text}"
                    )
                return True
            else:
                self.logger.error(
                    f"Failed to add to favorites: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error adding item to favorites: {e}")
            return False

    def delete_favorite(self, upc: str) -> bool:
        """Delete item from favorites by UPC using real APK-discovered endpoint."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            # Refresh favorites list to get the latest state
            self.logger.info(f"Refreshing favorites list to find item {upc}")
            favorites = self.get_favorites()

            self.logger.info(f"Found {len(favorites)} favorites")
            for i, item in enumerate(favorites):
                self.logger.info(
                    f"  {i + 1}. ID:{getattr(item, 'list_item_id', 'N/A')} UPC:{getattr(item, 'item_part_number', 'N/A')} Desc:{getattr(item, 'item_description', 'N/A')}"
                )

            # Try multiple ways to match the item
            target_item = None
            for item in favorites:
                # Try exact UPC match
                if getattr(item, "item_part_number", None) == upc:
                    target_item = item
                    self.logger.info(f"Found exact UPC match: {item.list_item_id}")
                    break
                # Try description match as fallback
                elif getattr(item, "item_description", "") and upc in getattr(
                    item, "item_description", ""
                ):
                    target_item = item
                    self.logger.info(f"Found description match: {item.list_item_id}")
                    break

            if not target_item:
                self.logger.warning(f"Item {upc} not found in favorites after refresh")
                self.logger.warning("Available favorites:")
                for item in favorites:
                    self.logger.warning(
                        f"  - UPC: {getattr(item, 'item_part_number', 'None')}, Desc: {getattr(item, 'item_description', 'None')}"
                    )
                return False

            self.logger.info(
                f"Attempting to delete favorite item ID: {target_item.list_item_id}"
            )

            # Use real endpoint with listItemIds array from APK (Hq/d.java)
            url = urljoin(self.meijer.api_base_url, self.endpoints["delete_favorite"])
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis
            headers.update(
                {
                    "Content-Type": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                    "Accept": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                }
            )

            # Real request body structure from APK (DeleteFavoritesItemsRequest)
            data = {
                "listItemIds": [
                    target_item.list_item_id
                ]  # Array of Long listItemIds to delete
            }

            response = self.meijer._make_request(
                "POST", url, headers=headers, json_data=data
            )

            if response.status_code in [200, 201, 204, 205]:  # Accept all success codes
                self.logger.info(
                    f"Successfully removed item {upc} (ID:{target_item.list_item_id}) from favorites"
                )
                return True
            else:
                self.logger.error(
                    f"Failed to remove from favorites: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error removing item from favorites: {e}")
            return False

    def defrag(
        self, store_id: Optional[str] = None, reverse: bool = False, zig: bool = False
    ) -> bool:
        """
        Defrag the shopping list by organizing items by aisle/location.

        Args:
            store_id: Store ID to use for location lookup (defaults to current store)
            reverse: If True, sort items in reverse order (descending)
            zig: If True, alternate B aisle sorting (B1 ascending, B2 descending, etc.)

        Returns:
            bool: True if defrag was successful, False otherwise
        """
        if not store_id:
            # Try to get store ID from current context
            try:
                stores = self.meijer.get_stores()
                if stores:
                    store_id = str(stores[0].store_id)
                else:
                    store_id = "217"  # Default store from logs
            except Exception as e:
                self.logger.warning(f"⚠️  Failed to get stores: {e}")
                store_id = "217"  # Default store from logs

        self.logger.info(f"🔧 Starting shopping list defrag for store: {store_id}")

        # Get current list items
        try:
            items = self.get()
        except Exception as e:
            self.logger.error(f"❌ Failed to get list items: {e}")
            return False

        if not items:
            self.logger.info("ℹ️  No items to defrag")
            return True

        self.logger.info("⏳ This may take a moment to search for product locations...")

        # Process each item to get location information
        items_with_locations = []

        for item in items:
            try:
                # First, try to get product detail if we have a UPC
                location_info = None
                matched_product = None
                match_confidence = "Low"

                if item.item_part_number and item.item_part_number.startswith(
                    ("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
                ):
                    # This looks like a UPC, try to get product detail
                    try:
                        product_detail = self.meijer.get_product_detail(
                            item.item_part_number, store_id
                        )
                        if product_detail and product_detail.aisle_primary:
                            # We have real aisle data from product detail
                            location_info = {
                                "aisle": product_detail.aisle_primary,
                                "section": product_detail.section,
                                "bay": product_detail.bay,
                                "zone": "Store",
                                "zone_code": "STORE",
                            }
                            matched_product = {
                                "title": product_detail.title,
                                "price": product_detail.price,
                                "brand": product_detail.brand,
                                "category": product_detail.category,
                                "aisle": product_detail.aisle_primary,
                                "section": product_detail.section,
                                "bay": product_detail.bay,
                            }
                            self.logger.debug(
                                f"🔍 Created matched_product with title: {product_detail.title}"
                            )
                            match_confidence = "High"
                            self.logger.info(
                                f"📍 Found real location via search: {product_detail.aisle_primary}"
                            )
                        else:
                            self.logger.info(
                                f"📍 No location data found for UPC {item.item_part_number}"
                            )
                    except Exception as e:
                        self.logger.warning(
                            f"⚠️  Error fetching product detail for UPC {item.item_part_number}: {e}"
                        )

                # If we don't have real location data, fall back to search
                if not location_info:
                    # Split item name by comma and search for first part only
                    search_query = item.name.split(",")[0].strip()
                    self.logger.info(f"🔍 Searching for: {search_query}")

                    # Initialize search client
                    if not SEARCH_AVAILABLE:
                        self.logger.warning(
                            "⚠️  Search functionality not available, skipping search"
                        )
                        location_info = {
                            "aisle": "Search_Unavailable",
                            "section": "Online",
                            "zone": "Online",
                            "zone_code": "ONLINE",
                        }
                        matched_product = {
                            "title": item.name,
                            "price": None,
                            "brand": None,
                            "category": None,
                            "aisle": "Online",
                            "section": "No_Search",
                        }
                        match_confidence = "Low"
                    else:
                        try:
                            search_client = Search(self.meijer)

                            # Search for the item
                            search_results = search_client.search(
                                query=search_query,
                                results_per_page=5,  # Just get first few results
                                store_id=store_id,
                            )

                            if search_results and search_results.results:
                                # Found search results
                                top_result = search_results.results[0]

                                # Try to get product detail for the top search result
                                if top_result.upc:
                                    try:
                                        product_detail = self.meijer.get_product_detail(
                                            top_result.upc, store_id
                                        )
                                        if (
                                            product_detail
                                            and product_detail.aisle_primary
                                        ):
                                            # We have real location data from search result!
                                            location_info = {
                                                "aisle": product_detail.aisle_primary,
                                                "section": product_detail.section,
                                                "bay": product_detail.bay,
                                                "zone": "Store",
                                                "zone_code": "STORE",
                                            }
                                            matched_product = {
                                                "title": product_detail.title,
                                                "price": product_detail.price,
                                                "brand": product_detail.brand,
                                                "category": product_detail.category,
                                                "aisle": product_detail.aisle_primary,
                                                "section": product_detail.section,
                                                "bay": product_detail.bay,
                                            }
                                            match_confidence = "High"
                                            self.logger.info(
                                                f"📍 Found real location via search: {product_detail.aisle_primary}"
                                            )
                                        else:
                                            # No real location, but we have search results - try to use group_ids for organization
                                            category_aisle = "Search_Low"
                                            if (
                                                hasattr(top_result, "raw_data")
                                                and "data" in top_result.raw_data
                                            ):
                                                data = top_result.raw_data["data"]
                                                if (
                                                    "group_ids" in data
                                                    and data["group_ids"]
                                                ):
                                                    # Parse group_ids to find the most relevant location information
                                                    group_ids = data["group_ids"]

                                                    # Look for L3 (subcategory) first as it seems to contain aisle info
                                                    l3_groups = [
                                                        g
                                                        for g in group_ids
                                                        if g.startswith("L3-")
                                                    ]
                                                    if l3_groups:
                                                        # Use L3 subcategory as aisle information
                                                        primary_group = l3_groups[0]
                                                        category_aisle = primary_group  # Keep full format like "L3-4131"
                                                        self.logger.info(
                                                            f"📍 Using L3 subcategory as aisle: {category_aisle}"
                                                        )
                                                    else:
                                                        # Fall back to L2 category if no L3
                                                        l2_groups = [
                                                            g
                                                            for g in group_ids
                                                            if g.startswith("L2-")
                                                        ]
                                                        if l2_groups:
                                                            primary_group = l2_groups[0]
                                                            category_aisle = (
                                                                primary_group
                                                            )
                                                            self.logger.info(
                                                                f"📍 Using L2 category as aisle: {category_aisle}"
                                                            )
                                                        else:
                                                            # Use first available group
                                                            primary_group = group_ids[0]
                                                            category_aisle = (
                                                                primary_group
                                                            )
                                                            self.logger.info(
                                                                f"📍 Using first group as aisle: {category_aisle}"
                                                            )

                                            location_info = {
                                                "aisle": category_aisle,
                                                "section": "Category",
                                                "zone": "Store",
                                                "zone_code": "CATEGORY",
                                            }
                                            matched_product = {
                                                "title": top_result.title,
                                                "price": top_result.price,
                                                "brand": top_result.brand,
                                                "category": top_result.category,
                                                "aisle": category_aisle,
                                                "section": "Category",
                                            }
                                            match_confidence = "Medium"
                                            self.logger.info(
                                                f"📍 Using search result with category: {top_result.title}"
                                            )
                                    except Exception as e:
                                        self.logger.warning(
                                            f"⚠️  Error fetching product detail for search result UPC {top_result.upc}: {e}"
                                        )
                                        # Fall back to search result only
                                        location_info = {
                                            "aisle": f"Search_{match_confidence}",
                                            "section": "Online",
                                            "zone": "Online",
                                            "zone_code": "ONLINE",
                                        }
                                        matched_product = {
                                            "title": top_result.title,
                                            "price": top_result.price,
                                            "brand": top_result.brand,
                                            "category": top_result.category,
                                            "aisle": "Online",
                                            "section": "Search",
                                        }
                                        match_confidence = "Medium"
                                else:
                                    # No UPC, use search result directly
                                    location_info = {
                                        "aisle": f"Search_{match_confidence}",
                                        "section": "Online",
                                        "zone": "Online",
                                        "zone_code": "ONLINE",
                                    }
                                    matched_product = {
                                        "title": top_result.title,
                                        "price": top_result.price,
                                        "brand": top_result.brand,
                                        "category": top_result.category,
                                        "aisle": "Online",
                                        "section": "Search",
                                    }
                                    match_confidence = "Medium"
                                    self.logger.info(
                                        f"📍 Using search result without UPC: {top_result.title}"
                                    )
                            else:
                                # No search results found
                                self.logger.warning(
                                    f"⚠️  No search results found for {search_query}"
                                )

                                # Try to find related results by searching for broader terms
                                broader_terms = self._get_broader_search_terms(
                                    search_query
                                )
                                found_related = False

                                for broader_term in broader_terms:
                                    try:
                                        related_results = search_client.search(
                                            query=broader_term,
                                            results_per_page=3,
                                            store_id=store_id,
                                        )

                                        if related_results and related_results.results:
                                            top_related = related_results.results[0]
                                            self.logger.info(
                                                f"📍 Found related result for '{broader_term}': {top_related.title}"
                                            )

                                            location_info = {
                                                "aisle": f"Related_{match_confidence}",
                                                "section": "Online",
                                                "zone": "Online",
                                                "zone_code": "ONLINE",
                                            }
                                            matched_product = {
                                                "title": top_related.title,
                                                "price": top_related.price,
                                                "brand": top_related.brand,
                                                "category": top_related.category,
                                                "aisle": "Online",
                                                "section": "Related",
                                            }
                                            match_confidence = "Low"
                                            found_related = True
                                            break

                                    except Exception as e:
                                        self.logger.debug(
                                            f"Debug: No related results for '{broader_term}': {e}"
                                        )
                                        continue

                                if not found_related:
                                    # No related results either
                                    location_info = {
                                        "aisle": f"Search_{match_confidence}",
                                        "section": "Online",
                                        "zone": "Online",
                                        "zone_code": "ONLINE",
                                    }
                                    matched_product = {
                                        "title": item.name,
                                        "price": None,
                                        "brand": None,
                                        "category": None,
                                        "aisle": "Online",
                                        "section": "No_Match",
                                    }
                                    match_confidence = "Low"
                                    self.logger.warning(
                                        f"⚠️  No related results found for {search_query}"
                                    )
                        except Exception as e:
                            self.logger.error(
                                f"❌ Search failed for {search_query}: {e}"
                            )
                            # Use fallback location
                            location_info = {
                                "aisle": f"Search_{match_confidence}",
                                "section": "Online",
                                "zone": "Online",
                                "zone_code": "ONLINE",
                            }
                            matched_product = {
                                "title": item.name,
                                "price": None,
                                "brand": None,
                                "category": None,
                                "aisle": "Online",
                                "section": "Error",
                            }
                            match_confidence = "Low"

                # Store item with location information for sorting
                items_with_locations.append(
                    {
                        "item": item,
                        "location": location_info,
                        "matched_product": matched_product,
                        "match_confidence": match_confidence,
                    }
                )

            except Exception as e:
                self.logger.error(f"❌ Error processing item '{item.name}': {e}")
                # Add error item to list
                items_with_locations.append(
                    {
                        "item": item,
                        "location": {
                            "aisle": "Error",
                            "section": "Error",
                            "zone": "Error",
                            "zone_code": "ERROR",
                        },
                        "matched_product": {
                            "title": item.name,
                            "price": None,
                            "brand": None,
                            "category": None,
                            "aisle": "Error",
                            "section": "Error",
                        },
                        "match_confidence": "Error",
                    }
                )

        # Sort items by location (real aisles first, then search confidence)
        def get_location_sort_key(item_data):
            location = item_data.get("location")
            match_confidence = item_data.get("match_confidence", "Low")

            if location and location.get("zone_code") in ["STORE", "CATEGORY"]:
                # Real store location or category-based location - sort by aisle, then section
                aisle = location.get("aisle", "")
                section = location.get("section", "")

                # Extract aisle number for sorting (e.g., "B15" -> 2, "A14" -> 1, "Cat_L2-10357" -> category order)
                aisle_num = 0
                if aisle:
                    try:
                        if aisle.startswith("Cat_"):
                            # Category-based aisle - use a hash for consistent ordering
                            aisle_num = (
                                500 + hash(aisle) % 100
                            )  # Put categories in middle range
                        elif aisle.startswith("L"):
                            # L-level category - use a hash for consistent ordering
                            aisle_num = (
                                400 + hash(aisle) % 100
                            )  # Put L-level categories in middle range
                        elif aisle[0].isalpha():
                            # Handle alphanumeric aisles like "B15", "A14", etc.
                            aisle_letter = ord(aisle[0].upper()) - ord("A") + 1

                            # Extract numeric part for proper sorting (B1 -> 1, B15 -> 15, not B1 -> 1, B15 -> 5)
                            numeric_part = ""
                            for char in aisle[1:]:
                                if char.isdigit():
                                    numeric_part += char
                                else:
                                    break

                            if numeric_part:
                                aisle_num = aisle_letter * 1000 + int(numeric_part)
                            else:
                                aisle_num = aisle_letter * 1000
                        else:
                            aisle_num = 999  # Put unknown aisles at the end
                    except (ValueError, IndexError):
                        aisle_num = 999  # Put unknown aisles at the end

                # Extract section number for secondary sorting (supports values like "44")
                section_num = 0
                if section:
                    try:
                        if section.isdigit():
                            section_num = int(section)
                        else:
                            section_num = 999
                    except Exception:
                        section_num = 999

                return (0, aisle_num, section_num, item_data["item"].name.lower())
            else:
                # Search-based location - sort by confidence, then by original name
                confidence_score = {"High": 3, "Medium": 2, "Low": 1, "Error": 0}.get(
                    match_confidence, 0
                )
                has_match = 1 if item_data.get("matched_product") else 0
                return (1, confidence_score, has_match, item_data["item"].name.lower())

        # Apply smart zig-zag sorting for B aisles if requested and we have real aisle data
        real_aisle_items = [
            item
            for item in items_with_locations
            if item.get("location", {}).get("zone_code") in ["STORE", "CATEGORY"]
        ]

        if zig and real_aisle_items:
            self.logger.info("🔄 Applying SMART zig-zag sorting for real aisle data...")
            self.logger.info(
                "   Pattern continues across empty aisles for optimal shopping route"
            )

            # Group items by aisle
            aisle_groups = {}
            for item_data in real_aisle_items:
                aisle = item_data["location"]["aisle"]
                if aisle not in aisle_groups:
                    aisle_groups[aisle] = []
                aisle_groups[aisle].append(item_data)

            # Sort each aisle group by sections (ascending)
            for aisle in aisle_groups:
                # Sort sections within each aisle (by primary numeric part of section, e.g., 35 from "35-4")
                def _section_key(x):
                    s = str(x["location"].get("section", "")).strip()
                    token = s.split("-")[0]
                    return int(token) if token.isdigit() else 999

                aisle_groups[aisle].sort(key=_section_key)

            # Apply SMART zig-zag across aisles (pattern continues across empty aisles)
            sorted_real_items = []

            def _aisle_sort_key(aisle):
                if not aisle or not aisle[0].isalpha():
                    return (999, 999)
                aisle_letter = ord(aisle[0].upper()) - ord("A") + 1
                # Extract numeric part for semantic sorting (B1 -> 1, B17 -> 17)
                if len(aisle) > 1 and aisle[1:].isdigit():
                    aisle_num = int(aisle[1:])
                else:
                    aisle_num = 0
                return (aisle_letter, aisle_num)

            # Get all possible aisles in order (including empty ones)
            all_aisles = []
            for item_data in real_aisle_items:
                aisle = item_data["location"]["aisle"]
                if aisle[0].isalpha() and aisle[1:].isdigit():
                    all_aisles.append(aisle)

            # Remove duplicates and sort
            all_aisles = sorted(list(set(all_aisles)), key=_aisle_sort_key)

            # Apply smart zig-zag pattern
            last_direction = "ascending"  # Start with ascending (section 1 -> 40)

            for aisle in all_aisles:
                if aisle in aisle_groups:
                    # This aisle has items - apply the current direction
                    items_in_aisle = aisle_groups[aisle].copy()

                    if last_direction == "descending":
                        # Reverse the items to go from high section to low section
                        items_in_aisle.reverse()
                        self.logger.debug(
                            f"🔄 Aisle {aisle}: Descending order (section high → low)"
                        )
                    else:
                        self.logger.debug(
                            f"🔄 Aisle {aisle}: Ascending order (section low → high)"
                        )

                    sorted_real_items.extend(items_in_aisle)

                    # Toggle direction for next occupied aisle
                    last_direction = (
                        "descending" if last_direction == "ascending" else "ascending"
                    )
                else:
                    # Empty aisle - pattern continues, don't toggle direction
                    self.logger.debug(
                        f"⏭️  Aisle {aisle}: Empty, continuing {last_direction} pattern"
                    )

            # Sort search-based items by confidence
            search_items = [
                item
                for item in items_with_locations
                if item.get("location", {}).get("zone_code")
                not in ["STORE", "CATEGORY"]
            ]
            sorted_search_items = sorted(search_items, key=get_location_sort_key)

            # Combine real aisle items first, then search items
            sorted_items = sorted_real_items + sorted_search_items

        else:
            # Normal sorting by location (real aisles first, then search confidence)
            sorted_items = sorted(
                items_with_locations, key=get_location_sort_key, reverse=False
            )

        # Apply reverse sorting if requested
        if reverse:
            sorted_items = list(reversed(sorted_items))

        # Clear the current list
        self.logger.info("🗑️  Clearing current shopping list...")
        self.clear_list()

        # Re-add items in sorted order with minimal location notes
        self.logger.info("📝 Re-adding items in aisle order with ILC-based notes...")
        added_count = 0

        for idx, item_data in enumerate(sorted_items):
            item = item_data["item"]
            location = item_data["location"]
            # Build notes from location info: "<aisle>:<section>" or category info
            enhanced_notes = None
            if (
                location
                and location.get("zone_code") in ["STORE", "CATEGORY"]
                and location.get("aisle")
            ):
                aisle = str(location.get("aisle", "")).strip()
                section = str(location.get("section", "")).strip()
                bay = str(location.get("bay", "")).strip()

                # Check if this is real aisle data (e.g., "B15", "A14")
                if aisle and aisle[0].isalpha() and any(c.isdigit() for c in aisle):
                    # Real aisle data - format as "Aisle:Section-Bay" or "Aisle:Section"
                    if section and bay:
                        loc_str = f"{aisle}:{section}-{bay}"
                    elif section:
                        loc_str = f"{aisle}:{section}"
                    else:
                        loc_str = aisle
                elif aisle.startswith("L"):
                    # Parse L-level category format (e.g., "L3-4131" -> "Cat:Sub4131")
                    try:
                        # Extract level and ID from format like "L3-4131"
                        if "-" in aisle:
                            level_part, id_part = aisle.split("-", 1)
                            level_num = level_part[1:]  # Remove "L" prefix

                            # Map level numbers to readable names
                            level_names = {
                                "1": "Dept",
                                "2": "Cat",
                                "3": "Sub",
                                "4": "Item",
                            }

                            level_name = level_names.get(level_num, f"L{level_num}")
                            loc_str = f"Cat:{level_name}{id_part}"
                        else:
                            # Fallback for unexpected format
                            loc_str = f"Cat:{aisle}"
                    except Exception:
                        # Fallback if parsing fails
                        loc_str = f"Cat:{aisle}"
                elif aisle.startswith("Cat_"):
                    # Legacy category-based organization
                    category_name = (
                        aisle.replace("Cat_", "")
                        .replace("L1-", "Dept")
                        .replace("L2-", "Cat")
                        .replace("L3-", "Sub")
                        .replace("L4-", "Item")
                    )
                    loc_str = f"Cat:{category_name}"
                else:
                    # Traditional aisle organization
                    loc_str = aisle if not section else f"{aisle}:{section}"

                enhanced_notes = loc_str

                # Add product description after the location with pipe separator
                if item_data.get("matched_product") and item_data[
                    "matched_product"
                ].get("title"):
                    product_title = item_data["matched_product"]["title"]
                    self.logger.debug(
                        f"🔍 Found matched_product title: {product_title}"
                    )

                    # Split by the last comma to get the most relevant part
                    if "," in product_title:
                        # Find the last comma and take everything after it
                        last_comma_index = product_title.rfind(",")
                        if last_comma_index != -1:
                            # Take the part after the last comma and clean it up
                            relevant_part = product_title[
                                last_comma_index + 1 :
                            ].strip()
                            # Also include some context from before the last comma
                            before_last_comma = product_title[:last_comma_index].strip()
                            # Combine them intelligently
                            if before_last_comma and relevant_part:
                                # Take the last part of before_last_comma (after its last comma if it has one)
                                if "," in before_last_comma:
                                    before_last_comma = before_last_comma[
                                        before_last_comma.rfind(",") + 1 :
                                    ].strip()
                                product_desc = f"{before_last_comma}, {relevant_part}"
                            else:
                                product_desc = relevant_part
                        else:
                            product_desc = product_title
                    else:
                        product_desc = product_title

                    # Add the pipe separator and product description
                    enhanced_notes = f"{loc_str} | {product_desc}"
                    self.logger.debug(f"🔍 Enhanced notes: {enhanced_notes}")
                else:
                    self.logger.debug(
                        f"🔍 No matched_product data found for {item.name}"
                    )
                    self.logger.debug(f"🔍 item_data keys: {list(item_data.keys())}")
                    if "matched_product" in item_data:
                        self.logger.debug(
                            f"🔍 matched_product content: {item_data['matched_product']}"
                        )

                # Enforce API notes length limit conservatively
                if len(enhanced_notes) > 60:
                    enhanced_notes = enhanced_notes[:60]

            # Re-add the item with the ORIGINAL name and enhanced location information
            success = self.add_item_with_details(
                upc=item.item_part_number or f"ITEM_{item.list_item_id}",
                quantity=item.quantity,
                description=item.name,  # Use original item name, not description
                notes=enhanced_notes,
                display_order=idx,
            )

            if success:
                added_count += 1
                location_display = (
                    location.get("aisle", "Unknown") if location else "Unknown"
                )
                self.logger.info(
                    f"✅ Added: {item.name} (Location: {location_display})"
                )
            else:
                self.logger.warning(f"⚠️  Failed to re-add item: {item.name}")

        # Summary with detailed statistics
        self.logger.info(
            f"🎉 Defrag complete! Reorganized {added_count} items by aisle"
        )

        # Show confidence distribution
        confidence_counts = {}
        for item_data in items_with_locations:
            confidence = item_data.get("match_confidence", "Unknown")
            confidence_counts[confidence] = confidence_counts.get(confidence, 0) + 1

        self.logger.info("🎯 Match Confidence Summary:")
        for confidence, count in confidence_counts.items():
            self.logger.info(f"   {confidence}: {count} item(s)")

        return added_count > 0

    # ============================================================================
    # Jupyter Notebook Rich Representations
    # ============================================================================

    def _repr_html_(self) -> str:
        """Rich HTML representation for Jupyter notebooks."""
        try:
            items = self.get()
            item_count = len(items)
            completed_count = sum(1 for item in items if item.is_complete)
            favorite_count = sum(1 for item in items if item.is_favorite)
            promotion_count = sum(1 for item in items if item.has_promotion)

            if item_count == 0:
                html = """
                <div style="
                    border: 2px solid #95a5a6;
                    border-radius: 12px;
                    padding: 24px;
                    margin: 16px 0;
                    background: linear-gradient(135deg, #ecf0f1 0%, #bdc3c7 100%);
                    text-align: center;
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                ">
                    <div style="font-size: 48px; margin-bottom: 16px;">📝</div>
                    <h2 style="color: #2c3e50; margin: 0 0 8px 0;">Empty Shopping List</h2>
                    <p style="color: #7f8c8d; margin: 0; font-size: 16px;">Your shopping list is currently empty</p>
                </div>
                """
            else:
                html = f"""
                <div style="
                    border: 2px solid #3498db;
                    border-radius: 16px;
                    padding: 24px;
                    margin: 16px 0;
                    background: linear-gradient(135deg, #ffffff 0%, #ecf0f1 100%);
                    box-shadow: 0 8px 24px rgba(0,0,0,0.15);
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                ">
                    <div style="
                        display: flex;
                        align-items: center;
                        justify-content: space-between;
                        margin-bottom: 24px;
                        padding-bottom: 16px;
                        border-bottom: 2px solid #ecf0f1;
                    ">
                        <div style="display: flex; align-items: center; gap: 16px;">
                            <span style="font-size: 36px;">📝</span>
                            <div>
                                <h1 style="margin: 0; color: #2c3e50; font-size: 28px;">Shopping List</h1>
                                <p style="margin: 4px 0 0 0; color: #7f8c8d; font-size: 16px;">
                                    {item_count} items • {completed_count} completed
                                </p>
                            </div>
                        </div>
                        <div style="text-align: right;">
                            <div style="
                                color: #3498db;
                                font-size: 32px;
                                font-weight: 700;
                                margin-bottom: 8px;
                            ">{item_count}</div>
                            <div style="color: #7f8c8d; font-size: 14px;">
                                Total Items
                            </div>
                        </div>
                    </div>

                    <div style="
                        display: grid;
                        grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
                        gap: 16px;
                        margin-bottom: 24px;
                    ">
                        <div style="
                            background: linear-gradient(135deg, #3498db 0%, #2980b9 100%);
                            color: white;
                            padding: 20px;
                            border-radius: 12px;
                            text-align: center;
                        ">
                            <div style="font-size: 24px; margin-bottom: 8px;">📝</div>
                            <div style="font-size: 20px; font-weight: 600; margin-bottom: 4px;">Total Items</div>
                            <div style="font-size: 24px; font-weight: 700;">{item_count}</div>
                        </div>

                        <div style="
                            background: linear-gradient(135deg, #27ae60 0%, #2ecc71 100%);
                            color: white;
                            padding: 20px;
                            border-radius: 12px;
                            text-align: center;
                        ">
                            <div style="font-size: 24px; margin-bottom: 8px;">✅</div>
                            <div style="font-size: 20px; font-weight: 600; margin-bottom: 4px;">Completed</div>
                            <div style="font-size: 24px; font-weight: 700;">{completed_count}</div>
                        </div>

                        <div style="
                            background: linear-gradient(135deg, #f39c12 0%, #e67e22 100%);
                            color: white;
                            padding: 20px;
                            border-radius: 12px;
                            text-align: center;
                        ">
                            <div style="font-size: 24px; margin-bottom: 8px;">⭐</div>
                            <div style="font-size: 20px; font-weight: 600; margin-bottom: 4px;">Favorites</div>
                            <div style="font-size: 24px; font-weight: 700;">{favorite_count}</div>
                        </div>

                        <div style="
                            background: linear-gradient(135deg, #e74c3c 0%, #c0392b 100%);
                            color: white;
                            padding: 20px;
                            border-radius: 12px;
                            text-align: center;
                        ">
                            <div style="font-size: 24px; margin-bottom: 8px;">🏷️</div>
                            <div style="font-size: 20px; font-weight: 600; margin-bottom: 4px;">Promotions</div>
                            <div style="font-size: 24px; font-weight: 700;">{promotion_count}</div>
                        </div>
                    </div>

                    <div style="
                        background: #2c3e50;
                        color: white;
                        padding: 16px;
                        border-radius: 12px;
                        text-align: center;
                    ">
                        <div style="font-size: 18px; font-weight: 600;">
                            🎉 Shopping List Summary: {item_count} items • {completed_count} completed • {item_count - completed_count} remaining
                        </div>
                    </div>
                </div>
                """

            return html

        except Exception as e:
            return f"""
            <div style="
                border: 2px solid #e74c3c;
                border-radius: 12px;
                padding: 24px;
                margin: 16px 0;
                background: linear-gradient(135deg, #fdf2f2 0%, #fde8e8 100%);
                text-align: center;
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            ">
                <div style="font-size: 48px; margin-bottom: 16px;">⚠️</div>
                <h2 style="color: #c53030; margin: 0 0 8px 0;">Error Loading List</h2>
                <p style="color: #742a2a; margin: 0; font-size: 16px;">Unable to load shopping list: {str(e)}</p>
            </div>
            """

    def _repr_markdown_(self) -> str:
        """Rich Markdown representation for Jupyter notebooks."""
        try:
            items = self.get()
            item_count = len(items)
            completed_count = sum(1 for item in items if item.is_complete)
            favorite_count = sum(1 for item in items if item.is_favorite)
            promotion_count = sum(1 for item in items if item.has_promotion)

            if item_count == 0:
                return """
## 📝 Empty Shopping List

Your shopping list is currently empty.

---
*Ready to start shopping!*
                """

            md = f"""
## 📝 Shopping List

**Total Items:** {item_count} • **Completed:** {completed_count} • **Remaining:** {item_count - completed_count}

### 📊 List Statistics
- **Total Items:** {item_count}
- **Completed Items:** {completed_count}
- **Remaining Items:** {item_count - completed_count}
- **Completion Rate:** {(completed_count / item_count * 100):.1f}%
- **Favorites:** {favorite_count}
- **Promotions:** {promotion_count}

### 🎯 Quick Actions
- **Add Item:** Use `add()` method
- **Clear List:** Use `clear_list()` method
- **Defrag List:** Use `defrag()` method for aisle organization
- **Get Favorites:** Use `get_favorites()` method

---
*Shopping list contains {item_count} items with {completed_count} completed*
            """

            return md

        except Exception as e:
            return f"""
## ⚠️ Error Loading List

Unable to load shopping list: `{str(e)}`

---
*Please check your authentication and try again*
            """

    def _repr_pretty_(self, p, cycle):
        """Rich text representation for IPython."""
        if cycle:
            p.text("MeijerList(...)")
        else:
            try:
                items = self.get()
                item_count = len(items)
                completed_count = sum(1 for item in items if item.is_complete)

                p.text(f"📝 Shopping List ({item_count} items)")
                p.breakable()
                p.text(f"  Completed: {completed_count}")
                p.breakable()
                p.text(f"  Remaining: {item_count - completed_count}")
                p.breakable()
                p.text(
                    f"  Completion: {(completed_count / item_count * 100):.1f}%"
                    if item_count > 0
                    else "  Completion: 0%"
                )

                if item_count > 0:
                    p.breakable()
                    p.text("  Recent Items:")
                    for i, item in enumerate(items[:3]):  # Show first 3 items
                        p.breakable()
                        status = "✅" if item.is_complete else "⏳"
                        p.text(f"    {status} {item.name}")

                    if item_count > 3:
                        p.breakable()
                        p.text(f"    ... and {item_count - 3} more items")

            except Exception as e:
                p.text(f"⚠️ Error loading list: {str(e)}")

    def _get_broader_search_terms(self, search_query: str) -> List[str]:
        """
        Generate broader search terms when the original search fails.

        Args:
            search_query: Original search query

        Returns:
            List of broader search terms to try
        """
        terms = []

        # Remove common prefixes/suffixes
        query = search_query.lower()

        # Remove brand names
        brand_removals = ["meijer", "fresh from meijer", "hunt's", "sargento", "polar"]
        for brand in brand_removals:
            if brand in query:
                query = query.replace(brand, "").strip()

        # Remove common descriptors
        descriptor_removals = [
            "st. louis style",
            "sliced",
            "watermelon",
            "3 lb bag",
            "5 lb bag",
            "8 oz",
            "1 gallon",
        ]
        for desc in descriptor_removals:
            if desc in query:
                query = query.replace(desc, "").strip()

        # Add the cleaned query
        if query and len(query) > 2:
            terms.append(query)

        # Add common food categories
        if any(word in search_query.lower() for word in ["milk", "cheese", "yogurt"]):
            terms.extend(["dairy", "milk"])
        elif any(
            word in search_query.lower()
            for word in ["chicken", "beef", "pork", "spareribs"]
        ):
            terms.extend(["meat", "chicken", "beef"])
        elif any(
            word in search_query.lower()
            for word in ["potato", "onion", "apple", "banana"]
        ):
            terms.extend(["produce", "vegetables", "fruit"])
        elif any(word in search_query.lower() for word in ["toothpaste", "cream"]):
            terms.extend(["personal care", "bathroom"])

        # Add the original query as fallback
        if search_query not in terms:
            terms.append(search_query)

        return terms

    def _map_api_response_to_listitem(
        self, item_data: Dict[str, Any]
    ) -> Dict[str, Any]:
        """
        Map API response keys from camelCase to snake_case for ListItem constructor.

        Args:
            item_data: Raw API response data with camelCase keys

        Returns:
            Dict with snake_case keys for ListItem constructor
        """
        # Mapping from API response keys to ListItem constructor parameters
        key_mapping = {
            "listItemId": "list_item_id",
            "listItemTypeId": "list_item_type_id",
            "itemDisplayOrder": "item_display_order",
            "itemPartNumber": "item_part_number",
            "itemDescription": "item_description",
            "quantity": "quantity",  # Add missing quantity mapping
            "notes": "notes",  # Add missing notes mapping
            "storeId": "store_id",
            "isComplete": "is_complete",
            "isFavorite": "is_favorite",
            "listingId": "listing_id",
            "promotionStart": "promotion_start",
            "promotionEnd": "promotion_end",
            "couponId": "coupon_id",
        }

        mapped_data = {}
        for api_key, constructor_key in key_mapping.items():
            if api_key in item_data:
                mapped_data[constructor_key] = item_data[api_key]

        # Handle special cases
        if "promotionStart" in item_data and item_data["promotionStart"]:
            try:
                from datetime import datetime

                mapped_data["promotion_start"] = datetime.fromisoformat(
                    item_data["promotionStart"].replace("Z", "+00:00")
                ).date()
            except (ValueError, TypeError):
                mapped_data["promotion_start"] = None

        if "promotionEnd" in item_data and item_data["promotionEnd"]:
            try:
                from datetime import datetime

                mapped_data["promotion_end"] = datetime.fromisoformat(
                    item_data["promotionEnd"].replace("Z", "+00:00")
                ).date()
            except (ValueError, TypeError):
                mapped_data["promotion_end"] = None

        # Set default values for required fields
        mapped_data.setdefault("list_item_id", 0)
        mapped_data.setdefault("list_item_type_id", 1)
        mapped_data.setdefault("item_display_order", 1)
        mapped_data.setdefault("item_description", "Unknown Item")
        mapped_data.setdefault("quantity", 1)
        mapped_data.setdefault("store_id", 0)
        mapped_data.setdefault("notes", None)
        mapped_data.setdefault("is_complete", False)
        mapped_data.setdefault("is_favorite", False)
        mapped_data.setdefault("listing_id", None)
        mapped_data.setdefault("coupon_id", 0)
        mapped_data.setdefault(
            "promotion_start", None
        )  # Ensure this is always provided
        mapped_data.setdefault("promotion_end", None)  # Ensure this is always provided

        return mapped_data
