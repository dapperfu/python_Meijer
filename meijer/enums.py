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
