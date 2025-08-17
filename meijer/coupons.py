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

    # Try different possible field names for offers/coupons based on API response
    offers = []
    
    # From APK debug: API returns 'listOfCoupons' with 473 coupons
    if "listOfCoupons" in response_data:
        offers = response_data["listOfCoupons"]
    elif "offers" in response_data:
        offers = response_data["offers"]
    elif "data" in response_data:
        offers = response_data["data"]
    elif "coupons" in response_data:
        offers = response_data["coupons"]
    elif "offerCollection" in response_data:
        offers = response_data["offerCollection"]
    
    if meijer_client:
        meijer_client.logger.info(f"Parsing {len(offers)} coupons from API response")

    for offer_data in offers:
        try:
            # Handle nested offer structure - some responses have {offer: {...}, isClipped: ...}
            if "offer" in offer_data and isinstance(offer_data["offer"], dict):
                # Extract top-level status flags
                is_clipped = offer_data.get("isClipped", False)
                is_suggested = offer_data.get("isSuggested", False)
                is_targeted = offer_data.get("isTargeted", False)
                is_hidden = offer_data.get("isHidden", False)
                
                # Get actual offer data
                actual_offer = offer_data["offer"]
            else:
                # Direct offer structure
                is_clipped = offer_data.get("isClipped", False)
                is_suggested = offer_data.get("isSuggested", False)
                is_targeted = offer_data.get("isTargeted", False)
                is_hidden = offer_data.get("isHidden", False)
                actual_offer = offer_data

            # Extract core fields from actual offer data
            meijer_offer_id = int(
                actual_offer.get("meijerOfferId", actual_offer.get("id", 0))
            )
            title = actual_offer.get("title", actual_offer.get("name", "Unknown Offer"))
            description = actual_offer.get("description", actual_offer.get("desc", ""))

            # Parse dates from actual offer data
            redemption_start = None
            redemption_end = None

            if actual_offer.get("redemptionStartDate"):
                try:
                    redemption_start = datetime.fromisoformat(
                        actual_offer["redemptionStartDate"].replace("Z", "+00:00")
                    )
                except ValueError:
                    pass

            if actual_offer.get("redemptionEndDate"):
                try:
                    redemption_end = datetime.fromisoformat(
                        actual_offer["redemptionEndDate"].replace("Z", "+00:00")
                    )
                except ValueError:
                    pass

            # Create coupon using the extracted status flags and actual offer data
            coupon = MeijerCoupon(
                meijer_offer_id=meijer_offer_id,
                title=title,
                description=description,
                is_clipped=is_clipped,
                is_suggested=is_suggested,
                is_targeted=is_targeted,
                is_hidden=is_hidden,
                image_url=actual_offer.get("imageURL"),
                disclaimer=actual_offer.get("disclaimer"),
                redemption_start_date=redemption_start,
                redemption_end_date=redemption_end,
                redeem_amount=actual_offer.get("redeemAmount"),
                condition_value=actual_offer.get("conditionValue"),
                discount_type_id=actual_offer.get("discountTypeId", 0),
                condition_type_id=actual_offer.get("conditionTypeId", 0),
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
    """Clip a coupon by ID using APK-discovered endpoint structure."""
    try:
        if not client._ensure_authenticated():
            raise MeijerAuthenticationError("Authentication required")

        url = f"{client.api_base_url}/loyalty/mPerks/api/offers/Clip"
        headers = client._get_api_headers()
        
        # Use APK-discovered headers from Zk/b.java
        headers.update({
            "Accept": "application/vnd.meijer.digitalmperks.clip-v1.0+json",
            "Content-Type": "application/vnd.meijer.digitalmperks.clip-v1.0+json"
        })

        # Use APK-discovered request body structure (ClipUnclipCouponRequest)
        data = {
            "meijerOfferId": coupon_id,  # Long - the coupon's meijerOfferId (not offerId)
            "storeId": 0,  # Int - store ID, 0 for any store
            "cartIsActive": False  # Boolean - whether shopping cart is active
        }
        
        response = client._make_request("POST", url, headers=headers, json_data=data)

        # Check for success based on APK-discovered response structure
        if response.status_code in [200, 201]:
            try:
                response_json = response.json()
                # APK shows ClipUnclipCouponResponse has 'result' field
                return response_json.get("result", "").lower() == "success"
            except Exception:
                # Fallback to status code check
                return True
        
        return False

    except Exception as e:
        client.logger.error(f"Failed to clip coupon {coupon_id}: {e}")
        return False


def unclip_coupon(client: "Meijer", coupon_id: int) -> bool:
    """Unclip a coupon by ID using APK-discovered endpoint structure."""
    try:
        if not client._ensure_authenticated():
            raise MeijerAuthenticationError("Authentication required")

        url = f"{client.api_base_url}/loyalty/mPerks/api/offers/Unclip"
        headers = client._get_api_headers()
        
        # Use APK-discovered headers from Zk/b.java
        headers.update({
            "Accept": "application/vnd.meijer.digitalmperks.unclip-v1.0+json",
            "Content-Type": "application/vnd.meijer.digitalmperks.unclip-v1.0+json"
        })

        # Use APK-discovered request body structure (ClipUnclipCouponRequest)
        data = {
            "meijerOfferId": coupon_id,  # Long - the coupon's meijerOfferId (not offerId)
            "storeId": 0,  # Int - store ID, 0 for any store  
            "cartIsActive": False  # Boolean - whether shopping cart is active
        }
        
        response = client._make_request("POST", url, headers=headers, json_data=data)

        # Check for success based on APK-discovered response structure
        if response.status_code in [200, 201]:
            try:
                response_json = response.json()
                # APK shows ClipUnclipCouponResponse has 'result' field
                return response_json.get("result", "").lower() == "success"
            except Exception:
                # Fallback to status code check
                return True
        
        return False

    except Exception as e:
        client.logger.error(f"Failed to unclip coupon {coupon_id}: {e}")
        return False


class MeijerCouponManager:
    """
    Manager class for Meijer coupon operations.
    
    This class provides the interface that the main client expects
    for managing coupons and offers.
    """
    
    def __init__(self, meijer_client: "Meijer"):
        """
        Initialize the coupon manager.
        
        Args:
            meijer_client: The main Meijer client instance
        """
        self.meijer_client = meijer_client
        self.logger = meijer_client.logger
    
    def create_meijer_coupons_from_response(self, data: Dict[str, Any]) -> List["MeijerCoupon"]:
        """
        Create MeijerCoupon objects from API response data.
        
        Args:
            data: API response data containing coupon information
            
        Returns:
            List of MeijerCoupon objects
        """
        return create_meijer_coupons_from_response(data, self.meijer_client)
    
    def clip_coupon(self, coupon_id: int) -> bool:
        """
        Clip a coupon by ID.
        
        Args:
            coupon_id: The coupon ID to clip
            
        Returns:
            True if successful, False otherwise
        """
        return clip_coupon(self.meijer_client, coupon_id)
    
    def unclip_coupon(self, coupon_id: int) -> bool:
        """
        Unclip a coupon by ID.
        
        Args:
            coupon_id: The coupon ID to unclip
            
        Returns:
            True if successful, False otherwise
        """
        return unclip_coupon(self.meijer_client, coupon_id)
