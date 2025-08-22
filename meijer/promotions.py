#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Advanced promotions and deals management system for specialized shopping features
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: typing, dataclasses, meijer package
 */

Advanced Promotions and Deals Management System

This module provides comprehensive promotion management including dynamic pricing,
stackable discounts, loyalty rewards, and advanced deal optimization.
"""

from dataclasses import dataclass, field
from typing import Any, Dict, List, Optional, Union
from datetime import datetime, timedelta
from enum import Enum
import json

from .exceptions import MeijerError


class PromotionType(Enum):
    """Promotion type enumeration."""
    PERCENTAGE_OFF = "percentage_off"
    DOLLAR_OFF = "dollar_off"
    BUY_ONE_GET_ONE = "buy_one_get_one"
    BUY_X_GET_Y = "buy_x_get_y"
    FREE_SHIPPING = "free_shipping"
    LOYALTY_REWARD = "loyalty_reward"
    FLASH_SALE = "flash_sale"
    CLEARANCE = "clearance"
    SEASONAL = "seasonal"
    BUNDLE = "bundle"
    SUBSCRIPTION = "subscription"


class PromotionStatus(Enum):
    """Promotion status enumeration."""
    ACTIVE = "active"
    INACTIVE = "inactive"
    SCHEDULED = "scheduled"
    EXPIRED = "expired"
    PAUSED = "paused"
    ARCHIVED = "archived"


class DiscountType(Enum):
    """Discount type enumeration."""
    PERCENTAGE = "percentage"
    FIXED_AMOUNT = "fixed_amount"
    FREE_ITEM = "free_item"
    SHIPPING = "shipping"
    LOYALTY_POINTS = "loyalty_points"


class EligibilityType(Enum):
    """Promotion eligibility type."""
    ALL_CUSTOMERS = "all_customers"
    NEW_CUSTOMERS = "new_customers"
    EXISTING_CUSTOMERS = "existing_customers"
    LOYALTY_TIER = "loyalty_tier"
    MINIMUM_PURCHASE = "minimum_purchase"
    CATEGORY_SPEND = "category_spend"
    FIRST_TIME_BUYER = "first_time_buyer"


@dataclass
class PromotionRule:
    """Promotion rule configuration."""
    
    rule_id: str
    """Unique rule identifier"""
    
    name: str
    """Rule name"""
    
    description: str
    """Rule description"""
    
    promotion_type: PromotionType
    """Type of promotion"""
    
    discount_type: DiscountType
    """Type of discount"""
    
    discount_value: float
    """Discount value (percentage or amount)"""
    
    minimum_quantity: int = 1
    """Minimum quantity required"""
    
    maximum_quantity: Optional[int] = None
    """Maximum quantity allowed"""
    
    minimum_purchase_amount: Optional[float] = None
    """Minimum purchase amount required"""
    
    maximum_discount_amount: Optional[float] = None
    """Maximum discount amount allowed"""
    
    eligible_categories: List[str] = field(default_factory=list)
    """Eligible product categories"""
    
    eligible_products: List[str] = field(default_factory=list)
    """Eligible product codes"""
    
    excluded_products: List[str] = field(default_factory=list)
    """Excluded product codes"""
    
    stackable: bool = True
    """Whether promotion can be combined with others"""
    
    priority: int = 1
    """Promotion priority (lower = higher priority)"""
    
    is_active: bool = True
    """Whether rule is active"""


@dataclass
class Promotion:
    """Promotion instance."""
    
    promotion_id: str
    """Unique promotion identifier"""
    
    name: str
    """Promotion name"""
    
    description: str
    """Promotion description"""
    
    promotion_type: PromotionType
    """Type of promotion"""
    
    status: PromotionStatus
    """Current promotion status"""
    
    rules: List[PromotionRule]
    """Promotion rules"""
    
    start_date: datetime
    """Promotion start date"""
    
    end_date: datetime
    """Promotion end date"""
    
    eligibility_type: EligibilityType
    """Customer eligibility type"""
    
    loyalty_tier_required: Optional[str] = None
    """Required loyalty tier if applicable"""
    
    minimum_purchase_amount: Optional[float] = None
    """Minimum purchase amount required"""
    
    maximum_uses_per_customer: Optional[int] = None
    """Maximum uses per customer"""
    
    total_uses_allowed: Optional[int] = None
    """Total promotion uses allowed"""
    
    current_uses: int = 0
    """Current number of uses"""
    
    image_url: Optional[str] = None
    """Promotion image URL"""
    
    terms_and_conditions: Optional[str] = None
    """Terms and conditions"""
    
    created_at: datetime = field(default_factory=datetime.now)
    """Promotion creation timestamp"""
    
    updated_at: datetime = field(default_factory=datetime.now)
    """Promotion last update timestamp")


