#!/usr/bin/env python3
"""
Header Spoofing for Akamai Bypass

This module focuses specifically on header spoofing techniques to bypass
Akamai bot detection by mimicking legitimate browser behavior.
"""

import random
from dataclasses import dataclass
from typing import Dict, List, Optional

import requests


@dataclass
class BrowserFingerprint:
    """Complete browser fingerprint for header spoofing."""

    # Core headers
    user_agent: str
    accept: str
    accept_language: str
    accept_encoding: str

    # Security headers (Chrome/Firefox)
    sec_ch_ua: str
    sec_ch_ua_mobile: str
    sec_ch_ua_platform: str
    sec_fetch_dest: str
    sec_fetch_mode: str
    sec_fetch_site: str
    sec_fetch_user: str

    # Additional headers
    dnt: str
    upgrade_insecure_requests: str
    cache_control: str
    pragma: str

    # Connection headers
    connection: str
    keep_alive: str


class HeaderSpoofer:
    """Advanced header spoofing for Akamai bypass."""

    def __init__(self):
        self.browser_profiles = self._load_browser_profiles()
        self.current_profile = None
        self.request_count = 0

    def _load_browser_profiles(self) -> List[BrowserFingerprint]:
        """Load realistic browser fingerprint profiles."""
        return [
            # Chrome 120 on Windows
            BrowserFingerprint(
                user_agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36",
                accept="text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
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
                cache_control="max-age=0",
                pragma="",
                connection="keep-alive",
                keep_alive="timeout=5, max=1000",
            ),
            # Chrome 120 on macOS
            BrowserFingerprint(
                user_agent="Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36",
                accept="text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
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
                cache_control="max-age=0",
                pragma="",
                connection="keep-alive",
                keep_alive="timeout=5, max=1000",
            ),
            # Firefox 121 on Linux
            BrowserFingerprint(
                user_agent="Mozilla/5.0 (X11; Linux x86_64; rv:121.0) Gecko/20100101 Firefox/121.0",
                accept="text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
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
                cache_control="no-cache",
                pragma="no-cache",
                connection="keep-alive",
                keep_alive="timeout=5, max=1000",
            ),
            # Safari on iOS 17
            BrowserFingerprint(
                user_agent="Mozilla/5.0 (iPhone; CPU iPhone OS 17_1_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/17.1.2 Mobile/15E148 Safari/604.1",
                accept="text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
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
                cache_control="max-age=0",
                pragma="",
                connection="keep-alive",
                keep_alive="timeout=5, max=1000",
            ),
            # Edge 120 on Windows
            BrowserFingerprint(
                user_agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36 Edg/120.0.0.0",
                accept="text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
                accept_language="en-US,en;q=0.9",
                accept_encoding="gzip, deflate, br",
                sec_ch_ua='"Microsoft Edge";v="120", "Chromium";v="120", "Not_A Brand";v="99"',
                sec_ch_ua_mobile="?0",
                sec_ch_ua_platform='"Windows"',
                sec_fetch_dest="document",
                sec_fetch_mode="navigate",
                sec_fetch_site="none",
                sec_fetch_user="?1",
                dnt="1",
                upgrade_insecure_requests="1",
                cache_control="max-age=0",
                pragma="",
                connection="keep-alive",
                keep_alive="timeout=5, max=1000",
            ),
        ]

    def get_random_profile(self) -> BrowserFingerprint:
        """Get a random browser profile."""
        return random.choice(self.browser_profiles)

    def get_consistent_profile(self) -> BrowserFingerprint:
        """Get a consistent profile for the current session."""
        if self.current_profile is None:
            self.current_profile = random.choice(self.browser_profiles)
        return self.current_profile

    def apply_headers_to_session(
        self, session: requests.Session, profile: Optional[BrowserFingerprint] = None
    ):
        """Apply browser headers to a requests session."""
        if profile is None:
            profile = self.get_consistent_profile()

        # Core headers
        session.headers.update(
            {
                "User-Agent": profile.user_agent,
                "Accept": profile.accept,
                "Accept-Language": profile.accept_language,
                "Accept-Encoding": profile.accept_encoding,
                "DNT": profile.dnt,
                "Upgrade-Insecure-Requests": profile.upgrade_insecure_requests,
                "Cache-Control": profile.cache_control,
                "Connection": profile.connection,
            }
        )

        # Add Pragma header if present
        if profile.pragma:
            session.headers["Pragma"] = profile.pragma

        # Add Keep-Alive header if present
        if profile.keep_alive:
            session.headers["Keep-Alive"] = profile.keep_alive

        # Add Sec-* headers for Chrome-based browsers
        if "Chrome" in profile.user_agent or "Edge" in profile.user_agent:
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

        # Add Sec-* headers for Firefox
        elif "Firefox" in profile.user_agent:
            session.headers.update(
                {
                    "Sec-Fetch-Dest": profile.sec_fetch_dest,
                    "Sec-Fetch-Mode": profile.sec_fetch_mode,
                    "Sec-Fetch-Site": profile.sec_fetch_site,
                    "Sec-Fetch-User": profile.sec_fetch_user,
                }
            )

        # Add Sec-* headers for Safari
        elif "Safari" in profile.user_agent and "Chrome" not in profile.user_agent:
            session.headers.update(
                {
                    "Sec-Fetch-Dest": profile.sec_fetch_dest,
                    "Sec-Fetch-Mode": profile.sec_fetch_mode,
                    "Sec-Fetch-Site": profile.sec_fetch_site,
                    "Sec-Fetch-User": profile.sec_fetch_user,
                }
            )

    def add_dynamic_headers(
        self, session: requests.Session, url: str, referer: Optional[str] = None
    ):
        """Add dynamic headers that change based on context."""

        # Add Referer header if provided
        if referer:
            session.headers["Referer"] = referer

        # Add Origin header for POST requests (derived from referer or URL)
        if referer:
            parsed_referer = requests.utils.urlparse(referer)
            origin = f"{parsed_referer.scheme}://{parsed_referer.netloc}"
            session.headers["Origin"] = origin
        else:
            parsed_url = requests.utils.urlparse(url)
            origin = f"{parsed_url.scheme}://{parsed_url.netloc}"
            session.headers["Origin"] = origin

        # Add X-Requested-With for AJAX-like requests
        if any(path in url.lower() for path in ["/api/", "/ajax/", "/json/"]):
            session.headers["X-Requested-With"] = "XMLHttpRequest"

        # Add X-Forwarded-For with realistic IP (optional, for proxy scenarios)
        # session.headers["X-Forwarded-For"] = self._generate_realistic_ip()

        # Add random Accept header variations
        accept_variations = [
            "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
            "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
        ]
        session.headers["Accept"] = random.choice(accept_variations)

        # Add random Accept-Language variations
        lang_variations = [
            "en-US,en;q=0.9",
            "en-US,en;q=0.8,en;q=0.7",
            "en-US,en;q=0.9,en;q=0.8",
            "en-US,en;q=0.9,en;q=0.8,en;q=0.7",
        ]
        session.headers["Accept-Language"] = random.choice(lang_variations)

    def add_meijer_specific_headers(self, session: requests.Session):
        """Add Meijer-specific headers that might help bypass detection."""

        # Meijer app-specific headers
        session.headers.update(
            {
                "X-Meijer-App-Version": "5.0.0",
                "X-Meijer-Platform": "web",
                "X-Meijer-Client": "web-app",
            }
        )

        # Add subscription key if available
        # session.headers["Ocp-Apim-Subscription-Key"] = "your_subscription_key"

    def create_spoofed_session(
        self, profile: Optional[BrowserFingerprint] = None
    ) -> requests.Session:
        """Create a new session with spoofed headers."""
        session = requests.Session()

        # Apply browser profile
        self.apply_headers_to_session(session, profile)

        # Add dynamic headers
        self.add_dynamic_headers(session, "https://api.meijer.com")

        # Add Meijer-specific headers
        self.add_meijer_specific_headers(session)

        return session

    def rotate_profile(self):
        """Rotate to a new browser profile."""
        self.current_profile = random.choice(self.browser_profiles)
        self.request_count = 0

    def get_headers_for_request(
        self, url: str, method: str = "GET", referer: Optional[str] = None
    ) -> Dict[str, str]:
        """Get complete headers for a specific request."""
        profile = self.get_consistent_profile()

        headers = {
            "User-Agent": profile.user_agent,
            "Accept": profile.accept,
            "Accept-Language": profile.accept_language,
            "Accept-Encoding": profile.accept_encoding,
            "DNT": profile.dnt,
            "Upgrade-Insecure-Requests": profile.upgrade_insecure_requests,
            "Cache-Control": profile.cache_control,
            "Connection": profile.connection,
        }

        # Add Sec-* headers for Chrome-based browsers
        if "Chrome" in profile.user_agent or "Edge" in profile.user_agent:
            headers.update(
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

        # Add dynamic headers
        if referer:
            headers["Referer"] = referer

            parsed_referer = requests.utils.urlparse(referer)
            origin = f"{parsed_referer.scheme}://{parsed_referer.netloc}"
            headers["Origin"] = origin

        # Add method-specific headers
        if method.upper() == "POST":
            headers["Content-Type"] = "application/json"

        return headers

    def _generate_realistic_ip(self) -> str:
        """Generate a realistic IP address (for proxy scenarios)."""
        # Common residential IP ranges
        ip_ranges = [
            "192.168.1.",
            "10.0.0.",
            "172.16.0.",
            "192.168.0.",
        ]

        base = random.choice(ip_ranges)
        last_octet = random.randint(1, 254)
        return f"{base}{last_octet}"


# Convenience functions
def create_spoofed_session(profile_name: Optional[str] = None) -> requests.Session:
    """Create a session with spoofed headers."""
    spoofer = HeaderSpoofer()

    if profile_name:
        # Find specific profile by name
        for profile in spoofer.browser_profiles:
            if profile_name.lower() in profile.user_agent.lower():
                return spoofer.create_spoofed_session(profile)

    return spoofer.create_spoofed_session()


def get_spoofed_headers(
    url: str, method: str = "GET", referer: Optional[str] = None
) -> Dict[str, str]:
    """Get spoofed headers for a request."""
    spoofer = HeaderSpoofer()
    return spoofer.get_headers_for_request(url, method, referer)


def apply_spoofed_headers_to_session(
    session: requests.Session, profile_name: Optional[str] = None
):
    """Apply spoofed headers to an existing session."""
    spoofer = HeaderSpoofer()

    if profile_name:
        # Find specific profile by name
        for profile in spoofer.browser_profiles:
            if profile_name.lower() in profile.user_agent.lower():
                spoofer.apply_headers_to_session(session, profile)
                return

    spoofer.apply_headers_to_session(session)
