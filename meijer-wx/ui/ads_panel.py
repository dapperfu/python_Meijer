"""
Weekly ads browsing panel.
"""

from typing import Any

import wx

from services.client import MeijerClientService
from services.settings import SettingsService


class AdsPanel(wx.Panel):
    """
    Weekly ads browsing panel.

    Provides functionality to browse weekly ads, view deals, and search for items.
    """

    def __init__(
        self,
        parent: wx.Window,
        settings_service: SettingsService,
        client_service: MeijerClientService,
        **kwargs: Any,
    ) -> None:
        """
        Initialize the ads panel.

        Args:
            parent: Parent window
            settings_service: Application settings service
            client_service: Meijer client service
            **kwargs: Additional wx.Panel arguments
        """
        super().__init__(parent, **kwargs)

        self.settings_service = settings_service
        self.client_service = client_service
        self.ads_items: list[dict[str, Any]] = []
        self.current_ad_type = "weekly"

        # Create UI
        self._create_ui()

        # Initial refresh
        self.refresh()

    def _create_ui(self) -> None:
        """Create the ads UI."""
        # Main sizer
        main_sizer = wx.BoxSizer(wx.VERTICAL)

        # Ad type selection section
        type_box = wx.StaticBox(self, label="Ad Type")
        type_sizer = wx.StaticBoxSizer(type_box, wx.HORIZONTAL)

        # Ad type radio buttons
        self.weekly_radio = wx.RadioButton(self, label="Weekly Ads", style=wx.RB_GROUP)
        self.weekly_radio.Bind(wx.EVT_RADIOBUTTON, self._on_weekly_selected)
        type_sizer.Add(self.weekly_radio, 0, wx.ALL, 5)

        self.digital_radio = wx.RadioButton(self, label="Digital Deals")
        self.digital_radio.Bind(wx.EVT_RADIOBUTTON, self._on_digital_selected)
        type_sizer.Add(self.digital_radio, 0, wx.ALL, 5)

        self.clearance_radio = wx.RadioButton(self, label="Clearance")
        self.clearance_radio.Bind(wx.EVT_RADIOBUTTON, self._on_clearance_selected)
        type_sizer.Add(self.clearance_radio, 0, wx.ALL, 5)

        type_sizer.AddStretchSpacer()

        # Store selection
        store_label = wx.StaticText(self, label="Store:")
        type_sizer.Add(store_label, 0, wx.ALIGN_CENTER_VERTICAL | wx.ALL, 5)

        self.store_choice = wx.Choice(self, choices=["All Stores", "Current Store"])
        self.store_choice.SetSelection(0)
        self.store_choice.Bind(wx.EVT_CHOICE, self._on_store_change)
        type_sizer.Add(self.store_choice, 0, wx.ALL, 5)

        main_sizer.Add(type_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Search and filter section
        filter_box = wx.StaticBox(self, label="Search & Filter")
        filter_sizer = wx.StaticBoxSizer(filter_box, wx.VERTICAL)

        # Search row
        search_row = wx.BoxSizer(wx.HORIZONTAL)

        search_label = wx.StaticText(self, label="Search:")
        search_row.Add(search_label, 0, wx.ALIGN_CENTER_VERTICAL | wx.ALL, 5)

        self.search_input = wx.TextCtrl(self, size=(300, -1))
        self.search_input.SetHint("Enter product name, category, or keyword")
        search_row.Add(self.search_input, 1, wx.EXPAND | wx.ALL, 5)

        self.search_btn = wx.Button(self, label="Search")
        self.search_btn.Bind(wx.EVT_BUTTON, self._on_search)
        search_row.Add(self.search_btn, 0, wx.ALL, 5)

        self.clear_search_btn = wx.Button(self, label="Clear")
        self.clear_search_btn.Bind(wx.EVT_BUTTON, self._on_clear_search)
        search_row.Add(self.clear_search_btn, 0, wx.ALL, 5)

        filter_sizer.Add(search_row, 0, wx.EXPAND | wx.ALL, 5)

        # Filter row
        filter_row = wx.BoxSizer(wx.HORIZONTAL)

        filter_label = wx.StaticText(self, label="Category:")
        filter_row.Add(filter_label, 0, wx.ALIGN_CENTER_VERTICAL | wx.ALL, 5)

        self.category_choice = wx.Choice(
            self,
            choices=[
                "All Categories",
                "Food",
                "Beverages",
                "Household",
                "Health",
                "Beauty",
                "Electronics",
                "Clothing",
                "Home & Garden",
            ],
        )
        self.category_choice.SetSelection(0)
        self.category_choice.Bind(wx.EVT_CHOICE, self._on_category_change)
        filter_row.Add(self.category_choice, 0, wx.ALL, 5)

        filter_row.AddStretchSpacer()

        self.refresh_btn = wx.Button(self, label="Refresh")
        self.refresh_btn.Bind(wx.EVT_BUTTON, self._on_refresh)
        filter_row.Add(self.refresh_btn, 0, wx.ALL, 5)

        filter_sizer.Add(filter_row, 0, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(filter_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Ads content section
        content_box = wx.StaticBox(self, label="Ad Items")
        content_sizer = wx.StaticBoxSizer(content_box, wx.VERTICAL)

        # Content controls
        controls_row = wx.BoxSizer(wx.HORIZONTAL)

        self.export_btn = wx.Button(self, label="Export")
        self.export_btn.Bind(wx.EVT_BUTTON, self._on_export)
        controls_row.Add(self.export_btn, 0, wx.ALL, 5)

        self.add_to_list_btn = wx.Button(self, label="Add to Shopping List")
        self.add_to_list_btn.Bind(wx.EVT_BUTTON, self._on_add_to_list)
        controls_row.Add(self.add_to_list_btn, 0, wx.ALL, 5)

        controls_row.AddStretchSpacer()

        # Sort options
        sort_label = wx.StaticText(self, label="Sort by:")
        controls_row.Add(sort_label, 0, wx.ALIGN_CENTER_VERTICAL | wx.ALL, 5)

        self.sort_choice = wx.Choice(
            self, choices=["Name", "Price", "Discount", "Category", "End Date"]
        )
        self.sort_choice.SetSelection(0)
        self.sort_choice.Bind(wx.EVT_CHOICE, self._on_sort_change)
        controls_row.Add(self.sort_choice, 0, wx.ALL, 5)

        content_sizer.Add(controls_row, 0, wx.EXPAND | wx.ALL, 5)

        # Ads list
        self.ads_list = wx.ListCtrl(self, style=wx.LC_REPORT | wx.LC_SINGLE_SEL)

        # Add columns
        self.ads_list.InsertColumn(0, "Product", width=250)
        self.ads_list.InsertColumn(1, "Category", width=100)
        self.ads_list.InsertColumn(2, "Original Price", width=100)
        self.ads_list.InsertColumn(3, "Sale Price", width=100)
        self.ads_list.InsertColumn(4, "Discount", width=80)
        self.ads_list.InsertColumn(5, "End Date", width=100)
        self.ads_list.InsertColumn(6, "Store", width=80)
        self.ads_list.InsertColumn(7, "Actions", width=120)

        content_sizer.Add(self.ads_list, 1, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(content_sizer, 1, wx.EXPAND | wx.ALL, 10)

        # Summary section
        summary_box = wx.StaticBox(self, label="Ad Summary")
        summary_sizer = wx.StaticBoxSizer(summary_box, wx.HORIZONTAL)

        # Summary details
        summary_details = wx.BoxSizer(wx.VERTICAL)

        self.total_items_text = wx.StaticText(self, label="Total Items: 0")
        summary_details.Add(self.total_items_text, 0, wx.ALL, 2)

        self.total_savings_text = wx.StaticText(self, label="Total Savings: $0.00")
        summary_details.Add(self.total_savings_text, 0, wx.ALL, 2)

        self.categories_text = wx.StaticText(self, label="Categories: 0")
        summary_details.Add(self.categories_text, 0, wx.ALL, 2)

        summary_sizer.Add(summary_details, 0, wx.ALL, 5)

        summary_sizer.AddStretchSpacer()

        # Quick actions
        actions_label = wx.StaticText(self, label="Quick Actions:")
        summary_sizer.Add(actions_label, 0, wx.ALIGN_CENTER_VERTICAL | wx.ALL, 5)

        self.view_all_deals_btn = wx.Button(self, label="View All Deals")
        self.view_all_deals_btn.Bind(wx.EVT_BUTTON, self._on_view_all_deals)
        summary_sizer.Add(self.view_all_deals_btn, 0, wx.ALL, 5)

        self.expiring_soon_btn = wx.Button(self, label="Expiring Soon")
        self.expiring_soon_btn.Bind(wx.EVT_BUTTON, self._on_expiring_soon)
        summary_sizer.Add(self.expiring_soon_btn, 0, wx.ALL, 5)

        main_sizer.Add(summary_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Set main sizer
        self.SetSizer(main_sizer)

    def refresh(self) -> None:
        """Refresh the ads display."""
        try:
            # Clear current list
            self.ads_list.DeleteAllItems()

            # Get ads items from service
            self.ads_items = self.client_service.get_ads_items(
                ad_type=self.current_ad_type, store_id=self._get_selected_store_id()
            )

            # Apply search and filters
            filtered_items = self._apply_filters(self.ads_items)

            # Sort items
            sorted_items = self._sort_items(filtered_items)

            # Populate list control
            total_savings = 0.0
            categories = set()

            for i, item in enumerate(sorted_items):
                # Product name
                self.ads_list.InsertItem(i, item.get("name", "Unknown"))

                # Category
                category = item.get("category", "Unknown")
                self.ads_list.SetItem(i, 1, category)
                categories.add(category)

                # Original price
                original_price = item.get("original_price", 0.0)
                self.ads_list.SetItem(i, 2, f"${original_price:.2f}")

                # Sale price
                sale_price = item.get("sale_price", 0.0)
                self.ads_list.SetItem(i, 3, f"${sale_price:.2f}")

                # Discount
                discount = original_price - sale_price
                if discount > 0:
                    total_savings += discount
                    discount_text = f"${discount:.2f}"
                else:
                    discount_text = "N/A"
                self.ads_list.SetItem(i, 4, discount_text)

                # End date
                end_date = item.get("end_date", "N/A")
                self.ads_list.SetItem(i, 5, end_date)

                # Store
                store = item.get("store", "All")
                self.ads_list.SetItem(i, 6, store)

                # Actions
                actions = "Add to List | View Details"
                self.ads_list.SetItem(i, 7, actions)

                # Store item data
                self.ads_list.SetItemData(i, i)

            # Update summary
            self._update_summary(len(sorted_items), total_savings, len(categories))

            # Update button states
            self._update_button_states()

        except Exception as e:
            wx.MessageBox(f"Error refreshing ads: {e}", "Error", wx.OK | wx.ICON_ERROR)

    def _apply_filters(self, items: list[dict[str, Any]]) -> list[dict[str, Any]]:
        """Apply search and category filters."""
        filtered_items = items

        # Apply search filter
        search_term = self.search_input.GetValue().strip().lower()
        if search_term:
            filtered_items = [
                item
                for item in filtered_items
                if (
                    search_term in item.get("name", "").lower()
                    or search_term in item.get("category", "").lower()
                    or search_term in item.get("description", "").lower()
                )
            ]

        # Apply category filter
        category_choice = self.category_choice.GetSelection()
        if category_choice > 0:  # Skip "All Categories"
            category_names = [
                "Food",
                "Beverages",
                "Household",
                "Health",
                "Beauty",
                "Electronics",
                "Clothing",
                "Home & Garden",
            ]
            selected_category = category_names[category_choice - 1]
            filtered_items = [
                item
                for item in filtered_items
                if item.get("category") == selected_category
            ]

        return filtered_items

    def _sort_items(self, items: list[dict[str, Any]]) -> list[dict[str, Any]]:
        """Sort items based on current sort choice."""
        sort_choice = self.sort_choice.GetSelection()

        if sort_choice == 0:  # Name
            return sorted(items, key=lambda x: x.get("name", ""))
        elif sort_choice == 1:  # Price
            return sorted(items, key=lambda x: x.get("sale_price", 0.0))
        elif sort_choice == 2:  # Discount
            return sorted(
                items,
                key=lambda x: (x.get("original_price", 0.0) - x.get("sale_price", 0.0)),
                reverse=True,
            )
        elif sort_choice == 3:  # Category
            return sorted(items, key=lambda x: x.get("category", ""))
        elif sort_choice == 4:  # End Date
            return sorted(items, key=lambda x: x.get("end_date", ""))

        return items

    def _get_selected_store_id(self) -> str | None:
        """Get the selected store ID."""
        if self.store_choice.GetSelection() == 1:  # Current Store
            # This would get the current store from settings or client
            return None  # For now, return None to use all stores
        return None

    def _update_summary(
        self, item_count: int, total_savings: float, category_count: int
    ) -> None:
        """Update the ads summary display."""
        self.total_items_text.SetLabel(f"Total Items: {item_count}")
        self.total_savings_text.SetLabel(f"Total Savings: ${total_savings:.2f}")
        self.categories_text.SetLabel(f"Categories: {category_count}")

    def _update_button_states(self) -> None:
        """Update button states based on current data."""
        has_items = len(self.ads_items) > 0
        is_authenticated = self.client_service.is_authenticated()

        self.export_btn.Enable(has_items)
        self.add_to_list_btn.Enable(has_items and is_authenticated)
        self.view_all_deals_btn.Enable(has_items)
        self.expiring_soon_btn.Enable(has_items)

    def _on_weekly_selected(self, event: wx.CommandEvent) -> None:
        """Handle weekly ads selection."""
        self.current_ad_type = "weekly"
        self.refresh()

    def _on_digital_selected(self, event: wx.CommandEvent) -> None:
        """Handle digital deals selection."""
        self.current_ad_type = "digital"
        self.refresh()

    def _on_clearance_selected(self, event: wx.CommandEvent) -> None:
        """Handle clearance selection."""
        self.current_ad_type = "clearance"
        self.refresh()

    def _on_store_change(self, event: wx.CommandEvent) -> None:
        """Handle store selection change."""
        self.refresh()

    def _on_search(self, event: wx.CommandEvent) -> None:
        """Handle search button click."""
        self.refresh()

    def _on_clear_search(self, event: wx.CommandEvent) -> None:
        """Handle clear search button click."""
        self.search_input.SetValue("")
        self.category_choice.SetSelection(0)
        self.refresh()

    def _on_category_change(self, event: wx.CommandEvent) -> None:
        """Handle category filter change."""
        self.refresh()

    def _on_sort_change(self, event: wx.CommandEvent) -> None:
        """Handle sort change."""
        self.refresh()

    def _on_refresh(self, event: wx.CommandEvent) -> None:
        """Handle refresh button click."""
        self.refresh()

    def _on_export(self, event: wx.CommandEvent) -> None:
        """Handle export button click."""
        if not self.ads_items:
            wx.MessageBox("No ads items to export", "Info", wx.OK | wx.ICON_INFORMATION)
            return

        try:
            # Get save file path
            with wx.FileDialog(
                self,
                "Export Ads to CSV",
                wildcard="CSV files (*.csv)|*.csv",
                defaultFile="meijer_ads.csv",
            ) as fileDialog:
                if fileDialog.ShowModal() == wx.ID_OK:
                    filepath = fileDialog.GetPath()

                    if self.client_service.export_ads_to_csv(
                        filepath, self.current_ad_type
                    ):
                        wx.MessageBox(
                            f"Ads exported to {filepath}",
                            "Success",
                            wx.OK | wx.ICON_INFORMATION,
                        )
                    else:
                        wx.MessageBox(
                            "Failed to export ads", "Error", wx.OK | wx.ICON_ERROR
                        )

        except Exception as e:
            wx.MessageBox(f"Error exporting ads: {e}", "Error", wx.OK | wx.ICON_ERROR)

    def _on_add_to_list(self, event: wx.CommandEvent) -> None:
        """Handle add to shopping list button click."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to add items to your shopping list",
                "Error",
                wx.OK | wx.ICON_ERROR,
            )
            return

        # Get selected items
        selected_items = []
        for i in range(self.ads_list.GetItemCount()):
            if self.ads_list.IsSelected(i):
                item_index = self.ads_list.GetItemData(i)
                if item_index < len(self.ads_items):
                    selected_items.append(self.ads_items[item_index])

        if not selected_items:
            wx.MessageBox(
                "Please select items to add to your shopping list",
                "Info",
                wx.OK | wx.ICON_INFORMATION,
            )
            return

        try:
            added_count = 0
            for item in selected_items:
                if self.client_service.add_shopping_list_item(
                    description=item.get("name", ""),
                    quantity=1,
                    notes=f"From {self.current_ad_type} ad - {item.get('category', 'Unknown')}",
                ):
                    added_count += 1

            wx.MessageBox(
                f"Added {added_count} items to shopping list",
                "Success",
                wx.OK | wx.ICON_INFORMATION,
            )

        except Exception as e:
            wx.MessageBox(
                f"Error adding items to shopping list: {e}",
                "Error",
                wx.OK | wx.ICON_ERROR,
            )

    def _on_view_all_deals(self, event: wx.CommandEvent) -> None:
        """Handle view all deals button click."""
        # Clear filters to show all items
        self.search_input.SetValue("")
        self.category_choice.SetSelection(0)
        self.refresh()

    def _on_expiring_soon(self, event: wx.CommandEvent) -> None:
        """Handle expiring soon button click."""
        # This would filter for items expiring soon
        # For now, just show a message
        wx.MessageBox(
            "Expiring soon filter not yet implemented",
            "Info",
            wx.OK | wx.ICON_INFORMATION,
        )

    def _on_ads_item_activated(self, event: wx.ListEvent) -> None:
        """Handle ads item activation (double-click)."""
        item_index = event.GetIndex()
        if item_index >= 0 and item_index < len(self.ads_items):
            item = self.ads_items[item_index]
            self._show_item_dialog(item)

    def _show_item_dialog(self, item: dict[str, Any]) -> None:
        """Show dialog for ads item actions."""
        # Create action dialog
        dialog = wx.SingleChoiceDialog(
            self,
            f"Choose action for '{item.get('name', 'Unknown')}':",
            "Item Actions",
            ["Add to Shopping List", "View Details", "Cancel"],
        )

        if dialog.ShowModal() == wx.ID_OK:
            choice = dialog.GetSelection()

            if choice == 0:  # Add to shopping list
                if not self.client_service.is_authenticated():
                    wx.MessageBox(
                        "Please login to add items to your shopping list",
                        "Error",
                        wx.OK | wx.ICON_ERROR,
                    )
                else:
                    try:
                        if self.client_service.add_shopping_list_item(
                            description=item.get("name", ""),
                            quantity=1,
                            notes=f"From {self.current_ad_type} ad - {item.get('category', 'Unknown')}",
                        ):
                            wx.MessageBox(
                                "Item added to shopping list",
                                "Success",
                                wx.OK | wx.ICON_INFORMATION,
                            )
                        else:
                            wx.MessageBox(
                                "Failed to add item to shopping list",
                                "Error",
                                wx.OK | wx.ICON_ERROR,
                            )
                    except Exception as e:
                        wx.MessageBox(
                            f"Error adding item: {e}", "Error", wx.OK | wx.ICON_ERROR
                        )

            elif choice == 1:  # View details
                self._show_item_details(item)

        dialog.Destroy()

    def _show_item_details(self, item: dict[str, Any]) -> None:
        """Show detailed information about an ads item."""
        details = f"""
Product Details:
Name: {item.get("name", "Unknown")}
Category: {item.get("category", "Unknown")}
Original Price: ${item.get("original_price", 0.0):.2f}
Sale Price: ${item.get("sale_price", 0.0):.2f}
Discount: ${(item.get("original_price", 0.0) - item.get("sale_price", 0.0)):.2f}
End Date: {item.get("end_date", "N/A")}
Store: {item.get("store", "All")}
Description: {item.get("description", "No description available")}
        """.strip()

        wx.MessageBox(details, "Item Details", wx.OK | wx.ICON_INFORMATION)

    def _bind_events(self) -> None:
        """Bind list control events."""
        self.ads_list.Bind(wx.EVT_LIST_ITEM_ACTIVATED, self._on_ads_item_activated)
