#!/usr/bin/env python3
"""
Simple test script for the authenticated Meijer client.
This script tests the basic functionality without requiring real credentials.
"""

import sys
from pathlib import Path

# Add the current directory to the path
sys.path.insert(0, str(Path(__file__).parent))

from meijer.authenticated_client import AuthenticatedMeijerClient
from meijer.exceptions import AuthenticationError, TwoFactorRequiredError


def test_imports():
    """Test that all required modules can be imported."""
    print("🧪 Testing imports...")

    try:
        from meijer.authenticated_client import AuthenticatedMeijerClient
        from meijer.exceptions import AuthenticationError, TwoFactorRequiredError

        print("✅ All imports successful")
        return True
    except ImportError as e:
        print(f"❌ Import failed: {e}")
        return False


def test_client_creation():
    """Test that the client can be created."""
    print("\n🏗️  Testing client creation...")

    try:
        client = AuthenticatedMeijerClient(headless=True)
        print("✅ Client created successfully")

        # Test basic properties
        assert client.meijer_base == "https://www.meijer.com"
        assert client.okta_base == "https://id.meijer.com"
        assert client.authenticated == False
        print("✅ Client properties verified")

        return True
    except Exception as e:
        print(f"❌ Client creation failed: {e}")
        return False


def test_exception_classes():
    """Test that exception classes are properly defined."""
    print("\n⚠️  Testing exception classes...")

    try:
        # Test AuthenticationError
        auth_error = AuthenticationError("Test authentication error")
        assert str(auth_error) == "Test authentication error"
        print("✅ AuthenticationError working")

        # Test TwoFactorRequiredError
        twofa_error = TwoFactorRequiredError("Test 2FA error")
        assert str(twofa_error) == "Test 2FA error"
        print("✅ TwoFactorRequiredError working")

        return True
    except Exception as e:
        print(f"❌ Exception testing failed: {e}")
        return False


def test_session_headers():
    """Test that session headers are properly set."""
    print("\n📋 Testing session headers...")

    try:
        client = AuthenticatedMeijerClient()

        # Check that headers are set
        assert "User-Agent" in client.session.headers
        assert "Accept" in client.session.headers
        assert "Accept-Language" in client.session.headers

        # Check specific header values
        user_agent = client.session.headers["User-Agent"]
        assert "Firefox" in user_agent
        assert "141.0" in user_agent

        print("✅ Session headers properly configured")
        return True
    except Exception as e:
        print(f"❌ Session header test failed: {e}")
        return False


def test_context_manager():
    """Test that the client works as a context manager."""
    print("\n🔄 Testing context manager...")

    try:
        with AuthenticatedMeijerClient() as client:
            # Client should be accessible
            assert client is not None
            assert hasattr(client, "login")
            assert hasattr(client, "get_session")
            print("✅ Context manager entry successful")

        # Client should be cleaned up
        print("✅ Context manager exit successful")
        return True
    except Exception as e:
        print(f"❌ Context manager test failed: {e}")
        return False


def test_factory_function():
    """Test the factory function import."""
    print("\n🏭 Testing factory function...")

    try:
        from meijer.authenticated_client import create_authenticated_client

        print("✅ Factory function imported successfully")
        return True
    except ImportError as e:
        print(f"❌ Factory function import failed: {e}")
        return False


def main():
    """Run all tests."""
    print("🎯 Authenticated Client Test Suite")
    print("=" * 50)

    tests = [
        test_imports,
        test_client_creation,
        test_exception_classes,
        test_session_headers,
        test_context_manager,
        test_factory_function,
    ]

    passed = 0
    total = len(tests)

    for test in tests:
        try:
            if test():
                passed += 1
        except Exception as e:
            print(f"❌ Test {test.__name__} crashed: {e}")

    print(f"\n📊 Test Results: {passed}/{total} tests passed")

    if passed == total:
        print("🎉 All tests passed! The authenticated client is ready to use.")
        return True
    else:
        print("❌ Some tests failed. Please check the implementation.")
        return False


if __name__ == "__main__":
    success = main()
    sys.exit(0 if success else 1)
