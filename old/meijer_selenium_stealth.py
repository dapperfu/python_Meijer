#!/usr/bin/env python3
"""
Enhanced Meijer Selenium Authentication with Stealth Measures
Based on detailed mitmproxy log analysis to address the 403 Forbidden error.
"""

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.firefox.options import Options
from selenium.webdriver.firefox.service import Service
from webdriver_manager.firefox import GeckoDriverManager
from selenium.common.exceptions import TimeoutException, NoSuchElementException
from selenium.webdriver.common.action_chains import ActionChains
import time
import random
import logging
import requests
from typing import Optional, Tuple, List, Dict
from urllib.parse import urlparse, parse_qs
import re
import json

from meijer_comprehensive import MeijerComprehensiveClient, read_auth_file

class MeijerSeleniumStealthAuth:
    def __init__(self, username: str, password: str, headless: bool = False):
        """Initialize the enhanced Selenium authentication client with stealth measures."""
        self.username = username
        self.password = password
        self.headless = headless
        self.driver = None
        
        # Setup logging
        logging.basicConfig(level=logging.INFO)
        self.logger = logging.getLogger(__name__)
        
        # Critical headers and cookies from working flow analysis
        self.critical_cookies = {
            "DT": "DI1OFou47yTRzKlaqWNbgT_Sg",
            "AMCVS_A8643BC75245AF510A490D4D%40AdobeOrg": "1",
            "digitalID": "",
            "s_tp": "8227",
            "s_ppv": "Meijer%2520Credit%2520Cards%2520%257C%2520Meijer%2C10%2C10%2C841",
            "s_cc": "true",
            "AKA_A2": "A",
            "ln": "meijer.com@eabi.xyz"
        }
        
        # Initialize the driver
        self.driver = self._setup_driver()
    
    def _setup_driver(self) -> webdriver.Firefox:
        """Setup Firefox WebDriver with advanced stealth measures and mobile spoofing."""
        try:
            # Firefox options
            firefox_options = Options()
            
            if self.headless:
                firefox_options.add_argument("--headless")
            
            # Note: Proxy configuration removed as it was being detected by CDN
            # For debugging, you can manually configure mitmproxy if needed
            # firefox_options.set_preference("network.proxy.type", 1)
            # firefox_options.set_preference("network.proxy.http", "127.0.0.1")
            # firefox_options.set_preference("network.proxy.http_port", 8080)
            
            # CRITICAL: Use the exact working User-Agent from the successful mobile app flow
            working_user_agent = "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36"
            firefox_options.set_preference("general.useragent.override", working_user_agent)
            
            # Mobile viewport to match the mobile user agent
            firefox_options.add_argument("--width=360")
            firefox_options.add_argument("--height=640")
            
            # Advanced stealth options
            firefox_options.add_argument("--no-sandbox")
            firefox_options.add_argument("--disable-dev-shm-usage")
            firefox_options.add_argument("--disable-blink-features=AutomationControlled")
            firefox_options.add_argument("--disable-extensions")
            firefox_options.add_argument("--disable-plugins")
            firefox_options.add_argument("--disable-images")  # Faster loading
            firefox_options.add_argument("--disable-web-security")
            firefox_options.add_argument("--allow-running-insecure-content")
            firefox_options.add_argument("--disable-features=VizDisplayCompositor")
            
            # Mimic mobile network conditions
            firefox_options.set_preference("network.http.accept-encoding", "gzip, deflate")  # Match working flow
            firefox_options.set_preference("intl.accept_languages", "en-US,en;q=0.9")  # Match working flow
            
            # Use webdriver-manager to automatically download and manage geckodriver
            geckodriver_path = GeckoDriverManager().install()
            service = Service(geckodriver_path)
            
            # Create driver
            self.driver = webdriver.Firefox(service=service, options=firefox_options)
            self.driver.implicitly_wait(10)
            
            # Set mobile viewport after driver creation
            self.driver.set_window_size(360, 640)
            
            # Execute advanced stealth JavaScript to hide automation indicators
            # and inject critical headers that can't be set via Firefox preferences
            stealth_script = """
            try {
                // Remove webdriver property
                if (navigator.webdriver !== undefined) {
                    try {
                        Object.defineProperty(navigator, 'webdriver', {
                            get: () => undefined,
                        });
                    } catch (e) {
                        console.log('webdriver property is non-configurable');
                    }
                }
                
                // Remove automation flags
                try {
                    delete window.cdc_adoQpoasnfa76pfcZLmcfl_Array;
                    delete window.cdc_adoQpoasnfa76pfcZLmcfl_Promise;
                    delete window.cdc_adoQpoasnfa76pfcZLmcfl_Symbol;
                } catch (e) {}
                
                // Override XMLHttpRequest to inject critical headers
                const originalXHR = window.XMLHttpRequest;
                window.XMLHttpRequest = function() {
                    const xhr = new originalXHR();
                    const originalOpen = xhr.open;
                    const originalSend = xhr.send;
                    
                    xhr.open = function(method, url, ...args) {
                        this._url = url;
                        this._method = method;
                        return originalOpen.apply(this, [method, url, ...args]);
                    };
                    
                    xhr.send = function(data) {
                        // Inject the critical missing header for OAuth identify requests
                        if (this._url && this._url.includes('/idp/idx/identify')) {
                            this.setRequestHeader('x-requested-with', 'com.duckduckgo.mobile.android');
                            console.log('Injected x-requested-with header for identify request');
                        }
                        return originalSend.apply(this, arguments);
                    };
                    
                    return xhr;
                };
                
                // Override fetch API as well
                const originalFetch = window.fetch;
                window.fetch = function(url, options = {}) {
                    if (typeof url === 'string' && url.includes('/idp/idx/identify')) {
                        options.headers = options.headers || {};
                        options.headers['x-requested-with'] = 'com.duckduckgo.mobile.android';
                        console.log('Injected x-requested-with header for identify request via fetch');
                    }
                    return originalFetch.call(this, url, options);
                };
                
                // Override permissions and properties to look like mobile
                try {
                    Object.defineProperty(navigator, 'platform', {
                        get: () => 'Linux armv7l',
                        configurable: true
                    });
                    
                    Object.defineProperty(navigator, 'languages', {
                        get: () => ['en-US', 'en'],
                        configurable: true
                    });
                    
                    Object.defineProperty(navigator, 'maxTouchPoints', {
                        get: () => 5,
                        configurable: true
                    });
                    
                    Object.defineProperty(screen, 'width', {
                        get: () => 360,
                        configurable: true
                    });
                    
                    Object.defineProperty(screen, 'height', {
                        get: () => 640,
                        configurable: true
                    });
                } catch (e) {
                    console.log('Could not override navigator properties:', e);
                }
                
                console.log('Advanced stealth measures applied');
                
            } catch (e) {
                console.error('Stealth script failed:', e);
            }
            """
            self.driver.execute_script(stealth_script)
            
            self.logger.info(f"✅ Firefox WebDriver initialized with advanced stealth measures")
            self.logger.info(f"📱 Using Mobile User-Agent: {working_user_agent}")
            self.logger.info("🚫 Proxy disabled to avoid CDN detection")
            self.logger.info("🥷 Advanced stealth measures and header injection enabled")
            
            return self.driver
            
        except Exception as e:
            self.logger.error(f"❌ Failed to setup Firefox WebDriver: {e}")
            raise
    
    def _inject_critical_cookies(self):
        """Inject critical cookies from the working flow to avoid bot detection."""
        try:
            self.logger.info("🍪 Injecting critical cookies from working flow...")
            
            # First navigate to the domain to set cookies
            self.driver.get("https://id.meijer.com/")
            time.sleep(2)
            
            # Inject critical cookies one by one
            for name, value in self.critical_cookies.items():
                try:
                    self.driver.add_cookie({
                        'name': name,
                        'value': value,
                        'domain': '.meijer.com',
                        'path': '/',
                        'secure': True
                    })
                    self.logger.info(f"   ✅ Set cookie: {name}")
                except Exception as e:
                    self.logger.warning(f"   ⚠️  Could not set cookie {name}: {e}")
            
            # Generate realistic bot management cookies
            import secrets
            timestamp = int(time.time())
            
            # Realistic JSESSIONID
            jsession_id = secrets.token_hex(16).upper()
            self.driver.add_cookie({
                'name': 'JSESSIONID',
                'value': jsession_id,
                'domain': '.meijer.com',
                'path': '/'
            })
            
            # Realistic bot management cookies based on working patterns
            ak_bmsc_value = f"FA3D3043351E0646DA829C70946EA910~000000000000000000000000000000~YAAQlxwhFz+6TbOYAQAAmAxZ{secrets.token_hex(8)}"
            self.driver.add_cookie({
                'name': 'ak_bmsc',
                'value': ak_bmsc_value,
                'domain': '.meijer.com',
                'path': '/'
            })
            
            self.logger.info("✅ Critical cookies injected successfully")
            
        except Exception as e:
            self.logger.warning(f"⚠️  Could not inject all cookies: {e}")
    
    def _wait_for_element(self, by: By, value: str, timeout: int = 30):
        """Wait for an element to be present and clickable."""
        try:
            return WebDriverWait(self.driver, timeout).until(
                EC.presence_of_element_located((by, value))
            )
        except TimeoutException:
            self.logger.error(f"❌ Timeout waiting for element: {value}")
            raise
    
    def _find_element_safe(self, by: By, value: str, timeout: int = 5):
        """Find an element safely without raising an exception on failure."""
        try:
            return WebDriverWait(self.driver, timeout).until(
                EC.presence_of_element_located((by, value))
            )
        except (TimeoutException, NoSuchElementException):
            return None
    
    def _extract_auth_code(self) -> Optional[str]:
        """Extracts the authorization code from the current URL."""
        current_url = self.driver.current_url
        parsed_url = urlparse(current_url)
        query_params = parse_qs(parsed_url.query)
        
        if 'code' in query_params:
            return query_params['code'][0]
        return None
    
    def authenticate(self, auth_url: str) -> Optional[str]:
        """
        Automates the Meijer OAuth authentication process using enhanced Selenium with stealth measures.
        
        Args:
            auth_url: The initial authorization URL to navigate to.
        
        Returns:
            The authorization code if successful, None otherwise.
        """
        try:
            self.logger.info(f"🚀 Starting Enhanced Selenium OAuth authentication")
            
            # Inject critical cookies first
            self._inject_critical_cookies()
            
            self.logger.info(f"🌐 Opening: {auth_url}")
            self.driver.get(auth_url)
            
            # Wait for page to load
            time.sleep(3)
            
            # Re-inject the stealth script after page load to ensure headers are intercepted
            reinject_script = """
            // Re-ensure XMLHttpRequest interception is active
            if (!window._meijerStealthInjected) {
                const originalXHR = window.XMLHttpRequest;
                window.XMLHttpRequest = function() {
                    const xhr = new originalXHR();
                    const originalOpen = xhr.open;
                    const originalSend = xhr.send;
                    
                    xhr.open = function(method, url, ...args) {
                        this._url = url;
                        this._method = method;
                        return originalOpen.apply(this, [method, url, ...args]);
                    };
                    
                    xhr.send = function(data) {
                        if (this._url && this._url.includes('/idp/idx/identify')) {
                            this.setRequestHeader('x-requested-with', 'com.duckduckgo.mobile.android');
                            console.log('✅ Injected x-requested-with header for identify request');
                        }
                        return originalSend.apply(this, arguments);
                    };
                    
                    return xhr;
                };
                window._meijerStealthInjected = true;
                console.log('🥷 Stealth header injection re-activated');
            }
            """
            self.driver.execute_script(reinject_script)
            
            # Look for email field with mobile-optimized selectors
            email_field = None
            email_selectors = [
                "input[data-se='identifier']",      # Specific selector from user
                "input#identifier",                  # ID selector
                "input[name='identifier']",         # Name selector
                "input[autocomplete='username']",   # Autocomplete selector
                "#input-0",                          # Common Okta selector
                "#username",                         # Generic username field
                "input[name='username']",
                "input[type='email']",
                "input[aria-labelledby='identifier-label']"
            ]
            
            # Wait for email field to appear with extended timeout
            max_wait = 20
            start_time = time.time()
            
            while time.time() - start_time < max_wait and not email_field:
                for selector in email_selectors:
                    email_field = self._find_element_safe(By.CSS_SELECTOR, selector)
                    if email_field:
                        self.logger.info(f"✅ Found username field: {selector}")
                        break
                if not email_field:
                    time.sleep(0.5)
            
            if not email_field:
                self.logger.error("❌ Email field not found within timeout")
                return None
            
            # Fill in email with realistic typing patterns
            self.logger.info("🔐 Filling in email...")
            email_field.clear()
            for char in self.username:
                email_field.send_keys(char)
                time.sleep(random.uniform(0.05, 0.15))  # Human-like typing speed
            
            # Wait before clicking next
            time.sleep(random.uniform(1.0, 2.0))
            
            # Find and click Next button
            next_selectors = [
                "button[data-se='save']",                 # Specific selector from user
                "button:contains('Next')",                # Button containing Next text
                "button[type='submit']",                  # Type selector
                "button.MuiButton-root",                  # Material-UI button class
                "button.MuiButton-primary",               # Primary button class
                "input[type='submit']",
                "button:contains('Continue')",
                "button:contains('Submit')"
            ]
            
            next_button = None
            for selector in next_selectors:
                try:
                    next_button = self.driver.find_element(By.CSS_SELECTOR, selector)
                    if next_button and next_button.is_displayed():
                        button_text = next_button.text.strip().lower()
                        if 'next' in button_text or 'continue' in button_text or not button_text:
                            self.logger.info(f"✅ Found Next button: {selector} (text: '{next_button.text}')")
                            break
                except:
                    continue
            
            if next_button:
                self.logger.info("🖱️  Clicking Next button...")
                next_button.click()
                time.sleep(3)
                
                # Check for errors after Next click
                try:
                    error_elements = self.driver.find_elements(By.CSS_SELECTOR, "[data-se='callout']")
                    if error_elements:
                        for error in error_elements:
                            error_text = error.text.lower()
                            if 'unexpected internal error' in error_text or 'internal error' in error_text:
                                self.logger.error("❌ OAuth server returned 'unexpected internal error' after Next click")
                                self.logger.error("🔍 This suggests the header injection may not have worked")
                                return None
                except:
                    pass
            else:
                self.logger.info("ℹ️  No Next button found, proceeding to password field")
            
            # Look for password field
            password_selectors = [
                "input[data-se='credentials.passcode']",  # Specific selector from user
                "input#credentials\\.passcode",           # ID selector (escaped)
                "input[name='credentials.passcode']",     # Name selector
                "input[aria-labelledby='credentials.passcode-label']",  # Aria selector
                "#input-2",           # Common Okta selector
                "#password",          # Generic password field
                "input[name='password']",
                "input[type='password']",
                "input[data-se='password']",
                "input[aria-labelledby*='password']"
            ]
            
            # Wait for password field to appear
            password_field = None
            max_wait = 20
            start_time = time.time()
            
            self.logger.info("🔍 Looking for password field...")
            while time.time() - start_time < max_wait and not password_field:
                for selector in password_selectors:
                    password_field = self._find_element_safe(By.CSS_SELECTOR, selector)
                    if password_field:
                        self.logger.info(f"✅ Found password field: {selector}")
                        break
                if not password_field:
                    time.sleep(0.5)
            
            if not password_field:
                self.logger.error("❌ Password field not found within timeout")
                return None
            
            # Fill in password with realistic typing patterns
            self.logger.info("🔐 Filling in password...")
            password_field.clear()
            for char in self.password:
                password_field.send_keys(char)
                time.sleep(random.uniform(0.05, 0.15))  # Human-like typing speed
            
            # Wait before clicking submit
            time.sleep(random.uniform(1.5, 2.5))
            
            # Find and click submit button
            submit_selectors = [
                "button[data-se='save']",                 # Specific selector from user
                "button[type='submit']",                  # Type selector
                "button.MuiButton-root",                  # Material-UI button class
                "input[type='submit']",
                "button:contains('Submit')",
                "input[value*='Submit' i]",
                "input[value*='Sign In' i]",
                "input[value*='Login' i]",
                "button:contains('Sign In')",
                "button:contains('Login')"
            ]
            
            submit_button = None
            for selector in submit_selectors:
                try:
                    submit_button = self.driver.find_element(By.CSS_SELECTOR, selector)
                    if submit_button and submit_button.is_displayed():
                        self.logger.info(f"✅ Found submit button: {selector}")
                        break
                except:
                    continue
            
            if not submit_button:
                self.logger.error("❌ Submit button not found")
                return None
            
            # Click submit button
            self.logger.info("🖱️  Clicking submit button...")
            submit_button.click()
            
            # Wait for login to process
            time.sleep(5)
            
            # Check for 2FA or proceed to extract auth code
            self.logger.info("⏳ Waiting for authorization code...")
            max_wait = 60
            start_time = time.time()
            
            while time.time() - start_time < max_wait:
                auth_code = self._extract_auth_code()
                if auth_code:
                    self.logger.info(f"🎉 Authorization code found: {auth_code[:10]}...")
                    return auth_code
                
                # Check for errors
                try:
                    error_elements = self.driver.find_elements(By.CSS_SELECTOR, "[data-se='callout']")
                    if error_elements:
                        for error in error_elements:
                            error_text = error.text.lower()
                            if 'unexpected internal error' in error_text or 'internal error' in error_text:
                                self.logger.error("❌ OAuth server error detected during authentication")
                                return None
                except:
                    pass
                
                time.sleep(2)
            
            self.logger.error("❌ Timeout waiting for authorization code")
            return None
            
        except Exception as e:
            self.logger.error(f"❌ Authentication failed: {e}")
            return None
        
        finally:
            # Clean up
            if self.driver:
                self.driver.quit()
                self.driver = None


