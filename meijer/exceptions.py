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


class AuthenticationError(MeijerAuthenticationError):
    """Raised when authentication fails (alias for compatibility)."""

    pass


class TwoFactorRequiredError(Exception):
    """Raised when 2FA is required to complete authentication."""
    pass


class MFARequiredError(MeijerError):
    """Raised when multi-factor authentication is required."""

    pass


class MeijerAPIError(MeijerError):
    """Raised when API requests fail."""

    pass


class OKTAError(MeijerError):
    """Raised when OKTA-specific errors occur."""

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


class ShopScanError(MeijerError):
    """Raised when shop & scan operations fail."""

    pass


class CouponError(MeijerError):
    """Raised when coupon operations fail."""

    pass


# ============================================================================
# Error Handling Utilities
# ============================================================================

import logging
from typing import Any, Callable, Optional, TypeVar

# Type variable for return type
T = TypeVar('T')

def handle_meijer_operation(
    operation_name: str, 
    operation_func: Callable[..., T], 
    *args: Any, 
    **kwargs: Any
) -> Optional[T]:
    """
    Generic error handler for Meijer operations.
    
    This function provides centralized error handling for Meijer API operations,
    logging appropriate messages for different types of errors. Originally implemented
    as notebook example, now moved to core functionality.
    
    Parameters
    ----------
    operation_name : str
        Human-readable name for the operation being performed
    operation_func : Callable
        Function to execute within error handling
    *args : Any
        Positional arguments to pass to operation_func
    **kwargs : Any
        Keyword arguments to pass to operation_func
        
    Returns
    -------
    Optional[T]
        Result of operation_func if successful, None if any error occurred
        
    Examples
    --------
    >>> # Handle store search with automatic error handling
    >>> result = handle_meijer_operation(
    ...     "Store Search",
    ...     client.get_stores,
    ...     zip_code="49508",
    ...     limit=3
    ... )
    >>> 
    >>> # Handle product search with error handling
    >>> products = handle_meijer_operation(
    ...     "Product Search",
    ...     client.search_products,
    ...     "milk",
    ...     limit=5
    ... )
    """
    logger = logging.getLogger(__name__)
    logger.info(f"Executing: {operation_name}")

    try:
        result = operation_func(*args, **kwargs)
        logger.info(f"✅ {operation_name} succeeded")
        return result

    except MeijerAuthenticationError as e:
        logger.error(f"🔐 Authentication error in {operation_name}: {e}")
        return None

    except MeijerRateLimitError as e:
        logger.warning(f"⏱️  Rate limit error in {operation_name}: {e}")
        return None

    except CartError as e:
        logger.error(f"🛒 Cart error in {operation_name}: {e}")
        return None

    except FeedbackError as e:
        logger.error(f"💬 Feedback error in {operation_name}: {e}")
        return None

    except ShopScanError as e:
        logger.error(f"📱 Shop & Scan error in {operation_name}: {e}")
        return None

    except MeijerAPIError as e:
        logger.error(f"🌐 API error in {operation_name}: {e}")
        return None

    except MeijerError as e:
        logger.error(f"❌ General Meijer error in {operation_name}: {e}")
        return None

    except Exception as e:
        logger.error(f"💥 Unexpected error in {operation_name}: {e}")
        return None


def safe_meijer_call(
    func: Callable[..., T], 
    *args: Any, 
    default_return: T = None, 
    **kwargs: Any
) -> T:
    """
    Safely call a Meijer API function with automatic error handling.
    
    This is a simplified version of handle_meijer_operation that returns
    a default value instead of None on error, and doesn't require operation naming.
    
    Parameters
    ----------
    func : Callable
        Function to call safely
    *args : Any
        Positional arguments to pass to func
    default_return : T, optional
        Value to return on error (default: None)
    **kwargs : Any
        Keyword arguments to pass to func
        
    Returns
    -------
    T
        Result of func if successful, default_return if any error occurred
        
    Examples
    --------
    >>> # Safe store search with default empty list
    >>> stores = safe_meijer_call(client.get_stores, zip_code="49508", default_return=[])
    >>> 
    >>> # Safe search with fallback
    >>> products = safe_meijer_call(client.search_products, "milk", default_return=[])
    """
    logger = logging.getLogger(__name__)
    
    try:
        return func(*args, **kwargs)
    except MeijerError as e:
        logger.warning(f"Meijer API error: {e}")
        return default_return
    except Exception as e:
        logger.error(f"Unexpected error: {e}")
        return default_return


