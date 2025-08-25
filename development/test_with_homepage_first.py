#!/usr/bin/env python3
"""
Test script that starts with Meijer homepage to establish session before OAuth2.
"""

import time
import re
import requests
import logging

# Set up logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger(__name__)

class HomepageFirstTest:
    def __init__(self, username: str, password: str):
        self.username = username
        self.password = password
        
        # Base URLs
        self.meijer_base = "https://www.meijer.com"
        self.okta_base = "https://id.meijer.com"
        
        # OAuth2 configuration
        self.client_id = "0oa22cbewuCICOsKz697"
        self.redirect_uri = "com.meijer.mobile.meijer:/login"
        self.scope = "openid profile offline_access"
        
        # State tracking
        self.state_token = None
        self.state_handle = None
        self.device_nonce = None
        
        # Create session with proper headers
        self.session = requests.Session()
        self.session.headers.update({
            'User-Agent': 'Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36',
            'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8',
            'Accept-Language': 'en-US,en;q=0.9',
            'Accept-Encoding': 'gzip, deflate',
            'Connection': 'keep-alive',
            'Upgrade-Insecure-Requests': '1'
        })
        
        # Disable SSL verification for testing
        self.session.verify = False
        import urllib3
        urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)
    
    def step0_meijer_homepage(self) -> bool:
        """Step 0: Start with Meijer homepage to establish session."""
        logger.info("🏠 Step 0: Meijer Homepage")
        
        try:
            response = self.session.get(self.meijer_base)
            logger.info(f"   Homepage status: {response.status_code}")
            
            if response.status_code == 200:
                logger.info("   ✅ Homepage loaded successfully")
                
                # Log cookies after homepage
                logger.info("   🍪 Cookies after homepage:")
                for cookie in self.session.cookies:
                    logger.info(f"      {cookie.name}: {cookie.value[:50]}...")
                
                return True
            else:
                logger.error(f"   ❌ Homepage failed: {response.status_code}")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error loading homepage: {e}")
            return False
    
    def step1_oauth_authorize(self) -> bool:
        """Step 1: OAuth2 Authorization - EXACT from working flow."""
        logger.info("🔐 Step 1: OAuth2 Authorization")
        
        # Build OAuth2 URL with PKCE - EXACT from working flow
        import secrets
        import hashlib
        import base64
        import uuid
        
        code_verifier = secrets.token_urlsafe(32)
        code_challenge = base64.urlsafe_b64encode(
            hashlib.sha256(code_verifier.encode()).digest()
        ).decode().rstrip('=')
        
        oauth_url = f"{self.okta_base}/oauth2/default/v1/authorize"
        params = {
            'login_hint': '',
            'code_challenge': code_challenge,
            'code_challenge_method': 'S256',
            'client_id': self.client_id,
            'scope': self.scope,
            'redirect_uri': self.redirect_uri,
            'response_type': 'code',
            'state': uuid.uuid4().hex,
            'nonce': uuid.uuid4().hex
        }
        
        # Headers exactly as in working flow
        headers = {
            'X-Requested-With': 'com.duckduckgo.mobile.android',
            'Sec-GPC': '1',
            'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
            'Accept-Language': 'en-US,en;q=0.9',
            'Accept-Encoding': 'gzip, deflate',
            'Sec-Fetch-Site': 'none',
            'Sec-Fetch-Mode': 'navigate',
            'Sec-Fetch-User': '?1',
            'Sec-Fetch-Dest': 'document',
            'Upgrade-Insecure-Requests': '1'
        }
        
        try:
            response = self.session.get(oauth_url, params=params, headers=headers)
            logger.info(f"   OAuth status: {response.status_code}")
            logger.info(f"   Final URL: {response.url}")
            
            if response.status_code == 200:
                # Extract stateToken from response
                state_token_match = re.search(r'stateToken["\']:\s*["\']([^"\']+)["\']', response.text)
                if state_token_match:
                    self.state_token = state_token_match.group(1)
                    logger.info(f"   ✅ State token extracted: {self.state_token[:50]}...")
                    
                    # Log all cookies for debugging
                    logger.info("   🍪 Cookies after OAuth2:")
                    for cookie in self.session.cookies:
                        logger.info(f"      {cookie.name}: {cookie.value[:50]}...")
                    
                    return True
                else:
                    logger.error("   ❌ No state token found in response")
                    logger.info(f"   Response preview: {response.text[:500]}...")
                    return False
            else:
                logger.error(f"   ❌ OAuth authorization failed: {response.status_code}")
                logger.error(f"   Response: {response.text[:500]}...")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error in OAuth authorization: {e}")
            return False
    
    def test_sequence(self) -> bool:
        """Test the sequence starting with homepage."""
        logger.info("🚀 Starting test sequence with homepage first")
        logger.info("=" * 60)
        
        # Step 0: Meijer Homepage
        if not self.step0_meijer_homepage():
            return False
        
        # Wait a moment for session to establish
        logger.info("   ⏱️  Waiting 2 seconds for session to establish...")
        time.sleep(2)
        
        # Step 1: OAuth2 Authorization
        if not self.step1_oauth_authorize():
            return False
        
        logger.info("=" * 60)
        logger.info("✅ Test sequence completed!")
        return True

def main():
    """Main function to test with homepage first."""
    # Read credentials from login.txt
    login_file = "/keg/cursor/.config/meijer/login.txt"
    
    try:
        with open(login_file, 'r') as f:
            lines = f.readlines()
            if len(lines) >= 2:
                username = lines[0].strip()
                password = lines[1].strip()
            else:
                print("❌ login.txt must contain username and password on separate lines")
                return
    except Exception as e:
        print(f"❌ Error reading {login_file}: {e}")
        return
    
    print(f"🔐 Using credentials from {login_file}")
    print(f"👤 Username: {username}")
    print(f"🔑 Password: {'*' * len(password)}")
    print()
    
    # Create test instance
    test = HomepageFirstTest(username=username, password=password)
    
    print("🔄 Starting homepage-first test...")
    print("=" * 60)
    
    try:
        success = test.test_sequence()
        if success:
            print("✅ Homepage-first test completed successfully!")
        else:
            print("❌ Homepage-first test failed!")
    except KeyboardInterrupt:
        print("\n⏹️  Test interrupted by user")
    except Exception as e:
        print(f"❌ Unexpected error: {e}")

if __name__ == "__main__":
    main()
