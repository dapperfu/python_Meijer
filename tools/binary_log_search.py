#!/usr/bin/env python3
"""
Search binary mitmproxy log file for specific endpoints and tokens.
"""

from pathlib import Path


def search_binary_log(log_path: Path) -> None:
    """Search binary log file for specific patterns."""

    print(f"🔍 Searching binary log file: {log_path}")
    print("=" * 80)

    # Search for the specific endpoints mentioned in the query
    search_patterns = [
        b"auth/services/devicefingerprint",
        b"login/token/redirect",
        b"_bm/get_params",
        b"refresh_token",
        b"stateToken=",
        b"serversidesignal",
    ]

    found_patterns = {pattern.decode(): [] for pattern in search_patterns}

    try:
        with open(log_path, "rb") as f:
            chunk_size = 1024 * 1024  # 1MB chunks
            line_number = 0

            while True:
                chunk = f.read(chunk_size)
                if not chunk:
                    break

                # Look for patterns in this chunk
                for pattern in search_patterns:
                    if pattern in chunk:
                        # Find all occurrences in this chunk
                        start = 0
                        while True:
                            pos = chunk.find(pattern, start)
                            if pos == -1:
                                break

                            # Extract context around the pattern
                            context_start = max(0, pos - 200)
                            context_end = min(len(chunk), pos + 300)
                            context = chunk[context_start:context_end]

                            try:
                                context_str = context.decode("utf-8", errors="ignore")
                                pattern_str = pattern.decode()

                                found_patterns[pattern_str].append(
                                    {
                                        "position": pos,
                                        "context": context_str,
                                        "line_approx": line_number,
                                    }
                                )

                                print(f"🎯 Found '{pattern_str}' at position {pos}")
                                print(f"   Context: {context_str[:200]}...")
                                print()

                            except Exception as e:
                                print(f"Error processing pattern {pattern}: {e}")

                            start = pos + 1

                line_number += chunk_size // 100  # Approximate line count

    except Exception as e:
        print(f"Error reading log file: {e}")

    # Summary of findings
    print("\n📊 SEARCH SUMMARY:")
    print("=" * 80)

    for pattern, findings in found_patterns.items():
        print(f"\n{pattern}:")
        if findings:
            print(f"  ✅ Found {len(findings)} occurrence(s)")
            for i, finding in enumerate(findings[:3]):  # Show first 3
                print(
                    f"    {i + 1}. Position: {finding['position']}, Line: ~{finding['line_approx']}"
                )
                print(f"       Context: {finding['context'][:100]}...")
        else:
            print("  ❌ Not found")


def search_for_specific_urls(log_path: Path) -> None:
    """Search for the specific URLs mentioned in the user query."""

    print("\n🔍 SEARCHING FOR SPECIFIC URLS...")
    print("=" * 80)

    target_urls = [
        b"https://id.meijer.com/auth/services/devicefingerprint",
        b"https://id.meijer.com/login/token/redirect",
        b"https://id.meijer.com/_bm/get_params",
    ]

    for url in target_urls:
        print(f"\nSearching for: {url.decode()}")

        try:
            with open(log_path, "rb") as f:
                content = f.read()

            if url in content:
                # Find all occurrences
                positions = []
                start = 0
                while True:
                    pos = content.find(url, start)
                    if pos == -1:
                        break
                    positions.append(pos)
                    start = pos + 1

                print(f"  ✅ Found {len(positions)} occurrence(s)")

                # Show context for first occurrence
                if positions:
                    pos = positions[0]
                    context_start = max(0, pos - 100)
                    context_end = min(len(content), pos + 400)
                    context = content[context_start:context_end]

                    try:
                        context_str = context.decode("utf-8", errors="ignore")
                        print("  First occurrence context:")
                        print(f"    {context_str[:300]}...")
                    except Exception:
                        print("  Could not decode context")
            else:
                print("  ❌ Not found")

        except Exception as e:
            print(f"  Error searching: {e}")


def search_for_tokens_in_context(log_path: Path) -> None:
    """Search for tokens in the context of id.meijer.com requests."""

    print("\n🔍 SEARCHING FOR TOKENS IN ID.MEIJER.COM CONTEXT...")
    print("=" * 80)

    try:
        with open(log_path, "rb") as f:
            content = f.read()

        # Look for id.meijer.com in the content
        id_meijer_positions = []
        start = 0
        while True:
            pos = content.find(b"id.meijer.com", start)
            if pos == -1:
                break
            id_meijer_positions.append(pos)
            start = pos + 1

        print(f"Found {len(id_meijer_positions)} id.meijer.com references")

        # Look for tokens near these positions
        token_patterns = [
            b"refresh_token",
            b"access_token",
            b"id_token",
            b"stateToken",
            b"serversidesignal",
        ]

        for i, pos in enumerate(id_meijer_positions[:10]):  # Check first 10
            print(f"\nChecking position {i + 1}: {pos}")

            # Look for tokens in a window around this position
            window_start = max(0, pos - 500)
            window_end = min(len(content), pos + 500)
            window = content[window_start:window_end]

            tokens_found = []
            for pattern in token_patterns:
                if pattern in window:
                    tokens_found.append(pattern.decode())

            if tokens_found:
                print(f"  🎯 Tokens found: {tokens_found}")
                try:
                    window_str = window.decode("utf-8", errors="ignore")
                    print(f"  Context: {window_str[:200]}...")
                except Exception:
                    print("  Could not decode context")
            else:
                print("  No tokens found in window")

    except Exception as e:
        print(f"Error during token search: {e}")


def main():
    """Main search function."""

    log_file = Path("logs/meijer_mitm_20250826_114803.log")

    if not log_file.exists():
        print(f"Log file not found: {log_file}")
        return

    # Search for patterns
    search_binary_log(log_file)

    # Search for specific URLs
    search_for_specific_urls(log_file)

    # Search for tokens in context
    search_for_tokens_in_context(log_file)


if __name__ == "__main__":
    main()
