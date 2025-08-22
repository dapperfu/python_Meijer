# Enhanced Search & Dual-Path Storage for Meijer Price Monitor

This document describes the enhanced search functionality and dual-path storage system implemented for the Meijer Price Monitor.

## 🚀 New Features

### 1. Enhanced Product Search with UPC Tracking

The enhanced search engine provides comprehensive product search with automatic UPC extraction and tracking:

- **Pagination Support**: Automatically handles multiple pages of search results
- **UPC Extraction**: Extracts UPC codes from product data using multiple fallback methods
- **Configurable Limits**: Set minimum and maximum result counts (default: 5-100)
- **Advanced Filtering**: Filter by price range, clearance status, availability, etc.
- **Progress Tracking**: Real-time progress updates during search operations

### 2. Dual-Path Storage System

The system now stores data in two complementary formats:

#### JSON Files (Human-Readable)
- **Timestamped Files**: Each search/operation creates timestamped JSON files
- **Organized Structure**: Separate directories for different data types
- **Easy Access**: Human-readable format for manual inspection and debugging
- **Automatic Cleanup**: Keeps last 10 files of each type to manage storage

#### SQLite Database (Relational Storage)
- **UPC as Primary Key**: All products tracked by their UPC code
- **Relational Design**: Proper foreign key relationships between tables
- **Efficient Querying**: Fast searches and complex queries
- **Data Integrity**: ACID compliance and constraint enforcement

### 3. Shop'n'Scan Integration with Cart Fallback

Enhanced price verification system:

- **Primary Method**: Shop'n'Scan for accurate in-store price verification
- **Fallback Method**: Cart functionality when Shop'n'Scan unavailable
- **Batch Processing**: Verify multiple UPCs efficiently
- **Status Tracking**: Track verification method and success status

## 🏗️ Architecture

### Core Components

1. **EnhancedSearchEngine** (`search_engine.py`)
   - Handles pagination and UPC extraction
   - Manages search across multiple stores
   - Provides progress callbacks

2. **PriceDatabase** (`database.py`)
   - SQLite database with relational schema
   - CRUD operations for all data types
   - Advanced querying capabilities

3. **DualPathStorageManager** (`storage_manager.py`)
   - Coordinates JSON and database storage
   - Automatic synchronization between systems
   - Backup and export functionality

4. **Enhanced PriceMonitor** (`core.py`)
   - Integrates all components
   - Provides backward compatibility
   - New enhanced search methods

### Database Schema

```
stores (store_id, store_name, address, city, state, zip_code, lat, lng)
products (upc, product_name, brand, category, subcategory, description, image_url)
price_records (id, upc, store_id, price, original_price, sale_price, is_clearance, is_on_sale, availability, search_query, verification_method, timestamp)
search_queries (id, query_text, timestamp, results_count, stores_searched)
search_results (id, search_id, upc, store_id, product_name, price, original_price, is_clearance, is_on_sale, availability, timestamp)
shopnscan_verifications (id, upc, store_id, verified_price, sale_price, original_price, is_clearance, is_on_sale, verification_status, verification_timestamp)
```

## 📖 Usage Examples

### Enhanced Search Command

```bash
# Basic enhanced search
meijer-pricedrop search --query "LEGO Jurassic" --location "46755" --max-results 100

# Advanced search with filters
meijer-pricedrop search \
  --query "LEGO" \
  --location "46755" \
  --max-results 200 \
  --min-results 10 \
  --price-min 10.0 \
  --price-max 100.0 \
  --include-clearance \
  --no-out-of-stock

# Search specific stores
meijer-pricedrop search \
  --query "LEGO Jurassic" \
  --location "46755" \
  --stores "store_1,store_2,store_3"
```

### Price Verification Command

```bash
# Verify prices for specific UPCs
meijer-pricedrop verify-prices \
  --upcs "123456789012,123456789013,123456789014" \
  --store-id "store_1"
```

