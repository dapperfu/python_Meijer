#!/usr/bin/env python3
"""
Demo script for Meijer Config-Based Authentication
Tests the new ~/.config/meijer.txt token storage and automatic loading.
"""

from meijer_comprehensive import MeijerComprehensiveClient, read_bearer_auth_file

def main():
    """Demo config-based authentication."""
    print("🔧 Meijer Config-Based Authentication Demo")
    print("=" * 50)
    
    # Create client (we can use dummy credentials since we're bypassing OAuth)
    client = MeijerComprehensiveClient("dummy", "dummy")
    
    print(f"📁 Config file location: {client.config_file}")
    
    # Check if we already have valid tokens loaded from config
    if client.auth_status.value == "authenticated":
        print("✅ Already authenticated from saved config!")
        time_left = client.auth_tokens.time_until_expiry()
        print(f"⏰ Token expires in: {time_left}")
        
        # Test API access
        print(f"\n📊 Testing API access...")
        try:
            response = client.session.get("https://api.meijer.com/loyalty/shoppinglist/GetList")
            if response.status_code == 200:
                data = response.json()
                print(f"✅ API access working! Got shopping list with {len(data.get('listItems', []))} items")
            elif response.status_code == 401:
                print("❌ Token expired, need to re-authenticate")
                client.clear_config()
            else:
                print(f"⚠️  Unexpected response: {response.status_code}")
        except Exception as e:
            print(f"❌ API test failed: {e}")
    else:
        print("🔐 No valid tokens found in config, need to authenticate...")
        
        try:
            # Read bearer token from file
            bearer_token, user_agent = read_bearer_auth_file()
            print(f"📋 Bearer token loaded: {bearer_token[:30]}...{bearer_token[-15:]}")
            
            # Authenticate and automatically save to config
            print(f"\n🚀 Authenticating and saving to config...")
            success = client.authenticate_with_bearer_token(bearer_token, user_agent)
            
            if success:
                print("🎉 Authentication successful and saved to config!")
                time_left = client.auth_tokens.time_until_expiry()
                print(f"⏰ Token expires in: {time_left}")
                
                # Test API access
                print(f"\n📊 Testing API access...")
                response = client.session.get("https://api.meijer.com/loyalty/shoppinglist/GetList")
                if response.status_code == 200:
                    data = response.json()
                    print(f"✅ API access working! Got shopping list with {len(data.get('listItems', []))} items")
                    print(f"📋 List name: {data.get('listName', 'Unknown')}")
                    print(f"📊 Total count: {data.get('totalCount', 0)}")
                else:
                    print(f"⚠️  API test failed: {response.status_code}")
            else:
                print("❌ Authentication failed")
                
        except FileNotFoundError:
            print("❌ Bearer token file not found!")
            print("💡 Extract a Bearer token first with:")
            print("   python extract_bearer_token.py")
        except Exception as e:
            print(f"❌ Demo failed: {e}")
            import traceback
            traceback.print_exc()
    
    print(f"\n🔧 Config Management Commands:")
    print(f"   📁 Config location: {client.config_file}")
    print(f"   🗑️  Clear config: client.clear_config()")
    print(f"   🔄 Auto-refresh: Happens automatically when tokens expire")
    
    print(f"\n✅ Config-based authentication demo completed!")

if __name__ == "__main__":
    main() 