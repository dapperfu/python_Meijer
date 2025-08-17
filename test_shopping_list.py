#!/usr/bin/env python3
"""
Test script to examine the shopping list and test defrag step by step.
"""

from meijer import Meijer

def main():
    print("🔍 Testing Meijer Shopping List Step by Step")
    print("=" * 60)
    
    try:
        # Initialize client with auth
        print("1. 🔐 Initializing Meijer client...")
        client = Meijer(auth='auth.txt')
        print(f"   Authentication status: {client.is_authenticated()}")
        
        if not client.is_authenticated():
            print("   ❌ Failed to authenticate")
            return
        
        print("   ✅ Successfully authenticated!")
        
        # Get shopping list
        print("\n2. 📋 Getting shopping list...")
        try:
            items = client.shopping_list.get()
            print(f"   Found {len(items)} items in shopping list")
            
            if items:
                print("   Items found:")
                for i, item in enumerate(items, 1):
                    print(f"     {i}. ID: {item.list_item_id}")
                    print(f"        Name: {item.name}")
                    print(f"        Description: {item.item_description}")
                    print(f"        UPC: {item.item_part_number}")
                    print(f"        Quantity: {item.quantity}")
                    print(f"        Notes: {item.notes}")
                    print()
            else:
                print("   No items found in shopping list")
                
        except Exception as e:
            print(f"   ❌ Error getting shopping list: {e}")
        
        # Test search functionality
        print("\n3. 🔍 Testing search functionality...")
        try:
            if items:
                first_item = items[0]
                print(f"   Searching for: {first_item.name}")
                
                search_results = client.search.search(
                    query=first_item.name,
                    results_per_page=3
                )
                
                print(f"   Search results: {search_results.total_results} found")
                if search_results.results:
                    for i, result in enumerate(search_results.results[:2], 1):
                        print(f"     {i}. {result.title}")
                        print(f"        Price: {getattr(result, 'price', 'N/A')}")
                        print(f"        Brand: {getattr(result, 'brand', 'N/A')}")
                else:
                    print("   No search results found")
                    
        except Exception as e:
            print(f"   ❌ Error testing search: {e}")
        
        # Test defrag
        print("\n4. 🔧 Testing defrag...")
        try:
            print("   Running defrag on shopping list...")
            result = client.shopping_list.defrag()
            print(f"   Defrag result: {result}")
        except Exception as e:
            print(f"   ❌ Error running defrag: {e}")
        
    except Exception as e:
        print(f"❌ Unexpected error: {e}")

if __name__ == "__main__":
    main() 