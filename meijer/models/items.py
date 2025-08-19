"""
Item models for Meijer API responses.

This module contains dataclasses for products and shopping list items.
"""

from dataclasses import dataclass, field
from datetime import date
from typing import Any, Dict, List, Optional, Union

from .base import ItemType


@dataclass
class MeijerItem:
    """
    Represents a product/item from Meijer's system.

    Based on the ProductFullDetails class from the decompiled APK.
    Enhanced to support Constructor.io search API responses.
    """

    id: str
    title: str
    description: Optional[str] = None
    brand: Optional[str] = None
    category: Optional[str] = None
    subcategory: Optional[str] = None
    upc: Optional[str] = None
    sku: Optional[str] = None
    image_url: Optional[str] = None
    large_image_url: Optional[str] = None
    price: Optional[float] = None
    sale_price: Optional[float] = None
    unit_price: Optional[str] = None
    is_weighted: bool = False
    weight_unit: Optional[str] = None
    weight_amount: Optional[float] = None
    is_available: bool = True
    store_id: Optional[str] = None
    department_id: Optional[str] = None
    sub_department_id: Optional[str] = None
    tags: List[str] = field(default_factory=list)
    raw_data: Optional[Dict[str, Any]] = None

    # Constructor.io specific fields
    data_id: Optional[str] = None
    data_ean: Optional[int] = None
    data_isbopas: Optional[bool] = None
    data_isbuyable: Optional[bool] = None
    data_isalcohol: Optional[bool] = None
    data_hasmperks: Optional[bool] = None
    data_specialbuy: Optional[bool] = None
    data_deactivated: Optional[bool] = None
    data_productunit: Optional[str] = None
    data_qtyincrement: Optional[int] = None
    data_chokinghazard: Optional[bool] = None
    data_ispurchasable: Optional[bool] = None
    data_pricebyweight: Optional[bool] = None
    data_mperksofferid: Optional[List[Any]] = None
    data_isagerestricted: Optional[bool] = None
    data_ebtfoodstampable: Optional[bool] = None
    data_pickupavailableflag: Optional[bool] = None
    data_homedeliverynotavailable: Optional[bool] = None
    data_requiresdiscreteinventorytracking: Optional[bool] = None
    data_ismap: Optional[bool] = None
    data_variation_id: Optional[str] = None
    data_pricegoodthrough: Optional[str] = None
    data_stocklevelstatus: Optional[str] = None
    data_discountsalepricevalue: Optional[Union[float, int]] = None
    data_discountvalue: Optional[float] = None
    data_discountsavingstext: Optional[str] = None
    data_discountsalepricetype: Optional[str] = None
    data_depositvalue: Optional[float] = None
    data_maxorderquantity: Optional[int] = None
    data_discountsalepricetext: Optional[str] = None
    data_packagesize: Optional[str] = None
    data_group_ids: Optional[List[Any]] = None
    data_ingredients: Optional[str] = None
    matched_terms: Optional[List[Any]] = field(default_factory=list)

    # Aisle location fields for defragging
    aisle_primary: Optional[str] = None
    aisle_locations: List[str] = field(default_factory=list)

    def __post_init__(self):
        """Validate and set default values."""
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
        """Get a display-friendly name for the item."""
        if self.brand and self.brand not in self.title:
            return f"{self.brand} {self.title}"
        return self.title

    @property
    def best_price(self) -> Optional[float]:
        """Get the best available price (sale price if available, otherwise regular price)."""
        if self.sale_price is not None:
            return self.sale_price
        return self.price

    @property
    def on_sale(self) -> bool:
        """Check if the item is currently on sale."""
        return self.sale_price is not None and self.sale_price < (self.price or 0)

    @property
    def has_image(self) -> bool:
        """Check if the item has an image available."""
        return bool(self.image_url or self.large_image_url)

    @property
    def primary_image_url(self) -> Optional[str]:
        """Get the primary image URL (large image preferred, fallback to regular)."""
        return self.large_image_url or self.image_url

    @property
    def discount_amount(self) -> Optional[float]:
        """Get the discount amount if the item is on sale."""
        if self.on_sale and self.price and self.sale_price:
            return self.price - self.sale_price
        return None

    @property
    def discount_percentage(self) -> Optional[float]:
        """Get the discount percentage if the item is on sale."""
        if self.on_sale and self.price and self.sale_price:
            return ((self.price - self.sale_price) / self.price) * 100
        return None

    @property
    def dairy(self) -> bool:
        """Check if the item is in the dairy category."""
        dairy_keywords = ["milk", "cheese", "yogurt", "cream", "butter", "dairy"]
        return any(
            keyword in (self.category or "").lower()
            or keyword in (self.title or "").lower()
            for keyword in dairy_keywords
        )

    @property
    def produce(self) -> bool:
        """Check if the item is in the produce category."""
        produce_keywords = ["fruit", "vegetable", "produce", "fresh"]
        return any(
            keyword in (self.category or "").lower()
            or keyword in (self.title or "").lower()
            for keyword in produce_keywords
        )

    @property
    def meat(self) -> bool:
        """Check if the item is in the meat category."""
        meat_keywords = ["meat", "chicken", "beef", "pork", "fish", "steak", "ground"]
        return any(
            keyword in (self.category or "").lower()
            or keyword in (self.title or "").lower()
            for keyword in meat_keywords
        )

    @property
    def frozen(self) -> bool:
        """Check if the item is frozen."""
        frozen_keywords = ["frozen", "ice cream", "frozen food"]
        return any(
            keyword in (self.category or "").lower()
            or keyword in (self.title or "").lower()
            for keyword in frozen_keywords
        )

    @property
    def organic(self) -> bool:
        """Check if the item is organic."""
        organic_keywords = ["organic", "organically grown"]
        return any(
            keyword in (self.title or "").lower()
            or keyword in (self.description or "").lower()
            for keyword in organic_keywords
        )

    @property
    def gluten_free(self) -> bool:
        """Check if the item is gluten-free."""
        gluten_free_keywords = ["gluten free", "gluten-free", "no gluten"]
        return any(
            keyword in (self.title or "").lower()
            or keyword in (self.description or "").lower()
            for keyword in gluten_free_keywords
        )

    @property
    def vegan(self) -> bool:
        """Check if the item is vegan."""
        vegan_keywords = ["vegan", "plant-based", "no animal products"]
        return any(
            keyword in (self.title or "").lower()
            or keyword in (self.description or "").lower()
            for keyword in vegan_keywords
        )

    @property
    def alcoholic(self) -> bool:
        """Check if the item contains alcohol."""
        return self.data_isalcohol or any(
            keyword in (self.title or "").lower()
            for keyword in ["wine", "beer", "liquor", "alcohol"]
        )

    @property
    def requires_age_verification(self) -> bool:
        """Check if the item requires age verification."""
        return self.data_isagerestricted or self.alcoholic

    @property
    def available_for_pickup(self) -> bool:
        """Check if the item is available for pickup."""
        return self.data_pickupavailableflag and self.is_available

    @property
    def available_for_delivery(self) -> bool:
        """Check if the item is available for home delivery."""
        return not self.data_homedeliverynotavailable and self.is_available

    @property
    def has_mperks_offer(self) -> bool:
        """Check if the item has an mPerks offer."""
        return bool(self.data_hasmperks and self.data_mperksofferid)

    @property
    def special_buy(self) -> bool:
        """Check if the item is a special buy."""
        return self.data_specialbuy

    @property
    def deactivated(self) -> bool:
        """Check if the item is deactivated."""
        return self.data_deactivated

    @property
    def purchasable(self) -> bool:
        """Check if the item can be purchased."""
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


