#!/usr/bin/env python3
"""
Test different OAuth2 scope combinations to find the valid one.
"""

import requests
import json
import secrets
import base64
import hashlib
import uuid
from pathlib import Path

def test_scope_combinations():
    """Test different OAuth2 scope combinations."""
    
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
    
    # Test different scope combinations
    scope_combinations = [
        "openid",
        "openid profile",
        "openid email",
        "openid profile email",
        "openid offline_access",
        "openid profile offline_access",
        "openid email offline_access",
        "profile",
        "email",
        "offline_access"
    ]
    
    for i, scope in enumerate(scope_combinations, 1):
        print(f"🔍 Test {i}: Scope = '{scope}'")
        
        # Generate PKCE parameters
        code_verifier = secrets.token_urlsafe(32)
        code_challenge = base64.urlsafe_b64encode(
            hashlib.sha256(code_verifier.encode()).digest()
        ).decode().rstrip('=')
        
        params = {
            'client_id': config['oauth2']['client_id'],
            'scope': scope,
            'redirect_uri': 'com.meijer.mobile.meijer:/login',
            'response_type': 'code',
            'state': uuid.uuid4().hex,
            'code_challenge': code_challenge,
            'code_challenge_method': 'S256'
        }
        
        print(f"   Parameters: {params}")
        
        try:
            response = session.get(f"{config['base_urls']['okta']}/oauth2/default/v1/authorize", params=params)
            
            print(f"   Status: {response.status_code}")
            print(f"   Response Size: {len(response.content)} bytes")
            
            if response.status_code == 200:
                print("   ✅ SUCCESS! Got 200 response")
                print(f"   Content preview: {response.text[:200]}...")
                if 'login' in response.text.lower() or 'signin' in response.text.lower():
                    print("   🎯 This looks like a login page!")
                break
            elif response.status_code == 302:
                print("   🔄 Got redirect - this might be working!")
                print(f"   Location: {response.headers.get('Location', 'None')}")
                break
            elif response.status_code == 400:
                print("   ❌ Still getting 400 error")
                if 'PKCE' in response.text:
                    print("   💡 PKCE error detected")
                elif 'invalid_request' in response.text:
                    print("   💡 Invalid request error")
                elif 'invalid_scope' in response.text:
                    print("   💡 Invalid scope error")
                    # Extract error description
                    if 'error_description' in response.text:
                        import re
                        match = re.search(r'error_description=([^&]+)', response.text)
                        if match:
                            error_desc = match.group(1).replace('+', ' ')
                            print(f"   📝 Error: {error_desc}")
                else:
                    print("   💡 Other 400 error")
            else:
                print(f"   ⚠️  Got status {response.status_code}")
            
        except Exception as e:
            print(f"   ❌ Error: {e}")
        
        print()

if __name__ == "__main__":
    test_scope_combinations()
