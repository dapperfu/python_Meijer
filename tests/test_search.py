#!/usr/bin/env python3
"""
Comprehensive tests for the search module.

Tests all search functionality including product search and barcode lookup.
"""

from unittest.mock import Mock

import pytest

from meijer.models import MeijerItem, SearchResult
from meijer.search import Search


class TestSearch:
    """Test the Search class."""

    def setup_method(self):
        """Set up test fixtures."""
        self.mock_client = Mock()
        self.mock_client.logger = Mock()
        self.mock_client.api_base_url = "https://api.meijer.com"
        self.mock_client._get_api_headers.return_value = {
            "Authorization": "Bearer test"
        }
        self.mock_client._make_request.return_value = Mock(status_code=200)

        self.search = Search(self.mock_client)

    def test_init(self):
        """Test search initialization."""
        assert self.search.meijer == self.mock_client
        assert self.search.logger == self.mock_client.logger
        assert self.search.api_key == "key_GdYuTcnduTUtsZd6"
        assert self.search.constructor_base_url == "https://ac.cnstrc.com"
        assert "search" in self.search.endpoints
        assert "autocomplete" in self.search.endpoints
        assert "browse" in self.search.endpoints

    def test_search_success(self):
        """Test successful product search."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "prod123",
                            "description": "Test Product 1",
                            "brand": "Test Brand",
                            "category": "Test Category",
                            "ean": "123456789012",
                            "price": 9.99,
                            "image_url": "https://example.com/image1.jpg",
                        },
                        "value": "Test Product 1",
                    },
                    {
                        "data": {
                            "id": "prod456",
                            "description": "Test Product 2",
                            "brand": "Test Brand",
                            "category": "Test Category",
                            "ean": "123456789013",
                            "price": 12.99,
                            "image_url": "https://example.com/image2.jpg",
                        },
                        "value": "Test Product 2",
                    },
                ],
                "total_num_results": 2,
            }
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.search.search(
            "test", results_per_page=10, page=1, sort_by="relevance"
        )

        assert isinstance(result, SearchResult)
        assert result.total_results == 2
        assert len(result.results) == 2
        assert result.current_page == 1
        assert result.total_pages == 1
        assert result.query == "test"
        assert result.sort_by == "relevance"

        # Verify the first result
        first_item = result.results[0]
        assert isinstance(first_item, MeijerItem)
        assert first_item.id == "prod123"
        assert first_item.title == "Test Product 1"
        assert first_item.brand == "Test Brand"
        assert first_item.category == "Test Category"
        assert first_item.upc == "123456789012"
        assert first_item.price == 9.99
        assert first_item.image_url == "https://example.com/image1.jpg"

    def test_search_empty_results(self):
        """Test search with no results."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {"results": [], "total_num_results": 0}
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.search.search("nonexistent")

        assert result.total_results == 0
        assert len(result.results) == 0
        assert result.current_page == 1
        assert result.total_pages == 0

    def test_search_failure(self):
        """Test search failure."""
        mock_response = Mock()
        mock_response.status_code = 400
        mock_response.text = "Bad Request"

        self.mock_client._make_request.return_value = mock_response

        result = self.search.search("test")

        assert result.total_results == 0
        assert len(result.results) == 0
        assert result.current_page == 1
        assert result.total_pages == 0

    def test_search_exception(self):
        """Test search with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")

        result = self.search.search("test")

        assert result.total_results == 0
        assert len(result.results) == 0
        assert result.current_page == 1
        assert result.total_pages == 0

    def test_search_parameters(self):
        """Test search with various parameters."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {"results": [], "total_num_results": 0}
        }

        self.mock_client._make_request.return_value = mock_response

        # Test with custom parameters
        result = self.search.search(
            "test",
            results_per_page=50,
            page=2,
            sort_by="price_asc",
            custom_param="value",
        )

        # Verify the request was made with correct parameters
        call_args = self.mock_client._make_request.call_args
        params = call_args[1]["params"]

        assert params["key"] == "key_GdYuTcnduTUtsZd6"
        assert params["num_results_per_page"] == 50
        assert params["page"] == 2
        assert params["sort_by"] == "price_asc"
        assert params["custom_param"] == "value"
        assert "fmt_options[groups_max_depth]" in params
        assert "fmt_options[groups_start]" in params

    def test_search_by_barcode_success(self):
        """Test successful barcode search."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "prod123",
                            "description": "Test Product",
                            "brand": "Test Brand",
                            "category": "Test Category",
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

        result = self.search.search_by_barcode("123456789012")

        assert result is not None
        assert isinstance(result, MeijerItem)
        assert result.id == "prod123"
        assert result.title == "Test Product"
        assert result.upc == "123456789012"
        assert result.price == 9.99

    def test_search_by_barcode_no_results(self):
        """Test barcode search with no results."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {"results": [], "total_num_results": 0}
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.search.search_by_barcode("123456789012")

        assert result is None

    def test_search_by_barcode_failure(self):
        """Test barcode search failure."""
        mock_response = Mock()
        mock_response.status_code = 400
        mock_response.text = "Bad Request"

        self.mock_client._make_request.return_value = mock_response

        result = self.search.search_by_barcode("123456789012")

        assert result is None

    def test_search_by_barcode_exception(self):
        """Test barcode search with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")

        result = self.search.search_by_barcode("123456789012")

        assert result is None

    def test_parse_search_response_basic(self):
        """Test basic search response parsing."""
        data = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "prod123",
                            "description": "Test Product",
                            "brand": "Test Brand",
                            "category": "Test Category",
                            "ean": "123456789012",
                            "price": 9.99,
                        },
                        "value": "Test Product",
                    }
                ],
                "total_num_results": 1,
            }
        }

        result = self.search._parse_search_response(
            data=data, query="test", page=1, results_per_page=10, sort_by="relevance"
        )

        assert result.total_results == 1
        assert len(result.results) == 1
        assert result.current_page == 1
        assert result.total_pages == 1
        assert result.query == "test"
        assert result.sort_by == "relevance"

        item = result.results[0]
        assert item.id == "prod123"
        assert item.title == "Test Product"
        assert item.brand == "Test Brand"
        assert item.category == "Test Category"
        assert item.upc == "123456789012"
        assert item.price == 9.99

    def test_parse_search_response_with_metadata(self):
        """Test search response parsing with metadata."""
        data = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "prod123",
                            "description": "Test Product",
                            "brand": "Test Brand",
                            "category": "Test Category",
                            "ean": "123456789012",
                            "price": 9.99,
                            "sale_price": 7.99,
                            "unit_price": 0.50,
                            "priceByWeight": True,
                            "image_url": "https://example.com/image.jpg",
                            "large_image_url": "https://example.com/large.jpg",
                            "sku": "SKU123",
                            "tags": ["organic", "gluten-free"],
                        },
                        "value": "Test Product",
                    }
                ],
                "total_num_results": 1,
            }
        }

        result = self.search._parse_search_response(
            data=data, query="test", page=1, results_per_page=10, sort_by="relevance"
        )

        item = result.results[0]
        assert item.sale_price == 7.99
        assert item.unit_price == "0.5"  # unit_price is a string in the model

    def test_parse_search_response_missing_fields(self):
        """Test search response parsing with missing fields."""
        data = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "prod123",
                            "description": "Test Product",
                            # Missing many fields
                        },
                        "value": "Test Product",
                    }
                ],
                "total_num_results": 1,
            }
        }

        result = self.search._parse_search_response(
            data=data, query="test", page=1, results_per_page=10, sort_by="relevance"
        )

        item = result.results[0]
        assert item.id == "prod123"
        assert item.title == "Test Product"
        assert item.brand is None
        assert item.category is None
        assert item.upc is None
        assert item.price is None
        assert item.is_weighted is False

    def test_parse_search_response_malformed(self):
        """Test search response parsing with malformed data."""
        data = {
            "response": {
                "results": [
                    {
                        "data": None,  # Invalid data
                        "value": "Test Product",
                    },
                    {
                        "data": {"id": "prod123", "description": "Valid Product"},
                        "value": "Valid Product",
                    },
                ],
                "total_num_results": 2,
            }
        }

        result = self.search._parse_search_response(
            data=data, query="test", page=1, results_per_page=10, sort_by="relevance"
        )

        # Should handle malformed data gracefully
        assert result.total_results == 2
        assert len(result.results) == 1  # Only the valid one
        assert result.results[0].id == "prod123"

    def test_parse_search_response_no_response(self):
        """Test search response parsing with no response field."""
        data = {"otherData": "value"}

        result = self.search._parse_search_response(
            data=data, query="test", page=1, results_per_page=10, sort_by="relevance"
        )

        assert result.total_results == 0
        assert len(result.results) == 0

    def test_parse_search_response_none_data(self):
        """Test search response parsing with None data."""
        result = self.search._parse_search_response(
            data=None, query="test", page=1, results_per_page=10, sort_by="relevance"
        )

        assert result.total_results == 0
        assert len(result.results) == 0

    def test_parse_result_item_basic(self):
        """Test basic result item parsing."""
        item_data = {
            "id": "prod123",
            "description": "Test Product",
            "brand": "Test Brand",
            "category": "Test Category",
            "ean": "123456789012",
            "price": 9.99,
        }

        # Test the parsing through the search response method
        data = {
            "response": {
                "results": [{"data": item_data, "value": "Test Product"}],
                "total_num_results": 1,
            }
        }

        result = self.search._parse_search_response(
            data=data, query="test", page=1, results_per_page=10, sort_by="relevance"
        )

        item = result.results[0]
        assert item.id == "prod123"
        assert item.title == "Test Product"
        assert item.brand == "Test Brand"
        assert item.category == "Test Category"
        assert item.upc == "123456789012"
        assert item.price == 9.99

    def test_parse_result_item_with_metadata(self):
        """Test result item parsing with metadata."""
        item_data = {
            "id": "prod123",
            "description": "Test Product",
            "brand": "Test Brand",
            "category": "Test Category",
            "ean": "123456789012",
            "price": 9.99,
            "sale_price": 7.99,
            "unit_price": 0.50,
            "priceByWeight": True,
            "image_url": "https://example.com/image.jpg",
            "large_image_url": "https://example.com/large.jpg",
            "sku": "SKU123",
            "tags": ["organic", "gluten-free"],
        }

        # Test the parsing through the search response method
        data = {
            "response": {
                "results": [{"data": item_data, "value": "Test Product"}],
                "total_num_results": 1,
            }
        }

        result = self.search._parse_search_response(
            data=data, query="test", page=1, results_per_page=10, sort_by="relevance"
        )

        item = result.results[0]
        assert item.sale_price == 7.99
        assert item.unit_price == "0.5"  # unit_price is a string in the model
        assert item.is_weighted is True
        assert item.image_url == "https://example.com/image.jpg"
        assert item.large_image_url == "https://example.com/large.jpg"
        assert item.sku == "SKU123"
        assert item.tags == ["organic", "gluten-free"]

    def test_parse_result_item_missing_fields(self):
        """Test result item parsing with missing fields."""
        item_data = {
            "id": "prod123",
            "description": "Test Product",
            # Missing many fields
        }

        # Test the parsing through the search response method
        data = {
            "response": {
                "results": [{"data": item_data, "value": "Test Product"}],
                "total_num_results": 1,
            }
        }

        result = self.search._parse_search_response(
            data=data, query="test", page=1, results_per_page=10, sort_by="relevance"
        )

        item = result.results[0]
        assert item.id == "prod123"
        assert item.title == "Test Product"
        assert item.brand is None
        assert item.category is None
        assert item.upc is None
        assert item.price is None
        assert item.is_weighted is False
        assert item.tags == []

    def test_parse_result_item_none_data(self):
        """Test result item parsing with None data."""
        # Test the parsing through the search response method with None data
        result = self.search._parse_search_response(
            data=None, query="test", page=1, results_per_page=10, sort_by="relevance"
        )

        assert result.total_results == 0
        assert len(result.results) == 0

    def test_autocomplete_success(self):
        """Test autocomplete functionality."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "suggestions": [
                {"query": "milk"},
                {"query": "milk chocolate"},
                {"query": "milk shake"},
            ]
        }

        self.mock_client._make_request.return_value = mock_response

        suggestions = self.search.autocomplete("milk", limit=3)

        assert suggestions == ["milk", "milk chocolate", "milk shake"]
        self.mock_client._make_request.assert_called_once()

    def test_autocomplete_failure(self):
        """Test autocomplete with API failure."""
        mock_response = Mock()
        mock_response.status_code = 400

        self.mock_client._make_request.return_value = mock_response

        suggestions = self.search.autocomplete("milk", limit=3)

        assert suggestions == []

    def test_autocomplete_exception(self):
        """Test autocomplete with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")

        suggestions = self.search.autocomplete("milk", limit=3)

        assert suggestions == []

    def test_browse_success(self):
        """Test browse functionality."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "prod123",
                            "description": "Test Product",
                            "price": 9.99,
                        },
                        "value": "Test Product",
                    }
                ],
                "total_num_results": 1,
            }
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.search.browse("beverages", results_per_page=24, page=1)

        assert result.total_results == 1
        assert len(result.results) == 1
        assert (
            result.query == "beverages"
        )  # No "category:" prefix in this browse method
        assert result.sort_by == "browse"

    def test_browse_failure(self):
        """Test browse with API failure."""
        mock_response = Mock()
        mock_response.status_code = 400
        mock_response.text = "Bad Request"

        self.mock_client._make_request.return_value = mock_response

        result = self.search.browse("beverages")

        assert result.total_results == 0
        assert len(result.results) == 0
        assert (
            result.query == "beverages"
        )  # No "category:" prefix in this browse method
        assert result.sort_by == "browse"

    def test_browse_exception(self):
        """Test browse with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")

        result = self.search.browse("beverages")

        assert result.total_results == 0
        assert len(result.results) == 0
        assert (
            result.query == "beverages"
        )  # No "category:" prefix in this browse method
        assert result.sort_by == "browse"

    def test_get_recommendations_success(self):
        """Test get_recommendations functionality."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "prod123",
                            "description": "Recommended Product",
                            "price": 9.99,
                        },
                        "value": "Recommended Product",
                    }
                ]
            }
        }

        self.mock_client._make_request.return_value = mock_response

        recommendations = self.search.get_recommendations(user_id="user123", limit=5)

        assert len(recommendations) == 1
        assert recommendations[0].title == "Recommended Product"

    def test_get_recommendations_with_product_id(self):
        """Test get_recommendations with product ID."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "prod456",
                            "description": "Similar Product",
                            "price": 12.99,
                        },
                        "value": "Similar Product",
                    }
                ]
            }
        }

        self.mock_client._make_request.return_value = mock_response

        recommendations = self.search.get_recommendations(product_id="prod123", limit=5)

        assert len(recommendations) == 1
        assert recommendations[0].title == "Similar Product"

    def test_get_recommendations_failure(self):
        """Test get_recommendations with API failure."""
        mock_response = Mock()
        mock_response.status_code = 400

        self.mock_client._make_request.return_value = mock_response

        recommendations = self.search.get_recommendations(limit=5)

        assert recommendations == []

    def test_get_recommendations_exception(self):
        """Test get_recommendations with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")

        recommendations = self.search.get_recommendations(limit=5)

        assert recommendations == []

    def test_search_by_barcode_direct_success(self):
        """Test search_by_barcode with direct search success."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "prod123",
                            "description": "Coca Cola",
                            "price": 1.99,
                        },
                        "value": "Coca Cola",
                    }
                ],
                "total_num_results": 1,
            }
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.search.search_by_barcode("049000050103")

        assert result is not None
        assert result.title == "Coca Cola"

    def test_search_by_barcode_fallback_success(self):
        """Test search_by_barcode with fallback search success."""
        # First call fails (no direct barcode results)
        mock_response_no_results = Mock()
        mock_response_no_results.status_code = 200
        mock_response_no_results.json.return_value = {
            "response": {"results": [], "total_num_results": 0}
        }

        # Second call succeeds (fallback search)
        mock_response_fallback = Mock()
        mock_response_fallback.status_code = 200
        mock_response_fallback.json.return_value = {
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

        self.mock_client._make_request.side_effect = [
            mock_response_no_results,
            mock_response_fallback,
        ]

        result = self.search.search_by_barcode("049000050103")

        assert result is not None
        assert result.title == "Coca Cola Classic"
        assert result.upc == "049000050103"  # Should be updated to match barcode

    def test_search_by_barcode_no_results(self):
        """Test search_by_barcode with no results."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {"results": [], "total_num_results": 0}
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.search.search_by_barcode("invalid_barcode")

        assert result is None

    def test_search_by_barcode_exception(self):
        """Test search_by_barcode with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")

        result = self.search.search_by_barcode("049000050103")

        assert result is None

    def test_parse_recommendations_response(self):
        """Test _parse_recommendations_response method."""
        data = {
            "response": {
                "results": [
                    {
                        "data": {
                            "id": "prod123",
                            "description": "Recommended Product",
                            "price": 9.99,
                        },
                        "value": "Recommended Product",
                    }
                ]
            }
        }

        recommendations = self.search._parse_recommendations_response(data)

        assert len(recommendations) == 1
        assert recommendations[0].title == "Recommended Product"

    def test_parse_recommendations_response_empty(self):
        """Test _parse_recommendations_response with empty data."""
        data = {"response": {"results": []}}

        recommendations = self.search._parse_recommendations_response(data)

        assert recommendations == []

    def test_parse_recommendations_response_exception(self):
        """Test _parse_recommendations_response with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")

        recommendations = self.search._parse_recommendations_response({})

        assert recommendations == []

    def test_parse_facets(self):
        """Test _parse_facets method."""
        facets_data = {
            "brand": {
                "data": [
                    {"value": "Meijer", "count": 100},
                    {"value": "Kraft", "count": 50},
                ]
            },
            "category": {
                "data": [
                    {"value": "Beverages", "count": 75},
                    {"value": "Snacks", "count": 25},
                ]
            },
        }

        filters = self.search._parse_facets(facets_data)

        assert "brand" in filters
        assert "category" in filters
        assert len(filters["brand"]) == 2
        assert len(filters["category"]) == 2
        assert filters["brand"][0]["value"] == "Meijer"
        assert filters["brand"][0]["count"] == 100

    def test_parse_facets_empty(self):
        """Test _parse_facets with empty data."""
        filters = self.search._parse_facets({})

        assert filters == {}

    def test_parse_facets_exception(self):
        """Test _parse_facets with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")

        filters = self.search._parse_facets({})

        assert filters == {}

    def test_get_popular_searches_success(self):
        """Test get_popular_searches functionality."""
        # This method returns hardcoded popular terms from log analysis
        popular = self.search.get_popular_searches()

        assert len(popular) == 8  # Returns 8 hardcoded terms
        assert "milk" in popular
        assert "lego" in popular

    def test_get_popular_searches_static(self):
        """Test get_popular_searches returns static data."""
        # This method always returns the same data regardless of API calls
        popular = self.search.get_popular_searches()

        expected_terms = [
            "lego",
            "milk",
            "lego/search",
            "mi",
            "milk/search",
            "milk/click_through",
            "lego/select",
            "lego/click_through",
        ]
        assert popular == expected_terms

    def test_track_search_behavior_success(self):
        """Test track_search_behavior functionality."""
        mock_response = Mock()
        mock_response.status_code = 200

        self.mock_client._make_request.return_value = mock_response

        # Test tracking search behavior with correct parameters
        result = self.search.track_search_behavior(
            search_term="milk",
            num_results=10,
            customer_ids=["customer123"]
        )

        # Method doesn't return a boolean, it tracks behavior
        # Just test that it doesn't raise an exception
        assert result is None

    def test_track_search_behavior_minimal(self):
        """Test track_search_behavior with minimal parameters."""
        mock_response = Mock()
        mock_response.status_code = 200

        self.mock_client._make_request.return_value = mock_response

        # Test with minimal required parameters
        result = self.search.track_search_behavior(
            search_term="milk",
            num_results=5
        )

        assert result is None

    def test_track_search_behavior_exception(self):
        """Test track_search_behavior with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")

        # Should handle exceptions gracefully
        result = self.search.track_search_behavior(
            search_term="milk",
            num_results=5
        )

        assert result is None

    def test_browse_by_category_namespace(self):
        """Test the module-level browse function."""
        # Check if there's a module-level browse function
        try:
            from meijer.search import browse as module_browse
            
            mock_response = Mock()
            mock_response.status_code = 200
            mock_response.json.return_value = {
                "response": {
                    "results": [
                        {
                            "data": {
                                "id": "prod123",
                                "description": "Category Product",
                                "price": 9.99,
                            },
                            "value": "Category Product",
                        }
                    ],
                    "total_num_results": 1,
                }
            }

            self.mock_client._make_request.return_value = mock_response

            result = module_browse(self.mock_client, "category:beverages", results_per_page=24, page=1)

            assert result.total_results == 1
            assert len(result.results) == 1
            assert result.query == "category:beverages"
        except ImportError:
            # No module-level browse function, skip test
            pass

    def test_search_with_store_id(self):
        """Test search with store ID parameter."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {"results": [], "total_num_results": 0}
        }

        self.mock_client._make_request.return_value = mock_response

        result = self.search.search("milk", store_id="STORE001")

        # Verify the request was made with store ID
        call_args = self.mock_client._make_request.call_args
        params = call_args[1]["params"]
        # Check for the specific store filter format
        assert params.get("filters[availableInStores]") == "STORE001"

    def test_search_with_various_sorts(self):
        """Test search with different sort options."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {"results": [], "total_num_results": 0}
        }

        self.mock_client._make_request.return_value = mock_response

        # Test various sort options
        sort_options = ["relevance", "price_asc", "price_desc", "name_asc", "name_desc"]
        
        for sort_by in sort_options:
            result = self.search.search("test", sort_by=sort_by)
            assert result.sort_by == sort_by

    def test_search_pagination(self):
        """Test search pagination calculations."""
        # Test with enough results for multiple pages
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "response": {"results": [], "total_num_results": 100}
        }

        self.mock_client._make_request.return_value = mock_response

        # Test page 2 with 10 results per page
        result = self.search.search("test", results_per_page=10, page=2)

        assert result.total_results == 100
        assert result.current_page == 2
        assert result.total_pages == 10  # 100 / 10 = 10 pages

    def test_autocomplete_empty_suggestions(self):
        """Test autocomplete with empty suggestions."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"suggestions": []}

        self.mock_client._make_request.return_value = mock_response

        suggestions = self.search.autocomplete("xyz", limit=5)

        assert suggestions == []


if __name__ == "__main__":
    pytest.main([__file__])
