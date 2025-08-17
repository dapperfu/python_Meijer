#!/usr/bin/env python3
"""
Meijer Offers Demo
==================

Demonstrates offers/coupons retrieval using the main Meijer API client.
Shows available offers, deals, and promotional content.
"""

from meijer import Meijer

def demo_offers():
    """Demo offers functionality."""
    print("🎫 Meijer Offers Demo")
    print("=" * 22)
    
    # Initialize client
    client = Meijer("", "")
    
    try:
        # Get available offers
        print("\n📋 Getting available offers...")
        offers = client.get_offers(limit=20)
        
        print(f"Found {len(offers)} offers:")
        
        for i, offer in enumerate(offers[:10], 1):  # Show first 10
            print(f"\n{i}. {offer.get('title', 'No title')}")
            
            # Show offer details
            if 'description' in offer:
                print(f"   Description: {offer['description']}")
            
            if 'validFrom' in offer:
                print(f"   Valid from: {offer['validFrom']}")
                
            if 'validTo' in offer:
                print(f"   Valid to: {offer['validTo']}")
            
            if 'offerType' in offer:
                print(f"   Type: {offer['offerType']}")
            
            # Show savings amount if available
            if 'savingsAmount' in offer:
                print(f"   Savings: ${offer['savingsAmount']}")
            elif 'discount' in offer:
                print(f"   Discount: {offer['discount']}")
        
        if len(offers) > 10:
            print(f"\n... and {len(offers) - 10} more offers")
        
        # Show offer categories
        offer_types = {}
        for offer in offers:
            offer_type = offer.get('offerType', 'Unknown')
            offer_types[offer_type] = offer_types.get(offer_type, 0) + 1
        
        print(f"\n📊 Offer types breakdown:")
        for offer_type, count in sorted(offer_types.items()):
            print(f"  • {offer_type}: {count} offers")
            
    except Exception as e:
        print(f"❌ Error getting offers: {e}")

def demo_user_info():
    """Demo getting user information."""
    print("\n👤 User Information")
    print("=" * 20)
    
    client = Meijer("", "")
    
    try:
        user_info = client.get_user_info()
        
        if user_info:
            print("User details:")
            print(f"  • Name: {user_info.first_name} {user_info.last_name}")
            print(f"  • Email: {user_info.email}")
            print(f"  • Member ID: {user_info.member_id}")
            print(f"  • mPerks ID: {user_info.mperks_id}")
        else:
            print("No user information available")
            
    except Exception as e:
        print(f"❌ Error getting user info: {e}")

def demo_session_info():
    """Demo getting session information."""
    print("\n🔐 Session Information")
    print("=" * 23)
    
    client = Meijer("", "")
    
    try:
        session = client.get_session_info()
        
        print("Session details:")
        for key, value in session.items():
            if key not in ['bearer_token', 'refresh_token']:  # Don't show sensitive data
                print(f"  • {key}: {value}")
                
    except Exception as e:
        print(f"❌ Error getting session info: {e}")

def main():
    """Run all offer demos."""
    try:
        demo_offers()
        demo_user_info()
        demo_session_info()
        
        print(f"\n✅ Offers demos completed successfully!")
        print(f"\n💡 Key features demonstrated:")
        print(f"  • Available offers/coupons")
        print(f"  • Offer details and categories")
        print(f"  • User account information")
        print(f"  • Session management")
        
    except Exception as e:
        print(f"❌ Demo failed: {e}")

if __name__ == "__main__":
    main() 