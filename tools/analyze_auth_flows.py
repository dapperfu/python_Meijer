#!/usr/bin/env python3
"""
Focused Authentication Flow Analysis

This script analyzes the latest Okta login workflow to understand the complete
authentication flow from device fingerprinting to token acquisition.
"""

import json
from typing import Any, Dict, List
from datetime import datetime
import os

from mitmproxy import io
from mitmproxy.http import HTTPFlow


def load_flows(log_file: str) -> List[HTTPFlow]:
    """Load flows from mitmproxy log file."""
    flows = []
    with open(log_file, "rb") as f:
        reader = io.FlowReader(f)
        for flow in reader.stream():
            if isinstance(flow, HTTPFlow):
                flows.append(flow)
    return flows


def find_authentication_flows(flows):
    """Find authentication flows in the mitmproxy flows."""
    auth_flows = []

    for i, flow in enumerate(flows):
        if not flow.request or not flow.response:
            continue

        # Look for the specific successful login events mentioned by user
        if (flow.request.pretty_host == 'id.meijer.com' and 
            flow.request.path.startswith('/oauth2/default/v1/authorize') and
            'login_hint' in flow.request.pretty_url and
            flow.response.status_code == 200):
            
            print(f"🎯 Found successful login authorize event at flow {i}")
            auth_flows.append({
                'type': 'login_authorize',
                'flow_index': i,
                'flow': flow
            })
        
        # Look for logout events
        elif (flow.request.pretty_host == 'id.meijer.com' and 
              flow.request.path == '/oauth2/default/v1/logout' and
              flow.response.status_code == 200):
            
            print(f"🎯 Found successful logout event at flow {i}")
            auth_flows.append({
                'type': 'logout',
                'flow_index': i,
                'flow': flow
            })
        
        # Look for device nonce requests
        elif (flow.request.pretty_host == 'id.meijer.com' and 
              flow.request.path == '/api/v1/internal/device/nonce' and
              flow.request.method == 'POST' and
              flow.response.status_code == 200):
            
            print(f"🎯 Found device nonce request at flow {i}")
            auth_flows.append({
                'type': 'device_nonce',
                'flow_index': i,
                'flow': flow
            })
        
        # Look for challenge answer (password submission)
        elif (flow.request.pretty_host == 'id.meijer.com' and 
              flow.request.path == '/idp/idx/challenge/answer' and
              flow.request.method == 'POST' and
              flow.response.status_code == 200):
            
            print(f"🎯 Found challenge answer (password) at flow {i}")
            auth_flows.append({
                'type': 'challenge_answer',
                'flow_index': i,
                'flow': flow
            })
        
        # Look for OAuth keys request
        elif (flow.request.pretty_host == 'id.meijer.com' and 
              flow.request.path.startswith('/oauth2/default/v1/keys') and
              flow.response.status_code == 200):
            
            print(f"🎯 Found OAuth keys request at flow {i}")
            auth_flows.append({
                'type': 'oauth_keys',
                'flow_index': i,
                'flow': flow
            })
        
        # Look for token exchange
        elif (flow.request.pretty_host == 'id.meijer.com' and 
              flow.request.path == '/oauth2/default/v1/token' and
              flow.request.method == 'POST' and
              flow.response.status_code == 200):
            
            print(f"🎯 Found token exchange at flow {i}")
            auth_flows.append({
                'type': 'token_exchange',
                'flow_index': i,
                'flow': flow
            })
        
        # Also look for the traditional web login flows
        elif (flow.request.pretty_host == 'id.meijer.com' and 
              flow.request.path.startswith('/oauth2/default/v1/authorize') and
              'response_type=code' in flow.request.pretty_url and
              'client_id=0oa22cbewuCICOsKz697' in flow.request.pretty_url and
              flow.response.status_code == 200):
            
            print(f"🎯 Found traditional web login authorize event at flow {i}")
            auth_flows.append({
                'type': 'web_login_authorize',
                'flow_index': i,
                'flow': flow
            })
        
        elif (flow.request.pretty_host == 'id.meijer.com' and 
              flow.request.path == '/idp/idx/identify' and
              flow.request.method == 'POST' and
              flow.response.status_code == 200):
            
            print(f"🎯 Found successful web login identify event at flow {i}")
            auth_flows.append({
                'type': 'web_login_identify',
                'flow_index': i,
                'flow': flow
            })

    return auth_flows


