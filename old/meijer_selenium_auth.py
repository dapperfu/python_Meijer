#!/usr/bin/env python3
"""
Selenium-based authentication for Meijer OAuth flow.

This module automates the OAuth 2.0 authorization flow using Selenium WebDriver,
allowing for automatic login and authorization code extraction.
"""

import json
import logging
import re
import time
import urllib.parse
from typing import Optional, Tuple, Dict, Any
from urllib.parse import parse_qs, urlparse

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.chrome.service import Service
from selenium.common.exceptions import (
    TimeoutException,
    NoSuchElementException,
    WebDriverException,
    ElementClickInterceptedException,
)

from meijer_comprehensive import MeijerComprehensiveClient, OAuthConfig


class MeijerSeleniumAuth:
    """
    Selenium-based authentication handler for Meijer OAuth flow.

    This class automates the entire OAuth authorization process:
    1. Opens the authorization URL
    2. Handles login form submission
    3. Waits for redirect and extracts authorization code
    4. Returns the code for token exchange
    """

    def __init__(
        self,
        username: str,
        password: str,
        headless: bool = False,
        timeout: int = 30,
        implicit_wait: int = 10,
    ):
        """
        Initialize the Selenium authentication handler.

        Args:
            username: Meijer account username/email
            password: Meijer account password
            headless: Run browser in headless mode
            timeout: Maximum wait time for elements
            implicit_wait: Implicit wait time for elements
        """
        self.username = username
        self.password = password
        self.headless = headless
        self.timeout = timeout
        self.implicit_wait = implicit_wait
        self.driver = None

        # Setup logging
        logging.basicConfig(level=logging.INFO)
        self.logger = logging.getLogger(__name__)

        # OAuth configuration
        self.oauth_config = OAuthConfig()

    def _setup_driver(self) -> webdriver.Chrome:
        """Setup and configure Chrome WebDriver."""
        try:
            chrome_options = Options()

            if self.headless:
                chrome_options.add_argument("--headless")

            # Add options for better compatibility
            chrome_options.add_argument("--no-sandbox")
            chrome_options.add_argument("--disable-dev-shm-usage")
            chrome_options.add_argument("--disable-gpu")
            chrome_options.add_argument("--window-size=1920,1080")
            chrome_options.add_argument(
                "--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
            )

            # Disable images and CSS for faster loading
            chrome_options.add_argument("--disable-images")
            chrome_options.add_argument("--disable-javascript")

            # Create driver
            self.driver = webdriver.Chrome(options=chrome_options)
            self.driver.implicitly_wait(self.implicit_wait)

            self.logger.info("✅ Chrome WebDriver initialized successfully")
            return self.driver

        except Exception as e:
            self.logger.error(f"❌ Failed to initialize WebDriver: {e}")
            raise

    def _wait_for_element(
        self, by: By, value: str, timeout: Optional[int] = None
    ) -> Any:
        """Wait for an element to be present and visible."""
        wait_time = timeout or self.timeout
        wait = WebDriverWait(self.driver, wait_time)
        return wait.until(EC.element_to_be_clickable((by, value)))

    def _safe_find_element(self, by: By, value: str):
        """Safely find an element without waiting."""
        try:
            return self.driver.find_element(by, value)
        except NoSuchElementException:
            return None

    def _extract_auth_code_from_url(self, url: str) -> Optional[str]:
        """Extract authorization code from URL or page content."""
        try:
            # Try to parse as URL first
            parsed = urlparse(url)
            if parsed.scheme == "https":
                # Check query parameters
                query_params = parse_qs(parsed.query)
                if "code" in query_params:
                    return query_params["code"][0]

            # If no code in URL, check page content for redirect patterns
            page_source = self.driver.page_source

            # Look for common OAuth redirect patterns
            patterns = [
                r"code=([a-zA-Z0-9_-]+)",
                r"authorization_code=([a-zA-Z0-9_-]+)",
                r"auth_code=([a-zA-Z0-9_-]+)",
                r"redirect.*?code=([a-zA-Z0-9_-]+)",
                r"com\.meijer\.mobile\.meijer:/login\?code=([a-zA-Z0-9_-]+)",
            ]

            for pattern in patterns:
                match = re.search(pattern, page_source)
                if match:
                    return match.group(1)

            # Check for any URL-like strings in the page
            url_pattern = r'https?://[^\s<>"{}|\\^`\[\]]+'
            urls = re.findall(url_pattern, page_source)

            for found_url in urls:
                if "code=" in found_url:
                    code_match = re.search(r"code=([a-zA-Z0-9_-]+)", found_url)
                    if code_match:
                        return code_match.group(1)

            return None

        except Exception as e:
            self.logger.error(f"Error extracting auth code: {e}")
            return None

    def _handle_login_form(self) -> bool:
        """Handle the login form submission."""
        try:
            self.logger.info("🔐 Handling login form...")

            # Wait for login form to load
            username_field = self._wait_for_element(By.ID, "input-1")
            password_field = self._wait_for_element(By.ID, "input-2")

            # Clear fields and enter credentials
            username_field.clear()
            username_field.send_keys(self.username)

            password_field.clear()
            password_field.send_keys(self.password)

            # Find and click login button
            login_button = self._wait_for_element(By.ID, "input-3")
            login_button.click()

            self.logger.info("✅ Login credentials submitted")
            return True

        except TimeoutException:
            self.logger.error("❌ Login form elements not found within timeout")
            return False
        except Exception as e:
            self.logger.error(f"❌ Error handling login form: {e}")
            return False

    def _handle_mfa_if_needed(self) -> bool:
        """Handle multi-factor authentication if required."""
        try:
            # Check if MFA is required
            mfa_elements = [
                "input-4",  # Common MFA input field ID
                "input-5",  # Alternative MFA field
                "mfa-input",  # Generic MFA input
                "verification-code",  # Verification code input
            ]

            for element_id in mfa_elements:
                mfa_field = self._safe_find_element(By.ID, element_id)
                if mfa_field:
                    self.logger.warning(
                        "⚠️  MFA detected - manual intervention required"
                    )
                    self.logger.info("📱 Please enter MFA code manually in the browser")

                    # Wait for user to enter MFA code
                    input("Press Enter after entering MFA code...")
                    return True

            # No MFA required
            return True

        except Exception as e:
            self.logger.error(f"❌ Error handling MFA: {e}")
            return False

    def _wait_for_redirect_or_code(self, max_wait: int = 60) -> Optional[str]:
        """Wait for redirect or authorization code to appear."""
        start_time = time.time()

        while time.time() - start_time < max_wait:
            try:
                current_url = self.driver.current_url

                # Check if we've been redirected to a URL with an auth code
                if "code=" in current_url:
                    auth_code = self._extract_auth_code_from_url(current_url)
                    if auth_code:
                        self.logger.info(
                            f"✅ Authorization code found in URL: {auth_code[:10]}..."
                        )
                        return auth_code

                # Check page content for auth code
                auth_code = self._extract_auth_code_from_url("")
                if auth_code:
                    self.logger.info(
                        f"✅ Authorization code found in page: {auth_code[:10]}..."
                    )
                    return auth_code

                # Check for error messages
                error_elements = self.driver.find_elements(By.CLASS_NAME, "error")
                if error_elements:
                    error_text = error_elements[0].text
                    if "error" in error_text.lower():
                        self.logger.error(f"❌ Login error detected: {error_text}")
                        return None

                # Wait a bit before checking again
                time.sleep(2)

            except Exception as e:
                self.logger.debug(f"Error during redirect wait: {e}")
                time.sleep(2)

        self.logger.error("❌ Timeout waiting for authorization code")
        return None

    def authenticate(self, auth_url: str) -> Optional[str]:
        """
        Perform complete OAuth authentication flow.

        Args:
            auth_url: The OAuth authorization URL

        Returns:
            Authorization code if successful, None otherwise
        """
        try:
            self.logger.info("🚀 Starting Selenium-based OAuth authentication")

            # Setup WebDriver
            self._setup_driver()

            # Navigate to authorization URL
            self.logger.info(f"🌐 Opening authorization URL: {auth_url[:100]}...")
            self.driver.get(auth_url)

            # Wait for page to load
            time.sleep(3)

            # Handle login form
            if not self._handle_login_form():
                return None

            # Wait for login to process
            time.sleep(3)

            # Handle MFA if needed
            if not self._handle_mfa_if_needed():
                return None

            # Wait for redirect and extract auth code
            auth_code = self._wait_for_redirect_or_code()

            if auth_code:
                self.logger.info("🎉 OAuth authentication completed successfully!")
                return auth_code
            else:
                self.logger.error("❌ Failed to obtain authorization code")
                return None

        except Exception as e:
            self.logger.error(f"❌ Authentication failed: {e}")
            return None

        finally:
            # Clean up
            if self.driver:
                self.driver.quit()
                self.driver = None

    def get_page_info(self) -> Dict[str, Any]:
        """Get current page information for debugging."""
        if not self.driver:
            return {"error": "No driver available"}

        try:
            return {
                "current_url": self.driver.current_url,
                "title": self.driver.title,
                "page_source_length": len(self.driver.page_source),
                "cookies": self.driver.get_cookies(),
                "window_handles": len(self.driver.window_handles),
            }
        except Exception as e:
            return {"error": str(e)}


