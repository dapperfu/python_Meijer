#!/usr/bin/env python3
"""
Meijer Store Search Function using storeInfo API.

Generated from analysis of storeInfo API calls in meijer2.log.
"""

from typing import List, Optional, Dict, Any
import requests
import json
import logging

from meijer_store import MeijerStore, create_meijer_stores_from_response

logger = logging.getLogger(__name__)


class MeijerStoreSearch:
    """
    Meijer store search functionality using storeInfo API.

    This class provides store search by location and store details lookup
    by interfacing with Meijer's storeInfo API endpoints.
    """

    def __init__(self, meijer_client=None):
        """
        Initialize the store search interface.

        Args:
            meijer_client: Associated Meijer client for authentication
        """
        self.meijer_client = meijer_client

        # StoreInfo API configuration (discovered from analysis)
        self.base_url = "https://api.meijer.com/digital"

        # Common parameters from analysis
        self.default_params = {
            "dataVariant": 2,  # Discovered from API calls
        }

    def find_stores_nearby(
        self,
        latitude: float,
        longitude: float,
        radius_miles: int = 50,
        max_results: int = 10,
    ) -> List[MeijerStore]:
        """
        Find Meijer stores near given coordinates.

        Args:
            latitude: Search latitude
            longitude: Search longitude
            radius_miles: Search radius in miles
            max_results: Maximum number of stores to return

        Returns:
            List of MeijerStore objects sorted by distance
        """
        endpoint = f"{self.base_url}/storeInfo/v2/stores/proximity"

        # Build parameters based on API analysis
        params = {
            "latitude": latitude,
            "longitude": longitude,
            "miles": radius_miles,
            "numToReturn": max_results,
            **self.default_params,
        }

        try:
            response = requests.get(endpoint, params=params)
            response.raise_for_status()

            store_data = response.json()
            stores = create_meijer_stores_from_response(store_data, self.meijer_client)

            logger.info(
                f"Found {len(stores)} stores within {radius_miles} miles of ({latitude}, {longitude})"
            )
            return stores

        except Exception as e:
            logger.error(f"Store proximity search failed: {e}")
            return []

    def get_store_details(self, store_id: str) -> Optional[MeijerStore]:
        """
        Get detailed information for a specific store.

        Args:
            store_id: Meijer store ID

        Returns:
            MeijerStore object with detailed information, or None if not found
        """
        endpoint = f"{self.base_url}/storeInfo/stores/{store_id}"

        try:
            response = requests.get(endpoint)
            response.raise_for_status()

            store_data = response.json()
            stores = create_meijer_stores_from_response(store_data, self.meijer_client)

            if stores:
                logger.info(f"Retrieved details for store {store_id}")
                return stores[0]
            else:
                logger.warning(f"No store data found for store {store_id}")
                return None

        except Exception as e:
            logger.error(f"Store details lookup failed for {store_id}: {e}")
            return None

    def find_stores_in_city(
        self, city: str, state: str, max_results: int = 20
    ) -> List[MeijerStore]:
        """
        Find stores in a specific city (requires geocoding).

        Args:
            city: City name
            state: State abbreviation
            max_results: Maximum stores to return

        Returns:
            List of MeijerStore objects
        """
        # This would require a geocoding service to convert city/state to coordinates
        # For now, return example implementation
        logger.warning("City-based search requires geocoding service integration")
        return []

    def get_all_stores(
        self, max_radius: int = 3000, max_results: int = 20
    ) -> List[MeijerStore]:
        """
        Get all Meijer stores (using large radius).

        Args:
            max_radius: Large radius to capture all stores
            max_results: Maximum stores to return

        Returns:
            List of all MeijerStore objects
        """
        # Use a central US location for wide search
        # (Based on coordinates seen in analysis)
        central_lat = 42.8289  # Michigan area from analysis
        central_lng = -86.0905

        return self.find_stores_nearby(
            latitude=central_lat,
            longitude=central_lng,
            radius_miles=max_radius,
            max_results=max_results,
        )

    def get_stores_by_ids(self, store_ids: List[str]) -> List[MeijerStore]:
        """
        Get multiple stores by their IDs.

        Args:
            store_ids: List of store IDs to retrieve

        Returns:
            List of MeijerStore objects
        """
        stores = []

        for store_id in store_ids:
            store = self.get_store_details(store_id)
            if store:
                stores.append(store)

        return stores


# Integration with main Meijer client
class MeijerWithStores:
    """
    Extended Meijer client with store search functionality.
    """

    def __init__(self, meijer_client):
        """Initialize with existing Meijer client."""
        self.meijer_client = meijer_client
        self.store_search = MeijerStoreSearch(meijer_client)

    def find_nearby_stores(
        self, latitude: float, longitude: float, **kwargs
    ) -> List[MeijerStore]:
        """Find stores near coordinates."""
        return self.store_search.find_stores_nearby(latitude, longitude, **kwargs)

    def get_store(self, store_id: str) -> Optional[MeijerStore]:
        """Get specific store details."""
        return self.store_search.get_store_details(store_id)

    def find_all_stores(self, **kwargs) -> List[MeijerStore]:
        """Get all Meijer stores."""
        return self.store_search.get_all_stores(**kwargs)


if __name__ == "__main__":
    # Example usage
    store_search = MeijerStoreSearch()

    # Find stores near a location (coordinates from analysis)
    stores = store_search.find_stores_nearby(
        latitude=42.82893, longitude=-86.09048, radius_miles=50, max_results=10
    )

    print(f"Found {len(stores)} stores:")
    for store in stores:
        print(f"  - {store}")

    # Get specific store details (ID from analysis)
    store_217 = store_search.get_store_details("217")
    if store_217:
        print(f"\nStore 217 details:")
        print(f"  Name: {store_217.display_name}")
        print(f"  Address: {store_217.full_address}")
        print(f"  Services: {store_217.get_store_services()}")
