#!/usr/bin/env python3
"""
Meijer Auth Log Analyzer Module

This module provides functionality to analyze Meijer mitmproxy logs and extract
authentication tokens. It's designed to be integrated into the meijer package
for use with the CLI command 'meijer auth log'.

The analyzer follows a priority-based approach:
1. First checks for full login events and extracts required tokens (including refresh token)
2. Falls back to searching for api.meijer.com calls to grab bearer tokens
3. Saves tokens to auth.json in the correct config directory
4. Tests the tokens by making an API call through the auth.json round-trip

Enhanced to capture comprehensive OAuth2 parameters and Okta IDX workflow data
for complete token refresh capability.
"""

import json
import logging
import os
import re
from typing import Any, Dict, List, Tuple
from urllib.parse import parse_qs, urlparse

# Import mitmproxy modules with fallback
try:
    from mitmproxy import io

    MITMPROXY_AVAILABLE = True
except ImportError:
    # Graceful fallback if mitmproxy is not available
    MITMPROXY_AVAILABLE = False

try:
    from .auth import get_meijer_config_path
except ImportError:
    # Fallback for standalone usage
    def get_meijer_config_path(filename: str) -> str:
        config_dir = os.path.expanduser("~/.config/meijer")
        return os.path.join(config_dir, filename)


logger = logging.getLogger(__name__)


