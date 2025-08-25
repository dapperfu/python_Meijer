# Meijer API Client Refactoring

## Overview

The monolithic `Meijer` class has been refactored into focused, maintainable components using composition and the Single Responsibility Principle. This refactoring improves code maintainability, testability, and follows modern Python development practices.

## Architecture

### Before (Monolithic)
```
Meijer (2372 lines)
├── HTTP session management
├── Authentication
├── Rate limiting & caching
├── Store operations
├── Order operations
├── Product operations
├── Shopping list operations
├── Coupon operations
├── mPerks operations
├── Configuration management
└── SSL/proxy configuration
```

### After (Composition-based)
```
Meijer (refactored main class)
├── MeijerClient (core HTTP & auth)
├── ConfigManager (configuration & SSL)
├── RateLimitManager (rate limiting & caching)
├── StoreManager (store operations)
├── OrderManager (order operations)
├── ProductManager (product operations)
└── [existing components maintained]
```

## New Components

### 1. MeijerClient (`meijer/meijer_client.py`)
**Responsibility**: Core HTTP operations and authentication
- HTTP session management with retries and connection pooling
- Authentication and token management
- Basic request/response handling
- Delegates to specialized managers

### 2. ConfigManager (`meijer/config_manager.py`)
**Responsibility**: Configuration and SSL management
- API endpoint configuration
- SSL certificate management
- Proxy configuration
- Environment variable handling

### 3. RateLimitManager (`meijer/rate_limit_manager.py`)
**Responsibility**: Rate limiting, caching, and request deduplication
- API rate limiting to prevent overwhelming the API
- Response caching for improved performance
- Request deduplication to avoid duplicate in-flight requests

### 4. StoreManager (`meijer/store_manager.py`)
**Responsibility**: Store operations
- Store search by various criteria
- Distance calculations using Haversine formula
- Service filtering
- Store information retrieval

### 5. OrderManager (`meijer/order_manager.py`)
**Responsibility**: Order operations
- Order history retrieval
- Order details
- Order status tracking
- Order search and filtering

### 6. ProductManager (`meijer/product_manager.py`)
**Responsibility**: Product operations
- Product search
- Barcode/UPC lookup
- Product details
- Bulk product operations

## Benefits of Refactoring

### 1. **Maintainability**
- Each component has a single, clear responsibility
- Easier to locate and fix bugs
- Simpler to understand and modify individual features

### 2. **Testability**
- Components can be tested in isolation
- Mock dependencies easily
- Unit tests are more focused and reliable

### 3. **Reusability**
- Components can be used independently
- Easier to create specialized clients
- Better separation of concerns

### 4. **Extensibility**
- New features can be added to specific components
- Existing components can be enhanced without affecting others
- Clear interfaces for adding new functionality

### 5. **Code Organization**
- Logical grouping of related functionality
- Reduced cognitive load when working on specific features
- Better adherence to SOLID principles

## Migration Guide

### For Existing Code

The refactored `Meijer` class maintains full backward compatibility. Existing code should continue to work without changes:

```python
# This still works exactly the same
from meijer import Meijer

client = Meijer()
stores = client.get_stores(latitude=42.9634, longitude=-85.6681, radius=25)
```

### For New Code

You can now use the focused components directly:

```python
from meijer.meijer_client import MeijerClient
from meijer.store_manager import StoreManager

# Use core client for basic operations
client = MeijerClient()
stores = StoreManager(client).get_stores(latitude=42.9634, longitude=-85.6681, radius=25)
```

### For Testing

Components can now be tested independently:

```python
from unittest.mock import Mock
from meijer.store_manager import StoreManager

# Mock the client dependency
mock_client = Mock()
store_manager = StoreManager(mock_client)

# Test store operations in isolation
# ... test code ...
```

## File Structure

```
meijer/
├── __init__.py
├── client.py                    # Original monolithic class (deprecated)
├── meijer_refactored.py        # New refactored main class
├── meijer_client.py            # Core client with HTTP & auth
├── config_manager.py            # Configuration & SSL management
├── rate_limit_manager.py       # Rate limiting & caching
├── store_manager.py            # Store operations
├── order_manager.py            # Order operations
├── product_manager.py          # Product operations
├── [existing component files]  # Unchanged existing components
└── [other existing files]      # Unchanged existing files
```

## Usage Examples

### Basic Usage (Backward Compatible)
```python
from meijer.meijer_refactored import Meijer

client = Meijer()
stores = client.get_stores(latitude=42.9634, longitude=-85.6681, radius=25)
```

### Advanced Usage (Component-based)
```python
from meijer.meijer_client import MeijerClient
from meijer.store_manager import StoreManager
from meijer.product_manager import ProductManager

# Initialize core client
client = MeijerClient()

# Use specific managers
store_manager = StoreManager(client)
product_manager = ProductManager(client)

# Store operations
stores = store_manager.get_stores(latitude=42.9634, longitude=-85.6681, radius=25)

# Product operations
products = product_manager.search_products("milk")
```

### Configuration Management
```python
from meijer.config_manager import ConfigManager

# Configure for local development
config = ConfigManager(base_url="http://127.0.0.1:5000")

# Configure SSL
config.configure_ssl(verify=False, cert_path="/path/to/cert.pem")

# Configure proxy
config.configure_proxy("localhost", 8080)
```

### Rate Limiting
```python
from meijer.rate_limit_manager import RateLimitManager

# Configure rate limiting
rate_limiter = RateLimitManager(min_request_interval=1.0)

# Get cache statistics
stats = rate_limiter.get_cache_stats()
print(f"Total cached responses: {stats['total_cached']}")
```

## Future Enhancements

### 1. **Additional Managers**
- `CartManager` for shopping cart operations
- `NotificationManager` for push notifications
- `AnalyticsManager` for usage analytics

### 2. **Plugin System**
- Allow third-party extensions
- Modular feature loading
- Custom authentication methods

### 3. **Async Support**
- Async/await for all operations
- Connection pooling optimization
- Background task management

### 4. **Configuration Profiles**
- Environment-specific configurations
- Profile switching
- Configuration validation

## Contributing

When adding new features:

1. **Identify the appropriate component** for the new functionality
2. **Extend the component** rather than the main class
3. **Maintain backward compatibility** if adding to public interfaces
4. **Add comprehensive tests** for new functionality
5. **Update documentation** to reflect changes

## Testing

Run the test suite to ensure refactoring didn't break existing functionality:

```bash
# Run all tests
python -m pytest tests/

# Run specific component tests
python -m pytest tests/test_store_manager.py
python -m pytest tests/test_product_manager.py
```

## Performance Considerations

The refactored architecture maintains the same performance characteristics as the original:

- **HTTP connection pooling** is preserved
- **Rate limiting** is more efficient with dedicated management
- **Caching** is centralized and optimized
- **Request deduplication** prevents unnecessary API calls

## Conclusion

This refactoring transforms the monolithic `Meijer` class into a well-structured, maintainable codebase while preserving full backward compatibility. The new architecture follows modern Python development practices and makes the codebase easier to work with for both current and future developers.
