#!/usr/bin/env python3
"""
Extract specific context around tokens and endpoints found in the log file.
"""

from pathlib import Path


def extract_refresh_token_context(log_path: Path) -> None:
    """Extract the context around the refresh token."""

    print("🔍 EXTRACTING REFRESH TOKEN CONTEXT...")
    print("=" * 80)

    try:
        with open(log_path, "rb") as f:
            content = f.read()

        # Position where refresh_token was found
        refresh_pos = 1716

        # Extract larger context around the refresh token
        context_start = max(0, refresh_pos - 500)
        context_end = min(len(content), refresh_pos + 1000)
        context = content[context_start:context_end]

        print(f"Refresh token found at position {refresh_pos}")
        print(f"Extracting context from {context_start} to {context_end}")
        print()

        try:
            context_str = context.decode("utf-8", errors="ignore")
            print("Context around refresh token:")
            print("-" * 50)
            print(context_str)
            print("-" * 50)

            # Look for the actual refresh token value
            import re

            refresh_match = re.search(r"refresh_token=([^&\s]+)", context_str)
            if refresh_match:
                refresh_token = refresh_match.group(1)
                print(f"\n🎯 REFRESH TOKEN FOUND: {refresh_token}")
            else:
                print("\n❌ Could not extract refresh token value")

        except Exception as e:
            print(f"Error decoding context: {e}")

    except Exception as e:
        print(f"Error reading log file: {e}")


def extract_device_fingerprint_context(log_path: Path) -> None:
    """Extract context around device fingerprint endpoint."""

    print(f"\n🔍 EXTRACTING DEVICE FINGERPRINT CONTEXT...")
    print("=" * 80)

    try:
        with open(log_path, "rb") as f:
            content = f.read()

        # Position where device fingerprint was found
        device_pos = 17303

        # Extract context around device fingerprint
        context_start = max(0, device_pos - 300)
        context_end = min(len(content), device_pos + 800)
        context = content[context_start:context_end]

        print(f"Device fingerprint found at position {device_pos}")
        print(f"Extracting context from {context_start} to {context_end}")
        print()

        try:
            context_str = context.decode("utf-8", errors="ignore")
            print("Context around device fingerprint:")
            print("-" * 50)
            print(context_str)
            print("-" * 50)

        except Exception as e:
            print(f"Error decoding context: {e}")

    except Exception as e:
        print(f"Error reading log file: {e}")


def extract_login_redirect_context(log_path: Path) -> None:
    """Extract context around login token redirect."""

    print(f"\n🔍 EXTRACTING LOGIN TOKEN REDIRECT CONTEXT...")
    print("=" * 80)

    try:
        with open(log_path, "rb") as f:
            content = f.read()

        # Position where login redirect was found
        login_pos = 467014

        # Extract context around login redirect
        context_start = max(0, login_pos - 300)
        context_end = min(len(content), login_pos + 800)
        context = content[context_start:context_end]

        print(f"Login token redirect found at position {login_pos}")
        print(f"Extracting context from {context_start} to {context_end}")
        print()

        try:
            context_str = context.decode("utf-8", errors="ignore")
            print("Context around login token redirect:")
            print("-" * 50)
            print(context_str)
            print("-" * 50)

            # Look for stateToken
            import re

            state_match = re.search(r"stateToken=([^&\s,]+)", context_str)
            if state_match:
                state_token = state_match.group(1)
                print(f"\n🎯 STATE TOKEN FOUND: {state_token}")
            else:
                print("\n❌ Could not extract state token value")

        except Exception as e:
            print(f"Error decoding context: {e}")

    except Exception as e:
        print(f"Error reading log file: {e}")


def extract_bm_params_context(log_path: Path) -> None:
    """Extract context around _bm/get_params endpoint."""

    print(f"\n🔍 EXTRACTING BM PARAMS CONTEXT...")
    print("=" * 80)

    try:
        with open(log_path, "rb") as f:
            content = f.read()

        # Position where _bm/get_params was found
        bm_pos = 489164

        # Extract context around _bm/get_params
        context_start = max(0, bm_pos - 300)
        context_end = min(len(content), bm_pos + 800)
        context = content[context_start:context_end]

        print(f"_bm/get_params found at position {bm_pos}")
        print(f"Extracting context from {context_start} to {context_end}")
        print()

        try:
            context_str = context.decode("utf-8", errors="ignore")
            print("Context around _bm/get_params:")
            print("-" * 50)
            print(context_str)
            print("-" * 50)

            # Look for serversidesignal
            import re

            signal_match = re.search(
                r'serversidesignal["\']?\s*[:=]\s*["\']([^"\']+)["\']', context_str
            )
            if signal_match:
                signal = signal_match.group(1)
                print(f"\n🎯 SERVER SIDE SIGNAL FOUND: {signal[:100]}...")
            else:
                print("\n❌ Could not extract server side signal")

        except Exception as e:
            print(f"Error decoding context: {e}")

    except Exception as e:
        print(f"Error reading log file: {e}")


def main():
    """Main extraction function."""

    log_file = Path("logs/meijer_mitm_20250826_114803.log")

    if not log_file.exists():
        print(f"Log file not found: {log_file}")
        return

    # Extract context around each key finding
    extract_refresh_token_context(log_file)
    extract_device_fingerprint_context(log_file)
    extract_login_redirect_context(log_file)
    extract_bm_params_context(log_file)


if __name__ == "__main__":
    main()
