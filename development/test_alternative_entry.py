#!/usr/bin/env python3
"""
Test script to try alternative entry points for authentication.
"""

import requests
import logging

# Set up logging
logging.basicConfig(
    level=logging.INFO, format="%(asctime)s - %(levelname)s - %(message)s"
)
logger = logging.getLogger(__name__)


def test_alternative_entry_points():
    """Test alternative entry points for authentication."""
    logger.info("🔐 Testing alternative entry points")

    # Create session
    session = requests.Session()
    session.headers.update(
        {
            "User-Agent": "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36",
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
            "Accept-Language": "en-US,en;q=0.9",
            "Accept-Encoding": "gzip, deflate",
            "Connection": "keep-alive",
            "Upgrade-Insecure-Requests": "1",
        }
    )

    # Disable SSL verification for testing
    session.verify = False
    import urllib3

    urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)

    # First, visit Meijer homepage to get cookies
    logger.info("🏠 Step 1: Visiting Meijer homepage")
    try:
        response = session.get("https://www.meijer.com")
        logger.info(f"   Homepage status: {response.status_code}")

        if response.status_code == 200:
            logger.info("   ✅ Homepage loaded successfully")

            # Log cookies
            logger.info("   🍪 Cookies after homepage:")
            for cookie in session.cookies:
                logger.info(f"      {cookie.name}: {cookie.value[:50]}...")
        else:
            logger.error(f"   ❌ Homepage failed: {response.status_code}")
            return False

    except Exception as e:
        logger.error(f"   ❌ Error loading homepage: {e}")
        return False

    # Test alternative endpoints
    endpoints_to_test = [
        "https://id.meijer.com/signin",
        "https://id.meijer.com/login",
        "https://id.meijer.com/idp/idx",
        "https://id.meijer.com/auth",
        "https://www.meijer.com/login",
        "https://www.meijer.com/signin",
    ]

    for endpoint in endpoints_to_test:
        logger.info(f"🔐 Testing endpoint: {endpoint}")
        try:
            response = session.get(endpoint)
            logger.info(f"   Status: {response.status_code}")
            logger.info(f"   Final URL: {response.url}")

            if response.status_code == 200:
                logger.info("   ✅ Endpoint accessible")
                logger.info(f"   Response size: {len(response.content)} bytes")

                # Check for interesting content
                if "stateToken" in response.text:
                    logger.info("   ✅ Found stateToken in response")
                if "form" in response.text.lower():
                    logger.info("   ✅ Found form in response")
                if "login" in response.text.lower():
                    logger.info("   ✅ Found login in response")
                if "okta" in response.text.lower():
                    logger.info("   ✅ Found Okta in response")
                if "meijer" in response.text.lower():
                    logger.info("   ✅ Found Meijer in response")

                # Show response preview
                logger.info(f"   Response preview: {response.text[:300]}...")

            else:
                logger.info(f"   ⚠️ Endpoint returned {response.status_code}")

        except Exception as e:
            logger.error(f"   ❌ Error testing endpoint: {e}")

    # Try to find login links on homepage
    logger.info("🔍 Step 2: Looking for login links on homepage")
    try:
        response = session.get("https://www.meijer.com")
        if response.status_code == 200:
            # Look for login/signin links
            import re

            login_links = re.findall(
                r'href=["\']([^"\']*[Ll]ogin[^"\']*)["\']', response.text
            )
            signin_links = re.findall(
                r'href=["\']([^"\']*[Ss]ignin[^"\']*)["\']', response.text
            )

            logger.info(f"   Found {len(login_links)} login links:")
            for link in login_links[:5]:  # Show first 5
                logger.info(f"      {link}")

            logger.info(f"   Found {len(signin_links)} signin links:")
            for link in signin_links[:5]:  # Show first 5
                logger.info(f"      {link}")

    except Exception as e:
        logger.error(f"   ❌ Error looking for login links: {e}")

    return True


def main():
    """Main function."""
    print("🔄 Testing alternative entry points...")
    print("=" * 60)

    try:
        success = test_alternative_entry_points()
        if success:
            print("✅ Alternative entry points test completed!")
        else:
            print("❌ Alternative entry points test failed!")
    except Exception as e:
        print(f"❌ Unexpected error: {e}")


if __name__ == "__main__":
    main()
