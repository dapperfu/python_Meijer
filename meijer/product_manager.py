"""
Product management for Meijer API client.

This module provides centralized management of product operations including
search, barcode lookup, and product details.
"""

import logging
from typing import Any, Dict, List, Optional

from .models import MeijerItem, SearchResult


class ProductManager:
    """
    Manages product operations for the Meijer API client.

    This class provides:
    - Product search
    - Barcode/UPC lookup
    - Product details
    - Bulk product operations
    """

    def __init__(self, client):
        """
        Initialize the product manager.

        Args:
            client: Reference to the main Meijer client
        """
        self.client = client
        self.logger = logging.getLogger(__name__)

    def search_products(
        self, query: str, max_results: int = 20, store_id: Optional[str] = None
    ) -> List[SearchResult]:
        """
        Search for products by query string.

        Args:
            query: Search query string
            max_results: Maximum number of results to return
            store_id: Optional store ID to limit search to specific store

        Returns:
            List of search results
        """
        try:
            params = {"query": query, "maxResults": max_results}

            if store_id:
                params["storeId"] = store_id

            response = self.client._make_request(
                "GET", self.client.config.get_api_url("products"), params=params
            )

            if response and response.status_code == 200:
                data = response.json()
                results = []
                for item_data in data.get("results", []):
                    try:
                        result = SearchResult(item_data)
                        results.append(result)
                    except Exception as e:
                        self.logger.warning(f"Failed to parse search result: {e}")
                        continue
                return results
            else:
                self.logger.warning(
                    f"Failed to search products: {response.status_code if response else 'No response'}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Error searching products: {e}")
            return []

    def search_product_by_upc(
        self, upc: str, store_id: Optional[str] = None
    ) -> Optional[MeijerItem]:
        """
        Search for a product by UPC/barcode.

        Args:
            upc: UPC/barcode to search for
            store_id: Optional store ID to limit search to specific store

        Returns:
            Product item if found, None otherwise
        """
        try:
            params = {"upc": upc}
            if store_id:
                params["storeId"] = store_id

            response = self.client._make_request(
                "GET", self.client.config.get_api_url("products"), params=params
            )

            if response and response.status_code == 200:
                data = response.json()
                if data.get("results"):
                    return MeijerItem(data["results"][0])
                return None
            else:
                self.logger.warning(
                    f"Failed to search product by UPC: {response.status_code if response else 'No response'}"
                )
                return None

        except Exception as e:
            self.logger.error(f"Error searching product by UPC {upc}: {e}")
            return None

    def search_multiple_products_by_upc(
        self, upcs: List[str], store_id: Optional[str] = None
    ) -> Dict[str, Optional[MeijerItem]]:
        """
        Search for multiple products by UPC/barcode.

        Args:
            upcs: List of UPCs/barcodes to search for
            store_id: Optional store ID to limit search to specific store

        Returns:
            Dictionary mapping UPC to product item (or None if not found)
        """
        results = {}

        for upc in upcs:
            product = self.search_product_by_upc(upc, store_id)
            results[upc] = product

        return results

    def lookup_barcode_price(
        self, barcode: str, store_id: Optional[str] = None
    ) -> Optional[Dict[str, Any]]:
        """
        Look up price information for a barcode.

        Args:
            barcode: Barcode to look up
            store_id: Optional store ID to limit lookup to specific store

        Returns:
            Price information dictionary or None if not found
        """
        try:
            product = self.search_product_by_upc(barcode, store_id)
            if product:
                return {
                    "barcode": barcode,
                    "name": product.name,
                    "price": product.price,
                    "sale_price": getattr(product, "sale_price", None),
                    "store_id": store_id,
                }
            return None

        except Exception as e:
            self.logger.error(f"Error looking up barcode price for {barcode}: {e}")
            return None

    def bulk_lookup_barcodes(
        self, barcodes: List[str], store_id: Optional[str] = None
    ) -> Dict[str, Optional[Dict[str, Any]]]:
        """
        Bulk lookup price information for multiple barcodes.

        Args:
            barcodes: List of barcodes to look up
            store_id: Optional store ID to limit lookup to specific store

        Returns:
            Dictionary mapping barcode to price information (or None if not found)
        """
        results = {}

        for barcode in barcodes:
            price_info = self.lookup_barcode_price(barcode, store_id)
            results[barcode] = price_info

        return results

    def get_product_detail(
        self, product_id: str, store_id: Optional[str] = None
    ) -> Optional[Dict[str, Any]]:
        """
        Get detailed product information.

        Args:
            product_id: Product ID to retrieve
            store_id: Optional store ID for store-specific information

        Returns:
            Product details dictionary or None if not found
        """
        try:
            params = {}
            if store_id:
                params["storeId"] = store_id

            response = self.client._make_request(
                "GET",
                f"{self.client.config.get_api_url('products')}/{product_id}",
                params=params,
            )

            if response and response.status_code == 200:
                data = response.json()
                return self._parse_product_detail_response(data)
            else:
                self.logger.warning(
                    f"Failed to get product details: {response.status_code if response else 'No response'}"
                )
                return None

        except Exception as e:
            self.logger.error(f"Error getting product details for {product_id}: {e}")
            return None

    def _parse_product_detail_response(self, data: Dict[str, Any]) -> Dict[str, Any]:
        """
        Parse product detail response data.

        Args:
            data: Raw response data

        Returns:
            Parsed product details
        """
        try:
            # Extract basic product information
            product_info = {
                "id": data.get("id"),
                "name": data.get("name"),
                "description": data.get("description"),
                "price": data.get("price"),
                "sale_price": data.get("salePrice"),
                "brand": data.get("brand"),
                "category": data.get("category"),
                "images": data.get("images", []),
                "nutrition": data.get("nutrition", {}),
                "ingredients": data.get("ingredients", []),
                "allergens": data.get("allergens", []),
                "availability": data.get("availability", {}),
                "locations": self._extract_location_from_product_detail(data),
            }

            return product_info

        except Exception as e:
            self.logger.error(f"Error parsing product detail response: {e}")
            return {}

    def _extract_location_from_product_detail(
        self, data: Dict[str, Any]
    ) -> Optional[Dict[str, str]]:
        """
        Extract location information from product detail response.

        Args:
            data: Product detail data

        Returns:
            Location information dictionary or None
        """
        try:
            # Look for location information in various possible fields
            location_fields = ["location", "aisle", "section", "shelf"]

            for field in location_fields:
                if field in data and data[field]:
                    return self._parse_ilc_location(str(data[field]))

            # Check for location in text fields
            text_fields = ["description", "notes", "additionalInfo"]
            for field in text_fields:
                if field in data and data[field]:
                    location = self._extract_location_from_text(str(data[field]))
                    if location:
                        return location

            return None

        except Exception as e:
            self.logger.debug(f"Error extracting location from product detail: {e}")
            return None

    def _parse_ilc_location(self, ilc_string: str) -> Optional[Dict[str, str]]:
        """
        Parse ILC (Item Location Code) string.

        Args:
            ilc_string: ILC string to parse

        Returns:
            Parsed location information or None
        """
        try:
            # Simple ILC parsing - this would need to be enhanced based on actual format
            if ilc_string and len(ilc_string) >= 3:
                return {
                    "aisle": ilc_string[:2],
                    "section": ilc_string[2:4] if len(ilc_string) >= 4 else None,
                    "shelf": ilc_string[4:] if len(ilc_string) >= 5 else None,
                }
            return None

        except Exception as e:
            self.logger.debug(f"Error parsing ILC location {ilc_string}: {e}")
            return None

    def _extract_location_from_text(self, text: str) -> Optional[Dict[str, str]]:
        """
        Extract location information from text.

        Args:
            text: Text to search for location information

        Returns:
            Location information dictionary or None
        """
        try:
            # Simple text-based location extraction
            # This would need to be enhanced with more sophisticated parsing
            text_lower = text.lower()

            # Look for common location keywords
            if "aisle" in text_lower:
                # Extract aisle number
                import re

                aisle_match = re.search(r"aisle\s*(\d+)", text_lower)
                if aisle_match:
                    return {"aisle": aisle_match.group(1)}

            return None

        except Exception as e:
            self.logger.debug(f"Error extracting location from text: {e}")
            return None

    def get_product_recommendations(
        self, product_id: str, limit: int = 10
    ) -> List[MeijerItem]:
        """
        Get product recommendations.

        Args:
            product_id: Product ID to get recommendations for
            limit: Maximum number of recommendations

        Returns:
            List of recommended products
        """
        try:
            params = {"limit": limit}

            response = self.client._make_request(
                "GET",
                f"{self.client.config.get_api_url('products')}/{product_id}/recommendations",
                params=params,
            )

            if response and response.status_code == 200:
                data = response.json()
                recommendations = []
                for item_data in data.get("recommendations", []):
                    try:
                        product = MeijerItem(item_data)
                        recommendations.append(product)
                    except Exception as e:
                        self.logger.warning(f"Failed to parse recommendation: {e}")
                        continue
                return recommendations
            else:
                self.logger.warning(
                    f"Failed to get product recommendations: {response.status_code if response else 'No response'}"
                )
                return []

        except Exception as e:
            self.logger.error(
                f"Error getting product recommendations for {product_id}: {e}"
            )
            return []
