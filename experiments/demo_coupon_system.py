#!/usr/bin/env python3
"""
Demo script for the new Meijer coupon system.

This script demonstrates how to use the new coupon functionality:
- client.coupons() returns a collection of coupons
- coupon.clipped shows the clipping state
- coupon.clipped = True/False clips/unclips the coupon
"""

from meijer import Meijer


def demo_coupon_system():
    """Demonstrate the new coupon system."""
    print("="*60)
    print("MEIJER COUPON SYSTEM DEMO")
    print("="*60)
    
    try:
        # Initialize the client
        client = Meijer()
        
        # Get coupons - this returns a CouponCollection
        coupons = client.coupons()
        print(f"\nLoaded {len(coupons)} coupons")
        
        # Show statistics
        stats = client.coupons.get_stats()
        print(f"Coupon Stats: {stats}")
        
        # Show some sample coupons
        print(f"\nSample Coupons:")
        for i, coupon in enumerate(coupons[:5]):
            print(f"  {i+1}. {coupon}")
        
        # Demonstrate clipping functionality
        print(f"\n" + "="*40)
        print("COUPON CLIPPING DEMO")
        print("="*40)
        
        # Find an unclipped coupon
        available_coupons = coupons.filter_clipped(False)
        if available_coupons:
            sample_coupon = available_coupons[0]
            print(f"\nSample available coupon: {sample_coupon.name}")
            print(f"Current clipped state: {sample_coupon.clipped}")
            
            # Clip the coupon
            print(f"\nClipping coupon...")
            success = client.coupons.clip(sample_coupon.id)
            if success:
                print(f"✓ Successfully clipped coupon!")
                print(f"New clipped state: {sample_coupon.clipped}")
            else:
                print(f"✗ Failed to clip coupon")
            
            # Unclip the coupon
            print(f"\nUnclipping coupon...")
            success = client.coupons.unclip(sample_coupon.id)
            if success:
                print(f"✓ Successfully unclipped coupon!")
                print(f"New clipped state: {sample_coupon.clipped}")
            else:
                print(f"✗ Failed to unclip coupon")
        
        # Demonstrate filtering
        print(f"\n" + "="*40)
        print("COUPON FILTERING DEMO")
        print("="*40)
        
        # Filter by department
        deli_coupons = coupons.filter_by_department("Deli")
        print(f"Deli coupons: {len(deli_coupons)}")
        
        dry_grocery_coupons = coupons.filter_by_department("Dry Grocery")
        print(f"Dry Grocery coupons: {len(dry_grocery_coupons)}")
        
        baby_coupons = coupons.filter_by_department("Baby")
        print(f"Baby coupons: {len(baby_coupons)}")
        
        # Search for specific items
        cottonelle_coupons = coupons.search("Cottonelle")
        print(f"Cottonelle coupons: {len(cottonelle_coupons)}")
        
        if cottonelle_coupons:
            print(f"Found Cottonelle coupons:")
            for coupon in cottonelle_coupons:
                print(f"  - {coupon.name} ({coupon.get_discount_description()})")
        
        # Demonstrate bulk operations
        print(f"\n" + "="*40)
        print("BULK OPERATIONS DEMO")
        print("="*40)
        
        # Get counts before operations
        clipped_before = coupons.get_clipped_count()
        available_before = coupons.get_available_count()
        
        print(f"Before bulk operations:")
        print(f"  Clipped: {clipped_before}")
        print(f"  Available: {available_before}")
        
        # Note: We won't actually run bulk operations in demo to avoid
        # affecting the user's actual coupon state
        print(f"\nNote: Bulk operations (clip_all, unclip_all) are available")
        print(f"but not demonstrated to avoid affecting your coupon state.")
        
        # Export functionality
        print(f"\n" + "="*40)
        print("EXPORT FUNCTIONALITY")
        print("="*40)
        
        print(f"Coupons can be exported to JSON using:")
        print(f"  client.coupons.export_to_json('my_coupons.json')")
        
        print(f"\nCoupon collection can be converted to list:")
        print(f"  coupon_list = client.coupons().to_list()")
        
        print(f"\n" + "="*60)
        print("DEMO COMPLETE!")
        print("="*60)
        
    except Exception as e:
        print(f"Error during demo: {e}")
        print(f"Make sure you're authenticated with the Meijer client")


if __name__ == "__main__":
    demo_coupon_system()
