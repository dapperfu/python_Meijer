#!/usr/bin/env python3
"""
Enhanced Headless Authentication Client with Firefox Profile Support

This module provides an enhanced authentication client that uses Firefox profiles
to maintain persistent login sessions across browser sessions. This allows:
1. Sharing authentication state between Selenium automation and regular Firefox
2. Maintaining login credentials and cookies
3. Demonstrating functionality in regular Firefox
4. Avoiding repeated authentication steps

Author: Claude Sonnet 4 (claude-3-5-sonnet-20241022)
Generated via Cursor IDE (cursor.sh) with AI assistance
Model: Anthropic Claude 3.5 Sonnet
Generation timestamp: 2024-12-19
Context: Enhanced headless authentication with persistent Firefox profiles
"""

import logging
import time
from typing import Optional, Dict, Any
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.firefox.options import Options
from selenium.common.exceptions import WebDriverException, TimeoutException

from .firefox_profile_manager import create_meijer_profile
from .exceptions import AuthenticationError

logger = logging.getLogger(__name__)


class EnhancedHeadlessAuthClient:
    """
    Enhanced headless authentication client with Firefox profile support.

    This client maintains persistent authentication sessions using Firefox profiles,
    allowing seamless sharing between automation and manual testing.
    """

    def __init__(
        self,
        username: str,
        password: str,
        profile_name: str = "meijer_automation",
        headless: bool = True,
        proxy_host: str = "127.0.0.1",
        proxy_port: int = 8080,
        browser_timeout: int = 30,
    ):
        """
        Initialize the enhanced headless authentication client.

        Args:
            username: Meijer username/email
            password: Meijer password
            profile_name: Name of Firefox profile to use
            headless: Whether to run browser in headless mode
            proxy_host: Proxy host for mitmproxy
            proxy_port: Proxy port for mitmproxy
            browser_timeout: Browser timeout in seconds
        """
        self.username = username
        self.password = password
        self.profile_name = profile_name
        self.headless = headless
        self.proxy_host = proxy_host
        self.proxy_port = proxy_port
        self.browser_timeout = browser_timeout

        # Initialize Firefox profile manager
        self.profile_manager = create_meijer_profile(
            profile_name=profile_name, proxy_host=proxy_host, proxy_port=proxy_port
        )

        # Browser driver
        self.driver: Optional[webdriver.Firefox] = None

        # User agent for mobile app simulation
        self.user_agent = (
            "Mozilla/5.0 (Linux; Android 10; SM-G975F) "
            "AppleWebKit/537.36 (KHTML, like Gecko) "
            "Chrome/91.0.4472.120 Mobile Safari/537.36"
        )

        logger.info(
            f"Enhanced Headless Auth Client initialized for profile: {profile_name}"
        )
        logger.info(f"Profile directory: {self.profile_manager.get_profile_path()}")

    def _setup_browser(self) -> None:
        """Setup Firefox browser with profile and proper options."""
        try:
            # Create Firefox options
            options = Options()

            # Configure options using profile manager
            options = self.profile_manager.configure_selenium_options(
                options, self.proxy_host, self.proxy_port
            )

            # Set headless mode if requested
            if self.headless:
                options.add_argument("--headless")
                logger.info("Running in headless mode")

            # Set window size for headless mode
            options.add_argument("--width=1920")
            options.add_argument("--height=1080")

            # Additional performance optimizations
            options.add_argument("--disable-gpu")
            options.add_argument("--no-sandbox")
            options.add_argument("--disable-dev-shm-usage")

            # Initialize browser with profile
            self.driver = webdriver.Firefox(options=options)
            self.driver.set_page_load_timeout(self.browser_timeout)

            logger.info("Firefox browser initialized successfully with profile")

        except WebDriverException as e:
            logger.error(f"Failed to initialize browser: {e}")
            raise AuthenticationError("Browser initialization failed") from e

    def _wait_for_element(self, by: By, value: str, timeout: int = 10) -> Any:
        """Wait for an element to be present and visible."""
        wait = WebDriverWait(self.driver, timeout)
        return wait.until(EC.presence_of_element_located((by, value)))

    def _wait_for_element_clickable(self, by: By, value: str, timeout: int = 10) -> Any:
        """Wait for an element to be clickable."""
        wait = WebDriverWait(self.driver, timeout)
        return wait.until(EC.element_to_be_clickable((by, value)))

    def authenticate(self) -> Dict[str, Any]:
        """
        Perform authentication using the persistent Firefox profile.

        Returns:
            Dictionary containing authentication results
        """
        try:
            logger.info("Starting authentication process...")

            # Setup browser
            self._setup_browser()

            # Step 1: Navigate to Meijer signin page
            logger.info("Step 1: Navigating to Meijer signin page...")
            self.driver.get("https://www.meijer.com/signin")

            # Wait for page to load
            time.sleep(3)

            # Check if already logged in
            if self._check_if_logged_in():
                logger.info("Already logged in - using existing session")
                return self._get_authentication_result(
                    success=True, message="Using existing session"
                )

            # Step 2: Handle OAuth2 flow
            logger.info("Step 2: Handling OAuth2 authentication flow...")
            if not self._handle_oauth2_flow():
                return self._get_authentication_result(
                    success=False, message="OAuth2 flow failed"
                )

            # Step 3: Submit credentials
            logger.info("Step 3: Submitting credentials...")
            if not self._submit_credentials():
                return self._get_authentication_result(
                    success=False, message="Credential submission failed"
                )

            # Step 4: Handle 2FA if required
            logger.info("Step 4: Checking for 2FA requirements...")
            if self._requires_2fa():
                logger.info("2FA required - authentication complete with 2FA pending")
                return self._get_authentication_result(
                    success=True, message="Authentication complete, 2FA pending"
                )

            # Step 5: Verify successful authentication
            logger.info("Step 5: Verifying authentication success...")
            if self._verify_authentication():
                logger.info("Authentication completed successfully")
                return self._get_authentication_result(
                    success=True, message="Authentication successful"
                )
            else:
                return self._get_authentication_result(
                    success=False, message="Authentication verification failed"
                )

        except Exception as e:
            logger.error(f"Authentication failed: {e}")
            return self._get_authentication_result(success=False, message=str(e))

        finally:
            # Keep browser open if not headless for debugging
            if self.headless and self.driver:
                self.driver.quit()
                logger.info("Browser closed (headless mode)")

    def _check_if_logged_in(self) -> bool:
        """Check if already logged in by looking for user account elements."""
        try:
            # Look for elements that indicate logged-in state
            logged_in_indicators = [
                "//a[contains(@href, '/account')]",
                "//button[contains(text(), 'Account')]",
                "//span[contains(text(), 'Welcome')]",
                "//a[contains(text(), 'Sign Out')]",
            ]

            for xpath in logged_in_indicators:
                try:
                    element = self.driver.find_element(By.XPATH, xpath)
                    if element.is_displayed():
                        logger.info("Found logged-in indicator")
                        return True
                except:
                    continue

            return False

        except Exception as e:
            logger.debug(f"Error checking login status: {e}")
            return False

    def _handle_oauth2_flow(self) -> bool:
        """Handle the OAuth2 authentication flow."""
        try:
            # Wait for OAuth2 page to load
            time.sleep(5)

            # Look for username/email input field
            username_input = self._wait_for_element(
                By.ID, "okta-signin-username", timeout=15
            )
            logger.info("OAuth2 page loaded successfully")

            return True

        except TimeoutException:
            logger.warning("OAuth2 page did not load as expected")
            return False
        except Exception as e:
            logger.error(f"Error handling OAuth2 flow: {e}")
            return False

    def _submit_credentials(self) -> bool:
        """Submit username and password credentials."""
        try:
            # Find and fill username field
            username_input = self._wait_for_element(By.ID, "okta-signin-username")
            username_input.clear()
            username_input.send_keys(self.username)
            logger.info("Username entered")

            # Find and fill password field
            password_input = self._wait_for_element(By.ID, "okta-signin-password")
            password_input.clear()
            password_input.send_keys(self.password)
            logger.info("Password entered")

            # Submit the form
            submit_button = self._wait_for_element_clickable(
                By.ID, "okta-signin-submit"
            )
            submit_button.click()
            logger.info("Credentials submitted")

            # Wait for response
            time.sleep(3)

            return True

        except Exception as e:
            logger.error(f"Error submitting credentials: {e}")
            return False

    def _requires_2fa(self) -> bool:
        """Check if 2FA is required after credential submission."""
        try:
            # Look for 2FA indicators
            twofa_indicators = [
                "//input[@name='passcode']",
                "//input[@placeholder='Enter code']",
                "//div[contains(text(), 'verification')]",
                "//div[contains(text(), '2FA')]",
            ]

            for xpath in twofa_indicators:
                try:
                    element = self.driver.find_element(By.XPATH, xpath)
                    if element.is_displayed():
                        logger.info("2FA required detected")
                        return True
                except:
                    continue

            return False

        except Exception as e:
            logger.debug(f"Error checking 2FA requirement: {e}")
            return False

    def _verify_authentication(self) -> bool:
        """Verify that authentication was successful."""
        try:
            # Wait for redirect or success page
            time.sleep(5)

            current_url = self.driver.current_url
            logger.info(f"Current URL after authentication: {current_url}")

            # Check for successful authentication indicators
            success_indicators = [
                "//a[contains(@href, '/account')]",
                "//button[contains(text(), 'Account')]",
                "//span[contains(text(), 'Welcome')]",
                "//div[contains(text(), 'Welcome')]",
            ]

            for xpath in success_indicators:
                try:
                    element = self.driver.find_element(By.XPATH, xpath)
                    if element.is_displayed():
                        logger.info("Authentication success verified")
                        return True
                except:
                    continue

            # Check if we're on a success page
            if "account" in current_url.lower() or "dashboard" in current_url.lower():
                logger.info("Authentication success verified via URL")
                return True

            return False

        except Exception as e:
            logger.error(f"Error verifying authentication: {e}")
            return False

    def _get_authentication_result(self, success: bool, message: str) -> Dict[str, Any]:
        """Create authentication result dictionary."""
        result = {
            "success": success,
            "message": message,
            "profile_path": self.profile_manager.get_profile_path(),
            "profile_info": self.profile_manager.get_profile_info(),
        }

        if success:
            result["browser_available"] = self.driver is not None
            if self.driver:
                result["current_url"] = self.driver.current_url
                result["page_title"] = self.driver.title

        return result

    def get_profile_info(self) -> Dict[str, Any]:
        """Get information about the Firefox profile."""
        return self.profile_manager.get_profile_info()

    def backup_profile(self, backup_name: Optional[str] = None) -> Optional[str]:
        """Create a backup of the current profile."""
        return self.profile_manager.backup_profile(backup_name)

    def restore_profile(self, backup_path: str) -> bool:
        """Restore profile from a backup."""
        return self.profile_manager.restore_profile(backup_path)

    def clean_profile(self) -> bool:
        """Clean the profile by removing temporary files."""
        return self.profile_manager.clean_profile()

    def launch_regular_firefox(self) -> bool:
        """Launch regular Firefox using this profile."""
        return self.profile_manager.launch_regular_firefox()

    def close_browser(self) -> None:
        """Close the browser if it's open."""
        if self.driver:
            self.driver.quit()
            self.driver = None
            logger.info("Browser closed")

    def __enter__(self):
        """Context manager entry."""
        return self

    def __exit__(self, exc_type, exc_val, exc_tb):
        """Context manager exit."""
        self.close_browser()


def authenticate_with_profile(
    username: str,
    password: str,
    profile_name: str = "meijer_automation",
    headless: bool = True,
    proxy_host: str = "127.0.0.1",
    proxy_port: int = 8080,
) -> Dict[str, Any]:
    """
    Convenience function to authenticate using a Firefox profile.

    Args:
        username: Meijer username/email
        password: Meijer password
        profile_name: Name of Firefox profile to use
        headless: Whether to run browser in headless mode
        proxy_host: Proxy host for mitmproxy
        proxy_port: Proxy port for mitmproxy

    Returns:
        Dictionary containing authentication results
    """
    with EnhancedHeadlessAuthClient(
        username=username,
        password=password,
        profile_name=profile_name,
        headless=headless,
        proxy_host=proxy_host,
        proxy_port=proxy_port,
    ) as client:
        return client.authenticate()
