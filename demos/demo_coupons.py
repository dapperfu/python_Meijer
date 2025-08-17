#!/usr/bin/env python3
"""
Simple Coupons Demo

This demo shows basic coupons functionality:
- Get available coupons
- Get clipped coupons
- Clip/unclip coupons
- Get offers

Assumes ~/.config/meijer.txt exists with valid authentication.
"""

from meijer import Meijer

def main():
    print("Coupons Demo")
    print("=" * 40)
    
    # Initialize client (auto-loads from ~/.config/meijer.txt)
    print("Initializing Meijer client...")
    m = Meijer()
    
    if not m.is_authenticated():
        print("❌ Not authenticated. Please check ~/.config/meijer.txt")
        return
    
    print("✅ Authenticated successfully!")
    print()
    
    # Get available coupons
    print("🎫 Available Coupons:")
    try:
        coupons = m.get_available_coupons()
        print(f"   Found {len(coupons)} available coupons")
        if coupons:
            for coupon in coupons[:3]:
                print(f"   • {coupon.title} (${coupon.discountAmount})")
        else:
            print("   No coupons available")
    except Exception as e:
        print(f"   ❌ Error: {e}")
    
    print()
    
    # Get clipped coupons
    print("📎 Clipped Coupons:")
    try:
        clipped = m.get_clipped_coupons()
        print(f"   Found {len(clipped)} clipped coupons")
        if clipped:
            for coupon in clipped[:3]:
                print(f"   • {coupon.title} (${coupon.discountAmount})")
        else:
            print("   No clipped coupons")
    except Exception as e:
        print(f"   ❌ Error: {e}")
    
    print()
    
    # Get offers
    print("🎯 Offers:")
    try:
        offers = m.get_offers()
        print(f"   Found {len(offers)} offers")
        if offers:
            for offer in offers[:3]:
                print(f"   • {offer.title} (${offer.discountAmount})")
        else:
            print("   No offers available")
    except Exception as e:
        print(f"   ❌ Error: {e}")
    
    print()
    
    # Test clipping a coupon (if available)
    if coupons:
        first_coupon = coupons[0]
        print(f"📎 Clipping coupon: {first_coupon.title}")
        try:
            success = m.clip_coupon(first_coupon.id)
            print(f"   {'✅ Clipped successfully' if success else '❌ Failed to clip'}")
        except Exception as e:
            print(f"   ❌ Error: {e}")
    else:
        print("📎 No coupons available to clip")
    
    print()
    print("✅ Coupons demo completed!")

if __name__ == "__main__":
    main() 