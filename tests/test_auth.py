#!/usr/bin/env python3
"""
Test script for Meijer authentication file reading.
"""

from meijer import Meijer, MeijerError


def test_auth_file():
    """Test reading authentication from auth file."""
    print("Testing Meijer authentication file reading...")
    print("=" * 50)

    try:
        # Create Meijer client
        meijer = Meijer()

        # Test reading auth file
        print("Reading authentication from auth.json...")
auth_data = meijer._read_auth_file("~/.config/meijer/auth.json")

        print(f"Username: {auth_data['username']}")
        print(f"Password: {'*' * len(auth_data['password'])} (hidden)")

        # Test login with auth file
        print("\nAttempting login with auth file...")
        if meijer.login():  # Uses default auth.json
            print("✅ Login successful!")

            # Get user info
            user_info = meijer.get_user_info()
            print(f"User info: {user_info}")

        else:
            print("❌ Login failed!")

    except MeijerError as e:
        print(f"❌ Meijer error: {e}")
    except Exception as e:
        print(f"❌ Unexpected error: {e}")

    print("\n" + "=" * 50)
    print("Test complete!")


if __name__ == "__main__":
    test_auth_file()
