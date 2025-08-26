#!/usr/bin/env python3
"""
Test script for the unified login command with method selection.

This script demonstrates how to use the new unified login functionality
that can switch between enhanced and Selenium authentication methods.
"""

import sys
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, str(Path(__file__).parent))


def test_enhanced_auth():
    """Test enhanced authentication method."""
    print("🔐 Testing Enhanced Authentication Method")
    print("=" * 50)

    try:
        from meijer.enhanced_auth import EnhancedMeijerAuth

        # Get credentials
        username = input("👤 Username/Email: ").strip()
        password = input("🔒 Password: ").strip()

        if not username or not password:
            print("❌ Username and password are required")
            return False

        print(f"\n🚀 Starting enhanced authentication for {username}")

        # Create auth instance
        auth = EnhancedMeijerAuth(username, password)

        # Attempt authentication
        print("🔐 Attempting authentication...")
        tokens = auth.authenticate(force_login=True)

        if tokens:
            print("🎉 Enhanced authentication successful!")
            print(f"🔑 Access token: {tokens.access_token[:30]}...")
            print(f"⏰ Expires in: {tokens.expires_in} seconds")
            return True
        else:
            print("❌ Enhanced authentication failed")
            return False

    except Exception as e:
        print(f"❌ Enhanced authentication error: {e}")
        return False


def test_selenium_auth():
    """Test Selenium authentication method."""
    print("🌐 Testing Selenium Authentication Method")
    print("=" * 50)

    try:
        from meijer.okta_selenium_auth import authenticate_with_selenium_and_keep_open

        # Get credentials
        username = input("👤 Username/Email: ").strip()
        password = input("🔒 Password: ").strip()

        if not username or not password:
            print("❌ Username and password are required")
            return False

        print(f"\n🚀 Starting Selenium authentication for {username}")
        print("🔍 Browser will be kept open for debugging")

        # Use keep-open version for testing
        result = authenticate_with_selenium_and_keep_open(
            username=username,
            password=password,
            headless=False,  # Always show browser for testing
        )

        if result and result.get("success"):
            print("🎉 Selenium authentication successful!")
            print(f"🔑 Authorization code: {result.get('authorization_code', 'N/A')}")
            print(f"🌐 Final URL: {result.get('url', 'N/A')}")

            print("\n🔍 Browser window is still open for debugging")
            print("💡 Close it manually when done")
            return True
        else:
            print("❌ Selenium authentication failed")
            if result:
                print(f"📊 Result: {result}")
            return False

    except Exception as e:
        print(f"❌ Selenium authentication error: {e}")
        return False


def main():
    """Main test function."""
    print("🚀 Unified Login Command Test")
    print("=" * 60)
    print(
        "This script tests both authentication methods available in the unified login command"
    )
    print()

    print("Available authentication methods:")
    print("1. 🔐 Enhanced Authentication (default)")
    print("2. 🌐 Selenium WebDriver Authentication")
    print()

    choice = input("Select method to test (1 or 2): ").strip()

    if choice == "1":
        print("\n" + "=" * 60)
        success = test_enhanced_auth()
    elif choice == "2":
        print("\n" + "=" * 60)
        success = test_selenium_auth()
    else:
        print("❌ Invalid choice. Please select 1 or 2.")
        return

    print("\n" + "=" * 60)
    if success:
        print("✅ Test completed successfully!")
    else:
        print("❌ Test failed")

    print("\n💡 To use the unified login command:")
    print("   # Enhanced method (default)")
    print("   meijer login --method enhanced")
    print()
    print("   # Selenium method")
    print("   meijer login --method selenium")
    print()
    print("   # Selenium with debugging")
    print("   meijer login --method selenium --keep-open --headless=false")
    print()
    print("   # Enhanced method with credential saving")
    print("   meijer login --method enhanced --save-credentials")


if __name__ == "__main__":
    main()
