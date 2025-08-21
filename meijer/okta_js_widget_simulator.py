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
            # NEW APPROACH: Skip the problematic IDX introspect and go straight to credential submission
            # Step 1: Load OAuth2 page to establish session
            print("📡 Step 1: Loading OAuth2 page to establish session...")
            if not self._initialize_widget():
                return None

            # Step 2: Extract minimal config (just what we need)
            print("📡 Step 2: Extracting minimal widget configuration...")
            if not self._extract_widget_config():
                return None

            # Step 3: SKIP IDX introspect (it's causing session expiration issues)
            # Instead, go straight to credential submission
            print(
                "📡 Step 3: Skipping IDX introspect (bypassing session expiration)..."
            )

            # Step 4: Try alternative authentication endpoints first (bypass Akamai)
            print("📡 Step 4: Trying alternative authentication endpoints...")
            auth_result = self._try_alternative_auth_endpoints()

            # If alternative endpoints fail, try direct submission as fallback
            if not auth_result:
                print(
                    "📡 Step 4b: Alternative endpoints failed, trying direct submission..."
                )
                auth_result = self._submit_credentials_direct()
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

            # NEW: Analyze the OAuth2 page content to find alternative authentication methods
            print("🔍 Analyzing OAuth2 page content for authentication methods...")

            # Look for login forms
            if "login" in self.oauth_page_content.lower():
                print("✅ Found login-related content in OAuth2 page")

                # Look for form action URLs
                form_action_pattern = r'<form[^>]*action="([^"]*)"'
                form_actions = re.findall(form_action_pattern, self.oauth_page_content)
                if form_actions:
                    print(f"📝 Found form actions: {form_actions}")
                    self.widget_config["form_actions"] = form_actions

                # Look for signin endpoints
                signin_pattern = r'["\']([^"\']*signin[^"\']*)["\']'
                signin_urls = re.findall(signin_pattern, self.oauth_page_content)
                if signin_urls:
                    print(f"🔐 Found signin URLs: {signin_urls}")
                    self.widget_config["signin_urls"] = signin_urls

                # Look for authentication endpoints
                auth_pattern = r'["\']([^"\']*auth[^"\']*)["\']'
                auth_urls = re.findall(auth_pattern, self.oauth_page_content)
                if auth_urls:
                    print(f"🔑 Found auth URLs: {auth_urls}")
                    self.widget_config["auth_urls"] = auth_urls

                # Look for JavaScript authentication calls
                js_auth_pattern = r'["\']([^"\']*authenticate[^"\']*)["\']'
                js_auth_urls = re.findall(js_auth_pattern, self.oauth_page_content)
                if js_auth_urls:
                    print(f"⚡ Found JavaScript auth URLs: {js_auth_urls}")
                    self.widget_config["js_auth_urls"] = js_auth_urls
            else:
                print("⚠️ No login content found in OAuth2 page")

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
                    "❌ Direct submission blocked by Akamai - trying alternative endpoints..."
                )
                # Try alternative authentication endpoints found in the OAuth2 page
                return self._try_alternative_auth_endpoints()
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

    def _extract_auth_code_from_response(self, response_content: Any) -> Optional[str]:
        """
        Extract authorization code from various response formats.

        Args:
            response_content: Response content (string, dict, or response object)

        Returns:
            Authorization code if found, None otherwise
        """
        try:
            # Handle different input types
            if hasattr(response_content, "text"):
                content = response_content.text
            elif isinstance(response_content, dict):
                content = str(response_content)
            else:
                content = str(response_content)

            # Look for authorization code in various formats
            patterns = [
                r'code=([^&\s"\']+)',
                r'"code":"([^"]+)"',
                r"'code':'([^']+)'",
                r'authorization_code["\']?\s*:\s*["\']([^"\']+)["\']',
                r'["\']access_token["\']?\s*:\s*["\']([^"\']+)["\']',
                r'["\']token["\']?\s*:\s*["\']([^"\']+)["\']',
            ]

            for pattern in patterns:
                match = re.search(pattern, content)
                if match:
                    auth_code = match.group(1)
                    print(f"✅ Found authorization code: {auth_code[:20]}...")
                    return auth_code

            print("❌ No authorization code found in response")
            return None

        except Exception as e:
            print(f"❌ Error extracting authorization code: {e}")
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

    def _try_alternative_auth_endpoints(self) -> Optional[Dict[str, Any]]:
        """
        Try alternative authentication endpoints found in the OAuth2 page content.
        These might bypass Akamai blocking.
        """
        try:
            print("🔄 Trying alternative authentication endpoints from OAuth2 page...")

            # Try signin URLs first (these are often the actual login endpoints)
            if "signin_urls" in self.widget_config:
                for signin_url in self.widget_config["signin_urls"]:
                    if signin_url.startswith("http"):
                        full_url = signin_url
                    else:
                        full_url = f"{self.base_url}{signin_url}"

                    print(f"🌐 Trying signin endpoint: {full_url}")

                    # Try a GET request first to see what this endpoint contains
                    response = self.session.get(full_url, headers=self.session.headers)
                    print(
                        f"📥 Signin GET response: {response.status_code} ({len(response.content)} bytes)"
                    )

                    if response.status_code == 200:
                        print("✅ Signin endpoint accessible - analyzing content...")

                        # Look for login forms in this content
                        if (
                            "login" in response.text.lower()
                            or "username" in response.text.lower()
                        ):
                            print("🎯 Found login form in signin endpoint!")
                            return self._submit_to_signin_endpoint(full_url)

                    # Try POST with credentials
                    auth_data = {
                        "username": self.username,
                        "password": self.password,
                        "stateToken": self.widget_config.get("stateToken", ""),
                    }

                    response = self.session.post(
                        full_url, data=auth_data, headers=self.session.headers
                    )
                    print(
                        f"📥 Signin POST response: {response.status_code} ({len(response.content)} bytes)"
                    )

                    if response.status_code == 200:
                        print("✅ Signin POST successful!")
                        return self._process_signin_response(response)

            # Try auth URLs
            if "auth_urls" in self.widget_config:
                for auth_url in self.widget_config["auth_urls"]:
                    if auth_url.startswith("http"):
                        full_url = auth_url
                    else:
                        full_url = f"{self.base_url}{auth_url}"

                    print(f"🌐 Trying auth endpoint: {full_url}")

                    auth_data = {
                        "username": self.username,
                        "password": self.password,
                        "stateToken": self.widget_config.get("stateToken", ""),
                    }

                    response = self.session.post(
                        full_url, data=auth_data, headers=self.session.headers
                    )
                    print(
                        f"📥 Auth POST response: {response.status_code} ({len(response.content)} bytes)"
                    )

                    if response.status_code == 200:
                        print("✅ Auth endpoint successful!")
                        return self._process_auth_response(response)

            # Try JavaScript auth URLs
            if "js_auth_urls" in self.widget_config:
                for js_auth_url in self.widget_config["js_auth_urls"]:
                    if js_auth_url.startswith("http"):
                        full_url = js_auth_url
                    else:
                        full_url = f"{self.base_url}{js_auth_url}"

                    print(f"🌐 Trying JavaScript auth endpoint: {full_url}")

                    # Use JSON format for JavaScript endpoints
                    auth_data = {
                        "identifier": self.username,
                        "credentials": {"passcode": self.password},
                        "stateToken": self.widget_config.get("stateToken", ""),
                    }

                    headers = self.session.headers.copy()
                    headers["Content-Type"] = "application/json"

                    response = self.session.post(
                        full_url, json=auth_data, headers=headers
                    )
                    print(
                        f"📥 JS auth POST response: {response.status_code} ({len(response.content)} bytes)"
                    )

                    if response.status_code == 200:
                        print("✅ JavaScript auth endpoint successful!")
                        return self._process_js_auth_response(response)

            print("❌ No alternative endpoints worked")
            return None

        except Exception as e:
            print(f"❌ Error trying alternative endpoints: {e}")
            return None

    def _submit_to_signin_endpoint(self, signin_url: str) -> Optional[Dict[str, Any]]:
        """Submit credentials to a signin endpoint."""
        try:
            print(f"📝 Submitting to signin endpoint: {signin_url}")

            # Try different data formats
            auth_data_formats = [
                {"username": self.username, "password": self.password},
                {"identifier": self.username, "passcode": self.password},
                {"email": self.username, "password": self.password},
                {"user": self.username, "pass": self.password},
            ]

            for i, auth_data in enumerate(auth_data_formats):
                print(f"🔄 Trying format {i+1}: {list(auth_data.keys())}")

                response = self.session.post(
                    signin_url, data=auth_data, headers=self.session.headers
                )
                print(
                    f"📥 Format {i+1} response: {response.status_code} ({len(response.content)} bytes)"
                )

                if response.status_code == 200:
                    print(f"✅ Format {i+1} successful!")
                    return self._process_signin_response(response)
                elif response.status_code == 302:
                    print(f"🔄 Format {i+1} redirect - following...")
                    # Follow redirect
                    redirect_response = self.session.get(
                        response.headers.get("Location", "")
                    )
                    if redirect_response.status_code == 200:
                        return self._process_signin_response(redirect_response)

            print("❌ No signin format worked")
            return None

        except Exception as e:
            print(f"❌ Error submitting to signin endpoint: {e}")
            return None

    def _process_signin_response(self, response) -> Optional[Dict[str, Any]]:
        """Process response from signin endpoint."""
        try:
            print("📄 Processing signin response...")

            # Check if we got redirected to a success page
            if "success" in response.text.lower() or "welcome" in response.text.lower():
                print("✅ Signin appears successful!")
                return {"success": True, "response": response}

            # Check for authorization code
            auth_code = self._extract_auth_code_from_response(response.text)
            if auth_code:
                print(f"🔑 Found authorization code: {auth_code[:20]}...")
                return {"auth_code": auth_code}

            # Check for tokens
            if (
                "access_token" in response.text.lower()
                or "bearer" in response.text.lower()
            ):
                print("🔑 Found token information!")
                return {"has_tokens": True, "response": response}

            print("⚠️ Signin response unclear")
            return {"unclear": True, "response": response}

        except Exception as e:
            print(f"❌ Error processing signin response: {e}")
            return None

    def _process_auth_response(self, response) -> Optional[Dict[str, Any]]:
        """Process response from auth endpoint."""
        try:
            print("📄 Processing auth response...")

            if response.status_code == 200:
                try:
                    response_data = response.json()
                    return self._process_json_auth_response(response_data)
                except json.JSONDecodeError:
                    return self._process_text_auth_response(response.text)

            return {"status_code": response.status_code, "response": response}

        except Exception as e:
            print(f"❌ Error processing auth response: {e}")
            return None

    def _process_js_auth_response(self, response) -> Optional[Dict[str, Any]]:
        """Process response from JavaScript auth endpoint."""
        try:
            print("📄 Processing JavaScript auth response...")

            if response.status_code == 200:
                try:
                    response_data = response.json()
                    return self._process_json_auth_response(response_data)
                except json.JSONDecodeError:
                    return self._process_text_auth_response(response.text)

            return {"status_code": response.status_code, "response": response}

        except Exception as e:
            print(f"❌ Error processing JavaScript auth response: {e}")
            return None

    def _process_json_auth_response(
        self, response_data: Dict[str, Any]
    ) -> Optional[Dict[str, Any]]:
        """Process JSON auth response."""
        try:
            print(
                f"📄 Processing JSON response with keys: {list(response_data.keys())}"
            )

            # Check for MFA requirements
            if self._check_mfa_required(response_data):
                return {"requires_mfa": True, "response_data": response_data}

            # Look for authorization code
            auth_code = self._extract_auth_code_from_response(response_data)
            if auth_code:
                return {"auth_code": auth_code}

            # Check for success indicators
            if "success" in response_data or "status" in response_data:
                return {"success": True, "response_data": response_data}

            return {"response_data": response_data}

        except Exception as e:
            print(f"❌ Error processing JSON auth response: {e}")
            return None

    def _process_text_auth_response(
        self, response_text: str
    ) -> Optional[Dict[str, Any]]:
        """Process text auth response."""
        try:
            print("📄 Processing text response...")

            # Check for success indicators
            if "success" in response_text.lower() or "welcome" in response_text.lower():
                return {"success": True, "response_text": response_text}

            # Look for authorization code
            auth_code = self._extract_auth_code_from_response(response_text)
            if auth_code:
                return {"auth_code": auth_code}

            return {"response_text": response_text}

        except Exception as e:
            print(f"❌ Error processing text auth response: {e}")
            return None

    def _submit_credentials_direct(self) -> Optional[Dict[str, Any]]:
        """
        Submit credentials directly to the identify endpoint without IDX introspect.
        This bypasses the session expiration issues with the IDX flow.
        """
        try:
            print("💡 Direct credential submission (bypassing IDX introspect)...")

            # Use the exact headers that work for direct API calls
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
                "X-Requested-With": "XMLHttpRequest",
                "Cache-Control": "no-cache",
                "Pragma": "no-cache",
            }

            # Try the direct identify endpoint first (this is what the working direct API approach uses)
            identify_url = f"{self.base_url}/idp/idx/identify"

            # Prepare the request body for direct credential submission
            data = {
                "identifier": self.username,
                "credentials": {"passcode": self.password},
            }

            print(f"🌐 Direct submission to: {identify_url}")
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

            response = self.session.post(identify_url, json=data, headers=headers)
            print(
                f"📥 Direct submission response: {response.status_code} ({len(response.content)} bytes)"
            )

            if response.status_code == 200:
                try:
                    response_data = response.json()
                    print("✅ Direct credential submission successful!")
                    print(f"📄 Response keys: {list(response_data.keys())}")

                    # Check for MFA requirements or success indicators
                    if self._check_mfa_required(response_data):
                        print("📱 MFA required - this is expected behavior")
                        return {"requires_mfa": True, "response_data": response_data}

                    # Look for authorization code or success indicators
                    auth_code = self._extract_auth_code_from_response(response_data)
                    if auth_code:
                        return {"auth_code": auth_code}

                    # Check if we need to handle additional steps
                    if "remediation" in response_data:
                        print("🔄 Additional authentication steps required")
                        return self._handle_remediation_steps(response_data)

                    return response_data

                except json.JSONDecodeError:
                    print("❌ Failed to parse direct response as JSON")
                    print(f"📄 Response content: {response.text[:500]}...")
                    return None
            elif response.status_code == 403:
                print("❌ Direct submission blocked by Akamai")
                print(f"📄 Response: {response.text[:500]}...")
                return None
            else:
                print(f"❌ Direct submission failed: {response.status_code}")
                print(f"📄 Response: {response.text[:500]}...")
                return None

        except Exception as e:
            print(f"❌ Error in direct credential submission: {e}")
            return None

    def _handle_remediation_steps(
        self, response_data: Dict[str, Any]
    ) -> Optional[Dict[str, Any]]:
        """
        Handle additional authentication steps (like MFA challenges).
        """
        try:
            remediation = response_data.get("remediation", {})
            if isinstance(remediation, dict) and remediation.get("type") == "array":
                value = remediation.get("value", [])
                if isinstance(value, list):
                    for item in value:
                        if isinstance(item, dict):
                            name = item.get("name", "")
                            print(f"🔄 Found remediation step: {name}")

                            # Handle different types of remediation
                            if "challenge" in name.lower():
                                return self._handle_challenge_step(item)
                            elif "verify" in name.lower():
                                return self._handle_verify_step(item)
                            elif "enroll" in name.lower():
                                return self._handle_enroll_step(item)

            print("⚠️ Unknown remediation step - returning current response")
            return response_data

        except Exception as e:
            print(f"❌ Error handling remediation steps: {e}")
            return response_data

    def _handle_challenge_step(
        self, challenge_item: Dict[str, Any]
    ) -> Optional[Dict[str, Any]]:
        """
        Handle MFA challenge steps (like SMS verification).
        """
        try:
            print(
                f"📱 Handling challenge step: {challenge_item.get('name', 'Unknown')}"
            )

            # For now, we'll return the challenge info
            # In a real implementation, you'd prompt the user for the challenge response
            return {
                "requires_challenge": True,
                "challenge_type": challenge_item.get("name", "Unknown"),
                "challenge_data": challenge_item,
            }
        except Exception as e:
            print(f"❌ Error handling challenge step: {e}")
            return None

    def _handle_verify_step(
        self, verify_item: Dict[str, Any]
    ) -> Optional[Dict[str, Any]]:
        """
        Handle verification steps (like MFA verification).
        """
        try:
            print(f"✅ Handling verify step: {verify_item.get('name', 'Unknown')}")

            # For now, we'll return the verification info
            return {
                "requires_verification": True,
                "verification_type": verify_item.get("name", "Unknown"),
                "verification_data": verify_item,
            }
        except Exception as e:
            print(f"❌ Error handling verify step: {e}")
            return None

    def _handle_enroll_step(
        self, enroll_item: Dict[str, Any]
    ) -> Optional[Dict[str, Any]]:
        """
        Handle enrollment steps (like setting up MFA).
        """
        try:
            print(f"📝 Handling enroll step: {enroll_item.get('name', 'Unknown')}")

            # For now, we'll return the enrollment info
            return {
                "requires_enrollment": True,
                "enrollment_type": enroll_item.get("name", "Unknown"),
                "enrollment_data": enroll_item,
            }
        except Exception as e:
            print(f"❌ Error handling enroll step: {e}")
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
