#!/usr/bin/env python3
"""
Meijer API Client - Authentication and API Integration

This module provides a secure client for interacting with the Meijer API
using OAuth 2.0 PKCE authentication flow.

IMPORTANT: Never hardcode tokens or credentials in this file.
Use environment variables or secure storage for sensitive information.
"""

import base64
import hashlib
import os
import secrets
import time
from dataclasses import dataclass
from typing import Any, Dict, Optional
from urllib.parse import urlencode

import requests


@dataclass
class MeijerAuthConfig:
    """Configuration for Meijer OAuth authentication."""

    # OAuth endpoints
    auth_url: str = "https://id.meijer.com/oauth2/default/v1/authorize"
    token_url: str = "https://id.meijer.com/oauth2/default/v1/token"

    # Client configuration
    client_id: str = "0oa1o8g9njWsUvwsx697"
    redirect_uri: str = "com.meijer.mobile.meijer://login"
    scopes: str = "openid profile offline_access"

    # API base URLs
    api_base: str = "https://api.meijer.com"
    digital_base: str = "https://digital.meijer.com"
    loyalty_base: str = "https://loyalty.meijer.com"
    
    def __post_init__(self):
        """Post-initialization to handle local development URLs."""
        # Check if we're using local endpoints
        if hasattr(self, '_local_base_url') and self._local_base_url:
            self._setup_local_endpoints(self._local_base_url)
    
    def _setup_local_endpoints(self, base_url: str):
        """Setup local endpoints for development/testing."""
        base_url = base_url.rstrip('/')
        self.auth_url = f"{base_url}/api/meijer/oauth2/default/v1/authorize"
        self.token_url = f"{base_url}/api/meijer/oauth2/default/v1/token"
        self.api_base = f"{base_url}/api/meijer"
        self.digital_base = f"{base_url}/api/meijer"
        self.loyalty_base = f"{base_url}/api/meijer"
    
    def set_local_base_url(self, base_url: str):
        """Set the base URL for local development."""
        self._local_base_url = base_url
        self._setup_local_endpoints(base_url)


@dataclass
class MeijerTokens:
    """Container for authentication tokens."""

    access_token: str
    refresh_token: str
    id_token: str
    expires_in: int
    token_type: str = "Bearer"
    expires_at: Optional[float] = None

    def __post_init__(self):
        if self.expires_at is None:
            self.expires_at = time.time() + self.expires_in

    def is_expired(self) -> bool:
        """Check if the access token is expired."""
        return time.time() >= self.expires_at

    def needs_refresh(self, buffer_seconds: int = 300) -> bool:
        """Check if token needs refresh (with buffer time)."""
        return time.time() >= (self.expires_at - buffer_seconds)


