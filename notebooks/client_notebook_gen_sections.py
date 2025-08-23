#!/usr/bin/env python3
"""
Generate focused Jupyter notebooks for Meijer client.py - Sections Module

This module creates multiple focused notebooks, each covering a specific area
of functionality rather than one massive notebook.
"""

import nbformat as nbf


def create_basic_usage_notebook():
    """Create a basic usage notebook covering client initialization and auth."""
    nb = nbf.v4.new_notebook()

    # Title
    title = nbf.v4.new_markdown_cell("""# Meijer Client - Basic Usage

This notebook covers the basics of using the Meijer client:
- Client initialization
- Authentication methods
- Basic setup and configuration

## Overview

The `Meijer` client is the main interface for all Meijer API interactions.""")

    # Import section
    import_section = nbf.v4.new_code_cell("""# Import the main Meijer client
from meijer.client import Meijer
import json
from datetime import datetime

print("✅ Meijer client imported successfully!")""")

    # Initialization section
    init_section = nbf.v4.new_markdown_cell("""## Client Initialization

The client can be initialized with different authentication methods.""")

    init_example = nbf.v4.new_code_cell("""# Client initialization examples
print("🚀 Meijer Client Initialization Demo")

# Method 1: Auto-detect authentication
try:
    client = Meijer()
    print("✅ Auto-detect client created")
    print(f"  Authentication Status: {client.auth_status}")
    print(f"  Is Authenticated: {client.is_authenticated()}")
except Exception as e:
    print(f"❌ Auto-detect client failed: {e}")

# Method 2: With auth file path
try:
    # This would use an actual auth file if available
    # client_auth = Meijer(auth="~/.config/meijer/auth.json")
print("📁 Auth file method (commented out - requires ~/.config/meijer/auth.json)")
except Exception as e:
    print(f"❌ Auth file method failed: {e}")

print("\\n💡 Note: Authentication is required for most operations")""")

    # Auth status section
    auth_section = nbf.v4.new_markdown_cell("""## Authentication Status

Check the current authentication status and token validity.""")

    auth_example = nbf.v4.new_code_cell("""# Check authentication status
if 'client' in locals():
    print(f"🔐 Authentication Status: {client.auth_status}")
    print(f"✅ Is Authenticated: {client.is_authenticated()}")

    # Check token expiry
    if hasattr(client, 'token_expires_at') and client.token_expires_at:
        print(f"⏰ Token expires at: {client.token_expires_at}")

    # Test API connection
    try:
        stores = client.stores.get_nearby()
        print(f"🏪 API Test: ✅ Connected ({len(stores)} nearby stores)")
    except Exception as e:
        print(f"🏪 API Test: ❌ Failed - {e}")
else:
    print("⚠️  No client available - run the initialization section first")""")

    nb.cells = [
        title,
        import_section,
        init_section,
        init_example,
        auth_section,
        auth_example,
    ]
    return nb


def create_shopping_list_notebook():
    """Create a focused notebook for shopping list operations."""
    nb = nbf.v4.new_notebook()

    # Title
    title = nbf.v4.new_markdown_cell("""# Meijer Client - Shopping List Management

This notebook focuses on shopping list operations:
- Viewing shopping lists
- Adding/removing items
- Managing favorites
- List operations""")

    # Import and setup
    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    # View shopping list
    view_section = nbf.v4.new_markdown_cell("""## View Shopping List

Get the current shopping list items.""")

    view_example = nbf.v4.new_code_cell("""# Get current shopping list
try:
    items = client.list.get()

    if items:
        print(f"📝 Shopping list has {len(items)} items:")
        for i, item in enumerate(items[:5], 1):  # Show first 5
            print(f"  {i}. {item.description}")
            print(f"     📊 Quantity: {item.quantity}")
            print(f"     ✅ Completed: {item.is_completed}")
            print(f"     🏷️  Notes: {item.notes or 'None'}")
            print()
    else:
        print("📝 Shopping list is empty")

except Exception as e:
    print(f"❌ Failed to get shopping list: {e}")""")

    # Add items
    add_section = nbf.v4.new_markdown_cell("""## Add Items

Add new items to your shopping list.""")

    add_example = nbf.v4.new_code_cell("""# Add item to shopping list
try:
    # Add a simple item
    success = client.list.add("Milk", 1, "Need for cereal")

    if success:
        print("✅ Item added successfully")
        # Refresh the list
        items = client.list.get()
        print(f"📝 List now has {len(items)} items")
    else:
        print("❌ Failed to add item")

except Exception as e:
    print(f"❌ Error adding item: {e}")""")

    nb.cells = [
        title,
        import_section,
        view_section,
        view_example,
        add_section,
        add_example,
    ]
    return nb


