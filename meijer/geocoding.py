"""
Google Mobile Geocoding Service Client

This module mimics the Meijer app's geocoding approach using Google's mobile geocoding service
with authentication tokens extracted from mitmproxy logs.
"""

import json
import logging
import os
from pathlib import Path
from typing import Any, Dict, Optional, Tuple

import requests

logger = logging.getLogger(__name__)


class GoogleMobileGeocoder:
    """
    Google Mobile Geocoding Service client that mimics the Meijer app.

    Uses the same endpoint and authentication method as the Meijer app:
    - Endpoint: geomobileservices-pa.googleapis.com
    - Authentication: x-goog-spatula header from logs
    - Request format: gRPC-style POST requests
    """

    def __init__(self, auth_data: Optional[Dict[str, Any]] = None):
        """
        Initialize the geocoder.

        Args:
            auth_data: Authentication data extracted from logs, or None to auto-detect
        """
        self.auth_data = auth_data or self._extract_auth_from_logs()
        self.base_url = "https://geomobileservices-pa.googleapis.com"
        self.geocode_endpoint = "/google.internal.maps.geomobileservices.geocoding.v3mobile.GeocodingService/Geocode"
        self.reverse_geocode_endpoint = "/google.internal.maps.geomobileservices.geocoding.v3mobile.GeocodingService/ReverseGeocode"

        if not self.auth_data:
            raise ValueError(
                "No authentication data available. Please provide auth.json or ensure logs are captured."
            )

    def _extract_auth_from_logs(self) -> Optional[Dict[str, Any]]:
        """
        Extract authentication data from mitmproxy logs.

        Returns:
            Dictionary containing authentication tokens and headers
        """
        # Look for auth.json first
        auth_file = Path("auth.json")
        if auth_file.exists():
            try:
                with open(auth_file, "r") as f:
                    auth_data = json.load(f)
                    if "google_geocoding" in auth_data:
                        logger.info("Loaded Google geocoding auth from auth.json")
                        return auth_data["google_geocoding"]
            except Exception as e:
                logger.warning(f"Failed to load auth.json: {e}")

        # Look for logs directory
        logs_dir = Path("logs")
        if logs_dir.exists():
            log_files = list(logs_dir.glob("meijer_mitm_*.log"))
            if log_files:
                # Use the most recent log file
                latest_log = max(log_files, key=lambda x: x.stat().st_mtime)
                logger.info(f"Extracting auth from log: {latest_log}")
                return self._extract_auth_from_log_file(latest_log)

        return None

    def extract_auth_from_log_file(
        self, log_file_path: str
    ) -> Optional[Dict[str, Any]]:
        """
        Extract authentication data from a specific log file.

        Args:
            log_file_path: Path to the log file

        Returns:
            Dictionary containing authentication data
        """
        return self._extract_auth_from_log_file(Path(log_file_path))

    def _extract_auth_from_log_file(self, log_file: Path) -> Optional[Dict[str, Any]]:
        """
        Extract Google geocoding authentication from a specific log file.

        Args:
            log_file: Path to the log file

        Returns:
            Dictionary containing authentication data
        """
        try:
            # Use proper mitmproxy Python API to read binary flow files
            try:
                from mitmproxy import io
            except ImportError:
                logger.error(
                    "mitmproxy not available. Install with: pip install mitmproxy"
                )
                return None

            logger.info(f"Reading mitmproxy flow file: {log_file}")

            with open(log_file, "rb") as f:
                reader = io.FlowReader(f)

                # Look for Google geocoding requests
                for flow in reader.stream():
                    if hasattr(flow, "request"):
                        url = flow.request.pretty_url

                        # Check if this is a Google geocoding request
                        if "geomobileservices-pa.googleapis.com" in url:
                            headers = dict(flow.request.headers)

                            # Look for x-goog-spatula header
                            if "x-goog-spatula" in headers:
                                spatula_token = headers["x-goog-spatula"]
                                user_agent = headers.get("user-agent")

                                logger.info(
                                    "Found Google geocoding spatula token in mitmproxy flows"
                                )

                                return {
                                    "spatula_token": spatula_token,
                                    "user_agent": user_agent,
                                    "source": "mitmproxy_flows",
                                }

            logger.warning(
                "No Google geocoding requests with x-goog-spatula found in mitmproxy flows"
            )
            return None

        except Exception as e:
            logger.error(f"Failed to extract auth from mitmproxy flow file: {e}")
            return None

    def geocode_city(
        self, city: str, state: Optional[str] = None
    ) -> Optional[Tuple[float, float]]:
        """
        Geocode a city name to coordinates using Google's mobile service.

        Args:
            city: City name
            state: State name (optional)

        Returns:
            Tuple of (latitude, longitude) if successful, None otherwise
        """
        try:
            # Construct the location string like the app does
            if state:
                location = f"{city}, {state}"
            else:
                location = f"{city}, United States"

            logger.info(f"Geocoding location: {location}")

            # Make the geocoding request
            coordinates = self._make_geocoding_request(location)

            if coordinates:
                logger.info(f"Successfully geocoded '{location}' to {coordinates}")
                return coordinates
            else:
                logger.warning(f"Failed to geocode location: {location}")
                return None

        except Exception as e:
            logger.error(f"Error geocoding city '{city}': {e}")
            return None

    def geocode_zip_code(self, zip_code: str) -> Optional[Tuple[float, float]]:
        """
        Geocode a ZIP code to coordinates using Google's mobile service.

        Args:
            zip_code: ZIP code string

        Returns:
            Tuple of (latitude, longitude) if successful, None otherwise
        """
        try:
            # For ZIP codes, we'll use the ZIP code directly
            location = f"{zip_code}, United States"

            logger.info(f"Geocoding ZIP code: {zip_code}")

            # Make the geocoding request
            coordinates = self._make_geocoding_request(location)

            if coordinates:
                logger.info(f"Successfully geocoded ZIP {zip_code} to {coordinates}")
                return coordinates
            else:
                logger.warning(f"Failed to geocode ZIP code: {zip_code}")
                return None

        except Exception as e:
            logger.error(f"Error geocoding ZIP code '{zip_code}': {e}")
            return None

    def _make_geocoding_request(self, location: str) -> Optional[Tuple[float, float]]:
        """
        Make the actual geocoding request to Google's mobile service.

        Args:
            location: Location string to geocode

        Returns:
            Tuple of (latitude, longitude) if successful, None otherwise
        """
        try:
            # The logs show both Geocode and ReverseGeocode endpoints
            # Let's try the Geocode endpoint first since we need forward geocoding
            endpoint = self.geocode_endpoint

            # Create the exact payload structure from the working request analysis
            # From the working request: 67 bytes with specific binary format
            # The working payload structure is:
            # [4 bytes length][total content length][constant 0x0a][location length][location][binary structure][app identifier]

            # Convert location to bytes
            location_bytes = location.encode("utf-8")
            location_length = len(location_bytes)

            # Calculate total content length (everything after the 4-byte prefix)
            binary_structure = (
                b'\x1a\x00"\x00*\x05en-US8\x01B\x18com.meijer.mobile.meijer'
            )
            total_content_length = (
                1 + 1 + location_length + len(binary_structure)
            )  # 0x0a + location_length + location + binary_structure

            # Create the exact binary payload structure from working request
            # This matches the successful request format exactly
            payload_parts = [
                b"\x00\x00\x00\x00",  # 4-byte length prefix
                bytes(
                    [total_content_length, 0x0A]
                ),  # total content length + constant 0x0a
                bytes([location_length]),  # location length
                location_bytes,  # location string
                binary_structure,  # binary structure + app ID
            ]

            payload = b"".join(payload_parts)

            # For debugging: log the exact payload format
            logger.debug(f"Payload structure: {len(payload_parts)} parts")
            logger.debug(
                f"Part 1 (length): {payload_parts[0].hex()} ({len(payload_parts[0])} bytes)"
            )
            logger.debug(
                f"Part 2 (content length + constant): {payload_parts[1].hex()} ({len(payload_parts[1])} bytes)"
            )
            logger.debug(
                f"Part 3 (location length): {payload_parts[2].hex()} ({len(payload_parts[2])} bytes)"
            )
            logger.debug(
                f"Part 4 (location): {payload_parts[3].hex()} ({len(payload_parts[3])} bytes)"
            )
            logger.debug(
                f"Part 5 (binary): {payload_parts[4].hex()} ({len(payload_parts[4])} bytes)"
            )
            logger.debug(f"Total payload: {len(payload)} bytes")
            logger.debug(f"Calculated content length: {total_content_length}")

            # Define headers exactly like the logs
            headers = {
                "user-agent": self.auth_data.get(
                    "user_agent",
                    "com.google.android.gms/253133009 (Linux; U; Android 10; en_US; One; Build/QQ3A.200705.002; Cronet/140.0.7259.0) grpc-java-cronet/1.75.0-SNAPSHOT",
                ),
                "content-type": "application/grpc",
                "te": "trailers",
                "x-goog-spatula": self.auth_data["spatula_token"],
                "grpc-accept-encoding": "gzip",
                "grpc-timeout": "9976501u",
            }

            # Make the request
            logger.info(f"Making geocoding request to: {self.base_url}{endpoint}")
            logger.info(f"Request payload length: {len(payload)} bytes")
            logger.info(f"Request headers: {headers}")

            response = requests.post(
                f"{self.base_url}{endpoint}",
                headers=headers,
                data=payload,
                timeout=30,
            )

            logger.debug(f"Response status: {response.status_code}")
            logger.debug(f"Response headers: {dict(response.headers)}")
            logger.debug(f"Response content length: {len(response.content)}")

            if response.status_code == 200:
                if len(response.content) == 0:
                    logger.warning(
                        "Received empty response - request may have been rejected"
                    )
                    return None

                # Log the response for debugging
                logger.info(
                    f"✅ Got successful response! Content length: {len(response.content)} bytes"
                )
                logger.debug(f"Response (hex): {response.content[:100].hex()}...")

                # Parse gRPC response
                return self._parse_grpc_response(response.content)
            else:
                logger.warning(
                    f"Geocoding request failed with status {response.status_code}"
                )
                logger.debug(f"Error response: {response.text}")
                return None

        except Exception as e:
            logger.error(f"Error making geocoding request: {e}")
            return None

    def _parse_grpc_response(
        self, response_content: bytes
    ) -> Optional[Tuple[float, float]]:
        """
        Parse the gRPC response to extract coordinates.

        Args:
            response_content: Raw response content

        Returns:
            Tuple of (latitude, longitude) if found, None otherwise
        """
        try:
            # The gRPC response contains binary data with coordinates
            # Look for coordinate patterns in the response

            # Log the raw response for debugging
            logger.info(f"Raw gRPC response length: {len(response_content)} bytes")
            logger.info(f"Raw response (hex): {response_content[:100].hex()}...")

            # Convert to string for easier parsing
            content_str = response_content.decode("utf-8", errors="ignore")
            logger.info(f"Decoded response: {content_str[:200]}...")

            # Look for coordinate patterns (numbers with decimal points)
            import re

            # Pattern for coordinates: look for two decimal numbers that could be lat/lng
            coord_pattern = r"(-?\d+\.\d+)"
            coords = re.findall(coord_pattern, content_str)
            logger.info(f"Found coordinate candidates: {coords}")

            if len(coords) >= 2:
                # The first two decimal numbers are likely latitude and longitude
                lat = float(coords[0])
                lng = float(coords[1])

                # Validate reasonable coordinate ranges
                if -90 <= lat <= 90 and -180 <= lng <= 180:
                    logger.info(
                        f"✅ Parsed coordinates from gRPC response: {lat}, {lng}"
                    )
                    return (lat, lng)
                else:
                    logger.warning(f"Coordinates out of valid range: {lat}, {lng}")
                    return None

            # If no decimal coordinates found, try to extract from binary data
            logger.info("No decimal coordinates found, trying binary extraction...")

            # Look for binary coordinate patterns in the raw response
            # The coordinates might be encoded as binary floats or integers
            try:
                # Search for potential coordinate patterns in binary data
                # Look for sequences that could represent coordinates

                # Try to find coordinates in the binary response
                # This is a more sophisticated approach for binary gRPC responses

                # For now, let's use a fallback: extract coordinates from the working request response
                # Since we know the working request returned coordinates, let's analyze that pattern

                logger.info("Attempting binary coordinate extraction...")

                # Look for patterns that could be coordinates in the binary data
                # This is complex and would require understanding the exact gRPC response format

                # For now, raise an exception to trigger the fallback system
                logger.warning("Binary coordinate extraction not implemented yet")
                raise ValueError(
                    "Google Mobile Geocoding Service returned response but coordinates could not be parsed"
                )

            except Exception as e:
                logger.error(f"Error in binary coordinate extraction: {e}")
                return None

        except Exception as e:
            logger.error(f"Error parsing gRPC response: {e}")
            return None


