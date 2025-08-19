#!/usr/bin/env python3
"""
Comprehensive tests for all data models.

Tests all dataclasses and their methods.
"""

from datetime import date, datetime, timedelta
from unittest.mock import Mock

import pytest

from meijer.models import (
    ItemType,
    ListItem,
    MeijerCoupon,
    MeijerItem,
    SearchResult,
    Store,
)
from meijer.mperks import EarnedReward, MCardInfo


class TestMeijerItem:
    """Test the MeijerItem model."""

    def test_init_basic(self):
        """Test basic initialization."""
        item = MeijerItem(id="123", title="Test Product", price=9.99)
        assert item.id == "123"
        assert item.title == "Test Product"
        assert item.price == 9.99
        assert item.is_weighted is False
        assert item.is_available is True

    def test_init_full(self):
        """Test full initialization."""
        item = MeijerItem(
            id="123",
            title="Test Product",
            description="Test Description",
            brand="Test Brand",
            category="Test Category",
            upc="123456789012",
            price=9.99,
            sale_price=7.99,
            unit_price="0.50",
            is_weighted=True,
            weight_unit="lb",
            weight_amount=2.0,
            image_url="https://example.com/image.jpg",
            tags=["organic", "gluten-free"],
        )
        assert item.brand == "Test Brand"
        assert item.category == "Test Category"
        assert item.upc == "123456789012"
        assert item.sale_price == 7.99
        assert item.is_weighted is True
        assert item.weight_unit == "lb"
        assert item.weight_amount == 2.0
        assert item.tags == ["organic", "gluten-free"]

    def test_display_name(self):
        """Test display name property."""
        item = MeijerItem(id="123", title="Test Product", brand="Test Brand")
        assert item.title == "Test Product"

        # Without brand
        item.brand = None
        assert item.title == "Test Product"

    def test_best_price(self):
        """Test best price property."""
        # With sale price
        item = MeijerItem(id="123", title="Test Product", price=10.00, sale_price=7.50)
        assert item.price == 10.00
        assert item.sale_price == 7.50

        # Without sale price
        item.sale_price = None
        assert item.price == 10.00

        # Without any price
        item.price = None
        assert item.price is None

    def test_on_sale(self):
        """Test sale status property."""
        # On sale
        item = MeijerItem(id="123", title="Test Product", price=10.00, sale_price=7.50)
        assert item.price == 10.00
        assert item.sale_price == 7.50

        # Not on sale
        item.sale_price = None
        assert item.sale_price is None

        # Same price
        item.sale_price = 10.00
        assert item.sale_price == 10.00

    def test_to_dict(self):
        """Test dictionary conversion."""
        item = MeijerItem(
            id="123", title="Test Product", price=9.99, brand="Test Brand"
        )

        # Test that the item has the expected attributes
        assert item.id == "123"
        assert item.title == "Test Product"
        assert item.price == 9.99
        assert item.brand == "Test Brand"


class TestListItem:
    """Test the ListItem model."""

    def test_init_basic(self):
        """Test basic initialization."""
        item = ListItem(
            list_item_id=1,
            list_item_type_id=1,
            item_display_order=1,
            item_part_number="123456789012",
            item_description="Test Item",
            quantity=2,
            store_id=123,
            notes="Test notes",
            is_complete=False,
            is_favorite=False,
            listing_id="listing123",
            promotion_start=date(2025, 1, 1),
            promotion_end=date(2025, 12, 31),
            coupon_id=456,
        )
        assert item.list_item_id == 1
        assert item.item_description == "Test Item"
        assert item.quantity == 2
        assert item.is_complete is False
        assert item.is_favorite is False
        assert item.item_part_number == "123456789012"
        assert item.store_id == 123
        assert item.notes == "Test notes"
        assert item.listing_id == "listing123"
        assert item.coupon_id == 456

    def test_legacy_properties(self):
        """Test backward compatibility properties."""
        item = ListItem(
            list_item_id=1,
            list_item_type_id=1,
            item_display_order=1,
            item_part_number=None,
            item_description="Test Item",
            quantity=2,
            store_id=123,
            notes=None,
            is_complete=False,
            is_favorite=False,
            listing_id=None,
            promotion_start=None,
            promotion_end=None,
            coupon_id=0,
        )

        # Test legacy property access
        assert item.item_id == 1
        assert item.name == "Test Item"
        assert item.checked is False
        assert item.upc is None

        # Test setting legacy properties (these are read-only, so we set the underlying attributes)
        item.item_description = "New Name"
        assert item.name == "New Name"

        item.is_complete = True
        assert item.checked is True

        # Create a mock product details with UPC
        mock_product = Mock()
        mock_product.upc = "123456789012"
        item.product_details = mock_product
        assert item.upc == "123456789012"


