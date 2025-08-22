# Meijer API Endpoint Implementation Plan

## Executive Summary

Based on the comprehensive endpoint frequency analysis of 6 mitmproxy log files, we've identified **42 missing endpoints** out of 68 total discovered endpoints. Our current implementation covers only **25 endpoints**, representing a **37% coverage rate**.

## Key Findings

### 📊 Coverage Statistics
- **Total Endpoints Found**: 68
- **Currently Implemented**: 25 (37%)
- **Missing Implementation**: 42 (63%)
- **High Priority (Score > 50)**: 15 endpoints

### 🏆 Top 10 Most Frequently Hit Missing Endpoints

| Rank | Endpoint | Hits | Category | Priority Score | Implementation Effort |
|------|----------|------|----------|----------------|----------------------|
| 1 | `GET /digital/occ/v3/carts/current` | 94 | Cart | 89.1 | HIGH |
| 2 | `GET /digital/homecards/v1/cards/shopByDepartmentV2` | 69 | Home Cards | 76.1 | MEDIUM |
| 3 | `GET /digital/homecards/v1/cards/buyAgainV2` | 69 | Home Cards | 76.1 | MEDIUM |
| 4 | `GET /digital/homecards/v1/cards` | 65 | Home Cards | 76.1 | MEDIUM |
| 5 | `GET /digital/homecards/v1/cards/seasonalCarousel` | 64 | Home Cards | 76.1 | MEDIUM |
| 6 | `GET /digital/homecards/v1/cards/marketing-carousel-3` | 64 | Home Cards | 76.1 | MEDIUM |
| 7 | `GET /digital/homecards/v1/cards/marketing-carousel-1` | 64 | Home Cards | 76.1 | MEDIUM |
| 8 | `GET /digital/homecards/v1/cards/marketing-carousel-2` | 64 | Home Cards | 76.1 | MEDIUM |
| 9 | `GET /digital/homecards/v1/cards/favoritesOnSaleV2` | 64 | Home Cards | 76.1 | MEDIUM |
| 10 | `GET /digital/occ/v3/orders` | 58 | Orders | 76.1 | HIGH |

## 🎯 Implementation Priority Matrix

### Phase 1: Critical Cart & Order Management (Weeks 1-2)
**Priority Score: 80+ | Impact: HIGH | Effort: HIGH**

#### 1. Enhanced Cart Management
- **`GET /digital/occ/v3/carts/current`** (94 hits)
  - **Purpose**: Get current cart with full details
  - **Parameters**: `store`, `calculateForLC`, `fields`, `fetchCartModifications`, `retainOutOfStock`
  - **Implementation**: Extend existing cart.py with OCC v3 endpoints
  - **Dependencies**: Enhanced authentication, store context

#### 2. Order Management System
- **`GET /digital/occ/v3/orders`** (58 hits)
  - **Purpose**: Retrieve order history and status
  - **Parameters**: `currentPage`, `pageSize`, `fields`
  - **Implementation**: New orders.py module
  - **Dependencies**: Authentication, pagination support

### Phase 2: Home Cards & Recommendations (Weeks 3-4)
**Priority Score: 70-79 | Impact: MEDIUM | Effort: MEDIUM**

#### 3. Home Cards System
- **`GET /digital/homecards/v1/cards`** (65 hits)
  - **Purpose**: Main homepage content cards
  - **Implementation**: New homecards.py module
  - **Features**: Dynamic content, personalization

#### 4. Department Shopping
- **`GET /digital/homecards/v1/cards/shopByDepartmentV2`** (69 hits)
  - **Purpose**: Department-based shopping recommendations
  - **Implementation**: Extend homecards.py
  - **Features**: Department categorization, product suggestions

#### 5. Buy Again Recommendations
- **`GET /digital/homecards/v1/cards/buyAgainV2`** (69 hits)
  - **Purpose**: Previously purchased items recommendations
  - **Parameters**: `customerId`, `store`, `pageNum`, `listType`, `pageName`
  - **Implementation**: Extend homecards.py with ML recommendations

