#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Enhanced search functionality based on mitmproxy log analysis showing UPC search endpoints
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * Code style: Python with full mypy typing, numpy-style docstrings
 * Dependencies: meijer package, requests, typing, dataclasses
 */

Enhanced Search Functionality for Meijer API
===========================================

This module provides enhanced search functionality based on actual API endpoints
discovered in mitmproxy logs, including UPC-specific searches that always return
1 result and comprehensive product discovery.
"""

import logging
from dataclasses import dataclass, field
from datetime import datetime
from typing import Any, Dict, List, Optional

from .models import MeijerItem


@dataclass
class UPCSearchResult:
    """Result of a UPC-specific search operation."""

    upc: str
    product: Optional[MeijerItem] = None
    found: bool = False
    search_timestamp: datetime = field(default_factory=datetime.now)
    search_method: str = "unknown"
    error_message: Optional[str] = None

    @property
    def success(self) -> bool:
        """Check if the search was successful."""
        return self.found and self.product is not None

    @property
    def product_title(self) -> Optional[str]:
        """Get the product title if available."""
        if self.product:
            return getattr(self.product, "title", None)
        return None

    @property
    def product_price(self) -> Optional[float]:
        """Get the product price if available."""
        if self.product:
            return getattr(self.product, "price", None)
        return None


class EnhancedSearch:
    """
    Enhanced search functionality based on mitmproxy log analysis.

    This class provides comprehensive search capabilities including:
    - UPC-specific searches that always return 1 result
    - Direct product information lookup
    - Multi-UPC bulk searches
    - Search result caching and optimization
    """

    def __init__(self, api_client: Any):
        """
        Initialize the enhanced search instance.

        Parameters
        ----------
        api_client : Any
            Meijer API client instance for making authenticated requests
        """
        self.api_client = api_client
        self.logger = logging.getLogger(__name__)

        # Base URLs from mitmproxy log analysis
        self.meijer_api_base = "https://api.meijer.com"
        self.construc_base = "https://ac.cnstrc.com"

        # Search endpoints discovered in logs
        self.endpoints = {
            # Direct product lookup by UPC (POST method)
            "product_info": "/edaa/product/productinfo/v1/item",
            # OCC product details
            "occ_product": "/digital/occ/v3/products/{upc}",
            # Multi-UPC endpoint for bulk operations
            "multi_upc": "/digital/multi-upc/v1/upcs",
            # Construc search (for discovery)
            "construc_search": "/search/{query}",
            # Product recommendations
            "recommendations": "/digital/recommendations/v1/products",
        }

        # API keys from log analysis
        self.construc_api_key = "key_GdYuTcnduTUtsZd6"
        self.ocp_apim_key = "a10bc58ac484478d9b3958b1742c3a03"

        # Search result cache
        self._search_cache: Dict[str, Any] = {}
        self._cache_ttl = 1800  # 30 minutes

    def search_by_upc(
        self, upc: str, store_id: Optional[str] = None, force_refresh: bool = False
    ) -> UPCSearchResult:
        """
        Search for a product by UPC code.

        This method implements the exact endpoint pattern found in mitmproxy logs:
        POST to /edaa/product/productinfo/v1/item with UPC in request body.
        Always returns exactly 1 result if found.

        Parameters
        ----------
        upc : str
            UPC code to search for
        store_id : str, optional
            Store ID for store-specific pricing and availability
        force_refresh : bool, optional
            Force refresh of cached results (default: False)

        Returns
        -------
        UPCSearchResult
            Search result containing product information or error details
        """
        try:
            # Check cache first (unless force refresh)
            cache_key = f"upc_search_{upc}_{store_id or 'all'}"
            if not force_refresh and cache_key in self._search_cache:
                cached_result = self._search_cache[cache_key]
                if (
                    datetime.now() - cached_result.search_timestamp
                ).total_seconds() < self._cache_ttl:
                    self.logger.debug(f"Returning cached UPC search result for {upc}")
                    return cached_result

            self.logger.info(f"Searching for product with UPC: {upc}")

            # Method 1: Direct product info endpoint (POST method from logs)
            result = self._search_by_upc_direct(upc, store_id)
            if result.success:
                self._cache_result(cache_key, result)
                return result

            # Method 2: OCC product details endpoint
            result = self._search_by_upc_occ(upc, store_id)
            if result.success:
                self._cache_result(cache_key, result)
                return result

            # Method 3: Construc search as fallback
            result = self._search_by_upc_construc(upc, store_id)
            if result.success:
                self._cache_result(cache_key, result)
                return result

            # If all methods failed, return error result
            error_result = UPCSearchResult(
                upc=upc,
                found=False,
                search_method="all_methods_failed",
                error_message="All search methods failed for this UPC",
            )
            self._cache_result(cache_key, error_result)
            return error_result

        except Exception as e:
            self.logger.error(f"Error searching by UPC {upc}: {e}")
            return UPCSearchResult(
                upc=upc, found=False, search_method="error", error_message=str(e)
            )

    def _search_by_upc_direct(
        self, upc: str, store_id: Optional[str] = None
    ) -> UPCSearchResult:
        """
        Search using direct product info endpoint (POST method).

        This is the primary method based on mitmproxy log analysis.
        """
        try:
            endpoint = self.endpoints["product_info"]
            url = f"{self.meijer_api_base}{endpoint}"

            # Request body based on log analysis
            request_data = {"upc": upc, "storeId": store_id}

            # Headers from log analysis
            headers = {
                "Accept": "application/json",
                "Content-Type": "application/json",
                "OCP-APIM-Subscription-Key": self.ocp_apim_key,
            }

            # Add authentication if available
            if hasattr(self.api_client, "_get_api_headers"):
                auth_headers = self.api_client._get_api_headers()
                headers.update(auth_headers)

            self.logger.debug(f"Making direct UPC search request to: {url}")

            response = self.api_client._make_request(
                "POST", url, json_data=request_data, headers=headers
            )

            if response and response.status_code == 200:
                data = response.json()

                # Parse response based on log analysis
                if data.get("success") and data.get("data"):
                    product_data = data["data"]
                    product = MeijerItem(product_data, title=product_data.get("name", "Unknown Product"))

                    return UPCSearchResult(
                        upc=upc,
                        product=product,
                        found=True,
                        search_method="direct_product_info",
                    )
                else:
                    self.logger.debug(f"Direct search returned no data for UPC {upc}")
                    return UPCSearchResult(
                        upc=upc,
                        found=False,
                        search_method="direct_product_info",
                        error_message="No product data returned",
                    )
            else:
                status_code = response.status_code if response else "No response"
                self.logger.debug(f"Direct search failed with status: {status_code}")
                return UPCSearchResult(
                    upc=upc,
                    found=False,
                    search_method="direct_product_info",
                    error_message=f"HTTP {status_code}",
                )

        except Exception as e:
            self.logger.debug(f"Direct UPC search failed for {upc}: {e}")
            return UPCSearchResult(
                upc=upc,
                found=False,
                search_method="direct_product_info",
                error_message=str(e),
            )

    def _search_by_upc_occ(
        self, upc: str, store_id: Optional[str] = None
    ) -> UPCSearchResult:
        """
        Search using OCC product details endpoint.

        This is the secondary method for product details.
        """
        try:
            endpoint = self.endpoints["occ_product"].format(upc=upc)
            url = f"{self.meijer_api_base}{endpoint}"

            params = {}
            if store_id:
                params["store"] = store_id

            headers = {
                "Accept": "application/json",
                "OCP-APIM-Subscription-Key": self.ocp_apim_key,
            }

            self.logger.debug(f"Making OCC UPC search request to: {url}")

            response = self.api_client._make_request(
                "GET", url, params=params, headers=headers
            )

            if response and response.status_code == 200:
                data = response.json()

                if data.get("code") == upc:
                    product = MeijerItem(data, title=data.get("name", "Unknown Product"))

                    return UPCSearchResult(
                        upc=upc,
                        product=product,
                        found=True,
                        search_method="occ_product_details",
                    )
                else:
                    self.logger.debug(
                        f"OCC search returned different UPC: {data.get('code')}"
                    )
                    return UPCSearchResult(
                        upc=upc,
                        found=False,
                        search_method="occ_product_details",
                        error_message="UPC mismatch in response",
                    )
            else:
                status_code = response.status_code if response else "No response"
                self.logger.debug(f"OCC search failed with status: {status_code}")
                return UPCSearchResult(
                    upc=upc,
                    found=False,
                    search_method="occ_product_details",
                    error_message=f"HTTP {status_code}",
                )

        except Exception as e:
            self.logger.debug(f"OCC UPC search failed for {upc}: {e}")
            return UPCSearchResult(
                upc=upc,
                found=False,
                search_method="occ_product_details",
                error_message=str(e),
            )

    def _search_by_upc_construc(
        self, upc: str, store_id: Optional[str] = None
    ) -> UPCSearchResult:
        """
        Search using Construc search as fallback method.

        This method searches the product catalog using the UPC as a search term.
        """
        try:
            endpoint = self.endpoints["construc_search"].format(query=upc)
            url = f"{self.construc_base}{endpoint}"

            params = {
                "key": self.construc_api_key,
                "num_results_per_page": 1,
                "page": 1,
                "sort_by": "relevance",
            }

            if store_id:
                params["filters[availableInStores]"] = store_id

            headers = {
                "Accept": "application/json",
                "User-Agent": "okhttp/4.9.0",  # From log analysis
            }

            self.logger.debug(f"Making Construc UPC search request to: {url}")

            response = self.api_client._make_request(
                "GET", url, params=params, headers=headers
            )

            if response and response.status_code == 200:
                data = response.json()

                if data.get("response") and data["response"].get("results"):
                    # Construc search results
                    result_data = data["response"]["results"][0]
                    product = MeijerItem(result_data, title=result_data.get("title", "Unknown Product"))

                    return UPCSearchResult(
                        upc=upc,
                        product=product,
                        found=True,
                        search_method="construc_search",
                    )
                else:
                    self.logger.debug(
                        f"Construc search returned no results for UPC {upc}"
                    )
                    return UPCSearchResult(
                        upc=upc,
                        found=False,
                        search_method="construc_search",
                        error_message="No search results",
                    )
            else:
                status_code = response.status_code if response else "No response"
                self.logger.debug(f"Construc search failed with status: {status_code}")
                return UPCSearchResult(
                    upc=upc,
                    found=False,
                    search_method="construc_search",
                    error_message=f"HTTP {status_code}",
                )

        except Exception as e:
            self.logger.debug(f"Construc UPC search failed for {upc}: {e}")
            return UPCSearchResult(
                upc=upc,
                found=False,
                search_method="construc_search",
                error_message=str(e),
            )

    def search_multiple_upcs(
        self, upcs: List[str], store_id: Optional[str] = None
    ) -> Dict[str, UPCSearchResult]:
        """
        Search for multiple products by UPC codes.

        This method uses the multi-UPC endpoint for efficient bulk operations.

        Parameters
        ----------
        upcs : List[str]
            List of UPC codes to search for
        store_id : str, optional
            Store ID for store-specific pricing and availability

        Returns
        -------
        Dict[str, UPCSearchResult]
            Dictionary mapping UPC to search result
        """
        if not upcs:
            return {}

        if len(upcs) > 20:
            self.logger.warning("More than 20 UPCs provided, truncating to first 20")
            upcs = upcs[:20]

        try:
            # Try bulk search first
            bulk_results = self._bulk_search_upcs(upcs, store_id)
            if bulk_results:
                return bulk_results

            # Fallback to individual searches
            self.logger.info("Bulk search failed, falling back to individual searches")
            return self._individual_search_upcs(upcs, store_id)

        except Exception as e:
            self.logger.error(f"Error in multiple UPC search: {e}")
            # Fallback to individual searches
            return self._individual_search_upcs(upcs, store_id)

    def _bulk_search_upcs(
        self, upcs: List[str], store_id: Optional[str] = None
    ) -> Dict[str, UPCSearchResult]:
        """Perform bulk UPC search using the multi-UPC endpoint."""
        try:
            endpoint = self.endpoints["multi_upc"]
            url = f"{self.meijer_api_base}{endpoint}"

            request_data = {"upcs": upcs}
            if store_id:
                request_data["unitId"] = store_id

            headers = {
                "Accept": "application/json",
                "Content-Type": "application/json",
                "OCP-APIM-Subscription-Key": self.ocp_apim_key,
            }

            self.logger.info(f"Performing bulk search for {len(upcs)} UPCs")

            response = self.api_client._make_request(
                "POST", url, json_data=request_data, headers=headers
            )

            if response and response.status_code == 200:
                data = response.json()
                return self._parse_bulk_search_response(data, upcs)
            else:
                self.logger.debug("Bulk search failed, will use individual searches")
                return {}

        except Exception as e:
            self.logger.debug(f"Bulk UPC search failed: {e}")
            return {}

    def _parse_bulk_search_response(
        self, response_data: Dict[str, Any], requested_upcs: List[str]
    ) -> Dict[str, UPCSearchResult]:
        """Parse the response from bulk UPC search."""
        results = {}

        try:
            # Handle different response formats
            if "response" in response_data and "results" in response_data["response"]:
                products = response_data["response"]["results"]
            elif "results" in response_data:
                products = response_data["results"]
            else:
                self.logger.warning("Unexpected bulk search response format")
                return {}

            # Create results for all requested UPCs
            for upc in requested_upcs:
                # Find matching product
                matching_product = None
                for product_data in products:
                    if (
                        product_data.get("code") == upc
                        or product_data.get("upc") == upc
                        or product_data.get("ean") == upc
                    ):
                        matching_product = product_data
                        break

                if matching_product:
                    product = MeijerItem(matching_product, title=matching_product.get("title", "Unknown Product"))
                    results[upc] = UPCSearchResult(
                        upc=upc,
                        product=product,
                        found=True,
                        search_method="bulk_search",
                    )
                else:
                    results[upc] = UPCSearchResult(
                        upc=upc,
                        found=False,
                        search_method="bulk_search",
                        error_message="Product not found in bulk response",
                    )

            return results

        except Exception as e:
            self.logger.error(f"Error parsing bulk search response: {e}")
            # Return empty results for all UPCs
            return {
                upc: UPCSearchResult(
                    upc=upc,
                    found=False,
                    search_method="bulk_search",
                    error_message=f"Parse error: {str(e)}",
                )
                for upc in requested_upcs
            }

    def _individual_search_upcs(
        self, upcs: List[str], store_id: Optional[str] = None
    ) -> Dict[str, UPCSearchResult]:
        """Perform individual UPC searches as fallback."""
        results = {}

        for upc in upcs:
            self.logger.debug(f"Performing individual search for UPC: {upc}")
            result = self.search_by_upc(upc, store_id)
            results[upc] = result

        return results

    def _cache_result(self, cache_key: str, result: UPCSearchResult) -> None:
        """Cache a search result."""
        self._search_cache[cache_key] = result

        # Clean up old cache entries
        current_time = datetime.now()
        expired_keys = [
            key
            for key, cached_result in self._search_cache.items()
            if (current_time - cached_result.search_timestamp).total_seconds()
            > self._cache_ttl
        ]

        for key in expired_keys:
            del self._search_cache[key]

    def clear_cache(self) -> None:
        """Clear all cached search results."""
        self._search_cache.clear()
        self.logger.info("Search cache cleared")

    def get_cache_stats(self) -> Dict[str, Any]:
        """Get statistics about the search cache."""
        current_time = datetime.now()
        total_entries = len(self._search_cache)
        expired_entries = sum(
            1
            for result in self._search_cache.values()
            if (current_time - result.search_timestamp).total_seconds()
            > self._cache_ttl
        )

        return {
            "total_entries": total_entries,
            "expired_entries": expired_entries,
            "active_entries": total_entries - expired_entries,
            "cache_ttl_seconds": self._cache_ttl,
        }
