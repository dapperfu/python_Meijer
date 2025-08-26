#!/usr/bin/env python3
"""
Test script to verify shopping list access after authentication.
This will test if the headless login actually provides working API access.
"""

import sys
import os
import json

sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from meijer.client import Meijer


def test_shopping_list_access():
    """Test if we can access the shopping list after authentication."""

    print("🧪 Testing Shopping List Access After Authentication")
    print("=" * 50)

    # Check if auth.json exists
    if not os.path.exists("auth.json"):
        print("❌ No auth.json found. Please run the headless login first.")
        return False

    try:
        # Load tokens from auth.json
        with open("auth.json", "r") as f:
            tokens = json.load(f)

        print("🔑 Tokens loaded from auth.json:")
        print(
            f"  Access Token: {tokens.get('access_token', 'None')[:20] if tokens.get('access_token') else 'None'}..."
        )
        print(
            f"  ID Token: {tokens.get('id_token', 'None')[:20] if tokens.get('id_token') else 'None'}..."
        )
        print()

        # Create Meijer client with tokens
        client = Meijer()

        # Try to get shopping list
        print("🛒 Attempting to access shopping list...")
        try:
            shopping_list = client.shopping_list.get_list()
            print("✅ Shopping list access successful!")
            print(f"📋 List items: {len(shopping_list)}")

            # Show first few items
            for i, item in enumerate(shopping_list[:3]):
                print(f"  {i + 1}. {item.name} - {item.quantity}")

            if len(shopping_list) > 3:
                print(f"  ... and {len(shopping_list) - 3} more items")

            return True

        except Exception as e:
            print(f"❌ Shopping list access failed: {e}")
            return False

    except Exception as e:
        print(f"❌ Error testing shopping list access: {e}")
        return False


if __name__ == "__main__":
    success = test_shopping_list_access()
    if success:
        print("\n🎉 SUCCESS: Headless login provides working API access!")
    else:
        print("\n❌ FAILED: Headless login does not provide working API access.")
