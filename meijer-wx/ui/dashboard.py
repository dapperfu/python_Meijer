"""
Dashboard panel showing overview and quick actions.
"""

from typing import Any

import wx

from services.client import MeijerClientService
from services.settings import SettingsService


class DashboardPanel(wx.Panel):
    """
    Dashboard panel with overview and quick actions.

    Shows authentication status, shopping list summary, and provides
    quick access to common functions.
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

        # Create UI
        self._create_ui()

        # Initial refresh
        self.refresh()

    def _create_ui(self) -> None:
        """Create the dashboard UI."""
        # Main sizer
        main_sizer = wx.BoxSizer(wx.VERTICAL)

        # Status section
        status_box = wx.StaticBox(self, label="Status")
        status_sizer = wx.StaticBoxSizer(status_box, wx.VERTICAL)

        # Authentication status
        auth_sizer = wx.BoxSizer(wx.HORIZONTAL)
        auth_sizer.Add(
            wx.StaticText(self, label="Authentication:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.auth_status = wx.StaticText(self, label="Unknown")
        auth_sizer.Add(self.auth_status, 1, wx.ALIGN_CENTER_VERTICAL | wx.LEFT, 10)
        status_sizer.Add(auth_sizer, 0, wx.EXPAND | wx.ALL, 5)

        # Connection status
        conn_sizer = wx.BoxSizer(wx.HORIZONTAL)
        conn_sizer.Add(
            wx.StaticText(self, label="Connection:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.conn_status = wx.StaticText(self, label="Unknown")
        conn_sizer.Add(self.conn_status, 1, wx.ALIGN_CENTER_VERTICAL | wx.LEFT, 10)
        status_sizer.Add(conn_sizer, 0, wx.EXPAND | wx.ALL, 5)

        # Client status
        client_sizer = wx.BoxSizer(wx.HORIZONTAL)
        client_sizer.Add(
            wx.StaticText(self, label="Client:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.client_status = wx.StaticText(self, label="Unknown")
        client_sizer.Add(self.client_status, 1, wx.ALIGN_CENTER_VERTICAL | wx.LEFT, 10)
        status_sizer.Add(client_sizer, 0, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(status_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Quick actions section
        actions_box = wx.StaticBox(self, label="Quick Actions")
        actions_sizer = wx.StaticBoxSizer(actions_box, wx.VERTICAL)

        # Authentication button
        self.auth_btn = wx.Button(self, label="Login to Meijer")
        self.auth_btn.Bind(wx.EVT_BUTTON, self._on_login)
        actions_sizer.Add(self.auth_btn, 0, wx.EXPAND | wx.ALL, 5)

        # Refresh button
        self.refresh_btn = wx.Button(self, label="Refresh Status")
        self.refresh_btn.Bind(wx.EVT_BUTTON, self._on_refresh)
        actions_sizer.Add(self.refresh_btn, 0, wx.EXPAND | wx.ALL, 5)

        # Test connection button
        self.test_btn = wx.Button(self, label="Test Connection")
        self.test_btn.Bind(wx.EVT_BUTTON, self._on_test_connection)
        actions_sizer.Add(self.test_btn, 0, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(actions_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Shopping list summary section
        list_box = wx.StaticBox(self, label="Shopping List Summary")
        list_sizer = wx.StaticBoxSizer(list_box, wx.VERTICAL)

        # List count
        list_count_sizer = wx.BoxSizer(wx.HORIZONTAL)
        list_count_sizer.Add(
            wx.StaticText(self, label="Total Items:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.list_count = wx.StaticText(self, label="0")
        list_count_sizer.Add(self.list_count, 1, wx.ALIGN_CENTER_VERTICAL | wx.LEFT, 10)
        list_sizer.Add(list_count_sizer, 0, wx.EXPAND | wx.ALL, 5)

        # Completed count
        completed_count_sizer = wx.BoxSizer(wx.HORIZONTAL)
        completed_count_sizer.Add(
            wx.StaticText(self, label="Completed:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.completed_count = wx.StaticText(self, label="0")
        completed_count_sizer.Add(
            self.completed_count, 1, wx.ALIGN_CENTER_VERTICAL | wx.LEFT, 10
        )
        list_sizer.Add(completed_count_sizer, 0, wx.EXPAND | wx.ALL, 5)

        # View list button
        self.view_list_btn = wx.Button(self, label="View Shopping List")
        self.view_list_btn.Bind(wx.EVT_BUTTON, self._on_view_list)
        list_sizer.Add(self.view_list_btn, 0, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(list_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Coupons summary section
        coupons_box = wx.StaticBox(self, label="Coupons Summary")
        coupons_sizer = wx.StaticBoxSizer(coupons_box, wx.VERTICAL)

        # Available coupons count
        coupons_count_sizer = wx.BoxSizer(wx.HORIZONTAL)
        coupons_count_sizer.Add(
            wx.StaticText(self, label="Available:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.coupons_count = wx.StaticText(self, label="0")
        coupons_count_sizer.Add(
            self.coupons_count, 1, wx.ALIGN_CENTER_VERTICAL | wx.LEFT, 10
        )
        coupons_sizer.Add(coupons_count_sizer, 0, wx.EXPAND | wx.ALL, 5)

        # View coupons button
        self.view_coupons_btn = wx.Button(self, label="View Coupons")
        self.view_coupons_btn.Bind(wx.EVT_BUTTON, self._on_view_coupons)
        coupons_sizer.Add(self.view_coupons_btn, 0, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(coupons_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Stores summary section
        stores_box = wx.StaticBox(self, label="Stores Summary")
        stores_sizer = wx.StaticBoxSizer(stores_box, wx.VERTICAL)

        # Nearby stores count
        stores_count_sizer = wx.BoxSizer(wx.HORIZONTAL)
        stores_count_sizer.Add(
            wx.StaticText(self, label="Nearby:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.stores_count = wx.StaticText(self, label="0")
        stores_count_sizer.Add(
            self.stores_count, 1, wx.ALIGN_CENTER_VERTICAL | wx.LEFT, 10
        )
        stores_sizer.Add(stores_count_sizer, 0, wx.EXPAND | wx.ALL, 5)

        # View stores button
        self.view_stores_btn = wx.Button(self, label="View Stores")
        self.view_stores_btn.Bind(wx.EVT_BUTTON, self._on_view_stores)
        stores_sizer.Add(self.view_stores_btn, 0, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(stores_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Set main sizer
        self.SetSizer(main_sizer)

    def refresh(self) -> None:
        """Refresh the dashboard data."""
        try:
            # Get client status
            status = self.client_service.get_status()

            # Update status displays
            if status["client_initialized"]:
                self.client_status.SetLabel("Initialized")
                self.client_status.SetForegroundColour(wx.Colour(0, 128, 0))  # Green
            else:
                self.client_status.SetLabel("Not Initialized")
                self.client_status.SetForegroundColour(wx.Colour(255, 0, 0))  # Red

            if status["connected"]:
                self.conn_status.SetLabel("Connected")
                self.conn_status.SetForegroundColour(wx.Colour(0, 128, 0))  # Green
            else:
                self.conn_status.SetLabel("Not Connected")
                self.conn_status.SetForegroundColour(wx.Colour(255, 0, 0))  # Red

            if status["authenticated"]:
                self.auth_status.SetLabel("Authenticated")
                self.auth_status.SetForegroundColour(wx.Colour(0, 128, 0))  # Green
                self.auth_btn.SetLabel("Logout")
            else:
                self.auth_status.SetLabel("Not Authenticated")
                self.auth_status.SetForegroundColour(wx.Colour(255, 0, 0))  # Red
                self.auth_btn.SetLabel("Login to Meijer")

            # Update shopping list summary
            if status["authenticated"]:
                shopping_list = self.client_service.get_shopping_list()
                total_items = len(shopping_list)
                completed_items = sum(
                    1 for item in shopping_list if item.get("completed", False)
                )

                self.list_count.SetLabel(str(total_items))
                self.completed_count.SetLabel(str(completed_items))
            else:
                self.list_count.SetLabel("0")
                self.completed_count.SetLabel("0")

            # Update coupons summary
            if status["authenticated"]:
                coupons = self.client_service.get_coupons()
                self.coupons_count.SetLabel(str(len(coupons)))
            else:
                self.coupons_count.SetLabel("0")

            # Update stores summary
            stores = self.client_service.get_stores()
            self.stores_count.SetLabel(str(len(stores)))

        except Exception as e:
            wx.MessageBox(
                f"Error refreshing dashboard: {e}", "Error", wx.OK | wx.ICON_ERROR
            )

    def _on_login(self, event: wx.CommandEvent) -> None:
        """Handle login button click."""
        if self.client_service.is_authenticated():
            # Logout
            result = wx.MessageBox(
                "Are you sure you want to logout?",
                "Confirm Logout",
                wx.YES_NO | wx.ICON_QUESTION,
            )
            if result == wx.YES:
                if self.client_service.logout():
                    wx.MessageBox(
                        "Logged out successfully",
                        "Success",
                        wx.OK | wx.ICON_INFORMATION,
                    )
                    self.refresh()
                else:
                    wx.MessageBox("Failed to logout", "Error", wx.OK | wx.ICON_ERROR)
        else:
            # Show login dialog
            self._show_login_dialog()

    def _show_login_dialog(self) -> None:
        """Show login dialog."""
        dialog = wx.TextEntryDialog(
            self, "Enter your Meijer username/email:", "Login to Meijer"
        )

        if dialog.ShowModal() == wx.ID_OK:
            username = dialog.GetValue()
            dialog.Destroy()

            # Get password
            password_dialog = wx.TextEntryDialog(
                self,
                "Enter your Meijer password:",
                "Password",
                style=wx.TextEntryDialogStyle | wx.TE_PASSWORD,
            )

            if password_dialog.ShowModal() == wx.ID_OK:
                password = password_dialog.GetValue()
                password_dialog.Destroy()

                # Attempt authentication
                if self.client_service.authenticate(username, password):
                    wx.MessageBox(
                        "Login successful!", "Success", wx.OK | wx.ICON_INFORMATION
                    )
                    self.refresh()
                else:
                    wx.MessageBox(
                        "Login failed. Please check your credentials.",
                        "Error",
                        wx.OK | wx.ICON_ERROR,
                    )
            else:
                password_dialog.Destroy()
        else:
            dialog.Destroy()

    def _on_refresh(self, event: wx.CommandEvent) -> None:
        """Handle refresh button click."""
        self.refresh()

    def _on_test_connection(self, event: wx.CommandEvent) -> None:
        """Handle test connection button click."""
        if self.client_service.test_connection():
            wx.MessageBox(
                "Connection test successful!", "Success", wx.OK | wx.ICON_INFORMATION
            )
        else:
            wx.MessageBox("Connection test failed!", "Error", wx.OK | wx.ICON_ERROR)
        self.refresh()

    def _on_view_list(self, event: wx.CommandEvent) -> None:
        """Handle view shopping list button click."""
        # This would typically navigate to the shopping list panel
        wx.MessageBox(
            "Navigate to shopping list panel", "Info", wx.OK | wx.ICON_INFORMATION
        )

    def _on_view_coupons(self, event: wx.CommandEvent) -> None:
        """Handle view coupons button click."""
        # This would typically navigate to the coupons panel
        wx.MessageBox("Navigate to coupons panel", "Info", wx.OK | wx.ICON_INFORMATION)

    def _on_view_stores(self, event: wx.CommandEvent) -> None:
        """Handle view stores button click."""
        # This would typically navigate to the stores panel
        wx.MessageBox("Navigate to stores panel", "Info", wx.OK | wx.ICON_INFORMATION)
