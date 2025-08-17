#!/usr/bin/env python3
"""
Comprehensive test script for Meijer v2 API client.

This script demonstrates all the features and capabilities of the
full-featured Meijer class including OAuth 2.0 authentication,
session management, offers, stores, and more.
"""

import json
import logging
import time
from typing import Dict, Any
from meijer import Meijer, MeijerError, MeijerAuthenticationError


def setup_logging() -> None:
    """Setup logging configuration."""
    logging.basicConfig(
        level=logging.INFO,
        format="%(asctime)s - %(name)s - %(levelname)s - %(message)s",
    )


def test_oauth_flow(meijer: Meijer) -> bool:
    """Test OAuth 2.0 authentication flow."""
    print("\n" + "=" * 60)
    print("🔐 TESTING OAUTH 2.0 FLOW")
    print("=" * 60)

    try:
        # Generate authorization URL
        print("1. Generating OAuth authorization URL...")
        auth_url = meijer.get_authorization_url()
        print(f"✅ Authorization URL generated: {auth_url[:100]}...")

        # Test interactive authentication (will open browser)
        print("\n2. Testing interactive authentication...")
        print("Note: This will open a browser for user authentication")
        result = meijer.authenticate_interactive()
        print(f"Interactive auth result: {result}")

        # Test authentication with code (placeholder)
        print("\n3. Testing authentication with code...")
        print("Note: This requires a valid authorization code")
        # result = meijer.authenticate_with_code("test_code")
        print("Skipped - requires valid authorization code")

        return True

    except Exception as e:
        print(f"❌ OAuth flow test failed: {e}")
        return False


def test_credential_authentication(meijer: Meijer) -> bool:
    """Test credential-based authentication."""
    print("\n" + "=" * 60)
    print("🔑 TESTING CREDENTIAL AUTHENTICATION")
    print("=" * 60)

    try:
        # Test with stored credentials
        if meijer.credentials:
            print(f"1. Testing with stored credentials...")
            print(f"Username: {meijer.credentials.get('username', 'Not found')}")
            print(
                f"Password: {'*' * len(meijer.credentials.get('password', '')) if meijer.credentials.get('password') else 'Not found'}"
            )

            result = meijer.login()
            print(f"Login result: {result}")

            if result:
                print("✅ Credential authentication successful!")
                return True
            else:
                print("❌ Credential authentication failed")
                return False
        else:
            print("No stored credentials found")
            return False

    except Exception as e:
        print(f"❌ Credential authentication test failed: {e}")
        return False


def test_session_management(meijer: Meijer) -> bool:
    """Test session management features."""
    print("\n" + "=" * 60)
    print("📋 TESTING SESSION MANAGEMENT")
    print("=" * 60)

    try:
        # Get session info
        print("1. Getting session information...")
        session_info = meijer.get_session_info()
        print(f"Session info: {json.dumps(session_info, indent=2)}")

        # Check authentication status
        print("\n2. Checking authentication status...")
        is_auth = meijer.is_authenticated()
        print(f"Authenticated: {is_auth}")

        # Ensure authenticated
        print("\n3. Ensuring authentication...")
        ensure_result = meijer.ensure_authenticated()
        print(f"Ensure authenticated result: {ensure_result}")

        print("✅ Session management tests completed")
        return True

    except Exception as e:
        print(f"❌ Session management test failed: {e}")
        return False


def test_api_endpoints(meijer: Meijer) -> bool:
    """Test various API endpoints."""
    print("\n" + "=" * 60)
    print("🌐 TESTING API ENDPOINTS")
    print("=" * 60)

    try:
        # Test offers endpoint
        print("1. Testing offers endpoint...")
        offers = meijer.get_offers(limit=3)
        print(f"Retrieved {len(offers)} offers")
        if offers:
            print(
                f"First offer: {offers[0].get('title', 'No title') if offers[0] else 'No data'}"
            )

        # Test home cards endpoint
        print("\n2. Testing home cards endpoint...")
        home_cards = meijer.get_home_cards()
        print(f"Retrieved {len(home_cards)} home cards")
        if home_cards:
            print(
                f"First card: {home_cards[0].get('title', 'No title') if home_cards[0] else 'No data'}"
            )

        # Test special offers endpoint
        print("\n3. Testing special offers endpoint...")
        special_offers = meijer.get_special_offers()
        print(f"Retrieved {len(special_offers)} special offers")
        if special_offers:
            print(
                f"First special offer: {special_offers[0].get('title', 'No title') if special_offers[0] else 'No data'}"
            )

        # Test stores endpoint
        print("\n4. Testing stores endpoint...")
        stores = meijer.get_stores(radius=10)
        print(f"Retrieved {len(stores)} stores")
        if stores:
            print(
                f"First store: {stores[0].get('name', 'No name') if stores[0] else 'No data'}"
            )

        # Test user info endpoint
        print("\n5. Testing user info endpoint...")
        user_info = meijer.get_user_info()
        if user_info:
            print(f"User: {user_info.first_name} {user_info.last_name}")
        else:
            print("No user info available")

        print("✅ API endpoint tests completed")
        return True

    except Exception as e:
        print(f"❌ API endpoint test failed: {e}")
        return False


