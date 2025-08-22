#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Home cards system for managing homepage content and recommendations
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: typing, dataclasses, meijer package
 */

Home Cards Management System

This module provides home page content management including department shopping,
buy-again recommendations, marketing carousels, and seasonal content using the
homecards v1 endpoints discovered in the API analysis.
"""

from dataclasses import dataclass, field
from typing import Any, Dict, List, Optional, Union
from datetime import datetime
from enum import Enum

from .exceptions import MeijerError


class CardType(Enum):
    """Home card type enumeration."""
    DEPARTMENT = "department"
    BUY_AGAIN = "buy_again"
    SEASONAL = "seasonal"
    MARKETING = "marketing"
    FAVORITES_ON_SALE = "favorites_on_sale"
    RECOMMENDATIONS = "recommendations"


class ListType(Enum):
    """List type for recommendations."""
    HOMEPAGE = 0
    FAVORITES = 1
    RECENT_PURCHASES = 2


@dataclass
class HomeCard:
    """Home page content card."""
    
    card_id: str
    """Unique card identifier"""
    
    card_type: CardType
    """Type of content card"""
    
    title: str
    """Card title"""
    
    subtitle: Optional[str] = None
    """Card subtitle"""
    
    description: Optional[str] = None
    """Card description"""
    
    image_url: Optional[str] = None
    """Card image URL"""
    
    background_color: Optional[str] = None
    """Card background color"""
    
    text_color: Optional[str] = None
    """Card text color"""
    
    priority: int = 0
    """Display priority (lower = higher priority)"""
    
    is_active: bool = True
    """Whether the card is currently active"""
    
    valid_from: Optional[datetime] = None
    """When the card becomes valid"""
    
    valid_until: Optional[datetime] = None
    """When the card expires"""
    
    created_at: datetime = field(default_factory=datetime.now)
    """When the card was created"""
    
    last_updated: datetime = field(default_factory=datetime.now)
    """When the card was last updated"""


@dataclass
class DepartmentCard(HomeCard):
    """Department shopping card."""
    
    department_id: str
    """Department identifier"""
    
    department_name: str
    """Department name"""
    
    product_count: int
    """Number of products in department"""
    
    featured_products: List[Dict[str, Any]] = field(default_factory=list)
    """Featured products in this department"""
    
    subcategories: List[str] = field(default_factory=list)
    """Subcategories within this department")


@dataclass
class BuyAgainCard(HomeCard):
    """Buy again recommendations card."""
    
    customer_id: str
    """Customer identifier"""
    
    store_id: str
    """Store identifier"""
    
    recommendation_count: int
    """Number of recommendations"""
    
    recommendations: List[Dict[str, Any]] = field(default_factory=list)
    """Product recommendations"""
    
    confidence_score: Optional[float] = None
    """ML confidence score for recommendations"""
    
    last_purchase_date: Optional[datetime] = None
    """When items were last purchased")


@dataclass
class MarketingCarouselCard(HomeCard):
    """Marketing carousel card."""
    
    carousel_id: str
    """Carousel identifier"""
    
    carousel_type: str
    """Type of carousel (1, 2, 3, etc.)"""
    
    slides: List[Dict[str, Any]] = field(default_factory=list)
    """Carousel slides"""
    
    auto_play: bool = True
    """Whether carousel auto-plays"""
    
    slide_duration: int = 5000
    """Slide duration in milliseconds")


