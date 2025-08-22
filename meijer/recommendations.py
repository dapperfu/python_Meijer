#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: ML-powered product recommendations system for advanced shopping features
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: typing, dataclasses, meijer package
 */

ML-Powered Product Recommendations System

This module provides advanced product recommendations using machine learning
algorithms and customer behavior analysis. It implements the product-recommendations
v1 endpoints discovered in the API analysis.
"""

from dataclasses import dataclass, field
from typing import Any, Dict, List, Optional, Union
from datetime import datetime
from enum import Enum

from .exceptions import MeijerError


class RecommendationType(Enum):
    """Recommendation type enumeration."""
    BUY_AGAIN = "buy-again"
    FREQUENTLY_BOUGHT = "frequently-bought"
    SIMILAR_PRODUCTS = "similar-products"
    TRENDING = "trending"
    PERSONALIZED = "personalized"
    SEASONAL = "seasonal"
    DEALS = "deals"


class RecommendationSource(Enum):
    """Source of recommendation."""
    PURCHASE_HISTORY = "purchase_history"
    BROWSE_HISTORY = "browse_history"
    CART_ANALYSIS = "cart_analysis"
    COLLABORATIVE_FILTERING = "collaborative_filtering"
    CONTENT_BASED = "content_based"
    ML_ALGORITHM = "ml_algorithm"


@dataclass
class RecommendationItem:
    """Individual product recommendation."""
    
    product_code: str
    """Product identifier (UPC, SKU, etc.)"""
    
    name: str
    """Product name"""
    
    confidence_score: float
    """ML confidence score (0.0 to 1.0)"""
    
    recommendation_reason: str
    """Why this item was recommended"""
    
    source: RecommendationSource
    """Source of the recommendation"""
    
    price: Optional[float] = None
    """Current product price"""
    
    original_price: Optional[float] = None
    """Original price if on sale"""
    
    image_url: Optional[str] = None
    """Product image URL"""
    
    category: Optional[str] = None
    """Product category"""
    
    brand: Optional[str] = None
    """Product brand"""
    
    rating: Optional[float] = None
    """Product rating (1-5 stars)"""
    
    review_count: Optional[int] = None
    """Number of reviews"""
    
    is_on_sale: bool = False
    """Whether the product is on sale"""
    
    discount_percentage: Optional[float] = None
    """Discount percentage if on sale"""
    
    last_purchased: Optional[datetime] = None
    """When this item was last purchased"""
    
    purchase_frequency: Optional[int] = None
    """How often this item is purchased"""
    
    seasonal_relevance: Optional[float] = None
    """Seasonal relevance score (0.0 to 1.0)")

@dataclass
class RecommendationSet:
    """Set of product recommendations."""
    
    recommendation_id: str
    """Unique recommendation set identifier"""
    
    customer_id: str
    """Customer identifier"""
    
    store_id: str
    """Store identifier"""
    
    recommendation_type: RecommendationType
    """Type of recommendations"""
    
    items: List[RecommendationItem]
    """List of recommended products"""
    
    total_count: int
    """Total number of recommendations"""
    
    confidence_threshold: float
    """Minimum confidence score for included items"""
    
    generated_at: datetime
    """When recommendations were generated"""
    
    expires_at: Optional[datetime] = None
    """When recommendations expire"""
    
    algorithm_version: Optional[str] = None
    """Version of ML algorithm used"""
    
    metadata: Dict[str, Any] = field(default_factory=dict)
    """Additional recommendation metadata"""


