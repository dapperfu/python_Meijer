"""
Coupon models for Meijer API.

This module provides classes for representing and managing coupons,
including clipping states and coupon operations.
"""

from typing import Optional, List, Dict, Any
from datetime import datetime
from dataclasses import dataclass, field
from enum import Enum


class CouponType(Enum):
    """Types of coupons available."""
    MANUFACTURER = "manufacturer"
    STORE = "store"
    DIGITAL = "digital"
    PRINTABLE = "printable"
    REWARD = "reward"


class CouponStatus(Enum):
    """Status of coupons."""
    ACTIVE = "active"
    EXPIRED = "expired"
    USED = "used"
    INACTIVE = "inactive"


@dataclass
class Coupon:
    """Represents a single coupon."""
    
    id: str
    name: str
    description: Optional[str] = None
    coupon_type: CouponType = CouponType.DIGITAL
    status: CouponStatus = CouponStatus.ACTIVE
    
    # Clipping state
    clipped: bool = False
    auto_clipped: bool = False
    
    # Value and conditions
    discount_amount: Optional[float] = None
    discount_type: Optional[str] = None  # "percentage", "dollar", "bogo"
    minimum_purchase: Optional[float] = None
    redeem_amount: Optional[float] = None
    
    # Dates
    start_date: Optional[datetime] = None
    end_date: Optional[datetime] = None
    created_date: Optional[datetime] = None
    modified_date: Optional[datetime] = None
    
    # Product information
    product_ids: List[str] = field(default_factory=list)
    category: Optional[str] = None
    department: Optional[str] = None
    brand: Optional[str] = None
    
    # Images and display
    image_url: Optional[str] = None
    large_image_url: Optional[str] = None
    
    # Terms and conditions
    terms_and_conditions: Optional[str] = None
    restrictions: List[str] = field(default_factory=list)
    
    # Additional metadata
    metadata: Dict[str, Any] = field(default_factory=dict)
    
    def __post_init__(self):
        """Post-initialization processing."""
        if isinstance(self.start_date, str):
            self.start_date = datetime.fromisoformat(self.start_date.replace('Z', '+00:00'))
        if isinstance(self.end_date, str):
            self.end_date = datetime.fromisoformat(self.end_date.replace('Z', '+00:00'))
        if isinstance(self.created_date, str):
            self.created_date = datetime.fromisoformat(self.created_date.replace('Z', '+00:00'))
        if isinstance(self.modified_date, str):
            self.modified_date = datetime.fromisoformat(self.modified_date.replace('Z', '+00:00'))
    
    def is_expired(self) -> bool:
        """Check if the coupon is expired."""
        if not self.end_date:
            return False
        return datetime.now() > self.end_date
    
    def is_active(self) -> bool:
        """Check if the coupon is currently active."""
        if self.status != CouponStatus.ACTIVE:
            return False
        if self.is_expired():
            return False
        if self.start_date and datetime.now() < self.start_date:
            return False
        return True
    
    def can_clip(self) -> bool:
        """Check if the coupon can be clipped."""
        return self.is_active() and not self.clipped
    
    def can_unclip(self) -> bool:
        """Check if the coupon can be unclipped."""
        return self.clipped
    
    def clip(self) -> bool:
        """Clip the coupon if possible."""
        if self.can_clip():
            self.clipped = True
            return True
        return False
    
    def unclip(self) -> bool:
        """Unclip the coupon if possible."""
        if self.can_unclip():
            self.clipped = False
            return True
        return False
    
    def get_discount_description(self) -> str:
        """Get a human-readable description of the discount."""
        if not self.discount_amount:
            return "No discount specified"
        
        if self.discount_type == "percentage":
            return f"{self.discount_amount}% off"
        elif self.discount_type == "dollar":
            return f"${self.discount_amount:.2f} off"
        elif self.discount_type == "bogo":
            return "Buy One Get One"
        else:
            return f"${self.discount_amount:.2f} off"
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert coupon to dictionary."""
        return {
            'id': self.id,
            'name': self.name,
            'description': self.description,
            'coupon_type': self.coupon_type.value,
            'status': self.status.value,
            'clipped': self.clipped,
            'auto_clipped': self.auto_clipped,
            'discount_amount': self.discount_amount,
            'discount_type': self.discount_type,
            'minimum_purchase': self.minimum_purchase,
            'redeem_amount': self.redeem_amount,
            'start_date': self.start_date.isoformat() if self.start_date else None,
            'end_date': self.end_date.isoformat() if self.end_date else None,
            'category': self.category,
            'department': self.department,
            'brand': self.brand,
            'image_url': self.image_url,
            'terms_and_conditions': self.terms_and_conditions,
            'is_active': self.is_active(),
            'is_expired': self.is_expired()
        }
    
    def __str__(self) -> str:
        """String representation of the coupon."""
        status = "CLIPPED" if self.clipped else "AVAILABLE"
        discount = self.get_discount_description()
        return f"{self.name} - {discount} ({status})"
    
    def __repr__(self) -> str:
        """Detailed representation of the coupon."""
        return f"Coupon(id='{self.id}', name='{self.name}', clipped={self.clipped})"


@dataclass
class CouponCollection:
    """Collection of coupons with filtering and management capabilities."""
    
    coupons: List[Coupon] = field(default_factory=list)
    
    def __len__(self) -> int:
        """Return the number of coupons."""
        return len(self.coupons)
    
    def __getitem__(self, index: int) -> Coupon:
        """Get coupon by index."""
        return self.coupons[index]
    
    def __iter__(self):
        """Iterate over coupons."""
        return iter(self.coupons)
    
    def add(self, coupon: Coupon) -> None:
        """Add a coupon to the collection."""
        self.coupons.append(coupon)
    
    def remove(self, coupon_id: str) -> bool:
        """Remove a coupon by ID."""
        for i, coupon in enumerate(self.coupons):
            if coupon.id == coupon_id:
                del self.coupons[i]
                return True
        return False
    
    def get_by_id(self, coupon_id: str) -> Optional[Coupon]:
        """Get a coupon by ID."""
        for coupon in self.coupons:
            if coupon.id == coupon_id:
                return coupon
        return None
    
    def filter_by_department(self, department: str) -> 'CouponCollection':
        """Filter coupons by department."""
        filtered = [c for c in self.coupons if c.department and department.lower() in c.department.lower()]
        return CouponCollection(filtered)
    
    def filter_by_category(self, category: str) -> 'CouponCollection':
        """Filter coupons by category."""
        filtered = [c for c in self.coupons if c.category and category.lower() in c.category.lower()]
        return CouponCollection(filtered)
    
    def filter_clipped(self, clipped: bool = True) -> 'CouponCollection':
        """Filter coupons by clipping state."""
        filtered = [c for c in self.coupons if c.clipped == clipped]
        return CouponCollection(filtered)
    
    def filter_active(self) -> 'CouponCollection':
        """Filter for active coupons only."""
        filtered = [c for c in self.coupons if c.is_active()]
        return CouponCollection(filtered)
    
    def filter_expired(self) -> 'CouponCollection':
        """Filter for expired coupons only."""
        filtered = [c for c in self.coupons if c.is_expired()]
        return CouponCollection(filtered)
    
    def get_clipped_count(self) -> int:
        """Get count of clipped coupons."""
        return sum(1 for c in self.coupons if c.clipped)
    
    def get_available_count(self) -> int:
        """Get count of available (unclipped) coupons."""
        return sum(1 for c in self.coupons if not c.clipped)
    
    def clip_all(self) -> int:
        """Clip all available coupons. Returns count of clipped."""
        clipped_count = 0
        for coupon in self.coupons:
            if coupon.clip():
                clipped_count += 1
        return clipped_count
    
    def unclip_all(self) -> int:
        """Unclip all clipped coupons. Returns count of unclipped."""
        unclipped_count = 0
        for coupon in self.coupons:
            if coupon.unclip():
                unclipped_count += 1
        return unclipped_count
    
    def to_list(self) -> List[Dict[str, Any]]:
        """Convert collection to list of dictionaries."""
        return [coupon.to_dict() for coupon in self.coupons]
    
    def __str__(self) -> str:
        """String representation of the collection."""
        total = len(self.coupons)
        clipped = self.get_clipped_count()
        available = self.get_available_count()
        return f"CouponCollection({total} total, {clipped} clipped, {available} available)"
