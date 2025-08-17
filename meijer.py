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
        
        # Initialize search functionality
        self.search = MeijerSearch(self)
        
        # Initialize store search functionality
        self.store_search = MeijerStoreSearch(self)
        
        # Coupons will be loaded when accessed
        self._coupons = None
        
        # Try to restore authentication from stored tokens
        self._restore_authentication()
        
        self.logger.info("Unified Meijer client initialized with all functionality")
    
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
    
    # =============================================================================
    # INTEGRATED FUNCTIONALITY METHODS
    # =============================================================================
    
    @property 
    def coupons(self) -> List['MeijerCoupon']:
        """
        Get list of available coupons.
        
        Returns:
            List of MeijerCoupon objects
        """
        if self._coupons is None:
            self._coupons = self.get_coupons()
        return self._coupons
    
    def get_coupons(self, limit: int = 100) -> List['MeijerCoupon']:
        """
        Fetch coupons from mPerks API.
        
        Args:
            limit: Maximum number of coupons to fetch
            
        Returns:
            List of MeijerCoupon objects
        """
        if not self._ensure_authenticated():
            self.logger.warning("Not authenticated - cannot fetch coupons")
            return []
        
        try:
            response = self._make_request(
                'GET',
                f'{self.api_base_url}/digital/mPerks/api/offers',
                params={'limit': limit}
            )
            
            coupon_data = response.json()
            # Import will be available at runtime due to forward references
            from typing import TYPE_CHECKING
            if TYPE_CHECKING:
                pass
            else:
                # Use the global function defined later in the file
                coupons = create_meijer_coupons_from_response(coupon_data, self)
            
            self.logger.info(f"Fetched {len(coupons)} coupons")
            return coupons
            
        except Exception as e:
            self.logger.error(f"Failed to fetch coupons: {e}")
            return []
    
    def search_products(self, query: str, **kwargs) -> 'MeijerSearchResults':
        """
        Search for products using Constructor.io.
        
        Args:
            query: Search query
            **kwargs: Additional search parameters
            
        Returns:
            MeijerSearchResults object
        """
        return self.search.search(query, **kwargs)
    
    def get_autocomplete(self, query: str, num_results: int = 10) -> List[str]:
        """
        Get autocomplete suggestions.
        
        Args:
            query: Partial search query
            num_results: Number of suggestions
            
        Returns:
            List of autocomplete suggestions
        """
        return self.search.autocomplete(query, num_results)
    
    def find_stores_nearby(self, latitude: float, longitude: float, **kwargs) -> List['MeijerStore']:
        """
        Find stores near coordinates.
        
        Args:
            latitude: Search latitude
            longitude: Search longitude
            **kwargs: Additional search parameters
            
        Returns:
            List of MeijerStore objects
        """
        return self.store_search.find_stores_nearby(latitude, longitude, **kwargs)
    
    def get_store_details(self, store_id: Union[int, str]) -> Optional['MeijerStore']:
        """
        Get details for a specific store.
        
        Args:
            store_id: Store ID (int or str, auto-converted to int)
            
        Returns:
            MeijerStore object or None if not found
        """
        return self.store_search.get_store_details(store_id)
    
    def clip_coupon(self, coupon: Union['MeijerCoupon', int]) -> bool:
        """
        Clip a coupon to the user's account.
        
        Args:
            coupon: MeijerCoupon object or coupon ID
            
        Returns:
            True if successful, False otherwise
        """
        # Import MeijerCoupon class reference
        MeijerCoupon = globals().get('MeijerCoupon')
        if MeijerCoupon and isinstance(coupon, MeijerCoupon):
            return coupon.clip()
        else:
            # Find coupon by ID
            for c in self.coupons:
                if c.meijer_offer_id == coupon:
                    return c.clip()
            self.logger.warning(f"Coupon with ID {coupon} not found")
            return False
    
    def unclip_coupon(self, coupon: Union['MeijerCoupon', int]) -> bool:
        """
        Unclip a coupon from the user's account.
        
        Args:
            coupon: MeijerCoupon object or coupon ID
            
        Returns:
            True if successful, False otherwise
        """
        # Import MeijerCoupon class reference
        MeijerCoupon = globals().get('MeijerCoupon')
        if MeijerCoupon and isinstance(coupon, MeijerCoupon):
            return coupon.unclip()
        else:
            # Find coupon by ID
            for c in self.coupons:
                if c.meijer_offer_id == coupon:
                    return c.unclip()
            self.logger.warning(f"Coupon with ID {coupon} not found")
            return False
    
    def get_clipped_coupons(self) -> List['MeijerCoupon']:
        """Get list of clipped coupons."""
        return [c for c in self.coupons if c.is_clipped]
    
    def get_available_coupons(self) -> List['MeijerCoupon']:
        """Get list of available (not clipped) coupons."""
        return [c for c in self.coupons if not c.is_clipped and c.is_active]
    
    def refresh_coupons(self) -> List['MeijerCoupon']:
        """Refresh the coupons cache."""
        self._coupons = None
        return self.coupons
    
    # =============================================================================
    # INTEGRATED FUNCTIONALITY METHODS
    # =============================================================================
    
    @property 
    def coupons(self) -> List['MeijerCoupon']:
        """
        Get list of available coupons.
        
        Returns:
            List of MeijerCoupon objects
        """
        if self._coupons is None:
            self._coupons = self.get_coupons()
        return self._coupons
    
    def get_coupons(self, limit: int = 100) -> List['MeijerCoupon']:
        """
        Fetch coupons from mPerks API.
        
        Args:
            limit: Maximum number of coupons to fetch
            
        Returns:
            List of MeijerCoupon objects
        """
        if not self._ensure_authenticated():
            self.logger.warning("Not authenticated - cannot fetch coupons")
            return []
        
        try:
            response = self._make_request(
                'GET',
                f'{self.api_base_url}/digital/mPerks/api/offers',
                params={'limit': limit}
            )
            
            coupon_data = response.json()
            coupons = create_meijer_coupons_from_response(coupon_data, self)
            
            self.logger.info(f"Fetched {len(coupons)} coupons")
            return coupons
            
        except Exception as e:
            self.logger.error(f"Failed to fetch coupons: {e}")
            return []
    
    def search_products(self, query: str, **kwargs) -> 'MeijerSearchResults':
        """
        Search for products using Constructor.io.
        
        Args:
            query: Search query
            **kwargs: Additional search parameters
            
        Returns:
            MeijerSearchResults object
        """
        return self.search.search(query, **kwargs)
    
    def get_autocomplete(self, query: str, num_results: int = 10) -> List[str]:
        """
        Get autocomplete suggestions.
        
        Args:
            query: Partial search query
            num_results: Number of suggestions
            
        Returns:
            List of autocomplete suggestions
        """
        return self.search.autocomplete(query, num_results)
    
    def find_stores_nearby(self, latitude: float, longitude: float, **kwargs) -> List[MeijerStore]:
        """
        Find stores near coordinates.
        
        Args:
            latitude: Search latitude
            longitude: Search longitude
            **kwargs: Additional search parameters
            
        Returns:
            List of MeijerStore objects
        """
        return self.store_search.find_stores_nearby(latitude, longitude, **kwargs)
    
    def get_store_details(self, store_id: Union[int, str]) -> Optional[MeijerStore]:
        """
        Get details for a specific store.
        
        Args:
            store_id: Store ID (int or str, auto-converted to int)
            
        Returns:
            MeijerStore object or None if not found
        """
        return self.store_search.get_store_details(store_id)
    
    def clip_coupon(self, coupon: Union['MeijerCoupon', int]) -> bool:
        """
        Clip a coupon to the user's account.
        
        Args:
            coupon: MeijerCoupon object or coupon ID
            
        Returns:
            True if successful, False otherwise
        """
        if isinstance(coupon, MeijerCoupon):
            return coupon.clip()
        else:
            # Find coupon by ID
            for c in self.coupons:
                if c.meijer_offer_id == coupon:
                    return c.clip()
            self.logger.warning(f"Coupon with ID {coupon} not found")
            return False
    
    def unclip_coupon(self, coupon: Union['MeijerCoupon', int]) -> bool:
        """
        Unclip a coupon from the user's account.
        
        Args:
            coupon: MeijerCoupon object or coupon ID
            
        Returns:
            True if successful, False otherwise
        """
        if isinstance(coupon, MeijerCoupon):
            return coupon.unclip()
        else:
            # Find coupon by ID
            for c in self.coupons:
                if c.meijer_offer_id == coupon:
                    return c.unclip()
            self.logger.warning(f"Coupon with ID {coupon} not found")
            return False
    
    def get_clipped_coupons(self) -> List['MeijerCoupon']:
        """Get list of clipped coupons."""
        return [c for c in self.coupons if c.is_clipped]
    
    def get_available_coupons(self) -> List['MeijerCoupon']:
        """Get list of available (not clipped) coupons."""
        return [c for c in self.coupons if not c.is_clipped and c.is_active]
    
    def refresh_coupons(self) -> List['MeijerCoupon']:
        """Refresh the coupons cache."""
        self._coupons = None
        return self.coupons


