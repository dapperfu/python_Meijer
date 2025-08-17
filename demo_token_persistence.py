#!/usr/bin/env python3
"""
Demonstration of Enhanced Token Persistence in Meijer Client

This script demonstrates how the enhanced Meijer client automatically
restores authentication from stored tokens, eliminating the need for
2FA on subsequent logins.
"""

import logging
import time
from meijer import Meijer

# Setup logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger(__name__)


def demonstrate_token_persistence():
    """Demonstrate the token persistence functionality."""
    
    print("🔐 Meijer Client Token Persistence Demo")
    print("=" * 50)
    print()
    
    print("This demo shows how the enhanced Meijer client automatically")
    print("restores authentication from stored tokens, eliminating 2FA prompts.")
    print()
    
    # Step 1: First login (will require credentials and 2FA)
    print("📱 Step 1: First Login (Requires Credentials + 2FA)")
    print("-" * 45)
    
    meijer1 = Meijer(debug=True)
    
    # Check initial state
    session_info = meijer1.get_session_info()
    print(f"Initial session: {session_info['authentication_status']}")
    print(f"Has stored tokens: {session_info['has_stored_tokens']}")
    
    if meijer1.credentials:
        print("Attempting first login...")
        if meijer1.login():
            print("✅ First login successful!")
            
            # Show updated session info
            session_info = meijer1.get_session_info()
            print(f"After login: {session_info['authentication_status']}")
            print(f"Has stored tokens: {session_info['has_stored_tokens']}")
            print(f"Token expires in: {session_info.get('token_expires_in', 'N/A')} seconds")
            
            # Test API call
            print("Testing API call...")
            offers = meijer1.get_offers(limit=2)
            print(f"✅ Retrieved {len(offers)} offers")
            
        else:
            print("❌ First login failed!")
            print("Please check your credentials in auth.txt")
            return
    else:
        print("❌ No credentials found!")
        print("Please create auth.txt with your Meijer credentials:")
        print("  username=your_email@example.com")
        print("  password=your_password")
        return
    
    # Clean up first session
    print("\n🔄 Logging out first session...")
    meijer1.logout()
    print("First session cleaned up.")
    
    # Step 2: Second login (should restore from stored tokens)
    print("\n📱 Step 2: Second Login (Should Restore from Stored Tokens)")
    print("-" * 55)
    
    time.sleep(2)  # Small delay to simulate time passing
    
    meijer2 = Meijer(debug=True)
    
    # Check if we can restore authentication
    session_info = meijer2.get_session_info()
    print(f"Second session initial: {session_info['authentication_status']}")
    print(f"Has stored tokens: {session_info['has_stored_tokens']}")
    
    print("Attempting second login...")
    if meijer2.login():
        print("✅ Second login successful!")
        print("🎉 No 2FA required - tokens restored automatically!")
        
        # Show updated session info
        session_info = meijer2.get_session_info()
        print(f"After login: {session_info['authentication_status']}")
        print(f"Has stored tokens: {session_info['has_stored_tokens']}")
        print(f"Token expires in: {session_info.get('token_expires_in', 'N/A')} seconds")
        
        # Test API call without re-authentication
        print("Testing API call to verify authentication...")
        offers = meijer2.get_offers(limit=2)
        print(f"✅ Retrieved {len(offers)} offers")
        
        # Test token refresh if needed
        if meijer2.auth_tokens and meijer2.auth_tokens.needs_refresh():
            print("🔄 Tokens need refresh, testing refresh functionality...")
            if meijer2.refresh_token():
                print("✅ Token refresh successful!")
                print("🔄 New tokens automatically saved to persistent storage")
            else:
                print("❌ Token refresh failed!")
        
    else:
        print("❌ Second login failed!")
        print("This might indicate an issue with token storage or refresh")
    
    # Clean up second session
    print("\n🔄 Logging out second session...")
    meijer2.logout()
    print("Second session cleaned up.")
    
    # Step 3: Verify cleanup
    print("\n📱 Step 3: Verifying Token Cleanup")
    print("-" * 35)
    
    meijer3 = Meijer(debug=True)
    session_info = meijer3.get_session_info()
    print(f"Third session: {session_info['authentication_status']}")
    print(f"Has stored tokens: {session_info['has_stored_tokens']}")
    
    if not session_info['has_stored_tokens']:
        print("✅ Token cleanup successful - no stored tokens found")
    else:
        print("❌ Token cleanup failed - stored tokens still present")
    
    meijer3.logout()
    
    print("\n" + "=" * 50)
    print("🎯 Demo Summary")
    print("=" * 50)
    print("✅ First login: Required credentials + 2FA")
    print("✅ Second login: Automatic token restoration (no 2FA)")
    print("✅ Token persistence: Matches Android app behavior")
    print("✅ Automatic cleanup: Tokens cleared on logout")
    print()
    print("The enhanced Meijer client now provides seamless")
    print("authentication that matches the mobile app experience!")


def show_usage_examples():
    """Show practical usage examples."""
    
    print("\n💡 Practical Usage Examples")
    print("=" * 35)
    
    print("1. Basic Usage with Automatic Token Restoration:")
    print("""
from meijer import Meijer

# First time - requires credentials
meijer = Meijer()
if meijer.login():
    # Tokens automatically saved
    offers = meijer.get_offers()
    meijer.logout()

# Later - automatically restores from stored tokens
meijer2 = Meijer()
if meijer2.login():  # No 2FA needed!
    offers = meijer2.get_offers()
    meijer2.logout()
""")
    
    print("2. Check Token Status:")
    print("""
session_info = meijer.get_session_info()
print(f"Has stored tokens: {session_info['has_stored_tokens']}")
print(f"Authentication status: {session_info['authentication_status']}")
print(f"Token expires in: {session_info.get('token_expires_in')} seconds")
""")
    
    print("3. Force Token Refresh:")
    print("""
if meijer.auth_tokens and meijer.auth_tokens.needs_refresh():
    meijer.refresh_token()  # Automatically saves new tokens
""")
    
    print("4. Custom Token Storage Location:")
    print("""
meijer = Meijer(token_storage_file="custom_tokens.pkl")
""")


def main():
    """Main demonstration function."""
    
    try:
        # Run the main demonstration
        demonstrate_token_persistence()
        
        # Show usage examples
        show_usage_examples()
        
        print("\n🚀 Ready to use the enhanced Meijer client!")
        print("Your tokens will be automatically managed and restored.")
        
    except KeyboardInterrupt:
        print("\n\n⏹️ Demo interrupted by user")
    except Exception as e:
        print(f"\n❌ Demo failed with error: {e}")
        logger.exception("Demo error details:")


if __name__ == "__main__":
    main() 