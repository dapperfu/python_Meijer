"""
Settings service for managing application configuration.
"""

import logging
from pathlib import Path
from typing import Any

import platformdirs


class SettingsService:
    """
    Service for managing application settings and configuration.

    Handles loading, saving, and accessing configuration values
    with platform-appropriate file locations.
    """

    def __init__(self) -> None:
        """Initialize the settings service."""
        self.logger = logging.getLogger(__name__)

        # Get platform-appropriate config directory
        self.config_dir = Path(platformdirs.user_config_dir("meijer-wx", "meijer"))
        self.config_file = self.config_dir / "config.toml"

        # Default settings
        self._settings: dict[str, Any] = {
            "proxy": {"host": None, "port": None},
            "backend": {"local_url": None},
            "export": {
                "default_format": "csv",
                "default_path": str(Path.home() / "Documents" / "meijer-exports"),
            },
            "logging": {"level": "INFO", "show_panel": False},
            "store": {"default_id": None},
        }

        # Load existing settings
        self._load_settings()

    def _load_settings(self) -> None:
        """Load settings from configuration file."""
        try:
            if self.config_file.exists():
                # For now, just log that we would load from TOML
                self.logger.info(f"Would load settings from {self.config_file}")
                # TODO: Implement TOML loading when toml package is available
            else:
                self.logger.info("No config file found, using defaults")
        except Exception as e:
            self.logger.warning(f"Failed to load settings: {e}")

    def save(self) -> None:
        """Save current settings to configuration file."""
        try:
            # Ensure config directory exists
            self.config_dir.mkdir(parents=True, exist_ok=True)

            # For now, just log that we would save to TOML
            self.logger.info(f"Would save settings to {self.config_file}")
            # TODO: Implement TOML saving when toml package is available
        except Exception as e:
            self.logger.error(f"Failed to save settings: {e}")

    def get(self, key: str, default: Any = None) -> Any:
        """
        Get a setting value by key.

        Args:
            key: Setting key (e.g., 'proxy.host')
            default: Default value if key not found

        Returns:
            Setting value or default
        """
        keys = key.split(".")
        value = self._settings

        try:
            for k in keys:
                value = value[k]
            return value
        except (KeyError, TypeError):
            return default

    def set(self, key: str, value: Any) -> None:
        """
        Set a setting value by key.

        Args:
            key: Setting key (e.g., 'proxy.host')
            value: Value to set
        """
        keys = key.split(".")
        target = self._settings

        # Navigate to the parent of the target key
        for k in keys[:-1]:
            if k not in target:
                target[k] = {}
            target = target[k]

        # Set the final value
        target[keys[-1]] = value
        self.logger.debug(f"Set {key} = {value}")

    def get_proxy(self) -> str | None:
        """Get proxy configuration as host:port string."""
        host = self.get("proxy.host")
        port = self.get("proxy.port")

        if host and port:
            return f"{host}:{port}"
        return None

    def set_proxy(self, host: str, port: int) -> None:
        """Set proxy configuration."""
        self.set("proxy.host", host)
        self.set("proxy.port", port)

    def get_local_backend(self) -> str | None:
        """Get local backend URL."""
        return self.get("backend.local_url")

    def set_local_backend(self, url: str) -> None:
        """Set local backend URL."""
        self.set("backend.local_url", url)

    def get_export_defaults(self) -> dict[str, str]:
        """Get export default settings."""
        return {
            "format": self.get("export.default_format", "csv"),
            "path": self.get("export.default_path", ""),
        }

    def get_logging_level(self) -> str:
        """Get logging level."""
        return self.get("logging.level", "INFO")

    def should_show_log_panel(self) -> bool:
        """Check if log panel should be shown by default."""
        return self.get("logging.show_panel", False)
