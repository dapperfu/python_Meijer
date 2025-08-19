#!/usr/bin/env python3
"""
Test Specific Pagination Limits
===============================

This script demonstrates that asking for specific numbers of coupons returns exactly that number.
"""

import logging

from meijer import Meijer

# Configure logging
logging.basicConfig(
    level=logging.INFO, format="%(asctime)s - %(levelname)s - %(message)s"
)


def test_specific_limits():
    """Test specific limit values as requested by user."""
    print("🎯 TESTING SPECIFIC PAGINATION LIMITS")
    print("=" * 50)

    try:
        # Initialize client
        print("🔧 Initializing Meijer client...")
        client = Meijer()

        if not client._ensure_authenticated():
            print("❌ Authentication failed")
            return False

        print("✅ Client authenticated successfully")

        # Test the specific limits requested
        test_cases = [
            (10, "Ask for 10 coupons, get 10"),
            (50, "Ask for 50 coupons, get 50"),
            (100, "Ask for 100 coupons, get 100"),
            (200, "Ask for 200 coupons, get 200"),
            (300, "Ask for 300 coupons, get 300"),
        ]

        print(f"\n📊 Testing {len(test_cases)} specific limit cases...")
        print("=" * 60)

        all_passed = True

        for i, (limit, description) in enumerate(test_cases, 1):
            print(f"\n{i}. {description}")
            print("-" * 40)

            try:
                # Test with pagination
                coupons = client.get_coupons(limit=limit, use_pagination=True)
                actual_count = len(coupons)

                # Validate
                if actual_count == limit:
                    status = "✅ PASS"
                    passed = True
                else:
                    status = "❌ FAIL"
                    passed = False
                    all_passed = False

                print(f"   📊 Requested: {limit}, Received: {actual_count}")
                print(f"   {status}")

                # Show first few coupons as proof
                if coupons:
                    print("   🎯 First 3 coupons:")
                    for j, coupon in enumerate(coupons[:3], 1):
                        status_icon = "🟢" if coupon.is_clipped else "⚪"
                        title = (
                            coupon.title[:35] + "..."
                            if len(coupon.title) > 35
                            else coupon.title
                        )
                        print(f"      {j}. {status_icon} {title}")
                        if coupon.redeem_amount:
                            print(f"         💰 ${coupon.redeem_amount:.2f}")

            except Exception as e:
                print(f"   ❌ Error: {e}")
                all_passed = False

        # Final summary
        print("\n" + "=" * 60)
        print("📈 FINAL VALIDATION SUMMARY")
        print("=" * 60)

        if all_passed:
            print("🎉 ALL SPECIFIC LIMIT TESTS PASSED!")
            print("✅ The pagination system is working perfectly:")
            print("   • Ask for 10 coupons → Get exactly 10")
            print("   • Ask for 50 coupons → Get exactly 50")
            print("   • Ask for 100 coupons → Get exactly 100")
            print("   • Ask for 200 coupons → Get exactly 200")
            print("   • Ask for 300 coupons → Get exactly 300")
            print("\n🚀 You can now confidently request any number of coupons!")
        else:
            print("💥 SOME TESTS FAILED")
            print("⚠️  Check the results above for issues.")

        return all_passed

    except Exception as e:
        print(f"❌ Error during testing: {e}")
        return False


def main():
    """Main function."""
    success = test_specific_limits()

    print("\n" + "=" * 60)
    if success:
        print("🎯 VALIDATION COMPLETE: Pagination works perfectly!")
    else:
        print("💥 VALIDATION FAILED: Some issues found.")

    return 0 if success else 1


if __name__ == "__main__":
    exit(main())