@dataclass
class CustomerPreferences:
    """Customer preference profile for recommendations."""
    
    customer_id: str
    """Customer identifier"""
    
    preferred_categories: List[str] = field(default_factory=list)
    """Preferred product categories"""
    
    preferred_brands: List[str] = field(default_factory=list)
    """Preferred product brands"""
    
    price_range: Optional[Dict[str, float]] = None
    """Preferred price range (min, max)"""
    
    dietary_restrictions: List[str] = field(default_factory=list)
    """Dietary restrictions and preferences"""
    
    household_size: Optional[int] = None
    """Household size for quantity preferences"""
    
    shopping_frequency: Optional[str] = None
    """How often customer shops (weekly, bi-weekly, monthly)"""
    
    preferred_stores: List[str] = field(default_factory=list)
    """Preferred store locations"""
    
    last_updated: datetime = field(default_factory=datetime.now)
    """When preferences were last updated")


class RecommendationsManager:
    """
    ML-powered product recommendations manager.
    
    This class provides advanced product recommendations using machine learning
    algorithms, customer behavior analysis, and collaborative filtering.
    """
    
    def __init__(self, client: Any):
        """
        Initialize the recommendations manager.
        
        Parameters
        ----------
        client : Any
            Meijer client instance for making API requests
        """
        self.client = client
        self.base_url = "https://api.meijer.com"
        
        # Product recommendations v1 endpoints
        self.endpoints = {
            "get_buy_again_recommendations": "/digital/product-recommendations/v1/customer/{customerId}/recommendations/buy-again/{count}/upc",
            "get_frequently_bought": "/digital/product-recommendations/v1/customer/{customerId}/recommendations/frequently-bought/{count}/upc",
            "get_similar_products": "/digital/product-recommendations/v1/product/{productId}/similar/{count}/upc",
            "get_trending_products": "/digital/product-recommendations/v1/trending/{category}/{count}/upc",
            "get_personalized_recommendations": "/digital/product-recommendations/v1/customer/{customerId}/personalized/{count}/upc",
            "get_seasonal_recommendations": "/digital/product-recommendations/v1/seasonal/{season}/{count}/upc",
            "get_deal_recommendations": "/digital/product-recommendations/v1/deals/{count}/upc",
            "update_preferences": "/digital/product-recommendations/v1/customer/{customerId}/preferences",
            "get_recommendation_insights": "/digital/product-recommendations/v1/customer/{customerId}/insights",
        }
    
    def get_buy_again_recommendations(self, 
                                    customer_id: str,
                                    count: int = 20,
                                    store_id: Optional[str] = None,
                                    category_filter: Optional[str] = None) -> RecommendationSet:
        """
        Get buy-again product recommendations.
        
        This endpoint provides ML-powered recommendations based on purchase history
        and customer behavior patterns.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        count : int, default=20
            Number of recommendations to return
        store_id : Optional[str], default=None
            Store identifier for store-specific recommendations
        category_filter : Optional[str], default=None
            Category filter for recommendations
        
        Returns
        -------
        RecommendationSet
            Set of buy-again recommendations
        
        Raises
        ------
        MeijerError
            If there's an error retrieving recommendations
        """
        try:
            endpoint = self.endpoints["get_buy_again_recommendations"].format(
                customerId=customer_id,
                count=count
            )
            params = {}
            
            if store_id:
                params["store"] = store_id
            if category_filter:
                params["category"] = category_filter
            
            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_buy_again_recommendations_response(response, customer_id, store_id)
            
        except Exception as e:
            raise MeijerError(f"Failed to get buy-again recommendations: {str(e)}") from e
    
    def get_frequently_bought_recommendations(self, 
                                           customer_id: str,
                                           count: int = 20,
                                           store_id: Optional[str] = None) -> RecommendationSet:
        """
        Get frequently bought together recommendations.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        count : int, default=20
            Number of recommendations to return
        store_id : Optional[str], default=None
            Store identifier for store-specific recommendations
        
        Returns
        -------
        RecommendationSet
            Set of frequently bought together recommendations
        """
        try:
            endpoint = self.endpoints["get_frequently_bought"].format(
                customerId=customer_id,
                count=count
            )
            params = {}
            
            if store_id:
                params["store"] = store_id
            
            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_frequently_bought_response(response, customer_id, store_id)
            
        except Exception as e:
            raise MeijerError(f"Failed to get frequently bought recommendations: {str(e)}") from e
    
    def get_similar_products(self, 
                           product_id: str,
                           count: int = 20,
                           store_id: Optional[str] = None) -> RecommendationSet:
        """
        Get similar product recommendations.
        
        Parameters
        ----------
        product_id : str
            Product identifier to find similar products for
        count : int, default=20
            Number of similar products to return
        store_id : Optional[str], default=None
            Store identifier for store-specific recommendations
        
        Returns
        -------
        RecommendationSet
            Set of similar product recommendations
        """
        try:
            endpoint = self.endpoints["get_similar_products"].format(
                productId=product_id,
                count=count
            )
            params = {}
            
            if store_id:
                params["store"] = store_id
            
            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_similar_products_response(response, product_id, store_id)
            
        except Exception as e:
            raise MeijerError(f"Failed to get similar products: {str(e)}") from e
    
    def get_trending_products(self, 
                            category: str,
                            count: int = 20,
                            store_id: Optional[str] = None,
                            time_period: str = "weekly") -> RecommendationSet:
        """
        Get trending products in a category.
        
        Parameters
        ----------
        category : str
            Product category for trending products
        count : int, default=20
            Number of trending products to return
        store_id : Optional[str], default=None
            Store identifier for store-specific trends
        time_period : str, default="weekly"
            Time period for trending analysis (daily, weekly, monthly)
        
        Returns
        -------
        RecommendationSet
            Set of trending product recommendations
        """
        try:
            endpoint = self.endpoints["get_trending_products"].format(
                category=category,
                count=count
            )
            params = {
                "timePeriod": time_period
            }
            
            if store_id:
                params["store"] = store_id
            
            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_trending_products_response(response, category, store_id)
            
        except Exception as e:
            raise MeijerError(f"Failed to get trending products: {str(e)}") from e
    
    def get_personalized_recommendations(self, 
                                       customer_id: str,
                                       count: int = 20,
                                       store_id: Optional[str] = None,
                                       include_categories: Optional[List[str]] = None,
                                       exclude_categories: Optional[List[str]] = None) -> RecommendationSet:
        """
        Get personalized product recommendations.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        count : int, default=20
            Number of recommendations to return
        store_id : Optional[str], default=None
            Store identifier for store-specific recommendations
        include_categories : Optional[List[str]], default=None
            Categories to include in recommendations
        exclude_categories : Optional[List[str]], default=None
            Categories to exclude from recommendations
        
        Returns
        -------
        RecommendationSet
            Set of personalized recommendations
        """
        try:
            endpoint = self.endpoints["get_personalized_recommendations"].format(
                customerId=customer_id,
                count=count
            )
            params = {}
            
            if store_id:
                params["store"] = store_id
            if include_categories:
                params["includeCategories"] = ",".join(include_categories)
            if exclude_categories:
                params["excludeCategories"] = ",".join(exclude_categories)
            
            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_personalized_recommendations_response(response, customer_id, store_id)
            
        except Exception as e:
            raise MeijerError(f"Failed to get personalized recommendations: {str(e)}") from e
    
    def update_customer_preferences(self, 
                                  customer_id: str,
                                  preferences: CustomerPreferences) -> Dict[str, Any]:
        """
        Update customer preferences for better recommendations.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        preferences : CustomerPreferences
            Updated customer preferences
        
        Returns
        -------
        Dict[str, Any]
            Confirmation of preference update
        """
        try:
            endpoint = self.endpoints["update_preferences"].format(customerId=customer_id)
            
            # Convert preferences to API format
            data = {
                "preferredCategories": preferences.preferred_categories,
                "preferredBrands": preferences.preferred_brands,
                "priceRange": preferences.price_range,
                "dietaryRestrictions": preferences.dietary_restrictions,
                "householdSize": preferences.household_size,
                "shoppingFrequency": preferences.shopping_frequency,
                "preferredStores": preferences.preferred_stores
            }
            
            response = self.client._make_request("POST", endpoint, json=data)
            return response
            
        except Exception as e:
            raise MeijerError(f"Failed to update customer preferences: {str(e)}") from e
    
    def get_recommendation_insights(self, customer_id: str) -> Dict[str, Any]:
        """
        Get insights about customer recommendations.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        
        Returns
        -------
        Dict[str, Any]
            Recommendation insights and analytics
        """
        try:
            endpoint = self.endpoints["get_recommendation_insights"].format(customerId=customer_id)
            
            response = self.client._make_request("GET", endpoint)
            return response
            
        except Exception as e:
            raise MeijerError(f"Failed to get recommendation insights: {str(e)}") from e
    
    def _parse_buy_again_recommendations_response(self, 
                                                response: Dict[str, Any],
                                                customer_id: str,
                                                store_id: Optional[str]) -> RecommendationSet:
        """Parse buy-again recommendations response."""
        try:
            items = []
            if "recommendations" in response:
                for rec_data in response["recommendations"]:
                    item = RecommendationItem(
                        product_code=rec_data.get("productCode", ""),
                        name=rec_data.get("productName", ""),
                        confidence_score=rec_data.get("confidenceScore", 0.0),
                        recommendation_reason=rec_data.get("reason", "Based on purchase history"),
                        source=RecommendationSource.PURCHASE_HISTORY,
                        price=rec_data.get("currentPrice"),
                        original_price=rec_data.get("originalPrice"),
                        image_url=rec_data.get("imageUrl"),
                        category=rec_data.get("category"),
                        brand=rec_data.get("brand"),
                        rating=rec_data.get("rating"),
                        review_count=rec_data.get("reviewCount"),
                        is_on_sale=rec_data.get("onSale", False),
                        discount_percentage=rec_data.get("discountPercentage"),
                        last_purchased=self._parse_datetime(rec_data.get("lastPurchased")),
                        purchase_frequency=rec_data.get("purchaseFrequency")
                    )
                    items.append(item)
            
            return RecommendationSet(
                recommendation_id=response.get("recommendationId", ""),
                customer_id=customer_id,
                store_id=store_id or "",
                recommendation_type=RecommendationType.BUY_AGAIN,
                items=items,
                total_count=len(items),
                confidence_threshold=response.get("confidenceThreshold", 0.5),
                generated_at=datetime.fromisoformat(response.get("generatedAt", datetime.now().isoformat())),
                expires_at=self._parse_datetime(response.get("expiresAt")),
                algorithm_version=response.get("algorithmVersion"),
                metadata=response.get("metadata", {})
            )
            
        except Exception as e:
            raise MeijerError(f"Failed to parse buy-again recommendations: {str(e)}") from e
    
    def _parse_frequently_bought_response(self, 
                                        response: Dict[str, Any],
                                        customer_id: str,
                                        store_id: Optional[str]) -> RecommendationSet:
        """Parse frequently bought recommendations response."""
        try:
            items = []
            if "recommendations" in response:
                for rec_data in response["recommendations"]:
                    item = RecommendationItem(
                        product_code=rec_data.get("productCode", ""),
                        name=rec_data.get("productName", ""),
                        confidence_score=rec_data.get("confidenceScore", 0.0),
                        recommendation_reason=rec_data.get("reason", "Frequently bought together"),
                        source=RecommendationSource.COLLABORATIVE_FILTERING,
                        price=rec_data.get("currentPrice"),
                        original_price=rec_data.get("originalPrice"),
                        image_url=rec_data.get("imageUrl"),
                        category=rec_data.get("category"),
                        brand=rec_data.get("brand"),
                        rating=rec_data.get("rating"),
                        review_count=rec_data.get("reviewCount"),
                        is_on_sale=rec_data.get("onSale", False),
                        discount_percentage=rec_data.get("discountPercentage")
                    )
                    items.append(item)
            
            return RecommendationSet(
                recommendation_id=response.get("recommendationId", ""),
                customer_id=customer_id,
                store_id=store_id or "",
                recommendation_type=RecommendationType.FREQUENTLY_BOUGHT,
                items=items,
                total_count=len(items),
                confidence_threshold=response.get("confidenceThreshold", 0.5),
                generated_at=datetime.fromisoformat(response.get("generatedAt", datetime.now().isoformat())),
                expires_at=self._parse_datetime(response.get("expiresAt")),
                algorithm_version=response.get("algorithmVersion"),
                metadata=response.get("metadata", {})
            )
            
        except Exception as e:
            raise MeijerError(f"Failed to parse frequently bought recommendations: {str(e)}") from e
    
    def _parse_similar_products_response(self, 
                                       response: Dict[str, Any],
                                       product_id: str,
                                       store_id: Optional[str]) -> RecommendationSet:
        """Parse similar products response."""
        try:
            items = []
            if "similarProducts" in response:
                for rec_data in response["similarProducts"]:
                    item = RecommendationItem(
                        product_code=rec_data.get("productCode", ""),
                        name=rec_data.get("productName", ""),
                        confidence_score=rec_data.get("similarityScore", 0.0),
                        recommendation_reason=rec_data.get("reason", "Similar to your selection"),
                        source=RecommendationSource.CONTENT_BASED,
                        price=rec_data.get("currentPrice"),
                        original_price=rec_data.get("originalPrice"),
                        image_url=rec_data.get("imageUrl"),
                        category=rec_data.get("category"),
                        brand=rec_data.get("brand"),
                        rating=rec_data.get("rating"),
                        review_count=rec_data.get("reviewCount"),
                        is_on_sale=rec_data.get("onSale", False),
                        discount_percentage=rec_data.get("discountPercentage")
                    )
                    items.append(item)
            
            return RecommendationSet(
                recommendation_id=response.get("recommendationId", ""),
                customer_id="",  # Not customer-specific
                store_id=store_id or "",
                recommendation_type=RecommendationType.SIMILAR_PRODUCTS,
                items=items,
                total_count=len(items),
                confidence_threshold=response.get("similarityThreshold", 0.5),
                generated_at=datetime.fromisoformat(response.get("generatedAt", datetime.now().isoformat())),
                expires_at=self._parse_datetime(response.get("expiresAt")),
                algorithm_version=response.get("algorithmVersion"),
                metadata=response.get("metadata", {})
            )
            
        except Exception as e:
            raise MeijerError(f"Failed to parse similar products: {str(e)}") from e
    
    def _parse_trending_products_response(self, 
                                        response: Dict[str, Any],
                                        category: str,
                                        store_id: Optional[str]) -> RecommendationSet:
        """Parse trending products response."""
        try:
            items = []
            if "trendingProducts" in response:
                for rec_data in response["trendingProducts"]:
                    item = RecommendationItem(
                        product_code=rec_data.get("productCode", ""),
                        name=rec_data.get("productName", ""),
                        confidence_score=rec_data.get("trendingScore", 0.0),
                        recommendation_reason=rec_data.get("reason", "Trending in this category"),
                        source=RecommendationSource.ML_ALGORITHM,
                        price=rec_data.get("currentPrice"),
                        original_price=rec_data.get("originalPrice"),
                        image_url=rec_data.get("imageUrl"),
                        category=rec_data.get("category"),
                        brand=rec_data.get("brand"),
                        rating=rec_data.get("rating"),
                        review_count=rec_data.get("reviewCount"),
                        is_on_sale=rec_data.get("onSale", False),
                        discount_percentage=rec_data.get("discountPercentage"),
                        seasonal_relevance=rec_data.get("seasonalRelevance")
                    )
                    items.append(item)
            
            return RecommendationSet(
                recommendation_id=response.get("recommendationId", ""),
                customer_id="",  # Not customer-specific
                store_id=store_id or "",
                recommendation_type=RecommendationType.TRENDING,
                items=items,
                total_count=len(items),
                confidence_threshold=response.get("trendingThreshold", 0.5),
                generated_at=datetime.fromisoformat(response.get("generatedAt", datetime.now().isoformat())),
                expires_at=self._parse_datetime(response.get("expiresAt")),
                algorithm_version=response.get("algorithmVersion"),
                metadata=response.get("metadata", {})
            )
            
        except Exception as e:
            raise MeijerError(f"Failed to parse trending products: {str(e)}") from e
    
    def _parse_personalized_recommendations_response(self, 
                                                   response: Dict[str, Any],
                                                   customer_id: str,
                                                   store_id: Optional[str]) -> RecommendationSet:
        """Parse personalized recommendations response."""
        try:
            items = []
            if "personalizedRecommendations" in response:
                for rec_data in response["personalizedRecommendations"]:
                    item = RecommendationItem(
                        product_code=rec_data.get("productCode", ""),
                        name=rec_data.get("productName", ""),
                        confidence_score=rec_data.get("personalizationScore", 0.0),
                        recommendation_reason=rec_data.get("reason", "Personalized for you"),
                        source=RecommendationSource.ML_ALGORITHM,
                        price=rec_data.get("currentPrice"),
                        original_price=rec_data.get("originalPrice"),
                        image_url=rec_data.get("imageUrl"),
                        category=rec_data.get("category"),
                        brand=rec_data.get("brand"),
                        rating=rec_data.get("rating"),
                        review_count=rec_data.get("reviewCount"),
                        is_on_sale=rec_data.get("onSale", False),
                        discount_percentage=rec_data.get("discountPercentage")
                    )
                    items.append(item)
            
            return RecommendationSet(
                recommendation_id=response.get("recommendationId", ""),
                customer_id=customer_id,
                store_id=store_id or "",
                recommendation_type=RecommendationType.PERSONALIZED,
                items=items,
                total_count=len(items),
                confidence_threshold=response.get("personalizationThreshold", 0.5),
                generated_at=datetime.fromisoformat(response.get("generatedAt", datetime.now().isoformat())),
                expires_at=self._parse_datetime(response.get("expiresAt")),
                algorithm_version=response.get("algorithmVersion"),
                metadata=response.get("metadata", {})
            )
            
        except Exception as e:
            raise MeijerError(f"Failed to parse personalized recommendations: {str(e)}") from e
    
    def _parse_datetime(self, datetime_str: Optional[str]) -> Optional[datetime]:
        """Parse datetime string safely."""
        if not datetime_str:
            return None
        
        try:
            return datetime.fromisoformat(datetime_str)
        except ValueError:
            return None
