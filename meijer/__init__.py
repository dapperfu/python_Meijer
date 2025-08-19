"""
Meijer API Client Package

This package provides a comprehensive client for interacting with Meijer's APIs,
including shopping lists, coupons, product search, and Shop & Scan functionality.
"""

__version__ = "2.0.0"
__author__ = "Meijer API Client Contributors"

# Import main client
# Import CLI functionality
# Import auth utilities
from .auth import (
    MeijerAuth,
    extract_bearer_token_from_mitmproxy,
    load_auth_from_config_file,
)
from .cli import cli
from .client import Meijer

# Import enums
from .enums import AuthenticationStatus

# Import exceptions
from .exceptions import (
    CartError,
    FeedbackError,
    MeijerAPIError,
    MeijerAuthenticationError,
    MeijerError,
    MeijerRateLimitError,
)
from .feedback import FeedbackFormData, MeijerFeedback, MobileDeviceData
from .gas import MeijerGas

# Import data models
from .models import (
    AuthTokens,
    ItemType,
    ListItem,
    MeijerCoupon,
    MeijerItem,
    SearchResult,
    Store,
    StoreHours,
    create_meijer_items_from_search,
)
from .mperks import (
    EarnableOffer,
    EarnedReward,
    EarnTabData,
    MCardInfo,
    MPerksEarnedRewards,
)
from .search import Search
from .settings import (
    CustomerPreference,
    MeijerSettings,
    PreferenceDiscreteChoice,
    VehicleInformation,
)
from .shop_scan import ShopNScan

# Import component classes
from .shopping_list import MeijerList
from .stores import MeijerStore, create_meijer_stores_from_response

__all__ = [
    # Main client
    "Meijer",
    # CLI functionality
    "cli",
    # Enums
    "AuthenticationStatus",
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
    "EarnableOffer",
    "EarnTabData",
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
    # Auth utilities
    "MeijerAuth",
    "extract_bearer_token_from_mitmproxy",
    "load_auth_from_config_file",
]
