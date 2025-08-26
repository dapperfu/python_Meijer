#!/usr/bin/env python3
"""
Meijer Login CLI

Simple command-line interface for authenticating with Meijer using OKTA IDX.
"""

import argparse
import sys
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, str(Path(__file__).parent))

try:
    from meijer.okta_idx_auth import perform_login_and_save
except ImportError as e:
    print(f"❌ Import error: {e}")
    print("Make sure you're running this from the project root directory")
    sys.exit(1)


def main():
    """Main CLI function."""
    parser = argparse.ArgumentParser(
        description="Meijer OKTA IDX Authentication CLI",
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
Examples:
  # Login using requests method (default)
  python meijer_login.py

           # Login using Selenium method
         python meijer_login.py --method selenium
         
         # Login using hybrid method (browser + requests)
         python meijer_login.py --method hybrid
         
         # Login using hybrid method in headless mode
         python meijer_login.py --method hybrid --headless

  # Save tokens to custom file
  python meijer_login.py --output my_tokens.json

  # Verbose output
  python meijer_login.py --verbose
        """,
    )

    parser.add_argument(
        "--method",
        "-m",
        choices=["requests", "selenium", "hybrid"],
        default="requests",
        help="Authentication method (default: requests)",
    )

    parser.add_argument(
        "--headless",
        action="store_true",
        help="Run browser in headless mode (only applies to selenium/hybrid methods)",
    )

    parser.add_argument(
        "--output",
        "-o",
        default="auth.json",
        help="Output file for authentication tokens (default: auth.json)",
    )

    parser.add_argument(
        "--verbose", "-v", action="store_true", help="Enable verbose output"
    )

    args = parser.parse_args()

    if args.verbose:
        print("🔧 Configuration:")
        print(f"   Method: {args.method}")
        print(f"   Output: {args.output}")
        print()

    print("🔐 Starting Meijer authentication...")
    print(f"📁 Tokens will be saved to: {args.output}")
    print()

    try:
        # For hybrid method, we need to handle headless flag
        if args.method == "hybrid" and args.headless:
            print(
                "⚠️  Note: Using headless mode for hybrid method (less debugging info)"
            )

        success = perform_login_and_save(
            args.method, args.output, headless=args.headless
        )

        if success:
            print(f"\n✅ Login successful! Tokens saved to {args.output}")
            sys.exit(0)
        else:
            print("\n❌ Login failed. Check your credentials and try again.")
            sys.exit(1)

    except KeyboardInterrupt:
        print("\n\n⏹️  Login interrupted by user")
        sys.exit(1)
    except Exception as e:
        print(f"\n❌ Unexpected error: {e}")
        sys.exit(1)


if __name__ == "__main__":
    main()
