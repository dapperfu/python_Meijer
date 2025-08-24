#!/usr/bin/env python3
"""
Headless Hybrid Authentication for Meijer API

This script implements a headless hybrid authentication approach using pure Selenium:
1. Selenium (Firefox headless) to bypass Akamai bot detection at the CDN level
2. Cookie extraction and session state transfer
3. Fast authentication continuation using requests

Key benefits of headless approach:
- No visible browser window (production-friendly)
- Faster execution (no rendering overhead)
- Resource efficient (no GUI resources)
- Automated/CI-friendly
"""

import sys
import os
import time
import json
import secrets
import hashlib
import base64
import uuid
import logging
from typing import Dict, Any, Optional, Tuple
from urllib.parse import urlencode, parse_qs, urlparse

# Add the current directory to Python path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

# Set up logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger(__name__)

class HeadlessHybridAuth:
    def __init__(self, username: str, password: str):
        """Initialize headless hybrid authentication."""
        self.username = username
        self.password = password
        
        # Working parameters from exact_login_replication.py
        self.client_id = "0oa1o8g9njWsUvwsx697"
        self.redirect_uri = "com.meijer.mobile.meijer:/login"
        self.scope = "openid profile offline_access"
        
        # Base URLs
        self.okta_base = "https://id.meijer.com"
        
        # State tracking
        self.state_token = None
        self.state_handle = None
        self.code_verifier = None
        
        # User agent from successful flow
        self.user_agent = "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36"
        
        # Base headers from successful flow
        self.base_headers = {
            'User-Agent': self.user_agent,
            'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
            'Accept-Language': 'en-US,en;q=0.9',
            'Accept-Encoding': 'gzip, deflate',
            'Sec-Fetch-Site': 'none',
            'Sec-Fetch-Mode': 'navigate',
            'Sec-Fetch-User': '?1',
            'Sec-Fetch-Dest': 'document',
            'Upgrade-Insecure-Requests': '1'
        }
        
        logger.info(f"🚀 HeadlessHybridAuth initialized for {username}")
        logger.info(f"🔧 Using working parameters from exact_login_replication.py")
    
    def generate_pkce_params(self) -> Tuple[str, str]:
        """Generate PKCE parameters exactly as in successful flow."""
        code_verifier = secrets.token_urlsafe(32)
        code_challenge = base64.urlsafe_b64encode(
            hashlib.sha256(code_verifier.encode()).digest()
        ).decode().rstrip('=')
        return code_verifier, code_challenge
    
    def generate_oauth_params(self) -> Dict[str, str]:
        """Generate OAuth2 parameters exactly as in successful flow."""
        code_verifier, code_challenge = self.generate_pkce_params()
        
        return {
            'login_hint': '',
            'code_challenge': code_challenge,
            'code_challenge_method': 'S256',
            'client_id': self.client_id,
            'scope': self.scope,
            'redirect_uri': self.redirect_uri,
            'response_type': 'code',
            'state': uuid.uuid4().hex,
            'nonce': uuid.uuid4().hex,
            'code_verifier': code_verifier
        }
    
    def setup_headless_firefox(self) -> Optional[Any]:
        """Setup headless Firefox with optimal settings for automation."""
        logger.info("🌐 Setting up headless Firefox...")
        
        try:
            from selenium import webdriver
            from selenium.webdriver.firefox.options import Options
            from selenium.webdriver.firefox.service import Service
            from webdriver_manager.firefox import GeckoDriverManager
            print("✅ Selenium and webdriver-manager imported successfully")
            
        except ImportError as e:
            logger.error(f"❌ Required packages not available: {e}")
            logger.error("Install with: pip install selenium webdriver-manager")
            return None
        
        # Setup Firefox options for headless operation
        options = Options()
        
        # Headless mode
        options.add_argument("--headless")
        
        # Window size (required for headless)
        options.add_argument("--width=1920")
        options.add_argument("--height=1080")
        
        # Performance optimizations
        options.add_argument("--disable-gpu")
        options.add_argument("--no-sandbox")
        options.add_argument("--disable-dev-shm-usage")
        
        # Disable unnecessary features for faster loading
        options.add_argument("--disable-extensions")
        options.add_argument("--disable-plugins")
        options.add_argument("--disable-images")  # Skip image loading for speed
        options.add_argument("--disable-javascript")  # Disable JS for faster page load
        
        # Add proxy configuration for mitmproxy
        logger.info("🌐 Configuring mitmproxy proxy...")
        options.set_preference("network.proxy.type", 1)  # Manual proxy
        options.set_preference("network.proxy.http", "127.0.0.1")
        options.set_preference("network.proxy.http_port", 8080)
        options.set_preference("network.proxy.ssl", "127.0.0.1")
        options.set_preference("network.proxy.ssl_port", 8080)
        options.set_preference("network.proxy.share_proxy_settings", True)
        
        # Handle mitmproxy certificate issues
        options.set_preference("security.cert_verification.enabled", False)
        options.set_preference("security.enterprise_roots.enabled", True)
        
        # Additional preferences for headless operation
        options.set_preference("browser.download.folderList", 2)
        options.set_preference("browser.download.manager.showWhenStarting", False)
        options.set_preference("browser.helperApps.neverAsk.saveToDisk", "application/pdf")
        
        # Disable logging for cleaner output
        options.set_preference("devtools.console.stdout.content", False)
        options.set_preference("devtools.console.stdout.enabled", False)
        
        try:
            # Use webdriver-manager to automatically handle driver compatibility
            service = Service(GeckoDriverManager().install())
            driver = webdriver.Firefox(service=service, options=options)
            
            # Set page load timeout
            driver.set_page_load_timeout(30)
            driver.implicitly_wait(10)
            
            logger.info("✅ Headless Firefox started successfully!")
            return driver
            
        except Exception as e:
            logger.error(f"❌ Failed to start headless Firefox: {e}")
            return None
    
    def step1_selenium_bypass_akamai(self) -> Tuple[bool, Dict[str, Any]]:
        """Step 1: Use headless Selenium to bypass Akamai and get cookies."""
        logger.info("🌐 Step 1: Using headless Selenium to bypass Akamai...")
        
        driver = self.setup_headless_firefox()
        if not driver:
            return False, {}
        
        try:
            # Generate OAuth parameters
            oauth_params = self.generate_oauth_params()
            self.code_verifier = oauth_params.get('code_verifier')
            
            # Build OAuth2 URL
            oauth_url = f"{self.okta_base}/oauth2/default/v1/authorize?{urlencode(oauth_params)}"
            logger.info(f"🔐 OAuth2 URL: {oauth_url}")
            
            # Navigate to OAuth2 page via headless Selenium
            logger.info("🌐 Navigating to OAuth2 page via headless Selenium...")
            driver.get(oauth_url)
            
            # Wait for page to load (headless mode needs explicit waits)
            logger.info("⏳ Waiting for page to load in headless mode...")
            time.sleep(8)  # Longer wait for headless mode
            
            # Check page status
            current_url = driver.current_url
            page_title = driver.title
            logger.info(f"📄 Current URL: {current_url}")
            logger.info(f"📄 Page title: {page_title}")
            
            # Get page source for analysis
            page_source = driver.page_source
            logger.info(f"📄 Page source length: {len(page_source)} bytes")
            
            # Check if we got blocked
            page_source_lower = page_source.lower()
            if "access denied" in page_source_lower or "error" in page_source_lower:
                logger.error("❌ OAuth2 page blocked in headless Selenium")
                return False, {}
            
            logger.info("✅ OAuth2 page loaded successfully via headless Selenium!")
            
            # Extract cookies and state token
            selenium_cookies = driver.get_cookies()
            logger.info(f"🍪 Found {len(selenium_cookies)} cookies in headless Selenium")
            
            # Log cookie details for debugging
            for i, cookie in enumerate(selenium_cookies):
                logger.info(f"   Cookie {i+1}: {cookie['name']} = {cookie['value'][:30]}... (domain: {cookie['domain']})")
            
            # Look for state token in the page
            if 'statetoken' in page_source_lower:
                import re
                match = re.search(r'stateToken["\']?\s*:\s*["\']([^"\']+)["\']', page_source)
                if match:
                    self.state_token = match.group(1)
                    logger.info(f"✅ State token extracted: {self.state_token[:50]}...")
                else:
                    logger.error("❌ Could not extract state token from page")
                    return False, {}
            else:
                logger.error("❌ No state token found in page")
                # Log a sample of the page source for debugging
                logger.info(f"📄 Page source sample: {page_source[:500]}...")
                return False, {}
            
            # Prepare data for return
            selenium_data = {
                'cookies': selenium_cookies,
                'state_token': self.state_token,
                'page_source_length': len(page_source),
                'current_url': current_url,
                'page_title': page_title
            }
            
            return True, selenium_data
            
        except Exception as e:
            logger.error(f"❌ Error in headless Selenium step: {e}")
            import traceback
            traceback.print_exc()
            return False, {}
        
        finally:
            if driver:
                logger.info("🔒 Closing headless Firefox...")
                try:
                    driver.quit()
                    logger.info("✅ Headless Firefox closed successfully")
                except Exception as e:
                    logger.warning(f"⚠️ Error closing Firefox: {e}")
    
    def step2_create_requests_session(self, selenium_cookies: list) -> Optional[Any]:
        """Step 2: Create requests session with Selenium cookies."""
        logger.info("🔄 Step 2: Creating requests session with Selenium cookies...")
        
        try:
            import requests
        except ImportError:
            logger.error("❌ Requests not available")
            return None
        
        # Create requests session
        session = requests.Session()
        
        # Configure proxy
        session.proxies = {
            'http': 'http://127.0.0.1:8080',
            'https': 'http://127.0.0.1:8080'
        }
        
        # Configure SSL with mitmproxy certificate
        ssl_cert_path = "/keg/cursor/.mitmproxy/mitmproxy-ca-cert.pem"
        if os.path.exists(ssl_cert_path):
            session.verify = ssl_cert_path
            logger.info(f"   ✅ SSL certificate configured: {ssl_cert_path}")
        else:
            session.verify = False
            logger.info(f"   ⚠️ SSL certificate not found: {ssl_cert_path}")
            import urllib3
            urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)
        
        # Add cookies from Selenium to requests session
        for cookie in selenium_cookies:
            session.cookies.set(cookie['name'], cookie['value'], domain=cookie['domain'])
            logger.info(f"   🍪 Added cookie: {cookie['name']} = {cookie['value'][:30]}...")
        
        # Set headers for requests
        session.headers.update(self.base_headers)
        
        logger.info("✅ Requests session configured with Selenium cookies")
        return session
    
    def step3_test_requests_access(self, session: Any, oauth_url: str) -> bool:
        """Step 3: Test if requests can access the same page with Selenium cookies."""
        logger.info("🔄 Step 3: Testing if requests can access the same page...")
        
        try:
            response = session.get(oauth_url)
            logger.info(f"   Status: {response.status_code}")
            
            if response.status_code == 200:
                logger.info("✅ SUCCESS! Requests can access the page with Selenium cookies!")
                logger.info("💡 This proves the hybrid approach works!")
                return True
            else:
                logger.error(f"   ❌ Requests still blocked: {response.status_code}")
                logger.info(f"   Response: {response.text[:200]}...")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error testing requests: {e}")
            return False
    
    def step4_idx_identify(self, session: Any) -> bool:
        """Step 4: IDX identify step with requests."""
        logger.info("🔐 Step 4: IDX identify step with requests...")
        
        if not self.state_token:
            logger.error("❌ No state token available")
            return False
        
        idx_url = f"{self.okta_base}/idp/idx/identify"
        
        # Headers exactly as in working flow
        headers = {
            'Accept': 'application/json; okta-version=1.0.0',
            'X-Okta-User-Agent-Extended': 'okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459',
            'X-Device-Fingerprint': f"dummy_nonce|a51183db48a04679a8d3769ee8a151455b09acf91a15ffe9625eeec4f91ad5b7|21c0dae824c3f48f32f5b271e1d291d8",
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
        
        # Request body
        data = {
            "identifier": self.username,
            "stateHandle": self.state_token
        }
        
        logger.info(f"🔄 Testing IDX identify with Selenium cookies...")
        logger.info(f"   URL: {idx_url}")
        logger.info(f"   State token: {self.state_token[:30]}...")
        
        try:
            response = session.post(idx_url, headers=headers, json=data)
            logger.info(f"   Status: {response.status_code}")
            
            if response.status_code == 200:
                logger.info("✅ SUCCESS! IDX identify worked with hybrid approach!")
                try:
                    response_data = response.json()
                    logger.info(f"   Response: {json.dumps(response_data, indent=2)}")
                    
                    # Extract state handle for next step
                    if 'stateHandle' in response_data:
                        self.state_handle = response_data['stateHandle']
                        logger.info(f"   ✅ State handle obtained: {self.state_handle[:50]}...")
                        return True
                    else:
                        logger.error("   ❌ No state handle in response")
                        return False
                        
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    logger.info(f"   Response text: {response.text[:200]}...")
                    return False
                    
            else:
                logger.error(f"   ❌ IDX identify still failed: {response.status_code}")
                logger.info(f"   Response: {response.text[:200]}...")
                logger.info("   💡 Even with Selenium cookies, we're still getting blocked")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error in IDX identify: {e}")
            return False
    
    def run_headless_hybrid_auth(self) -> bool:
        """Run the complete headless hybrid authentication flow."""
        logger.info("🚀 Starting Headless Hybrid Authentication...")
        logger.info("=" * 60)
        
        # Step 1: Headless Selenium to bypass Akamai
        success, selenium_data = self.step1_selenium_bypass_akamai()
        if not success:
            logger.error("❌ Step 1 failed - could not bypass Akamai with headless Selenium")
            return False
        
        # Step 2: Create requests session with Selenium cookies
        session = self.step2_create_requests_session(selenium_data['cookies'])
        if not session:
            logger.error("❌ Step 2 failed - could not create requests session")
            return False
        
        # Step 3: Test if requests can access the same page
        oauth_url = f"{self.okta_base}/oauth2/default/v1/authorize?{urlencode(self.generate_oauth_params())}"
        if not self.step3_test_requests_access(session, oauth_url):
            logger.error("❌ Step 3 failed - requests cannot access page with Selenium cookies")
            return False
        
        # Step 4: IDX identify with requests
        if not self.step4_idx_identify(session):
            logger.error("❌ Step 4 failed - IDX identify still blocked")
            return False
        
        logger.info("🎉 Headless hybrid authentication completed successfully!")
        return True

def read_credentials() -> tuple[str, str]:
    """Read credentials from login.txt file."""
    login_file = "/keg/cursor/.config/meijer/login.txt"
    
    try:
        with open(login_file, 'r') as f:
            lines = f.readlines()
            if len(lines) >= 2:
                username = lines[0].strip()
                password = lines[1].strip()
                return username, password
            else:
                raise ValueError("login.txt must contain username and password on separate lines")
    except Exception as e:
        print(f"❌ Error reading {login_file}: {e}")
        sys.exit(1)

def main():
    """Main function to run headless hybrid authentication test."""
    try:
        # Read credentials
        username, password = read_credentials()
        print(f"🔐 Using credentials:")
        print(f"   Username: {username}")
        print(f"   Password: {'*' * len(password)}")
        print()
        
        # Create and run headless hybrid auth test
        headless_auth = HeadlessHybridAuth(username, password)
        success = headless_auth.run_headless_hybrid_auth()
        
        if success:
            print("🎉 Headless hybrid authentication test completed successfully!")
            print("💡 This proves that headless Selenium can bypass Akamai and requests can continue the auth")
            print("🚀 This approach is production-ready and CI-friendly!")
        else:
            print("❌ Headless hybrid authentication test failed")
            print("💡 This suggests the issue might be deeper than just Akamai CDN blocking")
        
        return success
        
    except KeyboardInterrupt:
        print("\n👋 Exiting...")
        return False
    except Exception as e:
        print(f"❌ Error in main: {e}")
        import traceback
        traceback.print_exc()
        return False

if __name__ == "__main__":
    main()
