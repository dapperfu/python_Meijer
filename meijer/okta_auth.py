#!/usr/bin/env python3
"""
OKTA Authentication Module for Meijer API

This module implements the complete OKTA IDX authentication flow
discovered from analyzing mitmproxy logs. It can perform programmatic
login using username/password credentials.

Authentication Flow:
1. Initialize OAuth2 flow with PKCE
2. IDX Introspect to get initial state
3. Identify user (submit username)
4. Challenge/answer (submit password)
5. Follow success redirect to get authorization code
6. Exchange authorization code for tokens

Author: Claude Sonnet 4 via Cursor IDE
"""

import base64
import hashlib
import json
import secrets
import time
import uuid
from typing import Dict, Optional

import requests
from requests.adapters import HTTPAdapter
from urllib3.util.retry import Retry

from .models.base import AuthTokens


class OktaAuthenticator:
    """
    OKTA IDX Authentication client for Meijer.

    Implements the complete OAuth2 + OKTA IDX flow for programmatic authentication.
    """

    def __init__(self):
        """Initialize the OKTA authenticator."""
        # OKTA configuration (extracted from logs)
        self.okta_domain = "id.meijer.com"
        self.client_id = "0oa1o8g9njWsUvwsx697"
        self.redirect_uri = "com.meijer.mobile.meijer:/login"
        self.scope = "openid profile offline_access"

        # API endpoints
        self.base_url = f"https://{self.okta_domain}"
        self.oauth_authorize_url = f"{self.base_url}/oauth2/default/v1/authorize"
        self.oauth_token_url = f"{self.base_url}/oauth2/default/v1/token"
        self.idx_introspect_url = f"{self.base_url}/idp/idx/introspect"
        self.idx_identify_url = f"{self.base_url}/idp/idx/identify"
        self.idx_challenge_url = f"{self.base_url}/idp/idx/challenge/answer"
        self.login_redirect_url = f"{self.base_url}/login/token/redirect"

        # Session setup
        self.session = requests.Session()
        self.session.headers.update(
            {
                "User-Agent": "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36",
                "Accept": "application/json; okta-version=1.0.0",
                "Content-Type": "application/json",
                "Origin": self.base_url,
                "X-Requested-With": "com.duckduckgo.mobile.android",
                "Sec-Fetch-Site": "same-origin",
                "Sec-Fetch-Mode": "cors",
                "Sec-Fetch-Dest": "empty",
                "Accept-Language": "en-US,en;q=0.9",
                "Accept-Encoding": "gzip, deflate, br",
            }
        )

        # Add retry strategy
        retry_strategy = Retry(
            total=3,
            backoff_factor=1,
            status_forcelist=[429, 500, 502, 503, 504],
        )
        adapter = HTTPAdapter(max_retries=retry_strategy)
        self.session.mount("http://", adapter)
        self.session.mount("https://", adapter)

        # Flow state
        self.state_token = None
        self.state_handle = None
        self.code_verifier = None
        self.code_challenge = None

    def _generate_pkce_params(self) -> Dict[str, str]:
        """Generate PKCE (Proof Key for Code Exchange) parameters."""
        # Generate code verifier (random string)
        self.code_verifier = (
            base64.urlsafe_b64encode(secrets.token_bytes(32))
            .decode("utf-8")
            .rstrip("=")
        )

        # Generate code challenge (SHA256 hash of verifier)
        self.code_challenge = (
            base64.urlsafe_b64encode(
                hashlib.sha256(self.code_verifier.encode("utf-8")).digest()
            )
            .decode("utf-8")
            .rstrip("=")
        )

        return {
            "code_verifier": self.code_verifier,
            "code_challenge": self.code_challenge,
            "code_challenge_method": "S256",
        }

    def _generate_oauth_params(self) -> Dict[str, str]:
        """Generate OAuth2 parameters for the authorization flow."""
        pkce_params = self._generate_pkce_params()

        return {
            "client_id": self.client_id,
            "scope": self.scope,
            "redirect_uri": self.redirect_uri,
            "response_type": "code",
            "response_mode": "query",
            "state": str(uuid.uuid4()),
            "nonce": str(uuid.uuid4()),
            "login_hint": "",
            **pkce_params,
        }

    def _generate_device_fingerprint(self) -> str:
        """Generate device fingerprint for OKTA authentication."""
        # This is a simplified version based on observed patterns
        device_id = "d9722ea8535ee85f"  # From logs
        timestamp = str(int(time.time() * 1000))

        # Simple fingerprint based on observed patterns
        fingerprint_data = f"P6NbfmT5E7092Xh86HxTBXZIkgjGpXJr|{device_id}|{timestamp}"
        return fingerprint_data

    def _get_okta_headers(self) -> Dict[str, str]:
        """Get OKTA-specific headers for IDX requests."""
        return {
            "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
            "X-Device-Fingerprint": self._generate_device_fingerprint(),
        }

    def _extract_state_token_from_authorization(self) -> Optional[str]:
        """
        Extract state token from OAuth2 authorization response.

        This is the key step that bypasses the browser redirect.
        We make the authorization request and extract the state token
        from the response HTML or cookies.
        """
        try:
            print("🔍 Step 1: Extracting state token from OAuth2 authorization...")

            # Generate OAuth2 parameters
            oauth_params = self._generate_oauth_params()

            # Make the authorization request
            response = self.session.get(
                self.oauth_authorize_url, params=oauth_params, allow_redirects=False
            )

            if response.status_code != 200:
                print(f"❌ OAuth2 authorization failed: {response.status_code}")
                return None

            # Look for state token in cookies
            state_token = None
            for cookie in response.headers.get("Set-Cookie", "").split(","):
                if "stateToken" in cookie or "token" in cookie:
                    # Extract token value from cookie
                    if "=" in cookie:
                        state_token = cookie.split("=")[1].split(";")[0]
                        break

            # If not in cookies, try to extract from response HTML
            if not state_token and response.content:
                content = response.content.decode("utf-8", errors="ignore")

                # Look for state token in JavaScript or hidden fields
                import re

                # Pattern 1: Look for stateToken in JavaScript
                state_pattern = r'stateToken["\']?\s*[:=]\s*["\']([^"\']+)["\']'
                match = re.search(state_pattern, content)
                if match:
                    state_token = match.group(1)
                    print("✅ Found state token in JavaScript")

                # Pattern 2: Look for hidden input field
                if not state_token:
                    hidden_pattern = r'<input[^>]*name=["\']stateToken["\'][^>]*value=["\']([^"\']+)["\']'
                    match = re.search(hidden_pattern, content)
                    if match:
                        state_token = match.group(1)
                        print("✅ Found state token in hidden input")

                # Pattern 3: Look for state token in URL parameters
                if not state_token:
                    url_pattern = r"stateToken=([^&\s]+)"
                    match = re.search(url_pattern, content)
                    if match:
                        state_token = match.group(1)
                        print("✅ Found state token in URL")

            if state_token:
                print(f"✅ State token extracted: {state_token[:30]}...")
                return state_token
            else:
                print("❌ Could not extract state token from authorization response")
                print(
                    "💡 This might require additional analysis of the response format"
                )
                return None

        except Exception as e:
            print(f"❌ Error extracting state token: {e}")
            return None

    def _introspect_initial_state(self, state_token: str) -> Optional[Dict]:
        """Perform IDX introspect to get initial authentication state."""
        try:
            print("🔍 Step 2: IDX Introspect (getting initial state)...")

            headers = self._get_okta_headers()

            response = self.session.post(
                self.idx_introspect_url,
                json={"stateToken": state_token},
                headers=headers,
            )

            if response.status_code == 200:
                data = response.json()

                # Extract state handle for next step
                if "stateHandle" in data:
                    self.state_handle = data["stateHandle"]
                    print(f"✅ State handle obtained: {self.state_handle[:30]}...")

                # Check available remediation steps
                if "remediation" in data and "value" in data["remediation"]:
                    steps = data["remediation"]["value"]
                    print(
                        f"📋 Available authentication steps: {[step.get('name', 'unknown') for step in steps]}"
                    )

                return data
            else:
                print(f"❌ IDX introspect failed: {response.status_code}")
                if response.content:
                    print(
                        f"   Response: {response.content.decode('utf-8', errors='ignore')[:200]}..."
                    )
                return None

        except Exception as e:
            print(f"❌ IDX introspect error: {e}")
            return None

    def _identify_user(self, username: str) -> Optional[Dict]:
        """Submit username for identification."""
        try:
            if not self.state_handle:
                print("❌ No state handle available for user identification")
                return None

            print(f"👤 Step 3: User identification ({username})...")

            headers = self._get_okta_headers()

            response = self.session.post(
                self.idx_identify_url,
                json={"identifier": username, "stateHandle": self.state_handle},
                headers=headers,
            )

            if response.status_code == 200:
                data = response.json()

                # Update state handle for next step
                if "stateHandle" in data:
                    self.state_handle = data["stateHandle"]
                    print(f"✅ State handle updated: {self.state_handle[:30]}...")

                # Check if we need to proceed to password challenge
                if "remediation" in data and "value" in data["remediation"]:
                    steps = data["remediation"]["value"]
                    next_step = next(
                        (step for step in steps if step.get("name") == "challenge"),
                        None,
                    )
                    if next_step:
                        print("✅ Username accepted, proceeding to password challenge")
                    else:
                        print("⚠️ Username accepted but unexpected next step")

                return data
            else:
                print(f"❌ User identification failed: {response.status_code}")
                if response.content:
                    print(
                        f"   Response: {response.content.decode('utf-8', errors='ignore')[:200]}..."
                    )
                return None

        except Exception as e:
            print(f"❌ User identification error: {e}")
            return None

    def _submit_password(self, password: str) -> Optional[Dict]:
        """Submit password for authentication."""
        try:
            if not self.state_handle:
                print("❌ No state handle available for password submission")
                return None

            print("🔐 Step 4: Password challenge...")

            headers = self._get_okta_headers()

            response = self.session.post(
                self.idx_challenge_url,
                json={
                    "credentials": {"passcode": password},
                    "stateHandle": self.state_handle,
                },
                headers=headers,
            )

            if response.status_code == 200:
                data = response.json()

                # Update state handle for next step
                if "stateHandle" in data:
                    self.state_handle = data["stateHandle"]
                    print(f"✅ State handle updated: {self.state_handle[:30]}...")

                # Check if authentication was successful
                if (
                    "success" in data
                    and data["success"].get("name") == "success-redirect"
                ):
                    redirect_url = data["success"].get("href", "")
                    print(f"✅ Password accepted! Redirect URL: {redirect_url}")
                    return data
                else:
                    print("⚠️ Password accepted but no success redirect found")
                    print(f"   Response: {json.dumps(data, indent=2)[:300]}...")
                    return data
            else:
                print(f"❌ Password submission failed: {response.status_code}")
                if response.content:
                    print(
                        f"   Response: {response.content.decode('utf-8', errors='ignore')[:200]}..."
                    )
                return None

        except Exception as e:
            print(f"❌ Password submission error: {e}")
            return None

    def _follow_success_redirect(self, redirect_url: str) -> Optional[str]:
        """Follow the success redirect to get the authorization code."""
        try:
            print("🔄 Step 5: Following success redirect...")

            # Extract stateToken from redirect URL
            if "stateToken=" in redirect_url:
                state_token = redirect_url.split("stateToken=")[1].split("&")[0]
                print(f"✅ Extracted state token from redirect: {state_token[:30]}...")
            else:
                print("❌ No stateToken found in redirect URL")
                return None

            # Follow the redirect to get the authorization code
            response = self.session.get(redirect_url, allow_redirects=False)

            if response.status_code in [301, 302, 303, 307, 308]:
                location = response.headers.get("Location", "")
                print(f"✅ Redirect location: {location}")

                # Extract authorization code from the callback URL
                if "code=" in location:
                    auth_code = location.split("code=")[1].split("&")[0]
                    print(f"🎉 Authorization code captured: {auth_code[:20]}...")
                    return auth_code
                else:
                    print("❌ No authorization code found in redirect location")
                    return None
            else:
                print(f"❌ Unexpected response status: {response.status_code}")
                return None

        except Exception as e:
            print(f"❌ Error following success redirect: {e}")
            return None

    def _exchange_code_for_tokens(
        self, authorization_code: str
    ) -> Optional[AuthTokens]:
        """Exchange authorization code for access and refresh tokens."""
        try:
            print("🎟️ Step 6: Exchanging authorization code for tokens...")

            response = self.session.post(
                self.oauth_token_url,
                data={
                    "client_id": self.client_id,
                    "grant_type": "authorization_code",
                    "code": authorization_code,
                    "redirect_uri": self.redirect_uri,
                    "code_verifier": self.code_verifier,
                },
                headers={"Content-Type": "application/x-www-form-urlencoded"},
            )

            if response.status_code == 200:
                token_data = response.json()
                print("✅ Token exchange successful!")

                return AuthTokens(
                    access_token=token_data["access_token"],
                    refresh_token=token_data["refresh_token"],
                    expires_in=token_data["expires_in"],
                    token_type=token_data.get("token_type", "Bearer"),
                )
            else:
                print(f"❌ Token exchange failed: {response.status_code}")
                if response.content:
                    print(
                        f"   Response: {response.content.decode('utf-8', errors='ignore')[:200]}..."
                    )
                return None

        except Exception as e:
            print(f"❌ Token exchange error: {e}")
            return None

    def authenticate(self, username: str, password: str) -> Optional[AuthTokens]:
        """
        Perform complete OKTA authentication with username/password.

        Args:
            username: User's email address
            password: User's password

        Returns:
            AuthTokens object with access and refresh tokens, or None if failed
        """
        try:
            print("🔐 Starting OKTA authentication flow...")
            print("=" * 50)

            # Step 1: Extract state token from OAuth2 authorization
            self.state_token = self._extract_state_token_from_authorization()
            if not self.state_token:
                print("❌ Failed to extract state token - cannot proceed")
                return None

            # Step 2: IDX Introspect to get initial state
            introspect_data = self._introspect_initial_state(self.state_token)
            if not introspect_data:
                print("❌ Failed to introspect initial state - cannot proceed")
                return None

            # Step 3: User identification
            identify_data = self._identify_user(username)
            if not identify_data:
                print("❌ Failed to identify user - cannot proceed")
                return None

            # Step 4: Password challenge
            challenge_data = self._submit_password(password)
            if not challenge_data:
                print("❌ Failed to submit password - cannot proceed")
                return None

            # Step 5: Follow success redirect to get authorization code
            if "success" in challenge_data and challenge_data["success"].get("href"):
                redirect_url = challenge_data["success"]["href"]
                authorization_code = self._follow_success_redirect(redirect_url)
                if not authorization_code:
                    print("❌ Failed to capture authorization code - cannot proceed")
                    return None
            else:
                print("❌ No success redirect found in challenge response")
                return None

            # Step 6: Exchange authorization code for tokens
            tokens = self._exchange_code_for_tokens(authorization_code)
            if not tokens:
                print("❌ Failed to exchange authorization code for tokens")
                return None

            print("🎉 Authentication flow completed successfully!")
            print(f"🔑 Access token: {tokens.access_token[:30]}...")
            print(f"🔄 Refresh token: {tokens.refresh_token[:30]}...")
            print(f"⏰ Expires in: {tokens.expires_in} seconds")

            return tokens

        except Exception as e:
            print(f"❌ Authentication failed with exception: {e}")
            return None


def authenticate_with_credentials(username: str, password: str) -> Optional[AuthTokens]:
    """
    Convenience function to authenticate with OKTA using username/password.

    Args:
        username: User's email address
        password: User's password

    Returns:
        AuthTokens object with access and refresh tokens, or None if failed
    """
    authenticator = OktaAuthenticator()
    return authenticator.authenticate(username, password)


if __name__ == "__main__":
    # Example usage
    print("🔐 OKTA Authentication Demo")
    print("=" * 40)

    # Note: This is a demonstration of the discovered flow
    # Full implementation requires proper OAuth2 redirect handling
    username = "meijer.com@eabi.xyz"  # From logs
    password = "your_password_here"

    tokens = authenticate_with_credentials(username, password)
    if tokens:
        print("✅ Authentication successful!")
        print(f"🔑 Access token: {tokens.access_token[:30]}...")
        print(f"🔄 Refresh token: {tokens.refresh_token[:30]}...")
    else:
        print("❌ Authentication failed")
