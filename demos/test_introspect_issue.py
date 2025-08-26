#!/usr/bin/env python3
"""
Test script for debugging the introspect endpoint GET vs POST issue.

This script demonstrates how the introspect endpoint should be called
and helps identify why GET requests are being made instead of POST.
"""

import sys
import requests
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, str(Path(__file__).parent.parent))


def test_introspect_endpoint():
    """Test the introspect endpoint with both GET and POST methods."""
    print("🧪 Testing Introspect Endpoint Methods")
    print("=" * 60)

    base_url = "https://id.meijer.com"
    introspect_url = f"{base_url}/idp/idx/introspect"

    print(f"🌐 Testing endpoint: {introspect_url}")
    print()

    # Test 1: GET request (this should fail)
    print("📤 Test 1: GET request (should fail)")
    print("-" * 40)
    try:
        headers = {
            "User-Agent": "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36",
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
            "Accept-Language": "en-US,en;q=0.9",
            "Accept-Encoding": "gzip, deflate",
            "Connection": "keep-alive",
            "Upgrade-Insecure-Requests": "1",
            "Sec-Fetch-Site": "none",
            "Sec-Fetch-Mode": "navigate",
            "Sec-Fetch-User": "?1",
            "Sec-Fetch-Dest": "document",
            "Sec-GPC": "1",
            "X-Requested-With": "com.duckduckgo.mobile.android",
        }

        response = requests.get(introspect_url, headers=headers)
        print(f"   Status: {response.status_code}")
        print(f"   Response: {response.text[:200]}...")

        if response.status_code == 405:
            print("   ✅ Expected: GET method not allowed")
        else:
            print("   ❌ Unexpected response for GET request")

    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Test 2: POST request (this should work with proper data)
    print("📤 Test 2: POST request (should work with stateToken)")
    print("-" * 40)
    try:
        headers = {
            "Content-Type": "application/json",
            "Accept": "application/ion+json; okta-version=1.0.0",
            "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
            "Origin": "https://id.meijer.com",
            "Sec-Fetch-Dest": "empty",
            "Sec-Fetch-Mode": "cors",
            "Sec-Fetch-Site": "same-origin",
        }

        # Note: This will fail without a valid stateToken, but should not give 405
        data = {"stateToken": "fake_token_for_testing"}

        response = requests.post(introspect_url, headers=headers, json=data)
        print(f"   Status: {response.status_code}")
        print(f"   Response: {response.text[:200]}...")

        if response.status_code == 405:
            print("   ❌ Unexpected: POST method not allowed")
        elif response.status_code == 400 or response.status_code == 401:
            print("   ✅ Expected: POST method allowed, but invalid token")
        else:
            print(f"   ℹ️ Response: {response.status_code}")

    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Test 3: Check what the OAuth2 page contains
    print("📤 Test 3: Check OAuth2 page for introspect references")
    print("-" * 40)
    try:
        oauth_url = f"{base_url}/oauth2/default/v1/authorize?response_type=code&client_id=0oa22cbewuCICOsKz697&scope=openid+offline_access&redirect_uri=https%3A%2F%2Fwww.meijer.com%2Fbin%2Fmeijer%2Fsignin%2Fv3%2Fcallback&state=https%3A%2F2F%2Fwww.meijer.com%2F"

        headers = {
            "User-Agent": "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36",
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
        }

        response = requests.get(oauth_url, headers=headers)
        print(f"   Status: {response.status_code}")

        if response.status_code == 200:
            content = response.text.lower()

            # Check for introspect references
            if "introspect" in content:
                print("   🔍 Found 'introspect' in OAuth2 page content")

                # Look for specific patterns
                if "idp/idx/introspect" in content:
                    print("   🔍 Found direct introspect endpoint reference")

                if "get" in content and "introspect" in content:
                    print("   ⚠️ Found GET + introspect pattern (potential issue)")

                if "post" in content and "introspect" in content:
                    print("   ✅ Found POST + introspect pattern (correct)")

            else:
                print("   ℹ️ No 'introspect' references found in OAuth2 page")

            # Save the page for analysis
            with open("/tmp/meijer_oauth2_page.html", "w", encoding="utf-8") as f:
                f.write(response.text)
            print("   📄 OAuth2 page saved to /tmp/meijer_oauth2_page.html")

        else:
            print(f"   ❌ Failed to get OAuth2 page: {response.status_code}")

    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()
    print("=" * 60)
    print("📋 Summary:")
    print("• GET requests to /idp/idx/introspect will always fail (405)")
    print("• POST requests to /idp/idx/introspect require valid stateToken")
    print("• The issue is likely browser navigation or JavaScript redirects")
    print("• Check the captured HTML files in /tmp/ for analysis")


def main():
    """Main function."""
    print("🚀 Introspect Endpoint Debugging Tool")
    print("=" * 60)
    print("🔍 This tool helps identify why GET requests are made to introspect")
    print("📄 Tests both GET and POST methods to the endpoint")
    print("🌐 Checks OAuth2 page for introspect references")
    print()

    # Run the tests
    test_introspect_endpoint()

    print("\n💡 Next steps:")
    print("1. Check the HTML files in /tmp/ for analysis")
    print("2. Use the Selenium auth with navigation monitoring")
    print("3. Look for JavaScript that might be causing GET requests")


if __name__ == "__main__":
    main()
