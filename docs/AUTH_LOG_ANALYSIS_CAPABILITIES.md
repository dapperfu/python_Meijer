# Meijer Auth Log Analysis Capabilities

## Overview

The `meijer auth log` command has been significantly enhanced to extract comprehensive authentication information from mitmproxy logs. It now captures everything needed for token refresh and provides detailed insights into the authentication flow.

## What Gets Extracted

### 1. OAuth2 Parameters (Essential for Token Refresh)

The analyzer extracts all OAuth2 parameters from the authorization request:

```json
{
  "oauth2_parameters": {
    "client_id": ["0oa1o8g9njWsUvwsx697"],
    "scope": ["openid profile offline_access"],
    "redirect_uri": ["com.meijer.mobile.meijer:/login"],
    "response_type": ["code"],
    "code_challenge": ["5dPI0Wr1E6PAqhv5AHM6w4TpRJfvpfxr73QCyk5UsYw"],
    "code_challenge_method": ["S256"],
    "state": ["ac57b632-1d65-4ab6-a61b-670a658ac30c"],
    "nonce": ["1b743932-4331-4f2e-a6d9-f07c38c4c6a4"]
  }
}
```

**Why this matters for token refresh:**
- **Client ID**: Required to identify the application during token refresh
- **Scope**: Defines what permissions the refreshed tokens will have
- **Code Challenge Method**: Required for PKCE (Proof Key for Code Exchange) flow
- **Redirect URI**: Must match during token refresh

### 2. IDX Workflow Data (Okta Identity Engine)

The analyzer captures the complete Okta IDX workflow:

```json
{
  "idx_workflow": {
    "introspect": { /* workflow initialization data */ },
    "identify": { /* username entry data */ },
    "challenge": { /* 2FA/MFA response data */ }
  }
}
```

**Why this matters:**
- Provides context for understanding the authentication flow
- Helps debug authentication issues
- Shows which MFA methods were used

### 3. Authentication Context

Even when the complete flow isn't captured, the analyzer stores:

```json
{
  "has_auth_context": true,
  "auth_flow_complete": false,
  "username": "meijer.com@eabi.xyz",
  "state_token": "02.id.wX2U1V6VfaIDyBvZhLk8EidN0pPzk_Ein9zYd4JD"
}
```

**Why this matters:**
- Username is preserved for future authentication attempts
- State tokens help track authentication progress
- OAuth2 parameters are available for completing the flow

### 4. Token Information (When Available)

When the complete flow is captured:

```json
{
  "access_token": "actual_bearer_token_here",
  "refresh_token": "refresh_token_for_auto_renewal",
  "id_token": "JWT_identity_token",
  "expires_in": 3600,
  "token_type": "Bearer",
  "scope": "openid profile offline_access"
}
```

## Token Refresh Capabilities

### Full Refresh Capability

When all components are present, the analyzer provides:

✅ **Automatic Token Refresh**: Tokens can be renewed without user intervention
✅ **OAuth2 Flow Context**: All parameters needed to initiate refresh
✅ **Persistent Authentication**: Long-term access without re-login

### Limited Refresh Capability

When only partial information is available:

⚠️ **Manual Renewal Required**: Tokens will expire and need manual refresh
⚠️ **OAuth2 Parameters Available**: Can be used to complete the authentication flow
⚠️ **Context Preserved**: Username and workflow data saved for future use

## Usage Examples

### 1. Complete Login Flow (Recommended)

```bash
# Start mitmproxy capture
mitmproxy -w meijer_mitm_$(date +%s).log

# Complete login in Meijer app (username + password + 2FA)
# Wait for authentication to complete

# Extract tokens with full refresh capability
meijer auth log --mode full
```

**Result**: Full OAuth2 flow with refresh tokens

### 2. Partial Flow Capture

```bash
# Start mitmproxy capture
mitmproxy -w meijer_mitm_$(date +%s).log

# Begin login in Meijer app
# Stop capture before completion

# Extract authentication context
meijer auth log --mode auto
```

**Result**: OAuth2 parameters saved, but manual completion required

### 3. Quick Token Capture

```bash
# Use Meijer app normally
# Keep mitmproxy running

# Extract current bearer token
meijer auth log --mode quick
```

**Result**: Immediate API access, no refresh capability

## Analysis Modes

### Auto Mode (Default)
- Automatically detects best available authentication
- Falls back gracefully between full and quick modes
- Provides detailed analysis of what was found

### Full Mode
- Requires complete OAuth2 login flow
- Captures refresh tokens for auto-renewal
- Best for persistent applications

### Quick Mode
- Captures current bearer tokens
- No refresh capability
- Good for immediate API access

## What Happens When Tokens Expire

### With Full Refresh Capability
1. **Automatic Detection**: Client detects token expiration
2. **Refresh Request**: Uses stored OAuth2 parameters and refresh token
3. **New Tokens**: Automatically obtains new access and refresh tokens
4. **Seamless Operation**: No user intervention required

### Without Refresh Capability
1. **Token Expiration**: API calls start failing
2. **Manual Renewal**: User must re-run `meijer auth log --mode full`
3. **Complete Flow**: Full login sequence required
4. **New Context**: Fresh OAuth2 parameters captured

## Troubleshooting

### Common Issues

1. **"No refresh token found"**
   - Solution: Complete the full login flow
   - Ensure mitmproxy captures the entire authentication sequence

2. **"OAuth2 parameters missing"**
   - Solution: Start capture before beginning login
   - Look for OAuth2 authorization request in logs

3. **"Authentication flow incomplete"**
   - Solution: Keep mitmproxy running until login completes
   - Look for OAuth2 token exchange endpoint

### Best Practices

1. **Start Early**: Begin mitmproxy capture before opening Meijer app
2. **Complete Flow**: Wait for authentication to fully complete
3. **Verify Logs**: Check that OAuth2 token exchange endpoint is captured
4. **Test Tokens**: Use `meijer auth status` to verify token validity

## Technical Details

### OAuth2 Flow Detection

The analyzer looks for these endpoints in sequence:

1. `id.meijer.com/auth/services/devicefingerprint`
2. `id.meijer.com/oauth2/default/v1/authorize`
3. `id.meijer.com/idp/idx/introspect`
4. `id.meijer.com/idp/idx/identify`
5. `id.meijer.com/idp/idx/challenge/answer`
6. `id.meijer.com/login/token/redirect`
7. `id.meijer.com/oauth2/default/v1/token` (final step)

### Token Storage Format

Tokens are saved in the standard Meijer client format:

```json
{
  "access_token": "actual_token_here",
  "refresh_token": "refresh_token_here",
  "token_type": "Bearer",
  "subscription_key": "api_subscription_key",
  "oauth2_parameters": { /* OAuth2 context */ },
  "idx_workflow": { /* Okta workflow data */ },
  "extracted_at": 1756158853.0,
  "source": "oauth2_token_exchange"
}
```

## Conclusion

The enhanced `meijer auth log` command now provides comprehensive authentication analysis and extraction. It captures everything needed for token refresh, including:

- ✅ Complete OAuth2 parameters
- ✅ Okta IDX workflow context
- ✅ Username and authentication state
- ✅ Token refresh capability assessment
- ✅ Detailed validation and recommendations

This ensures that when tokens expire, the system has all the information needed to automatically refresh them, providing seamless and persistent access to the Meijer API.
