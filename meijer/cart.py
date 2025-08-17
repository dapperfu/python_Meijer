#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create MeijerCart class for shopping cart management based on API analysis
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package, requests, typing
 */

Meijer Shopping Cart Management
==============================

This module provides a comprehensive interface for managing Meijer shopping carts,
including adding/removing items, updating quantities, and managing pickup orders.
"""

import json
import logging
from typing import Dict, List, Optional, Any, Union
from dataclasses import dataclass, asdict
from datetime import datetime

import requests

from .api_client import MeijerAPIClient
from .exceptions import MeijerAPIError, CartError


@dataclass
class CartItem:
    """Represents an item in the shopping cart."""
    
    product_id: str
    name: str
    quantity: float
    unit_price: float
    total_price: float
    entry_id: Optional[str] = None
    image_url: Optional[str] = None
    category: Optional[str] = None
    store_id: Optional[str] = None
    pickup_available: bool = True
    delivery_available: bool = True


@dataclass
class CartSummary:
    """Summary information about the shopping cart."""
    
    cart_id: str
    store_id: str
    item_count: int
    subtotal: float
    tax: float
    total: float
    pickup_fee: float = 0.0
    delivery_fee: float = 0.0
    savings: float = 0.0
    mperks_discount: float = 0.0


@dataclass
class PickupSlot:
    """Available pickup time slot."""
    
    slot_id: str
    date: str
    start_time: str
    end_time: str
    available: bool = True
    capacity: Optional[int] = None


class MeijerCart:
    """
    Manages Meijer shopping cart operations.
    
    This class provides methods to interact with the Meijer shopping cart API,
    including adding/removing items, updating quantities, and managing pickup orders.
    
    Attributes
    ----------
    api_client : MeijerAPIClient
        The authenticated API client for making requests
    store_id : str
        The store ID for cart operations
    cart_id : Optional[str]
        The current cart ID (set after first operation)
    logger : logging.Logger
        Logger instance for debugging and monitoring
    """
    
    def __init__(self, api_client: MeijerAPIClient, store_id: str):
        """
        Initialize the MeijerCart instance.
        
        Parameters
        ----------
        api_client : MeijerAPIClient
            Authenticated API client instance
        store_id : str
            Store ID for cart operations
        """
        self.api_client = api_client
        self.store_id = store_id
        self.cart_id: Optional[str] = None
        self.logger = logging.getLogger(__name__)
        
        # Cart state
        self._items: List[CartItem] = []
        self._summary: Optional[CartSummary] = None
        self._last_updated: Optional[datetime] = None
    
    def get_current_cart(self, calculate_loyalty: bool = True) -> CartSummary:
        """
        Retrieve the current shopping cart.
        
        Parameters
        ----------
        calculate_loyalty : bool, optional
            Whether to calculate loyalty card discounts, by default True
            
        Returns
        -------
        CartSummary
            Summary of the current cart
            
        Raises
        ------
        CartError
            If unable to retrieve cart information
        """
        try:
            params = {
                'store': self.store_id,
                'calculateForLC': str(calculate_loyalty).lower(),
                'fields': 'FULL',
                'fetchGroup': 'DEFAULT'
            }
            
            response = self.api_client.get('/digital/occ/v3/carts/current', params=params)
            
            if response.status_code != 200:
                raise CartError(f"Failed to retrieve cart: {response.status_code}")
            
            cart_data = response.json()
            self._parse_cart_response(cart_data)
            
            return self._summary
            
        except Exception as e:
            self.logger.error(f"Error retrieving current cart: {e}")
            raise CartError(f"Failed to retrieve cart: {str(e)}")
    
    def add_item(self, product_id: str, quantity: float = 1.0, 
                 retain_out_of_stock: bool = False) -> CartItem:
        """
        Add an item to the shopping cart.
        
        Parameters
        ----------
        product_id : str
            The product ID to add
        quantity : float, optional
            Quantity to add, by default 1.0
        retain_out_of_stock : bool, optional
            Whether to retain out-of-stock items, by default False
            
        Returns
        -------
        CartItem
            The added cart item
            
        Raises
        ------
        CartError
            If unable to add item to cart
        """
        try:
            if not self.cart_id:
                # Get current cart first to establish cart_id
                self.get_current_cart()
            
            if not self.cart_id:
                raise CartError("No active cart available")
            
            params = {
                'store': self.store_id,
                'fields': 'FULL',
                'retainOutOfStock': str(retain_out_of_stock).lower()
            }
            
            url = f'/digital/occ/v3/carts/{self.cart_id}/add/{product_id}/{quantity}'
            response = self.api_client.post(url, params=params)
            
            if response.status_code != 200:
                raise CartError(f"Failed to add item: {response.status_code}")
            
            # Refresh cart data
            self.get_current_cart()
            
            # Find the added item
            added_item = next((item for item in self._items if item.product_id == product_id), None)
            if not added_item:
                raise CartError("Item added but not found in cart")
            
            return added_item
            
        except Exception as e:
            self.logger.error(f"Error adding item {product_id}: {e}")
            raise CartError(f"Failed to add item: {str(e)}")
    
    def update_quantity(self, entry_id: str, quantity: float) -> CartItem:
        """
        Update the quantity of an item in the cart.
        
        Parameters
        ----------
        entry_id : str
            The cart entry ID to update
        quantity : float
            New quantity for the item
            
        Returns
        -------
        CartItem
            The updated cart item
            
        Raises
        ------
        CartError
            If unable to update quantity
        """
        try:
            if not self.cart_id:
                raise CartError("No active cart available")
            
            params = {
                'qty': str(quantity),
                'store': self.store_id,
                'fields': 'FULL',
                'retainOutOfStock': 'false'
            }
            
            url = f'/digital/occ/v3/carts/{self.cart_id}/entries/{entry_id}'
            response = self.api_client.patch(url, params=params)
            
            if response.status_code != 200:
                raise CartError(f"Failed to update quantity: {response.status_code}")
            
            # Refresh cart data
            self.get_current_cart()
            
            # Find the updated item
            updated_item = next((item for item in self._items if item.entry_id == entry_id), None)
            if not updated_item:
                raise CartError("Item updated but not found in cart")
            
            return updated_item
            
        except Exception as e:
            self.logger.error(f"Error updating quantity for entry {entry_id}: {e}")
            raise CartError(f"Failed to update quantity: {str(e)}")
    
    def remove_item(self, entry_id: str) -> bool:
        """
        Remove an item from the shopping cart.
        
        Parameters
        ----------
        entry_id : str
            The cart entry ID to remove
            
        Returns
        -------
        bool
            True if item was removed successfully
            
        Raises
        ------
        CartError
            If unable to remove item
        """
        try:
            if not self.cart_id:
                raise CartError("No active cart available")
            
            params = {
                'store': self.store_id,
                'fields': 'FULL'
            }
            
            url = f'/digital/occ/v3/carts/{self.cart_id}/entries/{entry_id}'
            response = self.api_client.delete(url, params=params)
            
            if response.status_code != 200:
                raise CartError(f"Failed to remove item: {response.status_code}")
            
            # Refresh cart data
            self.get_current_cart()
            
            return True
            
        except Exception as e:
            self.logger.error(f"Error removing item {entry_id}: {e}")
            raise CartError(f"Failed to remove item: {str(e)}")
    
    def clear_cart(self) -> bool:
        """
        Clear all items from the shopping cart.
        
        Returns
        -------
        bool
            True if cart was cleared successfully
            
        Raises
        ------
        CartError
            If unable to clear cart
        """
        try:
            if not self.cart_id:
                return True  # Already empty
            
            # Remove each item individually
            for item in self._items:
                if item.entry_id:
                    self.remove_item(item.entry_id)
            
            return True
            
        except Exception as e:
            self.logger.error(f"Error clearing cart: {e}")
            raise CartError(f"Failed to clear cart: {str(e)}")
    
    def get_pickup_slots(self, date: Optional[str] = None) -> List[PickupSlot]:
        """
        Get available pickup time slots.
        
        Parameters
        ----------
        date : str, optional
            Specific date to check (YYYY-MM-DD format), by default None
            
        Returns
        -------
        List[PickupSlot]
            List of available pickup slots
            
        Raises
        ------
        CartError
            If unable to retrieve pickup slots
        """
        try:
            params = {
                'store': self.store_id,
                'fields': 'FULL'
            }
            
            if date:
                params['date'] = date
            
            response = self.api_client.post('/digital/hybris/v3/fulfillment/reservationslots', params=params)
            
            if response.status_code != 200:
                raise CartError(f"Failed to retrieve pickup slots: {response.status_code}")
            
            slots_data = response.json()
            return self._parse_pickup_slots(slots_data)
            
        except Exception as e:
            self.logger.error(f"Error retrieving pickup slots: {e}")
            raise CartError(f"Failed to retrieve pickup slots: {str(e)}")
    
    def reserve_pickup_slot(self, slot_id: str, date: str, time: str) -> bool:
        """
        Reserve a pickup time slot.
        
        Parameters
        ----------
        slot_id : str
            The slot ID to reserve
        date : str
            Date for pickup (YYYY-MM-DD format)
        time : str
            Time for pickup (HH:MM format)
            
        Returns
        -------
        bool
            True if slot was reserved successfully
            
        Raises
        ------
        CartError
            If unable to reserve slot
        """
        try:
            if not self.cart_id:
                raise CartError("No active cart available")
            
            payload = {
                'cartId': self.cart_id,
                'slotId': slot_id,
                'date': date,
                'time': time,
                'storeId': self.store_id
            }
            
            response = self.api_client.post('/digital/hybris/v3/fulfillment/reserve', json=payload)
            
            if response.status_code != 200:
                raise CartError(f"Failed to reserve pickup slot: {response.status_code}")
            
            return True
            
        except Exception as e:
            self.logger.error(f"Error reserving pickup slot: {e}")
            raise CartError(f"Failed to reserve pickup slot: {str(e)}")
    
    def get_cart_items(self) -> List[CartItem]:
        """
        Get all items in the current cart.
        
        Returns
        -------
        List[CartItem]
            List of cart items
        """
        if not self._items:
            self.get_current_cart()
        return self._items.copy()
    
    def get_cart_summary(self) -> Optional[CartSummary]:
        """
        Get the current cart summary.
        
        Returns
        -------
        Optional[CartSummary]
            Cart summary if available, None otherwise
        """
        if not self._summary:
            self.get_current_cart()
        return self._summary
    
    def get_item_by_product_id(self, product_id: str) -> Optional[CartItem]:
        """
        Find a cart item by product ID.
        
        Parameters
        ----------
        product_id : str
            The product ID to search for
            
        Returns
        -------
        Optional[CartItem]
            The cart item if found, None otherwise
        """
        return next((item for item in self._items if item.product_id == product_id), None)
    
    def get_item_by_entry_id(self, entry_id: str) -> Optional[CartItem]:
        """
        Find a cart item by entry ID.
        
        Parameters
        ----------
        entry_id : str
            The cart entry ID to search for
            
        Returns
        -------
        Optional[CartItem]
            The cart item if found, None otherwise
        """
        return next((item for item in self._items if item.entry_id == entry_id), None)
    
    def _parse_cart_response(self, cart_data: Dict[str, Any]) -> None:
        """
        Parse the cart API response and update internal state.
        
        Parameters
        ----------
        cart_data : Dict[str, Any]
            Raw cart data from API response
        """
        try:
            # Extract cart ID
            self.cart_id = cart_data.get('code')
            
            # Parse cart items
            self._items = []
            entries = cart_data.get('entries', [])
            
            for entry in entries:
                product = entry.get('product', {})
                item = CartItem(
                    product_id=product.get('code', ''),
                    name=product.get('name', ''),
                    quantity=float(entry.get('quantity', 0)),
                    unit_price=float(entry.get('basePrice', {}).get('value', 0)),
                    total_price=float(entry.get('totalPrice', {}).get('value', 0)),
                    entry_id=entry.get('entryNumber'),
                    image_url=product.get('images', [{}])[0].get('url') if product.get('images') else None,
                    category=product.get('categories', [{}])[0].get('name') if product.get('categories') else None,
                    store_id=self.store_id
                )
                self._items.append(item)
            
            # Parse cart summary
            total_price = cart_data.get('totalPrice', {})
            self._summary = CartSummary(
                cart_id=self.cart_id or '',
                store_id=self.store_id,
                item_count=len(self._items),
                subtotal=float(total_price.get('subTotal', {}).get('value', 0)),
                tax=float(total_price.get('totalTax', {}).get('value', 0)),
                total=float(total_price.get('value', 0)),
                savings=float(total_price.get('totalDiscounts', {}).get('value', 0))
            )
            
            self._last_updated = datetime.now()
            
        except Exception as e:
            self.logger.error(f"Error parsing cart response: {e}")
            raise CartError(f"Failed to parse cart response: {str(e)}")
    
    def _parse_pickup_slots(self, slots_data: Dict[str, Any]) -> List[PickupSlot]:
        """
        Parse pickup slots API response.
        
        Parameters
        ----------
        slots_data : Dict[str, Any]
            Raw pickup slots data from API response
            
        Returns
        -------
        List[PickupSlot]
            List of parsed pickup slots
        """
        try:
            slots = []
            slots_list = slots_data.get('slots', [])
            
            for slot_data in slots_list:
                slot = PickupSlot(
                    slot_id=slot_data.get('id', ''),
                    date=slot_data.get('date', ''),
                    start_time=slot_data.get('startTime', ''),
                    end_time=slot_data.get('endTime', ''),
                    available=slot_data.get('available', True),
                    capacity=slot_data.get('capacity')
                )
                slots.append(slot)
            
            return slots
            
        except Exception as e:
            self.logger.error(f"Error parsing pickup slots: {e}")
            return []
    
    def __str__(self) -> str:
        """String representation of the cart."""
        if not self._summary:
            return f"MeijerCart(store_id={self.store_id}, items=0, total=$0.00)"
        
        return (f"MeijerCart(store_id={self.store_id}, "
                f"items={self._summary.item_count}, "
                f"total=${self._summary.total:.2f})")
    
    def __repr__(self) -> str:
        """Detailed string representation of the cart."""
        return (f"MeijerCart(api_client={self.api_client}, "
                f"store_id='{self.store_id}', "
                f"cart_id='{self.cart_id}', "
                f"items={len(self._items)})") 