"""
Meijer API Client Package

This package provides a comprehensive client for interacting with Meijer's APIs,
including shopping lists, coupons, product search, and Shop & Scan functionality.
"""

__version__ = "2.2.0"
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

# Import new enhanced modules
from .enhanced_cart import EnhancedCart, CartItem, CartSummary, CartModification
from .orders import OrderManager, OrderDetails, OrderSummary, OrderItem, OrderStatus, OrderType
# Temporarily commented out due to syntax errors
# from .homecards import (
#     HomeCardsManager, HomeCard, DepartmentCard, BuyAgainCard, 
#     MarketingCarouselCard, SeasonalCard, FavoritesOnSaleCard, CardType, ListType
# )

# Import Phase 3 advanced features - Temporarily commented out due to syntax errors
# from .recommendations import (
#     RecommendationsManager, RecommendationSet, RecommendationItem, 
#     RecommendationType, RecommendationSource, CustomerPreferences
# )
# from .product_operations import ProductOperations, EnhancedProductInfo

# Import Phase 4 specialized features - Temporarily commented out due to syntax errors
# from .notifications import (
#     NotificationManager, Notification, NotificationTemplate, 
#     NotificationPreference, NotificationType, NotificationCategory,
#     NotificationPriority, NotificationStatus, NotificationDelivery
# )
# from .promotions import (
#     PromotionsManager, Promotion, PromotionRule, DealOptimization,
#     FlashSale, PromotionType, PromotionStatus, DiscountType, EligibilityType
# )
# from .complex_cart import (
#     ComplexCartManager, CartValidationIssue, CartOptimizationResult,
#     CartSplitResult, CartOperationType, CartValidationStatus, CartItemStatus
# )

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
    # Enhanced modules (Phase 1-2)
    "EnhancedCart",
    "CartItem", 
    "CartSummary",
    "CartModification",
    "OrderManager",
    "OrderDetails",
    "OrderSummary",
    "OrderItem",
    "OrderStatus",
    "OrderType",
    # Temporarily commented out due to syntax errors
    # "HomeCardsManager",
    # "HomeCard",
    # "DepartmentCard",
    # "BuyAgainCard",
    # "MarketingCarouselCard",
    # "SeasonalCard",
    # "FavoritesOnSaleCard",
    # "CardType",
    # "ListType",
    # Advanced features (Phase 3) - Temporarily commented out due to syntax errors
    # "RecommendationsManager",
    # "RecommendationSet",
    # "RecommendationItem",
    # "RecommendationType",
    # "RecommendationSource",
    # "CustomerPreferences",
    # "ProductOperations",
    # "EnhancedProductInfo",
    # Specialized features (Phase 4) - Temporarily commented out due to syntax errors
    # "NotificationManager",
    # "Notification",
    # "NotificationTemplate",
    # "NotificationPreference",
    # "NotificationType",
    # "NotificationCategory",
    # "NotificationPriority",
    # "NotificationStatus",
    # "NotificationDelivery",
    # "PromotionsManager",
    # "Promotion",
    # "PromotionRule",
    # "DealOptimization",
    # "FlashSale",
    # "PromotionType",
    # "PromotionStatus",
    # "DiscountType",
    # "EligibilityType",
    # "ComplexCartManager",
    # "CartValidationIssue",
    # "CartOptimizationResult",
    # "CartSplitResult",
    # "CartOperationType",
    # "CartValidationStatus",
    # "CartItemStatus",
]
