"""
Rate limiting, caching, and request deduplication manager.

This module provides centralized management of API rate limiting, response caching,
and request deduplication to prevent overwhelming the Meijer API.
"""

import hashlib
import logging
import time
from typing import Any, Dict, Optional


class RateLimitManager:
    """
    Manages rate limiting, caching, and request deduplication for API calls.

    This class provides:
    - Rate limiting to prevent overwhelming the API
    - Response caching for improved performance
    - Request deduplication to avoid duplicate in-flight requests
    """

    def __init__(self, min_request_interval: float = 0.5):
        """
        Initialize the rate limit manager.

        Args:
            min_request_interval: Minimum seconds between requests to same endpoint
        """
        self.logger = logging.getLogger(__name__)
        self._request_cache: Dict[str, tuple] = {}  # Simple in-memory cache
        self._last_request_time: Dict[
            str, float
        ] = {}  # Track last request time per endpoint
        self._min_request_interval = min_request_interval
        self._pending_requests: Dict[str, float] = {}  # Track in-flight requests

    def rate_limit(self, endpoint: str) -> None:
        """
        Implement rate limiting to avoid overwhelming the API.

        Args:
            endpoint: API endpoint being called
        """
        current_time = time.time()
        last_time = self._last_request_time.get(endpoint, 0)

        if current_time - last_time < self._min_request_interval:
            sleep_time = self._min_request_interval - (current_time - last_time)
            self.logger.debug(
                f"⏱️ Rate limiting: sleeping {sleep_time:.2f}s for {endpoint}"
            )
            time.sleep(sleep_time)

        self._last_request_time[endpoint] = time.time()

    def get_cache_key(
        self,
        method: str,
        url: str,
        params: Optional[Dict] = None,
        json_data: Optional[Dict] = None,
    ) -> str:
        """
        Generate a cache key for the request.

        Args:
            method: HTTP method
            url: Request URL
            params: Query parameters
            json_data: JSON payload

        Returns:
            Cache key string
        """
        # Create a unique key based on request parameters
        key_parts = [method, url]
        if params:
            key_parts.append(str(sorted(params.items())))
        if json_data:
            key_parts.append(str(sorted(json_data.items())))

        key_string = "|".join(key_parts)
        return hashlib.md5(key_string.encode(), usedforsecurity=False).hexdigest()

    def check_cache(self, cache_key: str, max_age: int = 300) -> Optional[Dict]:
        """
        Check if we have a cached response.

        Args:
            cache_key: Cache key for the request
            max_age: Maximum age of cached response in seconds (default: 5 minutes)

        Returns:
            Cached response data or None if not found/expired
        """
        if cache_key in self._request_cache:
            cached_data, timestamp = self._request_cache[cache_key]
            if time.time() - timestamp < max_age:
                self.logger.debug(f"💾 Using cached response for {cache_key}")
                return cached_data
            else:
                # Remove expired cache entry
                del self._request_cache[cache_key]

        return None

    def cache_response(self, cache_key: str, response_data: Dict) -> None:
        """
        Cache a response for future use.

        Args:
            cache_key: Cache key for the request
            response_data: Response data to cache
        """
        self._request_cache[cache_key] = (response_data, time.time())
        self.logger.debug(f"💾 Cached response for {cache_key}")

    def deduplicate_request(self, cache_key: str) -> bool:
        """
        Check if a request is already in flight to avoid duplicates.

        Args:
            cache_key: Cache key for the request

        Returns:
            True if request is already in flight, False otherwise
        """
        current_time = time.time()

        # Clean up old pending requests (older than 30 seconds)
        self._pending_requests = {
            k: v for k, v in self._pending_requests.items() if current_time - v < 30
        }

        if cache_key in self._pending_requests:
            self.logger.debug(f"🔄 Request already in flight: {cache_key}")
            return True

        # Mark this request as in flight
        self._pending_requests[cache_key] = current_time
        return False

    def mark_request_complete(self, cache_key: str) -> None:
        """
        Mark a request as complete (remove from pending).

        Args:
            cache_key: Cache key for the completed request
        """
        if cache_key in self._pending_requests:
            del self._pending_requests[cache_key]

    def clear_cache(self) -> None:
        """Clear all cached responses."""
        self._request_cache.clear()
        self.logger.info("🧹 Cache cleared")

    def configure_rate_limiting(self, min_interval: float = 0.5) -> None:
        """
        Configure rate limiting parameters.

        Args:
            min_interval: Minimum seconds between requests to same endpoint
        """
        self._min_request_interval = min_interval
        self.logger.info(
            f"⚙️ Rate limiting configured: {min_interval}s minimum interval"
        )

    def get_cache_stats(self) -> Dict[str, Any]:
        """
        Get statistics about the cache.

        Returns:
            Dictionary with cache statistics
        """
        current_time = time.time()

        # Count expired entries
        expired_count = 0
        for cache_key, (_, timestamp) in self._request_cache.items():
            if current_time - timestamp > 300:  # 5 minutes
                expired_count += 1

        return {
            "total_cached": len(self._request_cache),
            "expired_entries": expired_count,
            "pending_requests": len(self._pending_requests),
            "last_request_times": len(self._last_request_time),
        }
