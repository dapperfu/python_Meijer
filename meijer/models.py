"""
Data models for Meijer API responses.

This module contains dataclasses that represent the structure of API responses
from the Meijer mobile app, based on analysis of the decompiled APK.
"""

from dataclasses import dataclass, field
from datetime import date
from typing import Any, Dict, List, Optional, Union
from enum import Enum


class ItemType(Enum):
    """Types of items that can be added to shopping lists."""

    PRODUCT = 1
    COUPON = 2
    WEEKLY_AD = 3
    MANUAL = 4


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
        return any(keyword in (self.category or "").lower() or keyword in (self.title or "").lower() 
                  for keyword in dairy_keywords)

    @property
    def produce(self) -> bool:
        """Check if the item is in the produce category."""
        produce_keywords = ["fruit", "vegetable", "produce", "fresh"]
        return any(keyword in (self.category or "").lower() or keyword in (self.title or "").lower() 
                  for keyword in produce_keywords)

    @property
    def meat(self) -> bool:
        """Check if the item is in the meat category."""
        meat_keywords = ["meat", "chicken", "beef", "pork", "fish", "steak", "ground"]
        return any(keyword in (self.category or "").lower() or keyword in (self.title or "").lower() 
                  for keyword in meat_keywords)

    @property
    def frozen(self) -> bool:
        """Check if the item is frozen."""
        frozen_keywords = ["frozen", "ice cream", "frozen food"]
        return any(keyword in (self.category or "").lower() or keyword in (self.title or "").lower() 
                  for keyword in frozen_keywords)

    @property
    def organic(self) -> bool:
        """Check if the item is organic."""
        organic_keywords = ["organic", "organically grown"]
        return any(keyword in (self.title or "").lower() or keyword in (self.description or "").lower() 
                  for keyword in organic_keywords)

    @property
    def gluten_free(self) -> bool:
        """Check if the item is gluten-free."""
        gluten_free_keywords = ["gluten free", "gluten-free", "no gluten"]
        return any(keyword in (self.title or "").lower() or keyword in (self.description or "").lower() 
                  for keyword in gluten_free_keywords)

    @property
    def vegan(self) -> bool:
        """Check if the item is vegan."""
        vegan_keywords = ["vegan", "plant-based", "no animal products"]
        return any(keyword in (self.title or "").lower() or keyword in (self.description or "").lower() 
                  for keyword in vegan_keywords)

    @property
    def alcoholic(self) -> bool:
        """Check if the item contains alcohol."""
        return self.data_isalcohol or any(keyword in (self.title or "").lower() 
                                         for keyword in ["wine", "beer", "liquor", "alcohol"])

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
                    success = self._list_api.mark_as_not_completed(str(self.list_item_id))
                if success:
                    self.is_complete = bool(value)
                else:
                    raise RuntimeError(
                        f"Failed to set completion to {value} for item {self.list_item_id} via API"
                    )
            except Exception as exc:  # pragma: no cover - passthrough for caller
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