class MeijerSeleniumClient(MeijerComprehensiveClient):
    """
    Enhanced Meijer client with Selenium-based authentication.

    Extends the base client to include automatic OAuth authentication
    using Selenium WebDriver.
    """

    def __init__(self, username: str, password: str, **kwargs):
        """
        Initialize the Selenium-enhanced client.

        Args:
            username: Meijer account username/email
            password: Meijer account password
            **kwargs: Additional arguments for base client
        """
        super().__init__(username, password, **kwargs)
        self.selenium_auth = MeijerSeleniumAuth(username, password)

    def login_with_selenium(self, headless: bool = False) -> bool:
        """
        Perform OAuth login using Selenium automation.

        Args:
            headless: Run browser in headless mode

        Returns:
            True if authentication successful, False otherwise
        """
        try:
            self.logger.info("🤖 Starting Selenium-based OAuth login")

            # Configure Selenium auth
            self.selenium_auth.headless = headless

            # Generate authorization URL
            auth_url, state, code_verifier = self.get_authorization_url()

            # Perform authentication
            auth_code = self.selenium_auth.authenticate(auth_url)

            if auth_code:
                # Exchange code for tokens
                success = self.authenticate_with_code(auth_code, code_verifier)
                if success:
                    self.logger.info("✅ Selenium-based login completed successfully!")
                    return True
                else:
                    self.logger.error(
                        "❌ Failed to exchange authorization code for tokens"
                    )
                    return False
            else:
                self.logger.error(
                    "❌ Failed to obtain authorization code from Selenium"
                )
                return False

        except Exception as e:
            self.logger.error(f"❌ Selenium-based login failed: {e}")
            return False

    def login(self) -> bool:
        """
        Override base login method to use Selenium by default.
        """
        return self.login_with_selenium()


def main():
    """Example usage of Selenium-based authentication."""
    print("🤖 Meijer Selenium Authentication Demo")
    print("=" * 50)

    # Get credentials
    username = input("Enter Meijer username/email: ").strip()
    password = input("Enter Meijer password: ").strip()

    if not username or not password:
        print("❌ Username and password are required")
        return

    try:
        # Create client with Selenium authentication
        client = MeijerSeleniumClient(username, password)

        # Perform automated login
        print("\n🚀 Starting automated OAuth authentication...")
        if client.login_with_selenium(headless=False):
            print("✅ Authentication successful!")

            # Show session info
            session_info = client.get_session_info()
            print(f"📊 Session Info: {json.dumps(session_info, indent=2)}")

            # Test API calls
            print("\n🧪 Testing API calls...")
            offers = client.get_offers(limit=3)
            print(f"🎯 Found {len(offers)} offers")

            stores = client.get_stores(zip_code="49525")
            print(f"🏪 Found {len(stores)} stores")

        else:
            print("❌ Authentication failed")

    except KeyboardInterrupt:
        print("\n⏹️  Operation cancelled by user")
    except Exception as e:
        print(f"❌ Error: {e}")


if __name__ == "__main__":
    main()
