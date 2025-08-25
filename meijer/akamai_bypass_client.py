#!/usr/bin/env python3
"""
Akamai Bypass Client for Meijer API

This module integrates header spoofing with your existing Meijer client
to bypass Akamai bot detection.
"""

import random
import time
from typing import Dict
import logging

import requests

from .header_spoofing import HeaderSpoofer, create_spoofed_session, get_spoofed_headers


class AkamaiBypassClient:
    """Enhanced Meijer client with Akamai bypass capabilities."""

    def __init__(self, base_url: str = "https://api.meijer.com"):
        self.base_url = base_url
        self.header_spoofer = HeaderSpoofer()
        self.session = create_spoofed_session()
        self.request_count = 0
        self.logger = logging.getLogger(__name__)

        # Configure retry strategy
        self.max_retries = 3
        self.retry_delay = 2

        # Track successful requests to maintain session consistency
        self.successful_requests = 0
        self.last_successful_request = 0

    def make_request(self, method: str, endpoint: str, **kwargs) -> requests.Response:
        """Make a request with Akamai bypass techniques."""

        url = f"{self.base_url}{endpoint}"

        # Add realistic delay between requests
        self._add_realistic_delay()

        # Rotate headers periodically to avoid detection
        if self.request_count % 20 == 0:
            self._rotate_headers()

        # Prepare headers for this specific request
        headers = get_spoofed_headers(url, method)

        # Add Meijer-specific headers
        headers.update(self._get_meijer_headers())

        # Update session headers
        self.session.headers.update(headers)

        # Make the request with retries
        for attempt in range(self.max_retries):
            try:
                # Don't pass headers again since they're already in the session
                response = self.session.request(method, url, **kwargs)
                self.request_count += 1

                # Check if we got blocked
                if self._is_blocked(response):
                    self.logger.warning(
                        f"Akamai blocking detected on attempt {attempt + 1}"
                    )

                    if attempt < self.max_retries - 1:
                        # Rotate headers and try again
                        self._rotate_headers()
                        time.sleep(self.retry_delay * (attempt + 1))
                        continue
                    else:
                        # Final attempt failed
                        return response

                # Success - update tracking
                self.successful_requests += 1
                self.last_successful_request = time.time()

                return response

            except requests.exceptions.RequestException as e:
                self.logger.error(f"Request failed on attempt {attempt + 1}: {e}")

                if attempt < self.max_retries - 1:
                    time.sleep(self.retry_delay * (attempt + 1))
                    continue
                else:
                    raise

    def _add_realistic_delay(self):
        """Add realistic delay between requests."""
        if self.request_count > 0:
            # Random delay between 1-3 seconds
            delay = random.uniform(1.0, 3.0)
            time.sleep(delay)

    def _rotate_headers(self):
        """Rotate to a new browser profile."""
        self.header_spoofer.rotate_profile()
        self.header_spoofer.apply_headers_to_session(self.session)

        # Also add dynamic headers
        self.header_spoofer.add_dynamic_headers(self.session, self.base_url)
        self.header_spoofer.add_meijer_specific_headers(self.session)

    def _get_meijer_headers(self) -> Dict[str, str]:
        """Get Meijer-specific headers."""
        return {
            "X-Meijer-App-Version": "5.0.0",
            "X-Meijer-Platform": "web",
            "X-Meijer-Client": "web-app",
            "X-Requested-With": "XMLHttpRequest",
        }

    def _is_blocked(self, response: requests.Response) -> bool:
        """Check if response indicates Akamai blocking."""
        if response.status_code in [403, 429, 503]:
            return True

        # Check response content for blocking indicators
        content_lower = response.text.lower()
        blocking_indicators = [
            "akamai",
            "challenge",
            "captcha",
            "bot detection",
            "security check",
            "verification",
            "access denied",
            "blocked",
            "rate limited",
        ]

        return any(indicator in content_lower for indicator in blocking_indicators)

    def get(self, endpoint: str, **kwargs) -> requests.Response:
        """Make a GET request with bypass."""
        return self.make_request("GET", endpoint, **kwargs)

    def post(self, endpoint: str, **kwargs) -> requests.Response:
        """Make a POST request with bypass."""
        return self.make_request("POST", endpoint, **kwargs)

    def put(self, endpoint: str, **kwargs) -> requests.Response:
        """Make a PUT request with bypass."""
        return self.make_request("PUT", endpoint, **kwargs)

    def delete(self, endpoint: str, **kwargs) -> requests.Response:
        """Make a DELETE request with bypass."""
        return self.make_request("DELETE", endpoint, **kwargs)

    def reset_session(self):
        """Reset the session and start fresh."""
        self.session = create_spoofed_session()
        self.request_count = 0
        self.successful_requests = 0
        self.last_successful_request = 0


# Integration with existing Meijer client
class EnhancedMeijerClient:
    """Enhanced Meijer client that uses Akamai bypass."""

    def __init__(self, original_client):
        self.original_client = original_client
        self.bypass_client = AkamaiBypassClient()

        # Override the original client's session with our bypass session
        self._enhance_original_client()

    def _enhance_original_client(self):
        """Enhance the original client with bypass capabilities."""
        # Store original methods
        original_get = self.original_client.session.get
        original_post = self.original_client.session.post

        # Override with bypass methods
        def enhanced_get(url, **kwargs):
            return self.bypass_client.get(url, **kwargs)

        def enhanced_post(url, **kwargs):
            return self.bypass_client.post(url, **kwargs)

        # Apply bypass headers to the original session
        apply_spoofed_headers_to_session(self.original_client.session)

        # Replace methods
        self.original_client.session.get = enhanced_get
        self.original_client.session.post = enhanced_post

    def __getattr__(self, name):
        """Delegate to original client for other attributes."""
        return getattr(self.original_client, name)


# Usage examples
def create_enhanced_meijer_client(original_client) -> EnhancedMeijerClient:
    """Create an enhanced Meijer client with Akamai bypass."""
    return EnhancedMeijerClient(original_client)


def test_akamai_bypass():
    """Test the Akamai bypass functionality."""
    client = AkamaiBypassClient()

    print("🧪 Testing Akamai bypass...")

    # Test different endpoints
    test_endpoints = [
        "/api/stores",
        "/api/products/search",
        "/api/coupons",
    ]

    for endpoint in test_endpoints:
        try:
            print(f"📡 Testing {endpoint}...")
            response = client.get(endpoint)

            if response.status_code == 200:
                print(f"✅ {endpoint} - Success")
            else:
                print(f"⚠️ {endpoint} - Status {response.status_code}")

        except Exception as e:
            print(f"❌ {endpoint} - Error: {e}")

        # Small delay between tests
        time.sleep(2)

    print("🏁 Testing complete!")


if __name__ == "__main__":
    test_akamai_bypass()
