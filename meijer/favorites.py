"""
Favorites management for Meijer API.

This module provides comprehensive functionality for managing favorites,
including adding/removing items, searching favorites, and converting
favorites to shopping list items.
"""

import json
from typing import TYPE_CHECKING, Any, Dict, List, Optional
from urllib.parse import urljoin

from .exceptions import MeijerAuthenticationError
from .models.favorites import (
    FavoriteListItem,
    AddFavoritesRequest,
    DeleteFavoritesRequest,
    UpdateConfirmation,
    FavoritesResponse,
)

if TYPE_CHECKING:
    from .client import Meijer


class FavoritesManager:
    """
    Comprehensive favorites management for Meijer API.

    Provides complete favorites functionality including:
    - Getting favorites list
    - Adding new favorites
    - Removing favorites
    - Searching favorites
    - Converting favorites to shopping list items
    - Bulk operations
    """

    def __init__(self, meijer_client: "Meijer"):
        """Initialize favorites manager with reference to Meijer client."""
        self.meijer = meijer_client
        self.logger = meijer_client.logger

        # Real favorites API endpoints from APK analysis and HTTP traffic
        self.endpoints = {
            "get_favorites": "/loyalty/shoppinglist/GetFavoritesList",
            "add_favorite": "/loyalty/shoppinglist/AddFavoritesListItem",
            "delete_favorite": "/loyalty/shoppinglist/DeleteBulkListItems",
            "add_to_shopping_list": "/loyalty/shoppinglist/AddListItem",
        }

    def get_favorites(self) -> FavoritesResponse:
        """
        Get the complete favorites list.

        Returns:
            FavoritesResponse containing all favorite items

        Raises:
            MeijerAuthenticationError: If authentication fails
        """
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["get_favorites"])
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis
            headers.update({"Accept": "application/vnd.meijer.favorites-v1.0+json"})

            response = self.meijer._make_request("GET", url, headers=headers)

            if response.status_code == 200:
                data = response.json()
                self.logger.info(
                    f"Get favorites response: Found {data.get('totalCount', 0)} total favorites"
                )

                # Create structured response object
                favorites_response = FavoritesResponse.from_api_response(data)
                self.logger.info(
                    f"Successfully retrieved {len(favorites_response)} favorites"
                )
                return favorites_response
            else:
                self.logger.error(
                    f"Failed to get favorites list: {response.status_code} - {response.text}"
                )
                if response.status_code == 401:
                    raise MeijerAuthenticationError(
                        "Authentication failed - token may be expired"
                    )
                # Return empty response on other errors
                return FavoritesResponse(favorite_list_items=[])

        except Exception as e:
            self.logger.error(f"Error getting favorites list: {e}")
            if isinstance(e, MeijerAuthenticationError):
                raise
            # Return empty response on other errors
            return FavoritesResponse(favorite_list_items=[])

    def add_favorite(
        self, description: str, upc: Optional[str] = None
    ) -> Optional[UpdateConfirmation]:
        """
        Add an item to favorites.

        Args:
            description: Item description/name
            upc: Optional UPC/part number for the item

        Returns:
            UpdateConfirmation if successful, None otherwise

        Raises:
            MeijerAuthenticationError: If authentication fails
        """
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["add_favorite"])
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis
            headers.update(
                {
                    "Content-Type": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                    "Accept": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                }
            )

            # Create request using the structured model
            request = AddFavoritesRequest.create_simple(description, upc)
            data = request.to_api_request()

            self.logger.info(f"Adding favorite: {description} (UPC: {upc or 'None'})")

            response = self.meijer._make_request(
                "POST", url, headers=headers, json_data=data
            )

            if response.status_code in [200, 201]:
                try:
                    response_data = response.json()
                    self.logger.info(f"Add favorite response: {response_data}")

                    # Parse the response to get confirmation details
                    if (
                        "updateConfirmations" in response_data
                        and response_data["updateConfirmations"]
                    ):
                        confirmation_data = response_data["updateConfirmations"][0]
                        confirmation = UpdateConfirmation.from_api_response(
                            confirmation_data
                        )
                        self.logger.info(
                            f"Successfully added favorite: {confirmation.item_description}"
                        )
                        return confirmation
                    else:
                        self.logger.warning("No confirmation data in response")
                        return None

                except (json.JSONDecodeError, ValueError) as e:
                    self.logger.warning(f"Failed to parse response JSON: {e}")
                    self.logger.info(f"Raw response: {response.text}")
                    return None
            else:
                self.logger.error(
                    f"Failed to add to favorites: {response.status_code} - {response.text}"
                )
                return None

        except Exception as e:
            self.logger.error(f"Error adding item to favorites: {e}")
            if isinstance(e, MeijerAuthenticationError):
                raise
            return None

    def delete_favorite(self, list_item_id: int) -> bool:
        """
        Delete a favorite item by its list item ID.

        Args:
            list_item_id: ID of the favorite item to delete

        Returns:
            True if successful, False otherwise

        Raises:
            MeijerAuthenticationError: If authentication fails
        """
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["delete_favorite"])
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis
            headers.update(
                {
                    "Content-Type": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                    "Accept": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                }
            )

            # Create request using the structured model
            request = DeleteFavoritesRequest.create_single(list_item_id)
            data = request.to_api_request()

            self.logger.info(f"Deleting favorite item ID: {list_item_id}")

            response = self.meijer._make_request(
                "POST", url, headers=headers, json_data=data
            )

            if response.status_code in [200, 201, 204, 205]:
                self.logger.info(
                    f"Successfully deleted favorite item ID: {list_item_id}"
                )
                return True
            else:
                self.logger.error(
                    f"Failed to delete favorite: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error deleting favorite item: {e}")
            if isinstance(e, MeijerAuthenticationError):
                raise
            return False

    def delete_favorite_by_description(self, description: str) -> bool:
        """
        Delete a favorite item by its description.

        Args:
            description: Description of the favorite item to delete

        Returns:
            True if successful, False otherwise
        """
        try:
            # Get current favorites to find the item
            favorites = self.get_favorites()
            target_item = favorites.find_by_description(description)

            if not target_item:
                self.logger.warning(f"Favorite item '{description}' not found")
                return False

            return self.delete_favorite(target_item.list_item_id)

        except Exception as e:
            self.logger.error(f"Error deleting favorite by description: {e}")
            return False

    def delete_favorite_by_upc(self, upc: str) -> bool:
        """
        Delete a favorite item by its UPC.

        Args:
            upc: UPC of the favorite item to delete

        Returns:
            True if successful, False otherwise
        """
        try:
            # Get current favorites to find the item
            favorites = self.get_favorites()
            target_item = favorites.find_by_upc(upc)

            if not target_item:
                self.logger.warning(f"Favorite item with UPC '{upc}' not found")
                return False

            return self.delete_favorite(target_item.list_item_id)

        except Exception as e:
            self.logger.error(f"Error deleting favorite by UPC: {e}")
            return False

    def add_favorite_to_shopping_list(
        self, list_item_id: int
    ) -> Optional[UpdateConfirmation]:
        """
        Add a favorite item to the shopping list.

        This is the second step in the HTTP traffic analysis:
        1. First add to favorites (AddFavoritesListItem)
        2. Then add to shopping list (AddListItem)

        Args:
            list_item_id: ID of the favorite item to add to shopping list

        Returns:
            UpdateConfirmation if successful, None otherwise

        Raises:
            MeijerAuthenticationError: If authentication fails
        """
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(
                self.meijer.api_base_url, self.endpoints["add_to_shopping_list"]
            )
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis
            headers.update(
                {"Accept": "application/vnd.meijer.listManagement.list-v1.0+json"}
            )

            # Get the favorite item to get its details
            favorites = self.get_favorites()
            favorite_item = None

            for item in favorites:
                if item.list_item_id == list_item_id:
                    favorite_item = item
                    break

            if not favorite_item:
                self.logger.error(f"Favorite item with ID {list_item_id} not found")
                return None

            # Create request data based on HTTP traffic analysis
            data = {"listItems": [favorite_item.to_shopping_list_item()]}

            self.logger.info(
                f"Adding favorite item '{favorite_item.item_description}' to shopping list"
            )

            response = self.meijer._make_request(
                "POST", url, headers=headers, json_data=data
            )

            if response.status_code in [200, 201]:
                try:
                    response_data = response.json()
                    self.logger.info(f"Add to shopping list response: {response_data}")

                    # Parse the response to get confirmation details
                    if (
                        "updateConfirmations" in response_data
                        and response_data["updateConfirmations"]
                    ):
                        confirmation_data = response_data["updateConfirmations"][0]
                        confirmation = UpdateConfirmation.from_api_response(
                            confirmation_data
                        )
                        self.logger.info(
                            f"Successfully added to shopping list: {confirmation.item_description}"
                        )
                        return confirmation
                    else:
                        self.logger.warning("No confirmation data in response")
                        return None

                except (json.JSONDecodeError, ValueError) as e:
                    self.logger.warning(f"Failed to parse response JSON: {e}")
                    self.logger.info(f"Raw response: {response.text}")
                    return None
            else:
                self.logger.error(
                    f"Failed to add to shopping list: {response.status_code} - {response.text}"
                )
                return None

        except Exception as e:
            self.logger.error(f"Error adding favorite to shopping list: {e}")
            if isinstance(e, MeijerAuthenticationError):
                raise
            return None

    def add_favorite_to_shopping_list_by_description(
        self, description: str
    ) -> Optional[UpdateConfirmation]:
        """
        Add a favorite item to the shopping list by description.

        Args:
            description: Description of the favorite item to add

        Returns:
            UpdateConfirmation if successful, None otherwise
        """
        try:
            # Get current favorites to find the item
            favorites = self.get_favorites()
            target_item = favorites.find_by_description(description)

            if not target_item:
                self.logger.warning(f"Favorite item '{description}' not found")
                return None

            return self.add_favorite_to_shopping_list(target_item.list_item_id)

        except Exception as e:
            self.logger.error(
                f"Error adding favorite to shopping list by description: {e}"
            )
            return None

    def add_favorite_to_shopping_list_by_upc(
        self, upc: str
    ) -> Optional[UpdateConfirmation]:
        """
        Add a favorite item to the shopping list by UPC.

        Args:
            upc: UPC of the favorite item to add

        Returns:
            UpdateConfirmation if successful, None otherwise
        """
        try:
            # Get current favorites to find the item
            favorites = self.get_favorites()
            target_item = favorites.find_by_upc(upc)

            if not target_item:
                self.logger.warning(f"Favorite item with UPC '{upc}' not found")
                return None

            return self.add_favorite_to_shopping_list(target_item.list_item_id)

        except Exception as e:
            self.logger.error(f"Error adding favorite to shopping list by UPC: {e}")
            return None

    def bulk_delete_favorites(self, list_item_ids: List[int]) -> bool:
        """
        Delete multiple favorite items at once.

        Args:
            list_item_ids: List of favorite item IDs to delete

        Returns:
            True if successful, False otherwise

        Raises:
            MeijerAuthenticationError: If authentication fails
        """
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            if not list_item_ids:
                self.logger.warning("No item IDs provided for bulk delete")
                return False

            url = urljoin(self.meijer.api_base_url, self.endpoints["delete_favorite"])
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis
            headers.update(
                {
                    "Content-Type": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                    "Accept": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                }
            )

            # Create request using the structured model
            request = DeleteFavoritesRequest(list_item_ids=list_item_ids)
            data = request.to_api_request()

            self.logger.info(f"Bulk deleting {len(list_item_ids)} favorite items")

            response = self.meijer._make_request(
                "POST", url, headers=headers, json_data=data
            )

            if response.status_code in [200, 201, 204, 205]:
                self.logger.info(
                    f"Successfully bulk deleted {len(list_item_ids)} favorite items"
                )
                return True
            else:
                self.logger.error(
                    f"Failed to bulk delete favorites: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error bulk deleting favorites: {e}")
            if isinstance(e, MeijerAuthenticationError):
                raise
            return False

    def search_favorites(self, query: str) -> List[FavoriteListItem]:
        """
        Search favorites by description.

        Args:
            query: Search query to match against item descriptions

        Returns:
            List of matching favorite items
        """
        try:
            favorites = self.get_favorites()
            query_lower = query.lower()

            matching_items = []
            for item in favorites:
                if query_lower in item.item_description.lower():
                    matching_items.append(item)

            self.logger.info(
                f"Found {len(matching_items)} favorites matching '{query}'"
            )
            return matching_items

        except Exception as e:
            self.logger.error(f"Error searching favorites: {e}")
            return []

    def get_favorites_count(self) -> int:
        """
        Get the total count of favorites.

        Returns:
            Number of favorite items
        """
        try:
            favorites = self.get_favorites()
            return len(favorites)
        except Exception as e:
            self.logger.error(f"Error getting favorites count: {e}")
            return 0

    def is_favorite(self, description: str) -> bool:
        """
        Check if an item is in favorites by description.

        Args:
            description: Item description to check

        Returns:
            True if item is in favorites, False otherwise
        """
        try:
            favorites = self.get_favorites()
            return favorites.find_by_description(description) is not None
        except Exception as e:
            self.logger.error(f"Error checking if item is favorite: {e}")
            return False

    def is_favorite_by_upc(self, upc: str) -> bool:
        """
        Check if an item is in favorites by UPC.

        Args:
            upc: UPC to check

        Returns:
            True if item is in favorites, False otherwise
        """
        try:
            favorites = self.get_favorites()
            return favorites.find_by_upc(upc) is not None
        except Exception as e:
            self.logger.error(f"Error checking if item is favorite by UPC: {e}")
            return False

    def clear_all_favorites(self) -> bool:
        """
        Clear all favorites.

        Returns:
            True if successful, False otherwise
        """
        try:
            favorites = self.get_favorites()
            if not favorites:
                self.logger.info("No favorites to clear")
                return True

            list_item_ids = [item.list_item_id for item in favorites]
            return self.bulk_delete_favorites(list_item_ids)

        except Exception as e:
            self.logger.error(f"Error clearing all favorites: {e}")
            return False

    def get_favorites_summary(self) -> Dict[str, Any]:
        """
        Get a summary of favorites.

        Returns:
            Dictionary containing favorites summary information
        """
        try:
            favorites = self.get_favorites()

            summary = {
                "total_count": len(favorites),
                "by_type": {},
                "by_store": {},
                "recent_items": [],
                "items_with_upc": 0,
                "manual_items": 0,
            }

            for item in favorites:
                # Count by type
                item_type = item.list_item_type_id
                summary["by_type"][item_type] = summary["by_type"].get(item_type, 0) + 1

                # Count by store
                if item.store_id:
                    store_id = str(item.store_id)
                    summary["by_store"][store_id] = (
                        summary["by_store"].get(store_id, 0) + 1
                    )

                # Count items with UPC vs manual
                if item.item_part_number:
                    summary["items_with_upc"] += 1
                else:
                    summary["manual_items"] += 1

            # Get recent items (last 5)
            summary["recent_items"] = [
                {
                    "id": item.list_item_id,
                    "description": item.item_description,
                    "upc": item.item_part_number,
                    "type": item.list_item_type_id,
                }
                for item in favorites[:5]
            ]

            return summary

        except Exception as e:
            self.logger.error(f"Error getting favorites summary: {e}")
            return {"total_count": 0, "error": str(e)}
