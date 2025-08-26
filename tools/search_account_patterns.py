#!/usr/bin/env python3
"""
Search for account-related patterns in the log file.
"""

import re
import json


def search_account_patterns():
    """Search for account-related patterns in the log file."""
    patterns = [
        r'https://[^/]*meijer\.com[^"]*account[^"]*',
        r'https://[^/]*meijer\.com[^"]*profile[^"]*',
        r'https://[^/]*meijer\.com[^"]*user[^"]*',
        r'https://[^/]*meijer\.com[^"]*receipt[^"]*',
        r'https://[^/]*meijer\.com[^"]*order[^"]*',
        r'https://[^/]*meijer\.com[^"]*savings[^"]*',
        r'https://[^/]*meijer\.com[^"]*loyalty[^"]*',
        r'https://[^/]*meijer\.com[^"]*digital[^"]*',
        r'https://[^/]*meijer\.com[^"]*mperks[^"]*',
    ]

    found_endpoints = set()

    try:
        with open(
            "logs/meijer_mitm_20250822_2130.log", "r", encoding="utf-8", errors="ignore"
        ) as f:
            for line_num, line in enumerate(f, 1):
                for pattern in patterns:
                    matches = re.findall(pattern, line, re.IGNORECASE)
                    for match in matches:
                        # Clean up the URL
                        clean_url = match.split("?")[0].split(" ")[0]
                        found_endpoints.add(clean_url)

                        if len(found_endpoints) % 10 == 0:
                            print(f"Found {len(found_endpoints)} endpoints so far...")

    except Exception as e:
        print(f"Error reading log file: {e}")
        return

    # Save results
    results = {
        "total_endpoints": len(found_endpoints),
        "endpoints": sorted(list(found_endpoints)),
    }

    with open("account_endpoints_found.json", "w") as f:
        json.dump(results, f, indent=2)

    print(f"\nFound {len(found_endpoints)} account-related endpoints:")
    for endpoint in sorted(found_endpoints):
        print(f"  {endpoint}")

    print("\nResults saved to: account_endpoints_found.json")


if __name__ == "__main__":
    search_account_patterns()
