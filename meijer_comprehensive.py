#!/usr/bin/env python3
"""
Comprehensive Meijer API Client based on actual network analysis.

This client implements the real OAuth 2.0 with PKCE authentication flow
discovered through mitmproxy analysis of actual network traffic.
"""

import base64
import hashlib
import json
import logging
import secrets
import time
import urllib.parse
import os
from dataclasses import dataclass, field, asdict
from datetime import datetime, timedelta
from enum import Enum
from pathlib import Path
from typing import Dict, List, Optional, Any, Union, Tuple
from urllib.parse import urlencode

import requests
from requests.adapters import HTTPAdapter
from urllib3.util.retry import Retry


# Configure logging
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)


class AuthenticationStatus(Enum):
    """Authentication status enumeration."""
    UNAUTHENTICATED = "unauthenticated"
    AUTHENTICATED = "authenticated"
    EXPIRED = "expired"
    REFRESHING = "refreshing"


@dataclass
class OAuthConfig:
    """OAuth 2.0 configuration based on actual network analysis."""
    client_id: str = "0oa1o8g9njWsUvwsx697"
    auth_url: str = "https://id.meijer.com/oauth2/default/v1/authorize"
    token_url: str = "https://id.meijer.com/oauth2/default/v1/token"
    keys_url: str = "https://id.meijer.com/oauth2/default/v1/keys"
    scope: str = "openid profile offline_access"
    redirect_uri: str = "https://localhost:45678/callback"  # Web-compatible redirect URI on high port
    mobile_redirect_uri: str = "com.meijer.mobile.meijer:/login"  # Original mobile app URI
    response_type: str = "code"
    code_challenge_method: str = "S256"


