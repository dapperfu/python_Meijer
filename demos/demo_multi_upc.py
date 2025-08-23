#!/usr/bin/env python3
"""
Multi-UPC Functionality Demo

This demo showcases the new multi-UPC endpoint integration that allows
efficient bulk UPC lookup for up to 20 products in a single API call.

The demo uses the UPCs from the analyzed flow endpoint to demonstrate
the functionality and compare it with individual UPC searches.
"""

import time
from typing import List, Optional

from meijer import Meijer
from meijer.models import MeijerItem


def demo_multi_upc_functionality():
    """Demonstrate the multi-UPC functionality."""
    print("🔍 Multi-UPC Functionality Demo")
    print("=" * 50)
    
    # UPCs from the analyzed flow endpoint
    test_upcs = [
        "1189600014", "1780016746", "1114110614", "1838527823", "1780014927",
        "1200000170", "1780001260", "1780010033", "1901461206", "1200001711",
        "1410005470", "1996900122", "1780014939", "1114110112", "1657195021",
        "1901480334", "1780010065", "1780017966", "1780043119", "1600016710"
    ]
    
    print(f"📋 Testing with {len(test_upcs)} UPCs from the analyzed flow")
    print(f"UPCs: {', '.join(test_upcs[:5])}... (and {len(test_upcs)-5} more)")
    print()
    
    try:
        # Initialize the Meijer client
        print("🚀 Initializing Meijer client...")
        client = Meijer()
        
        # Check if we have authentication
        if not hasattr(client, 'auth') or not client.auth.is_authenticated():
            print("⚠️  Client not authenticated. Please authenticate first.")
            print("   You can use client.auth.login() or load tokens from a file.")
            return
        
        print("✅ Client initialized and authenticated")
        print()
        
        # Demo 1: Multi-UPC search (efficient bulk lookup)
        print("🎯 Demo 1: Multi-UPC Search (Bulk Lookup)")
        print("-" * 40)
        
        start_time = time.time()
        try:
            products = client.search_multiple_products_by_upc(test_upcs)
            multi_upc_time = time.time() - start_time
            
            print(f"✅ Multi-UPC search completed in {multi_upc_time:.2f} seconds")
            print(f"📦 Found {len(products)} products out of {len(test_upcs)} UPCs")
            
            # Display first few results
            print("\n📋 Sample Results:")
            for i, product in enumerate(products[:5]):
                print(f"  {i+1}. {product.title}")
                print(f"     UPC: {product.upc}")
                print(f"     Price: ${product.price or 'N/A'}")
                print(f"     Sale: ${product.sale_price or 'N/A'}" if product.sale_price else "     Sale: No")
                print(f"     Available: {'Yes' if product.is_available else 'No'}")
                print()
            
            if len(products) > 5:
                print(f"  ... and {len(products) - 5} more products")
                print()
                
        except Exception as e:
            print(f"❌ Multi-UPC search failed: {e}")
            print("   This might be due to authentication or endpoint availability")
            return
        
        # Demo 2: Individual UPC searches (for comparison)
        print("🔍 Demo 2: Individual UPC Searches (Comparison)")
        print("-" * 40)
        
        # Test with a smaller subset for performance comparison
        subset_upcs = test_upcs[:5]
        print(f"📋 Testing with subset of {len(subset_upcs)} UPCs for comparison")
        
        start_time = time.time()
        individual_products = []
        
        for upc in subset_upcs:
            try:
                product = client.search_product_by_upc(upc)
                if product:
                    individual_products.append(product)
            except Exception as e:
                print(f"   ⚠️  Failed to search UPC {upc}: {e}")
        
        individual_time = time.time() - start_time
        
        print(f"✅ Individual searches completed in {individual_time:.2f} seconds")
        print(f"📦 Found {len(individual_products)} products out of {len(subset_upcs)} UPCs")
        
        # Performance comparison
        if multi_upc_time > 0 and individual_time > 0:
            speedup = individual_time / multi_upc_time
            print(f"\n⚡ Performance Comparison:")
            print(f"   Multi-UPC (20 UPCs): {multi_upc_time:.2f}s")
            print(f"   Individual (5 UPCs): {individual_time:.2f}s")
            print(f"   Speedup: {speedup:.1f}x faster with multi-UPC")
            print(f"   Estimated individual time for 20 UPCs: {individual_time * 4:.2f}s")
        
        # Demo 3: Store-specific search
        print("\n🏪 Demo 3: Store-Specific Multi-UPC Search")
        print("-" * 40)
        
        # Use store ID 19 from the analyzed flow
        store_id = "19"
        print(f"🏪 Searching with store ID: {store_id}")
        
        try:
            store_products = client.search_multiple_products_by_upc(
                test_upcs[:10],  # Use first 10 UPCs
                store_id=store_id
            )
            
            print(f"✅ Store-specific search completed")
            print(f"📦 Found {len(store_products)} products for store {store_id}")
            
            # Check for store-specific data
            if store_products:
                first_product = store_products[0]
                print(f"\n📋 Sample store-specific result:")
                print(f"   Product: {first_product.title}")
                print(f"   UPC: {first_product.upc}")
                print(f"   Price: ${first_product.price or 'N/A'}")
                print(f"   Store ID: {getattr(first_product, 'store_id', 'N/A')}")
                
        except Exception as e:
            print(f"❌ Store-specific search failed: {e}")
        
        # Demo 4: Error handling and validation
        print("\n⚠️  Demo 4: Error Handling and Validation")
        print("-" * 40)
        
        # Test with too many UPCs
        too_many_upcs = [str(i) for i in range(25)]  # 25 UPCs (over limit)
        print(f"📋 Testing with {len(too_many_upcs)} UPCs (over 20 limit)")
        
        try:
            result = client.search_multiple_products_by_upc(too_many_upcs)
            print("❌ Expected error but got result (this shouldn't happen)")
        except ValueError as e:
            print(f"✅ Correctly caught error: {e}")
        except Exception as e:
            print(f"⚠️  Unexpected error: {e}")
        
        # Test with empty list
        print(f"\n📋 Testing with empty UPC list")
        try:
            result = client.search_multiple_products_by_upc([])
            print(f"✅ Empty list handled correctly: {len(result)} results")
        except Exception as e:
            print(f"❌ Error with empty list: {e}")
        
        print("\n🎉 Multi-UPC Demo Completed!")
        print("=" * 50)
        
    except Exception as e:
        print(f"❌ Demo failed: {e}")
        print("   Make sure the Meijer client is properly configured")