class GoogleMapsGeocoder:
    """
    Google Maps Geocoding API client using the API key from the Meijer app.

    This provides a reliable fallback when the Google Mobile Geocoding Service
    is not available or tokens are expired.
    """

    def __init__(self, api_key: Optional[str] = None):
        """
        Initialize the Google Maps geocoder.

        Args:
            api_key: Google Maps API key, or None to use the one from the app
        """
        self.api_key = api_key or self._get_app_api_key()
        self.base_url = "https://maps.googleapis.com/maps/api/geocode/json"

        if not self.api_key:
            raise ValueError("No Google Maps API key available")

    def _get_app_api_key(self) -> Optional[str]:
        """Get the Google Maps API key from the Meijer app source code or environment."""
        # Check environment variable first
        env_key = os.environ.get("GOOGLE_MAPS_API_KEY")
        if env_key:
            logger.info("Using Google Maps API key from environment variable")
            return env_key

        # Fall back to the API key we found in the decompiled app
        app_key = "AIzaSyDIFw-acsBB0yx-YPIkHFxVZEG6lFzxvCg"
        logger.info("Using Google Maps API key from Meijer app source code")
        return app_key

    def geocode_zip_code(self, zip_code: str) -> Optional[Tuple[float, float]]:
        """
        Geocode a ZIP code to coordinates using Google Maps API.

        Args:
            zip_code: ZIP code string

        Returns:
            Tuple of (latitude, longitude) if successful, None otherwise
        """
        try:
            location = f"{zip_code}, United States"
            logger.info(f"Geocoding ZIP code via Google Maps API: {zip_code}")

            params = {
                "address": location,
                "key": self.api_key,
                "components": f"postal_code:{zip_code}|country:US",
            }

            response = requests.get(self.base_url, params=params, timeout=30)

            if response.status_code == 200:
                data = response.json()
                logger.debug(f"Google Maps API response: {data}")

                if data.get("status") == "OK" and data.get("results"):
                    result = data["results"][0]
                    location_data = result["geometry"]["location"]
                    lat = location_data["lat"]
                    lng = location_data["lng"]

                    logger.info(f"Successfully geocoded ZIP {zip_code} to {lat}, {lng}")
                    return (lat, lng)
                else:
                    status = data.get("status")
                    error_message = data.get("error_message", "Unknown error")
                    logger.warning(
                        f"Google Maps API returned status: {status} - {error_message}"
                    )

                    # Log additional error details if available
                    if status == "REQUEST_DENIED":
                        logger.error(
                            "API key may be invalid, restricted, or quota exceeded"
                        )
                        logger.error(
                            "Try setting GOOGLE_MAPS_API_KEY environment variable with a valid key"
                        )
                    elif status == "OVER_QUERY_LIMIT":
                        logger.error("API quota exceeded - try again later")
                    elif status == "ZERO_RESULTS":
                        logger.warning(f"No results found for ZIP code: {zip_code}")

                    return None
            else:
                logger.warning(
                    f"Google Maps API request failed with status {response.status_code}"
                )
                logger.debug(f"Error response: {response.text}")
                return None

        except Exception as e:
            logger.error(
                f"Error geocoding ZIP code '{zip_code}' via Google Maps API: {e}"
            )
            return None

    def geocode_city(
        self, city: str, state: Optional[str] = None
    ) -> Optional[Tuple[float, float]]:
        """
        Geocode a city name to coordinates using Google Maps API.

        Args:
            city: City name
            state: State name (optional)

        Returns:
            Tuple of (latitude, longitude) if successful, None otherwise
        """
        try:
            if state:
                location = f"{city}, {state}, United States"
            else:
                location = f"{city}, United States"

            logger.info(f"Geocoding city via Google Maps API: {location}")

            params = {"address": location, "key": self.api_key}

            response = requests.get(self.base_url, params=params, timeout=30)

            if response.status_code == 200:
                data = response.json()
                logger.debug(f"Google Maps API response: {data}")

                if data.get("status") == "OK" and data.get("results"):
                    result = data["results"][0]
                    location_data = result["geometry"]["location"]
                    lat = location_data["lat"]
                    lng = location_data["lng"]

                    logger.info(f"Successfully geocoded '{location}' to {lat}, {lng}")
                    return (lat, lng)
                else:
                    status = data.get("status")
                    error_message = data.get("error_message", "Unknown error")
                    logger.warning(
                        f"Google Maps API returned status: {status} - {error_message}"
                    )

                    # Log additional error details if available
                    if status == "REQUEST_DENIED":
                        logger.error(
                            "API key may be invalid, restricted, or quota exceeded"
                        )
                        logger.error(
                            "Try setting GOOGLE_MAPS_API_KEY environment variable with a valid key"
                        )
                    elif status == "OVER_QUERY_LIMIT":
                        logger.error("API quota exceeded - try again later")
                    elif status == "ZERO_RESULTS":
                        logger.warning(f"No results found for location: {location}")

                    return None
            else:
                logger.warning(
                    f"Google Maps API request failed with status {response.status_code}"
                )
                logger.debug(f"Error response: {response.text}")
                return None

        except Exception as e:
            logger.error(f"Error geocoding city '{city}' via Google Maps API: {e}")
            return None


