"""
mPerks Reward Models

This module defines the class hierarchy for different types of mPerks rewards,
including fuel rewards, product rewards, and total purchase discounts.
Each reward type has specific claim methods and point requirements.
"""

from abc import ABC, abstractmethod
from dataclasses import dataclass, field
from datetime import datetime, timedelta
from decimal import Decimal
from enum import Enum
from typing import Any, Dict, List, Optional, Union
import json


class RewardStatus(Enum):
    """Status of a reward."""
    AVAILABLE = "available"
    CLAIMED = "claimed"
    EXPIRED = "expired"
    REDEEMED = "redeemed"
    IN_PROGRESS = "in_progress"


class RewardType(Enum):
    """Types of mPerks rewards."""
    FUEL = "fuel"
    PRODUCT = "product"
    TOTAL_PURCHASE = "total_purchase"
    POINTS_BONUS = "points_bonus"
    CASHBACK = "cashback"
    FREE_ITEM = "free_item"


@dataclass
class RewardRequirements:
    """Requirements for claiming a reward."""
    points_required: int
    minimum_purchase: Optional[Decimal] = None
    store_restrictions: List[str] = field(default_factory=list)
    time_restrictions: Optional[str] = None
    customer_tier: Optional[str] = None
    additional_requirements: Dict[str, Any] = field(default_factory=dict)


@dataclass
class RewardMetadata:
    """Additional metadata for rewards."""
    image_url: Optional[str] = None
    terms_and_conditions: Optional[str] = None
    expiration_date: Optional[datetime] = None
    earn_date: Optional[datetime] = None
    redeem_date: Optional[datetime] = None
    transaction_date: Optional[datetime] = None
    meijer_offer_id: Optional[int] = None
    reward_program: Optional[int] = None


