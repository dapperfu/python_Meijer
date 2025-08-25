# Meijer API Implementation Analysis

## Executive Summary

This document analyzes the differences between our Meijer API implementation and the actual behavior of the Meijer mobile app, based on analysis of mitmproxy logs capturing real app traffic.

## Key Findings

### 1. **Store Search Implementation Mismatch**

**Our Implementation:**
- Uses `/digital/storeInfo/v2/stores/proximity` endpoint
- Implements ZIP code to coordinate conversion
- Calculates distances using Haversine formula
- Returns up to 5 stores with distance information

**Actual App Behavior:**
- **The app does NOT use the store search endpoints we implemented**
- App makes 13 calls to `/digital/storeInfo/v2/stores/proximity` but these appear to be for other purposes
- App makes 8 calls to `/digital/storeInfo/stores/71` (specific store lookup)
- **Store search functionality in the app appears to be handled differently**

### 2. **Authentication Flow Differences**

**Our Implementation:**
- Uses OAuth2 flow with `/oauth2/authorize` and `/oauth2/token`
- Implements email 2FA verification
- Uses session-based token storage

**Actual App Behavior:**
- Uses `id.meijer.com` domain (not `api.meijer.com`)
- Implements device fingerprinting with parameters:
  - `deviceId`, `deviceHardwareType`, `systemVersion`, `model`
  - Uses `sdk-dci` and `sdk_challenge.js` endpoints
- **Completely different authentication mechanism than OAuth2**

### 3. **Cart and Order Management**

**Our Implementation:**
- Basic cart operations with `/digital/occ/v3/carts/current`

**Actual App Behavior:**
- Uses enhanced cart endpoint with additional parameters:
  - `store=71` (store-specific cart)
  - `calculateForLC=true` (loyalty card calculations)
  - `fields=FULL` (complete cart data)
  - `fetchCartModifications=true` (cart modifications)
  - `retainOutOfStock=true` (keep out-of-stock items)

### 4. **Missing Functionality in Our Implementation**

The app uses several endpoints we don't implement:

- **Home Content**: `/digital/homecards/v1/cards/*` (multiple carousel types)
- **Product Recommendations**: `/digital/product-recommendations/v1/customer/*`
- **Shopping Lists**: `/loyalty/shoppinglist/GetList`
- **Favorites**: `/loyalty/shoppinglist/GetFavoritesList`
- **Fulfillment**: `/digital/hybris/v3/fulfillment/reservationslots`
- **Multi-UPC**: `/digital/multi-upc/v1/upcs`

## Critical Issues Identified

### 1. **Store Search Not Working as Expected**
- Our store search implementation may be hitting the wrong endpoints
- The app appears to use a different mechanism for store discovery
- We need to investigate how the app actually performs store searches

### 2. **Authentication Mechanism Mismatch**
- We're implementing OAuth2 but the app uses a completely different system
- The app uses device fingerprinting and SDK-based authentication
- Our authentication may not be compatible with the current API

### 3. **Missing Core Functionality**
- We're missing many endpoints that the app actively uses
- Our implementation may be too focused on specific features rather than core app functionality

## Recommendations

### Immediate Actions Required

1. **Investigate Store Search Reality**
   - Determine how the app actually performs store searches
   - Check if our proximity endpoint is being used correctly
   - Verify if store search is handled by a different service

2. **Review Authentication Strategy**
   - Investigate if OAuth2 is still the correct approach
   - Consider implementing the device fingerprinting approach
   - Verify if our tokens are compatible with the current API

3. **Audit API Compatibility**
   - Test our current endpoints against the live API
   - Verify if our implementation matches the expected API behavior
   - Check if API changes have made our implementation obsolete

### Long-term Improvements

1. **Implement Missing Core Features**
   - Add home content and recommendations
   - Implement shopping list functionality
   - Add multi-UPC support

2. **Align with App Architecture**
   - Study the app's actual API usage patterns
   - Implement the same endpoints and parameters
   - Match the app's data flow and state management

## Technical Details

### Log Analysis Summary
- **Total API calls captured**: 91
- **Store-related calls**: 173 (mostly external services like Google Maps)
- **Authentication calls**: 115 (mostly device fingerprinting)
- **Other calls**: 20,029 (mostly external services, analytics, etc.)

### Most Used API Endpoints
1. `/digital/storeInfo/v2/stores/proximity` - 13 calls
2. `/digital/storeInfo/stores/71` - 8 calls
3. `/loyalty/mPerks/api/cms/specialoffers/image` - 6 calls
4. `/digital/occ/v3/carts/current` - 4 calls

### Authentication Patterns
- Uses `id.meijer.com` domain
- Implements device fingerprinting with unique device IDs
- Uses SDK challenge mechanisms
- Includes hardware and system information in requests

## Conclusion

Our current Meijer API implementation has significant gaps compared to the actual app behavior. The most critical issues are:

1. **Store search functionality may not be working as intended**
2. **Authentication mechanism is completely different from what we implement**
3. **Missing many core app features and endpoints**

We need to conduct a thorough review of our implementation against the current API and adjust our approach to match the app's actual behavior. The log analysis suggests that the app has evolved significantly from the API documentation we may have been following.

## Next Steps

1. **Immediate**: Test our store search with verbose logging to see what's actually happening
2. **Short-term**: Investigate the authentication mechanism used by the app
3. **Medium-term**: Implement missing core functionality based on app usage patterns
4. **Long-term**: Align our entire implementation with the app's current architecture

---

*Analysis generated from mitmproxy logs captured on 2025-08-25*
*Total flows analyzed: 20,408*
*API calls analyzed: 91*
