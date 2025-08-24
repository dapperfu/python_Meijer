# Hybrid Authentication Analysis for Meijer API

## Problem Statement

The Meijer authentication system was experiencing 403 "Access Denied" errors from Akamai bot detection at the IDX identify step, even with correct headers and authentication parameters.

## Root Cause Analysis

### What We Discovered

1. **Headers weren't the issue** - Fixed `application/json; okta-version=1.0.0` vs `application/ion+json` but still got 403
2. **Akamai blocks at CDN level** - The 403 happens before requests reach the IDX endpoint
3. **Phone app works because it's a real mobile app** - Not because of specific headers
4. **The problem is bot detection, not authentication** - Akamai identifies HTTP requests as automated

### Key Insight

The issue is Akamai's bot detection at the CDN level, not application-level authentication. We need to appear human to Akamai first, then we can use fast requests for the actual authentication.

## Solution: Hybrid Authentication Approach

### Architecture Overview

```
┌─────────────────┐    ┌──────────────────┐    ┌─────────────────┐
│   Selenium      │    │   Cookie/Token   │    │   Requests      │
│   (Firefox)     │───▶│   Extraction     │───▶│   Session       │
│                 │    │                  │    │                 │
│ • Bypass Akamai │    │ • State Token    │    │ • Fast Auth     │
│ • Appear Human  │    │ • Session Cookies│    │ • IDX Identify  │
│ • Load OAuth2   │    │ • User Agent     │    │ • Challenge     │
└─────────────────┘    └──────────────────┘    └─────────────────┘
```

### Step-by-Step Process

#### Step 1: Selenium Bypass
- Use Firefox with Selenium to navigate to OAuth2 page
- Firefox appears human to Akamai (real browser, real user agent)
- Successfully loads the page and bypasses bot detection
- Extract cookies and state token from the session

#### Step 2: Cookie Transfer
- Transfer all cookies from Selenium session to requests session
- Maintain the same user agent and headers
- Preserve the "human" session state

#### Step 3: Fast Authentication
- Use requests session with transferred cookies
- Continue with IDX identify step
- Should work because cookies indicate "human" origin

#### Step 4: Complete Flow
- Continue with challenge answer
- Complete the authentication process
- Maintain speed of requests while bypassing Akamai

## Working Parameters

### OAuth2 Configuration
```python
client_id = "0oa1o8g9njWsUvwsx697"
scope = "openid profile offline_access"
redirect_uri = "com.meijer.mobile.meijer:/login"
```

### Headers Configuration
```python
# Working headers (not ion+json)
'Accept': 'application/json; okta-version=1.0.0'

# User agent from successful mobile flow
'User-Agent': 'Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36'
```

### PKCE Parameters
```python
code_challenge_method = 'S256'
code_verifier = secrets.token_urlsafe(32)
code_challenge = base64.urlsafe_b64encode(
    hashlib.sha256(code_verifier.encode()).digest()
).decode().rstrip('=')
```

## Implementation Files

### 1. `test_hybrid_auth_improved.py`
- **Purpose**: Complete hybrid authentication test
- **Features**: 
  - Selenium bypass with Firefox
  - Cookie extraction and transfer
  - Requests-based authentication continuation
  - Comprehensive logging and error handling

### 2. `test_hybrid_auth.py`
- **Purpose**: Initial hybrid authentication prototype
- **Status**: Basic implementation, needs refinement

### 3. `test_exact_flow_with_session.py`
- **Purpose**: Direct HTTP approach with correct headers
- **Status**: Still gets 403 from Akamai (proves the point)

## Technical Details

### Selenium Configuration
```python
# Firefox options for mitmproxy integration
options.set_preference("network.proxy.type", 1)
options.set_preference("network.proxy.http", "127.0.0.1")
options.set_preference("network.proxy.http_port", 8080)
options.set_preference("network.proxy.ssl", "127.0.0.1")
options.set_preference("network.proxy.ssl_port", 8080)

# Handle mitmproxy certificates
options.set_preference("security.cert_verification.enabled", False)
options.set_preference("security.enterprise_roots.enabled", True)
```

### Cookie Transfer Process
```python
# Extract cookies from Selenium
selenium_cookies = driver.get_cookies()

# Transfer to requests session
for cookie in selenium_cookies:
    session.cookies.set(cookie['name'], cookie['value'], domain=cookie['domain'])
```

### State Token Extraction
```python
# Look for state token in page source
if 'statetoken' in page_source:
    import re
    match = re.search(r'stateToken["\']?\s*:\s*["\']([^"\']+)["\']', page_source)
    if match:
        self.state_token = match.group(1)
```

## Expected Benefits

### 1. **Bypass Akamai Bot Detection**
- Selenium appears as real human user
- Cookies maintain "human" session state
- Requests continue with human credentials

### 2. **Maintain Speed**
- Only initial page load uses Selenium
- Authentication steps use fast requests
- Best of both worlds

### 3. **Reliability**
- Consistent with how real users access the system
- Maintains session state properly
- Handles dynamic content loading

## Testing Strategy

### Phase 1: Basic Hybrid Test
- [x] Selenium bypass of OAuth2 page
- [x] Cookie extraction and transfer
- [x] Basic requests session setup

### Phase 2: Authentication Flow
- [ ] IDX identify step with transferred cookies
- [ ] Challenge answer step
- [ ] Complete authentication flow

### Phase 3: Integration
- [ ] Integrate into main authentication module
- [ ] Error handling and fallbacks
- [ ] Performance optimization

## Potential Challenges

### 1. **Session State Management**
- Ensure cookies maintain proper session state
- Handle session expiration gracefully
- Maintain consistency between Selenium and requests

### 2. **Timing Issues**
- Dynamic content loading in Selenium
- State token extraction timing
- Cookie synchronization

### 3. **Error Handling**
- Selenium failures (browser crashes, etc.)
- Network issues during transfer
- Authentication step failures

## Next Steps

### Immediate Actions
1. **Test the improved hybrid approach** with `test_hybrid_auth_improved.py`
2. **Verify cookie transfer** works correctly
3. **Test IDX identify step** with transferred cookies

### If Successful
1. **Integrate into main authentication flow**
2. **Add error handling and fallbacks**
3. **Optimize for production use**

### If Still Blocked
1. **Investigate what makes Selenium "human" vs requests "bot"**
2. **Analyze additional headers or behaviors**
3. **Consider alternative bypass strategies**

## Conclusion

The hybrid authentication approach represents a strategic solution to the Akamai bot detection problem. By combining the human-like behavior of Selenium with the speed of requests, we can potentially bypass the CDN-level blocking while maintaining efficient authentication.

The key insight is that the problem isn't with our authentication logic or headers - it's with Akamai's bot detection at the CDN level. By appearing human first, then maintaining that "human" session state, we should be able to continue with fast, reliable authentication.

This approach aligns with how real users access the system and should provide a robust, maintainable solution to the authentication challenges.
