#!/usr/bin/env python3
"""
Hybrid authentication: Selenium to bypass Akamai, then requests for actual auth.
"""

import sys
import os
import time
import json
import secrets
import hashlib
import base64
import uuid
from urllib.parse import urlencode

# Add the current directory to Python path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))


def test_hybrid_auth():
    """Test hybrid authentication approach."""
    try:
        from selenium import webdriver
        from selenium.webdriver.firefox.options import Options
        import requests

        print("✅ Selenium and requests imported successfully")

        # Read credentials from login.txt
        login_file = "/keg/cursor/.config/meijer/login.txt"

        try:
            with open(login_file, "r") as f:
                lines = f.readlines()
                if len(lines) >= 2:
                    username = lines[0].strip()
                    password = lines[1].strip()
                else:
                    print(
                        "❌ login.txt must contain username and password on separate lines"
                    )
                    return
        except Exception as e:
            print(f"❌ Error reading {login_file}: {e}")
            return

        print(f"🔐 Using credentials from {login_file}")
        print(f"👤 Username: {username}")
        print(f"🔑 Password: {'*' * len(password)}")
        print()

        print("🚀 Starting Hybrid Authentication...")
        print("🌐 Step 1: Selenium to bypass Akamai")
        print("=" * 60)

        # Setup Firefox options
        options = Options()
        options.add_argument("--width=1200")
        options.add_argument("--height=800")

        # Add proxy configuration for mitmproxy
        print("🌐 Configuring mitmproxy proxy...")
        options.set_preference("network.proxy.type", 1)  # Manual proxy
        options.set_preference("network.proxy.http", "127.0.0.1")
        options.set_preference("network.proxy.http_port", 8080)
        options.set_preference("network.proxy.ssl", "127.0.0.1")
        options.set_preference("network.proxy.ssl_port", 8080)
        options.set_preference("network.proxy.share_proxy_settings", True)

        # Handle mitmproxy certificate issues
        options.set_preference("security.cert_verification.enabled", False)
        options.set_preference("security.enterprise_roots.enabled", True)

        print("🌐 Starting Firefox...")
        driver = webdriver.Firefox(options=options)

        try:
            print("✅ Firefox started successfully!")

            # Step 1: Use Selenium to navigate to OAuth2 page and bypass Akamai
            print("🌐 Step 1: Navigating to OAuth2 page via Selenium...")

            # Generate PKCE parameters
            code_verifier = secrets.token_urlsafe(32)
            code_challenge = (
                base64.urlsafe_b64encode(
                    hashlib.sha256(code_verifier.encode()).digest()
                )
                .decode()
                .rstrip("=")
            )

            # Build OAuth2 URL with working parameters
            oauth_params = {
                "login_hint": "",
                "code_challenge": code_challenge,
                "code_challenge_method": "S256",
                "client_id": "0oa1o8g9njWsUvwsx697",  # Working client_id
                "scope": "openid profile offline_access",  # Working scope
                "redirect_uri": "com.meijer.mobile.meijer:/login",  # Working redirect_uri
                "response_type": "code",
                "state": uuid.uuid4().hex,
                "nonce": uuid.uuid4().hex,
            }

            oauth_url = f"https://id.meijer.com/oauth2/default/v1/authorize?{urlencode(oauth_params)}"
            print(f"🔐 OAuth2 URL: {oauth_url}")

            # Navigate to OAuth2 page via Selenium
            driver.get(oauth_url)
            time.sleep(5)

            print(f"📄 Current URL: {driver.current_url}")
            print(f"📄 Page title: {driver.title}")

            # Check if we got blocked
            page_source = driver.page_source.lower()
            if "access denied" in page_source or "error" in page_source:
                print("❌ OAuth2 page blocked in Selenium - this is unexpected")
                return False

            print("✅ OAuth2 page loaded successfully via Selenium!")

            # Step 2: Extract cookies and state from Selenium
            print("🍪 Step 2: Extracting cookies and state from Selenium...")

            # Get all cookies from Selenium
            selenium_cookies = driver.get_cookies()
            print(f"🍪 Found {len(selenium_cookies)} cookies in Selenium")

            # Look for state token in the page
            state_token = None
            if "statetoken" in page_source:
                import re

                match = re.search(
                    r'stateToken["\']?\s*:\s*["\']([^"\']+)["\']', page_source
                )
                if match:
                    state_token = match.group(1)
                    print(f"✅ State token extracted: {state_token[:50]}...")
                else:
                    print("❌ Could not extract state token from page")
                    return False
            else:
                print("❌ No state token found in page")
                return False

            # Step 3: Switch to requests with extracted cookies
            print("🔄 Step 3: Switching to requests with extracted cookies...")

            # Create requests session
            session = requests.Session()

            # Configure proxy
            session.proxies = {
                "http": "http://127.0.0.1:8080",
                "https": "http://127.0.0.1:8080",
            }

            # Configure SSL with mitmproxy certificate
            ssl_cert_path = "/keg/cursor/.mitmproxy/mitmproxy-ca-cert.pem"
            if os.path.exists(ssl_cert_path):
                session.verify = ssl_cert_path
                print(f"   ✅ SSL certificate configured: {ssl_cert_path}")
            else:
                session.verify = False
                print(f"   ⚠️ SSL certificate not found: {ssl_cert_path}")
                import urllib3

                urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)

            # Add cookies from Selenium to requests session
            for cookie in selenium_cookies:
                session.cookies.set(
                    cookie["name"], cookie["value"], domain=cookie["domain"]
                )
                print(
                    f"   🍪 Added cookie: {cookie['name']} = {cookie['value'][:30]}..."
                )

            # Set headers for requests
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

            print("✅ Requests session configured with Selenium cookies")

            # Step 4: Continue with requests for the actual authentication
            print("🔐 Step 4: Continuing authentication with requests...")

            # Now try the IDX identify step with the cookies from Selenium
            idx_url = "https://id.meijer.com/idp/idx/identify"

            # Headers exactly as in working flow
            headers = {
                "Accept": "application/json; okta-version=1.0.0",
                "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
                "X-Device-Fingerprint": "dummy_nonce|a51183db48a04679a8d3769ee8a151455b09acf91a15ffe9625eeec4f91ad5b7|21c0dae824c3f48f32f5b271e1d291d8",
                "User-Agent": session.headers["User-Agent"],
                "Content-Type": "application/json",
                "Origin": "https://id.meijer.com",
                "X-Requested-With": "com.duckduckgo.mobile.android",
                "Sec-Fetch-Site": "same-origin",
                "Sec-Fetch-Mode": "cors",
                "Sec-Fetch-Dest": "empty",
                "Accept-Encoding": "gzip, deflate",
                "Accept-Language": "en-US,en;q=0.9",
            }

            # Request body
            data = {"identifier": username, "stateHandle": state_token}

            print("🔄 Testing IDX identify with Selenium cookies...")
            print(f"   URL: {idx_url}")
            print(f"   State token: {state_token[:30]}...")

            try:
                response = session.post(idx_url, headers=headers, json=data)
                print(f"   Status: {response.status_code}")
                print(f"   Response headers: {dict(response.headers)}")

                if response.status_code == 200:
                    print("✅ SUCCESS! IDX identify worked with hybrid approach!")
                    try:
                        response_data = response.json()
                        print(f"   Response: {json.dumps(response_data, indent=2)}")

                        # Extract state handle for next step
                        if "stateHandle" in response_data:
                            state_handle = response_data["stateHandle"]
                            print(
                                f"   ✅ State handle obtained: {state_handle[:50]}..."
                            )

                            # Continue with challenge answer
                            print("🔑 Step 5: Testing challenge answer...")

                            challenge_url = (
                                "https://id.meijer.com/idp/idx/challenge/answer"
                            )
                            challenge_data = {
                                "credentials": {"passcode": password},
                                "stateHandle": state_handle,
                            }

                            challenge_response = session.post(
                                challenge_url, headers=headers, json=challenge_data
                            )
                            print(
                                f"   Challenge status: {challenge_response.status_code}"
                            )

                            if challenge_response.status_code == 200:
                                print(
                                    "🎉 SUCCESS! Complete authentication worked with hybrid approach!"
                                )
                                return True
                            else:
                                print(
                                    f"   ❌ Challenge answer failed: {challenge_response.status_code}"
                                )
                                print(
                                    f"   Response: {challenge_response.text[:200]}..."
                                )

                        else:
                            print("   ❌ No state handle in response")

                    except json.JSONDecodeError:
                        print("   ❌ Invalid JSON response")
                        print(f"   Response text: {response.text[:200]}...")

                else:
                    print(f"   ❌ IDX identify still failed: {response.status_code}")
                    print(f"   Response: {response.text[:200]}...")
                    print(
                        "   💡 Even with Selenium cookies, we're still getting blocked"
                    )

            except Exception as e:
                print(f"   ❌ Error in IDX identify: {e}")

        finally:
            print("🔍 Keeping browser open for inspection...")
            print("💡 Close the browser manually when done")
            print("⏸️ Press Ctrl+C to exit this script")

            try:
                while True:
                    time.sleep(1)
            except KeyboardInterrupt:
                print("\n👋 Exiting...")
                driver.quit()

    except Exception as e:
        print(f"❌ Error in hybrid auth: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    test_hybrid_auth()
