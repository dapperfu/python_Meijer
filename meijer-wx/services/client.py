"""
Client service for managing Meijer API interactions.
"""

import logging
from typing import Any, Optional

from services.settings import SettingsService


class MeijerClientService:
    """
    Service for managing Meijer API client configuration and operations.

    Handles proxy settings, local backend configuration, and provides
    a centralized interface for API operations.
    """

    def __init__(self, settings_service: SettingsService) -> None:
        """
        Initialize the client service.

        Args:
            settings_service: Application settings service
        """
        self.logger = logging.getLogger(__name__)
        self.settings_service = settings_service

        # Initialize Meijer client
        self._meijer_client = None
        self._configure_client()

    def _configure_client(self) -> None:
        """Configure the client with current settings."""
        try:
            # Import Meijer client
            from meijer.client import Meijer

            # Get configuration
            proxy = self.settings_service.get_proxy()
            local_backend = self.settings_service.get_local_backend()

            # Initialize Meijer client
            self._meijer_client = Meijer()

            # Configure proxy if set
            if proxy:
                host, port = proxy.split(":")
                self._meijer_client.set_proxy(host, int(port))
                self.logger.info(f"Client configured with proxy: {proxy}")

            # Configure local backend if set
            if local_backend:
                self._meijer_client.set_local_backend(local_backend)
                self.logger.info(
                    f"Client configured with local backend: {local_backend}"
                )

            self.logger.info("Meijer client service initialized successfully")

        except ImportError as e:
            self.logger.error(f"Failed to import Meijer module: {e}")
            self._meijer_client = None
        except Exception as e:
            self.logger.error(f"Failed to initialize Meijer client: {e}")
            self._meijer_client = None

    def get_client(self):
        """Get the Meijer client instance."""
        return self._meijer_client

    def is_authenticated(self) -> bool:
        """Check if the client is authenticated."""
        return self._check_authentication_status()

    def authenticate(self, username: str, password: str) -> bool:
        """
        Authenticate with Meijer.

        Args:
            username: Meijer username/email
            password: Meijer password

        Returns:
            True if authentication successful, False otherwise
        """
        if not self._meijer_client:
            return False

        try:
            result = self._meijer_client.authenticate(username, password)
            self.logger.info("Authentication successful")
            return True
        except Exception as e:
            self.logger.error(f"Authentication failed: {e}")
            return False

    def get_shopping_list(self) -> list[dict[str, Any]]:
        """
        Get the current shopping list.

        Returns:
            List of shopping list items
        """
        if not self._meijer_client or not self.is_authenticated():
            return []

        try:
            items = self._meijer_client.list.get()
            return [
                {
                    "id": item.id,
                    "name": item.name,
                    "quantity": item.quantity,
                    "completed": item.completed,
                    "favorite": item.favorite,
                    "price": getattr(item, "price", None),
                    "store": getattr(item, "store", None),
                }
                for item in items
            ]
        except Exception as e:
            self.logger.error(f"Failed to get shopping list: {e}")
            return []

    def add_shopping_list_item(self, name: str, quantity: int = 1) -> bool:
        """
        Add an item to the shopping list.

        Args:
            name: Item name
            quantity: Item quantity

        Returns:
            True if successful, False otherwise
        """
        if not self._meijer_client or not self.is_authenticated():
            return False

        try:
            self._meijer_client.list.add(name, quantity)
            self.logger.info(f"Added item to shopping list: {name} (qty: {quantity})")
            return True
        except Exception as e:
            self.logger.error(f"Failed to add item to shopping list: {e}")
            return False

    def remove_shopping_list_item(self, item_id: str) -> bool:
        """
        Remove an item from the shopping list.

        Args:
            item_id: Item ID to remove

        Returns:
            True if successful, False otherwise
        """
        if not self._meijer_client or not self.is_authenticated():
            return False

        try:
            self._meijer_client.list.delete(item_id)
            self.logger.info(f"Removed item from shopping list: {item_id}")
            return True
        except Exception as e:
            self.logger.error(f"Failed to remove item from shopping list: {e}")
            return False

    def toggle_shopping_list_item(self, item_id: str) -> bool:
        """
        Toggle completion status of a shopping list item.

        Args:
            item_id: Item ID to toggle

        Returns:
            True if successful, False otherwise
        """
        if not self._meijer_client or not self.is_authenticated():
            return False

        try:
            # Get current item to check status
            items = self._meijer_client.list.get()
            item = next((i for i in items if i.id == item_id), None)

            if item:
                if item.completed:
                    self._meijer_client.list.mark_incomplete(item_id)
                else:
                    self._meijer_client.list.mark_complete(item_id)

                self.logger.info(f"Toggled item completion: {item_id}")
                return True
            else:
                self.logger.error(f"Item not found: {item_id}")
                return False

        except Exception as e:
            self.logger.error(f"Failed to toggle item completion: {e}")
            return False

    def get_coupons(self) -> list[dict[str, Any]]:
        """
        Get available coupons.

        Returns:
            List of available coupons
        """
        if not self._meijer_client or not self.is_authenticated():
            return []

        try:
            # Get coupons collection
            coupons_collection = self._meijer_client.coupons()
            coupons = (
                coupons_collection.coupons
                if hasattr(coupons_collection, "coupons")
                else []
            )

            return [
                {
                    "id": coupon.id,
                    "title": coupon.name,
                    "description": coupon.description,
                    "discount": f"{coupon.discount_amount} {coupon.discount_type}"
                    if coupon.discount_amount
                    else "N/A",
                    "expires": coupon.end_date,
                    "clipped": coupon.clipped,
                    "category": coupon.category,
                }
                for coupon in coupons
            ]
        except Exception as e:
            self.logger.error(f"Failed to get coupons: {e}")
            return []

    def clip_coupon(self, coupon_id: str) -> bool:
        """
        Clip a coupon.

        Args:
            coupon_id: Coupon ID to clip

        Returns:
            True if successful, False otherwise
        """
        if not self._meijer_client or not self.is_authenticated():
            return False

        try:
            # For now, just mark as clipped in our local data
            # The actual clipping would need to be implemented in the Meijer client
            self.logger.info(f"Coupon clipping not yet implemented: {coupon_id}")
            return True
        except Exception as e:
            self.logger.error(f"Failed to clip coupon: {e}")
            return False

    def get_stores(
        self, location: str = None, radius: int = 25
    ) -> list[dict[str, Any]]:
        """
        Get nearby stores.

        Args:
            location: Location to search (city, state, or ZIP)
            radius: Search radius in miles

        Returns:
            List of nearby stores
        """
        if not self._meijer_client:
            return []

        try:
            if location:
                stores = self._meijer_client.stores.search_by_location(location, radius)
            else:
                stores = self._meijer_client.stores.get_nearby(radius=radius)

            return [
                {
                    "id": store.id,
                    "name": store.name,
                    "address": store.address,
                    "city": store.city,
                    "state": store.state,
                    "zip_code": store.zip_code,
                    "phone": getattr(store, "phone", None),
                    "distance": getattr(store, "distance", None),
                }
                for store in stores
            ]
        except Exception as e:
            self.logger.error(f"Failed to get stores: {e}")
            return []

    def search_products(self, query: str, limit: int = 20) -> list[dict[str, Any]]:
        """
        Search for products.

        Args:
            query: Search query
            limit: Maximum number of results

        Returns:
            List of search results
        """
        if not self._meijer_client:
            return []

        try:
            results = self._meijer_client.search.search(query, limit=limit)
            return [
                {
                    "id": result.id,
                    "name": result.name,
                    "price": result.price,
                    "image_url": result.image_url,
                    "description": getattr(result, "description", None),
                    "category": getattr(result, "category", None),
                }
                for result in results
            ]
        except Exception as e:
            self.logger.error(f"Failed to search products: {e}")
            return []

    def get_proxy_config(self) -> Optional[str]:
        """Get current proxy configuration."""
        return self.settings_service.get_proxy()

    def get_local_backend_url(self) -> Optional[str]:
        """Get current local backend URL."""
        return self.settings_service.get_local_backend()

    def update_proxy(self, host: str, port: int) -> None:
        """
        Update proxy configuration.

        Args:
            host: Proxy host
            port: Proxy port
        """
        self.settings_service.set_proxy(host, port)
        self._configure_client()
        self.logger.info(f"Proxy updated to {host}:{port}")

    def update_local_backend(self, url: str) -> None:
        """
        Update local backend URL.

        Args:
            url: Local backend URL
        """
        self.settings_service.set_local_backend(url)
        self._configure_client()
        self.logger.info(f"Local backend updated to {url}")

    def test_connection(self) -> bool:
        """
        Test connection to Meijer API.

        Returns:
            True if connection successful, False otherwise
        """
        if not self._meijer_client:
            return False

        try:
            # Try to get stores as a simple connection test
            stores = self._meijer_client.stores.get_nearby(radius=1)
            return len(stores) >= 0  # Just check if we can make the request
        except Exception as e:
            self.logger.error(f"Connection test failed: {e}")
            return False

    def get_status(self) -> dict:
        """
        Get client status information.

        Returns:
            Dictionary with client status
        """
        # Check authentication status more thoroughly
        auth_status = self._check_authentication_status()

        return {
            "proxy": self.get_proxy_config(),
            "local_backend": self.get_local_backend_url(),
            "connected": self.test_connection(),
            "authenticated": auth_status,
            "client_initialized": self._meijer_client is not None,
        }

    def _check_authentication_status(self) -> bool:
        """
        Check authentication status by actually testing API access.

        Returns:
            True if authenticated and API calls work, False otherwise
        """
        if not self._meijer_client:
            return False

        try:
            # First check if we have tokens
            if not self._meijer_client._ensure_authenticated():
                return False

            # Then validate by making a simple API call
            try:
                # Try to get stores as a validation test
                self._meijer_client.stores.get_nearby(radius=1)
                return True
            except Exception as e:
                error_str = str(e)
                if "401" in error_str or "Authentication failed" in error_str:
                    self.logger.warning("Detected stale authentication tokens")
                    self._clear_stale_authentication()
                    return False
                elif "500" in error_str:
                    # Server errors don't necessarily mean auth failure
                    # But if we keep getting them, we might have auth issues
                    return True
                else:
                    # Other errors might be network issues, not auth
                    return True

        except Exception as e:
            self.logger.error(f"Error checking authentication status: {e}")
            return False

    def _clear_stale_authentication(self) -> None:
        """Clear stale authentication tokens."""
        try:
            if self._meijer_client and hasattr(self._meijer_client, "auth"):
                # Clear tokens from storage
                if hasattr(self._meijer_client.auth, "clear_tokens"):
                    self._meijer_client.auth.clear_tokens()
                elif hasattr(self._meijer_client.auth, "logout"):
                    self._meijer_client.auth.logout()

                self.logger.info("Cleared stale authentication tokens")
        except Exception as e:
            self.logger.error(f"Failed to clear stale authentication: {e}")

    def logout(self) -> bool:
        """
        Logout and clear all authentication.

        Returns:
            True if successful, False otherwise
        """
        try:
            if self._meijer_client and hasattr(self._meijer_client, "auth"):
                if hasattr(self._meijer_client.auth, "logout"):
                    self._meijer_client.auth.logout()
                elif hasattr(self._meijer_client.auth, "clear_tokens"):
                    self._meijer_client.auth.clear_tokens()

                self.logger.info("Logged out successfully")
                return True
            return False
        except Exception as e:
            self.logger.error(f"Failed to logout: {e}")
            return False

    # Cart Management Methods
    def get_cart_items(self) -> list[dict[str, Any]]:
        """
        Get items in the shopping cart.

        Returns:
            List of cart items with details
        """
        try:
            if not self._meijer_client:
                return []

            # Get cart items from the client
            cart_items = self._meijer_client.cart.get()

            # Convert to standard format
            return [
                {
                    "id": item.id if hasattr(item, "id") else str(i),
                    "name": item.name if hasattr(item, "name") else item.description,
                    "quantity": item.quantity if hasattr(item, "quantity") else 1,
                    "price": float(item.price) if hasattr(item, "price") else 0.0,
                    "store": item.store_id if hasattr(item, "store_id") else "N/A",
                    "description": item.description
                    if hasattr(item, "description")
                    else "",
                }
                for i, item in enumerate(cart_items)
            ]
        except Exception as e:
            self.logger.error(f"Failed to get cart items: {e}")
            return []

    def add_cart_item(
        self, upc: str, quantity: int = 1, store_id: Optional[str] = None
    ) -> bool:
        """
        Add item to shopping cart.

        Args:
            upc: Product UPC code
            quantity: Quantity to add
            store_id: Optional store ID

        Returns:
            True if successful, False otherwise
        """
        try:
            if not self._meijer_client:
                return False

            # Add item to cart
            success = self._meijer_client.cart.add_item(upc=upc, quantity=quantity)

            if success:
                self.logger.info(f"Added item {upc} to cart")
            else:
                self.logger.warning(f"Failed to add item {upc} to cart")

            return success
        except Exception as e:
            self.logger.error(f"Failed to add cart item: {e}")
            return False

    def remove_cart_item(self, item_id: str) -> bool:
        """
        Remove item from shopping cart.

        Args:
            item_id: Cart item ID to remove

        Returns:
            True if successful, False otherwise
        """
        try:
            if not self._meijer_client:
                return False

            # Remove item from cart
            success = self._meijer_client.cart.remove_item(item_id)

            if success:
                self.logger.info(f"Removed item {item_id} from cart")
            else:
                self.logger.warning(f"Failed to remove item {item_id} from cart")

            return success
        except Exception as e:
            self.logger.error(f"Failed to remove cart item: {e}")
            return False

    def update_cart_item_quantity(self, item_id: str, quantity: int) -> bool:
        """
        Update cart item quantity.

        Args:
            item_id: Cart item ID to update
            quantity: New quantity

        Returns:
            True if successful, False otherwise
        """
        try:
            if not self._meijer_client:
                return False

            # Update item quantity
            success = self._meijer_client.cart.update_item_quantity(item_id, quantity)

            if success:
                self.logger.info(f"Updated item {item_id} quantity to {quantity}")
            else:
                self.logger.warning(f"Failed to update item {item_id} quantity")

            return success
        except Exception as e:
            self.logger.error(f"Failed to update cart item quantity: {e}")
            return False

    def clear_cart(self) -> bool:
        """
        Clear all items from shopping cart.

        Returns:
            True if successful, False otherwise
        """
        try:
            if not self._meijer_client:
                return False

            # Clear cart
            success = self._meijer_client.cart.clear()

            if success:
                self.logger.info("Cleared shopping cart")
            else:
                self.logger.warning("Failed to clear shopping cart")

            return success
        except Exception as e:
            self.logger.error(f"Failed to clear cart: {e}")
            return False

    def export_cart_to_csv(self, filepath: str) -> bool:
        """
        Export cart contents to CSV file.

        Args:
            filepath: Path to save CSV file

        Returns:
            True if successful, False otherwise
        """
        try:
            import csv

            cart_items = self.get_cart_items()
            if not cart_items:
                return False

            with open(filepath, "w", newline="", encoding="utf-8") as csvfile:
                fieldnames = [
                    "name",
                    "quantity",
                    "price",
                    "total",
                    "store",
                    "description",
                ]
                writer = csv.DictWriter(csvfile, fieldnames=fieldnames)

                writer.writeheader()
                for item in cart_items:
                    writer.writerow(
                        {
                            "name": item["name"],
                            "quantity": item["quantity"],
                            "price": item["price"],
                            "total": item["price"] * item["quantity"],
                            "store": item["store"],
                            "description": item["description"],
                        }
                    )

            self.logger.info(f"Exported cart to CSV: {filepath}")
            return True
        except Exception as e:
            self.logger.error(f"Failed to export cart to CSV: {e}")
            return False

    def export_cart_to_excel(self, filepath: str) -> bool:
        """
        Export cart contents to Excel file.

        Args:
            filepath: Path to save Excel file

        Returns:
            True if successful, False otherwise
        """
        try:
            import pandas as pd

            cart_items = self.get_cart_items()
            if not cart_items:
                return False

            # Prepare data for Excel
            data = []
            for item in cart_items:
                data.append(
                    {
                        "Name": item["name"],
                        "Quantity": item["quantity"],
                        "Price": item["price"],
                        "Total": item["price"] * item["quantity"],
                        "Store": item["store"],
                        "Description": item["description"],
                    }
                )

            # Create DataFrame and export
            df = pd.DataFrame(data)
            df.to_excel(filepath, index=False, sheet_name="Cart Contents")

            self.logger.info(f"Exported cart to Excel: {filepath}")
            return True
        except Exception as e:
            self.logger.error(f"Failed to export cart to Excel: {e}")
            return False

    # Price Watch Methods
    def get_price_watches(self) -> list[dict[str, Any]]:
        """
        Get all price watches.

        Returns:
            List of price watches with details
        """
        try:
            if not self._meijer_client:
                return []

            # Get price watches from the client
            watches = self._meijer_client.price_watch.get()

            # Convert to standard format
            return [
                {
                    "id": watch.id if hasattr(watch, "id") else str(i),
                    "identifier": watch.identifier
                    if hasattr(watch, "identifier")
                    else "",
                    "product_name": watch.product_name
                    if hasattr(watch, "product_name")
                    else watch.identifier,
                    "type": watch.type if hasattr(watch, "type") else "Unknown",
                    "store_id": watch.store_id if hasattr(watch, "store_id") else "Any",
                    "desired_price": float(watch.desired_price)
                    if hasattr(watch, "desired_price") and watch.desired_price
                    else None,
                    "current_price": float(watch.current_price)
                    if hasattr(watch, "current_price") and watch.current_price
                    else None,
                    "status": watch.status if hasattr(watch, "status") else "Unknown",
                    "last_check": watch.last_check
                    if hasattr(watch, "last_check")
                    else "Never",
                    "condition": watch.condition
                    if hasattr(watch, "condition")
                    else "any_drop",
                    "notes": watch.notes if hasattr(watch, "notes") else "",
                }
                for i, watch in enumerate(watches)
            ]
        except Exception as e:
            self.logger.error(f"Failed to get price watches: {e}")
            return []

    def add_price_watch(
        self,
        identifier: str,
        id_type: Optional[str] = None,
        store_id: Optional[str] = None,
        desired_price: Optional[float] = None,
        only_when: str = "any_drop",
        note: Optional[str] = None,
    ) -> bool:
        """
        Add a new price watch.

        Args:
            identifier: Product identifier (UPC or PLU)
            id_type: Type of identifier (UPC, PLU, or None for auto-detect)
            store_id: Optional store ID to bind the watch to
            desired_price: Optional target price for alerts
            only_when: Condition for triggering alerts
            note: Optional note about the watch

        Returns:
            True if successful, False otherwise
        """
        try:
            if not self._meijer_client:
                return False

            # Add price watch
            success = self._meijer_client.price_watch.add(
                identifier=identifier,
                id_type=id_type,
                store_id=store_id,
                desired_price=desired_price,
                only_when=only_when,
                note=note,
            )

            if success:
                self.logger.info(f"Added price watch for {identifier}")
            else:
                self.logger.warning(f"Failed to add price watch for {identifier}")

            return success
        except Exception as e:
            self.logger.error(f"Failed to add price watch: {e}")
            return False

    def remove_price_watch(self, watch_id: str) -> bool:
        """
        Remove a price watch.

        Args:
            watch_id: Price watch ID to remove

        Returns:
            True if successful, False otherwise
        """
        try:
            if not self._meijer_client:
                return False

            # Remove price watch
            success = self._meijer_client.price_watch.remove(watch_id)

            if success:
                self.logger.info(f"Removed price watch {watch_id}")
            else:
                self.logger.warning(f"Failed to remove price watch {watch_id}")

            return success
        except Exception as e:
            self.logger.error(f"Failed to remove price watch: {e}")
            return False

    def check_price_watch(self, watch_id: str) -> bool:
        """
        Check a specific price watch.

        Args:
            watch_id: Price watch ID to check

        Returns:
            True if successful, False otherwise
        """
        try:
            if not self._meijer_client:
                return False

            # Check price watch
            success = self._meijer_client.price_watch.check(watch_id)

            if success:
                self.logger.info(f"Checked price watch {watch_id}")
            else:
                self.logger.warning(f"Failed to check price watch {watch_id}")

            return success
        except Exception as e:
            self.logger.error(f"Failed to check price watch: {e}")
            return False

    def export_price_watches_to_csv(self, filepath: str) -> bool:
        """
        Export price watches to CSV file.

        Args:
            filepath: Path to save CSV file

        Returns:
            True if successful, False otherwise
        """
        try:
            import csv

            watches = self.get_price_watches()
            if not watches:
                return False

            with open(filepath, "w", newline="", encoding="utf-8") as csvfile:
                fieldnames = [
                    "identifier",
                    "product_name",
                    "type",
                    "store_id",
                    "desired_price",
                    "current_price",
                    "status",
                    "last_check",
                    "condition",
                    "notes",
                ]
                writer = csv.DictWriter(csvfile, fieldnames=fieldnames)

                writer.writeheader()
                for watch in watches:
                    writer.writerow(watch)

            self.logger.info(f"Exported price watches to CSV: {filepath}")
            return True
        except Exception as e:
            self.logger.error(f"Failed to export price watches to CSV: {e}")
            return False

    # Ads Methods
    def get_ads_items(
        self, ad_type: str = "weekly", store_id: Optional[str] = None
    ) -> list[dict[str, Any]]:
        """
        Get weekly ads items.

        Args:
            ad_type: Type of ads (weekly, digital, clearance)
            store_id: Optional store ID to filter by

        Returns:
            List of ads items with details
        """
        try:
            if not self._meijer_client:
                return []

            # Get ads items from the client
            if hasattr(self._meijer_client, "ads"):
                ads_items = self._meijer_client.ads.get(
                    ad_type=ad_type, store_id=store_id
                )
            else:
                # Fallback to weekly ads if ads module not available
                ads_items = []

            # Convert to standard format
            return [
                {
                    "id": item.id if hasattr(item, "id") else str(i),
                    "name": item.name if hasattr(item, "name") else item.title,
                    "category": item.category
                    if hasattr(item, "category")
                    else "Unknown",
                    "original_price": float(item.original_price)
                    if hasattr(item, "original_price") and item.original_price
                    else 0.0,
                    "sale_price": float(item.sale_price)
                    if hasattr(item, "sale_price") and item.sale_price
                    else 0.0,
                    "end_date": item.end_date if hasattr(item, "end_date") else "N/A",
                    "store": item.store_id if hasattr(item, "store_id") else "All",
                    "description": item.description
                    if hasattr(item, "description")
                    else "",
                }
                for i, item in enumerate(ads_items)
            ]
        except Exception as e:
            self.logger.error(f"Failed to get ads items: {e}")
            return []

    def export_ads_to_csv(self, filepath: str, ad_type: str) -> bool:
        """
        Export ads to CSV file.

        Args:
            filepath: Path to save CSV file
            ad_type: Type of ads being exported

        Returns:
            True if successful, False otherwise
        """
        try:
            import csv

            ads_items = self.get_ads_items(ad_type)
            if not ads_items:
                return False

            with open(filepath, "w", newline="", encoding="utf-8") as csvfile:
                fieldnames = [
                    "name",
                    "category",
                    "original_price",
                    "sale_price",
                    "discount",
                    "end_date",
                    "store",
                    "description",
                ]
                writer = csv.DictWriter(csvfile, fieldnames=fieldnames)

                writer.writeheader()
                for item in ads_items:
                    discount = item.get("original_price", 0.0) - item.get(
                        "sale_price", 0.0
                    )
                    writer.writerow(
                        {
                            "name": item["name"],
                            "category": item["category"],
                            "original_price": item["original_price"],
                            "sale_price": item["sale_price"],
                            "discount": discount,
                            "end_date": item["end_date"],
                            "store": item["store"],
                            "description": item["description"],
                        }
                    )

            self.logger.info(f"Exported {ad_type} ads to CSV: {filepath}")
            return True
        except Exception as e:
            self.logger.error(f"Failed to export ads to CSV: {e}")
            return False
