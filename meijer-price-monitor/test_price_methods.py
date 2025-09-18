#!/usr/bin/env python3
"""
Test all three price resolution methods for LEGO products.
"""

import sys
from pathlib import Path

# Add the parent directory to find the core Meijer API
project_root = Path(__file__).parent
parent_dir = project_root.parent
sys.path.insert(0, str(parent_dir))

from meijer import Meijer
from meijer.search import Search


def test_search_results_price():
    """Test Method 1: Extract price from search results."""
    print("🔍 Method 1: Testing search results price extraction...")
    
    try:
        client = Meijer()
        search = Search(client)
        results = search.search("LEGO", results_per_page=3)
        
        if results.results:
            product = results.results[0]
            print(f"Product: {product.title}")
            print(f"UPC: {product.upc}")
            
            # Check multiple price fields
            prices = {
                'unit_price': getattr(product, 'unit_price', None),
                'price': getattr(product, 'price', None),
                'effective_price': getattr(product, 'effective_price', None),
                'sale_price': getattr(product, 'sale_price', None),
                'raw_data_price': None,
                'populated_price': None
            }
            
            # Check raw_data for price
            if hasattr(product, 'raw_data') and product.raw_data:
                raw_data = product.raw_data
                if 'data' in raw_data and 'price' in raw_data['data']:
                    prices['raw_data_price'] = raw_data['data']['price']
            
            # Check populated_details for price
            if hasattr(product, 'populated_details') and product.populated_details:
                populated = product.populated_details
                if 'unitPrice' in populated:
                    prices['populated_price'] = populated['unitPrice']
            
            print("Available prices:")
            for key, value in prices.items():
                if value is not None:
                    print(f"  ✅ {key}: ${value}")
                else:
                    print(f"  ❌ {key}: None")
            
            return prices
        else:
            print("❌ No products found")
            return {}
            
    except Exception as e:
        print(f"❌ Search results error: {e}")
        return {}


def test_shopnscan_price():
    """Test Method 2: Get price from Shop'n'Scan."""
    print("\n🛒 Method 2: Testing Shop'n'Scan price lookup...")
    
    try:
        client = Meijer()
        
        # Get stores first
        stores = client.get_stores()
        if not stores:
            print("❌ No stores found")
            return None
            
        store_id = str(stores[0].store_id)
        print(f"Using store ID: {store_id}")
        
        # Try Shop'n'Scan lookup
        result = client.lookup_barcode_price("67341940578", store_id=store_id)
        if result:
            print(f"✅ Shop'n'Scan result:")
            for key, value in result.items():
                print(f"  {key}: {value}")
            return result
        else:
            print("❌ Shop'n'Scan failed")
            return None
            
    except Exception as e:
        print(f"❌ Shop'n'Scan error: {e}")
        return None


def test_cart_price():
    """Test Method 3: Get price from cart."""
    print("\n🛒 Method 3: Testing cart price lookup...")
    
    try:
        client = Meijer()
        
        # Add to cart
        print("Adding LEGO product to cart...")
        success = client.cart.add_item_by_upc("67341940578", quantity=1)
        
        if success:
            print("✅ Added to cart")
            
            # Get cart contents
            cart_items = client.cart.items
            print(f"Cart has {len(cart_items)} items")
            
            for item in cart_items:
                print(f"  - {item.name}")
                print(f"    UPC: {getattr(item, 'upc', 'N/A')}")
                print(f"    Price: ${getattr(item, 'price', 'N/A')}")
                print(f"    Unit Price: ${getattr(item, 'unit_price', 'N/A')}")
                print(f"    Total Price: ${getattr(item, 'total_price', 'N/A')}")
                
                # Check all price-related attributes
                print("    All price attributes:")
                for attr in dir(item):
                    if 'price' in attr.lower() and not attr.startswith('_'):
                        try:
                            value = getattr(item, attr)
                            if not callable(value):
                                print(f"      {attr}: {value}")
                        except:
                            pass
            
            return cart_items
        else:
            print("❌ Failed to add to cart")
            return None
            
    except Exception as e:
        print(f"❌ Cart error: {e}")
        return None


def main():
    """Test all three price resolution methods."""
    print("🚀 Testing All Three Price Resolution Methods")
    print("=" * 60)
    
    # Test Method 1: Search Results
    search_prices = test_search_results_price()
    
    # Test Method 2: Shop'n'Scan
    shopnscan_result = test_shopnscan_price()
    
    # Test Method 3: Cart
    cart_items = test_cart_price()
    
    # Summary
    print("\n📊 SUMMARY:")
    print("=" * 30)
    
    print("Method 1 - Search Results:")
    if search_prices:
        for key, value in search_prices.items():
            if value is not None:
                print(f"  ✅ {key}: ${value}")
    else:
        print("  ❌ No prices found")
    
    print("\nMethod 2 - Shop'n'Scan:")
    if shopnscan_result:
        print(f"  ✅ Price: ${shopnscan_result.get('price', 'N/A')}")
    else:
        print("  ❌ No price found")
    
    print("\nMethod 3 - Cart:")
    if cart_items:
        for item in cart_items:
            price = getattr(item, 'price', getattr(item, 'unit_price', 'N/A'))
            print(f"  ✅ {item.name}: ${price}")
    else:
        print("  ❌ No cart items found")


if __name__ == "__main__":
    main()
