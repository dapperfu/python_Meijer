#!/usr/bin/env python3
"""
Demo script for mPerks Reward Classes

This script demonstrates the reward class hierarchy and shows how to:
1. Create different types of rewards
2. Check if rewards are claimable
3. Claim rewards using points
4. Redeem claimed rewards
5. Calculate savings and benefits
"""

import sys
from pathlib import Path
from decimal import Decimal
from datetime import datetime, timedelta

# Add the meijer package to the path
sys.path.insert(0, str(Path(__file__).parent.parent))

from meijer.models.rewards import (
    RewardFactory,
    RewardStatus,
    RewardType,
    RewardMetadata,
    create_example_rewards
)


def demo_reward_creation():
    """Demonstrate creating different types of rewards."""
    print("🎁 CREATING REWARDS")
    print("=" * 50)
    
    # Create rewards using the factory with proper metadata
    fuel_reward = RewardFactory.create_fuel_reward(
        title="Save $0.10/gal on fuel",
        description="Redeem by entering your mPerks number and PIN at pump before payment.",
        points_required=5000,
        discount_per_gallon=Decimal('0.10'),
        max_gallons=20,
        metadata=RewardMetadata(
            expiration_date=datetime.now() + timedelta(days=30),
            image_url="https://static.meijer.com/DigitalCoupon/FuelRewardImage.png"
        )
    )
    
    sunscreen_reward = RewardFactory.create_product_reward(
        title="Free Sunscreen",
        description="Get any sunscreen product up to $8.99 value.",
        points_required=2000,
        product_name="Sunscreen",
        product_category="Personal Care",
        metadata=RewardMetadata(
            expiration_date=datetime.now() + timedelta(days=45),
            image_url="https://static.meijer.com/DigitalCoupon/SunscreenReward.png"
        )
    )
    
    yogurt_reward = RewardFactory.create_product_reward(
        title="Free Yogurt",
        description="Get any yogurt product up to $5.99 value.",
        points_required=1500,
        product_name="Yogurt",
        product_category="Dairy",
        metadata=RewardMetadata(
            expiration_date=datetime.now() + timedelta(days=30),
            image_url="https://static.meijer.com/DigitalCoupon/YogurtReward.png"
        )
    )
    
    total_discount_reward = RewardFactory.create_total_purchase_discount(
        title="Save $2 on Total Purchase",
        description="Save $2 when you spend $10 or more.",
        points_required=3000,
        discount_amount=Decimal('2.00'),
        minimum_purchase=Decimal('10.00'),
        metadata=RewardMetadata(
            expiration_date=datetime.now() + timedelta(days=60),
            image_url="https://static.meijer.com/DigitalCoupon/TotalDiscountReward.png"
        )
    )
    
    rewards = [fuel_reward, sunscreen_reward, yogurt_reward, total_discount_reward]
    
    for reward in rewards:
        print(f"✅ Created: {reward}")
        print(f"   Type: {reward.reward_type.value}")
        print(f"   Points Required: {reward.points_required}")
        print(f"   Claimable: {reward.is_claimable}")
        print(f"   Expires in: {reward.days_until_expiration} days")
        print()
    
    return rewards


def demo_reward_claiming(rewards, customer_points=8000):
    """Demonstrate claiming rewards with available points."""
    print("💰 CLAIMING REWARDS")
    print("=" * 50)
    print(f"Customer has {customer_points} points available")
    print()
    
    for reward in rewards:
        print(f"🎯 Attempting to claim: {reward.title}")
        print(f"   Current status: {reward.status.value}")
        print(f"   Points required: {reward.points_required}")
        print(f"   Claimable: {reward.is_claimable}")
        
        if reward.claim(customer_points):
            print(f"   ✅ SUCCESSFULLY CLAIMED!")
            print(f"   New status: {reward.status.value}")
            print(f"   Claimed at: {reward.claimed_at}")
            customer_points -= reward.points_required
            print(f"   Remaining points: {customer_points}")
        else:
            print(f"   ❌ FAILED TO CLAIM")
            if not reward.is_claimable:
                print(f"   Reason: Reward not claimable")
            elif customer_points < reward.points_required:
                print(f"   Reason: Insufficient points")
            else:
                print(f"   Reason: Unknown")
        print()
    
    return rewards


