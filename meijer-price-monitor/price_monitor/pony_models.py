#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Pony ORM models for Meijer price monitoring system
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: pony.orm, datetime, typing
 */

Pony ORM models for the Meijer price monitoring system.

This module provides Pony ORM entity definitions that replace the SQLite
database structure with minimal column overlap and proper relationships.
"""

from pony.orm import *
from datetime import datetime
from typing import Optional, Dict, Any
import logging

# Configure logging
logger = logging.getLogger(__name__)

# Database binding - will be set by the database manager
db = Database()


class Store(db.Entity):
    """Store entity representing physical Meijer store locations."""
    
    # Primary identifier
    store_id = PrimaryKey(str)
    
    # Store information
    name = Required(str)
    address = Optional(str)
    city = Optional(str)
    state = Optional(str)
    zip_code = Optional(str)
    latitude = Optional(float)
    longitude = Optional(float)
    
    # Timestamps
    created_at = Required(datetime, default=datetime.now)
    updated_at = Required(datetime, default=datetime.now)
    
    # Relationships
    price_records = Set('PriceRecord')
    search_results = Set('SearchResult')
    verifications = Set('ShopnScanVerification')
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert store to dictionary."""
        return {
            'store_id': self.store_id,
            'name': self.name,
            'address': self.address,
            'city': self.city,
            'state': self.state,
            'zip_code': self.zip_code,
            'latitude': self.latitude,
            'longitude': self.longitude,
            'created_at': self.created_at.isoformat(),
            'updated_at': self.updated_at.isoformat()
        }


class Product(db.Entity):
    """Product entity with UPC as primary key."""
    
    # Primary identifier
    upc = PrimaryKey(str)
    
    # Product information
    name = Required(str)
    brand = Optional(str)
    category = Optional(str)
    subcategory = Optional(str)
    description = Optional(str)
    image_url = Optional(str)
    
    # Timestamps
    created_at = Required(datetime, default=datetime.now)
    updated_at = Required(datetime, default=datetime.now)
    
    # Relationships
    price_records = Set('PriceRecord')
    search_results = Set('SearchResult')
    verifications = Set('ShopnScanVerification')
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert product to dictionary."""
        return {
            'upc': self.upc,
            'name': self.name,
            'brand': self.brand,
            'category': self.category,
            'subcategory': self.subcategory,
            'description': self.description,
            'image_url': self.image_url,
            'created_at': self.created_at.isoformat(),
            'updated_at': self.updated_at.isoformat()
        }


class SearchQuery(db.Entity):
    """Search query entity for tracking search operations."""
    
    # Primary identifier
    id = PrimaryKey(int, auto=True)
    
    # Search information
    query_text = Required(str)
    timestamp = Required(datetime, default=datetime.now)
    results_count = Required(int, default=0)
    stores_searched = Required(int, default=0)
    
    # Relationships
    search_results = Set('SearchResult')
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert search query to dictionary."""
        return {
            'id': self.id,
            'query_text': self.query_text,
            'timestamp': self.timestamp.isoformat(),
            'results_count': self.results_count,
            'stores_searched': self.stores_searched
        }


class PriceRecord(db.Entity):
    """Core price record entity for tracking product prices over time."""
    
    # Primary identifier
    id = PrimaryKey(int, auto=True)
    
    # Relationships
    product = Required(Product)
    store = Required(Store)
    
    # Price information
    price = Required(float)
    original_price = Optional(float)
    sale_price = Optional(float)
    
    # Status flags
    is_clearance = Required(bool, default=False)
    is_on_sale = Required(bool, default=False)
    availability = Required(str, default='unknown')
    
    # Metadata
    search_query = Optional(str)
    verification_method = Required(str, default='search')
    timestamp = Required(datetime, default=datetime.now)
    
    # Composite unique constraint
    composite_key(product, store, timestamp)
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert price record to dictionary."""
        return {
            'id': self.id,
            'upc': self.product.upc,
            'product_name': self.product.name,
            'store_id': self.store.store_id,
            'store_name': self.store.name,
            'price': self.price,
            'original_price': self.original_price,
            'sale_price': self.sale_price,
            'is_clearance': self.is_clearance,
            'is_on_sale': self.is_on_sale,
            'availability': self.availability,
            'search_query': self.search_query,
            'verification_method': self.verification_method,
            'timestamp': self.timestamp.isoformat()
        }


class SearchResult(db.Entity):
    """Search result entity for storing search outcomes."""
    
    # Primary identifier
    id = PrimaryKey(int, auto=True)
    
    # Relationships
    search_query = Required(SearchQuery)
    product = Required(Product)
    store = Required(Store)
    
    # Result information
    product_name = Required(str)  # Denormalized for quick access
    price = Required(float)
    original_price = Optional(float)
    
    # Status flags
    is_clearance = Required(bool, default=False)
    is_on_sale = Required(bool, default=False)
    availability = Required(str, default='unknown')
    
    # Timestamp
    timestamp = Required(datetime, default=datetime.now)
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert search result to dictionary."""
        return {
            'id': self.id,
            'search_id': self.search_query.id,
            'upc': self.product.upc,
            'store_id': self.store.store_id,
            'product_name': self.product_name,
            'price': self.price,
            'original_price': self.original_price,
            'is_clearance': self.is_clearance,
            'is_on_sale': self.is_on_sale,
            'availability': self.availability,
            'timestamp': self.timestamp.isoformat()
        }


