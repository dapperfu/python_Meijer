#!/usr/bin/env python3
"""
Test script to demonstrate enhanced token persistence functionality.

This script shows how the Meijer client now automatically restores
authentication from stored tokens, avoiding 2FA prompts on subsequent logins.
"""

import logging
import time

from meijer import Meijer

# Setup logging
logging.basicConfig(
    level=logging.INFO, format="%(asctime)s - %(levelname)s - %(message)s"
)
logger = logging.getLogger(__name__)


def test_token_persistence():
    """Test the token persistence functionality."""

    print("=" * 60)
    print("Testing Meijer Client Token Persistence")
    print("=" * 60)

    # Test 1: First login (will require authentication)
    print("\n1. First Login - Creating new session...")
    meijer1 = Meijer()

    # Check if we have stored tokens
    session_info = meijer1.get_session_info()
    print(f"Initial session info: {session_info}")

    if meijer1.credentials:
        print("Attempting login with stored credentials...")
        if meijer1.login():
            print("✅ First login successful!")

            # Get updated session info
            session_info = meijer1.get_session_info()
            print(f"After login session info: {session_info}")

            # Test API call
            offers = meijer1.get_offers(limit=3)
            print(f"Retrieved {len(offers)} offers")

        else:
            print("❌ First login failed!")
            meijer1.logout()
            return

    else:
        print("No credentials found. Please create auth.txt file first.")
        print("This test requires valid credentials to demonstrate token persistence.")
        return

    # Clean up first session
    meijer1.logout()
    print("First session logged out and cleaned up.")

    # Test 2: Second login (should restore from stored tokens)
    print("\n2. Second Login - Should restore from stored tokens...")
    time.sleep(2)  # Small delay to simulate time passing

    meijer2 = Meijer()

    # Check if we can restore authentication
    session_info = meijer2.get_session_info()
    print(f"Second session initial info: {session_info}")

    # Try to login (should restore from stored tokens)
    if meijer2.login():
        print("✅ Second login successful!")

        # Get updated session info
        session_info = meijer2.get_session_info()
        print(f"After login session info: {session_info}")

        # Test API call without re-authentication
        print("Testing API call to verify authentication...")
        offers = meijer2.get_offers(limit=3)
        print(f"Retrieved {len(offers)} offers")

        # Test token refresh if needed
        if meijer2.auth_tokens and meijer2.auth_tokens.needs_refresh():
            print("Tokens need refresh, testing refresh functionality...")
            if meijer2.refresh_token():
                print("✅ Token refresh successful!")
            else:
                print("❌ Token refresh failed!")

    else:
        print("❌ Second login failed!")

    # Clean up second session
    meijer2.logout()
    print("Second session logged out and cleaned up.")

    # Test 3: Verify tokens are cleared
    print("\n3. Verifying token cleanup...")
    meijer3 = Meijer()
    session_info = meijer3.get_session_info()
    print(f"Third session info (should show no stored tokens): {session_info}")

    if not session_info["has_stored_tokens"]:
        print("✅ Token cleanup successful - no stored tokens found")
    else:
        print("❌ Token cleanup failed - stored tokens still present")

    meijer3.logout()


def test_token_refresh():
    """Test token refresh functionality."""

    print("\n" + "=" * 60)
    print("Testing Token Refresh Functionality")
    print("=" * 60)

    meijer = Meijer()

    if not meijer.credentials:
        print("No credentials available for token refresh test")
        return

    if meijer.login():
        print("✅ Login successful for refresh test")

        # Get current token info
        if meijer.auth_tokens:
            print(f"Current token expires at: {meijer.auth_tokens.expires_at}")
            print(f"Token expires in: {meijer.auth_tokens.expires_in} seconds")
            print(f"Needs refresh: {meijer.auth_tokens.needs_refresh()}")

            # Test manual refresh
            print("Testing manual token refresh...")
            if meijer.refresh_token():
                print("✅ Manual token refresh successful!")

                # Check new token info
                if meijer.auth_tokens:
                    print(f"New token expires at: {meijer.auth_tokens.expires_at}")
                    print(
                        f"New token expires in: {meijer.auth_tokens.expires_in} seconds"
                    )
            else:
                print("❌ Manual token refresh failed!")

        # Test API call after refresh
        offers = meijer.get_offers(limit=2)
        print(f"API call after refresh: Retrieved {len(offers)} offers")

    else:
        print("❌ Login failed for refresh test")

    meijer.logout()


def main():
    """Main test function."""
    print("Meijer Client Token Persistence Test")
    print("This test demonstrates how the client automatically restores")
    print("authentication from stored tokens to avoid 2FA prompts.")
    print()

    try:
        # Test basic token persistence
        test_token_persistence()

        # Test token refresh
        test_token_refresh()

        print("\n" + "=" * 60)
        print("✅ All tests completed!")
        print("=" * 60)

    except Exception as e:
        print(f"\n❌ Test failed with error: {e}")
        logging.exception("Test error details:")


if __name__ == "__main__":
    main()
