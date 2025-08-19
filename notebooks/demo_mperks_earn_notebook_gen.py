#!/usr/bin/env python3
"""
Generate a Jupyter notebook for mPerks earn functionality demo.
This script creates a comprehensive notebook showcasing the new earn features.
"""

import nbformat as nbf


def create_mperks_earn_notebook():
    """Create the mPerks earn functionality demo notebook."""

    # Create a new notebook
    nb = nbf.v4.new_notebook()

    # Add title and description
    title_cell = nbf.v4.new_markdown_cell("""# mPerks Earn Functionality Demo

This notebook demonstrates the new mPerks earn functionality, including:
- **Earn Tab**: Main tab with sub-tabs for different offer types
- **In Progress Offers**: Offers currently being worked on
- **Available Offers**: Offers that can be started
- **All Offers**: Complete list of all earn offers

## New Classes

- `EarnableOffer`: Represents individual earn offers with progress tracking
- `EarnTabData`: Container for all earn tab information with utility methods

## Features

- Progress tracking for in-progress offers
- Category-based filtering
- Status-based filtering
- Expiration date handling
- Pythonic object manipulation
""")

    # Add setup cell
    setup_cell = nbf.v4.new_code_cell("""# Setup and imports
import os
import sys
from datetime import datetime

# Add the parent directory to the path so we can import meijer
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from meijer import Meijer
from meijer.mperks import EarnableOffer, EarnTabData

print("✓ Imports completed successfully")
print("✓ Ready to demonstrate mPerks earn functionality")""")

    # Add client initialization
    init_cell = nbf.v4.new_code_cell("""# Initialize Meijer client
try:
    meijer = Meijer()
    print("✅ Meijer client initialized successfully")

    # Get mPerks instance
    mperks = meijer.mperks
    print("✅ mPerks instance created")

except Exception as e:
    print(f"❌ Failed to initialize: {e}")
    print("Please ensure you have valid authentication credentials")""")

    # Add earn tab data retrieval
    earn_tab_cell = nbf.v4.new_markdown_cell("""## 1. Earn Tab Data Retrieval

Get comprehensive earn tab data including all sub-tabs and offer counts.""")

    earn_tab_code = nbf.v4.new_code_cell("""# Get all earn offers data
print("📊 Retrieving earn tab data...")
print("Endpoint: GET /digital/mperks40/customer/v1/earn/offers")
print()

try:
    earn_data = meijer.get_earn_offers()

    print(f"✅ Successfully retrieved earn tab data")
    print(f"   📈 In Progress: {earn_data.total_in_progress} offers")
    print(f"   ✅ Available: {earn_data.total_available} offers")
    print(f"   📋 Total: {earn_data.total_all} offers")

    if earn_data.last_updated:
        print(f"   🕒 Last Updated: {earn_data.last_updated}")

    print(f"\\n📊 Data structure: {type(earn_data).__name__}")

except Exception as e:
    print(f"❌ Failed to get earn offers: {e}")
    print("Note: This endpoint may not be available in the current API version")""")

    # Add in-progress offers demo
    in_progress_cell = nbf.v4.new_markdown_cell("""## 2. In Progress Offers

Display offers that are currently being worked on with progress tracking.""")

    in_progress_code = nbf.v4.new_code_cell("""# Get in-progress offers
print("🔄 In Progress Offers:")
print("Endpoint: GET /digital/mperks40/customer/v1/earn/offers/in-progress")
print()

try:
    in_progress = meijer.get_earn_offers_in_progress()
    print(f"✅ Found {len(in_progress)} in-progress offers")

    if in_progress:
        print("\\n📋 Sample offers:")
        for i, offer in enumerate(in_progress[:3], 1):
            print(f"\\n{i}. {offer.title}")
            print(f"   📁 Category: {offer.category}")
            print(f"   🎯 Progress: {offer.progress_current}/{offer.progress_target}")
            if offer.progress_percentage:
                print(f"   📊 Percentage: {offer.progress_percentage:.1f}%")
            print(f"   🏆 Points Earned: {offer.points_earned}")
            if offer.days_until_expiry:
                print(f"   ⏰ Expires in: {offer.days_until_expiry} days")
    else:
        print("ℹ️ No in-progress offers found")

except Exception as e:
    print(f"❌ Failed to get in-progress offers: {e}")""")

    # Add available offers demo
    available_cell = nbf.v4.new_markdown_cell("""## 3. Available Offers

Show offers that can be started to earn points.""")

    available_code = nbf.v4.new_code_cell("""# Get available offers
print("✅ Available Offers:")
print("Endpoint: GET /digital/mperks40/customer/v1/earn/offers/available")
print()

try:
    available = meijer.get_earn_offers_available()
    print(f"✅ Found {len(available)} available offers")

    if available:
        print("\\n📋 Sample offers:")
        for i, offer in enumerate(available[:3], 1):
            print(f"\\n{i}. {offer.title}")
            print(f"   📁 Category: {offer.category}")
            print(f"   🎯 Points Required: {offer.points_required}")
            print(f"   🏆 Points to Earn: {offer.points_earned}")
            if offer.days_until_expiry:
                print(f"   ⏰ Expires in: {offer.days_until_expiry} days")
            print(f"   📝 Description: {offer.description[:100]}...")
    else:
        print("ℹ️ No available offers found")

except Exception as e:
    print(f"❌ Failed to get available offers: {e}")""")

    # Add all offers demo
    all_offers_cell = nbf.v4.new_markdown_cell("""## 4. All Offers

Retrieve the complete list of all earn offers regardless of status.""")

    all_offers_code = nbf.v4.new_code_cell("""# Get all offers
print("📋 All Earn Offers:")
print("Endpoint: GET /digital/mperks40/customer/v1/earn/offers/all")
print()

try:
    all_offers = meijer.get_earn_offers_all()
    print(f"✅ Found {len(all_offers)} total offers")

    if all_offers:
        # Group by status
        status_counts = {}
        category_counts = {}

        for offer in all_offers:
            status = offer.status
            category = offer.category

            status_counts[status] = status_counts.get(status, 0) + 1
            category_counts[category] = category_counts.get(category, 0) + 1

        print("\\n📊 Status Breakdown:")
        for status, count in status_counts.items():
            print(f"   {status}: {count}")

        print("\\n📁 Category Breakdown:")
        for category, count in category_counts.items():
            print(f"   {category}: {count}")

    else:
        print("ℹ️ No offers found")

except Exception as e:
    print(f"❌ Failed to get all offers: {e}")""")

    # Add utility methods demo
    utility_cell = nbf.v4.new_markdown_cell("""## 5. EarnTabData Utility Methods

Explore the powerful utility methods for filtering and manipulating earn data.""")

    utility_code = nbf.v4.new_code_cell("""# Test utility methods
print("🔧 Testing EarnTabData Utility Methods:")
print()

try:
    earn_data = meijer.get_earn_offers()

    if earn_data.all_offers:
        print("✅ Data loaded successfully")

        # Test filtering by category
        categories = set(offer.category for offer in earn_data.all_offers if offer.category)
        print(f"\\n📁 Available categories: {', '.join(categories)}")

        if categories:
            sample_category = list(categories)[0]
            category_offers = earn_data.get_offers_by_category(sample_category)
            print(f"✅ Offers in '{sample_category}' category: {len(category_offers)}")

        # Test filtering by status
        status_offers = earn_data.get_offers_by_status("available")
        print(f"✅ Offers with 'available' status: {len(status_offers)}")

        # Test getting active offers
        active_offers = earn_data.get_active_offers()
        print(f"✅ Active offers: {len(active_offers)}")

        # Test getting non-expired offers
        non_expired = [offer for offer in earn_data.all_offers if not offer.is_expired]
        print(f"✅ Non-expired offers: {len(non_expired)}")

    else:
        print("ℹ️ No data available for utility method testing")

except Exception as e:
    print(f"❌ Failed to test utility methods: {e}")""")

    # Add object creation demo
    object_demo_cell = nbf.v4.new_markdown_cell("""## 6. EarnableOffer Object Creation

Learn how to create and manipulate EarnableOffer objects programmatically.""")

    object_demo_code = nbf.v4.new_code_cell("""# Create sample EarnableOffer objects
print("🧪 Creating Sample EarnableOffer Objects:")
print()

try:
    # Create a sample in-progress offer
    in_progress_offer = EarnableOffer(
        offer_id="demo_001",
        title="Spend $100 on Groceries",
        description="Earn 50 points for every $100 spent on groceries",
        category="Shopping",
        points_required=100,
        points_earned=50,
        status="in_progress",
        progress_current=75,
        progress_target=100,
        start_date=datetime.now(),
        end_date=datetime(2025, 12, 31),
        is_active=True
    )

    print("✅ Created in-progress offer:")
    print(f"   📝 Title: {in_progress_offer.title}")
    print(f"   📊 Progress: {in_progress_offer.progress_percentage:.1f}%")
    print(f"   ⏰ Days until expiry: {in_progress_offer.days_until_expiry}")
    print(f"   🚫 Is expired: {in_progress_offer.is_expired}")

    # Create a sample available offer
    available_offer = EarnableOffer(
        offer_id="demo_002",
        title="First Purchase Bonus",
        description="Earn 100 bonus points on your first purchase this month",
        category="Bonus",
        points_required=0,
        points_earned=100,
        status="available",
        start_date=datetime.now(),
        end_date=datetime(2025, 12, 31),
        is_active=True
    )

    print(f"\\n✅ Created available offer:")
    print(f"   📝 Title: {available_offer.title}")
    print(f"   🎯 Points to earn: {available_offer.points_earned}")
    print(f"   📁 Category: {available_offer.category}")

    # Test to_dict method
    offer_dict = in_progress_offer.to_dict()
    print(f"\\n✅ Converted to dict with {len(offer_dict)} fields")
    print(f"   Sample fields: {list(offer_dict.keys())[:5]}")

except Exception as e:
    print(f"❌ Failed to create sample offers: {e}")""")

    # Add advanced filtering demo
    advanced_cell = nbf.v4.new_markdown_cell("""## 7. Advanced Filtering and Analysis

Demonstrate advanced filtering and analysis capabilities.""")

    advanced_code = nbf.v4.new_code_cell("""# Advanced filtering and analysis
print("🔍 Advanced Filtering and Analysis:")
print()

try:
    earn_data = meijer.get_earn_offers()

    if earn_data.all_offers:
        print("✅ Data loaded for analysis")

        # Find high-value offers (high points earned)
        high_value_offers = sorted(
            earn_data.all_offers,
            key=lambda x: x.points_earned,
            reverse=True
        )[:5]

        print(f"\\n🏆 Top 5 High-Value Offers:")
        for i, offer in enumerate(high_value_offers, 1):
            print(f"   {i}. {offer.title} - {offer.points_earned} points")

        # Find offers expiring soon (within 7 days)
        soon_expiring = [
            offer for offer in earn_data.all_offers
            if offer.days_until_expiry and 0 <= offer.days_until_expiry <= 7
        ]

        print(f"\\n⏰ Offers Expiring Soon (≤7 days): {len(soon_expiring)}")
        for offer in soon_expiring[:3]:
            print(f"   • {offer.title} - expires in {offer.days_until_expiry} days")

        # Category analysis
        category_analysis = {}
        for offer in earn_data.all_offers:
            category = offer.category or "Uncategorized"
            if category not in category_analysis:
                category_analysis[category] = {
                    'count': 0,
                    'total_points': 0,
                    'avg_points': 0
                }
            category_analysis[category]['count'] += 1
            category_analysis[category]['total_points'] += offer.points_earned

        # Calculate averages
        for category, data in category_analysis.items():
            if data['count'] > 0:
                data['avg_points'] = data['total_points'] / data['count']

        print(f"\\n📊 Category Analysis:")
        for category, data in sorted(category_analysis.items(), key=lambda x: x[1]['count'], reverse=True):
            print(f"   {category}: {data['count']} offers, {data['avg_points']:.1f} avg points")

    else:
        print("ℹ️ No data available for analysis")

except Exception as e:
    print(f"❌ Failed to perform analysis: {e}")""")

    # Add summary cell
    summary_cell = nbf.v4.new_markdown_cell("""## Summary

This demo has showcased the comprehensive mPerks earn functionality:

### ✅ What We've Covered

1. **Earn Tab Data Retrieval** - Getting comprehensive earn information
2. **In Progress Offers** - Tracking offers currently being worked on
3. **Available Offers** - Discovering new opportunities to earn points
4. **All Offers** - Complete overview of all earn possibilities
5. **Utility Methods** - Powerful filtering and manipulation tools
6. **Object Creation** - Programmatic offer management
7. **Advanced Analysis** - Deep insights into earn opportunities

### 🚀 Key Benefits

- **Pythonic Interface**: Easy-to-use dataclasses with intuitive methods
- **Progress Tracking**: Monitor your progress on in-progress offers
- **Smart Filtering**: Find offers by category, status, or other criteria
- **Expiration Handling**: Automatic expiry date management
- **Data Analysis**: Comprehensive insights into your earn opportunities

### 🔗 API Endpoints

- `GET /digital/mperks40/customer/v1/earn/offers` - Complete earn tab data
- `GET /digital/mperks40/customer/v1/earn/offers/in-progress` - In-progress offers
- `GET /digital/mperks40/customer/v1/earn/offers/available` - Available offers
- `GET /digital/mperks40/customer/v1/earn/offers/all` - All offers

### 💡 Next Steps

- Integrate earn functionality into your applications
- Build dashboards to track earn progress
- Automate offer discovery and tracking
- Create personalized earn recommendations

The new earn functionality provides a robust foundation for building sophisticated mPerks applications that help users maximize their point earnings!""")

    # Add all cells to the notebook
    nb.cells = [
        title_cell,
        setup_cell,
        init_cell,
        earn_tab_cell,
        earn_tab_code,
        in_progress_cell,
        in_progress_code,
        available_cell,
        available_code,
        all_offers_cell,
        all_offers_code,
        utility_cell,
        utility_code,
        object_demo_cell,
        object_demo_code,
        advanced_cell,
        advanced_code,
        summary_cell,
    ]

    # Set notebook metadata
    nb.metadata = {
        "kernelspec": {
            "display_name": "Python 3",
            "language": "python",
            "name": "python3",
        },
        "language_info": {
            "codemirror_mode": {"name": "ipython", "version": 3},
            "file_extension": ".py",
            "mimetype": "text/x-python",
            "name": "python",
            "nbconvert_exporter": "python",
            "pygments_lexer": "ipython3",
            "version": "3.8.0",
        },
    }

    return nb


def main():
    """Generate the mPerks earn functionality demo notebook."""
    print("Creating mPerks earn functionality demo notebook...")

    # Create the notebook
    nb = create_mperks_earn_notebook()

    # Save the notebook
    output_file = "demo_mperks_earn.ipynb"
    nbf.write(nb, output_file)

    print(f"✅ Notebook generated successfully: {output_file}")
    print("📚 You can now open this notebook in Jupyter or VS Code")
    print("🚀 The notebook demonstrates all the new earn functionality features")


if __name__ == "__main__":
    main()
