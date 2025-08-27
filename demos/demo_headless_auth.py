#!/usr/bin/env python3
"""
Demo script for testing the three authentication methods:
1. Pure requests - Fully headless using only HTTP calls
2. Hybrid-selenium - Minimal browser usage for cookie/header generation
3. Full selenium - Complete browser automation
"""

import logging
import sys
from pathlib import Path

# Add the parent directory to the path so we can import the meijer module
sys.path.insert(0, str(Path(__file__).parent.parent))

from meijer.headless_auth_client import create_headless_client

# Configure logging
logging.basicConfig(
    level=logging.INFO, format="%(asctime)s - %(name)s - %(levelname)s - %(message)s"
)


def test_requests_method():
    """Test the pure requests authentication method."""
    print("\n" + "=" * 60)
    print("🔍 TESTING PURE REQUESTS METHOD")
    print("=" * 60)

    try:
        # Create client with requests method
        client = create_headless_client(method="requests")

        # Get credentials from ~/.config/meijer/login.txt
        login_file = Path.home() / ".config" / "meijer" / "login.txt"

        if not login_file.exists():
            print(f"❌ Login file not found: {login_file}")
            return False

        try:
            with open(login_file, "r") as f:
                lines = f.readlines()
                if len(lines) >= 2:
                    username = lines[0].strip()
                    password = lines[1].strip()
                else:
                    print(
                        "❌ login.txt must contain username and password on separate lines"
                    )
                    return False
        except Exception as e:
            print(f"❌ Error reading {login_file}: {e}")
            return False

        print(f"👤 Username: {username}")
        print(f"🔑 Password: {'*' * len(password)}")
        print()

        # Attempt login
        print("🚀 Starting pure requests authentication...")
        success = client.login(username, password)

        if success:
            print("✅ Pure requests authentication successful!")
            print(f"🔐 Authenticated: {client.is_authenticated()}")

            # Test the session
            try:
                session = client.get_session()
                print(f"📡 Session created: {type(session)}")
                print(f"🍪 Cookies: {len(session.cookies)}")

                # Show some cookies
                for cookie in list(session.cookies)[:5]:
                    print(f"   {cookie.name}: {cookie.value[:50]}...")

            except Exception as e:
                print(f"❌ Error testing session: {e}")

            return True
        else:
            print("❌ Pure requests authentication failed")
            return False

    except Exception as e:
        print(f"💥 Error in requests method: {e}")
        import traceback

        traceback.print_exc()
        return False


def test_hybrid_method():
    """Test the hybrid-selenium authentication method."""
    print("\n" + "=" * 60)
    print("🔄 TESTING HYBRID-SELENIUM METHOD")
    print("=" * 60)

    try:
        # Create client with hybrid method
        client = create_headless_client(method="hybrid", headless=True)

        # Get credentials from ~/.config/meijer/login.txt
        login_file = Path.home() / ".config" / "meijer" / "login.txt"

        if not login_file.exists():
            print(f"❌ Login file not found: {login_file}")
            return False

        try:
            with open(login_file, "r") as f:
                lines = f.readlines()
                if len(lines) >= 2:
                    username = lines[0].strip()
                    password = lines[1].strip()
                else:
                    print(
                        "❌ login.txt must contain username and password on separate lines"
                    )
                    return False
        except Exception as e:
            print(f"❌ Error reading {login_file}: {e}")
            return False

        print(f"👤 Username: {username}")
        print(f"🔑 Password: {'*' * len(password)}")
        print()

        # Attempt login
        print("🚀 Starting hybrid-selenium authentication...")
        success = client.login(username, password)

        if success:
            print("✅ Hybrid-selenium authentication successful!")
            print(f"🔐 Authenticated: {client.is_authenticated()}")

            # Test the session
            try:
                session = client.get_session()
                print(f"📡 Session created: {type(session)}")
                print(f"🍪 Cookies: {len(session.cookies)}")

                # Show some cookies
                for cookie in list(session.cookies)[:5]:
                    print(f"   {cookie.name}: {cookie.value[:50]}...")

            except Exception as e:
                print(f"❌ Error testing session: {e}")

            return True
        else:
            print("❌ Hybrid-selenium authentication failed")
            return False

    except Exception as e:
        print(f"💥 Error in hybrid method: {e}")
        import traceback

        traceback.print_exc()
        return False


