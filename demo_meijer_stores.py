#!/usr/bin/env python3
"""
Meijer Stores Demo
=================

Demonstrates store search and information retrieval using the modular Meijer package.

This demo showcases:
- Store search functionality
- Store information retrieval
- Geographic search capabilities
- Clean API usage patterns
- Error handling
"""

import logging
from typing import List, Dict, Any

# Import from the modular package
from meijer import (
    Meijer,
    MeijerAuthenticationError,
)


def setup_demo_logging():
    """Configure clean logging for the demo."""
    logging.basicConfig(level=logging.WARNING, format="%(levelname)s: %(message)s")


def test_store_search_by_zip(
    client: Meijer, zip_code: str, radius: int = 25
) -> Dict[str, Any]:
    """Test store search by ZIP code."""
    print(f"🏪 STORE SEARCH BY ZIP: {zip_code}")
    print("-" * 40)

    results = {
        "zip_code": zip_code,
        "radius": radius,
        "stores_found": 0,
        "search_successful": False,
        "stores_data": [],
    }

    try:
        print(
            f"1️⃣  Searching for stores near ZIP {zip_code} (radius: {radius} miles)..."
        )
        stores = client.get_stores(zip_code=zip_code, radius=radius)

        results["stores_found"] = len(stores)
        results["stores_data"] = stores

        if stores:
            results["search_successful"] = True
            print(f"✅ Found {len(stores)} stores")

            # Show sample stores
            print("2️⃣  Sample stores found:")
            for i, store in enumerate(stores[:3], 1):
                name = store.get("name", "Unknown Store")
                address = store.get("address", "Address not available")
                print(f"   {i}. {name}")
                print(f"      Address: {address}")
        else:
            print("⚠️  No stores found in the specified area")
            results["search_successful"] = True  # Not an error, just no results

        return results

    except MeijerAuthenticationError:
        print("❌ Authentication required for store search")
        return results
    except Exception as e:
        print(f"❌ Store search failed: {e}")
        return results


def analyze_store_data(stores_data: List[Dict[str, Any]]) -> Dict[str, Any]:
    """Analyze store data structure and content."""
    print("\n📊 STORE DATA ANALYSIS")
    print("-" * 30)

    analysis = {
        "total_stores": len(stores_data),
        "stores_with_services": 0,
        "unique_cities": set(),
        "analysis_successful": False,
    }

    try:
        if not stores_data:
            print("⚠️  No store data to analyze")
            analysis["analysis_successful"] = True
            return analysis

        print(f"1️⃣  Analyzing {len(stores_data)} stores...")

        # Analyze store structure
        for store in stores_data:
            # Check for services
            if store.get("services"):
                analysis["stores_with_services"] += 1

            # Collect unique cities
            city = store.get("city", "Unknown")
            analysis["unique_cities"].add(city)

        print("2️⃣  Analysis results:")
        print(f"   • Total stores: {analysis['total_stores']}")
        print(f"   • Stores with services: {analysis['stores_with_services']}")
        print(f"   • Cities covered: {len(analysis['unique_cities'])}")
        print(f"   • City list: {', '.join(sorted(analysis['unique_cities']))}")

        # Show sample store structure
        if stores_data:
            print("3️⃣  Sample store structure:")
            sample_store = stores_data[0]
            print(f"   • Keys available: {list(sample_store.keys())}")

            if "name" in sample_store:
                print(f"   • Name: {sample_store['name']}")
            if "address" in sample_store:
                print(f"   • Address: {sample_store['address']}")
            if "phone" in sample_store:
                print(f"   • Phone: {sample_store['phone']}")

        analysis["analysis_successful"] = True
        return analysis

    except Exception as e:
        print(f"❌ Store data analysis failed: {e}")
        return analysis


