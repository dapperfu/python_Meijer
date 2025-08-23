#!/usr/bin/env python3
"""
Simple mPerks Demo

This demo shows basic mPerks functionality:
- Earned rewards
- mCard info
- Available rewards
- Reward categories

Assumes ~/.config/meijer/auth.json exists with valid authentication.
"""

from meijer import Meijer


def main():
    print("mPerks Demo")
    print("=" * 40)

    # Initialize client (auto-loads from ~/.config/meijer/auth.json)
    print("Initializing Meijer client...")
    m = Meijer()

    if not m.is_authenticated():
        print("❌ Not authenticated. Please check ~/.config/meijer/auth.json")
        return

    print("✅ Authenticated successfully!")
    print()

    # Test earned rewards
    print("📊 Earned Rewards:")
    try:
        rewards = m.get_earned_rewards()
        print(f"   Found {len(rewards)} earned rewards")
        if rewards:
            for reward in rewards[:3]:
                print(f"   • {reward.title} ({reward.rewardType})")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Test mCard info
    print("💳 mCard Info:")
    try:
        mcard = m.get_mcard_info()
        print(f"   Card: {mcard.cardNumber}")
        print(f"   Type: {mcard.cardType}")
        print(f"   Balance: ${mcard.balance}")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Test available rewards
    print("🎯 Available Rewards:")
    try:
        available = m.get_available_rewards()
        print(f"   Found {len(available)} available rewards")
        if available:
            for reward in available[:3]:
                print(f"   • {reward.title} ({reward.rewardType})")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Test reward categories
    print("🏷️  Reward Categories:")
    try:
        categories = m.get_reward_categories()
        print(f"   Found {len(categories)} categories")
        if categories:
            for category in categories[:5]:
                print(f"   • {category}")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()
    print("✅ mPerks demo completed!")


if __name__ == "__main__":
    main()
