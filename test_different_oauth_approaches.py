#!/usr/bin/env python3
"""
Test different OAuth2 approaches to find the working one.
"""

import requests
import json
import secrets
import base64
import hashlib
import uuid
from pathlib import Path

def test_oauth2_approaches():
    """Test different OAuth2 approaches."""
    
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
    
    # Test different OAuth2 approaches
    approaches = [
        {
            "name": "Standard OAuth2 with PKCE",
            "url": f"{config['base_urls']['okta']}/oauth2/default/v1/authorize",
            "params": {
                'client_id': config['oauth2']['client_id'],
                'scope': config['oauth2']['scope'],
                'redirect_uri': config['base_urls']['meijer'],
                'response_type': 'code',
                'state': uuid.uuid4().hex,
                'code_challenge': base64.urlsafe_b64encode(
                    hashlib.sha256(secrets.token_urlsafe(32).encode()).digest()
                ).decode().rstrip('='),
                'code_challenge_method': 'S256'
            }
        },
        {
            "name": "OAuth2 without PKCE",
            "url": f"{config['base_urls']['okta']}/oauth2/default/v1/authorize",
            "params": {
                'client_id': config['oauth2']['client_id'],
                'scope': config['oauth2']['scope'],
                'redirect_uri': config['base_urls']['meijer'],
                'response_type': 'code',
                'state': uuid.uuid4().hex
            }
        },
        {
            "name": "OAuth2 with mobile redirect URI",
            "url": f"{config['base_urls']['okta']}/oauth2/default/v1/authorize",
            "params": {
                'client_id': config['oauth2']['client_id'],
                'scope': config['oauth2']['scope'],
                'redirect_uri': 'com.meijer.mobile.meijer:/login',
                'response_type': 'code',
                'state': uuid.uuid4().hex,
                'code_challenge': base64.urlsafe_b64encode(
                    hashlib.sha256(secrets.token_urlsafe(32).encode()).digest()
                ).decode().rstrip('='),
                'code_challenge_method': 'S256'
            }
        },
        {
            "name": "Try IDX flow directly",
            "url": f"{config['base_urls']['okta']}/idp/idx",
            "params": {},
            "method": "GET"
        },
        {
            "name": "Try OAuth2 authorize with different scope",
            "url": f"{config['base_urls']['okta']}/oauth2/default/v1/authorize",
            "params": {
                'client_id': config['oauth2']['client_id'],
                'scope': 'openid',
                'redirect_uri': config['base_urls']['meijer'],
                'response_type': 'code',
                'state': uuid.uuid4().hex,
                'code_challenge': base64.urlsafe_b64encode(
                    hashlib.sha256(secrets.token_urlsafe(32).encode()).digest()
                ).decode().rstrip('='),
                'code_challenge_method': 'S256'
            }
        }
    ]
    
    for i, approach in enumerate(approaches, 1):
        print(f"🔍 Test {i}: {approach['name']}")
        print(f"   URL: {approach['url']}")
        print(f"   Method: {approach.get('method', 'GET')}")
        print(f"   Parameters: {approach['params']}")
        
        try:
            if approach.get('method') == 'GET':
                response = session.get(approach['url'], params=approach['params'])
            else:
                response = session.get(approach['url'], params=approach['params'])
            
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
                else:
                    print("   💡 Other 400 error")
            else:
                print(f"   ⚠️  Got status {response.status_code}")
            
        except Exception as e:
            print(f"   ❌ Error: {e}")
        
        print()

if __name__ == "__main__":
    test_oauth2_approaches()
