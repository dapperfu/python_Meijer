#!/usr/bin/env python3
"""
Analyze complex promotions endpoint from mitmproxy log.
Focus on finding the correct authentication headers and workflow.
"""

import json
from pathlib import Path
from typing import Dict, List, Any
from mitmproxy import io
from mitmproxy.http import HTTPFlow


def load_flows(log_file: str) -> List[HTTPFlow]:
    """Load flows from mitmproxy log file."""
    flows = []
    try:
        with open(log_file, "rb") as f:
            reader = io.FlowReader(f)
            for flow in reader.stream():
                if isinstance(flow, HTTPFlow):
                    flows.append(flow)
    except Exception as e:
        print(f"❌ Error loading flows: {e}")
    return flows


def analyze_complex_promotions(flows: List[HTTPFlow]) -> Dict[str, Any]:
    """Analyze complex promotions endpoint calls."""
    complex_promo_flows = []
    
    for flow in flows:
        if not flow.request or not flow.request.pretty_host:
            continue
            
        # Look for complex promotions endpoint
        if "complexpromos" in flow.request.path:
            flow_data = {
                "timestamp": flow.timestamp_start,
                "url": flow.request.pretty_url,
                "method": flow.request.method,
                "host": flow.request.pretty_host,
                "path": flow.request.path,
                "status_code": flow.response.status_code if flow.response else None,
                "request_headers": dict(flow.request.headers) if flow.request.headers else {},
                "response_headers": dict(flow.response.headers) if flow.response and flow.response.headers else {},
                "request_body": None,
                "response_body": None,
                "auth_headers": {},
                "error_details": None
            }
            
            # Extract request body
            if flow.request.content:
                try:
                    if flow.request.headers.get("content-type", "").startswith("application/json"):
                        flow_data["request_body"] = json.loads(flow.request.content.decode("utf-8", errors="ignore"))
                    else:
                        flow_data["request_body"] = flow.request.content.decode("utf-8", errors="ignore")
                except:
                    flow_data["request_body"] = flow.request.content.decode("utf-8", errors="ignore")
            
            # Extract response body
            if flow.response and flow.response.content:
                try:
                    content_type = flow.response.headers.get("content-type", "")
                    if "application/json" in content_type:
                        flow_data["response_body"] = json.loads(flow.response.content.decode("utf-8", errors="ignore"))
                    elif "text/" in content_type:
                        flow_data["response_body"] = flow.response.content.decode("utf-8", errors="ignore")
                    else:
                        flow_data["response_body"] = flow.response.content.decode("utf-8", errors="ignore")
                except:
                    flow_data["response_body"] = flow.response.content.decode("utf-8", errors="ignore")
            
            # Extract authentication headers
            auth_headers = {}
            for header, value in flow.request.headers.items():
                header_lower = header.lower()
                if any(auth_key in header_lower for auth_key in ["authorization", "bearer", "token", "x-", "cookie"]):
                    auth_headers[header] = value
            flow_data["auth_headers"] = auth_headers
            
            # Check for errors
            if flow.response and flow.response.status_code >= 400:
                flow_data["error_details"] = {
                    "status_code": flow.response.status_code,
                    "status_text": flow.response.reason,
                    "error_body": flow_data["response_body"]
                }
            
            complex_promo_flows.append(flow_data)
    
    return {
        "total_flows": len(complex_promo_flows),
        "flows": complex_promo_flows,
        "successful_calls": len([f for f in complex_promo_flows if f["status_code"] and f["status_code"] < 400]),
        "failed_calls": len([f for f in complex_promo_flows if f["status_code"] and f["status_code"] >= 400]),
        "auth_patterns": extract_auth_patterns(complex_promo_flows)
    }


