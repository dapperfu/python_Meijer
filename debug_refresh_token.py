#!/usr/bin/env python3
"""
Debug Refresh Token Issues
==========================

Test different approaches to refresh token usage to understand
why the current implementation is failing.
"""

import requests
from old.meijer_comprehensive import read_oauth_auth_file
import json

def test_refresh_approaches():
    """Test different refresh token approaches."""
    print("🔍 Debug: Testing Different Refresh Token Approaches")
    print("=" * 55)
    
    # Load tokens
    try:
        access_token, refresh_token, user_agent, expires_in, scope = read_oauth_auth_file()
        print(f"📋 Loaded tokens:")
        print(f"   Access Token: {access_token[:30]}...{access_token[-15:]}")
        print(f"   Refresh Token: {refresh_token[:20]}...{refresh_token[-10:]}")
        print(f"   Scope: {scope}")
    except Exception as e:
        print(f"❌ Failed to load tokens: {e}")
        return
    
    token_url = "https://id.meijer.com/oauth2/default/v1/token"
    
    # Test different approaches
    approaches = [
        {
            "name": "Approach 1: PKCE Public Client (minimal)",
            "data": {
                'grant_type': 'refresh_token',
                'refresh_token': refresh_token,
                'client_id': '0oa1o8g9njWsUvwsx697'
            }
        },
        {
            "name": "Approach 2: With scope",
            "data": {
                'grant_type': 'refresh_token',
                'refresh_token': refresh_token,
                'client_id': '0oa1o8g9njWsUvwsx697',
                'scope': 'openid offline_access profile'
            }
        },
        {
            "name": "Approach 3: Minimal (no client_id)",
            "data": {
                'grant_type': 'refresh_token',
                'refresh_token': refresh_token
            }
        },
        {
            "name": "Approach 4: With redirect_uri",
            "data": {
                'grant_type': 'refresh_token',
                'refresh_token': refresh_token,
                'client_id': '0oa1o8g9njWsUvwsx697',
                'redirect_uri': 'com.meijer.mobile.meijer:/login'
            }
        }
    ]
    
    headers = {
        'Accept': 'application/json',
        'Content-Type': 'application/x-www-form-urlencoded',
        'User-Agent': user_agent,
        'Accept-Encoding': 'gzip'
    }
    
    for i, approach in enumerate(approaches, 1):
        print(f"\n🧪 Testing {approach['name']}")
        print(f"   Data: {approach['data']}")
        
        try:
            response = requests.post(token_url, data=approach['data'], headers=headers)
            print(f"   Status: {response.status_code}")
            
            if response.status_code == 200:
                token_data = response.json()
                print(f"   ✅ SUCCESS!")
                print(f"   New Access Token: {token_data.get('access_token', '')[:30]}...")
                if 'refresh_token' in token_data:
                    print(f"   New Refresh Token: {token_data['refresh_token'][:20]}...")
                return token_data
            else:
                print(f"   ❌ Failed")
                try:
                    error_data = response.json()
                    print(f"   Error: {error_data}")
                except:
                    print(f"   Raw Response: {response.text[:200]}...")
                    
        except Exception as e:
            print(f"   ❌ Exception: {e}")
    
    print(f"\n🔍 Additional Debug Information:")
    
    # Check if the access token is still valid
    print(f"\n📊 Testing current access token validity...")
    test_headers = {
        'Authorization': f'Bearer {access_token}',
        'ocp-apim-subscription-key': 'a10bc58ac484478d9b3958b1742c3a03',
        'Accept-Encoding': 'gzip',
        'Accept': 'application/meijer.shoppingList.ShoppingList-v1.0+json',
        'User-Agent': user_agent
    }
    
    try:
        test_response = requests.get("https://api.meijer.com/loyalty/shoppinglist/GetList", 
                                   headers=test_headers)
        print(f"   Current token status: {test_response.status_code}")
        if test_response.status_code == 401:
            print(f"   ✅ Current token is expired (as expected for testing)")
        elif test_response.status_code == 200:
            print(f"   ⚠️  Current token is still valid")
        else:
            print(f"   ❓ Unexpected status: {test_response.text[:100]}...")
    except Exception as e:
        print(f"   ❌ Token test failed: {e}")
    
    # Try to decode the refresh token if it's a JWT
    print(f"\n🔍 Analyzing refresh token structure...")
    if '.' in refresh_token:
        print(f"   Refresh token appears to be JWT format")
        try:
            import base64
            parts = refresh_token.split('.')
            if len(parts) >= 2:
                # Try to decode header
                header_padding = len(parts[0]) % 4
                if header_padding:
                    header_padded = parts[0] + '=' * (4 - header_padding)
                else:
                    header_padded = parts[0]
                
                header = json.loads(base64.urlsafe_b64decode(header_padded))
                print(f"   JWT Header: {header}")
        except Exception as e:
            print(f"   Could not decode as JWT: {e}")
    else:
        print(f"   Refresh token appears to be opaque token")
    
    print(f"\n❌ All refresh approaches failed!")
    print(f"💡 This suggests:")
    print(f"   1. The Okta configuration doesn't allow refresh tokens")
    print(f"   2. Additional authentication is required (client secret/certificate)")
    print(f"   3. The refresh token may have expired or been revoked")
    print(f"   4. Different endpoint or parameters are needed")

def main():
    """Main debug function."""
    test_refresh_approaches()

if __name__ == "__main__":
    main() 