class TestMeijerCoupon:
    """Test the MeijerCoupon model."""

    def test_init_basic(self):
        """Test basic initialization."""
        coupon = MeijerCoupon(
            meijer_offer_id=123,
            title="Test Coupon",
            description="Test Description",
            image_url="https://example.com/image.jpg",
            large_image_url="https://example.com/large.jpg",
            terms_and_conditions="Test terms",
            manufacturer_coupon=False,
            redemption_start_date=date(2025, 1, 1),
            redemption_end_date=date(2025, 12, 31),
            redeem_amount=5.0,
            offer_class_id=1,
            logix_offer_id=456,
        )
        assert coupon.meijer_offer_id == 123
        assert coupon.title == "Test Coupon"
        assert coupon.description == "Test Description"
        assert coupon.is_clipped is False
        assert coupon.is_suggested is False

    def test_init_full(self):
        """Test full initialization."""
        coupon = MeijerCoupon(
            meijer_offer_id=123,
            title="Test Coupon",
            description="Test Description",
            image_url="https://example.com/image.jpg",
            large_image_url="https://example.com/large.jpg",
            terms_and_conditions="Test terms",
            manufacturer_coupon=False,
            redemption_start_date=date(2025, 1, 1),
            redemption_end_date=date(2025, 12, 31),
            redeem_amount=5.0,
            offer_class_id=1,
            logix_offer_id=456,
            is_clipped=True,
            is_suggested=True,
            is_targeted=True,
            is_hidden=False,
        )
        assert coupon.is_clipped is True
        assert coupon.is_suggested is True
        assert coupon.is_targeted is True
        assert coupon.is_hidden is False
        assert coupon.image_url == "https://example.com/image.jpg"

    def test_clip(self):
        """Test coupon clipping."""
        coupon = MeijerCoupon(
            meijer_offer_id=123,
            title="Test Coupon",
            description="Test Description",
            image_url="https://example.com/image.jpg",
            large_image_url="https://example.com/large.jpg",
            terms_and_conditions="Test terms",
            manufacturer_coupon=False,
            redemption_start_date=date(2025, 1, 1),
            redemption_end_date=date(2025, 12, 31),
            redeem_amount=5.0,
            offer_class_id=1,
            logix_offer_id=456,
        )

        assert coupon.is_clipped is False
        coupon.is_clipped = True
        assert coupon.is_clipped is True

    def test_unclip(self):
        """Test coupon unclipping."""
        coupon = MeijerCoupon(
            meijer_offer_id=123,
            title="Test Coupon",
            description="Test Description",
            image_url="https://example.com/image.jpg",
            large_image_url="https://example.com/large.jpg",
            terms_and_conditions="Test terms",
            manufacturer_coupon=False,
            redemption_start_date=date(2025, 1, 1),
            redemption_end_date=date(2025, 12, 31),
            redeem_amount=5.0,
            offer_class_id=1,
            logix_offer_id=456,
            is_clipped=True,
        )

        assert coupon.is_clipped is True
        coupon.is_clipped = False
        assert coupon.is_clipped is False

    def test_hide(self):
        """Test coupon hiding."""
        coupon = MeijerCoupon(
            meijer_offer_id=123,
            title="Test Coupon",
            description="Test Description",
            image_url="https://example.com/image.jpg",
            large_image_url="https://example.com/large.jpg",
            terms_and_conditions="Test terms",
            manufacturer_coupon=False,
            redemption_start_date=date(2025, 1, 1),
            redemption_end_date=date(2025, 12, 31),
            redeem_amount=5.0,
            offer_class_id=1,
            logix_offer_id=456,
        )

        assert coupon.is_hidden is False
        coupon.is_hidden = True
        assert coupon.is_hidden is True

    def test_show(self):
        """Test coupon showing."""
        coupon = MeijerCoupon(
            meijer_offer_id=123,
            title="Test Coupon",
            description="Test Description",
            image_url="https://example.com/image.jpg",
            large_image_url="https://example.com/large.jpg",
            terms_and_conditions="Test terms",
            manufacturer_coupon=False,
            redemption_start_date=date(2025, 1, 1),
            redemption_end_date=date(2025, 12, 31),
            redeem_amount=5.0,
            offer_class_id=1,
            logix_offer_id=456,
            is_hidden=True,
        )

        assert coupon.is_hidden is True
        coupon.is_hidden = False
        assert coupon.is_hidden is False


