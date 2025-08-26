#!/usr/bin/env python3
"""
Test the /signin endpoint to extract state tokens.
"""

import requests
import json
import re
from pathlib import Path


def test_signin_endpoint():
    """Test the /signin endpoint to extract state tokens."""

    # Load configuration
    config_path = Path.home() / ".config" / "meijer" / "auth_config.json"
    with open(config_path, "r") as f:
        config = json.load(f)

    # Create session
    session = requests.Session()

    # Set headers EXACTLY as in working flow
    session.headers.update(
        {
            "User-Agent": "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36",
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
            "Accept-Language": "en-US,en;q=0.9",
            "Accept-Encoding": "gzip, deflate",
            "Sec-Fetch-Site": "none",
            "Sec-Fetch-Mode": "navigate",
            "Sec-Fetch-User": "?1",
            "Sec-Fetch-Dest": "document",
            "Upgrade-Insecure-Requests": "1",
        }
    )

    # First, visit Meijer homepage to establish session and cookies
    print("🏠 Step 1: Visiting Meijer homepage to establish session...")
    meijer_response = session.get(config["base_urls"]["meijer"])
    print(f"   Meijer homepage status: {meijer_response.status_code}")
    print(f"   Cookies established: {len(session.cookies)}")

    print()

    # Access the /signin endpoint
    print("🔐 Step 2: Accessing /signin endpoint...")

    signin_url = f"{config['base_urls']['okta']}/signin"

    try:
        response = session.get(signin_url)
        print(f"   Signin endpoint status: {response.status_code}")
        print(f"   Response size: {len(response.content)} bytes")

        if response.status_code == 200:
            print("   ✅ Signin endpoint accessible!")

            # Save the response for inspection
            with open("signin_response.html", "w") as f:
                f.write(response.text)
            print("   💾 Response saved to signin_response.html")

            # Look for state tokens in the response
            content = response.text

            print("\n🔍 Step 3: Analyzing response for state tokens...")

            # Look for different types of state tokens
            state_patterns = [
                r'"stateToken":"([^"]+)"',
                r'"stateHandle":"([^"]+)"',
                r'stateToken["\']?\s*:\s*["\']([^"\']+)["\']',
                r'stateHandle["\']?\s*:\s*["\']([^"\']+)["\']',
                r'data-state["\']?\s*=\s*["\']([^"\']+)["\']',
                r'data-statehandle["\']?\s*=\s*["\']([^"\']+)["\']',
                r'window\._stateToken\s*=\s*["\']([^"\']+)["\']',
                r'window\._stateHandle\s*=\s*["\']([^"\']+)["\']',
            ]

            found_tokens = []
            for pattern in state_patterns:
                matches = re.findall(pattern, content, re.IGNORECASE)
                for match in matches:
                    if match and match not in found_tokens:
                        found_tokens.append(match)
                        print(f"   ✅ Found token: {match[:50]}...")

            if found_tokens:
                print(f"   🎯 Found {len(found_tokens)} state tokens!")

                # Now test IDX identify with the first token
                print("\n🔐 Step 4: Testing IDX identify with extracted token...")

                # Use the first token found
                state_token = found_tokens[0]

                # Use EXACT headers from working flow
                idx_headers = {
                    "Accept": "application/json; okta-version=1.0.0",
                    "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
                    "User-Agent": "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36",
                    "Content-Type": "application/json",
                    "Origin": config["base_urls"]["okta"],
                    "X-Requested-With": "com.duckduckgo.mobile.android",
                    "Sec-Fetch-Site": "same-origin",
                    "Sec-Fetch-Mode": "cors",
                    "Sec-Fetch-Dest": "empty",
                    "Accept-Encoding": "gzip, deflate",
                    "Accept-Language": "en-US,en;q=0.9",
                }

                # Request body
                request_body = {
                    "identifier": "meijer.com@eabi.xyz",
                    "stateHandle": state_token,
                }

                print(f"   📝 Request body: {request_body}")
                print(f"   📝 Headers: {idx_headers}")

                idx_response = session.post(
                    f"{config['base_urls']['okta']}/idp/idx/identify",
                    headers=idx_headers,
                    json=request_body,
                )

                print(f"   IDX identify status: {idx_response.status_code}")
                print(f"   Response size: {len(idx_response.content)} bytes")

                if idx_response.status_code == 200:
                    print("   ✅ SUCCESS! Got 200 response")
                    print(f"   Response: {idx_response.text[:200]}...")

                    # Try to extract state handle
                    try:
                        data = idx_response.json()
                        if "stateHandle" in data:
                            state_handle = data["stateHandle"]
                            print(
                                f"   ✅ State handle obtained: {state_handle[:50]}..."
                            )
                        else:
                            print("   ❌ No state handle in response")
                    except json.JSONDecodeError:
                        print("   ❌ Invalid JSON response")

                elif idx_response.status_code == 403:
                    print("   ❌ Still getting 403 Access Denied")
                    print(f"   Response: {idx_response.text[:200]}...")

                else:
                    print(f"   ⚠️  Got status {idx_response.status_code}")
                    print(f"   Response: {idx_response.text[:200]}...")

            else:
                print("   ❌ No state tokens found in signin response")

                # Look for any other useful information
                print("\n🔍 Step 4: Looking for other useful information...")

                # Check if this is a login page
                if "login" in content.lower() or "signin" in content.lower():
                    print("   🎯 This appears to be a login page!")

                    # Look for form action URLs
                    form_actions = re.findall(
                        r'<form[^>]*action=["\']([^"\']+)["\']', content
                    )
                    if form_actions:
                        print(f"   📝 Found {len(form_actions)} form actions:")
                        for action in form_actions:
                            print(f"      {action}")

                    # Look for any URLs that might be the next step
                    urls = re.findall(r'https?://[^\s"\'<>]+', content)
                    for url in urls:
                        if "idx" in url or "identify" in url:
                            print(f"   🔗 Potential IDX URL: {url}")

        else:
            print(f"   ❌ Signin endpoint failed: {response.status_code}")
            print(f"   Response: {response.text[:200]}...")

    except Exception as e:
        print(f"   ❌ Error accessing signin endpoint: {e}")


if __name__ == "__main__":
    test_signin_endpoint()
