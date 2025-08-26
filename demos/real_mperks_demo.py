#!/usr/bin/env python3
"""
Real mPerks Demo

This script demonstrates how to use the mPerks client to fetch real rewards
from the Meijer API and create reward objects from the actual JSON responses.
"""

import sys
import json
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, str(Path(__file__).parent.parent))

from meijer.mperks import MPerksClient


def demo_real_mperks_client():
    """Demonstrate using the real mPerks client."""
    print("🚀 REAL MPERKS CLIENT DEMONSTRATION")
    print("=" * 60)
    print()

    # Create the mPerks client
    client = MPerksClient()

    print("📱 MPERKS CLIENT CREATED")
    print(f"Base URL: {client.base_url}")
    print(f"Available endpoints: {list(client.endpoints.keys())}")
    print()

    # Note: In a real scenario, you would need to authenticate first
    print("⚠️  AUTHENTICATION REQUIRED")
    print("To use this client with real data, you need to:")
    print("1. Authenticate with Meijer (get Bearer token)")
    print("2. Set the auth token: client.set_auth_token('your_token_here')")
    print("3. Then call the API methods")
    print()

    # Show what the client would do with real data
    print("🔍 WHAT THE CLIENT WOULD DO:")
    print(
        "1. Fetch available rewards from: /digital/mperks40/customer/v1/rewardcoupons/available"
    )
    print("2. Fetch earned rewards from: /loyalty/mPerks/api/reward/earned")
    print("3. Fetch point balance from: /digital/mperks40/customer/v1/pointbalance")
    print("4. Parse the JSON responses and create reward objects")
    print("5. Provide methods to claim and redeem rewards")
    print()

    # Show example API response structure
    print("📋 EXAMPLE API RESPONSE STRUCTURE:")
    print("Available Rewards Endpoint Response:")
    example_response = {
        "availableRewardCoupons": [
            {
                "couponId": 6455440,
                "imageUrl": "https://static.meijer.com/DigitalCoupon/MeijerExpressDrink.png",
                "name": "1 Free",
                "description": "Fountain Drink or Coffee",
                "displayPrice": "$0.00",
                "isAvailable": True,
            },
            {
                "couponId": 6521638,
                "imageUrl": "https://static.meijer.com/DigitalCoupon/FuelReward.png",
                "name": "Save $0.10/gal on fuel",
                "description": "Redeem by entering your mPerks number and PIN at pump before payment.",
                "displayPrice": "$0.00",
                "isAvailable": True,
            },
        ]
    }

    print(json.dumps(example_response, indent=2))
    print()

    print("Earned Rewards Endpoint Response:")
    example_earned_response = {
        "summary": {"earnedCount": 1},
        "rewards": [
            {
                "earnDate": "2025-08-18T23:41:36",
                "redeemDate": None,
                "transactionDate": None,
                "rewardProgram": 16,
                "meijerOfferId": 1116599118,
                "expirationDate": "2025-10-02T23:59:59",
                "imageUrl": "https://static.meijer.com/DigitalCoupon/FuelRewardImage.png",
                "title": "Save $1.00/gal on fuel",
                "description": "redeem by entering your mPerks number and PIN at pump before payment.",
            }
        ],
    }

    print(json.dumps(example_earned_response, indent=2))
    print()

    # Show how the client would process this data
    print("🔄 HOW THE CLIENT PROCESSES THE DATA:")
    print("1. Receives JSON response from API")
    print("2. Parses each reward item")
    print("3. Determines reward type based on title/description")
    print("4. Creates appropriate reward object (FuelReward, ProductReward, etc.)")
    print("5. Sets metadata (image URL, offer ID, expiration dates)")
    print("6. Returns list of reward objects ready for use")
    print()

    # Show the reward type detection logic
    print("🎯 REWARD TYPE DETECTION:")
    print("• Fuel rewards: Look for 'fuel', 'gas', 'gallon' in title/description")
    print(
        "• Total purchase discounts: Look for 'total', 'purchase', 'basket', 'cart', 'off'"
    )
    print("• Product rewards: Look for 'free', '1 free', 'get', 'buy'")
    print("• Default: Product reward if type cannot be determined")
    print()

    # Show example usage
    print("💻 EXAMPLE USAGE:")
    print("```python")
    print("# Create client and authenticate")
    print("client = MPerksClient()")
    print("client.set_auth_token('your_bearer_token')")
    print()
    print("# Fetch real rewards from Meijer API")
    print("available_rewards = client.get_available_rewards()")
    print("earned_rewards = client.get_earned_rewards()")
    print("point_balance = client.get_point_balance()")
    print()
    print("# Use the reward objects")
    print("for reward in available_rewards:")
    print("    print(f'{reward.title} - {reward.points_required} points')")
    print("    if reward.is_claimable:")
    print("        print('  Can be claimed!')")
    print("    if hasattr(reward, 'calculate_savings'):")
    print("        savings = reward.calculate_savings(15)  # 15 gallons")
    print("        print(f'  Potential savings: ${savings}')")
    print("```")
    print()

    # Show what the client would return
    print("📦 WHAT YOU GET BACK:")
    print(
        "• List of BaseReward objects (FuelReward, ProductReward, TotalPurchaseDiscountReward)"
    )
    print("• Each reward has:")
    print("  - Title, description, points required")
    print("  - Claimable status and expiration dates")
    print("  - Type-specific methods (calculate_savings, calculate_discount, etc.)")
    print("  - Full metadata from the API")
    print("  - Methods to claim and redeem rewards")
    print()

    print("🎉 DEMONSTRATION COMPLETE!")
    print("=" * 60)
    print("This shows how the mPerks client would:")
    print("• Connect to real Meijer mPerks API endpoints")
    print("• Fetch actual reward data in JSON format")
    print("• Parse and create proper reward objects")
    print("• Provide a clean interface for working with rewards")
    print("• Handle authentication and API communication")


