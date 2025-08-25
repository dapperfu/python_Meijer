"""
Product Operations for Meijer API Client
========================================

This module contains the product-related operations that were moved from the main client
to reduce file size and improve organization.
"""

import re
from typing import Any, Dict, Optional, List, Union
from dataclasses import dataclass, field
from datetime import datetime

from .models import MeijerItem


@dataclass
class EnhancedProductInfo:
    """Enhanced product information with rich data."""
    
    product_code: str
    """Product identifier (UPC, SKU, etc.)"""
    
    name: str
    """Product name"""
    
    description: Optional[str] = None
    """Product description"""
    
    brand: Optional[str] = None
    """Product brand"""
    
    category: Optional[str] = None
    """Product category"""
    
    subcategory: Optional[str] = None
    """Product subcategory"""
    
    price: Optional[float] = None
    """Current price"""
    
    original_price: Optional[float] = None
    """Original price if on sale"""
    
    is_on_sale: bool = False
    """Whether the product is on sale"""
    
    discount_percentage: Optional[float] = None
    """Discount percentage if on sale"""
    
    unit_price: Optional[float] = None
    """Price per unit (e.g., per ounce, per pound)"""
    
    unit: str = "each"
    """Unit of measurement"""
    
    image_urls: List[str] = field(default_factory=list)
    """Product image URLs"""
    
    nutritional_info: Optional[Dict[str, Any]] = None
    """Nutritional information"""
    
    ingredients: List[str] = field(default_factory=list)
    """Product ingredients"""
    
    allergens: List[str] = field(default_factory=list)
    """Allergen information"""
    
    dietary_info: List[str] = field(default_factory=list)
    """Dietary information (organic, gluten-free, etc.)"""
    
    storage_instructions: Optional[str] = None
    """Storage instructions"""
    
    preparation_instructions: Optional[str] = None
    """Preparation instructions"""
    
    serving_size: Optional[str] = None
    """Serving size information"""
    
    servings_per_container: Optional[int] = None
    """Number of servings per container"""
    
    weight: Optional[float] = None
    """Product weight"""
    
    weight_unit: Optional[str] = None
    """Weight unit (oz, lb, g, kg)"""
    
    dimensions: Optional[Dict[str, float]] = None
    """Product dimensions (length, width, height)"""
    
    is_available: bool = True
    """Whether the product is currently available"""
    
    availability_status: Optional[str] = None
    """Detailed availability status"""
    
    store_availability: Dict[str, bool] = field(default_factory=dict)
    """Availability by store"""
    
    rating: Optional[float] = None
    """Product rating (1-5 stars)"""
    
    review_count: Optional[int] = None
    """Number of reviews"""
    
    reviews: List[Dict[str, Any]] = field(default_factory=list)
    """Product reviews"""
    
    related_products: List[str] = field(default_factory=list)
    """Related product codes"""
    
    tags: List[str] = field(default_factory=list)
    """Product tags and labels"""
    
    last_updated: datetime = field(default_factory=datetime.now)
    """When product information was last updated"""


