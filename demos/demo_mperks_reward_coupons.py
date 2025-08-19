#!/usr/bin/env python3
"""
Demo script for mPerks reward coupons functionality.

This script demonstrates:
1. Getting available reward coupons
2. Finding specific coupons by name
3. Checking point balance
4. Purchasing reward coupons
5. Managing the complete reward coupon flow

Usage:
    python demos/demo_mperks_reward_coupons.py
"""

import os
import sys
from typing import Optional

# Add the parent directory to the path to import meijer module
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from meijer import Meijer
from meijer.mperks import MPerksEarnedRewards, RewardCoupon, PointBalance


def demo_reward_coupons():
    """Demonstrate reward coupons functionality."""
    print("🚀 mPerks Reward Coupons Demo")
    print("=" * 50)
    
    try:
        # Initialize Meijer client
        meijer = Meijer()
        mperks = MPerksEarnedRewards(meijer)
        
        print("✅ Meijer client initialized")
        
        # 1. Get current point balance
        print("\n📊 Getting current point balance...")
        point_balance = mperks.get_point_balance()
        
        if point_balance:
            print(f"   Current points: {point_balance.total_points:,}")
            if point_balance.expiring_points:
                print(f"   Points expiring in {point_balance.expiring_days} days: {point_balance.expiring_points:,}")
        else:
            print("   ❌ Failed to get point balance")
            return
        
        # 2. Get available reward coupons
        print("\n🎫 Getting available reward coupons...")
        available_coupons = mperks.get_available_reward_coupons()
        
        if available_coupons:
            print(f"   Found {len(available_coupons)} available coupons:")
            
            # Display fuel rewards first (as they're commonly used)
            fuel_coupons = [c for c in available_coupons if c.reward_coupon_type == "Fuel"]
            if fuel_coupons:
                print("\n   🚗 Fuel Rewards:")
                for coupon in fuel_coupons[:3]:  # Show first 3
                    print(f"      • {coupon.name} - {coupon.point_cost:,} points")
                    print(f"        {coupon.description}")
                    if coupon.days_until_expiry is not None:
                        if coupon.days_until_expiry > 0:
                            print(f"        Expires in {coupon.days_until_expiry} days")
                        else:
                            print(f"        Expired {abs(coupon.days_until_expiry)} days ago")
            
            # Display other reward types
            other_coupons = [c for c in available_coupons if c.reward_coupon_type != "Fuel"]
            if other_coupons:
                print("\n   🎁 Other Rewards:")
                for coupon in other_coupons[:5]:  # Show first 5
                    print(f"      • {coupon.name} - {coupon.point_cost:,} points")
                    print(f"        {coupon.description}")
        else:
            print("   ❌ Failed to get available coupons")
            return
        
        # 3. Find specific coupon by name (e.g., fuel reward)
        print("\n🔍 Finding specific coupon by name...")
        fuel_coupon = mperks.find_reward_coupon_by_name("fuel")
        
        if fuel_coupon:
            print(f"   Found fuel coupon: {fuel_coupon.name}")
            print(f"   Cost: {fuel_coupon.point_cost:,} points")
            print(f"   Description: {fuel_coupon.description}")
            print(f"   Type: {fuel_coupon.reward_coupon_type}")
            
            # Check if user has enough points
            if point_balance.total_points >= fuel_coupon.point_cost:
                print(f"   ✅ Sufficient points available ({point_balance.total_points:,} >= {fuel_coupon.point_cost:,})")
                
                # 4. Demonstrate purchasing the coupon (commented out for safety)
                print("\n💳 Purchase simulation (commented out for safety):")
                print("   To actually purchase this coupon, uncomment the following code:")
                print("   success = mperks.buy_reward_coupon(")
                print(f"       coupon_id={fuel_coupon.coupon_id},")
                print("       store_id=71,  # Replace with actual store ID")
                print("       cart_is_active=True")
                print("   )")
                
                # Uncomment the following lines to actually purchase the coupon:
                # print("\n🔄 Attempting to purchase fuel coupon...")
                # success = mperks.buy_reward_coupon(
                #     coupon_id=fuel_coupon.coupon_id,
                #     store_id=71,  # Replace with actual store ID
                #     cart_is_active=True
                # )
                # 
                # if success:
                #     print("   ✅ Successfully purchased fuel coupon!")
                #     
                #     # Get updated point balance
                #     new_balance = mperks.get_point_balance()
                #     if new_balance:
                #         print(f"   New balance: {new_balance.total_points:,} points")
                #         print(f"   Points spent: {point_balance.total_points - new_balance.total_points:,}")
                # else:
                #     print("   ❌ Failed to purchase fuel coupon")
                
            else:
                print(f"   ❌ Insufficient points ({point_balance.total_points:,} < {fuel_coupon.point_cost:,})")
        else:
            print("   ❌ No fuel coupon found")
        
        # 5. Get expiring points
        print("\n⏰ Getting expiring points...")
        expiring_points = mperks.get_points_expiring(days=30)
        
        if expiring_points is not None:
            if expiring_points:
                print(f"   Found {len(expiring_points)} expiring point entries")
                for entry in expiring_points[:3]:  # Show first 3
                    print(f"      • {entry}")
            else:
                print("   No points expiring in the next 30 days")
        else:
            print("   ❌ Failed to get expiring points")
        
        # 6. Display coupon categories and types
        print("\n📋 Coupon Analysis:")
        if available_coupons:
            coupon_types = {}
            total_cost = 0
            
            for coupon in available_coupons:
                coupon_type = coupon.reward_coupon_type or "Unknown"
                if coupon_type not in coupon_types:
                    coupon_types[coupon_type] = []
                coupon_types[coupon_type].append(coupon)
                total_cost += coupon.point_cost
            
            print(f"   Total coupons available: {len(available_coupons)}")
            print(f"   Total points needed for all: {total_cost:,}")
            print(f"   Coupon types: {', '.join(coupon_types.keys())}")
            
            # Show breakdown by type
            for coupon_type, coupons in coupon_types.items():
                type_cost = sum(c.point_cost for c in coupons)
                print(f"      {coupon_type}: {len(coupons)} coupons, {type_cost:,} points total")
        
        print("\n✅ Demo completed successfully!")
        
    except Exception as e:
        print(f"❌ Demo failed: {e}")
        import traceback
        traceback.print_exc()


