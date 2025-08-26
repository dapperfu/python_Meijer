#!/usr/bin/env python3
"""
Search for actual API endpoints related to accounts in the log file.
"""

import re
import json


def search_api_endpoints():
    """Search for actual API endpoints related to accounts."""
    # Focus on actual API endpoints, not static assets
    api_patterns = [
        r'https://api\.meijer\.com[^"\s]+',
        r'https://mservices\.meijer\.com[^"\s]+',
        r'https://loyalty\.meijer\.com[^"\s]+',
        r'https://digital\.meijer\.com[^"\s]+',
    ]

    # Keywords to look for in URLs
    account_keywords = [
        "account",
        "profile",
        "user",
        "receipt",
        "order",
        "savings",
        "loyalty",
        "digital",
        "mperks",
        "preferences",
        "settings",
    ]

    found_endpoints = set()

    try:
        with open(
            "logs/meijer_mitm_20250822_2130.log", "r", encoding="utf-8", errors="ignore"
        ) as f:
            for line_num, line in enumerate(f, 1):
                for pattern in api_patterns:
                    matches = re.findall(pattern, line, re.IGNORECASE)
                    for match in matches:
                        # Check if it contains account-related keywords
                        if any(
                            keyword in match.lower() for keyword in account_keywords
                        ):
                            # Clean up the URL
                            clean_url = match.split("?")[0].split(" ")[0]
                            found_endpoints.add(clean_url)

                            if len(found_endpoints) % 5 == 0:
                                print(
                                    f"Found {len(found_endpoints)} API endpoints so far..."
                                )

    except Exception as e:
        print(f"Error reading log file: {e}")
        return

    # Save results
    results = {
        "total_api_endpoints": len(found_endpoints),
        "api_endpoints": sorted(list(found_endpoints)),
    }

    with open("api_endpoints_found.json", "w") as f:
        json.dump(results, f, indent=2)

    print(f"\nFound {len(found_endpoints)} account-related API endpoints:")
    for endpoint in sorted(found_endpoints):
        print(f"  {endpoint}")

    print("\nResults saved to: api_endpoints_found.json")


if __name__ == "__main__":
    search_api_endpoints()
