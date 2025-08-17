#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create test file for MeijerCart class functionality
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package, pytest
 */

Tests for MeijerCart class functionality.
"""

import pytest
from unittest.mock import Mock, patch
from typing import Dict, Any

from meijer.cart import (
    MeijerCart, CartItem, CartSummary, PickupSlot, CartError
)
from meijer.exceptions import MeijerAPIError


class TestCartItem:
    """Test CartItem dataclass functionality."""
    
    def test_cart_item_creation(self) -> None:
        """Test creating a CartItem instance."""
        item = CartItem(
            product_id="12345",
            name="Test Product",
            quantity=2.0,
            unit_price=5.99,
            total_price=11.98
        )
        
        assert item.product_id == "12345"
        assert item.name == "Test Product"
        assert item.quantity == 2.0
        assert item.unit_price == 5.99
        assert item.total_price == 11.98
        assert item.entry_id is None
        assert item.pickup_available is True
        assert item.delivery_available is True
    
    def test_cart_item_with_optional_fields(self) -> None:
        """Test creating a CartItem with all optional fields."""
        item = CartItem(
            product_id="12345",
            name="Test Product",
            quantity=1.0,
            unit_price=3.49,
            total_price=3.49,
            entry_id="entry_001",
            image_url="https://example.com/image.jpg",
            category="Grocery",
            store_id="217",
            pickup_available=False,
            delivery_available=True
        )
        
        assert item.entry_id == "entry_001"
        assert item.image_url == "https://example.com/image.jpg"
        assert item.category == "Grocery"
        assert item.store_id == "217"
        assert item.pickup_available is False
        assert item.delivery_available is True


class TestCartSummary:
    """Test CartSummary dataclass functionality."""
    
    def test_cart_summary_creation(self) -> None:
        """Test creating a CartSummary instance."""
        summary = CartSummary(
            cart_id="cart_123",
            store_id="217",
            item_count=3,
            subtotal=25.97,
            tax=2.08,
            total=28.05
        )
        
        assert summary.cart_id == "cart_123"
        assert summary.store_id == "217"
        assert summary.item_count == 3
        assert summary.subtotal == 25.97
        assert summary.tax == 2.08
        assert summary.total == 28.05
        assert summary.pickup_fee == 0.0
        assert summary.delivery_fee == 0.0
        assert summary.savings == 0.0
        assert summary.mperks_discount == 0.0
    
    def test_cart_summary_with_fees_and_discounts(self) -> None:
        """Test creating a CartSummary with fees and discounts."""
        summary = CartSummary(
            cart_id="cart_123",
            store_id="217",
            item_count=2,
            subtotal=20.00,
            tax=1.60,
            total=21.60,
            pickup_fee=4.95,
            delivery_fee=0.0,
            savings=5.00,
            mperks_discount=2.50
        )
        
        assert summary.pickup_fee == 4.95
        assert summary.delivery_fee == 0.0
        assert summary.savings == 5.00
        assert summary.mperks_discount == 2.50


class TestPickupSlot:
    """Test PickupSlot dataclass functionality."""
    
    def test_pickup_slot_creation(self) -> None:
        """Test creating a PickupSlot instance."""
        slot = PickupSlot(
            slot_id="slot_001",
            date="2024-12-20",
            start_time="10:00",
            end_time="11:00"
        )
        
        assert slot.slot_id == "slot_001"
        assert slot.date == "2024-12-20"
        assert slot.start_time == "10:00"
        assert slot.end_time == "11:00"
        assert slot.available is True
        assert slot.capacity is None
    
    def test_pickup_slot_with_capacity(self) -> None:
        """Test creating a PickupSlot with capacity."""
        slot = PickupSlot(
            slot_id="slot_002",
            date="2024-12-20",
            start_time="11:00",
            end_time="12:00",
            available=True,
            capacity=15
        )
        
        assert slot.capacity == 15


class TestMeijerCart:
    """Test MeijerCart class functionality."""
    
    def setup_method(self) -> None:
        """Set up test fixtures."""
        self.mock_api_client = Mock()
        self.store_id = "217"
        self.cart = MeijerCart(self.mock_api_client, self.store_id)
    
    def test_cart_initialization(self) -> None:
        """Test cart initialization."""
        assert self.cart.api_client == self.mock_api_client
        assert self.cart.store_id == self.store_id
        assert self.cart.cart_id is None
        assert self.cart._items == []
        assert self.cart._summary is None
    
    def test_get_current_cart_success(self) -> None:
        """Test successful cart retrieval."""
        # Mock API response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "code": "cart_123",
            "entries": [
                {
                    "entryNumber": "1",
                    "quantity": 2,
                    "basePrice": {"value": 5.99},
                    "totalPrice": {"value": 11.98},
                    "product": {
                        "code": "12345",
                        "name": "Test Product",
                        "images": [{"url": "https://example.com/image.jpg"}],
                        "categories": [{"name": "Grocery"}]
                    }
                }
            ],
            "totalPrice": {
                "subTotal": {"value": 11.98},
                "totalTax": {"value": 0.96},
                "value": 12.94,
                "totalDiscounts": {"value": 0.0}
            }
        }
        
        self.mock_api_client.get.return_value = mock_response
        
        # Test cart retrieval
        summary = self.cart.get_current_cart()
        
        # Verify API call
        self.mock_api_client.get.assert_called_once()
        
        # Verify cart state
        assert self.cart.cart_id == "cart_123"
        assert len(self.cart._items) == 1
        assert self.cart._summary is not None
        assert summary.cart_id == "cart_123"
        assert summary.item_count == 1
        assert summary.total == 12.94
    
    def test_get_current_cart_api_error(self) -> None:
        """Test cart retrieval with API error."""
        # Mock API error response
        mock_response = Mock()
        mock_response.status_code = 500
        
        self.mock_api_client.get.return_value = mock_response
        
        # Test error handling
        with pytest.raises(CartError, match="Failed to retrieve cart: 500"):
            self.cart.get_current_cart()
    
    def test_add_item_success(self) -> None:
        """Test successful item addition."""
        # Setup cart with existing cart_id
        self.cart.cart_id = "cart_123"
        
        # Mock API response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"success": True}
        
        self.mock_api_client.post.return_value = mock_response
        
        # Mock get_current_cart to populate cart with test data
        def mock_get_cart():
            self.cart._items = [
                CartItem("12345", "Test Product", 2.0, 5.99, 11.98, entry_id="1")
            ]
            self.cart._summary = CartSummary(
                cart_id="cart_123",
                store_id="217",
                item_count=1,
                subtotal=11.98,
                tax=0.96,
                total=12.94
            )
            return self.cart._summary
        
        with patch.object(self.cart, 'get_current_cart', side_effect=mock_get_cart):
            # Test item addition
            result = self.cart.add_item("12345", quantity=2.0)
            
            # Verify API call
            self.mock_api_client.post.assert_called_once()
            call_args = self.mock_api_client.post.call_args
            assert "add/12345/2.0" in call_args[0][0]
            
            # Verify result
            assert result.product_id == "12345"
            assert result.quantity == 2.0
    
    def test_add_item_no_cart(self) -> None:
        """Test adding item when no cart exists."""
        # Mock get_current_cart to return None
        with patch.object(self.cart, 'get_current_cart', return_value=None):
            with pytest.raises(CartError, match="No active cart available"):
                self.cart.add_item("12345")
    
    def test_update_quantity_success(self) -> None:
        """Test successful quantity update."""
        # Setup cart with existing cart_id
        self.cart.cart_id = "cart_123"
        
        # Mock API response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"success": True}
        
        self.mock_api_client.patch.return_value = mock_response
        
        # Mock get_current_cart to populate cart with test data
        def mock_get_cart():
            self.cart._items = [
                CartItem("12345", "Test Product", 3.0, 5.99, 17.97, entry_id="1")
            ]
            self.cart._summary = CartSummary(
                cart_id="cart_123",
                store_id="217",
                item_count=1,
                subtotal=17.97,
                tax=1.44,
                total=19.41
            )
            return self.cart._summary
        
        with patch.object(self.cart, 'get_current_cart', side_effect=mock_get_cart):
            # Test quantity update
            result = self.cart.update_quantity("1", quantity=3.0)
            
            # Verify API call
            self.mock_api_client.patch.assert_called_once()
            call_args = self.mock_api_client.patch.call_args
            assert "entries/1" in call_args[0][0]
            assert call_args[1]["params"]["qty"] == "3.0"
            
            # Verify result
            assert result.entry_id == "1"
            assert result.quantity == 3.0
    
    def test_remove_item_success(self) -> None:
        """Test successful item removal."""
        # Setup cart with existing cart_id
        self.cart.cart_id = "cart_123"
        
        # Mock API response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"success": True}
        
        self.mock_api_client.delete.return_value = mock_response
        
        # Mock get_current_cart to avoid API call
        with patch.object(self.cart, 'get_current_cart'):
            # Test item removal
            result = self.cart.remove_item("1")
            
            # Verify API call
            self.mock_api_client.delete.assert_called_once()
            call_args = self.mock_api_client.delete.call_args
            assert "entries/1" in call_args[0][0]
    
    def test_get_pickup_slots_success(self) -> None:
        """Test successful pickup slots retrieval."""
        # Mock API response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "slots": [
                {
                    "id": "slot_001",
                    "date": "2024-12-20",
                    "startTime": "10:00",
                    "endTime": "11:00",
                    "available": True,
                    "capacity": 10
                }
            ]
        }
        
        self.mock_api_client.post.return_value = mock_response
        
        # Test pickup slots retrieval
        slots = self.cart.get_pickup_slots()
        
        # Verify API call
        self.mock_api_client.post.assert_called_once()
        
        # Verify slots
        assert len(slots) == 1
        assert slots[0].slot_id == "slot_001"
        assert slots[0].date == "2024-12-20"
        assert slots[0].start_time == "10:00"
        assert slots[0].end_time == "11:00"
        assert slots[0].available is True
        assert slots[0].capacity == 10
    
    def test_get_pickup_slots_api_error(self) -> None:
        """Test pickup slots retrieval with API error."""
        # Mock API error response
        mock_response = Mock()
        mock_response.status_code = 500
        
        self.mock_api_client.post.return_value = mock_response
        
        # Test error handling
        with pytest.raises(CartError, match="Failed to retrieve pickup slots: 500"):
            self.cart.get_pickup_slots()
    
    def test_reserve_pickup_slot_success(self) -> None:
        """Test successful pickup slot reservation."""
        # Setup cart with existing cart_id
        self.cart.cart_id = "cart_123"
        
        # Mock API response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"success": True}
        
        self.mock_api_client.post.return_value = mock_response
        
        # Test slot reservation
        result = self.cart.reserve_pickup_slot("slot_001", "2024-12-20", "10:00")
        
        # Verify API call
        self.mock_api_client.post.assert_called_once()
        call_args = self.mock_api_client.post.call_args
        assert "fulfillment/reserve" in call_args[0][0]
        
        # Verify payload
        payload = call_args[1]["json"]
        assert payload["cartId"] == "cart_123"
        assert payload["slotId"] == "slot_001"
        assert payload["date"] == "2024-12-20"
        assert payload["time"] == "10:00"
        assert payload["storeId"] == "217"
    
    def test_reserve_pickup_slot_no_cart(self) -> None:
        """Test slot reservation when no cart exists."""
        with pytest.raises(CartError, match="No active cart available"):
            self.cart.reserve_pickup_slot("slot_001", "2024-12-20", "10:00")
    
    def test_clear_cart_success(self) -> None:
        """Test successful cart clearing."""
        # Setup cart with items
        self.cart.cart_id = "cart_123"
        self.cart._items = [
            CartItem("1", "Item 1", 1.0, 5.99, 5.99, entry_id="1"),
            CartItem("2", "Item 2", 1.0, 3.49, 3.49, entry_id="2")
        ]
        
        # Mock remove_item to avoid API calls
        with patch.object(self.cart, 'remove_item', return_value=True):
            result = self.cart.clear_cart()
            
            assert result is True
            # Verify remove_item was called for each item
            assert self.cart.remove_item.call_count == 2
    
    def test_clear_cart_empty(self) -> None:
        """Test clearing an already empty cart."""
        result = self.cart.clear_cart()
        assert result is True
    
    def test_get_cart_items_empty(self) -> None:
        """Test getting items from empty cart."""
        # Mock get_current_cart to avoid API call
        with patch.object(self.cart, 'get_current_cart'):
            items = self.cart.get_cart_items()
            assert items == []
    
    def test_get_cart_summary_none(self) -> None:
        """Test getting summary from cart with no summary."""
        # Mock get_current_cart to avoid API call
        with patch.object(self.cart, 'get_current_cart'):
            summary = self.cart.get_cart_summary()
            assert summary is None
    
    def test_get_item_by_product_id(self) -> None:
        """Test finding item by product ID."""
        # Setup cart with items
        self.cart._items = [
            CartItem("1", "Item 1", 1.0, 5.99, 5.99),
            CartItem("2", "Item 2", 1.0, 3.49, 3.49)
        ]
        
        item = self.cart.get_item_by_product_id("1")
        assert item is not None
        assert item.name == "Item 1"
        
        item = self.cart.get_item_by_product_id("999")
        assert item is None
    
    def test_get_item_by_entry_id(self) -> None:
        """Test finding item by entry ID."""
        # Setup cart with items
        self.cart._items = [
            CartItem("1", "Item 1", 1.0, 5.99, 5.99, entry_id="entry_1"),
            CartItem("2", "Item 2", 1.0, 3.49, 3.49, entry_id="entry_2")
        ]
        
        item = self.cart.get_item_by_entry_id("entry_1")
        assert item is not None
        assert item.name == "Item 1"
        
        item = self.cart.get_item_by_entry_id("entry_999")
        assert item is None
    
    def test_string_representation(self) -> None:
        """Test string representation of cart."""
        # Test empty cart
        assert str(self.cart) == "MeijerCart(store_id=217, items=0, total=$0.00)"
        
        # Test cart with summary
        self.cart._summary = CartSummary(
            cart_id="cart_123",
            store_id="217",
            item_count=2,
            subtotal=20.00,
            tax=1.60,
            total=21.60
        )
        
        assert str(self.cart) == "MeijerCart(store_id=217, items=2, total=$21.60)"
    
    def test_repr_representation(self) -> None:
        """Test detailed string representation of cart."""
        repr_str = repr(self.cart)
        assert "MeijerCart" in repr_str
        assert "store_id='217'" in repr_str
        assert "cart_id='None'" in repr_str
        assert "items=0" in repr_str


if __name__ == "__main__":
    pytest.main([__file__]) 