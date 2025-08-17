#!/usr/bin/env python3
"""
Complete Workflow Example: From Bearer Token Extraction to Seamless Authentication
================================================================================

This example demonstrates the complete flow:
1. Extract Bearer token from meijer2.log
2. Put it into auth.txt 
3. Use config-based authentication 
4. Seamless login without credentials: meijer = Meijer()

Run this script to see the complete workflow in action.
"""

import os
import sys
from pathlib import Path

def step_1_extract_bearer_token():
    """Step 1: Extract Bearer token from meijer2.log"""
    print("🔍 STEP 1: Extracting Bearer Token from meijer2.log")
    print("=" * 55)
    
    # Import and run the bearer token extraction
    from extract_bearer_token import load_flows, extract_bearer_tokens, find_valid_bearer_token
    
    try:
        # Load flows from meijer2.log
        flows = load_flows("meijer2.log")
        print(f"📊 Loaded {len(flows)} flows")
        
        # Extract Bearer tokens
        bearer_requests = extract_bearer_tokens(flows)
        print(f"🎯 Found {len(bearer_requests)} requests with Bearer tokens")
        
        if not bearer_requests:
            print("❌ No Bearer tokens found in log")
            return None, None
        
        # Find the best Bearer token
        valid_token = find_valid_bearer_token(bearer_requests)
        
        if valid_token:
            bearer_token = valid_token['bearer_token']
            user_agent = valid_token['user_agent']
            timestamp = valid_token['timestamp']
            
            print(f"✅ Bearer token extracted!")
            print(f"🎫 Token: {bearer_token[:30]}...{bearer_token[-15:]}")
            print(f"🤖 User-Agent: {user_agent}")
            print(f"🕒 Timestamp: {timestamp}")
            
            return bearer_token, user_agent
        else:
            print("❌ No valid Bearer token found")
            return None, None
        
    except Exception as e:
        print(f"❌ Failed to extract Bearer token: {e}")
        import traceback
        traceback.print_exc()
        return None, None

def step_2_put_into_auth_txt(bearer_token, user_agent):
    """Step 2: Put Bearer token into auth.txt format"""
    print(f"\n🔧 STEP 2: Writing Bearer Token to auth.txt")
    print("=" * 45)
    
    if not bearer_token:
        print("❌ No Bearer token to write")
        return False
    
    # Write in the format: bearer=<token>
    auth_content = f"bearer={bearer_token}\nuser_agent={user_agent}\n"
    
    with open("auth.txt", "w") as f:
        f.write(auth_content)
    
    print(f"✅ Bearer token written to auth.txt")
    print(f"📄 Content preview:")
    print(f"   bearer={bearer_token[:30]}...{bearer_token[-15:]}")
    print(f"   user_agent={user_agent}")
    
    return True

def step_3_first_login_with_config():
    """Step 3: First login using Bearer token and save to config"""
    print(f"\n🚀 STEP 3: First Login (Bearer → Config)")
    print("=" * 40)
    
    from meijer_comprehensive import MeijerComprehensiveClient
    
    # Create client (dummy credentials since we're using Bearer)
    client = MeijerComprehensiveClient("dummy", "dummy")
    print(f"📁 Config location: {client.config_file}")
    
    # Check if already authenticated from config
    if client.auth_status.value == "authenticated":
        print("ℹ️  Already authenticated from existing config!")
        return client
    
    # Read Bearer token from auth.txt
    print("📋 Reading Bearer token from auth.txt...")
    try:
        with open("auth.txt", "r") as f:
            content = f.read()
        
        bearer_token = None
        user_agent = None
        
        for line in content.strip().split('\n'):
            if line.startswith('bearer='):
                bearer_token = line.split('=', 1)[1]
            elif line.startswith('user_agent='):
                user_agent = line.split('=', 1)[1]
        
        if not bearer_token:
            print("❌ No bearer token found in auth.txt")
            return None
        
        print(f"🎫 Bearer token loaded: {bearer_token[:30]}...{bearer_token[-15:]}")
        
        # Authenticate with Bearer token (automatically saves to config)
        print("🔐 Authenticating with Bearer token...")
        success = client.authenticate_with_bearer_token(bearer_token, user_agent)
        
        if success:
            print("✅ Authentication successful and saved to config!")
            time_left = client.auth_tokens.time_until_expiry()
            print(f"⏰ Token valid for: {time_left}")
            return client
        else:
            print("❌ Authentication failed")
            return None
            
    except FileNotFoundError:
        print("❌ auth.txt not found")
        return None
    except Exception as e:
        print(f"❌ Error: {e}")
        return None

