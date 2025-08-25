#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create mock models for development and testing
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: None
 */

Mock Models for Meijer Web Application
=====================================

Mock data models for development and testing purposes.
"""

from typing import List, Optional


class MockMeijerClient:
    """Mock Meijer client for development and testing."""

    def __init__(self):
        self.cart = MockCart()
        self.list = MockShoppingList()
        self.coupons = MockCoupons()
        self.account = MockAccount()

    def get_stores(
        self, city: Optional[str] = None, zip_code: Optional[str] = None
    ) -> List["MockStore"]:
        """Get mock stores."""
        stores = [
            MockStore(
                "Store #217", "Grand Rapids", "MI", "49503", "123 Main St", "555-0123"
            ),
            MockStore(
                "Store #123", "Lansing", "MI", "48912", "456 Oak Ave", "555-0456"
            ),
            MockStore(
                "Store #456", "Detroit", "MI", "48201", "789 Pine St", "555-0789"
            ),
        ]

        # Filter by city if specified
        if city:
            stores = [s for s in stores if s.city.lower() == city.lower()]

        # Filter by ZIP if specified
        if zip_code:
            stores = [s for s in stores if s.zip_code == zip_code]

        return stores


class MockCart:
    """Mock shopping cart."""

    def __init__(self):
        self.items = [
            MockCartItem("Milk", 2, 3.99, True, "12345"),
            MockCartItem("Bread", 1, 2.49, True, "67890"),
            MockCartItem("Eggs", 1, 4.99, True, "11111"),
        ]
        self.total_quantity = 4
        self.unique_item_count = 3
        self.cart_id = "CART_12345"
        self.store_id = "217"

    def add_item_by_upc(self, upc: str, quantity: int) -> bool:
        """Mock add item to cart."""
        return True

    def remove_item(self, entry_number: str) -> bool:
        """Mock remove item from cart."""
        return True

    def update_item_quantity(self, entry_number: str, quantity: int) -> bool:
        """Mock update item quantity."""
        return True


class MockCartItem:
    """Mock cart item."""

    def __init__(
        self, name: str, quantity: int, price: float, available: bool, entry_number: str
    ):
        self.name = name
        self.current_quantity = quantity
        self.quantity = quantity
        self.price = price
        self.available = available
        self.entry_number = entry_number


class MockShoppingList:
    """Mock shopping list."""

    def get(self) -> List["MockListItem"]:
        """Get mock shopping list items."""
        return [
            MockListItem("Milk", 2, False, "Milk for cereal"),
            MockListItem("Bread", 1, False, "Sandwich bread"),
            MockListItem("Eggs", 1, True, "For breakfast"),
        ]

    def add_item(self, upc: str, quantity: int) -> bool:
        """Mock add item to list."""
        return True

    def add_item_with_details(
        self, upc: str, description: str, quantity: int, notes: str
    ) -> bool:
        """Mock add item with details to list."""
        return True

    def remove_item(self, item_id: str) -> bool:
        """Mock remove item from list."""
        return True

    def update_item_status(self, item_id: str, status: bool) -> bool:
        """Mock update item status."""
        return True


class MockListItem:
    """Mock list item."""

    def __init__(self, description: str, quantity: int, checked: bool, notes: str):
        self.id = f"item_{hash(description) % 10000}"
        self.description = description
        self.quantity = quantity
        self.checked = checked
        self.notes = notes


class MockCoupons:
    """Mock coupons."""

    def get(self) -> List["MockCoupon"]:
        """Get mock coupons."""
        return [
            MockCoupon(
                "Save $1 on Milk",
                "Save $1 on any gallon of milk",
                1.00,
                "2024-12-31",
                False,
            ),
            MockCoupon(
                "Save $0.50 on Bread",
                "Save $0.50 on any loaf of bread",
                0.50,
                "2024-12-31",
                False,
            ),
            MockCoupon(
                "Save $2 on Eggs", "Save $2 on any dozen eggs", 2.00, "2024-12-31", True
            ),
        ]

    def clip_coupon(self, coupon_id: str) -> bool:
        """Mock clip coupon."""
        return True


class MockCoupon:
    """Mock coupon."""

    def __init__(
        self, title: str, description: str, savings: float, expires: str, clipped: bool
    ):
        self.id = f"coupon_{hash(title) % 10000}"
        self.title = title
        self.description = description
        self.savings = savings
        self.expires = expires
        self.clipped = clipped


class MockStore:
    """Mock store."""

    def __init__(
        self, name: str, city: str, state: str, zip_code: str, address: str, phone: str
    ):
        self.name = name
        self.city = city
        self.state = state
        self.zip_code = zip_code
        self.address = address
        self.phone = phone
        self.store_id = name.split("#")[1]
        self.has_curbside_pickup = True
        self.has_delivery = True
        self.has_pharmacy = True
        self.gas_station = MockGasStation()


class MockGasStation:
    """Mock gas station."""

    def __init__(self):
        self.fuel_prices = {"Regular": 3.45, "Premium": 4.25}


class MockAccount:
    """Mock account."""

    def __init__(self):
        self.email = "user@example.com"
        self.name = "John Doe"
        self.phone = "555-0123"


# Export mock classes
__all__ = [
    "MockMeijerClient",
    "MockCart",
    "MockCartItem",
    "MockShoppingList",
    "MockListItem",
    "MockCoupons",
    "MockCoupon",
    "MockStore",
    "MockGasStation",
    "MockAccount",
]
