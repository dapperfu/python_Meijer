#!/usr/bin/env python3
"""
OKTA Selenium-based Authentication for Meijer API

This module uses Selenium WebDriver to perform authentication through an actual browser,
bypassing Akamai protection and handling the complete authentication flow.
"""

import imaplib
import logging
import re
import time
import secrets
import hashlib
import base64
import uuid
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

    def __init__(self, username: str, password: str, headless: bool = True, proxy_host: str = None, proxy_port: int = None):
        self.username = username
        self.password = password
        self.headless = headless
        self.proxy_host = proxy_host
        self.proxy_port = proxy_port
        self.base_url = "https://id.meijer.com"
        self.oauth_authorize_url = f"{self.base_url}/oauth2/default/v1/authorize"
        self.driver = None
        self.logger = logging.getLogger(__name__)
        
        # Store PKCE parameters
        self.code_verifier = None
        self.code_challenge = None

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

    def _capture_html_page(self, step_name: str):
        """Capture the current HTML page to /tmp/ for analysis."""
        try:
            if self.driver:
                timestamp = int(time.time())
                current_url = self.driver.current_url
                page_title = self.driver.title
                
                # Create a safe filename
                safe_title = "".join(c for c in page_title if c.isalnum() or c in (' ', '-', '_')).rstrip()
                safe_title = safe_title.replace(' ', '_')[:50]  # Limit length
                
                filename = f"/tmp/meijer_auth_{step_name}_{safe_title}_{timestamp}.html"
                
                # Get page source
                page_source = self.driver.page_source
                
                # Create HTML with metadata
                html_content = f"""<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>{page_title}</title>
    <meta name="capture_time" content="{timestamp}">
    <meta name="url" content="{current_url}">
    <meta name="step" content="{step_name}">
</head>
<body>
    <div style="background: #f0f0f0; padding: 10px; margin: 10px; border: 1px solid #ccc;">
        <h3>Page Capture Information</h3>
        <p><strong>Step:</strong> {step_name}</p>
        <p><strong>Timestamp:</strong> {timestamp}</p>
        <p><strong>URL:</strong> {current_url}</p>
        <p><strong>Title:</strong> {page_title}</p>
        <p><strong>Capture Time:</strong> {time.strftime('%Y-%m-%d %H:%M:%S', time.localtime(timestamp))}</p>
    </div>
    <hr>
    {page_source}
</body>
</html>"""
                
                # Write to file
                with open(filename, 'w', encoding='utf-8') as f:
                    f.write(html_content)
                
                print(f"📄 HTML page captured: {filename}")
                print(f"   URL: {current_url}")
                print(f"   Title: {page_title}")
                
                return filename
            else:
                print("⚠️ No driver available for HTML capture")
                return None
                
        except Exception as e:
            print(f"⚠️ Failed to capture HTML page: {e}")
            return None

    def _generate_code_challenge(self) -> str:
        """Generate PKCE code challenge."""
        if not self.code_verifier:
            self.code_verifier = secrets.token_urlsafe(32)
        if not self.code_challenge:
            self.code_challenge = base64.urlsafe_b64encode(
                hashlib.sha256(self.code_verifier.encode()).digest()
            ).decode().rstrip('=')
        return self.code_challenge

    def _generate_state(self) -> str:
        """Generate state parameter."""
        return uuid.uuid4().hex

    def _generate_nonce(self) -> str:
        """Generate nonce parameter."""
        return uuid.uuid4().hex

    def _check_for_rate_limiting(self) -> bool:
        """Check if the page shows rate limiting error."""
        try:
            # Look for the specific rate limiting error message
            rate_limit_texts = [
                "There was an unexpected internal error. Please try again.",
                "unexpected internal error",
                "rate limit",
                "too many requests",
                "try again later",
                "access denied",
                "forbidden",
                "403"
            ]
            
            # First check for the exact div structure
            try:
                rate_limit_div = self.driver.find_element(By.CSS_SELECTOR, 'div[class*="MuiBox-root"]')
                if rate_limit_div and "There was an unexpected internal error. Please try again." in rate_limit_div.text:
                    print("🚫 RATE LIMITING DETECTED!")
                    print("💡 Found exact error div: 'There was an unexpected internal error. Please try again.'")
                    print("⏰ This means you are being rate limited.")
                    print("💡 Please try logging in again in a few hours.")
                    return True
            except:
                pass
            
            # Check page title for rate limiting indicators
            page_title = self.driver.title.lower()
            if any(text in page_title for text in ["error", "denied", "forbidden", "rate limit"]):
                print("🚫 RATE LIMITING DETECTED!")
                print(f"💡 Page title indicates rate limiting: '{self.driver.title}'")
                print("⏰ This means you are being rate limited.")
                print("💡 Please try logging in again in a few hours.")
                
                # Capture the rate-limited page for analysis
                self._capture_html_page("rate_limited")
                print("📄 Rate-limited page HTML captured to /tmp/ for analysis")
                
                return True
            
            # Check URL for error indicators
            current_url = self.driver.current_url.lower()
            if any(text in current_url for text in ["error", "denied", "forbidden", "403"]):
                print("🚫 RATE LIMITING DETECTED!")
                print(f"💡 URL indicates rate limiting: '{self.driver.current_url}'")
                print("⏰ This means you are being rate limited.")
                print("💡 Please try logging in again in a few hours.")
                
                # Capture the rate-limited page for analysis
                self._capture_html_page("rate_limited_url")
                print("📄 Rate-limited page HTML captured to /tmp/ for analysis")
                
                return True
            
            # Fallback to text search in page source
            page_text = self.driver.page_source.lower()
            for text in rate_limit_texts:
                if text.lower() in page_text:
                    print("🚫 RATE LIMITING DETECTED!")
                    print(f"💡 Page content shows rate limiting indicator: '{text}'")
                    print("⏰ This means you are being rate limited.")
                    print("💡 Please try logging in again in a few hours.")
                    return True
            
            return False
            
        except Exception as e:
            print(f"⚠️ Error checking for rate limiting: {e}")
            return False

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

            # Take screenshot and capture HTML of the OAuth2 page
            self._take_screenshot("oauth2_page_loaded")
            self._capture_html_page("oauth2_page_loaded")
            
            # Check for rate limiting errors
            if self._check_for_rate_limiting():
                print("🚫 Authentication stopped due to rate limiting")
                print("📄 HTML page captured for analysis in /tmp/")
                return None
            
            # Check if the page is trying to navigate to introspect endpoint
            print("🔍 Checking for introspect endpoint navigation...")
            current_url = self.driver.current_url
            if "introspect" in current_url:
                print("⚠️ WARNING: Page navigated to introspect endpoint!")
                print(f"   Current URL: {current_url}")
                print("   This suggests the OAuth2 page is redirecting incorrectly")
                print("   Capturing the introspect page for analysis...")
                self._capture_html_page("introspect_redirect")
                
                # Try to go back to the OAuth2 page
                print("🔄 Attempting to return to OAuth2 page...")
                self.driver.back()
                time.sleep(2)
                
                # Check if we're back on the OAuth2 page
                if "introspect" not in self.driver.current_url:
                    print("✅ Successfully returned to OAuth2 page")
                else:
                    print("❌ Still on introspect page - this may indicate a flow issue")
                    return None
            
            # Start navigation monitoring to catch any introspect redirects
            print("🔍 Starting navigation monitoring...")
            self.monitor_navigation(timeout=10)  # Monitor for 10 seconds

            # Step 3: Wait for login form and submit credentials
            print("📡 Step 3: Submitting credentials...")
            if not self._submit_credentials():
                return None

            # Take screenshot and capture HTML after credential submission
            self._take_screenshot("credentials_submitted")
            self._capture_html_page("credentials_submitted")
            
            # Check for rate limiting errors after credential submission
            if self._check_for_rate_limiting():
                print("🚫 Authentication stopped due to rate limiting after login")
                print("📄 HTML page captured for analysis in /tmp/")
                return None

            # Step 4: Handle email verification if required
            print("📡 Step 4: Checking for email verification...")
            if "verification" in self.driver.title.lower() or "verify" in self.driver.title.lower():
                print("📧 Email verification detected - handling verification flow...")
                if not self._handle_email_verification():
                    return None
            else:
                # Step 4b: Handle MFA if required
                print("📡 Step 4b: Checking for MFA requirements...")
                mfa_result = self._handle_mfa_if_required()
                if mfa_result is False:  # MFA failed
                    return None

            # Take screenshot and capture HTML after MFA handling
            self._take_screenshot("mfa_handled")
            self._capture_html_page("mfa_handled")

            # Step 5: Extract authentication results
            print("📡 Step 5: Extracting authentication results...")
            auth_result = self._extract_auth_results()

            # Take final screenshot and capture HTML
            self._take_screenshot("authentication_complete")
            self._capture_html_page("authentication_complete")

            print("🎉 Selenium authentication completed!")
            return auth_result

        except Exception as e:
            print(f"❌ Error in Selenium authentication: {e}")
            # Take screenshot and capture HTML on error
            self._take_screenshot("error_occurred")
            self._capture_html_page("error_occurred")
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

                # Add proxy configuration if specified
                if self.proxy_host and self.proxy_port:
                    proxy_string = f"{self.proxy_host}:{self.proxy_port}"
                    print(f"🌐 Configuring proxy: {proxy_string}")
                    options.add_argument(f"--proxy-server={proxy_string}")
                    
                    # Additional proxy-related options for better compatibility
                    options.add_argument("--ignore-certificate-errors")  # Handle mitmproxy cert issues
                    options.add_argument("--ignore-ssl-errors")
                    options.add_argument("--allow-running-insecure-content")
                    print("✅ Proxy configuration added")

                options.add_argument("--no-sandbox")
                options.add_argument("--disable-dev-shm-usage")
                options.add_argument("--disable-gpu")
                # Use DuckDuckGo mobile Android user agent from successful flow
                options.add_argument(
                    "--user-agent=Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36"
                )
                
                # Comprehensive mobile device emulation
                options.add_argument("--window-size=375,812")  # iPhone X dimensions
                options.add_argument("--viewport-size=375,812")
                
                # Mobile-specific options
                options.add_argument("--touch-events=enabled")
                options.add_argument("--enable-touch-drag-drop")
                options.add_argument("--disable-features=VizDisplayCompositor")
                
                # Additional options to appear more human-like
                options.add_argument("--disable-blink-features=AutomationControlled")
                options.add_experimental_option("excludeSwitches", ["enable-automation"])
                options.add_experimental_option("useAutomationExtension", False)
                
                # Mobile device emulation
                mobile_emulation = {
                    "deviceMetrics": {
                        "width": 375,
                        "height": 812,
                        "pixelRatio": 3.0
                    },
                    "userAgent": "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36"
                }
                options.add_experimental_option("mobileEmulation", mobile_emulation)

                # Try to use Chromium specifically
                try:
                    # First try Chromium
                    options.binary_location = "/usr/bin/chromium-browser"
                    self.driver = webdriver.Chrome(options=options)
                    print("✅ Chromium browser initialized")
                except Exception as chromium_error:
                    print(f"⚠️ Chromium failed: {chromium_error}")
                    # Fallback to regular Chrome
                    options.binary_location = None
                    self.driver = webdriver.Chrome(options=options)
                    print("✅ Chrome browser initialized (fallback)")

                # For debugging: remove automation indicators and add DuckDuckGo headers
                if not self.headless:
                    self.driver.execute_script(
                        "Object.defineProperty(navigator, 'webdriver', {get: () => undefined})"
                    )
                
                # Comprehensive mobile device spoofing
                self.driver.execute_script("""
                    // Remove automation indicators
                    Object.defineProperty(navigator, 'webdriver', {get: () => undefined});
                    Object.defineProperty(navigator, 'plugins', {get: () => [1, 2, 3, 4, 5]});
                    Object.defineProperty(navigator, 'languages', {get: () => ['en-US', 'en']});
                    
                    // Mobile device properties
                    Object.defineProperty(navigator, 'maxTouchPoints', {get: () => 5});
                    Object.defineProperty(navigator, 'hardwareConcurrency', {get: () => 8});
                    Object.defineProperty(navigator, 'deviceMemory', {get: () => 4});
                    
                    // Screen properties for mobile
                    Object.defineProperty(screen, 'width', {get: () => 375});
                    Object.defineProperty(screen, 'height', {get: () => 812});
                    Object.defineProperty(screen, 'availWidth', {get: () => 375});
                    Object.defineProperty(screen, 'availHeight', {get: () => 812});
                    Object.defineProperty(screen, 'colorDepth', {get: () => 24});
                    Object.defineProperty(screen, 'pixelDepth', {get: () => 24});
                    
                    // Viewport properties
                    Object.defineProperty(window, 'innerWidth', {get: () => 375});
                    Object.defineProperty(window, 'innerHeight', {get: () => 812});
                    Object.defineProperty(window, 'outerWidth', {get: () => 375});
                    Object.defineProperty(window, 'outerHeight', {get: () => 812});
                    
                    // Touch events
                    window.ontouchstart = null;
                    window.ontouchmove = null;
                    window.ontouchend = null;
                    
                    // Add DuckDuckGo mobile app headers to avoid bot detection
                    const originalOpen = XMLHttpRequest.prototype.open;
                    XMLHttpRequest.prototype.open = function() {
                        const result = originalOpen.apply(this, arguments);
                        this.setRequestHeader('X-Requested-With', 'com.duckduckgo.mobile.android');
                        this.setRequestHeader('Accept', 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9');
                        this.setRequestHeader('Accept-Language', 'en-US,en;q=0.9');
                        this.setRequestHeader('Accept-Encoding', 'gzip, deflate, br');
                        this.setRequestHeader('DNT', '1');
                        this.setRequestHeader('Connection', 'keep-alive');
                        this.setRequestHeader('Upgrade-Insecure-Requests', '1');
                        return result;
                    };
                    
                    // Override fetch to add DuckDuckGo headers
                    const originalFetch = window.fetch;
                    window.fetch = function(url, options = {}) {
                        if (!options.headers) options.headers = {};
                        options.headers['X-Requested-With'] = 'com.duckduckgo.mobile.android';
                        options.headers['Accept'] = 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9';
                        options.headers['Accept-Language'] = 'en-US,en;q=0.9';
                        options.headers['Accept-Encoding'] = 'gzip, deflate, br';
                        options.headers['DNT'] = '1';
                        options.headers['Connection'] = 'keep-alive';
                        options.headers['Upgrade-Insecure-Requests'] = '1';
                        return originalFetch(url, options);
                    };
                    
                    // Add mobile-specific properties
                    window.chrome = {
                        runtime: {},
                        loadTimes: function() { return {}; },
                        csi: function() { return {}; }
                    };
                    
                    // Override permissions API
                    if (navigator.permissions) {
                        navigator.permissions.query = function() {
                            return Promise.resolve({state: 'granted'});
                        };
                    }
                """)
                print("✅ Comprehensive mobile device spoofing configured")

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

                    # Add proxy configuration for Firefox if specified
                    if self.proxy_host and self.proxy_port:
                        proxy_string = f"{self.proxy_host}:{self.proxy_port}"
                        print(f"🌐 Configuring Firefox proxy: {proxy_string}")
                        
                        # Firefox proxy configuration
                        options.set_preference("network.proxy.type", 1)  # Manual proxy
                        options.set_preference("network.proxy.http", self.proxy_host)
                        options.set_preference("network.proxy.http_port", self.proxy_port)
                        options.set_preference("network.proxy.ssl", self.proxy_host)
                        options.set_preference("network.proxy.ssl_port", self.proxy_port)
                        options.set_preference("network.proxy.share_proxy_settings", True)
                        
                        # Handle mitmproxy certificate issues
                        options.set_preference("security.cert_verification.enabled", False)
                        options.set_preference("security.enterprise_roots.enabled", True)
                        print("✅ Firefox proxy configuration added")

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
            # Build the OAuth2 URL with working parameters from exact_login_replication.py
            params = {
                "login_hint": "",
                "code_challenge": self._generate_code_challenge(),
                "code_challenge_method": "S256",
                "client_id": "0oa1o8g9njWsUvwsx697",  # Working client_id
                "scope": "openid profile offline_access",  # Working scope
                "redirect_uri": "com.meijer.mobile.meijer:/login",  # Working redirect_uri
                "response_type": "code",
                "state": self._generate_state(),
                "nonce": self._generate_nonce()
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

            # Add small human-like delay to avoid appearing robotic
            print("⏸️ Adding 3 second human-like delay...")
            time.sleep(3)
            
            # Skip session warming - it's causing bot detection issues
            print("⏭️ Skipping session warming to avoid bot detection")

            return True

        except Exception as e:
            print(f"❌ Error loading OAuth2 page: {e}")
            return False

    # Session warming method removed - it was causing bot detection issues

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
            
            # Wait for form to be ready for interaction
            if not self._wait_for_form_ready(["input[name='identifier']", "button[data-se='save']"], timeout=15):
                print("❌ Form not ready for interaction")
                return False
            
            # Direct access to username field
            username_field = self.driver.find_element(By.CSS_SELECTOR, "input[name='identifier']")
            print("✅ Username field found and ready")
            
            # Debug: show field details
            print("🔍 Username field details:")
            print(f"   ID: {username_field.get_attribute('id')}")
            print(f"   Name: {username_field.get_attribute('name')}")
            print(f"   Type: {username_field.get_attribute('type')}")
            print(f"   Class: {username_field.get_attribute('class')}")
            print(f"   Value before: '{username_field.get_attribute('value')}'")

            # Fill username
            print("🔑 Entering username...")
            username_field.clear()
            print(f"   Field cleared, current value: '{username_field.get_attribute('value')}'")
            username_field.send_keys(self.username)
            print(f"   Field after send_keys, current value: '{username_field.get_attribute('value')}'")
            print(f"👤 Username entered: {self.username}")

            # Minimal delay to avoid triggering rate limiting
            print("⏳ Adding minimal delay to avoid rate limiting...")
            time.sleep(1)  # Reduced from 10+ seconds to just 1 second

            # For debugging: pause to see username entered
            if not self.headless:
                time.sleep(0.5)

            # STEP 2: Click Next button to go to password page
            print("📡 Step 2: Clicking Next button...")
            
            # Use the exact button selector from the user's form
            try:
                # Primary selector: button with data-se="save" and text "Next"
                next_button = self.driver.find_element(By.CSS_SELECTOR, "button[data-se='save']")
                print("✅ Next button found using data-se='save' selector")
            except:
                try:
                    # Fallback: button with type="submit" and text "Next"
                    next_button = self.driver.find_element(By.CSS_SELECTOR, "button[type='submit']")
                    print("✅ Next button found using type='submit' selector")
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

            # Wait for password page to load by checking for password field presence
            print("⏳ Waiting for password page to load...")
            try:
                wait.until(EC.presence_of_element_located((By.CSS_SELECTOR, "input[name='credentials.passcode']")))
                print("✅ Password page loaded - password field detected")
            except TimeoutException:
                print("⚠️ Password field not found, checking page state...")
                # Fallback: check if page title changed
                if "password" in self.driver.title.lower() or "passcode" in self.driver.title.lower():
                    print("✅ Password page detected by title")
                else:
                    print("❌ Password page not detected")
                    return False

            print(f"📄 After Next click - URL: {self.driver.current_url}")
            print(f"📄 Page title: {self.driver.title}")

            # Take screenshot of password page
            self._take_screenshot("password_page_loaded")

            # STEP 3: Fill password field on the second page
            print("📡 Step 3: Filling password field...")

            # Wait for password form to be ready
            if not self._wait_for_form_ready(["input[name='credentials.passcode']", "button[type='submit']"], timeout=15):
                print("❌ Password form not ready for interaction")
                return False

            # Direct access to password field - we know exactly what it is
            password_field = self.driver.find_element(By.CSS_SELECTOR, "input[name='credentials.passcode']")
            print("✅ Password field found and ready")

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

            # STEP 5: Handle 2FA selection page
            print("📡 Step 5: Looking for 2FA selection page...")
            
            # Wait for the 2FA selection page to load
            wait.until(lambda driver: driver.execute_script("""
                return (
                    document.querySelector('button[data-se="authenticator-button"]') !== null &&
                    document.readyState === 'complete'
                );
            """))
            print("✅ 2FA selection page loaded")

            # Find and click the "Send Email" button
            email_button = self.driver.find_element(By.CSS_SELECTOR, 'button[data-se="authenticator-button"]')
            print("✅ Found 'Send Email' button")
            
            # Verify it's the right button by checking the text
            if "Send Email" in email_button.text:
                print("✅ Confirmed correct button - clicking 'Send Email'...")
                email_button.click()
                
                # Wait for the email confirmation page to load
                print("📡 Step 6: Waiting for email confirmation page...")
                try:
                    wait.until(EC.presence_of_element_located((By.CSS_SELECTOR, 'button[data-se="save"]')))
                    print("✅ Email confirmation page loaded - button detected")
                except TimeoutException:
                    print("⚠️ Email confirmation button not found, checking page state...")
                    # Fallback: check if page title indicates confirmation page
                    if "confirm" in self.driver.title.lower() or "email" in self.driver.title.lower():
                        print("✅ Email confirmation page detected by title")
                    else:
                        print("❌ Email confirmation page not detected")
                        return False
                
                print(f"📄 After Send Email click - URL: {self.driver.current_url}")
                print(f"📄 Page title: {self.driver.title}")
                
                # Take screenshot of email confirmation page
                self._take_screenshot("email_confirmation_page")
                
                # Now handle the email confirmation page
                print("📡 Step 7: Handling email confirmation page...")
                return self._handle_email_confirmation_page()
            else:
                print(f"❌ Unexpected button text: {email_button.text}")
                return False

        except Exception as e:
            print(f"❌ Error submitting credentials: {e}")
            return False

    def _handle_email_verification(self) -> bool:
        """Handle the email verification flow after clicking 'Send Me an Email'."""
        try:
            print("📧 Handling email verification flow...")
            
            # Wait for the verification page to stabilize
            wait = WebDriverWait(self.driver, 15)
            wait.until(lambda driver: driver.execute_script("return document.readyState === 'complete'"))
            
            print(f"📄 Email verification page - URL: {self.driver.current_url}")
            print(f"📄 Page title: {self.driver.title}")
            
            # Look for verification code input field
            print("🔍 Looking for verification code input field...")
            
            # Wait for verification code field to appear
            wait.until(lambda driver: driver.execute_script("""
                return (
                    document.querySelector('input[type="text"], input[placeholder*="code"], input[placeholder*="Code"], input[name*="code"], input[id*="code"]') !== null &&
                    document.readyState === 'complete'
                );
            """))
            print("✅ Verification code field ready")
            
            # Find the verification code input field
            code_field = self.driver.find_element(By.CSS_SELECTOR, 'input[type="text"], input[placeholder*="code"], input[placeholder*="Code"], input[name*="code"], input[id*="code"]')
            print("✅ Verification code field found")
            
            # Take screenshot of verification page
            self._take_screenshot("verification_code_page")
            
            print("📧 Email verification page loaded successfully")
            print("💡 Now polling email for verification code...")
            
            # Poll email for verification code using simple interface
            from .email_verification import get_code
            verification_code = get_code(timeout=300)
            if verification_code:
                print(f"✅ Verification code found: {verification_code}")
                
                # Enter the verification code
                print("🔑 Entering verification code...")
                code_field.clear()
                code_field.send_keys(verification_code)
                print("✅ Verification code entered")
                
                # Look for and click the submit/verify button
                print("📡 Looking for submit/verify button...")
                
                # Try multiple selectors for the submit button
                submit_button = None
                submit_selectors = [
                    'button[type="submit"]',
                    'button:contains("Verify")',
                    'button:contains("Submit")',
                    'button:contains("Continue")',
                    'button:contains("Sign In")',
                    'button:contains("Log In")',
                    'input[type="submit"]',
                    'button[data-se="verify"]',
                    'button[data-se="submit"]'
                ]
                
                for selector in submit_selectors:
                    try:
                        submit_button = self.driver.find_element(By.CSS_SELECTOR, selector)
                        print(f"✅ Submit button found with selector: {selector}")
                        break
                    except:
                        continue
                
                if not submit_button:
                    # Fallback: find any button that looks like a submit button
                    buttons = self.driver.find_elements(By.TAG_NAME, "button")
                    for btn in buttons:
                        btn_text = btn.text.lower()
                        if any(word in btn_text for word in ['verify', 'submit', 'continue', 'sign in', 'log in']):
                            submit_button = btn
                            print(f"✅ Found submit button with text: {btn.text}")
                            break
                
                if submit_button:
                    print("✅ Submit button found - clicking to complete verification...")
                    submit_button.click()
                    
                    # Wait for verification to complete and page to load
                    print("⏳ Waiting for verification to complete...")
                    time.sleep(5)  # Give more time for the page to process
                    
                    # Wait for page to stabilize
                    try:
                        WebDriverWait(self.driver, 15).until(
                            lambda driver: driver.execute_script("return document.readyState === 'complete'")
                        )
                    except:
                        print("⚠️ Page ready state check timed out, continuing anyway...")
                    
                    print(f"📄 After verification - URL: {self.driver.current_url}")
                    print(f"📄 Page title: {self.driver.title}")
                    
                    # Take screenshot of completion
                    self._take_screenshot("verification_completed")
                    
                    return True
                else:
                    print("❌ Submit button not found after verification code entry")
                    print("🔍 Available buttons on verification page:")
                    try:
                        buttons = self.driver.find_elements(By.TAG_NAME, "button")
                        for i, btn in enumerate(buttons):
                            print(f"   Button {i+1}: text='{btn.text}', type={btn.get_attribute('type')}, class={btn.get_attribute('class')}")
                    except Exception as e:
                        print(f"   Error listing buttons: {e}")
                    
                    # Take screenshot for debugging
                    self._take_screenshot("submit_button_not_found")
                    return False
                
                # Wait for verification to complete
                print("⏳ Waiting for verification to complete...")
                time.sleep(3)
                
                print(f"📄 After verification - URL: {self.driver.current_url}")
                print(f"📄 Page title: {self.driver.title}")
                
                # Take screenshot of completion
                self._take_screenshot("verification_completed")
                
                return True
            else:
                print("❌ No verification code found in email after timeout")
                return False
            
        except Exception as e:
            print(f"❌ Error handling email verification: {e}")
            return False

    def _handle_email_confirmation_page(self) -> bool:
        """Handle the email confirmation page after clicking 'Send Email'."""
        try:
            print("📧 Handling email confirmation page...")
            
            # Wait for the confirmation page to stabilize
            wait = WebDriverWait(self.driver, 15)
            wait.until(lambda driver: driver.execute_script("return document.readyState === 'complete'"))
            
            print(f"📄 Email confirmation page - URL: {self.driver.current_url}")
            print(f"📄 Page title: {self.driver.title}")
            
            # Look for the "Send Me an Email" button
            print("🔍 Looking for 'Send Me an Email' button...")
            
            # Wait for the button to appear
            wait.until(lambda driver: driver.execute_script("""
                return (
                    document.querySelector('button[data-se="save"]') !== null &&
                    document.readyState === 'complete'
                );
            """))
            print("✅ Email confirmation button ready")
            
            # Find and click the "Send Me an Email" button
            confirm_button = self.driver.find_element(By.CSS_SELECTOR, 'button[data-se="save"]')
            print("✅ Found 'Send Me an Email' button")
            
            # Verify it's the right button by checking the text
            if "Send Me an Email" in confirm_button.text:
                print("✅ Confirmed correct button - clicking 'Send Me an Email'...")
                confirm_button.click()
                
                # Wait for the email verification page to load
                print("📡 Step 8: Waiting for email verification page...")
                try:
                    wait.until(EC.presence_of_element_located((By.CSS_SELECTOR, 'input[type="text"], input[placeholder*="code"], input[name*="code"]')))
                    print("✅ Email verification page loaded - code input field detected")
                except TimeoutException:
                    print("⚠️ Email verification code field not found, checking page state...")
                    # Fallback: check if page title indicates verification page
                    if "verification" in self.driver.title.lower() or "verify" in self.driver.title.lower():
                        print("✅ Email verification page detected by title")
                    else:
                        print("❌ Email verification page not detected")
                        return False
                
                print(f"📄 After confirmation click - URL: {self.driver.current_url}")
                print(f"📄 Page title: {self.driver.title}")
                
                # Take screenshot of email verification page
                self._take_screenshot("email_verification_page")
                
                print("📧 Email verification initiated - waiting for email...")
                return True
            else:
                print(f"❌ Unexpected button text: {confirm_button.text}")
                return False
            
        except Exception as e:
            print(f"❌ Error handling email confirmation page: {e}")
            return False

    def _poll_email_for_code(self) -> Optional[str]:
        """Poll email for verification code with 5 minute timeout."""
        try:
            print("📧 Polling email for verification code...")
            
            # Read email configuration
            email_config = self._read_email_config()
            if not email_config:
                print("❌ Failed to read email configuration")
                return None
            
            print(f"📧 Connecting to IMAP server: {email_config['server']}:{email_config['port']}")
            
            # Connect to IMAP server
            if email_config['use_ssl']:
                mail = imaplib.IMAP4_SSL(email_config['server'], email_config['port'])
            else:
                mail = imaplib.IMAP4(email_config['server'], email_config['port'])
            
            # Login
            mail.login(email_config['username'], email_config['password'])
            print("✅ Connected to email server")
            
            # Select inbox
            mail.select('INBOX')
            
            # Poll for verification code with 5 minute timeout
            max_wait_time = 300  # 5 minutes
            check_interval = 10   # Check every 10 seconds
            elapsed_time = 0
            
            print(f"⏳ Polling email for verification code (timeout: {max_wait_time}s)...")
            
            while elapsed_time < max_wait_time:
                print(f"   Checking email... (elapsed: {elapsed_time}s)")
                
                # Search for recent emails from Meijer
                _, message_numbers = mail.search(None, '(FROM "meijer" SUBJECT "verification" SINCE "1 hour ago")')
                
                if message_numbers[0]:
                    # Get the most recent email
                    latest_email_num = message_numbers[0].split()[-1]
                    _, msg_data = mail.fetch(latest_email_num, '(RFC822)')
                    email_body = msg_data[0][1].decode('utf-8', errors='ignore')
                    
                    # Extract verification code using regex - look for "Code: *XXXXXX*" pattern
                    code_patterns = [
                        r'Code:\s*\*?(\d{6})\*?',  # "Code: *123456*" or "Code: 123456"
                        r'code[:\s]*(\d{6})',       # "code 123456"
                        r'verification code[:\s]*(\d{6})',  # "verification code 123456"
                    ]
                    
                    verification_code = None
                    for pattern in code_patterns:
                        code_match = re.search(pattern, email_body, re.IGNORECASE)
                        if code_match:
                            verification_code = code_match.group(1)
                            break
                    
                    if verification_code:
                        print(f"✅ Found verification code: {verification_code}")
                        mail.close()
                        mail.logout()
                        return verification_code
                
                # Wait before next check
                time.sleep(check_interval)
                elapsed_time += check_interval
            
            print("❌ Timeout waiting for verification code")
            mail.close()
            mail.logout()
            return None
            
        except Exception as e:
            print(f"❌ Error polling email: {e}")
            return None

    def _extract_tokens_from_page(self) -> Optional[Dict[str, str]]:
        """Extract tokens from the current page source."""
        try:
            print("🔍 Attempting to extract tokens from page...")
            
            # Try to extract tokens from JavaScript variables
            tokens = {}
            
            # Check for common token patterns in JavaScript
            js_patterns = [
                r'access_token["\']?\s*[:=]\s*["\']([^"\']+)["\']',
                r'refresh_token["\']?\s*[:=]\s*["\']([^"\']+)["\']',
                r'id_token["\']?\s*[:=]\s*["\']([^"\']+)["\']',
                r'token["\']?\s*[:=]\s*["\']([^"\']+)["\']',
            ]
            
            page_source = self.driver.page_source
            for pattern in js_patterns:
                matches = re.findall(pattern, page_source, re.IGNORECASE)
                if matches:
                    if 'access_token' in pattern:
                        tokens['access_token'] = matches[0]
                    elif 'refresh_token' in pattern:
                        tokens['refresh_token'] = matches[0]
                    elif 'id_token' in pattern:
                        tokens['id_token'] = matches[0]
                    elif 'token' in pattern:
                        tokens['token'] = matches[0]
            
            # Also try to execute JavaScript to get tokens from localStorage/sessionStorage
            try:
                local_storage_tokens = self.driver.execute_script("""
                    return {
                        access_token: localStorage.getItem('access_token') || localStorage.getItem('token'),
                        refresh_token: localStorage.getItem('refresh_token'),
                        id_token: localStorage.getItem('id_token')
                    }
                """)
                
                for key, value in local_storage_tokens.items():
                    if value and key not in tokens:
                        tokens[key] = value
                
                session_storage_tokens = self.driver.execute_script("""
                    return {
                        access_token: sessionStorage.getItem('access_token') || sessionStorage.getItem('token'),
                        refresh_token: sessionStorage.getItem('refresh_token'),
                        id_token: sessionStorage.getItem('id_token')
                    }
                """)
                
                for key, value in session_storage_tokens.items():
                    if value and key not in tokens:
                        tokens[key] = value
                        
            except Exception as e:
                print(f"⚠️ Could not extract from storage: {e}")
            
            if tokens:
                print(f"✅ Extracted tokens: {list(tokens.keys())}")
                return tokens
            else:
                print("⚠️ No tokens found in page")
                return None
                
        except Exception as e:
            print(f"❌ Error extracting tokens from page: {e}")
            return None

    def _extract_tokens_from_storage(self) -> Optional[Dict[str, str]]:
        """Extract tokens from browser storage (cookies, localStorage, sessionStorage)."""
        try:
            print("🔍 Attempting to extract tokens from browser storage...")
            
            tokens = {}
            
            # Try to get tokens from cookies
            try:
                cookies = self.driver.get_cookies()
                for cookie in cookies:
                    if 'token' in cookie['name'].lower() or 'auth' in cookie['name'].lower():
                        tokens[f"cookie_{cookie['name']}"] = cookie['value']
            except Exception as e:
                print(f"⚠️ Could not extract cookies: {e}")
            
            # Try localStorage and sessionStorage
            try:
                local_storage = self.driver.execute_script("""
                    return {
                        access_token: localStorage.getItem('access_token') || localStorage.getItem('token'),
                        refresh_token: localStorage.getItem('refresh_token'),
                        id_token: localStorage.getItem('id_token'),
                        meijer_token: localStorage.getItem('meijer_token'),
                        auth_token: localStorage.getItem('auth_token')
                    }
                """)
                
                for key, value in local_storage.items():
                    if value and key not in tokens:
                        tokens[key] = value
                        
                session_storage = self.driver.execute_script("""
                    return {
                        access_token: sessionStorage.getItem('access_token') || sessionStorage.getItem('token'),
                        refresh_token: sessionStorage.getItem('refresh_token'),
                        id_token: sessionStorage.getItem('id_token'),
                        meijer_token: sessionStorage.getItem('meijer_token'),
                        auth_token: sessionStorage.getItem('auth_token')
                    }
                """)
                
                for key, value in session_storage.items():
                    if value and key not in tokens:
                        tokens[key] = value
                        
            except Exception as e:
                print(f"⚠️ Could not extract from storage: {e}")
            
            if tokens:
                print(f"✅ Extracted tokens from storage: {list(tokens.keys())}")
                return tokens
            else:
                print("⚠️ No tokens found in storage")
                return None
                
        except Exception as e:
            print(f"❌ Error extracting tokens from storage: {e}")
            return None

    def _save_tokens_to_auth_json(self, tokens: Dict[str, str], auth_code: str = None, state: str = None) -> bool:
        """Save extracted tokens to auth.json file."""
        try:
            import os
            import json
            
            print("💾 Saving tokens to auth.json...")
            
            # Get the Meijer config directory
            config_dir = os.path.expanduser("~/.config/meijer")
            os.makedirs(config_dir, exist_ok=True)
            
            auth_file = os.path.join(config_dir, "auth.json")
            
            # Prepare the auth data
            auth_data = {
                "timestamp": int(time.time()),
                "username": self.username,
                "tokens": tokens,
                "source": "selenium_2fa",
                "browser_url": self.driver.current_url if self.driver else None
            }
            
            if auth_code:
                auth_data["authorization_code"] = auth_code
            if state:
                auth_data["state"] = state
            
            # Save to file
            with open(auth_file, 'w') as f:
                json.dump(auth_data, f, indent=2)
            
            print(f"✅ Tokens saved to: {auth_file}")
            return True
            
        except Exception as e:
            print(f"❌ Error saving tokens to auth.json: {e}")
            return False

    def _read_email_config(self) -> Optional[Dict[str, str]]:
        """Read email configuration from ~/.config/meijer/email.txt."""
        try:
            import os
            email_config_path = os.path.expanduser("~/.config/meijer/email.txt")
            
            if not os.path.exists(email_config_path):
                print(f"❌ Email config file not found: {email_config_path}")
                return None
            
            config = {}
            with open(email_config_path, 'r') as f:
                lines = f.readlines()
                
            # Parse configuration (simple key=value format)
            for line in lines:
                line = line.strip()
                if line and not line.startswith('#') and '=' in line:
                    key, value = line.split('=', 1)
                    config[key.strip()] = value.strip()
            
            # Validate required fields
            required_fields = ['server', 'port', 'username', 'password']
            for field in required_fields:
                if field not in config:
                    print(f"❌ Missing required email config field: {field}")
                    return None
            
            # Convert port to int
            try:
                config['port'] = int(config['port'])
            except ValueError:
                print(f"❌ Invalid port number: {config['port']}")
                return None
            
            # Set SSL flag
            config['use_ssl'] = config.get('use_ssl', 'true').lower() == 'true'
            
            print(f"✅ Email configuration loaded: {config['username']}@{config['server']}:{config['port']}")
            return config
            
        except Exception as e:
            print(f"❌ Error reading email config: {e}")
            return None

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
                "meijer.com" in current_url,  # Redirected to Meijer site
                "signin" in current_url,      # Sign-in callback
            ]

            if any(success_indicators):
                print("✅ Authentication appears successful!")

                # Look for authorization code in URL
                if "code=" in current_url:
                    code_match = current_url.split("code=")[1].split("&")[0]
                    print(f"🔑 Found authorization code: {code_match[:20]}...")
                    
                    # Extract state parameter if present
                    state_param = None
                    if "state=" in current_url:
                        state_match = current_url.split("state=")[1].split("&")[0]
                        state_param = state_match
                        print(f"🔑 Found state parameter: {state_match[:20]}...")
                    
                    # Try to extract tokens from the page or cookies
                    tokens = self._extract_tokens_from_page()
                    
                    result = {
                        "success": True,
                        "authorization_code": code_match,
                        "state": state_param,
                        "url": current_url,
                        "title": page_title,
                        "tokens": tokens
                    }
                    
                    # Save tokens to auth.json if we have them
                    if tokens:
                        self._save_tokens_to_auth_json(tokens, code_match, state_param)
                    
                    return result

                # Look for tokens in page source
                if "access_token" in page_source:
                    print("🔑 Found access token in page source")
                    tokens = self._extract_tokens_from_page()
                    
                    result = {
                        "success": True,
                        "has_tokens": True,
                        "tokens": tokens,
                        "url": current_url,
                        "title": page_title,
                    }
                    
                    # Save tokens to auth.json if we have them
                    if tokens:
                        self._save_tokens_to_auth_json(tokens)
                    
                    return result

                # Check if we're on a successful page but need to extract tokens differently
                if "meijer.com" in current_url or "signin" in current_url:
                    print("🔍 On Meijer site - attempting to extract tokens from cookies/localStorage")
                    tokens = self._extract_tokens_from_storage()
                    
                    result = {
                        "success": True,
                        "url": current_url,
                        "title": page_title,
                        "tokens": tokens
                    }
                    
                    # Save tokens to auth.json if we have them
                    if tokens:
                        self._save_tokens_to_auth_json(tokens)
                    
                    return result

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
                # NEVER close browser when debugging - let human close it
                if hasattr(self, '_keep_open') and self._keep_open:
                    print("🔍 Keeping browser open for debugging - not calling driver.quit()")
                    print("🔒 Browser will remain open until you manually close it")
                    return  # Exit without doing anything
                else:
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

    def capture_current_page(self, step_name: str = None):
        """Capture the current page HTML to /tmp/ for analysis."""
        if not step_name:
            step_name = f"manual_capture_{int(time.time())}"
        
        filename = self._capture_html_page(step_name)
        if filename:
            print(f"📄 Current page HTML captured: {filename}")
            print(f"   URL: {self.driver.current_url}")
            print(f"   Title: {self.driver.title}")
        return filename

    def monitor_navigation(self, timeout: int = 30):
        """Monitor browser navigation and capture any unexpected redirects."""
        print("🔍 Starting navigation monitoring...")
        start_time = time.time()
        last_url = self.driver.current_url
        
        while time.time() - start_time < timeout:
            current_url = self.driver.current_url
            
            # Check for unexpected navigation to introspect endpoint
            if current_url != last_url:
                print(f"🔄 Navigation detected: {last_url} -> {current_url}")
                
                if "introspect" in current_url:
                    print("⚠️ WARNING: Navigation to introspect endpoint detected!")
                    print("   This endpoint expects POST requests, not GET")
                    print("   Capturing the page for analysis...")
                    self._capture_html_page("introspect_navigation")
                    
                    # Check if this is a GET request (which will fail)
                    if "method" not in current_url.lower():
                        print("💡 This appears to be a GET request - will likely fail")
                        print("   The introspect endpoint requires POST with stateToken")
                    
                    # Try to prevent further navigation
                    print("🔄 Attempting to return to previous page...")
                    self.driver.back()
                    time.sleep(2)
                    
                    if "introspect" not in self.driver.current_url:
                        print("✅ Successfully returned from introspect endpoint")
                    else:
                        print("❌ Still on introspect endpoint - flow may be broken")
                        return False
                
                last_url = current_url
            
            time.sleep(1)
        
        print("✅ Navigation monitoring completed")
        return True

    def __del__(self):
        """Destructor - only close browser if not keeping it open for debugging."""
        try:
            if hasattr(self, '_keep_open') and self._keep_open and self.driver:
                print("🔍 Destructor called but keeping browser open for debugging")
                print("💡 Close the browser manually when done")
            elif hasattr(self, 'driver') and self.driver:
                print("🧹 Destructor closing browser...")
                self.driver.quit()
        except Exception:
            # Ignore errors during cleanup
            pass

    def _wait_for_page_load(self, expected_elements: list, timeout: int = 15, page_description: str = "page") -> bool:
        """
        Wait for page to load by checking multiple indicators.
        
        Args:
            expected_elements: List of CSS selectors to wait for
            timeout: Maximum time to wait in seconds
            page_description: Description of the page for logging
            
        Returns:
            True if page loaded successfully, False otherwise
        """
        print(f"⏳ Waiting for {page_description} to load...")
        
        try:
            # Wait for page ready state
            WebDriverWait(self.driver, timeout).until(
                lambda driver: driver.execute_script("return document.readyState") == "complete"
            )
            print(f"✅ {page_description} - DOM ready state complete")
            
            # Wait for expected elements to appear
            for selector in expected_elements:
                try:
                    WebDriverWait(self.driver, timeout).until(
                        EC.presence_of_element_located((By.CSS_SELECTOR, selector))
                    )
                    print(f"✅ {page_description} - Expected element found: {selector}")
                except TimeoutException:
                    print(f"⚠️ {page_description} - Expected element not found: {selector}")
                    continue
            
            # Check if at least one expected element was found
            found_elements = []
            for selector in expected_elements:
                try:
                    if self.driver.find_element(By.CSS_SELECTOR, selector):
                        found_elements.append(selector)
                except:
                    continue
            
            if found_elements:
                print(f"✅ {page_description} loaded successfully with {len(found_elements)} expected elements")
                return True
            else:
                print(f"❌ {page_description} - No expected elements found")
                return False
                
        except TimeoutException:
            print(f"❌ {page_description} - Page load timeout after {timeout} seconds")
            return False
        except Exception as e:
            print(f"❌ {page_description} - Error during page load detection: {e}")
            return False

    def _wait_for_page_transition(self, old_url: str, old_title: str, timeout: int = 10) -> bool:
        """
        Wait for page to transition to a new state.
        
        Args:
            old_url: Previous URL to detect change
            old_title: Previous title to detect change
            timeout: Maximum time to wait in seconds
            
        Returns:
            True if page transitioned, False otherwise
        """
        print("⏳ Waiting for page transition...")
        
        start_time = time.time()
        while time.time() - start_time < timeout:
            current_url = self.driver.current_url
            current_title = self.driver.title
            
            if current_url != old_url or current_title != old_title:
                print("✅ Page transition detected:")
                print(f"   URL: {old_url} → {current_url}")
                print(f"   Title: {old_title} → {current_title}")
                return True
            
            time.sleep(0.5)  # Check every 500ms
        
        print("❌ Page transition timeout - no change detected")
        return False

    def _wait_for_form_ready(self, form_selectors: list, timeout: int = 15) -> bool:
        """
        Wait for form to be ready for interaction.
        
        Args:
            form_selectors: List of CSS selectors for form elements
            timeout: Maximum time to wait in seconds
            
        Returns:
            True if form is ready, False otherwise
        """
        print("⏳ Waiting for form to be ready for interaction...")
        
        try:
            # Wait for page ready state
            WebDriverWait(self.driver, timeout).until(
                lambda driver: driver.execute_script("return document.readyState") == "complete"
            )
            
            # Wait for form elements to be present and enabled
            for selector in form_selectors:
                try:
                    element = WebDriverWait(self.driver, timeout).until(
                        EC.element_to_be_clickable((By.CSS_SELECTOR, selector))
                    )
                    print(f"✅ Form element ready: {selector}")
                except TimeoutException:
                    print(f"⚠️ Form element not ready: {selector}")
                    continue
            
            # Check if at least one form element is ready
            ready_elements = []
            for selector in form_selectors:
                try:
                    element = self.driver.find_element(By.CSS_SELECTOR, selector)
                    if element.is_enabled() and element.is_displayed():
                        ready_elements.append(selector)
                except:
                    continue
            
            if ready_elements:
                print(f"✅ Form ready with {len(ready_elements)} interactive elements")
                return True
            else:
                print("❌ Form not ready - no interactive elements found")
                return False
                
        except TimeoutException:
            print(f"❌ Form ready timeout after {timeout} seconds")
            return False
        except Exception as e:
            print(f"❌ Error during form ready detection: {e}")
            return False

    def _wait_for_ajax_complete(self, timeout: int = 10) -> bool:
        """
        Wait for AJAX requests to complete.
        
        Args:
            timeout: Maximum time to wait in seconds
            
        Returns:
            True if AJAX is complete, False otherwise
        """
        print("⏳ Waiting for AJAX requests to complete...")
        
        try:
            # Wait for jQuery AJAX to complete (if jQuery is present)
            WebDriverWait(self.driver, timeout).until(
                lambda driver: driver.execute_script("return typeof jQuery === 'undefined' || jQuery.active === 0")
            )
            
            # Wait for AngularJS to complete (if Angular is present)
            WebDriverWait(self.driver, timeout).until(
                lambda driver: driver.execute_script("return typeof angular === 'undefined' || angular.element(document).injector().get('$http').pendingRequests.length === 0")
            )
            
            # Wait for React to complete (if React is present)
            WebDriverWait(self.driver, timeout).until(
                lambda driver: driver.execute_script("return typeof React === 'undefined' || true")  # React doesn't have a built-in way to check pending requests
            )
            
            print("✅ AJAX requests completed")
            return True
            
        except TimeoutException:
            print("⚠️ AJAX completion timeout - continuing anyway")
            return True  # Don't fail on AJAX timeout
        except Exception as e:
            print(f"⚠️ Error checking AJAX status: {e}")
            return True  # Don't fail on AJAX check errors


