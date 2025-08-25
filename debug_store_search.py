#!/usr/bin/env python3
"""
Debug script to test store search functionality
"""

import sys
import os
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

from meijer import Meijer

def test_store_search():
    print("🏪 Testing Store Search")
    print("=" * 50)
    
    try:
        # Initialize Meijer client
        meijer = Meijer()
        
        print("\n📍 Testing search_by_location with 'Kendallville, IN':")
        stores = meijer.search_by_location("Kendallville, IN", radius=100)
        print(f"  Found {len(stores)} stores")
        
        if stores:
            for store in stores[:3]:
                print(f"  - {store.name} ({store.city}, {store.state}) - {store.zip_code}")
        else:
            print("  ❌ No stores found!")
        
        print("\n🔧 Testing direct get_stores call:")
        stores = meijer.client.get_stores(city="Kendallville", state="IN", radius=100)
        print(f"  get_stores(city='Kendallville', state='IN'): {len(stores)} stores")
        
        if stores:
            for store in stores[:3]:
                print(f"  - {store.name} ({store.city}, {store.state}) - {store.zip_code}")
        else:
            print("  ❌ No stores found!")
        
        print("\n🔍 Testing geocoding directly in client:")
        coords = meijer.client._get_city_coordinates("Kendallville", "IN")
        print(f"  _get_city_coordinates('Kendallville', 'IN'): {coords}")
        
        if coords:
            print(f"  ✓ Got coordinates: {coords}")
            print(f"  🔍 Now testing find_stores_nearby with these coordinates:")
            nearby_stores = meijer.client.find_stores_nearby(coords[0], coords[1], 100, 50)
            print(f"    find_stores_nearby returned {len(nearby_stores)} stores")
            
            if nearby_stores:
                for store in nearby_stores[:3]:
                    print(f"    - {store.name} ({store.city}, {store.state}) - {store.zip_code}")
            else:
                print("    ❌ No stores found nearby!")
        else:
            print("  ❌ Failed to get coordinates!")
        
    except Exception as e:
        print(f"  ❌ Error: {e}")
        import traceback
        traceback.print_exc()

if __name__ == "__main__":
    test_store_search()