#### 6. Marketing Carousels
- **Marketing Carousel Endpoints** (64 hits each)
  - **Purpose**: Promotional content, seasonal offers
  - **Implementation**: Unified carousel system
  - **Features**: Dynamic content, A/B testing support

### Phase 3: Advanced Features (Weeks 5-6)
**Priority Score: 60-69 | Impact: MEDIUM | Effort: MEDIUM**

#### 7. Product Recommendations
- **`GET /digital/product-recommendations/v1/customer/{id}/recommendations/buy-again/{count}/upc`**
  - **Purpose**: ML-powered product recommendations
  - **Implementation**: New recommendations.py module
  - **Features**: Customer segmentation, preference learning

#### 8. Enhanced Product Info
- **`POST /edaa/product/productinfo/v1/item`**
  - **Purpose**: Detailed product information
  - **Implementation**: Extend existing product_operations.py
  - **Features**: Rich product data, availability, pricing

#### 9. Substitution Preferences
- **`POST /digital/occ/v3/carts/current/update-substitution-preference`**
  - **Purpose**: Manage product substitution preferences
  - **Implementation**: Extend cart.py
  - **Features**: User preferences, smart substitutions

### Phase 4: Specialized Features (Weeks 7-8)
**Priority Score: 50-59 | Impact: LOW | Effort: LOW-MEDIUM**

#### 10. Digital Order Tips
- **`GET /digital/digitalorders/TipsNotifications/{customerId}`**
  - **Purpose**: Order-related notifications and tips
  - **Implementation**: Extend orders.py
  - **Features**: Real-time notifications, order tracking

#### 11. Complex Promotions
- **`GET /digital/complexpromos/v1/{promoId}/{storeId}`**
  - **Purpose**: Advanced promotional offers
  - **Implementation**: Extend coupons.py
  - **Features**: Multi-tier promotions, conditional offers

## 🏗️ Implementation Architecture

### New Module Structure
```
meijer/
├── homecards.py          # Home page content management
├── orders.py             # Order history and management
├── recommendations.py    # ML-powered recommendations
├── enhanced_cart.py      # OCC v3 cart operations
└── notifications.py      # Real-time notifications
```

### Enhanced Existing Modules
```
meijer/
├── cart.py               # Add OCC v3 endpoints
├── product_operations.py # Enhanced product info
├── coupons.py            # Complex promotions
└── client.py             # Unified interface
```

## 🔧 Technical Implementation Details

### 1. Enhanced Cart Management (OCC v3)
```python
class EnhancedCart:
    """Enhanced cart management with OCC v3 support."""
    
    def get_current_cart(self, store_id: str, calculate_for_lc: bool = True) -> Dict:
        """Get current cart with full details."""
        endpoint = "/digital/occ/v3/carts/current"
        params = {
            "store": store_id,
            "calculateForLC": calculate_for_lc,
            "fields": "FULL",
            "fetchCartModifications": True,
            "retainOutOfStock": True
        }
        return self._make_request("GET", endpoint, params=params)
```

### 2. Home Cards System
```python
class HomeCards:
    """Home page content management system."""
    
    def get_cards(self, customer_id: Optional[str] = None) -> Dict:
        """Get main homepage content cards."""
        endpoint = "/digital/homecards/v1/cards"
        params = {"customerId": customer_id} if customer_id else {}
        return self._make_request("GET", endpoint, params=params)
    
    def get_buy_again_recommendations(self, customer_id: str, store_id: str) -> Dict:
        """Get buy-again product recommendations."""
        endpoint = f"/digital/homecards/v1/cards/buyAgainV2"
        params = {
            "customerId": customer_id,
            "store": store_id,
            "pageNum": 1,
            "listType": 1,
            "pageName": "homepage_app"
        }
        return self._make_request("GET", endpoint, params=params)
```

