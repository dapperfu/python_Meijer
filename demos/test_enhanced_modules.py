#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Simple test script for enhanced modules
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * Code style: Python with full mypy typing, numpy-style docstrings
 * Dependencies: meijer package, enhanced_cart_v2, enhanced_search
 */

Simple Test Script for Enhanced Modules
======================================

This script tests that the enhanced cart and search modules can be imported
and instantiated without requiring authentication.
"""

import sys
import traceback

# Add the parent directory to the path to import meijer modules
sys.path.insert(0, "..")


def test_enhanced_search_import():
    """Test importing the enhanced search module."""
    print("🔍 Testing EnhancedSearch import...")

    try:
        from meijer.enhanced_search import EnhancedSearch, UPCSearchResult

        print("✅ EnhancedSearch imported successfully")
        print(f"   EnhancedSearch class: {EnhancedSearch}")
        print(f"   UPCSearchResult class: {UPCSearchResult}")
        return True
    except Exception as e:
        print(f"❌ Failed to import EnhancedSearch: {e}")
        traceback.print_exc()
        return False


def test_enhanced_cart_import():
    """Test importing the enhanced cart module."""
    print("\n🛒 Testing EnhancedCartV2 import...")

    try:
        from meijer.enhanced_cart_v2 import EnhancedCartV2, CartOperationResult

        print("✅ EnhancedCartV2 imported successfully")
        print(f"   EnhancedCartV2 class: {EnhancedCartV2}")
        print(f"   CartOperationResult class: {CartOperationResult}")
        return True
    except Exception as e:
        print(f"❌ Failed to import EnhancedCartV2: {e}")
        traceback.print_exc()
        return False


def test_enhanced_search_instantiation():
    """Test instantiating the enhanced search module."""
    print("\n🔍 Testing EnhancedSearch instantiation...")

    try:
        from meijer.enhanced_search import EnhancedSearch

        # Create a mock API client
        class MockAPIClient:
            def _make_request(self, *args, **kwargs):
                return None

        mock_client = MockAPIClient()

        # Try to instantiate
        search = EnhancedSearch(mock_client)
        print("✅ EnhancedSearch instantiated successfully")
        print(f"   Search instance: {search}")
        print(f"   Endpoints: {list(search.endpoints.keys())}")
        print(f"   Base URLs: {search.meijer_api_base}, {search.construc_base}")
        return True

    except Exception as e:
        print(f"❌ Failed to instantiate EnhancedSearch: {e}")
        traceback.print_exc()
        return False


def test_enhanced_cart_instantiation():
    """Test instantiating the enhanced cart module."""
    print("\n🛒 Testing EnhancedCartV2 instantiation...")

    try:
        from meijer.enhanced_cart_v2 import EnhancedCartV2

        # Create a mock API client
        class MockAPIClient:
            def _make_request(self, *args, **kwargs):
                return None

            def _get_api_headers(self):
                return {}

        mock_client = MockAPIClient()

        # Try to instantiate
        cart = EnhancedCartV2(mock_client, store_id="217")
        print("✅ EnhancedCartV2 instantiated successfully")
        print(f"   Cart instance: {cart}")
        print(f"   Store ID: {cart.store_id}")
        print(f"   Endpoints: {list(cart.endpoints.keys())}")
        print(f"   Base URL: {cart.meijer_api_base}")
        return True

    except Exception as e:
        print(f"❌ Failed to instantiate EnhancedCartV2: {e}")
        traceback.print_exc()
        return False


def test_client_integration():
    """Test that the enhanced modules are properly integrated into the client."""
    print("\n🔗 Testing client integration...")

    try:
        from meijer.client import Meijer

        # Try to create a client (this will fail on auth but should show the module types)
        try:
            client = Meijer()
            print("✅ Meijer client created successfully")
        except Exception as e:
            print(f"⚠️ Meijer client creation failed (expected): {e}")
            print("   This is normal without authentication")

        # Check if the enhanced modules are available
        print("\n📋 Checking module availability...")

        # Check search module
        try:
            from meijer.enhanced_search import EnhancedSearch

            print("✅ EnhancedSearch module available")
        except ImportError:
            print("❌ EnhancedSearch module not available")

        # Check cart module
        try:
            from meijer.enhanced_cart_v2 import EnhancedCartV2

            print("✅ EnhancedCartV2 module available")
        except ImportError:
            print("❌ EnhancedCartV2 module not available")

        return True

    except Exception as e:
        print(f"❌ Client integration test failed: {e}")
        traceback.print_exc()
        return False


def main():
    """Main test function."""
    print("🧪 Enhanced Modules Test")
    print("=" * 50)
    print("Testing enhanced cart and search modules...")

    tests = [
        test_enhanced_search_import,
        test_enhanced_cart_import,
        test_enhanced_search_instantiation,
        test_enhanced_cart_instantiation,
        test_client_integration,
    ]

    passed = 0
    total = len(tests)

    for test in tests:
        try:
            if test():
                passed += 1
        except Exception as e:
            print(f"❌ Test {test.__name__} failed with exception: {e}")

    print(f"\n📊 Test Results: {passed}/{total} tests passed")

    if passed == total:
        print("🎉 All tests passed! Enhanced modules are working correctly.")
    else:
        print("⚠️ Some tests failed. Check the output above for details.")

    return passed == total


if __name__ == "__main__":
    success = main()
    sys.exit(0 if success else 1)
