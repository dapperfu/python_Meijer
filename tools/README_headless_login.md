# Meijer Headless Login Workflow

This directory contains a complete headless authentication system for Meijer that replicates the successful login flows analyzed from mitmproxy logs.

## 🎯 What This Does

The headless login workflow **completely eliminates the need for Selenium** by implementing the exact HTTP request sequence that successful logins use. It's based on real authentication flows captured from working login sessions.

## 🔑 Key Features

- **100% Headless**: No browser required, pure HTTP requests
- **Proxy Support**: Works with mitmproxy for traffic logging
- **Complete OAuth2 Flow**: Implements the full PKCE OAuth2 authentication sequence
- **Device Fingerprinting**: Handles Okta's device fingerprinting requirements
- **Session Management**: Maintains cookies and session state
- **Token Storage**: Saves authentication tokens to `auth.json`

## 📁 Files

- **`headless_login_workflow.py`**: Main login class with complete workflow
- **`test_headless_login.py`**: Test script to demonstrate the workflow
- **`README_headless_login.md`**: This documentation

## 🚀 How to Use

### 1. Basic Usage

```python
from tools.headless_login_workflow import MeijerHeadlessLogin

# Create login instance
login = MeijerHeadlessLogin(
    username="your_email@example.com",
    password="your_password"
)

# Execute complete workflow
success = login.execute_login_workflow()

if success:
    print("Login successful!")
    print(f"Access token: {login.access_token}")
else:
    print("Login failed!")
```

### 2. With Proxy Support

```python
# Configure with mitmproxy for traffic logging
login = MeijerHeadlessLogin(
    username="your_email@example.com",
    password="your_password",
    proxy_host="127.0.0.1",
    proxy_port=8080
)
```

### 3. Command Line Usage

```bash
# Basic login
python tools/headless_login_workflow.py --username your_email --password your_password

# With proxy
python tools/headless_login_workflow.py \
    --username your_email \
    --password your_password \
    --proxy-host 127.0.0.1 \
    --proxy-port 8080
```

### 4. Test the Workflow

```bash
# Test individual steps
python tools/test_headless_login.py
```

## 🔄 Complete Workflow Steps

The headless login implements these exact steps from successful flows:

1. **OAuth2 Authorization** - Generate PKCE parameters and request authorization
2. **Device Fingerprinting** - Load fingerprinting page to establish session
3. **Device Nonce** - Get unique nonce for device identification
4. **Web Login Identify** - Submit username with device fingerprint
5. **Password Challenge** - Submit password with state token
6. **OAuth Keys** - Get public keys for token validation
7. **Token Exchange** - Exchange authorization code for access tokens

## 🍪 Session Management

The workflow automatically handles:
- **Cookies**: Maintains session cookies across requests
- **Headers**: Sets proper User-Agent and security headers
- **State Tokens**: Manages Okta state tokens for multi-step flows
- **Device Nonces**: Handles device fingerprinting requirements

## 🔒 Security Features

- **PKCE OAuth2**: Implements Proof Key for Code Exchange
- **State Validation**: Generates and validates state parameters
- **Nonce Protection**: Uses cryptographically secure nonces
- **Session Isolation**: Each login creates a fresh session

## 📊 Output

Successful logins produce:
- **Access Token**: For API authentication
- **ID Token**: JWT with user identity information
- **Refresh Token**: For token renewal
- **Session Cookies**: For maintaining authenticated state
- **`auth.json`**: File with all authentication data

## 🧪 Testing

The test script validates each step individually:
- Shows request/response details
- Displays generated parameters
- Reports success/failure for each step
- Provides final session information

## ⚠️ Important Notes

1. **MFA Not Supported**: This workflow doesn't handle 2FA/MFA challenges
2. **Rate Limiting**: Includes delays between steps to avoid triggering Akamai
3. **Proxy SSL**: Disables SSL verification when using mitmproxy
4. **Session State**: Each instance maintains its own session state

## 🔍 Debugging

Enable detailed logging:
```python
import logging
logging.basicConfig(level=logging.DEBUG)
```

The workflow logs each step with:
- Request URLs and methods
- Response status codes
- Generated parameters
- Error details

## 🎉 Benefits Over Selenium

- **Faster**: No browser startup time
- **More Reliable**: No UI element dependencies
- **Easier Debugging**: Pure HTTP request/response logs
- **Better Performance**: No rendering overhead
- **Easier Automation**: Can run in headless servers
- **Traffic Logging**: Works seamlessly with mitmproxy

## 🚨 Limitations

- **No MFA Support**: Requires manual 2FA handling
- **Fixed Flow**: Follows exact sequence from successful logs
- **No UI Validation**: Can't verify visual elements
- **Session Dependent**: Requires valid session state

## 🔧 Customization

The workflow can be extended by:
- Adding custom headers
- Modifying request timing
- Implementing MFA handling
- Adding retry logic
- Customizing error handling

## 📈 Performance

Typical login times:
- **Selenium**: 15-30 seconds (browser startup + rendering)
- **Headless**: 5-10 seconds (pure HTTP requests)

## 🎯 Use Cases

Perfect for:
- **API Automation**: Automated coupon loading, shopping lists
- **Background Services**: Scheduled authentication
- **Testing**: CI/CD pipeline authentication
- **Monitoring**: Health checks and status monitoring
- **Data Collection**: Automated data gathering

This headless workflow provides a robust, fast, and reliable alternative to Selenium-based authentication while maintaining full compatibility with Meijer's authentication system.