class BaseReward(ABC):
    """Base class for all mPerks rewards."""
    
    def __init__(
        self,
        title: str,
        description: str,
        points_required: int,
        status: RewardStatus = RewardStatus.AVAILABLE,
        metadata: Optional[RewardMetadata] = None,
        requirements: Optional[RewardRequirements] = None
    ):
        self.title = title
        self.description = description
        self.points_required = points_required
        self.status = status
        self.metadata = metadata or RewardMetadata()
        self.requirements = requirements or RewardRequirements(points_required=points_required)
        self.claimed_at: Optional[datetime] = None
        self.redeemed_at: Optional[datetime] = None
    
    @property
    def is_claimable(self) -> bool:
        """Check if the reward can be claimed."""
        return (
            self.status == RewardStatus.AVAILABLE and
            self.metadata.expiration_date and
            self.metadata.expiration_date > datetime.now()
        )
    
    @property
    def is_expired(self) -> bool:
        """Check if the reward has expired."""
        return (
            self.metadata.expiration_date and
            self.metadata.expiration_date <= datetime.now()
        )
    
    @property
    def days_until_expiration(self) -> Optional[int]:
        """Get days until expiration."""
        if not self.metadata.expiration_date:
            return None
        delta = self.metadata.expiration_date - datetime.now()
        return max(0, delta.days)
    
    @abstractmethod
    def claim(self, customer_points: int, **kwargs) -> bool:
        """
        Claim the reward.
        
        Args:
            customer_points: Current customer points balance
            **kwargs: Additional parameters for specific reward types
            
        Returns:
            True if successfully claimed, False otherwise
        """
        pass
    
    @abstractmethod
    def redeem(self, **kwargs) -> bool:
        """
        Redeem the claimed reward.
        
        Args:
            **kwargs: Additional parameters for specific reward types
            
        Returns:
            True if successfully redeemed, False otherwise
        """
        pass
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert reward to dictionary representation."""
        return {
            'title': self.title,
            'description': self.description,
            'points_required': self.points_required,
            'status': self.status.value,
            'is_claimable': self.is_claimable,
            'is_expired': self.is_expired,
            'days_until_expiration': self.days_until_expiration,
            'claimed_at': self.claimed_at.isoformat() if self.claimed_at else None,
            'redeemed_at': self.redeemed_at.isoformat() if self.redeemed_at else None,
            'metadata': {
                'image_url': self.metadata.image_url,
                'terms_and_conditions': self.metadata.terms_and_conditions,
                'expiration_date': self.metadata.expiration_date.isoformat() if self.metadata.expiration_date else None,
                'earn_date': self.metadata.earn_date.isoformat() if self.metadata.earn_date else None,
                'redeem_date': self.metadata.redeem_date.isoformat() if self.metadata.redeem_date else None,
                'transaction_date': self.metadata.transaction_date.isoformat() if self.metadata.transaction_date else None,
                'meijer_offer_id': self.metadata.meijer_offer_id,
                'reward_program': self.metadata.reward_program
            },
            'requirements': {
                'points_required': self.requirements.points_required,
                'minimum_purchase': str(self.requirements.minimum_purchase) if self.requirements.minimum_purchase else None,
                'store_restrictions': self.requirements.store_restrictions,
                'time_restrictions': self.requirements.time_restrictions,
                'customer_tier': self.requirements.customer_tier,
                'additional_requirements': self.requirements.additional_requirements
            }
        }
    
    def __str__(self) -> str:
        return f"{self.title} ({self.points_required} points) - {self.status.value}"
    
    def __repr__(self) -> str:
        return f"{self.__class__.__name__}(title='{self.title}', points_required={self.points_required})"


class FuelReward(BaseReward):
    """Fuel discount reward (e.g., 10 cents off per gallon)."""
    
    def __init__(
        self,
        title: str,
        description: str,
        points_required: int,
        discount_per_gallon: Decimal,
        max_gallons: Optional[int] = None,
        fuel_types: List[str] = None,
        **kwargs
    ):
        super().__init__(title, description, points_required, **kwargs)
        self.discount_per_gallon = discount_per_gallon
        self.max_gallons = max_gallons
        self.fuel_types = fuel_types or ["regular", "mid-grade", "premium"]
        self.reward_type = RewardType.FUEL
    
    def claim(self, customer_points: int, **kwargs) -> bool:
        """Claim the fuel reward."""
        if not self.is_claimable:
            return False
        
        if customer_points < self.points_required:
            return False
        
        self.status = RewardStatus.CLAIMED
        self.claimed_at = datetime.now()
        return True
    
    def redeem(self, gallons_purchased: int, **kwargs) -> bool:
        """Redeem the fuel reward."""
        if self.status != RewardStatus.CLAIMED:
            return False
        
        if self.max_gallons and gallons_purchased > self.max_gallons:
            gallons_purchased = self.max_gallons
        
        total_savings = self.discount_per_gallon * Decimal(gallons_purchased)
        
        self.status = RewardStatus.REDEEMED
        self.redeemed_at = datetime.now()
        
        return True
    
    def calculate_savings(self, gallons: int) -> Decimal:
        """Calculate potential savings for given gallons."""
        if self.max_gallons:
            gallons = min(gallons, self.max_gallons)
        return self.discount_per_gallon * Decimal(gallons)
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert fuel reward to dictionary."""
        base_dict = super().to_dict()
        base_dict.update({
            'reward_type': self.reward_type.value,
            'discount_per_gallon': str(self.discount_per_gallon),
            'max_gallons': self.max_gallons,
            'fuel_types': self.fuel_types
        })
        return base_dict


