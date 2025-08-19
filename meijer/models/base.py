"""
Base models and enums for Meijer API responses.
"""

from dataclasses import dataclass
from datetime import datetime, timedelta
from enum import Enum
from typing import Optional


class ItemType(Enum):
    """Types of items that can be added to shopping lists."""

    PRODUCT = 1
    COUPON = 2
    WEEKLY_AD = 3
    MANUAL = 4


@dataclass
class AuthTokens:
    """Authentication tokens for Meijer API."""

    access_token: str
    refresh_token: str
    expires_in: int
    token_type: str = "Bearer"
    expires_at: Optional[datetime] = None

    def __post_init__(self):
        """Calculate expiration time if not provided."""
        if self.expires_at is None:
            self.expires_at = datetime.now() + timedelta(seconds=self.expires_in)

    def is_expired(self, buffer_seconds: int = 60) -> bool:
        """
        Check if tokens are expired.

        Args:
            buffer_seconds: Buffer time before actual expiration

        Returns:
            True if expired, False otherwise
        """
        if self.expires_at is None:
            return True
        return datetime.now() + timedelta(seconds=buffer_seconds) >= self.expires_at

    def time_until_expiry(self) -> Optional[timedelta]:
        """Get time until token expires."""
        if self.expires_at is None:
            return None
        return self.expires_at - datetime.now()

    def to_dict(self) -> dict:
        """Convert to dictionary for storage."""
        return {
            "access_token": self.access_token,
            "refresh_token": self.refresh_token,
            "expires_in": self.expires_in,
            "token_type": self.token_type,
            "expires_at": self.expires_at.isoformat() if self.expires_at else None,
        }

    @classmethod
    def from_dict(cls, data: dict) -> "AuthTokens":
        """Create from dictionary."""
        expires_at = None
        if data.get("expires_at"):
            try:
                expires_at = datetime.fromisoformat(data["expires_at"])
            except ValueError:
                pass

        return cls(
            access_token=data["access_token"],
            refresh_token=data["refresh_token"],
            expires_in=data["expires_in"],
            token_type=data.get("token_type", "Bearer"),
            expires_at=expires_at,
        )
