"""
Coupon models for Meijer API.

This module provides classes for representing and managing coupons,
including clipping states and coupon operations.
"""

from typing import Optional, List, Dict, Any
from datetime import datetime
from dataclasses import dataclass, field
from enum import Enum
import json


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

    def export_to_json(self, filepath: str) -> None:
        """Export coupons to JSON file."""
        with open(filepath, 'w') as f:
            json.dump(self.to_list(), f, indent=2, default=str)
    
    def export_clipped_coupons(self, filepath: str) -> None:
        """Export only clipped coupons to JSON file."""
        clipped_coupons = self.filter_clipped(True)
        with open(filepath, 'w') as f:
            json.dump(clipped_coupons.to_list(), f, indent=2, default=str)
    
    def export_available_coupons(self, filepath: str) -> None:
        """Export only available (unclipped) coupons to JSON file."""
        available_coupons = self.filter_clipped(False)
        with open(filepath, 'w') as f:
            json.dump(available_coupons.to_list(), f, indent=2, default=str)
    
    def export_by_department(self, department: str, filepath: str) -> None:
        """Export coupons filtered by department to JSON file."""
        dept_coupons = self.filter_by_department(department)
        with open(filepath, 'w') as f:
            json.dump(dept_coupons.to_list(), f, indent=2, default=str)
    
    def import_from_json(self, filepath: str, overwrite_existing: bool = False) -> int:
        """
        Import coupons from JSON file.
        
        Args:
            filepath: Path to JSON file to import from
            overwrite_existing: If True, replace existing coupons with same ID
            
        Returns:
            Number of coupons imported
        """
        try:
            with open(filepath, 'r') as f:
                imported_data = json.load(f)
            
            if not isinstance(imported_data, list):
                raise ValueError("JSON file must contain a list of coupons")
            
            imported_count = 0
            
            for coupon_data in imported_data:
                try:
                    # Create coupon from imported data
                    imported_coupon = Coupon(
                        id=coupon_data.get('id', ''),
                        name=coupon_data.get('name', ''),
                        description=coupon_data.get('description'),
                        coupon_type=CouponType(coupon_data.get('coupon_type', 'digital')),
                        status=CouponStatus(coupon_data.get('status', 'active')),
                        clipped=coupon_data.get('clipped', False),
                        auto_clipped=coupon_data.get('auto_clipped', False),
                        discount_amount=coupon_data.get('discount_amount'),
                        discount_type=coupon_data.get('discount_type'),
                        minimum_purchase=coupon_data.get('minimum_purchase'),
                        redeem_amount=coupon_data.get('redeem_amount'),
                        start_date=coupon_data.get('start_date'),
                        end_date=coupon_data.get('end_date'),
                        category=coupon_data.get('category'),
                        department=coupon_data.get('department'),
                        brand=coupon_data.get('brand'),
                        image_url=coupon_data.get('image_url'),
                        large_image_url=coupon_data.get('large_image_url'),
                        terms_and_conditions=coupon_data.get('terms_and_conditions'),
                        restrictions=coupon_data.get('restrictions', []),
                        metadata=coupon_data.get('metadata', {})
                    )
                    
                    # Check if coupon already exists
                    existing_coupon = self.get_by_id(imported_coupon.id)
                    
                    if existing_coupon:
                        if overwrite_existing:
                            # Replace existing coupon
                            self.remove(existing_coupon.id)
                            self.add(imported_coupon)
                            imported_count += 1
                        else:
                            # Update clipping state only
                            existing_coupon.clipped = imported_coupon.clipped
                            imported_count += 1
                    else:
                        # Add new coupon
                        self.add(imported_coupon)
                        imported_count += 1
                        
                except Exception as e:
                    print(f"Error importing coupon {coupon_data.get('id', 'unknown')}: {e}")
                    continue
            
            return imported_count
            
        except Exception as e:
            raise ValueError(f"Failed to import coupons from {filepath}: {e}")
    
    def create_backup(self, filepath: str) -> None:
        """Create a complete backup of all coupons with their current states."""
        backup_data = {
            'timestamp': datetime.now().isoformat(),
            'total_coupons': len(self.coupons),
            'clipped_count': self.get_clipped_count(),
            'available_count': self.get_available_count(),
            'coupons': self.to_list()
        }
        
        with open(filepath, 'w') as f:
            json.dump(backup_data, f, indent=2, default=str)
    
    def restore_from_backup(self, filepath: str) -> int:
        """
        Restore coupons from a backup file.
        
        Returns:
            Number of coupons restored
        """
        try:
            with open(filepath, 'r') as f:
                backup_data = json.load(f)
            
            if not isinstance(backup_data, dict) or 'coupons' not in backup_data:
                raise ValueError("Invalid backup file format")
            
            # Clear existing coupons
            self.coupons.clear()
            
            # Restore from backup
            restored_count = 0
            for coupon_data in backup_data['coupons']:
                try:
                    coupon = Coupon(
                        id=coupon_data.get('id', ''),
                        name=coupon_data.get('name', ''),
                        description=coupon_data.get('description'),
                        coupon_type=CouponType(coupon_data.get('coupon_type', 'digital')),
                        status=CouponStatus(coupon_data.get('status', 'active')),
                        clipped=coupon_data.get('clipped', False),
                        auto_clipped=coupon_data.get('auto_clipped', False),
                        discount_amount=coupon_data.get('discount_amount'),
                        discount_type=coupon_data.get('discount_type'),
                        minimum_purchase=coupon_data.get('minimum_purchase'),
                        redeem_amount=coupon_data.get('redeem_amount'),
                        start_date=coupon_data.get('start_date'),
                        end_date=coupon_data.get('end_date'),
                        category=coupon_data.get('category'),
                        department=coupon_data.get('department'),
                        brand=coupon_data.get('brand'),
                        image_url=coupon_data.get('image_url'),
                        large_image_url=coupon_data.get('large_image_url'),
                        terms_and_conditions=coupon_data.get('terms_and_conditions'),
                        restrictions=coupon_data.get('restrictions', []),
                        metadata=coupon_data.get('metadata', {})
                    )
                    
                    self.add(coupon)
                    restored_count += 1
                    
                except Exception as e:
                    print(f"Error restoring coupon {coupon_data.get('id', 'unknown')}: {e}")
                    continue
            
            return restored_count
            
        except Exception as e:
            raise ValueError(f"Failed to restore from backup {filepath}: {e}")
    
    def share_clipped_coupons(self, filepath: str, include_metadata: bool = False) -> None:
        """
        Export clipped coupons in a shareable format.
        
        Args:
            filepath: Path to save the shareable file
            include_metadata: Whether to include full coupon metadata
        """
        clipped_coupons = self.filter_clipped(True)
        
        if include_metadata:
            # Full export with all details
            share_data = {
                'shared_by': 'Meijer Coupon System',
                'shared_at': datetime.now().isoformat(),
                'coupon_count': len(clipped_coupons),
                'coupons': clipped_coupons.to_list()
            }
        else:
            # Lightweight export for sharing
            share_data = {
                'shared_by': 'Meijer Coupon System',
                'shared_at': datetime.now().isoformat(),
                'coupon_count': len(clipped_coupons),
                'coupons': [
                    {
                        'id': c.id,
                        'name': c.name,
                        'description': c.description,
                        'discount': c.get_discount_description(),
                        'department': c.department,
                        'category': c.category,
                        'clipped': c.clipped
                    }
                    for c in clipped_coupons.coupons
                ]
            }
        
        with open(filepath, 'w') as f:
            json.dump(share_data, f, indent=2, default=str)
    
    def import_shared_coupons(self, filepath: str, auto_clip: bool = True) -> int:
        """
        Import coupons from a shared file.
        
        Args:
            filepath: Path to the shared coupons file
            auto_clip: Whether to automatically clip imported coupons
            
        Returns:
            Number of coupons imported
        """
        try:
            with open(filepath, 'r') as f:
                shared_data = json.load(f)
            
            if not isinstance(shared_data, dict) or 'coupons' not in shared_data:
                raise ValueError("Invalid shared coupons file format")
            
            imported_count = 0
            
            for coupon_data in shared_data['coupons']:
                try:
                    # Create coupon from shared data
                    imported_coupon = Coupon(
                        id=coupon_data.get('id', ''),
                        name=coupon_data.get('name', ''),
                        description=coupon_data.get('description'),
                        coupon_type=CouponType.DIGITAL,  # Default for shared coupons
                        status=CouponStatus.ACTIVE,      # Default for shared coupons
                        clipped=auto_clip,               # Auto-clip if requested
                        department=coupon_data.get('department'),
                        category=coupon_data.get('category'),
                        discount_amount=coupon_data.get('discount_amount'),
                        discount_type=coupon_data.get('discount_type'),
                        metadata=coupon_data
                    )
                    
                    # Add to collection
                    self.add(imported_coupon)
                    imported_count += 1
                    
                except Exception as e:
                    print(f"Error importing shared coupon {coupon_data.get('id', 'unknown')}: {e}")
                    continue
            
            return imported_count
            
        except Exception as e:
            raise ValueError(f"Failed to import shared coupons from {filepath}: {e}")
