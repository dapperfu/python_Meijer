#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Enhanced cart management with OCC v3 endpoints for better cart operations
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: typing, dataclasses, meijer package
 */

Enhanced Cart Management with OCC v3 Support

This module provides enhanced cart management capabilities using the OCC v3 endpoints
discovered in the API analysis. It extends the existing cart functionality with
modern cart operations and better integration.
"""

from dataclasses import dataclass, field
from typing import Any, Dict, Optional
from datetime import datetime

from .exceptions import CartError
# BaseModel import removed - not used in this module


@dataclass
class CartItem:
    """Enhanced cart item with OCC v3 support."""

    product_code: str
    """Product identifier (UPC, SKU, etc.)"""

    quantity: int
    """Quantity of the item"""

    name: str
    """Product name"""

    price: Optional[float] = None
    """Current price per unit"""

    total_price: Optional[float] = None
    """Total price for this quantity"""

    is_available: bool = True
    """Whether the item is currently available"""

    store_id: Optional[str] = None
    """Store where the item is being purchased"""

    category: Optional[str] = None
    """Product category"""

    image_url: Optional[str] = None
    """Product image URL"""

    unit: str = "each"
    """Unit of measurement (each, lb, oz, etc.)"""

    is_on_sale: bool = False
    """Whether the item is on sale"""

    original_price: Optional[float] = None
    """Original price before sale"""

    discount_amount: Optional[float] = None
    """Amount of discount"""

    substitution_preference: Optional[str] = None
    """User's substitution preference"""

    added_at: datetime = field(default_factory=datetime.now)
    """When the item was added to cart"""

    last_updated: datetime = field(default_factory=datetime.now)
    """When the item was last updated"""


@dataclass
class CartModification:
    """Cart modification details."""

    type: str
    """Type of modification (add, remove, update, etc.)"""

    item_code: str
    """Product code being modified"""

    old_quantity: Optional[int] = None
    """Previous quantity"""

    new_quantity: Optional[int] = None
    """New quantity"""

    reason: Optional[str] = None
    """Reason for modification"""

    timestamp: datetime = field(default_factory=datetime.now)
    """When the modification occurred"""


@dataclass
class CartSummary:
    """Cart summary information."""

    total_items: int
    """Total number of items in cart"""

    total_quantity: int
    """Total quantity of all items"""

    subtotal: float
    """Subtotal before taxes and fees"""

    total_amount: float
    """Total amount including taxes and fees"""

    item_count: int
    """Number of unique items"""

    tax_amount: Optional[float] = None
    """Tax amount"""

    savings_amount: Optional[float] = None
    """Total savings from sales and discounts"""

    store_id: Optional[str] = None
    """Store ID for the cart"""

    last_updated: datetime = field(default_factory=datetime.now)
    """When the cart was last updated"""


