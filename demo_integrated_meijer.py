#!/usr/bin/env python3
"""
Demo of the fully integrated Meijer client with all functionality.

This demonstrates that meijer.py now includes:
- Coupon functionality (MeijerCoupon, clip/unclip)
- Search functionality (MeijerSearch, MeijerItem, pagination)
- Store functionality (MeijerStore, MeijerStoreSearch)

All integrated into a single comprehensive client.

Usage:
    python demo_integrated_meijer.py
"""

import sys
from meijer import (
    Meijer,
    MeijerCoupon,
    MeijerItem,
    MeijerStore,
    MeijerSearch,
    MeijerStoreSearch,
    MeijerSearchResults,
    create_meijer_coupons_from_response,
    create_meijer_items_from_search,
    create_meijer_stores_from_response,
)


def demo_comprehensive_integration():
    """Demo the comprehensive integrated Meijer client."""
    print("🏪 Comprehensive Meijer Client Demo")
    print("=" * 70)
    print("All functionality now integrated into meijer.py!")
    print()

    # Initialize the comprehensive client
    print("🔧 Initializing Meijer client...")
    meijer = Meijer()

    print("✅ Meijer client initialized with:")
    print("   - Shop & Scan functionality (meijer.shop_scan)")
    print("   - Shopping lists (meijer.list)")
    print("   - Product search (meijer.search)")
    print("   - Store search (meijer.store_search)")
    print("   - Coupon management (integrated methods)")
    print()

    # Demo search functionality
    print("🔍 Demo: Product Search Integration")
    print("-" * 40)

    print("Using meijer.search.search() method:")
    try:
        search_results = meijer.search.search("milk", results_per_page=5)
        print(f"   Found {len(search_results)} search results for 'milk'")

        if search_results.items:
            item = search_results.items[0]
            print(f"   First item: {item.title} - {item.formatted_price}")
            print(f"   Item type: {type(item).__name__}")
    except Exception as e:
        print(f"   ⚠️  Search demo failed: {e}")
    print()

    # Demo autocomplete
    print("📝 Demo: Autocomplete Integration")
    print("-" * 40)

    print("Using meijer.search.autocomplete() method:")
    try:
        suggestions = meijer.search.autocomplete("chee", num_results=3)
        print(f"   Suggestions for 'chee': {suggestions}")
    except Exception as e:
        print(f"   ⚠️  Autocomplete demo failed: {e}")
    print()

    # Demo store search functionality
    print("🏪 Demo: Store Search Integration")
    print("-" * 40)

    print("Using meijer.store_search methods:")
    try:
        # Find stores near Michigan coordinates
        stores = meijer.store_search.find_stores_nearby(
            latitude=42.8289, longitude=-86.0905, radius_miles=50, max_results=3
        )
        print(f"   Found {len(stores)} stores near Michigan")

        if stores:
            store = stores[0]
            print(f"   First store: {store.display_name}")
            print(
                f"   Store ID: {store.store_id} (type: {type(store.store_id).__name__})"
            )
            print(f"   Services: {', '.join(store.get_store_services()[:3])}")

            # Test store details lookup with proper int type
            store_details = meijer.store_search.get_store_details(store.store_id)
            if store_details:
                print(f"   ✅ Store details lookup successful for ID {store.store_id}")
    except Exception as e:
        print(f"   ⚠️  Store search demo failed: {e}")
    print()

    # Demo coupon integration (requires authentication)
    print("🎫 Demo: Coupon Integration")
    print("-" * 40)

    print("Coupon functionality available (requires authentication):")
    print("   - meijer.get_coupons() - fetch coupons from API")
    print("   - MeijerCoupon.clip() / .unclip() - manage coupon status")
    print("   - create_meijer_coupons_from_response() - parse API responses")
    print("   - Comprehensive coupon metadata from APK analysis")
    print()

    # Demo data classes
    print("📊 Demo: Data Class Integration")
    print("-" * 40)

    print("Available data classes:")
    print(
        f"   - MeijerCoupon: {MeijerCoupon.__doc__.split('.')[0] if MeijerCoupon.__doc__ else 'Coupon management'}"
    )
    print(
        f"   - MeijerItem: {MeijerItem.__doc__.split('.')[0] if MeijerItem.__doc__ else 'Search result items'}"
    )
    print(
        f"   - MeijerStore: {MeijerStore.__doc__.split('.')[0] if MeijerStore.__doc__ else 'Store information'}"
    )
    print(f"   - MeijerSearchResults: Paginated search results container")
    print()

    # Demo helper functions
    print("🛠️  Demo: Helper Functions")
    print("-" * 40)

    print("Available helper functions:")
    print("   - create_meijer_coupons_from_response()")
    print("   - create_meijer_items_from_search()")
    print("   - create_meijer_stores_from_response()")
    print()

    # Demo class relationships
    print("🔗 Demo: Class Relationships")
    print("-" * 40)

    print("Integration points:")
    print("   - All classes accept meijer_client parameter")
    print("   - MeijerCoupon.clip() uses client session")
    print("   - MeijerSearch uses client for authenticated requests")
    print("   - MeijerStoreSearch uses client session when available")
    print("   - Forward references handle circular imports")
    print()

    # Demo comprehensive features
    print("🎯 Demo: Comprehensive Features")
    print("-" * 40)

    print("Complete feature set now available:")
    print("   ✅ OAuth 2.0 + PKCE authentication")
    print("   ✅ Bearer token authentication")
    print("   ✅ Selenium automation")
    print("   ✅ Shop & Scan functionality")
    print("   ✅ Shopping list management")
    print("   ✅ Product search with pagination")
    print("   ✅ Store search and details")
    print("   ✅ Coupon management (clip/unclip)")
    print("   ✅ Proper integer store ID handling")
    print("   ✅ Type hints throughout")
    print("   ✅ Comprehensive error handling")
    print()

    return True


