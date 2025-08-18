#!/usr/bin/env python3
"""
Meijer Endpoint Extractor

This tool extracts and organizes just the Meijer-specific API endpoints
from the comprehensive discovery report, filtering out third-party services.
"""

import json
import re
from collections import defaultdict
from typing import Dict, List, Any


def load_comprehensive_report(report_file: str) -> Dict[str, Any]:
    """Load the comprehensive API discovery report."""
    try:
        with open(report_file, "r") as f:
            return json.load(f)
    except Exception as e:
        print(f"❌ Error loading report: {e}")
        return {}


def is_meijer_endpoint(endpoint: str, sample_urls: List[str]) -> bool:
    """Determine if an endpoint is Meijer-specific."""
    meijer_hosts = [
        "mservices.meijer.com",
        "api.meijer.com",
        "id.meijer.com",
        "mperksservices.meijer.com",
        "static.meijer.com",
        "www.meijer.com",
    ]

    # Check if any sample URLs contain Meijer hosts
    for url in sample_urls:
        if any(host in url for host in meijer_hosts):
            return True

    # Check if the path contains Meijer-specific patterns
    meijer_patterns = [
        r"/dgtlmma/",
        r"/loyalty/",
        r"/storeinfo/",
        r"/mperks/",
        r"/shoppinglist/",
        r"/offers/",
        r"/coupons/",
        r"/gas/",
        r"/feedback/",
        r"/oauth2/",
        r"/accounts/",
        r"/api/",
        r"/mobile/",
    ]

    for pattern in meijer_patterns:
        if re.search(pattern, endpoint):
            return True

    return False


def categorize_endpoint(endpoint: str, path: str) -> str:
    """Categorize an endpoint by functionality."""
    path_lower = path.lower()

    # Authentication & Identity
    if any(x in path_lower for x in ["/oauth2/", "/accounts/", "/login", "/auth"]):
        return "Authentication & Identity"

    # mPerks & Loyalty
    if any(x in path_lower for x in ["/mperks/", "/loyalty/", "/dgtlmma/"]):
        return "mPerks & Loyalty"

    # Shopping Lists
    if any(x in path_lower for x in ["/shoppinglist/", "/list"]):
        return "Shopping Lists"

    # Coupons & Offers
    if any(x in path_lower for x in ["/offers/", "/coupons/", "/deals"]):
        return "Coupons & Offers"

    # Store Information
    if any(x in path_lower for x in ["/storeinfo/", "/stores/", "/locations"]):
        return "Store Information"

    # Gas & Fuel
    if any(x in path_lower for x in ["/gas/", "/fuel/", "/station"]):
        return "Gas & Fuel"

    # Product Search
    if any(x in path_lower for x in ["/search/", "/products/", "/items"]):
        return "Product Search"

    # Shop & Scan
    if any(x in path_lower for x in ["/shopscan/", "/barcode/", "/scan"]):
        return "Shop & Scan"

    # Cart & Checkout
    if any(x in path_lower for x in ["/cart/", "/checkout/", "/order"]):
        return "Cart & Checkout"

    # Feedback & Support
    if any(x in path_lower for x in ["/feedback/", "/support/", "/help"]):
        return "Feedback & Support"

    # User Profile
    if any(x in path_lower for x in ["/profile/", "/user/", "/account"]):
        return "User Profile"

    # Notifications
    if any(x in path_lower for x in ["/notifications/", "/alerts/", "/messages"]):
        return "Notifications"

    # Analytics & Tracking
    if any(x in path_lower for x in ["/analytics/", "/tracking/", "/stats"]):
        return "Analytics & Tracking"

    return "Other"


