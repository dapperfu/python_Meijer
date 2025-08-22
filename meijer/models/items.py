"""
Item models for Meijer API responses.

This module contains dataclasses for products and shopping list items.
"""

import asyncio
import functools
import logging
from dataclasses import dataclass, field
from datetime import date
from typing import Any, Dict, List, Optional, Union, TYPE_CHECKING

try:
    import io
    import requests
    from PIL import Image
except ImportError:
    # Optional dependencies for image handling
    io = None
    requests = None
    Image = None

from .base import ItemType

if TYPE_CHECKING:
    from ..client import Meijer


def async_property(func):
    """
    Decorator for async properties that caches the result.
    
    This allows properties to be async while maintaining the property interface.
    The result is cached after the first call to avoid repeated API calls.
    """
    @functools.wraps(func)
    def wrapper(self):
        if not hasattr(self, '_async_cache'):
            self._async_cache = {}
        
        cache_key = func.__name__
        if cache_key not in self._async_cache:
            # Create a future to store the result
            self._async_cache[cache_key] = asyncio.Future()
            
            # Schedule the async function
            async def populate():
                try:
                    result = await func(self)
                    self._async_cache[cache_key].set_result(result)
                except Exception as e:
                    self._async_cache[cache_key].set_exception(e)
            
            # Run in background if event loop is running
            try:
                loop = asyncio.get_event_loop()
                if loop.is_running():
                    asyncio.create_task(populate())
                else:
                    loop.run_until_complete(populate())
            except RuntimeError:
                # No event loop, run synchronously
                asyncio.run(populate())
        
        # Return the cached result or raise the exception
        future = self._async_cache[cache_key]
        if future.done():
            if future.exception():
                raise future.exception()
            return future.result()
        else:
            # Still loading, return None for now
            return None
    
    return property(wrapper)


def lazy_property(func):
    """
    Decorator for lazy-loaded properties that are computed on first access.
    
    This is useful for expensive operations that should only be performed when needed.
    """
    @functools.wraps(func)
    def wrapper(self):
        cache_name = f'_cached_{func.__name__}'
        if not hasattr(self, cache_name):
            setattr(self, cache_name, func(self))
        return getattr(self, cache_name)
    return property(wrapper)


def create_meijer_item(
    upc: str,
    title: Optional[str] = None,
    meijer_client: Optional["Meijer"] = None,
    **kwargs
) -> "MeijerItem":
    """
    Factory function to create a MeijerItem with proper client reference.
    
    This function creates a MeijerItem instance and sets up the client reference
    for async data population. The item will automatically populate data using
    fallback methods when accessed.
    
    Args:
        upc: The UPC code for the item
        title: Optional title for the item
        meijer_client: Optional Meijer client instance for async operations
        **kwargs: Additional fields to set on the item
        
    Returns:
        MeijerItem instance with client reference set up
        
    Example:
        >>> item = create_meijer_item("629307040245", meijer_client=client)
        >>> # Data will be populated asynchronously
        >>> await item.populated_price  # This will trigger data population
    """
    # Generate a unique ID if not provided
    item_id = kwargs.get('id', f"item_{upc}")
    
    # Set default title if not provided
    if not title:
        title = f"Product {upc}"
    
    # Create the item with client reference
    item = MeijerItem(
        id=item_id,
        title=title,
        upc=upc,
        _meijer_client=meijer_client,
        **kwargs
    )
    
    return item


