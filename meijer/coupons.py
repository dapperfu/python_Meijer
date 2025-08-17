"""
Meijer Coupon Management
=======================

Coupon and offers functionality for the Meijer API client.
"""

from dataclasses import dataclass
from datetime import datetime
from enum import Enum
from typing import Any, Dict, List, Optional, TYPE_CHECKING

from .exceptions import MeijerAuthenticationError

if TYPE_CHECKING:
    from .client import Meijer


class HatColor(Enum):
    """Hat color enumeration based on APK analysis."""

    NONE = 0
    BLUE = 1
    RED = 2


class BorderColor(Enum):
    """Border color enumeration based on APK analysis."""

    NONE = 0
    BLUE = 1
    RED = 2


@dataclass
class CouponDepartment:
    """Represents a department/category for a coupon."""

    category_id: str
    category_name: str
    sub_category_id: Optional[str] = None
    sub_category_name: Optional[str] = None
    offer_count_sub_category: int = 0
    offer_count_department: int = 0
    is_custom_category: bool = False


@dataclass
class CouponCategory:
    """Represents a coupon category/segment."""

    segment_id: Optional[str] = None
    segment_name: Optional[str] = None


@dataclass
class CouponCondition:
    """Represents earning conditions for a coupon."""

    condition_type_id: int = 0
    condition_value: float = 0.0


@dataclass
class CouponReward:
    """Represents reward details for a coupon."""

    redeem_amount: Optional[float] = None
    discount_type_id: int = 0
    discount_level_id: int = 0
    reward_program_id: int = 0


@dataclass
class MeijerCoupon:
    """
    Comprehensive Meijer coupon/offer with all discovered fields.

    This class provides methods to clip() and unclip() coupons, as well as
    access to all coupon metadata discovered from API and APK analysis.
    """

    # Core identification
    meijer_offer_id: int
    title: str
    description: str

    # Status flags
    is_clipped: bool = False
    is_suggested: bool = False
    is_targeted: bool = False
    is_hidden: bool = False
    is_active: bool = True

    # Display elements
    image_url: Optional[str] = None
    disclaimer: Optional[str] = None
    hat_color: HatColor = HatColor.NONE
    border_color: BorderColor = BorderColor.NONE

    # Dates
    redemption_start_date: Optional[datetime] = None
    redemption_end_date: Optional[datetime] = None
    modified_ts: Optional[datetime] = None

    # Rewards and conditions
    redeem_amount: Optional[float] = None
    condition_value: Optional[float] = None
    discount_type_id: int = 0
    discount_level_id: int = 0
    condition_type_id: int = 0

    # Categories and departments
    departments: List[CouponDepartment] = None
    category: Optional[CouponCategory] = None

    # Reference to the client for API operations
    _meijer_client: Optional["Meijer"] = None

    def __post_init__(self):
        """Initialize default values."""
        if self.departments is None:
            self.departments = []

    def clip(self) -> bool:
        """Clip (activate) this coupon."""
        if not self._meijer_client:
            raise ValueError("No Meijer client available for coupon operations")

        try:
            success = self._meijer_client.clip_coupon(self)
            if success:
                self.is_clipped = True
            return success
        except Exception as e:
            self._meijer_client.logger.error(
                f"Failed to clip coupon {self.meijer_offer_id}: {e}"
            )
            return False

    def unclip(self) -> bool:
        """Unclip (deactivate) this coupon."""
        if not self._meijer_client:
            raise ValueError("No Meijer client available for coupon operations")

        try:
            success = self._meijer_client.unclip_coupon(self)
            if success:
                self.is_clipped = False
            return success
        except Exception as e:
            self._meijer_client.logger.error(
                f"Failed to unclip coupon {self.meijer_offer_id}: {e}"
            )
            return False

    @property
    def formatted_discount(self) -> str:
        """Get formatted discount string."""
        if self.redeem_amount:
            return f"${self.redeem_amount:.2f}"
        elif self.condition_value:
            return f"{self.condition_value}%"
        else:
            return "Special Offer"

    @property
    def is_expired(self) -> bool:
        """Check if coupon is expired."""
        if self.redemption_end_date:
            return datetime.now() > self.redemption_end_date
        return False