@dataclass
class MeijerCoupon:
    """
    Represents a coupon/offer from Meijer.

    Based on the API response structure from the offers endpoint.
    """

    meijer_offer_id: int
    title: str
    description: str
    image_url: Optional[str]
    large_image_url: Optional[str]
    terms_and_conditions: str
    manufacturer_coupon: bool
    redemption_start_date: date
    redemption_end_date: date
    redeem_amount: float
    offer_class_id: int
    logix_offer_id: int
    is_suggested: bool = False
    is_clipped: bool = False
    is_auto_clipped: bool = False
    is_hidden: bool = False
    is_targeted: bool = False
    is_clippable: bool = True
    is_special_offer: bool = False
    redemption_date: Optional[date] = None
    category: Optional[str] = None
    subcategory: Optional[str] = None
    tags: List[str] = field(default_factory=list)
    hat_text: Optional[str] = None
    hat_color: int = 0
    border_color: int = 0
    is_meijer_buck: bool = False
    show_large_image: bool = False
    condition_type_id: int = 0
    condition_value: float = 0.0
    discount_type_id: int = 0
    discount_level_id: int = 0
    coupon_id: int = 0
    raw_data: Optional[Dict[str, Any]] = None

    @property
    def is_expired(self) -> bool:
        """Check if the coupon has expired."""
        from datetime import date

        return date.today() > self.redemption_end_date

    @property
    def is_active(self) -> bool:
        """Check if the coupon is currently active."""
        from datetime import date

        today = date.today()
        return self.redemption_start_date <= today <= self.redemption_end_date

    @property
    def days_until_expiry(self) -> int:
        """Get the number of days until the coupon expires."""
        from datetime import date

        return (self.redemption_end_date - date.today()).days

    @property
    def days_since_start(self) -> int:
        """Get the number of days since the coupon became available."""
        from datetime import date

        return (date.today() - self.redemption_start_date).days

    @property
    def about_to_expire(self) -> bool:
        """Check if the coupon expires within 7 days."""
        return self.days_until_expiry <= 7

    @property
    def newly_available(self) -> bool:
        """Check if the coupon became available within 7 days."""
        return self.days_since_start <= 7

    @property
    def has_image(self) -> bool:
        """Check if the coupon has an image available."""
        return bool(self.image_url or self.large_image_url)

    @property
    def primary_image_url(self) -> Optional[str]:
        """Get the primary image URL (large image preferred, fallback to regular)."""
        return self.large_image_url or self.image_url

    @property
    def clippable_now(self) -> bool:
        """Check if the coupon can be clipped right now."""
        return self.is_clippable and self.is_active and not self.is_clipped

    @property
    def can_be_unclipped(self) -> bool:
        """Check if the coupon can be unclipped."""
        return self.is_clipped

    @property
    def auto_clipped(self) -> bool:
        """Check if the coupon was automatically clipped."""
        return self.is_auto_clipped

    @property
    def hidden_from_view(self) -> bool:
        """Check if the coupon is hidden from normal view."""
        return self.is_hidden

    @property
    def targeted_for_user(self) -> bool:
        """Check if the coupon is specifically targeted for the current user."""
        return self.is_targeted

    @property
    def meijer_buck_eligible(self) -> bool:
        """Check if the coupon is eligible for Meijer Bucks."""
        return self.is_meijer_buck

    @property
    def should_show_large_image(self) -> bool:
        """Check if the coupon should display a large image."""
        return self.show_large_image

    @property
    def has_conditions(self) -> bool:
        """Check if the coupon has purchase conditions."""
        return self.condition_value > 0

    @property
    def condition_description(self) -> str:
        """Get a human-readable description of the coupon conditions."""
        if not self.has_conditions:
            return "No minimum purchase required"
        
        condition_types = {
            1: "Spend",
            2: "Buy",
            3: "Save on"
        }
        
        condition_type = condition_types.get(self.condition_type_id, "Purchase")
        return f"{condition_type} ${self.condition_value:.2f} or more"

    @property
    def discount_description(self) -> str:
        """Get a human-readable description of the discount."""
        discount_types = {
            1: "Percentage off",
            2: "Dollar amount off",
            3: "Buy one get one",
            4: "Free item with purchase"
        }
        
        discount_type = discount_types.get(self.discount_type_id, "Discount")
        
        if self.discount_type_id == 1:  # Percentage
            return f"{discount_type} {self.redeem_amount:.0f}%"
        elif self.discount_type_id == 2:  # Dollar amount
            return f"{discount_type} ${self.redeem_amount:.2f}"
        else:
            return discount_type

    @property
    def special_offer_type(self) -> bool:
        """Check if this is a special type of offer."""
        return self.is_special_offer

    @property
    def manufacturer_coupon_type(self) -> bool:
        """Check if this is a manufacturer coupon."""
        return self.manufacturer_coupon

    @property
    def suggested_for_user(self) -> bool:
        """Check if this coupon is suggested for the current user."""
        return self.is_suggested

    @property
    def has_hat_text(self) -> bool:
        """Check if the coupon has promotional hat text."""
        return bool(self.hat_text and self.hat_text.strip())

    @property
    def has_custom_colors(self) -> bool:
        """Check if the coupon has custom colors defined."""
        return self.hat_color != 0 or self.border_color != 0

    @property
    def ebt_eligible(self) -> bool:
        """Check if the coupon is eligible for EBT/food stamps."""
        # This would need to be implemented based on actual EBT logic
        # For now, return False as a placeholder
        return False

    @property
    def alcohol_related(self) -> bool:
        """Check if the coupon is related to alcohol products."""
        alcohol_keywords = ["wine", "beer", "liquor", "alcohol", "spirits"]
        return any(keyword in (self.title or "").lower() or keyword in (self.description or "").lower() 
                  for keyword in alcohol_keywords)

    @property
    def requires_age_verification(self) -> bool:
        """Check if the coupon requires age verification."""
        return self.alcohol_related

    @property
    def display_priority(self) -> int:
        """Get the display priority for the coupon (lower = higher priority)."""
        priority = 0
        
        # High priority: expiring soon
        if self.about_to_expire:
            priority -= 100
        
        # High priority: newly available
        if self.newly_available:
            priority -= 50
        
        # High priority: targeted for user
        if self.targeted_for_user:
            priority -= 25
        
        # High priority: suggested for user
        if self.suggested_for_user:
            priority -= 20
        
        # Medium priority: clipped
        if self.is_clipped:
            priority += 10
        
        # Lower priority: hidden
        if self.is_hidden:
            priority += 100
        
        return priority

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "meijerOfferId": self.meijer_offer_id,
            "title": self.title,
            "description": self.description,
            "imageURL": self.image_url,
            "largeImageURL": self.large_image_url,
            "termsAndConditions": self.terms_and_conditions,
            "manufacturerCoupon": self.manufacturer_coupon,
            "redemptionStartDate": self.redemption_start_date.isoformat(),
            "redemptionEndDate": self.redemption_end_date.isoformat(),
            "redeemAmount": self.redeem_amount,
            "offerClassId": self.offer_class_id,
            "logixOfferId": self.logix_offer_id,
            "isSuggested": self.is_suggested,
            "isClipped": self.is_clipped,
            "isAutoClipped": self.is_auto_clipped,
            "isHidden": self.is_hidden,
            "isTargeted": self.is_targeted,
            "isClippable": self.is_clippable,
            "isSpecialOffer": self.is_special_offer,
            "redemptionDate": self.redemption_date.isoformat()
            if self.redemption_date
            else None,
            "category": self.category,
            "subcategory": self.subcategory,
            "tags": self.tags,
            "hatText": self.hat_text,
            "hatColor": self.hat_color,
            "borderColor": self.border_color,
            "isMeijerBuck": self.is_meijer_buck,
            "showLargeImage": self.show_large_image,
            "conditionTypeId": self.condition_type_id,
            "conditionValue": self.condition_value,
            "discountTypeId": self.discount_type_id,
            "discountLevelId": self.discount_level_id,
            "couponId": self.coupon_id,
        }
        # Remove None values
        return {k: v for k, v in result.items() if v is not None}


