#!/usr/bin/env python3
"""
Unified Meijer API Client - Complete Implementation

A comprehensive, unified Python client for interacting with the Meijer API that
consolidates all working authentication methods and features into a single module.

Features:
- OAuth 2.0 with PKCE authentication
- Bearer token authentication (for extracted tokens)
- Selenium-based automated authentication
- Persistent token storage (no more 2FA)
- Complete Shop & Scan functionality
- Shopping list management (MeijerList)
- Comprehensive API coverage

Based on detailed network analysis using mitmproxy flow inspection.
"""

import json
import logging
import time
import hashlib
import base64
import secrets
import webbrowser
import pickle
import os
import re
from datetime import datetime, timedelta
from typing import Any, Dict, List, Optional, Union, Tuple
from urllib.parse import urljoin, urlparse, parse_qs, urlencode
from dataclasses import dataclass, field
from enum import Enum
from pathlib import Path

import requests
from requests.adapters import HTTPAdapter
from urllib3.util.retry import Retry
from requests.auth import AuthBase

# Optional Selenium imports
try:
    from selenium import webdriver
    from selenium.webdriver.common.by import By
    from selenium.webdriver.support.ui import WebDriverWait
    from selenium.webdriver.support import expected_conditions as EC
    from selenium.webdriver.firefox.options import Options
    from selenium.webdriver.firefox.service import Service
    from webdriver_manager.firefox import GeckoDriverManager
    from selenium.common.exceptions import TimeoutException, NoSuchElementException
    SELENIUM_AVAILABLE = True
except ImportError:
    SELENIUM_AVAILABLE = False

# Optional mitmproxy imports
try:
    from mitmproxy import flow
    from mitmproxy import http
    from mitmproxy.io import FlowReader
    MITMPROXY_AVAILABLE = True
except ImportError:
    MITMPROXY_AVAILABLE = False


class MeijerError(Exception):
    """Base exception for Meijer API errors."""
    pass


class MeijerAuthenticationError(MeijerError):
    """Exception raised when authentication fails."""
    pass


class MeijerAPIError(MeijerError):
    """Exception raised when API calls fail."""
    pass


class MeijerRateLimitError(MeijerError):
    """Exception raised when rate limits are exceeded."""
    pass


class AuthenticationStatus(Enum):
    """Authentication status enumeration."""
    UNAUTHENTICATED = "unauthenticated"
    AUTHENTICATED = "authenticated"
    EXPIRED = "expired"
    REFRESHING = "refreshing"


@dataclass
class OAuthConfig:
    """OAuth 2.0 configuration for Meijer authentication."""
    client_id: str = "0oa1o8g9njWsUvwsx697"
    auth_url: str = "https://id.meijer.com/oauth2/default/v1/authorize"
    token_url: str = "https://id.meijer.com/oauth2/default/v1/token"
    keys_url: str = "https://id.meijer.com/oauth2/default/v1/keys"
    scope: str = "openid profile offline_access"
    redirect_uri: str = "com.meijer.mobile.meijer:/login"
    web_redirect_uri: str = "https://localhost:45678/callback"  # For web-based auth
    response_type: str = "code"
    code_challenge_method: str = "S256"