class ProductReward(BaseReward):
    """Product-specific reward (e.g., free sunscreen, yogurt)."""
    
    def __init__(
        self,
        title: str,
        description: str,
        points_required: int,
        product_name: str,
        product_upc: Optional[str] = None,
        product_category: Optional[str] = None,
        max_quantity: int = 1,
        size_restrictions: Optional[str] = None,
        **kwargs
    ):
        super().__init__(title, description, points_required, **kwargs)
        self.product_name = product_name
        self.product_upc = product_upc
        self.product_category = product_category
        self.max_quantity = max_quantity
        self.size_restrictions = size_restrictions
        self.reward_type = RewardType.PRODUCT
    
    def claim(self, customer_points: int, **kwargs) -> bool:
        """Claim the product reward."""
        if not self.is_claimable:
            return False
        
        if customer_points < self.points_required:
            return False
        
        self.status = RewardStatus.CLAIMED
        self.claimed_at = datetime.now()
        return True
    
    def redeem(self, quantity: int = 1, **kwargs) -> bool:
        """Redeem the product reward."""
        if self.status != RewardStatus.CLAIMED:
            return False
        
        if quantity > self.max_quantity:
            return False
        
        self.status = RewardStatus.REDEEMED
        self.redeemed_at = datetime.now()
        
        return True
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert product reward to dictionary."""
        base_dict = super().to_dict()
        base_dict.update({
            'reward_type': self.reward_type.value,
            'product_name': self.product_name,
            'product_upc': self.product_upc,
            'product_category': self.product_category,
            'max_quantity': self.max_quantity,
            'size_restrictions': self.size_restrictions
        })
        return base_dict


class TotalPurchaseDiscountReward(BaseReward):
    """Total purchase discount reward (e.g., $2 off total purchase)."""
    
    def __init__(
        self,
        title: str,
        description: str,
        points_required: int,
        discount_amount: Decimal,
        minimum_purchase: Decimal,
        maximum_discount: Optional[Decimal] = None,
        applicable_categories: List[str] = None,
        excluded_categories: List[str] = None,
        **kwargs
    ):
        super().__init__(title, description, points_required, **kwargs)
        self.discount_amount = discount_amount
        self.minimum_purchase = minimum_purchase
        self.maximum_discount = maximum_discount
        self.applicable_categories = applicable_categories or []
        self.excluded_categories = excluded_categories or []
        self.reward_type = RewardType.TOTAL_PURCHASE
        
        # Update requirements
        if self.requirements:
            self.requirements.minimum_purchase = minimum_purchase
    
    def claim(self, customer_points: int, **kwargs) -> bool:
        """Claim the total purchase discount."""
        if not self.is_claimable:
            return False
        
        if customer_points < self.points_required:
            return False
        
        self.status = RewardStatus.CLAIMED
        self.claimed_at = datetime.now()
        return True
    
    def redeem(self, purchase_total: Decimal, **kwargs) -> bool:
        """Redeem the total purchase discount."""
        if self.status != RewardStatus.CLAIMED:
            return False
        
        if purchase_total < self.minimum_purchase:
            return False
        
        # Calculate actual discount (may be capped)
        actual_discount = self.discount_amount
        if self.maximum_discount:
            actual_discount = min(actual_discount, self.maximum_discount)
        
        self.status = RewardStatus.REDEEMED
        self.redeemed_at = datetime.now()
        
        return True
    
    def calculate_discount(self, purchase_total: Decimal) -> Decimal:
        """Calculate the discount for a given purchase total."""
        if purchase_total < self.minimum_purchase:
            return Decimal('0')
        
        discount = self.discount_amount
        if self.maximum_discount:
            discount = min(discount, self.maximum_discount)
        
        return discount
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert total purchase discount to dictionary."""
        base_dict = super().to_dict()
        base_dict.update({
            'reward_type': self.reward_type.value,
            'discount_amount': str(self.discount_amount),
            'minimum_purchase': str(self.minimum_purchase),
            'maximum_discount': str(self.maximum_discount) if self.maximum_discount else None,
            'applicable_categories': self.applicable_categories,
            'excluded_categories': self.excluded_categories
        })
        return base_dict


