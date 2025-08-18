#!/usr/bin/env python3
"""
Meijer Endpoint Summary Tool

Displays a focused summary of key Meijer endpoints that need to be implemented.
"""

import json
from typing import Dict, Any


def load_meijer_endpoints(file_path: str) -> Dict[str, Any]:
    """Load the Meijer endpoints data."""
    try:
        with open(file_path, "r") as f:
            return json.load(f)
    except Exception as e:
        print(f"❌ Error loading file: {e}")
        return {}


def display_category_summary(category: str, data: Dict[str, Any]):
    """Display a summary of endpoints in a category."""
    print(f"\n🔹 {category} ({data['total_count']} endpoints)")
    print(f"   Methods: {', '.join(data['methods'])}")
    print(f"   Hosts: {', '.join(data['hosts'])}")

    # Show first few endpoints as examples
    endpoints = data["endpoints"][:5]  # Show first 5
    for i, endpoint in enumerate(endpoints, 1):
        print(f"   {i}. {endpoint['method']} {endpoint['path']}")
        if endpoint["query_params"]:
            params = [f"{k}={list(v)[0]}" for k, v in endpoint["query_params"].items()]
            print(f"      Params: {', '.join(params)}")

    if len(data["endpoints"]) > 5:
        print(f"   ... and {len(data['endpoints']) - 5} more endpoints")


def display_implementation_priority(endpoints_data: Dict[str, Any]):
    """Display endpoints organized by implementation priority."""
    print("\n🚀 Implementation Priority Analysis")
    print("=" * 50)

    # Priority 1: Core functionality (already implemented)
    priority_1 = ["Shopping Lists", "Coupons & Offers", "Product Search", "Shop & Scan"]

    # Priority 2: High-value features
    priority_2 = ["mPerks & Loyalty", "Store Information", "Gas & Fuel"]

    # Priority 3: Enhanced features
    priority_3 = ["Authentication & Identity", "User Profile", "Notifications"]

    # Priority 4: Advanced features
    priority_4 = ["Cart & Checkout", "Feedback & Support", "Analytics & Tracking"]

    print("\n🎯 Priority 1 (Core - Already Implemented):")
    for category in priority_1:
        if category in endpoints_data["categories"]:
            data = endpoints_data["categories"][category]
            print(f"   ✅ {category}: {data['total_count']} endpoints")

    print("\n🔥 Priority 2 (High-Value - Implement Next):")
    for category in priority_2:
        if category in endpoints_data["categories"]:
            data = endpoints_data["categories"][category]
            print(f"   🔥 {category}: {data['total_count']} endpoints")

    print("\n⚡ Priority 3 (Enhanced - Implement Soon):")
    for category in priority_3:
        if category in endpoints_data["categories"]:
            data = endpoints_data["categories"][category]
            print(f"   ⚡ {category}: {data['total_count']} endpoints")

    print("\n🔧 Priority 4 (Advanced - Implement Later):")
    for category in priority_4:
        if category in endpoints_data["categories"]:
            data = endpoints_data["categories"][category]
            print(f"   🔧 {category}: {data['total_count']} endpoints")


def display_missing_endpoints(endpoints_data: Dict[str, Any]):
    """Display endpoints that are missing from our current implementation."""
    print("\n❌ Missing Endpoints Analysis")
    print("=" * 40)

    # Categories we currently have implemented
    implemented_categories = {
        "Shopping Lists": "meijer/shopping_list.py",
        "Coupons & Offers": "meijer/coupons.py",
        "Product Search": "meijer/search.py",
        "Shop & Scan": "meijer/shop_scan.py",
        "mPerks & Loyalty": "meijer/mperks.py",
        "Store Information": "meijer/stores.py",
        "Gas & Fuel": "meijer/gas.py",
        "Authentication & Identity": "meijer/auth.py",
    }

    for category, data in endpoints_data["categories"].items():
        if category in implemented_categories:
            print(
                f"\n✅ {category} - Implemented in {implemented_categories[category]}"
            )
            print(f"   Total endpoints: {data['total_count']}")
        else:
            print(f"\n❌ {category} - NOT IMPLEMENTED")
            print(f"   Total endpoints: {data['total_count']}")
            print("   Sample endpoints:")
            for endpoint in data["endpoints"][:3]:
                print(f"     {endpoint['method']} {endpoint['path']}")


def main():
    """Main function to display endpoint summary."""
    print("📊 Meijer Endpoint Summary")
    print("=" * 40)

    # Load endpoints data
    endpoints_file = "meijer_api_endpoints.json"
    endpoints_data = load_meijer_endpoints(endpoints_file)

    if not endpoints_data:
        print("❌ Failed to load endpoints data")
        return

    # Display overall summary
    summary = endpoints_data["summary"]
    print(f"Total Meijer endpoints discovered: {summary['total_meijer_endpoints']}")
    print(f"Categories: {summary['categories']}")

    # Display category summaries
    for category, data in endpoints_data["categories"].items():
        display_category_summary(category, data)

    # Display implementation priority
    display_implementation_priority(endpoints_data)

    # Display missing endpoints
    display_missing_endpoints(endpoints_data)

    print(
        f"\n🎯 Summary: We have {summary['total_meijer_endpoints']} endpoints to work with!"
    )
    print("   Focus on Priority 2 categories to expand functionality quickly.")


if __name__ == "__main__":
    main()
