# Meijer Authentication Configuration System

## Overview

The Meijer headless authentication client now uses a centralized configuration system instead of hardcoded values. All authentication parameters, headers, endpoints, timing, and cookie requirements are stored in a JSON configuration file.

## Configuration File Location

The configuration file is located at:
```
~/.config/meijer/auth_config.json
```

## Configuration Structure

### OAuth2 Parameters
```json
"oauth2": {
  "client_id": "0oa22cbewuCICOsKz697",
  "scope": "openid offline_access",
  "redirect_uri": "https://www.meijer.com/",
  "response_type": "code"
}
```

### Base URLs
```json
"base_urls": {
  "meijer": "https://www.meijer.com",
  "okta": "https://id.meijer.com"
}
```

### User Agent
```json
"user_agent": "Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0"
```

### Headers
Headers are organized by authentication step:

- **default**: Base headers for all requests
- **device_fingerprint**: Headers for device fingerprinting step
- **identify**: Headers for username identification step
- **challenge**: Headers for password challenge step
- **token_exchange**: Headers for OAuth2 token exchange

### Endpoints
```json
"endpoints": {
  "oauth2_authorize": "/oauth2/default/v1/authorize",
  "idp_identify": "/idp/idx/identify",
  "idp_challenge": "/idp/idx/challenge/answer",
  "device_fingerprint": "/auth/services/devicefingerprint",
  "device_nonce": "/api/v1/internal/device/nonce",
  "token_exchange": "/oauth2/default/v1/token"
}
```

### Timing
```json
"timing": {
  "initial_landing": 2,
  "oauth2_authorize": 1,
  "device_fingerprint": 1,
  "identify": 1,
  "challenge": 1
}
```

### Cookies
```json
"cookies": {
  "required": ["bm_sz", "_abck", "bm_sv", "JSESSIONID", "AKA_A2"],
  "domains": {
    "meijer": ".meijer.com",
    "okta": ".meijer.com"
  }
}
```

## Configuration Management

### Using the Configuration Manager Script

The `tools/manage_auth_config.py` script provides a command-line interface for managing the configuration:

#### View Configuration
```bash
python3 tools/manage_auth_config.py view
```

#### Edit Configuration Values
```bash
python3 tools/manage_auth_config.py edit <key_path> <value>
```

Examples:
```bash
# Change client ID
python3 tools/manage_auth_config.py edit oauth2.client_id new_client_id

# Change timing
python3 tools/manage_auth_config.py edit timing.initial_landing 5

# Change user agent
python3 tools/manage_auth_config.py edit user_agent "New User Agent String"
```

#### Reset to Default Configuration
```bash
python3 tools/manage_auth_config.py reset
```

#### Show Configuration File Path
```bash
python3 tools/manage_auth_config.py path
```

### Programmatic Configuration Management

The `HeadlessAuthClient` class provides methods for managing configuration:

```python
from meijer.headless_auth_client import HeadlessAuthClient

# Create client
client = HeadlessAuthClient()

# Reload configuration from file
client.reload_config()

# Update configuration value
client.update_config('oauth2.client_id', 'new_client_id')

# Update timing
client.update_config('timing.initial_landing', 5)
```

## Benefits of the Configuration System

1. **Flexibility**: Easy to modify authentication parameters without code changes
2. **Maintainability**: All configuration in one place
3. **Testing**: Can test different configurations without recompiling
4. **Environment-specific**: Different configs for different environments
5. **Version Control**: Configuration can be version controlled separately
6. **Security**: Sensitive values can be managed externally

## Default Configuration

If no configuration file exists, the system will automatically create one with the default values extracted from the authentication flow analysis. The default configuration includes:

- Exact OAuth2 parameters from successful flows
- Precise headers that bypass bot detection
- Correct timing patterns from successful authentication
- Required cookie specifications
- All necessary endpoints

## Updating Configuration

### When to Update

- **Client ID changes**: If Meijer updates their OAuth2 client ID
- **Header updates**: If new bot detection mechanisms are implemented
- **Timing adjustments**: If authentication flow timing changes
- **Endpoint changes**: If API endpoints are modified

### How to Update

1. **Manual editing**: Edit the JSON file directly
2. **Configuration manager**: Use the management script
3. **Programmatic**: Use the client's `update_config()` method

### Validation

The system validates configuration on load and provides warnings for missing required values. The client will fall back to default values if the configuration is invalid.

## Security Considerations

- The configuration file contains sensitive authentication parameters
- Store in a secure location with appropriate permissions
- Consider using environment variables for production deployments
- The configuration file should not be committed to public repositories

## Troubleshooting

### Configuration Not Found
If you get a "Configuration file not found" error:
1. Check the file path: `~/.config/meijer/auth_config.json`
2. Ensure the directory exists
3. Run the configuration manager to create a default file

### Invalid Configuration
If the configuration is invalid:
1. Check JSON syntax
2. Use the reset command to restore defaults
3. Verify all required sections are present

### Configuration Not Applied
If changes aren't taking effect:
1. Ensure the client is reloading configuration
2. Check for syntax errors in the JSON
3. Verify file permissions

## Example Configuration Updates

### Changing User Agent
```bash
python3 tools/manage_auth_config.py edit user_agent "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36"
```

### Adjusting Timing
```bash
python3 tools/manage_auth_config.py edit timing.initial_landing 5
python3 tools/manage_auth_config.py edit timing.oauth2_authorize 2
```

### Updating Headers
```bash
# This would require manual JSON editing for complex header changes
# The configuration manager is best for simple key-value updates
```

## Integration with Existing Code

The configuration system is designed to be backward compatible. Existing code using `HeadlessAuthClient` will automatically use the new configuration system without requiring changes.

The client will:
1. Load configuration on initialization
2. Use configuration values for all authentication steps
3. Provide methods for runtime configuration updates
4. Fall back to defaults if configuration is unavailable