def test_multiple_locations():
    """Test store search across multiple locations."""
    print("\n🗺️  MULTI-LOCATION STORE SEARCH")
    print("-" * 40)

    test_locations = [
        {"zip": "49456", "name": "Grand Rapids, MI area"},
        {"zip": "49001", "name": "Kalamazoo, MI area"},
        {"zip": "48104", "name": "Ann Arbor, MI area"},
    ]

    try:
        print("1️⃣  Testing store search across multiple Michigan locations...")
        client = Meijer()

        total_stores = 0
        location_results = {}

        for location in test_locations:
            zip_code = location["zip"]
            name = location["name"]

            print(f"   • Searching {name} ({zip_code})...")
            stores = client.get_stores(zip_code=zip_code, radius=15)
            store_count = len(stores)
            total_stores += store_count
            location_results[name] = store_count

            print(f"     Found {store_count} stores")

        print("2️⃣  Multi-location summary:")
        for location, count in location_results.items():
            print(f"   • {location}: {count} stores")
        print(f"   • Total stores across all locations: {total_stores}")

        print("✅ Multi-location search completed")
        return True

    except Exception as e:
        print(f"❌ Multi-location search failed: {e}")
        return False


def demonstrate_store_services():
    """Demonstrate store services information."""
    print("\n🛍️  STORE SERVICES DEMO")
    print("-" * 30)

    try:
        print("1️⃣  Getting stores with services information...")
        client = Meijer()

        # Get stores from a known area
        stores = client.get_stores(zip_code="49456", radius=30)

        if not stores:
            print("⚠️  No stores found for services demo")
            return True

        print(f"2️⃣  Analyzing services for {len(stores)} stores...")

        # Count services across stores
        all_services = set()
        stores_with_services = 0

        for store in stores:
            services = store.get("services", [])
            if services:
                stores_with_services += 1
                all_services.update(services)

        print("3️⃣  Services summary:")
        print(f"   • Stores with services: {stores_with_services}/{len(stores)}")

        if all_services:
            print(f"   • Available services: {', '.join(sorted(all_services))}")
        else:
            print("   • No service information available in simplified version")

        # Show example stores
        print("4️⃣  Sample stores:")
        for i, store in enumerate(stores[:2], 1):
            name = store.get("name", "Unknown Store")
            services = store.get("services", [])
            print(f"   {i}. {name}")
            if services:
                print(f"      Services: {', '.join(services)}")
            else:
                print("      Services: Information not available")

        print("✅ Store services demo completed")
        return True

    except Exception as e:
        print(f"❌ Store services demo failed: {e}")
        return False


def main():
    """Run the comprehensive stores demo."""
    print("🏪 MEIJER STORES DEMO")
    print("=" * 40)
    print("Testing store search functionality with the modular package")
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

        # Test store search by ZIP
        zip_results = test_store_search_by_zip(client, "49456", radius=25)
        results["zip_search"] = zip_results["search_successful"]

        # Analyze store data if available
        if zip_results["stores_data"]:
            analysis_results = analyze_store_data(zip_results["stores_data"])
            results["data_analysis"] = analysis_results["analysis_successful"]
        else:
            print("\n⚠️  Skipping analysis - no store data available")
            results["data_analysis"] = True  # Not a failure

        # Test multiple locations
        multi_location_success = test_multiple_locations()
        results["multi_location"] = multi_location_success

        # Test store services
        services_success = demonstrate_store_services()
        results["store_services"] = services_success

        # Summary
        print("\n📊 STORES DEMO SUMMARY")
        print("=" * 40)

        passed = sum(results.values())
        total = len(results)

        for test_name, success in results.items():
            status = "✅ PASS" if success else "❌ FAIL"
            formatted_name = test_name.replace("_", " ").title()
            print(f"{formatted_name:<20} {status}")

        print(f"\n🎯 Results: {passed}/{total} tests passed")

        if passed == total:
            print("🎉 All store tests passed!")
        else:
            print("⚠️  Some tests failed (may be due to simplified API implementation)")

        print("\n💡 Features demonstrated:")
        print("  • Store search by ZIP code")
        print("  • Geographic radius filtering")
        print("  • Multi-location searches")
        print("  • Store data analysis")
        print("  • Services information")
        print("  • Clean error handling")

        print("\n🚀 Usage example:")
        print("   from meijer import Meijer")
        print("   client = Meijer()")
        print("   stores = client.get_stores(zip_code='49456', radius=25)")
        print("   # Find stores near you! 🗺️")

    except Exception as e:
        print(f"❌ Demo failed: {e}")


if __name__ == "__main__":
    main()
