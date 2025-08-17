#!/usr/bin/env python3
"""
Compare OAuth flows to identify why Selenium requests are failing.
"""
import json
from typing import Dict, List, Any
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

def extract_identify_requests(flows: List[HTTPFlow]) -> List[Dict[str, Any]]:
    """Extract all /idp/idx/identify requests."""
    identify_requests = []
    
    for flow in flows:
        if (flow.request.pretty_host == "id.meijer.com" and 
            "/idp/idx/identify" in flow.request.path):
            
            request_data = {
                "url": flow.request.pretty_url,
                "method": flow.request.method,
                "headers": dict(flow.request.headers),
                "status_code": flow.response.status_code if flow.response else None,
                "timestamp": flow.timestamp_start,
                "request_body": flow.request.text if flow.request.text else None,
                "response_body": flow.response.text if flow.response and flow.response.text else None,
                "cookies": {}
            }
            
            # Extract cookies from request headers
            if "cookie" in request_data["headers"]:
                cookie_str = request_data["headers"]["cookie"]
                for cookie in cookie_str.split(";"):
                    if "=" in cookie:
                        key, value = cookie.strip().split("=", 1)
                        request_data["cookies"][key] = value
            
            identify_requests.append(request_data)
    
    return identify_requests

def compare_requests(working: Dict[str, Any], failing: Dict[str, Any]) -> Dict[str, Any]:
    """Compare working vs failing identify requests."""
    comparison = {
        "status_codes": {
            "working": working.get("status_code"),
            "failing": failing.get("status_code")
        },
        "missing_headers": [],
        "different_headers": [],
        "missing_cookies": [],
        "different_cookies": [],
        "request_body_diff": {},
        "response_body_diff": {}
    }
    
    # Compare headers
    working_headers = working.get("headers", {})
    failing_headers = failing.get("headers", {})
    
    for header, value in working_headers.items():
        if header.lower() not in [h.lower() for h in failing_headers.keys()]:
            comparison["missing_headers"].append({header: value})
        else:
            # Find the corresponding header in failing (case-insensitive)
            failing_header = next((h for h in failing_headers.keys() if h.lower() == header.lower()), None)
            if failing_header and failing_headers[failing_header] != value:
                comparison["different_headers"].append({
                    "header": header,
                    "working": value,
                    "failing": failing_headers[failing_header]
                })
    
    # Compare cookies
    working_cookies = working.get("cookies", {})
    failing_cookies = failing.get("cookies", {})
    
    for cookie, value in working_cookies.items():
        if cookie not in failing_cookies:
            comparison["missing_cookies"].append({cookie: value})
        elif failing_cookies[cookie] != value:
            comparison["different_cookies"].append({
                "cookie": cookie,
                "working": value,
                "failing": failing_cookies[cookie]
            })
    
    # Compare request bodies
    working_body = working.get("request_body")
    failing_body = failing.get("request_body")
    
    if working_body and failing_body:
        try:
            working_json = json.loads(working_body)
            failing_json = json.loads(failing_body)
            
            # Compare JSON structures
            for key, value in working_json.items():
                if key not in failing_json:
                    comparison["request_body_diff"][f"missing_{key}"] = value
                elif failing_json[key] != value:
                    comparison["request_body_diff"][f"different_{key}"] = {
                        "working": value,
                        "failing": failing_json[key]
                    }
        except json.JSONDecodeError:
            comparison["request_body_diff"]["raw_diff"] = {
                "working": working_body,
                "failing": failing_body
            }
    
    return comparison

def main():
    print("🔍 Analyzing OAuth flows to identify identify request differences...")
    
    # Load flows from the log
    flows = load_flows("meijer2.log")
    print(f"📊 Loaded {len(flows)} flows")
    
    # Extract identify requests
    identify_requests = extract_identify_requests(flows)
    print(f"🎯 Found {len(identify_requests)} identify requests")
    
    if len(identify_requests) >= 2:
        # Assume first is working (200 OK) and last is failing (403 Forbidden)
        working_requests = [req for req in identify_requests if req.get("status_code") == 200]
        failing_requests = [req for req in identify_requests if req.get("status_code") == 403]
        
        if working_requests and failing_requests:
            working = working_requests[0]
            failing = failing_requests[0]
            
            print(f"\n✅ Working request status: {working.get('status_code')}")
            print(f"❌ Failing request status: {failing.get('status_code')}")
            
            # Compare the requests
            comparison = compare_requests(working, failing)
            
            print("\n" + "="*80)
            print("🔍 DETAILED COMPARISON RESULTS")
            print("="*80)
            
            print(f"\n📈 Status Codes:")
            print(f"   Working: {comparison['status_codes']['working']}")
            print(f"   Failing: {comparison['status_codes']['failing']}")
            
            if comparison["missing_headers"]:
                print(f"\n❌ Missing Headers in Selenium Request:")
                for header in comparison["missing_headers"]:
                    for key, value in header.items():
                        print(f"   {key}: {value}")
            
            if comparison["different_headers"]:
                print(f"\n⚠️  Different Header Values:")
                for header in comparison["different_headers"]:
                    print(f"   {header['header']}:")
                    print(f"      Working: {header['working']}")
                    print(f"      Failing: {header['failing']}")
            
            if comparison["missing_cookies"]:
                print(f"\n🍪 Missing Cookies in Selenium Request:")
                for cookie in comparison["missing_cookies"]:
                    for key, value in cookie.items():
                        print(f"   {key}: {value[:50]}..." if len(value) > 50 else f"   {key}: {value}")
            
            if comparison["different_cookies"]:
                print(f"\n🍪 Different Cookie Values:")
                for cookie in comparison["different_cookies"]:
                    print(f"   {cookie['cookie']}:")
                    working_val = cookie['working'][:50] + "..." if len(cookie['working']) > 50 else cookie['working']
                    failing_val = cookie['failing'][:50] + "..." if len(cookie['failing']) > 50 else cookie['failing']
                    print(f"      Working: {working_val}")
                    print(f"      Failing: {failing_val}")
            
            if comparison["request_body_diff"]:
                print(f"\n📋 Request Body Differences:")
                for key, value in comparison["request_body_diff"].items():
                    print(f"   {key}: {value}")
            
            # Save detailed comparison to file
            with open("oauth_flow_comparison.json", "w") as f:
                json.dump({
                    "working_request": working,
                    "failing_request": failing,
                    "comparison": comparison
                }, f, indent=2)
            
            print(f"\n💾 Detailed comparison saved to: oauth_flow_comparison.json")
            
        else:
            print("❌ Could not find both working and failing identify requests")
    else:
        print("❌ Not enough identify requests found for comparison")
    
    # Show all identify requests for reference
    print(f"\n📋 All identify requests found:")
    for i, req in enumerate(identify_requests):
        print(f"   {i+1}. Status: {req.get('status_code')} at {req.get('timestamp')}")

if __name__ == "__main__":
    main() 