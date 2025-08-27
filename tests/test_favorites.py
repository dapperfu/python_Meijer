"""
Tests for favorites functionality.

This module tests the comprehensive favorites system including models,
FavoritesManager, and API interactions.
"""

from unittest.mock import Mock, patch
from unittest import TestCase

from meijer.models.favorites import (
    FavoriteListItem,
    AddFavoritesRequest,
    DeleteFavoritesRequest,
    UpdateConfirmation,
    FavoritesResponse,
)
from meijer.favorites import FavoritesManager


class TestFavoriteListItem(TestCase):
    """Test FavoriteListItem model."""

    def test_create_favorite_list_item(self):
        """Test creating a FavoriteListItem."""
        item = FavoriteListItem(
            list_item_id=123,
            list_item_type_id=1,
            item_display_order=1,
            item_description="Test Item",
            is_item_in_active_list=False,
        )

        self.assertEqual(item.list_item_id, 123)
        self.assertEqual(item.list_item_type_id, 1)
        self.assertEqual(item.item_description, "Test Item")
        self.assertFalse(item.is_item_in_active_list)
        self.assertTrue(item.is_favorite)  # Default value

    def test_from_api_response(self):
        """Test creating FavoriteListItem from API response."""
        api_data = {
            "listItemId": 456,
            "listItemTypeId": 0,
            "itemDisplayOrder": 2,
            "itemPartNumber": "123456789",
            "itemDescription": "API Test Item",
            "isItemInActiveList": True,
            "quantity": 1,
            "storeId": 217,
        }

        item = FavoriteListItem.from_api_response(api_data)

        self.assertEqual(item.list_item_id, 456)
        self.assertEqual(item.list_item_type_id, 0)
        self.assertEqual(item.item_part_number, "123456789")
        self.assertEqual(item.item_description, "API Test Item")
        self.assertTrue(item.is_item_in_active_list)
        self.assertEqual(item.quantity, 1)
        self.assertEqual(item.store_id, 217)

    def test_to_api_request(self):
        """Test converting to API request format."""
        item = FavoriteListItem(
            list_item_id=789,
            list_item_type_id=1,
            item_display_order=3,
            item_part_number="987654321",
            item_description="Request Test Item",
            is_item_in_active_list=False,
        )

        request_data = item.to_api_request()

        expected = {
            "listItemId": 789,
            "listItemTypeId": 1,
            "itemDisplayOrder": 3,
            "itemPartNumber": "987654321",
            "itemDescription": "Request Test Item",
            "isItemInActiveList": False,
        }

        self.assertEqual(request_data, expected)

    def test_to_shopping_list_item(self):
        """Test converting to shopping list format."""
        item = FavoriteListItem(
            list_item_id=999,
            list_item_type_id=1,
            item_display_order=4,
            item_part_number="111222333",
            item_description="Shopping List Test Item",
            is_item_in_active_list=False,
        )

        shopping_list_data = item.to_shopping_list_item()

        expected = {
            "listItemId": 999,
            "itemPartNumber": "111222333",
        }

        self.assertEqual(shopping_list_data, expected)

    def test_properties(self):
        """Test FavoriteListItem properties."""
        item = FavoriteListItem(
            list_item_id=111,
            list_item_type_id=1,
            item_display_order=5,
            item_description="Properties Test Item",
            is_item_in_active_list=False,
        )

        self.assertEqual(item.name, "Properties Test Item")
        self.assertIsNone(item.upc)  # No UPC set

        # Set UPC and test again
        item.item_part_number = "444555666"
        self.assertEqual(item.upc, "444555666")


class TestAddFavoritesRequest(TestCase):
    """Test AddFavoritesRequest model."""

    def test_create_simple(self):
        """Test creating a simple add favorites request."""
        request = AddFavoritesRequest.create_simple("Simple Item")

        self.assertEqual(len(request.favorite_list_items), 1)
        item = request.favorite_list_items[0]
        self.assertEqual(item.item_description, "Simple Item")
        self.assertEqual(item.list_item_type_id, 0)  # Manual item
        self.assertEqual(item.list_item_id, 0)  # New item

    def test_create_simple_with_upc(self):
        """Test creating a simple add favorites request with UPC."""
        request = AddFavoritesRequest.create_simple("Product Item", "123456789")

        self.assertEqual(len(request.favorite_list_items), 1)
        item = request.favorite_list_items[0]
        self.assertEqual(item.item_description, "Product Item")
        self.assertEqual(item.item_part_number, "123456789")
        self.assertEqual(item.list_item_type_id, 1)  # Product item

    def test_to_api_request(self):
        """Test converting to API request format."""
        item = FavoriteListItem(
            list_item_id=0,
            list_item_type_id=1,
            item_display_order=1,
            item_description="Test Item",
            is_item_in_active_list=False,
        )

        request = AddFavoritesRequest(favorite_list_items=[item])
        api_data = request.to_api_request()

        expected = {
            "favoriteListItems": [
                {
                    "listItemId": 0,
                    "listItemTypeId": 1,
                    "itemDisplayOrder": 1,
                    "itemDescription": "Test Item",
                    "isItemInActiveList": False,
                }
            ]
        }

        self.assertEqual(api_data, expected)


