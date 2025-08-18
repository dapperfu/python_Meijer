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

from .shopping_list import MeijerList
from .coupons import MeijerCouponManager
from .search import Search
from .shop_scan import ShopNScan
from .mperks import MPerksEarnedRewards, EarnedReward, MCardInfo
from .feedback import MeijerFeedback
from .settings import MeijerSettings
from .models import MeijerItem, ListItem, MeijerCoupon, Store, SearchResult
from .stores import MeijerStore
from .exceptions import MeijerAuthenticationError, MeijerAPIError


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

        # Initialize component instances
        self.shopping_list = MeijerList(self)
        self.coupons = MeijerCouponManager(self)
        self.search = Search(self)
        self.shop_scan = ShopNScan(self)
        self.mperks = MPerksEarnedRewards(self)
        self.feedback = MeijerFeedback(self)
        self.settings = MeijerSettings(self)

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

    def get_offers(
        self, store_id: Optional[str] = None, limit: int = 100
    ) -> List[MeijerCoupon]:
        """
        Get available offers/coupons.

        Args:
            store_id: Optional store ID for store-specific offers
            limit: Maximum number of offers to return

        Returns:
            List of MeijerCoupon objects
        """
        try:
            # Actual endpoint from APK analysis
            url = f"{self.api_base_url}/loyalty/mPerks/api/offers"

            # Request body based on APK analysis
            data = {
                "sortType": "BySuggested",
                "pageSize": min(limit, 9999),  # API limit from APK analysis
                "currentPage": 1,
                "offerClass": 1,
                "searchCriteria": "",
                "storeId": int(store_id) if store_id else 0,
                "ceilingCount": 0,
                "ceilingDuration": 0,
                "rewardCouponId": 0,
                "tagId": "",
                "getOfferCountPerDepartment": True,
                "upcList": [],
                "showClippedCoupons": True,
                "showOnlySpecialOffers": False,
                "showRedeemedOffers": False,
                "offerIds": [],
                "displayReasonFilters": [],
            }

            headers = self._get_api_headers()
            headers.update(
                {
                    "accept": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
                    "content-type": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
                }
            )

            response = self._make_request("POST", url, headers=headers, json_data=data)

            if response.status_code == 200:
                data = response.json()
                return self.coupons.create_meijer_coupons_from_response(data)
            else:
                self.logger.warning(f"Failed to get offers: {response.status_code}")
                return []

        except Exception as e:
            self.logger.error(f"Error getting offers: {e}")
            return []

    def get_coupons(
        self, limit: int = 1000, use_pagination: bool = True
    ) -> List[MeijerCoupon]:
        """
        Get available coupons with pagination support.

        Args:
            limit: Maximum number of coupons to return
            use_pagination: Whether to use pagination for large requests

        Returns:
            List of MeijerCoupon objects
        """
        try:
            # Actual endpoint from APK analysis
            url = f"{self.api_base_url}/loyalty/mPerks/api/offers"

            if use_pagination and limit > 100:
                # Use pagination for large requests
                all_coupons = []
                current_page = 1
                page_size = min(100, limit)  # Reasonable page size

                while len(all_coupons) < limit:
                    data = {
                        "sortType": "BySuggested",
                        "pageSize": page_size,
                        "currentPage": current_page,
                        "offerClass": 1,
                        "searchCriteria": "",
                        "storeId": 0,
                        "ceilingCount": 0,
                        "ceilingDuration": 0,
                        "rewardCouponId": 0,
                        "tagId": "",
                        "getOfferCountPerDepartment": True,
                        "upcList": [],
                        "showClippedCoupons": True,
                        "showOnlySpecialOffers": False,
                        "showRedeemedOffers": False,
                        "offerIds": [],
                        "displayReasonFilters": [],
                    }

                    headers = self._get_api_headers()
                    headers.update(
                        {
                            "accept": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
                            "content-type": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
                        }
                    )

                    response = self._make_request(
                        "POST", url, headers=headers, json_data=data
                    )

                    if response.status_code == 200:
                        page_data = response.json()
                        page_coupons = self.coupons.create_meijer_coupons_from_response(
                            page_data
                        )

                        if not page_coupons:
                            break  # No more coupons

                        all_coupons.extend(page_coupons)

                        # Check if we've reached the limit
                        if len(all_coupons) >= limit:
                            all_coupons = all_coupons[:limit]
                            break

                        current_page += 1

                        # Check if we've reached the end
                        total_coupons = page_data.get("couponCount", 0)
                        if len(all_coupons) >= total_coupons:
                            break
                    else:
                        self.logger.warning(
                            f"Failed to get coupons page {current_page}: {response.status_code}"
                        )
                        break

                self.logger.info(
                    f"Retrieved {len(all_coupons)} coupons using pagination"
                )
                return all_coupons
            else:
                # Single request for smaller limits
                return self.get_offers(limit=limit)

        except Exception as e:
            self.logger.error(f"Error getting coupons: {e}")
            return []

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
                    payload = jwt.decode(self._access_token, options={"verify_signature": False})
                    if payload.get("sub"):
                        return int(payload["sub"])
                except (ImportError, Exception):
                    pass
            
            # Final fallback: return default from log analysis
            return 13266596
            
        except Exception as e:
            self.logger.warning(f"Could not determine account ID: {e}")
            return 13266596
