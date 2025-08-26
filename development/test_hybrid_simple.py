#!/usr/bin/env python3
"""
Simple Hybrid Authentication Test

Quick test to verify the hybrid approach works:
1. Selenium loads OAuth2 page (bypasses Akamai)
2. Extract cookies and state token
3. Test if requests can continue with those cookies
"""

import sys
import os
import time
import secrets
import hashlib
import base64
import uuid
from urllib.parse import urlencode

# Add the current directory to Python path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))


def test_hybrid_simple():
    """Simple test of hybrid authentication approach."""
    print("🚀 Simple Hybrid Authentication Test")
    print("=" * 50)

    try:
        from selenium import webdriver
        from selenium.webdriver.firefox.options import Options
        import requests

        print("✅ Selenium and requests imported successfully")

    except ImportError as e:
        print(f"❌ Required packages not available: {e}")
        print("Install with: pip install selenium requests")
        return False

    # Working parameters from exact_login_replication.py
    client_id = "0oa1o8g9njWsUvwsx697"
    redirect_uri = "com.meijer.mobile.meijer:/login"
    scope = "openid profile offline_access"

    # Generate PKCE parameters
    code_verifier = secrets.token_urlsafe(32)
    code_challenge = (
        base64.urlsafe_b64encode(hashlib.sha256(code_verifier.encode()).digest())
        .decode()
        .rstrip("=")
    )

    # Build OAuth2 URL
    oauth_params = {
        "login_hint": "",
        "code_challenge": code_challenge,
        "code_challenge_method": "S256",
        "client_id": client_id,
        "scope": scope,
        "redirect_uri": redirect_uri,
        "response_type": "code",
        "state": uuid.uuid4().hex,
        "nonce": uuid.uuid4().hex,
    }

    oauth_url = (
        f"https://id.meijer.com/oauth2/default/v1/authorize?{urlencode(oauth_params)}"
    )
    print(f"🔐 OAuth2 URL: {oauth_url}")

    # Step 1: Selenium to bypass Akamai
    print("\n🌐 Step 1: Using Selenium to bypass Akamai...")

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

    driver = None
    try:
        print("🌐 Starting Firefox...")
        driver = webdriver.Firefox(options=options)
        print("✅ Firefox started successfully!")

        # Navigate to OAuth2 page via Selenium
        print("🌐 Navigating to OAuth2 page via Selenium...")
        driver.get(oauth_url)

        # Wait for page to load
        time.sleep(5)

        print(f"📄 Current URL: {driver.current_url}")
        print(f"📄 Page title: {driver.title}")

        # Check if we got blocked
        page_source = driver.page_source.lower()
        if "access denied" in page_source or "error" in page_source:
            print("❌ OAuth2 page blocked in Selenium - this is unexpected")
            return False

        print("✅ OAuth2 page loaded successfully via Selenium!")

        # Extract cookies and state token
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

        # Step 2: Test requests with Selenium cookies
        print("\n🔄 Step 2: Testing requests with Selenium cookies...")

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
            print(f"   🍪 Added cookie: {cookie['name']} = {cookie['value'][:30]}...")

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

        # Step 3: Test if we can access the same page with requests
        print("\n🔄 Step 3: Testing if requests can access the same page...")

        try:
            response = session.get(oauth_url)
            print(f"   Status: {response.status_code}")

            if response.status_code == 200:
                print("✅ SUCCESS! Requests can access the page with Selenium cookies!")
                print("💡 This proves the hybrid approach works!")
                return True
            else:
                print(f"   ❌ Requests still blocked: {response.status_code}")
                print(f"   Response: {response.text[:200]}...")
                return False

        except Exception as e:
            print(f"   ❌ Error testing requests: {e}")
            return False

    except Exception as e:
        print(f"❌ Error in hybrid test: {e}")
        import traceback

        traceback.print_exc()
        return False

    finally:
        if driver:
            print("\n🔍 Keeping browser open for inspection...")
            print("💡 Close the browser manually when done")
            print("⏸️ Press Ctrl+C to exit this script")

            try:
                while True:
                    time.sleep(1)
            except KeyboardInterrupt:
                print("\n👋 Exiting...")
                driver.quit()


if __name__ == "__main__":
    test_hybrid_simple()
