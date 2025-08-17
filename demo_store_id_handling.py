#!/usr/bin/env python3
"""
Demo showing proper store ID handling as integers.

This demonstrates that store IDs should be integers, not strings,
with automatic conversion when string inputs are provided.

Usage:
    python demo_store_id_handling.py
"""

import sys
from meijer_store_final import MeijerStore, create_meijer_stores_from_response
from meijer_store_search_final import (
    MeijerStoreSearch, get_store_details, find_stores_nearby,
    find_pharmacy_stores, find_gas_stations
)


def demo_proper_store_id_types():
    """Demo proper store ID handling as integers."""
    print("📋 Demo: Proper Store ID Type Handling")
    print("=" * 60)
    print("Store IDs should be integers, not strings!")
    print()
    
    # Create store search instance
    search = MeijerStoreSearch()
    
    # Test different store ID inputs
    test_cases = [
        217,        # ✅ Correct: integer
        "217",      # ⚠️  Acceptable: string (auto-converted)
        152,        # ✅ Correct: integer
        "152",      # ⚠️  Acceptable: string (auto-converted)
        71,         # ✅ Correct: integer
        "abc",      # ❌ Invalid: non-numeric string
        None,       # ❌ Invalid: None
    ]
    
    print("🔍 Testing store ID inputs:")
    print("   (Store IDs should be int, but we handle string conversion)")
    print()
    
    for i, store_id in enumerate(test_cases, 1):
        print(f"{i}. Testing store_id = {store_id} (type: {type(store_id).__name__})")
        
        try:
            # Use the search function that handles type conversion
            store = search.get_store_details(store_id)
            
            if store:
                print(f"   ✅ SUCCESS: Found {store.display_name}")
                print(f"      Store ID: {store.store_id} (type: {type(store.store_id).__name__})")
                print(f"      Address: {store.full_address}")
            else:
                print(f"   ⚠️  No store found (may not exist in demo data)")
                
        except Exception as e:
            print(f"   ❌ ERROR: {e}")
        
        print()


def demo_convenience_functions():
    """Demo convenience functions with proper typing."""
    print("📋 Demo: Convenience Functions with Proper Types")
    print("=" * 60)
    
    # Demonstrate convenience functions
    print("🏪 Using convenience function get_store_details():")
    
    # These should all work with proper type handling
    store_ids = [217, "152", 71]  # Mix of int and string
    
    for store_id in store_ids:
        print(f"\n📋 get_store_details({store_id}) - type: {type(store_id).__name__}")
        
        # This function handles both int and string automatically
        store = get_store_details(store_id)
        
        if store:
            print(f"   ✅ {store.display_name} (Store ID: {store.store_id})")
            print(f"   Services: {', '.join(store.get_store_services()[:3])}")
        else:
            print(f"   ⚠️  Store not found in demo data")


def demo_proper_api_usage():
    """Demo the correct way to use store APIs."""
    print("\n📋 Demo: Proper API Usage Patterns")
    print("=" * 60)
    
    print("✅ CORRECT Usage Patterns:")
    print()
    
    # 1. Store ID as integer (preferred)
    print("1. Store ID as integer (PREFERRED):")
    print("   store = get_store_details(217)")
    store = get_store_details(217)
    if store:
        print(f"   Result: {store.display_name} (ID: {store.store_id})")
    print()
    
    # 2. Store ID conversion from string (acceptable)
    print("2. String store ID (automatically converted):")
    print('   store = get_store_details("217")  # Auto-converted to int')
    store = get_store_details("217")
    if store:
        print(f"   Result: {store.display_name} (ID: {store.store_id})")
    print()
    
    # 3. Multiple store IDs
    print("3. Multiple store IDs (mixed types handled):")
    print("   store_ids = [217, '152', 71]")
    print("   stores = search.get_stores_by_ids(store_ids)")
    
    search = MeijerStoreSearch()
    stores = search.get_stores_by_ids([217, "152", 71])
    for store in stores:
        if store:
            print(f"   Found: Store {store.store_id} - {store.display_name}")
    print()
    
    # 4. Store data from API response
    print("4. Creating stores from API response:")
    api_response = {
        'store': [
            {
                'UnitId': 217,  # ✅ Integer in API response
                'Name': 'Stadium Dr',
                'Address': '5540 Stadium Dr',
                'City': 'Kalamazoo',
                'State': 'MI',
                'Zip': '49009',
                'PhoneNumber': '2693448400',
                'Latitude': 42.25123,
                'Longitude': -85.58975,
                'Distance': 12.45
            }
        ]
    }
    
    stores = create_meijer_stores_from_response(api_response)
    for store in stores:
        print(f"   API Store: {store.store_id} (type: {type(store.store_id).__name__}) - {store.display_name}")