@dataclass
class DealOptimization:
    """Deal optimization result."""
    
    promotion_id: str
    """Promotion identifier"""
    
    original_price: float
    """Original price"""
    
    discounted_price: float
    """Price after discount"""
    
    savings_amount: float
    """Amount saved"""
    
    savings_percentage: float
    """Percentage saved"""
    
    applied_rules: List[PromotionRule]
    """Applied promotion rules"""
    
    stackable_discounts: List[str] = field(default_factory=list)
    """Additional stackable discounts"""
    
    total_savings: float
    """Total savings including stackable discounts"""
    
    optimization_score: float
    """Deal optimization score (0.0 to 1.0)"""


@dataclass
class FlashSale:
    """Flash sale configuration."""
    
    sale_id: str
    """Unique sale identifier"""
    
    name: str
    """Sale name"""
    
    description: str
    """Sale description"""
    
    start_time: datetime
    """Sale start time"""
    
    end_time: datetime
    """Sale end time"""
    
    discount_percentage: float
    """Discount percentage"""
    
    eligible_products: List[str]
    """Eligible product codes"""
    
    max_quantity_per_customer: Optional[int] = None
    """Maximum quantity per customer"""
    
    is_active: bool = True
    """Whether sale is active"""
    
    created_at: datetime = field(default_factory=datetime.now)


