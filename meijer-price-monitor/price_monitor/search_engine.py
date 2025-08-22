#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Enhanced search engine with pagination and UPC tracking for Meijer products
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: typing, dataclasses, datetime, pathlib, logging, meijer package
 */

Enhanced search engine for Meijer products with pagination and UPC tracking.

This module provides:
1. Comprehensive product search with pagination support
2. UPC extraction and tracking for all products
3. Shop'n'Scan integration for price verification
4. Cart fallback when Shop'n'Scan is unavailable
5. Efficient search result processing and storage
"""

import logging
import time
from dataclasses import dataclass, field
from datetime import datetime
from pathlib import Path
from typing import Dict, List, Optional, Any, Iterator, Tuple

# Import from the core Meijer API
from meijer.client import Meijer
from meijer.search import Search
from meijer.stores import MeijerStore
MEIJER_AVAILABLE = True


@dataclass
class SearchResult:
    """Represents a single search result with UPC information."""
    
    upc: str
    """Product UPC code (primary identifier)"""
    
    product_name: str
    """Product name"""
    
    store_id: str
    """Store identifier"""
    
    store_name: str
    """Store name"""
    
    price: float
    """Current price"""
    
    original_price: Optional[float] = None
    """Original/regular price if available"""
    
    is_clearance: bool = False
    """Whether the item is on clearance"""
    
    is_on_sale: bool = False
    """Whether the item is on sale"""
    
    availability: str = "unknown"
    """Product availability status"""
    
    brand: Optional[str] = None
    """Product brand"""
    
    category: Optional[str] = None
    """Product category"""
    
    subcategory: Optional[str] = None
    """Product subcategory"""
    
    description: Optional[str] = None
    """Product description"""
    
    image_url: Optional[str] = None
    """Product image URL"""
    
    search_query: str = ""
    """The search query that found this product"""
    
    timestamp: datetime = field(default_factory=datetime.now)
    """When this search result was recorded"""
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for storage."""
        data = {
            'upc': self.upc,
            'product_name': self.product_name,
            'store_id': self.store_id,
            'store_name': self.store_name,
            'price': self.price,
            'original_price': self.original_price,
            'is_clearance': self.is_clearance,
            'is_on_sale': self.is_on_sale,
            'availability': self.availability,
            'brand': self.brand,
            'category': self.category,
            'subcategory': self.subcategory,
            'description': self.description,
            'image_url': self.image_url,
            'search_query': self.search_query,
            'timestamp': self.timestamp.isoformat()
        }
        return data


