#!/usr/bin/env python3
"""
mPerks earned rewards functionality for Meijer API client.
Handles earned rewards, mCard info, and related mPerks operations.
"""

import logging
from dataclasses import dataclass
from datetime import datetime
from typing import Any, Dict, List, Optional

from .exceptions import MeijerAPIError


@dataclass
class EarnedReward:
    """Represents an earned reward from mPerks."""

    id: str
    title: str
    description: Optional[str] = None
    reward_type: Optional[str] = None
    points_required: Optional[int] = None
    points_earned: Optional[int] = None
    expiration_date: Optional[datetime] = None
    is_active: bool = True
    category: Optional[str] = None
    image_url: Optional[str] = None
    terms_conditions: Optional[str] = None
    raw_data: Optional[Dict[str, Any]] = None

    def __post_init__(self):
        if not self.title:
            self.title = self.description or "Unknown Reward"

    @property
    def is_expired(self) -> bool:
        """Check if the reward is expired."""
        if self.expiration_date is None:
            return False
        return datetime.now() > self.expiration_date

    @property
    def days_until_expiry(self) -> Optional[int]:
        """Get days until expiry, negative if expired."""
        if self.expiration_date is None:
            return None
        delta = self.expiration_date - datetime.now()
        return delta.days

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "id": self.id,
            "title": self.title,
            "description": self.description,
            "rewardType": self.reward_type,
            "pointsRequired": self.points_required,
            "pointsEarned": self.points_earned,
            "expirationDate": self.expiration_date.isoformat()
            if self.expiration_date
            else None,
            "isActive": self.is_active,
            "category": self.category,
            "imageUrl": self.image_url,
            "termsConditions": self.terms_conditions,
        }
        return {k: v for k, v in result.items() if v is not None}


@dataclass
class RewardCoupon:
    """Represents a reward coupon that can be purchased with points."""

    coupon_id: int
    name: str
    description: str
    point_cost: int
    image_url: Optional[str] = None
    display_start: Optional[datetime] = None
    display_end: Optional[datetime] = None
    terms_and_conditions: Optional[str] = None
    sort_order: Optional[int] = None
    reward_coupon_type: Optional[str] = None
    raw_data: Optional[Dict[str, Any]] = None

    @property
    def is_available(self) -> bool:
        """Check if the coupon is currently available for display."""
        now = datetime.now()
        if self.display_start and now < self.display_start:
            return False
        if self.display_end and now > self.display_end:
            return False
        return True

    @property
    def days_until_expiry(self) -> Optional[int]:
        """Get days until display expiry, negative if expired."""
        if self.display_end is None:
            return None
        delta = self.display_end - datetime.now()
        return delta.days

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "couponId": self.coupon_id,
            "name": self.name,
            "description": self.description,
            "imageUrl": self.image_url,
            "displayStart": self.display_start.isoformat()
            if self.display_start
            else None,
            "displayEnd": self.display_end.isoformat() if self.display_end else None,
            "termsAndConditions": self.terms_and_conditions,
            "pointCost": self.point_cost,
            "sortOrder": self.sort_order,
            "rewardCouponType": self.reward_coupon_type,
        }
        return {k: v for k, v in result.items() if v is not None}


@dataclass
class MCardInfo:
    """Represents mCard information from mPerks."""

    card_number: str
    card_type: Optional[str] = None
    balance: Optional[float] = None
    expiration_date: Optional[datetime] = None
    is_active: bool = True
    last_used: Optional[datetime] = None
    raw_data: Optional[Dict[str, Any]] = None

    @property
    def is_expired(self) -> bool:
        """Check if the mCard is expired."""
        if self.expiration_date is None:
            return False
        return datetime.now() > self.expiration_date

    @property
    def days_until_expiry(self) -> Optional[int]:
        """Get days until expiry, negative if expired."""
        if self.expiration_date is None:
            return None
        delta = self.expiration_date - datetime.now()
        return delta.days

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "cardNumber": self.card_number,
            "cardType": self.card_type,
            "balance": self.balance,
            "expirationDate": self.expiration_date.isoformat()
            if self.expiration_date
            else None,
            "isActive": self.is_active,
            "lastUsed": self.last_used.isoformat() if self.last_used else None,
        }
        return {k: v for k, v in result.items() if v is not None}