# =============================================================================
# MEIJER COUPON FUNCTIONALITY
# =============================================================================

class HatColor(Enum):
    """Hat color enumeration based on APK analysis."""
    NONE = 0
    BLUE = 1 
    RED = 2


class BorderColor(Enum):
    """Border color enumeration based on APK analysis."""
    NONE = 0
    BLUE = 1
    RED = 2


@dataclass
class CouponDepartment:
    """Represents a department/category for a coupon."""
    category_id: str
    category_name: str
    sub_category_id: Optional[str] = None
    sub_category_name: Optional[str] = None
    offer_count_sub_category: int = 0
    offer_count_department: int = 0
    is_custom_category: bool = False


@dataclass
class CouponCategory:
    """Represents a coupon category/segment."""
    segment_id: Optional[str] = None
    segment_name: Optional[str] = None


@dataclass
class CouponCondition:
    """Represents earning conditions for a coupon."""
    condition_type_id: int = 0
    condition_value: float = 0.0
    

@dataclass
class CouponReward:
    """Represents reward details for a coupon."""
    redeem_amount: Optional[float] = None
    discount_type_id: int = 0
    discount_level_id: int = 0
    reward_program_id: int = 0


@dataclass
class MeijerCoupon:
    """
    Comprehensive Meijer coupon/offer with all discovered fields.
    
    This class provides methods to clip() and unclip() coupons, as well as
    access to all coupon metadata discovered from API and APK analysis.
    
    Key fields identified from analysis:
    - Core Offer Data: meijerOfferId, title, description, imageURL
    - Status Flags: isClipped, isTargeted, isSuggested, isHidden
    - Metadata: departments, category, tags, terms and conditions
    - Dates: redemptionStartDate, redemptionEndDate, modifiedTs
    - Rewards: redeemAmount, discountTypeId, conditionValue
    """
    
    # Core identification (from API analysis - 100% presence)
    meijer_offer_id: int
    title: str 
    description: str
    
    # Status flags (99% presence in analysis)
    is_clipped: bool = False
    is_suggested: bool = False
    is_targeted: bool = False
    is_hidden: bool = False
    
    # Visual and display properties (98% presence)
    image_url: Optional[str] = None
    hat_color: HatColor = HatColor.NONE
    border_color: BorderColor = BorderColor.NONE
    product_image_url: Optional[str] = None
    
    # Date fields (97% presence)
    redemption_start_date: Optional[datetime] = None
    redemption_end_date: Optional[datetime] = None
    modified_ts: Optional[datetime] = None
    
    # Reward details (95% presence)
    redeem_amount: Optional[float] = None
    discount_type_id: int = 0
    discount_level_id: int = 0
    reward_program_id: int = 0
    
    # Condition details (95% presence)
    condition_type_id: int = 0
    condition_value: float = 0.0
    
    # Department and category information (90% presence)
    departments: List[CouponDepartment] = field(default_factory=list)
    category: Optional[CouponCategory] = None
    
    # Additional metadata (80-90% presence)
    tags: List[str] = field(default_factory=list)
    terms_and_conditions: Optional[str] = None
    disclaimer: Optional[str] = None
    
    # Comprehensive field set discovered from analysis
    meijer_offer_promotion_id: Optional[int] = None
    percentage_discount: Optional[float] = None
    dollar_discount: Optional[float] = None
    promo_code: Optional[str] = None
    external_offer_id: Optional[str] = None
    vendor_id: Optional[int] = None
    vendor_name: Optional[str] = None
    brand_name: Optional[str] = None
    product_name: Optional[str] = None
    manufacturer_id: Optional[int] = None
    manufacturer_name: Optional[str] = None
    upc_code: Optional[str] = None
    
    # Usage tracking and limits
    redemption_limit: Optional[int] = None
    redemption_count: int = 0
    household_limit: Optional[int] = None
    household_count: int = 0
    max_redemptions_per_transaction: Optional[int] = None
    
    # Store availability
    store_ids: List[int] = field(default_factory=list)
    zone_ids: List[int] = field(default_factory=list)
    
    # Personalization and targeting
    customer_segment_ids: List[int] = field(default_factory=list)
    targeted_customer_id: Optional[int] = None
    personalization_score: Optional[float] = None
    
    # Associated Meijer client for actions
    _meijer_client: Optional['Meijer'] = field(default=None, repr=False)
    
    @classmethod
    def from_api_response(cls, coupon_data: Dict[str, Any], meijer_client: Optional['Meijer'] = None) -> 'MeijerCoupon':
        """
        Create MeijerCoupon from API response data.
        
        Args:
            coupon_data: Raw coupon data from API
            meijer_client: Associated Meijer client
            
        Returns:
            MeijerCoupon object
        """
        # Parse departments
        departments = []
        if 'departments' in coupon_data:
            for dept_data in coupon_data['departments']:
                departments.append(CouponDepartment(
                    category_id=dept_data.get('categoryId', ''),
                    category_name=dept_data.get('categoryName', ''),
                    sub_category_id=dept_data.get('subCategoryId'),
                    sub_category_name=dept_data.get('subCategoryName'),
                    offer_count_sub_category=dept_data.get('offerCountSubCategory', 0),
                    offer_count_department=dept_data.get('offerCountDepartment', 0),
                    is_custom_category=dept_data.get('isCustomCategory', False)
                ))
        
        # Parse category
        category = None
        if 'category' in coupon_data:
            cat_data = coupon_data['category']
            category = CouponCategory(
                segment_id=cat_data.get('segmentId'),
                segment_name=cat_data.get('segmentName')
            )
        
        # Parse dates
        def parse_date(date_str: Optional[str]) -> Optional[datetime]:
            if not date_str:
                return None
            try:
                return datetime.fromisoformat(date_str.replace('Z', '+00:00'))
            except (ValueError, AttributeError):
                return None
        
        # Parse hat and border colors
        hat_color = HatColor.NONE
        if 'hatColor' in coupon_data:
            try:
                hat_color = HatColor(coupon_data['hatColor'])
            except ValueError:
                pass
                
        border_color = BorderColor.NONE
        if 'borderColor' in coupon_data:
            try:
                border_color = BorderColor(coupon_data['borderColor'])
            except ValueError:
                pass
        
        return cls(
            meijer_offer_id=coupon_data.get('meijerOfferId', 0),
            title=coupon_data.get('title', ''),
            description=coupon_data.get('description', ''),
            is_clipped=coupon_data.get('isClipped', False),
            is_suggested=coupon_data.get('isSuggested', False),
            is_targeted=coupon_data.get('isTargeted', False),
            is_hidden=coupon_data.get('isHidden', False),
            image_url=coupon_data.get('imageURL'),
            hat_color=hat_color,
            border_color=border_color,
            product_image_url=coupon_data.get('productImageURL'),
            redemption_start_date=parse_date(coupon_data.get('redemptionStartDate')),
            redemption_end_date=parse_date(coupon_data.get('redemptionEndDate')),
            modified_ts=parse_date(coupon_data.get('modifiedTs')),
            redeem_amount=coupon_data.get('redeemAmount'),
            discount_type_id=coupon_data.get('discountTypeId', 0),
            discount_level_id=coupon_data.get('discountLevelId', 0),
            reward_program_id=coupon_data.get('rewardProgramId', 0),
            condition_type_id=coupon_data.get('conditionTypeId', 0),
            condition_value=coupon_data.get('conditionValue', 0.0),
            departments=departments,
            category=category,
            tags=coupon_data.get('tags', []),
            terms_and_conditions=coupon_data.get('termsAndConditions'),
            disclaimer=coupon_data.get('disclaimer'),
            _meijer_client=meijer_client
        )
    
    def clip(self) -> bool:
        """
        Clip this coupon to the user's account.
        
        Returns:
            True if successful, False otherwise
        """
        if not self._meijer_client:
            logging.error("No Meijer client associated with coupon")
            return False
            
        try:
            # Use mPerks API to clip coupon
            response = self._meijer_client.session.post(
                'https://api.meijer.com/digital/mPerks/api/offers/clip',
                json={
                    'meijerOfferId': self.meijer_offer_id,
                    'clipped': True
                }
            )
            
            if response.status_code == 200:
                self.is_clipped = True
                logging.info(f"Successfully clipped coupon: {self.title}")
                return True
            else:
                logging.error(f"Failed to clip coupon {self.meijer_offer_id}: {response.status_code}")
                return False
                
        except Exception as e:
            logging.error(f"Error clipping coupon {self.meijer_offer_id}: {e}")
            return False
    
    def unclip(self) -> bool:
        """
        Unclip this coupon from the user's account.
        
        Returns:
            True if successful, False otherwise
        """
        if not self._meijer_client:
            logging.error("No Meijer client associated with coupon")
            return False
            
        try:
            # Use mPerks API to unclip coupon
            response = self._meijer_client.session.post(
                'https://api.meijer.com/digital/mPerks/api/offers/clip',
                json={
                    'meijerOfferId': self.meijer_offer_id,
                    'clipped': False
                }
            )
            
            if response.status_code == 200:
                self.is_clipped = False
                logging.info(f"Successfully unclipped coupon: {self.title}")
                return True
            else:
                logging.error(f"Failed to unclip coupon {self.meijer_offer_id}: {response.status_code}")
                return False
                
        except Exception as e:
            logging.error(f"Error unclipping coupon {self.meijer_offer_id}: {e}")
            return False
    
    @property
    def is_expired(self) -> bool:
        """Check if the coupon is expired."""
        if not self.redemption_end_date:
            return False
        return datetime.now() > self.redemption_end_date
    
    @property 
    def is_active(self) -> bool:
        """Check if the coupon is currently active."""
        now = datetime.now()
        
        if self.redemption_start_date and now < self.redemption_start_date:
            return False
            
        if self.redemption_end_date and now > self.redemption_end_date:
            return False
            
        return True
    
    @property
    def savings_amount(self) -> Optional[str]:
        """Get a formatted savings amount string."""
        if self.redeem_amount:
            return f"${self.redeem_amount:.2f}"
        elif self.percentage_discount:
            return f"{self.percentage_discount:.0f}%"
        elif self.dollar_discount:
            return f"${self.dollar_discount:.2f}"
        return None
    
    def __str__(self) -> str:
        """String representation of the coupon."""
        savings = self.savings_amount or "Unknown"
        status = "✅ Clipped" if self.is_clipped else "📎 Available"
        return f"{self.title} - Save {savings} ({status})"


