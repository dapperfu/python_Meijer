"""
Main application frame with navigation and panel management.
"""

from typing import Any

import wx
import wx.adv

from services.client import MeijerClientService
from services.settings import SettingsService
from ui.ads_panel import AdsPanel
from ui.auth_panel import AuthPanel
from ui.cart_panel import CartPanel
from ui.coupons_panel import CouponsPanel
from ui.dashboard import DashboardPanel
from ui.email2fa_panel import Email2FAPanel
from ui.list_panel import ListPanel
from ui.log_panel import LogPanel
from ui.price_watch_panel import PriceWatchPanel
from ui.settings_dialog import SettingsDialog
from ui.stores_panel import StoresPanel


class MainFrame(wx.Frame):
    """
    Main application frame with navigation tree and panel swapping.

    Provides a left navigation tree and a main panel area that dynamically
    swaps between different functional panels based on user selection.
    """

    def __init__(
        self,
        title: str,
        size: tuple[int, int],
        settings_service: SettingsService,
        client_service: MeijerClientService,
        **kwargs: Any,
    ) -> None:
        """
        Initialize the main frame.

        Args:
            title: Window title
            size: Window size (width, height)
            settings_service: Application settings service
            client_service: Meijer client service
            **kwargs: Additional wx.Frame arguments
        """
        super().__init__(None, title=title, size=size, **kwargs)

        self.settings_service = settings_service
        self.client_service = client_service

        # Panel registry
        self.panels: dict[str, wx.Panel] = {}
        self.current_panel: wx.Panel | None = None

        # Initialize UI
        self._create_ui()
        self._create_menu()
        self._create_status_bar()

        # Bind events
        self._bind_events()

        # Show dashboard by default
        self._show_panel("dashboard")

        # Center on screen
        self.Center()

    def _create_ui(self) -> None:
        """Create the main UI layout."""
        # Create main panel
        main_panel = wx.Panel(self)

        # Create main sizer
        main_sizer = wx.BoxSizer(wx.HORIZONTAL)

        # Create navigation tree
        self._create_navigation_tree(main_panel)

        # Create main panel area
        self._create_main_panel_area(main_panel)

        # Add to main sizer
        main_sizer.Add(self.nav_tree, 0, wx.EXPAND | wx.ALL, 5)
        main_sizer.Add(self.main_notebook, 1, wx.EXPAND | wx.ALL, 5)

        main_panel.SetSizer(main_sizer)

        # Create log panel at bottom
        self._create_log_panel()

        # Create bottom sizer for main panel
        bottom_sizer = wx.BoxSizer(wx.VERTICAL)
        bottom_sizer.Add(main_panel, 1, wx.EXPAND)
        bottom_sizer.Add(self.log_panel, 0, wx.EXPAND)

        # Set main sizer
        self.SetSizer(bottom_sizer)

    def _create_navigation_tree(self, parent: wx.Panel) -> None:
        """Create the left navigation tree control."""
        # Create tree control
        self.nav_tree = wx.TreeCtrl(
            parent, style=wx.TR_DEFAULT_STYLE | wx.TR_HIDE_ROOT | wx.TR_SINGLE
        )

        # Create root item
        root = self.nav_tree.AddRoot("Meijer")

        # Add navigation items
        dashboard_item = self.nav_tree.AppendItem(root, "📊 Dashboard")
        list_item = self.nav_tree.AppendItem(root, "🛒 Shopping List")
        coupons_item = self.nav_tree.AppendItem(root, "🎫 Coupons")
        stores_item = self.nav_tree.AppendItem(root, "🏪 Stores")
        cart_item = self.nav_tree.AppendItem(root, "🛍️ Cart")
        price_watch_item = self.nav_tree.AppendItem(root, "👀 Price Watch")
        ads_item = self.nav_tree.AppendItem(root, "📰 Weekly Ads")
        auth_item = self.nav_tree.AppendItem(root, "🔐 Authentication")
        email2fa_item = self.nav_tree.AppendItem(root, "📧 Email 2FA")
        settings_item = self.nav_tree.AppendItem(root, "⚙️ Settings")

        # Store item references for easy lookup
        self.nav_items = {
            "dashboard": dashboard_item,
            "list": list_item,
            "coupons": coupons_item,
            "stores": stores_item,
            "cart": cart_item,
            "price_watch": price_watch_item,
            "ads": ads_item,
            "auth": auth_item,
            "email2fa": email2fa_item,
            "settings": settings_item,
        }

        # Expand all items (but not the hidden root)
        for item in self.nav_items.values():
            self.nav_tree.Expand(item)

        # Set tree size
        self.nav_tree.SetMinSize((250, -1))

    def _create_main_panel_area(self, parent: wx.Panel) -> None:
        """Create the main panel area with notebook for panel swapping."""
        self.main_notebook = wx.Notebook(parent)

        # Create all panels
        self._create_panels()

        # Set notebook size
        self.main_notebook.SetMinSize((800, -1))

    def _create_panels(self) -> None:
        """Create all functional panels."""
        # Dashboard panel
        self.panels["dashboard"] = DashboardPanel(
            self.main_notebook, self.settings_service, self.client_service
        )
        self.main_notebook.AddPage(self.panels["dashboard"], "Dashboard")

        # Shopping list panel
        self.panels["list"] = ListPanel(
            self.main_notebook, self.settings_service, self.client_service
        )
        self.main_notebook.AddPage(self.panels["list"], "Shopping List")

        # Coupons panel
        self.panels["coupons"] = CouponsPanel(
            self.main_notebook, self.settings_service, self.client_service
        )
        self.main_notebook.AddPage(self.panels["coupons"], "Coupons")

        # Stores panel
        self.panels["stores"] = StoresPanel(
            self.main_notebook, self.settings_service, self.client_service
        )
        self.main_notebook.AddPage(self.panels["stores"], "Stores")

        # Cart panel
        self.panels["cart"] = CartPanel(
            self.main_notebook, self.settings_service, self.client_service
        )
        self.main_notebook.AddPage(self.panels["cart"], "Cart")

        # Price watch panel
        self.panels["price_watch"] = PriceWatchPanel(
            self.main_notebook, self.settings_service, self.client_service
        )
        self.main_notebook.AddPage(self.panels["price_watch"], "Price Watch")

        # Ads panel
        self.panels["ads"] = AdsPanel(
            self.main_notebook, self.settings_service, self.client_service
        )
        self.main_notebook.AddPage(self.panels["ads"], "Weekly Ads")

        # Authentication panel
        self.panels["auth"] = AuthPanel(
            self.main_notebook, self.settings_service, self.client_service
        )
        self.main_notebook.AddPage(self.panels["auth"], "Authentication")

        # Email 2FA panel
        self.panels["email2fa"] = Email2FAPanel(
            self.main_notebook, self.settings_service, self.client_service
        )
        self.main_notebook.AddPage(self.panels["email2fa"], "Email 2FA")

        # Don't add pages initially - they'll be added when selected

    def _create_log_panel(self) -> None:
        """Create the collapsible log panel at the bottom."""
        self.log_panel = LogPanel(self, self.settings_service)
        self.log_panel.Hide()  # Hidden by default

    def _create_menu(self) -> None:
        """Create the application menu bar."""
        menubar = wx.MenuBar()

        # File menu
        file_menu = wx.Menu()
        file_menu.Append(wx.ID_EXIT, "E&xit\tCtrl+Q", "Exit the application")
        menubar.Append(file_menu, "&File")

        # View menu
        view_menu = wx.Menu()
        self.log_menu_item = view_menu.Append(
            wx.ID_ANY,
            "Show &Log Panel",
            "Toggle log panel visibility",
            kind=wx.ITEM_CHECK,
        )
        menubar.Append(view_menu, "&View")

        # Tools menu
        tools_menu = wx.Menu()
        tools_menu.Append(wx.ID_ANY, "&Settings", "Open settings dialog")
        tools_menu.Append(wx.ID_ANY, "&Refresh All", "Refresh all data")
        menubar.Append(tools_menu, "&Tools")

        # Help menu
        help_menu = wx.Menu()
        help_menu.Append(wx.ID_ABOUT, "&About", "About this application")
        menubar.Append(help_menu, "&Help")

        self.SetMenuBar(menubar)

    def _create_status_bar(self) -> None:
        """Create the status bar."""
        self.CreateStatusBar()
        self.SetStatusText("Ready")

    def _bind_events(self) -> None:
        """Bind UI events."""
        # Navigation tree selection
        self.nav_tree.Bind(wx.EVT_TREE_SEL_CHANGED, self._on_nav_selection)

        # Menu events
        self.Bind(wx.EVT_MENU, self._on_exit, id=wx.ID_EXIT)
        self.Bind(wx.EVT_MENU, self._on_about, id=wx.ID_ABOUT)
        self.Bind(wx.EVT_MENU, self._on_settings, id=wx.ID_ANY)
        self.Bind(wx.EVT_MENU, self._on_refresh_all, id=wx.ID_ANY)
        self.Bind(wx.EVT_MENU, self._on_toggle_log, id=wx.ID_ANY)

        # Window close event
        self.Bind(wx.EVT_CLOSE, self._on_close)

    def _on_nav_selection(self, event: wx.TreeEvent) -> None:
        """Handle navigation tree selection."""
        item = event.GetItem()
        if not item.IsOk():
            return

        # Find which panel was selected
        for panel_name, nav_item in self.nav_items.items():
            if nav_item == item:
                self._show_panel(panel_name)
                break

        event.Skip()

    def _show_panel(self, panel_name: str) -> None:
        """Show the specified panel and hide others."""
        if panel_name not in self.panels:
            return

        # Remove all existing pages
        while self.main_notebook.GetPageCount() > 0:
            self.main_notebook.RemovePage(0)

        # Add and show selected panel
        panel = self.panels[panel_name]
        self.main_notebook.AddPage(panel, panel_name.replace("_", " ").title())
        self.current_panel = panel

        # Update status
        self.SetStatusText(f"Showing {panel_name.replace('_', ' ').title()}")

        # Refresh panel if it has a refresh method
        if hasattr(panel, "refresh"):
            panel.refresh()

    def _on_exit(self, event: wx.CommandEvent) -> None:
        """Handle exit menu selection."""
        self.Close()

    def _on_about(self, event: wx.CommandEvent) -> None:
        """Handle about menu selection."""
        info = wx.adv.AboutDialogInfo()
        info.SetName("Meijer Shopping List Manager")
        info.SetVersion("1.0.0")
        info.SetDescription("A wxPython GUI for managing Meijer shopping lists")
        info.SetCopyright("(C) 2024")
        info.SetWebSite("https://github.com/dapperfu/python_Meijer")

        wx.adv.AboutBox(info)

    def _on_settings(self, event: wx.CommandEvent) -> None:
        """Handle settings menu selection."""
        dialog = SettingsDialog(self, self.settings_service)
        dialog.ShowModal()
        dialog.Destroy()

    def _on_refresh_all(self, event: wx.CommandEvent) -> None:
        """Handle refresh all menu selection."""
        # Refresh current panel
        if self.current_panel and hasattr(self.current_panel, "refresh"):
            self.current_panel.refresh()

        self.SetStatusText("All data refreshed")

    def _on_toggle_log(self, event: wx.CommandEvent) -> None:
        """Handle log panel toggle menu selection."""
        if self.log_panel.IsShown():
            self.log_panel.Hide()
            self.log_menu_item.Check(False)
        else:
            self.log_panel.Show()
            self.log_menu_item.Check(True)

        self.Layout()

    def _on_close(self, event: wx.CloseEvent) -> None:
        """Handle window close event."""
        # Save settings
        if self.settings_service:
            self.settings_service.save()

        # Destroy the frame
        self.Destroy()
