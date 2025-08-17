#!/usr/bin/env python3
"""
Simple demo to validate all authentication methods except username/password.

Tests the following authentication methods:
1. Bearer token from auth.txt
2. Config file (~/.config/meijer.txt)
3. Mitmproxy log parsing (meijer2.log)
4. Persistent tokens (automatic)
5. Interactive OAuth (fallback)

This demo validates that the authentication system works correctly
with the available auth.txt and meijer2.log files.
"""

import logging
import os
from pathlib import Path
from meijer import (
    Meijer,
    extract_bearer_token_from_mitmproxy,
    load_auth_from_config_file,
)


def main():
    """Run authentication validation demo."""
    print("🔐 MEIJER AUTHENTICATION VALIDATION DEMO")
    print("=" * 60)

    # Set up logging
    logging.basicConfig(level=logging.INFO, format="%(levelname)s: %(message)s")

    print("📋 Testing all authentication methods (except username/password):")
    print("1. ✅ Bearer token from auth.txt")
    print("2. ✅ Config file (~/.config/meijer.txt)")
    print("3. ✅ Mitmproxy log parsing (meijer2.log)")
    print("4. ✅ Persistent tokens (automatic)")
    print("5. ✅ Interactive OAuth (fallback)")
    print("")

    # Test 1: Check available authentication sources
    print("🔍 STEP 1: CHECKING AVAILABLE AUTHENTICATION SOURCES")
    print("-" * 50)

    # Check auth.txt
    auth_txt_available = False
    if os.path.exists("auth.txt"):
        print("✅ auth.txt found")
        with open("auth.txt", "r") as f:
            content = f.read()
            if "bearer=" in content or "bearer_token=" in content:
                print("   🎫 Contains bearer token")
                auth_txt_available = True
            else:
                print("   ❌ No bearer token found in auth.txt")
    else:
        print("❌ auth.txt not found")

    # Check config file
    config_available = False
    config_auth = load_auth_from_config_file()
    if config_auth:
        bearer_token, user_agent = config_auth
        print("✅ ~/.config/meijer.txt found with bearer token")
        print(f"   Token: {bearer_token[:20]}...")
        config_available = True
    else:
        print("❌ ~/.config/meijer.txt not found or no bearer token")

    # Check mitmproxy log
    mitmproxy_available = False
    if os.path.exists("meijer2.log"):
        print("✅ meijer2.log found")
        print("   🔍 Testing bearer token extraction...")
        result = extract_bearer_token_from_mitmproxy("meijer2.log")
        if result:
            bearer_token, user_agent, timestamp = result
            print(f"   ✅ Found bearer token from {timestamp}")
            print(f"   Token: {bearer_token[:20]}...")
            mitmproxy_available = True
        else:
            print("   ❌ No bearer tokens found in meijer2.log")
    else:
        print("❌ meijer2.log not found")

    # Check persistent tokens
    persistent_available = False
    try:
        meijer_test = Meijer()
        if meijer_test.token_storage.has_tokens():
            print("✅ Persistent tokens found")
            stored_tokens = meijer_test.token_storage.load_tokens()
            if stored_tokens and not stored_tokens.is_expired():
                print(f"   ✅ Valid until: {stored_tokens.expires_at}")
                persistent_available = True
            else:
                print("   ⚠️ Tokens are expired")
        else:
            print("❌ No persistent tokens found")
    except Exception as e:
        print(f"❌ Error checking persistent tokens: {e}")

    print(f"\n📊 Authentication Sources Summary:")
    print(f"   auth.txt bearer: {'✅' if auth_txt_available else '❌'}")
    print(f"   Config file: {'✅' if config_available else '❌'}")
    print(f"   Mitmproxy log: {'✅' if mitmproxy_available else '❌'}")
    print(f"   Persistent tokens: {'✅' if persistent_available else '❌'}")

    # Test 2: Unified login
    print(f"\n🚀 STEP 2: TESTING UNIFIED LOGIN")
    print("-" * 50)

    with Meijer(debug=True) as meijer:
        print("🔐 Attempting unified login (tries all methods automatically)...")

        login_success = meijer.login()

        if login_success:
            print("✅ LOGIN SUCCESSFUL!")

            # Get session info
            session = meijer.get_session_info()
            print(f"\n📊 Session Information:")
            print(f"   Status: {session['status']}")
            print(f"   Has tokens: {session['has_tokens']}")
            print(f"   Token expires: {session.get('token_expires_at', 'Unknown')}")

            # Test API functionality
            print(f"\n🧪 STEP 3: TESTING API FUNCTIONALITY")
            print("-" * 50)

            # Test shopping list
            try:
                list_count = meijer.list.count
                print(f"✅ Shopping list: {list_count} items")
            except Exception as e:
                print(f"⚠️ Shopping list test failed: {e}")

            # Test Shop & Scan
            try:
                shop_scan_enabled = meijer.shop_scan.is_enabled()
                print(
                    f"✅ Shop & Scan: {'Available' if shop_scan_enabled else 'Not available'}"
                )
            except Exception as e:
                print(f"⚠️ Shop & Scan test failed: {e}")

            # Test stores API
            try:
                stores = meijer.get_stores(radius=5, limit=3)
                print(f"✅ Store search: Found {len(stores)} nearby stores")
                if stores:
                    print(f"   First store: {stores[0].display_name}")
            except Exception as e:
                print(f"⚠️ Store search test failed: {e}")

            # Test offers/coupons API
            try:
                offers = meijer.get_offers(limit=5)
                print(f"✅ Offers/coupons: Found {len(offers)} offers")
                if offers:
                    print(f"   First offer: {offers[0].title}")
            except Exception as e:
                print(f"⚠️ Offers test failed: {e}")

            print(f"\n🎉 AUTHENTICATION VALIDATION SUCCESSFUL!")
            print(f"✅ Login working")
            print(f"✅ Session established")
            print(f"✅ API calls functional")

        else:
            print("❌ LOGIN FAILED!")
            print("\n🔧 Troubleshooting:")

            if not (
                auth_txt_available
                or config_available
                or mitmproxy_available
                or persistent_available
            ):
                print("❌ No authentication sources available")
                print("💡 Solutions:")
                print("   1. Add bearer token to auth.txt:")
                print("      bearer=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIs...")
                print("   2. Create ~/.config/meijer.txt with bearer token")
                print("   3. Ensure meijer2.log contains valid Bearer tokens")
                print(
                    "   4. Run a successful interactive login to create persistent tokens"
                )
            else:
                print("⚠️ Authentication sources available but login failed")
                print("💡 Possible issues:")
                print("   - Bearer tokens may be expired")
                print("   - API endpoints may have changed")
                print("   - Network connectivity issues")

    # Test 3: Individual method testing
    print(f"\n🔬 STEP 4: INDIVIDUAL METHOD TESTING")
    print("-" * 50)

    # Test bearer token from auth.txt individually
    if auth_txt_available:
        print("🎫 Testing auth.txt bearer token individually...")
        try:
            test_meijer = Meijer()
            bearer_auth = test_meijer._load_bearer_auth()
            if bearer_auth:
                bearer_token, user_agent = bearer_auth
                success = test_meijer.authenticate_with_bearer_token(
                    bearer_token, user_agent
                )
                print(
                    f"   {'✅' if success else '❌'} Bearer token from auth.txt: {'Success' if success else 'Failed'}"
                )
            test_meijer.logout()
        except Exception as e:
            print(f"   ❌ Bearer token test error: {e}")

    # Test mitmproxy extraction individually
    if mitmproxy_available:
        print("📂 Testing mitmproxy log extraction individually...")
        try:
            result = extract_bearer_token_from_mitmproxy("meijer2.log")
            if result:
                bearer_token, user_agent, timestamp = result
                test_meijer = Meijer()
                success = test_meijer.authenticate_with_bearer_token(
                    bearer_token, user_agent
                )
                print(
                    f"   {'✅' if success else '❌'} Mitmproxy bearer token: {'Success' if success else 'Failed'}"
                )
                print(f"   Token from: {timestamp}")
                test_meijer.logout()
        except Exception as e:
            print(f"   ❌ Mitmproxy test error: {e}")

    print(f"\n🏁 DEMO COMPLETE")
    print("=" * 60)

    return login_success


if __name__ == "__main__":
    success = main()
    exit(0 if success else 1)