@dataclass
class AuthTokens:
    """Authentication tokens container with persistent storage support."""
    access_token: str
    refresh_token: str
    id_token: str
    token_type: str
    expires_in: int
    expires_at: datetime
    scope: str
    device_secret: Optional[str] = None
    issued_token_type: Optional[str] = None
    
    @classmethod
    def from_response(cls, response: Dict[str, Any]) -> 'AuthTokens':
        """Create AuthTokens from OAuth response."""
        expires_in = response.get('expires_in', 3600)
        expires_at = datetime.now() + timedelta(seconds=expires_in)
        
        return cls(
            access_token=response['access_token'],
            refresh_token=response.get('refresh_token', ''),
            id_token=response.get('id_token', ''),
            token_type=response.get('token_type', 'Bearer'),
            expires_in=expires_in,
            expires_at=expires_at,
            scope=response.get('scope', ''),
            device_secret=response.get('device_secret'),
            issued_token_type=response.get('issued_token_type')
        )
    
    @classmethod
    def from_bearer_token(cls, bearer_token: str, expires_in: int = 3600) -> 'AuthTokens':
        """Create AuthTokens from a bearer token."""
        expires_at = datetime.now() + timedelta(seconds=expires_in)
        
        return cls(
            access_token=bearer_token,
            refresh_token="",
            id_token="",
            token_type="Bearer",
            expires_in=expires_in,
            expires_at=expires_at,
            scope="",
            device_secret=None,
            issued_token_type=None
        )
    
    def is_expired(self, buffer_seconds: int = 300) -> bool:
        """Check if token is expired or will expire soon."""
        return datetime.now() + timedelta(seconds=buffer_seconds) >= self.expires_at
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for persistent storage."""
        return {
            'access_token': self.access_token,
            'refresh_token': self.refresh_token,
            'id_token': self.id_token,
            'token_type': self.token_type,
            'expires_in': self.expires_in,
            'expires_at': self.expires_at.isoformat(),
            'scope': self.scope,
            'device_secret': self.device_secret,
            'issued_token_type': self.issued_token_type
        }
    
    @classmethod
    def from_dict(cls, data: Dict[str, Any]) -> 'AuthTokens':
        """Create AuthTokens from stored dictionary."""
        expires_at = datetime.fromisoformat(data['expires_at'])
        
        return cls(
            access_token=data['access_token'],
            refresh_token=data['refresh_token'],
            id_token=data['id_token'],
            token_type=data['token_type'],
            expires_in=data['expires_in'],
            expires_at=expires_at,
            scope=data['scope'],
            device_secret=data.get('device_secret'),
            issued_token_type=data.get('issued_token_type')
        )


@dataclass
class UserInfo:
    """User information container."""
    user_id: str
    email: str
    first_name: str
    last_name: str
    digital_id: str
    mperks_number: str
    phone: str
    address: Dict[str, Any]
    preferences: Dict[str, Any]
    
    @classmethod
    def from_dict(cls, data: Dict[str, Any]) -> 'UserInfo':
        """Create UserInfo from API response."""
        return cls(
            user_id=data.get('userId', ''),
            email=data.get('email', ''),
            first_name=data.get('firstName', ''),
            last_name=data.get('lastName', ''),
            digital_id=data.get('digitalId', ''),
            mperks_number=data.get('mperksNumber', ''),
            phone=data.get('phone', ''),
            address=data.get('address', {}),
            preferences=data.get('preferences', {})
        )


@dataclass
class ShopScanItem:
    """Shop & Scan cart item."""
    barcode: str
    description: str
    price: float
    quantity: int = 1
    item_id: Optional[str] = None
    timestamp: Optional[datetime] = None


@dataclass 
class ShopScanTrip:
    """Shop & Scan shopping trip."""
    trip_id: str
    store_id: str
    started_at: datetime
    items: List[ShopScanItem] = field(default_factory=list)
    status: str = "active"
    total_amount: float = 0.0


@dataclass
class ListItem:
    """Shopping list item."""
    list_item_id: str
    description: str
    quantity: int = 1
    completed: bool = False
    category: Optional[str] = None
    
    @classmethod
    def from_dict(cls, data: Dict[str, Any]) -> 'ListItem':
        """Create ListItem from API response."""
        return cls(
            list_item_id=data.get('listItemId', ''),
            description=data.get('itemDescription', ''),
            quantity=data.get('quantity', 1),
            completed=data.get('completed', False),
            category=data.get('category')
        )


@dataclass
class MeijerOffer:
    """Meijer offer/coupon information."""
    id: str
    title: str
    description: Optional[str] = None
    discount_amount: Optional[float] = None
    discount_percentage: Optional[float] = None
    valid_from: Optional[datetime] = None
    valid_until: Optional[datetime] = None
    terms: Optional[str] = None
    image_url: Optional[str] = None
    category: Optional[str] = None
    is_clipped: bool = False


@dataclass
class MeijerStore:
    """Meijer store information."""
    id: str
    name: str
    address: str
    city: str
    state: str
    zip_code: str
    phone: Optional[str] = None
    hours: Optional[Dict[str, str]] = None
    services: Optional[List[str]] = None
    latitude: Optional[float] = None
    longitude: Optional[float] = None


class MeijerAuth(AuthBase):
    """Custom authentication handler for Meijer API."""
    
    def __init__(self, access_token: str):
        self.access_token = access_token
    
    def __call__(self, request):
        request.headers['Authorization'] = f'Bearer {self.access_token}'
        return request


class TokenStorage:
    """Handles persistent storage of authentication tokens."""
    
    def __init__(self, storage_file: str = "meijer_tokens.pkl"):
        self.storage_file = storage_file
    
    def save_tokens(self, tokens: AuthTokens) -> bool:
        """Save tokens to persistent storage."""
        try:
            with open(self.storage_file, 'wb') as f:
                pickle.dump(tokens.to_dict(), f)
            return True
        except Exception as e:
            logging.error(f"Failed to save tokens: {e}")
            return False
    
    def load_tokens(self) -> Optional[AuthTokens]:
        """Load tokens from persistent storage."""
        try:
            if not os.path.exists(self.storage_file):
                return None
            
            with open(self.storage_file, 'rb') as f:
                token_data = pickle.load(f)
            
            return AuthTokens.from_dict(token_data)
        except Exception as e:
            logging.error(f"Failed to load tokens: {e}")
            return None
    
    def clear_tokens(self) -> bool:
        """Clear stored tokens."""
        try:
            if os.path.exists(self.storage_file):
                os.remove(self.storage_file)
            return True
        except Exception as e:
            logging.error(f"Failed to clear tokens: {e}")
            return False
    
    def has_tokens(self) -> bool:
        """Check if tokens are stored."""
        return os.path.exists(self.storage_file)


class SeleniumAuth:
    """Selenium-based authentication for automated OAuth flow."""
    
    def __init__(self, username: str, password: str, headless: bool = True):
        """Initialize Selenium authentication."""
        if not SELENIUM_AVAILABLE:
            raise ImportError("Selenium is not available. Install with: pip install selenium webdriver-manager")
        
        self.username = username
        self.password = password
        self.headless = headless
        self.driver = None
        self.logger = logging.getLogger(__name__)
    
    def _setup_driver(self) -> webdriver.Firefox:
        """Setup Firefox WebDriver with stealth measures."""
        firefox_options = Options()
        
        if self.headless:
            firefox_options.add_argument("--headless")
        
        # Stealth options
        firefox_options.add_argument("--no-sandbox")
        firefox_options.add_argument("--disable-dev-shm-usage")
        firefox_options.add_argument("--disable-blink-features=AutomationControlled")
        
        # Mobile user agent
        firefox_options.add_argument("--user-agent=Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36")
        
        # Auto-install driver
        geckodriver_path = GeckoDriverManager().install()
        service = Service(geckodriver_path)
        
        driver = webdriver.Firefox(service=service, options=firefox_options)
        driver.implicitly_wait(10)
        
        return driver
    
    def authenticate(self, auth_url: str) -> Optional[str]:
        """Perform automated authentication and return authorization code."""
        try:
            self.driver = self._setup_driver()
            self.logger.info(f"🤖 Starting Selenium authentication")
            
            # Navigate to auth URL
            self.driver.get(auth_url)
            time.sleep(2)
            
            # Fill username
            username_field = self.driver.find_element(By.ID, "identifier")
            username_field.clear()
            username_field.send_keys(self.username)
            
            # Click next
            next_button = self.driver.find_element(By.XPATH, "//input[@value='Next']")
            next_button.click()
            time.sleep(2)
            
            # Fill password
            password_field = self.driver.find_element(By.ID, "credentials.passcode")
            password_field.clear()
            password_field.send_keys(self.password)
            
            # Submit
            sign_in_button = self.driver.find_element(By.XPATH, "//input[@value='Sign In']")
            sign_in_button.click()
            
            # Wait for redirect and extract code
            WebDriverWait(self.driver, 30).until(
                lambda driver: "code=" in driver.current_url or "error=" in driver.current_url
            )
            
            current_url = self.driver.current_url
            self.logger.info(f"Final URL: {current_url}")
            
            # Extract authorization code
            parsed_url = urlparse(current_url)
            query_params = parse_qs(parsed_url.query)
            
            if 'code' in query_params:
                auth_code = query_params['code'][0]
                self.logger.info("✅ Authorization code extracted successfully")
                return auth_code
            else:
                self.logger.error("❌ No authorization code found in redirect URL")
                return None
                
        except Exception as e:
            self.logger.error(f"❌ Selenium authentication failed: {e}")
            return None
        
        finally:
            if self.driver:
                self.driver.quit()


class MeijerList:
    """
    Meijer Shopping List management.
    
    Provides complete shopping list functionality including:
    - Getting shopping list items
    - Adding new items
    - Completing/uncompleting items
    - Clearing completed items
    - Managing favorites
    """
    
    def __init__(self, meijer_client):
        """Initialize shopping list with reference to Meijer client."""
        self.meijer = meijer_client
        self.logger = meijer_client.logger
        
        # API endpoints for shopping list management
        self.endpoints = {
            'get_list': '/loyalty/shoppinglist/GetList',
            'add_item': '/loyalty/shoppinglist/AddListItem',
            'complete_item': '/loyalty/shoppinglist/MarkAsCompleted',
            'uncomplete_item': '/loyalty/shoppinglist/MarkAsNotCompleted',
            'delete_item': '/loyalty/shoppinglist/DeleteListItem',
            'clear_completed': '/loyalty/shoppinglist/ClearCompleted',
            'get_favorites': '/loyalty/shoppinglist/GetFavoritesList',
            'add_favorite': '/loyalty/shoppinglist/AddFavorite',
            'delete_favorite': '/loyalty/shoppinglist/DeleteFavorite'
        }
    
    def get(self) -> List[ListItem]:
        """Get shopping list items."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")
            
            url = urljoin(self.meijer.api_base_url, self.endpoints['get_list'])
            headers = self.meijer._get_api_headers()
            headers.update({
                'Accept': 'application/meijer.shoppingList.ShoppingList-v1.0+json'
            })
            
            response = self.meijer._make_request('GET', url, headers=headers)
            
            if response.status_code == 200:
                data = response.json()
                items = []
                for item_data in data.get('listItems', []):
                    items.append(ListItem.from_dict(item_data))
                return items
            else:
                self.logger.error(f"Failed to get shopping list: {response.status_code}")
                return []
                
        except Exception as e:
            self.logger.error(f"Error getting shopping list: {e}")
            return []
    
    def add(self, description: str, quantity: int = 1) -> bool:
        """Add item to shopping list."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")
            
            url = urljoin(self.meijer.api_base_url, self.endpoints['add_item'])
            headers = self.meijer._get_api_headers()
            headers.update({
                'Accept': 'application/vnd.meijer.listManagement.list-v1.0+json',
                'Content-Type': 'application/vnd.meijer.listManagement.list-v1.0+json'
            })
            
            payload = {
                'listItems': [{
                    'itemDescription': description,
                    'quantity': quantity
                }]
            }
            
            response = self.meijer._make_request('POST', url, headers=headers, json=payload)
            
            if response.status_code in (200, 201):
                self.logger.info(f"Added item to shopping list: {description}")
                return True
            else:
                self.logger.error(f"Failed to add item: {response.status_code}")
                return False
                
        except Exception as e:
            self.logger.error(f"Error adding item to shopping list: {e}")
            return False
    
    def complete(self, item: Union[str, int, ListItem]) -> bool:
        """Mark item as completed."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")
            
            # Extract list item ID
            if isinstance(item, ListItem):
                list_item_id = item.list_item_id
            elif isinstance(item, dict) and 'listItemId' in item:
                list_item_id = item['listItemId']
            elif isinstance(item, (str, int)):
                list_item_id = str(item)
            else:
                raise ValueError("Invalid item type for completion")
            
            url = f"{self.meijer.api_base_url}{self.endpoints['complete_item']}/{list_item_id}"
            headers = self.meijer._get_api_headers()
            headers.update({
                'Accept': 'application/vnd.meijer.listManagement.list-v1.0+json',
                'Content-Type': 'application/vnd.meijer.listManagement.list-v1.0+json'
            })
            
            response = self.meijer._make_request('PUT', url, headers=headers)
            
            if response.status_code in (200, 204):
                self.logger.info(f"Completed item: {list_item_id}")
                return True
            else:
                self.logger.error(f"Failed to complete item: {response.status_code}")
                return False
                
        except Exception as e:
            self.logger.error(f"Error completing item: {e}")
            return False
    
    def uncomplete(self, item: Union[str, int, ListItem]) -> bool:
        """Mark item as not completed."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")
            
            # Extract list item ID
            if isinstance(item, ListItem):
                list_item_id = item.list_item_id
            elif isinstance(item, dict) and 'listItemId' in item:
                list_item_id = item['listItemId']
            elif isinstance(item, (str, int)):
                list_item_id = str(item)
            else:
                raise ValueError("Invalid item type for uncompletion")
            
            url = f"{self.meijer.api_base_url}{self.endpoints['uncomplete_item']}/{list_item_id}"
            headers = self.meijer._get_api_headers()
            headers.update({
                'Accept': 'application/vnd.meijer.listManagement.list-v1.0+json',
                'Content-Type': 'application/vnd.meijer.listManagement.list-v1.0+json'
            })
            
            response = self.meijer._make_request('PUT', url, headers=headers)
            
            if response.status_code in (200, 204):
                self.logger.info(f"Uncompleted item: {list_item_id}")
                return True
            else:
                self.logger.error(f"Failed to uncomplete item: {response.status_code}")
                return False
                
        except Exception as e:
            self.logger.error(f"Error uncompleting item: {e}")
            return False
    
    def delete(self, item: Union[str, int, ListItem]) -> bool:
        """Delete item from shopping list."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")
            
            # Extract list item ID
            if isinstance(item, ListItem):
                list_item_id = item.list_item_id
            elif isinstance(item, dict) and 'listItemId' in item:
                list_item_id = item['listItemId']
            elif isinstance(item, (str, int)):
                list_item_id = str(item)
            else:
                raise ValueError("Invalid item type for deletion")
            
            url = f"{self.meijer.api_base_url}{self.endpoints['delete_item']}/{list_item_id}"
            headers = self.meijer._get_api_headers()
            
            response = self.meijer._make_request('DELETE', url, headers=headers)
            
            if response.status_code in (200, 204):
                self.logger.info(f"Deleted item: {list_item_id}")
                return True
            else:
                self.logger.error(f"Failed to delete item: {response.status_code}")
                return False
                
        except Exception as e:
            self.logger.error(f"Error deleting item: {e}")
            return False
    
    def clear_completed(self) -> bool:
        """Clear all completed items from shopping list."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")
            
            url = urljoin(self.meijer.api_base_url, self.endpoints['clear_completed'])
            headers = self.meijer._get_api_headers()
            headers.update({
                'Accept': 'application/vnd.meijer.listManagement.list-v1.0+json',
                'Content-Type': 'application/vnd.meijer.listManagement.list-v1.0+json'
            })
            
            response = self.meijer._make_request('DELETE', url, headers=headers)
            
            if response.status_code in (200, 204):
                self.logger.info("Cleared completed items from shopping list")
                return True
            else:
                self.logger.error(f"Failed to clear completed items: {response.status_code}")
                return False
                
        except Exception as e:
            self.logger.error(f"Error clearing completed items: {e}")
            return False
    
    def get_favorites(self) -> List[Dict[str, Any]]:
        """Get favorites list."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")
            
            url = urljoin(self.meijer.api_base_url, self.endpoints['get_favorites'])
            headers = self.meijer._get_api_headers()
            headers.update({
                'Accept': 'application/json'
            })
            
            response = self.meijer._make_request('GET', url, headers=headers)
            
            if response.status_code == 200:
                data = response.json()
                return data.get('favorites', [])
            else:
                self.logger.error(f"Failed to get favorites: {response.status_code}")
                return []
                
        except Exception as e:
            self.logger.error(f"Error getting favorites: {e}")
            return []
    
    @property
    def items(self) -> List[ListItem]:
        """Get shopping list items (property)."""
        return self.get()
    
    @property
    def count(self) -> int:
        """Get count of shopping list items."""
        items = self.get()
        return len(items)


