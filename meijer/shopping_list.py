"""
Meijer Shopping List Management
==============================

Shopping list functionality for the Meijer API client.
"""

from typing import List, TYPE_CHECKING
from urllib.parse import urljoin

from .models import ListItem
from .exceptions import MeijerAuthenticationError

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
                items = []
                for item_data in data.get("listItems", []):
                    items.append(ListItem(**item_data))
                return items
            else:
                self.logger.error(
                    f"Failed to get shopping list: {response.status_code}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Error getting shopping list: {e}")
            return []

    def add_item(self, upc: str, quantity: int = 1) -> bool:
        """Add item to shopping list by UPC using real APK-discovered endpoint."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["add_item"])
            headers = self.meijer._get_api_headers()
            
            # Use real headers from APK analysis (Hq/d.java)
            headers.update({
                "Content-Type": "application/vnd.meijer.listManagement.list-v1.0+json",
                "Accept": "application/vnd.meijer.listManagement.list-v1.0+json"
            })

            # Real request body structure from APK (ShoppingListAddItemRequest + ShoppingListItemWireModel)
            data = {
                "listItems": [
                    {
                        "listItemId": 0,  # New item
                        "itemDescription": f"Product {upc}",
                        "quantity": quantity,
                        "itemPartNumber": upc,  # UPC goes here
                        "listItemTypeId": 1,  # Standard item type
                        "itemDisplayOrder": 1,
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

            response = self.meijer._make_request(
                "POST", url, headers=headers, json=data
            )

            if response.status_code in [200, 201]:
                self.logger.info(f"Added item {upc} to shopping list")
                return True
            else:
                self.logger.error(f"Failed to add item: {response.status_code} - {response.text}")
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
            headers.update({
                "Accept": "application/vnd.meijer.listManagement.listItem-v1.0+json"
            })

            # PUT request with no body, itemId in path
            response = self.meijer._make_request("PUT", url, headers=headers)

            if response.status_code in [200, 201, 204, 205]:  # 205 = Reset Content (success)
                self.logger.info(f"Completed item {item_id}")
                return True
            else:
                self.logger.error(f"Failed to complete item: {response.status_code} - {response.text}")
                return False

        except Exception as e:
            self.logger.error(f"Error completing item: {e}")
            return False

    def delete_item(self, item_id: str) -> bool:
        """Delete item from shopping list using real APK-discovered endpoint."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            # Use real endpoint with itemId path parameter from APK (Hq/d.java)
            endpoint = self.endpoints["delete_item"].format(itemId=item_id)
            url = urljoin(self.meijer.api_base_url, endpoint)
            headers = self.meijer._get_api_headers()

            # DELETE request with no body, itemId in path
            response = self.meijer._make_request("DELETE", url, headers=headers)

            if response.status_code in [200, 201, 204, 205]:  # 205 = Reset Content (success)
                self.logger.info(f"Deleted item {item_id}")
                return True
            else:
                self.logger.error(f"Failed to delete item: {response.status_code} - {response.text}")
                return False

        except Exception as e:
            self.logger.error(f"Error deleting item: {e}")
            return False

    def get_favorites(self) -> List[ListItem]:
        """Get favorites list items using real APK-discovered endpoint."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["get_favorites"])
            headers = self.meijer._get_api_headers()
            
            # Use real headers from APK analysis (Hq/d.java)
            headers.update({
                "Accept": "application/vnd.meijer.favorites-v1.0+json"
            })

            response = self.meijer._make_request("GET", url, headers=headers)

            if response.status_code == 200:
                data = response.json()
                self.logger.info(f"Get favorites response: Found {data.get('totalCount', 0)} total favorites")
                items = []
                # Use correct field name from API response: 'favoriteListItems' not 'favoriteItems'
                for item_data in data.get("favoriteListItems", []):
                    items.append(ListItem(**item_data))
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
            headers.update({
                "Content-Type": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                "Accept": "application/vnd.meijer.listManagement.favorites-v1.0+json"
            })

            # Real request body structure from APK (AddFavoritesItemsRequest + FavoriteListItemWireModel)
            data = {
                "favoriteListItems": [
                    {
                        "listItemId": 0,  # New favorite
                        "listItemTypeId": 1,  # Standard item type
                        "itemDisplayOrder": 1,
                        "itemPartNumber": upc,  # UPC goes here
                        "itemDescription": f"Product {upc}",
                        "isItemInActiveList": False
                    }
                ]
            }

            response = self.meijer._make_request(
                "POST", url, headers=headers, json=data
            )

            if response.status_code in [200, 201]:  # 201 = Created (success) 
                self.logger.info(f"Added item {upc} to favorites")
                # Log the response to understand the structure
                try:
                    response_data = response.json()
                    self.logger.info(f"Add favorite response: {response_data}")
                except:
                    self.logger.info(f"Add favorite response (non-JSON): {response.text}")
                return True
            else:
                self.logger.error(f"Failed to add to favorites: {response.status_code} - {response.text}")
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
                self.logger.info(f"  {i+1}. ID:{getattr(item, 'listItemId', 'N/A')} UPC:{getattr(item, 'itemPartNumber', 'N/A')} Desc:{getattr(item, 'itemDescription', 'N/A')}")
            
            # Try multiple ways to match the item
            target_item = None
            for item in favorites:
                # Try exact UPC match
                if getattr(item, 'itemPartNumber', None) == upc:
                    target_item = item
                    self.logger.info(f"Found exact UPC match: {item.listItemId}")
                    break
                # Try description match as fallback 
                elif getattr(item, 'itemDescription', '') and upc in getattr(item, 'itemDescription', ''):
                    target_item = item
                    self.logger.info(f"Found description match: {item.listItemId}")
                    break
                    
            if not target_item:
                self.logger.warning(f"Item {upc} not found in favorites after refresh")
                self.logger.warning("Available favorites:")
                for item in favorites:
                    self.logger.warning(f"  - UPC: {getattr(item, 'itemPartNumber', 'None')}, Desc: {getattr(item, 'itemDescription', 'None')}")
                return False

            self.logger.info(f"Attempting to delete favorite item ID: {target_item.listItemId}")

            url = urljoin(self.meijer.api_base_url, self.endpoints["delete_bulk_favorites"])
            headers = self.meijer._get_api_headers()
            
            # Use real headers from APK analysis (Hq/d.java)  
            headers.update({
                "Content-Type": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                "Accept": "application/vnd.meijer.listManagement.favorites-v1.0+json"
            })

            # Real request body structure from APK (DeleteFavoritesListItemsRequest)
            data = {
                "listItemIds": [target_item.listItemId]  # Array of Long listItemIds to delete
            }

            response = self.meijer._make_request(
                "POST", url, headers=headers, json=data
            )

            if response.status_code in [200, 201, 204, 205]:  # Accept all success codes
                self.logger.info(f"Successfully removed item {upc} (ID:{target_item.listItemId}) from favorites")
                return True
            else:
                self.logger.error(f"Failed to remove from favorites: {response.status_code} - {response.text}")
                return False

        except Exception as e:
            self.logger.error(f"Error removing item from favorites: {e}")
            return False


