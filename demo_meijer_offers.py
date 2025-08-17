#!/usr/bin/env python3
"""
Meijer Offers Demo
=================

Demonstrates offers and coupons functionality using the modular Meijer package.

This demo showcases:
- Offers retrieval and management
- Clean API usage patterns
- Error handling
- Modular package benefits
"""

import logging
from typing import List, Dict, Any

# Import from the modular package
from meijer import (
    Meijer,
    AuthenticationStatus,
    MeijerAuthenticationError,
)


def setup_demo_logging():
    """Configure clean logging for the demo."""
    logging.basicConfig(level=logging.WARNING, format="%(levelname)s: %(message)s")


def test_offers_retrieval(client: Meijer) -> Dict[str, Any]:
    """Test offers retrieval functionality."""
    print("🎟️  OFFERS RETRIEVAL TEST")
    print("-" * 30)

    results = {"offers_count": 0, "retrieval_successful": False, "offers_data": []}

    try:
        # Get available offers
        print("1️⃣  Retrieving available offers...")
        offers = client.get_offers(limit=20)

        results["offers_count"] = len(offers)
        results["offers_data"] = offers

        if offers:
            results["retrieval_successful"] = True
            print(f"✅ Successfully retrieved {len(offers)} offers")

            # Show sample offers
            print("2️⃣  Sample offers:")
            for i, offer in enumerate(offers[:3], 1):
                title = offer.get("title", "Unknown Offer")
                discount = offer.get("discount", "N/A")
                print(f"   {i}. {title}")
                print(f"      Discount: {discount}")
        else:
            print("⚠️  No offers available")
            results["retrieval_successful"] = True  # Still successful, just empty

        return results

    except MeijerAuthenticationError:
        print("❌ Authentication required for offers")
        return results
    except Exception as e:
        print(f"❌ Offers retrieval failed: {e}")
        return results


def analyze_offers_data(offers_data: List[Dict[str, Any]]) -> Dict[str, Any]:
    """Analyze offers data structure and content."""
    print("\n📊 OFFERS DATA ANALYSIS")
    print("-" * 30)

    analysis = {
        "total_offers": len(offers_data),
        "offer_types": set(),
        "has_discounts": 0,
        "analysis_successful": False,
    }

    try:
        if not offers_data:
            print("⚠️  No offers data to analyze")
            analysis["analysis_successful"] = True
            return analysis

        print(f"1️⃣  Analyzing {len(offers_data)} offers...")

        # Analyze offer structure
        for offer in offers_data:
            # Check for discount information
            if offer.get("discount"):
                analysis["has_discounts"] += 1

            # Collect offer types if available
            offer_type = offer.get("type", "unknown")
            analysis["offer_types"].add(offer_type)

        print("2️⃣  Analysis results:")
        print(f"   • Total offers: {analysis['total_offers']}")
        print(f"   • Offers with discounts: {analysis['has_discounts']}")
        print(f"   • Offer types: {list(analysis['offer_types'])}")

        # Show detailed example
        if offers_data:
            print("3️⃣  Sample offer structure:")
            sample_offer = offers_data[0]
            print(f"   • Keys available: {list(sample_offer.keys())}")

            if "title" in sample_offer:
                print(f"   • Title: {sample_offer['title']}")
            if "discount" in sample_offer:
                print(f"   • Discount: {sample_offer['discount']}")

        analysis["analysis_successful"] = True
        return analysis

    except Exception as e:
        print(f"❌ Offers analysis failed: {e}")
        return analysis


def test_offers_filtering():
    """Test offers filtering capabilities."""
    print("\n🔍 OFFERS FILTERING TEST")
    print("-" * 30)

    try:
        # Test with different limits
        print("1️⃣  Testing different offer limits...")
        client = Meijer()

        limits = [5, 10, 20]
        for limit in limits:
            offers = client.get_offers(limit=limit)
            print(f"   • Limit {limit}: Got {len(offers)} offers")

        print("✅ Filtering test completed")
        return True

    except Exception as e:
        print(f"❌ Filtering test failed: {e}")
        return False


def demonstrate_offers_workflow():
    """Demonstrate a complete offers workflow."""
    print("\n🔄 OFFERS WORKFLOW DEMO")
    print("-" * 30)

    try:
        # Create client
        print("1️⃣  Initializing client...")
        client = Meijer()

        if client.auth_status != AuthenticationStatus.AUTHENTICATED:
            print("❌ Authentication required for offers workflow")
            return False

        # Step 1: Get all available offers
        print("2️⃣  Getting available offers...")
        all_offers = client.get_offers(limit=50)
        print(f"   📊 Found {len(all_offers)} total offers")

        # Step 2: Analyze offers (simplified)
        if all_offers:
            offers_with_discounts = [
                offer
                for offer in all_offers
                if offer.get("discount") and offer.get("discount") != "N/A"
            ]
            print(
                f"   💰 {len(offers_with_discounts)} offers have discount information"
            )

            # Step 3: Show top offers
            print("3️⃣  Top offers preview:")
            for i, offer in enumerate(all_offers[:3], 1):
                title = offer.get("title", "Special Offer")[:50]
                print(f"   {i}. {title}")

        print("✅ Offers workflow completed successfully")
        return True

    except MeijerAuthenticationError:
        print("❌ Authentication required for offers workflow")
        return False
    except Exception as e:
        print(f"❌ Offers workflow failed: {e}")
        return False


def main():
    """Run the Meijer offers demo."""
    print("🎟️  MEIJER OFFERS DEMO")
    print("=" * 40)
    print("Testing offers functionality with the modular package")
    print("")

    # Setup logging
    setup_demo_logging()

    # Track results
    results = {}

    try:
        # Initialize client
        print("📱 Initializing Meijer client...")
        client = Meijer()
        print("✅ Client initialized")
        print("")

        # Test offers retrieval
        offers_results = test_offers_retrieval(client)
        results["offers_retrieval"] = offers_results["retrieval_successful"]

        # Analyze offers data
        if offers_results["offers_data"]:
            analysis_results = analyze_offers_data(offers_results["offers_data"])
            results["offers_analysis"] = analysis_results["analysis_successful"]
        else:
            print("\n⚠️  Skipping analysis - no offers data available")
            results["offers_analysis"] = True  # Not a failure

        # Test filtering
        filtering_success = test_offers_filtering()
        results["offers_filtering"] = filtering_success

        # Test workflow
        workflow_success = demonstrate_offers_workflow()
        results["offers_workflow"] = workflow_success

        # Summary
        print("\n📊 OFFERS DEMO SUMMARY")
        print("=" * 40)

        passed = sum(results.values())
        total = len(results)

        for test_name, success in results.items():
            status = "✅ PASS" if success else "❌ FAIL"
            formatted_name = test_name.replace("_", " ").title()
            print(f"{formatted_name:<20} {status}")

        print(f"\n🎯 Results: {passed}/{total} tests passed")

        if passed == total:
            print("🎉 All offers tests passed!")
        else:
            print("⚠️  Some tests failed (may be due to simplified API implementation)")

        print("\n💡 Features demonstrated:")
        print("  • Offers retrieval and management")
        print("  • Data analysis and filtering")
        print("  • Complete workflow examples")
        print("  • Clean error handling")
        print("  • Modular package usage")

        print("\n🚀 Usage example:")
        print("   from meijer import Meijer")
        print("   client = Meijer()")
        print("   offers = client.get_offers(limit=20)")
        print("   # Clean and simple! 🎯")

    except Exception as e:
        print(f"❌ Demo failed: {e}")


if __name__ == "__main__":
    main()
