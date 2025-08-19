"""
Meijer API Authentication
========================

Authentication classes and utilities for the Meijer API client.
"""

import json
import logging
import os
import pickle
from pathlib import Path
from typing import Optional, Tuple, Union

import requests
from requests.auth import AuthBase

from .models import AuthTokens


class MeijerAuth(AuthBase):
    """Custom authentication class for Meijer API requests with automatic token refresh."""

    def __init__(self, token_storage: "TokenStorage"):
        self.token_storage = token_storage
        self.logger = logging.getLogger(__name__)

    def __call__(self, request):
        # Ensure we have a valid token before making the request
        tokens = self.token_storage.get_valid_tokens()
        if tokens:
            request.headers["Authorization"] = f"Bearer {tokens.access_token}"
        return request


class TokenStorage:
    """Handles persistent storage and automatic refresh of authentication tokens."""

    def __init__(self, storage_file: str = "meijer_tokens.pkl"):
        self.storage_file = storage_file
        self.logger = logging.getLogger(__name__)

        # OAuth2 configuration based on log analysis
        self.oauth_base_url = "https://id.meijer.com/oauth2/default/v1"
        self.client_id = "0oa1o8g9njWsUvwsx697"  # From log analysis

        # Token refresh settings
        self.refresh_buffer_seconds = 300  # 5 minutes before expiry

    def save_tokens(self, tokens: AuthTokens) -> bool:
        """Save tokens to persistent storage."""
        try:
            with open(self.storage_file, "wb") as f:
                pickle.dump(tokens.to_dict(), f)
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

            with open(self.storage_file, "rb") as f:
                token_data = pickle.load(f)

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


def load_auth_from_config_file(
    config_file_path: Optional[Union[str, Path]] = None,
) -> Optional[Tuple[str, str]]:
    """
    Load authentication from .config/meijer.txt JSON config file.

    Args:
        config_file_path: Optional path to config file, defaults to ~/.config/meijer.txt

    Returns:
        Tuple of (bearer_token, user_agent) if found, None otherwise
    """
    try:
        if config_file_path is None:
            # Use default ~/.config/meijer.txt
            home_dir = Path.home()
            config_file_path = home_dir / ".config" / "meijer.txt"
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
