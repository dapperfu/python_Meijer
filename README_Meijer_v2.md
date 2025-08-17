# Meijer API Client v2 - Full Featured Implementation

A comprehensive Python client for interacting with the Meijer API, built with proper OOP design and full feature coverage. This client implements the actual OAuth 2.0 authentication flow discovered through network analysis using mitmproxy.

## 🚀 Features

### **OAuth 2.0 Authentication**
- **PKCE (Proof Key for Code Exchange)** implementation for secure authentication
- **Interactive authentication** with browser-based OAuth flow
- **Token management** with automatic refresh capabilities
- **Secure credential storage** in plain text files

### **Comprehensive API Coverage**
- **Offers & Coupons** - Retrieve and manage mPerks offers
- **Home Content** - Access personalized home page content
- **Special Offers** - Get promotional and special offers
- **Store Information** - Find nearby Meijer locations
- **User Profile** - Access account information and preferences

### **Enterprise-Grade Design**
- **Full Type Hints** - Complete mypy typing support
- **Comprehensive Error Handling** - Custom exceptions for different error types
- **Retry Logic** - Built-in retry mechanism for failed requests
- **Context Manager Support** - Safe resource management with `with` statements
- **Logging** - Built-in logging for debugging and monitoring
- **Session Management** - Efficient HTTP session handling

## 📋 Requirements

- Python 3.8+
- requests>=2.31.0
- urllib3>=2.0.0

## 🛠️ Installation

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd python_Meijer
   ```

2. **Install dependencies:**
   ```bash
   pip install -r requirements.txt
   ```

3. **Create authentication file:**
   ```bash
   # Create auth.txt file
   echo "username=your_meijer_email@example.com" > auth.txt
   echo "password=your_meijer_password" >> auth.txt
   ```

## 🔐 Authentication

### **OAuth 2.0 Flow (Recommended)**

The client implements the actual OAuth 2.0 flow used by the Meijer mobile app:

```python
from meijer_v2 import Meijer

# Create client
meijer = Meijer()

# Generate OAuth authorization URL
auth_url = meijer.get_authorization_url()
print(f"Visit: {auth_url}")

# Complete authentication with authorization code
# (You'll need to extract this from the redirect)
if meijer.authenticate_with_code("your_auth_code"):
    print("Authentication successful!")
```

### **Interactive Authentication**

For development and testing, you can use interactive authentication:

```python
# This will open a browser for user authentication
if meijer.authenticate_interactive():
    print("Interactive authentication completed!")
```

### **Credential-Based Authentication**

For backward compatibility, you can use stored credentials:

```python
# Login using auth.txt file
if meijer.login():
    print("Login successful!")
```

## 🚀 Usage Examples

### **Basic Usage**

```python
from meijer_v2 import Meijer

# Create client with context manager
with Meijer(debug=True) as meijer:
    # Login
    if meijer.login():
        print("Authenticated!")
        
        # Get offers
        offers = meijer.get_offers(limit=10)
        print(f"Found {len(offers)} offers")
        
        # Get user info
        user = meijer.get_user_info()
        if user:
            print(f"Welcome, {user.first_name}!")
```

### **Advanced Usage**

```python
from meijer_v2 import Meijer, MeijerError

meijer = Meijer(debug=True)

try:
    # Ensure authentication
    if meijer.ensure_authenticated():
        # Get session information
        session_info = meijer.get_session_info()
        print(f"Session status: {session_info['authentication_status']}")
        
        # Get various data
        offers = meijer.get_offers(limit=20, offset=0)
        home_cards = meijer.get_home_cards()
        special_offers = meijer.get_special_offers()
        stores = meijer.get_stores(radius=25)
        
        print(f"Retrieved {len(offers)} offers, {len(home_cards)} home cards")
        print(f"{len(special_offers)} special offers, {len(stores)} stores")
        
    else:
        print("Authentication failed")
        
except MeijerError as e:
    print(f"Meijer error: {e}")
except Exception as e:
    print(f"Unexpected error: {e}")
finally:
    meijer.logout()
```

### **Token Management**

```python
# Check token status
if meijer.auth_tokens:
    print(f"Token expires in: {meijer.auth_tokens.expires_in} seconds")
    print(f"Needs refresh: {meijer.auth_tokens.needs_refresh()}")
    
    # Manual token refresh
    if meijer.refresh_token():
        print("Token refreshed successfully!")
