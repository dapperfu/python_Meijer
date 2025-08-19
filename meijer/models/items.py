"""
Item models for Meijer API responses.

This module contains dataclasses for products and shopping list items.
"""

from dataclasses import dataclass, field
from datetime import date
from typing import Any, Dict, List, Optional, Union

try:
    import io

    import requests
    from PIL import Image
except ImportError:
    # Optional dependencies for image handling
    io = None
    requests = None
    Image = None

from .base import ItemType


@dataclass
class MeijerItem:
    """
    Represents a product/item from Meijer's system.

    Based on the ProductFullDetails class from the decompiled APK.
    Enhanced to support Constructor.io search API responses.
    """

    id: str
    """Unique product identifier"""

    title: str
    """Product title/name"""

    description: Optional[str] = None
    """Product description"""

    brand: Optional[str] = None
    """Product brand name"""

    category: Optional[str] = None
    """Product category"""

    subcategory: Optional[str] = None
    """Product subcategory"""

    upc: Optional[str] = None
    """Universal Product Code"""

    sku: Optional[str] = None
    """Stock Keeping Unit"""

    image_url: Optional[str] = None
    """URL to product image"""

    large_image_url: Optional[str] = None
    """URL to large product image"""

    price: Optional[float] = None
    """Current product price"""

    sale_price: Optional[float] = None
    """Sale price if on sale"""

    unit_price: Optional[str] = None
    """Price per unit (e.g., per ounce)"""

    is_weighted: bool = False
    """Whether product is sold by weight"""

    weight_unit: Optional[str] = None
    """Unit of weight measurement"""

    weight_amount: Optional[float] = None
    """Weight amount"""

    is_available: bool = True
    """Whether product is currently available"""

    store_id: Optional[str] = None
    """Store ID where product is located"""

    department_id: Optional[str] = None
    """Department ID"""

    sub_department_id: Optional[str] = None
    """Sub-department ID"""

    tags: List[str] = field(default_factory=list)
    """List of product tags"""

    raw_data: Optional[Dict[str, Any]] = None
    """Raw API response data"""

    # Constructor.io specific fields
    data_id: Optional[str] = None
    """Constructor.io data ID"""

    data_ean: Optional[int] = None
    """European Article Number"""

    data_isbopas: Optional[bool] = None
    """Buy One, Get One at Same Price flag"""

    data_isbuyable: Optional[bool] = None
    """Whether product can be purchased"""

    data_isalcohol: Optional[bool] = None
    """Whether product contains alcohol"""

    data_hasmperks: Optional[bool] = None
    """Whether product has mPerks offers"""

    data_specialbuy: Optional[bool] = None
    """Whether product is a special buy"""

    data_deactivated: Optional[bool] = None
    """Whether product is deactivated"""

    data_productunit: Optional[str] = None
    """Product unit description"""

    data_qtyincrement: Optional[int] = None
    """Quantity increment for ordering"""

    data_chokinghazard: Optional[bool] = None
    """Whether product is a choking hazard"""

    data_ispurchasable: Optional[bool] = None
    """Whether product can be purchased"""

    data_pricebyweight: Optional[bool] = None
    """Whether product is priced by weight"""

    data_mperksofferid: Optional[List[Any]] = None
    """List of mPerks offer IDs"""

    data_isagerestricted: Optional[bool] = None
    """Whether product has age restrictions"""

    data_ebtfoodstampable: Optional[bool] = None
    """Whether product can be purchased with EBT"""

    data_pickupavailableflag: Optional[bool] = None
    """Whether pickup is available"""

    data_homedeliverynotavailable: Optional[bool] = None
    """Whether home delivery is not available"""

    data_requiresdiscreteinventorytracking: Optional[bool] = None
    """Whether product requires discrete inventory tracking"""

    data_ismap: Optional[bool] = None
    """Whether product has MAP pricing"""

    data_variation_id: Optional[str] = None
    """Product variation ID"""

    data_pricegoodthrough: Optional[str] = None
    """Date until which price is valid"""

    data_stocklevelstatus: Optional[str] = None
    """Current stock level status"""

    data_discountsalepricevalue: Optional[Union[float, int]] = None
    """Discounted sale price value"""

    data_discountvalue: Optional[float] = None
    """Discount amount"""

    data_discountsavingstext: Optional[str] = None
    """Text describing discount savings"""

    data_discountsalepricetype: Optional[str] = None
    """Type of discount sale price"""

    data_depositvalue: Optional[float] = None
    """Deposit amount if applicable"""

    data_maxorderquantity: Optional[int] = None
    """Maximum order quantity"""

    data_discountsalepricetext: Optional[str] = None
    """Text describing discount sale price"""

    data_packagesize: Optional[str] = None
    """Package size description"""

    data_group_ids: Optional[List[Any]] = None
    """List of group IDs"""

    data_ingredients: Optional[str] = None
    """Product ingredients list"""

    matched_terms: Optional[List[Any]] = field(default_factory=list)
    """Search terms that matched this product"""

    # Aisle location fields for defragging
    aisle_primary: Optional[str] = None
    """Primary aisle location"""

    section: Optional[str] = None
    """Section within the aisle"""

    bay: Optional[str] = None
    """Bay within the section"""

    aisle_locations: List[str] = field(default_factory=list)
    """List of all aisle locations"""

    def __post_init__(self):
        """
        Validate and set default values.

        Sets default title if none provided.
        """
        if not self.title:
            self.title = self.description or "Unknown Product"

    @classmethod
    def from_constructor_response(
        cls, item_data: Dict[str, Any], client: Optional[Any] = None
    ) -> "MeijerItem":
        """
        Create a MeijerItem from Constructor.io API response data.

        Parameters
        ----------
        item_data : Dict[str, Any]
            Raw item data from Constructor.io search response
        client : Any, optional
            Meijer client for additional operations

        Returns
        -------
        MeijerItem
            New MeijerItem instance
        """
        # Extract common Constructor.io fields
        value = item_data.get("value", "")
        data = item_data.get("data", {})

        # Create instance with discovered field mappings
        kwargs = {
            "id": data.get("data_id", str(item_data.get("id", ""))),
            "title": value,
            "description": data.get("data_description", ""),
            "brand": data.get("data_brand", ""),
            "category": data.get("data_category", ""),
            "subcategory": data.get("data_subcategory", ""),
            "upc": str(data.get("data_ean", "")) if data.get("data_ean") else None,
            "sku": data.get("data_sku", ""),
            "image_url": data.get("data_image_url", ""),
            "price": float(data.get("data_price", 0))
            if data.get("data_price")
            else None,
            "sale_price": float(data.get("data_discountsalepricevalue", 0))
            if data.get("data_discountsalepricevalue")
            else None,
            "unit_price": data.get("data_priceunit", ""),
            "is_weighted": data.get("data_pricebyweight", False),
            "is_available": data.get("data_ispurchasable", True),
            "raw_data": item_data,
            # Constructor.io specific fields
            "data_id": data.get("data_id", ""),
            "data_ean": data.get("data_ean"),
            "data_isbopas": data.get("data_isbopas", False),
            "data_isbuyable": data.get("data_isbuyable", False),
            "data_isalcohol": data.get("data_isalcohol", False),
            "data_hasmperks": data.get("data_hasmperks", False),
            "data_specialbuy": data.get("data_specialbuy", False),
            "data_deactivated": data.get("data_deactivated", False),
            "data_productunit": data.get("data_productunit", ""),
            "data_qtyincrement": data.get("data_qtyincrement", 1),
            "data_chokinghazard": data.get("data_chokinghazard", False),
            "data_ispurchasable": data.get("data_ispurchasable", True),
            "data_pricebyweight": data.get("data_pricebyweight", False),
            "data_mperksofferid": data.get("data_mperksofferid", []),
            "data_isagerestricted": data.get("data_isagerestricted", False),
            "data_ebtfoodstampable": data.get("data_ebtfoodstampable", False),
            "data_pickupavailableflag": data.get("data_pickupavailableflag", False),
            "data_homedeliverynotavailable": data.get(
                "data_homedeliverynotavailable", False
            ),
            "data_requiresdiscreteinventorytracking": data.get(
                "data_requiresdiscreteinventorytracking", False
            ),
            "data_ismap": data.get("data_ismap", False),
            "data_variation_id": data.get("data_variation_id", ""),
            "data_pricegoodthrough": data.get("data_pricegoodthrough", ""),
            "data_stocklevelstatus": data.get("data_stocklevelstatus", ""),
            "data_discountsalepricevalue": data.get("data_discountsalepricevalue"),
            "data_discountvalue": data.get("data_discountvalue"),
            "data_discountsavingstext": data.get("data_discountsavingstext", ""),
            "data_discountsalepricetype": data.get("data_discountsalepricetype", ""),
            "data_depositvalue": data.get("data_depositvalue"),
            "data_maxorderquantity": data.get("data_maxorderquantity"),
            "data_discountsalepricetext": data.get("data_discountsalepricetext", ""),
            "data_packagesize": data.get("data_packagesize", ""),
            "data_group_ids": data.get("data_group_ids", []),
            "data_ingredients": data.get("data_ingredients", ""),
            "matched_terms": item_data.get("matched_terms", []),
        }

        return cls(**kwargs)

    @property
    def display_name(self) -> str:
        """
        Get the display name for the item.

        Returns
        -------
        str
            Display name (title or description)
        """
        return self.title or self.description or "Unknown Product"

    @property
    def best_price(self) -> Optional[float]:
        """
        Get the best available price (sale price or regular price).

        Returns
        -------
        float, optional
            Best available price or None if no price available
        """
        if self.sale_price is not None and self.sale_price < (
            self.price or float("inf")
        ):
            return self.sale_price
        return self.price

    @property
    def on_sale(self) -> bool:
        """
        Check if the item is currently on sale.

        Returns
        -------
        bool
            True if item is on sale, False otherwise
        """
        return self.sale_price is not None and self.sale_price < (
            self.price or float("inf")
        )

    @property
    def has_image(self) -> bool:
        """
        Check if the item has an image available.

        Returns
        -------
        bool
            True if image is available, False otherwise
        """
        return bool(self.image_url or self.large_image_url)

    @property
    def primary_image_url(self) -> Optional[str]:
        """
        Get the primary image URL for the item.

        Returns
        -------
        str, optional
            Primary image URL or None if no image available
        """
        return self.large_image_url or self.image_url

    @property
    def discount_amount(self) -> Optional[float]:
        """
        Calculate the discount amount if item is on sale.

        Returns
        -------
        float, optional
            Discount amount or None if not on sale
        """
        if self.on_sale and self.price is not None:
            return self.price - self.sale_price
        return None

    @property
    def discount_percentage(self) -> Optional[float]:
        """
        Calculate the discount percentage if item is on sale.

        Returns
        -------
        float, optional
            Discount percentage or None if not on sale
        """
        if self.on_sale and self.price is not None and self.price > 0:
            return ((self.price - self.sale_price) / self.price) * 100
        return None

    @property
    def dairy(self) -> bool:
        """
        Check if the item is in the dairy category.

        Returns
        -------
        bool
            True if item is dairy, False otherwise
        """
        dairy_keywords = ["milk", "cheese", "yogurt", "butter", "cream", "dairy"]
        return any(
            keyword in (self.category or "").lower()
            or keyword in (self.title or "").lower()
            for keyword in dairy_keywords
        )

    @property
    def produce(self) -> bool:
        """
        Check if the item is in the produce category.

        Returns
        -------
        bool
            True if item is produce, False otherwise
        """
        produce_keywords = ["fruit", "vegetable", "produce", "fresh"]
        return any(
            keyword in (self.category or "").lower()
            or keyword in (self.title or "").lower()
            for keyword in produce_keywords
        )

    @property
    def meat(self) -> bool:
        """
        Check if the item is in the meat category.

        Returns
        -------
        bool
            True if item is meat, False otherwise
        """
        meat_keywords = ["meat", "chicken", "beef", "pork", "fish", "steak", "ground"]
        return any(
            keyword in (self.category or "").lower()
            or keyword in (self.title or "").lower()
            for keyword in meat_keywords
        )

    @property
    def frozen(self) -> bool:
        """
        Check if the item is frozen.

        Returns
        -------
        bool
            True if item is frozen, False otherwise
        """
        frozen_keywords = ["frozen", "ice cream", "frozen food"]
        return any(
            keyword in (self.category or "").lower()
            or keyword in (self.title or "").lower()
            for keyword in frozen_keywords
        )

    @property
    def organic(self) -> bool:
        """
        Check if the item is organic.

        Returns
        -------
        bool
            True if item is organic, False otherwise
        """
        organic_keywords = ["organic", "organically grown"]
        return any(
            keyword in (self.title or "").lower()
            or keyword in (self.description or "").lower()
            for keyword in organic_keywords
        )

    @property
    def gluten_free(self) -> bool:
        """
        Check if the item is gluten-free.

        Returns
        -------
        bool
            True if item is gluten-free, False otherwise
        """
        gluten_free_keywords = ["gluten free", "gluten-free", "no gluten"]
        return any(
            keyword in (self.title or "").lower()
            or keyword in (self.description or "").lower()
            for keyword in gluten_free_keywords
        )

    @property
    def vegan(self) -> bool:
        """
        Check if the item is vegan.

        Returns
        -------
        bool
            True if item is vegan, False otherwise
        """
        vegan_keywords = ["vegan", "plant-based", "no animal products"]
        return any(
            keyword in (self.title or "").lower()
            or keyword in (self.description or "").lower()
            for keyword in vegan_keywords
        )

    @property
    def alcoholic(self) -> bool:
        """
        Check if the item contains alcohol.

        Returns
        -------
        bool
            True if item contains alcohol, False otherwise
        """
        return self.data_isalcohol or any(
            keyword in (self.title or "").lower()
            for keyword in ["wine", "beer", "liquor", "alcohol"]
        )

    @property
    def requires_age_verification(self) -> bool:
        """
        Check if the item requires age verification.

        Returns
        -------
        bool
            True if age verification required, False otherwise
        """
        return self.data_isagerestricted or self.alcoholic

    @property
    def available_for_pickup(self) -> bool:
        """
        Check if the item is available for pickup.

        Returns
        -------
        bool
            True if pickup is available, False otherwise
        """
        return self.data_pickupavailableflag and self.is_available

    @property
    def available_for_delivery(self) -> bool:
        """
        Check if the item is available for home delivery.

        Returns
        -------
        bool
            True if delivery is available, False otherwise
        """
        return not self.data_homedeliverynotavailable and self.is_available

    @property
    def has_mperks_offer(self) -> bool:
        """
        Check if the item has an mPerks offer.

        Returns
        -------
        bool
            True if mPerks offer exists, False otherwise
        """
        return bool(self.data_hasmperks and self.data_mperksofferid)

    @property
    def special_buy(self) -> bool:
        """
        Check if the item is a special buy.

        Returns
        -------
        bool
            True if item is a special buy, False otherwise
        """
        return self.data_specialbuy

    @property
    def deactivated(self) -> bool:
        """
        Check if the item is deactivated.

        Returns
        -------
        bool
            True if item is deactivated, False otherwise
        """
        return self.data_deactivated

    @property
    def purchasable(self) -> bool:
        """
        Check if the item can be purchased.

        Returns
        -------
        bool
            True if item can be purchased, False otherwise
        """
        return self.data_ispurchasable and self.is_available and not self.deactivated

    @property
    def has_location_data(self) -> bool:
        """Check if the item has aisle location data."""
        return bool(self.aisle_primary or self.aisle_locations)

    @property
    def primary_aisle(self) -> Optional[str]:
        """Get the primary aisle location."""
        return self.aisle_primary

    @property
    def all_aisles(self) -> List[str]:
        """Get all aisle locations for the item."""
        aisles = []
        if self.aisle_primary:
            aisles.append(self.aisle_primary)
        aisles.extend(self.aisle_locations)
        return list(set(aisles))  # Remove duplicates

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "id": self.id,
            "title": self.title,
            "description": self.description,
            "brand": self.brand,
            "category": self.category,
            "subcategory": self.subcategory,
            "upc": self.upc,
            "sku": self.sku,
            "imageUrl": self.image_url,
            "largeImageUrl": self.large_image_url,
            "price": self.price,
            "salePrice": self.sale_price,
            "unitPrice": self.unit_price,
            "isWeighted": self.is_weighted,
            "weightUnit": self.weight_unit,
            "weightAmount": self.weight_amount,
            "isAvailable": self.is_available,
            "storeId": self.store_id,
            "departmentId": self.department_id,
            "subDepartmentId": self.sub_department_id,
            "tags": self.tags,
        }
        # Remove None values
        return {k: v for k, v in result.items() if v is not None}