def create_search_notebook():
    """Create a focused notebook for search functionality."""
    nb = nbf.v4.new_notebook()

    # Title
    title = nbf.v4.new_markdown_cell("""# Meijer Client - Product Search

This notebook demonstrates product search functionality:
- Text-based search
- Filtering results
- Product information
- Search pagination""")

    # Import and setup
    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    # Basic search
    search_section = nbf.v4.new_markdown_cell("""## Basic Product Search

Search for products using text queries.""")

    search_example = nbf.v4.new_code_cell("""# Search for products
try:
    # Search for milk products
    results = client.search.search("milk", results_per_page=5)

    if results and results.results:
        print(f"🔍 Found {len(results.results)} milk products:")
        for i, product in enumerate(results.results, 1):
            print(f"  {i}. {product.name}")
            print(f"     💰 Price: ${product.price:.2f}")
            print(f"     🏪 Store: {product.store_name}")
            print()
    else:
        print("❌ No products found")

except Exception as e:
    print(f"❌ Search failed: {e}")""")

    nb.cells = [
        title,
        import_section,
        search_section,
        search_example,
    ]
    return nb


def create_stores_notebook():
    """Create a focused notebook for store operations."""
    nb = nbf.v4.new_notebook()

    # Title
    title = nbf.v4.new_markdown_cell("""# Meijer Client - Store Operations

This notebook covers store-related functionality:
- Finding nearby stores
- Store information and details
- Store services and amenities
- Gas station information""")

    # Import and setup
    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    # Find nearby stores
    stores_section = nbf.v4.new_markdown_cell("""## Find Nearby Stores

Get information about Meijer stores in your area.""")

    stores_example = nbf.v4.new_code_cell("""# Get nearby stores
try:
    stores = client.stores.get_nearby()

    if stores:
        print(f"🏪 Found {len(stores)} nearby stores:")
        for i, store in enumerate(stores[:3], 1):  # Show first 3
            print(f"  {i}. {store.name}")
            print(f"     📍 {store.address}, {store.city}, {store.state}")
            print(f"     📞 Phone: {store.phone_number or 'N/A'}")
            print(f"     ⛽ Gas Station: {'Yes' if store.gas_station else 'No'}")
            print()
    else:
        print("❌ No stores found")

except Exception as e:
    print(f"❌ Failed to get stores: {e}")""")

    nb.cells = [
        title,
        import_section,
        stores_section,
        stores_example,
    ]
    return nb


def create_coupons_notebook():
    """Create a focused notebook for coupon operations."""
    nb = nbf.v4.new_notebook()

    # Title
    title = nbf.v4.new_markdown_cell("""# Meijer Client - Coupon Management

This notebook covers coupon functionality:
- Viewing available coupons
- Adding coupons to account
- Coupon categories and filtering
- Coupon operations""")

    # Import and setup
    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    # View coupons
    coupons_section = nbf.v4.new_markdown_cell("""## View Available Coupons

Get information about available coupons.""")

    coupons_example = nbf.v4.new_code_cell("""# Get available coupons
try:
    coupons = client.coupons.get_available()

    if coupons:
        print(f"🎫 Found {len(coupons)} available coupons:")
        for i, coupon in enumerate(coupons[:3], 1):  # Show first 3
            print(f"  {i}. {coupon.description}")
            print(f"     💰 Savings: {coupon.savings}")
            print(f"     📅 Expires: {coupon.expiration_date}")
            print()
    else:
        print("❌ No coupons available")

except Exception as e:
    print(f"❌ Failed to get coupons: {e}")""")

    nb.cells = [
        title,
        import_section,
        coupons_section,
        coupons_example,
    ]
    return nb