@dataclass
class PointBalance:
    """Represents mPerks point balance information."""

    total_points: int
    expiring_points: Optional[int] = None
    expiring_days: Optional[int] = None
    raw_data: Optional[Dict[str, Any]] = None

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "totalPoints": self.total_points,
            "expiringPoints": self.expiring_points,
            "expiringDays": self.expiring_days,
        }
        return {k: v for k, v in result.items() if v is not None}


@dataclass
class EarnableOffer:
    """Represents an offer that can be earned through mPerks."""

    offer_id: str
    title: str
    description: str
    category: str
    points_required: int
    points_earned: int
    status: str  # "available", "in_progress", "completed"
    progress_current: Optional[int] = None
    progress_target: Optional[int] = None
    start_date: Optional[datetime] = None
    end_date: Optional[datetime] = None
    image_url: Optional[str] = None
    terms_conditions: Optional[str] = None
    is_active: bool = True
    raw_data: Optional[Dict[str, Any]] = None

    @property
    def progress_percentage(self) -> Optional[float]:
        """Get progress percentage if applicable."""
        if self.progress_current is not None and self.progress_target is not None:
            return (self.progress_current / self.progress_target) * 100
        return None

    @property
    def is_expired(self) -> bool:
        """Check if the offer is expired."""
        if self.end_date is None:
            return False
        return datetime.now() > self.end_date

    @property
    def days_until_expiry(self) -> Optional[int]:
        """Get days until expiry, negative if expired."""
        if self.end_date is None:
            return None
        delta = self.end_date - datetime.now()
        return delta.days

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "offerId": self.offer_id,
            "title": self.title,
            "description": self.description,
            "category": self.category,
            "pointsRequired": self.points_required,
            "pointsEarned": self.points_earned,
            "status": self.status,
            "progressCurrent": self.progress_current,
            "progressTarget": self.progress_target,
            "startDate": self.start_date.isoformat() if self.start_date else None,
            "endDate": self.end_date.isoformat() if self.end_date else None,
            "imageUrl": self.image_url,
            "termsConditions": self.terms_conditions,
            "isActive": self.is_active,
        }
        return {k: v for k, v in result.items() if v is not None}


@dataclass
class EarnTabData:
    """Represents the data for the Earn tab with its sub-tabs."""

    in_progress_offers: List[EarnableOffer]
    available_offers: List[EarnableOffer]
    all_offers: List[EarnableOffer]
    total_in_progress: int
    total_available: int
    total_all: int
    last_updated: Optional[datetime] = None
    raw_data: Optional[Dict[str, Any]] = None

    def get_offers_by_category(self, category: str) -> List[EarnableOffer]:
        """Get offers filtered by category."""
        return [
            offer
            for offer in self.all_offers
            if offer.category.lower() == category.lower()
        ]

    def get_offers_by_status(self, status: str) -> List[EarnableOffer]:
        """Get offers filtered by status."""
        return [
            offer for offer in self.all_offers if offer.status.lower() == status.lower()
        ]

    def get_active_offers(self) -> List[EarnableOffer]:
        """Get only active offers."""
        return [
            offer
            for offer in self.all_offers
            if offer.is_active and not offer.is_expired
        ]


