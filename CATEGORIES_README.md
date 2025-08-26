# Meijer Categories and Department Browsing

This document describes the new categories functionality that extends the Meijer API client with comprehensive department browsing capabilities, including an interactive terminal user interface (TUI).

## Overview

The categories functionality provides access to Meijer's product category hierarchy, allowing users to:
- Browse departments and product categories
- Navigate through category hierarchies
- View products within specific categories
- Search for categories by name or description
- Add products to cart directly from category browsing
- Use an interactive TUI for seamless navigation

## API Endpoint

The functionality is built around the categories API endpoint:
```
GET https://api.meijer.com/digital/aem/v1/categories?store=71
```

This endpoint provides the main category hierarchy used for "Browse Departments" functionality in the mobile app.

## Core Components

### 1. Categories Module (`meijer/categories.py`)

#### Classes

- **`Category`**: Represents a product category or department
  - Properties: `id`, `name`, `description`, `parent_id`, `level`, `product_count`
  - Methods: `has_subcategories`, `is_top_level`, `is_leaf`, `total_product_count`

- **`CategoryProduct`**: Represents a product within a category
  - Properties: `product_id`, `name`, `price`, `brand`, `upc`, `is_on_sale`
  - Methods: `savings_amount`, `savings_percentage`

- **`CategoriesManager`**: Manages category operations
  - Methods: `get_categories()`, `get_category_products()`, `search_categories()`

#### Key Methods

```python
# Get all categories
categories = client.categories.get_categories(store_id="71")

# Get products in a category
products = client.categories.get_category_products(
    category_id="electronics",
    store_id="71",
    page=1,
    limit=24,
    sort_by="relevance"
)

# Search for categories
results = client.categories.search_categories("electronics", limit=20)
```

### 2. Category Browser TUI (`meijer/category_browser.py`)

#### Features

- **Interactive Navigation**: Browse categories with keyboard commands
- **Product Viewing**: See products within categories with pagination
- **Cart Integration**: Add products to cart directly from the browser
- **Search Functionality**: Search for categories by name
- **Breadcrumb Navigation**: Track your location in the category hierarchy

#### Keyboard Commands

| Command | Action |
|---------|--------|
| `q` | Quit browser |
| `h` | Go back/up one level |
| `r` | Refresh current view |
| `s` | Search categories |
| `n` | Next page |
| `p` | Previous page |
| `a` | Add selected product to cart |
| `c` | View cart |
| `g` | Go to specific page |
| `?` | Show help |

## Usage Examples

### Basic Category Browsing

```python
from meijer import Meijer

# Initialize client
client = Meijer(auth_file="auth.json")

# Get all categories
categories = client.get_categories()
print(f"Found {len(categories)} categories")

# Browse a specific category
electronics = categories[0]  # Assuming first category is electronics
products = client.get_category_products(electronics.id, limit=10)

for product in products:
    print(f"{product.name}: ${product.price}")
```

### Interactive TUI Browser

```python
# Launch the interactive category browser
client.browse_categories(store_id="71")
```

### Category Search

```python
# Search for electronics-related categories
results = client.search_categories("electronics", limit=5)
for category in results:
    print(f"{category.name}: {category.product_count} products")
```

### Store-Specific Categories

```python
# Get categories for a specific store
store_categories = client.get_categories(store_id="71")
print(f"Store 71 has {len(store_categories)} categories")
```

## CLI Commands

The categories functionality is also available through the command-line interface:

### List Categories
```bash
meijer categories list --store 71 --limit 20
```

### Show Products in Category
```bash
meijer categories products electronics --store 71 --page 1 --limit 10
```

### Search Categories
```bash
meijer categories search electronics --store 71 --limit 10
```

### Launch Interactive Browser
```bash
meijer categories browse --store 71
```

## Integration with Existing Features

### Cart Integration
Products viewed in categories can be added directly to the shopping cart using the `a` command in the TUI or programmatically:

```python
# Add a product to cart (if it has a UPC)
if product.upc:
    client.cart.add_item(product.upc)
```

### Store Filtering
Categories can be filtered by store ID to show only products available at specific locations:

```python
# Get categories for store 71
categories = client.get_categories(store_id="71")

# Get products in a category for store 71
products = client.get_category_products(
    category_id="electronics",
    store_id="71"
)
```

