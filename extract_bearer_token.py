#!/usr/bin/env python3
"""
Extract Bearer token from meijer2.log for temporary authentication bypass.
"""

import json
from typing import Dict, List, Any, Optional
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


def extract_bearer_tokens(flows: List[HTTPFlow]) -> List[Dict[str, Any]]:
    """Extract all Bearer tokens from flows, sorted by timestamp (newest first)."""
    bearer_requests = []

    for flow in flows:
        if flow.request and hasattr(flow.request, "headers"):
            headers = dict(flow.request.headers)

            # Look for Authorization header with Bearer token
            auth_header = None
            for header_name, header_value in headers.items():
                if header_name.lower() == "authorization":
                    auth_header = header_value
                    break

            if auth_header and auth_header.startswith("Bearer "):
                bearer_token = auth_header[7:]  # Remove "Bearer " prefix

                request_data = {
                    "timestamp": flow.timestamp_start,
                    "url": flow.request.pretty_url,
                    "method": flow.request.method,
                    "bearer_token": bearer_token,
                    "status_code": flow.response.status_code if flow.response else None,
                    "host": flow.request.pretty_host,
                    "path": flow.request.path,
                    "user_agent": headers.get("user-agent", ""),
                    "all_headers": headers,
                }

                bearer_requests.append(request_data)

    # Sort by timestamp (newest first)
    bearer_requests.sort(key=lambda x: x["timestamp"], reverse=True)
    return bearer_requests


def extract_meijer_api_calls(flows: List[HTTPFlow]) -> List[Dict[str, Any]]:
    """Extract Meijer API calls to understand the authentication pattern."""
    meijer_api_calls = []

    for flow in flows:
        if (
            flow.request
            and flow.request.pretty_host
            and (
                "meijer.com" in flow.request.pretty_host
                or "api.meijer.com" in flow.request.pretty_host
            )
        ):
            headers = dict(flow.request.headers) if flow.request.headers else {}

            # Look for API calls with authentication
            auth_header = headers.get("authorization", headers.get("Authorization", ""))

            api_call = {
                "timestamp": flow.timestamp_start,
                "url": flow.request.pretty_url,
                "method": flow.request.method,
                "host": flow.request.pretty_host,
                "path": flow.request.path,
                "status_code": flow.response.status_code if flow.response else None,
                "has_auth": bool(auth_header),
                "auth_type": "Bearer"
                if auth_header.startswith("Bearer ")
                else "Other"
                if auth_header
                else "None",
                "headers": headers,
            }

            if auth_header:
                api_call["auth_header"] = auth_header

            meijer_api_calls.append(api_call)

    # Sort by timestamp (newest first)
    meijer_api_calls.sort(key=lambda x: x["timestamp"], reverse=True)
    return meijer_api_calls


def find_valid_bearer_token(
    bearer_requests: List[Dict[str, Any]],
) -> Optional[Dict[str, Any]]:
    """Find the most recent valid Bearer token."""
    for request in bearer_requests:
        # Look for successful API calls (2xx status codes)
        if request.get("status_code") and 200 <= request.get("status_code") < 300:
            # Prefer Meijer API calls
            if "meijer.com" in request.get("host", ""):
                return request

    # If no successful Meijer API calls, return the most recent Bearer token
    if bearer_requests:
        return bearer_requests[0]

    return None


def save_bearer_token(token_info: Dict[str, Any], output_file: str = "bearer_auth.txt"):
    """Save the Bearer token to a file for use by other scripts."""
    with open(output_file, "w") as f:
        f.write(f"# Bearer token extracted from meijer2.log\n")
        f.write(f"# Timestamp: {token_info['timestamp']}\n")
        f.write(f"# From URL: {token_info['url']}\n")
        f.write(f"# Status: {token_info.get('status_code', 'Unknown')}\n")
        f.write(f"bearer_token={token_info['bearer_token']}\n")
        f.write(f"user_agent={token_info['user_agent']}\n")

    # Also save as JSON for programmatic access
    with open("bearer_auth.json", "w") as f:
        json.dump(token_info, f, indent=2)


def main():
    print("🔍 Extracting Bearer tokens from meijer2.log...")

    # Load flows from the log
    flows = load_flows("meijer2.log")
    print(f"📊 Loaded {len(flows)} flows")

    # Extract Bearer tokens
    bearer_requests = extract_bearer_tokens(flows)
    print(f"🎯 Found {len(bearer_requests)} requests with Bearer tokens")

    # Extract Meijer API calls for context
    meijer_calls = extract_meijer_api_calls(flows)
    meijer_auth_calls = [call for call in meijer_calls if call["has_auth"]]
    print(
        f"🏪 Found {len(meijer_calls)} Meijer API calls ({len(meijer_auth_calls)} with auth)"
    )

    if bearer_requests:
        print(f"\n📋 Bearer Token Summary (newest first):")
        for i, request in enumerate(bearer_requests[:10]):  # Show first 10
            status = (
                f" ({request.get('status_code')})" if request.get("status_code") else ""
            )
            print(
                f"   {i + 1}. {request['method']} {request['host']}{request['path'][:50]}...{status}"
            )
            print(
                f"      Token: {request['bearer_token'][:20]}...{request['bearer_token'][-10:]}"
            )
            print(f"      Time: {request['timestamp']}")

        # Find the best Bearer token
        valid_token = find_valid_bearer_token(bearer_requests)

        if valid_token:
            print(f"\n✅ Selected Bearer Token:")
            print(f"   URL: {valid_token['url']}")
            print(f"   Status: {valid_token.get('status_code', 'Unknown')}")
            print(
                f"   Token: {valid_token['bearer_token'][:30]}...{valid_token['bearer_token'][-15:]}"
            )
            print(f"   Timestamp: {valid_token['timestamp']}")

            # Save the token
            save_bearer_token(valid_token)
            print(f"\n💾 Bearer token saved to:")
            print(f"   - bearer_auth.txt (human readable)")
            print(f"   - bearer_auth.json (machine readable)")

        else:
            print("\n❌ No valid Bearer token found")
    else:
        print("\n❌ No Bearer tokens found in the log")

    # Show Meijer API call patterns
    if meijer_auth_calls:
        print(f"\n📊 Recent Meijer API Calls with Auth (newest first):")
        for i, call in enumerate(meijer_auth_calls[:5]):  # Show first 5
            status = f" ({call.get('status_code')})" if call.get("status_code") else ""
            print(
                f"   {i + 1}. {call['method']} {call['host']}{call['path'][:60]}...{status}"
            )
            print(f"      Auth: {call['auth_type']}")

    # Save detailed analysis
    analysis_data = {
        "total_flows": len(flows),
        "bearer_requests": bearer_requests,
        "meijer_api_calls": meijer_calls,
        "selected_token": valid_token,
    }

    with open("bearer_token_analysis.json", "w") as f:
        json.dump(analysis_data, f, indent=2)

    print(f"\n📄 Detailed analysis saved to: bearer_token_analysis.json")


if __name__ == "__main__":
    main()