class ShopnScanVerification(db.Entity):
    """Shop'n'Scan verification entity for price verification."""
    
    # Primary identifier
    id = PrimaryKey(int, auto=True)
    
    # Relationships
    product = Required(Product)
    store = Required(Store)
    
    # Verification information
    verified_price = Required(float)
    sale_price = Optional(float)
    original_price = Optional(float)
    
    # Status flags
    is_clearance = Required(bool, default=False)
    is_on_sale = Required(bool, default=False)
    verification_status = Required(str, default='verified')
    
    # Timestamp
    verification_timestamp = Required(datetime, default=datetime.now)
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert verification to dictionary."""
        return {
            'id': self.id,
            'upc': self.product.upc,
            'store_id': self.store.store_id,
            'verified_price': self.verified_price,
            'sale_price': self.sale_price,
            'original_price': self.original_price,
            'is_clearance': self.is_clearance,
            'is_on_sale': self.is_on_sale,
            'verification_status': self.verification_status,
            'verification_timestamp': self.verification_timestamp.isoformat()
        }


class PriceMonitor(db.Entity):
    """Price monitoring entity for tracking specific product monitoring."""
    
    # Primary identifier
    id = PrimaryKey(int, auto=True)
    
    # Monitor information
    name = Required(str)
    description = Optional(str)
    is_active = Required(bool, default=True)
    
    # Monitoring parameters
    target_upc = Optional(str)  # Specific UPC to monitor
    target_category = Optional(str)  # Category to monitor
    target_brand = Optional(str)  # Brand to monitor
    price_threshold = Optional(float)  # Price threshold for alerts
    
    # Schedule
    check_frequency_hours = Required(int, default=24)
    last_check = Optional(datetime)
    next_check = Optional(datetime)
    
    # Timestamps
    created_at = Required(datetime, default=datetime.now)
    updated_at = Required(datetime, default=datetime.now)
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert monitor to dictionary."""
        return {
            'id': self.id,
            'name': self.name,
            'description': self.description,
            'is_active': self.is_active,
            'target_upc': self.target_upc,
            'target_category': self.target_category,
            'target_brand': self.target_brand,
            'price_threshold': self.price_threshold,
            'check_frequency_hours': self.check_frequency_hours,
            'last_check': self.last_check.isoformat() if self.last_check else None,
            'next_check': self.next_check.isoformat() if self.next_check else None,
            'created_at': self.created_at.isoformat(),
            'updated_at': self.updated_at.isoformat()
        }


class PriceAlert(db.Entity):
    """Price alert entity for tracking price changes and notifications."""
    
    # Primary identifier
    id = PrimaryKey(int, auto=True)
    
    # Alert information
    alert_type = Required(str)  # 'price_drop', 'clearance', 'sale', etc.
    severity = Required(str, default='info')  # 'info', 'warning', 'critical'
    message = Required(str)
    
    # Related data
    upc = Optional(str)
    store_id = Optional(str)
    old_price = Optional(float)
    new_price = Optional(float)
    price_change = Optional(float)
    price_change_percent = Optional(float)
    
    # Status
    is_read = Required(bool, default=False)
    is_acknowledged = Required(bool, default=False)
    
    # Timestamps
    created_at = Required(datetime, default=datetime.now)
    read_at = Optional(datetime)
    acknowledged_at = Optional(datetime)
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert alert to dictionary."""
        return {
            'id': self.id,
            'alert_type': self.alert_type,
            'severity': self.severity,
            'message': self.message,
            'upc': self.upc,
            'store_id': self.store_id,
            'old_price': self.old_price,
            'new_price': self.new_price,
            'price_change': self.price_change,
            'price_change_percent': self.price_change_percent,
            'is_read': self.is_read,
            'is_acknowledged': self.is_acknowledged,
            'created_at': self.created_at.isoformat(),
            'read_at': self.read_at.isoformat() if self.read_at else None,
            'acknowledged_at': self.acknowledged_at.isoformat() if self.acknowledged_at else None
        }


class ExportJob(db.Entity):
    """Export job entity for tracking data export operations."""
    
    # Primary identifier
    id = PrimaryKey(int, auto=True)
    
    # Job information
    job_type = Required(str)  # 'price_history', 'search_results', 'clearance_deals', etc.
    status = Required(str, default='pending')  # 'pending', 'running', 'completed', 'failed'
    
    # Parameters
    parameters = Optional(str)  # JSON string of export parameters
    file_path = Optional(str)  # Path to exported file
    
    # Progress tracking
    total_records = Optional(int)
    processed_records = Optional(int)
    error_message = Optional(str)
    
    # Timestamps
    created_at = Required(datetime, default=datetime.now)
    started_at = Optional(datetime)
    completed_at = Optional(datetime)
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert export job to dictionary."""
        return {
            'id': self.id,
            'job_type': self.job_type,
            'status': self.status,
            'parameters': self.parameters,
            'file_path': self.file_path,
            'total_records': self.total_records,
            'processed_records': self.processed_records,
            'error_message': self.error_message,
            'created_at': self.created_at.isoformat(),
            'started_at': self.started_at.isoformat() if self.started_at else None,
            'completed_at': self.completed_at.isoformat() if self.completed_at else None
        }
