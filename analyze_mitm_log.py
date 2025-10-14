#!/usr/bin/env python3
"""
Analyze mitmproxy log to understand Craigslist progressive loading behavior.
"""

import json
import sys
from pathlib import Path
from typing import Dict, List, Any, Optional
from urllib.parse import urlparse, parse_qs


def analyze_mitm_log(log_file_path: str) -> Dict[str, Any]:
    """
    Analyze mitmproxy log file to extract Craigslist API calls and progressive loading.
    
    Args:
        log_file_path: Path to the mitmproxy log file
        
    Returns:
        Dictionary containing analysis results
    """
    results = {
        "craigslist_flows": [],
        "progressive_loading_sequence": [],
        "api_calls": [],
        "search_patterns": []
    }
    
    # Try different encodings
    encodings = ['utf-8', 'latin-1', 'cp1252', 'iso-8859-1']
    content = None
    
    for encoding in encodings:
        try:
            with open(log_file_path, 'r', encoding=encoding) as f:
                content = f.read()
            print(f"Successfully read file with {encoding} encoding")
            break
        except UnicodeDecodeError:
            continue
    
    if content is None:
        print("Failed to read file with any encoding")
        return results
    
    try:
        # Split into flows (each flow is separated by a newline)
        flows = content.strip().split('\n\n')
        print(f"Found {len(flows)} potential flows")
        
        for i, flow in enumerate(flows):
            if not flow.strip():
                continue
                
            try:
                # Parse the flow data
                flow_data = json.loads(flow)
                
                # Extract request information
                if 'request' in flow_data:
                    request = flow_data['request']
                    url = request.get('url', '')
                    
                    # Focus on Craigslist-related requests
                    if 'craigslist' in url.lower():
                        parsed_url = urlparse(url)
                        
                        flow_info = {
                            "flow_id": i,
                            "url": url,
                            "method": request.get('method', ''),
                            "headers": request.get('headers', {}),
                            "timestamp": flow_data.get('timestamp_start', 0)
                        }
                        
                        # Check if it's an API call
                        if 'sapi.craigslist.org' in url:
                            flow_info['type'] = 'api_call'
                            flow_info['endpoint'] = parsed_url.path
                            flow_info['query_params'] = parse_qs(parsed_url.query)
                            
                            # Extract search parameters
                            if 'query' in flow_info['query_params']:
                                flow_info['search_query'] = flow_info['query_params']['query'][0]
                            
                            results['api_calls'].append(flow_info)
                        else:
                            flow_info['type'] = 'page_request'
                        
                        results['craigslist_flows'].append(flow_info)
                        
                        # Check for progressive loading indicators
                        if 'batch=' in url or 'searchPath=' in url:
                            results['progressive_loading_sequence'].append(flow_info)
                
                # Extract response information if available
                if 'response' in flow_data:
                    response = flow_data['response']
                    # Look for search results in response
                    if 'content' in response:
                        content = response['content']
                        if isinstance(content, str) and 'Priority 600' in content:
                            results['search_patterns'].append({
                                "flow_id": i,
                                "pattern": "Priority 600",
                                "content_preview": content[:200] + "..." if len(content) > 200 else content
                            })
                            
            except json.JSONDecodeError:
                # Skip malformed JSON
                continue
            except Exception as e:
                print(f"Error processing flow {i}: {e}", file=sys.stderr)
                continue
        
        # Sort flows by timestamp
        results['craigslist_flows'].sort(key=lambda x: x.get('timestamp', 0))
        results['progressive_loading_sequence'].sort(key=lambda x: x.get('timestamp', 0))
        
        return results
        
    except Exception as e:
        print(f"Error processing flows: {e}", file=sys.stderr)
        return results


def print_analysis(results: Dict[str, Any]) -> None:
    """Print the analysis results in a readable format."""
    print("=== Craigslist Progressive Loading Analysis ===\n")
    
    print(f"Total Craigslist flows: {len(results['craigslist_flows'])}")
    print(f"API calls: {len(results['api_calls'])}")
    print(f"Progressive loading indicators: {len(results['progressive_loading_sequence'])}")
    print(f"Search patterns found: {len(results['search_patterns'])}\n")
    
    if results['api_calls']:
        print("=== API Calls ===")
        for api_call in results['api_calls']:
            print(f"Flow {api_call['flow_id']}: {api_call['method']} {api_call['url']}")
            if 'search_query' in api_call:
                print(f"  Search: {api_call['search_query']}")
            if 'query_params' in api_call:
                print(f"  Params: {dict(api_call['query_params'])}")
            print()
    
    if results['progressive_loading_sequence']:
        print("=== Progressive Loading Sequence ===")
        for flow in results['progressive_loading_sequence']:
            print(f"Flow {flow['flow_id']}: {flow['url']}")
            print(f"  Timestamp: {flow['timestamp']}")
            print()
    
    if results['search_patterns']:
        print("=== Search Patterns ===")
        for pattern in results['search_patterns']:
            print(f"Flow {pattern['flow_id']}: Found 'Priority 600'")
            print(f"  Content preview: {pattern['content_preview']}")
            print()


def main():
    """Main function to analyze the mitmproxy log."""
    if len(sys.argv) != 2:
        print("Usage: python analyze_mitm_log.py <log_file_path>")
        sys.exit(1)
    
    log_file_path = sys.argv[1]
    
    if not Path(log_file_path).exists():
        print(f"Log file not found: {log_file_path}")
        sys.exit(1)
    
    print(f"Analyzing mitmproxy log: {log_file_path}")
    print("=" * 50)
    
    results = analyze_mitm_log(log_file_path)
    print_analysis(results)
    
    # Save detailed results to JSON
    output_file = f"{Path(log_file_path).stem}_analysis.json"
    with open(output_file, 'w') as f:
        json.dump(results, f, indent=2, default=str)
    
    print(f"\nDetailed analysis saved to: {output_file}")


if __name__ == "__main__":
    main()
