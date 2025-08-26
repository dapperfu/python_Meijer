# Meijer Favorites System

A comprehensive favorites management system for the Meijer API client, providing full CRUD operations, search capabilities, and integration with shopping lists.

## Overview

The favorites system is built around the HTTP traffic analysis from the Meijer mobile app, implementing the exact API endpoints and data structures used by the official application. It provides a clean, type-safe interface for managing favorite items with full Python dataclass support.

## Features

### 🎯 Core Functionality
- **Complete CRUD Operations**: Add, read, update, and delete favorites
- **Smart Search**: Find favorites by description or UPC
- **Shopping List Integration**: Convert favorites to shopping list items
- **Bulk Operations**: Manage multiple favorites at once
- **Analytics**: Get comprehensive summaries and statistics

### 🔧 Technical Features
- **Type Safety**: Full mypy typing support
- **Data Models**: Structured dataclasses for all API interactions
- **Error Handling**: Comprehensive exception handling and logging
- **Authentication**: Integrated with Meijer authentication system
- **Testing**: Full test coverage with pytest

## Architecture

### Models

#### `FavoriteListItem`
The core data model representing a favorite item:

```python
@dataclass
class FavoriteListItem:
    list_item_id: int
    list_item_type_id: int
    item_display_order: int
    item_part_number: Optional[str]
    item_description: str
    is_item_in_active_list: bool
    # ... additional fields
```

#### `AddFavoritesRequest`
Request model for adding items to favorites:

```python
@dataclass
class AddFavoritesRequest:
    favorite_list_items: List[FavoriteListItem]
    
    @classmethod
    def create_simple(cls, description: str, upc: Optional[str] = None) -> "AddFavoritesRequest"
```

#### `DeleteFavoritesRequest`
Request model for deleting items from favorites:

```python
@dataclass
class DeleteFavoritesRequest:
    list_item_ids: List[int]
    
    @classmethod
    def create_single(cls, list_item_id: int) -> "DeleteFavoritesRequest"
```

#### `UpdateConfirmation`
Response model for API confirmations:

```python
@dataclass
class UpdateConfirmation:
    list_item_id: int
    item_description: str
    # ... additional confirmation fields
```

#### `FavoritesResponse`
Response wrapper for favorites list operations:

```python
@dataclass
class FavoritesResponse:
    favorite_list_items: List[FavoriteListItem]
    total_count: Optional[int]
    
    def find_by_description(self, description: str) -> Optional[FavoriteListItem]
    def find_by_upc(self, upc: str) -> Optional[FavoriteListItem]
```

### FavoritesManager

The main class providing all favorites functionality:

```python
class FavoritesManager:
    def get_favorites(self) -> FavoritesResponse
    def add_favorite(self, description: str, upc: Optional[str] = None) -> Optional[UpdateConfirmation]
    def delete_favorite(self, list_item_id: int) -> bool
    def search_favorites(self, query: str) -> List[FavoriteListItem]
    def add_favorite_to_shopping_list(self, list_item_id: int) -> Optional[UpdateConfirmation]
    # ... additional methods
```

## Usage

### Basic Setup

```python
from meijer import Meijer

# Initialize client
m = Meijer(auth_file="~/.config/meijer/auth.json")

# Access favorites manager
favorites = m.favorites
```

### Adding Favorites

```python
# Add a simple favorite
result = favorites.add_favorite("Organic Milk")

# Add a favorite with UPC
result = favorites.add_favorite("Fresh Bread", "123456789")

if result:
    print(f"Added: {result.item_description} (ID: {result.list_item_id})")
```

### Getting Favorites

```python
# Get all favorites
all_favorites = favorites.get_favorites()
print(f"Found {len(all_favorites)} favorites")

# Iterate through favorites
for item in all_favorites:
    print(f"- {item.item_description} (UPC: {item.upc or 'None'})")
```

### Searching Favorites

```python
# Search by description
milk_items = favorites.search_favorites("milk")
print(f"Found {len(milk_items)} milk items")

# Check if specific item is favorite
is_favorite = favorites.is_favorite("Organic Milk")
print(f"Is favorite: {is_favorite}")
```

### Managing Favorites

```python
# Delete by ID
success = favorites.delete_favorite(123)

# Delete by description
success = favorites.delete_favorite_by_description("Old Item")

# Delete by UPC
success = favorites.delete_favorite_by_upc("123456789")

# Bulk delete
success = favorites.bulk_delete_favorites([123, 456, 789])

# Clear all favorites
success = favorites.clear_all_favorites()
```

### Adding to Shopping List

```python
# Add favorite to shopping list by ID
result = favorites.add_favorite_to_shopping_list(123)

# Add by description
result = favorites.add_favorite_to_shopping_list_by_description("Organic Milk")

# Add by UPC
result = favorites.add_favorite_to_shopping_list_by_upc("123456789")
```

