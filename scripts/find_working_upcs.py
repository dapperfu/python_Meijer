#!/usr/bin/env python3
"""
Script to find working UPCs for testing the edge case framework.
"""

import sys
from pathlib import Path

# Add the project root to the path
project_root = Path(__file__).parent.parent
sys.path.insert(0, str(project_root))

from meijer.client import Meijer


def find_working_upcs():
    """Find working UPCs by searching for common products."""
    print("🔍 Finding Working UPCs for Testing")
    print("=" * 50)
    
    try:
        # Initialize client
        client = Meijer()
        if not client.is_authenticated():
            print("❌ Not authenticated. Please authenticate first.")
            return
        
        print("✅ Authenticated successfully")
        
        # Test search functionality
        print("\n🔍 Testing search functionality...")
        search_terms = ["milk", "bread", "eggs", "bananas"]
        
        working_products = []
        
        for term in search_terms:
            try:
                print(f"\nSearching for '{term}'...")
                results = client.search.search(term)
                
                if results:
                    print(f"  Found {len(results)} results")
                    
                    # Look for products with UPCs
                    for result in results[:5]:  # Check first 5 results
                        if hasattr(result, 'upc') and result.upc:
                            print(f"  • {result.title}")
                            print(f"    UPC: {result.upc}")
                            print(f"    Price: ${result.price}")
                            print(f"    Sale Price: ${result.sale_price if result.sale_price else 'N/A'}")
                            
                            # Check if it might be a clearance item
                            if result.sale_price and result.sale_price < result.price:
                                discount = ((result.price - result.sale_price) / result.price) * 100
                                print(f"    🏷️  Clearance: {discount:.1f}% off")
                            
                            working_products.append({
                                'upc': result.upc,
                                'title': result.title,
                                'price': result.price,
                                'sale_price': result.sale_price
                            })
                            break  # Found one working product for this search term
                        else:
                            print(f"  • {result.title} (no UPC)")
                else:
                    print(f"  No results found for '{term}'")
                    
            except Exception as e:
                print(f"  ❌ Error searching for '{term}': {e}")
        
        # Summary
        print("\n" + "=" * 50)
        print("📊 SUMMARY")
        print("=" * 50)
        
        if working_products:
            print(f"✅ Found {len(working_products)} working products with UPCs:")
            for product in working_products:
                print(f"  • {product['upc']} - {product['title']}")
                if product['sale_price']:
                    discount = ((product['price'] - product['sale_price']) / product['price']) * 100
                    print(f"    ${product['price']} → ${product['sale_price']} ({discount:.1f}% off)")
                else:
                    print(f"    ${product['price']}")
            
            print(f"\n💡 You can now test these UPCs with:")
            print(f"   python scripts/test_upc_edge_cases.py {working_products[0]['upc']}")
            
        else:
            print("❌ No working products with UPCs found")
            print("This might indicate an API issue or the products don't have UPCs")
        
    except Exception as e:
        print(f"❌ Error: {e}")


if __name__ == "__main__":
    find_working_upcs()
