#!/usr/bin/env python3
"""
Test script for all 4 Meijer authentication methods.

Demonstrates the complete authentication system including mitmproxy log parsing.
"""

import logging
import os
from pathlib import Path

from meijer import (
    Meijer,
    extract_bearer_token_from_mitmproxy,
    load_auth_from_config_file,
)


def test_authentication_methods():
    """Test all 4 authentication methods in order."""
    print("🔐 TESTING ALL MEIJER AUTHENTICATION METHODS")
    print("=" * 60)

    logging.basicConfig(level=logging.INFO)

    print("\n📋 Available Authentication Methods:")
    print(
        "1. Username/Password (Selenium) - auth.txt with user=/pass= or username=/password="
    )
    print("2. Bearer token - auth.txt or bearer_auth.txt with bearer= or bearer_token=")
    print("3. Config file - ~/.config/meijer.txt with bearer=")
    print("4. Mitmproxy log - extract latest bearer token from log files")
    print("5. Persistent tokens - automatic restore from previous login")
    print("6. Interactive OAuth - manual browser authentication (fallback)")

    # Test each method individually

    # Method 1: Check for credentials
    print("\n" + "1️⃣ TESTING USERNAME/PASSWORD AUTHENTICATION")
    print("-" * 50)

    auth_files = ["auth.txt", "bearer_auth.txt"]
    credentials_found = False

    for auth_file in auth_files:
        if os.path.exists(auth_file):
            print(f"✅ Found auth file: {auth_file}")
            with open(auth_file, "r") as f:
                content = f.read()
                if any(
                    keyword in content
                    for keyword in ["user=", "username=", "pass=", "password="]
                ):
                    print("   📧 Contains credentials for Selenium auth")
                    credentials_found = True
                if any(keyword in content for keyword in ["bearer=", "bearer_token="]):
                    print("   🎫 Contains bearer token")
        else:
            print(f"❌ Auth file not found: {auth_file}")

    if not credentials_found:
        print("⚠️ No username/password credentials found")
        print("💡 Create auth.txt with:")
        print("   user=your_email@example.com")
        print("   pass=your_password")

    # Method 2: Check for bearer token in auth files
    print("\n" + "2️⃣ TESTING BEARER TOKEN FROM AUTH FILES")
    print("-" * 50)

    meijer = Meijer()
    bearer_auth = meijer._load_bearer_auth()

    if bearer_auth:
        bearer_token, user_agent = bearer_auth
        print(f"✅ Found bearer token in {meijer.bearer_auth_file}")
        print(f"   Token: {bearer_token[:20]}...")
        print(f"   User Agent: {user_agent[:50]}...")
    else:
        print(f"❌ No bearer token found in {meijer.bearer_auth_file}")
        print("💡 Create bearer_auth.txt with:")
        print("   bearer=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIs...")
        print("   user_agent=Meijer/101200000 okhttp/4.12.0...")

    # Method 3: Check for config file
    print("\n" + "3️⃣ TESTING CONFIG FILE AUTHENTICATION")
    print("-" * 50)

    config_auth = load_auth_from_config_file()

    if config_auth:
        bearer_token, user_agent = config_auth
        print("✅ Found bearer token in ~/.config/meijer.txt")
        print(f"   Token: {bearer_token[:20]}...")
        print(f"   User Agent: {user_agent[:50]}...")
    else:
        print("❌ No bearer token found in ~/.config/meijer.txt")
        print("💡 Create ~/.config/meijer.txt with:")
        print("   bearer=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIs...")
        print("   user_agent=Meijer/101200000 okhttp/4.12.0...")

    # Method 4: Check for mitmproxy logs
    print("\n" + "4️⃣ TESTING MITMPROXY LOG EXTRACTION")
    print("-" * 50)

    # Common mitmproxy log files
    possible_logs = [
        "meijer.log",
        "meijer2.log",
        "mitmproxy.log",
        "mitmdump.log",
        "flows.log",
    ]

    # Also check for .mitm files
    try:
        for mitm_file in Path(".").glob("*.mitm"):
            possible_logs.append(str(mitm_file))
    except:
        pass

    found_logs = []
    for log_file in possible_logs:
        if os.path.exists(log_file):
            found_logs.append(log_file)
            file_size = os.path.getsize(log_file)
            print(f"✅ Found mitmproxy log: {log_file} ({file_size:,} bytes)")

    if not found_logs:
        print("❌ No mitmproxy log files found")
        print("💡 Expected files: meijer.log, meijer2.log, mitmproxy.log, *.mitm")
    else:
        # Try to extract bearer token from the largest log file
        largest_log = max(found_logs, key=lambda f: os.path.getsize(f))
        print(f"🔍 Attempting to extract bearer token from: {largest_log}")

        try:
            result = extract_bearer_token_from_mitmproxy(largest_log)
            if result:
                bearer_token, user_agent, timestamp = result
                print(f"✅ Extracted bearer token from {largest_log}")
                print(f"   Token: {bearer_token[:20]}...")
                print(f"   User Agent: {user_agent[:50]}...")
                print(f"   Timestamp: {timestamp}")
            else:
                print(f"❌ No bearer tokens found in {largest_log}")
        except Exception as e:
            print(f"❌ Error parsing {largest_log}: {e}")

    # Method 5: Check for persistent tokens
    print("\n" + "5️⃣ TESTING PERSISTENT TOKEN STORAGE")
    print("-" * 50)

    if meijer.token_storage.has_tokens():
        print("✅ Found persistent tokens")
        stored_tokens = meijer.token_storage.load_tokens()
        if stored_tokens:
            if stored_tokens.is_expired():
                print("   ⚠️ Tokens are expired")
                if stored_tokens.refresh_token:
                    print("   🔄 Refresh token available")
                else:
                    print("   ❌ No refresh token available")
            else:
                print(f"   ✅ Tokens valid until: {stored_tokens.expires_at}")
    else:
        print("❌ No persistent tokens found")
        print("💡 Tokens will be saved automatically after successful login")

    # Now test the login
    print("\n" + "🚀 TESTING LOGIN")
    print("-" * 40)

    print("🔐 Attempting login (tries all methods automatically)...")

    with Meijer(debug=True) as test_meijer:
        if test_meijer.login():
            print("✅ LOGIN SUCCESSFUL!")

            session = test_meijer.get_session_info()
            print(f"   Status: {session['status']}")
            print(f"   Has tokens: {session['has_tokens']}")
            print(f"   Token expires: {session['token_expires_at']}")

            # Test functionality
            print("\n🧪 Testing API functionality...")
            try:
                # Test shopping list
                list_count = test_meijer.list.count
                print(f"   📋 Shopping list items: {list_count}")

                # Test Shop & Scan
                shop_scan_enabled = test_meijer.shop_scan.is_enabled()
                print(f"   🛒 Shop & Scan enabled: {shop_scan_enabled}")

            except Exception as e:
                print(f"   ⚠️ API test failed: {e}")

        else:
            print("❌ LOGIN FAILED")
            print("💡 Try setting up one of the authentication methods above")

    print("\n" + "=" * 60)
    print("🔐 AUTHENTICATION METHOD TEST COMPLETE")
    print("=" * 60)


def create_example_auth_files():
    """Create example authentication files for demonstration."""
    print("\n📝 CREATING EXAMPLE AUTHENTICATION FILES")
    print("-" * 50)

    # Example auth.txt with credentials
    example_auth = """# Meijer Authentication File
# Method 1: Username/Password (Selenium)
user=your_email@example.com
pass=your_password

# Method 2: Bearer Token
bearer=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6...
user_agent=Meijer/101200000 okhttp/4.12.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)
"""

    print("📄 Example auth.txt:")
    print(example_auth)

    # Example config file
    config_dir = Path.home() / ".config"
    example_config = """# Meijer Config File
bearer=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6...
user_agent=Meijer/101200000 okhttp/4.12.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)
"""

    print("📄 Example ~/.config/meijer.txt:")
    print(example_config)

    print("💡 To use these examples:")
    print(
        "1. Replace 'your_email@example.com' and 'your_password' with real credentials"
    )
    print("2. Replace the example bearer token with a real one from mitmproxy")
    print("3. Save the files and run the authentication test again")


if __name__ == "__main__":
    test_authentication_methods()
    create_example_auth_files()
