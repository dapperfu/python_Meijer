#!/usr/bin/env python3
"""
Demo script for Meijer Bearer Token Authentication
Uses pre-extracted Bearer token from mitmproxy logs as a temporary authentication bypass.
"""

from meijer import Meijer, read_bearer_auth_file

def main():
    """Demo Bearer token authentication."""
    print("🎫 Meijer Bearer Token Authentication Demo")
    print("=" * 50)
    
    try:
        # Read the bearer token
        bearer_token, user_agent = read_bearer_auth_file()
        print(f"📋 Bearer token loaded: {bearer_token[:30]}...{bearer_token[-15:]}")
        print(f"🤖 User-Agent: {user_agent}")
        
        # Create client (we can use dummy credentials since we're bypassing OAuth)
        client = Meijer("dummy", "dummy")
        
        # Authenticate with Bearer token
        print(f"\n🚀 Attempting Bearer token authentication...")
        success = client.login_with_bearer_token()
        
        if success:
            print("🎉 Bearer token authentication successful!")
            
            # Test various API endpoints
            print(f"\n📊 Testing API endpoints...")
            
            # Test 1: Get shopping list
            print(f"\n1️⃣  Testing shopping list...")
            shopping_list = client.get_shopping_list()
            if shopping_list:
                print(f"   ✅ Shopping list retrieved: {len(shopping_list)} items")
                if shopping_list:
                    print(f"   📝 Sample item: {shopping_list[0] if isinstance(shopping_list, list) else 'Data available'}")
            else:
                print(f"   ℹ️  No shopping list items or method needs implementation")
            
            # Test 2: Get offers
            print(f"\n2️⃣  Testing offers...")
            offers = client.get_offers()
            if offers:
                print(f"   ✅ Offers retrieved: {len(offers)} offers")
                if offers:
                    print(f"   🎯 Sample offer: {offers[0] if isinstance(offers, list) else 'Data available'}")
            else:
                print(f"   ℹ️  No offers available or method needs implementation")
            
            # Test 3: Get user info
            print(f"\n3️⃣  Testing user info...")
            user_info = client.get_user_info()
            if user_info:
                print(f"   ✅ User info retrieved: {user_info}")
            else:
                print(f"   ℹ️  User info not available or method needs implementation")
            
            # Test 4: Get stores
            print(f"\n4️⃣  Testing stores...")
            stores = client.get_stores()
            if stores:
                print(f"   ✅ Stores retrieved: {len(stores)} stores")
                if stores:
                    print(f"   🏪 Sample store: {stores[0] if isinstance(stores, list) else 'Data available'}")
            else:
                print(f"   ℹ️  No stores available or method needs implementation")
            
            # Test 5: Direct API call
            print(f"\n5️⃣  Testing direct API call...")
            try:
                response = client.session.get("https://api.meijer.com/loyalty/shoppinglist/GetList")
                print(f"   📡 Direct API call status: {response.status_code}")
                if response.status_code == 200:
                    data = response.json()
                    print(f"   📊 Response data type: {type(data)}")
                    if isinstance(data, dict):
                        print(f"   🔑 Response keys: {list(data.keys())}")
                elif response.status_code == 401:
                    print(f"   ❌ Token expired or invalid")
                else:
                    print(f"   ⚠️  Unexpected status: {response.text[:100]}...")
            except Exception as e:
                print(f"   ❌ Direct API call failed: {e}")
            
            print(f"\n✅ Bearer token demo completed successfully!")
            
        else:
            print("❌ Bearer token authentication failed")
            print("💡 The token may have expired. Try extracting a fresh token with:")
            print("   python extract_bearer_token.py")
            
    except FileNotFoundError:
        print("❌ Bearer token file not found!")
        print("💡 Extract a Bearer token first with:")
        print("   python extract_bearer_token.py")
    except Exception as e:
        print(f"❌ Demo failed: {e}")
        import traceback
        traceback.print_exc()

if __name__ == "__main__":
    main() 