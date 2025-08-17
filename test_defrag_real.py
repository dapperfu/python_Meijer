#!/usr/bin/env python3
"""
Test script to run defrag on the real Meijer shopping list.
"""

from meijer import Meijer

def main():
    print("🚀 Testing Meijer Shopping List Defrag on Real Data")
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
        
        # Try to get shopping list
        print("\n2. 📋 Getting shopping list...")
        try:
            items = client.shopping_list.get()
            print(f"   Found {len(items)} items in shopping list")
            
            if items:
                print("   Items found:")
                for i, item in enumerate(items[:5], 1):
                    name = item.get('name', 'Unknown')
                    print(f"     {i}. {name}")
                if len(items) > 5:
                    print(f"     ... and {len(items) - 5} more items")
            else:
                print("   No items found in shopping list")
                
        except Exception as e:
            print(f"   ❌ Error getting shopping list: {e}")
            print("   This might be due to API changes or parsing issues")
        
        # Try to run defrag
        print("\n3. 🔧 Running defrag on shopping list...")
        try:
            result = client.shopping_list.defrag()
            print(f"   Defrag result: {result}")
        except Exception as e:
            print(f"   ❌ Error running defrag: {e}")
            print("   This might indicate the defrag method needs updating")
        
        # Check what methods are available
        print("\n4. 📚 Available shopping list methods:")
        methods = [attr for attr in dir(client.shopping_list) if not attr.startswith('_')]
        for method in methods:
            print(f"   - {method}")
        
    except Exception as e:
        print(f"❌ Unexpected error: {e}")

if __name__ == "__main__":
    main() 