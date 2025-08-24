#!/usr/bin/env python3
"""
Test script for Selenium-based Meijer authentication.
"""

import sys
import os

# Add the current directory to Python path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

def test_selenium_auth():
    """Test the Selenium authentication."""
    try:
        from meijer.okta_selenium_auth import authenticate_with_selenium
        print("✅ Selenium auth module imported successfully")
        
        # Read credentials from login.txt
        login_file = "/keg/cursor/.config/meijer/login.txt"
        
        try:
            with open(login_file, 'r') as f:
                lines = f.readlines()
                if len(lines) >= 2:
                    username = lines[0].strip()
                    password = lines[1].strip()
                else:
                    print("❌ login.txt must contain username and password on separate lines")
                    return
        except Exception as e:
            print(f"❌ Error reading {login_file}: {e}")
            return
        
        print(f"🔐 Using credentials from {login_file}")
        print(f"👤 Username: {username}")
        print(f"🔑 Password: {'*' * len(password)}")
        print()
        
        print("🚀 Starting Selenium authentication...")
        print("🌐 Browser will be visible for debugging")
        print("=" * 60)
        
        # Run authentication with visible browser
        result = authenticate_with_selenium(
            username=username,
            password=password,
            headless=False,  # Visible browser
            keep_open=True,  # Keep browser open for debugging
            proxy_host="127.0.0.1",  # mitmproxy
            proxy_port=8080
        )
        
        if result and result.get("success"):
            print("✅ Selenium authentication successful!")
            print(f"🔑 Authorization code: {result.get('authorization_code', 'N/A')}")
            print(f"🌐 Final URL: {result.get('url', 'N/A')}")
        else:
            print("❌ Selenium authentication failed!")
            if result:
                print(f"📊 Result: {result}")
                
    except Exception as e:
        print(f"❌ Error testing Selenium auth: {e}")
        import traceback
        traceback.print_exc()

if __name__ == "__main__":
    test_selenium_auth()