def get_geocoding_service(
    auth_data: Optional[Dict[str, Any]] = None,
) -> "GoogleMobileGeocoder | GoogleMapsGeocoder":
    """
    Get a geocoding service instance.

    Tries to use Google Mobile Geocoding Service first, falls back to Google Maps API.

    Args:
        auth_data: Optional authentication data for mobile service

    Returns:
        GoogleMobileGeocoder or GoogleMapsGeocoder instance
    """
    try:
        # Try to use the mobile geocoding service first
        return GoogleMobileGeocoder(auth_data)
    except ValueError:
        # Fall back to Google Maps API
        logger.info("Falling back to Google Maps API geocoding service")
        return GoogleMapsGeocoder()


class FallbackGeocoder:
    """
    A geocoder that tries multiple services with automatic fallback.
    """

    def __init__(self, auth_data: Optional[Dict[str, Any]] = None):
        self.mobile_geocoder = None
        self.maps_geocoder = None

        # Try to initialize mobile geocoder
        try:
            self.mobile_geocoder = GoogleMobileGeocoder(auth_data)
            logger.info("✅ Google Mobile Geocoding Service initialized")
        except ValueError:
            logger.info("⚠️  Google Mobile Geocoding Service not available")

        # Initialize Maps geocoder as fallback
        try:
            self.maps_geocoder = GoogleMapsGeocoder()
            logger.info("✅ Google Maps API geocoder initialized")
        except ValueError:
            logger.warning("⚠️  Google Maps API geocoder not available")

    def geocode_zip_code(self, zip_code: str) -> Optional[Tuple[float, float]]:
        """
        Geocode a ZIP code with automatic fallback.
        """
        # Try mobile geocoder first
        if self.mobile_geocoder:
            try:
                logger.info(
                    f"🔍 Trying Google Mobile Geocoding Service for ZIP {zip_code}"
                )
                coords = self.mobile_geocoder.geocode_zip_code(zip_code)
                if coords:
                    logger.info(f"✅ Mobile geocoding successful: {coords}")
                    return coords
                else:
                    logger.warning("⚠️  Mobile geocoding returned no coordinates")
            except Exception as e:
                logger.warning(f"⚠️  Mobile geocoding failed: {e}")

        # Fall back to Maps API
        if self.maps_geocoder:
            try:
                logger.info(f"🔄 Falling back to Google Maps API for ZIP {zip_code}")
                coords = self.maps_geocoder.geocode_zip_code(zip_code)
                if coords:
                    logger.info(f"✅ Maps API geocoding successful: {coords}")
                    return coords
                else:
                    logger.warning("⚠️  Maps API geocoding returned no coordinates")
            except Exception as e:
                logger.error(f"❌ Maps API geocoding failed: {e}")

        logger.error("❌ All geocoding services failed")
        return None

    def geocode_city(
        self, city: str, state: Optional[str] = None
    ) -> Optional[Tuple[float, float]]:
        """
        Geocode a city with automatic fallback.
        """
        # Try mobile geocoder first
        if self.mobile_geocoder:
            try:
                logger.info(
                    f"🔍 Trying Google Mobile Geocoding Service for city {city}"
                )
                coords = self.mobile_geocoder.geocode_city(city, state)
                if coords:
                    logger.info(f"✅ Mobile geocoding successful: {coords}")
                    return coords
                else:
                    logger.warning("⚠️  Mobile geocoding returned no coordinates")
            except Exception as e:
                logger.warning(f"⚠️  Mobile geocoding failed: {e}")

        # Fall back to Maps API
        if self.maps_geocoder:
            try:
                logger.info(f"🔄 Falling back to Google Maps API for city {city}")
                coords = self.maps_geocoder.geocode_city(city, state)
                if coords:
                    logger.info(f"✅ Maps API geocoding successful: {coords}")
                    return coords
                else:
                    logger.warning("⚠️  Maps API geocoding returned no coordinates")
            except Exception as e:
                logger.error(f"❌ Maps API geocoding failed: {e}")

        logger.error("❌ All geocoding services failed")
        return None
