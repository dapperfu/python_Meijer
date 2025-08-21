# Fake Headers Authentication for Meijer

## Overview

The **Fake Headers Authentication** method is a new, experimental authentication approach that bypasses the need for Selenium WebDriver by directly implementing the HTTP requests with proper headers. This method is based on analysis of actual mitmproxy logs from successful Meijer login flows.

## 🎯 Key Benefits

- **No Browser Required**: Pure HTTP requests, no Selenium dependencies
- **Faster Execution**: Direct API calls instead of browser automation
- **More Reliable**: Less prone to UI changes or browser compatibility issues
- **Resource Efficient**: Lower memory and CPU usage
- **Headless by Design**: Perfect for server environments

## 🔍 How It Works

The fake headers method replicates the exact authentication flow captured from real browser sessions:

1. **OAuth2 Authorization Request** - Get the initial login page
2. **IDX Introspect** - Extract state tokens from the response
3. **Device Fingerprint** - Handle bot detection mechanisms
4. **Username Submission** - Submit email/username identifier
5. **Password Challenge** - Submit password credentials
6. **Token Exchange** - Exchange authorization codes for access tokens

## 🚀 Usage

### CLI Command

```bash
# Use fake headers authentication
meijer login --method fake-headers

# With email 2FA support
meijer login --method fake-headers
# (Will prompt for email 2FA if config exists)
```

### Python API

```python
from meijer.enhanced_auth_v2 import authenticate_with_fake_headers

# Basic authentication
tokens = authenticate_with_fake_headers(username, password)

# With email 2FA configuration
tokens = authenticate_with_fake_headers(
    username,
    password,
    email_2fa_config="~/.config/meijer/email.txt"
)
```

### Advanced Usage

```python
from meijer.enhanced_auth_v2 import EnhancedMeijerAuthV2

# Create auth instance
auth = EnhancedMeijerAuthV2(username, password, email_2fa_config)

# Get session details
cookies = auth.get_session_cookies()
headers = auth.get_session_headers()

# Perform authentication
tokens = auth.authenticate()
```

## ⚙️ Configuration

### Email 2FA Setup

For accounts requiring multi-factor authentication, set up email 2FA:

```bash
# Create email configuration template
meijer email-2fa setup

# Test email connection
meijer email-2fa test

# Wait for verification codes
meijer email-2fa wait
```

The email configuration file (`~/.config/meijer/email.txt`) should contain:

```ini
server=imap.gmail.com
port=993
username=your-email@gmail.com
password=your-app-password
use_ssl=true
search_subject=Meijer verification
search_sender=noreply@meijer.com
code_pattern=\b\d{6}\b
```

## 🔧 Technical Details

### Headers Used

The method replicates realistic browser headers:

```python
{
    "User-Agent": "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36...",
    "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9...",
    "Accept-Language": "en-US,en;q=0.9",
    "Accept-Encoding": "gzip, deflate",
    "Upgrade-Insecure-Requests": "1",
    "Sec-Fetch-Site": "none",
    "Sec-Fetch-Mode": "navigate",
    "Sec-Fetch-User": "?1",
    "Sec-Fetch-Dest": "document",
    "Sec-GPC": "1",
    "X-Requested-With": "com.duckduckgo.mobile.android"
}
```

### OAuth2 Parameters

- **Client ID**: `0oa1o8g9njWsUvwsx697`
- **Redirect URI**: `com.meijer.mobile.meijer:/login`
- **Scope**: `openid profile offline_access`
- **Response Type**: `code`
- **Code Challenge Method**: `S256`

### PKCE Implementation

The method implements PKCE (Proof Key for Code Exchange) for enhanced security:

```python
# Generate code verifier and challenge
code_verifier = base64.urlsafe_b64encode(secrets.token_bytes(32))
code_challenge = base64.urlsafe_b64encode(
    hashlib.sha256(code_verifier.encode()).digest()
)
```

## 🧪 Testing

### Test Script

Run the comprehensive test suite:

```bash
python test_fake_headers_auth.py
```

Options:
1. **Full authentication test** - Complete flow test
2. **Step-by-step test** - Debug individual steps
3. **Exit** - Quit the test suite

### Step-by-Step Debugging

```python
auth = EnhancedMeijerAuthV2(username, password)

# Test individual steps
auth._get_oauth_authorization_page()
auth._idx_introspect()
auth._get_device_fingerprint()
auth._submit_identifier()
auth._submit_password()
```

## ⚠️ Limitations & Considerations

### Current Limitations

1. **Device Fingerprinting**: Currently generates fake fingerprints; real implementation would need JavaScript execution
2. **MFA Support**: Only supports email-based 2FA; SMS/authenticator apps not yet implemented
3. **Experimental Status**: This is a new method and may have edge cases

### Security Considerations

1. **Header Replication**: Uses realistic headers to avoid detection
2. **Session Management**: Maintains proper session state throughout the flow
3. **Error Handling**: Graceful fallback to other authentication methods

### Fallback Strategy

If fake headers authentication fails, the system suggests alternatives:

1. Enhanced authentication method
2. Selenium WebDriver method
3. Manual token capture

## 🔄 Comparison with Other Methods

| Method | Browser Required | Speed | Reliability | Resource Usage |
|--------|------------------|-------|-------------|----------------|
| **Fake Headers** | ❌ No | ⚡ Fast | 🔒 High | 💾 Low |
| **Enhanced** | ❌ No | ⚡ Fast | 🔒 High | 💾 Low |
| **Selenium** | ✅ Yes | 🐌 Slow | ⚠️ Medium | 💾 High |

## 🚧 Development Status

- ✅ **Core Flow**: OAuth2 → IDX → Username → Password → Tokens
- ✅ **Header Replication**: Realistic browser headers
- ✅ **PKCE Support**: Secure code exchange
- ✅ **Email 2FA**: Basic MFA support
- 🔄 **Device Fingerprinting**: Fake implementation (needs real JS execution)
- ❌ **SMS 2FA**: Not yet implemented
- ❌ **Authenticator Apps**: Not yet implemented

## 🤝 Contributing

To improve the fake headers authentication method:

1. **Analyze New Logs**: Capture fresh mitmproxy logs for updated flows
2. **Improve Fingerprinting**: Implement real device fingerprint collection
3. **Add MFA Methods**: Support SMS, authenticator apps, etc.
4. **Error Handling**: Better error messages and recovery strategies
5. **Testing**: More comprehensive test coverage

## 📚 Related Documentation

- [Email 2FA Setup](EMAIL_2FA_README.md)
- [Enhanced Authentication](README.md)
- [Selenium Authentication](README.md)
- [CLI Usage](README.md)

## 🆘 Troubleshooting

### Common Issues

1. **"Could not extract state token"**
   - The OAuth page structure may have changed
   - Check if the regex pattern needs updating

2. **"IDX introspect failed"**
   - Network connectivity issues
   - Meijer service may be temporarily unavailable

3. **"Device fingerprint request failed"**
   - Bot detection may be blocking the request
   - Try using enhanced or selenium methods instead

4. **"MFA required but not handled"**
   - Set up email 2FA configuration
   - Or use a different authentication method

### Debug Mode

Enable detailed logging:

```python
import logging
logging.basicConfig(level=logging.DEBUG)
```

### Fallback Commands

```bash
# Try enhanced method
meijer login --method enhanced

# Try selenium method
meijer login --method selenium

# Manual token capture
meijer auth
```

---

**Note**: This authentication method is experimental and based on reverse engineering. Use responsibly and in accordance with Meijer's terms of service.
