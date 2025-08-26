"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create PonyORM entity classes for Meijer price watch system database
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: pony, datetime, decimal, typing
 */

Price Watch Database Models

This module contains PonyORM entity classes for the Meijer price watch system.
The database tracks products, stores, price history, watches, alerts, and notifications.
"""

from datetime import datetime
from decimal import Decimal
from enum import Enum
from typing import Optional

from pony.orm import *

# Database binding - will be set by the database manager
db = Database()

# This will be bound later by the database manager


class PriceType(str, Enum):
    """Types of prices that can be observed."""

    REGULAR = "regular"
    SALE = "sale"
    CLEARANCE = "clearance"
    UNKNOWN = "unknown"


class OnlyWhenType(str, Enum):
    """Conditions for when to trigger alerts."""

    ANY_DROP = "any_drop"
    SALE_OR_CLEARANCE = "sale_or_clearance"
    CLEARANCE_ONLY = "clearance_only"
    BELOW_DESIRED_PRICE = "below_desired_price"


class NotificationStatus(str, Enum):
    """Status of notification delivery."""

    PENDING = "pending"
    SENT = "sent"
    FAILED = "failed"


class AlertReason(str, Enum):
    """Reasons for generating alerts."""

    DROP = "drop"
    HIT_DESIRED_PRICE = "hit_desired_price"
    SALE_DETECTED = "sale_detected"
    CLEARANCE_DETECTED = "clearance_detected"


class Product(db.Entity):
    """
    Product entity representing a sellable item at Meijer.

    Products are identified by UPC (packaged goods) or PLU (produce items).
    """

    _table_ = "product"

    # Primary key
    id = PrimaryKey(int, auto=True)

    # Product identification
    identifier = Required(str, max_len=50)
    id_type = Required(str, max_len=10)  # UPC or PLU

    # Product details
    brand = Optional(str, max_len=100)
    name = Optional(str, max_len=200)
    size = Optional(str, max_len=100)
    department = Optional(str, max_len=100)
    image_url = Optional(str, max_len=500)

    # Timestamps
    created_at = Required(datetime, default=datetime.utcnow)
    updated_at = Required(datetime, default=datetime.utcnow)

    # Relationships
    price_history = Set("PriceHistory")
    watches = Set("Watch")

    # Indexes
    composite_key(identifier, id_type)

    def __str__(self) -> str:
        """String representation of the product."""
        return f"{self.brand or 'Unknown'} {self.name or 'Unknown'} ({self.identifier})"


class Store(db.Entity):
    """
    Store entity representing a physical Meijer store location.
    """

    _table_ = "store"

    # Primary key
    id = PrimaryKey(int, auto=True)

    # Store identification
    store_code = Required(str, max_len=20, unique=True)

    # Store details
    name = Optional(str, max_len=200)
    city = Optional(str, max_len=100)
    state = Optional(str, max_len=50)
    timezone = Optional(str, max_len=50)

    # Timestamps
    created_at = Required(datetime, default=datetime.utcnow)
    updated_at = Required(datetime, default=datetime.utcnow)

    # Relationships
    price_history = Set("PriceHistory")
    watches = Set("Watch")

    def __str__(self) -> str:
        """String representation of the store."""
        if self.name and self.city:
            return f"{self.name} - {self.city}, {self.state or ''}"
        elif self.name:
            return self.name
        else:
            return f"Store {self.store_code}"


class PriceHistory(db.Entity):
    """
    Price history entity tracking observed prices for products at stores.
    """

    _table_ = "price_history"

    # Primary key
    id = PrimaryKey(int, auto=True)

    # Foreign keys
    product = Required(Product)
    store = Required(Store)

    # Price information
    observed_at = Required(datetime)
    price = Required(Decimal, precision=10, scale=2)
    unit_price = Optional(Decimal, precision=10, scale=4)
    currency = Required(str, max_len=3, default="USD")
    price_type = Required(str, max_len=20)

    # Promotional information
    regular_price = Optional(Decimal, precision=10, scale=2)
    promo_id = Optional(str, max_len=100)
    promo_text = Optional(str, max_len=500)
    valid_from = Optional(datetime)
    valid_to = Optional(datetime)

    # Availability
    in_stock = Optional(bool)

    # Source information
    source = Required(str, max_len=50)  # cart, shop_scan, search, keywords

    # Relationships
    alert_events = Set("AlertEvent")

    # Indexes

    def __str__(self) -> str:
        """String representation of the price history entry."""
        return f"{self.product} at {self.store}: ${self.price} ({self.price_type}) on {self.observed_at}"


class Watch(db.Entity):
    """
    Watch entity representing user intent to track a specific product.
    """

    _table_ = "watch"

    # Primary key
    id = PrimaryKey(int, auto=True)

    # Foreign keys
    product = Required(Product)
    store = Optional(Store)  # If null, applies to any store

    # Watch configuration
    note = Optional(str, max_len=500)
    desired_price = Optional(Decimal, precision=10, scale=2)
    only_when = Required(str, max_len=30, default=OnlyWhenType.ANY_DROP)

    # Status
    active = Required(bool, default=True)

    # Timestamps
    created_at = Required(datetime, default=datetime.utcnow)

    # Relationships
    alert_events = Set("AlertEvent")

    # Constraints
    composite_key(product, store, active)

    def __str__(self) -> str:
        """String representation of the watch."""
        store_info = f" at {self.store}" if self.store else " (any store)"
        price_info = f" (target: ${self.desired_price})" if self.desired_price else ""
        return f"Watch {self.product}{store_info}{price_info}"


class AlertEvent(db.Entity):
    """
    Alert event entity representing a detected price change or condition.
    """

    _table_ = "alert_event"

    # Primary key
    id = PrimaryKey(int, auto=True)

    # Foreign keys
    watch = Required(Watch)
    price_history = Required(PriceHistory)

    # Alert details
    reason = Required(str, max_len=50)
    delta_amount = Required(Decimal, precision=10, scale=2)
    created_at = Required(datetime, default=datetime.utcnow)

    # Relationships
    notifications = Set("Notification")

    # Constraints
    composite_key(watch, price_history)

    def __str__(self) -> str:
        """String representation of the alert event."""
        return f"Alert: {self.reason} (${self.delta_amount}) for {self.watch}"


class Notification(db.Entity):
    """
    Notification entity tracking delivery of alerts through various channels.
    """

    _table_ = "notification"

    # Primary key
    id = PrimaryKey(int, auto=True)

    # Foreign key
    alert_event = Required(AlertEvent)

    # Notification details
    channel = Required(str, max_len=20)  # email
    sent_at = Optional(datetime)
    status = Required(str, max_len=20, default=NotificationStatus.PENDING)
    provider_message_id = Optional(str, max_len=200)

    # Constraints
    composite_key(alert_event, channel)

    def __str__(self) -> str:
        """String representation of the notification."""
        return f"Notification via {self.channel}: {self.status}"


class RunLog(db.Entity):
    """
    Run log entity for tracking command execution and observability.
    """

    _table_ = "run_log"

    # Primary key
    id = PrimaryKey(int, auto=True)

    # Execution details
    command = Required(str, max_len=100)
    started_at = Required(datetime, default=datetime.utcnow)
    finished_at = Optional(datetime)
    ok = Optional(bool)
    error = Optional(str, max_len=1000)

    def __str__(self) -> str:
        """String representation of the run log entry."""
        status = "✅" if self.ok else "❌" if self.ok is False else "⏳"
        return f"{status} {self.command} ({self.started_at})"


class SchemaVersion(db.Entity):
    """
    Schema version entity for tracking database migrations.
    """

    _table_ = "schema_version"

    # Primary key
    id = PrimaryKey(int, auto=True)

    # Version information
    version = Required(int)
    applied_at = Required(datetime, default=datetime.utcnow)
    description = Optional(str, max_len=500)

    def __str__(self) -> str:
        """String representation of the schema version."""
        return f"Schema version {self.version} applied at {self.applied_at}"