### Storage Management Commands

```bash
# Get storage statistics
meijer-pricedrop storage-stats

# Create backup
meijer-pricedrop backup

# Export data
meijer-pricedrop export
```

### Programmatic Usage

```python
from price_monitor.core import PriceMonitor

# Initialize monitor
monitor = PriceMonitor()

# Enhanced search
results = monitor.search_products_enhanced(
    query_text="LEGO Jurassic",
    max_results=100,
    min_results=5,
    include_clearance=True,
    include_out_of_stock=False,
    price_min=10.0,
    price_max=100.0
)

# Price verification
verification_results = monitor.verify_prices_with_shopnscan_enhanced(
    upcs=["123456789012", "123456789013"],
    store_id="store_1"
)

# Storage statistics
stats = monitor.get_storage_statistics()

# Create backup
backup_result = monitor.create_backup()

# Export data
export_result = monitor.export_data("price_drops", {"min_drop_percent": 10.0, "days": 7})
```

## 🔧 Configuration

### Search Parameters

- **max_results**: Maximum number of results to retrieve (default: 100)
- **min_results**: Minimum results before stopping pagination (default: 5)
- **include_clearance**: Include clearance items (default: True)
- **include_out_of_stock**: Include out-of-stock items (default: False)
- **price_min/max**: Price range filters (optional)

### Storage Configuration

- **JSON Backup Count**: Number of recent files to keep (default: 10)
- **Compression**: Future feature for gzip compression
- **Backup Location**: Automatic backup directory creation

## 📊 Data Flow

1. **Search Request** → EnhancedSearchEngine
2. **Pagination** → Multiple API calls with rate limiting
3. **UPC Extraction** → Multiple fallback methods
4. **Dual Storage** → JSON files + SQLite database
5. **Price Verification** → Shop'n'Scan + Cart fallback
6. **Data Export** → Multiple formats (JSON, future: CSV)

## 🧪 Testing

Run the test script to verify functionality:

```bash
python scripts/test_enhanced_search.py
```

This will test:
- Enhanced search functionality
- UPC tracking and extraction
- Dual-path storage
- Price verification
- Database operations
- Storage statistics

## 🔮 Future Enhancements

- **CSV Export**: Additional export formats
- **Data Compression**: Gzip compression for JSON files
- **Advanced Analytics**: Price trend analysis and predictions
- **API Integration**: REST API for external access
- **Real-time Updates**: WebSocket support for live price updates
- **Machine Learning**: Price prediction models

## 🐛 Troubleshooting

### Common Issues

1. **UPC Not Found**: Check if product data contains UPC information
2. **Database Errors**: Verify SQLite permissions and disk space
3. **Search Failures**: Check Meijer API availability and rate limits
4. **Storage Issues**: Verify directory permissions and disk space

### Debug Mode

Enable verbose logging:

```bash
meijer-pricedrop search --query "LEGO" --location "46755" -vvv
```

### Manual Database Inspection

```bash
# Connect to SQLite database
sqlite3 price_data/prices.db

# View tables
.tables

# Check data
SELECT COUNT(*) FROM products;
SELECT COUNT(*) FROM price_records;
```

## 📝 Migration Notes

The enhanced system maintains backward compatibility:

- **Legacy Methods**: All existing functionality continues to work
- **Automatic Migration**: Database schema automatically created
- **Dual Storage**: Both old and new storage methods available
- **CLI Commands**: New commands added without breaking existing ones

## 🤝 Contributing

When contributing to the enhanced search system:

1. **Follow Type Hints**: Use full mypy typing
2. **Documentation**: Follow numpy-style docstrings
3. **Testing**: Add tests for new functionality
4. **Backward Compatibility**: Maintain existing API compatibility
5. **Error Handling**: Implement proper error handling and logging

## 📄 License

This enhanced functionality follows the same license as the main Meijer Price Monitor project.