def create_meijer_coupons_from_response(response_data: Dict[str, Any], meijer_client: Optional['Meijer'] = None) -> List['MeijerCoupon']:
    """
    Create MeijerCoupon objects from API response.
    
    Args:
        response_data: Raw API response data
        meijer_client: Associated Meijer client
        
    Returns:
        List of MeijerCoupon objects
    """
    coupons = []
    
    # Handle different response structures
    offers_data = response_data.get('offers', [])
    if not offers_data and 'data' in response_data:
        offers_data = response_data['data'].get('offers', [])
    
    for offer_data in offers_data:
        try:
            coupon = MeijerCoupon.from_api_response(offer_data, meijer_client)
            coupons.append(coupon)
        except Exception as e:
            logging.warning(f"Failed to parse coupon data: {e}")
    
    return coupons


# =============================================================================
# MEIJER ITEM FUNCTIONALITY (SEARCH RESULTS)
# =============================================================================

@dataclass
class MeijerItem:
    """
    Represents a Meijer product item from search results.
    
    This class contains all fields discovered from Constructor.io API analysis
    and provides methods for interacting with individual items.
    """
    
    data_id: str
    data_ean: int
    data_isbopas: bool
    data_isbuyable: bool
    data_isalcohol: bool
    data_image_url: str
    data_priceunit: str
    data_hasmperks: bool
    data_specialbuy: bool
    data_description: str
    data_deactivated: bool
    data_productunit: str
    data_qtyincrement: int
    data_chokinghazard: bool
    data_ispurchasable: bool
    data_pricebyweight: bool
    data_mperksofferid: List[Any]
    data_isagerestricted: bool
    data_ebtfoodstampable: bool
    data_groupid: str
    data_facets: Dict[str, Any]
    data_sku: str
    data_url: str
    data_brand: str
    data_price: float
    data_groups: List[Any]
    data_variation_id: str
    
    # Constructor.io specific fields
    value: str
    matched_terms: List[Any] = field(default_factory=list)
    is_slotted: bool = False
    labels: Dict[str, Any] = field(default_factory=dict)
    
    # Associated Meijer client for actions
    _meijer_client: Optional['Meijer'] = field(default=None, repr=False)
    
    @classmethod
    def from_constructor_response(cls, item_data: Dict[str, Any], meijer_client: Optional['Meijer'] = None) -> 'MeijerItem':
        """
        Create MeijerItem from Constructor.io API response.
        
        Args:
            item_data: Raw item data from Constructor.io
            meijer_client: Associated Meijer client
            
        Returns:
            MeijerItem object
        """
        # Extract data fields - Constructor.io nests item data under 'data' key
        data_fields = item_data.get('data', {})
        
        return cls(
            # Core Constructor.io fields
            value=item_data.get('value', ''),
            matched_terms=item_data.get('matched_terms', []),
            is_slotted=item_data.get('is_slotted', False),
            labels=item_data.get('labels', {}),
            
            # Meijer-specific data fields
            data_id=data_fields.get('id', ''),
            data_ean=data_fields.get('ean', 0),
            data_isbopas=data_fields.get('isbopas', False),
            data_isbuyable=data_fields.get('isbuyable', False),
            data_isalcohol=data_fields.get('isalcohol', False),
            data_image_url=data_fields.get('image_url', ''),
            data_priceunit=data_fields.get('priceunit', ''),
            data_hasmperks=data_fields.get('hasmperks', False),
            data_specialbuy=data_fields.get('specialbuy', False),
            data_description=data_fields.get('description', ''),
            data_deactivated=data_fields.get('deactivated', False),
            data_productunit=data_fields.get('productunit', ''),
            data_qtyincrement=data_fields.get('qtyincrement', 1),
            data_chokinghazard=data_fields.get('chokinghazard', False),
            data_ispurchasable=data_fields.get('ispurchasable', False),
            data_pricebyweight=data_fields.get('pricebyweight', False),
            data_mperksofferid=data_fields.get('mperksofferid', []),
            data_isagerestricted=data_fields.get('isagerestricted', False),
            data_ebtfoodstampable=data_fields.get('ebtfoodstampable', False),
            data_groupid=data_fields.get('groupid', ''),
            data_facets=data_fields.get('facets', {}),
            data_sku=data_fields.get('sku', ''),
            data_url=data_fields.get('url', ''),
            data_brand=data_fields.get('brand', ''),
            data_price=data_fields.get('price', 0.0),
            data_groups=data_fields.get('groups', []),
            data_variation_id=data_fields.get('variation_id', ''),
            
            _meijer_client=meijer_client
        )
    
    @property
    def product_id(self) -> str:
        """Get the product ID."""
        return self.data_id
    
    @property
    def title(self) -> str:
        """Get the product title/name."""
        return self.value
    
    @property
    def description(self) -> str:
        """Get the product description."""
        return self.data_description
    
    @property
    def price(self) -> float:
        """Get the product price."""
        return self.data_price
    
    @property
    def brand(self) -> str:
        """Get the product brand."""
        return self.data_brand
    
    @property
    def image_url(self) -> str:
        """Get the product image URL."""
        return self.data_image_url
    
    @property
    def is_buyable(self) -> bool:
        """Check if the item is buyable."""
        return self.data_isbuyable
    
    @property
    def is_purchasable(self) -> bool:
        """Check if the item is purchasable."""
        return self.data_ispurchasable
    
    @property
    def has_mperks_offers(self) -> bool:
        """Check if the item has mPerks offers."""
        return self.data_hasmperks or bool(self.data_mperksofferid)
    
    @property
    def is_alcohol(self) -> bool:
        """Check if the item is alcoholic."""
        return self.data_isalcohol
    
    @property
    def is_age_restricted(self) -> bool:
        """Check if the item is age restricted."""
        return self.data_isagerestricted
    
    @property
    def accepts_ebt(self) -> bool:
        """Check if the item accepts EBT/food stamps."""
        return self.data_ebtfoodstampable
    
    @property
    def formatted_price(self) -> str:
        """Get formatted price string."""
        if self.data_pricebyweight:
            return f"${self.price:.2f}/{self.data_priceunit}"
        else:
            return f"${self.price:.2f}"
    
    def __str__(self) -> str:
        """String representation of the item."""
        return f"{self.title} - {self.formatted_price}"


