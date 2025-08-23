# Meijer Authenticated Client

## Overview

The Meijer Authenticated Client is a comprehensive solution that handles the complete login and 2FA flow for Meijer.com. It uses a hybrid approach:

1. **Browser Automation** for initial landing and Akamai cookie capture
2. **Requests Library** for the actual authentication sequence

This approach bypasses bot detection while maintaining the security and reliability of the authentication flow.

## 🚀 Features

- **Complete Authentication Flow**: Username → Password → 2FA → Success
- **Akamai Bot Detection Bypass**: Uses real browser for initial cookie capture
- **2FA Support**: Handles email-based 2FA verification
- **Session Management**: Maintains authenticated session for subsequent requests
- **Error Handling**: Comprehensive error handling and logging
- **Context Manager**: Safe resource cleanup with `with` statements
- **Flexible 2FA**: Customizable 2FA code input methods

## 📋 Requirements

### System Requirements
- Python 3.8+
- Firefox browser (for Selenium automation)
- Internet connection

### Python Dependencies
```bash
pip install -r requirements_authenticated.txt
```

### Browser Drivers
The client uses Firefox by default. You can install the geckodriver:

**Ubuntu/Debian:**
```bash
sudo apt-get install firefox-geckodriver
```

**macOS:**
```bash
brew install geckodriver
```

