"""
Data models for Meijer API responses.

This module contains dataclasses that represent the structure of API responses
from the Meijer mobile app, based on analysis of the decompiled APK.
"""

from dataclasses import dataclass, field
from datetime import date
from typing import Any, Dict, List, Optional, Union
from enum import Enum


class ItemType(Enum):
    """Types of items that can be added to shopping lists."""
    PRODUCT = 1
    COUPON = 2
    WEEKLY_AD = 3
    MANUAL = 4


@dataclass
class MeijerItem:
    """
    Represents a product/item from Meijer's system.
    
    Based on the ProductFullDetails class from the decompiled APK.
    Enhanced to support Constructor.io search API responses.
    """
    id: str
    title: str
    description: Optional[str] = None
    brand: Optional[str] = None
    category: Optional[str] = None
    subcategory: Optional[str] = None
    upc: Optional[str] = None
    sku: Optional[str] = None
    image_url: Optional[str] = None
    large_image_url: Optional[str] = None
    price: Optional[float] = None
    sale_price: Optional[float] = None
    unit_price: Optional[str] = None
    is_weighted: bool = False
    weight_unit: Optional[str] = None
    weight_amount: Optional[float] = None
    is_available: bool = True
    store_id: Optional[str] = None
    department_id: Optional[str] = None
    sub_department_id: Optional[str] = None
    tags: List[str] = field(default_factory=list)
    raw_data: Optional[Dict[str, Any]] = None
    
    # Constructor.io specific fields
    data_id: Optional[str] = None
    data_ean: Optional[int] = None
    data_isbopas: Optional[bool] = None
    data_isbuyable: Optional[bool] = None
    data_isalcohol: Optional[bool] = None
    data_hasmperks: Optional[bool] = None
    data_specialbuy: Optional[bool] = None
    data_deactivated: Optional[bool] = None
    data_productunit: Optional[str] = None
    data_qtyincrement: Optional[int] = None
    data_chokinghazard: Optional[bool] = None
    data_ispurchasable: Optional[bool] = None
    data_pricebyweight: Optional[bool] = None
    data_mperksofferid: Optional[List[Any]] = None
    data_isagerestricted: Optional[bool] = None
    data_ebtfoodstampable: Optional[bool] = None
    data_pickupavailableflag: Optional[bool] = None
    data_homedeliverynotavailable: Optional[bool] = None
    data_requiresdiscreteinventorytracking: Optional[bool] = None
    data_ismap: Optional[bool] = None
    data_variation_id: Optional[str] = None
    data_pricegoodthrough: Optional[str] = None
    data_stocklevelstatus: Optional[str] = None
    data_discountsalepricevalue: Optional[Union[float, int]] = None
    data_discountvalue: Optional[float] = None
    data_discountsavingstext: Optional[str] = None
    data_discountsalepricetype: Optional[str] = None
    data_depositvalue: Optional[float] = None
    data_maxorderquantity: Optional[int] = None
    data_discountsalepricetext: Optional[str] = None
    data_packagesize: Optional[str] = None
    data_group_ids: Optional[List[Any]] = None
    data_ingredients: Optional[str] = None
    matched_terms: Optional[List[Any]] = field(default_factory=list)
    
    # Aisle location fields for defragging
    aisle_primary: Optional[str] = None
    aisle_locations: List[str] = field(default_factory=list)
    
    def __post_init__(self):
        """Validate and set default values."""
        if not self.title:
            self.title = self.description or "Unknown Product"
    
    @classmethod
    def from_constructor_response(cls, item_data: Dict[str, Any], client: Optional[Any] = None) -> "MeijerItem":
        """
        Create a MeijerItem from Constructor.io API response data.
        
        Parameters
        ----------
        item_data : Dict[str, Any]
            Raw item data from Constructor.io search response
        client : Any, optional
            Meijer client for additional operations
            
        Returns
        -------
        MeijerItem
            New MeijerItem instance
        """
        # Extract common Constructor.io fields
        value = item_data.get('value', '')
        data = item_data.get('data', {})
        
        # Create instance with discovered field mappings
        kwargs = {
            'id': data.get('data_id', str(item_data.get('id', ''))),
            'title': value,
            'description': data.get('data_description', ''),
            'brand': data.get('data_brand', ''),
            'category': data.get('data_category', ''),
            'subcategory': data.get('data_subcategory', ''),
            'upc': str(data.get('data_ean', '')) if data.get('data_ean') else None,
            'sku': data.get('data_sku', ''),
            'image_url': data.get('data_image_url', ''),
            'price': float(data.get('data_price', 0)) if data.get('data_price') else None,
            'sale_price': float(data.get('data_discountsalepricevalue', 0)) if data.get('data_discountsalepricevalue') else None,
            'unit_price': data.get('data_priceunit', ''),
            'is_weighted': data.get('data_pricebyweight', False),
            'is_available': data.get('data_ispurchasable', True),
            'raw_data': item_data,
            
            # Constructor.io specific fields
            'data_id': data.get('data_id', ''),
            'data_ean': data.get('data_ean'),
            'data_isbopas': data.get('data_isbopas', False),
            'data_isbuyable': data.get('data_isbuyable', False),
            'data_isalcohol': data.get('data_isalcohol', False),
            'data_hasmperks': data.get('data_hasmperks', False),
            'data_specialbuy': data.get('data_specialbuy', False),
            'data_deactivated': data.get('data_deactivated', False),
            'data_productunit': data.get('data_productunit', ''),
            'data_qtyincrement': data.get('data_qtyincrement', 1),
            'data_chokinghazard': data.get('data_chokinghazard', False),
            'data_ispurchasable': data.get('data_ispurchasable', True),
            'data_pricebyweight': data.get('data_pricebyweight', False),
            'data_mperksofferid': data.get('data_mperksofferid', []),
            'data_isagerestricted': data.get('data_isagerestricted', False),
            'data_ebtfoodstampable': data.get('data_ebtfoodstampable', False),
            'data_pickupavailableflag': data.get('data_pickupavailableflag', False),
            'data_homedeliverynotavailable': data.get('data_homedeliverynotavailable', False),
            'data_requiresdiscreteinventorytracking': data.get('data_requiresdiscreteinventorytracking', False),
            'data_ismap': data.get('data_ismap', False),
            'data_variation_id': data.get('data_variation_id', ''),
            'data_pricegoodthrough': data.get('data_pricegoodthrough', ''),
            'data_stocklevelstatus': data.get('data_stocklevelstatus', ''),
            'data_discountsalepricevalue': data.get('data_discountsalepricevalue'),
            'data_discountvalue': data.get('data_discountvalue'),
            'data_discountsavingstext': data.get('data_discountsavingstext', ''),
            'data_discountsalepricetype': data.get('data_discountsalepricetype', ''),
            'data_depositvalue': data.get('data_depositvalue'),
            'data_maxorderquantity': data.get('data_maxorderquantity'),
            'data_discountsalepricetext': data.get('data_discountsalepricetext', ''),
            'data_packagesize': data.get('data_packagesize', ''),
            'data_group_ids': data.get('data_group_ids', []),
            'data_ingredients': data.get('data_ingredients', ''),
            'matched_terms': item_data.get('matched_terms', [])
        }
        
        return cls(**kwargs)
    
    @property
    def display_name(self) -> str:
        """Get a display-friendly name for the item."""
        if self.brand and self.brand not in self.title:
            return f"{self.brand} {self.title}"
        return self.title
    
    @property
    def best_price(self) -> Optional[float]:
        """Get the best available price (sale price if available, otherwise regular price)."""
        if self.sale_price is not None:
            return self.sale_price
        return self.price
    
    @property
    def is_on_sale(self) -> bool:
        """Check if the item is currently on sale."""
        return self.sale_price is not None and self.sale_price < (self.price or 0)
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "id": self.id,
            "title": self.title,
            "description": self.description,
            "brand": self.brand,
            "category": self.category,
            "subcategory": self.subcategory,
            "upc": self.upc,
            "sku": self.sku,
            "imageUrl": self.image_url,
            "largeImageUrl": self.large_image_url,
            "price": self.price,
            "salePrice": self.sale_price,
            "unitPrice": self.unit_price,
            "isWeighted": self.is_weighted,
            "weightUnit": self.weight_unit,
            "weightAmount": self.weight_amount,
            "isAvailable": self.is_available,
            "storeId": self.store_id,
            "departmentId": self.department_id,
            "subDepartmentId": self.sub_department_id,
            "tags": self.tags
        }
        # Remove None values
        return {k: v for k, v in result.items() if v is not None}