class PromotionsManager:
    """
    Advanced promotions and deals management system.
    
    This class provides comprehensive promotion management including
    dynamic pricing, stackable discounts, and deal optimization.
    """
    
    def __init__(self, client: Any):
        """
        Initialize the promotions manager.
        
        Parameters
        ----------
        client : Any
            Meijer client instance for making API requests
        """
        self.client = client
        self.base_url = "https://api.meijer.com"
        
        # Promotions endpoints
        self.endpoints = {
            "get_promotions": "/digital/promotions/v1/promotions",
            "get_promotion_details": "/digital/promotions/v1/promotions/{promotionId}",
            "get_customer_promotions": "/digital/promotions/v1/customer/{customerId}/promotions",
            "apply_promotion": "/digital/promotions/v1/promotions/{promotionId}/apply",
            "validate_promotion": "/digital/promotions/v1/promotions/{promotionId}/validate",
            "get_flash_sales": "/digital/promotions/v1/flash-sales",
            "get_deal_optimization": "/digital/promotions/v1/deals/optimize",
            "get_stackable_discounts": "/digital/promotions/v1/discounts/stackable",
            "get_loyalty_rewards": "/digital/promotions/v1/loyalty/rewards",
            "create_promotion": "/digital/promotions/v1/promotions",
            "update_promotion": "/digital/promotions/v1/promotions/{promotionId}",
            "delete_promotion": "/digital/promotions/v1/promotions/{promotionId}",
        }
    
    def get_active_promotions(self, 
                             store_id: Optional[str] = None,
                             category: Optional[str] = None,
                             promotion_type: Optional[PromotionType] = None) -> List[Promotion]:
        """
        Get active promotions.
        
        Parameters
        ----------
        store_id : Optional[str], default=None
            Store identifier for store-specific promotions
        category : Optional[str], default=None
            Product category filter
        promotion_type : Optional[PromotionType], default=None
            Promotion type filter
        
        Returns
        -------
        List[Promotion]
            List of active promotions
        """
        try:
            endpoint = self.endpoints["get_promotions"]
            
            params = {
                "status": "active",
                "includeRules": "true"
            }
            
            if store_id:
                params["storeId"] = store_id
            if category:
                params["category"] = category
            if promotion_type:
                params["promotionType"] = promotion_type.value
            
            response = self.client._make_request("GET", endpoint, params=params)
            
            if response and "promotions" in response:
                promotions = []
                for promo_data in response["promotions"]:
                    promotion = self._parse_promotion_response(promo_data)
                    if promotion:
                        promotions.append(promotion)
                return promotions
            
            return []
            
        except Exception as e:
            raise MeijerError(f"Failed to get active promotions: {str(e)}") from e
    
    def get_customer_promotions(self, 
                               customer_id: str,
                               store_id: Optional[str] = None,
                               include_expired: bool = False) -> List[Promotion]:
        """
        Get promotions available to a specific customer.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        store_id : Optional[str], default=None
            Store identifier
        include_expired : bool, default=False
            Whether to include expired promotions
        
        Returns
        -------
        List[Promotion]
            List of customer-eligible promotions
        """
        try:
            endpoint = self.endpoints["get_customer_promotions"].format(customerId=customer_id)
            
            params = {
                "includeExpired": include_expired,
                "includeRules": "true"
            }
            
            if store_id:
                params["storeId"] = store_id
            
            response = self.client._make_request("GET", endpoint, params=params)
            
            if response and "promotions" in response:
                promotions = []
                for promo_data in response["promotions"]:
                    promotion = self._parse_promotion_response(promo_data)
                    if promotion:
                        promotions.append(promotion)
                return promotions
            
            return []
            
        except Exception as e:
            raise MeijerError(f"Failed to get customer promotions: {str(e)}") from e
    
    def validate_promotion(self, 
                          promotion_id: str,
                          customer_id: str,
                          cart_items: List[Dict[str, Any]],
                          store_id: Optional[str] = None) -> Dict[str, Any]:
        """
        Validate if a promotion can be applied.
        
        Parameters
        ----------
        promotion_id : str
            Promotion identifier
        customer_id : str
            Customer identifier
        cart_items : List[Dict[str, Any]]
            Cart items to validate against
        store_id : Optional[str], default=None
            Store identifier
        
        Returns
        -------
        Dict[str, Any]
            Validation result with eligibility and discount details
        """
        try:
            endpoint = self.endpoints["validate_promotion"].format(promotionId=promotion_id)
            
            data = {
                "customerId": customer_id,
                "cartItems": cart_items
            }
            
            if store_id:
                data["storeId"] = store_id
            
            response = self.client._make_request("POST", endpoint, json=data)
            return response or {}
            
        except Exception as e:
            raise MeijerError(f"Failed to validate promotion: {str(e)}") from e
    
    def apply_promotion(self, 
                       promotion_id: str,
                       customer_id: str,
                       cart_items: List[Dict[str, Any]],
                       store_id: Optional[str] = None) -> Dict[str, Any]:
        """
        Apply a promotion to cart items.
        
        Parameters
        ----------
        promotion_id : str
            Promotion identifier
        customer_id : str
            Customer identifier
        cart_items : List[Dict[str, Any]]
            Cart items to apply promotion to
        store_id : Optional[str], default=None
            Store identifier
        
        Returns
        -------
        Dict[str, Any]
            Updated cart with applied promotion
        """
        try:
            endpoint = self.endpoints["apply_promotion"].format(promotionId=promotion_id)
            
            data = {
                "customerId": customer_id,
                "cartItems": cart_items
            }
            
            if store_id:
                data["storeId"] = store_id
            
            response = self.client._make_request("POST", endpoint, json=data)
            return response or {}
            
        except Exception as e:
            raise MeijerError(f"Failed to apply promotion: {str(e)}") from e
    
    def get_flash_sales(self, 
                        store_id: Optional[str] = None,
                        include_expired: bool = False) -> List[FlashSale]:
        """
        Get active flash sales.
        
        Parameters
        ----------
        store_id : Optional[str], default=None
            Store identifier
        include_expired : bool, default=False
            Whether to include expired sales
        
        Returns
        -------
        List[FlashSale]
            List of flash sales
        """
        try:
            endpoint = self.endpoints["get_flash_sales"]
            
            params = {
                "includeExpired": include_expired
            }
            
            if store_id:
                params["storeId"] = store_id
            
            response = self.client._make_request("GET", endpoint, params=params)
            
            if response and "flashSales" in response:
                sales = []
                for sale_data in response["flashSales"]:
                    sale = self._parse_flash_sale_response(sale_data)
                    if sale:
                        sales.append(sale)
                return sales
            
            return []
            
        except Exception as e:
            raise MeijerError(f"Failed to get flash sales: {str(e)}") from e
    
    def optimize_deals(self, 
                      cart_items: List[Dict[str, Any]],
                      customer_id: str,
                      store_id: Optional[str] = None,
                      include_loyalty: bool = True) -> List[DealOptimization]:
        """
        Optimize deals for maximum savings.
        
        Parameters
        ----------
        cart_items : List[Dict[str, Any]]
            Cart items to optimize
        customer_id : str
            Customer identifier
        store_id : Optional[str], default=None
            Store identifier
        include_loyalty : bool, default=True
            Whether to include loyalty rewards
        
        Returns
        -------
        List[DealOptimization]
            List of deal optimization results
        """
        try:
            endpoint = self.endpoints["get_deal_optimization"]
            
            data = {
                "cartItems": cart_items,
                "customerId": customer_id,
                "includeLoyalty": include_loyalty
            }
            
            if store_id:
                data["storeId"] = store_id
            
            response = self.client._make_request("POST", endpoint, json=data)
            
            if response and "optimizations" in response:
                optimizations = []
                for opt_data in response["optimizations"]:
                    optimization = self._parse_deal_optimization_response(opt_data)
                    if optimization:
                        optimizations.append(optimization)
                return optimizations
            
            return []
            
        except Exception as e:
            raise MeijerError(f"Failed to optimize deals: {str(e)}") from e
    
    def get_stackable_discounts(self, 
                               customer_id: str,
                               cart_total: float,
                               store_id: Optional[str] = None) -> List[Dict[str, Any]]:
        """
        Get stackable discounts for a customer.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        cart_total : float
            Current cart total
        store_id : Optional[str], default=None
            Store identifier
        
        Returns
        -------
        List[Dict[str, Any]]
            List of stackable discounts
        """
        try:
            endpoint = self.endpoints["get_stackable_discounts"]
            
            params = {
                "customerId": customer_id,
                "cartTotal": cart_total
            }
            
            if store_id:
                params["storeId"] = store_id
            
            response = self.client._make_request("GET", endpoint, params=params)
            
            if response and "discounts" in response:
                return response["discounts"]
            
            return []
            
        except Exception as e:
            raise MeijerError(f"Failed to get stackable discounts: {str(e)}") from e
    
    def get_loyalty_rewards(self, 
                           customer_id: str,
                           store_id: Optional[str] = None) -> List[Dict[str, Any]]:
        """
        Get available loyalty rewards.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        store_id : Optional[str], default=None
            Store identifier
        
        Returns
        -------
        List[Dict[str, Any]]
            List of loyalty rewards
        """
        try:
            endpoint = self.endpoints["get_loyalty_rewards"]
            
            params = {
                "customerId": customer_id
            }
            
            if store_id:
                params["storeId"] = store_id
            
            response = self.client._make_request("GET", endpoint, params=params)
            
            if response and "rewards" in response:
                return response["rewards"]
            
            return []
            
        except Exception as e:
            raise MeijerError(f"Failed to get loyalty rewards: {str(e)}") from e
    
    def create_promotion(self, promotion: Promotion) -> Promotion:
        """
        Create a new promotion.
        
        Parameters
        ----------
        promotion : Promotion
            Promotion to create
        
        Returns
        -------
        Promotion
            Created promotion with ID
        """
        try:
            endpoint = self.endpoints["create_promotion"]
            
            data = {
                "name": promotion.name,
                "description": promotion.description,
                "promotionType": promotion.promotion_type.value,
                "status": promotion.status.value,
                "rules": [self._serialize_promotion_rule(rule) for rule in promotion.rules],
                "startDate": promotion.start_date.isoformat(),
                "endDate": promotion.end_date.isoformat(),
                "eligibilityType": promotion.eligibility_type.value,
                "loyaltyTierRequired": promotion.loyalty_tier_required,
                "minimumPurchaseAmount": promotion.minimum_purchase_amount,
                "maximumUsesPerCustomer": promotion.maximum_uses_per_customer,
                "totalUsesAllowed": promotion.total_uses_allowed,
                "imageUrl": promotion.image_url,
                "termsAndConditions": promotion.terms_and_conditions
            }
            
            response = self.client._make_request("POST", endpoint, json=data)
            
            if response:
                return self._parse_promotion_response(response)
            
            raise MeijerError("Failed to create promotion")
            
        except Exception as e:
            raise MeijerError(f"Failed to create promotion: {str(e)}") from e
    
    def update_promotion(self, promotion_id: str, updates: Dict[str, Any]) -> Promotion:
        """
        Update an existing promotion.
        
        Parameters
        ----------
        promotion_id : str
            Promotion identifier
        updates : Dict[str, Any]
            Fields to update
        
        Returns
        -------
        Promotion
            Updated promotion
        """
        try:
            endpoint = self.endpoints["update_promotion"].format(promotionId=promotion_id)
            
            response = self.client._make_request("PUT", endpoint, json=updates)
            
            if response:
                return self._parse_promotion_response(response)
            
            raise MeijerError("Failed to update promotion")
            
        except Exception as e:
            raise MeijerError(f"Failed to update promotion: {str(e)}") from e
    
    def delete_promotion(self, promotion_id: str) -> bool:
        """
        Delete a promotion.
        
        Parameters
        ----------
        promotion_id : str
            Promotion identifier
        
        Returns
        -------
        bool
            True if successfully deleted
        """
        try:
            endpoint = self.endpoints["delete_promotion"].format(promotionId=promotion_id)
            
            response = self.client._make_request("DELETE", endpoint)
            return response is not None
            
        except Exception as e:
            raise MeijerError(f"Failed to delete promotion: {str(e)}") from e
    
    def calculate_maximum_savings(self, 
                                cart_items: List[Dict[str, Any]],
                                customer_id: str,
                                store_id: Optional[str] = None) -> Dict[str, Any]:
        """
        Calculate maximum possible savings for cart items.
        
        Parameters
        ----------
        cart_items : List[Dict[str, Any]]
            Cart items to analyze
        customer_id : str
            Customer identifier
        store_id : Optional[str], default=None
            Store identifier
        
        Returns
        -------
        Dict[str, Any]
            Maximum savings calculation
        """
        try:
            # Get all available promotions
            promotions = self.get_customer_promotions(customer_id, store_id)
            
            # Get deal optimizations
            optimizations = self.optimize_deals(cart_items, customer_id, store_id)
            
            # Get stackable discounts
            cart_total = sum(item.get("price", 0) * item.get("quantity", 1) for item in cart_items)
            stackable_discounts = self.get_stackable_discounts(customer_id, cart_total, store_id)
            
            # Calculate maximum savings
            total_savings = 0
            applied_promotions = []
            
            for optimization in optimizations:
                total_savings += optimization.total_savings
                applied_promotions.append({
                    "promotionId": optimization.promotion_id,
                    "savings": optimization.total_savings,
                    "type": "promotion"
                })
            
            for discount in stackable_discounts:
                discount_amount = discount.get("amount", 0)
                total_savings += discount_amount
                applied_promotions.append({
                    "discountId": discount.get("id"),
                    "savings": discount_amount,
                    "type": "stackable_discount"
                })
            
            return {
                "totalSavings": total_savings,
                "originalTotal": cart_total,
                "finalTotal": cart_total - total_savings,
                "savingsPercentage": (total_savings / cart_total * 100) if cart_total > 0 else 0,
                "appliedPromotions": applied_promotions,
                "optimizationScore": sum(opt.optimization_score for opt in optimizations) / len(optimizations) if optimizations else 0
            }
            
        except Exception as e:
            raise MeijerError(f"Failed to calculate maximum savings: {str(e)}") from e
    
    def _parse_promotion_response(self, response: Dict[str, Any]) -> Optional[Promotion]:
        """Parse promotion response."""
        try:
            if not response:
                return None
            
            rules = []
            if "rules" in response:
                for rule_data in response["rules"]:
                    rule = self._parse_promotion_rule_response(rule_data)
                    if rule:
                        rules.append(rule)
            
            return Promotion(
                promotion_id=response.get("promotionId", ""),
                name=response.get("name", ""),
                description=response.get("description", ""),
                promotion_type=PromotionType(response.get("promotionType", "percentage_off")),
                status=PromotionStatus(response.get("status", "inactive")),
                rules=rules,
                start_date=self._parse_datetime(response.get("startDate")),
                end_date=self._parse_datetime(response.get("endDate")),
                eligibility_type=EligibilityType(response.get("eligibilityType", "all_customers")),
                loyalty_tier_required=response.get("loyaltyTierRequired"),
                minimum_purchase_amount=response.get("minimumPurchaseAmount"),
                maximum_uses_per_customer=response.get("maximumUsesPerCustomer"),
                total_uses_allowed=response.get("totalUsesAllowed"),
                current_uses=response.get("currentUses", 0),
                image_url=response.get("imageUrl"),
                terms_and_conditions=response.get("termsAndConditions"),
                created_at=self._parse_datetime(response.get("createdAt")),
                updated_at=self._parse_datetime(response.get("updatedAt"))
            )
            
        except Exception as e:
            raise MeijerError(f"Failed to parse promotion response: {str(e)}") from e
    
    def _parse_promotion_rule_response(self, response: Dict[str, Any]) -> Optional[PromotionRule]:
        """Parse promotion rule response."""
        try:
            if not response:
                return None
            
            return PromotionRule(
                rule_id=response.get("ruleId", ""),
                name=response.get("name", ""),
                description=response.get("description", ""),
                promotion_type=PromotionType(response.get("promotionType", "percentage_off")),
                discount_type=DiscountType(response.get("discountType", "percentage")),
                discount_value=response.get("discountValue", 0.0),
                minimum_quantity=response.get("minimumQuantity", 1),
                maximum_quantity=response.get("maximumQuantity"),
                minimum_purchase_amount=response.get("minimumPurchaseAmount"),
                maximum_discount_amount=response.get("maximumDiscountAmount"),
                eligible_categories=response.get("eligibleCategories", []),
                eligible_products=response.get("eligibleProducts", []),
                excluded_products=response.get("excludedProducts", []),
                stackable=response.get("stackable", True),
                priority=response.get("priority", 1),
                is_active=response.get("isActive", True)
            )
            
        except Exception as e:
            raise MeijerError(f"Failed to parse promotion rule response: {str(e)}") from e
    
    def _parse_flash_sale_response(self, response: Dict[str, Any]) -> Optional[FlashSale]:
        """Parse flash sale response."""
        try:
            if not response:
                return None
            
            return FlashSale(
                sale_id=response.get("saleId", ""),
                name=response.get("name", ""),
                description=response.get("description", ""),
                start_time=self._parse_datetime(response.get("startTime")),
                end_time=self._parse_datetime(response.get("endTime")),
                discount_percentage=response.get("discountPercentage", 0.0),
                eligible_products=response.get("eligibleProducts", []),
                max_quantity_per_customer=response.get("maxQuantityPerCustomer"),
                is_active=response.get("isActive", True),
                created_at=self._parse_datetime(response.get("createdAt"))
            )
            
        except Exception as e:
            raise MeijerError(f"Failed to parse flash sale response: {str(e)}") from e
    
    def _parse_deal_optimization_response(self, response: Dict[str, Any]) -> Optional[DealOptimization]:
        """Parse deal optimization response."""
        try:
            if not response:
                return None
            
            applied_rules = []
            if "appliedRules" in response:
                for rule_data in response["appliedRules"]:
                    rule = self._parse_promotion_rule_response(rule_data)
                    if rule:
                        applied_rules.append(rule)
            
            return DealOptimization(
                promotion_id=response.get("promotionId", ""),
                original_price=response.get("originalPrice", 0.0),
                discounted_price=response.get("discountedPrice", 0.0),
                savings_amount=response.get("savingsAmount", 0.0),
                savings_percentage=response.get("savingsPercentage", 0.0),
                applied_rules=applied_rules,
                stackable_discounts=response.get("stackableDiscounts", []),
                total_savings=response.get("totalSavings", 0.0),
                optimization_score=response.get("optimizationScore", 0.0)
            )
            
        except Exception as e:
            raise MeijerError(f"Failed to parse deal optimization response: {str(e)}") from e
    
    def _serialize_promotion_rule(self, rule: PromotionRule) -> Dict[str, Any]:
        """Serialize promotion rule for API."""
        return {
            "name": rule.name,
            "description": rule.description,
            "promotionType": rule.promotion_type.value,
            "discountType": rule.discount_type.value,
            "discountValue": rule.discount_value,
            "minimumQuantity": rule.minimum_quantity,
            "maximumQuantity": rule.maximum_quantity,
            "minimumPurchaseAmount": rule.minimum_purchase_amount,
            "maximumDiscountAmount": rule.maximum_discount_amount,
            "eligibleCategories": rule.eligible_categories,
            "eligibleProducts": rule.eligible_products,
            "excludedProducts": rule.excluded_products,
            "stackable": rule.stackable,
            "priority": rule.priority,
            "isActive": rule.is_active
        }
    
    def _parse_datetime(self, datetime_str: Optional[str]) -> Optional[datetime]:
        """Parse datetime string safely."""
        if not datetime_str:
            return None
        
        try:
            return datetime.fromisoformat(datetime_str)
        except ValueError:
            return None