class MeijerAPIClient:
    """
    Secure client for Meijer API integration.

    This client implements OAuth 2.0 PKCE flow and provides methods
    for authenticated API requests.
    """

    def __init__(self, config: Optional[MeijerAuthConfig] = None):
        self.config = config or MeijerAuthConfig()
        self.tokens: Optional[MeijerTokens] = None
        self.session = requests.Session()

        # Set default headers to mimic mobile app
        self.session.headers.update(
            {
                "User-Agent": "Mozilla/5.0 (Linux; Android 10; One Build/QQ3A.200705.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/81.0.4044.138 Mobile Safari/537.36 (Mobile; afma-sdk-a-v251815999.244410000.1)",
                "Accept": "application/json",
                "Accept-Language": "en-US,en;q=0.9",
                "Accept-Encoding": "gzip, deflate",
            }
        )

    def generate_pkce_challenge(self) -> tuple[str, str]:
        """
        Generate PKCE code verifier and challenge.

        Returns:
            Tuple of (code_verifier, code_challenge)
        """
        # Generate random code verifier
        code_verifier = (
            base64.urlsafe_b64encode(secrets.token_bytes(32))
            .decode("utf-8")
            .rstrip("=")
        )

        # Generate SHA256 hash of code verifier
        code_challenge = (
            base64.urlsafe_b64encode(
                hashlib.sha256(code_verifier.encode("utf-8")).digest()
            )
            .decode("utf-8")
            .rstrip("=")
        )

        return code_verifier, code_challenge

    def get_authorization_url(self, state: Optional[str] = None) -> str:
        """
        Generate the OAuth authorization URL.

        Args:
            state: Optional state parameter for CSRF protection

        Returns:
            Authorization URL for user to visit
        """
        if state is None:
            state = secrets.token_urlsafe(32)

        code_verifier, code_challenge = self.generate_pkce_challenge()

        # Store code verifier for later use
        self._code_verifier = code_verifier
        self._state = state

        params = {
            "login_hint": "",
            "code_challenge": code_challenge,
            "code_challenge_method": "S256",
            "client_id": self.config.client_id,
            "scope": self.config.scopes,
            "redirect_uri": self.config.redirect_uri,
            "response_type": "code",
            "state": state,
            "nonce": secrets.token_urlsafe(32),
        }

        return f"{self.config.auth_url}?{urlencode(params)}"

    def exchange_code_for_tokens(self, authorization_code: str) -> MeijerTokens:
        """
        Exchange authorization code for access tokens.

        Args:
            authorization_code: Authorization code from OAuth callback

        Returns:
            MeijerTokens object containing all tokens

        Raises:
            ValueError: If code verifier is missing
            requests.RequestException: If token exchange fails
        """
        if not hasattr(self, "_code_verifier"):
            raise ValueError(
                "No code verifier found. Call get_authorization_url() first."
            )

        data = {
            "redirect_uri": self.config.redirect_uri,
            "code_verifier": self._code_verifier,
            "client_id": self.config.client_id,
            "grant_type": "authorization_code",
            "code": authorization_code,
        }

        response = self.session.post(self.config.token_url, data=data)
        response.raise_for_status()

        token_data = response.json()

        # Create tokens object
        self.tokens = MeijerTokens(
            access_token=token_data["access_token"],
            refresh_token=token_data["refresh_token"],
            id_token=token_data["id_token"],
            expires_in=token_data["expires_in"],
            token_type=token_data.get("token_type", "Bearer"),
        )

        # Clean up temporary data
        delattr(self, "_code_verifier")
        delattr(self, "_state")

        return self.tokens

    def refresh_access_token(self) -> MeijerTokens:
        """
        Refresh the access token using the refresh token.

        Returns:
            Updated MeijerTokens object

        Raises:
            ValueError: If no refresh token available
            requests.RequestException: If refresh fails
        """
        if not self.tokens or not self.tokens.refresh_token:
            raise ValueError("No refresh token available")

        data = {
            "grant_type": "refresh_token",
            "client_id": self.config.client_id,
            "refresh_token": self.tokens.refresh_token,
        }

        response = self.session.post(self.config.token_url, data=data)
        response.raise_for_status()

        token_data = response.json()

        # Update tokens
        self.tokens = MeijerTokens(
            access_token=token_data["access_token"],
            refresh_token=token_data.get("refresh_token", self.tokens.refresh_token),
            id_token=token_data.get("id_token", self.tokens.id_token),
            expires_in=token_data["expires_in"],
            token_type=token_data.get("token_type", "Bearer"),
        )

        return self.tokens

    def _ensure_valid_token(self) -> None:
        """Ensure we have a valid access token, refreshing if necessary."""
        if not self.tokens:
            raise ValueError("No tokens available. Authenticate first.")

        if self.tokens.needs_refresh():
            self.refresh_access_token()

    def _get_auth_header(self) -> Dict[str, str]:
        """Get the Authorization header for authenticated requests."""
        self._ensure_valid_token()
        return {"Authorization": f"{self.tokens.token_type} {self.tokens.access_token}"}

    def get_offers(self) -> Dict[str, Any]:
        """Get available mPerks offers."""
        self._ensure_valid_token()

        headers = self._get_auth_header()
        url = f"{self.config.loyalty_base}/mPerks/api/offers"

        response = self.session.get(url, headers=headers)
        response.raise_for_status()

        return response.json()

    def get_shopping_list(self) -> Dict[str, Any]:
        """Get user's shopping list."""
        self._ensure_valid_token()

        headers = self._get_auth_header()
        url = f"{self.config.loyalty_base}/shoppinglist/GetList"

        response = self.session.get(url, headers=headers)
        response.raise_for_status()

        return response.json()

    def get_home_cards(self) -> Dict[str, Any]:
        """Get home page content cards."""
        self._ensure_valid_token()

        headers = self._get_auth_header()
        url = f"{self.config.digital_base}/homecards/v1/cards"

        response = self.session.get(url, headers=headers)
        response.raise_for_status()

        return response.json()

    def get_departments(self) -> Dict[str, Any]:
        """Get shop by department navigation."""
        self._ensure_valid_token()

        headers = self._get_auth_header()
        url = f"{self.config.digital_base}/homecards/v1/cards/shopByDepartmentV2"

        response = self.session.get(url, headers=headers)
        response.raise_for_status()

        return response.json()

    def get_user_settings(self, user_id: str) -> Dict[str, Any]:
        """Get user mobile settings."""
        self._ensure_valid_token()

        headers = self._get_auth_header()
        url = f"{self.config.api_base}/s/settings/{user_id}/v1/mobile"

        response = self.session.get(url, headers=headers)
        response.raise_for_status()

        return response.json()


