#!/usr/bin/env python3
"""
Test OAuth2 request to debug the 400 error.
"""

import requests
import json
from pathlib import Path

def test_oauth2_request():
    """Test the OAuth2 authorization request."""
    
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
    
    # Add OAuth2 specific headers
    session.headers.update({
        'Referer': config['base_urls']['meijer'],
        'Origin': config['base_urls']['meijer']
    })
    
    # OAuth2 parameters with PKCE
    import uuid
    import secrets
    import base64
    import hashlib
    
    # Generate PKCE parameters
    code_verifier = secrets.token_urlsafe(32)
    code_challenge = base64.urlsafe_b64encode(
        hashlib.sha256(code_verifier.encode()).digest()
    ).decode().rstrip('=')
    
    oauth_params = {
        'client_id': config['oauth2']['client_id'],
        'scope': config['oauth2']['scope'],
        'redirect_uri': config['oauth2']['redirect_uri'],
        'response_type': config['oauth2']['response_type'],
        'state': uuid.uuid4().hex,
        'code_challenge': code_challenge,
        'code_challenge_method': 'S256'
    }
    
    # First, visit Meijer homepage to establish session and cookies
    print("🏠 Step 1: Visiting Meijer homepage to establish session...")
    meijer_response = session.get(config['base_urls']['meijer'])
    print(f"   Meijer homepage status: {meijer_response.status_code}")
    print(f"   Cookies established: {len(session.cookies)}")
    
    # Show important cookies
    important_cookies = ['bm_sz', '_abck', 'bm_sv', 'JSESSIONID', 'AKA_A2']
    for cookie_name in important_cookies:
        if cookie_name in session.cookies:
            print(f"   ✅ {cookie_name}: {session.cookies[cookie_name][:50]}...")
        else:
            print(f"   ❌ {cookie_name}: Not found")
    
    print()
    
    # Now make OAuth2 request
    url = f"{config['base_urls']['okta']}/oauth2/default/v1/authorize"
    
    print(f"🔐 Step 2: Testing OAuth2 request to: {url}")
    print(f"📋 Parameters: {oauth_params}")
    print(f"📋 Headers: {dict(session.headers)}")
    print()
    
    try:
        response = session.get(url, params=oauth_params)
        print(f"📊 Response Status: {response.status_code}")
        print(f"📊 Response Headers: {dict(response.headers)}")
        print(f"📊 Response Size: {len(response.content)} bytes")
        print()
        
        if response.status_code == 200:
            print("✅ OAuth2 request successful!")
            print(f"📄 Response preview: {response.text[:500]}...")
        else:
            print(f"❌ OAuth2 request failed with status {response.status_code}")
            print(f"📄 Error response: {response.text[:500]}...")
            
            # Try to get more details
            if response.status_code == 400:
                print("\n🔍 400 Bad Request - Common causes:")
                print("  - Invalid client_id")
                print("  - Invalid redirect_uri")
                print("  - Missing required parameters")
                print("  - Invalid scope format")
                
    except Exception as e:
        print(f"❌ Error during request: {e}")

if __name__ == "__main__":
    test_oauth2_request()
