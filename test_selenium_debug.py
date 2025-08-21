#!/usr/bin/env python3
"""
Test script for Selenium authentication with browser kept open for debugging.

This script demonstrates how to use the new keep-open functionality
to debug the authentication process visually.
"""

import sys
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, str(Path(__file__).parent))

from meijer.okta_selenium_auth import authenticate_with_selenium_and_keep_open


def main():
    """Main test function."""
    print("🔍 Selenium Authentication Debug Test")
    print("=" * 50)
    print("This will open a browser window and keep it open for debugging")
    print()
    
    # Get credentials
    username = input("👤 Username/Email: ").strip()
    password = input("🔒 Password: ").strip()
    
    if not username or not password:
        print("❌ Username and password are required")
        return
    
    print(f"\n🚀 Starting authentication for {username}")
    print("🔍 Browser will be kept open for debugging")
    print("💡 You can watch the authentication process and debug visually")
    print()
    
    try:
        # Use the keep-open version
        result = authenticate_with_selenium_and_keep_open(
            username=username,
            password=password,
            headless=False  # Always show browser for debugging
        )
        
        if result and result.get("success"):
            print("\n🎉 Authentication successful!")
            print(f"🔑 Authorization code: {result.get('authorization_code', 'N/A')}")
            print(f"🌐 Final URL: {result.get('url', 'N/A')}")
            print(f"📄 Page title: {result.get('title', 'N/A')}")
        else:
            print("\n❌ Authentication failed or incomplete")
            if result:
                print(f"📊 Result: {result}")
        
        print("\n🔍 Browser window is still open for debugging")
        print("💡 You can:")
        print("   - Inspect the current page")
        print("   - Check for error messages")
        print("   - Verify the authentication flow")
        print("   - Close the browser manually when done")
        
        # Keep the script running so browser stays open
        input("\n⏸️ Press Enter when you're done debugging and want to close the browser...")
        
        print("✅ Debug session complete")
        
    except KeyboardInterrupt:
        print("\n⏹️ Interrupted by user")
    except Exception as e:
        print(f"\n❌ Error during authentication: {e}")
        print("🔍 Browser window may still be open for debugging")


if __name__ == "__main__":
    main()
