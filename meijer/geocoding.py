#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Enhanced geocoding service for Meijer store search functionality
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python PEP 8 with numpy docstring style
 * - Dependencies: requests, typing, logging, os
 */

Enhanced geocoding service for Meijer store search functionality.

This module provides geocoding capabilities using Google's Geocoding API to convert
city names, ZIP codes, and addresses into coordinates for store proximity searches.
"""

import logging
import os
from typing import Dict, List, Optional, Tuple
import requests

logger = logging.getLogger(__name__)


class GeocodingService:
    """
    Geocoding service using Google's Geocoding API.
    
    This service converts location strings (cities, ZIP codes, addresses) into
    coordinates for use in store proximity searches.
    """

    def __init__(self, api_key: str):
        """
        Initialize the geocoding service.
        
        Parameters
        ----------
        api_key : str
            Google Maps API key (required)
        """
        if not api_key:
            raise ValueError("Google Maps API key is required for geocoding functionality")
            
        self.api_key = api_key
        self.base_url = "https://maps.googleapis.com/maps/api/geocode/json"
        logger.info("Geocoding service initialized with Google Maps API")

    def geocode(self, location: str, region: Optional[str] = None) -> Optional[Tuple[float, float]]:
        """
        Geocode a location string to coordinates.
        
        Parameters
        ----------
        location : str
            Location string (city, ZIP code, address, etc.)
        region : str, optional
            Region bias (e.g., "us" for United States, "in" for Indiana)
            
        Returns
        -------
        Tuple[float, float], optional
            (latitude, longitude) if successful, None otherwise
            
        Examples
        --------
        >>> geocoder = GeocodingService("your_api_key")
        >>> coords = geocoder.geocode("Kendallville, IN")
        >>> print(coords)  # (41.441438399999996, -85.2649754)
        """
        try:
            params = {
                "address": location,
                "key": self.api_key,
                "sensor": "false"
            }
            
            if region:
                params["region"] = region
                
            logger.info(f"Geocoding location: {location}")
            response = requests.get(self.base_url, params=params, timeout=10)
            
            if response.status_code == 200:
                data = response.json()
                
                if data.get("status") == "OK" and data.get("results"):
                    result = data["results"][0]
                    geometry = result.get("geometry", {})
                    location_data = geometry.get("location", {})
                    
                    lat = location_data.get("lat")
                    lng = location_data.get("lng")
                    
                    if lat is not None and lng is not None:
                        logger.info(f"Successfully geocoded '{location}' to ({lat}, {lng})")
                        return (float(lat), float(lng))
                    else:
                        logger.warning(f"Invalid coordinates in geocoding response for '{location}'")
                        return None
                else:
                    logger.warning(f"Geocoding failed for '{location}': {data.get('status')}")
                    if data.get("error_message"):
                        logger.warning(f"Error message: {data['error_message']}")
                    return None
            else:
                logger.error(f"Geocoding API request failed: {response.status_code}")
                return None
                
        except requests.RequestException as e:
            logger.error(f"Request error during geocoding of '{location}': {e}")
            return None
        except Exception as e:
            logger.error(f"Unexpected error during geocoding of '{location}': {e}")
            return None

    def reverse_geocode(self, lat: float, lng: float) -> Optional[Dict[str, str]]:
        """
        Reverse geocode coordinates to address components.
        
        Parameters
        ----------
        lat : float
            Latitude
        lng : float
            Longitude
            
        Returns
        -------
        Dict[str, str], optional
            Address components if successful, None otherwise
        """
        try:
            params = {
                "latlng": f"{lat},{lng}",
                "key": self.api_key,
                "sensor": "false"
            }
            
            logger.info(f"Reverse geocoding coordinates: ({lat}, {lng})")
            response = requests.get(self.base_url, params=params, timeout=10)
            
            if response.status_code == 200:
                data = response.json()
                
                if data.get("status") == "OK" and data.get("results"):
                    result = data["results"][0]
                    address_components = result.get("address_components", [])
                    
                    # Extract useful address components
                    components = {}
                    for component in address_components:
                        types = component.get("types", [])
                        long_name = component.get("long_name", "")
                        short_name = component.get("short_name", "")
                        
                        if "locality" in types:
                            components["city"] = long_name
                        elif "administrative_area_level_1" in types:
                            components["state"] = short_name
                        elif "postal_code" in types:
                            components["zip_code"] = long_name
                        elif "country" in types:
                            components["country"] = long_name
                            
                    logger.info(f"Reverse geocoded ({lat}, {lng}) to: {components}")
                    return components
                else:
                    logger.warning(f"Reverse geocoding failed: {data.get('status')}")
                    return None
            else:
                logger.error(f"Reverse geocoding API request failed: {response.status_code}")
                return None
                
        except requests.RequestException as e:
            logger.error(f"Request error during reverse geocoding: {e}")
            return None
        except Exception as e:
            logger.error(f"Unexpected error during reverse geocoding: {e}")
            return None

    def get_zip_code_coordinates(self, zip_code: str, region: str = "us") -> Optional[Tuple[float, float]]:
        """
        Get coordinates for a ZIP code.
        
        Parameters
        ----------
        zip_code : str
            ZIP code string
        region : str, optional
            Region bias (default: "us" for United States)
            
        Returns
        -------
        Tuple[float, float], optional
            (latitude, longitude) if successful, None otherwise
        """
        return self.geocode(zip_code, region=region)

    def get_city_coordinates(self, city: str, state: Optional[str] = None, region: str = "us") -> Optional[Tuple[float, float]]:
        """
        Get coordinates for a city.
        
        Parameters
        ----------
        city : str
            City name
        state : str, optional
            State name or abbreviation
        region : str, optional
            Region bias (default: "us" for United States)
            
        Returns
        -------
        Tuple[float, float], optional
            (latitude, longitude) if successful, None otherwise
            
        Examples
        --------
        >>> geocoder = GeocodingService("your_api_key")
        >>> coords = geocoder.get_city_coordinates("Kendallville", "IN")
        >>> print(coords)  # (41.441438399999996, -85.2649754)
        """
        if state:
            location = f"{city}, {state}"
        else:
            location = city
            
        return self.geocode(location, region=region)

    def validate_api_key(self) -> bool:
        """
        Validate the Google Maps API key.
        
        Returns
        -------
        bool
            True if API key is valid, False otherwise
        """
        try:
            # Try a simple geocoding request to validate the key
            params = {
                "address": "New York, NY",
                "key": self.api_key,
                "sensor": "false"
            }
            
            response = requests.get(self.base_url, params=params, timeout=10)
            
            if response.status_code == 200:
                data = response.json()
                if data.get("status") == "OK":
                    logger.info("Google Maps API key is valid")
                    return True
                elif data.get("status") == "REQUEST_DENIED":
                    logger.error("Google Maps API key is invalid or has insufficient permissions")
                    return False
                else:
                    logger.warning(f"API key validation returned status: {data.get('status')}")
                    return False
            else:
                logger.error(f"API key validation request failed: {response.status_code}")
                return False
                
        except Exception as e:
            logger.error(f"Error validating API key: {e}")
            return False


def get_geocoding_service(api_key: Optional[str] = None) -> GeocodingService:
    """
    Get a geocoding service instance.
    
    Parameters
    ----------
    api_key : str, optional
        Google Maps API key. If not provided, will try to get from
        GOOGLE_MAPS_API_KEY environment variable.
        
    Returns
    -------
    GeocodingService
        Geocoding service instance
        
    Raises
    ------
    ValueError
        If no API key is provided and GOOGLE_MAPS_API_KEY environment variable is not set
    """
    api_key = api_key or os.getenv("GOOGLE_MAPS_API_KEY")
    
    if not api_key:
        raise ValueError(
            "Google Maps API key is required for geocoding functionality. "
            "Set GOOGLE_MAPS_API_KEY environment variable or pass api_key parameter."
        )
    
    return GeocodingService(api_key)
