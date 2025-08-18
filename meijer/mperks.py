#!/usr/bin/env python3
"""
mPerks earned rewards functionality for Meijer API client.
Handles earned rewards, mCard info, and related mPerks operations.
"""

import logging
from typing import Dict, List, Any, Optional
from dataclasses import dataclass
from datetime import datetime

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


class MPerksEarnedRewards:
    """Handles mPerks earned rewards operations."""

    def __init__(self, meijer_client: "Meijer"):
        self.meijer = meijer_client
        self.logger = logging.getLogger(f"{__name__}.{self.__class__.__name__}")

        # mPerks earned rewards endpoints
        self.endpoints = {
            "earned_rewards": "/loyalty/mPerks/api/reward/earned",
            "mcard_info": "/loyalty/mPerks/api/reward/mCard/info",
            "available_rewards": "/digital/mperks40/customer/v1/rewards/available",
            "reward_categories": "/loyalty/mPerks/api/offers/Categories",
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
                    "Content-Type": "application/vnd.meijer.digitalmperks.earnedrewards-v1.0+json",
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
