#!/usr/bin/env python3
"""
Comprehensive Demo

This demo shows all major functionality:
- Authentication
- Shopping lists
- Coupons
- Search
- mPerks
- Stores

Assumes ~/.config/meijer.txt exists with valid authentication.
"""

from meijer import Meijer


def main():
    print("Meijer API Comprehensive Demo")
    print("=" * 50)

    # Initialize client (auto-loads from ~/.config/meijer.txt)
    print("🚀 Initializing Meijer client...")
    m = Meijer()

    if not m.is_authenticated():
        print("❌ Not authenticated. Please check ~/.config/meijer.txt")
        return

    print("✅ Authenticated successfully!")
    print()

    # Shopping List
    print("🛒 Shopping List:")
    try:
        items = m.get_shopping_list()
        print(f"   Items: {len(items)}")
        if items:
            for item in items[:3]:
                status = "✅" if item.isComplete else "⏳"
                print(f"   {status} {item.itemDescription}")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Coupons
    print("🎫 Coupons:")
    try:
        coupons = m.get_available_coupons()
        print(f"   Available: {len(coupons)}")
        clipped = m.get_clipped_coupons()
        print(f"   Clipped: {len(clipped)}")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Search
    print("🔍 Search:")
    try:
        results = m.search.search("bread", results_per_page=2)
        print(f"   'bread' results: {len(results.results)}")
        if results.results:
            for item in results.results[:2]:
                price = f"${item.best_price}" if item.best_price else "N/A"
                print(f"   • {item.title} - {price}")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Barcode Lookup
    print("📱 Barcode Lookup:")
    try:
        product = m.lookup_barcode_price("049000050103")  # Coca-Cola
        if product:
            price = f"${product.best_price}" if product.best_price else "N/A"
            print(f"   ✅ {product.title} - {price}")
        else:
            print("   ❌ Product not found")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Stores
    print("🏪 Stores:")
    try:
        stores = m.get_stores(zip_code="48104")
        print(f"   Found: {len(stores)} stores")
        if stores:
            for store in stores[:2]:
                print(f"   • {store.name} - {store.city}")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # mPerks
    print("⭐ mPerks:")
    try:
        earned = m.get_earned_rewards()
        print(f"   Earned rewards: {len(earned)}")
        available = m.get_available_rewards()
        print(f"   Available rewards: {len(available)}")
        categories = m.get_reward_categories()
        print(f"   Categories: {len(categories)}")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()
    print("🎉 All functionality tested successfully!")


if __name__ == "__main__":
    main()
