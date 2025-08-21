#!/usr/bin/env python3
"""
Real Login Test Script for OKTA IDX Authentication

This script performs an actual login using the enhanced OKTA IDX authentication
implementation and saves the results to auth.json only on success.
"""

import json
import os
import sys
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, os.path.join(os.path.dirname(__file__), "."))

try:
    from meijer.okta_idx_auth import (
        OKTAIDXAuthenticator,
        load_credentials_from_file,
        perform_login_and_save,
    )
except ImportError as e:
    print(f"❌ Import error: {e}")
    print("Make sure you're running this from the project root directory")
    sys.exit(1)


def test_credentials_loading():
    """Test loading credentials from login.txt file."""
    print("🔍 Testing credentials loading...")

    try:
        username, password = load_credentials_from_file()
        print("✅ Credentials loaded successfully")
        print(f"   Username: {username}")
        print(f"   Password: {'*' * len(password) if password else 'Will prompt'}")
        return True
    except Exception as e:
        print(f"❌ Failed to load credentials: {e}")
        return False


def test_device_fingerprinting():
    """Test device fingerprinting functionality."""
    print("\n🔍 Testing device fingerprinting...")

    try:
        authenticator = OKTAIDXAuthenticator()

        # Test PKCE generation
        code_verifier, code_challenge = authenticator._generate_pkce()
        print("✅ PKCE generated:")
        print(f"   Code verifier: {code_verifier[:20]}...")
        print(f"   Code challenge: {code_challenge[:20]}...")

        # Test device fingerprint generation
        device_fp = authenticator._generate_device_fingerprint()
        print(f"✅ Device fingerprint generated: {device_fp[:30]}...")

        return True
    except Exception as e:
        print(f"❌ Device fingerprinting test failed: {e}")
        return False


def test_oauth2_initiation():
    """Test OAuth2 initiation."""
    print("\n🔍 Testing OAuth2 initiation...")

    try:
        authenticator = OKTAIDXAuthenticator()
        code_verifier, code_challenge = authenticator._generate_pkce()

        # Test OAuth2 initiation
        state_token = authenticator._initiate_oauth2(code_verifier, code_challenge)
        print("✅ OAuth2 initiation successful")
        print(f"   State token: {state_token[:20]}...")

        return True
    except Exception as e:
        print(f"❌ OAuth2 initiation test failed: {e}")
        return False


def test_real_authentication(method: str = "requests"):
    """Test real authentication with actual credentials."""
    print(f"\n🔐 Testing real authentication with {method} method...")

    try:
        # Load credentials
        username, password = load_credentials_from_file()
        print(f"👤 Using credentials for: {username}")

        # Perform authentication
        authenticator = OKTAIDXAuthenticator()

        if method == "requests":
            tokens = authenticator.authenticate_with_requests(username, password)
        else:
            tokens = authenticator.authenticate_with_selenium(
                username, password, headless=True
            )

        # Verify tokens
        if not tokens.get("access_token"):
            print("❌ Authentication failed: No access token received")
            return False

        print("✅ Authentication successful!")
        print(f"🔑 Access token: {tokens['access_token'][:20]}...")
        if tokens.get("refresh_token"):
            print(f"🔄 Refresh token: {tokens['refresh_token'][:20]}...")
        print(f"⏰ Expires in: {tokens.get('expires_in', 'unknown')} seconds")

        return tokens

    except Exception as e:
        print(f"❌ Real authentication test failed: {e}")
        return False


def test_complete_login_flow(method: str = "requests"):
    """Test the complete login and save flow."""
    print(f"\n🚀 Testing complete login and save flow with {method} method...")

    try:
        success = perform_login_and_save(method, "test_auth.json")

        if success:
            print("✅ Complete login flow successful!")

            # Verify the saved file
            if Path("test_auth.json").exists():
                with open("test_auth.json", "r") as f:
                    auth_data = json.load(f)

                print("📁 Auth file saved successfully:")
                print(f"   Timestamp: {auth_data.get('timestamp')}")
                print(f"   Expires at: {auth_data.get('expires_at')}")
                print(
                    f"   Access token: {auth_data['tokens'].get('access_token', '')[:20]}..."
                )

                # Clean up test file
                Path("test_auth.json").unlink()
                print("🧹 Test auth file cleaned up")

            return True
        else:
            print("❌ Complete login flow failed")
            return False

    except Exception as e:
        print(f"❌ Complete login flow test failed: {e}")
        return False


def main():
    """Main test function."""
    print("🧪 OKTA IDX Authentication - Real Login Test Suite")
    print("=" * 60)

    # Test 1: Credentials loading
    if not test_credentials_loading():
        print("\n❌ Credentials test failed. Cannot proceed with authentication.")
        return False

    # Test 2: Device fingerprinting
    if not test_device_fingerprinting():
        print("\n❌ Device fingerprinting test failed.")
        return False

    # Test 3: OAuth2 initiation
    if not test_oauth2_initiation():
        print("\n❌ OAuth2 initiation test failed.")
        return False

    # Test 4: Real authentication (requests method)
    print("\n" + "=" * 60)
    print("🔐 TESTING REAL AUTHENTICATION")
    print("=" * 60)

    tokens = test_real_authentication("requests")
    if not tokens:
        print("\n❌ Real authentication test failed. Cannot proceed.")
        return False

    # Test 5: Complete login and save flow
    if not test_complete_login_flow("requests"):
        print("\n❌ Complete login flow test failed.")
        return False

    print("\n" + "=" * 60)
    print("🎉 ALL TESTS PASSED! Authentication system is working.")
    print("=" * 60)

    return True


if __name__ == "__main__":
    try:
        success = main()
        sys.exit(0 if success else 1)
    except KeyboardInterrupt:
        print("\n\n⏹️  Test interrupted by user")
        sys.exit(1)
    except Exception as e:
        print(f"\n❌ Unexpected error: {e}")
        sys.exit(1)
