#!/usr/bin/env python3
"""
Generate Jupyter notebook for Meijer exceptions.py

This script creates a comprehensive notebook demonstrating all exception classes
and their usage with real API calls to Meijer endpoints.
"""

import nbformat as nbf


def create_exceptions_notebook():
    """Create the exceptions notebook."""

    # Create notebook
    nb = nbf.v4.new_notebook()

    # Title cell
    title_cell = nbf.v4.new_markdown_cell("""# Meijer API Exception Classes

This notebook demonstrates the custom exception classes available in the Meijer API client using real API calls.

## Overview

The `exceptions.py` module contains custom exception classes that provide meaningful error handling for different types of API failures.

## Exception Hierarchy

```
MeijerError (Base Exception)
|-- MeijerAuthenticationError
|-- MeijerAPIError
|-- MeijerRateLimitError
|-- CartError
|-- FeedbackError
```

## Setup

First, let's import the necessary modules and create a real Meijer client:
""")

    # Import cell
    import_cell = nbf.v4.new_code_cell("""# Import the exception classes and client
from meijer.exceptions import (
    MeijerError,
    MeijerAuthenticationError,
    MeijerAPIError,
    MeijerRateLimitError,
    CartError,
    FeedbackError
)
from meijer.client import Meijer

print("[OK] All exception classes imported successfully!")

# Create a real Meijer client
try:
    client = Meijer()
    print("[OK] Meijer client created successfully!")
    print(f"Authentication status: {client.auth_status}")
    print(f"Is authenticated: {client.is_authenticated()}")
except Exception as e:
    print(f"[X] Failed to create Meijer client: {e}")
    client = None""")

    # MeijerError section
    base_error_section = nbf.v4.new_markdown_cell("""## MeijerError - Base Exception

The `MeijerError` class is the base exception for all Meijer API errors.

### Real API Usage
""")

    base_error_example = nbf.v4.new_code_cell("""# Test MeijerError with real client
try:
    raise MeijerError("A generic Meijer API error occurred")
except MeijerError as e:
    print(f"[OK] Caught MeijerError: {e}")
    print(f"Error type: {type(e).__name__}")

# Real client error handling
if client:
    try:
        if not client.is_authenticated():
            print("Client not authenticated - this is expected")
        else:
            # Test API call that might fail
            shopping_lists = client.get_shopping_lists()
            print(f"Retrieved {len(shopping_lists)} shopping lists")
    except Exception as e:
        print(f"API call failed: {type(e).__name__}: {e}")
else:
    print("[X] Client not available")""")

    # Authentication Error section
    auth_error_section = nbf.v4.new_markdown_cell("""## MeijerAuthenticationError

Raised when authentication-related issues occur.

### Real API Usage
""")

    auth_error_example = nbf.v4.new_code_cell("""# Test MeijerAuthenticationError
try:
    raise MeijerAuthenticationError("Authentication failed")
except MeijerAuthenticationError as e:
    print(f"[OK] Caught MeijerAuthenticationError: {e}")

# Real authentication testing
if client:
    print(f"Current auth status: {client.auth_status}")

    if client.auth_status == "unauthenticated":
        try:
            shopping_lists = client.get_shopping_lists()
            print("Unexpectedly succeeded")
        except MeijerAuthenticationError as e:
            print(f"[OK] Expected auth error: {e}")
        except Exception as e:
            print(f"Different error: {type(e).__name__}: {e}")
else:
    print("[X] Client not available")""")

    # API Error section
    api_error_section = nbf.v4.new_markdown_cell("""## MeijerAPIError

Raised when general API issues occur.

### Real API Usage
""")

    api_error_example = nbf.v4.new_code_cell("""# Test MeijerAPIError
try:
    raise MeijerAPIError("API call failed")
except MeijerAPIError as e:
    print(f"[OK] Caught MeijerAPIError: {e}")

# Real API testing
if client and client.is_authenticated():
    try:
        # Test with invalid parameters
        stores = client.get_stores(zip_code="invalid")
        print(f"Found {len(stores)} stores")
    except MeijerAPIError as e:
        print(f"[OK] API error: {e}")
    except Exception as e:
        print(f"Different error: {type(e).__name__}: {e}")
else:
    print("[X] Client not authenticated")""")

    # Rate Limit Error section
    rate_limit_section = nbf.v4.new_markdown_cell("""## MeijerRateLimitError

Raised when API rate limits are exceeded.

### Real API Usage
""")

    rate_limit_example = nbf.v4.new_code_cell("""# Test MeijerRateLimitError
try:
    raise MeijerRateLimitError("Rate limit exceeded")
except MeijerRateLimitError as e:
    print(f"[OK] Caught MeijerRateLimitError: {e}")

# Real rate limiting demo
if client and client.is_authenticated():
    print("Testing rapid API calls...")
    import time

    for i in range(3):
        try:
            stores = client.get_stores(zip_code="49508", limit=1)
            print(f"Call {i+1}: Found {len(stores)} stores")
            time.sleep(0.1)  # Be respectful
        except MeijerRateLimitError as e:
            print(f"⏱️ Rate limit hit: {e}")
        except Exception as e:
            print(f"Error: {type(e).__name__}: {e}")
else:
    print("[X] Client not authenticated")""")

    # Cart Error section
    cart_error_section = nbf.v4.new_markdown_cell("""## CartError

Raised when cart operations fail.

### Real API Usage
""")

    cart_error_example = nbf.v4.new_code_cell("""# Test CartError
try:
    raise CartError("Failed to add item to cart")
except CartError as e:
    print(f"[OK] Caught CartError: {e}")

# Real cart testing
if client and client.is_authenticated():
    try:
        # Try to add invalid item
        result = client.add_to_cart(product_id="invalid", quantity=1)
        print("Unexpectedly succeeded")
    except CartError as e:
        print(f"[OK] Expected cart error: {e}")
    except Exception as e:
        print(f"Different error: {type(e).__name__}: {e}")
else:
    print("[X] Client not authenticated")""")

    # Feedback Error section
    feedback_error_section = nbf.v4.new_markdown_cell("""## FeedbackError

Raised when feedback operations fail.

### Real API Usage
""")

    feedback_error_example = nbf.v4.new_code_cell("""# Test FeedbackError
try:
    raise FeedbackError("Failed to submit feedback")
except FeedbackError as e:
    print(f"[OK] Caught FeedbackError: {e}")

# Real feedback testing
if client and client.is_authenticated():
    try:
        # Try invalid feedback
        result = client.submit_feedback(
            product_id="invalid",
            rating=6,  # Invalid rating
            comment="Test"
        )
        print("Unexpectedly succeeded")
    except FeedbackError as e:
        print(f"[OK] Expected feedback error: {e}")
    except Exception as e:
        print(f"Different error: {type(e).__name__}: {e}")
else:
    print("[X] Client not authenticated")""")

    # Advanced usage section
    advanced_section = nbf.v4.new_markdown_cell("""## Advanced Error Handling

Comprehensive error handling with real API calls.
""")

    advanced_example = nbf.v4.new_code_cell("""# Advanced error handling
def handle_meijer_operation(operation_name, operation_func, *args, **kwargs):
    \"\"\"Generic error handler for Meijer operations.\"\"\"
    print(f"\\nExecuting: {operation_name}")

    try:
        result = operation_func(*args, **kwargs)
        print(f"[OK] {operation_name} succeeded")
        return result

    except MeijerAuthenticationError as e:
        print(f"[LOCK] Authentication error: {e}")
        return None

    except MeijerRateLimitError as e:
        print(f"⏱️ Rate limit error: {e}")
        return None

    except CartError as e:
        print(f"[CART] Cart error: {e}")
        return None

    except FeedbackError as e:
        print(f"[SPEECH] Feedback error: {e}")
        return None

    except MeijerAPIError as e:
        print(f"[WEB] API error: {e}")
        return None

    except MeijerError as e:
        print(f"[X] General Meijer error: {e}")
        return None

    except Exception as e:
        print(f"[COLLISION] Unexpected error: {type(e).__name__}: {e}")
        return None

# Test with real operations
if client and client.is_authenticated():
    # Test store search
    handle_meijer_operation(
        "Store Search",
        client.get_stores,
        zip_code="49508",
        limit=3
    )

    # Test product search
    handle_meijer_operation(
        "Product Search",
        client.search_products,
        "milk",
        limit=5
    )
else:
    print("[X] Client not authenticated for advanced demo")""")

    # Summary section
    summary_section = nbf.v4.new_markdown_cell("""## Summary

This notebook demonstrated all exception classes using **real API calls**:

- **MeijerError**: Base exception for all Meijer errors
- **MeijerAuthenticationError**: Authentication issues
- **MeijerAPIError**: General API problems
- **MeijerRateLimitError**: Rate limiting issues
- **CartError**: Shopping cart failures
- **FeedbackError**: Feedback operation failures

### Best Practices

1. Always catch specific exception types first
2. Implement proper logging for all errors
3. Provide user-friendly error messages
4. Use exponential backoff for rate limiting
5. Handle authentication gracefully

All examples use actual Meijer API endpoints instead of mocked data.
""")

    # Add all cells to notebook
    nb.cells = [
        title_cell,
        import_cell,
        base_error_section,
        base_error_example,
        auth_error_section,
        auth_error_example,
        api_error_section,
        api_error_example,
        rate_limit_section,
        rate_limit_example,
        cart_error_section,
        cart_error_example,
        feedback_error_section,
        feedback_error_example,
        advanced_section,
        advanced_example,
        summary_section,
    ]

    return nb


if __name__ == "__main__":
    # Create and write notebook
    nb = create_exceptions_notebook()

    with open("exceptions.ipynb", "w") as f:
        nbf.write(nb, f)

    print("[OK] exceptions.ipynb generated successfully!")
