#!/usr/bin/env python3
"""
Find successful reservationslots requests and extract their exact format.
"""

import re
from pathlib import Path


def find_successful_reservationslots():
    """Find successful reservationslots requests."""
    print("Looking for successful reservationslots requests...")

    # Find the most recent log file
    log_files = list(Path(".").rglob("*.log"))
    if not log_files:
        print("No log files found!")
        return

    latest_log = sorted(log_files, key=lambda x: x.stat().st_mtime, reverse=True)[0]
    print(f"Using log: {latest_log}")

    try:
        with open(latest_log, "rb") as f:
            content = f.read()

        try:
            decoded_content = content.decode("utf-8", errors="ignore")
        except UnicodeDecodeError:
            decoded_content = content.decode("latin-1", errors="ignore")

        # Look for successful reservationslots requests (200 or 204)
        success_patterns = [
            r"11:status_code;(\d+):200.*?reservationslots",
            r"11:status_code;(\d+):204.*?reservationslots",
        ]

        successful_requests = []

        for pattern in success_patterns:
            matches = re.finditer(pattern, decoded_content, re.DOTALL)
            for match in matches:
                status_pos = match.start()
                print("\n=== Successful Reservationslots Request ===")
                print(f"Position: {status_pos}")
                print(f"Status: {match.group(1)}")

                # Get context around this success
                start_pos = max(0, status_pos - 3000)
                end_pos = min(len(decoded_content), status_pos + 3000)
                context = decoded_content[start_pos:end_pos]

                # Look for the request section
                request_section = re.search(r"7:request;([^}]+)", context)
                if request_section:
                    request_content = request_section.group(1)
                    print("Request section found")

                    # Look for method
                    method_match = re.search(r"6:method;(\d+):([^,]+)", request_content)
                    if method_match:
                        method_length = int(method_match.group(1))
                        method_value = method_match.group(2)
                        if len(method_value) >= method_length:
                            actual_method = method_value[:method_length]
                            print(f"  Method: {actual_method}")

                    # Look for path
                    path_match = re.search(r"4:path;(\d+):([^,]+)", request_content)
                    if path_match:
                        path_length = int(path_match.group(1))
                        path_value = path_match.group(2)
                        if len(path_value) >= path_length:
                            actual_path = path_value[:path_length]
                            print(f"  Path: {actual_path}")

                # Look for headers section
                headers_section = re.search(r"7:headers;([^}]+)", context)
                if headers_section:
                    header_content = headers_section.group(1)
                    print("  Headers section found")
                    print(f"  Raw headers: {header_content[:300]}...")

                    # Parse the header format: key_length:key,value_length:value
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
                else:
                    print("  No headers section found")

                # Look for content section
                content_section = re.search(r"7:content;(\d+):(\{[^}]+\})", context)
                if content_section:
                    content_length = content_section.group(1)
                    content_value = content_section.group(2)
                    print(f"  Content length: {content_length}")
                    print(f"  Content: {content_value}")
                else:
                    print("  No content section found")

                # Look for response section
                response_section = re.search(r"7:response;([^}]+)", context)
                if response_section:
                    response_content = response_section.group(1)
                    print("  Response section found")
                    print(f"  Response: {response_content[:200]}...")

                successful_requests.append(
                    {
                        "position": status_pos,
                        "status": match.group(1),
                        "context": context,
                    }
                )

                # Limit to first few to avoid overwhelming output
                if len(successful_requests) >= 3:
                    break

        if successful_requests:
            print("\n=== SUMMARY ===")
            print(
                f"Found {len(successful_requests)} successful reservationslots requests"
            )
        else:
            print("\nNo successful reservationslots requests found")

            # Look for any reservationslots requests regardless of status
            all_slots_pattern = r"reservationslots"
            all_slots_matches = list(re.finditer(all_slots_pattern, decoded_content))
            print(f"Total reservationslots mentions: {len(all_slots_matches)}")

            if all_slots_matches:
                print("Looking at first few reservationslots mentions...")
                for i, match in enumerate(all_slots_matches[:3]):
                    start_pos = max(0, match.start() - 1000)
                    end_pos = min(len(decoded_content), match.end() + 1000)
                    context = decoded_content[start_pos:end_pos]

                    # Look for status code near this mention
                    status_match = re.search(r"11:status_code;(\d+):(\d+)", context)
                    if status_match:
                        status_code = status_match.group(2)
                        print(f"  Mention {i+1}: Status {status_code}")
                    else:
                        print(f"  Mention {i+1}: No status code found")

    except Exception as e:
        print(f"Error processing log: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    find_successful_reservationslots()
