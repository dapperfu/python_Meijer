"""
Main Meijer API client.

This module provides the main client class for interacting with Meijer's APIs,
based on actual endpoint analysis from the decompiled APK and network logs.
"""

import json
import logging
import os
import urllib3
from datetime import datetime, timedelta
from pathlib import Path
from typing import Any, Dict, List, Optional, Union

# Suppress SSL warnings when using mitmproxy
urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)

from .auth import MeijerAuth, TokenStorage
from .coupon_operations import CouponOperations
from .coupons import CouponManager
from .exceptions import MeijerAPIError, MeijerAuthenticationError
from .feedback import MeijerFeedback
from .models import AuthTokens, ListItem, MeijerItem, SearchResult
from .mperks import (
    EarnableOffer,
    EarnedReward,
    EarnTabData,
    MCardInfo,
    MPerksEarnedRewards,
)
from .product_operations import ProductOperations
from .search import Search
from .settings import MeijerSettings
from .shop_scan import ShopNScan
from .shopping_list import MeijerList
from .stores import MeijerStore
from .account import AccountManager


class StoresInterface:
    """
    Interface wrapper for store operations to maintain notebook compatibility.
    
    This class provides the interface that notebooks expect while delegating
    to the main client's store methods.
    """
    
    def __init__(self, client: "Meijer"):
        """Initialize with reference to main client."""
        self.client = client
    
    def get_nearby(self, latitude: Optional[float] = None, longitude: Optional[float] = None, radius: int = 25) -> List[MeijerStore]:
        """
        Get nearby stores.
        
        Parameters
        ----------
        latitude : float, optional
            Search latitude (defaults to center of Michigan)
        longitude : float, optional
            Search longitude (defaults to center of Michigan)
        radius : int, optional
            Search radius in miles (default: 25)
            
        Returns
        -------
        List[MeijerStore]
            List of nearby stores
        """
        # Use default coordinates if not provided
        if latitude is None or longitude is None:
            latitude = 44.3148  # Center of Michigan
            longitude = -85.6024
        
        return self.client.get_stores(latitude=latitude, longitude=longitude, radius=radius)
    
    def search_by_location(self, location: str, radius: int = 25) -> List[MeijerStore]:
        """
        Search for stores by location string.
        
        Parameters
        ----------
        location : str
            Location string (city, state or ZIP code)
        radius : int, optional
            Search radius in miles (default: 25)
            
        Returns
        -------
        List[MeijerStore]
            List of stores near the location
        """
        # Try to parse as city name first
        if not location.isdigit():
            return self.client.get_stores(city=location, radius=radius)
        else:
            # Treat as ZIP code
            return self.client.get_stores(zip_code=location, radius=radius)
    
    def search_by_proximity(self, lat: float, lng: float, radius: int = 25) -> List[MeijerStore]:
        """
        Search for stores by proximity coordinates.
        
        Parameters
        ----------
        lat : float
            Latitude
        lng : float
            Longitude
        radius : int, optional
            Search radius in miles (default: 25)
            
        Returns
        -------
        List[MeijerStore]
            List of stores within radius
        """
        return self.client.get_stores(latitude=lat, longitude=lng, radius=radius)
    
    def get_by_id(self, store_id: str) -> Optional[MeijerStore]:
        """
        Get store by ID.
        
        Parameters
        ----------
        store_id : str
            Store ID to look up
            
        Returns
        -------
        MeijerStore, optional
            Store if found, None otherwise
        """
        return self.client.get_store_by_id(store_id)