@dataclass
class SeasonalCard(HomeCard):
    """Seasonal content card."""
    
    season: str
    """Season name (Spring, Summer, Fall, Winter)"""
    
    year: int
    """Year for seasonal content"""
    
    theme: str
    """Seasonal theme"""
    
    seasonal_products: List[Dict[str, Any]] = field(default_factory=list)
    """Seasonal product offerings")


@dataclass
class FavoritesOnSaleCard(HomeCard):
    """Favorites on sale card."""
    
    customer_id: str
    """Customer identifier"""
    
    store_id: str
    """Store identifier"""
    
    on_sale_count: int
    """Number of favorite items on sale"""
    
    sale_items: List[Dict[str, Any]] = field(default_factory=list)
    """Favorite items currently on sale")
    
    total_savings: Optional[float] = None
    """Total potential savings")


class HomeCardsManager:
    """
    Home page content management system.
    
    This class provides comprehensive home page content management including
    department shopping, recommendations, marketing content, and seasonal offers.
    """
    
    def __init__(self, client: Any):
        """
        Initialize the home cards manager.
        
        Parameters
        ----------
        client : Any
            Meijer client instance for making API requests
        """
        self.client = client
        self.base_url = "https://api.meijer.com"
        
        # Home cards v1 endpoints
        self.endpoints = {
            "get_cards": "/digital/homecards/v1/cards",
            "get_department_cards": "/digital/homecards/v1/cards/shopByDepartmentV2",
            "get_buy_again_cards": "/digital/homecards/v1/cards/buyAgainV2",
            "get_seasonal_cards": "/digital/homecards/v1/cards/seasonalCarousel",
            "get_marketing_carousel_1": "/digital/homecards/v1/cards/marketing-carousel-1",
            "get_marketing_carousel_2": "/digital/homecards/v1/cards/marketing-carousel-2",
            "get_marketing_carousel_3": "/digital/homecards/v1/cards/marketing-carousel-3",
            "get_favorites_on_sale": "/digital/homecards/v1/cards/favoritesOnSaleV2",
            "get_recommendations": "/digital/homecards/v1/cards/meijerRecommendations",
        }
    
    def get_cards(self, customer_id: Optional[str] = None) -> List[HomeCard]:
        """
        Get main homepage content cards.
        
        This endpoint was hit 65 times and provides the main homepage content.
        
        Parameters
        ----------
        customer_id : Optional[str], default=None
            Customer identifier for personalized content
        
        Returns
        -------
        List[HomeCard]
            List of home page content cards
        
        Raises
        ------
        MeijerError
            If there's an error retrieving home cards
        """
        try:
            endpoint = self.endpoints["get_cards"]
            params = {}
            
            if customer_id:
                params["customerId"] = customer_id
            
            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_cards_response(response)
            
        except Exception as e:
            raise MeijerError(f"Failed to get home cards: {str(e)}") from e
    
    def get_department_cards(self, 
                           customer_id: Optional[str] = None,
                           store_id: Optional[str] = None) -> List[DepartmentCard]:
        """
        Get department-based shopping cards.
        
        This endpoint was hit 69 times and provides department shopping
        recommendations and navigation.
        
        Parameters
        ----------
        customer_id : Optional[str], default=None
            Customer identifier for personalized content
        store_id : Optional[str], default=None
            Store identifier for store-specific content
        
        Returns
        -------
        List[DepartmentCard]
            List of department shopping cards
        
        Raises
        ------
        MeijerError
            If there's an error retrieving department cards
        """
        try:
            endpoint = self.endpoints["get_department_cards"]
            params = {}
            
            if customer_id:
                params["customerId"] = customer_id
            if store_id:
                params["store"] = store_id
            
            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_department_cards_response(response)
            
        except Exception as e:
            raise MeijerError(f"Failed to get department cards: {str(e)}") from e
    
    def get_buy_again_cards(self, 
                           customer_id: str,
                           store_id: str,
                           page_num: int = 1,
                           list_type: ListType = ListType.HOMEPAGE,
                           page_name: str = "homepage_app") -> List[BuyAgainCard]:
        """
        Get buy-again product recommendations.
        
        This endpoint was hit 69 times and provides ML-powered product
        recommendations based on purchase history.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        store_id : str
            Store identifier
        page_num : int, default=1
            Page number for pagination
        list_type : ListType, default=ListType.HOMEPAGE
            Type of recommendation list
        page_name : str, default="homepage_app"
            Name of the page requesting recommendations
        
        Returns
        -------
        List[BuyAgainCard]
            List of buy-again recommendation cards
        
        Raises
        ------
        MeijerError
            If there's an error retrieving buy-again cards
        """
        try:
            endpoint = self.endpoints["get_buy_again_cards"]
            params = {
                "customerId": customer_id,
                "store": store_id,
                "pageNum": page_num,
                "listType": list_type.value,
                "pageName": page_name
            }
            
            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_buy_again_cards_response(response)
            
        except Exception as e:
            raise MeijerError(f"Failed to get buy-again cards: {str(e)}") from e
    
    def get_seasonal_cards(self, 
                          customer_id: Optional[str] = None,
                          store_id: Optional[str] = None) -> List[SeasonalCard]:
        """
        Get seasonal content carousel.
        
        This endpoint was hit 64 times and provides seasonal product
        offerings and themed content.
        
        Parameters
        ----------
        customer_id : Optional[str], default=None
            Customer identifier for personalized content
        store_id : Optional[str], default=None
            Store identifier for store-specific content
        
        Returns
        -------
        List[SeasonalCard]
            List of seasonal content cards
        
        Raises
        ------
        MeijerError
            If there's an error retrieving seasonal cards
        """
        try:
            endpoint = self.endpoints["get_seasonal_cards"]
            params = {}
            
            if customer_id:
                params["customerId"] = customer_id
            if store_id:
                params["store"] = store_id
            
            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_seasonal_cards_response(response)
            
        except Exception as e:
            raise MeijerError(f"Failed to get seasonal cards: {str(e)}") from e
    
    def get_marketing_carousel(self, 
                              carousel_number: int,
                              customer_id: Optional[str] = None,
                              store_id: Optional[str] = None) -> MarketingCarouselCard:
        """
        Get marketing carousel content.
        
        These endpoints were hit 64 times each and provide promotional
        content and marketing offers.
        
        Parameters
        ----------
        carousel_number : int
            Carousel number (1, 2, or 3)
        customer_id : Optional[str], default=None
            Customer identifier for personalized content
        store_id : Optional[str], default=None
            Store identifier for store-specific content
        
        Returns
        -------
        MarketingCarouselCard
            Marketing carousel card
        
        Raises
        ------
        MeijerError
            If there's an error retrieving marketing carousel
        """
        try:
            if carousel_number not in [1, 2, 3]:
                raise ValueError("Carousel number must be 1, 2, or 3")
            
            endpoint = self.endpoints[f"get_marketing_carousel_{carousel_number}"]
            params = {}
            
            if customer_id:
                params["customerId"] = customer_id
            if store_id:
                params["store"] = store_id
            
            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_marketing_carousel_response(response, carousel_number)
            
        except Exception as e:
            raise MeijerError(f"Failed to get marketing carousel {carousel_number}: {str(e)}") from e
    
    def get_favorites_on_sale(self, 
                             customer_id: str,
                             store_id: str,
                             page_num: int = 1,
                             list_type: ListType = ListType.FAVORITES,
                             page_name: str = "homepage_favonsale_app") -> FavoritesOnSaleCard:
        """
        Get favorites on sale content.
        
        This endpoint was hit 64 times and provides personalized
        sale information for favorite items.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        store_id : str
            Store identifier
        page_num : int, default=1
            Page number for pagination
        list_type : ListType, default=ListType.FAVORITES
            Type of favorites list
        page_name : str, default="homepage_favonsale_app"
            Name of the page requesting content
        
        Returns
        -------
        FavoritesOnSaleCard
            Favorites on sale card
        
        Raises
        ------
        MeijerError
            If there's an error retrieving favorites on sale
        """
        try:
            endpoint = self.endpoints["get_favorites_on_sale"]
            params = {
                "customerId": customer_id,
                "store": store_id,
                "pageNum": page_num,
                "listType": list_type.value,
                "pageName": page_name
            }
            
            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_favorites_on_sale_response(response)
            
        except Exception as e:
            raise MeijerError(f"Failed to get favorites on sale: {str(e)}") from e
    
    def get_recommendations(self, 
                           customer_id: Optional[str] = None,
                           store_id: Optional[str] = None) -> List[HomeCard]:
        """
        Get general product recommendations.
        
        This endpoint was hit 55 times and provides general product
        recommendations and suggestions.
        
        Parameters
        ----------
        customer_id : Optional[str], default=None
            Customer identifier for personalized recommendations
        store_id : Optional[str], default=None
            Store identifier for store-specific recommendations
        
        Returns
        -------
        List[HomeCard]
            List of recommendation cards
        
        Raises
        ------
        MeijerError
            If there's an error retrieving recommendations
        """
        try:
            endpoint = self.endpoints["get_recommendations"]
            params = {}
            
            if customer_id:
                params["customerId"] = customer_id
            if store_id:
                params["store"] = store_id
            
            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_recommendations_response(response)
            
        except Exception as e:
            raise MeijerError(f"Failed to get recommendations: {str(e)}") from e
    
    def _parse_cards_response(self, response: Dict[str, Any]) -> List[HomeCard]:
        """Parse general cards response."""
        cards = []
        if "cards" in response:
            for card_data in response["cards"]:
                card = HomeCard(
                    card_id=card_data.get("id", ""),
                    card_type=CardType(card_data.get("type", "unknown")),
                    title=card_data.get("title", ""),
                    subtitle=card_data.get("subtitle"),
                    description=card_data.get("description"),
                    image_url=card_data.get("imageUrl"),
                    background_color=card_data.get("backgroundColor"),
                    text_color=card_data.get("textColor"),
                    priority=card_data.get("priority", 0),
                    is_active=card_data.get("active", True),
                    valid_from=self._parse_datetime(card_data.get("validFrom")),
                    valid_until=self._parse_datetime(card_data.get("validUntil")),
                    created_at=self._parse_datetime(card_data.get("createdAt")),
                    last_updated=self._parse_datetime(card_data.get("updatedAt"))
                )
                cards.append(card)
        return cards
    
    def _parse_department_cards_response(self, response: Dict[str, Any]) -> List[DepartmentCard]:
        """Parse department cards response."""
        cards = []
        if "departments" in response:
            for dept_data in response["departments"]:
                card = DepartmentCard(
                    card_id=dept_data.get("id", ""),
                    card_type=CardType.DEPARTMENT,
                    title=dept_data.get("name", ""),
                    department_id=dept_data.get("code", ""),
                    department_name=dept_data.get("name", ""),
                    product_count=dept_data.get("productCount", 0),
                    featured_products=dept_data.get("featuredProducts", []),
                    subcategories=dept_data.get("subcategories", []),
                    image_url=dept_data.get("imageUrl"),
                    priority=dept_data.get("priority", 0)
                )
                cards.append(card)
        return cards
    
    def _parse_buy_again_cards_response(self, response: Dict[str, Any]) -> List[BuyAgainCard]:
        """Parse buy-again cards response."""
        cards = []
        if "recommendations" in response:
            for rec_data in response["recommendations"]:
                card = BuyAgainCard(
                    card_id=rec_data.get("id", ""),
                    card_type=CardType.BUY_AGAIN,
                    title="Buy Again",
                    customer_id=response.get("customerId", ""),
                    store_id=response.get("storeId", ""),
                    recommendation_count=len(rec_data.get("products", [])),
                    recommendations=rec_data.get("products", []),
                    confidence_score=rec_data.get("confidenceScore"),
                    last_purchase_date=self._parse_datetime(rec_data.get("lastPurchaseDate"))
                )
                cards.append(card)
        return cards
    
    def _parse_seasonal_cards_response(self, response: Dict[str, Any]) -> List[SeasonalCard]:
        """Parse seasonal cards response."""
        cards = []
        if "seasonalContent" in response:
            for seasonal_data in response["seasonalContent"]:
                card = SeasonalCard(
                    card_id=seasonal_data.get("id", ""),
                    card_type=CardType.SEASONAL,
                    title=seasonal_data.get("title", ""),
                    season=seasonal_data.get("season", ""),
                    year=seasonal_data.get("year", datetime.now().year),
                    theme=seasonal_data.get("theme", ""),
                    seasonal_products=seasonal_data.get("products", []),
                    image_url=seasonal_data.get("imageUrl")
                )
                cards.append(card)
        return cards
    
    def _parse_marketing_carousel_response(self, response: Dict[str, Any], carousel_number: int) -> MarketingCarouselCard:
        """Parse marketing carousel response."""
        carousel_data = response.get("carousel", {})
        
        card = MarketingCarouselCard(
            card_id=carousel_data.get("id", ""),
            card_type=CardType.MARKETING,
            title=carousel_data.get("title", f"Marketing Carousel {carousel_number}"),
            carousel_id=carousel_data.get("carouselId", ""),
            carousel_type=str(carousel_number),
            slides=carousel_data.get("slides", []),
            auto_play=carousel_data.get("autoPlay", True),
            slide_duration=carousel_data.get("slideDuration", 5000),
            image_url=carousel_data.get("imageUrl")
        )
        
        return card
    
    def _parse_favorites_on_sale_response(self, response: Dict[str, Any]) -> FavoritesOnSaleCard:
        """Parse favorites on sale response."""
        sale_data = response.get("favoritesOnSale", {})
        
        card = FavoritesOnSaleCard(
            card_id=sale_data.get("id", ""),
            card_type=CardType.FAVORITES_ON_SALE,
            title="Favorites on Sale",
            customer_id=response.get("customerId", ""),
            store_id=response.get("storeId", ""),
            on_sale_count=len(sale_data.get("saleItems", [])),
            sale_items=sale_data.get("saleItems", []),
            total_savings=sale_data.get("totalSavings")
        )
        
        return card
    
    def _parse_recommendations_response(self, response: Dict[str, Any]) -> List[HomeCard]:
        """Parse recommendations response."""
        cards = []
        if "recommendations" in response:
            for rec_data in response["recommendations"]:
                card = HomeCard(
                    card_id=rec_data.get("id", ""),
                    card_type=CardType.RECOMMENDATIONS,
                    title=rec_data.get("title", "Recommended for You"),
                    subtitle=rec_data.get("subtitle"),
                    description=rec_data.get("description"),
                    image_url=rec_data.get("imageUrl"),
                    priority=rec_data.get("priority", 0)
                )
                cards.append(card)
        return cards
    
    def _parse_datetime(self, datetime_str: Optional[str]) -> Optional[datetime]:
        """Parse datetime string safely."""
        if not datetime_str:
            return None
        
        try:
            return datetime.fromisoformat(datetime_str)
        except ValueError:
            return None