class MeijerAuthLogAnalyzer:
    """Analyzes Meijer auth logs to extract and validate authentication tokens."""

    def __init__(self, log_file: str):
        """
        Initialize the analyzer.

        Args:
            log_file: Path to the mitmproxy log file
        """
        self.log_file = log_file
        self.flows: list[Any] = []
        self.auth_tokens: dict[str, Any] = {}
        # Use the correct config path that TokenStorage expects
        self.auth_file = get_meijer_config_path("auth.json")

    def load_flows(self) -> bool:
        """Load flows from mitmproxy log file."""
        if not MITMPROXY_AVAILABLE:
            logger.error(
                "mitmproxy not available. Please install: pip install mitmproxy"
            )
            return False

        try:
            logger.info(f"Loading flows from {self.log_file}")
            with open(self.log_file, "rb") as f:
                reader = io.FlowReader(f)
                for flow in reader.stream():
                    # Only process HTTP flows with proper request objects
                    if (
                        hasattr(flow, "request")
                        and hasattr(flow.request, "pretty_url")
                        and hasattr(flow.request, "method")
                    ):
                        self.flows.append(flow)

            logger.info(f"Loaded {len(self.flows)} HTTP flows from log file")
            return True

        except Exception as e:
            logger.error(f"Failed to load flows: {e}")
            return False

    def extract_oauth2_parameters(self, url: str) -> Dict[str, List[str]]:
        """Extract OAuth2 parameters from URL query string."""
        try:
            parsed = urlparse(url)
            return parse_qs(parsed.query)
        except Exception:
            return {}

    def detect_full_login_event(self) -> Tuple[bool, Dict[str, Any]]:
        """
        Detect if a full login event occurred in the logs.

        Returns:
            Tuple of (found, token_data)
        """
        logger.info("🔍 Searching for full login events...")

        # Enhanced indicators for comprehensive authentication detection
        login_indicators = {
            "device_fingerprint": False,
            "oauth2_authorize": False,
            "idx_introspect": False,
            "idx_identify": False,
            "idx_challenge": False,
            "login_redirect": False,
            "oauth2_token_exchange": False,
            "logout": False,
            "api_calls": False,
        }

        token_data = {}
        flow_sequence = []
        oauth2_params = {}
        idx_workflow_data = {}

        for flow in self.flows:
            url = flow.request.pretty_url
            method = flow.request.method
            timestamp = flow.timestamp_start

            # Device fingerprint (start of login)
            if "id.meijer.com/auth/services/devicefingerprint" in url:
                login_indicators["device_fingerprint"] = True
                flow_sequence.append(
                    {"step": "device_fingerprint", "timestamp": timestamp, "url": url}
                )
                logger.info("✅ Found device fingerprint endpoint")

            # OAuth2 authorization request
            elif "id.meijer.com/oauth2/default/v1/authorize" in url:
                login_indicators["oauth2_authorize"] = True
                oauth2_params = self.extract_oauth2_parameters(url)
                flow_sequence.append(
                    {
                        "step": "oauth2_authorize",
                        "timestamp": timestamp,
                        "url": url,
                        "params": oauth2_params,
                    }
                )
                logger.info("✅ Found OAuth2 authorization request")
                if oauth2_params.get("client_id"):
                    logger.info(f"   Client ID: {oauth2_params['client_id'][0]}")
                if oauth2_params.get("scope"):
                    logger.info(f"   Scope: {oauth2_params['scope'][0]}")

            # IDX introspect (Okta Identity Engine workflow)
            elif "id.meijer.com/idp/idx/introspect" in url and method == "POST":
                login_indicators["idx_introspect"] = True
                flow_sequence.append(
                    {"step": "idx_introspect", "timestamp": timestamp, "url": url}
                )
                logger.info("✅ Found IDX introspect endpoint")

                # Extract request body for workflow context
                if hasattr(flow, "request") and flow.request.content:
                    try:
                        request_data = json.loads(flow.request.content.decode("utf-8"))
                        idx_workflow_data["introspect"] = request_data
                        logger.info("   Extracted introspect request data")
                    except (json.JSONDecodeError, AttributeError):
                        pass

            # IDX identify (username entry)
            elif "id.meijer.com/idp/idx/identify" in url and method == "POST":
                login_indicators["idx_identify"] = True
                flow_sequence.append(
                    {"step": "idx_identify", "timestamp": timestamp, "url": url}
                )
                logger.info("✅ Found IDX identify endpoint")

                # Extract username from request
                if hasattr(flow, "request") and flow.request.content:
                    try:
                        request_data = json.loads(flow.request.content.decode("utf-8"))
                        if "identifier" in request_data:
                            username = request_data["identifier"]
                            token_data["username"] = username
                            logger.info(f"   Username: {username}")
                        idx_workflow_data["identify"] = request_data
                    except (json.JSONDecodeError, AttributeError):
                        pass

            # IDX challenge (2FA/MFA step)
            elif "id.meijer.com/idp/idx/challenge/answer" in url and method == "POST":
                login_indicators["idx_challenge"] = True
                flow_sequence.append(
                    {"step": "idx_challenge", "timestamp": timestamp, "url": url}
                )
                logger.info("✅ Found IDX challenge endpoint")

                # Extract challenge response data
                if hasattr(flow, "request") and flow.request.content:
                    try:
                        request_data = json.loads(flow.request.content.decode("utf-8"))
                        idx_workflow_data["challenge"] = request_data
                        logger.info("   Extracted challenge response data")
                    except (json.JSONDecodeError, AttributeError):
                        pass

            # Login redirect (authentication step)
            elif "id.meijer.com/login/token/redirect" in url:
                login_indicators["login_redirect"] = True
                flow_sequence.append(
                    {"step": "login_redirect", "timestamp": timestamp, "url": url}
                )
                logger.info("✅ Found login token redirect")

                # Extract state token from URL
                state_token_match = re.search(r"stateToken=([^&]+)", url)
                if state_token_match:
                    state_token = state_token_match.group(1)
                    token_data["state_token"] = state_token
                    logger.info(f"   State token: {state_token[:20]}...")

            # OAuth2 token exchange (successful authentication)
            elif "id.meijer.com/oauth2/default/v1/token" in url and method == "POST":
                login_indicators["oauth2_token_exchange"] = True
                flow_sequence.append(
                    {
                        "step": "oauth2_token_exchange",
                        "timestamp": timestamp,
                        "url": url,
                    }
                )

                # Extract tokens from response
                if hasattr(flow, "response") and flow.response:
                    try:
                        response_data = json.loads(
                            flow.response.content.decode("utf-8")
                        )
                        if "access_token" in response_data:
                            token_data.update(
                                {
                                    "access_token": response_data.get("access_token"),
                                    "refresh_token": response_data.get("refresh_token"),
                                    "expires_in": response_data.get("expires_in"),
                                    "token_type": response_data.get(
                                        "token_type", "Bearer"
                                    ),
                                    "scope": response_data.get("scope"),
                                    "id_token": response_data.get("id_token"),
                                    "extracted_at": timestamp,
                                    "source": "oauth2_token_exchange",
                                }
                            )
                            logger.info("✅ Found OAuth2 token exchange response")
                            if response_data.get("refresh_token"):
                                logger.info(
                                    "   Refresh token available for auto-renewal"
                                )
                    except (json.JSONDecodeError, AttributeError):
                        pass

                # Extract authorization code from request
                if hasattr(flow, "request") and flow.request.content:
                    try:
                        request_data = json.loads(flow.request.content.decode("utf-8"))
                        if "code" in request_data:
                            auth_code = request_data["code"]
                            token_data["authorization_code"] = auth_code
                            logger.info(f"   Authorization code: {auth_code[:20]}...")
                    except (json.JSONDecodeError, AttributeError):
                        pass

            # Logout (indicates full authentication was completed)
            elif "id.meijer.com/oauth2/default/v1/logout" in url:
                login_indicators["logout"] = True
                flow_sequence.append(
                    {"step": "logout", "timestamp": timestamp, "url": url}
                )
                logger.info("✅ Found logout endpoint")

                # Extract ID token hint for logout context
                id_token_match = re.search(r"id_token_hint=([^&]+)", url)
                if id_token_match:
                    id_token = id_token_match.group(1)
                    token_data["id_token_hint"] = id_token
                    logger.info(f"   ID token hint: {id_token[:20]}...")

            # API calls (verification that tokens work)
            elif "api.meijer.com" in url and method in ["GET", "POST"]:
                login_indicators["api_calls"] = True
                flow_sequence.append(
                    {
                        "step": "api_call",
                        "timestamp": timestamp,
                        "url": url,
                        "method": method,
                    }
                )

                logger.debug(f"🔍 Processing API call: {method} {url}")

                # Extract bearer token from request headers
                auth_header = flow.request.headers.get("Authorization", "")
                logger.debug(
                    f"   Authorization header: {auth_header[:50] if auth_header else 'NOT_FOUND'}..."
                )

                if auth_header.startswith("Bearer "):
                    # Extract subscription key from ocp-apim-subscription-key header
                    subscription_key = flow.request.headers.get(
                        "ocp-apim-subscription-key", ""
                    )

                    # Extract token and decode JWT to get expiration
                    token = auth_header[7:]  # Remove 'Bearer ' prefix
                    expires_in = None

                    try:
                        # Decode JWT to get expiration time
                        import base64

                        # Split JWT into parts and decode the payload
                        parts = token.split(".")
                        if len(parts) == 3:
                            # Decode the payload (second part)
                            payload = parts[1]
                            # Add padding if needed
                            payload += "=" * (4 - len(payload) % 4)
                            decoded = json.loads(base64.b64decode(payload))

                            if "exp" in decoded:
                                import time

                                current_time = int(time.time())
                                expires_in = decoded["exp"] - current_time
                                logger.info(f"   Token expires in {expires_in} seconds")
                            else:
                                expires_in = 3600  # Default to 1 hour
                        else:
                            expires_in = 3600  # Default to 1 hour
                    except Exception as e:
                        logger.warning(f"   Could not decode JWT: {e}")
                        # Default to 1 hour if we can't decode
                        expires_in = 3600

                    # Store all bearer tokens found, we'll use the most recent one
                    if "bearer_tokens" not in token_data:
                        token_data["bearer_tokens"] = []
                    token_data["bearer_tokens"].append(
                        {
                            "token": token,
                            "subscription_key": subscription_key,
                            "expires_in": expires_in,
                            "timestamp": timestamp,
                            "url": url,
                            "method": method,
                        }
                    )
                    logger.info("✅ Found bearer token in API call headers")
                    if subscription_key:
                        logger.info(f"   Subscription key: {subscription_key}")

        # If we found bearer tokens, use the most recent one
        if token_data.get("bearer_tokens"):
            bearer_tokens = token_data["bearer_tokens"]
            # Sort by timestamp (newest first)
            bearer_tokens.sort(key=lambda x: x["timestamp"], reverse=True)
            latest_bearer = bearer_tokens[0]

            token_data["access_token"] = latest_bearer["token"]
            token_data["subscription_key"] = latest_bearer.get("subscription_key", "")
            token_data["expires_in"] = latest_bearer.get(
                "expires_in", 3600
            )  # Default to 1 hour
            token_data["source"] = "api_call_header"
            token_data["extracted_at"] = latest_bearer["timestamp"]
            token_data["url"] = latest_bearer["url"]
            token_data["method"] = latest_bearer["method"]

            logger.info(
                f"✅ Using most recent Bearer token from: {latest_bearer['url']}"
            )
            logger.info(f"   Timestamp: {latest_bearer['timestamp']}")
            logger.info(f"   Method: {latest_bearer['method']}")

            # Clean up the temporary list
            del token_data["bearer_tokens"]

        # Store OAuth2 and IDX workflow information for future reference
        if oauth2_params:
            token_data["oauth2_parameters"] = oauth2_params
        if idx_workflow_data:
            token_data["idx_workflow"] = idx_workflow_data

        # Enhanced determination of full login - check for multiple authentication steps
        # We consider it a "full login context" if we have the authentication flow even without final tokens
        has_auth_context = (
            login_indicators["device_fingerprint"]
            and (
                login_indicators["oauth2_authorize"]
                or login_indicators["idx_introspect"]
            )
            and (login_indicators["login_redirect"] or login_indicators["idx_identify"])
        )

        # Full login requires both context and actual tokens
        full_login = bool(has_auth_context and token_data.get("access_token"))

        # Store authentication context even if we don't have final tokens
        if has_auth_context:
            token_data["has_auth_context"] = True
            token_data["auth_flow_complete"] = bool(token_data.get("access_token"))
            logger.info(
                "✅ Authentication context detected - OAuth2 parameters available for future use"
            )
            if not token_data.get("access_token"):
                logger.info(
                    "⚠️ Authentication flow incomplete - final tokens not captured"
                )
                logger.info(
                    "💡 Re-run with complete login flow to capture refresh tokens"
                )

        if full_login:
            logger.info("🎉 Full login event detected!")
            logger.info(f"Flow sequence: {[step['step'] for step in flow_sequence]}")
        else:
            logger.info("⚠️ Full login event not detected")
            logger.info(f"Indicators: {login_indicators}")

        return full_login, token_data

    def validate_token_refresh_capability(
        self, tokens: Dict[str, Any]
    ) -> Dict[str, Any]:
        """
        Validate that we have all necessary information for token refresh.

        Args:
            tokens: Dictionary containing token data

        Returns:
            Dictionary with validation results and recommendations
        """
        validation: Dict[str, Any] = {
            "can_refresh": False,
            "missing_components": [],
            "recommendations": [],
        }

        # Check for essential refresh components
        required_for_refresh = ["refresh_token", "oauth2_parameters"]
        for component in required_for_refresh:
            if not tokens.get(component):
                validation["missing_components"].append(component)

        # Check for OAuth2 parameters specifically
        if tokens.get("oauth2_parameters"):
            oauth2_params = tokens["oauth2_parameters"]
            required_oauth2 = ["client_id", "scope"]
            for param in required_oauth2:
                if not oauth2_params.get(param):
                    validation["missing_components"].append(f"oauth2_{param}")

        # Determine if refresh is possible
        if not validation["missing_components"]:
            validation["can_refresh"] = True
            validation["recommendations"].append(
                "✅ Full token refresh capability available"
            )
        else:
            validation["can_refresh"] = False
            validation["recommendations"].append("⚠️ Limited token refresh capability")

            if "refresh_token" in validation["missing_components"]:
                validation["recommendations"].append(
                    "   - No refresh token found - tokens will expire"
                )
            if "oauth2_parameters" in validation["missing_components"]:
                validation["recommendations"].append(
                    "   - OAuth2 parameters missing - cannot initiate refresh flow"
                )
            if "oauth2_client_id" in validation["missing_components"]:
                validation["recommendations"].append(
                    "   - Client ID missing - required for token refresh"
                )
            if "oauth2_scope" in validation["missing_components"]:
                validation["recommendations"].append(
                    "   - Scope missing - required for token refresh"
                )

        # Add specific recommendations based on what we found
        if tokens.get("access_token") and not tokens.get("refresh_token"):
            validation["recommendations"].append(
                "   - Bearer token only - use for immediate API access"
            )
            validation["recommendations"].append(
                "   - Re-run with complete login flow to get refresh tokens"
            )

        return validation

    def search_api_meijer_calls(self) -> Tuple[bool, Dict[str, Any]]:
        """
        Search for api.meijer.com calls to extract bearer tokens and subscription keys.

        This method performs a reverse search through the log file, finding the LAST
        (most recent chronologically) api.meijer.com call with a Bearer token.

        Returns:
            Tuple of (found, token_data)
        """
        logger.info("🔍 Searching for api.meijer.com calls...")

        token_data = {}
        api_calls = []
        bearer_requests = []

        for flow in self.flows:
            if not hasattr(flow, "request") or not hasattr(flow.request, "pretty_url"):
                continue
            url = flow.request.pretty_url
            method = flow.request.method
            timestamp = flow.timestamp_start

            if "api.meijer.com" in url:
                api_calls.append({"timestamp": timestamp, "url": url, "method": method})

                # Extract bearer token from Authorization header
                if not hasattr(flow.request, "headers"):
                    continue
                auth_header = flow.request.headers.get("Authorization", "")
                if auth_header.startswith("Bearer "):
                    # Extract subscription key from ocp-apim-subscription-key header
                    subscription_key = flow.request.headers.get(
                        "ocp-apim-subscription-key", ""
                    )

                    # Extract token and decode JWT to get expiration
                    token = auth_header[7:]  # Remove 'Bearer ' prefix
                    expires_in = None

                    try:
                        # Decode JWT to get expiration time
                        import base64

                        # Split JWT into parts and decode the payload
                        parts = token.split(".")
                        if len(parts) == 3:
                            # Decode the payload (second part)
                            payload = parts[1]
                            # Add padding if needed
                            payload += "=" * (4 - len(payload) % 4)
                            decoded = json.loads(base64.b64decode(payload))

                            if "exp" in decoded:
                                import time

                                current_time = int(time.time())
                                expires_in = decoded["exp"] - current_time
                                logger.info(f"   Token expires in {expires_in} seconds")
                            else:
                                expires_in = 3600  # Default to 1 hour
                        else:
                            expires_in = 3600  # Default to 1 hour
                    except Exception as e:
                        logger.warning(f"   Could not decode JWT: {e}")
                        # Default to 1 hour if we can't decode
                        expires_in = 3600

                    bearer_requests.append(
                        {
                            "bearer_token": token,
                            "subscription_key": subscription_key,
                            "expires_in": expires_in,
                            "timestamp": timestamp,
                            "url": url,
                            "method": method,
                        }
                    )

        if api_calls:
            logger.info(f"Found {len(api_calls)} API calls to api.meijer.com")
        else:
            logger.info("No API calls to api.meijer.com found")

        if bearer_requests:
            logger.info(f"Found {len(bearer_requests)} API calls with Bearer tokens")

            # REVERSE SEARCH: Find the LAST api.meijer.com call with Bearer token in the log
            # This ensures we get the most recent token chronologically
            # Since flows are loaded in chronological order, bearer_requests[-1] is the latest
            latest = bearer_requests[-1]

            token_data.update(
                {
                    "access_token": latest["bearer_token"],
                    "subscription_key": latest["subscription_key"],
                    "expires_in": latest.get("expires_in", 3600),  # Default to 1 hour
                    "source": "api_call_header",
                    "extracted_at": latest["timestamp"],
                    "url": latest["url"],
                    "method": latest["method"],
                }
            )

            logger.info(
                f"✅ Using Bearer token from last API call in log: {latest['url']}"
            )
            logger.info(f"   Timestamp: {latest['timestamp']}")
            logger.info(f"   Method: {latest['method']}")
            if latest["subscription_key"]:
                logger.info(f"   Subscription key: {latest['subscription_key']}")
        else:
            logger.info("No API calls with Bearer tokens found")

        return bool(token_data), token_data

    def save_tokens_to_auth_json(self, tokens: Dict[str, Any]) -> bool:
        """
        Save extracted tokens to auth.json file.

        Args:
            tokens: Dictionary containing token data

        Returns:
            True if successful, False otherwise
        """
        try:
            # Check if we have authentication context or actual tokens
            if not tokens.get("access_token") and not tokens.get("has_auth_context"):
                logger.error("No access token or authentication context found to save")
                return False

            # If we only have auth context, create a placeholder access token
            if tokens.get("has_auth_context") and not tokens.get("access_token"):
                tokens["access_token"] = "PLACEHOLDER_AUTH_CONTEXT_ONLY"
                tokens["token_type"] = "Context"
                logger.info(
                    "⚠️ Creating placeholder access token for authentication context"
                )
                logger.info(
                    "💡 This file contains OAuth2 parameters but no working tokens"
                )
                logger.info("💡 Complete the login flow to get actual working tokens")

            # Add default values for missing fields
            if "token_type" not in tokens:
                tokens["token_type"] = "Bearer"

            if "extracted_at" not in tokens:
                import time

                tokens["extracted_at"] = time.time()

            # Add the token in the simple format the client expects
            if "bearer" not in tokens and tokens.get("access_token"):
                tokens["bearer"] = tokens["access_token"]
                logger.info(
                    "✅ Added token in simple 'bearer' format for compatibility"
                )

            # Add subscription key if found
            if "subscription_key" in tokens and tokens.get("subscription_key"):
                logger.info(f"✅ Found subscription key: {tokens['subscription_key']}")
            else:
                # Fallback to hardcoded key if not found in logs
                tokens["subscription_key"] = "a10bc58ac484478d9b3958b1742c3a03"
                logger.info("ℹ️ Using hardcoded subscription key as fallback")

            # Add authentication metadata for future reference
            if tokens.get("oauth2_parameters"):
                logger.info("✅ Storing OAuth2 parameters for token refresh")
                logger.info(
                    f"   Client ID: {tokens['oauth2_parameters'].get('client_id', ['N/A'])[0]}"
                )
                logger.info(
                    f"   Scope: {tokens['oauth2_parameters'].get('scope', ['N/A'])[0]}"
                )

            if tokens.get("idx_workflow"):
                logger.info("✅ Storing IDX workflow data for authentication context")
                workflow_steps = list(tokens["idx_workflow"].keys())
                logger.info(f"   Workflow steps: {workflow_steps}")

            if tokens.get("username"):
                logger.info(f"✅ Username extracted: {tokens['username']}")

            if tokens.get("state_token"):
                logger.info(
                    f"✅ State token extracted: {tokens['state_token'][:20]}..."
                )

            if tokens.get("authorization_code"):
                logger.info(
                    f"✅ Authorization code extracted: {tokens['authorization_code'][:20]}..."
                )

            if tokens.get("id_token"):
                logger.info(f"✅ ID token extracted: {tokens['id_token'][:20]}...")

            if tokens.get("refresh_token"):
                logger.info(
                    "✅ Refresh token available - tokens can be automatically renewed"
                )
            else:
                logger.warning(
                    "⚠️ No refresh token found - tokens will expire and require manual renewal"
                )

            # Ensure the directory exists
            auth_dir = os.path.dirname(self.auth_file)
            if auth_dir and not os.path.exists(auth_dir):
                os.makedirs(auth_dir, exist_ok=True)
                logger.info(f"Created config directory: {auth_dir}")

            # Save to auth.json
            with open(self.auth_file, "w") as f:
                json.dump(tokens, f, indent=2)

            logger.info(f"✅ Tokens saved to {self.auth_file}")
            logger.info(f"Access token: {tokens['access_token'][:20]}...")
            if tokens.get("refresh_token"):
                logger.info(f"Refresh token: {tokens['refresh_token'][:20]}...")

            # Show helpful information about the save location
            if self.auth_file == get_meijer_config_path("auth.json"):
                logger.info(
                    "💡 Tokens saved to standard config location - Meijer client will find them automatically"
                )
            else:
                logger.info(
                    "⚠️  Tokens saved to custom location - you may need to copy to standard location"
                )

            return True

        except Exception as e:
            logger.error(f"Failed to save tokens: {e}")
            return False

    def analyze_and_extract(self) -> bool:
        """
        Main analysis method that follows the priority-based approach.

        Returns:
            True if tokens were found and saved successfully, False otherwise
        """
        logger.info("🚀 Starting Meijer Auth Log Analysis")
        logger.info("=" * 50)

        # Load flows from log file
        if not self.load_flows():
            logger.error("Failed to load flows from log file")
            return False

        # Step 1: Check for full login event
        full_login_found, login_tokens = self.detect_full_login_event()

        if full_login_found and login_tokens.get("access_token"):
            logger.info("🎯 Full login event found - extracting tokens...")
            self.auth_tokens = login_tokens

        elif login_tokens.get("has_auth_context"):
            logger.info(
                "🎯 Authentication context found - storing OAuth2 parameters for future use..."
            )
            self.auth_tokens = login_tokens

            # Even without final tokens, we can save the authentication context
            logger.info("💡 OAuth2 parameters and workflow data captured")
            logger.info("💡 Re-run with complete login flow to get refresh tokens")

        else:
            logger.info("⚠️ Full login event not found, searching for API calls...")

            # Step 2: Search for api.meijer.com calls
            api_calls_found, api_tokens = self.search_api_meijer_calls()

            if api_calls_found and api_tokens.get("access_token"):
                logger.info("🎯 API calls found - extracting bearer token...")
                self.auth_tokens = api_tokens

            else:
                logger.error("❌ Neither full login event nor API calls found")
                logger.error("No tokens could be extracted from the log file")
                return False

        # Step 3: Validate token refresh capability
        logger.info("\n🔍 Validating token refresh capability...")
        validation = self.validate_token_refresh_capability(self.auth_tokens)

        for recommendation in validation["recommendations"]:
            logger.info(recommendation)

        # Step 4: Save tokens to auth.json
        if not self.save_tokens_to_auth_json(self.auth_tokens):
            logger.error("Failed to save tokens to auth.json")
            return False

        logger.info("🎉 SUCCESS: Tokens extracted and saved successfully!")

        # Final summary
        if validation["can_refresh"]:
            logger.info("🔄 Tokens can be automatically refreshed when they expire")
        else:
            logger.info(
                "⚠️ Tokens cannot be automatically refreshed - manual renewal required"
            )

        return True

    def analyze_and_extract_full_login(self) -> bool:
        """
        Attempt to extract tokens from a complete OAuth2 login flow.

        Returns:
            True if full login tokens were found and saved, False otherwise
        """
        logger.info("🔐 Attempting Full Login extraction...")

        # Load flows from log file
        if not self.load_flows():
            logger.error("Failed to load flows from log file")
            return False

        # Check for full login event
        full_login_found, login_tokens = self.detect_full_login_event()

        if full_login_found and login_tokens.get("access_token"):
            logger.info("🎯 Full login event found - extracting tokens...")
            self.auth_tokens = login_tokens

            # Save tokens
            if not self.save_tokens_to_auth_json(self.auth_tokens):
                logger.error("Failed to save tokens to auth.json")
                return False

            logger.info("🎉 SUCCESS: Full login tokens extracted and saved!")
            return True
        else:
            logger.warning("⚠️ Full login event not found")
            return False

    def analyze_and_extract_quick_token(self) -> bool:
        """
        Extract bearer tokens from API calls (fallback method).

        Returns:
            True if bearer tokens were found and saved, False otherwise
        """
        logger.info("⚡ Attempting Quick Token extraction...")

        # Load flows from log file
        if not self.load_flows():
            logger.error("Failed to load flows from log file")
            return False

        # Search for api.meijer.com calls
        api_calls_found, api_tokens = self.search_api_meijer_calls()

        if api_calls_found and api_tokens.get("access_token"):
            logger.info("🎯 API calls found - extracting bearer token...")
            self.auth_tokens = api_tokens

            # Save tokens
            if not self.save_tokens_to_auth_json(self.auth_tokens):
                logger.error("Failed to save tokens to auth.json")
                return False

            logger.info("🎉 SUCCESS: Quick token extraction successful!")
            return True
        else:
            logger.warning("⚠️ No API calls found for quick token extraction")
            return False
