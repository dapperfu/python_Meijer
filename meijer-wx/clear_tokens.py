#!/usr/bin/env python3
"""
Utility script to clear stored Meijer authentication tokens.
"""

import os
import shutil
from pathlib import Path


def clear_meijer_tokens():
    """Clear all stored Meijer authentication tokens."""

    # Common locations where tokens might be stored
    token_locations = [
        # User config directory
        Path.home() / ".config" / "meijer",
        Path.home() / ".meijer",
        # User data directory
        Path.home() / ".local" / "share" / "meijer",
        # Current directory
        Path.cwd() / "tokens",
        Path.cwd() / ".tokens",
    ]

    cleared = False

    for location in token_locations:
        if location.exists():
            try:
                if location.is_file():
                    location.unlink()
                    print(f"Deleted token file: {location}")
                    cleared = True
                elif location.is_dir():
                    shutil.rmtree(location)
                    print(f"Deleted token directory: {location}")
                    cleared = True
            except Exception as e:
                print(f"Error deleting {location}: {e}")

    # Also check for environment variables that might contain tokens
    env_vars = ["MEIJER_TOKEN", "MEIJER_REFRESH_TOKEN", "MEIJER_ACCESS_TOKEN"]
    for var in env_vars:
        if var in os.environ:
            del os.environ[var]
            print(f"Cleared environment variable: {var}")
            cleared = True

    if not cleared:
        print("No stored tokens found to clear.")
    else:
        print("\nToken clearing completed. You may need to re-authenticate.")


if __name__ == "__main__":
    clear_meijer_tokens()
