#!/usr/bin/env python3
"""
Simple extraction of request headers from reservationslots calls.
"""

import json
import re
from pathlib import Path


def extract_headers_from_log(log_file: Path) -> list:
    """Extract request headers from reservationslots calls."""
    print(f"Extracting headers from {log_file}...")

    results = []

    try:
        with open(log_file, "rb") as f:
            content = f.read()

        # Try to decode
        try:
            decoded_content = content.decode("utf-8", errors="ignore")
        except UnicodeDecodeError:
            decoded_content = content.decode("latin-1", errors="ignore")

        # Look for the pattern that shows request headers
        # From the logs, I can see: 7:headers;... followed by request details
        # The pattern shows headers in format: key;value,key;value
        header_pattern = r"7:headers;([^}]+)"
        header_matches = re.finditer(header_pattern, decoded_content)

        for match in header_matches:
            header_content = match.group(1)

            # Look for the request section that follows
            start_pos = match.end()
            end_pos = min(len(decoded_content), start_pos + 1000)
            request_section = decoded_content[start_pos:end_pos]

            # Check if this is followed by a request section
            if "7:request;" in request_section:
                # Extract the headers in the format: key;value,key;value
                headers = {}

                # Look for patterns like: 29:6:accept,16:application/json
                # This means: key length 29, key "accept", value length 16, value "application/json"
                header_parts = re.findall(
                    r"(\d+):([^,]+),(\d+):([^,]+)", header_content
                )

                for key_len, key_part, value_len, value_part in header_parts:
                    try:
                        key_len = int(key_len)
                        value_len = int(value_len)

                        if len(key_part) >= key_len and len(value_part) >= value_len:
                            key = key_part[:key_len]
                            value = value_part[:value_len]

                            if (
                                key
                                and value
                                and not key.isdigit()
                                and not value.isdigit()
                            ):
                                headers[key] = value
                    except (ValueError, IndexError):
                        continue

                # Also look for the content section
                content_match = re.search(
                    r"7:content;(\d+):(\{[^}]+\})", request_section
                )
                if content_match:
                    content_length = content_match.group(1)
                    json_content = content_match.group(2)

                    # Try to parse the JSON
                    try:
                        parsed_json = json.loads(json_content)
                    except json.JSONDecodeError:
                        parsed_json = {"raw": json_content}

                    result = {
                        "headers": headers,
                        "content_length": content_length,
                        "request_body": parsed_json,
                        "raw_headers": header_content,
                        "raw_content": json_content,
                    }

                    results.append(result)

                    print("  Found request:")
                    print(f"    Headers: {dict(headers)}")
                    print(f"    Content-Length: {content_length}")
                    print(f"    Body: {parsed_json}")
                    print()

    except Exception as e:
        print(f"Error processing {log_file}: {e}")
        import traceback

        traceback.print_exc()

    return results


def main():
    """Main extraction function."""
    print("Extracting request headers from reservationslots calls...")

    # Find the most recent log file
    log_files = list(Path(".").rglob("*.log"))
    if not log_files:
        print("No log files found!")
        return

    # Use the most recent log file
    latest_log = sorted(log_files, key=lambda x: x.stat().st_mtime, reverse=True)[0]
    print(f"Using latest log: {latest_log}")

    results = extract_headers_from_log(latest_log)

    if results:
        print(f"\nExtracted {len(results)} requests with headers")

        # Save the results
        output_file = "request_headers.json"
        with open(output_file, "w") as f:
            json.dump(results, f, indent=2)

        print(f"Headers saved to {output_file}")

        # Show a summary
        print("\n=== HEADER SUMMARY ===")
        all_headers = set()
        for result in results:
            all_headers.update(result["headers"].keys())

        print(f"All unique headers found: {sorted(all_headers)}")

        # Show first few results
        for i, result in enumerate(results[:3]):
            print(f"\nRequest {i + 1}:")
            print(f"  Headers: {dict(result['headers'])}")
            print(f"  Body: {result['request_body']}")
    else:
        print("No requests with headers found!")


if __name__ == "__main__":
    main()
