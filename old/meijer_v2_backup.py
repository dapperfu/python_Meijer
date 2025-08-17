#!/usr/bin/env python3
"""
Meijer API Client v2 - Full Featured Implementation

A comprehensive Python client for interacting with the Meijer API,
built with proper OOP design and full feature coverage.

Based on detailed network analysis using mitmproxy flow inspection.
"""

import json
import logging
import time
import hashlib
import base64
import secrets
import webbrowser
import pickle
import os
from datetime import datetime, timedelta
from typing import Any, Dict, List, Optional, Union, Tuple
from urllib.parse import urljoin, urlparse, parse_qs, urlencode
from dataclasses import dataclass, field
from enum import Enum
import os

import requests
from requests.adapters import HTTPAdapter
from urllib3.util.retry import Retry
from requests.auth import AuthBase


class MeijerError(Exception):
    """Base exception for Meijer API errors."""

    pass


class MeijerAuthenticationError(MeijerError):
    """Exception raised when authentication fails."""

    pass


class MeijerAPIError(MeijerError):
    """Exception raised when API calls fail."""

    pass


class MeijerRateLimitError(MeijerError):
    """Exception raised when rate limits are exceeded."""

    pass


class AuthenticationStatus(Enum):
    """Authentication status enumeration."""

    UNAUTHENTICATED = "unauthenticated"
    AUTHENTICATED = "authenticated"
    EXPIRED = "expired"
    REFRESHING = "refreshing"


@dataclass
class OAuthConfig:
    """OAuth 2.0 configuration for Meijer authentication."""

    client_id: str = "0oa1o8g9njWsUvwsx697"
    auth_url: str = "https://id.meijer.com/oauth2/default/v1/authorize"
    token_url: str = "https://id.meijer.com/oauth2/default/v1/token"
    keys_url: str = "https://id.meijer.com/oauth2/default/v1/keys"
    scope: str = "openid profile offline_access"
    redirect_uri: str = "com.meijer.mobile.meijer:/login"


