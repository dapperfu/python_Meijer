#!/usr/bin/env python3
"""
Comprehensive tests for the search module.

Tests all search functionality including product search and barcode lookup.
"""

import pytest
from unittest.mock import Mock, patch, MagicMock

from meijer.search import Search
from meijer.models import MeijerItem, SearchResult


class TestSearch:
    """Test the Search class."""
    
    def setup_method(self):
        """Set up test fixtures."""
        self.mock_client = Mock()
        self.mock_client.logger = Mock()
        self.mock_client.api_base_url = "https://api.meijer.com"
        self.mock_client._get_api_headers.return_value = {"Authorization": "Bearer test"}
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
                            "image_url": "https://example.com/image1.jpg"
                        },
                        "value": "Test Product 1"
                    },
                    {
                        "data": {
                            "id": "prod456",
                            "description": "Test Product 2",
                            "brand": "Test Brand",
                            "category": "Test Category",
                            "ean": "123456789013",
                            "price": 12.99,
                            "image_url": "https://example.com/image2.jpg"
                        },
                        "value": "Test Product 2"
                    }
                ],
                "total_num_results": 2
            }
        }
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.search.search("test", results_per_page=10, page=1, sort_by="relevance")
        
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
            "response": {
                "results": [],
                "total_num_results": 0
            }
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
            "response": {
                "results": [],
                "total_num_results": 0
            }
        }
        
        self.mock_client._make_request.return_value = mock_response
        
        # Test with custom parameters
        result = self.search.search(
            "test",
            results_per_page=50,
            page=2,
            sort_by="price_asc",
            custom_param="value"
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
                            "price": 9.99
                        },
                        "value": "Test Product"
                    }
                ],
                "total_num_results": 1
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
            "response": {
                "results": [],
                "total_num_results": 0
            }
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
                            "price": 9.99
                        },
                        "value": "Test Product"
                    }
                ],
                "total_num_results": 1
            }
        }
        
        result = self.search._parse_search_response(
            data=data,
            query="test",
            page=1,
            results_per_page=10,
            sort_by="relevance"
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
                            "tags": ["organic", "gluten-free"]
                        },
                        "value": "Test Product"
                    }
                ],
                "total_num_results": 1
            }
        }
        
        result = self.search._parse_search_response(
            data=data,
            query="test",
            page=1,
            results_per_page=10,
            sort_by="relevance"
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
                            "description": "Test Product"
                            # Missing many fields
                        },
                        "value": "Test Product"
                    }
                ],
                "total_num_results": 1
            }
        }
        
        result = self.search._parse_search_response(
            data=data,
            query="test",
            page=1,
            results_per_page=10,
            sort_by="relevance"
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
                        "value": "Test Product"
                    },
                    {
                        "data": {
                            "id": "prod123",
                            "description": "Valid Product"
                        },
                        "value": "Valid Product"
                    }
                ],
                "total_num_results": 2
            }
        }
        
        result = self.search._parse_search_response(
            data=data,
            query="test",
            page=1,
            results_per_page=10,
            sort_by="relevance"
        )
        
        # Should handle malformed data gracefully
        assert result.total_results == 2
        assert len(result.results) == 1  # Only the valid one
        assert result.results[0].id == "prod123"
    
    def test_parse_search_response_no_response(self):
        """Test search response parsing with no response field."""
        data = {"otherData": "value"}
        
        result = self.search._parse_search_response(
            data=data,
            query="test",
            page=1,
            results_per_page=10,
            sort_by="relevance"
        )
        
        assert result.total_results == 0
        assert len(result.results) == 0
    
    def test_parse_search_response_none_data(self):
        """Test search response parsing with None data."""
        result = self.search._parse_search_response(
            data=None,
            query="test",
            page=1,
            results_per_page=10,
            sort_by="relevance"
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
            "price": 9.99
        }
        
        # Test the parsing through the search response method
        data = {
            "response": {
                "results": [{"data": item_data, "value": "Test Product"}],
                "total_num_results": 1
            }
        }
        
        result = self.search._parse_search_response(
            data=data,
            query="test",
            page=1,
            results_per_page=10,
            sort_by="relevance"
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
            "tags": ["organic", "gluten-free"]
        }
        
        # Test the parsing through the search response method
        data = {
            "response": {
                "results": [{"data": item_data, "value": "Test Product"}],
                "total_num_results": 1
            }
        }
        
        result = self.search._parse_search_response(
            data=data,
            query="test",
            page=1,
            results_per_page=10,
            sort_by="relevance"
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
            "description": "Test Product"
            # Missing many fields
        }
        
        # Test the parsing through the search response method
        data = {
            "response": {
                "results": [{"data": item_data, "value": "Test Product"}],
                "total_num_results": 1
            }
        }
        
        result = self.search._parse_search_response(
            data=data,
            query="test",
            page=1,
            results_per_page=10,
            sort_by="relevance"
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
            data=None,
            query="test",
            page=1,
            results_per_page=10,
            sort_by="relevance"
        )
        
        assert result.total_results == 0
        assert len(result.results) == 0


if __name__ == "__main__":
    pytest.main([__file__]) 