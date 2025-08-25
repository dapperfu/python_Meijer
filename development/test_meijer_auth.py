#!/usr/bin/env python3
"""
Test script for Meijer authentication with real credentials.
This script will test the complete authentication flow and validate auth.json creation.
"""

import sys
import json
import logging
from pathlib import Path

# Add the current directory to the path
sys.path.insert(0, str(Path(__file__).parent))

from meijer.authenticated_client import AuthenticatedMeijerClient

# Setup logging
logging.basicConfig(
    level=logging.INFO,
    format='%(asctime)s - %(name)s - %(levelname)s - %(message)s'
)

logger = logging.getLogger(__name__)


def get_2fa_code():
    """Get 2FA code from user input."""
    return input("Enter 2FA code from email: ")


def get_credentials_from_config():
    """Get credentials from ~/.config/meijer/ directory."""
    config_dir = Path.home() / ".config" / "meijer"
    
    # Read username from login.txt
    username = None
    login_file = config_dir / "login.txt"
    if login_file.exists():
        with open(login_file, 'r') as f:
            username = f.read().strip()
    
    return username


def test_authentication():
    """Test the complete authentication flow."""
    print("🔐 Testing Meijer Authentication")
    print("=" * 50)
    
    # Get credentials from config
    username = get_credentials_from_config()
    
    if not username:
        print("❌ No username found in config files")
        return
    
    print(f"📧 Username from config: {username}")
    
    # Use the known password
    password = "Default12!@"
    print("🔑 Password: [HIDDEN]")
    
    try:
        # Test authentication
        print("\n🚀 Starting authentication...")
        with AuthenticatedMeijerClient(headless=True) as client:
            success = client.login(username, password, get_2fa_code)
            
            if success:
                print("✅ Authentication successful!")
                
                # Check if auth.json was created
                if Path('auth.json').exists():
                    print("✅ auth.json created successfully")
                    
                    # Load and display auth.json contents
                    with open('auth.json', 'r') as f:
                        auth_data = json.load(f)
                    
                    print("\n📄 auth.json contents:")
                    print(f"  - Timestamp: {auth_data.get('timestamp', 'N/A')}")
                    print(f"  - JSESSIONID: {auth_data.get('jsessionid', 'N/A')}")
                    print(f"  - State Handle: {auth_data.get('state_handle', 'N/A')[:50]}..." if auth_data.get('state_handle') else '  - State Handle: N/A')
                    print(f"  - Authenticator ID: {auth_data.get('authenticator_id', 'N/A')}")
                    
                    # Check for tokens
                    if 'access_token' in auth_data:
                        print(f"  - Access Token: {auth_data['access_token'][:50]}...")
                    if 'refresh_token' in auth_data:
                        print(f"  - Refresh Token: {auth_data['refresh_token'][:50]}...")
                    if 'bearer_token' in auth_data:
                        print(f"  - Bearer Token: {auth_data['bearer_token'][:50]}...")
                    if 'id_token' in auth_data:
                        print(f"  - ID Token: {auth_data['id_token'][:50]}...")
                    
                    # Check cookies
                    cookies = auth_data.get('cookies', {})
                    print(f"  - Cookies: {len(cookies)} cookies stored")
                    
                    # Show important cookies
                    important_cookies = ['JSESSIONID', 'ak_bmsc', '_abck', 'bm_sz', 'bm_sv']
                    for cookie_name in important_cookies:
                        if cookie_name in cookies:
                            cookie_value = cookies[cookie_name]['value']
                            print(f"    - {cookie_name}: {cookie_value[:50]}...")
                    
                    # Test session restoration
                    print("\n🔄 Testing session restoration...")
                    new_client = AuthenticatedMeijerClient()
                    if new_client.is_authenticated():
                        print("✅ Session restored successfully from auth.json")
                        session = new_client.get_session()
                        print(f"🍪 Session has {len(session.cookies)} cookies")
                        
                        # Test authenticated request
                        response = session.get("https://www.meijer.com/account", timeout=10)
                        print(f"🌐 Account page access: {response.status_code}")
                        
                        new_client.logout()
                    else:
                        print("❌ Session restoration failed")
                
                else:
                    print("❌ auth.json was not created")
                
            else:
                print("❌ Authentication failed")
                
    except Exception as e:
        print(f"💥 Authentication error: {e}")
        logger.exception("Authentication failed")


def test_auth_json_validation():
    """Test that auth.json contains the required tokens."""
    print("\n🔍 Validating auth.json contents...")
    
    if not Path('auth.json').exists():
        print("❌ auth.json does not exist")
        return False
    
    try:
        with open('auth.json', 'r') as f:
            auth_data = json.load(f)
        
        required_fields = ['timestamp', 'jsessionid', 'cookies']
        missing_fields = [field for field in required_fields if field not in auth_data]
        
        if missing_fields:
            print(f"❌ Missing required fields: {missing_fields}")
            return False
        
        # Check for at least one token type
        token_fields = ['access_token', 'refresh_token', 'bearer_token', 'id_token']
        found_tokens = [field for field in token_fields if field in auth_data]
        
        if not found_tokens:
            print("❌ No authentication tokens found")
            return False
        
        print(f"✅ Found tokens: {found_tokens}")
        
        # Check cookies
        cookies = auth_data.get('cookies', {})
        if not cookies:
            print("❌ No cookies stored")
            return False
        
        print(f"✅ Stored {len(cookies)} cookies")
        
        return True
        
    except Exception as e:
        print(f"❌ Error validating auth.json: {e}")
        return False


def main():
    """Main test function."""
    print("🎯 Meijer Authentication Test Suite")
    print("=" * 60)
    
    # Check if auth.json exists initially
    if Path('auth.json').exists():
        print("⚠️  auth.json already exists - this will be overwritten")
        response = input("Continue? (y/N): ")
        if response.lower() != 'y':
            print("Test cancelled")
            return
    
    # Run authentication test
    test_authentication()
    
    # Validate auth.json
    if test_auth_json_validation():
        print("\n🎉 Authentication test completed successfully!")
        print("auth.json contains all required authentication data")
    else:
        print("\n❌ Authentication test failed")
        print("auth.json validation failed")


if __name__ == "__main__":
    main()
