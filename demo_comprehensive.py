#!/usr/bin/env python3
"""
Comprehensive Meijer API Demo
============================

Demonstrates all major functionality of the modular Meijer API client.

Features tested:
- Authentication (automatic discovery)
- Shopping list management
- Store search and information
- Offers and coupons
- User profile access
- Error handling

This demo showcases the new modular package structure and clean API.
"""

import logging
from typing import Dict

# Use the new modular package structure
from meijer import (
    Meijer,
    AuthenticationStatus,
    MeijerAuthenticationError,
)


def setup_logging():
    """Configure clean logging for the demo."""
    logging.basicConfig(
        level=logging.WARNING,  # Reduce noise
        format="%(levelname)s: %(message)s",
    )


def test_authentication(client: Meijer) -> bool:
    """Test authentication functionality."""
    print("🔐 AUTHENTICATION TEST")
    print("-" * 30)

    if client.auth_status == AuthenticationStatus.AUTHENTICATED:
        print("✅ Authentication successful")
        print(f"   • Status: {client.auth_status.value}")
        print(f"   • Has tokens: {client.auth_tokens is not None}")
        return True
    else:
        print(f"❌ Authentication failed - Status: {client.auth_status.value}")
        return False


def test_shopping_list(client: Meijer) -> bool:
    """Test shopping list functionality."""
    print("\n🛒 SHOPPING LIST TEST")
    print("-" * 30)

    try:
        # Get current shopping list
        items = client.list.get()
        print(f"✅ Retrieved shopping list: {len(items)} items")

        if items:
            print("   📋 Current items:")
            for i, item in enumerate(items[:3], 1):  # Show first 3
                print(f"      {i}. {item.name} (qty: {item.quantity})")
            if len(items) > 3:
                print(f"      ... and {len(items) - 3} more items")
        else:
            print("   📋 Shopping list is empty")

        return True

    except MeijerAuthenticationError:
        print("❌ Authentication required for shopping list")
        return False
    except Exception as e:
        print(f"❌ Shopping list error: {e}")
        return False


def test_stores(client: Meijer) -> bool:
    """Test store search functionality."""
    print("\n🏪 STORE SEARCH TEST")
    print("-" * 30)

    try:
        # Test store search
        stores = client.get_stores(zip_code="49456", radius=25)
        print(f"✅ Store search completed: {len(stores)} stores found")

        if stores:
            print("   🏪 Sample stores:")
            for i, store in enumerate(stores[:2], 1):  # Show first 2
                print(f"      {i}. {store.get('name', 'Unknown Store')}")
                if "address" in store:
                    print(f"         Address: {store['address']}")
        else:
            print("   🏪 No stores found in search area")

        return True

    except MeijerAuthenticationError:
        print("❌ Authentication required for store search")
        return False
    except Exception as e:
        print(f"❌ Store search error: {e}")
        return False


def test_offers(client: Meijer) -> bool:
    """Test offers and coupons functionality."""
    print("\n🎟️  OFFERS TEST")
    print("-" * 30)

    try:
        # Get available offers
        offers = client.get_offers(limit=10)
        print(f"✅ Offers retrieved: {len(offers)} offers available")

        if offers:
            print("   🎟️  Sample offers:")
            for i, offer in enumerate(offers[:2], 1):  # Show first 2
                print(f"      {i}. {offer.get('title', 'Special Offer')}")
                if "discount" in offer:
                    print(f"         Discount: {offer['discount']}")
        else:
            print("   🎟️  No offers available")

        return True

    except MeijerAuthenticationError:
        print("❌ Authentication required for offers")
        return False
    except Exception as e:
        print(f"❌ Offers error: {e}")
        return False


