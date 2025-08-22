#!/usr/bin/env python3
"""
Simple script to display top 10 missing endpoints in a table format.
"""

import json
from typing import Dict, Any


def load_endpoint_data(filename: str = "endpoint_gaps_report.json") -> Dict[str, Any]:
    """Load endpoint analysis data from JSON file."""
    try:
        with open(filename, 'r') as f:
            return json.load(f)
    except FileNotFoundError:
        print(f"❌ File not found: {filename}")
        return {}
    except json.JSONDecodeError as e:
        print(f"❌ Error parsing JSON: {e}")
        return {}


def print_top_endpoints_table(data: Dict[str, Any], top_n: int = 10) -> None:
    """Print top missing endpoints in a nice table format."""
    if not data or "missing_endpoints_by_frequency" not in data:
        print("❌ No endpoint data found")
        return
        
    endpoints = data["missing_endpoints_by_frequency"][:top_n]
    
    if not endpoints:
        print("❌ No missing endpoints found")
        return
    
    # Print header
    print("\n" + "="*120)
    print("🏆 TOP 10 MOST FREQUENTLY HIT MISSING ENDPOINTS")
    print("="*120)
    print(f"{'Rank':<4} {'Hits':<6} {'Priority':<8} {'Category':<12} {'Method':<6} {'Endpoint':<70}")
    print("-"*120)
    
    # Print each endpoint
    for i, endpoint_data in enumerate(endpoints, 1):
        rank = f"{i}"
        hits = f"{endpoint_data['count']}"
        priority = f"{endpoint_data.get('priority_score', 0):.1f}"
        category = f"{endpoint_data['category']}"
        method = f"{endpoint_data['method']}"
        
        # Truncate endpoint name if too long
        endpoint = endpoint_data['endpoint']
        if len(endpoint) > 68:
            endpoint = endpoint[:65] + "..."
        
        print(f"{rank:<4} {hits:<6} {priority:<8} {category:<12} {method:<6} {endpoint:<70}")
    
    print("-"*120)
    print(f"📊 Total missing endpoints: {data.get('summary', {}).get('total_missing', 0)}")
    print(f"🎯 High priority (score > 50): {len([ep for ep in data.get('implementation_priority', []) if ep.get('priority_score', 0) > 50])}")
    print("="*120)


def main():
    """Main function to display top endpoints."""
    print("🔍 Meijer API - Top Missing Endpoints")
    print("="*50)
    
    # Load data
    data = load_endpoint_data()
    
    if not data:
        print("❌ Failed to load data. Run tools/endpoint_frequency_analyzer.py first.")
        return
    
    # Display table
    print_top_endpoints_table(data)


if __name__ == "__main__":
    main()
