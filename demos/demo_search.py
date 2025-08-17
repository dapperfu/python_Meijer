#!/usr/bin/env python3
"""
Simple Search Demo

This demo shows basic search functionality:
- Product search
- Barcode lookup
- Store search

Assumes ~/.config/meijer.txt exists with valid authentication.
"""

from meijer import Meijer

def main():
    print("Search Demo")
    print("=" * 40)
    
    # Initialize client (auto-loads from ~/.config/meijer.txt)
    print("Initializing Meijer client...")
    m = Meijer()
    
    if not m.is_authenticated():
        print("❌ Not authenticated. Please check ~/.config/meijer.txt")
        return
    
    print("✅ Authenticated successfully!")
    print()
    
    # Product search
    print("🔍 Searching for 'milk':")
    try:
        results = m.search.search("milk", results_per_page=3)
        print(f"   Found {results.total_results} results")
        if results.results:
            for item in results.results[:3]:
                price = f"${item.best_price}" if item.best_price else "N/A"
                print(f"   • {item.title} - {price}")
        else:
            print("   No results found")
    except Exception as e:
        print(f"   ❌ Error: {e}")
    
    print()
    
    # Barcode lookup
    print("📱 Looking up Coca-Cola barcode (049000050103):")
    try:
        product = m.lookup_barcode_price("049000050103")
        if product:
            price = f"${product.best_price}" if product.best_price else "N/A"
            print(f"   ✅ Found: {product.title}")
            print(f"   Price: {price}")
            print(f"   UPC: {product.upc}")
        else:
            print("   ❌ Product not found")
    except Exception as e:
        print(f"   ❌ Error: {e}")
    
    print()
    
    # Store search
    print("🏪 Searching for stores near ZIP 48104:")
    try:
        stores = m.get_stores(zip_code="48104")
        print(f"   Found {len(stores)} stores")
        if stores:
            for store in stores[:3]:
                print(f"   • {store.name} - {store.city}, {store.state}")
        else:
            print("   No stores found")
    except Exception as e:
        print(f"   ❌ Error: {e}")
    
    print()
    print("✅ Search demo completed!")

if __name__ == "__main__":
    main() 