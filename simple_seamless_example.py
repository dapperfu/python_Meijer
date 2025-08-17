#!/usr/bin/env python3
"""
Simple Seamless Authentication Example
=====================================

This demonstrates the "magic" of config-based authentication.
No credentials needed - just import and use!
"""

from meijer_comprehensive import MeijerComprehensiveClient

def main():
    print("✨ SEAMLESS MEIJER AUTHENTICATION DEMO")
    print("=" * 40)
    print("Creating Meijer client with NO credentials...")
    print()
    
    # This is the magic! No credentials needed at all
    # The client automatically loads from ~/.config/meijer.txt
    meijer = MeijerComprehensiveClient("", "")  # Empty credentials!
    
    if meijer.auth_status.value == "authenticated":
        print("🎉 SUCCESS! Automatically authenticated!")
        
        # Show token info
        time_left = meijer.auth_tokens.time_until_expiry()
        print(f"⏰ Token expires in: {time_left}")
        
        # Test some API calls
        print(f"\n📊 Testing Meijer API calls...")
        
        try:
            # Shopping list
            print("📋 Getting shopping list...")
            response = meijer.session.get("https://api.meijer.com/loyalty/shoppinglist/GetList")
            if response.status_code == 200:
                data = response.json()
                print(f"   ✅ Shopping list: '{data.get('listName', 'Unknown')}'")
                print(f"   📊 Items: {data.get('totalCount', 0)}")
            else:
                print(f"   ❌ Failed: {response.status_code}")
        
        except Exception as e:
            print(f"   ❌ Error: {e}")
        
        print(f"\n✨ This is what seamless authentication looks like!")
        print(f"   - No username/password needed")
        print(f"   - No Bearer token extraction needed")
        print(f"   - Just import and use!")
        
    else:
        print("❌ Not authenticated")
        print("💡 Run the complete workflow first:")
        print("   python complete_workflow_example.py")

if __name__ == "__main__":
    main() 