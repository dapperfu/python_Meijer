#!/usr/bin/env python3
"""
Comprehensive Meijer authentication analysis tool.
Looks for tokens in response bodies, different header patterns, and authentication flows.
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


def extract_meijer_flows(flows: List[HTTPFlow]) -> List[Dict[str, Any]]:
    """Extract all Meijer-related flows with detailed analysis."""
    meijer_flows = []

    for flow in flows:
        if not flow.request or not flow.request.pretty_host:
            continue

        # Look for Meijer-related domains
        host = flow.request.pretty_host.lower()
        if any(
            domain in host
            for domain in ["meijer.com", "id.meijer.com", "api.meijer.com"]
        ):
            flow_data = {
                "timestamp": flow.timestamp_start,
                "url": flow.request.pretty_url,
                "method": flow.request.method,
                "host": flow.request.pretty_host,
                "path": flow.request.path,
                "status_code": flow.response.status_code if flow.response else None,
                "request_headers": dict(flow.request.headers)
                if flow.request.headers
                else {},
                "response_headers": dict(flow.response.headers)
                if flow.response and flow.response.headers
                else {},
                "request_body": None,
                "response_body": None,
                "auth_patterns": [],
                "potential_tokens": [],
            }

            # Extract request body
            if flow.request.content:
                try:
                    if flow.request.headers.get("content-type", "").startswith(
                        "application/json"
                    ):
                        flow_data["request_body"] = json.loads(
                            flow.request.content.decode("utf-8", errors="ignore")
                        )
                    else:
                        flow_data["request_body"] = flow.request.content.decode(
                            "utf-8", errors="ignore"
                        )
                except:
                    flow_data["request_body"] = flow.request.content.decode(
                        "utf-8", errors="ignore"
                    )

            # Extract response body
            if flow.response and flow.response.content:
                try:
                    content_type = flow.response.headers.get("content-type", "")
                    if "application/json" in content_type:
                        flow_data["response_body"] = json.loads(
                            flow.response.content.decode("utf-8", errors="ignore")
                        )
                    elif "text/" in content_type:
                        flow_data["response_body"] = flow.response.content.decode(
                            "utf-8", errors="ignore"
                        )
                    else:
                        # Try to decode as text anyway
                        flow_data["response_body"] = flow.request.content.decode(
                            "utf-8", errors="ignore"
                        )
                except:
                    flow_data["response_body"] = flow.response.content.decode(
                        "utf-8", errors="ignore"
                    )

            # Analyze authentication patterns
            flow_data["auth_patterns"] = analyze_auth_patterns(flow_data)

            # Look for potential tokens in response bodies
            flow_data["potential_tokens"] = extract_potential_tokens(flow_data)

            meijer_flows.append(flow_data)

    # Sort by timestamp (newest first)
    meijer_flows.sort(key=lambda x: x["timestamp"], reverse=True)
    return meijer_flows


def analyze_auth_patterns(flow_data: Dict[str, Any]) -> List[str]:
    """Analyze authentication patterns in the flow."""
    patterns = []

    # Check request headers
    req_headers = flow_data.get("request_headers", {})

    if "authorization" in req_headers:
        auth_header = req_headers["authorization"]
        if auth_header.startswith("Bearer "):
            patterns.append(f"Bearer token in request: {auth_header[:50]}...")
        else:
            patterns.append(f"Other authorization: {auth_header[:50]}...")

    if "ocp-apim-subscription-key" in req_headers:
        patterns.append(
            f"API subscription key: {req_headers['ocp-apim-subscription-key'][:20]}..."
        )

    if "cookie" in req_headers:
        patterns.append(f"Cookie authentication: {req_headers['cookie'][:50]}...")

    if "x-auth-time" in req_headers:
        patterns.append(f"Auth timestamp: {req_headers['x-auth-time']}")

    # Check response headers
    resp_headers = flow_data.get("response_headers", {})

    if "set-cookie" in resp_headers:
        patterns.append(f"Set-Cookie in response: {resp_headers['set-cookie'][:50]}...")

    if "authorization" in resp_headers:
        patterns.append(
            f"Authorization in response: {resp_headers['authorization'][:50]}..."
        )

    return patterns


def extract_potential_tokens(flow_data: Dict[str, Any]) -> List[Dict[str, Any]]:
    """Extract potential tokens from response bodies."""
    tokens = []

    # Look in response body
    response_body = flow_data.get("response_body")
    if not response_body:
        return tokens

    # Convert to string if it's a dict
    if isinstance(response_body, dict):
        response_text = json.dumps(response_body)
    else:
        response_text = str(response_body)

    # Look for JWT tokens (3 parts separated by dots)
    jwt_pattern = r"[A-Za-z0-9-_]+\.[A-Za-z0-9-_]+\.[A-Za-z0-9-_]+"
    jwt_matches = re.findall(jwt_pattern, response_text)
    for match in jwt_matches:
        if len(match) > 50:  # Likely a real JWT
            tokens.append(
                {
                    "type": "JWT",
                    "value": match,
                    "location": "response_body",
                    "context": "JWT pattern match",
                }
            )

    # Look for Bearer token patterns
    bearer_pattern = r"Bearer\s+([A-Za-z0-9-_\.]+)"
    bearer_matches = re.findall(bearer_pattern, response_text)
    for match in bearer_matches:
        if len(match) > 20:  # Likely a real token
            tokens.append(
                {
                    "type": "Bearer",
                    "value": match,
                    "location": "response_body",
                    "context": "Bearer pattern match",
                }
            )

    # Look for access_token fields
    if isinstance(response_body, dict):
        access_token = response_body.get("access_token")
        if access_token and isinstance(access_token, str) and len(access_token) > 20:
            tokens.append(
                {
                    "type": "access_token",
                    "value": access_token,
                    "location": "response_body.access_token",
                    "context": "Direct field access",
                }
            )

        # Look for nested token fields
        for key, value in response_body.items():
            if isinstance(value, dict):
                nested_token = (
                    value.get("access_token")
                    or value.get("token")
                    or value.get("bearer_token")
                )
                if (
                    nested_token
                    and isinstance(nested_token, str)
                    and len(nested_token) > 20
                ):
                    tokens.append(
                        {
                            "type": "nested_token",
                            "value": nested_token,
                            "location": f"response_body.{key}.token_field",
                            "context": "Nested token field",
                        }
                    )

    return tokens


def find_authentication_flows(flows: List[Dict[str, Any]]) -> List[Dict[str, Any]]:
    """Find potential authentication flows by looking for login/oauth endpoints."""
    auth_flows = []

    for flow in flows:
        path = flow.get("path", "").lower()

        # Look for authentication-related endpoints
        if any(
            keyword in path
            for keyword in ["login", "auth", "oauth", "token", "signin", "challenge"]
        ):
            auth_flows.append(
                {
                    "timestamp": flow["timestamp"],
                    "url": flow["url"],
                    "method": flow["method"],
                    "status_code": flow["status_code"],
                    "auth_patterns": flow["auth_patterns"],
                    "potential_tokens": flow["potential_tokens"],
                    "request_body": flow.get("request_body"),
                    "response_body": flow.get("response_body"),
                }
            )

    return auth_flows


def main():
    import sys

    if len(sys.argv) > 1:
        log_file = sys.argv[1]
    else:
        print("Usage: python analyze_meijer_auth.py <log_file>")
        return

    print(f"🔍 Analyzing Meijer authentication patterns in {log_file}...")

    # Load flows
    flows = load_flows(log_file)
    print(f"📊 Loaded {len(flows)} total flows")

    # Extract Meijer flows
    meijer_flows = extract_meijer_flows(flows)
    print(f"🏪 Found {len(meijer_flows)} Meijer-related flows")

    # Find authentication flows
    auth_flows = find_authentication_flows(meijer_flows)
    print(f"🔐 Found {len(auth_flows)} potential authentication flows")

    # Show authentication patterns
    print("\n📋 Authentication Patterns Found:")
    pattern_counts = {}
    for flow in meijer_flows:
        for pattern in flow["auth_patterns"]:
            pattern_counts[pattern] = pattern_counts.get(pattern, 0) + 1

    for pattern, count in sorted(pattern_counts.items()):
        print(f"   {pattern}: {count} occurrences")

    # Show potential tokens
    all_tokens = []
    for flow in meijer_flows:
        all_tokens.extend(flow["potential_tokens"])

    print(f"\n🎯 Potential Tokens Found: {len(all_tokens)}")
    for i, token in enumerate(all_tokens[:10]):  # Show first 10
        print(
            f"   {i + 1}. {token['type']} token ({token['location']}): {token['value'][:30]}..."
        )
        print(f"      Context: {token['context']}")

    # Show authentication flows
    if auth_flows:
        print("\n🔐 Authentication Flows (newest first):")
        for i, flow in enumerate(auth_flows[:5]):  # Show first 5
            print(f"   {i + 1}. {flow['method']} {flow.get('path', 'N/A')}")
            print(f"      Status: {flow['status_code']}")
            print(f"      Patterns: {', '.join(flow['auth_patterns'])}")
            if flow["potential_tokens"]:
                print(f"      Tokens: {len(flow['potential_tokens'])} found")

    # Save detailed analysis
    analysis_data = {
        "total_flows": len(flows),
        "meijer_flows": meijer_flows,
        "authentication_flows": auth_flows,
        "all_potential_tokens": all_tokens,
        "pattern_counts": pattern_counts,
    }

    output_file = "meijer_auth_analysis.json"
    with open(output_file, "w") as f:
        json.dump(analysis_data, f, indent=2)

    print(f"\n📄 Detailed analysis saved to: {output_file}")

    # Summary
    print("\n📊 Summary:")
    print(f"   Total flows: {len(flows)}")
    print(f"   Meijer flows: {len(meijer_flows)}")
    print(f"   Auth flows: {len(auth_flows)}")
    print(f"   Potential tokens: {len(all_tokens)}")
    print(f"   Auth patterns: {len(pattern_counts)}")


if __name__ == "__main__":
    main()