def demo_specific_fuel_coupon():
    """Demonstrate finding and analyzing the specific fuel coupon mentioned in the user's request."""
    print("\n🎯 Specific Fuel Coupon Analysis")
    print("=" * 40)
    
    try:
        meijer = Meijer()
        mperks = MPerksEarnedRewards(meijer)
        
        # Find the specific fuel coupon mentioned: "Save $1.00/gal on fuel"
        print("🔍 Looking for 'Save $1.00/gal on fuel' coupon...")
        fuel_coupon = mperks.find_reward_coupon_by_name("Save $1.00/gal on fuel")
        
        if fuel_coupon:
            print(f"✅ Found coupon: {fuel_coupon.name}")
            print(f"   Coupon ID: {fuel_coupon.coupon_id}")
            print(f"   Description: {fuel_coupon.description}")
            print(f"   Point Cost: {fuel_coupon.point_cost:,} points")
            print(f"   Type: {fuel_coupon.reward_coupon_type}")
            print(f"   Available: {fuel_coupon.is_available}")
            
            if fuel_coupon.display_start and fuel_coupon.display_end:
                print(f"   Display Period: {fuel_coupon.display_start.strftime('%Y-%m-%d')} to {fuel_coupon.display_end.strftime('%Y-%m-%d')}")
            
            if fuel_coupon.terms_and_conditions:
                print(f"   Terms: {fuel_coupon.terms_and_conditions[:100]}...")
            
            # Check if this matches the coupon ID from the log (6521640)
            if fuel_coupon.coupon_id == 6521640:
                print("   🎯 This matches the coupon ID from the log analysis!")
            else:
                print(f"   ⚠️  Coupon ID {fuel_coupon.coupon_id} doesn't match expected 6521640")
            
            # Show purchase simulation
            print(f"\n💳 Purchase Simulation for Coupon {fuel_coupon.coupon_id}:")
            print("   POST /digital/mperks40/customer/v1/rewardcoupons/available/6521640/buy")
            print("   Body: {'storeId': 71, 'cartIsActive': true}")
            print("   Headers: Authorization, Content-Type: application/json")
            
        else:
            print("❌ Could not find the specific fuel coupon")
            
            # Try to find any fuel-related coupons
            print("\n🔍 Looking for any fuel-related coupons...")
            all_coupons = mperks.get_available_reward_coupons()
            fuel_coupons = [c for c in all_coupons if "fuel" in c.name.lower() or c.reward_coupon_type == "Fuel"]
            
            if fuel_coupons:
                print(f"   Found {len(fuel_coupons)} fuel-related coupons:")
                for coupon in fuel_coupons:
                    print(f"      • {coupon.name} (ID: {coupon.coupon_id}) - {coupon.point_cost:,} points")
            else:
                print("   No fuel coupons found")
        
    except Exception as e:
        print(f"❌ Specific fuel coupon analysis failed: {e}")


if __name__ == "__main__":
    print("🚀 Starting mPerks Reward Coupons Demo")
    print("This demo showcases the extended mPerks functionality")
    print("including reward coupons, point management, and purchasing.\n")
    
    # Run the main demo
    demo_reward_coupons()
    
    # Run the specific fuel coupon analysis
    demo_specific_fuel_coupon()
    
    print("\n🎉 Demo completed!")
    print("\n💡 Key Features Demonstrated:")
    print("   • Getting available reward coupons")
    print("   • Finding specific coupons by name")
    print("   • Checking point balance")
    print("   • Analyzing coupon details and availability")
    print("   • Purchase simulation (commented out for safety)")
    print("   • Managing the complete reward coupon flow")
