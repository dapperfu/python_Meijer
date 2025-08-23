#!/usr/bin/env python3
"""
Script to test UPC edge cases with Shop & Scan functionality.

Usage:
    python scripts/test_upc_edge_cases.py                    # Interactive mode
    python scripts/test_upc_edge_cases.py 713733252843      # Test specific UPC
    python scripts/test_upc_edge_cases.py --all             # Test all UPCs
    python scripts/test_upc_edge_cases.py --status          # Check authentication status
"""

import argparse
import sys
from pathlib import Path

# Add the project root to the path
project_root = Path(__file__).parent.parent
sys.path.insert(0, str(project_root))

from demos.upc_edge_case_demo import UPCEdgeCaseDemo
from meijer.client import Meijer


def check_auth_status():
    """Check and display authentication status."""
    try:
        meijer = Meijer()
        if meijer.is_authenticated():
            print("✓ Meijer client is authenticated")
            print("  You can run live UPC tests")
            return True
        else:
            print("✗ Meijer client is not authenticated")
            print("  Please authenticate first using:")
            print("    python -m meijer.cli.main auth")
            print("    or")
            print("    python demos/auth_demo.py")
            return False
    except Exception as e:
        print(f"✗ Error checking authentication: {e}")
        return False


def main():
    """Main function to run UPC edge case tests."""
    parser = argparse.ArgumentParser(description="Test UPC edge cases with Shop & Scan")
    parser.add_argument("upc", nargs="?", help="Specific UPC to test")
    parser.add_argument("--all", action="store_true", help="Test all UPCs")
    parser.add_argument("--status", action="store_true", help="Check authentication status")
    
    args = parser.parse_args()
    
    if args.status:
        check_auth_status()
        return
    
    # Check authentication first
    if not check_auth_status():
        print("\nCannot run tests without authentication.")
        return
    
    # Create demo instance
    try:
        meijer = Meijer()
        demo = UPCEdgeCaseDemo(meijer)
    except Exception as e:
        print(f"Error creating demo instance: {e}")
        return
    
    if args.all:
        # Run all UPC tests
        demo.run_all_upc_tests()
    elif args.upc:
        # Test specific UPC
        if args.upc in demo.test_upcs:
            demo.run_upc_test(args.upc)
        else:
            print(f"Unknown UPC: {args.upc}")
            print("Available UPCs:")
            for upc_code in demo.test_upcs.keys():
                print(f"  {upc_code}")
    else:
        # Interactive mode
        demo.interactive_test()


if __name__ == "__main__":
    main()
