#!/usr/bin/env python3
"""
Test script for the headless login workflow.
This script demonstrates how to use the MeijerHeadlessLogin class.
"""

import sys
import os

sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from tools.headless_login_workflow import MeijerHeadlessLogin


def test_headless_login():
    """Test the headless login workflow."""

    # Get credentials from environment or use test values
    username = os.getenv("MEIJER_USERNAME", "test@example.com")
    password = os.getenv("MEIJER_PASSWORD", "testpassword")

    print("🧪 Testing Headless Login Workflow")
    print("=" * 40)
    print(f"Username: {username}")
    print(f"Password: {'*' * len(password)}")
    print()

    # Create login instance with proxy support
    login = MeijerHeadlessLogin(
        username=username,
        password=password,
        proxy_host="127.0.0.1",  # mitmproxy
        proxy_port=8080,
    )

    print("🔧 Login instance created with proxy configuration")
    print("📋 Session headers:")
    for key, value in login.session.headers.items():
        print(f"  {key}: {value}")
    print()

    # Test individual steps
    print("🧪 Testing Individual Steps:")
    print("-" * 30)

    # Step 1: OAuth Authorization
    print("1️⃣ Testing OAuth Authorization...")
    success = login.step1_oauth_authorize()
    print(f"   Result: {'✅ Success' if success else '❌ Failed'}")

    if success:
        print("   Generated parameters:")
        print(f"     State: {login.state[:20] if login.state else 'None'}...")
        print(f"     Nonce: {login.nonce[:20] if login.nonce else 'None'}...")
        print(
            f"     Code Challenge: {login.code_challenge[:20] if login.code_challenge else 'None'}..."
        )

    print()

    # Step 2: Device Fingerprinting
    print("2️⃣ Testing Device Fingerprinting...")
    success = login.step2_device_fingerprint()
    print(f"   Result: {'✅ Success' if success else '❌ Failed'}")
    print()

    # Step 3: Device Nonce
    print("3️⃣ Testing Device Nonce...")
    success = login.step3_device_nonce()
    print(f"   Result: {'✅ Success' if success else '❌ Failed'}")
    if success and hasattr(login, "device_nonce"):
        print(
            f"   Device Nonce: {login.device_nonce[:20] if login.device_nonce else 'None'}..."
        )
    print()

    # Step 4: Web Login Identify
    print("4️⃣ Testing Web Login Identify...")
    success = login.step4_web_login_identify()
    print(f"   Result: {'✅ Success' if success else '❌ Failed'}")
    if success and hasattr(login, "state_token"):
        print(
            f"   State Token: {login.state_token[:20] if login.state_token else 'None'}..."
        )
    print()

    # Step 5: Password Challenge
    print("5️⃣ Testing Password Challenge...")
    success = login.step5_challenge_answer()
    print(f"   Result: {'✅ Success' if success else '❌ Failed'}")
    print()

    # Step 6: OAuth Keys
    print("6️⃣ Testing OAuth Keys...")
    success = login.step6_oauth_keys()
    print(f"   Result: {'✅ Success' if success else '❌ Failed'}")
    print()

    # Step 7: Token Exchange (if we have auth code)
    if hasattr(login, "auth_code") and login.auth_code:
        print("7️⃣ Testing Token Exchange...")
        success = login.step7_token_exchange()
        print(f"   Result: {'✅ Success' if success else '❌ Failed'}")
        if success:
            print(
                f"   Access Token: {login.access_token[:20] if login.access_token else 'None'}..."
            )
            print(
                f"   ID Token: {login.id_token[:20] if login.id_token else 'None'}..."
            )
    else:
        print("7️⃣ Skipping Token Exchange (no auth code available)")

    print()

    # Show final session info
    print("📊 Final Session Information:")
    print("-" * 30)
    session_info = login.get_session_info()
    for key, value in session_info.items():
        if key in ["access_token", "id_token", "refresh_token"] and value:
            print(f"  {key}: {value[:20]}...")
        elif key == "cookies":
            print(f"  {key}: {len(value)} cookies")
        else:
            print(f"  {key}: {value}")

    print()
    print("🧪 Test completed!")


if __name__ == "__main__":
    test_headless_login()
