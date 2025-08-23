#!/usr/bin/env python3
"""
Simple script to load existing working tokens from ~/.config/meijer/auth.json
and save them to auth.json for testing purposes.
"""

import json
import sys
from pathlib import Path


def load_existing_tokens():
    """Load existing tokens from ~/.config/meijer/auth.json."""
    try:
        config_dir = Path.home() / ".config" / "meijer"
        auth_file = config_dir / "auth.json"
        
        if not auth_file.exists():
            print("❌ No existing auth.json file found")
            return None
        
        with open(auth_file, 'r') as f:
            auth_data = json.load(f)
        
        print("✅ Successfully loaded existing auth.json")
        return auth_data
        
    except Exception as e:
        print(f"❌ Failed to load existing tokens: {e}")
        return None


def save_tokens_to_auth_json(tokens_data):
    """Save authentication tokens to auth.json."""
    try:
        # Extract the key tokens from the existing auth data
        auth_data = {
            'timestamp': tokens_data.get('extracted_at', 0),
            'access_token': tokens_data.get('access_token', ''),
            'refresh_token': tokens_data.get('refresh_token', ''),
            'id_token': tokens_data.get('id_token', ''),
            'token_type': 'Bearer',
            'expires_in': tokens_data.get('expires_in', 28800),
            'scope': tokens_data.get('scope', 'profile offline_access openid'),
            'extracted_at': tokens_data.get('extracted_at', 0),
            'source': 'existing_auth_txt',
            'original_data': tokens_data
        }
        
        with open('auth.json', 'w') as f:
            json.dump(auth_data, f, indent=2)
        
        print("✅ Tokens saved to auth.json")
        return True
        
    except Exception as e:
        print(f"❌ Failed to save tokens: {e}")
        return False


def validate_tokens(tokens_data):
    """Validate that the tokens contain required fields."""
    required_fields = ['access_token', 'refresh_token']
    missing_fields = [field for field in required_fields if not tokens_data.get(field)]
    
    if missing_fields:
        print(f"⚠️  Missing required fields: {missing_fields}")
        return False
    
    print("✅ All required token fields present")
    return True


def main():
    """Main function."""
    print("🎯 Load Existing Tokens to auth.json")
    print("=" * 50)
    
    # Check if auth.json exists initially
    if Path('auth.json').exists():
        print("⚠️  auth.json already exists - this will be overwritten")
        response = input("Continue? (y/N): ")
        if response.lower() != 'y':
            print("Operation cancelled")
            return
    
    # Load existing tokens
    print("\n📂 Loading existing tokens from ~/.config/meijer/auth.json...")
    tokens_data = load_existing_tokens()
    
    if not tokens_data:
        print("❌ Failed to load existing tokens")
        return
    
    # Display token information
    print("\n📄 Token Information:")
    print(f"  - Access Token: {tokens_data.get('access_token', 'N/A')[:50]}...")
    print(f"  - Refresh Token: {tokens_data.get('refresh_token', 'N/A')[:50]}...")
    print(f"  - ID Token: {tokens_data.get('id_token', 'N/A')[:50]}...")
    print(f"  - Extracted At: {tokens_data.get('extracted_at', 'N/A')}")
    print(f"  - Expires In: {tokens_data.get('expires_in', 'N/A')} seconds")
    
    # Validate tokens
    if not validate_tokens(tokens_data):
        print("❌ Token validation failed")
        return
    
    # Save to auth.json
    print("\n💾 Saving tokens to auth.json...")
    if save_tokens_to_auth_json(tokens_data):
        print("\n🎉 Success! Tokens loaded from existing auth.json and saved to auth.json")
        print("You can now test the authenticated client with these tokens")
    else:
        print("\n❌ Failed to save tokens to auth.json")


if __name__ == "__main__":
    main()
