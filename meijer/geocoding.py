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
from typing import Dict, List, Optional, Tuple, Union
import requests

logger = logging.getLogger(__name__)


class GeocodingService:
    """
    Geocoding service using Google's Geocoding API.
    
    This service converts location strings (cities, ZIP codes, addresses) into
    coordinates for use in store proximity searches.
    """

    def __init__(self, api_key: Optional[str] = None):
        """
        Initialize the geocoding service.
        
        Parameters
        ----------
        api_key : str, optional
            Google Maps API key. If not provided, will try to get from
            GOOGLE_MAPS_API_KEY environment variable.
        """
        self.api_key = api_key or os.getenv("GOOGLE_MAPS_API_KEY")
        self.base_url = "https://maps.googleapis.com/maps/api/geocode/json"
        
        if not self.api_key:
            logger.warning(
                "No Google Maps API key provided. Geocoding functionality will be limited. "
                "Set GOOGLE_MAPS_API_KEY environment variable or pass api_key parameter."
            )

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
        if not self.api_key:
            logger.error("Cannot geocode without Google Maps API key")
            return None
            
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
        if not self.api_key:
            logger.error("Cannot reverse geocode without Google Maps API key")
            return None
            
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
        if not self.api_key:
            return False
            
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


# Fallback geocoding for common locations when API key is not available
class FallbackGeocodingService:
    """
    Fallback geocoding service using hardcoded coordinates for common locations.
    
    This service provides basic geocoding functionality when Google Maps API is not available.
    """

    def __init__(self):
        """Initialize the fallback geocoding service."""
        # Common ZIP codes and cities with coordinates
        self.location_coordinates = {
            # Michigan ZIP codes
            "49503": (42.9634, -85.6681),  # Grand Rapids
            "49504": (42.9634, -85.6681),
            "49505": (42.9634, -85.6681),
            "49506": (42.9634, -85.6681),
            "49507": (42.9634, -85.6681),
            "49508": (42.9634, -85.6681),
            "49509": (42.9634, -85.6681),
            "49512": (42.9634, -85.6681),
            "49519": (42.9634, -85.6681),
            "49525": (42.9634, -85.6681),
            "49546": (42.9634, -85.6681),
            "49548": (42.9634, -85.6681),
            
            # Lansing area
            "48823": (42.7325, -84.5555),
            "48824": (42.7325, -84.5555),
            "48825": (42.7325, -84.5555),
            "48864": (42.7325, -84.5555),
            "48906": (42.7325, -84.5555),
            "48910": (42.7325, -84.5555),
            "48911": (42.7325, -84.5555),
            "48912": (42.7325, -84.5555),
            "48915": (42.7325, -84.5555),
            "48917": (42.7325, -84.5555),
            "48933": (42.7325, -84.5555),
            
            # Detroit area
            "48127": (42.3314, -83.0458),
            "48128": (42.3314, -83.0458),
            "48135": (42.3314, -83.0458),
            "48150": (42.3314, -83.0458),
            "48152": (42.3314, -83.0458),
            "48154": (42.3314, -83.0458),
            "48167": (42.3314, -83.0458),
            "48170": (42.3314, -83.0458),
            "48173": (42.3314, -83.0458),
            "48174": (42.3314, -83.0458),
            "48180": (42.3314, -83.0458),
            "48183": (42.3314, -83.0458),
            "48185": (42.3314, -83.0458),
            "48186": (42.3314, -83.0458),
            "48187": (42.3314, -83.0458),
            "48188": (42.3314, -83.0458),
            "48192": (42.3314, -83.0458),
            "48195": (42.3314, -83.0458),
            "48197": (42.3314, -83.0458),
            "48198": (42.3314, -83.0458),
            "48201": (42.3314, -83.0458),
            "48202": (42.3314, -83.0458),
            "48203": (42.3314, -83.0458),
            "48204": (42.3314, -83.0458),
            "48205": (42.3314, -83.0458),
            "48206": (42.3314, -83.0458),
            "48207": (42.3314, -83.0458),
            "48208": (42.3314, -83.0458),
            "48209": (42.3314, -83.0458),
            "48210": (42.3314, -83.0458),
            "48211": (42.3314, -83.0458),
            "48212": (42.3314, -83.0458),
            "48213": (42.3314, -83.0458),
            "48214": (42.3314, -83.0458),
            "48215": (42.3314, -83.0458),
            "48216": (42.3314, -83.0458),
            "48217": (42.3314, -83.0458),
            "48218": (42.3314, -83.0458),
            "48219": (42.3314, -83.0458),
            "48220": (42.3314, -83.0458),
            "48221": (42.3314, -83.0458),
            "48222": (42.3314, -83.0458),
            "48223": (42.3314, -83.0458),
            "48224": (42.3314, -83.0458),
            "48225": (42.3314, -83.0458),
            "48226": (42.3314, -83.0458),
            "48227": (42.3314, -83.0458),
            "48228": (42.3314, -83.0458),
            "48229": (42.3314, -83.0458),
            "48230": (42.3314, -83.0458),
            "48231": (42.3314, -83.0458),
            "48232": (42.3314, -83.0458),
            
            # Common cities
            "Grand Rapids, MI": (42.9634, -85.6681),
            "Lansing, MI": (42.7325, -84.5555),
            "Detroit, MI": (42.3314, -83.0458),
            "Ann Arbor, MI": (42.2808, -83.7430),
            "Flint, MI": (43.0125, -83.6875),
            "Kalamazoo, MI": (42.2917, -85.5872),
            "Battle Creek, MI": (42.3211, -85.1797),
            "Jackson, MI": (42.2459, -84.4013),
            "Saginaw, MI": (43.4195, -83.9508),
            "Bay City, MI": (43.5945, -83.8889),
            "Midland, MI": (43.6156, -84.2472),
            "Mount Pleasant, MI": (43.5978, -84.7675),
            "Traverse City, MI": (44.7631, -85.6206),
            "Petoskey, MI": (45.3747, -84.9550),
            "Marquette, MI": (46.5437, -87.3954),
            "Escanaba, MI": (45.7453, -87.0646),
            "Iron Mountain, MI": (45.8225, -88.0654),
            "Houghton, MI": (47.1219, -88.5690),
            "Ironwood, MI": (46.4561, -90.1710),
            "Sault Ste. Marie, MI": (46.4953, -84.3453),
            
            # Indiana cities (including Kendallville)
            "Kendallville, IN": (41.4414, -85.2650),
            "Fort Wayne, IN": (41.0793, -85.1394),
            "Indianapolis, IN": (39.7684, -86.1581),
            "South Bend, IN": (41.6764, -86.2520),
            "Evansville, IN": (37.9716, -87.5711),
            "Gary, IN": (41.5934, -87.3464),
            "Hammond, IN": (41.5834, -87.5000),
            "Bloomington, IN": (39.1653, -86.5264),
            "Lafayette, IN": (40.4167, -86.8750),
            "Muncie, IN": (40.1934, -85.3864),
            "Terre Haute, IN": (39.4667, -87.4139),
            "Kokomo, IN": (40.4864, -86.1336),
            "Anderson, IN": (40.1053, -85.6802),
            "Elkhart, IN": (41.6817, -85.9767),
            "Michigan City, IN": (41.7075, -86.8950),
            "Valparaiso, IN": (41.4731, -87.0611),
            "Portage, IN": (41.5759, -87.1761),
            "Crown Point, IN": (41.4169, -87.3653),
            "Hobart, IN": (41.5323, -87.2550),
            "Merrillville, IN": (41.4828, -87.3328),
            "Schererville, IN": (41.4789, -87.4547),
            "Dyer, IN": (41.4942, -87.5217),
            "Highland, IN": (41.5536, -87.4519),
            "Munster, IN": (41.5645, -87.5125),
            "Griffith, IN": (41.5284, -87.4236),
            "St. John, IN": (41.4500, -87.4700),
            "Cedar Lake, IN": (41.3647, -87.4414),
            "Lowell, IN": (41.2914, -87.4206),
            "DeMotte, IN": (41.1953, -87.1986),
            "Rensselaer, IN": (40.9367, -87.1508),
            "Winamac, IN": (41.0503, -86.6031),
            "Rochester, IN": (41.0647, -86.2158),
            "Warsaw, IN": (41.2381, -85.8531),
            "Goshen, IN": (41.5825, -85.8344),
            "Elkhart, IN": (41.6817, -85.9767),
            "South Bend, IN": (41.6764, -86.2520),
            "Mishawaka, IN": (41.6619, -86.1586),
            "Granger, IN": (41.7481, -86.1258),
            "Granger, IN": (41.7481, -86.1258),
            "Osceola, IN": (41.6653, -86.0750),
            "Elkhart, IN": (41.6817, -85.9767),
            "Bristol, IN": (41.7214, -85.8175),
            "Middlebury, IN": (41.6753, -85.7069),
            "Millersburg, IN": (41.5256, -85.6975),
            "Nappanee, IN": (41.4428, -85.9997),
            "Wakarusa, IN": (41.5381, -86.0206),
            "New Paris, IN": (41.5014, -85.8275),
            "Bremen, IN": (41.4464, -86.1481),
            "Plymouth, IN": (41.3436, -86.3097),
            "Culver, IN": (41.2175, -86.4225),
            "Argos, IN": (41.2375, -86.2464),
            "Tippecanoe, IN": (41.2075, -86.1150),
            "Winamac, IN": (41.0503, -86.6031),
            "Rochester, IN": (41.0647, -86.2158),
            "Warsaw, IN": (41.2381, -85.8531),
            "Goshen, IN": (41.5825, -85.8344),
            "Elkhart, IN": (41.6817, -85.9767),
            "South Bend, IN": (41.6764, -86.2520),
            "Mishawaka, IN": (41.6619, -86.1586),
            "Granger, IN": (41.7481, -86.1258),
            "Osceola, IN": (41.6653, -86.0750),
            "Bristol, IN": (41.7214, -85.8175),
            "Middlebury, IN": (41.6753, -85.7069),
            "Millersburg, IN": (41.5256, -85.6975),
            "Nappanee, IN": (41.4428, -85.9997),
            "Wakarusa, IN": (41.5381, -86.0206),
            "New Paris, IN": (41.5014, -85.8275),
            "Bremen, IN": (41.4464, -86.1481),
            "Plymouth, IN": (41.3436, -86.3097),
            "Culver, IN": (41.2175, -86.4225),
            "Argos, IN": (41.2375, -86.2464),
            "Tippecanoe, IN": (41.2075, -86.1150),
        }

    def geocode(self, location: str, region: Optional[str] = None) -> Optional[Tuple[float, float]]:
        """
        Geocode a location string using hardcoded coordinates.
        
        Parameters
        ----------
        location : str
            Location string (city, ZIP code, address, etc.)
        region : str, optional
            Region bias (not used in fallback service)
            
        Returns
        -------
        Tuple[float, float], optional
            (latitude, longitude) if found, None otherwise
        """
        # Try exact match first
        if location in self.location_coordinates:
            coords = self.location_coordinates[location]
            logger.info(f"Fallback geocoding found '{location}': {coords}")
            return coords
            
        # Try ZIP code match
        if location.isdigit() and len(location) == 5:
            if location in self.location_coordinates:
                coords = self.location_coordinates[location]
                logger.info(f"Fallback geocoding found ZIP '{location}': {coords}")
                return coords
                
        # Try partial city matches
        for key, coords in self.location_coordinates.items():
            if "," in key and location.lower() in key.lower():
                logger.info(f"Fallback geocoding partial match '{location}' -> '{key}': {coords}")
                return coords
                
        logger.warning(f"Fallback geocoding could not find coordinates for '{location}'")
        return None

    def get_zip_code_coordinates(self, zip_code: str, region: str = "us") -> Optional[Tuple[float, float]]:
        """
        Get coordinates for a ZIP code using fallback data.
        
        Parameters
        ----------
        zip_code : str
            ZIP code string
        region : str, optional
            Region bias (not used in fallback service)
            
        Returns
        -------
        Tuple[float, float], optional
            (latitude, longitude) if found, None otherwise
        """
        return self.geocode(zip_code, region)

    def get_city_coordinates(self, city: str, state: Optional[str] = None, region: str = "us") -> Optional[Tuple[float, float]]:
        """
        Get coordinates for a city using fallback data.
        
        Parameters
        ----------
        city : str
            City name
        state : str, optional
            State name or abbreviation
        region : str, optional
            Region bias (not used in fallback service)
            
        Returns
        -------
        Tuple[float, float], optional
            (latitude, longitude) if found, None otherwise
        """
        if state:
            location = f"{city}, {state}"
        else:
            location = city
            
        return self.geocode(location, region)


def get_geocoding_service(api_key: Optional[str] = None) -> Union[GeocodingService, FallbackGeocodingService]:
    """
    Get the appropriate geocoding service.
    
    If a Google Maps API key is provided, returns the full GeocodingService.
    Otherwise, returns the FallbackGeocodingService.
    
    Parameters
    ----------
    api_key : str, optional
        Google Maps API key
        
    Returns
    -------
    Union[GeocodingService, FallbackGeocodingService]
        Appropriate geocoding service
    """
    if api_key or os.getenv("GOOGLE_MAPS_API_KEY"):
        return GeocodingService(api_key)
    else:
        logger.info("Using fallback geocoding service (no Google Maps API key available)")
        return FallbackGeocodingService()