### 3. Order Management
```python
class OrderManager:
    """Order history and management system."""
    
    def get_orders(self, page: int = 0, page_size: int = 10) -> Dict:
        """Retrieve order history."""
        endpoint = "/digital/occ/v3/orders"
        params = {
            "currentPage": page,
            "pageSize": page_size,
            "fields": "FULL"
        }
        return self._make_request("GET", endpoint, params=params)
```

## 📈 Success Metrics

### Phase 1 (Weeks 1-2)
- **Cart Coverage**: Increase from 15% to 85%
- **Order Coverage**: Increase from 0% to 100%
- **API Coverage**: Overall increase from 37% to 45%

### Phase 2 (Weeks 3-4)
- **Home Cards Coverage**: Increase from 0% to 100%
- **Recommendations Coverage**: Increase from 0% to 80%
- **API Coverage**: Overall increase from 45% to 60%

### Phase 3 (Weeks 5-6)
- **Product Operations**: Increase from 60% to 85%
- **Advanced Features**: Increase from 0% to 70%
- **API Coverage**: Overall increase from 60% to 75%

### Phase 4 (Weeks 7-8)
- **Specialized Features**: Increase from 0% to 60%
- **Overall API Coverage**: Target 80%+ coverage
- **User Experience**: Significant improvement in app functionality

## 🚀 Implementation Strategy

### Week 1: Foundation
- Set up new module structure
- Implement OCC v3 cart endpoints
- Add comprehensive error handling

### Week 2: Core Features
- Complete order management system
- Implement enhanced cart operations
- Add integration tests

### Week 3: Content Management
- Build home cards system
- Implement department shopping
- Add personalization features

### Week 4: Recommendations
- Build ML recommendation system
- Implement buy-again logic
- Add marketing carousel support

### Week 5: Advanced Features
- Enhanced product information
- Substitution preferences
- Complex promotions

### Week 6: Integration & Testing
- Comprehensive integration testing
- Performance optimization
- Documentation updates

### Week 7: Specialized Features
- Notification system
- Advanced promotions
- Edge case handling

### Week 8: Polish & Deploy
- Final testing and bug fixes
- Performance optimization
- Production deployment

## 💡 Key Benefits

### For Users
- **Enhanced Shopping Experience**: Better cart management, order tracking
- **Personalized Content**: ML-powered recommendations, relevant offers
- **Improved Navigation**: Department-based shopping, seasonal content

### For Developers
- **Better API Coverage**: From 37% to 80%+
- **Modular Architecture**: Cleaner, more maintainable code
- **Comprehensive Testing**: Better reliability and performance

### For Business
- **Increased Engagement**: More features = more app usage
- **Better Data**: Comprehensive API coverage = better insights
- **Competitive Advantage**: Feature parity with official app

## 🔍 Risk Assessment

### High Risk
- **OCC v3 Integration**: New cart system complexity
- **Authentication**: Enhanced token management requirements
- **Performance**: Large data sets from home cards

### Medium Risk
- **ML Recommendations**: Algorithm complexity and accuracy
- **Real-time Updates**: Notification system reliability
- **Data Consistency**: Multiple data sources synchronization

### Low Risk
- **Static Content**: Marketing carousels, seasonal content
- **Basic Operations**: Simple GET endpoints
- **Documentation**: Well-defined API specifications

## 📋 Next Steps

1. **Immediate (This Week)**
   - Review and approve implementation plan
   - Set up development environment
   - Begin Phase 1 implementation

2. **Short Term (Next 2 Weeks)**
   - Complete enhanced cart management
   - Implement order management system
   - Add comprehensive testing

3. **Medium Term (Next Month)**
   - Build home cards system
   - Implement recommendations
   - Add marketing features

4. **Long Term (Next Quarter)**
   - Achieve 80%+ API coverage
   - Implement advanced features
   - Performance optimization

This implementation plan will significantly improve our API coverage and provide users with a much more comprehensive and feature-rich Meijer shopping experience.
