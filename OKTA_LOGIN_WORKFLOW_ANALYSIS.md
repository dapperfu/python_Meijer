# Complete Okta Login Workflow Analysis

## Overview
This document analyzes the complete Okta authentication workflow captured in the latest mitmproxy log file (`meijer_mitm_20250821_233419.log`). The analysis reveals the complete flow from device fingerprinting to token acquisition, enabling automated login without requiring packet capture or rooted devices.

## Authentication Flow Summary

### 1. Device Fingerprinting Phase
**Endpoint**: `/_bm/get_params?type=sdk-dci`
- **Purpose**: Initial device identification and Akamai bot protection
- **Parameters**:
  - `starttime`: Unix timestamp (1755833738058)
  - `systemVersion`: Android 10
  - `model`: One (HTC One device)
  - `deviceHardwareType`: qcom
  - `appIdentifier`: com.meijer.mobile.meijer
  - `deviceId`: d9722ea8535ee85f
- **Response**: Returns `serversidesignal` for Akamai challenge

**Endpoint**: `/_sec/sdk_challenge.js`
- **Purpose**: Executes Akamai bot protection challenge
- **Parameters**: Includes the `serversidesignal` from previous step
- **Response**: JavaScript challenge code (obfuscated, ~22KB)
- **Cookies Set**: `_abck`, `ak_bmsc`, `bm_sz`

### 2. OAuth2 Configuration Discovery
**Endpoint**: `/oauth2/default/.well-known/openid-configuration`
- **Purpose**: Discovers OAuth2 endpoints and configuration
- **Response**: OpenID Connect configuration

### 3. OAuth2 Authorization Initiation
**Endpoint**: `/oauth2/default/v1/authorize`
- **Purpose**: Initiates OAuth2 authorization flow
- **Parameters**:
  - `client_id`: 0oa1o8g9njWsUvwsx697
  - `response_type`: code
  - `scope`: openid profile offline_access
  - `redirect_uri`: com.meijer.mobile.meijer:/login
  - `code_challenge`: 8FWCKXeHa6cS08pz-pcFDm6PPjhMrXMbVk3nsAgPJus
  - `code_challenge_method`: S256
  - `state`: 6c0eab56-81eb-45a8-9f51-3d6d3cae8fc9
  - `nonce`: 88531ccf-e592-4df8-8f1f-0c46988327d2
- **Response**: HTML login page containing `stateToken`

### 4. IDX Authentication Flow
**Endpoint**: `/idp/idx/introspect`
- **Purpose**: Initializes IDX authentication session

**Endpoint**: `/auth/services/devicefingerprint`
- **Purpose**: Additional device fingerprinting for Okta

**Endpoint**: `/api/v1/internal/device/nonce`
- **Purpose**: Generates device nonce for authentication

**Endpoint**: `/idp/idx/identify`
- **Purpose**: Username identification step
- **Credentials**: meijer.com@eabi.xyz

**Endpoint**: `/idp/idx/challenge/answer`
- **Purpose**: Password authentication step
- **Credentials**: Default12!@

### 5. Token Acquisition
**Endpoint**: `/login/token/redirect`
- **Purpose**: Redirects to token endpoint with stateToken
- **Parameter**: `stateToken=02.id.2FpdaGhVqBYS9vmPRfff7zVZ_Qckq_ekn-n9TeoS`

**Endpoint**: `/oauth2/default/v1/token`
- **Purpose**: Exchanges authorization code for tokens
- **Method**: POST
- **Response**: Complete token set including:
  - `access_token`: JWT token for API access
  - `refresh_token`: For token renewal
  - `expires_in`: 28800 seconds (8 hours)
  - `token_type`: Bearer
  - `scope`: offline_access profile openid

**Endpoint**: `/oauth2/default/v1/keys`
- **Purpose**: Retrieves public keys for JWT verification
- **Parameter**: `client_id=0oa1o8g9njWsUvwsx697`

## Key Technical Details

### Device Fingerprinting
- **Akamai BMPSDK**: Version 3.3.9
- **Device Profile**: Android 10, HTC One, Qualcomm hardware
- **Unique Identifier**: d9722ea8535ee85f
- **Challenge Response**: Complex JavaScript execution with obfuscated code

