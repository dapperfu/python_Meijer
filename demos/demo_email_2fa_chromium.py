#!/usr/bin/env python3
"""
Demo script for Email 2FA functionality with Chromium in non-headless mode.

This script demonstrates how to set up and use the email 2FA system
for Meijer authentication using Chromium browser that stays open for debugging.
"""

import logging
import sys
import time
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, str(Path(__file__).parent.parent))

from meijer.okta_selenium_auth import OktaSeleniumAuth


def setup_logging():
    """Set up logging for the demo."""
    logging.basicConfig(
        level=logging.INFO,
        format="%(asctime)s - %(name)s - %(levelname)s - %(message)s",
    )


def demo_chromium_2fa():
    """Demonstrate 2FA with Chromium in non-headless mode."""
    print("🚀 Chromium 2FA Demo - Non-Headless Mode")
    print("=" * 60)

    try:
        # Get credentials from user
        print("🔐 Enter your Meijer credentials:")
        username = input("Username/Email: ").strip()
        password = input("Password: ").strip()

        if not username or not password:
            print("❌ Username and password are required")
            return False

        print(f"\n👤 Starting authentication for: {username}")
        print("🌐 Using Chromium in non-headless mode")
        print("🔍 Browser will stay open for debugging")
        print("⏸️ Press Ctrl+C to stop the demo")

        # Initialize authenticator with headless=False
        auth = OktaSeleniumAuth(username=username, password=password, headless=False)

        print("\n🚀 Starting authentication process...")
        print("📱 The browser will open and begin the login flow")
        print("📧 When 2FA is required, check your email for the verification code")

        # Start authentication
        auth_result = auth.authenticate()

        if auth_result:
            print("\n✅ Authentication successful!")
            print("🔑 Tokens obtained:")
            if "access_token" in auth_result:
                print(f"   Access Token: {auth_result['access_token'][:30]}...")
            if "refresh_token" in auth_result:
                print(f"   Refresh Token: {auth_result['refresh_token'][:30]}...")
            if "id_token" in auth_result:
                print(f"   ID Token: {auth_result['id_token'][:30]}...")
        else:
            print("\n❌ Authentication failed or incomplete")
            print("🔍 Check the browser for any error messages")

        # Keep browser open in while loop for debugging
        print("\n🔄 Keeping browser open for debugging...")
        print("💡 You can now inspect the browser and see what happened")
        print("💡 Close the browser manually when you're done")
        print("⏸️ Press Ctrl+C to stop this demo")

        try:
            while True:
                time.sleep(1)
                # Check if browser is still responsive
                try:
                    if auth.driver:
                        current_url = auth.driver.current_url
                        current_title = auth.driver.title
                        print(f"📍 Current URL: {current_url}")
                        print(f"📄 Current Title: {current_title}")
                    else:
                        print("⚠️ Browser driver not available")
                        break
                except Exception as e:
                    print(f"⚠️ Browser check failed: {e}")
                    break

                time.sleep(5)  # Check every 5 seconds

        except KeyboardInterrupt:
            print("\n⏹️ Demo stopped by user")
            print("🔍 Browser will remain open for manual inspection")
            print("💡 Close the browser manually when done")

        return True

    except Exception as e:
        print(f"❌ Demo failed: {e}")
        return False


def main():
    """Main demo function."""
    print("🚀 Chromium 2FA Demo for Meijer Authentication")
    print("=" * 60)
    print("🌐 This demo uses Chromium in non-headless mode")
    print("🔍 Browser stays open for debugging and inspection")
    print("📧 Handles email 2FA automatically")
    print()

    setup_logging()

    # Run the main demo
    success = demo_chromium_2fa()

    if success:
        print("\n🎉 Demo completed successfully!")
        print("🔍 Browser remains open for manual inspection")
        print("💡 Close the browser manually when done debugging")
    else:
        print("\n❌ Demo failed. Check the error messages above.")

    print("\n" + "=" * 60)
    print("📚 For more information, see the main email 2FA demo")
    print("🔧 CLI commands available:")
    print("   meijer login --method selenium --headless false")


if __name__ == "__main__":
    main()
