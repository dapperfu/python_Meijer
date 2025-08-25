"""
Shopping cart management panel.
"""

from typing import Any

import wx

from services.client import MeijerClientService
from services.settings import SettingsService


class CartPanel(wx.Panel):
    """
    Shopping cart management panel.

    Provides functionality to view cart contents, manage items, and handle fulfillment.
    """

    def __init__(
        self,
        parent: wx.Window,
        settings_service: SettingsService,
        client_service: MeijerClientService,
        **kwargs: Any,
    ) -> None:
        """
        Initialize the cart panel.

        Args:
            parent: Parent window
            settings_service: Application settings service
            client_service: Meijer client service
            **kwargs: Additional wx.Panel arguments
        """
        super().__init__(parent, **kwargs)

        self.settings_service = settings_service
        self.client_service = client_service
        self.cart_items: list[dict[str, Any]] = []

        # Create UI
        self._create_ui()

        # Initial refresh
        self.refresh()

    def _create_ui(self) -> None:
        """Create the cart UI."""
        # Main sizer
        main_sizer = wx.BoxSizer(wx.VERTICAL)

        # Cart controls section
        controls_box = wx.StaticBox(self, label="Cart Controls")
        controls_sizer = wx.StaticBoxSizer(controls_box, wx.VERTICAL)

        # Control buttons
        controls_row = wx.BoxSizer(wx.HORIZONTAL)

        self.refresh_btn = wx.Button(self, label="Refresh Cart")
        self.refresh_btn.Bind(wx.EVT_BUTTON, self._on_refresh)
        controls_row.Add(self.refresh_btn, 0, wx.ALL, 5)

        self.clear_btn = wx.Button(self, label="Clear Cart")
        self.clear_btn.Bind(wx.EVT_BUTTON, self._on_clear_cart)
        controls_row.Add(self.clear_btn, 0, wx.ALL, 5)

        self.estimate_btn = wx.Button(self, label="Estimate Total")
        self.estimate_btn.Bind(wx.EVT_BUTTON, self._on_estimate_total)
        controls_row.Add(self.estimate_btn, 0, wx.ALL, 5)

        controls_row.AddStretchSpacer()

        # Export options
        export_label = wx.StaticText(self, label="Export:")
        controls_row.Add(export_label, 0, wx.ALIGN_CENTER_VERTICAL | wx.ALL, 5)

        self.export_csv_btn = wx.Button(self, label="CSV")
        self.export_csv_btn.Bind(wx.EVT_BUTTON, self._on_export_csv)
        controls_row.Add(self.export_csv_btn, 0, wx.ALL, 5)

        self.export_excel_btn = wx.Button(self, label="Excel")
        self.export_excel_btn.Bind(wx.EVT_BUTTON, self._on_export_excel)
        controls_row.Add(self.export_excel_btn, 0, wx.ALL, 5)

        controls_sizer.Add(controls_row, 0, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(controls_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Cart contents section
        cart_box = wx.StaticBox(self, label="Cart Contents")
        cart_sizer = wx.StaticBoxSizer(cart_box, wx.VERTICAL)

        # Cart list
        self.cart_list = wx.ListCtrl(self, style=wx.LC_REPORT | wx.LC_SINGLE_SEL)

        # Add columns
        self.cart_list.InsertColumn(0, "Item", width=250)
        self.cart_list.InsertColumn(1, "Qty", width=60)
        self.cart_list.InsertColumn(2, "Price", width=80)
        self.cart_list.InsertColumn(3, "Total", width=80)
        self.cart_list.InsertColumn(4, "Store", width=100)
        self.cart_list.InsertColumn(5, "Actions", width=120)

        cart_sizer.Add(self.cart_list, 1, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(cart_sizer, 1, wx.EXPAND | wx.ALL, 10)

        # Summary section
        summary_box = wx.StaticBox(self, label="Cart Summary")
        summary_sizer = wx.StaticBoxSizer(summary_box, wx.HORIZONTAL)

        # Summary details
        summary_details = wx.BoxSizer(wx.VERTICAL)

        self.item_count_text = wx.StaticText(self, label="Items: 0")
        summary_details.Add(self.item_count_text, 0, wx.ALL, 2)

        self.total_cost_text = wx.StaticText(self, label="Total: $0.00")
        summary_details.Add(self.total_cost_text, 0, wx.ALL, 2)

        summary_sizer.Add(summary_details, 0, wx.ALL, 5)

        summary_sizer.AddStretchSpacer()

        # Fulfillment options
        fulfillment_label = wx.StaticText(self, label="Fulfillment:")
        summary_sizer.Add(fulfillment_label, 0, wx.ALIGN_CENTER_VERTICAL | wx.ALL, 5)

        self.pickup_btn = wx.Button(self, label="Pickup")
        self.pickup_btn.Bind(wx.EVT_BUTTON, self._on_pickup)
        summary_sizer.Add(self.pickup_btn, 0, wx.ALL, 5)

        self.delivery_btn = wx.Button(self, label="Delivery")
        self.delivery_btn.Bind(wx.EVT_BUTTON, self._on_delivery)
        summary_sizer.Add(self.delivery_btn, 0, wx.ALL, 5)

        main_sizer.Add(summary_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Set main sizer
        self.SetSizer(main_sizer)

    def refresh(self) -> None:
        """Refresh the cart display."""
        try:
            # Clear current list
            self.cart_list.DeleteAllItems()

            # Get cart items from service
            self.cart_items = self.client_service.get_cart_items()

            # Populate list control
            total_cost = 0.0
            for i, item in enumerate(self.cart_items):
                # Item name
                self.cart_list.InsertItem(i, item.get("name", "Unknown"))

                # Quantity
                quantity = item.get("quantity", 1)
                self.cart_list.SetItem(i, 1, str(quantity))

                # Price
                price = item.get("price", 0.0)
                self.cart_list.SetItem(i, 2, f"${price:.2f}")

                # Total
                item_total = price * quantity
                total_cost += item_total
                self.cart_list.SetItem(i, 3, f"${item_total:.2f}")

                # Store
                store = item.get("store", "N/A")
                self.cart_list.SetItem(i, 4, store)

                # Actions
                actions = "Remove | Update"
                self.cart_list.SetItem(i, 5, actions)

                # Store item data
                self.cart_list.SetItemData(i, i)

            # Update summary
            self._update_summary(len(self.cart_items), total_cost)

            # Update button states
            self._update_button_states()

        except Exception as e:
            wx.MessageBox(f"Error refreshing cart: {e}", "Error", wx.OK | wx.ICON_ERROR)

    def _update_summary(self, item_count: int, total_cost: float) -> None:
        """Update the cart summary display."""
        self.item_count_text.SetLabel(f"Items: {item_count}")
        self.total_cost_text.SetLabel(f"Total: ${total_cost:.2f}")

    def _update_button_states(self) -> None:
        """Update button states based on current data."""
        has_items = len(self.cart_items) > 0
        is_authenticated = self.client_service.is_authenticated()

        self.clear_btn.Enable(has_items and is_authenticated)
        self.estimate_btn.Enable(has_items)
        self.export_csv_btn.Enable(has_items)
        self.export_excel_btn.Enable(has_items)
        self.pickup_btn.Enable(has_items and is_authenticated)
        self.delivery_btn.Enable(has_items and is_authenticated)

    def _on_refresh(self, event: wx.CommandEvent) -> None:
        """Handle refresh button click."""
        self.refresh()

    def _on_clear_cart(self, event: wx.CommandEvent) -> None:
        """Handle clear cart button click."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to manage your cart", "Error", wx.OK | wx.ICON_ERROR
            )
            return

        if not self.cart_items:
            wx.MessageBox("Cart is already empty", "Info", wx.OK | wx.ICON_INFORMATION)
            return

        # Confirm action
        result = wx.MessageBox(
            f"Clear {len(self.cart_items)} items from cart?",
            "Confirm",
            wx.YES_NO | wx.ICON_QUESTION,
        )

        if result == wx.YES:
            try:
                if self.client_service.clear_cart():
                    wx.MessageBox(
                        "Cart cleared successfully",
                        "Success",
                        wx.OK | wx.ICON_INFORMATION,
                    )
                    self.refresh()
                else:
                    wx.MessageBox(
                        "Failed to clear cart", "Error", wx.OK | wx.ICON_ERROR
                    )
            except Exception as e:
                wx.MessageBox(
                    f"Error clearing cart: {e}", "Error", wx.OK | wx.ICON_ERROR
                )

    def _on_estimate_total(self, event: wx.CommandEvent) -> None:
        """Handle estimate total button click."""
        if not self.cart_items:
            wx.MessageBox("Cart is empty", "Info", wx.OK | wx.ICON_INFORMATION)
            return

        try:
            # Calculate total
            total_cost = sum(
                item.get("price", 0.0) * item.get("quantity", 1)
                for item in self.cart_items
            )

            # Show detailed breakdown
            message = "Cart Cost Breakdown:\n\n"
            for item in self.cart_items:
                name = item.get("name", "Unknown")
                quantity = item.get("quantity", 1)
                price = item.get("price", 0.0)
                item_total = price * quantity
                message += f"{name} (qty: {quantity}) - ${price:.2f} each = ${item_total:.2f}\n"

            message += f"\nTotal: ${total_cost:.2f}"

            wx.MessageBox(message, "Cost Estimate", wx.OK | wx.ICON_INFORMATION)

        except Exception as e:
            wx.MessageBox(
                f"Error estimating total: {e}", "Error", wx.OK | wx.ICON_ERROR
            )

    def _on_export_csv(self, event: wx.CommandEvent) -> None:
        """Handle export to CSV button click."""
        if not self.cart_items:
            wx.MessageBox("Cart is empty", "Info", wx.OK | wx.ICON_INFORMATION)
            return

        try:
            # Get save file path
            with wx.FileDialog(
                self,
                "Export Cart to CSV",
                wildcard="CSV files (*.csv)|*.csv",
                defaultFile="meijer_cart.csv",
            ) as fileDialog:
                if fileDialog.ShowModal() == wx.ID_OK:
                    filepath = fileDialog.GetPath()

                    if self.client_service.export_cart_to_csv(filepath):
                        wx.MessageBox(
                            f"Cart exported to {filepath}",
                            "Success",
                            wx.OK | wx.ICON_INFORMATION,
                        )
                    else:
                        wx.MessageBox(
                            "Failed to export cart", "Error", wx.OK | wx.ICON_ERROR
                        )

        except Exception as e:
            wx.MessageBox(f"Error exporting cart: {e}", "Error", wx.OK | wx.ICON_ERROR)

    def _on_export_excel(self, event: wx.CommandEvent) -> None:
        """Handle export to Excel button click."""
        if not self.cart_items:
            wx.MessageBox("Cart is empty", "Info", wx.OK | wx.ICON_INFORMATION)
            return

        try:
            # Get save file path
            with wx.FileDialog(
                self,
                "Export Cart to Excel",
                wildcard="Excel files (*.xlsx)|*.xlsx",
                defaultFile="meijer_cart.xlsx",
            ) as fileDialog:
                if fileDialog.ShowModal() == wx.ID_OK:
                    filepath = fileDialog.GetPath()

                    if self.client_service.export_cart_to_excel(filepath):
                        wx.MessageBox(
                            f"Cart exported to {filepath}",
                            "Success",
                            wx.OK | wx.ICON_INFORMATION,
                        )
                    else:
                        wx.MessageBox(
                            "Failed to export cart", "Error", wx.OK | wx.ICON_ERROR
                        )

        except Exception as e:
            wx.MessageBox(f"Error exporting cart: {e}", "Error", wx.OK | wx.ICON_ERROR)

    def _on_pickup(self, event: wx.CommandEvent) -> None:
        """Handle pickup button click."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to manage your cart", "Error", wx.OK | wx.ICON_ERROR
            )
            return

        wx.MessageBox(
            "Pickup functionality not yet implemented",
            "Info",
            wx.OK | wx.ICON_INFORMATION,
        )

    def _on_delivery(self, event: wx.CommandEvent) -> None:
        """Handle delivery button click."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to manage your cart", "Error", wx.OK | wx.ICON_ERROR
            )
            return

        wx.MessageBox(
            "Delivery functionality not yet implemented",
            "Info",
            wx.OK | wx.ICON_INFORMATION,
        )

    def _on_cart_item_activated(self, event: wx.ListEvent) -> None:
        """Handle cart item activation (double-click)."""
        item_index = event.GetIndex()
        if item_index >= 0 and item_index < len(self.cart_items):
            item = self.cart_items[item_index]
            self._show_item_dialog(item)

    def _show_item_dialog(self, item: dict[str, Any]) -> None:
        """Show dialog for cart item actions."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to manage your cart", "Error", wx.OK | wx.ICON_ERROR
            )
            return

        # Create action dialog
        dialog = wx.SingleChoiceDialog(
            self,
            f"Choose action for '{item.get('name', 'Unknown')}':",
            "Item Actions",
            ["Update Quantity", "Remove Item", "Cancel"],
        )

        if dialog.ShowModal() == wx.ID_OK:
            choice = dialog.GetSelection()

            if choice == 0:  # Update quantity
                self._update_item_quantity(item)

            elif choice == 1:  # Remove item
                result = wx.MessageBox(
                    f"Remove '{item.get('name', 'Unknown')}' from cart?",
                    "Confirm",
                    wx.YES_NO | wx.ICON_QUESTION,
                )

                if result == wx.YES:
                    if self.client_service.remove_cart_item(item["id"]):
                        self.refresh()
                    else:
                        wx.MessageBox(
                            "Failed to remove item", "Error", wx.OK | wx.ICON_ERROR
                        )

        dialog.Destroy()

    def _update_item_quantity(self, item: dict[str, Any]) -> None:
        """Update item quantity dialog."""
        current_qty = item.get("quantity", 1)

        dialog = wx.NumberEntryDialog(
            self,
            f"Enter new quantity for '{item.get('name', 'Unknown')}':",
            "Update Quantity",
            "Quantity",
            current_qty,
            1,
            99,
        )

        if dialog.ShowModal() == wx.ID_OK:
            new_qty = dialog.GetValue()

            if new_qty != current_qty:
                try:
                    if self.client_service.update_cart_item_quantity(
                        item["id"], new_qty
                    ):
                        self.refresh()
                    else:
                        wx.MessageBox(
                            "Failed to update quantity", "Error", wx.OK | wx.ICON_ERROR
                        )
                except Exception as e:
                    wx.MessageBox(
                        f"Error updating quantity: {e}", "Error", wx.OK | wx.ICON_ERROR
                    )

        dialog.Destroy()

    def _bind_events(self) -> None:
        """Bind list control events."""
        self.cart_list.Bind(wx.EVT_LIST_ITEM_ACTIVATED, self._on_cart_item_activated)
