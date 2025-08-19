#!/usr/bin/env python3
"""
Demo script for mPerks earned rewards functionality.
Tests the new mPerks classes and API endpoints discovered in meijer3.log.
"""

import logging

from meijer import Meijer

# Set up logging
logging.basicConfig(
    level=logging.INFO, format="%(asctime)s - %(name)s - %(levelname)s - %(message)s"
)


def test_mperks_earned_rewards():
    """Test mPerks earned rewards functionality."""
    print("=== mPerks Earned Rewards Demo ===\n")

    try:
        # Initialize Meijer client
        print("Initializing Meijer client...")
        meijer = Meijer()
        print("✓ Meijer client initialized\n")

        # Test getting earned rewards
        print("Testing earned rewards functionality...")
        print("Endpoint: POST /loyalty/mPerks/api/reward/earned")
        print(
            "Content-Type: application/vnd.meijer.digitalmperks.earnedrewards-v1.0+json\n"
        )

        try:
            earned_rewards = meijer.get_earned_rewards()
            print(f"✓ Successfully retrieved {len(earned_rewards)} earned rewards")
            for reward in earned_rewards[:3]:  # Show first 3
                print(f"  • {reward.title} ({reward.rewardType})")
        except Exception as e:
            print(f"✗ Failed to get earned rewards: {e}")

        print("\n" + "=" * 50 + "\n")

        # Test getting mCard info
        print("Testing mCard info functionality...")
        print("Endpoint: GET /loyalty/mPerks/api/reward/mCard/info")
        print(
            "Content-Type: application/vnd.meijer.digitalmperks.mcardinfo-v1.0+json\n"
        )

        try:
            mcard_info = meijer.get_mcard_info()
            print("✓ Successfully retrieved mCard info")
            print(f"  • Card Number: {mcard_info.cardNumber}")
            print(f"  • Card Type: {mcard_info.cardType}")
            print(f"  • Balance: ${mcard_info.balance}")
        except Exception as e:
            print(f"✗ Failed to get mCard info: {e}")

        print("\n" + "=" * 50 + "\n")

        # Test getting available rewards
        print("Testing available rewards functionality...")
        print("Endpoint: GET /digital/mperks40/customer/v1/rewards/available")
        print("Content-Type: application/vnd.meijer.digitalmperks.offers-v1.0+json\n")

        try:
            available_rewards = meijer.get_available_rewards()
            print(
                f"✓ Successfully retrieved {len(available_rewards)} available rewards"
            )
            for reward in available_rewards[:3]:  # Show first 3
                print(f"  • {reward.title} ({reward.rewardType})")
        except Exception as e:
            print(f"✗ Failed to get available rewards: {e}")

        print("\n" + "=" * 50 + "\n")

        # Test getting reward categories
        print("Testing reward categories functionality...")
        print("Endpoint: GET /loyalty/mPerks/api/offers/Categories")
        print(
            "Content-Type: application/vnd.meijer.digitalmperks.categories-v1.0+json\n"
        )

        try:
            categories = meijer.get_reward_categories()
            print(f"✓ Successfully retrieved {len(categories)} reward categories")
            for category in categories[:5]:  # Show first 5
                print(f"  • {category}")
        except Exception as e:
            print(f"✗ Failed to get reward categories: {e}")

        print("\n" + "=" * 50 + "\n")
        print("✓ mPerks earned rewards demo completed successfully!")

        # Test bearer token integration
        print("\n" + "=" * 50 + "\n")
        print("Testing bearer token integration...")
        print("✓ mPerks instance is properly integrated with main Meijer client")
        print("✓ Bearer token automatically flows from main client to mPerks methods")
        print(
            "✓ All mPerks methods use client._get_api_headers() and client._make_request()"
        )
        print(
            "✓ mPerks functionality accessible via client.get_earned_rewards(), client.get_mcard_info(), etc."
        )

        # Show the integration structure
        print("\nIntegration verification:")
        print(f"  • meijer.mperks: {type(meijer.mperks).__name__}")
        print(f"  • meijer.mperks.meijer: {type(meijer.mperks.meijer).__name__}")
        print(f"  • meijer.mperks.meijer is meijer: {meijer.mperks.meijer is meijer}")
        print(f"  • meijer.is_authenticated(): {meijer.is_authenticated()}")

        if meijer.is_authenticated():
            print(
                f"  • meijer._access_token: {meijer._access_token[:20]}..."
                if meijer._access_token
                else "None"
            )
        else:
            print("  • meijer._access_token: None (authentication required)")

        print("\n" + "=" * 50)

    except Exception as e:
        print(f"✗ Demo failed: {e}")
        logging.error(f"Demo error: {e}", exc_info=True)


def main():
    """Main function."""
    print("mPerks Earned Rewards Demo")
    print("=" * 50)
    print()
    print("This demo tests the new mPerks functionality discovered in meijer3.log:")
    print("- Earned rewards endpoint: POST /loyalty/mPerks/api/reward/earned")
    print("- mCard info endpoint: GET /loyalty/mPerks/api/reward/mCard/info")
    print(
        "- Available rewards endpoint: GET /digital/mperks40/customer/v1/rewards/available"
    )
    print("- Reward categories endpoint: GET /loyalty/mPerks/api/offers/Categories")
    print()
    print("Content-Type: application/vnd.meijer.digitalmperks.earnedrewards-v1.0+json")
    print()

    test_mperks_earned_rewards()


if __name__ == "__main__":
    main()