class EnhancedCart:
    """
    Enhanced cart management with OCC v3 support.

    This class provides advanced cart operations using the modern OCC v3 endpoints
    discovered in the API analysis. It supports better cart management, modifications
    tracking, and integration with the enhanced Meijer API.
    """

    def __init__(self, client: Any):
        """
        Initialize the enhanced cart manager.

        Parameters
        ----------
        client : Any
            Meijer client instance for making API requests
        """
        self.client = client
        self.base_url = "https://api.meijer.com"

        # OCC v3 endpoints
        self.endpoints = {
            "get_current_cart": "/digital/occ/v3/carts/current",
            "update_cart": "/digital/occ/v3/carts/current",
            "update_substitution_preference": "/digital/occ/v3/carts/current/update-substitution-preference",
            "calculate_cart": "/digital/occ/v3/carts/current/calculate",
        }

    def get_current_cart(
        self,
        store_id: str,
        calculate_for_lc: bool = True,
        fields: str = "FULL",
        fetch_cart_modifications: bool = True,
        retain_out_of_stock: bool = True,
    ) -> Dict[str, Any]:
        """
        Get current cart with full details using OCC v3 endpoint.

        This is the most frequently hit missing endpoint (94 hits) and provides
        comprehensive cart information including modifications and calculations.

        Parameters
        ----------
        store_id : str
            Store identifier where the cart is active
        calculate_for_lc : bool, default=True
            Whether to calculate for loyalty card
        fields : str, default="FULL"
            Fields to include in the response
        fetch_cart_modifications : bool, default=True
            Whether to fetch cart modification history
        retain_out_of_stock : bool, default=True
            Whether to retain out-of-stock items in cart

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
            endpoint = self.endpoints["get_current_cart"]
            params = {
                "store": store_id,
                "calculateForLC": str(calculate_for_lc).lower(),
                "fields": fields,
                "fetchCartModifications": str(fetch_cart_modifications).lower(),
                "retainOutOfStock": str(retain_out_of_stock).lower(),
            }

            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_cart_response(response)

        except Exception as e:
            raise CartError(f"Failed to get current cart: {str(e)}") from e

    def update_substitution_preference(
        self, item_code: str, preference: str, store_id: str
    ) -> Dict[str, Any]:
        """
        Update substitution preference for a cart item.

        Parameters
        ----------
        item_code : str
            Product code to update preference for
        preference : str
            Substitution preference (allow, disallow, suggest)
        store_id : str
            Store identifier

        Returns
        -------
        Dict[str, Any]
            Updated cart information
        """
        try:
            endpoint = self.endpoints["update_substitution_preference"]
            data = {
                "itemCode": item_code,
                "substitutionPreference": preference,
                "store": store_id,
            }

            response = self.client._make_request("POST", endpoint, json=data)
            return response

        except Exception as e:
            raise CartError(
                f"Failed to update substitution preference: {str(e)}"
            ) from e

    def calculate_cart(
        self, store_id: str, include_taxes: bool = True, include_fees: bool = True
    ) -> Dict[str, Any]:
        """
        Calculate cart totals and costs.

        Parameters
        ----------
        store_id : str
            Store identifier
        include_taxes : bool, default=True
            Whether to include tax calculations
        include_fees : bool, default=True
            Whether to include fee calculations

        Returns
        -------
        Dict[str, Any]
            Calculated cart totals and breakdown
        """
        try:
            endpoint = self.endpoints["calculate_cart"]
            params = {
                "store": store_id,
                "includeTaxes": str(include_taxes).lower(),
                "includeFees": str(include_fees).lower(),
            }

            response = self.client._make_request("GET", endpoint, params=params)
            return response

        except Exception as e:
            raise CartError(f"Failed to calculate cart: {str(e)}") from e

    def _parse_cart_response(self, response: Dict[str, Any]) -> Dict[str, Any]:
        """
        Parse the cart response from the API.

        Parameters
        ----------
        response : Dict[str, Any]
            Raw API response

        Returns
        -------
        Dict[str, Any]
            Parsed and structured cart data
        """
        try:
            # Extract cart items
            items = []
            if "entries" in response:
                for entry in response["entries"]:
                    item = CartItem(
                        product_code=entry.get("product", {}).get("code", ""),
                        quantity=entry.get("quantity", 0),
                        name=entry.get("product", {}).get("name", ""),
                        price=entry.get("basePrice", {}).get("value", 0),
                        total_price=entry.get("totalPrice", {}).get("value", 0),
                        is_available=entry.get("available", True),
                        store_id=response.get("store", {}).get("uid", ""),
                        category=entry.get("product", {})
                        .get("categories", [{}])[0]
                        .get("name", ""),
                        image_url=entry.get("product", {})
                        .get("images", [{}])[0]
                        .get("url", ""),
                        unit=entry.get("product", {}).get("unit", "each"),
                        is_on_sale=entry.get("basePrice", {}).get("discount", False),
                        original_price=entry.get("basePrice", {}).get("originalValue"),
                        discount_amount=entry.get("basePrice", {}).get("discountValue"),
                        substitution_preference=entry.get("substitutionPreference"),
                        added_at=datetime.fromisoformat(
                            entry.get("addedTime", datetime.now().isoformat())
                        ),
                        last_updated=datetime.fromisoformat(
                            entry.get("updatedTime", datetime.now().isoformat())
                        ),
                    )
                    items.append(item)

            # Extract cart summary
            summary = CartSummary(
                total_items=len(items),
                total_quantity=sum(item.quantity for item in items),
                subtotal=response.get("subTotal", {}).get("value", 0),
                tax_amount=response.get("totalTax", {}).get("value"),
                total_amount=response.get("totalPrice", {}).get("value", 0),
                savings_amount=response.get("totalDiscounts", {}).get("value"),
                item_count=len(items),
                store_id=response.get("store", {}).get("uid"),
                last_updated=datetime.fromisoformat(
                    response.get("updatedTime", datetime.now().isoformat())
                ),
            )

            # Extract cart modifications
            modifications = []
            if "cartModifications" in response:
                for mod in response["cartModifications"]:
                    modification = CartModification(
                        type=mod.get("type", ""),
                        item_code=mod.get("itemCode", ""),
                        old_quantity=mod.get("oldQuantity"),
                        new_quantity=mod.get("newQuantity"),
                        reason=mod.get("reason", ""),
                        timestamp=datetime.fromisoformat(
                            mod.get("timestamp", datetime.now().isoformat())
                        ),
                    )
                    modifications.append(modification)

            return {
                "items": [self._item_to_dict(item) for item in items],
                "summary": self._summary_to_dict(summary),
                "modifications": [
                    self._modification_to_dict(mod) for mod in modifications
                ],
                "store": response.get("store", {}),
                "raw_response": response,
            }

        except Exception as e:
            raise CartError(f"Failed to parse cart response: {str(e)}") from e

    def _item_to_dict(self, item: CartItem) -> Dict[str, Any]:
        """Convert CartItem to dictionary."""
        return {
            "product_code": item.product_code,
            "quantity": item.quantity,
            "name": item.name,
            "price": item.price,
            "total_price": item.total_price,
            "is_available": item.is_available,
            "store_id": item.store_id,
            "category": item.category,
            "image_url": item.image_url,
            "unit": item.unit,
            "is_on_sale": item.is_on_sale,
            "original_price": item.original_price,
            "discount_amount": item.discount_amount,
            "substitution_preference": item.substitution_preference,
            "added_at": item.added_at.isoformat(),
            "last_updated": item.last_updated.isoformat(),
        }

    def _summary_to_dict(self, summary: CartSummary) -> Dict[str, Any]:
        """Convert CartSummary to dictionary."""
        return {
            "total_items": summary.total_items,
            "total_quantity": summary.total_quantity,
            "subtotal": summary.subtotal,
            "tax_amount": summary.tax_amount,
            "total_amount": summary.total_amount,
            "savings_amount": summary.savings_amount,
            "item_count": summary.item_count,
            "store_id": summary.store_id,
            "last_updated": summary.last_updated.isoformat(),
        }

    def _modification_to_dict(self, modification: CartModification) -> Dict[str, Any]:
        """Convert CartModification to dictionary."""
        return {
            "type": modification.type,
            "item_code": modification.item_code,
            "old_quantity": modification.old_quantity,
            "new_quantity": modification.new_quantity,
            "reason": modification.reason,
            "timestamp": modification.timestamp.isoformat(),
        }
