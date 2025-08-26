#!/usr/bin/env python3
"""
Extract the exact headers from the working reservationslots request.
"""

import re
from pathlib import Path


def extract_working_headers():
    """Extract headers from the working reservationslots request."""
    print("Extracting headers from working reservationslots request...")

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

        # Look for the specific pattern that shows the working request
        # From the logs, I can see the pattern: 7:headers;... followed by request details
        # The working request shows: 7:headers;1795:29:6:accept,16:application/json,1275:13:authorization,1252:Bearer...

        # Look for the authorization header pattern
        auth_pattern = r"13:authorization,(\d+):Bearer\s+([A-Za-z0-9\-_\.]+)"
        auth_matches = re.findall(auth_pattern, decoded_content)

        if auth_matches:
            print(f"Found {len(auth_matches)} authorization headers")

            # Look for the context around the first match
            first_match = auth_matches[0]
            auth_length = int(first_match[0])
            auth_value = first_match[1]

            # Find the position of this match
            auth_pos = decoded_content.find(
                f"13:authorization,{auth_length}:Bearer {auth_value}"
            )

            if auth_pos != -1:
                # Get context around this position
                start_pos = max(0, auth_pos - 1000)
                end_pos = min(len(decoded_content), auth_pos + 1000)
                context = decoded_content[start_pos:end_pos]

                print("\nContext around authorization header:")
                print(f"Position: {auth_pos}")
                print(f"Auth length: {auth_length}")
                print(f"Auth value: {auth_value[:50]}...")

                # Look for the headers section
                headers_section = re.search(r"7:headers;([^}]+)", context)
                if headers_section:
                    header_content = headers_section.group(1)
                    print("\nHeaders section found:")
                    print(f"Raw headers: {header_content}")

                    # Parse the header format: key_length:key,value_length:value
                    header_pairs = re.findall(
                        r"(\d+):([^,]+),(\d+):([^,]+)", header_content
                    )

                    print("\nParsed headers:")
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
                                    print(f"  {actual_key}: {actual_value}")
                        except (ValueError, IndexError):
                            continue
                else:
                    print("No headers section found in context")
            else:
                print("Could not find authorization header position")
        else:
            print("No authorization headers found")

            # Try a different approach - look for the request pattern
            request_pattern = r"7:request;([^}]+)"
            request_matches = re.findall(request_pattern, decoded_content)

            if request_matches:
                print(f"\nFound {len(request_matches)} request sections")

                # Look at the first few request sections
                for i, request_section in enumerate(request_matches[:3]):
                    print(f"\nRequest section {i + 1}:")
                    print(f"Raw: {request_section[:200]}...")

                    # Look for path information
                    path_match = re.search(r"4:path;(\d+):([^,]+)", request_section)
                    if path_match:
                        path_length = int(path_match.group(1))
                        path_value = path_match.group(2)
                        if len(path_value) >= path_length:
                            actual_path = path_value[:path_length]
                            print(f"  Path: {actual_path}")

                    # Look for method
                    method_match = re.search(r"6:method;(\d+):([^,]+)", request_section)
                    if method_match:
                        method_length = int(method_match.group(1))
                        method_value = method_match.group(2)
                        if len(method_value) >= method_length:
                            actual_method = method_value[:method_length]
                            print(f"  Method: {actual_method}")

    except Exception as e:
        print(f"Error processing log: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    extract_working_headers()