class TestDeleteFavoritesRequest(TestCase):
    """Test DeleteFavoritesRequest model."""

    def test_create_single(self):
        """Test creating a single delete request."""
        request = DeleteFavoritesRequest.create_single(123)

        self.assertEqual(request.list_item_ids, [123])

    def test_to_api_request(self):
        """Test converting to API request format."""
        request = DeleteFavoritesRequest(list_item_ids=[123, 456, 789])
        api_data = request.to_api_request()

        expected = {"listItemIds": [123, 456, 789]}

        self.assertEqual(api_data, expected)


class TestUpdateConfirmation(TestCase):
    """Test UpdateConfirmation model."""

    def test_from_api_response(self):
        """Test creating UpdateConfirmation from API response."""
        api_data = {
            "listItemId": 123,
            "listItemTypeId": 1,
            "itemDisplayOrder": 1,
            "itemPartNumber": "123456789",
            "itemDescription": "Confirmed Item",
            "isItemInActiveList": False,
            "quantity": 2,
            "storeId": 217,
            "isComplete": False,
            "isFavorite": True,
        }

        confirmation = UpdateConfirmation.from_api_response(api_data)

        self.assertEqual(confirmation.list_item_id, 123)
        self.assertEqual(confirmation.item_description, "Confirmed Item")
        self.assertEqual(confirmation.quantity, 2)
        self.assertEqual(confirmation.store_id, 217)
        self.assertFalse(confirmation.is_complete)
        self.assertTrue(confirmation.is_favorite)


class TestFavoritesResponse(TestCase):
    """Test FavoritesResponse model."""

    def test_from_api_response(self):
        """Test creating FavoritesResponse from API response."""
        api_data = {
            "favoriteListItems": [
                {
                    "listItemId": 1,
                    "listItemTypeId": 1,
                    "itemDisplayOrder": 1,
                    "itemDescription": "Item 1",
                    "isItemInActiveList": False,
                },
                {
                    "listItemId": 2,
                    "listItemTypeId": 0,
                    "itemDisplayOrder": 2,
                    "itemDescription": "Item 2",
                    "isItemInActiveList": False,
                },
            ],
            "totalCount": 2,
        }

        response = FavoritesResponse.from_api_response(api_data)

        self.assertEqual(len(response), 2)
        self.assertEqual(response.total_count, 2)
        self.assertEqual(response[0].item_description, "Item 1")
        self.assertEqual(response[1].item_description, "Item 2")

    def test_find_by_description(self):
        """Test finding items by description."""
        items = [
            FavoriteListItem(
                list_item_id=1,
                list_item_type_id=1,
                item_display_order=1,
                item_description="Apple",
                is_item_in_active_list=False,
            ),
            FavoriteListItem(
                list_item_id=2,
                list_item_type_id=1,
                item_display_order=2,
                item_description="Banana",
                is_item_in_active_list=False,
            ),
        ]

        response = FavoritesResponse(favorite_list_items=items)

        found = response.find_by_description("Apple")
        self.assertIsNotNone(found)
        self.assertEqual(found.list_item_id, 1)

        not_found = response.find_by_description("Orange")
        self.assertIsNone(not_found)

    def test_find_by_upc(self):
        """Test finding items by UPC."""
        items = [
            FavoriteListItem(
                list_item_id=1,
                list_item_type_id=1,
                item_display_order=1,
                item_description="Apple",
                item_part_number="123456789",
                is_item_in_active_list=False,
            ),
            FavoriteListItem(
                list_item_id=2,
                list_item_type_id=1,
                item_display_order=2,
                item_description="Banana",
                item_part_number="987654321",
                is_item_in_active_list=False,
            ),
        ]

        response = FavoritesResponse(favorite_list_items=items)

        found = response.find_by_upc("123456789")
        self.assertIsNotNone(found)
        self.assertEqual(found.list_item_id, 1)

        not_found = response.find_by_upc("555666777")
        self.assertIsNone(not_found)