@dataclass
class AuthTokens:
    """Authentication tokens container."""
    access_token: str
    refresh_token: str
    id_token: Optional[str] = None
    token_type: str = "Bearer"
    expires_in: int = 3600
    expires_at: Optional[datetime] = None
    
    def __post_init__(self):
        if self.expires_at is None and self.expires_in:
            self.expires_at = datetime.now() + timedelta(seconds=self.expires_in)
    
    def is_expired(self, buffer_seconds: int = 300) -> bool:
        """Check if token is expired or will expire soon."""
        if self.expires_at is None:
            return True
        return datetime.now() + timedelta(seconds=buffer_seconds) >= self.expires_at
    
    def time_until_expiry(self) -> Optional[timedelta]:
        """Get time until token expires."""
        if self.expires_at is None:
            return None
        return self.expires_at - datetime.now()
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for JSON serialization."""
        data = asdict(self)
        # Convert datetime to ISO string for JSON serialization
        if self.expires_at:
            data['expires_at'] = self.expires_at.isoformat()
        return data
    
    @classmethod
    def from_dict(cls, data: Dict[str, Any]) -> 'AuthTokens':
        """Create from dictionary (JSON deserialization)."""
        # Convert ISO string back to datetime
        if 'expires_at' in data and data['expires_at']:
            data['expires_at'] = datetime.fromisoformat(data['expires_at'])
        return cls(**data)


@dataclass
class UserInfo:
    """User profile information."""
    sub: str
    name: Optional[str] = None
    email: Optional[str] = None
    email_verified: Optional[bool] = None
    given_name: Optional[str] = None
    family_name: Optional[str] = None
    locale: Optional[str] = None
    updated_at: Optional[datetime] = None


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


class MeijerAuth(requests.auth.AuthBase):
    """Custom authentication for Meijer API requests."""
    
    def __init__(self, access_token: str):
        self.access_token = access_token
    
    def __call__(self, request):
        request.headers['Authorization'] = f'Bearer {self.access_token}'
        return request


class MeijerComprehensiveClient:
    """
    Comprehensive Meijer API client based on actual network analysis.
    
    This client implements the real OAuth 2.0 with PKCE authentication flow
    and all discovered API endpoints from mitmproxy analysis.
    """
    
    def __init__(self, username: Optional[str] = None, password: Optional[str] = None):
        """Initialize the Meijer client."""
        self.username = username
        self.password = password
        self.oauth_config = OAuthConfig()
        self.auth_tokens: Optional[AuthTokens] = None
        self.user_info: Optional[UserInfo] = None
        self.auth_status = AuthenticationStatus.UNAUTHENTICATED
        
        # Setup logging
        import logging
        self.logger = logging.getLogger(__name__)
        
        # Session with retry logic
        self.session = requests.Session()
        retry_strategy = Retry(
            total=3,
            backoff_factor=1,
            status_forcelist=[429, 500, 502, 503, 504],
            allowed_methods=["HEAD", "GET", "POST", "PUT", "DELETE", "OPTIONS", "TRACE"]
        )
        adapter = HTTPAdapter(max_retries=retry_strategy)
        self.session.mount("http://", adapter)
        self.session.mount("https://", adapter)
        
        # API base URLs discovered from network analysis
        self.api_base = "https://api.meijer.com"
        self.id_base = "https://id.meijer.com"
        
        # API subscription key from network analysis
        self.subscription_key = "a10bc58ac484478d9b3958b1742c3a03"
        
        # Common headers discovered from network analysis
        self.default_headers = {
            'User-Agent': 'Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36',
            'Accept': 'application/json, text/plain, */*',
            'Accept-Language': 'en-US,en;q=0.9',
            'Accept-Encoding': 'gzip, deflate',
            'Connection': 'keep-alive',
            'X-Requested-With': 'com.meijer.mobile.meijer'
        }
        
        # Update session headers
        self.session.headers.update(self.default_headers)
        
        # Config file path
        self.config_dir = Path.home() / '.config'
        self.config_file = self.config_dir / 'meijer.txt'
        
        # Try to load existing tokens from config
        self._load_tokens_from_config()
    
    def _get_config_path(self) -> Path:
        """Get the path to the config file."""
        return self.config_file
    
    def _ensure_config_dir(self) -> None:
        """Ensure the config directory exists."""
        self.config_dir.mkdir(parents=True, exist_ok=True)
    
    def _save_tokens_to_config(self) -> bool:
        """Save current tokens to config file."""
        try:
            if not self.auth_tokens:
                self.logger.warning("No tokens to save")
                return False
            
            self._ensure_config_dir()
            
            config_data = {
                "tokens": self.auth_tokens.to_dict(),
                "username": self.username,
                "last_updated": datetime.now().isoformat(),
                "user_agent": self.session.headers.get('User-Agent', ''),
                "api_version": "1.0"
            }
            
            with open(self.config_file, 'w') as f:
                json.dump(config_data, f, indent=2)
            
            self.logger.info(f"✅ Tokens saved to: {self.config_file}")
            return True
            
        except Exception as e:
            self.logger.error(f"❌ Failed to save tokens to config: {e}")
            return False
    
    def _load_tokens_from_config(self) -> bool:
        """Load tokens from config file."""
        try:
            if not self.config_file.exists():
                self.logger.info("📄 No existing config file found")
                return False
            
            with open(self.config_file, 'r') as f:
                config_data = json.load(f)
            
            if 'tokens' not in config_data:
                self.logger.warning("⚠️  Invalid config format")
                return False
            
            # Load tokens
            self.auth_tokens = AuthTokens.from_dict(config_data['tokens'])
            
            # Update session headers with saved user agent if available
            if 'user_agent' in config_data and config_data['user_agent']:
                self.session.headers['User-Agent'] = config_data['user_agent']
            
            # Update session with authorization header
            self.session.headers['Authorization'] = f'Bearer {self.auth_tokens.access_token}'
            self.session.headers.update({
                'ocp-apim-subscription-key': self.subscription_key,
                'Accept-Encoding': 'gzip',
                'Accept': 'application/meijer.shoppingList.ShoppingList-v1.0+json'
            })
            
            self.logger.info(f"📋 Loaded tokens from: {self.config_file}")
            
            # Check if tokens are expired
            if self.auth_tokens.is_expired():
                self.logger.warning("⚠️  Loaded tokens are expired")
                if self.auth_tokens.refresh_token:
                    self.logger.info("🔄 Attempting to refresh tokens...")
                    return self._refresh_tokens()
                else:
                    self.logger.warning("❌ No refresh token available")
                    return False
            else:
                time_left = self.auth_tokens.time_until_expiry()
                self.logger.info(f"✅ Tokens valid for: {time_left}")
                self.auth_status = AuthenticationStatus.AUTHENTICATED
                return True
                
        except Exception as e:
            self.logger.error(f"❌ Failed to load tokens from config: {e}")
            return False
    
    def _refresh_tokens(self) -> bool:
        """Refresh access token using refresh token."""
        try:
            if not self.auth_tokens or not self.auth_tokens.refresh_token:
                self.logger.error("❌ No refresh token available")
                return False
            
            self.logger.info("🔄 Refreshing access token...")
            
            data = {
                'grant_type': 'refresh_token',
                'refresh_token': self.auth_tokens.refresh_token,
                'client_id': self.oauth_config.client_id,
                'scope': self.oauth_config.scope
            }
            
            response = self.session.post(self.oauth_config.token_url, data=data)
            
            if response.status_code == 200:
                token_data = response.json()
                
                # Update tokens
                self.auth_tokens.access_token = token_data['access_token']
                if 'refresh_token' in token_data:
                    self.auth_tokens.refresh_token = token_data['refresh_token']
                if 'expires_in' in token_data:
                    self.auth_tokens.expires_in = token_data['expires_in']
                    self.auth_tokens.expires_at = datetime.now() + timedelta(seconds=token_data['expires_in'])
                
                # Update session headers
                self.session.headers['Authorization'] = f'Bearer {self.auth_tokens.access_token}'
                
                # Save refreshed tokens
                self._save_tokens_to_config()
                
                self.logger.info("✅ Tokens refreshed successfully")
                self.auth_status = AuthenticationStatus.AUTHENTICATED
                return True
            else:
                self.logger.error(f"❌ Token refresh failed: {response.status_code}")
                self.logger.error(f"Response: {response.text}")
                return False
                
        except Exception as e:
            self.logger.error(f"❌ Token refresh failed: {e}")
            return False
    
    def clear_config(self) -> bool:
        """Clear saved configuration."""
        try:
            if self.config_file.exists():
                self.config_file.unlink()
                self.logger.info(f"🗑️  Cleared config: {self.config_file}")
            
            self.auth_tokens = None
            self.auth_status = AuthenticationStatus.UNAUTHENTICATED
            
            # Remove auth headers
            if 'Authorization' in self.session.headers:
                del self.session.headers['Authorization']
                
            return True
        except Exception as e:
            self.logger.error(f"❌ Failed to clear config: {e}")
            return False
    
    def _generate_pkce_pair(self) -> tuple[str, str]:
        """Generate PKCE code verifier and challenge."""
        code_verifier = base64.urlsafe_b64encode(secrets.token_bytes(32)).decode('utf-8').rstrip('=')
        code_challenge = base64.urlsafe_b64encode(
            hashlib.sha256(code_verifier.encode('utf-8')).digest()
        ).decode('utf-8').rstrip('=')
        return code_verifier, code_challenge
    
    def _generate_state(self) -> str:
        """Generate random state parameter for OAuth security."""
        return secrets.token_urlsafe(32)
    
    def _generate_nonce(self) -> str:
        """Generate random nonce parameter for OAuth security."""
        return secrets.token_urlsafe(32)
    
    def get_authorization_url(self, use_mobile_uri: bool = False) -> tuple[str, str, str]:
        """
        Generate OAuth 2.0 authorization URL with PKCE.
        
        Args:
            use_mobile_uri: If True, use the mobile app redirect URI (for Selenium)
                           If False, use web-compatible redirect URI (for requests)
        
        Returns:
            tuple: (authorization_url, state, code_verifier)
        """
        code_verifier, code_challenge = self._generate_pkce_pair()
        state = self._generate_state()
        nonce = self._generate_nonce()
        
        # Choose appropriate redirect URI
        redirect_uri = self.oauth_config.mobile_redirect_uri if use_mobile_uri else self.oauth_config.redirect_uri
        
        params = {
            'login_hint': '',  # Required parameter from working flow
            'code_challenge': code_challenge,
            'code_challenge_method': self.oauth_config.code_challenge_method,
            'client_id': self.oauth_config.client_id,
            'scope': self.oauth_config.scope,
            'redirect_uri': redirect_uri,
            'response_type': self.oauth_config.response_type,
            'state': state,
            'nonce': nonce,
            'response_mode': 'query',  # Required parameter from working flow
            'display': 'page',         # Required parameter from working flow
            'max_age': -1              # Required parameter from working flow
        }
        
        auth_url = f"{self.oauth_config.auth_url}?{urlencode(params)}"
        return auth_url, state, code_verifier
    
    def authenticate_interactive(self) -> bool:
        """
        Interactive authentication flow.
        
        This method opens the authorization URL for user to complete authentication.
        Returns True if authentication was successful.
        """
        try:
            auth_url, state, code_verifier = self.get_authorization_url()
            
            print(f"🔐 Please complete authentication at:")
            print(f"   {auth_url}")
            print(f"\n📱 After authentication, you'll be redirected to a URL like:")
            print(f"   com.meijer.mobile.meijer:/login?code=AUTHORIZATION_CODE&state={state}")
            print(f"\n📋 Please provide the authorization code from the redirect URL:")
            
            auth_code = input("Authorization Code: ").strip()
            if not auth_code:
                print("❌ No authorization code provided")
                return False
            
            return self.authenticate_with_code(auth_code, code_verifier)
            
        except Exception as e:
            logger.error(f"Interactive authentication failed: {e}")
            return False
    
    def authenticate_with_code(self, authorization_code: str, code_verifier: str) -> bool:
        """
        Exchange authorization code for access token.
        
        Args:
            authorization_code: The authorization code from OAuth flow
            code_verifier: The PKCE code verifier
            
        Returns:
            bool: True if authentication successful
        """
        try:
            self.auth_status = AuthenticationStatus.REFRESHING
            
            token_data = {
                'grant_type': 'authorization_code',
                'client_id': self.oauth_config.client_id,
                'code': authorization_code,
                'redirect_uri': self.oauth_config.redirect_uri,
                'code_verifier': code_verifier
            }
            
            response = self.session.post(
                self.oauth_config.token_url,
                data=token_data,
                headers={'Content-Type': 'application/x-www-form-urlencoded'}
            )
            
            if response.status_code != 200:
                logger.error(f"Token exchange failed: {response.status_code} - {response.text}")
                self.auth_status = AuthenticationStatus.UNAUTHENTICATED
                return False
            
            token_response = response.json()
            
            # Create AuthTokens object
            self.auth_tokens = AuthTokens(
                access_token=token_response['access_token'],
                refresh_token=token_response['refresh_token'],
                id_token=token_response.get('id_token'),
                token_type=token_response.get('token_type', 'Bearer'),
                expires_in=token_response.get('expires_in', 3600)
            )
            
            # Update session with authentication
            self.session.auth = MeijerAuth(self.auth_tokens.access_token)
            self.auth_status = AuthenticationStatus.AUTHENTICATED
            
            logger.info("✅ Authentication successful")
            return True
            
        except Exception as e:
            logger.error(f"Authentication with code failed: {e}")
            self.auth_status = AuthenticationStatus.UNAUTHENTICATED
            return False
    
    def authenticate_with_credentials(self, username: str, password: str) -> bool:
        """
        Authenticate using username/password (placeholder for future implementation).
        
        Note: This would require implementing the actual credential-based OAuth flow
        that Meijer uses, which may involve additional endpoints or different flow.
        """
        logger.warning("Credential-based authentication not yet implemented")
        logger.info("Please use interactive authentication or authenticate_with_code")
        return False
    
    def login(self) -> bool:
        """
        Main login method that attempts credential-based login first,
        then falls back to interactive if needed.
        """
        if self.username and self.password:
            if self.authenticate_with_credentials(self.username, self.password):
                return True
        
        return self.authenticate_interactive()
    
    def refresh_token(self) -> bool:
        """Refresh the access token using refresh token."""
        if not self.auth_tokens or not self.auth_tokens.refresh_token:
            logger.error("No refresh token available")
            return False
        
        try:
            self.auth_status = AuthenticationStatus.REFRESHING
            
            token_data = {
                'grant_type': 'refresh_token',
                'client_id': self.oauth_config.client_id,
                'refresh_token': self.auth_tokens.refresh_token
            }
            
            response = self.session.post(
                self.oauth_config.token_url,
                data=token_data,
                headers={'Content-Type': 'application/x-www-form-urlencoded'}
            )
            
            if response.status_code != 200:
                logger.error(f"Token refresh failed: {response.status_code} - {response.text}")
                self.auth_status = AuthenticationStatus.EXPIRED
                return False
            
            token_response = response.json()
            
            # Update tokens
            self.auth_tokens.access_token = token_response['access_token']
            if 'refresh_token' in token_response:
                self.auth_tokens.refresh_token = token_response['refresh_token']
            if 'expires_in' in token_response:
                self.auth_tokens.expires_in = token_response['expires_in']
                self.auth_tokens.expires_at = datetime.now() + timedelta(seconds=token_response['expires_in'])
            
            # Update session
            self.session.auth = MeijerAuth(self.auth_tokens.access_token)
            self.auth_status = AuthenticationStatus.AUTHENTICATED
            
            logger.info("✅ Token refreshed successfully")
            return True
            
        except Exception as e:
            logger.error(f"Token refresh failed: {e}")
            self.auth_status = AuthenticationStatus.EXPIRED
            return False
    
    def ensure_authenticated(self) -> bool:
        """Ensure we have a valid authentication token."""
        if self.auth_status == AuthenticationStatus.AUTHENTICATED:
            if self.auth_tokens and not self.auth_tokens.is_expired():
                return True
            else:
                self.auth_status = AuthenticationStatus.EXPIRED
        
        if self.auth_status == AuthenticationStatus.EXPIRED:
            return self.refresh_token()
        
        return False
    
    def get_user_info(self) -> Optional[UserInfo]:
        """Get user profile information."""
        if not self.ensure_authenticated():
            return None
        
        try:
            # This endpoint would need to be discovered from actual network analysis
            # For now, we'll try to extract from ID token if available
            if self.auth_tokens and self.auth_tokens.id_token:
                # Parse JWT token (simplified)
                parts = self.auth_tokens.id_token.split('.')
                if len(parts) == 3:
                    payload = json.loads(base64.urlsafe_b64decode(parts[1] + '=='))
                    
                    self.user_info = UserInfo(
                        sub=payload.get('sub', ''),
                        name=payload.get('name'),
                        email=payload.get('email'),
                        email_verified=payload.get('email_verified'),
                        given_name=payload.get('given_name'),
                        family_name=payload.get('family_name'),
                        locale=payload.get('locale'),
                        updated_at=datetime.fromtimestamp(payload.get('updated_at', 0)) if payload.get('updated_at') else None
                    )
                    
                    return self.user_info
            
            logger.warning("User info not available - ID token parsing not implemented")
            return None
            
        except Exception as e:
            logger.error(f"Failed to get user info: {e}")
            return None
    
    def get_offers(self, limit: int = 50, offset: int = 0) -> List[MeijerOffer]:
        """Get available offers/coupons."""
        if not self.ensure_authenticated():
            return []
        
        try:
            url = f"{self.api_base}/loyalty/mPerks/api/offers"
            params = {
                'limit': limit,
                'offset': offset
            }
            
            response = self.session.get(url, params=params)
            
            if response.status_code != 200:
                logger.error(f"Failed to get offers: {response.status_code}")
                return []
            
            offers_data = response.json()
            offers = []
            
            # Parse offers based on actual response structure
            # This would need to be adjusted based on real API response
            for offer_data in offers_data.get('offers', []):
                offer = MeijerOffer(
                    id=offer_data.get('id', ''),
                    title=offer_data.get('title', ''),
                    description=offer_data.get('description'),
                    discount_amount=offer_data.get('discountAmount'),
                    discount_percentage=offer_data.get('discountPercentage'),
                    valid_from=datetime.fromisoformat(offer_data['validFrom']) if offer_data.get('validFrom') else None,
                    valid_until=datetime.fromisoformat(offer_data['validUntil']) if offer_data.get('validUntil') else None,
                    terms=offer_data.get('terms'),
                    image_url=offer_data.get('imageUrl'),
                    category=offer_data.get('category'),
                    is_clipped=offer_data.get('isClipped', False)
                )
                offers.append(offer)
            
            return offers
            
        except Exception as e:
            logger.error(f"Failed to get offers: {e}")
            return []
    
    def get_home_cards(self) -> Dict[str, Any]:
        """Get home page cards and content."""
        if not self.ensure_authenticated():
            return {}
        
        try:
            url = f"{self.api_base}/digital/homecards/v1/cards"
            response = self.session.get(url)
            
            if response.status_code != 200:
                logger.error(f"Failed to get home cards: {response.status_code}")
                return {}
            
            return response.json()
            
        except Exception as e:
            logger.error(f"Failed to get home cards: {e}")
            return {}
    
    def get_special_offers(self) -> List[Dict[str, Any]]:
        """Get special offers and promotions."""
        if not self.ensure_authenticated():
            return []
        
        try:
            url = f"{self.api_base}/loyalty/mPerks/api/cms/specialoffers"
            response = self.session.get(url)
            
            if response.status_code != 200:
                logger.error(f"Failed to get special offers: {response.status_code}")
                return []
            
            return response.json().get('offers', [])
            
        except Exception as e:
            logger.error(f"Failed to get special offers: {e}")
            return []
    
    def get_stores(self, zip_code: Optional[str] = None, latitude: Optional[float] = None, longitude: Optional[float] = None) -> List[MeijerStore]:
        """Get Meijer store locations."""
        if not self.ensure_authenticated():
            return []
        
        try:
            url = f"{self.api_base}/stores"
            params = {}
            
            if zip_code:
                params['zipCode'] = zip_code
            elif latitude and longitude:
                params['latitude'] = latitude
                params['longitude'] = longitude
            
            response = self.session.get(url, params=params)
            
            if response.status_code != 200:
                logger.error(f"Failed to get stores: {response.status_code}")
                return []
            
            stores_data = response.json()
            stores = []
            
            # Parse stores based on actual response structure
            for store_data in stores_data.get('stores', []):
                store = MeijerStore(
                    id=store_data.get('id', ''),
                    name=store_data.get('name', ''),
                    address=store_data.get('address', ''),
                    city=store_data.get('city', ''),
                    state=store_data.get('state', ''),
                    zip_code=store_data.get('zipCode', ''),
                    phone=store_data.get('phone'),
                    hours=store_data.get('hours'),
                    services=store_data.get('services'),
                    latitude=store_data.get('latitude'),
                    longitude=store_data.get('longitude')
                )
                stores.append(store)
            
            return stores
            
        except Exception as e:
            logger.error(f"Failed to get stores: {e}")
            return []
    
    def get_shopping_list(self) -> List[Dict[str, Any]]:
        """Get user's shopping list."""
        if not self.ensure_authenticated():
            return []
        
        try:
            url = f"{self.api_base}/loyalty/shoppinglist/GetList"
            response = self.session.get(url)
            
            if response.status_code != 200:
                logger.error(f"Failed to get shopping list: {response.status_code}")
                return []
            
            return response.json().get('items', [])
            
        except Exception as e:
            logger.error(f"Failed to get shopping list: {e}")
            return []
    
    def logout(self) -> None:
        """Logout and clear authentication."""
        self.auth_tokens = None
        self.user_info = None
        self.auth_status = AuthenticationStatus.UNAUTHENTICATED
        self.session.auth = None
        logger.info("✅ Logged out successfully")
    
    def get_session_info(self) -> Dict[str, Any]:
        """Get current session information."""
        info = {
            'status': self.auth_status.value,
            'authenticated': self.is_authenticated(),
            'username': self.username
        }
        
        if self.auth_tokens:
            info.update({
                'token_type': self.auth_tokens.token_type,
                'expires_in': self.auth_tokens.expires_in,
                'expires_at': self.auth_tokens.expires_at.isoformat() if self.auth_tokens.expires_at else None,
                'time_until_expiry': str(self.auth_tokens.time_until_expiry()) if self.auth_tokens.time_until_expiry() else None
            })
        
        if self.user_info:
            info.update({
                'user_id': self.user_info.sub,
                'user_name': self.user_info.name,
                'user_email': self.user_info.email
            })
        
        return info
    
    def is_authenticated(self) -> bool:
        """Check if currently authenticated."""
        return (self.auth_status == AuthenticationStatus.AUTHENTICATED and 
                self.auth_tokens and 
                not self.auth_tokens.is_expired())
    
    def __enter__(self):
        """Context manager entry."""
        return self
    
    def __exit__(self, exc_type, exc_val, exc_tb):
        """Context manager exit."""
        self.logout()

    def authenticate_with_bearer_token(self, bearer_token: str, user_agent: str = None) -> bool:
        """
        Authenticate using a pre-extracted Bearer token from mitmproxy logs.
        
        Args:
            bearer_token: The Bearer token to use
            user_agent: Optional user agent to use
            
        Returns:
            True if successful, False otherwise
        """
        try:
            self.logger.info(f"🎫 Authenticating with pre-extracted Bearer token")
            
            # Set the bearer token directly
            self.auth_tokens = AuthTokens(
                access_token=bearer_token,
                refresh_token="",  # We don't have the refresh token
                token_type="Bearer",
                expires_in=3600,  # Default expiration
                id_token=None  # We don't have the ID token
            )
            
            # Update session headers to match working request exactly
            if user_agent:
                self.session.headers.update({
                    'User-Agent': user_agent
                })
            
            self.session.headers.update({
                'Authorization': f'Bearer {bearer_token}',
                'ocp-apim-subscription-key': self.subscription_key,
                'Accept-Encoding': 'gzip',
                'Accept': 'application/meijer.shoppingList.ShoppingList-v1.0+json'
            })
            
            # Test the token by making a simple API call
            test_url = "https://api.meijer.com/loyalty/shoppinglist/GetList"
            self.logger.info(f"🧪 Testing Bearer token with: {test_url}")
            
            response = self.session.get(test_url)
            
            if response.status_code == 200:
                self.logger.info(f"✅ Bearer token authentication successful!")
                self.auth_status = AuthenticationStatus.AUTHENTICATED
                
                # Save tokens to config for future use
                self._save_tokens_to_config()
                
                return True
            elif response.status_code == 401:
                self.logger.error(f"❌ Bearer token is expired or invalid (401)")
                self.auth_status = AuthenticationStatus.UNAUTHENTICATED
                return False
            else:
                self.logger.warning(f"⚠️  Unexpected response: {response.status_code}")
                self.logger.info(f"Response: {response.text[:200]}...")
                self.auth_status = AuthenticationStatus.UNAUTHENTICATED
                return False
                
        except Exception as e:
            self.logger.error(f"❌ Bearer token authentication failed: {e}")
            self.auth_status = AuthenticationStatus.UNAUTHENTICATED
            return False
    
    def login_with_bearer_token(self, bearer_auth_file: str = "bearer_auth.txt") -> bool:
        """
        Login using a Bearer token from a file.
        
        Args:
            bearer_auth_file: Path to the bearer auth file
            
        Returns:
            True if successful, False otherwise
        """
        try:
            bearer_token, user_agent = read_bearer_auth_file(bearer_auth_file)
            return self.authenticate_with_bearer_token(bearer_token, user_agent)
        except Exception as e:
            self.logger.error(f"❌ Failed to login with Bearer token: {e}")
            return False

    def authenticate_with_requests(self, username: str, password: str) -> bool:
        """
        Authenticate using pure requests library instead of Selenium.
        
        This method follows the OAuth flow programmatically by:
        1. Creating a session with proper headers
        2. Following redirects and maintaining cookies
        3. Handling the login form submission
        4. Extracting the authorization code
        
        Args:
            username: Meijer account username/email
            password: Meijer account password
            
        Returns:
            True if successful, False otherwise
        """
        try:
            self.logger.info("🌐 Starting requests-based OAuth authentication")
            
            # Create a session for cookie management
            session = requests.Session()
            
            # Set headers to mimic a real browser
            session.headers.update({
                'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36',
                'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8',
                'Accept-Language': 'en-US,en;q=0.9',
                'Accept-Encoding': 'gzip, deflate, br',
                'DNT': '1',
                'Connection': 'keep-alive',
                'Upgrade-Insecure-Requests': '1',
            })
            
            # Step 1: Get the authorization URL and follow it
            auth_url, state, code_verifier = self.get_authorization_url(use_mobile_uri=False)
            self.logger.info(f"🔗 Following authorization URL: {auth_url[:80]}...")
            
            # Use the web-compatible redirect URI (no need to modify)
            # Follow the authorization URL
            response = session.get(auth_url, allow_redirects=True)
            self.logger.info(f"📄 Initial response status: {response.status_code}")
            
            # Step 2: Extract the login form from the response
            from bs4 import BeautifulSoup
            soup = BeautifulSoup(response.text, 'html.parser')
            
            # Look for the login form
            login_form = soup.find('form')
            if not login_form:
                self.logger.error("❌ Login form not found")
                return False
            
            # Extract form action and method
            form_action = login_form.get('action', '')
            form_method = login_form.get('method', 'post').upper()
            
            # Find CSRF token if present
            csrf_token = None
            csrf_input = soup.find('input', {'name': '_csrf'}) or soup.find('input', {'name': 'csrf'})
            if csrf_input:
                csrf_token = csrf_input.get('value')
                self.logger.info("🔒 CSRF token found")
            
            # Step 3: Submit the login form
            login_data = {
                'username': username,
                'password': password,
            }
            
            if csrf_token:
                login_data['_csrf'] = csrf_token
            
            # Add any other hidden fields from the form
            for hidden_input in login_form.find_all('input', {'type': 'hidden'}):
                name = hidden_input.get('name')
                value = hidden_input.get('value')
                if name and value and name not in login_data:
                    login_data[name] = value
            
            self.logger.info("🔐 Submitting login form...")
            
            # Determine the full URL for form submission
            if form_action.startswith('http'):
                submit_url = form_action
            elif form_action.startswith('/'):
                submit_url = f"https://id.meijer.com{form_action}"
            else:
                submit_url = response.url
            
            # Submit the form
            if form_method == 'POST':
                response = session.post(submit_url, data=login_data, allow_redirects=False)
            else:
                response = session.get(submit_url, params=login_data, allow_redirects=False)
            
            self.logger.info(f"📄 Login response status: {response.status_code}")
            
            # Step 4: Handle redirects and look for authorization code
            if response.status_code in [301, 302, 303, 307, 308]:
                redirect_url = response.headers.get('Location', '')
                self.logger.info(f"🔄 Following redirect: {redirect_url[:80]}...")
                
                # Follow the redirect
                response = session.get(redirect_url, allow_redirects=True)
                self.logger.info(f"📄 Final response status: {response.status_code}")
            
            # Step 5: Extract authorization code from response
            auth_code = self._extract_auth_code_from_response(response)
            
            if auth_code:
                self.logger.info(f"🎉 Authorization code found: {auth_code[:10]}...")
                
                # Exchange code for tokens
                success = self.authenticate_with_code(auth_code, code_verifier)
                if success:
                    self.logger.info("✅ Requests-based authentication completed successfully!")
                    return True
                else:
                    self.logger.error("❌ Failed to exchange auth code for tokens")
                    return False
            else:
                self.logger.error("❌ Authorization code not found in response")
                self.logger.debug(f"Response URL: {response.url}")
                self.logger.debug(f"Response content preview: {response.text[:500]}...")
                return False
                
        except Exception as e:
            self.logger.error(f"❌ Requests-based authentication failed: {e}")
            return False
    
    def _extract_auth_code_from_response(self, response) -> Optional[str]:
        """
        Extract authorization code from various response formats.
        
        Args:
            response: requests.Response object
            
        Returns:
            Authorization code if found, None otherwise
        """
        try:
            # Check URL for auth code
            if 'code=' in response.url:
                from urllib.parse import parse_qs, urlparse
                parsed = urlparse(response.url)
                query_params = parse_qs(parsed.query)
                if 'code' in query_params:
                    return query_params['code'][0]
            
            # Check response content for auth code patterns
            content = response.text
            import re
            
            patterns = [
                r'code=([a-zA-Z0-9_-]+)',
                r'authorization_code=([a-zA-Z0-9_-]+)',
                r'auth_code=([a-zA-Z0-9_-]+)',
                r'com\.meijer\.mobile\.meijer:/login\?code=([a-zA-Z0-9_-]+)'
            ]
            
            for pattern in patterns:
                match = re.search(pattern, content)
                if match:
                    return match.group(1)
            
            return None
            
        except Exception as e:
            self.logger.error(f"Error extracting auth code: {e}")
            return None


