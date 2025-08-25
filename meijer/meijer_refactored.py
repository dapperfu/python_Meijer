"""
Refactored Meijer API client using composition.

This module provides a clean, maintainable Meijer client that delegates
specific responsibilities to focused component classes.
"""

import logging
from typing import Any, Dict, List, Optional, Union

from .account import AccountManager
from .coupon_operations import CouponOperations
from .coupons import CouponManager
from .feedback import MeijerFeedback
from .meijer_client import MeijerClient
from .models import ListItem, MeijerItem
from .mperks import MPerksEarnedRewards
from .order_manager import OrderManager
from .product_manager import ProductManager
from .product_operations import ProductOperations
from .search import Search
from .settings import MeijerSettings
from .shop_scan import ShopNScan
from .shopping_list import MeijerList
from .store_manager import StoreManager
from .stores import MeijerStore


class StoresInterface:
    """
    Interface wrapper for store operations to maintain notebook compatibility.

    This class provides the interface that notebooks expect while delegating
    to the main client's store methods.
    """

    def __init__(self, client: "Meijer"):
        """Initialize with reference to main client."""
        self.client = client

    def get_nearby(
        self,
        latitude: Optional[float] = None,
        longitude: Optional[float] = None,
        radius: int = 25,
    ) -> List[MeijerStore]:
        """Get nearby stores."""
        if latitude is None or longitude is None:
            latitude = 44.3148  # Center of Michigan
            longitude = -85.6024

        return self.client.stores.get_stores(
            latitude=latitude, longitude=longitude, radius=radius
        )

    def search_by_location(self, location: str, radius: int = 25) -> List[MeijerStore]:
        """Search for stores by location string."""
        if not location.isdigit():
            return self.client.stores.get_stores(city=location, radius=radius)
        else:
            return self.client.stores.get_stores(zip_code=location, radius=radius)

    def search_by_proximity(
        self, lat: float, lng: float, radius: int = 25
    ) -> List[MeijerStore]:
        """Search for stores by proximity coordinates."""
        return self.client.stores.get_stores(latitude=lat, longitude=lng, radius=radius)

    def get_by_id(self, store_id: str) -> Optional[MeijerStore]:
        """Get store by ID."""
        return self.client.stores.get_store_by_id(store_id)