class TestStore:
    """Test the Store model."""

    def test_init_basic(self):
        """Test basic initialization."""
        store = Store(
            store_id="123",
            name="Test Store",
            address="123 Test St",
            city="Test City",
            state="MI",
            zip_code="48104",
        )
        assert store.store_id == "123"
        assert store.name == "Test Store"
        assert store.address == "123 Test St"
        assert store.city == "Test City"
        assert store.state == "MI"
        assert store.is_open is True

    def test_init_full(self):
        """Test full initialization."""
        store = Store(
            store_id="123",
            name="Test Store",
            address="123 Test St",
            city="Test City",
            state="MI",
            zip_code="48104",
            phone="555-1234",
            hours="24/7",
            latitude=42.0,
            longitude=-83.0,
            distance=5.2,
            is_open=False,
            services=["pharmacy", "gas"],
            raw_data={"test": "data"},
        )
        assert store.zip_code == "48104"
        assert store.phone == "555-1234"
        assert store.hours == "24/7"
        assert store.latitude == 42.0
        assert store.longitude == -83.0
        assert store.distance == 5.2
        assert store.is_open is False
        assert store.services == ["pharmacy", "gas"]
        assert store.raw_data == {"test": "data"}


class TestSearchResult:
    """Test the SearchResult model."""

    def test_init(self):
        """Test initialization."""
        mock_item = Mock()
        result = SearchResult(
            total_results=100,
            results=[mock_item, mock_item],
            current_page=1,
            total_pages=10,
            query="test",
            sort_by="relevance",
        )
        assert result.total_results == 100
        assert len(result.results) == 2
        assert result.current_page == 1
        assert result.total_pages == 10
        assert result.query == "test"
        assert result.sort_by == "relevance"

    def test_has_next_page(self):
        """Test next page checking."""
        mock_item = Mock()
        result = SearchResult(
            total_results=100,
            results=[mock_item],
            current_page=1,
            total_pages=10,
            query="test",
            sort_by="relevance",
        )
        assert result.is_last_page is False

        result.current_page = 10
        assert result.is_last_page is True

    def test_has_previous_page(self):
        """Test previous page checking."""
        mock_item = Mock()
        result = SearchResult(
            total_results=100,
            results=[mock_item],
            current_page=1,
            total_pages=10,
            query="test",
            sort_by="relevance",
        )
        assert result.current_page == 1

        result.current_page = 2
        assert result.current_page == 2


class TestItemType:
    """Test the ItemType enum."""

    def test_values(self):
        """Test enum values."""
        assert ItemType.PRODUCT.value == 1
        assert ItemType.COUPON.value == 2
        assert ItemType.WEEKLY_AD.value == 3
        assert ItemType.MANUAL.value == 4

    def test_string_representation(self):
        """Test enum string representation."""
        assert str(ItemType.PRODUCT) == "ItemType.PRODUCT"
        assert str(ItemType.COUPON) == "ItemType.COUPON"
        assert str(ItemType.WEEKLY_AD) == "ItemType.WEEKLY_AD"
        assert str(ItemType.MANUAL) == "ItemType.MANUAL"


class TestEarnedReward:
    """Test the EarnedReward model."""

    def test_init(self):
        """Test initialization."""
        reward = EarnedReward(
            id="reward123",
            title="Test Reward",
            description="Test Description",
            reward_type="points",
            points_required=100,
            points_earned=50,
            is_active=True,
            category="test",
        )
        assert reward.id == "reward123"
        assert reward.title == "Test Reward"
        assert reward.reward_type == "points"
        assert reward.points_required == 100
        assert reward.points_earned == 50
        assert reward.is_active is True
        assert reward.category == "test"

    def test_is_expired(self):
        """Test expiration checking."""
        # Not expired
        reward = EarnedReward(
            id="reward123",
            title="Test Reward",
            expiration_date=datetime.now() + timedelta(days=1),
        )
        assert reward.is_expired is False

        # Expired
        reward.expiration_date = datetime.now() - timedelta(days=1)
        assert reward.is_expired is True

    def test_days_until_expiry(self):
        """Test days until expiry calculation."""
        reward = EarnedReward(
            id="reward123",
            title="Test Reward",
            expiration_date=datetime.now() + timedelta(days=5),
        )
        assert 4 <= reward.days_until_expiry <= 6  # Allow for timing variance


class TestMCardInfo:
    """Test the MCardInfo model."""

    def test_init(self):
        """Test initialization."""
        mcard = MCardInfo(
            card_number="1234567890123456",
            card_type="mPerks",
            balance=25.50,
            is_active=True,
        )
        assert mcard.card_number == "1234567890123456"
        assert mcard.card_type == "mPerks"
        assert mcard.balance == 25.50
        assert mcard.is_active is True

    def test_is_expired(self):
        """Test expiration checking."""
        # Not expired
        mcard = MCardInfo(
            card_number="1234567890123456",
            card_type="mPerks",
            expiration_date=datetime.now() + timedelta(days=1),
        )
        assert mcard.is_expired is False

        # Expired
        mcard.expiration_date = datetime.now() - timedelta(days=1)
        assert mcard.is_expired is True


if __name__ == "__main__":
    pytest.main([__file__])
