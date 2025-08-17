#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Update test file for MeijerCart class based on actual API endpoints
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package, pytest
 */

Tests for MeijerCart class functionality based on actual API endpoints.
"""

import pytest
from unittest.mock import Mock, patch, AsyncMock
from typing import Dict, Any
from datetime import datetime

from meijer.cart import (
    MeijerCart, PickupSlot, DeliverySlot, FulfillmentRequest
)
from meijer.exceptions import CartError, MeijerAPIError


class TestMeijerCart:
    """Test cases for MeijerCart class."""
    
    def setup_method(self) -> None:
        """Set up test fixtures."""
        self.mock_api_client = Mock()
        self.mock_api_client.get = AsyncMock()
        self.mock_api_client.post = AsyncMock()
        
        self.cart = MeijerCart(self.mock_api_client, store_id="217")
    
    def test_init(self) -> None:
        """Test cart initialization."""
        assert self.cart.store_id == "217"
        assert self.cart._cart_data is None
        assert self.cart._last_updated is None
        assert self.cart.api_client == self.mock_api_client
    
    def test_store_id_setter(self) -> None:
        """Test store ID setter clears cached data."""
        # Set some mock data
        self.cart._cart_data = {"test": "data"}
        self.cart._last_updated = datetime.now()
        
        # Change store ID
        self.cart.store_id = "47"
        
        assert self.cart.store_id == "47"
        assert self.cart._cart_data is None
        assert self.cart._last_updated is None
    
    @pytest.mark.asyncio
    async def test_get_current_cart_success(self) -> None:
        """Test successful cart retrieval."""
        # Mock API response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "code": "cart_123",
            "totalItems": 2,
            "totalPrice": {"value": 15.99}
        }
        
        self.mock_api_client.get.return_value = mock_response
        
        # Call method
        result = await self.cart.get_current_cart()
        
        # Verify API call
        self.mock_api_client.get.assert_called_once()
        call_args = self.mock_api_client.get.call_args[0][0]
        assert "carts/current" in call_args
        assert "store=217" in call_args
        assert "calculateForLC=true" in call_args
        
        # Verify result
        assert result["code"] == "cart_123"
        assert self.cart._cart_data == result
        assert self.cart._last_updated is not None
    
    @pytest.mark.asyncio
    async def test_get_current_cart_api_error(self) -> None:
        """Test cart retrieval with API error."""
        # Mock API error response
        mock_response = Mock()
        mock_response.status_code = 500
        
        self.mock_api_client.get.return_value = mock_response
        
        # Call method and expect error
        with pytest.raises(CartError, match="Failed to retrieve cart: 500"):
            await self.cart.get_current_cart()
    
    @pytest.mark.asyncio
    async def test_get_current_cart_force_refresh(self) -> None:
        """Test cart retrieval with force refresh."""
        # Set existing data
        self.cart._cart_data = {"old": "data"}
        self.cart._last_updated = datetime.now()
        
        # Mock API response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"new": "data"}
        
        self.mock_api_client.get.return_value = mock_response
        
        # Call with force refresh
        result = await self.cart.get_current_cart(force_refresh=True)
        
        # Verify API was called despite recent data
        self.mock_api_client.get.assert_called_once()
        assert result == {"new": "data"}
    
    @pytest.mark.asyncio
    async def test_get_pickup_slots_success(self) -> None:
        """Test successful pickup slots retrieval."""
        # Mock API response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "slots": [
                {
                    "id": "slot_1",
                    "startTime": "2024-12-20T10:00:00",
                    "endTime": "2024-12-20T11:00:00",
                    "available": True,
                    "maxOrders": 10,
                    "currentOrders": 5
                }
            ]
        }
        
        self.mock_api_client.post.return_value = mock_response
        
        # Call method
        result = await self.cart.get_pickup_slots()
        
        # Verify API call
        self.mock_api_client.post.assert_called_once()
        call_args = self.mock_api_client.post.call_args
        
        # Check URL
        assert call_args[0][0] == "/digital/hybris/v3/fulfillment/reservationslots"
        
        # Check request data
        request_data = call_args[1]["json"]
        assert request_data["store"] == "217"
        assert request_data["fulfillmentType"] == "pickup"
        assert request_data["deliveryPartner"] == "SHIPT"
        
        # Check headers
        headers = call_args[1]["headers"]
        assert headers["x-mfc-store"] == "217"
        assert headers["fulfillmenttype"] == "pickup"
        
        # Verify result
        assert len(result) == 1
        slot = result[0]
        assert slot.slot_id == "slot_1"
        assert slot.is_available is True
        assert slot.max_orders == 10
        assert slot.current_orders == 5
    
    @pytest.mark.asyncio
    async def test_get_delivery_slots_success(self) -> None:
        """Test successful delivery slots retrieval."""
        # Mock API response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "slots": [
                {
                    "id": "delivery_1",
                    "startTime": "2024-12-20T14:00:00",
                    "endTime": "2024-12-20T15:00:00",
                    "available": True,
                    "deliveryFee": 5.99,
                    "minOrderAmount": 25.00
                }
            ]
        }
        
        self.mock_api_client.post.return_value = mock_response
        
        # Call method
        result = await self.cart.get_delivery_slots()
        
        # Verify API call
        self.mock_api_client.post.assert_called_once()
        call_args = self.mock_api_client.post.call_args
        
        # Check request data
        request_data = call_args[1]["json"]
        assert request_data["fulfillmentType"] == "delivery"
        
        # Check headers
        headers = call_args[1]["headers"]
        assert headers["fulfillmenttype"] == "delivery"
        
        # Verify result
        assert len(result) == 1
        slot = result[0]
        assert slot.slot_id == "delivery_1"
        assert slot.delivery_fee == 5.99
        assert slot.min_order_amount == 25.00
    
    @pytest.mark.asyncio
    async def test_get_pickup_slots_custom_partners(self) -> None:
        """Test pickup slots with custom delivery and curbside partners."""
        # Mock API response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"slots": []}
        
        self.mock_api_client.post.return_value = mock_response
        
        # Call with custom partners
        await self.cart.get_pickup_slots(
            delivery_partner="MI9",
            curbside_partner="BOPAS"
        )
        
        # Verify custom partners were used
        call_args = self.mock_api_client.post.call_args
        request_data = call_args[1]["json"]
        headers = call_args[1]["headers"]
        
        assert request_data["deliveryPartner"] == "MI9"
        assert request_data["curbsidePartner"] == "BOPAS"
        assert headers["deliverypartner"] == "MI9"
        assert headers["curbsidepartner"] == "BOPAS"
    
    @pytest.mark.asyncio
    async def test_get_pickup_slots_custom_date(self) -> None:
        """Test pickup slots with custom date."""
        # Mock API response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"slots": []}
        
        self.mock_api_client.post.return_value = mock_response
        
        # Call with custom date
        custom_date = datetime(2024, 12, 25)
        await self.cart.get_pickup_slots(date=custom_date)
        
        # Verify custom date was used
        call_args = self.mock_api_client.post.call_args
        request_data = call_args[1]["json"]
        
        assert request_data["date"] == "2024-12-25"
    
    @pytest.mark.asyncio
    async def test_reserve_pickup_slot_not_implemented(self) -> None:
        """Test that pickup slot reservation is not yet implemented."""
        with pytest.raises(CartError):
            await self.cart.reserve_pickup_slot("slot_1", datetime.now())
    
    @pytest.mark.asyncio
    async def test_reserve_delivery_slot_not_implemented(self) -> None:
        """Test that delivery slot reservation is not yet implemented."""
        with pytest.raises(CartError):
            await self.cart.reserve_delivery_slot("slot_1", datetime.now())
    
    def test_cart_properties(self) -> None:
        """Test cart property access."""
        # Initially no data
        assert self.cart.cart_id is None
        assert self.cart.item_count == 0
        assert self.cart.total_price == 0.0
        
        # Set mock data
        self.cart._cart_data = {
            "code": "test_cart",
            "totalItems": 3,
            "totalPrice": {"value": 25.99}
        }
        
        # Test properties
        assert self.cart.cart_id == "test_cart"
        assert self.cart.item_count == 3
        assert self.cart.total_price == 25.99
    
    def test_parse_pickup_slots_empty(self) -> None:
        """Test parsing empty pickup slots response."""
        result = self.cart._parse_pickup_slots({})
        assert result == []
    
    def test_parse_pickup_slots_with_data(self) -> None:
        """Test parsing pickup slots with data."""
        slots_data = {
            "slots": [
                {
                    "id": "test_slot",
                    "startTime": "2024-12-20T10:00:00",
                    "endTime": "2024-12-20T11:00:00",
                    "available": True,
                    "maxOrders": 5
                }
            ]
        }
        
        result = self.cart._parse_pickup_slots(slots_data)
        assert len(result) == 1
        assert result[0].slot_id == "test_slot"
        assert result[0].is_available is True
        assert result[0].max_orders == 5
    
    def test_parse_delivery_slots_with_data(self) -> None:
        """Test parsing delivery slots with data."""
        slots_data = {
            "slots": [
                {
                    "id": "test_delivery",
                    "startTime": "2024-12-20T14:00:00",
                    "endTime": "2024-12-20T15:00:00",
                    "available": True,
                    "deliveryFee": 7.99,
                    "minOrderAmount": 30.00
                }
            ]
        }
        
        result = self.cart._parse_delivery_slots(slots_data)
        assert len(result) == 1
        assert result[0].slot_id == "test_delivery"
        assert result[0].delivery_fee == 7.99
        assert result[0].min_order_amount == 30.00


class TestPickupSlot:
    """Test cases for PickupSlot dataclass."""
    
    def test_pickup_slot_creation(self) -> None:
        """Test creating a pickup slot."""
        start_time = datetime(2024, 12, 20, 10, 0)
        end_time = datetime(2024, 12, 20, 11, 0)
        
        slot = PickupSlot(
            start_time=start_time,
            end_time=end_time,
            slot_id="test_slot",
            is_available=True,
            max_orders=10,
            current_orders=5
        )
        
        assert slot.start_time == start_time
        assert slot.end_time == end_time
        assert slot.slot_id == "test_slot"
        assert slot.is_available is True
        assert slot.max_orders == 10
        assert slot.current_orders == 5
    
    def test_pickup_slot_defaults(self) -> None:
        """Test pickup slot with default values."""
        start_time = datetime(2024, 12, 20, 10, 0)
        end_time = datetime(2024, 12, 20, 11, 0)
        
        slot = PickupSlot(
            start_time=start_time,
            end_time=end_time,
            slot_id="test_slot"
        )
        
        assert slot.is_available is True
        assert slot.max_orders is None
        assert slot.current_orders is None


class TestDeliverySlot:
    """Test cases for DeliverySlot dataclass."""
    
    def test_delivery_slot_creation(self) -> None:
        """Test creating a delivery slot."""
        start_time = datetime(2024, 12, 20, 14, 0)
        end_time = datetime(2024, 12, 20, 15, 0)
        
        slot = DeliverySlot(
            start_time=start_time,
            end_time=end_time,
            slot_id="test_delivery",
            is_available=True,
            delivery_fee=5.99,
            min_order_amount=25.00
        )
        
        assert slot.start_time == start_time
        assert slot.end_time == end_time
        assert slot.slot_id == "test_delivery"
        assert slot.delivery_fee == 5.99
        assert slot.min_order_amount == 25.00


class TestFulfillmentRequest:
    """Test cases for FulfillmentRequest dataclass."""
    
    def test_fulfillment_request_creation(self) -> None:
        """Test creating a fulfillment request."""
        request = FulfillmentRequest(
            store_id="217",
            fulfillment_type="pickup",
            delivery_partner="SHIPT",
            curbside_partner="MI9"
        )
        
        assert request.store_id == "217"
        assert request.fulfillment_type == "pickup"
        assert request.delivery_partner == "SHIPT"
        assert request.curbside_partner == "MI9"
        assert request.fulfillment_eligibility == "NORMAL"
        assert request.preferred_date is None
        assert request.preferred_time is None 