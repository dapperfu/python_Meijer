#!/usr/bin/env python3
"""
Authenticated Meijer client that handles the complete login and 2FA flow.
Uses browser automation for initial landing and Akamai cookie capture,
then switches to requests for the authentication sequence.
"""

import json
import time
import logging
from typing import Dict, List, Optional, Any
from pathlib import Path
import requests
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.firefox.options import Options
from selenium.common.exceptions import TimeoutException, WebDriverException

from .exceptions import AuthenticationError, TwoFactorRequiredError
from .models.base import BaseModel

logger = logging.getLogger(__name__)


class AuthenticatedMeijerClient:
    """
    Authenticated Meijer client that handles login, 2FA, and maintains session.
    """
    
    def __init__(self, headless: bool = True, browser_timeout: int = 30):
        """
        Initialize the authenticated client.
        
        Args:
            headless: Whether to run browser in headless mode
            browser_timeout: Timeout for browser operations in seconds
        """
        self.headless = headless
        self.browser_timeout = browser_timeout
        self.session = requests.Session()
        self.driver = None
        self.authenticated = False
        
        # Authentication state
        self.state_handle = None
        self.authenticator_id = None
        self.jsessionid = None
        
        # Base URLs
        self.meijer_base = "https://www.meijer.com"
        self.okta_base = "https://id.meijer.com"
        
        # Setup session headers
        self._setup_session_headers()
    
    def _setup_session_headers(self):
        """Setup default session headers."""
        self.session.headers.update({
            'User-Agent': 'Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0',
            'Accept': 'application/json, text/plain, */*',
            'Accept-Language': 'en-US,en;q=0.5',
            'Accept-Encoding': 'gzip, deflate, br, zstd',
            'DNT': '1',
            'Connection': 'keep-alive',
            'Upgrade-Insecure-Requests': '1',
            'Sec-Fetch-Dest': 'document',
            'Sec-Fetch-Mode': 'navigate',
            'Sec-Fetch-Site': 'none',
            'Sec-Fetch-User': '?1',
            'Cache-Control': 'max-age=0'
        })
    
    def _setup_browser(self):
        """Setup Firefox browser with proper options."""
        try:
            options = Options()
            if self.headless:
                options.add_argument('--headless')
            
            # Add necessary Firefox preferences
            options.set_preference('dom.webdriver.enabled', False)
            options.set_preference('useAutomationExtension', False)
            options.set_preference('general.useragent.override', 
                                'Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0')
            
            # Disable images and CSS for faster loading
            options.set_preference('permissions.default.image', 2)
            options.set_preference('permissions.default.stylesheet', 2)
            
            self.driver = webdriver.Firefox(options=options)
            self.driver.set_page_load_timeout(self.browser_timeout)
            logger.info("Firefox browser initialized successfully")
            
        except WebDriverException as e:
            logger.error(f"Failed to initialize browser: {e}")
            raise AuthenticationError("Browser initialization failed") from e
    
    def _capture_initial_cookies(self) -> Dict[str, str]:
        """
        Navigate to Meijer landing page and capture Akamai cookies.
        
        Returns:
            Dictionary of captured cookies
        """
        try:
            logger.info("Navigating to Meijer landing page...")
            self.driver.get(self.meijer_base)
            
            # Wait for page to load and JavaScript to execute
            time.sleep(5)
            
            # Wait for Akamai cookies to be set
            WebDriverWait(self.driver, self.browser_timeout).until(
                lambda driver: any('ak_' in cookie['name'] or 'bm_' in cookie['name'] 
                                 for cookie in driver.get_cookies())
            )
            
            # Capture all cookies
            cookies = {}
            for cookie in self.driver.get_cookies():
                cookies[cookie['name']] = cookie['value']
            
            logger.info(f"Captured {len(cookies)} cookies from landing page")
            
            # Verify critical cookies are present
            critical_cookies = ['ak_bmsc', '_abck', 'bm_sz', 'bm_sv']
            missing_cookies = [c for c in critical_cookies if c not in cookies]
            
            if missing_cookies:
                logger.warning(f"Missing critical cookies: {missing_cookies}")
            
            return cookies
            
        except TimeoutException:
            logger.error("Timeout waiting for Akamai cookies")
            raise AuthenticationError("Failed to capture Akamai cookies - timeout")
        except Exception as e:
            logger.error(f"Error capturing cookies: {e}")
            raise AuthenticationError(f"Failed to capture cookies: {e}")
    
    def _submit_username(self, username: str, cookies: Dict[str, str]) -> Dict[str, Any]:
        """
        Submit username to Okta identify endpoint.
        
        Args:
            username: Username/email to submit
            cookies: Cookies captured from landing page
            
        Returns:
            Response data from identify endpoint
        """
        try:
            # Update session cookies
            for name, value in cookies.items():
                self.session.cookies.set(name, value, domain='.meijer.com')
            
            # Prepare identify request
            identify_data = {
                "identifier": username,
                "stateHandle": None  # Will be set by Okta
            }
            
            # Update headers for identify request
            self.session.headers.update({
                'Content-Type': 'application/json',
                'Accept': 'application/json; okta-version=1.0.0',
                'Origin': self.okta_base,
                'Referer': f"{self.okta_base}/signin"
            })
            
            logger.info("Submitting username to Okta identify endpoint...")
            response = self.session.post(
                f"{self.okta_base}/idp/idx/identify",
                json=identify_data,
                timeout=30
            )
            
            if response.status_code != 200:
                raise AuthenticationError(f"Identify request failed: {response.status_code}")
            
            response_data = response.json()
            logger.info("Username submitted successfully")
            
            # Extract state handle and other important data
            if 'stateHandle' in response_data:
                self.state_handle = response_data['stateHandle']
                logger.info("State handle captured")
            
            return response_data
            
        except Exception as e:
            logger.error(f"Error submitting username: {e}")
            raise AuthenticationError(f"Username submission failed: {e}")
    
    def _save_auth_tokens(self, response_data: Dict[str, Any]):
        """
        Save authentication tokens to auth.json file.
        
        Args:
            response_data: Response data containing tokens
        """
        try:
            auth_data = {
                'timestamp': time.time(),
                'jsessionid': self.jsessionid,
                'state_handle': self.state_handle,
                'authenticator_id': self.authenticator_id,
                'cookies': {}
            }
            
            # Extract cookies from session
            for cookie in self.session.cookies:
                auth_data['cookies'][cookie.name] = {
                    'value': cookie.value,
                    'domain': cookie.domain,
                    'path': cookie.path,
                    'secure': cookie.secure,
                    'expires': cookie.expires
                }
            
            # Extract tokens from response data
            if 'tokens' in response_data:
                tokens = response_data['tokens']
                if 'accessToken' in tokens:
                    auth_data['access_token'] = tokens['accessToken']['value']
                    auth_data['token_type'] = tokens['accessToken'].get('tokenType', 'Bearer')
                if 'refreshToken' in tokens:
                    auth_data['refresh_token'] = tokens['refreshToken']['value']
                if 'idToken' in tokens:
                    auth_data['id_token'] = tokens['idToken']['value']
            
            # Extract bearer token from headers if present
            if 'authorization' in self.session.headers:
                auth_header = self.session.headers['authorization']
                if auth_header.startswith('Bearer '):
                    auth_data['bearer_token'] = auth_header[7:]  # Remove 'Bearer ' prefix
            
            # Save to auth.json
            with open('auth.json', 'w') as f:
                json.dump(auth_data, f, indent=2)
            
            logger.info("Authentication tokens saved to auth.json")
            
        except Exception as e:
            logger.error(f"Failed to save auth tokens: {e}")

    def _submit_2fa_code(self, code: str) -> Dict[str, Any]:
        """
        Submit 2FA verification code.
        
        Args:
            code: 2FA verification code
            
        Returns:
            Response data from 2FA verification
        """
        try:
            if not self.state_handle:
                raise AuthenticationError("No state handle available for 2FA verification")
            
            # Prepare 2FA verification request
            verification_data = {
                "credentials": {
                    "passcode": code
                },
                "stateHandle": self.state_handle
            }
            
            logger.info("Submitting 2FA verification code...")
            response = self.session.post(
                f"{self.okta_base}/idp/idx/challenge/answer",
                json=verification_data,
                timeout=30
            )
            
            if response.status_code != 200:
                raise AuthenticationError(f"2FA verification failed: {response.status_code}")
            
            response_data = response.json()
            logger.info("2FA verification successful")
            
            # Save authentication tokens
            self._save_auth_tokens(response_data)
            
            return response_data
            
        except Exception as e:
            logger.error(f"Error submitting 2FA code: {e}")
            raise AuthenticationError(f"2FA verification failed: {e}")
    
    def _initiate_2fa_challenge(self, method: str = "email") -> Dict[str, Any]:
        """
        Initiate 2FA challenge.
        
        Args:
            method: 2FA method (email, sms, etc.)
            
        Returns:
            Response data from 2FA challenge initiation
        """
        try:
            if not self.state_handle:
                raise AuthenticationError("No state handle available for 2FA challenge")
            
            # Prepare 2FA challenge request
            challenge_data = {
                "authenticator": {
                    "methodType": method,
                    "id": self.authenticator_id
                },
                "stateHandle": self.state_handle
            }
            
            logger.info(f"Initiating {method} 2FA challenge...")
            response = self.session.post(
                f"{self.okta_base}/idp/idx/challenge",
                json=challenge_data,
                timeout=30
            )
            
            if response.status_code != 200:
                raise AuthenticationError(f"2FA challenge initiation failed: {response.status_code}")
            
            response_data = response.json()
            logger.info(f"{method.capitalize()} 2FA challenge initiated")
            
            return response_data
            
        except Exception as e:
            logger.error(f"Error initiating 2FA challenge: {e}")
            raise AuthenticationError(f"2FA challenge initiation failed: {e}")
    
    def _submit_password(self, password: str) -> Dict[str, Any]:
        """
        Submit password to Okta challenge endpoint.
        
        Args:
            password: Password to submit
            
        Returns:
            Response data from challenge endpoint
        """
        try:
            if not self.state_handle:
                raise AuthenticationError("No state handle available for password submission")
            
            # Prepare password challenge request
            challenge_data = {
                "credentials": {
                    "passcode": password
                },
                "stateHandle": self.state_handle
            }
            
            # Update headers for challenge request
            self.session.headers.update({
                'Content-Type': 'application/json',
                'Accept': 'application/json; okta-version=1.0.0',
                'Origin': self.okta_base,
                'Referer': f"{self.okta_base}/signin"
            })
            
            logger.info("Submitting password to Okta challenge endpoint...")
            response = self.session.post(
                f"{self.okta_base}/idp/idx/challenge/answer",
                json=challenge_data,
                timeout=30
            )
            
            if response.status_code != 200:
                raise AuthenticationError(f"Password challenge failed: {response.status_code}")
            
            response_data = response.json()
            logger.info("Password submitted successfully")
            
            # Update JSESSIONID if present
            if 'jsessionid' in response.cookies:
                self.jsessionid = response.cookies['jsessionid']
            
            # Check if 2FA is required
            if response_data.get('type') == 'CHALLENGE':
                logger.info("2FA challenge required")
                raise TwoFactorRequiredError("2FA challenge required")
            
            # If no 2FA required, save tokens now
            self._save_auth_tokens(response_data)
            
            return response_data
            
        except TwoFactorRequiredError:
            raise
        except Exception as e:
            logger.error(f"Error submitting password: {e}")
            raise AuthenticationError(f"Password submission failed: {e}")
    
    def login(self, username: str, password: str, two_factor_callback=None) -> bool:
        """
        Complete login process including 2FA if required.
        
        Args:
            username: Username/email
            password: Password
            two_factor_callback: Callback function to get 2FA code
            
        Returns:
            True if login successful, False otherwise
        """
        try:
            logger.info("Starting Meijer authentication process...")
            
            # Step 1: Setup browser and capture initial cookies
            self._setup_browser()
            initial_cookies = self._capture_initial_cookies()
            
            # Step 2: Submit username
            identify_response = self._submit_username(username, initial_cookies)
            
            # Step 3: Submit password
            try:
                password_response = self._submit_password(password)
                # If we get here, no 2FA was required
                self.authenticated = True
                logger.info("Login successful without 2FA")
                return True
                
            except TwoFactorRequiredError:
                # 2FA is required, continue with 2FA flow
                logger.info("2FA required, proceeding with 2FA flow...")
                
                # Step 4: Initiate 2FA challenge
                challenge_response = self._initiate_2fa_challenge("email")
                
                # Step 5: Get 2FA code from user
                if two_factor_callback:
                    code = two_factor_callback()
                else:
                    code = input("Enter 2FA code from email: ")
                
                # Step 6: Submit 2FA code
                verification_response = self._submit_2fa_code(code)
                
                # Step 7: Check if authentication is complete
                if verification_response.get('type') == 'SUCCESS':
                    self.authenticated = True
                    logger.info("Login successful with 2FA")
                    return True
                else:
                    raise AuthenticationError("2FA verification did not complete successfully")
            
        except Exception as e:
            logger.error(f"Login failed: {e}")
            self.authenticated = False
            raise
        
        finally:
            # Clean up browser
            if self.driver:
                try:
                    self.driver.quit()
                except:
                    pass
                self.driver = None
    
    def _load_auth_tokens(self) -> bool:
        """
        Load authentication tokens from auth.json file.
        
        Returns:
            True if tokens were loaded successfully, False otherwise
        """
        try:
            if not Path('auth.json').exists():
                return False
            
            with open('auth.json', 'r') as f:
                auth_data = json.load(f)
            
            # Check if tokens are still valid (not expired)
            if 'timestamp' in auth_data:
                # Check if tokens are less than 1 hour old
                if time.time() - auth_data['timestamp'] > 3600:
                    logger.info("Stored tokens are expired")
                    return False
            
            # Restore session state
            if 'jsessionid' in auth_data:
                self.jsessionid = auth_data['jsessionid']
            if 'state_handle' in auth_data:
                self.state_handle = auth_data['state_handle']
            if 'authenticator_id' in auth_data:
                self.authenticator_id = auth_data['authenticator_id']
            
            # Restore cookies
            if 'cookies' in auth_data:
                for cookie_name, cookie_data in auth_data['cookies'].items():
                    self.session.cookies.set(
                        cookie_name,
                        cookie_data['value'],
                        domain=cookie_data.get('domain', ''),
                        path=cookie_data.get('path', '/')
                    )
            
            # Restore bearer token if present
            if 'bearer_token' in auth_data:
                self.session.headers['Authorization'] = f"Bearer {auth_data['bearer_token']}"
            
            # Restore access token if present
            if 'access_token' in auth_data:
                self.session.headers['Authorization'] = f"Bearer {auth_data['access_token']}"
            
            logger.info("Authentication tokens loaded from auth.json")
            return True
            
        except Exception as e:
            logger.error(f"Failed to load auth tokens: {e}")
            return False
    
    def is_authenticated(self) -> bool:
        """Check if client is authenticated."""
        if self.authenticated:
            return True
        
        # Try to load existing tokens
        if self._load_auth_tokens():
            # Test if the session is still valid
            try:
                response = self.session.get(f"{self.meijer_base}/account", timeout=10)
                if response.status_code == 200:
                    self.authenticated = True
                    logger.info("Session restored from stored tokens")
                    return True
                else:
                    logger.info("Stored tokens are invalid")
                    return False
            except Exception as e:
                logger.info(f"Failed to validate stored tokens: {e}")
                return False
        
        return False
    
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
        self.state_handle = None
        self.authenticator_id = None
        self.jsessionid = None
        
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


def create_authenticated_client(username: str, password: str, 
                              two_factor_callback=None, headless: bool = True) -> AuthenticatedMeijerClient:
    """
    Factory function to create and authenticate a Meijer client.
    
    Args:
        username: Username/email
        password: Password
        two_factor_callback: Callback function to get 2FA code
        headless: Whether to run browser in headless mode
        
    Returns:
        Authenticated client instance
    """
    client = AuthenticatedMeijerClient(headless=headless)
    client.login(username, password, two_factor_callback)
    return client
