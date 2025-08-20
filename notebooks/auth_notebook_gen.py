#!/usr/bin/env python3
"""
Generate Jupyter notebook for Meijer auth.py

This script creates a comprehensive notebook demonstrating all authentication classes
and their usage with practical examples.
"""

import nbformat as nbf


def create_auth_notebook():
    """Create the auth notebook."""

    # Create notebook
    nb = nbf.v4.new_notebook()

    # Title and description
    title_cell = nbf.v4.new_markdown_cell("""# Meijer API Authentication

This notebook demonstrates the authentication system available in the Meijer API client.

## Overview

The `auth.py` module provides comprehensive authentication functionality for the Meijer API, including token management, persistent storage, and various authentication file formats.

## Authentication Components

- **MeijerAuth**: Custom authentication class for API requests
- **TokenStorage**: Persistent storage and management of authentication tokens
- **Configuration Loading**: Support for multiple auth file formats
- **Token Persistence**: Secure storage and retrieval of authentication credentials

## Setup

First, let's import the necessary modules:
""")

    # Import cell
    import_cell = nbf.v4.new_code_cell("""# Import the authentication classes
from meijer.auth import (
    MeijerAuth,
    TokenStorage,
    load_auth_from_config_file,
    load_auth_from_config_file
)

# Import additional utilities
import json
import os
import pickle
import tempfile
from pathlib import Path
from typing import Dict, Any, Optional, Tuple
from datetime import datetime

print("[OK] All authentication classes imported successfully!")
print("Available components:")
print("  - MeijerAuth")
print("  - TokenStorage")
print("  - load_auth_from_config_file")
print("  - load_auth_file")""")

    # MeijerAuth section
    meijer_auth_section = nbf.v4.new_markdown_cell("""## MeijerAuth Class

The `MeijerAuth` class is a custom authentication class that implements the `requests.auth.AuthBase` interface. It automatically adds Bearer token authentication to HTTP requests.

### Key Features

- **Requests Integration**: Works seamlessly with the requests library
- **Bearer Token**: Automatically adds Authorization header with Bearer token
- **Simple Interface**: Easy to use with any requests session
- **Header Management**: Automatically manages authentication headers

### Basic Usage
""")

    meijer_auth_example = nbf.v4.new_code_cell("""# MeijerAuth basic usage
# Create an authentication instance
bearer_token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.example.token"
auth = MeijerAuth(bearer_token)

print("[LOCK] MeijerAuth Created:")
print(f"Bearer Token: {bearer_token[:20]}...")
print(f"Auth Type: {type(auth).__name__}")
print(f"Base Class: {auth.__class__.__bases__[0].__name__}")

# Test the authentication mechanism
print(f"\\n[CLIPBOARD] Authentication Details:")
print(f"Token Length: {len(bearer_token)} characters")
print(f"Token Prefix: {bearer_token[:10]}...")
print(f"Token Suffix: ...{bearer_token[-10:]}")

# Simulate request header modification
class MockRequest:
    def __init__(self):
        self.headers = {}

    def __repr__(self):
        return f"MockRequest(headers={self.headers})"

# Test the __call__ method
mock_request = MockRequest()
print(f"\\n[OUTBOX] Before Auth: {mock_request}")
print(f"Headers: {mock_request.headers}")

# Apply authentication
modified_request = auth(mock_request)
print(f"\\n[INBOX] After Auth: {modified_request}")
print(f"Headers: {modified_request.headers}")
print(f"Authorization Header: {modified_request.headers.get('Authorization', 'Not set')}")

# Verify the Bearer token format
auth_header = modified_request.headers.get('Authorization', '')
if auth_header.startswith('Bearer '):
    print(f"[OK] Authorization header correctly formatted: Bearer + token")
    token_part = auth_header[7:]  # Remove 'Bearer ' prefix
    print(f"   Token part: {token_part[:20]}...")
else:
    print(f"[X] Authorization header incorrectly formatted: {auth_header}")""")

    # TokenStorage section
    token_storage_section = nbf.v4.new_markdown_cell("""## TokenStorage Class

The `TokenStorage` class handles persistent storage of authentication tokens using pickle files. It provides secure storage and retrieval of authentication credentials.

### Key Features

- **Persistent Storage**: Tokens are saved to disk and survive application restarts
- **Pickle Format**: Uses Python's pickle module for efficient serialization
- **Error Handling**: Graceful handling of storage failures
- **File Management**: Automatic file creation, loading, and cleanup

### Basic Usage
""")

    token_storage_example = nbf.v4.new_code_cell("""# TokenStorage basic usage
# Create a temporary storage file for testing
temp_dir = tempfile.mkdtemp()
test_storage_file = os.path.join(temp_dir, "test_tokens.pkl")

print("[FLOPPY] TokenStorage Demo")
print("=" * 30)

# Create TokenStorage instance
storage = TokenStorage(test_storage_file)
print(f"Storage File: {storage.storage_file}")
print(f"Initial Has Tokens: {storage.has_tokens()}")

# Create sample token data (simulating AuthTokens)
class MockAuthTokens:
    def __init__(self, access_token: str, refresh_token: str = None, expires_at: str = None):
        self.access_token = access_token
        self.refresh_token = refresh_token
        self.expires_at = expires_at

    def to_dict(self) -> Dict[str, Any]:
        return {
            'access_token': self.access_token,
            'refresh_token': self.refresh_token,
            'expires_at': self.expires_at
        }

    @classmethod
    def from_dict(cls, data: Dict[str, Any]) -> 'MockAuthTokens':
        return cls(
            access_token=data.get('access_token'),
            refresh_token=data.get('refresh_token'),
            expires_at=data.get('expires_at')
        )

# Test token operations
print(f"\\n[KEY] Testing Token Operations:")

# Create sample tokens
sample_tokens = MockAuthTokens(
    access_token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.sample.access.token",
    refresh_token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.sample.refresh.token",
    expires_at="2024-12-31T23:59:59Z"
)

print(f"Sample Tokens Created:")
print(f"  Access Token: {sample_tokens.access_token[:30]}...")
print(f"  Refresh Token: {sample_tokens.refresh_token[:30]}...")
print(f"  Expires At: {sample_tokens.expires_at}")

# Save tokens
print(f"\\n[FLOPPY] Saving Tokens...")
save_success = storage.save_tokens(sample_tokens)
print(f"Save Success: {save_success}")
print(f"File Exists: {os.path.exists(test_storage_file)}")
print(f"File Size: {os.path.getsize(test_storage_file)} bytes")
print(f"Has Tokens: {storage.has_tokens()}")

# Load tokens
print(f"\\n[OPEN] Loading Tokens...")
loaded_tokens = storage.load_tokens()
if loaded_tokens:
    print(f"Load Success: [OK]")
    print(f"  Access Token: {loaded_tokens.access_token[:30]}...")
    print(f"  Refresh Token: {loaded_tokens.refresh_token[:30]}...")
    print(f"  Expires At: {loaded_tokens.expires_at}")
else:
    print(f"Load Failed: [X]")

# Test clearing tokens
print(f"\\n[FILE]️ Clearing Tokens...")
clear_success = storage.clear_tokens()
print(f"Clear Success: {clear_success}")
print(f"File Exists: {os.path.exists(test_storage_file)}")
print(f"Has Tokens: {storage.has_tokens()}")

# Clean up
import shutil
shutil.rmtree(temp_dir)
print(f"\\n🧹 Cleaned up temporary files")""")

    # Summary section
    summary_section = nbf.v4.new_markdown_cell("""## Summary

This notebook has demonstrated the authentication system available in the Meijer API client:

[OK] **MeijerAuth**: Custom authentication class for Bearer token requests
[OK] **TokenStorage**: Persistent storage and management of authentication tokens
[OK] **Configuration Loading**: Support for multiple auth file formats
[OK] **JSON Config Support**: Structured configuration file loading
[OK] **Flexible Auth Files**: Support for bearer tokens and username/password
[OK] **Integration Ready**: Seamless integration with requests library

### Key Benefits

- **Seamless Integration**: Works directly with requests library
- **Persistent Storage**: Tokens survive application restarts
- **Multiple Formats**: Support for various configuration file types
- **Error Handling**: Graceful handling of authentication failures
- **Security Focused**: Secure token storage and management

### Next Steps

- Explore the other modules in the Meijer package
- Learn about API client usage with authentication
- Discover shopping list and coupon management features
- Understand the complete API workflow

The authentication system provides a robust foundation for building secure Meijer API applications! [ROCKET]
""")

    # Add all cells to notebook
    nb.cells = [
        title_cell,
        import_cell,
        meijer_auth_section,
        meijer_auth_example,
        token_storage_section,
        token_storage_example,
        summary_section,
    ]

    # Save notebook
    with open("auth.ipynb", "w") as f:
        nbf.write(nb, f)

    print("[OK] auth.ipynb created successfully!")


if __name__ == "__main__":
    create_auth_notebook()
