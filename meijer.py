#!/usr/bin/env python3
"""
Meijer API Client

This module provides a Python client for interacting with the Meijer API,
including authentication, offers retrieval, and other services.

Based on network analysis of Meijer mobile app traffic.
"""

import json
import logging
import time
from typing import Any, Dict, List, Optional, Union
from urllib.parse import urljoin

import requests
from requests.adapters import HTTPAdapter
from urllib3.util.retry import Retry


class MeijerError(Exception):
    """Custom exception for Meijer API errors."""
    pass


class MeijerAuthenticationError(MeijerError):
    """Exception raised when authentication fails."""
    pass


class Meijer:
    """
    Meijer API client for interacting with Meijer services.
    
    This class handles authentication, API requests, and provides methods
    for accessing various Meijer services like offers, home cards, and more.
    """
    
    # API Configuration
    BASE_URL = "https://api.meijer.com"
    SUBSCRIPTION_KEY = "a10bc58ac484478d9b3958b1742c3a03"
    
    # Content Types
    CONTENT_TYPES = {
        "offers": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
        "homecards": "application/vnd.meijer.digitalmperks.homecards-v1.0+json",
        "cmsspecialoffers": "application/vnd.meijer.digitalmperks.cmsspecialoffers-v1.0+json",
        "couponads": "application/vnd.meijer.digitalmperks.couponads-v1.0+json"
    }
    
    # User Agent from mobile app
    USER_AGENT = "Meijer/101200000 okhttp/4.12.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)"
    
    def __init__(self, session: Optional[requests.Session] = None) -> None:
        """
        Initialize the Meijer client.
        
        Args:
            session: Optional requests session to use. If not provided,
                    a new session will be created with retry logic.
        """
        self.session = session or self._create_session()
        self._authenticated = False
        self._digital_id: Optional[str] = None
        self._external_shopper_id: Optional[str] = None
        self._home_store_id: Optional[int] = None
        self._current_store_id: Optional[int] = None
        
        # Setup logging
        self.logger = logging.getLogger(__name__)
        
    def _create_session(self) -> requests.Session:
        """
        Create a requests session with retry logic and proper headers.
        
        Returns:
            Configured requests session
        """
        session = requests.Session()
        
        # Configure retry strategy
        retry_strategy = Retry(
            total=3,
            status_forcelist=[429, 500, 502, 503, 504],
            method_whitelist=["HEAD", "GET", "OPTIONS", "POST"],
            backoff_factor=1
        )
        
        adapter = HTTPAdapter(max_retries=retry_strategy)
        session.mount("http://", adapter)
        session.mount("https://", adapter)
        
        # Set default headers
        session.headers.update({
            "User-Agent": self.USER_AGENT,
            "Accept": "application/json",
            "Accept-Language": "en-US",
            "Accept-Encoding": "gzip",
            "Connection": "Keep-Alive"
        })
        
        return session
    
    def _get_headers(self, content_type: Optional[str] = None) -> Dict[str, str]:
        """
        Get headers for API requests.
        
        Args:
            content_type: Optional content type to include
            
        Returns:
            Dictionary of headers
        """
        headers = {
            "ocp-apim-subscription-key": self.SUBSCRIPTION_KEY
        }
        
        if content_type:
            headers["Accept"] = content_type
            headers["Content-Type"] = content_type
            
        return headers
    
    def _make_request(
        self, 
        method: str, 
        endpoint: str, 
        data: Optional[Dict[str, Any]] = None,
        params: Optional[Dict[str, Any]] = None,
        content_type: Optional[str] = None
    ) -> Dict[str, Any]:
        """
        Make an API request to Meijer.
        
        Args:
            method: HTTP method (GET, POST, etc.)
            endpoint: API endpoint path
            data: Request data for POST requests
            params: Query parameters
            content_type: Content type for the request
            
        Returns:
            API response as dictionary
            
        Raises:
            MeijerError: If the request fails
        """
        url = urljoin(self.BASE_URL, endpoint)
        headers = self._get_headers(content_type)
        
        try:
            if method.upper() == "GET":
                response = self.session.get(url, headers=headers, params=params)
            elif method.upper() == "POST":
                response = self.session.post(url, headers=headers, json=data, params=params)
            else:
                raise MeijerError(f"Unsupported HTTP method: {method}")
            
            response.raise_for_status()
            
            # Handle empty responses
            if not response.content:
                return {}
                
            return response.json()
            
        except requests.exceptions.RequestException as e:
            self.logger.error(f"Request failed: {e}")
            raise MeijerError(f"API request failed: {e}")
        except json.JSONDecodeError as e:
            self.logger.error(f"Failed to parse JSON response: {e}")
            raise MeijerError(f"Invalid JSON response: {e}")
    
    def login(self, username: str, password: str) -> bool:
        """
        Authenticate with Meijer using username and password.
        
        Note: This is a placeholder implementation. The actual Meijer
        authentication flow may require additional steps or different
        endpoints that were not captured in the network analysis.
        
        Args:
            username: Meijer account username/email
            password: Meijer account password
            
        Returns:
            True if authentication successful, False otherwise
            
        Raises:
            MeijerAuthenticationError: If authentication fails
        """
        self.logger.info("Attempting to authenticate with Meijer...")
        
        # This is a placeholder - the actual login endpoint and flow
        # would need to be determined from additional network analysis
        # or reverse engineering of the mobile app
        
        try:
            # For now, we'll simulate a successful login
            # In a real implementation, this would make actual API calls
            
            # Set authentication state
            self._authenticated = True
            self._digital_id = "13266596"  # Example from log
            self._external_shopper_id = "6361aebe-c5c5-4e0a-bdcb-6dab4a5d92dd"  # Example from log
            self._home_store_id = 217  # Example from log
            self._current_store_id = 217  # Example from log
            
            self.logger.info("Authentication successful")
            return True
            
        except Exception as e:
            self.logger.error(f"Authentication failed: {e}")
            raise MeijerAuthenticationError(f"Login failed: {e}")
    
    def is_authenticated(self) -> bool:
        """
        Check if the client is currently authenticated.
        
        Returns:
            True if authenticated, False otherwise
        """
        return self._authenticated
    
    def get_offers(
        self, 
        page_size: int = 9999, 
        current_page: int = 1,
        offer_class: int = 1,
        store_id: Optional[int] = None
    ) -> Dict[str, Any]:
        """
        Get Meijer offers and coupons.
        
        Args:
            page_size: Number of offers per page
            current_page: Page number to retrieve
            offer_class: Type of offers to retrieve
            store_id: Store ID for location-specific offers
            
        Returns:
            Dictionary containing offers data
            
        Raises:
            MeijerError: If the request fails
        """
        if not self.is_authenticated():
            raise MeijerError("Must be authenticated to retrieve offers")
        
        endpoint = "/loyalty/mPerks/api/offers"
        
        data = {
            "sortType": "BySuggested",
            "pageSize": page_size,
            "currentPage": current_page,
            "offerClass": offer_class,
            "searchCriteria": "",
            "storeId": store_id or self._current_store_id or 0,
            "ceilingCount": 0,
            "ceilingDuration": 0,
            "rewardCouponId": 0,
            "tagId": "",
            "getOfferCountPerDepartment": True,
            "upcList": [],
            "showClippedCoupons": True,
            "showOnlySpecialOffers": False,
            "showRedeemedOffers": False,
            "offerIds": [],
            "displayReasonFilters": []
        }
        
        return self._make_request(
            "POST", 
            endpoint, 
            data=data, 
            content_type=self.CONTENT_TYPES["offers"]
        )
    
    def get_home_cards(self) -> Dict[str, Any]:
        """
        Get Meijer home page cards and content.
        
        Returns:
            Dictionary containing home cards data
            
        Raises:
            MeijerError: If the request fails
        """
        if not self.is_authenticated():
            raise MeijerError("Must be authenticated to retrieve home cards")
        
        endpoint = "/digital/homecards/v1/cards"
        
        return self._make_request(
            "GET", 
            endpoint, 
            content_type=self.CONTENT_TYPES["homecards"]
        )
    
    def get_department_carousel(self) -> Dict[str, Any]:
        """
        Get department carousel data for shopping categories.
        
        Returns:
            Dictionary containing department information
            
        Raises:
            MeijerError: If the request fails
        """
        if not self.is_authenticated():
            raise MeijerError("Must be authenticated to retrieve department data")
        
        endpoint = "/digital/homecards/v1/cards/shopByDepartmentV2"
        
        return self._make_request(
            "GET", 
            endpoint, 
            content_type=self.CONTENT_TYPES["homecards"]
        )
    
    def get_special_offers_image(self) -> Dict[str, Any]:
        """
        Get special offers banner image URL.
        
        Returns:
            Dictionary containing special offers image data
            
        Raises:
            MeijerError: If the request fails
        """
        if not self.is_authenticated():
            raise MeijerError("Must be authenticated to retrieve special offers")
        
        endpoint = "/loyalty/mPerks/api/cms/specialoffers/image"
        
        return self._make_request(
            "GET", 
            endpoint, 
            content_type=self.CONTENT_TYPES["cmsspecialoffers"]
        )
    
    def get_coupon_ads(self) -> Dict[str, Any]:
        """
        Get coupon advertisements and promotional content.
        
        Returns:
            Dictionary containing coupon ads data
            
        Raises:
            MeijerError: If the request fails
        """
        if not self.is_authenticated():
            raise MeijerError("Must be authenticated to retrieve coupon ads")
        
        endpoint = "/loyalty/mPerks/api/cms/couponads"
        
        return self._make_request(
            "POST", 
            endpoint, 
            data={}, 
            content_type=self.CONTENT_TYPES["couponads"]
        )
    
    def get_user_info(self) -> Dict[str, Any]:
        """
        Get current user information and account details.
        
        Returns:
            Dictionary containing user information
            
        Raises:
            MeijerError: If the request fails
        """
        if not self.is_authenticated():
            raise MeijerError("Must be authenticated to retrieve user info")
        
        return {
            "authenticated": self._authenticated,
            "digitalId": self._digital_id,
            "externalShopperId": self._external_shopper_id,
            "homeStoreId": self._home_store_id,
            "currentStoreId": self._current_store_id
        }
    
    def logout(self) -> None:
        """
        Logout and clear authentication state.
        """
        self.logger.info("Logging out...")
        self._authenticated = False
        self._digital_id = None
        self._external_shopper_id = None
        self._home_store_id = None
        self._current_store_id = None
        self.logger.info("Logout successful")
    
    def __enter__(self):
        """Context manager entry."""
        return self
    
    def __exit__(self, exc_type, exc_val, exc_tb):
        """Context manager exit."""
        if self.is_authenticated():
            self.logout()
        self.session.close()


def main() -> None:
    """Example usage of the Meijer client."""
    # Setup logging
    logging.basicConfig(level=logging.INFO)
    
    # Create Meijer client
    with Meijer() as meijer:
        try:
            # Attempt to login (placeholder implementation)
            print("Logging in to Meijer...")
            if meijer.login("username", "password"):
                print("Login successful!")
                
                # Get user info
                user_info = meijer.get_user_info()
                print(f"User info: {user_info}")
                
                # Get offers
                print("Retrieving offers...")
                offers = meijer.get_offers()
                print(f"Retrieved {len(offers.get('offers', []))} offers")
                
                # Get home cards
                print("Retrieving home cards...")
                home_cards = meijer.get_home_cards()
                print(f"Retrieved {len(home_cards.get('cards', []))} home cards")
                
            else:
                print("Login failed!")
                
        except MeijerError as e:
            print(f"Meijer error: {e}")
        except Exception as e:
            print(f"Unexpected error: {e}")


if __name__ == "__main__":
    main() 