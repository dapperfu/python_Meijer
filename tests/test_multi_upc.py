#!/usr/bin/env python3
"""
Tests for multi-UPC functionality.

This module tests the new multi-UPC endpoint integration that allows
efficient bulk UPC lookup for up to 20 products in a single API call.
"""

import pytest
from unittest.mock import Mock, patch

from meijer.search import Search
from meijer.models import MeijerItem


class TestMultiUPCSearch:
    """Test cases for multi-UPC search functionality."""

    def setup_method(self):
        """Set up test fixtures."""
        self.mock_meijer = Mock()
        self.mock_meijer.config.api_base = "https://api.meijer.com"
        self.mock_meijer._make_request = Mock()
        self.search = Search(self.mock_meijer)

        # Sample UPCs for testing
        self.test_upcs = [
            "1189600014",
            "1780016746",
            "1114110614",
            "1838527823",
            "1780014927",
            "1200000170",
            "1780001260",
            "1780010033",
            "1901461206",
            "1200001711",
        ]

        # Sample response data
        self.sample_response = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "1189600014",
                            "price": 9.99,
                            "description": "Test description 1",
                            "stockLevelStatus": "inStock",
                            "pickupAvailableFlag": True,
                            "hasMPerks": False,
                            "sale": False,
                            "ebtFoodstampable": True,
                            "isAgeRestricted": False,
                        },
                        "value": "Test Product 1",
                    },
                    {
                        "data": {
                            "id": "1780016746",
                            "price": 19.99,
                            "description": "Test description 2",
                            "stockLevelStatus": "outOfStock",
                            "pickupAvailableFlag": False,
                            "hasMPerks": True,
                            "sale": True,
                            "ebtFoodstampable": False,
                            "isAgeRestricted": True,
                        },
                        "value": "Test Product 2",
                    },
                ]
            }
        }

    def test_search_multiple_upcs_success(self):
        """Test successful multi-UPC search."""
        # Mock the API response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = self.sample_response

        self.mock_meijer._make_request.return_value = mock_response

        # Test the method
        result = self.search.search_multiple_upcs(self.test_upcs[:2])

        # Verify the request was made correctly
        self.mock_meijer._make_request.assert_called_once()
        call_args = self.mock_meijer._make_request.call_args

        assert call_args[0][0] == "POST"  # Method
        assert "digital/multi-upc/v1/upcs" in call_args[0][1]  # URL
        assert call_args[1]["json"]["upcs"] == self.test_upcs[:2]  # Payload

        # Verify the result
        assert len(result) == 2
        assert isinstance(result[0], MeijerItem)
        assert result[0].upc == "1189600014"
        assert result[0].title == "Test Product 1"
        assert result[0].price == 9.99
        assert result[0].is_available is True

        assert result[1].upc == "1780016746"
        assert result[1].title == "Test Product 2"
        assert result[1].price == 19.99
        assert result[1].is_available is False

    def test_search_multiple_upcs_with_store_id(self):
        """Test multi-UPC search with store ID."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = self.sample_response

        self.mock_meijer._make_request.return_value = mock_response

        # Test with store ID
        result = self.search.search_multiple_upcs(self.test_upcs[:2], store_id="19")

        # Verify store ID was included in payload
        call_args = self.mock_meijer._make_request.call_args
        assert call_args[1]["json"]["unitId"] == "19"

    def test_search_multiple_upcs_too_many_upcs(self):
        """Test that error is raised when too many UPCs are provided."""
        too_many_upcs = [str(i) for i in range(25)]  # 25 UPCs (over limit)

        with pytest.raises(ValueError, match="Maximum of 20 UPCs allowed"):
            self.search.search_multiple_upcs(too_many_upcs)

    def test_search_multiple_upcs_empty_list(self):
        """Test multi-UPC search with empty list."""
        result = self.search.search_multiple_upcs([])
        assert result == []

        # Verify no API call was made
        self.mock_meijer._make_request.assert_not_called()

    def test_search_multiple_upcs_api_failure(self):
        """Test fallback to individual searches when API fails."""
        # Mock API failure
        mock_response = Mock()
        mock_response.status_code = 500
        mock_response.text = "Internal Server Error"

        self.mock_meijer._make_request.return_value = mock_response

        # Mock individual search success
        mock_item = Mock(spec=MeijerItem)
        mock_item.upc = "1189600014"
        mock_item.title = "Test Product"

        with patch.object(self.search, "search_by_barcode", return_value=mock_item):
            result = self.search.search_multiple_upcs(self.test_upcs[:2])

            # Should fall back to individual searches
            assert len(result) == 2
            assert result[0].upc == "1189600014"
            assert result[1].upc == "1189600014"

    def test_search_multiple_upcs_exception_fallback(self):
        """Test fallback when exception occurs during API call."""
        # Mock exception during API call
        self.mock_meijer._make_request.side_effect = Exception("Network error")

        # Mock individual search success
        mock_item = Mock(spec=MeijerItem)
        mock_item.upc = "1189600014"
        mock_item.title = "Test Product"

        with patch.object(self.search, "search_by_barcode", return_value=mock_item):
            result = self.search.search_multiple_upcs(self.test_upcs[:2])

            # Should fall back to individual searches
            assert len(result) == 2

    def test_parse_multi_upc_response(self):
        """Test parsing of multi-UPC response."""
        result = self.search._parse_multi_upc_response(
            self.sample_response, ["1189600014", "1780016746"]
        )

        assert len(result) == 2
        assert result[0].upc == "1189600014"
        assert result[1].upc == "1780016746"

    def test_parse_multi_upc_response_missing_upc(self):
        """Test parsing when some UPCs are missing from response."""
        result = self.search._parse_multi_upc_response(
            self.sample_response,
            ["1189600014", "9999999999"],  # Second UPC not in response
        )

        assert len(result) == 1
        assert result[0].upc == "1189600014"

    def test_create_meijer_item_from_multi_upc(self):
        """Test creation of MeijerItem from multi-UPC response."""
        result_data = self.sample_response["response"]["results"][0]

        item = self.search._create_meijer_item_from_multi_upc(result_data, "1189600014")

        assert item is not None
        assert item.upc == "1189600014"
        assert item.title == "Test Product 1"
        assert item.price == 9.99
        assert item.description == "Test description 1"
        assert item.is_available is True

    def test_create_meijer_item_from_multi_upc_failure(self):
        """Test handling of item creation failure."""
        # Test with invalid data
        invalid_result = {"data": {}}  # Missing required fields

        item = self.search._create_meijer_item_from_multi_upc(
            invalid_result, "9999999999"
        )

        # Should handle gracefully and return a basic item with minimal data
        assert item is not None
        assert item.upc == "9999999999"
        assert item.title == "Product 9999999999"  # Default title
        assert item.price is None  # No price data

    def test_fallback_multiple_upc_search(self):
        """Test fallback method for multiple UPC search."""
        # Mock individual search success
        mock_item = Mock(spec=MeijerItem)
        mock_item.upc = "1189600014"
        mock_item.title = "Test Product"

        with patch.object(self.search, "search_by_barcode", return_value=mock_item):
            result = self.search._fallback_multiple_upc_search(self.test_upcs[:3])

            assert len(result) == 3
            assert all(item.upc == "1189600014" for item in result)

    def test_fallback_multiple_upc_search_with_exceptions(self):
        """Test fallback method handles individual search exceptions."""

        # Mock some searches failing
        def mock_search_by_barcode(upc):
            if upc == "1189600014":
                return Mock(spec=MeijerItem, upc=upc, title="Test Product")
            else:
                raise Exception("Search failed")

        with patch.object(
            self.search, "search_by_barcode", side_effect=mock_search_by_barcode
        ):
            result = self.search._fallback_multiple_upc_search(self.test_upcs[:3])

            # Should return only successful searches
            assert len(result) == 1
            assert result[0].upc == "1189600014"


class TestMultiUPCSearchIntegration:
    """Integration tests for multi-UPC search."""

    def test_search_multiple_upcs_headers(self):
        """Test that correct headers are sent with multi-UPC request."""
        mock_meijer = Mock()
        mock_meijer.config.api_base = "https://api.meijer.com"
        mock_meijer._make_request = Mock()

        search = Search(mock_meijer)

        # Mock successful response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"response": {"results": []}}
        mock_meijer._make_request.return_value = mock_response

        # Test the method
        search.search_multiple_upcs(["1189600014"])

        # Verify headers
        call_args = mock_meijer._make_request.call_args
        headers = call_args[1]["headers"]

        assert headers["Accept"] == "application/json"
        assert headers["Content-Type"] == "application/json; charset=UTF-8"
        assert (
            headers["OCP-APIM-Subscription-Key"] == "a10bc58ac484478d9b3958b1742c3a03"
        )

    def test_search_multiple_upcs_payload_structure(self):
        """Test that payload structure is correct."""
        mock_meijer = Mock()
        mock_meijer.config.api_base = "https://api.meijer.com"
        mock_meijer._make_request = Mock()

        search = Search(mock_meijer)

        # Mock successful response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"response": {"results": []}}
        mock_meijer._make_request.return_value = mock_response

        # Test with store ID
        upcs = ["1189600014", "1780016746"]
        store_id = "19"

        search.search_multiple_upcs(upcs, store_id)

        # Verify payload structure
        call_args = mock_meijer._make_request.call_args
        payload = call_args[1]["json"]

        assert payload["upcs"] == upcs
        assert payload["unitId"] == store_id
        assert len(payload) == 2


if __name__ == "__main__":
    pytest.main([__file__])
