"""
Product Operations for Meijer API Client
========================================

This module contains the product-related operations that were moved from the main client
to reduce file size and improve organization.
"""

import re
from typing import Any, Dict, Optional

from .models import MeijerItem


class ProductOperations:
    """Handles product operations for the Meijer client."""

    def __init__(self, client):
        """Initialize with a reference to the main client."""
        self.client = client
        self.logger = client.logger

    def get_product_detail(
        self, upc: str, store_id: Optional[str] = None
    ) -> Optional[MeijerItem]:
        """
        Get detailed product information by UPC.

        Args:
            upc: Product UPC/barcode
            store_id: Optional store ID for store-specific pricing

        Returns:
            MeijerItem with detailed product information, or None if not found
        """
        try:
            # Use Constructor.io search API for product details
            search_results = self.client.search_products(upc, results_per_page=1)

            if search_results and search_results.results:
                product = search_results.results[0]

                # If we have a store ID, try to get store-specific details
                if store_id and hasattr(self.client, "get_store_by_id"):
                    store = self.client.get_store_by_id(store_id)
                    if store:
                        self.logger.debug(
                            f"Found store {store.name} for product lookup"
                        )

                return product

            return None

        except Exception as e:
            self.logger.error(f"Error getting product detail for UPC {upc}: {e}")
            return None

    def _parse_product_detail_response(
        self, data: Dict[str, Any], upc: str
    ) -> MeijerItem:
        """Parse product detail response from API."""
        try:
            # Extract basic product information
            product_id = data.get("productId", upc)
            title = data.get("productName", data.get("title", "Unknown Product"))
            description = data.get("description", "")
            brand = data.get("brand", "")
            category = data.get("category", "")

            # Extract pricing information
            price = None
            sale_price = None
            if "price" in data:
                try:
                    price = float(data["price"])
                except (ValueError, TypeError):
                    pass

            if "salePrice" in data:
                try:
                    sale_price = float(data["salePrice"])
                except (ValueError, TypeError):
                    pass

            # Extract image URLs
            image_url = data.get("imageUrl", "")
            large_image_url = data.get("largeImageUrl", "")

            # Create MeijerItem
            item = MeijerItem(
                id=str(product_id),
                title=title,
                description=description,
                brand=brand,
                category=category,
                upc=upc,
                price=price,
                sale_price=sale_price,
                image_url=image_url,
                large_image_url=large_image_url,
                raw_data=data,
            )

            # Extract location information if available
            location_info = self._extract_location_from_product_detail(data)
            if location_info:
                item.aisle_primary = location_info.get("aisle")
                if location_info.get("section"):
                    item.aisle_locations.append(
                        f"{location_info['aisle']} {location_info['section']}"
                    )

            return item

        except Exception as e:
            self.logger.error(f"Error parsing product detail response: {e}")
            # Return a basic item with minimal information
            return MeijerItem(id=upc, title="Unknown Product", upc=upc, raw_data=data)

    def _extract_location_from_product_detail(
        self, data: Dict[str, Any]
    ) -> Optional[Dict[str, str]]:
        """Extract aisle location information from product detail response."""
        try:
            # Look for location fields in the response
            location_fields = [
                "aisle",
                "section",
                "bay",
                "location",
                "aisleLocation",
                "storeLocation",
                "productLocation",
                "itemLocation",
            ]

            location_info = {}

            for field in location_fields:
                if field in data and data[field]:
                    value = str(data[field]).strip()
                    if value and value.lower() not in ["null", "none", ""]:
                        location_info[field] = value

            # If we found location data, parse it
            if location_info:
                return self._parse_location_data(location_info)

            # Try to extract from text fields
            text_fields = ["description", "productName", "title", "notes"]
            for field in text_fields:
                if field in data and data[field]:
                    text = str(data[field])
                    extracted = self._extract_location_from_text(text)
                    if extracted:
                        return extracted

            return None

        except Exception as e:
            self.logger.debug(f"Error extracting location from product detail: {e}")
            return None

    def _parse_location_data(self, location_data: Dict[str, str]) -> Dict[str, str]:
        """Parse location data into standardized format."""
        result = {}

        # Extract aisle information
        if "aisle" in location_data:
            result["aisle"] = location_data["aisle"]
        elif "aisleLocation" in location_data:
            result["aisle"] = location_data["aisleLocation"]

        # Extract section information
        if "section" in location_data:
            result["section"] = location_data["section"]
        elif "bay" in location_data:
            result["section"] = location_data["bay"]

        # Extract bay information
        if "bay" in location_data and "section" not in result:
            result["bay"] = location_data["bay"]

        return result

    def _parse_ilc_location(self, ilc_string: str) -> Optional[Dict[str, str]]:
        """Parse ILC (Item Location Code) string format."""
        try:
            if not ilc_string or not isinstance(ilc_string, str):
                return None

            # Common ILC patterns: "A1-B2-C3", "A1B2C3", "A1 B2 C3"
            ilc = ilc_string.strip().upper()

            # Remove common separators
            ilc = re.sub(r"[-\s_]+", "", ilc)

            # Try to extract aisle, section, bay
            # Pattern: Letter + Number + Letter + Number + Letter + Number
            match = re.match(r"([A-Z])(\d+)([A-Z])(\d+)([A-Z])(\d+)", ilc)
            if match:
                return {
                    "aisle": f"{match.group(1)}{match.group(2)}",
                    "section": f"{match.group(3)}{match.group(4)}",
                    "bay": f"{match.group(5)}{match.group(6)}",
                }

            # Pattern: Letter + Number + Letter + Number
            match = re.match(r"([A-Z])(\d+)([A-Z])(\d+)", ilc)
            if match:
                return {
                    "aisle": f"{match.group(1)}{match.group(2)}",
                    "section": f"{match.group(3)}{match.group(4)}",
                }

            # Pattern: Letter + Number
            match = re.match(r"([A-Z])(\d+)", ilc)
            if match:
                return {"aisle": f"{match.group(1)}{match.group(2)}"}

            return None

        except Exception as e:
            self.logger.debug(f"Error parsing ILC location '{ilc_string}': {e}")
            return None

    def _format_location_string(
        self, aisle: Optional[str], section: Optional[str], bay: Optional[str]
    ) -> str:
        """Format location information into a readable string."""
        parts = []

        if aisle:
            parts.append(f"Aisle {aisle}")
        if section:
            parts.append(f"Section {section}")
        if bay:
            parts.append(f"Bay {bay}")

        if not parts:
            return "Location unknown"

        return " - ".join(parts)

    def _extract_location_from_text(self, text: str) -> Optional[Dict[str, str]]:
        """Extract location information from text using regex patterns."""
        try:
            if not text or not isinstance(text, str):
                return None

            text = text.upper()

            # Look for aisle patterns: "Aisle A1", "A1", "Aisle 1"
            aisle_match = re.search(r"AISLE\s*([A-Z]?\d+)", text)
            if aisle_match:
                aisle = aisle_match.group(1)

                # Look for section patterns: "Section B2", "B2", "Section 2"
                section_match = re.search(r"SECTION\s*([A-Z]?\d+)", text)
                section = section_match.group(1) if section_match else None

                # Look for bay patterns: "Bay C3", "C3", "Bay 3"
                bay_match = re.search(r"BAY\s*([A-Z]?\d+)", text)
                bay = bay_match.group(1) if bay_match else None

                return {"aisle": aisle, "section": section, "bay": bay}

            # Look for general location patterns: "A1-B2-C3"
            location_match = re.search(
                r"([A-Z]\d+)[-\s]+([A-Z]\d+)[-\s]+([A-Z]\d+)", text
            )
            if location_match:
                return {
                    "aisle": location_match.group(1),
                    "section": location_match.group(2),
                    "bay": location_match.group(3),
                }

            return None

        except Exception as e:
            self.logger.debug(f"Error extracting location from text: {e}")
            return None
