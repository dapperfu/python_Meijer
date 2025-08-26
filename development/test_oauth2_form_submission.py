#!/usr/bin/env python3
"""
Test submitting the login form directly to the OAuth2 endpoint.
"""

import requests
import json
import secrets
import base64
import hashlib
import uuid
import re
from pathlib import Path


def test_oauth2_form_submission():
    """Test submitting the login form directly to the OAuth2 endpoint."""

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

    # Make OAuth2 request to get login page
    print("🔐 Step 2: Making OAuth2 authorization request to get login page...")

    # Generate PKCE parameters
    code_verifier = secrets.token_urlsafe(32)
    code_challenge = (
        base64.urlsafe_b64encode(hashlib.sha256(code_verifier.encode()).digest())
        .decode()
        .rstrip("=")
    )

    oauth_params = {
        "client_id": "0oa1o8g9njWsUvwsx697",
        "scope": "openid profile offline_access",
        "redirect_uri": "com.meijer.mobile.meijer:/login",
        "response_type": "code",
        "state": uuid.uuid4().hex,
        "code_challenge": code_challenge,
        "code_challenge_method": "S256",
    }

    # Add OAuth2 specific headers
    oauth_headers = session.headers.copy()
    oauth_headers.update(
        {
            "Referer": f"{config['base_urls']['meijer']}/",
            "Origin": f"{config['base_urls']['meijer']}",
        }
    )

    oauth_response = session.get(
        f"{config['base_urls']['okta']}/oauth2/default/v1/authorize",
        params=oauth_params,
        headers=oauth_headers,
    )
    print(f"   OAuth2 status: {oauth_response.status_code}")

    if oauth_response.status_code == 200:
        print("   ✅ OAuth2 request successful!")

        # Extract state token from the response
        content = oauth_response.text
        state_token_match = re.search(r'"stateToken":"([^"]+)"', content)
        if state_token_match:
            state_token = state_token_match.group(1)
            print(f"   ✅ Extracted state token: {state_token[:50]}...")

            # Now try to submit the login form directly to the OAuth2 endpoint
            print("\n🔐 Step 3: Submitting login form directly to OAuth2 endpoint...")

            # Try different approaches for submitting the login
            login_approaches = [
                {
                    "name": "POST to OAuth2 authorize with form data",
                    "url": f"{config['base_urls']['okta']}/oauth2/default/v1/authorize",
                    "method": "POST",
                    "data": {
                        "username": "meijer.com@eabi.xyz",
                        "password": "Default12!@",
                        "stateToken": state_token,
                        "client_id": "0oa1o8g9njWsUvwsx697",
                        "scope": "openid profile offline_access",
                        "redirect_uri": "com.meijer.mobile.meijer:/login",
                        "response_type": "code",
                        "code_challenge": code_challenge,
                        "code_challenge_method": "S256",
                    },
                },
                {
                    "name": "POST to OAuth2 authorize with JSON data",
                    "url": f"{config['base_urls']['okta']}/oauth2/default/v1/authorize",
                    "method": "POST",
                    "json": {
                        "username": "meijer.com@eabi.xyz",
                        "password": "Default12!@",
                        "stateToken": state_token,
                    },
                },
                {
                    "name": "POST to OAuth2 authorize with username/password in params",
                    "url": f"{config['base_urls']['okta']}/oauth2/default/v1/authorize",
                    "method": "POST",
                    "data": {
                        "username": "meijer.com@eabi.xyz",
                        "password": "Default12!@",
                    },
                },
            ]

            for i, approach in enumerate(login_approaches, 1):
                print(f"\n   🔍 Test {i}: {approach['name']}")
                print(f"      URL: {approach['url']}")
                print(f"      Method: {approach['method']}")

                try:
                    if approach["method"] == "POST":
                        if "json" in approach:
                            response = session.post(
                                approach["url"], json=approach["json"]
                            )
                        else:
                            response = session.post(
                                approach["url"], data=approach["data"]
                            )
                    else:
                        response = session.get(approach["url"], params=approach["data"])

                    print(f"      Status: {response.status_code}")
                    print(f"      Response size: {len(response.content)} bytes")

                    if response.status_code == 200:
                        print("      ✅ SUCCESS! Got 200 response")
                        if (
                            "verification" in response.text.lower()
                            or "challenge" in response.text.lower()
                        ):
                            print("      🎯 This looks like a 2FA/verification page!")
                        elif (
                            "account" in response.text.lower()
                            or "dashboard" in response.text.lower()
                        ):
                            print("      🎯 This looks like a successful login!")
                        else:
                            print(
                                f"      📄 Response preview: {response.text[:200]}..."
                            )
                        break
                    elif response.status_code == 302:
                        print("      🔄 Got redirect - this might be working!")
                        print(
                            f"      Location: {response.headers.get('Location', 'None')}"
                        )
                        break
                    else:
                        print(f"      ⚠️  Got status {response.status_code}")
                        print(f"      Response: {response.text[:200]}...")

                except Exception as e:
                    print(f"      ❌ Error: {e}")

        else:
            print("   ❌ Could not extract state token")
    else:
        print(f"   ❌ OAuth2 request failed: {oauth_response.status_code}")


if __name__ == "__main__":
    test_oauth2_form_submission()