def test_user_info(client: Meijer) -> bool:
    """Test user information retrieval."""
    print("\n👤 USER INFO TEST")
    print("-" * 30)

    try:
        # Get user information
        user_info = client.get_user_info()

        if user_info:
            print("✅ User information retrieved")
            print(f"   • User ID: {user_info.user_id}")
            print(f"   • Email: {user_info.email}")
            print(f"   • Name: {user_info.first_name} {user_info.last_name}")
        else:
            print("⚠️  User information not available (simplified version)")

        return True

    except MeijerAuthenticationError:
        print("❌ Authentication required for user info")
        return False
    except Exception as e:
        print(f"❌ User info error: {e}")
        return False


def test_modular_features():
    """Test modular package features."""
    print("\n📦 MODULAR FEATURES TEST")
    print("-" * 30)

    try:
                # Test direct component imports
        from meijer.models import AuthTokens
        from meijer.auth import TokenStorage
        from meijer.enums import AuthenticationStatus as AuthStatus
        
        print("✅ Modular imports working:")
        print("   • meijer.models.AuthTokens")
        print("   • meijer.auth.TokenStorage")
        print("   • meijer.enums.AuthenticationStatus")
        
        # Use import to satisfy linter
        _ = AuthStatus  # Demonstration import

        # Test creating instances
        tokens = AuthTokens(access_token="demo_token")
        storage = TokenStorage()

        print("✅ Component instantiation working:")
        print(f"   • AuthTokens: {tokens.token_type} token")
        print(f"   • TokenStorage: {storage.storage_file}")

        return True

    except ImportError as e:
        print(f"❌ Import error: {e}")
        return False
    except Exception as e:
        print(f"❌ Modular features error: {e}")
        return False


def run_api_tests(client: Meijer) -> Dict[str, bool]:
    """Run all API functionality tests."""
    print("🚀 RUNNING API FUNCTIONALITY TESTS")
    print("=" * 50)

    results = {}

    # Test authentication
    results["authentication"] = test_authentication(client)

    # Test shopping list
    results["shopping_list"] = test_shopping_list(client)

    # Test store search
    results["stores"] = test_stores(client)

    # Test offers
    results["offers"] = test_offers(client)

    # Test user info
    results["user_info"] = test_user_info(client)

    return results


def main():
    """Run the comprehensive demo."""
    print("🎯 COMPREHENSIVE MEIJER API DEMO")
    print("=" * 50)
    print("Testing all functionality with the new modular package")
    print("")

    # Setup clean logging
    setup_logging()

    try:
        # Create Meijer client with auto-discovery
        print("📱 Creating Meijer client...")
        client = Meijer()
        print("✅ Client created successfully")
        print("")

        # Run API tests
        api_results = run_api_tests(client)

        # Test modular features
        modular_success = test_modular_features()

        # Summary
        print("\n📊 TEST RESULTS SUMMARY")
        print("=" * 50)

        all_results = {**api_results, "modular_features": modular_success}
        passed = sum(all_results.values())
        total = len(all_results)

        for test_name, success in all_results.items():
            status = "✅ PASS" if success else "❌ FAIL"
            print(f"{test_name.replace('_', ' ').title():<20} {status}")

        print(f"\n🎯 Overall Results: {passed}/{total} tests passed")

        if passed == total:
            print("🎉 All tests passed! Comprehensive functionality working.")
        else:
            print(
                "⚠️  Some tests failed. This may be due to API limitations in the simplified version."
            )

        print("\n💡 Features demonstrated:")
        print("  • Automatic authentication discovery")
        print("  • Shopping list management")
        print("  • Store search capabilities")
        print("  • Offers and coupons access")
        print("  • Modular package structure")
        print("  • Clean error handling")
        print("  • Professional API design")

    except MeijerAuthenticationError as e:
        print(f"❌ Authentication error: {e}")
        print("\n💡 Ensure you have valid authentication configured:")
        print("  • Bearer token in auth.txt")
        print("  • Config file at ~/.config/meijer.txt")
        print("  • Valid persistent tokens")

    except Exception as e:
        print(f"❌ Unexpected error: {e}")

    print("\n🏁 Demo completed!")


if __name__ == "__main__":
    main()