### Search Integration
Categories work alongside the existing search functionality:

```python
# Search for products in a specific category
category_products = client.get_category_products("electronics")
search_results = client.search("laptop")  # Existing search functionality

# Combine results as needed
```

## Data Models

### Category Structure
```python
@dataclass
class Category:
    id: str                    # Unique category identifier
    name: str                  # Category name
    description: Optional[str] # Category description
    parent_id: Optional[str]   # Parent category ID
    level: int                 # Hierarchy level (1 = top level)
    product_count: int         # Number of products
    subcategories: List[Category]  # Child categories
    featured_products: List[Dict]  # Featured products
```

### Product Structure
```python
@dataclass
class CategoryProduct:
    product_id: str            # Product identifier
    name: str                  # Product name
    price: Optional[float]     # Current price
    original_price: Optional[float]  # Original price if on sale
    brand: Optional[str]       # Product brand
    upc: Optional[str]         # Product UPC code
    is_on_sale: bool           # Whether product is on sale
    availability: str          # Availability status
```

## Error Handling

The categories functionality includes comprehensive error handling:

```python
try:
    categories = client.get_categories(store_id="71")
except MeijerError as e:
    print(f"Failed to get categories: {e}")
    # Handle error appropriately
```

Common error scenarios:
- **Authentication failures**: Invalid or expired tokens
- **API errors**: Network issues, rate limiting, server errors
- **Data parsing errors**: Unexpected API response format
- **Store-specific errors**: Invalid store ID or store not found

## Performance Considerations

### Caching
The categories manager includes basic caching to avoid repeated API calls:

```python
# Categories are cached per store ID
categories = client.get_categories(store_id="71")  # First call - API request
categories = client.get_categories(store_id="71")  # Second call - cached result
```

### Pagination
Product retrieval supports pagination to handle large categories:

```python
# Get first page of products
products_page_1 = client.get_category_products("electronics", page=1, limit=24)

# Get second page
products_page_2 = client.get_category_products("electronics", page=2, limit=24)
```

### Rate Limiting
The client respects API rate limits and includes automatic retry logic for failed requests.

## Development and Testing

### Running the Demo
```bash
cd demos
python demo_categories.py
```

### Testing Individual Components
```python
# Test categories manager
from meijer.categories import CategoriesManager
manager = CategoriesManager(client)
categories = manager.get_categories()

# Test category browser
from meijer.category_browser import MeijerCategoryBrowser
browser = MeijerCategoryBrowser(client)
browser.run()
```

### Debug Mode
Enable debug logging to see detailed API interactions:

```python
import logging
logging.basicConfig(level=logging.DEBUG)

# API calls will show detailed request/response information
categories = client.get_categories()
```

## Future Enhancements

Planned improvements for the categories functionality:

1. **Advanced Filtering**: Filter products by price, brand, availability
2. **Sorting Options**: More sorting methods (rating, popularity, etc.)
3. **Category Analytics**: Product count trends, popular categories
4. **Personalization**: Category recommendations based on user preferences
5. **Offline Support**: Cache categories for offline browsing
6. **Export Functionality**: Export category data to various formats

## Troubleshooting

### Common Issues

1. **"Categories module not available"**
   - Ensure the categories module is properly installed
   - Check import paths and dependencies

2. **"Failed to get categories"**
   - Verify authentication is working
   - Check network connectivity
   - Verify store ID is valid

3. **TUI not launching**
   - Ensure rich library is installed: `pip install rich`
   - Check terminal compatibility
   - Verify Python version (3.7+ required)

4. **Cart integration not working**
   - Ensure cart module is available
   - Check if products have valid UPC codes
   - Verify cart authentication

### Debug Information

Enable verbose logging to troubleshoot issues:

```bash
meijer --verbose categories list
```

Or programmatically:

```python
import logging
logging.basicConfig(level=logging.DEBUG)

# Detailed logging will show API requests, responses, and errors
```

## Contributing

To contribute to the categories functionality:

1. Follow the existing code style and patterns
2. Add comprehensive tests for new features
3. Update documentation for any API changes
4. Ensure backward compatibility
5. Test with real Meijer API endpoints

## License

This categories functionality is part of the Meijer API client and follows the same license terms.
