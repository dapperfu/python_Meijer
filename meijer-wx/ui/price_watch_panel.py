"""
Price watch management panel.
"""

from typing import Any

import wx

from services.client import MeijerClientService
from services.settings import SettingsService


class PriceWatchPanel(wx.Panel):
    """
    Price watch management panel.

    Provides functionality to manage price watches and alerts for products.
    """

    def __init__(
        self,
        parent: wx.Window,
        settings_service: SettingsService,
        client_service: MeijerClientService,
        **kwargs: Any,
    ) -> None:
        """
        Initialize the price watch panel.

        Args:
            parent: Parent window
            settings_service: Application settings service
            client_service: Meijer client service
            **kwargs: Additional wx.Panel arguments
        """
        super().__init__(parent, **kwargs)

        self.settings_service = settings_service
        self.client_service = client_service
        self.price_watches: list[dict[str, Any]] = []

        # Create UI
        self._create_ui()

        # Initial refresh
        self.refresh()

    def _create_ui(self) -> None:
        """Create the price watch UI."""
        # Main sizer
        main_sizer = wx.BoxSizer(wx.VERTICAL)

        # Add watch section
        add_box = wx.StaticBox(self, label="Add New Price Watch")
        add_sizer = wx.StaticBoxSizer(add_box, wx.VERTICAL)

        # Input fields
        input_grid = wx.FlexGridSizer(3, 2, 5, 5)

        # Identifier
        input_grid.Add(
            wx.StaticText(self, label="Product Identifier:"),
            0,
            wx.ALIGN_CENTER_VERTICAL,
        )
        self.identifier_input = wx.TextCtrl(self, size=(200, -1))
        input_grid.Add(self.identifier_input, 0, wx.EXPAND)

        # Identifier type
        input_grid.Add(wx.StaticText(self, label="Type:"), 0, wx.ALIGN_CENTER_VERTICAL)
        self.type_choice = wx.Choice(self, choices=["Auto-detect", "UPC", "PLU"])
        self.type_choice.SetSelection(0)
        input_grid.Add(self.type_choice, 0, wx.EXPAND)

        # Store ID
        input_grid.Add(
            wx.StaticText(self, label="Store ID (optional):"),
            0,
            wx.ALIGN_CENTER_VERTICAL,
        )
        self.store_input = wx.TextCtrl(self, size=(200, -1))
        input_grid.Add(self.store_input, 0, wx.EXPAND)

        add_sizer.Add(input_grid, 0, wx.ALL, 5)

        # Advanced options
        advanced_grid = wx.FlexGridSizer(2, 2, 5, 5)

        # Desired price
        advanced_grid.Add(
            wx.StaticText(self, label="Desired Price:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.price_input = wx.TextCtrl(self, size=(100, -1))
        advanced_grid.Add(self.price_input, 0, wx.EXPAND)

        # Alert condition
        advanced_grid.Add(
            wx.StaticText(self, label="Alert When:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.condition_choice = wx.Choice(
            self,
            choices=[
                "Any price drop",
                "Sale or clearance",
                "Clearance only",
                "Below desired price",
            ],
        )
        self.condition_choice.SetSelection(0)
        advanced_grid.Add(self.condition_choice, 0, wx.EXPAND)

        add_sizer.Add(advanced_grid, 0, wx.ALL, 5)

        # Notes
        notes_sizer = wx.BoxSizer(wx.HORIZONTAL)
        notes_sizer.Add(
            wx.StaticText(self, label="Notes:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.notes_input = wx.TextCtrl(self, size=(300, -1))
        notes_sizer.Add(self.notes_input, 1, wx.EXPAND | wx.LEFT, 5)
        add_sizer.Add(notes_sizer, 0, wx.EXPAND | wx.ALL, 5)

        # Add button
        self.add_btn = wx.Button(self, label="Add Price Watch")
        self.add_btn.Bind(wx.EVT_BUTTON, self._on_add_watch)
        add_sizer.Add(self.add_btn, 0, wx.ALIGN_CENTER | wx.ALL, 5)

        main_sizer.Add(add_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Active watches section
        watches_box = wx.StaticBox(self, label="Active Price Watches")
        watches_sizer = wx.StaticBoxSizer(watches_box, wx.VERTICAL)

        # Watch controls
        controls_row = wx.BoxSizer(wx.HORIZONTAL)

        self.refresh_btn = wx.Button(self, label="Refresh")
        self.refresh_btn.Bind(wx.EVT_BUTTON, self._on_refresh)
        controls_row.Add(self.refresh_btn, 0, wx.ALL, 5)

        self.export_btn = wx.Button(self, label="Export")
        self.export_btn.Bind(wx.EVT_BUTTON, self._on_export)
        controls_row.Add(self.export_btn, 0, wx.ALL, 5)

        controls_row.AddStretchSpacer()

        # Filter options
        filter_label = wx.StaticText(self, label="Filter:")
        controls_row.Add(filter_label, 0, wx.ALIGN_CENTER_VERTICAL | wx.ALL, 5)

        self.filter_choice = wx.Choice(
            self, choices=["All", "Active", "Triggered", "Expired"]
        )
        self.filter_choice.SetSelection(0)
        self.filter_choice.Bind(wx.EVT_CHOICE, self._on_filter_change)
        controls_row.Add(self.filter_choice, 0, wx.ALL, 5)

        watches_sizer.Add(controls_row, 0, wx.EXPAND | wx.ALL, 5)

        # Watches list
        self.watches_list = wx.ListCtrl(self, style=wx.LC_REPORT | wx.LC_SINGLE_SEL)

        # Add columns
        self.watches_list.InsertColumn(0, "Product", width=200)
        self.watches_list.InsertColumn(1, "Type", width=60)
        self.watches_list.InsertColumn(2, "Store", width=80)
        self.watches_list.InsertColumn(3, "Desired Price", width=100)
        self.watches_list.InsertColumn(4, "Current Price", width=100)
        self.watches_list.InsertColumn(5, "Status", width=80)
        self.watches_list.InsertColumn(6, "Last Check", width=120)
        self.watches_list.InsertColumn(7, "Actions", width=100)

        watches_sizer.Add(self.watches_list, 1, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(watches_sizer, 1, wx.EXPAND | wx.ALL, 10)

        # Summary section
        summary_box = wx.StaticBox(self, label="Price Watch Summary")
        summary_sizer = wx.StaticBoxSizer(summary_box, wx.HORIZONTAL)

        # Summary details
        summary_details = wx.BoxSizer(wx.VERTICAL)

        self.total_watches_text = wx.StaticText(self, label="Total Watches: 0")
        summary_details.Add(self.total_watches_text, 0, wx.ALL, 2)

        self.active_watches_text = wx.StaticText(self, label="Active: 0")
        summary_details.Add(self.active_watches_text, 0, wx.ALL, 2)

        self.triggered_watches_text = wx.StaticText(self, label="Triggered: 0")
        summary_details.Add(self.triggered_watches_text, 0, wx.ALL, 2)

        summary_sizer.Add(summary_details, 0, wx.ALL, 5)

        summary_sizer.AddStretchSpacer()

        # Management options
        management_label = wx.StaticText(self, label="Management:")
        summary_sizer.Add(management_label, 0, wx.ALIGN_CENTER_VERTICAL | wx.ALL, 5)

        self.check_all_btn = wx.Button(self, label="Check All")
        self.check_all_btn.Bind(wx.EVT_BUTTON, self._on_check_all)
        summary_sizer.Add(self.check_all_btn, 0, wx.ALL, 5)

        self.clear_expired_btn = wx.Button(self, label="Clear Expired")
        self.clear_expired_btn.Bind(wx.EVT_BUTTON, self._on_clear_expired)
        summary_sizer.Add(self.clear_expired_btn, 0, wx.ALL, 5)

        main_sizer.Add(summary_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Set main sizer
        self.SetSizer(main_sizer)

    def refresh(self) -> None:
        """Refresh the price watches display."""
        try:
            # Clear current list
            self.watches_list.DeleteAllItems()

            # Get price watches from service
            self.price_watches = self.client_service.get_price_watches()

            # Apply filter
            filtered_watches = self._apply_filter(self.price_watches)

            # Populate list control
            for i, watch in enumerate(filtered_watches):
                # Product name/identifier
                self.watches_list.InsertItem(
                    i, watch.get("product_name", watch.get("identifier", "Unknown"))
                )

                # Type
                watch_type = watch.get("type", "Unknown")
                self.watches_list.SetItem(i, 1, watch_type)

                # Store
                store = watch.get("store_id", "Any")
                self.watches_list.SetItem(i, 2, store)

                # Desired price
                desired_price = watch.get("desired_price", "N/A")
                if desired_price != "N/A":
                    desired_price = f"${desired_price:.2f}"
                self.watches_list.SetItem(i, 3, desired_price)

                # Current price
                current_price = watch.get("current_price", "N/A")
                if current_price != "N/A":
                    current_price = f"${current_price:.2f}"
                self.watches_list.SetItem(i, 4, current_price)

                # Status
                status = watch.get("status", "Unknown")
                self.watches_list.SetItem(i, 5, status)

                # Last check
                last_check = watch.get("last_check", "Never")
                self.watches_list.SetItem(i, 6, last_check)

                # Actions
                actions = "Edit | Delete"
                self.watches_list.SetItem(i, 7, actions)

                # Store watch data
                self.watches_list.SetItemData(i, i)

            # Update summary
            self._update_summary()

            # Update button states
            self._update_button_states()

        except Exception as e:
            wx.MessageBox(
                f"Error refreshing price watches: {e}", "Error", wx.OK | wx.ICON_ERROR
            )

    def _apply_filter(self, watches: list[dict[str, Any]]) -> list[dict[str, Any]]:
        """Apply filter to price watches."""
        filter_choice = self.filter_choice.GetSelection()

        if filter_choice == 0:  # All
            return watches
        elif filter_choice == 1:  # Active
            return [w for w in watches if w.get("status") == "Active"]
        elif filter_choice == 2:  # Triggered
            return [w for w in watches if w.get("status") == "Triggered"]
        elif filter_choice == 3:  # Expired
            return [w for w in watches if w.get("status") == "Expired"]

        return watches

    def _update_summary(self) -> None:
        """Update the price watch summary display."""
        total = len(self.price_watches)
        active = len([w for w in self.price_watches if w.get("status") == "Active"])
        triggered = len(
            [w for w in self.price_watches if w.get("status") == "Triggered"]
        )

        self.total_watches_text.SetLabel(f"Total Watches: {total}")
        self.active_watches_text.SetLabel(f"Active: {active}")
        self.triggered_watches_text.SetLabel(f"Triggered: {triggered}")

    def _update_button_states(self) -> None:
        """Update button states based on current data."""
        has_watches = len(self.price_watches) > 0
        is_authenticated = self.client_service.is_authenticated()

        self.export_btn.Enable(has_watches)
        self.check_all_btn.Enable(has_watches and is_authenticated)
        self.clear_expired_btn.Enable(has_watches and is_authenticated)

    def _on_add_watch(self, event: wx.CommandEvent) -> None:
        """Handle add watch button click."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to add price watches", "Error", wx.OK | wx.ICON_ERROR
            )
            return

        # Get input values
        identifier = self.identifier_input.GetValue().strip()
        if not identifier:
            wx.MessageBox(
                "Please enter a product identifier", "Error", wx.OK | wx.ICON_ERROR
            )
            return

        # Get type
        type_choice = self.type_choice.GetSelection()
        if type_choice == 0:  # Auto-detect
            id_type = None
        elif type_choice == 1:  # UPC
            id_type = "UPC"
        else:  # PLU
            id_type = "PLU"

        # Get store ID
        store_id = self.store_input.GetValue().strip() or None

        # Get desired price
        price_text = self.price_input.GetValue().strip()
        desired_price = None
        if price_text:
            try:
                desired_price = float(price_text)
            except ValueError:
                wx.MessageBox("Invalid price format", "Error", wx.OK | wx.ICON_ERROR)
                return

        # Get condition
        condition_map = {
            0: "any_drop",
            1: "sale_or_clearance",
            2: "clearance_only",
            3: "below_desired_price",
        }
        condition = condition_map.get(self.condition_choice.GetSelection(), "any_drop")

        # Get notes
        notes = self.notes_input.GetValue().strip() or None

        try:
            # Add price watch
            success = self.client_service.add_price_watch(
                identifier=identifier,
                id_type=id_type,
                store_id=store_id,
                desired_price=desired_price,
                only_when=condition,
                note=notes,
            )

            if success:
                wx.MessageBox(
                    "Price watch added successfully",
                    "Success",
                    wx.OK | wx.ICON_INFORMATION,
                )
                # Clear inputs
                self.identifier_input.SetValue("")
                self.store_input.SetValue("")
                self.price_input.SetValue("")
                self.notes_input.SetValue("")
                # Refresh display
                self.refresh()
            else:
                wx.MessageBox(
                    "Failed to add price watch", "Error", wx.OK | wx.ICON_ERROR
                )

        except Exception as e:
            wx.MessageBox(
                f"Error adding price watch: {e}", "Error", wx.OK | wx.ICON_ERROR
            )

    def _on_refresh(self, event: wx.CommandEvent) -> None:
        """Handle refresh button click."""
        self.refresh()

    def _on_export(self, event: wx.CommandEvent) -> None:
        """Handle export button click."""
        if not self.price_watches:
            wx.MessageBox(
                "No price watches to export", "Info", wx.OK | wx.ICON_INFORMATION
            )
            return

        try:
            # Get save file path
            with wx.FileDialog(
                self,
                "Export Price Watches",
                wildcard="CSV files (*.csv)|*.csv",
                defaultFile="meijer_price_watches.csv",
            ) as fileDialog:
                if fileDialog.ShowModal() == wx.ID_OK:
                    filepath = fileDialog.GetPath()

                    if self.client_service.export_price_watches_to_csv(filepath):
                        wx.MessageBox(
                            f"Price watches exported to {filepath}",
                            "Success",
                            wx.OK | wx.ICON_INFORMATION,
                        )
                    else:
                        wx.MessageBox(
                            "Failed to export price watches",
                            "Error",
                            wx.OK | wx.ICON_ERROR,
                        )

        except Exception as e:
            wx.MessageBox(
                f"Error exporting price watches: {e}", "Error", wx.OK | wx.ICON_ERROR
            )

    def _on_filter_change(self, event: wx.CommandEvent) -> None:
        """Handle filter change."""
        self.refresh()

    def _on_check_all(self, event: wx.CommandEvent) -> None:
        """Handle check all button click."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to check price watches", "Error", wx.OK | wx.ICON_ERROR
            )
            return

        try:
            # Show progress dialog
            progress = wx.ProgressDialog(
                "Checking Price Watches",
                "Checking all price watches...",
                maximum=len(self.price_watches),
                parent=self,
                style=wx.PD_APP_MODAL | wx.PD_AUTO_HIDE,
            )

            checked_count = 0
            for i, watch in enumerate(self.price_watches):
                progress.Update(
                    i, f"Checking {watch.get('product_name', 'Unknown')}..."
                )

                try:
                    if self.client_service.check_price_watch(watch["id"]):
                        checked_count += 1
                except Exception:
                    pass  # Continue with other watches

            progress.Destroy()

            wx.MessageBox(
                f"Checked {checked_count} price watches",
                "Complete",
                wx.OK | wx.ICON_INFORMATION,
            )
            self.refresh()

        except Exception as e:
            wx.MessageBox(
                f"Error checking price watches: {e}", "Error", wx.OK | wx.ICON_ERROR
            )

    def _on_clear_expired(self, event: wx.CommandEvent) -> None:
        """Handle clear expired button click."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to manage price watches", "Error", wx.OK | wx.ICON_ERROR
            )
            return

        expired_watches = [
            w for w in self.price_watches if w.get("status") == "Expired"
        ]
        if not expired_watches:
            wx.MessageBox(
                "No expired price watches found", "Info", wx.OK | wx.ICON_INFORMATION
            )
            return

        # Confirm action
        result = wx.MessageBox(
            f"Remove {len(expired_watches)} expired price watches?",
            "Confirm",
            wx.YES_NO | wx.ICON_QUESTION,
        )

        if result == wx.YES:
            try:
                removed_count = 0
                for watch in expired_watches:
                    if self.client_service.remove_price_watch(watch["id"]):
                        removed_count += 1

                wx.MessageBox(
                    f"Removed {removed_count} expired price watches",
                    "Success",
                    wx.OK | wx.ICON_INFORMATION,
                )
                self.refresh()

            except Exception as e:
                wx.MessageBox(
                    f"Error removing expired watches: {e}",
                    "Error",
                    wx.OK | wx.ICON_ERROR,
                )

    def _on_watch_activated(self, event: wx.ListEvent) -> None:
        """Handle watch activation (double-click)."""
        item_index = event.GetIndex()
        if item_index >= 0 and item_index < len(self.price_watches):
            watch = self.price_watches[item_index]
            self._show_watch_dialog(watch)

    def _show_watch_dialog(self, watch: dict[str, Any]) -> None:
        """Show dialog for price watch actions."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to manage price watches", "Error", wx.OK | wx.ICON_ERROR
            )
            return

        # Create action dialog
        dialog = wx.SingleChoiceDialog(
            self,
            f"Choose action for '{watch.get('product_name', 'Unknown')}':",
            "Watch Actions",
            ["Edit Watch", "Check Price", "Remove Watch", "Cancel"],
        )

        if dialog.ShowModal() == wx.ID_OK:
            choice = dialog.GetSelection()

            if choice == 0:  # Edit watch
                self._edit_watch(watch)

            elif choice == 1:  # Check price
                try:
                    if self.client_service.check_price_watch(watch["id"]):
                        wx.MessageBox(
                            "Price check completed",
                            "Success",
                            wx.OK | wx.ICON_INFORMATION,
                        )
                        self.refresh()
                    else:
                        wx.MessageBox(
                            "Failed to check price", "Error", wx.OK | wx.ICON_ERROR
                        )
                except Exception as e:
                    wx.MessageBox(
                        f"Error checking price: {e}", "Error", wx.OK | wx.ICON_ERROR
                    )

            elif choice == 2:  # Remove watch
                result = wx.MessageBox(
                    f"Remove price watch for '{watch.get('product_name', 'Unknown')}'?",
                    "Confirm",
                    wx.YES_NO | wx.ICON_QUESTION,
                )

                if result == wx.YES:
                    if self.client_service.remove_price_watch(watch["id"]):
                        self.refresh()
                    else:
                        wx.MessageBox(
                            "Failed to remove watch", "Error", wx.OK | wx.ICON_ERROR
                        )

        dialog.Destroy()

    def _edit_watch(self, watch: dict[str, Any]) -> None:
        """Edit price watch dialog."""
        # This would open a dialog to edit the watch parameters
        # For now, just show a message
        wx.MessageBox(
            "Edit functionality not yet implemented",
            "Info",
            wx.OK | wx.ICON_INFORMATION,
        )

    def _bind_events(self) -> None:
        """Bind list control events."""
        self.watches_list.Bind(wx.EVT_LIST_ITEM_ACTIVATED, self._on_watch_activated)
