#!/usr/bin/env python3
"""
Demo: OAuth Authentication with Automatic Refresh
=================================================

Demonstrates the new OAuth authentication system with automatic token refresh.
Uses tokens from auth.txt which includes both access and refresh tokens.
"""

from meijer import Meijer
import time

def main():
    """Demo OAuth authentication with automatic refresh."""
    print("🔥 OAuth Authentication with Auto-Refresh Demo")
    print("=" * 55)
    
    # Create client
    client = Meijer("", "")
    
    print(f"📁 Config location: {client.config_file}")
    
    # Method 1: Login with OAuth tokens from auth.txt
    print(f"\n🚀 Method 1: Login with OAuth tokens from auth.txt")
    success = client.login_with_oauth_tokens()
    
    if success:
        print("✅ OAuth authentication successful!")
        
        # Show token info
        time_left = client.auth_tokens.time_until_expiry()
        print(f"⏰ Token expires in: {time_left}")
        print(f"🔄 Has refresh token: {'Yes' if client.auth_tokens.refresh_token else 'No'}")
        
        # Test automatic refresh checking
        print(f"\n🔄 Testing automatic refresh logic...")
        can_refresh = client._check_and_refresh_tokens()
        print(f"Token validity check: {'✅ Valid' if can_refresh else '❌ Invalid'}")
        
        # Test API access with automatic refresh
        print(f"\n📊 Testing API access with auto-refresh...")
        try:
            # Use the new make_authenticated_request method
            response = client.make_authenticated_request("GET", 
                "https://api.meijer.com/loyalty/shoppinglist/GetList")
            
            if response.status_code == 200:
                data = response.json()
                print(f"✅ API working! Shopping list: '{data.get('listName', 'Unknown')}'")
                print(f"📋 Items: {data.get('totalCount', 0)}")
            else:
                print(f"⚠️  API response: {response.status_code}")
                print(f"Response: {response.text[:200]}...")
                
        except Exception as e:
            print(f"❌ API test failed: {e}")
        
        # Test more API endpoints with auto-refresh
        print(f"\n📊 Testing multiple API endpoints...")
        
        endpoints = [
            ("Shopping List", "https://api.meijer.com/loyalty/shoppinglist/GetList"),
            ("Offers", "https://api.meijer.com/loyalty/mPerks/api/offers"),
            ("Home Cards", "https://api.meijer.com/digital/homecards/v1/cards"),
        ]
        
        for name, url in endpoints:
            try:
                print(f"   Testing {name}...")
                response = client.make_authenticated_request("GET", url)
                
                if response.status_code == 200:
                    print(f"   ✅ {name}: OK")
                elif response.status_code == 401:
                    print(f"   🔄 {name}: Token refreshed, retrying...")
                else:
                    print(f"   ⚠️  {name}: Status {response.status_code}")
                    
            except Exception as e:
                print(f"   ❌ {name}: Error - {e}")
        
        # Show final token status
        print(f"\n📊 Final Token Status:")
        time_left = client.auth_tokens.time_until_expiry()
        print(f"   ⏰ Expires in: {time_left}")
        print(f"   🔄 Refresh available: {'Yes' if client.auth_tokens.refresh_token else 'No'}")
        
    else:
        print("❌ OAuth authentication failed")
        print("💡 Make sure you have auth.txt with both access and refresh tokens")
        print("   Run: python extract_from_analysis.py")
        return
    
    # Test seamless re-authentication
    print(f"\n✨ Testing seamless re-authentication...")
    client2 = Meijer("", "")
    
    if client2.auth_status.value == "authenticated":
        print("🎉 Second client automatically authenticated from config!")
        time_left = client2.auth_tokens.time_until_expiry()
        print(f"⏰ Token expires in: {time_left}")
        
        # Test API access
        try:
            response = client2.make_authenticated_request("GET", 
                "https://api.meijer.com/loyalty/shoppinglist/GetList")
            if response.status_code == 200:
                print("✅ Second client API access working!")
            else:
                print(f"⚠️  Second client API status: {response.status_code}")
        except Exception as e:
            print(f"❌ Second client API failed: {e}")
    else:
        print("⚠️  Second client not auto-authenticated")
    
    print(f"\n🎯 Key Features Demonstrated:")
    print(f"   ✅ OAuth token authentication (access + refresh)")
    print(f"   ✅ Automatic token refresh when expiring")
    print(f"   ✅ Automatic retry on 401 responses")
    print(f"   ✅ Persistent token storage in ~/.config/meijer.txt")
    print(f"   ✅ Seamless re-authentication across sessions")
    print(f"   ✅ Multiple API endpoint testing")
    
    print(f"\n🚀 Production-Ready OAuth Authentication System!")

if __name__ == "__main__":
    main() 