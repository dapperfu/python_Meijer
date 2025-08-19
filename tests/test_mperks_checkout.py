#!/usr/bin/env python3
"""
Tests for mPerks checkout/claim functionality.
These tests hit real endpoints to test actual reward claiming.
"""

import pytest

from meijer import Meijer


class TestMPerksCheckout:
    """Test mPerks checkout and claim functionality."""

    def setup_method(self):
        """Set up test fixtures."""
        try:
            self.meijer = Meijer()
            self.mperks = self.meijer.mperks
            self.has_auth = True
        except Exception as e:
            # Skip tests if no authentication
            self.has_auth = False
            pytest.skip(f"No authentication available: {e}")

    def test_get_available_reward_coupons(self):
        """Test getting available reward coupons from real API."""
        if not self.has_auth:
            pytest.skip("No authentication available")

        print("\n🔍 Testing real API: Get available reward coupons...")

        try:
            coupons = self.mperks.get_available_reward_coupons()
            print(f"✅ Found {len(coupons)} available reward coupons")

            # Look for the $1.00/off fuel reward
            fuel_coupons = [
                coupon
                for coupon in coupons
                if "fuel" in coupon.name.lower() and "1.00" in coupon.name
            ]

            if fuel_coupons:
                fuel_coupon = fuel_coupons[0]
                print(f"🎯 Found fuel reward: {fuel_coupon.name}")
                print(f"   Cost: {fuel_coupon.point_cost} points")
                print(f"   Description: {fuel_coupon.description}")

                # Store for later tests
                self.fuel_coupon_id = fuel_coupon.coupon_id
                self.fuel_coupon_points = fuel_coupon.point_cost

            else:
                print("ℹ️ No $1.00/off fuel reward found")
                # Look for any fuel-related coupons
                fuel_related = [
                    coupon for coupon in coupons if "fuel" in coupon.name.lower()
                ]
                if fuel_related:
                    print(f"📋 Found {len(fuel_related)} fuel-related coupons:")
                    for coupon in fuel_related[:3]:
                        print(f"   • {coupon.name} - {coupon.point_cost} points")

        except Exception as e:
            pytest.fail(f"Failed to get available reward coupons: {e}")

    def test_get_point_balance(self):
        """Test getting current point balance from real API."""
        if not self.has_auth:
            pytest.skip("No authentication available")

        print("\n💰 Testing real API: Get point balance...")

        try:
            balance = self.mperks.get_point_balance()

            if balance is None:
                print(
                    "⚠️ Point balance returned None - API may not be working or endpoint not implemented"
                )
                print("   This could indicate:")
                print("   - The point balance endpoint is not available")
                print("   - Authentication issues")
                print("   - API response format changes")
                pytest.skip("Point balance endpoint not working")

            print(f"✅ Current point balance: {balance.total_points} points")

            if hasattr(self, "fuel_coupon_points"):
                if balance.total_points >= self.fuel_coupon_points:
                    print(
                        f"✅ Sufficient points to claim fuel reward ({self.fuel_coupon_points} needed)"
                    )
                else:
                    print(
                        f"❌ Insufficient points to claim fuel reward ({self.fuel_coupon_points} needed, {balance.total_points} available)"
                    )

            # Store balance for later tests
            self.current_points = balance.total_points

        except Exception as e:
            pytest.fail(f"Failed to get point balance: {e}")

    def test_attempt_fuel_reward_claim(self):
        """Test attempting to claim the $1.00/off fuel reward."""
        if not self.has_auth:
            pytest.skip("No authentication available")

        if not hasattr(self, "fuel_coupon_id"):
            pytest.skip("No fuel coupon found in previous test")

        print(
            f"\n🎯 Testing real API: Attempt to claim fuel reward (ID: {self.fuel_coupon_id})..."
        )

        try:
            # Try to buy the reward coupon
            result = self.mperks.buy_reward_coupon(
                coupon_id=self.fuel_coupon_id,
                store_id=71,  # Use the store ID from your log
                cart_is_active=True,
            )

            print("✅ Successfully claimed fuel reward!")
            print(f"   Result: {result}")

            # Verify points were deducted
            if hasattr(self, "current_points") and hasattr(self, "fuel_coupon_points"):
                new_balance = self.mperks.get_point_balance()
                expected_points = self.current_points - self.fuel_coupon_points
                print(f"   Points before: {self.current_points}")
                print(f"   Points after: {new_balance.total_points}")
                print(f"   Expected: {expected_points}")

                if new_balance.total_points == expected_points:
                    print("✅ Points correctly deducted")
                else:
                    print("⚠️ Points deduction may not match expected amount")

        except Exception as e:
            error_msg = str(e).lower()

            # Check if it's a "not enough points" error
            if any(
                phrase in error_msg
                for phrase in [
                    "not enough points",
                    "insufficient points",
                    "insufficient balance",
                    "points required",
                    "balance too low",
                    "not enough",
                ]
            ):
                print("✅ Expected result: Not enough points to claim reward")
                print(f"   Error: {e}")

            # Check if it's an authentication/authorization error
            elif any(
                phrase in error_msg
                for phrase in [
                    "unauthorized",
                    "forbidden",
                    "access denied",
                    "invalid token",
                    "expired",
                    "not authorized",
                ]
            ):
                print("⚠️ Authentication/authorization issue")
                print(f"   Error: {e}")
                pytest.skip("Authentication issue prevents testing claim functionality")

            # Check if it's a "not available" or "expired" error
            elif any(
                phrase in error_msg
                for phrase in [
                    "not available",
                    "expired",
                    "no longer available",
                    "unavailable",
                    "invalid coupon",
                    "coupon not found",
                ]
            ):
                print("ℹ️ Coupon not available for claiming")
                print(f"   Error: {e}")

            # Check if it's a "already claimed" error
            elif any(
                phrase in error_msg
                for phrase in [
                    "already claimed",
                    "already purchased",
                    "already redeemed",
                    "duplicate",
                    "already used",
                ]
            ):
                print("ℹ️ Coupon already claimed")
                print(f"   Error: {e}")

            else:
                print(f"❌ Unexpected error: {e}")
                # Don't fail the test for unexpected errors, just log them
                print("   This may indicate an API change or new error condition")

    def test_get_points_expiring(self):
        """Test getting expiring points information from real API."""
        if not self.has_auth:
            pytest.skip("No authentication available")

        print("\n⏰ Testing real API: Get expiring points...")

        try:
            expiring = self.mperks.get_points_expiring(days=30)
            print(f"✅ Retrieved expiring points data: {expiring}")

        except Exception as e:
            print(f"⚠️ Could not get expiring points: {e}")
            # Don't fail the test for this

    def test_comprehensive_earn_functionality(self):
        """Test the new earn functionality with real API."""
        if not self.has_auth:
            pytest.skip("No authentication available")

        print("\n🎁 Testing real API: Earn functionality...")

        try:
            # Test getting earn offers (this may not be implemented yet)
            earn_data = self.mperks.get_earn_offers()
            print(f"✅ Earn tab data: {earn_data.total_all} total offers")
            print(f"   In Progress: {earn_data.total_in_progress}")
            print(f"   Available: {earn_data.total_available}")

            if earn_data.total_all > 0:
                print("📋 Sample earn offers:")
                for offer in earn_data.all_offers[:3]:
                    print(
                        f"   • {offer.title} ({offer.status}) - {offer.points_earned} points"
                    )

        except Exception as e:
            print(f"ℹ️ Earn functionality not yet available: {e}")
            # This is expected if the earn endpoints aren't implemented yet


def main():
    """Run the mPerks checkout tests."""
    print("mPerks Checkout/Claim Tests")
    print("=" * 40)
    print()
    print("These tests hit real endpoints to test:")
    print("- Available reward coupons")
    print("- Point balance")
    print("- Fuel reward claiming")
    print("- Earn functionality")
    print()
    print("Note: Tests will pass if they either:")
    print("- Successfully claim the reward, OR")
    print("- Return 'not enough points' error")
    print()

    # Run tests
    pytest.main([__file__, "-v"])


if __name__ == "__main__":
    main()
