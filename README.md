# Meijer API Client

A comprehensive Python library for interacting with the Meijer mobile app API, supporting authentication, shopping lists, store data, product search, coupons, and more.

## 🚀 Quick Start

```python
from meijer import Meijer

# Option 1: Automatic authentication (from ~/.config/meijer.txt)
client = Meijer("", "")

# Option 2: Manual Bearer token authentication  
client = Meijer("", "")
client.login_with_oauth_tokens()  # reads from auth.txt

# Use the API
shopping_list = client.get_shopping_list()
stores = client.search_stores("49456")
products = client.search_products("milk")
```

## 📦 Installation

```bash
# Create virtual environment
python -m venv venv
source venv/bin/activate  # Linux/Mac
# or: venv\Scripts\activate  # Windows

# Install dependencies
pip install -r requirements.txt
```

## 🔐 Authentication

### Bearer Token (Recommended)

1. Extract token from mitmproxy logs:
```bash
python extract_bearer_token.py
```

2. Creates `auth.txt`:
```
bearer=eyJraWQiOiJXMmxQc0g5Sy1lTWRo...
refresh_token=pM0rVRS-yk0G8kp95cqD...
user_agent=Meijer/101200000 okhttp/4.12.0...
expires_in=28800
scope=openid offline_access profile
```

3. Use automatically:
```python
client = Meijer("", "")  # Auto-loads from ~/.config/meijer.txt
```

### OAuth Flow

The system supports full OAuth 2.0 with PKCE, but extracting Bearer tokens from mitmproxy is simpler for development.

## 🛍️ Core Features

### Shopping Lists
```python
# Get shopping list
shopping_list = client.get_shopping_list()

# Add item
client.add_to_shopping_list("12345678901")  # UPC code

# Remove item  
client.remove_from_shopping_list(item_id)
```

### Store Search
```python
# Find stores by ZIP code
stores = client.search_stores("49456")

# Get store details
store = client.get_store_details(store_id)

# Get store hours, services, pharmacy info
```

### Product Search
```python
# Search products
products = client.search_products("organic milk")

# Search with filters
products = client.search_products("cereal", store_id="123")

# Paginated results supported
```

### Coupons
```python
# Get available coupons
coupons = client.get_coupons()

# Clip coupon
client.clip_coupon(coupon_id)

# Get clipped coupons
clipped = client.get_clipped_coupons()
```

### mPerks & Loyalty
```python
# Get mPerks data
mperks = client.get_mperks()

# Get transaction history
transactions = client.get_transactions()

# Get points balance
points = client.get_points_balance()
```

## 🔄 Token Management

The system includes automatic token refresh:

- **Valid tokens**: Used without refresh
- **Expiring tokens**: Automatically refreshed (5-minute buffer)
- **Failed refresh**: Gracefully handled, user re-authentication needed
- **Persistent storage**: Tokens saved to `~/.config/meijer.txt`

```python
# Manual token operations
client.clear_config()          # Clear stored tokens
client._refresh_tokens()       # Force refresh
client._check_and_refresh_tokens()  # Check and refresh if needed
```

## 🏪 Store Data

### Store Information
- Store hours and services
- Pharmacy hours
- Department information
- Contact details and address
- Store amenities (pharmacy, grocery pickup, etc.)

### Store Search
- Search by ZIP code, city, or coordinates
- Distance-based results
- Filter by services (24-hour, pharmacy, etc.)

## 🛒 Shopping Features

### Product Search
- Text-based product search
- UPC code lookup
- Category browsing
- Price and availability
- Store-specific inventory

### Shopping Lists
- Create and manage multiple lists
- Add/remove items by UPC or search
- Quantity management
- Cross-device synchronization

## 🎫 Promotions & Savings

### Digital Coupons
- Browse available coupons
- Clip digital coupons to mPerks
- View clipped coupon status
- Automatic application at checkout

### mPerks Rewards
- Points balance and history
- Exclusive member offers
- Personalized deals
- Transaction history

## 🔧 Development Tools

### Demo Scripts
```bash
# Basic functionality
python demo_comprehensive.py

# Store search
python demo_meijer_stores.py

# Product search
python demo_meijer_search.py

# Coupons
python demo_meijer_coupons.py

# Pagination
python demo_pagination.py
```

### Analysis Tools
```bash
# Analyze mitmproxy logs
python mitmproxy_analyzer.py

# Extract Bearer tokens
python extract_bearer_token.py

# Store data analysis
python store_info_analyzer.py

# Coupon analysis
python coupon_analyzer.py
```

### Testing
```bash
# Run all tests
python test_unified.py

# Test specific features
python test_token_refresh.py
python test_shop_scan.py
python test_token_persistence.py
```

## 📁 Project Structure

```
├── meijer.py                 # Main unified API client
├── auth.txt                  # Authentication tokens
├── requirements.txt          # Dependencies
├── demo_*.py                # Demo scripts
├── test_*.py                # Test suites
├── extract_*.py             # Token extraction tools
├── *_analyzer.py            # Log analysis tools
└── old/                     # Legacy implementations
```

## 🐛 Troubleshooting

### Authentication Issues
- **401 Unauthorized**: Token expired, extract fresh token
- **403 Forbidden**: IP blocked, change network/wait
- **Invalid tokens**: Check `auth.txt` format

### Common Errors
- **Network timeouts**: Retry with backoff
- **Rate limiting**: Implement delays between requests
- **Invalid store ID**: Verify store exists and is open

### Token Refresh "Errors"
The 401 errors during token refresh testing are **expected behavior**:
- Current access tokens are still valid (8+ hour expiry)  
- Refresh tokens from logs are expired (single-use)
- System correctly handles this scenario
- Fresh OAuth flows will work perfectly

## 🔒 Security Notes

- Never commit `auth.txt` or Bearer tokens to git
- Tokens are stored in `~/.config/meijer.txt` for persistence
- Use environment variables for production deployments
- Rotate tokens regularly

## 📄 License

MIT License - see LICENSE file

## 🤝 Contributing

1. Fork the repository
2. Create feature branch
3. Follow existing code style
4. Add tests for new features
5. Submit pull request

## 🎯 Current Status

✅ **Fully Functional:**
- Authentication (Bearer token + OAuth)
- Shopping list management  
- Store search and data
- Product search with pagination
- Digital coupons
- mPerks integration
- Automatic token refresh
- Persistent configuration

🔧 **In Development:**
- Enhanced error handling
- More comprehensive testing
- Documentation improvements

---

**Note**: This client reverse-engineers the Meijer mobile app API for educational and personal use. Use responsibly and in accordance with Meijer's terms of service.
