#!/usr/bin/env python3
"""
Generate Jupyter notebook for Meijer models.py

This script creates a comprehensive notebook demonstrating all data models
and their usage with practical examples.
"""

import nbformat as nbf

def create_models_notebook():
    """Create the models notebook."""
    
    # Create notebook
    nb = nbf.v4.new_notebook()
    
    # Title and description
    title_cell = nbf.v4.new_markdown_cell("""# Meijer Data Models

This notebook demonstrates all the data models available in the Meijer API client.

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

First, let's import the necessary modules:
""")
    
    # Import cell
    import_cell = nbf.v4.new_code_cell("""# Import the models
from meijer.models import (
    MeijerItem, 
    ListItem, 
    MeijerCoupon, 
    Store, 
    SearchResult, 
    ItemType,
    create_meijer_items_from_search
)

# Import additional utilities
from datetime import date, datetime
from typing import Dict, List, Any
import json

print("✅ All models imported successfully!")
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

### Basic Usage
""")
    
    meijer_item_example = nbf.v4.new_code_cell("""# Create a basic MeijerItem
basic_item = MeijerItem(
    id="12345",
    title="Organic Bananas",
    description="Fresh organic bananas from Ecuador",
    brand="Chiquita",
    category="Produce",
    subcategory="Fruits",
    upc="123456789012",
    price=2.99,
    sale_price=1.99,
    unit_price="$1.99/lb",
    is_weighted=True,
    weight_unit="lb",
    is_available=True
)

print("Basic Item Created:")
print(f"ID: {basic_item.id}")
print(f"Title: {basic_item.title}")
print(f"Brand: {basic_item.brand}")
print(f"Category: {basic_item.category}")
print(f"Price: ${basic_item.price}")
print(f"Sale Price: ${basic_item.sale_price}")
print(f"Unit Price: {basic_item.unit_price}")
print(f"Weighted: {basic_item.is_weighted}")
print(f"Available: {basic_item.is_available}")

# Test computed properties
print(f"\\nComputed Properties:")
print(f"Display Name: {basic_item.display_name}")
print(f"Best Price: ${basic_item.best_price}")
        print(f"On Sale: {basic_item.on_sale}")""")
    
    # Constructor.io example
    constructor_example = nbf.v4.new_markdown_cell("""### Constructor.io Integration

The `MeijerItem` class can be created from Constructor.io search API responses using the `from_constructor_response` class method:
""")
    
    constructor_code = nbf.v4.new_code_cell("""# Example Constructor.io response data
constructor_data = {
    "id": "67890",
    "value": "Kellogg's Frosted Flakes",
    "data": {
        "data_id": "67890",
        "data_description": "Sweetened corn flakes cereal",
        "data_brand": "Kellogg's",
        "data_category": "Grocery",
        "data_subcategory": "Cereal",
        "data_ean": 3800039100000,
        "data_sku": "KF001",
        "data_image_url": "https://example.com/frosted-flakes.jpg",
        "data_price": 4.99,
        "data_discountsalepricevalue": 3.99,
        "data_priceunit": "$0.28/oz",
        "data_pricebyweight": False,
        "data_ispurchasable": True,
        "data_hasmperks": True,
        "data_specialbuy": True,
        "data_isagerestricted": False,
        "data_ebtfoodstampable": True,
        "data_pickupavailableflag": True,
        "data_homedeliverynotavailable": False,
        "data_ismap": False,
        "data_packagesize": "18 oz",
        "data_ingredients": "Corn, Sugar, Malt Flavoring, Salt, BHT"
    },
    "matched_terms": ["frosted", "flakes", "cereal"]
}

# Create MeijerItem from Constructor.io data
constructor_item = MeijerItem.from_constructor_response(constructor_data)

print("Constructor.io Item Created:")
print(f"ID: {constructor_item.id}")
print(f"Title: {constructor_item.title}")
print(f"Brand: {constructor_item.brand}")
print(f"Category: {constructor_item.category}")
print(f"UPC: {constructor_item.upc}")
print(f"Price: ${constructor_item.price}")
print(f"Sale Price: ${constructor_item.sale_price}")
print(f"Package Size: {constructor_item.data_packagesize}")
print(f"MPerks Eligible: {constructor_item.data_hasmperks}")
print(f"Special Buy: {constructor_item.data_specialbuy}")
print(f"EBT Eligible: {constructor_item.data_ebtfoodstampable}")
print(f"Pickup Available: {constructor_item.data_pickupavailableflag}")
print(f"Home Delivery: {constructor_item.data_homedeliverynotavailable}")
print(f"MAP Item: {constructor_item.data_ismap}")
print(f"Ingredients: {constructor_item.data_ingredients}")
print(f"Matched Terms: {constructor_item.matched_terms}")""")
    
    # ListItem section
    list_item_section = nbf.v4.new_markdown_cell("""## ListItem Class

The `ListItem` class represents an item in a shopping list or favorites list. It's based on the `ShoppingListItem` class from the decompiled APK.

### Key Features

- **List Management**: Item ID, display order, completion status
- **Item Details**: Description, quantity, notes, store association
- **Type Classification**: Product, coupon, weekly ad, or manual item
- **Promotion Support**: Start/end dates for promotional items
- **Backward Compatibility**: Properties for legacy code support

### Basic Usage
""")
    
    list_item_example = nbf.v4.new_code_cell("""# Create a ListItem for a product
product_list_item = ListItem(
    list_item_id=1001,
    list_item_type_id=ItemType.PRODUCT.value,
    item_display_order=1,
    item_part_number="BAN001",
    item_description="Organic Bananas",
    quantity=2,
    store_id=12345,
    notes="Get the yellow ones, not too ripe",
    is_complete=False,
    is_favorite=True,
    listing_id="LIST001",
    promotion_start=date(2024, 1, 15),
    promotion_end=date(2024, 1, 31),
    coupon_id=0
)

print("Product List Item Created:")
print(f"Item ID: {product_list_item.item_id}")
print(f"Name: {product_list_item.name}")
print(f"Type: {ItemType(product_list_item.list_item_type_id).name}")
print(f"Quantity: {product_list_item.quantity}")
print(f"Store ID: {product_list_item.store_id}")
print(f"Notes: {product_list_item.notes}")
print(f"Checked: {product_list_item.checked}")
print(f"Favorite: {product_list_item.is_favorite}")
print(f"Promotion: {product_list_item.promotion_start} to {product_list_item.promotion_end}")

# Test type checking properties
print(f"\\nType Properties:")
print(f"Is Product: {product_list_item.is_product}")
print(f"Is Coupon: {product_list_item.is_coupon}")
print(f"Is Weekly Ad: {product_list_item.is_weekly_ad}")
print(f"Is Manual: {product_list_item.is_manual}")

# Create a coupon list item
coupon_list_item = ListItem(
    list_item_id=1002,
    list_item_type_id=ItemType.COUPON.value,
    item_display_order=2,
    item_part_number=None,
    item_description="$1.00 off Bananas",
    quantity=1,
    store_id=12345,
    notes="Digital coupon",
    is_complete=False,
    is_favorite=False,
    listing_id="LIST001",
    promotion_start=date(2024, 1, 15),
    promotion_end=date(2024, 1, 31),
    coupon_id=5001
)

print(f"\\nCoupon List Item:")
print(f"Type: {ItemType(coupon_list_item.list_item_type_id).name}")
print(f"Is Coupon: {coupon_list_item.is_coupon}")
print(f"Coupon ID: {coupon_list_item.coupon_id}")""")
    
    # MeijerCoupon section
    coupon_section = nbf.v4.new_markdown_cell("""## MeijerCoupon Class

The `MeijerCoupon` class represents a coupon/offer from Meijer. It's based on the API response structure from the offers endpoint.

### Key Features

- **Offer Details**: Title, description, terms and conditions
- **Redemption**: Start/end dates, redeem amount
- **Status Tracking**: Clipped, auto-clipped, hidden, targeted
- **Visual Elements**: Image URLs, hat text, colors
- **Computed Properties**: Expiration status, days until expiry

### Basic Usage
""")
    
    coupon_example = nbf.v4.new_code_cell("""# Create a MeijerCoupon
coupon = MeijerCoupon(
    meijer_offer_id=1001,
    title="$1.00 off Organic Bananas",
    description="Save $1.00 on any organic bananas",
    image_url="https://example.com/coupon_small.jpg",
    large_image_url="https://example.com/coupon_large.jpg",
    terms_and_conditions="Limit one per transaction. Cannot be combined with other offers.",
    manufacturer_coupon=False,
    redemption_start_date=date(2024, 1, 15),
    redemption_end_date=date(2024, 1, 31),
    redeem_amount=1.00,
    offer_class_id=1,
    logix_offer_id=5001,
    is_suggested=True,
    is_clipped=False,
    is_auto_clipped=False,
    is_hidden=False,
    is_targeted=False,
    is_clippable=True,
    is_special_offer=True,
    category="Produce",
    subcategory="Fruits",
    tags=["organic", "bananas", "produce"],
    hat_text="SAVE $1.00",
    hat_color=16711680,  # Red
    border_color=65280,   # Green
    is_meijer_buck=False,
    show_large_image=True,
    condition_type_id=1,
    condition_value=1.0,
    discount_type_id=1,
    discount_level_id=1,
    coupon_id=5001
)

print("MeijerCoupon Created:")
print(f"Offer ID: {coupon.meijer_offer_id}")
print(f"Title: {coupon.title}")
print(f"Description: {coupon.description}")
print(f"Redemption Period: {coupon.redemption_start_date} to {coupon.redemption_end_date}")
print(f"Redeem Amount: ${coupon.redeem_amount}")
print(f"Category: {coupon.category}")
print(f"Subcategory: {coupon.subcategory}")
print(f"Tags: {coupon.tags}")
print(f"Hat Text: {coupon.hat_text}")
print(f"Special Offer: {coupon.is_special_offer}")

# Test computed properties
print(f"\\nComputed Properties:")
print(f"Is Expired: {coupon.is_expired}")
print(f"Is Active: {coupon.is_active}")
print(f"Days Until Expiry: {coupon.days_until_expiry}")

# Test with expired coupon
expired_coupon = MeijerCoupon(
    meijer_offer_id=1002,
    title="Expired Coupon",
    description="This coupon has expired",
    terms_and_conditions="Expired",
    manufacturer_coupon=False,
    redemption_start_date=date(2023, 12, 1),
    redemption_end_date=date(2023, 12, 31),
    redeem_amount=0.50,
    offer_class_id=1,
    logix_offer_id=5002
)

print(f"\\nExpired Coupon:")
print(f"Is Expired: {expired_coupon.is_expired}")
print(f"Is Active: {expired_coupon.is_active}")
print(f"Days Until Expiry: {expired_coupon.days_until_expiry}")""")
    
    # Store section
    store_section = nbf.v4.new_markdown_cell("""## Store Class

The `Store` class represents a Meijer store location with all relevant information for customers.

### Key Features

- **Location**: Address, city, state, ZIP code
- **Contact**: Phone number, hours of operation
- **Coordinates**: Latitude and longitude for mapping
- **Services**: Available services at the store
- **Status**: Whether the store is currently open

### Basic Usage
""")
    
    store_example = nbf.v4.new_code_cell("""# Create a Meijer store
store = Store(
    store_id="12345",
    name="Meijer Grand Rapids",
    address="1234 28th Street SE",
    city="Grand Rapids",
    state="MI",
    zip_code="49508",
    phone="(616) 555-0123",
    hours="Open 24 hours",
    latitude=42.9634,
    longitude=-85.6681,
    distance=2.5,
    is_open=True,
    services=["Grocery", "Pharmacy", "Gas Station", "Pickup", "Delivery"]
)

print("Store Created:")
print(f"Store ID: {store.store_id}")
print(f"Name: {store.name}")
print(f"Address: {store.address}")
print(f"City: {store.city}")
print(f"State: {store.state}")
print(f"ZIP: {store.zip_code}")
print(f"Phone: {store.phone}")
print(f"Hours: {store.hours}")
print(f"Coordinates: ({store.latitude}, {store.longitude})")
print(f"Distance: {store.distance} miles")
print(f"Open: {store.is_open}")
print(f"Services: {store.services}")

# Test computed properties
print(f"\\nComputed Properties:")
print(f"Full Address: {store.full_address}")

# Convert to dictionary
store_dict = store.to_dict()
print(f"\\nDictionary Representation:")
print(json.dumps(store_dict, indent=2))""")
    
    # SearchResult section
    search_result_section = nbf.v4.new_markdown_cell("""## SearchResult Class

The `SearchResult` class represents the results from a product search operation, including pagination and filtering information.

### Key Features

- **Results**: List of MeijerItem objects
- **Pagination**: Current page, total pages, total results
- **Search Context**: Query string, applied filters, sort order
- **Computed Properties**: Whether results exist, if it's the last page

### Basic Usage
""")
    
    search_result_example = nbf.v4.new_code_cell("""# Create sample items for search results
item1 = MeijerItem(
    id="001",
    title="Organic Bananas",
    description="Fresh organic bananas",
    brand="Chiquita",
    category="Produce",
    price=2.99
)

item2 = MeijerItem(
    id="002", 
    title="Conventional Bananas",
    description="Regular bananas",
    brand="Dole",
    category="Produce",
    price=1.99
)

item3 = MeijerItem(
    id="003",
    title="Banana Bread Mix",
    description="Banana bread baking mix",
    brand="Betty Crocker",
    category="Baking",
    price=3.49
)

# Create a SearchResult
search_result = SearchResult(
    total_results=3,
    results=[item1, item2, item3],
    current_page=1,
    total_pages=1,
    query="banana",
    filters={"category": ["Produce", "Baking"]},
    sort_by="relevance"
)

print("SearchResult Created:")
print(f"Query: '{search_result.query}'")
print(f"Total Results: {search_result.total_results}")
print(f"Current Page: {search_result.current_page}")
print(f"Total Pages: {search_result.total_pages}")
print(f"Sort By: {search_result.sort_by}")
print(f"Filters: {search_result.filters}")

# Test computed properties
print(f"\\nComputed Properties:")
print(f"Has Results: {search_result.has_results}")
print(f"Is Last Page: {search_result.is_last_page}")

# Display results
print(f"\\nSearch Results:")
for i, item in enumerate(search_result.results, 1):
    print(f"{i}. {item.title} - {item.brand} - ${item.price}")

# Convert to dictionary
result_dict = search_result.to_dict()
print(f"\\nDictionary Representation:")
print(json.dumps(result_dict, indent=2, default=str))""")
    
    # Utility functions section
    utility_section = nbf.v4.new_markdown_cell("""## Utility Functions

The models module provides utility functions for creating objects from API responses.

### create_meijer_items_from_search

This function creates a list of `MeijerItem` objects from Constructor.io search response data.
""")
    
    utility_example = nbf.v4.new_code_cell("""# Example search response data
search_response = {
    "results": [
        {
            "id": "001",
            "value": "Organic Bananas",
            "data": {
                "data_id": "001",
                "data_description": "Fresh organic bananas",
                "data_brand": "Chiquita",
                "data_category": "Produce",
                "data_price": 2.99
            }
        },
        {
            "id": "002",
            "value": "Conventional Bananas", 
            "data": {
                "data_id": "002",
                "data_description": "Regular bananas",
                "data_brand": "Dole",
                "data_category": "Produce",
                "data_price": 1.99
            }
        }
    ]
}

# Create items using the utility function
items = create_meijer_items_from_search(search_response)

print(f"Created {len(items)} items from search response:")
for i, item in enumerate(items, 1):
    print(f"{i}. {item.title} - {item.brand} - ${item.price}")

# Test with empty results
empty_response = {"results": []}
empty_items = create_meijer_items_from_search(empty_response)
print(f"\\nEmpty response created {len(empty_items)} items")

# Test with malformed data (should handle gracefully)
malformed_response = {"results": [{"invalid": "data"}]}
malformed_items = create_meijer_items_from_search(malformed_response)
print(f"Malformed response created {len(malformed_items)} items")""")
    
    # Advanced usage section
    advanced_section = nbf.v4.new_markdown_cell("""## Advanced Usage Examples

### Working with Multiple Item Types
""")
    
    advanced_example = nbf.v4.new_code_cell("""# Create a comprehensive shopping scenario
from datetime import date

# Create various types of items
grocery_item = MeijerItem(
    id="GROC001",
    title="Whole Milk",
    description="Fresh whole milk, 1 gallon",
    brand="Meijer",
    category="Dairy",
    price=3.99,
    is_available=True
)

coupon_item = MeijerCoupon(
    meijer_offer_id=2001,
    title="$0.50 off Milk",
    description="Save $0.50 on any milk product",
    terms_and_conditions="Limit one per transaction",
    manufacturer_coupon=False,
    redemption_start_date=date(2024, 1, 15),
    redemption_end_date=date(2024, 1, 31),
    redeem_amount=0.50,
    offer_class_id=1,
    logix_offer_id=6001,
    category="Dairy"
)

store_location = Store(
    store_id="67890",
    name="Meijer Lansing",
    address="5678 Saginaw Highway",
    city="Lansing", 
    state="MI",
    zip_code="48917",
    is_open=True
)

# Create list items
grocery_list_item = ListItem(
    list_item_id=2001,
    list_item_type_id=ItemType.PRODUCT.value,
    item_display_order=1,
    item_description="Whole Milk",
    quantity=1,
    store_id=67890,
    is_complete=False,
    is_favorite=False,
    listing_id="SHOP001",
    coupon_id=0
)

coupon_list_item = ListItem(
    list_item_id=2002,
    list_item_type_id=ItemType.COUPON.value,
    item_display_order=2,
    item_description="$0.50 off Milk",
    quantity=1,
    store_id=67890,
    is_complete=False,
    is_favorite=False,
    listing_id="SHOP001",
    coupon_id=2001
)

# Simulate a shopping trip
print("🛒 Shopping Trip Simulation")
print("=" * 40)
print(f"Store: {store_location.name}")
print(f"Address: {store_location.full_address}")
print(f"Open: {'Yes' if store_location.is_open else 'No'}")
print()

print("📋 Shopping List:")
print(f"1. {grocery_list_item.item_description} (Qty: {grocery_list_item.quantity})")
print(f"2. {coupon_list_item.item_description}")

print("\\n💰 Available Coupons:")
if coupon_item.is_active:
    print(f"• {coupon_item.title} - Save ${coupon_item.redeem_amount}")
    print(f"  Valid until: {coupon_item.redemption_end_date}")
else:
    print("• No active coupons")

print("\\n📱 Product Details:")
print(f"• {grocery_item.title}")
print(f"  Brand: {grocery_item.brand}")
print(f"  Category: {grocery_item.category}")
print(f"  Price: ${grocery_item.price}")
print(f"  Available: {'Yes' if grocery_item.is_available else 'No'}")

# Calculate total savings
total_savings = coupon_item.redeem_amount if coupon_item.is_active else 0
final_price = grocery_item.price - total_savings

print(f"\\n💵 Total Cost:")
print(f"Original Price: ${grocery_item.price}")
print(f"Coupon Savings: ${total_savings}")
print(f"Final Price: ${final_price}")""")
    
    # Best practices section
    best_practices_section = nbf.v4.new_markdown_cell("""## Best Practices

### 1. Type Safety
Always use the provided dataclasses instead of raw dictionaries for better type safety and IDE support.

### 2. Error Handling
The models include validation and will handle malformed data gracefully. Always check computed properties like `is_active` for coupons.

### 3. Memory Management
For large datasets, consider processing items one at a time rather than loading everything into memory.

### 4. API Compatibility
Use the `to_dict()` method when sending data back to APIs to ensure proper formatting.

### 5. Extensibility
The models include `raw_data` fields for storing additional information that might not fit the standard schema.
""")
    
    # Summary section
    summary_section = nbf.v4.new_markdown_cell("""## Summary

This notebook has demonstrated all the data models available in the Meijer API client:

✅ **MeijerItem**: Complete product representation with Constructor.io integration
✅ **ListItem**: Shopping list and favorites management
✅ **MeijerCoupon**: Coupon and offer handling with expiration logic
✅ **Store**: Store location and service information
✅ **SearchResult**: Search results with pagination support
✅ **ItemType**: Enumeration for different item types
✅ **Utility Functions**: Helper functions for API integration

### Key Benefits

- **Type Safety**: Full mypy typing support
- **API Compatibility**: Matches Meijer's API structure exactly
- **Extensibility**: Easy to add new fields and functionality
- **Performance**: Efficient data structures with computed properties
- **Documentation**: Comprehensive docstrings and examples

### Next Steps

- Explore the other modules in the Meijer package
- Learn about authentication and API client usage
- Discover shopping list and coupon management features
- Understand the search and store location capabilities

The models provide a solid foundation for building robust Meijer API applications! 🚀
""")
    
    # Add all cells to notebook
    nb.cells = [
        title_cell,
        import_cell,
        meijer_item_section,
        meijer_item_example,
        constructor_example,
        constructor_code,
        list_item_section,
        list_item_example,
        coupon_section,
        coupon_example,
        store_section,
        store_example,
        search_result_section,
        search_result_example,
        utility_section,
        utility_example,
        advanced_section,
        advanced_example,
        best_practices_section,
        summary_section
    ]
    
    # Save notebook
    with open('models.ipynb', 'w') as f:
        nbf.write(nb, f)
    
    print("✅ models.ipynb created successfully!")

if __name__ == "__main__":
    create_models_notebook() 