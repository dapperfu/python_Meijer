#!/usr/bin/env python3
"""
Enhanced OKTA Authentication for Meijer API

This module provides enhanced authentication that combines:
1. JavaScript widget simulation for initial authentication
2. Automatic token refresh for long-term access
3. Fallback to existing token storage

This approach ensures reliable authentication while maintaining
the ability to refresh tokens automatically.
"""

import logging
from typing import Optional, Tuple

from .auth import TokenStorage
from .models.base import AuthTokens
from .okta_js_widget_simulator import authenticate_with_js_widget


class EnhancedMeijerAuth:
    """Enhanced authentication that combines multiple approaches."""

    def __init__(self, username: Optional[str] = None, password: Optional[str] = None):
        self.username = username
        self.password = password
        self.token_storage = TokenStorage()
        self.logger = logging.getLogger(__name__)

    def authenticate(self) -> Optional[AuthTokens]:
        """
        Perform authentication using the best available method.
        
        Strategy:
        1. Check if we have valid existing tokens
        2. If tokens are expired, try to refresh them
        3. If refresh fails, try to load credentials from login.txt fallback
        4. If we have credentials, try widget simulation
        5. If all else fails, prompt user to run 'meijer auth'
        
        Returns:
            Valid AuthTokens if successful, None otherwise
        """
        print("🔐 Enhanced Meijer Authentication")
        print("=" * 40)
        
        # Step 1: Check for existing valid tokens
        print("📡 Step 1: Checking for existing tokens...")
        tokens = self.token_storage.get_valid_tokens()
        
        if tokens:
            print("✅ Found valid existing tokens")
            print(f"🔑 Access token: {tokens.access_token[:30]}...")
            print(f"⏰ Expires in: {tokens.expires_in} seconds")
            return tokens
        
        # Step 2: Check if we have tokens that can be refreshed
        print("📡 Step 2: Checking for refreshable tokens...")
        stored_tokens = self.token_storage.load_tokens()
        
        if stored_tokens and stored_tokens.refresh_token:
            print("🔄 Found tokens with refresh capability - attempting refresh...")
            if self.token_storage.refresh_tokens(stored_tokens.refresh_token):
                refreshed_tokens = self.token_storage.get_valid_tokens()
                if refreshed_tokens:
                    print("✅ Token refresh successful!")
                    print(f"🔑 New access token: {refreshed_tokens.access_token[:30]}...")
                    return refreshed_tokens
            else:
                print("❌ Token refresh failed")
        
        # Step 3: Try to load fallback credentials from login.txt
        print("📡 Step 3: Checking for fallback credentials...")
        fallback_creds = self.token_storage.load_credentials_from_file()
        if fallback_creds:
            username, password = fallback_creds
            print(f"✅ Found fallback credentials for: {username}")
            print("🔄 Attempting authentication with fallback credentials...")
            
            # Try JavaScript widget simulation with fallback credentials
            auth_code = authenticate_with_js_widget(username, password)
            if auth_code:
                print("✅ Widget simulation successful with fallback credentials!")
                print(f"🔑 Authorization code: {auth_code[:30]}...")
                
                # Exchange authorization code for tokens
                print("🔄 Exchanging authorization code for tokens...")
                tokens = self.token_storage.exchange_authorization_code(auth_code)
                if tokens:
                    print("🎉 Authentication completed successfully with fallback credentials!")
                    return tokens
                else:
                    print("❌ Failed to exchange authorization code for tokens")
            else:
                print("❌ Widget simulation failed with fallback credentials")
        else:
            print("💡 No fallback credentials found in login.txt")
        
        # Step 4: Try JavaScript widget simulation if we have credentials
        if self.username and self.password:
            print("📡 Step 4: Attempting JavaScript widget simulation...")
            print(f"👤 Username: {self.username}")
            print(f"🔑 Password: {'*' * len(self.password)}")
            
            auth_code = authenticate_with_js_widget(self.username, self.password)
            
            if auth_code:
                print("✅ Widget simulation successful!")
                print(f"🔑 Authorization code: {auth_code[:30]}...")
                
                # Exchange authorization code for tokens
                print("🔄 Exchanging authorization code for tokens...")
                tokens = self.token_storage.exchange_authorization_code(auth_code)
                if tokens:
                    print("🎉 Authentication completed successfully!")
                    return tokens
                else:
                    print("❌ Failed to exchange authorization code for tokens")
            else:
                print("❌ Widget simulation failed")
        else:
            print("💡 Step 4: Skipped widget simulation - no credentials provided")
        
        # Step 5: All methods failed
        print("❌ All authentication methods failed")
        print("\n💡 Recommendations:")
        print("   1. Run 'meijer auth' to capture tokens from browser login")
        print("   2. Create login.txt with username/password for fallback")
        print("   3. Provide username/password for widget simulation")
        print("   4. Check network connectivity and credentials")
        
        return None

    def ensure_authenticated(self) -> bool:
        """
        Ensure we have valid authentication, attempting multiple methods if needed.

        Returns:
            True if authentication is available, False otherwise
        """
        tokens = self.authenticate()
        return tokens is not None

    def get_auth_header(self) -> Optional[str]:
        """
        Get the authorization header value for API requests.

        Returns:
            Authorization header value (e.g., "Bearer abc123...") or None
        """
        tokens = self.token_storage.get_valid_tokens()
        if tokens:
            return f"Bearer {tokens.access_token}"
        return None

    def set_credentials(self, username: str, password: str):
        """
        Set credentials for JavaScript widget simulation.
        
        Args:
            username: User's email address
            password: User's password
        """
        self.username = username
        self.password = password
        print(f"✅ Credentials set for user: {username}")
        
        # Also save to login.txt for fallback use
        if self.token_storage.save_credentials_to_file(username, password):
            print("💾 Credentials also saved to login.txt for fallback use")
        else:
            print("⚠️ Failed to save credentials to login.txt fallback file")

    def clear_credentials(self):
        """Clear stored credentials."""
        self.username = None
        self.password = None
        print("✅ Credentials cleared")
        
        # Also clear the login.txt file
        if self.token_storage.clear_credentials_file():
            print("🗑️ Login.txt fallback file also cleared")
        else:
            print("⚠️ Failed to clear login.txt fallback file")

    def has_fallback_credentials(self) -> bool:
        """
        Check if fallback credentials exist in login.txt.
        
        Returns:
            True if fallback credentials exist, False otherwise
        """
        return self.token_storage.load_credentials_from_file() is not None

    def get_fallback_credentials(self) -> Optional[Tuple[str, str]]:
        """
        Get fallback credentials from login.txt.
        
        Returns:
            Tuple of (username, password) or None if not available
        """
        return self.token_storage.load_credentials_from_file()

    def clear_tokens(self) -> bool:
        """
        Clear all stored tokens.

        Returns:
            True if successful, False otherwise
        """
        return self.token_storage.clear_tokens()

    def get_token_status(self) -> dict:
        """
        Get detailed status of current tokens.

        Returns:
            Dictionary with token status information
        """
        stored_tokens = self.token_storage.load_tokens()

        if not stored_tokens:
            return {
                "has_tokens": False,
                "is_valid": False,
                "has_refresh": False,
                "expires_in": None,
                "message": "No tokens stored",
            }

        is_valid = not stored_tokens.is_expired()
        has_refresh = bool(
            stored_tokens.refresh_token and stored_tokens.refresh_token.strip()
        )

        status = {
            "has_tokens": True,
            "is_valid": is_valid,
            "has_refresh": has_refresh,
            "expires_in": stored_tokens.expires_in,
            "access_token_preview": stored_tokens.access_token[:30] + "..."
            if stored_tokens.access_token
            else None,
            "refresh_token_preview": stored_tokens.refresh_token[:30] + "..."
            if stored_tokens.refresh_token
            else None,
        }

        if is_valid:
            status["message"] = "Tokens are valid and ready to use"
        elif has_refresh:
            status["message"] = "Tokens expired but can be refreshed"
        else:
            status["message"] = "Tokens expired and cannot be refreshed"

        return status

    def print_status(self):
        """Print a human-readable status of the authentication system."""
        print("\n🔍 Authentication Status")
        print("=" * 25)

        status = self.get_token_status()

        if status["has_tokens"]:
            print(f"📋 Status: {status['message']}")
            print(f"🔑 Access Token: {status['access_token_preview']}")
            print(f"🔄 Refresh Token: {status['refresh_token_preview']}")
            print(f"⏰ Expires In: {status['expires_in']} seconds")
            print(f"✅ Valid: {status['is_valid']}")
            print(f"🔄 Refreshable: {status['has_refresh']}")
        else:
            print("📋 Status: No tokens available")
            print("💡 Run 'meijer auth' or provide credentials for authentication")

        if self.username:
            print(f"👤 Credentials: Set for {self.username}")
        else:
            print("👤 Credentials: Not set")


def create_enhanced_auth(
    username: Optional[str] = None, password: Optional[str] = None
) -> EnhancedMeijerAuth:
    """
    Create an enhanced authentication instance.

    Args:
        username: Optional username for widget simulation
        password: Optional password for widget simulation

    Returns:
        EnhancedMeijerAuth instance
    """
    return EnhancedMeijerAuth(username, password)


if __name__ == "__main__":
    # Example usage
    print("🧪 Enhanced Authentication Demo")
    print("=" * 35)

    # Create auth instance
    auth = create_enhanced_auth()

    # Print current status
    auth.print_status()

    # Try to authenticate
    tokens = auth.authenticate()

    if tokens:
        print("\n✅ Authentication successful!")
        print(f"🔑 Can make API calls with: {auth.get_auth_header()}")
    else:
        print("\n❌ Authentication failed")
        print("💡 Check the recommendations above")
