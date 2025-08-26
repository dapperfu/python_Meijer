#!/usr/bin/env python3
"""
Test script for 2FA with proxy support (mitmproxy).

This script demonstrates how to use the enhanced Selenium authentication
with proxy support to capture all HTTP/HTTPS traffic through mitmproxy.
"""

import sys
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, str(Path(__file__).parent.parent))

from meijer.okta_selenium_auth import authenticate_with_selenium_and_keep_open


def test_proxy_2fa():
    """Test 2FA authentication with proxy support."""
    print("🚀 Testing 2FA with Proxy Support (mitmproxy)")
    print("=" * 60)

    # Get credentials
    print("🔐 Enter your Meijer credentials:")
    username = input("Username/Email: ").strip()
    password = input("Password: ").strip()

    if not username or not password:
        print("❌ Username and password are required")
        return False

    print(f"\n👤 Starting authentication for: {username}")
    print("🌐 Using Chromium with proxy support")
    print("📊 All traffic will be logged through mitmproxy")
    print("🔍 Browser will stay open for debugging")

    # Proxy configuration for mitmproxy
    proxy_host = "127.0.0.1"
    proxy_port = 8080

    print(f"\n🌐 Proxy configuration: {proxy_host}:{proxy_port}")
    print("💡 Make sure mitmproxy is running on this address")
    print("📊 You can monitor the traffic in the mitmproxy interface")

    try:
        # Start authentication with proxy
        result = authenticate_with_selenium_and_keep_open(
            username=username,
            password=password,
            headless=False,  # Non-headless for debugging
            proxy_host=proxy_host,
            proxy_port=proxy_port,
        )

        if result:
            print("\n✅ Authentication completed!")
            print("🔍 Browser remains open for inspection")
            print("📊 Check mitmproxy for captured traffic")
            print("💡 Close the browser manually when done")
        else:
            print("\n❌ Authentication failed")
            print("🔍 Check the browser and mitmproxy for details")

        return True

    except Exception as e:
        print(f"\n❌ Test failed: {e}")
        return False


def main():
    """Main function."""
    print("🚀 Proxy-Enabled 2FA Test for Meijer")
    print("=" * 60)
    print("🌐 This test uses mitmproxy to capture all HTTP/HTTPS traffic")
    print("📊 Perfect for analyzing authentication flows and debugging")
    print("🔍 Browser stays open for manual inspection")
    print()

    print("📋 Prerequisites:")
    print("1. mitmproxy running on 127.0.0.1:8080")
    print("2. mitmproxy certificate installed in browser")
    print("3. Valid Meijer credentials")
    print()

    # Check if user wants to proceed
    proceed = input("Ready to start? (y/n): ").strip().lower()
    if proceed != "y":
        print("❌ Test cancelled")
        return

    # Run the test
    success = test_proxy_2fa()

    if success:
        print("\n🎉 Test completed successfully!")
        print("📊 Check mitmproxy for captured traffic analysis")
        print("🔍 Browser remains open for manual inspection")
    else:
        print("\n❌ Test failed. Check the error messages above.")

    print("\n" + "=" * 60)
    print("📚 For more information:")
    print(
        "   meijer login --method selenium --headless false --keep-open --proxy-host 127.0.0.1 --proxy-port 8080"
    )


if __name__ == "__main__":
    main()
