#!/usr/bin/env python3
"""
Test to see what headers Selenium is actually sending.
"""

import sys
import os
import time

# Add the current directory to Python path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))


def test_selenium_headers():
    """Test what headers Selenium is actually sending."""
    try:
        from selenium import webdriver
        from selenium.webdriver.firefox.options import Options

        print("✅ Selenium imported successfully")

        print("🚀 Starting Firefox browser to test headers...")

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

            # Test the DuckDuckGo header injection
            print("🔧 Testing DuckDuckGo header injection...")

            # Navigate to a test page
            driver.get("https://httpbin.org/headers")
            time.sleep(3)

            print(f"📄 Current URL: {driver.current_url}")
            print(f"📄 Page title: {driver.title}")

            # Check if the page shows our headers
            page_source = driver.page_source
            if "com.duckduckgo.mobile.android" in page_source:
                print("✅ DuckDuckGo headers are being sent!")
            else:
                print("❌ DuckDuckGo headers are NOT being sent")
                print("📄 Page content:")
                print(page_source[:500])

            # Now test with a real request to see headers
            print("🔧 Testing real request headers...")

            # Execute JavaScript to make a request and check headers
            result = driver.execute_script("""
                return new Promise((resolve) => {
                    fetch('https://httpbin.org/headers', {
                        method: 'GET',
                        headers: {
                            'X-Requested-With': 'com.duckduckgo.mobile.android'
                        }
                    })
                    .then(response => response.json())
                    .then(data => {
                        console.log('Headers sent:', data.headers);
                        resolve(data.headers);
                    })
                    .catch(error => {
                        console.error('Error:', error);
                        resolve({error: error.toString()});
                    });
                });
            """)

            print("📊 Headers sent in fetch request:")
            print(result)

            # Check if X-Requested-With header was sent
            if result and "X-Requested-With" in result:
                print(f"✅ X-Requested-With header sent: {result['X-Requested-With']}")
            else:
                print("❌ X-Requested-With header NOT sent")

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
        print(f"❌ Error testing Selenium headers: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    test_selenium_headers()
