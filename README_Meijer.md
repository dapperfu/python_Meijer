# Meijer API Client

A Python client for interacting with the Meijer API, based on network analysis of the Meijer mobile application.

## Overview

This client provides programmatic access to Meijer services including:
- Authentication and user management
- Offers and coupons retrieval
- Home page content and department information
- Special offers and promotional content

## Features

- **Full Type Hints**: Complete mypy typing support
- **Comprehensive Error Handling**: Custom exceptions for different error types
- **Retry Logic**: Built-in retry mechanism for failed requests
- **Context Manager Support**: Safe resource management with `with` statements
- **Logging**: Built-in logging for debugging and monitoring
- **Session Management**: Efficient HTTP session handling

## Installation

1. Clone this repository
2. Install dependencies:
   ```bash
   pip install -r requirements.txt
   ```

## Usage

### Basic Authentication

```python
from meijer import Meijer

# Create a client instance
meijer = Meijer()

# Login (placeholder implementation)
if meijer.login("username", "password"):
    print("Login successful!")
else:
    print("Login failed!")
```

### Context Manager Usage (Recommended)

```python
from meijer import Meijer

with Meijer() as meijer:
    if meijer.login("username", "password"):
        # Get user information
        user_info = meijer.get_user_info()
        print(f"Digital ID: {user_info['digitalId']}")
        
        # Get offers
        offers = meijer.get_offers()
        print(f"Retrieved {len(offers.get('offers', []))} offers")
        
        # Get home page content
        home_cards = meijer.get_home_cards()
        print(f"Retrieved {len(home_cards.get('cards', []))} home cards")
```

### Available Methods

#### Authentication
- `login(username, password)`: Authenticate with Meijer
- `logout()`: Clear authentication state
- `is_authenticated()`: Check authentication status

#### Data Retrieval
- `get_offers()`: Retrieve offers and coupons
- `get_home_cards()`: Get home page content
- `get_department_carousel()`: Get shopping department information
- `get_special_offers_image()`: Get special offers banner
- `get_coupon_ads()`: Get coupon advertisements
- `get_user_info()`: Get current user information

## API Configuration

The client is configured with the following settings extracted from network analysis:

- **Base URL**: `https://api.meijer.com`
- **Subscription Key**: `a10bc58ac484478d9b3958b1742c3a03`
- **User Agent**: Meijer mobile app user agent string
- **Content Types**: Meijer-specific API content types

## Error Handling

The client provides custom exceptions:

- `MeijerError`: General API errors
- `MeijerAuthenticationError`: Authentication-specific errors

```python
from meijer import Meijer, MeijerError, MeijerAuthenticationError

try:
    with Meijer() as meijer:
        meijer.login("username", "password")
        offers = meijer.get_offers()
except MeijerAuthenticationError as e:
    print(f"Authentication failed: {e}")
except MeijerError as e:
    print(f"API error: {e}")
```

## Network Analysis Details

This client was developed by analyzing network traffic from the Meijer mobile application using mitmproxy. The analysis revealed:

### Key Endpoints
- `/loyalty/mPerks/api/offers` - Offers and coupons
- `/digital/homecards/v1/cards` - Home page content
- `/loyalty/mPerks/api/cms/specialoffers/image` - Special offers
- `/loyalty/mPerks/api/cms/couponads` - Coupon advertisements

### Authentication Flow
The network analysis showed authentication status tracking:
- `authenticationstatus`: unauthenticated/authenticated
- `digitalId`: User's digital identifier
- `externalShopperId`: External shopping identifier
- Store IDs for location-based services

### Headers and Content Types
- `ocp-apim-subscription-key`: Required for API access
- Meijer-specific content types for different API endpoints
- Mobile app user agent and language preferences

## Limitations

⚠️ **Important Notes**:

1. **Login Implementation**: The current login method is a placeholder. The actual Meijer authentication flow may require additional endpoints or steps not captured in the network analysis.

2. **API Changes**: Meijer may change their API endpoints, authentication methods, or content types at any time.

3. **Terms of Service**: Ensure compliance with Meijer's terms of service when using this client.

4. **Rate Limiting**: Be mindful of API rate limits and implement appropriate delays between requests.

## Development

### Running Tests

```bash
python -m pytest tests/
```

### Type Checking

```bash
python -m mypy meijer.py
```

### Code Style

The code follows PEP 8 and includes comprehensive docstrings in NumPy style.

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes with proper typing and documentation
4. Add tests for new functionality
5. Submit a pull request

## License

This project is provided for educational and research purposes. Please ensure compliance with applicable laws and terms of service.

## Disclaimer

This client is not officially affiliated with Meijer. Use at your own risk and ensure compliance with Meijer's terms of service and applicable laws. 