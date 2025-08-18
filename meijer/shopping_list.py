"""
Meijer Shopping List Management
==============================

Shopping list functionality for the Meijer API client.
"""

import logging
from typing import List, TYPE_CHECKING, Optional, Dict, Any
from urllib.parse import urljoin
from dataclasses import dataclass, asdict
from datetime import datetime

try:
    from tabulate import tabulate

    TABULATE_AVAILABLE = True
except ImportError:
    TABULATE_AVAILABLE = False
    # Fallback to basic formatting if tabulate not available

try:
    from .search import Search
    SEARCH_AVAILABLE = True
except ImportError:
    SEARCH_AVAILABLE = False

from .models import ListItem
from .exceptions import MeijerAuthenticationError

if TYPE_CHECKING:
    from .client import Meijer


class MeijerList:
    """
    Meijer Shopping List management.

    Provides complete shopping list functionality including:
    - Getting shopping list items
    - Adding new items
    - Completing/uncompleting items
    - Clearing completed items
    - Managing favorites
    """

    def __init__(self, meijer_client: "Meijer"):
        """Initialize shopping list with reference to Meijer client."""
        self.meijer = meijer_client
        self.logger = meijer_client.logger

        # Real shopping list API endpoints from APK analysis (Hq/d.java)
        self.endpoints = {
            "get_list": "/loyalty/shoppinglist/GetList",
            "add_item": "/loyalty/shoppinglist/AddListItem",
            "delete_item": "/loyalty/shoppinglist/DeleteListItem/{itemId}",
            "mark_complete": "/loyalty/shoppinglist/MarkAsCompleted/{itemId}",
            "mark_incomplete": "/loyalty/shoppinglist/MarkAsNotCompleted/{itemId}",
            "update_item": "/loyalty/shoppinglist/UpdateListItem/{itemId}",
            "reorder_item": "/loyalty/shoppinglist/listItem/order",
            "delete_all": "/loyalty/shoppinglist/DeleteAllListItems",
            "get_favorites": "/loyalty/shoppinglist/GetFavoritesList",
            "add_favorite": "/loyalty/shoppinglist/AddFavoritesListItem",
            "delete_favorite": "/loyalty/shoppinglist/DeleteBulkListItems",  # Add missing endpoint
            "delete_bulk_favorites": "/loyalty/shoppinglist/DeleteBulkListItems",
        }

    def get(self) -> List[ListItem]:
        """Get shopping list items."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["get_list"])
            headers = self.meijer._get_api_headers()
            headers.update(
                {"Accept": "application/meijer.shoppingList.ShoppingList-v1.0+json"}
            )

            response = self.meijer._make_request("GET", url, headers=headers)

            if response.status_code == 200:
                data = response.json()
                items = []
                for item_data in data.get("listItems", []):
                    # Map API response keys to ListItem constructor parameters
                    mapped_data = self._map_api_response_to_listitem(item_data)
                    items.append(ListItem(**mapped_data))
                return items
            else:
                self.logger.error(
                    f"Failed to get shopping list: {response.status_code}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Error getting shopping list: {e}")
            return []

    def add_item(self, upc: str, quantity: int = 1) -> bool:
        """Add item to shopping list by UPC using real APK-discovered endpoint."""
        return self.add_item_with_details(
            upc=upc, quantity=quantity, description=f"Product {upc}"
        )

    def add_item_with_details(
        self,
        upc: str,
        quantity: int = 1,
        description: Optional[str] = None,
        notes: Optional[str] = None,
        display_order: int = 1,
    ) -> bool:
        """Add item to shopping list with custom description and notes."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["add_item"])
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis (Hq/d.java)
            headers.update(
                {
                    "Content-Type": "application/vnd.meijer.listManagement.list-v1.0+json",
                    "Accept": "application/vnd.meijer.listManagement.list-v1.0+json",
                }
            )

            # Real request body structure from APK (ShoppingListAddItemRequest + ShoppingListItemWireModel)
            data = {
                "listItems": [
                    {
                        "listItemId": 0,  # New item
                        "itemDescription": description or f"Product {upc}",
                        "quantity": quantity,
                        "itemPartNumber": upc,  # UPC goes here
                        "listItemTypeId": 1,  # Standard item type
                        "itemDisplayOrder": display_order,
                        "storeId": None,
                        "notes": notes,
                        "isComplete": False,
                        "isFavorite": False,
                        "listingId": None,
                        "promotionStart": None,
                        "promotionEnd": None,
                        "couponId": None,
                    }
                ]
            }

            response = self.meijer._make_request(
                "POST", url, headers=headers, json_data=data
            )

            if response.status_code in [200, 201]:
                self.logger.info(f"Added item {description or upc} to shopping list")
                return True
            else:
                self.logger.error(
                    f"Failed to add item: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error adding item to shopping list: {e}")
            return False

    def complete_item(self, item_id: str) -> bool:
        """Mark item as completed using real APK-discovered endpoint."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            # Use real endpoint with itemId path parameter from APK (Hq/d.java)
            endpoint = self.endpoints["mark_complete"].format(itemId=item_id)
            url = urljoin(self.meijer.api_base_url, endpoint)
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis
            headers.update(
                {"Accept": "application/vnd.meijer.listManagement.listItem-v1.0+json"}
            )

            # PUT request with no body, itemId in path
            response = self.meijer._make_request("PUT", url, headers=headers)

            if response.status_code in [
                200,
                201,
                204,
                205,
            ]:  # 205 = Reset Content (success)
                self.logger.info(f"Completed item {item_id}")
                return True
            else:
                self.logger.error(
                    f"Failed to complete item: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error completing item: {e}")
            return False

    def delete_item(self, item_id: str) -> bool:
        """Delete item from shopping list using real APK-discovered endpoint."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            # Use real endpoint with itemId path parameter from APK (Hq/d.java)
            endpoint = self.endpoints["delete_item"].format(itemId=item_id)
            url = urljoin(self.meijer.api_base_url, endpoint)
            headers = self.meijer._get_api_headers()

            # DELETE request with no body, itemId in path
            response = self.meijer._make_request("DELETE", url, headers=headers)

            if response.status_code in [
                200,
                201,
                204,
                205,
            ]:  # 205 = Reset Content (success)
                self.logger.info(f"Deleted item {item_id}")
                return True
            else:
                self.logger.error(
                    f"Failed to delete item: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error deleting item: {e}")
            return False

    def get_favorites(self) -> List[ListItem]:
        """Get favorites list items using real APK-discovered endpoint."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["get_favorites"])
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis (Hq/d.java)
            headers.update({"Accept": "application/vnd.meijer.favorites-v1.0+json"})

            response = self.meijer._make_request("GET", url, headers=headers)

            if response.status_code == 200:
                data = response.json()
                self.logger.info(
                    f"Get favorites response: Found {data.get('totalCount', 0)} total favorites"
                )
                items = []
                # Use correct field name from API response: 'favoriteListItems' not 'favoriteItems'
                for item_data in data.get("favoriteListItems", []):
                    # Map API response keys to ListItem constructor parameters
                    mapped_data = self._map_api_response_to_listitem(item_data)
                    items.append(ListItem(**mapped_data))
                return items
            else:
                self.logger.error(
                    f"Failed to get favorites list: {response.status_code}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Error getting favorites list: {e}")
            return []

    def add_favorite(self, upc: str) -> bool:
        """Add item to favorites by UPC using real APK-discovered endpoint."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["add_favorite"])
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis (Hq/d.java)
            headers.update(
                {
                    "Content-Type": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                    "Accept": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                }
            )

            # Real request body structure from APK (AddFavoritesItemsRequest + FavoriteListItemWireModel)
            data = {
                "favoriteListItems": [
                    {
                        "listItemId": 0,  # New favorite
                        "listItemTypeId": 1,  # Standard item type
                        "itemDisplayOrder": 1,
                        "itemPartNumber": upc,  # UPC goes here
                        "itemDescription": f"Product {upc}",
                        "isItemInActiveList": False,
                    }
                ]
            }

            response = self.meijer._make_request(
                "POST", url, headers=headers, json_data=data
            )

            if response.status_code in [200, 201]:  # 201 = Created (success)
                self.logger.info(f"Added item {upc} to favorites")
                # Log the response to understand the structure
                try:
                    response_data = response.json()
                    self.logger.info(f"Add favorite response: {response_data}")
                except:
                    self.logger.info(
                        f"Add favorite response (non-JSON): {response.text}"
                    )
                return True
            else:
                self.logger.error(
                    f"Failed to add to favorites: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error adding item to favorites: {e}")
            return False

    def delete_favorite(self, upc: str) -> bool:
        """Delete item from favorites by UPC using real APK-discovered endpoint."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            # Refresh favorites list to get the latest state
            self.logger.info(f"Refreshing favorites list to find item {upc}")
            favorites = self.get_favorites()

            self.logger.info(f"Found {len(favorites)} favorites")
            for i, item in enumerate(favorites):
                self.logger.info(
                    f"  {i + 1}. ID:{getattr(item, 'list_item_id', 'N/A')} UPC:{getattr(item, 'item_part_number', 'N/A')} Desc:{getattr(item, 'item_description', 'N/A')}"
                )

            # Try multiple ways to match the item
            target_item = None
            for item in favorites:
                # Try exact UPC match
                if getattr(item, "item_part_number", None) == upc:
                    target_item = item
                    self.logger.info(f"Found exact UPC match: {item.list_item_id}")
                    break
                # Try description match as fallback
                elif getattr(item, "item_description", "") and upc in getattr(
                    item, "item_description", ""
                ):
                    target_item = item
                    self.logger.info(f"Found description match: {item.list_item_id}")
                    break

            if not target_item:
                self.logger.warning(f"Item {upc} not found in favorites after refresh")
                self.logger.warning("Available favorites:")
                for item in favorites:
                    self.logger.warning(
                        f"  - UPC: {getattr(item, 'item_part_number', 'None')}, Desc: {getattr(item, 'item_description', 'None')}"
                    )
                return False

            self.logger.info(
                f"Attempting to delete favorite item ID: {target_item.list_item_id}"
            )

            # Use real endpoint with listItemIds array from APK (Hq/d.java)
            url = urljoin(self.meijer.api_base_url, self.endpoints["delete_favorite"])
            headers = self.meijer._get_api_headers()

            # Use real headers from APK analysis
            headers.update(
                {
                    "Content-Type": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                    "Accept": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                }
            )

            # Real request body structure from APK (DeleteFavoritesItemsRequest)
            data = {
                "listItemIds": [
                    target_item.list_item_id
                ]  # Array of Long listItemIds to delete
            }

            response = self.meijer._make_request(
                "POST", url, headers=headers, json_data=data
            )

            if response.status_code in [200, 201, 204, 205]:  # Accept all success codes
                self.logger.info(
                    f"Successfully removed item {upc} (ID:{target_item.list_item_id}) from favorites"
                )
                return True
            else:
                self.logger.error(
                    f"Failed to remove from favorites: {response.status_code} - {response.text}"
                )
                return False

        except Exception as e:
            self.logger.error(f"Error removing item from favorites: {e}")
            return False

    def defrag(self, store_id: Optional[str] = None, reverse: bool = False, zig: bool = False) -> bool:
        """
        Defrag the shopping list by organizing items by aisle/location.
        
        Args:
            store_id: Store ID to use for location lookup (defaults to current store)
            reverse: If True, sort items in reverse order (descending)
            zig: If True, alternate B aisle sorting (B1 ascending, B2 descending, etc.)
            
        Returns:
            bool: True if defrag was successful, False otherwise
        """
        if not store_id:
            # Try to get store ID from current context
            try:
                stores = self.meijer.get_stores()
                if stores:
                    store_id = str(stores[0].store_id)
                else:
                    store_id = "217"  # Default store from logs
            except Exception as e:
                self.logger.warning(f"⚠️  Failed to get stores: {e}")
                store_id = "217"  # Default store from logs
        
        self.logger.info(f"🔧 Starting shopping list defrag for store: {store_id}")
        
        # Get current list items
        try:
            items = self.get()
        except Exception as e:
            self.logger.error(f"❌ Failed to get list items: {e}")
            return False
        
        if not items:
            self.logger.info("ℹ️  No items to defrag")
            return True
        
        self.logger.info(f"⏳ This may take a moment to search for product locations...")
        
        # Process each item to get location information
        items_with_locations = []
        
        for item in items:
            try:
                # First, try to get product detail if we have a UPC
                location_info = None
                matched_product = None
                match_confidence = "Low"
                
                if item.item_part_number and item.item_part_number.startswith(("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")):
                    # This looks like a UPC, try to get product detail
                    try:
                        product_detail = self.meijer.get_product_detail(item.item_part_number, store_id)
                        if product_detail and product_detail.aisle_primary:
                            # We have real location data!
                            location_info = {
                                "aisle": product_detail.aisle_primary,
                                "section": product_detail.aisle_locations[0] if product_detail.aisle_locations else "Unknown",
                                "zone": "Store",
                                "zone_code": "STORE",
                            }
                            matched_product = {
                                "title": product_detail.title,
                                "price": product_detail.price,
                                "brand": product_detail.brand,
                                "category": product_detail.category,
                                "aisle": product_detail.aisle_primary,
                                "section": product_detail.aisle_locations[0] if product_detail.aisle_locations else "Unknown",
                            }
                            match_confidence = "High"
                            self.logger.info(f"📍 Found real location: {product_detail.aisle_primary}")
                        else:
                            self.logger.info(f"📍 No location data found for UPC {item.item_part_number}")
                    except Exception as e:
                        self.logger.warning(f"⚠️  Error fetching product detail for UPC {item.item_part_number}: {e}")
                
                # If we don't have real location data, fall back to search
                if not location_info:
                    # Split item name by comma and search for first part only
                    search_query = item.name.split(',')[0].strip()
                    self.logger.info(f"🔍 Searching for: {search_query}")
                    
                    # Initialize search client
                    if not SEARCH_AVAILABLE:
                        self.logger.warning("⚠️  Search functionality not available, skipping search")
                        location_info = {
                            "aisle": "Search_Unavailable",
                            "section": "Online",
                            "zone": "Online",
                            "zone_code": "ONLINE",
                        }
                        matched_product = {
                            "title": item.name,
                            "price": None,
                            "brand": None,
                            "category": None,
                            "aisle": "Online",
                            "section": "No_Search",
                        }
                        match_confidence = "Low"
                    else:
                        try:
                            search_client = Search(self.meijer)
                            
                            # Search for the item
                            search_results = search_client.search(
                                query=search_query,
                                results_per_page=5,  # Just get first few results
                                store_id=store_id,
                            )
                            
                            if search_results and search_results.results:
                                # Found search results
                                top_result = search_results.results[0]
                                
                                # Try to get product detail for the top search result
                                if top_result.upc:
                                    try:
                                        product_detail = self.meijer.get_product_detail(top_result.upc, store_id)
                                        if product_detail and product_detail.aisle_primary:
                                            # We have real location data from search result!
                                            location_info = {
                                                "aisle": product_detail.aisle_primary,
                                                "section": product_detail.aisle_locations[0] if product_detail.aisle_locations else "Unknown",
                                                "zone": "Store",
                                                "zone_code": "STORE",
                                            }
                                            matched_product = {
                                                "title": product_detail.title,
                                                "price": product_detail.price,
                                                "brand": product_detail.brand,
                                                "category": product_detail.category,
                                                "aisle": product_detail.aisle_primary,
                                                "section": product_detail.aisle_locations[0] if product_detail.aisle_locations else "Unknown",
                                            }
                                            match_confidence = "High"
                                            self.logger.info(f"📍 Found real location via search: {product_detail.aisle_primary}")
                                        else:
                                            # No real location, but we have search results
                                            location_info = {
                                                "aisle": f"Search_{match_confidence}",
                                                "section": "Online",
                                                "zone": "Online",
                                                "zone_code": "ONLINE",
                                            }
                                            matched_product = {
                                                "title": top_result.title,
                                                "price": top_result.price,
                                                "brand": top_result.brand,
                                                "category": top_result.category,
                                                "aisle": "Online",
                                                "section": "Search",
                                            }
                                            match_confidence = "Medium"
                                            self.logger.info(f"📍 Using search result: {top_result.title}")
                                    except Exception as e:
                                        self.logger.warning(f"⚠️  Error fetching product detail for search result UPC {top_result.upc}: {e}")
                                        # Fall back to search result only
                                        location_info = {
                                            "aisle": f"Search_{match_confidence}",
                                            "section": "Online",
                                            "zone": "Online",
                                            "zone_code": "ONLINE",
                                        }
                                        matched_product = {
                                            "title": top_result.title,
                                            "price": top_result.price,
                                            "brand": top_result.brand,
                                            "category": top_result.category,
                                            "aisle": "Online",
                                            "section": "Search",
                                        }
                                        match_confidence = "Medium"
                                else:
                                    # No UPC, use search result directly
                                    location_info = {
                                        "aisle": f"Search_{match_confidence}",
                                        "section": "Online",
                                        "zone": "Online",
                                        "zone_code": "ONLINE",
                                    }
                                    matched_product = {
                                        "title": top_result.title,
                                        "price": top_result.price,
                                        "brand": top_result.brand,
                                        "category": top_result.category,
                                        "aisle": "Online",
                                        "section": "Search",
                                    }
                                    match_confidence = "Medium"
                                    self.logger.info(f"📍 Using search result without UPC: {top_result.title}")
                            else:
                                # No search results found
                                self.logger.warning(f"⚠️  No search results found for {search_query}")
                                
                                # Try to find related results by searching for broader terms
                                broader_terms = self._get_broader_search_terms(search_query)
                                found_related = False
                                
                                for broader_term in broader_terms:
                                    try:
                                        related_results = search_client.search(
                                            query=broader_term,
                                            results_per_page=3,
                                            store_id=store_id,
                                        )
                                        
                                        if related_results and related_results.results:
                                            top_related = related_results.results[0]
                                            self.logger.info(f"📍 Found related result for '{broader_term}': {top_related.title}")
                                            
                                            location_info = {
                                                "aisle": f"Related_{match_confidence}",
                                                "section": "Online",
                                                "zone": "Online",
                                                "zone_code": "ONLINE",
                                            }
                                            matched_product = {
                                                "title": top_related.title,
                                                "price": top_related.price,
                                                "brand": top_related.brand,
                                                "category": top_related.category,
                                                "aisle": "Online",
                                                "section": "Related",
                                            }
                                            match_confidence = "Low"
                                            found_related = True
                                            break
                                            
                                    except Exception as e:
                                        self.logger.debug(f"Debug: No related results for '{broader_term}': {e}")
                                        continue
                                
                                if not found_related:
                                    # No related results either
                                    location_info = {
                                        "aisle": f"Search_{match_confidence}",
                                        "section": "Online",
                                        "zone": "Online",
                                        "zone_code": "ONLINE",
                                    }
                                    matched_product = {
                                        "title": item.name,
                                        "price": None,
                                        "brand": None,
                                        "category": None,
                                        "aisle": "Online",
                                        "section": "No_Match",
                                    }
                                    match_confidence = "Low"
                                    self.logger.warning(f"⚠️  No related results found for {search_query}")
                        
                        except Exception as e:
                            self.logger.error(f"❌ Search failed for {search_query}: {e}")
                            # Use fallback location
                            location_info = {
                                "aisle": f"Search_{match_confidence}",
                                "section": "Online",
                                "zone": "Online",
                                "zone_code": "ONLINE",
                            }
                            matched_product = {
                                "title": item.name,
                                "price": None,
                                "brand": None,
                                "category": None,
                                "aisle": "Online",
                                "section": "Error",
                            }
                            match_confidence = "Low"
                
                # Store item with location information for sorting
                items_with_locations.append({
                    "item": item,
                    "location": location_info,
                    "matched_product": matched_product,
                    "match_confidence": match_confidence,
                })
                
            except Exception as e:
                self.logger.error(f"❌ Error processing item '{item.name}': {e}")
                # Add error item to list
                items_with_locations.append({
                    "item": item,
                    "location": {
                        "aisle": "Error",
                        "section": "Error",
                        "zone": "Error",
                        "zone_code": "ERROR",
                    },
                    "matched_product": {
                        "title": item.name,
                        "price": None,
                        "brand": None,
                        "category": None,
                        "aisle": "Error",
                        "section": "Error",
                    },
                    "match_confidence": "Error",
                })
        
        # Sort items by location (real aisle data first, then search confidence)
        def get_location_sort_key(item_data):
            location = item_data.get("location")
            match_confidence = item_data.get("match_confidence", "Low")
            
            if location and location.get("zone_code") == "STORE":
                # Real store location - sort by aisle, then section
                aisle = location.get("aisle", "")
                section = location.get("section", "")
                
                # Extract aisle number for sorting (e.g., "B" -> 2, "A" -> 1)
                aisle_num = 0
                if aisle:
                    try:
                        # Handle alphanumeric aisles like "B", "A1", "B2", etc.
                        if aisle[0].isalpha():
                            aisle_num = ord(aisle[0].upper()) - ord('A') + 1
                            # Add subsection number if present
                            if len(aisle) > 1 and aisle[1:].isdigit():
                                aisle_num = aisle_num * 100 + int(aisle[1:])
                    except (ValueError, IndexError):
                        aisle_num = 999  # Put unknown aisles at the end
                
                # Extract section number for secondary sorting
                section_num = 0
                if section and str(section).replace("Section:", "").strip().isdigit():
                    try:
                        section_num = int(str(section).replace("Section:", "").strip())
                    except ValueError:
                        section_num = 999
                
                return (0, aisle_num, section_num, item_data["item"].name.lower())
            else:
                # Search-based location - sort by confidence, then by original name
                confidence_score = {"High": 3, "Medium": 2, "Low": 1, "Error": 0}.get(match_confidence, 0)
                has_match = 1 if item_data.get("matched_product") else 0
                return (1, confidence_score, has_match, item_data["item"].name.lower())
        
        # Apply zig-zag sorting for B aisles if requested and we have real aisle data
        real_aisle_items = [item for item in items_with_locations 
                           if item.get("location", {}).get("zone_code") == "STORE"]
        
        if zig and real_aisle_items:
            self.logger.info("🔄 Applying zig-zag sorting for real aisle data...")
            
            # Group items by aisle
            aisle_groups = {}
            for item_data in real_aisle_items:
                aisle = item_data["location"]["aisle"]
                if aisle not in aisle_groups:
                    aisle_groups[aisle] = []
                aisle_groups[aisle].append(item_data)
            
            # Sort each aisle group
            for aisle in aisle_groups:
                # Sort sections within each aisle
                aisle_groups[aisle].sort(key=lambda x: (
                    int(str(x["location"]["section"]).replace("Section:", "").strip()) 
                    if str(x["location"]["section"]).replace("Section:", "").strip().isdigit() 
                    else 999
                ))
                
                # Apply zig-zag within each aisle if it has multiple sections
                if len(aisle_groups[aisle]) > 1:
                    sections = [int(str(x["location"]["section"]).replace("Section:", "").strip()) 
                              for x in aisle_groups[aisle] 
                              if str(x["location"]["section"]).replace("Section:", "").strip().isdigit()]
                    if len(set(sections)) > 1:
                        # Reverse every other section group for zig-zag effect
                        current_section = None
                        section_start = 0
                        for i, item_data in enumerate(aisle_groups[aisle]):
                            item_section = str(item_data["location"]["section"]).replace("Section:", "").strip()
                            if item_section.isdigit():
                                item_section = int(item_section)
                                if current_section is None:
                                    current_section = item_section
                                elif item_section != current_section:
                                    # We've moved to a new section, reverse the previous group if needed
                                    if (current_section // 10) % 2 == 1:  # Odd section groups get reversed
                                        aisle_groups[aisle][section_start:i] = reversed(aisle_groups[aisle][section_start:i])
                                    current_section = item_section
                                    section_start = i
                        
                        # Handle the last section group
                        if current_section and (current_section // 10) % 2 == 1:
                            aisle_groups[aisle][section_start:] = reversed(aisle_groups[aisle][section_start:])
            
            # Combine sorted aisle groups
            sorted_real_items = []
            for aisle in sorted(aisle_groups.keys(), key=lambda x: (
                ord(x[0].upper()) - ord('A') + 1 if x[0].isalpha() else 999
            )):
                sorted_real_items.extend(aisle_groups[aisle])
            
            # Sort search-based items by confidence
            search_items = [item for item in items_with_locations 
                          if item.get("location", {}).get("zone_code") != "STORE"]
            sorted_search_items = sorted(search_items, key=get_location_sort_key)
            
            # Combine real aisle items first, then search items
            sorted_items = sorted_real_items + sorted_search_items
            
        else:
            # Normal sorting by location (real aisles first, then search confidence)
            sorted_items = sorted(items_with_locations, key=get_location_sort_key, reverse=False)
        
        # Apply reverse sorting if requested
        if reverse:
            sorted_items = list(reversed(sorted_items))
        
        # Clear the current list
        self.logger.info("🗑️  Clearing current shopping list...")
        self.clear_list()
        
        # Re-add items in sorted order with enhanced location notes
        self.logger.info("📝 Re-adding items in aisle order with enhanced notes...")
        added_count = 0
        
        for idx, item_data in enumerate(sorted_items):
            item = item_data["item"]
            location = item_data["location"]
            matched_product = item_data.get("matched_product")
            
            # Create enhanced notes with the format: "Aisle:Section | Full Product Name"
            notes_parts = []
            
            # Add location information FIRST
            if location and location.get("aisle"):
                aisle = location['aisle']
                section = location.get('section', '')
                
                if location.get("zone_code") == "STORE":
                    # Real store location - format as "B16 Section 23 | Product Name"
                    if section and section != 'Unknown':
                        # Extract just the section number if it's formatted as "Section: 35"
                        section_num = str(section).replace("Section:", "").strip()
                        if section_num.isdigit():
                            notes_parts.append(f"{aisle} Section {section_num}")
                        else:
                            notes_parts.append(f"{aisle}{section}")
                    else:
                        notes_parts.append(aisle)
                else:
                    # Search-based location - format as "Search_High | Product Name"
                    if section and section != 'Unknown':
                        notes_parts.append(f"{aisle}:{section}")
                    else:
                        notes_parts.append(aisle)
            
            # Add pipe separator if we have location info
            if notes_parts:
                notes_parts.append("|")
            
            # Add the FULL searched product name
            if matched_product and matched_product.get('title'):
                notes_parts.append(matched_product['title'])
            
            # Join notes with proper formatting
            enhanced_notes = " ".join(notes_parts) if notes_parts else None
            
            # Limit notes to 60 characters as required by the API
            if enhanced_notes and len(enhanced_notes) > 60:
                # Try to truncate intelligently
                if "|" in enhanced_notes:
                    location_part = enhanced_notes.split("|")[0].strip()
                    if len(location_part) < 55:  # Leave room for " | ..."
                        enhanced_notes = f"{location_part} | ..."
                    else:
                        enhanced_notes = enhanced_notes[:57] + "..."
                else:
                    enhanced_notes = enhanced_notes[:57] + "..."
            
            # Re-add the item with the ORIGINAL name and enhanced location information
            success = self.add_item_with_details(
                upc=item.item_part_number or f"ITEM_{item.list_item_id}",
                quantity=item.quantity,
                description=item.name,  # Use original item name, not description
                notes=enhanced_notes,
                display_order=idx,
            )
            
            if success:
                added_count += 1
                location_display = location.get("aisle", "Unknown") if location else "Unknown"
                self.logger.info(f"✅ Added: {item.name} (Location: {location_display})")
            else:
                self.logger.warning(f"⚠️  Failed to re-add item: {item.name}")
        
        # Summary with detailed statistics
        self.logger.info(f"🎉 Defrag complete! Reorganized {added_count} items by aisle")
        
        # Show confidence distribution
        confidence_counts = {}
        for item_data in items_with_locations:
            confidence = item_data.get("match_confidence", "Unknown")
            confidence_counts[confidence] = confidence_counts.get(confidence, 0) + 1
        
        self.logger.info("🎯 Match Confidence Summary:")
        for confidence, count in confidence_counts.items():
            self.logger.info(f"   {confidence}: {count} item(s)")
        
        return added_count > 0
    
    def _get_broader_search_terms(self, search_query: str) -> List[str]:
        """
        Generate broader search terms when the original search fails.
        
        Args:
            search_query: Original search query
            
        Returns:
            List of broader search terms to try
        """
        terms = []
        
        # Remove common prefixes/suffixes
        query = search_query.lower()
        
        # Remove brand names
        brand_removals = ["meijer", "fresh from meijer", "hunt's", "sargento", "polar"]
        for brand in brand_removals:
            if brand in query:
                query = query.replace(brand, "").strip()
        
        # Remove common descriptors
        descriptor_removals = ["st. louis style", "sliced", "watermelon", "3 lb bag", "5 lb bag", "8 oz", "1 gallon"]
        for desc in descriptor_removals:
            if desc in query:
                query = query.replace(desc, "").strip()
        
        # Add the cleaned query
        if query and len(query) > 2:
            terms.append(query)
        
        # Add common food categories
        if any(word in search_query.lower() for word in ["milk", "cheese", "yogurt"]):
            terms.extend(["dairy", "milk"])
        elif any(word in search_query.lower() for word in ["chicken", "beef", "pork", "spareribs"]):
            terms.extend(["meat", "chicken", "beef"])
        elif any(word in search_query.lower() for word in ["potato", "onion", "apple", "banana"]):
            terms.extend(["produce", "vegetables", "fruit"])
        elif any(word in search_query.lower() for word in ["toothpaste", "cream"]):
            terms.extend(["personal care", "bathroom"])
        
        # Add the original query as fallback
        if search_query not in terms:
            terms.append(search_query)
        
        return terms

    def _map_api_response_to_listitem(
        self, item_data: Dict[str, Any]
    ) -> Dict[str, Any]:
        """
        Map API response keys from camelCase to snake_case for ListItem constructor.

        Args:
            item_data: Raw API response data with camelCase keys

        Returns:
            Dict with snake_case keys for ListItem constructor
        """
        # Mapping from API response keys to ListItem constructor parameters
        key_mapping = {
            "listItemId": "list_item_id",
            "listItemTypeId": "list_item_type_id",
            "itemDisplayOrder": "item_display_order",
            "itemPartNumber": "item_part_number",
            "itemDescription": "item_description",
            "quantity": "quantity",  # Add missing quantity mapping
            "notes": "notes",  # Add missing notes mapping
            "storeId": "store_id",
            "isComplete": "is_complete",
            "isFavorite": "is_favorite",
            "listingId": "listing_id",
            "promotionStart": "promotion_start",
            "promotionEnd": "promotion_end",
            "couponId": "coupon_id",
        }

        mapped_data = {}
        for api_key, constructor_key in key_mapping.items():
            if api_key in item_data:
                mapped_data[constructor_key] = item_data[api_key]

        # Handle special cases
        if "promotionStart" in item_data and item_data["promotionStart"]:
            try:
                from datetime import datetime

                mapped_data["promotion_start"] = datetime.fromisoformat(
                    item_data["promotionStart"].replace("Z", "+00:00")
                ).date()
            except (ValueError, TypeError):
                mapped_data["promotion_start"] = None

        if "promotionEnd" in item_data and item_data["promotionEnd"]:
            try:
                from datetime import datetime

                mapped_data["promotion_end"] = datetime.fromisoformat(
                    item_data["promotionEnd"].replace("Z", "+00:00")
                ).date()
            except (ValueError, TypeError):
                mapped_data["promotion_end"] = None

        # Set default values for required fields
        mapped_data.setdefault("list_item_id", 0)
        mapped_data.setdefault("list_item_type_id", 1)
        mapped_data.setdefault("item_display_order", 1)
        mapped_data.setdefault("item_description", "Unknown Item")
        mapped_data.setdefault("quantity", 1)
        mapped_data.setdefault("store_id", 0)
        mapped_data.setdefault("notes", None)
        mapped_data.setdefault("is_complete", False)
        mapped_data.setdefault("is_favorite", False)
        mapped_data.setdefault("listing_id", None)
        mapped_data.setdefault("coupon_id", 0)
        mapped_data.setdefault(
            "promotion_start", None
        )  # Ensure this is always provided
        mapped_data.setdefault("promotion_end", None)  # Ensure this is always provided

        return mapped_data
