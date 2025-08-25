"""
Google Mobile Geocoding Service Client

This module mimics the Meijer app's geocoding approach using Google's mobile geocoding service
with authentication tokens extracted from mitmproxy logs.
"""

import json
import logging
import re
from pathlib import Path
from typing import Optional, Tuple, Dict, Any
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
        
        if not self.auth_data:
            raise ValueError("No authentication data available. Please provide auth.json or ensure logs are captured.")
    
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
                with open(auth_file, 'r') as f:
                    auth_data = json.load(f)
                    if 'google_geocoding' in auth_data:
                        logger.info("Loaded Google geocoding auth from auth.json")
                        return auth_data['google_geocoding']
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
    
    def _extract_auth_from_log_file(self, log_file: Path) -> Optional[Dict[str, Any]]:
        """
        Extract Google geocoding authentication from a specific log file.
        
        Args:
            log_file: Path to the log file
            
        Returns:
            Dictionary containing authentication data
        """
        try:
            with open(log_file, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
                
            # Look for Google geocoding requests
            geocoding_pattern = r'https://geomobileservices-pa\.googleapis\.com.*?x-goog-spatula:\s*([^\n\r]+)'
            matches = re.findall(geocoding_pattern, content, re.DOTALL)
            
            if matches:
                spatula_token = matches[0].strip()
                logger.info("Found Google geocoding spatula token in logs")
                
                # Extract other headers if available
                user_agent_match = re.search(r'user-agent:\s*([^\n\r]+)', content)
                user_agent = user_agent_match.group(1).strip() if user_agent_match else None
                
                return {
                    'spatula_token': spatula_token,
                    'user_agent': user_agent,
                    'source': 'mitmproxy_logs'
                }
            
            logger.warning("No Google geocoding requests found in log file")
            return None
            
        except Exception as e:
            logger.error(f"Failed to extract auth from log file: {e}")
            return None
    
    def geocode_city(self, city: str, state: Optional[str] = None) -> Optional[Tuple[float, float]]:
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
            url = f"{self.base_url}{self.geocode_endpoint}"
            
            # Construct headers like the Meijer app
            headers = {
                'user-agent': self.auth_data.get('user_agent', 'com.meijer.mobile.meijer'),
                'content-type': 'application/grpc',
                'x-goog-spatula': self.auth_data['spatula_token'],
                'grpc-accept-encoding': 'gzip',
                'grpc-timeout': '9976501u'
            }
            
            # For now, we'll use a simplified approach since the full gRPC implementation
            # would be complex. We'll make a POST request with the location data
            # This is a simplified version - the actual app uses gRPC
            
            # Create a simplified request payload
            payload = {
                'location': location,
                'language': 'en-US',
                'app_identifier': 'com.meijer.mobile.meijer'
            }
            
            response = requests.post(
                url,
                headers=headers,
                json=payload,
                timeout=10
            )
            
            if response.status_code == 200:
                # Parse the response to extract coordinates
                # The actual response format depends on Google's gRPC service
                try:
                    data = response.json()
                    # Extract coordinates from response (this will need to be adjusted based on actual response format)
                    if 'results' in data and data['results']:
                        location_data = data['results'][0].get('geometry', {}).get('location', {})
                        lat = location_data.get('lat')
                        lng = location_data.get('lng')
                        if lat and lng:
                            return (float(lat), float(lng))
                except Exception as e:
                    logger.warning(f"Failed to parse geocoding response: {e}")
                    logger.debug(f"Response content: {response.text}")
            
            logger.warning(f"Geocoding request failed: {response.status_code}")
            logger.debug(f"Response: {response.text}")
            return None
            
        except Exception as e:
            logger.error(f"Error making geocoding request: {e}")
            return None

def get_geocoding_service(auth_data: Optional[Dict[str, Any]] = None) -> GoogleMobileGeocoder:
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
