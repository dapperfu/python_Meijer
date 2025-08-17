#!/usr/bin/env python3
"""
Simple Selenium-based authentication for Meijer OAuth flow.

This module provides a simplified way to automate the OAuth 2.0 authorization
flow using Selenium WebDriver with automatic Chrome driver management.
"""

import json
import logging
import re
import time
from typing import Optional, Tuple
from urllib.parse import parse_qs, urlparse

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
from selenium.common.exceptions import TimeoutException, NoSuchElementException

from meijer_comprehensive import MeijerComprehensiveClient


class MeijerSeleniumAuth:
    """
    Simple Selenium-based authentication for Meijer OAuth.
    
    Automates the OAuth flow by:
    1. Opening the authorization URL
    2. Filling in login credentials
    3. Extracting the authorization code
    """
    
    def __init__(self, username: str, password: str, headless: bool = False):
        """
        Initialize the Selenium authentication handler.
        
        Args:
            username: Meijer account username/email
            password: Meijer account password
            headless: Run browser in headless mode
        """
        self.username = username
        self.password = password
        self.headless = headless
        self.driver = None
        
        # Setup logging
        logging.basicConfig(level=logging.INFO)
        self.logger = logging.getLogger(__name__)
    
    def _setup_driver(self) -> webdriver.Chrome:
        """Setup Chrome WebDriver with system ChromeDriver."""
        try:
            # Chrome options
            chrome_options = Options()
            
            if self.headless:
                chrome_options.add_argument("--headless")
            
            # Add options for better compatibility
            chrome_options.add_argument("--no-sandbox")
            chrome_options.add_argument("--disable-dev-shm-usage")
            chrome_options.add_argument("--disable-gpu")
            chrome_options.add_argument("--window-size=1920,1080")
            chrome_options.add_argument("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36")
            
            # Use Chromium instead of Chrome
            chrome_options.binary_location = "/usr/bin/chromium"
            
            # Use system ChromeDriver
            service = Service("/usr/bin/chromedriver")
            
            # Create driver
            self.driver = webdriver.Chrome(service=service, options=chrome_options)
            self.driver.implicitly_wait(10)
            
            self.logger.info("✅ Chromium WebDriver initialized successfully")
            return self.driver
            
        except Exception as e:
            self.logger.error(f"❌ Failed to initialize WebDriver: {e}")
            raise
    
    def _wait_for_element(self, by: By, value: str, timeout: int = 30):
        """Wait for an element to be present and clickable."""
        wait = WebDriverWait(self.driver, timeout)
        return wait.until(EC.element_to_be_clickable((by, value)))
    
    def _find_element_safe(self, by: By, value: str):
        """Safely find an element without waiting."""
        try:
            return self.driver.find_element(by, value)
        except NoSuchElementException:
            return None
    
    def _extract_auth_code(self) -> Optional[str]:
        """Extract authorization code from current page."""
        try:
            current_url = self.driver.current_url
            
            # Check URL for auth code
            if 'code=' in current_url:
                parsed = urlparse(current_url)
                query_params = parse_qs(parsed.query)
                if 'code' in query_params:
                    return query_params['code'][0]
            
            # Check page source for auth code patterns
            page_source = self.driver.page_source
            
            # Look for various auth code patterns
            patterns = [
                r'code=([a-zA-Z0-9_-]+)',
                r'authorization_code=([a-zA-Z0-9_-]+)',
                r'auth_code=([a-zA-Z0-9_-]+)',
                r'com\.meijer\.mobile\.meijer:/login\?code=([a-zA-Z0-9_-]+)'
            ]
            
            for pattern in patterns:
                match = re.search(pattern, page_source)
                if match:
                    return match.group(1)
            
            return None
            
        except Exception as e:
            self.logger.error(f"Error extracting auth code: {e}")
            return None
    
    def authenticate(self, auth_url: str) -> Optional[str]:
        """
        Perform OAuth authentication and return authorization code.
        
        Args:
            auth_url: The OAuth authorization URL
            
        Returns:
            Authorization code if successful, None otherwise
        """
        try:
            self.logger.info("🚀 Starting Selenium OAuth authentication")
            
            # Setup WebDriver
            self._setup_driver()
            
            # Navigate to authorization URL
            self.logger.info(f"🌐 Opening: {auth_url[:80]}...")
            self.driver.get(auth_url)
            
            # Wait for page to load and immediately look for username/email field
            self.logger.info("🔍 Looking for email field...")
            
            # Look for username/email field using the specific selector provided
            username_selectors = [
                "input[data-se='identifier']",  # Specific selector from user
                "input#identifier",             # ID selector
                "input[name='identifier']",     # Name selector
                "input[aria-labelledby='identifier-label']",  # Aria selector
                "#input-1",                    # Common Okta selector
                "#username",                   # Generic username field
                "input[name='username']",
                "input[type='email']",
                "input[placeholder*='email' i]",
                "input[placeholder*='username' i]"
            ]
            
            # Wait for any of the username fields to appear with a shorter timeout
            username_field = None
            max_wait = 10  # Reduced from 30 to 10 seconds
            start_time = time.time()
            
            while time.time() - start_time < max_wait and not username_field:
                for selector in username_selectors:
                    username_field = self._find_element_safe(By.CSS_SELECTOR, selector)
                    if username_field:
                        self.logger.info(f"✅ Found username field: {selector}")
                        break
                if not username_field:
                    time.sleep(0.5)  # Check every 500ms instead of waiting longer
            
            if not username_field:
                self.logger.error("❌ Username field not found within timeout")
                return None
            
            # Fill in email/username immediately
            self.logger.info("🔐 Filling in email...")
            username_field.clear()
            username_field.send_keys(self.username)
            
            # Look for Next button to proceed to password field
            next_selectors = [
                "input[type='submit']",
                "button[type='submit']",
                "input[value*='Next' i]",
                "input[value*='Continue' i]",
                "button:contains('Next')",
                "button:contains('Continue')",
                "input[data-se='identifier-submit']",
                "button[data-se='identifier-submit']"
            ]
            
            next_button = None
            for selector in next_selectors:
                try:
                    next_button = self.driver.find_element(By.CSS_SELECTOR, selector)
                    if next_button:
                        self.logger.info(f"✅ Found Next button: {selector}")
                        break
                except:
                    continue
            
            if next_button:
                self.logger.info("🖱️  Clicking Next button...")
                next_button.click()
                
                # Reduced wait time after clicking Next
                time.sleep(1)  # Reduced from 3 to 1 second
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
            
            # Wait for password field to appear with shorter timeout
            password_field = None
            max_wait = 8  # Reduced timeout for password field
            start_time = time.time()
            
            while time.time() - start_time < max_wait and not password_field:
                for selector in password_selectors:
                    password_field = self._find_element_safe(By.CSS_SELECTOR, selector)
                    if password_field:
                        self.logger.info(f"✅ Found password field: {selector}")
                        break
                if not password_field:
                    time.sleep(0.3)  # Check every 300ms for faster response
            
            if not password_field:
                self.logger.error("❌ Password field not found within timeout")
                return None
            
            # Fill in password
            self.logger.info("🔐 Filling in password...")
            password_field.clear()
            password_field.send_keys(self.password)
            
            # Find and click submit button using the specific selector
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
                "button:contains('Login')",
                "input[data-se='password-submit']",
                "button[data-se='password-submit']"
            ]
            
            submit_button = None
            for selector in submit_selectors:
                try:
                    submit_button = self.driver.find_element(By.CSS_SELECTOR, selector)
                    if submit_button:
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
            
            # Wait for login to process and check for 2FA
            time.sleep(5)
            
            # Check for 2FA email selection button
            mfa_email_selectors = [
                "button[data-se='authenticator-button']",  # Specific selector from user
                "button[aria-label*='Email']",             # Aria label containing Email
                "button[aria-describedby*='okta_email']",  # Aria describedby containing okta_email
                "button:contains('Send Email')",           # Button text containing Send Email
                "button[data-se*='okta_email']",           # Data-se containing okta_email
                "button.MuiBox-root"                       # Material-UI button class
            ]
            
            mfa_email_button = None
            for selector in mfa_email_selectors:
                mfa_email_button = self._find_element_safe(By.CSS_SELECTOR, selector)
                if mfa_email_button:
                    self.logger.info(f"✅ Found 2FA email button: {selector}")
                    break
            
            if mfa_email_button:
                self.logger.info("📧 2FA email option detected, clicking to send code...")
                mfa_email_button.click()
                
                # Wait for email to be sent
                time.sleep(3)
                
                self.logger.info("📬 Email verification code sent")
                self.logger.info("📱 Please check your email and enter the code manually")
                input("Press Enter after entering the email verification code...")
            else:
                self.logger.info("ℹ️  No 2FA email button found, proceeding...")
            
            # Check for MFA code input field
            mfa_selectors = [
                "input[data-se='passcode']",               # Data-se passcode
                "input[placeholder*='code' i]",            # Placeholder containing code
                "input[placeholder*='verification' i]",    # Placeholder containing verification
                "input[name*='code']",                     # Name containing code
                "input[name*='verification']",             # Name containing verification
                "input[data-se='credentials.passcode']",   # Credentials passcode
                "#input-4"                                 # Common Okta MFA field
            ]
            
            mfa_required = False
            for selector in mfa_selectors:
                if self._find_element_safe(By.CSS_SELECTOR, selector):
                    mfa_required = True
                    self.logger.warning("⚠️  MFA code input field detected")
                    self.logger.info("📱 Please enter MFA code manually in the browser")
                    input("Press Enter after entering MFA code...")
                    break
            
            # Wait for redirect and extract auth code
            self.logger.info("⏳ Waiting for authorization code...")
            max_wait = 60
            start_time = time.time()
            
            while time.time() - start_time < max_wait:
                auth_code = self._extract_auth_code()
                if auth_code:
                    self.logger.info(f"🎉 Authorization code found: {auth_code[:10]}...")
                    return auth_code
                
                # Check for errors
                error_elements = self.driver.find_elements(By.CLASS_NAME, "error")
                if error_elements:
                    error_text = error_elements[0].text
                    if "error" in error_text.lower():
                        self.logger.error(f"❌ Login error: {error_text}")
                        return None
                
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


