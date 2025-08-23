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
            
            return response_data
            
        except TwoFactorRequiredError:
            raise
        except Exception as e:
            logger.error(f"Error submitting password: {e}")
            raise AuthenticationError(f"Password submission failed: {e}")
    
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
            
            return response_data
            
        except Exception as e:
            logger.error(f"Error submitting 2FA code: {e}")
            raise AuthenticationError(f"2FA verification failed: {e}")
    
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
    
    def get_session(self) -> requests.Session:
        """
        Get the authenticated session for making requests.
        
        Returns:
            Authenticated requests session
        """
        if not self.authenticated:
            raise AuthenticationError("Not authenticated. Call login() first.")
        
        return self.session
    
    def is_authenticated(self) -> bool:
        """Check if client is authenticated."""
        return self.authenticated
    
    def logout(self):
        """Logout and clear session."""
        try:
            if self.session:
                self.session.post(f"{self.okta_base}/idp/idx/signout")
        except:
            pass
        
        self.session = requests.Session()
        self.authenticated = False
        self.state_handle = None
        self.authenticator_id = None
        self.jsessionid = None
        
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
