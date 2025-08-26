#!/usr/bin/env python3
"""
Find successful fulfillment requests in the logs to understand what headers are needed.
"""

import re
from pathlib import Path


def find_successful_fulfillment():
    """Find successful fulfillment requests in the logs."""
    print("Looking for successful fulfillment requests...")

    # Find the most recent log file
    log_files = list(Path(".").rglob("*.log"))
    if not log_files:
        print("No log files found!")
        return

    latest_log = sorted(log_files, key=lambda x: x.stat().st_mtime, reverse=True)[0]
    print(f"Using latest log: {latest_log}")

    try:
        with open(latest_log, "rb") as f:
            content = f.read()

        # Try to decode
        try:
            decoded_content = content.decode("utf-8", errors="ignore")
        except UnicodeDecodeError:
            decoded_content = content.decode("latin-1", errors="ignore")

        # Look for successful fulfillment requests
        # We want to find requests that returned 200 status
        # Look for the pattern: HTTP/2.0 200 followed by fulfillment-related content

        # First, find all HTTP 200 responses
        success_pattern = r"HTTP/[0-9.]+ 200"
        success_matches = re.finditer(success_pattern, decoded_content)

        print("Looking for successful (200) responses...")

        fulfillment_successes = []

        for match in success_matches:
            # Get context around this success response
            start_pos = max(0, match.start() - 3000)
            end_pos = min(len(decoded_content), match.end() + 3000)
            context = decoded_content[start_pos:end_pos]

            # Check if this is related to fulfillment
            if (
                "fulfillment" in context.lower()
                or "reservationslots" in context.lower()
            ):
                print(
                    f"\n=== Potential Fulfillment Success at position {match.start()} ==="
                )

                # Look for the request that led to this response
                request_section = re.search(r"7:request;([^}]+)", context)
                if request_section:
                    request_content = request_section.group(1)

                    # Look for method and path
                    method_match = re.search(r"6:method;(\d+):([^,]+)", request_content)
                    if method_match:
                        method_length = int(method_match.group(1))
                        method_value = method_match.group(2)
                        if len(method_value) >= method_length:
                            actual_method = method_value[:method_length]
                            print(f"  Method: {actual_method}")

                    path_match = re.search(r"4:path;(\d+):([^,]+)", request_content)
                    if path_match:
                        path_length = int(path_match.group(1))
                        path_value = path_match.group(2)
                        if len(path_value) >= path_length:
                            actual_path = path_value[:path_length]
                            print(f"  Path: {actual_path}")

                            if "reservationslots" in actual_path:
                                print("  *** RESERVATIONSLOTS SUCCESS ***")
                                fulfillment_successes.append(
                                    {
                                        "position": match.start(),
                                        "method": actual_method
                                        if "actual_method" in locals()
                                        else "Unknown",
                                        "path": actual_path,
                                        "context": context,
                                    }
                                )

                # Look for headers in the context
                headers_section = re.search(r"7:headers;([^}]+)", context)
                if headers_section:
                    header_content = headers_section.group(1)
                    print("  Headers section found")

                    # Parse headers
                    header_pairs = re.findall(
                        r"(\d+):([^,]+),(\d+):([^,]+)", header_content
                    )

                    print("  Parsed headers:")
                    for key_len, key, value_len, value in header_pairs:
                        try:
                            key_len = int(key_len)
                            value_len = int(value_len)

                            if len(key) >= key_len and len(value) >= value_len:
                                actual_key = key[:key_len]
                                actual_value = value[:value_len]

                                if (
                                    actual_key
                                    and actual_value
                                    and not actual_key.isdigit()
                                    and not actual_value.isdigit()
                                ):
                                    print(f"    {actual_key}: {actual_value}")
                        except (ValueError, IndexError):
                            continue

                # Look for content
                content_section = re.search(r"7:content;(\d+):(\{[^}]+\})", context)
                if content_section:
                    content_length = content_section.group(1)
                    content_value = content_section.group(2)
                    print(f"  Content length: {content_length}")
                    print(f"  Content: {content_value[:200]}...")

                print(f"  Context snippet: {context[:300]}...")

        if fulfillment_successes:
            print("\n=== SUMMARY ===")
            print(f"Found {len(fulfillment_successes)} successful fulfillment requests")
            for success in fulfillment_successes:
                print(
                    f"  {success['method']} {success['path']} at position {success['position']}"
                )
        else:
            print("\nNo successful fulfillment requests found")

            # Look for any 200 responses to see what's working
            print("\nLooking for any successful requests to understand the pattern...")
            all_successes = list(re.finditer(success_pattern, decoded_content))
            print(f"Total successful responses: {len(all_successes)}")

            # Show a few examples
            for i, match in enumerate(all_successes[:5]):
                start_pos = max(0, match.start() - 1000)
                end_pos = min(len(decoded_content), match.end() + 1000)
                context = decoded_content[start_pos:end_pos]

                # Look for the request
                request_section = re.search(r"7:request;([^}]+)", context)
                if request_section:
                    request_content = request_section.group(1)

                    path_match = re.search(r"4:path;(\d+):([^,]+)", request_content)
                    if path_match:
                        path_length = int(path_match.group(1))
                        path_value = path_match.group(2)
                        if len(path_value) >= path_length:
                            actual_path = path_value[:path_length]
                            print(f"  Success {i + 1}: {actual_path}")

    except Exception as e:
        print(f"Error processing log: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    find_successful_fulfillment()
