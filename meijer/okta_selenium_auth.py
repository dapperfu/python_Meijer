#!/usr/bin/env python3
"""
OKTA Selenium-based Authentication for Meijer API

This module uses Selenium WebDriver to perform authentication through an actual browser,
bypassing Akamai protection and handling the complete authentication flow.
"""

import logging
import time
from typing import Any, Dict, Optional
from urllib.parse import urlencode

try:
    from selenium import webdriver
    from selenium.common.exceptions import NoSuchElementException, TimeoutException
    from selenium.webdriver.chrome.options import Options as ChromeOptions
    from selenium.webdriver.common.by import By
    from selenium.webdriver.firefox.options import Options as FirefoxOptions
    from selenium.webdriver.support import expected_conditions as EC
    from selenium.webdriver.support.ui import WebDriverWait

    SELENIUM_AVAILABLE = True
except ImportError:
    SELENIUM_AVAILABLE = False
    print("⚠️ Selenium not available. Install with: pip install selenium")


class OktaSeleniumAuth:
    """Selenium-based authentication that bypasses Akamai protection."""

    def __init__(self, username: str, password: str, headless: bool = True):
        self.username = username
        self.password = password
        self.headless = headless
        self.base_url = "https://id.meijer.com"
        self.oauth_authorize_url = f"{self.base_url}/oauth2/default/v1/authorize"
        self.driver = None
        self.logger = logging.getLogger(__name__)

    def _take_screenshot(self, step_name: str):
        """Take a screenshot for debugging purposes."""
        try:
            if not self.headless and self.driver:
                timestamp = int(time.time())
                filename = f"debug_{step_name}_{timestamp}.png"
                self.driver.save_screenshot(filename)
                print(f"📸 Screenshot saved: {filename}")
        except Exception as e:
            print(f"⚠️ Failed to take screenshot: {e}")

    def authenticate(self) -> Optional[Dict[str, Any]]:
        """
        Perform authentication using Selenium WebDriver.

        Returns:
            Dict with authentication results including tokens if successful
        """
        if not SELENIUM_AVAILABLE:
            print("❌ Selenium not available. Install with: pip install selenium")
            return None

        print("🔐 Starting OKTA Selenium Authentication")
        print("=" * 50)

        try:
            # Step 1: Initialize browser
            print("📡 Step 1: Initializing browser...")
            if not self._initialize_browser():
                return None

            # Step 2: Navigate to OAuth2 authorization page
            print("📡 Step 2: Loading OAuth2 authorization page...")
            if not self._load_oauth_page():
                return None

            # Take screenshot of the OAuth2 page
            self._take_screenshot("oauth2_page_loaded")

            # Step 3: Wait for login form and submit credentials
            print("📡 Step 3: Submitting credentials...")
            if not self._submit_credentials():
                return None

            # Take screenshot after credential submission
            self._take_screenshot("credentials_submitted")

            # Step 4: Handle MFA if required
            print("📡 Step 4: Checking for MFA requirements...")
            mfa_result = self._handle_mfa_if_required()
            if mfa_result is False:  # MFA failed
                return None

            # Take screenshot after MFA handling
            self._take_screenshot("mfa_handled")

            # Step 5: Extract authentication results
            print("📡 Step 5: Extracting authentication results...")
            auth_result = self._extract_auth_results()

            # Take final screenshot
            self._take_screenshot("authentication_complete")

            print("🎉 Selenium authentication completed!")
            return auth_result

        except Exception as e:
            print(f"❌ Error in Selenium authentication: {e}")
            # Take screenshot on error
            self._take_screenshot("error_occurred")
            return None
        finally:
            self._cleanup()

    def _initialize_browser(self) -> bool:
        """Initialize the browser with appropriate options."""
        try:
            print("🌐 Initializing browser...")

            # Try Chrome first, then Firefox
            try:
                options = ChromeOptions()
                if self.headless:
                    options.add_argument("--headless")
                else:
                    # For debugging: make window visible and sized appropriately
                    options.add_argument("--start-maximized")
                    options.add_argument(
                        "--disable-blink-features=AutomationControlled"
                    )
                    options.add_experimental_option(
                        "excludeSwitches", ["enable-automation"]
                    )
                    options.add_experimental_option("useAutomationExtension", False)

                options.add_argument("--no-sandbox")
                options.add_argument("--disable-dev-shm-usage")
                options.add_argument("--disable-gpu")
                options.add_argument(
                    "--user-agent=Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
                )

                self.driver = webdriver.Chrome(options=options)

                # For debugging: remove automation indicators
                if not self.headless:
                    self.driver.execute_script(
                        "Object.defineProperty(navigator, 'webdriver', {get: () => undefined})"
                    )

                print("✅ Chrome browser initialized")
                return True

            except Exception as chrome_error:
                print(f"⚠️ Chrome failed: {chrome_error}")

                try:
                    options = FirefoxOptions()
                    if self.headless:
                        options.add_argument("--headless")
                    else:
                        # For debugging: make window visible and sized appropriately
                        options.add_argument("--width=1920")
                        options.add_argument("--height=1080")

                    self.driver = webdriver.Firefox(options=options)

                    if not self.headless:
                        # Maximize window for debugging
                        self.driver.maximize_window()

                    print("✅ Firefox browser initialized")
                    return True

                except Exception as firefox_error:
                    print(f"❌ Firefox failed: {firefox_error}")
                    print("❌ No browser drivers available")
                    return False

        except Exception as e:
            print(f"❌ Error initializing browser: {e}")
            return False

    def _load_oauth_page(self) -> bool:
        """Load the OAuth2 authorization page."""
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

            self.driver.get(url)

            # Wait for page to load
            WebDriverWait(self.driver, 10).until(
                EC.presence_of_element_located((By.TAG_NAME, "body"))
            )

            print(f"📥 Page loaded: {self.driver.title}")
            print(f"📄 Current URL: {self.driver.current_url}")

            return True

        except Exception as e:
            print(f"❌ Error loading OAuth2 page: {e}")
            return False

    def _submit_credentials(self) -> bool:
        """Submit username and password through the login form."""
        try:
            print("👤 Looking for login form...")
            
            # Wait for the login form to appear
            wait = WebDriverWait(self.driver, 15)
            
            # For debugging: add a pause to see the page
            if not self.headless:
                print("⏸️ Pausing for 3 seconds so you can see the page...")
                time.sleep(3)
            
            # Look for username field (try multiple selectors)
            username_selectors = [
                "input[name='username']",
                "input[name='identifier']",
                "input[name='email']",
                "input[type='email']",
                "input[placeholder*='email' i]",
                "input[placeholder*='username' i]",
                "input[id*='username' i]",
                "input[id*='email' i]",
                "input[id*='identifier' i]"
            ]
            
            username_field = None
            for selector in username_selectors:
                try:
                    username_field = wait.until(
                        EC.element_to_be_clickable((By.CSS_SELECTOR, selector))
                    )
                    print(f"✅ Found username field: {selector}")
                    break
                except TimeoutException:
                    continue
            
            if not username_field:
                print("❌ Username field not found")
                print("🔍 Available form elements:")
                try:
                    inputs = self.driver.find_elements(By.TAG_NAME, "input")
                    for i, inp in enumerate(inputs):
                        print(f"   Input {i+1}: type={inp.get_attribute('type')}, name={inp.get_attribute('name')}, id={inp.get_attribute('id')}, placeholder={inp.get_attribute('placeholder')}")
                except Exception as e:
                    print(f"   Error listing inputs: {e}")
                return False
            
            # For debugging: wait a bit more for password field to appear
            if not self.headless:
                print("⏸️ Waiting additional 2 seconds for password field to load...")
                time.sleep(2)
            
            # Look for password field with more comprehensive selectors
            password_selectors = [
                "input[name='password']",
                "input[name='passcode']",
                "input[type='password']",
                "input[id*='password' i]",
                "input[id*='passcode' i]",
                "input[placeholder*='password' i]",
                "input[placeholder*='passcode' i]",
                "input[placeholder*='pass' i]"
            ]
            
            password_field = None
            for selector in password_selectors:
                try:
                    # Try to find password field with shorter timeout
                    password_field = WebDriverWait(self.driver, 5).until(
                        EC.element_to_be_clickable((By.CSS_SELECTOR, selector))
                    )
                    print(f"✅ Found password field: {selector}")
                    break
                except TimeoutException:
                    continue
            
            if not password_field:
                print("❌ Password field not found")
                print("🔍 Available form elements after username field:")
                try:
                    inputs = self.driver.find_elements(By.TAG_NAME, "input")
                    for i, inp in enumerate(inputs):
                        print(f"   Input {i+1}: type={inp.get_attribute('type')}, name={inp.get_attribute('name')}, id={inp.get_attribute('id')}, placeholder={inp.get_attribute('placeholder')}")
                    
                    # Also look for any password-like elements
                    print("🔍 Looking for password-like elements...")
                    all_elements = self.driver.find_elements(By.XPATH, "//*[contains(text(), 'password') or contains(text(), 'Password') or contains(text(), 'passcode') or contains(text(), 'Passcode')]")
                    for elem in all_elements:
                        print(f"   Password-related element: {elem.tag_name} - {elem.text[:50]}...")
                        
                except Exception as e:
                    print(f"   Error listing elements: {e}")
                
                # Take screenshot for debugging
                self._take_screenshot("password_field_not_found")
                return False
            
            # Clear fields and enter credentials
            print("🔑 Entering credentials...")
            username_field.clear()
            username_field.send_keys(self.username)
            print(f"👤 Username entered: {self.username}")
            
            # For debugging: pause to see username entered
            if not self.headless:
                time.sleep(1)
            
            password_field.clear()
            password_field.send_keys(self.password)
            print("🔑 Password entered: ********")
            
            # For debugging: pause to see password entered
            if not self.headless:
                time.sleep(1)
            
            # Look for submit button with more comprehensive selectors
            submit_selectors = [
                "input[type='submit']",
                "button[type='submit']",
                "button:contains('Sign In')",
                "button:contains('Log In')",
                "button:contains('Submit')",
                "input[value*='Sign' i]",
                "input[value*='Log' i]",
                "input[value*='Submit' i]",
                "button[class*='submit' i]",
                "button[class*='signin' i]",
                "button[class*='login' i]",
                "input[class*='submit' i]",
                "input[class*='signin' i]",
                "input[class*='login' i]"
            ]
            
            submit_button = None
            for selector in submit_selectors:
                try:
                    submit_button = wait.until(
                        EC.element_to_be_clickable((By.CSS_SELECTOR, selector))
                    )
                    print(f"✅ Found submit button: {selector}")
                    break
                except TimeoutException:
                    continue
            
            if not submit_button:
                print("❌ Submit button not found")
                print("🔍 Available buttons:")
                try:
                    buttons = self.driver.find_elements(By.TAG_NAME, "button")
                    for i, btn in enumerate(buttons):
                        print(f"   Button {i+1}: text={btn.text}, type={btn.get_attribute('type')}, class={btn.get_attribute('class')}")
                    
                    # Also look for submit inputs
                    submit_inputs = self.driver.find_elements(By.CSS_SELECTOR, "input[type='submit']")
                    for i, inp in enumerate(submit_inputs):
                        print(f"   Submit Input {i+1}: value={inp.get_attribute('value')}, class={inp.get_attribute('class')}")
                        
                except Exception as e:
                    print(f"   Error listing buttons: {e}")
                
                # Take screenshot for debugging
                self._take_screenshot("submit_button_not_found")
                return False
            
            # Submit the form
            print("🚀 Submitting login form...")
            submit_button.click()
            
            # For debugging: longer wait to see the submission process
            if not self.headless:
                print("⏸️ Waiting 5 seconds to see submission process...")
                time.sleep(5)
            else:
                time.sleep(3)
            
            print(f"📄 After submission - URL: {self.driver.current_url}")
            print(f"📄 Page title: {self.driver.title}")
            
            return True

        except Exception as e:
            print(f"❌ Error submitting credentials: {e}")
            return False

    def _handle_mfa_if_required(self) -> Optional[bool]:
        """Handle MFA if it's required during authentication."""
        try:
            print("📱 Checking for MFA requirements...")

            # Look for MFA indicators
            mfa_indicators = [
                "text()='Enter code'",
                "text()='Verification code'",
                "text()='MFA'",
                "text()='Two-factor'",
                "text()='2FA'",
                "text()='Authenticator'",
                "text()='SMS'",
                "text()='Email'",
            ]

            mfa_required = False
            for indicator in mfa_indicators:
                try:
                    element = self.driver.find_element(
                        By.XPATH, f"//*[contains({indicator})]"
                    )
                    if element:
                        mfa_required = True
                        print(f"📱 MFA required: {indicator}")
                        break
                except NoSuchElementException:
                    continue

            if not mfa_required:
                print("✅ No MFA required")
                return True

            # For now, we'll just wait and see if the MFA step completes automatically
            # In a real implementation, you'd prompt the user for the MFA code
            print("📱 MFA detected - waiting for user input or automatic completion...")
            print("💡 Note: MFA codes must be entered manually in the browser")

            # Wait up to 60 seconds for MFA completion
            wait_time = 60
            print(f"⏰ Waiting up to {wait_time} seconds for MFA completion...")

            start_time = time.time()
            while time.time() - start_time < wait_time:
                current_url = self.driver.current_url
                if "callback" in current_url or "success" in current_url.lower():
                    print("✅ MFA appears to be completed")
                    return True

                time.sleep(2)

            print("⚠️ MFA timeout - authentication may have failed")
            return False

        except Exception as e:
            print(f"❌ Error handling MFA: {e}")
            return False

    def _extract_auth_results(self) -> Dict[str, Any]:
        """Extract authentication results from the browser."""
        try:
            print("🔍 Extracting authentication results...")

            current_url = self.driver.current_url
            page_title = self.driver.title
            page_source = self.driver.page_source

            print(f"📄 Current URL: {current_url}")
            print(f"📄 Page title: {page_title}")

            # Check for success indicators
            success_indicators = [
                "callback" in current_url,
                "success" in page_title.lower(),
                "welcome" in page_title.lower(),
                "dashboard" in page_title.lower(),
                "callback" in page_source.lower(),
                "access_token" in page_source.lower(),
                "authorization_code" in page_source.lower(),
            ]

            if any(success_indicators):
                print("✅ Authentication appears successful!")

                # Look for authorization code in URL
                if "code=" in current_url:
                    code_match = current_url.split("code=")[1].split("&")[0]
                    print(f"🔑 Found authorization code: {code_match[:20]}...")
                    return {
                        "success": True,
                        "authorization_code": code_match,
                        "url": current_url,
                        "title": page_title,
                    }

                # Look for tokens in page source
                if "access_token" in page_source:
                    print("🔑 Found access token in page source")
                    return {
                        "success": True,
                        "has_tokens": True,
                        "url": current_url,
                        "title": page_title,
                    }

                return {"success": True, "url": current_url, "title": page_title}
            else:
                print("⚠️ Authentication status unclear")
                return {
                    "success": False,
                    "url": current_url,
                    "title": page_title,
                    "page_source_length": len(page_source),
                }

        except Exception as e:
            print(f"❌ Error extracting auth results: {e}")
            return {"success": False, "error": str(e)}

    def _cleanup(self):
        """Clean up browser resources."""
        try:
            if self.driver:
                print("🧹 Cleaning up browser...")
                self.driver.quit()
                self.driver = None
        except Exception as e:
            print(f"⚠️ Error during cleanup: {e}")


def authenticate_with_selenium(
    username: str, password: str, headless: bool = True
) -> Optional[Dict[str, Any]]:
    """
    Authenticate using Selenium WebDriver.

    Args:
        username: Username/email for authentication
        password: Password for authentication
        headless: Whether to run browser in headless mode

    Returns:
        Authentication result dict if successful, None otherwise
    """
    auth = OktaSeleniumAuth(username, password, headless)
    return auth.authenticate()


if __name__ == "__main__":
    # Test the Selenium authentication
    import sys

    if len(sys.argv) < 3:
        print("Usage: python okta_selenium_auth.py <username> <password> [headless]")
        sys.exit(1)

    username = sys.argv[1]
    password = sys.argv[2]
    headless = len(sys.argv) < 4 or sys.argv[3].lower() != "false"

    print(f"🧪 Testing Selenium authentication for {username}")
    result = authenticate_with_selenium(username, password, headless)

    if result:
        print("🎉 Authentication successful!")
        print(f"Result: {result}")
    else:
        print("❌ Authentication failed")