def create_meijer_items_from_search(response_data: Dict[str, Any], meijer_client: Optional['Meijer'] = None) -> List[MeijerItem]:
    """
    Create MeijerItem objects from Constructor.io search response.
    
    Args:
        response_data: Raw search response data
        meijer_client: Associated Meijer client
        
    Returns:
        List of MeijerItem objects
    """
    items = []
    
    # Handle different response structures
    results_data = response_data.get('results', [])
    if not results_data and 'response' in response_data:
        results_data = response_data['response'].get('results', [])
    
    for item_data in results_data:
        try:
            item = MeijerItem.from_constructor_response(item_data, meijer_client)
            items.append(item)
        except Exception as e:
            logging.warning(f"Failed to parse item data: {e}")
    
    return items


# =============================================================================
# MEIJER SEARCH FUNCTIONALITY
# =============================================================================

class MeijerSearchResults:
    """
    Container for paginated search results from Constructor.io.
    
    Provides easy pagination navigation and result management.
    """
    
    def __init__(self, items: List[MeijerItem], query: str, current_page: int, 
                 results_per_page: int, total_results: Optional[int] = None,
                 search_client: Optional['MeijerSearch'] = None,
                 filters: Optional[Dict[str, str]] = None,
                 store_id: Optional[str] = None):
        """
        Initialize search results container.
        
        Args:
            items: List of MeijerItem objects for current page
            query: Search query used
            current_page: Current page number (1-based)
            results_per_page: Number of results per page
            total_results: Total number of results available
            search_client: MeijerSearch client for pagination
            filters: Applied filters
            store_id: Store ID filter
        """
        self.items = items
        self.query = query
        self.current_page = current_page
        self.results_per_page = results_per_page
        self.total_results = total_results or len(items)
        self.search_client = search_client
        self.filters = filters or {}
        self.store_id = store_id
        
        # Calculate pagination info
        self.total_pages = (self.total_results + results_per_page - 1) // results_per_page
        self.has_next_page = current_page < self.total_pages
        self.has_prev_page = current_page > 1
        self.start_index = (current_page - 1) * results_per_page + 1
        self.end_index = min(current_page * results_per_page, self.total_results)
    
    def __len__(self) -> int:
        """Return number of items in current page."""
        return len(self.items)
    
    def __iter__(self):
        """Iterate over items in current page."""
        return iter(self.items)
    
    def __getitem__(self, index):
        """Get item by index from current page."""
        return self.items[index]
    
    def next_page(self) -> Optional['MeijerSearchResults']:
        """Get the next page of results."""
        if not self.has_next_page or not self.search_client:
            return None
        
        return self.search_client.search(
            query=self.query,
            page=self.current_page + 1,
            results_per_page=self.results_per_page,
            filters=self.filters,
            store_id=self.store_id
        )
    
    def prev_page(self) -> Optional['MeijerSearchResults']:
        """Get the previous page of results."""
        if not self.has_prev_page or not self.search_client:
            return None
        
        return self.search_client.search(
            query=self.query,
            page=self.current_page - 1,
            results_per_page=self.results_per_page,
            filters=self.filters,
            store_id=self.store_id
        )


