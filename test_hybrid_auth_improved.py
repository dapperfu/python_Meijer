#!/usr/bin/env python3
"""
Improved Hybrid Authentication for Meijer API

This script implements a hybrid authentication approach that combines:
1. Selenium (Firefox) to bypass Akamai bot detection at the CDN level
2. Requests session with extracted cookies for fast authentication

Key insight: The issue is Akamai's bot detection at the CDN level, not application-level authentication.
We need to appear human to Akamai first, then we can use fast requests for the actual auth.

Working parameters from exact_login_replication.py:
- client_id: "0oa1o8g9njWsUvwsx697"
- scope: "openid profile offline_access"
- redirect_uri: "com.meijer.mobile.meijer:/login"
- Headers: application/json; okta-version=1.0.0 (not ion+json)
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

class HybridAuthTest:
    def __init__(self, username: str, password: str):
        """Initialize hybrid authentication test."""
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
        
        logger.info(f"🚀 HybridAuthTest initialized for {username}")
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
    
    def step1_selenium_bypass_akamai(self) -> Tuple[bool, Dict[str, Any]]:
        """Step 1: Use Selenium to bypass Akamai and get cookies."""
        logger.info("🌐 Step 1: Using Selenium to bypass Akamai...")
        
        try:
            from selenium import webdriver
            from selenium.webdriver.firefox.options import Options
            from selenium.webdriver.common.by import By
            from selenium.webdriver.support.ui import WebDriverWait
            from selenium.webdriver.support import expected_conditions as EC
            print("✅ Selenium imported successfully")
            
        except ImportError as e:
            logger.error(f"❌ Selenium not available: {e}")
            return False, {}
        
        # Setup Firefox options
        options = Options()
        options.add_argument("--width=1200")
        options.add_argument("--height=800")
        
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
        
        driver = None
        try:
            logger.info("🌐 Starting Firefox...")
            driver = webdriver.Firefox(options=options)
            logger.info("✅ Firefox started successfully!")
            
            # Generate OAuth parameters
            oauth_params = self.generate_oauth_params()
            self.code_verifier = oauth_params.get('code_verifier')
            
            # Build OAuth2 URL
            oauth_url = f"{self.okta_base}/oauth2/default/v1/authorize?{urlencode(oauth_params)}"
            logger.info(f"🔐 OAuth2 URL: {oauth_url}")
            
            # Navigate to OAuth2 page via Selenium
            logger.info("🌐 Navigating to OAuth2 page via Selenium...")
            driver.get(oauth_url)
            
            # Wait for page to load
            wait = WebDriverWait(driver, 15)
            wait.until(lambda d: d.execute_script("return document.readyState") == "complete")
            time.sleep(3)  # Additional wait for dynamic content
            
            logger.info(f"📄 Current URL: {driver.current_url}")
            logger.info(f"📄 Page title: {driver.title}")
            
            # Check if we got blocked
            page_source = driver.page_source.lower()
            if "access denied" in page_source or "error" in page_source:
                logger.error("❌ OAuth2 page blocked in Selenium - this is unexpected")
                return False, {}
            
            logger.info("✅ OAuth2 page loaded successfully via Selenium!")
            
            # Extract cookies and state token
            selenium_cookies = driver.get_cookies()
            logger.info(f"🍪 Found {len(selenium_cookies)} cookies in Selenium")
            
            # Look for state token in the page
            if 'statetoken' in page_source:
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
                return False, {}
            
            # Prepare data for return
            selenium_data = {
                'cookies': selenium_cookies,
                'state_token': self.state_token,
                'page_source_length': len(page_source),
                'current_url': driver.current_url,
                'page_title': driver.title
            }
            
            return True, selenium_data
            
        except Exception as e:
            logger.error(f"❌ Error in Selenium step: {e}")
            return False, {}
        
        finally:
            if driver:
                logger.info("🔍 Keeping browser open for inspection...")
                logger.info("💡 Close the browser manually when done")
                logger.info("⏸️ Press Ctrl+C to exit this script")
    
    def step2_create_requests_session(self, selenium_cookies: list) -> requests.Session:
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
    
    def step3_idx_identify(self, session: requests.Session) -> bool:
        """Step 3: IDX identify step with requests."""
        logger.info("🔐 Step 3: IDX identify step with requests...")
        
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
    
    def step4_challenge_answer(self, session: requests.Session) -> bool:
        """Step 4: Challenge answer step with requests."""
        logger.info("🔑 Step 4: Challenge answer step with requests...")
        
        if not self.state_handle:
            logger.error("❌ No state handle available")
            return False
        
        challenge_url = f"{self.okta_base}/idp/idx/challenge/answer"
        
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
            "credentials": {
                "passcode": self.password
            },
            "stateHandle": self.state_handle
        }
        
        logger.info(f"🔄 Testing challenge answer...")
        logger.info(f"   URL: {challenge_url}")
        logger.info(f"   State handle: {self.state_handle[:30]}...")
        
        try:
            response = session.post(challenge_url, headers=headers, json=data)
            logger.info(f"   Status: {response.status_code}")
            
            if response.status_code == 200:
                logger.info("🎉 SUCCESS! Complete authentication worked with hybrid approach!")
                try:
                    response_data = response.json()
                    logger.info(f"   Response: {json.dumps(response_data, indent=2)}")
                    return True
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    logger.info(f"   Response text: {response.text[:200]}...")
                    return False
            else:
                logger.error(f"   ❌ Challenge answer failed: {response.status_code}")
                logger.info(f"   Response: {response.text[:200]}...")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error in challenge answer: {e}")
            return False
    
    def run_hybrid_auth(self) -> bool:
        """Run the complete hybrid authentication flow."""
        logger.info("🚀 Starting Improved Hybrid Authentication...")
        logger.info("=" * 60)
        
        # Step 1: Selenium to bypass Akamai
        success, selenium_data = self.step1_selenium_bypass_akamai()
        if not success:
            logger.error("❌ Step 1 failed - could not bypass Akamai")
            return False
        
        # Step 2: Create requests session with Selenium cookies
        session = self.step2_create_requests_session(selenium_data['cookies'])
        if not session:
            logger.error("❌ Step 2 failed - could not create requests session")
            return False
        
        # Step 3: IDX identify with requests
        if not self.step3_idx_identify(session):
            logger.error("❌ Step 3 failed - IDX identify still blocked")
            return False
        
        # Step 4: Challenge answer with requests
        if not self.step4_challenge_answer(session):
            logger.error("❌ Step 4 failed - challenge answer failed")
            return False
        
        logger.info("🎉 Hybrid authentication completed successfully!")
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
    """Main function to run hybrid authentication test."""
    try:
        # Read credentials
        username, password = read_credentials()
        print(f"🔐 Using credentials:")
        print(f"   Username: {username}")
        print(f"   Password: {'*' * len(password)}")
        print()
        
        # Create and run hybrid auth test
        hybrid_test = HybridAuthTest(username, password)
        success = hybrid_test.run_hybrid_auth()
        
        if success:
            print("🎉 Hybrid authentication test completed successfully!")
            print("💡 This proves that Selenium can bypass Akamai and requests can continue the auth")
        else:
            print("❌ Hybrid authentication test failed")
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