def analyze_auth_patterns(auth_flows):
    """Analyze patterns in authentication flows."""
    analysis = {
        "total_flows": len(auth_flows),
        "endpoints": {},
        "cookies": {},
        "headers": {},
        "timing": {}
    }
    
    for flow_data in auth_flows:
        flow = flow_data["flow"]
        
        if not flow.request or not flow.response:
            continue
            
        # Extract endpoint information
        endpoint = flow.request.path
        if endpoint not in analysis["endpoints"]:
            analysis["endpoints"][endpoint] = {
                "count": 0,
                "methods": set(),
                "status_codes": set(),
                "response_sizes": []
            }

        analysis["endpoints"][endpoint]["count"] += 1
        analysis["endpoints"][endpoint]["methods"].add(flow.request.method)
        analysis["endpoints"][endpoint]["status_codes"].add(flow.response.status_code)
        if flow.response.content:
            analysis["endpoints"][endpoint]["response_sizes"].append(len(flow.response.content))
        
        # Extract cookie information
        if flow.request.headers.get("cookie"):
            cookies = flow.request.headers["cookie"]
            if cookies not in analysis["cookies"]:
                analysis["cookies"][cookies] = 0
            analysis["cookies"][cookies] += 1
        
        # Extract header patterns
        for header_name, header_value in flow.request.headers.items():
            if header_name not in analysis["headers"]:
                analysis["headers"][header_name] = {}
            if header_value not in analysis["headers"][header_name]:
                analysis["headers"][header_name][header_value] = 0
            analysis["headers"][header_name][header_value] += 1
        
        # Extract timing information
        if hasattr(flow, 'timestamp_start') and hasattr(flow, 'timestamp_end'):
            duration = flow.timestamp_end - flow.timestamp_start
            if "request_duration" not in analysis["timing"]:
                analysis["timing"]["request_duration"] = []
            analysis["timing"]["request_duration"].append(duration)

    # Convert sets to lists for JSON serialization
    for endpoint_data in analysis["endpoints"].values():
        endpoint_data["methods"] = list(endpoint_data["methods"])
        endpoint_data["status_codes"] = list(endpoint_data["status_codes"])

    return analysis


def flow_to_dict(flow):
    """Convert HTTPFlow object to a serializable dictionary."""
    flow_dict = {
        "timestamp": getattr(flow, 'timestamp_start', None),
        "url": flow.request.pretty_url if flow.request else None,
        "method": flow.request.method if flow.request else None,
        "host": flow.request.pretty_host if flow.request else None,
        "path": flow.request.path if flow.request else None,
        "status_code": flow.response.status_code if flow.response else None,
        "request_headers": dict(flow.request.headers) if flow.request else {},
        "response_headers": dict(flow.response.headers) if flow.response else {},
        "request_body": flow.request.content.decode('utf-8', errors='ignore') if flow.request and flow.request.content else None,
        "response_body": flow.response.content.decode('utf-8', errors='ignore') if flow.response and flow.response.content else None,
        "cookies": {},
        "set_cookies": []
    }
    
    # Extract cookies from request headers
    if "cookie" in flow_dict["request_headers"]:
        cookie_header = flow_dict["request_headers"]["cookie"]
        # Parse cookie header
        for cookie in cookie_header.split(";"):
            if "=" in cookie:
                name, value = cookie.strip().split("=", 1)
                flow_dict["cookies"][name] = value
    
    # Extract set-cookie from response headers
    if "set-cookie" in flow_dict["response_headers"]:
        set_cookie_headers = flow_dict["response_headers"]["set-cookie"]
        if isinstance(set_cookie_headers, list):
            flow_dict["set_cookies"] = set_cookie_headers
        else:
            flow_dict["set_cookies"] = [set_cookie_headers]
    
    return flow_dict