class ProductOperations:
    """Handles product operations for the Meijer client."""

    def __init__(self, client):
        """Initialize with a reference to the main client."""
        self.client = client
        self.logger = client.logger
        
        # Enhanced product info endpoints
        self.enhanced_endpoints = {
            "get_enhanced_product_info": "/edaa/product/productinfo/v1/item",
            "get_product_variants": "/edaa/product/productinfo/v1/item/{productCode}/variants",
            "get_product_reviews": "/edaa/product/productinfo/v1/item/{productCode}/reviews",
            "get_product_availability": "/edaa/product/productinfo/v1/item/{productCode}/availability",
        }

    def get_enhanced_product_info(self, 
                                product_code: str,
                                store_id: Optional[str] = None,
                                include_reviews: bool = False,
                                include_variants: bool = False) -> Optional[EnhancedProductInfo]:
        """
        Get enhanced product information using the EDAA product info endpoint.
        
        This endpoint provides rich product data including nutritional information,
        ingredients, allergens, and detailed availability.
        
        Parameters
        ----------
        product_code : str
            Product identifier (UPC, SKU, etc.)
        store_id : Optional[str], default=None
            Store identifier for store-specific information
        include_reviews : bool, default=False
            Whether to include product reviews
        include_variants : bool, default=False
            Whether to include product variants
        
        Returns
        -------
        Optional[EnhancedProductInfo]
            Enhanced product information or None if not found
        
        Raises
        ------
        Exception
            If there's an error retrieving product information
        """
        try:
            endpoint = self.enhanced_endpoints["get_enhanced_product_info"]
            
            # Prepare request data
            data = {
                "productCode": product_code,
                "includeReviews": include_reviews,
                "includeVariants": include_variants
            }
            
            if store_id:
                data["storeId"] = store_id
            
            # Make POST request to get enhanced product info
            response = self.client._make_request("POST", endpoint, json=data)
            
            if response:
                return self._parse_enhanced_product_info_response(response)
            
            return None
            
        except Exception as e:
            self.logger.error(f"Error getting enhanced product info for {product_code}: {e}")
            return None
    
    def get_product_variants(self, product_code: str) -> List[EnhancedProductInfo]:
        """
        Get product variants for a specific product.
        
        Parameters
        ----------
        product_code : str
            Product identifier
        
        Returns
        -------
        List[EnhancedProductInfo]
            List of product variants
        """
        try:
            endpoint = self.enhanced_endpoints["get_product_variants"].format(
                productCode=product_code
            )
            
            response = self.client._make_request("GET", endpoint)
            
            if response and "variants" in response:
                variants = []
                for variant_data in response["variants"]:
                    variant = self._parse_enhanced_product_info_response(variant_data)
                    if variant:
                        variants.append(variant)
                return variants
            
            return []
            
        except Exception as e:
            self.logger.error(f"Error getting product variants for {product_code}: {e}")
            return []
    
    def get_product_reviews(self, 
                           product_code: str,
                           page: int = 1,
                           page_size: int = 10,
                           sort_by: str = "date") -> Dict[str, Any]:
        """
        Get product reviews.
        
        Parameters
        ----------
        product_code : str
            Product identifier
        page : int, default=1
            Page number
        page_size : int, default=10
            Reviews per page
        sort_by : str, default="date"
            Sort order (date, rating, helpfulness)
        
        Returns
        -------
        Dict[str, Any]
            Reviews with pagination information
        """
        try:
            endpoint = self.enhanced_endpoints["get_product_reviews"].format(
                productCode=product_code
            )
            
            params = {
                "page": page,
                "pageSize": page_size,
                "sortBy": sort_by
            }
            
            response = self.client._make_request("GET", endpoint, params=params)
            return response or {}
            
        except Exception as e:
            self.logger.error(f"Error getting product reviews for {product_code}: {e}")
            return {}
    
    def get_product_availability(self, 
                               product_code: str,
                               store_ids: Optional[List[str]] = None) -> Dict[str, Any]:
        """
        Get detailed product availability information.
        
        Parameters
        ----------
        product_code : str
            Product identifier
        store_ids : Optional[List[str]], default=None
            List of store IDs to check availability for
        
        Returns
        -------
        Dict[str, Any]
            Product availability information
        """
        try:
            endpoint = self.enhanced_endpoints["get_product_availability"].format(
                productCode=product_code
            )
            
            params = {}
            if store_ids:
                params["storeIds"] = ",".join(store_ids)
            
            response = self.client._make_request("GET", endpoint, params=params)
            return response or {}
            
        except Exception as e:
            self.logger.error(f"Error getting product availability for {product_code}: {e}")
            return {}
    
    def _parse_enhanced_product_info_response(self, response: Dict[str, Any]) -> Optional[EnhancedProductInfo]:
        """Parse enhanced product info response."""
        try:
            if not response:
                return None
            
            # Extract basic product information
            product_info = EnhancedProductInfo(
                product_code=response.get("productCode", ""),
                name=response.get("productName", ""),
                description=response.get("description"),
                brand=response.get("brand"),
                category=response.get("category"),
                subcategory=response.get("subcategory"),
                price=response.get("currentPrice"),
                original_price=response.get("originalPrice"),
                is_on_sale=response.get("onSale", False),
                discount_percentage=response.get("discountPercentage"),
                unit_price=response.get("unitPrice"),
                unit=response.get("unit", "each"),
                image_urls=response.get("imageUrls", []),
                nutritional_info=response.get("nutritionalInfo"),
                ingredients=response.get("ingredients", []),
                allergens=response.get("allergens", []),
                dietary_info=response.get("dietaryInfo", []),
                storage_instructions=response.get("storageInstructions"),
                preparation_instructions=response.get("preparationInstructions"),
                serving_size=response.get("servingSize"),
                servings_per_container=response.get("servingsPerContainer"),
                weight=response.get("weight"),
                weight_unit=response.get("weightUnit"),
                dimensions=response.get("dimensions"),
                is_available=response.get("available", True),
                availability_status=response.get("availabilityStatus"),
                store_availability=response.get("storeAvailability", {}),
                rating=response.get("rating"),
                review_count=response.get("reviewCount"),
                reviews=response.get("reviews", []),
                related_products=response.get("relatedProducts", []),
                tags=response.get("tags", []),
                last_updated=self._parse_datetime(response.get("lastUpdated"))
            )
            
            return product_info
            
        except Exception as e:
            self.logger.error(f"Error parsing enhanced product info: {e}")
            return None
    
    def _parse_datetime(self, datetime_str: Optional[str]) -> Optional[datetime]:
        """Parse datetime string safely."""
        if not datetime_str:
            return None
        
        try:
            return datetime.fromisoformat(datetime_str)
        except ValueError:
            return None

    def get_product_detail(
        self, upc: str, store_id: Optional[Union[str, int]] = None
    ) -> Optional[MeijerItem]:
        """
        Get detailed product information by UPC including store location.

        Args:
            upc: Product UPC/barcode
            store_id: Optional store ID for store-specific pricing and location (accepts string or integer)

        Returns:
            MeijerItem with detailed product information, or None if not found
        """
        try:
            # Normalize store_id to string format
            store_id_str = str(store_id) if store_id else None
            
            # First try to get product detail from Meijer's product detail API
            # This should contain actual aisle location information
            product_detail = self._get_product_detail_from_api(upc, store_id_str)

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
                if store_id_str and hasattr(self.client, "get_store_by_id"):
                    store = self.client.get_store_by_id(store_id_str)
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
        self, upc: str, store_id: Optional[Union[str, int]] = None
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
                # Normalize store_id to string format
                store_id_str = str(store_id)
                params["store"] = store_id_str

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
