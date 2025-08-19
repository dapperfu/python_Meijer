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
    # client_auth = Meijer(auth="auth.txt")
    print("📁 Auth file method (commented out - requires auth.txt)")
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

    title = nbf.v4.new_markdown_cell("""# Meijer Client - Shopping List Management

This notebook focuses on shopping list operations:
- Viewing shopping lists
- Adding/removing items
- Managing favorites
- List operations""")

    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    view_list = nbf.v4.new_markdown_cell("""## View Shopping List

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

    add_item = nbf.v4.new_markdown_cell("""## Add Items

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

    nb.cells = [title, import_section, view_list, view_example, add_item, add_example]
    return nb


def create_search_notebook():
    """Create a focused notebook for product search."""
    nb = nbf.v4.new_notebook()

    title = nbf.v4.new_markdown_cell("""# Meijer Client - Product Search

This notebook covers product search functionality:
- Text-based search
- UPC/barcode lookup
- Product details""")

    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    search_products = nbf.v4.new_markdown_cell("""## Search Products

Search for products by name or description.""")

    search_example = nbf.v4.new_code_cell("""# Search for products
try:
    search_query = "milk"
    print(f"🔍 Searching for: {search_query}")

    search_results = client.search.search_products(search_query)

    if search_results:
        print(f"✅ Found {len(search_results)} products:")
        for i, product in enumerate(search_results[:3], 1):  # Show first 3
            print(f"  {i}. {product.title}")
            print(f"     💰 Price: ${product.price or 'N/A'}")
            print(f"     🏷️  Brand: {product.brand or 'N/A'}")
            print()
    else:
        print(f"❌ No products found for '{search_query}'")

except Exception as e:
    print(f"❌ Search failed: {e}")""")

    nb.cells = [title, import_section, search_products, search_example]
    return nb


def create_stores_notebook():
    """Create a focused notebook for store operations."""
    nb = nbf.v4.new_notebook()

    title = nbf.v4.new_markdown_cell("""# Meijer Client - Store Management

This notebook covers store-related operations:
- Finding nearby stores
- Store details
- Store search""")

    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    nearby_stores = nbf.v4.new_markdown_cell("""## Find Nearby Stores

Get stores near your current location.""")

    stores_example = nbf.v4.new_code_cell("""# Get nearby stores
try:
    print("🔍 Searching for nearby stores...")
    nearby_stores = client.stores.get_nearby()

    if nearby_stores:
        print(f"✅ Found {len(nearby_stores)} nearby stores:")
        for i, store in enumerate(nearby_stores[:3], 1):  # Show first 3
            print(f"  {i}. {store.name}")
            print(f"     📍 {store.address}")
            print(f"     🏪 Store ID: {store.id}")
            print(f"     🚗 Distance: {store.distance:.1f} miles")
            print()
    else:
        print("❌ No nearby stores found")

except Exception as e:
    print(f"❌ Failed to get stores: {e}")""")

    nb.cells = [title, import_section, nearby_stores, stores_example]
    return nb


def create_coupons_notebook():
    """Create a focused notebook for coupon operations."""
    nb = nbf.v4.new_notebook()

    title = nbf.v4.new_markdown_cell("""# Meijer Client - Coupons & Offers

This notebook covers coupon functionality:
- Available coupons
- Coupon categories
- Coupon search""")

    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    get_coupons = nbf.v4.new_markdown_cell("""## Get Available Coupons

Retrieve available coupons and offers.""")

    coupons_example = nbf.v4.new_code_cell("""# Get available coupons
try:
    print("🔍 Retrieving available coupons...")
    coupons = client.coupons.get_available()

    if coupons:
        print(f"✅ Found {len(coupons)} available coupons:")
        for i, coupon in enumerate(coupons[:5], 1):  # Show first 5
            print(f"  {i}. {coupon.title}")
            print(f"     💰 Savings: {coupon.savings}")
            print(f"     📅 Expires: {coupon.expires_at}")
            print()
    else:
        print("❌ No coupons available")

except Exception as e:
    print(f"❌ Failed to get coupons: {e}")""")

    nb.cells = [title, import_section, get_coupons, coupons_example]
    return nb


def create_mperks_notebook():
    """Create a focused notebook for mPerks operations."""
    nb = nbf.v4.new_notebook()

    title = nbf.v4.new_markdown_cell("""# Meijer Client - mPerks & Rewards

This notebook covers mPerks functionality:
- Earned rewards
- Card information
- Available offers""")

    import_section = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    get_rewards = nbf.v4.new_markdown_cell("""## Get Earned Rewards

Retrieve your earned mPerks rewards.""")

    rewards_example = nbf.v4.new_code_cell("""# Get earned rewards
try:
    print("🎁 Retrieving earned rewards...")
    earned_rewards = client.mperks.get_earned_rewards()

    if earned_rewards:
        print(f"✅ Found {len(earned_rewards)} earned rewards:")
        for i, reward in enumerate(earned_rewards[:5], 1):  # Show first 5
            print(f"  {i}. {reward.title}")
            print(f"     💰 Value: {reward.value}")
            print(f"     📅 Expires: {reward.expires_at}")
            print()
    else:
        print("❌ No earned rewards found")

except Exception as e:
    print(f"❌ Failed to get rewards: {e}")""")

    nb.cells = [title, import_section, get_rewards, rewards_example]
    return nb
