#!/usr/bin/env python3
"""
Test script for the unified Meijer client.

This script tests all authentication methods and core functionality.
"""

import logging
from meijer import Meijer

def test_unified_client():
    """Test the unified Meijer client."""
    print("🚀 TESTING UNIFIED MEIJER CLIENT")
    print("=" * 60)
    
    logging.basicConfig(level=logging.INFO)
    
    with Meijer(debug=True) as meijer:
        try:
            # Test 1: Login (tries all methods automatically)
            print("\n1. 🔐 Testing unified login...")
            if meijer.login():
                print("✅ Login successful!")
                
                # Show session details
                session = meijer.get_session_info()
                print(f"   Status: {session['status']}")
                print(f"   Has tokens: {session['has_tokens']}")
                print(f"   Has stored tokens: {session['has_stored_tokens']}")
                print(f"   Token expires: {session['token_expires_at']}")
                
            else:
                print("❌ Login failed")
                print("\n💡 Available authentication methods:")
                print("   1. Create auth.txt with:")
                print("      username=your_email@example.com")
                print("      password=your_password")
                print()
                print("   2. Create bearer_auth.txt with:")
                print("      bearer_token=extracted_token_from_mitmproxy")
                print("      user_agent=mobile_app_user_agent")
                print()
                print("   3. Use interactive OAuth (will open browser)")
                return
            
            # Test 2: Shop & Scan functionality
            print("\n2. 🛒 Testing Shop & Scan...")
            shop_scan = meijer.shop_scan
            
            if shop_scan.is_enabled():
                print("✅ Shop & Scan is enabled")
                
                # Start trip
                if shop_scan.start_trip("52"):
                    print("✅ Shopping trip started")
                    
                    # Get trip summary
                    summary = shop_scan.get_trip_summary()
                    print(f"   Trip ID: {summary['trip_id']}")
                    print(f"   Store: {summary['store_id']}")
                    print(f"   Status: {summary['status']}")
                    
                    # Test item scanning (with fake barcodes)
                    print("\n   📱 Testing item scanning...")
                    test_barcodes = ["012345678905", "012345678912"]
                    
                    for i, barcode in enumerate(test_barcodes, 1):
                        print(f"   Scanning item {i}: {barcode}")
                        item = shop_scan.scan_item(barcode)
                        if item:
                            print(f"   ✅ Scanned: {item.description} - ${item.price}")
                        else:
                            print(f"   ❌ Failed to scan {barcode}")
                    
                    # Test cart functionality
                    cart = shop_scan.get_cart()
                    print(f"\n   🛍️ Cart has {len(cart)} items")
                    
                    if cart:
                        # Try to finalize checkout
                        print("   💳 Testing checkout...")
                        checkout = shop_scan.finalize_checkout()
                        if checkout:
                            print("   ✅ Checkout successful")
                        else:
                            print("   ❌ Checkout failed")
                else:
                    print("❌ Failed to start shopping trip")
            else:
                print("❌ Shop & Scan not available for this account")
            
            # Test 3: API functionality
            print("\n3. 🏪 Testing store API...")
            try:
                stores = meijer.get_stores(radius=10)
                print(f"✅ Found {len(stores)} stores within 10 miles")
                if stores:
                    print(f"   First store: {stores[0].get('name', 'Unknown')}")
            except Exception as e:
                print(f"❌ Store API failed: {e}")
            
            print("\n4. 🎟️ Testing offers API...")
            try:
                offers = meijer.get_offers(limit=5)
                print(f"✅ Found {len(offers)} offers")
                if offers:
                    print(f"   First offer: {offers[0].get('title', 'Unknown')}")
            except Exception as e:
                print(f"❌ Offers API failed: {e}")
            
            # Test 4: Authentication methods info
            print("\n5. 🔍 Authentication method detection...")
            
            # Check what auth files exist
            import os
            
            auth_methods = []
            if os.path.exists("auth.txt"):
                auth_methods.append("Credentials file (auth.txt)")
            if os.path.exists("bearer_auth.txt"):
                auth_methods.append("Bearer token file (bearer_auth.txt)")
            if meijer.token_storage.has_tokens():
                auth_methods.append("Stored tokens (persistent)")
            
            print(f"   Available methods: {', '.join(auth_methods) if auth_methods else 'None'}")
            
            # Test 5: Token persistence
            print("\n6. 💾 Testing token persistence...")
            if meijer.auth_tokens:
                print(f"   Current token expires: {meijer.auth_tokens.expires_at}")
                print(f"   Token storage file: {'exists' if meijer.token_storage.has_tokens() else 'not found'}")
                
                # Test token refresh if possible
                if meijer.auth_tokens.refresh_token:
                    print("   🔄 Refresh token available")
                else:
                    print("   ⚠️ No refresh token (bearer token auth)")
            
            print("\n" + "=" * 60)
            print("🎉 UNIFIED CLIENT TEST COMPLETE")
            print("=" * 60)
            
        except Exception as e:
            print(f"❌ Test failed with error: {e}")
            import traceback
            traceback.print_exc()

