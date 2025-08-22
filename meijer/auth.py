"""
Meijer API Authentication
========================

Authentication classes and utilities for the Meijer API client.
"""

import json
import logging
import os
from pathlib import Path
from typing import Optional, Tuple, Union

import requests
from requests.auth import AuthBase

from .models import AuthTokens


def get_meijer_config_path(filename: str) -> str:
    """
    Get cross-platform config path for Meijer authentication files.

    Args:
        filename: Name of the file to get path for

    Returns:
        Full path to the config file
    """
    # Get home directory for current OS
    home_dir = Path.home()

    # Create config directory path
    if os.name == "nt":  # Windows
        config_dir = home_dir / "AppData" / "Local" / "Meijer"
    elif os.name == "posix":  # Unix-like (Linux, macOS, FreeBSD)
        config_dir = home_dir / ".config" / "meijer"
    else:
        # Fallback for other OS
        config_dir = home_dir / ".meijer"

    # Ensure config directory exists
    config_dir.mkdir(parents=True, exist_ok=True)

    return str(config_dir / filename)


class MeijerAuth(AuthBase):
    """Custom authentication class for Meijer API requests with automatic token refresh."""

    def __init__(self, token_storage: "TokenStorage"):
        self.token_storage = token_storage
        self.logger = logging.getLogger(__name__)

    def __call__(self, request):
        # Ensure we have a valid token before making the request
        tokens = self._ensure_valid_tokens()
        if tokens:
            request.headers["Authorization"] = f"Bearer {tokens.access_token}"
        return request

    def _ensure_valid_tokens(self) -> Optional[AuthTokens]:
        """
        Ensure we have valid tokens, refreshing if necessary.

        This method is called before every API request to ensure tokens are fresh.
        """
        tokens = self.token_storage.get_valid_tokens()
        if not tokens:
            self.logger.warning("❌ No valid tokens available")
            return None

        # Check if token is close to expiring (within 10 minutes)
        if tokens.is_expired(buffer_seconds=600):  # 10 minutes buffer
            self.logger.info("🔄 Token expiring soon, proactively refreshing...")
            if self.token_storage.refresh_tokens(tokens.refresh_token):
                # Reload the refreshed tokens
                tokens = self.token_storage.load_tokens()
                if tokens:
                    self.logger.info("✅ Tokens refreshed successfully")
                else:
                    self.logger.error("❌ Failed to load refreshed tokens")
                    return None
            else:
                self.logger.error("❌ Failed to refresh tokens")
                return None

        return tokens