class MeijerSeleniumStealthClient(MeijerComprehensiveClient):
    """
    Enhanced Meijer client with advanced Selenium-based authentication and stealth measures.
    """
    
    def __init__(self, username: str, password: str, **kwargs):
        """Initialize with enhanced Selenium authentication support."""
        super().__init__(username, password, **kwargs)
        self.selenium_auth = MeijerSeleniumStealthAuth(username, password)
    
    def login_with_selenium(self, headless: bool = False) -> bool:
        """
        Login using enhanced Selenium automation with stealth measures.
        
        Args:
            headless: Run browser in headless mode
            
        Returns:
            True if successful, False otherwise
        """
        try:
            self.logger.info(f"🥷 Starting Enhanced Selenium-based login with stealth measures")
            
            # Get authorization URL with mobile redirect URI
            auth_url, state, code_verifier = self.get_authorization_url(use_mobile_uri=True)
            self.logger.info(f"   State: {state}")
            self.logger.info(f"   Code Verifier: {code_verifier[:20]}...")
            
            # Configure Selenium
            self.selenium_auth.headless = headless
            
            # Perform authentication with enhanced stealth measures
            auth_code = self.selenium_auth.authenticate(auth_url)
            
            if auth_code:
                # Exchange code for tokens
                success = self.authenticate_with_code(auth_code, code_verifier)
                if success:
                    self.logger.info("✅ Enhanced Selenium login completed successfully!")
                    return True
                else:
                    self.logger.error("❌ Failed to exchange auth code for tokens")
                    return False
            else:
                self.logger.error("❌ Failed to get authorization code with enhanced stealth measures")
                return False
                
        except Exception as e:
            self.logger.error(f"❌ Enhanced Selenium login failed: {e}")
            return False
    
    def login(self) -> bool:
        """Override to use enhanced Selenium by default."""
        return self.login_with_selenium()


def main():
    """Demo of enhanced Selenium authentication."""
    try:
        # Read credentials
        username, password = read_auth_file()
        
        print("🥷 Enhanced Meijer Selenium Authentication Demo")
        print("=" * 50)
        
        # Create enhanced client
        client = MeijerSeleniumStealthClient(username, password)
        
        # Attempt login with enhanced stealth measures
        success = client.login()
        
        if success:
            print("🎉 Enhanced login successful!")
            
            # Test authenticated API call
            print("\n📊 Testing authenticated API access...")
            offers = client.get_offers()
            if offers:
                print(f"✅ Retrieved {len(offers)} offers")
            else:
                print("⚠️  No offers retrieved")
        else:
            print("❌ Enhanced login failed")
            
    except Exception as e:
        print(f"❌ Demo failed: {e}")


if __name__ == "__main__":
    main() 