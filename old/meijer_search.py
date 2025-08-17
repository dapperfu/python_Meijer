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


class MeijerSearchResults:
    """
    Container for paginated search results from Constructor.io.
    
    Provides easy pagination navigation and result management.
    """
    
    def __init__(self, items: List[MeijerItem], query: str, current_page: int, 
                 results_per_page: int, total_results: Optional[int] = None,
                 search_client: Optional['MeijerSearch'] = None,
                 filters: Optional[Dict[str, str]] = None,
                 store_id: Optional[str] = None):
        """
        Initialize search results container.
        
        Args:
            items: List of MeijerItem objects for current page
            query: Search query used
            current_page: Current page number (1-based)
            results_per_page: Number of results per page
            total_results: Total number of results available
            search_client: MeijerSearch client for pagination
            filters: Applied filters
            store_id: Store ID filter
        """
        self.items = items
        self.query = query
        self.current_page = current_page
        self.results_per_page = results_per_page
        self.total_results = total_results or len(items)
        self.search_client = search_client
        self.filters = filters or {}
        self.store_id = store_id
        
        # Calculate pagination info
        self.total_pages = (self.total_results + results_per_page - 1) // results_per_page
        self.has_next_page = current_page < self.total_pages
        self.has_prev_page = current_page > 1
        self.start_index = (current_page - 1) * results_per_page + 1
        self.end_index = min(current_page * results_per_page, self.total_results)
    
    def __len__(self) -> int:
        """Return number of items in current page."""
        return len(self.items)
    
    def __iter__(self):
        """Iterate over items in current page."""
        return iter(self.items)
    
    def __getitem__(self, index):
        """Get item by index from current page."""
        return self.items[index]
    
    def next_page(self) -> Optional['MeijerSearchResults']:
        """
        Get the next page of results.
        
        Returns:
            MeijerSearchResults for next page, or None if no next page
        """
        if not self.has_next_page or not self.search_client:
            return None
        
        # Handle browse category pagination differently
        if hasattr(self, 'collection_id') and self.query.startswith('category:'):
            return self.search_client.browse_category(
                collection_id=self.collection_id,
                page=self.current_page + 1,
                results_per_page=self.results_per_page,
                filters=self.filters
            )
        else:
            return self.search_client.search(
                query=self.query,
                page=self.current_page + 1,
                results_per_page=self.results_per_page,
                filters=self.filters,
                store_id=self.store_id
            )
    
    def prev_page(self) -> Optional['MeijerSearchResults']:
        """
        Get the previous page of results.
        
        Returns:
            MeijerSearchResults for previous page, or None if no previous page
        """
        if not self.has_prev_page or not self.search_client:
            return None
        
        # Handle browse category pagination differently
        if hasattr(self, 'collection_id') and self.query.startswith('category:'):
            return self.search_client.browse_category(
                collection_id=self.collection_id,
                page=self.current_page - 1,
                results_per_page=self.results_per_page,
                filters=self.filters
            )
        else:
            return self.search_client.search(
                query=self.query,
                page=self.current_page - 1,
                results_per_page=self.results_per_page,
                filters=self.filters,
                store_id=self.store_id
            )
    
    def get_page(self, page_number: int) -> Optional['MeijerSearchResults']:
        """
        Get a specific page of results.
        
        Args:
            page_number: Page number to retrieve (1-based)
            
        Returns:
            MeijerSearchResults for specified page, or None if invalid page
        """
        if page_number < 1 or page_number > self.total_pages or not self.search_client:
            return None
        
        # Handle browse category pagination differently
        if hasattr(self, 'collection_id') and self.query.startswith('category:'):
            return self.search_client.browse_category(
                collection_id=self.collection_id,
                page=page_number,
                results_per_page=self.results_per_page,
                filters=self.filters
            )
        else:
            return self.search_client.search(
                query=self.query,
                page=page_number,
                results_per_page=self.results_per_page,
                filters=self.filters,
                store_id=self.store_id
            )
    
    def get_all_items(self) -> List[MeijerItem]:
        """
        Get all items across all pages.
        
        Warning: This will make multiple API calls for large result sets.
        Use with caution for queries with many results.
        
        Returns:
            List of all MeijerItem objects across all pages
        """
        if not self.search_client or self.total_pages <= 1:
            return self.items.copy()
        
        all_items = self.items.copy()
        
        for page_num in range(2, self.total_pages + 1):
            page_results = self.get_page(page_num)
            if page_results:
                all_items.extend(page_results.items)
            else:
                logger.warning(f"Failed to retrieve page {page_num}")
                break
        
        return all_items
    
    def iter_all_pages(self):
        """
        Generator that yields items from all pages.
        
        This is more memory efficient than get_all_items() for large result sets.
        
        Yields:
            MeijerItem objects from all pages
        """
        # Yield items from current page
        for item in self.items:
            yield item
        
        # Yield items from remaining pages
        if self.search_client and self.total_pages > 1:
            for page_num in range(2, self.total_pages + 1):
                page_results = self.get_page(page_num)
                if page_results:
                    for item in page_results.items:
                        yield item
                else:
                    logger.warning(f"Failed to retrieve page {page_num}")
                    break
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert search results to dictionary representation."""
        return {
            'query': self.query,
            'current_page': self.current_page,
            'results_per_page': self.results_per_page,
            'total_results': self.total_results,
            'total_pages': self.total_pages,
            'has_next_page': self.has_next_page,
            'has_prev_page': self.has_prev_page,
            'start_index': self.start_index,
            'end_index': self.end_index,
            'items_count': len(self.items),
            'filters': self.filters,
            'store_id': self.store_id,
            'items': [item.to_dict() for item in self.items]
        }
    
    def __str__(self) -> str:
        """String representation of search results."""
        return (f"MeijerSearchResults(query='{self.query}', "
                f"page={self.current_page}/{self.total_pages}, "
                f"items={len(self.items)}, total={self.total_results})")
    
    def __repr__(self) -> str:
        """Detailed representation of search results."""
        return (f"MeijerSearchResults(query='{self.query}', "
                f"current_page={self.current_page}, "
                f"total_pages={self.total_pages}, "
                f"items_count={len(self.items)}, "
                f"total_results={self.total_results})")


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
               store_id: Optional[str] = None) -> 'MeijerSearchResults':
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
            
            # Extract total results count from Constructor.io response
            total_results = None
            if isinstance(search_data, dict):
                # Try different paths where Constructor.io might put total count
                if 'total_num_results' in search_data:
                    total_results = search_data['total_num_results']
                elif 'response' in search_data and isinstance(search_data['response'], dict):
                    resp = search_data['response']
                    if 'total_num_results' in resp:
                        total_results = resp['total_num_results']
                    elif 'results_metadata' in resp:
                        metadata = resp['results_metadata']
                        if isinstance(metadata, dict) and 'total_count' in metadata:
                            total_results = metadata['total_count']
                
                # If we couldn't find total count, estimate based on current results
                if total_results is None:
                    # If we got a full page, there might be more results
                    if len(items) == results_per_page:
                        # Conservative estimate: at least one more page might exist
                        total_results = len(items) * 2
                    else:
                        # Partial page suggests we got all results
                        total_results = (page - 1) * results_per_page + len(items)
            
            # Create paginated results container
            results = MeijerSearchResults(
                items=items,
                query=query,
                current_page=page,
                results_per_page=results_per_page,
                total_results=total_results,
                search_client=self,
                filters=applied_filters,
                store_id=store_id
            )
            
            logger.info(f"Search for '{query}' page {page}: {len(items)} items, "
                       f"total ~{total_results}")
            return results
            
        except Exception as e:
            logger.error(f"Search failed for '{query}' page {page}: {e}")
            # Return empty results container
            return MeijerSearchResults(
                items=[],
                query=query,
                current_page=page,
                results_per_page=results_per_page,
                total_results=0,
                search_client=self,
                filters=applied_filters,
                store_id=store_id
            )
    
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
                       filters: Optional[Dict[str, str]] = None) -> 'MeijerSearchResults':
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
            
            # Extract total results count from Constructor.io browse response
            total_results = None
            if isinstance(browse_data, dict):
                if 'total_num_results' in browse_data:
                    total_results = browse_data['total_num_results']
                elif 'response' in browse_data and isinstance(browse_data['response'], dict):
                    resp = browse_data['response']
                    if 'total_num_results' in resp:
                        total_results = resp['total_num_results']
                
                # Estimate if total not found
                if total_results is None:
                    if len(items) == results_per_page:
                        total_results = len(items) * 2
                    else:
                        total_results = (page - 1) * results_per_page + len(items)
            
            # Create paginated results container
            results = MeijerSearchResults(
                items=items,
                query=f"category:{collection_id}",  # Use category as pseudo-query
                current_page=page,
                results_per_page=results_per_page,
                total_results=total_results,
                search_client=self,
                filters=applied_filters,
                store_id=None  # Browse typically doesn't use store filter
            )
            
            # Store the collection_id for pagination
            results.collection_id = collection_id
            
            logger.info(f"Browse category '{collection_id}' page {page}: {len(items)} items, "
                       f"total ~{total_results}")
            return results
            
        except Exception as e:
            logger.error(f"Browse failed for category '{collection_id}' page {page}: {e}")
            # Return empty results container
            return MeijerSearchResults(
                items=[],
                query=f"category:{collection_id}",
                current_page=page,
                results_per_page=results_per_page,
                total_results=0,
                search_client=self,
                filters=applied_filters,
                store_id=None
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
    
    def search_products(self, query: str, **kwargs) -> 'MeijerSearchResults':
        """Search for products."""
        return self.search.search(query, **kwargs)
    
    def get_autocomplete(self, partial_query: str, **kwargs) -> List[str]:
        """Get autocomplete suggestions."""
        return self.search.autocomplete(partial_query, **kwargs)
    
    def browse_category(self, category: str, **kwargs) -> 'MeijerSearchResults':
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
