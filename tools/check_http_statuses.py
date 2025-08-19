#!/usr/bin/env python3
"""
Check what HTTP status codes are in the log file.
"""

import re
from collections import Counter
from pathlib import Path


def check_http_statuses():
    """Check what HTTP status codes are in the log file."""
    print("Checking HTTP status codes in log file...")

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

        # Look for the actual status code format used in the log
        # Format: 11:status_code;length:value
        status_pattern = r"11:status_code;(\d+):(\d+)"
        status_matches = re.findall(status_pattern, decoded_content)

        print(f"Found {len(status_matches)} HTTP status codes")

        # Extract the actual status codes
        status_codes = [int(match[1]) for match in status_matches]

        # Count by status
        status_counts = Counter(status_codes)
        print("Status code counts:")
        for status, count in status_counts.most_common():
            print(f"  {status}: {count}")

        # Look for any 200s
        if 200 in status_counts:
            print(f"\nFound {status_counts[200]} successful responses")

            # Show a few examples
            success_positions = [
                m.start()
                for m in re.finditer(r"11:status_code;(\d+):200", decoded_content)
            ]
            for i, pos in enumerate(success_positions[:3]):
                start_pos = max(0, pos - 1000)
                end_pos = min(len(decoded_content), pos + 1000)
                context = decoded_content[start_pos:end_pos]
                print(f"\nSuccess {i+1} at position {pos}:")
                print(f"  Context: {context[:300]}...")
        else:
            print("\nNo 200 responses found")

        # Look for 400s (the error we're getting)
        if 400 in status_counts:
            print(f"\nFound {status_counts[400]} 400 responses")

            # Show a few examples
            error_positions = [
                m.start()
                for m in re.finditer(r"11:status_code;(\d+):400", decoded_content)
            ]
            for i, pos in enumerate(error_positions[:3]):
                start_pos = max(0, pos - 1000)
                end_pos = min(len(decoded_content), pos + 1000)
                context = decoded_content[start_pos:end_pos]
                print(f"\n400 Error {i+1} at position {pos}:")
                print(f"  Context: {context[:300]}...")

        # Look for other common status codes
        for status in [201, 204, 301, 302, 401, 403, 404, 500]:
            if status in status_counts:
                print(f"  {status}: {status_counts[status]}")

    except Exception as e:
        print(f"Error: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    check_http_statuses()
