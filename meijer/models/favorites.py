"""
Favorites models for Meijer API responses.

This module contains dataclasses that represent the structure of favorites API responses
from the Meijer mobile app, based on analysis of the decompiled APK and HTTP traffic.
"""

from dataclasses import dataclass, field
from datetime import datetime
from typing import Any, Dict, List, Optional, Union


@dataclass
class FavoriteListItem:
    """
    Represents a favorite list item in the Meijer API.

    Based on the FavoriteListItemWireModel from the decompiled APK and
    the HTTP traffic analysis for favorites management.
    """

    list_item_id: int
    """Unique identifier for the favorite list item"""

    list_item_type_id: int
    """Type of item (e.g., 0=manual, 1=product)"""

    item_display_order: int
    """Order in which the item appears in the favorites list"""

    item_part_number: Optional[str] = None
    """Part number/UPC of the item (if applicable)"""

    item_description: str
    """Description/name of the favorite item"""

    is_item_in_active_list: bool = False
    """Whether the item is currently in the active shopping list"""

    # Additional fields that may be present in responses
    quantity: Optional[int] = None
    """Quantity of the item"""

    store_id: Optional[int] = None
    """Store ID where the item is located"""

    notes: Optional[str] = None
    """Notes for the item"""

    is_complete: Optional[bool] = None
    """Whether the item is marked as complete"""

    is_favorite: Optional[bool] = None
    """Whether the item is marked as a favorite"""

    listing_id: Optional[str] = None
    """ID of the listing this item belongs to"""

    promotion_start: Optional[datetime] = None
    """Start date of the promotion"""

    promotion_end: Optional[datetime] = None
    """End date of the promotion"""

    coupon_id: Optional[int] = None
    """ID of the coupon associated with the item"""

    # Internal fields
    _raw_data: Optional[Dict[str, Any]] = field(default=None, repr=False, compare=False)
    """Raw API response data for debugging"""

    def __post_init__(self):
        """Post-initialization processing."""
        if self.is_favorite is None:
            self.is_favorite = True  # Default for favorite items

    @classmethod
    def from_api_response(cls, data: Dict[str, Any]) -> "FavoriteListItem":
        """
        Create a FavoriteListItem from API response data.

        Args:
            data: Raw API response data

        Returns:
            FavoriteListItem instance
        """
        # Map API response keys to dataclass fields
        mapped_data = {
            "list_item_id": data.get("listItemId"),
            "list_item_type_id": data.get("listItemTypeId"),
            "item_display_order": data.get("itemDisplayOrder"),
            "item_part_number": data.get("itemPartNumber"),
            "item_description": data.get("itemDescription"),
            "is_item_in_active_list": data.get("isItemInActiveList", False),
            "quantity": data.get("quantity"),
            "store_id": data.get("storeId"),
            "notes": data.get("notes"),
            "is_complete": data.get("isComplete"),
            "is_favorite": data.get("isFavorite"),
            "listing_id": data.get("listingId"),
            "coupon_id": data.get("couponId"),
            "_raw_data": data,
        }

        # Handle date fields
        if data.get("promotionStart"):
            try:
                mapped_data["promotion_start"] = datetime.fromisoformat(
                    data["promotionStart"].replace("Z", "+00:00")
                )
            except (ValueError, TypeError):
                mapped_data["promotion_start"] = None

        if data.get("promotionEnd"):
            try:
                mapped_data["promotion_end"] = datetime.fromisoformat(
                    data["promotionEnd"].replace("Z", "+00:00")
                )
            except (ValueError, TypeError):
                mapped_data["promotion_end"] = None

        return cls(**mapped_data)

    def to_api_request(self) -> Dict[str, Any]:
        """
        Convert to dictionary for API requests.

        Returns:
            Dictionary formatted for API requests
        """
        result = {
            "listItemId": self.list_item_id,
            "listItemTypeId": self.list_item_type_id,
            "itemDisplayOrder": self.item_display_order,
            "itemPartNumber": self.item_part_number,
            "itemDescription": self.item_description,
            "isItemInActiveList": self.is_item_in_active_list,
        }

        # Add optional fields if they have values
        if self.quantity is not None:
            result["quantity"] = self.quantity
        if self.store_id is not None:
            result["storeId"] = self.store_id
        if self.notes is not None:
            result["notes"] = self.notes
        if self.is_complete is not None:
            result["isComplete"] = self.is_complete
        if self.is_favorite is not None:
            result["isFavorite"] = self.is_favorite
        if self.listing_id is not None:
            result["listingId"] = self.listing_id
        if self.coupon_id is not None:
            result["couponId"] = self.coupon_id

        return result

    def to_shopping_list_item(self) -> Dict[str, Any]:
        """
        Convert to format suitable for adding to shopping list.

        Returns:
            Dictionary formatted for shopping list API
        """
        return {
            "listItemId": self.list_item_id,
            "itemPartNumber": self.item_part_number or "",
        }

    @property
    def name(self) -> str:
        """Item name for display purposes."""
        return self.item_description

    @property
    def upc(self) -> Optional[str]:
        """UPC/part number for the item."""
        return self.item_part_number

    def __str__(self) -> str:
        """String representation of the favorite item."""
        return f"FavoriteItem(id={self.list_item_id}, description='{self.item_description}')"

    def __repr__(self) -> str:
        """Detailed representation of the favorite item."""
        return (
            f"FavoriteListItem(list_item_id={self.list_item_id}, "
            f"item_description='{self.item_description}', "
            f"list_item_type_id={self.list_item_type_id}, "
            f"is_item_in_active_list={self.is_item_in_active_list})"
        )