class ShopNScan:
    """
    Meijer Shop & Scan functionality.
    
    Handles the complete Shop & Scan workflow based on APK analysis:
    - Session initialization and store validation
    - Item scanning and cart management  
    - Checkout finalization
    """
    
    def __init__(self, meijer_client):
        """Initialize Shop & Scan with reference to Meijer client."""
        self.meijer = meijer_client
        self.current_trip: Optional[ShopScanTrip] = None
        self.logger = meijer_client.logger
        
        # API endpoints discovered from APK analysis
        self.endpoints = {
            'config': '/dgtlmma/accounts/isShopAndScanEnabled',
            'static_config': 'https://static.meijer.com/mobileassets/shopandscan/shopandscan_config.json',
            'start_trip': '/dgtlmma/shopandscan/trip/start',
            'scan_item': '/dgtlmma/shopandscan/item/scan',
            'add_item': '/dgtlmma/shopandscan/cart/add',
            'remove_item': '/dgtlmma/shopandscan/cart/remove',
            'get_cart': '/dgtlmma/shopandscan/cart',
            'finalize': '/dgtlmma/shopandscan/checkout/finalize',
            'end_trip': '/dgtlmma/shopandscan/trip/end'
        }
    
    def is_enabled(self) -> bool:
        """Check if Shop & Scan is enabled for the current user."""
        try:
            url = urljoin(self.meijer.api_base_url, self.endpoints['config'])
            headers = self.meijer._get_api_headers()
            headers.update({
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            })
            
            response = self.meijer._make_request('GET', url, headers=headers)
            
            if response.status_code == 200:
                data = response.json()
                enabled = data.get('isEnabled', False)
                self.logger.info(f"Shop & Scan enabled: {enabled}")
                return enabled
            else:
                self.logger.warning(f"Failed to check Shop & Scan status: {response.status_code}")
                return False
                
        except Exception as e:
            self.logger.error(f"Error checking Shop & Scan availability: {e}")
            return False
    
    def start_trip(self, store_id: str) -> bool:
        """Start a new Shop & Scan trip at the specified store."""
        try:
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required for Shop & Scan")
            
            if self.current_trip and self.current_trip.status == "active":
                self.logger.warning("Trip already in progress. End current trip first.")
                return False
            
            url = urljoin(self.meijer.api_base_url, self.endpoints['start_trip'])
            headers = self.meijer._get_api_headers()
            headers.update({
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            })
            
            payload = {
                'storeId': store_id,
                'timestamp': datetime.now().isoformat()
            }
            
            response = self.meijer._make_request('POST', url, headers=headers, json=payload)
            
            if response.status_code in (200, 201):
                data = response.json()
                trip_id = data.get('tripId') or data.get('sessionId') or f"trip_{int(time.time())}"
                
                self.current_trip = ShopScanTrip(
                    trip_id=trip_id,
                    store_id=store_id,
                    started_at=datetime.now()
                )
                
                self.logger.info(f"Started Shop & Scan trip: {trip_id} at store {store_id}")
                return True
            else:
                self.logger.error(f"Failed to start trip: {response.status_code} - {response.text}")
                return False
                
        except Exception as e:
            self.logger.error(f"Error starting Shop & Scan trip: {e}")
            return False
    
    def scan_item(self, barcode: str, quantity: int = 1) -> Optional[ShopScanItem]:
        """Scan an item by barcode and add it to the cart."""
        try:
            if not self.current_trip:
                raise MeijerAPIError("No active Shop & Scan trip. Start a trip first.")
            
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")
            
            # First, lookup the item details
            item_data = self._lookup_item(barcode)
            if not item_data:
                self.logger.error(f"Failed to lookup item with barcode: {barcode}")
                return None
            
            # Add item to cart
            if self._add_to_cart(barcode, quantity, item_data):
                scanned_item = ShopScanItem(
                    barcode=barcode,
                    description=item_data.get('description', 'Unknown Item'),
                    price=float(item_data.get('price', 0.0)),
                    quantity=quantity,
                    item_id=item_data.get('itemId'),
                    timestamp=datetime.now()
                )
                
                self.current_trip.items.append(scanned_item)
                self.current_trip.total_amount += scanned_item.price * quantity
                
                self.logger.info(f"Scanned item: {scanned_item.description} (${scanned_item.price})")
                return scanned_item
            else:
                return None
                
        except Exception as e:
            self.logger.error(f"Error scanning item {barcode}: {e}")
            return None
    
    def finalize_checkout(self) -> Optional[Dict[str, Any]]:
        """Finalize the cart for checkout."""
        try:
            if not self.current_trip:
                raise MeijerAPIError("No active Shop & Scan trip")
            
            if not self.current_trip.items:
                raise MeijerAPIError("Cart is empty")
            
            if not self.meijer._ensure_authenticated():
                raise MeijerAuthenticationError("Authentication required")
            
            url = urljoin(self.meijer.api_base_url, self.endpoints['finalize'])
            headers = self.meijer._get_api_headers()
            headers.update({
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            })
            
            # Prepare checkout payload
            payload = {
                'tripId': self.current_trip.trip_id,
                'storeId': self.current_trip.store_id,
                'items': [
                    {
                        'barcode': item.barcode,
                        'quantity': item.quantity,
                        'price': item.price,
                        'itemId': item.item_id
                    }
                    for item in self.current_trip.items
                ],
                'totalAmount': self.current_trip.total_amount,
                'timestamp': datetime.now().isoformat()
            }
            
            response = self.meijer._make_request('POST', url, headers=headers, json=payload)
            
            if response.status_code in (200, 201):
                checkout_data = response.json()
                self.current_trip.status = "completed"
                
                self.logger.info(f"Checkout finalized for trip {self.current_trip.trip_id}")
                self.logger.info(f"Total amount: ${self.current_trip.total_amount:.2f}")
                
                return checkout_data
            else:
                self.logger.error(f"Checkout finalization failed: {response.status_code} - {response.text}")
                return None
                
        except Exception as e:
            self.logger.error(f"Error finalizing checkout: {e}")
            return None
    
    def get_cart(self) -> List[ShopScanItem]:
        """Get current cart contents."""
        if not self.current_trip:
            return []
        return self.current_trip.items.copy()
    
    def get_trip_summary(self) -> Optional[Dict[str, Any]]:
        """Get current trip summary."""
        if not self.current_trip:
            return None
        
        return {
            'trip_id': self.current_trip.trip_id,
            'store_id': self.current_trip.store_id,
            'started_at': self.current_trip.started_at.isoformat(),
            'status': self.current_trip.status,
            'item_count': len(self.current_trip.items),
            'total_amount': self.current_trip.total_amount,
            'items': [
                {
                    'barcode': item.barcode,
                    'description': item.description,
                    'price': item.price,
                    'quantity': item.quantity
                }
                for item in self.current_trip.items
            ]
        }
    
    def _lookup_item(self, barcode: str) -> Optional[Dict[str, Any]]:
        """Lookup item details by barcode."""
        try:
            url = urljoin(self.meijer.api_base_url, self.endpoints['scan_item'])
            headers = self.meijer._get_api_headers()
            headers.update({
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            })
            
            payload = {
                'barcode': barcode,
                'tripId': self.current_trip.trip_id,
                'storeId': self.current_trip.store_id
            }
            
            response = self.meijer._make_request('POST', url, headers=headers, json=payload)
            
            if response.status_code == 200:
                return response.json()
            else:
                self.logger.warning(f"Item lookup failed: {response.status_code}")
                return None
                
        except Exception as e:
            self.logger.error(f"Error looking up item: {e}")
            return None
    
    def _add_to_cart(self, barcode: str, quantity: int, item_data: Dict[str, Any]) -> bool:
        """Add item to Shop & Scan cart."""
        try:
            url = urljoin(self.meijer.api_base_url, self.endpoints['add_item'])
            headers = self.meijer._get_api_headers()
            headers.update({
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            })
            
            payload = {
                'tripId': self.current_trip.trip_id,
                'barcode': barcode,
                'quantity': quantity,
                'itemId': item_data.get('itemId'),
                'price': item_data.get('price')
            }
            
            response = self.meijer._make_request('POST', url, headers=headers, json=payload)
            return response.status_code in (200, 201)
            
        except Exception as e:
            self.logger.error(f"Error adding item to cart: {e}")
            return False


