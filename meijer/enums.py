"""
Meijer API Enumerations
======================

Enumeration classes for the Meijer API client.
"""

from enum import Enum


class AuthenticationStatus(Enum):
    """Authentication status enumeration."""

    UNAUTHENTICATED = "unauthenticated"
    AUTHENTICATED = "authenticated"
    EXPIRED = "expired"
    FAILED = "failed"


class HatColor(Enum):
    """Hat color enumeration for coupons."""

    RED = "red"
    BLUE = "blue"
    GREEN = "green"
    YELLOW = "yellow"


class BorderColor(Enum):
    """Border color enumeration for coupons."""

    RED = "red"
    BLUE = "blue"
    GREEN = "green"
    YELLOW = "yellow"
