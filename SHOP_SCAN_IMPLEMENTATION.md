# 🛒 Meijer Shop & Scan Implementation

## Overview

Complete implementation of Meijer's Shop & Scan functionality based on APK analysis and the discovered transaction flow. This system allows users to scan items while shopping and finalize checkout through the mobile app workflow.

## 🏗️ Architecture

### Data Structures

#### `ShopScanItem`
```python
@dataclass
class ShopScanItem:
    """Shop & Scan cart item."""
    barcode: str
    description: str
    price: float
    quantity: int = 1
    item_id: Optional[str] = None
    timestamp: Optional[datetime] = None
```

#### `ShopScanTrip`
```python
@dataclass 
class ShopScanTrip:
    """Shop & Scan shopping trip."""
    trip_id: str
    store_id: str
    started_at: datetime
    items: List[ShopScanItem] = field(default_factory=list)
    status: str = "active"
    total_amount: float = 0.0
```

### Integration

The `ShopNScan` class is integrated as an attribute of the main `Meijer` client:

```python
# In Meijer.__init__():
self.shop_scan = ShopNScan(self)
```

## 🔗 API Endpoints

Based on APK decompilation analysis, the following endpoints were discovered:

| Endpoint | Purpose | Method |
|----------|---------|--------|
| `/dgtlmma/accounts/isShopAndScanEnabled` | Check user eligibility | GET |
| `/dgtlmma/shopandscan/trip/start` | Initialize shopping session | POST |
| `/dgtlmma/shopandscan/item/scan` | Barcode lookup and validation | POST |
| `/dgtlmma/shopandscan/cart/add` | Add items to cart | POST |
| `/dgtlmma/shopandscan/cart/remove` | Remove items from cart | DELETE |
| `/dgtlmma/shopandscan/cart` | Get cart contents | GET |
| `/dgtlmma/shopandscan/checkout/finalize` | Complete transaction | POST |
| `/dgtlmma/shopandscan/trip/end` | End shopping session | POST |

Additional endpoint:
- `https://static.meijer.com/mobileassets/shopandscan/shopandscan_config.json` - Static configuration

## 🔄 Transaction Flow

The implementation follows the exact workflow discovered from network analysis:

1. **Initialization**: Check if Shop & Scan is enabled for user
2. **Trip Start**: Begin session at specific store location
3. **Item Scanning**: Barcode lookup → Price retrieval → Cart addition
4. **Checkout**: Finalize cart for payment processing

This matches the user's test case: **started transaction → 2 items scanned → cart finalized for checkout**

## 🛠️ Key Methods

### Core Functionality

#### `is_enabled() -> bool`
Check if Shop & Scan is available for the current user.

```python
if meijer.shop_scan.is_enabled():
    print("Shop & Scan is available")
```

#### `start_trip(store_id: str) -> bool`
Start a new shopping trip at the specified store.

```python
success = meijer.shop_scan.start_trip("52")
```

#### `scan_item(barcode: str, quantity: int = 1) -> Optional[ShopScanItem]`
Scan an item by barcode and add it to the cart.

```python
item = meijer.shop_scan.scan_item("012345678905")
if item:
    print(f"Scanned: {item.description} - ${item.price}")
```

#### `finalize_checkout() -> Optional[Dict[str, Any]]`
Finalize the cart for checkout.

```python
checkout_result = meijer.shop_scan.finalize_checkout()
if checkout_result:
    print("Checkout successful!")
```

### Cart Management

#### `get_cart() -> List[ShopScanItem]`
Get current cart contents.

```python
cart = meijer.shop_scan.get_cart()
for item in cart:
    print(f"{item.description}: ${item.price}")
```

#### `remove_item(item_identifier: Union[str, ShopScanItem]) -> bool`
Remove an item from the cart.

```python
# Remove by barcode
success = meijer.shop_scan.remove_item("012345678905")

# Remove by item object
success = meijer.shop_scan.remove_item(scanned_item)
```

### Trip Management

#### `get_trip_summary() -> Optional[Dict[str, Any]]`
Get comprehensive trip information.

