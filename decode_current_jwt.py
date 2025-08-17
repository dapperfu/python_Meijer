#!/usr/bin/env python3
"""
Decode Current JWT Token
========================

Decode the current Bearer token to see its scope and other details.
"""

import json
import base64
from meijer_comprehensive import read_bearer_auth_file

def decode_jwt_payload(token: str) -> dict:
    """Decode JWT payload without verification."""
    try:
        # JWT tokens have 3 parts separated by dots
        parts = token.split('.')
        if len(parts) != 3:
            return {}
        
        # Decode the payload (middle part)
        payload = parts[1]
        # Add padding if needed
        padding = len(payload) % 4
        if padding:
            payload += '=' * (4 - padding)
        
        decoded = base64.urlsafe_b64decode(payload)
        return json.loads(decoded)
    except Exception as e:
        print(f"Error decoding JWT: {e}")
        return {}

def main():
    """Decode and analyze the current Bearer token."""
    print("🔍 JWT Token Analysis")
    print("=" * 25)
    
    try:
        # Read current Bearer token
        bearer_token, user_agent = read_bearer_auth_file()
        print(f"🎫 Token loaded: {bearer_token[:30]}...{bearer_token[-15:]}")
        
        # Decode JWT payload
        payload = decode_jwt_payload(bearer_token)
        
        if not payload:
            print("❌ Failed to decode JWT token")
            return
        
        print(f"\n📋 JWT Payload Contents:")
        
        # Key fields
        key_fields = ['iss', 'aud', 'exp', 'iat', 'scope', 'scp', 'cid', 'client_id', 'sub', 'uid']
        for field in key_fields:
            if field in payload:
                value = payload[field]
                if field in ['exp', 'iat', 'auth_time']:
                    # Convert timestamp to readable format
                    from datetime import datetime
                    try:
                        dt = datetime.fromtimestamp(value)
                        print(f"   {field}: {value} ({dt})")
                    except:
                        print(f"   {field}: {value}")
                else:
                    print(f"   {field}: {value}")
        
        # Check for offline_access scope
        scope = payload.get('scope', payload.get('scp', []))
        if isinstance(scope, list):
            has_offline_access = 'offline_access' in scope
        elif isinstance(scope, str):
            has_offline_access = 'offline_access' in scope
        else:
            has_offline_access = False
        
        print(f"\n🔍 Refresh Token Analysis:")
        print(f"   Scope: {scope}")
        print(f"   Has offline_access: {has_offline_access}")
        
        if has_offline_access:
            print("   ✅ Token supports refresh (offline_access scope present)")
            print("   💡 The app SHOULD provide refresh tokens during OAuth")
        else:
            print("   ⚠️  No offline_access scope detected")
            print("   💡 This token may not support refresh")
        
        # Show expiration info
        if 'exp' in payload:
            from datetime import datetime, timezone
            exp_time = datetime.fromtimestamp(payload['exp'])
            now = datetime.now()
            time_left = exp_time - now
            
            print(f"\n⏰ Token Expiration:")
            print(f"   Expires: {exp_time}")
            print(f"   Time left: {time_left}")
            
            if time_left.total_seconds() < 300:  # Less than 5 minutes
                print("   ⚠️  Token expires soon!")
            elif time_left.total_seconds() < 0:
                print("   ❌ Token is expired!")
            else:
                print("   ✅ Token is valid")
        
        # Full payload (for debugging)
        print(f"\n📄 Full JWT Payload:")
        print(json.dumps(payload, indent=2))
        
    except FileNotFoundError:
        print("❌ Bearer auth file not found")
        print("💡 Run: python extract_bearer_token.py")
    except Exception as e:
        print(f"❌ Error: {e}")
        import traceback
        traceback.print_exc()

if __name__ == "__main__":
    main() 