def authenticate_with_selenium(
    username: str, password: str, headless: bool = True, keep_open: bool = False, 
    proxy_host: str = None, proxy_port: int = None
) -> Optional[Dict[str, Any]]:
    """
    Authenticate using Selenium WebDriver.

    Args:
        username: Username/email for authentication
        password: Password for authentication
        headless: Whether to run browser in headless mode
        keep_open: Whether to keep browser open for debugging
        proxy_host: Proxy host (e.g., "127.0.0.1" for mitmproxy)
        proxy_port: Proxy port (e.g., 8080 for mitmproxy)

    Returns:
        Authentication result dict if successful, None otherwise
    """
    auth = OktaSeleniumAuth(username, password, headless, proxy_host, proxy_port)
    
    if keep_open:
        print("🔍 Browser will be kept open for debugging")
        print("💡 Use auth.close_browser() when done")
        auth._keep_open = True  # Set flag to prevent cleanup from closing browser
    
    result = auth.authenticate()
    
    if keep_open:
        print("🔍 Browser window remains open for debugging")
        print("💡 Use auth.close_browser() to close it when done")
        print("📄 Use auth.capture_current_page('step_name') to capture HTML to /tmp/")
        
        # Keep the process running indefinitely
        print("🔒 Process will remain active until you manually close the browser")
        print("💡 The authentication process is complete - you can inspect the browser")
        print("⏸️ Waiting for you to close the browser...")
        while True:
            time.sleep(1)  # Keep alive until user closes browser
    
    return result