class MeijerSeleniumClient(MeijerComprehensiveClient):
    """
    Meijer client with Selenium-based authentication.
    """
    
    def __init__(self, username: str, password: str, **kwargs):
        """Initialize with Selenium authentication support."""
        super().__init__(username, password, **kwargs)
        self.selenium_auth = MeijerSeleniumAuth(username, password)
    
    def login_with_selenium(self, headless: bool = False) -> bool:
        """
        Login using Selenium automation.
        
        Args:
            headless: Run browser in headless mode
            
        Returns:
            True if successful, False otherwise
        """
        try:
            self.logger.info("🤖 Starting Selenium-based login")
            
            # Configure Selenium
            self.selenium_auth.headless = headless
            
            # Get authorization URL
            auth_url, state, code_verifier = self.get_authorization_url()
            
            # Perform authentication
            auth_code = self.selenium_auth.authenticate(auth_url)
            
            if auth_code:
                # Exchange code for tokens
                success = self.authenticate_with_code(auth_code, code_verifier)
                if success:
                    self.logger.info("✅ Selenium login completed successfully!")
                    return True
                else:
                    self.logger.error("❌ Failed to exchange auth code for tokens")
                    return False
            else:
                self.logger.error("❌ Failed to get authorization code")
                return False
                
        except Exception as e:
            self.logger.error(f"❌ Selenium login failed: {e}")
            return False
    
    def login(self) -> bool:
        """Override to use Selenium by default."""
        return self.login_with_selenium()


