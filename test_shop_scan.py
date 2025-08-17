#!/usr/bin/env python3
"""
Test and demonstration of Meijer Shop & Scan functionality.

This script demonstrates the complete Shop & Scan workflow:
1. Authentication and setup
2. Check Shop & Scan availability
3. Start a shopping trip
4. Scan items (simulate 2 items as per user's test case)
5. Finalize checkout
"""

import logging
from typing import Optional
from meijer import Meijer, MeijerAPIError, MeijerAuthenticationError

def main():
    """Test Shop & Scan workflow."""
    print("🛒 TESTING MEIJER SHOP & SCAN FUNCTIONALITY")
    print("=" * 60)
    
    # Setup logging
    logging.basicConfig(
        level=logging.INFO,
        format='%(asctime)s - %(levelname)s - %(message)s'
    )
    
    try:
        with Meijer(debug=True) as meijer:
            # Step 1: Authentication
            print("\n1. 🔐 Authenticating...")
            if not meijer.login():
                print("❌ Login failed - cannot proceed with Shop & Scan test")
                return
            
            print("✅ Authentication successful")
            
            # Step 2: Check Shop & Scan availability
            print("\n2. 🔍 Checking Shop & Scan availability...")
            shop_scan = meijer.shop_scan
            
            if shop_scan.is_enabled():
                print("✅ Shop & Scan is enabled for this user")
            else:
                print("❌ Shop & Scan is not available for this user")
                print("   This could be due to:")
                print("   - Account restrictions")
                print("   - Geographic limitations")
                print("   - Service temporarily unavailable")
                return
            
            # Step 3: Get configuration (optional)
            print("\n3. ⚙️  Getting Shop & Scan configuration...")
            config = shop_scan.get_config()
            if config:
                print("✅ Configuration retrieved successfully")
                print(f"   Config keys: {list(config.keys()) if isinstance(config, dict) else 'N/A'}")
            else:
                print("⚠️  Could not retrieve configuration (proceeding anyway)")
            
            # Step 4: Start a shopping trip
            print("\n4. 🏪 Starting Shop & Scan trip...")
            
            # Use a common Meijer store ID (store 52 is often used in examples)
            store_id = "52"
            
            if shop_scan.start_trip(store_id):
                trip_summary = shop_scan.get_trip_summary()
                print(f"✅ Trip started successfully")
                print(f"   Trip ID: {trip_summary['trip_id']}")
                print(f"   Store ID: {trip_summary['store_id']}")
                print(f"   Started at: {trip_summary['started_at']}")
            else:
                print("❌ Failed to start shopping trip")
                return
            
            # Step 5: Simulate scanning items (matching user's test case: 2 items scanned)
            print("\n5. 📱 Scanning items...")
            
            # Test barcodes (these would be real product barcodes in actual use)
            test_items = [
                {"barcode": "012345678905", "description": "Test Item 1"},
                {"barcode": "012345678912", "description": "Test Item 2"}
            ]
            
            scanned_items = []
            
            for i, item_info in enumerate(test_items, 1):
                barcode = item_info["barcode"]
                expected_desc = item_info["description"]
                
                print(f"   Scanning item {i}: {barcode}")
                
                try:
                    scanned_item = shop_scan.scan_item(barcode)
                    
                    if scanned_item:
                        scanned_items.append(scanned_item)
                        print(f"   ✅ Item {i} scanned successfully:")
                        print(f"      Description: {scanned_item.description}")
                        print(f"      Price: ${scanned_item.price:.2f}")
                        print(f"      Quantity: {scanned_item.quantity}")
                    else:
                        print(f"   ❌ Failed to scan item {i} (barcode: {barcode})")
                        print(f"      This could indicate:")
                        print(f"      - Invalid barcode")
                        print(f"      - Item not available at this store")
                        print(f"      - API endpoint issue")
                        
                except MeijerAPIError as e:
                    print(f"   ❌ API Error scanning item {i}: {e}")
                except Exception as e:
                    print(f"   ❌ Unexpected error scanning item {i}: {e}")
            
            # Step 6: Review cart contents
            print("\n6. 🛍️  Reviewing cart contents...")
            cart = shop_scan.get_cart()
            
            if cart:
                print(f"✅ Cart contains {len(cart)} items:")
                total_value = 0
                
                for i, item in enumerate(cart, 1):
                    item_total = item.price * item.quantity
                    total_value += item_total
                    
                    print(f"   {i}. {item.description}")
                    print(f"      Barcode: {item.barcode}")
                    print(f"      Price: ${item.price:.2f} x {item.quantity} = ${item_total:.2f}")
                
                print(f"\n   💰 Cart subtotal: ${total_value:.2f}")
                
                # Get trip summary
                trip_summary = shop_scan.get_trip_summary()
                print(f"   📊 Trip total: ${trip_summary['total_amount']:.2f}")
                
            else:
                print("❌ Cart is empty - no items were successfully scanned")
                return
            
            # Step 7: Finalize checkout
            print("\n7. 💳 Finalizing checkout...")
            
            try:
                checkout_result = shop_scan.finalize_checkout()
                
                if checkout_result:
                    print("✅ Checkout finalized successfully!")
                    print(f"   Checkout response keys: {list(checkout_result.keys()) if isinstance(checkout_result, dict) else 'N/A'}")
                    
                    # Show final trip status
                    final_summary = shop_scan.get_trip_summary()
                    if final_summary:
                        print(f"   Final status: {final_summary['status']}")
                        print(f"   Final total: ${final_summary['total_amount']:.2f}")
                else:
                    print("❌ Checkout finalization failed")
                    print("   This could indicate:")
                    print("   - Payment processing issues")
                    print("   - API endpoint problems")
                    print("   - Cart validation errors")
                    
            except MeijerAPIError as e:
                print(f"❌ API Error during checkout: {e}")
            except Exception as e:
                print(f"❌ Unexpected error during checkout: {e}")
            
            # Step 8: End trip (cleanup)
            print("\n8. 🏁 Ending shopping trip...")
            
            if shop_scan.end_trip():
                print("✅ Trip ended successfully")
            else:
                print("⚠️  Trip end may have failed (but local state cleared)")
            
            print("\n" + "=" * 60)
            print("🛒 SHOP & SCAN TEST COMPLETE")
            print("=" * 60)
            
    except MeijerAuthenticationError as e:
        print(f"❌ Authentication Error: {e}")
        print("   Please check your credentials in auth.txt")
        
    except MeijerAPIError as e:
        print(f"❌ API Error: {e}")
        print("   This may indicate API endpoint or network issues")
        
    except Exception as e:
        print(f"❌ Unexpected Error: {e}")
        print("   Please check the implementation and try again")

def demonstrate_shop_scan_features():
    """Demonstrate key Shop & Scan features without full workflow."""
    print("\n🔍 SHOP & SCAN FEATURE DEMONSTRATION")
    print("-" * 40)
    
    with Meijer() as meijer:
        if meijer.login():
            shop_scan = meijer.shop_scan
            
            print("Available Shop & Scan methods:")
            methods = [
                "is_enabled()", "get_config()", "start_trip(store_id)",
                "scan_item(barcode)", "get_cart()", "finalize_checkout()",
                "end_trip()", "get_trip_summary()"
            ]
            
            for method in methods:
                print(f"   • meijer.shop_scan.{method}")
            
            print(f"\nEndpoints configured:")
            for name, endpoint in shop_scan.endpoints.items():
                print(f"   • {name}: {endpoint}")

if __name__ == "__main__":
    main()
    demonstrate_shop_scan_features() 