def demo_reward_redemption(rewards):
    """Demonstrate redeeming claimed rewards."""
    print("🔄 REDEEMING CLAIMED REWARDS")
    print("=" * 50)
    
    for reward in rewards:
        if reward.status == RewardStatus.CLAIMED:
            print(f"🎯 Redeeming: {reward.title}")
            
            if hasattr(reward, 'discount_per_gallon'):
                # Fuel reward
                gallons = 15
                success = reward.redeem(gallons_purchased=gallons)
                if success:
                    savings = reward.calculate_savings(gallons)
                    print(f"   ✅ Redeemed for {gallons} gallons")
                    print(f"   Total savings: ${savings}")
                else:
                    print(f"   ❌ Failed to redeem")
            
            elif hasattr(reward, 'product_name'):
                # Product reward
                success = reward.redeem(quantity=1)
                if success:
                    print(f"   ✅ Redeemed product: {reward.product_name}")
                else:
                    print(f"   ❌ Failed to redeem")
            
            elif hasattr(reward, 'discount_amount'):
                # Total purchase discount
                purchase_total = Decimal('25.00')
                success = reward.redeem(purchase_total=purchase_total)
                if success:
                    discount = reward.calculate_discount(purchase_total)
                    print(f"   ✅ Redeemed for ${purchase_total} purchase")
                    print(f"   Discount applied: ${discount}")
                else:
                    print(f"   ❌ Failed to redeem")
            
            print(f"   Final status: {reward.status.value}")
            print()
        else:
            print(f"⏭️ Skipping {reward.title} (status: {reward.status.value})")
            print()


def demo_reward_calculations(rewards):
    """Demonstrate reward calculations and benefits."""
    print("🧮 REWARD CALCULATIONS")
    print("=" * 50)
    
    for reward in rewards:
        print(f"📊 {reward.title}")
        
        if hasattr(reward, 'calculate_savings'):
            # Fuel reward
            for gallons in [10, 15, 20]:
                savings = reward.calculate_savings(gallons)
                print(f"   {gallons} gallons: ${savings} savings")
        
        elif hasattr(reward, 'calculate_discount'):
            # Total purchase discount
            for purchase in [Decimal('5.00'), Decimal('15.00'), Decimal('25.00')]:
                discount = reward.calculate_discount(purchase)
                print(f"   ${purchase} purchase: ${discount} discount")
        
        elif hasattr(reward, 'calculate_bonus_points'):
            # Points bonus reward
            for base_points in [100, 200, 500]:
                bonus = reward.calculate_bonus_points(base_points)
                print(f"   {base_points} base points: {bonus} bonus points")
        
        print()


def demo_reward_serialization(rewards):
    """Demonstrate converting rewards to/from dictionaries."""
    print("💾 REWARD SERIALIZATION")
    print("=" * 50)
    
    for i, reward in enumerate(rewards):
        print(f"📝 Reward {i+1}: {reward.title}")
        
        # Convert to dictionary
        reward_dict = reward.to_dict()
        print(f"   Dictionary keys: {list(reward_dict.keys())}")
        
        # Show some key values
        print(f"   Title: {reward_dict['title']}")
        print(f"   Points: {reward_dict['points_required']}")
        print(f"   Status: {reward_dict['status']}")
        print(f"   Claimable: {reward_dict['is_claimable']}")
        
        if 'reward_type' in reward_dict:
            print(f"   Type: {reward_dict['reward_type']}")
        
        print()


def demo_predefined_rewards():
    """Demonstrate the predefined example rewards."""
    print("🎯 PREDEFINED EXAMPLE REWARDS")
    print("=" * 50)
    
    example_rewards = create_example_rewards()
    
    for reward in example_rewards:
        print(f"✅ {reward.title}")
        print(f"   Description: {reward.description}")
        print(f"   Points: {reward.points_required}")
        print(f"   Type: {reward.reward_type.value}")
        print(f"   Expires in: {reward.days_until_expiration} days")
        print()


