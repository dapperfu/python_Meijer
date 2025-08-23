#!/usr/bin/env python3
"""
Step-by-Step Authentication Flow Analysis
This script performs each authentication step individually and analyzes the responses
through the mitmproxy at 127.0.0.1:8080 for detailed flow analysis.
"""

import requests
import json
import time
import random
import base64
import hashlib
import secrets
from urllib.parse import urlencode, parse_qs, urlparse
from typing import Dict, Any, Optional, Tuple
import logging

# Configure logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger(__name__)

class StepByStepAuthAnalysis:
    def __init__(self):
        # Configure session with proxy
        self.session = requests.Session()
        self.session.proxies = {
            'http': 'http://127.0.0.1:8080',
            'https': 'http://127.0.0.1:8080'
        }
        # Disable SSL verification for mitmproxy
        self.session.verify = False
        
        # Base URLs
        self.base_url = "https://id.meijer.com"
        self.oauth_url = f"{self.base_url}/oauth2/default/v1"
        
        # OAuth parameters
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
        
        # Load credentials
        self.username, self.password = self.load_credentials()
        
    def load_credentials(self) -> Tuple[str, str]:
        """Load credentials from login.txt file."""
        login_file = "/keg/cursor/.config/meijer/login.txt"
        try:
            with open(login_file, 'r') as f:
                lines = f.readlines()
                if len(lines) >= 2:
                    username = lines[0].strip()
                    password = lines[1].strip()
                    logger.info(f"✅ Credentials loaded: {username}")
                    return username, password
                else:
                    raise ValueError("login.txt must contain username and password on separate lines")
        except Exception as e:
            logger.error(f"❌ Error loading credentials: {e}")
            raise
    
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
    
    def step1_oauth_authorize(self) -> Dict[str, Any]:
        """Step 1: OAuth2 authorization request - analyze the flow."""
        logger.info("🔐 STEP 1: OAuth2 Authorization Request")
        logger.info("=" * 50)
        
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
        
        # Make request
        response = self.session.get(auth_url, allow_redirects=True)
        
        # Analyze response
        analysis = {
            'step': 'oauth_authorize',
            'url': auth_url,
            'method': 'GET',
            'status_code': response.status_code,
            'response_headers': dict(response.headers),
            'cookies': dict(self.session.cookies),
            'final_url': response.url,
            'content_length': len(response.content),
            'content_type': response.headers.get('content-type', ''),
            'success': response.status_code == 200
        }
        
        logger.info(f"📊 Response Analysis:")
        logger.info(f"   Status: {response.status_code}")
        logger.info(f"   Final URL: {response.url}")
        logger.info(f"   Content Length: {len(response.content)}")
        logger.info(f"   Content Type: {response.headers.get('content-type', '')}")
        logger.info(f"   Cookies: {len(self.session.cookies)}")
        
        # Show cookies
        for cookie in self.session.cookies:
            logger.info(f"   🍪 {cookie.name}: {cookie.value[:50]}...")
        
        return analysis
    
    def step2_device_fingerprint(self) -> Dict[str, Any]:
        """Step 2: Device fingerprinting page - analyze the flow."""
        logger.info("🔍 STEP 2: Device Fingerprinting")
        logger.info("=" * 50)
        
        fingerprint_url = f"{self.base_url}/auth/services/devicefingerprint"
        logger.info(f"🔗 Fingerprint URL: {fingerprint_url}")
        
        # Make request
        response = self.session.get(fingerprint_url)
        
        # Analyze response
        analysis = {
            'step': 'device_fingerprint',
            'url': fingerprint_url,
            'method': 'GET',
            'status_code': response.status_code,
            'response_headers': dict(response.headers),
            'cookies': dict(self.session.cookies),
            'content_length': len(response.content),
            'content_type': response.headers.get('content-type', ''),
            'success': response.status_code == 200
        }
        
        logger.info(f"📊 Response Analysis:")
        logger.info(f"   Status: {response.status_code}")
        logger.info(f"   Content Length: {len(response.content)}")
        logger.info(f"   Content Type: {response.headers.get('content-type', '')}")
        logger.info(f"   Cookies: {len(self.session.cookies)}")
        
        # Add delay to simulate JavaScript execution
        delay = random.uniform(1.0, 2.0)
        logger.info(f"⏸️ Adding {delay:.1f}s delay to simulate JavaScript execution...")
        time.sleep(delay)
        
        return analysis
    
    def step3_device_nonce(self) -> Dict[str, Any]:
        """Step 3: Get device nonce - analyze the flow."""
        logger.info("🔑 STEP 3: Device Nonce Request")
        logger.info("=" * 50)
        
        nonce_url = f"{self.base_url}/api/v1/internal/device/nonce"
        logger.info(f"🔗 Nonce URL: {nonce_url}")
        
        # Headers from successful flow
        headers = {
            'X-Requested-With': 'XMLHttpRequest',
            'Origin': self.base_url,
            'Referer': f"{self.base_url}/auth/services/devicefingerprint"
        }
        
        # Make request
        response = self.session.post(nonce_url, headers=headers)
        
        # Analyze response
        analysis = {
            'step': 'device_nonce',
            'url': nonce_url,
            'method': 'POST',
            'status_code': response.status_code,
            'request_headers': headers,
            'response_headers': dict(response.headers),
            'cookies': dict(self.session.cookies),
            'content_length': len(response.content),
            'content_type': response.headers.get('content-type', ''),
            'success': response.status_code == 200
        }
        
        if response.status_code == 200:
            try:
                nonce_data = response.json()
                self.device_nonce = nonce_data.get('nonce')
                logger.info(f"✅ Device nonce received: {self.device_nonce[:20]}...")
                analysis['nonce'] = self.device_nonce
            except:
                logger.warning("⚠️ Could not parse nonce response as JSON")
        else:
            logger.error(f"❌ Nonce request failed: {response.status_code}")
            analysis['error_response'] = response.text[:500]
        
        logger.info(f"📊 Response Analysis:")
        logger.info(f"   Status: {response.status_code}")
        logger.info(f"   Content Length: {len(response.content)}")
        logger.info(f"   Content Type: {response.headers.get('content-type', '')}")
        
        return analysis
    
    def step4_web_login_identify(self) -> Dict[str, Any]:
        """Step 4: Web login identify - analyze the flow."""
        logger.info("👤 STEP 4: Web Login Identify")
        logger.info("=" * 50)
        
        identify_url = f"{self.base_url}/idp/idx/identify"
        logger.info(f"🔗 Identify URL: {identify_url}")
        
        # Headers from successful flow
        headers = {
            'X-Requested-With': 'XMLHttpRequest',
            'Origin': self.base_url,
            'Referer': f"{self.base_url}/auth/services/devicefingerprint",
            'Content-Type': 'application/json'
        }
        
        # Payload
        payload = {
            "identifier": self.username,
            "rememberMe": False,
            "stateToken": None
        }
        
        logger.info(f"📤 Request Payload: {json.dumps(payload, indent=2)}")
        
        # Make request
        response = self.session.post(identify_url, headers=headers, json=payload)
        
        # Analyze response
        analysis = {
            'step': 'web_login_identify',
            'url': identify_url,
            'method': 'POST',
            'status_code': response.status_code,
            'request_headers': headers,
            'request_payload': payload,
            'response_headers': dict(response.headers),
            'cookies': dict(self.session.cookies),
            'content_length': len(response.content),
            'content_type': response.headers.get('content-type', ''),
            'success': response.status_code == 200
        }
        
        logger.info(f"📊 Response Analysis:")
        logger.info(f"   Status: {response.status_code}")
        logger.info(f"   Content Length: {len(response.content)}")
        logger.info(f"   Content Type: {response.headers.get('content-type', '')}")
        
        if response.status_code == 200:
            try:
                identify_data = response.json()
                self.state_token = identify_data.get('stateToken')
                logger.info(f"✅ Identify successful, state token: {self.state_token[:20] if self.state_token else 'None'}...")
                analysis['state_token'] = self.state_token
            except:
                logger.warning("⚠️ Could not parse identify response as JSON")
        else:
            logger.error(f"❌ Identify failed: {response.status_code}")
            analysis['error_response'] = response.text[:500]
        
        return analysis
    
    def analyze_all_steps(self) -> Dict[str, Any]:
        """Analyze all authentication steps and return comprehensive analysis."""
        logger.info("🚀 Starting Step-by-Step Authentication Flow Analysis")
        logger.info("=" * 60)
        
        analysis_results = {}
        
        try:
            # Step 1: OAuth2 Authorization
            analysis_results['step1'] = self.step1_oauth_authorize()
            time.sleep(random.uniform(1.0, 2.0))
            
            # Step 2: Device Fingerprinting
            analysis_results['step2'] = self.step2_device_fingerprint()
            time.sleep(random.uniform(1.0, 2.0))
            
            # Step 3: Device Nonce
            analysis_results['step3'] = self.step3_device_nonce()
            time.sleep(random.uniform(1.0, 2.0))
            
            # Step 4: Web Login Identify
            analysis_results['step4'] = self.step4_web_login_identify()
            
            # Overall analysis
            analysis_results['summary'] = {
                'total_steps': 4,
                'successful_steps': sum(1 for step in analysis_results.values() if isinstance(step, dict) and step.get('success', False)),
                'failed_steps': sum(1 for step in analysis_results.values() if isinstance(step, dict) and not step.get('success', False)),
                'final_status': 'success' if analysis_results['step4'].get('success', False) else 'failed',
                'timestamp': time.time()
            }
            
            logger.info("📊 Analysis Complete!")
            logger.info(f"   Total Steps: {analysis_results['summary']['total_steps']}")
            logger.info(f"   Successful: {analysis_results['summary']['successful_steps']}")
            logger.info(f"   Failed: {analysis_results['summary']['failed_steps']}")
            logger.info(f"   Final Status: {analysis_results['summary']['final_status']}")
            
        except Exception as e:
            logger.error(f"❌ Analysis failed: {e}")
            analysis_results['error'] = str(e)
        
        return analysis_results
    
    def save_analysis(self, analysis: Dict[str, Any], filename: str = None) -> str:
        """Save analysis results to JSON file."""
        if filename is None:
            timestamp = int(time.time())
            filename = f"auth_flow_analysis_{timestamp}.json"
        
        try:
            with open(filename, 'w') as f:
                json.dump(analysis, f, indent=2)
            logger.info(f"💾 Analysis saved to {filename}")
            return filename
        except Exception as e:
            logger.error(f"❌ Error saving analysis: {e}")
            return None

def main():
    """Main function to run the step-by-step analysis."""
    try:
        # Create analyzer
        analyzer = StepByStepAuthAnalysis()
        
        # Run analysis
        analysis = analyzer.analyze_all_steps()
        
        # Save results
        filename = analyzer.save_analysis(analysis)
        
        if filename:
            print(f"\n🎯 Analysis complete! Results saved to: {filename}")
            print("📊 Check the mitmproxy logs for detailed HTTP flow analysis")
        else:
            print("\n❌ Analysis failed to save")
            
    except Exception as e:
        print(f"❌ Analysis failed: {e}")

if __name__ == "__main__":
    main()