class TokenStorage:
    """Handles persistent storage and automatic refresh of authentication tokens."""

    def __init__(self, storage_file: str = None):
        if storage_file is None:
            # Use cross-platform config directory with JSON format
            self.storage_file = get_meijer_config_path("auth.json")
        else:
            self.storage_file = storage_file
        self.logger = logging.getLogger(__name__)

        # OAuth2 configuration based on log analysis
        self.oauth_base_url = "https://id.meijer.com/oauth2/default/v1"
        # Store original URL for local development support
        self._original_oauth_base_url = self.oauth_base_url
        self.client_id = "0oa1o8g9njWsUvwsx697"  # From log analysis

        # Token refresh settings
        self.refresh_buffer_seconds = 300  # 5 minutes before expiry

    def set_local_base_url(self, base_url: str):
        """
        Set the base URL for local development/testing.
        
        Args:
            base_url: Base URL for local server (e.g., "http://127.0.0.1:5000")
        """
        base_url = base_url.rstrip('/')
        self.oauth_base_url = f"{base_url}/api/meijer/oauth2/default/v1"
        self.logger.info(f"Using local OAuth base URL: {self.oauth_base_url}")

    def reset_to_default_urls(self):
        """Reset URLs back to default Meijer endpoints."""
        self.oauth_base_url = self._original_oauth_base_url
        self.logger.info(f"Reset OAuth base URL to: {self.oauth_base_url}")

    def _get_config_path(self, filename: str) -> str:
        """
        Get cross-platform config path for Meijer authentication files.

        Args:
            filename: Name of the file to get path for

        Returns:
            Full path to the config file
        """
        return get_meijer_config_path(filename)

    def save_tokens(self, tokens: AuthTokens) -> bool:
        """Save tokens to persistent storage."""
        try:
            with open(self.storage_file, "w") as f:
                json.dump(tokens.to_dict(), f, indent=2)
            self.logger.info("✅ Tokens saved to persistent storage")
            return True
        except Exception as e:
            self.logger.error(f"❌ Failed to save tokens: {e}")
            return False

    def load_tokens(self) -> Optional[AuthTokens]:
        """Load tokens from persistent storage."""
        try:
            if not os.path.exists(self.storage_file):
                return None

            with open(self.storage_file, "r") as f:
                token_data = json.load(f)

            tokens = AuthTokens.from_dict(token_data)
            self.logger.info("✅ Tokens loaded from persistent storage")
            return tokens
        except Exception as e:
            self.logger.error(f"❌ Failed to load tokens: {e}")
            return None

    def clear_tokens(self) -> bool:
        """Clear stored tokens."""
        try:
            if os.path.exists(self.storage_file):
                os.remove(self.storage_file)
            self.logger.info("✅ Tokens cleared from storage")
            return True
        except Exception as e:
            self.logger.error(f"❌ Failed to clear tokens: {e}")
            return False

    def has_tokens(self) -> bool:
        """Check if tokens are stored."""
        return os.path.exists(self.storage_file)

    def get_valid_tokens(self) -> Optional[AuthTokens]:
        """
        Get valid tokens, refreshing if necessary.

        Returns:
            Valid AuthTokens instance or None if refresh fails
        """
        tokens = self.load_tokens()
        if not tokens:
            return None

        # Check if token needs refresh
        if tokens.is_expired(buffer_seconds=self.refresh_buffer_seconds):
            self.logger.info("🔄 Access token expired, attempting refresh...")
            if self.refresh_tokens(tokens.refresh_token):
                tokens = self.load_tokens()  # Reload refreshed tokens
            else:
                self.logger.error("❌ Failed to refresh tokens")
                return None

        return tokens

    def refresh_tokens(self, refresh_token: str) -> bool:
        """
        Refresh access token using refresh token.

        Args:
            refresh_token: The refresh token to use

        Returns:
            True if refresh successful, False otherwise
        """
        # Check if we have a valid refresh token
        if not refresh_token or refresh_token.strip() == "":
            self.logger.error(
                "❌ No refresh token available - cannot refresh access token"
            )
            self.logger.info(
                "💡 You need to re-authenticate using 'meijer auth' to get new tokens with refresh capability"
            )
            return False

        try:
            # Prepare refresh request based on log analysis
            refresh_data = {
                "client_id": self.client_id,
                "grant_type": "refresh_token",
                "refresh_token": refresh_token,
            }

            headers = {
                "Content-Type": "application/x-www-form-urlencoded",
                "Accept": "application/json",
            }

            self.logger.info("🔄 Refreshing tokens via OAuth2 endpoint...")
            response = requests.post(
                f"{self.oauth_base_url}/token",
                data=refresh_data,
                headers=headers,
                timeout=30,
            )

            if response.status_code == 200:
                token_data = response.json()

                # Create new AuthTokens instance
                new_tokens = AuthTokens(
                    access_token=token_data["access_token"],
                    refresh_token=token_data["refresh_token"],
                    expires_in=token_data["expires_in"],
                    token_type=token_data.get("token_type", "Bearer"),
                )

                # Save new tokens
                if self.save_tokens(new_tokens):
                    self.logger.info("🚀 Auth token refreshed! ✨")
                    return True
                else:
                    self.logger.error("❌ Failed to save refreshed tokens")
                    return False
            else:
                self.logger.error(
                    f"❌ Token refresh failed: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"❌ Exception during token refresh: {e}")
            return False

    def exchange_authorization_code(
        self,
        authorization_code: str,
        redirect_uri: str = "com.meijer.mobile.meijer://oauth2/callback",
    ) -> Optional[AuthTokens]:
        """
        Exchange authorization code for initial access token and refresh token.

        This is the initial OAuth2 flow that happens when a user first authenticates.
        Based on the log analysis, this flow uses grant_type=authorization_code.

        Args:
            authorization_code: The authorization code received from the OAuth2 authorization endpoint
            redirect_uri: The redirect URI used in the authorization flow

        Returns:
            AuthTokens instance if successful, None otherwise
        """
        try:
            # Prepare authorization code exchange request based on log analysis
            exchange_data = {
                "client_id": self.client_id,
                "grant_type": "authorization_code",
                "code": authorization_code,
                "redirect_uri": redirect_uri,
            }

            headers = {
                "Content-Type": "application/x-www-form-urlencoded",
                "Accept": "application/json",
            }

            self.logger.info("🔐 Exchanging authorization code for initial tokens...")
            response = requests.post(
                f"{self.oauth_base_url}/token",
                data=exchange_data,
                headers=headers,
                timeout=30,
            )

            if response.status_code == 200:
                token_data = response.json()

                # Create new AuthTokens instance
                new_tokens = AuthTokens(
                    access_token=token_data["access_token"],
                    refresh_token=token_data["refresh_token"],
                    expires_in=token_data["expires_in"],
                    token_type=token_data.get("token_type", "Bearer"),
                )

                # Save new tokens
                if self.save_tokens(new_tokens):
                    self.logger.info("🎉 Initial authentication successful! 🔑")
                    return new_tokens
                else:
                    self.logger.error("❌ Failed to save initial tokens")
                    return None
            else:
                self.logger.error(
                    f"❌ Authorization code exchange failed: {response.status_code} - {response.text}"
                )
                return None

        except Exception as e:
            self.logger.error(f"❌ Exception during authorization code exchange: {e}")
            return None

    def extract_tokens_from_log(self, log_file: str) -> Optional[AuthTokens]:
        """
        Extract tokens from mitmproxy log file.

        This method can extract tokens from both:
        - Initial authorization code exchange (grant_type=authorization_code)
        - Token refresh flows (grant_type=refresh_token)

        Args:
            log_file: Path to the mitmproxy log file

        Returns:
            AuthTokens instance if found, None otherwise
        """
        try:
            from mitmproxy import io
            from mitmproxy.http import HTTPFlow

            flows = []
            with open(log_file, "rb") as f:
                reader = io.FlowReader(f)
                for flow in reader.stream():
                    if isinstance(flow, HTTPFlow):
                        flows.append(flow)

            # Find all token-related responses
            token_responses = []
            for flow in flows:
                if (
                    flow.request
                    and flow.response
                    and flow.request.url
                    and "oauth2/default/v1/token" in flow.request.url
                    and flow.request.method == "POST"
                    and flow.response.status_code == 200
                ):
                    try:
                        # Parse response body for tokens
                        response_data = json.loads(
                            flow.response.content.decode("utf-8")
                        )

                        if (
                            "access_token" in response_data
                            and "refresh_token" in response_data
                        ):
                            # Determine the flow type from request body
                            request_body = (
                                flow.request.content.decode("utf-8")
                                if flow.request.content
                                else ""
                            )
                            flow_type = "unknown"

                            if "grant_type=authorization_code" in request_body:
                                flow_type = "initial_auth"
                                self.logger.info(
                                    "🔍 Found initial authorization flow in log"
                                )
                            elif "grant_type=refresh_token" in request_body:
                                flow_type = "token_refresh"
                                self.logger.info("🔄 Found token refresh flow in log")

                            tokens = AuthTokens(
                                access_token=response_data["access_token"],
                                refresh_token=response_data["refresh_token"],
                                expires_in=response_data.get("expires_in", 28800),
                                token_type=response_data.get("token_type", "Bearer"),
                            )

                            token_responses.append(
                                {
                                    "tokens": tokens,
                                    "timestamp": flow.timestamp_start,
                                    "flow_type": flow_type,
                                }
                            )

                            self.logger.info(
                                f"✅ Extracted tokens from {flow_type} flow"
                            )
                    except (json.JSONDecodeError, KeyError) as e:
                        self.logger.debug(f"Failed to parse token response: {e}")
                        continue

            if token_responses:
                # Sort by timestamp (newest first) and return the most recent
                token_responses.sort(key=lambda x: x["timestamp"], reverse=True)
                latest = token_responses[0]

                flow_type = latest["flow_type"]
                if flow_type == "initial_auth":
                    self.logger.info("🎯 Using tokens from initial authorization flow")
                elif flow_type == "token_refresh":
                    self.logger.info("🔄 Using tokens from refresh flow")
                else:
                    self.logger.info("📋 Using tokens from unknown flow")

                return latest["tokens"]

            return None

        except ImportError:
            self.logger.error("❌ mitmproxy not available for log parsing")
            return None
        except Exception as e:
            self.logger.error(f"❌ Failed to extract tokens from log: {e}")
            return None

    def load_credentials_from_file(self) -> Optional[Tuple[str, str]]:
        """
        Load username and password from login.txt file as fallback.
        
        Returns:
            Tuple of (username, password) or None if file doesn't exist
        """
        try:
            login_file = get_meijer_config_path("login.txt")
            if not os.path.exists(login_file):
                return None
                
            with open(login_file, "r") as f:
                lines = f.readlines()
                
            if len(lines) >= 2:
                username = lines[0].strip()
                password = lines[1].strip()
                
                if username and password:
                    self.logger.info("✅ Loaded credentials from login.txt fallback file")
                    return username, password
                    
            self.logger.warning("⚠️ login.txt file exists but format is invalid (need 2 lines: username, password)")
            return None
            
        except Exception as e:
            self.logger.error(f"❌ Failed to load credentials from login.txt: {e}")
            return None

    def save_credentials_to_file(self, username: str, password: str) -> bool:
        """
        Save username and password to login.txt file for fallback use.
        
        Args:
            username: User's email address
            password: User's password
            
        Returns:
            True if successful, False otherwise
        """
        try:
            login_file = get_meijer_config_path("login.txt")
            
            with open(login_file, "w") as f:
                f.write(f"{username}\n{password}\n")
                
            self.logger.info("✅ Credentials saved to login.txt fallback file")
            return True
            
        except Exception as e:
            self.logger.error(f"❌ Failed to save credentials to login.txt: {e}")
            return False

    def clear_credentials_file(self) -> bool:
        """
        Remove the login.txt credentials file.
        
        Returns:
            True if successful, False otherwise
        """
        try:
            login_file = get_meijer_config_path("login.txt")
            if os.path.exists(login_file):
                os.remove(login_file)
                self.logger.info("✅ Credentials file cleared")
                return True
            return True  # File didn't exist, so "cleared" successfully
            
        except Exception as e:
            self.logger.error(f"❌ Failed to clear credentials file: {e}")
            return False


def load_auth_from_config_file(
    config_file_path: Optional[Union[str, Path]] = None,
) -> Optional[Tuple[str, str]]:
    """
    Load authentication from cross-platform config directory.

    Args:
        config_file_path: Optional path to config file, defaults to cross-platform auth.txt

    Returns:
        Tuple of (bearer_token, user_agent) if found, None otherwise
    """
    try:
        if config_file_path is None:
            # Use cross-platform config directory
            config_file_path = Path(get_meijer_config_path("auth.txt"))
        else:
            config_file_path = Path(config_file_path)

        if not config_file_path.exists():
            logging.debug(f"Config file not found: {config_file_path}")
            return None

        logging.info(f"📂 Loading auth from JSON config: {config_file_path}")

        with open(config_file_path, "r") as f:
            config_data = json.load(f)

        bearer_token = config_data.get("bearer")
        user_agent = config_data.get("user_agent", "")

        if bearer_token:
            logging.info("✅ Loaded bearer token from config file")
            return bearer_token, user_agent
        else:
            logging.warning("⚠️ No bearer token found in config file")
            return None

    except Exception as e:
        logging.error(f"❌ Failed to load config file: {e}")
        return None


def extract_bearer_token_from_mitmproxy(
    log_file: str,
) -> Optional[Tuple[str, str, float]]:
    """
    Extract bearer token from mitmproxy log file.

    Args:
        log_file: Path to the mitmproxy log file

    Returns:
        Tuple of (bearer_token, user_agent, timestamp) if found, None otherwise
    """
    try:
        from mitmproxy import io
        from mitmproxy.http import HTTPFlow

        flows = []
        with open(log_file, "rb") as f:
            reader = io.FlowReader(f)
            for flow in reader.stream():
                if isinstance(flow, HTTPFlow):
                    flows.append(flow)

        # Find the most recent request with a bearer token
        bearer_requests = []
        for flow in flows:
            if flow.request and hasattr(flow.request, "headers"):
                headers = dict(flow.request.headers)

                # Look for Authorization header with Bearer token
                auth_header = None
                for header_name, header_value in headers.items():
                    if header_name.lower() == "authorization":
                        auth_header = header_value
                        break

                if auth_header and auth_header.startswith("Bearer "):
                    bearer_token = auth_header[7:]  # Remove "Bearer " prefix
                    user_agent = headers.get("user-agent", "")
                    timestamp = flow.timestamp_start

                    bearer_requests.append(
                        {
                            "bearer_token": bearer_token,
                            "user_agent": user_agent,
                            "timestamp": timestamp,
                        }
                    )

        if bearer_requests:
            # Sort by timestamp (newest first) and return the most recent
            bearer_requests.sort(key=lambda x: x["timestamp"], reverse=True)
            latest = bearer_requests[0]
            return latest["bearer_token"], latest["user_agent"], latest["timestamp"]

        return None

    except ImportError:
        logging.error("mitmproxy not available for log parsing")
        return None
    except Exception as e:
        logging.error(f"Failed to extract bearer token from log: {e}")
        return None