def create_mperks_notebook():
    """Create a focused notebook for mPerks functionality."""
    nb = nbf.v4.new_notebook()

    # Title
    title = nbf.v4.new_markdown_cell("""# Meijer Client - mPerks Rewards

This notebook covers mPerks functionality:
- Viewing earned rewards
- Reward categories
- Points and benefits
- mPerks operations""")

    # Import and setup
    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    # View mPerks
    mperks_section = nbf.v4.new_markdown_cell("""## View mPerks Rewards

Get information about your mPerks rewards and points.""")

    mperks_example = nbf.v4.new_code_cell("""# Get mPerks information
try:
    rewards = client.mperks.get_earned_rewards()

    if rewards:
        print(f"🎁 Found {len(rewards)} earned rewards:")
        for i, reward in enumerate(rewards[:3], 1):  # Show first 3
            print(f"  {i}. {reward.description}")
            print(f"     💰 Value: {reward.value}")
            print(f"     📅 Expires: {reward.expiration_date}")
            print()
    else:
        print("❌ No rewards found")

except Exception as e:
    print(f"❌ Failed to get mPerks: {e}")""")

    nb.cells = [
        title,
        import_section,
        mperks_section,
        mperks_example,
    ]
    return nb


def create_gas_notebook():
    """Create a focused notebook for gas station functionality."""
    nb = nbf.v4.new_notebook()

    # Title
    title = nbf.v4.new_markdown_cell("""# Meijer Client - Gas Station Information

This notebook covers gas station functionality:
- Gas prices and fuel types
- Station locations and hours
- Amenities and services
- Gas station operations""")

    # Import and setup
    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    # Gas station info
    gas_section = nbf.v4.new_markdown_cell("""## Gas Station Information

Get information about Meijer gas stations.""")

    gas_example = nbf.v4.new_code_cell("""# Get gas station information
try:
    # Get stores with gas stations
    stores = client.stores.get_nearby()
    gas_stores = [store for store in stores if store.gas_station]

    if gas_stores:
        print(f"⛽ Found {len(gas_stores)} stores with gas stations:")
        for i, store in enumerate(gas_stores[:3], 1):  # Show first 3
            print(f"  {i}. {store.name}")
            print(f"     📍 {store.address}, {store.city}")
            print(f"     ⛽ Gas Station: {store.gas_station}")
            if store.gas_station:
                print(f"     🚗 Car Wash: {'Yes' if store.gas_station.has_car_wash else 'No'}")
                print(f"     💨 Air Pump: {'Yes' if store.gas_station.has_air_pump else 'No'}")
            print()
    else:
        print("❌ No gas stations found")

except Exception as e:
    print(f"❌ Failed to get gas stations: {e}")""")

    nb.cells = [
        title,
        import_section,
        gas_section,
        gas_example,
    ]
    return nb


def create_cart_notebook():
    """Create a focused notebook for shopping cart functionality."""
    nb = nbf.v4.new_notebook()

    # Title
    title = nbf.v4.new_markdown_cell("""# Meijer Client - Shopping Cart Management

This notebook covers shopping cart functionality:
- Viewing cart contents
- Adding/removing items
- Cart totals and calculations
- Cart operations""")

    # Import and setup
    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    # Cart operations
    cart_section = nbf.v4.new_markdown_cell("""## Shopping Cart Operations

Manage your shopping cart items and totals.""")

    cart_example = nbf.v4.new_code_cell("""# Get current cart
try:
    if hasattr(client, 'cart') and client.cart:
        cart = client.cart.get_current_cart()

        if cart:
            print(f"🛒 Cart contains {len(cart.get('entries', []))} items:")
            print(f"💰 Subtotal: ${cart.get('subTotal', {}).get('formattedValue', 'N/A')}")
            print(f"📊 Total Items: {cart.get('totalItems', 0)}")
            print(f"🏪 Store: {cart.get('store', {}).get('name', 'N/A')}")
        else:
            print("🛒 Cart is empty")
    else:
        print("❌ Cart functionality not available")

except Exception as e:
    print(f"❌ Failed to get cart: {e}")""")

    nb.cells = [
        title,
        import_section,
        cart_section,
        cart_example,
    ]
    return nb


