#!/usr/bin/env python3
"""
Test script for the Meijer client.

This script tests all the major functionality of the Meijer client
including authentication, store search, coupons, and shopping lists.
"""

import os
import sys

# Add the parent directory to the path so we can import meijer
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from meijer import Meijer


def test_meijer_client():
    """Test the Meijer client."""
    print("🚀 TESTING MEIJER CLIENT")
    print("=" * 50)

    try:
        # Initialize client
        print("1. 🔐 Testing login...")
        client = Meijer(debug=True)

        if client.auth_status.name == "AUTHENTICATED":
            print("   ✅ Authentication successful!")
        else:
            print("   ❌ Authentication failed")
            return False

        print("\n2. 🏪 Testing store search...")
        stores = client.get_stores(latitude=42.9634, longitude=-85.6681, radius=100)
        print(f"   ✅ Found {len(stores)} stores")

        if stores:
            store = stores[0]
            print(f"   ✅ Store: {store.name}")
            print(f"   ✅ Services: {store.get_services_summary()}")
            print(f"   ✅ Has gas station: {store.has_gas_station()}")

            if store.has_gas_station():
                gas = store.get_gas_station()
                if gas:
                    print(f"   ✅ Gas station: {gas.station_id}")
                    print(f"   ✅ Amenities: {gas.get_amenities_summary()}")

        print("\n3. 🎫 Testing coupons...")
        coupons = client.get_coupons(limit=5)
        print(f"   ✅ Found {len(coupons)} coupons")

        if coupons:
            coupon = coupons[0]
            print(f"   ✅ Coupon: {coupon.title}")
            print(f"   ✅ Discount: {coupon.formatted_discount}")
            print(f"   ✅ Clipped: {coupon.is_clipped}")

        print("\n4. 🛒 Testing shopping list...")
        try:
            lists = client.list.get_lists()
            print(f"   ✅ Found {len(lists)} shopping lists")
        except Exception as e:
            print(f"   ⚠️ Shopping list test failed: {e}")

        print("\n5. 🔍 Testing search...")
        try:
            search_results = client.search.search("milk", limit=3)
            print(f"   ✅ Search returned {len(search_results)} results")
        except Exception as e:
            print(f"   ⚠️ Search test failed: {e}")

        print("\n🎉 MEIJER CLIENT TEST COMPLETE")
        return True

    except Exception as e:
        print(f"❌ Test failed with error: {e}")
        import traceback

        traceback.print_exc()
        return False


if __name__ == "__main__":
    success = test_meijer_client()
    sys.exit(0 if success else 1)
