"""
Tests for the Meijer shopping list functionality.
"""

import pytest
from unittest.mock import Mock, patch, MagicMock
from datetime import date

from meijer.shopping_list import MeijerList
from meijer.models import ListItem, ItemType
from meijer.exceptions import MeijerAuthenticationError


class TestMeijerList:
    """Test the MeijerList class."""

    def setup_method(self):
        """Set up test fixtures."""
        self.mock_client = Mock()
        self.mock_client.logger = Mock()
        self.mock_client._ensure_authenticated.return_value = True
        self.mock_client.api_base_url = "https://api.meijer.com"
        self.mock_client._get_api_headers.return_value = {"Authorization": "Bearer token"}
        self.mock_client._make_request = Mock()  # Add the missing method
        
        self.shopping_list = MeijerList(self.mock_client)

    def test_init(self):
        """Test MeijerList initialization."""
        assert self.shopping_list.meijer == self.mock_client
        assert self.shopping_list.logger == self.mock_client.logger
        assert "get_list" in self.shopping_list.endpoints
        assert "add_item" in self.shopping_list.endpoints

    def test_get_list_success(self):
        """Test getting shopping list successfully."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "listItems": [
                {
                    "listItemId": 1,
                    "itemDescription": "Milk",
                    "quantity": 2,
                    "itemPartNumber": "123456789",
                    "listItemTypeId": 1,
                    "itemDisplayOrder": 1,
                    "storeId": 123,
                    "notes": "Organic",
                    "isComplete": False,
                    "isFavorite": False
                }
            ]
        }
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shopping_list.get()
        
        assert len(result) == 1
        assert isinstance(result[0], ListItem)
        assert result[0].name == "Milk"
        assert result[0].quantity == 2
        assert result[0].item_part_number == "123456789"

    def test_get_list_failure(self):
        """Test getting shopping list with failure."""
        mock_response = Mock()
        mock_response.status_code = 500
        mock_response.text = "Internal Server Error"
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shopping_list.get()
        
        assert result == []
        self.mock_client.logger.error.assert_called()

    def test_get_list_exception(self):
        """Test getting shopping list with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")
        
        result = self.shopping_list.get()
        
        assert result == []
        self.mock_client.logger.error.assert_called()

    def test_get_list_authentication_failure(self):
        """Test getting shopping list without authentication."""
        self.mock_client._ensure_authenticated.return_value = False
        
        # The method should return an empty list when authentication fails
        result = self.shopping_list.get()
        assert result == []

    def test_add_item_success(self):
        """Test adding item to shopping list successfully."""
        mock_response = Mock()
        mock_response.status_code = 201
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shopping_list.add_item("123456789", 2)
        
        assert result is True
        self.mock_client._make_request.assert_called_once()
        call_args = self.mock_client._make_request.call_args
        assert call_args[0][0] == "POST"  # method
        assert "AddListItem" in call_args[0][1]  # URL
        assert call_args[1]["json_data"]["listItems"][0]["itemPartNumber"] == "123456789"

    def test_add_item_with_details_success(self):
        """Test adding item with details successfully."""
        mock_response = Mock()
        mock_response.status_code = 200
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shopping_list.add_item_with_details(
            upc="123456789",
            quantity=3,
            description="Organic Milk",
            notes="From local farm",
            display_order=5
        )
        
        assert result is True
        call_args = self.mock_client._make_request.call_args
        json_data = call_args[1]["json_data"]["listItems"][0]
        assert json_data["itemPartNumber"] == "123456789"
        assert json_data["quantity"] == 3
        assert json_data["itemDescription"] == "Organic Milk"
        assert json_data["notes"] == "From local farm"
        assert json_data["itemDisplayOrder"] == 5

    def test_add_item_failure(self):
        """Test adding item with failure."""
        mock_response = Mock()
        mock_response.status_code = 400
        mock_response.text = "Bad Request"
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shopping_list.add_item("123456789")
        
        assert result is False
        self.mock_client.logger.error.assert_called()

    def test_add_item_exception(self):
        """Test adding item with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")
        
        result = self.shopping_list.add_item("123456789")
        
        assert result is False
        self.mock_client.logger.error.assert_called()

    def test_complete_item_success(self):
        """Test completing item successfully."""
        mock_response = Mock()
        mock_response.status_code = 204
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shopping_list.complete_item("123")
        
        assert result is True
        call_args = self.mock_client._make_request.call_args
        assert call_args[0][0] == "PUT"  # method
        assert "MarkAsCompleted/123" in call_args[0][1]  # URL

    def test_complete_item_failure(self):
        """Test completing item with failure."""
        mock_response = Mock()
        mock_response.status_code = 404
        mock_response.text = "Not Found"
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shopping_list.complete_item("123")
        
        assert result is False
        self.mock_client.logger.error.assert_called()

    def test_delete_item_success(self):
        """Test deleting item successfully."""
        mock_response = Mock()
        mock_response.status_code = 200
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shopping_list.delete_item("123")
        
        assert result is True
        call_args = self.mock_client._make_request.call_args
        assert call_args[0][0] == "DELETE"  # method
        assert "DeleteListItem/123" in call_args[0][1]  # URL

    def test_delete_item_failure(self):
        """Test deleting item with failure."""
        mock_response = Mock()
        mock_response.status_code = 404
        mock_response.text = "Not Found"
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shopping_list.delete_item("123")
        
        assert result is False
        self.mock_client.logger.error.assert_called()

    def test_get_favorites_success(self):
        """Test getting favorites successfully."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "favoriteListItems": [
                {
                    "listItemId": 1,
                    "itemDescription": "Favorite Milk",
                    "quantity": 1,
                    "itemPartNumber": "123456789",
                    "listItemTypeId": 1,
                    "itemDisplayOrder": 1,
                    "storeId": 123,
                    "notes": "Always buy this",
                    "isComplete": False,
                    "isFavorite": True
                }
            ]
        }
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shopping_list.get_favorites()
        
        assert len(result) == 1
        assert isinstance(result[0], ListItem)
        assert result[0].name == "Favorite Milk"
        assert result[0].is_favorite is True

    def test_get_favorites_failure(self):
        """Test getting favorites with failure."""
        mock_response = Mock()
        mock_response.status_code = 500
        mock_response.text = "Internal Server Error"
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shopping_list.get_favorites()
        
        assert result == []
        self.mock_client.logger.error.assert_called()

    def test_add_favorite_success(self):
        """Test adding favorite successfully."""
        mock_response = Mock()
        mock_response.status_code = 201
        mock_response.json.return_value = {"success": True}
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shopping_list.add_favorite("123456789")
        
        assert result is True
        call_args = self.mock_client._make_request.call_args
        assert call_args[0][0] == "POST"  # method
        assert "AddFavoritesListItem" in call_args[0][1]  # URL

    def test_add_favorite_failure(self):
        """Test adding favorite with failure."""
        mock_response = Mock()
        mock_response.status_code = 400
        mock_response.text = "Bad Request"
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shopping_list.add_favorite("123456789")
        
        assert result is False
        self.mock_client.logger.error.assert_called()

    def test_delete_favorite_success(self):
        """Test deleting favorite successfully."""
        # Mock the get_favorites method to return a test item
        mock_item = Mock()
        mock_item.list_item_id = 123
        mock_item.item_part_number = "123456789"
        mock_item.item_description = "Test Item"
        
        with patch.object(self.shopping_list, 'get_favorites', return_value=[mock_item]):
            mock_response = Mock()
            mock_response.status_code = 200
            
            self.mock_client._make_request.return_value = mock_response
            
            result = self.shopping_list.delete_favorite("123456789")
            
            assert result is True
            call_args = self.mock_client._make_request.call_args
            assert call_args[0][0] == "POST"  # method
            assert "DeleteBulkListItems" in call_args[0][1]  # URL

    def test_delete_favorite_not_found(self):
        """Test deleting favorite that doesn't exist."""
        with patch.object(self.shopping_list, 'get_favorites', return_value=[]):
            result = self.shopping_list.delete_favorite("123456789")
            
            assert result is False
            self.mock_client.logger.warning.assert_called()

    def test_delete_favorite_exception(self):
        """Test deleting favorite with exception."""
        with patch.object(self.shopping_list, 'get_favorites', side_effect=Exception("Error")):
            result = self.shopping_list.delete_favorite("123456789")
            
            assert result is False
            self.mock_client.logger.error.assert_called()

    def test_map_api_response_to_listitem(self):
        """Test mapping API response to ListItem constructor parameters."""
        api_data = {
            "listItemId": 123,
            "itemDescription": "Test Item",
            "quantity": 2,
            "itemPartNumber": "123456789",
            "listItemTypeId": 1,
            "itemDisplayOrder": 5,
            "storeId": 456,
            "notes": "Test notes",
            "isComplete": False,
            "isFavorite": True,
            "listingId": 789,
            "promotionStart": "2024-01-01T00:00:00Z",
            "promotionEnd": "2024-12-31T23:59:59Z",
            "couponId": 999
        }
        
        result = self.shopping_list._map_api_response_to_listitem(api_data)
        
        assert result["list_item_id"] == 123
        assert result["item_description"] == "Test Item"
        assert result["quantity"] == 2
        assert result["item_part_number"] == "123456789"
        assert result["list_item_type_id"] == 1
        assert result["item_display_order"] == 5
        assert result["store_id"] == 456
        assert result["notes"] == "Test notes"
        assert result["is_complete"] is False
        assert result["is_favorite"] is True
        assert result["listing_id"] == 789
        assert result["coupon_id"] == 999
        assert isinstance(result["promotion_start"], date)
        assert isinstance(result["promotion_end"], date)

    def test_map_api_response_to_listitem_with_defaults(self):
        """Test mapping API response with missing fields uses defaults."""
        api_data = {
            "itemDescription": "Test Item"
        }
        
        result = self.shopping_list._map_api_response_to_listitem(api_data)
        
        assert result["list_item_id"] == 0
        assert result["list_item_type_id"] == 1
        assert result["item_display_order"] == 1
        assert result["quantity"] == 1
        assert result["store_id"] == 0
        assert result["notes"] is None
        assert result["is_complete"] is False
        assert result["is_favorite"] is False
        assert result["listing_id"] is None
        assert result["coupon_id"] == 0

    def test_map_api_response_to_listitem_invalid_dates(self):
        """Test mapping API response with invalid dates."""
        api_data = {
            "itemDescription": "Test Item",
            "promotionStart": "invalid-date",
            "promotionEnd": "also-invalid"
        }
        
        result = self.shopping_list._map_api_response_to_listitem(api_data)
        
        assert result["promotion_start"] is None
        assert result["promotion_end"] is None

    def test_defrag_empty_list(self):
        """Test defrag with empty shopping list."""
        with patch.object(self.shopping_list, 'get', return_value=[]):
            result = self.shopping_list.defrag()
            
            assert result is True

    def test_defrag_search_import_error(self):
        """Test defrag when search module is not available."""
        with patch.object(self.shopping_list, 'get', return_value=[Mock()]), \
             patch('builtins.__import__', side_effect=ImportError("No module named 'meijer.search'")):
            
            result = self.shopping_list.defrag()
            
            assert result is False

    def test_defrag_exception(self):
        """Test defrag with exception."""
        with patch.object(self.shopping_list, 'get', side_effect=Exception("Error")):
            result = self.shopping_list.defrag()
            
            assert result is False 