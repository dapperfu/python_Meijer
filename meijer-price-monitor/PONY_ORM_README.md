# Pony ORM Implementation for Meijer Price Monitor

## Overview

This document describes the new Pony ORM implementation that replaces the existing SQLite database structure. The Pony ORM provides a more Pythonic and type-safe way to interact with the database while maintaining the same functionality.

## Key Features

### 1. **UPC as Primary Key**
- **Product** entity uses UPC (Universal Product Code) as the primary key
- Ensures unique product identification across the system
- Maintains data integrity with foreign key relationships

### 2. **Minimal Column Overlap**
- Each entity has distinct, purpose-specific columns
- No redundant data storage between tables
- Clean separation of concerns

### 3. **Proper Relationships**
- **Product** ↔ **PriceRecord** (one-to-many)
- **Store** ↔ **PriceRecord** (one-to-many)
- **SearchQuery** ↔ **SearchResult** (one-to-many)
- **Product** ↔ **SearchResult** (one-to-many)
- **Store** ↔ **SearchResult** (one-to-many)

## Entity Structure

### Core Entities

#### **Store**
```python
class Store(db.Entity):
    store_id = PrimaryKey(str)           # Primary identifier
    name = Required(str)                 # Store name
    address = Optional(str)              # Street address
    city = Optional(str)                 # City
    state = Optional(str)                # State
    zip_code = Optional(str)             # ZIP code
    latitude = Optional(float)           # GPS latitude
    longitude = Optional(float)          # GPS longitude
    created_at = Required(datetime)      # Creation timestamp
    updated_at = Required(datetime)      # Last update timestamp
    
    # Relationships
    price_records = Set('PriceRecord')
    search_results = Set('SearchResult')
    verifications = Set('ShopnScanVerification')
```

#### **Product**
```python
class Product(db.Entity):
    upc = PrimaryKey(str)                # UPC as primary key
    name = Required(str)                 # Product name
    brand = Optional(str)                # Brand name
    category = Optional(str)             # Product category
    subcategory = Optional(str)          # Product subcategory
    description = Optional(str)          # Product description
    image_url = Optional(str)            # Product image URL
    created_at = Required(datetime)      # Creation timestamp
    updated_at = Required(datetime)      # Last update timestamp
    
    # Relationships
    price_records = Set('PriceRecord')
    search_results = Set('SearchResult')
    verifications = Set('ShopnScanVerification')
```

#### **PriceRecord**
```python
class PriceRecord(db.Entity):
    id = PrimaryKey(int, auto=True)      # Auto-incrementing ID
    product = Required(Product)          # Product relationship
    store = Required(Store)              # Store relationship
    price = Required(float)              # Current price
    original_price = Optional(float)     # Original price
    sale_price = Optional(float)         # Sale price
    is_clearance = Required(bool)        # Clearance flag
    is_on_sale = Required(bool)          # Sale flag
    availability = Required(str)         # Availability status
    search_query = Optional(str)         # Search query used
    verification_method = Required(str)  # Verification method
    timestamp = Required(datetime)       # Price timestamp
    
    # Composite unique constraint
    composite_key(product, store, timestamp)
```

### Supporting Entities

#### **SearchQuery**
```python
class SearchQuery(db.Entity):
    id = PrimaryKey(int, auto=True)      # Auto-incrementing ID
    query_text = Required(str)           # Search query text
    timestamp = Required(datetime)       # Search timestamp
    results_count = Required(int)        # Number of results
    stores_searched = Required(int)      # Number of stores searched
    
    # Relationships
    search_results = Set('SearchResult')
```

#### **SearchResult**
```python
class SearchResult(db.Entity):
    id = PrimaryKey(int, auto=True)      # Auto-incrementing ID
    search_query = Required(SearchQuery) # Search query relationship
    product = Required(Product)          # Product relationship
    store = Required(Store)              # Store relationship
    product_name = Required(str)         # Denormalized product name
    price = Required(float)              # Product price
    original_price = Optional(float)     # Original price
    is_clearance = Required(bool)        # Clearance flag
    is_on_sale = Required(bool)          # Sale flag
    availability = Required(str)         # Availability status
    timestamp = Required(datetime)       # Result timestamp
```

#### **ShopnScanVerification**
```python
class ShopnScanVerification(db.Entity):
    id = PrimaryKey(int, auto=True)      # Auto-incrementing ID
    product = Required(Product)          # Product relationship
    store = Required(Store)              # Store relationship
    verified_price = Required(float)     # Verified price
    sale_price = Optional(float)         # Sale price
    original_price = Optional(float)     # Original price
    is_clearance = Required(bool)        # Clearance flag
    is_on_sale = Required(bool)          # Sale flag
    verification_status = Required(str)  # Verification status
    verification_timestamp = Required(datetime) # Verification time
```

### Advanced Entities

#### **PriceMonitor**
```python
class PriceMonitor(db.Entity):
    id = PrimaryKey(int, auto=True)      # Auto-incrementing ID
    name = Required(str)                 # Monitor name
    description = Optional(str)          # Monitor description
    is_active = Required(bool)           # Active status
    target_upc = Optional(str)          # Target UPC
    target_category = Optional(str)      # Target category
    target_brand = Optional(str)         # Target brand
    price_threshold = Optional(float)    # Price threshold
    check_frequency_hours = Required(int) # Check frequency
    last_check = Optional(datetime)      # Last check time
    next_check = Optional(datetime)      # Next check time
    created_at = Required(datetime)      # Creation timestamp
    updated_at = Required(datetime)      # Last update timestamp
```