def load_tokens_from_env() -> Optional[MeijerTokens]:
    """
    Load tokens from environment variables.

    This is a secure way to load tokens without hardcoding them.

    Returns:
        MeijerTokens object if all required variables are set, None otherwise
    """
    access_token = os.getenv("MEIJER_ACCESS_TOKEN")
    refresh_token = os.getenv("MEIJER_REFRESH_TOKEN")
    id_token = os.getenv("MEIJER_ID_TOKEN")
    expires_in = os.getenv("MEIJER_EXPIRES_IN")

    if all([access_token, refresh_token, id_token, expires_in]):
        return MeijerTokens(
            access_token=access_token,
            refresh_token=refresh_token,
            id_token=id_token,
            expires_in=int(expires_in),
        )

    return None


def save_tokens_to_env(tokens: MeijerTokens) -> None:
    """
    Save tokens to environment variables.

    This is useful for development and testing.
    In production, use proper secure storage.

    Args:
        tokens: MeijerTokens object to save
    """
    os.environ["MEIJER_ACCESS_TOKEN"] = tokens.access_token
    os.environ["MEIJER_REFRESH_TOKEN"] = tokens.refresh_token
    os.environ["MEIJER_ID_TOKEN"] = tokens.id_token
    os.environ["MEIJER_EXPIRES_IN"] = str(tokens.expires_in)


def main():
    """Example usage of the Meijer API client."""
    print("Meijer API Client Example")
    print("=" * 50)

    # Create client
    client = MeijerAPIClient()

    # Check if we have tokens from environment
    tokens = load_tokens_from_env()
    if tokens:
        print("✓ Tokens loaded from environment variables")
        client.tokens = tokens

        # Check if tokens are valid
        if client.tokens.is_expired():
            print("⚠️  Tokens expired, refreshing...")
            try:
                client.refresh_access_token()
                print("✓ Tokens refreshed successfully")
            except Exception as e:
                print(f"✗ Failed to refresh tokens: {e}")
                return
        else:
            print("✓ Tokens are valid")

        # Example API calls
        try:
            print("\nFetching offers...")
            offers = client.get_offers()
            print(f"✓ Found {len(offers.get('offers', []))} offers")

            print("\nFetching shopping list...")
            shopping_list = client.get_shopping_list()
            print("✓ Shopping list retrieved")

        except Exception as e:
            print(f"✗ API call failed: {e}")

    else:
        print("No tokens found in environment variables")
        print("\nTo authenticate:")
        print("1. Call client.get_authorization_url()")
        print("2. Visit the URL and complete authentication")
        print("3. Extract authorization code from callback")
        print("4. Call client.exchange_code_for_tokens(code)")
        print("5. Save tokens securely")

        # Generate authorization URL for demonstration
        auth_url = client.get_authorization_url()
        print("\nExample authorization URL:")
        print(f"{auth_url[:100]}...")


if __name__ == "__main__":
    main()
