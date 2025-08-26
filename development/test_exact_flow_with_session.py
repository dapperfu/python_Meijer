#!/usr/bin/env python3
"""
Test script to replicate the EXACT working flow with proper session management.
This follows the 7-step sequence from tools/exact_login_replication.py
"""

import json
import time
import re
from urllib.parse import urlparse, parse_qs
from typing import Dict, Any
import requests
import logging

# Set up logging
logging.basicConfig(
    level=logging.INFO, format="%(asctime)s - %(levelname)s - %(message)s"
)
logger = logging.getLogger(__name__)


class ExactFlowTest:
    def __init__(self, username: str, password: str):
        self.username = username
        self.password = password

        # Base URLs
        self.meijer_base = "https://www.meijer.com"
        self.okta_base = "https://id.meijer.com"

        # OAuth2 configuration - Working client_id (tools/exact_login_replication.py)
        self.client_id = "0oa1o8g9njWsUvwsx697"
        self.redirect_uri = "com.meijer.mobile.meijer:/login"
        self.scope = "openid profile offline_access"

        # State tracking
        self.state_token = None
        self.state_handle = None
        self.device_nonce = None

        # Create session with proper headers - EXACT from working flow
        self.session = requests.Session()
        self.session.headers.update(
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

        # Configure proxy and SSL like working flow
        self.proxy_host = "127.0.0.1"
        self.proxy_port = 8080

        # Set up proxy
        self.session.proxies = {
            "http": f"http://{self.proxy_host}:{self.proxy_port}",
            "https": f"http://{self.proxy_host}:{self.proxy_port}",
        }

        # Configure SSL certificate like working flow
        ssl_cert_path = "/keg/cursor/.mitmproxy/mitmproxy-ca-cert.pem"
        import os

        if os.path.exists(ssl_cert_path):
            self.session.verify = ssl_cert_path
            logger.info(f"   ✅ SSL certificate configured: {ssl_cert_path}")
        else:
            self.session.verify = False
            logger.warning(f"   ⚠️ SSL certificate not found: {ssl_cert_path}")
            import urllib3

            urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)

    def step1_oauth_authorize(self) -> bool:
        """Step 1: OAuth2 Authorization - EXACT from working flow."""
        logger.info("🔐 Step 1: OAuth2 Authorization")

        # Build OAuth2 URL with PKCE - EXACT from working flow
        import secrets
        import hashlib
        import base64
        import uuid

        code_verifier = secrets.token_urlsafe(32)
        code_challenge = (
            base64.urlsafe_b64encode(hashlib.sha256(code_verifier.encode()).digest())
            .decode()
            .rstrip("=")
        )

        oauth_url = f"{self.okta_base}/oauth2/default/v1/authorize"
        params = {
            "login_hint": "",
            "code_challenge": code_challenge,
            "code_challenge_method": "S256",
            "client_id": self.client_id,
            "scope": self.scope,
            "redirect_uri": self.redirect_uri,
            "response_type": "code",
            "state": uuid.uuid4().hex,
            "nonce": uuid.uuid4().hex,
            "code_verifier": code_verifier,  # Include code_verifier for later use
        }

        # Headers exactly as in working flow
        headers = self.session.headers.copy()
        headers.update(
            {"X-Requested-With": "com.duckduckgo.mobile.android", "Sec-GPC": "1"}
        )

        try:
            response = self.session.get(oauth_url, params=params, headers=headers)
            logger.info(f"   OAuth status: {response.status_code}")
            logger.info(f"   Final URL: {response.url}")

            if response.status_code == 200:
                # Extract stateToken from response
                state_token_match = re.search(
                    r'stateToken["\']:\s*["\']([^"\']+)["\']', response.text
                )
                if state_token_match:
                    self.state_token = state_token_match.group(1)
                    logger.info(
                        f"   ✅ State token extracted: {self.state_token[:50]}..."
                    )

                    # Log all cookies for debugging
                    logger.info("   🍪 Cookies after OAuth2:")
                    for cookie in self.session.cookies:
                        logger.info(f"      {cookie.name}: {cookie.value[:50]}...")

                    return True
                else:
                    logger.error("   ❌ No state token found in response")
                    logger.info(f"   Response preview: {response.text[:500]}...")
                    return False
            else:
                logger.error(
                    f"   ❌ OAuth authorization failed: {response.status_code}"
                )
                logger.error(f"   Response: {response.text[:500]}...")
                return False

        except Exception as e:
            logger.error(f"   ❌ Error in OAuth authorization: {e}")
            return False

    def step2_device_fingerprint(self) -> bool:
        """Step 2: Device Fingerprinting - EXACT from working flow."""
        logger.info("📱 Step 2: Device Fingerprinting")

        # First, visit the device fingerprint page
        fingerprint_url = f"{self.okta_base}/auth/services/devicefingerprint"

        headers = {
            "X-Requested-With": "com.duckduckgo.mobile.android",
            "Sec-GPC": "1",
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "Accept-Language": "en-US,en;q=0.9",
            "Accept-Encoding": "gzip, deflate",
            "Connection": "keep-alive",
        }

        try:
            response = self.session.get(fingerprint_url, headers=headers)
            logger.info(f"   Device fingerprint page status: {response.status_code}")

            if response.status_code == 200:
                # Now get device nonce
                return self.step3_device_nonce()
            else:
                logger.error(
                    f"   ❌ Device fingerprint page failed: {response.status_code}"
                )
                return False

        except Exception as e:
            logger.error(f"   ❌ Error in device fingerprinting: {e}")
            return False

    def step3_device_nonce(self) -> bool:
        """Step 3: Device Nonce - EXACT from working flow."""
        logger.info("🔑 Step 3: Device Nonce")

        url = f"{self.okta_base}/api/v1/internal/device/nonce"

        # Headers exactly as in working flow
        headers = {
            "Accept": "*/*",
            "User-Agent": "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36",
            "X-Requested-With": "XMLHttpRequest",
            "Origin": self.okta_base,
            "Sec-Fetch-Site": "same-origin",
            "Sec-Fetch-Mode": "cors",
            "Sec-Fetch-Dest": "empty",
            "Referer": f"{self.okta_base}/auth/services/devicefingerprint",
            "Accept-Encoding": "gzip, deflate",
            "Accept-Language": "en-US,en;q=0.9",
        }

        try:
            response = self.session.post(url, headers=headers, data="")
            logger.info(f"   Status: {response.status_code}")

            if response.status_code == 200:
                try:
                    data = response.json()
                    self.device_nonce = data.get("nonce")
                    logger.info(f"   ✅ Device nonce obtained: {self.device_nonce}")

                    # Log cookies after device nonce
                    logger.info("   🍪 Cookies after device nonce:")
                    for cookie in self.session.cookies:
                        logger.info(f"      {cookie.name}: {cookie.value[:50]}...")

                    return True
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    return False
            else:
                logger.error(f"   ❌ Device nonce failed: {response.status_code}")
                logger.error(f"   Response: {response.text[:200]}...")
                return False

        except Exception as e:
            logger.error(f"   ❌ Error getting device nonce: {e}")
            return False

    def step4_web_login_identify(self) -> bool:
        """Step 4: Web Login Identify - EXACT from working flow."""
        logger.info("🔐 Step 4: Web Login Identify")

        if not self.state_token:
            logger.error("   ❌ No state token available")
            return False

        url = f"{self.okta_base}/idp/idx/identify"

        # Headers exactly as in working flow
        headers = {
            "Accept": "application/json; okta-version=1.0.0",
            "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
            "X-Device-Fingerprint": f"{self.device_nonce}|a51183db48a04679a8d3769ee8a151455b09acf91a15ffe9625eeec4f91ad5b7|21c0dae824c3f48f32f5b271e1d291d8",
            "User-Agent": self.session.headers["User-Agent"],
            "Content-Type": "application/json",
            "Origin": self.okta_base,
            "X-Requested-With": "com.duckduckgo.mobile.android",
            "Sec-Fetch-Site": "same-origin",
            "Sec-Fetch-Mode": "cors",
            "Sec-Fetch-Dest": "empty",
            "Accept-Encoding": "gzip, deflate",
            "Accept-Language": "en-US,en;q=0.9",
        }

        # Body exactly as in working flow
        data = {
            "identifier": self.username,
            "stateHandle": self.state_token,  # Use stateToken as stateHandle
        }

        try:
            response = self.session.post(url, headers=headers, json=data)
            logger.info(f"   Status: {response.status_code}")
            logger.info(f"   Response headers: {dict(response.headers)}")

            if response.status_code == 200:
                try:
                    response_data = response.json()
                    logger.info("   ✅ IDX identify successful!")
                    logger.info(f"   Response: {json.dumps(response_data, indent=2)}")

                    # Extract stateHandle for next step
                    if "stateHandle" in response_data:
                        self.state_handle = response_data["stateHandle"]
                        logger.info(
                            f"   ✅ State handle obtained: {self.state_handle[:50]}..."
                        )
                    else:
                        logger.warning("   ⚠️ No stateHandle in response")

                    # Log cookies after IDX identify
                    logger.info("   🍪 Cookies after IDX identify:")
                    for cookie in self.session.cookies:
                        logger.info(f"      {cookie.name}: {cookie.value[:50]}...")

                    return True
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    logger.info(f"   Response text: {response.text[:500]}...")
                    return False
            else:
                logger.error(f"   ❌ IDX identify failed: {response.status_code}")
                logger.error(f"   Response: {response.text[:500]}...")
                return False

        except Exception as e:
            logger.error(f"   ❌ Error in IDX identify: {e}")
            return False

    def step5_challenge_answer(self) -> bool:
        """Step 5: Challenge Answer - EXACT from working flow."""
        logger.info("🔑 Step 5: Challenge Answer")

        if not self.state_handle:
            logger.error("   ❌ No state handle available")
            return False

        url = f"{self.okta_base}/idp/idx/challenge/answer"

        # Headers exactly as in working flow
        headers = {
            "Accept": "application/json; okta-version=1.0.0",
            "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
            "X-Device-Fingerprint": f"{self.device_nonce}|a51183db48a04679a8d3769ee8a151455b09acf91a15ffe9625eeec4f91ad5b7|21c0dae824c3f48f32f5b271e1d291d8",
            "User-Agent": self.session.headers["User-Agent"],
            "Content-Type": "application/json",
            "Origin": self.okta_base,
            "X-Requested-With": "com.duckduckgo.mobile.android",
            "Sec-Fetch-Site": "same-origin",
            "Sec-Fetch-Mode": "cors",
            "Sec-Fetch-Dest": "empty",
            "Accept-Encoding": "gzip, deflate",
            "Accept-Language": "en-US,en;q=0.9",
        }

        # Body exactly as in working flow
        data = {
            "credentials": {"passcode": self.password},
            "stateHandle": self.state_handle,
        }

        try:
            response = self.session.post(url, headers=headers, json=data)
            logger.info(f"   Status: {response.status_code}")
            logger.info(f"   Response headers: {dict(response.headers)}")

            if response.status_code == 200:
                try:
                    response_data = response.json()
                    logger.info("   ✅ Challenge answer successful!")
                    logger.info(f"   Response: {json.dumps(response_data, indent=2)}")

                    # Check for success redirect
                    if "success" in response_data and response_data["success"].get(
                        "href"
                    ):
                        redirect_url = response_data["success"]["href"]
                        logger.info(f"   🔄 Success redirect URL: {redirect_url}")
                        return self.step6_handle_success_redirect(redirect_url)
                    else:
                        logger.warning("   ⚠️ No success redirect found in response")
                        return True

                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    logger.info(f"   Response text: {response.text[:500]}...")
                    return False
            else:
                logger.error(f"   ❌ Challenge answer failed: {response.status_code}")
                logger.error(f"   Response: {response.text[:500]}...")
                return False

        except Exception as e:
            logger.error(f"   ❌ Error in challenge answer: {e}")
            return False

    def step6_handle_success_redirect(self, redirect_url: str) -> bool:
        """Step 6: Handle success redirect to get authorization code."""
        logger.info("🔄 Step 6: Handle Success Redirect")

        try:
            response = self.session.get(redirect_url, allow_redirects=True)
            logger.info(f"   Redirect status: {response.status_code}")
            logger.info(f"   Final URL: {response.url}")

            # Extract authorization code from URL
            parsed = urlparse(response.url)
            params = parse_qs(parsed.query)

            if "code" in params:
                auth_code = params["code"][0]
                logger.info(f"   ✅ Authorization code obtained: {auth_code[:20]}...")
                return self.step7_token_exchange(auth_code)
            else:
                logger.error("   ❌ No authorization code in redirect")
                logger.info(f"   URL params: {params}")
                return False

        except Exception as e:
            logger.error(f"   ❌ Error handling redirect: {e}")
            return False

    def step7_token_exchange(self, auth_code: str) -> bool:
        """Step 7: Token Exchange - EXACT from working flow."""
        logger.info("🎫 Step 7: Token Exchange")

        url = f"{self.okta_base}/oauth2/default/v1/token"

        # Headers exactly as in working flow
        headers = {
            "Accept": "application/json",
            "User-Agent": "Meijer/102800000 okhttp/5.1.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)",
            "Content-Type": "application/x-www-form-urlencoded",
        }

        # Form data exactly as in working flow
        data = {
            "grant_type": "authorization_code",
            "code": auth_code,
            "redirect_uri": self.redirect_uri,
            "client_id": self.client_id,
        }

        try:
            response = self.session.post(url, headers=headers, data=data)
            logger.info(f"   Status: {response.status_code}")

            if response.status_code == 200:
                try:
                    token_data = response.json()
                    logger.info("   ✅ Token exchange successful!")
                    logger.info(
                        f"   Access token: {token_data.get('access_token', 'N/A')[:20]}..."
                    )
                    logger.info(f"   Token type: {token_data.get('token_type', 'N/A')}")
                    logger.info(f"   Expires in: {token_data.get('expires_in', 'N/A')}")
                    logger.info(f"   Scope: {token_data.get('scope', 'N/A')}")

                    # Save tokens to file
                    self.save_tokens_to_file(token_data)
                    return True
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    return False
            else:
                logger.error(f"   ❌ Token exchange failed: {response.status_code}")
                logger.error(f"   Response: {response.text[:200]}...")
                return False

        except Exception as e:
            logger.error(f"   ❌ Error in token exchange: {e}")
            return False

    def save_tokens_to_file(self, token_data: Dict[str, Any]):
        """Save tokens to file."""
        try:
            auth_data = {
                "access_token": token_data.get("access_token"),
                "token_type": token_data.get("token_type"),
                "expires_in": token_data.get("expires_in"),
                "scope": token_data.get("scope"),
                "id_token": token_data.get("id_token"),
                "timestamp": time.time(),
            }

            with open("test_tokens.json", "w") as f:
                json.dump(auth_data, f, indent=2)

            logger.info("   💾 Tokens saved to test_tokens.json")

        except Exception as e:
            logger.error(f"   ❌ Error saving tokens: {e}")

    def execute_exact_sequence(self) -> bool:
        """Execute the exact login sequence with proper timing."""
        logger.info("🚀 Starting EXACT login sequence replication")
        logger.info("=" * 60)

        # Step 1: OAuth2 Authorization
        if not self.step1_oauth_authorize():
            return False

        # Wait as in successful flow (43.71 seconds)
        logger.info("   ⏱️  Waiting 43.71 seconds (as in successful flow)...")
        time.sleep(43.71)

        # Step 2: Device Fingerprinting
        if not self.step2_device_fingerprint():
            return False

        # Wait as in successful flow (0.32 seconds)
        logger.info("   ⏱️  Waiting 0.32 seconds (as in successful flow)...")
        time.sleep(0.32)

        # Step 3: Device Nonce (already done in step 2)

        # Step 4: Web Login Identify
        if not self.step4_web_login_identify():
            return False

        # Wait as in successful flow (48.18 seconds)
        logger.info("   ⏱️  Waiting 48.18 seconds (as in successful flow)...")
        time.sleep(48.18)

        # Step 5: Challenge Answer
        if not self.step5_challenge_answer():
            return False

        # Wait as in successful flow (79.50 seconds)
        logger.info("   ⏱️  Waiting 79.50 seconds (as in successful flow)...")
        time.sleep(79.50)

        # Step 6: Handle Success Redirect (done in step 5)

        # Step 7: Token Exchange (done in step 5)

        logger.info("=" * 60)
        logger.info("✅ EXACT login sequence completed successfully!")
        return True


def main():
    """Main function to test the exact flow."""
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

    # Create test instance
    test = ExactFlowTest(username=username, password=password)

    print("🔄 Starting exact flow test...")
    print("=" * 60)

    try:
        success = test.execute_exact_sequence()
        if success:
            print("✅ EXACT flow test completed successfully!")
        else:
            print("❌ EXACT flow test failed!")
    except KeyboardInterrupt:
        print("\n⏹️  Test interrupted by user")
    except Exception as e:
        print(f"❌ Unexpected error: {e}")


if __name__ == "__main__":
    main()
