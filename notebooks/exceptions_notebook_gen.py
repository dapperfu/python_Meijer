#!/usr/bin/env python3
"""
Generate Jupyter notebook for Meijer exceptions.py

This script creates a comprehensive notebook demonstrating all exception classes
and their usage with practical examples.
"""

import nbformat as nbf

def create_exceptions_notebook():
    """Create the exceptions notebook."""
    
    # Create notebook
    nb = nbf.v4.new_notebook()
    
    # Title and description
    title_cell = nbf.v4.new_markdown_cell("""# Meijer API Exception Classes

This notebook demonstrates the custom exception classes available in the Meijer API client.

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

First, let's import the necessary modules:
""")
    
    # Import cell
    import_cell = nbf.v4.new_code_cell("""# Import the exception classes
from meijer.exceptions import (
    MeijerError,
    MeijerAuthenticationError,
    MeijerAPIError,
    MeijerRateLimitError,
    CartError,
    FeedbackError
)

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
print("  - FeedbackError")""")
    
    # Base exception section
    base_exception_section = nbf.v4.new_markdown_cell("""## MeijerError - Base Exception

The `MeijerError` class is the base exception for all Meijer API errors. It inherits from Python's built-in `Exception` class and provides a foundation for more specific error types.

### Key Features

- **Inheritance**: Extends Python's built-in Exception class
- **Base Class**: All other Meijer exceptions inherit from this class
- **Consistent Interface**: Provides a unified error handling approach

### Basic Usage
""")
    
    base_exception_example = nbf.v4.new_code_cell("""# Basic MeijerError usage
try:
    # Simulate a generic Meijer error
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
base_error = MeijerError("Custom error message")
print(f"\\n📝 Custom Error:")
print(f"Message: {base_error}")
print(f"Type: {type(base_error).__name__}")
print(f"String representation: {str(base_error)}")""")
    
    # Authentication error section
    auth_error_section = nbf.v4.new_markdown_cell("""## MeijerAuthenticationError

The `MeijerAuthenticationError` is raised when authentication operations fail, such as invalid credentials, expired tokens, or authentication service unavailability.

### Key Features

- **Specific Purpose**: Handles authentication-related failures
- **Inheritance**: Extends MeijerError for consistent error handling
- **Common Scenarios**: Invalid credentials, expired tokens, auth service issues

### Basic Usage
""")
    
    auth_error_example = nbf.v4.new_code_cell("""# MeijerAuthenticationError examples
def simulate_authentication(username: str, password: str) -> bool:
    \"\"\"Simulate authentication process with potential errors.\"\"\"
    # Simulate various authentication scenarios
    if username == "expired_user":
        raise MeijerAuthenticationError("Authentication token has expired")
    elif username == "invalid_creds":
        raise MeijerAuthenticationError("Invalid username or password")
    elif username == "locked_account":
        raise MeijerAuthenticationError("Account is temporarily locked due to multiple failed attempts")
    elif username == "service_unavailable":
        raise MeijerAuthenticationError("Authentication service is currently unavailable")
    elif username == "valid_user" and password == "valid_pass":
        return True
    else:
        raise MeijerAuthenticationError("Authentication failed for unknown reason")

# Test different authentication scenarios
test_scenarios = [
    ("valid_user", "valid_pass"),
    ("expired_user", "password"),
    ("invalid_creds", "wrong_pass"),
    ("locked_account", "password"),
    ("service_unavailable", "password")
]

print("🔐 Authentication Error Demo")
print("=" * 40)

for username, password in test_scenarios:
    print(f"\\n📱 Testing: {username}")
    try:
        result = simulate_authentication(username, password)
        print(f"✅ Success: {result}")
    except MeijerAuthenticationError as e:
        print(f"❌ Auth Error: {e}")
        print(f"  Error Type: {type(e).__name__}")
        print(f"  Is MeijerError: {isinstance(e, MeijerError)}")
    except Exception as e:
        print(f"⚠️ Unexpected Error: {e}")

# Test inheritance
print(f"\\n🔍 Inheritance Check:")
auth_error = MeijerAuthenticationError("Test auth error")
print(f"auth_error is MeijerError: {isinstance(auth_error, MeijerError)}")
print(f"auth_error is Exception: {isinstance(auth_error, Exception)}")
print(f"MeijerAuthenticationError is MeijerError: {issubclass(MeijerAuthenticationError, MeijerError)}")""")
    
    # API error section
    api_error_section = nbf.v4.new_markdown_cell("""## MeijerAPIError

The `MeijerAPIError` is raised when general API requests fail, such as network issues, server errors, or malformed requests.

### Key Features

- **General Purpose**: Handles various API request failures
- **Network Issues**: Connection problems, timeouts, server errors
- **Request Problems**: Malformed requests, invalid parameters
- **Server Issues**: Internal server errors, service unavailability

### Basic Usage
""")
    
    api_error_example = nbf.v4.new_code_cell("""# MeijerAPIError examples
def simulate_api_request(endpoint: str, params: Dict[str, Any]) -> Dict[str, Any]:
    \"\"\"Simulate API request with potential errors.\"\"\"
    # Simulate various API failure scenarios
    if endpoint == "/products" and params.get("category") == "invalid":
        raise MeijerAPIError("Invalid category parameter provided")
    elif endpoint == "/search" and len(params.get("query", "")) < 2:
        raise MeijerAPIError("Search query must be at least 2 characters long")
    elif endpoint == "/stores" and params.get("zip_code") == "00000":
        raise MeijerAPIError("Invalid ZIP code format")
    elif endpoint == "/timeout":
        # Simulate timeout
        time.sleep(0.1)  # Small delay to simulate processing
        raise MeijerAPIError("Request timed out after 30 seconds")
    elif endpoint == "/server_error":
        raise MeijerAPIError("Internal server error (500)")
    elif endpoint == "/not_found":
        raise MeijerAPIError("Endpoint not found (404)")
    else:
        # Simulate successful response
        return {"status": "success", "data": f"Response from {endpoint}"}

# Test different API scenarios
test_api_scenarios = [
    ("/products", {"category": "groceries"}),
    ("/products", {"category": "invalid"}),
    ("/search", {"query": "milk"}),
    ("/search", {"query": "a"}),
    ("/stores", {"zip_code": "12345"}),
    ("/stores", {"zip_code": "00000"}),
    ("/timeout", {}),
    ("/server_error", {}),
    ("/not_found", {})
]

print("🌐 API Error Demo")
print("=" * 30)

for endpoint, params in test_api_scenarios:
    print(f"\\n📡 Testing: {endpoint}")
    try:
        result = simulate_api_request(endpoint, params)
        print(f"✅ Success: {result}")
    except MeijerAPIError as e:
        print(f"❌ API Error: {e}")
        print(f"  Error Type: {type(e).__name__}")
        print(f"  Is MeijerError: {isinstance(e, MeijerError)}")
    except Exception as e:
        print(f"⚠️ Unexpected Error: {e}")

# Test inheritance
print(f"\\n🔍 Inheritance Check:")
api_error = MeijerAPIError("Test API error")
print(f"api_error is MeijerError: {isinstance(api_error, MeijerError)}")
print(f"api_error is Exception: {isinstance(api_error, Exception)}")
print(f"MeijerAPIError is MeijerError: {issubclass(MeijerAPIError, MeijerError)}")""")
    
    # Rate limit error section
    rate_limit_section = nbf.v4.new_markdown_cell("""## MeijerRateLimitError

The `MeijerRateLimitError` is raised when API rate limits are exceeded, helping applications implement proper throttling and retry logic.

### Key Features

- **Rate Limiting**: Handles API throttling scenarios
- **Retry Logic**: Supports implementing exponential backoff
- **User Experience**: Prevents overwhelming the API with requests
- **Compliance**: Ensures fair usage of API resources

### Basic Usage
""")
    
    rate_limit_example = nbf.v4.new_code_cell("""# MeijerRateLimitError examples
class RateLimitedAPI:
    \"\"\"Example API client with rate limiting.\"\"\"
    
    def __init__(self):
        self.request_count = 0
        self.rate_limit = 10  # Max 10 requests per minute
        self.reset_time = time.time() + 60  # Reset every minute
    
    def make_request(self, endpoint: str) -> Dict[str, Any]:
        \"\"\"Make an API request with rate limiting.\"\"\"
        current_time = time.time()
        
        # Check if rate limit period has reset
        if current_time >= self.reset_time:
            self.request_count = 0
            self.reset_time = current_time + 60
        
        # Check rate limit
        if self.request_count >= self.rate_limit:
            remaining_time = int(self.reset_time - current_time)
            raise MeijerRateLimitError(
                f"Rate limit exceeded. Limit: {self.rate_limit} requests per minute. "
                f"Reset in {remaining_time} seconds."
            )
        
        # Increment request count
        self.request_count += 1
        
        # Simulate successful request
        return {"status": "success", "endpoint": endpoint, "request_number": self.request_count}
    
    def get_rate_limit_info(self) -> Dict[str, Any]:
        \"\"\"Get current rate limit information.\"\"\"
        current_time = time.time()
        remaining_requests = max(0, self.rate_limit - self.request_count)
        time_until_reset = max(0, self.reset_time - current_time)
        
        return {
            "requests_used": self.request_count,
            "requests_remaining": remaining_requests,
            "rate_limit": self.rate_limit,
            "reset_in_seconds": int(time_until_reset)
        }

# Test rate limiting
print("⏱️ Rate Limit Error Demo")
print("=" * 35)

api_client = RateLimitedAPI()

# Make requests until rate limit is hit
print("🚀 Making API requests...")
for i in range(12):  # Try to make 12 requests (exceeds limit of 10)
    try:
        result = api_client.make_request(f"/test{i}")
        print(f"✅ Request {i+1}: {result}")
        
        # Show rate limit info
        info = api_client.get_rate_limit_info()
        print(f"   📊 Rate Limit: {info['requests_remaining']}/{info['rate_limit']} remaining")
        
    except MeijerRateLimitError as e:
        print(f"❌ Rate Limit Error: {e}")
        print(f"   Error Type: {type(e).__name__}")
        print(f"   Is MeijerError: {isinstance(e, MeijerError)}")
        break
    except Exception as e:
        print(f"⚠️ Unexpected Error: {e}")
        break

# Test inheritance
print(f"\\n🔍 Inheritance Check:")
rate_limit_error = MeijerRateLimitError("Test rate limit error")
print(f"rate_limit_error is MeijerError: {isinstance(rate_limit_error, MeijerError)}")
print(f"rate_limit_error is Exception: {isinstance(rate_limit_error, Exception)}")
print(f"MeijerRateLimitError is MeijerError: {issubclass(MeijerRateLimitError, MeijerError)}")""")
    
    # Cart error section
    cart_error_section = nbf.v4.new_markdown_cell("""## CartError

The `CartError` is raised when shopping cart operations fail, such as adding/removing items, updating quantities, or cart synchronization issues.

### Key Features

- **Cart Operations**: Handles shopping cart-specific failures
- **Item Management**: Adding, removing, updating cart items
- **Synchronization**: Cart state conflicts, merge failures
- **Validation**: Invalid quantities, unavailable items

### Basic Usage
""")
    
    cart_error_example = nbf.v4.new_code_cell("""# CartError examples
class ShoppingCart:
    \"\"\"Example shopping cart with error handling.\"\"\"
    
    def __init__(self):
        self.items = {}
        self.max_items = 100
        self.max_quantity_per_item = 99
    
    def add_item(self, item_id: str, name: str, quantity: int, price: float) -> bool:
        \"\"\"Add an item to the cart with validation.\"\"\"
        # Validate quantity
        if quantity <= 0:
            raise CartError(f"Invalid quantity: {quantity}. Quantity must be positive.")
        
        if quantity > self.max_quantity_per_item:
            raise CartError(
                f"Quantity {quantity} exceeds maximum allowed ({self.max_quantity_per_item})"
            )
        
        # Check cart capacity
        if len(self.items) >= self.max_items and item_id not in self.items:
            raise CartError(f"Cart is full. Maximum {self.max_items} different items allowed.")
        
        # Add or update item
        if item_id in self.items:
            new_quantity = self.items[item_id]['quantity'] + quantity
            if new_quantity > self.max_quantity_per_item:
                raise CartError(
                    f"Total quantity {new_quantity} exceeds maximum allowed ({self.max_quantity_per_item})"
                )
            self.items[item_id]['quantity'] = new_quantity
        else:
            self.items[item_id] = {
                'name': name,
                'quantity': quantity,
                'price': price
            }
        
        return True
    
    def remove_item(self, item_id: str) -> bool:
        \"\"\"Remove an item from the cart.\"\"\"
        if item_id not in self.items:
            raise CartError(f"Item {item_id} not found in cart.")
        
        del self.items[item_id]
        return True
    
    def update_quantity(self, item_id: str, new_quantity: int) -> bool:
        \"\"\"Update item quantity in cart.\"\"\"
        if item_id not in self.items:
            raise CartError(f"Item {item_id} not found in cart.")
        
        if new_quantity <= 0:
            # Remove item if quantity is 0 or negative
            del self.items[item_id]
            return True
        
        if new_quantity > self.max_quantity_per_item:
            raise CartError(
                f"Quantity {new_quantity} exceeds maximum allowed ({self.max_quantity_per_item})"
            )
        
        self.items[item_id]['quantity'] = new_quantity
        return True
    
    def get_cart_summary(self) -> Dict[str, Any]:
        \"\"\"Get cart summary information.\"\"\"
        total_items = sum(item['quantity'] for item in self.items.values())
        total_value = sum(item['quantity'] * item['price'] for item in self.items.values())
        
        return {
            'item_count': len(self.items),
            'total_quantity': total_items,
            'total_value': round(total_value, 2),
            'max_items': self.max_items,
            'max_quantity_per_item': self.max_quantity_per_item
        }

# Test cart operations
print("🛒 Cart Error Demo")
print("=" * 25)

cart = ShoppingCart()

# Test successful operations
print("✅ Testing successful operations:")
try:
    cart.add_item("BAN001", "Bananas", 2, 1.99)
    cart.add_item("MILK001", "Milk", 1, 3.99)
    print("  Added items successfully")
    
    summary = cart.get_cart_summary()
    print(f"  Cart summary: {summary}")
    
except CartError as e:
    print(f"❌ Cart Error: {e}")

# Test error scenarios
print("\\n❌ Testing error scenarios:")

# Invalid quantity
try:
    cart.add_item("TEST001", "Test Item", -1, 1.00)
except CartError as e:
    print(f"  Invalid quantity: {e}")

# Exceed max quantity
try:
    cart.add_item("TEST002", "Test Item", 100, 1.00)
except CartError as e:
    print(f"  Exceed max quantity: {e}")

# Remove non-existent item
try:
    cart.remove_item("NONEXISTENT")
except CartError as e:
    print(f"  Remove non-existent: {e}")

# Update quantity for non-existent item
try:
    cart.update_quantity("NONEXISTENT", 5)
except CartError as e:
    print(f"  Update non-existent: {e}")

# Test inheritance
print(f"\\n🔍 Inheritance Check:")
cart_error = CartError("Test cart error")
print(f"cart_error is MeijerError: {isinstance(cart_error, MeijerError)}")
print(f"cart_error is Exception: {isinstance(cart_error, Exception)}")
print(f"CartError is MeijerError: {issubclass(CartError, MeijerError)}")""")
    
    # Feedback error section
    feedback_error_section = nbf.v4.new_markdown_cell("""## FeedbackError

The `FeedbackError` is raised when feedback operations fail, such as submitting feedback forms, rating products, or feedback service issues.

### Key Features

- **Feedback Operations**: Handles feedback submission failures
- **Form Validation**: Invalid feedback data, missing required fields
- **Service Issues**: Feedback service unavailability, submission failures
- **Content Issues**: Inappropriate content, spam detection

### Basic Usage
""")
    
    feedback_error_example = nbf.v4.new_code_cell("""# FeedbackError examples
class FeedbackSystem:
    \"\"\"Example feedback system with error handling.\"\"\"
    
    def __init__(self):
        self.min_rating = 1
        self.max_rating = 5
        self.min_comment_length = 10
        self.max_comment_length = 1000
        self.submitted_feedback = []
    
    def submit_feedback(self, product_id: str, rating: int, comment: str, user_id: str) -> bool:
        \"\"\"Submit feedback with validation.\"\"\"
        # Validate rating
        if not isinstance(rating, int) or rating < self.min_rating or rating > self.max_rating:
            raise FeedbackError(
                f"Invalid rating: {rating}. Rating must be an integer between {self.min_rating} and {self.max_rating}."
            )
        
        # Validate comment
        if not comment or not isinstance(comment, str):
            raise FeedbackError("Comment is required and must be a string.")
        
        if len(comment) < self.min_comment_length:
            raise FeedbackError(
                f"Comment too short: {len(comment)} characters. Minimum {self.min_comment_length} characters required."
            )
        
        if len(comment) > self.max_comment_length:
            raise FeedbackError(
                f"Comment too long: {len(comment)} characters. Maximum {self.max_comment_length} characters allowed."
            )
        
        # Check for inappropriate content (simplified)
        inappropriate_words = ["spam", "inappropriate", "offensive"]
        if any(word in comment.lower() for word in inappropriate_words):
            raise FeedbackError("Comment contains inappropriate content and cannot be submitted.")
        
        # Check for duplicate feedback from same user
        for feedback in self.submitted_feedback:
            if feedback['user_id'] == user_id and feedback['product_id'] == product_id:
                raise FeedbackError("You have already submitted feedback for this product.")
        
        # Simulate submission process
        feedback_data = {
            'product_id': product_id,
            'rating': rating,
            'comment': comment,
            'user_id': user_id,
            'timestamp': time.time()
        }
        
        # Simulate potential submission failure
        if random.random() < 0.1:  # 10% chance of failure
            raise FeedbackError("Feedback submission failed due to temporary service issue.")
        
        self.submitted_feedback.append(feedback_data)
        return True
    
    def get_feedback_summary(self) -> Dict[str, Any]:
        \"\"\"Get feedback system summary.\"\"\"
        if not self.submitted_feedback:
            return {"total_feedback": 0, "average_rating": 0}
        
        total_feedback = len(self.submitted_feedback)
        average_rating = sum(f['rating'] for f in self.submitted_feedback) / total_feedback
        
        return {
            "total_feedback": total_feedback,
            "average_rating": round(average_rating, 2),
            "min_rating": self.min_rating,
            "max_rating": self.max_rating,
            "min_comment_length": self.min_comment_length,
            "max_comment_length": self.max_comment_length
        }

# Test feedback system
print("💬 Feedback Error Demo")
print("=" * 30)

feedback_system = FeedbackSystem()

# Test successful feedback
print("✅ Testing successful feedback:")
try:
    feedback_system.submit_feedback("PROD001", 5, "Great product! I love the quality and taste.", "USER001")
    feedback_system.submit_feedback("PROD002", 4, "Good product, but could be better packaging.", "USER002")
    print("  Feedback submitted successfully")
    
    summary = feedback_system.get_feedback_summary()
    print(f"  Feedback summary: {summary}")
    
except FeedbackError as e:
    print(f"❌ Feedback Error: {e}")

# Test error scenarios
print("\\n❌ Testing error scenarios:")

# Invalid rating
try:
    feedback_system.submit_feedback("PROD003", 6, "Test comment for invalid rating.", "USER003")
except FeedbackError as e:
    print(f"  Invalid rating: {e}")

# Comment too short
try:
    feedback_system.submit_feedback("PROD004", 3, "Short.", "USER004")
except FeedbackError as e:
    print(f"  Comment too short: {e}")

# Comment too long
try:
    feedback_system.submit_feedback("PROD005", 2, "A" * 1001, "USER005")
except FeedbackError as e:
    print(f"  Comment too long: {e}")

# Inappropriate content
try:
    feedback_system.submit_feedback("PROD006", 1, "This is spam content.", "USER006")
except FeedbackError as e:
    print(f"  Inappropriate content: {e}")

# Duplicate feedback
try:
    feedback_system.submit_feedback("PROD001", 4, "Updated feedback.", "USER001")
except FeedbackError as e:
    print(f"  Duplicate feedback: {e}")

# Test inheritance
print(f"\\n🔍 Inheritance Check:")
feedback_error = FeedbackError("Test feedback error")
print(f"feedback_error is MeijerError: {isinstance(feedback_error, MeijerError)}")
print(f"feedback_error is Exception: {isinstance(feedback_error, Exception)}")
print(f"FeedbackError is MeijerError: {issubclass(FeedbackError, MeijerError)}")""")
    
    # Error handling patterns section
    error_patterns_section = nbf.v4.new_markdown_cell("""## Error Handling Patterns

Now let's explore common error handling patterns and best practices when working with Meijer API exceptions.

### Pattern 1: Specific Exception Handling

Handle specific exceptions first, then fall back to general error handling.
""")
    
    error_patterns_example = nbf.v4.new_code_cell("""# Error handling patterns
def robust_api_operation(operation_type: str) -> Dict[str, Any]:
    \"\"\"Demonstrate robust error handling patterns.\"\"\"
    try:
        if operation_type == "auth":
            # Simulate authentication
            if random.random() < 0.3:
                raise MeijerAuthenticationError("Invalid credentials")
            return {"status": "authenticated"}
            
        elif operation_type == "api":
            # Simulate API call
            if random.random() < 0.2:
                raise MeijerAPIError("Network timeout")
            return {"status": "success", "data": "API response"}
            
        elif operation_type == "cart":
            # Simulate cart operation
            if random.random() < 0.15:
                raise CartError("Item not available")
            return {"status": "added_to_cart"}
            
        elif operation_type == "feedback":
            # Simulate feedback submission
            if random.random() < 0.1:
                raise FeedbackError("Service temporarily unavailable")
            return {"status": "feedback_submitted"}
            
        else:
            raise ValueError(f"Unknown operation type: {operation_type}")
            
    except MeijerAuthenticationError as e:
        print(f"🔐 Authentication Error: {e}")
        return {"status": "error", "type": "authentication", "message": str(e)}
        
    except MeijerAPIError as e:
        print(f"🌐 API Error: {e}")
        return {"status": "error", "type": "api", "message": str(e)}
        
    except CartError as e:
        print(f"🛒 Cart Error: {e}")
        return {"status": "error", "type": "cart", "message": str(e)}
        
    except FeedbackError as e:
        print(f"💬 Feedback Error: {e}")
        return {"status": "error", "type": "feedback", "message": str(e)}
        
    except MeijerError as e:
        print(f"⚠️ General Meijer Error: {e}")
        return {"status": "error", "type": "general", "message": str(e)}
        
    except Exception as e:
        print(f"❌ Unexpected Error: {e}")
        return {"status": "error", "type": "unexpected", "message": str(e)}

# Test error handling patterns
print("🔄 Error Handling Patterns Demo")
print("=" * 40)

operation_types = ["auth", "api", "cart", "feedback", "unknown"]

for op_type in operation_types:
    print(f"\\n🔧 Testing operation: {op_type}")
    result = robust_api_operation(op_type)
    print(f"Result: {result}")

# Pattern 2: Retry with exponential backoff
def retry_with_backoff(operation_func, max_retries: int = 3, base_delay: float = 1.0):
    \"\"\"Retry operation with exponential backoff for rate limit errors.\"\"\"
    for attempt in range(max_retries + 1):
        try:
            return operation_func()
        except MeijerRateLimitError as e:
            if attempt == max_retries:
                print(f"❌ Max retries ({max_retries}) exceeded for rate limit error")
                raise e
            
            delay = base_delay * (2 ** attempt) + random.uniform(0, 1)
            print(f"⏱️ Rate limited. Retrying in {delay:.2f} seconds... (attempt {attempt + 1}/{max_retries + 1})")
            time.sleep(delay)
        except MeijerError as e:
            print(f"❌ Meijer error (no retry): {e}")
            raise e
        except Exception as e:
            print(f"❌ Unexpected error (no retry): {e}")
            raise e

# Test retry pattern
print(f"\\n🔄 Retry Pattern Demo")
print("=" * 25)

def simulate_rate_limited_operation():
    \"\"\"Simulate an operation that might hit rate limits.\"\"\"
    if random.random() < 0.7:  # 70% chance of rate limit
        raise MeijerRateLimitError("Rate limit exceeded")
    return "Operation successful"

try:
    result = retry_with_backoff(simulate_rate_limited_operation, max_retries=2, base_delay=0.5)
    print(f"✅ Final result: {result}")
except MeijerRateLimitError as e:
    print(f"❌ Final failure: {e}")""")
    
    # Best practices section
    best_practices_section = nbf.v4.new_markdown_cell("""## Best Practices

### 1. Use Specific Exceptions First
Always catch specific exceptions before general ones to provide appropriate handling.

### 2. Implement Proper Logging
Log errors with sufficient context for debugging and monitoring.

### 3. Provide User-Friendly Messages
Convert technical error messages to user-friendly explanations when appropriate.

### 4. Implement Retry Logic
Use exponential backoff for transient errors like rate limits.

### 5. Handle Errors Gracefully
Ensure your application continues to function even when errors occur.

### 6. Validate Input Early
Check input parameters before making API calls to catch errors early.

### 7. Use Custom Exceptions
Extend the base exception classes for application-specific error scenarios.
""")
    
    # Summary section
    summary_section = nbf.v4.new_markdown_cell("""## Summary

This notebook has demonstrated the comprehensive exception handling system available in the Meijer API client:

✅ **MeijerError**: Base exception class for all Meijer API errors
✅ **MeijerAuthenticationError**: Handles authentication failures
✅ **MeijerAPIError**: Manages general API request failures
✅ **MeijerRateLimitError**: Handles rate limiting scenarios
✅ **CartError**: Manages shopping cart operation failures
✅ **FeedbackError**: Handles feedback submission issues

### Key Benefits

- **Hierarchical Structure**: Clear inheritance hierarchy for organized error handling
- **Specific Error Types**: Different exception classes for different failure scenarios
- **Consistent Interface**: Unified error handling approach across all operations
- **Better Debugging**: Specific exception types help identify root causes
- **User Experience**: Appropriate error messages for different failure types

### Error Handling Strategies

- **Specific Exception Handling**: Catch specific exceptions first
- **Retry Logic**: Implement exponential backoff for transient errors
- **Graceful Degradation**: Continue operation when possible
- **User Communication**: Provide clear, actionable error messages
- **Logging and Monitoring**: Track errors for system health

### Next Steps

- Explore the other modules in the Meijer package
- Learn about authentication and API client usage
- Discover how exceptions integrate with the data models
- Understand the complete API workflow with error handling

The exception system provides robust error handling for building reliable Meijer API applications! 🚀
""")
    
    # Add all cells to notebook
    nb.cells = [
        title_cell,
        import_cell,
        base_exception_section,
        base_exception_example,
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
        error_patterns_section,
        error_patterns_example,
        best_practices_section,
        summary_section
    ]
    
    # Save notebook
    with open('exceptions.ipynb', 'w') as f:
        nbf.write(nb, f)
    
    print("✅ exceptions.ipynb created successfully!")

if __name__ == "__main__":
    create_exceptions_notebook() 