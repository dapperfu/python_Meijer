#!/usr/bin/env python3
"""
OKTA Authentication Module for Meijer API

This module implements OAuth2 authentication by following the actual
flow used by the Meijer mobile app, based on analysis of mitmproxy logs.

Authentication Flow:
1. Establish session cookies by visiting OKTA domain
2. Make OAuth2 authorization request with proper parameters
3. Handle the redirect flow to get authorization code
4. Exchange authorization code for tokens

Author: Claude Sonnet 4 via Cursor IDE
"""

import base64
import hashlib
import secrets
import uuid
from typing import Dict, Optional

import requests
from requests.adapters import HTTPAdapter
from urllib3.util.retry import Retry

from .models.base import AuthTokens


class OktaAuthenticator:
    """
    OKTA OAuth2 Authentication client for Meijer.

    Implements the OAuth2 flow based on actual app behavior from logs.
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

        # Session setup
        self.session = requests.Session()
        self.session.headers.update(
            {
                "User-Agent": "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36",
                "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
                "Accept-Language": "en-US,en;q=0.9",
                "Accept-Encoding": "gzip, deflate, br",
                "Upgrade-Insecure-Requests": "1",
                "Sec-Fetch-Site": "none",
                "Sec-Fetch-Mode": "navigate",
                "Sec-Fetch-User": "?1",
                "Sec-Fetch-Dest": "document",
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
        self.code_verifier = None
        self.code_challenge = None
        self.state = None
        self.nonce = None

        # Credentials (set during authentication)
        self.username = None
        self.password = None

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

        # Generate state and nonce for security
        self.state = str(uuid.uuid4())
        self.nonce = str(uuid.uuid4())

        return {
            "client_id": self.client_id,
            "scope": self.scope,
            "redirect_uri": self.redirect_uri,
            "response_type": "code",
            "response_mode": "query",
            "state": self.state,
            "nonce": self.nonce,
            "login_hint": "",
            **pkce_params,
        }

    def _establish_initial_session(self) -> bool:
        """
        Establish initial session cookies by visiting the OKTA domain.
        """
        try:
            print("🔍 Step 1: Establishing initial session...")

            # Visit the main OKTA domain to establish session cookies
            response = self.session.get(f"{self.base_url}/", allow_redirects=True)

            if response.status_code == 200:
                print("✅ Initial session established successfully")
                print(f"📊 Response size: {len(response.content)} bytes")

                # Check if we got any cookies
                cookies = self.session.cookies
                if cookies:
                    print(f"🍪 Session cookies established: {len(cookies)} cookies")
                    for cookie in cookies:
                        print(f"   - {cookie.name}: {cookie.value[:30]}...")
                else:
                    print("⚠️ No cookies were set during initial session")

                return True
            else:
                print(f"❌ Failed to establish initial session: {response.status_code}")
                return False

        except Exception as e:
            print(f"❌ Error establishing initial session: {e}")
            return False

    def _start_oauth2_flow(self) -> Optional[str]:
        """
        Start the OAuth2 authorization flow.

        This is the key step - we make the authorization request and
        follow the redirects to see where the flow takes us.
        """
        try:
            print("🔍 Step 2: Starting OAuth2 authorization flow...")

            # Generate OAuth2 parameters
            oauth_params = self._generate_oauth_params()

            print("📤 OAuth2 parameters:")
            for key, value in oauth_params.items():
                if key in ["code_verifier", "code_challenge"]:
                    print(f"   {key}: {value[:20]}...")
                else:
                    print(f"   {key}: {value}")

            # Make the authorization request
            response = self.session.get(
                self.oauth_authorize_url, params=oauth_params, allow_redirects=False
            )

            print(f"📥 OAuth2 authorization response status: {response.status_code}")
            print(f"📥 Response headers: {dict(response.headers)}")

            if response.status_code == 200:
                print("✅ OAuth2 authorization page loaded")
                print(f"📊 Response size: {len(response.content)} bytes")

                # This page should contain the login form or redirect us to it
                # Let's examine the content to understand what we're dealing with
                content = response.content.decode("utf-8", errors="ignore")

                # Look for any redirect URLs or forms in the content
                return self._analyze_authorization_page(content)

            elif response.status_code in [301, 302, 303, 307, 308]:
                # We got a redirect - follow it
                location = response.headers.get("Location", "")
                print(f"✅ Got OAuth2 redirect to: {location}")

                # Follow the redirect to see where it takes us
                return self._follow_redirect(location)
            else:
                print(f"❌ OAuth2 authorization failed: {response.status_code}")
                if response.content:
                    print(
                        f"   Response preview: {response.content.decode('utf-8', errors='ignore')[:500]}..."
                    )
                return None

        except Exception as e:
            print(f"❌ Error starting OAuth2 flow: {e}")
            return None

    def _analyze_authorization_page(self, content: str) -> Optional[str]:
        """
        Analyze the OAuth2 authorization page to understand the flow.
        """
        try:
            print("🔍 Analyzing OAuth2 authorization page...")

            import re

            # Look for any JavaScript that might contain redirect logic
            js_redirects = re.findall(
                r'window\.location\s*=\s*["\']([^"\']+)["\']', content
            )
            if js_redirects:
                print(f"🔍 Found JavaScript redirects: {js_redirects}")
                for redirect in js_redirects:
                    if redirect.startswith("/") or redirect.startswith("http"):
                        print(f"💡 Following JavaScript redirect: {redirect}")
                        return self._follow_redirect(redirect)

            # Look for meta refresh redirects
            meta_refresh = re.search(
                r'<meta[^>]*http-equiv=["\']refresh["\'][^>]*content=["\'][^"\']*url=([^"\']+)["\']',
                content,
            )
            if meta_refresh:
                redirect_url = meta_refresh.group(1)
                print(f"💡 Found meta refresh redirect: {redirect_url}")
                return self._follow_redirect(redirect_url)

            # Look for step-up authentication URLs with stateToken
            # These are the key URLs that contain the encrypted session state
            stepup_pattern = r'https\\\\x3A\\\\x2F\\\\x2Fid\.meijer\.com\\\\x2Flogin\\\\x2Dstep\\\\x2Dup\\\\x2Fredirect\\\\x3FstateToken\\\\x3D([^"\'\\\\]+)'
            stepup_match = re.search(stepup_pattern, content)

            if stepup_match:
                state_token = stepup_match.group(1)
                print(
                    f"🎯 Found step-up authentication stateToken: {state_token[:50]}..."
                )

                # Decode the escaped URL properly
                stepup_url = f"https://id.meijer.com/login/step-up/redirect?stateToken={state_token}"
                print(f"💡 Step-up authentication URL: {stepup_url}")

                # This is the key URL - it contains the encrypted session state
                # We need to authenticate through this endpoint
                return self._authenticate_step_up(stepup_url)

            # Look for any URLs that might be login endpoints (handle escaped URLs)
            login_urls = re.findall(
                r'["\']([^"\']*(?:login|signin|auth)[^"\']*)["\']',
                content,
                re.IGNORECASE,
            )
            if login_urls:
                print(f"🔍 Found potential login URLs: {len(login_urls)}")

                # Filter and decode escaped URLs
                decoded_urls = []
                for url in login_urls:
                    if "\\x" in url:
                        # This is an escaped URL - decode it
                        decoded_url = url
                        decoded_url = decoded_url.replace("\\x3A", ":")  # :
                        decoded_url = decoded_url.replace("\\x2F", "/")  # /
                        decoded_url = decoded_url.replace("\\x2D", "-")  # -
                        decoded_url = decoded_url.replace("\\x3F", "?")  # ?
                        decoded_url = decoded_url.replace("\\x26", "&")  # &
                        decoded_url = decoded_url.replace("\\x3D", "=")  # =
                        decoded_url = decoded_url.replace("\\x2B", "+")  # +
                        decoded_url = decoded_url.replace("\\x20", " ")  # space
                        decoded_urls.append(decoded_url)
                        print(f"   Decoded: {url[:50]}... -> {decoded_url[:50]}...")
                    else:
                        decoded_urls.append(url)

                # Look for step-up URLs in the decoded URLs
                for url in decoded_urls:
                    if "login/step-up/redirect" in url and "stateToken" in url:
                        print(f"🎯 Found step-up URL in decoded URLs: {url[:100]}...")

                        # Extract the stateToken from the URL
                        state_token_match = re.search(r"stateToken=([^&\s]+)", url)
                        if state_token_match:
                            state_token = state_token_match.group(1)
                            print(f"💡 Extracted stateToken: {state_token[:50]}...")

                            # Clean up the URL to make it properly formatted
                            clean_url = f"https://id.meijer.com/login/step-up/redirect?stateToken={state_token}"
                            print(f"💡 Clean step-up URL: {clean_url}")

                            return self._authenticate_step_up(clean_url)

                # Try the decoded URLs
                for url in decoded_urls:
                    if url.startswith("/") or url.startswith("http"):
                        print(f"💡 Trying decoded login URL: {url}")
                        result = self._try_login_url(url)
                        if result:
                            return result

            # Look for any forms that might be login forms
            forms = re.findall(r"<form[^>]*>", content)
            if forms:
                print(f"🔍 Found {len(forms)} forms:")
                for i, form in enumerate(forms):
                    print(f"   Form {i+1}: {form}")

                # Look for login-related forms
                login_forms = [
                    f for f in forms if "login" in f.lower() or "signin" in f.lower()
                ]
                if login_forms:
                    print(f"💡 Found {len(login_forms)} login-related forms")
                    # Try to submit credentials to the first login form
                    return self._submit_to_login_form(content, login_forms[0])

            print("❌ Could not determine how to proceed from authorization page")
            print("💡 This suggests the OAuth2 flow is more complex than expected")
            return None

        except Exception as e:
            print(f"❌ Error analyzing authorization page: {e}")
            return None

    def _authenticate_step_up(self, stepup_url: str) -> Optional[str]:
        """
        Authenticate through the step-up authentication flow.

        This is the key method that handles the actual authentication
        using the stateToken from the OAuth2 authorization page.
        """
        try:
            print(f"🔐 Step-up authentication using: {stepup_url}")

            # First, visit the step-up URL to establish the authentication context
            response = self.session.get(stepup_url, allow_redirects=False)
            print(f"📥 Step-up GET response: {response.status_code}")

            if response.status_code == 200:
                # We got the authentication page - submit credentials
                print("✅ Got step-up authentication page")

                # Look for the login form in the response
                content = response.content.decode("utf-8", errors="ignore")

                # Look for forms
                import re

                forms = re.findall(r"<form[^>]*>", content)
                if forms:
                    print(f"🔍 Found {len(forms)} forms in step-up page")

                    # Look for login forms
                    login_forms = [
                        f
                        for f in forms
                        if "login" in f.lower() or "signin" in f.lower()
                    ]
                    if login_forms:
                        print(f"💡 Found {len(login_forms)} login forms")
                        return self._submit_to_login_form(content, login_forms[0])

                    # If no specific login forms, try the first form
                    print("💡 No specific login forms found, trying first form")
                    return self._submit_to_login_form(content, forms[0])
                else:
                    print("❌ No forms found in step-up page")
                    return None

            elif response.status_code in [301, 302, 303, 307, 308]:
                # We got a redirect - follow it
                location = response.headers.get("Location", "")
                print(f"✅ Step-up redirect to: {location}")

                if "code=" in location:
                    auth_code = location.split("code=")[1].split("&")[0]
                    print(
                        f"🎉 Authorization code found in step-up redirect: {auth_code[:20]}..."
                    )
                    return auth_code

                # Check if this is a redirect to the main Meijer site (which suggests we need to continue the flow differently)
                if "www.meijer.com" in location:
                    print(
                        "💡 Redirected to main Meijer site - this suggests the step-up flow continues differently"
                    )
                    print(
                        "💡 Let me check if there's a login form or authentication endpoint on this page"
                    )

                    # Follow the redirect to see what's on the main site
                    redirect_response = self.session.get(
                        location, allow_redirects=False
                    )
                    if redirect_response.status_code == 200:
                        content = redirect_response.content.decode(
                            "utf-8", errors="ignore"
                        )
                        print(f"📊 Main site content size: {len(content)} bytes")

                        # Check if we have any authentication-related cookies or session state
                        print(
                            f"🍪 Cookies after step-up redirect: {len(self.session.cookies)} cookies"
                        )
                        for cookie in self.session.cookies:
                            if (
                                "auth" in cookie.name.lower()
                                or "token" in cookie.name.lower()
                                or "session" in cookie.name.lower()
                            ):
                                print(
                                    f"   🔑 Auth cookie: {cookie.name} = {cookie.value[:50]}..."
                                )

                        # Look for any success indicators in the content
                        if (
                            "welcome" in content.lower()
                            or "dashboard" in content.lower()
                            or "account" in content.lower()
                        ):
                            print("💡 Found potential success indicators in content")

                        # Check if we can now access the OAuth2 token endpoint
                        token_url = f"{self.base_url}/oauth2/default/v1/token"
                        print(f"💡 Trying to access token endpoint: {token_url}")

                        # Try to make a request to see if we're authenticated
                        token_response = self.session.get(
                            token_url, allow_redirects=False
                        )
                        print(
                            f"📥 Token endpoint response: {token_response.status_code}"
                        )

                        if token_response.status_code == 200:
                            print(
                                "🎉 Successfully authenticated! Token endpoint accessible"
                            )
                            # Try to extract authorization code from the response
                            token_content = token_response.content.decode(
                                "utf-8", errors="ignore"
                            )
                            if "code=" in token_content:
                                auth_code_match = re.search(
                                    r"code=([^&\s]+)", token_content
                                )
                                if auth_code_match:
                                    auth_code = auth_code_match.group(1)
                                    print(
                                        f"🎉 Authorization code found: {auth_code[:20]}..."
                                    )
                                    return auth_code

                        # Check if we can now access the original OAuth2 authorization endpoint with our new session
                        print(
                            "💡 Trying to access OAuth2 authorization endpoint with new session"
                        )
                        auth_response = self.session.get(
                            self.oauth_authorize_url, allow_redirects=False
                        )
                        print(
                            f"📥 OAuth2 authorization response with new session: {auth_response.status_code}"
                        )

                        if auth_response.status_code == 200:
                            print("🎉 OAuth2 authorization accessible with new session")
                            # Analyze the response to see if we get a different result
                            auth_content = auth_response.content.decode(
                                "utf-8", errors="ignore"
                            )
                            print(
                                f"📊 New OAuth2 response size: {len(auth_content)} bytes"
                            )

                            # Look for authorization code in the response
                            if "code=" in auth_content:
                                auth_code_match = re.search(
                                    r"code=([^&\s]+)", auth_content
                                )
                                if auth_code_match:
                                    auth_code = auth_code_match.group(1)
                                    print(
                                        f"🎉 Authorization code found in new OAuth2 response: {auth_code[:20]}..."
                                    )
                                    return auth_code

                        # Print a sample of the main site content to understand what we're getting
                        print(
                            f"📄 Main site content sample (first 500 chars): {content[:500]}"
                        )
                        if len(content) > 500:
                            print(
                                f"📄 Main site content sample (last 500 chars): {content[-500:]}"
                            )

                        # Look for login forms or authentication endpoints
                        import re

                        forms = re.findall(r"<form[^>]*>", content)
                        if forms:
                            print(f"🔍 Found {len(forms)} forms on main site")
                            for i, form in enumerate(forms):
                                print(f"   Form {i+1}: {form[:100]}...")

                            # Look for login forms
                            login_forms = [
                                f
                                for f in forms
                                if "login" in f.lower() or "signin" in f.lower()
                            ]
                            if login_forms:
                                print(
                                    f"💡 Found {len(login_forms)} login forms on main site"
                                )
                                return self._submit_to_login_form(
                                    content, login_forms[0]
                                )

                        # Look for any authentication-related URLs
                        auth_urls = re.findall(
                            r'["\']([^"\']*(?:login|signin|auth)[^"\']*)["\']',
                            content,
                            re.IGNORECASE,
                        )
                        if auth_urls:
                            print(
                                f"🔍 Found {len(auth_urls)} authentication URLs on main site"
                            )
                            for url in auth_urls:
                                if url.startswith("/") or url.startswith("http"):
                                    print(f"💡 Trying authentication URL: {url}")
                                    result = self._try_login_url(url)
                                    if result:
                                        return result

                        # Look for any JavaScript that might handle authentication
                        js_auth = re.findall(
                            r'["\']([^"\']*(?:login|signin|auth)[^"\']*)["\']',
                            content,
                            re.IGNORECASE,
                        )
                        if js_auth:
                            print(
                                f"🔍 Found {len(js_auth)} JavaScript authentication references"
                            )
                            for js in js_auth[:5]:  # Limit to first 5
                                print(f"   JS: {js[:100]}...")

                        # Look for any iframes that might contain authentication
                        iframes = re.findall(
                            r'<iframe[^>]*src=["\']([^"\']*)["\'][^>]*>', content
                        )
                        if iframes:
                            print(f"🔍 Found {len(iframes)} iframes on main site")
                            for iframe in iframes:
                                print(f"   Iframe: {iframe}")
                                if (
                                    "login" in iframe.lower()
                                    or "auth" in iframe.lower()
                                ):
                                    print(f"💡 Found authentication iframe: {iframe}")
                                    result = self._try_login_url(iframe)
                                    if result:
                                        return result

                    print("❌ Could not find authentication flow on main Meijer site")
                    return None

                # Follow other redirects normally
                return self._follow_redirect(location)
            else:
                print(f"❌ Step-up authentication failed: {response.status_code}")
                return None

        except Exception as e:
            print(f"❌ Error in step-up authentication: {e}")
            return None

    def _follow_redirect(self, url: str) -> Optional[str]:
        """
        Follow a redirect URL and see where it takes us.
        """
        try:
            print(f"🔄 Following redirect: {url}")

            # If it's a relative URL, make it absolute
            if url.startswith("/"):
                url = f"{self.base_url}{url}"

            response = self.session.get(url, allow_redirects=False)
            print(f"📥 Redirect response status: {response.status_code}")

            if response.status_code in [301, 302, 303, 307, 308]:
                # Another redirect
                location = response.headers.get("Location", "")
                print(f"🔄 Another redirect to: {location}")
                return self._follow_redirect(location)
            elif response.status_code == 200:
                # We got a page - analyze it
                content = response.content.decode("utf-8", errors="ignore")
                return self._analyze_authorization_page(content)
            else:
                print(f"❌ Redirect failed with status: {response.status_code}")
                return None

        except Exception as e:
            print(f"❌ Error following redirect: {e}")
            return None

    def _submit_to_login_form(self, content: str, form_html: str) -> Optional[str]:
        """
        Try to submit credentials to a login form found in the content.
        """
        try:
            print("🔍 Attempting to submit to login form...")

            import re

            # Extract form action
            action_match = re.search(r'action=["\']([^"\']+)["\']', form_html)
            if not action_match:
                print("❌ No form action found")
                return None

            form_action = action_match.group(1)
            print(f"💡 Form action: {form_action}")

            # If it's a relative URL, make it absolute
            if form_action.startswith("/"):
                form_action = f"{self.base_url}{form_action}"

            # Prepare login data using stored credentials
            login_data = {
                "username": self.username,
                "password": self.password,
            }

            # Submit the form
            response = self.session.post(
                form_action,
                data=login_data,
                allow_redirects=False,
                headers={
                    "Content-Type": "application/x-www-form-urlencoded",
                    "Origin": self.base_url,
                    "Referer": self.oauth_authorize_url,
                },
            )

            print(f"📥 Form submission response: {response.status_code}")

            if response.status_code in [301, 302, 303, 307, 308]:
                location = response.headers.get("Location", "")
                print(f"✅ Form submission redirect: {location}")

                if "code=" in location:
                    auth_code = location.split("code=")[1].split("&")[0]
                    print(f"🎉 Authorization code found: {auth_code[:20]}...")
                    return auth_code

                # Follow the redirect
                return self._follow_redirect(location)

            return None

        except Exception as e:
            print(f"❌ Error submitting to login form: {e}")
            return None

    def _try_login_url(self, url: str) -> Optional[str]:
        """
        Try to use a login URL directly.
        """
        try:
            print(f"🔍 Trying login URL: {url}")

            # If it's a relative URL, make it absolute
            if url.startswith("/"):
                url = f"{self.base_url}{url}"

            # Try to GET the URL first
            response = self.session.get(url, allow_redirects=False)
            print(f"   GET response: {response.status_code}")

            if response.status_code == 200:
                # Try to submit credentials using stored credentials
                login_data = {
                    "username": self.username,
                    "password": self.password,
                }

                response = self.session.post(
                    url,
                    data=login_data,
                    allow_redirects=False,
                    headers={
                        "Content-Type": "application/x-www-form-urlencoded",
                        "Origin": self.base_url,
                        "Referer": url,
                    },
                )

                print(f"   POST response: {response.status_code}")

                if response.status_code in [301, 302, 303, 307, 308]:
                    location = response.headers.get("Location", "")
                    print(f"   ✅ Redirect to: {location}")

                    if "code=" in location:
                        auth_code = location.split("code=")[1].split("&")[0]
                        print(f"🎉 Authorization code found: {auth_code[:20]}...")
                        return auth_code

                    # Follow the redirect
                    return self._follow_redirect(location)

            return None

        except Exception as e:
            print(f"   ❌ Error with login URL: {e}")
            return None

    def _exchange_code_for_tokens(
        self, authorization_code: str
    ) -> Optional[AuthTokens]:
        """Exchange authorization code for access and refresh tokens."""
        try:
            print("🎟️ Step 3: Exchanging authorization code for tokens...")

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
            print("🔐 Starting OKTA OAuth2 authentication flow...")
            print("=" * 50)

            # Store credentials for use in form submissions
            self.username = username
            self.password = password

            # Step 1: Establish initial session to get cookies
            if not self._establish_initial_session():
                print("❌ Failed to establish initial session - cannot proceed")
                return None

            # Step 2: Start OAuth2 flow and follow redirects
            authorization_code = self._start_oauth2_flow()

            if not authorization_code:
                print("❌ Failed to get authorization code - cannot proceed")
                return None

            # Step 3: Exchange authorization code for tokens
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
