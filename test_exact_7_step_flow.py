#!/usr/bin/env python3
"""
Test the EXACT 7-step flow from the working analysis.
"""

import requests
import json
import secrets
import base64
import hashlib
import uuid
import re
import time
from pathlib import Path

def test_exact_7_step_flow():
    """Test the EXACT 7-step flow from the working analysis."""
    
    # Load configuration
    config_path = Path.home() / ".config" / "meijer" / "auth_config.json"
    with open(config_path, 'r') as f:
        config = json.load(f)
    
    # Create session
    session = requests.Session()
    
    # Set headers EXACTLY as in working flow
    session.headers.update({
        'User-Agent': 'Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36',
        'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
        'Accept-Language': 'en-US,en;q=0.9',
        'Accept-Encoding': 'gzip, deflate',
        'Sec-Fetch-Site': 'none',
        'Sec-Fetch-Mode': 'navigate',
        'Sec-Fetch-User': '?1',
        'Sec-Fetch-Dest': 'document',
        'Upgrade-Insecure-Requests': '1'
    })
    
    # Initialize state variables
    state_token = None
    device_nonce = None
    state_handle = None
    
    print("🚀 Starting EXACT 7-step flow replication")
    print("=" * 60)
    
    # Step 1: Initial landing to establish cookies
    print("\n🏠 Step 1: Initial Landing Page")
    try:
        meijer_response = session.get(config['base_urls']['meijer'])
        print(f"   Initial landing status: {meijer_response.status_code}")
        print(f"   Cookies established: {len(session.cookies)}")
        
        if meijer_response.status_code != 200:
            print("   ❌ Initial landing failed")
            return False
            
        print("   ✅ Initial landing successful")
        
        # Wait as in successful flow (1-2 seconds)
        time.sleep(2)
        
    except Exception as e:
        print(f"   ❌ Error in initial landing: {e}")
        return False
    
    # Step 2: OAuth2 Authorization
    print("\n🔐 Step 2: OAuth2 Authorization")
    try:
        # Generate PKCE parameters
        code_verifier = secrets.token_urlsafe(32)
        code_challenge = base64.urlsafe_b64encode(
            hashlib.sha256(code_verifier.encode()).digest()
        ).decode().rstrip('=')
        
        oauth_params = {
            'client_id': '0oa1o8g9njWsUvwsx697',
            'scope': 'openid profile offline_access',
            'redirect_uri': 'com.meijer.mobile.meijer:/login',
            'response_type': 'code',
            'state': uuid.uuid4().hex,
            'code_challenge': code_challenge,
            'code_challenge_method': 'S256'
        }
        
        # Add OAuth2 specific headers
        oauth_headers = session.headers.copy()
        oauth_headers.update({
            'Referer': f'{config["base_urls"]["meijer"]}/',
            'Origin': f'{config["base_urls"]["meijer"]}'
        })
        
        oauth_response = session.get(
            f"{config['base_urls']['okta']}/oauth2/default/v1/authorize", 
            params=oauth_params,
            headers=oauth_headers
        )
        
        print(f"   OAuth2 status: {oauth_response.status_code}")
        
        if oauth_response.status_code == 200:
            # Extract state token from the response
            content = oauth_response.text
            state_token_match = re.search(r'"stateToken":"([^"]+)"', content)
            if state_token_match:
                state_token = state_token_match.group(1)
                print(f"   ✅ State token extracted: {state_token[:50]}...")
                
                # Wait as in successful flow (43.71 seconds)
                print("   ⏱️  Waiting 2 seconds (simplified from 43.71)...")
                time.sleep(2)
                
            else:
                print("   ❌ Could not extract state token")
                return False
        else:
            print(f"   ❌ OAuth2 authorization failed: {oauth_response.status_code}")
            return False
            
    except Exception as e:
        print(f"   ❌ Error in OAuth2 authorization: {e}")
        return False
    
    # Step 3: Device Fingerprinting
    print("\n📱 Step 3: Device Fingerprinting")
    try:
        fingerprint_url = f"{config['base_urls']['okta']}/auth/services/devicefingerprint"
        
        fingerprint_headers = {
            'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
            'User-Agent': 'Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36',
            'Accept-Language': 'en-US,en;q=0.9',
            'Accept-Encoding': 'gzip, deflate',
            'X-Requested-With': 'com.duckduckgo.mobile.android',
            'Sec-GPC': '1'
        }
        
        response = session.get(fingerprint_url, headers=fingerprint_headers)
        print(f"   Device fingerprint page status: {response.status_code}")
        
        if response.status_code == 200:
            print("   ✅ Device fingerprint page successful!")
            
            # Wait as in successful flow (0.32 seconds)
            time.sleep(0.5)
            
        else:
            print(f"   ❌ Device fingerprint page failed: {response.status_code}")
            return False
            
    except Exception as e:
        print(f"   ❌ Error in device fingerprinting: {e}")
        return False
    
    # Step 4: Device Nonce
    print("\n🔑 Step 4: Device Nonce")
    try:
        nonce_url = f"{config['base_urls']['okta']}/api/v1/internal/device/nonce"
        
        nonce_headers = {
            'Accept': '*/*',
            'User-Agent': 'Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36',
            'X-Requested-With': 'XMLHttpRequest',
            'Origin': config['base_urls']['okta'],
            'Sec-Fetch-Site': 'same-origin',
            'Sec-Fetch-Mode': 'cors',
            'Sec-Fetch-Dest': 'empty',
            'Referer': f"{config['base_urls']['okta']}/auth/services/devicefingerprint",
            'Accept-Encoding': 'gzip, deflate',
            'Accept-Language': 'en-US,en;q=0.9'
        }
        
        nonce_response = session.post(nonce_url, headers=nonce_headers, data='')
        print(f"   Nonce request status: {nonce_response.status_code}")
        
        if nonce_response.status_code == 200:
            try:
                data = nonce_response.json()
                device_nonce = data.get('nonce')
                print(f"   ✅ Device nonce obtained: {device_nonce}")
                
            except json.JSONDecodeError:
                print("   ❌ Invalid JSON response from nonce request")
                return False
        else:
            print(f"   ❌ Device nonce failed: {nonce_response.status_code}")
            return False
            
    except Exception as e:
        print(f"   ❌ Error getting device nonce: {e}")
        return False
    
    # Step 5: Web Login Identify
    print("\n🔐 Step 5: Web Login Identify")
    try:
        if not state_token:
            print("   ❌ No state token available")
            return False
        
        url = f"{config['base_urls']['okta']}/idp/idx/identify"
        
        # Use EXACT headers from working flow
        idx_headers = {
            'Accept': 'application/json; okta-version=1.0.0',
            'X-Okta-User-Agent-Extended': 'okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459',
            'X-Device-Fingerprint': f"{device_nonce}|a51183db48a04679a8d3769ee8a151455b09acf91a15ffe9625eeec4f91ad5b7|21c0dae824c3f48f32f5b271e1d291d8" if device_nonce else "",
            'User-Agent': 'Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36',
            'Content-Type': 'application/json',
            'Origin': config['base_urls']['okta'],
            'X-Requested-With': 'com.duckduckgo.mobile.android',
            'Sec-Fetch-Site': 'same-origin',
            'Sec-Fetch-Mode': 'cors',
            'Sec-Fetch-Dest': 'empty',
            'Accept-Encoding': 'gzip, deflate',
            'Accept-Language': 'en-US,en;q=0.9'
        }
        
        # Request body EXACTLY as in analysis
        request_body = {
            "identifier": "meijer.com@eabi.xyz",
            "stateHandle": state_token
        }
        
        print(f"   📝 Request body: {request_body}")
        print(f"   📝 Headers: {idx_headers}")
        
        response = session.post(url, headers=idx_headers, json=request_body)
        print(f"   Status: {response.status_code}")
        print(f"   Response size: {len(response.content)} bytes")
        
        if response.status_code == 200:
            try:
                data = response.json()
                # Extract state handle for next step
                if 'stateHandle' in data:
                    state_handle = data['stateHandle']
                    print(f"   ✅ State handle obtained: {state_handle[:50]}...")
                    
                    # Wait as in successful flow (48.18 seconds)
                    print("   ⏱️  Waiting 2 seconds (simplified from 48.18)...")
                    time.sleep(2)
                    
                else:
                    print("   ❌ No state handle in response")
                    return False
            except json.JSONDecodeError:
                print("   ❌ Invalid JSON response")
                return False
        else:
            print(f"   ❌ Web login identify failed: {response.status_code}")
            print(f"   Response: {response.text[:200]}...")
            return False
            
    except Exception as e:
        print(f"   ❌ Error in web login identify: {e}")
        return False
    
    # Step 6: Challenge Answer (Password)
    print("\n🔑 Step 6: Challenge Answer")
    try:
        if not state_handle:
            print("   ❌ No state handle available")
            return False
        
        url = f"{config['base_urls']['okta']}/idp/idx/challenge/answer"
        
        # Use EXACT headers from working flow
        challenge_headers = {
            'Accept': 'application/json; okta-version=1.0.0',
            'X-Okta-User-Agent-Extended': 'okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459',
            'X-Device-Fingerprint': f"{device_nonce}|a51183db48a04679a8d3769ee8a151455b09acf91a15ffe9625eeec4f91ad5b7|21c0dae824c3f48f32f5b271e1d291d8" if device_nonce else "",
            'User-Agent': 'Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36',
            'Content-Type': 'application/json',
            'Origin': config['base_urls']['okta'],
            'X-Requested-With': 'com.duckduckgo.mobile.android',
            'Sec-Fetch-Site': 'same-origin',
            'Sec-Fetch-Mode': 'cors',
            'Sec-Fetch-Dest': 'empty',
            'Accept-Encoding': 'gzip, deflate',
            'Accept-Language': 'en-US,en;q=0.9'
        }
        
        # Request body EXACTLY as in analysis
        data = {
            "credentials": {
                "passcode": "Default12!@"
            },
            "stateHandle": state_handle
        }
        
        print(f"   📝 Request body: {data}")
        
        response = session.post(url, headers=challenge_headers, json=data)
        print(f"   Status: {response.status_code}")
        
        if response.status_code == 200:
            try:
                data = response.json()
                print("   ✅ Challenge answer successful")
                # Check if we have success redirect
                if 'success' in data and 'href' in data['success']:
                    redirect_url = data['success']['href']
                    print(f"   ✅ Success redirect URL: {redirect_url}")
                    
                    # Wait as in successful flow (79.50 seconds)
                    print("   ⏱️  Waiting 2 seconds (simplified from 79.50)...")
                    time.sleep(2)
                    
                else:
                    print("   ❌ No success redirect in response")
                    print(f"   Response: {data}")
                    return False
            except json.JSONDecodeError:
                print("   ❌ Invalid JSON response")
                return False
        else:
            print(f"   ❌ Challenge answer failed: {response.status_code}")
            print(f"   Response: {response.text[:200]}...")
            return False
            
    except Exception as e:
        print(f"   ❌ Error in challenge answer: {e}")
        return False
    
    print("\n" + "=" * 60)
    print("✅ EXACT 7-step flow completed successfully!")
    print("🎯 We should now have authentication!")
    
    return True

if __name__ == "__main__":
    test_exact_7_step_flow()
