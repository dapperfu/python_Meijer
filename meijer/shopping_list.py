"""
Meijer Shopping List Management
==============================

Shopping list functionality for the Meijer API client.
"""

from typing import List, TYPE_CHECKING, Optional, Dict, Any
from urllib.parse import urljoin

try:
    from tabulate import tabulate
    TABULATE_AVAILABLE = True
except ImportError:
    TABULATE_AVAILABLE = False
    # Fallback to basic formatting if tabulate not available

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
            upc=upc, 
            quantity=quantity, 
            description=f"Product {upc}"
        )

    def add_item_with_details(
        self, 
        upc: str, 
        quantity: int = 1, 
        description: Optional[str] = None,
        notes: Optional[str] = None,
        display_order: int = 1
    ) -> bool:
        """Add item to shopping list with custom description and notes."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")

            url = urljoin(self.meijer.api_base_url, self.endpoints["add_item"])
            headers = self.meijer._get_api_headers()
            
            # Use real headers from APK analysis (Hq/d.java)
            headers.update({
                "Content-Type": "application/vnd.meijer.listManagement.list-v1.0+json",
                "Accept": "application/vnd.meijer.listManagement.list-v1.0+json"
            })

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
                        "couponId": None
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
                self.logger.error(f"Failed to add item: {response.status_code} - {response.text}")
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
            headers.update({
                "Accept": "application/vnd.meijer.listManagement.listItem-v1.0+json"
            })

            # PUT request with no body, itemId in path
            response = self.meijer._make_request("PUT", url, headers=headers)

            if response.status_code in [200, 201, 204, 205]:  # 205 = Reset Content (success)
                self.logger.info(f"Completed item {item_id}")
                return True
            else:
                self.logger.error(f"Failed to complete item: {response.status_code} - {response.text}")
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

            if response.status_code in [200, 201, 204, 205]:  # 205 = Reset Content (success)
                self.logger.info(f"Deleted item {item_id}")
                return True
            else:
                self.logger.error(f"Failed to delete item: {response.status_code} - {response.text}")
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
            headers.update({
                "Accept": "application/vnd.meijer.favorites-v1.0+json"
            })

            response = self.meijer._make_request("GET", url, headers=headers)

            if response.status_code == 200:
                data = response.json()
                self.logger.info(f"Get favorites response: Found {data.get('totalCount', 0)} total favorites")
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
            headers.update({
                "Content-Type": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                "Accept": "application/vnd.meijer.listManagement.favorites-v1.0+json"
            })

            # Real request body structure from APK (AddFavoritesItemsRequest + FavoriteListItemWireModel)
            data = {
                "favoriteListItems": [
                    {
                        "listItemId": 0,  # New favorite
                        "listItemTypeId": 1,  # Standard item type
                        "itemDisplayOrder": 1,
                        "itemPartNumber": upc,  # UPC goes here
                        "itemDescription": f"Product {upc}",
                        "isItemInActiveList": False
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
                    self.logger.info(f"Add favorite response (non-JSON): {response.text}")
                return True
            else:
                self.logger.error(f"Failed to add to favorites: {response.status_code} - {response.text}")
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
                self.logger.info(f"  {i+1}. ID:{getattr(item, 'list_item_id', 'N/A')} UPC:{getattr(item, 'item_part_number', 'N/A')} Desc:{getattr(item, 'item_description', 'N/A')}")
            
            # Try multiple ways to match the item
            target_item = None
            for item in favorites:
                # Try exact UPC match
                if getattr(item, 'item_part_number', None) == upc:
                    target_item = item
                    self.logger.info(f"Found exact UPC match: {item.list_item_id}")
                    break
                # Try description match as fallback 
                elif getattr(item, 'item_description', '') and upc in getattr(item, 'item_description', ''):
                    target_item = item
                    self.logger.info(f"Found description match: {item.list_item_id}")
                    break
                    
            if not target_item:
                self.logger.warning(f"Item {upc} not found in favorites after refresh")
                self.logger.warning("Available favorites:")
                for item in favorites:
                    self.logger.warning(f"  - UPC: {getattr(item, 'item_part_number', 'None')}, Desc: {getattr(item, 'item_description', 'None')}")
                return False

            self.logger.info(f"Attempting to delete favorite item ID: {target_item.list_item_id}")
            
            # Use real endpoint with listItemIds array from APK (Hq/d.java)
            url = urljoin(self.meijer.api_base_url, self.endpoints["delete_favorite"])
            headers = self.meijer._get_api_headers()
            
            # Use real headers from APK analysis
            headers.update({
                "Content-Type": "application/vnd.meijer.listManagement.favorites-v1.0+json",
                "Accept": "application/vnd.meijer.listManagement.favorites-v1.0+json"
            })

            # Real request body structure from APK (DeleteFavoritesItemsRequest)
            data = {
                "listItemIds": [target_item.list_item_id]  # Array of Long listItemIds to delete
            }

            response = self.meijer._make_request(
                "POST", url, headers=headers, json_data=data
            )

            if response.status_code in [200, 201, 204, 205]:  # Accept all success codes
                self.logger.info(f"Successfully removed item {upc} (ID:{target_item.list_item_id}) from favorites")
                return True
            else:
                self.logger.error(f"Failed to remove from favorites: {response.status_code} - {response.text}")
                return False

        except Exception as e:
            self.logger.error(f"Error removing item from favorites: {e}")
            return False

    def defrag(self, store_id: Optional[str] = None) -> bool:
        """
        Defragment shopping list by organizing items by aisle number.
        
        This function:
        1. Gets all current shopping list items
        2. Searches for each item to find its store location (aisle, section)
        3. Deletes all items from the list
        4. Re-adds items sorted by aisle number with location info in notes
        
        Args:
            store_id: Store ID to use for location lookup (optional)
            
        Returns:
            bool: True if defrag was successful, False otherwise
        """
        try:
            self.logger.info("🔧 Starting shopping list defrag...")
            
            # Step 1: Get current shopping list items
            current_items = self.get()
            if not current_items:
                self.logger.info("📝 Shopping list is empty, nothing to defrag")
                return True
                
            self.logger.info(f"📋 Found {len(current_items)} items to defrag")
            
            # Step 2: Search for each item to get location information
            items_with_locations = []
            search_client = None
            
            try:
                from .search import Search
                search_client = Search(self.meijer)
            except ImportError:
                self.logger.error("❌ Search functionality not available for defrag")
                return False
            
            # Create detailed matching table data
            matching_table_data = []
            
            for item in current_items:
                self.logger.info(f"🔍 Searching for: {item.name}")
                
                # Search for the item
                search_results = search_client.search(
                    query=item.name,
                    results_per_page=5,  # Just get first few results
                    store_id=store_id
                )
                
                # Find the first matching result
                location_info = None
                matched_product = None
                match_confidence = "Low"
                
                if search_results and search_results.results:
                    first_result = search_results.results[0]
                    
                    # Calculate match confidence based on name similarity
                    original_name = item.name.lower()
                    matched_name = first_result.title.lower()
                    
                    # Simple similarity check
                    if original_name in matched_name or matched_name in original_name:
                        match_confidence = "High"
                    elif any(word in matched_name for word in original_name.split()):
                        match_confidence = "Medium"
                    
                    # Check if the result has location information
                    # Note: Constructor.io search results may not have aisle info
                    # We might need to use a different API for location data
                    if hasattr(first_result, 'aisle') and first_result.aisle:
                        location_info = {
                            'aisle': first_result.aisle,
                            'section': getattr(first_result, 'section', None),
                            'zone': getattr(first_result, 'zone', None),
                            'zone_code': getattr(first_result, 'zone_code', None)
                        }
                        self.logger.info(f"📍 Found location: Aisle {first_result.aisle}, Section {getattr(first_result, 'section', 'Unknown')}")
                    else:
                        self.logger.info(f"📍 No aisle data in search result for {item.name}")
                    
                    # Store matched product details
                    matched_product = {
                        'title': first_result.title,
                        'price': getattr(first_result, 'price', 'N/A'),
                        'brand': getattr(first_result, 'brand', 'N/A'),
                        'category': getattr(first_result, 'category', 'N/A'),
                        'aisle': getattr(first_result, 'aisle', 'Unknown'),
                        'section': getattr(first_result, 'section', 'Unknown')
                    }
                else:
                    self.logger.warning(f"⚠️  No search results found for {item.name}")
                
                # Add to detailed table data
                matching_table_data.append({
                    'Original Item': item.name,
                    'Closest Match': matched_product['title'] if matched_product else 'No match found',
                    'Brand': matched_product.get('brand', 'N/A') if matched_product else 'N/A',
                    'Price': matched_product.get('price', 'N/A') if matched_product else 'N/A',
                    'Aisle': matched_product.get('aisle', 'Unknown') if matched_product else 'Unknown',
                    'Section': matched_product.get('section', 'Unknown') if matched_product else 'Unknown',
                    'Match Confidence': match_confidence,
                    'Category': matched_product.get('category', 'N/A') if matched_product else 'N/A'
                })
                
                items_with_locations.append({
                    'item': item,
                    'location': location_info,
                    'matched_product': matched_product,
                    'match_confidence': match_confidence
                })
            
            # Display detailed matching table
            self.logger.info("📊 Product Matching Results:")
            self.logger.info("=" * 80)
            
            if TABULATE_AVAILABLE:
                # Use tabulate for proper table formatting
                table_headers = ["Original Item", "Closest Match", "Brand", "Price", "Aisle", "Section", "Confidence"]
                table_rows = []
                
                for row in matching_table_data:
                    table_rows.append([
                        row['Original Item'][:30] + "..." if len(row['Original Item']) > 30 else row['Original Item'],
                        row['Closest Match'][:35] + "..." if len(row['Closest Match']) > 35 else row['Closest Match'],
                        row['Brand'][:20] + "..." if row['Brand'] and len(str(row['Brand'])) > 20 else row['Brand'] or 'N/A',
                        row['Price'] or 'N/A',
                        row['Aisle'] or 'Unknown',
                        row['Section'] or 'Unknown',
                        row['Match Confidence']
                    ])
                
                # Display formatted table
                table_output = tabulate(table_rows, headers=table_headers, tablefmt="grid")
                self.logger.info("\n" + table_output)
            else:
                # Fallback to basic formatting if tabulate not available
                self.logger.info("Note: Install 'tabulate' for better table formatting: pip install tabulate")
                
                # Create a formatted table display
                table_header = f"{'Original Item':<25} {'Closest Match':<35} {'Aisle':<8} {'Price':<10} {'Confidence':<12}"
                self.logger.info(table_header)
                self.logger.info("-" * 80)
                
                for row in matching_table_data:
                    # Truncate long names for display
                    original = row['Original Item'][:24] if len(row['Original Item']) > 24 else row['Original Item']
                    match = row['Closest Match'][:34] if len(row['Closest Match']) > 34 else row['Closest Match']
                    aisle = row['Aisle'][:7] if row['Aisle'] and len(str(row['Aisle'])) > 7 else row['Aisle'] or 'Unknown'
                    price = row['Price'][:9] if row['Price'] and len(str(row['Price'])) > 9 else row['Price'] or 'N/A'
                    confidence = row['Match Confidence'][:11] if len(row['Match Confidence']) > 11 else row['Match Confidence']
                    
                    table_row = f"{original:<25} {match:<35} {aisle:<8} {price:<10} {confidence:<12}"
                    self.logger.info(table_row)
                
                self.logger.info("=" * 80)
            
            # Step 3: Sort items by aisle number (handle non-numeric aisles gracefully)
            def get_aisle_sort_key(item_data):
                location = item_data.get('location')
                if not location or not location.get('aisle'):
                    return (999, 0)  # Put items without aisle at the end
                
                aisle = location['aisle']
                try:
                    # Try to extract numeric part for sorting
                    numeric_part = int(''.join(filter(str.isdigit, aisle)))
                    return (0, numeric_part)
                except (ValueError, TypeError):
                    # If no numeric part, sort alphabetically
                    return (1, aisle)
            
            sorted_items = sorted(items_with_locations, key=get_aisle_sort_key)
            
            # Step 4: Delete all current items
            self.logger.info("🗑️  Clearing current shopping list...")
            deleted_count = 0
            for item in current_items:
                if self.delete_item(str(item.list_item_id)):
                    deleted_count += 1
                else:
                    self.logger.warning(f"⚠️  Failed to delete item: {item.name}")
            
            self.logger.info(f"✅ Deleted {deleted_count} items")
            
            # Step 5: Re-add items in sorted order with enhanced location notes
            self.logger.info("📝 Re-adding items in aisle order with enhanced notes...")
            added_count = 0
            
            for idx, item_data in enumerate(sorted_items, 1):
                item = item_data['item']
                location = item_data['location']
                matched_product = item_data.get('matched_product')
                match_confidence = item_data.get('match_confidence', 'Unknown')
                
                # Create enhanced notes with detailed information
                notes_parts = []
                
                # Add location information
                if location:
                    if location.get('aisle'):
                        notes_parts.append(f"Aisle: {location['aisle']}")
                    if location.get('section'):
                        notes_parts.append(f"Section: {location['section']}")
                    if location.get('zone'):
                        notes_parts.append(f"Zone: {location['zone']}")
                
                # Add matched product details
                if matched_product:
                    notes_parts.append(f"Matched: {matched_product['title']}")
                    if matched_product.get('brand'):
                        notes_parts.append(f"Brand: {matched_product['brand']}")
                    if matched_product.get('price'):
                        notes_parts.append(f"Price: {matched_product['price']}")
                    notes_parts.append(f"Match Confidence: {match_confidence}")
                
                # Preserve original notes if they exist
                if item.notes:
                    notes_parts.append(f"Original Notes: {item.notes}")
                
                enhanced_notes = " | ".join(notes_parts) if notes_parts else None
                
                # Limit notes to 60 characters as required by the API
                if enhanced_notes and len(enhanced_notes) > 60:
                    enhanced_notes = enhanced_notes[:57] + "..."
                
                # Re-add the item with enhanced location information
                success = self.add_item_with_details(
                    upc=item.item_part_number or f"ITEM_{item.list_item_id}",
                    quantity=item.quantity,
                    description=item.item_description,
                    notes=enhanced_notes,
                    display_order=idx
                )
                
                if success:
                    added_count += 1
                    aisle_info = location.get('aisle', 'Unknown') if location else 'Unknown'
                    match_title = matched_product['title'][:30] + "..." if matched_product and len(matched_product['title']) > 30 else matched_product.get('title', 'No match') if matched_product else 'No match'
                    self.logger.info(f"✅ Added: {item.name} (Aisle: {aisle_info}, Match: {match_title})")
                else:
                    self.logger.warning(f"⚠️  Failed to re-add item: {item.name}")
            
            # Summary with detailed statistics
            self.logger.info(f"🎉 Defrag complete! Reorganized {added_count} items by aisle")
            self.logger.info(f"📊 Summary: {deleted_count} deleted, {added_count} re-added")
            
            # Show confidence distribution
            confidence_counts = {}
            for item_data in items_with_locations:
                confidence = item_data.get('match_confidence', 'Unknown')
                confidence_counts[confidence] = confidence_counts.get(confidence, 0) + 1
            
            self.logger.info("🎯 Match Confidence Summary:")
            for confidence, count in confidence_counts.items():
                self.logger.info(f"   {confidence}: {count} item(s)")
            
            return added_count > 0
            
        except Exception as e:
            self.logger.error(f"❌ Error during shopping list defrag: {e}")
            return False

    def _map_api_response_to_listitem(self, item_data: Dict[str, Any]) -> Dict[str, Any]:
        """
        Map API response keys from camelCase to snake_case for ListItem constructor.
        
        Args:
            item_data: Raw API response data with camelCase keys
            
        Returns:
            Dict with snake_case keys for ListItem constructor
        """
        # Mapping from API response keys to ListItem constructor parameters
        key_mapping = {
            'listItemId': 'list_item_id',
            'listItemTypeId': 'list_item_type_id',
            'itemDisplayOrder': 'item_display_order',
            'itemPartNumber': 'item_part_number',
            'itemDescription': 'item_description',
            'storeId': 'store_id',
            'isComplete': 'is_complete',
            'isFavorite': 'is_favorite',
            'listingId': 'listing_id',
            'promotionStart': 'promotion_start',
            'promotionEnd': 'promotion_end',
            'couponId': 'coupon_id'
        }
        
        mapped_data = {}
        for api_key, constructor_key in key_mapping.items():
            if api_key in item_data:
                mapped_data[constructor_key] = item_data[api_key]
        
        # Handle special cases
        if 'promotionStart' in item_data and item_data['promotionStart']:
            try:
                from datetime import datetime
                mapped_data['promotion_start'] = datetime.fromisoformat(item_data['promotionStart'].replace('Z', '+00:00')).date()
            except (ValueError, TypeError):
                mapped_data['promotion_start'] = None
        
        if 'promotionEnd' in item_data and item_data['promotionEnd']:
            try:
                from datetime import datetime
                mapped_data['promotion_end'] = datetime.fromisoformat(item_data['promotionEnd'].replace('Z', '+00:00')).date()
            except (ValueError, TypeError):
                mapped_data['promotion_end'] = None
        
        # Set default values for required fields
        mapped_data.setdefault('list_item_id', 0)
        mapped_data.setdefault('list_item_type_id', 1)
        mapped_data.setdefault('item_display_order', 1)
        mapped_data.setdefault('item_description', 'Unknown Item')
        mapped_data.setdefault('quantity', 1)
        mapped_data.setdefault('store_id', 0)
        mapped_data.setdefault('notes', None)
        mapped_data.setdefault('is_complete', False)
        mapped_data.setdefault('is_favorite', False)
        mapped_data.setdefault('listing_id', None)
        mapped_data.setdefault('coupon_id', 0)
        
        return mapped_data


