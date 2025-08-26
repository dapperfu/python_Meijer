#!/usr/bin/env python3
"""
Search for refresh token in the POST request context.
"""

from pathlib import Path


def search_refresh_token_in_post(log_path: Path) -> None:
    """Search for refresh token in the POST request context."""

    print("🔍 SEARCHING FOR REFRESH TOKEN IN POST REQUEST...")
    print("=" * 80)

    try:
        with open(log_path, "rb") as f:
            content = f.read()

        # Look for the POST request with refresh_token
        # From the previous search, we know it's around position 1716
        search_start = max(0, 1000)
        search_end = min(len(content), 3000)
        search_content = content[search_start:search_end]

        print(f"Searching in range {search_start} to {search_end}")
        print()

        try:
            search_str = search_content.decode("utf-8", errors="ignore")

            # Look for the refresh token in the POST data
            import re

            # Pattern for POST data with refresh_token
            post_pattern = (
                r"client_id=([^&]+)&grant_type=refresh_token&refresh_token=([^&\s]+)"
            )
            post_match = re.search(post_pattern, search_str)

            if post_match:
                client_id = post_match.group(1)
                refresh_token = post_match.group(2)
                print(f"🎯 REFRESH TOKEN FOUND!")
                print(f"   Client ID: {client_id}")
                print(f"   Refresh Token: {refresh_token}")
                print()

                # Show more context
                print("Full POST data context:")
                print("-" * 50)
                print(search_str)
                print("-" * 50)
            else:
                print("❌ Could not find refresh token in POST data")
                print("Searching for alternative patterns...")

                # Try other patterns
                alt_patterns = [
                    r"refresh_token=([^&\s]+)",
                    r'"refresh_token":\s*"([^"]+)"',
                    r"'refresh_token':\s*'([^']+)'",
                    r'refresh_token["\']?\s*[:=]\s*["\']([^"\']+)["\']',
                ]

                for i, pattern in enumerate(alt_patterns):
                    match = re.search(pattern, search_str)
                    if match:
                        token = match.group(1)
                        print(f"🎯 Found with pattern {i + 1}: {token}")
                        break
                else:
                    print("❌ No refresh token found with any pattern")

        except Exception as e:
            print(f"Error decoding search content: {e}")

    except Exception as e:
        print(f"Error reading log file: {e}")


def search_for_oauth_tokens(log_path: Path) -> None:
    """Search for OAuth tokens in the log file."""

    print(f"\n🔍 SEARCHING FOR OAUTH TOKENS...")
    print("=" * 80)

    try:
        with open(log_path, "rb") as f:
            content = f.read()

        # Look for OAuth token patterns
        oauth_patterns = [
            b"grant_type=refresh_token",
            b"grant_type=authorization_code",
            b"access_token",
            b"refresh_token",
            b"id_token",
        ]

        for pattern in oauth_patterns:
            print(f"\nSearching for: {pattern.decode()}")

            if pattern in content:
                # Find all occurrences
                positions = []
                start = 0
                while True:
                    pos = content.find(pattern, start)
                    if pos == -1:
                        break
                    positions.append(pos)
                    start = pos + 1

                print(f"  ✅ Found {len(positions)} occurrence(s)")

                # Show context for first occurrence
                if positions:
                    pos = positions[0]
                    context_start = max(0, pos - 200)
                    context_end = min(len(content), pos + 400)
                    context = content[context_start:context_end]

                    try:
                        context_str = context.decode("utf-8", errors="ignore")
                        print(f"  First occurrence context:")
                        print(f"    {context_str[:300]}...")
                    except Exception:
                        print(f"  Could not decode context")
            else:
                print(f"  ❌ Not found")

    except Exception as e:
        print(f"Error during OAuth token search: {e}")


def search_for_specific_flow(log_path: Path) -> None:
    """Search for the specific login flow sequence."""

    print(f"\n🔍 SEARCHING FOR LOGIN FLOW SEQUENCE...")
    print("=" * 80)

    try:
        with open(log_path, "rb") as f:
            content = f.read()

        # Look for the sequence: devicefingerprint -> login redirect -> _bm/get_params
        flow_sequence = [
            b"auth/services/devicefingerprint",
            b"login/token/redirect",
            b"_bm/get_params",
        ]

        flow_positions = []
        for pattern in flow_sequence:
            if pattern in content:
                pos = content.find(pattern)
                flow_positions.append((pattern.decode(), pos))
            else:
                flow_positions.append((pattern.decode(), -1))

        print("Login flow sequence analysis:")
        for pattern, pos in flow_positions:
            if pos != -1:
                print(f"  ✅ {pattern}: Position {pos}")

                # Extract context around this position
                context_start = max(0, pos - 100)
                context_end = min(len(content), pos + 300)
                context = content[context_start:context_end]

                try:
                    context_str = context.decode("utf-8", errors="ignore")
                    print(f"    Context: {context_str[:150]}...")
                except Exception:
                    print(f"    Could not decode context")
            else:
                print(f"  ❌ {pattern}: Not found")

    except Exception as e:
        print(f"Error during flow sequence search: {e}")


def main():
    """Main search function."""

    log_file = Path("logs/meijer_mitm_20250826_114803.log")

    if not log_file.exists():
        print(f"Log file not found: {log_file}")
        return

    # Search for refresh token in POST request
    search_refresh_token_in_post(log_file)

    # Search for OAuth tokens
    search_for_oauth_tokens(log_file)

    # Search for login flow sequence
    search_for_specific_flow(log_file)


if __name__ == "__main__":
    main()
