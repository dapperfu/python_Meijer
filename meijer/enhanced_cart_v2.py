#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Enhanced cart functionality based on mitmproxy log analysis showing cart endpoints
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * Code style: Python with full mypy typing, numpy-style docstrings
 * Dependencies: meijer package, requests, typing, dataclasses
 */

Enhanced Cart Functionality for Meijer API
=========================================

This module provides enhanced cart functionality based on actual API endpoints
discovered in mitmproxy logs, including proper cart operations and item management.
"""

import logging
from dataclasses import dataclass, field
from datetime import datetime
from typing import Any, Dict, List, Optional

from .exceptions import CartError
from .models import MeijerItem


@dataclass
class CartOperationResult:
    """Result of a cart operation."""

    success: bool
    operation: str
    timestamp: datetime = field(default_factory=datetime.now)
    message: str = ""
    error_details: Optional[str] = None
    cart_id: Optional[str] = None
    item_count: int = 0

    @property
    def is_success(self) -> bool:
        """Check if the operation was successful."""
        return self.success

    @property
    def has_error(self) -> bool:
        """Check if the operation had an error."""
        return not self.success and self.error_details is not None


class EnhancedCartV2:
    """
    Enhanced cart functionality based on mitmproxy log analysis.

    This class provides comprehensive cart management including:
    - Cart retrieval and status
    - Item addition and removal
    - Cart calculations and modifications
    - Fulfillment slot management
    """

    def __init__(self, api_client: Any, store_id: str = "217"):
        """
        Initialize the enhanced cart instance.

        Parameters
        ----------
        api_client : Any
            Meijer API client instance for making authenticated requests
        store_id : str, optional
            Store ID for cart operations (default: "217")
        """
        self.api_client = api_client
        self.store_id = store_id
        self.logger = logging.getLogger(__name__)

        # Base URL from mitmproxy log analysis
        self.meijer_api_base = "https://api.meijer.com"

        # Cart endpoints discovered in logs
        self.endpoints = {
            # Current cart operations
            "get_current_cart": "/digital/occ/v3/carts/current",
            "add_item": "/digital/occ/v3/carts/current/entries",
            "update_item": "/digital/occ/v3/carts/current/entries/{entry_id}",
            "remove_item": "/digital/occ/v3/carts/current/entries/{entry_id}",
            # Cart calculations and modifications
            "calculate_cart": "/digital/occ/v3/carts/current/calculate",
            "validate_cart": "/digital/occ/v3/carts/current/validate",
            # Fulfillment slots
            "fulfillment_slots": "/digital/hybris/v3/fulfillment/reservationslots",
            # Cart modifications tracking
            "cart_modifications": "/digital/occ/v3/carts/current/modifications",
        }

        # Cart state
        self._cart_data: Optional[Dict[str, Any]] = None
        self._last_updated: Optional[datetime] = None
        self._cart_items: List[MeijerItem] = []

    def get_current_cart(
        self,
        force_refresh: bool = False,
        calculate_for_lc: bool = True,
        fields: str = "FULL",
        fetch_cart_modifications: bool = True,
        retain_out_of_stock: bool = True,
    ) -> Dict[str, Any]:
        """
        Get the current cart with full details.

        This method implements the exact endpoint pattern found in mitmproxy logs:
        GET /digital/occ/v3/carts/current with store and calculation parameters.

        Parameters
        ----------
        force_refresh : bool, optional
            Force refresh of cart data (default: False)
        calculate_for_lc : bool, optional
            Calculate for loyalty card (default: True)
        fields : str, optional
            Fields to include in response (default: "FULL")
        fetch_cart_modifications : bool, optional
            Fetch cart modification history (default: True)
        retain_out_of_stock : bool, optional
            Retain out-of-stock items (default: True)

        Returns
        -------
        Dict[str, Any]
            Complete cart information including items, totals, and modifications

        Raises
        ------
        CartError
            If there's an error retrieving the cart
        """
        try:
            # Check if we need to refresh
            if (
                not force_refresh
                and self._cart_data
                and self._last_updated
                and (datetime.now() - self._last_updated).total_seconds() < 300
            ):  # 5 minutes
                self.logger.debug("Returning cached cart data")
                return self._cart_data

            self.logger.info("Retrieving current cart from API")

            endpoint = self.endpoints["get_current_cart"]
            url = f"{self.meijer_api_base}{endpoint}"

            # Parameters based on log analysis
            params = {
                "store": self.store_id,
                "calculateForLC": str(calculate_for_lc).lower(),
                "fields": fields,
                "fetchCartModifications": str(fetch_cart_modifications).lower(),
                "retainOutOfStock": str(retain_out_of_stock).lower(),
            }

            # Headers with authentication
            headers = self._get_cart_headers()

            response = self.api_client._make_request(
                "GET", url, params=params, headers=headers
            )

            if response and response.status_code == 200:
                data = response.json()

                # Update cart state
                self._cart_data = data
                self._last_updated = datetime.now()
                self._parse_cart_items(data)

                self.logger.info(
                    f"Successfully retrieved cart with {len(self._cart_items)} items"
                )
                return data
            else:
                status_code = response.status_code if response else "No response"
                error_msg = f"Failed to get current cart: HTTP {status_code}"
                if response and response.text:
                    error_msg += f" - {response.text}"

                raise CartError(error_msg)

        except Exception as e:
            if isinstance(e, CartError):
                raise
            raise CartError(f"Error retrieving cart: {str(e)}")

    def add_item_by_upc(self, upc: str, quantity: int = 1) -> CartOperationResult:
        """
        Add an item to the cart by UPC code.

        This method implements the exact endpoint pattern found in mitmproxy logs:
        POST to /digital/occ/v3/carts/current/entries with product data.

        Parameters
        ----------
        upc : str
            UPC code of the product to add
        quantity : int, optional
            Quantity to add (default: 1)

        Returns
        -------
        CartOperationResult
            Result of the add operation
        """
        try:
            self.logger.info(f"Adding item with UPC {upc}, quantity {quantity} to cart")

            endpoint = self.endpoints["add_item"]
            url = f"{self.meijer_api_base}{endpoint}"

            # Request body based on log analysis
            request_data = {
                "storeId": self.store_id,
                "productCode": upc,
                "quantity": quantity,
                "productCodeType": "UPCA",
            }

            # Headers with authentication
            headers = self._get_cart_headers()
            headers.update({"Content-Type": "application/json"})

            response = self.api_client._make_request(
                "POST", url, json_data=request_data, headers=headers
            )

            if response and response.status_code in [200, 201]:
                # Clear cached cart data to force refresh
                self._clear_cache()

                self.logger.info(f"Successfully added item with UPC {upc} to cart")

                return CartOperationResult(
                    success=True,
                    operation="add_item",
                    message=f"Successfully added {quantity}x item with UPC {upc}",
                    cart_id=self._get_cart_id(),
                    item_count=self._get_item_count(),
                )
            else:
                status_code = response.status_code if response else "No response"
                error_msg = f"Failed to add item: HTTP {status_code}"
                if response and response.text:
                    error_msg += f" - {response.text}"

                self.logger.error(error_msg)

                return CartOperationResult(
                    success=False,
                    operation="add_item",
                    message=f"Failed to add item with UPC {upc}",
                    error_details=error_msg,
                    cart_id=self._get_cart_id(),
                    item_count=self._get_item_count(),
                )

        except Exception as e:
            self.logger.error(f"Error adding item to cart: {e}")

            return CartOperationResult(
                success=False,
                operation="add_item",
                message=f"Error adding item with UPC {upc}",
                error_details=str(e),
                cart_id=self._get_cart_id(),
                item_count=self._get_item_count(),
            )

    def remove_item(self, entry_id: str) -> CartOperationResult:
        """
        Remove an item from the cart by entry ID.

        Parameters
        ----------
        entry_id : str
            Entry ID of the item to remove

        Returns
        -------
        CartOperationResult
            Result of the remove operation
        """
        try:
            self.logger.info(f"Removing item with entry ID {entry_id} from cart")

            endpoint = self.endpoints["remove_item"].format(entry_id=entry_id)
            url = f"{self.meijer_api_base}{endpoint}"

            # Headers with authentication
            headers = self._get_cart_headers()

            response = self.api_client._make_request("DELETE", url, headers=headers)

            if response and response.status_code in [200, 204]:
                # Clear cached cart data to force refresh
                self._clear_cache()

                self.logger.info(f"Successfully removed item with entry ID {entry_id}")

                return CartOperationResult(
                    success=True,
                    operation="remove_item",
                    message=f"Successfully removed item with entry ID {entry_id}",
                    cart_id=self._get_cart_id(),
                    item_count=self._get_item_count(),
                )
            else:
                status_code = response.status_code if response else "No response"
                error_msg = f"Failed to remove item: HTTP {status_code}"
                if response and response.text:
                    error_msg += f" - {response.text}"

                self.logger.error(error_msg)

                return CartOperationResult(
                    success=False,
                    operation="remove_item",
                    message=f"Failed to remove item with entry ID {entry_id}",
                    error_details=error_msg,
                    cart_id=self._get_cart_id(),
                    item_count=self._get_item_count(),
                )

        except Exception as e:
            self.logger.error(f"Error removing item from cart: {e}")

            return CartOperationResult(
                success=False,
                operation="remove_item",
                message=f"Error removing item with entry ID {entry_id}",
                error_details=str(e),
                cart_id=self._get_cart_id(),
                item_count=self._get_item_count(),
            )

    def update_item_quantity(self, entry_id: str, quantity: int) -> CartOperationResult:
        """
        Update the quantity of an item in the cart.

        Parameters
        ----------
        entry_id : str
            Entry ID of the item to update
        quantity : int
            New quantity for the item

        Returns
        -------
        CartOperationResult
            Result of the update operation
        """
        try:
            if quantity <= 0:
                # If quantity is 0 or negative, remove the item
                return self.remove_item(entry_id)

            self.logger.info(
                f"Updating item with entry ID {entry_id} to quantity {quantity}"
            )

            endpoint = self.endpoints["update_item"].format(entry_id=entry_id)
            url = f"{self.meijer_api_base}{endpoint}"

            # Request body for update
            request_data = {
                "quantity": quantity,
            }

            # Headers with authentication
            headers = self._get_cart_headers()
            headers.update({"Content-Type": "application/json"})

            response = self.api_client._make_request(
                "PATCH", url, json_data=request_data, headers=headers
            )

            if response and response.status_code in [200, 201]:
                # Clear cached cart data to force refresh
                self._clear_cache()

                self.logger.info(
                    f"Successfully updated item with entry ID {entry_id} to quantity {quantity}"
                )

                return CartOperationResult(
                    success=True,
                    operation="update_item",
                    message=f"Successfully updated item to quantity {quantity}",
                    cart_id=self._get_cart_id(),
                    item_count=self._get_item_count(),
                )
            else:
                status_code = response.status_code if response else "No response"
                error_msg = f"Failed to update item: HTTP {status_code}"
                if response and response.text:
                    error_msg += f" - {response.text}"

                self.logger.error(error_msg)

                return CartOperationResult(
                    success=False,
                    operation="update_item",
                    message=f"Failed to update item with entry ID {entry_id}",
                    error_details=error_msg,
                    cart_id=self._get_cart_id(),
                    item_count=self._get_item_count(),
                )

        except Exception as e:
            self.logger.error(f"Error updating item in cart: {e}")

            return CartOperationResult(
                success=False,
                operation="update_item",
                message=f"Error updating item with entry ID {entry_id}",
                error_details=str(e),
                cart_id=self._get_cart_id(),
                item_count=self._get_item_count(),
            )

    def calculate_cart(self) -> Dict[str, Any]:
        """
        Calculate cart totals and apply any available discounts.

        Returns
        -------
        Dict[str, Any]
            Calculation results including totals, discounts, and taxes
        """
        try:
            self.logger.info("Calculating cart totals")

            endpoint = self.endpoints["calculate_cart"]
            url = f"{self.meijer_api_base}{endpoint}"

            # Parameters for calculation
            params = {
                "store": self.store_id,
                "calculateForLC": "true",
            }

            # Headers with authentication
            headers = self._get_cart_headers()

            response = self.api_client._make_request(
                "POST", url, params=params, headers=headers
            )

            if response and response.status_code == 200:
                data = response.json()
                self.logger.info("Successfully calculated cart totals")
                return data
            else:
                status_code = response.status_code if response else "No response"
                error_msg = f"Failed to calculate cart: HTTP {status_code}"
                if response and response.text:
                    error_msg += f" - {response.text}"

                raise CartError(error_msg)

        except Exception as e:
            if isinstance(e, CartError):
                raise
            raise CartError(f"Error calculating cart: {str(e)}")

    def get_fulfillment_slots(
        self, fulfillment_type: str = "pickup", date: Optional[str] = None
    ) -> List[Dict[str, Any]]:
        """
        Get available fulfillment slots for pickup or delivery.

        Parameters
        ----------
        fulfillment_type : str, optional
            Type of fulfillment: "pickup" or "delivery" (default: "pickup")
        date : str, optional
            Date to get slots for (YYYY-MM-DD format, default: today)

        Returns
        -------
        List[Dict[str, Any]]
            List of available fulfillment slots
        """
        try:
            self.logger.info(f"Getting {fulfillment_type} fulfillment slots")

            endpoint = self.endpoints["fulfillment_slots"]
            url = f"{self.meijer_api_base}{endpoint}"

            # Request body based on log analysis
            request_data = {
                "storeId": self.store_id,
                "fulfillmentType": fulfillment_type.upper(),
            }

            if date:
                request_data["date"] = date

            # Headers with authentication
            headers = self._get_cart_headers()
            headers.update({"Content-Type": "application/json"})

            response = self.api_client._make_request(
                "POST", url, json_data=request_data, headers=headers
            )

            if response and response.status_code == 200:
                data = response.json()

                if "slots" in data:
                    slots = data["slots"]
                    self.logger.info(
                        f"Found {len(slots)} available {fulfillment_type} slots"
                    )
                    return slots
                else:
                    self.logger.warning("No slots found in fulfillment response")
                    return []
            else:
                status_code = response.status_code if response else "No response"
                self.logger.error(
                    f"Failed to get fulfillment slots: HTTP {status_code}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Error getting fulfillment slots: {e}")
            return []

    def clear_cart(self) -> CartOperationResult:
        """
        Clear all items from the cart.

        Returns
        -------
        CartOperationResult
            Result of the clear operation
        """
        try:
            self.logger.info("Clearing all items from cart")

            # Get current cart items
            cart_data = self.get_current_cart()
            if not cart_data or "entries" not in cart_data:
                return CartOperationResult(
                    success=True,
                    operation="clear_cart",
                    message="Cart is already empty",
                    cart_id=self._get_cart_id(),
                    item_count=0,
                )

            entries = cart_data["entries"]
            removed_count = 0

            # Remove each item individually
            for entry in entries:
                entry_id = entry.get("entryNumber")
                if entry_id:
                    result = self.remove_item(entry_id)
                    if result.success:
                        removed_count += 1

            if removed_count > 0:
                self.logger.info(
                    f"Successfully removed {removed_count} items from cart"
                )

                return CartOperationResult(
                    success=True,
                    operation="clear_cart",
                    message=f"Successfully removed {removed_count} items from cart",
                    cart_id=self._get_cart_id(),
                    item_count=0,
                )
            else:
                return CartOperationResult(
                    success=False,
                    operation="clear_cart",
                    message="No items were removed from cart",
                    cart_id=self._get_cart_id(),
                    item_count=self._get_item_count(),
                )

        except Exception as e:
            self.logger.error(f"Error clearing cart: {e}")

            return CartOperationResult(
                success=False,
                operation="clear_cart",
                message="Error clearing cart",
                error_details=str(e),
                cart_id=self._get_cart_id(),
                item_count=self._get_item_count(),
            )

    def _get_cart_headers(self) -> Dict[str, str]:
        """Get headers for cart API requests."""
        headers = {
            "Accept": "application/json",
            "OCP-APIM-Subscription-Key": "a10bc58ac484478d9b3958b1742c3a03",
        }

        # Add authentication if available
        if hasattr(self.api_client, "_get_api_headers"):
            auth_headers = self.api_client._get_api_headers()
            headers.update(auth_headers)

        return headers

    def _parse_cart_items(self, cart_data: Dict[str, Any]) -> None:
        """Parse cart items from cart data."""
        self._cart_items = []

        if "entries" in cart_data:
            for entry in cart_data["entries"]:
                try:
                    item = MeijerItem(entry, title=entry.get("name", "Unknown Product"))
                    self._cart_items.append(item)
                except Exception as e:
                    self.logger.warning(f"Failed to parse cart item: {e}")

    def _get_cart_id(self) -> Optional[str]:
        """Get the current cart ID."""
        if self._cart_data and "code" in self._cart_data:
            return self._cart_data["code"]
        return None

    def _get_item_count(self) -> int:
        """Get the current item count."""
        return len(self._cart_items)

    def _clear_cache(self) -> None:
        """Clear cached cart data."""
        self._cart_data = None
        self._last_updated = None
        self._cart_items = []

    # Properties for easy access
    @property
    def cart_id(self) -> Optional[str]:
        """Get the current cart ID."""
        return self._get_cart_id()

    @property
    def item_count(self) -> int:
        """Get the number of items in the cart."""
        return self._get_item_count()

    @property
    def empty(self) -> bool:
        """Check if the cart is empty."""
        return self.item_count == 0

    @property
    def items(self) -> List[MeijerItem]:
        """Get the list of cart items."""
        return self._cart_items.copy()

    @property
    def last_updated(self) -> Optional[datetime]:
        """Get when the cart was last updated."""
        return self._last_updated