**Windows:**
Download from [Mozilla's geckodriver releases](https://github.com/mozilla/geckodriver/releases)

## 🔧 Installation

1. **Clone the repository:**
```bash
git clone <repository-url>
cd python_Meijer
```

2. **Install dependencies:**
```bash
pip install -r requirements_authenticated.txt
```

3. **Verify Firefox installation:**
```bash
firefox --version
```

## 📖 Usage

### Basic Usage

```python
from meijer.authenticated_client import AuthenticatedMeijerClient

# Create client and authenticate
with AuthenticatedMeijerClient(headless=True) as client:
    # Login with credentials
    success = client.login("your@email.com", "your_password")
    
    if success:
        # Get authenticated session
        session = client.get_session()
        
        # Make authenticated requests
        response = session.get("https://www.meijer.com/account")
        print(f"Account page: {response.status_code}")
```

### With 2FA Callback

```python
def get_2fa_code():
    """Custom 2FA code input method."""
    return input("Enter 2FA code from email: ")

with AuthenticatedMeijerClient() as client:
    success = client.login(
        username="your@email.com",
        password="your_password",
        two_factor_callback=get_2fa_code
    )
```

### Factory Function

```python
from meijer.authenticated_client import create_authenticated_client

# Create and authenticate in one step
client = create_authenticated_client(
    username="your@email.com",
    password="your_password",
    two_factor_callback=lambda: input("2FA code: "),
    headless=True
)

# Use the client
session = client.get_session()
# ... make requests ...

# Clean up
client.logout()
```

### Advanced Usage

```python
# Custom browser timeout
client = AuthenticatedMeijerClient(browser_timeout=60)

# Non-headless mode for debugging
client = AuthenticatedMeijerClient(headless=False)

# Manual session management
client = AuthenticatedMeijerClient()
try:
    client.login("user", "pass")
    session = client.get_session()
    # ... use session ...
finally:
    client.logout()
```

## 🔐 Authentication Flow

The client implements the complete Meijer authentication sequence:

### Phase 1: Initial Landing
1. **Browser Setup**: Initialize Firefox with proper options
2. **Landing Page**: Navigate to `https://www.meijer.com`
3. **Cookie Capture**: Wait for Akamai bot detection cookies
4. **Verification**: Ensure critical cookies are present

### Phase 2: Username Submission
1. **Identify Request**: POST to `/idp/idx/identify`
2. **State Capture**: Extract Okta state handle
3. **Cookie Management**: Maintain Akamai cookies

### Phase 3: Password Challenge
1. **Password Request**: POST to `/idp/idx/challenge/answer`
2. **Session Update**: Update JSESSIONID if provided
3. **2FA Check**: Determine if 2FA is required

### Phase 4: 2FA Verification (if required)
1. **Challenge Initiation**: POST to `/idp/idx/challenge`
2. **Code Input**: Get verification code from user
3. **Verification**: POST to `/idp/idx/challenge/answer`
4. **Success Check**: Verify authentication completion

## 🍪 Cookie Management

The client automatically manages critical cookies:

### Akamai Bot Detection
- `ak_bmsc`: Bot management session cookie
- `_abck`: Bot detection cookie
- `bm_sz`: Bot management size cookie
- `bm_sv`: Bot management session validation

### Session Cookies
- `JSESSIONID`: Okta session identifier
- Various domain-specific cookies

### Cookie Persistence
- Cookies are automatically maintained across requests
- Session cookies are updated as needed
- Domain-specific cookie handling

## 🛡️ Security Features

- **HTTPS Only**: All requests use HTTPS
- **Secure Cookies**: Proper cookie security flags
- **Header Spoofing**: Realistic browser headers
- **Session Isolation**: Separate sessions for different phases
- **State Management**: Proper Okta state handle handling

## 📝 Configuration

### Environment Variables
```bash
export MEIJER_USERNAME="your@email.com"
export MEIJER_PASSWORD="your_password"
```

### Client Options
```python
client = AuthenticatedMeijerClient(
    headless=True,           # Run browser in background
    browser_timeout=30       # Browser operation timeout
)
```

## 🚨 Error Handling

The client provides comprehensive error handling:

### Authentication Errors
- `AuthenticationError`: General authentication failures
- `TwoFactorRequiredError`: 2FA is required to continue

### Browser Errors
- `WebDriverException`: Browser initialization failures
- `TimeoutException`: Operation timeouts

### Usage Examples
```python
try:
    with AuthenticatedMeijerClient() as client:
        client.login("user", "pass")
except TwoFactorRequiredError:
    print("2FA required - implement callback")
except AuthenticationError as e:
    print(f"Authentication failed: {e}")
except Exception as e:
    print(f"Unexpected error: {e}")
```

## 🔍 Debugging

### Enable Debug Logging
```python
import logging
logging.basicConfig(level=logging.DEBUG)
```

### Non-Headless Mode
```python
client = AuthenticatedMeijerClient(headless=False)
# Browser will be visible for debugging
```

### Cookie Inspection
```python
session = client.get_session()
for cookie in session.cookies:
    print(f"{cookie.name}: {cookie.value}")
```

## 📊 Performance

### Typical Timings
- **Browser Setup**: 2-5 seconds
- **Landing Page**: 3-8 seconds
- **Username Submission**: 1-3 seconds
- **Password Challenge**: 1-3 seconds
- **2FA Setup**: 1-2 seconds
- **2FA Verification**: 1-3 seconds

### Optimization Tips
- Use headless mode for production
- Implement proper timeout handling
- Cache cookies when possible
- Use connection pooling for requests

## 🧪 Testing

### Run Demo
```bash
python demos/demo_authenticated_client.py
```

### Test Scenarios
1. **Valid Credentials**: Complete authentication flow
2. **Invalid Credentials**: Error handling
3. **2FA Required**: 2FA flow testing
4. **Network Issues**: Timeout handling
5. **Browser Issues**: Driver error handling

## 🤝 Contributing

### Development Setup
1. Install development dependencies
2. Set up pre-commit hooks
3. Follow coding standards
4. Add comprehensive tests

### Code Style
- Follow PEP 8
- Use type hints
- Add docstrings
- Handle exceptions properly

## 📄 License

This project is licensed under the same terms as the main repository.

## 🆘 Support

### Common Issues
1. **Firefox not found**: Install Firefox and geckodriver
2. **Cookie capture fails**: Check network connectivity
3. **2FA timeout**: Implement proper callback handling
4. **Session expired**: Re-authenticate when needed

### Getting Help
1. Check the logs for detailed error messages
2. Verify browser and driver installation
3. Test with non-headless mode
4. Review the authentication flow documentation

---

*For more information, see the main project documentation and the authentication flow analysis.*
