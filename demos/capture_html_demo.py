#!/usr/bin/env python3
"""
Demo script for HTML page capture during authentication.

This script demonstrates how to capture HTML pages to /tmp/ for analysis
during the Meijer authentication process.
"""

import sys
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, str(Path(__file__).parent.parent))

from meijer.okta_selenium_auth import authenticate_with_selenium_and_keep_open


def demo_html_capture():
    """Demonstrate HTML page capture during authentication."""
    print("🚀 HTML Page Capture Demo for Meijer Authentication")
    print("=" * 60)

    # Get credentials
    print("🔐 Enter your Meijer credentials:")
    username = input("Username/Email: ").strip()
    password = input("Password: ").strip()

    if not username or not password:
        print("❌ Username and password are required")
        return False

    print(f"\n👤 Starting authentication for: {username}")
    print("🌐 Using Selenium with HTML capture enabled")
    print("📄 All pages will be captured to /tmp/ for analysis")
    print("🔍 Browser will stay open for debugging")

    try:
        # Start authentication with keep-open mode
        auth = authenticate_with_selenium_and_keep_open(
            username=username,
            password=password,
            headless=False,  # Non-headless for debugging
        )

        if auth:
            print("\n✅ Authentication process completed!")
            print("🔍 Browser remains open for inspection")
            print("📄 HTML pages have been captured to /tmp/")
            print("\n📁 Captured files in /tmp/:")

            # List captured files
            import glob
            import os

            captured_files = glob.glob("/tmp/meijer_auth_*.html")
            if captured_files:
                for file in sorted(captured_files):
                    file_size = os.path.getsize(file)
                    print(f"   📄 {os.path.basename(file)} ({file_size} bytes)")
            else:
                print("   📭 No HTML files captured yet")

            print("\n💡 You can now:")
            print("   1. Inspect the browser manually")
            print(
                "   2. Use auth.capture_current_page('custom_step') to capture more pages"
            )
            print("   3. Analyze the HTML files in /tmp/")
            print("   4. Close the browser when done")

            return True
        else:
            print("\n❌ Authentication failed")
            print("📄 Check /tmp/ for any captured HTML files")
            return False

    except Exception as e:
        print(f"\n❌ Demo failed: {e}")
        return False


def main():
    """Main function."""
    print("🚀 HTML Page Capture Demo")
    print("=" * 60)
    print("🌐 This demo captures HTML pages during authentication")
    print("📄 Perfect for analyzing rate limiting and error pages")
    print("🔍 Browser stays open for manual inspection")
    print()

    print("📋 What this demo does:")
    print("1. Starts Selenium authentication")
    print("2. Captures HTML of each step to /tmp/")
    print("3. Keeps browser open for debugging")
    print("4. Shows you how to capture additional pages")
    print()

    # Check if user wants to proceed
    proceed = input("Ready to start? (y/n): ").strip().lower()
    if proceed != "y":
        print("❌ Demo cancelled")
        return

    # Run the demo
    success = demo_html_capture()

    if success:
        print("\n🎉 Demo completed successfully!")
        print("📄 HTML pages captured to /tmp/ for analysis")
        print("🔍 Browser remains open for manual inspection")
    else:
        print("\n❌ Demo failed. Check the error messages above.")

    print("\n" + "=" * 60)
    print("📚 For more information:")
    print("   meijer login --method selenium --keep-open")
    print("   python demos/test_proxy_2fa.py")


if __name__ == "__main__":
    main()
