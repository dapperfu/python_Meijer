"""
Coupon models for Meijer API responses.

This module contains dataclasses for coupons and offers.
"""

from dataclasses import dataclass, field
from datetime import date
from typing import Any, Dict, List, Optional


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