def extract_meijer_endpoints(report: Dict[str, Any]) -> Dict[str, Any]:
    """Extract and organize Meijer-specific endpoints."""
    meijer_endpoints = defaultdict(
        lambda: {"endpoints": [], "total_count": 0, "methods": set(), "hosts": set()}
    )

    total_meijer_endpoints = 0

    for endpoint, data in report.get("endpoints", {}).items():
        # Extract method and path
        parts = endpoint.split(" ", 1)
        if len(parts) != 2:
            continue

        method, path = parts

        # Check if this is a Meijer endpoint
        if is_meijer_endpoint(endpoint, data.get("sample_urls", [])):
            total_meijer_endpoints += 1

            # Categorize the endpoint
            category = categorize_endpoint(endpoint, path)

            # Extract host from sample URLs
            hosts = set()
            for url in data.get("sample_urls", []):
                if "://" in url:
                    host = url.split("://")[1].split("/")[0]
                    hosts.add(host)

            # Create endpoint summary
            endpoint_summary = {
                "method": method,
                "path": path,
                "full_endpoint": endpoint,
                "status_codes": data.get("status_codes", []),
                "content_types": data.get("content_types", []),
                "hosts": list(hosts),
                "sample_urls": data.get("sample_urls", []),
                "query_params": data.get("query_params", {}),
                "headers": data.get("headers", {}),
                "request_body_sample": data.get("request_bodies", [])[:1],
                "response_body_sample": data.get("response_bodies", [])[:1],
            }

            meijer_endpoints[category]["endpoints"].append(endpoint_summary)
            meijer_endpoints[category]["total_count"] += 1
            meijer_endpoints[category]["methods"].add(method)
            meijer_endpoints[category]["hosts"].update(hosts)

    # Convert sets to lists for JSON serialization
    for category in meijer_endpoints:
        meijer_endpoints[category]["methods"] = list(
            meijer_endpoints[category]["methods"]
        )
        meijer_endpoints[category]["hosts"] = list(meijer_endpoints[category]["hosts"])

    return {
        "summary": {
            "total_meijer_endpoints": total_meijer_endpoints,
            "categories": len(meijer_endpoints),
            "total_endpoints_analyzed": len(report.get("endpoints", {})),
        },
        "categories": dict(meijer_endpoints),
    }


def save_meijer_endpoints(meijer_data: Dict[str, Any], output_file: str):
    """Save the Meijer endpoints to a file."""
    try:
        with open(output_file, "w") as f:
            json.dump(meijer_data, f, indent=2, default=str)
        print(f"✅ Meijer endpoints saved to: {output_file}")
    except Exception as e:
        print(f"❌ Error saving Meijer endpoints: {e}")


def display_summary(meijer_data: Dict[str, Any]):
    """Display a summary of discovered Meijer endpoints."""
    print("\n🎯 Meijer API Endpoints Summary")
    print("=" * 50)

    summary = meijer_data["summary"]
    print(f"Total Meijer endpoints: {summary['total_meijer_endpoints']}")
    print(f"Categories: {summary['categories']}")
    print(f"Total endpoints analyzed: {summary['total_endpoints_analyzed']}")

    print("\n📊 Endpoints by Category:")
    for category, data in meijer_data["categories"].items():
        print(f"  {category}: {data['total_count']} endpoints")
        print(f"    Methods: {', '.join(data['methods'])}")
        print(f"    Hosts: {', '.join(data['hosts'])}")
        print()


def main():
    """Main function to extract Meijer endpoints."""
    print("🎯 Meijer Endpoint Extractor")
    print("=" * 40)

    # Load comprehensive report
    report_file = "comprehensive_api_discovery_report.json"
    print(f"📁 Loading comprehensive report: {report_file}")

    report = load_comprehensive_report(report_file)
    if not report:
        print("❌ Failed to load comprehensive report")
        return

    # Extract Meijer endpoints
    print("🔍 Extracting Meijer-specific endpoints...")
    meijer_data = extract_meijer_endpoints(report)

    # Display summary
    display_summary(meijer_data)

    # Save Meijer endpoints
    output_file = "meijer_api_endpoints.json"
    save_meijer_endpoints(meijer_data, output_file)

    print("✅ Meijer endpoint extraction complete!")
    print(f"📄 Results saved to: {output_file}")


if __name__ == "__main__":
    main()
