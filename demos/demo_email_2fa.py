#!/usr/bin/env python3
"""
Demo script for Email 2FA functionality.

This script demonstrates how to set up and use the email 2FA system
for Meijer authentication.
"""

import logging
import sys
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, str(Path(__file__).parent.parent))

from meijer.email_2fa import Email2FAHandler, create_email_config_template


def setup_logging():
    """Set up logging for the demo."""
    logging.basicConfig(
        level=logging.INFO,
        format="%(asctime)s - %(name)s - %(levelname)s - %(message)s"
    )


def demo_config_setup():
    """Demonstrate email configuration setup."""
    print("🔧 Email 2FA Configuration Setup")
    print("=" * 50)
    
    try:
        # Create configuration template
        print("📝 Creating email configuration template...")
        create_email_config_template()
        
        print("\n✅ Configuration template created successfully!")
        print("📁 Location: ~/.config/meijer/email.txt")
        
        print("\n📋 Next steps:")
        print("1. Edit the email.txt file with your email server details")
        print("2. For Gmail, generate an 'App Password' in your Google Account settings")
        print("3. Test the connection with the demo")
        
        return True
        
    except Exception as e:
        print(f"❌ Failed to create configuration template: {e}")
        return False


def demo_connection_test():
    """Demonstrate connection testing."""
    print("\n🧪 Email Connection Test")
    print("=" * 50)
    
    try:
        # Initialize email handler
        print("🔌 Initializing email handler...")
        email_handler = Email2FAHandler()
        
        # Test connection
        print("🔍 Testing IMAP connection...")
        if email_handler.test_connection():
            print("✅ Connection test successful!")
            
            # Test getting latest verification code
            print("📧 Checking for existing verification codes...")
            code = email_handler.get_latest_verification_code()
            
            if code:
                print(f"🎯 Found verification code: {code}")
            else:
                print("📭 No recent verification codes found")
                
            return True
        else:
            print("❌ Connection test failed!")
            print("💡 Please check your email configuration and try again")
            return False
            
    except FileNotFoundError:
        print("❌ Email configuration file not found!")
        print("💡 Please run the configuration setup first")
        return False
    except Exception as e:
        print(f"❌ Connection test failed: {e}")
        return False


def demo_wait_for_code():
    """Demonstrate waiting for verification codes."""
    print("\n⏳ Wait for Verification Code Demo")
    print("=" * 50)
    
    try:
        # Initialize email handler
        print("🔌 Initializing email handler...")
        email_handler = Email2FAHandler()
        
        # Wait for code with short timeout for demo
        print("⏰ Waiting for verification code (10 second timeout)...")
        print("💡 This is a demo with a short timeout - in real usage, you'd use a longer timeout")
        
        code = email_handler.wait_for_verification_code(timeout_seconds=10)
        
        if code:
            print(f"🎯 Verification code received: {code}")
            print("✅ This code would be used for 2FA authentication")
        else:
            print("⏰ No verification code received within timeout")
            print("💡 This is expected in a demo environment")
            
        return True
        
    except Exception as e:
        print(f"❌ Wait demo failed: {e}")
        return False


def demo_integration_example():
    """Demonstrate how email 2FA integrates with authentication."""
    print("\n🔗 Email 2FA Integration Example")
    print("=" * 50)
    
    print("📚 The email 2FA system integrates automatically with Meijer authentication:")
    print()
    print("1. 🔐 User attempts to login with username/password")
    print("2. 📱 Meijer requires 2FA verification")
    print("3. 📧 System automatically connects to email server")
    print("4. 🔍 Searches for verification emails from Meijer")
    print("5. 📝 Extracts the N-digit verification code")
    print("6. ✅ Submits code to complete authentication")
    print()
    print("💡 No manual intervention required - fully automated!")
    
    print("\n📖 Code Example:")
    print("```python")
    print("from meijer.okta_auth import OktaAuthenticator")
    print("from meijer.email_2fa import Email2FAHandler")
    print()
    print("# Initialize authenticator")
    print("auth = OktaAuthenticator(username, password)")
    print()
    print("# Authentication will automatically handle 2FA")
    print("auth_code = auth.authenticate()")
    print("```")


def main():
    """Main demo function."""
    print("🚀 Email 2FA Demo for Meijer Authentication")
    print("=" * 60)
    
    setup_logging()
    
    # Demo 1: Configuration setup
    config_ok = demo_config_setup()
    
    if not config_ok:
        print("\n❌ Configuration setup failed. Please check the error above.")
        return
    
    print("\n" + "="*60)
    
    # Demo 2: Connection test (only if config exists)
    try:
        Email2FAHandler()
        connection_ok = demo_connection_test()
        
        if connection_ok:
            print("\n" + "="*60)
            
            # Demo 3: Wait for code
            wait_ok = demo_wait_for_code()
            
            if wait_ok:
                print("\n" + "="*60)
                
                # Demo 4: Integration example
                demo_integration_example()
                
                print("\n🎉 All demos completed successfully!")
                print("\n💡 To use email 2FA in production:")
                print("1. Ensure your email configuration is correct")
                print("2. The system will automatically handle 2FA during login")
                print("3. Monitor logs for any connection issues")
            else:
                print("\n⚠️ Wait demo failed, but connection is working")
        else:
            print("\n❌ Connection test failed. Please check your email configuration.")
            
    except FileNotFoundError:
        print("\n📝 Email configuration file not found.")
        print("   Please edit the email.txt file and run this demo again.")
    except Exception as e:
        print(f"\n❌ Unexpected error: {e}")
    
    print("\n" + "="*60)
    print("📚 For more information, see EMAIL_2FA_README.md")
    print("🔧 CLI commands available:")
    print("   meijer email-2fa setup    - Create configuration template")
    print("   meijer email-2fa test     - Test email connection")
    print("   meijer email-2fa wait     - Wait for verification code")


if __name__ == "__main__":
    main()
