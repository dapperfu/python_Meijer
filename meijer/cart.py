#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Complete rewrite of MeijerCart system to be highly OOP and Pythonic with extensive property-based functionality
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing, numpy-style docstrings, and extensive use of @property decorators
 * - Dependencies: meijer package, requests, typing, dataclasses
 */

Meijer Shopping Cart Management
==============================

This module provides a comprehensive, highly OOP interface for managing Meijer shopping carts,
including cart retrieval, pickup/delivery slot reservation, and fulfillment management.
Based on actual API analysis from mitmproxy logs with extensive property-based functionality.
"""

import logging
from dataclasses import dataclass, field
from datetime import datetime, time
from typing import Any, Dict, Iterator, List, Optional, Union

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

    @property
    def duration_minutes(self) -> int:
        """Get the duration of the slot in minutes."""
        return int((self.end_time - self.start_time).total_seconds() / 60)

    @property
    def is_peak_time(self) -> bool:
        """Check if this is a peak time slot (lunch/dinner hours)."""
        hour = self.start_time.hour
        return 11 <= hour <= 13 or 17 <= hour <= 19

    @property
    def availability_percentage(self) -> float:
        """Get the availability percentage of this slot."""
        if self.max_orders is None or self.current_orders is None:
            return 100.0
        if self.max_orders == 0:
            return 0.0
        return ((self.max_orders - self.current_orders) / self.max_orders) * 100

    @property
    def is_high_demand(self) -> bool:
        """Check if this slot has high demand (>80% capacity)."""
        return self.availability_percentage < 20.0


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

    @property
    def duration_minutes(self) -> int:
        """Get the duration of the slot in minutes."""
        return int((self.end_time - self.start_time).total_seconds() / 60)

    @property
    def is_free_delivery(self) -> bool:
        """Check if delivery is free (no delivery fee)."""
        return self.delivery_fee is None or self.delivery_fee == 0.0

    @property
    def meets_min_order(self, current_total: float = 0.0) -> bool:
        """Check if the current order meets the minimum order requirement."""
        if self.min_order_amount is None:
            return True
        return current_total >= self.min_order_amount

    @property
    def availability_percentage(self) -> float:
        """Get the availability percentage of this slot."""
        if self.max_orders is None or self.current_orders is None:
            return 100.0
        if self.max_orders == 0:
            return 0.0
        return ((self.max_orders - self.current_orders) / self.max_orders) * 100


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

    @property
    def is_pickup(self) -> bool:
        """Check if this is a pickup request."""
        return self.fulfillment_type.lower() == "pickup"

    @property
    def is_delivery(self) -> bool:
        """Check if this is a delivery request."""
        return self.fulfillment_type.lower() == "delivery"

    @property
    def has_preferred_time(self) -> bool:
        """Check if a preferred time is specified."""
        return self.preferred_time is not None

    @property
    def is_curbside(self) -> bool:
        """Check if this is a curbside pickup request."""
        return self.is_pickup and self.curbside_partner is not None


@dataclass
class CartItem:
    """
    Represents an item in the shopping cart.

    This class provides extensive property-based functionality for managing
    cart items in a Pythonic, OOP manner.
    """

    entry_number: str
    """Unique identifier for the cart entry"""

    product_code: str
    """Product identifier (UPC, SKU, etc.)"""

    product_name: str
    """Product name/description"""

    quantity: int
    """Quantity of the item"""

    base_price: float
    """Base price per unit"""

    total_price: float
    """Total price for this quantity"""

    # Optional fields
    image_url: Optional[str] = None
    """URL to product image"""

    brand: Optional[str] = None
    """Product brand"""

    category: Optional[str] = None
    """Product category"""

    weighted: bool = False
    """Whether this is a weighted item (produce, meat, etc.)"""

    weight_unit: Optional[str] = None
    """Unit of weight measurement"""

    weight_amount: Optional[float] = None
    """Weight amount if applicable"""

    alcohol: bool = False
    """Whether this item contains alcohol"""

    tobacco: bool = False
    """Whether this item contains tobacco"""

    age_restricted: bool = False
    """Whether this item has age restrictions"""

    available: bool = True
    """Whether the item is currently available"""

    substitutable: bool = True
    """Whether the item can be substituted if unavailable"""

    # Internal API reference for operations
    _cart_api: Optional[Any] = field(default=None, repr=False, compare=False)

    # Cached data
    _product_details: Optional[Dict[str, Any]] = field(
        default=None, repr=False, compare=False
    )

    # ============================================================================
    # Core Properties
    # ============================================================================

    @property
    def quantity(self) -> int:
        """Get the current quantity."""
        return self._quantity if hasattr(self, '_quantity') else 1

    @quantity.setter
    def quantity(self, value: int) -> None:
        """Set the quantity for the item.
        
        When a cart API reference is attached, this will invoke the remote API to
        update the quantity and update the local state on success.
        If no API is attached, only the local state is updated.
        
        Parameters
        ----------
        value : int
            Desired quantity (must be positive and within limits)
        """
        if value < 1:
            raise ValueError("Quantity must be at least 1")
        if value > 99:
            raise ValueError("Quantity cannot exceed 99")
            
        # No-op if already desired state
        current_qty = self._quantity if hasattr(self, '_quantity') else 1
        if current_qty == value:
            return
            
        if self._cart_api is not None:
            try:
                # Update the item quantity via API
                success = self._cart_api.update_item_quantity(self.entry_number, value)
                if success:
                    self._quantity = value
                    # Update total price
                    self.total_price = self.base_price * value
                else:
                    raise RuntimeError(
                        f"Failed to set quantity to {value} for item {self.entry_number} via API"
                    )
            except Exception:  # pragma: no cover - passthrough for caller
                raise
        else:
            # Fallback: update local state only
            self._quantity = value
            self.total_price = self.base_price * value

    @property
    def unit_price(self) -> float:
        """Get the price per unit."""
        return self.base_price

    @property
    def total_value(self) -> float:
        """Get the total value (price × quantity)."""
        return self.base_price * self.quantity

    @property
    def on_sale(self) -> bool:
        """Check if the item is on sale (base price < regular price)."""
        # This would need to be implemented based on actual API data
        return False

    @property
    def sale_savings(self) -> float:
        """Get the amount saved if the item is on sale."""
        if not self.on_sale:
            return 0.0
        # This would need to be implemented based on actual API data
        return 0.0

    @property
    def heavy(self) -> bool:
        """Check if this is a heavy item (weight > 10 lbs)."""
        if not self.weight_amount or not self.weight_unit:
            return False
        if self.weight_unit.lower() in ['lb', 'lbs', 'pound', 'pounds']:
            return self.weight_amount > 10.0
        elif self.weight_unit.lower() in ['kg', 'kilogram']:
            return self.weight_amount > 4.5
        return False

    @property
    def fragile(self) -> bool:
        """Check if this item is fragile based on category."""
        fragile_categories = ['eggs', 'glass', 'electronics', 'breakable']
        if not self.category:
            return False
        return any(fragile in self.category.lower() for fragile in fragile_categories)

    @property
    def requires_special_handling(self) -> bool:
        """Check if this item requires special handling."""
        return (self.alcohol or self.tobacco or self.age_restricted or 
                self.fragile or self.heavy)

    @property
    def can_increase_quantity(self) -> bool:
        """Check if the quantity can be increased."""
        return self.available and self.quantity < 99  # Reasonable upper limit

    @property
    def can_decrease_quantity(self) -> bool:
        """Check if the quantity can be decreased."""
        return self.quantity > 1

    @property
    def can_remove(self) -> bool:
        """Check if the item can be removed from cart."""
        return True  # All items can be removed

    @property
    def display_name(self) -> str:
        """Get a display-friendly name for the item."""
        if self.brand and self.brand not in self.product_name:
            return f"{self.brand} {self.product_name}"
        return self.product_name

    @property
    def price_display(self) -> str:
        """Get a formatted price display string."""
        if self.quantity == 1:
            return f"${self.base_price:.2f}"
        else:
            return f"${self.base_price:.2f} × {self.quantity} = ${self.total_value:.2f}"

    @property
    def weight_display(self) -> Optional[str]:
        """Get a formatted weight display string."""
        if not self.weight_amount or not self.weight_unit:
            return None
        return f"{self.weight_amount:.2f} {self.weight_unit}"

    @property
    def status_icon(self) -> str:
        """Get a status icon for the item."""
        if not self.available:
            return "❌"
        elif self.alcohol:
            return "🍷"
        elif self.tobacco:
            return "🚬"
        elif self.fragile:
            return "⚠️"
        elif self.heavy:
            return "🏋️"
        else:
            return "✅"

    @property
    def priority_score(self) -> int:
        """Calculate a priority score for sorting/display."""
        score = 0
        
        # Higher priority for restricted items
        if self.requires_special_handling:
            score += 100
            
        # Higher priority for fragile items
        if self.fragile:
            score += 50
            
        # Higher priority for heavy items
        if self.heavy:
            score += 30
            
        # Lower priority for weighted items (can be picked last)
        if self.weighted:
            score -= 20
            
        return score

    # ============================================================================
    # Cart Operations
    # ============================================================================

    def increase_quantity(self, amount: int = 1) -> bool:
        """Increase the quantity by the specified amount."""
        if not self.can_increase_quantity:
            return False
        new_quantity = min(self.quantity + amount, 99)
        try:
            self.quantity = new_quantity
            return True
        except (ValueError, RuntimeError):
            return False

    def decrease_quantity(self, amount: int = 1) -> bool:
        """Decrease the quantity by the specified amount."""
        if not self.can_decrease_quantity:
            return False
        new_quantity = max(self.quantity - amount, 1)
        try:
            self.quantity = new_quantity
            return True
        except (ValueError, RuntimeError):
            return False

    def remove_from_cart(self) -> bool:
        """Remove this item from the cart."""
        if not self.can_remove:
            return False
            
        if self._cart_api is not None:
            try:
                success = self._cart_api.remove_item(self.entry_number)
                return success
            except Exception:
                return False
        return False

    def get_product_details(self) -> Optional[Dict[str, Any]]:
        """Get detailed product information if available."""
        if self._product_details is not None:
            return self._product_details
            
        if self._cart_api is not None:
            try:
                self._product_details = self._cart_api.get_product_details(self.product_code)
                return self._product_details
            except Exception:
                return None
        return None

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        return {
            "entryNumber": self.entry_number,
            "productCode": self.product_code,
            "productName": self.product_name,
            "quantity": self.quantity,
            "basePrice": self.base_price,
            "totalPrice": self.total_price,
            "imageUrl": self.image_url,
            "brand": self.brand,
            "category": self.category,
            "isWeighted": self.weighted,
            "weightUnit": self.weight_unit,
            "weightAmount": self.weight_amount,
            "isAlcohol": self.alcohol,
            "isTobacco": self.tobacco,
            "isAgeRestricted": self.age_restricted,
            "isAvailable": self.available,
            "isSubstitutable": self.substitutable,
        }

    # ============================================================================
    # Jupyter Notebook Rich Representations
    # ============================================================================

    def _repr_html_(self) -> str:
        """Rich HTML representation for Jupyter notebooks."""
        status_color = {
            "❌": "#ff6b6b",  # Red for unavailable
            "🍷": "#ff9ff3",  # Pink for alcohol
            "🚬": "#feca57",  # Yellow for tobacco
            "⚠️": "#ff9ff3",  # Pink for fragile
            "🏋️": "#54a0ff",  # Blue for heavy
            "✅": "#1dd1a1",  # Green for normal
        }.get(self.status_icon, "#1dd1a1")

        html = f"""
        <div style="
            border: 2px solid {status_color};
            border-radius: 12px;
            padding: 16px;
            margin: 8px 0;
            background: linear-gradient(135deg, #ffffff 0%, #f8f9fa 100%);
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        ">
            <div style="
                display: flex;
                align-items: center;
                justify-content: space-between;
                margin-bottom: 12px;
            ">
                <div style="
                    display: flex;
                    align-items: center;
                    gap: 12px;
                ">
                    <span style="
                        font-size: 24px;
                        filter: drop-shadow(0 2px 4px rgba(0,0,0,0.2));
                    ">{self.status_icon}</span>
                    <h3 style="
                        margin: 0;
                        color: #2c3e50;
                        font-weight: 600;
                        font-size: 18px;
                    ">{self.display_name}</h3>
                </div>
                <div style="
                    text-align: right;
                    font-weight: 600;
                ">
                    <div style="
                        color: #e74c3c;
                        font-size: 20px;
                        margin-bottom: 4px;
                    ">{self.price_display}</div>
                    <div style="
                        color: #7f8c8d;
                        font-size: 14px;
                    ">Qty: {self.quantity}</div>
                </div>
            </div>

            <div style="
                display: grid;
                grid-template-columns: 1fr 1fr;
                gap: 16px;
                margin-bottom: 16px;
            ">
                <div style="
                    background: #ecf0f1;
                    padding: 12px;
                    border-radius: 8px;
                    border-left: 4px solid {status_color};
                ">
                    <div style="
                        font-weight: 600;
                        color: #34495e;
                        margin-bottom: 4px;
                    ">Product Details</div>
                    <div style="color: #7f8c8d; font-size: 14px;">
                        <strong>Code:</strong> {self.product_code}<br>
                        <strong>Brand:</strong> {self.brand or 'N/A'}<br>
                        <strong>Category:</strong> {self.category or 'N/A'}
                    </div>
                </div>

                <div style="
                    background: #ecf0f1;
                    padding: 12px;
                    border-radius: 8px;
                    border-left: 4px solid {status_color};
                ">
                    <div style="
                        font-weight: 600;
                        color: #34495e;
                        margin-bottom: 4px;
                    ">Item Properties</div>
                    <div style="color: #7f8c8d; font-size: 14px;">
                        <strong>Weight:</strong> {self.weight_display or 'N/A'}<br>
                        <strong>Unit Price:</strong> ${self.unit_price:.2f}<br>
                        <strong>Total Value:</strong> ${self.total_value:.2f}
                    </div>
                </div>
            </div>

            <div style="
                display: flex;
                gap: 8px;
                flex-wrap: wrap;
            ">
                {'<span style="background: #ff6b6b; color: white; padding: 4px 8px; border-radius: 6px; font-size: 12px; font-weight: 600;">🚫 Unavailable</span>' if not self.available else ''}
                {'<span style="background: #ff9ff3; color: white; padding: 4px 8px; border-radius: 6px; font-size: 12px; font-weight: 600;">🍷 Alcohol</span>' if self.alcohol else ''}
                {'<span style="background: #feca57; color: white; padding: 4px 8px; border-radius: 6px; font-size: 12px; font-weight: 600;">🚬 Tobacco</span>' if self.tobacco else ''}
                {'<span style="background: #ff9ff3; color: white; padding: 4px 8px; border-radius: 6px; font-size: 12px; font-weight: 600;">⚠️ Fragile</span>' if self.fragile else ''}
                {'<span style="background: #54a0ff; color: white; padding: 4px 8px; border-radius: 6px; font-size: 12px; font-weight: 600;">🏋️ Heavy</span>' if self.heavy else ''}
                {'<span style="background: #1dd1a1; color: white; padding: 4px 8px; border-radius: 6px; font-size: 12px; font-weight: 600;">⚖️ Weighted</span>' if self.weighted else ''}
                {'<span style="background: #5f27cd; color: white; padding: 4px 8px; border-radius: 6px; font-size: 12px; font-weight: 600;">🔞 Age Restricted</span>' if self.age_restricted else ''}
            </div>
        </div>
        """
        return html

    def _repr_markdown_(self) -> str:
        """Rich Markdown representation for Jupyter notebooks."""
        status_emoji = self.status_icon
        status_text = {
            "❌": "Unavailable",
            "🍷": "Alcohol",
            "🚬": "Tobacco",
            "⚠️": "Fragile",
            "🏋️": "Heavy",
            "✅": "Available",
        }.get(self.status_icon, "Available")

        md = f"""
## {status_emoji} {self.display_name}

**Price:** {self.price_display}
**Quantity:** {self.quantity}
**Product Code:** `{self.product_code}`

### Details
- **Brand:** {self.brand or 'N/A'}
- **Category:** {self.category or 'N/A'}
- **Weight:** {self.weight_display or 'N/A'}
- **Unit Price:** ${self.unit_price:.2f}
- **Total Value:** ${self.total_value:.2f}

### Properties
"""

        if self.alcohol:
            md += "- 🍷 **Alcohol**\n"
        if self.tobacco:
            md += "- 🚬 **Tobacco**\n"
        if self.age_restricted:
            md += "- 🔞 **Age Restricted**\n"
        if self.fragile:
            md += "- ⚠️ **Fragile**\n"
        if self.heavy:
            md += "- 🏋️ **Heavy**\n"
        if self.weighted:
            md += "- ⚖️ **Weighted**\n"
        if not self.available:
            md += "- ❌ **Unavailable**\n"
        if self.substitutable:
            md += "- 🔄 **Substitutable**\n"

        md += f"\n**Status:** {status_text} | **Priority Score:** {self.priority_score}"
        return md

    def _repr_pretty_(self, p, cycle):
        """Rich text representation for IPython."""
        if cycle:
            p.text("CartItem(...)")
        else:
            p.text(f"{self.status_icon} {self.display_name}")
            p.breakable()
            p.text(f"  Price: {self.price_display}")
            p.breakable()
            p.text(f"  Qty: {self.quantity} | Code: {self.product_code}")
            if self.brand:
                p.breakable()
                p.text(f"  Brand: {self.brand}")
            if self.category:
                p.breakable()
                p.text(f"  Category: {self.category}")
            if self.weight_display:
                p.breakable()
                p.text(f"  Weight: {self.weight_display}")

            # Show special properties
            special_props = []
            if self.alcohol:
                special_props.append("🍷 Alcohol")
            if self.tobacco:
                special_props.append("🚬 Tobacco")
            if self.age_restricted:
                special_props.append("🔞 Age Restricted")
            if self.fragile:
                special_props.append("⚠️ Fragile")
            if self.heavy:
                special_props.append("🏋️ Heavy")
            if self.weighted:
                special_props.append("⚖️ Weighted")
            if not self.available:
                special_props.append("❌ Unavailable")

            if special_props:
                p.breakable()
                p.text(f"  Special: {', '.join(special_props)}")


class MeijerCart:
    """
    Meijer Shopping Cart Management Class.

    This class provides a comprehensive, highly OOP interface for managing
    shopping carts with extensive property-based functionality and Pythonic design.
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
        self._store_id = store_id
        self.logger = logging.getLogger(__name__)

        # Cart state
        self._cart_data: Optional[Dict[str, Any]] = None
        self._last_updated: Optional[datetime] = None
        self._cart_items: List[CartItem] = []
        self._fulfillment_slots: List[Union[PickupSlot, DeliverySlot]] = []

    # ============================================================================
    # Core Cart Properties
    # ============================================================================

    @property
    def store_id(self) -> str:
        """Get the store ID associated with this cart."""
        return self._store_id

    @store_id.setter
    def store_id(self, value: str) -> None:
        """Set the store ID and clear cached cart data."""
        if value != self._store_id:
            self._store_id = value
            self._clear_cache()
            self.logger.info(f"Store ID changed to {value}")

    @property
    def cart_id(self) -> Optional[str]:
        """Get the current cart ID if available."""
        if self._cart_data and "code" in self._cart_data:
            return self._cart_data["code"]
        return None

    @property
    def is_empty(self) -> bool:
        """Check if the cart is empty."""
        return len(self._cart_items) == 0

    @property
    def has_items(self) -> bool:
        """Check if the cart has items."""
        return not self.is_empty

    @property
    def item_count(self) -> int:
        """Get the total number of items in the cart."""
        return len(self._cart_items)

    @property
    def unique_item_count(self) -> int:
        """Get the number of unique products in the cart."""
        return len(set(item.product_code for item in self._cart_items))

    @property
    def total_quantity(self) -> int:
        """Get the total quantity of all items."""
        return sum(item.quantity for item in self._cart_items)

    @property
    def items(self) -> List[CartItem]:
        """Get the list of cart items."""
        return self._cart_items.copy()  # Return copy to prevent external modification

    @property
    def available_items(self) -> List[CartItem]:
        """Get only available items in the cart."""
        return [item for item in self._cart_items if item.available]

    @property
    def unavailable_items(self) -> List[CartItem]:
        """Get only unavailable items in the cart."""
        return [item for item in self._cart_items if not item.available]

    @property
    def alcohol_items(self) -> List[CartItem]:
        """Get alcohol-containing items in the cart."""
        return [item for item in self._cart_items if item.alcohol]

    @property
    def tobacco_items(self) -> List[CartItem]:
        """Get tobacco-containing items in the cart."""
        return [item for item in self._cart_items if item.tobacco]

    @property
    def age_restricted_items(self) -> List[CartItem]:
        """Get age-restricted items in the cart."""
        return [item for item in self._cart_items if item.age_restricted]

    @property
    def fragile_items(self) -> List[CartItem]:
        """Get fragile items in the cart."""
        return [item for item in self._cart_items if item.fragile]

    @property
    def heavy_items(self) -> List[CartItem]:
        """Get heavy items in the cart."""
        return [item for item in self._cart_items if item.heavy]

    @property
    def weighted_items(self) -> List[CartItem]:
        """Get weighted items in the cart."""
        return [item for item in self._cart_items if item.weighted]

    # ============================================================================
    # Financial Properties
    # ============================================================================

    @property
    def subtotal(self) -> float:
        """Get the subtotal (sum of item prices before taxes and fees)."""
        if self._cart_data and "subTotal" in self._cart_data:
            return float(self._cart_data["subTotal"]["value"])
        elif self._cart_data and "subtotal" in self._cart_data:
            return float(self._cart_data["subtotal"]["value"])
        # Fallback: calculate from items
        return sum(item.total_value for item in self._cart_items)

    @property
    def total_price(self) -> float:
        """Get the total price of items in the cart."""
        if self._cart_data and "totalPrice" in self._cart_data:
            return float(self._cart_data["totalPrice"]["value"])
        # Fallback: calculate from items
        return self.subtotal

    @property
    def tax_amount(self) -> float:
        """Get the total tax amount."""
        if self._cart_data and "totalTax" in self._cart_data:
            return float(self._cart_data["totalTax"]["value"])
        elif self._cart_data and "tax" in self._cart_data:
            return float(self._cart_data["tax"]["value"])
        return 0.0

    @property
    def pickup_fee(self) -> float:
        """Get the pickup fee amount."""
        if self._cart_data and "pickupFee" in self._cart_data:
            return float(self._cart_data["pickupFee"]["value"])
        elif self._cart_data and "pickup_fee" in self._cart_data:
            return float(self._cart_data["pickup_fee"]["value"])
        elif self._cart_data and "fulfillmentFee" in self._cart_data:
            return float(self._cart_data["fulfillmentFee"]["value"])
        return 0.0

    @property
    def delivery_fee(self) -> float:
        """Get the delivery fee amount."""
        if self._cart_data and "deliveryCost" in self._cart_data:
            return float(self._cart_data["deliveryCost"]["value"])
        elif self._cart_data and "deliveryFee" in self._cart_data:
            return float(self._cart_data["deliveryFee"]["value"])
        elif self._cart_data and "delivery_fee" in self._cart_data:
            return float(self._cart_data["delivery_fee"]["value"])
        return 0.0

    @property
    def discount_amount(self) -> float:
        """Get the total discount amount."""
        if self._cart_data and "totalSavings" in self._cart_data:
            return float(self._cart_data["totalSavings"]["value"])
        elif self._cart_data and "totalDiscount" in self._cart_data:
            return float(self._cart_data["totalDiscount"]["value"])
        elif self._cart_data and "discount" in self._cart_data:
            return float(self._cart_data["discount"]["value"])
        return 0.0

    @property
    def final_total(self) -> float:
        """Get the final total including all fees and taxes."""
        return (
            self.subtotal
            + self.tax_amount
            + self.pickup_fee
            + self.delivery_fee
            - self.discount_amount
        )

    @property
    def currency(self) -> str:
        """Get the currency used for pricing."""
        if self._cart_data and "totalPrice" in self._cart_data:
            return self._cart_data["totalPrice"].get("currencyIso", "USD")
        elif self._cart_data and "subTotal" in self._cart_data:
            return self._cart_data["subTotal"].get("currencyIso", "USD")
        return "USD"

    # ============================================================================
    # Cart Status Properties
    # ============================================================================

    @property
    def is_ready_for_checkout(self) -> bool:
        """Check if the cart is ready for checkout."""
        return (
            self.has_items
            and self.subtotal > 0.0
            and all(item.available for item in self._cart_items)
        )

    @property
    def has_restricted_items(self) -> bool:
        """Check if the cart contains age-restricted items."""
        return len(self.age_restricted_items) > 0

    @property
    def has_fragile_items(self) -> bool:
        """Check if the cart contains fragile items."""
        return len(self.fragile_items) > 0

    @property
    def has_heavy_items(self) -> bool:
        """Check if the cart contains heavy items."""
        return len(self.heavy_items) > 0

    @property
    def requires_special_handling(self) -> bool:
        """Check if the cart requires special handling."""
        return (
            self.has_restricted_items or self.has_fragile_items or self.has_heavy_items
        )

    @property
    def estimated_weight(self) -> Optional[float]:
        """Get the estimated total weight of the cart."""
        total_weight = 0.0
        has_weighted = False

        for item in self._cart_items:
            if item.weight_amount and item.weight_unit:
                has_weighted = True
                # Convert to pounds for estimation
                if item.weight_unit.lower() in ["kg", "kilogram"]:
                    total_weight += item.weight_amount * 2.20462 * item.quantity
                elif item.weight_unit.lower() in ["lb", "lbs", "pound", "pounds"]:
                    total_weight += item.weight_amount * item.quantity
                elif item.weight_unit.lower() in ["oz", "ounce"]:
                    total_weight += item.weight_amount * 0.0625 * item.quantity
                elif item.weight_unit.lower() in ["g", "gram"]:
                    total_weight += item.weight_amount * 0.00220462 * item.quantity

        return total_weight if has_weighted else None

    @property
    def last_updated(self) -> Optional[datetime]:
        """Get when the cart was last updated."""
        return self._last_updated

    @property
    def is_stale(self) -> bool:
        """Check if the cart data is stale (older than 5 minutes)."""
        if not self._last_updated:
            return True
        return (datetime.now() - self._last_updated).total_seconds > 300

    # ============================================================================
    # Cart Management Methods
    # ============================================================================

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
        """
        try:
            # Check if we have recent data and don't need to refresh
            if (
                not force_refresh
                and self._cart_data
                and self._last_updated
                and not self.is_stale
            ):
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
                self._parse_cart_items()
                self.logger.info("Cart retrieved successfully")
                return self._cart_data
            else:
                raise CartError(f"Failed to retrieve cart: {response.status_code}")

        except Exception as e:
            if isinstance(e, CartError):
                raise
            raise CartError(f"Error retrieving cart: {str(e)}")

    def add_item_by_upc(self, upc: str, quantity: int = 1) -> bool:
        """
        Add an item to the cart by UPC code.

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
        """
        try:
            self.logger.info(f"Adding item with UPC {upc}, quantity {quantity} to cart")

            # Build request body for adding item
            request_data = {
                "storeId": self.store_id,
                "productCode": upc,
                "quantity": quantity,
                "productCodeType": "UPCA",
            }

            # Get default headers and add content-type
            headers = self.api_client._get_api_headers()
            headers.update({"Content-Type": "application/json"})

            # Note: The actual endpoint for adding items needs to be determined
            url = f"{self.api_client.api_base_url}/digital/hybris/v3/cart/entries"

            self.logger.info(f"Adding item to cart: {url}")
            self.logger.info(f"Request data: {request_data}")

            response = self.api_client._make_request(
                "POST", url, json_data=request_data, headers=headers
            )

            if response.status_code == 200:
                self.logger.info(f"Successfully added item with UPC {upc} to cart")
                # Clear cached cart data to force refresh
                self._clear_cache()
                return True
            else:
                self.logger.warning(
                    f"Failed to add item: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error adding item to cart: {e}")
            raise CartError(f"Failed to add item with UPC {upc}: {str(e)}")

    def remove_item(self, entry_number: str) -> bool:
        """
        Remove a specific item from the cart.

        Parameters
        ----------
        entry_number : str
            Entry number of the item to remove

        Returns
        -------
        bool
            True if item was successfully removed, False otherwise
        """
        try:
            # Get default headers
            headers = self.api_client._get_api_headers()

            # Note: The actual endpoint for removing items needs to be determined
            url = f"{self.api_client.api_base_url}/digital/hybris/v3/cart/entries/{entry_number}"

            self.logger.info(f"Removing cart item {entry_number}: {url}")

            response = self.api_client._make_request("DELETE", url, headers=headers)

            if response.status_code == 200:
                self.logger.info(f"Successfully removed cart item {entry_number}")
                # Remove from local list and clear cache
                self._cart_items = [
                    item
                    for item in self._cart_items
                    if item.entry_number != entry_number
                ]
                self._clear_cache()
                return True
            else:
                self.logger.warning(
                    f"Failed to remove item {entry_number}: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error removing cart item {entry_number}: {e}")
            return False

    def update_item_quantity(self, entry_number: str, quantity: int) -> bool:
        """
        Update the quantity of a specific cart item.

        Parameters
        ----------
        entry_number : str
            Entry number of the item to update
        quantity : int
            New quantity for the item

        Returns
        -------
        bool
            True if quantity was successfully updated, False otherwise
        """
        try:
            if quantity < 1:
                raise ValueError("Quantity must be at least 1")

            # Get default headers
            headers = self.api_client._get_api_headers()
            headers.update({"Content-Type": "application/json"})

            # Note: The actual endpoint for updating items needs to be determined
            url = f"{self.api_client.api_base_url}/digital/hybris/v3/cart/entries/{entry_number}"

            request_data = {"quantity": quantity}

            self.logger.info(
                f"Updating quantity for cart item {entry_number} to {quantity}"
            )

            response = self.api_client._make_request(
                "PUT", url, json_data=request_data, headers=headers
            )

            if response.status_code == 200:
                self.logger.info(
                    f"Successfully updated quantity for cart item {entry_number}"
                )
                # Update local item and clear cache
                for item in self._cart_items:
                    if item.entry_number == entry_number:
                        item._quantity = quantity
                        item.total_price = item.base_price * quantity
                        break
                self._clear_cache()
                return True
            else:
                self.logger.warning(
                    f"Failed to update quantity for item {entry_number}: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(
                f"Error updating quantity for cart item {entry_number}: {e}"
            )
            return False

    def empty_cart(self) -> bool:
        """
        Remove all items from the cart.

        Returns
        -------
        bool
            True if cart was successfully emptied, False otherwise
        """
        try:
            self.logger.info("Emptying shopping cart")

            if self.is_empty:
                self.logger.info("Cart is already empty")
                return True

            # Remove each item individually
            success_count = 0
            for item in self._cart_items:
                if self.remove_item(item.entry_number):
                    success_count += 1

            self.logger.info(f"Successfully removed {success_count} items from cart")
            return success_count == len(self._cart_items)

        except Exception as e:
            self.logger.error(f"Error emptying cart: {e}")
            raise CartError(f"Failed to empty cart: {str(e)}")

    def clear_cache(self) -> None:
        """Clear all cached cart data."""
        self._clear_cache()

    def refresh(self) -> None:
        """Force refresh of cart data."""
        self.get_current_cart(force_refresh=True)

    # ============================================================================
    # Fulfillment Methods
    # ============================================================================

    def get_pickup_slots(
        self,
        date: Optional[datetime] = None,
        delivery_partner: str = "SHIPT",
        curbside_partner: str = "MI9",
    ) -> List[PickupSlot]:
        """
        Get available pickup time slots.

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
        """
        try:
            if date is None:
                date = datetime.now()

            # Build request body based on actual API call from logs
            request_data = {
                "storeId": self.store_id,
                "lineItems": [
                    {
                        "retailerProductId": "0000000000",  # Dummy product ID
                        "retailerProductIdType": "UPCA",
                        "quantity": 1.0,
                        "isAlcohol": False,
                    }
                ],
            }

            headers = self.api_client._get_api_headers()
            headers.update(
                {
                    "Content-Type": "application/json",
                    "X-Fulfillment-Type": "pickup",
                    "X-Fulfillment-Store": self.store_id,
                }
            )

            url = f"{self.api_client.api_base_url}/digital/hybris/v3/fulfillment/reservationslots"

            self.logger.info(f"Retrieving pickup slots for store {self.store_id}")

            response = self.api_client._make_request(
                "POST", url, json_data=request_data, headers=headers
            )

            if response.status_code == 200:
                slots_data = response.json()
                slots = self._parse_pickup_slots(slots_data)
                self._fulfillment_slots = slots  # type: ignore
                return slots
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
        """
        try:
            if date is None:
                date = datetime.now()

            request_data = {
                "storeId": self.store_id,
                "lineItems": [
                    {
                        "retailerProductId": "0000000000",
                        "retailerProductIdType": "UPCA",
                        "quantity": 1.0,
                        "isAlcohol": False,
                    }
                ],
            }

            headers = self.api_client._get_api_headers()
            headers.update(
                {
                    "Content-Type": "application/json",
                    "X-MFC-Store": self.store_id,
                    "DeliveryPartner": delivery_partner,
                    "FulfillmentType": "delivery",
                    "FulfillmentEligibility": "NORMAL",
                }
            )

            url = f"{self.api_client.api_base_url}/digital/hybris/v3/fulfillment/reservationslots"

            self.logger.info(f"Retrieving delivery slots for store {self.store_id}")

            response = self.api_client._make_request(
                "POST", url, json_data=request_data, headers=headers
            )

            if response.status_code == 200:
                slots_data = response.json()
                slots = self._parse_delivery_slots(slots_data)
                self._fulfillment_slots = slots  # type: ignore
                return slots
            else:
                raise CartError(
                    f"Failed to retrieve delivery slots: {response.status_code} - {response.text}"
                )

        except Exception as e:
            if isinstance(e, CartError):
                raise
            raise CartError(f"Error retrieving delivery slots: {str(e)}")

    # ============================================================================
    # Utility Methods
    # ============================================================================

    def _clear_cache(self) -> None:
        """Clear all cached cart data."""
        self._cart_data = None
        self._last_updated = None
        self._cart_items = []

    def _parse_cart_items(self) -> None:
        """Parse cart items from API response."""
        if not self._cart_data or "entries" not in self._cart_data:
            self._cart_items = []
            return

        items = []
        for entry in self._cart_data["entries"]:
            try:
                # Extract base price information
                base_price_info = entry.get("basePrice", {})
                base_price = (
                    float(base_price_info.get("value", 0)) if base_price_info else 0.0
                )

                # Extract total price information
                total_price_info = entry.get("totalPrice", {})
                total_price = (
                    float(total_price_info.get("value", 0))
                    if total_price_info
                    else base_price
                )

                # Create CartItem instance
                item = CartItem(
                    entry_number=str(entry.get("entryNumber", "")),
                    product_code=entry.get("productCode", ""),
                    product_name=entry.get("productName", "Unknown Product"),
                    quantity=int(entry.get("quantity", 1)),
                    base_price=base_price,
                    total_price=total_price,
                    image_url=entry.get("imageUrl"),
                    brand=entry.get("brand"),
                    category=entry.get("category"),
                    weighted=entry.get("isWeighted", False),
                    weight_unit=entry.get("weightUnit"),
                    weight_amount=float(entry.get("weightAmount", 0))
                    if entry.get("weightAmount")
                    else None,
                    alcohol=entry.get("isAlcohol", False),
                    tobacco=entry.get("isTobacco", False),
                    age_restricted=entry.get("isAgeRestricted", False),
                    available=entry.get("isAvailable", True),
                    substitutable=entry.get("isSubstitutable", True),
                    _cart_api=self,
                )
                items.append(item)
            except Exception as e:
                self.logger.warning(f"Failed to parse cart entry: {e}")
                continue

        self._cart_items = items

    def _parse_pickup_slots(self, slots_data: Dict[str, Any]) -> List[PickupSlot]:
        """Parse pickup slots from API response."""
        slots = []
        try:
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

    def get_product_details(self, product_code: str) -> Optional[Dict[str, Any]]:
        """Get detailed product information."""
        # This would need to be implemented based on actual API endpoints
        return None

    # ============================================================================
    # Iterator Support
    # ============================================================================

    def __iter__(self) -> Iterator[CartItem]:
        """Iterate over cart items."""
        return iter(self._cart_items)

    def __len__(self) -> int:
        """Get the number of items in the cart."""
        return len(self._cart_items)

    def __contains__(self, item: Union[CartItem, str]) -> bool:
        """Check if an item is in the cart."""
        if isinstance(item, CartItem):
            return item in self._cart_items
        elif isinstance(item, str):
            return any(cart_item.product_code == item for cart_item in self._cart_items)
        return False

    def __getitem__(self, key: Union[int, str]) -> CartItem:
        """Get cart item by index or entry number."""
        if isinstance(key, int):
            return self._cart_items[key]
        elif isinstance(key, str):
            for item in self._cart_items:
                if item.entry_number == key:
                    return item
            raise KeyError(f"Cart item with entry number '{key}' not found")
        else:
            raise TypeError("Key must be int or str")

    def __str__(self) -> str:
        """String representation of the cart."""
        if self.is_empty:
            return "Empty shopping cart"
        return f"Shopping cart with {self.item_count} items (${self.final_total:.2f})"

    def __repr__(self) -> str:
        """Detailed string representation of the cart."""
        return (
            f"MeijerCart(store_id='{self.store_id}', "
            f"items={self.item_count}, total=${self.final_total:.2f})"
        )

    # ============================================================================
    # Jupyter Notebook Rich Representations
    # ============================================================================

    def _repr_html_(self) -> str:
        """Rich HTML representation for Jupyter notebooks."""
        if self.is_empty:
            html = """
            <div style="
                border: 2px solid #95a5a6;
                border-radius: 12px;
                padding: 24px;
                margin: 16px 0;
                background: linear-gradient(135deg, #ecf0f1 0%, #bdc3c7 100%);
                text-align: center;
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            ">
                <div style="font-size: 48px; margin-bottom: 16px;">🛒</div>
                <h2 style="color: #2c3e50; margin: 0 0 8px 0;">Empty Shopping Cart</h2>
                <p style="color: #7f8c8d; margin: 0; font-size: 16px;">Your cart is currently empty</p>
            </div>
            """
        else:
            # Calculate summary statistics
            total_items = self.total_quantity
            avg_price = self.subtotal / total_items if total_items > 0 else 0
            restricted_count = len(self.age_restricted_items)
            fragile_count = len(self.fragile_items)
            heavy_count = len(self.heavy_items)

            html = f"""
            <div style="
                border: 2px solid #3498db;
                border-radius: 16px;
                padding: 24px;
                margin: 16px 0;
                background: linear-gradient(135deg, #ffffff 0%, #ecf0f1 100%);
                box-shadow: 0 8px 24px rgba(0,0,0,0.15);
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            ">
                <div style="
                    display: flex;
                    align-items: center;
                    justify-content: space-between;
                    margin-bottom: 24px;
                    padding-bottom: 16px;
                    border-bottom: 2px solid #ecf0f1;
                ">
                    <div style="display: flex; align-items: center; gap: 16px;">
                        <span style="font-size: 36px;">🛒</span>
                        <div>
                            <h1 style="margin: 0; color: #2c3e50; font-size: 28px;">Shopping Cart</h1>
                            <p style="margin: 4px 0 0 0; color: #7f8c8d; font-size: 16px;">
                                Store #{self.store_id} • {self.unique_item_count} unique products
                            </p>
                        </div>
                    </div>
                    <div style="text-align: right;">
                        <div style="
                            color: #e74c3c;
                            font-size: 32px;
                            font-weight: 700;
                            margin-bottom: 8px;
                        ">${self.final_total:.2f}</div>
                        <div style="color: #7f8c8d; font-size: 14px;">
                            {self.item_count} items • {total_items} total quantity
                        </div>
                    </div>
                </div>

                <div style="
                    display: grid;
                    grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
                    gap: 16px;
                    margin-bottom: 24px;
                ">
                    <div style="
                        background: linear-gradient(135deg, #3498db 0%, #2980b9 100%);
                        color: white;
                        padding: 20px;
                        border-radius: 12px;
                        text-align: center;
                    ">
                        <div style="font-size: 24px; margin-bottom: 8px;">💰</div>
                        <div style="font-size: 20px; font-weight: 600; margin-bottom: 4px;">Subtotal</div>
                        <div style="font-size: 24px; font-weight: 700;">${self.subtotal:.2f}</div>
                    </div>

                    <div style="
                        background: linear-gradient(135deg, #e74c3c 0%, #c0392b 100%);
                        color: white;
                        padding: 20px;
                        border-radius: 12px;
                        text-align: center;
                    ">
                        <div style="font-size: 24px; margin-bottom: 8px;">🧾</div>
                        <div style="font-size: 20px; font-weight: 600; margin-bottom: 4px;">Tax</div>
                        <div style="font-size: 24px; font-weight: 700;">${self.tax_amount:.2f}</div>
                    </div>

                    <div style="
                        background: linear-gradient(135deg, #f39c12 0%, #e67e22 100%);
                        color: white;
                        padding: 20px;
                        border-radius: 12px;
                        text-align: center;
                    ">
                        <div style="font-size: 24px; margin-bottom: 8px;">🚚</div>
                        <div style="font-size: 20px; font-weight: 600; margin-bottom: 4px;">Fees</div>
                        <div style="font-size: 24px; font-weight: 700;">${self.pickup_fee + self.delivery_fee:.2f}</div>
                    </div>

                    <div style="
                        background: linear-gradient(135deg, #27ae60 0%, #2ecc71 100%);
                        color: white;
                        padding: 20px;
                        border-radius: 12px;
                        text-align: center;
                    ">
                        <div style="font-size: 24px; margin-bottom: 8px;">🎯</div>
                        <div style="font-size: 20px; font-weight: 600; margin-bottom: 4px;">Savings</div>
                        <div style="font-size: 24px; font-weight: 700;">${self.discount_amount:.2f}</div>
                    </div>
                </div>

                <div style="
                    display: grid;
                    grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
                    gap: 16px;
                    margin-bottom: 24px;
                ">
                    <div style="
                        background: #ecf0f1;
                        padding: 20px;
                        border-radius: 12px;
                        border-left: 6px solid #e74c3c;
                    ">
                        <h3 style="margin: 0 0 16px 0; color: #2c3e50; font-size: 18px;">📊 Cart Statistics</h3>
                        <div style="color: #7f8c8d; font-size: 14px; line-height: 1.6;">
                            <div><strong>Average Price:</strong> ${avg_price:.2f}</div>
                            <div><strong>Currency:</strong> {self.currency}</div>
                            <div><strong>Last Updated:</strong> {self.last_updated.strftime('%Y-%m-%d %H:%M') if self.last_updated else 'Never'}</div>
                            <div><strong>Data Fresh:</strong> {'✅ Fresh' if not self.is_stale else '⚠️ Stale'}</div>
                        </div>
                    </div>

                    <div style="
                        background: #ecf0f1;
                        padding: 20px;
                        border-radius: 12px;
                        border-left: 6px solid #f39c12;
                    ">
                        <h3 style="margin: 0 0 16px 0; color: #2c3e50; font-size: 18px;">⚠️ Special Handling</h3>
                        <div style="color: #7f8c8d; font-size: 14px; line-height: 1.6;">
                            <div><strong>Age Restricted:</strong> {restricted_count} items</div>
                            <div><strong>Fragile:</strong> {fragile_count} items</div>
                            <div><strong>Heavy:</strong> {heavy_count} items</div>
                            <div><strong>Special Handling:</strong> {'Yes' if self.requires_special_handling else 'No'}</div>
                        </div>
                    </div>

                    <div style="
                        background: #ecf0f1;
                        padding: 20px;
                        border-radius: 12px;
                        border-left: 6px solid #27ae60;
                    ">
                        <h3 style="margin: 0 0 16px 0; color: #2c3e50; font-size: 18px;">✅ Cart Status</h3>
                        <div style="color: #7f8c8d; font-size: 14px; line-height: 1.6;">
                            <div><strong>Ready for Checkout:</strong> {'✅ Yes' if self.is_ready_for_checkout else '❌ No'}</div>
                            <div><strong>All Items Available:</strong> {'✅ Yes' if all(item.available for item in self._cart_items) else '❌ No'}</div>
                            <div><strong>Estimated Weight:</strong> {f'{self.estimated_weight:.1f} lbs' if self.estimated_weight else 'N/A'}</div>
                            <div><strong>Store ID:</strong> {self.store_id}</div>
                        </div>
                    </div>
                </div>

                <div style="
                    background: #2c3e50;
                    color: white;
                    padding: 16px;
                    border-radius: 12px;
                    text-align: center;
                ">
                    <div style="font-size: 18px; font-weight: 600;">
                        🎉 Cart Summary: {self.item_count} items • ${self.final_total:.2f} total
                    </div>
                </div>
            </div>
            """

        return html

    def _repr_markdown_(self) -> str:
        """Rich Markdown representation for Jupyter notebooks."""
        if self.is_empty:
            return """
## 🛒 Empty Shopping Cart

Your cart is currently empty.

---
*Store #{self.store_id}*
            """

        # Calculate summary statistics
        total_items = self.total_quantity
        avg_price = self.subtotal / total_items if total_items > 0 else 0
        restricted_count = len(self.age_restricted_items)
        fragile_count = len(self.fragile_items)
        heavy_count = len(self.heavy_items)

        md = f"""
## 🛒 Shopping Cart - Store #{self.store_id}

**Total:** ${self.final_total:.2f} • **Items:** {self.item_count} • **Quantity:** {total_items}

### 💰 Financial Summary
- **Subtotal:** ${self.subtotal:.2f}
- **Tax:** ${self.tax_amount:.2f}
- **Fees:** ${self.pickup_fee + self.delivery_fee:.2f}
- **Savings:** ${self.discount_amount:.2f}
- **Final Total:** ${self.final_total:.2f}

### 📊 Cart Statistics
- **Unique Products:** {self.unique_item_count}
- **Average Price:** ${avg_price:.2f}
- **Currency:** {self.currency}
- **Last Updated:** {self.last_updated.strftime('%Y-%m-%d %H:%M') if self.last_updated else 'Never'}

### ⚠️ Special Handling Required
- **Age Restricted Items:** {restricted_count}
- **Fragile Items:** {fragile_count}
- **Heavy Items:** {heavy_count}
- **Requires Special Handling:** {'Yes' if self.requires_special_handling else 'No'}

### ✅ Cart Status
- **Ready for Checkout:** {'Yes' if self.is_ready_for_checkout else 'No'}
- **All Items Available:** {'Yes' if all(item.available for item in self._cart_items) else 'No'}
- **Estimated Weight:** {f'{self.estimated_weight:.1f} lbs' if self.estimated_weight else 'N/A'}
- **Data Fresh:** {'Yes' if not self.is_stale else 'No'}

---
*Cart contains {self.item_count} items with a total value of ${self.final_total:.2f}*
        """

        return md

    def _repr_pretty_(self, p, cycle):
        """Rich text representation for IPython."""
        if cycle:
            p.text("MeijerCart(...)")
        else:
            if self.is_empty:
                p.text("🛒 Empty Shopping Cart")
                p.breakable()
                p.text(f"  Store: #{self.store_id}")
            else:
                p.text(f"🛒 Shopping Cart ({self.item_count} items)")
                p.breakable()
                p.text(f"  Store: #{self.store_id}")
                p.breakable()
                p.text(f"  Total: ${self.final_total:.2f}")
                p.breakable()
                p.text(f"  Subtotal: ${self.subtotal:.2f}")
                p.breakable()
                p.text(f"  Tax: ${self.tax_amount:.2f}")
                p.breakable()
                p.text(f"  Fees: ${self.pickup_fee + self.delivery_fee:.2f}")
                p.breakable()
                p.text(f"  Savings: ${self.discount_amount:.2f}")
                p.breakable()
                p.text(f"  Items: {self.item_count} • Quantity: {self.total_quantity}")
                p.breakable()
                p.text(f"  Unique Products: {self.unique_item_count}")
                p.breakable()
                p.text(
                    f"  Ready for Checkout: {'Yes' if self.is_ready_for_checkout else 'No'}"
                )
                p.breakable()
                p.text(
                    f"  Special Handling: {'Yes' if self.requires_special_handling else 'No'}"
                )
                p.breakable()
                p.text(
                    f"  Last Updated: {self.last_updated.strftime('%Y-%m-%d %H:%M') if self.last_updated else 'Never'}"
                )
