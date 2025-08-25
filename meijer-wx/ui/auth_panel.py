"""
Authentication panel for managing authentication.
"""

from typing import Any

import wx

from services.client import MeijerClientService
from services.settings import SettingsService


class AuthPanel(wx.Panel):
    """Authentication management panel."""

    def __init__(
        self,
        parent: wx.Window,
        settings_service: SettingsService,
        client_service: MeijerClientService,
        **kwargs: Any,
    ) -> None:
        super().__init__(parent, **kwargs)
        self.settings_service = settings_service
        self.client_service = client_service
        self._create_ui()

    def _create_ui(self) -> None:
        sizer = wx.BoxSizer(wx.VERTICAL)
        label = wx.StaticText(self, label="Authentication Management")
        sizer.Add(label, 0, wx.ALL, 20)
        self.SetSizer(sizer)

    def refresh(self) -> None:
        """Refresh the panel."""
        pass
