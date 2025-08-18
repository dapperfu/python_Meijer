#!/usr/bin/env python3
"""
Targeted tool to find Meijer authentication tokens in response bodies and specific auth flows.
"""

import json
from typing import Dict, List, Any
from mitmproxy import io
from mitmproxy.http import HTTPFlow
import re


def load_flows(log_file: str) -> List[HTTPFlow]:
    """Load flows from mitmproxy log file."""
    flows = []
    with open(log_file, "rb") as f:
        reader = io.FlowReader(f)
        for flow in reader.stream():
            if isinstance(flow, HTTPFlow):
                flows.append(flow)
    return flows


def find_auth_flows(flows: List[HTTPFlow]) -> List[Dict[str, Any]]:
    """Find authentication-related flows."""
    auth_flows = []
    
    for flow in flows:
        if not flow.request or not flow.response:
            continue
            
        # Look for authentication-related endpoints
        path = flow.request.path.lower()
        host = flow.request.pretty_host.lower()
        
        # Check if this is a Meijer domain
        if not any(domain in host for domain in ['meijer.com', 'id.meijer.com', 'api.meijer.com']):
            continue
            
        # Look for auth-related paths
        if any(keyword in path for keyword in ['login', 'auth', 'oauth', 'token', 'signin', 'challenge', 'sdk']):
            flow_data = {
                "timestamp": flow.timestamp_start,
                "url": flow.request.pretty_url,
                "method": flow.request.method,
                "host": flow.request.pretty_host,
                "path": flow.request.path,
                "status_code": flow.response.status_code,
                "request_headers": dict(flow.request.headers) if flow.request.headers else {},
                "response_headers": dict(flow.response.headers) if flow.response.headers else {},
                "request_body": None,
                "response_body": None,
                "response_text": None
            }
            
            # Extract request body
            if flow.request.content:
                try:
                    if flow.request.headers.get("content-type", "").startswith("application/json"):
                        flow_data["request_body"] = json.loads(flow.request.content.decode('utf-8', errors='ignore'))
                    else:
                        flow_data["request_body"] = flow.request.content.decode('utf-8', errors='ignore')
                except:
                    flow_data["request_body"] = flow.request.content.decode('utf-8', errors='ignore')
            
            # Extract response body
            if flow.response.content:
                try:
                    content_type = flow.response.headers.get("content-type", "")
                    if "application/json" in content_type:
                        flow_data["response_body"] = json.loads(flow.response.content.decode('utf-8', errors='ignore'))
                        flow_data["response_text"] = flow.response.content.decode('utf-8', errors='ignore')
                    elif "text/" in content_type or "javascript" in content_type:
                        flow_data["response_text"] = flow.response.content.decode('utf-8', errors='ignore')
                    else:
                        # Try to decode as text anyway
                        flow_data["response_text"] = flow.response.content.decode('utf-8', errors='ignore')
                except:
                    flow_data["response_text"] = flow.response.content.decode('utf-8', errors='ignore')
            
            auth_flows.append(flow_data)
    
    return auth_flows


def search_for_tokens(text: str, context: str) -> List[Dict[str, Any]]:
    """Search for various token patterns in text."""
    tokens = []
    
    if not text:
        return tokens
    
    # JWT tokens (3 parts separated by dots)
    jwt_pattern = r'[A-Za-z0-9-_]+\.[A-Za-z0-9-_]+\.[A-Za-z0-9-_]+'
    jwt_matches = re.findall(jwt_pattern, text)
    for match in jwt_matches:
        if len(match) > 50:  # Likely a real JWT
            tokens.append({
                "type": "JWT",
                "value": match,
                "context": context,
                "length": len(match)
            })
    
    # Bearer token patterns
    bearer_pattern = r'Bearer\s+([A-Za-z0-9-_\.]+)'
    bearer_matches = re.findall(bearer_pattern, text)
    for match in bearer_matches:
        if len(match) > 20:  # Likely a real token
            tokens.append({
                "type": "Bearer",
                "value": match,
                "context": context,
                "length": len(match)
            })
    
    # Access tokens
    access_pattern = r'"access_token"\s*:\s*"([^"]+)"'
    access_matches = re.findall(access_pattern, text)
    for match in access_matches:
        if len(match) > 20:
            tokens.append({
                "type": "access_token",
                "value": match,
                "context": context,
                "length": len(match)
            })
    
    # Token fields
    token_pattern = r'"token"\s*:\s*"([^"]+)"'
    token_matches = re.findall(token_pattern, text)
    for match in token_matches:
        if len(match) > 20:
            tokens.append({
                "type": "token_field",
                "value": match,
                "context": context,
                "length": len(match)
            })
    
    # Authorization headers
    auth_pattern = r'"authorization"\s*:\s*"([^"]+)"'
    auth_matches = re.findall(auth_pattern, text)
    for match in auth_matches:
        if len(match) > 20:
            tokens.append({
                "type": "authorization_header",
                "value": match,
                "context": context,
                "length": len(match)
            })
    
    return tokens


def main():
    import sys
    
    if len(sys.argv) > 1:
        log_file = sys.argv[1]
    else:
        print("Usage: python find_meijer_tokens.py <log_file>")
        return
    
    print(f"🔍 Searching for Meijer authentication tokens in {log_file}...")
    
    # Load flows
    flows = load_flows(log_file)
    print(f"📊 Loaded {len(flows)} total flows")
    
    # Find authentication flows
    auth_flows = find_auth_flows(flows)
    print(f"🔐 Found {len(auth_flows)} authentication-related flows")
    
    # Search for tokens in each flow
    all_tokens = []
    
    for i, flow in enumerate(auth_flows):
        print(f"\n--- Flow {i+1}: {flow['method']} {flow['path']} ---")
        print(f"Status: {flow['status_code']}")
        print(f"Host: {flow['host']}")
        
        # Search in request body
        if flow['request_body']:
            if isinstance(flow['request_body'], dict):
                request_text = json.dumps(flow['request_body'])
            else:
                request_text = str(flow['request_body'])
            
            tokens = search_for_tokens(request_text, f"request_body_{i+1}")
            if tokens:
                print(f"  Found {len(tokens)} tokens in request body:")
                for token in tokens:
                    print(f"    {token['type']}: {token['value'][:50]}...")
                all_tokens.extend(tokens)
        
        # Search in response body
        if flow['response_text']:
            tokens = search_for_tokens(flow['response_text'], f"response_body_{i+1}")
            if tokens:
                print(f"  Found {len(tokens)} tokens in response body:")
                for token in tokens:
                    print(f"    {token['type']}: {token['value'][:50]}...")
                all_tokens.extend(tokens)
        
        # Show response headers that might contain tokens
        response_headers = flow['response_headers']
        for header_name, header_value in response_headers.items():
            if any(keyword in header_name.lower() for keyword in ['token', 'auth', 'authorization']):
                print(f"  {header_name}: {header_value[:100]}...")
    
    # Summary
    print(f"\n🎯 Total tokens found: {len(all_tokens)}")
    if all_tokens:
        print("\n📋 Token Summary:")
        for i, token in enumerate(all_tokens):
            print(f"  {i+1}. {token['type']} ({token['length']} chars): {token['value'][:30]}...")
            print(f"     Context: {token['context']}")
    
    # Save results
    results = {
        "total_flows": len(flows),
        "auth_flows": auth_flows,
        "tokens_found": all_tokens
    }
    
    output_file = "meijer_token_search.json"
    with open(output_file, "w") as f:
        json.dump(results, f, indent=2)
    
    print(f"\n📄 Results saved to: {output_file}")


if __name__ == "__main__":
    main() 