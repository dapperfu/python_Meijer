"""
Meijer API Client Package

This package provides a comprehensive client for interacting with Meijer's APIs,
including shopping lists, coupons, product search, and Shop & Scan functionality.
"""

__version__ = "2.0.0"
__author__ = "Meijer API Client Contributors"

# Import main client class
from .client import Meijer

# Import data models
from .models import (
    MeijerItem,
    ListItem,
    MeijerCoupon,
    Store,
    SearchResult,
    ItemType
)

# Import component classes
from .shopping_list import MeijerList
from .coupons import MeijerCoupon
from .search import Search
from .shop_scan import ShopNScan

# Import exceptions
from .exceptions import (
    MeijerError,
    MeijerAuthenticationError,
    MeijerAPIError,
    MeijerRateLimitError
)

# Export main classes for easy access
__all__ = [
    "Meijer",
    "MeijerItem",
    "ListItem", 
    "MeijerCoupon",
    "Store",
    "SearchResult",
    "ItemType",
    "MeijerList",
    "Search",
    "ShopNScan",
    "MeijerError",
    "MeijerAuthenticationError",
    "MeijerAPIError",
    "MeijerRateLimitError"
]
