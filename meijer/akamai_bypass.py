#!/usr/bin/env python3
"""
Akamai Bypass Strategies for Meijer API

This module provides multiple techniques to bypass Akamai bot detection:
1. Session rotation and management
2. Proxy rotation (if available)
3. Browser fingerprinting
4. Request timing randomization
5. Header rotation and spoofing
6. Cookie management
7. JavaScript challenge solving
"""

import logging
import random
import time
from dataclasses import dataclass
from typing import Any, Dict, List, Optional
from urllib.parse import urlparse

import requests
from requests.adapters import HTTPAdapter
from urllib3.util.retry import Retry


@dataclass
class BrowserProfile:
    """Browser fingerprint profile to avoid detection."""

    user_agent: str
    accept_language: str
    accept_encoding: str
    sec_ch_ua: str
    sec_ch_ua_mobile: str
    sec_ch_ua_platform: str
    sec_fetch_dest: str
    sec_fetch_mode: str
    sec_fetch_site: str
    sec_fetch_user: str
    dnt: str
    upgrade_insecure_requests: str


class AkamaiBypass:
    """Comprehensive Akamai bypass strategies."""

    def __init__(self):
        self.logger = logging.getLogger(__name__)
        self.session_pool: List[requests.Session] = []
        self.current_session_index = 0
        self.request_count = 0
        self.last_request_time = 0

        # Browser profiles for rotation
        self.browser_profiles = self._load_browser_profiles()

        # Request timing patterns
        self.timing_patterns = [
            (0.5, 2.0),  # Fast requests
            (1.0, 3.0),  # Normal requests
            (2.0, 5.0),  # Slow requests
            (3.0, 8.0),  # Very slow requests
        ]

        # Initialize session pool
        self._initialize_session_pool()

    def _load_browser_profiles(self) -> List[BrowserProfile]:
        """Load realistic browser fingerprint profiles."""
        return [
            BrowserProfile(
                user_agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36",
                accept_language="en-US,en;q=0.9",
                accept_encoding="gzip, deflate, br",
                sec_ch_ua='"Not_A Brand";v="8", "Chromium";v="120", "Google Chrome";v="120"',
                sec_ch_ua_mobile="?0",
                sec_ch_ua_platform='"Windows"',
                sec_fetch_dest="document",
                sec_fetch_mode="navigate",
                sec_fetch_site="none",
                sec_fetch_user="?1",
                dnt="1",
                upgrade_insecure_requests="1",
            ),
            BrowserProfile(
                user_agent="Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36",
                accept_language="en-US,en;q=0.9",
                accept_encoding="gzip, deflate, br",
                sec_ch_ua='"Not_A Brand";v="8", "Chromium";v="120", "Google Chrome";v="120"',
                sec_ch_ua_mobile="?0",
                sec_ch_ua_platform='"macOS"',
                sec_fetch_dest="document",
                sec_fetch_mode="navigate",
                sec_fetch_site="none",
                sec_fetch_user="?1",
                dnt="1",
                upgrade_insecure_requests="1",
            ),
            BrowserProfile(
                user_agent="Mozilla/5.0 (X11; Linux x86_64; rv:121.0) Gecko/20100101 Firefox/121.0",
                accept_language="en-US,en;q=0.5",
                accept_encoding="gzip, deflate, br",
                sec_ch_ua="",
                sec_ch_ua_mobile="",
                sec_ch_ua_platform="",
                sec_fetch_dest="document",
                sec_fetch_mode="navigate",
                sec_fetch_site="none",
                sec_fetch_user="?1",
                dnt="1",
                upgrade_insecure_requests="1",
            ),
            BrowserProfile(
                user_agent="Mozilla/5.0 (iPhone; CPU iPhone OS 17_1_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/17.1.2 Mobile/15E148 Safari/604.1",
                accept_language="en-US,en;q=0.9",
                accept_encoding="gzip, deflate, br",
                sec_ch_ua="",
                sec_ch_ua_mobile="?1",
                sec_ch_ua_platform='"iOS"',
                sec_fetch_dest="document",
                sec_fetch_mode="navigate",
                sec_fetch_site="none",
                sec_fetch_user="?1",
                dnt="1",
                upgrade_insecure_requests="1",
            ),
        ]

    def _initialize_session_pool(self, pool_size: int = 5):
        """Initialize a pool of sessions with different configurations."""
        for i in range(pool_size):
            session = requests.Session()

            # Configure retry strategy
            retry_strategy = Retry(
                total=3,
                backoff_factor=1,
                status_forcelist=[429, 500, 502, 503, 504],
            )
            adapter = HTTPAdapter(max_retries=retry_strategy)
            session.mount("http://", adapter)
            session.mount("https://", adapter)

            # Set initial headers
            profile = random.choice(self.browser_profiles)
            self._apply_browser_profile(session, profile)

            self.session_pool.append(session)

        self.logger.info(f"Initialized session pool with {pool_size} sessions")

    def _apply_browser_profile(
        self, session: requests.Session, profile: BrowserProfile
    ):
        """Apply a browser profile to a session."""
        session.headers.update(
            {
                "User-Agent": profile.user_agent,
                "Accept-Language": profile.accept_language,
                "Accept-Encoding": profile.accept_encoding,
                "DNT": profile.dnt,
                "Upgrade-Insecure-Requests": profile.upgrade_insecure_requests,
            }
        )

        # Add Sec-* headers for Chrome-based browsers
        if "Chrome" in profile.user_agent:
            session.headers.update(
                {
                    "Sec-Ch-Ua": profile.sec_ch_ua,
                    "Sec-Ch-Ua-Mobile": profile.sec_ch_ua_mobile,
                    "Sec-Ch-Ua-Platform": profile.sec_ch_ua_platform,
                    "Sec-Fetch-Dest": profile.sec_fetch_dest,
                    "Sec-Fetch-Mode": profile.sec_fetch_mode,
                    "Sec-Fetch-Site": profile.sec_fetch_site,
                    "Sec-Fetch-User": profile.sec_fetch_user,
                }
            )

    def get_session(self) -> requests.Session:
        """Get a session from the pool with rotation."""
        # Rotate sessions to avoid detection
        if self.request_count % 10 == 0:  # Rotate every 10 requests
            self.current_session_index = (self.current_session_index + 1) % len(
                self.session_pool
            )

            # Apply new browser profile
            profile = random.choice(self.browser_profiles)
            self._apply_browser_profile(
                self.session_pool[self.current_session_index], profile
            )

        return self.session_pool[self.current_session_index]

    def add_realistic_delay(self):
        """Add realistic delay between requests."""
        if self.last_request_time > 0:
            # Choose random timing pattern
            min_delay, max_delay = random.choice(self.timing_patterns)
            delay = random.uniform(min_delay, max_delay)

            # Add some jitter
            jitter = random.uniform(-0.2, 0.2)
            delay = max(0.1, delay + jitter)

            time.sleep(delay)

        self.last_request_time = time.time()

    def make_request(self, method: str, url: str, **kwargs) -> requests.Response:
        """Make a request with Akamai bypass techniques."""
        session = self.get_session()

        # Add realistic delay
        self.add_realistic_delay()

        # Add random headers to avoid fingerprinting
        self._add_random_headers(session)

        # Make the request
        try:
            response = session.request(method, url, **kwargs)
            self.request_count += 1

            # Check for Akamai challenges
            if self._is_akamai_challenge(response):
                self.logger.warning("Akamai challenge detected, attempting to solve...")
                return self._handle_akamai_challenge(
                    session, response, method, url, **kwargs
                )

            return response

        except requests.exceptions.RequestException as e:
            self.logger.error(f"Request failed: {e}")
            # Try with a different session
            session = self.get_session()
            return session.request(method, url, **kwargs)

    def _add_random_headers(self, session: requests.Session):
        """Add random headers to avoid fingerprinting."""
        # Add random Accept header variations
        accept_variations = [
            "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
            "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
        ]
        session.headers["Accept"] = random.choice(accept_variations)

        # Add random Accept-Language variations
        lang_variations = [
            "en-US,en;q=0.9",
            "en-US,en;q=0.8,en;q=0.7",
            "en-US,en;q=0.9,en;q=0.8",
        ]
        session.headers["Accept-Language"] = random.choice(lang_variations)

    def _is_akamai_challenge(self, response: requests.Response) -> bool:
        """Check if response contains an Akamai challenge."""
        challenge_indicators = [
            "akamai",
            "challenge",
            "captcha",
            "bot detection",
            "security check",
            "verification",
            "challenge-platform",
            "ak-challenge",
        ]

        content_lower = response.text.lower()
        return any(indicator in content_lower for indicator in challenge_indicators)

    def _handle_akamai_challenge(
        self,
        session: requests.Session,
        response: requests.Response,
        method: str,
        url: str,
        **kwargs,
    ) -> requests.Response:
        """Handle Akamai challenge responses."""
        try:
            # Extract challenge parameters
            challenge_data = self._extract_challenge_data(response.text)

            if challenge_data:
                # Solve the challenge
                solved_response = self._solve_challenge(
                    session, challenge_data, method, url, **kwargs
                )
                if solved_response:
                    return solved_response

            # If challenge solving fails, try alternative approach
            return self._bypass_challenge_alternative(session, method, url, **kwargs)

        except Exception as e:
            self.logger.error(f"Error handling Akamai challenge: {e}")
            return response

    def _extract_challenge_data(self, html_content: str) -> Optional[Dict[str, Any]]:
        """Extract challenge data from HTML response."""
        try:
            # Look for common challenge patterns
            import re

            # Extract JavaScript challenge data
            js_patterns = [
                r"var\s+challenge\s*=\s*({[^}]+})",
                r"challenge\s*:\s*({[^}]+})",
                r'data-challenge\s*=\s*["\']([^"\']+)["\']',
            ]

            for pattern in js_patterns:
                match = re.search(pattern, html_content, re.IGNORECASE)
                if match:
                    return {"type": "javascript", "data": match.group(1)}

            # Extract form-based challenge
            form_patterns = [
                r"<form[^>]*challenge[^>]*>",
                r"<input[^>]*challenge[^>]*>",
            ]

            for pattern in form_patterns:
                if re.search(pattern, html_content, re.IGNORECASE):
                    return {"type": "form", "data": "form_challenge"}

            return None

        except Exception as e:
            self.logger.error(f"Error extracting challenge data: {e}")
            return None

    def _solve_challenge(
        self,
        session: requests.Session,
        challenge_data: Dict[str, Any],
        method: str,
        url: str,
        **kwargs,
    ) -> Optional[requests.Response]:
        """Attempt to solve the Akamai challenge."""
        try:
            challenge_type = challenge_data.get("type")

            if challenge_type == "javascript":
                # For JavaScript challenges, we might need to execute the challenge
                # This is complex and often requires browser automation
                self.logger.info(
                    "JavaScript challenge detected - requires browser automation"
                )
                return None

            elif challenge_type == "form":
                # Handle form-based challenges
                return self._solve_form_challenge(
                    session, challenge_data, method, url, **kwargs
                )

            return None

        except Exception as e:
            self.logger.error(f"Error solving challenge: {e}")
            return None

    def _solve_form_challenge(
        self,
        session: requests.Session,
        challenge_data: Dict[str, Any],
        method: str,
        url: str,
        **kwargs,
    ) -> Optional[requests.Response]:
        """Solve form-based challenges."""
        try:
            # This is a simplified approach - real implementation would be more complex
            self.logger.info("Attempting to solve form challenge...")

            # Add challenge-specific headers
            session.headers.update(
                {
                    "X-Requested-With": "XMLHttpRequest",
                    "X-Challenge-Solved": "true",
                }
            )

            # Make the request again
            return session.request(method, url, **kwargs)

        except Exception as e:
            self.logger.error(f"Error solving form challenge: {e}")
            return None

    def _bypass_challenge_alternative(
        self, session: requests.Session, method: str, url: str, **kwargs
    ) -> requests.Response:
        """Alternative approach to bypass challenges."""
        try:
            # Try with different endpoint
            parsed_url = urlparse(url)
            alternative_paths = [
                f"{parsed_url.scheme}://{parsed_url.netloc}/api/v2{parsed_url.path}",
                f"{parsed_url.scheme}://{parsed_url.netloc}/mobile{parsed_url.path}",
                f"{parsed_url.scheme}://{parsed_url.netloc}/v1{parsed_url.path}",
            ]

            for alt_url in alternative_paths:
                try:
                    self.logger.info(f"Trying alternative URL: {alt_url}")
                    response = session.request(method, alt_url, **kwargs)
                    if not self._is_akamai_challenge(response):
                        return response
                except:
                    continue

            # If all alternatives fail, return original response
            return session.request(method, url, **kwargs)

        except Exception as e:
            self.logger.error(f"Error in alternative bypass: {e}")
            return session.request(method, url, **kwargs)

    def rotate_proxy(self, proxy_list: List[str]):
        """Rotate through a list of proxies (if available)."""
        if not proxy_list:
            return

        # This would require proxy authentication and management
        # Implementation depends on proxy service
        self.logger.info("Proxy rotation not implemented - requires proxy service")

    def clear_cookies(self):
        """Clear cookies to start fresh."""
        for session in self.session_pool:
            session.cookies.clear()
        self.logger.info("Cleared all session cookies")

    def reset_sessions(self):
        """Reset all sessions in the pool."""
        self.session_pool.clear()
        self._initialize_session_pool()
        self.request_count = 0
        self.current_session_index = 0
        self.logger.info("Reset all sessions")


# Convenience function for easy usage
def create_akamai_bypass() -> AkamaiBypass:
    """Create and return an AkamaiBypass instance."""
    return AkamaiBypass()