def extract_bearer_token_from_mitmproxy(log_file_path: str) -> Optional[Tuple[str, str, datetime]]:
    """
    Extract the last (most recent) Bearer token from a mitmproxy log file.
    
    Args:
        log_file_path: Path to the mitmproxy log file
        
    Returns:
        Tuple of (bearer_token, user_agent, timestamp) if found, None otherwise
    """
    if not MITMPROXY_AVAILABLE:
        logging.error("mitmproxy is not available. Install with: pip install mitmproxy")
        return None
    
    try:
        log_path = Path(log_file_path)
        if not log_path.exists():
            logging.error(f"Mitmproxy log file not found: {log_file_path}")
            return None
        
        logging.info(f"📂 Parsing mitmproxy log: {log_file_path}")
        
        bearer_tokens = []
        
        with open(log_path, 'rb') as f:
            reader = FlowReader(f)
            
            for flow_obj in reader.stream():
                try:
                    if isinstance(flow_obj, http.HTTPFlow):
                        request = flow_obj.request
                        
                        # Check if request is to meijer.com domain
                        if not _is_meijer_domain(request.pretty_host):
                            continue
                        
                        # Look for Authorization header with Bearer token
                        auth_header = request.headers.get('authorization', '')
                        if auth_header and auth_header.startswith('Bearer '):
                            bearer_token = auth_header[7:]  # Remove 'Bearer ' prefix
                            user_agent = request.headers.get('user-agent', '')
                            timestamp = datetime.fromtimestamp(flow_obj.timestamp_start)
                            
                            bearer_tokens.append({
                                'token': bearer_token,
                                'user_agent': user_agent,
                                'timestamp': timestamp,
                                'url': request.pretty_url
                            })
                            
                            logging.debug(f"Found Bearer token at {timestamp}: {bearer_token[:20]}...")
                
                except Exception as e:
                    logging.debug(f"Error processing flow: {e}")
                    continue
        
        if not bearer_tokens:
            logging.warning("No Bearer tokens found in mitmproxy log")
            return None
        
        # Sort by timestamp and get the most recent
        bearer_tokens.sort(key=lambda x: x['timestamp'])
        latest_token = bearer_tokens[-1]
        
        logging.info(f"✅ Found {len(bearer_tokens)} Bearer tokens, using latest from {latest_token['timestamp']}")
        logging.info(f"   URL: {latest_token['url']}")
        logging.info(f"   Token: {latest_token['token'][:20]}...")
        
        return (
            latest_token['token'],
            latest_token['user_agent'],
            latest_token['timestamp']
        )
        
    except Exception as e:
        logging.error(f"Error parsing mitmproxy log: {e}")
        return None


