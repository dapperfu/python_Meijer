#!/usr/bin/env python3
"""
Selenium test that goes directly to the OAuth2 flow like the working examples.
"""

import sys
import os
import time
import secrets
import hashlib
import base64
import uuid
import urllib.parse

# Add the current directory to Python path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))


def test_selenium_oauth_flow():
    """Test Selenium OAuth2 flow directly."""
    try:
        from selenium import webdriver
        from selenium.webdriver.firefox.options import Options
        from selenium.webdriver.common.by import By
        from selenium.webdriver.support.ui import WebDriverWait
        from selenium.webdriver.support import expected_conditions as EC

        print("✅ Selenium imported successfully")

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

        # Generate PKCE parameters like the working examples
        print("🔐 Generating PKCE parameters...")
        code_verifier = secrets.token_urlsafe(32)
        code_challenge = (
            base64.urlsafe_b64encode(hashlib.sha256(code_verifier.encode()).digest())
            .decode()
            .rstrip("=")
        )

        # Use the working client_id and scope from exact_login_replication.py
        client_id = "0oa1o8g9njWsUvwsx697"
        scope = "openid profile offline_access"
        redirect_uri = "com.meijer.mobile.meijer:/login"

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

        oauth_url = f"https://id.meijer.com/oauth2/default/v1/authorize?{urllib.parse.urlencode(oauth_params)}"
        print(f"🔐 OAuth2 URL: {oauth_url}")
        print()

        print("🚀 Starting Firefox browser...")

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
            print(f"🌐 Browser window size: {driver.get_window_size()}")

            # Navigate directly to OAuth2 authorization page
            print("🌐 Navigating to OAuth2 authorization page...")
            driver.get(oauth_url)

            # Wait for page to load
            print("⏳ Waiting for page to load...")
            time.sleep(5)

            print(f"📄 Current URL: {driver.current_url}")
            print(f"📄 Page title: {driver.title}")

            # Take a screenshot
            screenshot_file = f"oauth2_page_{int(time.time())}.png"
            driver.save_screenshot(screenshot_file)
            print(f"📸 Screenshot saved: {screenshot_file}")

            # Check if we got redirected to an error page
            if "error" in driver.title.lower() or "bad request" in driver.title.lower():
                print(
                    "❌ OAuth2 page shows error - this matches our direct requests issue"
                )
                print(
                    "💡 This confirms that the OAuth2 endpoint doesn't accept direct access"
                )

                # Try to go to the main Meijer signin page instead
                print("🔄 Trying main Meijer signin page instead...")
                driver.get("https://www.meijer.com/signin")
                time.sleep(5)

                print(f"📄 New URL: {driver.current_url}")
                print(f"📄 New title: {driver.title}")

                # Take another screenshot
                screenshot_file = f"meijer_signin_page_{int(time.time())}.png"
                driver.save_screenshot(screenshot_file)
                print(f"📸 New screenshot saved: {screenshot_file}")

                # Look for login form elements
                print("🔍 Looking for login form elements...")

                try:
                    wait = WebDriverWait(driver, 10)

                    # Look for username field
                    username_field = wait.until(
                        EC.presence_of_element_located((By.NAME, "username"))
                    )
                    print("✅ Username field found")

                    # Fill username
                    username_field.clear()
                    username_field.send_keys(username)
                    print("✅ Username entered")

                    # Look for password field
                    password_field = wait.until(
                        EC.presence_of_element_located((By.NAME, "password"))
                    )
                    print("✅ Password field found")

                    # Fill password
                    password_field.clear()
                    password_field.send_keys(password)
                    print("✅ Password entered")

                    # Look for submit button
                    submit_button = wait.until(
                        EC.element_to_be_clickable(
                            (By.XPATH, "//button[@type='submit']")
                        )
                    )
                    print("✅ Submit button found")

                    # Click submit
                    print("🔄 Clicking submit button...")
                    submit_button.click()

                    # Wait for response
                    print("⏳ Waiting for response...")
                    time.sleep(5)

                    print(f"📄 After submit - URL: {driver.current_url}")
                    print(f"📄 After submit - Title: {driver.title}")

                    # Take another screenshot
                    screenshot_file = f"after_submit_{int(time.time())}.png"
                    driver.save_screenshot(screenshot_file)
                    print(f"📸 After submit screenshot saved: {screenshot_file}")

                    # Check if we need 2FA
                    page_source = driver.page_source.lower()
                    if "verification" in page_source or "verify" in page_source:
                        print("📧 2FA/Verification detected!")
                    elif "dashboard" in page_source or "welcome" in page_source:
                        print("✅ Login successful!")
                    else:
                        print("❓ Unknown page state - check screenshots")

                except Exception as e:
                    print(f"❌ Error during form interaction: {e}")
                    # Take error screenshot
                    screenshot_file = f"form_error_{int(time.time())}.png"
                    driver.save_screenshot(screenshot_file)
                    print(f"📸 Error screenshot saved: {screenshot_file}")

            else:
                print("✅ OAuth2 page loaded successfully!")
                print("🔍 Looking for login form on OAuth2 page...")

                # Try to find login form elements
                try:
                    wait = WebDriverWait(driver, 10)

                    # Look for username field
                    username_field = wait.until(
                        EC.presence_of_element_located((By.NAME, "username"))
                    )
                    print("✅ Username field found on OAuth2 page")

                    # Fill username
                    username_field.clear()
                    username_field.send_keys(username)
                    print("✅ Username entered")

                    # Look for password field
                    password_field = wait.until(
                        EC.presence_of_element_located((By.NAME, "password"))
                    )
                    print("✅ Password field found on OAuth2 page")

                    # Fill password
                    password_field.clear()
                    password_field.send_keys(password)
                    print("✅ Password entered")

                    # Look for submit button
                    submit_button = wait.until(
                        EC.element_to_be_clickable(
                            (By.XPATH, "//button[@type='submit']")
                        )
                    )
                    print("✅ Submit button found on OAuth2 page")

                    # Click submit
                    print("🔄 Clicking submit button...")
                    submit_button.click()

                    # Wait for response
                    print("⏳ Waiting for response...")
                    time.sleep(5)

                    print(f"📄 After submit - URL: {driver.current_url}")
                    print(f"📄 After submit - Title: {driver.title}")

                    # Take another screenshot
                    screenshot_file = f"oauth2_after_submit_{int(time.time())}.png"
                    driver.save_screenshot(screenshot_file)
                    print(f"📸 After submit screenshot saved: {screenshot_file}")

                except Exception as e:
                    print(f"❌ Error during OAuth2 form interaction: {e}")
                    # Take error screenshot
                    screenshot_file = f"oauth2_error_{int(time.time())}.png"
                    driver.save_screenshot(screenshot_file)
                    print(f"📸 Error screenshot saved: {screenshot_file}")

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
        print(f"❌ Error testing Selenium OAuth2 flow: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    test_selenium_oauth_flow()
