"""
Google Mobile Geocoding Service Client

This module mimics the Meijer app's geocoding approach using Google's mobile geocoding service
with authentication tokens extracted from mitmproxy logs.
"""

import json
import logging
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

            # Create the exact payload structure from the logs
            # From the logs: binary data with location + language + app identifier
            # The format appears to be: location + "en-US" + "com.meijer.mobile.meijer"

            # Create the binary payload exactly like the logs show
            # This is a simplified version - the actual app uses protobuf
            payload = f"{location}\x00en-US\x00com.meijer.mobile.meijer".encode("utf-8")

            # Define headers exactly like the logs
            headers = {
                "user-agent": self.auth_data.get(
                    "user_agent",
                    "com.google.android.gms/253133009 (Linux; U; Android 10; en_US; One; Build/QQ3A.200705.002; Cronet/140.0.7259.0) grpc-java-cronet/1.75.0-SNAPSHOT",
                ),
                "content-type": "application/grpc",
                "te": "trailers",
                "transfer-encoding": "chunked",
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
            logger.debug(f"Raw gRPC response length: {len(response_content)} bytes")
            logger.debug(f"Raw response (hex): {response_content[:100].hex()}")

            # Convert to string for easier parsing
            content_str = response_content.decode("utf-8", errors="ignore")
            logger.debug(f"Decoded response: {content_str[:200]}...")

            # Look for coordinate patterns (numbers with decimal points)
            import re

            # Pattern for coordinates: look for two decimal numbers that could be lat/lng
            coord_pattern = r"(-?\d+\.\d+)"
            coords = re.findall(coord_pattern, content_str)
            logger.debug(f"Found coordinate candidates: {coords}")

            if len(coords) >= 2:
                # The first two decimal numbers are likely latitude and longitude
                lat = float(coords[0])
                lng = float(coords[1])

                # Validate reasonable coordinate ranges
                if -90 <= lat <= 90 and -180 <= lng <= 180:
                    logger.info(f"Parsed coordinates from gRPC response: {lat}, {lng}")
                    return (lat, lng)
                else:
                    logger.warning(f"Coordinates out of valid range: {lat}, {lng}")
                    return None
            else:
                logger.warning("Could not find coordinate pattern in gRPC response")
                return None

        except Exception as e:
            logger.error(f"Error parsing gRPC response: {e}")
            return None


def get_geocoding_service(
    auth_data: Optional[Dict[str, Any]] = None,
) -> GoogleMobileGeocoder:
    """
    Get a Google Mobile Geocoding Service instance.

    Args:
        auth_data: Optional authentication data

    Returns:
        GoogleMobileGeocoder instance

    Raises:
        ValueError: If no authentication data is available
    """
    return GoogleMobileGeocoder(auth_data)
