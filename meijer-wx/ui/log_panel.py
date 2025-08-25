"""
Log panel for displaying application logs.
"""

from typing import Any

import wx

from services.settings import SettingsService


class LogPanel(wx.Panel):
    """Log display panel."""

    def __init__(
        self, parent: wx.Window, settings_service: SettingsService, **kwargs: Any
    ) -> None:
        super().__init__(parent, **kwargs)
        self.settings_service = settings_service
        self._create_ui()

    def _create_ui(self) -> None:
        sizer = wx.BoxSizer(wx.VERTICAL)

        # Log display
        self.log_text = wx.TextCtrl(
            self, style=wx.TE_MULTILINE | wx.TE_READONLY, size=(-1, 150)
        )
        sizer.Add(self.log_text, 1, wx.EXPAND | wx.ALL, 5)

        # Add some sample log text
        self.log_text.SetValue("Log panel initialized\nReady to display logs...")

        self.SetSizer(sizer)
