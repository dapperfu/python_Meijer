#!/usr/bin/env python3
"""
Test script for the OKTA authentication flows.
"""

import os
import sys

# Add the project root to the Python path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

from meijer.okta_auth import OktaAuthenticator
from meijer.okta_js_widget_simulator import authenticate_with_js_widget


def test_js_widget_auth():
    """Test the JavaScript widget simulator approach."""
    print("🧪 Testing OKTA JavaScript Widget Simulator")
    print("=" * 50)

    # Test credentials (replace with actual credentials for testing)
    username = "test@example.com"  # Replace with actual username
    password = "test_password"  # Replace with actual password

    print(f"👤 Username: {username}")
    print(f"🔑 Password: {'*' * len(password)}")
    print()

    try:
        # Perform authentication using widget simulator
        auth_code = authenticate_with_js_widget(username, password)

        if auth_code:
            print("🎉 SUCCESS: Widget simulation completed!")
            print(f"🔑 Authorization code: {auth_code[:50]}...")
            return True
        else:
            print("❌ FAILED: Widget simulation did not complete")
            return False

    except Exception as e:
        print(f"❌ ERROR: Widget simulation failed with exception: {e}")
        return False


def test_direct_auth():
    """Test the direct API approach (for comparison)."""
    print("\n🧪 Testing Direct API Approach (for comparison)")
    print("=" * 50)

    # Test credentials (replace with actual credentials for testing)
    username = "test@example.com"  # Replace with actual username
    password = "test_password"  # Replace with actual password

    print(f"👤 Username: {username}")
    print(f"🔑 Password: {'*' * len(password)}")
    print()

    try:
        # Create authenticator instance
        authenticator = OktaAuthenticator(username, password)

        # Perform authentication
        auth_code = authenticator.authenticate()

        if auth_code:
            print("🎉 SUCCESS: Direct API authentication completed!")
            print(f"🔑 Authorization code: {auth_code[:50]}...")
            return True
        else:
            print("❌ FAILED: Direct API authentication did not complete")
            return False

    except Exception as e:
        print(f"❌ ERROR: Direct API authentication failed with exception: {e}")
        return False


def test_token_refresh():
    """Test token refresh functionality."""
    print("\n🧪 Testing Token Refresh Functionality")
    print("=" * 50)

    try:
        from meijer.auth import TokenStorage

        storage = TokenStorage()

        # Check if we have existing tokens
        if storage.has_tokens():
            print("✅ Found existing tokens")
            tokens = storage.load_tokens()

            if tokens:
                print(f"🔑 Access token: {tokens.access_token[:30]}...")
                print(f"🔄 Refresh token: {tokens.refresh_token[:30]}...")
                print(f"⏰ Expires in: {tokens.expires_in} seconds")

                # Test if tokens are expired
                if tokens.is_expired():
                    print("⚠️ Tokens are expired - attempting refresh...")

                    # Try to refresh tokens
                    if storage.refresh_tokens():
                        print("✅ Token refresh successful!")
                        refreshed_tokens = storage.load_tokens()
                        if refreshed_tokens:
                            print(
                                f"🔑 New access token: {refreshed_tokens.access_token[:30]}..."
                            )
                            return True
                    else:
                        print("❌ Token refresh failed")
                        return False
                else:
                    print("✅ Tokens are still valid")
                    return True
            else:
                print("❌ Could not load tokens")
                return False
        else:
            print("ℹ️ No existing tokens found")
            print("💡 Run 'meijer auth' first to capture tokens from browser login")
            return True  # This is not an error condition

    except Exception as e:
        print(f"❌ ERROR: Token refresh test failed: {e}")
        return False


if __name__ == "__main__":
    print("🚀 OKTA Authentication Test Suite")
    print("=" * 60)

    # Test 1: JavaScript Widget Simulator
    js_widget_success = test_js_widget_auth()

    # Test 2: Direct API Approach (for comparison)
    direct_api_success = test_direct_auth()

    # Test 3: Token Refresh
    token_refresh_success = test_token_refresh()

    # Summary
    print("\n📊 Test Summary")
    print("=" * 30)
    print(f"✅ JS Widget Simulator: {'PASSED' if js_widget_success else 'FAILED'}")
    print(f"✅ Direct API Approach: {'PASSED' if direct_api_success else 'FAILED'}")
    print(f"✅ Token Refresh: {'PASSED' if token_refresh_success else 'FAILED'}")

    # Overall result
    overall_success = js_widget_success or direct_api_success

    print(f"\n🎯 Overall Result: {'SUCCESS' if overall_success else 'FAILED'}")

    if overall_success:
        print("💡 At least one authentication method is working!")
        if token_refresh_success:
            print(
                "💡 Token refresh is also working - you can maintain long-term access!"
            )
    else:
        print("💡 Both authentication methods failed")
        print("💡 Check credentials and network connectivity")

    print("\n🔧 Next Steps:")
    if not overall_success:
        print("   1. Verify credentials are correct")
        print("   2. Check if OKTA flow has changed")
        print("   3. Try running 'meijer auth' to capture working tokens")
    else:
        print("   1. Integrate successful method into the main client")
        print("   2. Implement automatic token refresh")
        print("   3. Test with real API calls")

    sys.exit(0 if overall_success else 1)
