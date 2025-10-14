#!/usr/bin/env python3
"""
Analyze mitmproxy log using mitmdump's built-in capabilities.
"""

import subprocess
import json
import sys
from pathlib import Path
from typing import Dict, List, Any


def analyze_with_mitmdump(log_file_path: str) -> Dict[str, Any]:
    """
    Use mitmdump to analyze the log file and extract relevant information.
    """
    results = {
        "craigslist_flows": [],
        "progressive_loading_sequence": [],
        "api_calls": [],
        "search_patterns": []
    }
    
    # Create a Python script for mitmdump to execute
    script_content = '''
import json
from mitmproxy import ctx

def load(loader):
    pass

def request(flow):
    # Check if this is a Craigslist request
    if 'craigslist' in flow.request.pretty_url.lower():
        flow_info = {
            "url": flow.request.pretty_url,
            "method": flow.request.method,
            "headers": dict(flow.request.headers),
            "timestamp": flow.timestamp_start,
            "type": "request"
        }
        
        # Check for progressive loading indicators
        if 'batch=' in flow.request.pretty_url or 'searchPath=' in flow.request.pretty_url:
            flow_info['progressive_loading'] = True
            
        # Check if it's an API call
        if 'sapi.craigslist.org' in flow.request.pretty_url:
            flow_info['api_call'] = True
            flow_info['endpoint'] = flow.request.path
            flow_info['query_params'] = dict(flow.request.query)
            
        ctx.log.info(f"CRAIGSLIST_FLOW: {json.dumps(flow_info)}")

def response(flow):
    # Check if this is a Craigslist response
    if 'craigslist' in flow.request.pretty_url.lower():
        # Look for search content
        if hasattr(flow.response, 'text'):
            content = flow.response.text
            if 'Priority 600' in content:
                ctx.log.info(f"SEARCH_PATTERN: Priority 600 found in {flow.request.pretty_url}")
                
        # Check if it's an API response
        if 'sapi.craigslist.org' in flow.request.pretty_url:
            try:
                if hasattr(flow.response, 'json'):
                    data = flow.response.json()
                    if 'data' in data and 'items' in data['data']:
                        ctx.log.info(f"API_RESPONSE: {len(data['data']['items'])} items found")
            except:
                pass
'''

    # Write the script to a temporary file
    script_file = Path("temp_mitm_script.py")
    with open(script_file, 'w') as f:
        f.write(script_content)
    
    try:
        # Run mitmdump with our script
        cmd = [
            "mitmdump", 
            "-r", log_file_path,
            "-s", str(script_file),
            "--set", "flow_detail=0",
            "--set", "termlog_verbosity=error"
        ]
        
        print(f"Running: {' '.join(cmd)}")
        result = subprocess.run(cmd, capture_output=True, text=True, timeout=60)
        
        if result.returncode == 0:
            # Parse the output for our log messages
            for line in result.stdout.split('\n'):
                if 'CRAIGSLIST_FLOW:' in line:
                    try:
                        flow_data = json.loads(line.split('CRAIGSLIST_FLOW: ')[1])
                        results['craigslist_flows'].append(flow_data)
                        
                        if flow_data.get('progressive_loading'):
                            results['progressive_loading_sequence'].append(flow_data)
                            
                        if flow_data.get('api_call'):
                            results['api_calls'].append(flow_data)
                            
                    except json.JSONDecodeError:
                        continue
                        
                elif 'SEARCH_PATTERN:' in line:
                    results['search_patterns'].append({
                        "pattern": "Priority 600",
                        "message": line
                    })
                    
                elif 'API_RESPONSE:' in line:
                    results['search_patterns'].append({
                        "pattern": "API Response",
                        "message": line
                    })
        
        else:
            print(f"mitmdump failed with return code {result.returncode}")
            print(f"stderr: {result.stderr}")
            
    except subprocess.TimeoutExpired:
        print("mitmdump timed out")
    except Exception as e:
        print(f"Error running mitmdump: {e}")
    finally:
        # Clean up temporary script
        if script_file.exists():
            script_file.unlink()
    
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
            print(f"URL: {api_call['url']}")
            print(f"Method: {api_call['method']}")
            if 'search_query' in api_call:
                print(f"Search: {api_call['search_query']}")
            if 'query_params' in api_call:
                print(f"Params: {api_call['query_params']}")
            print()
    
    if results['progressive_loading_sequence']:
        print("=== Progressive Loading Sequence ===")
        for flow in results['progressive_loading_sequence']:
            print(f"URL: {flow['url']}")
            print(f"Timestamp: {flow['timestamp']}")
            print()
    
    if results['search_patterns']:
        print("=== Search Patterns ===")
        for pattern in results['search_patterns']:
            print(f"Pattern: {pattern['pattern']}")
            print(f"Message: {pattern['message']}")
            print()


def main():
    """Main function to analyze the mitmproxy log."""
    if len(sys.argv) != 2:
        print("Usage: python analyze_mitm_log_mitmdump.py <log_file_path>")
        sys.exit(1)
    
    log_file_path = sys.argv[1]
    
    if not Path(log_file_path).exists():
        print(f"Log file not found: {log_file_path}")
        sys.exit(1)
    
    print(f"Analyzing mitmproxy log: {log_file_path}")
    print("=" * 50)
    
    results = analyze_with_mitmdump(log_file_path)
    print_analysis(results)
    
    # Save detailed results to JSON
    output_file = f"{Path(log_file_path).stem}_mitmdump_analysis.json"
    with open(output_file, 'w') as f:
        json.dump(results, f, indent=2, default=str)
    
    print(f"\nDetailed analysis saved to: {output_file}")


if __name__ == "__main__":
    main()
