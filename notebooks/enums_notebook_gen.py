#!/usr/bin/env python3
"""
Generate Jupyter notebook for Meijer enums.py

This script creates a comprehensive notebook demonstrating all enumeration classes
and their usage with real API calls to Meijer endpoints.
"""

import nbformat as nbf


def create_enums_notebook():
    """Create the enums notebook."""

    # Create notebook
    nb = nbf.v4.new_notebook()

    # Title and description
    title_cell = nbf.v4.new_markdown_cell("""# Meijer API Enumerations

This notebook demonstrates the enumeration classes available in the Meijer API client using real API calls.

## Overview

The `enums.py` module contains enumeration classes that provide type-safe constants for various API states and values. These enums help ensure consistency and prevent errors when working with the Meijer API.

## Enumerations Available

- **AuthenticationStatus**: Represents the current authentication state
- **ItemType**: Represents different types of items (from models.py)

## Setup

First, let's import the necessary modules and create a real Meijer client:
""")

    # Import cell
    import_cell = nbf.v4.new_code_cell("""# Import the enums and client
from meijer.enums import AuthenticationStatus
from meijer.models import ItemType
from meijer.client import Meijer

# Import additional utilities
from enum import Enum
import json

print("✅ All enums imported successfully!")

# Create a real Meijer client
try:
    client = Meijer()
    print("✅ Meijer client created successfully!")
    print(f"Authentication status: {client.auth_status}")
    print(f"Is authenticated: {client.is_authenticated()}")
except Exception as e:
    print(f"❌ Failed to create Meijer client: {e}")
    print("Please ensure you have valid authentication credentials")
    client = None

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

### Real API Usage
""")

    auth_status_example = nbf.v4.new_code_cell("""# Explore AuthenticationStatus enum with real client
print("🔐 AuthenticationStatus Enum Values:")
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
print(f"repr(unauthenticated): {repr(unauthenticated)}")

# Real client authentication status
if client:
    print(f"\\n🔍 Real Client Authentication Status:")
    print(f"Current status: {client.auth_status}")
    print(f"Status enum: {AuthenticationStatus(client.auth_status)}")
    print(f"Status name: {AuthenticationStatus(client.auth_status).name}")
    print(f"Is authenticated: {client.is_authenticated()}")
    
    # Demonstrate status checking
    if client.auth_status == AuthenticationStatus.AUTHENTICATED:
        print("✅ Client is properly authenticated!")
    elif client.auth_status == AuthenticationStatus.UNAUTHENTICATED:
        print("❌ Client needs authentication")
    elif client.auth_status == AuthenticationStatus.EXPIRED:
        print("⚠️ Client authentication has expired")
    elif client.auth_status == AuthenticationStatus.FAILED:
        print("❌ Client authentication failed")
else:
    print("\\n❌ Client not available for authentication status demo")""")

    # ItemType section
    item_type_section = nbf.v4.new_markdown_cell("""## ItemType Enum

The `ItemType` enum represents different types of items that can be added to shopping lists. This enum is defined in the `models.py` module but is essential for working with list items.

### Values

- **PRODUCT**: Regular product items
- **COUPON**: Coupon or offer items
- **WEEKLY_AD**: Weekly advertisement items
- **MANUAL**: Manually added items

### Real API Usage
""")

    item_type_example = nbf.v4.new_code_cell("""# Explore ItemType enum with real data
print("📦 ItemType Enum Values:")
print("=" * 30)

for item_type in ItemType:
    print(f"{item_type.name}: {item_type.value}")

print(f"\\nTotal values: {len(ItemType)}")

# Access specific values
product_type = ItemType.PRODUCT
coupon_type = ItemType.COUPON
weekly_ad_type = ItemType.WEEKLY_AD
manual_type = ItemType.MANUAL

print(f"\\nIndividual Type Values:")
print(f"PRODUCT: {product_type.value}")
print(f"COUPON: {coupon_type.value}")
print(f"WEEKLY_AD: {weekly_ad_type.value}")
print(f"MANUAL: {manual_type.value}")

# String representation
print(f"\\nString Representations:")
print(f"str(product_type): {str(product_type)}")
print(f"repr(product_type): {repr(product_type)}")

# Real API usage with ItemType
if client and client.is_authenticated():
    print(f"\\n🔍 Real API Usage with ItemType:")
    
    try:
        # Get real shopping lists to see ItemType in action
        shopping_lists = client.get_shopping_lists()
        print(f"Found {len(shopping_lists)} shopping lists")
        
        if shopping_lists:
            # Get items from the first list
            first_list = shopping_lists[0]
            print(f"\\nFirst list: {first_list.name}")
            
            list_items = client.get_shopping_list_items(first_list.list_id)
            print(f"Found {len(list_items)} items in the list")
            
            if list_items:
                print("\\nItem Types in Shopping List:")
                type_counts = {}
                
                for item in list_items:
                    item_type = ItemType(item.list_item_type_id)
                    type_counts[item_type.name] = type_counts.get(item_type.name, 0) + 1
                    
                    print(f"  - {item.name} (Type: {item_type.name})")
                
                print(f"\\nType Distribution:")
                for type_name, count in type_counts.items():
                    print(f"  {type_name}: {count} items")
                    
                # Demonstrate ItemType checking
                print(f"\\nItemType Checking Examples:")
                for item in list_items[:3]:  # First 3 items
                    item_type = ItemType(item.list_item_type_id)
                    print(f"  {item.name}:")
                    print(f"    Raw type ID: {item.list_item_type_id}")
                    print(f"    Enum type: {item_type.name}")
                    print(f"    Is product: {item_type == ItemType.PRODUCT}")
                    print(f"    Is coupon: {item_type == ItemType.COUPON}")
                    print(f"    Is weekly ad: {item_type == ItemType.WEEKLY_AD}")
                    print(f"    Is manual: {item_type == ItemType.MANUAL}")
            else:
                print("No items found in the first list")
        else:
            print("No shopping lists found")
            
    except Exception as e:
        print(f"❌ Shopping list API failed: {e}")
        print("Cannot demonstrate ItemType with real data")
        
else:
    print("\\n❌ Client not available for ItemType demo")""")

    # Advanced usage section
    advanced_section = nbf.v4.new_markdown_cell("""## Advanced Usage Examples

### Working with Enum Values in API Calls
""")

    advanced_example = nbf.v4.new_code_cell("""# Advanced enum usage with real API
if client and client.is_authenticated():
    print("🚀 Advanced enum usage examples...")
    
    try:
        # Demonstrate filtering by ItemType
        print("\\n1. Filtering items by type...")
        
        shopping_lists = client.get_shopping_lists()
        if shopping_lists:
            first_list = shopping_lists[0]
            list_items = client.get_shopping_list_items(first_list.list_id)
            
            if list_items:
                # Filter by product type
                product_items = [item for item in list_items 
                               if ItemType(item.list_item_type_id) == ItemType.PRODUCT]
                print(f"   Product items: {len(product_items)}")
                
                # Filter by coupon type
                coupon_items = [item for item in list_items 
                              if ItemType(item.list_item_type_id) == ItemType.COUPON]
                print(f"   Coupon items: {len(coupon_items)}")
                
                # Filter by weekly ad type
                weekly_ad_items = [item for item in list_items 
                                 if ItemType(item.list_item_type_id) == ItemType.WEEKLY_AD]
                print(f"   Weekly ad items: {len(weekly_ad_items)}")
                
                # Filter by manual type
                manual_items = [item for item in list_items 
                              if ItemType(item.list_item_type_id) == ItemType.MANUAL]
                print(f"   Manual items: {len(manual_items)}")
        
        # Demonstrate AuthenticationStatus checking
        print("\\n2. Authentication status monitoring...")
        current_status = client.auth_status
        status_enum = AuthenticationStatus(current_status)
        
        print(f"   Current status: {status_enum.name}")
        print(f"   Status value: {status_enum.value}")
        print(f"   Is authenticated: {status_enum == AuthenticationStatus.AUTHENTICATED}")
        print(f"   Needs auth: {status_enum == AuthenticationStatus.UNAUTHENTICATED}")
        print(f"   Has expired: {status_enum == AuthenticationStatus.EXPIRED}")
        print(f"   Has failed: {status_enum == AuthenticationStatus.FAILED}")
        
        # Demonstrate enum conversion
        print("\\n3. Enum conversion examples...")
        
        # String to enum
        status_string = "authenticated"
        try:
            status_from_string = AuthenticationStatus(status_string)
            print(f"   String '{status_string}' -> {status_from_string.name}")
        except ValueError:
            print(f"   Invalid status string: {status_string}")
        
        # Value to enum
        status_value = 1
        try:
            status_from_value = AuthenticationStatus(status_value)
            print(f"   Value {status_value} -> {status_from_value.name}")
        except ValueError:
            print(f"   Invalid status value: {status_value}")
            
    except Exception as e:
        print(f"❌ Advanced enum usage failed: {e}")
        
else:
    print("❌ Client not available for advanced enum usage demo")""")

    # Best practices section
    best_practices_section = nbf.v4.new_markdown_cell("""## Best Practices

### 1. Always Use Enums for Type Safety
Instead of hardcoding string values or numbers, use the provided enums to ensure consistency and catch errors at development time.

### 2. Handle Invalid Values Gracefully
When converting from external data (like API responses), always handle potential invalid values:

```python
try:
    item_type = ItemType(api_response['type_id'])
except ValueError:
    # Handle invalid type ID
    item_type = ItemType.PRODUCT  # Default fallback
```

### 3. Use Enum Comparisons
Compare enum values directly rather than comparing raw values:

```python
# Good
if item_type == ItemType.PRODUCT:
    # Handle product

# Avoid
if item.list_item_type_id == 1:  # Magic number
    # Handle product
```

### 4. Leverage Enum Properties
Use the enum's built-in properties and methods for better code readability and maintenance.
""")

    # Summary section
    summary_section = nbf.v4.new_markdown_cell("""## Summary

This notebook has demonstrated the enumeration classes available in the Meijer API client using **real API calls** instead of mocked data.

### Key Takeaways

- **Type Safety**: Enums provide compile-time type checking and prevent invalid values
- **Consistency**: Centralized constants ensure consistent values across the application
- **Real Data Integration**: All examples use actual Meijer API responses
- **Error Prevention**: Enums help catch errors early in development
- **Code Readability**: Enum names are more descriptive than magic numbers

### Available Enums

- **AuthenticationStatus**: Tracks client authentication state
  - UNAUTHENTICATED, AUTHENTICATED, EXPIRED, FAILED
  
- **ItemType**: Classifies shopping list items
  - PRODUCT, COUPON, WEEKLY_AD, MANUAL

### Next Steps

- Explore the individual enum classes in more detail
- Use these enums in your own applications for type safety
- Check the API documentation for additional enum values
- Experiment with different enum combinations and filtering

All enums are designed to work seamlessly with the Meijer API and provide a consistent, type-safe interface for your applications.
""")

    # Add all cells to notebook
    nb.cells = [
        title_cell,
        import_cell,
        auth_status_section,
        auth_status_example,
        item_type_section,
        item_type_example,
        advanced_section,
        advanced_example,
        best_practices_section,
        summary_section
    ]

    return nb


if __name__ == "__main__":
    # Create the notebook
    nb = create_enums_notebook()
    
    # Write to file
    with open("enums.ipynb", "w") as f:
        nbf.write(nb, f)
    
    print("✅ enums.ipynb generated successfully!")