@dataclass
class ListItem:
    """
    Represents an item in a shopping list or favorites list.
    
    Based on the ShoppingListItem class from the decompiled APK.
    """
    list_item_id: int
    list_item_type_id: int
    item_display_order: int
    item_part_number: Optional[str]
    item_description: str
    quantity: int
    store_id: int
    notes: Optional[str]
    is_complete: bool
    is_favorite: bool
    listing_id: Optional[str]
    promotion_start: Optional[date]
    promotion_end: Optional[date]
    coupon_id: int
    product_details: Optional[MeijerItem] = None
    
    # Backward compatibility properties
    @property
    def item_id(self) -> int:
        """Backward compatibility: item_id -> list_item_id."""
        return self.list_item_id
    
    @property
    def name(self) -> str:
        """Backward compatibility: name -> item_description."""
        return self.item_description
    
    @property
    def checked(self) -> bool:
        """Backward compatibility: checked -> is_complete."""
        return self.is_complete
    
    @property
    def upc(self) -> Optional[str]:
        """Backward compatibility: upc from product_details."""
        if self.product_details:
            return self.product_details.upc
        return None
    
    @property
    def is_coupon(self) -> bool:
        """Check if this item represents a coupon."""
        return self.list_item_type_id == ItemType.COUPON.value
    
    @property
    def is_product(self) -> bool:
        """Check if this item represents a product."""
        return self.list_item_type_id == ItemType.PRODUCT.value
    
    @property
    def is_weekly_ad(self) -> bool:
        """Check if this item represents a weekly ad item."""
        return self.list_item_type_id == ItemType.WEEKLY_AD.value
    
    @property
    def is_manual(self) -> bool:
        """Check if this item was manually added."""
        return self.list_item_type_id == ItemType.MANUAL.value
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "listItemId": self.list_item_id,
            "listItemTypeId": self.list_item_type_id,
            "itemDisplayOrder": self.item_display_order,
            "itemPartNumber": self.item_part_number,
            "itemDescription": self.item_description,
            "quantity": self.quantity,
            "storeId": self.store_id,
            "notes": self.notes,
            "isComplete": self.is_complete,
            "isFavorite": self.is_favorite,
            "listingId": self.listing_id,
            "promotionStart": self.promotion_start.isoformat() if self.promotion_start else None,
            "promotionEnd": self.promotion_end.isoformat() if self.promotion_end else None,
            "couponId": self.coupon_id
        }
        # Remove None values
        return {k: v for k, v in result.items() if v is not None}


