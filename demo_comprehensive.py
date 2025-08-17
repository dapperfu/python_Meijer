#!/usr/bin/env python3
"""
Demo script for the comprehensive Meijer API client.

Shows how to use different authentication methods and API endpoints.
"""

import json
import time
from meijer import Meijer


def demo_basic_usage():
    """Demonstrate basic client usage."""
    print("🚀 Basic Meijer Client Usage")
    print("=" * 50)

    # Initialize client
    client = Meijer()

    # Show initial state
    print(f"Initial auth status: {client.auth_status.value}")
    print(f"Authenticated: {client.is_authenticated()}")

    # Show session info
    session_info = client.get_session_info()
    print(f"Session info: {json.dumps(session_info, indent=2)}")

    print("\n✅ Basic usage demo completed\n")


def demo_oauth_flow():
    """Demonstrate OAuth authorization flow."""
    print("🔐 OAuth Authorization Flow Demo")
    print("=" * 50)

    client = Meijer()

    # Generate authorization URL
    auth_url, state, code_verifier = client.get_authorization_url()

    print(f"🔗 Authorization URL:")
    print(f"   {auth_url}")
    print(f"\n📋 Generated parameters:")
    print(f"   State: {state}")
    print(f"   Code Verifier: {code_verifier}")

    print("\n📱 To complete authentication:")
    print("   1. Open the authorization URL in a browser")
    print("   2. Complete the login process")
    print("   3. Copy the authorization code from the redirect URL")
    print("   4. Use client.authenticate_with_code(code, code_verifier)")

    print("\n✅ OAuth flow demo completed\n")


def demo_api_endpoints():
    """Demonstrate API endpoint usage (requires authentication)."""
    print("🌐 API Endpoints Demo")
    print("=" * 50)

    client = Meijer()

    print("📋 Available API endpoints:")
    print("   • get_offers() - Get available offers/coupons")
    print("   • get_home_cards() - Get home page content")
    print("   • get_special_offers() - Get special promotions")
    print("   • get_stores() - Get store locations")
    print("   • get_shopping_list() - Get user's shopping list")
    print("   • get_user_info() - Get user profile")

    print("\n⚠️  Note: These endpoints require authentication")
    print("   Use client.login() or client.authenticate_with_code() first")

    print("\n✅ API endpoints demo completed\n")


def demo_error_handling():
    """Demonstrate error handling and session management."""
    print("⚠️  Error Handling & Session Management Demo")
    print("=" * 50)

    client = Meijer()

    print("🔍 Testing unauthenticated API calls:")

    # Try to get offers without authentication
    offers = client.get_offers()
    print(f"   get_offers() result: {len(offers)} offers (expected: 0)")

    # Try to get stores without authentication
    stores = client.get_stores()
    print(f"   get_stores() result: {len(stores)} stores (expected: 0)")

    print("\n🔄 Testing session management:")
    print(f"   Initial status: {client.auth_status.value}")

    # Simulate authentication
    client.auth_status = client.auth_status.__class__.AUTHENTICATED
    print(f"   After auth: {client.auth_status.value}")

    # Test logout
    client.logout()
    print(f"   After logout: {client.auth_status.value}")

    print("\n✅ Error handling demo completed\n")


def demo_context_manager():
    """Demonstrate context manager usage."""
    print("🔄 Context Manager Demo")
    print("=" * 50)

    print("📝 Using client as context manager:")

    with Meijer() as client:
        print(f"   Inside context: {client.auth_status.value}")
        print(f"   Client ID: {id(client)}")

        # Simulate some operations
        session_info = client.get_session_info()
        print(f"   Session info available: {bool(session_info)}")

    print(f"   Outside context: {client.auth_status.value}")
    print("   Note: Client is automatically logged out after context exit")

    print("\n✅ Context manager demo completed\n")


def demo_advanced_features():
    """Demonstrate advanced client features."""
    print("🚀 Advanced Features Demo")
    print("=" * 50)

    client = Meijer()

    print("🔧 Advanced features:")
    print("   • PKCE (Proof Key for Code Exchange) support")
    print("   • Automatic token refresh")
    print("   • Retry logic with exponential backoff")
    print("   • Comprehensive error handling")
    print("   • Full type hints and dataclasses")
    print("   • Session persistence and management")

    print("\n📊 Configuration options:")
    print(f"   • OAuth client ID: {client.oauth_config.client_id}")
    print(f"   • Authorization URL: {client.oauth_config.auth_url}")
    print(f"   • Token URL: {client.oauth_config.token_url}")
    print(f"   • Scope: {client.oauth_config.scope}")
    print(f"   • Redirect URI: {client.oauth_config.redirect_uri}")

    print("\n🌐 API base URLs:")
    print(f"   • API Base: {client.api_base}")
    print(f"   • ID Base: {client.id_base}")

    print("\n✅ Advanced features demo completed\n")


def main():
    """Run all demo functions."""
    print("🎯 Meijer Comprehensive Client - Full Demo")
    print("=" * 60)
    print()

    try:
        # Run all demos
        demo_basic_usage()
        time.sleep(1)

        demo_oauth_flow()
        time.sleep(1)

        demo_api_endpoints()
        time.sleep(1)

        demo_error_handling()
        time.sleep(1)

        demo_context_manager()
        time.sleep(1)

        demo_advanced_features()

        print("\n🎉 All demos completed successfully!")
        print("\n📚 Next steps:")
        print("   1. Run 'python test_meijer_comprehensive.py' to run tests")
        print("   2. Use 'python meijer_comprehensive.py' for interactive demo")
        print("   3. Check 'meijer_analysis_report.json' for network analysis")
        print("   4. Review 'analyze_log_with_mitmproxy.py' for log analysis")

    except KeyboardInterrupt:
        print("\n⏹️  Demo interrupted by user")
    except Exception as e:
        print(f"\n❌ Demo error: {e}")


if __name__ == "__main__":
    main()