#### **PriceAlert**
```python
class PriceAlert(db.Entity):
    id = PrimaryKey(int, auto=True)      # Auto-incrementing ID
    alert_type = Required(str)           # Alert type
    severity = Required(str)             # Alert severity
    message = Required(str)              # Alert message
    upc = Optional(str)                  # Related UPC
    store_id = Optional(str)             # Related store
    old_price = Optional(float)          # Old price
    new_price = Optional(float)          # New price
    price_change = Optional(float)       # Price change amount
    price_change_percent = Optional(float) # Price change percentage
    is_read = Required(bool)             # Read status
    is_acknowledged = Required(bool)     # Acknowledged status
    created_at = Required(datetime)      # Creation timestamp
    read_at = Optional(datetime)         # Read timestamp
    acknowledged_at = Optional(datetime) # Acknowledged timestamp
```

#### **ExportJob**
```python
class ExportJob(db.Entity):
    id = PrimaryKey(int, auto=True)      # Auto-incrementing ID
    job_type = Required(str)             # Job type
    status = Required(str)               # Job status
    parameters = Optional(str)           # Export parameters (JSON)
    file_path = Optional(str)            # Output file path
    total_records = Optional(int)        # Total records to export
    processed_records = Optional(int)    # Records processed
    error_message = Optional(str)        # Error message
    created_at = Required(datetime)      # Creation timestamp
    started_at = Optional(datetime)      # Start timestamp
    completed_at = Optional(datetime)    # Completion timestamp
```

## Database Operations

### Basic CRUD Operations

The `PonyPriceDatabase` class provides the same interface as the original SQLite database:

- `add_store()` - Add or update stores
- `add_product()` - Add or update products
- `add_price_record()` - Add price records
- `add_search_query()` - Add search queries
- `add_search_result()` - Add search results
- `add_shopnscan_verification()` - Add verifications

### Query Operations

- `search_products_by_query()` - Search products by text
- `get_product_prices_by_upc()` - Get prices for specific UPC
- `get_price_history()` - Get price history for product/store
- `find_price_drops()` - Find products with price drops
- `get_clearance_deals()` - Find clearance items
- `get_database_stats()` - Get database statistics

### Pony ORM Features

- **Type Safety**: Full type checking with mypy
- **Relationship Navigation**: Easy navigation between related entities
- **Query Optimization**: Automatic query optimization
- **Transaction Management**: Built-in transaction support
- **Lazy Loading**: Efficient data loading

## Migration

### From SQLite to Pony ORM

Use the migration script to transfer existing data:

```bash
python scripts/migrate_to_pony.py
```

The migration script:
1. Reads data from the existing SQLite database
2. Creates new Pony ORM entities
3. Maintains data integrity and relationships
4. Provides detailed migration logs

### Testing

Test the Pony ORM implementation:

```bash
python scripts/test_pony_models.py
```

The test script verifies:
- Basic CRUD operations
- Entity relationships
- Data integrity
- Query functionality

## Benefits of Pony ORM

### 1. **Pythonic Interface**
- Native Python syntax for database operations
- No SQL string construction required
- Intuitive entity definitions

### 2. **Type Safety**
- Full mypy support
- Compile-time error checking
- Better IDE integration

### 3. **Performance**
- Automatic query optimization
- Efficient relationship loading
- Connection pooling

### 4. **Maintainability**
- Cleaner, more readable code
- Easier to modify and extend
- Better separation of concerns

### 5. **Scalability**
- Support for multiple database backends
- Easy to switch between SQLite, PostgreSQL, MySQL
- Built-in migration support

## Usage Examples

### Creating a Product
```python
from price_monitor.pony_database import PonyPriceDatabase

db = PonyPriceDatabase()

# Add a product
product_data = {
    'upc': '123456789012',
    'name': 'Sample Product',
    'brand': 'Sample Brand',
    'category': 'Electronics'
}

db.add_product(product_data)
```

### Querying Products
```python
# Search for products
results = db.search_products_by_query('Sample')

# Get prices for specific UPC
prices = db.get_product_prices_by_upc('123456789012')

# Get price history
history = db.get_price_history('123456789012', 'store_1', days=30)
```

### Using Relationships
```python
from price_monitor.pony_models import Product

with db_session:
    product = Product.get(upc='123456789012')
    
    # Navigate relationships
    for price_record in product.price_records:
        print(f"Price: ${price_record.price} at {price_record.store.name}")
```

## Configuration

### Database Path
The Pony ORM database is stored at:
```
./price_data/prices_pony.db
```

### Dependencies
Add to `requirements.txt`:
```
pony>=0.7.17
```

## Future Enhancements

### 1. **Additional Database Backends**
- PostgreSQL support for production use
- MySQL support for enterprise environments
- Cloud database integration

### 2. **Advanced Querying**
- Complex analytical queries
- Aggregation functions
- Full-text search capabilities

### 3. **Performance Optimization**
- Query result caching
- Database connection pooling
- Read replicas for scaling

### 4. **Monitoring and Analytics**
- Query performance metrics
- Database health monitoring
- Usage analytics

## Conclusion

The Pony ORM implementation provides a modern, Pythonic approach to database management while maintaining all existing functionality. The UPC-based primary key structure ensures data integrity, while the minimal column overlap design promotes efficient data storage and retrieval.

The migration path is straightforward, and the new implementation offers significant benefits in terms of code quality, maintainability, and performance.
