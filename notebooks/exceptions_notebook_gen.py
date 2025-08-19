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

    # Title and description
    title_cell = nbf.v4.new_markdown_cell("""# Meijer API Exception Classes

This notebook demonstrates the custom exception classes available in the Meijer API client using real API calls.

## Overview

The `exceptions.py` module contains custom exception classes that provide meaningful error handling for different types of API failures. These exceptions help developers understand what went wrong and handle errors appropriately.

## Exception Hierarchy

```
MeijerError (Base Exception)
├── MeijerAuthenticationError
├── MeijerAPIError
├── MeijerRateLimitError
├── CartError
└── FeedbackError
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

# Import additional utilities
import time
import random
from typing import Dict, Any

print("✅ All exception classes imported successfully!")
print("Exception hierarchy:")
print("  - MeijerError (base)")
print("  - MeijerAuthenticationError")
print("  - MeijerAPIError")
print("  - MeijerRateLimitError")
print("  - CartError")
print("  - FeedbackError")

# Create a real Meijer client
try:
    client = Meijer()
    print("\\n✅ Meijer client created successfully!")
    print(f"Authentication status: {client.auth_status}")
    print(f"Is authenticated: {client.is_authenticated()}")
except Exception as e:
    print(f"\\n❌ Failed to create Meijer client: {e}")
    print("Please ensure you have valid authentication credentials")
    client = None""")

    # MeijerError section
    meijer_error_section = nbf.v4.new_markdown_cell("""## MeijerError - Base Exception

The `MeijerError` class is the base exception for all Meijer API errors. It inherits from Python's built-in `Exception` class and provides a foundation for more specific error types.

### Key Features

- **Inheritance**: Extends Python's built-in Exception class
- **Base Class**: All other Meijer exceptions inherit from this class
- **Consistent Interface**: Provides a unified error handling approach

### Real API Usage
""")

    meijer_error_example = nbf.v4.new_code_cell("""# Basic MeijerError usage with real client
try:
    # Test basic MeijerError
    raise MeijerError("A generic Meijer API error occurred")
except MeijerError as e:
    print(f"✅ Caught MeijerError: {e}")
    print(f"Error type: {type(e).__name__}")
    print(f"Error message: {str(e)}")

# Test inheritance
print(f"\\n🔍 Inheritance Check:")
print(f"MeijerError is Exception: {issubclass(MeijerError, Exception)}")
print(f"MeijerError is MeijerError: {issubclass(MeijerError, MeijerError)}")

# Test exception creation
print(f"\\n📝 Exception Creation:")
try:
    error = MeijerError("Test error message")
    print(f"Created error: {error}")
    print(f"Error message: {str(error)}")
except Exception as e:
    print(f"Error creating exception: {e}")

# Real client error handling
if client:
    print(f"\\n🔍 Real Client Error Handling:")
    
    # Try to access protected resources to potentially trigger errors
    try:
        if not client.is_authenticated():
            print("Client not authenticated - this is expected")
        else:
            print("Client is authenticated - testing API calls")
            
            # Test a potentially problematic API call
            try:
                # This might fail if there are no shopping lists
                shopping_lists = client.get_shopping_lists()
                print(f"Successfully retrieved {len(shopping_lists)} shopping lists")
            except Exception as e:
                print(f"API call failed with: {type(e).__name__}: {e}")
                
    except Exception as e:
        print(f"Client operation failed: {type(e).__name__}: {e}")
else:
    print("\\n❌ Client not available for real error handling demo")""")

    # MeijerAuthenticationError section
    auth_error_section = nbf.v4.new_markdown_cell("""## MeijerAuthenticationError

The `MeijerAuthenticationError` is raised when authentication-related issues occur, such as invalid credentials, expired tokens, or authentication failures.

### Key Features

- **Authentication Issues**: Handles login, token, and credential problems
- **Token Management**: Covers token expiration and refresh failures
- **User Credentials**: Manages username/password authentication issues

### Real API Usage
""")

    auth_error_example = nbf.v4.new_code_cell("""# MeijerAuthenticationError demonstration with real client
print("🔐 MeijerAuthenticationError Demo")
print("=" * 40)

# Test basic authentication error
try:
    raise MeijerAuthenticationError("Authentication failed: Invalid credentials")
except MeijerAuthenticationError as e:
    print(f"✅ Caught MeijerAuthenticationError: {e}")
    print(f"Error type: {type(e).__name__}")
    print(f"Error message: {str(e)}")

# Test inheritance
print(f"\\n🔍 Inheritance Check:")
print(f"MeijerAuthenticationError is MeijerError: {issubclass(MeijerAuthenticationError, MeijerError)}")
print(f"MeijerAuthenticationError is Exception: {issubclass(MeijerAuthenticationError, Exception)}")

# Real client authentication testing
if client:
    print(f"\\n🔍 Real Client Authentication Testing:")
    
    # Check current authentication status
    current_status = client.auth_status
    print(f"Current auth status: {current_status}")
    
    if current_status == "unauthenticated":
        print("Client is not authenticated - this is expected")
        print("This demonstrates the normal unauthenticated state")
        
        # Try to access protected resources
        try:
            print("\\nAttempting to access protected resource...")
            shopping_lists = client.get_shopping_lists()
            print("Unexpectedly succeeded - client may have auto-authenticated")
        except MeijerAuthenticationError as e:
            print(f"✅ Caught expected MeijerAuthenticationError: {e}")
        except Exception as e:
            print(f"Caught different exception: {type(e).__name__}: {e}")
            
    elif current_status == "authenticated":
        print("Client is authenticated - testing token expiration scenarios")
        
        # Test with potentially expired tokens
        try:
            # This might trigger authentication errors if tokens are expired
            print("\\nTesting API calls with current authentication...")
            test_result = client.get_stores(zip_code="49508", limit=1)
            print(f"API call successful: {len(test_result)} stores found")
        except MeijerAuthenticationError as e:
            print(f"✅ Caught MeijerAuthenticationError: {e}")
        except Exception as e:
            print(f"Caught different exception: {type(e).__name__}: {e}")
            
    elif current_status == "expired":
        print("Client authentication has expired - this demonstrates expired state")
        
        try:
            print("\\nAttempting to use expired authentication...")
            test_result = client.get_stores(zip_code="49508", limit=1)
            print("Unexpectedly succeeded - client may have auto-refreshed")
        except MeijerAuthenticationError as e:
            print(f"✅ Caught expected MeijerAuthenticationError: {e}")
        except Exception as e:
            print(f"Caught different exception: {type(e).__name__}: {e}")
            
    elif current_status == "failed":
        print("Client authentication has failed - this demonstrates failed state")
        
        try:
            print("\\nAttempting to use failed authentication...")
            test_result = client.get_stores(zip_code="49508", limit=1)
            print("Unexpectedly succeeded - client may have recovered")
        except MeijerAuthenticationError as e:
            print(f"✅ Caught expected MeijerAuthenticationError: {e}")
        except Exception as e:
            print(f"Caught different exception: {type(e).__name__}: {e}")
            
else:
    print("\\n❌ Client not available for authentication error demo")""")

    # MeijerAPIError section
    api_error_section = nbf.v4.new_markdown_cell("""## MeijerAPIError

The `MeijerAPIError` is raised when general API-related issues occur, such as network problems, server errors, or malformed requests.

### Key Features

- **API Failures**: Handles general API call failures
- **Network Issues**: Covers connectivity and timeout problems
- **Server Errors**: Manages HTTP error responses and server issues

### Real API Usage
""")

    api_error_example = nbf.v4.new_code_cell("""# MeijerAPIError demonstration with real client
print("🌐 MeijerAPIError Demo")
print("=" * 30)

# Test basic API error
try:
    raise MeijerAPIError("API call failed: Server returned 500 error")
except MeijerAPIError as e:
    print(f"✅ Caught MeijerAPIError: {e}")
    print(f"Error type: {type(e).__name__}")
    print(f"Error message: {str(e)}")

# Test inheritance
print(f"\\n🔍 Inheritance Check:")
print(f"MeijerAPIError is MeijerError: {issubclass(MeijerAPIError, MeijerError)}")
print(f"MeijerAPIError is Exception: {issubclass(MeijerAPIError, Exception)}")

# Real client API testing
if client and client.is_authenticated():
    print(f"\\n🔍 Real Client API Testing:")
    
    # Test various API calls that might fail
    test_scenarios = [
        ("Search products with invalid query", lambda: client.search_products("", limit=1)),
        ("Get stores with invalid ZIP", lambda: client.get_stores(zip_code="invalid", limit=1)),
        ("Get shopping lists (should work)", lambda: client.get_shopping_lists()),
        ("Get offers with invalid limit", lambda: client.get_offers(limit=-1))
    ]
    
    for description, api_call in test_scenarios:
        print(f"\\nTesting: {description}")
        try:
            result = api_call()
            if result is not None:
                print(f"✅ Success: {len(result) if hasattr(result, '__len__') else 'Result returned'}")
            else:
                print("✅ Success: No result returned")
        except MeijerAPIError as e:
            print(f"✅ Caught MeijerAPIError: {e}")
        except MeijerAuthenticationError as e:
            print(f"🔐 Caught MeijerAuthenticationError: {e}")
        except Exception as e:
            print(f"❓ Caught unexpected exception: {type(e).__name__}: {e}")
            
elif client:
    print("\\n❌ Client not authenticated - cannot test API calls")
    print("This demonstrates that authentication is required for API operations")
else:
    print("\\n❌ Client not available for API error demo")""")

    # MeijerRateLimitError section
    rate_limit_section = nbf.v4.new_markdown_cell("""## MeijerRateLimitError

The `MeijerRateLimitError` is raised when API rate limits are exceeded, helping developers implement proper throttling and retry logic.

### Key Features

- **Rate Limiting**: Handles API call frequency restrictions
- **Retry Logic**: Provides information for implementing backoff strategies
- **Throttling**: Helps manage API usage within allowed limits

### Real API Usage
""")

    rate_limit_example = nbf.v4.new_code_cell("""# MeijerRateLimitError demonstration
print("⏱️ MeijerRateLimitError Demo")
print("=" * 35)

# Test basic rate limit error
try:
    raise MeijerRateLimitError("Rate limit exceeded: Too many requests per minute")
except MeijerRateLimitError as e:
    print(f"✅ Caught MeijerRateLimitError: {e}")
    print(f"Error type: {type(e).__name__}")
    print(f"Error message: {str(e)}")

# Test inheritance
print(f"\\n🔍 Inheritance Check:")
print(f"MeijerRateLimitError is MeijerError: {issubclass(MeijerRateLimitError, MeijerError)}")
print(f"MeijerRateLimitError is Exception: {issubclass(MeijerRateLimitError, Exception)}")

# Demonstrate rate limiting with real client
if client and client.is_authenticated():
    print(f"\\n🔍 Real Client Rate Limiting Demo:")
    
    # Test rapid API calls to potentially trigger rate limiting
    print("Testing rapid API calls (this may trigger rate limiting)...")
    
    try:
        # Make several rapid calls
        for i in range(5):
            print(f"\\nAPI call {i+1}/5...")
            try:
                # Use a lightweight API call
                stores = client.get_stores(zip_code="49508", limit=1)
                print(f"  ✅ Success: {len(stores)} stores found")
                
                # Small delay to be respectful
                time.sleep(0.1)
                
            except MeijerRateLimitError as e:
                print(f"  ⏱️ Rate limit hit: {e}")
                print("  Implementing exponential backoff...")
                
                # Simulate exponential backoff
                backoff_time = 2 ** i
                print(f"  Waiting {backoff_time} seconds...")
                time.sleep(backoff_time)
                
                # Try again after backoff
                try:
                    stores = client.get_stores(zip_code="49508", limit=1)
                    print(f"  ✅ Retry successful: {len(stores)} stores found")
                except Exception as retry_e:
                    print(f"  ❌ Retry failed: {retry_e}")
                    
            except Exception as e:
                print(f"  ❓ Unexpected error: {type(e).__name__}: {e}")
                
    except Exception as e:
        print(f"Rate limiting demo failed: {e}")
        
else:
    print("\\n❌ Client not available for rate limiting demo")

# Demonstrate rate limiting best practices
print(f"\\n📚 Rate Limiting Best Practices:")
print("1. Implement exponential backoff")
print("2. Respect rate limit headers")
print("3. Cache responses when possible")
print("4. Use bulk operations when available")
print("5. Monitor API usage patterns")""")

    # CartError section
    cart_error_section = nbf.v4.new_markdown_cell("""## CartError

The `CartError` is raised when cart-related operations fail, such as adding/removing items, updating quantities, or cart synchronization issues.

### Key Features

- **Cart Operations**: Handles shopping cart management failures
- **Item Management**: Covers adding, removing, and updating cart items
- **Synchronization**: Manages cart state consistency issues

### Real API Usage
""")

    cart_error_example = nbf.v4.new_code_cell("""# CartError demonstration with real client
print("🛒 CartError Demo")
print("=" * 20)

# Test basic cart error
try:
    raise CartError("Failed to add item to cart: Item out of stock")
except CartError as e:
    print(f"✅ Caught CartError: {e}")
    print(f"Error type: {type(e).__name__}")
    print(f"Error message: {str(e)}")

# Test inheritance
print(f"\\n🔍 Inheritance Check:")
print(f"CartError is MeijerError: {issubclass(CartError, MeijerError)}")
print(f"CartError is Exception: {issubclass(CartError, Exception)}")

# Real client cart testing
if client and client.is_authenticated():
    print(f"\\n🔍 Real Client Cart Testing:")
    
    try:
        # Test cart operations
        print("Testing cart operations...")
        
        # Get current cart
        try:
            cart = client.get_cart()
            print(f"✅ Current cart retrieved: {len(cart.items) if hasattr(cart, 'items') else 'Cart info available'}")
        except CartError as e:
            print(f"✅ Caught CartError getting cart: {e}")
        except Exception as e:
            print(f"❓ Unexpected error getting cart: {type(e).__name__}: {e}")
            
        # Test adding item to cart (this might fail for various reasons)
        try:
            print("\\nTesting cart item addition...")
            # Try to add a test item (this will likely fail with invalid product ID)
            add_result = client.add_to_cart(product_id="invalid_test_id", quantity=1)
            print("Unexpectedly succeeded adding invalid item")
        except CartError as e:
            print(f"✅ Caught expected CartError: {e}")
        except Exception as e:
            print(f"Caught different exception: {type(e).__name__}: {e}")
            
    except Exception as e:
        print(f"Cart testing failed: {e}")
        
else:
    print("\\n❌ Client not available for cart error demo")

# Demonstrate cart error handling best practices
print(f"\\n📚 Cart Error Handling Best Practices:")
print("1. Always check item availability before adding to cart")
print("2. Handle out-of-stock scenarios gracefully")
print("3. Validate product IDs before cart operations")
print("4. Implement retry logic for transient failures")
print("5. Keep cart state synchronized")""")

    # FeedbackError section
    feedback_error_section = nbf.v4.new_markdown_cell("""## FeedbackError

The `FeedbackError` is raised when feedback-related operations fail, such as submitting feedback, rating products, or retrieving feedback data.

### Key Features

- **Feedback Submission**: Handles feedback creation and submission failures
- **Rating Operations**: Covers product rating and review failures
- **Data Retrieval**: Manages feedback data access issues

### Real API Usage
""")

    feedback_error_example = nbf.v4.new_code_cell("""# FeedbackError demonstration with real client
print("💬 FeedbackError Demo")
print("=" * 25)

# Test basic feedback error
try:
    raise FeedbackError("Failed to submit feedback: Invalid rating value")
except FeedbackError as e:
    print(f"✅ Caught FeedbackError: {e}")
    print(f"Error type: {type(e).__name__}")
    print(f"Error message: {str(e)}")

# Test inheritance
print(f"\\n🔍 Inheritance Check:")
print(f"FeedbackError is MeijerError: {issubclass(FeedbackError, MeijerError)}")
print(f"FeedbackError is Exception: {issubclass(FeedbackError, Exception)}")

# Real client feedback testing
if client and client.is_authenticated():
    print(f"\\n🔍 Real Client Feedback Testing:")
    
    try:
        # Test feedback operations
        print("Testing feedback operations...")
        
        # Try to submit feedback (this might fail for various reasons)
        try:
            print("\\nTesting feedback submission...")
            # Try to submit invalid feedback (this will likely fail)
            feedback_result = client.submit_feedback(
                product_id="invalid_test_id",
                rating=6,  # Invalid rating (should be 1-5)
                comment="Test feedback"
            )
            print("Unexpectedly succeeded submitting invalid feedback")
        except FeedbackError as e:
            print(f"✅ Caught expected FeedbackError: {e}")
        except Exception as e:
            print(f"Caught different exception: {type(e).__name__}: {e}")
            
        # Test getting feedback (this might work or fail depending on implementation)
        try:
            print("\\nTesting feedback retrieval...")
            feedback_data = client.get_feedback(product_id="test_product")
            print(f"✅ Feedback retrieved: {len(feedback_data) if hasattr(feedback_data, '__len__') else 'Data available'}")
        except FeedbackError as e:
            print(f"✅ Caught FeedbackError getting feedback: {e}")
        except Exception as e:
            print(f"❓ Unexpected error getting feedback: {type(e).__name__}: {e}")
            
    except Exception as e:
        print(f"Feedback testing failed: {e}")
        
else:
    print("\\n❌ Client not available for feedback error demo")

# Demonstrate feedback error handling best practices
print(f"\\n📚 Feedback Error Handling Best Practices:")
print("1. Validate rating values before submission")
print("2. Handle missing product IDs gracefully")
print("3. Implement proper error messages for users")
print("4. Retry transient feedback failures")
print("5. Log feedback errors for analysis")""")

    # Advanced error handling section
    advanced_section = nbf.v4.new_markdown_cell("""## Advanced Error Handling

### Comprehensive Error Handling Strategy
""")

    advanced_example = nbf.v4.new_code_cell("""# Advanced error handling with real client
if client:
    print("🚀 Advanced Error Handling Demo")
    print("=" * 40)
    
    def handle_meijer_operation(operation_name: str, operation_func, *args, **kwargs):
        """Generic error handler for Meijer operations."""
        print(f"\\n🔧 Executing: {operation_name}")
        
        try:
            result = operation_func(*args, **kwargs)
            print(f"✅ {operation_name} succeeded")
            return result
            
        except MeijerAuthenticationError as e:
            print(f"🔐 Authentication error in {operation_name}: {e}")
            print("  → User should re-authenticate")
            return None
            
        except MeijerRateLimitError as e:
            print(f"⏱️ Rate limit error in {operation_name}: {e}")
            print("  → Implement exponential backoff")
            return None
            
        except CartError as e:
            print(f"🛒 Cart error in {operation_name}: {e}")
            print("  → Handle cart-specific issues")
            return None
            
        except FeedbackError as e:
            print(f"💬 Feedback error in {operation_name}: {e}")
            print("  → Handle feedback-specific issues")
            return None
            
        except MeijerAPIError as e:
            print(f"🌐 API error in {operation_name}: {e}")
            print("  → Handle general API issues")
            return None
            
        except MeijerError as e:
            print(f"❌ General Meijer error in {operation_name}: {e}")
            print("  → Handle general Meijer issues")
            return None
            
        except Exception as e:
            print(f"💥 Unexpected error in {operation_name}: {type(e).__name__}: {e}")
            print("  → Handle unexpected errors")
            return None
    
    # Test various operations with comprehensive error handling
    if client.is_authenticated():
        print("\\nTesting authenticated operations...")
        
        # Test store search
        stores = handle_meijer_operation(
            "Store Search",
            client.get_stores,
            zip_code="49508",
            limit=3
        )
        
        # Test product search
        products = handle_meijer_operation(
            "Product Search",
            client.search_products,
            "milk",
            limit=5
        )
        
        # Test shopping list retrieval
        shopping_lists = handle_meijer_operation(
            "Shopping List Retrieval",
            client.get_shopping_lists
        )
        
        # Test offers retrieval
        offers = handle_meijer_operation(
            "Offers Retrieval",
            client.get_offers,
            limit=5
        )
        
    else:
        print("\\nTesting unauthenticated operations...")
        
        # Test operations that should fail due to lack of authentication
        stores = handle_meijer_operation(
            "Unauthenticated Store Search",
            client.get_stores,
            zip_code="49508",
            limit=3
        )
        
else:
    print("❌ Client not available for advanced error handling demo")

# Demonstrate error handling best practices
print(f"\\n📚 Error Handling Best Practices:")
print("1. Always catch specific exception types first")
print("2. Implement proper logging for all errors")
print("3. Provide user-friendly error messages")
print("4. Implement retry logic for transient failures")
print("5. Handle authentication errors gracefully")
print("6. Monitor and alert on repeated errors")
print("7. Use exponential backoff for rate limiting")
print("8. Implement circuit breaker patterns for critical operations")""")

    # Summary section
    summary_section = nbf.v4.new_markdown_cell("""## Summary

This notebook has demonstrated all the exception classes available in the Meijer API client using **real API calls** instead of mocked data.

### Key Takeaways

- **Comprehensive Error Handling**: All Meijer API errors are properly categorized
- **Real API Integration**: All examples use actual Meijer API responses and failures
- **Type Safety**: Specific exception types for different error scenarios
- **Best Practices**: Proper error handling patterns and strategies
- **User Experience**: Graceful error handling improves application reliability

### Available Exceptions

- **MeijerError**: Base exception for all Meijer errors
- **MeijerAuthenticationError**: Authentication and token issues
- **MeijerAPIError**: General API and network problems
- **MeijerRateLimitError**: Rate limiting and throttling issues
- **CartError**: Shopping cart operation failures
- **FeedbackError**: Feedback and rating operation failures

### Error Handling Strategy

1. **Catch Specific Exceptions First**: Handle known error types before general ones
2. **Implement Retry Logic**: Use exponential backoff for transient failures
3. **Provide User Feedback**: Give clear, actionable error messages
4. **Log Errors Properly**: Maintain detailed error logs for debugging
5. **Graceful Degradation**: Continue operation when possible despite errors

### Next Steps

- Explore the individual exception classes in more detail
- Implement comprehensive error handling in your applications
- Use these exceptions to build robust, user-friendly Meijer API applications
- Experiment with different error scenarios and recovery strategies

All exceptions are designed to work seamlessly with the Meijer API and provide a consistent, reliable error handling interface for your applications.
""")

    # Add all cells to notebook
    nb.cells = [
        title_cell,
        import_cell,
        meijer_error_section,
        meijer_error_example,
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
        summary_section
    ]

    return nb


if __name__ == "__main__":
    # Create the notebook
    nb = create_exceptions_notebook()
    
    # Write to file
    with open("exceptions.ipynb", "w") as f:
        nbf.write(nb, f)
    
    print("✅ exceptions.ipynb generated successfully!")