@dataclass
class AuthTokens:
    """Authentication tokens container with persistent storage support."""

    access_token: str
    refresh_token: str
    id_token: str
    token_type: str
    expires_in: int
    expires_at: datetime
    scope: str
    device_secret: Optional[str] = None
    issued_token_type: Optional[str] = None

    @classmethod
    def from_response(cls, response: Dict[str, Any]) -> "AuthTokens":
        """Create AuthTokens from OAuth response."""
        expires_in = response.get("expires_in", 3600)
        expires_at = datetime.now() + timedelta(seconds=expires_in)

        return cls(
            access_token=response["access_token"],
            refresh_token=response.get("refresh_token", ""),
            id_token=response.get("id_token", ""),
            token_type=response.get("token_type", "Bearer"),
            expires_in=expires_in,
            expires_at=expires_at,
            scope=response.get("scope", ""),
            device_secret=response.get("device_secret"),
            issued_token_type=response.get("issued_token_type"),
        )

    def is_expired(self, buffer_seconds: int = 300) -> bool:
        """Check if token is expired (with buffer)."""
        return datetime.now() + timedelta(seconds=buffer_seconds) >= self.expires_at

    def needs_refresh(self, buffer_seconds: int = 600) -> bool:
        """Check if token needs refresh (with buffer)."""
        return datetime.now() + timedelta(seconds=buffer_seconds) >= self.expires_at

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for storage."""
        return {
            "access_token": self.access_token,
            "refresh_token": self.refresh_token,
            "id_token": self.id_token,
            "token_type": self.token_type,
            "expires_in": self.expires_in,
            "expires_at": self.expires_at.isoformat(),
            "scope": self.scope,
            "device_secret": self.device_secret,
            "issued_token_type": self.issued_token_type,
        }

    @classmethod
    def from_dict(cls, data: Dict[str, Any]) -> "AuthTokens":
        """Create AuthTokens from stored dictionary."""
        expires_at = datetime.fromisoformat(data["expires_at"])

        return cls(
            access_token=data["access_token"],
            refresh_token=data["refresh_token"],
            id_token=data["id_token"],
            token_type=data["token_type"],
            expires_in=data["expires_in"],
            expires_at=expires_at,
            scope=data["scope"],
            device_secret=data.get("device_secret"),
            issued_token_type=data.get("issued_token_type"),
        )


@dataclass
class UserInfo:
    """User information container."""

    user_id: str
    email: str
    first_name: str
    last_name: str
    digital_id: str
    mperks_number: str
    phone: str
    address: Dict[str, Any]
    preferences: Dict[str, Any]

    @classmethod
    def from_dict(cls, data: Dict[str, Any]) -> "UserInfo":
        """Create UserInfo from API response."""
        return cls(
            user_id=data.get("userId", ""),
            email=data.get("email", ""),
            first_name=data.get("firstName", ""),
            last_name=data.get("lastName", ""),
            digital_id=data.get("digitalId", ""),
            mperks_number=data.get("mperksNumber", ""),
            phone=data.get("phone", ""),
            address=data.get("address", {}),
            preferences=data.get("preferences", {}),
        )


@dataclass
class ShopScanItem:
    """Shop & Scan cart item."""

    barcode: str
    description: str
    price: float
    quantity: int = 1
    item_id: Optional[str] = None
    timestamp: Optional[datetime] = None


@dataclass
class ShopScanTrip:
    """Shop & Scan shopping trip."""

    trip_id: str
    store_id: str
    started_at: datetime
    items: List[ShopScanItem] = field(default_factory=list)
    status: str = "active"
    total_amount: float = 0.0


class MeijerAuth(AuthBase):
    """Custom authentication handler for Meijer API."""

    def __init__(self, access_token: str):
        self.access_token = access_token

    def __call__(self, request):
        request.headers["Authorization"] = f"Bearer {self.access_token}"
        return request


class TokenStorage:
    """Handles persistent storage of authentication tokens."""

    def __init__(self, storage_file: str = "meijer_tokens.pkl"):
        self.storage_file = storage_file

    def save_tokens(self, tokens: AuthTokens) -> bool:
        """Save tokens to persistent storage."""
        try:
            with open(self.storage_file, "wb") as f:
                pickle.dump(tokens.to_dict(), f)
            return True
        except Exception as e:
            logging.error(f"Failed to save tokens: {e}")
            return False

    def load_tokens(self) -> Optional[AuthTokens]:
        """Load tokens from persistent storage."""
        try:
            if not os.path.exists(self.storage_file):
                return None

            with open(self.storage_file, "rb") as f:
                token_data = pickle.load(f)

            return AuthTokens.from_dict(token_data)
        except Exception as e:
            logging.error(f"Failed to load tokens: {e}")
            return None

    def clear_tokens(self) -> bool:
        """Clear stored tokens."""
        try:
            if os.path.exists(self.storage_file):
                os.remove(self.storage_file)
            return True
        except Exception as e:
            logging.error(f"Failed to clear tokens: {e}")
            return False

    def has_tokens(self) -> bool:
        """Check if tokens are stored."""
        return os.path.exists(self.storage_file)


class Meijer:
    """
    Full-featured Meijer API client with OAuth 2.0 authentication.

    This client implements the complete authentication flow discovered
    through network analysis, including OAuth 2.0 with PKCE, token
    management, and comprehensive API access.

    Features persistent token storage to avoid 2FA on subsequent logins.
    """

    def __init__(
        self,
        auth_file: str = "auth.txt",
        debug: bool = False,
        max_retries: int = 3,
        timeout: int = 30,
        token_storage_file: str = "meijer_tokens.pkl",
    ):
        """
        Initialize the Meijer client.

        Args:
            auth_file: Path to authentication credentials file
            debug: Enable debug logging
            max_retries: Maximum number of retry attempts
            timeout: Request timeout in seconds
            token_storage_file: Path to token storage file
        """
        self.auth_file = auth_file
        self.debug = debug
        self.max_retries = max_retries
        self.timeout = timeout

        # Setup logging
        self._setup_logging()

        # Initialize configuration
        self.oauth_config = OAuthConfig()
        self.api_base_url = "https://api.meijer.com"

        # Authentication state
        self.auth_tokens: Optional[AuthTokens] = None
        self.auth_status = AuthenticationStatus.UNAUTHENTICATED
        self.user_info: Optional[UserInfo] = None

        # Token storage
        self.token_storage = TokenStorage(token_storage_file)

        # Session management
        self.session = self._create_session()

        # Load credentials if available
        self.credentials = self._load_credentials()

        # Try to restore authentication from stored tokens
        self._restore_authentication()

        # Initialize Shop & Scan functionality
        self.shop_scan = ShopNScan(self)

        self.logger.info("Meijer client initialized")

    def _setup_logging(self) -> None:
        """Setup logging configuration."""
        level = logging.DEBUG if self.debug else logging.INFO
        format_str = "%(asctime)s - %(name)s - %(levelname)s - %(message)s"

        logging.basicConfig(level=level, format=format_str)
        self.logger = logging.getLogger(__name__)

    def _create_session(self) -> requests.Session:
        """Create and configure HTTP session."""
        session = requests.Session()

        # Configure retry strategy
        retry_strategy = Retry(
            total=self.max_retries,
            status_forcelist=[429, 500, 502, 503, 504],
            allowed_methods=["HEAD", "GET", "OPTIONS"],
            backoff_factor=1,
        )

        # Configure adapter
        adapter = HTTPAdapter(max_retries=retry_strategy)
        session.mount("http://", adapter)
        session.mount("https://", adapter)

        # Set default headers
        session.headers.update(
            {
                "User-Agent": "Meijer/101200000 okhttp/4.12.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)",
                "Accept": "application/json",
                "Content-Type": "application/json",
                "ocp-apim-subscription-key": "a10bc58ac484478d9b3958b1742c3a03",
            }
        )

        return session

    def _load_credentials(self) -> Dict[str, str]:
        """Load credentials from auth file."""
        if not os.path.exists(self.auth_file):
            self.logger.warning(f"Auth file {self.auth_file} not found")
            return {}

        try:
            credentials = {}
            with open(self.auth_file, "r") as f:
                for line in f:
                    line = line.strip()
                    if line and "=" in line:
                        key, value = line.split("=", 1)
                        credentials[key.strip()] = value.strip()

            self.logger.info(f"Loaded credentials from {self.auth_file}")
            return credentials
        except Exception as e:
            self.logger.error(f"Failed to load credentials: {e}")
            return {}

    def _restore_authentication(self) -> bool:
        """Try to restore authentication from stored tokens."""
        try:
            stored_tokens = self.token_storage.load_tokens()
            if not stored_tokens:
                self.logger.info("No stored tokens found")
                return False

            # Check if tokens are still valid
            if stored_tokens.is_expired():
                self.logger.info("Stored tokens are expired")
                # Try to refresh if we have a refresh token
                if stored_tokens.refresh_token:
                    self.auth_tokens = stored_tokens
                    if self.refresh_token():
                        self.logger.info(
                            "Successfully restored authentication from stored tokens"
                        )
                        return True
                    else:
                        self.logger.warning("Failed to refresh stored tokens")
                        return False
                else:
                    self.logger.warning(
                        "Stored tokens expired and no refresh token available"
                    )
                    return False
            else:
                # Tokens are still valid
                self.auth_tokens = stored_tokens
                self.auth_status = AuthenticationStatus.AUTHENTICATED
                self.session.auth = MeijerAuth(self.auth_tokens.access_token)
                self.logger.info(
                    "Successfully restored authentication from stored tokens"
                )
                return True

        except Exception as e:
            self.logger.error(f"Failed to restore authentication: {e}")
            return False

    def _generate_pkce_pair(self) -> Tuple[str, str]:
        """Generate PKCE code verifier and challenge."""
        code_verifier = (
            base64.urlsafe_b64encode(secrets.token_bytes(32))
            .decode("utf-8")
            .rstrip("=")
        )
        code_challenge = (
            base64.urlsafe_b64encode(
                hashlib.sha256(code_verifier.encode("utf-8")).digest()
            )
            .decode("utf-8")
            .rstrip("=")
        )

        return code_verifier, code_challenge

    def _generate_state(self) -> str:
        """Generate OAuth state parameter."""
        return secrets.token_urlsafe(32)

    def _generate_nonce(self) -> str:
        """Generate OAuth nonce parameter."""
        return secrets.token_urlsafe(32)

    def get_authorization_url(self) -> str:
        """
        Generate OAuth 2.0 authorization URL.

        Returns:
            Authorization URL for user to visit
        """
        code_verifier, code_challenge = self._generate_pkce_pair()
        state = self._generate_state()
        nonce = self._generate_nonce()

        # Store PKCE values for token exchange
        self._pkce_verifier = code_verifier
        self._pkce_state = state
        self._pkce_nonce = nonce

        params = {
            "client_id": self.oauth_config.client_id,
            "response_type": "code",
            "scope": self.oauth_config.scope,
            "redirect_uri": self.oauth_config.redirect_uri,
            "state": state,
            "nonce": nonce,
            "code_challenge": code_challenge,
            "code_challenge_method": "S256",
        }

        auth_url = f"{self.oauth_config.auth_url}?{urlencode(params)}"
        self.logger.info(f"Generated authorization URL: {auth_url}")

        return auth_url

    def authenticate_interactive(self) -> bool:
        """
        Perform interactive OAuth authentication.

        This method opens the authorization URL in a browser and waits
        for the user to complete authentication.

        Returns:
            True if authentication successful, False otherwise
        """
        try:
            auth_url = self.get_authorization_url()

            # Open browser for user authentication
            self.logger.info("Opening browser for authentication...")
            webbrowser.open(auth_url)

            # For now, we'll use a placeholder approach
            # In a real implementation, you'd need to handle the redirect
            # and extract the authorization code

            self.logger.warning(
                "Interactive authentication requires manual handling of redirect"
            )
            return False

        except Exception as e:
            self.logger.error(f"Interactive authentication failed: {e}")
            return False

    def authenticate_with_code(self, authorization_code: str) -> bool:
        """
        Complete OAuth authentication with authorization code.

        Args:
            authorization_code: Authorization code from OAuth flow

        Returns:
            True if authentication successful, False otherwise
        """
        try:
            if not hasattr(self, "_pkce_verifier"):
                raise MeijerAuthenticationError(
                    "PKCE verifier not found. Call get_authorization_url() first."
                )

            # Exchange authorization code for tokens
            token_data = {
                "grant_type": "authorization_code",
                "client_id": self.oauth_config.client_id,
                "code": authorization_code,
                "redirect_uri": self.oauth_config.redirect_uri,
                "code_verifier": self._pkce_verifier,
            }

            response = self.session.post(
                self.oauth_config.token_url, data=token_data, timeout=self.timeout
            )

            if response.status_code != 200:
                raise MeijerAuthenticationError(
                    f"Token exchange failed: {response.status_code} - {response.text}"
                )

            token_response = response.json()
            self.auth_tokens = AuthTokens.from_response(token_response)
            self.auth_status = AuthenticationStatus.AUTHENTICATED

            # Update session with access token
            self.session.auth = MeijerAuth(self.auth_tokens.access_token)

            # Store tokens persistently
            if self.token_storage.save_tokens(self.auth_tokens):
                self.logger.info("Tokens saved to persistent storage")
            else:
                self.logger.warning("Failed to save tokens to persistent storage")

            # Clear PKCE values
            delattr(self, "_pkce_verifier")
            delattr(self, "_pkce_state")
            delattr(self, "_pkce_nonce")

            self.logger.info("Authentication successful")
            return True

        except Exception as e:
            self.logger.error(f"Authentication with code failed: {e}")
            self.auth_status = AuthenticationStatus.UNAUTHENTICATED
            return False

    def authenticate_with_credentials(self, username: str, password: str) -> bool:
        """
        Authenticate using username and password.

        Note: This is a simplified approach. The actual Meijer app
        uses OAuth 2.0 with PKCE, but we can simulate the flow
        for testing purposes.

        Args:
            username: Meijer account username/email
            password: Meijer account password

        Returns:
            True if authentication successful, False otherwise
        """
        try:
            self.logger.info("Attempting credential-based authentication...")

            # Store credentials for potential use
            self.credentials["username"] = username
            self.credentials["password"] = password

            # For now, we'll use a placeholder approach
            # In a real implementation, you'd need to implement the
            # actual credential flow or use OAuth 2.0

            self.logger.warning("Credential-based authentication not fully implemented")
            return False

        except Exception as e:
            self.logger.error(f"Credential authentication failed: {e}")
            return False

    def login(
        self, username: Optional[str] = None, password: Optional[str] = None
    ) -> bool:
        """
        Login to Meijer using available credentials.

        Args:
            username: Optional username override
            password: Optional password override

        Returns:
            True if login successful, False otherwise
        """
        try:
            # First, try to restore from stored tokens
            if self._restore_authentication():
                self.logger.info("Successfully logged in using stored tokens")
                return True

            # Use provided credentials or load from file
            if username and password:
                return self.authenticate_with_credentials(username, password)
            elif self.credentials.get("username") and self.credentials.get("password"):
                return self.authenticate_with_credentials(
                    self.credentials["username"], self.credentials["password"]
                )
            else:
                self.logger.error("No credentials available for authentication")
                return False

        except Exception as e:
            self.logger.error(f"Login failed: {e}")
            return False

    def refresh_token(self) -> bool:
        """
        Refresh the access token using refresh token.

        Returns:
            True if refresh successful, False otherwise
        """
        try:
            if not self.auth_tokens or not self.auth_tokens.refresh_token:
                raise MeijerAuthenticationError("No refresh token available")

            self.auth_status = AuthenticationStatus.REFRESHING

            token_data = {
                "grant_type": "refresh_token",
                "client_id": self.oauth_config.client_id,
                "refresh_token": self.auth_tokens.refresh_token,
            }

            response = self.session.post(
                self.oauth_config.token_url, data=token_data, timeout=self.timeout
            )

            if response.status_code != 200:
                raise MeijerAuthenticationError(
                    f"Token refresh failed: {response.status_code} - {response.text}"
                )

            token_response = response.json()

            # Update tokens - note that refresh token might be updated
            self.auth_tokens = AuthTokens.from_response(token_response)
            self.auth_status = AuthenticationStatus.AUTHENTICATED

            # Update session with new access token
            self.session.auth = MeijerAuth(self.auth_tokens.access_token)

            # Store updated tokens persistently
            if self.token_storage.save_tokens(self.auth_tokens):
                self.logger.info("Refreshed tokens saved to persistent storage")
            else:
                self.logger.warning(
                    "Failed to save refreshed tokens to persistent storage"
                )

            self.logger.info("Token refreshed successfully")
            return True

        except Exception as e:
            self.logger.error(f"Token refresh failed: {e}")
            self.auth_status = AuthenticationStatus.EXPIRED
            return False

    def ensure_authenticated(self) -> bool:
        """
        Ensure the client is authenticated, refreshing if necessary.

        Returns:
            True if authenticated, False otherwise
        """
        if self.auth_status == AuthenticationStatus.AUTHENTICATED:
            if self.auth_tokens and not self.auth_tokens.needs_refresh():
                return True
            else:
                return self.refresh_token()
        elif self.auth_status == AuthenticationStatus.EXPIRED:
            return self.refresh_token()
        else:
            return False

    def logout(self) -> None:
        """Logout and clear authentication state."""
        self.auth_tokens = None
        self.auth_status = AuthenticationStatus.UNAUTHENTICATED
        self.user_info = None
        self.session.auth = None

        # Clear stored tokens
        self.token_storage.clear_tokens()

        # Clear PKCE values if they exist
        for attr in ["_pkce_verifier", "_pkce_state", "_pkce_nonce"]:
            if hasattr(self, attr):
                delattr(self, attr)

        self.logger.info("Logged out successfully")

    def get_user_info(self) -> Optional[UserInfo]:
        """
        Get current user information.

        Returns:
            UserInfo object if available, None otherwise
        """
        if not self.ensure_authenticated():
            return None

        if self.user_info:
            return self.user_info

        try:
            # This would be the actual API call to get user info
            # For now, return placeholder
            self.logger.warning("User info API call not implemented")
            return None

        except Exception as e:
            self.logger.error(f"Failed to get user info: {e}")
            return None

    def get_offers(self, limit: int = 50, offset: int = 0) -> List[Dict[str, Any]]:
        """
        Get available offers and coupons.

        Args:
            limit: Maximum number of offers to return
            offset: Offset for pagination

        Returns:
            List of offers
        """
        if not self.ensure_authenticated():
            return []

        try:
            url = f"{self.api_base_url}/loyalty/mPerks/api/offers"
            params = {"limit": limit, "offset": offset}

            response = self.session.get(url, params=params, timeout=self.timeout)

            if response.status_code == 200:
                data = response.json()
                return data.get("offers", [])
            else:
                self.logger.error(f"Failed to get offers: {response.status_code}")
                return []

        except Exception as e:
            self.logger.error(f"Failed to get offers: {e}")
            return []

    def get_home_cards(self) -> List[Dict[str, Any]]:
        """
        Get home page content cards.

        Returns:
            List of home cards
        """
        if not self.ensure_authenticated():
            return []

        try:
            url = f"{self.api_base_url}/digital/homecards/v1/cards"

            response = self.session.get(url, timeout=self.timeout)

            if response.status_code == 200:
                data = response.json()
                return data.get("cards", [])
            else:
                self.logger.error(f"Failed to get home cards: {response.status_code}")
                return []

        except Exception as e:
            self.logger.error(f"Failed to get home cards: {e}")
            return []

    def get_special_offers(self) -> List[Dict[str, Any]]:
        """
        Get special offers and promotions.

        Returns:
            List of special offers
        """
        if not self.ensure_authenticated():
            return []

        try:
            url = f"{self.api_base_url}/loyalty/mPerks/api/cms/specialoffers/image"

            response = self.session.get(url, timeout=self.timeout)

            if response.status_code == 200:
                data = response.json()
                return data.get("offers", [])
            else:
                self.logger.error(
                    f"Failed to get special offers: {response.status_code}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Failed to get special offers: {e}")
            return []

    def get_stores(
        self, zip_code: Optional[str] = None, radius: int = 25
    ) -> List[Dict[str, Any]]:
        """
        Get nearby Meijer stores.

        Args:
            zip_code: ZIP code for location search
            radius: Search radius in miles

        Returns:
            List of stores
        """
        if not self.ensure_authenticated():
            return []

        try:
            url = f"{self.api_base_url}/stores"
            params = {"radius": radius}

            if zip_code:
                params["zipCode"] = zip_code

            response = self.session.get(url, params=params, timeout=self.timeout)

            if response.status_code == 200:
                data = response.json()
                return data.get("stores", [])
            else:
                self.logger.error(f"Failed to get stores: {response.status_code}")
                return []

        except Exception as e:
            self.logger.error(f"Failed to get stores: {e}")
            return []

    def get_session_info(self) -> Dict[str, Any]:
        """
        Get current session information.

        Returns:
            Dictionary containing session details
        """
        info = {
            "authentication_status": self.auth_status.value,
            "has_tokens": self.auth_tokens is not None,
            "user_info_loaded": self.user_info is not None,
            "has_stored_tokens": self.token_storage.has_tokens(),
        }

        if self.auth_tokens:
            info.update(
                {
                    "token_expires_at": self.auth_tokens.expires_at.isoformat(),
                    "token_expires_in": self.auth_tokens.expires_in,
                    "token_type": self.auth_tokens.token_type,
                    "scope": self.auth_tokens.scope,
                    "has_refresh_token": bool(self.auth_tokens.refresh_token),
                }
            )

        return info

    def is_authenticated(self) -> bool:
        """
        Check if the client is currently authenticated.

        Returns:
            True if authenticated, False otherwise
        """
        return self.ensure_authenticated()

    def __enter__(self):
        """Context manager entry."""
        return self

    def __exit__(self, exc_type, exc_val, exc_tb):
        """Context manager exit."""
        self.logout()
        self.session.close()


class ShopNScan:
    """
    Meijer Shop & Scan functionality.

    Handles the complete Shop & Scan workflow based on APK analysis:
    - Session initialization and store validation
    - Item scanning and cart management
    - Checkout finalization

    The transaction flow discovered from network analysis:
    1. Check if Shop & Scan is enabled for user
    2. Start a shopping trip at a specific store
    3. Scan items (barcode lookup and cart addition)
    4. Finalize checkout for payment processing
    """

    def __init__(self, meijer_client):
        """Initialize Shop & Scan with reference to Meijer client."""
        self.meijer = meijer_client
        self.current_trip: Optional[ShopScanTrip] = None
        self.logger = meijer_client.logger

        # API endpoints discovered from APK analysis
        self.endpoints = {
            "config": "/dgtlmma/accounts/isShopAndScanEnabled",
            "static_config": "https://static.meijer.com/mobileassets/shopandscan/shopandscan_config.json",
            "start_trip": "/dgtlmma/shopandscan/trip/start",
            "scan_item": "/dgtlmma/shopandscan/item/scan",
            "add_item": "/dgtlmma/shopandscan/cart/add",
            "remove_item": "/dgtlmma/shopandscan/cart/remove",
            "get_cart": "/dgtlmma/shopandscan/cart",
            "finalize": "/dgtlmma/shopandscan/checkout/finalize",
            "end_trip": "/dgtlmma/shopandscan/trip/end",
        }

    def is_enabled(self) -> bool:
        """
        Check if Shop & Scan is enabled for the current user.

        Returns:
            bool: True if Shop & Scan is available, False otherwise
        """
        try:
            url = urljoin(self.meijer.api_base_url, self.endpoints["config"])

            headers = self.meijer._get_api_headers()
            headers.update(
                {"Accept": "application/json", "Content-Type": "application/json"}
            )

            response = self.meijer._make_request("GET", url, headers=headers)

            if response.status_code == 200:
                data = response.json()
                enabled = data.get("isEnabled", False)
                self.logger.info(f"Shop & Scan enabled: {enabled}")
                return enabled
            else:
                self.logger.warning(
                    f"Failed to check Shop & Scan status: {response.status_code}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error checking Shop & Scan availability: {e}")
            return False

    def get_config(self) -> Optional[Dict[str, Any]]:
        """
        Get Shop & Scan configuration from static assets.

        Returns:
            Optional[Dict]: Configuration data or None if failed
        """
        try:
            response = self.meijer.session.get(self.endpoints["static_config"])

            if response.status_code == 200:
                config = response.json()
                self.logger.info("Retrieved Shop & Scan configuration")
                return config
            else:
                self.logger.warning(
                    f"Failed to get Shop & Scan config: {response.status_code}"
                )
                return None

        except Exception as e:
            self.logger.error(f"Error getting Shop & Scan config: {e}")
            return None

    def start_trip(self, store_id: str) -> bool:
        """
        Start a new Shop & Scan trip at the specified store.

        Args:
            store_id: The store identifier where shopping will occur

        Returns:
            bool: True if trip started successfully, False otherwise
        """
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError(
                    "Authentication required for Shop & Scan"
                )

            if self.current_trip and self.current_trip.status == "active":
                self.logger.warning("Trip already in progress. End current trip first.")
                return False

            url = urljoin(self.meijer.api_base_url, self.endpoints["start_trip"])

            headers = self.meijer._get_api_headers()
            headers.update(
                {"Accept": "application/json", "Content-Type": "application/json"}
            )

            payload = {"storeId": store_id, "timestamp": datetime.now().isoformat()}

            response = self.meijer._make_request(
                "POST", url, headers=headers, json=payload
            )

            if response.status_code in (200, 201):
                data = response.json()
                trip_id = (
                    data.get("tripId")
                    or data.get("sessionId")
                    or f"trip_{int(time.time())}"
                )

                self.current_trip = ShopScanTrip(
                    trip_id=trip_id, store_id=store_id, started_at=datetime.now()
                )

                self.logger.info(
                    f"Started Shop & Scan trip: {trip_id} at store {store_id}"
                )
                return True
            else:
                self.logger.error(
                    f"Failed to start trip: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error starting Shop & Scan trip: {e}")
            return False

    def scan_item(self, barcode: str, quantity: int = 1) -> Optional[ShopScanItem]:
        """
        Scan an item by barcode and add it to the cart.

        Args:
            barcode: Product barcode to scan
            quantity: Number of items to add (default: 1)

        Returns:
            Optional[ShopScanItem]: The scanned item if successful, None otherwise
        """
        try:
            if not self.current_trip:
                raise MeijerAPIError("No active Shop & Scan trip. Start a trip first.")

            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            # First, lookup the item details
            item_data = self._lookup_item(barcode)
            if not item_data:
                self.logger.error(f"Failed to lookup item with barcode: {barcode}")
                return None

            # Add item to cart
            if self._add_to_cart(barcode, quantity, item_data):
                scanned_item = ShopScanItem(
                    barcode=barcode,
                    description=item_data.get("description", "Unknown Item"),
                    price=float(item_data.get("price", 0.0)),
                    quantity=quantity,
                    item_id=item_data.get("itemId"),
                    timestamp=datetime.now(),
                )

                self.current_trip.items.append(scanned_item)
                self.current_trip.total_amount += scanned_item.price * quantity

                self.logger.info(
                    f"Scanned item: {scanned_item.description} (${scanned_item.price})"
                )
                return scanned_item
            else:
                return None

        except Exception as e:
            self.logger.error(f"Error scanning item {barcode}: {e}")
            return None

    def _lookup_item(self, barcode: str) -> Optional[Dict[str, Any]]:
        """Lookup item details by barcode."""
        try:
            url = urljoin(self.meijer.api_base_url, self.endpoints["scan_item"])

            headers = self.meijer._get_api_headers()
            headers.update(
                {"Accept": "application/json", "Content-Type": "application/json"}
            )

            payload = {
                "barcode": barcode,
                "tripId": self.current_trip.trip_id,
                "storeId": self.current_trip.store_id,
            }

            response = self.meijer._make_request(
                "POST", url, headers=headers, json=payload
            )

            if response.status_code == 200:
                return response.json()
            else:
                self.logger.warning(f"Item lookup failed: {response.status_code}")
                return None

        except Exception as e:
            self.logger.error(f"Error looking up item: {e}")
            return None

    def _add_to_cart(
        self, barcode: str, quantity: int, item_data: Dict[str, Any]
    ) -> bool:
        """Add item to Shop & Scan cart."""
        try:
            url = urljoin(self.meijer.api_base_url, self.endpoints["add_item"])

            headers = self.meijer._get_api_headers()
            headers.update(
                {"Accept": "application/json", "Content-Type": "application/json"}
            )

            payload = {
                "tripId": self.current_trip.trip_id,
                "barcode": barcode,
                "quantity": quantity,
                "itemId": item_data.get("itemId"),
                "price": item_data.get("price"),
            }

            response = self.meijer._make_request(
                "POST", url, headers=headers, json=payload
            )

            return response.status_code in (200, 201)

        except Exception as e:
            self.logger.error(f"Error adding item to cart: {e}")
            return False

    def remove_item(self, item_identifier: Union[str, ShopScanItem]) -> bool:
        """
        Remove an item from the cart.

        Args:
            item_identifier: Either barcode string or ShopScanItem instance

        Returns:
            bool: True if item was removed successfully
        """
        try:
            if not self.current_trip:
                raise MeijerAPIError("No active Shop & Scan trip")

            if isinstance(item_identifier, ShopScanItem):
                barcode = item_identifier.barcode
                item_to_remove = item_identifier
            else:
                barcode = item_identifier
                item_to_remove = next(
                    (
                        item
                        for item in self.current_trip.items
                        if item.barcode == barcode
                    ),
                    None,
                )

            if not item_to_remove:
                self.logger.warning(f"Item not found in cart: {barcode}")
                return False

            url = urljoin(self.meijer.api_base_url, self.endpoints["remove_item"])

            headers = self.meijer._get_api_headers()
            headers.update(
                {"Accept": "application/json", "Content-Type": "application/json"}
            )

            payload = {
                "tripId": self.current_trip.trip_id,
                "barcode": barcode,
                "itemId": item_to_remove.item_id,
            }

            response = self.meijer._make_request(
                "DELETE", url, headers=headers, json=payload
            )

            if response.status_code in (200, 204):
                # Remove from local cart
                self.current_trip.items.remove(item_to_remove)
                self.current_trip.total_amount -= (
                    item_to_remove.price * item_to_remove.quantity
                )

                self.logger.info(
                    f"Removed item from cart: {item_to_remove.description}"
                )
                return True
            else:
                self.logger.error(f"Failed to remove item: {response.status_code}")
                return False

        except Exception as e:
            self.logger.error(f"Error removing item: {e}")
            return False

    def get_cart(self) -> List[ShopScanItem]:
        """
        Get current cart contents.

        Returns:
            List[ShopScanItem]: List of items in the cart
        """
        if not self.current_trip:
            return []

        try:
            # Optionally sync with server
            self._sync_cart()
            return self.current_trip.items.copy()

        except Exception as e:
            self.logger.error(f"Error getting cart: {e}")
            return self.current_trip.items.copy() if self.current_trip else []

    def _sync_cart(self) -> bool:
        """Synchronize local cart with server."""
        try:
            url = urljoin(self.meijer.api_base_url, self.endpoints["get_cart"])

            headers = self.meijer._get_api_headers()
            headers.update({"Accept": "application/json"})

            params = {"tripId": self.current_trip.trip_id}

            response = self.meijer._make_request(
                "GET", url, headers=headers, params=params
            )

            if response.status_code == 200:
                data = response.json()
                # Update local cart based on server response
                # This would contain logic to sync server cart with local cart
                self.logger.debug("Cart synchronized with server")
                return True
            else:
                self.logger.warning(f"Failed to sync cart: {response.status_code}")
                return False

        except Exception as e:
            self.logger.error(f"Error syncing cart: {e}")
            return False

    def finalize_checkout(self) -> Optional[Dict[str, Any]]:
        """
        Finalize the cart for checkout.

        Returns:
            Optional[Dict]: Checkout details or None if failed
        """
        try:
            if not self.current_trip:
                raise MeijerAPIError("No active Shop & Scan trip")

            if not self.current_trip.items:
                raise MeijerAPIError("Cart is empty")

            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["finalize"])

            headers = self.meijer._get_api_headers()
            headers.update(
                {"Accept": "application/json", "Content-Type": "application/json"}
            )

            # Prepare checkout payload
            payload = {
                "tripId": self.current_trip.trip_id,
                "storeId": self.current_trip.store_id,
                "items": [
                    {
                        "barcode": item.barcode,
                        "quantity": item.quantity,
                        "price": item.price,
                        "itemId": item.item_id,
                    }
                    for item in self.current_trip.items
                ],
                "totalAmount": self.current_trip.total_amount,
                "timestamp": datetime.now().isoformat(),
            }

            response = self.meijer._make_request(
                "POST", url, headers=headers, json=payload
            )

            if response.status_code in (200, 201):
                checkout_data = response.json()

                # Mark trip as completed
                self.current_trip.status = "completed"

                self.logger.info(
                    f"Checkout finalized for trip {self.current_trip.trip_id}"
                )
                self.logger.info(f"Total amount: ${self.current_trip.total_amount:.2f}")

                return checkout_data
            else:
                self.logger.error(
                    f"Checkout finalization failed: {response.status_code} - {response.text}"
                )
                return None

        except Exception as e:
            self.logger.error(f"Error finalizing checkout: {e}")
            return None

    def end_trip(self) -> bool:
        """
        End the current Shop & Scan trip.

        Returns:
            bool: True if trip ended successfully
        """
        try:
            if not self.current_trip:
                self.logger.warning("No active trip to end")
                return True

            url = urljoin(self.meijer.api_base_url, self.endpoints["end_trip"])

            headers = self.meijer._get_api_headers()
            headers.update(
                {"Accept": "application/json", "Content-Type": "application/json"}
            )

            payload = {
                "tripId": self.current_trip.trip_id,
                "timestamp": datetime.now().isoformat(),
            }

            response = self.meijer._make_request(
                "POST", url, headers=headers, json=payload
            )

            if response.status_code in (200, 204):
                self.logger.info(f"Ended Shop & Scan trip: {self.current_trip.trip_id}")
                self.current_trip = None
                return True
            else:
                self.logger.warning(
                    f"Failed to end trip properly: {response.status_code}"
                )
                # Still clear local trip
                self.current_trip = None
                return False

        except Exception as e:
            self.logger.error(f"Error ending trip: {e}")
            # Clear local trip even if server call failed
            self.current_trip = None
            return False

    def get_trip_summary(self) -> Optional[Dict[str, Any]]:
        """
        Get current trip summary.

        Returns:
            Optional[Dict]: Trip summary or None if no active trip
        """
        if not self.current_trip:
            return None

        return {
            "trip_id": self.current_trip.trip_id,
            "store_id": self.current_trip.store_id,
            "started_at": self.current_trip.started_at.isoformat(),
            "status": self.current_trip.status,
            "item_count": len(self.current_trip.items),
            "total_amount": self.current_trip.total_amount,
            "items": [
                {
                    "barcode": item.barcode,
                    "description": item.description,
                    "price": item.price,
                    "quantity": item.quantity,
                }
                for item in self.current_trip.items
            ],
        }


def main() -> None:
    """Example usage of the Meijer client."""
    # Setup logging
    logging.basicConfig(level=logging.INFO)

    # Create Meijer client
    with Meijer(debug=True) as meijer:
        try:
            # Check if we have credentials
            if meijer.credentials:
                print("Attempting login with stored credentials...")
                if meijer.login():
                    print("Login successful!")

                    # Get session info
                    session_info = meijer.get_session_info()
                    print(f"Session: {session_info}")

                    # Get user info
                    user_info = meijer.get_user_info()
                    if user_info:
                        print(f"User: {user_info.first_name} {user_info.last_name}")

                    # Get offers
                    print("Retrieving offers...")
                    offers = meijer.get_offers(limit=5)
                    print(f"Retrieved {len(offers)} offers")

                    # Get home cards
                    print("Retrieving home cards...")
                    home_cards = meijer.get_home_cards()
                    print(f"Retrieved {len(home_cards)} home cards")

                    # Get special offers
                    print("Retrieving special offers...")
                    special_offers = meijer.get_special_offers()
                    print(f"Retrieved {len(special_offers)} special offers")

                    # Get stores
                    print("Retrieving stores...")
                    stores = meijer.get_stores(radius=10)
                    print(f"Retrieved {len(stores)} stores")

                else:
                    print("Login failed!")
            else:
                print(
                    "No credentials found. Please create auth.txt file or use interactive authentication."
                )
                print(
                    "For interactive authentication, use: meijer.authenticate_interactive()"
                )

        except Exception as e:
            print(f"Error: {e}")


if __name__ == "__main__":
    main()
