#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Authentication status checker script for Meijer Price Monitor
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package
 */

Authentication status checker for Meijer Price Monitor.

This script checks if the user is authenticated with the Meijer API
and provides appropriate feedback for the Makefile auth-status target.
"""

import sys
from typing import NoReturn


def check_authentication() -> None:
    """
    Check Meijer authentication status and print results.
    
    This function attempts to import the Meijer client and check
    authentication status, providing user-friendly feedback.
    """
    try:
        from meijer.client import Meijer
        meijer = Meijer()
        
        if meijer.is_authenticated():
            print("✅ Authenticated with Meijer")
            print("   You can use all price monitoring features")
        else:
            print("❌ Not authenticated with Meijer")
            print("   Run 'make auth login' to authenticate")
            
    except ImportError:
        print("❌ Meijer API not available")
        print("   Make sure the core Meijer API is installed")
        print("   The API should be available in the parent directory")
        
    except Exception as e:
        print(f"❌ Error checking authentication: {e}")
        print("   This might indicate a configuration issue")


def main() -> NoReturn:
    """Main entry point for the authentication checker."""
    check_authentication()
    sys.exit(0)


if __name__ == "__main__":
    main()