def demo_type_safety():
    """Demo type safety and error handling."""
    print("\n📋 Demo: Type Safety and Error Handling")
    print("=" * 60)
    
    search = MeijerStoreSearch()
    
    print("🔒 Type Safety Tests:")
    print()
    
    # Test various invalid inputs
    invalid_inputs = [
        "abc",          # Non-numeric string
        None,           # None value
        [],             # List
        {},             # Dict
        12.5,           # Float (might work but not ideal)
    ]
    
    for invalid_input in invalid_inputs:
        print(f"Testing invalid input: {invalid_input} (type: {type(invalid_input).__name__})")
        
        try:
            result = search.get_store_details(invalid_input)
            if result:
                print(f"   ⚠️  Unexpectedly succeeded: {result.display_name}")
            else:
                print(f"   ✅ Properly handled: No result returned")
        except Exception as e:
            print(f"   ✅ Properly caught error: {e}")
        print()


def demo_best_practices():
    """Demo best practices for store ID handling."""
    print("📋 Demo: Best Practices")
    print("=" * 60)
    
    print("🎯 Best Practices for Store ID Handling:")
    print()
    
    print("✅ DO:")
    print("   - Use integers for store IDs: get_store_details(217)")
    print("   - Let the system handle string conversion when needed")
    print("   - Check return values for None (store not found)")
    print("   - Use type hints in your code: store_id: int")
    print()
    
    print("❌ DON'T:")
    print('   - Pass string literals when you can use int: "217" vs 217')
    print("   - Assume store lookup will always succeed")
    print("   - Mix up store IDs with other identifiers")
    print("   - Use floats or other numeric types")
    print()
    
    print("💡 Example Good Code:")
    print("""
def process_store(store_id: int) -> Optional[MeijerStore]:
    \"\"\"Process a store by ID - proper typing.\"\"\"
    store = get_store_details(store_id)  # Pass int directly
    
    if store is None:
        print(f"Store {store_id} not found")
        return None
    
    print(f"Processing {store.display_name}")
    return store

# Usage
store = process_store(217)  # ✅ Integer store ID
    """)


def main():
    """Run all store ID handling demos."""
    print("🏪 Meijer Store ID Handling Demo")
    print("=" * 70)
    print("Demonstrating proper integer store ID handling")
    print("with automatic string conversion when needed.")
    print()
    
    try:
        demo_proper_store_id_types()
        demo_convenience_functions()
        demo_proper_api_usage()
        demo_type_safety()
        demo_best_practices()
        
        print("\n🎯 Summary")
        print("=" * 70)
        print("✅ Store IDs should be integers (int), not strings")
        print("✅ Automatic conversion from strings when needed")
        print("✅ Proper type safety and error handling")
        print("✅ Convenience functions handle both types")
        print("✅ API responses use integers for UnitId")
        
        print("\n🔧 Key Points:")
        print("- Store ID type: int (not str)")
        print("- Primary field: unit_id (from UnitId in API)")
        print("- Auto-conversion: Handles string inputs gracefully")
        print("- Type safety: Validates inputs and handles errors")
        print("- Best practice: Use integers in your code")
        
    except Exception as e:
        print(f"❌ Demo error: {e}")
        return 1
    
    return 0


if __name__ == "__main__":
    exit_code = main()
    sys.exit(exit_code) 