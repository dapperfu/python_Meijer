#!/usr/bin/env python3
"""
Quick Latest Log Analyzer for Meijer mitmproxy logs

This script quickly analyzes the most recent log file to find current coupon state.
"""

import json
import re
from collections import defaultdict
from pathlib import Path


def analyze_latest_log():
    """Analyze the latest log file for coupon patterns."""
    log_dir = Path("logs")
    
    # Get the most recent log file
    log_files = sorted(log_dir.glob("meijer_mitm_*.log"))
    if not log_files:
        print("No log files found")
        return
    
    latest_log = log_files[-1]
    print(f"Analyzing latest log: {latest_log.name}")
    
    try:
        with open(latest_log, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()
        
        print(f"File size: {len(content) / (1024*1024):.1f}MB")
        
        # Search for specific patterns
        results = search_patterns(content)
        
        # Display results
        display_results(results)
        
    except Exception as e:
        print(f"Error reading log file: {e}")


def search_patterns(content: str) -> dict:
    """Search for specific coupon patterns in content."""
    results = {
        'total_interactions': 0,
        'departments': defaultdict(int),
        'cottonelle_found': 0,
        'clipped_patterns': 0,
        'endpoints': defaultdict(int)
    }
    
    # Department patterns
    dept_patterns = {
        'Deli': r'[Dd]eli',
        'Dry Grocery': r'[Dd]ry\s*[Gg]rocery',
        'Baby': r'[Bb]aby'
    }
    
    for dept_name, pattern in dept_patterns.items():
        matches = re.findall(pattern, content, re.IGNORECASE)
        count = len(matches)
        if count > 0:
            results['departments'][dept_name] = count
            results['total_interactions'] += count
    
    # Cottonelle
    cottonelle_matches = re.findall(r'[Cc]ottonelle', content, re.IGNORECASE)
    results['cottonelle_found'] = len(cottonelle_matches)
    results['total_interactions'] += len(cottonelle_matches)
    
    # Clipped patterns
    clipped_patterns = [
        r'[Cc]lippedOffers',
        r'[Cc]lipped.*[Oo]ffers',
        r'[Ii]sClipped.*true',
        r'[Cc]lipped.*[Rr]ewards',
        r'[Cc]lipped.*[Cc]oupons'
    ]
    
    for pattern in clipped_patterns:
        matches = re.findall(pattern, content, re.IGNORECASE)
        results['clipped_patterns'] += len(matches)
        results['total_interactions'] += len(matches)
    
    # Endpoint patterns
    endpoint_patterns = [
        r'ads',
        r'coupons',
        r'rewards',
        r'offers',
        r'promotions'
    ]
    
    for pattern in endpoint_patterns:
        matches = re.findall(pattern, content, re.IGNORECASE)
        results['endpoints'][pattern] = len(matches)
        results['total_interactions'] += len(matches)
    
    return results


def display_results(results: dict):
    """Display the analysis results."""
    print("\n" + "="*60)
    print("LATEST LOG COUPON ANALYSIS RESULTS")
    print("="*60)
    
    print(f"\nTotal Interactions Found: {results['total_interactions']}")
    
    print(f"\nDepartment/Category Breakdown:")
    for dept, count in sorted(results['departments'].items()):
        print(f"  {dept}: {count}")
    
    print(f"\nEndpoint Breakdown:")
    for endpoint, count in sorted(results['endpoints'].items()):
        print(f"  {endpoint}: {count}")
    
    print(f"\nCottonelle Items Found: {results['cottonelle_found']}")
    print(f"Clipped Patterns Found: {results['clipped_patterns']}")
    
    # Check against expected values
    print(f"\n" + "="*40)
    print("EXPECTED vs FOUND COMPARISON")
    print("="*40)
    
    expected = {
        'Total Interactions': 421,
        'Deli': 3,
        'Dry Grocery': 68,
        'Clipped Patterns': 50,
        'Cottonelle': 1
    }
    
    found = {
        'Total Interactions': results['total_interactions'],
        'Deli': results['departments'].get('Deli', 0),
        'Dry Grocery': results['departments'].get('Dry Grocery', 0),
        'Clipped Patterns': results['clipped_patterns'],
        'Cottonelle': results['cottonelle_found']
    }
    
    for key in expected:
        expected_val = expected[key]
        found_val = found.get(key, 0)
        status = "✓" if found_val >= expected_val else "✗"
        print(f"  {key}: Expected {expected_val}, Found {found_val} {status}")


if __name__ == "__main__":
    analyze_latest_log()