@dataclass
class MeijerItem:
    """
    Represents a product/item from Meijer's system.

    This class provides async data population with fallback methods:
    1. First tries search API for basic info
    2. Falls back to shop'n'scan for pricing
    3. Falls back to cart operations for final pricing
    
    All data is populated asynchronously and cached for performance.
    """

    # Core identification
    id: str
    """Unique product identifier"""
    
    title: str
    """Product title/name"""
    
    upc: Optional[str] = None
    """Universal Product Code"""
    
    sku: Optional[str] = None
    """Stock Keeping Unit"""

    # Optional fields with defaults
    description: Optional[str] = None
    """Product description"""
    
    brand: Optional[str] = None
    """Product brand name"""
    
    category: Optional[str] = None
    """Product category"""
    
    subcategory: Optional[str] = None
    """Product subcategory"""
    
    image_url: Optional[str] = None
    """URL to product image"""
    
    large_image_url: Optional[str] = None
    """URL to large product image"""
    
    price: Optional[float] = None
    """Current product price"""
    
    sale_price: Optional[float] = None
    """Sale price if on sale"""
    
    unit_price: Optional[str] = None
    """Price per unit (e.g., per ounce)"""
    
    is_weighted: bool = False
    """Whether product is sold by weight"""
    
    weight_unit: Optional[str] = None
    """Unit of weight measurement"""
    
    weight_amount: Optional[float] = None
    """Weight amount"""
    
    is_available: bool = True
    """Whether product is currently available"""
    
    store_id: Optional[str] = None
    """Store ID where product is located"""
    
    department_id: Optional[str] = None
    """Department ID"""
    
    sub_department_id: Optional[str] = None
    """Sub-department ID"""
    
    tags: List[str] = field(default_factory=list)
    """List of product tags"""
    
    raw_data: Optional[Dict[str, Any]] = None
    """Raw API response data"""

    # Constructor.io specific fields
    data_id: Optional[str] = None
    """Constructor.io data ID"""
    
    data_ean: Optional[int] = None
    """European Article Number"""
    
    data_isbopas: Optional[bool] = None
    """Buy One, Get One at Same Price flag"""
    
    data_isbuyable: Optional[bool] = None
    """Whether product can be purchased"""
    
    data_isalcohol: Optional[bool] = None
    """Whether product contains alcohol"""
    
    data_hasmperks: Optional[bool] = None
    """Whether product has mPerks offers"""
    
    data_specialbuy: Optional[bool] = None
    """Whether product is a special buy"""
    
    data_deactivated: Optional[bool] = None
    """Whether product is deactivated"""
    
    data_productunit: Optional[str] = None
    """Product unit description"""
    
    data_qtyincrement: Optional[int] = None
    """Quantity increment for ordering"""
    
    data_chokinghazard: Optional[bool] = None
    """Whether product is a choking hazard"""
    
    data_ispurchasable: Optional[bool] = None
    """Whether product can be purchased"""
    
    data_pricebyweight: Optional[bool] = None
    """Whether product is priced by weight"""
    
    data_mperksofferid: Optional[List[Any]] = None
    """List of mPerks offer IDs"""
    
    data_isagerestricted: Optional[bool] = None
    """Whether product has age restrictions"""
    
    data_ebtfoodstampable: Optional[bool] = None
    """Whether product can be purchased with EBT"""
    
    data_pickupavailableflag: Optional[bool] = None
    """Whether pickup is available"""
    
    data_homedeliverynotavailable: Optional[bool] = None
    """Whether home delivery is not available"""
    
    data_requiresdiscreteinventorytracking: Optional[bool] = None
    """Whether product requires discrete inventory tracking"""
    
    data_ismap: Optional[bool] = None
    """Whether product has MAP pricing"""

    # Internal fields for async operations
    _meijer_client: Optional["Meijer"] = field(default=None, repr=False, compare=False)
    _async_cache: Dict[str, Any] = field(default_factory=dict, repr=False, compare=False)
    _logger: Optional[logging.Logger] = field(default=None, repr=False, compare=False)
    _price: Optional[float] = field(default=None, repr=False, compare=False)
    _price_population_triggered: bool = field(default=False, repr=False, compare=False)

    def __post_init__(self):
        """Initialize internal components after dataclass creation."""
        if self._meijer_client:
            self._logger = self._meijer_client.logger
        else:
            self._logger = logging.getLogger(__name__)
        
        # Initialize price from the dataclass field
        self._price = self.price

    @classmethod
    def from_upc(
        cls,
        upc: str,
        meijer_client: Optional["Meijer"] = None,
        **kwargs
    ) -> "MeijerItem":
        """
        Create a MeijerItem from a UPC code.
        
        This is a convenience method that creates an item with minimal information
        and sets up the client reference for async data population.
        
        Args:
            upc: The UPC code for the item
            meijer_client: Optional Meijer client instance for async operations
            **kwargs: Additional fields to set on the item
            
        Returns:
            MeijerItem instance ready for async data population
            
        Example:
            >>> item = MeijerItem.from_upc("629307040245", meijer_client=client)
            >>> # Data will be populated asynchronously when accessed
        """
        return cls(
            id=f"item_{upc}",
            title=f"Product {upc}",
            upc=upc,
            _meijer_client=meijer_client,
            **kwargs
        )

    @property
    def logger(self) -> logging.Logger:
        """Get the logger instance."""
        return self._logger or logging.getLogger(__name__)

    @property
    def price(self) -> Optional[float]:
        """
        Get the current price, automatically triggering population if needed.
        
        This property will:
        1. Return existing price if available
        2. Trigger async population in the background if no price exists
        3. Return None initially, then the populated price on subsequent calls
        
        Returns:
            Current price or None if still loading
        """
        if self._price is not None:
            return self._price
        
        # Trigger background population if we have a client and UPC
        if (self._meijer_client and self.upc and 
            not self._price_population_triggered):
            self._price_population_triggered = True
            
            # Schedule background population
            async def populate_in_background():
                try:
                    await self._populate_price_data()
                except Exception as e:
                    self.logger.error(f"Background price population failed: {e}")
            
            # Run in background if event loop is running
            try:
                loop = asyncio.get_event_loop()
                if loop.is_running():
                    asyncio.create_task(populate_in_background())
                else:
                    loop.run_until_complete(populate_in_background())
            except RuntimeError:
                # No event loop, run synchronously
                asyncio.run(populate_in_background())
        
        return self._price

    @price.setter
    def price(self, value: Optional[float]) -> None:
        """Set the price value."""
        self._price = value

    @async_property
    async def populated_price(self) -> Optional[float]:
        """
        Get the populated price using fallback methods.
        
        This property will:
        1. Return existing price if available
        2. Try search API for pricing
        3. Fall back to shop'n'scan for pricing
        4. Fall back to cart operations for final pricing
        
        Use this when you need to ensure data is populated before proceeding.
        """
        if self._price is not None:
            return self._price
        
        # Try to populate price using fallback methods
        await self._populate_price_data()
        return self._price

    @async_property
    async def force_refresh_price(self) -> Optional[float]:
        """
        Force refresh the price data, ignoring any cached values.
        
        This is useful when you need to get the latest pricing information
        regardless of what's already cached.
        """
        # Clear any cached price data
        self._price = None
        self._price_population_triggered = False
        
        # Populate fresh data
        await self._populate_price_data()
        return self._price

    @async_property
    async def populated_details(self) -> Dict[str, Any]:
        """
        Get fully populated product details.
        
        This will populate all available fields using the best available method.
        """
        await self._populate_all_data()
        return self.to_dict()

    async def _populate_price_data(self) -> None:
        """
        Populate price data using fallback methods.
        
        This method implements the fallback strategy:
        1. Search API (fastest)
        2. Shop'n'Scan (medium speed)
        3. Cart operations (slowest but most accurate)
        """
        if not self._meijer_client:
            self.logger.warning("No Meijer client available for data population")
            return

        try:
            # Method 1: Try search API first (fastest)
            if await self._populate_from_search():
                return

            # Method 2: Try shop'n'scan (medium speed)
            if await self._populate_from_shop_scan():
                return

            # Method 3: Try cart operations (slowest but most accurate)
            await self._populate_from_cart()

        except Exception as e:
            self.logger.error(f"Failed to populate price data: {e}")

    async def _populate_from_search(self) -> bool:
        """Try to populate data from search API."""
        try:
            if not self.upc:
                return False

            # Use the search API to get product details
            search_results = await self._meijer_client.search.search_async(self.upc)
            if search_results and search_results.results:
                # Find matching item
                for item in search_results.results:
                    if item.upc == self.upc:
                        self._update_from_item(item)
                        return True

        except Exception as e:
            self.logger.debug(f"Search API population failed: {e}")

        return False

    async def _populate_from_shop_scan(self) -> bool:
        """Try to populate data from shop'n'scan API."""
        try:
            if not self.upc:
                return False

            # Use shop'n'scan to get product details
            shop_scan_item = await self._meijer_client.shop_scan.lookup_barcode_price_async(self.upc)
            if shop_scan_item:
                self._update_from_item(shop_scan_item)
                return True

        except Exception as e:
            self.logger.debug(f"Shop'n'Scan population failed: {e}")

        return False

    async def _populate_from_cart(self) -> bool:
        """Try to populate data from cart operations."""
        try:
            if not self.upc:
                return False

            # Add item to cart temporarily to get pricing
            cart_item = await self._meijer_client.cart.add_item_async(self.upc, quantity=1)
            if cart_item:
                # Extract pricing information
                self.price = cart_item.base_price
                self.sale_price = getattr(cart_item, 'sale_price', None)
                self.unit_price = getattr(cart_item, 'unit_price', None)
                
                # Remove item from cart after getting pricing
                await self._meijer_client.cart.remove_item_async(cart_item.entry_number)
                return True

        except Exception as e:
            self.logger.debug(f"Cart population failed: {e}")

        return False

    async def _populate_all_data(self) -> None:
        """Populate all available data fields."""
        # Populate price data first
        await self._populate_price_data()
        
        # Populate additional details if needed
        if not self.description or not self.brand:
            await self._populate_from_search()

    def _update_from_item(self, other_item: "MeijerItem") -> None:
        """Update this item with data from another item."""
        if other_item.price is not None:
            self.price = other_item.price
        if other_item.sale_price is not None:
            self.sale_price = other_item.sale_price
        if other_item.unit_price is not None:
            self.unit_price = other_item.unit_price
        if other_item.description and not self.description:
            self.description = other_item.description
        if other_item.brand and not self.brand:
            self.brand = other_item.brand
        if other_item.category and not self.category:
            self.category = other_item.category
        if other_item.image_url and not self.image_url:
            self.image_url = other_item.image_url

    @lazy_property
    def primary_aisle(self) -> Optional[str]:
        """Get the primary aisle location (lazy-loaded)."""
        # This would need to be implemented based on actual API structure
        return None

    @lazy_property
    def all_aisles(self) -> List[str]:
        """Get all aisle locations for the item (lazy-loaded)."""
        # This would need to be implemented based on actual API structure
        return []

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
            "tags": self.tags,
        }
        # Remove None values
        return {k: v for k, v in result.items() if v is not None}

    def __str__(self) -> str:
        """String representation of the item."""
        return f"MeijerItem(id={self.id}, title='{self.title}', upc={self.upc}, price={self.price})"

    def __repr__(self) -> str:
        """Detailed representation of the item."""
        return (f"MeijerItem(id='{self.id}', title='{self.title}', upc='{self.upc}', "
                f"price={self.price}, brand='{self.brand}', category='{self.category}')")

    # ============================================================================
    # Jupyter Notebook Rich Representations
    # ============================================================================

    def _repr_html_(self) -> str:
        """Rich HTML representation for Jupyter notebooks."""
        html = f"""
        <div style="border: 1px solid #ddd; padding: 10px; border-radius: 5px; margin: 10px 0;">
            <h3 style="margin: 0 0 10px 0; color: #333;">{self.title}</h3>
            <div style="display: grid; grid-template-columns: 1fr 1fr; gap: 10px;">
                <div>
                    <strong>ID:</strong> {self.id}<br>
                    <strong>UPC:</strong> {self.upc or 'N/A'}<br>
                    <strong>SKU:</strong> {self.sku or 'N/A'}<br>
                    <strong>Brand:</strong> {self.brand or 'N/A'}<br>
                    <strong>Category:</strong> {self.category or 'N/A'}<br>
                </div>
                <div>
                    <strong>Price:</strong> ${self.price or 'N/A'}<br>
                    <strong>Sale Price:</strong> ${self.sale_price or 'N/A'}<br>
                    <strong>Unit Price:</strong> {self.unit_price or 'N/A'}<br>
                    <strong>Available:</strong> {'Yes' if self.is_available else 'No'}<br>
                    <strong>Weighted:</strong> {'Yes' if self.is_weighted else 'No'}<br>
                </div>
            </div>
        </div>
        """
        return html

    def _repr_markdown_(self) -> str:
        """Rich markdown representation for Jupyter notebooks."""
        return f"""
        ## {self.title}
        
        - **ID**: {self.id}
        - **UPC**: {self.upc or 'N/A'}
        - **SKU**: {self.sku or 'N/A'}
        - **Brand**: {self.brand or 'N/A'}
        - **Category**: {self.category or 'N/A'}
        - **Price**: ${self.price or 'N/A'}
        - **Sale Price**: ${self.sale_price or 'N/A'}
        - **Unit Price**: {self.unit_price or 'N/A'}
        - **Available**: {'Yes' if self.is_available else 'No'}
        - **Weighted**: {'Yes' if self.is_weighted else 'No'}
        """


