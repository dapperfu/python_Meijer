#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Simple Meijer coupon demo for listing, clipping, and unclipping coupons
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python PEP 8 with numpy docstring style
 * - Dependencies: meijer package
 */

Simple Meijer Coupons Demo
=========================

A straightforward demonstration of coupon operations:
1. List all available coupons
2. Clip selected coupons
3. Unclip selected coupons
"""

from typing import List, Optional
from meijer import Meijer


def list_coupons(client: Meijer, limit: int = 20) -> List:
    """
    List available coupons from Meijer.
    
    Parameters
    ----------
    client : Meijer
        Authenticated Meijer client instance
    limit : int, optional
        Maximum number of coupons to retrieve, by default 20
        
    Returns
    -------
    List
        List of MeijerCoupon objects
    """
    print(f"🎫 Listing up to {limit} coupons...")
    coupons = client.get_coupons(limit=limit)
    
    print(f"Found {len(coupons)} coupons:")
    print("=" * 60)
    
    for i, coupon in enumerate(coupons, 1):
        status = "🔗 CLIPPED" if coupon.is_clipped else "⭕ AVAILABLE"
        print(f"{i:2d}. {coupon.title[:45]:<45} | {status}")
        print(f"    💰 {coupon.formatted_discount:<10} | ID: {coupon.meijer_offer_id}")
        if coupon.redemption_end_date:
            print(f"    📅 Expires: {coupon.redemption_end_date.strftime('%Y-%m-%d')}")
        print("-" * 60)
    
    return coupons


def clip_coupons(coupons: List, num_to_clip: int = 3) -> None:
    """
    Clip (activate) available coupons.
    
    Parameters
    ----------
    coupons : List
        List of MeijerCoupon objects
    num_to_clip : int, optional
        Number of coupons to clip, by default 3
    """
    print(f"\n📌 Clipping up to {num_to_clip} available coupons...")
    
    # Find available coupons to clip
    available_coupons = [c for c in coupons if not c.is_clipped and not c.is_expired]
    
    if not available_coupons:
        print("⚠️  No available coupons to clip")
        return
    
    # Clip the first few available coupons
    to_clip = available_coupons[:num_to_clip]
    
    for i, coupon in enumerate(to_clip, 1):
        print(f"{i}. Clipping: {coupon.title[:40]}...")
        try:
            if coupon.clip():
                print(f"   ✅ Successfully clipped!")
            else:
                print(f"   ❌ Failed to clip")
        except Exception as e:
            print(f"   ❌ Error: {e}")


def unclip_coupons(coupons: List, num_to_unclip: int = 2) -> None:
    """
    Unclip (deactivate) clipped coupons.
    
    Parameters
    ----------
    coupons : List
        List of MeijerCoupon objects
    num_to_unclip : int, optional
        Number of coupons to unclip, by default 2
    """
    print(f"\n🔓 Unclipping up to {num_to_unclip} clipped coupons...")
    
    # Find clipped coupons to unclip
    clipped_coupons = [c for c in coupons if c.is_clipped]
    
    if not clipped_coupons:
        print("⚠️  No clipped coupons to unclip")
        return
    
    # Unclip the first few clipped coupons
    to_unclip = clipped_coupons[:num_to_unclip]
    
    for i, coupon in enumerate(to_unclip, 1):
        print(f"{i}. Unclipping: {coupon.title[:40]}...")
        try:
            if coupon.unclip():
                print(f"   ✅ Successfully unclipped!")
            else:
                print(f"   ❌ Failed to unclip")
        except Exception as e:
            print(f"   ❌ Error: {e}")


def show_coupon_summary(coupons: List) -> None:
    """
    Display a summary of coupon status.
    
    Parameters
    ----------
    coupons : List
        List of MeijerCoupon objects
    """
    print(f"\n📊 Coupon Summary")
    print("=" * 30)
    
    total = len(coupons)
    clipped = len([c for c in coupons if c.is_clipped])
    available = len([c for c in coupons if not c.is_clipped])
    expired = len([c for c in coupons if c.is_expired])
    
    print(f"Total coupons:     {total}")
    print(f"Clipped coupons:   {clipped}")
    print(f"Available coupons: {available}")
    print(f"Expired coupons:   {expired}")


def main() -> None:
    """
    Run the simple coupon demo.
    """
    print("🎫 SIMPLE MEIJER COUPONS DEMO")
    print("=" * 50)
    
    # Initialize client
    try:
        client = Meijer()
        print("✅ Meijer client initialized")
    except Exception as e:
        print(f"❌ Failed to initialize client: {e}")
        return
    
    # Check authentication
    if not client.auth_status.name == "AUTHENTICATED":
        print("❌ Authentication required. Please configure auth.txt or ~/.config/meijer.txt")
        return
    
    try:
        # Step 1: List coupons
        coupons = list_coupons(client, limit=15)
        
        if not coupons:
            print("No coupons available")
            return
        
        # Step 2: Show initial summary
        show_coupon_summary(coupons)
        
        # Step 3: Clip some coupons
        clip_coupons(coupons, num_to_clip=3)
        
        # Step 4: Unclip some coupons
        unclip_coupons(coupons, num_to_unclip=2)
        
        # Step 5: Final summary
        print(f"\n🎯 Demo completed!")
        
        print(f"\n💡 Usage Tips:")
        print(f"• Use client.get_coupons() to list all coupons")
        print(f"• Use coupon.clip() to activate a coupon")
        print(f"• Use coupon.unclip() to deactivate a coupon")
        print(f"• Check coupon.is_clipped to see current status")
        print(f"• Check coupon.is_expired to avoid expired coupons")
        
    except Exception as e:
        print(f"❌ Demo failed: {e}")
        import traceback
        traceback.print_exc()


if __name__ == "__main__":
    main() 