#!/usr/bin/env python3
"""
Utility script for managing Meijer authentication configuration.
Allows viewing, clearing, and testing saved tokens.
"""

import sys
import argparse
from meijer_comprehensive import MeijerComprehensiveClient


def view_config():
    """View current config status."""
    client = MeijerComprehensiveClient("dummy", "dummy")

    print("🔧 Meijer Authentication Config Status")
    print("=" * 50)
    print(f"📁 Config file: {client.config_file}")

    if not client.config_file.exists():
        print("❌ No config file found")
        return

    if client.auth_status.value == "authenticated":
        print("✅ Status: Authenticated")
        time_left = client.auth_tokens.time_until_expiry()
        print(f"⏰ Token expires in: {time_left}")
        print(
            f"🔑 Access token: {client.auth_tokens.access_token[:30]}...{client.auth_tokens.access_token[-15:]}"
        )
        print(
            f"🔄 Refresh token: {'Available' if client.auth_tokens.refresh_token else 'Not available'}"
        )
        print(f"🤖 User-Agent: {client.session.headers.get('User-Agent', 'Not set')}")
    else:
        print("❌ Status: Not authenticated or tokens expired")


def test_config():
    """Test current config by making an API call."""
    client = MeijerComprehensiveClient("dummy", "dummy")

    print("🧪 Testing Meijer API Access")
    print("=" * 30)

    if client.auth_status.value != "authenticated":
        print("❌ Not authenticated - no valid tokens in config")
        return False

    try:
        print("📡 Making test API call...")
        response = client.session.get(
            "https://api.meijer.com/loyalty/shoppinglist/GetList"
        )

        if response.status_code == 200:
            data = response.json()
            print("✅ API access successful!")
            print(f"📋 Shopping list: '{data.get('listName', 'Unknown')}'")
            print(f"📊 Total items: {data.get('totalCount', 0)}")
            return True
        elif response.status_code == 401:
            print("❌ Token expired or invalid (401)")
            print("💡 Try extracting a new token: python extract_bearer_token.py")
            return False
        else:
            print(f"⚠️  Unexpected response: {response.status_code}")
            print(f"Response: {response.text[:200]}...")
            return False

    except Exception as e:
        print(f"❌ API test failed: {e}")
        return False


def clear_config():
    """Clear saved configuration."""
    client = MeijerComprehensiveClient("dummy", "dummy")

    print("🗑️  Clearing Meijer Config")
    print("=" * 25)

    if not client.config_file.exists():
        print("ℹ️  No config file to clear")
        return

    success = client.clear_config()
    if success:
        print("✅ Config cleared successfully")
    else:
        print("❌ Failed to clear config")


def refresh_tokens():
    """Attempt to refresh tokens."""
    client = MeijerComprehensiveClient("dummy", "dummy")

    print("🔄 Refreshing Tokens")
    print("=" * 20)

    if client.auth_status.value != "authenticated":
        print("❌ Not authenticated - no tokens to refresh")
        return False

    if not client.auth_tokens.refresh_token:
        print("❌ No refresh token available")
        print("💡 Bearer tokens from logs don't include refresh tokens")
        return False

    success = client._refresh_tokens()
    if success:
        print("✅ Tokens refreshed successfully")
        time_left = client.auth_tokens.time_until_expiry()
        print(f"⏰ New expiration: {time_left}")
    else:
        print("❌ Token refresh failed")

    return success


def main():
    """Main entry point."""
    parser = argparse.ArgumentParser(
        description="Manage Meijer authentication configuration"
    )
    parser.add_argument(
        "action", choices=["view", "test", "clear", "refresh"], help="Action to perform"
    )

    if len(sys.argv) == 1:
        parser.print_help()
        print("\nAvailable actions:")
        print("  view    - View current config status")
        print("  test    - Test API access with current tokens")
        print("  clear   - Clear saved configuration")
        print("  refresh - Attempt to refresh tokens (if refresh token available)")
        return

    args = parser.parse_args()

    if args.action == "view":
        view_config()
    elif args.action == "test":
        test_config()
    elif args.action == "clear":
        clear_config()
    elif args.action == "refresh":
        refresh_tokens()


if __name__ == "__main__":
    main()