def create_shop_scan_notebook():
    """Create a focused notebook for Shop & Scan functionality."""
    nb = nbf.v4.new_notebook()

    # Title
    title = nbf.v4.new_markdown_cell("""# Meijer Client - Shop & Scan

This notebook covers Shop & Scan functionality:
- Barcode scanning and lookup
- Price checking
- Adding items to cart
- Shop & Scan operations""")

    # Import and setup
    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    # Shop & Scan operations
    scan_section = nbf.v4.new_markdown_cell("""## Shop & Scan Operations

Use Shop & Scan to look up products and manage your shopping experience.""")

    scan_example = nbf.v4.new_code_cell("""# Shop & Scan functionality
try:
    if hasattr(client, 'shop_scan'):
        print("📱 Shop & Scan functionality available")
        print("🔍 Features:")
        print("  - Barcode lookup and pricing")
        print("  - Add items to cart")
        print("  - Remove items from cart")
        print("  - View Shop & Scan cart")
        print("  - Clear Shop & Scan cart")

        # Example: Get Shop & Scan cart
        try:
            cart = client.shop_scan.get_cart()
            print(f"\\n🛒 Shop & Scan cart has {len(cart)} items")
        except Exception as e:
            print(f"\\n⚠️  Could not access Shop & Scan cart: {e}")
    else:
        print("❌ Shop & Scan functionality not available")

except Exception as e:
    print(f"❌ Failed to access Shop & Scan: {e}")""")

    nb.cells = [
        title,
        import_section,
        scan_section,
        scan_example,
    ]
    return nb


def create_feedback_notebook():
    """Create a focused notebook for feedback functionality."""
    nb = nbf.v4.new_notebook()

    # Title
    title = nbf.v4.new_markdown_cell("""# Meijer Client - Feedback System

This notebook covers feedback functionality:
- Submitting general feedback
- Shop & Scan specific feedback
- Device information
- Feedback operations""")

    # Import and setup
    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    # Feedback operations
    feedback_section = nbf.v4.new_markdown_cell("""## Feedback Operations

Submit feedback about your Meijer experience.""")

    feedback_example = nbf.v4.new_code_cell("""# Feedback functionality
try:
    if hasattr(client, 'feedback'):
        print("📝 Feedback functionality available")
        print("🔍 Features:")
        print("  - General feedback submission")
        print("  - Shop & Scan specific feedback")
        print("  - Device information collection")
        print("  - Rating and comment submission")

        # Note: Actual feedback submission requires proper device data
        print("\\n💡 Note: Feedback submission requires proper device data")
        print("   and should be used responsibly")
    else:
        print("❌ Feedback functionality not available")

except Exception as e:
    print(f"❌ Failed to access feedback: {e}")""")

    nb.cells = [
        title,
        import_section,
        feedback_section,
        feedback_example,
    ]
    return nb


def create_settings_notebook():
    """Create a focused notebook for settings functionality."""
    nb = nbf.v4.new_notebook()

    # Title
    title = nbf.v4.new_markdown_cell("""# Meijer Client - Settings Management

This notebook covers settings functionality:
- User preferences
- Account settings
- Notification preferences
- Settings operations""")

    # Import and setup
    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    # Settings operations
    settings_section = nbf.v4.new_markdown_cell("""## Settings Operations

Manage your Meijer account settings and preferences.""")

    settings_example = nbf.v4.new_code_cell("""# Settings functionality
try:
    if hasattr(client, 'settings'):
        print("⚙️  Settings functionality available")
        print("🔍 Features:")
        print("  - User preferences")
        print("  - Account settings")
        print("  - Notification preferences")
        print("  - Privacy settings")

        # Note: Settings operations may require specific permissions
        print("\\n💡 Note: Some settings operations may require specific permissions")
    else:
        print("❌ Settings functionality not available")

except Exception as e:
        print(f"❌ Failed to access settings: {e}")""")

    nb.cells = [
        title,
        import_section,
        settings_section,
        settings_example,
    ]
    return nb


