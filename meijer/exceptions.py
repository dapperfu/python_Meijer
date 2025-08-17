"""
Meijer API Exception Classes
===========================

Custom exception classes for the Meijer API client.
"""


class MeijerError(Exception):
    """Base exception class for Meijer API errors."""

    pass


class MeijerAuthenticationError(MeijerError):
    """Raised when authentication fails."""

    pass


class MeijerAPIError(MeijerError):
    """Raised when API requests fail."""

    pass


class MeijerRateLimitError(MeijerError):
    """Raised when rate limits are exceeded."""

    pass


class CartError(MeijerError):
    """Raised when cart operations fail."""

    pass


class FeedbackError(MeijerError):
    """Raised when feedback operations fail."""

    pass
