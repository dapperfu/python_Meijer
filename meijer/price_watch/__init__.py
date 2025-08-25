"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create __init__.py for Meijer price watch package
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: None
 */

Price Watch Package

This package provides price watching functionality for Meijer products,
including database management, price monitoring, and email alerts.
"""

from .database import (
    PriceWatchDatabase,
    get_price_watch_db,
    ensure_database_exists
)

from .manager import PriceWatchManager

from .email_config import (
    EmailConfig,
    EmailSender,
    create_email_config_template,
    get_email_config
)
from .templates.email_templates import EmailTemplateManager, template_manager

from .models.price_watch import (
    Product,
    Store,
    PriceHistory,
    Watch,
    AlertEvent,
    Notification,
    RunLog,
    SchemaVersion,
    PriceType,
    OnlyWhenType,
    NotificationStatus,
    AlertReason
)

__all__ = [
    # Database
    'PriceWatchDatabase',
    'get_price_watch_db',
    'ensure_database_exists',
    
    # Manager
    'PriceWatchManager',
    
    # Email
    'EmailConfig',
    'EmailSender',
    'create_email_config_template',
    'get_email_config',
    'EmailTemplateManager',
    'template_manager',
    
    # Models
    'Product',
    'Store',
    'PriceHistory',
    'Watch',
    'AlertEvent',
    'Notification',
    'RunLog',
    'SchemaVersion',
    'PriceType',
    'OnlyWhenType',
    'NotificationStatus',
    'AlertReason'
]

__version__ = "1.0.0"
