"""
Coupons management panel.
"""

from typing import Any

import wx

from services.client import MeijerClientService
from services.settings import SettingsService


class CouponsPanel(wx.Panel):
    """
    Coupons management panel.

    Provides functionality to view available coupons and clip them.
    """

    def __init__(
        self,
        parent: wx.Window,
        settings_service: SettingsService,
        client_service: MeijerClientService,
        **kwargs: Any,
    ) -> None:
        """
        Initialize the coupons panel.

        Args:
            parent: Parent window
            settings_service: Application settings service
            client_service: Meijer client service
            **kwargs: Additional wx.Panel arguments
        """
        super().__init__(parent, **kwargs)

        self.settings_service = settings_service
        self.client_service = client_service
        self.coupons: list[dict[str, Any]] = []

        # Create UI
        self._create_ui()

        # Initial refresh
        self.refresh()

    def _create_ui(self) -> None:
        """Create the coupons UI."""
        # Main sizer
        main_sizer = wx.BoxSizer(wx.VERTICAL)

        # Controls section
        controls_box = wx.StaticBox(self, label="Coupon Controls")
        controls_sizer = wx.StaticBoxSizer(controls_box, wx.VERTICAL)

        # Filter controls
        filter_sizer = wx.BoxSizer(wx.HORIZONTAL)

        filter_sizer.Add(
            wx.StaticText(self, label="Filter:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.filter_choice = wx.Choice(
            self, choices=["All", "Available", "Clipped", "Expiring Soon"]
        )
        self.filter_choice.SetSelection(0)
        self.filter_choice.Bind(wx.EVT_CHOICE, self._on_filter_change)
        filter_sizer.Add(self.filter_choice, 0, wx.ALIGN_CENTER_VERTICAL | wx.LEFT, 10)

        filter_sizer.AddStretchSpacer()

        # Refresh button
        self.refresh_btn = wx.Button(self, label="Refresh")
        self.refresh_btn.Bind(wx.EVT_BUTTON, self._on_refresh)
        filter_sizer.Add(self.refresh_btn, 0, wx.ALL, 5)

        controls_sizer.Add(filter_sizer, 0, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(controls_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Coupons section
        coupons_box = wx.StaticBox(self, label="Available Coupons")
        coupons_sizer = wx.StaticBoxSizer(coupons_box, wx.VERTICAL)

        # Coupons list
        self.coupons_list = wx.ListCtrl(self, style=wx.LC_REPORT | wx.LC_SINGLE_SEL)

        # Add columns
        self.coupons_list.InsertColumn(0, "Title", width=250)
        self.coupons_list.InsertColumn(1, "Discount", width=100)
        self.coupons_list.InsertColumn(2, "Status", width=80)
        self.coupons_list.InsertColumn(3, "Expires", width=120)
        self.coupons_list.InsertColumn(4, "Actions", width=100)

        coupons_sizer.Add(self.coupons_list, 1, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(coupons_sizer, 1, wx.EXPAND | wx.ALL, 10)

        # Summary section
        summary_box = wx.StaticBox(self, label="Summary")
        summary_sizer = wx.StaticBoxSizer(summary_box, wx.HORIZONTAL)

        self.summary_text = wx.StaticText(self, label="No coupons available")
        summary_sizer.Add(self.summary_text, 1, wx.ALIGN_CENTER_VERTICAL | wx.ALL, 5)

        main_sizer.Add(summary_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Set main sizer
        self.SetSizer(main_sizer)

    def refresh(self) -> None:
        """Refresh the coupons display."""
        try:
            # Clear current list
            self.coupons_list.DeleteAllItems()

            # Get coupons from service
            self.coupons = self.client_service.get_coupons()

            # Apply filter
            filtered_coupons = self._apply_filter(self.coupons)

            # Populate list control
            for i, coupon in enumerate(filtered_coupons):
                # Title
                self.coupons_list.InsertItem(i, coupon.get("title", "Unknown"))

                # Discount
                discount = coupon.get("discount", "N/A")
                self.coupons_list.SetItem(i, 1, str(discount))

                # Status
                status = "Clipped" if coupon.get("clipped", False) else "Available"
                self.coupons_list.SetItem(i, 2, status)

                # Expires
                expires = coupon.get("expires", "N/A")
                if expires and expires != "N/A":
                    # Format expiration date
                    try:
                        from datetime import datetime

                        if isinstance(expires, str):
                            # Try to parse the date string
                            expires_date = datetime.fromisoformat(
                                expires.replace("Z", "+00:00")
                            )
                            expires_str = expires_date.strftime("%m/%d/%Y")
                        else:
                            expires_str = str(expires)
                    except Exception:
                        expires_str = str(expires)
                else:
                    expires_str = "N/A"

                self.coupons_list.SetItem(i, 3, expires_str)

                # Actions
                if coupon.get("clipped", False):
                    actions = "Already Clipped"
                else:
                    actions = "Click to Clip"

                self.coupons_list.SetItem(i, 4, actions)

                # Store coupon data
                self.coupons_list.SetItemData(i, i)

            # Update summary
            self._update_summary(filtered_coupons)

            # Update button states
            self._update_button_states()

        except Exception as e:
            wx.MessageBox(
                f"Error refreshing coupons: {e}", "Error", wx.OK | wx.ICON_ERROR
            )

    def _apply_filter(self, coupons: list[dict[str, Any]]) -> list[dict[str, Any]]:
        """Apply the selected filter to coupons."""
        filter_choice = self.filter_choice.GetSelection()

        if filter_choice == 0:  # All
            return coupons
        elif filter_choice == 1:  # Available
            return [c for c in coupons if not c.get("clipped", False)]
        elif filter_choice == 2:  # Clipped
            return [c for c in coupons if c.get("clipped", False)]
        elif filter_choice == 3:  # Expiring Soon
            # Show coupons expiring within 7 days
            from datetime import datetime, timedelta

            try:
                cutoff_date = datetime.now() + timedelta(days=7)
                expiring_soon = []
                for coupon in coupons:
                    expires = coupon.get("expires")
                    if expires and expires != "N/A":
                        try:
                            if isinstance(expires, str):
                                expires_date = datetime.fromisoformat(
                                    expires.replace("Z", "+00:00")
                                )
                            else:
                                expires_date = expires

                            if expires_date <= cutoff_date:
                                expiring_soon.append(coupon)
                        except (ValueError, TypeError):
                            # Skip items with invalid date formats
                            continue
                return expiring_soon
            except Exception:
                return coupons

        return coupons

    def _update_summary(self, coupons: list[dict[str, Any]]) -> None:
        """Update the summary text."""
        if not coupons:
            self.summary_text.SetLabel("No coupons available")
            return

        total = len(coupons)
        available = sum(1 for c in coupons if not c.get("clipped", False))
        clipped = sum(1 for c in coupons if c.get("clipped", False))

        summary = f"Total: {total} | Available: {available} | Clipped: {clipped}"
        self.summary_text.SetLabel(summary)

    def _update_button_states(self) -> None:
        """Update button states based on current data."""
        has_coupons = len(self.coupons) > 0

        self.refresh_btn.Enable(True)
        self.filter_choice.Enable(has_coupons)

    def _on_filter_change(self, event: wx.CommandEvent) -> None:
        """Handle filter change."""
        self.refresh()

    def _on_refresh(self, event: wx.CommandEvent) -> None:
        """Handle refresh button click."""
        self.refresh()

    def _on_coupon_activated(self, event: wx.ListEvent) -> None:
        """Handle coupon activation (double-click)."""
        item_index = event.GetIndex()
        if item_index >= 0 and item_index < len(self.coupons):
            coupon = self.coupons[item_index]
            self._show_coupon_dialog(coupon)

    def _show_coupon_dialog(self, coupon: dict[str, Any]) -> None:
        """Show dialog for coupon actions."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to manage coupons", "Error", wx.OK | wx.ICON_ERROR
            )
            return

        if coupon.get("clipped", False):
            wx.MessageBox(
                f"Coupon '{coupon.get('title', 'Unknown')}' is already clipped!",
                "Info",
                wx.OK | wx.ICON_INFORMATION,
            )
            return

        # Show coupon details and clip option
        message = f"Title: {coupon.get('title', 'Unknown')}\n"
        message += f"Description: {coupon.get('description', 'No description')}\n"
        message += f"Discount: {coupon.get('discount', 'N/A')}\n"
        message += f"Expires: {coupon.get('expires', 'N/A')}\n\n"
        message += "Would you like to clip this coupon?"

        result = wx.MessageBox(message, "Clip Coupon", wx.YES_NO | wx.ICON_QUESTION)

        if result == wx.YES:
            try:
                if self.client_service.clip_coupon(coupon["id"]):
                    wx.MessageBox(
                        "Coupon clipped successfully!",
                        "Success",
                        wx.OK | wx.ICON_INFORMATION,
                    )
                    self.refresh()
                else:
                    wx.MessageBox(
                        "Failed to clip coupon", "Error", wx.OK | wx.ICON_ERROR
                    )
            except Exception as e:
                wx.MessageBox(
                    f"Error clipping coupon: {e}", "Error", wx.OK | wx.ICON_ERROR
                )

    def _bind_events(self) -> None:
        """Bind list control events."""
        self.coupons_list.Bind(wx.EVT_LIST_ITEM_ACTIVATED, self._on_coupon_activated)
