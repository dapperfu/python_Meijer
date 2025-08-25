#!/usr/bin/env python3
"""
Complete Headless Login Workflow for Meijer
Based on successful authentication flows analyzed from mitmproxy logs.
This script replicates the exact successful login sequence without Selenium.
"""

import requests
import json
import time
import random
import base64
import hashlib
import secrets
from urllib.parse import urlencode
from typing import Dict, Any, Tuple
import logging

# Configure logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger(__name__)

class MeijerHeadlessLogin:
    def __init__(self, username: str, password: str, proxy_host: str = None, proxy_port: int = None):
        self.username = username
        self.password = password
        self.session = requests.Session()
        
        # Configure proxy if provided
        if proxy_host and proxy_port:
            self.session.proxies = {
                'http': f'http://{proxy_host}:{proxy_port}',
                'https': f'http://{proxy_host}:{proxy_port}'
            }
            # Disable SSL verification for mitmproxy
            self.session.verify = False
            logger.info(f"🔒 Proxy configured: {proxy_host}:{proxy_port}")
        
        # Base URLs
        self.base_url = "https://id.meijer.com"
        self.oauth_url = f"{self.base_url}/oauth2/default/v1"
        
        # OAuth parameters from successful flow
        self.client_id = "0oa1o8g9njWsUvwsx697"
        self.redirect_uri = "com.meijer.mobile.meijer:/login"
        self.scope = "openid profile offline_access"
        
        # Session state
        self.state = None
        self.nonce = None
        self.code_verifier = None
        self.code_challenge = None
        self.auth_code = None
        self.access_token = None
        self.id_token = None
        self.state_token = None  # Add missing attribute
        self.device_nonce = None  # Add missing attribute
        
        # Headers based on successful flow
        self.default_headers = {
            'User-Agent': 'Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36',
            'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
            'Accept-Language': 'en-US,en;q=0.9',
            'Accept-Encoding': 'gzip, deflate, br, zstd',
            'Sec-Fetch-Site': 'none',
            'Sec-Fetch-Mode': 'navigate',
            'Sec-Fetch-User': '?1',
            'Sec-Fetch-Dest': 'document',
            'Upgrade-Insecure-Requests': '1'
        }
        
        # Set default headers
        self.session.headers.update(self.default_headers)
        
    def generate_pkce_params(self) -> Tuple[str, str]:
        """Generate PKCE code verifier and challenge."""
        self.code_verifier = secrets.token_urlsafe(32)
        self.code_challenge = base64.urlsafe_b64encode(
            hashlib.sha256(self.code_verifier.encode()).digest()
        ).decode().rstrip('=')
        return self.code_verifier, self.code_challenge
    
    def generate_state_nonce(self) -> Tuple[str, str]:
        """Generate state and nonce parameters."""
        self.state = secrets.token_urlsafe(32)
        self.nonce = secrets.token_urlsafe(32)
        return self.state, self.nonce
    
    def step1_oauth_authorize(self) -> bool:
        """Step 1: OAuth2 authorization request."""
        logger.info("🔐 Step 1: OAuth2 Authorization Request")
        
        # Generate PKCE and state parameters
        self.generate_pkce_params()
        self.generate_state_nonce()
        
        # Build authorization URL
        params = {
            'login_hint': '',
            'code_challenge': self.code_challenge,
            'code_challenge_method': 'S256',
            'client_id': self.client_id,
            'scope': self.scope,
            'redirect_uri': self.redirect_uri,
            'response_type': 'code',
            'state': self.state,
            'nonce': self.nonce
        }
        
        auth_url = f"{self.oauth_url}/authorize?{urlencode(params)}"
        logger.info(f"🔗 Authorization URL: {auth_url}")
        
        try:
            response = self.session.get(auth_url, allow_redirects=True)
            logger.info(f"✅ OAuth authorize response: {response.status_code}")
            
            if response.status_code == 200:
                # Extract any cookies and session data
                logger.info("🍪 Cookies received:")
                for cookie in self.session.cookies:
                    logger.info(f"  {cookie.name}: {cookie.value}")
                return True
            else:
                logger.error(f"❌ OAuth authorize failed: {response.status_code}")
                return False
                
        except Exception as e:
            logger.error(f"❌ Error in OAuth authorize: {e}")
            return False
    
    def step2_device_fingerprint(self) -> bool:
        """Step 2: Device fingerprinting page."""
        logger.info("🔍 Step 2: Device Fingerprinting")
        
        try:
            # Load the device fingerprint page
            fingerprint_url = f"{self.base_url}/auth/services/devicefingerprint"
            response = self.session.get(fingerprint_url)
            
            if response.status_code == 200:
                logger.info("✅ Device fingerprint page loaded")
                # Add delay to simulate JavaScript execution
                time.sleep(random.uniform(1.0, 2.0))
                return True
            else:
                logger.error(f"❌ Device fingerprint failed: {response.status_code}")
                return False
                
        except Exception as e:
            logger.error(f"❌ Error in device fingerprint: {e}")
            return False
    
    def step3_device_nonce(self) -> bool:
        """Step 3: Get device nonce."""
        logger.info("🔑 Step 3: Device Nonce Request")
        
        try:
            nonce_url = f"{self.base_url}/api/v1/internal/device/nonce"
            
            # Headers from successful flow
            headers = {
                'X-Requested-With': 'XMLHttpRequest',
                'Origin': self.base_url,
                'Referer': f"{self.base_url}/auth/services/devicefingerprint"
            }
            
            response = self.session.post(nonce_url, headers=headers)
            
            if response.status_code == 200:
                nonce_data = response.json()
                self.device_nonce = nonce_data.get('nonce')
                logger.info(f"✅ Device nonce received: {self.device_nonce[:20]}...")
                return True
            else:
                logger.error(f"❌ Device nonce failed: {response.status_code}")
                return False
                
        except Exception as e:
            logger.error(f"❌ Error in device nonce: {e}")
            return False
    
    def step4_web_login_identify(self) -> bool:
        """Step 4: Web login identify with device fingerprint."""
        logger.info("👤 Step 4: Web Login Identify")
        
        try:
            identify_url = f"{self.base_url}/idp/idx/identify"
            
            # Headers from successful flow
            headers = {
                'X-Requested-With': 'XMLHttpRequest',
                'Origin': self.base_url,
                'Referer': f"{self.base_url}/auth/services/devicefingerprint",
                'Content-Type': 'application/json'
            }
            
            # Payload from successful flow
            payload = {
                "identifier": self.username,
                "rememberMe": False,
                "stateToken": None  # Will be set by the response
            }
            
            response = self.session.post(identify_url, headers=headers, json=payload)
            
            if response.status_code == 200:
                identify_data = response.json()
                self.state_token = identify_data.get('stateToken')
                logger.info(f"✅ Identify successful, state token: {self.state_token[:20] if self.state_token else 'None'}...")
                return True
            else:
                logger.error(f"❌ Identify failed: {response.status_code} - {response.text}")
                return False
                
        except Exception as e:
            logger.error(f"❌ Error in identify: {e}")
            return False
    
    def step5_challenge_answer(self) -> bool:
        """Step 5: Submit password challenge."""
        logger.info("🔐 Step 5: Password Challenge")
        
        if not self.state_token:
            logger.error("❌ No state token available")
            return False
        
        try:
            challenge_url = f"{self.base_url}/idp/idx/challenge/answer"
            
            headers = {
                'X-Requested-With': 'XMLHttpRequest',
                'Origin': self.base_url,
                'Referer': f"{self.base_url}/idp/idx/identify",
                'Content-Type': 'application/json'
            }
            
            payload = {
                "stateToken": self.state_token,
                "credentials": {
                    "passcode": self.password
                }
            }
            
            response = self.session.post(challenge_url, headers=headers, json=payload)
            
            if response.status_code == 200:
                challenge_data = response.json()
                logger.info("✅ Password challenge successful")
                
                # Check if we need to handle MFA
                if challenge_data.get('type') == 'MFA':
                    logger.info("📱 MFA required - this workflow doesn't handle MFA yet")
                    return False
                
                # Check if we got a new state token
                new_state_token = challenge_data.get('stateToken')
                if new_state_token:
                    self.state_token = new_state_token
                
                return True
            else:
                logger.error(f"❌ Password challenge failed: {response.status_code} - {response.text}")
                return False
                
        except Exception as e:
            logger.error(f"❌ Error in password challenge: {e}")
            return False
    
    def step6_oauth_keys(self) -> bool:
        """Step 6: Get OAuth public keys."""
        logger.info("🔑 Step 6: OAuth Public Keys")
        
        try:
            keys_url = f"{self.oauth_url}/keys"
            response = self.session.get(keys_url)
            
            if response.status_code == 200:
                keys_data = response.json()
                logger.info(f"✅ OAuth keys received: {len(keys_data.get('keys', []))} keys")
                return True
            else:
                logger.error(f"❌ OAuth keys failed: {response.status_code}")
                return False
                
        except Exception as e:
            logger.error(f"❌ Error in OAuth keys: {e}")
            return False
    
    def step7_token_exchange(self) -> bool:
        """Step 7: Exchange authorization code for tokens."""
        logger.info("🔄 Step 7: Token Exchange")
        
        if not self.auth_code:
            logger.error("❌ No authorization code available")
            return False
        
        try:
            token_url = f"{self.oauth_url}/token"
            
            headers = {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
            
            payload = {
                'grant_type': 'authorization_code',
                'client_id': self.client_id,
                'redirect_uri': self.redirect_uri,
                'code': self.auth_code,
                'code_verifier': self.code_verifier
            }
            
            response = self.session.post(token_url, headers=headers, data=payload)
            
            if response.status_code == 200:
                token_data = response.json()
                self.access_token = token_data.get('access_token')
                self.id_token = token_data.get('id_token')
                self.refresh_token = token_data.get('refresh_token')
                
                logger.info("✅ Token exchange successful!")
                logger.info(f"🔑 Access token: {self.access_token[:20] if self.access_token else 'None'}...")
                logger.info(f"🆔 ID token: {self.id_token[:20] if self.id_token else 'None'}...")
                return True
            else:
                logger.error(f"❌ Token exchange failed: {response.status_code} - {response.text}")
                return False
                
        except Exception as e:
            logger.error(f"❌ Error in token exchange: {e}")
            return False
    
    def save_tokens(self, filename: str = "auth.json") -> bool:
        """Save authentication tokens to file."""
        try:
            tokens = {
                "access_token": self.access_token,
                "id_token": self.id_token,
                "refresh_token": self.refresh_token,
                "state": self.state,
                "nonce": self.nonce,
                "timestamp": time.time()
            }
            
            with open(filename, 'w') as f:
                json.dump(tokens, f, indent=2)
            
            logger.info(f"💾 Tokens saved to {filename}")
            return True
            
        except Exception as e:
            logger.error(f"❌ Error saving tokens: {e}")
            return False
    
    def execute_login_workflow(self) -> bool:
        """Execute the complete login workflow."""
        logger.info("🚀 Starting Complete Headless Login Workflow")
        logger.info("=" * 50)
        
        try:
            # Step 1: OAuth2 Authorization
            if not self.step1_oauth_authorize():
                return False
            
            # Add delay between steps
            time.sleep(random.uniform(1.0, 2.0))
            
            # Step 2: Device Fingerprinting
            if not self.step2_device_fingerprint():
                return False
            
            # Add delay between steps
            time.sleep(random.uniform(1.0, 2.0))
            
            # Step 3: Device Nonce
            if not self.step3_device_nonce():
                return False
            
            # Add delay between steps
            time.sleep(random.uniform(1.0, 2.0))
            
            # Step 4: Web Login Identify
            if not self.step4_web_login_identify():
                return False
            
            # Add delay between steps
            time.sleep(random.uniform(1.0, 2.0))
            
            # Step 5: Password Challenge
            if not self.step5_challenge_answer():
                return False
            
            # Add delay between steps
            time.sleep(random.uniform(1.0, 2.0))
            
            # Step 6: OAuth Keys
            if not self.step6_oauth_keys():
                return False
            
            # Add delay between steps
            time.sleep(random.uniform(1.0, 2.0))
            
            # Step 7: Token Exchange
            if not self.step7_token_exchange():
                return False
            
            # Save tokens
            self.save_tokens()
            
            logger.info("🎉 Login workflow completed successfully!")
            return True
            
        except Exception as e:
            logger.error(f"❌ Workflow failed: {e}")
            return False
    
    def get_session_info(self) -> Dict[str, Any]:
        """Get current session information."""
        return {
            "cookies": dict(self.session.cookies),
            "headers": dict(self.session.headers),
            "state_token": self.state_token,
            "device_nonce": self.device_nonce,
            "access_token": self.access_token,
            "id_token": self.id_token
        }

def main():
    """Main function to demonstrate the headless login workflow."""
    # Read credentials directly from login.txt file
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
    
    # Create login instance with proxy support
    login = MeijerHeadlessLogin(
        username=username,
        password=password,
        proxy_host="127.0.0.1",
        proxy_port=8080
    )
    
    # Execute workflow
    success = login.execute_login_workflow()
    
    if success:
        print("\n🎉 Login successful! Session info:")
        session_info = login.get_session_info()
        print(json.dumps(session_info, indent=2))
    else:
        print("\n❌ Login failed!")

if __name__ == "__main__":
    main()
