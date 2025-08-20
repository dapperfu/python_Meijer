#!/usr/bin/env python3
"""
Test real stores API to see what it returns.
"""

import sys
import os

# Add the project root to the path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

def test_real_stores():
    """Test the real stores API."""
    try:
        print("Testing real stores API...")
        
        from meijer import Meijer
        meijer = Meijer()
        
        print(f"✓ Client created, authenticated: {meijer.is_authenticated()}")
        
        # Try different store retrieval methods
        print("\n1. Testing get_stores() without parameters...")
        stores = meijer.get_stores()
        print(f"   Result: {len(stores)} stores")
        if stores:
            print(f"   First store: {stores[0]}")
        
        print("\n2. Testing get_stores() with zip code...")
        stores = meijer.get_stores(zip_code="48104")
        print(f"   Result: {len(stores)} stores")
        if stores:
            print(f"   First store: {stores[0]}")
        
        print("\n3. Testing find_stores_nearby()...")
        stores = meijer.find_stores_nearby(latitude=42.2808, longitude=-83.7430)
        print(f"   Result: {len(stores)} stores")
        if stores:
            print(f"   First store: {stores[0]}")
        
        print("\n4. Testing get_store_by_id()...")
        store = meijer.get_store_by_id("217")
        print(f"   Result: {store}")
        
        return True
        
    except Exception as e:
        print(f"❌ Test failed: {e}")
        import traceback
        traceback.print_exc()
        return False

if __name__ == "__main__":
    success = test_real_stores()
    sys.exit(0 if success else 1)
