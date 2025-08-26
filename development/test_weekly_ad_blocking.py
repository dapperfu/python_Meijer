#!/usr/bin/env python3
"""
Test to see why the weekly ad endpoint is blocked in Selenium Firefox but not regular Firefox.
"""

import sys
import os
import time

# Add the current directory to Python path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))


def test_weekly_ad_blocking():
    """Test weekly ad endpoint access."""
    try:
        from selenium import webdriver
        from selenium.webdriver.firefox.options import Options

        print("✅ Selenium imported successfully")

        print("🚀 Starting Firefox browser to test weekly ad endpoint...")

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

            # Test the weekly ad endpoint
            print("🔧 Testing weekly ad endpoint access...")

            # Navigate to the weekly ad page
            driver.get("https://www.meijer.com/shopping/weeklyad.html")
            time.sleep(5)

            print(f"📄 Current URL: {driver.current_url}")
            print(f"📄 Page title: {driver.title}")

            # Check if we got blocked
            page_source = driver.page_source.lower()
            if (
                "access denied" in page_source
                or "blocked" in page_source
                or "forbidden" in page_source
            ):
                print("❌ Weekly ad endpoint is BLOCKED in Selenium Firefox")
                print("🔍 This indicates bot detection is working")
            else:
                print("✅ Weekly ad endpoint is accessible in Selenium Firefox")

            # Take a screenshot
            screenshot_file = f"weekly_ad_test_{int(time.time())}.png"
            driver.save_screenshot(screenshot_file)
            print(f"📸 Screenshot saved: {screenshot_file}")

            # Check for specific error messages
            if "error" in page_source:
                print("🔍 Error detected in page content")
                # Look for error messages
                error_elements = driver.find_elements_by_xpath(
                    "//*[contains(text(), 'error') or contains(text(), 'Error')]"
                )
                for elem in error_elements[:5]:  # Show first 5
                    print(f"   Error element: {elem.tag_name} - {elem.text[:100]}...")

            # Check the network tab or console for any failed requests
            print("🔍 Checking for failed network requests...")

            # Execute JavaScript to check for failed requests
            failed_requests = driver.execute_script("""
                // Check if there are any failed network requests
                return {
                    'failed_fetches': window.failedFetches || [],
                    'console_errors': window.consoleErrors || [],
                    'page_errors': window.pageErrors || []
                };
            """)

            print("📊 Network request analysis:")
            print(failed_requests)

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
        print(f"❌ Error testing weekly ad blocking: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    test_weekly_ad_blocking()