@dataclass
class SearchQuery:
    """Represents a search query with configuration."""
    
    query_text: str
    """The search query text"""
    
    max_results: int = 100
    """Maximum number of results to retrieve"""
    
    min_results: int = 5
    """Minimum number of results to retrieve before stopping"""
    
    stores: Optional[List[str]] = None
    """Specific stores to search (if None, searches all available stores)"""
    
    include_clearance: bool = True
    """Whether to include clearance items"""
    
    include_out_of_stock: bool = False
    """Whether to include out-of-stock items"""
    
    price_min: Optional[float] = None
    """Minimum price filter"""
    
    price_max: Optional[float] = None
    """Maximum price filter"""
    
    created_at: datetime = field(default_factory=datetime.now)
    """When this search query was created"""
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for storage."""
        # Ensure query_text is always a string
        query_text = self.query_text
        if not isinstance(query_text, str):
            query_text = str(query_text)
            
        return {
            'query_text': query_text,
            'max_results': self.max_results,
            'min_results': self.min_results,
            'stores': self.stores,
            'include_clearance': self.include_clearance,
            'include_out_of_stock': self.include_out_of_stock,
            'price_min': self.price_min,
            'price_max': self.price_max,
            'created_at': self.created_at.isoformat()
        }


class EnhancedSearchEngine:
    """Enhanced search engine with pagination and UPC tracking."""
    
    def __init__(self, meijer_client: Optional[Any] = None):
        """
        Initialize the enhanced search engine.
        
        Parameters
        ----------
        meijer_client : Any, optional
            Authenticated Meijer client instance
        """
        self.meijer = meijer_client
        self.logger = logging.getLogger(__name__)
        
        # Initialize search and stores if Meijer API is available
        if MEIJER_AVAILABLE and meijer_client:
            self.search = Search(meijer_client)
            self.stores = meijer_client  # Use the client itself for store operations
        else:
            self.search = None
            self.stores = None
            self.logger.warning("Meijer API not available. Using mock search functionality.")
    
    def search_products(
        self, 
        query: SearchQuery,
        progress_callback: Optional[callable] = None
    ) -> List[SearchResult]:
        """
        Search for products using the enhanced search engine.
        
        Parameters
        ----------
        query : SearchQuery
            Search query configuration
        progress_callback : callable, optional
            Callback function for progress updates
        
        Returns
        -------
        List[SearchResult]
            List of search results with UPC information
        """
        self.logger.info(f"Starting enhanced search for: {query.query_text}")
        
        all_results: List[SearchResult] = []
        stores_to_search = query.stores or self._get_available_stores()
        
        if progress_callback:
            progress_callback(f"Searching {len(stores_to_search)} stores for '{query.query_text}'")
        
        for i, store_id in enumerate(stores_to_search):
            try:
                if progress_callback:
                    progress_callback(f"Searching store {i+1}/{len(stores_to_search)}: {store_id}")
                
                store_results = self._search_store_with_pagination(
                    query, store_id, progress_callback
                )
                all_results.extend(store_results)
                
                # Check if we have enough results
                if len(all_results) >= query.max_results:
                    self.logger.info(f"Reached maximum results limit ({query.max_results})")
                    break
                
                # Add delay between stores to avoid rate limiting
                if i < len(stores_to_search) - 1:
                    time.sleep(0.5)
                    
            except Exception as e:
                self.logger.error(f"Failed to search store {store_id}: {e}")
                continue
        
        # Apply filters and sort results
        filtered_results = self._apply_filters(all_results, query)
        
        self.logger.info(f"Search completed: {len(filtered_results)} results found")
        return filtered_results
    
    def _search_store_with_pagination(
        self, 
        query: SearchQuery, 
        store_id: str,
        progress_callback: Optional[callable] = None
    ) -> List[SearchResult]:
        """
        Search a specific store with pagination support.
        
        Parameters
        ----------
        query : SearchQuery
            Search query configuration
        store_id : str
            Store identifier
        progress_callback : callable, optional
            Callback function for progress updates
        
        Returns
        -------
        List[SearchResult]
            List of search results from this store
        """
        store_results: List[SearchResult] = []
        page = 1
        results_per_page = 50  # Meijer API default
        
        while len(store_results) < query.max_results:
            try:
                if progress_callback:
                    progress_callback(f"Searching page {page} at store {store_id}")
                
                # Search current page
                page_results = self._search_page(
                    query.query_text, store_id, page, results_per_page
                )
                
                if not page_results:
                    # No more results
                    break
                
                # Convert to SearchResult objects
                for item in page_results:
                    search_result = self._convert_to_search_result(item, store_id, query.query_text)
                    if search_result:
                        store_results.append(search_result)
                
                # Check if we have enough results
                if len(store_results) >= query.max_results:
                    break
                
                # Check if we should continue based on minimum results
                if len(store_results) >= query.min_results and not self._has_more_pages(page_results):
                    break
                
                page += 1
                
                # Add delay between pages to avoid rate limiting
                time.sleep(0.2)
                
            except Exception as e:
                self.logger.error(f"Failed to search page {page} at store {store_id}: {e}")
                break
        
        return store_results
    
    def _search_page(
        self, 
        query_text: str, 
        store_id: str, 
        page: int, 
        results_per_page: int
    ) -> List[Any]:
        """
        Search a single page of results.
        
        Parameters
        ----------
        query_text : str
            Search query text
        store_id : str
            Store identifier
        page : int
            Page number (1-based)
        results_per_page : int
            Number of results per page
        
        Returns
        -------
        List[Any]
            List of search results from this page
        """
        if not self.search:
            raise RuntimeError("Meijer search not available. Please ensure Meijer API is properly initialized.")
        
        try:
            # Use the Meijer search API
            search_results = self.search.search(
                query_text, 
                store_id=store_id, 
                page=page,
                results_per_page=results_per_page
            )
            
            if hasattr(search_results, 'results'):
                return search_results.results
            else:
                return []
                
        except Exception as e:
            self.logger.error(f"Failed to search page {page}: {e}")
            return []
    
    def _convert_to_search_result(
        self, 
        item: Any, 
        store_id: str, 
        search_query: str
    ) -> Optional[SearchResult]:
        """
        Convert a search result item to SearchResult object.
        
        Parameters
        ----------
        item : Any
            Raw search result item
        store_id : str
            Store identifier
        search_query : str
            The search query that found this item
        
        Returns
        -------
        Optional[SearchResult]
            Converted SearchResult object, or None if conversion failed
        """
        try:
            # Extract UPC from the item
            upc = self._extract_upc(item)
            if not upc:
                self.logger.warning(f"Could not extract UPC from item: {getattr(item, 'name', 'Unknown')}")
                return None
            
            # Extract store name
            store_name = getattr(item, 'store_name', None)
            if not store_name:
                store_name = f"Store {store_id}"
            
            # Create SearchResult
            result = SearchResult(
                upc=upc,
                product_name=getattr(item, 'name', 'Unknown Product'),
                store_id=store_id,
                store_name=store_name,
                price=getattr(item, 'price', 0.0),
                original_price=getattr(item, 'original_price', None),
                is_clearance=getattr(item, 'is_clearance', False),
                is_on_sale=getattr(item, 'is_on_sale', False),
                availability=getattr(item, 'availability', 'unknown'),
                brand=getattr(item, 'brand', None),
                category=getattr(item, 'category', None),
                subcategory=getattr(item, 'subcategory', None),
                description=getattr(item, 'description', None),
                image_url=getattr(item, 'image_url', None),
                search_query=search_query
            )
            
            return result
            
        except Exception as e:
            self.logger.error(f"Failed to convert search result: {e}")
            return None
    
    def _extract_upc(self, item: Any) -> Optional[str]:
        """
        Extract UPC from a search result item.
        
        Parameters
        ----------
        item : Any
            Search result item
        
        Returns
        -------
        Optional[str]
            UPC code if found, None otherwise
        """
        # Try different possible UPC fields
        upc_fields = ['upc', 'UPC', 'product_id', 'id', 'sku']
        
        for field in upc_fields:
            if hasattr(item, field):
                value = getattr(item, field)
                if value and self._is_valid_upc(str(value)):
                    return str(value)
        
        # If no UPC found, try to extract from product name or description
        if hasattr(item, 'name'):
            name = getattr(item, 'name', '')
            # Look for UPC pattern in name (12-13 digits)
            import re
            upc_match = re.search(r'\b\d{12,13}\b', name)
            if upc_match:
                return upc_match.group()
        
        return None
    
    def _is_valid_upc(self, upc: str) -> bool:
        """
        Check if a string is a valid UPC code.
        
        Parameters
        ----------
        upc : str
            UPC string to validate
        
        Returns
        -------
        bool
            True if valid UPC, False otherwise
        """
        # Remove any non-digit characters
        digits = ''.join(filter(str.isdigit, upc))
        
        # Check length (UPC-A is 12 digits, UPC-E is 8 digits, EAN-13 is 13 digits)
        if len(digits) not in [8, 12, 13]:
            return False
        
        # Basic validation: all characters should be digits
        return digits.isdigit()
    
    def _has_more_pages(self, page_results: List[Any]) -> bool:
        """
        Check if there are more pages available.
        
        Parameters
        ----------
        page_results : List[Any]
            Results from current page
        
        Returns
        -------
        bool
            True if more pages likely available, False otherwise
        """
        # If we got fewer results than requested, likely no more pages
        if len(page_results) < 50:  # Assuming 50 is the default page size
            return False
        
        # Check if the last item has any indication of being the last
        # This is heuristic and may need adjustment based on actual API behavior
        return True
    
    def _apply_filters(self, results: List[SearchResult], query: SearchQuery) -> List[SearchResult]:
        """
        Apply filters to search results.
        
        Parameters
        ----------
        results : List[SearchResult]
            List of search results to filter
        query : SearchQuery
            Search query with filter configuration
        
        Returns
        -------
        List[SearchResult]
            Filtered search results
        """
        filtered_results = []
        
        for result in results:
            # Apply price filters
            if query.price_min is not None and result.price < query.price_min:
                continue
            if query.price_max is not None and result.price > query.price_max:
                continue
            
            # Apply clearance filter
            if not query.include_clearance and result.is_clearance:
                continue
            
            # Apply availability filter
            if not query.include_out_of_stock and result.availability == 'out_of_stock':
                continue
            
            filtered_results.append(result)
        
        # Sort by price (lowest first)
        filtered_results.sort(key=lambda x: x.price)
        
        return filtered_results
    
    def _get_available_stores(self) -> List[str]:
        """Get list of available store IDs."""
        if not self.stores:
            raise RuntimeError("Meijer stores not available. Please ensure Meijer API is properly initialized.")
        
        try:
            # Get all available stores
            all_stores = self.stores.get_stores()
            return [store.store_id for store in all_stores]
        except Exception as e:
            self.logger.error(f"Failed to get available stores: {e}")
            raise RuntimeError(f"Failed to get available stores: {e}")
    
    def verify_prices_with_shopnscan(
        self, 
        upcs: List[str], 
        store_id: str,
        progress_callback: Optional[callable] = None
    ) -> Dict[str, Any]:
        """
        Verify prices for multiple UPCs using Shop'n'Scan.
        
        Parameters
        ----------
        upcs : List[str]
            List of UPC codes to verify
        store_id : str
            Store identifier
        progress_callback : callable, optional
            Callback function for progress updates
        
        Returns
        -------
        Dict[str, Any]
            Dictionary mapping UPCs to verification results
        """
        self.logger.info(f"Verifying prices for {len(upcs)} products at store {store_id}")
        
        verification_results = {}
        
        for i, upc in enumerate(upcs):
            try:
                if progress_callback:
                    progress_callback(f"Verifying UPC {i+1}/{len(upcs)}: {upc}")
                
                # Try Shop'n'Scan first
                shopnscan_result = self._verify_with_shopnscan(upc, store_id)
                
                if shopnscan_result:
                    verification_results[upc] = {
                        'method': 'shopnscan',
                        'result': shopnscan_result,
                        'timestamp': datetime.now()
                    }
                else:
                    # Fallback to cart verification
                    cart_result = self._verify_with_cart(upc, store_id)
                    if cart_result:
                        verification_results[upc] = {
                            'method': 'cart',
                            'result': cart_result,
                            'timestamp': datetime.now()
                        }
                    else:
                        verification_results[upc] = {
                            'method': 'none',
                            'result': None,
                            'timestamp': datetime.now()
                        }
                
                # Add delay to avoid rate limiting
                time.sleep(0.5)
                
            except Exception as e:
                self.logger.error(f"Failed to verify UPC {upc}: {e}")
                verification_results[upc] = {
                    'method': 'error',
                    'result': None,
                    'error': str(e),
                    'timestamp': datetime.now()
                }
        
        return verification_results
    
    def _verify_with_shopnscan(self, upc: str, store_id: str) -> Optional[Dict[str, Any]]:
        """
        Verify price using Shop'n'Scan functionality.
        
        Parameters
        ----------
        upc : str
            Product UPC code
        store_id : str
            Store identifier
        
        Returns
        -------
        Optional[Dict[str, Any]]
            Shop'n'Scan verification result, or None if failed
        """
        try:
            # TODO: Implement actual Shop'n'Scan integration
            # This would involve calling the Meijer API's Shop'n'Scan functionality
            self.logger.info(f"Shop'n'Scan verification not yet implemented for UPC {upc}")
            return None
            
        except Exception as e:
            self.logger.error(f"Shop'n'Scan verification failed for UPC {upc}: {e}")
            return None
    
    def _verify_with_cart(self, upc: str, store_id: str) -> Optional[Dict[str, Any]]:
        """
        Verify price using cart functionality as fallback.
        
        Parameters
        ----------
        upc : str
            Product UPC code
        store_id : str
            Store identifier
        
        Returns
        -------
        Optional[Dict[str, Any]]
            Cart verification result, or None if failed
        """
        try:
            # TODO: Implement actual cart verification
            # This would involve adding the product to cart and checking the price
            self.logger.info(f"Cart verification not yet implemented for UPC {upc}")
            return None
            
        except Exception as e:
            self.logger.error(f"Cart verification failed for UPC {upc}: {e}")
            return None