@dataclass
class AddFavoritesRequest:
    """
    Request model for adding items to favorites.

    Based on the AddFavoritesItemsRequest from the decompiled APK.
    """

    favorite_list_items: List[FavoriteListItem]
    """List of favorite items to add"""

    def to_api_request(self) -> Dict[str, Any]:
        """
        Convert to dictionary for API requests.

        Returns:
            Dictionary formatted for API requests
        """
        return {
            "favoriteListItems": [
                item.to_api_request() for item in self.favorite_list_items
            ]
        }

    @classmethod
    def create_simple(
        cls, description: str, upc: Optional[str] = None
    ) -> "AddFavoritesRequest":
        """
        Create a simple request to add one item to favorites.

        Args:
            description: Item description/name
            upc: Optional UPC/part number

        Returns:
            AddFavoritesRequest instance
        """
        item = FavoriteListItem(
            list_item_id=0,  # New item
            list_item_type_id=1 if upc else 0,  # 1=product, 0=manual
            item_display_order=1,
            item_part_number=upc,
            item_description=description,
            is_item_in_active_list=False,
        )
        return cls(favorite_list_items=[item])


@dataclass
class DeleteFavoritesRequest:
    """
    Request model for deleting items from favorites.

    Based on the DeleteFavoritesItemsRequest from the decompiled APK.
    """

    list_item_ids: List[int]
    """List of list item IDs to delete"""

    def to_api_request(self) -> Dict[str, Any]:
        """
        Convert to dictionary for API requests.

        Returns:
            Dictionary formatted for API requests
        """
        return {"listItemIds": self.list_item_ids}

    @classmethod
    def create_single(cls, list_item_id: int) -> "DeleteFavoritesRequest":
        """
        Create a request to delete a single item from favorites.

        Args:
            list_item_id: ID of the item to delete

        Returns:
            DeleteFavoritesRequest instance
        """
        return cls(list_item_ids=[list_item_id])