@dataclass
class ListItem:
    """
    Represents an item in a shopping list or favorites list.

    Based on the ShoppingListItem class from the decompiled APK.
    """

    list_item_id: int
    """Unique identifier for the list item"""

    list_item_type_id: int
    """Type of item (e.g., PRODUCT, COUPON, WEEKLY_AD, MANUAL)"""

    item_display_order: int
    """Order in which the item appears in the list"""

    item_part_number: Optional[str]
    """Part number of the item"""

    item_description: str
    """Description of the item"""

    quantity: int
    """Quantity of the item"""

    store_id: int
    """Store ID where the item is located"""

    notes: Optional[str]
    """Notes for the item"""

    is_complete: bool
    """Whether the item is marked as complete"""

    is_favorite: bool
    """Whether the item is marked as a favorite"""

    listing_id: Optional[str]
    """ID of the listing this item belongs to"""

    promotion_start: Optional[date]
    """Start date of the promotion"""

    promotion_end: Optional[date]
    """End date of the promotion"""

    coupon_id: int
    """ID of the coupon associated with the item"""

    product_details: Optional[MeijerItem] = None
    """Detailed product information for the item"""

    # Internal reference to list API for operations like marking complete/incomplete
    _list_api: Optional[Any] = field(default=None, repr=False, compare=False)

    # Private fields for property operations
    _quantity_override: Optional[int] = field(default=None, repr=False, compare=False)
    _notes_override: Optional[str] = field(default=None, repr=False, compare=False)

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
    def part_number(self) -> Optional[str]:
        """Backward compatibility: part_number -> item_part_number."""
        return self.item_part_number

    @property
    def display_order(self) -> int:
        """Backward compatibility: display_order -> item_display_order."""
        return self.item_display_order

    @property
    def type_id(self) -> int:
        """Backward compatibility: type_id -> list_item_type_id."""
        return self.list_item_type_id

    @property
    def is_completed(self) -> bool:
        """Backward compatibility: is_completed -> is_complete."""
        return self.is_complete

    @property
    def is_favorited(self) -> bool:
        """Backward compatibility: is_favorited -> is_favorite."""
        return self.is_favorite

    @property
    def promotion_start_date(self) -> Optional[date]:
        """Backward compatibility: promotion_start_date -> promotion_start."""
        return self.promotion_start

    @property
    def promotion_end_date(self) -> Optional[date]:
        """Backward compatibility: promotion_end_date -> promotion_end."""
        return self.promotion_end

    @property
    def coupon_identifier(self) -> int:
        """Backward compatibility: coupon_identifier -> coupon_id."""
        return self.coupon_id

    @property
    def product_info(self) -> Optional[MeijerItem]:
        """Backward compatibility: product_info -> product_details."""
        return self.product_details

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
            "couponId": self.coupon_id,
        }
        # Remove None values
        return {k: v for k, v in result.items() if v is not None}

    def __str__(self) -> str:
        """String representation of the list item."""
        return f"ListItem(id={self.list_item_id}, description='{self.item_description}', quantity={self.quantity})"

    def __repr__(self) -> str:
        """Detailed representation of the list item."""
        return (f"ListItem(list_item_id={self.list_item_id}, item_description='{self.item_description}', "
                f"quantity={self.quantity}, is_complete={self.is_complete}, is_favorite={self.is_favorite})")
