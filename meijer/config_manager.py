"""
Configuration and SSL management for Meijer API client.

This module provides centralized management of API configuration, SSL settings,
endpoint URLs, and proxy configuration.
"""

import logging
import os
from pathlib import Path
from typing import Any, Dict, Optional


class ConfigManager:
    """
    Manages configuration, SSL settings, and endpoint URLs for the Meijer API client.

    This class provides:
    - API endpoint configuration
    - SSL certificate management
    - Proxy configuration
    - Environment variable handling
    """

    def __init__(self, base_url: Optional[str] = None):
        """
        Initialize the configuration manager.

        Args:
            base_url: Custom base URL for API endpoints (for local development/testing)
        """
        self.logger = logging.getLogger(__name__)

        # API configuration based on APK analysis
        self.api_base_url = "https://api.meijer.com"
        self.subscription_key = (
            "a10bc58ac484478d9b3958b1742c3a03"  # From APK analysis (fallback)
        )

        # Handle base URL override for local development/testing
        if base_url:
            self.logger.info(f"Using custom base URL: {base_url}")
            self._setup_local_endpoints(base_url)
        else:
            self._setup_default_endpoints()

        # SSL configuration
        self.ssl_verify = True
        self.ssl_cert_path = self._detect_mitmproxy_cert()

        # Auto-configure SSL with mitmproxy certificate if available
        if self.ssl_cert_path:
            self.logger.info(
                f"🔒 Auto-configuring SSL with mitmproxy certificate: {self.ssl_cert_path}"
            )
            # When using mitmproxy, we need to disable SSL verification
            # because mitmproxy intercepts and re-signs all HTTPS traffic
            self.ssl_verify = False
            self.logger.info("🔒 SSL verification disabled for mitmproxy compatibility")
        else:
            self.logger.warning("⚠️ Mitmproxy certificate not found in common locations")
            self.logger.info("💡 Expected locations:")
            for path in self._get_possible_cert_paths():
                self.logger.info(f"   - {path}")
            self.ssl_verify = True  # Fall back to system certificates

        # Proxy configuration - only set when explicitly configured by user
        self.proxy_host = None
        self.proxy_port = None

    def _setup_default_endpoints(self) -> None:
        """Set up default API endpoints."""
        self.endpoints = {
            "orders": f"{self.api_base_url}/digital/occ/v3/orders",
            "stores": f"{self.api_base_url}/digital/occ/v3/stores",
            "products": f"{self.api_base_url}/digital/occ/v3/products",
            "coupons": f"{self.api_base_url}/digital/occ/v3/coupons",
            "shopping_list": f"{self.api_base_url}/digital/occ/v3/shopping-list",
            "mperks": f"{self.api_base_url}/digital/occ/v3/mperks",
            "feedback": f"{self.api_base_url}/digital/occ/v3/feedback",
            "settings": f"{self.api_base_url}/digital/occ/v3/settings",
        }

    def _setup_local_endpoints(self, base_url: str) -> None:
        """
        Set up local development endpoints.

        Args:
            base_url: Base URL for local development server
        """
        self.api_base_url = base_url.rstrip("/")
        self.logger.info(f"🔧 Local development mode: {self.api_base_url}")

        self.endpoints = {
            "orders": f"{self.api_base_url}/digital/occ/v3/orders",
            "stores": f"{self.api_base_url}/digital/occ/v3/stores",
            "products": f"{self.api_base_url}/digital/occ/v3/products",
            "coupons": f"{self.api_base_url}/digital/occ/v3/coupons",
            "shopping_list": f"{self.api_base_url}/digital/occ/v3/shopping-list",
            "mperks": f"{self.api_base_url}/digital/occ/v3/mperks",
            "feedback": f"{self.api_base_url}/digital/occ/v3/feedback",
            "settings": f"{self.api_base_url}/digital/occ/v3/settings",
        }

    def _get_possible_cert_paths(self) -> list:
        """Get list of possible mitmproxy certificate paths."""
        return [
            Path().home() / ".mitmproxy" / "mitmproxy-ca-cert.pem",
            Path().home() / ".mitmproxy" / "mitmproxy-ca.pem",
        ]

    def _detect_mitmproxy_cert(self) -> Optional[str]:
        """
        Auto-detect mitmproxy certificate path.

        Returns:
            Path to mitmproxy certificate if found, None otherwise
        """
        possible_cert_paths = self._get_possible_cert_paths()

        # Check for custom certificate path from environment variable
        custom_cert_path = os.environ.get("MEIJER_MITMPROXY_CERT")
        if custom_cert_path:
            possible_cert_paths.insert(0, Path(custom_cert_path))
            self.logger.info(
                f"🔒 Using custom mitmproxy certificate path from environment: {custom_cert_path}"
            )

        for cert_path in possible_cert_paths:
            if cert_path.exists():
                return str(cert_path)

        return None

    def configure_ssl(
        self, verify: bool = True, cert_path: Optional[str] = None
    ) -> None:
        """
        Configure SSL settings.

        Args:
            verify: Whether to verify SSL certificates
            cert_path: Path to custom SSL certificate
        """
        if cert_path:
            self.ssl_cert_path = cert_path
            self.logger.info(f"🔒 Using custom SSL certificate: {cert_path}")

        self.ssl_verify = verify
        if verify:
            self.logger.info("🔒 SSL verification enabled")
        else:
            self.logger.warning("⚠️ SSL verification disabled - use with caution")

    def configure_proxy(self, proxy_host: str, proxy_port: int = 8080) -> None:
        """
        Configure proxy settings.

        Args:
            proxy_host: Proxy hostname or IP address
            proxy_port: Proxy port number
        """
        self.proxy_host = proxy_host
        self.proxy_port = proxy_port
        self.logger.info(f"🌐 Proxy configured: {proxy_host}:{proxy_port}")

    def get_api_url(self, endpoint: str) -> str:
        """
        Get full API URL for an endpoint.

        Args:
            endpoint: Endpoint name (e.g., 'stores', 'products')

        Returns:
            Full API URL

        Raises:
            ValueError: If endpoint is not configured
        """
        if endpoint not in self.endpoints:
            raise ValueError(
                f"Unknown endpoint: {endpoint}. Available: {list(self.endpoints.keys())}"
            )

        return self.endpoints[endpoint]

    def get_proxy_dict(self) -> Optional[Dict[str, str]]:
        """
        Get proxy configuration dictionary for requests.

        Returns:
            Proxy configuration dict or None if not configured
        """
        if self.proxy_host and self.proxy_port:
            return {
                "http": f"http://{self.proxy_host}:{self.proxy_port}",
                "https": f"http://{self.proxy_host}:{self.proxy_port}",
            }
        return None

    def is_local_development(self) -> bool:
        """
        Check if running in local development mode.

        Returns:
            True if using local development endpoints
        """
        return self.api_base_url != "https://api.meijer.com"

    def get_config_summary(self) -> Dict[str, Any]:
        """
        Get a summary of current configuration.

        Returns:
            Dictionary with configuration summary
        """
        return {
            "api_base_url": self.api_base_url,
            "ssl_verify": self.ssl_verify,
            "ssl_cert_path": self.ssl_cert_path,
            "proxy_host": self.proxy_host,
            "proxy_port": self.proxy_port,
            "is_local_development": self.is_local_development(),
            "endpoints": list(self.endpoints.keys()),
        }