class MPerksEarnedRewards:
    """Handles mPerks earned rewards operations."""

    def __init__(self, meijer_client: Any):
        self.meijer = meijer_client
        self.logger = logging.getLogger(f"{__name__}.{self.__class__.__name__}")

        # mPerks earned rewards endpoints
        self.endpoints = {
            "earned_rewards": "/loyalty/mPerks/api/reward/earned",
            "mcard_info": "/loyalty/mPerks/api/reward/mCard/info",
            "available_rewards": "/loyalty/mPerks/api/rewards/available",
            "reward_categories": "/loyalty/mPerks/api/offers/Categories",
            # New mPerks v4 endpoints
            "reward_coupons_available": "/digital/mperks40/customer/v1/rewardcoupons/available",
            "reward_coupon_buy": "/digital/mperks40/customer/v1/rewardcoupons/available/{coupon_id}/buy",
            "point_balance": "/digital/mperks40/customer/v1/pointbalance",
            "points_expiring": "/digital/mperks40/customer/v1/points/expiring",
            # Earn tab endpoints
            "earn_offers": "/digital/mperks40/customer/v1/earn/offers",
            "earn_offers_in_progress": "/digital/mperks40/customer/v1/earn/offers/in-progress",
            "earn_offers_available": "/digital/mperks40/customer/v1/earn/offers/available",
            "earn_offers_all": "/digital/mperks40/customer/v1/earn/offers/all",
        }

    def get_earned_rewards(self, **kwargs) -> List[EarnedReward]:
        """
        Get earned rewards from mPerks.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of EarnedReward objects

        Raises:
            MeijerAPIError: If the API request fails
        """
        try:
            url = f"{self.meijer.api_base_url}{self.endpoints['earned_rewards']}"

            # Get default headers and merge with custom ones
            headers = self.meijer._get_api_headers()
            headers.update(
                {
                    "Accept": "application/vnd.meijer.digitalmperks.earnedrewards-v1.0+json",
                    "Content-Type": "application/json",
                }
            )

            response = self.meijer._make_request("POST", url, headers=headers, **kwargs)

            if response.status_code == 200:
                data = response.json()
                return self._parse_earned_rewards_response(data)
            else:
                raise MeijerAPIError(
                    f"Failed to get earned rewards: {response.status_code} - {response.text}"
                )

        except Exception as e:
            self.logger.error(f"Error getting earned rewards: {e}")
            return []  # Return empty list on failure instead of raising exception

    def get_mcard_info(self, **kwargs) -> MCardInfo:
        """
        Get mCard information from mPerks.

        Args:
            **kwargs: Additional query parameters

        Returns:
            MCardInfo object

        Raises:
            MeijerAPIError: If the API request fails
        """
        try:
            url = f"{self.meijer.api_base_url}{self.endpoints['mcard_info']}"

            # Get default headers and merge with custom ones
            headers = self.meijer._get_api_headers()
            headers.update(
                {"Accept": "application/vnd.meijer.digitalmperks.mcardinfo-v1.0+json"}
            )

            response = self.meijer._make_request("GET", url, headers=headers, **kwargs)

            if response.status_code == 200:
                data = response.json()
                return self._parse_mcard_info_response(data)
            else:
                raise MeijerAPIError(
                    f"Failed to get mCard info: {response.status_code} - {response.text}"
                )

        except Exception as e:
            self.logger.error(f"Error getting mCard info: {e}")
            return None  # Return None on failure instead of raising exception

    def get_available_rewards(self, **kwargs) -> List[EarnedReward]:
        """
        Get available rewards that can be earned.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of EarnedReward objects

        Raises:
            MeijerAPIError: If the API request fails
        """
        try:
            url = f"{self.meijer.api_base_url}{self.endpoints['available_rewards']}"

            # Get default headers and merge with custom ones
            headers = self.meijer._get_api_headers()
            headers.update(
                {"Accept": "application/vnd.meijer.digitalmperks.offers-v1.0+json"}
            )

            response = self.meijer._make_request("GET", url, headers=headers, **kwargs)

            if response.status_code == 200:
                data = response.json()
                return self._parse_available_rewards_response(data)
            else:
                raise MeijerAPIError(
                    f"Failed to get available rewards: {response.status_code} - {response.text}"
                )

        except Exception as e:
            self.logger.error(f"Error getting available rewards: {e}")
            return []  # Return empty list on failure instead of raising exception

    def get_reward_categories(
        self, clip_filter: str = "unclippedonly", **kwargs
    ) -> List[str]:
        """
        Get available reward categories.

        Args:
            clip_filter: Filter for clipped/unclipped offers ("clippedonly", "unclippedonly")
            **kwargs: Additional query parameters

        Returns:
            List of category names

        Raises:
            MeijerAPIError: If the API request fails
        """
        try:
            url = f"{self.meijer.api_base_url}{self.endpoints['reward_categories']}"

            # Get default headers and merge with custom ones
            headers = self.meijer._get_api_headers()
            headers.update(
                {"Accept": "application/vnd.meijer.digitalmperks.categories-v1.0+json"}
            )

            # Add required clipFilter parameter
            params = {"clipFilter": clip_filter}
            params.update(kwargs)

            response = self.meijer._make_request(
                "GET", url, headers=headers, params=params, **kwargs
            )

            if response.status_code == 200:
                data = response.json()
                return self._parse_categories_response(data)
            else:
                raise MeijerAPIError(
                    f"Failed to get reward categories: {response.status_code} - {response.text}"
                )

        except Exception as e:
            self.logger.error(f"Error getting reward categories: {e}")
            return []  # Return empty list on failure instead of raising exception

    def get_available_reward_coupons(self, **kwargs) -> List[RewardCoupon]:
        """
        Get available reward coupons that can be purchased with points.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of RewardCoupon objects

        Raises:
            MeijerAPIError: If the API request fails
        """
        try:
            url = f"{self.meijer.api_base_url}{self.endpoints['reward_coupons_available']}"

            # Get default headers
            headers = self.meijer._get_api_headers()

            response = self.meijer._make_request("GET", url, headers=headers, **kwargs)

            if response.status_code == 200:
                data = response.json()
                return self._parse_reward_coupons_response(data)
            else:
                raise MeijerAPIError(
                    f"Failed to get available reward coupons: {response.status_code} - {response.text}"
                )

        except Exception as e:
            self.logger.error(f"Error getting available reward coupons: {e}")
            return []

    def buy_reward_coupon(
        self, coupon_id: int, store_id: int, cart_is_active: bool = True, **kwargs
    ) -> bool:
        """
        Purchase a reward coupon with points.

        Args:
            coupon_id: ID of the coupon to purchase
            store_id: Store ID where the coupon will be used
            cart_is_active: Whether the cart is currently active
            **kwargs: Additional request parameters

        Returns:
            True if purchase was successful, False otherwise

        Raises:
            MeijerAPIError: If the API request fails
        """
        try:
            url = f"{self.meijer.api_base_url}{self.endpoints['reward_coupon_buy'].format(coupon_id=coupon_id)}"

            # Get default headers
            headers = self.meijer._get_api_headers()
            headers.update({"Content-Type": "application/json; charset=UTF-8"})

            # Prepare request body
            request_body = {"storeId": store_id, "cartIsActive": cart_is_active}
            request_body.update(kwargs)

            response = self.meijer._make_request(
                "POST", url, headers=headers, json=request_body
            )

            if response.status_code == 200:
                data = response.json()
                success = data.get("success", False)
                if success:
                    self.logger.info(
                        f"Successfully purchased reward coupon {coupon_id}"
                    )
                    return True
                else:
                    self.logger.warning(
                        f"Failed to purchase reward coupon {coupon_id}: {data}"
                    )
                    return False
            else:
                raise MeijerAPIError(
                    f"Failed to buy reward coupon: {response.status_code} - {response.text}"
                )

        except Exception as e:
            self.logger.error(f"Error buying reward coupon {coupon_id}: {e}")
            return False

    def get_point_balance(self, **kwargs) -> Optional[PointBalance]:
        """
        Get current mPerks point balance.

        Args:
            **kwargs: Additional query parameters

        Returns:
            PointBalance object or None if failed

        Raises:
            MeijerAPIError: If the API request fails
        """
        try:
            url = f"{self.meijer.api_base_url}{self.endpoints['point_balance']}"

            # Get default headers
            headers = self.meijer._get_api_headers()

            response = self.meijer._make_request("GET", url, headers=headers, **kwargs)

            if response.status_code == 200:
                data = response.json()
                return self._parse_point_balance_response(data)
            else:
                raise MeijerAPIError(
                    f"Failed to get point balance: {response.status_code} - {response.text}"
                )

        except Exception as e:
            self.logger.error(f"Error getting point balance: {e}")
            return None

    def get_points_expiring(
        self, days: int = 30, **kwargs
    ) -> Optional[List[Dict[str, Any]]]:
        """
        Get points that are expiring soon.

        Args:
            days: Number of days to look ahead for expiring points
            **kwargs: Additional query parameters

        Returns:
            List of expiring points data or None if failed

        Raises:
            MeijerAPIError: If the API request fails
        """
        try:
            url = f"{self.meijer.api_base_url}{self.endpoints['points_expiring']}"

            # Get default headers
            headers = self.meijer._get_api_headers()

            # Add days parameter
            params = {"days": days}
            params.update(kwargs)

            response = self.meijer._make_request(
                "GET", url, headers=headers, params=params
            )

            if response.status_code == 200:
                data = response.json()
                if data.get("success", False):
                    return data.get("payload", [])
                else:
                    self.logger.warning(f"Failed to get expiring points: {data}")
                    return []
            else:
                raise MeijerAPIError(
                    f"Failed to get expiring points: {response.status_code} - {response.text}"
                )

        except Exception as e:
            self.logger.error(f"Error getting expiring points: {e}")
            return None

    def find_reward_coupon_by_name(self, name: str, **kwargs) -> Optional[RewardCoupon]:
        """
        Find a specific reward coupon by name.

        Args:
            name: Name of the coupon to find
            **kwargs: Additional parameters for get_available_reward_coupons

        Returns:
            RewardCoupon object if found, None otherwise
        """
        try:
            coupons = self.get_available_reward_coupons(**kwargs)
            for coupon in coupons:
                if name.lower() in coupon.name.lower():
                    return coupon
            return None
        except Exception as e:
            self.logger.error(f"Error finding reward coupon by name '{name}': {e}")
            return None

    def get_cms_content(self, content_type: str = "home") -> Optional[Dict[str, Any]]:
        """
        Get CMS content for mPerks (banners, promotions, etc.).

        Args:
            content_type: Type of content to retrieve (home, specialoffers, etc.)

        Returns:
            CMS content data or None if failed
        """
        try:
            endpoint = f"/loyalty/mPerks/api/cms/{content_type}/content"
            response = self.meijer._make_request(
                "GET", f"{self.meijer.api_base_url}{endpoint}"
            )

            if response and response.status_code == 200:
                return response.json()
            else:
                self.logger.warning(
                    f"Failed to get CMS content: {response.status_code if response else 'No response'}"
                )
                return None

        except Exception as e:
            self.logger.error(f"Error getting CMS content: {e}")
            return None

    def get_special_offers_image(self, image_path: str) -> Optional[str]:
        """
        Get special offers image URL.

        Args:
            image_path: Path to the image

        Returns:
            Full image URL or None if failed
        """
        try:
            endpoint = "/loyalty/mPerks/api/cms/specialoffers/image"
            response = self.meijer._make_request(
                "GET", f"{self.meijer.api_base_url}{endpoint}"
            )

            if response and response.status_code == 200:
                return response.json().get("imageUrl")
            else:
                self.logger.warning(
                    f"Failed to get special offers image: {response.status_code if response else 'No response'}"
                )
                return None

        except Exception as e:
            self.logger.error(f"Error getting special offers image: {e}")
            return None

    def get_email_verification_spiffs(self) -> List[Dict[str, Any]]:
        """
        Get email verification special offers.

        Returns:
            List of email verification offers
        """
        try:
            endpoint = "/loyalty/mPerks/api/customer/EmailVerificationSpiffs"
            response = self.meijer._make_request(
                "GET", f"{self.meijer.api_base_url}{endpoint}"
            )

            if response and response.status_code == 200:
                data = response.json()
                return data.get("offers", [])
            else:
                self.logger.warning(
                    f"Failed to get email verification spiffs: {response.status_code if response else 'No response'}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Error getting email verification spiffs: {e}")
            return []

    def _parse_earned_rewards_response(
        self, data: Dict[str, Any]
    ) -> List[EarnedReward]:
        """Parse earned rewards response from API."""
        rewards = []

        try:
            # Handle different response structures
            if "earnedRewards" in data:
                rewards_data = data["earnedRewards"]
            elif "rewards" in data:
                rewards_data = data["rewards"]
            elif isinstance(data, list):
                rewards_data = data
            else:
                self.logger.warning(
                    f"Unexpected earned rewards response structure: {data.keys()}"
                )
                return []

            for reward_data in rewards_data:
                try:
                    reward = EarnedReward(
                        id=str(reward_data.get("id", "")),
                        title=reward_data.get("title", ""),
                        description=reward_data.get("description"),
                        reward_type=reward_data.get("rewardType"),
                        points_required=reward_data.get("pointsRequired"),
                        points_earned=reward_data.get("pointsEarned"),
                        expiration_date=self._parse_datetime(
                            reward_data.get("expirationDate")
                        ),
                        is_active=reward_data.get("isActive", True),
                        category=reward_data.get("category"),
                        image_url=reward_data.get("imageUrl"),
                        terms_conditions=reward_data.get("termsConditions"),
                        raw_data=reward_data,
                    )
                    rewards.append(reward)
                except Exception as e:
                    self.logger.warning(f"Error parsing reward: {e}")
                    continue

        except Exception as e:
            self.logger.error(f"Error parsing earned rewards response: {e}")

        return rewards

    def _parse_mcard_info_response(self, data: Dict[str, Any]) -> MCardInfo:
        """Parse mCard info response from API."""
        try:
            # Handle different response structures
            if "mCardInfo" in data:
                card_data = data["mCardInfo"]
            elif "card" in data:
                card_data = data["card"]
            else:
                card_data = data

            return MCardInfo(
                card_number=str(card_data.get("cardNumber", "")),
                card_type=card_data.get("cardType"),
                balance=card_data.get("balance"),
                expiration_date=self._parse_datetime(card_data.get("expirationDate")),
                is_active=card_data.get("isActive", True),
                last_used=self._parse_datetime(card_data.get("lastUsed")),
                raw_data=card_data,
            )

        except Exception as e:
            self.logger.error(f"Error parsing mCard info response: {e}")
            raise MeijerAPIError(f"Failed to parse mCard info: {e}")

    def _parse_available_rewards_response(
        self, data: Dict[str, Any]
    ) -> List[EarnedReward]:
        """Parse available rewards response from API."""
        rewards = []

        try:
            # Handle different response structures
            if "availableRewards" in data:
                rewards_data = data["availableRewards"]
            elif "rewards" in data:
                rewards_data = data["rewards"]
            elif isinstance(data, list):
                rewards_data = data
            else:
                self.logger.warning(
                    f"Unexpected available rewards response structure: {data.keys()}"
                )
                return []

            for reward_data in rewards_data:
                try:
                    reward = EarnedReward(
                        id=str(reward_data.get("id", "")),
                        title=reward_data.get("title", ""),
                        description=reward_data.get("description"),
                        reward_type=reward_data.get("rewardType"),
                        points_required=reward_data.get("pointsRequired"),
                        points_earned=reward_data.get("pointsEarned"),
                        expiration_date=self._parse_datetime(
                            reward_data.get("expirationDate")
                        ),
                        is_active=reward_data.get("isActive", True),
                        category=reward_data.get("category"),
                        image_url=reward_data.get("imageUrl"),
                        terms_conditions=reward_data.get("termsConditions"),
                        raw_data=reward_data,
                    )
                    rewards.append(reward)
                except Exception as e:
                    self.logger.warning(f"Error parsing available reward: {e}")
                    continue

        except Exception as e:
            self.logger.error(f"Error parsing available rewards response: {e}")

        return rewards

    def _parse_reward_coupons_response(
        self, data: Dict[str, Any]
    ) -> List[RewardCoupon]:
        """Parse reward coupons response from API."""
        coupons = []

        try:
            # Handle different response structures
            if "availableRewardCoupons" in data:
                coupons_data = data["availableRewardCoupons"]
            elif "rewardCoupons" in data:
                coupons_data = data["rewardCoupons"]
            elif isinstance(data, list):
                coupons_data = data
            else:
                self.logger.warning(
                    f"Unexpected reward coupons response structure: {data.keys()}"
                )
                return []

            for coupon_data in coupons_data:
                try:
                    coupon = RewardCoupon(
                        coupon_id=int(coupon_data.get("couponId", 0)),
                        name=coupon_data.get("name", ""),
                        description=coupon_data.get("description", ""),
                        image_url=coupon_data.get("imageUrl"),
                        display_start=self._parse_datetime(
                            coupon_data.get("displayStart")
                        ),
                        display_end=self._parse_datetime(coupon_data.get("displayEnd")),
                        terms_and_conditions=coupon_data.get("termsAndConditions"),
                        point_cost=int(coupon_data.get("pointCost", 0)),
                        sort_order=coupon_data.get("sortOrder"),
                        reward_coupon_type=coupon_data.get("rewardCouponType"),
                        raw_data=coupon_data,
                    )
                    coupons.append(coupon)
                except Exception as e:
                    self.logger.warning(f"Error parsing reward coupon: {e}")
                    continue

        except Exception as e:
            self.logger.error(f"Error parsing reward coupons response: {e}")

        return coupons

    def _parse_point_balance_response(self, data: Dict[str, Any]) -> PointBalance:
        """Parse point balance response from API."""
        try:
            if data.get("success", False):
                payload = data.get("payload", {})
                return PointBalance(
                    total_points=int(payload.get("totalPoints", 0)),
                    expiring_points=payload.get("expiringPoints"),
                    expiring_days=payload.get("expiringDays"),
                    raw_data=data,
                )
            else:
                raise MeijerAPIError(f"Failed to get point balance: {data}")
        except Exception as e:
            self.logger.error(f"Error parsing point balance response: {e}")
            raise MeijerAPIError(f"Failed to parse point balance: {e}")

    def _parse_categories_response(self, data: Dict[str, Any]) -> List[str]:
        """Parse categories response from API."""
        try:
            # Handle different response structures
            if "categories" in data:
                categories_data = data["categories"]
            elif "rewardCategories" in data:
                categories_data = data["rewardCategories"]
            elif isinstance(data, list):
                categories_data = data
            else:
                self.logger.warning(
                    f"Unexpected categories response structure: {data.keys()}"
                )
                return []

            categories = []
            for category_data in categories_data:
                if isinstance(category_data, str):
                    categories.append(category_data)
                elif isinstance(category_data, dict):
                    category_name = category_data.get("name") or category_data.get(
                        "title"
                    )
                    if category_name:
                        categories.append(category_name)

            return categories

        except Exception as e:
            self.logger.error(f"Error parsing categories response: {e}")
            return []

    def _parse_datetime(self, date_string: Optional[str]) -> Optional[datetime]:
        """Parse datetime string from API response."""
        if not date_string:
            return None

        try:
            # Try common datetime formats
            for fmt in [
                "%Y-%m-%dT%H:%M:%S.%fZ",
                "%Y-%m-%dT%H:%M:%SZ",
                "%Y-%m-%d",
                "%Y-%m-%d %H:%M:%S",
            ]:
                try:
                    return datetime.strptime(date_string, fmt)
                except ValueError:
                    continue

            # If none work, return None
            self.logger.warning(f"Could not parse datetime: {date_string}")
            return None

        except Exception as e:
            self.logger.warning(f"Error parsing datetime {date_string}: {e}")
            return None

    def get_earn_offers(self, **kwargs) -> EarnTabData:
        """
        Get all earn offers data including in-progress, available, and all offers.

        Args:
            **kwargs: Additional query parameters

        Returns:
            EarnTabData object containing all earn tab information

        Raises:
            MeijerAPIError: If the API request fails
        """
        try:
            url = f"{self.meijer.api_base_url}{self.endpoints['earn_offers']}"

            headers = self.meijer._get_api_headers()
            headers.update(
                {
                    "Accept": "application/vnd.meijer.digitalmperks.earnoffers-v1.0+json",
                    "Content-Type": "application/json",
                }
            )

            response = self.meijer._make_request("GET", url, headers=headers, **kwargs)

            if response.status_code == 200:
                data = response.json()
                return self._parse_earn_offers_response(data)
            else:
                raise MeijerAPIError(
                    f"Failed to get earn offers: {response.status_code} - {response.text}"
                )

        except Exception as e:
            self.logger.error(f"Error getting earn offers: {e}")
            # Return empty EarnTabData on failure
            return EarnTabData(
                in_progress_offers=[],
                available_offers=[],
                all_offers=[],
                total_in_progress=0,
                total_available=0,
                total_all=0,
            )

    def get_earn_offers_in_progress(self, **kwargs) -> List[EarnableOffer]:
        """
        Get only in-progress earn offers.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of EarnableOffer objects that are in progress

        Raises:
            MeijerAPIError: If the API request fails
        """
        try:
            url = (
                f"{self.meijer.api_base_url}{self.endpoints['earn_offers_in_progress']}"
            )

            headers = self.meijer._get_api_headers()
            headers.update(
                {
                    "Accept": "application/vnd.meijer.digitalmperks.earnoffers-v1.0+json",
                    "Content-Type": "application/json",
                }
            )

            response = self.meijer._make_request("GET", url, headers=headers, **kwargs)

            if response.status_code == 200:
                data = response.json()
                return self._parse_earnable_offers_response(data)
            else:
                raise MeijerAPIError(
                    f"Failed to get in-progress earn offers: {response.status_code} - {response.text}"
                )

        except Exception as e:
            self.logger.error(f"Error getting in-progress earn offers: {e}")
            return []

    def get_earn_offers_available(self, **kwargs) -> List[EarnableOffer]:
        """
        Get only available earn offers.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of EarnableOffer objects that are available

        Raises:
            MeijerAPIError: If the API request fails
        """
        try:
            url = f"{self.meijer.api_base_url}{self.endpoints['earn_offers_available']}"

            headers = self.meijer._get_api_headers()
            headers.update(
                {
                    "Accept": "application/vnd.meijer.digitalmperks.earnoffers-v1.0+json",
                    "Content-Type": "application/json",
                }
            )

            response = self.meijer._make_request("GET", url, headers=headers, **kwargs)

            if response.status_code == 200:
                data = response.json()
                return self._parse_earnable_offers_response(data)
            else:
                raise MeijerAPIError(
                    f"Failed to get available earn offers: {response.status_code} - {response.text}"
                )

        except Exception as e:
            self.logger.error(f"Error getting available earn offers: {e}")
            return []

    def get_earn_offers_all(self, **kwargs) -> List[EarnableOffer]:
        """
        Get all earn offers regardless of status.

        Args:
            **kwargs: Additional query parameters

        Returns:
            List of all EarnableOffer objects

        Raises:
            MeijerAPIError: If the API request fails
        """
        try:
            url = f"{self.meijer.api_base_url}{self.endpoints['earn_offers_all']}"

            headers = self.meijer._get_api_headers()
            headers.update(
                {
                    "Accept": "application/vnd.meijer.digitalmperks.earnoffers-v1.0+json",
                    "Content-Type": "application/json",
                }
            )

            response = self.meijer._make_request("GET", url, headers=headers, **kwargs)

            if response.status_code == 200:
                data = response.json()
                return self._parse_earnable_offers_response(data)
            else:
                raise MeijerAPIError(
                    f"Failed to get all earn offers: {response.status_code} - {response.text}"
                )

        except Exception as e:
            self.logger.error(f"Error getting all earn offers: {e}")
            return []

    def _parse_earn_offers_response(self, data: Dict[str, Any]) -> EarnTabData:
        """Parse earn offers response from API."""
        try:
            # Handle different response structures
            in_progress = self._parse_earnable_offers_response(
                data.get("inProgressOffers", [])
            )
            available = self._parse_earnable_offers_response(
                data.get("availableOffers", [])
            )
            all_offers = self._parse_earnable_offers_response(data.get("allOffers", []))

            return EarnTabData(
                in_progress_offers=in_progress,
                available_offers=available,
                all_offers=all_offers,
                total_in_progress=len(in_progress),
                total_available=len(available),
                total_all=len(all_offers),
                last_updated=self._parse_datetime(data.get("lastUpdated")),
                raw_data=data,
            )

        except Exception as e:
            self.logger.error(f"Error parsing earn offers response: {e}")
            return EarnTabData(
                in_progress_offers=[],
                available_offers=[],
                all_offers=[],
                total_in_progress=0,
                total_available=0,
                total_all=0,
            )

    def _parse_earnable_offers_response(
        self, data: List[Dict[str, Any]]
    ) -> List[EarnableOffer]:
        """Parse earnable offers response from API."""
        offers = []

        try:
            for offer_data in data:
                try:
                    offer = EarnableOffer(
                        offer_id=str(offer_data.get("offerId", "")),
                        title=offer_data.get("title", ""),
                        description=offer_data.get("description", ""),
                        category=offer_data.get("category", ""),
                        points_required=int(offer_data.get("pointsRequired", 0)),
                        points_earned=int(offer_data.get("pointsEarned", 0)),
                        status=offer_data.get("status", "available"),
                        progress_current=offer_data.get("progressCurrent"),
                        progress_target=offer_data.get("progressTarget"),
                        start_date=self._parse_datetime(offer_data.get("startDate")),
                        end_date=self._parse_datetime(offer_data.get("endDate")),
                        image_url=offer_data.get("imageUrl"),
                        terms_conditions=offer_data.get("termsConditions"),
                        is_active=offer_data.get("isActive", True),
                        raw_data=offer_data,
                    )
                    offers.append(offer)
                except Exception as e:
                    self.logger.warning(f"Error parsing earnable offer: {e}")
                    continue

        except Exception as e:
            self.logger.error(f"Error parsing earnable offers response: {e}")

        return offers