class TestFavoritesManager(TestCase):
    """Test FavoritesManager functionality."""

    def setUp(self):
        """Set up test fixtures."""
        self.mock_client = Mock()
        self.mock_client.logger = Mock()
        self.mock_client._ensure_authenticated.return_value = True
        self.mock_client._get_api_headers.return_value = {}
        self.mock_client.api_base_url = "https://api.meijer.com"

        self.favorites_manager = FavoritesManager(self.mock_client)

    def test_init(self):
        """Test FavoritesManager initialization."""
        self.assertEqual(self.favorites_manager.meijer, self.mock_client)
        self.assertEqual(self.favorites_manager.logger, self.mock_client.logger)

        expected_endpoints = {
            "get_favorites",
            "add_favorite",
            "delete_favorite",
            "add_to_shopping_list",
        }
        self.assertEqual(
            set(self.favorites_manager.endpoints.keys()), expected_endpoints
        )

    @patch("meijer.favorites.urljoin")
    def test_get_favorites_success(self, mock_urljoin):
        """Test successful favorites retrieval."""
        mock_urljoin.return_value = "https://api.meijer.com/test"

        # Mock successful response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "favoriteListItems": [
                {
                    "listItemId": 1,
                    "listItemTypeId": 1,
                    "itemDisplayOrder": 1,
                    "itemDescription": "Test Item",
                    "isItemInActiveList": False,
                }
            ],
            "totalCount": 1,
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.favorites_manager.get_favorites()

        self.assertIsInstance(result, FavoritesResponse)
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0].item_description, "Test Item")

    @patch("meijer.favorites.urljoin")
    def test_get_favorites_authentication_error(self, mock_urljoin):
        """Test favorites retrieval with authentication error."""
        self.mock_client._ensure_authenticated.return_value = False

        with self.assertRaises(Exception):
            self.favorites_manager.get_favorites()

    @patch("meijer.favorites.urljoin")
    def test_add_favorite_success(self, mock_urljoin):
        """Test successful favorite addition."""
        mock_urljoin.return_value = "https://api.meijer.com/test"

        # Mock successful response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "updateConfirmations": [
                {
                    "listItemId": 123,
                    "listItemTypeId": 1,
                    "itemDisplayOrder": 1,
                    "itemDescription": "Added Item",
                    "isItemInActiveList": False,
                }
            ]
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.favorites_manager.add_favorite("Test Item", "123456789")

        self.assertIsInstance(result, UpdateConfirmation)
        self.assertEqual(result.item_description, "Added Item")
        self.assertEqual(result.list_item_id, 123)

    @patch("meijer.favorites.urljoin")
    def test_delete_favorite_success(self, mock_urljoin):
        """Test successful favorite deletion."""
        mock_urljoin.return_value = "https://api.meijer.com/test"

        # Mock successful response
        mock_response = Mock()
        mock_response.status_code = 200

        self.mock_client._make_request.return_value = mock_response

        result = self.favorites_manager.delete_favorite(123)

        self.assertTrue(result)

    def test_search_favorites(self):
        """Test favorites search functionality."""
        # Mock get_favorites to return test data
        test_items = [
            FavoriteListItem(
                list_item_id=1,
                list_item_type_id=1,
                item_display_order=1,
                item_description="Apple Juice",
                is_item_in_active_list=False,
            ),
            FavoriteListItem(
                list_item_id=2,
                list_item_type_id=1,
                item_display_order=2,
                item_description="Orange Juice",
                is_item_in_active_list=False,
            ),
            FavoriteListItem(
                list_item_id=3,
                list_item_type_id=1,
                item_display_order=3,
                item_description="Milk",
                is_item_in_active_list=False,
            ),
        ]

        with patch.object(self.favorites_manager, "get_favorites") as mock_get:
            mock_get.return_value = FavoritesResponse(favorite_list_items=test_items)

            # Search for juice
            results = self.favorites_manager.search_favorites("juice")
            self.assertEqual(len(results), 2)

            # Search for milk
            results = self.favorites_manager.search_favorites("milk")
            self.assertEqual(len(results), 1)

            # Search for non-existent item
            results = self.favorites_manager.search_favorites("bread")
            self.assertEqual(len(results), 0)

    def test_get_favorites_summary(self):
        """Test favorites summary functionality."""
        # Mock get_favorites to return test data
        test_items = [
            FavoriteListItem(
                list_item_id=1,
                list_item_type_id=1,
                item_display_order=1,
                item_description="Apple",
                item_part_number="123456789",
                store_id=217,
                is_item_in_active_list=False,
            ),
            FavoriteListItem(
                list_item_id=2,
                list_item_type_id=0,
                item_display_order=2,
                item_description="Manual Item",
                is_item_in_active_list=False,
            ),
        ]

        with patch.object(self.favorites_manager, "get_favorites") as mock_get:
            mock_get.return_value = FavoritesResponse(favorite_list_items=test_items)

            summary = self.favorites_manager.get_favorites_summary()

            self.assertEqual(summary["total_count"], 2)
            self.assertEqual(summary["by_type"][1], 1)  # Product items
            self.assertEqual(summary["by_type"][0], 1)  # Manual items
            self.assertEqual(summary["items_with_upc"], 1)
            self.assertEqual(summary["manual_items"], 1)
            self.assertEqual(summary["by_store"]["217"], 1)
            self.assertEqual(len(summary["recent_items"]), 2)


if __name__ == "__main__":
    import unittest

    unittest.main()