# ============================================================================
# Jupyter Notebook Rich Representations
# ============================================================================

# Note: These methods are dynamically added to the MeijerItem class
# to provide rich Jupyter Notebook representations


@dataclass
class ListItem:
    """
    Represents an item in a shopping list or favorites list.

    Based on the ShoppingListItem class from the decompiled APK.
    """

    list_item_id: int
    """Unique identifier for the list item"""

    list_item_type_id: int
    """Type of item (e.g., PRODUCT, COUPON, WEEKLY_AD, MANUAL)"""

    item_display_order: int
    """Order in which the item appears in the list"""

    item_part_number: Optional[str]
    """Part number of the item"""

    item_description: str
    """Description of the item"""

    quantity: int
    """Quantity of the item"""

    store_id: int
    """Store ID where the item is located"""

    notes: Optional[str]
    """Notes for the item"""

    is_complete: bool
    """Whether the item is marked as complete"""

    is_favorite: bool
    """Whether the item is marked as a favorite"""

    listing_id: Optional[str]
    """ID of the listing this item belongs to"""

    promotion_start: Optional[date]
    """Start date of the promotion"""

    promotion_end: Optional[date]
    """End date of the promotion"""

    coupon_id: int
    """ID of the coupon associated with the item"""

    product_details: Optional[MeijerItem] = None
    """Detailed product information for the item"""
    # Internal reference to list API for operations like marking complete/incomplete
    _list_api: Optional[Any] = field(default=None, repr=False, compare=False)

    # Backward compatibility properties
    @property
    def item_id(self) -> int:
        """Backward compatibility: item_id -> list_item_id."""
        return self.list_item_id

    @property
    def name(self) -> str:
        """Backward compatibility: name -> item_description."""
        return self.item_description

    @property
    def checked(self) -> bool:
        """Backward compatibility: checked -> is_complete."""
        return self.is_complete

    @property
    def complete(self) -> bool:
        """Get or set the completion status of the list item.

        Getting returns the same value as `is_complete`.
        Setting will call the appropriate API via the attached list API if available,
        otherwise it will only update the local field.

        Returns
        -------
        bool
            True if the item is marked complete, False otherwise
        """
        return self.is_complete

    @complete.setter
    def complete(self, value: bool) -> None:
        """Set the completion status for the item.

        When a list API reference is attached, this will invoke the remote API to
        mark the item complete/incomplete and update the local state on success.
        If no API is attached, only the local state is updated.

        Parameters
        ----------
        value : bool
            Desired completion status
        """
        # No-op if already desired state
        if bool(self.is_complete) == bool(value):
            return

        if self._list_api is not None:
            try:
                if value:
                    success = self._list_api.complete_item(str(self.list_item_id))
                else:
                    # Uses the MarkAsNotCompleted endpoint
                    success = self._list_api.mark_as_not_completed(
                        str(self.list_item_id)
                    )
                if success:
                    self.is_complete = bool(value)
                else:
                    raise RuntimeError(
                        f"Failed to set completion to {value} for item {self.list_item_id} via API"
                    )
            except Exception:  # pragma: no cover - passthrough for caller
                raise
        else:
            # Fallback: update local state only
            self.is_complete = bool(value)

    @property
    def upc(self) -> Optional[str]:
        """Backward compatibility: upc from product_details."""
        if self.product_details:
            return self.product_details.upc
        return None

    @property
    def coupon(self) -> bool:
        """Check if this item represents a coupon."""
        return self.list_item_type_id == ItemType.COUPON.value

    @property
    def product(self) -> bool:
        """Check if this item represents a product."""
        return self.list_item_type_id == ItemType.PRODUCT.value

    @property
    def weekly_ad(self) -> bool:
        """Check if this item represents a weekly ad item."""
        return self.list_item_type_id == ItemType.WEEKLY_AD.value

    @property
    def manual(self) -> bool:
        """Check if this item was manually added."""
        return self.list_item_type_id == ItemType.MANUAL.value

    @property
    def has_notes(self) -> bool:
        """Check if the item has notes."""
        return bool(self.notes and self.notes.strip())

    @property
    def has_promotion(self) -> bool:
        """Check if the item has an active promotion."""
        if not self.promotion_start or not self.promotion_end:
            return False
        from datetime import date

        today = date.today()
        return self.promotion_start <= today <= self.promotion_end

    @property
    def promotion_status(self) -> str:
        """Get the current promotion status."""
        if not self.promotion_start or not self.promotion_end:
            return "No Promotion"

        from datetime import date

        today = date.today()

        if today < self.promotion_start:
            days_until = (self.promotion_start - today).days
            return f"Starts in {days_until} days"
        elif today > self.promotion_end:
            days_since = (today - self.promotion_end).days
            return f"Ended {days_since} days ago"
        else:
            days_left = (self.promotion_end - today).days
            return f"Active ({days_left} days left)"

    @property
    def high_priority(self) -> bool:
        """Check if the item is high priority (low display order)."""
        return self.item_display_order <= 3

    @property
    def low_priority(self) -> bool:
        """Check if the item is low priority (high display order)."""
        return self.item_display_order > 10

    @property
    def quantity_description(self) -> str:
        """Get a human-readable quantity description."""
        if self.quantity == 1:
            return "1 item"
        elif self.quantity == 0:
            return "0 items"
        else:
            return f"{self.quantity} items"

    @property
    def display_summary(self) -> str:
        """Get a summary string for display purposes."""
        status = "✅" if self.is_complete else "⏳"
        return f"{status} {self.quantity_description} of {self.name}"

    @property
    def can_be_completed(self) -> bool:
        """Check if the item can be marked as complete."""
        return not self.is_complete

    @property
    def can_be_uncompleted(self) -> bool:
        """Check if the item can be marked as incomplete."""
        return self.is_complete

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
        
        When a list API reference is attached, this will invoke the remote API to
        update the quantity and update the local state on success.
        If no API is attached, only the local state is updated.
        
        Parameters
        ----------
        value : int
            Desired quantity (must be non-negative)
        """
        if value < 0:
            raise ValueError("Quantity must be non-negative")
            
        # No-op if already desired state
        current_qty = self._quantity if hasattr(self, '_quantity') else 1
        if current_qty == value:
            return
            
        if self._list_api is not None:
            try:
                # Update the item quantity
                success = self._list_api.update_item_quantity(str(self.list_item_id), value)
                if success:
                    self._quantity = value
                else:
                    raise RuntimeError(
                        f"Failed to set quantity to {value} for item {self.list_item_id} via API"
                    )
            except Exception:  # pragma: no cover - passthrough for caller
                raise
        else:
            # Fallback: update local state only
            self._quantity = value

    @property
    def notes(self) -> Optional[str]:
        """Get the notes for the item."""
        return self._notes if hasattr(self, '_notes') else None

    @notes.setter
    def notes(self, value: Optional[str]) -> None:
        """Set the notes for the item.
        
        When a list API reference is attached, this will invoke the remote API to
        update the notes and update the local state on success.
        If no API is attached, only the local state is updated.
        
        Parameters
        ----------
        value : str, optional
            Desired notes text
        """
        # No-op if already desired state
        current_notes = self._notes if hasattr(self, '_notes') else None
        if current_notes == value:
            return
            
        if self._list_api is not None:
            try:
                # Update the item notes
                success = self._list_api.update_item_notes(str(self.list_item_id), value)
                if success:
                    self._notes = value
                else:
                    raise RuntimeError(
                        f"Failed to set notes for item {self.list_item_id} via API"
                    )
            except Exception:  # pragma: no cover - passthrough for caller
                raise
        else:
            # Fallback: update local state only
            self._notes = value

    @property
    def display_order(self) -> int:
        """Get the display order of the item."""
        return self.item_display_order

    @display_order.setter
    def display_order(self, value: int) -> None:
        """Set the display order for the item.
        
        When a list API reference is attached, this will invoke the remote API to
        reorder the item and update the local state on success.
        If no API is attached, only the local state is updated.
        
        Parameters
        ----------
        value : int
            Desired display order position
        """
        if value < 0:
            raise ValueError("Display order must be non-negative")
            
        # No-op if already desired state
        if self.item_display_order == value:
            return
            
        if self._list_api is not None:
            try:
                # Reorder the item
                success = self._list_api.reorder_item(str(self.list_item_id), value)
                if success:
                    self.item_display_order = value
                else:
                    raise RuntimeError(
                        f"Failed to set display order to {value} for item {self.list_item_id} via API"
                    )
            except Exception:  # pragma: no cover - passthrough for caller
                raise
        else:
            # Fallback: update local state only
            self.item_display_order = value

    @property
    def favorite(self) -> bool:
        """Check if this item is marked as a favorite."""
        return self.is_favorite

    @favorite.setter
    def favorite(self, value: bool) -> None:
        """Set the favorite status for the item.
        
        When a list API reference is attached, this will invoke the remote API to
        update the favorite status and update the local state on success.
        If no API is attached, only the local state is updated.
        
        Parameters
        ----------
        value : bool
            Desired favorite status
        """
        # No-op if already desired state
        if bool(self.is_favorite) == bool(value):
            return
            
        if self._list_api is not None:
            try:
                if value:
                    # Add to favorites
                    success = self._list_api.add_favorite(self.item_part_number or str(self.list_item_id))
                else:
                    # Remove from favorites
                    success = self._list_api.delete_favorite(self.item_part_number or str(self.list_item_id))
                    
                if success:
                    self.is_favorite = bool(value)
                else:
                    raise RuntimeError(
                        f"Failed to set favorite status to {value} for item {self.list_item_id} via API"
                    )
            except Exception:  # pragma: no cover - passthrough for caller
                raise
        else:
            # Fallback: update local state only
            self.is_favorite = bool(value)

    @property
    def age_restricted(self) -> bool:
        """Check if this item requires age verification."""
        # This would need to be implemented based on actual API data
        return False

    @property
    def can_be_deleted(self) -> bool:
        """Check if the item can be deleted from the list."""
        return self.list_item_id > 0  # Only real items can be deleted

    @property
    def is_editable(self) -> bool:
        """Check if the item can be edited."""
        return not self.is_complete and self.list_item_id > 0

    @property
    def status_icon(self) -> str:
        """Get a status icon for the item."""
        if self.is_complete:
            return "✅"
        elif self.is_favorite:
            return "⭐"
        elif self.has_promotion:
            return "🏷️"
        else:
            return "⏳"

    @property
    def priority_level(self) -> str:
        """Get the priority level of the item based on display order."""
        if self.item_display_order <= 3:
            return "High"
        elif self.item_display_order <= 7:
            return "Medium"
        else:
            return "Low"

    @property
    def location_info(self) -> Optional[str]:
        """Get location information from notes if available."""
        if not self.notes:
            return None

        # Look for location patterns in notes
        if ":" in self.notes:
            location_part = self.notes.split(":")[0]
            if any(
                aisle in location_part.upper() for aisle in ["A", "B", "C", "D", "E"]
            ):
                return location_part.strip()

        return None

    @property
    def product_info(self) -> Optional[str]:
        """Get product information from notes if available."""
        if not self.notes or "|" not in self.notes:
            return None

        # Extract product info after the pipe separator
        parts = self.notes.split("|")
        if len(parts) > 1:
            return parts[1].strip()

        return None

    @property
    def has_product_details(self) -> bool:
        """Check if the item has detailed product information."""
        return self.product_details is not None

    @property
    def product_upc(self) -> Optional[str]:
        """Get the UPC from product details if available."""
        if self.product_details:
            return self.product_details.upc
        return self.item_part_number

    @property
    def product_brand(self) -> Optional[str]:
        """Get the brand from product details if available."""
        if self.product_details:
            return self.product_details.brand
        return None

    @property
    def product_category(self) -> Optional[str]:
        """Get the category from product details if available."""
        if self.product_details:
            return self.product_details.category
        return None

    @property
    def product_price(self) -> Optional[float]:
        """Get the price from product details if available."""
        if self.product_details:
            return self.product_details.best_price
        return None

    @property
    def product_image_url(self) -> Optional[str]:
        """Get the image URL from product details if available."""
        if self.product_details:
            return self.product_details.primary_image_url
        return None

    # ============================================================================
    # Jupyter Notebook Rich Representations
    # ============================================================================

    def _repr_html_(self) -> str:
        """Rich HTML representation for Jupyter notebooks."""
        # Determine status color and icon
        if self.is_complete:
            status_color = "#27ae60"  # Green for completed
            status_icon = "✅"
            status_text = "Completed"
        elif self.is_favorite:
            status_color = "#f39c12"  # Orange for favorite
            status_icon = "⭐"
            status_text = "Favorite"
        elif self.has_promotion:
            status_color = "#e74c3c"  # Red for promotion
            status_icon = "🏷️"
            status_text = "Promotion"
        else:
            status_color = "#3498db"  # Blue for normal
            status_icon = "⏳"
            status_text = "Pending"

        # Get location info from notes if available
        location_info = None
        if self.notes and ":" in self.notes:
            location_part = self.notes.split(":")[0]
            if any(
                aisle in location_part.upper() for aisle in ["A", "B", "C", "D", "E"]
            ):
                location_info = location_part.strip()

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
                    ">{status_icon}</span>
                    <div>
                        <h3 style="
                            margin: 0 0 4px 0;
                            color: #2c3e50;
                            font-weight: 600;
                            font-size: 18px;
                        ">{self.name}</h3>
                        <div style="
                            color: #7f8c8d;
                            font-size: 14px;
                            font-weight: 500;
                        ">{status_text} • Order: {self.item_display_order}</div>
                    </div>
                </div>
                <div style="
                    text-align: right;
                    font-weight: 600;
                ">
                    <div style="
                        color: #e74c3c;
                        font-size: 20px;
                        margin-bottom: 4px;
                    ">Qty: {self.quantity}</div>
                    <div style="
                        color: #7f8c8d;
                        font-size: 14px;
                    ">ID: {self.list_item_id}</div>
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
                    ">Item Details</div>
                    <div style="color: #7f8c8d; font-size: 14px;">
                        <strong>Type:</strong> {ItemType(self.list_item_type_id).name}<br>
                        <strong>Part Number:</strong> {self.item_part_number or 'N/A'}<br>
                        <strong>Store ID:</strong> {self.store_id}
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
                    ">Properties</div>
                    <div style="color: #7f8c8d; font-size: 14px;">
                        <strong>Priority:</strong> {'High' if self.high_priority else 'Low' if self.low_priority else 'Medium'}<br>
                        <strong>Notes:</strong> {self.has_notes and 'Yes' or 'No'}<br>
                        <strong>Promotion:</strong> {self.has_promotion and 'Yes' or 'No'}
                    </div>
                </div>
            </div>

            {f'<div style="background: #fff3cd; border: 1px solid #ffeaa7; border-radius: 8px; padding: 12px; margin-bottom: 16px;"><div style="font-weight: 600; color: #856404; margin-bottom: 4px;">📍 Location</div><div style="color: #856404; font-size: 14px;">{location_info}</div></div>' if location_info else ''}

            {f'<div style="background: #d1ecf1; border: 1px solid #bee5eb; border-radius: 8px; padding: 12px; margin-bottom: 16px;"><div style="font-weight: 600; color: #0c5460; margin-bottom: 4px;">📝 Notes</div><div style="color: #0c5460; font-size: 14px;">{self.notes}</div></div>' if self.notes else ''}

            <div style="
                display: flex;
                gap: 8px;
                flex-wrap: wrap;
            ">
                {'<span style="background: #27ae60; color: white; padding: 4px 8px; border-radius: 6px; font-size: 12px; font-weight: 600;">✅ Complete</span>' if self.is_complete else ''}
                {'<span style="background: #f39c12; color: white; padding: 4px 8px; border-radius: 6px; font-size: 12px; font-weight: 600;">⭐ Favorite</span>' if self.is_favorite else ''}
                {'<span style="background: #e74c3c; color: white; padding: 4px 8px; border-radius: 6px; font-size: 12px; font-weight: 600;">🏷️ Promotion</span>' if self.has_promotion else ''}
                {'<span style="background: #9b59b6; color: white; padding: 4px 8px; border-radius: 6px; font-size: 12px; font-weight: 600;">🎫 Coupon</span>' if self.coupon else ''}
                {'<span style="background: #3498db; color: white; padding: 4px 8px; border-radius: 6px; font-size: 12px; font-weight: 600;">📰 Weekly Ad</span>' if self.weekly_ad else ''}
                {'<span style="background: #1abc9c; color: white; padding: 4px 8px; border-radius: 6px; font-size: 12px; font-weight: 600;">✏️ Manual</span>' if self.manual else ''}
                {'<span style="background: #5f27cd; color: white; padding: 4px 8px; border-radius: 6px; font-size: 12px; font-weight: 600;">🔞 Age Restricted</span>' if self.age_restricted else ''}
            </div>
        </div>
        """
        return html

    def _repr_markdown_(self) -> str:
        """Rich Markdown representation for Jupyter notebooks."""
        # Determine status icon and text
        if self.is_complete:
            status_icon = "✅"
            status_text = "Completed"
        elif self.is_favorite:
            status_icon = "⭐"
            status_text = "Favorite"
        elif self.has_promotion:
            status_icon = "🏷️"
            status_text = "Promotion"
        else:
            status_icon = "⏳"
            status_text = "Pending"

        # Get location info from notes if available
        location_info = None
        if self.notes and ":" in self.notes:
            location_part = self.notes.split(":")[0]
            if any(
                aisle in location_part.upper() for aisle in ["A", "B", "C", "D", "E"]
            ):
                location_info = location_part.strip()

        md = f"""
## {status_icon} {self.name}

**Status:** {status_text} • **Quantity:** {self.quantity} • **Order:** {self.item_display_order}

### Details
- **Item ID:** {self.list_item_id}
- **Type:** {ItemType(self.list_item_type_id).name}
- **Part Number:** {self.item_part_number or 'N/A'}
- **Store ID:** {self.store_id}
- **Priority:** {'High' if self.high_priority else 'Low' if self.low_priority else 'Medium'}

### Properties
"""

        if self.is_complete:
            md += "- ✅ **Complete**\n"
        if self.is_favorite:
            md += "- ⭐ **Favorite**\n"
        if self.has_promotion:
            md += "- 🏷️ **Promotion**\n"
        if self.coupon:
            md += "- 🎫 **Coupon**\n"
        if self.product:
            md += "- 📦 **Product**\n"
        if self.weekly_ad:
            md += "- 📰 **Weekly Ad**\n"
        if self.manual:
            md += "- ✏️ **Manual Entry**\n"
        if self.has_notes:
            md += "- 📝 **Has Notes**\n"

        if location_info:
            md += f"\n### 📍 Location\n- **Aisle:** {location_info}\n"

        if self.notes:
            md += f"\n### 📝 Notes\n{self.notes}\n"

        if self.has_promotion:
            md += f"\n### 🏷️ Promotion\n- **Status:** {self.promotion_status}\n"

        md += f"\n**Display Summary:** {self.display_summary}"
        return md

    def _repr_pretty_(self, p, cycle):
        """Rich text representation for IPython."""
        if cycle:
            p.text("ListItem(...)")
        else:
            # Determine status icon
            if self.is_complete:
                status_icon = "✅"
            elif self.is_favorite:
                status_icon = "⭐"
            elif self.has_promotion:
                status_icon = "🏷️"
            else:
                status_icon = "⏳"

            p.text(f"{status_icon} {self.name}")
            p.breakable()
            p.text(
                f"  ID: {self.list_item_id} | Qty: {self.quantity} | Order: {self.item_display_order}"
            )
            p.breakable()
            p.text(f"  Type: {ItemType(self.list_item_type_id).name}")
            p.breakable()
            p.text(f"  Part Number: {self.item_part_number or 'N/A'}")
            p.breakable()
            p.text(f"  Store ID: {self.store_id}")

            if self.notes:
                p.breakable()
                p.text(f"  Notes: {self.notes}")

            # Show special properties
            special_props = []
            if self.is_complete:
                special_props.append("✅ Complete")
            if self.is_favorite:
                special_props.append("⭐ Favorite")
            if self.has_promotion:
                special_props.append("🏷️ Promotion")
            if self.coupon:
                special_props.append("🎫 Coupon")
            if self.weekly_ad:
                special_props.append("📰 Weekly Ad")
            if self.manual:
                special_props.append("✏️ Manual")

            if special_props:
                p.breakable()
                p.text(f"  Special: {', '.join(special_props)}")
