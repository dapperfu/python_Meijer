#!/usr/bin/env python3
"""
Meijer Search Function using Constructor.io backend.

Generated from analysis of Constructor.io API calls in meijer2.log.
"""

from typing import List, Optional, Dict, Any
import requests
import json
import logging
from urllib.parse import urlencode

from meijer_item import MeijerItem, create_meijer_items_from_search

logger = logging.getLogger(__name__)


class MeijerSearch:
    """
    Meijer search functionality using Constructor.io backend.
    
    This class provides search, autocomplete, and browse functionality
    by interfacing with Meijer's Constructor.io search backend.
    """
    
    def __init__(self, meijer_client=None):
        """
        Initialize the search interface.
        
        Args:
            meijer_client: Associated Meijer client for authentication
        """
        self.meijer_client = meijer_client
        
        # Constructor.io configuration (discovered from analysis)
        self.api_key = "key_GdYuTcnduTUtsZd6"
        self.base_url = "https://ac.cnstrc.com"
        self.client_id = None  # Will be set from meijer_client
        self.session_id = None
        
        # Common parameters from analysis
        self.default_params = {
            "c": "cioand-2.31.0",  # Client version
            "num_results_per_page": 30,
            "page": 1
        }
        
        # Common filters discovered from analysis
        self.default_filters = {
            "availableInStores": "217"  # Store filter
        }
    
    def search(self, 
               query: str, 
               page: int = 1, 
               results_per_page: int = 30,
               filters: Optional[Dict[str, str]] = None,
               store_id: Optional[str] = None) -> List[MeijerItem]:
        """
        Search for products using Constructor.io backend.
        
        Args:
            query: Search term
            page: Page number (1-based)
            results_per_page: Number of results per page
            filters: Additional filters to apply
            store_id: Store ID for availability filtering
            
        Returns:
            List of MeijerItem objects
        """
        endpoint = f"{self.base_url}/search/{query}"
        
        # Build parameters
        params = {
            "key": self.api_key,
            "page": page,
            "num_results_per_page": results_per_page,
            **self.default_params
        }
        
        # Add client and session info if available
        if self.meijer_client:
            if hasattr(self.meijer_client, '_digital_id'):
                params["i"] = self.meijer_client._digital_id
            if hasattr(self.meijer_client, '_session_id'):
                params["s"] = self.meijer_client._session_id
        
        # Add filters
        applied_filters = {**self.default_filters}
        if filters:
            applied_filters.update(filters)
        if store_id:
            applied_filters["availableInStores"] = store_id
            
        # Convert filters to Constructor.io format
        for filter_name, filter_value in applied_filters.items():
            params[f"filters[{filter_name}]"] = filter_value
        
        try:
            response = requests.get(endpoint, params=params)
            response.raise_for_status()
            
            search_data = response.json()
            items = create_meijer_items_from_search(search_data, self.meijer_client)
            
            logger.info(f"Search for '{query}' returned {len(items)} items")
            return items
            
        except Exception as e:
            logger.error(f"Search failed for '{query}': {e}")
            return []
    
    def autocomplete(self, 
                     partial_query: str, 
                     num_suggestions: int = 8) -> List[str]:
        """
        Get autocomplete suggestions for a partial query.
        
        Args:
            partial_query: Partial search term
            num_suggestions: Number of suggestions to return
            
        Returns:
            List of suggested search terms
        """
        endpoint = f"{self.base_url}/autocomplete/{partial_query}"
        
        params = {
            "key": self.api_key,
            "num_results_Search%20Suggestions": num_suggestions,
            "num_results_Products": 0,  # We want suggestions, not products
            **self.default_params
        }
        
        # Add client info if available
        if self.meijer_client:
            if hasattr(self.meijer_client, '_digital_id'):
                params["i"] = self.meijer_client._digital_id
        
        try:
            response = requests.get(endpoint, params=params)
            response.raise_for_status()
            
            data = response.json()
            suggestions = []
            
            # Extract suggestions from Constructor.io response
            if 'sections' in data:
                for section in data['sections']:
                    if section.get('display_name') == 'Search Suggestions':
                        for option in section.get('options', []):
                            suggestions.append(option.get('value', ''))
            
            return suggestions[:num_suggestions]
            
        except Exception as e:
            logger.error(f"Autocomplete failed for '{partial_query}': {e}")
            return []
    
    def browse_category(self, 
                       collection_id: str,
                       page: int = 1,
                       results_per_page: int = 30,
                       filters: Optional[Dict[str, str]] = None) -> List[MeijerItem]:
        """
        Browse products by category/collection.
        
        Args:
            collection_id: Constructor.io collection identifier
            page: Page number
            results_per_page: Number of results per page
            filters: Additional filters
            
        Returns:
            List of MeijerItem objects
        """
        endpoint = f"{self.base_url}/browse/collection_id/{collection_id}"
        
        params = {
            "key": self.api_key,
            "page": page,
            "num_results_per_page": results_per_page,
            **self.default_params
        }
        
        # Add filters
        applied_filters = {**self.default_filters}
        if filters:
            applied_filters.update(filters)
            
        for filter_name, filter_value in applied_filters.items():
            params[f"filters[{filter_name}]"] = filter_value
        
        try:
            response = requests.get(endpoint, params=params)
            response.raise_for_status()
            
            browse_data = response.json()
            items = create_meijer_items_from_search(browse_data, self.meijer_client)
            
            logger.info(f"Browse category '{collection_id}' returned {len(items)} items")
            return items
            
        except Exception as e:
            logger.error(f"Browse failed for category '{collection_id}': {e}")
            return []
    
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
        endpoint = f"{self.base_url}/behavior"
        
        params = {
            "key": self.api_key,
            "term": search_term,
            "num_results": num_results,
            "action": "search-results",
            **self.default_params
        }
        
        if customer_ids:
            params["customer_ids"] = ",".join(customer_ids)
        
        try:
            response = requests.get(endpoint, params=params)
            # Don't raise for status - analytics calls may return 204
            logger.debug(f"Tracked search behavior for '{search_term}'")
            
        except Exception as e:
            logger.warning(f"Failed to track search behavior: {e}")


# Integration with main Meijer client
class MeijerWithSearch:
    """
    Extended Meijer client with search functionality.
    """
    
    def __init__(self, meijer_client):
        """Initialize with existing Meijer client."""
        self.meijer_client = meijer_client
        self.search = MeijerSearch(meijer_client)
    
    def search_products(self, query: str, **kwargs) -> List[MeijerItem]:
        """Search for products."""
        return self.search.search(query, **kwargs)
    
    def get_autocomplete(self, partial_query: str, **kwargs) -> List[str]:
        """Get autocomplete suggestions."""
        return self.search.autocomplete(partial_query, **kwargs)
    
    def browse_category(self, category: str, **kwargs) -> List[MeijerItem]:
        """Browse products by category."""
        return self.search.browse_category(category, **kwargs)


if __name__ == "__main__":
    # Example usage
    search = MeijerSearch()
    
    # Search for products
    results = search.search("milk")
    print(f"Found {len(results)} results for 'milk'")
    
    for item in results[:5]:
        print(f"  - {item}")
    
    # Get autocomplete suggestions
    suggestions = search.autocomplete("mil")
    print(f"Autocomplete suggestions: {suggestions}")