def _is_meijer_domain(host: str) -> bool:
    """Check if host is a Meijer domain."""
    meijer_domains = [
        'meijer.com',
        'api.meijer.com',
        'id.meijer.com',
        'mservices.meijer.com',
        'static.meijer.com'
    ]
    
    return any(domain in host.lower() for domain in meijer_domains)


def load_auth_from_config_file(config_file_path: str = None) -> Optional[Tuple[str, str]]:
    """
    Load authentication from .config/meijer.txt or specified file.
    
    Args:
        config_file_path: Optional path to config file, defaults to ~/.config/meijer.txt
        
    Returns:
        Tuple of (bearer_token, user_agent) if found, None otherwise
    """
    try:
        if config_file_path is None:
            # Use default ~/.config/meijer.txt
            home_dir = Path.home()
            config_file_path = home_dir / '.config' / 'meijer.txt'
        else:
            config_file_path = Path(config_file_path)
        
        if not config_file_path.exists():
            logging.debug(f"Config file not found: {config_file_path}")
            return None
        
        logging.info(f"📂 Loading auth from config: {config_file_path}")
        
        bearer_token = None
        user_agent = None
        
        with open(config_file_path, 'r') as f:
            for line in f:
                line = line.strip()
                if line.startswith('bearer=') or line.startswith('bearer_token='):
                    bearer_token = line.split('=', 1)[1]
                elif line.startswith('user_agent='):
                    user_agent = line.split('=', 1)[1]
        
        if bearer_token:
            if not user_agent:
                user_agent = "Meijer/101200000 okhttp/4.12.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)"
            
            logging.info(f"✅ Loaded bearer token from config: {bearer_token[:20]}...")
            return bearer_token, user_agent
        
        logging.warning(f"No bearer token found in config file: {config_file_path}")
        return None
        
    except Exception as e:
        logging.error(f"Error loading config file: {e}")
        return None