class MeijerSearch:
    """
    Meijer search functionality using Constructor.io backend.
    
    This class provides product search, autocomplete, and category browsing
    by interfacing with Meijer's Constructor.io search infrastructure.
    """
    
    def __init__(self, meijer_client: Optional['Meijer'] = None):
        """
        Initialize the search interface.
        
        Args:
            meijer_client: Associated Meijer client for authentication
        """
        self.meijer_client = meijer_client
        
        # Constructor.io configuration (discovered from APK analysis)
        self.constructor_config = {
            'api_key': 'key_iCMsHdvPBa9BQ7e7',  # From APK BuildConfig
            'api_url': 'https://ac.cnstrc.com',  # From analysis
            'autocomplete_key': 'key_iCMsHdvPBa9BQ7e7'  # From APK
        }
        
        # Common parameters from analysis
        self.default_params = {
            'c': 'ciojs-client-2.29.12',  # Client version from analysis
            'key': self.constructor_config['api_key'],
            'i': '4c7b167c-2d99-4efe-a4c7-acb3b7c07bf4',  # Session ID format
            's': '1',  # Section
            'num_results_per_page': '30',  # Default page size
            '_dt': str(int(time.time() * 1000))  # Timestamp
        }
    
    def search(self, query: str, page: int = 1, results_per_page: int = 30,
               filters: Optional[Dict[str, str]] = None, store_id: Optional[str] = None) -> 'MeijerSearchResults':
        """
        Search for products using Constructor.io.
        
        Args:
            query: Search query
            page: Page number (1-based)
            results_per_page: Number of results per page
            filters: Additional filters
            store_id: Store ID filter
            
        Returns:
            MeijerSearchResults object with items and pagination
        """
        endpoint = f"{self.constructor_config['api_url']}/search/{query}"
        
        # Build parameters
        params = {
            **self.default_params,
            'num_results_per_page': str(results_per_page),
            'page': str(page)
        }
        
        if store_id:
            params['filters[store_id]'] = store_id
        
        if filters:
            for key, value in filters.items():
                params[f'filters[{key}]'] = value
        
        try:
            response = requests.get(endpoint, params=params)
            response.raise_for_status()
            
            search_data = response.json()
            items = create_meijer_items_from_search(search_data, self.meijer_client)
            
            # Extract total results count
            total_results = search_data.get('result_count', len(items))
            
            return MeijerSearchResults(
                items=items,
                query=query,
                current_page=page,
                results_per_page=results_per_page,
                total_results=total_results,
                search_client=self,
                filters=filters,
                store_id=store_id
            )
            
        except Exception as e:
            logging.error(f"Search failed for '{query}': {e}")
            return MeijerSearchResults(
                items=[],
                query=query,
                current_page=page,
                results_per_page=results_per_page,
                total_results=0
            )
    
    def autocomplete(self, query: str, num_results: int = 10) -> List[str]:
        """
        Get autocomplete suggestions.
        
        Args:
            query: Partial search query
            num_results: Number of suggestions to return
            
        Returns:
            List of autocomplete suggestions
        """
        endpoint = f"{self.constructor_config['api_url']}/autocomplete/{query}"
        
        params = {
            **self.default_params,
            'num_results': str(num_results)
        }
        
        try:
            response = requests.get(endpoint, params=params)
            response.raise_for_status()
            
            data = response.json()
            suggestions = []
            
            for section in data.get('sections', {}).values():
                for suggestion in section:
                    suggestions.append(suggestion.get('value', ''))
            
            return suggestions[:num_results]
            
        except Exception as e:
            logging.error(f"Autocomplete failed for '{query}': {e}")
            return []
    
    def browse_category(self, collection_id: str, page: int = 1, 
                       results_per_page: int = 30, filters: Optional[Dict[str, str]] = None) -> 'MeijerSearchResults':
        """
        Browse products in a category.
        
        Args:
            collection_id: Category/collection ID
            page: Page number (1-based)
            results_per_page: Number of results per page
            filters: Additional filters
            
        Returns:
            MeijerSearchResults object with items and pagination
        """
        endpoint = f"{self.constructor_config['api_url']}/browse/{collection_id}"
        
        params = {
            **self.default_params,
            'num_results_per_page': str(results_per_page),
            'page': str(page)
        }
        
        if filters:
            for key, value in filters.items():
                params[f'filters[{key}]'] = value
        
        try:
            response = requests.get(endpoint, params=params)
            response.raise_for_status()
            
            browse_data = response.json()
            items = create_meijer_items_from_search(browse_data, self.meijer_client)
            
            total_results = browse_data.get('result_count', len(items))
            
            return MeijerSearchResults(
                items=items,
                query=f"category:{collection_id}",
                current_page=page,
                results_per_page=results_per_page,
                total_results=total_results,
                search_client=self,
                filters=filters
            )
            
        except Exception as e:
            logging.error(f"Category browse failed for '{collection_id}': {e}")
            return MeijerSearchResults(
                items=[],
                query=f"category:{collection_id}",
                current_page=page,
                results_per_page=results_per_page,
                total_results=0
            )


