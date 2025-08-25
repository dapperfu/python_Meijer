# mPerks Flow Analysis Summary

## Analysis Overview
This document summarizes the analysis of mPerks-related API calls and flows from the latest mitmproxy log file (`meijer_mitm_20250822_2330.log`). The analysis was performed using a specialized tool that properly parses mitmproxy log files to identify different types of mPerks operations.

## Key Statistics
- **Total flows analyzed**: 357
- **mPerks-related flows**: 50
- **Flow sequences identified**: 11
- **Average sequence length**: 4.5 flows
- **Longest sequence**: 17 flows

## Flow Type Distribution
- **General mPerks**: 10 flows (20.0%)
- **Other**: 28 flows (56.0%)
- **Offers & Coupons**: 4 flows (8.0%)
- **Points & Balance**: 4 flows (8.0%)
- **Authentication**: 2 flows (4.0%)
- **Profile & Settings**: 2 flows (4.0%)

## Core mPerks API Endpoints

### 1. Content Management System (CMS)
- **`/loyalty/mPerks/api/cms/home/content`** - Main mPerks dashboard content
- **`/loyalty/mPerks/api/cms/specialoffers/image`** - Special offers and promotional images

### 2. Offers and Coupons
- **`/loyalty/mPerks/api/offers`** - Available mPerks offers and deals
- **`/loyalty/mPerks/api/customer/EmailVerificationSpiffs`** - Email verification special offers

### 3. Points and Rewards
- **`/digital/mperks40/customer/v1/pointbalance`** - Current points balance
- **`/digital/mperks40/customer/v1/points/expiring?days=30`** - Points expiring within 30 days
- **`/digital/mperks40/customer/v1/rewards/available`** - Available rewards to claim
- **`/digital/mperks40/customer/v1/rewards/inprogress`** - Rewards currently being earned
- **`/loyalty/mPerks/api/reward/earned`** - Already earned rewards
- **`/loyalty/mPerks/api/reward/mCard/info`** - mCard reward information

### 4. Account and Profile
- **`/digital/mperks40/customer/v1/account`** - Customer account information
- **`/digital/mperks40/customer/v1/autoclaim/available`** - Auto-claim settings and availability

### 5. Shopping and Cart Integration
- **`/digital/occ/v3/carts/current`** - Current shopping cart with loyalty calculations
- **`/loyalty/shoppinglist/GetList`** - Shopping list retrieval
- **`/digital/multi-upc/v1/upcs`** - Multi-UPC product lookups

### 6. Home Dashboard Components
- **`/digital/homecards/v1/cards`** - Main dashboard cards
- **`/digital/homecards/v1/cards/rewards`** - Rewards-specific dashboard cards
- **`/digital/homecards/v1/cards/marketing-carousel-1/2/3`** - Marketing carousel content
- **`/digital/homecards/v1/cards/buyAgainV2`** - Buy again recommendations
- **`/digital/homecards/v1/cards/favoritesOnSaleV2`** - Favorites on sale

## Flow Sequence Patterns

### Typical mPerks Dashboard Load Sequence
When a user clicks on mPerks, the following sequence typically occurs:

1. **Authentication & Session Validation**
   - Bearer token validation
   - Customer ID verification

2. **Core Content Loading**
   - CMS home content (`/loyalty/mPerks/api/cms/home/content`)
   - Special offers images (`/loyalty/mPerks/api/cms/specialoffers/image`)
   - Available offers (`/loyalty/mPerks/api/offers`)

3. **Points and Rewards Status**
   - Current point balance (`/digital/mperks40/customer/v1/pointbalance`)
   - Expiring points (`/digital/mperks40/customer/v1/points/expiring`)
   - Available rewards (`/digital/mperks40/customer/v1/rewards/available`)
   - Earned rewards (`/loyalty/mPerks/api/reward/earned`)

4. **Dashboard Components**
   - Home cards (`/digital/homecards/v1/cards`)
   - Marketing carousels
   - Shopping list integration
   - Cart status with loyalty calculations

5. **Special Features**
   - Auto-claim availability (`/digital/mperks40/customer/v1/autoclaim/available`)
   - Email verification offers (`/loyalty/mPerks/api/customer/EmailVerificationSpiffs`)
   - mCard reward info (`/loyalty/mPerks/api/reward/mCard/info`)

## Authentication and Headers

### Required Headers
- **Authorization**: Bearer token (JWT from Okta)
- **OCP-APIM-Subscription-Key**: API subscription key
- **User-Agent**: Meijer mobile app identifier
- **Cookie**: ROUTE for load balancing

### Content Types
- **Request**: `application/vnd.meijer.digitalmperks.*+json`
- **Response**: `application/vnd.meijer.digitalmperks.*+json` or `application/json`

## Key Findings

### 1. Comprehensive Dashboard Integration
The mPerks system integrates multiple data sources to provide a unified dashboard experience, including:
- Loyalty points and rewards
- Shopping cart integration
- Personalized offers and recommendations
- Account management features

### 2. Real-time Data Synchronization
Multiple API calls ensure real-time updates of:
- Point balances
- Available rewards
- Shopping cart status
- Special offers

### 3. Mobile-First Design
All endpoints are optimized for mobile usage with:
- Efficient data formats
- Minimal payload sizes
- Caching strategies
- Progressive loading

### 4. Loyalty Program Integration
Deep integration with Meijer's loyalty system:
- Points tracking and expiration
- Reward earning and redemption
- Shopping behavior analysis
- Personalized recommendations

## Technical Implementation Notes

### API Versioning
- Legacy endpoints: `/loyalty/mPerks/api/*`
- Modern endpoints: `/digital/mperks40/customer/v1/*`
- OCC integration: `/digital/occ/v3/*`

### Data Flow Architecture
1. **Authentication Layer**: Okta OAuth2 with JWT tokens
2. **API Gateway**: Azure API Management with subscription keys
3. **Backend Services**: Multiple microservices for different mPerks features
4. **Data Sources**: Integration with shopping cart, loyalty, and CMS systems

### Performance Considerations
- Parallel API calls for independent data sources
- Efficient pagination for large datasets
- Smart caching strategies
- Load balancing across multiple API instances

## Conclusion

The mPerks system demonstrates a sophisticated, well-architected loyalty platform that provides users with comprehensive access to their rewards, offers, and shopping information. The flow analysis reveals a carefully orchestrated sequence of API calls that ensures users receive up-to-date information while maintaining optimal performance.

The system's modular design allows for easy updates and feature additions while maintaining backward compatibility with existing integrations.
