#!/usr/bin/env python3
"""
Generate Jupyter notebook for Meijer models.py

This script creates a comprehensive notebook demonstrating all data models
and their usage with real API calls to Meijer endpoints.
"""

import nbformat as nbf


def create_models_notebook():
    """Create the models notebook."""

    # Create notebook
    nb = nbf.v4.new_notebook()

    # Title and description
    title_cell = nbf.v4.new_markdown_cell("""# Meijer Data Models

This notebook demonstrates all the data models available in the Meijer API client using real API calls.

## Overview

The `models.py` module contains dataclasses that represent the structure of API responses from the Meijer mobile app. These models are based on analysis of the decompiled APK and provide a clean, type-safe interface for working with Meijer data.

## Models Available

- **MeijerItem**: Represents products/items from Meijer's system
- **ListItem**: Represents items in shopping lists or favorites lists
- **MeijerCoupon**: Represents coupons/offers from Meijer
- **Store**: Represents Meijer store locations
- **SearchResult**: Represents search results from product search
- **ItemType**: Enum for different types of list items

## Setup

First, let's import the necessary modules and create a real Meijer client:
""")

    # Import and client setup cell
    import_cell = nbf.v4.new_code_cell("""# Import the models and client
from meijer.models import (
    MeijerItem,
    ListItem,
    MeijerCoupon,
    Store,
    SearchResult,
    ItemType,
    create_meijer_items_from_search
)
from meijer.client import Meijer

# Import additional utilities
from datetime import date, datetime
from typing import Dict, List, Any
import json

print("✅ All modules imported successfully!")

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

print(f"Available item types: {[t.name for t in ItemType]}")
print(f"ItemType values: {[t.value for t in ItemType]}")""")

    # MeijerItem section
    meijer_item_section = nbf.v4.new_markdown_cell("""## MeijerItem Class

The `MeijerItem` class represents a product/item from Meijer's system. It's based on the `ProductFullDetails` class from the decompiled APK and enhanced to support Constructor.io search API responses.

### Key Features

- **Product Information**: ID, title, description, brand, category
- **Pricing**: Regular price, sale price, unit price
- **Inventory**: Availability, stock status, weight information
- **Constructor.io Integration**: Special fields for search API responses
- **Aisle Location**: Support for shopping list defragmentation

### Real API Usage
""")

    meijer_item_example = nbf.v4.new_code_cell("""# Get real items from Meijer API
if client and client.is_authenticated():
    print("🔍 Fetching real items from Meijer API...")

    try:
        # Search for real products
        search_results = client.search_products("banana", limit=5)
        print(f"Found {len(search_results)} products")

        if search_results:
            # Use the first real item
            real_item = search_results[0]
            print("\\n✅ Real MeijerItem from API:")
            print(f"ID: {real_item.id}")
            print(f"Title: {real_item.title}")
            print(f"Brand: {real_item.brand}")
            print(f"Category: {real_item.category}")
            print(f"Price: ${real_item.price}")
            print(f"Sale Price: ${real_item.sale_price}")
            print(f"Unit Price: {real_item.unit_price}")
            print(f"Weighted: {real_item.is_weighted}")
            print(f"Available: {real_item.is_available}")

            # Test computed properties
            print(f"\\nComputed Properties:")
            print(f"Display Name: {real_item.display_name}")
            print(f"Best Price: ${real_item.best_price}")
            print(f"On Sale: {real_item.on_sale}")

            # Show all available attributes
            print(f"\\nAll Attributes:")
            for attr in dir(real_item):
                if not attr.startswith('_') and not callable(getattr(real_item, attr)):
                    try:
                        value = getattr(real_item, attr)
                        print(f"  {attr}: {value}")
                    except:
                        pass
        else:
            print("No search results found")

    except Exception as e:
        print(f"❌ API search failed: {e}")
        print("Falling back to example data...")

        # Fallback example (only if API fails)
        example_item = MeijerItem(
            id="example_123",
            title="Example Product",
            description="This is example data when API is unavailable",
            brand="Example Brand",
            category="Example Category",
            price=2.99
        )
        print(f"\\nExample item created: {example_item.title}")

else:
    print("❌ Client not available or not authenticated")
    print("Cannot demonstrate real API usage")""")

    # Constructor.io section
    constructor_section = nbf.v4.new_markdown_cell("""### Constructor.io Integration

The `MeijerItem` class can be created from Constructor.io search API responses using the `from_constructor_response` class method. Let's demonstrate this with real search results:
""")

    constructor_example = nbf.v4.new_code_cell("""# Demonstrate Constructor.io integration with real search
if client and client.is_authenticated():
    print("🔍 Demonstrating Constructor.io integration...")

    try:
        # Get real search results that might include Constructor.io data
        search_results = client.search_products("cereal", limit=3)

        if search_results:
            print(f"Found {len(search_results)} cereal products")

            for i, item in enumerate(search_results[:2]):
                print(f"\\nProduct {i+1}:")
                print(f"  Title: {item.title}")
                print(f"  Brand: {item.brand}")
                print(f"  Category: {item.category}")
                print(f"  Price: ${item.price}")

                # Show Constructor.io specific fields if available
                if hasattr(item, 'data_hasmperks'):
                    print(f"  MPerks Eligible: {item.data_hasmperks}")
                if hasattr(item, 'data_specialbuy'):
                    print(f"  Special Buy: {item.data_specialbuy}")
                if hasattr(item, 'data_ebtfoodstampable'):
                    print(f"  EBT Eligible: {item.data_ebtfoodstampable}")

        else:
            print("No cereal products found")

    except Exception as e:
        print(f"❌ Constructor.io demo failed: {e}")

else:
    print("❌ Client not available for Constructor.io demo")""")

    # ListItem section
    list_item_section = nbf.v4.new_markdown_cell("""## ListItem Class

The `ListItem` class represents an item in a shopping list or favorites list. It's based on the `ShoppingListItem` class from the decompiled APK.

### Key Features

- **List Management**: Item ID, display order, completion status
- **Item Details**: Description, quantity, notes, store association
- **Type Classification**: Product, coupon, weekly ad, or manual item
- **Promotion Support**: Start/end dates for promotional items

### Real API Usage
""")

    list_item_example = nbf.v4.new_code_cell("""# Get real shopping list items from Meijer API
if client and client.is_authenticated():
    print("🛒 Fetching real shopping list items...")

    try:
        # Get real shopping lists
        shopping_lists = client.get_shopping_lists()
        print(f"Found {len(shopping_lists)} shopping lists")

        if shopping_lists:
            # Get items from the first list
            first_list = shopping_lists[0]
            print(f"\\nFirst list: {first_list.name}")

            list_items = client.get_shopping_list_items(first_list.list_id)
            print(f"Found {len(list_items)} items in the list")

            if list_items:
                # Use the first real list item
                real_list_item = list_items[0]
                print("\\n✅ Real ListItem from API:")
                print(f"Item ID: {real_list_item.item_id}")
                print(f"Name: {real_list_item.name}")
                print(f"Type: {ItemType(real_list_item.list_item_type_id).name}")
                print(f"Quantity: {real_list_item.quantity}")
                print(f"Store ID: {real_list_item.store_id}")
                print(f"Notes: {real_list_item.notes}")
                print(f"Checked: {real_list_item.checked}")
                print(f"Favorite: {real_list_item.is_favorite}")

                # Test type checking properties
                print(f"\\nType Properties:")
                print(f"Is Product: {real_list_item.is_product}")
                print(f"Is Coupon: {real_list_item.is_coupon}")
                print(f"Is Weekly Ad: {real_list_item.is_weekly_ad}")
                print(f"Is Manual: {real_list_item.is_manual}")

                # Show all available attributes
                print(f"\\nAll Attributes:")
                for attr in dir(real_list_item):
                    if not attr.startswith('_') and not callable(getattr(real_list_item, attr)):
                        try:
                            value = getattr(real_list_item, attr)
                            print(f"  {attr}: {value}")
                        except:
                            pass
            else:
                print("No items found in the first list")
        else:
            print("No shopping lists found")

    except Exception as e:
        print(f"❌ Shopping list API failed: {e}")
        print("Falling back to example data...")

        # Fallback example (only if API fails)
        example_list_item = ListItem(
            list_item_id=1001,
            list_item_type_id=ItemType.PRODUCT.value,
            item_display_order=1,
            item_part_number="12345",
            item_description="Example Product",
            quantity=2,
            store_id=12345,
            notes="Example note",
            is_complete=False,
            is_favorite=False,
            listing_id="LIST001"
        )
        print(f"\\nExample list item created: {example_list_item.item_description}")

else:
    print("❌ Client not available for shopping list demo")""")

    # MeijerCoupon section
    coupon_section = nbf.v4.new_markdown_cell("""## MeijerCoupon Class

The `MeijerCoupon` class represents a coupon/offer from Meijer. It's based on the API response structure from the offers endpoint.

### Key Features

- **Offer Details**: Title, description, terms and conditions
- **Redemption**: Start/end dates, redeem amount
- **Status Tracking**: Clipped, auto-clipped, hidden, targeted
- **Visual Elements**: Image URLs, hat text, colors
- **Computed Properties**: Expiration status, days until expiry

### Real API Usage
""")

    coupon_example = nbf.v4.new_code_cell("""# Get real coupons from Meijer API
if client and client.is_authenticated():
    print("🎫 Fetching real coupons from Meijer API...")

    try:
        # Get real offers/coupons
        offers = client.get_offers(limit=5)
        print(f"Found {len(offers)} offers")

        if offers:
            # Use the first real coupon
            real_coupon = offers[0]
            print("\\n✅ Real MeijerCoupon from API:")
            print(f"Offer ID: {real_coupon.meijer_offer_id}")
            print(f"Title: {real_coupon.title}")
            print(f"Description: {real_coupon.description}")
            print(f"Redemption Period: {real_coupon.redemption_start_date} to {real_coupon.redemption_end_date}")
            print(f"Redeem Amount: ${real_coupon.redeem_amount}")
            print(f"Category: {real_coupon.category}")
            print(f"Subcategory: {real_coupon.subcategory}")
            print(f"Tags: {real_coupon.tags}")
            print(f"Hat Text: {real_coupon.hat_text}")
            print(f"Special Offer: {real_coupon.is_special_offer}")

            # Test computed properties
            print(f"\\nComputed Properties:")
            print(f"Is Expired: {real_coupon.is_expired}")
            print(f"Is Active: {real_coupon.is_active}")
            print(f"Days Until Expiry: {real_coupon.days_until_expiry}")

            # Show all available attributes
            print(f"\\nAll Attributes:")
            for attr in dir(real_coupon):
                if not attr.startswith('_') and not callable(getattr(real_coupon, attr)):
                    try:
                        value = getattr(real_coupon, attr)
                        print(f"  {attr}: {value}")
                    except:
                        pass
        else:
            print("No offers found")

    except Exception as e:
        print(f"❌ Coupon API failed: {e}")
        print("Falling back to example data...")

        # Fallback example (only if API fails)
        example_coupon = MeijerCoupon(
            meijer_offer_id=1001,
            title="Example Coupon",
            description="This is example data when API is unavailable",
            terms_and_conditions="Example terms",
            manufacturer_coupon=False,
            redemption_start_date=date(2024, 1, 15),
            redemption_end_date=date(2024, 1, 31),
            redeem_amount=1.00,
            offer_class_id=1,
            logix_offer_id=5001
        )
        print(f"\\nExample coupon created: {example_coupon.title}")

else:
    print("❌ Client not available for coupon demo")""")

    # Store section
    store_section = nbf.v4.new_markdown_cell("""## Store Class

The `Store` class represents a Meijer store location with all relevant information for customers.

### Key Features

- **Location**: Address, city, state, ZIP code
- **Contact**: Phone number, hours of operation
- **Coordinates**: Latitude and longitude for mapping
- **Services**: Available services at the store
- **Status**: Whether the store is currently open

### Real API Usage
""")

    store_example = nbf.v4.new_code_cell("""# Get real stores from Meijer API
if client and client.is_authenticated():
    print("🏪 Fetching real stores from Meijer API...")

    try:
        # Get real stores
        stores = client.get_stores(zip_code="49508", limit=3)
        print(f"Found {len(stores)} stores")

        if stores:
            # Use the first real store
            real_store = stores[0]
            print("\\n✅ Real Store from API:")
            print(f"Store ID: {real_store.store_id}")
            print(f"Name: {real_store.name}")
            print(f"Address: {real_store.address}")
            print(f"City: {real_store.city}")
            print(f"State: {real_store.state}")
            print(f"ZIP: {real_store.zip_code}")
            print(f"Phone: {real_store.phone}")
            print(f"Hours: {real_store.hours}")
            print(f"Coordinates: ({real_store.latitude}, {real_store.longitude})")
            print(f"Distance: {real_store.distance} miles")
            print(f"Open: {real_store.is_open}")
            print(f"Services: {real_store.services}")

            # Test computed properties
            print(f"\\nComputed Properties:")
            print(f"Full Address: {real_store.full_address}")

            # Convert to dictionary
            store_dict = real_store.to_dict()
            print(f"\\nDictionary Representation:")
            print(json.dumps(store_dict, indent=2))

            # Show all available attributes
            print(f"\\nAll Attributes:")
            for attr in dir(real_store):
                if not attr.startswith('_') and not callable(getattr(real_store, attr)):
                    try:
                        value = getattr(real_store, attr)
                        print(f"  {attr}: {value}")
                    except:
                        pass
        else:
            print("No stores found")

    except Exception as e:
        print(f"❌ Store API failed: {e}")
        print("Falling back to example data...")

        # Fallback example (only if API fails)
        example_store = Store(
            store_id="example_123",
            name="Example Store",
            address="123 Example Street",
            city="Example City",
            state="MI",
            zip_code="12345",
            phone="(555) 123-4567",
            hours="Open 24 hours",
            latitude=42.9634,
            longitude=-85.6681,
            distance=0.0,
            is_open=True,
            services=["Grocery", "Pharmacy"]
        )
        print(f"\\nExample store created: {example_store.name}")

else:
    print("❌ Client not available for store demo")""")

    # SearchResult section
    search_result_section = nbf.v4.new_markdown_cell("""## SearchResult Class

The `SearchResult` class represents the results of a product search operation, including pagination information and result metadata.

### Key Features

- **Search Results**: List of items matching the search query
- **Pagination**: Total count, page information, navigation
- **Query Information**: Search term, filters applied
- **Result Metadata**: Search performance and timing information

### Real API Usage
""")

    search_result_example = nbf.v4.new_code_cell("""# Demonstrate SearchResult with real search
if client and client.is_authenticated():
    print("🔍 Demonstrating SearchResult with real search...")

    try:
        # Perform a real search
        search_results = client.search_products("milk", limit=10)

        if search_results:
            print(f"✅ Search completed successfully!")
            print(f"Found {len(search_results)} products")

            # Show first few results
            print("\\nFirst 3 results:")
            for i, item in enumerate(search_results[:3]):
                print(f"  {i+1}. {item.title} - ${item.price}")

            # Demonstrate SearchResult properties if available
            if hasattr(search_results, 'total_count'):
                print(f"\\nTotal available: {search_results.total_count}")
            if hasattr(search_results, 'query'):
                print(f"Search query: {search_results.query}")
            if hasattr(search_results, 'filters'):
                print(f"Applied filters: {search_results.filters}")

        else:
            print("No search results found")

    except Exception as e:
        print(f"❌ Search demo failed: {e}")

else:
    print("❌ Client not available for search demo")""")

    # Advanced usage section
    advanced_section = nbf.v4.new_markdown_cell("""## Advanced Usage Examples

### Working with Multiple Items
""")

    advanced_example = nbf.v4.new_code_cell("""# Advanced usage with real data
if client and client.is_authenticated():
    print("🚀 Advanced usage examples with real data...")

    try:
        # Get multiple types of data
        print("\\n1. Getting multiple products...")
        products = client.search_products("bread", limit=5)
        print(f"   Found {len(products)} bread products")

        print("\\n2. Getting multiple coupons...")
        coupons = client.get_offers(limit=5)
        print(f"   Found {len(coupons)} coupons")

        print("\\n3. Getting multiple stores...")
        stores = client.get_stores(zip_code="49508", limit=3)
        print(f"   Found {len(stores)} stores")

        # Demonstrate data processing
        if products and coupons and stores:
            print("\\n4. Data processing examples:")

            # Filter products by price
            affordable_products = [p for p in products if p.price < 5.00]
            print(f"   Products under $5: {len(affordable_products)}")

            # Filter coupons by category
            grocery_coupons = [c for c in coupons if c.category == "Grocery"]
            print(f"   Grocery coupons: {len(grocery_coupons)}")

            # Filter stores by services
            pharmacy_stores = [s for s in stores if "Pharmacy" in s.services]
            print(f"   Stores with pharmacy: {len(pharmacy_stores)}")

    except Exception as e:
        print(f"❌ Advanced usage demo failed: {e}")

else:
    print("❌ Client not available for advanced usage demo")""")

    # Summary section
    summary_section = nbf.v4.new_markdown_cell("""## Summary

This notebook has demonstrated all the data models available in the Meijer API client using **real API calls** instead of mocked data.

### Key Takeaways

- **Real Data**: All examples use actual Meijer API responses
- **Type Safety**: Models provide structured, validated data
- **Computed Properties**: Models include helpful computed attributes
- **API Integration**: Seamless integration with Meijer's services
- **Error Handling**: Graceful fallbacks when API calls fail

### Next Steps

- Explore the individual model classes in more detail
- Use these models in your own applications
- Check the API documentation for additional endpoints
- Experiment with different search queries and filters

### Available Models

- **MeijerItem**: Product and item information
- **ListItem**: Shopping list and favorites management
- **MeijerCoupon**: Coupon and offer management
- **Store**: Store location and information
- **SearchResult**: Search operation results
- **ItemType**: Item classification enums

All models are designed to work seamlessly with the Meijer API and provide a consistent, type-safe interface for your applications.
""")

    # Add all cells to notebook
    nb.cells = [
        title_cell,
        import_cell,
        meijer_item_section,
        meijer_item_example,
        constructor_section,
        constructor_example,
        list_item_section,
        list_item_example,
        coupon_section,
        coupon_example,
        store_section,
        store_example,
        search_result_section,
        search_result_example,
        advanced_section,
        advanced_example,
        summary_section,
    ]

    return nb


if __name__ == "__main__":
    # Create the notebook
    nb = create_models_notebook()

    # Write to file
    with open("models.ipynb", "w") as f:
        nbf.write(nb, f)

    print("✅ models.ipynb generated successfully!")
