#!/usr/bin/env python3
"""
Simple analyzer for mPerks history flows in mitmproxy logs.

This script directly reads the log file and searches for mPerks-related flows.
"""

import json
import re
from pathlib import Path
from typing import Dict, List, Any, Optional


def analyze_mperks_flows(log_file_path: str) -> List[Dict[str, Any]]:
    """Analyze the log file for mPerks history flows."""
    
    mperks_flows = []
    
    with open(log_file_path, 'rb') as f:
        content = f.read()
    
    # Convert to string for analysis
    try:
        content_str = content.decode('utf-8')
    except UnicodeDecodeError:
        # Try different encodings
        content_str = content.decode('latin-1')
    
    # Look for mPerks-related URLs
    mperks_patterns = [
        r'https?://[^\s]+mperks[^\s]+',
        r'https?://[^\s]+loyalty[^\s]+',
        r'https?://[^\s]+digital[^\s]+mperks[^\s]+',
    ]
    
    for pattern in mperks_patterns:
        matches = re.findall(pattern, content_str, re.IGNORECASE)
        for match in matches:
            # Look for history-related keywords
            if any(keyword in match.lower() for keyword in 
                   ["history", "transaction", "activity", "points", "earn", "redeem", "balance"]):
                
                flow_info = {
                    "url": match,
                    "type": "mperks_history",
                    "keywords": [kw for kw in ["history", "transaction", "activity", "points", "earn", "redeem", "balance"] 
                               if kw in match.lower()]
                }
                
                if flow_info not in mperks_flows:
                    mperks_flows.append(flow_info)
    
    return mperks_flows


def main():
    """Main function to analyze the log file."""
    log_file = "logs/meijer_mitm_20250823_1600.log"
    
    if not Path(log_file).exists():
        print(f"Log file not found: {log_file}")
        return
    
    print(f"Analyzing log file: {log_file}")
    print("=" * 50)
    
    flows = analyze_mperks_flows(log_file)
    
    if not flows:
        print("No mPerks history flows found.")
        return
    
    print(f"Found {len(flows)} mPerks history flows:")
    print()
    
    for i, flow in enumerate(flows, 1):
        print(f"Flow {i}:")
        print(f"  URL: {flow['url']}")
        print(f"  Keywords: {', '.join(flow['keywords'])}")
        print()
    
    # Also look for any JSON responses that might contain history data
    print("Searching for JSON responses with history data...")
    print("=" * 50)
    
    # Look for JSON content that might be history data
    json_patterns = [
        r'\{[^}]*"transactions?[^}]*\}',
        r'\{[^}]*"history[^}]*\}',
        r'\{[^}]*"points?[^}]*\}',
        r'\{[^}]*"earn[^}]*\}',
        r'\{[^}]*"redeem[^}]*\}',
    ]
    
    for pattern in json_patterns:
        matches = re.findall(pattern, content_str, re.IGNORECASE)
        if matches:
            print(f"Found potential JSON with pattern {pattern}:")
            for match in matches[:3]:  # Show first 3 matches
                print(f"  {match[:200]}...")
            print()


if __name__ == "__main__":
    main()
