#!/usr/bin/env python3
"""
Extract key account endpoints from the large analysis file.
"""

import json

def extract_key_endpoints():
    """Extract key account endpoints from the analysis file."""
    try:
        with open('account_flows_analysis.json', 'r') as f:
            data = json.load(f)
        
        # Extract Meijer-specific endpoints (filter out external services)
        meijer_endpoints = []
        for endpoint in data.get('endpoints', []):
            if 'meijer.com' in endpoint or endpoint.startswith('/'):
                meijer_endpoints.append(endpoint)
        
        # Get sample flows for each endpoint
        endpoint_samples = {}
        for endpoint in meijer_endpoints:
            flows = data.get('endpoint_groups', {}).get(endpoint, [])
            if flows:
                # Get first flow as sample
                sample_flow = flows[0]
                endpoint_samples[endpoint] = {
                    'method': sample_flow.get('method'),
                    'url': sample_flow.get('url'),
                    'request_body': sample_flow.get('request_body'),
                    'response_status': sample_flow.get('response_status'),
                    'response_body': sample_flow.get('response_body')
                }
        
        # Save focused analysis
        focused_analysis = {
            'meijer_endpoints': meijer_endpoints,
            'endpoint_samples': endpoint_samples,
            'total_meijer_endpoints': len(meijer_endpoints)
        }
        
        with open('focused_account_endpoints.json', 'w') as f:
            json.dump(focused_analysis, f, indent=2, default=str)
        
        print(f"Found {len(meijer_endpoints)} Meijer-specific account endpoints:")
        for endpoint in meijer_endpoints:
            print(f"  {endpoint}")
        
        print("\nFocused analysis saved to: focused_account_endpoints.json")
        
    except Exception as e:
        print(f"Error: {e}")

if __name__ == "__main__":
    extract_key_endpoints()
