#!/usr/bin/env python3
"""
Demo script for requests-based Meijer authentication.

This script demonstrates how to use the pure requests library
for OAuth authentication without Selenium.
"""

import json
from meijer_comprehensive import MeijerComprehensiveClient, read_auth_file


def demo_requests_auth():
    """Demonstrate requests-based authentication."""
    print("🌐 Meijer Requests-Based Authentication Demo")
    print("=" * 50)
    
    try:
        # Read credentials from auth.txt
        print("📖 Reading credentials from auth.txt...")
        username, password = read_auth_file()
        print(f"📧 Username: {username}")
        print(f"🔑 Password: {'*' * len(password)}")
        print()
        
        # Create client
        client = MeijerComprehensiveClient(username, password)
        
        # Show OAuth configuration
        print("🔧 OAuth Configuration:")
        print(f"   Client ID: {client.oauth_config.client_id}")
        print(f"   Auth URL: {client.oauth_config.auth_url}")
        print(f"   Scope: {client.oauth_config.scope}")
        print()
        
        # Generate authorization URL
        print("🔗 Generating authorization URL...")
        auth_url, state, code_verifier = client.get_authorization_url()
        print(f"   State: {state}")
        print(f"   Code Verifier: {code_verifier[:20]}...")
        print()
        
        # Perform requests-based authentication
        print("🚀 Starting requests-based OAuth authentication...")
        print("🌐 Using pure requests library (no browser needed)")
        print("🔐 Credentials will be submitted programmatically")
        print("⚠️  Note: This method may not work if 2FA is required")
        print()
        
        if client.authenticate_with_requests(username, password):
            print("✅ Authentication successful!")
            
            # Show session info
            session_info = client.get_session_info()
            print(f"📊 Session Info: {json.dumps(session_info, indent=2)}")
            
            # Test API calls
            print("\n🧪 Testing API calls...")
            offers = client.get_offers(limit=3)
            print(f"🎯 Found {len(offers)} offers")
            
            stores = client.get_stores(zip_code="49525")
            print(f"🏪 Found {len(stores)} stores")
            
            # Show user info
            user_info = client.get_user_info()
            if user_info:
                print(f"👤 User: {user_info.name} ({user_info.email})")
            
        else:
            print("❌ Authentication failed")
            print("\n💡 This could be due to:")
            print("   - 2FA requirement (not supported in requests mode)")
            print("   - Captcha or other security measures")
            print("   - Changes in the login form structure")
            print("\n🔄 Try using Selenium mode instead: python demo_selenium.py")
    
    except FileNotFoundError as e:
        print(f"❌ {e}")
        print("Please create auth.txt with your Meijer credentials:")
        print("username=your_email@example.com")
        print("password=your_password")
    except ValueError as e:
        print(f"❌ {e}")
    except Exception as e:
        print(f"❌ Error: {e}")


def main():
    """Run the requests-based authentication demo."""
    print("🎯 Meijer Authentication - Requests vs Selenium")
    print("=" * 60)
    print()
    
    try:
        # Run requests demo
        demo_requests_auth()
        
        print("\n📚 Comparison:")
        print("   🌐 Requests-based (this demo):")
        print("      ✅ Faster, no browser needed")
        print("      ✅ Better for automation")
        print("      ❌ Limited 2FA support")
        print("      ❌ May not work with complex security")
        print()
        print("   🤖 Selenium-based (demo_selenium.py):")
        print("      ✅ Full browser automation")
        print("      ✅ Handles 2FA and complex flows")
        print("      ❌ Slower, requires browser")
        print("      ❌ More complex setup")
        print()
        print("💡 Choose based on your needs:")
        print("   - Use requests for simple automation without 2FA")
        print("   - Use Selenium for full browser automation with 2FA")
        
    except KeyboardInterrupt:
        print("\n⏹️  Demo interrupted by user")
    except Exception as e:
        print(f"\n❌ Demo error: {e}")


if __name__ == "__main__":
    main() 