def create_meijer_coupons_from_response(
    response_data: Dict[str, Any], meijer_client: Optional["Meijer"] = None
) -> List[MeijerCoupon]:
    """
    Create MeijerCoupon objects from API response data.

    Args:
        response_data: Raw API response data
        meijer_client: Meijer client instance for coupon operations

    Returns:
        List of MeijerCoupon objects
    """
    coupons = []

    offers = response_data.get("offers", [])
    if not offers and "data" in response_data:
        offers = response_data["data"]

    for offer_data in offers:
        try:
            # Extract core fields
            meijer_offer_id = int(
                offer_data.get("meijerOfferId", offer_data.get("id", 0))
            )
            title = offer_data.get("title", offer_data.get("name", "Unknown Offer"))
            description = offer_data.get("description", offer_data.get("desc", ""))

            # Parse dates
            redemption_start = None
            redemption_end = None

            if offer_data.get("redemptionStartDate"):
                try:
                    redemption_start = datetime.fromisoformat(
                        offer_data["redemptionStartDate"].replace("Z", "+00:00")
                    )
                except ValueError:
                    pass

            if offer_data.get("redemptionEndDate"):
                try:
                    redemption_end = datetime.fromisoformat(
                        offer_data["redemptionEndDate"].replace("Z", "+00:00")
                    )
                except ValueError:
                    pass

            # Create coupon
            coupon = MeijerCoupon(
                meijer_offer_id=meijer_offer_id,
                title=title,
                description=description,
                is_clipped=offer_data.get("isClipped", False),
                is_suggested=offer_data.get("isSuggested", False),
                is_targeted=offer_data.get("isTargeted", False),
                is_hidden=offer_data.get("isHidden", False),
                image_url=offer_data.get("imageURL"),
                disclaimer=offer_data.get("disclaimer"),
                redemption_start_date=redemption_start,
                redemption_end_date=redemption_end,
                redeem_amount=offer_data.get("redeemAmount"),
                condition_value=offer_data.get("conditionValue"),
                discount_type_id=offer_data.get("discountTypeId", 0),
                condition_type_id=offer_data.get("conditionTypeId", 0),
                _meijer_client=meijer_client,
            )

            coupons.append(coupon)

        except Exception as e:
            if meijer_client:
                meijer_client.logger.warning(f"Failed to parse coupon data: {e}")
            continue

    return coupons


# Coupon management functions for the main client
def clip_coupon(client: "Meijer", coupon_id: int) -> bool:
    """Clip a coupon by ID."""
    try:
        if not client._ensure_authenticated():
            raise MeijerAuthenticationError("Authentication required")

        url = f"{client.api_base_url}/digital/mPerks/api/offers/clip"
        headers = client._get_api_headers()
        headers.update({"Content-Type": "application/json"})

        data = {"offerId": coupon_id}
        response = client._make_request("POST", url, headers=headers, json=data)

        return response.status_code == 200

    except Exception as e:
        client.logger.error(f"Failed to clip coupon {coupon_id}: {e}")
        return False


def unclip_coupon(client: "Meijer", coupon_id: int) -> bool:
    """Unclip a coupon by ID."""
    try:
        if not client._ensure_authenticated():
            raise MeijerAuthenticationError("Authentication required")

        url = f"{client.api_base_url}/digital/mPerks/api/offers/unclip"
        headers = client._get_api_headers()
        headers.update({"Content-Type": "application/json"})

        data = {"offerId": coupon_id}
        response = client._make_request("POST", url, headers=headers, json=data)

        return response.status_code == 200

    except Exception as e:
        client.logger.error(f"Failed to unclip coupon {coupon_id}: {e}")
        return False