@dataclass
class MeijerCoupon:
    """
    Represents a coupon/offer from Meijer.
    
    Based on the API response structure from the offers endpoint.
    """
    meijer_offer_id: int
    title: str
    description: str
    image_url: Optional[str]
    large_image_url: Optional[str]
    terms_and_conditions: str
    manufacturer_coupon: bool
    redemption_start_date: date
    redemption_end_date: date
    redeem_amount: float
    offer_class_id: int
    logix_offer_id: int
    is_suggested: bool = False
    is_clipped: bool = False
    is_auto_clipped: bool = False
    is_hidden: bool = False
    is_targeted: bool = False
    is_clippable: bool = True
    is_special_offer: bool = False
    redemption_date: Optional[date] = None
    category: Optional[str] = None
    subcategory: Optional[str] = None
    tags: List[str] = field(default_factory=list)
    hat_text: Optional[str] = None
    hat_color: int = 0
    border_color: int = 0
    is_meijer_buck: bool = False
    show_large_image: bool = False
    condition_type_id: int = 0
    condition_value: float = 0.0
    discount_type_id: int = 0
    discount_level_id: int = 0
    coupon_id: int = 0
    raw_data: Optional[Dict[str, Any]] = None
    
    @property
    def is_expired(self) -> bool:
        """Check if the coupon has expired."""
        from datetime import date
        return date.today() > self.redemption_end_date
    
    @property
    def is_active(self) -> bool:
        """Check if the coupon is currently active."""
        from datetime import date
        today = date.today()
        return self.redemption_start_date <= today <= self.redemption_end_date
    
    @property
    def days_until_expiry(self) -> int:
        """Get the number of days until the coupon expires."""
        from datetime import date
        return (self.redemption_end_date - date.today()).days
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "meijerOfferId": self.meijer_offer_id,
            "title": self.title,
            "description": self.description,
            "imageURL": self.image_url,
            "largeImageURL": self.large_image_url,
            "termsAndConditions": self.terms_and_conditions,
            "manufacturerCoupon": self.manufacturer_coupon,
            "redemptionStartDate": self.redemption_start_date.isoformat(),
            "redemptionEndDate": self.redemption_end_date.isoformat(),
            "redeemAmount": self.redeem_amount,
            "offerClassId": self.offer_class_id,
            "logixOfferId": self.logix_offer_id,
            "isSuggested": self.is_suggested,
            "isClipped": self.is_clipped,
            "isAutoClipped": self.is_auto_clipped,
            "isHidden": self.is_hidden,
            "isTargeted": self.is_targeted,
            "isClippable": self.is_clippable,
            "isSpecialOffer": self.is_special_offer,
            "redemptionDate": self.redemption_date.isoformat() if self.redemption_date else None,
            "category": self.category,
            "subcategory": self.subcategory,
            "tags": self.tags,
            "hatText": self.hat_text,
            "hatColor": self.hat_color,
            "borderColor": self.border_color,
            "isMeijerBuck": self.is_meijer_buck,
            "showLargeImage": self.show_large_image,
            "conditionTypeId": self.condition_type_id,
            "conditionValue": self.condition_value,
            "discountTypeId": self.discount_type_id,
            "discountLevelId": self.discount_level_id,
            "couponId": self.coupon_id
        }
        # Remove None values
        return {k: v for k, v in result.items() if v is not None}


