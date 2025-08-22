"""
Shop & Scan functionality for Meijer API.

This module provides methods for looking up product information by barcode
and managing Shop & Scan functionality with BOGO detection and enhanced workflow management.
"""

import json
import logging
from typing import TYPE_CHECKING, Any, Dict, List, Optional, Tuple, Union

if TYPE_CHECKING:
    from .client import Meijer

from .models import MeijerItem
from .exceptions import ShopScanError


class ShopNScan:
    """Handles Shop & Scan functionality for Meijer API with BOGO detection."""

    def __init__(self, meijer_client: "Meijer"):
        self.meijer = meijer_client
        self.logger = self.meijer.logger

        # Enhanced endpoints from APK analysis and mitmproxy logs
        self.endpoints = {
            "lookup_item": "/loyalty/shopandscan/lookupitem",
            "add_to_cart": "/loyalty/shopandscan/addtocart",
            "remove_from_cart": "/loyalty/shopandscan/removefromcart",
            "get_cart": "/loyalty/shopandscan/getcart",
            "clear_cart": "/loyalty/shopandscan/clearcart",
            "start_transaction": "/retail/shopandscan/api/v1/NextGenPOSBasket",
            "get_transaction": "/retail/shopandscan/api/v1/NextGenPOSBasket",
            "update_transaction": "/retail/shopandscan/api/v1/NextGenPOSBasket",
            "complete_transaction": "/retail/shopandscan/api/v1/NextGenPOSBasket/complete",
        }

        # Alternative endpoints from older implementations
        self.alternative_endpoints = {
            "lookup_item": "/dgtlmma/shopandscan/item/scan",
            "add_to_cart": "/dgtlmma/shopandscan/cart/add",
            "remove_from_cart": "/dgtlmma/shopandscan/cart/remove",
            "get_cart": "/dgtlmma/shopandscan/cart",
            "clear_cart": "/dgtlmma/shopandscan/cart/clear",
        }

        # BOGO detection patterns from mitmproxy analysis
        self.bogo_patterns = {
            "quantity_thresholds": [2, 4, 6, 8, 10],  # Common BOGO thresholds
            "price_drop_patterns": [0.25, 0.40, 0.50, 0.75],  # Common BOGO percentages
            "scan_sequence": ["single", "double", "multiple"]  # Scan patterns
        }

    def lookup_barcode_price(
        self, barcode: str, store_id: Optional[str] = None
    ) -> Optional[MeijerItem]:
        """
        Look up product information by barcode.

        Args:
            barcode: The barcode/UPC to look up
            store_id: Optional store ID for store-specific pricing

        Returns:
            MeijerItem if found, None otherwise
        """
        # First try the actual Shop & Scan API endpoint
        result = self._lookup_barcode_shopscan(barcode, store_id)
        if result:
            return result

        self.logger.info(f"Shop & Scan failed, trying search API for barcode {barcode}")

        # Then try direct Constructor.io search
        result = self._search_by_barcode_direct(barcode)
        if result:
            return result

        self.logger.info(
            f"Direct Constructor.io search failed, trying fallback product name search for barcode {barcode}"
        )
        return self._search_by_product_name_fallback(barcode)

    def _lookup_barcode_shopscan(
        self, barcode: str, store_id: Optional[str] = None
    ) -> Optional[MeijerItem]:
        """
        Try to look up barcode using the actual Shop & Scan API endpoints.

        Based on APK analysis, this should use the actual endpoints from the decompiled source.
        """
        # Try multiple potential Shop & Scan endpoints based on APK analysis
        endpoints_to_try = [
            # GET with barcode in path
            f"{self.endpoints['lookup_item']}/{barcode}",
            # GET with barcode as query parameter
            f"{self.endpoints['lookup_item']}?barcode={barcode}",
            # POST with barcode in body
            self.endpoints["lookup_item"],
        ]

        for endpoint in endpoints_to_try:
            try:
                if endpoint == self.endpoints["lookup_item"]:
                    # POST request with barcode in body
                    data = {"barcode": barcode}
                    if store_id:
                        data["storeId"] = store_id

                    response = self.meijer._make_request(
                        "POST", f"{self.meijer.api_base_url}{endpoint}", json_data=data
                    )
                else:
                    # GET request
                    params = {}
                    if store_id:
                        params["storeId"] = store_id

                    response = self.meijer._make_request(
                        "GET", f"{self.meijer.api_base_url}{endpoint}", params=params
                    )

                if response.status_code == 200:
                    data = response.json()
                    return self._parse_shopscan_response(data, barcode)
                elif response.status_code == 404:
                    self.logger.debug(
                        f"Shop & Scan endpoint {endpoint} returned 404 for barcode {barcode}"
                    )
                    continue
                else:
                    self.logger.warning(
                        f"Shop & Scan endpoint {endpoint} returned {response.status_code} for barcode {barcode}"
                    )

            except Exception as e:
                self.logger.debug(f"Error trying Shop & Scan endpoint {endpoint}: {e}")
                continue

        self.logger.info(f"All Shop & Scan endpoints failed for barcode {barcode}")
        return None

    def _search_by_barcode_direct(self, barcode: str) -> Optional[MeijerItem]:
        """
        Search for product by barcode using Constructor.io search API.

        This is the fallback when Shop & Scan API fails.
        """
        try:
            # Use the actual API key from APK analysis
            constructor_base_url = "https://ac.cnstrc.com"
            url = f"{constructor_base_url}/search/{barcode}"
            api_key = "key_GdYuTcnduTUtsZd6"  # Valid key from APK analysis

            params = {
                "key": api_key,
                "num_results_per_page": 10,  # Correct parameter name from APK analysis
                "page": 1,
                "fmt_options[groups_max_depth]": 2,
                "fmt_options[groups_start]": "current",
            }

            response = self.meijer._make_request("GET", url, params=params)

            if response.status_code == 200:
                data = response.json()
                # Correct response structure based on APK analysis
                response_data = data.get("response", {})
                results = response_data.get("results", [])
                total_results = response_data.get("total_num_results", 0)

                if total_results > 0 and results:
                    # Find exact barcode match
                    exact_match = None
                    for item in results:
                        item_data = item.get("data", {})
                        if item_data.get("ean") == barcode:
                            exact_match = item
                            break

                    if exact_match:
                        item_data = exact_match.get("data", {})
                        value = exact_match.get("value", "")

                        # Create MeijerItem with proper field mapping
                        return MeijerItem(
                            id=item_data.get("id", str(exact_match.get("id", ""))),
                            title=value
                            or item_data.get("description", "Unknown Product"),
                            description=item_data.get("description"),
                            brand=item_data.get("brand"),
                            category=item_data.get("category"),
                            upc=item_data.get("ean"),
                            sku=item_data.get("id"),
                            image_url=item_data.get("image_url"),
                            price=item_data.get("price"),
                            unit_price=item_data.get("price"),
                            is_weighted=item_data.get("priceByWeight", False),
                            raw_data=exact_match,
                        )

            return None

        except Exception as e:
            self.logger.error(f"Constructor.io API failed: {e}")
            return None

    def _search_by_product_name_fallback(self, barcode: str) -> Optional[MeijerItem]:
        """
        Fallback search using product name mappings for known barcodes.

        This is used when direct barcode search fails.
        """
        # Product name mappings for common barcodes (from APK analysis)
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
        if not product_name:
            return None

        try:
            # Search Constructor.io with product name
            constructor_base_url = "https://ac.cnstrc.com"
            url = f"{constructor_base_url}/search/{product_name}"
            api_key = "key_GdYuTcnduTUtsZd6"

            params = {
                "key": api_key,
                "num_results_per_page": 5,
                "page": 1,
                "fmt_options[groups_max_depth]": 2,
                "fmt_options[groups_start]": "current",
            }

            response = self.meijer._make_request("GET", url, params=params)

            if response.status_code == 200:
                data = response.json()
                response_data = data.get("response", {})
                results = response_data.get("results", [])

                if results:
                    # Take the first result as the best match
                    item = results[0]
                    item_data = item.get("data", {})
                    value = item.get("value", "")

                    return MeijerItem(
                        id=item_data.get("id", str(item.get("id", ""))),
                        title=value or item_data.get("description", "Unknown Product"),
                        description=item_data.get("description"),
                        brand=item_data.get("brand"),
                        category=item_data.get("category"),
                        upc=barcode,  # Use the original barcode
                        sku=item_data.get("id"),
                        image_url=item_data.get("image_url"),
                        price=item_data.get("price"),
                        unit_price=item_data.get("price"),
                        is_weighted=item_data.get("priceByWeight", False),
                        raw_data=item,
                    )

            return None

        except Exception as e:
            self.logger.error(f"Fallback product name search failed: {e}")
            return None

    def _parse_shopscan_response(
        self, data: Dict[str, Any], barcode: str
    ) -> Optional[MeijerItem]:
        """
        Parse Shop & Scan API response into MeijerItem.

        This method handles the actual API response structure from the Shop & Scan endpoints.
        """
        try:
            # Extract product information from Shop & Scan response
            # Structure based on APK analysis
            product_data = data.get("product", {})
            if not product_data:
                return None

            return MeijerItem(
                id=product_data.get("id", ""),
                title=product_data.get("name", product_data.get("title", "")),
                description=product_data.get("description"),
                brand=product_data.get("brand"),
                category=product_data.get("category"),
                subcategory=product_data.get("subcategory"),
                upc=barcode,
                sku=product_data.get("sku"),
                image_url=product_data.get("imageUrl"),
                large_image_url=product_data.get("largeImageUrl"),
                price=product_data.get("price"),
                sale_price=product_data.get("salePrice"),
                unit_price=str(product_data.get("unitPrice"))
                if product_data.get("unitPrice")
                else None,
                is_weighted=product_data.get("isWeighted", False),
                weight_unit=product_data.get("weightUnit"),
                weight_amount=product_data.get("weightAmount"),
                is_available=product_data.get("isAvailable", True),
                store_id=product_data.get("storeId"),
                department_id=product_data.get("departmentId"),
                sub_department_id=product_data.get("subDepartmentId"),
                tags=product_data.get("tags", []),
                raw_data=data,
            )

        except Exception as e:
            self.logger.error(f"Error parsing Shop & Scan response: {e}")
            return None

    def bulk_lookup_barcodes(
        self, barcodes: List[str], store_id: Optional[str] = None
    ) -> Dict[str, Optional[MeijerItem]]:
        """
        Look up multiple barcodes at once.

        Args:
            barcodes: List of barcodes to look up
            store_id: Optional store ID for store-specific pricing

        Returns:
            Dictionary mapping barcodes to MeijerItem objects (or None if not found)
        """
        results = {}
        for barcode in barcodes:
            results[barcode] = self.lookup_barcode_price(barcode, store_id)
        return results

    def add_to_cart(
        self, barcode: str, quantity: int = 1, store_id: Optional[str] = None
    ) -> bool:
        """
        Add a product to the Shop & Scan cart.

        Args:
            barcode: The barcode of the product to add
            quantity: Quantity to add
            store_id: Optional store ID

        Returns:
            True if successful, False otherwise
        """
        try:
            data = {"barcode": barcode, "quantity": quantity}
            if store_id:
                data["storeId"] = store_id

            response = self.meijer._make_request(
                "POST",
                f"{self.meijer.api_base_url}{self.endpoints['add_to_cart']}",
                json_data=data,
            )
            return response.status_code in [200, 201]

        except Exception as e:
            self.logger.error(f"Error adding to cart: {e}")
            return False

    def remove_from_cart(self, barcode: str, store_id: Optional[str] = None) -> bool:
        """
        Remove a product from the Shop & Scan cart.

        Args:
            barcode: The barcode of the product to remove
            store_id: Optional store ID

        Returns:
            True if successful, False otherwise
        """
        try:
            data = {"barcode": barcode}
            if store_id:
                data["storeId"] = store_id

            response = self.meijer._make_request(
                "POST",
                f"{self.meijer.api_base_url}{self.endpoints['remove_from_cart']}",
                json_data=data,
            )
            return response.status_code in [200, 204]

        except Exception as e:
            self.logger.error(f"Error removing from cart: {e}")
            return False

    def get_cart(self, store_id: Optional[str] = None) -> List[MeijerItem]:
        """
        Get the current Shop & Scan cart contents.

        Args:
            store_id: Optional store ID

        Returns:
            List of MeijerItem objects in the cart
        """
        try:
            params = {}
            if store_id:
                params["storeId"] = store_id

            response = self.meijer._make_request(
                "GET",
                f"{self.meijer.api_base_url}{self.endpoints['get_cart']}",
                params=params,
            )

            if response.status_code == 200:
                data = response.json()
                # Handle both direct items array and nested cart structure
                cart_items = data.get("items", [])
                if not cart_items and "cart" in data:
                    cart_items = data["cart"].get("items", [])

                items = []
                for item_data in cart_items:
                    item = self._parse_shopscan_response(
                        {"product": item_data}, item_data.get("barcode", "")
                    )
                    if item:
                        items.append(item)

                return items

            return []

        except Exception as e:
            self.logger.error(f"Error getting cart: {e}")
            return []

    def clear_cart(self, store_id: Optional[str] = None) -> bool:
        """
        Clear the Shop & Scan cart.

        Args:
            store_id: Optional store ID

        Returns:
            True if successful, False otherwise
        """
        try:
            params = {}
            if store_id:
                params["storeId"] = store_id

            response = self.meijer._make_request(
                "POST",
                f"{self.meijer.api_base_url}{self.endpoints['clear_cart']}",
                params=params,
            )
            return response.status_code in [200, 204]

        except Exception as e:
            self.logger.error(f"Error clearing cart: {e}")
            return False

    def _try_add_to_cart_with_endpoints(
        self,
        endpoints: Dict[str, str],
        barcode: str,
        quantity: int,
        store_id: Optional[str] = None,
    ) -> bool:
        """Try to add item to cart using specified endpoint set."""
        try:
            data = {"barcode": barcode, "quantity": quantity}
            if store_id:
                data["storeId"] = store_id

            response = self.meijer._make_request(
                "POST", endpoints["add_to_cart"], json_data=data
            )
            if response.status_code in [200, 201]:
                self.logger.info(
                    f"Successfully added {barcode} to cart using {endpoints['add_to_cart']}"
                )
                return True
            else:
                self.logger.warning(
                    f"Failed to add to cart using {endpoints['add_to_cart']}: {response.status_code}"
                )
                return False

        except Exception as e:
            self.logger.debug(
                f"Error adding to cart using {endpoints['add_to_cart']}: {e}"
            )
            return False

    def detect_bogo_opportunity(
        self, 
        barcode: str, 
        store_id: Optional[str] = None,
        test_quantities: Optional[List[int]] = None
    ) -> Dict[str, Any]:
        """
        Detect BOGO (Buy One Get One) opportunities for a product.
        
        This method scans the product multiple times to detect pricing drops
        that indicate BOGO deals.
        
        Args:
            barcode: The barcode/UPC to test for BOGO
            store_id: Optional store ID for store-specific pricing
            test_quantities: List of quantities to test (default: [1, 2, 10])
            
        Returns:
            Dictionary with BOGO analysis results
        """
        if test_quantities is None:
            test_quantities = [1, 2, 10]
        
        results = {
            "barcode": barcode,
            "bogo_detected": False,
            "bogo_type": None,
            "price_progression": [],
            "optimal_quantity": None,
            "savings_percentage": 0.0,
            "recommendation": None,
            "test_results": []
        }
        
        try:
            # Clear cart first to ensure clean testing
            self.clear_cart(store_id)
            
            # Test each quantity and track price changes
            previous_price = None
            price_drops = []
            
            for quantity in test_quantities:
                # Add items to cart
                success = self.add_to_cart(barcode, quantity, store_id)
                if not success:
                    self.logger.warning(f"Failed to add {quantity} of {barcode} to cart")
                    continue
                
                # Get cart total
                cart_data = self.get_cart_detailed(store_id)
                if not cart_data:
                    continue
                
                # Find our item in cart
                item = self._find_item_in_cart(cart_data, barcode)
                if not item:
                    continue
                
                current_price = item.get("totalPrice", {}).get("value", 0)
                unit_price = current_price / quantity if quantity > 0 else 0
                
                price_info = {
                    "quantity": quantity,
                    "total_price": current_price,
                    "unit_price": unit_price,
                    "price_per_item": current_price / quantity if quantity > 0 else 0
                }
                
                results["price_progression"].append(price_info)
                results["test_results"].append(price_info)
                
                # Check for price drops (BOGO indicators)
                if previous_price is not None and quantity > 1:
                    price_drop = previous_price - unit_price
                    price_drop_percentage = (price_drop / previous_price) * 100 if previous_price > 0 else 0
                    
                    if price_drop_percentage > 5:  # Significant price drop
                        price_drops.append({
                            "from_quantity": 1,
                            "to_quantity": quantity,
                            "price_drop": price_drop,
                            "price_drop_percentage": price_drop_percentage
                        })
                        
                        # Determine BOGO type
                        if price_drop_percentage >= 40:
                            bogo_type = "BOGO40"
                        elif price_drop_percentage >= 50:
                            bogo_type = "BOGO50"
                        elif price_drop_percentage >= 75:
                            bogo_type = "BOGO75"
                        else:
                            bogo_type = f"BOGO{int(price_drop_percentage)}"
                        
                        results["bogo_detected"] = True
                        results["bogo_type"] = bogo_type
                        results["savings_percentage"] = price_drop_percentage
                        results["optimal_quantity"] = quantity
                
                previous_price = unit_price
                
                # Clear cart for next test
                self.clear_cart(store_id)
            
            # Generate recommendation
            if results["bogo_detected"]:
                results["recommendation"] = (
                    f"BOGO detected! {results['bogo_type']} - "
                    f"Best value at {results['optimal_quantity']} items "
                    f"({results['savings_percentage']:.1f}% savings)"
                )
            else:
                results["recommendation"] = "No BOGO detected - standard pricing applies"
            
            return results
            
        except Exception as e:
            self.logger.error(f"Error detecting BOGO for {barcode}: {e}")
            results["error"] = str(e)
            return results

    def start_shop_n_scan_session(
        self, 
        store_id: str,
        device_id: Optional[str] = None,
        mperks_barcode: Optional[str] = None
    ) -> Dict[str, Any]:
        """
        Start a new Shop & Scan session.
        
        Based on the mitmproxy analysis, this creates a new transaction
        for Shop & Scan functionality.
        
        Args:
            store_id: Store ID for the session
            device_id: Optional device identifier
            mperks_barcode: Optional mPerks barcode
            
        Returns:
            Transaction object with session details
        """
        try:
            # Use the actual endpoint from mitmproxy analysis
            endpoint = f"{self.meijer.api_base_url}{self.endpoints['start_transaction']}"
            
            # Build transaction data based on actual API structure
            transaction_data = {
                "type": "START_TRANSACTION",
                "header": {
                    "transactionDateTime": self._get_current_datetime(),
                    "transactionDateTimeUTC": self._get_current_datetime_utc(),
                    "storeId": store_id,
                    "eventTimeStamp": self._get_current_datetime(),
                    "eventTimeStampUTC": self._get_current_datetime_utc(),
                    "deviceId": device_id or self._generate_device_id(),
                    "deviceOS": "Android",
                    "deviceAppVersion": "10.28.0",
                    "deviceOSVersion": "10"
                },
                "eventData": {
                    "barcodeType": "PDF_417",
                    "mPerksBarcode": mperks_barcode or "99999604317088389844",
                    "selectedHighValueOnly": True,
                    "rollDepositsInPrimary": True
                }
            }
            
            response = self.meijer._make_request(
                "POST", 
                endpoint, 
                json_data=transaction_data
            )
            
            if response.status_code == 200:
                data = response.json()
                return {
                    "success": True,
                    "transaction_id": data.get("transactionObject", {}).get("transactionHeader", {}).get("transactionId"),
                    "transaction_number": data.get("transactionObject", {}).get("transactionHeader", {}).get("transactionNumber"),
                    "cart_totals": data.get("transactionObject", {}).get("cartTotals", {}),
                    "raw_response": data
                }
            else:
                return {
                    "success": False,
                    "status_code": response.status_code,
                    "error": f"Failed to start session: {response.status_code}"
                }
                
        except Exception as e:
            self.logger.error(f"Error starting Shop & Scan session: {e}")
            return {
                "success": False,
                "error": str(e)
            }

    def scan_item_and_analyze(
        self, 
        barcode: str, 
        store_id: str,
        analyze_pricing: bool = True
    ) -> Dict[str, Any]:
        """
        Scan an item and perform comprehensive analysis.
        
        This method combines item lookup, cart addition, and pricing analysis
        to provide a complete picture of the product and any available deals.
        
        Args:
            barcode: The barcode to scan
            store_id: Store ID for the session
            analyze_pricing: Whether to perform BOGO analysis
            
        Returns:
            Comprehensive scan analysis results
        """
        results = {
            "barcode": barcode,
            "scan_success": False,
            "product_info": None,
            "pricing_analysis": None,
            "bogo_opportunity": None,
            "cart_status": None,
            "recommendations": []
        }
        
        try:
            # 1. Look up product information
            product = self.lookup_barcode_price(barcode, store_id)
            if product:
                results["product_info"] = {
                    "name": product.title,
                    "brand": product.brand,
                    "category": product.category,
                    "price": product.price,
                    "upc": product.upc,
                    "available": product.is_available
                }
                results["scan_success"] = True
            else:
                results["recommendations"].append("Product not found - check barcode")
                return results
            
            # 2. Add to cart for pricing analysis
            if analyze_pricing:
                cart_added = self.add_to_cart(barcode, 1, store_id)
                if cart_added:
                    # Get detailed cart information
                    cart_data = self.get_cart_detailed(store_id)
                    if cart_data:
                        results["cart_status"] = {
                            "items_count": len(cart_data.get("cartItems", [])),
                            "cart_total": cart_data.get("cartTotals", {}).get("cartNowTotal", 0),
                            "savings": cart_data.get("cartTotals", {}).get("cartSavingsTotal", 0)
                        }
                        
                        # Perform BOGO analysis
                        bogo_results = self.detect_bogo_opportunity(barcode, store_id)
                        results["bogo_opportunity"] = bogo_results
                        
                        if bogo_results.get("bogo_detected"):
                            results["recommendations"].append(bogo_results["recommendation"])
                        else:
                            results["recommendations"].append("No special pricing detected")
                    
                    # Clean up - remove item from cart
                    self.remove_from_cart(barcode, store_id)
            
            return results
            
        except Exception as e:
            self.logger.error(f"Error in comprehensive scan analysis: {e}")
            results["error"] = str(e)
            return results

    def get_cart_detailed(self, store_id: Optional[str] = None) -> Optional[Dict[str, Any]]:
        """
        Get detailed cart information including totals and pricing.
        
        This method provides comprehensive cart data for analysis.
        
        Args:
            store_id: Optional store ID
            
        Returns:
            Detailed cart data dictionary
        """
        try:
            # Try the enhanced cart endpoint first
            endpoint = f"{self.meijer.api_base_url}{self.endpoints['get_cart']}"
            
            params = {}
            if store_id:
                params["storeId"] = store_id
            
            response = self.meijer._make_request("GET", endpoint, params=params)
            
            if response.status_code == 200:
                return response.json()
            else:
                # Fallback to alternative endpoint
                return self._get_cart_fallback(store_id)
                
        except Exception as e:
            self.logger.error(f"Error getting detailed cart: {e}")
            return None

    def _get_cart_fallback(self, store_id: Optional[str] = None) -> Optional[Dict[str, Any]]:
        """Fallback method for getting cart data."""
        try:
            params = {}
            if store_id:
                params["storeId"] = store_id
            
            response = self.meijer._make_request(
                "GET",
                f"{self.meijer.api_base_url}{self.alternative_endpoints['get_cart']}",
                params=params
            )
            
            if response.status_code == 200:
                return response.json()
            return None
            
        except Exception as e:
            self.logger.error(f"Fallback cart retrieval failed: {e}")
            return None

    def _find_item_in_cart(self, cart_data: Dict[str, Any], barcode: str) -> Optional[Dict[str, Any]]:
        """Find a specific item in cart data by barcode."""
        cart_items = cart_data.get("cartItems", [])
        for item in cart_items:
            if item.get("upc") == barcode or item.get("scannedUpc") == barcode:
                return item
        return None

    def _get_current_datetime(self) -> str:
        """Get current datetime in the format expected by the API."""
        from datetime import datetime
        return datetime.now().strftime("%Y-%m-%dT%H:%M:%S")

    def _get_current_datetime_utc(self) -> str:
        """Get current UTC datetime in the format expected by the API."""
        from datetime import datetime, timezone
        return datetime.now(timezone.utc).strftime("%Y-%m-%dT%H:%M:%S-04:00")

    def _generate_device_id(self) -> str:
        """Generate a unique device ID for the session."""
        import uuid
        return str(uuid.uuid4())
