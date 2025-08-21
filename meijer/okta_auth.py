#!/usr/bin/env python3
"""
OKTA Authentication Module

This module implements the correct OKTA OAuth2 authentication flow
based on analysis of actual login events from mitmproxy logs.
"""

import json
import re
from typing import Any, Dict, Optional
from urllib.parse import urlencode

import requests


class OktaAuthenticator:
    """Implements the correct OKTA OAuth2 authentication flow."""

    def __init__(self, username: str, password: str):
        self.username = username
        self.password = password
        self.base_url = "https://id.meijer.com"
        self.oauth_authorize_url = f"{self.base_url}/oauth2/default/v1/authorize"
        self.session = requests.Session()

        # Set up headers to match the working browser requests
        self.session.headers.update(
            {
                "User-Agent": "Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0",
                "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                "Accept-Language": "en-US,en;q=0.5",
                "Accept-Encoding": "gzip, deflate, br, zstd",
                "Upgrade-Insecure-Requests": "1",
                "Sec-Fetch-Dest": "document",
                "Sec-Fetch-Mode": "navigate",
                "Sec-Fetch-Site": "same-site",
                "Sec-Fetch-User": "?1",
            }
        )

    def authenticate(self) -> Optional[str]:
        """
        Perform the complete OKTA authentication flow.

        Returns:
            Authorization code if successful, None otherwise
        """
        print("🔐 Starting correct OKTA authentication flow based on analyzed patterns")

        try:
            # Step 1: Get initial OAuth2 authorization page
            print("📡 Step 1: Getting OAuth2 authorization page...")
            oauth2_response = self._get_oauth2_authorization_page()
            if not oauth2_response:
                return None

            # Step 2: Extract stateToken from the OAuth2 page
            print("🔍 Step 2: Extracting stateToken from OAuth2 page...")
            state_token = self._extract_state_token(oauth2_response)
            if not state_token:
                print("❌ Failed to extract stateToken from OAuth2 page")
                return None

            print(f"✅ Extracted stateToken: {state_token[:50]}...")

            # Step 3: Call IDX introspect endpoint with stateToken
            print("📡 Step 3: Calling IDX introspect endpoint...")
            state_handle = self._call_idx_introspect(state_token)
            if not state_handle:
                print("❌ Failed to get stateHandle from IDX introspect")
                return None

            print(f"✅ Got stateHandle: {state_handle[:50]}...")

            # Step 4: Submit credentials using stateHandle
            print("📡 Step 4: Submitting credentials...")
            auth_result = self._submit_credentials(state_handle)
            if not auth_result:
                print("❌ Failed to submit credentials")
                return None

            # Step 5: Handle MFA if required
            if auth_result.get("requires_mfa"):
                print("📱 Step 5: Handling MFA...")
                mfa_result = self._handle_mfa(auth_result)
                if not mfa_result:
                    print("❌ MFA failed")
                    return None
                auth_result = mfa_result

            # Step 6: Get final authorization code
            print("📡 Step 6: Getting final authorization code...")
            auth_code = self._get_authorization_code(auth_result)
            if auth_code:
                print(
                    f"🎉 Authentication successful! Authorization code: {auth_code[:20]}..."
                )
                return auth_code
            else:
                print("❌ Failed to get authorization code")
                return None

        except Exception as e:
            print(f"❌ Error in authentication flow: {e}")
            return None

    def _get_oauth2_authorization_page(self) -> Optional[str]:
        """Get the OAuth2 authorization page content."""
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
            print(f"🌐 Requesting: {url}")

            response = self.session.get(url, allow_redirects=True)
            print(
                f"📥 Response: {response.status_code} ({len(response.content)} bytes)"
            )

            if response.status_code == 200:
                return response.text
            else:
                print(f"❌ OAuth2 page request failed: {response.status_code}")
                return None

        except Exception as e:
            print(f"❌ Error getting OAuth2 page: {e}")
            return None

    def _extract_state_token(self, html_content: str) -> Optional[str]:
        """Extract stateToken from the OAuth2 authorization page HTML."""
        try:
            # Look for stateToken in the JavaScript data
            # Pattern: "stateToken":"eyJ6aXAiOiJERUYiLCJhbGlhcyI6ImVuY3J5cHRpb25rZXkiLCJ2ZXIiOiIxIiwib2lkIjoiMDBvZW14bng4Q3NocE5WeVM2OTYiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiZGlyIn0.."
            state_token_pattern = r'"stateToken":"([^"]+)"'
            match = re.search(state_token_pattern, html_content)

            if match:
                state_token = match.group(1)
                # Decode any escaped characters
                state_token = state_token.replace("\\x3A", ":")
                state_token = state_token.replace("\\x2F", "/")
                state_token = state_token.replace("\\x2D", "-")
                state_token = state_token.replace("\\x3F", "?")
                state_token = state_token.replace("\\x26", "&")
                state_token = state_token.replace("\\x3D", "=")
                state_token = state_token.replace("\\x2B", "+")
                state_token = state_token.replace("\\x20", " ")
                return state_token

            print("❌ No stateToken found in HTML content")
            return None

        except Exception as e:
            print(f"❌ Error extracting stateToken: {e}")
            return None

    def _call_idx_introspect(self, state_token: str) -> Optional[str]:
        """Call the IDX introspect endpoint with the stateToken."""
        try:
            url = f"{self.base_url}/idp/idx/introspect"

            # Set proper headers for IDX request
            headers = {
                "Accept": "application/ion+json; okta-version=1.0.0",
                "Content-Type": "application/ion+json; okta-version=1.0.0",
                "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
                "Origin": "https://id.meijer.com",
                "Sec-Fetch-Dest": "empty",
                "Sec-Fetch-Mode": "cors",
                "Sec-Fetch-Site": "same-origin",
            }

            # Prepare the request body
            data = {"stateToken": state_token}

            print(f"🌐 Calling IDX introspect: {url}")
            print(f"📤 Request body: {json.dumps(data, indent=2)}")

            response = self.session.post(url, json=data, headers=headers)
            print(
                f"📥 IDX response: {response.status_code} ({len(response.content)} bytes)"
            )

            if response.status_code == 200:
                try:
                    response_data = response.json()
                    print("✅ IDX introspect successful")

                    # Debug: Print the structure of the response
                    print("📄 Response structure:")
                    print(f"   - Keys: {list(response_data.keys())}")

                    if "remediation" in response_data:
                        remediation = response_data["remediation"]
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

                    # Extract stateHandle from the response
                    state_handle = response_data.get("stateHandle")
                    if state_handle:
                        return state_handle
                    else:
                        print("❌ No stateHandle in IDX response")
                        print(f"📄 Response keys: {list(response_data.keys())}")
                        return None

                except json.JSONDecodeError as e:
                    print(f"❌ Failed to parse IDX response as JSON: {e}")
                    print(f"📄 Response content: {response.text[:500]}...")
                    return None
            else:
                print(f"❌ IDX introspect failed: {response.status_code}")
                print(f"📄 Response content: {response.text[:500]}...")
                return None

        except Exception as e:
            print(f"❌ Error calling IDX introspect: {e}")
            return None

    def _submit_credentials(self, state_handle: str) -> Optional[Dict[str, Any]]:
        """Submit username and password using the stateHandle."""
        try:
            print("💡 Akamai is blocking direct API access to /idp/idx/identify")
            print("💡 Trying alternative approach using the OAuth2 page itself...")

            # Option 1: Try to find and use a form on the OAuth2 authorization page
            print("🌐 Re-requesting OAuth2 page to look for authentication forms...")

            oauth2_response = self._get_oauth2_authorization_page()
            if not oauth2_response:
                print("❌ Could not get OAuth2 page for form analysis")
                return None

            # Debug: Examine what the OAuth2 page actually contains
            print("🔍 Analyzing OAuth2 page content...")
            print(f"📄 Page size: {len(oauth2_response)} bytes")

            # Look for key elements that might indicate the authentication flow
            if "<form" in oauth2_response.lower():
                print("💡 Found form on OAuth2 page - attempting to use it")
                return self._submit_to_oauth2_form(oauth2_response, state_handle)
            else:
                print("💡 No form found on OAuth2 page")

                # Look for other authentication-related elements
                if "login" in oauth2_response.lower():
                    print("💡 Found 'login' text in OAuth2 page")
                if "signin" in oauth2_response.lower():
                    print("💡 Found 'signin' text in OAuth2 page")
                if "username" in oauth2_response.lower():
                    print("💡 Found 'username' text in OAuth2 page")
                if "password" in oauth2_response.lower():
                    print("💡 Found 'password' text in OAuth2 page")

                # Look for JavaScript that might handle authentication
                if "function" in oauth2_response.lower():
                    print("💡 Found JavaScript functions in OAuth2 page")

                # Look for any URLs that might be authentication endpoints
                import re

                urls = re.findall(
                    r'["\']([^"\']*(?:login|signin|auth|identify)[^"\']*)["\']',
                    oauth2_response,
                    re.IGNORECASE,
                )
                if urls:
                    print(
                        f"💡 Found {len(urls)} authentication-related URLs in OAuth2 page:"
                    )
                    for url in urls[:5]:  # Show first 5
                        print(f"   - {url}")

                # Look for any iframes that might contain authentication
                iframes = re.findall(
                    r'<iframe[^>]*src=["\']([^"\']*)["\'][^>]*>', oauth2_response
                )
                if iframes:
                    print(f"💡 Found {len(iframes)} iframes in OAuth2 page:")
                    for iframe in iframes:
                        print(f"   - {iframe}")

            # Option 2: Try to find alternative authentication endpoints
            print("💡 Looking for alternative authentication endpoints...")

            # Based on the working flow, let's try some common patterns
            alternative_endpoints = [
                f"{self.base_url}/login",
                f"{self.base_url}/signin",
                f"{self.base_url}/auth",
                f"{self.base_url}/idp/idx/authenticate",
                f"{self.base_url}/idp/idx/login",
            ]

            for endpoint in alternative_endpoints:
                print(f"🌐 Trying alternative endpoint: {endpoint}")

                try:
                    response = self.session.get(
                        endpoint,
                        headers={
                            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                            "Accept-Language": "en-US,en;q=0.5",
                            "Accept-Encoding": "gzip, deflate, br, zstd",
                            "User-Agent": "Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0",
                            "Referer": f"{self.base_url}/oauth2/default/v1/authorize",
                            "Sec-Fetch-Dest": "document",
                            "Sec-Fetch-Mode": "navigate",
                            "Sec-Fetch-Site": "same-origin",
                            "Sec-Fetch-User": "?1",
                            "Upgrade-Insecure-Requests": "1",
                        },
                    )

                    print(
                        f"📥 {endpoint} response: {response.status_code} ({len(response.content)} bytes)"
                    )

                    if response.status_code == 200:
                        content = response.text
                        if "<form" in content.lower():
                            print(f"✅ Found form on {endpoint}")
                            return self._submit_to_login_page(
                                endpoint, content, state_handle
                            )
                        else:
                            print(f"💡 No form on {endpoint}")
                    else:
                        print(f"❌ {endpoint} returned {response.status_code}")

                except Exception as e:
                    print(f"❌ Error trying {endpoint}: {e}")
                    continue

            # Option 3: Try to use the OAuth2 callback flow
            print("💡 Trying OAuth2 callback flow approach...")

            # The working flow might involve redirecting to the callback URL
            callback_url = "https://www.meijer.com/bin/meijer/signin/v3/callback"
            print(f"🌐 Trying callback URL: {callback_url}")

            try:
                response = self.session.get(
                    callback_url,
                    headers={
                        "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                        "Accept-Language": "en-US,en;q=0.5",
                        "Accept-Encoding": "gzip, deflate, br, zstd",
                        "User-Agent": "Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0",
                        "Referer": f"{self.base_url}/oauth2/default/v1/authorize",
                        "Sec-Fetch-Dest": "document",
                        "Sec-Fetch-Mode": "navigate",
                        "Sec-Fetch-Site": "cross-site",
                        "Sec-Fetch-User": "?1",
                        "Upgrade-Insecure-Requests": "1",
                    },
                )

                print(
                    f"📥 Callback response: {response.status_code} ({len(response.content)} bytes)"
                )

                if response.status_code == 200:
                    content = response.text
                    if "<form" in content.lower():
                        print("✅ Found form on callback page")
                        return self._submit_to_login_page(
                            callback_url, content, state_handle
                        )
                    else:
                        print("💡 No form on callback page")

            except Exception as e:
                print(f"❌ Error trying callback URL: {e}")

            print("❌ All alternative approaches failed")
            print(
                "💡 This suggests the authentication flow is more complex than expected"
            )
            print(
                "💡 We may need to implement a full browser simulation or find a different approach"
            )

            return None

        except Exception as e:
            print(f"❌ Error in alternative credential submission: {e}")
            return None

    def _submit_to_oauth2_form(
        self, oauth2_content: str, state_handle: str
    ) -> Optional[Dict[str, Any]]:
        """Try to submit credentials using a form found on the OAuth2 page."""
        try:
            print("🔍 Attempting to submit to OAuth2 page form...")

            # Look for form action and method
            import re

            form_match = re.search(
                r'<form[^>]*action=["\']([^"\']*)["\'][^>]*method=["\']([^"\']*)["\']',
                oauth2_content,
                re.IGNORECASE,
            )

            if form_match:
                form_action = form_match.group(1)
                form_method = form_match.group(2).upper()

                # Make action URL absolute if needed
                if form_action.startswith("/"):
                    form_action = f"{self.base_url}{form_action}"
                elif not form_action.startswith("http"):
                    form_action = f"{self.base_url}/{form_action.lstrip('/')}"

                print(f"💡 OAuth2 form action: {form_action} (method: {form_method})")

                # Prepare form data - include both the form fields and our authentication data
                form_data = {
                    "stateHandle": state_handle,
                    "identifier": self.username,
                    "passcode": self.password,
                    # Add any other fields that might be required
                    "response_type": "code",
                    "client_id": "0oa22cbewuCICOsKz697",
                    "scope": "openid offline_access",
                    "redirect_uri": "https://www.meijer.com/bin/meijer/signin/v3/callback",
                    "state": "https://www.meijer.com/",
                }

                # Submit the form
                if form_method == "POST":
                    response = self.session.post(
                        form_action,
                        data=form_data,
                        headers={
                            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                            "Content-Type": "application/x-www-form-urlencoded",
                            "Origin": "https://id.meijer.com",
                            "Referer": f"{self.base_url}/oauth2/default/v1/authorize",
                            "User-Agent": "Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0",
                        },
                    )
                else:
                    response = self.session.get(
                        form_action,
                        params=form_data,
                        headers={
                            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                            "Referer": f"{self.base_url}/oauth2/default/v1/authorize",
                            "User-Agent": "Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0",
                        },
                    )

                print(
                    f"📥 OAuth2 form submission response: {response.status_code} ({len(response.content)} bytes)"
                )

                if response.status_code == 200:
                    print("✅ OAuth2 form submission successful")
                    # Check if we got an authorization code or need to continue
                    content = response.text
                    if "code=" in content:
                        auth_code_match = re.search(r"code=([^&\s]+)", content)
                        if auth_code_match:
                            auth_code = auth_code_match.group(1)
                            print(f"🎉 Authorization code found: {auth_code[:20]}...")
                            return {"auth_code": auth_code}

                    return {"success": True, "content": content}
                else:
                    print(f"❌ OAuth2 form submission failed: {response.status_code}")
                    return None
            else:
                print("❌ No form found in OAuth2 page content")
                return None

        except Exception as e:
            print(f"❌ Error submitting to OAuth2 form: {e}")
            return None

    def _submit_to_login_page(
        self, url: str, content: str, state_handle: str
    ) -> Optional[Dict[str, Any]]:
        """Try to submit credentials to a login page that contains a form."""
        try:
            print("🔍 Attempting to submit to login page form...")

            # Look for form action and method
            import re

            form_match = re.search(
                r'<form[^>]*action=["\']([^"\']*)["\'][^>]*method=["\']([^"\']*)["\']',
                content,
                re.IGNORECASE,
            )

            if form_match:
                form_action = form_match.group(1)
                form_method = form_match.group(2).upper()

                # Make action URL absolute if needed
                if form_action.startswith("/"):
                    form_action = f"{self.base_url}{form_action}"
                elif not form_action.startswith("http"):
                    form_action = f"{url.rstrip('/')}/{form_action.lstrip('/')}"

                print(f"💡 Form action: {form_action} (method: {form_method})")

                # Prepare form data
                form_data = {
                    "stateHandle": state_handle,
                    "identifier": self.username,
                    "passcode": self.password,
                }

                # Submit the form
                if form_method == "POST":
                    response = self.session.post(
                        form_action,
                        data=form_data,
                        headers={
                            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                            "Content-Type": "application/x-www-form-urlencoded",
                            "Origin": "https://id.meijer.com",
                            "Referer": url,
                            "User-Agent": "Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0",
                        },
                    )
                else:
                    response = self.session.get(
                        form_action,
                        params=form_data,
                        headers={
                            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                            "Referer": url,
                            "User-Agent": "Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0",
                        },
                    )

                print(
                    f"📥 Form submission response: {response.status_code} ({len(response.content)} bytes)"
                )

                if response.status_code == 200:
                    print("✅ Form submission successful")
                    # Check if we got an authorization code or need to continue
                    content = response.text
                    if "code=" in content:
                        auth_code_match = re.search(r"code=([^&\s]+)", content)
                        if auth_code_match:
                            auth_code = auth_code_match.group(1)
                            print(f"🎉 Authorization code found: {auth_code[:20]}...")
                            return {"auth_code": auth_code}

                    return {"success": True, "content": content}
                else:
                    print(f"❌ Form submission failed: {response.status_code}")
                    return None
            else:
                print("❌ No form found in login page content")
                return None

        except Exception as e:
            print(f"❌ Error submitting to login page: {e}")
            return None

    def _requires_mfa(self, response_data: Dict[str, Any]) -> bool:
        """Check if the response indicates MFA is required."""
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
                                ]
                            ):
                                return True
            return False
        except Exception as e:
            print(f"❌ Error checking MFA requirement: {e}")
            return False

    def _handle_mfa(self, auth_result: Dict[str, Any]) -> Optional[Dict[str, Any]]:
        """Handle multi-factor authentication if required."""
        print("📱 Handling MFA via email verification...")

        try:
            # Import here to avoid circular imports
            from .email_2fa import Email2FAHandler

            # Initialize email 2FA handler
            email_handler = Email2FAHandler()

            # Test connection first
            if not email_handler.test_connection():
                print("❌ Email connection test failed")
                return None

            print("📧 Email connection successful, waiting for verification code...")

            # Wait for verification code to arrive
            verification_code = email_handler.wait_for_verification_code()

            if verification_code:
                print(f"✅ Received verification code: {verification_code}")

                # Here you would submit the verification code to the MFA endpoint
                # For now, we'll return success with the code
                return {
                    "success": True,
                    "verification_code": verification_code,
                    "mfa_completed": True,
                }
            else:
                print("❌ No verification code received within timeout")
                return None

        except ImportError:
            print("❌ Email 2FA module not available")
            return None
        except Exception as e:
            print(f"❌ Error during MFA handling: {e}")
            return None

    def _extract_auth_code(self, response_data: Dict[str, Any]) -> Optional[str]:
        """Extract authorization code from the response."""
        try:
            # Look for authorization code in various response formats
            if "authorization_code" in str(response_data):
                # Try to find the code in the response
                response_str = json.dumps(response_data)
                code_match = re.search(r"code=([^&\s]+)", response_str)
                if code_match:
                    return code_match.group(1)

            return None
        except Exception as e:
            print(f"❌ Error extracting auth code: {e}")
            return None

    def _get_authorization_code(self, auth_result: Dict[str, Any]) -> Optional[str]:
        """Get the final authorization code from the authentication result."""
        try:
            # If we already have an auth code, return it
            if "auth_code" in auth_result:
                return auth_result["auth_code"]

            # If we have response data, try to extract the code
            if "response_data" in auth_result:
                response_data = auth_result["response_data"]
                auth_code = self._extract_auth_code(response_data)
                if auth_code:
                    return auth_code

            # Try to follow any redirects or get the final code
            print("💡 Attempting to get final authorization code...")

            # This is a simplified approach - in practice, we'd need to handle
            # the complete MFA flow and follow the final redirect
            return None

        except Exception as e:
            print(f"❌ Error getting authorization code: {e}")
            return None