def extract_auth_patterns(flows: List[Dict]) -> Dict[str, Any]:
    """Extract authentication patterns from flows."""
    auth_patterns = {
        "headers_used": set(),
        "successful_auth": {},
        "failed_auth": {},
        "common_headers": {}
    }
    
    for flow in flows:
        # Collect all headers used
        for header in flow["auth_headers"].keys():
            auth_patterns["headers_used"].add(header)
        
        # Analyze successful vs failed calls
        if flow["status_code"] and flow["status_code"] < 400:
            # Successful call
            for header, value in flow["auth_headers"].items():
                if header not in auth_patterns["successful_auth"]:
                    auth_patterns["successful_auth"][header] = []
                auth_patterns["successful_auth"][header].append(value)
        else:
            # Failed call
            for header, value in flow["auth_headers"].items():
                if header not in auth_patterns["failed_auth"]:
                    auth_patterns["failed_auth"][header] = []
                auth_patterns["failed_auth"][header].append(value)
    
    # Convert sets to lists for JSON serialization
    auth_patterns["headers_used"] = list(auth_patterns["headers_used"])
    
    return auth_patterns


def main():
    """Main analysis function."""
    print("🔍 Complex Promotions Endpoint Analysis")
    print("=" * 50)
    
    # Find log file
    log_file = Path("../logs/meijer_mitm_20250822_2030.log")
    
    if not log_file.exists():
        print(f"❌ Log file not found: {log_file}")
        return
    
    print(f"📁 Analyzing: {log_file}")
    
    # Load flows
    print("🔄 Loading flows...")
    flows = load_flows(str(log_file))
    print(f"✅ Loaded {len(flows)} flows")
    
    # Analyze complex promotions
    print("🔍 Analyzing complex promotions endpoint...")
    analysis = analyze_complex_promotions(flows)
    
    # Print results
    print("\n📊 Analysis Results:")
    print(f"  Total complex promo calls: {analysis['total_flows']}")
    print(f"  Successful calls: {analysis['successful_calls']}")
    print(f"  Failed calls: {analysis['failed_calls']}")
    
    if analysis['flows']:
        print("\n🔑 Authentication Headers Used:")
        for header in analysis['auth_patterns']['headers_used']:
            print(f"  - {header}")
        
        print("\n✅ Successful Authentication Patterns:")
        for header, values in analysis['auth_patterns']['successful_auth'].items():
            unique_values = list(set(values))
            print(f"  {header}: {len(unique_values)} unique values")
            if len(unique_values) <= 3:
                for value in unique_values:
                    print(f"    - {value[:100]}{'...' if len(value) > 100 else ''}")
        
        print("\n❌ Failed Authentication Patterns:")
        for header, values in analysis['auth_patterns']['failed_auth'].items():
            unique_values = list(set(values))
            print(f"  {header}: {len(unique_values)} unique values")
            if len(unique_values) <= 3:
                for value in unique_values:
                    print(f"    - {value[:100]}{'...' if len(value) > 100 else ''}")
        
        # Show sample successful and failed flows
        successful_flows = [f for f in analysis['flows'] if f["status_code"] and f["status_code"] < 400]
        failed_flows = [f for f in analysis['flows'] if f["status_code"] and f["status_code"] >= 400]
        
        if successful_flows:
            print("\n✅ Sample Successful Call:")
            sample = successful_flows[0]
            print(f"  URL: {sample['url']}")
            print(f"  Status: {sample['status_code']}")
            print(f"  Auth Headers: {list(sample['auth_headers'].keys())}")
        
        if failed_flows:
            print("\n❌ Sample Failed Call:")
            sample = failed_flows[0]
            print(f"  URL: {sample['url']}")
            print(f"  Status: {sample['status_code']}")
            print(f"  Auth Headers: {list(sample['auth_headers'].keys())}")
            if sample['error_details']:
                print(f"  Error: {sample['error_details']['status_text']}")
    
    # Save detailed report
    output_file = "complex_promotions_analysis.json"
    with open(output_file, 'w') as f:
        json.dump(analysis, f, indent=2, default=str)
    print(f"\n💾 Detailed report saved to: {output_file}")
    
    print("\n✨ Analysis completed!")


if __name__ == "__main__":
    main()
