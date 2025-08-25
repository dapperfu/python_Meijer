"""
Settings dialog for managing application settings.
"""

from typing import Any

import wx

from services.settings import SettingsService


class SettingsDialog(wx.Dialog):
    """Settings configuration dialog."""

    def __init__(
        self, parent: wx.Window, settings_service: SettingsService, **kwargs: Any
    ) -> None:
        super().__init__(parent, title="Settings", size=(500, 400), **kwargs)
        self.settings_service = settings_service
        self._create_ui()

    def _create_ui(self) -> None:
        sizer = wx.BoxSizer(wx.VERTICAL)
        label = wx.StaticText(self, label="Settings Configuration")
        sizer.Add(label, 0, wx.ALL, 20)

        # Add close button
        close_btn = wx.Button(self, wx.ID_CLOSE, "Close")
        close_btn.Bind(wx.EVT_BUTTON, lambda evt: self.Close())
        sizer.Add(close_btn, 0, wx.ALL | wx.ALIGN_CENTER, 20)

        self.SetSizer(sizer)
