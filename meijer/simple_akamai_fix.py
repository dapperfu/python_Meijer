#!/usr/bin/env python3
"""
Simple Akamai Fix for Login Endpoint Only

This module provides a minimal solution that only fixes the Akamai blocking
on the /idp/idx/identify endpoint during login, without affecting other API calls.
"""

from typing import Dict
import requests


def get_mobile_app_headers() -> Dict[str, str]:
    """
    Return the working mobile app headers that bypass Akamai on login.

    These headers were extracted from successful authentication flows in the logs.
    """
    return {
        "User-Agent": "Meijer/102800000 okhttp/5.1.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)",
        "Accept": "application/json",
        "Content-Type": "application/x-www-form-urlencoded",
        "Accept-Encoding": "gzip",
        "X-ACF-Sensor-Data": "3,a,Ma3MHa89I03VOihlCLFGOv7CuasvECcxBJIeSIu5ho9Fh03mo9mdZNPENDaL/Via7TBVMIdIH8zzSYEg/pPJMBE3o2CkmRReIiL0J59RXxonEuF4zsKpc0tA4ctIB0SkBn2HtXnTXooUscYQDmMvbY1SCqyJfPpeLEX4jCugzgQ=",
    }


def patch_login_session(session: requests.Session) -> None:
    """
    Patch a requests session to use mobile app headers for login endpoints only.

    This only affects requests to login-related endpoints, leaving other API calls unchanged.
    """
    original_request = session.request

    def patched_request(method: str, url: str, **kwargs):
        # Only apply mobile headers to login endpoints
        if _is_login_endpoint(url):
            # Store original headers
            original_headers = kwargs.get("headers", {})

            # Apply mobile app headers
            mobile_headers = get_mobile_app_headers()
            mobile_headers.update(original_headers)  # Original headers take precedence

            kwargs["headers"] = mobile_headers

        # Call original request method
        return original_request(method, url, **kwargs)

    # Replace the session's request method
    session.request = patched_request


def _is_login_endpoint(url: str) -> bool:
    """Check if the URL is a login-related endpoint that needs mobile headers."""
    login_indicators = [
        "/idp/idx/identify",
        "/idp/idx/introspect",
        "/oauth2/default/v1/authorize",
        "/login",
        "/signin",
        "/auth",
    ]

    return any(indicator in url for indicator in login_indicators)


def create_login_friendly_session() -> requests.Session:
    """
    Create a session that automatically uses mobile app headers for login endpoints.

    Returns:
        A requests.Session that automatically applies mobile headers to login requests
    """
    session = requests.Session()
    patch_login_session(session)
    return session


# Example usage:
if __name__ == "__main__":
    print("🔧 Simple Akamai Fix for Login Endpoint")
    print("=" * 50)

    # Create a session that automatically handles login headers
    session = create_login_friendly_session()

    print("✅ Session created with automatic login header handling")
    print("📱 Mobile app headers will be applied only to login endpoints")
    print("🔒 Regular API calls remain unchanged")

    # Test the headers
    headers = get_mobile_app_headers()
    print("\n📋 Mobile App Headers:")
    for key, value in headers.items():
        print(f"  {key}: {value[:60]}{'...' if len(value) > 60 else ''}")
