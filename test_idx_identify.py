#!/usr/bin/env python3
"""
Test the IDX identify step to debug the 403 error.
"""

import requests
import json
import secrets
import base64
import hashlib
import uuid
import re
from pathlib import Path

def test_idx_identify():
    """Test the IDX identify step."""
    
    # Load configuration
    config_path = Path.home() / ".config" / "meijer" / "auth_config.json"
    with open(config_path, 'r') as f:
        config = json.load(f)
    
    # Create session
    session = requests.Session()
    
    # Set headers
    session.headers.update({
        'User-Agent': config['user_agent']
    })
    
    # Add default headers
    default_headers = config['headers']['default']
    session.headers.update(default_headers)
    
    # First, visit Meijer homepage to establish session and cookies
    print("🏠 Step 1: Visiting Meijer homepage to establish session...")
    meijer_response = session.get(config['base_urls']['meijer'])
    print(f"   Meijer homepage status: {meijer_response.status_code}")
    print(f"   Cookies established: {len(session.cookies)}")
    
    print()
    
    # Make OAuth2 request to get state token
    print("🔐 Step 2: Making OAuth2 authorization request to get state token...")
    
    # Generate PKCE parameters
    code_verifier = secrets.token_urlsafe(32)
    code_challenge = base64.urlsafe_b64encode(
        hashlib.sha256(code_verifier.encode()).digest()
    ).decode().rstrip('=')
    
    oauth_params = {
        'client_id': '0oa1o8g9njWsUvwsx697',
        'scope': 'openid',
        'redirect_uri': 'com.meijer.mobile.meijer:/login',
        'response_type': 'code',
        'state': uuid.uuid4().hex,
        'code_challenge': code_challenge,
        'code_challenge_method': 'S256'
    }
    
    oauth_response = session.get(f"{config['base_urls']['okta']}/oauth2/default/v1/authorize", params=oauth_params)
    print(f"   OAuth2 status: {oauth_response.status_code}")
    
    if oauth_response.status_code == 200:
        print("   ✅ OAuth2 request successful!")
        
        # Extract state token
        content = oauth_response.text
        state_token_match = re.search(r'"stateToken":"([^"]+)"', content)
        if state_token_match:
            state_token = state_token_match.group(1)
            print(f"   ✅ Extracted state token: {state_token[:50]}...")
            
            # Now test IDX identify
            print("\n🔐 Step 3: Testing IDX identify with extracted state token...")
            
            # Test different header combinations
            header_combinations = [
                {
                    "name": "Basic identify headers only",
                    "headers": {
                        'Accept': 'application/ion+json; okta-version=1.0.0',
                        'X-Okta-User-Agent-Extended': 'okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459',
                        'Content-Type': 'application/ion+json; okta-version=1.0.0',
                        'Accept-Language': 'en-US,en;q=0.5',
                        'Accept-Encoding': 'gzip, deflate, br, zstd'
                    }
                },
                {
                    "name": "With Origin and Referer",
                    "headers": {
                        'Accept': 'application/ion+json; okta-version=1.0.0',
                        'X-Okta-User-Agent-Extended': 'okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459',
                        'Content-Type': 'application/ion+json; okta-version=1.0.0',
                        'Accept-Language': 'en-US,en;q=0.5',
                        'Accept-Encoding': 'gzip, deflate, br, zstd',
                        'Origin': 'https://id.meijer.com',
                        'Referer': 'https://id.meijer.com/oauth2/default/v1/authorize'
                    }
                },
                {
                    "name": "With all headers including User-Agent",
                    "headers": {
                        'User-Agent': config['user_agent'],
                        'Accept': 'application/ion+json; okta-version=1.0.0',
                        'X-Okta-User-Agent-Extended': 'okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459',
                        'Content-Type': 'application/ion+json; okta-version=1.0.0',
                        'Accept-Language': 'en-US,en;q=0.5',
                        'Accept-Encoding': 'gzip, deflate, br, zstd',
                        'Origin': 'https://id.meijer.com',
                        'Referer': 'https://id.meijer.com/oauth2/default/v1/authorize'
                    }
                }
            ]
            
            for i, combo in enumerate(header_combinations, 1):
                print(f"\n   🔍 Test {i}: {combo['name']}")
                print(f"      Headers: {combo['headers']}")
                
                # Prepare request body
                request_body = {
                    "identifier": "meijer.com@eabi.xyz",
                    "stateHandle": state_token
                }
                
                try:
                    response = session.post(
                        f"{config['base_urls']['okta']}/idp/idx/identify",
                        headers=combo['headers'],
                        json=request_body
                    )
                    
                    print(f"      Status: {response.status_code}")
                    print(f"      Response size: {len(response.content)} bytes")
                    
                    if response.status_code == 200:
                        print("      ✅ SUCCESS! Got 200 response")
                        print(f"      Response: {response.text[:200]}...")
                        break
                    elif response.status_code == 403:
                        print("      ❌ Still getting 403 Access Denied")
                        print(f"      Response: {response.text[:200]}...")
                    else:
                        print(f"      ⚠️  Got status {response.status_code}")
                        print(f"      Response: {response.text[:200]}...")
                        
                except Exception as e:
                    print(f"      ❌ Error: {e}")
            
        else:
            print("   ❌ Could not extract state token")
    else:
        print(f"   ❌ OAuth2 request failed: {oauth_response.status_code}")

if __name__ == "__main__":
    test_idx_identify()
