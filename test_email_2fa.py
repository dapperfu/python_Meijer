#!/usr/bin/env python3
"""
Test script for Email 2FA functionality.

This script demonstrates how to use the Email2FAHandler for 2FA authentication.
"""

import logging
import sys
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, str(Path(__file__).parent))

from meijer.email_2fa import Email2FAHandler, create_email_config_template


def setup_logging():
    """Set up logging for the test script."""
    logging.basicConfig(
        level=logging.INFO,
        format="%(asctime)s - %(name)s - %(levelname)s - %(message)s",
    )


def test_email_config_creation():
    """Test creating email configuration template."""
    print("🧪 Testing email configuration template creation...")

    try:
        create_email_config_template()
        print("✅ Email configuration template created successfully")
        return True
    except Exception as e:
        print(f"❌ Failed to create email configuration template: {e}")
        return False


def test_email_connection():
    """Test email connection and authentication."""
    print("\n🧪 Testing email connection...")

    try:
        email_handler = Email2FAHandler()

        # Test connection
        if email_handler.test_connection():
            print("✅ Email connection test successful!")

            # Test getting latest verification code
            print("🔍 Checking for existing verification codes...")
            code = email_handler.get_latest_verification_code()

            if code:
                print(f"📧 Found verification code: {code}")
            else:
                print("📧 No recent verification codes found")

            return True
        else:
            print("❌ Email connection test failed!")
            return False

    except FileNotFoundError:
        print("❌ Email configuration file not found!")
        print("💡 Please run the setup first or create the email.txt file manually")
        return False
    except Exception as e:
        print(f"❌ Email connection test failed: {e}")
        return False


def test_wait_for_code():
    """Test waiting for verification code (with short timeout)."""
    print("\n🧪 Testing wait for verification code (10 second timeout)...")

    try:
        email_handler = Email2FAHandler()

        # Wait for code with short timeout for testing
        code = email_handler.wait_for_verification_code(timeout_seconds=10)

        if code:
            print(f"✅ Verification code received: {code}")
            return True
        else:
            print(
                "⏰ No verification code received within timeout (expected for testing)"
            )
            return True

    except Exception as e:
        print(f"❌ Wait for verification code test failed: {e}")
        return False


def main():
    """Main test function."""
    print("🚀 Email 2FA Test Script")
    print("=" * 50)

    setup_logging()

    # Test 1: Configuration creation
    config_ok = test_email_config_creation()

    if not config_ok:
        print("\n❌ Configuration test failed. Please check the error above.")
        return

    print("\n📝 Please edit the email.txt file with your actual email server details")
    print("   Then run this script again to test the connection.")

    # Test 2: Connection (only if config exists)
    try:
        Email2FAHandler()
        connection_ok = test_email_connection()

        if connection_ok:
            # Test 3: Wait for code
            wait_ok = test_wait_for_code()

            if wait_ok:
                print("\n🎉 All tests completed successfully!")
            else:
                print("\n⚠️ Wait test failed, but connection is working")
        else:
            print("\n❌ Connection test failed. Please check your email configuration.")

    except FileNotFoundError:
        print("\n📝 Email configuration file not found.")
        print("   Please edit the email.txt file and run this script again.")
    except Exception as e:
        print(f"\n❌ Unexpected error: {e}")


if __name__ == "__main__":
    main()