class Meijer:
    """
    Unified Meijer API client with all authentication methods and functionality.
    
    This client consolidates all working authentication approaches:
    - OAuth 2.0 with PKCE (interactive and programmatic)
    - Bearer token authentication (for extracted tokens)
    - Selenium-based automation (for full automation)
    - Persistent token storage (eliminates 2FA repeats)
    
    Features:
    - Complete Shop & Scan functionality
    - Shopping list management
    - Offers and coupons
    - Store locator
    - User profile management
    """
    
    def __init__(
        self,
        auth_file: str = "auth.txt",
        bearer_auth_file: str = "bearer_auth.txt",
        debug: bool = False,
        max_retries: int = 3,
        timeout: int = 30,
        token_storage_file: str = "meijer_tokens.pkl"
    ):
        """
        Initialize the unified Meijer client.
        
        Args:
            auth_file: Path to credentials file (username and password)
            bearer_auth_file: Path to bearer token file (extracted tokens)
            debug: Enable debug logging
            max_retries: Maximum number of retry attempts
            timeout: Request timeout in seconds
            token_storage_file: Path to token storage file
        """
        self.auth_file = auth_file
        self.bearer_auth_file = bearer_auth_file
        self.debug = debug
        self.max_retries = max_retries
        self.timeout = timeout
        
        # Setup logging
        self._setup_logging()
        
        # Initialize configuration
        self.oauth_config = OAuthConfig()
        self.api_base_url = "https://api.meijer.com"
        self.id_base_url = "https://id.meijer.com"
        
        # API subscription key from network analysis
        self.subscription_key = "a10bc58ac484478d9b3958b1742c3a03"
        
        # Authentication state
        self.auth_tokens: Optional[AuthTokens] = None
        self.auth_status = AuthenticationStatus.UNAUTHENTICATED
        self.user_info: Optional[UserInfo] = None
        
        # Token storage
        self.token_storage = TokenStorage(token_storage_file)
        
        # Session management
        self.session = self._create_session()
        
        # Load credentials if available
        self.credentials = self._load_credentials()
        
        # Initialize shopping list functionality
        self.list = MeijerList(self)
        
        # Initialize Shop & Scan functionality
        self.shop_scan = ShopNScan(self)
        
        # Try to restore authentication from stored tokens
        self._restore_authentication()
        
        self.logger.info("Unified Meijer client initialized")
    
    def _setup_logging(self) -> None:
        """Setup logging configuration."""
        level = logging.DEBUG if self.debug else logging.INFO
        format_str = '%(asctime)s - %(name)s - %(levelname)s - %(message)s'
        
        logging.basicConfig(level=level, format=format_str)
        self.logger = logging.getLogger(__name__)
    
    def _create_session(self) -> requests.Session:
        """Create and configure HTTP session."""
        session = requests.Session()
        
        # Configure retry strategy
        retry_strategy = Retry(
            total=self.max_retries,
            backoff_factor=1,
            status_forcelist=[429, 500, 502, 503, 504],
            allowed_methods=["HEAD", "GET", "POST", "PUT", "DELETE", "OPTIONS", "TRACE"]
        )
        adapter = HTTPAdapter(max_retries=retry_strategy)
        session.mount("http://", adapter)
        session.mount("https://", adapter)
        
        # Default headers based on network analysis
        session.headers.update({
            'User-Agent': 'Meijer/101200000 okhttp/4.12.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)',
            'Accept': 'application/json, text/plain, */*',
            'Accept-Language': 'en-US,en;q=0.9',
            'Accept-Encoding': 'gzip, deflate',
            'ocp-apim-subscription-key': self.subscription_key,
            'Connection': 'keep-alive'
        })
        
        session.timeout = self.timeout
        return session
    
    def _load_credentials(self) -> Optional[Dict[str, str]]:
        """Load credentials from auth file."""
        try:
            if not os.path.exists(self.auth_file):
                self.logger.info(f"No credentials file found: {self.auth_file}")
                return None
            
            credentials = {}
            with open(self.auth_file, 'r') as f:
                for line in f:
                    line = line.strip()
                    if '=' in line:
                        key, value = line.split('=', 1)
                        credentials[key.strip()] = value.strip()
            
            if 'username' in credentials and 'password' in credentials:
                self.logger.info("Loaded credentials from file")
                return credentials
            else:
                self.logger.warning("Invalid credentials file format")
                return None
                
        except Exception as e:
            self.logger.error(f"Error loading credentials: {e}")
            return None
    
    def _load_bearer_auth(self) -> Optional[Tuple[str, str]]:
        """Load bearer token from file."""
        try:
            if not os.path.exists(self.bearer_auth_file):
                return None
            
            bearer_token = None
            user_agent = None
            
            with open(self.bearer_auth_file, 'r') as f:
                for line in f:
                    line = line.strip()
                    if line.startswith('bearer_token=') or line.startswith('bearer='):
                        bearer_token = line.split('=', 1)[1]
                    elif line.startswith('user_agent='):
                        user_agent = line.split('=', 1)[1]
            
            if bearer_token:
                if not user_agent:
                    user_agent = "Meijer/101200000 okhttp/4.12.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)"
                return bearer_token, user_agent
            
            return None
                
        except Exception as e:
            self.logger.error(f"Error loading bearer auth: {e}")
            return None
    
    def _extract_from_mitmproxy_logs(self) -> Optional[Tuple[str, str, datetime]]:
        """
        Try to extract bearer token from various mitmproxy log files.
        
        Looks for log files in common locations and extracts the latest bearer token.
        
        Returns:
            Tuple of (bearer_token, user_agent, timestamp) if found, None otherwise
        """
        try:
            # Common mitmproxy log file names
            possible_log_files = [
                "meijer.log",
                "meijer2.log", 
                "mitmproxy.log",
                "mitmdump.log",
                "flows.log"
            ]
            
            # Also check for any .mitm files
            try:
                for file_path in Path('.').glob('*.mitm'):
                    possible_log_files.append(str(file_path))
            except:
                pass
            
            # Try each possible log file
            for log_file in possible_log_files:
                if os.path.exists(log_file):
                    self.logger.debug(f"🔍 Checking mitmproxy log: {log_file}")
                    result = extract_bearer_token_from_mitmproxy(log_file)
                    if result:
                        bearer_token, user_agent, timestamp = result
                        self.logger.info(f"✅ Found bearer token in {log_file} from {timestamp}")
                        return result
            
            self.logger.debug("No mitmproxy log files with bearer tokens found")
            return None
            
        except Exception as e:
            self.logger.error(f"Error extracting from mitmproxy logs: {e}")
            return None
    
    def _restore_authentication(self) -> bool:
        """Attempt to restore authentication from stored tokens."""
        try:
            stored_tokens = self.token_storage.load_tokens()
            if not stored_tokens:
                self.logger.info("No stored tokens found")
                return False
            
            if stored_tokens.is_expired():
                self.logger.info("Stored tokens are expired, attempting refresh")
                if stored_tokens.refresh_token:
                    return self.refresh_token()
                else:
                    self.logger.info("No refresh token available")
                    return False
            
            # Tokens are valid, restore session
            self.auth_tokens = stored_tokens
            self._update_session_auth()
            self.auth_status = AuthenticationStatus.AUTHENTICATED
            
            self.logger.info("✅ Authentication restored from stored tokens")
            return True
            
        except Exception as e:
            self.logger.error(f"Error restoring authentication: {e}")
            return False
    
    def _update_session_auth(self) -> None:
        """Update session with current authentication."""
        if self.auth_tokens:
            self.session.headers['Authorization'] = f'Bearer {self.auth_tokens.access_token}'
    
    def _ensure_authenticated(self) -> bool:
        """Ensure we have valid authentication."""
        if self.auth_status == AuthenticationStatus.AUTHENTICATED:
            if self.auth_tokens and not self.auth_tokens.is_expired():
                return True
            else:
                # Try to refresh
                if self.auth_tokens and self.auth_tokens.refresh_token:
                    return self.refresh_token()
        
        return False
    
    def _get_api_headers(self) -> Dict[str, str]:
        """Get standard API headers."""
        headers = {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'ocp-apim-subscription-key': self.subscription_key
        }
        
        if self.auth_tokens:
            headers['Authorization'] = f'Bearer {self.auth_tokens.access_token}'
        
        return headers
    
    def _make_request(self, method: str, url: str, **kwargs) -> requests.Response:
        """Make an HTTP request with error handling."""
        try:
            response = self.session.request(method, url, **kwargs)
            
            # Handle rate limiting
            if response.status_code == 429:
                retry_after = int(response.headers.get('Retry-After', 60))
                self.logger.warning(f"Rate limited, waiting {retry_after} seconds")
                time.sleep(retry_after)
                response = self.session.request(method, url, **kwargs)
            
            return response
            
        except Exception as e:
            self.logger.error(f"Request failed: {e}")
            raise MeijerAPIError(f"Request failed: {e}")
    
    def login(self) -> bool:
        """
        Unified login method that tries all available authentication methods.
        
        Authentication methods (in priority order):
        1. Username/Password (Selenium) - from auth.txt or specified file
        2. Bearer token - from auth.txt or specified file  
        3. Config file - ~/.config/meijer.txt bearer token
        4. Mitmproxy log - extract latest bearer token from log file
        5. Persistent tokens - restore from saved tokens (automatic)
        6. Interactive OAuth - manual browser authentication (fallback)
        """
        # First, try persistent tokens (if available)
        if self._restore_authentication():
            return True
        
        # Method 1: Username/Password authentication (Selenium)
        if self.credentials:
            username = self.credentials.get('username') or self.credentials.get('user')
            password = self.credentials.get('password') or self.credentials.get('pass')
            if username and password:
                self.logger.info("🔐 Attempting username/password authentication (Selenium)")
                if self.authenticate_with_credentials(username, password):
                    return True
                else:
                    self.logger.warning("⚠️ Username/password authentication failed (OKTA issues)")
        
        # Method 2: Bearer token from auth file
        bearer_auth = self._load_bearer_auth()
        if bearer_auth:
            bearer_token, user_agent = bearer_auth
            self.logger.info("🎫 Attempting bearer token authentication from auth file")
            if self.authenticate_with_bearer_token(bearer_token, user_agent):
                return True
        
        # Method 3: Bearer token from ~/.config/meijer.txt
        config_auth = load_auth_from_config_file()
        if config_auth:
            bearer_token, user_agent = config_auth
            self.logger.info("🎫 Attempting bearer token authentication from config file")
            if self.authenticate_with_bearer_token(bearer_token, user_agent):
                return True
        
        # Method 4: Extract bearer token from mitmproxy log
        mitmproxy_auth = self._extract_from_mitmproxy_logs()
        if mitmproxy_auth:
            bearer_token, user_agent, timestamp = mitmproxy_auth
            self.logger.info(f"🎫 Attempting bearer token authentication from mitmproxy log (from {timestamp})")
            if self.authenticate_with_bearer_token(bearer_token, user_agent):
                return True
        
        # Fallback: Interactive authentication
        self.logger.info("🌐 No automatic authentication methods available, falling back to interactive OAuth")
        return self.authenticate_interactive()
    
    def authenticate_with_bearer_token(self, bearer_token: str, user_agent: str = None) -> bool:
        """Authenticate using a pre-extracted Bearer token."""
        try:
            self.logger.info("🎫 Authenticating with Bearer token")
            
            # Create tokens from bearer token
            self.auth_tokens = AuthTokens.from_bearer_token(bearer_token)
            
            # Update session headers
            self.session.headers.update({
                'Authorization': f'Bearer {bearer_token}',
                'ocp-apim-subscription-key': self.subscription_key
            })
            
            if user_agent:
                self.session.headers['User-Agent'] = user_agent
            
            # Test the token with a simple API call
            test_url = f"{self.api_base_url}/loyalty/shoppinglist/GetList"
            response = self._make_request('GET', test_url)
            
            if response.status_code == 200:
                self.logger.info("✅ Bearer token authentication successful")
                self.auth_status = AuthenticationStatus.AUTHENTICATED
                self.token_storage.save_tokens(self.auth_tokens)
                return True
            elif response.status_code == 401:
                self.logger.error("❌ Bearer token is expired or invalid")
                self.auth_status = AuthenticationStatus.UNAUTHENTICATED
                return False
            else:
                self.logger.warning(f"⚠️ Unexpected response: {response.status_code}")
                return False
                
        except Exception as e:
            self.logger.error(f"❌ Bearer token authentication failed: {e}")
            self.auth_status = AuthenticationStatus.UNAUTHENTICATED
            return False
    
    def authenticate_interactive(self) -> bool:
        """Interactive OAuth 2.0 authentication."""
        try:
            self.logger.info("🔐 Starting interactive OAuth authentication")
            
            # Generate PKCE parameters
            code_verifier = base64.urlsafe_b64encode(secrets.token_bytes(32)).decode('utf-8').rstrip('=')
            code_challenge = base64.urlsafe_b64encode(
                hashlib.sha256(code_verifier.encode('utf-8')).digest()
            ).decode('utf-8').rstrip('=')
            
            state = secrets.token_urlsafe(32)
            
            # Build authorization URL
            auth_params = {
                'client_id': self.oauth_config.client_id,
                'response_type': self.oauth_config.response_type,
                'scope': self.oauth_config.scope,
                'redirect_uri': self.oauth_config.redirect_uri,
                'state': state,
                'code_challenge': code_challenge,
                'code_challenge_method': self.oauth_config.code_challenge_method
            }
            
            auth_url = f"{self.oauth_config.auth_url}?{urlencode(auth_params)}"
            
            self.logger.info("🌐 Opening browser for authorization...")
            webbrowser.open(auth_url)
            
            print(f"\n🔗 Authorization URL: {auth_url}")
            print("\n📋 Please complete authorization in your browser and paste the full redirect URL here:")
            redirect_url = input("Redirect URL: ").strip()
            
            # Extract authorization code
            parsed_url = urlparse(redirect_url)
            query_params = parse_qs(parsed_url.query)
            
            if 'code' not in query_params:
                self.logger.error("❌ No authorization code found in redirect URL")
                return False
            
            auth_code = query_params['code'][0]
            return self.authenticate_with_code(auth_code, code_verifier)
            
        except Exception as e:
            self.logger.error(f"❌ Interactive authentication failed: {e}")
            return False
    
    def authenticate_with_code(self, authorization_code: str, code_verifier: str = None) -> bool:
        """Exchange authorization code for access tokens."""
        try:
            self.logger.info("🔄 Exchanging authorization code for tokens")
            
            # If no code_verifier provided, assume it was stored or generate new one
            if not code_verifier:
                code_verifier = base64.urlsafe_b64encode(secrets.token_bytes(32)).decode('utf-8').rstrip('=')
            
            # Prepare token request
            token_data = {
                'grant_type': 'authorization_code',
                'client_id': self.oauth_config.client_id,
                'code': authorization_code,
                'redirect_uri': self.oauth_config.redirect_uri,
                'code_verifier': code_verifier
            }
            
            # Exchange code for tokens
            response = self.session.post(
                self.oauth_config.token_url,
                data=token_data,
                headers={'Content-Type': 'application/x-www-form-urlencoded'}
            )
            
            if response.status_code == 200:
                token_response = response.json()
                self.auth_tokens = AuthTokens.from_response(token_response)
                self._update_session_auth()
                self.auth_status = AuthenticationStatus.AUTHENTICATED
                
                # Save tokens for future use
                self.token_storage.save_tokens(self.auth_tokens)
                
                self.logger.info("✅ Token exchange successful")
                return True
            else:
                self.logger.error(f"❌ Token exchange failed: {response.status_code} - {response.text}")
                return False
                
        except Exception as e:
            self.logger.error(f"❌ Code authentication failed: {e}")
            return False
    
    def authenticate_with_credentials(self, username: str, password: str) -> bool:
        """Authenticate using username/password with Selenium automation."""
        try:
            if not SELENIUM_AVAILABLE:
                self.logger.error("❌ Selenium not available for credential authentication")
                return False
            
            self.logger.info("🤖 Starting automated credential authentication")
            
            # Generate PKCE parameters
            code_verifier = base64.urlsafe_b64encode(secrets.token_bytes(32)).decode('utf-8').rstrip('=')
            code_challenge = base64.urlsafe_b64encode(
                hashlib.sha256(code_verifier.encode('utf-8')).digest()
            ).decode('utf-8').rstrip('=')
            
            state = secrets.token_urlsafe(32)
            
            # Build authorization URL
            auth_params = {
                'client_id': self.oauth_config.client_id,
                'response_type': self.oauth_config.response_type,
                'scope': self.oauth_config.scope,
                'redirect_uri': self.oauth_config.redirect_uri,
                'state': state,
                'code_challenge': code_challenge,
                'code_challenge_method': self.oauth_config.code_challenge_method
            }
            
            auth_url = f"{self.oauth_config.auth_url}?{urlencode(auth_params)}"
            
            # Use Selenium to automate login
            selenium_auth = SeleniumAuth(username, password, headless=True)
            auth_code = selenium_auth.authenticate(auth_url)
            
            if auth_code:
                return self.authenticate_with_code(auth_code, code_verifier)
            else:
                self.logger.error("❌ Failed to extract authorization code via Selenium")
                return False
                
        except Exception as e:
            self.logger.error(f"❌ Credential authentication failed: {e}")
            return False
    
    def refresh_token(self) -> bool:
        """Refresh access token using refresh token."""
        try:
            if not self.auth_tokens or not self.auth_tokens.refresh_token:
                self.logger.error("❌ No refresh token available")
                return False
            
            self.logger.info("🔄 Refreshing access token")
            self.auth_status = AuthenticationStatus.REFRESHING
            
            # Prepare refresh request
            refresh_data = {
                'grant_type': 'refresh_token',
                'client_id': self.oauth_config.client_id,
                'refresh_token': self.auth_tokens.refresh_token
            }
            
            response = self.session.post(
                self.oauth_config.token_url,
                data=refresh_data,
                headers={'Content-Type': 'application/x-www-form-urlencoded'}
            )
            
            if response.status_code == 200:
                token_response = response.json()
                
                # Update tokens
                self.auth_tokens.access_token = token_response['access_token']
                self.auth_tokens.expires_in = token_response.get('expires_in', 3600)
                self.auth_tokens.expires_at = datetime.now() + timedelta(seconds=self.auth_tokens.expires_in)
                
                # Update refresh token if provided
                if 'refresh_token' in token_response:
                    self.auth_tokens.refresh_token = token_response['refresh_token']
                
                self._update_session_auth()
                self.auth_status = AuthenticationStatus.AUTHENTICATED
                
                # Save updated tokens
                self.token_storage.save_tokens(self.auth_tokens)
                
                self.logger.info("✅ Token refresh successful")
                return True
            else:
                self.logger.error(f"❌ Token refresh failed: {response.status_code} - {response.text}")
                self.auth_status = AuthenticationStatus.EXPIRED
                return False
                
        except Exception as e:
            self.logger.error(f"❌ Token refresh error: {e}")
            self.auth_status = AuthenticationStatus.EXPIRED
            return False
    
    def logout(self) -> None:
        """Logout and clear authentication state."""
        self.auth_tokens = None
        self.auth_status = AuthenticationStatus.UNAUTHENTICATED
        self.user_info = None
        
        # Clear stored tokens
        self.token_storage.clear_tokens()
        
        # Clear session auth
        if 'Authorization' in self.session.headers:
            del self.session.headers['Authorization']
        
        self.logger.info("🚪 Logged out successfully")
    
    def get_session_info(self) -> Dict[str, Any]:
        """Get current session information."""
        return {
            'authenticated': self.auth_status == AuthenticationStatus.AUTHENTICATED,
            'status': self.auth_status.value,
            'has_tokens': self.auth_tokens is not None,
            'has_stored_tokens': self.token_storage.has_tokens(),
            'has_refresh_token': self.auth_tokens.refresh_token if self.auth_tokens else False,
            'token_expires_at': self.auth_tokens.expires_at.isoformat() if self.auth_tokens else None,
            'user_info': self.user_info
        }
    
    # API Methods
    def get_offers(self, limit: int = 50) -> List[Dict[str, Any]]:
        """Get available offers."""
        if not self._ensure_authenticated():
            raise MeijerAuthenticationError("Authentication required")
        
        url = f"{self.api_base_url}/loyalty/offers"
        headers = self._get_api_headers()
        
        params = {'limit': limit}
        response = self._make_request('GET', url, headers=headers, params=params)
        
        if response.status_code == 200:
            return response.json().get('offers', [])
        else:
            raise MeijerAPIError(f"Failed to get offers: {response.status_code}")
    
    def get_stores(self, zip_code: str = None, radius: int = 25) -> List[Dict[str, Any]]:
        """Get store information."""
        url = f"{self.api_base_url}/stores"
        headers = self._get_api_headers()
        
        params = {}
        if zip_code:
            params['zip'] = zip_code
        if radius:
            params['radius'] = radius
        
        response = self._make_request('GET', url, headers=headers, params=params)
        
        if response.status_code == 200:
            return response.json().get('stores', [])
        else:
            raise MeijerAPIError(f"Failed to get stores: {response.status_code}")
    
    def get_user_info(self) -> Optional[UserInfo]:
        """Get user profile information."""
        if not self._ensure_authenticated():
            return None
        
        try:
            url = f"{self.api_base_url}/profile/user"
            headers = self._get_api_headers()
            
            response = self._make_request('GET', url, headers=headers)
            
            if response.status_code == 200:
                user_data = response.json()
                self.user_info = UserInfo.from_dict(user_data)
                return self.user_info
            else:
                self.logger.warning(f"Failed to get user info: {response.status_code}")
                return None
                
        except Exception as e:
            self.logger.error(f"Error getting user info: {e}")
            return None
    
    def __enter__(self):
        """Context manager entry."""
        return self
    
    def __exit__(self, exc_type, exc_val, exc_tb):
        """Context manager exit."""
        self.logout()
        self.session.close()


