#!/usr/bin/env python3
"""
Generate Jupyter notebook for Meijer client.py

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

print("✅ Meijer client imported successfully!")
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
print("🚀 Meijer Client Initialization Demo")
print("=" * 45)

# Method 1: Auto-detect authentication
try:
    client_auto = Meijer()
    print("✅ Auto-detect client created")
    print(f"  Authentication Status: {client_auto.auth_status}")
    print(f"  Is Authenticated: {client_auto.is_authenticated()}")
except Exception as e:
    print(f"❌ Auto-detect client failed: {e}")

# Method 2: With auth file path
try:
    client_auth = Meijer(auth="auth.txt")
    print("✅ Auth file client created")
    print(f"  Authentication Status: {client_auth.auth_status}")
    print(f"  Is Authenticated: {client_auth.is_authenticated()}")
except Exception as e:
    print(f"❌ Auth file client failed: {e}")

# Method 3: With log file path
try:
    client_log = Meijer(auth="path/to/mitmproxy.log")
    print("✅ Log file client created")
    print(f"  Authentication Status: {client_log.auth_status}")
    print(f"  Is Authenticated: {client_log.is_authenticated()}")
except Exception as e:
    print(f"❌ Log file client failed: {e}")

print("\\n💡 Use the client that successfully authenticates for the rest of this demo")""")

    # Rich Jupyter Integration section
    rich_jupyter_section = nbf.v4.new_markdown_cell("""## 🎨 Rich Jupyter Notebook Integration

The Meijer client and its components now provide **beautiful, interactive displays** in Jupyter notebooks through rich representation methods.

### Rich Display Features Available

- **`_repr_html_`**: Rich HTML with CSS styling, icons, and visual elements
- **`_repr_markdown_`**: Clean Markdown formatting for documentation
- **`_repr_pretty_`**: Interactive IPython display for development

### Components with Rich Display

1. **Shopping List (`client.list`)**: Beautiful list visualization with item counts and status
2. **Shopping Cart (`client.cart`)**: Rich cart display with pricing and item details
3. **List Items**: Individual item representations with status indicators
4. **Cart Items**: Product displays with availability and pricing information

### How to Use

```python
# Display entire components
display(client.list)      # Rich shopping list display
display(client.cart)      # Rich cart display

# Display individual items
display(list_item)        # Rich list item display
display(cart_item)        # Rich cart item display

# Get different formats
html_repr = client.list._repr_html_()
markdown_repr = client.list._repr_markdown_()
```

Let's see these rich displays in action!""")

    # Rich Jupyter demonstration
    rich_jupyter_demo = nbf.v4.new_code_cell("""# Demonstrate rich Jupyter notebook integration
print("🎨 Rich Jupyter Notebook Integration Demo")
print("=" * 55)

if client and client.is_authenticated():
    print("✅ Client authenticated - demonstrating rich displays with real data")

    try:
        # 🎨 NEW: Rich Shopping List Display
        print("\\n1️⃣ Rich Shopping List Display:")
        print("-" * 35)

        # Get shopping list and display with rich formatting
        shopping_list = client.list.get()
        print(f"Found {len(shopping_list)} items in shopping list")

        # Display the shopping list object with rich formatting
        print("\\n📝 Shopping List Object (rich HTML representation):")
        display(client.list)

        # Display individual items with rich formatting
        if shopping_list:
            print("\\n🛒 Individual List Items (rich representations):")
            print("-" * 45)
            for i, item in enumerate(shopping_list[:3], 1):  # Show first 3 items
                print(f"\\n{i}. List Item Object:")
                display(item)

            if len(shopping_list) > 3:
                print(f"\\n... and {len(shopping_list) - 3} more items")

        # 🎨 NEW: Rich Shopping Cart Display
        print("\\n2️⃣ Rich Shopping Cart Display:")
        print("-" * 35)

        try:
            # Get shopping cart and display with rich formatting
            cart = client.cart.get()
            print(f"Cart contains {len(cart.items) if cart.items else 0} items")

            # Display the cart object with rich formatting
            print("\\n🛒 Shopping Cart Object (rich HTML representation):")
            display(client.cart)

            # Display individual cart items with rich formatting
            if cart and cart.items:
                print("\\n📦 Individual Cart Items (rich representations):")
                print("-" * 45)
                for i, item in enumerate(cart.items[:3], 1):  # Show first 3 items
                    print(f"\\n{i}. Cart Item Object:")
                    display(item)

                if len(cart.items) > 3:
                    print(f"\\n... and {len(cart.items) - 3} more items")
            else:
                print("\\n📝 Cart is empty - no items to display")

        except Exception as e:
            print(f"⚠️ Could not access cart: {e}")
            print("This might be due to API permissions or cart not being available")

        # 🎨 NEW: Rich Display Properties
        print("\\n3️⃣ Rich Display Properties:")
        print("-" * 35)

        # Show the rich display methods available
        print("\\n📊 Rich Display Method Availability:")
        print(f"  Shopping List _repr_html_: {'✅' if hasattr(client.list, '_repr_html_') else '❌'}")
        print(f"  Shopping List _repr_markdown_: {'✅' if hasattr(client.list, '_repr_markdown_') else '❌'}")
        print(f"  Shopping List _repr_pretty_: {'✅' if hasattr(client.list, '_repr_pretty_') else '❌'}")

        if hasattr(client.list, '_repr_html_'):
            html_length = len(client.list._repr_html_())
            print(f"  Shopping List HTML length: {html_length} characters")

        if hasattr(client.list, '_repr_markdown_'):
            markdown_length = len(client.list._repr_markdown_())
            print(f"  Shopping List Markdown length: {markdown_length} characters")

        # 🎨 NEW: Rich Display Examples
        print("\\n4️⃣ Rich Display Examples:")
        print("-" * 35)

        if shopping_list:
            print("\\n📝 Example List Item - Rich Markdown:")
            first_item = shopping_list[0]
            if hasattr(first_item, '_repr_markdown_'):
                print(first_item._repr_markdown_())
            else:
                print("❌ _repr_markdown_ method not available")

            print("\\n🔧 Example List Item - Rich IPython:")
            if hasattr(first_item, '_repr_pretty_'):
                print(first_item._repr_pretty_(None, False))
            else:
                print("❌ _repr_pretty_ method not available")

    except Exception as e:
        print(f"❌ Error during rich display demonstration: {e}")
        print("This might be due to API changes or authentication issues")

else:
    print("⚠️ Client not authenticated - creating mock data for demonstration")

    # Create mock objects to demonstrate rich display
    print("\\n📝 Creating mock objects for rich display demonstration...")

    # Mock shopping list item
    class MockListItem:
        def __init__(self, name, quantity, completed=False):
            self.name = name
            self.quantity = quantity
            self.checked = completed
            self.notes = "Sample item for demonstration"

        def _repr_html_(self):
            status_icon = "✅" if self.checked else "⏳"
            return f'''
            <div style="
                border: 2px solid #3498db;
                border-radius: 12px;
                padding: 16px;
                margin: 16px 0;
                background: linear-gradient(135deg, #ffffff 0%, #ecf0f1 100%);
                box-shadow: 0 4px 12px rgba(0,0,0,0.1);
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            ">
                <div style="display: flex; align-items: center; gap: 12px;">
                    <span style="font-size: 24px;">{status_icon}</span>
                    <div>
                        <h3 style="margin: 0; color: #2c3e50;">{self.name}</h3>
                        <p style="margin: 4px 0 0 0; color: #7f8c8d;">
                            Quantity: {self.quantity} • Notes: {self.notes}
                        </p>
                    </div>
                </div>
            </div>
            '''

        def _repr_markdown_(self):
            status_icon = "✅" if self.checked else "⏳"
            return f"""## {status_icon} {self.name}

**Quantity:** {self.quantity}
**Notes:** {self.notes}
**Status:** {'Complete' if self.checked else 'Pending'}

---
*Mock item for demonstration*"""

        def _repr_pretty_(self, p, cycle):
            if cycle:
                p.text("MockListItem(...)")
            else:
                status_icon = "✅" if self.checked else "⏳"
                p.text(f"{status_icon} {self.name}")
                p.breakable()
                p.text(f"  Quantity: {self.quantity}")
                p.breakable()
                p.text(f"  Notes: {self.notes}")
                p.breakable()
                p.text(f"  Status: {'Complete' if self.checked else 'Pending'}")

    # Mock shopping list
    class MockShoppingList:
        def __init__(self, items):
            self.items = items

        def get(self):
            return self.items

        def _repr_html_(self):
            completed_count = sum(1 for item in self.items if item.checked)
            return f'''
            <div style="
                border: 2px solid #3498db;
                border-radius: 16px;
                padding: 24px;
                margin: 16px 0;
                background: linear-gradient(135deg, #ffffff 0%, #ecf0f1 100%);
                box-shadow: 0 8px 24px rgba(0,0,0,0.15);
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            ">
                <div style="
                    display: flex;
                    align-items: center;
                    justify-content: space-between;
                    margin-bottom: 24px;
                    padding-bottom: 16px;
                    border-bottom: 2px solid #ecf0f1;
                ">
                    <div style="display: flex; align-items: center; gap: 16px;">
                        <span style="font-size: 36px;">📝</span>
                        <div>
                            <h1 style="margin: 0; color: #2c3e50; font-size: 28px;">Mock Shopping List</h1>
                            <p style="margin: 4px 0 0 0; color: #7f8c8d; font-size: 16px;">
                                {len(self.items)} items • {completed_count} completed • Rich Jupyter Demo
                            </p>
                        </div>
                    </div>
                    <div style="text-align: right;">
                        <div style="
                            color: #3498db;
                            font-size: 32px;
                            font-weight: 700;
                            margin-bottom: 8px;
                        ">{len(self.items)}</div>
                        <div style="color: #7f8c8d; font-size: 14px;">
                            Total Items
                        </div>
                    </div>
                </div>

                <div style="
                    display: grid;
                    grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
                    gap: 16px;
                ">
                    {''.join([f'''
                    <div style="
                        background: linear-gradient(135deg, #f8f9fa 0%, #e9ecef 100%);
                        border: 1px solid #dee2e6;
                        border-radius: 12px;
                        padding: 16px;
                    ">
                        <div style="display: flex; align-items: center; gap: 8px; margin-bottom: 8px;">
                            {'✅' if item.checked else '⏳'}
                            <strong>{item.name}</strong>
                        </div>
                        <div style="color: #6c757d; font-size: 14px;">
                            Qty: {item.quantity} • Notes: {item.notes}
                        </div>
                    </div>
                    ''' for item in self.items])}
                </div>
            </div>
            '''

        def _repr_markdown_(self):
            completed_count = sum(1 for item in self.items if item.checked)
            return f"""## 📝 Mock Shopping List - Rich Jupyter Demo

**Total Items:** {len(self.items)} • **Completed:** {completed_count} • **Remaining:** {len(self.items) - completed_count}

### Items:
{''.join([f'- **{"✅" if item.checked else "⏳"} {item.name}**\n  - Quantity: {item.quantity}\n  - Notes: {item.notes}\n' for item in self.items])}

---
*Mock shopping list for demonstration*"""

    # Create and display mock objects
    mock_items = [
        MockListItem("Organic Bananas", 2, False),
        MockListItem("Whole Milk", 1, True),
        MockListItem("Bread", 1, False)
    ]

    mock_list = MockShoppingList(mock_items)

    print("\\n📝 Mock Shopping List - Rich HTML Display:")
    display(mock_list)

    print("\\n📝 Mock Shopping List - Rich Markdown Display:")
    print(mock_list._repr_markdown_())

    print("\\n🛒 Individual Mock Items - Rich HTML Display:")
    for i, item in enumerate(mock_items, 1):
        print(f"\\n--- Item {i} ---")
        display(item)

    print("\\n💡 These mock objects demonstrate the rich Jupyter integration!")
    print("   Real authenticated clients will show actual data with the same beautiful formatting")

    # Shopping list functionality section
    list_section = nbf.v4.new_markdown_cell("""## Shopping List Functionality

The Meijer client provides comprehensive shopping list management through the `client.list` component.

### Key Features

- **Get Items**: Retrieve current shopping list
- **Add Items**: Add new items with UPC or description
- **Complete Items**: Mark items as done
- **Remove Items**: Delete items from list
- **Manage Favorites**: Add/remove favorite items
- **Defrag List**: Organize items by aisle for efficient shopping
- **🎨 Rich Jupyter Display**: Beautiful visualizations with status indicators

### Rich Display Features

- **Visual Status Indicators**: Icons for completion, favorites, promotions
- **Color-Coded Information**: Different colors for different data types
- **Interactive Elements**: Hover effects and responsive design
- **Professional Layout**: Clean, organized information display

### Shopping List Operations
""")

    # Authentication methods section
    auth_methods_section = nbf.v4.new_markdown_cell("""## Authentication Methods

The client provides several methods for managing authentication and tokens.

### Authentication Status and Validation
""")

    auth_methods_example = nbf.v4.new_code_cell("""# Authentication methods demonstration
print("🔐 Authentication Methods Demo")
print("=" * 40)

# Check authentication status
print("📊 Current Authentication Status:")
print("-" * 35)

try:
    print(f"  Is Authenticated: {client.is_authenticated()}")
    print(f"  Auth Status: {client.auth_status}")
    print(f"  Has Access Token: {client._access_token is not None}")
    print(f"  Has Refresh Token: {client._refresh_token is not None}")

except Exception as e:
    print(f"Authentication status check failed: {e}")

# Test authentication enforcement
print(f"\\n🔒 Authentication Enforcement:")
print("-" * 35)

try:
    # This will fail if not authenticated
    client._ensure_authenticated()
    print("✅ Authentication check passed")
except Exception as e:
    print(f"❌ Authentication check failed: {e}")

# Test API headers
print(f"\\n📋 API Headers:")
print("-" * 20)

try:
    headers = client._get_api_headers()
    print("API Headers generated:")
    for key, value in headers.items():
        if key == "Authorization" and value:
            print(f"  {key}: Bearer {value[:20]}...")
        else:
            print(f"  {key}: {value}")

except Exception as e:
    print(f"API headers generation failed: {e}")

# Test with mock tokens
print(f"\\n🎭 Mock Token Testing:")
print("-" * 25)

try:
    # Set mock tokens for demonstration
    client._access_token = "mock_access_token_12345"
    client._refresh_token = "mock_refresh_token_67890"

    print("Mock tokens set:")
    print(f"  Access Token: {client._access_token}")
    print(f"  Refresh Token: {client._refresh_token}")

    # Check authentication status
    print(f"\\nUpdated Status:")
    print(f"  Is Authenticated: {client.is_authenticated()}")
    print(f"  Auth Status: {client.auth_status}")

    # Test headers with token
    headers_with_token = client._get_api_headers()
    print(f"\\nHeaders with token:")
    print(f"  Authorization: {headers_with_token.get('Authorization', 'Not set')}")

except Exception as e:
    print(f"Mock token testing failed: {e}")

# Clean up mock tokens
print(f"\\n🧹 Cleaning Up Mock Tokens:")
print("-" * 35)

try:
    client._access_token = None
    client._refresh_token = None

    print("Mock tokens cleared")
    print(f"Final authentication status: {client.auth_status}")
    print(f"Final is_authenticated: {client.is_authenticated()}")

except Exception as e:
    print(f"Token cleanup failed: {e}")""")

    # Store methods section
    store_methods_section = nbf.v4.new_markdown_cell("""## Store Management Methods

The client provides comprehensive store management functionality including location-based search and proximity search.

### Store Search and Discovery
""")

    store_methods_example = nbf.v4.new_code_cell("""# Store management methods demonstration
print("🏪 Store Management Demo")
print("=" * 35)

# Test basic store search
print("📍 Basic Store Search:")
print("-" * 25)

try:
    # Search by ZIP code
    stores_by_zip = client.get_stores(zip_code="49508")
    print(f"Stores found by ZIP 49508: {len(stores_by_zip)}")

    # Search by coordinates
    stores_by_coords = client.get_stores(
        latitude=42.9634,
        longitude=-85.6681,
        zip_code="49508"
    )
    print(f"Stores found by coordinates: {len(stores_by_coords)}")

    if stores_by_coords:
        store = stores_by_coords[0]
        print(f"First store: {store.name} - {store.address}")

except Exception as e:
    print(f"Basic store search failed: {e}")

# Test proximity search
print(f"\\n🎯 Proximity Store Search:")
print("-" * 30)

try:
    # Search for stores near Grand Rapids
    nearby_stores = client.find_stores_nearby(
        latitude=42.9634,  # Grand Rapids
        longitude=-85.6681,
        radius_miles=50,
        max_results=20
    )

    print(f"Stores found within 50 miles: {len(nearby_stores)}")

    if nearby_stores:
        # Show first few stores with distance
        for i, store in enumerate(nearby_stores[:5]):
            distance = getattr(store, 'distance', 'Unknown')
            print(f"  {i+1}. {store.name} - {distance} miles away")

        # Show store details for first store
        first_store = nearby_stores[0]
        print(f"\\nFirst store details:")
        print(f"  Store ID: {getattr(first_store, 'store_id', 'N/A')}")
        print(f"  Name: {first_store.name}")
        print(f"  Address: {first_store.address}")
        print(f"  City: {first_store.city}")
        print(f"  State: {first_store.state}")
        print(f"  ZIP: {first_store.zip_code}")
        print(f"  Phone: {getattr(first_store, 'phone', 'N/A')}")
        print(f"  Hours: {getattr(first_store, 'hours', 'N/A')}")
        print(f"  Services: {getattr(first_store, 'services', [])}")

except Exception as e:
    print(f"Proximity store search failed: {e}")

# Test store lookup by ID
print(f"\\n🔍 Store Lookup by ID:")
print("-" * 30)

try:
    # Try to get store by ID (using a mock ID for demonstration)
    store_info = client.get_store_by_id("217")  # Mock store ID
    if store_info:
        print(f"Store found by ID:")
        print(f"  Name: {store_info.name}")
        print(f"  Address: {store_info.address}")
        print(f"  City: {store_info.city}")
        print(f"  State: {store_info.state}")
    else:
        print("Store not found by ID (expected for mock ID)")

except Exception as e:
    print(f"Store lookup by ID failed: {e}")

# Test store search functionality
print(f"\\n🔎 Store Search Functionality:")
print("-" * 35)

try:
    # This would use the store search component if available
    search_results = client.search_stores("Grand Rapids")
    print(f"Store search results: {len(search_results) if search_results else 0}")

except Exception as e:
    print(f"Store search functionality not available: {e}")

print(f"\\n✅ Store management methods demonstrated successfully!")""")

    # Coupon methods section
    coupon_methods_section = nbf.v4.new_markdown_cell("""## Coupon and Offer Methods

The client provides comprehensive coupon management including offers, clipping, and pagination support.

### Coupon Retrieval and Management
""")

    coupon_methods_example = nbf.v4.new_code_cell("""# Coupon methods demonstration
print("🎫 Coupon Management Demo")
print("=" * 35)

# Test getting offers
print("🎁 Getting Offers:")
print("-" * 20)

try:
    offers = client.get_offers(limit=10)
    print(f"Offers retrieved: {len(offers)}")

    if offers:
        # Show first few offers
        for i, offer in enumerate(offers[:3]):
            print(f"  {i+1}. {offer.title}")
            print(f"     Description: {offer.description}")
            print(f"     Expires: {offer.expires_at}")
            print(f"     Is Clipped: {offer.is_clipped}")
            print()

except Exception as e:
    print(f"Getting offers failed: {e}")

# Test getting coupons with pagination
print("📄 Getting Coupons with Pagination:")
print("-" * 35)

try:
    coupons = client.get_coupons(limit=50, use_pagination=True)
    print(f"Coupons retrieved: {len(coupons)}")

    if coupons:
        # Show first few coupons
        for i, coupon in enumerate(coupons[:3]):
            print(f"  {i+1}. {coupon.title}")
            print(f"     Description: {coupon.description}")
            print(f"     Expires: {coupon.expires_at}")
            print(f"     Is Clipped: {coupon.is_clipped}")
            print()

except Exception as e:
    print(f"Getting coupons failed: {e}")

# Test getting all coupons
print("📚 Getting All Coupons:")
print("-" * 25)

try:
    all_coupons = client.get_all_coupons()
    print(f"All coupons retrieved: {len(all_coupons)}")

    if all_coupons:
        print(f"First coupon: {all_coupons[0].title}")

except Exception as e:
    print(f"Getting all coupons failed: {e}")

# Test coupon clipping (mock operations)
print("📎 Coupon Clipping Operations:")
print("-" * 35)

try:
    # These would fail with mock IDs but demonstrate the interface
    clip_result = client.clip_coupon(12345)  # Mock coupon ID
    print(f"Clip coupon result: {clip_result}")

    unclip_result = client.unclip_coupon(12345)  # Mock coupon ID
    print(f"Unclip coupon result: {unclip_result}")

except Exception as e:
    print(f"Coupon clipping operations failed: {e}")

# Test store-specific offers
print("🏪 Store-Specific Offers:")
print("-" * 30)

try:
    store_offers = client.get_offers(store_id="12345", limit=5)  # Mock store ID
    print(f"Store-specific offers: {len(store_offers)}")

except Exception as e:
    print(f"Store-specific offers failed: {e}")

print(f"\\n✅ Coupon management methods demonstrated successfully!")""")

    # Shopping list section
    shopping_list_section = nbf.v4.new_markdown_cell("""## Shopping List and Favorites Methods

The client provides comprehensive shopping list and favorites management functionality.

### Shopping List Operations
""")

    shopping_list_example = nbf.v4.new_code_cell("""# Shopping list methods demonstration
print("🛒 Shopping List Management Demo")
print("=" * 40)

# Test getting shopping list
print("📋 Getting Shopping List:")
print("-" * 25)

try:
    shopping_list = client.get_shopping_list()
    print(f"Shopping list items: {len(shopping_list)}")

    if shopping_list:
        # Show first few items
        for i, item in enumerate(shopping_list[:3]):
            print(f"  {i+1}. {item.title}")
            print(f"     Quantity: {item.quantity}")
            print(f"     UPC: {item.upc}")
            print()

except Exception as e:
    print(f"Getting shopping list failed: {e}")

# Test getting favorites
print("⭐ Getting Favorites:")
print("-" * 20)

try:
    favorites = client.get_favorites()
    print(f"Favorite items: {len(favorites)}")

    if favorites:
        # Show first few favorites
        for i, item in enumerate(favorites[:3]):
            print(f"  {i+1}. {item.title}")
            print(f"     UPC: {item.upc}")
            print()

except Exception as e:
    print(f"Getting favorites failed: {e}")

# Test adding items to shopping list
print("➕ Adding Items to Shopping List:")
print("-" * 35)

try:
    # Add string item
    add_string_result = client.add_to_shopping_list("Organic Bananas", 2)
    print(f"Add string item result: {add_string_result}")

    # Add MeijerItem (mock)
    from meijer.models import MeijerItem
    mock_item = MeijerItem(
        title="Mock Product",
        upc="1234567890123",
        price=9.99,
        description="A mock product for testing"
    )
    add_item_result = client.add_to_shopping_list(mock_item, 1)
    print(f"Add MeijerItem result: {add_item_result}")

except Exception as e:
    print(f"Adding items to shopping list failed: {e}")

# Test adding items to favorites
print("❤️ Adding Items to Favorites:")
print("-" * 30)

try:
    # Add string item
    add_fav_string_result = client.add_to_favorites("Favorite Product")
    print(f"Add string to favorites result: {add_fav_string_result}")

    # Add MeijerItem
    add_fav_item_result = client.add_to_favorites(mock_item)
    print(f"Add MeijerItem to favorites result: {add_fav_item_result}")

except Exception as e:
    print(f"Adding items to favorites failed: {e}")

# Test removing items
print("🗑️ Removing Items:")
print("-" * 20)

try:
    # Remove from shopping list
    remove_list_result = client.remove_from_shopping_list(12345)  # Mock item ID
    print(f"Remove from shopping list result: {remove_list_result}")

    # Remove from favorites
    remove_fav_result = client.remove_from_favorites(12345)  # Mock item ID
    print(f"Remove from favorites result: {remove_fav_result}")

except Exception as e:
    print(f"Removing items failed: {e}")

# Test completing items
print("✅ Completing Shopping List Items:")
print("-" * 35)

try:
    complete_result = client.complete_shopping_list_item(12345)  # Mock item ID
    print(f"Complete item result: {complete_result}")

except Exception as e:
    print(f"Completing items failed: {e}")

print(f"\\n✅ Shopping list methods demonstrated successfully!")""")

    # Search section
    search_section = nbf.v4.new_markdown_cell("""## Product Search and Barcode Methods

The client provides comprehensive product search and barcode lookup functionality.

### Product Search
""")

    search_example = nbf.v4.new_code_cell("""# Product search methods demonstration
print("🔍 Product Search Demo")
print("=" * 30)

# Test product search
print("📦 Product Search:")
print("-" * 20)

try:
    search_results = client.search_products("milk", results_per_page=10, page=1)
    print(f"Search results for 'milk': {len(search_results.results)}")

    if hasattr(search_results, 'results') and search_results.results:
        # Show first few results
        for i, result in enumerate(search_results.results[:3]):
            print(f"  {i+1}. {result.title}")
            print(f"     Price: ${result.price}")
            print(f"     UPC: {result.upc}")
            print()

except Exception as e:
    print(f"Product search failed: {e}")

# Test barcode lookup
print("📱 Barcode Lookup:")
print("-" * 20)

try:
    barcode_result = client.lookup_barcode_price("1234567890123")  # Mock UPC
    if barcode_result:
        print(f"Barcode lookup successful:")
        print(f"  Title: {barcode_result.title}")
        print(f"  Price: ${barcode_result.price}")
        print(f"  UPC: {barcode_result.upc}")
    else:
        print("Barcode not found (expected for mock UPC)")

except Exception as e:
    print(f"Barcode lookup failed: {e}")

# Test bulk barcode lookup
print("📚 Bulk Barcode Lookup:")
print("-" * 30)

try:
    barcodes = ["1234567890123", "9876543210987", "5555555555555"]  # Mock UPCs
    bulk_results = client.bulk_lookup_barcodes(barcodes)
    print(f"Bulk lookup results: {len(bulk_results)}")

    for upc, result in bulk_results.items():
        if result:
            print(f"  {upc}: {result.title} - ${result.price}")
        else:
            print(f"  {upc}: Not found")

except Exception as e:
    print(f"Bulk barcode lookup failed: {e}")

# Test search pagination
print("📄 Search Pagination:")
print("-" * 25)

try:
    page1_results = client.search_products("bread", results_per_page=5, page=1)
    page2_results = client.search_products("bread", results_per_page=5, page=2)

    print(f"Page 1 results: {len(page1_results.results) if hasattr(page1_results, 'results') else 0}")
    print(f"Page 2 results: {len(page2_results.results) if hasattr(page2_results, 'results') else 0}")

except Exception as e:
    print(f"Search pagination failed: {e}")

print(f"\\n✅ Product search methods demonstrated successfully!")""")

    # mPerks section
    mperks_section = nbf.v4.new_markdown_cell("""## mPerks and Rewards Methods

The client provides comprehensive mPerks integration including rewards, mCard info, and categories.

### mPerks Functionality
""")

    mperks_example = nbf.v4.new_code_cell("""# mPerks methods demonstration
print("🎁 mPerks Integration Demo")
print("=" * 35)

# Test getting earned rewards
print("🏆 Earned Rewards:")
print("-" * 20)

try:
    earned_rewards = client.get_earned_rewards()
    print(f"Earned rewards: {len(earned_rewards)}")

    if earned_rewards:
        # Show first few rewards
        for i, reward in enumerate(earned_rewards[:3]):
            print(f"  {i+1}. {reward.title}")
            print(f"     Description: {reward.description}")
            print(f"     Value: {reward.value}")
            print()

except Exception as e:
    print(f"Getting earned rewards failed: {e}")

# Test getting mCard info
print("💳 mCard Information:")
print("-" * 25)

try:
    mcard_info = client.get_mcard_info()
    print(f"mCard info retrieved: {mcard_info is not None}")

    if mcard_info:
        print(f"mCard details available")

except Exception as e:
    print(f"Getting mCard info failed: {e}")

# Test getting available rewards
print("🎯 Available Rewards:")
print("-" * 25)

try:
    available_rewards = client.get_available_rewards()
    print(f"Available rewards: {len(available_rewards)}")

except Exception as e:
    print(f"Getting available rewards failed: {e}")

# Test getting reward categories
print("📂 Reward Categories:")
print("-" * 25)

try:
    unclipped_categories = client.get_reward_categories("unclippedonly")
    print(f"Unclipped categories: {len(unclipped_categories)}")

    clipped_categories = client.get_reward_categories("clippedonly")
    print(f"Clipped categories: {len(clipped_categories)}")

except Exception as e:
    print(f"Getting reward categories failed: {e}")

print(f"\\n✅ mPerks methods demonstrated successfully!")""")

    # Feedback section
    feedback_section = nbf.v4.new_markdown_cell("""## Feedback System Methods

The client provides a comprehensive feedback system for various feedback types.

### Feedback Submission
""")

    feedback_example = nbf.v4.new_code_cell("""# Feedback methods demonstration
print("💬 Feedback System Demo")
print("=" * 30)

# Test app feedback
print("📱 App Feedback:")
print("-" * 20)

try:
    app_feedback = client.feedback(
        "app",
        feedback_text="Great app! Very user-friendly.",
        rating=9
    )
    print(f"App feedback submitted: {app_feedback is not None}")

except Exception as e:
    print(f"App feedback failed: {e}")

# Test store feedback
print("🏪 Store Feedback:")
print("-" * 20)

try:
    store_feedback = client.feedback(
        "store",
        store_name="North Muskegon",
        store_comment="Best store ever! Great customer service.",
        rating=10
    )
    print(f"Store feedback submitted: {store_feedback is not None}")

except Exception as e:
    print(f"Store feedback failed: {e}")

# Test shop & scan feedback
print("📱 Shop & Scan Feedback:")
print("-" * 30)

try:
    shop_scan_feedback = client.feedback(
        "shop_scan",
        feedback_text="Worked perfectly!",
        store_name="Grand Rapids",
        rating=8
    )
    print(f"Shop & scan feedback submitted: {shop_scan_feedback is not None}")

except Exception as e:
    print(f"Shop & scan feedback failed: {e}")

# Test general feedback
print("📝 General Feedback:")
print("-" * 25)

try:
    general_feedback = client.feedback(
        "general",
        feedback_text="Overall great experience with Meijer services.",
        rating=9
    )
    print(f"General feedback submitted: {general_feedback is not None}")

except Exception as e:
    print(f"General feedback failed: {e}")

# Test custom feedback with device data
print("🔧 Custom Feedback with Device Data:")
print("-" * 40)

try:
    custom_feedback = client.feedback(
        "app",
        feedback_text="Custom feedback with device data",
        rating=8,
        device_data={
            "device_id": "demo_device_123",
            "app_version": "1.0.0",
            "platform": "demo"
        }
    )
    print(f"Custom feedback submitted: {custom_feedback is not None}")

except Exception as e:
    print(f"Custom feedback failed: {e}")

print(f"\\n✅ Feedback methods demonstrated successfully!")""")

    # Order history section
    order_section = nbf.v4.new_markdown_cell("""## Order History Methods

The client provides comprehensive order history retrieval with pagination and field selection.

### Order History Retrieval
""")

    order_example = nbf.v4.new_code_cell("""# Order history methods demonstration
print("📦 Order History Demo")
print("=" * 30)

# Test basic order history
print("📋 Basic Order History:")
print("-" * 25)

try:
    orders_page1 = client.get_order_history(
        current_page=0,
        page_size=10,
        fields="FULL"
    )
    print(f"Orders retrieved (page 1): {len(orders_page1)}")

    if orders_page1:
        # Show first order details
        first_order = orders_page1[0]
        print(f"First order details available")

except Exception as e:
    print(f"Getting order history failed: {e}")

# Test pagination
print("📄 Order History Pagination:")
print("-" * 30)

try:
    orders_page2 = client.get_order_history(
        current_page=1,
        page_size=10,
        fields="FULL"
    )
    print(f"Orders retrieved (page 2): {len(orders_page2)}")

except Exception as e:
    print(f"Order pagination failed: {e}")

# Test different field selections
print("🔍 Field Selection Testing:")
print("-" * 30)

try:
    basic_orders = client.get_order_history(
        current_page=0,
        page_size=5,
        fields="BASIC"
    )
    print(f"Basic fields orders: {len(basic_orders)}")

    full_orders = client.get_order_history(
        current_page=0,
        page_size=5,
        fields="FULL"
    )
    print(f"Full fields orders: {len(full_orders)}")

except Exception as e:
    print(f"Field selection testing failed: {e}")

# Test different page sizes
print("📏 Page Size Testing:")
print("-" * 25)

try:
    small_page = client.get_order_history(current_page=0, page_size=5)
    large_page = client.get_order_history(current_page=0, page_size=20)

    print(f"Small page (5 items): {len(small_page)} orders")
    print(f"Large page (20 items): {len(large_page)} orders")

except Exception as e:
    print(f"Page size testing failed: {e}")

print(f"\\n✅ Order history methods demonstrated successfully!")""")

    # Product detail section
    product_detail_section = nbf.v4.new_markdown_cell("""## Product Detail and Location Methods

The client provides comprehensive product detail lookup and location parsing functionality.

### Product Detail Lookup
""")

    product_detail_example = nbf.v4.new_code_cell("""# Product detail methods demonstration
print("📦 Product Detail Demo")
print("=" * 30)

# Test product detail lookup
print("🔍 Product Detail Lookup:")
print("-" * 30)

try:
    product_detail = client.get_product_detail("1234567890123")  # Mock UPC
    if product_detail:
        print(f"Product detail found:")
        print(f"  Title: {product_detail.title}")
        print(f"  Price: ${product_detail.price}")
        print(f"  UPC: {product_detail.upc}")
        print(f"  Description: {product_detail.description}")
    else:
        print("Product detail not found (expected for mock UPC)")

except Exception as e:
    print(f"Product detail lookup failed: {e}")

# Test location parsing methods
print("📍 Location Parsing Methods:")
print("-" * 30)

try:
    # Test various location text formats
    location_texts = [
        "B16 Section 23",
        "Aisle B | 16 Section: 35",
        "B | 16 Section: 35",
        "Aisle B | Section 16",
        "Aisle B"
    ]

    for text in location_texts:
        location_info = client._extract_location_from_text(text)
        if location_info:
            print(f"\\nText: '{text}'")
            print(f"  Parsed: {location_info}")
        else:
            print(f"\\nText: '{text}' - No location info extracted")

except Exception as e:
    print(f"Location parsing failed: {e}")

# Test location string formatting
print("\\n🔧 Location String Formatting:")
print("-" * 35)

try:
    formatted_location = client._format_location_string("B16", "23", "23")
    print(f"Formatted location: {formatted_location}")

    # Test with missing components
    partial_location = client._format_location_string("B16", None, None)
    print(f"Partial location: {partial_location}")

except Exception as e:
    print(f"Location string formatting failed: {e}")

# Test ILC location parsing
print("\\n📋 ILC Location Parsing:")
print("-" * 30)

try:
    ilc_location = client._parse_ilc_location("B16|23")
    if ilc_location:
        print(f"ILC location parsed: {ilc_location}")
    else:
        print("ILC location parsing failed")

except Exception as e:
    print(f"ILC location parsing failed: {e}")

print(f"\\n✅ Product detail methods demonstrated successfully!")""")

    # Account management section
    account_section = nbf.v4.new_markdown_cell("""## Account Management Methods

The client provides account information and management functionality.

### Account Information
""")

    account_example = nbf.v4.new_code_cell("""# Account management methods demonstration
print("👤 Account Management Demo")
print("=" * 35)

# Test getting account ID
print("🆔 Account ID Retrieval:")
print("-" * 30)

try:
    account_id = client._get_account_id()
    print(f"Account ID: {account_id}")

except Exception as e:
    print(f"Getting account ID failed: {e}")

# Test account details via settings
print("⚙️ Account Details via Settings:")
print("-" * 35)

try:
    account_details = client.settings.get_account_details()
    if account_details:
        print(f"Account details retrieved:")
        for key, value in account_details.items():
            if key == "password":
                print(f"  {key}: {'*' * len(str(value))}")
            else:
                print(f"  {key}: {value}")
    else:
        print("No account details available")

except Exception as e:
    print(f"Getting account details failed: {e}")

print(f"\\n✅ Account management methods demonstrated successfully!")""")

    # Token management section
    token_section = nbf.v4.new_markdown_cell("""## Token Management Methods

The client provides methods for saving and managing authentication tokens.

### Token Persistence
""")

    token_example = nbf.v4.new_code_cell("""# Token management methods demonstration
print("🔑 Token Management Demo")
print("=" * 35)

# Test token saving
print("💾 Token Saving:")
print("-" * 20)

try:
    # Set mock tokens for demonstration
    client._access_token = "demo_access_token_12345"
    client._refresh_token = "demo_refresh_token_67890"

    print("Mock tokens set:")
    print(f"  Access Token: {client._access_token}")
    print(f"  Refresh Token: {client._refresh_token}")

    # Save tokens
    client.save_tokens()
    print("✅ Tokens saved to config file")

except Exception as e:
    print(f"Token saving failed: {e}")

# Test authentication status
print(f"\\n🔐 Authentication Status:")
print("-" * 30)

try:
    print(f"Current Status: {client.auth_status}")
    print(f"Is Authenticated: {client.is_authenticated()}")

    # Check token availability
    print(f"\\nToken Availability:")
    print(f"  Access Token: {'✅ Available' if client._access_token else '❌ Not Available'}")
    print(f"  Refresh Token: {'✅ Available' if client._refresh_token else '❌ Not Available'}")

except Exception as e:
    print(f"Authentication status check failed: {e}")

# Test token expiration handling
print(f"\\n⏰ Token Expiration:")
print("-" * 25)

try:
    # Set future expiration
    from datetime import datetime, timedelta
    client._token_expires_at = datetime.now() + timedelta(hours=1)

    print(f"Token expires at: {client._token_expires_at}")
    print(f"Current time: {datetime.now()}")
    print(f"Time until expiry: {client._token_expires_at - datetime.now()}")

    # Test expiration check
    if client._token_expires_at and datetime.now() >= client._token_expires_at - timedelta(minutes=5):
        print("⚠️ Token expires soon or is expired")
    else:
        print("✅ Token is still valid")

except Exception as e:
    print(f"Token expiration testing failed: {e}")

# Clean up mock tokens
print(f"\\n🧹 Cleaning Up Mock Tokens:")
print("-" * 35)

try:
    client._access_token = None
    client._refresh_token = None
    client._token_expires_at = None

    print("Mock tokens cleared")
    print(f"Final authentication status: {client.auth_status}")
    print(f"Final is_authenticated: {client.is_authenticated()}")

except Exception as e:
    print(f"Token cleanup failed: {e}")""")

    # Summary section
    summary_section = nbf.v4.new_markdown_cell("""## Summary

This notebook has demonstrated the comprehensive `Meijer` client system:

✅ **Client Initialization**: Multiple authentication methods and auto-detection
✅ **Authentication Management**: Token handling, validation, and persistence
✅ **Store Management**: Location-based search, proximity search, and ID lookup
✅ **Coupon Management**: Offers, clipping, pagination, and bulk retrieval
✅ **Shopping Lists**: Comprehensive list and favorites management
✅ **Product Search**: Advanced search with pagination and filtering
✅ **Barcode Lookup**: Single and bulk barcode processing
✅ **mPerks Integration**: Rewards, mCard info, and categories
✅ **Feedback System**: Multiple feedback types with device data
✅ **Order History**: Paginated order retrieval with field selection
✅ **Product Details**: Comprehensive product information and location parsing
✅ **Account Management**: Account ID and details retrieval
✅ **Token Persistence**: Secure token storage and management

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
├── Authentication & Token Management
├── Shopping Lists & Favorites
├── Coupons & Offers
├── Product Search & Details
├── Shop & Scan
├── Store Management
├── mPerks & Rewards
├── Feedback System
├── Order History
└── Account Management
```

### Next Steps

- Explore individual component modules in detail
- Learn about advanced API usage patterns
- Discover integration with other Meijer services
- Understand the complete API workflow

The main client provides a powerful and comprehensive interface for building Meijer API applications! 🚀
""")

    # Add all cells to notebook
    nb.cells = [
        title_cell,
        import_cell,
        init_section,
        init_example,
        rich_jupyter_section,
        rich_jupyter_demo,
        list_section,
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
        token_section,
        token_example,
        summary_section,
    ]

    # Save notebook
    with open("client.ipynb", "w") as f:
        nbf.write(nb, f)

    print("✅ client.ipynb created successfully!")


if __name__ == "__main__":
    create_client_notebook()