class Meijer:
    """
    Main client for Meijer API interactions.

    This class provides access to all Meijer API functionality including:
    - Authentication and token management with automatic refresh
    - Shopping lists and favorites
    - Coupons and offers
    - Product search
    - Shop & Scan functionality
    - Store information
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

        # API configuration based on APK analysis
        self.api_base_url = "https://api.meijer.com"
        self.subscription_key = "a10bc58ac484478d9b3958b1742c3a03"  # From APK analysis
        
        # Handle base URL override for local development/testing
        if base_url:
            self.logger.info(f"Using custom base URL: {base_url}")
            self._setup_local_endpoints(base_url)
        else:
            self._setup_default_endpoints()

        # Initialize token storage
        self.token_storage = TokenStorage()

        # Initialize requests session for HTTP requests
        import requests
        from requests.adapters import HTTPAdapter
        from urllib3.util.retry import Retry
        
        self.session = requests.Session()
        
        # Configure connection pooling and retries for efficiency
        adapter = HTTPAdapter(
            pool_connections=10,      # Number of connection pools to cache
            pool_maxsize=20,          # Maximum number of connections per pool
            max_retries=Retry(
                total=3,              # Total retries
                backoff_factor=0.5,   # Exponential backoff: 0.5s, 1s, 2s
                status_forcelist=[429, 500, 502, 503, 504],  # Retry on rate limits and server errors
                allowed_methods=["GET", "POST", "PUT", "DELETE"]  # Allow retries on all methods
            )
        )
        self.session.mount("http://", adapter)
        self.session.mount("https://", adapter)
        
        # Set reasonable timeouts to avoid hanging connections
        self.session.timeout = (5, 30)  # (connect_timeout, read_timeout)
        
        # Enable keep-alive for connection reuse
        self.session.headers.update({
            'Connection': 'keep-alive',
            'Keep-Alive': 'timeout=30, max=100'
        })
        
        # Initialize authentication
        self.auth = MeijerAuth(self.token_storage)

        # Initialize sub-components
        self.shopping_list = MeijerList(self)
        self.coupons = CouponManager(self)
        self.coupon_ops = CouponOperations(self)
        self.product_ops = ProductOperations(self)
        self.search = Search(self)
        self.shop_scan = ShopNScan(self)
        self.mperks = MPerksEarnedRewards(self)
        self.feedback = MeijerFeedback(self)
        self.settings = MeijerSettings(self)
        
        # Initialize account management
        self.account = AccountManager(self)

        # Initialize cart instance
        try:
            from .cart import MeijerCart

            self.cart = MeijerCart(self, store_id="217")
        except ImportError:
            self.logger.warning("Cart module not available")
            self.cart = None

        # Add alias for CLI compatibility
        self.list = self.shopping_list

        # Add stores interface wrapper for notebook compatibility
        self.stores = StoresInterface(self)

        # Load authentication
        self._load_auth(auth)
        
        # SSL configuration
        self.ssl_verify = True
        
        # Auto-detect mitmproxy certificate path using Path().home()
        possible_cert_paths = [
            Path().home() / ".mitmproxy" / "mitmproxy-ca-cert.pem",
            Path().home() / ".mitmproxy" / "mitmproxy-ca.pem",
        ]
        
        # Check for custom certificate path from environment variable
        custom_cert_path = os.environ.get('MEIJER_MITMPROXY_CERT')
        if custom_cert_path:
            possible_cert_paths.insert(0, Path(custom_cert_path))
            self.logger.info(f"🔒 Using custom mitmproxy certificate path from environment: {custom_cert_path}")
        
        self.ssl_cert_path = None
        for cert_path in possible_cert_paths:
            if cert_path.exists():
                self.ssl_cert_path = str(cert_path)
                break
        
        # Auto-configure SSL with mitmproxy certificate if available
        if self.ssl_cert_path:
            self.logger.info(f"🔒 Auto-configuring SSL with mitmproxy certificate: {self.ssl_cert_path}")
            # When using mitmproxy, we need to disable SSL verification
            # because mitmproxy intercepts and re-signs all HTTPS traffic
            self.ssl_verify = False
            self.logger.info("🔒 SSL verification disabled for mitmproxy compatibility")
        else:
            self.logger.warning("⚠️ Mitmproxy certificate not found in common locations")
            self.logger.info("💡 Expected locations:")
            for path in possible_cert_paths:
                self.logger.info(f"   - {path}")
            self.ssl_verify = True  # Fall back to system certificates

        # Proxy configuration - only set when explicitly configured by user
        self.proxy_host = None
        self.proxy_port = None
        
        # Rate limiting and caching for API efficiency
        self._request_cache = {}  # Simple in-memory cache
        self._last_request_time = {}  # Track last request time per endpoint
        self._min_request_interval = 0.5  # Minimum seconds between requests to same endpoint
        
        # Request deduplication
        self._pending_requests = {}  # Track in-flight requests to avoid duplicates

    def _rate_limit(self, endpoint: str) -> None:
        """
        Implement rate limiting to avoid overwhelming the API.
        
        Args:
            endpoint: API endpoint being called
        """
        import time
        
        current_time = time.time()
        last_time = self._last_request_time.get(endpoint, 0)
        
        if current_time - last_time < self._min_request_interval:
            sleep_time = self._min_request_interval - (current_time - last_time)
            self.logger.debug(f"⏱️ Rate limiting: sleeping {sleep_time:.2f}s for {endpoint}")
            time.sleep(sleep_time)
        
        self._last_request_time[endpoint] = time.time()

    def _get_cache_key(self, method: str, url: str, params: dict = None, json_data: dict = None) -> str:
        """
        Generate a cache key for the request.
        
        Args:
            method: HTTP method
            url: Request URL
            params: Query parameters
            json_data: JSON payload
            
        Returns:
            Cache key string
        """
        import hashlib
        
        # Create a unique key based on request parameters
        key_parts = [method, url]
        if params:
            key_parts.append(str(sorted(params.items())))
        if json_data:
            key_parts.append(str(sorted(json_data.items())))
        
        key_string = "|".join(key_parts)
        return hashlib.md5(key_string.encode()).hexdigest()

    def _check_cache(self, cache_key: str, max_age: int = 300) -> dict:
        """
        Check if we have a cached response.
        
        Args:
            cache_key: Cache key for the request
            max_age: Maximum age of cached response in seconds (default: 5 minutes)
            
        Returns:
            Cached response data or None if not found/expired
        """
        import time
        
        if cache_key in self._request_cache:
            cached_data, timestamp = self._request_cache[cache_key]
            if time.time() - timestamp < max_age:
                self.logger.debug(f"💾 Using cached response for {cache_key}")
                return cached_data
            else:
                # Remove expired cache entry
                del self._request_cache[cache_key]
        
        return None

    def _cache_response(self, cache_key: str, response_data: dict) -> None:
        """
        Cache a response for future use.
        
        Args:
            cache_key: Cache key for the request
            response_data: Response data to cache
        """
        import time
        
        self._request_cache[cache_key] = (response_data, time.time())
        self.logger.debug(f"💾 Cached response for {cache_key}")

    def _deduplicate_request(self, cache_key: str) -> bool:
        """
        Check if a request is already in flight to avoid duplicates.
        
        Args:
            cache_key: Cache key for the request
            
        Returns:
            True if request is already in flight, False otherwise
        """
        import time
        
        current_time = time.time()
        
        # Clean up old pending requests (older than 30 seconds)
        self._pending_requests = {
            k: v for k, v in self._pending_requests.items() 
            if current_time - v < 30
        }
        
        if cache_key in self._pending_requests:
            self.logger.debug(f"🔄 Request already in flight for {cache_key}")
            return True
        
        # Mark this request as in flight
        self._pending_requests[cache_key] = current_time
        return False

    def clear_cache(self) -> None:
        """Clear all cached responses."""
        self._request_cache.clear()
        self.logger.info("🗑️ Cache cleared")

    def configure_rate_limiting(self, min_interval: float = 0.5) -> None:
        """
        Configure rate limiting behavior.
        
        Args:
            min_interval: Minimum seconds between requests to the same endpoint
        """
        self._min_request_interval = min_interval
        self.logger.info(f"⏱️ Rate limiting configured: {min_interval}s minimum interval")

    def get_cache_stats(self) -> dict:
        """
        Get cache statistics.
        
        Returns:
            Dictionary with cache statistics
        """
        return {
            'cache_size': len(self._request_cache),
            'pending_requests': len(self._pending_requests),
            'rate_limit_interval': self._min_request_interval
        }

    def _setup_default_endpoints(self):
        """Setup default Meijer API endpoints."""
        self.api_base_url = "https://api.meijer.com"
        self.id_base_url = "https://id.meijer.com"
        self.digital_base_url = "https://digital.meijer.com"
        self.loyalty_base_url = "https://loyalty.meijer.com"
        self.www_base_url = "https://www.meijer.com"
        self.constructor_base_url = "https://ac.cnstrc.com"
        self.feedback_base_url = "https://meijer.md-apis.medallia.com/mobileSDK/v2"

    def _setup_local_endpoints(self, base_url: str):
        """
        Setup local endpoints for development/testing.
        
        Args:
            base_url: Base URL for local server (e.g., "http://127.0.0.1:5000")
        """
        # Remove trailing slash if present
        base_url = base_url.rstrip('/')
        
        # Setup local endpoints - redirect all to the local Flask server
        self.api_base_url = f"{base_url}/api/meijer"

    def configure_ssl(self, verify: bool = True, cert_path: Optional[str] = None):
        """
        Configure SSL verification settings.
        
        Args:
            verify: Whether to verify SSL certificates (default: True)
            cert_path: Path to custom SSL certificate (default: None)
        """
        self.ssl_verify = verify
        self.ssl_cert_path = cert_path
        
        if verify:
            if cert_path:
                self.logger.info(f"🔒 SSL verification enabled with custom certificate: {cert_path}")
            else:
                self.logger.info("🔒 SSL verification enabled with system certificates")
        else:
            self.logger.warning("⚠️ SSL verification disabled - this may be insecure")
            
                        # Also set environment variable for requests
        import os
        if cert_path and os.path.exists(cert_path):
            os.environ['MEIJER_SSL_CERT'] = cert_path
        elif not verify:
            os.environ['MEIJER_SSL_VERIFY'] = 'false'
        
        self.id_base_url = f"{base_url}/api/meijer"
        self.digital_base_url = f"{base_url}/api/meijer"
        self.loyalty_base_url = f"{base_url}/api/meijer"
        self.www_base_url = f"{base_url}/api/meijer"
        self.constructor_base_url = f"{base_url}/api/meijer"
        self.feedback_base_url = f"{base_url}/api/meijer"
        
        self.logger.info(f"Configured local endpoints:")
        self.logger.info(f"  API Base: {self.api_base_url}")
        self.logger.info(f"  ID Base: {self.id_base_url}")
        self.logger.info(f"  Digital Base: {self.digital_base_url}")
        self.logger.info(f"  Loyalty Base: {self.loyalty_base_url}")
        self.logger.info(f"  WWW Base: {self.www_base_url}")
        self.logger.info(f"  Constructor Base: {self.constructor_base_url}")
        self.logger.info(f"  Feedback Base: {self.feedback_base_url}")

    def _get_api_url(self, endpoint: str) -> str:
        """
        Get the full API URL for an endpoint.
        
        Args:
            endpoint: API endpoint path
            
        Returns:
            Full URL for the endpoint
        """
        # If using local endpoints, prepend the base
        if hasattr(self, 'api_base_url') and self.api_base_url.startswith('http://'):
            return f"{self.api_base_url}/{endpoint.lstrip('/')}"
        
        # Otherwise use the default Meijer API
        return f"https://api.meijer.com/{endpoint.lstrip('/')}"

    def _load_auth(self, auth: Optional[str] = None):
        """Load authentication credentials from various sources."""
        if auth:
            if auth.endswith(".log"):
                self._load_auth_from_log(auth)
            else:
                self._load_auth_from_file(auth)
        else:
            self._load_auth_from_config()

    def _load_auth_from_file(self, auth_file: str):
        """Load authentication from plain text auth file."""
        try:
            with open(auth_file, "r") as f:
                lines = f.readlines()

            # Look for bearer token or user/password in any line
            bearer_token = None
            user = None
            password = None

            for line in lines:
                line = line.strip()
                # Skip empty lines and comments
                if not line or line.startswith("#"):
                    continue

                if line.startswith("bearer="):
                    bearer_token = line[7:]  # Remove 'bearer=' prefix
                elif line.startswith("user="):
                    user = line[5:]
                elif line.startswith("password="):
                    password = line[9:]

            # Use bearer token if found
            if bearer_token:
                # Create temporary tokens for bearer token
                temp_tokens = AuthTokens(
                    access_token=bearer_token,
                    refresh_token="",  # No refresh token available
                    expires_in=3600,  # Assume 1 hour expiry
                    token_type="Bearer",
                )

                if self.token_storage.save_tokens(temp_tokens):
                    self.logger.info("✅ Loaded bearer token from auth file")
                else:
                    self.logger.warning("⚠️ Failed to save bearer token")
                return

            # Use user/password if found
            if user and password:
                self.logger.info("✅ Loaded user credentials from auth file")
                # TODO: Implement login flow for user/password
                return

            # If neither found, raise error
            raise ValueError("No valid authentication found in auth file")

        except Exception as e:
            self.logger.error(f"❌ Failed to load auth file: {e}")
            raise

    def _load_auth_from_log(self, log_file: str):
        """Load authentication from mitmproxy log file."""
        try:
            tokens = self.token_storage.extract_tokens_from_log(log_file)
            if tokens:
                if self.token_storage.save_tokens(tokens):
                    self.logger.info("✅ Tokens extracted and saved from log file")
                else:
                    self.logger.warning("⚠️ Failed to save extracted tokens")
            else:
                self.logger.warning("⚠️ No valid tokens found in log file")
        except Exception as e:
            self.logger.error(f"❌ Failed to load auth from log: {e}")
            raise

    def _load_auth_from_config(self):
        """Load authentication from cross-platform config directory or token storage."""
        # First check if we already have tokens in storage
        if self.token_storage.has_tokens():
            self.logger.info("✅ Found existing tokens in storage")
            return

        # Get cross-platform config path
        from .auth import get_meijer_config_path

        config_path = Path(get_meijer_config_path("auth.json"))

        if config_path.exists():
            try:
                with open(config_path, "r") as f:
                    config = json.load(f)

                # Check for new token format first
                if "access_token" in config and "refresh_token" in config:
                    tokens = AuthTokens(
                        access_token=config["access_token"],
                        refresh_token=config["refresh_token"],
                        expires_in=config.get("expires_in", 28800),
                        token_type=config.get("token_type", "Bearer"),
                    )

                    if self.token_storage.save_tokens(tokens):
                        self.logger.info("✅ Loaded authentication from config file")
                        return
                    else:
                        self.logger.warning("⚠️ Failed to save tokens from config")

                # Fallback to old format
                elif "bearer" in config:
                    temp_tokens = AuthTokens(
                        access_token=config["bearer"],
                        refresh_token="",
                        expires_in=3600,
                        token_type="Bearer",
                    )

                    if self.token_storage.save_tokens(temp_tokens):
                        self.logger.info("✅ Loaded bearer token from config file")
                        return

            except Exception as e:
                self.logger.warning(f"⚠️ Failed to load config file: {e}")

        self.logger.info("ℹ️ No authentication found in config file or token storage")

    def _ensure_authenticated(self) -> bool:
        """Ensure we have a valid access token."""
        # First check if we have stored tokens
        if self.token_storage.has_tokens():
            self.logger.info("🔍 Found existing tokens, testing refresh...")

            # Try to refresh tokens first
            try:
                tokens = self.token_storage.get_valid_tokens()
                if tokens:
                    # Check if we have a refresh token
                    if not tokens.refresh_token or tokens.refresh_token.strip() == "":
                        self.logger.warning(
                            "⚠️ No refresh token available - tokens cannot be refreshed automatically"
                        )
                        print(
                            "⚠️ Your current tokens cannot be refreshed automatically (no refresh token)"
                        )
                        print(
                            "💡 Run 'meijer auth' to re-authenticate and get new tokens with refresh capability"
                        )
                        return False

                    # Check if token is close to expiring
                    if tokens.is_expired(buffer_seconds=600):  # 10 minutes buffer
                        self.logger.info(
                            "🔄 Token expiring soon, proactively refreshing..."
                        )
                        if self.token_storage.refresh_tokens(tokens.refresh_token):
                            self.logger.info("✅ Token refreshed proactively")
                        else:
                            self.logger.warning("❌ Proactive refresh failed")
                            print(
                                "❌ Token refresh failed - you may need to re-authenticate"
                            )
                            return False
                    else:
                        self.logger.info("✅ Token refresh successful")
                    return True
                else:
                    self.logger.warning("❌ Token refresh failed")
                    # Show Unicode red X for failed refresh
                    print("❌ Token refresh failed - falling back to login method")
                    return False
            except Exception as e:
                self.logger.error(f"❌ Exception during token refresh: {e}")
                # Show Unicode red X for failed refresh
                print("❌ Token refresh failed - falling back to login method")
                return False

        # No tokens or refresh failed, need to authenticate
        tokens = self.token_storage.get_valid_tokens()
        if not tokens:
            raise MeijerAuthenticationError("No valid access token available")
        return True

    def _get_api_headers(self) -> Dict[str, str]:
        """Get headers required for API requests."""
        headers = {
            "user-agent": "Meijer/101200000 okhttp/4.12.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)",
            "accept-encoding": "gzip",
        }

        # Use Bearer token for authenticated endpoints
        tokens = self.token_storage.get_valid_tokens()
        if tokens and tokens.access_token:
            headers["Authorization"] = f"Bearer {tokens.access_token}"

        # Always include subscription key as some endpoints require both
        # This is the public key from APK analysis and is safe to include
        headers["ocp-apim-subscription-key"] = self.subscription_key

        return headers

    @property
    def token_expires_at(self) -> Optional[datetime]:
        """
        Get the expiration time of the current access token.
        
        Returns:
            datetime object representing when the token expires, or None if no token
        """
        tokens = self.token_storage.get_valid_tokens()
        if tokens and tokens.expires_at:
            return tokens.expires_at
        return None

    def _make_request(
        self,
        method: str,
        url: str,
        headers: Optional[Dict[str, str]] = None,
        params: Optional[Dict[str, Any]] = None,
        json_data: Optional[Dict[str, Any]] = None,
        cache: bool = True,
        cache_max_age: int = 300,
        **kwargs,
    ) -> Any:
        """Make HTTP request with proper error handling, caching, and rate limiting."""
        import requests
        import os

        try:
            # Generate cache key for this request
            cache_key = self._get_cache_key(method, url, params, json_data)
            
            # Check cache first (only for GET requests and when caching is enabled)
            if cache and method.upper() == "GET":
                cached_response = self._check_cache(cache_key, cache_max_age)
                if cached_response:
                    # Return a mock response object with cached data
                    class CachedResponse:
                        def __init__(self, data):
                            self.status_code = 200
                            self.json_data = data
                            self.cached = True
                        
                        def json(self):
                            return self.json_data
                    
                    return CachedResponse(cached_response)
            
            # Check for duplicate requests
            if self._deduplicate_request(cache_key):
                # Wait a bit and check cache again
                import time
                time.sleep(0.1)
                cached_response = self._check_cache(cache_key, cache_max_age)
                if cached_response:
                    class CachedResponse:
                        def __init__(self, data):
                            self.status_code = 200
                            self.json_data = data
                            self.cached = True
                        
                        def json(self):
                            return self.json_data
                    
                    return CachedResponse(cached_response)
            
            # Rate limit requests to avoid overwhelming the API
            endpoint = url.split('/')[-1] if '/' in url else url
            self._rate_limit(endpoint)
            
            # Use default headers if none provided
            if headers is None:
                headers = self._get_api_headers()

            # SSL verification settings
            ssl_verify = kwargs.pop('verify', self.ssl_verify)
            
            # Check if we're using a proxy (which might have certificate issues)
            if hasattr(self, 'proxy_host') and self.proxy_host:
                # When using proxy, we might need to disable SSL verification
                ssl_verify = False
                self.logger.info("🔒 Using proxy - SSL verification disabled")
            
            # Use client's SSL configuration - prioritize the verify setting over cert path
            if not self.ssl_verify:
                # If SSL verification is disabled, don't use certificate path
                ssl_verify = False
                self.logger.info("🔒 SSL verification disabled as configured")
            elif self.ssl_cert_path and os.path.exists(self.ssl_cert_path):
                # Only use certificate path if SSL verification is enabled
                ssl_verify = self.ssl_cert_path
                self.logger.info(f"🔒 Using custom SSL certificate: {self.ssl_cert_path}")
            
            # Debug SSL configuration
            self.logger.info(f"🔒 Final SSL verification setting: {ssl_verify}")
            self.logger.info(f"🔒 Client SSL verify: {self.ssl_verify}")
            self.logger.info(f"🔒 Client SSL cert path: {self.ssl_cert_path}")
            
            # Set environment variables for requests when SSL verification is disabled
            if ssl_verify is False:
                os.environ['REQUESTS_CA_BUNDLE'] = ''
                os.environ['CURL_CA_BUNDLE'] = ''
                self.logger.info("🔒 Environment variables set to disable SSL verification")
            
            # Make request with SSL configuration using the session
            response = self.session.request(
                method=method,
                url=url,
                headers=headers,
                params=params,
                json=json_data,
                timeout=30,
                verify=ssl_verify,
                **kwargs,
            )

            # Log request details
            self.logger.debug(f"{method} {url} - Status: {response.status_code}")

            # Cache successful GET responses
            if cache and method.upper() == "GET" and response.status_code == 200:
                try:
                    response_data = response.json()
                    self._cache_response(cache_key, response_data)
                except (ValueError, TypeError):
                    # Response is not JSON, don't cache
                    pass

            # Remove from pending requests
            if cache_key in self._pending_requests:
                del self._pending_requests[cache_key]

            return response

        except Exception as e:
            # Remove from pending requests on error
            if 'cache_key' in locals() and cache_key in self._pending_requests:
                del self._pending_requests[cache_key]
            
            self.logger.error(f"Request failed: {e}")
            raise MeijerAPIError(f"Request failed: {e}")

    def get_order_history(
        self, current_page: int = 0, page_size: int = 10, fields: str = "FULL"
    ) -> List[Dict[str, Any]]:
        """
        Get order history for the authenticated user.

        Args:
            current_page: Page number for pagination (0-based)
            page_size: Number of orders per page
            fields: Fields to include in response (FULL, BASIC, etc.)

        Returns:
            List of order information dictionaries
        """
        try:
            params = {
                "currentPage": current_page,
                "pageSize": page_size,
                "fields": fields,
            }

            response = self._make_request(
                "GET", f"{self.api_base_url}/digital/occ/v3/orders", params=params
            )

            if response and response.status_code == 200:
                data = response.json()
                return data.get("orders", [])
            else:
                self.logger.warning(
                    f"Failed to get order history: {response.status_code if response else 'No response'}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Error getting order history: {e}")
            return []

    def get_stores(
        self,
        zip_code: Optional[str] = None,
        city: Optional[str] = None,
        latitude: Optional[float] = None,
        longitude: Optional[float] = None,
        radius: Optional[int] = None,
        required_services: Optional[List[str]] = None,
        max_results: int = 50
    ) -> List[MeijerStore]:
        """
        Enhanced store search with comprehensive filtering and service detection.
        
        This method provides a unified interface for store discovery with automatic
        service filtering, error handling, and intelligent fallbacks. It consolidates
        all store search functionality into a single, robust method.
        
        Parameters
        ----------
        zip_code : str, optional
            ZIP code for location-based search
        city : str, optional
            City name for location-based search (case-insensitive, partial matching)
        latitude : float, optional
            Search latitude (required if radius specified)
        longitude : float, optional
            Search longitude (required if radius specified)
        radius : int, optional
            Search radius in miles (default: 50)
        required_services : List[str], optional
            List of required services (e.g., 'pharmacy', 'gas_station', 'curbside_pickup', 'delivery')
        max_results : int, optional
            Maximum number of stores to return (default: 50)
            
        Returns
        -------
        List[MeijerStore]
            List of stores matching criteria, sorted by distance
            
        Examples
        --------
        >>> # Basic search with coordinates
        >>> stores = client.get_stores(42.9634, -85.6681, 25)
        >>> 
        >>> # Search with service filtering
        >>> stores = client.get_stores(42.9634, -85.6681, 50, required_services=['pharmacy', 'gas_station'])
        >>> 
        >>> # Search by ZIP code
        >>> stores = client.get_stores(zip_code="49508", radius=25)
        >>> 
        >>> # Search by city
        >>> stores = client.get_stores(city="Grand Rapids", radius=30)
        """
        try:
            # If radius is specified with coordinates, use the enhanced proximity search
            if radius and latitude and longitude:
                self.logger.info(f"Searching for stores within {radius} miles of ({latitude}, {longitude})")
                stores = self.find_stores_nearby(latitude, longitude, radius, max_results)
                
                if not stores:
                    self.logger.warning(f"No stores found within {radius} miles")
                    return []
                
                self.logger.info(f"Found {len(stores)} stores in radius")
                
                # Filter by required services if specified
                if required_services:
                    stores = self._filter_stores_by_services(stores, required_services)
                
                return stores

            # Otherwise, use the working storeInfo endpoint with provided or default coordinates
            url = self._get_api_url("digital/storeInfo/v2/stores/proximity")

            # Use provided coordinates or default to center of Michigan
            if latitude and longitude:
                params = {
                    "latitude": latitude,
                    "longitude": longitude,
                    "miles": radius or 50,  # Use provided radius or default to 50 miles
                    "numToReturn": max_results,
                    "dataVariant": 2,
                }
            else:
                # Default coordinates near the center of Michigan
                params = {
                    "latitude": 44.3148,  # Center of Michigan
                    "longitude": -85.6024,
                    "miles": 500,  # Large radius to get stores across the region
                    "numToReturn": max_results,  # Get more stores
                    "dataVariant": 2,
                }

            # Headers required by storeInfo APIs
            headers = {
                "Accept": "application/json",
                "Content-Type": "application/json",
                "Version": "9",
                "ocp-apim-subscription-key": self.subscription_key,
            }

            # Add authorization if available
            if (
                self.token_storage.get_valid_tokens()
                and self.token_storage.get_valid_tokens().access_token
            ):
                headers["authorization"] = (
                    f"Bearer {self.token_storage.get_valid_tokens().access_token}"
                )

            response = self._make_request("GET", url, headers=headers, params=params)

            if response.status_code == 200:
                data = response.json()
                self.logger.info(f"🔍 Stores API response: {data}")
                stores = []

                for store_data in data.get("store", []):
                    try:
                        # Ensure UnitId is present and not empty
                        if not store_data.get("UnitId"):
                            self.logger.warning(
                                "Failed to parse store data: Unit ID cannot be empty"
                            )
                            continue

                        # Filter by zip_code if provided
                        if zip_code and store_data.get("Zip") != zip_code:
                            continue

                        # Filter by city if provided (case-insensitive, partial matching)
                        if city:
                            store_city = store_data.get("City", "")
                            if not store_city:
                                continue

                            # Normalize city names for better matching
                            search_city = city.lower().replace(" ", "").replace("-", "")
                            store_city_normalized = (
                                store_city.lower().replace(" ", "").replace("-", "")
                            )

                            # Check if search city is contained in store city (normalized)
                            if search_city not in store_city_normalized:
                                # Also try reverse: check if store city is contained in search city
                                if store_city_normalized not in search_city:
                                    continue

                        store = MeijerStore.from_api_data(store_data, self)
                        stores.append(store)
                    except Exception as e:
                        self.logger.warning(f"Failed to parse store data: {e}")
                        continue

                # Filter by required services if specified
                if required_services:
                    stores = self._filter_stores_by_services(stores, required_services)

                return stores
            else:
                self.logger.warning(f"Failed to get stores: {response.status_code}")
                return []

        except Exception as e:
            self.logger.error(f"Error getting stores: {e}")
            return []

    def _filter_stores_by_services(self, stores: List[MeijerStore], required_services: List[str]) -> List[MeijerStore]:
        """
        Filter stores by required services.
        
        Parameters
        ----------
        stores : List[MeijerStore]
            List of stores to filter
        required_services : List[str]
            List of required services
            
        Returns
        -------
        List[MeijerStore]
            Filtered list of stores with all required services
        """
        self.logger.info(f"Filtering {len(stores)} stores by required services: {required_services}")
        filtered_stores = []
        
        for store in stores:
            store_services = []
            
            # Check available services
            if hasattr(store, 'has_pharmacy') and store.has_pharmacy:
                store_services.append('pharmacy')
            if hasattr(store, 'has_gas_station') and store.has_gas_station():
                store_services.append('gas_station')
            if hasattr(store, 'has_curbside_pickup') and store.has_curbside_pickup:
                store_services.append('curbside_pickup')
            if hasattr(store, 'has_delivery') and store.has_delivery:
                store_services.append('delivery')
            if hasattr(store, 'has_pickup') and store.has_pickup:
                store_services.append('pickup')
            if hasattr(store, 'has_grocery') and store.has_grocery:
                store_services.append('grocery')
            if hasattr(store, 'has_general_merchandise') and store.has_general_merchandise:
                store_services.append('general_merchandise')
            
            # Check if store has all required services
            if all(service in store_services for service in required_services):
                filtered_stores.append(store)
                self.logger.debug(f"Store {store.unit_id} ({store.name}) matches service requirements")
            else:
                missing_services = [s for s in required_services if s not in store_services]
                self.logger.debug(f"Store {store.unit_id} ({store.name}) missing services: {missing_services}")
        
        self.logger.info(f"Found {len(filtered_stores)} stores with required services: {required_services}")
        return filtered_stores

    def find_stores_nearby(
        self,
        latitude: float,
        longitude: float,
        radius_miles: int = 100,
        max_results: int = 50,
    ) -> List[MeijerStore]:
        """
        Find Meijer stores near given coordinates using proximity search.

        Args:
            latitude: Search latitude
            longitude: Search longitude
            radius_miles: Search radius in miles (default: 100)
            max_results: Maximum number of stores to return (default: 50)

        Returns:
            List of MeijerStore objects sorted by distance
        """
        try:
            # Use the storeInfo proximity endpoint for better results
            url = self._get_api_url("digital/storeInfo/v2/stores/proximity")

            params = {
                "latitude": latitude,
                "longitude": longitude,
                "miles": radius_miles,
                "numToReturn": max_results,
                "dataVariant": 2,  # From APK analysis
            }

            # Use the correct headers from APK analysis
            headers = {
                "Accept": "application/json",
                "Content-Type": "application/json",
                "Version": "9",  # Required header from APK
                "ocp-apim-subscription-key": self.subscription_key,
            }

            # Add authorization if available
            if (
                self.token_storage.get_valid_tokens()
                and self.token_storage.get_valid_tokens().access_token
            ):
                headers["authorization"] = (
                    f"Bearer {self.token_storage.get_valid_tokens().access_token}"
                )

            # Use the client's request method with custom headers
            response = self._make_request("GET", url, headers=headers, params=params)

            if response.status_code == 200:
                data = response.json()
                self.logger.info(f"API Response: {data}")
                stores = []

                # Parse the response data into MeijerStore objects
                for store_data in data.get("store", []):
                    try:
                        # Ensure UnitId is present and not empty
                        if not store_data.get("UnitId"):
                            self.logger.warning(
                                "Failed to parse store data: Unit ID cannot be empty"
                            )
                            continue
                        store = MeijerStore.from_api_data(store_data, self)
                        stores.append(store)
                    except Exception as e:
                        self.logger.warning(f"Failed to parse store data: {e}")
                        continue

                self.logger.info(
                    f"Found {len(stores)} stores within {radius_miles} miles of ({latitude}, {longitude})"
                )
                return stores
            else:
                self.logger.warning(f"Failed to get stores: {response.status_code}")
                self.logger.warning(f"Response content: {response.text}")
                return []

        except Exception as e:
            self.logger.error(f"Error finding stores nearby: {e}")
            return []

    def get_store_by_id(self, store_id: str) -> Optional[MeijerStore]:
        """
        Get detailed store information by UnitId (store ID).

        This uses the storeInfo v2 proximity endpoint with a large radius to find
        the specific store by ID, which includes richer fields such as gas station
        amenities and hours when available.

        Parameters
        ----------
        store_id : str
            Meijer UnitId for the store

        Returns
        -------
        MeijerStore, optional
            Parsed store information if found, None otherwise
        """
        try:
            # Use the proximity endpoint with a large radius to find the store
            # This approach is more reliable than direct store ID lookup
            url = self._get_api_url("digital/storeInfo/v2/stores/proximity")

            # Use coordinates near the center of Michigan as a starting point
            # The API will return stores within the radius, and we'll filter by ID
            params = {
                "latitude": 44.3148,  # Center of Michigan
                "longitude": -85.6024,
                "miles": 500,  # Large radius to ensure we find the store
                "numToReturn": 100,  # Get more stores to increase chances of finding the target
                "dataVariant": 2,
            }

            # Headers required by storeInfo APIs
            headers = {
                "Accept": "application/json",
                "Content-Type": "application/json",
                "Version": "9",
                "ocp-apim-subscription-key": self.subscription_key,
            }

            if (
                self.token_storage.get_valid_tokens()
                and self.token_storage.get_valid_tokens().access_token
            ):
                headers["authorization"] = (
                    f"Bearer {self.token_storage.get_valid_tokens().access_token}"
                )

            response = self._make_request("GET", url, headers=headers, params=params)

            if response.status_code != 200:
                self.logger.warning(
                    f"Failed to get store by id {store_id}: {response.status_code}"
                )
                return None

            data = response.json()

            # Handle different response formats
            if isinstance(data, dict):
                # Check for 'stores' key (plural) - proximity search response
                if "stores" in data:
                    stores_data = data["stores"]
                    self.logger.info(f"Found {len(stores_data)} stores in response")
                    if isinstance(stores_data, list):
                        for store_data in stores_data:
                            if isinstance(store_data, dict) and str(
                                store_data.get("UnitId")
                            ) == str(store_id):
                                self.logger.info(f"Found target store {store_id}")
                                return MeijerStore.from_api_data(store_data, self)

                        # If we didn't find the exact store, log what we did find
                        found_ids = [
                            str(s.get("UnitId")) for s in stores_data if s.get("UnitId")
                        ]
                        self.logger.warning(
                            f"Store {store_id} not found. Available store IDs: {found_ids[:10]}..."
                        )
                        return None
                    else:
                        self.logger.warning("Unexpected stores data format in response")
                        return None

                # Check for 'store' key (singular) - direct store lookup response
                elif "store" in data:
                    store_data = data["store"]
                    self.logger.info("Found 'store' key in response")

                    # Handle case where 'store' is a list
                    if isinstance(store_data, list):
                        for store_item in store_data:
                            if isinstance(store_item, dict):
                                store_id_from_response = str(store_item.get("UnitId"))
                                if store_id_from_response == str(store_id):
                                    self.logger.info(f"Found target store {store_id}")
                                    return MeijerStore.from_api_data(store_item, self)

                        # If we didn't find the exact store, log what we did find
                        found_ids = [
                            str(s.get("UnitId"))
                            for s in store_data
                            if isinstance(s, dict) and s.get("UnitId")
                        ]
                        self.logger.warning(
                            f"Store {store_id} not found in list. Available store IDs: {found_ids[:10]}..."
                        )
                        return None

                    # Handle case where 'store' is a single dict
                    elif isinstance(store_data, dict):
                        store_id_from_response = str(store_data.get("UnitId"))
                        if store_id_from_response == str(store_id):
                            self.logger.info(f"Found target store {store_id}")
                            return MeijerStore.from_api_data(store_data, self)
                        else:
                            self.logger.warning(
                                f"Store ID mismatch. Expected: {store_id}, Got: {store_id_from_response}"
                            )
                            return None
                    else:
                        self.logger.warning("Unexpected store data format in response")
                        return None

                # Check for other wrapper formats
                elif "data" in data and isinstance(data["data"], list):
                    stores_data = data["data"]
                    for store_data in stores_data:
                        if isinstance(store_data, dict) and str(
                            store_data.get("UnitId")
                        ) == str(store_id):
                            self.logger.info(f"Found target store {store_id}")
                            return MeijerStore.from_api_data(store_data, self)
                    return None

                # Check if the data itself is a store
                elif "UnitId" in data:
                    if str(data.get("UnitId")) == str(store_id):
                        self.logger.info(f"Found target store {store_id}")
                        return MeijerStore.from_api_data(data, self)
                    else:
                        return None

                else:
                    self.logger.warning("Unexpected storeInfo response format")
                    self.logger.info(f"Response structure: {type(data)}")
                    if isinstance(data, dict):
                        self.logger.info(f"Response keys: {list(data.keys())}")
                    return None
            else:
                self.logger.warning(f"Response is not a dict: {type(data)}")
                return None

        except Exception as e:
            self.logger.error(f"Error getting store by id {store_id}: {e}")
            return None



    def find_stores_with_services(
        self,
        latitude: float,
        longitude: float,
        radius: int,
        services: List[str],
        max_results: int = 50
    ) -> List[MeijerStore]:
        """
        Find stores that have specific services available.
        
        This is a convenience method that wraps get_stores for service-based filtering.
        
        Parameters
        ----------
        latitude : float
            Search latitude
        longitude : float
            Search longitude
        radius : int
            Search radius in miles
        services : List[str]
            Required services (e.g., 'pharmacy', 'gas_station', 'curbside_pickup', 'delivery')
        max_results : int, optional
            Maximum number of stores to return (default: 50)
            
        Returns
        -------
        List[MeijerStore]
            List of stores with all required services
            
        Examples
        --------
        >>> # Find pharmacies with gas stations
        >>> stores = client.find_stores_with_services(42.9634, -85.6681, 25, ['pharmacy', 'gas_station'])
        """
        return self.get_stores(
            latitude=latitude,
            longitude=longitude,
            radius=radius,
            required_services=services,
            max_results=max_results
        )

    def find_nearest_store_with_service(
        self,
        latitude: float,
        longitude: float,
        service: str,
        max_radius: int = 100
    ) -> Optional[MeijerStore]:
        """
        Find the nearest store that has a specific service.
        
        Parameters
        ----------
        latitude : float
            Search latitude
        longitude : float
            Search longitude
        service : str
            Required service (e.g., 'pharmacy', 'gas_station', 'curbside_pickup', 'delivery')
        max_radius : int, optional
            Maximum search radius in miles (default: 100)
            
        Returns
        -------
        MeijerStore, optional
            The nearest store with the required service, or None if not found
            
        Examples
        --------
        >>> # Find nearest pharmacy
        >>> store = client.find_nearest_store_with_service(42.9634, -85.6681, 'pharmacy')
        """
        stores = self.get_stores(
            latitude=latitude,
            longitude=longitude,
            radius=max_radius,
            required_services=[service],
            max_results=1
        )
        return stores[0] if stores else None

    def get_store_service_summary(self, store: MeijerStore) -> Dict[str, bool]:
        """
        Get a summary of services available at a specific store.
        
        Parameters
        ----------
        store : MeijerStore
            Store to get service summary for
            
        Returns
        -------
        Dict[str, bool]
            Dictionary mapping service names to availability
            
        Examples
        --------
        >>> services = client.get_store_service_summary(store)
        >>> print(f"Pharmacy: {services['pharmacy']}")
        """
        services = {}
        
        if hasattr(store, 'has_pharmacy'):
            services['pharmacy'] = store.has_pharmacy
        if hasattr(store, 'has_gas_station'):
            services['gas_station'] = store.has_gas_station()
        if hasattr(store, 'has_curbside_pickup'):
            services['curbside_pickup'] = store.has_curbside_pickup
        if hasattr(store, 'has_delivery'):
            services['delivery'] = store.has_delivery
        if hasattr(store, 'has_pickup'):
            services['pickup'] = store.has_pickup
        if hasattr(store, 'has_grocery'):
            services['grocery'] = store.has_grocery
        if hasattr(store, 'has_general_merchandise'):
            services['general_merchandise'] = store.has_general_merchandise
            
        return services

    def get_offers(
        self, store_id: Optional[str] = None, limit: int = 100
    ) -> List["Coupon"]:
        """Get available offers/coupons using the coupon operations module."""
        return self.coupon_ops.get_offers(store_id=store_id, limit=limit)

    def get_coupons(
        self, limit: int = 1000, use_pagination: bool = True
    ) -> List["Coupon"]:
        """Get available coupons with pagination support using the coupon operations module."""
        return self.coupon_ops.get_coupons(limit=limit, use_pagination=use_pagination)

    def get_all_coupons(self) -> List["Coupon"]:
        """Get all available coupons using the most effective method via coupon operations module."""
        return self.coupon_ops.get_all_coupons()

    def lookup_barcode_price(
        self, barcode: str, store_id: Optional[str] = None
    ) -> Optional[MeijerItem]:
        """
        Look up product information by barcode.

        Args:
            barcode: The barcode/UPC to look up
            store_id: Optional store ID for store-specific pricing

        Returns:
            MeijerItem if found, None otherwise
        """
        return self.shop_scan.lookup_barcode_price(barcode, store_id)

    def bulk_lookup_barcodes(
        self, barcodes: List[str], store_id: Optional[str] = None
    ) -> Dict[str, Optional[MeijerItem]]:
        """
        Look up multiple barcodes at once.

        Args:
            barcodes: List of barcodes to look up
            store_id: Optional store ID for store-specific pricing

        Returns:
            Dictionary mapping barcodes to MeijerItem objects (or None if not found)
        """
        return self.shop_scan.bulk_lookup_barcodes(barcodes, store_id)

    def search_products(
        self, query: str, results_per_page: int = 24, page: int = 1
    ) -> SearchResult:
        """
        Search for products.

        Args:
            query: Search query string
            results_per_page: Number of results per page
            page: Page number (1-based)

        Returns:
            SearchResult object containing search results
        """
        return self.search.search(query, results_per_page, page)

    def search_multiple_products_by_upc(
        self, 
        upcs: List[str], 
        store_id: Optional[str] = None
    ) -> List[MeijerItem]:
        """
        Search for multiple products by UPC codes using the multi-UPC endpoint.
        
        This method provides efficient bulk UPC lookup by making a single API call
        instead of multiple individual searches. It's ideal for processing shopping
        lists, inventory checks, or bulk product information retrieval.
        
        Args:
            upcs: List of UPC codes to search for (maximum 20 per request)
            store_id: Optional store ID for store-specific pricing and availability
            
        Returns:
            List of MeijerItem objects for found products
            
        Raises:
            ValueError: If more than 20 UPCs are provided
            
        Example:
            >>> upcs = ["1189600014", "1780016746", "1114110614"]
            >>> products = client.search_multiple_products_by_upc(upcs, store_id="19")
            >>> for product in products:
            ...     print(f"{product.title}: ${product.price}")
        """
        return self.search.search_multiple_upcs(upcs, store_id)

    def search_product_by_upc(
        self, 
        upc: str, 
        store_id: Optional[str] = None
    ) -> Optional[MeijerItem]:
        """
        Search for a single product by UPC code.
        
        This method provides a convenient way to search for individual products
        by their UPC code, with optional store-specific pricing.
        
        Args:
            upc: UPC code to search for
            store_id: Optional store ID for store-specific pricing and availability
            
        Returns:
            MeijerItem if found, None otherwise
            
        Example:
            >>> product = client.search_product_by_upc("1189600014", store_id="19")
            >>> if product:
            ...     print(f"{product.title}: ${product.price}")
            ... else:
            ...     print("Product not found")
        """
        return self.search.search_by_barcode(upc)

    def get_shopping_list(self) -> List[ListItem]:
        """Get current shopping list items."""
        return self.shopping_list.get()

    def get_favorites(self) -> List[ListItem]:
        """Get current favorites list items."""
        return self.shopping_list.get_favorites()

    def add_to_shopping_list(
        self, item: Union[str, MeijerItem], quantity: int = 1
    ) -> bool:
        """
        Add item to shopping list.

        Args:
            item: Item to add (string description or MeijerItem)
            quantity: Quantity to add

        Returns:
            True if successful, False otherwise
        """
        if isinstance(item, str):
            return self.shopping_list.add(item, quantity)
        else:
            return self.shopping_list.add_item_with_details(
                item.upc, quantity, item.title
            )

    def add_to_favorites(self, item: Union[str, MeijerItem]) -> bool:
        """
        Add item to favorites list.

        Args:
            item: Item to add (string description or MeijerItem)

        Returns:
            True if successful, False otherwise
        """
        if isinstance(item, str):
            return self.shopping_list.add_favorite(item)
        else:
            return self.shopping_list.add_favorite(item.title, item.upc)

    def remove_from_shopping_list(self, item_id: int) -> bool:
        """
        Remove item from shopping list.

        Args:
            item_id: ID of item to remove

        Returns:
            True if successful, False otherwise
        """
        return self.shopping_list.delete_item(item_id)

    def remove_from_favorites(self, item_id: int) -> bool:
        """
        Remove item from favorites list.

        Args:
            item_id: ID of item to remove

        Returns:
            True if successful, False otherwise
        """
        return self.shopping_list.delete_favorite(item_id)

    def complete_shopping_list_item(self, item_id: int) -> bool:
        """
        Mark shopping list item as complete.

        Args:
            item_id: ID of item to mark complete

        Returns:
            True if successful, False otherwise
        """
        return self.shopping_list.complete_item(item_id)

    def clip_coupon(self, coupon_id: int) -> bool:
        """
        Clip a coupon.

        Args:
            coupon_id: ID of coupon to clip

        Returns:
            True if successful, False otherwise
        """
        return self.coupons.clip_coupon(coupon_id)

    def unclip_coupon(self, coupon_id: int) -> bool:
        """
        Unclip a coupon.

        Args:
            coupon_id: ID of coupon to unclip

        Returns:
            True if successful, False otherwise
        """
        return self.coupons.unclip_coupon(coupon_id)

    def save_tokens(self):
        """Save current tokens to config file."""
        tokens = self.token_storage.get_valid_tokens()
        if not tokens:
            self.logger.warning("No tokens to save")
            return

        try:
            config_path = Path.home() / ".config" / "meijer.txt"
            config_path.parent.mkdir(parents=True, exist_ok=True)

            config = {
                "access_token": tokens.access_token,
                "refresh_token": tokens.refresh_token,
                "expires_in": tokens.expires_in,
                "token_type": tokens.token_type,
                "updated_at": datetime.now().isoformat(),
            }

            with open(config_path, "w") as f:
                json.dump(config, f, indent=2)

            self.logger.info("Tokens saved to config file")

        except Exception as e:
            self.logger.error(f"Failed to save tokens: {e}")

    def is_authenticated(self) -> bool:
        """Check if client is authenticated."""
        return self.token_storage.get_valid_tokens() is not None

    @property
    def auth_status(self):
        """Get current authentication status."""
        from .enums import AuthenticationStatus

        tokens = self.token_storage.get_valid_tokens()
        if not tokens:
            return AuthenticationStatus.UNAUTHENTICATED

        # Check if token is expired
        if tokens.expires_in and datetime.now() > datetime.now() + timedelta(
            seconds=tokens.expires_in - 60
        ):
            return AuthenticationStatus.EXPIRED

        return AuthenticationStatus.AUTHENTICATED

    @property
    def user_id(self) -> str:
        """Get the current user ID."""
        try:
            account_details = self.settings.get_account_details()
            if account_details and account_details.get("accountId"):
                return str(account_details["accountId"])

            # Fallback to account ID from token
            return str(self._get_account_id())
        except Exception as e:
            self.logger.warning(f"Could not determine user ID: {e}")
            return "unknown"

    @property
    def home_store_id(self) -> str:
        """Get the home store ID."""
        try:
            account_details = self.settings.get_account_details()
            if account_details and account_details.get("homeStoreId"):
                return str(account_details["homeStoreId"])

            # Fallback to default store
            return "217"
        except Exception as e:
            self.logger.warning(f"Could not determine home store ID: {e}")
            return "217"

    # mPerks convenience methods
    def get_earned_rewards(self, **kwargs) -> List[EarnedReward]:
        """
        Get earned rewards from mPerks.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of EarnedReward objects
        """
        return self.mperks.get_earned_rewards(**kwargs)

    def get_mcard_info(self, **kwargs) -> MCardInfo:
        """
        Get mCard information from mPerks.

        Args:
            **kwargs: Additional query parameters

        Returns:
            MCardInfo object
        """
        return self.mperks.get_mcard_info(**kwargs)

    def get_available_rewards(self, **kwargs) -> List[EarnedReward]:
        """
        Get available rewards that can be earned.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of EarnedReward objects
        """
        return self.mperks.get_available_rewards(**kwargs)

    def get_reward_categories(
        self, clip_filter: str = "unclippedonly", **kwargs
    ) -> List[str]:
        """
        Get available reward categories.

        Args:
            clip_filter: Filter for clipped/unclipped offers ("clippedonly", "unclippedonly")
            **kwargs: Additional query parameters

        Returns:
            List of category names
        """
        return self.mperks.get_reward_categories(clip_filter, **kwargs)

    def get_earn_offers(self, **kwargs) -> EarnTabData:
        """
        Get all earn offers data including in-progress, available, and all offers.

        Args:
            **kwargs: Additional query parameters

        Returns:
            EarnTabData object containing all earn tab information
        """
        return self.mperks.get_earn_offers(**kwargs)

    def get_earn_offers_in_progress(self, **kwargs) -> List[EarnableOffer]:
        """
        Get only in-progress earn offers.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of EarnableOffer objects that are in progress
        """
        return self.mperks.get_earn_offers_in_progress(**kwargs)

    def get_earn_offers_available(self, **kwargs) -> List[EarnableOffer]:
        """
        Get only available earn offers.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of EarnableOffer objects that are available
        """
        return self.mperks.get_earn_offers_available(**kwargs)

    def get_earn_offers_all(self, **kwargs) -> List[EarnableOffer]:
        """
        Get only available earn offers.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of all EarnableOffer objects
        """
        return self.mperks.get_earn_offers_all(**kwargs)

    def feedback(self, feedback_type: str, **kwargs) -> Dict[str, Any]:
        """
        Convenience method for submitting feedback of any type.

        This method provides a simple interface to submit feedback without needing
        to manually create device data or call specific feedback methods.

        Parameters
        ----------
        feedback_type : str
            Type of feedback: "app", "shop_scan", "store", or "general"
        **kwargs : Dict[str, Any]
            Feedback parameters. See MeijerFeedback.submit_feedback_generic() for details.

        Returns
        -------
        Dict[str, Any]
            Response from the feedback API

        Examples
        --------
        # Submit app feedback
        result = meijer.feedback("app", feedback_text="Great app!", rating=9)

        # Submit store feedback
        result = meijer.feedback("store", store_name="North Muskegon",
                                store_comment="Best store ever!", rating=10)

        # Submit shop & scan feedback
        result = meijer.feedback("shop_scan", feedback_text="Worked perfectly",
                                store_name="Grand Rapids", rating=8)
        """
        # Create default device data if not provided
        if "device_data" not in kwargs:
            kwargs["device_data"] = self.feedback.create_default_device_data()

        # Submit feedback using the generic method
        return self.feedback.submit_feedback_generic(feedback_type, **kwargs)

    def _get_account_id(self) -> int:
        """
        Get the current account ID.

        This method extracts the account ID from the authentication token
        or returns a default value if not available.

        Returns:
            int: Account ID
        """
        try:
            # Try to get account ID from account details first
            account_details = self.settings.get_account_details()
            if account_details and account_details.get("accountId"):
                return int(account_details["accountId"])

            # Fallback: try to extract from token if it's a JWT
            tokens = self.token_storage.get_valid_tokens()
            if tokens and tokens.access_token and "." in tokens.access_token:
                try:
                    import jwt

                    payload = jwt.decode(
                        tokens.access_token, options={"verify_signature": False}
                    )
                    if payload.get("sub"):
                        return int(payload["sub"])
                except (ImportError, Exception):
                    pass

            # Final fallback: return default from log analysis
            return 13266596

        except Exception as e:
            self.logger.warning(f"Could not determine account ID: {e}")
            return 13266596

    def get_product_detail(
        self, upc: str, store_id: Optional[str] = None
    ) -> Optional[MeijerItem]:
        """Get detailed product information by UPC using the product operations module."""
        return self.product_ops.get_product_detail(upc, store_id)

    def _parse_product_detail_response(
        self, data: Dict[str, Any], upc: str
    ) -> MeijerItem:
        """Parse product detail response using the product operations module."""
        return self.product_ops._parse_product_detail_response(data, upc)

    def _extract_location_from_product_detail(
        self, data: Dict[str, Any]
    ) -> Optional[Dict[str, str]]:
        """Extract aisle location information using the product operations module."""
        return self.product_ops._extract_location_from_product_detail(data)

    def _parse_ilc_location(self, ilc_string: str) -> Optional[Dict[str, str]]:
        """Parse ILC location using the product operations module."""
        return self.product_ops._parse_ilc_location(ilc_string)

    def _format_location_string(
        self, aisle: Optional[str], section: Optional[str], bay: Optional[str]
    ) -> str:
        """Format location string using the product operations module."""
        return self.product_ops._format_location_string(aisle, section, bay)

    def _extract_location_from_text(self, text: str) -> Optional[Dict[str, str]]:
        """
        Extract location information from text using regex patterns.

        Args:
            text: Text to search for location patterns

        Returns:
            Dictionary with location information or None
        """
        import re

        # Pattern for "B16 Section 23" (direct format)
        pattern1 = r"([A-Z])(\d+)\s+Section\s+(\d+)"
        match1 = re.search(pattern1, text, re.IGNORECASE)
        if match1:
            aisle_letter = match1.group(1)  # "B"
            section_num = match1.group(2)  # "16"
            bay_num = match1.group(3)  # "23"

            # Combine aisle letter and section number for the aisle field
            combined_aisle = f"{aisle_letter}{section_num}"

            return {
                "aisle": combined_aisle,  # "B16"
                "section": bay_num,  # "23" (the bay number)
                "bay": bay_num,  # "23" (for backward compatibility)
                "formatted_location": f"{combined_aisle} Section {bay_num}",
            }

        # Pattern for "Aisle B | 16 Section: 35" (API format)
        pattern2 = r"Aisle\s+([A-Z0-9]+)\s*\|\s*(\d+)\s*Section:\s*(\d+)"
        match2 = re.search(pattern2, text, re.IGNORECASE)
        if match2:
            aisle_letter = match2.group(1)  # "B"
            section_num = match2.group(2)  # "16"
            bay_num = match2.group(3)  # "35"

            # Combine aisle letter and section number for the aisle field
            combined_aisle = f"{aisle_letter}{section_num}"

            return {
                "aisle": combined_aisle,  # "B16"
                "section": bay_num,  # "35" (the bay number)
                "bay": bay_num,  # "35" (for backward compatibility)
                "formatted_location": f"{combined_aisle} Section {bay_num}",
            }

        # Pattern for "B | 16 Section: 35" (alternative API format)
        pattern3 = r"([A-Z0-9]+)\s*\|\s*(\d+)\s*Section:\s*(\d+)"
        match3 = re.search(pattern3, text, re.IGNORECASE)
        if match3:
            aisle_letter = match3.group(1)  # "B"
            section_num = match3.group(2)  # "16"
            bay_num = match3.group(3)  # "35"

            # Combine aisle letter and section number for the aisle field
            combined_aisle = f"{aisle_letter}{section_num}"

            return {
                "aisle": combined_aisle,  # "B16"
                "section": bay_num,  # "35" (the bay number)
                "bay": bay_num,  # "35" (for backward compatibility)
                "formatted_location": f"{combined_aisle} Section {bay_num}",
            }

        # Pattern for "Aisle B | Section 16" (simplified format)
        pattern4 = r"Aisle\s+([A-Z0-9]+)\s*\|\s*Section\s+(\d+)"
        match4 = re.search(pattern4, text, re.IGNORECASE)
        if match4:
            aisle_letter = match4.group(1)  # "B"
            section_num = match4.group(2)  # "16"

            # Combine aisle letter and section number
            combined_aisle = f"{aisle_letter}{section_num}"

            return {
                "aisle": combined_aisle,  # "B16"
                "section": section_num,  # "16"
                "formatted_location": f"{combined_aisle} Section {section_num}",
            }

        # Pattern for just "Aisle B" (basic format)
        pattern5 = r"Aisle\s+([A-Z0-9]+)"
        match5 = re.search(pattern5, text, re.IGNORECASE)
        if match5:
            aisle_letter = match5.group(1)  # "B"
            return {
                "aisle": aisle_letter,  # "B"
                "formatted_location": f"Aisle {aisle_letter}",
            }

        return None

    def configure_proxy(self, proxy_host: str, proxy_port: int = 8080):
        """
        Configure proxy settings for the client.
        
        Args:
            proxy_host: Proxy host (e.g., "127.0.0.1")
            proxy_port: Proxy port (default: 8080)
        """
        self.proxy_host = proxy_host
        self.proxy_port = proxy_port
        
        if self.proxy_host and self.proxy_port:
            # Configure proxy for the session
            self.session.proxies = {
                'http': f'http://{self.proxy_host}:{self.proxy_port}',
                'https': f'http://{self.proxy_host}:{self.proxy_port}'
            }
            self.logger.info(f"🔒 Proxy configured: {self.proxy_host}:{self.proxy_port}")
        else:
            # Remove proxy configuration
            self.session.proxies = {}
            self.logger.info("🔒 Proxy configuration removed")

    def _detect_mitmproxy(self) -> bool:
        """
        Detect if mitmproxy is running and configure proxy settings.
        
        Returns:
            bool: True if mitmproxy is detected and configured
        """
        import subprocess
        import socket
        
        try:
            # Check if port 8080 is open (common mitmproxy port)
            sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
            sock.settimeout(1)
            result = sock.connect_ex(('127.0.0.1', 8080))
            sock.close()
            
            if result == 0:
                self.logger.info("🔍 Detected mitmproxy running on 127.0.0.1:8080")
                self.proxy_host = "127.0.0.1"
                self.proxy_port = 8080
                
                # Configure proxy for requests
                self.session.proxies = {
                    'http': f'http://{self.proxy_host}:{self.proxy_port}',
                    'https': f'http://{self.proxy_host}:{self.proxy_port}'
                }
                
                self.logger.info("🔒 Proxy configured for requests session")
                return True
            else:
                self.logger.debug("🔍 No mitmproxy detected on 127.0.0.1:8080")
                return False
                
        except Exception as e:
            self.logger.debug(f"🔍 Error detecting mitmproxy: {e}")
            return False

    def _setup_session_headers(self):
        """Setup session headers for API requests."""
        # This method is intentionally empty for now
        # Headers are set in the constructor and updated as needed
        pass
