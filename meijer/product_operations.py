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
        Get detailed product information by UPC including store location.

        Args:
            upc: Product UPC/barcode
            store_id: Optional store ID for store-specific pricing and location

        Returns:
            MeijerItem with detailed product information, or None if not found
        """
        try:
            # First try to get product detail from Meijer's product detail API
            # This should contain actual aisle location information
            product_detail = self._get_product_detail_from_api(upc, store_id)

            if product_detail and product_detail.aisle_primary:
                # We have real location data from the API
                self.logger.info(
                    f"✅ Got real aisle data for UPC {upc}: {product_detail.aisle_primary}"
                )
                return product_detail

            # Fallback: try Constructor.io search API
            self.logger.debug(f"Falling back to search API for UPC {upc}")
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

    def _get_product_detail_from_api(
        self, upc: str, store_id: Optional[str] = None
    ) -> Optional[MeijerItem]:
        """
        Get product detail from Meijer's product detail API endpoint.

        This should provide actual aisle location information including ilcPrimary.
        """
        try:
            # Use the correct Meijer product detail endpoint that provides ilcPrimary
            endpoint = f"{self.client.api_base_url}/digital/occ/v3/products/{upc}"

            headers = {
                "accept": "application/json",
                "user-agent": "Meijer/102700000 okhttp/5.1.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)",
            }

            # Add subscription key if available
            if (
                hasattr(self.client, "subscription_key")
                and self.client.subscription_key
            ):
                headers["ocp-apim-subscription-key"] = self.client.subscription_key

            # Add authorization if available
            if hasattr(self.client, "_access_token") and self.client._access_token:
                headers["authorization"] = f"Bearer {self.client._access_token}"

            params = {"fields": "FULL", "pageName": "pdp_app"}

            if store_id:
                params["store"] = store_id

            self.logger.debug(f"Trying Meijer product detail endpoint: {endpoint}")
            response = self.client._make_request(
                "GET", endpoint, headers=headers, params=params
            )

            if response.status_code == 200:
                data = response.json()
                self.logger.debug(
                    f"Product detail API response keys: {list(data.keys())}"
                )

                # Check if we have stock information with ilcPrimary
                if "stock" in data and "ilcPrimary" in data["stock"]:
                    ilc_primary = data["stock"]["ilcPrimary"]
                    self.logger.info(f"✅ Found ilcPrimary location: {ilc_primary}")

                    # Parse the response and look for location information
                    product = self._parse_product_detail_response(data, upc)
                    if product:
                        return product
                else:
                    self.logger.debug("No ilcPrimary found in product detail response")

            # If the main endpoint failed or no ilcPrimary, try fallback endpoints
            fallback_endpoints = [
                f"{self.client.api_base_url}/products/{upc}",
                f"{self.client.api_base_url}/product/{upc}",
                f"{self.client.api_base_url}/catalog/product/{upc}",
                f"{self.client.api_base_url}/productDetail/{upc}",
            ]

            for fallback_endpoint in fallback_endpoints:
                try:
                    self.logger.debug(f"Trying fallback endpoint: {fallback_endpoint}")
                    response = self.client._make_request(
                        "GET", fallback_endpoint, headers=headers, params=params
                    )

                    if response.status_code == 200:
                        data = response.json()
                        self.logger.debug(
                            f"Fallback endpoint response keys: {list(data.keys())}"
                        )

                        # Parse the response and look for location information
                        product = self._parse_product_detail_response(data, upc)
                        if product:
                            return product

                except Exception as e:
                    self.logger.debug(
                        f"Fallback endpoint {fallback_endpoint} failed: {e}"
                    )
                    continue

            # If no endpoints worked, try the Shop & Scan lookup which might have location data
            if hasattr(self.client, "shop_scan"):
                try:
                    shop_scan_item = self.client.shop_scan.lookup_barcode_price(
                        upc, store_id
                    )
                    if shop_scan_item:
                        self.logger.debug("Got product from Shop & Scan API")
                        return shop_scan_item
                except Exception as e:
                    self.logger.debug(f"Shop & Scan lookup failed: {e}")

            return None

        except Exception as e:
            self.logger.error(f"Error in product detail API call: {e}")
            return None

    def _parse_product_detail_response(
        self, data: Dict[str, Any], upc: str
    ) -> MeijerItem:
        """Parse product detail response from API."""
        try:
            # Extract basic product information
            product_id = data.get("productId", upc)
            title = data.get(
                "name", data.get("productName", data.get("title", "Unknown Product"))
            )
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
                # Store section and bay separately for proper location handling
                if location_info.get("section"):
                    item.section = location_info.get("section")
                if location_info.get("bay"):
                    item.bay = location_info.get("bay")

            return item

        except Exception as e:
            self.logger.error(f"Error parsing product detail response: {e}")
            # Return a basic item with minimal information
            return MeijerItem(id=upc, title="Unknown Product", upc=upc, raw_data=data)

    def _extract_location_from_product_detail(
        self, data: Dict[str, Any]
    ) -> Optional[Dict[str, str]]:
        """
        Extract location information from product detail response.

        Looks for aisle, section, and bay information in various possible field names.
        """
        try:
            location_info = {}

            # First check for Meijer's ilcPrimary field in stock data
            if "stock" in data and isinstance(data["stock"], dict):
                stock_data = data["stock"]

                # Extract ilcPrimary (e.g., "B-15-44-7")
                if "ilcPrimary" in stock_data and stock_data["ilcPrimary"]:
                    ilc_primary = str(stock_data["ilcPrimary"]).strip()
                    self.logger.debug(f"Found ilcPrimary: {ilc_primary}")

                    # Parse ilcPrimary format: "B-15-44-7" -> aisle: "B15", section: "44", bay: "7"
                    if "-" in ilc_primary:
                        parts = ilc_primary.split("-")
                        if len(parts) >= 2:
                            # First part is aisle letter (e.g., "B")
                            aisle_letter = parts[0]
                            # Second part is aisle number (e.g., "15")
                            aisle_number = parts[1]

                            # Combine aisle letter and number to form aisle (e.g., "B15")
                            location_info["aisle"] = f"{aisle_letter}{aisle_number}"

                            # Third part is section (e.g., "44")
                            if len(parts) > 2:
                                location_info["section"] = parts[2]

                            # Fourth part is bay (e.g., "7")
                            if len(parts) > 3:
                                location_info["bay"] = parts[3]

                    if location_info:
                        self.logger.debug(
                            f"Extracted location from ilcPrimary: {location_info}"
                        )
                        return location_info

            # Try to find aisle information in various possible field names
            aisle_fields = [
                "aisle",
                "aisleLocation",
                "aisle_location",
                "aisleLocationCode",
                "storeAisle",
                "productAisle",
                "itemAisle",
                "locationAisle",
                "ilcPrimary",
                "ilc_primary",
                "primaryAisle",
                "primary_aisle",
            ]

            for field in aisle_fields:
                if field in data and data[field]:
                    location_info["aisle"] = str(data[field]).strip()
                    break

            # Try to find section information
            section_fields = [
                "section",
                "sectionLocation",
                "section_location",
                "sectionCode",
                "storeSection",
                "productSection",
                "itemSection",
                "locationSection",
                "ilcSecondary",
                "ilc_secondary",
                "secondaryLocation",
                "secondary_location",
            ]

            for field in section_fields:
                if field in data and data[field]:
                    location_info["section"] = str(data[field]).strip()
                    break

            # Try to find bay information
            bay_fields = [
                "bay",
                "bayLocation",
                "bay_location",
                "bayCode",
                "storeBay",
                "productBay",
                "itemBay",
                "locationBay",
                "ilcTertiary",
                "ilc_tertiary",
                "tertiaryLocation",
                "tertiary_location",
            ]

            for field in bay_fields:
                if field in data and data[field]:
                    location_info["bay"] = str(data[field]).strip()
                    break

            # If we found any location information, return it
            if location_info:
                self.logger.debug(f"Extracted location info: {location_info}")
                return location_info

            # Try to extract location from text fields that might contain location info
            text_fields = [
                "location",
                "storeLocation",
                "productLocation",
                "itemLocation",
                "description",
                "longDescription",
                "locationDescription",
            ]

            for field in text_fields:
                if field in data and data[field]:
                    text_value = str(data[field])
                    # Look for location patterns in the text
                    extracted_location = self._extract_location_from_text(text_value)
                    if extracted_location:
                        self.logger.debug(
                            f"Extracted location from {field}: {extracted_location}"
                        )
                        return extracted_location

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
