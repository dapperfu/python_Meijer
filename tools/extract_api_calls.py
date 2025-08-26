#!/usr/bin/env python3
"""
Extract API calls to api.meijer.com from mitmproxy logs.

This script analyzes mitmproxy binary logs to find all API calls
to the Meijer API endpoints.
"""

import json
import re
from pathlib import Path
from typing import Dict, Any
from collections import defaultdict


def extract_api_calls(log_file: Path) -> Dict[str, Any]:
    """
    Extract API calls to api.meijer.com from mitmproxy log.

    Args:
        log_file: Path to mitmproxy log file

    Returns:
        Dictionary containing extracted API calls and analysis
    """
    print(f"🔍 Analyzing mitmproxy log: {log_file}")

    api_calls = []
    endpoints = defaultdict(int)

    try:
        # Read the binary log file
        with open(log_file, "rb") as f:
            content = f.read()

        # Decode with error handling
        decoded_content = content.decode("utf-8", errors="ignore")

        # Look for api.meijer.com calls
        # Pattern: look for URLs containing api.meijer.com
        api_pattern = r'api\.meijer\.com([^"\s]+)'
        matches = re.finditer(api_pattern, decoded_content)

        for match in matches:
            endpoint = match.group(1)
            endpoints[endpoint] += 1

            # Try to extract more context around this endpoint
            start_pos = max(0, match.start() - 200)
            end_pos = min(len(decoded_content), match.end() + 200)
            context = decoded_content[start_pos:end_pos]

            # Look for HTTP method
            method_match = re.search(r"([A-Z]+)\s+[^\s]+", context)
            method = method_match.group(1) if method_match else "UNKNOWN"

            # Look for status code
            status_match = re.search(r'HTTP/[0-9.]+"?\s+(\d+)', context)
            status = status_match.group(1) if status_match else "UNKNOWN"

            api_calls.append(
                {
                    "endpoint": endpoint,
                    "method": method,
                    "status": status,
                    "context": context.strip(),
                }
            )

        print(f"📊 Found {len(api_calls)} API calls to api.meijer.com")
        print(f"📊 Found {len(endpoints)} unique endpoints")

        return {
            "log_file": str(log_file),
            "total_api_calls": len(api_calls),
            "unique_endpoints": len(endpoints),
            "endpoint_counts": dict(endpoints),
            "api_calls": api_calls,
        }

    except Exception as e:
        print(f"❌ Error analyzing log: {e}")
        return {"error": str(e)}


def main():
    """Main function to analyze log files."""
    # Find all mitmproxy log files
    log_files = list(Path(".").glob("meijer_mitm_*.log"))

    if not log_files:
        print("❌ No mitmproxy log files found")
        return

    print(f"📁 Found {len(log_files)} log files")

    all_results = {}

    for log_file in log_files:
        print(f"\n{'=' * 60}")
        result = extract_api_calls(log_file)
        all_results[log_file.name] = result

        if "error" not in result:
            print(f"✅ {log_file.name}: {result['total_api_calls']} API calls")
        else:
            print(f"❌ {log_file.name}: {result['error']}")

    # Save combined results
    output_file = "api_calls_analysis.json"
    with open(output_file, "w") as f:
        json.dump(all_results, f, indent=2)

    print(f"\n💾 Results saved to {output_file}")

    # Print summary
    print("\n📋 Summary of API endpoints found:")
    all_endpoints = defaultdict(int)
    for result in all_results.values():
        if "endpoint_counts" in result:
            for endpoint, count in result["endpoint_counts"].items():
                all_endpoints[endpoint] += count

    # Sort by frequency
    sorted_endpoints = sorted(all_endpoints.items(), key=lambda x: x[1], reverse=True)

    for endpoint, count in sorted_endpoints[:20]:  # Top 20
        print(f"  {endpoint}: {count} calls")


if __name__ == "__main__":
    main()
