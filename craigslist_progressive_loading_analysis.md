# Craigslist Progressive Loading Analysis

## Overview
Analysis of mitmproxy log `meijer_mitm_20250828_132252.log` reveals the progressive loading behavior when searching for "Priority 600" on the Muskegon Craigslist subdomain.

## Progressive Loading Sequence

### 1. Initial Search Suggestion (include_nearby=1)
- **URL**: `/suggest?include_nearby=1&term=Priority%20600&type=search`
- **Host**: `muskegon.craigslist.org`
- **Purpose**: Initial search suggestion with nearby areas included
- **Timestamp**: 1756401855.7942042

### 2. Category Analysis
- **URL**: `/web/v8/categories/likely-categories?areaId=554&query=Priority%20600&lang=en&cc=us`
- **Host**: `sapi.craigslist.org`
- **Purpose**: Determine likely categories for the search term
- **Parameters**:
  - `areaId=554` (Muskegon area)
  - `query=Priority%20600`
  - `lang=en&cc=us`

### 3. Search Results Count
- **URL**: `/web/v8/categories/counts-for-search-url?url=https%3A%2F%2Fmuskegon.craigslist.org%2Fsearch%2Fsss%3Fquery%3DPriority%2520600&lang=en&cc=us`
- **Host**: `sapi.craigslist.org`
- **Purpose**: Get count of results for the search URL
- **Note**: URL is double-encoded

### 4. Full Search Results (Progressive Loading)
- **URL**: `/web/v8/postings/search/full?batch=554-0-360-0-0&query=Priority%20600&searchPath=sss&lang=en&cc=us`
- **Host**: `sapi.craigslist.org`
- **Purpose**: Retrieve actual search results
- **Key Parameters**:
  - `batch=554-0-360-0-0` (Area ID, batch size, offset, etc.)
  - `query=Priority%20600`
  - `searchPath=sss` (for sale search)
  - `lang=en&cc=us`

## Key Insights

### Progressive Loading Parameters
- **Batch System**: Uses `batch=554-0-360-0-0` format
  - `554`: Area ID (Muskegon)
  - `0`: Initial batch
  - `360`: Batch size (360 results per request)
  - `0`: Offset (starting from 0)
  - `0`: Additional parameter

### Regional Search Behavior
- When local results are insufficient, the system automatically expands to regional search
- The `include_nearby=1` parameter in suggestions enables this behavior
- Results come from the broader region when local area has 0 results

### API Endpoints Used
1. **Suggestions**: `muskegon.craigslist.org/suggest` (with nearby areas)
2. **Categories**: `sapi.craigslist.org/web/v8/categories/*`
3. **Search**: `sapi.craigslist.org/web/v8/postings/search/full`

## Implementation Recommendations

### Enhanced Search Tooling Should Include:
1. **Progressive Loading Support**: Handle batch-based pagination
2. **Regional Search**: Automatically expand search when local results are insufficient
3. **Category Analysis**: Use category endpoints to improve search relevance
4. **Nearby Areas**: Include `include_nearby=1` in suggestion requests

### Search Flow:
1. Start with local area search
2. If results < threshold, expand to regional search
3. Use batch system for pagination
4. Implement category-based filtering
5. Handle progressive loading with proper batch management
