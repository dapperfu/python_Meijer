#!/usr/bin/env python3
"""
Extract the complete login sequence including all headers, cookies, and 2FA flow.
This tool captures the entire authentication workflow from start to finish.
"""

import json
import re
from pathlib import Path


def extract_complete_login_sequence():
    """Extract the complete login sequence with headers, cookies, and 2FA."""

    # Find the current log file
    log_dir = Path("logs")
    log_files = list(log_dir.glob("*.log"))
    log_files.sort(key=lambda x: x.stat().st_mtime, reverse=True)

    if not log_files:
        print("❌ No log files found")
        return

    current_log = log_files[0]
    print(f"🔍 Extracting complete login sequence from: {current_log}")

    try:
        # Read the binary log file
        with open(current_log, "rb") as f:
            content = f.read()

        print(f"📊 Log file size: {len(content):,} bytes")

        # Convert to string for pattern matching
        content_str = content.decode("utf-8", errors="ignore")

        # Find the complete login sequence
        print("\n🔍 Searching for complete login sequence...")

        # Look for the full authentication flow
        login_sequence = []

        # 1. Initial landing on Meijer
        meijer_landing = re.finditer(r"GET.*meijer\.com.*HTTP", content_str)
        for match in meijer_landing:
            start_pos = max(0, match.start() - 200)
            end_pos = min(len(content_str), match.end() + 500)
            context = content_str[start_pos:end_pos]
            login_sequence.append(
                {
                    "type": "meijer_landing",
                    "position": match.start(),
                    "context": context.strip(),
                }
            )

        # 2. OAuth redirect to id.meijer.com
        oauth_redirects = re.finditer(r"GET.*id\.meijer\.com.*HTTP", content_str)
        for match in oauth_redirects:
            start_pos = max(0, match.start() - 200)
            end_pos = min(len(content_str), match.end() + 500)
            context = content_str[start_pos:end_pos]
            login_sequence.append(
                {
                    "type": "oauth_redirect",
                    "position": match.start(),
                    "context": context.strip(),
                }
            )

        # 3. Username submission
        username_submissions = re.finditer(r"POST.*username.*HTTP", content_str)
        for match in username_submissions:
            start_pos = max(0, match.start() - 200)
            end_pos = min(len(content_str), match.end() + 500)
            context = content_str[start_pos:end_pos]
            login_sequence.append(
                {
                    "type": "username_submission",
                    "position": match.start(),
                    "context": context.strip(),
                }
            )

        # 4. Password submission
        password_submissions = re.finditer(r"POST.*password.*HTTP", content_str)
        for match in password_submissions:
            start_pos = max(0, match.start() - 200)
            end_pos = min(len(content_str), match.end() + 500)
            context = content_str[start_pos:end_pos]
            login_sequence.append(
                {
                    "type": "password_submission",
                    "position": match.start(),
                    "context": context.strip(),
                }
            )

        # 5. 2FA challenge
        challenge_events = re.finditer(r"challenge.*email", content_str)
        for match in challenge_events:
            start_pos = max(0, match.start() - 200)
            end_pos = min(len(content_str), match.end() + 500)
            context = content_str[start_pos:end_pos]
            login_sequence.append(
                {
                    "type": "2fa_challenge",
                    "position": match.start(),
                    "context": context.strip(),
                }
            )

        # 6. 2FA verification code submission
        verification_submissions = re.finditer(
            r"POST.*challenge.*answer.*HTTP", content_str
        )
        for match in verification_submissions:
            start_pos = max(0, match.start() - 200)
            end_pos = min(len(content_str), match.end() + 500)
            context = content_str[start_pos:end_pos]
            login_sequence.append(
                {
                    "type": "2fa_verification",
                    "position": match.start(),
                    "context": context.strip(),
                }
            )

        # 7. Final success/redirect
        success_events = re.finditer(r"302.*Location.*meijer\.com", content_str)
        for match in success_events:
            start_pos = max(0, match.start() - 200)
            end_pos = min(len(content_str), match.end() + 500)
            context = content_str[start_pos:end_pos]
            login_sequence.append(
                {
                    "type": "success_redirect",
                    "position": match.start(),
                    "context": context.strip(),
                }
            )

        # Sort by position to get chronological order
        login_sequence.sort(key=lambda x: x["position"])

        print(f"\n✅ Found {len(login_sequence)} login sequence events")

        # Extract all cookies and headers from the sequence
        all_cookies = set()
        all_headers = set()

        for event in login_sequence:
            # Extract cookies
            cookies = re.findall(r"Cookie: ([^\r\n]+)", event["context"])
            for cookie in cookies:
                all_cookies.add(cookie.strip())

            # Extract headers
            headers = re.findall(r"([A-Za-z-]+): ([^\r\n]+)", event["context"])
            for header_name, header_value in headers:
                all_headers.add(f"{header_name}: {header_value}")

        # Save detailed analysis
        analysis_file = "login_sequence_analysis.json"
        with open(analysis_file, "w") as f:
            json.dump(
                {
                    "log_file": str(current_log),
                    "total_events": len(login_sequence),
                    "login_sequence": login_sequence,
                    "all_cookies": list(all_cookies),
                    "all_headers": list(all_headers),
                },
                f,
                indent=2,
            )

        print(f"\n📁 Detailed analysis saved to: {analysis_file}")

        # Print summary
        print("\n📋 Login Sequence Summary:")
        for i, event in enumerate(login_sequence):
            print(f"  {i + 1}. {event['type']} (pos: {event['position']:,})")

        print(f"\n🍪 Cookies Found: {len(all_cookies)}")
        for cookie in sorted(all_cookies)[:10]:  # Show first 10
            print(f"  - {cookie}")

        print(f"\n📋 Headers Found: {len(all_headers)}")
        for header in sorted(all_headers)[:10]:  # Show first 10
            print(f"  - {header}")

        if len(all_cookies) > 10:
            print(f"  ... and {len(all_cookies) - 10} more cookies")
        if len(all_headers) > 10:
            print(f"  ... and {len(all_headers) - 10} more headers")

    except Exception as e:
        print(f"❌ Error analyzing log file: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    extract_complete_login_sequence()