```

## 🔧 Configuration

### **Client Options**

```python
meijer = Meijer(
    auth_file="auth.txt",      # Path to credentials file
    debug=True,                # Enable debug logging
    max_retries=3,            # Maximum retry attempts
    timeout=30                # Request timeout in seconds
)
```

### **OAuth Configuration**

The client uses the actual Meijer OAuth configuration:

- **Client ID**: `0oa1o8g9njWsUvwsx697`
- **Auth URL**: `https://id.meijer.com/oauth2/default/v1/authorize`
- **Token URL**: `https://id.meijer.com/oauth2/default/v1/token`
- **Scope**: `openid profile offline_access`
- **Redirect URI**: `com.meijer.mobile.meijer:/login`

## 📚 API Reference

### **Core Methods**

| Method | Description |
|--------|-------------|
| `login()` | Authenticate using stored credentials |
| `authenticate_interactive()` | Open browser for OAuth authentication |
| `authenticate_with_code(code)` | Complete OAuth with authorization code |
| `refresh_token()` | Refresh access token |
| `logout()` | Clear authentication state |
| `ensure_authenticated()` | Ensure valid authentication |

### **Data Retrieval Methods**

| Method | Description |
|--------|-------------|
| `get_offers(limit, offset)` | Get mPerks offers |
| `get_home_cards()` | Get home page content |
| `get_special_offers()` | Get promotional offers |
| `get_stores(zip_code, radius)` | Find nearby stores |
| `get_user_info()` | Get account information |

### **Utility Methods**

| Method | Description |
|--------|-------------|
| `get_session_info()` | Get current session details |
| `is_authenticated()` | Check authentication status |
| `get_authorization_url()` | Generate OAuth URL |

## 🧪 Testing

### **Run Comprehensive Tests**

```bash
python3 test_meijer_v2.py
```

### **Run Simple Demo**

```bash
python3 demo_meijer_v2.py
```

### **Test OAuth Flow**

```bash
python3 -c "
from meijer_v2 import Meijer
m = Meijer()
print('OAuth URL:', m.get_authorization_url()[:100] + '...')
"
```

## 🔍 Network Analysis

This client was developed by analyzing the actual network traffic from the Meijer mobile application using mitmproxy. The analysis revealed:

### **Authentication Flow**
1. **OAuth 2.0 with PKCE** - Secure authentication using Okta
2. **Bearer Token** - JWT-based access tokens
3. **Automatic Refresh** - Seamless token renewal

### **API Structure**
- **Base URL**: `https://api.meijer.com`
- **Required Header**: `ocp-apim-subscription-key: a10bc58ac484478d9b3958b1742c3a03`
- **Content Types**: Meijer-specific content types for different endpoints

### **Key Endpoints**
- `/loyalty/mPerks/api/offers` - Offers and coupons
- `/digital/homecards/v1/cards` - Home page content
- `/loyalty/mPerks/api/cms/specialoffers/image` - Special offers
- `/stores` - Store locations and information

## 🚨 Security Considerations

### **Credential Storage**
- Store credentials in `auth.txt` with restricted permissions
- Never commit credentials to version control
- Consider using environment variables for production

### **Token Security**
- Access tokens are automatically managed
- Refresh tokens are securely stored in memory
- All tokens are cleared on logout

### **Network Security**
- Uses HTTPS for all API communications
- Implements proper OAuth 2.0 security practices
- PKCE prevents authorization code interception

## 🐛 Troubleshooting

### **Common Issues**

1. **Authentication Failed**
   - Verify credentials in `auth.txt`
   - Check network connectivity
   - Ensure OAuth endpoints are accessible

2. **Token Expired**
   - Tokens refresh automatically
   - Use `ensure_authenticated()` before API calls
   - Check `refresh_token()` for manual refresh

3. **API Errors**
   - Verify subscription key is valid
   - Check rate limiting
   - Review error logs for details

### **Debug Mode**

Enable debug logging for detailed information:

```python
meijer = Meijer(debug=True)
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests for new functionality
5. Submit a pull request

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## ⚠️ Disclaimer

This client is for educational and development purposes. Please ensure compliance with Meijer's terms of service and API usage policies. The developers are not responsible for any misuse of this software.

## 🔗 Related Projects

- **mitmproxy_analyzer.py** - Network traffic analysis tool
- **meijer_v2.py** - Full-featured API client
- **test_meijer_v2.py** - Comprehensive test suite
- **demo_meijer_v2.py** - Simple usage examples

---

**Built with ❤️ using mitmproxy network analysis and OAuth 2.0 best practices** 