def retry_meijer_operation(
    operation_func: Callable[..., T],
    *args: Any,
    max_retries: int = 3,
    backoff_factor: float = 1.0,
    **kwargs: Any
) -> Optional[T]:
    """
    Retry a Meijer operation with exponential backoff.
    
    This function automatically retries failed operations with increasing
    delay between attempts, useful for handling temporary network issues
    or rate limiting.
    
    Parameters
    ----------
    operation_func : Callable
        Function to retry on failure
    *args : Any
        Positional arguments to pass to operation_func
    max_retries : int, optional
        Maximum number of retry attempts (default: 3)
    backoff_factor : float, optional
        Factor for exponential backoff delay (default: 1.0)
    **kwargs : Any
        Keyword arguments to pass to operation_func
        
    Returns
    -------
    Optional[T]
        Result of operation_func if successful, None if all retries failed
        
    Examples
    --------
    >>> # Retry store search with backoff
    >>> stores = retry_meijer_operation(
    ...     client.get_stores,
    ...     zip_code="49508",
    ...     max_retries=5,
    ...     backoff_factor=2.0
    ... )
    """
    import time
    
    logger = logging.getLogger(__name__)
    
    for attempt in range(max_retries + 1):
        try:
            result = operation_func(*args, **kwargs)
            if attempt > 0:
                logger.info(f"✅ Operation succeeded on attempt {attempt + 1}")
            return result
            
        except MeijerRateLimitError:
            if attempt < max_retries:
                delay = backoff_factor * (2 ** attempt)
                logger.warning(f"⏱️  Rate limited, retrying in {delay}s (attempt {attempt + 1}/{max_retries + 1})")
                time.sleep(delay)
                continue
            else:
                logger.error(f"❌ Rate limit exceeded after {max_retries + 1} attempts")
                return None
                
        except (MeijerAPIError, MeijerError) as e:
            if attempt < max_retries:
                delay = backoff_factor * (2 ** attempt)
                logger.warning(f"🔄 API error, retrying in {delay}s (attempt {attempt + 1}/{max_retries + 1}): {e}")
                time.sleep(delay)
                continue
            else:
                logger.error(f"❌ Operation failed after {max_retries + 1} attempts: {e}")
                return None
                
        except Exception as e:
            logger.error(f"💥 Unexpected error on attempt {attempt + 1}: {e}")
            return None
    
    return None


class MeijerErrorContext:
    """
    Context manager for handling Meijer operations with automatic error logging.
    
    This context manager provides a clean way to handle Meijer operations
    with automatic error catching and logging.
    
    Examples
    --------
    >>> with MeijerErrorContext("Store Search") as ctx:
    ...     stores = client.get_stores(zip_code="49508")
    ...     if ctx.success:
    ...         print(f"Found {len(stores)} stores")
    """
    
    def __init__(self, operation_name: str):
        """
        Initialize the error context.
        
        Parameters
        ----------
        operation_name : str
            Name of the operation for logging purposes
        """
        self.operation_name = operation_name
        self.success = False
        self.error = None
        self.logger = logging.getLogger(__name__)
    
    def __enter__(self):
        """Enter the context."""
        self.logger.info(f"🔄 Starting: {self.operation_name}")
        return self
    
    def __exit__(self, exc_type, exc_val, exc_tb):
        """Exit the context with error handling."""
        if exc_type is None:
            self.success = True
            self.logger.info(f"✅ {self.operation_name} completed successfully")
            return True
        
        self.error = exc_val
        
        if issubclass(exc_type, MeijerAuthenticationError):
            self.logger.error(f"🔐 Authentication error in {self.operation_name}: {exc_val}")
        elif issubclass(exc_type, MeijerRateLimitError):
            self.logger.warning(f"⏱️  Rate limit error in {self.operation_name}: {exc_val}")
        elif issubclass(exc_type, CartError):
            self.logger.error(f"🛒 Cart error in {self.operation_name}: {exc_val}")
        elif issubclass(exc_type, FeedbackError):
            self.logger.error(f"💬 Feedback error in {self.operation_name}: {exc_val}")
        elif issubclass(exc_type, ShopScanError):
            self.logger.error(f"📱 Shop & Scan error in {self.operation_name}: {exc_val}")
        elif issubclass(exc_type, MeijerAPIError):
            self.logger.error(f"🌐 API error in {self.operation_name}: {exc_val}")
        elif issubclass(exc_type, MeijerError):
            self.logger.error(f"❌ Meijer error in {self.operation_name}: {exc_val}")
        else:
            self.logger.error(f"💥 Unexpected error in {self.operation_name}: {exc_val}")
        
        # Suppress the exception (return True)
        return True