def demo_real_world_scenario():
    """Demonstrate a real-world reward claiming scenario."""
    print("🌍 REAL-WORLD SCENARIO")
    print("=" * 50)
    
    # Customer has 10,000 points
    customer_points = 10000
    print(f"Customer starts with {customer_points} points")
    print()
    
    # Create rewards based on the log analysis
    fuel_reward = RewardFactory.create_fuel_reward(
        title="Save $0.10/gal on fuel",
        description="Redeem by entering your mPerks number and PIN at pump before payment.",
        points_required=5000,
        discount_per_gallon=Decimal('0.10'),
        max_gallons=20,
        metadata=RewardMetadata(
            expiration_date=datetime.now() + timedelta(days=30)
        )
    )
    
    sunscreen_reward = RewardFactory.create_product_reward(
        title="Free Sunscreen",
        description="Get any sunscreen product up to $8.99 value.",
        points_required=2000,
        product_name="Sunscreen",
        product_category="Personal Care",
        metadata=RewardMetadata(
            expiration_date=datetime.now() + timedelta(days=45)
        )
    )
    
    total_discount_reward = RewardFactory.create_total_purchase_discount(
        title="Save $2 on Total Purchase",
        description="Save $2 when you spend $10 or more.",
        points_required=3000,
        discount_amount=Decimal('2.00'),
        minimum_purchase=Decimal('10.00'),
        metadata=RewardMetadata(
            expiration_date=datetime.now() + timedelta(days=60)
        )
    )
    
    rewards = [fuel_reward, sunscreen_reward, total_discount_reward]
    
    print("Available rewards:")
    for reward in rewards:
        print(f"  • {reward.title} ({reward.points_required} points)")
    print()
    
    # Claim rewards
    print("Claiming rewards...")
    for reward in rewards:
        if reward.claim(customer_points):
            print(f"  ✅ Claimed: {reward.title}")
            customer_points -= reward.points_required
            print(f"     Remaining points: {customer_points}")
        else:
            print(f"  ❌ Failed to claim: {reward.title}")
        print()
    
    # Redeem rewards
    print("Redeeming claimed rewards...")
    for reward in rewards:
        if reward.status == RewardStatus.CLAIMED:
            if hasattr(reward, 'discount_per_gallon'):
                # Fuel reward
                gallons = 15
                success = reward.redeem(gallons_purchased=gallons)
                if success:
                    savings = reward.calculate_savings(gallons)
                    print(f"  🚗 Fuel reward redeemed: {gallons} gallons, ${savings} savings")
            
            elif hasattr(reward, 'product_name'):
                # Product reward
                success = reward.redeem(quantity=1)
                if success:
                    print(f"  🛍️ Product reward redeemed: {reward.product_name}")
            
            elif hasattr(reward, 'discount_amount'):
                # Total purchase discount
                purchase_total = Decimal('25.00')
                success = reward.redeem(purchase_total=purchase_total)
                if success:
                    discount = reward.calculate_discount(purchase_total)
                    print(f"  💰 Discount reward redeemed: ${discount} off ${purchase_total} purchase")
    
    print()
    print(f"Final customer points: {customer_points}")
    print("All rewards successfully claimed and redeemed!")


def main():
    """Main demonstration function."""
    print("🚀 MPERKS REWARD CLASSES DEMONSTRATION")
    print("=" * 60)
    print()
    
    # Create rewards
    rewards = demo_reward_creation()
    print()
    
    # Claim rewards
    demo_reward_claiming(rewards)
    print()
    
    # Redeem rewards
    demo_reward_redemption(rewards)
    print()
    
    # Show calculations
    demo_reward_calculations(rewards)
    print()
    
    # Show serialization
    demo_reward_serialization(rewards)
    print()
    
    # Show predefined examples
    demo_predefined_rewards()
    print()
    
    # Show real-world scenario
    demo_real_world_scenario()
    print()
    
    print("🎉 DEMONSTRATION COMPLETE!")
    print("=" * 60)
    print("This demonstrates the complete reward class hierarchy with:")
    print("• Different reward types (fuel, product, total purchase, points bonus)")
    print("• Point requirements and claim validation")
    print("• Reward claiming and redemption workflows")
    print("• Calculations for savings and benefits")
    print("• Serialization for API integration")
    print("• Real-world usage scenarios")


if __name__ == "__main__":
    main()