```python
summary = meijer.shop_scan.get_trip_summary()
print(f"Trip ID: {summary['trip_id']}")
print(f"Total: ${summary['total_amount']}")
print(f"Items: {summary['item_count']}")
```

#### `end_trip() -> bool`
End the current shopping trip.

```python
success = meijer.shop_scan.end_trip()
```

### Configuration

#### `get_config() -> Optional[Dict[str, Any]]`
Get Shop & Scan configuration from static assets.

```python
config = meijer.shop_scan.get_config()
```

## 📝 Usage Examples

### Basic Workflow

```python
from meijer_v2 import Meijer

with Meijer() as meijer:
    if meijer.login():
        shop_scan = meijer.shop_scan
        
        # Check availability
        if shop_scan.is_enabled():
            # Start trip
            shop_scan.start_trip("52")
            
            # Scan items
            item1 = shop_scan.scan_item("012345678905")
            item2 = shop_scan.scan_item("012345678912")
            
            # Review cart
            cart = shop_scan.get_cart()
            print(f"Cart has {len(cart)} items")
            
            # Finalize checkout
            checkout = shop_scan.finalize_checkout()
            
            # End trip
            shop_scan.end_trip()
```

### Error Handling

```python
try:
    if shop_scan.is_enabled():
        shop_scan.start_trip("52")
        
        item = shop_scan.scan_item("012345678905")
        if item:
            checkout = shop_scan.finalize_checkout()
            if checkout:
                print("Success!")
            else:
                print("Checkout failed")
        else:
            print("Item scan failed")
            
except MeijerAPIError as e:
    print(f"API Error: {e}")
except MeijerAuthenticationError as e:
    print(f"Auth Error: {e}")
```

## 🔐 Authentication Requirements

Shop & Scan requires full authentication:
- Valid OAuth tokens
- Active session
- User eligibility for Shop & Scan feature

The implementation automatically checks authentication status and refreshes tokens as needed.

## 🧪 Testing

Run the comprehensive test suite:

```bash
python test_shop_scan.py
```

The test script demonstrates:
1. Authentication and setup
2. Availability checking
3. Trip initialization
4. Item scanning (2 items as per user test case)
5. Cart management
6. Checkout finalization
7. Trip cleanup

## 🏪 Store Integration

The system requires a valid store ID to initialize shopping trips. Common store IDs:
- `"52"` - Example store often used in testing
- Store IDs can be obtained from the `get_stores()` method

## 🔄 State Management

The implementation maintains local state synchronized with server:
- Current trip information
- Cart contents and totals
- Item details and timestamps
- Trip status tracking

## 🛡️ Error Handling

Comprehensive error handling for:
- Network connectivity issues
- Invalid barcodes
- Authentication failures
- API endpoint errors
- Cart validation problems

## 📊 Analytics and Logging

All Shop & Scan operations are logged with appropriate levels:
- `INFO`: Successful operations
- `WARNING`: Recoverable issues
- `ERROR`: Operation failures
- `DEBUG`: Detailed flow information

## 🚀 Future Enhancements

Potential improvements:
1. Offline cart caching
2. Barcode validation
3. Price comparison features
4. Receipt generation
5. Analytics dashboard

## 🔍 APK Analysis Sources

The implementation is based on analysis of:
- `AndroidManifest.xml` - Service definitions
- `Hq/d.java` - Shopping list APIs
- Various APK sources revealing endpoint patterns
- Network traffic analysis from `meijer2.log`

## 📋 Implementation Status

✅ **Complete Features:**
- User eligibility checking
- Trip initialization and management
- Item scanning and cart management
- Checkout finalization
- Error handling and logging
- State synchronization
- Comprehensive testing

✅ **Integration:**
- Fully integrated with `meijer_v2.py`
- Compatible with existing authentication system
- Follows established code patterns
- Comprehensive documentation

## 🎯 Key Achievement

Successfully implemented the exact transaction flow discovered from network analysis:
**Start transaction → Scan 2 items → Finalize checkout**

This implementation provides a complete, production-ready Shop & Scan system that mirrors the Android app's functionality while maintaining the Python client's architecture and design patterns. 