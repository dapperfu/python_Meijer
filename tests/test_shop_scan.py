#!/usr/bin/env python3
"""
Tests for the Shop & Scan module.
"""

from unittest.mock import Mock, patch

import pytest

from meijer.models import MeijerItem
from meijer.shop_scan import ShopNScan


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
                "imageUrl": "https://example.com/image.jpg",
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

        result = self.shop_scan.add_to_cart(
            "123456789012", quantity=2, store_id="store123"
        )

        assert result is True

        # Verify the request was made correctly
        call_args = self.mock_client._make_request.call_args
        assert call_args[0][0] == "POST"  # method
        assert (
            self.shop_scan.endpoints["add_to_cart"] in call_args[0][1]
        )  # URL contains endpoint

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
        assert (
            self.shop_scan.endpoints["remove_from_cart"] in call_args[0][1]
        )  # URL contains endpoint

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
                        "name": "Test Product",
                    }
                ],
                "total": 19.98,
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
        assert (
            self.shop_scan.endpoints["get_cart"] in call_args[0][1]
        )  # URL contains endpoint

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
        assert (
            self.shop_scan.endpoints["clear_cart"] in call_args[0][1]
        )  # URL contains endpoint

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
                "imageUrl": "https://example.com/image.jpg",
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
        assert (
            result.title == "Unknown Product"
        )  # title falls back to default when name is missing
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

    def test_lookup_barcode_shopscan_success(self):
        """Test _lookup_barcode_shopscan with successful response."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "product": {
                "id": "prod123",
                "name": "Test Product",
                "description": "Test Description",
                "price": 9.99,
                "unitPrice": 0.50,
            }
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.shop_scan._lookup_barcode_shopscan("123456789012")

        assert result is not None
        assert result.title == "Test Product"
        assert result.upc == "123456789012"

    def test_lookup_barcode_shopscan_404_continues(self):
        """Test _lookup_barcode_shopscan continues on 404 responses."""
        # First endpoint returns 404, second succeeds
        mock_response_404 = Mock()
        mock_response_404.status_code = 404

        mock_response_success = Mock()
        mock_response_success.status_code = 200
        mock_response_success.json.return_value = {
            "product": {"id": "prod123", "name": "Test Product", "price": 9.99}
        }

        self.mock_client._make_request.side_effect = [
            mock_response_404,
            mock_response_success,
        ]

        result = self.shop_scan._lookup_barcode_shopscan("123456789012")

        assert result is not None
        assert result.title == "Test Product"

    def test_lookup_barcode_shopscan_all_fail(self):
        """Test _lookup_barcode_shopscan when all endpoints fail."""
        mock_response = Mock()
        mock_response.status_code = 500

        self.mock_client._make_request.return_value = mock_response

        result = self.shop_scan._lookup_barcode_shopscan("123456789012")

        assert result is None

    def test_search_by_barcode_direct_success(self):
        """Test _search_by_barcode_direct with successful response."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "prod123",
                            "description": "Test Product",
                            "ean": "123456789012",
                            "price": 9.99,
                        },
                        "value": "Test Product",
                    }
                ],
                "total_num_results": 1,
            }
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.shop_scan._search_by_barcode_direct("123456789012")

        assert result is not None
        assert result.title == "Test Product"
        assert result.upc == "123456789012"

    def test_search_by_barcode_direct_no_exact_match(self):
        """Test _search_by_barcode_direct with no exact barcode match."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "prod123",
                            "description": "Test Product",
                            "ean": "different_barcode",
                            "price": 9.99,
                        },
                        "value": "Test Product",
                    }
                ],
                "total_num_results": 1,
            }
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.shop_scan._search_by_barcode_direct("123456789012")

        assert result is None

    def test_search_by_barcode_direct_no_results(self):
        """Test _search_by_barcode_direct with no results."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {"results": [], "total_num_results": 0}
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.shop_scan._search_by_barcode_direct("123456789012")

        assert result is None

    def test_search_by_barcode_direct_exception(self):
        """Test _search_by_barcode_direct with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")

        result = self.shop_scan._search_by_barcode_direct("123456789012")

        assert result is None

    def test_search_by_product_name_fallback_success(self):
        """Test _search_by_product_name_fallback with successful response."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "prod123",
                            "description": "Coca Cola Classic",
                            "price": 1.99,
                        },
                        "value": "Coca Cola Classic",
                    }
                ],
                "total_num_results": 1,
            }
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.shop_scan._search_by_product_name_fallback("049000050103")

        assert result is not None
        assert result.title == "Coca Cola Classic"
        assert result.upc == "049000050103"  # Should be set to original barcode

    def test_search_by_product_name_fallback_no_results(self):
        """Test _search_by_product_name_fallback with no results."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {"results": [], "total_num_results": 0}
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.shop_scan._search_by_product_name_fallback("invalid_barcode")

        assert result is None

    def test_search_by_product_name_fallback_exception(self):
        """Test _search_by_product_name_fallback with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")

        result = self.shop_scan._search_by_product_name_fallback("049000050103")

        assert result is None

    def test_bulk_lookup_barcodes(self):
        """Test bulk_lookup_barcodes method."""
        # Mock successful responses for both barcodes
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "product": {"id": "prod123", "name": "Test Product", "price": 9.99}
        }

        self.mock_client._make_request.return_value = mock_response

        barcodes = ["123456789012", "987654321098"]
        results = self.shop_scan.bulk_lookup_barcodes(barcodes)

        assert len(results) == 2
        assert "123456789012" in results
        assert "987654321098" in results
        assert results["123456789012"] is not None
        assert results["987654321098"] is not None

    def test_add_to_cart_success(self):
        """Test add_to_cart method with successful response."""
        mock_response = Mock()
        mock_response.status_code = 200

        self.mock_client._make_request.return_value = mock_response

        result = self.shop_scan.add_to_cart("123456789012", quantity=2)

        assert result is True
        self.mock_client._make_request.assert_called_once()

    def test_add_to_cart_failure(self):
        """Test add_to_cart method with failed response."""
        mock_response = Mock()
        mock_response.status_code = 400

        self.mock_client._make_request.return_value = mock_response

        result = self.shop_scan.add_to_cart("123456789012", quantity=1)

        assert result is False

    def test_add_to_cart_exception(self):
        """Test add_to_cart method with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")

        result = self.shop_scan.add_to_cart("123456789012", quantity=1)

        assert result is False

    def test_parse_shopscan_response_no_product(self):
        """Test _parse_shopscan_response with no product data."""
        data = {"other": "data"}

        result = self.shop_scan._parse_shopscan_response(data, "123456789012")

        assert result is None

    def test_parse_shopscan_response_exception(self):
        """Test _parse_shopscan_response with exception."""
        # Pass data that will cause an exception during MeijerItem creation
        # Mock the MeijerItem constructor to raise an exception
        with patch("meijer.shop_scan.MeijerItem") as mock_meijer_item:
            mock_meijer_item.side_effect = Exception("Test exception")

            data = {"product": {"name": "Test Product"}}
            result = self.shop_scan._parse_shopscan_response(data, "123456789012")

            assert result is None

    def test_search_by_barcode_direct_success_with_meijer_item(self):
        """Test _search_by_barcode_direct successfully creating MeijerItem."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "prod123",
                            "description": "Test Product",
                            "ean": "123456789012",
                            "price": 9.99,
                            "priceByWeight": True,
                        },
                        "value": "Test Product",
                    }
                ],
                "total_num_results": 1,
            }
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.shop_scan._search_by_barcode_direct("123456789012")

        assert result is not None
        assert result.title == "Test Product"
        assert result.upc == "123456789012"
        assert result.price == 9.99
        assert result.is_weighted is True
        assert result.raw_data is not None


if __name__ == "__main__":
    pytest.main([__file__])