@dataclass
class Store:
    """Represents a Meijer store location."""

    store_id: str
    name: str
    address: str
    city: str
    state: str
    zip_code: str
    phone: Optional[str] = None
    hours: Optional[str] = None
    latitude: Optional[float] = None
    longitude: Optional[float] = None
    distance: Optional[float] = None
    is_open: bool = True
    services: List[str] = field(default_factory=list)
    raw_data: Optional[Dict[str, Any]] = None

    @property
    def full_address(self) -> str:
        """Get the complete address string."""
        return f"{self.address}, {self.city}, {self.state} {self.zip_code}"

    @property
    def has_phone(self) -> bool:
        """Check if the store has a phone number."""
        return bool(self.phone and self.phone.strip())

    @property
    def has_hours(self) -> bool:
        """Check if the store has hours information."""
        return bool(self.hours and self.hours.strip())

    @property
    def has_location_coordinates(self) -> bool:
        """Check if the store has latitude/longitude coordinates."""
        return self.latitude is not None and self.longitude is not None

    @property
    def has_distance_info(self) -> bool:
        """Check if the store has distance information."""
        return self.distance is not None

    @property
    def distance_formatted(self) -> Optional[str]:
        """Get the distance formatted as a string."""
        if self.distance is None:
            return None
        
        if self.distance < 1:
            return f"{self.distance * 5280:.0f} ft"
        elif self.distance < 10:
            return f"{self.distance:.1f} mi"
        else:
            return f"{self.distance:.0f} mi"

    @property
    def is_closed(self) -> bool:
        """Check if the store is currently closed."""
        return not self.is_open

    @property
    def has_services(self) -> bool:
        """Check if the store has any services listed."""
        return len(self.services) > 0

    @property
    def service_count(self) -> int:
        """Get the number of services available at the store."""
        return len(self.services)

    @property
    def has_pharmacy(self) -> bool:
        """Check if the store has a pharmacy."""
        pharmacy_keywords = ["pharmacy", "rx", "prescription"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in pharmacy_keywords)

    @property
    def has_photo_center(self) -> bool:
        """Check if the store has a photo center."""
        photo_keywords = ["photo", "photo center", "photography"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in photo_keywords)

    @property
    def has_gas_station(self) -> bool:
        """Check if the store has a gas station."""
        gas_keywords = ["gas", "fuel", "gas station"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in gas_keywords)

    @property
    def has_curbside_pickup(self) -> bool:
        """Check if the store offers curbside pickup."""
        pickup_keywords = ["curbside", "curbside pickup", "pickup"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in pickup_keywords)

    @property
    def has_delivery(self) -> bool:
        """Check if the store offers delivery."""
        delivery_keywords = ["delivery", "home delivery", "shipt"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in delivery_keywords)

    @property
    def has_self_checkout(self) -> bool:
        """Check if the store has self-checkout."""
        checkout_keywords = ["self checkout", "self-checkout", "express checkout"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in checkout_keywords)

    @property
    def has_restaurant(self) -> bool:
        """Check if the store has a restaurant or food service."""
        restaurant_keywords = ["restaurant", "cafe", "food court", "dining"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in restaurant_keywords)

    @property
    def has_bank(self) -> bool:
        """Check if the store has a bank or financial services."""
        bank_keywords = ["bank", "atm", "financial", "credit union"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in bank_keywords)

    @property
    def has_optical(self) -> bool:
        """Check if the store has optical services."""
        optical_keywords = ["optical", "eyewear", "glasses", "contacts"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in optical_keywords)

    @property
    def has_automotive(self) -> bool:
        """Check if the store has automotive services."""
        auto_keywords = ["automotive", "tire", "oil change", "car care"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in auto_keywords)

    @property
    def open_24_hours(self) -> bool:
        """Check if the store is open 24 hours."""
        if not self.has_hours:
            return False
        return "24" in self.hours or "24 hour" in self.hours.lower()

    @property
    def open_late(self) -> bool:
        """Check if the store is open late (past 10 PM)."""
        if not self.has_hours:
            return False
        return any(time in self.hours for time in ["11", "12", "1 AM", "2 AM", "3 AM"])

    @property
    def open_early(self) -> bool:
        """Check if the store opens early (before 7 AM)."""
        if not self.has_hours:
            return False
        return any(time in self.hours for time in ["5", "6", "7 AM"])

    @property
    def store_type(self) -> str:
        """Get the type of store based on services."""
        if self.has_gas_station:
            return "Supercenter with Gas"
        elif self.has_pharmacy:
            return "Supercenter"
        elif self.service_count > 5:
            return "Full Service Store"
        elif self.service_count > 2:
            return "Standard Store"
        else:
            return "Basic Store"

    @property
    def convenience_score(self) -> int:
        """Get a convenience score based on available services (0-100)."""
        score = 0
        
        # Core services
        if self.has_pharmacy:
            score += 20
        if self.has_photo_center:
            score += 15
        if self.has_gas_station:
            score += 15
        if self.has_curbside_pickup:
            score += 10
        if self.has_delivery:
            score += 10
        
        # Additional services
        if self.has_restaurant:
            score += 8
        if self.has_bank:
            score += 7
        if self.has_optical:
            score += 5
        if self.has_automotive:
            score += 5
        if self.has_self_checkout:
            score += 5
        
        # Hours convenience
        if self.open_24_hours:
            score += 20
        elif self.open_late:
            score += 10
        elif self.open_early:
            score += 5
        
        return min(score, 100)

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "storeId": self.store_id,
            "name": self.name,
            "address": self.address,
            "city": self.city,
            "state": self.state,
            "zipCode": self.zip_code,
            "phone": self.phone,
            "hours": self.hours,
            "latitude": self.latitude,
            "longitude": self.longitude,
            "distance": self.distance,
            "isOpen": self.is_open,
            "services": self.services,
        }
        # Remove None values
        return {k: v for k, v in result.items() if v is not None}


