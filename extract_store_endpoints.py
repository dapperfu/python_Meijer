#!/usr/bin/env python3
"""
Script to extract store and geocoding endpoints from mitmproxy log file.
"""

import sys
import re
from pathlib import Path

def extract_endpoints_from_log(log_file_path):
    """Extract store and geocoding endpoints from mitmproxy log."""
    
    log_file = Path(log_file_path)
    if not log_file.exists():
        print(f"Log file not found: {log_file_path}")
        return
    
    print(f"Analyzing log file: {log_file_path}")
    print(f"File size: {log_file.stat().st_size / (1024*1024):.1f} MB")
    print("-" * 80)
    
    # Patterns to look for
    patterns = {
        'store_endpoints': [
            r'storeInfo',
            r'/stores/',
            r'/store/',
            r'store.*proximity',
            r'store.*search',
            r'store.*location'
        ],
        'geocoding_endpoints': [
            r'geomobile',
            r'geocod',
            r'google.*maps',
            r'coordinates',
            r'latitude',
            r'longitude'
        ],
        'api_calls': [
            r'GET.*store',
            r'POST.*store',
            r'GET.*geocod',
            r'POST.*geocod'
        ]
    }
    
    found_endpoints = {category: set() for category in patterns.keys()}
    
    try:
        with open(log_file, 'rb') as f:
            # Read in chunks to handle large files
            chunk_size = 1024 * 1024  # 1MB chunks
            buffer = b''
            
            for chunk_num, chunk in enumerate(iter(lambda: f.read(chunk_size), b'')):
                buffer += chunk
                
                # Convert to string for regex
                try:
                    text = buffer.decode('utf-8', errors='ignore')
                except UnicodeDecodeError:
                    text = buffer.decode('latin-1', errors='ignore')
                
                # Search for patterns
                for category, pattern_list in patterns.items():
                    for pattern in pattern_list:
                        matches = re.findall(pattern, text, re.IGNORECASE)
                        found_endpoints[category].update(matches)
                
                # Keep only the last part of the buffer to avoid missing patterns at chunk boundaries
                buffer = chunk[-1024:]  # Keep last 1KB
                
                if chunk_num % 10 == 0:
                    print(f"Processed {chunk_num + 1} chunks...")
    
    except Exception as e:
        print(f"Error reading log file: {e}")
        return
    
    # Display results
    print("\n=== EXTRACTED ENDPOINTS ===\n")
    
    for category, endpoints in found_endpoints.items():
        if endpoints:
            print(f"{category.upper()}:")
            for endpoint in sorted(endpoints):
                print(f"  - {endpoint}")
            print()
        else:
            print(f"{category.upper()}: No matches found\n")
    
    # Look for specific URLs
    print("=== LOOKING FOR SPECIFIC URLS ===\n")
    
    try:
        with open(log_file, 'rb') as f:
            content = f.read()
            text = content.decode('utf-8', errors='ignore')
            
            # Look for the specific geocoding endpoint mentioned
            geomobile_pattern = r'https://geomobileservices-pa\.googleapis\.com[^\s]*'
            geomobile_matches = re.findall(geomobile_pattern, text)
            
            if geomobile_matches:
                print("Found geomobile geocoding endpoints:")
                for match in set(geomobile_matches):
                    print(f"  - {match}")
            else:
                print("No geomobile geocoding endpoints found")
            
            # Look for store API endpoints
            store_api_pattern = r'https://api\.meijer\.com[^\s]*store[^\s]*'
            store_api_matches = re.findall(store_api_pattern, text)
            
            if store_api_matches:
                print("\nFound Meijer store API endpoints:")
                for match in set(store_api_matches):
                    print(f"  - {match}")
            else:
                print("\nNo Meijer store API endpoints found")
                
    except Exception as e:
        print(f"Error in detailed search: {e}")

if __name__ == "__main__":
    log_file = "logs/meijer_mitm_20250826_114803.log"
    extract_endpoints_from_log(log_file)