# =============================================================================
# MEIJER STORE FUNCTIONALITY
# =============================================================================

@dataclass
class MeijerStore:
    """
    Represents a Meijer store from storeInfo API results.
    
    This class contains all fields discovered from storeInfo API analysis
    and provides methods for interacting with store information.
    
    Based on analysis of 634 stores with 190 unique fields.
    """
    
    # Core identification and location
    unit_id: int  # Store ID (primary identifier)
    name: str  # Store name
    address: str  # Street address
    city: str  # City
    state: str  # State abbreviation  
    zip_code: str  # ZIP code
    phone_number: str  # Main phone number
    latitude: float  # Latitude coordinate
    longitude: float  # Longitude coordinate
    
    # Distance and search info
    distance: Optional[float] = None  # Distance from search point (miles)
    miles_from: Optional[float] = None  # Alternative distance field
    
    # Store details and features
    display_name: Optional[str] = None  # Formatted display name
    store_type: Optional[str] = None  # Type of store
    timezone: Optional[str] = None  # Store timezone
    
    # Hours of operation (simplified - major time periods)
    weekday_open: Optional[str] = None
    weekday_close: Optional[str] = None
    sat_open: Optional[str] = None
    sat_close: Optional[str] = None
    sun_open: Optional[str] = None
    sun_close: Optional[str] = None
    
    # Services - boolean flags for major services
    pharmacy_flag: Optional[bool] = None
    gas_station_flag: Optional[bool] = None
    alcohol_sales_flag: Optional[bool] = None
    curbside_pickup_flag: Optional[bool] = None
    delivery_flag: Optional[bool] = None
    hours_24: Optional[bool] = None
    
    # Department phone numbers
    pharm_phone: Optional[str] = None
    deli_phone: Optional[str] = None
    bakery_phone: Optional[str] = None
    floral_phone: Optional[str] = None
    
    # Pharmacy details
    pharm_weekday_open: Optional[str] = None
    pharm_weekday_close: Optional[str] = None
    pharm_sat_open: Optional[str] = None
    pharm_sat_close: Optional[str] = None
    pharm_sun_open: Optional[str] = None
    pharm_sun_close: Optional[str] = None
    
    # All remaining fields discovered in analysis (190 total fields)
    # Store operational data
    store_number: Optional[str] = None
    banner_id: Optional[int] = None
    banner_name: Optional[str] = None
    district: Optional[str] = None
    region: Optional[str] = None
    market: Optional[str] = None
    
    # Address details
    address_line_2: Optional[str] = None
    county: Optional[str] = None
    country: Optional[str] = None
    formatted_address: Optional[str] = None
    
    # Contact information
    fax_number: Optional[str] = None
    manager_name: Optional[str] = None
    store_email: Optional[str] = None
    
    # Store size and capacity
    square_footage: Optional[int] = None
    parking_spaces: Optional[int] = None
    shopping_cart_count: Optional[int] = None
    
    # Services and amenities
    atm_flag: Optional[bool] = None
    money_order_flag: Optional[bool] = None
    check_cashing_flag: Optional[bool] = None
    propane_exchange_flag: Optional[bool] = None
    photo_center_flag: Optional[bool] = None
    optical_flag: Optional[bool] = None
    hearing_aid_flag: Optional[bool] = None
    mobile_phone_flag: Optional[bool] = None
    
    # Holiday and special hours
    holiday_open: Optional[str] = None
    holiday_close: Optional[str] = None
    holiday_date: Optional[str] = None
    special_hours_message: Optional[str] = None
    
    # Pick-up and delivery services
    grocery_pickup_flag: Optional[bool] = None
    grocery_delivery_flag: Optional[bool] = None
    pharmacy_delivery_flag: Optional[bool] = None
    
    # Alcohol and age-restricted services
    beer_wine_flag: Optional[bool] = None
    liquor_flag: Optional[bool] = None
    tobacco_flag: Optional[bool] = None
    
    # Food services
    cafe_flag: Optional[bool] = None
    starbucks_flag: Optional[bool] = None
    subway_flag: Optional[bool] = None
    pizza_flag: Optional[bool] = None
    
    # Department flags
    produce_flag: Optional[bool] = None
    meat_flag: Optional[bool] = None
    seafood_flag: Optional[bool] = None
    deli_flag: Optional[bool] = None
    bakery_flag: Optional[bool] = None
    floral_flag: Optional[bool] = None
    
    # Clothing and general merchandise  
    clothing_flag: Optional[bool] = None
    shoes_flag: Optional[bool] = None
    jewelry_flag: Optional[bool] = None
    electronics_flag: Optional[bool] = None
    automotive_flag: Optional[bool] = None
    garden_center_flag: Optional[bool] = None
    
    # Baby and family services
    baby_changing_station_flag: Optional[bool] = None
    family_restroom_flag: Optional[bool] = None
    nursing_station_flag: Optional[bool] = None
    
    # Accessibility
    wheelchair_accessible_flag: Optional[bool] = None
    hearing_loop_flag: Optional[bool] = None
    braille_signage_flag: Optional[bool] = None
    
    # Payment options
    accepts_checks_flag: Optional[bool] = None
    accepts_wic_flag: Optional[bool] = None
    accepts_ebt_flag: Optional[bool] = None
    
    # Associated Meijer client for actions
    _meijer_client: Optional['Meijer'] = field(default=None, repr=False)
    
    @classmethod
    def from_api_response(cls, store_data: Dict[str, Any], meijer_client: Optional['Meijer'] = None) -> 'MeijerStore':
        """
        Create MeijerStore from API response data.
        
        Args:
            store_data: Raw store data from API
            meijer_client: Associated Meijer client
            
        Returns:
            MeijerStore object
        """
        @staticmethod
        def _convert_bool(value: Any) -> Optional[bool]:
            """Convert various boolean representations to bool."""
            if value is None or value == '':
                return None
            if isinstance(value, bool):
                return value
            if isinstance(value, str):
                return value.lower() in ('true', '1', 'yes', 'on', 'y')
            if isinstance(value, (int, float)):
                return bool(value)
            return None
        
        return cls(
            # Core identification and location
            unit_id=int(store_data.get('UnitId', 0)),
            name=store_data.get('Name', ''),
            address=store_data.get('Address', ''),
            city=store_data.get('City', ''),
            state=store_data.get('State', ''),
            zip_code=store_data.get('Zip', ''),
            phone_number=store_data.get('PhoneNumber', ''),
            latitude=float(store_data.get('Latitude', 0.0)),
            longitude=float(store_data.get('Longitude', 0.0)),
            
            # Distance and search info
            distance=store_data.get('Distance'),
            miles_from=store_data.get('MilesFrom'),
            
            # Store details
            display_name=store_data.get('DisplayName') or f"Meijer {store_data.get('Name', '')}",
            store_type=store_data.get('StoreType'),
            timezone=store_data.get('TimeZone'),
            
            # Store hours
            weekday_open=store_data.get('WeekdayOpen'),
            weekday_close=store_data.get('WeekdayClose'),
            sat_open=store_data.get('SatOpen'),
            sat_close=store_data.get('SatClose'),
            sun_open=store_data.get('SunOpen'),
            sun_close=store_data.get('SunClose'),
            
            # Service flags
            pharmacy_flag=_convert_bool(store_data.get('PharmacyFlag')),
            gas_station_flag=_convert_bool(store_data.get('GasStationFlag')),
            alcohol_sales_flag=_convert_bool(store_data.get('AlcoholSalesFlag')),
            curbside_pickup_flag=_convert_bool(store_data.get('CurbsidePickupFlag')),
            delivery_flag=_convert_bool(store_data.get('DeliveryFlag')),
            hours_24=_convert_bool(store_data.get('Hours24')),
            
            # Department phones
            pharm_phone=store_data.get('PharmPhone'),
            deli_phone=store_data.get('DeliPhone'),
            bakery_phone=store_data.get('BakeryPhone'),
            floral_phone=store_data.get('FloralPhone'),
            
            # Pharmacy hours
            pharm_weekday_open=store_data.get('PharmWeekdayOpen'),
            pharm_weekday_close=store_data.get('PharmWeekdayClose'),
            pharm_sat_open=store_data.get('PharmSatOpen'),
            pharm_sat_close=store_data.get('PharmSatClose'),
            pharm_sun_open=store_data.get('PharmSunOpen'),
            pharm_sun_close=store_data.get('PharmSunClose'),
            
            _meijer_client=meijer_client
        )
    
    @property
    def store_id(self) -> int:
        """Get the store ID as integer."""
        return self.unit_id
    
    @property
    def full_address(self) -> str:
        """Get the full formatted address."""
        if self.formatted_address:
            return self.formatted_address
        
        parts = [self.address, self.city, f"{self.state} {self.zip_code}"]
        return ", ".join(part for part in parts if part)
    
    @property
    def distance_miles(self) -> Optional[float]:
        """Get distance in miles."""
        return self.distance or self.miles_from
    
    def has_pharmacy(self) -> bool:
        """Check if store has pharmacy."""
        return bool(self.pharmacy_flag) or bool(self.pharm_phone)
    
    def has_gas_station(self) -> bool:
        """Check if store has gas station."""
        return bool(self.gas_station_flag)
    
    def has_curbside_pickup(self) -> bool:
        """Check if store offers curbside pickup."""
        return bool(self.curbside_pickup_flag)
    
    def has_delivery(self) -> bool:
        """Check if store offers delivery."""
        return bool(self.delivery_flag)
    
    def has_alcohol_sales(self) -> bool:
        """Check if store sells alcohol."""
        return bool(self.alcohol_sales_flag)
    
    def is_24_hours(self) -> bool:
        """Check if store is open 24 hours."""
        return bool(self.hours_24)
    
    def get_store_services(self) -> List[str]:
        """Get list of available services."""
        services = []
        
        if self.has_pharmacy():
            services.append("Pharmacy")
        if self.has_gas_station():
            services.append("Gas Station")
        if self.has_curbside_pickup():
            services.append("Curbside Pickup")
        if self.has_delivery():
            services.append("Delivery")
        if self.has_alcohol_sales():
            services.append("Alcohol Sales")
        if self.is_24_hours():
            services.append("24 Hours")
        
        return services
    
    def get_contact_info(self) -> Dict[str, str]:
        """Get contact information."""
        contact = {
            "main_phone": self.phone_number,
            "pharmacy": self.pharm_phone,
            "deli": self.deli_phone,
            "bakery": self.bakery_phone,
            "floral": self.floral_phone
        }
        
        return {k: v for k, v in contact.items() if v}
    
    def get_hours_info(self) -> Dict[str, Dict[str, str]]:
        """Get hours information."""
        hours = {
            "store": {
                "weekday": f"{self.weekday_open} - {self.weekday_close}" if self.weekday_open and self.weekday_close else None,
                "saturday": f"{self.sat_open} - {self.sat_close}" if self.sat_open and self.sat_close else None,
                "sunday": f"{self.sun_open} - {self.sun_close}" if self.sun_open and self.sun_close else None
            },
            "pharmacy": {
                "weekday": f"{self.pharm_weekday_open} - {self.pharm_weekday_close}" if self.pharm_weekday_open and self.pharm_weekday_close else None,
                "saturday": f"{self.pharm_sat_open} - {self.pharm_sat_close}" if self.pharm_sat_open and self.pharm_sat_close else None,
                "sunday": f"{self.pharm_sun_open} - {self.pharm_sun_close}" if self.pharm_sun_open and self.pharm_sun_close else None
            }
        }
        
        # Remove None values
        for dept, dept_hours in hours.items():
            hours[dept] = {k: v for k, v in dept_hours.items() if v}
        
        return {k: v for k, v in hours.items() if v}
    
    def calculate_distance(self, lat: float, lng: float) -> float:
        """
        Calculate distance from given coordinates using Haversine formula.
        
        Args:
            lat: Latitude
            lng: Longitude
            
        Returns:
            Distance in miles
        """
        import math
        
        # Convert latitude and longitude from degrees to radians
        lat1, lng1, lat2, lng2 = map(math.radians, [lat, lng, self.latitude, self.longitude])
        
        # Haversine formula
        dlat = lat2 - lat1
        dlng = lng2 - lng1
        a = math.sin(dlat/2)**2 + math.cos(lat1) * math.cos(lat2) * math.sin(dlng/2)**2
        c = 2 * math.asin(math.sqrt(a))
        
        # Radius of earth in miles
        r = 3956
        
        return c * r
    
    def __str__(self) -> str:
        """String representation of the store."""
        distance_str = f" ({self.distance_miles:.1f} mi)" if self.distance_miles else ""
        return f"{self.display_name}{distance_str} - {self.full_address}"