def main() -> None:
    """Example usage of the unified Meijer client."""
    logging.basicConfig(level=logging.INFO)
    
    # Create unified Meijer client
    with Meijer(debug=True) as meijer:
        try:
            # Login using any available method
            print("🔐 Attempting login...")
            if meijer.login():
                print("✅ Login successful!")
                
                # Show session info
                session_info = meijer.get_session_info()
                print(f"📊 Session: {session_info['status']}")
                
                # Test shopping list
                print("\n📝 Testing shopping list...")
                print(f"Current items: {meijer.list.count}")
                
                # Test Shop & Scan
                print("\n🛒 Testing Shop & Scan...")
                if meijer.shop_scan.is_enabled():
                    print("✅ Shop & Scan is available")
                    
                    # Start trip
                    if meijer.shop_scan.start_trip("52"):
                        print("✅ Trip started")
                        
                        # Show trip summary
                        summary = meijer.shop_scan.get_trip_summary()
                        print(f"📋 Trip: {summary['trip_id']}")
                else:
                    print("❌ Shop & Scan not available")
                
                # Test other APIs
                print("\n📦 Testing other APIs...")
                try:
                    stores = meijer.get_stores(radius=10)
                    print(f"🏪 Found {len(stores)} stores")
                    
                    offers = meijer.get_offers(limit=5)
                    print(f"🎟️ Found {len(offers)} offers")
                    
                except Exception as e:
                    print(f"⚠️ API test failed: {e}")
                
            else:
                print("❌ Login failed!")
                print("💡 Try creating these files:")
                print("   - auth.txt (username=xxx\\npassword=yyy)")
                print("   - bearer_auth.txt (bearer_token=xxx\\nuser_agent=yyy)")
                
        except Exception as e:
            print(f"❌ Error: {e}")


if __name__ == "__main__":
    main() 