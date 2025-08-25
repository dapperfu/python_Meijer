#!/usr/bin/env python3
"""
Simple Example: Using the Minimal Akamai Fix

This example shows how to use the simple fix that only applies mobile app headers
to login endpoints, leaving all other API calls unchanged.
"""

import sys
import os

# Add the parent directory to the path for imports
current_dir = os.path.dirname(os.path.abspath(__file__))
parent_dir = os.path.dirname(current_dir)
sys.path.insert(0, parent_dir)

from meijer.simple_akamai_fix import create_login_friendly_session, get_mobile_app_headers


def demonstrate_simple_fix():
    """Demonstrate the simple Akamai fix that only affects login endpoints."""
    
    print("🔧 SIMPLE AKAMAI FIX - LOGIN ENDPOINTS ONLY")
    print("=" * 60)
    
    # Create a session that automatically handles login headers
    session = create_login_friendly_session()
    
    print("✅ Session created with automatic login header handling")
    print("📱 Mobile app headers will be applied only to login endpoints")
    print("🔒 Regular API calls remain unchanged")
    
    # Test 1: Login endpoint (should get mobile headers)
    print("\n🧪 TEST 1: Login Endpoint")
    print("-" * 30)
    
    login_url = "https://id.meijer.com/idp/idx/identify"
    print(f"📡 Testing: {login_url}")
    
    # This request will automatically get mobile app headers
    try:
        response = session.get(login_url)
        print(f"✅ Status: {response.status_code}")
        print(f"📋 Headers used: {dict(response.request.headers)}")
    except Exception as e:
        print(f"❌ Error: {e}")
    
    # Test 2: Regular API endpoint (should NOT get mobile headers)
    print("\n🧪 TEST 2: Regular API Endpoint")
    print("-" * 30)
    
    api_url = "https://api.meijer.com/api/stores"
    print(f"📡 Testing: {api_url}")
    
    # This request should use normal headers
    try:
        response = session.get(api_url)
        print(f"✅ Status: {response.status_code}")
        print(f"📋 Headers used: {dict(response.request.headers)}")
    except Exception as e:
        print(f"❌ Error: {e}")
    
    # Test 3: Show the mobile app headers
    print("\n📱 MOBILE APP HEADERS")
    print("-" * 30)
    
    headers = get_mobile_app_headers()
    for key, value in headers.items():
        print(f"  {key}: {value[:60]}{'...' if len(value) > 60 else ''}")


def show_integration_example():
    """Show how to integrate this with existing code."""
    
    print("\n🔗 INTEGRATION EXAMPLE")
    print("=" * 60)
    
    print("💡 To use this in your existing Meijer client:")
    print()
    print("1. Import the simple fix:")
    print("   from meijer.simple_akamai_fix import create_login_friendly_session")
    print()
    print("2. Create a login-friendly session:")
    print("   session = create_login_friendly_session()")
    print()
    print("3. Use it for authentication:")
    print("   # This will automatically get mobile headers")
    print("   response = session.post('/idp/idx/identify', data=credentials)")
    print()
    print("4. Regular API calls remain unchanged:")
    print("   # This uses normal headers")
    print("   stores = session.get('/api/stores')")
    print()
    print("✅ That's it! No complex bypass strategies needed.")


if __name__ == "__main__":
    demonstrate_simple_fix()
    show_integration_example()
