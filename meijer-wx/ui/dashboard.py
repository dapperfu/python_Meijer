"""
Dashboard panel with comprehensive Meijer functionality.
"""

import logging
from typing import Any

import wx
import wx.adv

from services.client import MeijerClientService
from services.settings import SettingsService


class DashboardPanel(wx.Panel):
    """
    Comprehensive dashboard panel with all Meijer functionality.

    Provides buttons for all available Meijer client methods,
    organized by category for easy access.
    """

    def __init__(
        self,
        parent: wx.Window,
        settings_service: SettingsService,
        client_service: MeijerClientService,
        **kwargs: Any,
    ) -> None:
        """
        Initialize the dashboard panel.

        Args:
            parent: Parent window
            settings_service: Application settings service
            client_service: Meijer client service
            **kwargs: Additional wx.Panel arguments
        """
        super().__init__(parent, **kwargs)

        self.settings_service = settings_service
        self.client_service = client_service
        self.logger = logging.getLogger(__name__)

        # Create UI
        self._create_ui()

        # Initial refresh
        self.refresh()

    def _create_ui(self) -> None:
        """Create the dashboard UI."""
        # Main layout
        main_sizer = wx.BoxSizer(wx.VERTICAL)

        # Title
        title = wx.StaticText(self, label="Meijer Dashboard")
        title.SetFont(
            wx.Font(16, wx.FONTFAMILY_DEFAULT, wx.FONTSTYLE_NORMAL, wx.FONTWEIGHT_BOLD)
        )
        main_sizer.Add(title, 0, wx.ALL | wx.CENTER, 10)

        # Status section
        status_box = wx.StaticBox(self, label="Status")
        status_sizer = wx.StaticBoxSizer(status_box, wx.VERTICAL)

        self.status_text = wx.TextCtrl(
            self, style=wx.TE_MULTILINE | wx.TE_READONLY, size=(-1, 60)
        )
        status_sizer.Add(self.status_text, 1, wx.EXPAND | wx.ALL, 5)

        # Status buttons
        status_btn_sizer = wx.BoxSizer(wx.HORIZONTAL)
        self.auth_btn = wx.Button(self, label="Check Auth")
        self.auth_btn.Bind(wx.EVT_BUTTON, self._on_check_auth)
        status_btn_sizer.Add(self.auth_btn, 0, wx.ALL, 5)

        self.clear_cache_btn = wx.Button(self, label="Clear Cache")
        self.clear_cache_btn.Bind(wx.EVT_BUTTON, self._on_clear_cache)
        status_btn_sizer.Add(self.clear_cache_btn, 0, wx.ALL, 5)

        self.save_tokens_btn = wx.Button(self, label="Save Tokens")
        self.save_tokens_btn.Bind(wx.EVT_BUTTON, self._on_save_tokens)
        status_btn_sizer.Add(self.save_tokens_btn, 0, wx.ALL, 5)

        status_sizer.Add(status_btn_sizer, 0, wx.ALL, 5)
        main_sizer.Add(status_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Shopping List section
        list_box = wx.StaticBox(self, label="Shopping List")
        list_sizer = wx.StaticBoxSizer(list_box, wx.VERTICAL)

        list_btn_sizer = wx.BoxSizer(wx.HORIZONTAL)
        self.get_list_btn = wx.Button(self, label="Get List")
        self.get_list_btn.Bind(wx.EVT_BUTTON, self._on_get_list)
        list_btn_sizer.Add(self.get_list_btn, 0, wx.ALL, 5)

        self.add_list_btn = wx.Button(self, label="Add Item")
        self.add_list_btn.Bind(wx.EVT_BUTTON, self._on_add_list_item)
        list_btn_sizer.Add(self.add_list_btn, 0, wx.ALL, 5)

        self.defrag_list_btn = wx.Button(self, label="Defrag List")
        self.defrag_list_btn.Bind(wx.EVT_BUTTON, self._on_defrag_list)
        list_btn_sizer.Add(self.defrag_list_btn, 0, wx.ALL, 5)

        list_sizer.Add(list_btn_sizer, 0, wx.ALL, 5)
        main_sizer.Add(list_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Favorites section
        fav_box = wx.StaticBox(self, label="Favorites")
        fav_sizer = wx.StaticBoxSizer(fav_box, wx.VERTICAL)

        fav_btn_sizer = wx.BoxSizer(wx.HORIZONTAL)
        self.get_favs_btn = wx.Button(self, label="Get Favorites")
        self.get_favs_btn.Bind(wx.EVT_BUTTON, self._on_get_favorites)
        fav_btn_sizer.Add(self.get_favs_btn, 0, wx.ALL, 5)

        self.add_fav_btn = wx.Button(self, label="Add Favorite")
        self.add_fav_btn.Bind(wx.EVT_BUTTON, self._on_add_favorite)
        fav_btn_sizer.Add(self.add_fav_btn, 0, wx.ALL, 5)

        fav_sizer.Add(fav_btn_sizer, 0, wx.ALL, 5)
        main_sizer.Add(fav_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Cart section
        cart_box = wx.StaticBox(self, label="Shopping Cart")
        cart_sizer = wx.StaticBoxSizer(cart_box, wx.VERTICAL)

        cart_btn_sizer = wx.BoxSizer(wx.HORIZONTAL)
        self.get_cart_btn = wx.Button(self, label="Get Cart")
        self.get_cart_btn.Bind(wx.EVT_BUTTON, self._on_get_cart)
        cart_btn_sizer.Add(self.get_cart_btn, 0, wx.ALL, 5)

        self.clear_cart_btn = wx.Button(self, label="Clear Cart")
        self.clear_cart_btn.Bind(wx.EVT_BUTTON, self._on_clear_cart)
        cart_btn_sizer.Add(self.clear_cart_btn, 0, wx.ALL, 5)

        cart_sizer.Add(cart_btn_sizer, 0, wx.ALL, 5)
        main_sizer.Add(cart_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Stores section
        stores_box = wx.StaticBox(self, label="Stores")
        stores_sizer = wx.StaticBoxSizer(stores_box, wx.VERTICAL)

        stores_btn_sizer = wx.BoxSizer(wx.HORIZONTAL)
        self.get_stores_btn = wx.Button(self, label="Get Stores")
        self.get_stores_btn.Bind(wx.EVT_BUTTON, self._on_get_stores)
        stores_btn_sizer.Add(self.get_stores_btn, 0, wx.ALL, 5)

        self.find_store_btn = wx.Button(self, label="Find Store")
        self.find_store_btn.Bind(wx.EVT_BUTTON, self._on_find_store)
        stores_btn_sizer.Add(self.find_store_btn, 0, wx.ALL, 5)

        stores_sizer.Add(stores_btn_sizer, 0, wx.ALL, 5)
        main_sizer.Add(stores_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Search section
        search_box = wx.StaticBox(self, label="Product Search")
        search_sizer = wx.StaticBoxSizer(search_box, wx.VERTICAL)

        search_btn_sizer = wx.BoxSizer(wx.HORIZONTAL)
        self.search_btn = wx.Button(self, label="Search Products")
        self.search_btn.Bind(wx.EVT_BUTTON, self._on_search_products)
        search_btn_sizer.Add(self.search_btn, 0, wx.ALL, 5)

        self.upc_search_btn = wx.Button(self, label="UPC Search")
        self.upc_search_btn.Bind(wx.EVT_BUTTON, self._on_upc_search)
        search_btn_sizer.Add(self.upc_search_btn, 0, wx.ALL, 5)

        self.barcode_btn = wx.Button(self, label="Barcode Lookup")
        self.barcode_btn.Bind(wx.EVT_BUTTON, self._on_barcode_lookup)
        search_btn_sizer.Add(self.barcode_btn, 0, wx.ALL, 5)

        search_sizer.Add(search_btn_sizer, 0, wx.ALL, 5)
        main_sizer.Add(search_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Coupons section
        coupons_box = wx.StaticBox(self, label="Coupons")
        coupons_sizer = wx.StaticBoxSizer(coupons_box, wx.VERTICAL)

        coupons_btn_sizer = wx.BoxSizer(wx.HORIZONTAL)
        self.get_coupons_btn = wx.Button(self, label="Get Coupons")
        self.get_coupons_btn.Bind(wx.EVT_BUTTON, self._on_get_coupons)
        coupons_btn_sizer.Add(self.get_coupons_btn, 0, wx.ALL, 5)

        self.clip_coupon_btn = wx.Button(self, label="Clip Coupon")
        self.clip_coupon_btn.Bind(wx.EVT_BUTTON, self._on_clip_coupon)
        coupons_btn_sizer.Add(self.clip_coupon_btn, 0, wx.ALL, 5)

        coupons_sizer.Add(coupons_btn_sizer, 0, wx.ALL, 5)
        main_sizer.Add(coupons_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Rewards section
        rewards_box = wx.StaticBox(self, label="Rewards & Offers")
        rewards_sizer = wx.StaticBoxSizer(rewards_box, wx.VERTICAL)

        rewards_btn_sizer = wx.BoxSizer(wx.HORIZONTAL)
        self.get_offers_btn = wx.Button(self, label="Get Offers")
        self.get_offers_btn.Bind(wx.EVT_BUTTON, self._on_get_offers)
        rewards_btn_sizer.Add(self.get_offers_btn, 0, wx.ALL, 5)

        self.get_rewards_btn = wx.Button(self, label="Get Rewards")
        self.get_rewards_btn.Bind(wx.EVT_BUTTON, self._on_get_rewards)
        rewards_btn_sizer.Add(self.get_rewards_btn, 0, wx.ALL, 5)

        self.get_mcard_btn = wx.Button(self, label="mCard Info")
        self.get_mcard_btn.Bind(wx.EVT_BUTTON, self._on_get_mcard)
        rewards_btn_sizer.Add(self.get_mcard_btn, 0, wx.ALL, 5)

        rewards_sizer.Add(rewards_btn_sizer, 0, wx.ALL, 5)
        main_sizer.Add(rewards_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Orders section
        orders_box = wx.StaticBox(self, label="Orders")
        orders_sizer = wx.StaticBoxSizer(orders_box, wx.VERTICAL)

        orders_btn_sizer = wx.BoxSizer(wx.HORIZONTAL)
        self.get_orders_btn = wx.Button(self, label="Order History")
        self.get_orders_btn.Bind(wx.EVT_BUTTON, self._on_get_orders)
        orders_btn_sizer.Add(self.get_orders_btn, 0, wx.ALL, 5)

        orders_sizer.Add(orders_btn_sizer, 0, wx.ALL, 5)
        main_sizer.Add(orders_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Configuration section
        config_box = wx.StaticBox(self, label="Configuration")
        config_sizer = wx.StaticBoxSizer(config_box, wx.VERTICAL)

        config_btn_sizer = wx.BoxSizer(wx.HORIZONTAL)
        self.rate_limit_btn = wx.Button(self, label="Set Rate Limit")
        self.rate_limit_btn.Bind(wx.EVT_BUTTON, self._on_set_rate_limit)
        config_btn_sizer.Add(self.rate_limit_btn, 0, wx.ALL, 5)

        self.ssl_btn = wx.Button(self, label="SSL Settings")
        self.ssl_btn.Bind(wx.EVT_BUTTON, self._on_ssl_settings)
        config_btn_sizer.Add(self.ssl_btn, 0, wx.ALL, 5)

        config_sizer.Add(config_btn_sizer, 0, wx.ALL, 5)
        main_sizer.Add(config_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Results section
        results_box = wx.StaticBox(self, label="Results")
        results_sizer = wx.StaticBoxSizer(results_box, wx.VERTICAL)

        self.results_text = wx.TextCtrl(
            self, style=wx.TE_MULTILINE | wx.TE_READONLY, size=(-1, 200)
        )
        results_sizer.Add(self.results_text, 1, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(results_sizer, 1, wx.EXPAND | wx.ALL, 10)

        self.SetSizer(main_sizer)

    def refresh(self) -> None:
        """Refresh the dashboard."""
        self._update_status()

    def _update_status(self) -> None:
        """Update the status display."""
        try:
            if self.client_service.is_authenticated():
                self.status_text.SetValue("✅ Authenticated - Ready to use")
            else:
                self.status_text.SetValue("❌ Not authenticated - Please log in")
        except Exception as e:
            self.status_text.SetValue(f"❌ Error: {e}")

    def _log_result(self, message: str) -> None:
        """Log a result message."""
        self.results_text.AppendText(f"{message}\n")

    def _on_check_auth(self, event: wx.CommandEvent) -> None:
        """Handle authentication check."""
        try:
            is_auth = self.client_service.is_authenticated()
            self._log_result(f"Authentication status: {is_auth}")
            self._update_status()
        except Exception as e:
            self._log_result(f"Error checking auth: {e}")

    def _on_clear_cache(self, event: wx.CommandEvent) -> None:
        """Handle cache clearing."""
        try:
            success = self.client_service.clear_cache()
            if success:
                self._log_result("✅ Cache cleared successfully")
            else:
                self._log_result("❌ Failed to clear cache")
        except Exception as e:
            self._log_result(f"Error clearing cache: {e}")

    def _on_save_tokens(self, event: wx.CommandEvent) -> None:
        """Handle token saving."""
        try:
            success = self.client_service.save_tokens()
            if success:
                self._log_result("✅ Tokens saved successfully")
            else:
                self._log_result("❌ Failed to save tokens")
        except Exception as e:
            self._log_result(f"Error saving tokens: {e}")

    def _on_get_list(self, event: wx.CommandEvent) -> None:
        """Handle getting shopping list."""
        try:
            items = self.client_service.get_shopping_list()
            self._log_result(f"✅ Shopping list: {len(items)} items")
            for item in items:
                self._log_result(f"  - {item['name']} (qty: {item['quantity']})")
        except Exception as e:
            self._log_result(f"Error getting list: {e}")

    def _on_add_list_item(self, event: wx.CommandEvent) -> None:
        """Handle adding list item."""
        dialog = wx.TextEntryDialog(self, "Enter item name:", "Add Item")
        if dialog.ShowModal() == wx.ID_OK:
            name = dialog.GetValue()
            try:
                success = self.client_service.add_shopping_list_item(name)
                if success:
                    self._log_result(f"✅ Added item: {name}")
                else:
                    self._log_result(f"❌ Failed to add item: {name}")
            except Exception as e:
                self._log_result(f"Error adding item: {e}")
        dialog.Destroy()

    def _on_defrag_list(self, event: wx.CommandEvent) -> None:
        """Handle list defragmentation."""
        try:
            success = self.client_service.defrag_shopping_list()
            if success:
                self._log_result("✅ List defragmented successfully")
            else:
                self._log_result("❌ Failed to defrag list")
        except Exception as e:
            self._log_result(f"Error defragging list: {e}")

    def _on_get_favorites(self, event: wx.CommandEvent) -> None:
        """Handle getting favorites."""
        try:
            favorites = self.client_service.get_favorites()
            self._log_result(f"✅ Favorites: {len(favorites)} items")
            for item in favorites:
                self._log_result(f"  - {item['name']}")
        except Exception as e:
            self._log_result(f"Error getting favorites: {e}")

    def _on_add_favorite(self, event: wx.CommandEvent) -> None:
        """Handle adding favorite."""
        dialog = wx.TextEntryDialog(self, "Enter item name:", "Add Favorite")
        if dialog.ShowModal() == wx.ID_OK:
            name = dialog.GetValue()
            try:
                success = self.client_service.add_to_favorites(name)
                if success:
                    self._log_result(f"✅ Added favorite: {name}")
                else:
                    self._log_result(f"❌ Failed to add favorite: {name}")
            except Exception as e:
                self._log_result(f"Error adding favorite: {e}")
        dialog.Destroy()

    def _on_get_cart(self, event: wx.CommandEvent) -> None:
        """Handle getting cart."""
        try:
            items = self.client_service.get_cart_items()
            self._log_result(f"✅ Cart: {len(items)} items")
            for item in items:
                self._log_result(f"  - {item['name']} (qty: {item['quantity']})")
        except Exception as e:
            self._log_result(f"Error getting cart: {e}")

    def _on_clear_cart(self, event: wx.CommandEvent) -> None:
        """Handle clearing cart."""
        try:
            success = self.client_service.clear_cart()
            if success:
                self._log_result("✅ Cart cleared successfully")
            else:
                self._log_result("❌ Failed to clear cart")
        except Exception as e:
            self._log_result(f"Error clearing cart: {e}")

    def _on_get_stores(self, event: wx.CommandEvent) -> None:
        """Handle getting stores."""
        try:
            stores = self.client_service.get_stores()
            self._log_result(f"✅ Stores: {len(stores)} found")
            for store in stores:
                self._log_result(
                    f"  - {store['name']} ({store['city']}, {store['state']})"
                )
        except Exception as e:
            self._log_result(f"Error getting stores: {e}")

    def _on_find_store(self, event: wx.CommandEvent) -> None:
        """Handle finding store."""
        dialog = wx.TextEntryDialog(self, "Enter service to find:", "Find Store")
        if dialog.ShowModal() == wx.ID_OK:
            service = dialog.GetValue()
            try:
                store = self.client_service.find_nearest_store_with_service(service)
                if store:
                    self._log_result(f"✅ Found store: {store['name']}")
                else:
                    self._log_result(f"❌ No store found with service: {service}")
            except Exception as e:
                self._log_result(f"Error finding store: {e}")
        dialog.Destroy()

    def _on_search_products(self, event: wx.CommandEvent) -> None:
        """Handle product search."""
        dialog = wx.TextEntryDialog(self, "Enter search query:", "Search Products")
        if dialog.ShowModal() == wx.ID_OK:
            query = dialog.GetValue()
            try:
                products = self.client_service.search_products(query)
                self._log_result(f"✅ Search results: {len(products)} products")
                for product in products[:5]:  # Show first 5
                    self._log_result(
                        f"  - {product['name']} (${product.get('price', 'N/A')})"
                    )
            except Exception as e:
                self._log_result(f"Error searching products: {e}")
        dialog.Destroy()

    def _on_upc_search(self, event: wx.CommandEvent) -> None:
        """Handle UPC search."""
        dialog = wx.TextEntryDialog(self, "Enter UPC:", "UPC Search")
        if dialog.ShowModal() == wx.ID_OK:
            upc = dialog.GetValue()
            try:
                product = self.client_service.search_product_by_upc(upc)
                if product:
                    self._log_result(
                        f"✅ Product found: {product['name']} (${product.get('price', 'N/A')})"
                    )
                else:
                    self._log_result(f"❌ No product found for UPC: {upc}")
            except Exception as e:
                self._log_result(f"Error searching UPC: {e}")
        dialog.Destroy()

    def _on_barcode_lookup(self, event: wx.CommandEvent) -> None:
        """Handle barcode lookup."""
        dialog = wx.TextEntryDialog(self, "Enter barcode:", "Barcode Lookup")
        if dialog.ShowModal() == wx.ID_OK:
            barcode = dialog.GetValue()
            try:
                product = self.client_service.lookup_barcode_price(barcode)
                if product:
                    self._log_result(
                        f"✅ Product found: {product['name']} (${product.get('price', 'N/A')})"
                    )
                else:
                    self._log_result(f"❌ No product found for barcode: {barcode}")
            except Exception as e:
                self._log_result(f"Error looking up barcode: {e}")
        dialog.Destroy()

    def _on_get_coupons(self, event: wx.CommandEvent) -> None:
        """Handle getting coupons."""
        try:
            coupons = self.client_service.get_coupons()
            self._log_result(f"✅ Coupons: {len(coupons)} available")
            for coupon in coupons[:5]:  # Show first 5
                self._log_result(f"  - {coupon['description']}")
        except Exception as e:
            self._log_result(f"Error getting coupons: {e}")

    def _on_clip_coupon(self, event: wx.CommandEvent) -> None:
        """Handle clipping coupon."""
        dialog = wx.TextEntryDialog(self, "Enter coupon ID:", "Clip Coupon")
        if dialog.ShowModal() == wx.ID_OK:
            coupon_id = dialog.GetValue()
            try:
                success = self.client_service.clip_coupon(coupon_id)
                if success:
                    self._log_result(f"✅ Coupon clipped: {coupon_id}")
                else:
                    self._log_result(f"❌ Failed to clip coupon: {coupon_id}")
            except Exception as e:
                self._log_result(f"Error clipping coupon: {e}")
        dialog.Destroy()

    def _on_get_offers(self, event: wx.CommandEvent) -> None:
        """Handle getting offers."""
        try:
            offers = self.client_service.get_offers()
            self._log_result(f"✅ Offers: {len(offers)} available")
            for offer in offers[:5]:  # Show first 5
                self._log_result(f"  - {offer['name']}")
        except Exception as e:
            self._log_result(f"Error getting offers: {e}")

    def _on_get_rewards(self, event: wx.CommandEvent) -> None:
        """Handle getting rewards."""
        try:
            rewards = self.client_service.get_earned_rewards()
            self._log_result(f"✅ Rewards: {len(rewards)} earned")
            for reward in rewards[:5]:  # Show first 5
                self._log_result(f"  - {reward['name']} ({reward['points']} points)")
        except Exception as e:
            self._log_result(f"Error getting rewards: {e}")

    def _on_get_mcard(self, event: wx.CommandEvent) -> None:
        """Handle getting mCard info."""
        try:
            info = self.client_service.get_mcard_info()
            if info:
                self._log_result(
                    f"✅ mCard: {info.get('number', 'N/A')} - Balance: ${info.get('balance', 'N/A')}"
                )
            else:
                self._log_result("❌ No mCard info available")
        except Exception as e:
            self._log_result(f"Error getting mCard info: {e}")

    def _on_get_orders(self, event: wx.CommandEvent) -> None:
        """Handle getting orders."""
        try:
            orders = self.client_service.get_order_history()
            self._log_result(f"✅ Orders: {len(orders)} found")
            for order in orders[:5]:  # Show first 5
                self._log_result(
                    f"  - Order {order['id']}: ${order.get('total', 'N/A')} on {order.get('date', 'N/A')}"
                )
        except Exception as e:
            self._log_result(f"Error getting orders: {e}")

    def _on_set_rate_limit(self, event: wx.CommandEvent) -> None:
        """Handle setting rate limit."""
        dialog = wx.NumberEntryDialog(
            self, "Enter requests per second:", "Rate Limiting", "10", 1, 100, 10
        )
        if dialog.ShowModal() == wx.ID_OK:
            rate = dialog.GetValue()
            try:
                success = self.client_service.configure_rate_limiting(rate)
                if success:
                    self._log_result(f"✅ Rate limit set to {rate} req/s")
                else:
                    self._log_result("❌ Failed to set rate limit")
            except Exception as e:
                self._log_result(f"Error setting rate limit: {e}")
        dialog.Destroy()

    def _on_ssl_settings(self, event: wx.CommandEvent) -> None:
        """Handle SSL settings."""
        try:
            success = self.client_service.configure_ssl(verify=True)
            if success:
                self._log_result("✅ SSL verification enabled")
            else:
                self._log_result("❌ Failed to configure SSL")
        except Exception as e:
            self._log_result(f"Error configuring SSL: {e}")
