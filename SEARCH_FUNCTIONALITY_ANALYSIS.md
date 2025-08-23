# Meijer Search Functionality Analysis

## Overview
This document analyzes the search functionality flows captured in the mitmproxy logs from the user's LEGO search session. The analysis reveals a comprehensive search system with multiple endpoints, autocomplete functionality, and rich product data.

## Search Session Summary
The user performed the following search actions:
1. **Started typing "lego jurassic"** - triggered autocomplete flows
2. **Pressed search** - got 7 results initially
3. **Clicked on result "76972"** - LEGO Jurassic World T. rex River Escape 76975
4. **Made/unmade it favorite** (heart icon)
5. **Added to shopping list, then removed**
6. **Searched for "LEGO"** - got 239 results (likely paginated)
7. **Clicked on LEGO product "76975"**
8. **Added to cart (quantity 2)**
9. **Added to shopping list, then removed**
10. **Hearted the product**

## Key Search Endpoints

### 1. Constructor Search (ac.cnstrc.com)
**Primary Domain**: `ac.cnstrc.com` - This is the main search functionality provider

#### Search Endpoints:
- **Main Search**: `/search/lego?filters%5BavailableInStores%5D=19&page=1&num_results_per_page=30&key=key_GdYuTcnduTUtsZd6&i=e86795a2-95ee-484c-a04b-58cd4d07b887&ui=6361aebe-c5c5-4e0a-bdcb-6dab4a5d92dd&s=1&c=cioand-2.31.0&_dt=1755909306294`

#### Autocomplete Endpoints:
- **Search Suggestions**: `/autocomplete/Lego?num_results_Search%20Suggestions=8&num_results_Products=0&key=key_GdYuTcnduTUtsZd6&i=e86795a2-95ee-484c-a04b-58cd4d07b887&ui=6361aebe-c5c5-4e0a-bdcb-6dab4a5d92dd&s=1&c=cioand-2.31.0&_dt=1755909198006`

#### Click Tracking:
- **Product Click**: `/autocomplete/lego/click_through?name=LEGO%20Jurassic%20World%20T.%20rex%20River%20Escape%2076975&customer_id=67341940946&section=Products&key=key_GdYuTcnduTUtsZd6&i=e86795a2-95ee-484c-a04b-58cd4d07b887&ui=6361aebe-c5c5-4e0a-bdcb-6dab4a5d92dd&s=1&c=cioand-2.31.0&_dt=1755909325201`

#### Behavior Tracking:
- **Search Results Behavior**: `/behavior?term=lego&num_results=239&customer_ids=67341940946%2C67341940362%2C67341940361%2C67341940578%2C67341923359%2C67341938750%2C67341937527%2C67341940355%2C67341940698%2C67341928289%2C67341940372%2C67341940672%2C67341939411%2C67341940708%2C67341940716%2C67341940713%2C67341935959%2C67341939017%2C67341937360%2C67341938683%2C67341938238%2C67341940423%2C67341940688%2C67341940723%2C67341940050%2C67341940353%2C67341940420%2C67341940536%2C67341940425%2C67341940424&action=search-results&key=key_GdYuTcnduTUtsZd6&i=e86795a2-95ee-484c-a04b-58cd4d07b887&ui=6361aebe-c5c5-4e0a-bdcb-6dab4a5d92dd&s=1&c=cioand-2.31.0&_dt=1755909306843`

### 2. Meijer API (api.meijer.com)
**Secondary Domain**: `api.meijer.com` - Handles product data and cart operations

#### Product Endpoints:
- **Sponsored Products**: `/digital/sponsored-products/v1/products?retailer-visitor-id=80302125742400638755997629905461482680&customer-id=13266596&page-id=viewSearchResult_API_app&event-type=viewSearchResult&regionId=19&keywords=lego&environment=aa`

#### Promotions:
- **Complex Promotions**: `/digital/complexpromos/v1/67341940946/19`

### 3. Content Delivery (meijer.com/content/dam/meijer)
**Image Domain**: `meijer.com/content/dam/meijer` - Provides product images and assets

#### Image Patterns:
- **Product Images**: `/product/XXXX/XX/XXXX/XX/XXXXXXXXXX_X_A1C1_XXXX.jpg`
- **Department Icons**: `/departments/generic/main-departments/D-WF-Dept-XXXX-217x217.png`
- **Marketing Assets**: `/digital/web-and-graphics/2025/mperks/mma-banners/august/XXXX.png`

## Search Flow Analysis

### 1. Autocomplete Flow
```
User types "lego" → 
Autocomplete API call → 
Returns search suggestions + product suggestions → 
User selects suggestion or continues typing
```

**Key Parameters**:
- `num_results_Search Suggestions=8` - Number of search suggestions
- `num_results_Products=0` - Number of product suggestions in autocomplete
- `key=key_GdYuTcnduTUtsZd6` - API key
- `i=e86795a2-95ee-484c-a04b-58cd4d07b887` - Session ID
- `ui=6361aebe-c5c5-4e0a-bdcb-6dab4a5d92dd` - User ID

### 2. Main Search Flow
```
User submits search → 
Search API call with filters → 
Returns paginated results → 
User can navigate pages
```

