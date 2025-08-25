#!/usr/bin/env python3
"""
Extract actual API endpoints from mitmproxy logs.

This script analyzes mitmproxy binary logs to find the actual
API endpoint paths, not just TLS setup information.
"""

import json
import re
from pathlib import Path
from typing import Dict, Any
from collections import defaultdict


def extract_api_endpoints(log_file: Path) -> Dict[str, Any]:
    """
    Extract actual API endpoints from mitmproxy log.
    
    Args:
        log_file: Path to mitmproxy log file
        
    Returns:
        Dictionary containing extracted API endpoints and analysis
    """
    print(f"🔍 Analyzing mitmproxy log: {log_file}")
    
    api_endpoints = []
    endpoint_counts = defaultdict(int)
    
    try:
        # Read the binary log file
        with open(log_file, "rb") as f:
            content = f.read()
        
        # Decode with error handling
        decoded_content = content.decode("utf-8", errors="ignore")
        
        # Look for actual API paths - these usually appear in request lines
        # Pattern: look for HTTP methods followed by paths
        http_pattern = r'(GET|POST|PUT|DELETE|PATCH)\s+([^\s]+)'
        matches = re.finditer(http_pattern, decoded_content)
        
        for match in matches:
            method = match.group(1)
            path = match.group(2)
            
            # Filter for api.meijer.com paths
            if 'api.meijer.com' in path or path.startswith('/'):
                # Clean up the path
                if path.startswith('http'):
                    # Extract just the path part
                    path_match = re.search(r'api\.meijer\.com([^?\s]+)', path)
                    if path_match:
                        clean_path = path_match.group(1)
                    else:
                        continue
                else:
                    clean_path = path
                
                # Skip if it's just a slash or empty
                if clean_path in ['/', '', '\\']:
                    continue
                
                endpoint_counts[clean_path] += 1
                
                api_endpoints.append({
                    "method": method,
                    "path": clean_path,
                    "full_path": path
                })
        
        # Also look for paths in other common patterns
        # Pattern: look for quoted paths
        quoted_pattern = r'"([^"]*api\.meijer\.com[^"]*)"'
        quoted_matches = re.finditer(quoted_pattern, decoded_content)
        
        for match in quoted_matches:
            quoted_path = match.group(1)
            path_match = re.search(r'api\.meijer\.com([^?\s]+)', quoted_path)
            if path_match:
                clean_path = path_match.group(1)
                if clean_path not in ['/', '', '\\']:
                    endpoint_counts[clean_path] += 1
                    api_endpoints.append({
                        "method": "UNKNOWN",
                        "path": clean_path,
                        "full_path": quoted_path
                    })
        
        print(f"📊 Found {len(api_endpoints)} API endpoint references")
        print(f"📊 Found {len(endpoint_counts)} unique endpoints")
        
        return {
            "log_file": str(log_file),
            "total_endpoints": len(api_endpoints),
            "unique_endpoints": len(endpoint_counts),
            "endpoint_counts": dict(endpoint_counts),
            "api_endpoints": api_endpoints[:100]  # Limit to first 100 for readability
        }
        
    except Exception as e:
        print(f"❌ Error analyzing log: {e}")
        return {"error": str(e)}


def main():
    """Main function to analyze log files."""
    # Find all mitmproxy log files
    log_files = list(Path(".").glob("meijer_mitm_*.log"))
    
    if not log_files:
        print("❌ No mitmproxy log files found")
        return
    
    print(f"📁 Found {len(log_files)} log files")
    
    all_results = {}
    
    for log_file in log_files:
        print(f"\n{'='*60}")
        result = extract_api_endpoints(log_file)
        all_results[log_file.name] = result
        
        if "error" not in result:
            print(f"✅ {log_file.name}: {result['total_endpoints']} endpoint references")
        else:
            print(f"❌ {log_file.name}: {result['error']}")
    
    # Save combined results
    output_file = "api_endpoints_analysis.json"
    with open(output_file, "w") as f:
        json.dump(all_results, f, indent=2)
    
    print(f"\n💾 Results saved to {output_file}")
    
    # Print summary
    print("\n📋 Summary of API endpoints found:")
    all_endpoints = defaultdict(int)
    for result in all_results.values():
        if "endpoint_counts" in result:
            for endpoint, count in result["endpoint_counts"].items():
                all_endpoints[endpoint] += count
    
    # Sort by frequency
    sorted_endpoints = sorted(all_endpoints.items(), key=lambda x: x[1], reverse=True)
    
    print("\nTop 30 most common endpoints:")
    for endpoint, count in sorted_endpoints[:30]:
        print(f"  {endpoint}: {count} references")


if __name__ == "__main__":
    main()
