#!/usr/bin/env python3
"""
Simple UPC search in mitmproxy log files

This script searches for specific UPCs in mitmproxy log files and extracts
relevant context around them to analyze the flows.
"""

import sys
import re
from typing import List, Dict, Any


def search_upcs_in_log(log_file_path: str, target_upcs: List[str]) -> Dict[str, List[Dict[str, Any]]]:
    """
    Search for UPCs in a log file and extract context.
    
    Args:
        log_file_path: Path to the log file
        target_upcs: List of UPCs to search for
        
    Returns:
        Dictionary mapping UPCs to their found contexts
    """
    results = {upc: [] for upc in target_upcs}
    
    try:
        # Read the log file as binary first to check if it's readable
        with open(log_file_path, 'rb') as f:
            content = f.read()
        
        # Try to decode as text
        try:
            content_str = content.decode('utf-8', errors='ignore')
        except UnicodeDecodeError:
            # If UTF-8 fails, try other encodings
            try:
                content_str = content.decode('latin-1', errors='ignore')
            except:
                print(f"Could not decode log file {log_file_path}")
                return results
        
        print(f"Log file size: {len(content)} bytes")
        print(f"Decoded content length: {len(content_str)} characters")
        
        # Search for each UPC
        for upc in target_upcs:
            print(f"\nSearching for UPC: {upc}")
            
            # Find all occurrences
            upc_indices = [m.start() for m in re.finditer(re.escape(upc), content_str)]
            
            if upc_indices:
                print(f"Found {len(upc_indices)} occurrences of UPC {upc}")
                
                for i, idx in enumerate(upc_indices[:10]):  # Limit to first 10 occurrences
                    # Extract context around the UPC
                    start = max(0, idx - 200)
                    end = min(len(content_str), idx + 200)
                    context = content_str[start:end]
                    
                    # Try to identify the type of flow
                    flow_type = "unknown"
                    if "shopandscan" in context.lower():
                        flow_type = "shop_n_scan"
                    elif "cart" in context.lower():
                        flow_type = "cart"
                    elif "search" in context.lower():
                        flow_type = "search"
                    elif "api.meijer.com" in context:
                        flow_type = "meijer_api"
                    
                    # Look for HTTP method and URL patterns
                    http_method = "unknown"
                    url = "unknown"
                    
                    # Find HTTP method before the UPC
                    method_match = re.search(r'([A-Z]+)\s+([^\s]+)', context[:100])
                    if method_match:
                        http_method = method_match.group(1)
                        url = method_match.group(2)
                    
                    # Look for JSON content
                    json_content = ""
                    json_match = re.search(r'\{[^}]*\}', context)
                    if json_match:
                        json_content = json_match.group(0)
                    
                    result = {
                        'occurrence': i + 1,
                        'flow_type': flow_type,
                        'http_method': http_method,
                        'url': url,
                        'context': context,
                        'json_content': json_content,
                        'position': idx
                    }
                    
                    results[upc].append(result)
                    
                    print(f"  Occurrence {i+1}: {flow_type} - {http_method} {url}")
                    print(f"    Context: {context[:100]}...")
                    if json_content:
                        print(f"    JSON: {json_content[:100]}...")
                    print("-" * 80)
            else:
                print(f"No occurrences found for UPC {upc}")
        
        return results
        
    except Exception as e:
        print(f"Error processing log file: {e}")
        return results


def main():
    """Main function."""
    if len(sys.argv) < 2:
        print("Usage: python simple_upc_search.py <log_file> [upc1] [upc2] ...")
        sys.exit(1)
    
    log_file = sys.argv[1]
    target_upcs = sys.argv[2:] if len(sys.argv) > 2 else [
        "629307040245", "842595131277", "822279082910", 
        "070896523112", "713733252843", "016000275263", "046100001899"
    ]
    
    print(f"Searching for UPCs in: {log_file}")
    print(f"Target UPCs: {', '.join(target_upcs)}")
    
    results = search_upcs_in_log(log_file, target_upcs)
    
    # Summary
    print("\n" + "="*80)
    print("SUMMARY")
    print("="*80)
    
    for upc, flows in results.items():
        if flows:
            print(f"\nUPC {upc}: {len(flows)} flows found")
            flow_types = {}
            for flow in flows:
                flow_type = flow['flow_type']
                flow_types[flow_type] = flow_types.get(flow_type, 0) + 1
            
            for flow_type, count in flow_types.items():
                print(f"  {flow_type}: {count}")
        else:
            print(f"\nUPC {upc}: No flows found")


if __name__ == "__main__":
    main()