def read_auth_file(filepath: str = "auth.txt") -> Tuple[str, str]:
    """
    Read authentication credentials from auth.txt file.
    
    Args:
        filepath: Path to the auth file
        
    Returns:
        Tuple of (username, password)
        
    Raises:
        FileNotFoundError: If auth file doesn't exist
        ValueError: If auth file format is invalid
    """
    try:
        with open(filepath, 'r') as f:
            content = f.read().strip()
        
        username = None
        password = None
        
        for line in content.split('\n'):
            line = line.strip()
            if line.startswith('username='):
                username = line.split('=', 1)[1]
            elif line.startswith('password='):
                password = line.split('=', 1)[1]
        
        if not username or not password:
            raise ValueError("Both username and password must be specified in auth.txt")
        
        return username, password
        
    except FileNotFoundError:
        raise FileNotFoundError(f"Auth file not found: {filepath}")
    except Exception as e:
        raise ValueError(f"Error reading auth file: {e}")


def main():
    """Demo of Selenium-based authentication using auth.txt."""
    print("🤖 Meijer Selenium Authentication Demo")
    print("=" * 50)
    
    try:
        # Read credentials from auth.txt
        print("📖 Reading credentials from auth.txt...")
        username, password = read_auth_file()
        print(f"✅ Credentials loaded for: {username}")
        
        # Create client
        client = MeijerSeleniumClient(username, password)
        
        # Perform automated login
        print("\n🚀 Starting automated OAuth authentication...")
        print("📱 A Chrome browser will open automatically")
        print("🔐 Credentials will be filled in automatically")
        print("⚠️  If MFA is required, you'll need to enter the code manually")
        
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
    
    except FileNotFoundError as e:
        print(f"❌ {e}")
        print("Please create auth.txt with your Meijer credentials:")
        print("username=your_email@example.com")
        print("password=your_password")
    except ValueError as e:
        print(f"❌ {e}")
    except KeyboardInterrupt:
        print("\n⏹️  Operation cancelled by user")
    except Exception as e:
        print(f"❌ Error: {e}")


if __name__ == "__main__":
    main() 