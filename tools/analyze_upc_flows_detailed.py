#!/usr/bin/env python3
"""
Analyze mitmproxy log file for specific UPC flows.

This script analyzes a mitmproxy log file to identify flows containing specific UPCs
and distinguish between different types of operations (search by UPC, search by name,
add to cart, add to shop'n'scan cart).
"""

import sys
from pathlib import Path
from typing import List
from mitmproxy import io
from mitmproxy.flow import Flow


def analyze_upc_flows(log_file_path: str, target_upcs: List[str]) -> None:
    """
    Analyze mitmproxy log file for flows containing specific UPCs.

    Args:
        log_file_path: Path to the mitmproxy log file
        target_upcs: List of UPCs to search for
    """
    print(f"Analyzing log file: {log_file_path}")
    print(f"Target UPCs: {', '.join(target_upcs)}")
    print("=" * 80)

    found_flows = []

    try:
        with open(log_file_path, "rb") as f:
            flows_reader = io.FlowReader(f)

            for flow in flows_reader.stream():
                if flow.request and flow.response:
                    # Check if any target UPC appears in request or response content
                    request_content = str(flow.request.content or "")
                    response_content = str(flow.response.content or "")

                    for upc in target_upcs:
                        if upc in request_content or upc in response_content:
                            found_flows.append(
                                {
                                    "flow": flow,
                                    "upc": upc,
                                    "request_content": request_content,
                                    "response_content": response_content,
                                }
                            )
                            break

    except Exception as e:
        print(f"Error reading log file: {e}")
        return

    print(f"Found {len(found_flows)} flows containing target UPCs")
    print("=" * 80)

    # Group flows by UPC
    upc_groups = {}
    for flow_info in found_flows:
        upc = flow_info["upc"]
        if upc not in upc_groups:
            upc_groups[upc] = []
        upc_groups[upc].append(flow_info)

    # Analyze each UPC group
    for upc, flows in upc_groups.items():
        print(f"\nUPC: {upc}")
        print("-" * 40)

        for i, flow_info in enumerate(flows):
            flow = flow_info["flow"]
            print(f"\nFlow {i + 1}:")
            print(f"  Method: {flow.request.method}")
            print(f"  URL: {flow.request.pretty_url}")
            print(f"  Status: {flow.response.status_code}")

            # Analyze the type of operation
            operation_type = classify_operation(
                flow, flow_info["request_content"], flow_info["response_content"]
            )
            print(f"  Operation: {operation_type}")

            # Check if this is a search operation
            if "search" in flow.request.pretty_url.lower():
                search_type = classify_search_type(
                    flow_info["request_content"], flow_info["response_content"]
                )
                print(f"  Search Type: {search_type}")

            # Show key request/response details
            if flow.request.headers:
                print(f"  Request Headers: {dict(flow.request.headers)}")

            if flow.response.headers:
                print(f"  Response Headers: {dict(flow.response.headers)}")

            print()


def classify_operation(flow: Flow, request_content: str, response_content: str) -> str:
    """
    Classify the type of operation based on URL and content.

    Args:
        flow: The mitmproxy flow
        request_content: Request content as string
        response_content: Response content as string

    Returns:
        String describing the operation type
    """
    url = flow.request.pretty_url.lower()

    if "cart" in url and "add" in url:
        return "Add to Cart"
    elif "shop" in url and "scan" in url and "cart" in url:
        return "Add to Shop'n'Scan Cart"
    elif "search" in url:
        return "Search Operation"
    elif "product" in url:
        return "Product Operation"
    elif "item" in url:
        return "Item Operation"
    else:
        return "Other Operation"


def classify_search_type(request_content: str, response_content: str) -> str:
    """
    Classify whether a search is by UPC or by name.

    Args:
        request_content: Request content as string
        response_content: Response content as string

    Returns:
        String indicating search type
    """
    # Look for UPC patterns in request content
    import re

    # UPC patterns (12-13 digits)
    upc_pattern = r"\b\d{12,13}\b"

    if re.search(upc_pattern, request_content):
        return "Search by UPC"
    else:
        return "Search by Name/Text"


def main():
    """Main function to run the UPC flow analysis."""
    if len(sys.argv) != 2:
        print("Usage: python analyze_upc_flows_detailed.py <log_file_path>")
        sys.exit(1)

    log_file_path = sys.argv[1]

    # Target UPCs from the user's request
    target_upcs = [
        "629307040245",
        "842595131277",
        "822279082910",
        "070896523112",
        "713733252843",
        "016000275263",
        "046100001899",
    ]

    if not Path(log_file_path).exists():
        print(f"Log file not found: {log_file_path}")
        sys.exit(1)

    analyze_upc_flows(log_file_path, target_upcs)


if __name__ == "__main__":
    main()
