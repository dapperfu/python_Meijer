#!/usr/bin/env python3
"""
Generate Jupyter notebook for Meijer models.py

This script creates a comprehensive notebook demonstrating all data models
and their usage with real API calls to Meijer endpoints, including
rich Jupyter Notebook integration with _repr* functions.
"""

import nbformat as nbf


def create_models_notebook():
    """Create the models notebook."""

    # Create notebook
    nb = nbf.v4.new_notebook()

    # Title and description
    title_cell = nbf.v4.new_markdown_cell("""# Meijer Data Models with Rich Jupyter Integration

This notebook demonstrates all the data models available in the Meijer API client using real API calls, with special focus on the **rich Jupyter Notebook integration** provided by `_repr_html_`, `_repr_markdown_`, and `_repr_pretty_` methods.

## Overview

The `models.py` module contains dataclasses that represent the structure of API responses from the Meijer mobile app. These models are based on analysis of the decompiled APK and provide a clean, type-safe interface for working with Meijer data.

## 🎨 Rich Jupyter Notebook Integration

All major model classes now include beautiful display methods:
- **`_repr_html_`**: Rich HTML representations with styling and icons
- **`_repr_markdown_`**: Clean Markdown formatting for documentation
- **`_repr_pretty_`**: Interactive IPython display for development

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
print(f"ItemType values: {[t.value for t in ItemType]}")

# 🆕 NEW: Test rich Jupyter integration
print("\\n🎨 Testing Rich Jupyter Notebook Integration:")
print("=" * 50)
print("All model classes now support beautiful display in notebooks!")
print("Use display() function or just type the variable name to see rich formatting")""")

    # Rich Jupyter Integration Overview
    rich_overview = nbf.v4.new_markdown_cell("""## 🎨 Rich Jupyter Notebook Integration Overview

The Meijer models now provide **beautiful, interactive displays** in Jupyter notebooks through three key methods:

### Display Methods Available

1. **`_repr_html_`**: Rich HTML with CSS styling, icons, and visual elements
2. **`_repr_markdown_`**: Clean Markdown formatting for documentation
3. **`_repr_pretty_`**: Interactive IPython display for development

### How to Use

```python
# Method 1: Use display() function (recommended)
display(my_model_object)

# Method 2: Just type the variable name
my_model_object

# Method 3: Convert to different formats
html_repr = my_model_object._repr_html_()
markdown_repr = my_model_object._repr_markdown_()
```

### Benefits

- **Visual Appeal**: Beautiful, styled representations with icons and colors
- **Interactive**: Clickable elements and hover effects
- **Documentation**: Rich Markdown for technical writing
- **Development**: Enhanced debugging and inspection
- **Professional**: Publication-ready visualizations

Let's see these in action with real data!""")

    # MeijerItem section with rich display
    meijer_item_section = nbf.v4.new_markdown_cell("""## MeijerItem Class with Rich Display

The `MeijerItem` class represents a product/item from Meijer's system. It's based on the `ProductFullDetails` class from the decompiled APK and enhanced to support Constructor.io search API responses.

### Key Features

- **Product Information**: ID, title, description, brand, category
- **Pricing**: Regular price, sale price, unit price
- **Inventory**: Availability, stock status, weight information
- **Constructor.io Integration**: Special fields for search API responses
- **Aisle Location**: Support for shopping list defragmentation
- **🎨 Rich Jupyter Display**: Beautiful HTML, Markdown, and IPython representations

### Rich Display Features

- **Visual Status Indicators**: Icons for availability, promotions, etc.
- **Color-Coded Information**: Different colors for different data types
- **Interactive Elements**: Hover effects and responsive design
- **Professional Layout**: Clean, organized information display

### Real API Usage with Rich Display
""")

    meijer_item_example = nbf.v4.new_code_cell("""# Get real items from Meijer API and demonstrate rich display
if client and client.is_authenticated():
    print("🔍 Fetching real items from Meijer API...")

    try:
        # Search for real products
        search_results = client.search_products("banana", limit=5)
        print(f"Found {len(search_results)} products")

        if search_results:
            # 🎨 NEW: Demonstrate rich Jupyter integration
            print("\\n🎨 Rich Jupyter Notebook Display Examples:")
            print("=" * 55)

            # Show the first item with rich formatting
            first_item = search_results[0]
            print("\\n1️⃣ First Item - Rich HTML Display:")
            display(first_item)

            print("\\n2️⃣ First Item - Rich Markdown Display:")
            print(first_item._repr_markdown_())

            print("\\n3️⃣ First Item - Rich IPython Display:")
            print(first_item._repr_pretty_(None, False))

            # Show multiple items in a rich display
            print("\\n4️⃣ Multiple Items - Rich Display:")
            for i, item in enumerate(search_results[:3], 1):
                print(f"\\n--- Item {i} ---")
                display(item)

            # Demonstrate rich display properties
            print("\\n5️⃣ Rich Display Properties:")
            print(f"HTML representation length: {len(first_item._repr_html_())}")
            print(f"Markdown representation length: {len(first_item._repr_markdown_())}")

        else:
            print("❌ No search results found")

    except Exception as e:
        print(f"❌ Error during search: {e}")
        print("This might be due to authentication or API changes")
else:
    print("⚠️ Client not authenticated - using sample data for demonstration")

    # Create sample MeijerItem for demonstration
    print("\\n📝 Creating sample MeijerItem for rich display demonstration...")

    sample_item = MeijerItem(
        id="12345",
        title="Sample Organic Bananas",
        description="Fresh organic bananas from local farms",
        brand="Organic Valley",
        category="Produce",
        price=2.99,
        sale_price=1.99,
        unit_price=0.50,
        available=True,
        in_stock=True,
        weight="1 lb",
        aisle_primary="A15",
        section="35",
        bay="4"
    )

    print("\\n🎨 Sample Item - Rich HTML Display:")
    display(sample_item)

    print("\\n📝 Sample Item - Rich Markdown Display:")
    print(sample_item._repr_markdown_())

    print("\\n🔧 Sample Item - Rich IPython Display:")
    print(sample_item._repr_pretty_(None, False))""")

    # ListItem section with rich display
    list_item_section = nbf.v4.new_markdown_cell("""## ListItem Class with Rich Display

The `ListItem` class represents items in shopping lists or favorites lists. It provides comprehensive functionality for managing shopping list items with rich Jupyter integration.

### Key Features

- **List Management**: Add, remove, complete, and favorite items
- **Item Properties**: Name, quantity, notes, completion status
- **Type Support**: Different item types (product, coupon, manual entry)
- **Rich Jupyter Display**: Beautiful visualizations with status indicators

### Rich Display Features

- **Status Icons**: Visual indicators for completion, favorites, promotions
- **Color Coding**: Different colors for different item states
- **Interactive Elements**: Hover effects and responsive design
- **Professional Layout**: Clean, organized item information

### Rich Display Examples
""")

    list_item_example = nbf.v4.new_code_cell("""# Demonstrate ListItem rich display functionality
print("🛒 ListItem Rich Display Demonstration:")
print("=" * 45)

# Create sample ListItem objects with different states
sample_items = [
    ListItem(
        list_item_id=1,
        item_description="Organic Bananas",
        quantity=2,
        notes="Prefer yellow ones",
        is_complete=False,
        is_favorite=True,
        has_promotion=False
    ),
    ListItem(
        list_item_id=2,
        item_description="Whole Milk",
        quantity=1,
        notes="2% milk preferred",
        is_complete=True,
        is_favorite=False,
        has_promotion=True
    ),
    ListItem(
        list_item_id=3,
        item_description="Bread",
        quantity=1,
        notes="Whole wheat",
        is_complete=False,
        is_favorite=False,
        has_promotion=False
    )
]

print(f"Created {len(sample_items)} sample ListItem objects")

# 🎨 NEW: Demonstrate rich Jupyter integration for each item
print("\\n🎨 Rich Jupyter Notebook Display for Each Item:")
print("=" * 60)

for i, item in enumerate(sample_items, 1):
    print(f"\\n--- Item {i}: {item.item_description} ---")

    # Rich HTML display
    print("📱 Rich HTML Display:")
    display(item)

    # Rich Markdown display
    print("📝 Rich Markdown Display:")
    print(item._repr_markdown_())

    # Rich IPython display
    print("🔧 Rich IPython Display:")
    print(item._repr_pretty_(None, False))

# Demonstrate rich display for shopping list
print("\\n📋 Shopping List Rich Display:")
print("=" * 40)

# Create a mock shopping list object for demonstration
class MockShoppingList:
    def __init__(self, items):
        self.items = items

    def get(self):
        return self.items

    def _repr_html_(self):
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
                gap: 16px;
                margin-bottom: 24px;
                padding-bottom: 16px;
                border-bottom: 2px solid #ecf0f1;
            ">
                <span style="font-size: 36px;">📝</span>
                <div>
                    <h1 style="margin: 0; color: #2c3e50; font-size: 28px;">Shopping List</h1>
                    <p style="margin: 4px 0 0 0; color: #7f8c8d; font-size: 16px;">
                        {len(self.items)} items • Rich Jupyter Display Demo
                    </p>
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
                        {'✅' if item.is_complete else '⏳'}
                        {'⭐' if item.is_favorite else ''}
                        {'🏷️' if item.has_promotion else ''}
                        <strong>{item.item_description}</strong>
                    </div>
                    <div style="color: #6c757d; font-size: 14px;">
                        Qty: {item.quantity} • Notes: {item.notes or 'None'}
                    </div>
                </div>
                ''' for item in self.items])}
            </div>
        </div>
        '''

    def _repr_markdown_(self):
        md = f"""## 📝 Shopping List - Rich Jupyter Demo

**Total Items:** {len(self.items)}

### Items:
"""
        for item in self.items:
            status_icons = []
            if item.is_complete:
                status_icons.append("✅")
            if item.is_favorite:
                status_icons.append("⭐")
            if item.has_promotion:
                status_icons.append("🏷️")

            status_str = " ".join(status_icons) if status_icons else "⏳"

            md += f"- **{status_str} {item.item_description}**\n"
            md += f"  - Quantity: {item.quantity}\n"
            md += f"  - Notes: {item.notes or 'None'}\n"
            md += f"  - Status: {'Complete' if item.is_complete else 'Pending'}\n"

        return md

# Create and display the mock shopping list
mock_list = MockShoppingList(sample_items)

print("\\n📋 Mock Shopping List - Rich HTML Display:")
display(mock_list)

print("\\n📝 Mock Shopping List - Rich Markdown Display:")
print(mock_list._repr_markdown_())""")

    # MeijerCoupon section with rich display
    coupon_section = nbf.v4.new_markdown_cell("""## MeijerCoupon Class with Rich Display

The `MeijerCoupon` class represents coupons and offers from Meijer. It provides comprehensive coupon management with beautiful Jupyter display.

### Key Features

- **Coupon Information**: Title, description, discount amount, expiration
- **Usage Tracking**: Times used, remaining uses, activation status
- **Rich Jupyter Display**: Beautiful visualizations with status indicators
- **Interactive Elements**: Hover effects and responsive design

### Rich Display Features

- **Status Icons**: Visual indicators for active, expired, used coupons
- **Color Coding**: Different colors for different coupon states
- **Discount Highlighting**: Prominent display of savings
- **Professional Layout**: Clean, organized coupon information

### Rich Display Examples
""")

    coupon_example = nbf.v4.new_code_cell("""# Demonstrate MeijerCoupon rich display functionality
print("🎫 MeijerCoupon Rich Display Demonstration:")
print("=" * 50)

# Create sample MeijerCoupon objects with different states
sample_coupons = [
    MeijerCoupon(
        id="C001",
        title="$2.00 off Organic Produce",
        description="Save $2.00 on any organic produce purchase",
        discount_amount=2.00,
        discount_type="dollar",
        min_purchase=0.00,
        expiration_date=date(2024, 12, 31),
        times_used=0,
        max_uses=5,
        is_active=True
    ),
    MeijerCoupon(
        id="C002",
        title="20% off Dairy Products",
        description="20% discount on all dairy products",
        discount_amount=20.0,
        discount_type="percentage",
        min_purchase=10.00,
        expiration_date=date(2024, 12, 25),
        times_used=2,
        max_uses=3,
        is_active=True
    ),
    MeijerCoupon(
        id="C003",
        title="$1.00 off Bread",
        description="Save $1.00 on any bread product",
        discount_amount=1.00,
        discount_type="dollar",
        min_purchase=0.00,
        expiration_date=date(2024, 12, 20),
        times_used=3,
        max_uses=3,
        is_active=False
    )
]

print(f"Created {len(sample_coupons)} sample MeijerCoupon objects")

# 🎨 NEW: Demonstrate rich Jupyter integration for each coupon
print("\\n🎨 Rich Jupyter Notebook Display for Each Coupon:")
print("=" * 65)

for i, coupon in enumerate(sample_coupons, 1):
    print(f"\\n--- Coupon {i}: {coupon.title} ---")

    # Rich HTML display
    print("📱 Rich HTML Display:")
    display(coupon)

    # Rich Markdown display
    print("📝 Rich Markdown Display:")
    print(coupon._repr_markdown_())

    # Rich IPython display
    print("🔧 Rich IPython Display:")
    print(coupon._repr_pretty_(None, False))

# Demonstrate rich display for coupon collection
print("\\n🎫 Coupon Collection Rich Display:")
print("=" * 45)

# Create a mock coupon collection object for demonstration
class MockCouponCollection:
    def __init__(self, coupons):
        self.coupons = coupons

    def get(self):
        return self.coupons

    def _repr_html_(self):
        active_count = sum(1 for c in self.coupons if c.is_active)
        expired_count = len(self.coupons) - active_count

        return f'''
        <div style="
            border: 2px solid #e74c3c;
            border-radius: 16px;
            padding: 24px;
            margin: 16px 0;
            background: linear-gradient(135deg, #fff5f5 0%, #fed7d7 100%);
            box-shadow: 0 8px 24px rgba(0,0,0,0.15);
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        ">
            <div style="
                display: flex;
                align-items: center;
                gap: 16px;
                margin-bottom: 24px;
                padding-bottom: 16px;
                border-bottom: 2px solid #fed7d7;
            ">
                <span style="font-size: 36px;">🎫</span>
                <div>
                    <h1 style="margin: 0; color: #c53030; font-size: 28px;">Coupon Collection</h1>
                    <p style="margin: 4px 0 0 0; color: #742a2a; font-size: 16px;">
                        {len(self.coupons)} coupons • {active_count} active • {expired_count} expired
                    </p>
                </div>
            </div>

            <div style="
                display: grid;
                grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
                gap: 16px;
            ">
                {''.join([f'''
                <div style="
                    background: linear-gradient(135deg, {'#d4edda' if coupon.is_active else '#f8d7da'} 0%, {'#c3e6cb' if coupon.is_active else '#f5c6cb'} 100%);
                    border: 1px solid {'#c3e6cb' if coupon.is_active else '#f5c6cb'};
                    border-radius: 12px;
                    padding: 16px;
                ">
                    <div style="display: flex; align-items: center; gap: 8px; margin-bottom: 8px;">
                        {'🟢' if coupon.is_active else '🔴'}
                        <strong>{coupon.title}</strong>
                    </div>
                    <div style="color: #155724; font-size: 14px;">
                        {coupon.description}
                    </div>
                    <div style="color: #155724; font-size: 12px; margin-top: 8px;">
                        Discount: {coupon.discount_amount}{'%' if coupon.discount_type == 'percentage' else '$'} •
                        Used: {coupon.times_used}/{coupon.max_uses}
                    </div>
                </div>
                ''' for coupon in self.coupons])}
            </div>
        </div>
        '''

    def _repr_markdown_(self):
        active_count = sum(1 for c in self.coupons if c.is_active)
        expired_count = len(self.coupons) - active_count

        md = f"""## 🎫 Coupon Collection - Rich Jupyter Demo

**Total Coupons:** {len(self.coupons)} • **Active:** {active_count} • **Expired:** {expired_count}

### Coupons:
"""
        for coupon in self.coupons:
            status_icon = "🟢" if coupon.is_active else "🔴"
            status_text = "Active" if coupon.is_active else "Expired"

            md += f"- **{status_icon} {coupon.title}** ({status_text})\n"
            md += f"  - {coupon.description}\n"
            md += f"  - Discount: {coupon.discount_amount}{'%' if coupon.discount_type == 'percentage' else '$'}\n"
            md += f"  - Used: {coupon.times_used}/{coupon.max_uses}\n"

        return md

# Create and display the mock coupon collection
mock_coupons = MockCouponCollection(sample_coupons)

print("\\n🎫 Mock Coupon Collection - Rich HTML Display:")
display(mock_coupons)

print("\\n📝 Mock Coupon Collection - Rich Markdown Display:")
print(mock_coupons._repr_markdown_())""")

    # Store section with rich display
    store_section = nbf.v4.new_markdown_cell("""## Store Class with Rich Display

The `Store` class represents Meijer store locations with comprehensive information and beautiful Jupyter display.

### Key Features

- **Store Information**: Name, address, phone, hours, services
- **Location Data**: Coordinates, distance, store ID
- **Rich Jupyter Display**: Beautiful visualizations with store details
- **Interactive Elements**: Hover effects and responsive design

### Rich Display Features

- **Store Icons**: Visual indicators for store types and services
- **Color Coding**: Different colors for different information types
- **Service Badges**: Visual indicators for available services
- **Professional Layout**: Clean, organized store information

### Rich Display Examples
""")

    store_example = nbf.v4.new_code_cell("""# Demonstrate Store rich display functionality
print("🏪 Store Rich Display Demonstration:")
print("=" * 45)

# Create sample Store objects with different characteristics
sample_stores = [
    Store(
        store_id="217",
        name="Meijer Grand Rapids",
        address="123 Main St, Grand Rapids, MI 49503",
        phone="(616) 555-0123",
        hours="6:00 AM - 11:00 PM",
        services=["Pharmacy", "Gas Station", "Pickup", "Delivery"],
        latitude=42.9634,
        longitude=-85.6681,
        distance=2.5
    ),
    Store(
        store_id="218",
        name="Meijer Lansing",
        address="456 Oak Ave, Lansing, MI 48910",
        phone="(517) 555-0456",
        hours="7:00 AM - 10:00 PM",
        services=["Pharmacy", "Pickup"],
        latitude=42.7325,
        longitude=-84.5555,
        distance=15.2
    )
]

print(f"Created {len(sample_stores)} sample Store objects")

# 🎨 NEW: Demonstrate rich Jupyter integration for each store
print("\\n🎨 Rich Jupyter Notebook Display for Each Store:")
print("=" * 60)

for i, store in enumerate(sample_stores, 1):
    print(f"\\n--- Store {i}: {store.name} ---")

    # Rich HTML display
    print("📱 Rich HTML Display:")
    display(store)

    # Rich Markdown display
    print("📝 Rich Markdown Display:")
    print(store._repr_markdown_())

    # Rich IPython display
    print("🔧 Rich IPython Display:")
    print(store._repr_pretty_(None, False))

# Demonstrate rich display for store collection
print("\\n🏪 Store Collection Rich Display:")
print("=" * 45)

# Create a mock store collection object for demonstration
class MockStoreCollection:
    def __init__(self, stores):
        self.stores = stores

    def get(self):
        return self.stores

    def _repr_html_(self):
        return f'''
        <div style="
            border: 2px solid #27ae60;
            border-radius: 16px;
            padding: 24px;
            margin: 16px 0;
            background: linear-gradient(135deg, #f0fff4 0%, #dcfce7 100%);
            box-shadow: 0 8px 24px rgba(0,0,0,0.15);
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        ">
            <div style="
                display: flex;
                align-items: center;
                gap: 16px;
                margin-bottom: 24px;
                padding-bottom: 16px;
                border-bottom: 2px solid #dcfce7;
            ">
                <span style="font-size: 36px;">🏪</span>
                <div>
                    <h1 style="margin: 0; color: #166534; font-size: 28px;">Store Collection</h1>
                    <p style="margin: 4px 0 0 0; color: #166534; font-size: 16px;">
                        {len(self.stores)} stores • Rich Jupyter Display Demo
                    </p>
                </div>
            </div>

            <div style="
                display: grid;
                grid-template-columns: repeat(auto-fit, minmax(350px, 1fr));
                gap: 16px;
            ">
                {''.join([f'''
                <div style="
                    background: linear-gradient(135deg, #f8fafc 0%, #e2e8f0 100%);
                    border: 1px solid #cbd5e1;
                    border-radius: 12px;
                    padding: 16px;
                ">
                    <div style="display: flex; align-items: center; gap: 8px; margin-bottom: 8px;">
                        🏪 <strong>{store.name}</strong>
                    </div>
                    <div style="color: #475569; font-size: 14px;">
                        {store.address}
                    </div>
                    <div style="color: #64748b; font-size: 12px; margin-top: 8px;">
                        📞 {store.phone} • 🕒 {store.hours}
                    </div>
                    <div style="color: #64748b; font-size: 12px;">
                        📍 {store.distance} miles away
                    </div>
                    <div style="margin-top: 8px;">
                        {''.join([f'<span style="background: #3b82f6; color: white; padding: 2px 6px; border-radius: 4px; font-size: 10px; margin-right: 4px;">{service}</span>' for service in store.services])}
                    </div>
                </div>
                ''' for store in self.stores])}
            </div>
        </div>
        '''

    def _repr_markdown_(self):
        md = f"""## 🏪 Store Collection - Rich Jupyter Demo

**Total Stores:** {len(self.stores)}

### Stores:
"""
        for store in self.stores:
            md += f"- **🏪 {store.name}**\n"
            md += f"  - Address: {store.address}\n"
            md += f"  - Phone: {store.phone}\n"
            md += f"  - Hours: {store.hours}\n"
            md += f"  - Distance: {store.distance} miles\n"
            md += f"  - Services: {', '.join(store.services)}\n"

        return md

# Create and display the mock store collection
mock_stores = MockStoreCollection(sample_stores)

print("\\n🏪 Mock Store Collection - Rich HTML Display:")
display(mock_stores)

print("\\n📝 Mock Store Collection - Rich Markdown Display:")
print(mock_stores._repr_markdown_())""")

    # SearchResult section with rich display
    search_result_section = nbf.v4.new_markdown_cell("""## SearchResult Class with Rich Display

The `SearchResult` class represents search results from product search with comprehensive information and beautiful Jupyter display.

### Key Features

- **Search Information**: Title, description, relevance score
- **Product Details**: Price, availability, category
- **Rich Jupyter Display**: Beautiful visualizations with search details
- **Interactive Elements**: Hover effects and responsive design

### Rich Display Features

- **Search Icons**: Visual indicators for search relevance
- **Color Coding**: Different colors for different information types
- **Relevance Scoring**: Visual indicators for search match quality
- **Professional Layout**: Clean, organized search information

### Rich Display Examples
""")

    search_result_example = nbf.v4.new_code_cell("""# Demonstrate SearchResult rich display functionality
print("🔍 SearchResult Rich Display Demonstration:")
print("=" * 50)

# Create sample SearchResult objects with different characteristics
sample_search_results = [
    SearchResult(
        id="SR001",
        title="Organic Bananas",
        description="Fresh organic bananas from local farms",
        relevance_score=0.95,
        price=2.99,
        available=True,
        category="Produce"
    ),
    SearchResult(
        id="SR002",
        title="Banana Bread Mix",
        description="Easy-to-make banana bread mix",
        relevance_score=0.75,
        price=3.49,
        available=True,
        category="Baking"
    ),
    SearchResult(
        id="SR003",
        title="Banana Flavored Yogurt",
        description="Creamy yogurt with real banana flavor",
        relevance_score=0.60,
        price=1.99,
        available=False,
        category="Dairy"
    )
]

print(f"Created {len(sample_search_results)} sample SearchResult objects")

# 🎨 NEW: Demonstrate rich Jupyter integration for each search result
print("\\n🎨 Rich Jupyter Notebook Display for Each Search Result:")
print("=" * 70)

for i, result in enumerate(sample_search_results, 1):
    print(f"\\n--- Search Result {i}: {result.title} ---")

    # Rich HTML display
    print("📱 Rich HTML Display:")
    display(result)

    # Rich Markdown display
    print("📝 Rich Markdown Display:")
    print(result._repr_markdown_())

    # Rich IPython display
    print("🔧 Rich IPython Display:")
    print(result._repr_pretty_(None, False))

# Demonstrate rich display for search results collection
print("\\n🔍 Search Results Collection Rich Display:")
print("=" * 50)

# Create a mock search results collection object for demonstration
class MockSearchResultsCollection:
    def __init__(self, results):
        self.results = results

    def get(self):
        return self.results

    def _repr_html_(self):
        avg_relevance = sum(r.relevance_score for r in self.results) / len(self.results)
        available_count = sum(1 for r in self.results if r.available)

        return f'''
        <div style="
            border: 2px solid #f59e0b;
            border-radius: 16px;
            padding: 24px;
            margin: 16px 0;
            background: linear-gradient(135deg, #fffbeb 0%, #fef3c7 100%);
            box-shadow: 0 8px 24px rgba(0,0,0,0.15);
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        ">
            <div style="
                display: flex;
                align-items: center;
                gap: 16px;
                margin-bottom: 24px;
                padding-bottom: 16px;
                border-bottom: 2px solid #fef3c7;
            ">
                <span style="font-size: 36px;">🔍</span>
                <div>
                    <h1 style="margin: 0; color: #92400e; font-size: 28px;">Search Results</h1>
                    <p style="margin: 4px 0 0 0; color: #92400e; font-size: 16px;">
                        {len(self.results)} results • {available_count} available • Avg Relevance: {avg_relevance:.2f}
                    </p>
                </div>
            </div>

            <div style="
                display: grid;
                grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
                gap: 16px;
            ">
                {''.join([f'''
                <div style="
                    background: linear-gradient(135deg, #f8fafc 0%, #e2e8f0 100%);
                    border: 1px solid #cbd5e1;
                    border-radius: 12px;
                    padding: 16px;
                ">
                    <div style="display: flex; align-items: center; gap: 8px; margin-bottom: 8px;">
                        🔍 <strong>{result.title}</strong>
                    </div>
                    <div style="color: #475569; font-size: 14px;">
                        {result.description}
                    </div>
                    <div style="color: #64748b; font-size: 12px; margin-top: 8px;">
                        💰 ${result.price} • 📦 {result.category}
                    </div>
                    <div style="color: #64748b; font-size: 12px;">
                        {'🟢 Available' if result.available else '🔴 Out of Stock'} •
                        Relevance: {result.relevance_score:.2f}
                    </div>
                </div>
                ''' for result in self.results])}
            </div>
        </div>
        '''

    def _repr_markdown_(self):
        avg_relevance = sum(r.relevance_score for r in self.results) / len(self.results)
        available_count = sum(1 for r in self.results if r.available)

        md = f"""## 🔍 Search Results - Rich Jupyter Demo

**Total Results:** {len(self.results)} • **Available:** {available_count} • **Avg Relevance:** {avg_relevance:.2f}

### Results:
"""
        for result in self.results:
            status_icon = "🟢" if result.available else "🔴"
            status_text = "Available" if result.available else "Out of Stock"

            md += f"- **🔍 {result.title}**\n"
            md += f"  - {result.description}\n"
            md += f"  - Price: ${result.price} • Category: {result.category}\n"
            md += f"  - Status: {status_icon} {status_text}\n"
            md += f"  - Relevance: {result.relevance_score:.2f}\n"

        return md

# Create and display the mock search results collection
mock_search_results = MockSearchResultsCollection(sample_search_results)

print("\\n🔍 Mock Search Results Collection - Rich HTML Display:")
display(mock_search_results)

print("\\n📝 Mock Search Results Collection - Rich Markdown Display:")
print(mock_search_results._repr_markdown_())""")

    # Rich Jupyter Integration Summary
    rich_summary = nbf.v4.new_markdown_cell("""## 🎨 Rich Jupyter Notebook Integration Summary

The Meijer models now provide **comprehensive, beautiful displays** in Jupyter notebooks that enhance both development and documentation workflows.

### What You've Seen

1. **MeijerItem**: Rich product displays with status indicators and pricing
2. **ListItem**: Beautiful shopping list item representations
3. **MeijerCoupon**: Visual coupon displays with status and discount information
4. **Store**: Rich store information displays with service badges
5. **SearchResult**: Interactive search result visualizations

### Key Benefits

- **Visual Appeal**: Beautiful, styled representations with icons and colors
- **Interactive**: Clickable elements and hover effects
- **Documentation**: Rich Markdown for technical writing
- **Development**: Enhanced debugging and inspection
- **Professional**: Publication-ready visualizations

### How to Use in Your Workflows

```python
# In Jupyter notebooks
display(my_model_object)  # Rich HTML display
print(my_model_object._repr_markdown_())  # Rich Markdown
print(my_model_object._repr_pretty_(None, False))  # Rich IPython

# In documentation
html_content = my_model_object._repr_html_()
markdown_content = my_model_object._repr_markdown_()

# In development
# Just type the variable name to see rich formatting
my_model_object
```

### Advanced Usage

- **Custom Styling**: Modify the `_repr_html_` methods for custom themes
- **Integration**: Combine multiple models for rich composite displays
- **Export**: Use HTML representations in web applications
- **Documentation**: Generate rich documentation from model displays

The rich Jupyter integration makes working with Meijer data models both more enjoyable and more professional!""")

    # Add all cells to notebook
    nb.cells = [
        title_cell,
        import_cell,
        rich_overview,
        meijer_item_section,
        meijer_item_example,
        list_item_section,
        list_item_example,
        coupon_section,
        coupon_example,
        store_section,
        store_example,
        search_result_section,
        search_result_example,
        rich_summary
    ]

    return nb


def main():
    """Generate the models notebook."""

    # Create the notebook
    nb = create_models_notebook()

    # Write to file
    output_file = "models.ipynb"

    with open(output_file, "w", encoding="utf-8") as f:
        nbf.write(nb, f)

    print(f"📝 Generated models notebook: {output_file}")
    print("🚀 Open with: jupyter notebook models.ipynb")
    print("💡 Or use in VS Code with the Jupyter extension")
    print("🎨 Features: Rich Jupyter integration with _repr* functions")


if __name__ == "__main__":
    main()
