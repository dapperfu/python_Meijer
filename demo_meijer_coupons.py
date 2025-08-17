#!/usr/bin/env python3
"""
Demo script showing usage of comprehensive MeijerCoupon class.

This demonstrates how to use the meijer.coupons property to access
a List of MeijerCoupon objects with clip() and unclip() methods.

Usage:
    python demo_meijer_coupons.py
"""

import sys
import json
from typing import List

from meijer_coupon_comprehensive import MeijerCoupon, create_meijer_coupons_list
from meijer_comprehensive import MeijerComprehensiveClient


class MeijerWithCoupons(MeijerComprehensiveClient):
    """
    Extended Meijer client with comprehensive coupon support.
    
    Provides the meijer.coupons property as requested, returning
    a List of MeijerCoupon objects with clip() and unclip() methods.
    """
    
    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)
        self._cached_coupons: List[MeijerCoupon] = []
        self._coupons_loaded = False
    
    @property
    def coupons(self) -> List[MeijerCoupon]:
        """
        Get list of available coupons as MeijerCoupon objects.
        
        Each MeijerCoupon has clip() and unclip() methods that accept
        a clipped (boolean) parameter.
        
        Returns:
            List[MeijerCoupon]: List of coupon objects
        """
        if not self._coupons_loaded or not self._cached_coupons:
            self._load_coupons()
        return self._cached_coupons
    
    def _load_coupons(self) -> None:
        """Load coupons from the API."""
        try:
            # Use the existing get_offers method but format for comprehensive coupons
            offers_data = self.get_offers(page_size=9999)
            
            if offers_data:
                self._cached_coupons = create_meijer_coupons_list(offers_data, self)
                self._coupons_loaded = True
                print(f"✅ Loaded {len(self._cached_coupons)} coupons")
            else:
                print("⚠️  No coupon data received")
                self._cached_coupons = []
                
        except Exception as e:
            print(f"❌ Failed to load coupons: {e}")
            self._cached_coupons = []
    
    def refresh_coupons(self) -> None:
        """Refresh the cached coupons from the API."""
        self._coupons_loaded = False
        self._cached_coupons = []
        self._load_coupons()
    
    def get_clipped_coupons(self) -> List[MeijerCoupon]:
        """Get only the clipped coupons."""
        return [coupon for coupon in self.coupons if coupon.is_clipped]
    
    def get_available_coupons(self) -> List[MeijerCoupon]:
        """Get only the available (unclipped) coupons."""
        return [coupon for coupon in self.coupons if not coupon.is_clipped and coupon.is_clippable]
    
    def get_coupons_by_category(self, category: str) -> List[MeijerCoupon]:
        """Get coupons filtered by category."""
        return [
            coupon for coupon in self.coupons 
            if coupon.primary_category and category.lower() in coupon.primary_category.lower()
        ]
    
    def get_expiring_coupons(self, days: int = 7) -> List[MeijerCoupon]:
        """Get coupons expiring within specified days."""
        return [
            coupon for coupon in self.coupons
            if coupon.days_until_expiry is not None and coupon.days_until_expiry <= days
        ]