@dataclass
class ListItem:
    """
    Represents an item in a shopping list or favorites list.

    Based on the ShoppingListItem class from the decompiled APK.
    """

    list_item_id: int
    list_item_type_id: int
    item_display_order: int
    item_part_number: Optional[str]
    item_description: str
    quantity: int
    store_id: int
    notes: Optional[str]
    is_complete: bool
    is_favorite: bool
    listing_id: Optional[str]
    promotion_start: Optional[date]
    promotion_end: Optional[date]
    coupon_id: int
    product_details: Optional[MeijerItem] = None
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
    def is_coupon(self) -> bool:
        """Check if this item represents a coupon."""
        return self.list_item_type_id == ItemType.COUPON.value

    @property
    def is_product(self) -> bool:
        """Check if this item represents a product."""
        return self.list_item_type_id == ItemType.PRODUCT.value

    @property
    def is_weekly_ad(self) -> bool:
        """Check if this item represents a weekly ad item."""
        return self.list_item_type_id == ItemType.WEEKLY_AD.value

    @property
    def is_manual(self) -> bool:
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

    @property
    def favorite_item(self) -> bool:
        """Check if this item is marked as a favorite."""
        return self.is_favorite

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

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "listItemId": self.list_item_id,
            "listItemTypeId": self.list_item_type_id,
            "itemDisplayOrder": self.item_display_order,
            "itemPartNumber": self.item_part_number,
            "itemDescription": self.item_description,
            "quantity": self.quantity,
            "storeId": self.store_id,
            "notes": self.notes,
            "isComplete": self.is_complete,
            "isFavorite": self.is_favorite,
            "listingId": self.listing_id,
            "promotionStart": self.promotion_start.isoformat()
            if self.promotion_start
            else None,
            "promotionEnd": self.promotion_end.isoformat()
            if self.promotion_end
            else None,
            "couponId": self.coupon_id,
        }
        # Remove None values
        return {k: v for k, v in result.items() if v is not None}
