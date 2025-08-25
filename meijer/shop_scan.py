"""
Shop & Scan functionality for Meijer API.

This module provides methods for looking up product information by barcode
and managing Shop & Scan functionality with simplified BOGO detection (1 vs 2 items)
and enhanced workflow management.
"""

from typing import TYPE_CHECKING, Any, Dict, List, Optional

if TYPE_CHECKING:
    from .client import Meijer

from .models import MeijerItem


class ShopNScan:
    """Handles Shop & Scan functionality for Meijer API with simplified BOGO detection (1 vs 2 items)."""

    def __init__(self, meijer_client: "Meijer"):
        self.meijer = meijer_client
        self.logger = self.meijer.logger
        
        # Session management state
        self._session_active = False
        self._current_transaction_id = None
        self._current_store_id = None
        self._session_start_time = None

        # Enhanced endpoints from APK analysis and mitmproxy logs
        self.endpoints = {
            "lookup_item": "/retail/shopandscan/api/v1/NextGenPOSBasket",
            "add_to_cart": "/retail/shopandscan/api/v1/NextGenPOSBasket", 
            "remove_from_cart": "/retail/shopandscan/api/v1/NextGenPOSBasket",
            "get_cart": "/retail/shopandscan/api/v1/NextGenPOSBasket",
            "clear_cart": "/retail/shopandscan/api/v1/NextGenPOSBasket",
            "start_transaction": "/retail/shopandscan/api/v1/NextGenPOSBasket",
            "get_transaction": "/retail/shopandscan/api/v1/NextGenPOSBasket",
            "update_transaction": "/retail/shopandscan/api/v1/NextGenPOSBasket",
            "complete_transaction": "/retail/shopandscan/api/v1/NextGenPOSBasket/complete",
            "status": "/retail/shopandscan/api/v1/NextGenPOSBasket/Status",
            "update_quantity": "/retail/shopandscan/api/v1/NextGenPOSBasket/updateQuantity",
            "checkout": "/retail/shopandscan/api/v1/NextGenPOSBasket/checkout",
            "transfer": "/retail/shopandscan/api/v1/NextGenPOSBasket/transfer",
            "generate_barcode": "/retail/shopandscan/api/v1/NextGenPOSBasket/generateBarcode",
            "is_enabled": "/dgtlmma/accounts/isShopAndScanEnabled",
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

    @staticmethod
    def _require_session(func):
        """
        Decorator to ensure a Shop & Scan session is active before calling a method.
        
        Automatically starts a session if one isn't already active.
        """
        def wrapper(self, *args, **kwargs):
            # Extract store_id from args or kwargs
            store_id = None
            
            # For methods that take store_id as a keyword argument
            if 'store_id' in kwargs:
                store_id = str(kwargs['store_id']) if kwargs['store_id'] else None
            # Try to extract from method signature based on function name
            elif hasattr(func, '__name__'):
                func_name = func.__name__
                
                if func_name == 'add_to_cart' and len(args) >= 3:
                    # add_to_cart(barcode, quantity, store_id)
                    store_id = str(args[2]) if args[2] else None
                elif func_name == 'remove_from_cart' and len(args) >= 2:
                    # remove_from_cart(barcode, store_id)
                    store_id = str(args[1]) if args[1] else None
                elif func_name in ['get_cart', 'clear_cart', 'get_cart_detailed', 'lookup_barcode_price'] and len(args) >= 1:
                    # These methods take store_id as first positional argument
                    if func_name == 'lookup_barcode_price' and len(args) >= 2:
                        # lookup_barcode_price(barcode, store_id)
                        store_id = str(args[1]) if args[1] else None
                    elif func_name in ['get_cart', 'clear_cart', 'get_cart_detailed'] and len(args) >= 1:
                        # get_cart(store_id), clear_cart(store_id), get_cart_detailed(store_id)
                        store_id = str(args[0]) if args[0] else None
            
            # If no store_id found, try to get it from the last successful session
            if not store_id and self._current_store_id:
                store_id = self._current_store_id
                self.logger.debug(f"Using cached store_id: {store_id}")
            
            # Ensure we have a store_id
            if not store_id:
                self.logger.error(f"No store_id provided for {func.__name__ if hasattr(func, '__name__') else 'method'} and no cached store_id available")
                return None
            
            # Check if session is active and for the same store
            if not self._session_active or self._current_store_id != store_id:
                self.logger.debug(f"Starting new Shop & Scan session for store {store_id}")
                if not self._ensure_session(store_id):
                    self.logger.error(f"Failed to start Shop & Scan session for store {store_id}")
                    return None
            
            # Call the original method
            return func(self, *args, **kwargs)
        
        return wrapper

    def _ensure_session(self, store_id: str) -> bool:
        """
        Ensure a Shop & Scan session is active for the given store.
        
        Args:
            store_id: Store ID for the session
            
        Returns:
            True if session is active, False otherwise
        """
        try:
            # If we already have an active session for this store, return True
            if self._session_active and self._current_store_id == store_id:
                return True
            
            # Start a new session
            session_result = self.start_shop_n_scan_session(store_id)
            
            if session_result.get("success"):
                self._session_active = True
                self._current_transaction_id = session_result.get("transaction_id")
                self._current_store_id = store_id
                self._session_start_time = self._get_current_datetime()
                self.logger.debug(f"Shop & Scan session started for store {store_id}")
                return True
            else:
                self.logger.error(f"Failed to start Shop & Scan session: {session_result.get('error', 'Unknown error')}")
                return False
                
        except Exception as e:
            self.logger.error(f"Error ensuring Shop & Scan session: {e}")
            return False

    def is_session_active(self) -> bool:
        """Check if a Shop & Scan session is currently active."""
        return self._session_active

    def get_current_session_info(self) -> Dict[str, Any]:
        """Get information about the current session."""
        return {
            "active": self._session_active,
            "transaction_id": self._current_transaction_id,
            "store_id": self._current_store_id,
            "start_time": self._session_start_time
        }

    def end_session(self) -> bool:
        """
        End the current Shop & Scan session.
        
        Returns:
            True if session was ended successfully, False otherwise
        """
        try:
            if not self._session_active:
                return True  # No active session to end
            
            # Clear the cart
            if self._current_store_id:
                self.clear_cart(self._current_store_id)
            
            # Reset session state
            self._session_active = False
            self._current_transaction_id = None
            self._current_store_id = None
            self._session_start_time = None
            
            self.logger.debug("Shop & Scan session ended")
            return True
            
        except Exception as e:
            self.logger.error(f"Error ending Shop & Scan session: {e}")
            return False

    def set_local_base_url(self, base_url: str):
        """
        Set the base URL for local development/testing.
        
        Args:
            base_url: Base URL for local server (e.g., "http://127.0.0.1:5000")
        """
        base_url = base_url.rstrip('/')
        # Update all endpoints to use local server
        for key in self.endpoints:
            if not self.endpoints[key].startswith('http'):
                self.endpoints[key] = f"{base_url}/api/meijer{self.endpoints[key]}"
        
        for key in self.alternative_endpoints:
            if not self.alternative_endpoints[key].startswith('http'):
                self.alternative_endpoints[key] = f"{base_url}/api/meijer{self.alternative_endpoints[key]}"
        
        self.logger.info(f"Updated Shop & Scan endpoints to use local server: {base_url}")

    def reset_to_default_urls(self):
        """Reset URLs back to default Meijer endpoints."""
        # This would need to be implemented to restore original endpoint paths
        # For now, just log that this method was called
        self.logger.info("Reset Shop & Scan endpoints to default (requires re-initialization)")

    @_require_session
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
                        "POST", f"{self.meijer.api_base_url}{endpoint}", headers=self._get_shop_scan_headers(), json_data=data
                    )
                else:
                    # GET request
                    params = {}
                    if store_id:
                        params["storeId"] = store_id

                    response = self.meijer._make_request(
                        "GET", f"{self.meijer.api_base_url}{endpoint}", headers=self._get_shop_scan_headers(), params=params
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

    @_require_session
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
            # Based on the logs, Shop & Scan uses a different request format
            from datetime import datetime
            data = {
                "type": "BARCODE_SCANNED",
                "header": {
                    "transactionDateTime": datetime.now().strftime("%Y-%m-%dT%H:%M:%S"),
                    "transactionDateTimeUTC": datetime.now().strftime("%Y-%m-%dT%H:%M:%S-04:00"),
                    "storeId": int(store_id or self._current_store_id),
                    "terminal": 4001,
                    "eventTimeStamp": datetime.now().strftime("%Y-%m-%dT%H:%M:%S"),
                    "eventTimeStampUTC": datetime.now().strftime("%Y-%m-%dT%H:%M:%S-04:00"),
                    "deviceId": "50dbc7dc-e839-46d9-9bfd-292c0d4f831e",
                    "deviceOS": "Android",
                    "deviceAppVersion": "10.28.0",
                    "deviceOSVersion": "10",
                    "transactionStatus": "New",
                    "transactionId": self._current_transaction_id
                },
                "eventData": {
                    "barcodeType": "UPC",
                    "scannedUpc": barcode,
                    "quantity": quantity
                }
            }

            response = self.meijer._make_request(
                "POST",
                f"{self.meijer.api_base_url}{self.endpoints['add_to_cart']}",
                headers=self._get_shop_scan_headers(),
                json_data=data,
            )
            return response.status_code in [200, 201]

        except Exception as e:
            self.logger.error(f"Error adding to cart: {e}")
            return False

    @_require_session
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
                headers=self._get_shop_scan_headers(),
                json_data=data,
            )
            return response.status_code in [200, 204]

        except Exception as e:
            self.logger.error(f"Error removing from cart: {e}")
            return False

    @_require_session
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
                headers=self._get_shop_scan_headers(),
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

    @_require_session
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
                headers=self._get_shop_scan_headers(),
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
        store_id: Optional[str] = None
    ) -> Dict[str, Any]:
        """
        Detect BOGO (Buy One Get One) opportunities for a product.
        
        This method tests adding 1 vs 2 items to detect pricing drops
        that indicate BOGO deals.
        
        Args:
            barcode: The barcode/UPC to test for BOGO
            store_id: Optional store ID for store-specific pricing
            
        Returns:
            Dictionary with BOGO analysis results
        """
        results = {
            "barcode": barcode,
            "bogo_detected": False,
            "bogo_type": None,
            "price_progression": [],
            "savings_percentage": 0.0,
            "recommendation": None,
            "test_results": []
        }
        
        try:
            # Clear cart first to ensure clean testing
            self.clear_cart(store_id)
            
            # Test 1 item first
            success = self.add_to_cart(barcode, 1, store_id)
            if not success:
                self.logger.warning(f"Failed to add 1 of {barcode} to cart")
                return results
            
            # Get cart total for 1 item
            cart_data = self.get_cart_detailed(store_id)
            if not cart_data:
                return results
            
            # Find our item in cart
            item = self._find_item_in_cart(cart_data, barcode)
            if not item:
                return results
            
            price_1_item = item.get("totalPrice", {}).get("value", 0)
            
            price_info_1 = {
                "quantity": 1,
                "total_price": price_1_item,
                "unit_price": price_1_item,
                "price_per_item": price_1_item
            }
            
            results["price_progression"].append(price_info_1)
            results["test_results"].append(price_info_1)
            
            # Clear cart and test 2 items
            self.clear_cart(store_id)
            
            success = self.add_to_cart(barcode, 2, store_id)
            if not success:
                self.logger.warning(f"Failed to add 2 of {barcode} to cart")
                return results
            
            # Get cart total for 2 items
            cart_data = self.get_cart_detailed(store_id)
            if not cart_data:
                return results
            
            # Find our item in cart
            item = self._find_item_in_cart(cart_data, barcode)
            if not item:
                return results
            
            price_2_items = item.get("totalPrice", {}).get("value", 0)
            unit_price_2_items = price_2_items / 2 if price_2_items > 0 else 0
            
            price_info_2 = {
                "quantity": 2,
                "total_price": price_2_items,
                "unit_price": unit_price_2_items,
                "price_per_item": unit_price_2_items
            }
            
            results["price_progression"].append(price_info_2)
            results["test_results"].append(price_info_2)
            
            # Calculate price drop from 1 to 2 items
            if price_1_item > 0 and unit_price_2_items > 0:
                price_drop = price_1_item - unit_price_2_items
                price_drop_percentage = (price_drop / price_1_item) * 100
                
                # Determine BOGO type based on price drop
                if price_drop_percentage >= 40:
                    if price_drop_percentage >= 50:
                        if price_drop_percentage >= 100:  # Free second item
                            bogo_type = "BOGO Free"
                        else:
                            bogo_type = "BOGO 50%"
                    else:
                        bogo_type = "BOGO 40%"
                else:
                    bogo_type = f"BOGO {int(price_drop_percentage)}%"
                
                results["bogo_detected"] = True
                results["bogo_type"] = bogo_type
                results["savings_percentage"] = price_drop_percentage
                
                # Generate recommendation
                if price_drop_percentage >= 100:
                    results["recommendation"] = "BOGO Free! Second item is completely free"
                else:
                    results["recommendation"] = f"BOGO detected! {bogo_type} - {price_drop_percentage:.1f}% off second item"
            else:
                results["recommendation"] = "No BOGO detected - standard pricing applies"
            
            # Clean up
            self.clear_cart(store_id)
            
            return results
            
        except Exception as e:
            self.logger.error(f"Error detecting BOGO for {barcode}: {e}")
            results["error"] = str(e)
            return results

    def quick_bogo_check(
        self, 
        barcode: str, 
        store_id: Optional[str] = None
    ) -> Optional[str]:
        """
        Quick check to see if an item has BOGO pricing.
        
        This is a faster alternative to detect_bogo_opportunity() when
        you just need to know the BOGO type without detailed analysis.
        
        Args:
            barcode: The barcode/UPC to check
            store_id: Optional store ID for store-specific pricing
            
        Returns:
            BOGO type string (e.g., "BOGO 50%", "BOGO Free") or None if no BOGO
        """
        try:
            # Clear cart first
            self.clear_cart(store_id)
            
            # Add 1 item
            if not self.add_to_cart(barcode, 1, store_id):
                return None
            
            cart_data = self.get_cart_detailed(store_id)
            if not cart_data:
                return None
            
            item = self._find_item_in_cart(cart_data, barcode)
            if not item:
                return None
            
            price_1_item = item.get("totalPrice", {}).get("value", 0)
            
            # Clear and add 2 items
            self.clear_cart(store_id)
            if not self.add_to_cart(barcode, 2, store_id):
                return None
            
            cart_data = self.get_cart_detailed(store_id)
            if not cart_data:
                return None
            
            item = self._find_item_in_cart(cart_data, barcode)
            if not item:
                return None
            
            price_2_items = item.get("totalPrice", {}).get("value", 0)
            unit_price_2_items = price_2_items / 2 if price_2_items > 0 else 0
            
            # Calculate price drop
            if price_1_item > 0 and unit_price_2_items > 0:
                price_drop_percentage = ((price_1_item - unit_price_2_items) / price_1_item) * 100
                
                # Determine BOGO type
                if price_drop_percentage >= 40:
                    if price_drop_percentage >= 50:
                        if price_drop_percentage >= 100:
                            return "BOGO Free"
                        else:
                            return "BOGO 50%"
                    else:
                        return "BOGO 40%"
                elif price_drop_percentage > 5:  # Any significant discount
                    return f"BOGO {int(price_drop_percentage)}%"
            
            # Clean up
            self.clear_cart(store_id)
            return None
            
        except Exception as e:
            self.logger.error(f"Error in quick BOGO check for {barcode}: {e}")
            return None

    def check_special_pricing(
        self, 
        barcode: str, 
        store_id: Optional[str] = None
    ) -> Dict[str, Any]:
        """
        Check for any special pricing patterns on an item.
        
        This method tests different quantities to identify various pricing patterns
        including BOGO, bulk discounts, and other special offers.
        
        Args:
            barcode: The barcode/UPC to check
            store_id: Optional store ID for store-specific pricing
            
        Returns:
            Dictionary with pricing analysis results
        """
        results = {
            "barcode": barcode,
            "special_pricing_detected": False,
            "pricing_type": None,
            "best_quantity": 1,
            "best_unit_price": 0.0,
            "savings_percentage": 0.0,
            "recommendation": None,
            "price_analysis": []
        }
        
        try:
            # Test quantities: 1, 2, 3, 4, 6, 8, 10
            test_quantities = [1, 2, 3, 4, 6, 8, 10]
            best_deal = None
            
            for quantity in test_quantities:
                # Clear cart and add items
                self.clear_cart(store_id)
                if not self.add_to_cart(barcode, quantity, store_id):
                    continue
                
                # Get cart data
                cart_data = self.get_cart_detailed(store_id)
                if not cart_data:
                    continue
                
                item = self._find_item_in_cart(cart_data, barcode)
                if not item:
                    continue
                
                total_price = item.get("totalPrice", {}).get("value", 0)
                unit_price = total_price / quantity if quantity > 0 else 0
                
                price_info = {
                    "quantity": quantity,
                    "total_price": total_price,
                    "unit_price": unit_price,
                    "price_per_item": unit_price
                }
                
                results["price_analysis"].append(price_info)
                
                # Track best deal (lowest unit price)
                if best_deal is None or unit_price < best_deal["unit_price"]:
                    best_deal = {
                        "quantity": quantity,
                        "unit_price": unit_price,
                        "total_price": total_price
                    }
            
            # Analyze pricing patterns
            if len(results["price_analysis"]) >= 2:
                # Check for BOGO patterns
                price_1 = next((p["unit_price"] for p in results["price_analysis"] if p["quantity"] == 1), 0)
                price_2 = next((p["unit_price"] for p in results["price_analysis"] if p["quantity"] == 2), 0)
                
                if price_1 > 0 and price_2 > 0:
                    price_drop = price_1 - price_2
                    price_drop_percentage = (price_drop / price_1) * 100
                    
                    if price_drop_percentage >= 40:
                        if price_drop_percentage >= 100:
                            results["pricing_type"] = "BOGO Free"
                        elif price_drop_percentage >= 50:
                            results["pricing_type"] = "BOGO 50%"
                        else:
                            results["pricing_type"] = "BOGO 40%"
                        results["special_pricing_detected"] = True
                        results["savings_percentage"] = price_drop_percentage
                        results["recommendation"] = f"BOGO deal: {results['pricing_type']}"
                
                # Check for bulk discounts
                if best_deal and best_deal["quantity"] > 1:
                    base_price = price_1
                    if base_price > 0:
                        bulk_savings = ((base_price - best_deal["unit_price"]) / base_price) * 100
                        if bulk_savings > 5:  # More than 5% savings
                            if not results["special_pricing_detected"]:
                                results["pricing_type"] = f"Bulk Discount ({best_deal['quantity']}+ items)"
                                results["special_pricing_detected"] = True
                                results["savings_percentage"] = bulk_savings
                                results["recommendation"] = f"Bulk discount: Buy {best_deal['quantity']}+ for {bulk_savings:.1f}% savings"
            
            # Set best quantity and unit price
            if best_deal:
                results["best_quantity"] = best_deal["quantity"]
                results["best_unit_price"] = best_deal["unit_price"]
            
            # Clean up
            self.clear_cart(store_id)
            
            return results
            
        except Exception as e:
            self.logger.error(f"Error checking special pricing for {barcode}: {e}")
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
            
            # Build transaction data based on actual API structure from logs
            from datetime import datetime
            transaction_data = {
                "type": "START_TRANSACTION",
                "header": {
                    "transactionDateTime": datetime.now().strftime("%Y-%m-%dT%H:%M:%S"),
                    "transactionDateTimeUTC": datetime.now().strftime("%Y-%m-%dT%H:%M:%S-04:00"),
                    "storeId": int(store_id),
                    "eventTimeStamp": datetime.now().strftime("%Y-%m-%dT%H:%M:%S"),
                    "eventTimeStampUTC": datetime.now().strftime("%Y-%m-%dT%H:%M:%S-04:00"),
                    "deviceId": device_id or "50dbc7dc-e839-46d9-9bfd-292c0d4f831e",
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
                headers=self._get_shop_scan_headers(),
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

    @_require_session
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
            
            response = self.meijer._make_request("GET", endpoint, headers=self._get_shop_scan_headers(), params=params)
            
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
                headers=self._get_shop_scan_headers(),
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

    def _get_shop_scan_headers(self) -> Dict[str, str]:
        """Get headers specific to Shop & Scan operations."""
        headers = {
            "Content-Type": "application/json",
            "Accept": "application/json",
            "Accept-Language": "en-US,en;q=0.9",
            "Accept-Encoding": "gzip, deflate, br",
            "Connection": "keep-alive",
            "Cache-Control": "no-cache",
            "Pragma": "no-cache",
            "X-Requested-With": "com.meijer.mobile.meijer",
            "X-Device-Platform": "Android",
            "X-Device-Version": "10.28.0",
            "X-Device-OS": "Android 10",
            "X-Device-Model": "One",
            "X-Device-Manufacturer": "HTC",
        }
        return headers

    @_require_session
    def update_item_quantity(self, barcode: str, new_quantity: float, store_id: Optional[str] = None) -> bool:
        """
        Update the quantity of an item in the Shop & Scan cart.
        
        This method handles the UPDATE_QUANTITY operation found in the logs.
        
        Args:
            barcode: The barcode/UPC of the item to update
            new_quantity: The new quantity (can be decimal for weight-based items)
            store_id: Optional store ID
            
        Returns:
            True if successful, False otherwise
        """
        try:
            # Get current cart to find the item
            cart_data = self.get_cart_detailed(store_id)
            if not cart_data:
                self.logger.error("Could not retrieve cart data for quantity update")
                return False
            
            # Find the item in the cart
            item = self._find_item_in_cart(cart_data, barcode)
            if not item:
                self.logger.error(f"Item with barcode {barcode} not found in cart")
                return False
            
            # Prepare the UPDATE_QUANTITY payload based on log analysis
            payload = {
                "type": "UPDATE_QUANTITY",
                "header": {
                    "transactionDateTime": self._get_current_datetime(),
                    "transactionDateTimeUTC": self._get_current_datetime_utc(),
                    "storeId": store_id or self.meijer.store_id,
                    "terminal": 4001,  # Default terminal from logs
                    "eventTimeStamp": self._get_current_datetime(),
                    "eventTimeStampUTC": self._get_current_datetime_utc(),
                    "deviceId": self._generate_device_id(),
                    "deviceOS": "Android",
                    "deviceAppVersion": "10.28.0",
                    "deviceOSVersion": "10",
                    "transactionStatus": "New",
                    "transactionId": self._generate_transaction_id(),
                    "trackingId": self._generate_tracking_id(),
                    "transactionNumber": self._get_next_transaction_number()
                },
                "eventData": {
                    "barcodeData": barcode,
                    "unitEntryType": "quantityEntered",
                    "quantityWeight": new_quantity,
                    "correlationId": self._generate_correlation_id()
                }
            }
            
            # Make the request to update quantity
            response = self.meijer._make_request(
                "POST",
                f"{self.meijer.api_base_url}{self.endpoints['update_quantity']}",
                headers=self._get_shop_scan_headers(),
                json_data=payload
            )
            
            if response.status_code in [200, 201]:
                self.logger.info(f"Successfully updated quantity for {barcode} to {new_quantity}")
                return True
            else:
                self.logger.error(f"Failed to update quantity: {response.status_code} - {response.text}")
                return False
                
        except Exception as e:
            self.logger.error(f"Error updating item quantity: {e}")
            return False

    @_require_session
    def checkout_transaction(self, store_id: Optional[str] = None) -> Optional[Dict[str, Any]]:
        """
        Initiate the checkout process for the Shop & Scan transaction.
        
        This method handles the CHECKOUT operation from the user-described flow.
        
        Args:
            store_id: Optional store ID
            
        Returns:
            Checkout response data or None if failed
        """
        try:
            # Prepare the checkout payload
            payload = {
                "type": "CHECKOUT",
                "header": {
                    "transactionDateTime": self._get_current_datetime(),
                    "transactionDateTimeUTC": self._get_current_datetime_utc(),
                    "storeId": store_id or self.meijer.store_id,
                    "terminal": 4001,
                    "eventTimeStamp": self._get_current_datetime(),
                    "eventTimeStampUTC": self._get_current_datetime_utc(),
                    "deviceId": self._generate_device_id(),
                    "deviceOS": "Android",
                    "deviceAppVersion": "10.28.0",
                    "deviceOSVersion": "10",
                    "transactionStatus": "Checkout",
                    "transactionId": self._generate_transaction_id(),
                    "trackingId": self._generate_tracking_id(),
                    "transactionNumber": self._get_next_transaction_number()
                },
                "eventData": {
                    "checkoutType": "standard",
                    "paymentMethod": "pending",
                    "correlationId": self._generate_correlation_id()
                }
            }
            
            # Make the checkout request
            response = self.meijer._make_request(
                "POST",
                f"{self.meijer.api_base_url}{self.endpoints['checkout']}",
                headers=self._get_shop_scan_headers(),
                json_data=payload
            )
            
            if response.status_code == 200:
                checkout_data = response.json()
                self.logger.info("Checkout initiated successfully")
                return checkout_data
            else:
                self.logger.error(f"Checkout failed: {response.status_code} - {response.text}")
                return None
                
        except Exception as e:
            self.logger.error(f"Error during checkout: {e}")
            return None

    @_require_session
    def transfer_transaction(self, store_id: Optional[str] = None) -> Optional[Dict[str, Any]]:
        """
        Transfer the transaction to the checkout system.
        
        This method handles the TRANSFER operation from the user-described flow.
        
        Args:
            store_id: Optional store ID
            
        Returns:
            Transfer response data or None if failed
        """
        try:
            # Prepare the transfer payload
            payload = {
                "type": "TRANSFER",
                "header": {
                    "transactionDateTime": self._get_current_datetime(),
                    "transactionDateTimeUTC": self._get_current_datetime_utc(),
                    "storeId": store_id or self.meijer.store_id,
                    "terminal": 4001,
                    "eventTimeStamp": self._get_current_datetime(),
                    "eventTimeStampUTC": self._get_current_datetime_utc(),
                    "deviceId": self._generate_device_id(),
                    "deviceOS": "Android",
                    "deviceAppVersion": "10.28.0",
                    "deviceOSVersion": "10",
                    "transactionStatus": "Transfer",
                    "transactionId": self._generate_transaction_id(),
                    "trackingId": self._generate_tracking_id(),
                    "transactionNumber": self._get_next_transaction_number()
                },
                "eventData": {
                    "transferType": "checkout",
                    "correlationId": self._generate_correlation_id()
                }
            }
            
            # Make the transfer request
            response = self.meijer._make_request(
                "POST",
                f"{self.meijer.api_base_url}{self.endpoints['transfer']}",
                headers=self._get_shop_scan_headers(),
                json_data=payload
            )
            
            if response.status_code == 200:
                transfer_data = response.json()
                self.logger.info("Transaction transferred successfully")
                return transfer_data
            else:
                self.logger.error(f"Transfer failed: {response.status_code} - {response.text}")
                return None
                
        except Exception as e:
            self.logger.error(f"Error during transfer: {e}")
            return None

    @_require_session
    def complete_transaction(self, store_id: Optional[str] = None) -> Optional[Dict[str, Any]]:
        """
        Complete the Shop & Scan transaction.
        
        This method handles the COMPLETE operation from the user-described flow.
        
        Args:
            store_id: Optional store ID
            
        Returns:
            Completion response data or None if failed
        """
        try:
            # Prepare the completion payload
            payload = {
                "type": "COMPLETE",
                "header": {
                    "transactionDateTime": self._get_current_datetime(),
                    "transactionDateTimeUTC": self._get_current_datetime_utc(),
                    "storeId": store_id or self.meijer.store_id,
                    "terminal": 4001,
                    "eventTimeStamp": self._get_current_datetime(),
                    "eventTimeStampUTC": self._get_current_datetime_utc(),
                    "deviceId": self._generate_device_id(),
                    "deviceOS": "Android",
                    "deviceAppVersion": "10.28.0",
                    "deviceOSVersion": "10",
                    "transactionStatus": "Complete",
                    "transactionId": self._generate_transaction_id(),
                    "trackingId": self._generate_tracking_id(),
                    "transactionNumber": self._get_next_transaction_number()
                },
                "eventData": {
                    "completionType": "standard",
                    "correlationId": self._generate_correlation_id()
                }
            }
            
            # Make the completion request
            response = self.meijer._make_request(
                "POST",
                f"{self.meijer.api_base_url}{self.endpoints['complete']}",
                headers=self._get_shop_scan_headers(),
                json_data=payload
            )
            
            if response.status_code == 200:
                completion_data = response.json()
                self.logger.info("Transaction completed successfully")
                return completion_data
            else:
                self.logger.error(f"Completion failed: {response.status_code} - {response.text}")
                return None
                
        except Exception as e:
            self.logger.error(f"Error during completion: {e}")
            return None

    def generate_pdf417_barcode(self, transaction_id: str, store_id: Optional[str] = None) -> Optional[str]:
        """
        Generate a PDF417 barcode for checkout.
        
        This method handles the GENERATE_PDF417 operation from the user-described flow.
        
        Args:
            transaction_id: The transaction ID to encode in the barcode
            store_id: Optional store ID
            
        Returns:
            Generated PDF417 barcode string or None if failed
        """
        try:
            # Prepare the barcode generation payload
            payload = {
                "type": "GENERATE_PDF417",
                "header": {
                    "transactionDateTime": self._get_current_datetime(),
                    "transactionDateTimeUTC": self._get_current_datetime_utc(),
                    "storeId": store_id or self.meijer.store_id,
                    "terminal": 4001,
                    "eventTimeStamp": self._get_current_datetime(),
                    "eventTimeStampUTC": self._get_current_datetime_utc(),
                    "deviceId": self._generate_device_id(),
                    "deviceOS": "Android",
                    "deviceAppVersion": "10.28.0",
                    "deviceOSVersion": "10",
                    "transactionStatus": "Barcode",
                    "transactionId": transaction_id,
                    "trackingId": self._generate_tracking_id(),
                    "transactionNumber": self._get_next_transaction_number()
                },
                "eventData": {
                    "barcodeType": "PDF_417",
                    "correlationId": self._generate_correlation_id()
                }
            }
            
            # Make the barcode generation request
            response = self.meijer._make_request(
                "POST",
                f"{self.meijer.api_base_url}{self.endpoints['generate_barcode']}",
                headers=self._get_shop_scan_headers(),
                json_data=payload
            )
            
            if response.status_code == 200:
                barcode_data = response.json()
                # Extract the generated barcode from response
                barcode = barcode_data.get("barcode") or barcode_data.get("pdf417")
                if barcode:
                    self.logger.info(f"PDF417 barcode generated successfully: {barcode}")
                    return barcode
                else:
                    self.logger.error("Barcode generated but not found in response")
                    return None
            else:
                self.logger.error(f"Barcode generation failed: {response.status_code} - {response.text}")
                return None
                
        except Exception as e:
            self.logger.error(f"Error generating PDF417 barcode: {e}")
            return None

    def get_checkout_summary(self, store_id: Optional[str] = None) -> Optional[Dict[str, Any]]:
        """
        Get checkout summary including totals, taxes, and savings.
        
        This method provides the checkout summary information described in the user flow.
        
        Args:
            store_id: Optional store ID
            
        Returns:
            Checkout summary data or None if failed
        """
        try:
            # Get current cart data
            cart_data = self.get_cart_detailed(store_id)
            if not cart_data:
                return None
            
            # Extract summary information
            cart_totals = cart_data.get("cartTotals", {})
            
            summary = {
                "item_total": cart_totals.get("cartNowTotal", 0.0),
                "estimated_taxes": cart_totals.get("tax", 0.0),
                "subtotal": cart_totals.get("cartNowTotal", 0.0),
                "total_savings": cart_totals.get("cartSavingsTotal", 0.0),
                "estimated_total": cart_totals.get("basketTotalWithTax", 0.0),
                "cart_items_count": len(cart_data.get("cartItems", [])),
                "transaction_id": cart_data.get("transactionHeader", {}).get("transactionId"),
                "store_id": store_id or self.meijer.store_id
            }
            
            return summary
            
        except Exception as e:
            self.logger.error(f"Error getting checkout summary: {e}")
            return None

    def complete_checkout_flow(self, store_id: Optional[str] = None) -> Optional[Dict[str, Any]]:
        """
        Complete the entire checkout flow as described by the user.
        
        This method orchestrates the complete flow:
        1. Checkout
        2. Transfer
        3. Complete
        4. Generate PDF417 barcode
        5. Return summary
        
        Args:
            store_id: Optional store ID
            
        Returns:
            Complete checkout flow results or None if failed
        """
        try:
            results = {
                "checkout": None,
                "transfer": None,
                "complete": None,
                "pdf417_barcode": None,
                "summary": None,
                "success": False
            }
            
            # Step 1: Initiate checkout
            self.logger.info("Step 1: Initiating checkout...")
            checkout_result = self.checkout_transaction(store_id)
            if not checkout_result:
                self.logger.error("Checkout failed - stopping flow")
                return results
            results["checkout"] = checkout_result
            
            # Step 2: Transfer transaction
            self.logger.info("Step 2: Transferring transaction...")
            transfer_result = self.transfer_transaction(store_id)
            if not transfer_result:
                self.logger.error("Transfer failed - stopping flow")
                return results
            results["transfer"] = transfer_result
            
            # Step 3: Complete transaction
            self.logger.info("Step 3: Completing transaction...")
            complete_result = self.complete_transaction(store_id)
            if not complete_result:
                self.logger.error("Completion failed - stopping flow")
                return results
            results["complete"] = complete_result
            
            # Step 4: Generate PDF417 barcode
            self.logger.info("Step 4: Generating PDF417 barcode...")
            transaction_id = complete_result.get("transactionId") or self._generate_transaction_id()
            barcode = self.generate_pdf417_barcode(transaction_id, store_id)
            if barcode:
                results["pdf417_barcode"] = barcode
            else:
                self.logger.warning("PDF417 barcode generation failed")
            
            # Step 5: Get final summary
            self.logger.info("Step 5: Getting checkout summary...")
            summary = self.get_checkout_summary(store_id)
            results["summary"] = summary
            
            results["success"] = True
            self.logger.info("Complete checkout flow finished successfully")
            
            return results
            
        except Exception as e:
            self.logger.error(f"Error in complete checkout flow: {e}")
            return None

    # Helper methods for the new functionality
    def _generate_transaction_id(self) -> str:
        """Generate a unique transaction ID."""
        import uuid
        return str(uuid.uuid4())

    def _generate_tracking_id(self) -> str:
        """Generate a tracking ID in the format from logs."""
        from datetime import datetime
        timestamp = datetime.now().strftime("%Y%m%d%H%M%S")
        return f"{timestamp}20250822094757"

    def _get_next_transaction_number(self) -> int:
        """Get the next transaction number (incremental)."""
        if not hasattr(self, '_transaction_counter'):
            self._transaction_counter = 0
        self._transaction_counter += 1
        return self._transaction_counter

    def _generate_correlation_id(self) -> str:
        """Generate a correlation ID for tracking operations."""
        import uuid
        return str(uuid.uuid4())

    def is_shop_and_scan_enabled(self, store_id: Optional[str] = None) -> bool:
        """
        Check if Shop & Scan is enabled for the current user and store.
        
        This method calls the isShopAndScanEnabled endpoint to verify functionality.
        
        Args:
            store_id: Optional store ID
            
        Returns:
            True if Shop & Scan is enabled, False otherwise
        """
        try:
            # Prepare the request parameters
            params = {}
            if store_id:
                params["storeId"] = store_id
            
            # Make the request to check if Shop & Scan is enabled
            response = self.meijer._make_request(
                "GET",
                f"{self.meijer.api_base_url}{self.endpoints['is_enabled']}",
                headers=self._get_shop_scan_headers(),
                params=params
            )
            
            if response.status_code == 200:
                data = response.json()
                # Check if the response indicates Shop & Scan is enabled
                is_enabled = data.get("isEnabled", False)
                self.logger.info(f"Shop & Scan enabled check: {is_enabled}")
                return is_enabled
            else:
                self.logger.warning(f"Shop & Scan enabled check failed: {response.status_code}")
                return False
                
        except Exception as e:
            self.logger.error(f"Error checking if Shop & Scan is enabled: {e}")
            return False

    def resume_shop_and_scan_session(self, store_id: Optional[str] = None) -> bool:
        """
        Resume an existing Shop & Scan session.
        
        This method is called when the app is relaunched and needs to resume
        an existing session, as described in the user flow.
        
        Args:
            store_id: Optional store ID
            
        Returns:
            True if session resumed successfully, False otherwise
        """
        try:
            # First check if Shop & Scan is enabled
            if not self.is_shop_and_scan_enabled(store_id):
                self.logger.warning("Shop & Scan is not enabled for this store")
                return False
            
            # Get current cart to see if there's an existing session
            cart_data = self.get_cart_detailed(store_id)
            if cart_data and cart_data.get("cartItems"):
                # Session exists, mark it as active
                self._session_active = True
                self._current_store_id = store_id or self.meijer.store_id
                self._session_start_time = self._get_current_datetime()
                
                # Extract transaction ID if available
                transaction_header = cart_data.get("transactionHeader", {})
                if transaction_header.get("transactionId"):
                    self._current_transaction_id = transaction_header["transactionId"]
                
                self.logger.info(f"Successfully resumed Shop & Scan session with {len(cart_data.get('cartItems', []))} items")
                return True
            else:
                self.logger.info("No existing session found, starting new session")
                return self.start_shop_n_scan_session(store_id)
                
        except Exception as e:
            self.logger.error(f"Error resuming Shop & Scan session: {e}")
            return False