def demo_reward_parsing():
    """Demonstrate how the client parses different reward types."""
    print("🔍 REWARD PARSING DEMONSTRATION")
    print("=" * 50)

    # Example reward data that would come from the API
    example_rewards = [
        {
            "couponId": 6521638,
            "name": "Save $0.10/gal on fuel",
            "description": "Redeem by entering your mPerks number and PIN at pump before payment.",
            "imageUrl": "https://static.meijer.com/DigitalCoupon/FuelReward.png",
        },
        {
            "couponId": 6455440,
            "name": "1 Free",
            "description": "Fountain Drink or Coffee",
            "imageUrl": "https://static.meijer.com/DigitalCoupon/MeijerExpressDrink.png",
        },
        {
            "couponId": 7274423,
            "name": "Save $2 on Total Purchase",
            "description": "Save $2 when you spend $10 or more",
            "imageUrl": "https://static.meijer.com/DigitalCoupon/TotalDiscount.png",
        },
    ]

    print("Example API responses that would be parsed:")
    for i, reward_data in enumerate(example_rewards, 1):
        print(f"\nReward {i}:")
        print(f"  Title: {reward_data['name']}")
        print(f"  Description: {reward_data['description']}")
        print(f"  Image: {reward_data['imageUrl']}")

        # Show how the client would determine the type
        title_lower = reward_data["name"].lower()
        desc_lower = reward_data["description"].lower()

        if any(
            word in title_lower or word in desc_lower
            for word in ["fuel", "gas", "gallon"]
        ):
            print("  Type: Fuel Reward")
            print("  Features: discount_per_gallon, max_gallons, calculate_savings()")
        elif any(
            word in title_lower or word in desc_lower
            for word in ["total", "purchase", "basket", "cart", "off"]
        ):
            print("  Type: Total Purchase Discount")
            print("  Features: discount_amount, minimum_purchase, calculate_discount()")
        elif any(
            word in title_lower or word in desc_lower
            for word in ["free", "1 free", "get", "buy"]
        ):
            print("  Type: Product Reward")
            print("  Features: product_name, product_category, max_quantity")
        else:
            print("  Type: Unknown (defaults to Product Reward)")

    print()


def main():
    """Main demonstration function."""
    demo_real_mperks_client()
    print()
    demo_reward_parsing()


if __name__ == "__main__":
    main()
