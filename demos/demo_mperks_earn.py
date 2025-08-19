#!/usr/bin/env python3
"""
Demo script for mPerks earn functionality.
Demonstrates the new earn tab features including:
- In Progress offers
- Available offers
- All offers
- EarnTabData manipulation
"""

import os
import sys
from datetime import datetime

# Add the parent directory to the path so we can import meijer
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from meijer import Meijer
from meijer.mperks import EarnableOffer


def test_mperks_earn_functionality():
    """Test mPerks earn functionality."""
    print("=== mPerks Earn Functionality Demo ===\n")

    # Initialize the Meijer client
    try:
        meijer = Meijer()
        print("✓ Meijer client initialized successfully")
    except Exception as e:
        print(f"✗ Failed to initialize Meijer client: {e}")
        return

    # Get mPerks instance
    mperks = meijer.mperks
    print("✓ mPerks instance created")

    # Test getting all earn offers data
    print("\n📊 Testing Earn Tab Data Retrieval...")
    print("Endpoint: GET /digital/mperks40/customer/v1/earn/offers")
    print("Content-Type: application/vnd.meijer.digitalmperks.earnoffers-v1.0+json\n")

    try:
        earn_data = meijer.get_earn_offers()
        print("✓ Successfully retrieved earn tab data")
        print(f"   In Progress: {earn_data.total_in_progress} offers")
        print(f"   Available: {earn_data.total_available} offers")
        print(f"   Total: {earn_data.total_all} offers")

        if earn_data.last_updated:
            print(f"   Last Updated: {earn_data.last_updated}")

        # Show sample offers from each category
        if earn_data.in_progress_offers:
            print("\n🔄 In Progress Offers (showing first 3):")
            for i, offer in enumerate(earn_data.in_progress_offers[:3], 1):
                print(f"   {i}. {offer.title}")
                print(f"      Category: {offer.category}")
                print(
                    f"      Progress: {offer.progress_current}/{offer.progress_target} ({offer.progress_percentage:.1f}%)"
                )
                print(f"      Points: {offer.points_earned} earned")
                if offer.days_until_expiry:
                    print(f"      Expires in: {offer.days_until_expiry} days")
                print()

        if earn_data.available_offers:
            print("✅ Available Offers (showing first 3):")
            for i, offer in enumerate(earn_data.available_offers[:3], 1):
                print(f"   {i}. {offer.title}")
                print(f"      Category: {offer.category}")
                print(f"      Points Required: {offer.points_required}")
                if offer.days_until_expiry:
                    print(f"      Expires in: {offer.days_until_expiry} days")
                print()

    except Exception as e:
        print(f"✗ Failed to get earn offers: {e}")

    # Test getting specific earn offer types
    print("\n🎯 Testing Specific Earn Offer Types...")

    try:
        # Get in-progress offers only
        in_progress = meijer.get_earn_offers_in_progress()
        print(f"✓ In-progress offers: {len(in_progress)} found")

        # Get available offers only
        available = meijer.get_earn_offers_available()
        print(f"✓ Available offers: {len(available)} found")

        # Get all offers
        all_offers = meijer.get_earn_offers_all()
        print(f"✓ All offers: {len(all_offers)} found")

    except Exception as e:
        print(f"✗ Failed to get specific earn offer types: {e}")

    # Test EarnTabData utility methods
    print("\n🔧 Testing EarnTabData Utility Methods...")

    try:
        earn_data = meijer.get_earn_offers()

        # Test filtering by category
        if earn_data.all_offers:
            categories = set(
                offer.category for offer in earn_data.all_offers if offer.category
            )
            print(f"✓ Available categories: {', '.join(categories)}")

            if categories:
                sample_category = list(categories)[0]
                category_offers = earn_data.get_offers_by_category(sample_category)
                print(
                    f"✓ Offers in '{sample_category}' category: {len(category_offers)}"
                )

        # Test filtering by status
        status_offers = earn_data.get_offers_by_status("available")
        print(f"✓ Offers with 'available' status: {len(status_offers)}")

        # Test getting active offers
        active_offers = earn_data.get_active_offers()
        print(f"✓ Active offers: {len(active_offers)}")

    except Exception as e:
        print(f"✗ Failed to test utility methods: {e}")

    # Test creating sample EarnableOffer objects
    print("\n🧪 Testing EarnableOffer Object Creation...")

    try:
        # Create a sample offer
        sample_offer = EarnableOffer(
            offer_id="demo_123",
            title="Demo Earn Offer",
            description="This is a demo offer for testing",
            category="Demo",
            points_required=100,
            points_earned=50,
            status="in_progress",
            progress_current=50,
            progress_target=100,
            start_date=datetime.now(),
            end_date=datetime(2025, 12, 31),
            is_active=True,
        )

        print(f"✓ Created sample offer: {sample_offer.title}")
        print(f"   Progress: {sample_offer.progress_percentage:.1f}%")
        print(f"   Days until expiry: {sample_offer.days_until_expiry}")
        print(f"   Is expired: {sample_offer.is_expired}")

        # Test to_dict method
        offer_dict = sample_offer.to_dict()
        print(f"✓ Converted to dict with {len(offer_dict)} fields")

    except Exception as e:
        print(f"✗ Failed to create sample offer: {e}")

    print("\n🎉 mPerks earn functionality demo completed successfully!")


def main():
    """Main function to run the demo."""
    print("mPerks Earn Functionality Demo")
    print("=" * 40)
    print()
    print("This demo showcases the new mPerks earn functionality:")
    print("- Earn tab data retrieval")
    print("- In-progress, available, and all offers")
    print("- EarnableOffer and EarnTabData classes")
    print("- Utility methods for filtering and manipulation")
    print()
    print("Endpoints used:")
    print("- GET /digital/mperks40/customer/v1/earn/offers")
    print("- GET /digital/mperks40/customer/v1/earn/offers/in-progress")
    print("- GET /digital/mperks40/customer/v1/earn/offers/available")
    print("- GET /digital/mperks40/customer/v1/earn/offers/all")
    print()

    test_mperks_earn_functionality()


if __name__ == "__main__":
    main()
