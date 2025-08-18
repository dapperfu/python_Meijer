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
print("  - Feedback system")""")
    
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
    # This would use an actual auth file if available
    client_auth = Meijer(auth="auth.txt")
    print("✅ Auth file client created")
    print(f"  Authentication Status: {client_auth.auth_status}")
except Exception as e:
    print(f"❌ Auth file client failed: {e}")

# Method 3: With log file path
try:
    # This would use an actual log file if available
    client_log = Meijer(auth="meijer_mitm.log")
    print("✅ Log file client created")
    print(f"  Authentication Status: {client_log.auth_status}")
except Exception as e:
    print(f"❌ Log file client failed: {e}")

# Examine client structure
print(f"\\n🔍 Client Structure Analysis:")
print("=" * 35)

# Create a client for examination (without auth)
client = Meijer()

print(f"Client Type: {type(client).__name__}")
print(f"API Base URL: {client.api_base_url}")
print(f"Subscription Key: {client.subscription_key[:20]}...")

print(f"\\nComponent Instances:")
print(f"  Shopping List: {type(client.shopping_list).__name__}")
print(f"  Coupons: {type(client.coupons).__name__}")
print(f"  Search: {type(client.search).__name__}")
print(f"  Shop & Scan: {type(client.shop_scan).__name__}")
print(f"  mPerks: {type(client.mperks).__name__}")
print(f"  Feedback: {type(client.feedback).__name__}")
print(f"  Stores: {type(client.stores).__name__}")

# Check authentication state
print(f"\\n🔐 Authentication State:")
print("=" * 25)
print(f"Access Token: {'✅ Set' if client._access_token else '❌ Not set'}")
print(f"Refresh Token: {'✅ Set' if client._refresh_token else '❌ Not set'}")
print(f"Token Expires At: {'✅ Set' if client._token_expires_at else '❌ Not set'}")
print(f"User Credentials: {'✅ Set' if client._user_credentials else '❌ Not set'}")""")
    
    # Authentication methods section
    auth_methods_section = nbf.v4.new_markdown_cell("""## Authentication Methods

The client provides several methods for managing authentication state and tokens.

### Authentication Status and Management
""")
    
    auth_methods_example = nbf.v4.new_code_cell("""# Authentication methods demonstration
print("🔐 Authentication Methods Demo")
print("=" * 35)

# Check authentication status
print("📊 Current Authentication Status:")
print(f"  Is Authenticated: {client.is_authenticated()}")
print(f"  Auth Status: {client.auth_status}")
print(f"  Has Access Token: {client._access_token is not None}")
print(f"  Has Refresh Token: {client._refresh_token is not None}")

# Test token validation
print(f"\\n🔍 Token Validation:")
print("=" * 20)

try:
    # This will fail without proper authentication
    client._ensure_authenticated()
    print("✅ Authentication check passed")
except Exception as e:
    print(f"❌ Authentication check failed (expected): {e}")

# Test API headers
print(f"\\n📋 API Headers:")
print("=" * 15)

headers = client._get_api_headers()
print("Default Headers:")
for header_name, header_value in headers.items():
    if header_name.lower() == 'authorization':
        print(f"  {header_name}: {header_value[:30]}...")
    else:
        print(f"  {header_name}: {header_value}")

# Test with mock access token
print(f"\\n🔑 Mock Token Testing:")
print("=" * 25)

# Set a mock token for demonstration
client._access_token = "mock_access_token_12345"
client._refresh_token = "mock_refresh_token_67890"

print("Mock tokens set:")
print(f"  Access Token: {client._access_token}")
print(f"  Refresh Token: {client._refresh_token}")

# Check authentication status with mock tokens
print(f"\\nUpdated Authentication Status:")
print(f"  Is Authenticated: {client.is_authenticated()}")
print(f"  Auth Status: {client.auth_status}")

# Test API headers with mock token
print(f"\\nAPI Headers with Mock Token:")
print("=" * 30)

headers_with_token = client._get_api_headers()
for header_name, header_value in headers_with_token.items():
    if header_name.lower() == 'authorization':
        print(f"  {header_name}: {header_value[:30]}...")
    else:
        print(f"  {header_name}: {header_value}")

# Reset mock tokens
client._access_token = None
client._refresh_token = None
print(f"\\n🧹 Mock tokens cleared")""")
    
    # Store methods section
    store_methods_section = nbf.v4.new_markdown_cell("""## Store Management Methods

The client provides comprehensive store management functionality including location-based search and proximity search.

### Store Search Methods
""")
    
    store_methods_example = nbf.v4.new_code_cell("""# Store methods demonstration
print("🏪 Store Management Demo")
print("=" * 30)

# Test basic store search
print("🔍 Basic Store Search:")
print("-" * 25)

try:
    # Test with ZIP code
    stores_by_zip = client.get_stores(zip_code="49508")
    print(f"Stores by ZIP 49508: {len(stores_by_zip)} found")
    
    # Test with coordinates
    stores_by_coords = client.get_stores(
        latitude=42.9634, 
        longitude=-85.6681
    )
    print(f"Stores by coordinates: {len(stores_by_coords)} found")
    
except Exception as e:
    print(f"Basic store search failed: {e}")

# Test proximity search
print(f"\\n📍 Proximity Store Search:")
print("-" * 30)

try:
    nearby_stores = client.find_stores_nearby(
        latitude=42.9634,
        longitude=-85.6681,
        radius_miles=50,
        max_results=20
    )
    print(f"Stores within 50 miles: {len(nearby_stores)} found")
    
    if nearby_stores:
        print(f"\\nSample store information:")
        sample_store = nearby_stores[0]
        print(f"  Store ID: {sample_store.store_id}")
        print(f"  Name: {sample_store.name}")
        print(f"  Address: {sample_store.address}")
        print(f"  City: {sample_store.city}")
        print(f"  State: {sample_store.state}")
        print(f"  Distance: {sample_store.distance} miles")
        
except Exception as e:
    print(f"Proximity search failed: {e}")

# Test store information
print(f"\\n📊 Store Information:")
print("-" * 25)

try:
    # Get store details
    store_info = client.get_store_info("12345")  # Mock store ID
    print(f"Store info retrieved: {store_info is not None}")
except Exception as e:
    print(f"Store info retrieval failed: {e}")

# Test store search
print(f"\\n🔎 Store Search:")
print("-" * 20)

try:
    search_results = client.search_stores("Grand Rapids")
    print(f"Store search results: {len(search_results)} found")
except Exception as e:
    print(f"Store search failed: {e}")""")
    
    # Coupon methods section
    coupon_methods_section = nbf.v4.new_markdown_cell("""## Coupon and Offer Methods

The client provides comprehensive coupon management including retrieval, clipping, and management.

### Coupon Management
""")
    
    coupon_methods_example = nbf.v4.new_code_cell("""# Coupon methods demonstration
print("🎫 Coupon Management Demo")
print("=" * 30)

# Test getting offers
print("📋 Getting Offers:")
print("-" * 20)

try:
    offers = client.get_offers(limit=10)
    print(f"Offers retrieved: {len(offers)} found")
    
    if offers:
        print(f"\\nSample offer information:")
        sample_offer = offers[0]
        print(f"  Offer ID: {sample_offer.meijer_offer_id}")
        print(f"  Title: {sample_offer.title}")
        print(f"  Description: {sample_offer.description[:50]}...")
        print(f"  Redeem Amount: ${sample_offer.redeem_amount}")
        print(f"  Is Clipped: {sample_offer.is_clipped}")
        print(f"  Is Expired: {sample_offer.is_expired}")
        
except Exception as e:
    print(f"Getting offers failed: {e}")

# Test getting coupons with pagination
print(f"\\n📄 Getting Coupons with Pagination:")
print("-" * 35)

try:
    coupons = client.get_coupons(limit=50, use_pagination=True)
    print(f"Coupons retrieved: {len(coupons)} found")
    
    if coupons:
        print(f"\\nCoupon statistics:")
        clipped_count = sum(1 for c in coupons if c.is_clipped)
        expired_count = sum(1 for c in coupons if c.is_expired)
        active_count = sum(1 for c in coupons if not c.is_expired)
        
        print(f"  Total Coupons: {len(coupons)}")
        print(f"  Clipped: {clipped_count}")
        print(f"  Expired: {expired_count}")
        print(f"  Active: {active_count}")
        
except Exception as e:
    print(f"Getting coupons failed: {e}")

# Test coupon operations
print(f"\\n✂️ Coupon Operations:")
print("-" * 25)

try:
    # Test clipping a coupon (would need valid coupon ID)
    clip_result = client.clip_coupon(12345)  # Mock coupon ID
    print(f"Clip coupon result: {clip_result}")
    
    # Test unclipping a coupon
    unclip_result = client.unclip_coupon(12345)  # Mock coupon ID
    print(f"Unclip coupon result: {unclip_result}")
    
except Exception as e:
    print(f"Coupon operations failed: {e}")

# Test store-specific offers
print(f"\\n🏪 Store-Specific Offers:")
print("-" * 30)

try:
    store_offers = client.get_offers(store_id="12345", limit=5)  # Mock store ID
    print(f"Store-specific offers: {len(store_offers)} found")
except Exception as e:
    print(f"Store-specific offers failed: {e}")""")
    
    # Shopping list methods section
    shopping_list_section = nbf.v4.new_markdown_cell("""## Shopping List and Favorites Methods

The client provides comprehensive shopping list management including adding, removing, and managing items.

### Shopping List Management
""")
    
    shopping_list_example = nbf.v4.new_code_cell("""# Shopping list methods demonstration
print("🛒 Shopping List Management Demo")
print("=" * 40)

# Test getting shopping list
print("📋 Getting Shopping List:")
print("-" * 30)

try:
    shopping_list = client.get_shopping_list()
    print(f"Shopping list items: {len(shopping_list)} found")
    
    if shopping_list:
        print(f"\\nSample shopping list item:")
        sample_item = shopping_list[0]
        print(f"  Item ID: {sample_item.list_item_id}")
        print(f"  Description: {sample_item.item_description}")
        print(f"  Quantity: {sample_item.quantity}")
        print(f"  Is Complete: {sample_item.is_complete}")
        print(f"  Is Favorite: {sample_item.is_favorite}")
        
except Exception as e:
    print(f"Getting shopping list failed: {e}")

# Test getting favorites
print(f"\\n⭐ Getting Favorites:")
print("-" * 25)

try:
    favorites = client.get_favorites()
    print(f"Favorite items: {len(favorites)} found")
except Exception as e:
    print(f"Getting favorites failed: {e}")

# Test adding items
print(f"\\n➕ Adding Items:")
print("-" * 20)

try:
    # Add string item
    add_string_result = client.add_to_shopping_list("Organic Bananas", 2)
    print(f"Add string item result: {add_string_result}")
    
    # Add MeijerItem (would need actual item)
    from meijer.models import MeijerItem
    mock_item = MeijerItem(
        id="12345",
        title="Sample Product",
        description="A sample product for testing"
    )
    add_item_result = client.add_to_shopping_list(mock_item, 1)
    print(f"Add MeijerItem result: {add_item_result}")
    
except Exception as e:
    print(f"Adding items failed: {e}")

# Test adding to favorites
print(f"\\n⭐ Adding to Favorites:")
print("-" * 30)

try:
    # Add string to favorites
    add_fav_string_result = client.add_to_favorites("Favorite Product")
    print(f"Add string to favorites result: {add_fav_string_result}")
    
    # Add MeijerItem to favorites
    add_fav_item_result = client.add_to_favorites(mock_item)
    print(f"Add MeijerItem to favorites result: {add_fav_item_result}")
    
except Exception as e:
    print(f"Adding to favorites failed: {e}")

# Test removing items
print(f"\\n➖ Removing Items:")
print("-" * 25)

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
print(f"\\n✅ Completing Items:")
print("-" * 25)

try:
    complete_result = client.complete_shopping_list_item(12345)  # Mock item ID
    print(f"Complete item result: {complete_result}")
except Exception as e:
    print(f"Completing items failed: {e}")""")
    
    # Search and barcode methods section
    search_section = nbf.v4.new_markdown_cell("""## Search and Barcode Methods

The client provides product search functionality and barcode lookup capabilities.

### Product Search and Barcode Lookup
""")
    
    search_example = nbf.v4.new_code_cell("""# Search and barcode methods demonstration
print("🔍 Search and Barcode Demo")
print("=" * 35)

# Test product search
print("🔎 Product Search:")
print("-" * 20)

try:
    search_results = client.search_products("milk", results_per_page=10, page=1)
    print(f"Search results: {search_results.total_results} total results")
    print(f"Current page: {search_results.current_page}")
    print(f"Total pages: {search_results.total_pages}")
    print(f"Results on this page: {len(search_results.results)}")
    
    if search_results.has_results:
        print(f"\\nSample search result:")
        sample_result = search_results.results[0]
        print(f"  Product ID: {sample_result.id}")
        print(f"  Title: {sample_result.title}")
        print(f"  Brand: {sample_result.brand}")
        print(f"  Price: ${sample_result.price}")
        print(f"  Category: {sample_result.category}")
        
except Exception as e:
    print(f"Product search failed: {e}")

# Test barcode lookup
print(f"\\n📱 Barcode Lookup:")
print("-" * 25)

try:
    # Single barcode lookup
    barcode_result = client.lookup_barcode_price("1234567890123")  # Mock UPC
    if barcode_result:
        print(f"Barcode lookup successful:")
        print(f"  Product: {barcode_result.title}")
        print(f"  Price: ${barcode_result.price}")
        print(f"  UPC: {barcode_result.upc}")
    else:
        print("Barcode not found")
        
except Exception as e:
    print(f"Barcode lookup failed: {e}")

# Test bulk barcode lookup
print(f"\\n📦 Bulk Barcode Lookup:")
print("-" * 30)

try:
    barcodes = ["1234567890123", "9876543210987", "5555555555555"]  # Mock UPCs
    bulk_results = client.bulk_lookup_barcodes(barcodes)
    
    print(f"Bulk lookup results: {len(bulk_results)} barcodes processed")
    for barcode, result in bulk_results.items():
        if result:
            print(f"  {barcode}: {result.title}")
        else:
            print(f"  {barcode}: Not found")
            
except Exception as e:
    print(f"Bulk barcode lookup failed: {e}")

# Test search with different parameters
print(f"\\n🔍 Advanced Search:")
print("-" * 25)

try:
    # Search with pagination
    page1_results = client.search_products("bread", results_per_page=5, page=1)
    page2_results = client.search_products("bread", results_per_page=5, page=2)
    
    print(f"Page 1 results: {len(page1_results.results)}")
    print(f"Page 2 results: {len(page2_results.results)}")
    print(f"Page 1 is last page: {page1_results.is_last_page}")
    print(f"Page 2 is last page: {page2_results.is_last_page}")
    
except Exception as e:
    print(f"Advanced search failed: {e}")""")
    
    # mPerks methods section
    mperks_section = nbf.v4.new_markdown_cell("""## mPerks and Rewards Methods

The client provides access to mPerks functionality including earned rewards and mCard information.

### mPerks Management
""")
    
    mperks_example = nbf.v4.new_code_cell("""# mPerks methods demonstration
print("🎁 mPerks and Rewards Demo")
print("=" * 35)

# Test getting earned rewards
print("🏆 Getting Earned Rewards:")
print("-" * 30)

try:
    earned_rewards = client.get_earned_rewards()
    print(f"Earned rewards: {len(earned_rewards)} found")
    
    if earned_rewards:
        print(f"\\nSample earned reward:")
        sample_reward = earned_rewards[0]
        print(f"  Reward ID: {sample_reward.reward_id}")
        print(f"  Description: {sample_reward.description}")
        print(f"  Value: ${sample_reward.value}")
        print(f"  Expiration: {sample_reward.expiration_date}")
        
except Exception as e:
    print(f"Getting earned rewards failed: {e}")

# Test getting mCard info
print(f"\\n💳 Getting mCard Information:")
print("-" * 35)

try:
    mcard_info = client.get_mcard_info()
    print(f"mCard info retrieved: {mcard_info is not None}")
    
    if mcard_info:
        print(f"\\nmCard details:")
        print(f"  Card Number: {mcard_info.card_number}")
        print(f"  Member Since: {mcard_info.member_since}")
        print(f"  Status: {mcard_info.status}")
        
except Exception as e:
    print(f"Getting mCard info failed: {e}")

# Test getting available rewards
print(f"\\n🎯 Getting Available Rewards:")
print("-" * 35)

try:
    available_rewards = client.get_available_rewards()
    print(f"Available rewards: {len(available_rewards)} found")
except Exception as e:
    print(f"Getting available rewards failed: {e}")

# Test getting reward categories
print(f"\\n📂 Getting Reward Categories:")
print("-" * 35)

try:
    # Get unclipped categories
    unclipped_categories = client.get_reward_categories("unclippedonly")
    print(f"Unclipped categories: {len(unclipped_categories)} found")
    
    # Get clipped categories
    clipped_categories = client.get_reward_categories("clippedonly")
    print(f"Clipped categories: {len(clipped_categories)} found")
    
except Exception as e:
    print(f"Getting reward categories failed: {e}")""")
    
    # Feedback methods section
    feedback_section = nbf.v4.new_markdown_cell("""## Feedback Methods

The client provides a comprehensive feedback system for submitting various types of feedback.

### Feedback System
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
print(f"\\n🏪 Store Feedback:")
print("-" * 25)

try:
    store_feedback = client.feedback(
        "store",
        store_name="North Muskegon",
        store_comment="Best store ever! Great selection and friendly staff.",
        rating=10
    )
    print(f"Store feedback submitted: {store_feedback is not None}")
except Exception as e:
    print(f"Store feedback failed: {e}")

# Test shop & scan feedback
print(f"\\n📱 Shop & Scan Feedback:")
print("-" * 30)

try:
    shop_scan_feedback = client.feedback(
        "shop_scan",
        feedback_text="Worked perfectly! Scanned quickly and accurately.",
        store_name="Grand Rapids",
        rating=8
    )
    print(f"Shop & scan feedback submitted: {shop_scan_feedback is not None}")
except Exception as e:
    print(f"Shop & scan feedback failed: {e}")

# Test general feedback
print(f"\\n📝 General Feedback:")
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

# Test feedback with custom device data
print(f"\\n🔧 Custom Device Data Feedback:")
print("-" * 35)

try:
    custom_device_data = {
        "device_model": "Custom Device",
        "os_version": "Custom OS 1.0",
        "app_version": "Custom App 2.0"
    }
    
    custom_feedback = client.feedback(
        "app",
        feedback_text="Testing with custom device data.",
        rating=7,
        device_data=custom_device_data
    )
    print(f"Custom device feedback submitted: {custom_feedback is not None}")
    
except Exception as e:
    print(f"Custom device feedback failed: {e}")""")
    
    # Order history section
    order_section = nbf.v4.new_markdown_cell("""## Order History Methods

The client provides access to order history and order management functionality.

### Order Management
""")
    
    order_example = nbf.v4.new_code_cell("""# Order history methods demonstration
print("📦 Order History Demo")
print("=" * 30)

# Test getting order history
print("📋 Getting Order History:")
print("-" * 30)

try:
    # Get first page of orders
    orders_page1 = client.get_order_history(
        current_page=0,
        page_size=10,
        fields="FULL"
    )
    print(f"Orders on page 1: {len(orders_page1)} found")
    
    if orders_page1:
        print(f"\\nSample order information:")
        sample_order = orders_page1[0]
        # Display order details (structure may vary)
        print(f"  Order retrieved: {sample_order is not None}")
        
    # Get second page
    orders_page2 = client.get_order_history(
        current_page=1,
        page_size=10,
        fields="BASIC"
    )
    print(f"Orders on page 2: {len(orders_page2)} found")
    
except Exception as e:
    print(f"Getting order history failed: {e}")

# Test different field levels
print(f"\\n🔍 Different Field Levels:")
print("-" * 30)

try:
    # Basic fields
    basic_orders = client.get_order_history(
        current_page=0,
        page_size=5,
        fields="BASIC"
    )
    print(f"Basic field orders: {len(basic_orders)} found")
    
    # Full fields
    full_orders = client.get_order_history(
        current_page=0,
        page_size=5,
        fields="FULL"
    )
    print(f"Full field orders: {len(full_orders)} found")
    
except Exception as e:
    print(f"Field level testing failed: {e}")

# Test pagination
print(f"\\n📄 Pagination Testing:")
print("-" * 25)

try:
    # Test different page sizes
    small_page = client.get_order_history(current_page=0, page_size=5)
    large_page = client.get_order_history(current_page=0, page_size=20)
    
    print(f"Small page (5 items): {len(small_page)} orders")
    print(f"Large page (20 items): {len(large_page)} orders")
    
except Exception as e:
    print(f"Pagination testing failed: {e}")""")
    
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
✅ **Store Management**: Location-based search and proximity search
✅ **Coupon Management**: Offers, clipping, and pagination support
✅ **Shopping Lists**: Comprehensive list and favorites management
✅ **Product Search**: Advanced search with pagination and filtering
✅ **Barcode Lookup**: Single and bulk barcode processing
✅ **mPerks Integration**: Rewards, mCard info, and categories
✅ **Feedback System**: Multiple feedback types with device data
✅ **Order History**: Paginated order retrieval with field selection
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
├── Product Search
├── Shop & Scan
├── Store Management
├── mPerks & Rewards
├── Feedback System
└── Order History
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
        token_section,
        token_example,
        summary_section
    ]
    
    # Save notebook
    with open('client.ipynb', 'w') as f:
        nbf.write(nb, f)
    
    print("✅ client.ipynb created successfully!")

if __name__ == "__main__":
    create_client_notebook() 