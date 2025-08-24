#!/usr/bin/env python3
"""
Debug session state and cookies between requests.
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

def test_session_debug():
    """Debug session state and cookies between requests."""
    
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
    
    print("🚀 Starting session debug test")
    print("=" * 60)
    
    # Step 1: Initial landing to establish cookies
    print("\n🏠 Step 1: Initial Landing Page")
    try:
        meijer_response = session.get(config['base_urls']['meijer'])
        print(f"   Initial landing status: {meijer_response.status_code}")
        print(f"   Cookies established: {len(session.cookies)}")
        
        # Show all cookies
        print("   🍪 Cookies after landing:")
        for cookie in session.cookies:
            print(f"      {cookie.name}: {cookie.value[:50]}...")
        
        if meijer_response.status_code != 200:
            print("   ❌ Initial landing failed")
            return False
            
        print("   ✅ Initial landing successful")
        
        # Wait as in successful flow
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
        
        print(f"   📝 OAuth2 params: {oauth_params}")
        print(f"   📝 OAuth2 headers: {oauth_headers}")
        
        oauth_response = session.get(
            f"{config['base_urls']['okta']}/oauth2/default/v1/authorize", 
            params=oauth_params,
            headers=oauth_headers
        )
        
        print(f"   OAuth2 status: {oauth_response.status_code}")
        print(f"   OAuth2 response size: {len(oauth_response.content)} bytes")
        
        # Show cookies after OAuth2
        print(f"   🍪 Cookies after OAuth2: {len(session.cookies)}")
        for cookie in session.cookies:
            print(f"      {cookie.name}: {cookie.value[:50]}...")
        
        if oauth_response.status_code == 200:
            # Extract state token from the response
            content = oauth_response.text
            state_token_match = re.search(r'"stateToken":"([^"]+)"', content)
            if state_token_match:
                state_token = state_token_match.group(1)
                print(f"   ✅ State token extracted: {state_token[:50]}...")
                
                # Look for other potential state tokens
                print("   🔍 Looking for other state tokens in OAuth2 response...")
                state_patterns = [
                    r'"stateHandle":"([^"]+)"',
                    r'stateHandle["\']?\s*:\s*["\']([^"\']+)["\']',
                    r'data-state["\']?\s*=\s*["\']([^"\']+)["\']',
                    r'data-statehandle["\']?\s*=\s*["\']([^"\']+)["\']'
                ]
                
                for pattern in state_patterns:
                    matches = re.findall(pattern, content, re.IGNORECASE)
                    for match in matches:
                        if match and match != state_token:
                            print(f"      ✅ Found additional token: {match[:50]}...")
                
                # Wait as in successful flow
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
    
    # Step 3: Try to access the OAuth2 response page directly to see what's there
    print("\n🔍 Step 3: Analyzing OAuth2 response page")
    try:
        # The OAuth2 response should contain a login form
        # Let's look for form elements
        content = oauth_response.text
        
        # Look for form action
        form_action_match = re.search(r'<form[^>]*action=["\']([^"\']+)["\']', content)
        if form_action_match:
            form_action = form_action_match.group(1)
            print(f"   ✅ Found form action: {form_action}")
        else:
            print("   ❌ No form action found")
        
        # Look for username field
        username_field = re.search(r'<input[^>]*name=["\']([^"\']*username[^"\']*)["\']', content)
        if username_field:
            print(f"   ✅ Found username field: {username_field.group(1)}")
        else:
            print("   ❌ No username field found")
        
        # Look for password field
        password_field = re.search(r'<input[^>]*name=["\']([^"\']*password[^"\']*)["\']', content)
        if password_field:
            print(f"   ✅ Found password field: {password_field.group(1)}")
        else:
            print("   ❌ No password field found")
        
        # Look for hidden fields
        hidden_fields = re.findall(r'<input[^>]*type=["\']hidden["\'][^>]*name=["\']([^"\']+)["\'][^>]*value=["\']([^"\']+)["\']', content)
        if hidden_fields:
            print(f"   📝 Found {len(hidden_fields)} hidden fields:")
            for field_name, field_value in hidden_fields:
                print(f"      {field_name}: {field_value[:50]}...")
        else:
            print("   ❌ No hidden fields found")
        
        # Look for any URLs that might be the next step
        urls = re.findall(r'https?://[^\s"\'<>]+', content)
        idx_urls = [url for url in urls if 'idx' in url or 'identify' in url]
        if idx_urls:
            print(f"   🔗 Found {len(idx_urls)} potential IDX URLs:")
            for url in idx_urls:
                print(f"      {url}")
        else:
            print("   ❌ No IDX URLs found")
            
    except Exception as e:
        print(f"   ❌ Error analyzing OAuth2 response: {e}")
    
    # Step 4: Try to submit login form directly to OAuth2 endpoint
    print("\n🔐 Step 4: Trying direct form submission to OAuth2")
    try:
        if 'state_token' in locals():
            # Try to submit the login form directly to the OAuth2 endpoint
            login_data = {
                'username': 'meijer.com@eabi.xyz',
                'password': 'Default12!@',
                'stateToken': state_token
            }
            
            print(f"   📝 Login data: {login_data}")
            
            # Try POST to OAuth2 authorize
            response = session.post(
                f"{config['base_urls']['okta']}/oauth2/default/v1/authorize",
                data=login_data,
                headers=session.headers
            )
            
            print(f"   Direct OAuth2 login status: {response.status_code}")
            print(f"   Response size: {len(response.content)} bytes")
            
            if response.status_code == 200:
                print("   ✅ SUCCESS! Got 200 response")
                if 'verification' in response.text.lower() or 'challenge' in response.text.lower():
                    print("   🎯 This looks like a 2FA/verification page!")
                elif 'account' in response.text.lower() or 'dashboard' in response.text.lower():
                    print("   🎯 This looks like a successful login!")
                else:
                    print(f"   📄 Response preview: {response.text[:200]}...")
            elif response.status_code == 302:
                print("   🔄 Got redirect - this might be working!")
                print(f"   Location: {response.headers.get('Location', 'None')}")
            else:
                print(f"   ⚠️  Got status {response.status_code}")
                print(f"   Response: {response.text[:200]}...")
                
        else:
            print("   ❌ No state token available")
            
    except Exception as e:
        print(f"   ❌ Error in direct form submission: {e}")
    
    print("\n" + "=" * 60)
    print("🔍 Session debug completed")
    
    return True

if __name__ == "__main__":
    test_session_debug()
