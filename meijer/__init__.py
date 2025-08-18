"""
Meijer API Client Package

This package provides a comprehensive client for interacting with Meijer's APIs,
including shopping lists, coupons, product search, and Shop & Scan functionality.
"""

__version__ = "2.0.0"
__author__ = "Meijer API Client Contributors"

# Import main client
from .client import Meijer

# Import CLI functionality
from .cli import cli

# Import data models
from .models import (
    MeijerItem,
    ListItem,
    MeijerCoupon,
    Store,
    StoreHours,
    SearchResult,
    ItemType,
    AuthTokens,
    create_meijer_items_from_search,
)

# Import component classes
from .shopping_list import MeijerList
from .search import Search
from .shop_scan import ShopNScan
from .mperks import MPerksEarnedRewards, EarnedReward, MCardInfo
from .stores import MeijerStore, create_meijer_stores_from_response
from .gas import MeijerGas
from .feedback import MeijerFeedback, FeedbackFormData, MobileDeviceData
from .settings import MeijerSettings, VehicleInformation, CustomerPreference, PreferenceDiscreteChoice

# Import exceptions
from .exceptions import (
    MeijerError,
    MeijerAuthenticationError,
    MeijerAPIError,
    MeijerRateLimitError,
    CartError,
    FeedbackError,
)

__all__ = [
    # Main client
    "Meijer",
    # CLI functionality
    "cli",
    # Data models
    "MeijerItem",
    "ListItem",
    "MeijerCoupon",
    "Store",
    "StoreHours",
    "SearchResult",
    "ItemType",
    "AuthTokens",
    "create_meijer_items_from_search",
    # Component classes
    "MeijerList",
    "Search",
    "ShopNScan",
    "MPerksEarnedRewards",
    "EarnedReward",
    "MCardInfo",
    "MeijerStore",
    "create_meijer_stores_from_response",
    "MeijerGas",
    "MeijerFeedback",
    "FeedbackFormData",
    "MobileDeviceData",
    # Settings
    "MeijerSettings",
    "VehicleInformation",
    "CustomerPreference",
    "PreferenceDiscreteChoice",
    # Exceptions
    "MeijerError",
    "MeijerAuthenticationError",
    "MeijerAPIError",
    "MeijerRateLimitError",
    "CartError",
    "FeedbackError",
]
