#!/usr/bin/env python3
"""
Generate Jupyter notebook for Meijer enums.py

This script creates a comprehensive notebook demonstrating all enumeration classes
and their usage with practical examples.
"""

import nbformat as nbf


def create_enums_notebook():
    """Create the enums notebook."""

    # Create notebook
    nb = nbf.v4.new_notebook()

    # Title and description
    title_cell = nbf.v4.new_markdown_cell("""# Meijer API Enumerations

This notebook demonstrates the enumeration classes available in the Meijer API client.

## Overview

The `enums.py` module contains enumeration classes that provide type-safe constants for various API states and values. These enums help ensure consistency and prevent errors when working with the Meijer API.

## Enumerations Available

- **AuthenticationStatus**: Represents the current authentication state
- **ItemType**: Represents different types of items (from models.py)

## Setup

First, let's import the necessary modules:
""")

    # Import cell
    import_cell = nbf.v4.new_code_cell("""# Import the enums
from meijer.enums import AuthenticationStatus
from meijer.models import ItemType

# Import additional utilities
from enum import Enum
import json

print("✅ All enums imported successfully!")
print(f"AuthenticationStatus values: {[status.value for status in AuthenticationStatus]}")
print(f"ItemType values: {[item_type.value for item_type in ItemType]}")""")

    # AuthenticationStatus section
    auth_status_section = nbf.v4.new_markdown_cell("""## AuthenticationStatus Enum

The `AuthenticationStatus` enum represents the current authentication state of the Meijer API client.

### Values

- **UNAUTHENTICATED**: Client has not been authenticated
- **AUTHENTICATED**: Client is successfully authenticated
- **EXPIRED**: Authentication has expired and needs renewal
- **FAILED**: Authentication attempt failed

### Basic Usage
""")

    auth_status_example = nbf.v4.new_code_cell("""# Explore AuthenticationStatus enum
print("AuthenticationStatus Enum Values:")
print("=" * 40)

for status in AuthenticationStatus:
    print(f"{status.name}: {status.value}")

print(f"\\nTotal values: {len(AuthenticationStatus)}")

# Access specific values
unauthenticated = AuthenticationStatus.UNAUTHENTICATED
authenticated = AuthenticationStatus.AUTHENTICATED
expired = AuthenticationStatus.EXPIRED
failed = AuthenticationStatus.FAILED

print(f"\\nIndividual Status Values:")
print(f"UNAUTHENTICATED: {unauthenticated.value}")
print(f"AUTHENTICATED: {authenticated.value}")
print(f"EXPIRED: {expired.value}")
print(f"FAILED: {failed.value}")

# Compare values
print(f"\\nComparison Examples:")
print(f"unauthenticated == 'unauthenticated': {unauthenticated == 'unauthenticated'}")
print(f"authenticated == 'authenticated': {authenticated == 'authenticated'}")
print(f"expired == 'expired': {expired == 'expired'}")
print(f"failed == 'failed': {failed == 'failed'}")

# String representation
print(f"\\nString Representations:")
print(f"str(unauthenticated): {str(unauthenticated)}")
print(f"repr(unauthenticated): {repr(unauthenticated)}")""")

    # ItemType section
    item_type_section = nbf.v4.new_markdown_cell("""## ItemType Enum

The `ItemType` enum represents different types of items that can be added to shopping lists. This enum is defined in the `models.py` module but is essential for working with list items.

### Values

- **PRODUCT**: Regular product items
- **COUPON**: Coupon or offer items
- **WEEKLY_AD**: Weekly advertisement items
- **MANUAL**: Manually added items

### Basic Usage
""")

    item_type_example = nbf.v4.new_code_cell("""# Explore ItemType enum
print("ItemType Enum Values:")
print("=" * 30)

for item_type in ItemType:
    print(f"{item_type.name}: {item_type.value}")

print(f"\\nTotal values: {len(ItemType)}")

# Access specific values
product = ItemType.PRODUCT
coupon = ItemType.COUPON
weekly_ad = ItemType.WEEKLY_AD
manual = ItemType.MANUAL

print(f"\\nIndividual Item Type Values:")
print(f"PRODUCT: {product.value}")
print(f"COUPON: {coupon.value}")
print(f"WEEKLY_AD: {weekly_ad.value}")
print(f"MANUAL: {manual.value}")

# Compare values
print(f"\\nComparison Examples:")
print(f"product == 1: {product == 1}")
print(f"coupon == 2: {coupon == 2}")
print(f"weekly_ad == 3: {weekly_ad == 3}")
print(f"manual == 4: {manual == 4}")

# String representation
print(f"\\nString Representations:")
print(f"str(product): {str(product)}")
print(f"repr(product): {repr(product)}")""")

    # Practical examples section
    practical_section = nbf.v4.new_markdown_cell("""## Practical Examples

### Authentication State Management

Enums are particularly useful for managing application state and ensuring consistency across different parts of your code.
""")

    practical_example = nbf.v4.new_code_cell("""# Simulate authentication state management
class AuthenticationManager:
    \"\"\"Example authentication manager using enums.\"\"\"

    def __init__(self):
        self.status = AuthenticationStatus.UNAUTHENTICATED
        self.token = None

    def authenticate(self, username: str, password: str) -> bool:
        \"\"\"Attempt to authenticate user.\"\"\"
        print(f"🔐 Attempting authentication for {username}...")

        # Simulate authentication process
        if username == "valid_user" and password == "valid_pass":
            self.status = AuthenticationStatus.AUTHENTICATED
            self.token = "sample_token_12345"
            print("✅ Authentication successful!")
            return True
        else:
            self.status = AuthenticationStatus.FAILED
            print("❌ Authentication failed!")
            return False

    def check_token_expiry(self) -> bool:
        \"\"\"Check if authentication token has expired.\"\"\"
        if self.status == AuthenticationStatus.AUTHENTICATED:
            # Simulate token expiry check
            import random
            if random.random() < 0.3:  # 30% chance of expiry
                self.status = AuthenticationStatus.EXPIRED
                print("⚠️ Token has expired!")
                return True
        return False

    def get_status(self) -> AuthenticationStatus:
        \"\"\"Get current authentication status.\"\"\"
        return self.status

    def is_authenticated(self) -> bool:
        \"\"\"Check if currently authenticated.\"\"\"
        return self.status == AuthenticationStatus.AUTHENTICATED

    def logout(self):
        \"\"\"Logout and reset status.\"\"\"
        self.status = AuthenticationStatus.UNAUTHENTICATED
        self.token = None
        print("👋 Logged out successfully!")

# Test the authentication manager
auth_manager = AuthenticationManager()

print("🚀 Authentication Manager Demo")
print("=" * 40)

# Initial state
print(f"Initial status: {auth_manager.get_status().value}")

# Attempt authentication
auth_manager.authenticate("valid_user", "valid_pass")
print(f"Status after auth: {auth_manager.get_status().value}")

# Check if authenticated
print(f"Is authenticated: {auth_manager.is_authenticated()}")

# Simulate token expiry
auth_manager.check_token_expiry()
print(f"Status after expiry check: {auth_manager.get_status().value}")

# Logout
auth_manager.logout()
print(f"Status after logout: {auth_manager.get_status().value}")

# Failed authentication
auth_manager.authenticate("invalid_user", "wrong_pass")
print(f"Status after failed auth: {auth_manager.get_status().value}")""")

    # Item type usage section
    item_type_usage_section = nbf.v4.new_markdown_cell("""### Item Type Classification

Enums are also useful for classifying different types of items in shopping lists and other data structures.
""")

    item_type_usage_example = nbf.v4.new_code_cell("""# Simulate shopping list item classification
class ShoppingListItem:
    \"\"\"Example shopping list item using ItemType enum.\"\"\"

    def __init__(self, name: str, item_type: ItemType, quantity: int = 1):
        self.name = name
        self.item_type = item_type
        self.quantity = quantity

    def get_type_description(self) -> str:
        \"\"\"Get human-readable description of item type.\"\"\"
        type_descriptions = {
            ItemType.PRODUCT: "Product",
            ItemType.COUPON: "Coupon",
            ItemType.WEEKLY_AD: "Weekly Ad Item",
            ItemType.MANUAL: "Manual Entry"
        }
        return type_descriptions.get(self.item_type, "Unknown")

    def get_icon(self) -> str:
        \"\"\"Get appropriate icon for item type.\"\"\"
        icons = {
            ItemType.PRODUCT: "🛍️",
            ItemType.COUPON: "🎫",
            ItemType.WEEKLY_AD: "📰",
            ItemType.MANUAL: "✏️"
        }
        return icons.get(self.item_type, "❓")

    def __str__(self) -> str:
        return f"{self.get_icon()} {self.name} ({self.get_type_description()}) - Qty: {self.quantity}"

# Create different types of shopping list items
shopping_items = [
    ShoppingListItem("Organic Bananas", ItemType.PRODUCT, 2),
    ShoppingListItem("$1.00 off Bananas", ItemType.COUPON, 1),
    ShoppingListItem("Weekly Special: Milk", ItemType.WEEKLY_AD, 1),
    ShoppingListItem("Remember to check pharmacy", ItemType.MANUAL, 1)
]

print("🛒 Shopping List Item Classification Demo")
print("=" * 50)

for item in shopping_items:
    print(f"• {item}")
    print(f"  Type ID: {item.item_type.value}")
    print(f"  Type Name: {item.item_type.name}")
    print()

# Group items by type
items_by_type = {}
for item in shopping_items:
    item_type = item.item_type
    if item_type not in items_by_type:
        items_by_type[item_type] = []
    items_by_type[item_type].append(item)

print("📊 Items Grouped by Type:")
print("=" * 30)

for item_type, items in items_by_type.items():
    print(f"{item_type.name} ({len(items)} items):")
    for item in items:
        print(f"  - {item.name}")
    print()""")

    # Enum comparison and validation section
    comparison_section = nbf.v4.new_markdown_cell("""### Enum Comparison and Validation

Enums provide powerful comparison and validation capabilities that make your code more robust.
""")

    comparison_example = nbf.v4.new_code_cell("""# Enum comparison and validation examples
def validate_authentication_status(status_value: str) -> bool:
    \"\"\"Validate that a status value is a valid AuthenticationStatus.\"\"\"
    try:
        # Try to create an AuthenticationStatus from the value
        status = AuthenticationStatus(status_value)
        return True
    except ValueError:
        return False

def validate_item_type(type_value: int) -> bool:
    \"\"\"Validate that a type value is a valid ItemType.\"\"\"
    try:
        # Try to create an ItemType from the value
        item_type = ItemType(type_value)
        return True
    except ValueError:
        return False

# Test validation functions
print("🔍 Enum Validation Demo")
print("=" * 30)

# Test AuthenticationStatus validation
auth_test_values = ["authenticated", "expired", "invalid_status", "unauthenticated"]
print("AuthenticationStatus Validation:")
for value in auth_test_values:
    is_valid = validate_authentication_status(value)
    print(f"  '{value}': {'✅ Valid' if is_valid else '❌ Invalid'}")

print()

# Test ItemType validation
item_type_test_values = [1, 2, 3, 4, 99, -1]
print("ItemType Validation:")
for value in item_type_test_values:
    is_valid = validate_item_type(value)
    print(f"  {value}: {'✅ Valid' if is_valid else '❌ Invalid'}")

# Enum comparison examples
print(f"\\n🔄 Enum Comparison Examples:")
print("=" * 30)

status1 = AuthenticationStatus.AUTHENTICATED
status2 = AuthenticationStatus.AUTHENTICATED
status3 = AuthenticationStatus.UNAUTHENTICATED

print(f"status1 == status2: {status1 == status2}")
print(f"status1 == status3: {status1 == status3}")
print(f"status1 is status2: {status1 is status2}")
print(f"status1 is status3: {status1 is status3}")

# Enum ordering (Python 3.4+)
print(f"\\n📊 Enum Ordering:")
print("=" * 20)

# Sort AuthenticationStatus by value
sorted_auth_statuses = sorted(AuthenticationStatus, key=lambda x: x.value)
print("AuthenticationStatus sorted by value:")
for status in sorted_auth_statuses:
    print(f"  {status.name}: {status.value}")

# Sort ItemType by value
sorted_item_types = sorted(ItemType, key=lambda x: x.value)
print("\\nItemType sorted by value:")
for item_type in sorted_item_types:
    print(f"  {item_type.name}: {item_type.value}")""")

    # Advanced enum usage section
    advanced_section = nbf.v4.new_markdown_cell("""### Advanced Enum Usage

Enums can be used in more advanced scenarios like state machines, configuration management, and API response handling.
""")

    advanced_example = nbf.v4.new_code_cell("""# Advanced enum usage examples
class APIResponseHandler:
    \"\"\"Example API response handler using enums for state management.\"\"\"

    def __init__(self):
        self.current_status = AuthenticationStatus.UNAUTHENTICATED
        self.retry_count = 0
        self.max_retries = 3

    def handle_api_response(self, response_data: dict) -> bool:
        \"\"\"Handle API response and update status accordingly.\"\"\"
        status_code = response_data.get('status_code', 200)
        auth_status = response_data.get('auth_status', 'unauthenticated')

        # Update authentication status based on response
        try:
            self.current_status = AuthenticationStatus(auth_status)
        except ValueError:
            print(f"⚠️ Unknown auth status: {auth_status}")
            return False

        # Handle different response scenarios
        if status_code == 200:
            if self.current_status == AuthenticationStatus.AUTHENTICATED:
                print("✅ API call successful, user authenticated")
                self.retry_count = 0  # Reset retry count
                return True
            elif self.current_status == AuthenticationStatus.EXPIRED:
                print("⚠️ Token expired, attempting refresh...")
                return self.refresh_authentication()
            else:
                print(f"❌ API call failed with status: {self.current_status.value}")
                return False
        elif status_code == 401:
            self.current_status = AuthenticationStatus.FAILED
            print("❌ Authentication failed")
            return False
        elif status_code == 403:
            self.current_status = AuthenticationStatus.EXPIRED
            print("⚠️ Access forbidden, token may have expired")
            return self.refresh_authentication()
        else:
            print(f"❌ API error: {status_code}")
            return False

    def refresh_authentication(self) -> bool:
        \"\"\"Attempt to refresh authentication.\"\"\"
        if self.retry_count < self.max_retries:
            self.retry_count += 1
            print(f"🔄 Authentication refresh attempt {self.retry_count}/{self.max_retries}")
            # Simulate refresh attempt
            import random
            if random.random() < 0.7:  # 70% success rate
                self.current_status = AuthenticationStatus.AUTHENTICATED
                print("✅ Authentication refreshed successfully!")
                return True
            else:
                print("❌ Authentication refresh failed")
                return False
        else:
            print("❌ Max retry attempts exceeded")
            self.current_status = AuthenticationStatus.FAILED
            return False

    def get_status_summary(self) -> dict:
        \"\"\"Get current status summary.\"\"\"
        return {
            'auth_status': self.current_status.value,
            'retry_count': self.retry_count,
            'max_retries': self.max_retries,
            'can_retry': self.retry_count < self.max_retries
        }

# Test the API response handler
print("🚀 Advanced Enum Usage Demo")
print("=" * 40)

handler = APIResponseHandler()

# Test various API responses
test_responses = [
    {'status_code': 200, 'auth_status': 'authenticated'},
    {'status_code': 200, 'auth_status': 'expired'},
    {'status_code': 401, 'auth_status': 'failed'},
    {'status_code': 403, 'auth_status': 'expired'},
    {'status_code': 500, 'auth_status': 'unauthenticated'}
]

for i, response in enumerate(test_responses, 1):
    print(f"\\n📡 Test Response {i}:")
    print(f"Status Code: {response['status_code']}")
    print(f"Auth Status: {response['auth_status']}")

    success = handler.handle_api_response(response)
    print(f"Result: {'✅ Success' if success else '❌ Failed'}")

    summary = handler.get_status_summary()
    print(f"Status Summary: {summary}")""")

    # Best practices section
    best_practices_section = nbf.v4.new_markdown_cell("""## Best Practices

### 1. Use Enums for Constants
Always use enums instead of magic strings or numbers for better code readability and maintainability.

### 2. Validate Input Values
Use enum validation to ensure that input values are valid before processing.

### 3. Leverage Enum Properties
Take advantage of enum properties like `.name`, `.value`, and comparison operators.

### 4. Group Related Constants
Use enums to group related constants together, making your code more organized.

### 5. Handle Invalid Values Gracefully
Always handle cases where enum values might be invalid or unexpected.
""")

    # Summary section
    summary_section = nbf.v4.new_markdown_cell("""## Summary

This notebook has demonstrated the enumeration classes available in the Meijer API client:

✅ **AuthenticationStatus**: Manages authentication state with clear, readable values
✅ **ItemType**: Classifies different types of items in shopping lists and other data structures

### Key Benefits

- **Type Safety**: Prevents errors from invalid constant values
- **Readability**: Makes code more self-documenting
- **Maintainability**: Centralizes constant definitions
- **Validation**: Provides built-in validation capabilities
- **Comparison**: Enables powerful comparison and sorting operations

### Use Cases

- **State Management**: Track application and API states
- **Data Classification**: Categorize different types of data
- **Configuration**: Define valid configuration options
- **API Responses**: Handle different response types consistently
- **User Interface**: Display human-readable status messages

### Next Steps

- Explore the other modules in the Meijer package
- Learn about authentication and API client usage
- Discover how enums integrate with the data models
- Understand the complete API workflow

Enums provide a solid foundation for building robust, maintainable Meijer API applications! 🚀
""")

    # Add all cells to notebook
    nb.cells = [
        title_cell,
        import_cell,
        auth_status_section,
        auth_status_example,
        item_type_section,
        item_type_example,
        practical_section,
        practical_example,
        item_type_usage_section,
        item_type_usage_example,
        comparison_section,
        comparison_example,
        advanced_section,
        advanced_example,
        best_practices_section,
        summary_section,
    ]

    # Save notebook
    with open("enums.ipynb", "w") as f:
        nbf.write(nb, f)

    print("✅ enums.ipynb created successfully!")


if __name__ == "__main__":
    create_enums_notebook()