def create_ad_browser_notebook():
    """Create a focused notebook for ad browser functionality."""
    nb = nbf.v4.new_notebook()

    # Title
    title = nbf.v4.new_markdown_cell("""# Meijer Client - Ad Browser

This notebook covers ad browser functionality:
- Viewing current ads and promotions
- Ad categories and filtering
- Ad details and information
- Ad browser operations""")

    # Import and setup
    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    # Ad browser operations
    ad_section = nbf.v4.new_markdown_cell("""## Ad Browser Operations

Browse current ads and promotions from Meijer.""")

    ad_example = nbf.v4.new_code_cell("""# Ad browser functionality
try:
    if hasattr(client, 'ad_browser'):
        print("📰 Ad browser functionality available")
        print("🔍 Features:")
        print("  - View current ads and promotions")
        print("  - Browse ad categories")
        print("  - Get ad details and information")
        print("  - Filter ads by type or category")

        # Note: Ad browsing may have rate limits
        print("\\n💡 Note: Ad browsing may have rate limits and usage guidelines")
    else:
        print("❌ Ad browser functionality not available")

except Exception as e:
    print(f"❌ Failed to access ad browser: {e}")""")

    nb.cells = [
        title,
        import_section,
        ad_section,
        ad_example,
    ]
    return nb


def create_product_operations_notebook():
    """Create a focused notebook for product operations."""
    nb = nbf.v4.new_notebook()

    # Title
    title = nbf.v4.new_markdown_cell("""# Meijer Client - Product Operations

This notebook covers product operations:
- Product information and details
- Product availability
- Product categories
- Product operations""")

    # Import and setup
    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    # Product operations
    product_section = nbf.v4.new_markdown_cell("""## Product Operations

Work with product information and details.""")

    product_example = nbf.v4.new_code_cell("""# Product operations functionality
try:
    if hasattr(client, 'product_ops'):
        print("📦 Product operations functionality available")
        print("🔍 Features:")
        print("  - Product information retrieval")
        print("  - Product availability checking")
        print("  - Product category management")
        print("  - Product search and filtering")

        # Note: Product operations may require specific product IDs
        print("\\n💡 Note: Product operations may require specific product IDs or UPCs")
    else:
        print("❌ Product operations functionality not available")

except Exception as e:
    print(f"❌ Failed to access product operations: {e}")""")

    nb.cells = [
        title,
        import_section,
        product_section,
        product_example,
    ]
    return nb


def create_coupon_operations_notebook():
    """Create a focused notebook for coupon operations."""
    nb = nbf.v4.new_notebook()

    # Title
    title = nbf.v4.new_markdown_cell("""# Meijer Client - Coupon Operations

This notebook covers coupon operations:
- Coupon management and manipulation
- Coupon categories and filtering
- Coupon operations and actions
- Advanced coupon functionality""")

    # Import and setup
    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    # Coupon operations
    coupon_ops_section = nbf.v4.new_markdown_cell("""## Coupon Operations

Advanced coupon management and operations.""")

    coupon_ops_example = nbf.v4.new_code_cell("""# Coupon operations functionality
try:
    if hasattr(client, 'coupon_ops'):
        print("🎫 Coupon operations functionality available")
        print("🔍 Features:")
        print("  - Advanced coupon management")
        print("  - Coupon manipulation and filtering")
        print("  - Coupon operations and actions")
        print("  - Bulk coupon operations")

        # Note: Coupon operations may have specific requirements
        print("\\n💡 Note: Coupon operations may have specific requirements and limitations")
    else:
        print("❌ Coupon operations functionality not available")

except Exception as e:
    print(f"❌ Failed to access coupon operations: {e}")""")

    nb.cells = [
        title,
        import_section,
        coupon_ops_section,
        coupon_ops_example,
    ]
    return nb
