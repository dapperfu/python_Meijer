"""
Meijer API Data Models
=====================

Core data models and structures for the Meijer API client.
"""

from dataclasses import dataclass
from datetime import datetime, timedelta
from typing import Dict, Any, Optional, List


@dataclass
class AuthTokens:
    """Authentication tokens container with persistent storage support."""

    access_token: str
    refresh_token: Optional[str] = None
    id_token: Optional[str] = None
    token_type: str = "Bearer"
    expires_in: int = 3600
    expires_at: Optional[datetime] = None
    scope: Optional[str] = None
    device_secret: Optional[str] = None
    issued_token_type: Optional[str] = None

    def __post_init__(self):
        """Initialize expires_at if not provided."""
        if self.expires_at is None:
            self.expires_at = datetime.now() + timedelta(seconds=self.expires_in)

    @property
    def is_expired(self) -> bool:
        """Check if the token is expired."""
        return datetime.now() >= self.expires_at

    def time_until_expiry(self) -> timedelta:
        """Get time until token expires."""
        return self.expires_at - datetime.now()

    def is_expired_with_buffer(self, buffer_seconds: int = 300) -> bool:
        """Check if token is expired or will expire within buffer time."""
        return datetime.now() + timedelta(seconds=buffer_seconds) >= self.expires_at

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for persistent storage."""
        return {
            "access_token": self.access_token,
            "refresh_token": self.refresh_token,
            "id_token": self.id_token,
            "token_type": self.token_type,
            "expires_in": self.expires_in,
            "expires_at": self.expires_at.isoformat(),
            "scope": self.scope,
            "device_secret": self.device_secret,
            "issued_token_type": self.issued_token_type,
        }

    @classmethod
    def from_dict(cls, data: Dict[str, Any]) -> "AuthTokens":
        """Create AuthTokens from stored dictionary."""
        expires_at = datetime.fromisoformat(data["expires_at"])

        return cls(
            access_token=data["access_token"],
            refresh_token=data["refresh_token"],
            id_token=data["id_token"],
            token_type=data["token_type"],
            expires_in=data["expires_in"],
            expires_at=expires_at,
            scope=data["scope"],
            device_secret=data.get("device_secret"),
            issued_token_type=data.get("issued_token_type"),
        )


@dataclass
class UserInfo:
    """User information container."""

    user_id: str
    email: str
    first_name: str
    last_name: str
    member_id: str
    mperks_id: str
    phone: Optional[str] = None
    address: Optional[str] = None
    city: Optional[str] = None
    state: Optional[str] = None
    zip_code: Optional[str] = None


@dataclass
class ShopScanItem:
    """Shop & Scan item model."""

    upc: str
    name: str
    price: float
    quantity: int = 1
    total: Optional[float] = None
    category: Optional[str] = None
    brand: Optional[str] = None
    size: Optional[str] = None
    image_url: Optional[str] = None


@dataclass
class ShopScanTrip:
    """Shop & Scan trip model."""

    trip_id: str
    store_id: str
    started_at: datetime
    items: List[ShopScanItem]
    subtotal: float = 0.0
    tax: float = 0.0
    total: float = 0.0
    status: str = "active"


@dataclass
class ListItem:
    """Shopping list item model."""

    item_id: str
    name: str
    quantity: int = 1
    checked: bool = False
    upc: Optional[str] = None
    price: Optional[float] = None
    category: Optional[str] = None
    brand: Optional[str] = None
    size: Optional[str] = None
    image_url: Optional[str] = None
    notes: Optional[str] = None
    added_at: Optional[datetime] = None


@dataclass
class MeijerOffer:
    """Meijer offer/coupon information."""

    offer_id: str
    title: str
    description: str
    discount: str
    expiry_date: Optional[datetime] = None
    terms: Optional[str] = None
    category: Optional[str] = None
    brand: Optional[str] = None
    image_url: Optional[str] = None
    is_clipped: bool = False


@dataclass
class MeijerStore:
    """Meijer store information."""

    store_id: str
    name: str
    address: str
    city: str
    state: str
    zip_code: str
    phone: Optional[str] = None
    latitude: Optional[float] = None
    longitude: Optional[float] = None
    hours: Optional[Dict[str, str]] = None
    services: Optional[List[str]] = None
    distance: Optional[float] = None


@dataclass
class OAuthConfig:
    """OAuth configuration."""

    client_id: str = "0oa1o8g9njWsUvwsx697"
    redirect_uri: str = "com.meijer.mobile.meijer:/login"
    response_type: str = "code"
    scope: str = "openid profile offline_access"
    base_url: str = "https://id.meijer.com/oauth2/default/v1"

    @property
    def authorization_url(self) -> str:
        """Get the OAuth authorization URL."""
        return f"{self.base_url}/authorize"

    @property
    def token_url(self) -> str:
        """Get the OAuth token URL."""
        return f"{self.base_url}/token"
