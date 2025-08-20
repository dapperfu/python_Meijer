#!/usr/bin/env python3
"""
OKTA Authentication Module for Meijer API

This module implements a simplified OAuth2 authentication flow
that bypasses the complex IDX flow and directly authenticates
using username/password credentials.

Authentication Flow:
1. Establish session cookies by visiting OKTA domain
2. Make direct OAuth2 authorization request
3. Handle the redirect to get authorization code
4. Exchange authorization code for tokens

Author: Claude Sonnet 4 via Cursor IDE
"""

import base64
import hashlib
import json
import secrets
import time
import uuid
from typing import Dict, Optional
from urllib.parse import urlparse, parse_qs

import requests
from requests.adapters import HTTPAdapter
from urllib3.util.retry import Retry

from .models.base import AuthTokens


class OktaAuthenticator:
    """
    Simplified OKTA OAuth2 Authentication client for Meijer.

    Implements a direct OAuth2 flow that bypasses the complex IDX flow.
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
        
        # Alternative endpoints for direct authentication
        self.login_url = f"{self.base_url}/login"
        self.auth_url = f"{self.base_url}/auth"

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
                "Sec-Fetch-Dest": "document"
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
        
        This step is crucial for getting the initial session cookies that
        are required for subsequent authentication requests.
        """
        try:
            print("🔍 Step 1: Establishing initial session...")
            
            # Visit the main OKTA domain to establish session cookies
            response = self.session.get(
                f"{self.base_url}/",
                allow_redirects=True
            )
            
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

    def _get_login_page(self) -> Optional[str]:
        """
        Get the login page to extract any required tokens or forms.
        """
        try:
            print("🔍 Step 2: Getting login page...")
            
            response = self.session.get(
                self.login_url,
                allow_redirects=True
            )
            
            if response.status_code == 200:
                print("✅ Login page loaded successfully")
                print(f"📊 Response size: {len(response.content)} bytes")
                
                # Look for any hidden tokens or forms in the login page
                content = response.content.decode('utf-8', errors='ignore')
                
                # Look for CSRF tokens or other required fields
                import re
                
                # Pattern 1: Look for CSRF token
                csrf_pattern = r'name=["\']csrf["\'][^>]*value=["\']([^"\']+)["\']'
                match = re.search(csrf_pattern, content)
                if match:
                    csrf_token = match.group(1)
                    print(f"✅ CSRF token found: {csrf_token[:30]}...")
                    return csrf_token
                
                # Pattern 2: Look for any hidden input with token-like values
                hidden_pattern = r'<input[^>]*type=["\']hidden["\'][^>]*value=["\']([^"\']+)["\']'
                matches = re.findall(hidden_pattern, content)
                if matches:
                    print(f"🔍 Found {len(matches)} hidden input fields")
                    # Look for the most likely token (longest value)
                    longest_token = max(matches, key=len)
                    if len(longest_token) > 20:  # Only consider long values as tokens
                        print(f"💡 Potential token found: {longest_token[:30]}...")
                        return longest_token
                
                print("ℹ️ No specific tokens found in login page")
                return None
            else:
                print(f"❌ Failed to load login page: {response.status_code}")
                return None
                
        except Exception as e:
            print(f"❌ Error getting login page: {e}")
            return None

    def _submit_credentials(self, username: str, password: str, csrf_token: Optional[str] = None) -> Optional[str]:
        """
        Submit username and password to the login form.
        
        This attempts to authenticate directly through the login form
        rather than going through the complex OAuth2 flow.
        """
        try:
            print(f"🔍 Step 3: Submitting credentials for {username}...")
            
            # Prepare the login data
            login_data = {
                "username": username,
                "password": password,
            }
            
            # Add CSRF token if we have one
            if csrf_token:
                login_data["csrf"] = csrf_token
            
            # Try to submit to the login endpoint
            response = self.session.post(
                self.login_url,
                data=login_data,
                allow_redirects=False,  # Don't follow redirects to see what happens
                headers={
                    "Content-Type": "application/x-www-form-urlencoded",
                    "Origin": self.base_url,
                    "Referer": self.login_url,
                }
            )
            
            print(f"📥 Login response status: {response.status_code}")
            print(f"📥 Response headers: {dict(response.headers)}")
            
            if response.status_code in [301, 302, 303, 307, 308]:
                # We got a redirect - this is good!
                location = response.headers.get("Location", "")
                print(f"✅ Got redirect to: {location}")
                
                # Check if this redirect contains an authorization code
                if "code=" in location:
                    auth_code = location.split("code=")[1].split("&")[0]
                    print(f"🎉 Authorization code found in redirect: {auth_code[:20]}...")
                    return auth_code
                else:
                    print("ℹ️ Redirect doesn't contain authorization code")
                    print("💡 This might be a different type of redirect")
                    return None
                    
            elif response.status_code == 200:
                # Check if we got a success page or error
                content = response.content.decode('utf-8', errors='ignore')
                
                if "error" in content.lower() or "invalid" in content.lower():
                    print("❌ Login failed - error message found in response")
                    return None
                elif "success" in content.lower() or "welcome" in content.lower():
                    print("✅ Login appears successful")
                    # Look for any tokens in the success page
                    return self._extract_tokens_from_content(content)
                else:
                    print("ℹ️ Login response is ambiguous")
                    return None
            else:
                print(f"❌ Login failed with status: {response.status_code}")
                return None
                
        except Exception as e:
            print(f"❌ Error submitting credentials: {e}")
            return None

    def _extract_tokens_from_content(self, content: str) -> Optional[str]:
        """
        Extract tokens from HTML content after successful login.
        """
        try:
            import re
            
            # Look for authorization code in the content
            code_pattern = r'code=([a-zA-Z0-9_-]+)'
            match = re.search(code_pattern, content)
            if match:
                auth_code = match.group(1)
                print(f"✅ Authorization code found in content: {auth_code[:20]}...")
                return auth_code
            
            # Look for access token
            token_pattern = r'access_token["\']?\s*[:=]\s*["\']([^"\']+)["\']'
            match = re.search(token_pattern, content)
            if match:
                access_token = match.group(1)
                print(f"✅ Access token found in content: {access_token[:30]}...")
                # If we found an access token directly, we need to handle this differently
                return None
            
            print("ℹ️ No tokens found in content")
            return None
            
        except Exception as e:
            print(f"❌ Error extracting tokens from content: {e}")
            return None

    def _try_oauth2_flow(self, username: str, password: str) -> Optional[str]:
        """
        Try the standard OAuth2 authorization flow.
        
        This is the fallback approach if direct login doesn't work.
        """
        try:
            print("🔍 Step 4: Trying OAuth2 authorization flow...")
            
            # Generate OAuth2 parameters
            oauth_params = self._generate_oauth_params()
            
            # Make the authorization request
            response = self.session.get(
                self.oauth_authorize_url,
                params=oauth_params,
                allow_redirects=False
            )
            
            print(f"📥 OAuth2 authorization response status: {response.status_code}")
            
            if response.status_code == 200:
                print("✅ OAuth2 authorization page loaded")
                print(f"📊 Response size: {len(response.content)} bytes")
                
                # The authorization page should contain a login form
                # We need to submit credentials to this form
                content = response.content.decode('utf-8', errors='ignore')
                
                # Debug: Show a preview of the content
                print("💡 Content preview (first 1000 chars):")
                print(content[:1000] + "..." if len(content) > 1000 else content)
                
                # Look for the login form and submit credentials
                return self._submit_oauth2_credentials(content, username, password)
                
            elif response.status_code in [301, 302, 303, 307, 308]:
                # We got a redirect - check if it contains an authorization code
                location = response.headers.get("Location", "")
                print(f"✅ Got OAuth2 redirect to: {location}")
                
                if "code=" in location:
                    auth_code = location.split("code=")[1].split("&")[0]
                    print(f"🎉 Authorization code found: {auth_code[:20]}...")
                    return auth_code
                else:
                    print("ℹ️ OAuth2 redirect doesn't contain authorization code")
                    return None
            else:
                print(f"❌ OAuth2 authorization failed: {response.status_code}")
                return None
                
        except Exception as e:
            print(f"❌ Error in OAuth2 flow: {e}")
            return None

    def _submit_oauth2_credentials(self, content: str, username: str, password: str) -> Optional[str]:
        """
        Submit credentials to the OAuth2 authorization page.
        """
        try:
            print("🔍 Submitting credentials to OAuth2 authorization page...")
            
            # Look for the form action URL
            import re
            
            # Pattern 1: Look for form with action attribute
            form_pattern = r'<form[^>]*action=["\']([^"\']+)["\']'
            match = re.search(form_pattern, content)
            
            if match:
                form_action = match.group(1)
                print(f"✅ Found form action: {form_action}")
                
                # Make the form submission
                form_data = {
                    "username": username,
                    "password": password,
                }
                
                # If the form action is relative, make it absolute
                if form_action.startswith("/"):
                    form_action = f"{self.base_url}{form_action}"
                
                response = self.session.post(
                    form_action,
                    data=form_data,
                    allow_redirects=False,
                    headers={
                        "Content-Type": "application/x-www-form-urlencoded",
                        "Origin": self.base_url,
                        "Referer": self.oauth_authorize_url,
                    }
                )
                
                print(f"📥 Form submission response status: {response.status_code}")
                
                if response.status_code in [301, 302, 303, 307, 308]:
                    location = response.headers.get("Location", "")
                    print(f"✅ Got form redirect to: {location}")
                    
                    if "code=" in location:
                        auth_code = location.split("code=")[1].split("&")[0]
                        print(f"🎉 Authorization code found: {auth_code[:20]}...")
                        return auth_code
                
                print("ℹ️ Form submission didn't yield authorization code")
                return None
            else:
                print("❌ No form found in OAuth2 authorization page")
                print("💡 Let me analyze the content more carefully...")
                
                # Pattern 2: Look for any form tags
                all_forms = re.findall(r'<form[^>]*>', content)
                if all_forms:
                    print(f"🔍 Found {len(all_forms)} form tags:")
                    for i, form in enumerate(all_forms):
                        print(f"   Form {i+1}: {form}")
                
                # Pattern 3: Look for input fields
                inputs = re.findall(r'<input[^>]*>', content)
                if inputs:
                    print(f"🔍 Found {len(inputs)} input fields:")
                    for i, inp in enumerate(inputs):
                        print(f"   Input {i+1}: {inp}")
                
                # Pattern 4: Look for any POST endpoints or login-related URLs
                post_urls = re.findall(r'action=["\']([^"\']*login[^"\']*)["\']', content, re.IGNORECASE)
                if post_urls:
                    print(f"🔍 Found potential login URLs: {post_urls}")
                
                # Try a different approach - look for the actual login endpoint
                return self._try_direct_login_endpoint(username, password)
                
        except Exception as e:
            print(f"❌ Error submitting OAuth2 credentials: {e}")
            return None

    def _try_direct_login_endpoint(self, username: str, password: str) -> Optional[str]:
        """
        Try to find and use a direct login endpoint.
        """
        try:
            print("🔍 Trying to find direct login endpoint...")
            
            # Common login endpoint patterns
            login_endpoints = [
                f"{self.base_url}/login",
                f"{self.base_url}/auth/login",
                f"{self.base_url}/signin",
                f"{self.base_url}/authenticate",
                f"{self.base_url}/oauth2/default/v1/login",
                f"{self.base_url}/idp/idx/login",
            ]
            
            for endpoint in login_endpoints:
                print(f"🔍 Trying endpoint: {endpoint}")
                
                try:
                    # First try to GET the endpoint to see if it exists
                    response = self.session.get(endpoint, allow_redirects=False)
                    print(f"   GET response: {response.status_code}")
                    
                    if response.status_code == 200:
                        print(f"✅ Endpoint {endpoint} exists and returns 200")
                        
                        # Try to submit credentials to this endpoint
                        login_data = {
                            "username": username,
                            "password": password,
                        }
                        
                        response = self.session.post(
                            endpoint,
                            data=login_data,
                            allow_redirects=False,
                            headers={
                                "Content-Type": "application/x-www-form-urlencoded",
                                "Origin": self.base_url,
                                "Referer": endpoint,
                            }
                        )
                        
                        print(f"   POST response: {response.status_code}")
                        
                        if response.status_code in [301, 302, 303, 307, 308]:
                            location = response.headers.get("Location", "")
                            print(f"   ✅ Got redirect to: {location}")
                            
                            if "code=" in location:
                                auth_code = location.split("code=")[1].split("&")[0]
                                print(f"🎉 Authorization code found: {auth_code[:20]}...")
                                return auth_code
                        
                        # Check if we got a success response
                        if response.status_code == 200:
                            content = response.content.decode('utf-8', errors='ignore')
                            if "error" not in content.lower() and "invalid" not in content.lower():
                                print(f"   ✅ Login appears successful at {endpoint}")
                                # Look for tokens in the response
                                return self._extract_tokens_from_content(content)
                    
                    elif response.status_code in [301, 302, 303, 307, 308]:
                        # Follow the redirect to see where it goes
                        location = response.headers.get("Location", "")
                        print(f"   Redirect to: {location}")
                        
                        if "code=" in location:
                            auth_code = location.split("code=")[1].split("&")[0]
                            print(f"🎉 Authorization code found in redirect: {auth_code[:20]}...")
                            return auth_code
                            
                except Exception as e:
                    print(f"   ❌ Error with {endpoint}: {e}")
                    continue
            
            print("❌ No working login endpoint found")
            return None
            
        except Exception as e:
            print(f"❌ Error trying direct login endpoints: {e}")
            return None

    def _exchange_code_for_tokens(self, authorization_code: str) -> Optional[AuthTokens]:
        """Exchange authorization code for access and refresh tokens."""
        try:
            print("🎟️ Step 5: Exchanging authorization code for tokens...")

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
            print("🔐 Starting simplified OKTA authentication flow...")
            print("=" * 50)
            
            # Step 1: Establish initial session to get cookies
            if not self._establish_initial_session():
                print("❌ Failed to establish initial session - cannot proceed")
                return None
            
            # Step 2: Get login page and extract any required tokens
            csrf_token = self._get_login_page()
            
            # Step 3: Try direct login first
            authorization_code = self._submit_credentials(username, password, csrf_token)
            
            # Step 4: If direct login didn't work, try OAuth2 flow
            if not authorization_code:
                print("🔄 Direct login didn't work, trying OAuth2 flow...")
                authorization_code = self._try_oauth2_flow(username, password)
            
            if not authorization_code:
                print("❌ Failed to get authorization code - cannot proceed")
                return None
            
            # Step 5: Exchange authorization code for tokens
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
