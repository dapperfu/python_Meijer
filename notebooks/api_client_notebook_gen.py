#!/usr/bin/env python3
"""
Generate Jupyter notebook for Meijer api_client.py

This script creates a comprehensive notebook demonstrating all API client classes
and their usage with practical examples.
"""

import nbformat as nbf

def create_api_client_notebook():
    """Create the api_client notebook."""
    
    # Create notebook
    nb = nbf.v4.new_notebook()
    
    # Title and description
    title_cell = nbf.v4.new_markdown_cell("""# Meijer API Client

This notebook demonstrates the secure API client for interacting with the Meijer API using OAuth 2.0 PKCE authentication flow.

## Overview

The `api_client.py` module provides a comprehensive client for secure Meijer API integration, implementing OAuth 2.0 PKCE flow and providing methods for authenticated API requests.

## Key Components

- **MeijerAuthConfig**: Configuration for OAuth authentication
- **MeijerTokens**: Container for authentication tokens with expiration management
- **MeijerAPIClient**: Main client class with OAuth flow and API methods
- **Utility Functions**: Environment variable management for tokens

## Security Features

- **OAuth 2.0 PKCE**: Secure authentication flow
- **Token Management**: Automatic token refresh and validation
- **Secure Storage**: Environment variable support for sensitive data
- **CSRF Protection**: State parameter for security

## Setup

First, let's import the necessary modules:
""")
    
    # Import cell
    import_cell = nbf.v4.new_code_cell("""# Import the API client classes
from meijer.api_client import (
    MeijerAuthConfig,
    MeijerTokens,
    MeijerAPIClient,
    load_tokens_from_env,
    save_tokens_to_env
)

# Import additional utilities
import os
import time
import base64
import hashlib
import secrets
from typing import Dict, Any, Optional
from datetime import datetime

print("✅ All API client classes imported successfully!")
print("Available components:")
print("  - MeijerAuthConfig")
print("  - MeijerTokens")
print("  - MeijerAPIClient")
print("  - load_tokens_from_env")
print("  - save_tokens_to_env")""")
    
    # MeijerAuthConfig section
    auth_config_section = nbf.v4.new_markdown_cell("""## MeijerAuthConfig Class

The `MeijerAuthConfig` class contains all the configuration needed for OAuth authentication with the Meijer API.

### Key Features

- **OAuth Endpoints**: Authorization and token exchange URLs
- **Client Configuration**: Client ID, redirect URI, and scopes
- **API Base URLs**: Different API endpoints for various services
- **Default Values**: Pre-configured with Meijer's OAuth settings

### Configuration Details
""")
    
    auth_config_example = nbf.v4.new_code_cell("""# MeijerAuthConfig usage
# Create default configuration
default_config = MeijerAuthConfig()

print("🔧 Default MeijerAuthConfig:")
print("=" * 40)
print(f"Auth URL: {default_config.auth_url}")
print(f"Token URL: {default_config.token_url}")
print(f"Client ID: {default_config.client_id}")
print(f"Redirect URI: {default_config.redirect_uri}")
print(f"Scopes: {default_config.scopes}")
print(f"API Base: {default_config.api_base}")
print(f"Digital Base: {default_config.digital_base}")
print(f"Loyalty Base: {default_config.loyalty_base}")

# Create custom configuration
custom_config = MeijerAuthConfig(
    client_id="custom_client_id",
    redirect_uri="com.custom.app://callback",
    scopes="openid profile offline_access custom_scope"
)

print(f"\\n🔧 Custom MeijerAuthConfig:")
print("=" * 40)
print(f"Client ID: {custom_config.client_id}")
print(f"Redirect URI: {custom_config.redirect_uri}")
print(f"Scopes: {custom_config.scopes}")

# Configuration validation
print(f"\\n✅ Configuration Validation:")
print("=" * 30)
print(f"Auth URL is HTTPS: {default_config.auth_url.startswith('https://')}")
print(f"Token URL is HTTPS: {default_config.token_url.startswith('https://')}")
print(f"API Base is HTTPS: {default_config.api_base.startswith('https://')}")
print(f"Client ID format: {len(default_config.client_id)} characters")
print(f"Scopes contain required: {'openid' in default_config.scopes}")

# URL structure analysis
print(f"\\n🔗 URL Structure Analysis:")
print("=" * 30)
print(f"Authorization endpoint: {default_config.auth_url}")
print(f"Token endpoint: {default_config.token_url}")
print(f"API endpoints:")
print(f"  - Main API: {default_config.api_base}")
print(f"  - Digital: {default_config.digital_base}")
print(f"  - Loyalty: {default_config.loyalty_base}")""")
    
    # MeijerTokens section
    meijer_tokens_section = nbf.v4.new_markdown_cell("""## MeijerTokens Class

The `MeijerTokens` class manages authentication tokens with automatic expiration handling and refresh logic.

### Key Features

- **Token Storage**: Access token, refresh token, and ID token
- **Expiration Management**: Automatic expiration calculation and checking
- **Refresh Logic**: Smart refresh timing with buffer periods
- **Type Safety**: Proper typing for all token fields

### Token Management
""")
    
    meijer_tokens_example = nbf.v4.new_code_cell("""# MeijerTokens usage
# Create sample tokens
sample_tokens = MeijerTokens(
    access_token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.sample.access.token.12345",
    refresh_token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.sample.refresh.token.67890",
    id_token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.sample.id.token.abcdef",
    expires_in=3600,  # 1 hour
    token_type="Bearer"
)

print("🔑 MeijerTokens Created:")
print("=" * 30)
print(f"Access Token: {sample_tokens.access_token[:30]}...")
print(f"Refresh Token: {sample_tokens.refresh_token[:30]}...")
print(f"ID Token: {sample_tokens.id_token[:30]}...")
print(f"Expires In: {sample_tokens.expires_in} seconds")
print(f"Token Type: {sample_tokens.token_type}")
print(f"Expires At: {datetime.fromtimestamp(sample_tokens.expires_at)}")

# Test expiration logic
print(f"\\n⏰ Token Expiration Testing:")
print("=" * 30)

# Check current status
current_time = time.time()
time_until_expiry = sample_tokens.expires_at - current_time

print(f"Current Time: {datetime.fromtimestamp(current_time)}")
print(f"Expires At: {datetime.fromtimestamp(sample_tokens.expires_at)}")
print(f"Time Until Expiry: {time_until_expiry:.0f} seconds")
print(f"Is Expired: {sample_tokens.is_expired()}")
print(f"Needs Refresh (5 min buffer): {sample_tokens.needs_refresh(300)}")
print(f"Needs Refresh (1 hour buffer): {sample_tokens.needs_refresh(3600)}")

# Test with expired tokens
expired_tokens = MeijerTokens(
    access_token="expired_token",
    refresh_token="expired_refresh",
    id_token="expired_id",
    expires_in=-3600,  # Expired 1 hour ago
    token_type="Bearer"
)

print(f"\\n⏰ Expired Token Testing:")
print("=" * 30)
print(f"Is Expired: {expired_tokens.is_expired()}")
print(f"Needs Refresh: {expired_tokens.needs_refresh()}")
print(f"Expires At: {datetime.fromtimestamp(expired_tokens.expires_at)}")

# Test with tokens expiring soon
expiring_soon_tokens = MeijerTokens(
    access_token="expiring_soon_token",
    refresh_token="expiring_soon_refresh",
    id_token="expiring_soon_id",
    expires_in=300,  # Expires in 5 minutes
    token_type="Bearer"
)

print(f"\\n⏰ Expiring Soon Token Testing:")
print("=" * 30)
print(f"Is Expired: {expiring_soon_tokens.is_expired()}")
print(f"Needs Refresh (5 min buffer): {expiring_soon_tokens.needs_refresh(300)}")
print(f"Needs Refresh (1 min buffer): {expiring_soon_tokens.needs_refresh(60)}")
print(f"Needs Refresh (10 min buffer): {expiring_soon_tokens.needs_refresh(600)}")

# Token format validation
print(f"\\n🔍 Token Format Analysis:")
print("=" * 30)
print(f"Access Token Format: {sample_tokens.access_token[:20]}...")
print(f"Refresh Token Format: {sample_tokens.refresh_token[:20]}...")
print(f"ID Token Format: {sample_tokens.id_token[:20]}...")

# Check JWT structure (basic validation)
def analyze_jwt_structure(token: str) -> Dict[str, Any]:
    \"\"\"Basic JWT structure analysis.\"\"\"
    parts = token.split('.')
    return {
        'total_parts': len(parts),
        'header_length': len(parts[0]) if len(parts) > 0 else 0,
        'payload_length': len(parts[1]) if len(parts) > 1 else 0,
        'signature_length': len(parts[2]) if len(parts) > 2 else 0,
        'is_valid_format': len(parts) == 3
    }

print(f"\\n🔍 JWT Structure Analysis:")
for token_name, token_value in [
    ("Access Token", sample_tokens.access_token),
    ("Refresh Token", sample_tokens.refresh_token),
    ("ID Token", sample_tokens.id_token)
]:
    analysis = analyze_jwt_structure(token_value)
    print(f"{token_name}:")
    for key, value in analysis.items():
        print(f"  {key}: {value}")""")
    
    # MeijerAPIClient section
    api_client_section = nbf.v4.new_markdown_cell("""## MeijerAPIClient Class

The `MeijerAPIClient` class is the main client for interacting with the Meijer API. It implements OAuth 2.0 PKCE flow and provides authenticated API methods.

### Key Features

- **OAuth 2.0 PKCE**: Secure authentication flow
- **Automatic Token Management**: Refresh tokens when needed
- **Session Management**: Persistent HTTP session with proper headers
- **API Methods**: Pre-built methods for common API endpoints
- **Error Handling**: Proper exception handling for API failures

### Client Initialization
""")
    
    api_client_example = nbf.v4.new_code_cell("""# MeijerAPIClient usage
# Create API client with default configuration
client = MeijerAPIClient()

print("🚀 MeijerAPIClient Created:")
print("=" * 35)
print(f"Client Type: {type(client).__name__}")
print(f"Config: {type(client.config).__name__}")
print(f"Tokens: {client.tokens}")
print(f"Session: {type(client.session).__name__}")

# Examine session headers
print(f"\\n📋 Session Headers:")
print("=" * 20)
for header_name, header_value in client.session.headers.items():
    print(f"{header_name}: {header_value}")

# Examine configuration
print(f"\\n🔧 Client Configuration:")
print("=" * 30)
print(f"Auth URL: {client.config.auth_url}")
print(f"Token URL: {client.config.token_url}")
print(f"Client ID: {client.config.client_id}")
print(f"Redirect URI: {client.config.redirect_uri}")
print(f"Scopes: {client.config.scopes}")
print(f"API Base: {client.config.api_base}")

# Test PKCE challenge generation
print(f"\\n🔐 PKCE Challenge Generation:")
print("=" * 35)

try:
    code_verifier, code_challenge = client.generate_pkce_challenge()
    print(f"Code Verifier: {code_verifier[:20]}...")
    print(f"Code Challenge: {code_challenge[:20]}...")
    print(f"Verifier Length: {len(code_verifier)} characters")
    print(f"Challenge Length: {len(code_challenge)} characters")
    
    # Verify PKCE challenge format
    print(f"\\n🔍 PKCE Format Validation:")
    print("=" * 30)
    print(f"Verifier is base64url: {all(c in 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_' for c in code_verifier)}")
    print(f"Challenge is base64url: {all(c in 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_' for c in code_challenge)}")
    print(f"Verifier no padding: {not code_verifier.endswith('=')}")
    print(f"Challenge no padding: {not code_challenge.endswith('=')}")
    
except Exception as e:
    print(f"❌ PKCE generation failed: {e}")

# Test authorization URL generation
print(f"\\n🌐 Authorization URL Generation:")
print("=" * 40)

try:
    auth_url = client.get_authorization_url()
    print(f"Authorization URL: {auth_url[:100]}...")
    
    # Parse URL components
    from urllib.parse import urlparse, parse_qs
    
    parsed_url = urlparse(auth_url)
    query_params = parse_qs(parsed_url.query)
    
    print(f"\\n🔍 URL Components:")
    print("=" * 20)
    print(f"Base URL: {parsed_url.scheme}://{parsed_url.netloc}{parsed_url.path}")
    print(f"Query Parameters:")
    for param, values in query_params.items():
        if param in ['code_challenge', 'state', 'nonce']:
            print(f"  {param}: {values[0][:20]}...")
        else:
            print(f"  {param}: {values[0]}")
    
    # Verify required parameters
    required_params = ['code_challenge', 'code_challenge_method', 'client_id', 'scope', 'redirect_uri', 'response_type', 'state', 'nonce']
    missing_params = [param for param in required_params if param not in query_params]
    
    print(f"\\n✅ Parameter Validation:")
    print("=" * 25)
    print(f"Required Parameters: {required_params}")
    print(f"Missing Parameters: {missing_params}")
    print(f"All Required Present: {len(missing_params) == 0}")
    
except Exception as e:
    print(f"❌ Authorization URL generation failed: {e}")

# Test with custom state
print(f"\\n🔒 Custom State Parameter:")
print("=" * 30)

try:
    custom_state = "custom_state_12345"
    auth_url_with_state = client.get_authorization_url(state=custom_state)
    
    parsed_url_with_state = urlparse(auth_url_with_state)
    query_params_with_state = parse_qs(parsed_url_with_state.query)
    
    actual_state = query_params_with_state.get('state', [None])[0]
    print(f"Requested State: {custom_state}")
    print(f"Actual State: {actual_state}")
    print(f"State Match: {custom_state == actual_state}")
    
except Exception as e:
    print(f"❌ Custom state test failed: {e}")""")
    
    # API methods section
    api_methods_section = nbf.v4.new_markdown_cell("""## API Methods

The `MeijerAPIClient` provides several pre-built methods for common API endpoints. These methods automatically handle authentication and token management.

### Available API Methods

- **get_offers()**: Retrieve mPerks offers
- **get_shopping_list()**: Get user's shopping list
- **get_home_cards()**: Retrieve home page content
- **get_departments()**: Get shop by department navigation
- **get_user_settings()**: Retrieve user mobile settings

### Method Implementation
""")
    
    api_methods_example = nbf.v4.new_code_cell("""# API methods demonstration
# Note: These methods require valid authentication tokens
# We'll demonstrate the structure and error handling

print("📡 API Methods Overview:")
print("=" * 30)

# List available methods
api_methods = [
    'get_offers',
    'get_shopping_list', 
    'get_home_cards',
    'get_departments',
    'get_user_settings'
]

print("Available API Methods:")
for i, method_name in enumerate(api_methods, 1):
    print(f"{i}. {method_name}()")

# Examine method signatures
print(f"\\n🔍 Method Signatures:")
print("=" * 25)

for method_name in api_methods:
    method = getattr(client, method_name)
    if hasattr(method, '__code__'):
        arg_count = method.__code__.co_argcount
        arg_names = method.__code__.co_varnames[:arg_count]
        print(f"{method_name}({', '.join(arg_names[1:])}) -> Dict[str, Any]")

# Test method availability without authentication
print(f"\\n⚠️ Testing Methods Without Authentication:")
print("=" * 45)

for method_name in api_methods:
    try:
        method = getattr(client, method_name)
        result = method()
        print(f"✅ {method_name}(): Success")
    except ValueError as e:
        print(f"❌ {method_name}(): {e}")
    except Exception as e:
        print(f"⚠️ {method_name}(): Unexpected error - {e}")

# Demonstrate token validation logic
print(f"\\n🔐 Token Validation Logic:")
print("=" * 35)

def demonstrate_token_validation():
    \"\"\"Demonstrate how token validation works.\"\"\"
    print("1. Check if tokens exist")
    print("2. Check if tokens are expired")
    print("3. Refresh tokens if needed")
    print("4. Get authorization header")
    print("5. Make API request")
    
    print(f"\\nCurrent Token Status:")
    print(f"  Has Tokens: {client.tokens is not None}")
    if client.tokens:
        print(f"  Is Expired: {client.tokens.is_expired()}")
        print(f"  Needs Refresh: {client.tokens.needs_refresh()}")
    else:
        print(f"  No tokens available")

demonstrate_token_validation()

# Show expected API response structure
print(f"\\n📊 Expected API Response Structure:")
print("=" * 40)

api_response_examples = {
    'get_offers': {
        'description': 'mPerks offers and promotions',
        'endpoint': '/mPerks/api/offers',
        'base_url': 'loyalty.meijer.com',
        'response_type': 'JSON with offers array'
    },
    'get_shopping_list': {
        'description': 'User shopping list items',
        'endpoint': '/shoppinglist/GetList',
        'base_url': 'loyalty.meijer.com',
        'response_type': 'JSON with shopping list data'
    },
    'get_home_cards': {
        'description': 'Home page content cards',
        'endpoint': '/homecards/v1/cards',
        'base_url': 'digital.meijer.com',
        'response_type': 'JSON with card content'
    },
    'get_departments': {
        'description': 'Shop by department navigation',
        'endpoint': '/homecards/v1/cards/shopByDepartmentV2',
        'base_url': 'digital.meijer.com',
        'response_type': 'JSON with department structure'
    },
    'get_user_settings': {
        'description': 'User mobile settings',
        'endpoint': '/s/settings/{user_id}/v1/mobile',
        'base_url': 'api.meijer.com',
        'response_type': 'JSON with user preferences'
    }
}

for method_name, details in api_response_examples.items():
    print(f"{method_name}():")
    print(f"  Description: {details['description']}")
    print(f"  Endpoint: {details['endpoint']}")
    print(f"  Base URL: {details['base_url']}")
    print(f"  Response: {details['response_type']}")
    print()""")
    
    # Utility functions section
    utility_section = nbf.v4.new_markdown_cell("""## Utility Functions

The module provides utility functions for managing tokens through environment variables, which is useful for development and testing.

### Environment Variable Management

- **load_tokens_from_env()**: Load tokens from environment variables
- **save_tokens_to_env()**: Save tokens to environment variables

### Security Considerations

These functions are primarily for development and testing. In production, use proper secure storage solutions.
""")
    
    utility_example = nbf.v4.new_code_cell("""# Utility functions demonstration
print("🛠️ Utility Functions Demo:")
print("=" * 30)

# Test loading tokens from environment
print("📂 Loading Tokens from Environment:")
print("-" * 35)

# Check current environment variables
env_vars = ['MEIJER_ACCESS_TOKEN', 'MEIJER_REFRESH_TOKEN', 'MEIJER_ID_TOKEN', 'MEIJER_EXPIRES_IN']
current_env = {var: os.getenv(var) for var in env_vars}

print("Current Environment Variables:")
for var, value in current_env.items():
    if value:
        print(f"  {var}: {value[:20]}...")
    else:
        print(f"  {var}: Not set")

# Try to load tokens
tokens_from_env = load_tokens_from_env()
if tokens_from_env:
    print(f"\\n✅ Tokens loaded from environment:")
    print(f"  Access Token: {tokens_from_env.access_token[:30]}...")
    print(f"  Refresh Token: {tokens_from_env.refresh_token[:30]}...")
    print(f"  ID Token: {tokens_from_env.id_token[:30]}...")
    print(f"  Expires In: {tokens_from_env.expires_in} seconds")
    print(f"  Is Expired: {tokens_from_env.is_expired()}")
else:
    print(f"\\n❌ No tokens found in environment variables")

# Demonstrate saving tokens to environment
print(f"\\n💾 Saving Tokens to Environment:")
print("-" * 35)

# Create sample tokens for demonstration
demo_tokens = MeijerTokens(
    access_token="demo_access_token_12345",
    refresh_token="demo_refresh_token_67890",
    id_token="demo_id_token_abcdef",
    expires_in=7200,  # 2 hours
    token_type="Bearer"
)

print("Sample tokens created for demonstration:")
print(f"  Access Token: {demo_tokens.access_token}")
print(f"  Refresh Token: {demo_tokens.refresh_token}")
print(f"  ID Token: {demo_tokens.id_token}")
print(f"  Expires In: {demo_tokens.expires_in} seconds")

# Save to environment (for demonstration purposes)
print(f"\\nSaving tokens to environment variables...")
save_tokens_to_env(demo_tokens)

# Verify environment variables were set
print(f"\\nVerifying environment variables:")
for var in env_vars:
    value = os.getenv(var)
    if value:
        print(f"  {var}: {value[:20]}...")
    else:
        print(f"  {var}: Not set")

# Test loading the saved tokens
print(f"\\nTesting load_tokens_from_env with saved tokens...")
loaded_tokens = load_tokens_from_env()
if loaded_tokens:
    print(f"✅ Tokens successfully loaded from environment:")
    print(f"  Access Token: {loaded_tokens.access_token}")
    print(f"  Refresh Token: {loaded_tokens.refresh_token}")
    print(f"  ID Token: {loaded_tokens.id_token}")
    print(f"  Expires In: {loaded_tokens.expires_in} seconds")
    print(f"  Is Expired: {loaded_tokens.is_expired()}")
    
    # Verify data integrity
    print(f"\\n🔍 Data Integrity Check:")
    access_match = demo_tokens.access_token == loaded_tokens.access_token
    refresh_match = demo_tokens.refresh_token == loaded_tokens.refresh_token
    id_match = demo_tokens.id_token == loaded_tokens.id_token
    expires_match = demo_tokens.expires_in == loaded_tokens.expires_in
    
    print(f"  Access Token Match: {'✅' if access_match else '❌'}")
    print(f"  Refresh Token Match: {'✅' if refresh_match else '❌'}")
    print(f"  ID Token Match: {'✅' if id_match else '❌'}")
    print(f"  Expires In Match: {'✅' if expires_match else '❌'}")
    print(f"  Overall Match: {'✅' if all([access_match, refresh_match, id_match, expires_match]) else '❌'}")
else:
    print(f"❌ Failed to load tokens from environment")

# Clean up environment variables (for demonstration)
print(f"\\n🧹 Cleaning up environment variables...")
for var in env_vars:
    if var in os.environ:
        del os.environ[var]
        print(f"  Removed {var}")

print(f"\\n✅ Environment cleanup completed")""")
    
    # Best practices section
    best_practices_section = nbf.v4.new_markdown_cell("""## Best Practices

### 1. Token Security
- Never hardcode tokens in source code
- Use environment variables for development
- Implement secure token storage in production
- Regularly rotate refresh tokens

### 2. OAuth Flow
- Always use PKCE for mobile and public clients
- Implement proper state parameter validation
- Handle authorization errors gracefully
- Store tokens securely after exchange

### 3. API Usage
- Check token expiration before API calls
- Implement automatic token refresh
- Handle API rate limits appropriately
- Log API errors for debugging

### 4. Error Handling
- Catch and handle authentication errors
- Implement retry logic for transient failures
- Provide user-friendly error messages
- Log errors for monitoring and debugging

### 5. Development vs Production
- Use environment variables for development
- Implement proper secret management in production
- Use HTTPS for all API communications
- Implement proper logging and monitoring
""")
    
    # Summary section
    summary_section = nbf.v4.new_markdown_cell("""## Summary

This notebook has demonstrated the comprehensive Meijer API client system:

✅ **MeijerAuthConfig**: OAuth configuration with secure endpoints
✅ **MeijerTokens**: Secure token management with expiration handling
✅ **MeijerAPIClient**: Main client with OAuth 2.0 PKCE implementation
✅ **API Methods**: Pre-built methods for common endpoints
✅ **Utility Functions**: Environment variable management for development
✅ **Security Features**: PKCE flow, CSRF protection, secure headers

### Key Benefits

- **Secure Authentication**: OAuth 2.0 PKCE flow implementation
- **Automatic Management**: Token refresh and validation
- **Easy Integration**: Simple API methods for common operations
- **Development Friendly**: Environment variable support
- **Production Ready**: Secure by default with proper error handling

### OAuth 2.0 PKCE Flow

1. **Generate PKCE Challenge**: Create code verifier and challenge
2. **Authorization Request**: Redirect user to authorization URL
3. **User Authentication**: User completes authentication on Meijer
4. **Code Exchange**: Exchange authorization code for tokens
5. **API Access**: Use access token for authenticated requests
6. **Token Refresh**: Automatically refresh expired tokens

### Next Steps

- Explore the other modules in the Meijer package
- Learn about shopping list and coupon management
- Discover store location and search capabilities
- Understand the complete API workflow

The API client provides a secure and robust foundation for building Meijer API applications! 🚀
""")
    
    # Add all cells to notebook
    nb.cells = [
        title_cell,
        import_cell,
        auth_config_section,
        auth_config_example,
        meijer_tokens_section,
        meijer_tokens_example,
        api_client_section,
        api_client_example,
        api_methods_section,
        api_methods_example,
        utility_section,
        utility_example,
        best_practices_section,
        summary_section
    ]
    
    # Save notebook
    with open('api_client.ipynb', 'w') as f:
        nbf.write(nb, f)
    
    print("✅ api_client.ipynb created successfully!")

if __name__ == "__main__":
    create_api_client_notebook() 