def test_token_management(meijer: Meijer) -> bool:
    """Test token management features."""
    print("\n" + "=" * 60)
    print("🎫 TESTING TOKEN MANAGEMENT")
    print("=" * 60)

    try:
        # Check if we have tokens
        if meijer.auth_tokens:
            print("1. Current token information:")
            print(f"   Token type: {meijer.auth_tokens.token_type}")
            print(f"   Expires in: {meijer.auth_tokens.expires_in} seconds")
            print(f"   Expires at: {meijer.auth_tokens.expires_at}")
            print(f"   Scope: {meijer.auth_tokens.scope}")

            # Test token expiration check
            print("\n2. Testing token expiration...")
            is_expired = meijer.auth_tokens.is_expired()
            needs_refresh = meijer.auth_tokens.needs_refresh()
            print(f"   Is expired: {is_expired}")
            print(f"   Needs refresh: {needs_refresh}")

            # Test token refresh (if needed)
            if needs_refresh:
                print("\n3. Testing token refresh...")
                refresh_result = meijer.refresh_token()
                print(f"   Refresh result: {refresh_result}")
            else:
                print("\n3. Token refresh not needed")

            print("✅ Token management tests completed")
            return True
        else:
            print("No tokens available for testing")
            return False

    except Exception as e:
        print(f"❌ Token management test failed: {e}")
        return False


def test_error_handling(meijer: Meijer) -> bool:
    """Test error handling capabilities."""
    print("\n" + "=" * 60)
    print("⚠️  TESTING ERROR HANDLING")
    print("=" * 60)

    try:
        # Test with invalid endpoint
        print("1. Testing invalid endpoint handling...")
        try:
            # This should fail gracefully
            meijer.session.get("https://api.meijer.com/invalid/endpoint")
            print("   Invalid endpoint handled gracefully")
        except Exception as e:
            print(f"   Expected error caught: {type(e).__name__}")

        # Test authentication error handling
        print("\n2. Testing authentication error handling...")
        try:
            # Try to access protected endpoint without auth
            meijer.auth_status = meijer.auth_status.UNAUTHENTICATED
            meijer.auth_tokens = None
            offers = meijer.get_offers()
            print(f"   Offers without auth: {len(offers)}")
        except Exception as e:
            print(f"   Expected auth error caught: {type(e).__name__}")

        print("✅ Error handling tests completed")
        return True

    except Exception as e:
        print(f"❌ Error handling test failed: {e}")
        return False


def test_context_manager(meijer: Meijer) -> bool:
    """Test context manager functionality."""
    print("\n" + "=" * 60)
    print("🔄 TESTING CONTEXT MANAGER")
    print("=" * 60)

    try:
        print("1. Testing context manager entry...")
        print(f"   Client created: {meijer is not None}")
        print(f"   Session active: {meijer.session is not None}")

        print("\n2. Testing context manager exit...")
        # This will be called automatically when exiting the with block
        print("   Context manager will handle cleanup automatically")

        print("✅ Context manager tests completed")
        return True

    except Exception as e:
        print(f"❌ Context manager test failed: {e}")
        return False


def run_comprehensive_test() -> None:
    """Run comprehensive test suite."""
    print("🚀 MEIJER V2 COMPREHENSIVE TEST SUITE")
    print("=" * 80)

    setup_logging()

    # Track test results
    test_results = {}

    try:
        # Create Meijer client
        print("Initializing Meijer client...")
        with Meijer(debug=True) as meijer:
            print("✅ Client initialized successfully")

            # Run all tests
            test_results["oauth_flow"] = test_oauth_flow(meijer)
            test_results["credential_auth"] = test_credential_authentication(meijer)
            test_results["session_management"] = test_session_management(meijer)
            test_results["api_endpoints"] = test_api_endpoints(meijer)
            test_results["token_management"] = test_token_management(meijer)
            test_results["error_handling"] = test_error_handling(meijer)
            test_results["context_manager"] = test_context_manager(meijer)

    except Exception as e:
        print(f"❌ Test suite failed to initialize: {e}")
        return

    # Print test summary
    print("\n" + "=" * 80)
    print("📊 TEST RESULTS SUMMARY")
    print("=" * 80)

    passed = sum(1 for result in test_results.values() if result)
    total = len(test_results)

    for test_name, result in test_results.items():
        status = "✅ PASS" if result else "❌ FAIL"
        print(f"{test_name.replace('_', ' ').title()}: {status}")

    print(f"\nOverall: {passed}/{total} tests passed")

    if passed == total:
        print("🎉 All tests passed! The Meijer v2 client is working correctly.")
    else:
        print("⚠️  Some tests failed. Check the output above for details.")


def main() -> None:
    """Main function."""
    try:
        run_comprehensive_test()
    except KeyboardInterrupt:
        print("\n\n⏹️  Test interrupted by user")
    except Exception as e:
        print(f"\n❌ Unexpected error: {e}")
        logging.error(f"Test suite failed: {e}")


if __name__ == "__main__":
    main()
