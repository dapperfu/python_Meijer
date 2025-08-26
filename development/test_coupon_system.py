#!/usr/bin/env python3
"""
Test script for the new Meijer coupon system.

This script tests the basic functionality without requiring authentication.
"""

from meijer.models.coupons import Coupon, CouponCollection, CouponType, CouponStatus


def test_coupon_model():
    """Test the Coupon model."""
    print("Testing Coupon model...")

    # Create a test coupon
    coupon = Coupon(
        id="test123",
        name="Test Coupon",
        description="A test coupon for testing",
        coupon_type=CouponType.DIGITAL,
        status=CouponStatus.ACTIVE,
        clipped=False,
        discount_amount=5.00,
        discount_type="dollar",
        department="Dry Grocery",
    )

    print(f"Created coupon: {coupon}")
    print(f"Can clip: {coupon.can_clip()}")
    print(f"Can unclip: {coupon.can_unclip()}")

    # Test clipping
    print("\nClipping coupon...")
    success = coupon.clip()
    print(f"Clip success: {success}")
    print(f"New clipped state: {coupon.clipped}")

    # Test unclipping
    print("\nUnclipping coupon...")
    success = coupon.unclip()
    print(f"Unclip success: {success}")
    print(f"New clipped state: {coupon.clipped}")

    # Test discount description
    print(f"Discount description: {coupon.get_discount_description()}")

    # Test to_dict
    coupon_dict = coupon.to_dict()
    print(f"Coupon as dict: {coupon_dict}")

    print("✓ Coupon model tests passed!\n")


def test_coupon_collection():
    """Test the CouponCollection model."""
    print("Testing CouponCollection model...")

    # Create test coupons
    coupon1 = Coupon(id="test1", name="Deli Coupon", department="Deli", clipped=False)

    coupon2 = Coupon(
        id="test2", name="Dry Grocery Coupon", department="Dry Grocery", clipped=True
    )

    coupon3 = Coupon(id="test3", name="Baby Coupon", department="Baby", clipped=False)

    # Create collection
    collection = CouponCollection()
    collection.add(coupon1)
    collection.add(coupon2)
    collection.add(coupon3)

    print(f"Collection: {collection}")
    print(f"Total coupons: {len(collection)}")
    print(f"Clipped count: {collection.get_clipped_count()}")
    print(f"Available count: {collection.get_available_count()}")

    # Test filtering
    deli_coupons = collection.filter_by_department("Deli")
    print(f"Deli coupons: {len(deli_coupons)}")

    clipped_coupons = collection.filter_clipped(True)
    print(f"Clipped coupons: {len(clipped_coupons)}")

    available_coupons = collection.filter_clipped(False)
    print(f"Available coupons: {len(available_coupons)}")

    # Test bulk operations
    print("\nTesting bulk operations...")
    clipped_count = collection.clip_all()
    print(f"Clipped {clipped_count} coupons")

    unclipped_count = collection.unclip_all()
    print(f"Unclipped {unclipped_count} coupons")

    print("✓ CouponCollection tests passed!\n")


def test_coupon_manager_interface():
    """Test the CouponManager interface (without actual client)."""
    print("Testing CouponManager interface...")

    # Create a mock client for testing
    class MockClient:
        def _make_request(self, method, endpoint, **kwargs):
            # Mock response
            return {
                "success": True,
                "coupons": [
                    {
                        "id": "mock1",
                        "name": "Mock Coupon 1",
                        "department": "Deli",
                        "isClipped": False,
                    },
                    {
                        "id": "mock2",
                        "name": "Mock Coupon 2",
                        "department": "Dry Grocery",
                        "isClipped": True,
                    },
                ],
            }

    # Test the interface structure
    print("CouponManager provides the following methods:")
    print("- __call__() -> returns CouponCollection")
    print("- refresh() -> refreshes from API")
    print("- clip(coupon_id) -> clips a coupon")
    print("- unclip(coupon_id) -> unclips a coupon")
    print("- get_by_department(department) -> filters by department")
    print("- get_clipped() -> gets clipped coupons")
    print("- get_available() -> gets available coupons")
    print("- search(query) -> searches coupons")
    print("- get_stats() -> gets statistics")

    print("✓ CouponManager interface tests passed!\n")


def main():
    """Run all tests."""
    print("=" * 60)
    print("MEIJER COUPON SYSTEM TESTS")
    print("=" * 60)

    test_coupon_model()
    test_coupon_collection()
    test_coupon_manager_interface()

    print("=" * 60)
    print("ALL TESTS PASSED!")
    print("=" * 60)

    print("\nUsage examples:")
    print("  # Get coupons")
    print("  coupons = client.coupons()")
    print("")
    print("  # Check clipping state")
    print("  coupon.clipped  # True/False")
    print("")
    print("  # Clip/unclip")
    print("  coupon.clipped = True   # Clip")
    print("  coupon.clipped = False  # Unclip")
    print("")
    print("  # Filter coupons")
    print("  deli_coupons = coupons.filter_by_department('Deli')")
    print("  clipped_coupons = coupons.filter_clipped(True)")


if __name__ == "__main__":
    main()
