#!/usr/bin/env python3
"""
Test script for OKTA authentication flow.

This script demonstrates the complete OKTA IDX authentication process
without requiring a browser or local web server.

Usage:
    python test_okta_auth.py [username] [password]

Example:
    python test_okta_auth.py "meijer.com@eabi.xyz" "your_password"
"""

import os
import sys

# Add the meijer package to the path
sys.path.insert(0, os.path.join(os.path.dirname(__file__), "."))


def test_okta_authentication():
    """Test the OKTA authentication flow."""
    print("🧪 Testing OKTA Authentication Flow")
    print("=" * 50)

    try:
        from meijer.okta_auth import authenticate_with_credentials

        # Get credentials from command line or use defaults
        if len(sys.argv) >= 3:
            username = sys.argv[1]
            password = sys.argv[2]
        else:
            print("⚠️ No credentials provided, using defaults from logs")
            print("💡 Usage: python test_okta_auth.py <username> <password>")
            username = "meijer.com@eabi.xyz"  # From logs
            password = "Default12!@"  # From logs (for testing only)

        print(f"🔐 Testing authentication for: {username}")
        print()

        # Attempt authentication
        tokens = authenticate_with_credentials(username, password)

        if tokens:
            print()
            print("🎉 SUCCESS: Authentication completed!")
            print("=" * 50)
            print(f"🔑 Access Token: {tokens.access_token[:50]}...")
            print(f"🔄 Refresh Token: {tokens.refresh_token[:50]}...")
            print(f"⏰ Expires In: {tokens.expires_in} seconds")
            print(f"🎫 Token Type: {tokens.token_type}")

            # Test token validation
            if tokens.is_expired():
                print("❌ Token is expired")
            else:
                print("✅ Token is valid")
                time_until_expiry = tokens.time_until_expiry()
                if time_until_expiry:
                    hours = time_until_expiry.total_seconds() / 3600
                    print(f"⏰ Token expires in: {hours:.1f} hours")

            # Save tokens to storage for testing
            try:
                from meijer.auth import TokenStorage

                storage = TokenStorage()
                if storage.save_tokens(tokens):
                    print("💾 Tokens saved to storage successfully")
                else:
                    print("⚠️ Failed to save tokens to storage")
            except Exception as e:
                print(f"⚠️ Could not save tokens to storage: {e}")

            return True
        else:
            print()
            print("❌ FAILED: Authentication failed")
            print("=" * 50)
            print("💡 Possible issues:")
            print("   1. Invalid credentials")
            print("   2. OKTA flow changes")
            print("   3. Device fingerprinting issues")
            print("   4. Rate limiting")
            print("   5. Network connectivity")
            return False

    except ImportError as e:
        print(f"❌ Import error: {e}")
        print("💡 Make sure you're running from the project root directory")
        return False
    except Exception as e:
        print(f"❌ Unexpected error: {e}")
        return False


def test_token_storage():
    """Test token storage functionality."""
    print("\n🧪 Testing Token Storage")
    print("=" * 30)

    try:
        from meijer.auth import TokenStorage

        storage = TokenStorage()

        # Check if we have tokens
        if storage.has_tokens():
            print("✅ Tokens found in storage")
            tokens = storage.get_valid_tokens()
            if tokens:
                print(f"🔑 Access token: {tokens.access_token[:30]}...")
                print(f"🔄 Refresh token: {tokens.refresh_token[:30]}...")
                print(f"⏰ Expires in: {tokens.expires_in} seconds")

                # Test refresh
                if tokens.refresh_token and tokens.refresh_token.strip():
                    print("🔄 Testing token refresh...")
                    if storage.refresh_tokens(tokens.refresh_token):
                        print("✅ Token refresh successful")
                    else:
                        print("❌ Token refresh failed")
                else:
                    print("⚠️ No refresh token available")
            else:
                print("❌ No valid tokens in storage")
        else:
            print("ℹ️ No tokens in storage")

    except Exception as e:
        print(f"❌ Token storage test failed: {e}")


if __name__ == "__main__":
    print("🚀 OKTA Authentication Test Suite")
    print("=" * 50)

    # Test authentication
    auth_success = test_okta_authentication()

    # Test token storage
    test_token_storage()

    # Summary
    print("\n📊 Test Summary")
    print("=" * 30)
    if auth_success:
        print("✅ Authentication: PASSED")
        print("💡 You can now use the extracted tokens for API calls")
    else:
        print("❌ Authentication: FAILED")
        print("💡 Check the error messages above for troubleshooting")

    print("\n🔧 Next Steps:")
    print("   1. If successful, tokens are saved and ready for use")
    print("   2. If failed, check the detailed error messages")
    print("   3. Verify credentials and network connectivity")
    print("   4. Check if OKTA flow has changed")