def demo_coupon_usage():
    """Demonstrate the comprehensive coupon functionality."""
    print("🎟️  Meijer Comprehensive Coupon Demo")
    print("=" * 50)
    
    # Initialize Meijer client
    print("🔧 Initializing Meijer client...")
    meijer = MeijerWithCoupons()
    
    # Note: In real usage, you would authenticate first
    print("⚠️  Note: Authentication required for real usage")
    print("   meijer.login_with_credentials(username, password)")
    print()
    
    # Simulate authentication for demo
    meijer._authenticated = True
    
    # Example 1: Access coupons property
    print("📋 Example 1: Accessing meijer.coupons")
    print("Code: coupons = meijer.coupons")
    print()
    
    # Since we don't have real credentials, create demo data
    demo_coupon_data = create_demo_coupon_data()
    meijer._cached_coupons = create_meijer_coupons_list(demo_coupon_data, meijer)
    meijer._coupons_loaded = True
    
    coupons = meijer.coupons
    print(f"✅ Found {len(coupons)} coupons")
    print()
    
    # Example 2: Show coupon details
    print("📝 Example 2: Coupon details")
    if coupons:
        coupon = coupons[0]
        print(f"Coupon: {coupon}")
        print(f"  - ID: {coupon.meijer_offer_id}")
        print(f"  - Title: {coupon.title.strip()}")
        print(f"  - Category: {coupon.primary_category}")
        print(f"  - Discount: {coupon.discount_text}")
        print(f"  - Clipped: {coupon.is_clipped}")
        print(f"  - Expires: {coupon.redemption_end_date}")
        print(f"  - Days until expiry: {coupon.days_until_expiry}")
        print()
    
    # Example 3: Clip/unclip methods
    print("🎯 Example 3: Clip/Unclip methods")
    if coupons:
        coupon = coupons[0]
        print(f"Original state: clipped={coupon.is_clipped}")
        
        # Simulate clipping (would make API call in real usage)
        print("Code: coupon.clip(True)")
        # coupon.clip(True)  # Commented out - would need real API
        coupon.is_clipped = True  # Simulate for demo
        print(f"After clipping: clipped={coupon.is_clipped}")
        
        print("Code: coupon.unclip()")
        # coupon.unclip()  # Commented out - would need real API  
        coupon.is_clipped = False  # Simulate for demo
        print(f"After unclipping: clipped={coupon.is_clipped}")
        print()
    
    # Example 4: Filter methods
    print("🔍 Example 4: Filtering coupons")
    clipped = meijer.get_clipped_coupons()
    available = meijer.get_available_coupons()
    print(f"Clipped coupons: {len(clipped)}")
    print(f"Available coupons: {len(available)}")
    
    # Example 5: Category filtering
    if coupons:
        categories = set(c.primary_category for c in coupons if c.primary_category)
        print(f"Categories found: {', '.join(list(categories)[:3])}...")
        
        if categories:
            first_category = list(categories)[0]
            category_coupons = meijer.get_coupons_by_category(first_category)
            print(f"Coupons in '{first_category}': {len(category_coupons)}")
    print()
    
    # Example 6: Data export
    print("💾 Example 6: Data export")
    if coupons:
        coupon_dict = coupons[0].to_dict()
        print("Code: coupon.to_dict()")
        print(f"Exported fields: {len(coupon_dict)} total")
        print(f"Sample fields: {list(coupon_dict.keys())[:5]}...")
        print()
    
    print("✅ Demo completed!")
    print("\n📚 Usage Summary:")
    print("1. meijer = MeijerWithCoupons()")
    print("2. meijer.login_with_credentials(username, password)")
    print("3. coupons = meijer.coupons  # List[MeijerCoupon]")
    print("4. coupon.clip(True)  # Clip coupon")
    print("5. coupon.unclip()    # Unclip coupon")


def create_demo_coupon_data():
    """Create demo coupon data for demonstration."""
    return {
        "listOfCoupons": [
            {
                "offer": {
                    "meijerOfferId": 1116700715,
                    "title": "30% off 1 Game item",
                    "description": "Game item. Includes Board Games and Card Games. (Excludes Clearance)",
                    "imageURL": "https://static.meijer.com/DigitalCoupon/Games.png",
                    "redeemAmount": 0.30,
                    "redemptionStartDate": "2024-01-01T00:00:00",
                    "redemptionEndDate": "2024-12-31T23:59:00",
                    "termsAndConditions": "No cash back. Limit one use per coupon.",
                    "departments": [
                        {
                            "categoryID": "L5-000031",
                            "categoryName": "Toys",
                            "subCategoryID": "L4-000429",
                            "subCategoryName": "Games",
                            "isCustomCategory": False
                        }
                    ],
                    "category": {
                        "segmentID": "L5-000031",
                        "segmentName": "Toys"
                    },
                    "tags": ["Games"],
                    "hatColor": 0,
                    "borderColor": 0,
                    "manufacturerCoupon": False,
                    "offerClassId": 1,
                    "isSpecialOffer": False
                },
                "isSuggested": False,
                "isClipped": False,
                "isAutoClipped": False,
                "isHidden": False,
                "isTargeted": True,
                "couponInclusionGroupTag": "New in Past Month",
                "couponExpirationGroupTag": "Active",
                "isClippable": True,
                "isSpecialOffer": False,
                "redemptionDate": None
            },
            {
                "offer": {
                    "meijerOfferId": 1216804738,
                    "title": "$5.00 off 1 Paper item",
                    "description": "Astrobrights or Southworth Paper item.",
                    "imageURL": "https://static.meijer.com/DigitalCoupon/Paper.png",
                    "redeemAmount": 5.00,
                    "redemptionStartDate": "2024-01-01T00:00:00",
                    "redemptionEndDate": "2024-12-31T23:59:00",
                    "termsAndConditions": "No Cash Back. Cannot double or triple coupon.",
                    "departments": [
                        {
                            "categoryID": "L5-000025",
                            "categoryName": "School & Office",
                            "subCategoryID": "L4-000930",
                            "subCategoryName": "Office Essentials",
                            "isCustomCategory": False
                        }
                    ],
                    "category": {
                        "segmentID": "L5-000025",
                        "segmentName": "School & Office"
                    },
                    "tags": ["Paper"],
                    "hatColor": 1,
                    "borderColor": 1,
                    "manufacturerCoupon": True,
                    "offerClassId": 1,
                    "isSpecialOffer": False
                },
                "isSuggested": True,
                "isClipped": True,
                "isAutoClipped": False,
                "isHidden": False,
                "isTargeted": False,
                "couponInclusionGroupTag": "Manufacturer",
                "couponExpirationGroupTag": "Active",
                "isClippable": False,
                "isSpecialOffer": False,
                "redemptionDate": None
            }
        ]
    }


if __name__ == "__main__":
    demo_coupon_usage() 