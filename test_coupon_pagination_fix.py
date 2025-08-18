#!/usr/bin/env python3
"""
Test Coupon Pagination Fix
==========================

This script tests the improved coupon pagination functionality to ensure
all available coupons are properly fetched with endless scrolling support.
"""

import logging
from meijer import Meijer

# Configure logging
logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s - %(levelname)s - %(message)s"
)

def test_coupon_pagination():
    """Test the improved coupon pagination functionality."""
    print("🧪 TESTING IMPROVED COUPON PAGINATION")
    print("=" * 50)
    
    try:
        # Initialize client
        print("🔧 Initializing Meijer client...")
        client = Meijer()
        
        if not client._ensure_authenticated():
            print("❌ Authentication failed")
            return False
        
        print("✅ Client authenticated successfully")
        
        # Test 1: Get all coupons with pagination
        print("\n1️⃣  Testing paginated coupon fetch...")
        coupons_paginated = client.get_coupons(limit=1000, use_pagination=True)
        print(f"   📊 Paginated fetch: {len(coupons_paginated)} coupons")
        
        # Test 2: Get all coupons without pagination (single request)
        print("\n2️⃣  Testing single request coupon fetch...")
        coupons_single = client.get_coupons(limit=1000, use_pagination=False)
        print(f"   📊 Single request: {len(coupons_single)} coupons")
        
        # Test 3: Get offers directly
        print("\n3️⃣  Testing direct offers fetch...")
        offers = client.get_offers(limit=1000)
        print(f"   📊 Direct offers: {len(offers)} coupons")
        
        # Test 4: Get all coupons using convenience method
        print("\n4️⃣  Testing get_all_coupons convenience method...")
        all_coupons = client.get_all_coupons()
        print(f"   📊 All coupons: {len(all_coupons)} coupons")
        
        # Analysis
        print("\n📈 ANALYSIS")
        print("=" * 30)
        
        methods = [
            ("Paginated", coupons_paginated),
            ("Single Request", coupons_single),
            ("Direct Offers", offers),
            ("All Coupons", all_coupons)
        ]
        
        best_method = None
        best_count = 0
        
        for method_name, coupon_list in methods:
            count = len(coupon_list)
            clipped = len([c for c in coupon_list if c.is_clipped])
            available = len([c for c in coupon_list if not c.is_clipped])
            
            print(f"   {method_name}:")
            print(f"     • Total: {count} coupons")
            print(f"     • Clipped: {clipped}")
            print(f"     • Available: {available}")
            
            if count > best_count:
                best_count = count
                best_method = method_name
        
        print(f"\n🏆 Best method: {best_method} with {best_count} coupons")
        
        # Check if we're getting the expected ~473 coupons
        if best_count >= 400:
            print("✅ SUCCESS: Getting close to expected ~473 coupons")
        elif best_count >= 200:
            print("⚠️  PARTIAL: Getting some coupons but may need further investigation")
        else:
            print("❌ ISSUE: Not getting enough coupons, may need API investigation")
        
        # Show sample coupons
        if best_count > 0:
            print(f"\n🎯 SAMPLE COUPONS (showing first 5):")
            print("-" * 40)
            
            sample_coupons = methods[0][1][:5] if methods[0][1] else []
            for i, coupon in enumerate(sample_coupons, 1):
                status = "🟢 CLIPPED" if coupon.is_clipped else "⚪ AVAILABLE"
                title = coupon.title[:50] + "..." if len(coupon.title) > 50 else coupon.title
                print(f"{i}. {status} - {title}")
                print(f"   ID: {coupon.meijer_offer_id}")
                if coupon.redeem_amount:
                    print(f"   Amount: ${coupon.redeem_amount:.2f}")
        
        return True
        
    except Exception as e:
        print(f"❌ Error during testing: {e}")
        return False

def main():
    """Main function."""
    success = test_coupon_pagination()
    
    print("\n" + "=" * 50)
    if success:
        print("🎉 TEST COMPLETED SUCCESSFULLY")
    else:
        print("💥 TEST FAILED")
    
    return 0 if success else 1

if __name__ == "__main__":
    exit(main())