def authenticate_with_selenium_and_keep_open(
    username: str, password: str, headless: bool = False, proxy_host: str = None, proxy_port: int = None
) -> Optional[Dict[str, Any]]:
    """
    Authenticate using Selenium WebDriver and keep browser open for debugging.

    Args:
        username: Username/email for authentication
        password: Password for authentication
        headless: Whether to run browser in headless mode (default: False for debugging)
        proxy_host: Proxy host (e.g., "127.0.0.1" for mitmproxy)
        proxy_port: Proxy port (e.g., 8080 for mitmproxy)

    Returns:
        Authentication result dict if successful, None otherwise
    """
    return authenticate_with_selenium(username, password, headless, keep_open=True, proxy_host=proxy_host, proxy_port=proxy_port)


if __name__ == "__main__":
    # Test the Selenium authentication
    import sys

    if len(sys.argv) < 3:
        print("Usage: python okta_selenium_auth.py <username> <password> [headless] [keep_open] [proxy_host] [proxy_port]")
        print("  headless: true/false (default: true)")
        print("  keep_open: true/false (default: false)")
        print("  proxy_host: proxy host (default: none)")
        print("  proxy_port: proxy port (default: none)")
        sys.exit(1)

    username = sys.argv[1]
    password = sys.argv[2]
    headless = len(sys.argv) < 4 or sys.argv[3].lower() != "false"
    keep_open = len(sys.argv) >= 5 and sys.argv[4].lower() == "true"
    proxy_host = sys.argv[5] if len(sys.argv) > 5 else None
    proxy_port = int(sys.argv[6]) if len(sys.argv) > 6 else None

    print(f"🧪 Testing Selenium authentication for {username}")
    print(f"🔍 Headless: {headless}, Keep open: {keep_open}")
    if proxy_host and proxy_port:
        print(f"�� Proxy: {proxy_host}:{proxy_port}")
    
    if keep_open:
        print("🔍 Using keep-open mode - browser will stay open for debugging")
        result = authenticate_with_selenium_and_keep_open(username, password, headless, proxy_host, proxy_port)
    else:
        result = authenticate_with_selenium(username, password, headless, proxy_host=proxy_host, proxy_port=proxy_port)

    if result:
        print("🎉 Authentication successful!")
        print(f"Result: {result}")
        
        if keep_open:
            print("\n🔍 Browser window is still open for debugging")
            print("💡 Close it manually when done")
    else:
        print("❌ Authentication failed")
