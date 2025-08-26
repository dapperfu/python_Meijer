#!/usr/bin/env python3
"""
Search specifically for the serversidesignal in the _bm/get_params response.
"""

from pathlib import Path


def search_serversidesignal(log_path: Path) -> None:
    """Search for serversidesignal in the _bm/get_params response."""

    print("🔍 SEARCHING FOR SERVER SIDE SIGNAL...")
    print("=" * 80)

    try:
        with open(log_path, "rb") as f:
            content = f.read()

        # Look for serversidesignal in the content
        signal_positions = []
        start = 0
        while True:
            pos = content.find(b"serversidesignal", start)
            if pos == -1:
                break
            signal_positions.append(pos)
            start = pos + 1

        print(f"Found {len(signal_positions)} serversidesignal occurrences")

        for i, pos in enumerate(signal_positions):
            print(f"\n--- Occurrence {i + 1} at position {pos} ---")

            # Extract context around this position
            context_start = max(0, pos - 200)
            context_end = min(len(content), pos + 500)
            context = content[context_start:context_end]

            try:
                context_str = context.decode("utf-8", errors="ignore")

                # Look for the actual signal value
                import re

                # Try different patterns for serversidesignal
                patterns = [
                    r'serversidesignal["\']?\s*[:=]\s*["\']([^"\']+)["\']',
                    r'serversidesignal\s*[:=]\s*["\']([^"\']+)["\']',
                    r"serversidesignal\s*[:=]\s*([^,\s]+)",
                    r'"serversidesignal":\s*"([^"]+)"',
                    r"'serversidesignal':\s*'([^']+)'",
                ]

                signal_found = False
                for pattern in patterns:
                    match = re.search(pattern, context_str, re.IGNORECASE)
                    if match:
                        signal_value = match.group(1)
                        print(f"🎯 SERVER SIDE SIGNAL FOUND with pattern: {pattern}")
                        print(f"   Value: {signal_value}")
                        signal_found = True
                        break

                if not signal_found:
                    print("❌ Could not extract server side signal value")
                    print("Context:")
                    print(context_str[:300])

            except Exception as e:
                print(f"Error processing occurrence {i + 1}: {e}")

    except Exception as e:
        print(f"Error reading log file: {e}")


def search_for_bm_params_response(log_path: Path) -> None:
    """Search for the _bm/get_params response specifically."""

    print(f"\n🔍 SEARCHING FOR _BM/GET_PARAMS RESPONSE...")
    print("=" * 80)

    try:
        with open(log_path, "rb") as f:
            content = f.read()

        # Look for _bm/get_params in the content
        bm_positions = []
        start = 0
        while True:
            pos = content.find(b"_bm/get_params", start)
            if pos == -1:
                break
            bm_positions.append(pos)
            start = pos + 1

        print(f"Found {len(bm_positions)} _bm/get_params occurrences")

        for i, pos in enumerate(bm_positions):
            print(f"\n--- _bm/get_params occurrence {i + 1} at position {pos} ---")

            # Extract larger context around this position to find the response
            context_start = max(0, pos - 1000)
            context_end = min(len(content), pos + 2000)
            context = content[context_start:context_end]

            try:
                context_str = context.decode("utf-8", errors="ignore")

                # Look for JSON response content
                json_start = context_str.find("{")
                if json_start != -1:
                    json_end = context_str.find("}", json_start)
                    if json_end != -1:
                        json_content = context_str[json_start : json_end + 1]
                        print(f"🎯 JSON RESPONSE FOUND:")
                        print(f"   Content: {json_content}")

                        # Look for serversidesignal in the JSON
                        import re

                        signal_match = re.search(
                            r'serversidesignal["\']?\s*[:=]\s*["\']([^"\']+)["\']',
                            json_content,
                        )
                        if signal_match:
                            signal_value = signal_match.group(1)
                            print(f"🎯 SERVER SIDE SIGNAL in JSON: {signal_value}")
                        else:
                            print("❌ No serversidesignal found in JSON")
                    else:
                        print("❌ Could not find complete JSON response")
                else:
                    print("❌ No JSON response found")
                    print("Context preview:")
                    print(context_str[:500])

            except Exception as e:
                print(f"Error processing occurrence {i + 1}: {e}")

    except Exception as e:
        print(f"Error during _bm/get_params search: {e}")


def main():
    """Main search function."""

    log_file = Path("logs/meijer_mitm_20250826_114803.log")

    if not log_file.exists():
        print(f"Log file not found: {log_file}")
        return

    # Search for serversidesignal
    search_serversidesignal(log_file)

    # Search for _bm/get_params response
    search_for_bm_params_response(log_file)


if __name__ == "__main__":
    main()