def step_4_seamless_login():
    """Step 4: Seamless login without any credentials"""
    print(f"\n🎯 STEP 4: Seamless Login (No Credentials Needed!)")
    print("=" * 55)
    
    from meijer_comprehensive import MeijerComprehensiveClient
    
    # This is the magic - no credentials needed!
    # The client automatically loads tokens from ~/.config/meijer.txt
    print("✨ Creating client with NO credentials:")
    print("   client = MeijerComprehensiveClient('dummy', 'dummy')")
    
    client = MeijerComprehensiveClient("dummy", "dummy")
    
    if client.auth_status.value == "authenticated":
        print("🎉 SUCCESS! Automatically authenticated from config!")
        time_left = client.auth_tokens.time_until_expiry()
        print(f"⏰ Token valid for: {time_left}")
        print(f"🔑 Using saved token: {client.auth_tokens.access_token[:30]}...{client.auth_tokens.access_token[-15:]}")
        
        # Test API access
        print(f"\n📊 Testing API access...")
        try:
            response = client.session.get("https://api.meijer.com/loyalty/shoppinglist/GetList")
            if response.status_code == 200:
                data = response.json()
                print(f"✅ API working! Shopping list: '{data.get('listName', 'Unknown')}'")
                print(f"📋 Items: {data.get('totalCount', 0)}")
            else:
                print(f"⚠️  API response: {response.status_code}")
        except Exception as e:
            print(f"❌ API test failed: {e}")
        
        return client
    else:
        print("❌ Not authenticated - config loading failed")
        return None

def step_5_demonstrate_refresh():
    """Step 5: Demonstrate token refresh (when available)"""
    print(f"\n🔄 STEP 5: Token Refresh Demonstration")
    print("=" * 40)
    
    from meijer_comprehensive import MeijerComprehensiveClient
    
    client = MeijerComprehensiveClient("dummy", "dummy")
    
    if client.auth_status.value != "authenticated":
        print("❌ Not authenticated - cannot demonstrate refresh")
        return
    
    print(f"🔍 Current token status:")
    time_left = client.auth_tokens.time_until_expiry()
    print(f"   ⏰ Expires in: {time_left}")
    print(f"   🔄 Refresh token: {'Available' if client.auth_tokens.refresh_token else 'Not available'}")
    
    if client.auth_tokens.refresh_token:
        print(f"\n🔄 Attempting token refresh...")
        success = client._refresh_tokens()
        if success:
            print("✅ Token refreshed successfully!")
            new_time_left = client.auth_tokens.time_until_expiry()
            print(f"⏰ New expiration: {new_time_left}")
        else:
            print("❌ Token refresh failed")
    else:
        print("ℹ️  Bearer tokens from logs don't include refresh tokens")
        print("💡 Full OAuth flow would provide refresh tokens")

def demonstrate_future_usage():
    """Demonstrate how seamless future usage will be"""
    print(f"\n🚀 FUTURE USAGE EXAMPLE")
    print("=" * 25)
    print("After this setup, any future script can simply do:")
    print()
    print("```python")
    print("from meijer_comprehensive import MeijerComprehensiveClient")
    print()
    print("# Magic! No credentials needed")
    print("meijer = MeijerComprehensiveClient('', '')  # or any dummy values")
    print("# Client automatically loads tokens from ~/.config/meijer.txt")
    print()
    print("# Immediately ready to use!")
    print("response = meijer.session.get('https://api.meijer.com/loyalty/...')")
    print("```")
    print()
    print("🎯 Benefits:")
    print("   ✅ No credentials in code")
    print("   ✅ No manual token management") 
    print("   ✅ Automatic expiration handling")
    print("   ✅ Automatic refresh (when available)")
    print("   ✅ Persistent across sessions")

def main():
    """Run the complete workflow example."""
    print("🔥 COMPLETE MEIJER AUTHENTICATION WORKFLOW")
    print("=" * 70)
    print("From Bearer extraction to seamless authentication")
    print()
    
    # Step 1: Extract Bearer token
    bearer_token, user_agent = step_1_extract_bearer_token()
    if not bearer_token:
        print("❌ Cannot continue without Bearer token")
        return
    
    # Step 2: Put into auth.txt
    if not step_2_put_into_auth_txt(bearer_token, user_agent):
        print("❌ Cannot continue without auth.txt")
        return
    
    # Step 3: First login with config save
    client = step_3_first_login_with_config()
    if not client:
        print("❌ Cannot continue without successful login")
        return
    
    # Step 4: Demonstrate seamless login
    seamless_client = step_4_seamless_login()
    if not seamless_client:
        print("❌ Seamless login failed")
        return
    
    # Step 5: Demonstrate refresh
    step_5_demonstrate_refresh()
    
    # Show future usage
    demonstrate_future_usage()
    
    print(f"\n🎉 WORKFLOW COMPLETE!")
    print("=" * 25)
    print("✅ Bearer token extracted from meijer2.log")
    print("✅ Token saved to auth.txt")
    print("✅ Config-based authentication working")
    print("✅ Seamless login without credentials")
    print("✅ Persistent authentication across sessions")

if __name__ == "__main__":
    main() 