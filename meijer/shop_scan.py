"""
Meijer Shop & Scan Functionality
===============================

Shop & Scan functionality for the Meijer API client.
"""

from typing import List, Optional, TYPE_CHECKING
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
        if self.current_trip:
            return self.current_trip.items.copy()
        else:
            return []

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