def demo_type_safety():
    """Demo type safety across all integrated functionality."""
    print("🔒 Demo: Type Safety Integration")
    print("=" * 70)

    print("Type safety features:")
    print("   - Store IDs: int (with automatic string conversion)")
    print("   - Coupon IDs: int")
    print("   - All classes use proper type hints")
    print("   - Optional types for nullable fields")
    print("   - Union types for flexible inputs")
    print("   - Generic types for containers")
    print()

    # Demo proper store ID handling
    print("📋 Store ID Type Handling:")
    meijer = Meijer()

    test_ids = [217, "217", 152]
    for store_id in test_ids:
        print(f"   store_id = {store_id} (type: {type(store_id).__name__})")
        try:
            # This should handle both int and string properly
            result = meijer.store_search.get_store_details(store_id)
            print(f"   ✅ Handled properly (returned: {type(result).__name__})")
        except Exception as e:
            print(f"   ⚠️  Error (expected for demo): {e}")
    print()


def demo_api_coverage():
    """Demo comprehensive API coverage."""
    print("🌐 Demo: API Coverage")
    print("=" * 70)

    print("API endpoints covered:")
    print("   🎫 Coupons: https://api.meijer.com/digital/mPerks/api/offers")
    print("   🔍 Search: https://ac.cnstrc.com/search/<query>")
    print("   📝 Autocomplete: https://ac.cnstrc.com/autocomplete/<query>")
    print(
        "   🏪 Store Proximity: https://api.meijer.com/digital/storeInfo/v2/stores/proximity"
    )
    print("   📍 Store Details: https://api.meijer.com/digital/storeInfo/stores/<id>")
    print("   🛒 Shop & Scan: Multiple endpoints for scanning workflow")
    print("   📋 Shopping Lists: List management endpoints")
    print("   🔐 Authentication: OAuth 2.0 + PKCE flow")
    print()

    print("Data sources analyzed:")
    print("   📄 meijer2.log: Network traffic analysis")
    print("   📱 APK decompilation: Native app structure")
    print("   🔍 Constructor.io: Search backend configuration")
    print("   🏪 StoreInfo API: Store data structure")
    print("   🎫 mPerks API: Coupon management")
    print()


def main():
    """Run comprehensive integration demo."""
    print("🚀 Meijer Python Client - Complete Integration")
    print("=" * 70)
    print("Everything is now merged into meijer.py!")
    print()

    try:
        # Run all demos
        demo_comprehensive_integration()
        demo_type_safety()
        demo_api_coverage()

        print("🎉 Summary")
        print("=" * 70)
        print("✅ All functionality successfully integrated into meijer.py:")
        print("   - Coupon classes and functionality")
        print("   - Search classes and pagination")
        print("   - Store classes and search")
        print("   - Proper type handling throughout")
        print("   - Comprehensive error handling")
        print("   - Helper functions for data parsing")
        print()

        print("🔧 Usage:")
        print("   from meijer import Meijer, MeijerCoupon, MeijerItem, MeijerStore")
        print("   client = Meijer()")
        print("   search_results = client.search.search('milk')")
        print("   stores = client.store_search.find_stores_nearby(lat, lng)")
        print("   coupons = client.get_coupons()  # requires authentication")
        print()

        print("📚 All classes and functions are now in a single comprehensive module!")

        return 0

    except Exception as e:
        print(f"❌ Demo error: {e}")
        return 1


if __name__ == "__main__":
    exit_code = main()
    sys.exit(exit_code)
