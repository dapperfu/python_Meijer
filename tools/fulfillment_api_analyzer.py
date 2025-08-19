#!/usr/bin/env python3
"""
Analyze mitmproxy log files for fulfillment API calls to understand the exact format needed.
"""

import json
import re
from pathlib import Path
from typing import Any, Dict, List


def find_mitmproxy_logs() -> List[Path]:
    """Find all mitmproxy log files in the current directory and subdirectories."""
    log_files = []
    for ext in ["*.log", "*.flow"]:
        log_files.extend(Path(".").rglob(ext))
    return sorted(log_files, key=lambda x: x.stat().st_mtime, reverse=True)


def analyze_fulfillment_calls(log_file: Path) -> Dict[str, Any]:
    """Analyze a specific log file for fulfillment-related API calls."""
    print(f"Analyzing {log_file}...")

    results = {
        "file": str(log_file),
        "fulfillment_calls": [],
        "pickup_slot_calls": [],
        "delivery_slot_calls": [],
        "reservation_calls": [],
        "fulfillment_headers": set(),
        "fulfillment_urls": set(),
    }

    try:
        with open(log_file, "rb") as f:
            content = f.read()

        # Decode content, handling potential encoding issues
        try:
            decoded_content = content.decode("utf-8", errors="ignore")
        except UnicodeDecodeError:
            decoded_content = content.decode("latin-1", errors="ignore")

        # Look for fulfillment-related API calls
        fulfillment_patterns = [
            r"fulfillment",
            r"pickup.*slot",
            r"delivery.*slot",
            r"reservation.*slot",
            r"reservationslots",
            r"pickup.*time",
            r"delivery.*time",
        ]

        for pattern in fulfillment_patterns:
            matches = re.finditer(pattern, decoded_content, re.IGNORECASE)
            for match in matches:
                # Get context around the match
                start = max(0, match.start() - 200)
                end = min(len(decoded_content), match.end() + 200)
                context = decoded_content[start:end]

                # Look for HTTP method and URL in context
                http_match = re.search(r"(GET|POST|PATCH|DELETE)\s+([^\s]+)", context)
                if http_match:
                    method = http_match.group(1)
                    url = http_match.group(2)

                    # Extract headers if present
                    headers = {}
                    header_matches = re.findall(
                        r"([A-Za-z0-9\-]+):\s*([^\r\n]+)", context
                    )
                    for header_name, header_value in header_matches:
                        headers[header_name] = header_value.strip()

                    call_info = {
                        "method": method,
                        "url": url,
                        "headers": headers,
                        "context": context.strip(),
                        "pattern_matched": pattern,
                    }

                    if "fulfillment" in pattern.lower():
                        results["fulfillment_calls"].append(call_info)
                    elif "pickup" in pattern.lower():
                        results["pickup_slot_calls"].append(call_info)
                    elif "delivery" in pattern.lower():
                        results["delivery_slot_calls"].append(call_info)
                    elif "reservation" in pattern.lower():
                        results["reservation_calls"].append(call_info)

                    results["fulfillment_headers"].update(headers.keys())
                    results["fulfillment_urls"].add(url)

        # Convert sets to lists for JSON serialization
        results["fulfillment_headers"] = list(results["fulfillment_headers"])
        results["fulfillment_urls"] = list(results["fulfillment_urls"])

    except Exception as e:
        print(f"Error analyzing {log_file}: {e}")
        results["error"] = str(e)

    return results


def main():
    """Main analysis function."""
    print("Analyzing mitmproxy logs for fulfillment API calls...")

    log_files = find_mitmproxy_logs()
    if not log_files:
        print("No mitmproxy log files found!")
        return

    print(f"Found {len(log_files)} log files:")
    for log_file in log_files:
        print(f"  - {log_file}")

    all_results = []

    # Analyze the most recent log file first
    for log_file in log_files[:3]:  # Limit to 3 most recent
        results = analyze_fulfillment_calls(log_file)
        all_results.append(results)

        # Print summary for this file
        print(f"\nResults for {log_file}:")
        print(f"  Fulfillment calls: {len(results['fulfillment_calls'])}")
        print(f"  Pickup slot calls: {len(results['pickup_slot_calls'])}")
        print(f"  Delivery slot calls: {len(results['delivery_slot_calls'])}")
        print(f"  Reservation calls: {len(results['reservation_calls'])}")
        print(f"  Unique headers: {len(results['fulfillment_headers'])}")
        print(f"  Unique URLs: {len(results['fulfillment_urls'])}")

        if results["fulfillment_headers"]:
            print(
                f"  Headers found: {', '.join(sorted(results['fulfillment_headers']))}"
            )

        if results["fulfillment_urls"]:
            print(f"  URLs found: {', '.join(sorted(results['fulfillment_urls']))}")

    # Save detailed results
    output_file = "fulfillment_analysis.json"
    with open(output_file, "w") as f:
        json.dump(all_results, f, indent=2)

    print(f"\nDetailed results saved to {output_file}")

    # Print most relevant findings
    print("\n=== MOST RELEVANT FULFILLMENT CALLS ===")
    for results in all_results:
        if results.get("fulfillment_calls") or results.get("pickup_slot_calls"):
            print(f"\nFile: {results['file']}")

            for call in results.get("fulfillment_calls", [])[:3]:
                print(f"  {call['method']} {call['url']}")
                print(f"    Headers: {dict(call['headers'])}")
                print(f"    Context: {call['context'][:100]}...")
                print()

            for call in results.get("pickup_slot_calls", [])[:3]:
                print(f"  {call['method']} {call['url']}")
                print(f"    Headers: {dict(call['headers'])}")
                print(f"    Context: {call['context'][:100]}...")
                print()


if __name__ == "__main__":
    main()
