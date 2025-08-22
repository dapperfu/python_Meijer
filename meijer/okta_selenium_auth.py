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
            # Keep browser open for debugging - don't call _cleanup()
            # self._cleanup()  # Commented out to keep browser window open
            print("🔍 Browser window kept open for debugging")
            print("💡 Close the browser manually when done debugging")

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
        """Submit username and password through the two-step login form."""
        try:
            print("👤 Waiting for page to fully load...")

            # Wait for the page to be completely ready
            wait = WebDriverWait(self.driver, 15)
            
            # Wait for page to finish loading
            wait.until(lambda driver: driver.execute_script("return document.readyState") == "complete")
            print("✅ Page fully loaded")
            
            # Additional wait for OKTA JavaScript to initialize
            wait.until(lambda driver: driver.execute_script("""
                return (
                    document.querySelector('input[name="identifier"]') !== null &&
                    document.readyState === 'complete'
                );
            """))
            print("✅ OKTA form elements ready")

            # For debugging: add a pause to see the page
            if not self.headless:
                print("⏸️ Pausing for 1 second so you can see the page...")
                time.sleep(1)

            # STEP 1: Fill username field directly - no need to search
            print("📡 Step 1: Filling username field...")
            
            # Direct access to username field
            username_field = self.driver.find_element(By.CSS_SELECTOR, "input[name='identifier']")
            print("✅ Username field found and ready")

            # Fill username
            print("🔑 Entering username...")
            username_field.clear()
            username_field.send_keys(self.username)
            print(f"👤 Username entered: {self.username}")

            # For debugging: pause to see username entered
            if not self.headless:
                time.sleep(0.5)

            # STEP 2: Click Next button to go to password page
            print("📡 Step 2: Clicking Next button...")
            
            # Direct access to Next button - usually the first submit button or button with "Next" text
            try:
                # Try common Next button selectors
                next_button = self.driver.find_element(By.CSS_SELECTOR, "button:contains('Next')")
            except:
                try:
                    # Fallback to submit button
                    next_button = self.driver.find_element(By.CSS_SELECTOR, "input[type='submit'], button[type='submit']")
                except:
                    # Last resort: find any button that might be the Next button
                    buttons = self.driver.find_elements(By.TAG_NAME, "button")
                    next_button = None
                    for btn in buttons:
                        if btn.text.lower() in ['next', 'continue', 'submit']:
                            next_button = btn
                            break
                    
                    if not next_button:
                        print("❌ Next button not found")
                        return False
            
            print("✅ Next button found and ready")

            if not next_button:
                print("❌ Next/Submit button not found")
                print("🔍 Available buttons:")
                try:
                    buttons = self.driver.find_elements(By.TAG_NAME, "button")
                    for i, btn in enumerate(buttons):
                        print(
                            f"   Button {i+1}: text={btn.text}, type={btn.get_attribute('type')}, class={btn.get_attribute('class')}"
                        )

                    # Also look for submit inputs
                    submit_inputs = self.driver.find_elements(
                        By.CSS_SELECTOR, "input[type='submit']"
                    )
                    for i, inp in enumerate(submit_inputs):
                        print(
                            f"   Submit Input {i+1}: value={inp.get_attribute('value')}, class={inp.get_attribute('class')}"
                        )

                except Exception as e:
                    print(f"   Error listing buttons: {e}")

                # Take screenshot for debugging
                self._take_screenshot("next_button_not_found")
                return False

            # Click Next/Submit to go to password page
            print("🚀 Clicking Next/Submit to go to password page...")
            next_button.click()

            # For debugging: wait to see the transition
            if not self.headless:
                print("⏸️ Waiting 1 second to see transition to password page...")
                time.sleep(1)
            else:
                time.sleep(0.5)

            print(f"📄 After Next click - URL: {self.driver.current_url}")
            print(f"📄 Page title: {self.driver.title}")

            # Take screenshot of password page
            self._take_screenshot("password_page_loaded")

            # STEP 3: Fill password field on the second page
            print("📡 Step 3: Filling password field...")

            # Wait for password page to load and stabilize
            wait.until(lambda driver: driver.execute_script("""
                return (
                    document.querySelector('input[name="credentials.passcode"]') !== null &&
                    document.readyState === 'complete'
                );
            """))
            print("✅ Password field ready")

            # Direct access to password field using the correct selector
            try:
                password_field = self.driver.find_element(By.CSS_SELECTOR, "input[name='credentials.passcode']")
                print("✅ Password field found and ready")
            except Exception as e:
                print(f"❌ Password field not found: {e}")
                # Fallback to comprehensive search if needed
                password_selectors = [
                    "input[name='credentials.passcode']",  # Primary selector based on actual form
                    "input[name='passcode']",
                    "input[name='password']",
                    "input[type='password']",
                    "input[id*='password' i]",
                    "input[id*='passcode' i]",
                    "input[placeholder*='password' i]",
                    "input[placeholder*='passcode' i]",
                    "input[placeholder*='pass' i]",
                ]

                password_field = None
                for selector in password_selectors:
                    try:
                        password_field = WebDriverWait(self.driver, 5).until(
                            EC.element_to_be_clickable((By.CSS_SELECTOR, selector))
                        )
                        print(f"✅ Found password field with fallback: {selector}")
                        break
                    except TimeoutException:
                        continue
                
                if not password_field:
                    print("❌ Password field not found on second page")
                    print("🔍 Available form elements on second page:")
                    try:
                        inputs = self.driver.find_elements(By.TAG_NAME, "input")
                        for i, inp in enumerate(inputs):
                            print(
                                f"   Input {i+1}: type={inp.get_attribute('type')}, name={inp.get_attribute('name')}, id={inp.get_attribute('id')}, placeholder={inp.get_attribute('placeholder')}"
                            )

                        # Also look for any password-like elements
                        print("🔍 Looking for password-like elements...")
                        all_elements = self.driver.find_elements(
                            By.XPATH,
                            "//*[contains(text(), 'password') or contains(text(), 'Password') or contains(text(), 'passcode') or contains(text(), 'Passcode')]",
                        )
                        for elem in all_elements:
                            print(
                                f"   Password-related element: {elem.tag_name} - {elem.text[:50]}..."
                            )

                    except Exception as e:
                        print(f"   Error listing elements: {e}")

                    # Take screenshot for debugging
                    self._take_screenshot("password_field_not_found")
                    return False

            if not password_field:
                print("❌ Password field not found on second page")
                print("🔍 Available form elements on second page:")
                try:
                    inputs = self.driver.find_elements(By.TAG_NAME, "input")
                    for i, inp in enumerate(inputs):
                        print(
                            f"   Input {i+1}: type={inp.get_attribute('type')}, name={inp.get_attribute('name')}, id={inp.get_attribute('id')}, placeholder={inp.get_attribute('placeholder')}"
                        )

                    # Also look for any password-like elements
                    print("🔍 Looking for password-like elements...")
                    all_elements = self.driver.find_elements(
                        By.XPATH,
                        "//*[contains(text(), 'password') or contains(text(), 'Password') or contains(text(), 'passcode') or contains(text(), 'Passcode')]",
                    )
                    for elem in all_elements:
                        print(
                            f"   Password-related element: {elem.tag_name} - {elem.text[:50]}..."
                        )

                except Exception as e:
                    print(f"   Error listing elements: {e}")

                # Take screenshot for debugging
                self._take_screenshot("password_field_not_found")
                return False

            # Fill password
            print("🔑 Entering password...")
            password_field.clear()
            password_field.send_keys(self.password)
            print("🔑 Password entered: ********")

            # For debugging: pause to see password entered
            if not self.headless:
                time.sleep(0.5)

            # STEP 4: Click final Submit button
            print("📡 Step 4: Clicking final Submit button...")
            
            # Direct access to submit button - usually the submit button or button with "Sign In" text
            try:
                # Try common submit button selectors
                final_submit_button = self.driver.find_element(By.CSS_SELECTOR, "button:contains('Sign In'), button:contains('Log In'), button:contains('Submit')")
            except:
                try:
                    # Fallback to submit button
                    final_submit_button = self.driver.find_element(By.CSS_SELECTOR, "input[type='submit'], button[type='submit']")
                except:
                    # Last resort: find any button that might be the submit button
                    buttons = self.driver.find_elements(By.TAG_NAME, "button")
                    final_submit_button = None
                    for btn in buttons:
                        if btn.text.lower() in ['sign in', 'log in', 'submit', 'sign', 'login']:
                            final_submit_button = btn
                            break
                    
                    if not final_submit_button:
                        print("❌ Final Submit button not found")
                        print("🔍 Available buttons on password page:")
                        try:
                            buttons = self.driver.find_elements(By.TAG_NAME, "button")
                            for i, btn in enumerate(buttons):
                                print(
                                    f"   Button {i+1}: text={btn.text}, type={btn.get_attribute('type')}, class={btn.get_attribute('class')}"
                                )

                            # Also look for submit inputs
                            submit_inputs = self.driver.find_elements(
                                By.CSS_SELECTOR, "input[type='submit']"
                            )
                            for i, inp in enumerate(submit_inputs):
                                print(
                                    f"   Submit Input {i+1}: value={inp.get_attribute('value')}, class={inp.get_attribute('class')}"
                                )

                        except Exception as e:
                            print(f"   Error listing buttons: {e}")

                        # Take screenshot for debugging
                        self._take_screenshot("final_submit_button_not_found")
                        return False
            
            print("✅ Final Submit button found and ready")

            # Submit the final form
            print("🚀 Submitting final login form...")
            final_submit_button.click()

            # For debugging: longer wait to see the submission process
            if not self.headless:
                print("⏸️ Waiting 2 seconds to see submission process...")
                time.sleep(2)
            else:
                time.sleep(1)

            print(f"📄 After final submission - URL: {self.driver.current_url}")
            print(f"📄 Page title: {self.driver.title}")

            return True

        except Exception as e:
            print(f"❌ Error submitting credentials: {e}")
            return False

    def _handle_mfa_if_required(self) -> Optional[bool]:
        """Handle MFA if required during authentication."""
        try:
            print("📱 Checking for MFA requirements...")

            # Wait a bit for the page to load
            time.sleep(2)

            # Check if we're on an MFA page
            current_title = self.driver.title.lower()
            current_url = self.driver.current_url.lower()

            mfa_indicators = [
                "verify",
                "verification",
                "mfa",
                "2fa",
                "two-factor",
                "two factor",
                "authenticator",
                "code",
                "sms",
                "email",
                "phone",
                "security",
            ]

            is_mfa_page = any(
                indicator in current_title for indicator in mfa_indicators
            ) or any(indicator in current_url for indicator in mfa_indicators)

            if not is_mfa_page:
                print("✅ No MFA required - proceeding with authentication")
                return True

            print("🔐 MFA page detected - looking for verification options...")

            # Take screenshot of MFA page
            self._take_screenshot("mfa_page_detected")

            # First, try to find and click the email option
            print("📧 Looking for 'Send Mail' verification option...")
            email_selectors = [
                "//*[contains(text(), 'Send Mail')]",
                "//*[contains(text(), 'send mail')]",
                "//*[contains(text(), 'Send mail')]",
                "//*[contains(text(), 'Email') and contains(text(), 'Send')]",
                "//*[contains(text(), 'Email') and contains(text(), 'send')]",
                "//button[contains(text(), 'Send Mail')]",
                "//button[contains(text(), 'send mail')]",
                "//button[contains(text(), 'Send mail')]",
                "//input[contains(@value, 'Send Mail')]",
                "//input[contains(@value, 'send mail')]",
                "//input[contains(@value, 'Send mail')]",
                "//label[contains(text(), 'Send Mail')]",
                "//label[contains(text(), 'send mail')]",
                "//label[contains(text(), 'Send mail')]",
                "//div[contains(text(), 'Send Mail')]",
                "//div[contains(text(), 'send mail')]",
                "//div[contains(text(), 'Send mail')]",
                "//span[contains(text(), 'Send Mail')]",
                "//span[contains(text(), 'send mail')]",
                "//span[contains(text(), 'Send mail')]",
                "//*[contains(text(), 'Email')]",
                "//button[contains(text(), 'Email')]",
                "//input[contains(@value, 'Email')]",
                "//label[contains(text(), 'Email')]",
                "//div[contains(text(), 'Email')]",
                "//span[contains(text(), 'Email')]",
            ]

            email_option = None
            for xpath in email_selectors:
                try:
                    email_option = self.driver.find_element(By.XPATH, xpath)
                    print(f"✅ Found email option: {xpath}")
                    break
                except Exception:
                    continue

            if email_option:
                print("📧 'Send Mail' verification option found - clicking it...")
                try:
                    # Try to click the email option
                    email_option.click()
                    print("✅ 'Send Mail' option clicked successfully")

                    # Wait for the email verification page to load
                    if not self.headless:
                        print(
                            "⏸️ Waiting 1 second for email verification page to load..."
                        )
                        time.sleep(1)
                    else:
                        time.sleep(0.5)

                    # Take screenshot after selecting email
                    self._take_screenshot("send_mail_option_selected")

                    print(f"📄 Current URL: {self.driver.current_url}")
                    print(f"📄 Page title: {self.driver.title}")

                    # Check if we're on a confirmation page first
                    current_title = self.driver.title.lower()
                    if (
                        "get a verification email" in current_title
                        or "verification email" in current_title
                    ):
                        print(
                            "📧 On email confirmation page - looking for confirmation button..."
                        )

                        # Look for confirmation/continue/send button
                        confirm_selectors = [
                            "button[type='submit']",
                            "input[type='submit']",
                            "button:contains('Send')",
                            "button:contains('Continue')",
                            "button:contains('Confirm')",
                            "button:contains('Yes')",
                            "button:contains('Submit')",
                            "input[value*='Send' i]",
                            "input[value*='Continue' i]",
                            "input[value*='Confirm' i]",
                            "input[value*='Submit' i]",
                            "button[class*='confirm' i]",
                            "button[class*='send' i]",
                            "button[class*='continue' i]",
                            "button[class*='submit' i]",
                        ]

                        confirm_button = None
                        for selector in confirm_selectors:
                            try:
                                confirm_button = WebDriverWait(self.driver, 5).until(
                                    EC.element_to_be_clickable(
                                        (By.CSS_SELECTOR, selector)
                                    )
                                )
                                print(f"✅ Found confirmation button: {selector}")
                                break
                            except TimeoutException:
                                continue

                        if confirm_button:
                            print("🚀 Clicking confirmation button to send email...")
                            confirm_button.click()

                            # Wait for the actual verification code page to load
                            if not self.headless:
                                print(
                                    "⏸️ Waiting 3 seconds for verification code page to load..."
                                )
                                time.sleep(3)
                            else:
                                time.sleep(2)

                            # Take screenshot after confirmation
                            self._take_screenshot("email_confirmation_sent")

                            print(
                                f"📄 After confirmation - URL: {self.driver.current_url}"
                            )
                            print(f"📄 Page title: {self.driver.title}")

                            # Wait a bit more for the page to fully load and potentially show the code input field
                            if not self.headless:
                                print(
                                    "⏸️ Waiting additional 2 seconds for page to fully load..."
                                )
                                time.sleep(2)
                            else:
                                time.sleep(1)

                            # Take another screenshot to see the final state
                            self._take_screenshot("verification_code_page_loaded")

                            print(f"📄 Final page - URL: {self.driver.current_url}")
                            print(f"📄 Final page title: {self.driver.title}")
                        else:
                            print("❌ Confirmation button not found")
                            print("🔍 Available buttons on confirmation page:")
                            try:
                                buttons = self.driver.find_elements(
                                    By.TAG_NAME, "button"
                                )
                                for i, btn in enumerate(buttons):
                                    print(
                                        f"   Button {i+1}: text={btn.text}, type={btn.get_attribute('type')}, class={btn.get_attribute('class')}"
                                    )
                            except Exception as e:
                                print(f"   Error listing buttons: {e}")
                            return False

                    # Now look for the email code input field
                    print("📧 Looking for email code input field...")
                    code_input_selectors = [
                        "input[name='code']",
                        "input[name='verificationCode']",
                        "input[name='verification_code']",
                        "input[name='passcode']",
                        "input[name='answer']",
                        "input[placeholder*='code' i]",
                        "input[placeholder*='verification' i]",
                        "input[placeholder*='enter' i]",
                        "input[placeholder*='verification code' i]",
                        "input[placeholder*='verification code']",
                        "input[type='text']",
                        "input[id*='code' i]",
                        "input[id*='verification' i]",
                        "input[id*='passcode' i]",
                        "input[id*='answer' i]",
                    ]

                    code_input = None
                    for selector in code_input_selectors:
                        try:
                            code_input = WebDriverWait(self.driver, 8).until(
                                EC.element_to_be_clickable((By.CSS_SELECTOR, selector))
                            )
                            print(f"✅ Found code input field: {selector}")
                            break
                        except TimeoutException:
                            continue

                    if code_input:
                        print("📧 Email code input field found")
                        print(
                            "💡 For now, this is a manual step - please enter the email code in the browser"
                        )

                        if not self.headless:
                            print("⏸️ Waiting for manual email code entry...")
                            print(
                                "📱 Please check your email and enter the verification code in the browser"
                            )
                            print(
                                "⏸️ Press Enter in the terminal when the code is entered..."
                            )

                            # Take screenshot of code input page
                            self._take_screenshot("email_code_input_page")

                            # Wait for user input (this is just for debugging)
                            try:
                                input("Press Enter when email code is entered...")
                            except:
                                pass

                            print("✅ Continuing after email code entry...")
                            return True
                        else:
                            print(
                                "⚠️ Headless mode - cannot handle email code entry interactively"
                            )
                            return False

                    # If code input field not found, continue with improved logic
                    print("📧 Email code input field not found initially")
                    print("🔍 Available form elements on verification page:")
                    try:
                        inputs = self.driver.find_elements(By.TAG_NAME, "input")
                        for i, inp in enumerate(inputs):
                            print(
                                f"   Input {i+1}: type={inp.get_attribute('type')}, name={inp.get_attribute('name')}, id={inp.get_attribute('id')}, placeholder={inp.get_attribute('placeholder')}"
                            )

                        # Also look for any verification-related elements
                        print("🔍 Looking for verification-related elements...")
                        all_elements = self.driver.find_elements(
                            By.XPATH,
                            "//*[contains(text(), 'verification') or contains(text(), 'code') or contains(text(), 'enter') or contains(text(), 'verification code')]",
                        )
                        for elem in all_elements:
                            try:
                                text = elem.text.strip()
                                if text:
                                    print(
                                        f"   Verification element: {elem.tag_name} - {text[:100]}..."
                                    )
                            except:
                                continue

                    except Exception as e:
                        print(f"   Error listing elements: {e}")

                    # Check if we need to wait for the email to be sent first
                    current_title = self.driver.title.lower()
                    if (
                        "get a verification email" in current_title
                        or "verification email" in current_title
                    ):
                        print("📧 This appears to be a 'Get Verification Email' page")
                        print(
                            "💡 The email verification code input field may appear after the email is sent"
                        )
                        print(
                            "⏸️ Waiting for the page to update with the code input field..."
                        )

                        # Wait a bit longer for the page to potentially update
                        if not self.headless:
                            print("⏸️ Waiting 3 seconds for page to update...")
                            time.sleep(3)

                            # Take another screenshot to see if anything changed
                            self._take_screenshot("verification_page_after_wait")

                            # Try to find the code input field again
                            print("🔍 Trying to find code input field again...")
                            for selector in code_input_selectors:
                                try:
                                    code_input = WebDriverWait(self.driver, 3).until(
                                        EC.element_to_be_clickable(
                                            (By.CSS_SELECTOR, selector)
                                        )
                                    )
                                    print(
                                        f"✅ Found code input field after wait: {selector}"
                                    )
                                    break
                                except TimeoutException:
                                    continue

                            if code_input:
                                print("📧 Email code input field found after waiting")
                                print(
                                    "💡 For now, this is a manual step - please enter the email code in the browser"
                                )

                                print("⏸️ Waiting for manual email code entry...")
                                print(
                                    "📱 Please check your email and enter the verification code in the browser"
                                )
                                print(
                                    "⏸️ Press Enter in the terminal when the code is entered..."
                                )

                                # Take screenshot of code input page
                                self._take_screenshot("email_code_input_page_found")

                                # Wait for user input (this is just for debugging)
                                try:
                                    input("Press Enter when email code is entered...")
                                except:
                                    pass

                                print("✅ Continuing after email code entry...")
                                return True
                            else:
                                print(
                                    "❌ Code input field still not found after waiting"
                                )
                                return False
                        else:
                            print(
                                "⚠️ Headless mode - cannot wait for page updates interactively"
                            )
                            return False
                    else:
                        print("❌ Not a 'Get Verification Email' page - cannot proceed")
                        return False

                except Exception as e:
                    print(f"❌ Error clicking 'Send Mail' option: {e}")
                    return False
            else:
                print("❌ Email verification option not found")
                print("🔍 Available MFA options:")
                try:
                    # Look for any clickable elements that might be MFA options
                    clickable_elements = self.driver.find_elements(
                        By.XPATH,
                        "//button | //input[@type='submit'] | //a[contains(@class, 'button')]",
                    )
                    for i, elem in enumerate(clickable_elements):
                        try:
                            text = elem.text.strip()
                            if text:
                                print(f"   Option {i+1}: {elem.tag_name} - {text}")
                        except:
                            continue
                except Exception as e:
                    print(f"   Error listing options: {e}")

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
    
    def close_browser(self):
        """Manually close the browser when done debugging."""
        try:
            if self.driver:
                print("🔒 Closing browser...")
                self.driver.quit()
                self.driver = None
                print("✅ Browser closed")
            else:
                print("ℹ️ No browser to close")
        except Exception as e:
            print(f"❌ Error closing browser: {e}")
    
    def keep_browser_open(self):
        """Keep the browser open for debugging purposes."""
        print("🔍 Browser will remain open for debugging")
        print("💡 Use close_browser() method when done")
        return True


