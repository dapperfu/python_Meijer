#!/usr/bin/env python3
"""
Demo script for Selenium-based Meijer authentication.

This script demonstrates how to use the Selenium authentication
using credentials from auth.txt file.
"""

import json
from meijer_selenium_simple import MeijerSeleniumClient, read_auth_file


def demo_selenium_auth():
    """Demonstrate Selenium-based authentication."""
    print("🤖 Meijer Selenium Authentication Demo")
    print("=" * 50)
    
    try:
        # Read credentials from auth.txt
        print("📖 Reading credentials from auth.txt...")
        username, password = read_auth_file()
        print(f"📧 Username: {username}")
        print(f"🔑 Password: {'*' * len(password)}")
        print()
        
        # Create client
        client = MeijerSeleniumClient(username, password)
        
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
        
        # Perform automated login
        print("🚀 Starting Selenium-based OAuth authentication...")
        print("📱 A Chrome browser will open automatically")
        print("🔐 Credentials will be filled in automatically")
        print("⚠️  If MFA is required, you'll need to enter the code manually")
        print()
        
        if client.login_with_selenium(headless=False):
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
    
    except FileNotFoundError as e:
        print(f"❌ {e}")
        print("Please create auth.txt with your Meijer credentials:")
        print("username=your_email@example.com")
        print("password=your_password")
    except ValueError as e:
        print(f"❌ {e}")
    except Exception as e:
        print(f"❌ Error: {e}")


def demo_headless_mode():
    """Demonstrate headless mode authentication."""
    print("\n👻 Headless Mode Demo")
    print("=" * 30)
    
    try:
        # Read credentials from auth.txt
        username, password = read_auth_file()
        print(f"📧 Using credentials for: {username}")
        
        client = MeijerSeleniumClient(username, password)
        
        print("🚀 Starting headless authentication...")
        print("📱 Browser will run in background (no visible window)")
        
        if client.login_with_selenium(headless=True):
            print("✅ Headless authentication successful!")
            
            session_info = client.get_session_info()
            print(f"📊 Session Info: {json.dumps(session_info, indent=2)}")
            
        else:
            print("❌ Headless authentication failed")
    
    except FileNotFoundError as e:
        print(f"❌ {e}")
    except ValueError as e:
        print(f"❌ {e}")
    except Exception as e:
        print(f"❌ Error: {e}")


def main():
    """Run the Selenium authentication demo."""
    print("🎯 Meijer Selenium Authentication - Full Demo")
    print("=" * 60)
    print()
    
    try:
        # Run main demo
        demo_selenium_auth()
        
        # Run headless demo
        demo_headless_mode()
        
        print("\n🎉 All demos completed!")
        print("\n📚 Next steps:")
        print("   1. Ensure auth.txt contains your Meijer credentials")
        print("   2. Run: python meijer_selenium_simple.py")
        print("   3. Or use: python demo_selenium.py")
        print("   4. Check the browser automation in action!")
        
    except KeyboardInterrupt:
        print("\n⏹️  Demo interrupted by user")
    except Exception as e:
        print(f"\n❌ Demo error: {e}")


if __name__ == "__main__":
    main() 