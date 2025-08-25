#!/usr/bin/env python3
"""
Authentication Configuration Manager

This script allows you to view, edit, and manage the authentication configuration
for the Meijer headless authentication client.
"""

import json
import sys
from pathlib import Path
from typing import Dict, Any

def get_config_path() -> Path:
    """Get the path to the configuration file."""
    return Path.home() / ".config" / "meijer" / "auth_config.json"

def load_config() -> Dict[str, Any]:
    """Load configuration from file."""
    config_path = get_config_path()
    
    if not config_path.exists():
        print(f"❌ Configuration file not found: {config_path}")
        print("Creating default configuration...")
        create_default_config(config_path)
    
    try:
        with open(config_path, 'r') as f:
            config = json.load(f)
        return config
    except Exception as e:
        print(f"❌ Error loading configuration: {e}")
        return {}

def save_config(config: Dict[str, Any]):
    """Save configuration to file."""
    config_path = get_config_path()
    config_path.parent.mkdir(parents=True, exist_ok=True)
    
    try:
        with open(config_path, 'w') as f:
            json.dump(config, f, indent=2)
        print(f"✅ Configuration saved to: {config_path}")
    except Exception as e:
        print(f"❌ Error saving configuration: {e}")

def create_default_config(config_path: Path):
    """Create default configuration file."""
    default_config = {
        "oauth2": {
            "client_id": "0oa22cbewuCICOsKz697",
            "scope": "openid offline_access",
            "redirect_uri": "https://www.meijer.com/",
            "response_type": "code"
        },
        "base_urls": {
            "meijer": "https://www.meijer.com",
            "okta": "https://id.meijer.com"
        },
        "user_agent": "Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0",
        "headers": {
            "default": {
                "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
                "Accept-Language": "en-US,en;q=0.5",
                "Accept-Encoding": "gzip, deflate, br, zstd",
                "DNT": "1",
                "Connection": "keep-alive",
                "Upgrade-Insecure-Requests": "1"
            },
            "device_fingerprint": {
                "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
                "Accept-Language": "en-US,en;q=0.5",
                "Accept-Encoding": "gzip, deflate, br, zstd",
                "DNT": "1",
                "Connection": "keep-alive",
                "Upgrade-Insecure-Requests": "1"
            },
            "identify": {
                "Accept": "application/ion+json; okta-version=1.0.0",
                "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
                "Content-Type": "application/ion+json; okta-version=1.0.0",
                "Accept-Language": "en-US,en;q=0.5",
                "Accept-Encoding": "gzip, deflate, br, zstd"
            },
            "challenge": {
                "Accept": "application/ion+json; okta-version=1.0.0",
                "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
                "Content-Type": "application/ion+json; okta-version=1.0.0",
                "Accept-Language": "en-US,en;q=0.5",
                "Accept-Encoding": "gzip, deflate, br, zstd"
            },
            "token_exchange": {
                "Accept": "application/json",
                "Content-Type": "application/x-www-form-urlencoded"
            }
        },
        "endpoints": {
            "oauth2_authorize": "/oauth2/default/v1/authorize",
            "idp_identify": "/idp/idx/identify",
            "idp_challenge": "/idp/idx/challenge/answer",
            "device_fingerprint": "/auth/services/devicefingerprint",
            "device_nonce": "/api/v1/internal/device/nonce",
            "token_exchange": "/oauth2/default/v1/token"
        },
        "timing": {
            "initial_landing": 2,
            "oauth2_authorize": 1,
            "device_fingerprint": 1,
            "identify": 1,
            "challenge": 1
        },
        "cookies": {
            "required": ["bm_sz", "_abck", "bm_sv", "JSESSIONID", "AKA_A2"],
            "domains": {
                "meijer": ".meijer.com",
                "okta": ".meijer.com"
            }
        }
    }
    
    config_path.parent.mkdir(parents=True, exist_ok=True)
    save_config(default_config)

def print_config(config: Dict[str, Any], indent: int = 0):
    """Print configuration in a readable format."""
    for key, value in config.items():
        if isinstance(value, dict):
            print(" " * indent + f"{key}:")
            print_config(value, indent + 2)
        else:
            print(" " * indent + f"{key}: {value}")

def update_config_value(config: Dict[str, Any], key_path: str, value: str) -> bool:
    """Update a configuration value."""
    try:
        keys = key_path.split('.')
        config_section = config
        
        # Navigate to the parent section
        for key in keys[:-1]:
            if key not in config_section:
                config_section[key] = {}
            config_section = config_section[key]
        
        # Set the value
        config_section[keys[-1]] = value
        
        print(f"✅ Updated: {key_path} = {value}")
        return True
        
    except Exception as e:
        print(f"❌ Error updating configuration: {e}")
        return False

def main():
    """Main function to manage configuration."""
    print("🔧 MEIJER AUTHENTICATION CONFIGURATION MANAGER")
    print("=" * 60)
    
    if len(sys.argv) < 2:
        print("Usage:")
        print("  python manage_auth_config.py view                    # View current configuration")
        print("  python manage_auth_config.py edit <key> <value>     # Edit a configuration value")
        print("  python manage_auth_config.py reset                  # Reset to default configuration")
        print("  python manage_auth_config.py path                   # Show configuration file path")
        return
    
    command = sys.argv[1]
    
    if command == "view":
        config = load_config()
        if config:
            print("📋 Current Configuration:")
            print("-" * 40)
            print_config(config)
        else:
            print("❌ No configuration loaded")
    
    elif command == "edit":
        if len(sys.argv) < 4:
            print("❌ Usage: python manage_auth_config.py edit <key> <value>")
            print("Example: python manage_auth_config.py edit oauth2.client_id new_client_id")
            return
        
        key_path = sys.argv[2]
        value = sys.argv[3]
        
        config = load_config()
        if config and update_config_value(config, key_path, value):
            save_config(config)
        else:
            print("❌ Failed to update configuration")
    
    elif command == "reset":
        print("🔄 Resetting to default configuration...")
        config_path = get_config_path()
        if config_path.exists():
            config_path.unlink()
            print("✅ Old configuration removed")
        
        create_default_config(config_path)
        print("✅ Default configuration created")
    
    elif command == "path":
        config_path = get_config_path()
        print(f"📁 Configuration file path: {config_path}")
        print(f"📁 Configuration directory: {config_path.parent}")
    
    else:
        print(f"❌ Unknown command: {command}")
        print("Available commands: view, edit, reset, path")

if __name__ == "__main__":
    main()