def print_summary(analysis: Dict[str, Any], auth_flows: List[Dict[str, Any]]):
    """Print a summary of the authentication flows."""
    print("\n📊 SUMMARY OF AUTHENTICATION FLOWS")
    print(f"   Total flows analyzed: {len(auth_flows)}")
    
    if not auth_flows:
        print("   No authentication flows found")
        return
    
    # Group flows by type
    oauth_flows = [f for f in auth_flows if 'oauth2' in f.get('request', {}).get('url', '')]
    device_flows = [f for f in auth_flows if 'device' in f.get('request', {}).get('url', '')]
    token_flows = [f for f in auth_flows if 'token' in f.get('request', {}).get('url', '')]
    
    print("\n🔄 OAUTH2 FLOW:")
    print(f"   Found {len(oauth_flows)} OAuth2 authorize requests")
    
    print("\n🔍 DEVICE FINGERPRINTING FLOWS:")
    print(f"   Found {len(device_flows)} device nonce requests")
    
    print("\n🔑 TOKEN ACQUISITION FLOWS:")
    print(f"   Found {len(token_flows)} token exchange requests")
    
    print("\n🔍 DETAILED FLOW ANALYSIS:")
    print()
    
    for i, flow in enumerate(auth_flows[:5]):  # Show first 5 flows
        flow_type = "unknown"
        if 'oauth2' in flow.get('request', {}).get('url', ''):
            flow_type = "login_authorize"
        elif 'device' in flow.get('request', {}).get('url', ''):
            flow_type = "device_fingerprint"
        elif 'token' in flow.get('request', {}).get('url', ''):
            flow_type = "token_exchange"
        
        print(f"Flow {i+1} ({flow_type}):")
        print(f"  URL: {flow.get('request', {}).get('url', 'N/A')}")
        print(f"  Method: {flow.get('request', {}).get('method', 'N/A')}")
        print(f"  Status: {flow.get('response', {}).get('status_code', 'N/A')}")
        print(f"  Headers: {len(flow.get('request', {}).get('headers', {}))}")
        print(f"  Cookies: {len(flow.get('request', {}).get('cookies', {}))}")
        print()


def analyze_log_file(log_file):
    """Analyze a single mitmproxy log file."""
    print("📥 Loading mitmproxy flows...")
    
    try:
        flows = load_flows(log_file)
        print(f"✅ Loaded {len(flows)} total flows")

        print("🔍 Finding authentication flows...")
        auth_flows = find_authentication_flows(flows)
        print(f"✅ Found {len(auth_flows)} authentication flows")

        print("🔍 Analyzing authentication patterns...")
        analysis = analyze_auth_patterns(auth_flows)

        # Save detailed analysis
        timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
        analysis_file = f"okta_auth_flow_analysis_{timestamp}.json"
        
        with open(analysis_file, 'w') as f:
            json.dump(analysis, f, indent=2)
        print(f"💾 Saved detailed analysis to: {analysis_file}")
        
        # Save raw auth flows (convert HTTPFlow objects to dictionaries)
        raw_flows_file = f"okta_auth_flows_raw_{timestamp}.json"
        serializable_flows = []
        
        for flow_data in auth_flows:
            flow_dict = flow_to_dict(flow_data["flow"])
            serializable_flows.append({
                "type": flow_data["type"],
                "flow_index": flow_data["flow_index"],
                "flow": flow_dict
            })
        
        with open(raw_flows_file, 'w') as f:
            json.dump(serializable_flows, f, indent=2)
        print(f"💾 Saved raw auth flows to: {raw_flows_file}")

        # Print summary
        print_summary(analysis, auth_flows)

    except Exception as e:
        print(f"❌ Error analyzing {log_file}: {e}")
        import traceback
        traceback.print_exc()


def main():
    """Main analysis function."""
    # Analyze the specific log file mentioned by the user
    log_file = "logs/meijer_mitm_20250823_1400.log"
    
    print(f"🔍 Analyzing specific log file: {log_file}")
    
    if not os.path.exists(log_file):
        print(f"❌ Log file not found: {log_file}")
        return
    
    # Analyze the specific log file
    analyze_log_file(log_file)


if __name__ == "__main__":
    main()
