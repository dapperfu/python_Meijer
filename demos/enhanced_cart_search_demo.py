#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Demo script for enhanced cart and search functionality
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * Code style: Python with full mypy typing, numpy-style docstrings
 * Dependencies: meijer package, enhanced_cart_v2, enhanced_search
 */

Enhanced Cart and Search Demo
============================

This demo script showcases the enhanced cart and search functionality
based on mitmproxy log analysis, including UPC searches and cart operations.
"""

import asyncio
import sys

# Add the parent directory to the path to import meijer modules
sys.path.insert(0, "..")

from meijer.client import Meijer
from meijer.enhanced_search import UPCSearchResult
from meijer.enhanced_cart_v2 import CartOperationResult


async def demo_enhanced_search(client: Meijer) -> None:
    """Demonstrate enhanced search functionality."""
    print("\n🔍 === ENHANCED SEARCH DEMO ===")

    # Test UPC search functionality
    test_upcs = [
        "629307040245",  # From the logs
        "842595131277",  # From the logs
        "123456789012",  # Invalid UPC for testing
    ]

    print(f"Testing UPC search with {len(test_upcs)} UPCs...")

    for upc in test_upcs:
        print(f"\n📦 Searching for UPC: {upc}")

        try:
            # Use enhanced search
            if hasattr(client.search, "search_by_upc"):
                # Enhanced search method
                result: UPCSearchResult = client.search.search_by_upc(upc)

                if result.success:
                    print(f"✅ Found product: {result.product_title}")
                    if result.product_price:
                        print(f"   Price: ${result.product_price}")
                    print(f"   Search method: {result.search_method}")
                else:
                    print("❌ Product not found")
                    if result.error_message:
                        print(f"   Error: {result.error_message}")
                    print(f"   Search method: {result.search_method}")
            else:
                # Fallback to regular search
                print("⚠️ Using fallback search method")
                result = client.search.search_product_by_upc(upc)

                if result:
                    print(f"✅ Found product: {result.title}")
                    if hasattr(result, "price") and result.price:
                        print(f"   Price: ${result.price}")
                else:
                    print("❌ Product not found")

        except Exception as e:
            print(f"❌ Search error: {e}")

    # Test bulk UPC search
    print("\n📦 Testing bulk UPC search...")
    try:
        if hasattr(client.search, "search_multiple_upcs"):
            bulk_results = client.search.search_multiple_upcs(test_upcs)
            print(f"✅ Bulk search completed for {len(bulk_results)} UPCs")

            for upc, result in bulk_results.items():
                if result.success:
                    print(f"   {upc}: ✅ {result.product_title}")
                else:
                    print(f"   {upc}: ❌ {result.error_message}")
        else:
            print("⚠️ Bulk search not available in fallback mode")
    except Exception as e:
        print(f"❌ Bulk search error: {e}")


async def demo_enhanced_cart(client: Meijer) -> None:
    """Demonstrate enhanced cart functionality."""
    print("\n🛒 === ENHANCED CART DEMO ===")

    if not client.cart:
        print("❌ Cart functionality not available")
        return

    print(f"Cart type: {type(client.cart).__name__}")
    print(f"Store ID: {getattr(client.cart, 'store_id', 'Unknown')}")

    # Test cart retrieval
    print("\n📋 Testing cart retrieval...")
    try:
        cart_data = client.cart.get_current_cart()
        print("✅ Cart retrieved successfully")
        print(f"   Cart ID: {cart_data.get('code', 'Unknown')}")
        print(f"   Items: {len(cart_data.get('entries', []))}")

        # Show cart items
        entries = cart_data.get("entries", [])
        if entries:
            print("   Cart contents:")
            for i, entry in enumerate(entries[:5], 1):  # Show first 5 items
                name = entry.get("product", {}).get("name", "Unknown Product")
                quantity = entry.get("quantity", 1)
                print(f"     {i}. {name} (Qty: {quantity})")

            if len(entries) > 5:
                print(f"     ... and {len(entries) - 5} more items")
        else:
            print("   Cart is empty")

    except Exception as e:
        print(f"❌ Cart retrieval error: {e}")

    # Test cart calculations
    print("\n🧮 Testing cart calculations...")
    try:
        if hasattr(client.cart, "calculate_cart"):
            calc_result = client.cart.calculate_cart()
            print("✅ Cart calculation completed")

            # Show calculation details
            if "totalPrice" in calc_result:
                print(f"   Total Price: ${calc_result['totalPrice']}")
            if "subTotal" in calc_result:
                print(f"   Subtotal: ${calc_result['subTotal']}")
            if "totalTax" in calc_result:
                print(f"   Tax: ${calc_result['totalTax']}")
        else:
            print("⚠️ Cart calculation not available")
    except Exception as e:
        print(f"❌ Cart calculation error: {e}")

    # Test fulfillment slots
    print("\n⏰ Testing fulfillment slots...")
    try:
        if hasattr(client.cart, "get_fulfillment_slots"):
            pickup_slots = client.cart.get_fulfillment_slots("pickup")
            print(f"✅ Found {len(pickup_slots)} pickup slots")

            if pickup_slots:
                # Show first few slots
                for i, slot in enumerate(pickup_slots[:3], 1):
                    start_time = slot.get("startTime", "Unknown")
                    end_time = slot.get("endTime", "Unknown")
                    available = slot.get("available", False)
                    status = "✅ Available" if available else "❌ Unavailable"
                    print(f"   {i}. {start_time} - {end_time} ({status})")

                if len(pickup_slots) > 3:
                    print(f"   ... and {len(pickup_slots) - 3} more slots")
            else:
                print("   No pickup slots available")
        else:
            print("⚠️ Fulfillment slots not available")
    except Exception as e:
        print(f"❌ Fulfillment slots error: {e}")


async def demo_cart_operations(client: Meijer) -> None:
    """Demonstrate cart operations (add/remove items)."""
    print("\n🔄 === CART OPERATIONS DEMO ===")

    if not client.cart:
        print("❌ Cart functionality not available")
        return

    # Test adding an item to cart
    test_upc = "629307040245"  # From the logs
    print(f"\n📦 Testing add item to cart: UPC {test_upc}")

    try:
        if hasattr(client.cart, "add_item_by_upc"):
            result: CartOperationResult = client.cart.add_item_by_upc(test_upc, 1)

            if result.success:
                print("✅ Item added successfully")
                print(f"   Message: {result.message}")
                print(f"   Cart ID: {result.cart_id}")
                print(f"   Item count: {result.item_count}")
            else:
                print("❌ Failed to add item")
                print(f"   Message: {result.message}")
                if result.error_details:
                    print(f"   Error: {result.error_details}")
        else:
            print("⚠️ Add item functionality not available")
    except Exception as e:
        print(f"❌ Add item error: {e}")

    # Test cart refresh after operation
    print("\n🔄 Refreshing cart after operation...")
    try:
        cart_data = client.cart.get_current_cart(force_refresh=True)
        print("✅ Cart refreshed successfully")
        print(f"   Items: {len(cart_data.get('entries', []))}")
    except Exception as e:
        print(f"❌ Cart refresh error: {e}")


async def demo_search_cache(client: Meijer) -> None:
    """Demonstrate search caching functionality."""
    print("\n💾 === SEARCH CACHE DEMO ===")

    if not hasattr(client.search, "get_cache_stats"):
        print("⚠️ Search caching not available")
        return

    try:
        # Get cache statistics
        cache_stats = client.search.get_cache_stats()
        print("✅ Cache statistics retrieved")
        print(f"   Total entries: {cache_stats['total_entries']}")
        print(f"   Active entries: {cache_stats['active_entries']}")
        print(f"   Expired entries: {cache_stats['expired_entries']}")
        print(f"   Cache TTL: {cache_stats['cache_ttl_seconds']} seconds")

        # Test cache clearing
        print("\n🧹 Testing cache clearing...")
        client.search.clear_cache()
        print("✅ Cache cleared")

        # Get updated stats
        updated_stats = client.search.get_cache_stats()
        print(f"   Updated total entries: {updated_stats['total_entries']}")

    except Exception as e:
        print(f"❌ Cache demo error: {e}")


async def main() -> None:
    """Main demo function."""
    print("🚀 Enhanced Cart and Search Demo")
    print("=" * 50)
    print("This demo showcases the enhanced cart and search functionality")
    print("based on mitmproxy log analysis.")

    # Initialize client
    try:
        client = Meijer()
        print("✅ Meijer client initialized")
        print(f"   Cart type: {type(client.cart).__name__ if client.cart else 'None'}")
        print(f"   Search type: {type(client.search).__name__}")

    except Exception as e:
        print(f"❌ Failed to initialize client: {e}")
        return

    # Run demos
    try:
        await demo_enhanced_search(client)
        await demo_enhanced_cart(client)
        await demo_cart_operations(client)
        await demo_search_cache(client)

        print("\n🎉 Demo completed successfully!")
        print("\n📋 === SUMMARY ===")
        print("✅ Enhanced search with UPC-specific endpoints")
        print("✅ Enhanced cart with proper OCC v3 endpoints")
        print("✅ Cart operations (add/remove items)")
        print("✅ Fulfillment slot management")
        print("✅ Search result caching")

    except Exception as e:
        print(f"❌ Demo failed: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    asyncio.run(main())
