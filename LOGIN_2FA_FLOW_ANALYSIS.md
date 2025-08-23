# Complete Meijer Login & 2FA Flow Analysis

## Overview
This document analyzes the complete authentication sequence captured from a browser login to Meijer.com, including the full 2FA email verification flow.

## 🔍 Authentication Sequence Summary

The log captured a complete browser-based login sequence with the following events:

### 1. Username Submission (Position: 2,089,582)
- **Endpoint**: `POST /idp/idx/identify`
- **Domain**: `id.meijer.com`
- **Username**: `meijer.com@eabi.xyz`
- **State Handle**: Encrypted Okta state token
- **Key Cookies Set**:
  - `bm_sz` (Akamai bot detection)
  - Various Akamai timing cookies

### 2. Password Submission (Position: 2,107,275)
- **Endpoint**: `POST /idp/idx/challenge/answer`
- **Domain**: `id.meijer.com`
- **Password**: `Default12!@`
- **JSESSIONID**: `85F57BAE60488D0AF685BD992350E8FB`
- **Key Cookies Set**:
  - `bm_sv` (Akamai session validation)
  - `JSESSIONID` (Okta session)

### 3. 2FA Challenge Initiation (Position: 2,122,370)
- **Endpoint**: `POST /idp/idx/challenge`
- **Domain**: `id.meijer.com`
- **Authenticator ID**: `autemxo1fycYCYXWM696`
- **JSESSIONID**: `D4370DDA45901AFDF4E8A89AF4A594DD`
- **New State Handle**: Encrypted Okta state token

### 4. 2FA Email Challenge (Position: 2,137,726)
- **Endpoint**: `POST /idp/idx/challenge`
- **Domain**: `id.meijer.com`
- **Method Type**: `email`
- **Authenticator ID**: `autemxo1fycYCYXWM696`
- **Key Cookies Set**:
  - `ak_bmsc` (Akamai bot management)
  - `JSESSIONID` maintained

### 5. 2FA Verification Submission (Position: 2,137,802)
- **Endpoint**: `POST /idp/idx/challenge`
- **Domain**: `id.meijer.com`
- **Content**: Email verification code submission

## 🍪 Critical Cookies & Headers

### Session Cookies
- **JSESSIONID**: Primary Okta session identifier
  - `85F57BAE60488D0AF685BD992350E8FB` (Username/Password phase)
  - `D4370DDA45901AFDF4E8A89AF4A594DD` (2FA phase)

### Akamai Bot Detection Cookies
- **`bm_sz`**: Bot management size cookie
- **`bm_sv`**: Bot management session validation
- **`ak_bmsc`**: Akamai bot management session cookie
- **`_abck`**: Akamai bot detection cookie

### Security Headers
- **User-Agent**: `Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0`
- **X-Device-Fingerprint**: Device identification token
- **X-Okta-User-Agent-Extended**: Okta authentication library version
- **Content-Security-Policy**: Frame ancestors restriction to `*.meijer.com`

## 🔐 Authentication Flow Analysis

### Phase 1: Username Submission
1. Browser lands on Meijer.com
2. Redirected to `id.meijer.com` for authentication
3. Username submitted to `/idp/idx/identify`
4. Akamai bot detection cookies set
5. Okta state handle generated

### Phase 2: Password Challenge
1. Password submitted to `/idp/idx/challenge/answer`
2. New JSESSIONID issued
3. Additional Akamai validation cookies set
4. Authentication state progresses

### Phase 3: 2FA Setup
1. 2FA challenge initiated via `/idp/idx/challenge`
2. Email method selected
3. New JSESSIONID issued for 2FA phase
4. State handle updated

### Phase 4: 2FA Email Verification
1. Email challenge sent to user
2. User submits verification code
3. Final authentication completed
4. Session established with Meijer.com

## 🚀 Implementation Strategy

### For Requests-Based Authentication
1. **Initial Landing**: Navigate to Meijer.com landing page
2. **Bot Detection**: Allow JavaScript to run and capture Akamai cookies
3. **Username Submission**: POST to `/idp/idx/identify` with captured cookies
4. **Password Submission**: POST to `/idp/idx/challenge/answer` with new JSESSIONID
5. **2FA Challenge**: POST to `/idp/idx/challenge` to initiate email verification
6. **2FA Verification**: POST to `/idp/idx/challenge` with email code

### Critical Headers to Maintain
- **Cookie**: All Akamai and JSESSIONID cookies
- **User-Agent**: Firefox browser string
- **X-Device-Fingerprint**: Device identification
- **Origin**: `https://id.meijer.com`
- **Referer**: Proper referrer chain

### Cookie Management
- **JSESSIONID**: Must be updated after each phase
- **Akamai Cookies**: Critical for bot detection bypass
- **State Handles**: Encrypted Okta tokens that must be preserved

## 📊 Technical Details

### Log File
- **File**: `logs/meijer_mitm_20250823_1600.log`
- **Size**: 55.9 MB
- **Format**: Binary mitmproxy log
- **Browser**: Firefox 141.0 on Linux

### Authentication Endpoints
- **Identify**: `/idp/idx/identify`
- **Challenge**: `/idp/idx/challenge`
- **Challenge Answer**: `/idp/idx/challenge/answer`

### Security Features
- **HTTPS Only**: All endpoints use HTTPS
- **HSTS**: Strict Transport Security enabled
- **CSP**: Content Security Policy restricts frame embedding
- **Secure Cookies**: All cookies marked as Secure and HttpOnly

## 🎯 Key Insights

1. **Browser Required**: The authentication flow requires a real browser to handle JavaScript bot detection
2. **Cookie Chain**: Each phase generates new cookies that must be maintained
3. **State Management**: Okta uses encrypted state handles that must be preserved
4. **Akamai Integration**: Bot detection is tightly integrated with the authentication flow
5. **Session Isolation**: Different JSESSIONIDs for different authentication phases

## 🔧 Next Steps

1. **Implement Browser Automation**: Use Selenium/Playwright to handle the JavaScript execution
2. **Cookie Management**: Implement proper cookie handling for each phase
3. **State Preservation**: Maintain Okta state handles throughout the flow
4. **Error Handling**: Handle various challenge types and error responses
5. **Session Persistence**: Implement proper session management after authentication

---

*Analysis generated from mitmproxy log: `logs/meijer_mitm_20250823_1600.log`*
*Generated on: August 23, 2025*
*Tool: Cursor AI with Claude 3.5 Sonnet*
