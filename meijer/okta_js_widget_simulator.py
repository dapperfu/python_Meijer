#!/usr/bin/env python3
"""
OKTA JavaScript Widget Simulator

This module simulates the behavior of the Okta Sign-In Widget to bypass
Akamai protection and perform programmatic authentication.

The approach mimics the JavaScript widget's behavior:
1. Load the OAuth2 page with proper browser headers
2. Simulate JavaScript execution to initialize the widget
3. Submit credentials through the widget's API endpoints
4. Handle the authentication flow as the widget would
"""

import json
import re
from typing import Any, Dict, Optional
from urllib.parse import urlencode

import requests


class OktaJSWidgetSimulator:
    """Simulates the Okta Sign-In Widget JavaScript behavior."""

    def __init__(self, username: str, password: str):
        self.username = username
        self.password = password
        self.base_url = "https://id.meijer.com"
        self.oauth_authorize_url = f"{self.base_url}/oauth2/default/v1/authorize"
        self.session = requests.Session()

        # Widget state
        self.widget_state = {}
        self.widget_config = {}

        # Set up headers to mimic a real browser with JavaScript enabled
        self.session.headers.update(
            {
                "User-Agent": "Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0",
                "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                "Accept-Language": "en-US,en;q=0.5",
                "Accept-Encoding": "gzip, deflate, br, zstd",
                "DNT": "1",
                "Connection": "keep-alive",
                "Upgrade-Insecure-Requests": "1",
                "Sec-Fetch-Dest": "document",
                "Sec-Fetch-Mode": "navigate",
                "Sec-Fetch-Site": "none",
                "Sec-Fetch-User": "?1",
            }
        )

    def authenticate(self) -> Optional[str]:
        """
        Perform authentication by simulating the JavaScript widget behavior.

        Returns:
            Authorization code if successful, None otherwise
        """
        print("🔐 Starting OKTA JavaScript Widget Simulation")
        print("=" * 50)

        try:
            # The key insight: do everything in one continuous session to avoid token expiration
            # Step 1: Load OAuth2 page, extract config, and immediately call IDX introspect
            print("📡 Step 1: Loading OAuth2 page and extracting stateToken...")
            if not self._initialize_widget():
                return None

            print("📡 Step 2: Extracting widget configuration...")
            if not self._extract_widget_config():
                return None

            # Immediately call IDX introspect while stateToken is fresh
            print(
                "📡 Step 3: Immediately calling IDX introspect (to avoid session expiration)..."
            )
            if not self._simulate_widget_init():
                return None

            # Step 4: Submit credentials through widget API
            print("📡 Step 4: Submitting credentials through widget...")
            auth_result = self._submit_credentials_via_widget()
            if not auth_result:
                return None

            # Step 5: Handle authentication response
            print("📡 Step 5: Processing authentication response...")
            auth_code = self._process_auth_response(auth_result)
            if auth_code:
                print(
                    f"🎉 Authentication successful! Authorization code: {auth_code[:20]}..."
                )
                return auth_code
            else:
                print("❌ Failed to get authorization code")
                return None

        except Exception as e:
            print(f"❌ Error in widget simulation: {e}")
            return None

    def _initialize_widget(self) -> bool:
        """Initialize the widget by loading the OAuth2 page and resources."""
        try:
            # Build the OAuth2 URL with proper parameters
            params = {
                "response_type": "code",
                "client_id": "0oa22cbewuCICOsKz697",
                "scope": "openid offline_access",
                "redirect_uri": "https://www.meijer.com/bin/meijer/signin/v3/callback",
                "state": "https://www.meijer.com/",
            }

            url = f"{self.oauth_authorize_url}?{urlencode(params)}"
            print(f"🌐 Loading: {url}")

            response = self.session.get(url, allow_redirects=True)
            print(
                f"📥 Response: {response.status_code} ({len(response.content)} bytes)"
            )

            if response.status_code == 200:
                self.oauth_page_content = response.text
                return True
            else:
                print(f"❌ Failed to load OAuth2 page: {response.status_code}")
                return False

        except Exception as e:
            print(f"❌ Error loading OAuth2 page: {e}")
            return False

    def _extract_widget_config(self) -> bool:
        """Extract widget configuration from the OAuth2 page."""
        try:
            # Extract stateToken (this is critical for the widget)
            state_token_pattern = r'"stateToken":"([^"]+)"'
            match = re.search(state_token_pattern, self.oauth_page_content)

            if match:
                self.widget_config["stateToken"] = match.group(1)
                print(
                    f"✅ Extracted stateToken: {self.widget_config['stateToken'][:50]}..."
                )

                # Debug: Print session cookies to understand the state
                print(
                    f"🍪 Session cookies after OAuth2 request: {len(self.session.cookies)} cookies"
                )
                for cookie in self.session.cookies:
                    print(
                        f"   🔑 {cookie.name}: {cookie.value[:30]}... (domain: {cookie.domain})"
                    )

            else:
                print("❌ Could not extract stateToken")
                return False

            # Extract other widget configuration
            self.widget_config.update(
                {
                    "baseUrl": self.base_url,
                    "clientId": "0oa22cbewuCICOsKz697",
                    "redirectUri": "https://www.meijer.com/bin/meijer/signin/v3/callback",
                    "authParams": {
                        "issuer": f"{self.base_url}/oauth2/default",
                        "responseType": "code",
                        "display": "page",
                    },
                }
            )

            print("✅ Widget configuration extracted")
            return True

        except Exception as e:
            print(f"❌ Error extracting widget config: {e}")
            return False

    def _simulate_widget_init(self) -> bool:
        """Simulate the widget initialization calls."""
        try:
            print("💡 Simulating widget initialization sequence...")

            # The JavaScript widget makes several initialization calls
            # Let's simulate these based on the network patterns observed

            # Step 1: Call IDX introspect to get initial state
            introspect_url = f"{self.base_url}/idp/idx/introspect"

            # Use the exact same headers as the working direct API approach
            headers = {
                "Accept": "application/ion+json; okta-version=1.0.0",
                "Content-Type": "application/ion+json; okta-version=1.0.0",
                "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
                "Origin": "https://id.meijer.com",
                "Sec-Fetch-Dest": "empty",
                "Sec-Fetch-Mode": "cors",
                "Sec-Fetch-Site": "same-origin",
                # Add the browser-like headers that the working approach uses
                "User-Agent": "Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0",
                "Accept-Language": "en-US,en;q=0.5",
                "Accept-Encoding": "gzip, deflate, br, zstd",
            }

            data = {"stateToken": self.widget_config["stateToken"]}

            print(f"🌐 Calling widget introspect: {introspect_url}")
            print(f"📤 Request body: {json.dumps(data, indent=2)}")

            response = self.session.post(introspect_url, json=data, headers=headers)
            print(
                f"📥 Introspect response: {response.status_code} ({len(response.content)} bytes)"
            )

            if response.status_code == 200:
                try:
                    introspect_data = response.json()
                    self.widget_state = introspect_data
                    print("✅ Widget initialization successful")

                    # Extract stateHandle for subsequent calls
                    if "stateHandle" in introspect_data:
                        self.widget_config["stateHandle"] = introspect_data[
                            "stateHandle"
                        ]
                        print(
                            f"✅ Got stateHandle: {self.widget_config['stateHandle'][:50]}..."
                        )

                    # Debug: Print the response structure like the working approach
                    print("📄 Response structure:")
                    print(f"   - Keys: {list(introspect_data.keys())}")

                    if "remediation" in introspect_data:
                        remediation = introspect_data["remediation"]
                        print(
                            f"   - Remediation type: {remediation.get('type', 'unknown')}"
                        )

                        if (
                            remediation.get("type") == "array"
                            and "value" in remediation
                        ):
                            value = remediation["value"]
                            print(f"   - Remediation options: {len(value)} items")
                            for i, item in enumerate(value):
                                if isinstance(item, dict):
                                    name = item.get("name", "unknown")
                                    href = item.get("href", "no-href")
                                    method = item.get("method", "no-method")
                                    print(f"     {i+1}. {name} -> {method} {href}")

                    return True

                except json.JSONDecodeError as e:
                    print(f"❌ Failed to parse introspect response: {e}")
                    print(f"📄 Response content: {response.text[:500]}...")
                    return False
            elif response.status_code == 401:
                print(f"❌ Widget initialization unauthorized: {response.status_code}")
                print(f"📄 Response content: {response.text[:500]}...")
                print(
                    "💡 This suggests we may need to use the same session cookies as the OAuth2 request"
                )
                return False
            else:
                print(f"❌ Widget initialization failed: {response.status_code}")
                print(f"📄 Response content: {response.text[:500]}...")
                return False

        except Exception as e:
            print(f"❌ Error in widget initialization: {e}")
            return False

    def _submit_credentials_via_widget(self) -> Optional[Dict[str, Any]]:
        """Submit credentials using widget-like behavior."""
        try:
            print("💡 Simulating widget credential submission...")

            # The widget uses specific patterns to submit credentials
            # Let's try multiple approaches that mimic widget behavior

            # Approach 1: Try to use the widget's internal API patterns
            return self._try_widget_api_submission()

        except Exception as e:
            print(f"❌ Error in widget credential submission: {e}")
            return None

    def _try_widget_api_submission(self) -> Optional[Dict[str, Any]]:
        """Try to submit credentials using widget API patterns."""
        try:
            # Since we now know the widget initialization works, let's try several approaches
            # to submit credentials that mimic widget behavior

            # Method 1: Try with the exact same headers that worked for IDX introspect
            print(
                "🔄 Trying widget-style credential submission with verified headers..."
            )

            headers = {
                "Accept": "application/ion+json; okta-version=1.0.0",
                "Content-Type": "application/ion+json; okta-version=1.0.0",
                "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
                "Origin": "https://id.meijer.com",
                "Sec-Fetch-Dest": "empty",
                "Sec-Fetch-Mode": "cors",
                "Sec-Fetch-Site": "same-origin",
                "User-Agent": "Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0",
                "Accept-Language": "en-US,en;q=0.5",
                "Accept-Encoding": "gzip, deflate, br, zstd",
                # Add some widget-specific headers that might help
                "X-Requested-With": "XMLHttpRequest",
                "Cache-Control": "no-cache",
                "Pragma": "no-cache",
            }

            # Prepare the request body exactly like the working direct API approach
            data = {
                "stateHandle": self.widget_config.get("stateHandle"),
                "identifier": self.username,
                "credentials": {"passcode": self.password},
            }

            url = f"{self.base_url}/idp/idx/identify"
            print(f"🌐 Widget-style submission to: {url}")
            print(f"👤 Username: {self.username}")
            print(f"🔑 Password: {'*' * len(self.password)}")
            print(f"🍪 Session cookies: {len(self.session.cookies)} cookies")

            # Print key cookies for debugging
            for cookie in self.session.cookies:
                if any(
                    key in cookie.name.lower()
                    for key in ["session", "jsession", "dt", "bm_"]
                ):
                    print(f"   🔑 {cookie.name}: {cookie.value[:30]}...")

            response = self.session.post(url, json=data, headers=headers)
            print(
                f"📥 Widget submission response: {response.status_code} ({len(response.content)} bytes)"
            )

            if response.status_code == 200:
                try:
                    response_data = response.json()
                    print("✅ Widget-style submission successful!")

                    # Check for MFA requirements or success indicators
                    if self._check_mfa_required(response_data):
                        print("📱 MFA required - this is expected behavior")
                        return {"requires_mfa": True, "response_data": response_data}

                    # Look for authorization code or success indicators
                    auth_code = self._extract_auth_code_from_response(response_data)
                    if auth_code:
                        return {"auth_code": auth_code}

                    return response_data

                except json.JSONDecodeError:
                    print("❌ Failed to parse widget response as JSON")
                    print(f"📄 Response content: {response.text[:500]}...")
                    return None
            elif response.status_code == 403:
                print(
                    "❌ Widget submission blocked by Akamai - trying alternative methods..."
                )
                # Try alternative widget approaches
                return self._try_alternative_widget_methods()
            else:
                print(f"❌ Widget submission failed: {response.status_code}")
                print(f"📄 Response: {response.text[:500]}...")
                return None

        except Exception as e:
            print(f"❌ Error in widget API submission: {e}")
            return None

    def _check_mfa_required(self, response_data: Dict[str, Any]) -> bool:
        """Check if MFA is required based on the response."""
        try:
            # Look for MFA indicators in the response
            remediation = response_data.get("remediation", {})
            if isinstance(remediation, dict) and remediation.get("type") == "array":
                value = remediation.get("value", [])
                if isinstance(value, list):
                    for item in value:
                        if isinstance(item, dict) and "name" in item:
                            name = item.get("name", "")
                            if any(
                                mfa_indicator in name.lower()
                                for mfa_indicator in [
                                    "mfa",
                                    "factor",
                                    "challenge",
                                    "verify",
                                    "select-authenticator",
                                ]
                            ):
                                return True
            return False
        except Exception:
            return False

    def _extract_auth_code_from_response(
        self, response_data: Dict[str, Any]
    ) -> Optional[str]:
        """Extract authorization code from response data."""
        try:
            # Look for various auth code patterns
            response_str = json.dumps(response_data)

            patterns = [
                r'code=([^&\s"\']+)',
                r'"code":"([^"]+)"',
                r"'code':'([^']+)'",
                r'authorization_code["\']?\s*:\s*["\']([^"\']+)["\']',
            ]

            for pattern in patterns:
                match = re.search(pattern, response_str)
                if match:
                    return match.group(1)

            return None
        except Exception:
            return None

    def _try_alternative_widget_methods(self) -> Optional[Dict[str, Any]]:
        """Try alternative methods that mimic different widget behaviors."""
        try:
            print("💡 Trying alternative widget simulation methods...")

            # Method 1: Simulate AJAX form submission (like the widget might do)
            print("🔄 Trying AJAX-style submission...")

            headers = {
                "Accept": "application/json, text/javascript, */*; q=0.01",
                "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
                "X-Requested-With": "XMLHttpRequest",
                "Origin": "https://id.meijer.com",
                "Referer": self.oauth_authorize_url,
                "Sec-Fetch-Dest": "empty",
                "Sec-Fetch-Mode": "cors",
                "Sec-Fetch-Site": "same-origin",
            }

            # Prepare form-encoded data (like a traditional form submission)
            form_data = {
                "stateHandle": self.widget_config.get("stateHandle"),
                "identifier": self.username,
                "passcode": self.password,
                # Add hidden fields that might be present
                "authenticity_token": "",  # Often present in forms
                "_method": "POST",
            }

            url = f"{self.base_url}/idp/idx/identify"
            response = self.session.post(url, data=form_data, headers=headers)
            print(
                f"📥 AJAX submission response: {response.status_code} ({len(response.content)} bytes)"
            )

            if response.status_code == 200:
                try:
                    response_data = response.json()
                    print("✅ AJAX-style submission successful!")
                    return response_data
                except json.JSONDecodeError:
                    # Try to parse as HTML and extract information
                    content = response.text
                    if "code=" in content:
                        auth_code_match = re.search(r"code=([^&\s]+)", content)
                        if auth_code_match:
                            auth_code = auth_code_match.group(1)
                            print(
                                f"✅ Found authorization code in response: {auth_code[:20]}..."
                            )
                            return {"auth_code": auth_code}

                    print("✅ Got HTML response - checking for redirect or code")
                    return {"success": True, "content": content}

            # Method 2: Try using the /signin endpoint with widget simulation
            print("🔄 Trying /signin endpoint with widget headers...")

            signin_url = f"{self.base_url}/signin"
            signin_headers = headers.copy()
            signin_headers.update(
                {
                    "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                    "Content-Type": "application/x-www-form-urlencoded",
                }
            )

            signin_response = self.session.post(
                signin_url, data=form_data, headers=signin_headers
            )
            print(
                f"📥 Signin response: {signin_response.status_code} ({len(signin_response.content)} bytes)"
            )

            if signin_response.status_code == 200:
                content = signin_response.text
                if "code=" in content:
                    auth_code_match = re.search(r"code=([^&\s]+)", content)
                    if auth_code_match:
                        auth_code = auth_code_match.group(1)
                        print(
                            f"✅ Found authorization code in signin response: {auth_code[:20]}..."
                        )
                        return {"auth_code": auth_code}

                return {"success": True, "content": content}

            print("❌ All alternative widget methods failed")
            return None

        except Exception as e:
            print(f"❌ Error in alternative widget methods: {e}")
            return None

    def _process_auth_response(self, auth_result: Dict[str, Any]) -> Optional[str]:
        """Process the authentication response to extract the authorization code."""
        try:
            # Check if we already have an authorization code
            if "auth_code" in auth_result:
                return auth_result["auth_code"]

            # Check if we have response content to analyze
            if "content" in auth_result:
                content = auth_result["content"]

                # Look for authorization code in various formats
                patterns = [
                    r'code=([^&\s"\']+)',
                    r'"code":"([^"]+)"',
                    r"'code':'([^']+)'",
                    r'authorization_code["\']?\s*:\s*["\']([^"\']+)["\']',
                ]

                for pattern in patterns:
                    match = re.search(pattern, content)
                    if match:
                        auth_code = match.group(1)
                        print(f"✅ Found authorization code: {auth_code[:20]}...")
                        return auth_code

                # Check for redirects or other success indicators
                if any(
                    indicator in content.lower()
                    for indicator in ["success", "redirect", "callback"]
                ):
                    print(
                        "💡 Authentication appears successful but no code found directly"
                    )
                    print("💡 May need to follow additional redirects")

            # If we have a successful response but no code, the flow might continue
            if auth_result.get("success"):
                print("💡 Authentication step completed - may need additional steps")
                return self._follow_auth_completion(auth_result)

            return None

        except Exception as e:
            print(f"❌ Error processing auth response: {e}")
            return None

    def _follow_auth_completion(self, auth_result: Dict[str, Any]) -> Optional[str]:
        """Follow the authentication completion flow to get the final code."""
        try:
            print("💡 Following authentication completion flow...")

            # The widget might redirect or make additional calls
            # Try to follow the OAuth2 callback flow
            callback_url = "https://www.meijer.com/bin/meijer/signin/v3/callback"

            # Add any state or session parameters
            params = {"state": "https://www.meijer.com/"}

            print(f"🌐 Following callback: {callback_url}")
            response = self.session.get(
                callback_url,
                params=params,
                headers={
                    "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                    "Referer": self.oauth_authorize_url,
                },
            )

            print(
                f"📥 Callback response: {response.status_code} ({len(response.content)} bytes)"
            )

            if response.status_code == 200:
                content = response.text
                # Look for authorization code in the callback response
                code_match = re.search(r'code=([^&\s"\']+)', content)
                if code_match:
                    auth_code = code_match.group(1)
                    print(
                        f"✅ Found authorization code in callback: {auth_code[:20]}..."
                    )
                    return auth_code

            return None

        except Exception as e:
            print(f"❌ Error following auth completion: {e}")
            return None


def authenticate_with_js_widget(username: str, password: str) -> Optional[str]:
    """
    Convenience function to authenticate using the JavaScript widget simulator.

    Args:
        username: User's email address
        password: User's password

    Returns:
        Authorization code if successful, None otherwise
    """
    simulator = OktaJSWidgetSimulator(username, password)
    return simulator.authenticate()


if __name__ == "__main__":
    # Example usage
    print("🔐 OKTA JavaScript Widget Simulator Demo")
    print("=" * 50)

    username = "test@example.com"  # Replace with actual username
    password = "test_password"  # Replace with actual password

    auth_code = authenticate_with_js_widget(username, password)
    if auth_code:
        print("✅ Authentication successful!")
        print(f"🔑 Authorization code: {auth_code[:30]}...")
    else:
        print("❌ Authentication failed")
