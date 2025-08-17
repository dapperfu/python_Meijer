#!/usr/bin/env python3
"""
Meijer Stores Demo
==================

Demonstrates store search and information retrieval using the main Meijer API client.
Shows how to find stores, get store details, and work with store data.
"""

from meijer import Meijer

def demo_store_search():
    """Demo store search functionality."""
    print("🏪 Meijer Stores Demo")
    print("=" * 25)
    
    # Initialize client
    client = Meijer()
    
    try:
        # Search for stores by ZIP code
        print("\n📍 Searching for stores near ZIP 49456...")
        stores = client.get_stores(zip_code="49456", radius=25)
        
        print(f"Found {len(stores)} stores:")
        
        for i, store in enumerate(stores[:5], 1):  # Show first 5
            print(f"\n{i}. Store #{store.get('storeNumber', 'N/A')}")
            print(f"   Name: {store.get('displayName', 'N/A')}")
            print(f"   Address: {store.get('address', {}).get('street', 'N/A')}")
            print(f"   City: {store.get('address', {}).get('city', 'N/A')}, {store.get('address', {}).get('state', 'N/A')}")
            print(f"   Phone: {store.get('phone', 'N/A')}")
            
            # Show store hours if available
            if 'hours' in store:
                print(f"   Hours: {store['hours']}")
            
            # Show services if available
            services = store.get('services', [])
            if services:
                print(f"   Services: {', '.join(services)}")
        
        if len(stores) > 5:
            print(f"\n... and {len(stores) - 5} more stores")
            
    except Exception as e:
        print(f"❌ Error searching stores: {e}")

def demo_wide_area_search():
    """Demo searching a wider area."""
    print("\n🗺️  Wide Area Store Search")
    print("=" * 30)
    
    client = Meijer()
    
    try:
        # Search larger radius
        print("📍 Searching for stores near ZIP 49001 (50 mile radius)...")
        stores = client.get_stores(zip_code="49001", radius=50)
        
        print(f"Found {len(stores)} stores in 50-mile radius")
        
        # Group by city
        cities = {}
        for store in stores:
            city = store.get('address', {}).get('city', 'Unknown')
            if city not in cities:
                cities[city] = []
            cities[city].append(store)
        
        print(f"\nStores by city:")
        for city, city_stores in sorted(cities.items()):
            print(f"  📍 {city}: {len(city_stores)} stores")
            
    except Exception as e:
        print(f"❌ Error in wide area search: {e}")

def demo_store_services():
    """Demo extracting store services information."""
    print("\n🛠️  Store Services Information")
    print("=" * 32)
    
    client = Meijer()
    
    try:
        stores = client.get_stores(zip_code="49456", radius=15)
        
        print("Store services breakdown:")
        
        all_services = set()
        store_services = {}
        
        for store in stores:
            store_name = f"Store #{store.get('storeNumber', 'N/A')}"
            services = store.get('services', [])
            store_services[store_name] = services
            all_services.update(services)
        
        # Show all available services
        print(f"\n📋 Available services across all stores:")
        for service in sorted(all_services):
            print(f"  • {service}")
        
        # Show which stores have pharmacy
        pharmacy_stores = [name for name, services in store_services.items() 
                          if any('pharmacy' in service.lower() for service in services)]
        
        if pharmacy_stores:
            print(f"\n💊 Stores with pharmacy services:")
            for store in pharmacy_stores:
                print(f"  • {store}")
                
    except Exception as e:
        print(f"❌ Error getting store services: {e}")

def main():
    """Run all store demos."""
    try:
        demo_store_search()
        demo_wide_area_search() 
        demo_store_services()
        
        print(f"\n✅ Store demos completed successfully!")
        print(f"\n💡 Key features demonstrated:")
        print(f"  • Store search by ZIP code")
        print(f"  • Radius-based filtering")
        print(f"  • Store information extraction")
        print(f"  • Services and amenities")
        print(f"  • Geographic grouping")
        
    except Exception as e:
        print(f"❌ Demo failed: {e}")

if __name__ == "__main__":
    main() 