class PointsBonusReward(BaseReward):
    """Points bonus reward (e.g., earn extra points on purchases)."""
    
    def __init__(
        self,
        title: str,
        description: str,
        points_required: int,
        bonus_multiplier: Decimal,
        bonus_categories: List[str] = None,
        maximum_bonus_points: Optional[int] = None,
        **kwargs
    ):
        super().__init__(title, description, points_required, **kwargs)
        self.bonus_multiplier = bonus_multiplier
        self.bonus_categories = bonus_categories or []
        self.maximum_bonus_points = maximum_bonus_points
        self.reward_type = RewardType.POINTS_BONUS
    
    def claim(self, customer_points: int, **kwargs) -> bool:
        """Claim the points bonus reward."""
        if not self.is_claimable:
            return False
        
        if customer_points < self.points_required:
            return False
        
        self.status = RewardStatus.CLAIMED
        self.claimed_at = datetime.now()
        return True
    
    def redeem(self, base_points: int, **kwargs) -> bool:
        """Redeem the points bonus reward."""
        if self.status != RewardStatus.CLAIMED:
            return False
        
        bonus_points = int(base_points * self.bonus_multiplier)
        if self.maximum_bonus_points:
            bonus_points = min(bonus_points, self.maximum_bonus_points)
        
        self.status = RewardStatus.REDEEMED
        self.redeemed_at = datetime.now()
        
        return True
    
    def calculate_bonus_points(self, base_points: int) -> int:
        """Calculate bonus points for given base points."""
        bonus_points = int(base_points * self.bonus_multiplier)
        if self.maximum_bonus_points:
            bonus_points = min(bonus_points, self.maximum_bonus_points)
        return bonus_points
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert points bonus reward to dictionary."""
        base_dict = super().to_dict()
        base_dict.update({
            'reward_type': self.reward_type.value,
            'bonus_multiplier': str(self.bonus_multiplier),
            'bonus_categories': self.bonus_categories,
            'maximum_bonus_points': self.maximum_bonus_points
        })
        return base_dict


class RewardFactory:
    """Factory for creating different types of rewards."""
    
    @staticmethod
    def create_fuel_reward(
        title: str,
        description: str,
        points_required: int,
        discount_per_gallon: Union[Decimal, str, float],
        **kwargs
    ) -> FuelReward:
        """Create a fuel reward."""
        if isinstance(discount_per_gallon, (str, float)):
            discount_per_gallon = Decimal(str(discount_per_gallon))
        
        return FuelReward(
            title=title,
            description=description,
            points_required=points_required,
            discount_per_gallon=discount_per_gallon,
            **kwargs
        )
    
    @staticmethod
    def create_product_reward(
        title: str,
        description: str,
        points_required: int,
        product_name: str,
        **kwargs
    ) -> ProductReward:
        """Create a product reward."""
        return ProductReward(
            title=title,
            description=description,
            points_required=points_required,
            product_name=product_name,
            **kwargs
        )
    
    @staticmethod
    def create_total_purchase_discount(
        title: str,
        description: str,
        points_required: int,
        discount_amount: Union[Decimal, str, float],
        minimum_purchase: Union[Decimal, str, float],
        **kwargs
    ) -> TotalPurchaseDiscountReward:
        """Create a total purchase discount reward."""
        if isinstance(discount_amount, (str, float)):
            discount_amount = Decimal(str(discount_amount))
        if isinstance(minimum_purchase, (str, float)):
            minimum_purchase = Decimal(str(minimum_purchase))
        
        return TotalPurchaseDiscountReward(
            title=title,
            description=description,
            points_required=points_required,
            discount_amount=discount_amount,
            minimum_purchase=minimum_purchase,
            **kwargs
        )
    
    @staticmethod
    def create_points_bonus(
        title: str,
        description: str,
        points_required: int,
        bonus_multiplier: Union[Decimal, str, float],
        **kwargs
    ) -> PointsBonusReward:
        """Create a points bonus reward."""
        if isinstance(bonus_multiplier, (str, float)):
            bonus_multiplier = Decimal(str(bonus_multiplier))
        
        return PointsBonusReward(
            title=title,
            description=description,
            points_required=points_required,
            bonus_multiplier=bonus_multiplier,
            **kwargs
        )
    
    @staticmethod
    def from_dict(data: Dict[str, Any]) -> BaseReward:
        """Create a reward from dictionary data."""
        reward_type = data.get('reward_type', 'unknown')
        
        if reward_type == RewardType.FUEL.value:
            return FuelReward(
                title=data['title'],
                description=data['description'],
                points_required=data['points_required'],
                discount_per_gallon=Decimal(data.get('discount_per_gallon', '0')),
                max_gallons=data.get('max_gallons'),
                fuel_types=data.get('fuel_types', [])
            )
        elif reward_type == RewardType.PRODUCT.value:
            return ProductReward(
                title=data['title'],
                description=data['description'],
                points_required=data['points_required'],
                product_name=data.get('product_name', ''),
                product_upc=data.get('product_upc'),
                product_category=data.get('product_category'),
                max_quantity=data.get('max_quantity', 1)
            )
        elif reward_type == RewardType.TOTAL_PURCHASE.value:
            return TotalPurchaseDiscountReward(
                title=data['title'],
                description=data['description'],
                points_required=data['points_required'],
                discount_amount=Decimal(data.get('discount_amount', '0')),
                minimum_purchase=Decimal(data.get('minimum_purchase', '0')),
                maximum_discount=Decimal(data.get('maximum_discount', '0')) if data.get('maximum_discount') else None
            )
        elif reward_type == RewardType.POINTS_BONUS.value:
            return PointsBonusReward(
                title=data['title'],
                description=data['description'],
                points_required=data['points_required'],
                bonus_multiplier=Decimal(data.get('bonus_multiplier', '1')),
                bonus_categories=data.get('bonus_categories', [])
            )
        else:
            raise ValueError(f"Unknown reward type: {reward_type}")


# Example usage and predefined rewards
def create_example_rewards() -> List[BaseReward]:
    """Create example rewards for testing and demonstration."""
    rewards = []
    
    # Fuel reward: 10 cents off per gallon
    fuel_reward = RewardFactory.create_fuel_reward(
        title="Save $0.10/gal on fuel",
        description="Redeem by entering your mPerks number and PIN at pump before payment.",
        points_required=5000,
        discount_per_gallon=Decimal('0.10'),
        max_gallons=20,
        fuel_types=["regular", "mid-grade", "premium"],
        metadata=RewardMetadata(
            image_url="https://static.meijer.com/DigitalCoupon/FuelRewardImage.png",
            terms_and_conditions="NOT REDEEMABLE IN WISCONSIN. per gallon, Maximum 20 gallons.",
            expiration_date=datetime.now() + timedelta(days=30)
        )
    )
    rewards.append(fuel_reward)
    
    # Product reward: Free sunscreen
    sunscreen_reward = RewardFactory.create_product_reward(
        title="Free Sunscreen",
        description="Get any sunscreen product up to $8.99 value.",
        points_required=2000,
        product_name="Sunscreen",
        product_category="Personal Care",
        max_quantity=1,
        size_restrictions="Up to $8.99 value",
        metadata=RewardMetadata(
            image_url="https://static.meijer.com/DigitalCoupon/SunscreenReward.png",
            terms_and_conditions="Valid on any sunscreen product. Cannot be combined with other offers.",
            expiration_date=datetime.now() + timedelta(days=45)
        )
    )
    rewards.append(sunscreen_reward)
    
    # Product reward: Free yogurt
    yogurt_reward = RewardFactory.create_product_reward(
        title="Free Yogurt",
        description="Get any yogurt product up to $5.99 value.",
        points_required=1500,
        product_name="Yogurt",
        product_category="Dairy",
        max_quantity=1,
        size_restrictions="Up to $5.99 value",
        metadata=RewardMetadata(
            image_url="https://static.meijer.com/DigitalCoupon/YogurtReward.png",
            terms_and_conditions="Valid on any yogurt product. Cannot be combined with other offers.",
            expiration_date=datetime.now() + timedelta(days=30)
        )
    )
    rewards.append(yogurt_reward)
    
    # Total purchase discount: $2 off total purchase
    total_discount_reward = RewardFactory.create_total_purchase_discount(
        title="Save $2 on Total Purchase",
        description="Save $2 when you spend $10 or more.",
        points_required=3000,
        discount_amount=Decimal('2.00'),
        minimum_purchase=Decimal('10.00'),
        maximum_discount=Decimal('2.00'),
        applicable_categories=["all"],
        metadata=RewardMetadata(
            image_url="https://static.meijer.com/DigitalCoupon/TotalDiscountReward.png",
            terms_and_conditions="Minimum purchase of $10 required. Cannot be combined with other offers.",
            expiration_date=datetime.now() + timedelta(days=60)
        )
    )
    rewards.append(total_discount_reward)
    
    return rewards
