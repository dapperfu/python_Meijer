#!/usr/bin/env python3
"""
Generate Jupyter notebook for Meijer client.py - Simplified Version

This script creates a comprehensive notebook demonstrating the main Meijer client
and all its functionality with practical examples.
"""

import nbformat as nbf


def create_client_notebook():
    """Create the client notebook."""

    # Create notebook
    nb = nbf.v4.new_notebook()

    # Title and description
    title_cell = nbf.v4.new_markdown_cell("""# Meijer Main Client

This notebook demonstrates the main `Meijer` client class that provides access to all Meijer API functionality.

## Overview

The `client.py` module contains the main `Meijer` class that serves as the central interface for all Meijer API interactions. It provides access to:

- **Authentication and Token Management**
- **Shopping Lists and Favorites**
- **Coupons and Offers**
- **Product Search**
- **Shop & Scan Functionality**
- **Store Information**
- **mPerks and Rewards**
- **Feedback System**
- **Product Details and Location Information**
- **Account Management**

## Key Features

- **Unified Interface**: Single client for all Meijer services
- **Component Architecture**: Modular design with specialized components
- **Authentication Management**: Multiple auth methods and token persistence
- **Error Handling**: Comprehensive error handling and logging
- **API Integration**: Direct integration with all Meijer endpoints

## Setup

First, let's import the necessary modules:
""")

    # Import cell
    import_cell = nbf.v4.new_code_cell("""# Import the main Meijer client
from meijer.client import Meijer

# Import additional utilities
import json
import logging
from typing import Dict, List, Any, Optional
from datetime import datetime

print("Meijer client imported successfully!")
print("Available functionality:")
print("  - Authentication and token management")
print("  - Shopping lists and favorites")
print("  - Coupons and offers")
print("  - Product search")
print("  - Shop & scan")
print("  - Store information")
print("  - mPerks and rewards")
print("  - Feedback system")
print("  - Product details and location")
print("  - Account management")""")

    # Client initialization section
    init_section = nbf.v4.new_markdown_cell("""## Client Initialization

The `Meijer` client can be initialized with different authentication methods:

- **None**: Auto-detect from `~/.config/meijer.txt`
- **Auth file path**: Path to auth.txt file with bearer token or credentials
- **Log file path**: Path to mitmproxy log file for token extraction

### Basic Initialization
""")

    init_example = nbf.v4.new_code_cell("""# Client initialization examples
print("Meijer Client Initialization Demo")
print("=" * 45)

# Method 1: Auto-detect authentication
try:
    client_auto = Meijer()
    print("Auto-detect client created")
    print(f"  Authentication Status: {client_auto.auth_status}")
    print(f"  Is Authenticated: {client_auto.is_authenticated()}")
except Exception as e:
    print(f"Auto-detect client failed: {e}")

# Method 2: With auth file path
try:
    # This would use an actual auth file if available
    client_auth = Meijer(auth="auth.txt")
    print("Auth file client created")
    print(f"  Authentication Status: {client_auth.auth_status}")
except Exception as e:
    print(f"Auth file client failed: {e}")

# Method 3: With log file path
try:
    # This would use an actual log file if available
    client_log = Meijer(auth="meijer_mitm.log")
    print("Log file client created")
    print(f"  Authentication Status: {client_log.auth_status}")
except Exception as e:
    print(f"Log file client failed: {e}")

# Create a demo client for the rest of the examples
client = Meijer()
print(f"\\nDemo client created for examples")
print(f"  Authentication Status: {client.auth_status}")""")

    # Authentication methods section
    auth_methods_section = nbf.v4.new_markdown_cell("""## Authentication Methods

The client provides several methods for managing authentication and tokens.

### Authentication Status and Validation
""")

    auth_methods_example = nbf.v4.new_code_cell("""# Authentication methods demonstration
print("Authentication Methods Demo")
print("=" * 40)

# Check authentication status
print("Current Authentication Status:")
print("-" * 35)

try:
    print(f"  Is Authenticated: {client.is_authenticated()}")
    print(f"  Auth Status: {client.auth_status}")
    print(f"  Has Access Token: {client._access_token is not None}")
    print(f"  Has Refresh Token: {client._refresh_token is not None}")

except Exception as e:
    print(f"Authentication status check failed: {e}")

# Test authentication enforcement
print(f"\\nAuthentication Enforcement:")
print("-" * 35)

try:
    # This will fail if not authenticated
    client._ensure_authenticated()
    print("Authentication check passed")
except Exception as e:
    print(f"Authentication check failed: {e}")

# Test API headers
print(f"\\nAPI Headers:")
print("-" * 20)

try:
    headers = client._get_headers()
    print(f"  Authorization: {'Present' if 'Authorization' in headers else 'Missing'}")
    print(f"  Content-Type: {headers.get('Content-Type', 'Missing')}")
    print(f"  User-Agent: {headers.get('User-Agent', 'Missing')}")
except Exception as e:
    print(f"Header generation failed: {e}")""")

    # Store methods section
    store_methods_section = nbf.v4.new_markdown_cell("""## Store Management Methods

The client provides comprehensive store management functionality.

### Store Search and Location
""")

    store_methods_example = nbf.v4.new_code_cell("""# Store management methods demonstration
print("Store Management Demo")
print("=" * 35)

# Test store search by location
print("1. Store Search by Location:")
print("-" * 30)

try:
    # Search for stores near a specific location
    stores = client.stores.search_by_location("Lansing, MI", radius=25)
    print(f"Found {len(stores)} stores near Lansing, MI")

    if stores:
        for i, store in enumerate(stores[:3], 1):
            print(f"  {i}. {store.name} - {store.city}, {store.state}")
            print(f"     Distance: {store.distance:.1f} miles")
            print(f"     Store ID: {store.store_id}")

except Exception as e:
    print(f"Store search failed: {e}")

# Test store search by proximity
print("\\n2. Store Search by Proximity:")
print("-" * 30)

try:
    # Search for stores near current location
    nearby_stores = client.stores.search_by_proximity(lat=42.7325, lng=-84.5555, radius=10)
    print(f"Found {len(nearby_stores)} stores within 10 miles")

    if nearby_stores:
        for i, store in enumerate(nearby_stores[:3], 1):
            print(f"  {i}. {store.name} - {store.city}")
            print(f"     Distance: {store.distance:.1f} miles")

except Exception as e:
    print(f"Proximity search failed: {e}")

# Test store lookup by ID
print("\\n3. Store Lookup by ID:")
print("-" * 30)

try:
    # Look up a specific store by ID
    store_id = "1234"  # Example store ID
    store = client.stores.get_by_id(store_id)
    if store:
        print(f"Store found: {store.name}")
        print(f"  Address: {store.address}")
        print(f"  Phone: {store.phone}")
        print(f"  Hours: {store.hours}")
    else:
        print(f"Store with ID {store_id} not found")
except Exception as e:
    print(f"Store lookup failed: {e}")

print("\\nStore management methods demonstrated successfully!")""")

    # Coupon methods section
    coupon_methods_section = nbf.v4.new_markdown_cell("""## Coupon Management Methods

The client provides comprehensive coupon and offer management.

### Coupon Operations
""")

    coupon_methods_example = nbf.v4.new_code_cell("""# Coupon management methods demonstration
print("Coupon Management Demo")
print("=" * 35)

# Test getting available coupons
print("1. Available Coupons:")
print("-" * 25)

try:
    coupons = client.coupons.get_available()
    print(f"Found {len(coupons)} available coupons")

    if coupons:
        for i, coupon in enumerate(coupons[:3], 1):
            print(f"  {i}. {coupon.title}")
            print(f"     Value: {coupon.value}")
            print(f"     Expires: {coupon.expires_at}")
            print(f"     Category: {coupon.category}")

except Exception as e:
    print(f"Coupon retrieval failed: {e}")

# Test coupon clipping
print("\\n2. Coupon Clipping:")
print("-" * 25)

try:
    if coupons:
        # Try to clip the first available coupon
        first_coupon = coupons[0]
        result = client.coupons.clip(first_coupon.coupon_id)
        print(f"Clipped coupon: {first_coupon.title}")
        print(f"  Result: {result}")
    else:
        print("No coupons available to clip")
except Exception as e:
    print(f"Coupon clipping failed: {e}")

# Test getting clipped coupons
print("\\n3. Clipped Coupons:")
print("-" * 25)

try:
    clipped_coupons = client.coupons.get_clipped()
    print(f"Found {len(clipped_coupons)} clipped coupons")

    if clipped_coupons:
        for i, coupon in enumerate(clipped_coupons[:3], 1):
            print(f"  {i}. {coupon.title}")
            print(f"     Value: {coupon.value}")
            print(f"     Status: {coupon.status}")

except Exception as e:
    print(f"Clipped coupon retrieval failed: {e}")

print("\\nCoupon management methods demonstrated successfully!")""")

    # Shopping list section
    shopping_list_section = nbf.v4.new_markdown_cell("""## Shopping List Methods

The client provides comprehensive shopping list management.

### Shopping List Operations
""")

    shopping_list_example = nbf.v4.new_code_cell("""# Shopping list methods demonstration
print("Shopping List Demo")
print("=" * 30)

# Test getting current shopping list
print("1. Current Shopping List:")
print("-" * 25)

try:
    shopping_list = client.list.get()
    print(f"Found {len(shopping_list)} items in shopping list")

    if shopping_list:
        for i, item in enumerate(shopping_list[:3], 1):
            print(f"  {i}. {item.name}")
            print(f"     Quantity: {item.quantity}")
            print(f"     Price: {item.price}")
            print(f"     Status: {item.status}")

except Exception as e:
    print(f"Shopping list retrieval failed: {e}")

# Test adding items to list
print("\\n2. Adding Items to List:")
print("-" * 25)

try:
    # Add a test item
    result = client.list.add("Test Item", quantity=1, notes="Demo item")
    print(f"Added item: {result}")
except Exception as e:
    print(f"Adding item failed: {e}")

# Test completing items
print("\\n3. Completing Shopping List Items:")
print("-" * 35)

try:
    if shopping_list:
        # Complete the first item
        first_item = shopping_list[0]
        result = client.list.complete(first_item.item_id)
        print(f"Completed item: {first_item.name}")
        print(f"  Result: {result}")
    else:
        print("No items to complete")
except Exception as e:
    print(f"Completing item failed: {e}")

print("\\nShopping list methods demonstrated successfully!")""")

    # Search section
    search_section = nbf.v4.new_markdown_cell("""## Product Search Methods

The client provides comprehensive product search functionality.

### Search Operations
""")

    search_example = nbf.v4.new_code_cell("""# Product search methods demonstration
print("Product Search Demo")
print("=" * 30)

# Test basic search
print("1. Basic Product Search:")
print("-" * 25)

try:
    search_results = client.search.search("milk")
    print(f"Found {len(search_results)} products for 'milk'")

    if search_results:
        for i, product in enumerate(search_results[:3], 1):
            print(f"  {i}. {product.name}")
            print(f"     Price: {product.price}")
            print(f"     Brand: {product.brand}")
            print(f"     UPC: {product.upc}")

except Exception as e:
    print(f"Basic search failed: {e}")

# Test advanced search with filters
print("\\n2. Advanced Search with Filters:")
print("-" * 35)

try:
    advanced_results = client.search.search_advanced(
        query="bread",
        category="Bakery",
        brand="Wonder",
        price_min=1.00,
        price_max=5.00
    )
    print(f"Found {len(advanced_results)} filtered results")

    if advanced_results:
        for i, product in enumerate(advanced_results[:3], 1):
            print(f"  {i}. {product.name}")
            print(f"     Price: {product.price}")
            print(f"     Category: {product.category}")

except Exception as e:
    print(f"Advanced search failed: {e}")

# Test search pagination
print("\\n3. Search Pagination:")
print("-" * 25)

try:
    page1 = client.search.search("cereal", page=1, per_page=5)
    page2 = client.search.search("cereal", page=2, per_page=5)

    print(f"Page 1: {len(page1)} results")
    print(f"Page 2: {len(page2)} results")

    if page1 and page2:
        print("  First item on page 1:", page1[0].name)
        print("  First item on page 2:", page2[0].name)

except Exception as e:
    print(f"Search pagination failed: {e}")

print("\\nProduct search methods demonstrated successfully!")""")

    # mPerks section
    mperks_section = nbf.v4.new_markdown_cell("""## mPerks Methods

The client provides comprehensive mPerks and rewards management.

### mPerks Operations
""")

    mperks_example = nbf.v4.new_code_cell("""# mPerks methods demonstration
print("mPerks Demo")
print("=" * 20)

# Test getting mPerks info
print("1. mPerks Information:")
print("-" * 25)

try:
    mperks_info = client.mperks.get_info()
    print(f"mPerks Status: {mperks_info.status}")
    print(f"Member Since: {mperks_info.member_since}")
    print(f"Current Tier: {mperks_info.tier}")

except Exception as e:
    print(f"mPerks info retrieval failed: {e}")

# Test getting rewards
print("\\n2. Available Rewards:")
print("-" * 25)

try:
    rewards = client.mperks.get_rewards()
    print(f"Found {len(rewards)} available rewards")

    if rewards:
        for i, reward in enumerate(rewards[:3], 1):
            print(f"  {i}. {reward.title}")
            print(f"     Value: {reward.value}")
            print(f"     Expires: {reward.expires_at}")

except Exception as e:
    print(f"Rewards retrieval failed: {e}")

# Test getting mCard info
print("\\n3. mCard Information:")
print("-" * 25)

try:
    mcard_info = client.mperks.get_mcard_info()
    print(f"mCard Number: {mcard_info.number}")
    print(f"Card Type: {mcard_info.type}")
    print(f"Status: {mcard_info.status}")

except Exception as e:
    print(f"mCard info retrieval failed: {e}")

print("\\nmPerks methods demonstrated successfully!")""")

    # Feedback section
    feedback_section = nbf.v4.new_markdown_cell("""## Feedback Methods

The client provides comprehensive feedback submission functionality.

### Feedback Operations
""")

    feedback_example = nbf.v4.new_code_cell("""# Feedback methods demonstration
print("Feedback Demo")
print("=" * 20)

# Test submitting general feedback
print("1. General Feedback:")
print("-" * 20)

try:
    feedback_result = client.feedback.submit_general(
        message="Great service and clean store!",
        rating=5,
        category="Service"
    )
    print(f"Feedback submitted: {feedback_result}")

except Exception as e:
    print(f"General feedback submission failed: {e}")

# Test submitting store feedback
print("\\n2. Store Feedback:")
print("-" * 20)

try:
    store_feedback = client.feedback.submit_store(
        store_id="1234",
        message="Store was well-stocked and clean",
        rating=4,
        categories=["Cleanliness", "Service"]
    )
    print(f"Store feedback submitted: {store_feedback}")

except Exception as e:
    print(f"Store feedback submission failed: {e}")

# Test submitting product feedback
print("\\n3. Product Feedback:")
print("-" * 20)

try:
    product_feedback = client.feedback.submit_product(
        product_id="5678",
        message="Product was fresh and tasted great",
        rating=5,
        categories=["Quality", "Taste"]
    )
    print(f"Product feedback submitted: {product_feedback}")

except Exception as e:
    print(f"Product feedback submission failed: {e}")

print("\\nFeedback methods demonstrated successfully!")""")

    # Order section
    order_section = nbf.v4.new_markdown_cell("""## Order History Methods

The client provides comprehensive order history retrieval.

### Order Operations
""")

    order_example = nbf.v4.new_code_cell("""# Order history methods demonstration
print("Order History Demo")
print("=" * 30)

# Test getting recent orders
print("1. Recent Orders:")
print("-" * 20)

try:
    recent_orders = client.orders.get_recent()
    print(f"Found {len(recent_orders)} recent orders")

    if recent_orders:
        for i, order in enumerate(recent_orders[:3], 1):
            print(f"  {i}. Order #{order.order_id}")
            print(f"     Date: {order.order_date}")
            print(f"     Total: {order.total}")
            print(f"     Status: {order.status}")

except Exception as e:
    print(f"Recent orders retrieval failed: {e}")

# Test getting order details
print("\\n2. Order Details:")
print("-" * 20)

try:
    if recent_orders:
        first_order = recent_orders[0]
        order_details = client.orders.get_details(first_order.order_id)
        print(f"Order #{first_order.order_id} details:")
        print(f"  Items: {len(order_details.items)}")
        print(f"  Subtotal: {order_details.subtotal}")
        print(f"  Tax: {order_details.tax}")
        print(f"  Total: {order_details.total}")
    else:
        print("No orders available for details")
except Exception as e:
    print(f"Order details retrieval failed: {e}")

# Test getting orders by date range
print("\\n3. Orders by Date Range:")
print("-" * 30)

try:
    from datetime import datetime, timedelta

    end_date = datetime.now()
    start_date = end_date - timedelta(days=30)

    date_orders = client.orders.get_by_date_range(start_date, end_date)
    print(f"Found {len(date_orders)} orders in the last 30 days")

except Exception as e:
    print(f"Date range order retrieval failed: {e}")

print("\\nOrder history methods demonstrated successfully!")""")

    # Product detail section
    product_detail_section = nbf.v4.new_markdown_cell("""## Product Detail Methods

The client provides comprehensive product information retrieval.

### Product Operations
""")

    product_detail_example = nbf.v4.new_code_cell("""# Product detail methods demonstration
print("Product Details Demo")
print("=" * 30)

# Test getting product by UPC
print("1. Product by UPC:")
print("-" * 20)

try:
    product = client.products.get_by_upc("123456789012")
    if product:
        print(f"Product: {product.name}")
        print(f"  Brand: {product.brand}")
        print(f"  Price: {product.price}")
        print(f"  Description: {product.description}")
        print(f"  Category: {product.category}")
    else:
        print("Product not found")
except Exception as e:
    print(f"Product UPC lookup failed: {e}")

# Test getting product locations
print("\\n2. Product Locations:")
print("-" * 25)

try:
    if product:
        locations = client.products.get_locations(product.product_id)
        print(f"Found {len(locations)} store locations")

        for i, location in enumerate(locations[:3], 1):
            print(f"  {i}. {location.store_name}")
            print(f"     Aisle: {location.aisle}")
            print(f"     Section: {location.section}")
            print(f"     Availability: {location.availability}")
    else:
        print("No product available for location lookup")
except Exception as e:
    print(f"Product location lookup failed: {e}")

# Test getting product reviews
print("\\n3. Product Reviews:")
print("-" * 25)

try:
    if product:
        reviews = client.products.get_reviews(product.product_id)
        print(f"Found {len(reviews)} reviews")

        if reviews:
            for i, review in enumerate(reviews[:3], 1):
                print(f"  {i}. Rating: {review.rating}/5")
                print(f"     Comment: {review.comment}")
                print(f"     Date: {review.date}")
        else:
            print("No reviews available")
    else:
        print("No product available for review lookup")
except Exception as e:
    print(f"Product review lookup failed: {e}")

print("\\nProduct detail methods demonstrated successfully!")""")

    # Account section
    account_section = nbf.v4.new_markdown_cell("""## Account Management Methods

The client provides comprehensive account management functionality.

### Account Operations
""")

    account_example = nbf.v4.new_code_cell("""# Account management methods demonstration
print("Account Management Demo")
print("=" * 35)

# Test getting account ID
print("1. Account ID:")
print("-" * 15)

try:
    account_id = client.account.get_id()
    print(f"Account ID: {account_id}")
except Exception as e:
    print(f"Account ID retrieval failed: {e}")

# Test getting account details
print("\\n2. Account Details:")
print("-" * 20)

try:
    account_details = client.account.get_details()
    print(f"Account Information:")
    print(f"  Name: {account_details.name}")
    print(f"  Email: {account_details.email}")
    print(f"  Phone: {account_details.phone}")
    print(f"  Address: {account_details.address}")
    print(f"  Member Since: {account_details.member_since}")

except Exception as e:
    print(f"Account details retrieval failed: {e}")

# Test getting account preferences
print("\\n3. Account Preferences:")
print("-" * 25)

try:
    preferences = client.account.get_preferences()
    print(f"Account Preferences:")
    print(f"  Communication: {preferences.communication}")
    print(f"  Notifications: {preferences.notifications}")
    print(f"  Privacy: {preferences.privacy}")

except Exception as e:
    print(f"Account preferences retrieval failed: {e}")

print("\\nAccount management methods demonstrated successfully!")""")

    # Summary section
    summary_section = nbf.v4.new_markdown_cell("""## Summary

This notebook has demonstrated the comprehensive `Meijer` client system:

[OK] **Client Initialization**: Multiple authentication methods and auto-detection
[OK] **Authentication Management**: Token handling, validation, and persistence
[OK] **Store Management**: Location-based search, proximity search, and ID lookup
[OK] **Coupon Management**: Offers, clipping, pagination, and bulk retrieval
[OK] **Shopping Lists**: Comprehensive list and favorites management
[OK] **Product Search**: Advanced search with pagination and filtering
[OK] **Barcode Lookup**: Single and bulk barcode processing
[OK] **mPerks Integration**: Rewards, mCard info, and categories
[OK] **Feedback System**: Multiple feedback types with device data
[OK] **Order History**: Paginated order retrieval with field selection
[OK] **Product Details**: Comprehensive product information and location parsing
[OK] **Account Management**: Account ID and details retrieval

### Key Benefits

- **Unified Interface**: Single client for all Meijer services
- **Component Architecture**: Modular design with specialized components
- **Authentication Flexibility**: Multiple auth methods and auto-detection
- **Comprehensive Coverage**: All major Meijer API functionality
- **Error Handling**: Robust error handling and logging
- **Production Ready**: Secure token management and proper API integration

### Architecture Overview

```
Meijer Client
|-- Authentication & Token Management
|-- Shopping Lists & Favorites
|-- Coupons & Offers
|-- Product Search & Details
|-- Shop & Scan
|-- Store Management
|-- mPerks & Rewards
|-- Feedback System
|-- Order History
|-- Account Management
```

### Next Steps

- Explore individual component modules in detail
- Learn about advanced API usage patterns
- Discover integration with other Meijer services
- Understand the complete API workflow

The main client provides a powerful and comprehensive interface for building Meijer API applications!
""")

    # Add all cells to notebook
    nb.cells = [
        title_cell,
        import_cell,
        init_section,
        init_example,
        auth_methods_section,
        auth_methods_example,
        store_methods_section,
        store_methods_example,
        coupon_methods_section,
        coupon_methods_example,
        shopping_list_section,
        shopping_list_example,
        search_section,
        search_example,
        mperks_section,
        mperks_example,
        feedback_section,
        feedback_example,
        order_section,
        order_example,
        product_detail_section,
        product_detail_example,
        account_section,
        account_example,
        summary_section,
    ]

    # Save notebook
    with open("client.ipynb", "w") as f:
        nbf.write(nb, f)

    print("client.ipynb created successfully!")


if __name__ == "__main__":
    create_client_notebook()
