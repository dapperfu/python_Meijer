#!/usr/bin/env python3
"""
Tests for the Shop & Scan module.
"""

import pytest
from unittest.mock import Mock, patch, MagicMock
from meijer.shop_scan import ShopNScan
from meijer.models import MeijerItem
from meijer.exceptions import MeijerAPIError


class TestShopNScan:
    """Test the ShopNScan class."""
    
    def setup_method(self):
        """Set up test fixtures."""
        self.mock_client = Mock()
        self.mock_client.logger = Mock()
        self.mock_client._make_request = Mock()
        self.shop_scan = ShopNScan(self.mock_client)
    
    def test_init(self):
        """Test ShopNScan initialization."""
        assert self.shop_scan.meijer == self.mock_client
        assert self.shop_scan.logger == self.mock_client.logger
        assert "lookup_item" in self.shop_scan.endpoints
        assert "add_to_cart" in self.shop_scan.endpoints
        assert "remove_from_cart" in self.shop_scan.endpoints
        assert "get_cart" in self.shop_scan.endpoints
        assert "clear_cart" in self.shop_scan.endpoints
    
    def test_lookup_barcode_price_shopscan_success(self):
        """Test successful barcode lookup via Shop & Scan API."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "product": {
                "id": "prod123",
                "name": "Test Product",
                "description": "Test Description",
                "brand": "Test Brand",
                "category": "Test Category",
                "upc": "123456789012",
                "price": 9.99,
                "salePrice": 7.99,
                "unitPrice": 0.50,
                "isWeighted": True,
                "weightUnit": "lb",
                "weightAmount": 2.0,
                "imageUrl": "https://example.com/image.jpg"
            }
        }
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shop_scan.lookup_barcode_price("123456789012")
        
        assert result is not None
        assert isinstance(result, MeijerItem)
        assert result.id == "prod123"
        assert result.title == "Test Product"  # title comes from name field
        assert result.description == "Test Description"
        assert result.brand == "Test Brand"
        assert result.category == "Test Category"
        assert result.upc == "123456789012"
        assert result.price == 9.99
        assert result.sale_price == 7.99
        assert result.unit_price == "0.5"  # unit_price is converted to string
        assert result.is_weighted is True
        assert result.weight_unit == "lb"
        assert result.weight_amount == 2.0
        assert result.image_url == "https://example.com/image.jpg"
        
        # Verify the request was made correctly
        call_args = self.mock_client._make_request.call_args
        assert call_args[0][0] in ["GET", "POST"]  # method could be either
        
        # Verify barcode is passed either as param or in json_data
        if "params" in call_args[1]:
            params = call_args[1]["params"]
            if "barcode" in params:
                assert params["barcode"] == "123456789012"
        elif "json_data" in call_args[1]:
            json_data = call_args[1]["json_data"]
            assert json_data["barcode"] == "123456789012"
    
    def test_lookup_barcode_price_shopscan_failure(self):
        """Test failed barcode lookup via Shop & Scan API."""
        mock_response = Mock()
        mock_response.status_code = 404
        mock_response.text = "Product not found"
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shop_scan.lookup_barcode_price("123456789012")
        
        assert result is None
    
    def test_lookup_barcode_price_shopscan_exception(self):
        """Test barcode lookup with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")
        
        result = self.shop_scan.lookup_barcode_price("123456789012")
        
        assert result is None
    
    def test_add_to_cart_success(self):
        """Test successful cart addition."""
        mock_response = Mock()
        mock_response.status_code = 201
        mock_response.text = "Created"
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shop_scan.add_to_cart("123456789012", quantity=2, store_id="store123")
        
        assert result is True
        
        # Verify the request was made correctly
        call_args = self.mock_client._make_request.call_args
        assert call_args[0][0] == "POST"  # method
        assert self.shop_scan.endpoints["add_to_cart"] in call_args[0][1]  # URL contains endpoint
        
        # Verify data structure
        json_data = call_args[1]["json_data"]
        assert json_data["barcode"] == "123456789012"
        assert json_data["quantity"] == 2
        assert json_data["storeId"] == "store123"
    
    def test_add_to_cart_failure(self):
        """Test failed cart addition."""
        mock_response = Mock()
        mock_response.status_code = 400
        mock_response.text = "Bad Request"
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shop_scan.add_to_cart("123456789012")
        
        assert result is False
    
    def test_add_to_cart_exception(self):
        """Test cart addition with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")
        
        result = self.shop_scan.add_to_cart("123456789012")
        
        assert result is False
    
    def test_remove_from_cart_success(self):
        """Test successful cart removal."""
        mock_response = Mock()
        mock_response.status_code = 204
        mock_response.text = "No Content"
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shop_scan.remove_from_cart("123456789012", store_id="store123")
        
        assert result is True
        
        # Verify the request was made correctly
        call_args = self.mock_client._make_request.call_args
        assert call_args[0][0] == "POST"  # method
        assert self.shop_scan.endpoints["remove_from_cart"] in call_args[0][1]  # URL contains endpoint
        
        # Verify data structure
        json_data = call_args[1]["json_data"]
        assert json_data["barcode"] == "123456789012"
        assert json_data["storeId"] == "store123"
    
    def test_remove_from_cart_failure(self):
        """Test failed cart removal."""
        mock_response = Mock()
        mock_response.status_code = 400
        mock_response.text = "Bad Request"
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shop_scan.remove_from_cart("123456789012")
        
        assert result is False
    
    def test_remove_from_cart_exception(self):
        """Test cart removal with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")
        
        result = self.shop_scan.remove_from_cart("123456789012")
        
        assert result is False
    
    def test_get_cart_success(self):
        """Test successful cart retrieval."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "cart": {
                "items": [
                    {
                        "barcode": "123456789012",
                        "quantity": 2,
                        "price": 9.99,
                        "name": "Test Product"
                    }
                ],
                "total": 19.98
            }
        }
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shop_scan.get_cart(store_id="store123")
        
        assert result is not None
        assert isinstance(result, list)  # get_cart returns a list of items
        assert len(result) > 0
        
        # Verify the request was made correctly
        call_args = self.mock_client._make_request.call_args
        assert call_args[0][0] == "GET"  # method
        assert self.shop_scan.endpoints["get_cart"] in call_args[0][1]  # URL contains endpoint
        
        # Verify parameters
        params = call_args[1]["params"]
        assert params["storeId"] == "store123"
    
    def test_get_cart_failure(self):
        """Test cart retrieval failure."""
        mock_response = Mock()
        mock_response.status_code = 400
        mock_response.text = "Bad Request"
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shop_scan.get_cart()
        
        assert result == []  # get_cart returns empty list on failure
    
    def test_get_cart_exception(self):
        """Test cart retrieval with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")
        
        result = self.shop_scan.get_cart()
        
        assert result == []  # get_cart returns empty list on exception
    
    def test_clear_cart_success(self):
        """Test successful cart clearing."""
        mock_response = Mock()
        mock_response.status_code = 204
        mock_response.text = "No Content"
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shop_scan.clear_cart(store_id="store123")
        
        assert result is True
        
        # Verify the request was made correctly
        call_args = self.mock_client._make_request.call_args
        assert call_args[0][0] == "POST"  # method
        assert self.shop_scan.endpoints["clear_cart"] in call_args[0][1]  # URL contains endpoint
        
        # Verify parameters
        params = call_args[1]["params"]
        assert params["storeId"] == "store123"
    
    def test_clear_cart_failure(self):
        """Test failed cart clearing."""
        mock_response = Mock()
        mock_response.status_code = 400
        mock_response.text = "Bad Request"
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.shop_scan.clear_cart()
        
        assert result is False
    
    def test_clear_cart_exception(self):
        """Test cart clearing with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")
        
        result = self.shop_scan.clear_cart()
        
        assert result is False
    
    def test_parse_shopscan_response_success(self):
        """Test successful Shop & Scan response parsing."""
        response_data = {
            "product": {
                "id": "prod123",
                "name": "Test Product",
                "description": "Test Description",
                "brand": "Test Brand",
                "category": "Test Category",
                "upc": "123456789012",
                "price": 9.99,
                "salePrice": 7.99,
                "unitPrice": 0.50,
                "isWeighted": True,
                "weightUnit": "lb",
                "weightAmount": 2.0,
                "imageUrl": "https://example.com/image.jpg"
            }
        }
        
        result = self.shop_scan._parse_shopscan_response(response_data, "123456789012")
        
        assert result is not None
        assert isinstance(result, MeijerItem)
        assert result.id == "prod123"
        assert result.title == "Test Product"  # title comes from name field
        assert result.description == "Test Description"
        assert result.brand == "Test Brand"
        assert result.category == "Test Category"
        assert result.upc == "123456789012"
        assert result.price == 9.99
        assert result.sale_price == 7.99
        assert result.unit_price == "0.5"  # unit_price is converted to string
        assert result.is_weighted is True
        assert result.weight_unit == "lb"
        assert result.weight_amount == 2.0
        assert result.image_url == "https://example.com/image.jpg"
    
    def test_parse_shopscan_response_no_product(self):
        """Test Shop & Scan response parsing with no product."""
        response_data = {"otherData": "value"}
        
        result = self.shop_scan._parse_shopscan_response(response_data, "123456789012")
        
        assert result is None
    
    def test_parse_shopscan_response_missing_fields(self):
        """Test Shop & Scan response parsing with missing fields."""
        response_data = {
            "product": {
                "id": "prod123"
                # Missing many fields including name
            }
        }
        
        result = self.shop_scan._parse_shopscan_response(response_data, "123456789012")
        
        assert result is not None
        assert result.id == "prod123"
        assert result.title == "Unknown Product"  # title falls back to default when name is missing
        assert result.description is None
        assert result.brand is None
        assert result.category is None
        assert result.upc == "123456789012"  # upc is set to the barcode parameter
        assert result.price is None
        assert result.is_weighted is False
    
    def test_parse_shopscan_response_none_data(self):
        """Test Shop & Scan response parsing with None data."""
        result = self.shop_scan._parse_shopscan_response(None, "123456789012")
        
        assert result is None


if __name__ == "__main__":
    pytest.main([__file__])
