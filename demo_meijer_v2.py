#!/usr/bin/env python3
"""
Simple demo script for Meijer v2 API client.
"""

from meijer import Meijer, MeijerError

def main():
    print("🚀 Meijer v2 Demo")
    print("=" * 40)
    
    try:
        # Create client
        meijer = Meijer(debug=True)
        print("✅ Client created")
        
        # Try to login
        print("\n🔐 Attempting login...")
        if meijer.login():
            print("✅ Login successful!")
            
            # Get session info
            session = meijer.get_session_info()
            print(f"Session: {session['authentication_status']}")
            
            # Get user info
            user = meijer.get_user_info()
            if user:
                print(f"User: {user.first_name} {user.last_name}")
            else:
                print("No user info available")
            
            # Get offers
            print("\n🎯 Getting offers...")
            offers = meijer.get_offers(limit=3)
            print(f"Retrieved {len(offers)} offers")
            
            # Get home cards
            print("\n🏠 Getting home cards...")
            home_cards = meijer.get_home_cards()
            print(f"Retrieved {len(home_cards)} home cards")
            
            # Get special offers
            print("\n⭐ Getting special offers...")
            special_offers = meijer.get_special_offers()
            print(f"Retrieved {len(special_offers)} special offers")
            
            # Get stores
            print("\n🏪 Getting stores...")
            stores = meijer.get_stores(radius=10)
            print(f"Retrieved {len(stores)} stores")
            
        else:
            print("❌ Login failed!")
            print("\n💡 Try using interactive authentication:")
            print("   meijer.authenticate_interactive()")
            
    except Exception as e:
        print(f"❌ Error: {e}")

if __name__ == "__main__":
    main() 