**Key Parameters**:
- `filters[availableInStores]=19` - Store filter
- `page=1` - Page number
- `num_results_per_page=30` - Results per page
- `s=1` - Search session
- `c=cioand-2.31.0` - Client version

### 3. Product Interaction Flow
```
User clicks product → 
Click tracking API call → 
Product detail page → 
User actions (favorite, cart, shopping list)
```

**Key Parameters**:
- `name=LEGO%20Jurassic%20World%20T.%20rex%20River%20Escape%2076975` - Product name
- `customer_id=67341940946` - Customer identifier
- `section=Products` - Section context

### 4. Behavior Tracking Flow
```
User performs actions → 
Behavior API call → 
Tracks user interactions → 
Analytics and personalization
```

**Key Parameters**:
- `term=lego` - Search term
- `num_results=239` - Total results found
- `action=search-results` - Action type
- `customer_ids` - List of customer IDs for tracking

## Product Data Structure

### Product Identifiers
- **UPCs**: Various product UPCs found in the logs
- **Product IDs**: Internal product identifiers
- **Model Numbers**: LEGO set numbers (76972, 76975)

### Image Assets
- **Product Photos**: High-resolution product images
- **Department Icons**: Category navigation icons
- **Marketing Graphics**: Promotional banners and assets

## API Authentication & Headers

### Required Headers
- **User-Agent**: `okhttp/5.1.0` (Android client)
- **Accept**: `application/json`
- **Content-Type**: `application/json`
- **Accept-Encoding**: `gzip`

### Authentication
- **API Key**: `key_GdYuTcnduTUtsZd6`
- **Session ID**: `e86795a2-95ee-484c-a04b-58cd4d07b887`
- **User ID**: `6361aebe-c5c5-4e0a-bdcb-6dab4a5d92dd`

## Search Features

### 1. Autocomplete
- **Search Suggestions**: 8 suggestions returned
- **Product Suggestions**: Configurable (set to 0 in this case)
- **Real-time Updates**: As user types

### 2. Filtering
- **Store Availability**: Filter by available stores
- **Pagination**: 30 results per page
- **Search Scope**: Configurable result limits

### 3. Personalization
- **User History**: Tracks previous searches
- **Behavior Analysis**: Monitors user interactions
- **Recommendations**: Based on search patterns

### 4. Analytics
- **Click Tracking**: Product interaction monitoring
- **Search Analytics**: Query performance tracking
- **User Journey**: Complete search session tracking

## Implementation Recommendations

### 1. Search API Integration
```python
# Base search endpoint
SEARCH_BASE_URL = "https://ac.cnstrc.com"
SEARCH_ENDPOINT = "/search/{query}"
AUTOCOMPLETE_ENDPOINT = "/autocomplete/{query}"

# Required parameters
REQUIRED_PARAMS = {
    "key": "key_GdYuTcnduTUtsZd6",
    "i": "session_id",
    "ui": "user_id",
    "s": "1",
    "c": "cioand-2.31.0"
}
```

### 2. Product Data Integration
```python
# Product endpoints
PRODUCT_BASE_URL = "https://api.meijer.com"
SPONSORED_PRODUCTS = "/digital/sponsored-products/v1/products"
COMPLEX_PROMOS = "/digital/complexpromos/v1/{customer_id}/{region_id}"
```

### 3. Image Asset Management
```python
# Image base URL
IMAGE_BASE_URL = "https://www.meijer.com/content/dam/meijer"
PRODUCT_IMAGE_PATTERN = "/product/{path}/{filename}_{size}_{quality}.{format}"
```

## Security Considerations

### 1. API Key Management
- **Rotate Keys**: Regular key rotation
- **Scope Limiting**: Restrict key permissions
- **Monitoring**: Track key usage patterns

### 2. User Privacy
- **Data Minimization**: Only collect necessary data
- **Consent Management**: User consent for tracking
- **Data Retention**: Clear retention policies

### 3. Rate Limiting
- **Request Limits**: Implement rate limiting
- **Throttling**: Graceful degradation
- **Monitoring**: Track API usage

## Future Enhancements

### 1. Advanced Search
- **Faceted Search**: Category, brand, price filters
- **Semantic Search**: Natural language processing
- **Voice Search**: Audio input support

### 2. Personalization
- **AI Recommendations**: Machine learning suggestions
- **Search History**: Persistent user preferences
- **Cross-Device Sync**: Unified search experience

### 3. Performance
- **Caching**: Search result caching
- **CDN**: Global content delivery
- **Optimization**: Query performance tuning

## Conclusion

The Meijer search functionality is a sophisticated, multi-layered system that provides:
- **Real-time autocomplete** with intelligent suggestions
- **Comprehensive search** with filtering and pagination
- **Rich product data** with high-quality images
- **User behavior tracking** for personalization
- **Robust analytics** for optimization

The system is well-architected with separate domains for different functions:
- `ac.cnstrc.com` for search and autocomplete
- `api.meijer.com` for product data and operations
- `meijer.com/content/dam/meijer` for assets and images

This architecture provides scalability, maintainability, and performance while delivering a rich user experience for product discovery and shopping.
