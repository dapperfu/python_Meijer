# Meijer Authentication Flow Analysis

## Overview
This document summarizes the exact authentication patterns extracted from mitmproxy logs (`meijer_mitm_20250823_1600.log`) to enable implementation of a fully headless authentication client.

## Authentication Flow Sequence

### 1. Initial Landing
- **URL**: `https://www.meijer.com/`
- **Method**: GET
- **Purpose**: Initial page load to establish session and cookies
- **Key Cookies**: Akamai bot detection cookies (`bm_sz`, `_abck`)

### 2. OAuth2 Authorization Request
- **URL**: `https://id.meijer.com/oauth2/default/v1/authorize`
- **Method**: GET
- **Parameters**:
  - `response_type=code`
  - `client_id=0oa22cbewuCICOsKz697`
  - `scope=openid+offline_access`
  - `state=<generated_state>`
  - `redirect_uri=<meijer_callback>`
- **Purpose**: Initiates OAuth2 flow, redirects to Okta login

### 3. Okta Identity Engine (IDX) Flow

#### 3.1 Username Submission
- **URL**: `https://id.meijer.com/idp/idx/identify`
- **Method**: POST
- **Headers**:
  - `Content-Type: application/ion+json; okta-version=1.0.0`
  - `X-Okta-User-Agent-Extended: okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459`
  - `Origin: https://id.meijer.com`
  - `Referer: https://id.meijer.com/`
- **Body**:
  ```json
  {
    "identifier": "meijer.com@eabi.xyz",
    "stateHandle": "<state_handle_from_previous_step>"
  }
  ```
- **Response**: Returns new `stateHandle` for password challenge

#### 3.2 Password Challenge
- **URL**: `https://id.meijer.com/idp/idx/challenge/answer`
- **Method**: POST
- **Headers**: Same as username submission
- **Body**:
  ```json
  {
    "credentials": {
      "passcode": "Default12!@"
    },
    "stateHandle": "<state_handle_from_identify>"
  }
  ```
- **Response**: Success redirect with authorization code

### 4. OAuth2 Token Exchange
- **URL**: `https://id.meijer.com/oauth2/default/v1/token`
- **Method**: POST
- **Headers**:
  - `Content-Type: application/x-www-form-urlencoded`
- **Body**:
  - `grant_type=authorization_code`
  - `code=<auth_code_from_redirect>`
  - `redirect_uri=<same_as_authorize>`
  - `client_id=<same_as_authorize>`
- **Response**: Access token, refresh token, ID token

### 5. Final Redirect
- **URL**: `https://www.meijer.com/`
- **Method**: GET
- **Purpose**: User lands on authenticated Meijer homepage
- **Key Cookies**: `JSESSIONID`, authenticated session cookies

## Critical Headers and Cookies

### Required Headers
- `User-Agent`: `Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0`
- `Accept`: `application/ion+json; okta-version=1.0.0`
- `Content-Type`: `application/ion+json; okta-version=1.0.0` (for IDX requests)
- `X-Okta-User-Agent-Extended`: `okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459`
- `Origin`: `https://id.meijer.com`
- `Referer`: `https://id.meijer.com/`

### Critical Cookies
- **Akamai Bot Detection**:
  - `bm_sz`: Bot manager session cookie
  - `_abck`: Akamai bot detection cookie
  - `bm_sv`: Bot manager verification cookie
- **Session Cookies**:
  - `JSESSIONID`: Java session identifier
  - `AKA_A2`: Akamai session cookie

### Device Fingerprinting
- **Endpoint**: `https://id.meijer.com/auth/services/devicefingerprint`
- **Purpose**: Generates device fingerprint for bot detection
- **Headers**: May include `X-Device-Fingerprint` header

## State Management

### State Tokens
- **stateToken**: Used in OAuth2 flow for CSRF protection
- **stateHandle**: Used in Okta IDX flow to maintain session state
- **state**: OAuth2 state parameter for request validation

### Flow Progression
1. OAuth2 authorize → returns `stateToken`
2. IDX identify → returns `stateHandle`
3. IDX challenge → uses `stateHandle`, returns success
4. OAuth2 redirect → contains `authorization_code`
5. Token exchange → uses `authorization_code`

## Timing and Delays

Based on the log analysis, the following timing patterns were observed:
- Initial landing to OAuth2: ~1-2 seconds
- OAuth2 to IDX identify: ~1 second
- IDX identify to challenge: ~1 second
- Challenge to redirect: ~1 second
- Total flow time: ~4-6 seconds

## Bot Detection Bypass

### Akamai Protection
- **Cookie Requirements**: Must maintain `bm_sz`, `_abck`, `bm_sv` cookies
- **Header Consistency**: All requests must use consistent headers
- **Session Continuity**: Cookies must be maintained across all requests

### Device Fingerprinting
- **User Agent**: Must be consistent and realistic
- **Headers**: Must include proper Accept and Content-Type headers
- **Origin/Referer**: Must maintain proper referrer chain

## Implementation Requirements

### Pure Requests Method
1. **Session Management**: Maintain cookies across all requests
2. **Header Spoofing**: Replicate exact headers from successful flows
3. **State Tracking**: Extract and pass state tokens between requests
4. **Timing**: Implement appropriate delays between requests
5. **Error Handling**: Handle redirects and state changes properly

### Key Endpoints
- `https://www.meijer.com/` - Initial landing
- `https://id.meijer.com/oauth2/default/v1/authorize` - OAuth2 start
- `https://id.meijer.com/idp/idx/identify` - Username submission
- `https://id.meijer.com/idp/idx/challenge/answer` - Password submission
- `https://id.meijer.com/oauth2/default/v1/token` - Token exchange

### Required Parameters
- **client_id**: `0oa22cbewuCICOsKz697`
- **scope**: `openid offline_access`
- **response_type**: `code`
- **grant_type**: `authorization_code`

## Next Steps

1. **Update HeadlessAuthClient** with exact patterns from this analysis
2. **Implement proper cookie management** for Akamai bypass
3. **Add exact header replication** from successful flows
4. **Test with real credentials** using `~/.config/meijer/login.txt`
5. **Validate against current bot detection** mechanisms

## Files Analyzed

- `logs/meijer_mitm_20250823_1600.log` - Main log file (285.7 MB)
- `complete_auth_sequence.json` - Complete authentication sequence
- `login_2fa_flow_meijer_mitm_20250823_1600.json` - Login and 2FA flow
- `specific_login_event_meijer_mitm_20250823_1600.json` - Specific login event
- `current_log_analysis_meijer_mitm_20250823_1600.json` - Current log analysis

## Conclusion

The analysis reveals a sophisticated OAuth2 + Okta IDX authentication flow with multiple layers of bot detection. Success requires:

1. **Exact header replication** from successful mobile app flows
2. **Proper cookie management** for Akamai and session cookies
3. **State token tracking** across the entire authentication sequence
4. **Realistic timing** between requests
5. **Device fingerprinting** bypass

The pure requests method is feasible but requires meticulous attention to detail in replicating the exact flow patterns observed in successful authentication attempts.
