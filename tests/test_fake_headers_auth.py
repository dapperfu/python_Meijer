#!/usr/bin/env python3
"""
Test script for Enhanced Meijer Authentication v2 - Fake Headers

This script demonstrates the new authentication method that uses fake headers
instead of Selenium, based on analysis of actual mitmproxy logs.

Author: Claude Sonnet 4 (claude-3-5-sonnet-20241022)
Generated via Cursor IDE (cursor.sh) with AI assistance
"""

import getpass
import sys
from pathlib import Path

# Add the project root to the path
project_root = Path(__file__).parent
sys.path.insert(0, str(project_root))

from meijer.enhanced_auth_v2 import EnhancedMeijerAuthV2


def test_fake_headers_auth():
    """Test the fake headers authentication method."""
    print("🔐 Enhanced Meijer Authentication v2 - Fake Headers Test")
    print("=" * 60)

    # Get credentials
    username = input("Enter Meijer username/email: ").strip()
    password = getpass.getpass("Enter Meijer password: ").strip()

    # Check if email 2FA config exists
    email_config_path = Path.home() / ".config" / "meijer" / "email.txt"
    email_2fa_config = None

    if email_config_path.exists():
        use_email_2fa = input("Email 2FA config found. Use it? (y/n): ").strip().lower()
        if use_email_2fa == "y":
            email_2fa_config = str(email_config_path)
            print(f"✅ Using email 2FA config: {email_config_path}")
    else:
        print("ℹ️  No email 2FA config found. MFA will not be handled automatically.")

    print("\n🚀 Starting authentication flow...")
    print("-" * 40)

    try:
        # Create auth instance
        auth = EnhancedMeijerAuthV2(username, password, email_2fa_config)

        print("📋 Authentication flow steps:")
        print("1. OAuth2 authorization request")
        print("2. IDX introspect")
        print("3. Device fingerprint")
        print("4. Username submission")
        print("5. Password challenge")
        print("6. Token exchange")
        print()

        # Perform authentication
        tokens = auth.authenticate()

        print("✅ Authentication successful!")
        print("\n🔑 Tokens received:")
        for key, value in tokens.items():
            if key in ["access_token", "refresh_token", "id_token"]:
                # Truncate long tokens for display
                display_value = value[:50] + "..." if len(value) > 50 else value
                print(f"  {key}: {display_value}")
            else:
                print(f"  {key}: {value}")

        print(f"\n🍪 Session cookies: {len(auth.get_session_cookies())} cookies")
        print(f"📋 Session headers: {len(auth.get_session_headers())} headers")

        return True

    except Exception as e:
        print(f"❌ Authentication failed: {str(e)}")
        print(f"Error type: {type(e).__name__}")
        return False


def test_step_by_step():
    """Test the authentication flow step by step for debugging."""
    print("\n🔍 Step-by-step authentication test")
    print("=" * 40)

    username = input("Enter Meijer username/email: ").strip()
    password = getpass.getpass("Enter Meijer password: ").strip()

    try:
        auth = EnhancedMeijerAuthV2(username, password)

        print("\n1️⃣ Getting OAuth authorization page...")
        auth._get_oauth_authorization_page()
        print(f"   ✅ State token: {auth.flow_state.state_token[:50]}...")

        print("\n2️⃣ IDX introspect...")
        result = auth._idx_introspect()
        print(f"   ✅ State handle: {auth.flow_state.state_handle[:50]}...")

        print("\n3️⃣ Device fingerprint...")
        fp = auth._get_device_fingerprint()
        print(f"   ✅ Fingerprint: {fp}")

        print("\n4️⃣ Submitting identifier...")
        result = auth._submit_identifier()
        print(f"   ✅ Updated state handle: {auth.flow_state.state_handle[:50]}...")

        print("\n5️⃣ Submitting password...")
        try:
            result = auth._submit_password()
            print("   ✅ Password accepted")
        except Exception as e:
            print(f"   ⚠️  Password step: {str(e)}")

        print("\n✅ Step-by-step test completed!")

    except Exception as e:
        print(f"❌ Step-by-step test failed: {str(e)}")


def main():
    """Main test function."""
    print("🧪 Enhanced Meijer Authentication v2 Test Suite")
    print("=" * 60)

    while True:
        print("\nSelect test option:")
        print("1. Full authentication test")
        print("2. Step-by-step test (debug)")
        print("3. Exit")

        choice = input("\nEnter choice (1-3): ").strip()

        if choice == "1":
            test_fake_headers_auth()
        elif choice == "2":
            test_step_by_step()
        elif choice == "3":
            print("👋 Goodbye!")
            break
        else:
            print("❌ Invalid choice. Please enter 1, 2, or 3.")


if __name__ == "__main__":
    main()