### OAuth2 Flow
- **Authorization Code Flow**: Uses PKCE (Proof Key for Code Exchange)
- **Code Challenge**: SHA256 hash of random code verifier
- **State Parameter**: CSRF protection with UUID
- **Nonce**: JWT replay protection

### Token Security
- **Access Token**: JWT format with 8-hour expiration
- **Refresh Token**: Simple string for token renewal
- **Scope**: Includes offline_access for background operations
- **Client ID**: 0oa1o8g9njWsUvwsx697

## Implementation Requirements

### 1. Device Fingerprinting Simulation
```python
def simulate_device_fingerprint():
    device_params = {
        "type": "sdk-dci",
        "starttime": int(time.time() * 1000),
        "systemVersion": "10",
        "model": "One",
        "deviceHardwareType": "qcom",
        "appIdentifier": "com.meijer.mobile.meijer",
        "deviceId": "d9722ea8535ee85f"
    }
    # Execute Akamai challenge
    # Handle JavaScript challenge response
```

### 2. OAuth2 Flow Implementation
```python
def initiate_oauth2_flow():
    # Generate PKCE challenge
    code_verifier = secrets.token_urlsafe(32)
    code_challenge = base64.urlsafe_b64encode(
        hashlib.sha256(code_verifier.encode()).digest()
    ).decode().rstrip('=')
    
    # Initiate authorization
    auth_url = f"{base_url}/oauth2/default/v1/authorize"
    params = {
        "client_id": "0oa1o8g9njWsUvwsx697",
        "response_type": "code",
        "scope": "openid profile offline_access",
        "redirect_uri": "com.meijer.mobile.meijer:/login",
        "code_challenge": code_challenge,
        "code_challenge_method": "S256",
        "state": str(uuid.uuid4()),
        "nonce": str(uuid.uuid4())
    }
```

### 3. IDX Authentication
```python
def authenticate_idx(username, password):
    # Initialize session
    # Execute device fingerprinting
    # Submit username/password
    # Handle authentication challenges
    # Extract stateToken for OAuth2 completion
```

### 4. Token Exchange
```python
def exchange_tokens(auth_code, code_verifier):
    token_url = f"{base_url}/oauth2/default/v1/token"
    data = {
        "grant_type": "authorization_code",
        "client_id": "0oa1o8g9njWsUvwsx697",
        "code": auth_code,
        "code_verifier": code_verifier,
        "redirect_uri": "com.meijer.mobile.meijer:/login"
    }
    # Exchange for access_token, refresh_token
```

## Security Considerations

### 1. Bot Protection
- Akamai BMPSDK challenges must be solved
- Device fingerprinting must be consistent
- JavaScript challenge execution required

### 2. OAuth2 Security
- PKCE prevents authorization code interception
- State parameter prevents CSRF attacks
- Nonce prevents JWT replay attacks

### 3. Token Management
- Access tokens expire in 8 hours
- Refresh tokens enable long-term access
- JWT tokens contain user identity information

## Automation Capabilities

### 1. Stored Credentials
- Username: meijer.com@eabi.xyz
- Password: Default12!@
- No need for manual input

### 2. Token Refresh
- Automatic token renewal using refresh_token
- No need to re-authenticate
- Background operation support

### 3. Device Consistency
- Maintain consistent device fingerprint
- Preserve device ID across sessions
- Handle Akamai challenges automatically

## Conclusion

The complete Okta login workflow has been successfully analyzed and documented. This enables:

1. **Automated Authentication**: Full login without manual intervention
2. **Token Management**: Automatic refresh and renewal
3. **Device Fingerprinting**: Consistent device identification
4. **Security Compliance**: Proper OAuth2 and PKCE implementation

The workflow can be implemented programmatically to provide seamless access to Meijer services while maintaining security standards and avoiding the need for packet capture or rooted devices.

## Files Generated
- `okta_auth_flow_analysis_20250821_235123.json`: Detailed analysis results
- `okta_auth_flows_raw_20250821_235123.json`: Raw authentication flows
- `OKTA_LOGIN_WORKFLOW_ANALYSIS.md`: This comprehensive analysis document
