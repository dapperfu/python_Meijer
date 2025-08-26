#!/usr/bin/env python3
"""
Exact Login Replication Tool
Replicates the exact successful login sequence from the mitmproxy logs
"""

import requests
import json
import time
import uuid
import os
import urllib3
import hashlib
import base64
import secrets
from urllib3.exceptions import InsecureRequestWarning
from urllib.parse import parse_qs, urlparse
from typing import Dict, Any, Tuple
import logging

# Suppress SSL warnings when using mitmproxy
urllib3.disable_warnings(InsecureRequestWarning)

# Configure logging
logging.basicConfig(
    level=logging.INFO, format="%(asctime)s - %(levelname)s - %(message)s"
)
logger = logging.getLogger(__name__)


class ExactLoginReplication:
    """Replicate the exact successful login sequence from logs."""

    def __init__(
        self,
        username: str,
        password: str,
        proxy_host: str = "127.0.0.1",
        proxy_port: int = 8080,
    ):
        self.username = username
        self.password = password
        self.proxy_host = proxy_host
        self.proxy_port = proxy_port

        # SSL certificate path for mitmproxy
        self.ssl_cert_path = "/keg/cursor/.mitmproxy/mitmproxy-ca-cert.pem"

        # Initialize session with proxy and SSL configuration
        self.session = requests.Session()

        # Configure proxy
        if proxy_host and proxy_port:
            self.session.proxies = {
                "http": f"http://{proxy_host}:{proxy_port}",
                "https": f"http://{proxy_host}:{proxy_port}",
            }
            print(f"🔌 Proxy configured: {proxy_host}:{proxy_port}")

        # Configure SSL with mitmproxy certificate
        if os.path.exists(self.ssl_cert_path):
            self.session.verify = self.ssl_cert_path
            print(f"🔒 SSL certificate configured: {self.ssl_cert_path}")
        else:
            # Fallback to no verification if certificate not found
            self.session.verify = False
            print(
                f"⚠️  SSL certificate not found at {self.ssl_cert_path}, SSL verification disabled"
            )

        # Initialize state variables
        self.state_token = None
        self.device_nonce = None
        self.state_handle = None
        self.code_verifier = None

        # Base URLs
        self.base_url = "https://id.meijer.com"

        # OAuth2 parameters from successful flow
        self.client_id = "0oa1o8g9njWsUvwsx697"
        self.redirect_uri = "com.meijer.mobile.meijer:/login"
        self.scope = "openid profile offline_access"

        # User agent from successful flow
        self.user_agent = "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36"

        # Headers from successful flow
        self.base_headers = {
            "User-Agent": self.user_agent,
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
            "Accept-Language": "en-US,en;q=0.9",
            "Accept-Encoding": "gzip, deflate",
            "Sec-Fetch-Site": "none",
            "Sec-Fetch-Mode": "navigate",
            "Sec-Fetch-User": "?1",
            "Sec-Fetch-Dest": "document",
            "Upgrade-Insecure-Requests": "1",
        }

        print(f"🚀 ExactLoginReplication initialized for {username}")
        print("🔧 Session headers configured for mobile app simulation")

    def generate_pkce_params(self) -> Tuple[str, str]:
        """Generate PKCE parameters exactly as in successful flow."""
        code_verifier = secrets.token_urlsafe(32)
        code_challenge = (
            base64.urlsafe_b64encode(hashlib.sha256(code_verifier.encode()).digest())
            .decode()
            .rstrip("=")
        )
        return code_verifier, code_challenge

    def generate_oauth_params(self) -> Dict[str, str]:
        """Generate OAuth2 parameters exactly as in successful flow."""
        code_verifier, code_challenge = self.generate_pkce_params()

        return {
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

    def step1_oauth_authorize(self) -> bool:
        """Step 1: OAuth2 Authorization - EXACT replication."""
        logger.info("🔐 Step 1: OAuth2 Authorization")

        # Generate OAuth parameters
        oauth_params = self.generate_oauth_params()
        # Store code_verifier for later use
        self.code_verifier = oauth_params.get("code_verifier")
        url = f"{self.base_url}/oauth2/default/v1/authorize"

        # Headers exactly as in successful flow
        headers = self.base_headers.copy()
        headers.update(
            {"X-Requested-With": "com.duckduckgo.mobile.android", "Sec-GPC": "1"}
        )

        try:
            response = self.session.get(url, params=oauth_params, headers=headers)
            logger.info(f"   Status: {response.status_code}")
            logger.info(f"   Response size: {len(response.content)} bytes")

            if response.status_code == 200:
                # Extract state token from response
                # This is the critical part - we need to parse the HTML to get the state token
                content = response.text
                if "stateToken" in content:
                    # Extract state token from JavaScript in the response
                    import re

                    match = re.search(
                        r'stateToken["\']?\s*:\s*["\']([^"\']+)["\']', content
                    )
                    if match:
                        self.state_token = match.group(1)
                        logger.info(
                            f"   ✅ State token extracted: {self.state_token[:50]}..."
                        )
                        return True
                    else:
                        logger.error(
                            "   ❌ Could not extract state token from response"
                        )
                        return False
                else:
                    logger.error("   ❌ No state token found in response")
                    return False
            else:
                logger.error(
                    f"   ❌ OAuth authorization failed: {response.status_code}"
                )
                return False

        except Exception as e:
            logger.error(f"   ❌ Error in OAuth authorization: {e}")
            return False

    def step2_device_fingerprint(self) -> bool:
        """Step 2: Device Fingerprinting - EXACT replication."""
        logger.info("📱 Step 2: Device Fingerprinting")

        # First, visit the device fingerprint page
        fingerprint_url = f"{self.base_url}/auth/services/devicefingerprint"

        headers = self.base_headers.copy()
        headers.update(
            {"X-Requested-With": "com.duckduckgo.mobile.android", "Sec-GPC": "1"}
        )

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
        """Step 3: Device Nonce - EXACT replication."""
        logger.info("🔑 Step 3: Device Nonce")

        url = f"{self.base_url}/api/v1/internal/device/nonce"

        # Headers exactly as in successful flow
        headers = {
            "Accept": "*/*",
            "User-Agent": self.user_agent,
            "X-Requested-With": "XMLHttpRequest",
            "Origin": self.base_url,
            "Sec-Fetch-Site": "same-origin",
            "Sec-Fetch-Mode": "cors",
            "Sec-Fetch-Dest": "empty",
            "Referer": f"{self.base_url}/auth/services/devicefingerprint",
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
                    return True
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    return False
            else:
                logger.error(f"   ❌ Device nonce failed: {response.status_code}")
                return False

        except Exception as e:
            logger.error(f"   ❌ Error getting device nonce: {e}")
            return False

    def step4_web_login_identify(self) -> bool:
        """Step 4: Web Login Identify - EXACT replication."""
        logger.info("🔐 Step 4: Web Login Identify")

        if not self.state_token:
            logger.error("   ❌ No state token available")
            return False

        url = f"{self.base_url}/idp/idx/identify"

        # Headers exactly as in successful flow
        headers = {
            "Accept": "application/json; okta-version=1.0.0",
            "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
            "X-Device-Fingerprint": f"{self.device_nonce}|a51183db48a04679a8d3769ee8a151455b09acf91a15ffe9625eeec4f91ad5b7|21c0dae824c3f48f32f5b271e1d291d8",
            "User-Agent": self.user_agent,
            "Content-Type": "application/json",
            "Origin": self.base_url,
            "X-Requested-With": "com.duckduckgo.mobile.android",
            "Sec-Fetch-Site": "same-origin",
            "Sec-Fetch-Mode": "cors",
            "Sec-Fetch-Dest": "empty",
            "Accept-Encoding": "gzip, deflate",
            "Accept-Language": "en-US,en;q=0.9",
        }

        # Request body exactly as in successful flow
        data = {"identifier": self.username, "stateHandle": self.state_token}

        try:
            response = self.session.post(url, headers=headers, json=data)
            logger.info(f"   Status: {response.status_code}")

            if response.status_code == 200:
                try:
                    data = response.json()
                    # Extract state handle for next step
                    if "stateHandle" in data:
                        self.state_handle = data["stateHandle"]
                        logger.info(
                            f"   ✅ State handle obtained: {self.state_handle[:50]}..."
                        )
                        return True
                    else:
                        logger.error("   ❌ No state handle in response")
                        return False
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    return False
            else:
                logger.error(f"   ❌ Web login identify failed: {response.status_code}")
                logger.error(f"   Response: {response.text[:200]}...")
                return False

        except Exception as e:
            logger.error(f"   ❌ Error in web login identify: {e}")
            return False

    def step5_challenge_answer(self) -> bool:
        """Step 5: Challenge Answer (Password) - EXACT replication."""
        logger.info("🔑 Step 5: Challenge Answer")

        if not self.state_handle:
            logger.error("   ❌ No state handle available")
            return False

        url = f"{self.base_url}/idp/idx/challenge/answer"

        # Headers exactly as in successful flow
        headers = {
            "Accept": "application/json; okta-version=1.0.0",
            "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
            "X-Device-Fingerprint": f"{self.device_nonce}|a51183db48a04679a8d3769ee8a151455b09acf91a15ffe9625eeec4f91ad5b7|21c0dae824c3f48f32f5b271e1d291d8",
            "User-Agent": self.user_agent,
            "Content-Type": "application/json",
            "Origin": self.base_url,
            "X-Requested-With": "com.duckduckgo.mobile.android",
            "Sec-Fetch-Site": "same-origin",
            "Sec-Fetch-Mode": "cors",
            "Sec-Fetch-Dest": "empty",
            "Accept-Encoding": "gzip, deflate",
            "Accept-Language": "en-US,en;q=0.9",
        }

        # Request body exactly as in successful flow
        data = {
            "credentials": {"passcode": self.password},
            "stateHandle": self.state_handle,
        }

        try:
            response = self.session.post(url, headers=headers, json=data)
            logger.info(f"   Status: {response.status_code}")

            if response.status_code == 200:
                try:
                    data = response.json()
                    logger.info("   ✅ Challenge answer successful")
                    # Check if we have success redirect
                    if "success" in data and "href" in data["success"]:
                        redirect_url = data["success"]["href"]
                        logger.info(f"   Redirect URL: {redirect_url}")
                        return self.step6_handle_success_redirect(redirect_url)
                    else:
                        logger.error("   ❌ No success redirect in response")
                        return False
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    return False
            else:
                logger.error(f"   ❌ Challenge answer failed: {response.status_code}")
                logger.error(f"   Response: {response.text[:200]}...")
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
                return False

        except Exception as e:
            logger.error(f"   ❌ Error handling redirect: {e}")
            return False

    def step7_token_exchange(self, auth_code: str) -> bool:
        """Step 7: Token Exchange - EXACT replication."""
        logger.info("🎫 Step 7: Token Exchange")

        url = f"{self.base_url}/oauth2/default/v1/token"

        # Headers exactly as in successful flow
        headers = {
            "Accept": "application/json",
            "User-Agent": "Meijer/102800000 okhttp/5.1.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)",
            "Content-Type": "application/x-www-form-urlencoded",
        }

        # Form data exactly as in successful flow
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

                    # Save tokens to auth.json
                    self.save_tokens_to_auth_json(token_data)
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

    def save_tokens_to_auth_json(self, token_data: Dict[str, Any]):
        """Save tokens to auth.json file."""
        try:
            auth_data = {
                "access_token": token_data.get("access_token"),
                "token_type": token_data.get("token_type"),
                "expires_in": token_data.get("expires_in"),
                "scope": token_data.get("scope"),
                "id_token": token_data.get("id_token"),
                "timestamp": time.time(),
            }

            with open("auth.json", "w") as f:
                json.dump(auth_data, f, indent=2)

            logger.info("   💾 Tokens saved to auth.json")

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
    """Main function to demonstrate the exact login replication."""
    # Read credentials directly from login.txt file
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

    # Check SSL certificate availability
    ssl_cert_path = "/keg/cursor/.mitmproxy/mitmproxy-ca-cert.pem"
    if os.path.exists(ssl_cert_path):
        print(f"✅ SSL certificate found: {ssl_cert_path}")
    else:
        print(f"⚠️  SSL certificate not found: {ssl_cert_path}")
        print("   SSL verification will be disabled")
    print()

    # Create login instance with proxy support
    login = ExactLoginReplication(
        username=username, password=password, proxy_host="127.0.0.1", proxy_port=8080
    )

    print("🔄 Starting exact login replication...")
    print("=" * 60)

    try:
        # Step 1: OAuth2 Authorization
        print("\n📋 Step 1: OAuth2 Authorization")
        result = login.step1_oauth_authorize()
        if not result:
            print("❌ Step 1 failed")
            return
        print("✅ Step 1 completed")

        # Step 2: Device Fingerprint
        print("\n📋 Step 2: Device Fingerprint")
        result = login.step2_device_fingerprint()
        if not result:
            print("❌ Step 2 failed")
            return
        print("✅ Step 2 completed")

        # Step 3: Device Nonce
        print("\n📋 Step 3: Device Nonce")
        result = login.step3_device_nonce()
        if not result:
            print("❌ Step 3 failed")
            return
        print("✅ Step 3 completed")

        # Step 4: Web Login Identify
        print("\n📋 Step 4: Web Login Identify")
        result = login.step4_web_login_identify()
        if not result:
            print("❌ Step 4 failed")
            return
        print("✅ Step 4 completed")

        # Step 5: Challenge Answer
        print("\n📋 Step 5: Challenge Answer")
        result = login.step5_challenge_answer()
        if not result:
            print("❌ Step 5 failed")
            return
        print("✅ Step 5 completed")

        # Step 6: OAuth Keys
        print("\n📋 Step 6: OAuth Keys")
        result = login.step6_oauth_keys()
        if not result:
            print("❌ Step 6 failed")
            return
        print("✅ Step 6 completed")

        # Step 7: Token Exchange
        print("\n📋 Step 7: Token Exchange")
        # For now, we'll use a placeholder auth code since we need to extract it from previous steps
        result = login.step7_token_exchange("placeholder_auth_code")
        if not result:
            print("❌ Step 7 failed")
            return
        print("✅ Step 7 completed")

        print("\n🎉 All steps completed successfully!")
        print("🔑 Authentication tokens should now be available")

    except Exception as e:
        print(f"\n💥 Error during login replication: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    main()
