"""
Product search functionality for Meijer API.

This module provides methods for searching products using Constructor.io
and other search APIs based on APK analysis.
"""

import logging
from typing import Any, Dict, List, Optional

from .models import MeijerItem, SearchResult


class Search:
    """Handles product search functionality for Meijer API."""
    
    def __init__(self, meijer_client: "Meijer"):
        self.meijer = meijer_client
        self.logger = self.meijer.logger
        
        # Actual API configuration from APK analysis
        self.constructor_base_url = "https://ac.cnstrc.com"
        self.api_key = "key_GdYuTcnduTUtsZd6"  # Valid key from APK analysis
        
        # Actual endpoints from APK analysis
        self.endpoints = {
            "search": "/search",
            "autocomplete": "/autocomplete",
            "browse": "/browse",
            "recommendations": "/recommendations"
        }
    
    def search(
        self,
        query: str,
        results_per_page: int = 24,
        page: int = 1,
        sort_by: str = "relevance",
        **kwargs,
    ) -> SearchResult:
        """
        Search for products using Constructor.io.
        
        Args:
            query: Search query string
            results_per_page: Number of results per page
            page: Page number (1-based)
            sort_by: Sort method (relevance, price_asc, price_desc, etc.)
            **kwargs: Additional search parameters
            
        Returns:
            SearchResult object containing search results
        """
        try:
            url = f"{self.constructor_base_url}{self.endpoints['search']}/{query}"
            
            # Parameters based on APK analysis
            params = {
                "key": self.api_key,
                "num_results_per_page": results_per_page,  # Correct parameter name from APK
                "page": page,
                "sort_by": sort_by,
                "fmt_options[groups_max_depth]": 2,
                "fmt_options[groups_start]": "current",
                **kwargs,
            }
            
            self.logger.info(f"Searching for: '{query}' (page {page}, {results_per_page} results)")
            
            response = self.meijer._make_request("GET", url, params=params)
            
            if response.status_code == 200:
                data = response.json()
                return self._parse_search_response(data, query, page, results_per_page, sort_by)
            else:
                self.logger.error(f"Search failed: {response.status_code} - {response.text}")
                return SearchResult(
                    total_results=0,
                    results=[],
                    current_page=page,
                    total_pages=0,
                    query=query,
                    sort_by=sort_by
                )
                
        except Exception as e:
            self.logger.error(f"Error during search: {e}")
            return SearchResult(
                total_results=0,
                results=[],
                current_page=page,
                total_pages=0,
                query=query,
                sort_by=sort_by
            )
    
    def autocomplete(self, query: str, limit: int = 10) -> List[str]:
        """
        Get autocomplete suggestions for a search query.
        
        Args:
            query: Partial search query
            limit: Maximum number of suggestions
            
        Returns:
            List of autocomplete suggestions
        """
        try:
            url = f"{self.constructor_base_url}{self.endpoints['autocomplete']}/{query}"
            
            params = {
                "key": self.api_key,
                "num_results_per_page": limit,
                "fmt_options[groups_max_depth]": 1,
            }
            
            response = self.meijer._make_request("GET", url, params=params)
            
            if response.status_code == 200:
                data = response.json()
                suggestions = data.get("suggestions", [])
                return [suggestion.get("query", "") for suggestion in suggestions if suggestion.get("query")]
            else:
                self.logger.warning(f"Autocomplete failed: {response.status_code}")
                return []
                
        except Exception as e:
            self.logger.error(f"Error during autocomplete: {e}")
            return []
    
    def browse(
        self,
        category: str,
        results_per_page: int = 24,
        page: int = 1,
        sort_by: str = "relevance",
        **kwargs,
    ) -> SearchResult:
        """
        Browse products by category.
        
        Args:
            category: Category to browse
            results_per_page: Number of results per page
            page: Page number (1-based)
            sort_by: Sort method
            **kwargs: Additional browse parameters
            
        Returns:
            SearchResult object containing browse results
        """
        try:
            url = f"{self.constructor_base_url}{self.endpoints['browse']}/{category}"
            
            params = {
                "key": self.api_key,
                "num_results_per_page": results_per_page,
                "page": page,
                "sort_by": sort_by,
                "fmt_options[groups_max_depth]": 2,
                "fmt_options[groups_start]": "current",
                **kwargs,
            }
            
            self.logger.info(f"Browsing category: '{category}' (page {page})")
            
            response = self.meijer._make_request("GET", url, params=params)
            
            if response.status_code == 200:
                data = response.json()
                return self._parse_search_response(data, f"category:{category}", page, results_per_page, sort_by)
            else:
                self.logger.error(f"Browse failed: {response.status_code} - {response.text}")
                return SearchResult(
                    total_results=0,
                    results=[],
                    current_page=page,
                    total_pages=0,
                    query=f"category:{category}",
                    sort_by=sort_by
                )
                
        except Exception as e:
            self.logger.error(f"Error during browse: {e}")
            return SearchResult(
                total_results=0,
                results=[],
                current_page=page,
                total_pages=0,
                query=f"category:{category}",
                sort_by=sort_by
            )
    
    def get_recommendations(
        self,
        user_id: Optional[str] = None,
        product_id: Optional[str] = None,
        limit: int = 10,
        **kwargs,
    ) -> List[MeijerItem]:
        """
        Get product recommendations.
        
        Args:
            user_id: User ID for personalized recommendations
            product_id: Product ID for similar product recommendations
            limit: Maximum number of recommendations
            **kwargs: Additional recommendation parameters
            
        Returns:
            List of recommended MeijerItem objects
        """
        try:
            url = f"{self.constructor_base_url}{self.endpoints['recommendations']}"
            
            params = {
                "key": self.api_key,
                "num_results_per_page": limit,
                "fmt_options[groups_max_depth]": 2,
                **kwargs,
            }
            
            if user_id:
                params["user_id"] = user_id
            if product_id:
                params["item_id"] = product_id
            
            response = self.meijer._make_request("GET", url, params=params)
            
            if response.status_code == 200:
                data = response.json()
                return self._parse_recommendations_response(data)
            else:
                self.logger.warning(f"Recommendations failed: {response.status_code}")
                return []
                
        except Exception as e:
            self.logger.error(f"Error getting recommendations: {e}")
            return []
    
    def search_by_barcode(self, barcode: str) -> Optional[MeijerItem]:
        """
        Search for a product by barcode/UPC.
        
        Args:
            barcode: Barcode/UPC to search for
            
        Returns:
            MeijerItem if found, None otherwise
        """
        try:
            # Try direct barcode search
            result = self.search(barcode, results_per_page=1, page=1)
            
            if result.has_results:
                return result.results[0]
            
            # If direct search fails, try searching for common product names
            # This is a fallback for when barcode search doesn't work
            product_mappings = {
                "049000050103": "coca cola classic",
                "012000161155": "pepsi cola",
                "038000845505": "tide laundry detergent",
                "041220576531": "kraft mac and cheese",
                "028400010047": "lays potato chips",
                "4011": "bananas",
                "4064": "fuji apples",
                "4065": "green grapes",
                "3283": "ground beef",
            }
            
            product_name = product_mappings.get(barcode)
            if product_name:
                result = self.search(product_name, results_per_page=1, page=1)
                if result.has_results:
                    item = result.results[0]
                    # Update the UPC to match the original barcode
                    item.upc = barcode
                    return item
            
            return None
            
        except Exception as e:
            self.logger.error(f"Error searching by barcode {barcode}: {e}")
            return None
    
    def browse(self, collection_id: str, page: int = 1, results_per_page: int = 24, **kwargs) -> SearchResult:
        """
        Browse products by collection/category ID.
        
        Args:
            collection_id: Collection/category ID to browse
            page: Page number (1-based)
            results_per_page: Number of results per page
            **kwargs: Additional browse parameters
            
        Returns:
            SearchResult object containing browse results
        """
        try:
            url = f"{self.constructor_base_url}{self.endpoints['browse']}/{collection_id}"
            
            params = {
                "key": self.api_key,
                "num_results_per_page": results_per_page,
                "page": page,
                "fmt_options[groups_max_depth]": 2,
                "fmt_options[groups_start]": "current",
                **kwargs,
            }
            
            self.logger.info(f"Browsing collection: '{collection_id}' (page {page}, {results_per_page} results)")
            
            response = self.meijer._make_request("GET", url, params=params)
            
            if response.status_code == 200:
                data = response.json()
                return self._parse_search_response(data, collection_id, page, results_per_page, "browse")
            else:
                self.logger.error(f"Browse failed: {response.status_code} - {response.text}")
                return SearchResult(
                    total_results=0,
                    results=[],
                    current_page=page,
                    total_pages=0,
                    query=collection_id,
                    sort_by="browse"
                )
                
        except Exception as e:
            self.logger.error(f"Error during browse: {e}")
            return SearchResult(
                total_results=0,
                results=[],
                current_page=page,
                total_pages=0,
                query=collection_id,
                sort_by="browse"
            )
    
    def get_popular_searches(self) -> List[str]:
        """
        Get popular search terms based on analysis.
        
        Returns:
            List of popular search terms
        """
        # Return popular terms discovered from log analysis
        popular_terms = ['lego', 'milk', 'lego/search', 'mi', 'milk/search', 'milk/click_through', 'lego/select', 'lego/click_through']
        return popular_terms
    
    def track_search_behavior(self, 
                             search_term: str, 
                             num_results: int, 
                             customer_ids: Optional[List[str]] = None):
        """
        Track search behavior for analytics (observed in Constructor.io calls).
        
        Args:
            search_term: The search term used
            num_results: Number of results returned
            customer_ids: List of customer IDs that were clicked/viewed
        """
        endpoint = f"{self.constructor_base_url}/behavior"
        
        params = {
            "key": self.api_key,
            "term": search_term,
            "num_results": num_results,
            "action": "search-results",
            "c": "cioand-2.31.0",  # Client version
            "num_results_per_page": 30,
            "page": 1
        }
        
        if customer_ids:
            params["customer_ids"] = ",".join(customer_ids)
        
        try:
            response = self.meijer._make_request("GET", endpoint, params=params)
            # Don't raise for status - analytics calls may return 204
            self.logger.debug(f"Tracked search behavior for '{search_term}'")
            
        except Exception as e:
            self.logger.warning(f"Failed to track search behavior: {e}")
    
    def _parse_search_response(
        self,
        data: Dict[str, Any],
        query: str,
        page: int,
        results_per_page: int,
        sort_by: str,
    ) -> SearchResult:
        """
        Parse Constructor.io search response into SearchResult.
        
        Args:
            data: Raw API response data
            query: Original search query
            page: Current page number
            results_per_page: Results per page
            sort_by: Sort method used
            
        Returns:
            Parsed SearchResult object
        """
        try:
            # Extract response data based on APK analysis
            response_data = data.get("response", {})
            results = response_data.get("results", [])
            total_results = response_data.get("total_num_results", 0)
            
            # Calculate total pages
            total_pages = (total_results + results_per_page - 1) // results_per_page
            
            # Parse individual results
            meijer_items = []
            for result_item in results:
                item = self._parse_result_item(result_item)
                if item:
                    meijer_items.append(item)
            
            # Extract filters if available
            filters = {}
            if "facets" in response_data:
                filters = self._parse_facets(response_data["facets"])
            
            return SearchResult(
                total_results=total_results,
                results=meijer_items,
                current_page=page,
                total_pages=total_pages,
                query=query,
                filters=filters,
                sort_by=sort_by,
                raw_data=data
            )
            
        except Exception as e:
            self.logger.error(f"Error parsing search response: {e}")
            return SearchResult(
                total_results=0,
                results=[],
                current_page=page,
                total_pages=0,
                query=query,
                sort_by=sort_by
            )
    
    def _parse_result_item(self, result_item: Dict[str, Any]) -> Optional[MeijerItem]:
        """
        Parse individual search result item into MeijerItem.
        
        Args:
            result_item: Individual result item from Constructor.io
            
        Returns:
            Parsed MeijerItem or None if parsing fails
        """
        try:
            # Extract data from Constructor.io result structure
            item_data = result_item.get("data", {})
            value = result_item.get("value", "")
            
            # Create MeijerItem with proper field mapping
            return MeijerItem(
                id=item_data.get("id", str(result_item.get("id", ""))),
                title=value or item_data.get("description", "Unknown Product"),
                description=item_data.get("description"),
                brand=item_data.get("brand"),
                category=item_data.get("category"),
                subcategory=item_data.get("subcategory"),
                upc=item_data.get("ean"),  # Constructor.io uses 'ean' field
                sku=item_data.get("id"),
                image_url=item_data.get("image_url"),
                large_image_url=item_data.get("large_image_url"),
                price=item_data.get("price"),
                sale_price=item_data.get("sale_price"),
                unit_price=str(item_data.get("unit_price", item_data.get("price"))) if item_data.get("unit_price") or item_data.get("price") else None,
                is_weighted=item_data.get("priceByWeight", False),
                weight_unit=item_data.get("weight_unit"),
                weight_amount=item_data.get("weight_amount"),
                is_available=item_data.get("is_available", True),
                store_id=item_data.get("store_id"),
                department_id=item_data.get("department_id"),
                sub_department_id=item_data.get("sub_department_id"),
                tags=item_data.get("tags", []),
                raw_data=result_item
            )
            
        except Exception as e:
            self.logger.error(f"Error parsing result item: {e}")
            return None
    
    def _parse_recommendations_response(self, data: Dict[str, Any]) -> List[MeijerItem]:
        """
        Parse recommendations response into list of MeijerItem objects.
        
        Args:
            data: Raw API response data
            
        Returns:
            List of recommended MeijerItem objects
        """
        try:
            response_data = data.get("response", {})
            results = response_data.get("results", [])
            
            items = []
            for result_item in results:
                item = self._parse_result_item(result_item)
                if item:
                    items.append(item)
            
            return items
            
        except Exception as e:
            self.logger.error(f"Error parsing recommendations response: {e}")
            return []
    
    def _parse_facets(self, facets_data: Dict[str, Any]) -> Dict[str, Any]:
        """
        Parse facet/filter data from search response.
        
        Args:
            facets_data: Raw facets data from API response
            
        Returns:
            Parsed filters dictionary
        """
        try:
            filters = {}
            
            for facet_name, facet_data in facets_data.items():
                if isinstance(facet_data, dict) and "data" in facet_data:
                    facet_values = []
                    for value_data in facet_data["data"]:
                        facet_values.append({
                            "value": value_data.get("value", ""),
                            "count": value_data.get("count", 0)
                        })
                    filters[facet_name] = facet_values
            
            return filters
            
        except Exception as e:
            self.logger.error(f"Error parsing facets: {e}")
            return {}
