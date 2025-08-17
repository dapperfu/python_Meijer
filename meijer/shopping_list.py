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

        # API endpoints for shopping list management
        self.endpoints = {
            "get_list": "/loyalty/shoppinglist/GetList",
            "add_item": "/loyalty/shoppinglist/AddListItem",
            "complete_item": "/loyalty/shoppinglist/MarkAsCompleted",
            "uncomplete_item": "/loyalty/shoppinglist/MarkAsNotCompleted",
            "delete_item": "/loyalty/shoppinglist/DeleteListItem",
            "clear_completed": "/loyalty/shoppinglist/ClearCompleted",
            "get_favorites": "/loyalty/shoppinglist/GetFavoritesList",
            "add_favorite": "/loyalty/shoppinglist/AddFavorite",
            "delete_favorite": "/loyalty/shoppinglist/DeleteFavorite",
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
        """Add item to shopping list by UPC."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["add_item"])
            headers = self.meijer._get_api_headers()
            headers.update(
                {
                    "Content-Type": "application/json",
                    "Accept": "application/meijer.shoppingList.ShoppingList-v1.0+json",
                }
            )

            data = {"upc": upc, "quantity": quantity}

            response = self.meijer._make_request(
                "POST", url, headers=headers, json=data
            )

            if response.status_code == 200:
                self.logger.info(f"Added item {upc} to shopping list")
                return True
            else:
                self.logger.error(f"Failed to add item: {response.status_code}")
                return False

        except Exception as e:
            self.logger.error(f"Error adding item to shopping list: {e}")
            return False

    def complete_item(self, item_id: str) -> bool:
        """Mark item as completed."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["complete_item"])
            headers = self.meijer._get_api_headers()
            headers.update({"Content-Type": "application/json"})

            data = {"listItemId": item_id}

            response = self.meijer._make_request(
                "POST", url, headers=headers, json=data
            )

            if response.status_code == 200:
                self.logger.info(f"Completed item {item_id}")
                return True
            else:
                self.logger.error(f"Failed to complete item: {response.status_code}")
                return False

        except Exception as e:
            self.logger.error(f"Error completing item: {e}")
            return False

    def delete_item(self, item_id: str) -> bool:
        """Delete item from shopping list."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["delete_item"])
            headers = self.meijer._get_api_headers()
            headers.update({"Content-Type": "application/json"})

            data = {"listItemId": item_id}

            response = self.meijer._make_request(
                "POST", url, headers=headers, json=data
            )

            if response.status_code == 200:
                self.logger.info(f"Deleted item {item_id}")
                return True
            else:
                self.logger.error(f"Failed to delete item: {response.status_code}")
                return False

        except Exception as e:
            self.logger.error(f"Error deleting item: {e}")
            return False
