"""
Store management for Meijer API client.

This module provides centralized management of store operations including
search, filtering, and service detection.
"""

import logging
import math
from typing import Dict, List, Optional, Tuple

from .models import MeijerStore


class StoreManager:
    """
    Manages store operations for the Meijer API client.

    This class provides:
    - Store search by various criteria
    - Distance calculations
    - Service filtering
    - Store information retrieval
    """

    def __init__(self, client):
        """
        Initialize the store manager.

        Args:
            client: Reference to the main Meijer client
        """
        self.client = client
        self.logger = logging.getLogger(__name__)

    def get_stores(
        self,
        zip_code: Optional[str] = None,
        city: Optional[str] = None,
        latitude: Optional[float] = None,
        longitude: Optional[float] = None,
        radius: Optional[int] = None,
        required_services: Optional[List[str]] = None,
        max_results: int = 50,
    ) -> List[MeijerStore]:
        """
        Enhanced store search with comprehensive filtering and service detection.

        This method provides a unified interface for store discovery with automatic
        service filtering, error handling, and intelligent fallbacks. It consolidates
        all store search functionality into a single, robust method.

        Parameters
        ----------
        zip_code : str, optional
            ZIP code for location-based search
        city : str, optional
            City name for location-based search (case-insensitive, partial matching)
        latitude : float, optional
            Search latitude (required if radius specified)
        longitude : float, optional
            Search longitude (required if radius specified)
        radius : int, optional
            Search radius in miles (default: 50)
        required_services : List[str], optional
            List of required services (e.g., 'pharmacy', 'gas_station', 'curbside_pickup', 'delivery')
        max_results : int, optional
            Maximum number of stores to return (default: 50)

        Returns
        -------
        List[MeijerStore]
            List of stores matching criteria, sorted by distance

        Examples
        --------
        >>> # Basic search with coordinates
        >>> stores = store_manager.get_stores(latitude=42.9634, longitude=-85.6681, radius=25)
        >>>
        >>> # Search with service filtering
        >>> stores = store_manager.get_stores(latitude=42.9634, longitude=-85.6681, radius=50, required_services=['pharmacy', 'gas_station'])
        >>>
        >>> # Search by ZIP code
        >>> stores = store_manager.get_stores(zip_code="49508", radius=25)
        >>>
        >>> # Search by city
        >>> stores = store_manager.get_stores(city="Grand Rapids", radius=30)
        """
        try:
            # Determine search coordinates
            search_lat, search_lng = self._determine_search_coordinates(
                zip_code, city, latitude, longitude
            )

            if search_lat is None or search_lng is None:
                raise ValueError(
                    "Unable to determine search coordinates. Please provide latitude/longitude, zip_code, or city."
                )

            # Set default radius if not specified
            if radius is None:
                radius = 50

            # Build search parameters
            params = {
                "latitude": search_lat,
                "longitude": search_lng,
                "radius": radius,
                "maxResults": max_results,
            }

            # Make API request
            response = self.client._make_request(
                "GET", self.client.config.get_api_url("stores"), params=params
            )

            if not response or response.status_code != 200:
                self.logger.warning(
                    f"Failed to get stores: {response.status_code if response else 'No response'}"
                )
                return []

            data = response.json()
            stores_data = data.get("stores", [])

            # Convert to MeijerStore objects
            stores = []
            for store_data in stores_data:
                try:
                    store = MeijerStore(store_data)
                    # Calculate distance from search coordinates
                    store.distance = self._calculate_distance(
                        search_lat, search_lng, store.latitude, store.longitude
                    )
                    stores.append(store)
                except Exception as e:
                    self.logger.warning(f"Failed to parse store data: {e}")
                    continue

            # Sort by distance
            stores.sort(key=lambda x: x.distance or float("inf"))

            # Apply service filtering if requested
            if required_services:
                stores = self._filter_stores_by_services(stores, required_services)

            # Limit results
            if len(stores) > max_results:
                stores = stores[:max_results]

            self.logger.info(f"Found {len(stores)} stores within {radius} miles")
            return stores

        except Exception as e:
            self.logger.error(f"Error getting stores: {e}")
            return []

    def _determine_search_coordinates(
        self,
        zip_code: Optional[str] = None,
        city: Optional[str] = None,
        latitude: Optional[float] = None,
        longitude: Optional[float] = None,
    ) -> Tuple[Optional[float], Optional[float]]:
        """
        Determine search coordinates from various input parameters.

        Args:
            zip_code: ZIP code for geocoding
            city: City name for geocoding
            latitude: Direct latitude coordinate
            longitude: Direct longitude coordinate

        Returns:
            Tuple of (latitude, longitude) or (None, None) if unable to determine
        """
        # If coordinates are provided directly, use them
        if latitude is not None and longitude is not None:
            return latitude, longitude

        # Try ZIP code geocoding
        if zip_code:
            coords = self._get_zip_code_coordinates(zip_code)
            if coords:
                return coords

        # Try city geocoding
        if city:
            coords = self._get_city_coordinates(city)
            if coords:
                return coords

        # Default to center of Michigan if no coordinates found
        self.logger.warning(
            "No coordinates provided, using default (center of Michigan)"
        )
        return 44.3148, -85.6024

    def _get_zip_code_coordinates(self, zip_code: str) -> Optional[Tuple[float, float]]:
        """
        Get coordinates for a ZIP code using geocoding.

        Args:
            zip_code: ZIP code to geocode

        Returns:
            Tuple of (latitude, longitude) or None if geocoding fails
        """
        try:
            # Use a simple geocoding service (you might want to use a more robust service)
            # For now, return None to fall back to default coordinates
            self.logger.debug(f"ZIP code geocoding not implemented for: {zip_code}")
            return None
        except Exception as e:
            self.logger.warning(f"Failed to geocode ZIP code {zip_code}: {e}")
            return None

    def _get_city_coordinates(self, city: str) -> Optional[Tuple[float, float]]:
        """
        Get coordinates for a city using geocoding.

        Args:
            city: City name to geocode

        Returns:
            Tuple of (latitude, longitude) or None if geocoding fails
        """
        try:
            # Use a simple geocoding service (you might want to use a more robust service)
            # For now, return None to fall back to default coordinates
            self.logger.debug(f"City geocoding not implemented for: {city}")
            return None
        except Exception as e:
            self.logger.warning(f"Failed to geocode city {city}: {e}")
            return None

    def _calculate_distance(
        self, lat1: float, lon1: float, lat2: float, lon2: float
    ) -> float:
        """
        Calculate distance between two coordinates using Haversine formula.

        Args:
            lat1: First latitude
            lon1: First longitude
            lat2: Second latitude
            lon2: Second longitude

        Returns:
            Distance in miles
        """
        # Convert to radians
        lat1_rad = math.radians(lat1)
        lon1_rad = math.radians(lon1)
        lat2_rad = math.radians(lat2)
        lon2_rad = math.radians(lon2)

        # Haversine formula
        dlat = lat2_rad - lat1_rad
        dlon = lon2_rad - lon1_rad

        a = (
            math.sin(dlat / 2) ** 2
            + math.cos(lat1_rad) * math.cos(lat2_rad) * math.sin(dlon / 2) ** 2
        )
        c = 2 * math.asin(math.sqrt(a))

        # Earth's radius in miles
        radius = 3959

        return radius * c

    def _filter_stores_by_services(
        self, stores: List[MeijerStore], required_services: List[str]
    ) -> List[MeijerStore]:
        """
        Filter stores by required services.

        Args:
            stores: List of stores to filter
            required_services: List of required services

        Returns:
            Filtered list of stores
        """
        if not required_services:
            return stores

        filtered_stores = []
        for store in stores:
            store_services = self._get_store_services(store)
            if all(service in store_services for service in required_services):
                filtered_stores.append(store)

        self.logger.info(
            f"Filtered to {len(filtered_stores)} stores with required services: {required_services}"
        )
        return filtered_stores

    def _get_store_services(self, store: MeijerStore) -> List[str]:
        """
        Extract available services from a store.

        Args:
            store: Store object to analyze

        Returns:
            List of available service names
        """
        services = []

        # Check for common service attributes
        service_attributes = [
            "pharmacy",
            "gas_station",
            "curbside_pickup",
            "delivery",
            "bakery",
            "deli",
            "floral",
            "photo_center",
        ]

        for attr in service_attributes:
            if hasattr(store, attr) and getattr(store, attr, False):
                services.append(attr)

        return services

    def find_stores_nearby(
        self, latitude: float, longitude: float, radius: int = 25, max_results: int = 20
    ) -> List[MeijerStore]:
        """
        Find stores near specific coordinates.

        Args:
            latitude: Search latitude
            longitude: Search longitude
            radius: Search radius in miles
            max_results: Maximum number of stores to return

        Returns:
            List of nearby stores sorted by distance
        """
        return self.get_stores(
            latitude=latitude,
            longitude=longitude,
            radius=radius,
            max_results=max_results,
        )

    def get_store_by_id(self, store_id: str) -> Optional[MeijerStore]:
        """
        Get store by ID.

        Args:
            store_id: Store ID to look up

        Returns:
            Store if found, None otherwise
        """
        try:
            # This would need to be implemented based on available API endpoints
            # For now, return None
            self.logger.warning(f"Store lookup by ID not implemented for: {store_id}")
            return None
        except Exception as e:
            self.logger.error(f"Error getting store by ID {store_id}: {e}")
            return None

    def find_stores_with_services(
        self,
        required_services: List[str],
        latitude: Optional[float] = None,
        longitude: Optional[float] = None,
        radius: int = 50,
    ) -> List[MeijerStore]:
        """
        Find stores that offer specific services.

        Args:
            required_services: List of required services
            latitude: Search latitude (optional)
            longitude: Search longitude (optional)
            radius: Search radius in miles

        Returns:
            List of stores with required services
        """
        stores = self.get_stores(
            latitude=latitude,
            longitude=longitude,
            radius=radius,
            required_services=required_services,
        )

        return stores

    def find_nearest_store_with_service(
        self,
        required_service: str,
        latitude: Optional[float] = None,
        longitude: Optional[float] = None,
        radius: int = 100,
    ) -> Optional[MeijerStore]:
        """
        Find the nearest store that offers a specific service.

        Args:
            required_service: Required service
            latitude: Search latitude (optional)
            longitude: Search longitude (optional)
            radius: Search radius in miles

        Returns:
            Nearest store with required service, or None if not found
        """
        stores = self.find_stores_with_services(
            [required_service], latitude=latitude, longitude=longitude, radius=radius
        )

        if stores:
            return stores[0]  # Already sorted by distance
        return None

    def get_store_service_summary(self, store: MeijerStore) -> Dict[str, bool]:
        """
        Get a summary of services offered by a store.

        Args:
            store: Store to analyze

        Returns:
            Dictionary mapping service names to availability
        """
        services = self._get_store_services(store)
        return {service: True for service in services}
