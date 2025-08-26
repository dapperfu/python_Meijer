#!/usr/bin/env python3
import logging
from meijer.auth_log_analyzer import MeijerAuthLogAnalyzer

# Set up logging
logging.basicConfig(level=logging.DEBUG)

# Test the analyzer
analyzer = MeijerAuthLogAnalyzer('logs/meijer_mitm_20250825_175009.log')

print("Loading flows...")
if analyzer.load_flows():
    print(f"Loaded {len(analyzer.flows)} flows")
    
    # Check for API flows
    api_flows = [flow for flow in analyzer.flows if 'api.meijer.com' in flow.request.pretty_url and flow.request.method in ['GET', 'POST']]
    print(f"Found {len(api_flows)} API flows")
    
    # Check for flows with Authorization headers
    auth_flows = [flow for flow in api_flows if 'authorization' in [k.lower() for k in flow.request.headers.keys()]]
    print(f"Found {len(auth_flows)} API flows with Authorization headers")
    
    if auth_flows:
        flow = auth_flows[0]
        print(f"\nFirst auth flow:")
        print(f"  Method: {flow.request.method}")
        print(f"  URL: {flow.request.pretty_url}")
        print(f"  Auth header: {flow.request.headers.get('Authorization', 'NOT_FOUND')[:100]}...")
        
        # Test the extraction logic
        auth_header = flow.request.headers.get('Authorization', '')
        if auth_header.startswith('Bearer '):
            print("✅ Bearer token found!")
            token = auth_header[7:]
            print(f"  Token: {token[:50]}...")
        else:
            print("❌ Not a Bearer token")
else:
    print("Failed to load flows")
