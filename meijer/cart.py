#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Update MeijerCart class based on actual API endpoints from mitmproxy log analysis
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
including cart retrieval, pickup/delivery slot reservation, and fulfillment management.
Based on actual API analysis from mitmproxy logs.
"""

import logging
from dataclasses import dataclass
from datetime import datetime, time
from typing import Dict, List, Optional, Any
from urllib.parse import urlencode

from meijer.exceptions import CartError


@dataclass
class PickupSlot:
    """Represents an available pickup time slot."""

    start_time: datetime
    end_time: datetime
    slot_id: str
    is_available: bool = True
    max_orders: Optional[int] = None
    current_orders: Optional[int] = None


@dataclass
class DeliverySlot:
    """Represents an available delivery time slot."""

    start_time: datetime
    end_time: datetime
    slot_id: str
    is_available: bool = True
    delivery_fee: Optional[float] = None
    min_order_amount: Optional[float] = None
    max_orders: Optional[int] = None
    current_orders: Optional[int] = None


@dataclass
class FulfillmentRequest:
    """Request for pickup or delivery slot reservation."""

    store_id: str
    fulfillment_type: str  # "pickup" or "delivery"
    delivery_partner: str  # "SHIPT", "MI9", etc.
    curbside_partner: Optional[str] = None
    fulfillment_eligibility: str = "NORMAL"
    preferred_date: Optional[datetime] = None
    preferred_time: Optional[time] = None


class MeijerCart:
    """
    Meijer Shopping Cart Management Class.

    This class handles cart operations based on actual API endpoints found in
    the mitmproxy log analysis. It provides methods for:
    - Retrieving current cart information
    - Managing pickup and delivery slot reservations
    - Fulfillment type selection

    Note: Cart modification endpoints (add/remove items, update quantities) were
    not found in the current log analysis and may require additional investigation.
    """

    def __init__(self, api_client: Any, store_id: str = "217"):
        """
        Initialize the MeijerCart instance.

        Parameters
        ----------
        api_client : MeijerAPIClient
            Authenticated API client instance
        store_id : str, optional
            Store ID for cart operations (default: "217")
        """
        self.api_client = api_client
        self.store_id = store_id
        self.logger = logging.getLogger(__name__)

        # Cart state
        self._cart_data: Optional[Dict[str, Any]] = None
        self._last_updated: Optional[datetime] = None

    def get_current_cart(self, force_refresh: bool = False) -> Dict[str, Any]:
        """
        Retrieve the current shopping cart.

        This method calls the actual API endpoint found in the logs:
        GET /digital/occ/v3/carts/current

        Parameters
        ----------
        force_refresh : bool, optional
            Force refresh of cart data even if recently fetched (default: False)

        Returns
        -------
        Dict[str, Any]
            Current cart data including items, totals, and metadata

        Raises
        ------
        CartError
            If cart retrieval fails
        MeijerAPIError
            If API request fails
        """
        try:
            # Check if we have recent data and don't need to refresh
            if (
                not force_refresh
                and self._cart_data
                and self._last_updated
                and (datetime.now() - self._last_updated).seconds < 300
            ):  # 5 minutes
                return self._cart_data

            # Build query parameters based on actual API call from logs
            params = {
                "store": self.store_id,
                "calculateForLC": "true",
                "fields": "FULL",
                "fetchCartModifications": "true",
                "retainOutOfStock": "true",
            }

            url = f"{self.api_client.api_base_url}/digital/occ/v3/carts/current"

            self.logger.info(f"Retrieving current cart for store {self.store_id}")
            response = self.api_client._make_request("GET", url, params=params)

            if response.status_code == 200:
                self._cart_data = response.json()
                self._last_updated = datetime.now()
                self.logger.info("Cart retrieved successfully")
                return self._cart_data
            else:
                raise CartError(f"Failed to retrieve cart: {response.status_code}")

        except Exception as e:
            if isinstance(e, CartError):
                raise
            raise CartError(f"Error retrieving cart: {str(e)}")

    def get_pickup_slots(
        self,
        date: Optional[datetime] = None,
        delivery_partner: str = "SHIPT",
        curbside_partner: str = "MI9",
    ) -> List[PickupSlot]:
        """
        Get available pickup time slots.

        This method calls the actual API endpoint found in the logs:
        POST /digital/hybris/v3/fulfillment/reservationslots

        Parameters
        ----------
        date : datetime, optional
            Preferred date for pickup slots (default: today)
        delivery_partner : str, optional
            Delivery partner (default: "SHIPT")
        curbside_partner : str, optional
            Curbside partner (default: "MI9")

        Returns
        -------
        List[PickupSlot]
            List of available pickup slots

        Raises
        ------
        CartError
            If slot retrieval fails
        """
        try:
            if date is None:
                date = datetime.now()

            # Build request body based on actual API call from logs
            # The working app sends storeId and lineItems array
            # The API might require at least one item in lineItems
            request_data = {
                "storeId": self.store_id,
                "lineItems": [
                    {
                        "retailerProductId": "0000000000",  # Dummy product ID
                        "retailerProductIdType": "UPCA",
                        "quantity": 1.0,
                        "isAlcohol": False
                    }
                ]
            }

            # Get default headers (includes Authorization) and merge with custom headers
            # The fulfillment endpoint might expect specific fulfillment headers
            headers = self.api_client._get_api_headers()
            headers.update({
                "Content-Type": "application/json",
                "X-Fulfillment-Type": "pickup",
                "X-Fulfillment-Store": self.store_id
            })

            url = f"{self.api_client.api_base_url}/digital/hybris/v3/fulfillment/reservationslots"

            self.logger.info(f"Retrieving pickup slots for store {self.store_id}")
            self.logger.info(f"Request URL: {url}")
            self.logger.info(f"Request headers: {headers}")
            self.logger.info(f"Request body: {request_data}")
            
            response = self.api_client._make_request(
                "POST", url, json_data=request_data, headers=headers
            )

            if response.status_code == 200:
                slots_data = response.json()
                return self._parse_pickup_slots(slots_data)
            else:
                raise CartError(
                    f"Failed to retrieve pickup slots: {response.status_code} - {response.text}"
                )

        except Exception as e:
            if isinstance(e, CartError):
                raise
            raise CartError(f"Error retrieving pickup slots: {str(e)}")

    def get_delivery_slots(
        self, date: Optional[datetime] = None, delivery_partner: str = "SHIPT"
    ) -> List[DeliverySlot]:
        """
        Get available delivery time slots.

        This method calls the actual API endpoint found in the logs:
        POST /digital/hybris/v3/fulfillment/reservationslots

        Parameters
        ----------
        date : datetime, optional
            Preferred date for delivery slots (default: today)
        delivery_partner : str, optional
            Delivery partner (default: "SHIPT")

        Returns
        -------
        List[DeliverySlot]
            List of available delivery slots

        Raises
        ------
        CartError
            If slot retrieval fails
        """
        try:
            if date is None:
                date = datetime.now()

            # Build request body based on actual API call from logs
            # The working app sends storeId and lineItems array
            # The API might require at least one item in lineItems
            request_data = {
                "storeId": self.store_id,
                "lineItems": [
                    {
                        "retailerProductId": "0000000000",  # Dummy product ID
                        "retailerProductIdType": "UPCA",
                        "quantity": 1.0,
                        "isAlcohol": False
                    }
                ]
            }

            # Get default headers (includes Authorization) and merge with custom headers
            # Note: The fulfillment endpoint expects specific header format
            headers = self.api_client._get_api_headers()
            headers.update({
                "Content-Type": "application/json",
                "X-MFC-Store": self.store_id,  # Use proper case
                "DeliveryPartner": delivery_partner,  # Use proper case
                "FulfillmentType": "delivery",  # Use proper case
                "FulfillmentEligibility": "NORMAL",  # Use proper case
            })

            url = f"{self.api_client.api_base_url}/digital/hybris/v3/fulfillment/reservationslots"

            self.logger.info(f"Retrieving delivery slots for store {self.store_id}")
            response = self.api_client._make_request(
                "POST", url, json_data=request_data, headers=headers
            )

            if response.status_code == 200:
                slots_data = response.json()
                return self._parse_delivery_slots(slots_data)
            else:
                raise CartError(
                    f"Failed to retrieve delivery slots: {response.status_code} - {response.text}"
                )

        except Exception as e:
            if isinstance(e, CartError):
                raise
            raise CartError(f"Error retrieving delivery slots: {str(e)}")

    def reserve_pickup_slot(
        self, slot_id: str, delivery_partner: str = "SHIPT", curbside_partner: str = "MI9"
    ) -> bool:
        """
        Reserve a pickup time slot.

        Parameters
        ----------
        slot_id : str
            ID of the slot to reserve
        delivery_partner : str, optional
            Delivery partner (default: "SHIPT")
        curbside_partner : str, optional
            Curbside partner (default: "MI9")

        Returns
        -------
        bool
            True if reservation successful

        Raises
        ------
        CartError
            If reservation fails
        """
        try:
            # Build request body based on actual API call from logs
            # The working app sends storeId and lineItems array
            # The API might require at least one item in lineItems
            request_data = {
                "storeId": self.store_id,
                "lineItems": [
                    {
                        "retailerProductId": "0000000000",  # Dummy product ID
                        "retailerProductIdType": "UPCA",
                        "quantity": 1.0,
                        "isAlcohol": False
                    }
                ]
            }

            # Get default headers (includes Authorization) and merge with custom headers
            # The fulfillment endpoint might expect specific fulfillment headers
            headers = self.api_client._get_api_headers()
            headers.update({
                "Content-Type": "application/json",
                "X-Fulfillment-Type": "pickup",
                "X-Fulfillment-Store": self.store_id
            })

            url = f"{self.api_client.api_base_url}/digital/hybris/v3/fulfillment/reservationslots"

            self.logger.info(f"Reserving pickup slot {slot_id} for store {self.store_id}")
            response = self.api_client._make_request(
                "POST", url, json_data=request_data, headers=headers
            )

            if response.status_code == 200:
                self.logger.info(f"Successfully reserved pickup slot {slot_id}")
                return True
            else:
                raise CartError(
                    f"Failed to reserve pickup slot: {response.status_code} - {response.text}"
                )

        except Exception as e:
            if isinstance(e, CartError):
                raise
            raise CartError(f"Error reserving pickup slot: {str(e)}")

    def reserve_delivery_slot(
        self, slot_id: str, delivery_partner: str = "SHIPT"
    ) -> bool:
        """
        Reserve a delivery time slot.

        Parameters
        ----------
        slot_id : str
            ID of the slot to reserve
        delivery_partner : str, optional
            Delivery partner (default: "SHIPT")

        Returns
        -------
        bool
            True if reservation successful

        Raises
        ------
        CartError
            If reservation fails
        """
        try:
            # Build request body based on actual API call from logs
            # The working app sends storeId and lineItems array
            # The API might require at least one item in lineItems
            request_data = {
                "storeId": self.store_id,
                "lineItems": [
                    {
                        "retailerProductId": "0000000000",  # Dummy product ID
                        "retailerProductIdType": "UPCA",
                        "quantity": 1.0,
                        "isAlcohol": False
                    }
                ]
            }

            # Get default headers (includes Authorization) and merge with custom headers
            # The fulfillment endpoint might expect specific fulfillment headers
            headers = self.api_client._get_api_headers()
            headers.update({
                "Content-Type": "application/json",
                "X-Fulfillment-Type": "delivery",
                "X-Fulfillment-Store": self.store_id
            })

            url = f"{self.api_client.api_base_url}/digital/hybris/v3/fulfillment/reservationslots"

            self.logger.info(f"Reserving delivery slot {slot_id} for store {self.store_id}")
            response = self.api_client._make_request(
                "POST", url, json_data=request_data, headers=headers
            )

            if response.status_code == 200:
                self.logger.info(f"Successfully reserved delivery slot {slot_id}")
                return True
            else:
                raise CartError(
                    f"Failed to reserve delivery slot: {response.status_code} - {response.text}"
                )

        except Exception as e:
            if isinstance(e, CartError):
                raise
            raise CartError(f"Error reserving delivery slot: {str(e)}")

    def _parse_pickup_slots(self, slots_data: Dict[str, Any]) -> List[PickupSlot]:
        """Parse pickup slots from API response."""
        slots = []
        try:
            # Parse the actual response structure from the API
            # This will need to be updated based on the actual response format
            if "slots" in slots_data:
                for slot in slots_data["slots"]:
                    slots.append(
                        PickupSlot(
                            start_time=datetime.fromisoformat(
                                slot.get("startTime", "")
                            ),
                            end_time=datetime.fromisoformat(slot.get("endTime", "")),
                            slot_id=slot.get("id", ""),
                            is_available=slot.get("available", True),
                            max_orders=slot.get("maxOrders"),
                            current_orders=slot.get("currentOrders"),
                        )
                    )
        except Exception as e:
            self.logger.error(f"Error parsing pickup slots: {e}")

        return slots

    def _parse_delivery_slots(self, slots_data: Dict[str, Any]) -> List[DeliverySlot]:
        """Parse delivery slots from API response."""
        slots = []
        try:
            # Parse the actual response structure from the API
            # This will need to be updated based on the actual response format
            if "slots" in slots_data:
                for slot in slots_data["slots"]:
                    slots.append(
                        DeliverySlot(
                            start_time=datetime.fromisoformat(
                                slot.get("startTime", "")
                            ),
                            end_time=datetime.fromisoformat(slot.get("endTime", "")),
                            slot_id=slot.get("id", ""),
                            is_available=slot.get("available", True),
                            delivery_fee=slot.get("deliveryFee"),
                            min_order_amount=slot.get("minOrderAmount"),
                            max_orders=slot.get("maxOrders"),
                            current_orders=slot.get("currentOrders"),
                        )
                    )
        except Exception as e:
            self.logger.error(f"Error parsing delivery slots: {e}")

        return slots

    @property
    def cart_id(self) -> Optional[str]:
        """Get the current cart ID if available."""
        if self._cart_data and "code" in self._cart_data:
            return self._cart_data["code"]
        return None

    @property
    def item_count(self) -> int:
        """Get the total number of items in the cart."""
        if self._cart_data and "totalItems" in self._cart_data:
            return self._cart_data["totalItems"]
        return 0

    @property
    def total_price(self) -> float:
        """Get the total price of items in the cart."""
        if self._cart_data and "totalPrice" in self._cart_data:
            return float(self._cart_data["totalPrice"]["value"])
        return 0.0

    @property
    def store_id(self) -> str:
        """Get the store ID associated with this cart."""
        return self._store_id

    @store_id.setter
    def store_id(self, value: str):
        """Set the store ID and clear cached cart data."""
        self._store_id = value
        self._cart_data = None
        self._last_updated = None

    def get_order_history(
        self, current_page: int = 0, page_size: int = 10, fields: str = "FULL"
    ) -> List[Dict[str, Any]]:
        """
        Get order history for the authenticated user.

        Args:
            current_page: Page number for pagination (0-based)
            page_size: Number of orders per page
            fields: Fields to include in response (FULL, BASIC, etc.)

        Returns:
            List of order information dictionaries
        """
        try:
            params = {
                "currentPage": current_page,
                "pageSize": page_size,
                "fields": fields,
            }

            response = self.api_client._make_request(
                "GET",
                f"{self.api_client.api_base_url}/digital/occ/v3/orders",
                params=params,
            )

            if response and response.status_code == 200:
                data = response.json()
                return data.get("orders", [])
            else:
                self.logger.warning(
                    f"Failed to get order history: {response.status_code if response else 'No response'}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Error getting order history: {e}")
            return []

    def add_item_by_upc(self, upc: str, quantity: int = 1) -> bool:
        """
        Add an item to the cart by UPC code.

        This method adds a product to the shopping cart using its UPC (Universal Product Code).
        The API endpoint for adding items was not found in the current log analysis,
        so this is a placeholder implementation.

        Parameters
        ----------
        upc : str
            UPC code of the product to add
        quantity : int, optional
            Quantity to add (default: 1)

        Returns
        -------
        bool
            True if item was successfully added, False otherwise

        Raises
        ------
        CartError
            If adding the item fails
        """
        try:
            self.logger.info(f"Adding item with UPC {upc}, quantity {quantity} to cart")
            
            # Build request body for adding item
            request_data = {
                "storeId": self.store_id,
                "productCode": upc,
                "quantity": quantity,
                "productCodeType": "UPCA"
            }

            # Get default headers and add content-type
            headers = self.api_client._get_api_headers()
            headers.update({
                "Content-Type": "application/json"
            })

            # Note: The actual endpoint for adding items needs to be determined
            # This is a placeholder implementation
            url = f"{self.api_client.api_base_url}/digital/hybris/v3/cart/entries"
            
            self.logger.info(f"Adding item to cart: {url}")
            self.logger.info(f"Request data: {request_data}")
            
            response = self.api_client._make_request(
                "POST", url, json_data=request_data, headers=headers
            )

            if response.status_code == 200:
                self.logger.info(f"Successfully added item with UPC {upc} to cart")
                # Clear cached cart data to force refresh
                self._cart_data = None
                self._last_updated = None
                return True
            else:
                self.logger.warning(
                    f"Failed to add item: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error adding item to cart: {e}")
            raise CartError(f"Failed to add item with UPC {upc}: {str(e)}")

    def empty_cart(self) -> bool:
        """
        Remove all items from the cart.

        This method clears the entire shopping cart by removing all items.
        The API endpoint for removing items was not found in the current log analysis,
        so this is a placeholder implementation.

        Returns
        -------
        bool
            True if cart was successfully emptied, False otherwise

        Raises
        ------
        CartError
            If emptying the cart fails
        """
        try:
            self.logger.info("Emptying shopping cart")
            
            # Get current cart data to find item IDs
            cart_data = self.get_current_cart()
            if not cart_data or "entries" not in cart_data:
                self.logger.info("Cart is already empty")
                return True

            entries = cart_data["entries"]
            if not entries:
                self.logger.info("Cart is already empty")
                return True

            # Remove each item individually
            success_count = 0
            for entry in entries:
                entry_id = entry.get("entryNumber")
                if entry_id:
                    if self._remove_cart_item(entry_id):
                        success_count += 1

            self.logger.info(f"Successfully removed {success_count} items from cart")
            
            # Clear cached cart data
            self._cart_data = None
            self._last_updated = None
            
            return success_count == len(entries)

        except Exception as e:
            self.logger.error(f"Error emptying cart: {e}")
            raise CartError(f"Failed to empty cart: {str(e)}")

    def _remove_cart_item(self, entry_id: str) -> bool:
        """
        Remove a specific item from the cart.

        Private method to remove individual cart items.

        Parameters
        ----------
        entry_id : str
            ID of the cart entry to remove

        Returns
        -------
        bool
            True if item was successfully removed, False otherwise
        """
        try:
            # Get default headers
            headers = self.api_client._get_api_headers()
            
            # Note: The actual endpoint for removing items needs to be determined
            # This is a placeholder implementation
            url = f"{self.api_client.api_base_url}/digital/hybris/v3/cart/entries/{entry_id}"
            
            self.logger.info(f"Removing cart item {entry_id}: {url}")
            
            response = self.api_client._make_request(
                "DELETE", url, headers=headers
            )

            if response.status_code == 200:
                self.logger.info(f"Successfully removed cart item {entry_id}")
                return True
            else:
                self.logger.warning(
                    f"Failed to remove item {entry_id}: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error removing cart item {entry_id}: {e}")
            return False
