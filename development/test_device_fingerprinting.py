#!/usr/bin/env python3
"""
Test the device fingerprinting step specifically.
"""

import requests
import json
import secrets
import base64
import hashlib
import uuid
import re
from pathlib import Path


def test_device_fingerprinting():
    """Test the device fingerprinting step specifically."""

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

    # Make OAuth2 request to get state token
    print("🔐 Step 2: Making OAuth2 authorization request to get state token...")

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

        # Extract state token
        content = oauth_response.text
        state_token_match = re.search(r'"stateToken":"([^"]+)"', content)
        if state_token_match:
            state_token = state_token_match.group(1)
            print(f"   ✅ Extracted state token: {state_token[:50]}...")

            # Now test device fingerprinting
            print("\n📱 Step 3: Testing device fingerprinting...")

            # Use EXACT headers from working flow
            fingerprint_headers = {
                "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
                "User-Agent": "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36",
                "Accept-Language": "en-US,en;q=0.9",
                "Accept-Encoding": "gzip, deflate",
                "X-Requested-With": "com.duckduckgo.mobile.android",
                "Sec-GPC": "1",
            }

            # First, visit device fingerprint page
            fingerprint_url = (
                f"{config['base_urls']['okta']}/auth/services/devicefingerprint"
            )
            print(f"   📝 Device fingerprint URL: {fingerprint_url}")
            print(f"   📝 Headers: {fingerprint_headers}")

            try:
                response = session.get(fingerprint_url, headers=fingerprint_headers)
                print(f"   Device fingerprint page status: {response.status_code}")

                if response.status_code == 200:
                    print("   ✅ Device fingerprint page successful!")

                    # Now get device nonce
                    print("\n🔑 Step 4: Getting device nonce...")

                    nonce_url = (
                        f"{config['base_urls']['okta']}/api/v1/internal/device/nonce"
                    )

                    # Headers for nonce request
                    nonce_headers = {
                        "Accept": "*/*",
                        "User-Agent": "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36",
                        "X-Requested-With": "XMLHttpRequest",
                        "Origin": config["base_urls"]["okta"],
                        "Sec-Fetch-Site": "same-origin",
                        "Sec-Fetch-Mode": "cors",
                        "Sec-Fetch-Dest": "empty",
                        "Referer": fingerprint_url,
                        "Accept-Encoding": "gzip, deflate",
                        "Accept-Language": "en-US,en;q=0.9",
                    }

                    print(f"   📝 Nonce URL: {nonce_url}")
                    print(f"   📝 Nonce headers: {nonce_headers}")

                    nonce_response = session.post(
                        nonce_url, headers=nonce_headers, data=""
                    )
                    print(f"   Nonce request status: {nonce_response.status_code}")

                    if nonce_response.status_code == 200:
                        try:
                            data = nonce_response.json()
                            device_nonce = data.get("nonce")
                            print(f"   ✅ Device nonce obtained: {device_nonce}")

                            # Now test IDX identify with device nonce
                            print(
                                "\n🔐 Step 5: Testing IDX identify with device nonce..."
                            )

                            # Use EXACT headers from working flow with device nonce
                            idx_headers = {
                                "Accept": "application/json; okta-version=1.0.0",
                                "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
                                "X-Device-Fingerprint": f"{device_nonce}|a51183db48a04679a8d3769ee8a151455b09acf91a15ffe9625eeec4f91ad5b7|21c0dae824c3f48f32f5b271e1d291d8",
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

                            # Request body EXACTLY as in analysis
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
                            print(
                                f"   Response size: {len(idx_response.content)} bytes"
                            )

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

                        except json.JSONDecodeError:
                            print("   ❌ Invalid JSON response from nonce request")
                    else:
                        print(
                            f"   ❌ Device nonce failed: {nonce_response.status_code}"
                        )
                        print(f"   Response: {nonce_response.text[:200]}...")

                else:
                    print(
                        f"   ❌ Device fingerprint page failed: {response.status_code}"
                    )
                    print(f"   Response: {response.text[:200]}...")

            except Exception as e:
                print(f"   ❌ Error in device fingerprinting: {e}")

        else:
            print("   ❌ Could not extract state token")
    else:
        print(f"   ❌ OAuth2 request failed: {oauth_response.status_code}")


if __name__ == "__main__":
    test_device_fingerprinting()
