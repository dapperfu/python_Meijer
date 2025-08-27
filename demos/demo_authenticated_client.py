#!/usr/bin/env python3
"""
Demo script for the authenticated Meijer client.
Shows how to use browser automation for initial landing and then requests for authentication.
"""

import logging
import os
import sys
from pathlib import Path

# Add the parent directory to the path so we can import meijer
sys.path.insert(0, str(Path(__file__).parent.parent))

from meijer.authenticated_client import (
    AuthenticatedMeijerClient,
    create_authenticated_client,
)
from meijer.exceptions import AuthenticationError, TwoFactorRequiredError

# Setup logging
logging.basicConfig(
    level=logging.INFO, format="%(asctime)s - %(name)s - %(levelname)s - %(message)s"
)

logger = logging.getLogger(__name__)


def get_2fa_code_callback():
    """
    Callback function to get 2FA code from user.
    In a real application, this could integrate with email checking.
    """
    return input("Enter 2FA code from email: ")


def demo_basic_usage():
    """Demonstrate basic usage of the authenticated client."""
    print("🔐 Meijer Authenticated Client Demo")
    print("=" * 50)

    # Get credentials from environment or user input
    username = os.getenv("MEIJER_USERNAME")
    password = os.getenv("MEIJER_PASSWORD")

    if not username:
        username = input("Enter Meijer username/email: ")
    if not password:
        password = input("Enter Meijer password: ")

    print(f"\n📧 Username: {username}")
    print("🔑 Password: [HIDDEN]")
    print("\n🚀 Starting authentication process...")

    try:
        # Create and authenticate client
        with AuthenticatedMeijerClient(headless=True) as client:
            # Login with 2FA callback
            success = client.login(username, password, get_2fa_code_callback)

            if success:
                print("✅ Authentication successful!")

                # Get the authenticated session
                session = client.get_session()
                print(f"🍪 Session cookies: {len(session.cookies)} cookies")

                # Show some cookies
                for cookie in session.cookies:
                    if any(
                        prefix in cookie.name for prefix in ["ak_", "bm_", "JSESSIONID"]
                    ):
                        print(f"  - {cookie.name}: {cookie.value[:50]}...")

                # Now you can use the session for authenticated requests
                print("\n🌐 Making authenticated request to Meijer...")
                response = session.get("https://www.meijer.com/account")

                if response.status_code == 200:
                    print("✅ Successfully accessed account page")
                    print(f"📄 Page title: {response.text[:100]}...")
                else:
                    print(f"❌ Account page access failed: {response.status_code}")

            else:
                print("❌ Authentication failed")

    except TwoFactorRequiredError as e:
        print(f"⚠️  2FA required: {e}")
    except AuthenticationError as e:
        print(f"❌ Authentication error: {e}")
    except Exception as e:
        print(f"💥 Unexpected error: {e}")
        logger.exception("Unexpected error during authentication")


def demo_factory_function():
    """Demonstrate using the factory function."""
    print("\n🏭 Factory Function Demo")
    print("=" * 30)

    username = os.getenv("MEIJER_USERNAME") or input("Enter username: ")
    password = os.getenv("MEIJER_PASSWORD") or input("Enter password: ")

    try:
        # Use factory function for simpler usage
        client = create_authenticated_client(
            username=username,
            password=password,
            two_factor_callback=get_2fa_code_callback,
            headless=True,
        )

        print("✅ Client created and authenticated successfully!")

        # Use the client
        if client.is_authenticated():
            session = client.get_session()
            print(f"🍪 Authenticated session with {len(session.cookies)} cookies")

            # Make a test request
            response = session.get("https://www.meijer.com/")
            print(f"🌐 Homepage access: {response.status_code}")

        # Clean up
        client.logout()
        print("👋 Logged out successfully")

    except Exception as e:
        print(f"❌ Error: {e}")


def demo_error_handling():
    """Demonstrate error handling scenarios."""
    print("\n⚠️  Error Handling Demo")
    print("=" * 30)

    # Test with invalid credentials
    try:
        with AuthenticatedMeijerClient(headless=True) as client:
            client.login("invalid@example.com", "wrongpassword")
    except AuthenticationError as e:
        print(f"✅ Properly caught authentication error: {e}")
    except Exception as e:
        print(f"❌ Unexpected error type: {type(e).__name__}: {e}")

    # Test browser initialization failure
    try:
        # This might fail if Firefox is not installed
        client = AuthenticatedMeijerClient(headless=True)
        client._setup_browser()
    except AuthenticationError as e:
        print(f"✅ Properly caught browser error: {e}")
    except Exception as e:
        print(f"ℹ️  Browser setup result: {type(e).__name__}: {e}")


def main():
    """Main demo function."""
    print("🎯 Meijer Authenticated Client - Complete Demo")
    print("=" * 60)

    while True:
        print("\n📋 Available demos:")
        print("1. Basic authentication usage")
        print("2. Factory function usage")
        print("3. Error handling scenarios")
        print("4. Run all demos")
        print("5. Exit")

        choice = input("\nSelect demo (1-5): ").strip()

        if choice == "1":
            demo_basic_usage()
        elif choice == "2":
            demo_factory_function()
        elif choice == "3":
            demo_error_handling()
        elif choice == "4":
            print("\n🚀 Running all demos...")
            demo_basic_usage()
            demo_factory_function()
            demo_error_handling()
        elif choice == "5":
            print("👋 Goodbye!")
            break
        else:
            print("❌ Invalid choice. Please select 1-5.")

        input("\nPress Enter to continue...")


if __name__ == "__main__":
    main()