def read_auth_file(filepath: str = "auth.txt") -> Tuple[str, str]:
    """
    Read authentication credentials from auth.txt file.
    
    Args:
        filepath: Path to the auth file
        
    Returns:
        Tuple of (username, password)
        
    Raises:
        FileNotFoundError: If auth file doesn't exist
        ValueError: If auth file format is invalid
    """
    try:
        with open(filepath, 'r') as f:
            content = f.read().strip()
        
        username = None
        password = None
        
        for line in content.split('\n'):
            line = line.strip()
            if line.startswith('username='):
                username = line.split('=', 1)[1]
            elif line.startswith('password='):
                password = line.split('=', 1)[1]
        
        if not username or not password:
            raise ValueError("Both username and password must be specified in auth.txt")
        
        return username, password
        
    except FileNotFoundError:
        raise FileNotFoundError(f"Auth file not found: {filepath}")
    except Exception as e:
        raise ValueError(f"Error reading auth file: {e}")


def read_bearer_auth_file(filepath: str = "bearer_auth.txt") -> Tuple[str, str]:
    """
    Read Bearer token from bearer_auth.txt file.
    
    Args:
        filepath: Path to the bearer auth file
        
    Returns:
        tuple: (bearer_token, user_agent)
        
    Raises:
        FileNotFoundError: If the file doesn't exist
        ValueError: If the file format is invalid
    """
    try:
        bearer_token = None
        user_agent = None
        
        with open(filepath, 'r') as f:
            for line in f:
                line = line.strip()
                if line.startswith('bearer_token='):
                    bearer_token = line.split('=', 1)[1]
                elif line.startswith('user_agent='):
                    user_agent = line.split('=', 1)[1]
        
        if not bearer_token:
            raise ValueError(f"No bearer_token found in {filepath}")
        
        if not user_agent:
            user_agent = "Meijer/101200000 okhttp/4.12.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)"
        
        return bearer_token, user_agent
    
    except FileNotFoundError:
        raise FileNotFoundError(f"Bearer auth file not found: {filepath}")
    except Exception as e:
        raise ValueError(f"Error reading bearer auth file: {e}")


def main():
    """Example usage of the comprehensive Meijer client."""
    print("🚀 Meijer Comprehensive API Client")
    print("=" * 50)
    
    # Initialize client
    client = MeijerComprehensiveClient()
    
    try:
        # Attempt authentication
        if client.login():
            print("✅ Authentication successful!")
            
            # Get session info
            session_info = client.get_session_info()
            print(f"📊 Session Info: {json.dumps(session_info, indent=2)}")
            
            # Get user info
            user_info = client.get_user_info()
            if user_info:
                print(f"👤 User: {user_info.name} ({user_info.email})")
            
            # Get offers
            offers = client.get_offers(limit=5)
            print(f"🎯 Found {len(offers)} offers")
            
            # Get home cards
            home_cards = client.get_home_cards()
            print(f"🏠 Home cards loaded: {len(home_cards)} sections")
            
            # Get stores
            stores = client.get_stores(zip_code="49525")  # Example ZIP
            print(f"🏪 Found {len(stores)} stores")
            
        else:
            print("❌ Authentication failed")
    
    except KeyboardInterrupt:
        print("\n⏹️  Operation cancelled by user")
    except Exception as e:
        print(f"❌ Error: {e}")
    finally:
        client.logout()


if __name__ == "__main__":
    main() 