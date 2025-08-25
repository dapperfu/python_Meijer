#!/usr/bin/env python3
"""
Exact Request Sequence Analysis
Analyzes the successful login flow from mitmproxy logs to extract the exact sequence
"""

import json
import sys
from urllib.parse import parse_qs, urlparse

def analyze_exact_sequence(log_file: str):
    """Analyze the exact request sequence from a successful login flow."""
    
    print(f"🔍 Analyzing exact request sequence from: {log_file}")
    print("=" * 80)
    
    # Load the raw auth flows
    try:
        with open(log_file, 'r') as f:
            flows = json.load(f)
    except Exception as e:
        print(f"❌ Error loading {log_file}: {e}")
        return
    
    print(f"✅ Loaded {len(flows)} authentication flows")
    print()
    
    # Find the successful login sequence
    successful_sequence = []
    
    for flow in flows:
        flow_data = flow.get('flow', {})
        flow_type = flow.get('type', 'unknown')
        
        if flow_type in ['login_authorize', 'device_nonce', 'web_login_identify', 'challenge_answer', 'oauth_keys', 'token_exchange']:
            successful_sequence.append({
                'type': flow_type,
                'flow_index': flow.get('flow_index'),
                'timestamp': flow_data.get('timestamp'),
                'url': flow_data.get('url'),
                'method': flow_data.get('method'),
                'status_code': flow_data.get('status_code'),
                'request_headers': flow_data.get('request_headers', {}),
                'request_body': flow_data.get('request_body'),
                'response_headers': flow_data.get('response_headers', {}),
                'cookies': flow_data.get('cookies', {}),
                'set_cookies': flow_data.get('set_cookies', [])
            })
    
    # Sort by timestamp
    successful_sequence.sort(key=lambda x: x['timestamp'] or 0)
    
    print("🎯 EXACT SUCCESSFUL LOGIN SEQUENCE:")
    print("=" * 80)
    
    for i, flow in enumerate(successful_sequence):
        print(f"\n📋 STEP {i+1}: {flow['type'].upper()}")
        print(f"   Flow Index: {flow['flow_index']}")
        print(f"   Timestamp: {flow['timestamp']}")
        print(f"   Method: {flow['method']}")
        print(f"   URL: {flow['url']}")
        print(f"   Status: {flow['status_code']}")
        
        # Show key request headers
        if flow['request_headers']:
            print("   Key Headers:")
            for header, value in flow['request_headers'].items():
                if header.lower() in ['user-agent', 'accept', 'content-type', 'x-device-fingerprint', 'x-acf-sensor-data']:
                    print(f"     {header}: {value}")
        
        # Show request body for key steps
        if flow['request_body'] and flow['type'] in ['web_login_identify', 'challenge_answer']:
            print(f"   Request Body: {flow['request_body'][:200]}...")
        
        # Show key cookies
        if flow['cookies']:
            print("   Key Cookies:")
            for cookie, value in flow['cookies'].items():
                if cookie in ['_abck', 'bm_sz', 'bm_sv', 'ak_bmsc', 'JSESSIONID']:
                    print(f"     {cookie}: {value[:100]}...")
        
        print("-" * 60)
    
    # Extract critical patterns
    print("\n🔑 CRITICAL PATTERNS FOR REPLICATION:")
    print("=" * 80)
    
    # 1. OAuth2 Parameters
    oauth_flow = next((f for f in successful_sequence if f['type'] == 'login_authorize'), None)
    if oauth_flow:
        url = oauth_flow['url']
        parsed = urlparse(url)
        params = parse_qs(parsed.query)
        
        print("📋 OAUTH2 PARAMETERS:")
        for key, value in params.items():
            print(f"   {key}: {value[0]}")
    
    # 2. Device Fingerprint
    device_flow = next((f for f in successful_sequence if f['type'] == 'device_nonce'), None)
    if device_flow:
        print("\n📱 DEVICE FINGERPRINT:")
        print(f"   URL: {device_flow['url']}")
        print(f"   Method: {device_flow['method']}")
        print(f"   Headers: {list(device_flow['request_headers'].keys())}")
    
    # 3. Login Identify
    identify_flow = next((f for f in successful_sequence if f['type'] == 'web_login_identify'), None)
    if identify_flow:
        print("\n🔐 LOGIN IDENTIFY:")
        print(f"   URL: {identify_flow['url']}")
        print(f"   Method: {identify_flow['method']}")
        print(f"   Content-Type: {identify_flow['request_headers'].get('content-type', 'N/A')}")
        print(f"   X-Device-Fingerprint: {identify_flow['request_headers'].get('x-device-fingerprint', 'N/A')}")
    
    # 4. Challenge Answer
    challenge_flow = next((f for f in successful_sequence if f['type'] == 'challenge_answer'), None)
    if challenge_flow:
        print("\n🔑 CHALLENGE ANSWER:")
        print(f"   URL: {challenge_flow['url']}")
        print(f"   Method: {challenge_flow['method']}")
        print(f"   Request Body: {challenge_flow['request_body'][:100]}...")
    
    # 5. Token Exchange
    token_flow = next((f for f in successful_sequence if f['type'] == 'token_exchange'), None)
    if token_flow:
        print("\n🎫 TOKEN EXCHANGE:")
        print(f"   URL: {token_flow['url']}")
        print(f"   Method: {token_flow['method']}")
        print(f"   X-ACF-Sensor-Data: {token_flow['request_headers'].get('x-acf-sensor-data', 'N/A')[:100]}...")
    
    # 6. Cookie Evolution
    print("\n🍪 COOKIE EVOLUTION PATTERN:")
    for i, flow in enumerate(successful_sequence):
        if flow['set_cookies']:
            print(f"   Step {i+1} ({flow['type']}): {len(flow['set_cookies'])} cookies set")
            for cookie in flow['set_cookies']:
                if 'JSESSIONID' in cookie or '_abck' in cookie or 'bm_sz' in cookie:
                    print(f"     {cookie[:100]}...")
    
    # 7. Timing Analysis
    print("\n⏱️  TIMING ANALYSIS:")
    for i, flow in enumerate(successful_sequence):
        if i > 0:
            prev_time = successful_sequence[i-1]['timestamp']
            curr_time = flow['timestamp']
            if prev_time and curr_time:
                delay = curr_time - prev_time
                print(f"   Step {i} delay: {delay:.2f} seconds")
    
    print("\n" + "=" * 80)
    print("✅ EXACT SEQUENCE ANALYSIS COMPLETE")
    print("   Use this information to replicate the successful login flow exactly")

def main():
    if len(sys.argv) != 2:
        print("Usage: python exact_request_sequence_analysis.py <log_file>")
        print("Example: python exact_request_sequence_analysis.py okta_auth_flows_raw_20250823_154001.json")
        return
    
    log_file = sys.argv[1]
    analyze_exact_sequence(log_file)

if __name__ == "__main__":
    main()