@dataclass
class Store:
    """Represents a Meijer store location."""
    store_id: str
    name: str
    address: str
    city: str
    state: str
    zip_code: str
    phone: Optional[str] = None
    hours: Optional[str] = None
    latitude: Optional[float] = None
    longitude: Optional[float] = None
    distance: Optional[float] = None
    is_open: bool = True
    services: List[str] = field(default_factory=list)
    raw_data: Optional[Dict[str, Any]] = None
    
    @property
    def full_address(self) -> str:
        """Get the complete address string."""
        return f"{self.address}, {self.city}, {self.state} {self.zip_code}"
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "storeId": self.store_id,
            "name": self.name,
            "address": self.address,
            "city": self.city,
            "state": self.state,
            "zipCode": self.zip_code,
            "phone": self.phone,
            "hours": self.hours,
            "latitude": self.latitude,
            "longitude": self.longitude,
            "distance": self.distance,
            "isOpen": self.is_open,
            "services": self.services
        }
        # Remove None values
        return {k: v for k, v in result.items() if v is not None}


@dataclass
class SearchResult:
    """Represents a search result from Meijer's product search."""
    total_results: int
    results: List[MeijerItem]
    current_page: int
    total_pages: int
    query: str
    filters: Dict[str, Any] = field(default_factory=dict)
    sort_by: str = "relevance"
    raw_data: Optional[Dict[str, Any]] = None
    
    @property
    def has_results(self) -> bool:
        """Check if there are any search results."""
        return len(self.results) > 0
    
    @property
    def is_last_page(self) -> bool:
        """Check if this is the last page of results."""
        return self.current_page >= self.total_pages
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        return {
            "totalResults": self.total_results,
            "results": [item.to_dict() for item in self.results],
            "currentPage": self.current_page,
            "totalPages": self.total_pages,
            "query": self.query,
            "filters": self.filters,
            "sortBy": self.sort_by
        }


def create_meijer_items_from_search(search_data: Dict[str, Any], client: Optional[Any] = None) -> List[MeijerItem]:
    """
    Create a list of MeijerItem objects from Constructor.io search response.
    
    Parameters
    ----------
    search_data : Dict[str, Any]
        Raw search response data from Constructor.io
    client : Any, optional
        Meijer client for additional operations
        
    Returns
    -------
    List[MeijerItem]
        List of MeijerItem instances
    """
    items = []
    
    try:
        # Extract results from different possible response formats
        results = search_data.get('results', [])
        if not results:
            # Try alternative field names
            results = search_data.get('response', {}).get('results', [])
        
        for item_data in results:
            try:
                item = MeijerItem.from_constructor_response(item_data, client)
                items.append(item)
            except Exception as e:
                # Log error but continue processing other items
                import logging
                logger = logging.getLogger(__name__)
                logger.warning(f"Failed to create MeijerItem from data: {e}")
                continue
                
    except Exception as e:
        import logging
        logger = logging.getLogger(__name__)
        logger.error(f"Error processing search response: {e}")
    
    return items