def test_selenium_method():
    """Test the full selenium authentication method."""
    print("\n" + "=" * 60)
    print("🌐 TESTING FULL SELENIUM METHOD")
    print("=" * 60)

    try:
        # Create client with selenium method
        client = create_headless_client(method="selenium", headless=True)

        # Get credentials from ~/.config/meijer/login.txt
        login_file = Path.home() / ".config" / "meijer" / "login.txt"

        if not login_file.exists():
            print(f"❌ Login file not found: {login_file}")
            return False

        try:
            with open(login_file, "r") as f:
                lines = f.readlines()
                if len(lines) >= 2:
                    username = lines[0].strip()
                    password = lines[1].strip()
                else:
                    print(
                        "❌ login.txt must contain username and password on separate lines"
                    )
                    return False
        except Exception as e:
            print(f"❌ Error reading {login_file}: {e}")
            return False

        print(f"👤 Username: {username}")
        print(f"🔑 Password: {'*' * len(password)}")
        print()

        # Attempt login
        print("🚀 Starting full selenium authentication...")
        success = client.login(username, password)

        if success:
            print("✅ Full selenium authentication successful!")
            print(f"🔐 Authenticated: {client.is_authenticated()}")

            # Test the session
            try:
                session = client.get_session()
                print(f"📡 Session created: {type(session)}")
                print(f"🍪 Cookies: {len(session.cookies)}")

                # Show some cookies
                for cookie in list(session.cookies)[:5]:
                    print(f"   {cookie.name}: {cookie.value[:50]}...")

            except Exception as e:
                print(f"❌ Error testing session: {e}")

            return True
        else:
            print("❌ Full selenium authentication failed")
            return False

    except Exception as e:
        print(f"💥 Error in selenium method: {e}")
        import traceback

        traceback.print_exc()
        return False


def main():
    """Main function to test all authentication methods."""
    print("🚀 MEIJER HEADLESS AUTHENTICATION DEMO")
    print("=" * 60)
    print("This demo tests three authentication methods:")
    print("1. 📡 Pure requests - Fully headless using only HTTP calls")
    print("2. 🔄 Hybrid-selenium - Minimal browser usage for cookie/header generation")
    print("3. 🌐 Full selenium - Complete browser automation")
    print()

    # Check if credentials are available
    login_file = Path.home() / ".config" / "meijer" / "login.txt"

    if not login_file.exists():
        print("❌ Login file not found!")
        print(f"Please create: {login_file}")
        print("With the following format:")
        print("   your_email@example.com")
        print("   your_password")
        print()
        return

    try:
        with open(login_file, "r") as f:
            lines = f.readlines()
            if len(lines) >= 2:
                username = lines[0].strip()
                password = lines[1].strip()
            else:
                print(
                    "❌ login.txt must contain username and password on separate lines"
                )
                return
    except Exception as e:
        print(f"❌ Error reading {login_file}: {e}")
        return

    print(f"✅ Credentials found: {username}")
    print()

    # Test results
    results = {}

    # Test 1: Pure requests method
    print("🔍 Testing Method 1: Pure Requests")
    results["requests"] = test_requests_method()

    # Test 2: Hybrid method
    print("\n🔍 Testing Method 2: Hybrid-Selenium")
    results["hybrid"] = test_hybrid_method()

    # Test 3: Full selenium method
    print("\n🔍 Testing Method 3: Full Selenium")
    results["selenium"] = test_selenium_method()

    # Summary
    print("\n" + "=" * 60)
    print("📊 AUTHENTICATION METHOD TEST RESULTS")
    print("=" * 60)

    for method, success in results.items():
        status = "✅ SUCCESS" if success else "❌ FAILED"
        print(f"{method.upper():15}: {status}")

    print()

    # Recommendations
    print("💡 RECOMMENDATIONS:")
    if results["requests"]:
        print("   • Pure requests method works - use this for production")
    elif results["hybrid"]:
        print("   • Hybrid method works - good balance of reliability and speed")
    elif results["selenium"]:
        print("   • Full selenium method works - most reliable but slowest")
    else:
        print("   • All methods failed - check credentials and network connectivity")

    print()
    print("🎯 Next steps:")
    print("   • Check auth.json for saved tokens")
    print("   • Use the working method in your application")
    print("   • Monitor for any rate limiting or bot detection")


if __name__ == "__main__":
    main()