@dataclass
class SearchResult:
    """Represents a search result from Meijer's product search."""

    total_results: int
    results: List[MeijerItem]
    current_page: int
    total_pages: int
    query: str
    filters: Dict[str, Any] = field(default_factory=dict)
    sort_by: str = "relevance"
    raw_data: Optional[Dict[str, Any]] = None

    @property
    def has_results(self) -> bool:
        """Check if there are any search results."""
        return len(self.results) > 0

    @property
    def is_last_page(self) -> bool:
        """Check if this is the last page of results."""
        return self.current_page >= self.total_pages

    @property
    def first_page(self) -> bool:
        """Check if this is the first page of results."""
        return self.current_page == 1

    @property
    def has_multiple_pages(self) -> bool:
        """Check if there are multiple pages of results."""
        return self.total_pages > 1

    @property
    def next_page_number(self) -> Optional[int]:
        """Get the next page number, or None if on last page."""
        if self.is_last_page:
            return None
        return self.current_page + 1

    @property
    def previous_page_number(self) -> Optional[int]:
        """Get the previous page number, or None if on first page."""
        if self.first_page:
            return None
        return self.current_page - 1

    @property
    def results_count(self) -> int:
        """Get the number of results on the current page."""
        return len(self.results)

    @property
    def has_filters(self) -> bool:
        """Check if any filters are applied to the search."""
        return len(self.filters) > 0

    @property
    def filter_count(self) -> int:
        """Get the number of active filters."""
        return len(self.filters)

    @property
    def sorted_by_relevance(self) -> bool:
        """Check if results are sorted by relevance."""
        return self.sort_by.lower() == "relevance"

    @property
    def sorted_by_price(self) -> bool:
        """Check if results are sorted by price."""
        return "price" in self.sort_by.lower()

    @property
    def sorted_by_name(self) -> bool:
        """Check if results are sorted by name."""
        return "name" in self.sort_by.lower() or "title" in self.sort_by.lower()

    @property
    def sorted_by_popularity(self) -> bool:
        """Check if results are sorted by popularity."""
        return "popular" in self.sort_by.lower() or "trending" in self.sort_by.lower()

    @property
    def has_price_range(self) -> bool:
        """Check if there's a price range filter applied."""
        return "price" in self.filters or "price_range" in self.filters

    @property
    def has_category_filter(self) -> bool:
        """Check if there's a category filter applied."""
        return "category" in self.filters or "department" in self.filters

    @property
    def has_brand_filter(self) -> bool:
        """Check if there's a brand filter applied."""
        return "brand" in self.filters

    @property
    def has_availability_filter(self) -> bool:
        """Check if there's an availability filter applied."""
        return "availability" in self.filters or "in_stock" in self.filters

    @property
    def results_with_prices(self) -> List["MeijerItem"]:
        """Get results that have price information."""
        return [item for item in self.results if item.price is not None]

    @property
    def results_on_sale(self) -> List["MeijerItem"]:
        """Get results that are currently on sale."""
        return [item for item in self.results if item.on_sale]

    @property
    def results_with_images(self) -> List["MeijerItem"]:
        """Get results that have images available."""
        return [item for item in self.results if item.has_image]

    @property
    def results_in_stock(self) -> List["MeijerItem"]:
        """Get results that are currently in stock."""
        return [item for item in self.results if item.is_available]

    @property
    def price_range(self) -> tuple[Optional[float], Optional[float]]:
        """Get the min and max prices from current results."""
        prices = [item.price for item in self.results if item.price is not None]
        if not prices:
            return (None, None)
        return (min(prices), max(prices))

    @property
    def average_price(self) -> Optional[float]:
        """Get the average price of current results."""
        prices = [item.price for item in self.results if item.price is not None]
        if not prices:
            return None
        return sum(prices) / len(prices)

    @property
    def categories_represented(self) -> List[str]:
        """Get unique categories represented in current results."""
        categories = [item.category for item in self.results if item.category]
        return list(set(categories))

    @property
    def brands_represented(self) -> List[str]:
        """Get unique brands represented in current results."""
        brands = [item.brand for item in self.results if item.brand]
        return list(set(brands))

    @property
    def search_summary(self) -> str:
        """Get a human-readable summary of the search results."""
        if not self.has_results:
            return f"No results found for '{self.query}'"
        
        if self.has_multiple_pages:
            return f"Found {self.total_results} results for '{self.query}' (page {self.current_page} of {self.total_pages})"
        else:
            return f"Found {self.total_results} results for '{self.query}'"

    @property
    def pagination_info(self) -> str:
        """Get pagination information as a string."""
        if not self.has_multiple_pages:
            return "Single page of results"
        
        return f"Page {self.current_page} of {self.total_pages} ({self.results_count} results per page)"

    @property
    def sort_description(self) -> str:
        """Get a human-readable description of the current sort order."""
        sort_descriptions = {
            "relevance": "Most relevant first",
            "price": "Price: low to high",
            "price_desc": "Price: high to low",
            "name": "Name: A to Z",
            "name_desc": "Name: Z to A",
            "popularity": "Most popular first",
            "newest": "Newest first",
            "rating": "Highest rated first"
        }
        
        return sort_descriptions.get(self.sort_by.lower(), f"Sorted by: {self.sort_by}")

    @property
    def filter_summary(self) -> str:
        """Get a summary of applied filters."""
        if not self.has_filters:
            return "No filters applied"
        
        filter_names = list(self.filters.keys())
        if len(filter_names) == 1:
            return f"Filtered by: {filter_names[0]}"
        elif len(filter_names) <= 3:
            return f"Filtered by: {', '.join(filter_names)}"
        else:
            return f"Filtered by {len(filter_names)} criteria"

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        return {
            "totalResults": self.total_results,
            "results": [item.to_dict() for item in self.results],
            "currentPage": self.current_page,
            "totalPages": self.total_pages,
            "query": self.query,
            "filters": self.filters,
            "sortBy": self.sort_by,
        }


def create_meijer_items_from_search(
    search_data: Dict[str, Any], client: Optional[Any] = None
) -> List[MeijerItem]:
    """
    Create a list of MeijerItem objects from Constructor.io search response.

    Parameters
    ----------
    search_data : Dict[str, Any]
        Raw search response data from Constructor.io
    client : Any, optional
        Meijer client for additional operations

    Returns
    -------
    List[MeijerItem]
        List of MeijerItem instances
    """
    items = []

    try:
        # Extract results from different possible response formats
        results = search_data.get("results", [])
        if not results:
            # Try alternative field names
            results = search_data.get("response", {}).get("results", [])

        for item_data in results:
            try:
                item = MeijerItem.from_constructor_response(item_data, client)
                items.append(item)
            except Exception as e:
                # Log error but continue processing other items
                import logging

                logger = logging.getLogger(__name__)
                logger.warning(f"Failed to create MeijerItem from data: {e}")
                continue

    except Exception as e:
        import logging

        logger = logging.getLogger(__name__)
        logger.error(f"Error processing search response: {e}")

    return items