def demo_product_details(products: List[MeijerItem]):
    """Show detailed information about found products."""
    print("\n🔍 Detailed Product Information")
    print("=" * 50)
    
    for i, product in enumerate(products[:3]):  # Show first 3 in detail
        print(f"\n📦 Product {i+1}: {product.title}")
        print(f"   UPC: {product.upc}")
        print(f"   ID: {product.id}")
        print(f"   Price: ${product.price or 'N/A'}")
        print(f"   Sale Price: ${product.sale_price or 'N/A'}")
        print(f"   Unit: {product.unit_price or 'N/A'}")
        print(f"   Available: {'Yes' if product.is_available else 'No'}")
        print(f"   Weighted: {'Yes' if product.is_weighted else 'No'}")
        
        if product.description:
            desc = product.description[:100] + "..." if len(product.description) > 100 else product.description
            print(f"   Description: {desc}")
        
        if hasattr(product, 'raw_data') and product.raw_data:
            raw = product.raw_data
            print(f"   Stock Status: {raw.get('stockLevelStatus', 'N/A')}")
            print(f"   Pickup Available: {raw.get('pickupAvailableFlag', 'N/A')}")
            print(f"   Has mPerks: {raw.get('hasMPerks', 'N/A')}")
            print(f"   Sale: {raw.get('sale', 'N/A')}")
            print(f"   EBT Eligible: {raw.get('ebtFoodstampable', 'N/A')}")
            print(f"   Age Restricted: {raw.get('isAgeRestricted', 'N/A')}")
        
        if product.image_url:
            print(f"   Image: {product.image_url}")


if __name__ == "__main__":
    demo_multi_upc_functionality()
