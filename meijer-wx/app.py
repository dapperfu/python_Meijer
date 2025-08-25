#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create wxPython GUI application for python_Meijer v2 with full CLI parity
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: wxPython, meijer package, platformdirs
 */

Main wxPython application for Meijer GUI.
"""

import logging
import sys
from pathlib import Path

import platformdirs
import wx

from services.client import MeijerClientService
from services.settings import SettingsService
from ui.main_frame import MainFrame


class MeijerApp(wx.App):
    """
    Main wxPython application class for Meijer GUI.

    Handles application initialization, configuration loading, and main frame creation.
    """

    def __init__(self, *args, **kwargs) -> None:
        """Initialize the Meijer application."""
        super().__init__(*args, **kwargs)
        self.settings_service: SettingsService | None = None
        self.client_service: MeijerClientService | None = None
        self.main_frame: MainFrame | None = None

    def OnInit(self) -> bool:
        """
        Initialize the application on startup.

        Returns:
            bool: True if initialization successful, False otherwise
        """
        try:
            # Set up logging
            self._setup_logging()

            # Initialize services
            self._initialize_services()

            # Create and show main frame
            self.main_frame = MainFrame(
                title="Meijer Shopping List Manager",
                size=(1200, 800),
                settings_service=self.settings_service,
                client_service=self.client_service,
            )

            self.main_frame.Show()
            self.SetTopWindow(self.main_frame)

            # Log successful startup
            logging.info("Meijer GUI application started successfully")

            return True

        except Exception as e:
            logging.error(f"Failed to initialize application: {e}")
            wx.MessageBox(
                f"Failed to start application: {e}",
                "Startup Error",
                wx.OK | wx.ICON_ERROR,
            )
            return False

    def _setup_logging(self) -> None:
        """Set up logging configuration."""
        # Create logs directory
        log_dir = Path(platformdirs.user_log_dir("meijer-wx", "meijer"))
        log_dir.mkdir(parents=True, exist_ok=True)

        # Configure logging
        logging.basicConfig(
            level=logging.INFO,
            format="%(asctime)s - %(name)s - %(levelname)s - %(message)s",
            handlers=[
                logging.FileHandler(log_dir / "meijer-wx.log"),
                logging.StreamHandler(sys.stdout),
            ],
        )

        # Set specific logger levels
        logging.getLogger("urllib3").setLevel(logging.WARNING)
        logging.getLogger("requests").setLevel(logging.WARNING)

        logging.info("Logging initialized")

    def _initialize_services(self) -> None:
        """Initialize application services."""
        # Initialize settings service
        self.settings_service = SettingsService()

        # Initialize client service with settings
        self.client_service = MeijerClientService(self.settings_service)

        logging.info("Services initialized")


def main() -> None:
    """Main entry point for the application."""
    app = MeijerApp()
    app.MainLoop()


if __name__ == "__main__":
    main()