### Analytics and Summary

```python
# Get favorites count
count = favorites.get_favorites_count()

# Get comprehensive summary
summary = favorites.get_favorites_summary()
print(f"Total: {summary['total_count']}")
print(f"With UPC: {summary['items_with_upc']}")
print(f"Manual: {summary['manual_items']}")

# View by type
for item_type, count in summary['by_type'].items():
    print(f"Type {item_type}: {count}")

# View recent items
for item in summary['recent_items']:
    print(f"- {item['description']} (ID: {item['id']})")
```

## API Endpoints

The system uses the exact endpoints from the Meijer mobile app:

- **GET** `/loyalty/shoppinglist/GetFavoritesList` - Retrieve favorites
- **POST** `/loyalty/shoppinglist/AddFavoritesListItem` - Add to favorites
- **POST** `/loyalty/shoppinglist/DeleteBulkListItems` - Delete from favorites
- **POST** `/loyalty/shoppinglist/AddListItem` - Add favorite to shopping list

## Headers

All requests use the proper Meijer API headers:

```python
headers = {
    "Accept": "application/vnd.meijer.favorites-v1.0+json",
    "Content-Type": "application/vnd.meijer.listManagement.favorites-v1.0+json",
    "Authorization": "Bearer {token}",
    "ocp-apim-subscription-key": "{subscription_key}"
}
```

## Error Handling

The system provides comprehensive error handling:

```python
try:
    result = favorites.add_favorite("Test Item")
    if result:
        print("Success!")
    else:
        print("Failed to add favorite")
except MeijerAuthenticationError:
    print("Authentication failed")
except Exception as e:
    print(f"Unexpected error: {e}")
```

## Testing

Run the comprehensive test suite:

```bash
# Run all favorites tests
python -m pytest tests/test_favorites.py -v

# Run specific test class
python -m pytest tests/test_favorites.py::TestFavoritesManager -v

# Run with coverage
python -m pytest tests/test_favorites.py --cov=meijer.favorites --cov-report=html
```

## Demo

Run the interactive demo script:

```bash
python demos/favorites_demo.py
```

The demo showcases:
- Model creation and manipulation
- API interactions
- Search and management operations
- Shopping list integration
- Analytics and reporting

## Integration

### With Main Client

The favorites system is fully integrated with the main Meijer client:

```python
from meijer import Meijer

m = Meijer()
m.favorites.add_favorite("Test Item")
```

### With Shopping List

Seamless integration with shopping list operations:

```python
# Add favorite to shopping list
favorite_id = 123
result = m.favorites.add_favorite_to_shopping_list(favorite_id)

# The item is now in both favorites and shopping list
shopping_list = m.shopping_list.get()
```

### With CLI

The favorites system is accessible through the CLI:

```bash
# List favorites
meijer list favorites

# Add favorite
meijer list add-favorite "Item Name"

# Remove favorite
meijer list remove-favorite "Item Name"
```

## Performance

- **Connection Pooling**: Efficient HTTP connection reuse
- **Lazy Loading**: Data loaded only when needed
- **Caching**: Intelligent caching of API responses
- **Batch Operations**: Bulk operations for multiple items

## Security

- **Authentication**: Full OAuth2 integration
- **Token Management**: Automatic token refresh
- **Secure Headers**: Proper API security headers
- **Error Sanitization**: Safe error message handling

## Contributing

When contributing to the favorites system:

1. **Follow Type Safety**: Use full mypy typing
2. **Add Tests**: Include comprehensive test coverage
3. **Documentation**: Update docstrings and README
4. **Error Handling**: Implement proper exception handling
5. **Logging**: Add appropriate logging statements

## Future Enhancements

Planned improvements:

- **Real-time Updates**: WebSocket support for live updates
- **Advanced Search**: Full-text search with filters
- **Categories**: Organize favorites by category
- **Sync**: Cross-device favorites synchronization
- **Analytics**: Advanced usage analytics and insights

## Troubleshooting

### Common Issues

1. **Authentication Errors**
   - Ensure auth file is properly configured
   - Check token expiration
   - Verify subscription key

2. **API Errors**
   - Check network connectivity
   - Verify endpoint availability
   - Review request format

3. **Data Issues**
   - Validate input data
   - Check API response format
   - Review error logs

### Debug Mode

Enable detailed logging:

```python
import logging
logging.basicConfig(level=logging.DEBUG)

m = Meijer()
favorites = m.favorites.get_favorites()
```

## License

This favorites system is part of the Meijer API client and follows the same licensing terms.

## Support

For issues and questions:

1. Check the test suite for examples
2. Review the demo script for usage patterns
3. Examine the source code for implementation details
4. Submit issues with detailed error information
