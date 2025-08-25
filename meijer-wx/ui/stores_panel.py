"""
Stores management panel.
"""

from typing import Any

import wx

from services.client import MeijerClientService
from services.settings import SettingsService


class StoresPanel(wx.Panel):
    """
    Stores management panel.

    Provides functionality to view nearby stores and search for stores by location.
    """

    def __init__(
        self,
        parent: wx.Window,
        settings_service: SettingsService,
        client_service: MeijerClientService,
        **kwargs: Any,
    ) -> None:
        """
        Initialize the stores panel.

        Args:
            parent: Parent window
            settings_service: Application settings service
            client_service: Meijer client service
            **kwargs: Additional wx.Panel arguments
        """
        super().__init__(parent, **kwargs)

        self.settings_service = settings_service
        self.client_service = client_service
        self.stores: list[dict[str, Any]] = []

        # Create UI
        self._create_ui()

        # Initial refresh
        self.refresh()

    def _create_ui(self) -> None:
        """Create the stores UI."""
        # Main sizer
        main_sizer = wx.BoxSizer(wx.VERTICAL)

        # Search section
        search_box = wx.StaticBox(self, label="Store Search")
        search_sizer = wx.StaticBoxSizer(search_box, wx.VERTICAL)

        # Location search
        location_sizer = wx.BoxSizer(wx.HORIZONTAL)
        location_sizer.Add(
            wx.StaticText(self, label="Location:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.location_input = wx.TextCtrl(self, size=(200, -1))
        self.location_input.SetHint("City, State or ZIP")
        location_sizer.Add(
            self.location_input, 0, wx.ALIGN_CENTER_VERTICAL | wx.LEFT, 10
        )

        location_sizer.Add(
            wx.StaticText(self, label="Radius (miles):"),
            0,
            wx.ALIGN_CENTER_VERTICAL | wx.LEFT,
            10,
        )
        self.radius_input = wx.SpinCtrl(self, min=1, max=100, initial=25, size=(80, -1))
        location_sizer.Add(self.radius_input, 0, wx.ALIGN_CENTER_VERTICAL | wx.LEFT, 5)

        location_sizer.AddStretchSpacer()

        # Search button
        self.search_btn = wx.Button(self, label="Search")
        self.search_btn.Bind(wx.EVT_BUTTON, self._on_search)
        location_sizer.Add(self.search_btn, 0, wx.ALL, 5)

        search_sizer.Add(location_sizer, 0, wx.EXPAND | wx.ALL, 5)

        # Use current location button
        self.current_location_btn = wx.Button(self, label="Use Current Location")
        self.current_location_btn.Bind(wx.EVT_BUTTON, self._on_use_current_location)
        search_sizer.Add(self.current_location_btn, 0, wx.ALIGN_LEFT | wx.ALL, 5)

        main_sizer.Add(search_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Stores section
        stores_box = wx.StaticBox(self, label="Nearby Stores")
        stores_sizer = wx.StaticBoxSizer(stores_box, wx.VERTICAL)

        # Store controls
        controls_sizer = wx.BoxSizer(wx.HORIZONTAL)

        self.refresh_btn = wx.Button(self, label="Refresh")
        self.refresh_btn.Bind(wx.EVT_BUTTON, self._on_refresh)
        controls_sizer.Add(self.refresh_btn, 0, wx.ALL, 5)

        controls_sizer.AddStretchSpacer()

        stores_sizer.Add(controls_sizer, 0, wx.EXPAND | wx.ALL, 5)

        # Stores list
        self.stores_list = wx.ListCtrl(self, style=wx.LC_REPORT | wx.LC_SINGLE_SEL)

        # Add columns
        self.stores_list.InsertColumn(0, "Store Name", width=200)
        self.stores_list.InsertColumn(1, "Address", width=250)
        self.stores_list.InsertColumn(2, "City/State", width=120)
        self.stores_list.InsertColumn(3, "Distance", width=80)
        self.stores_list.InsertColumn(4, "Phone", width=120)

        stores_sizer.Add(self.stores_list, 1, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(stores_sizer, 1, wx.EXPAND | wx.ALL, 10)

        # Summary section
        summary_box = wx.StaticBox(self, label="Summary")
        summary_sizer = wx.StaticBoxSizer(summary_box, wx.HORIZONTAL)

        self.summary_text = wx.StaticText(self, label="No stores found")
        summary_sizer.Add(self.summary_text, 1, wx.ALIGN_CENTER_VERTICAL | wx.ALL, 5)

        main_sizer.Add(summary_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Set main sizer
        self.SetSizer(main_sizer)

    def refresh(self) -> None:
        """Refresh the stores display."""
        try:
            # Clear current list
            self.stores_list.DeleteAllItems()

            # Get stores from service (default to nearby stores)
            self.stores = self.client_service.get_stores()

            # Populate list control
            for i, store in enumerate(self.stores):
                # Store name - InsertItem creates the row
                self.stores_list.InsertItem(i, store.get("name", "Unknown"))

                # Address - SetItem for subsequent columns
                address = store.get("address", "N/A")
                self.stores_list.SetItem(i, 1, address)

                # City/State
                city = store.get("city", "")
                state = store.get("state", "")
                city_state = f"{city}, {state}" if city and state else "N/A"
                self.stores_list.SetItem(i, 2, city_state)

                # Distance
                distance = store.get("distance")
                if distance:
                    distance_str = f"{distance:.1f} mi"
                else:
                    distance_str = "N/A"
                self.stores_list.SetItem(i, 3, distance_str)

                # Phone
                phone = store.get("phone", "N/A")
                self.stores_list.SetItem(i, 4, phone)

                # Store store data
                self.stores_list.SetItemData(i, i)

            # Update summary
            self._update_summary()

            # Update button states
            self._update_button_states()

        except Exception as e:
            wx.MessageBox(
                f"Error refreshing stores: {e}", "Error", wx.OK | wx.ICON_ERROR
            )

    def _update_summary(self) -> None:
        """Update the summary text."""
        if not self.stores:
            self.summary_text.SetLabel("No stores found")
            return

        total = len(self.stores)

        # Count stores by state
        states = {}
        for store in self.stores:
            state = store.get("state", "Unknown")
            states[state] = states.get(state, 0) + 1

        state_summary = ", ".join(
            [f"{state}: {count}" for state, count in states.items()]
        )
        summary = f"Total: {total} stores | {state_summary}"
        self.summary_text.SetLabel(summary)

    def _update_button_states(self) -> None:
        """Update button states based on current data."""

        self.refresh_btn.Enable(True)
        self.search_btn.Enable(True)
        self.current_location_btn.Enable(True)

    def _on_search(self, event: wx.CommandEvent) -> None:
        """Handle search button click."""
        location = self.location_input.GetValue().strip()
        radius = self.radius_input.GetValue()

        if not location:
            wx.MessageBox(
                "Please enter a location to search", "Error", wx.OK | wx.ICON_ERROR
            )
            return

        try:
            # Search for stores by location
            self.stores = self.client_service.get_stores(location, radius)

            # Update display
            self._refresh_stores_display()

            if self.stores:
                wx.MessageBox(
                    f"Found {len(self.stores)} stores near {location}",
                    "Success",
                    wx.OK | wx.ICON_INFORMATION,
                )
            else:
                wx.MessageBox(
                    f"No stores found near {location}",
                    "Info",
                    wx.OK | wx.ICON_INFORMATION,
                )

        except Exception as e:
            wx.MessageBox(
                f"Error searching for stores: {e}", "Error", wx.OK | wx.ICON_ERROR
            )

    def _on_use_current_location(self, event: wx.CommandEvent) -> None:
        """Handle use current location button click."""
        try:
            # Get stores near current location (default coordinates)
            self.stores = self.client_service.get_stores()

            # Update display
            self._refresh_stores_display()

            if self.stores:
                wx.MessageBox(
                    f"Found {len(self.stores)} stores near your location",
                    "Success",
                    wx.OK | wx.ICON_INFORMATION,
                )
            else:
                wx.MessageBox(
                    "No stores found near your location",
                    "Info",
                    wx.OK | wx.ICON_INFORMATION,
                )

        except Exception as e:
            wx.MessageBox(
                f"Error getting nearby stores: {e}", "Error", wx.OK | wx.ICON_ERROR
            )

    def _on_refresh(self, event: wx.CommandEvent) -> None:
        """Handle refresh button click."""
        self.refresh()

    def _refresh_stores_display(self) -> None:
        """Refresh the stores display with current data."""
        try:
            # Clear current list
            self.stores_list.DeleteAllItems()

            # Populate list control
            for i, store in enumerate(self.stores):
                # Store name - InsertItem creates the row
                self.stores_list.InsertItem(i, store.get("name", "Unknown"))

                # Address - SetItem for subsequent columns
                address = store.get("address", "N/A")
                self.stores_list.SetItem(i, 1, address)

                # City/State
                city = store.get("city", "")
                state = store.get("state", "")
                city_state = f"{city}, {state}" if city and state else "N/A"
                self.stores_list.SetItem(i, 2, city_state)

                # Distance
                distance = store.get("distance")
                if distance:
                    distance_str = f"{distance:.1f} mi"
                else:
                    distance_str = "N/A"
                self.stores_list.SetItem(i, 3, distance_str)

                # Phone
                phone = store.get("phone", "N/A")
                self.stores_list.SetItem(i, 4, phone)

                # Store store data
                self.stores_list.SetItemData(i, i)

            # Update summary
            self._update_summary()

        except Exception as e:
            wx.MessageBox(
                f"Error refreshing stores display: {e}", "Error", wx.OK | wx.ICON_ERROR
            )

    def _on_store_activated(self, event: wx.ListEvent) -> None:
        """Handle store activation (double-click)."""
        item_index = event.GetIndex()
        if item_index >= 0 and item_index < len(self.stores):
            store = self.stores[item_index]
            self._show_store_details(store)

    def _show_store_details(self, store: dict[str, Any]) -> None:
        """Show store details dialog."""
        message = f"Store: {store.get('name', 'Unknown')}\n"
        message += f"Address: {store.get('address', 'N/A')}\n"
        message += f"City: {store.get('city', 'N/A')}\n"
        message += f"State: {store.get('state', 'N/A')}\n"
        message += f"ZIP: {store.get('zip_code', 'N/A')}\n"
        message += f"Phone: {store.get('phone', 'N/A')}\n"

        distance = store.get("distance")
        if distance:
            message += f"Distance: {distance:.1f} miles\n"

        wx.MessageBox(message, "Store Details", wx.OK | wx.ICON_INFORMATION)

    def _bind_events(self) -> None:
        """Bind list control events."""
        self.stores_list.Bind(wx.EVT_LIST_ITEM_ACTIVATED, self._on_store_activated)
