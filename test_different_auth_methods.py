#!/usr/bin/env python3
"""
Test Different Authentication Methods for Refresh Tokens
========================================================

Based on APK analysis, test different ways to authenticate the refresh token request.
The Okta AuthFoundation library may require specific authentication methods.
"""

import requests
import base64
import json
import datetime
from old.meijer_comprehensive import read_oauth_auth_file

def test_different_auth_methods():
    """Test different authentication methods for refresh tokens."""
    print("🔍 Testing Different Authentication Methods for Refresh")
    print("=" * 58)
    
    # Load tokens
    try:
        access_token, refresh_token, user_agent, expires_in, scope = read_oauth_auth_file()
        print(f"📋 Loaded tokens:")
        print(f"   Refresh Token: {refresh_token[:20]}...{refresh_token[-10:]}")
    except Exception as e:
        print(f"❌ Failed to load tokens: {e}")
        return
    
    token_url = "https://id.meijer.com/oauth2/default/v1/token"
    client_id = '0oa1o8g9njWsUvwsx697'
    
    # Test different authentication methods
    methods = [
        {
            "name": "Method 1: Public Client (Current)",
            "data": {
                'grant_type': 'refresh_token',
                'refresh_token': refresh_token,
                'client_id': client_id,
                'scope': 'openid offline_access profile'
            },
            "headers": {
                'Accept': 'application/json',
                'Content-Type': 'application/x-www-form-urlencoded',
                'User-Agent': user_agent,
                'Accept-Encoding': 'gzip'
            }
        },
        {
            "name": "Method 2: Basic Auth (Empty Client Secret)",
            "data": {
                'grant_type': 'refresh_token',
                'refresh_token': refresh_token,
                'scope': 'openid offline_access profile'
            },
            "headers": {
                'Accept': 'application/json',
                'Content-Type': 'application/x-www-form-urlencoded',
                'User-Agent': user_agent,
                'Accept-Encoding': 'gzip',
                'Authorization': f'Basic {base64.b64encode(f"{client_id}:".encode()).decode()}'
            }
        },
        {
            "name": "Method 3: Client Assertion (JWT)",
            "data": {
                'grant_type': 'refresh_token',
                'refresh_token': refresh_token,
                'client_id': client_id,
                'client_assertion_type': 'urn:ietf:params:oauth:client-assertion-type:jwt-bearer',
                'scope': 'openid offline_access profile'
            },
            "headers": {
                'Accept': 'application/json',
                'Content-Type': 'application/x-www-form-urlencoded',
                'User-Agent': user_agent,
                'Accept-Encoding': 'gzip'
            }
        },
        {
            "name": "Method 4: POST Client ID",
            "data": {
                'grant_type': 'refresh_token',
                'refresh_token': refresh_token,
                'client_id': client_id,
                'scope': 'openid offline_access profile'
            },
            "headers": {
                'Accept': 'application/json',
                'Content-Type': 'application/x-www-form-urlencoded',
                'User-Agent': user_agent,
                'Accept-Encoding': 'gzip',
                'Client-ID': client_id
            }
        },
        {
            "name": "Method 5: Minimal + Redirect URI",
            "data": {
                'grant_type': 'refresh_token',
                'refresh_token': refresh_token,
                'client_id': client_id,
                'redirect_uri': 'com.meijer.mobile.meijer:/login'
            },
            "headers": {
                'Accept': 'application/json',
                'Content-Type': 'application/x-www-form-urlencoded',
                'User-Agent': user_agent,
                'Accept-Encoding': 'gzip'
            }
        }
    ]
    
    for i, method in enumerate(methods, 1):
        print(f"\n🧪 Testing {method['name']}")
        print(f"   Data: {method['data']}")
        print(f"   Headers: {list(method['headers'].keys())}")
        
        try:
            response = requests.post(token_url, 
                                   data=method['data'], 
                                   headers=method['headers'])
            print(f"   Status: {response.status_code}")
            
            if response.status_code == 200:
                token_data = response.json()
                print(f"   ✅ SUCCESS!")
                print(f"   New Access Token: {token_data.get('access_token', '')[:30]}...")
                if 'refresh_token' in token_data:
                    print(f"   New Refresh Token: {token_data['refresh_token'][:20]}...")
                return token_data, method
            else:
                print(f"   ❌ Failed")
                try:
                    error_data = response.json()
                    error_code = error_data.get('errorCode', error_data.get('error', 'unknown'))
                    error_desc = error_data.get('errorSummary', error_data.get('error_description', 'unknown'))
                    print(f"   Error: {error_code} - {error_desc}")
                    
                    # Special handling for specific errors
                    if 'invalid_client' in error_code:
                        print(f"   💡 Hint: Client authentication issue")
                    elif 'invalid_grant' in error_code:
                        print(f"   💡 Hint: Refresh token is expired/invalid")
                    elif 'unsupported_grant_type' in error_code:
                        print(f"   💡 Hint: Server doesn't support refresh_token grant")
                        
                except:
                    print(f"   Raw Response: {response.text[:200]}...")
                    
        except Exception as e:
            print(f"   ❌ Exception: {e}")
    
    print(f"\n🔍 Analysis:")
    print(f"   All methods failed, which suggests:")
    print(f"   1. The refresh token from logs is expired/revoked")
    print(f"   2. The Okta configuration requires specific client setup")
    print(f"   3. Additional parameters may be needed (device_secret, etc.)")
    
    # Check token expiry from JWT if possible
    print(f"\n🔍 Checking current access token expiry...")
    try:
                 # Try to decode the access token to see expiry
        
        # Access tokens are JWTs - decode the payload
        if '.' in access_token:
            parts = access_token.split('.')
            if len(parts) >= 2:
                # Decode payload
                payload_padding = len(parts[1]) % 4
                if payload_padding:
                    payload_padded = parts[1] + '=' * (4 - payload_padding)
                else:
                    payload_padded = parts[1]
                
                payload = json.loads(base64.urlsafe_b64decode(payload_padded))
                
                if 'exp' in payload:
                    exp_time = datetime.datetime.fromtimestamp(payload['exp'])
                    now = datetime.datetime.now()
                    time_left = exp_time - now
                    
                    print(f"   Access Token expires: {exp_time}")
                    print(f"   Time remaining: {time_left}")
                    
                    if time_left.total_seconds() > 3600:  # More than 1 hour
                        print(f"   💡 Current token is still valid - no immediate need to refresh!")
                    else:
                        print(f"   ⚠️  Token expires soon - refresh would be needed")
                        
                if 'scope' in payload:
                    print(f"   Token scope: {payload['scope']}")
                    
    except Exception as e:
        print(f"   Could not decode access token: {e}")

def main():
    """Main test function."""
    test_different_auth_methods()

if __name__ == "__main__":
    main() 