def authenticate_with_selenium(
    username: str, password: str, headless: bool = True, keep_open: bool = False
) -> Optional[Dict[str, Any]]:
    """
    Authenticate using Selenium WebDriver.

    Args:
        username: Username/email for authentication
        password: Password for authentication
        headless: Whether to run browser in headless mode
        keep_open: Whether to keep browser open for debugging

    Returns:
        Authentication result dict if successful, None otherwise
    """
    auth = OktaSeleniumAuth(username, password, headless)
    
    if keep_open:
        print("🔍 Browser will be kept open for debugging")
        print("💡 Use auth.close_browser() when done")
    
    result = auth.authenticate()
    
    if keep_open:
        print("🔍 Browser window remains open for debugging")
        print("💡 Use auth.close_browser() to close it when done")
    
    return result


def authenticate_with_selenium_and_keep_open(
    username: str, password: str, headless: bool = False
) -> Optional[Dict[str, Any]]:
    """
    Authenticate using Selenium WebDriver and keep browser open for debugging.

    Args:
        username: Username/email for authentication
        password: Password for authentication
        headless: Whether to run browser in headless mode (default: False for debugging)

    Returns:
        Authentication result dict if successful, None otherwise
    """
    return authenticate_with_selenium(username, password, headless, keep_open=True)


if __name__ == "__main__":
    # Test the Selenium authentication
    import sys

    if len(sys.argv) < 3:
        print("Usage: python okta_selenium_auth.py <username> <password> [headless] [keep_open]")
        print("  headless: true/false (default: true)")
        print("  keep_open: true/false (default: false)")
        sys.exit(1)

    username = sys.argv[1]
    password = sys.argv[2]
    headless = len(sys.argv) < 4 or sys.argv[3].lower() != "false"
    keep_open = len(sys.argv) >= 5 and sys.argv[4].lower() == "true"

    print(f"🧪 Testing Selenium authentication for {username}")
    print(f"🔍 Headless: {headless}, Keep open: {keep_open}")
    
    if keep_open:
        print("🔍 Using keep-open mode - browser will stay open for debugging")
        result = authenticate_with_selenium_and_keep_open(username, password, headless)
    else:
        result = authenticate_with_selenium(username, password, headless)

    if result:
        print("🎉 Authentication successful!")
        print(f"Result: {result}")
        
        if keep_open:
            print("\n🔍 Browser window is still open for debugging")
            print("💡 Close it manually when done")
    else:
        print("❌ Authentication failed")
