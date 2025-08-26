#!/usr/bin/env python3
"""
Test script to directly access the OAuth2 endpoint without parameters.
"""

import requests
import logging

# Set up logging
logging.basicConfig(
    level=logging.INFO, format="%(asctime)s - %(levelname)s - %(message)s"
)
logger = logging.getLogger(__name__)


def test_oauth2_direct():
    """Test direct access to OAuth2 endpoint."""
    logger.info("🔐 Testing direct OAuth2 endpoint access")

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

    # Now try to access OAuth2 endpoint directly
    logger.info("🔐 Step 2: Accessing OAuth2 endpoint directly")
    try:
        oauth_url = "https://id.meijer.com/oauth2/default/v1/authorize"
        response = session.get(oauth_url)
        logger.info(f"   OAuth2 direct status: {response.status_code}")
        logger.info(f"   Final URL: {response.url}")

        if response.status_code == 200:
            logger.info("   ✅ OAuth2 endpoint accessible directly")
            logger.info(f"   Response size: {len(response.content)} bytes")
            logger.info(f"   Response preview: {response.text[:500]}...")

            # Check for any forms or state tokens
            if "stateToken" in response.text:
                logger.info("   ✅ Found stateToken in response")
            if "form" in response.text.lower():
                logger.info("   ✅ Found form in response")
            if "login" in response.text.lower():
                logger.info("   ✅ Found login in response")

        else:
            logger.error(f"   ❌ OAuth2 endpoint failed: {response.status_code}")
            logger.error(f"   Response: {response.text[:500]}...")
            return False

    except Exception as e:
        logger.error(f"   ❌ Error accessing OAuth2 endpoint: {e}")
        return False

    # Try with minimal parameters
    logger.info("🔐 Step 3: Testing OAuth2 with minimal parameters")
    try:
        params = {"client_id": "0oa22cbewuCICOsKz697", "response_type": "code"}

        response = session.get(oauth_url, params=params)
        logger.info(f"   OAuth2 minimal status: {response.status_code}")
        logger.info(f"   Final URL: {response.url}")

        if response.status_code == 200:
            logger.info("   ✅ OAuth2 with minimal params successful")
            logger.info(f"   Response preview: {response.text[:500]}...")
        else:
            logger.error(
                f"   ❌ OAuth2 with minimal params failed: {response.status_code}"
            )
            logger.error(f"   Response: {response.text[:500]}...")

    except Exception as e:
        logger.error(f"   ❌ Error testing minimal params: {e}")

    return True


def main():
    """Main function."""
    print("🔄 Testing OAuth2 endpoint access...")
    print("=" * 60)

    try:
        success = test_oauth2_direct()
        if success:
            print("✅ OAuth2 endpoint test completed!")
        else:
            print("❌ OAuth2 endpoint test failed!")
    except Exception as e:
        print(f"❌ Unexpected error: {e}")


if __name__ == "__main__":
    main()