@dataclass
class UpdateConfirmation:
    """
    Response model for update confirmations.

    Based on the updateConfirmation response from favorites API calls.
    """

    list_item_id: int
    """Unique identifier for the list item"""

    list_item_type_id: int
    """Type of item"""

    item_display_order: int
    """Order in which the item appears"""

    item_part_number: Optional[str] = None
    """Part number/UPC of the item"""

    item_description: str
    """Description/name of the item"""

    is_item_in_active_list: bool = False
    """Whether the item is in the active list"""

    # Additional fields for shopping list confirmations
    quantity: Optional[int] = None
    """Quantity of the item"""

    store_id: Optional[int] = None
    """Store ID where the item is located"""

    notes: Optional[str] = None
    """Notes for the item"""

    is_complete: Optional[bool] = None
    """Whether the item is marked as complete"""

    is_favorite: Optional[bool] = None
    """Whether the item is marked as a favorite"""

    listing_id: Optional[str] = None
    """ID of the listing this item belongs to"""

    promotion_start: Optional[datetime] = None
    """Start date of the promotion"""

    promotion_end: Optional[datetime] = None
    """End date of the promotion"""

    coupon_id: Optional[int] = None
    """ID of the coupon associated with the item"""

    @classmethod
    def from_api_response(cls, data: Dict[str, Any]) -> "UpdateConfirmation":
        """
        Create an UpdateConfirmation from API response data.

        Args:
            data: Raw API response data

        Returns:
            UpdateConfirmation instance
        """
        # Map API response keys to dataclass fields
        mapped_data = {
            "list_item_id": data.get("listItemId"),
            "list_item_type_id": data.get("listItemTypeId"),
            "item_display_order": data.get("itemDisplayOrder"),
            "item_part_number": data.get("itemPartNumber"),
            "item_description": data.get("itemDescription"),
            "is_item_in_active_list": data.get("isItemInActiveList", False),
            "quantity": data.get("quantity"),
            "store_id": data.get("storeId"),
            "notes": data.get("notes"),
            "is_complete": data.get("isComplete"),
            "is_favorite": data.get("isFavorite"),
            "listing_id": data.get("listingId"),
            "coupon_id": data.get("couponId"),
        }

        # Handle date fields
        if data.get("promotionStart"):
            try:
                mapped_data["promotion_start"] = datetime.fromisoformat(
                    data["promotionStart"].replace("Z", "+00:00")
                )
            except (ValueError, TypeError):
                mapped_data["promotion_start"] = None

        if data.get("promotionEnd"):
            try:
                mapped_data["promotion_end"] = datetime.fromisoformat(
                    data["promotionEnd"].replace("Z", "+00:00")
                )
            except (ValueError, TypeError):
                mapped_data["promotion_end"] = None

        return cls(**mapped_data)


@dataclass
class FavoritesResponse:
    """
    Response model for favorites list operations.

    Based on the GetFavoritesList response from the API.
    """

    favorite_list_items: List[FavoriteListItem]
    """List of favorite items"""

    total_count: Optional[int] = None
    """Total count of favorite items"""

    @classmethod
    def from_api_response(cls, data: Dict[str, Any]) -> "FavoritesResponse":
        """
        Create a FavoritesResponse from API response data.

        Args:
            data: Raw API response data

        Returns:
            FavoritesResponse instance
        """
        favorite_items = []
        for item_data in data.get("favoriteListItems", []):
            favorite_items.append(FavoriteListItem.from_api_response(item_data))

        return cls(
            favorite_list_items=favorite_items, total_count=data.get("totalCount")
        )

    def __len__(self) -> int:
        """Return the number of favorite items."""
        return len(self.favorite_list_items)

    def __iter__(self):
        """Iterate over favorite items."""
        return iter(self.favorite_list_items)

    def __getitem__(self, index: int) -> FavoriteListItem:
        """Get favorite item by index."""
        return self.favorite_list_items[index]

    def find_by_description(self, description: str) -> Optional[FavoriteListItem]:
        """
        Find a favorite item by description.

        Args:
            description: Item description to search for

        Returns:
            FavoriteListItem if found, None otherwise
        """
        for item in self.favorite_list_items:
            if item.item_description.lower() == description.lower():
                return item
        return None

    def find_by_upc(self, upc: str) -> Optional[FavoriteListItem]:
        """
        Find a favorite item by UPC.

        Args:
            upc: UPC to search for

        Returns:
            FavoriteListItem if found, None otherwise
        """
        for item in self.favorite_list_items:
            if item.item_part_number == upc:
                return item
        return None