class Meijer:
    """
    Refactored Meijer API client using composition.

    This class provides access to all Meijer API functionality by delegating
    to focused component classes, making it more maintainable and testable.
    """

    def __init__(self, auth: Optional[str] = None, base_url: Optional[str] = None):
        """
        Initialize Meijer client.

        Args:
            auth: Authentication method - can be:
                - Path to auth.json file with bearer token or credentials
                - Path to mitmproxy log file
                - None to auto-detect from ~/.config/meijer/auth.json
            base_url: Base URL for API endpoints. If provided, will redirect all API calls
                     to this URL instead of the default Meijer domains.
                     Example: "http://127.0.0.1:5000" for local Flask server
        """
        self.logger = logging.getLogger(__name__)

        # Initialize core client
        self._client = MeijerClient(auth, base_url)

        # Initialize component managers
        self.stores = StoreManager(self._client)
        self.orders = OrderManager(self._client)
        self.products = ProductManager(self._client)

        # Initialize existing components (maintaining backward compatibility)
        self.shopping_list = MeijerList(self._client)
        self.coupons = CouponManager(self._client)
        self.coupon_ops = CouponOperations(self._client)
        self.product_ops = ProductOperations(self._client)
        self.search = Search(self._client)
        self.shop_scan = ShopNScan(self._client)

        # Initialize mPerks with proper client connection
        from .mperks import MPerksClient

        self.mperks_client = MPerksClient()
        self.mperks = MPerksEarnedRewards(self._client)
        self.mperks.set_mperks_client(self.mperks_client)

        self.feedback = MeijerFeedback(self._client)
        self.settings = MeijerSettings(self._client)

        # Initialize account management
        self.account = AccountManager(self._client)

        # Initialize cart instance
        try:
            from .cart import MeijerCart

            self.cart = MeijerCart(self._client, store_id="217")
        except ImportError:
            self.logger.warning("Cart module not available")
            self.cart = None

        # Add alias for CLI compatibility
        self.list = self.shopping_list

        # Add stores interface wrapper for notebook compatibility
        self.stores_interface = StoresInterface(self)

    # Delegate core client methods for backward compatibility
    def _make_request(self, *args, **kwargs):
        """Delegate to core client."""
        return self._client._make_request(*args, **kwargs)

    def is_authenticated(self) -> bool:
        """Check if the client is authenticated."""
        return self._client.is_authenticated()

    def auth_status(self) -> Dict[str, Any]:
        """Get authentication status information."""
        return self._client.auth_status()

    def user_id(self) -> Optional[str]:
        """Get the current user ID."""
        return self._client.user_id()

    def home_store_id(self) -> Optional[str]:
        """Get the user's home store ID."""
        return self._client.home_store_id()

    def get_account_id(self) -> Optional[int]:
        """Get the account ID for the authenticated user."""
        return self._client.get_account_id()

    def save_tokens(self) -> None:
        """Save current authentication tokens."""
        self._client.save_tokens()

    def token_expires_at(self):
        """Get when the current token expires."""
        return self._client.token_expires_at()

    def clear_cache(self) -> None:
        """Clear the request cache."""
        self._client.clear_cache()

    def configure_rate_limiting(self, min_interval: float = 0.5) -> None:
        """Configure rate limiting parameters."""
        self._client.configure_rate_limiting(min_interval)

    def get_cache_stats(self) -> Dict[str, Any]:
        """Get cache statistics."""
        return self._client.get_cache_stats()

    def configure_ssl(
        self, verify: bool = True, cert_path: Optional[str] = None
    ) -> None:
        """Configure SSL settings."""
        self._client.configure_ssl(verify, cert_path)

    def configure_proxy(self, proxy_host: str, proxy_port: int = 8080) -> None:
        """Configure proxy settings."""
        self._client.configure_proxy(proxy_host, proxy_port)

    def get_config_summary(self) -> Dict[str, Any]:
        """Get a summary of current configuration."""
        return self._client.get_config_summary()

    # Store operations (delegated to store manager)
    def get_stores(self, **kwargs) -> List[MeijerStore]:
        """Get stores with various criteria."""
        return self.stores.get_stores(**kwargs)

    def find_stores_nearby(self, **kwargs) -> List[MeijerStore]:
        """Find stores near specific coordinates."""
        return self.stores.find_stores_nearby(**kwargs)

    def get_store_by_id(self, store_id: str) -> Optional[MeijerStore]:
        """Get store by ID."""
        return self.stores.get_store_by_id(store_id)

    def find_stores_with_services(self, **kwargs) -> List[MeijerStore]:
        """Find stores that offer specific services."""
        return self.stores.find_stores_with_services(**kwargs)

    def find_nearest_store_with_service(self, **kwargs) -> Optional[MeijerStore]:
        """Find the nearest store that offers a specific service."""
        return self.stores.find_nearest_store_with_service(**kwargs)

    def get_store_service_summary(self, store: MeijerStore) -> Dict[str, bool]:
        """Get a summary of services offered by a store."""
        return self.stores.get_store_service_summary(store)

    # Order operations (delegated to order manager)
    def get_order_history(self, **kwargs) -> List[Dict[str, Any]]:
        """Get order history for the authenticated user."""
        return self.orders.get_order_history(**kwargs)

    def get_order_details(self, order_id: str) -> Optional[Dict[str, Any]]:
        """Get detailed information for a specific order."""
        return self.orders.get_order_details(order_id)

    def get_recent_orders(self, limit: int = 5) -> List[Dict[str, Any]]:
        """Get recent orders."""
        return self.orders.get_recent_orders(limit)

    def search_orders(self, **kwargs) -> List[Dict[str, Any]]:
        """Search orders with filters."""
        return self.orders.search_orders(**kwargs)

    def get_order_summary(self) -> Dict[str, Any]:
        """Get a summary of order statistics."""
        return self.orders.get_order_summary()

    # Product operations (delegated to product manager)
    def search_products(self, **kwargs) -> List[Any]:
        """Search for products by query string."""
        return self.products.search_products(**kwargs)

    def search_product_by_upc(self, **kwargs) -> Optional[MeijerItem]:
        """Search for a product by UPC/barcode."""
        return self.products.search_product_by_upc(**kwargs)

    def search_multiple_products_by_upc(
        self, **kwargs
    ) -> Dict[str, Optional[MeijerItem]]:
        """Search for multiple products by UPC/barcode."""
        return self.products.search_multiple_products_by_upc(**kwargs)

    def lookup_barcode_price(self, **kwargs) -> Optional[Dict[str, Any]]:
        """Look up price information for a barcode."""
        return self.products.lookup_barcode_price(**kwargs)

    def bulk_lookup_barcodes(self, **kwargs) -> Dict[str, Optional[Dict[str, Any]]]:
        """Bulk lookup price information for multiple barcodes."""
        return self.products.bulk_lookup_barcodes(**kwargs)

    def get_product_detail(self, **kwargs) -> Optional[Dict[str, Any]]:
        """Get detailed product information."""
        return self.products.get_product_detail(**kwargs)

    def get_product_recommendations(self, **kwargs) -> List[MeijerItem]:
        """Get product recommendations."""
        return self.products.get_product_recommendations(**kwargs)

    # Legacy method aliases for backward compatibility
    def get_offers(self, **kwargs):
        """Get offers (delegated to coupons)."""
        return self.coupons.get_offers(**kwargs)

    def get_coupons(self, **kwargs):
        """Get coupons (delegated to coupons)."""
        return self.coupons.get_coupons(**kwargs)

    def get_all_coupons(self):
        """Get all coupons (delegated to coupons)."""
        return self.coupons.get_all_coupons()

    def lookup_barcode_price_legacy(self, **kwargs):
        """Legacy barcode lookup (delegated to products)."""
        return self.lookup_barcode_price(**kwargs)

    def bulk_lookup_barcodes_legacy(self, **kwargs):
        """Legacy bulk barcode lookup (delegated to products)."""
        return self.bulk_lookup_barcodes(**kwargs)

    def search_products_legacy(self, **kwargs):
        """Legacy product search (delegated to products)."""
        return self.search_products(**kwargs)

    def search_multiple_products_by_upc_legacy(self, **kwargs):
        """Legacy multiple UPC search (delegated to products)."""
        return self.search_multiple_products_by_upc(**kwargs)

    def search_product_by_upc_legacy(self, **kwargs):
        """Legacy single UPC search (delegated to products)."""
        return self.search_product_by_upc(**kwargs)

    # Shopping list operations (delegated to shopping list)
    def get_shopping_list(self) -> List[ListItem]:
        """Get shopping list items."""
        return self.shopping_list.get_shopping_list()

    def get_favorites(self) -> List[ListItem]:
        """Get favorite items."""
        return self.shopping_list.get_favorites()

    def add_to_shopping_list(self, **kwargs) -> bool:
        """Add item to shopping list."""
        return self.shopping_list.add_item(**kwargs)

    def add_to_favorites(self, item: Union[str, MeijerItem]) -> bool:
        """Add item to favorites."""
        return self.shopping_list.add_to_favorites(item)

    def remove_from_shopping_list(self, item_id: int) -> bool:
        """Remove item from shopping list."""
        return self.shopping_list.remove_item(item_id)

    def remove_from_favorites(self, item_id: int) -> bool:
        """Remove item from favorites."""
        return self.shopping_list.remove_from_favorites(item_id)

    def complete_shopping_list_item(self, item_id: int) -> bool:
        """Mark shopping list item as complete."""
        return self.shopping_list.complete_item(item_id)

    # Coupon operations (delegated to coupon operations)
    def clip_coupon(self, coupon_id: int) -> bool:
        """Clip a coupon."""
        return self.coupon_ops.clip_coupon(coupon_id)

    def unclip_coupon(self, coupon_id: int) -> bool:
        """Unclip a coupon."""
        return self.coupon_ops.unclip_coupon(coupon_id)

    # mPerks operations (delegated to mPerks)
    def get_earned_rewards(self, **kwargs):
        """Get earned rewards."""
        return self.mperks.get_earned_rewards(**kwargs)

    def get_mcard_info(self, **kwargs):
        """Get mCard information."""
        return self.mperks.get_mcard_info(**kwargs)

    def get_available_rewards(self, **kwargs):
        """Get available rewards."""
        return self.mperks.get_available_rewards(**kwargs)

    def get_reward_categories(self, **kwargs):
        """Get reward categories."""
        return self.mperks.get_reward_categories(**kwargs)

    def get_earn_offers(self, **kwargs):
        """Get earn offers."""
        return self.mperks.get_earn_offers(**kwargs)

    def get_earn_offers_in_progress(self, **kwargs):
        """Get earn offers in progress."""
        return self.mperks.get_earn_offers_in_progress(**kwargs)

    def get_earn_offers_available(self, **kwargs):
        """Get available earn offers."""
        return self.mperks.get_earn_offers_available(**kwargs)

    def get_earn_offers_all(self, **kwargs):
        """Get all earn offers."""
        return self.mperks.get_earn_offers_all(**kwargs)

    # Feedback operations (delegated to feedback)
    def feedback(self, feedback_type: str, **kwargs):
        """Submit feedback."""
        return self.feedback.submit_feedback(feedback_type, **kwargs)

    # Property accessors for backward compatibility
    @property
    def stores(self):
        """Get stores interface for backward compatibility."""
        return self.stores_interface

    @stores.setter
    def stores(self, value):
        """Set stores manager."""
        self._stores_manager = value
