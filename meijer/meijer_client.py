"""
Core Meijer API client.

This module provides the core client class for interacting with Meijer's APIs,
with focused responsibilities for HTTP operations and authentication.
"""

import json
import logging
import os
from datetime import datetime
from pathlib import Path
from typing import Any, Dict, Optional

import requests
from requests.adapters import HTTPAdapter
from urllib3.util.retry import Retry

from .auth import MeijerAuth, TokenStorage
from .config_manager import ConfigManager
from .exceptions import MeijerAPIError, MeijerAuthenticationError
from .models import AuthTokens
from .rate_limit_manager import RateLimitManager


class MeijerClient:
    """
    Core client for Meijer API interactions.

    This class provides core functionality including:
    - HTTP session management with retries and connection pooling
    - Authentication and token management
    - Basic request/response handling
    - Configuration management
    """

    def __init__(self, auth: Optional[str] = None, base_url: Optional[str] = None):
        """
        Initialize Meijer client.

        Args:
            auth: Authentication method - can be:
                - Path to auth.json file with bearer token or credentials
                - Path to mitmproxy log file
                - None to auto-detect from ~/.config/meijer/auth.json
            base_url: Base URL for API endpoints. If provided, will redirect all API calls
                     to this URL instead of the default Meijer domains.
                     Example: "http://127.0.0.1:5000" for local Flask server
        """
        self.logger = logging.getLogger(__name__)

        # Initialize configuration manager
        self.config = ConfigManager(base_url)

        # Initialize rate limit manager
        self.rate_limit = RateLimitManager()

        # Initialize requests session for HTTP requests
        self.session = self._setup_session()

        # Initialize token storage with client reference
        self.token_storage = TokenStorage(client=self)

        # Initialize authentication with client reference
        self.auth = MeijerAuth(self.token_storage, client=self)

        # Load authentication
        self._load_auth(auth)

        # Update mPerks client with authentication token
        self._update_mperks_auth()

    def _setup_session(self) -> requests.Session:
        """
        Set up HTTP session with proper configuration.

        Returns:
            Configured requests session
        """
        session = requests.Session()

        # Configure connection pooling and retries for efficiency
        adapter = HTTPAdapter(
            pool_connections=10,  # Number of connection pools to cache
            pool_maxsize=20,  # Maximum number of connections per pool
            max_retries=Retry(
                total=3,  # Total retries
                backoff_factor=0.5,  # Exponential backoff: 0.5s, 1s, 2s
                status_forcelist=[
                    429,
                    500,
                    502,
                    503,
                    504,
                ],  # Retry on rate limits and server errors
                allowed_methods=[
                    "GET",
                    "POST",
                    "PUT",
                    "DELETE",
                ],  # Allow retries on all methods
            ),
        )
        session.mount("http://", adapter)
        session.mount("https://", adapter)

        # Set reasonable timeouts to avoid hanging connections
        session.timeout = (5, 30)  # (connect_timeout, read_timeout)

        # Enable keep-alive for connection reuse
        session.headers.update(
            {"Connection": "keep-alive", "Keep-Alive": "timeout=30, max=100"}
        )

        return session

    def _load_auth(self, auth: Optional[str] = None) -> None:
        """
        Load authentication from various sources.

        Args:
            auth: Authentication source specification
        """
        if auth:
            if auth.endswith(".log"):
                self._load_auth_from_log(auth)
            else:
                self._load_auth_from_file(auth)
        else:
            self._load_auth_from_config()

    def _load_auth_from_file(self, auth_file: str) -> None:
        """
        Load authentication from JSON file.

        Args:
            auth_file: Path to authentication file
        """
        try:
            if not os.path.exists(auth_file):
                self.logger.warning(f"Auth file not found: {auth_file}")
                return

            with open(auth_file, "r") as f:
                auth_data = json.load(f)

            if "bearer_token" in auth_data:
                self.token_storage.store_tokens(
                    AuthTokens(
                        access_token=auth_data["bearer_token"],
                        refresh_token=auth_data.get("refresh_token"),
                        expires_at=auth_data.get("expires_at"),
                    )
                )
                self.logger.info("Loaded authentication from bearer token")
            elif "username" in auth_data and "password" in auth_data:
                self.auth.login(auth_data["username"], auth_data["password"])
            else:
                self.logger.warning("Invalid auth file format")

        except Exception as e:
            self.logger.error(f"Error loading auth from file: {e}")

    def _load_auth_from_log(self, log_file: str) -> None:
        """
        Load authentication from mitmproxy log file.

        Args:
            log_file: Path to mitmproxy log file
        """
        try:
            # This would need to be implemented based on log format
            self.logger.warning("Log-based authentication not implemented")
        except Exception as e:
            self.logger.error(f"Error loading auth from log: {e}")

    def _update_mperks_auth(self) -> None:
        """Update mPerks client with authentication token."""
        try:
            # This would need to be implemented when mPerks client is available
            pass
        except Exception as e:
            self.logger.debug(f"Could not update mPerks auth: {e}")

    def _load_auth_from_config(self) -> None:
        """Load authentication from default config location."""
        try:
            config_path = Path().home() / ".config" / "meijer" / "auth.json"
            if config_path.exists():
                self._load_auth_from_file(str(config_path))
            else:
                self.logger.info("No default auth config found")
        except Exception as e:
            self.logger.error(f"Error loading auth from config: {e}")

    def _ensure_authenticated(self) -> bool:
        """
        Ensure the client is authenticated.

        Returns:
            True if authenticated, False otherwise
        """
        try:
            if not self.auth.is_authenticated():
                self.logger.info("Not authenticated, attempting to refresh tokens")
                if not self.auth.refresh_tokens():
                    self.logger.warning("Failed to refresh authentication")
                    return False

            return self.auth.is_authenticated()

        except Exception as e:
            self.logger.error(f"Error ensuring authentication: {e}")
            return False

    def _get_api_headers(self) -> Dict[str, str]:
        """
        Get API headers for requests.

        Returns:
            Dictionary of headers
        """
        headers = {
            "User-Agent": "Meijer-API-Client/1.0",
            "Accept": "application/json",
            "Content-Type": "application/json",
        }

        # Add subscription key if available
        if hasattr(self.config, "subscription_key"):
            headers["Ocp-Apim-Subscription-Key"] = self.config.subscription_key

        # Add authorization header if authenticated
        if self.auth.is_authenticated():
            token = self.auth.get_access_token()
            if token:
                headers["Authorization"] = f"Bearer {token}"

        return headers

    def token_expires_at(self) -> Optional[datetime]:
        """
        Get when the current token expires.

        Returns:
            Expiration datetime or None if no token
        """
        return self.auth.token_expires_at()

    def _make_request(
        self,
        method: str,
        url: str,
        params: Optional[Dict] = None,
        json_data: Optional[Dict] = None,
        headers: Optional[Dict] = None,
        **kwargs,
    ) -> Optional[requests.Response]:
        """
        Make an HTTP request with proper error handling and rate limiting.

        Args:
            method: HTTP method (GET, POST, etc.)
            url: Request URL
            params: Query parameters
            json_data: JSON payload
            headers: Additional headers
            **kwargs: Additional request arguments

        Returns:
            Response object or None if request failed
        """
        try:
            # Rate limiting
            self.rate_limit.rate_limit(url)

            # Check cache for GET requests
            cache_key = None
            if method.upper() == "GET":
                cache_key = self.rate_limit.get_cache_key(method, url, params)
                cached_response = self.rate_limit.check_cache(cache_key)
                if cached_response:
                    return self._create_mock_response(cached_response)

            # Check for duplicate requests
            if cache_key and self.rate_limit.deduplicate_request(cache_key):
                self.logger.warning(f"Duplicate request detected: {method} {url}")
                return None

            # Prepare request
            request_headers = self._get_api_headers()
            if headers:
                request_headers.update(headers)

            # Configure SSL and proxy
            request_kwargs = {
                "verify": self.config.ssl_verify,
                "proxies": self.config.get_proxy_dict(),
            }
            request_kwargs.update(kwargs)

            # Make request
            response = self.session.request(
                method=method,
                url=url,
                params=params,
                json=json_data,
                headers=request_headers,
                **request_kwargs,
            )

            # Handle response
            if response.status_code == 401:
                self.logger.warning("Authentication failed, attempting refresh")
                if self.auth.refresh_tokens():
                    # Retry request with new token
                    request_headers = self._get_api_headers()
                    response = self.session.request(
                        method=method,
                        url=url,
                        params=params,
                        json=json_data,
                        headers=request_headers,
                        **request_kwargs,
                    )
                else:
                    raise MeijerAuthenticationError("Failed to refresh authentication")

            # Cache successful GET responses
            if cache_key and method.upper() == "GET" and response.status_code == 200:
                try:
                    response_data = response.json()
                    self.rate_limit.cache_response(cache_key, response_data)
                except Exception as e:
                    self.logger.debug(f"Could not cache response: {e}")

            # Mark request as complete
            if cache_key:
                self.rate_limit.mark_request_complete(cache_key)

            return response

        except Exception as e:
            self.logger.error(f"Request failed: {e}")
            if cache_key:
                self.rate_limit.mark_request_complete(cache_key)
            raise MeijerAPIError(f"Request failed: {e}")

    def _create_mock_response(self, data: Dict) -> requests.Response:
        """
        Create a mock response object for cached data.

        Args:
            data: Cached response data

        Returns:
            Mock response object
        """

        # This is a simplified mock - in practice you might want a more sophisticated approach
        class MockResponse:
            def __init__(self, data):
                self.data = data
                self.status_code = 200
                self._json = data

            def json(self):
                return self._json

        return MockResponse(data)

    def save_tokens(self) -> None:
        """Save current authentication tokens."""
        try:
            self.token_storage.save_tokens()
            self.logger.info("Authentication tokens saved")
        except Exception as e:
            self.logger.error(f"Failed to save tokens: {e}")

    def is_authenticated(self) -> bool:
        """
        Check if the client is authenticated.

        Returns:
            True if authenticated, False otherwise
        """
        return self.auth.is_authenticated()

    def auth_status(self) -> Dict[str, Any]:
        """
        Get authentication status information.

        Returns:
            Dictionary with authentication status
        """
        return {
            "authenticated": self.auth.is_authenticated(),
            "token_expires_at": self.auth.token_expires_at(),
            "user_id": self.auth.get_user_id()
            if self.auth.is_authenticated()
            else None,
        }

    def user_id(self) -> Optional[str]:
        """
        Get the current user ID.

        Returns:
            User ID if authenticated, None otherwise
        """
        if self.auth.is_authenticated():
            return self.auth.get_user_id()
        return None

    def home_store_id(self) -> Optional[str]:
        """
        Get the user's home store ID.

        Returns:
            Home store ID if available, None otherwise
        """
        if self.auth.is_authenticated():
            return self.auth.get_home_store_id()
        return None

    def get_account_id(self) -> Optional[int]:
        """
        Get the account ID for the authenticated user.

        Returns:
            Account ID if available, None otherwise
        """
        if self.auth.is_authenticated():
            return self.auth.get_account_id()
        return None

    def clear_cache(self) -> None:
        """Clear the request cache."""
        self.rate_limit.clear_cache()

    def configure_rate_limiting(self, min_interval: float = 0.5) -> None:
        """
        Configure rate limiting parameters.

        Args:
            min_interval: Minimum seconds between requests to same endpoint
        """
        self.rate_limit.configure_rate_limiting(min_interval)

    def get_cache_stats(self) -> Dict[str, Any]:
        """
        Get cache statistics.

        Returns:
            Dictionary with cache statistics
        """
        return self.rate_limit.get_cache_stats()

    def configure_ssl(
        self, verify: bool = True, cert_path: Optional[str] = None
    ) -> None:
        """
        Configure SSL settings.

        Args:
            verify: Whether to verify SSL certificates
            cert_path: Path to custom SSL certificate
        """
        self.config.configure_ssl(verify, cert_path)

    def configure_proxy(self, proxy_host: str, proxy_port: int = 8080) -> None:
        """
        Configure proxy settings.

        Args:
            proxy_host: Proxy hostname or IP address
            proxy_port: Proxy port number
        """
        self.config.configure_proxy(proxy_host, proxy_port)

    def get_config_summary(self) -> Dict[str, Any]:
        """
        Get a summary of current configuration.

        Returns:
            Dictionary with configuration summary
        """
        return self.config.get_config_summary()
