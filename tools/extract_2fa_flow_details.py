#!/usr/bin/env python3
"""
Extract detailed 2FA flow details around the critical 2FA challenge point.
This tool focuses on the specific authentication sequence to examine cookies and headers.
"""

import json
import re
from pathlib import Path


def extract_2fa_flow_details():
    """Extract detailed 2FA flow details around the critical point."""

    # Find the current log file
    log_dir = Path("logs")
    log_files = list(log_dir.glob("*.log"))
    log_files.sort(key=lambda x: x.stat().st_mtime, reverse=True)

    if not log_files:
        print("❌ No log files found")
        return

    current_log = log_files[0]
    print(f"🔍 Extracting 2FA flow details from: {current_log}")

    try:
        # Read the binary log file
        with open(current_log, "rb") as f:
            content = f.read()

        print(f"📊 Log file size: {len(content):,} bytes")

        # Convert to string for pattern matching
        content_str = content.decode("utf-8", errors="ignore")

        # Find the 2FA challenge point (we know it's around position 2,137,735)
        print("\n🔍 Searching for 2FA challenge point...")

        challenge_pattern = r"challenge.*email"
        challenge_matches = list(re.finditer(challenge_pattern, content_str))

        if not challenge_matches:
            print("❌ No 2FA challenge found")
            return

        # Focus on the first 2FA challenge
        challenge_pos = challenge_matches[0].start()
        print(f"✅ Found 2FA challenge at position: {challenge_pos:,}")

        # Extract a larger context around the 2FA challenge
        context_start = max(0, challenge_pos - 2000)
        context_end = min(len(content_str), challenge_pos + 3000)
        challenge_context = content_str[context_start:context_end]

        print(
            f"\n📋 2FA Challenge Context (positions {context_start:,} to {context_end:,}):"
        )
        print("=" * 80)
        print(challenge_context)
        print("=" * 80)

        # Now look for the complete authentication sequence around this point
        print("\n🔍 Searching for complete authentication sequence...")

        # Look for username/password submissions before the 2FA challenge
        username_pattern = r"POST.*username.*HTTP"
        password_pattern = r"POST.*password.*HTTP"

        # Search in the range before the 2FA challenge
        search_start = max(0, challenge_pos - 10000)
        search_end = challenge_pos

        pre_challenge_content = content_str[search_start:search_end]

        username_matches = list(re.finditer(username_pattern, pre_challenge_content))
        password_matches = list(re.finditer(password_pattern, pre_challenge_content))

        print(f"📝 Username submissions found: {len(username_matches)}")
        print(f"🔐 Password submissions found: {len(password_matches)}")

        # Extract the authentication sequence
        auth_sequence = []

        # Add username submission if found
        if username_matches:
            username_pos = search_start + username_matches[-1].start()
            username_context = content_str[
                max(0, username_pos - 500) : username_pos + 1000
            ]
            auth_sequence.append(
                {
                    "type": "username_submission",
                    "position": username_pos,
                    "context": username_context,
                }
            )

        # Add password submission if found
        if password_matches:
            password_pos = search_start + password_matches[-1].start()
            password_context = content_str[
                max(0, password_pos - 500) : password_pos + 1000
            ]
            auth_sequence.append(
                {
                    "type": "password_submission",
                    "position": password_pos,
                    "context": password_context,
                }
            )

        # Add 2FA challenge
        auth_sequence.append(
            {
                "type": "2fa_challenge",
                "position": challenge_pos,
                "context": challenge_context,
            }
        )

        # Look for 2FA verification after the challenge
        verification_pattern = r"POST.*challenge.*answer.*HTTP"
        post_challenge_content = content_str[challenge_pos : challenge_pos + 10000]
        verification_matches = list(
            re.finditer(verification_pattern, post_challenge_content)
        )

        if verification_matches:
            verification_pos = challenge_pos + verification_matches[0].start()
            verification_context = content_str[
                verification_pos - 500 : verification_pos + 1000
            ]
            auth_sequence.append(
                {
                    "type": "2fa_verification",
                    "position": verification_pos,
                    "context": verification_context,
                }
            )
            print(f"✅ 2FA verification found at position: {verification_pos:,}")
        else:
            print("❌ 2FA verification not found")

        # Extract all cookies and headers from the authentication sequence
        all_cookies = set()
        all_headers = set()

        for event in auth_sequence:
            # Extract cookies
            cookies = re.findall(r"Cookie: ([^\r\n]+)", event["context"])
            for cookie in cookies:
                all_cookies.add(cookie.strip())

            # Extract headers
            headers = re.findall(r"([A-Za-z-]+): ([^\r\n]+)", event["context"])
            for header_name, header_value in headers:
                all_headers.add(f"{header_name}: {header_value}")

        # Save detailed analysis
        analysis_file = "2fa_flow_details.json"
        with open(analysis_file, "w") as f:
            json.dump(
                {
                    "log_file": str(current_log),
                    "2fa_challenge_position": challenge_pos,
                    "authentication_sequence": auth_sequence,
                    "all_cookies": list(all_cookies),
                    "all_headers": list(all_headers),
                },
                f,
                indent=2,
            )

        print(f"\n📁 Detailed 2FA analysis saved to: {analysis_file}")

        # Print summary
        print("\n📋 Authentication Sequence Summary:")
        for i, event in enumerate(auth_sequence):
            print(f"  {i + 1}. {event['type']} (pos: {event['position']:,})")

        print(f"\n🍪 Cookies Found: {len(all_cookies)}")
        for cookie in sorted(all_cookies):
            print(f"  - {cookie}")

        print(f"\n📋 Headers Found: {len(all_headers)}")
        for header in sorted(all_headers):
            print(f"  - {header}")

    except Exception as e:
        print(f"❌ Error analyzing log file: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    extract_2fa_flow_details()