def create_meijer_stores_from_response(response_data: Dict[str, Any], meijer_client: Optional['Meijer'] = None) -> List[MeijerStore]:
    """
    Create MeijerStore objects from API response.
    
    Args:
        response_data: Raw API response data
        meijer_client: Associated Meijer client
        
    Returns:
        List of MeijerStore objects
    """
    stores = []
    
    # Handle different response structures
    stores_data = response_data.get('store', [])
    if not stores_data and 'stores' in response_data:
        stores_data = response_data['stores']
    elif not stores_data and 'data' in response_data:
        stores_data = response_data['data'].get('stores', [])
    
    # Handle single store object (not in array)
    if isinstance(stores_data, dict):
        stores_data = [stores_data]
    
    for store_data in stores_data:
        try:
            store = MeijerStore.from_api_response(store_data, meijer_client)
            stores.append(store)
        except Exception as e:
            logging.warning(f"Failed to parse store data: {e}")
    
    return stores


class MeijerStoreSearch:
    """
    Meijer store search functionality using storeInfo API.
    
    This class provides store search by location and store details lookup
    by interfacing with Meijer's storeInfo API endpoints.
    
    Properly handles store IDs as integers with automatic type conversion.
    """
    
    def __init__(self, meijer_client: Optional['Meijer'] = None):
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
    
    def find_stores_nearby(self, 
                          latitude: float, 
                          longitude: float,
                          radius_miles: int = 50,
                          max_results: int = 10) -> List[MeijerStore]:
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
            **self.default_params
        }
        
        try:
            if self.meijer_client and self.meijer_client.session:
                response = self.meijer_client.session.get(endpoint, params=params)
            else:
                response = requests.get(endpoint, params=params)
            response.raise_for_status()
            
            store_data = response.json()
            stores = create_meijer_stores_from_response(store_data, self.meijer_client)
            
            logging.info(f"Found {len(stores)} stores within {radius_miles} miles of ({latitude}, {longitude})")
            return stores
            
        except Exception as e:
            logging.error(f"Store proximity search failed: {e}")
            return []
    
    def get_store_details(self, store_id: Union[int, str]) -> Optional[MeijerStore]:
        """
        Get detailed information for a specific store.
        
        Args:
            store_id: Meijer store ID (int or str, automatically converted to int)
            
        Returns:
            MeijerStore object with detailed information, or None if not found
        """
        # Convert store_id to int - this is the proper type!
        try:
            if isinstance(store_id, str):
                store_id_int = int(store_id)
                logging.debug(f"Converted string store_id '{store_id}' to int {store_id_int}")
            elif isinstance(store_id, int):
                store_id_int = store_id
            else:
                logging.error(f"Invalid store_id type: {type(store_id)}. Expected int or str.")
                return None
        except (ValueError, TypeError) as e:
            logging.error(f"Could not convert store_id '{store_id}' to int: {e}")
            return None
        
        endpoint = f"{self.base_url}/storeInfo/stores/{store_id_int}"
        
        try:
            if self.meijer_client and self.meijer_client.session:
                response = self.meijer_client.session.get(endpoint)
            else:
                response = requests.get(endpoint)
            response.raise_for_status()
            
            store_data = response.json()
            stores = create_meijer_stores_from_response(store_data, self.meijer_client)
            
            if stores:
                store = stores[0]
                logging.info(f"Retrieved details for store {store_id_int}: {store.display_name}")
                return store
            else:
                logging.warning(f"No store data found for store {store_id_int}")
                return None
                
        except Exception as e:
            logging.error(f"Store details lookup failed for {store_id_int}: {e}")
            return None


# =============================================================================
# EXTENDED MEIJER CLIENT WITH ALL FUNCTIONALITY
# ============================================================================= 