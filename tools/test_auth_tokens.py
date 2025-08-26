#!/usr/bin/env python3
import json
from meijer.models.base import AuthTokens

# Load the current auth.json
with open("auth.json", "r") as f:
    data = json.load(f)

print("Data loaded:")
print(f"Keys: {list(data.keys())}")
print(f"expires_in: {data.get('expires_in')} (type: {type(data.get('expires_in'))})")
print(f"access_token: {data.get('access_token', 'NOT_FOUND')[:50]}...")
print(f"refresh_token: {data.get('refresh_token', 'NOT_FOUND')}")

print("\nTesting AuthTokens.from_dict...")
try:
    tokens = AuthTokens.from_dict(data)
    print("✅ AuthTokens created successfully!")
    print(f"Access token: {tokens.access_token[:50]}...")
    print(f"Expires in: {tokens.expires_in} seconds")
    print(f"Refresh token: {tokens.refresh_token}")
    print(f"Token type: {tokens.token_type}")
except Exception as e:
    print(f"❌ Error creating AuthTokens: {e}")
    import traceback

    traceback.print_exc()
