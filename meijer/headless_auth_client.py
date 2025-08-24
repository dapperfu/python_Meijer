#!/usr/bin/env python3
"""
Headless Authentication Client for Meijer
Implements three authentication methods:
1. Pure requests - Fully headless using only HTTP calls
2. Hybrid-selenium - Minimal browser usage for cookie/header generation
3. Full selenium - Complete browser automation

All methods replicate the exact flows from captured logs with proper header spoofing.
"""

import json
import time
import logging
import secrets
import hashlib
import base64
import uuid
from typing import Dict, List, Optional, Any, Tuple
from pathlib import Path
import requests
from selenium import webdriver
from selenium.webdriver.firefox.options import Options
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.common.exceptions import TimeoutException, WebDriverException

from .exceptions import AuthenticationError, TwoFactorRequiredError
from .models.base import BaseModel

logger = logging.getLogger(__name__)


class HeadlessAuthClient:
    """
    Headless authentication client that replicates exact flows from logs.
    """
    
    def __init__(self, method: str = "requests", headless: bool = True):
        """
        Initialize the headless auth client.
        
        Args:
            method: Authentication method ("requests", "hybrid", "selenium")
            headless: Whether to run browser in headless mode (for hybrid/selenium)
        """
        self.method = method
        self.headless = headless
        self.session = requests.Session()
        self.driver = None
        self.authenticated = False
        
        # Authentication state
        self.state_token = None
        self.state_handle = None
        self.device_nonce = None
        self.authenticator_id = None
        
        # Base URLs
        self.meijer_base = "https://www.meijer.com"
        self.okta_base = "https://id.meijer.com"
        
        # OAuth2 parameters from successful flow
        self.client_id = "0oa1o8g9njWsUvwsx697"
        self.redirect_uri = "com.meijer.mobile.meijer:/login"
        self.scope = "openid profile offline_access"
        
        # User agent from successful mobile flow
        self.user_agent = "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36"
        
        # Setup session headers
        self._setup_session_headers()
        
        logger.info(f"HeadlessAuthClient initialized with method: {method}")
    
    def _setup_session_headers(self):
        """Setup default session headers based on successful mobile flow."""
        self.session.headers.update({
            'User-Agent': self.user_agent,
            'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
            'Accept-Language': 'en-US,en;q=0.9',
            'Accept-Encoding': 'gzip, deflate',
            'Sec-Fetch-Site': 'none',
            'Sec-Fetch-Mode': 'navigate',
            'Sec-Fetch-User': '?1',
            'Sec-Fetch-Dest': 'document',
            'Upgrade-Insecure-Requests': '1',
            'X-Requested-With': 'com.duckduckgo.mobile.android',
            'Sec-GPC': '1'
        })
    
    def _setup_browser(self):
        """Setup Firefox browser with proper options."""
        try:
            options = Options()
            if self.headless:
                options.add_argument('--headless')
            
            # Add necessary Firefox preferences for mobile app simulation
            options.set_preference('dom.webdriver.enabled', False)
            options.set_preference('useAutomationExtension', False)
            options.set_preference('general.useragent.override', self.user_agent)
            
            # Disable images and CSS for faster loading
            options.set_preference('permissions.default.image', 2)
            options.set_preference('permissions.default.stylesheet', 2)
            
            self.driver = webdriver.Firefox(options=options)
            self.driver.set_page_load_timeout(30)
            logger.info("Firefox browser initialized successfully")
            
        except WebDriverException as e:
            logger.error(f"Failed to initialize browser: {e}")
            raise AuthenticationError("Browser initialization failed") from e
    
    def _generate_pkce_params(self) -> Tuple[str, str]:
        """Generate PKCE parameters exactly as in successful flow."""
        code_verifier = secrets.token_urlsafe(32)
        code_challenge = base64.urlsafe_b64encode(
            hashlib.sha256(code_verifier.encode()).digest()
        ).decode().rstrip('=')
        return code_verifier, code_challenge
    
    def _generate_oauth_params(self) -> Dict[str, str]:
        """Generate OAuth2 parameters exactly as in successful flow."""
        code_verifier, code_challenge = self._generate_pkce_params()
        
        return {
            'login_hint': '',
            'code_challenge': code_challenge,
            'code_challenge_method': 'S256',
            'client_id': self.client_id,
            'scope': self.scope,
            'redirect_uri': self.redirect_uri,
            'response_type': 'code',
            'state': uuid.uuid4().hex,
            'nonce': uuid.uuid4().hex
        }
    
    def _get_device_fingerprint_headers(self) -> Dict[str, str]:
        """Get device fingerprint headers exactly as in successful flow."""
        return {
            'Accept': '*/*',
            'User-Agent': self.user_agent,
            'X-Requested-With': 'XMLHttpRequest',
            'Origin': self.okta_base,
            'Sec-Fetch-Site': 'same-origin',
            'Sec-Fetch-Mode': 'cors',
            'Sec-Fetch-Dest': 'empty',
            'Referer': f"{self.okta_base}/auth/services/devicefingerprint",
            'Accept-Encoding': 'gzip, deflate',
            'Accept-Language': 'en-US,en;q=0.9'
        }
    
    def _get_identify_headers(self) -> Dict[str, str]:
        """Get identify request headers exactly as in successful flow."""
        return {
            'Accept': 'application/json; okta-version=1.0.0',
            'X-Okta-User-Agent-Extended': 'okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459',
            'X-Device-Fingerprint': f"{self.device_nonce}|a51183db48a04679a8d3769ee8a151455b09acf91a15ffe9625eeec4f91ad5b7|21c0dae824c3f48f32f5b271e1d291d8",
            'User-Agent': self.user_agent,
            'Content-Type': 'application/json',
            'Origin': self.okta_base,
            'X-Requested-With': 'com.duckduckgo.mobile.android',
            'Sec-Fetch-Site': 'same-origin',
            'Sec-Fetch-Mode': 'cors',
            'Sec-Fetch-Dest': 'empty',
            'Accept-Encoding': 'gzip, deflate',
            'Accept-Language': 'en-US,en;q=0.9'
        }
    
    def _get_challenge_headers(self) -> Dict[str, str]:
        """Get challenge request headers exactly as in successful flow."""
        return {
            'Accept': 'application/json; okta-version=1.0.0',
            'X-Okta-User-Agent-Extended': 'okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459',
            'X-Device-Fingerprint': f"{self.device_nonce}|a51183db48a04679a8d3769ee8a151455b09acf91a15ffe9625eeec4f91ad5b7|21c0dae824c3f48f32f5b271e1d291d8",
            'User-Agent': self.user_agent,
            'Content-Type': 'application/json',
            'Origin': self.okta_base,
            'X-Requested-With': 'com.duckduckgo.mobile.android',
            'Sec-Fetch-Site': 'same-origin',
            'Sec-Fetch-Mode': 'cors',
            'Sec-Fetch-Dest': 'empty',
            'Accept-Encoding': 'gzip, deflate',
            'Accept-Language': 'en-US,en;q=0.9'
        }
    
    def _get_token_exchange_headers(self) -> Dict[str, str]:
        """Get token exchange headers exactly as in successful flow."""
        return {
            'Accept': 'application/json',
            'User-Agent': 'Meijer/102800000 okhttp/5.1.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)',
            'Content-Type': 'application/x-www-form-urlencoded'
        }
    
    def _step1_oauth_authorize(self) -> bool:
        """Step 1: OAuth2 Authorization - EXACT replication."""
        logger.info("🔐 Step 1: OAuth2 Authorization")
        
        # Generate OAuth parameters
        oauth_params = self._generate_oauth_params()
        url = f"{self.okta_base}/oauth2/default/v1/authorize"
        
        # Headers exactly as in successful flow
        headers = self.session.headers.copy()
        headers.update({
            'X-Requested-With': 'com.duckduckgo.mobile.android',
            'Sec-GPC': '1'
        })
        
        try:
            response = self.session.get(url, params=oauth_params, headers=headers)
            logger.info(f"   Status: {response.status_code}")
            logger.info(f"   Response size: {len(response.content)} bytes")
            
            if response.status_code == 200:
                # Extract state token from response
                content = response.text
                if 'stateToken' in content:
                    import re
                    match = re.search(r'stateToken["\']?\s*:\s*["\']([^"\']+)["\']', content)
                    if match:
                        self.state_token = match.group(1)
                        logger.info(f"   ✅ State token extracted: {self.state_token[:50]}...")
                        return True
                    else:
                        logger.error("   ❌ Could not extract state token from response")
                        return False
                else:
                    logger.error("   ❌ No state token found in response")
                    return False
            else:
                logger.error(f"   ❌ OAuth authorization failed: {response.status_code}")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error in OAuth authorization: {e}")
            return False
    
    def _step2_device_fingerprint(self) -> bool:
        """Step 2: Device Fingerprinting - EXACT replication."""
        logger.info("📱 Step 2: Device Fingerprinting")
        
        # First, visit the device fingerprint page
        fingerprint_url = f"{self.okta_base}/auth/services/devicefingerprint"
        
        headers = self.session.headers.copy()
        headers.update({
            'X-Requested-With': 'com.duckduckgo.mobile.android',
            'Sec-GPC': '1'
        })
        
        try:
            response = self.session.get(fingerprint_url, headers=headers)
            logger.info(f"   Device fingerprint page status: {response.status_code}")
            
            if response.status_code == 200:
                # Now get device nonce
                return self._step3_device_nonce()
            else:
                logger.error(f"   ❌ Device fingerprint page failed: {response.status_code}")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error in device fingerprinting: {e}")
            return False
    
    def _step3_device_nonce(self) -> bool:
        """Step 3: Device Nonce - EXACT replication."""
        logger.info("🔑 Step 3: Device Nonce")
        
        url = f"{self.okta_base}/api/v1/internal/device/nonce"
        
        # Headers exactly as in successful flow
        headers = self._get_device_fingerprint_headers()
        
        try:
            response = self.session.post(url, headers=headers, data='')
            logger.info(f"   Status: {response.status_code}")
            
            if response.status_code == 200:
                try:
                    data = response.json()
                    self.device_nonce = data.get('nonce')
                    logger.info(f"   ✅ Device nonce obtained: {self.device_nonce}")
                    return True
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    return False
            else:
                logger.error(f"   ❌ Device nonce failed: {response.status_code}")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error getting device nonce: {e}")
            return False
    
    def _step4_web_login_identify(self, username: str) -> bool:
        """Step 4: Web Login Identify - EXACT replication."""
        logger.info("🔐 Step 4: Web Login Identify")
        
        if not self.state_token:
            logger.error("   ❌ No state token available")
            return False
        
        url = f"{self.okta_base}/idp/idx/identify"
        
        # Headers exactly as in successful flow
        headers = self._get_identify_headers()
        
        # Request body exactly as in successful flow
        data = {
            "identifier": username,
            "stateHandle": self.state_token
        }
        
        try:
            response = self.session.post(url, headers=headers, json=data)
            logger.info(f"   Status: {response.status_code}")
            
            if response.status_code == 200:
                try:
                    data = response.json()
                    # Extract state handle for next step
                    if 'stateHandle' in data:
                        self.state_handle = data['stateHandle']
                        logger.info(f"   ✅ State handle obtained: {self.state_handle[:50]}...")
                        return True
                    else:
                        logger.error("   ❌ No state handle in response")
                        return False
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    return False
            else:
                logger.error(f"   ❌ Web login identify failed: {response.status_code}")
                logger.error(f"   Response: {response.text[:200]}...")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error in web login identify: {e}")
            return False
    
    def _step5_challenge_answer(self, password: str) -> bool:
        """Step 5: Challenge Answer (Password) - EXACT replication."""
        logger.info("🔑 Step 5: Challenge Answer")
        
        if not self.state_handle:
            logger.error("   ❌ No state handle available")
            return False
        
        url = f"{self.okta_base}/idp/idx/challenge/answer"
        
        # Headers exactly as in successful flow
        headers = self._get_challenge_headers()
        
        # Request body exactly as in successful flow
        data = {
            "credentials": {
                "passcode": password
            },
            "stateHandle": self.state_handle
        }
        
        try:
            response = self.session.post(url, headers=headers, json=data)
            logger.info(f"   Status: {response.status_code}")
            
            if response.status_code == 200:
                try:
                    data = response.json()
                    logger.info("   ✅ Challenge answer successful")
                    # Check if we have success redirect
                    if 'success' in data and 'href' in data['success']:
                        redirect_url = data['success']['href']
                        logger.info(f"   Redirect URL: {redirect_url}")
                        return self._step6_handle_success_redirect(redirect_url)
                    else:
                        logger.error("   ❌ No success redirect in response")
                        return False
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    return False
            else:
                logger.error(f"   ❌ Challenge answer failed: {response.status_code}")
                logger.error(f"   Response: {response.text[:200]}...")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error in challenge answer: {e}")
            return False
    
    def _step6_handle_success_redirect(self, redirect_url: str) -> bool:
        """Step 6: Handle success redirect to get authorization code."""
        logger.info("🔄 Step 6: Handle Success Redirect")
        
        try:
            response = self.session.get(redirect_url, allow_redirects=True)
            logger.info(f"   Redirect status: {response.status_code}")
            logger.info(f"   Final URL: {response.url}")
            
            # Extract authorization code from URL
            from urllib.parse import urlparse, parse_qs
            parsed = urlparse(response.url)
            params = parse_qs(parsed.query)
            
            if 'code' in params:
                auth_code = params['code'][0]
                logger.info(f"   ✅ Authorization code obtained: {auth_code[:20]}...")
                return self._step7_token_exchange(auth_code)
            else:
                logger.error("   ❌ No authorization code in redirect")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error handling redirect: {e}")
            return False
    
    def _step7_token_exchange(self, auth_code: str) -> bool:
        """Step 7: Token Exchange - EXACT replication."""
        logger.info("🎫 Step 7: Token Exchange")
        
        url = f"{self.okta_base}/oauth2/default/v1/token"
        
        # Headers exactly as in successful flow
        headers = self._get_token_exchange_headers()
        
        # Form data exactly as in successful flow
        data = {
            'grant_type': 'authorization_code',
            'code': auth_code,
            'redirect_uri': self.redirect_uri,
            'client_id': self.client_id
        }
        
        try:
            response = self.session.post(url, headers=headers, data=data)
            logger.info(f"   Status: {response.status_code}")
            
            if response.status_code == 200:
                try:
                    token_data = response.json()
                    logger.info("   ✅ Token exchange successful!")
                    logger.info(f"   Access token: {token_data.get('access_token', 'N/A')[:20]}...")
                    logger.info(f"   Token type: {token_data.get('token_type', 'N/A')}")
                    logger.info(f"   Expires in: {token_data.get('expires_in', 'N/A')}")
                    
                    # Save tokens to auth.json
                    self._save_tokens_to_auth_json(token_data)
                    self.authenticated = True
                    return True
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    return False
            else:
                logger.error(f"   ❌ Token exchange failed: {response.status_code}")
                logger.error(f"   Response: {response.text[:200]}...")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error in token exchange: {e}")
            return False
    
    def _save_tokens_to_auth_json(self, token_data: Dict[str, Any]):
        """Save tokens to auth.json file."""
        try:
            auth_data = {
                'access_token': token_data.get('access_token'),
                'token_type': token_data.get('token_type'),
                'expires_in': token_data.get('expires_in'),
                'scope': token_data.get('scope'),
                'id_token': token_data.get('id_token'),
                'timestamp': time.time()
            }
            
            with open('auth.json', 'w') as f:
                json.dump(auth_data, f, indent=2)
            
            logger.info("   💾 Tokens saved to auth.json")
            
        except Exception as e:
            logger.error(f"   ❌ Error saving tokens: {e}")
    
    def _hybrid_capture_cookies(self) -> Dict[str, str]:
        """Hybrid method: Use minimal browser to capture cookies and headers."""
        logger.info("🔄 Hybrid method: Capturing cookies with minimal browser usage")
        
        try:
            self._setup_browser()
            
            # Navigate to Meijer login page to trigger cookie generation
            logger.info("Navigating to Meijer login page...")
            self.driver.get(f"{self.meijer_base}/signin")
            time.sleep(5)  # Allow JavaScript to execute
            
            # Capture all cookies
            cookies = {}
            for cookie in self.driver.get_cookies():
                cookies[cookie['name']] = cookie['value']
            
            logger.info(f"Captured {len(cookies)} cookies from browser")
            
            # Update session cookies
            for name, value in cookies.items():
                self.session.cookies.set(name, value, domain='.meijer.com')
            
            return cookies
            
        except Exception as e:
            logger.error(f"Error in hybrid cookie capture: {e}")
            return {}
        finally:
            if self.driver:
                self.driver.quit()
                self.driver = None
    
    def _selenium_full_flow(self, username: str, password: str) -> bool:
        """Full Selenium method: Complete browser automation."""
        logger.info("🌐 Full Selenium method: Complete browser automation")
        
        try:
            self._setup_browser()
            
            # Navigate to Meijer login page
            logger.info("Navigating to Meijer login page...")
            self.driver.get(f"{self.meijer_base}/signin")
            time.sleep(3)
            
            # Wait for login form to load
            wait = WebDriverWait(self.driver, 10)
            
            # Find and fill username field
            try:
                username_field = wait.until(
                    EC.presence_of_element_located((By.NAME, "username"))
                )
                username_field.clear()
                username_field.send_keys(username)
                logger.info("Username entered")
            except TimeoutException:
                logger.error("Username field not found")
                return False
            
            # Find and fill password field
            try:
                password_field = wait.until(
                    EC.presence_of_element_located((By.NAME, "password"))
                )
                password_field.clear()
                password_field.send_keys(password)
                logger.info("Password entered")
            except TimeoutException:
                logger.error("Password field not found")
                return False
            
            # Find and click submit button
            try:
                submit_button = wait.until(
                    EC.element_to_be_clickable((By.XPATH, "//button[@type='submit']"))
                )
                submit_button.click()
                logger.info("Submit button clicked")
            except TimeoutException:
                logger.error("Submit button not found")
                return False
            
            # Wait for response
            time.sleep(5)
            
            # Check if we need 2FA
            if "verification" in self.driver.current_url.lower() or "challenge" in self.driver.current_url.lower():
                logger.info("2FA required - this method doesn't handle 2FA automatically")
                return False
            
            # Check if login was successful
            if "account" in self.driver.current_url.lower() or "dashboard" in self.driver.current_url.lower():
                logger.info("Login successful via Selenium")
                self.authenticated = True
                return True
            
            logger.error("Login status unclear")
            return False
            
        except Exception as e:
            logger.error(f"Error in full Selenium flow: {e}")
            return False
        finally:
            if self.driver:
                self.driver.quit()
                self.driver = None
    
    def login(self, username: str, password: str) -> bool:
        """
        Complete login process using the specified method.
        
        Args:
            username: Username/email
            password: Password
            
        Returns:
            True if login successful, False otherwise
        """
        try:
            logger.info(f"🚀 Starting {self.method.upper()} authentication process...")
            
            if self.method == "requests":
                # Pure requests method
                logger.info("📡 Using pure requests method")
                
                # Step 1: OAuth2 Authorization
                if not self._step1_oauth_authorize():
                    return False
                
                # Wait as in successful flow
                logger.info("   ⏱️  Waiting 43.71 seconds (as in successful flow)...")
                time.sleep(43.71)
                
                # Step 2: Device Fingerprinting
                if not self._step2_device_fingerprint():
                    return False
                
                # Wait as in successful flow
                logger.info("   ⏱️  Waiting 0.32 seconds (as in successful flow)...")
                time.sleep(0.32)
                
                # Step 4: Web Login Identify
                if not self._step4_web_login_identify(username):
                    return False
                
                # Wait as in successful flow
                logger.info("   ⏱️  Waiting 48.18 seconds (as in successful flow)...")
                time.sleep(48.18)
                
                # Step 5: Challenge Answer
                if not self._step5_challenge_answer(password):
                    return False
                
                # Wait as in successful flow
                logger.info("   ⏱️  Waiting 79.50 seconds (as in successful flow)...")
                time.sleep(79.50)
                
                logger.info("✅ Pure requests authentication completed successfully!")
                return True
                
            elif self.method == "hybrid":
                # Hybrid method: Minimal browser + requests
                logger.info("🔄 Using hybrid method (minimal browser + requests)")
                
                # Capture cookies with minimal browser usage
                self._hybrid_capture_cookies()
                
                # Continue with requests flow
                if not self._step1_oauth_authorize():
                    return False
                
                if not self._step2_device_fingerprint():
                    return False
                
                if not self._step4_web_login_identify(username):
                    return False
                
                if not self._step5_challenge_answer(password):
                    return False
                
                logger.info("✅ Hybrid authentication completed successfully!")
                return True
                
            elif self.method == "selenium":
                # Full Selenium method
                logger.info("🌐 Using full Selenium method")
                
                return self._selenium_full_flow(username, password)
                
            else:
                logger.error(f"Unknown authentication method: {self.method}")
                return False
                
        except Exception as e:
            logger.error(f"Login failed: {e}")
            self.authenticated = False
            raise
        
        finally:
            # Clean up browser if used
            if self.driver:
                try:
                    self.driver.quit()
                except:
                    pass
                self.driver = None
    
    def is_authenticated(self) -> bool:
        """Check if client is authenticated."""
        return self.authenticated
    
    def get_session(self) -> requests.Session:
        """
        Get the authenticated session for making requests.
        
        Returns:
            Authenticated requests session
        """
        if not self.is_authenticated():
            raise AuthenticationError("Not authenticated. Call login() first.")
        
        return self.session
    
    def logout(self):
        """Logout and clear session."""
        try:
            if self.session:
                self.session.post(f"{self.okta_base}/idp/idx/signout")
        except:
            pass
        
        # Clear auth.json file
        try:
            if Path('auth.json').exists():
                Path('auth.json').unlink()
                logger.info("auth.json cleared")
        except Exception as e:
            logger.error(f"Failed to clear auth.json: {e}")
        
        self.session = requests.Session()
        self.authenticated = False
        self.state_token = None
        self.state_handle = None
        self.device_nonce = None
        
        # Reset session headers
        self._setup_session_headers()
        
        logger.info("Logged out successfully")
    
    def __enter__(self):
        """Context manager entry."""
        return self
    
    def __exit__(self, exc_type, exc_val, exc_tb):
        """Context manager exit."""
        if self.driver:
            try:
                self.driver.quit()
            except:
                pass
        self.logout()


def create_headless_client(method: str = "requests", headless: bool = True) -> HeadlessAuthClient:
    """
    Factory function to create a headless auth client.
    
    Args:
        method: Authentication method ("requests", "hybrid", "selenium")
        headless: Whether to run browser in headless mode (for hybrid/selenium)
        
    Returns:
        Headless auth client instance
    """
    return HeadlessAuthClient(method=method, headless=headless)
