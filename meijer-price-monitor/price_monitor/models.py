#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Shared data models to avoid circular imports
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: dataclasses, datetime, typing
 */

Shared data models for the Meijer price monitoring system.

This module contains the core dataclasses used across multiple modules
to avoid circular import issues.
"""

from dataclasses import dataclass, field, asdict
from datetime import datetime
from typing import Dict, List, Optional, Any


@dataclass
class PriceRecord:
    """Represents a single price record for a product at a specific store."""
    
    product_id: str
    """Unique product identifier"""
    
    product_name: str
    """Product name"""
    
    store_id: str
    """Store identifier"""
    
    store_name: str
    """Store name"""
    
    price: float
    """Current price"""
    
    original_price: Optional[float] = None
    """Original/regular price if available"""
    
    is_clearance: bool = False
    """Whether the item is on clearance"""
    
    is_on_sale: bool = False
    """Whether the item is on sale"""
    
    timestamp: datetime = field(default_factory=datetime.now)
    """When this price was recorded"""
    
    availability: str = "unknown"
    """Product availability status"""
    
    search_query: str = ""
    """The search query that found this product"""
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for JSON serialization."""
        data = asdict(self)
        data['timestamp'] = self.timestamp.isoformat()
        return data


@dataclass
class PriceHistory:
    """Represents price history for a product at a specific store."""
    
    product_id: str
    """Unique product identifier"""
    
    store_id: str
    """Store identifier"""
    
    price_records: List[PriceRecord] = field(default_factory=list)
    """List of price records over time"""
    
    def add_price(self, price_record: PriceRecord) -> None:
        """Add a new price record."""
        self.price_records.append(price_record)
        # Sort by timestamp (newest first)
        self.price_records.sort(key=lambda x: x.timestamp, reverse=True)
    
    def get_latest_price(self) -> Optional[PriceRecord]:
        """Get the most recent price record."""
        return self.price_records[0] if self.price_records else None
    
    def get_price_change(self) -> Optional[float]:
        """Calculate price change from oldest to newest record."""
        if len(self.price_records) < 2:
            return None
        oldest = self.price_records[-1].price
        newest = self.price_records[0].price
        return newest - oldest
    
    def get_lowest_price(self) -> Optional[PriceRecord]:
        """Get the record with the lowest price."""
        if not self.price_records:
            return None
        return min(self.price_records, key=lambda x: x.price)
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for JSON serialization."""
        return {
            'product_id': self.product_id,
            'store_id': self.store_id,
            'price_records': [record.to_dict() for record in self.price_records]
        }


@dataclass
class PriceDropAnalysis:
    """Represents a price drop analysis between two price records."""
    
    product_id: str
    """Unique product identifier"""
    
    product_name: str
    """Product name"""
    
    store_id: str
    """Store identifier"""
    
    store_name: str
    """Store name"""
    
    previous_price: float
    """Previous price"""
    
    current_price: float
    """Current price"""
    
    price_drop: float
    """Amount of price drop"""
    
    price_drop_percent: float
    """Percentage of price drop"""
    
    previous_timestamp: datetime
    """When previous price was recorded"""
    
    current_timestamp: datetime
    """When current price was recorded"""
    
    days_since_last_check: int
    """Days between price checks"""
    
    is_clearance: bool
    """Whether current item is on clearance"""
    
    is_on_sale: bool
    """Whether current item is on sale"""
    
    search_query: str
    """The search query that found this product"""
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for JSON serialization."""
        data = asdict(self)
        data['previous_timestamp'] = self.previous_timestamp.isoformat()
        data['current_timestamp'] = self.current_timestamp.isoformat()
        return data


@dataclass
class ShopnScanPrice:
    """Represents a price from Shop'n'Scan verification."""
    
    upc: str
    """Product UPC code"""
    
    product_name: str
    """Product name from Shop'n'Scan"""
    
    store_id: str
    """Store identifier"""
    
    current_price: float
    """Current price from Shop'n'Scan"""
    
    sale_price: Optional[float] = None
    """Sale price if available"""
    
    original_price: Optional[float] = None
    """Original/regular price if available"""
    
    is_clearance: bool = False
    """Whether the item is on clearance"""
    
    is_on_sale: bool = False
    """Whether the item is on sale"""
    
    timestamp: datetime = field(default_factory=datetime.now)
    """When this price was verified"""
    
    verification_status: str = "verified"
    """Status of price verification"""
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for JSON serialization."""
        data = asdict(self)
        data['timestamp'] = self.timestamp.isoformat()
        return data
