# UPC Flow Analysis Summary

## Analysis Overview
This document summarizes the analysis of the latest mitmproxy log file (`meijer_mitm_20250821_221329.log`) for flows containing specific UPCs. The analysis was performed using a custom script that properly parses mitmproxy log files to identify different types of operations.

## Target UPCs Analyzed
- **629307040245** - Found 42 flows
- **842595131277** - Found 30 flows  
- **822279082910** - Found 1 flow
- **070896523112** - Found 1 flow
- **713733252843** - Found 1 flow
- **016000275263** - Found 1 flow
- **046100001899** - Found 2 flows

## Key Findings

### 1. Search Operations vs Product Operations

#### Search by UPC vs Search by Name
The analysis reveals a clear distinction between different search types:

**Search by UPC (Direct UPC Lookup):**
- **Endpoint**: `https://api.meijer.com/edaa/product/productinfo/v1/item`
- **Method**: POST
- **Content**: Contains the UPC directly in request body
- **Purpose**: Direct product lookup by UPC code

**Search by Name/Text (Construc Search):**
- **Endpoint**: `https://ac.cnstrc.com/search/{UPC}`
- **Method**: GET
- **Content**: UPC appears in URL path, not in request body
- **Purpose**: Search through product catalog using UPC as search term

### 2. Flow Types Identified

#### A. Product Information Flows
- **UPCs**: 842595131277, 822279082910, 016000275263, 713733252843, 070896523112, 046100001899
- **Pattern**: POST to `/edaa/product/productinfo/v1/item`
- **Headers**: Bearer token authentication, OCP-APIM subscription key
- **Purpose**: Retrieve detailed product information

#### B. Search Flows
- **UPCs**: 629307040245, 842595131277, 046100001899
- **Pattern**: GET to `ac.cnstrc.com/search/{UPC}`
- **Headers**: Minimal headers (okhttp user-agent)
- **Purpose**: Search product catalog

#### C. Product Detail Flows
- **UPCs**: 842595131277
- **Pattern**: GET to `/digital/occ/v3/products/{UPC}`
- **Headers**: OCP-APIM subscription key
- **Purpose**: Get product details from OCC system

#### D. Cart Operations
- **UPCs**: 629307040245 (multiple flows)
- **Pattern**: GET to `/digital/occ/v3/carts/current`
- **Headers**: Bearer token authentication
- **Purpose**: Retrieve current cart status

#### E. Home Card Flows
- **UPCs**: 842595131277 (multiple flows)
- **Pattern**: GET to `/digital/homecards/v1/cards/*`
- **Headers**: OCP-APIM subscription key
- **Purpose**: Retrieve personalized home page content

### 3. Authentication Patterns

#### Bearer Token Authentication
- Used for: Product info, cart operations
- Header: `Authorization: Bearer {JWT}`
- Scope: User-specific operations

#### API Key Authentication
- Used for: Product details, home cards
- Header: `ocp-apim-subscription-key: {key}`
- Scope: General API access

#### No Authentication
- Used for: Construc search
- Purpose: Public search functionality

### 4. Cart vs Shop'n'Scan Distinction

**Regular Cart Operations:**
- Endpoint: `/digital/occ/v3/carts/current`
- Purpose: Standard shopping cart management
- Authentication: Bearer token required

**Shop'n'Scan Cart Operations:**
- **Note**: No Shop'n'Scan cart operations were found in this log file
- Expected endpoint pattern: Contains "shop", "scan", and "cart" keywords
- Purpose: In-store scanning and cart building

### 5. Search Flow Analysis

#### Construc Search (ac.cnstrc.com)
- **URL Pattern**: `/search/{UPC}?filters[availableInStores]={store}&page=1&num_results_per_page=30`
- **Parameters**:
  - `availableInStores`: Store filter (e.g., 20)
  - `page`: Pagination (starts at 1)
  - `num_results_per_page`: Results per page (30)
  - `key`: API key for Construc service
  - `i`, `ui`, `s`, `c`: Session and user identifiers
  - `_dt`: Timestamp

#### Direct Product Lookup
- **URL Pattern**: `/edaa/product/productinfo/v1/item`
- **Method**: POST
- **Content**: JSON body containing UPC
- **Purpose**: Direct product information retrieval

## Technical Insights

### 1. Flow Sequencing
The analysis shows a typical user journey:
1. **Search**: User searches for product (Construc)
2. **Product Info**: Retrieves detailed product information
3. **Product Details**: Gets OCC product details
4. **Cart Operations**: Manages shopping cart
5. **Home Cards**: Views personalized content

### 2. API Architecture
- **Construc**: Handles search and discovery
- **EDAA**: Provides product information
- **OCC**: Manages cart and product details
- **Home Cards**: Personalization service

### 3. Rate Limiting
- Construc API shows rate limit headers:
  - `x-ratelimit-limit`: 201 requests
  - `x-ratelimit-remaining`: Current remaining requests
  - `x-ratelimit-reset`: Reset timestamp

## Recommendations

### 1. For UPC Search Implementation
- Use **Construc search** for product discovery and catalog search
- Use **direct product lookup** for known UPCs when detailed info is needed
- Implement proper rate limiting based on Construc API limits

### 2. For Cart Operations
- Regular cart operations use OCC system with Bearer token
- Shop'n'Scan operations would use different endpoints (not found in this log)
- Cart operations require user authentication

### 3. For Product Information
- Use OCC product details for comprehensive product information
- Use EDAA product info for basic product details
- Consider caching product information to reduce API calls

## Conclusion

The analysis successfully identified the distinction between search by UPC vs search by name operations:

- **Search by UPC**: Direct product lookup via EDAA API (POST to `/edaa/product/productinfo/v1/item`)
- **Search by Name**: Catalog search via Construc API (GET to `ac.cnstrc.com/search/{term}`)

The log shows comprehensive coverage of user interactions including search, product viewing, cart management, and personalized content retrieval. This provides valuable insights for implementing similar functionality in automated systems.