def test_authentication_methods():
    """Test specific authentication methods."""
    print("\n🔐 TESTING INDIVIDUAL AUTHENTICATION METHODS")
    print("-" * 60)
    
    # Test 1: Bearer token (if available)
    print("\n1. Testing Bearer Token Authentication...")
    meijer = Meijer()
    bearer_auth = meijer._load_bearer_auth()
    if bearer_auth:
        bearer_token, user_agent = bearer_auth
        print(f"   Found bearer token: {bearer_token[:20]}...")
        print(f"   User agent: {user_agent[:50]}...")
        
        if meijer.authenticate_with_bearer_token(bearer_token, user_agent):
            print("   ✅ Bearer token authentication successful")
        else:
            print("   ❌ Bearer token authentication failed")
    else:
        print("   ⚠️ No bearer_auth.txt file found")
    
    # Test 2: Stored tokens
    print("\n2. Testing Stored Token Restoration...")
    if meijer.token_storage.has_tokens():
        if meijer._restore_authentication():
            print("   ✅ Stored token restoration successful")
        else:
            print("   ❌ Stored token restoration failed")
    else:
        print("   ⚠️ No stored tokens found")
    
    # Test 3: Credentials (if available and Selenium installed)
    print("\n3. Testing Credential Authentication...")
    if meijer.credentials:
        try:
            from meijer import SELENIUM_AVAILABLE
            if SELENIUM_AVAILABLE:
                print("   📋 Credentials available, Selenium available")
                print("   ⚠️ Skipping automated test (requires user interaction)")
            else:
                print("   📋 Credentials available, but Selenium not installed")
                print("   💡 Install with: pip install selenium webdriver-manager")
        except:
            print("   ⚠️ Error checking Selenium availability")
    else:
        print("   ⚠️ No auth.txt file found")
    
    meijer.session.close()

def show_setup_instructions():
    """Show setup instructions for different authentication methods."""
    print("\n📋 SETUP INSTRUCTIONS")
    print("=" * 60)
    
    print("\n🔐 Authentication Methods (in priority order):")
    print()
    
    print("1. 💾 PERSISTENT TOKENS (Recommended)")
    print("   - Automatically saved after successful login")
    print("   - No setup required after first login")
    print("   - Eliminates 2FA prompts")
    print()
    
    print("2. 🎫 BEARER TOKEN (For extracted tokens)")
    print("   Create bearer_auth.txt with:")
    print("   bearer_token=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6...")
    print("   user_agent=Meijer/101200000 okhttp/4.12.0...")
    print()
    
    print("3. 📧 CREDENTIALS (For automation)")
    print("   Create auth.txt with:")
    print("   username=your_email@example.com")
    print("   password=your_password")
    print("   Requires: pip install selenium webdriver-manager")
    print()
    
    print("4. 🌐 INTERACTIVE OAUTH (Manual)")
    print("   - Opens browser for manual login")
    print("   - Used when no other methods available")
    print("   - Requires copy/paste of redirect URL")
    print()
    
    print("🎯 RECOMMENDED SETUP:")
    print("   1. Create auth.txt with your credentials")
    print("   2. Run the client once to authenticate")
    print("   3. Tokens will be saved for future use")
    print("   4. Delete auth.txt for security (optional)")

if __name__ == "__main__":
    test_unified_client()
    test_authentication_methods()
    show_setup_instructions() 