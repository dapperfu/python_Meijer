#!/usr/bin/env python3
"""
Debug script to test IDX identify endpoint and understand why it's still getting 403
even with Selenium cookies.
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
from urllib.parse import urlencode

# Add the current directory to Python path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

# Set up logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger(__name__)

def test_idx_with_different_approaches():
    """Test IDX identify with different approaches to understand the 403 error."""
    
    try:
        from meijer.headless_hybrid_auth import HeadlessHybridAuthenticator
        import requests
    except ImportError as e:
        logger.error(f"❌ Required packages not available: {e}")
        return False
    
    # Read credentials
    login_file = "/keg/cursor/.config/meijer/login.txt"
    try:
        with open(login_file, 'r') as f:
            lines = f.readlines()
            if len(lines) >= 2:
                username = lines[0].strip()
                password = lines[1].strip()
            else:
                logger.error("❌ login.txt must contain username and password on separate lines")
                return False
    except Exception as e:
        logger.error(f"❌ Error reading {login_file}: {e}")
        return False
    
    logger.info(f"🔐 Testing with username: {username}")
    
    # Step 1: Get Selenium cookies and state token
    logger.info("🚀 Step 1: Getting Selenium cookies and state token...")
    
    authenticator = HeadlessHybridAuthenticator(
        username=username,
        password=password,
        headless=True,
        verbose=True
    )
    
    # Just get the session data, don't complete the full flow
    success, session_data = authenticator.bypass_akamai_with_selenium()
    if not success:
        logger.error("❌ Could not get Selenium session data")
        return False
    
    # Step 2: Test IDX identify with different approaches
    logger.info("🔍 Step 2: Testing IDX identify with different approaches...")
    
    # Create requests session with Selenium cookies
    session = authenticator.create_requests_session(session_data['cookies'])
    if not session:
        logger.error("❌ Could not create requests session")
        return False
    
    # Test different approaches
    test_approaches = [
        {
            'name': 'Original Headers',
            'headers': {
                'Accept': 'application/json; okta-version=1.0.0',
                'X-Okta-User-Agent-Extended': 'okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459',
                'X-Device-Fingerprint': f"dummy_nonce|a51183db48a04679a8d3769ee8a151455b09acf91a15ffe9625eeec4f91ad5b7|21c0dae824c3f48f32f5b271e1d291d8",
                'User-Agent': authenticator.user_agent,
                'Content-Type': 'application/json',
                'Origin': authenticator.okta_base,
                'X-Requested-With': 'com.duckduckgo.mobile.android',
                'Sec-Fetch-Site': 'same-origin',
                'Sec-Fetch-Mode': 'cors',
                'Sec-Fetch-Dest': 'empty',
                'Accept-Encoding': 'gzip, deflate',
                'Accept-Language': 'en-US,en;q=0.9'
            }
        },
        {
            'name': 'Simplified Headers',
            'headers': {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'User-Agent': authenticator.user_agent,
                'Origin': authenticator.okta_base,
                'Referer': f"{authenticator.okta_base}/oauth2/default/v1/authorize"
            }
        },
        {
            'name': 'Mobile App Headers',
            'headers': {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'User-Agent': 'Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36',
                'X-Requested-With': 'com.meijer.mobile.meijer',
                'Origin': authenticator.okta_base
            }
        },
        {
            'name': 'Browser Headers',
            'headers': {
                'Accept': 'application/json, text/plain, */*',
                'Content-Type': 'application/json',
                'User-Agent': 'Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0',
                'Origin': authenticator.okta_base,
                'Referer': f"{authenticator.okta_base}/oauth2/default/v1/authorize"
            }
        }
    ]
    
    idx_url = f"{authenticator.okta_base}/idp/idx/identify"
    state_token = session_data['state_token']
    
    logger.info(f"🔐 Testing IDX identify endpoint: {idx_url}")
    logger.info(f"🔑 State token: {state_token[:50]}...")
    
    for approach in test_approaches:
        logger.info(f"\n🧪 Testing approach: {approach['name']}")
        logger.info(f"   Headers: {json.dumps(approach['headers'], indent=2)}")
        
        try:
            # Request body
            data = {
                "identifier": username,
                "stateHandle": state_token
            }
            
            # Make request
            response = session.post(idx_url, headers=approach['headers'], json=data)
            logger.info(f"   Status: {response.status_code}")
            logger.info(f"   Response headers: {dict(response.headers)}")
            
            if response.status_code == 200:
                logger.info("   ✅ SUCCESS! This approach worked!")
                try:
                    response_data = response.json()
                    logger.info(f"   Response: {json.dumps(response_data, indent=2)}")
                    return True
                except json.JSONDecodeError:
                    logger.info(f"   Response text: {response.text[:200]}...")
            else:
                logger.info(f"   ❌ Failed with status {response.status_code}")
                logger.info(f"   Response: {response.text[:200]}...")
                
        except Exception as e:
            logger.error(f"   ❌ Error: {e}")
    
    logger.info("\n❌ All approaches failed")
    return False

def main():
    """Main function."""
    logger.info("🔍 IDX Identify Debug Test")
    logger.info("=" * 50)
    
    success = test_idx_with_different_approaches()
    
    if success:
        logger.info("🎉 Found a working approach for IDX identify!")
    else:
        logger.info("❌ All approaches failed - need deeper investigation")
    
    return success

if __name__ == "__main__":
    main()
