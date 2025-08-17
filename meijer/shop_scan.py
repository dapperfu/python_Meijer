"""
Meijer Shop & Scan Functionality
===============================

Shop & Scan functionality for the Meijer API client.
"""

from typing import List, Optional, TYPE_CHECKING, Dict, Any
from urllib.parse import urljoin

from .models import ShopScanItem, ShopScanTrip
from .exceptions import MeijerAuthenticationError

if TYPE_CHECKING:
    from .client import Meijer


class ShopNScan:
    """
    Meijer Shop & Scan functionality.

    Handles the complete Shop & Scan workflow based on APK analysis:
    - Session initialization and store validation
    - Item scanning and cart management
    - Checkout finalization
    """

    def __init__(self, meijer_client: "Meijer"):
        """Initialize Shop & Scan with reference to Meijer client."""
        self.meijer = meijer_client
        self.current_trip: Optional[ShopScanTrip] = None
        self.logger = meijer_client.logger

        # API endpoints discovered from APK analysis
        self.endpoints = {
            "config": "/dgtlmma/accounts/isShopAndScanEnabled",
            "static_config": "https://static.meijer.com/mobileassets/shopandscan/shopandscan_config.json",
            "start_trip": "/dgtlmma/shopandscan/trip/start",
            "scan_item": "/dgtlmma/shopandscan/item/scan",
            "add_item": "/dgtlmma/shopandscan/cart/add",
            "remove_item": "/dgtlmma/shopandscan/cart/remove",
            "get_cart": "/dgtlmma/shopandscan/cart",
            "finalize": "/dgtlmma/shopandscan/checkout/finalize",
            "end_trip": "/dgtlmma/shopandscan/trip/end",
        }

    def is_enabled(self) -> bool:
        """Check if Shop & Scan is enabled for the current user."""
        try:
            url = urljoin(self.meijer.api_base_url, self.endpoints["config"])
            headers = self.meijer._get_api_headers()
            headers.update(
                {"Accept": "application/json", "Content-Type": "application/json"}
            )

            response = self.meijer._make_request("GET", url, headers=headers)

            if response.status_code == 200:
                data = response.json()
                enabled = data.get("isEnabled", False)
                self.logger.info(f"Shop & Scan enabled: {enabled}")
                return enabled
            else:
                self.logger.warning(
                    f"Failed to check Shop & Scan status: {response.status_code}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error checking Shop & Scan availability: {e}")
            return False

    def start_trip(self, store_id: str) -> bool:
        """Start a new Shop & Scan trip at the specified store."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError(
                    "Authentication required for Shop & Scan"
                )

            url = urljoin(self.meijer.api_base_url, self.endpoints["start_trip"])
            headers = self.meijer._get_api_headers()
            headers.update({"Content-Type": "application/json"})

            data = {"storeId": store_id}
            response = self.meijer._make_request(
                "POST", url, headers=headers, json=data
            )

            if response.status_code == 200:
                trip_data = response.json()
                self.current_trip = ShopScanTrip(
                    trip_id=trip_data.get("tripId", ""),
                    store_id=store_id,
                    started_at=trip_data.get("startedAt"),
                    items=[],
                )
                self.logger.info(
                    f"Started Shop & Scan trip: {self.current_trip.trip_id}"
                )
                return True
            else:
                self.logger.error(f"Failed to start trip: {response.status_code}")
                return False

        except Exception as e:
            self.logger.error(f"Error starting Shop & Scan trip: {e}")
            return False

    def scan_item(self, upc: str, quantity: int = 1) -> bool:
        """Scan an item and add it to the cart."""
        try:
            if not self.current_trip:
                self.logger.error("No active Shop & Scan trip")
                return False

            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["scan_item"])
            headers = self.meijer._get_api_headers()
            headers.update({"Content-Type": "application/json"})

            data = {
                "tripId": self.current_trip.trip_id,
                "upc": upc,
                "quantity": quantity,
            }

            response = self.meijer._make_request(
                "POST", url, headers=headers, json=data
            )

            if response.status_code == 200:
                item_data = response.json()

                # Create shop scan item
                item = ShopScanItem(
                    upc=upc,
                    name=item_data.get("name", "Unknown Item"),
                    price=item_data.get("price", 0.0),
                    quantity=quantity,
                    total=item_data.get(
                        "total", item_data.get("price", 0.0) * quantity
                    ),
                )

                # Add to current trip
                self.current_trip.items.append(item)
                self.current_trip.subtotal += item.total or 0

                self.logger.info(f"Scanned item: {item.name} (${item.price})")
                return True
            else:
                self.logger.error(f"Failed to scan item: {response.status_code}")
                return False

        except Exception as e:
            self.logger.error(f"Error scanning item {upc}: {e}")
            return False

    def get_cart(self) -> List[ShopScanItem]:
        """Get current cart contents."""
        if not self.current_trip:
            return []
        return self.current_trip.items

    def lookup_barcode_price_alternative(self, barcode: str, store_id: Optional[str] = None) -> Optional[Dict[str, Any]]:
        """
        Alternative barcode lookup using the main product search API.
        
        This uses the product search GraphQL API instead of Shop & Scan since
        the Shop & Scan endpoints appear to require an active session.
        
        Args:
            barcode: UPC/barcode to look up
            store_id: Optional store ID for location-specific pricing
            
        Returns:
            Dict containing product info and pricing, or None if not found
        """
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            # Use Constructor.io search (this is what the app actually uses)
            constructor_base_url = "https://ac.cnstrc.com"
            url = f"{constructor_base_url}/search/{barcode}"
            
            # API key from the actual Meijer app 
            api_key = "key_Rf2XGUz9WKRJ6qUL"
            
            params = {
                "key": api_key,
                "results_per_page": 10,
                "page": 1,
                "fmt_options[groups_max_depth]": 2,
                "fmt_options[groups_start]": "current",
            }

            self.logger.info(f"Looking up barcode via Constructor.io: {barcode}")
            self.logger.debug(f"Constructor URL: {url}")
            self.logger.debug(f"Constructor params: {params}")

            response = self.meijer._make_request("GET", url, params=params)

            if response.status_code == 200:
                data = response.json()
                self.logger.debug(f"Constructor.io response: {data}")
                
                # Parse Constructor.io search results
                results = data.get("results", [])
                if not results:
                    self.logger.warning(f"No products found for barcode {barcode}")
                    return None
                
                # Look for exact UPC match in Constructor.io results
                exact_match = None
                for result_item in results:
                    item_data = result_item.get("data", {})
                    product_upc = item_data.get("upc", "").strip()
                    
                    # Try multiple UPC fields
                    if not product_upc:
                        product_upc = item_data.get("barcode", "").strip()
                    if not product_upc:
                        product_upc = item_data.get("sku", "").strip()
                    
                    if product_upc == barcode:
                        exact_match = result_item
                        break
                
                if not exact_match:
                    # If no exact match, take the first result (might be partial match)
                    exact_match = results[0]
                    self.logger.info(f"No exact UPC match, using first result from Constructor.io")
                
                # Extract product data from Constructor.io format
                item_data = exact_match.get("data", {})
                value = exact_match.get("value", "Unknown Product")
                
                # Format response to match Shop & Scan API structure
                result = {
                    "id": item_data.get("id", str(exact_match.get("id", ""))),
                    "title": value or item_data.get("title", "Unknown Product"),
                    "barcode": barcode,
                    "unitPrice": item_data.get("price"),
                    "isWeighted": item_data.get("is_weighted", False),
                    "imageUrl": item_data.get("image_url"),
                    "quantity": 1,
                    "upc": item_data.get("upc"),
                    "sku": item_data.get("sku"),
                    "brand": item_data.get("brand"),
                    "category": item_data.get("category"),
                    "raw_response": exact_match  # Include full response
                }
                
                # Log pricing info
                if result["unitPrice"]:
                    try:
                        price_value = float(result["unitPrice"])
                        price_str = f"${price_value:.2f}"
                        if result["isWeighted"]:
                            price_str += " per lb"
                        self.logger.info(f"Found via Constructor.io: {result['title']} - Price: {price_str}")
                    except (ValueError, TypeError):
                        self.logger.info(f"Found via Constructor.io: {result['title']} - Price: {result['unitPrice']}")
                else:
                    self.logger.info(f"Found via Constructor.io: {result['title']} - No price data")
                
                return result
                
            else:
                self.logger.error(f"Constructor.io API failed: {response.status_code} - {response.text}")
                return None

        except Exception as e:
            self.logger.error(f"Error looking up barcode via search API {barcode}: {e}")
            return None

    def lookup_barcode_price(self, barcode: str, store_id: Optional[str] = None) -> Optional[Dict[str, Any]]:
        """
        Look up price and product information for any barcode.
        
        This method tries multiple approaches:
        1. Shop & Scan API (requires active session - may not work)
        2. Product Search API (fallback method)
        
        Args:
            barcode: UPC/barcode to look up
            store_id: Optional store ID for location-specific pricing
            
        Returns:
            Dict containing product info and pricing, or None if not found
        """
        # First try the original Shop & Scan approach
        result = self._lookup_barcode_shopscan(barcode, store_id)
        if result:
            return result
        
        # Fallback to search API
        self.logger.info(f"Shop & Scan failed, trying search API for barcode {barcode}")
        return self.lookup_barcode_price_alternative(barcode, store_id)

    def _lookup_barcode_shopscan(self, barcode: str, store_id: Optional[str] = None) -> Optional[Dict[str, Any]]:
        """Original Shop & Scan lookup method."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            # Use the Shop & Scan lookup API discovered from APK
            # Base URL: https://api.meijer.com/retail/shopandscan/api/v1/
            shop_scan_base = "https://api.meijer.com/retail/shopandscan/api/v1/"
            
            # Try different endpoint patterns based on APK analysis
            endpoints_to_try = [
                f"{shop_scan_base}item/{barcode}",  # GET with barcode as path
                f"{shop_scan_base}item?pluNumber={barcode}",  # GET with query param
                f"{shop_scan_base}lookup/{barcode}",  # GET lookup with path
                f"{shop_scan_base}lookup?pluNumber={barcode}",  # GET lookup with query
                f"{shop_scan_base}item/lookup",  # POST with body (original)
            ]
            
            headers = self.meijer._get_api_headers()
            headers.update({
                "Accept": "application/json",
                "Content-Type": "application/json"
            })

            self.logger.debug(f"Trying Shop & Scan lookup for barcode: {barcode}")
            
            # Try different endpoint patterns
            for i, url in enumerate(endpoints_to_try, 1):
                self.logger.debug(f"Trying S&S endpoint {i}/{len(endpoints_to_try)}: {url}")
                
                try:
                    if "item/lookup" in url:
                        # POST with JSON body
                        payload = {"pluNumber": barcode}
                        if store_id:
                            payload["storeId"] = store_id
                        response = self.meijer._make_request("POST", url, headers=headers, json=payload)
                    else:
                        # GET request
                        response = self.meijer._make_request("GET", url, headers=headers)
                    
                    if response.status_code == 200:
                        self.logger.info(f"✅ Found working Shop & Scan endpoint: {url}")
                        break
                    elif response.status_code == 404:
                        self.logger.debug(f"❌ S&S Endpoint {i} returned 404: {url}")
                        continue
                    else:
                        self.logger.debug(f"⚠️  S&S Endpoint {i} returned {response.status_code}: {url}")
                        continue
                        
                except Exception as e:
                    self.logger.debug(f"❌ S&S Endpoint {i} failed: {e}")
                    continue
            else:
                # All Shop & Scan endpoints failed
                self.logger.debug(f"All Shop & Scan endpoints failed for barcode {barcode}")
                return None

            if response.status_code == 200:
                data = response.json()
                self.logger.info(f"Successfully looked up barcode {barcode} via Shop & Scan")
                self.logger.debug(f"S&S Response data: {data}")
                
                # Parse response based on ShopAndScanLookupItem structure
                result = {
                    "id": data.get("id"),
                    "title": data.get("title", "Unknown Product"),
                    "barcode": barcode,
                    "unitPrice": data.get("unitPrice"),
                    "isWeighted": data.get("isWeighted", False),
                    "imageUrl": data.get("imageUrl"),
                    "quantity": data.get("quantity", 1),
                    "raw_response": data  # Include full response for debugging
                }
                
                # Log pricing info
                if result["unitPrice"]:
                    price_str = f"${result['unitPrice']:.2f}"
                    if result["isWeighted"]:
                        price_str += " per lb"
                    self.logger.info(f"Product: {result['title']} - Price: {price_str}")
                
                return result
                
            elif response.status_code == 404:
                self.logger.debug(f"Barcode {barcode} not found in Shop & Scan system")
                return None
            else:
                self.logger.debug(f"Shop & Scan lookup failed: {response.status_code} - {response.text}")
                return None

        except Exception as e:
            self.logger.debug(f"Shop & Scan lookup error for barcode {barcode}: {e}")
            return None

    def bulk_lookup_barcodes(self, barcodes: List[str], store_id: Optional[str] = None) -> Dict[str, Optional[Dict[str, Any]]]:
        """
        Look up multiple barcodes efficiently.
        
        Args:
            barcodes: List of UPC/barcodes to look up
            store_id: Optional store ID for location-specific pricing
            
        Returns:
            Dict mapping barcode -> product info (or None if not found)
        """
        results = {}
        
        self.logger.info(f"Looking up {len(barcodes)} barcodes")
        
        for i, barcode in enumerate(barcodes, 1):
            self.logger.debug(f"Processing barcode {i}/{len(barcodes)}: {barcode}")
            results[barcode] = self.lookup_barcode_price(barcode, store_id)
            
            # Small delay to be respectful to API
            import time
            time.sleep(0.1)
        
        # Summary
        found_count = sum(1 for result in results.values() if result is not None)
        self.logger.info(f"Successfully found {found_count}/{len(barcodes)} products")
        
        return results

    def get_trip_summary(self) -> Optional[dict]:
        """Get current trip summary."""
        if not self.current_trip:
            return None

        return {
            "trip_id": self.current_trip.trip_id,
            "store_id": self.current_trip.store_id,
            "item_count": len(self.current_trip.items),
            "subtotal": self.current_trip.subtotal,
            "tax": self.current_trip.tax,
            "total": self.current_trip.total,
            "status": self.current_trip.status,
        }

    def finalize_checkout(self) -> bool:
        """Finalize the Shop & Scan checkout."""
        try:
            if not self.current_trip:
                self.logger.error("No active Shop & Scan trip to finalize")
                return False

            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["finalize"])
            headers = self.meijer._get_api_headers()
            headers.update({"Content-Type": "application/json"})

            data = {"tripId": self.current_trip.trip_id}
            response = self.meijer._make_request(
                "POST", url, headers=headers, json=data
            )

            if response.status_code == 200:
                checkout_data = response.json()

                # Update trip with final totals
                self.current_trip.tax = checkout_data.get("tax", 0.0)
                self.current_trip.total = checkout_data.get(
                    "total", self.current_trip.subtotal
                )
                self.current_trip.status = "completed"

                self.logger.info(
                    f"Shop & Scan checkout finalized: ${self.current_trip.total}"
                )
                return True
            else:
                self.logger.error(
                    f"Failed to finalize checkout: {response.status_code}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error finalizing checkout: {e}")
            return False

    def end_trip(self) -> bool:
        """End the current Shop & Scan trip."""
        try:
            if not self.current_trip:
                return True  # No trip to end

            url = urljoin(self.meijer.api_base_url, self.endpoints["end_trip"])
            headers = self.meijer._get_api_headers()
            headers.update({"Content-Type": "application/json"})

            data = {"tripId": self.current_trip.trip_id}
            response = self.meijer._make_request(
                "POST", url, headers=headers, json=data
            )

            if response.status_code in [200, 204]:
                self.logger.info(f"Ended Shop & Scan trip: {self.current_trip.trip_id}")
                self.current_trip = None
                return True
            else:
                self.logger.warning(
                    f"Failed to end trip cleanly: {response.status_code}"
                )
                self.current_trip = None  # Clear anyway
                return False

        except Exception as e:
            self.logger.error(f"Error ending trip: {e}")
            self.current_trip = None  # Clear anyway
            return False
