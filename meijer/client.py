"""
Main Meijer API client.

This module provides the main client class for interacting with Meijer's APIs,
based on actual endpoint analysis from the decompiled APK and network logs.
"""

import json
import logging
from datetime import datetime, timedelta
from pathlib import Path
from typing import Any, Dict, List, Optional, Union

from .coupon_operations import CouponOperations
from .coupons import MeijerCouponManager
from .exceptions import MeijerAPIError, MeijerAuthenticationError
from .feedback import MeijerFeedback
from .models import ListItem, MeijerCoupon, MeijerItem, SearchResult, Store
from .mperks import (
    EarnableOffer,
    EarnedReward,
    EarnTabData,
    MCardInfo,
    MPerksEarnedRewards,
)
from .product_operations import ProductOperations
from .search import Search
from .settings import MeijerSettings
from .shop_scan import ShopNScan
from .shopping_list import MeijerList
from .stores import MeijerStore


class Meijer:
    """
    Main client for Meijer API interactions.

    This class provides access to all Meijer API functionality including:
    - Authentication and token management
    - Shopping lists and favorites
    - Coupons and offers
    - Product search
    - Shop & Scan functionality
    - Store information
    """

    def __init__(self, auth: Optional[str] = None):
        """
        Initialize Meijer client.

        Args:
            auth: Authentication method - can be:
                - Path to auth.txt file with bearer=token or user=email&password=pass
                - Path to mitmproxy log file
                - None to auto-detect from ~/.config/meijer.txt
        """
        self.logger = logging.getLogger(__name__)

        # API configuration based on APK analysis
        self.api_base_url = "https://api.meijer.com"
        self.subscription_key = "a10bc58ac484478d9b3958b1742c3a03"  # From APK analysis

        # Initialize sub-components
        self.shopping_list = MeijerList(self)
        self.coupons = MeijerCouponManager(self)
        self.coupon_ops = CouponOperations(self)
        self.product_ops = ProductOperations(self)
        self.search = Search(self)
        self.shop_scan = ShopNScan(self)
        self.mperks = MPerksEarnedRewards(self)
        self.feedback = MeijerFeedback(self)
        self.settings = MeijerSettings(self)

        # Initialize cart instance
        try:
            from .cart import MeijerCart

            self.cart = MeijerCart(self, store_id="217")
        except ImportError:
            self.logger.warning("Cart module not available")
            self.cart = None

        # Add alias for CLI compatibility
        self.list = self.shopping_list

        # Authentication state
        self._access_token = None
        self._refresh_token = None
        self._token_expires_at = None
        self._user_credentials = None

        # Load authentication
        self._load_auth(auth)

    def _load_auth(self, auth: Optional[str] = None):
        """Load authentication credentials from various sources."""
        if auth:
            if auth.endswith(".log"):
                self._load_auth_from_log(auth)
            else:
                self._load_auth_from_file(auth)
        else:
            self._load_auth_from_config()

    def _load_auth_from_file(self, auth_file: str):
        """Load authentication from plain text auth file."""
        try:
            with open(auth_file, "r") as f:
                lines = f.readlines()

            # Look for bearer token or user/password in any line
            bearer_token = None
            user = None
            password = None

            for line in lines:
                line = line.strip()
                # Skip empty lines and comments
                if not line or line.startswith("#"):
                    continue

                if line.startswith("bearer="):
                    bearer_token = line[7:]  # Remove 'bearer=' prefix
                elif line.startswith("user="):
                    user = line[5:]
                elif line.startswith("password="):
                    password = line[9:]

            # Use bearer token if found
            if bearer_token:
                self._access_token = bearer_token
                self.logger.info("Loaded bearer token from auth file")
                return

            # Use user/password if found
            if user and password:
                self._user_credentials = (user, password)
                self.logger.info("Loaded user credentials from auth file")
                return

            # If neither found, raise error
            raise ValueError("No valid authentication found in auth file")

        except Exception as e:
            self.logger.error(f"Failed to load auth file: {e}")
            raise

    def _load_auth_from_config(self):
        """Load authentication from ~/.config/meijer.txt."""
        config_path = Path.home() / ".config" / "meijer.txt"
        if config_path.exists():
            try:
                with open(config_path, "r") as f:
                    config = json.load(f)

                self._access_token = config.get("access_token")
                self._refresh_token = config.get("refresh_token")

                if self._access_token:
                    self.logger.info("Loaded authentication from config file")
                    return

            except Exception as e:
                self.logger.warning(f"Failed to load config file: {e}")

        self.logger.info("No authentication found in config file")

    def _ensure_authenticated(self) -> bool:
        """Ensure we have a valid access token."""
        if not self._access_token:
            raise MeijerAuthenticationError("No access token available")

        # Check if token is expired or about to expire
        if (
            self._token_expires_at
            and datetime.now() >= self._token_expires_at - timedelta(minutes=5)
        ):
            self.logger.info("Token expired or expiring soon, refreshing...")
            if not self._refresh_token():
                raise MeijerAuthenticationError("Failed to refresh token")

        return True

    def _refresh_token(self) -> bool:
        """Refresh the access token using refresh token."""
        if not self._refresh_token:
            self.logger.error("No refresh token available")
            return False

        try:
            # This would require implementing the actual refresh endpoint
            # For now, just log that we need to implement this
            self.logger.info("Token refresh not yet implemented")
            return False
        except Exception as e:
            self.logger.error(f"Failed to refresh token: {e}")
            return False

    def _get_api_headers(self) -> Dict[str, str]:
        """Get headers required for API requests."""
        headers = {
            "user-agent": "Meijer/101200000 okhttp/4.12.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)",
            "accept-encoding": "gzip",
        }

        # Use Bearer token for authenticated endpoints
        if self._access_token:
            headers["Authorization"] = f"Bearer {self._access_token}"

        # Always include subscription key as some endpoints require both
        # This is the public key from APK analysis and is safe to include
        headers["ocp-apim-subscription-key"] = self.subscription_key

        return headers

    def _make_request(
        self,
        method: str,
        url: str,
        headers: Optional[Dict[str, str]] = None,
        params: Optional[Dict[str, Any]] = None,
        json_data: Optional[Dict[str, Any]] = None,
        **kwargs,
    ) -> Any:
        """Make HTTP request with proper error handling."""
        import requests

        try:
            # Use default headers if none provided
            if headers is None:
                headers = self._get_api_headers()

            # Make request
            response = requests.request(
                method=method,
                url=url,
                headers=headers,
                params=params,
                json=json_data,
                timeout=30,
                **kwargs,
            )

            # Log request details
            self.logger.debug(f"{method} {url} - Status: {response.status_code}")

            return response

        except Exception as e:
            self.logger.error(f"Request failed: {e}")
            raise MeijerAPIError(f"Request failed: {e}")

    def get_order_history(
        self, current_page: int = 0, page_size: int = 10, fields: str = "FULL"
    ) -> List[Dict[str, Any]]:
        """
        Get order history for the authenticated user.

        Args:
            current_page: Page number for pagination (0-based)
            page_size: Number of orders per page
            fields: Fields to include in response (FULL, BASIC, etc.)

        Returns:
            List of order information dictionaries
        """
        try:
            params = {
                "currentPage": current_page,
                "pageSize": page_size,
                "fields": fields,
            }

            response = self._make_request(
                "GET", f"{self.api_base_url}/digital/occ/v3/orders", params=params
            )

            if response and response.status_code == 200:
                data = response.json()
                return data.get("orders", [])
            else:
                self.logger.warning(
                    f"Failed to get order history: {response.status_code if response else 'No response'}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Error getting order history: {e}")
            return []

    def get_stores(
        self,
        zip_code: Optional[str] = None,
        latitude: Optional[float] = None,
        longitude: Optional[float] = None,
        radius: Optional[int] = None,
    ) -> List[MeijerStore]:
        """
        Get list of Meijer stores with enhanced proximity search support.

        Args:
            zip_code: Optional ZIP code for location-based search
            latitude: Optional latitude for location-based search
            longitude: Optional longitude for location-based search
            radius: Optional radius in miles for proximity search (uses enhanced API)

        Returns:
            List of MeijerStore objects
        """
        # If radius is specified, use the enhanced proximity search
        if radius and latitude and longitude:
            return self.find_stores_nearby(latitude, longitude, radius)

        # Otherwise, fall back to the basic store endpoint
        try:
            # Actual endpoint from APK analysis
            url = f"{self.api_base_url}/stores"

            params = {}
            if zip_code:
                params["zipCode"] = zip_code
            if latitude and longitude:
                params["latitude"] = latitude
                params["longitude"] = longitude

            response = self._make_request("GET", url, params=params)

            if response.status_code == 200:
                data = response.json()
                stores = []

                for store_data in data.get("stores", []):
                    store = Store(
                        store_id=store_data.get("storeId", ""),
                        name=store_data.get("name", ""),
                        address=store_data.get("address", ""),
                        city=store_data.get("city", ""),
                        state=store_data.get("state", ""),
                        zip_code=store_data.get("zipCode", ""),
                        phone=store_data.get("phone"),
                        hours=store_data.get("hours"),
                        latitude=store_data.get("latitude"),
                        longitude=store_data.get("longitude"),
                        distance=store_data.get("distance"),
                        is_open=store_data.get("isOpen", True),
                        services=store_data.get("services", []),
                        raw_data=store_data,
                    )
                    stores.append(store)

                return stores
            else:
                self.logger.warning(f"Failed to get stores: {response.status_code}")
                return []

        except Exception as e:
            self.logger.error(f"Error getting stores: {e}")
            return []

    def find_stores_nearby(
        self,
        latitude: float,
        longitude: float,
        radius_miles: int = 100,
        max_results: int = 50,
    ) -> List[MeijerStore]:
        """
        Find Meijer stores near given coordinates using proximity search.

        Args:
            latitude: Search latitude
            longitude: Search longitude
            radius_miles: Search radius in miles (default: 100)
            max_results: Maximum number of stores to return (default: 50)

        Returns:
            List of MeijerStore objects sorted by distance
        """
        try:
            # Use the storeInfo proximity endpoint for better results
            url = "https://api.meijer.com/digital/storeInfo/v2/stores/proximity"

            params = {
                "latitude": latitude,
                "longitude": longitude,
                "miles": radius_miles,
                "numToReturn": max_results,
                "dataVariant": 2,  # From APK analysis
            }

            # Use the correct headers from APK analysis
            headers = {
                "Accept": "application/json",
                "Content-Type": "application/json",
                "Version": "9",  # Required header from APK
                "ocp-apim-subscription-key": self.subscription_key,
            }

            # Add authorization if available
            if hasattr(self, "_access_token") and self._access_token:
                headers["authorization"] = f"Bearer {self._access_token}"

            # Use the client's request method with custom headers
            response = self._make_request("GET", url, headers=headers, params=params)

            if response.status_code == 200:
                data = response.json()
                self.logger.info(f"API Response: {data}")
                stores = []

                # Parse the response data into MeijerStore objects
                for store_data in data.get("stores", []):
                    try:
                        # Ensure UnitId is present and not empty
                        if not store_data.get("UnitId"):
                            self.logger.warning(
                                "Failed to parse store data: Unit ID cannot be empty"
                            )
                            continue
                        store = MeijerStore.from_api_data(store_data, self)
                        stores.append(store)
                    except Exception as e:
                        self.logger.warning(f"Failed to parse store data: {e}")
                        continue

                self.logger.info(
                    f"Found {len(stores)} stores within {radius_miles} miles of ({latitude}, {longitude})"
                )
                return stores
            else:
                self.logger.warning(f"Failed to get stores: {response.status_code}")
                self.logger.warning(f"Response content: {response.text}")
                return []

        except Exception as e:
            self.logger.error(f"Error finding stores nearby: {e}")
            return []

    def get_store_by_id(self, store_id: str) -> Optional[MeijerStore]:
        """
        Get detailed store information by UnitId (store ID).

        This uses the storeInfo v2 proximity endpoint with a large radius to find
        the specific store by ID, which includes richer fields such as gas station
        amenities and hours when available.

        Parameters
        ----------
        store_id : str
            Meijer UnitId for the store

        Returns
        -------
        MeijerStore, optional
            Parsed store information if found, None otherwise
        """
        try:
            # Use the proximity endpoint with a large radius to find the store
            # This approach is more reliable than direct store ID lookup
            url = "https://api.meijer.com/digital/storeInfo/v2/stores/proximity"

            # Use coordinates near the center of Michigan as a starting point
            # The API will return stores within the radius, and we'll filter by ID
            params = {
                "latitude": 44.3148,  # Center of Michigan
                "longitude": -85.6024,
                "miles": 500,  # Large radius to ensure we find the store
                "numToReturn": 100,  # Get more stores to increase chances of finding the target
                "dataVariant": 2,
            }

            # Headers required by storeInfo APIs
            headers = {
                "Accept": "application/json",
                "Content-Type": "application/json",
                "Version": "9",
                "ocp-apim-subscription-key": self.subscription_key,
            }

            if hasattr(self, "_access_token") and self._access_token:
                headers["authorization"] = f"Bearer {self._access_token}"

            response = self._make_request("GET", url, headers=headers, params=params)

            if response.status_code != 200:
                self.logger.warning(
                    f"Failed to get store by id {store_id}: {response.status_code}"
                )
                return None

            data = response.json()

            # Handle different response formats
            if isinstance(data, dict):
                # Check for 'stores' key (plural) - proximity search response
                if "stores" in data:
                    stores_data = data["stores"]
                    self.logger.info(f"Found {len(stores_data)} stores in response")
                    if isinstance(stores_data, list):
                        for store_data in stores_data:
                            if isinstance(store_data, dict) and str(
                                store_data.get("UnitId")
                            ) == str(store_id):
                                self.logger.info(f"Found target store {store_id}")
                                return MeijerStore.from_api_data(store_data, self)

                        # If we didn't find the exact store, log what we did find
                        found_ids = [
                            str(s.get("UnitId")) for s in stores_data if s.get("UnitId")
                        ]
                        self.logger.warning(
                            f"Store {store_id} not found. Available store IDs: {found_ids[:10]}..."
                        )
                        return None
                    else:
                        self.logger.warning("Unexpected stores data format in response")
                        return None

                # Check for 'store' key (singular) - direct store lookup response
                elif "store" in data:
                    store_data = data["store"]
                    self.logger.info("Found 'store' key in response")

                    # Handle case where 'store' is a list
                    if isinstance(store_data, list):
                        for store_item in store_data:
                            if isinstance(store_item, dict):
                                store_id_from_response = str(store_item.get("UnitId"))
                                if store_id_from_response == str(store_id):
                                    self.logger.info(f"Found target store {store_id}")
                                    return MeijerStore.from_api_data(store_item, self)

                        # If we didn't find the exact store, log what we did find
                        found_ids = [
                            str(s.get("UnitId"))
                            for s in store_data
                            if isinstance(s, dict) and s.get("UnitId")
                        ]
                        self.logger.warning(
                            f"Store {store_id} not found in list. Available store IDs: {found_ids[:10]}..."
                        )
                        return None

                    # Handle case where 'store' is a single dict
                    elif isinstance(store_data, dict):
                        store_id_from_response = str(store_data.get("UnitId"))
                        if store_id_from_response == str(store_id):
                            self.logger.info(f"Found target store {store_id}")
                            return MeijerStore.from_api_data(store_data, self)
                        else:
                            self.logger.warning(
                                f"Store ID mismatch. Expected: {store_id}, Got: {store_id_from_response}"
                            )
                            return None
                    else:
                        self.logger.warning("Unexpected store data format in response")
                        return None

                # Check for other wrapper formats
                elif "data" in data and isinstance(data["data"], list):
                    stores_data = data["data"]
                    for store_data in stores_data:
                        if isinstance(store_data, dict) and str(
                            store_data.get("UnitId")
                        ) == str(store_id):
                            self.logger.info(f"Found target store {store_id}")
                            return MeijerStore.from_api_data(store_data, self)
                    return None

                # Check if the data itself is a store
                elif "UnitId" in data:
                    if str(data.get("UnitId")) == str(store_id):
                        self.logger.info(f"Found target store {store_id}")
                        return MeijerStore.from_api_data(data, self)
                    else:
                        return None

                else:
                    self.logger.warning("Unexpected storeInfo response format")
                    self.logger.info(f"Response structure: {type(data)}")
                    if isinstance(data, dict):
                        self.logger.info(f"Response keys: {list(data.keys())}")
                    return None
            else:
                self.logger.warning(f"Response is not a dict: {type(data)}")
                return None

        except Exception as e:
            self.logger.error(f"Error getting store by id {store_id}: {e}")
            return None

    def get_offers(
        self, store_id: Optional[str] = None, limit: int = 100
    ) -> List[MeijerCoupon]:
        """Get available offers/coupons using the coupon operations module."""
        return self.coupon_ops.get_offers(store_id=store_id, limit=limit)

    def get_coupons(
        self, limit: int = 1000, use_pagination: bool = True
    ) -> List[MeijerCoupon]:
        """Get available coupons with pagination support using the coupon operations module."""
        return self.coupon_ops.get_coupons(limit=limit, use_pagination=use_pagination)

    def get_all_coupons(self) -> List[MeijerCoupon]:
        """Get all available coupons using the most effective method via coupon operations module."""
        return self.coupon_ops.get_all_coupons()

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
        return self.shop_scan.lookup_barcode_price(barcode, store_id)

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
        return self.shop_scan.bulk_lookup_barcodes(barcodes, store_id)

    def search_products(
        self, query: str, results_per_page: int = 24, page: int = 1
    ) -> SearchResult:
        """
        Search for products.

        Args:
            query: Search query string
            results_per_page: Number of results per page
            page: Page number (1-based)

        Returns:
            SearchResult object containing search results
        """
        return self.search.search(query, results_per_page, page)

    def get_shopping_list(self) -> List[ListItem]:
        """Get current shopping list items."""
        return self.shopping_list.get_list()

    def get_favorites(self) -> List[ListItem]:
        """Get current favorites list items."""
        return self.shopping_list.get_favorites()

    def add_to_shopping_list(
        self, item: Union[str, MeijerItem], quantity: int = 1
    ) -> bool:
        """
        Add item to shopping list.

        Args:
            item: Item to add (string description or MeijerItem)
            quantity: Quantity to add

        Returns:
            True if successful, False otherwise
        """
        if isinstance(item, str):
            return self.shopping_list.add_item(item, quantity)
        else:
            return self.shopping_list.add_item(item.title, quantity, item.upc)

    def add_to_favorites(self, item: Union[str, MeijerItem]) -> bool:
        """
        Add item to favorites list.

        Args:
            item: Item to add (string description or MeijerItem)

        Returns:
            True if successful, False otherwise
        """
        if isinstance(item, str):
            return self.shopping_list.add_favorite(item)
        else:
            return self.shopping_list.add_favorite(item.title, item.upc)

    def remove_from_shopping_list(self, item_id: int) -> bool:
        """
        Remove item from shopping list.

        Args:
            item_id: ID of item to remove

        Returns:
            True if successful, False otherwise
        """
        return self.shopping_list.delete_item(item_id)

    def remove_from_favorites(self, item_id: int) -> bool:
        """
        Remove item from favorites list.

        Args:
            item_id: ID of item to remove

        Returns:
            True if successful, False otherwise
        """
        return self.shopping_list.delete_favorite(item_id)

    def complete_shopping_list_item(self, item_id: int) -> bool:
        """
        Mark shopping list item as complete.

        Args:
            item_id: ID of item to mark complete

        Returns:
            True if successful, False otherwise
        """
        return self.shopping_list.complete_item(item_id)

    def clip_coupon(self, coupon_id: int) -> bool:
        """
        Clip a coupon.

        Args:
            coupon_id: ID of coupon to clip

        Returns:
            True if successful, False otherwise
        """
        return self.coupons.clip_coupon(coupon_id)

    def unclip_coupon(self, coupon_id: int) -> bool:
        """
        Unclip a coupon.

        Args:
            coupon_id: ID of coupon to unclip

        Returns:
            True if successful, False otherwise
        """
        return self.coupons.unclip_coupon(coupon_id)

    def save_tokens(self):
        """Save current tokens to config file."""
        if not self._access_token:
            self.logger.warning("No access token to save")
            return

        try:
            config_path = Path.home() / ".config" / "meijer.txt"
            config_path.parent.mkdir(parents=True, exist_ok=True)

            config = {
                "access_token": self._access_token,
                "refresh_token": self._refresh_token,
                "updated_at": datetime.now().isoformat(),
            }

            with open(config_path, "w") as f:
                json.dump(config, f, indent=2)

            self.logger.info("Tokens saved to config file")

        except Exception as e:
            self.logger.error(f"Failed to save tokens: {e}")

    def is_authenticated(self) -> bool:
        """Check if client is authenticated."""
        return self._access_token is not None

    @property
    def auth_status(self):
        """Get current authentication status."""
        from .enums import AuthenticationStatus

        if not self._access_token:
            return AuthenticationStatus.UNAUTHENTICATED

        # Check if token is expired
        if self._token_expires_at and datetime.now() > self._token_expires_at:
            return AuthenticationStatus.EXPIRED

        return AuthenticationStatus.AUTHENTICATED

    @property
    def user_id(self) -> str:
        """Get the current user ID."""
        try:
            account_details = self.settings.get_account_details()
            if account_details and account_details.get("accountId"):
                return str(account_details["accountId"])

            # Fallback to account ID from token
            return str(self._get_account_id())
        except Exception as e:
            self.logger.warning(f"Could not determine user ID: {e}")
            return "unknown"

    @property
    def home_store_id(self) -> str:
        """Get the home store ID."""
        try:
            account_details = self.settings.get_account_details()
            if account_details and account_details.get("homeStoreId"):
                return str(account_details["homeStoreId"])

            # Fallback to default store
            return "217"
        except Exception as e:
            self.logger.warning(f"Could not determine home store ID: {e}")
            return "217"

    # mPerks convenience methods
    def get_earned_rewards(self, **kwargs) -> List[EarnedReward]:
        """
        Get earned rewards from mPerks.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of EarnedReward objects
        """
        return self.mperks.get_earned_rewards(**kwargs)

    def get_mcard_info(self, **kwargs) -> MCardInfo:
        """
        Get mCard information from mPerks.

        Args:
            **kwargs: Additional query parameters

        Returns:
            MCardInfo object
        """
        return self.mperks.get_mcard_info(**kwargs)

    def get_available_rewards(self, **kwargs) -> List[EarnedReward]:
        """
        Get available rewards that can be earned.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of EarnedReward objects
        """
        return self.mperks.get_available_rewards(**kwargs)

    def get_reward_categories(
        self, clip_filter: str = "unclippedonly", **kwargs
    ) -> List[str]:
        """
        Get available reward categories.

        Args:
            clip_filter: Filter for clipped/unclipped offers ("clippedonly", "unclippedonly")
            **kwargs: Additional query parameters

        Returns:
            List of category names
        """
        return self.mperks.get_reward_categories(clip_filter, **kwargs)

    def get_earn_offers(self, **kwargs) -> EarnTabData:
        """
        Get all earn offers data including in-progress, available, and all offers.

        Args:
            **kwargs: Additional query parameters

        Returns:
            EarnTabData object containing all earn tab information
        """
        return self.mperks.get_earn_offers(**kwargs)

    def get_earn_offers_in_progress(self, **kwargs) -> List[EarnableOffer]:
        """
        Get only in-progress earn offers.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of EarnableOffer objects that are in progress
        """
        return self.mperks.get_earn_offers_in_progress(**kwargs)

    def get_earn_offers_available(self, **kwargs) -> List[EarnableOffer]:
        """
        Get only available earn offers.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of EarnableOffer objects that are available
        """
        return self.mperks.get_earn_offers_available(**kwargs)

    def get_earn_offers_all(self, **kwargs) -> List[EarnableOffer]:
        """
        Get only available earn offers.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of all EarnableOffer objects
        """
        return self.mperks.get_earn_offers_all(**kwargs)

    def feedback(self, feedback_type: str, **kwargs) -> Dict[str, Any]:
        """
        Convenience method for submitting feedback of any type.

        This method provides a simple interface to submit feedback without needing
        to manually create device data or call specific feedback methods.

        Parameters
        ----------
        feedback_type : str
            Type of feedback: "app", "shop_scan", "store", or "general"
        **kwargs : Dict[str, Any]
            Feedback parameters. See MeijerFeedback.submit_feedback_generic() for details.

        Returns
        -------
        Dict[str, Any]
            Response from the feedback API

        Examples
        --------
        # Submit app feedback
        result = meijer.feedback("app", feedback_text="Great app!", rating=9)

        # Submit store feedback
        result = meijer.feedback("store", store_name="North Muskegon",
                                store_comment="Best store ever!", rating=10)

        # Submit shop & scan feedback
        result = meijer.feedback("shop_scan", feedback_text="Worked perfectly",
                                store_name="Grand Rapids", rating=8)
        """
        # Create default device data if not provided
        if "device_data" not in kwargs:
            kwargs["device_data"] = self.feedback.create_default_device_data()

        # Submit feedback using the generic method
        return self.feedback.submit_feedback_generic(feedback_type, **kwargs)

    def _get_account_id(self) -> int:
        """
        Get the current account ID.

        This method extracts the account ID from the authentication token
        or returns a default value if not available.

        Returns:
            int: Account ID
        """
        try:
            # Try to get account ID from account details first
            account_details = self.settings.get_account_details()
            if account_details and account_details.get("accountId"):
                return int(account_details["accountId"])

            # Fallback: try to extract from token if it's a JWT
            if self._access_token and "." in self._access_token:
                try:
                    import jwt

                    payload = jwt.decode(
                        self._access_token, options={"verify_signature": False}
                    )
                    if payload.get("sub"):
                        return int(payload["sub"])
                except (ImportError, Exception):
                    pass

            # Final fallback: return default from log analysis
            return 13266596

        except Exception as e:
            self.logger.warning(f"Could not determine account ID: {e}")
            return 13266596

    def get_product_detail(
        self, upc: str, store_id: Optional[str] = None
    ) -> Optional[MeijerItem]:
        """Get detailed product information by UPC using the product operations module."""
        return self.product_ops.get_product_detail(upc, store_id)

    def _parse_product_detail_response(
        self, data: Dict[str, Any], upc: str
    ) -> MeijerItem:
        """Parse product detail response using the product operations module."""
        return self.product_ops._parse_product_detail_response(data, upc)

    def _extract_location_from_product_detail(
        self, data: Dict[str, Any]
    ) -> Optional[Dict[str, str]]:
        """Extract aisle location information using the product operations module."""
        return self.product_ops._extract_location_from_product_detail(data)

    def _parse_ilc_location(self, ilc_string: str) -> Optional[Dict[str, str]]:
        """Parse ILC location using the product operations module."""
        return self.product_ops._parse_ilc_location(ilc_string)

    def _format_location_string(
        self, aisle: Optional[str], section: Optional[str], bay: Optional[str]
    ) -> str:
        """Format location string using the product operations module."""
        return self.product_ops._format_location_string(aisle, section, bay)

    def _extract_location_from_text(self, text: str) -> Optional[Dict[str, str]]:
        """
        Extract location information from text using regex patterns.

        Args:
            text: Text to search for location patterns

        Returns:
            Dictionary with location information or None
        """
        import re

        # Pattern for "B16 Section 23" (direct format)
        pattern1 = r"([A-Z])(\d+)\s+Section\s+(\d+)"
        match1 = re.search(pattern1, text, re.IGNORECASE)
        if match1:
            aisle_letter = match1.group(1)  # "B"
            section_num = match1.group(2)  # "16"
            bay_num = match1.group(3)  # "23"

            # Combine aisle letter and section number for the aisle field
            combined_aisle = f"{aisle_letter}{section_num}"

            return {
                "aisle": combined_aisle,  # "B16"
                "section": bay_num,  # "23" (the bay number)
                "bay": bay_num,  # "23" (for backward compatibility)
                "formatted_location": f"{combined_aisle} Section {bay_num}",
            }

        # Pattern for "Aisle B | 16 Section: 35" (API format)
        pattern2 = r"Aisle\s+([A-Z0-9]+)\s*\|\s*(\d+)\s*Section:\s*(\d+)"
        match2 = re.search(pattern2, text, re.IGNORECASE)
        if match2:
            aisle_letter = match2.group(1)  # "B"
            section_num = match2.group(2)  # "16"
            bay_num = match2.group(3)  # "35"

            # Combine aisle letter and section number for the aisle field
            combined_aisle = f"{aisle_letter}{section_num}"

            return {
                "aisle": combined_aisle,  # "B16"
                "section": bay_num,  # "35" (the bay number)
                "bay": bay_num,  # "35" (for backward compatibility)
                "formatted_location": f"{combined_aisle} Section {bay_num}",
            }

        # Pattern for "B | 16 Section: 35" (alternative API format)
        pattern3 = r"([A-Z0-9]+)\s*\|\s*(\d+)\s*Section:\s*(\d+)"
        match3 = re.search(pattern3, text, re.IGNORECASE)
        if match3:
            aisle_letter = match3.group(1)  # "B"
            section_num = match3.group(2)  # "16"
            bay_num = match3.group(3)  # "35"

            # Combine aisle letter and section number for the aisle field
            combined_aisle = f"{aisle_letter}{section_num}"

            return {
                "aisle": combined_aisle,  # "B16"
                "section": bay_num,  # "35" (the bay number)
                "bay": bay_num,  # "35" (for backward compatibility)
                "formatted_location": f"{combined_aisle} Section {bay_num}",
            }

        # Pattern for "Aisle B | Section 16" (simplified format)
        pattern4 = r"Aisle\s+([A-Z0-9]+)\s*\|\s*Section\s+(\d+)"
        match4 = re.search(pattern4, text, re.IGNORECASE)
        if match4:
            aisle_letter = match4.group(1)  # "B"
            section_num = match4.group(2)  # "16"

            # Combine aisle letter and section number
            combined_aisle = f"{aisle_letter}{section_num}"

            return {
                "aisle": combined_aisle,  # "B16"
                "section": section_num,  # "16"
                "formatted_location": f"{combined_aisle} Section {section_num}",
            }

        # Pattern for just "Aisle B" (basic format)
        pattern5 = r"Aisle\s+([A-Z0-9]+)"
        match5 = re.search(pattern5, text, re.IGNORECASE)
        if match5:
            aisle_letter = match5.group(1)  # "B"
            return {
                "aisle": aisle_letter,  # "B"
                "formatted_location": f"Aisle {aisle_letter}",
            }

        return None
