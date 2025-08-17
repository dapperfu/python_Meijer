#!/usr/bin/env python3
"""
Meijer Authentication CLI

Simple command-line interface for updating authentication tokens.
Usage: python meijer_auth_cli.py [log_file]
"""

import sys
from pathlib import Path
from meijer_auth import extract_tokens_from_log, extract_tokens_from_analysis_report, update_config


def main():
    """Main CLI function."""
    # Default log file if none provided
    log_file = sys.argv[1] if len(sys.argv) > 1 else "meijer_mitm.log"
    
    # Check if log file exists
    if not Path(log_file).exists():
        print(f"Error: Log file '{log_file}' not found", file=sys.stderr)
        sys.exit(1)
    
    # Try to extract tokens from log file
    tokens = extract_tokens_from_log(log_file)
    
    # If that fails, try analysis report
    if not tokens:
        report_file = "meijer_analysis_report.json"
        if Path(report_file).exists():
            tokens = extract_tokens_from_analysis_report(report_file)
    
    if not tokens:
        print("Error: No authentication tokens found", file=sys.stderr)
        sys.exit(1)
    
    # Update config
    if update_config(tokens):
        print(f"✓ Authentication tokens updated successfully")
        print(f"  Access token: {tokens['access_token'][:50]}...")
        print(f"  Refresh token: {tokens['refresh_token']}")
        print(f"  Expires in: {tokens['expires_in']} seconds")
        sys.exit(0)
    else:
        print("Error: Failed to update configuration", file=sys.stderr)
        sys.exit(1)


if __name__ == "__main__":
    main() 