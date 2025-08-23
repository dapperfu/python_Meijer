#!/usr/bin/env python3
"""
Extract Bearer tokens and OAuth2 tokens from meijer mitmproxy logs.
Enhanced to find both request headers and OAuth2 token exchange responses.
"""

import json
from typing import Any, Dict, List, Optional

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


def extract_oauth2_tokens(flows: List[HTTPFlow]) -> List[Dict[str, Any]]:
    """Extract OAuth2 token exchange responses that contain refresh tokens."""
    oauth2_responses = []

    for flow in flows:
        if not flow.response or not flow.response.content:
            continue

        # Look for OAuth2 token endpoint responses
        if (
            "oauth2" in flow.request.pretty_url.lower()
            and "token" in flow.request.pretty_url.lower()
            and flow.request.method == "POST"
        ):
            try:
                # Try to parse response as JSON
                response_data = json.loads(
                    flow.response.content.decode("utf-8", errors="ignore")
                )

                # Check if this is a token response with refresh token
                if "access_token" in response_data and "refresh_token" in response_data:
                    token_info = {
                        "timestamp": flow.timestamp_start,
                        "url": flow.request.pretty_url,
                        "method": flow.request.method,
                        "response_status": flow.response.status_code,
                        "access_token": response_data["access_token"],
                        "refresh_token": response_data["refresh_token"],
                        "expires_in": response_data.get("expires_in"),
                        "token_type": response_data.get("token_type", "Bearer"),
                        "scope": response_data.get("scope", ""),
                        "response_data": response_data,
                        "source": "oauth2_token_exchange",
                    }
                    oauth2_responses.append(token_info)

            except (json.JSONDecodeError, UnicodeDecodeError):
                # Skip if response isn't valid JSON
                continue

    # Sort by timestamp (newest first)
    oauth2_responses.sort(key=lambda x: x["timestamp"], reverse=True)
    return oauth2_responses


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
                    "source": "request_header",
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


def find_best_tokens(
    oauth2_responses: List[Dict[str, Any]], bearer_requests: List[Dict[str, Any]]
) -> Optional[Dict[str, Any]]:
    """Find the best available tokens, preferring OAuth2 responses with refresh tokens."""

    # First priority: OAuth2 token exchange with refresh token
    if oauth2_responses:
        for response in oauth2_responses:
            if (
                response.get("refresh_token")
                and response.get("refresh_token").strip()
                and response.get("response_status") == 200
            ):
                return response

    # Second priority: Successful Bearer token from Meijer API calls
    for request in bearer_requests:
        if (
            request.get("status_code")
            and 200 <= request.get("status_code") < 300
            and "meijer.com" in request.get("host", "")
        ):
            return request

    # Fallback: Most recent Bearer token
    if bearer_requests:
        return bearer_requests[0]

    return None


def save_tokens(token_info: Dict[str, Any], output_file: str = None):
    """Save the tokens to the Meijer config directory in the new auth.json format."""

    # Use the Meijer config directory
    import os

    from meijer.auth import get_meijer_config_path

    config_dir = get_meijer_config_path("")
    if not output_file:
        output_file = os.path.join(config_dir, "auth.json")

    # Ensure config directory exists
    os.makedirs(config_dir, exist_ok=True)

    if token_info.get("source") == "oauth2_token_exchange":
        # Save OAuth2 token response in new format
        auth_data = {
            "access_token": token_info["access_token"],
            "refresh_token": token_info["refresh_token"],
            "expires_in": token_info["expires_in"],
            "token_type": token_info["token_type"],
            "scope": token_info["scope"],
            "extracted_at": token_info["timestamp"],
            "source": "oauth2_token_exchange",
        }

        with open(output_file, "w") as f:
            json.dump(auth_data, f, indent=2)

        print(f"💾 OAuth2 tokens saved to {output_file}")
        print(f"   ✅ Access token: {token_info['access_token'][:30]}...")
        print(f"   ✅ Refresh token: {token_info['refresh_token'][:30]}...")
        print(f"   ✅ Expires in: {token_info['expires_in']} seconds")

    else:
        # Save Bearer token from request header in new format
        auth_data = {
            "access_token": token_info["bearer_token"],
            "refresh_token": None,  # No refresh token available
            "expires_in": None,  # Unknown expiration
            "token_type": "Bearer",
            "scope": "",
            "extracted_at": token_info["timestamp"],
            "source": "request_header",
            "url": token_info["url"],
            "status_code": token_info.get("status_code"),
            "user_agent": token_info.get("user_agent", ""),
        }

        with open(output_file, "w") as f:
            json.dump(auth_data, f, indent=2)

        print(f"💾 Bearer token saved to {output_file}")
        print(f"   ⚠️ Access token: {token_info['bearer_token'][:30]}...")
        print("   ❌ No refresh token - tokens cannot be refreshed automatically")

    # Also save a copy in the current directory for backward compatibility
    current_dir_file = "auth.json"
    with open(current_dir_file, "w") as f:
        json.dump(auth_data, f, indent=2)

    print(f"   📄 JSON data also saved to {current_dir_file}")

    # Note: Only JSON format is supported now - no plain text backup files


def main():
    import sys

    # Get log file from command line argument or use default
    if len(sys.argv) > 1:
        log_file = sys.argv[1]
    else:
        # Look for the most recent meijer mitm log
        import glob
        import os

        log_files = glob.glob("meijer_mitm_*.log")
        if log_files:
            # Sort by modification time, newest first
            log_files.sort(key=lambda x: os.path.getmtime(x), reverse=True)
            log_file = log_files[0]
            print(f"🔍 Using most recent log file: {log_file}")
        else:
            log_file = "meijer2.log"  # Default fallback

    print(f"🔍 Extracting tokens from {log_file}...")

    # Load flows from the log
    flows = load_flows(log_file)
    print(f"📊 Loaded {len(flows)} flows")

    # Extract OAuth2 token responses (preferred)
    oauth2_responses = extract_oauth2_tokens(flows)
    print(f"🎯 Found {len(oauth2_responses)} OAuth2 token exchange responses")

    # Extract Bearer tokens from request headers
    bearer_requests = extract_bearer_tokens(flows)
    print(f"🎯 Found {len(bearer_requests)} requests with Bearer tokens")

    # Extract Meijer API calls for context
    meijer_calls = extract_meijer_api_calls(flows)
    meijer_auth_calls = [call for call in meijer_calls if call["has_auth"]]
    print(
        f"🏪 Found {len(meijer_calls)} Meijer API calls ({len(meijer_auth_calls)} with auth)"
    )

    # Show OAuth2 token responses
    if oauth2_responses:
        print("\n🔑 OAuth2 Token Responses (newest first):")
        for i, response in enumerate(oauth2_responses[:5]):  # Show first 5
            print(f"   {i + 1}. {response['method']} {response['url'][:60]}...")
            print(f"      Status: {response['response_status']}")
            print(f"      Access Token: {response['access_token'][:30]}...")
            print(f"      Refresh Token: {response['refresh_token'][:30]}...")
            print(f"      Expires: {response['expires_in']} seconds")
            print(f"      Time: {response['timestamp']}")

    # Show Bearer tokens
    if bearer_requests:
        print("\n📋 Bearer Token Summary (newest first):")
        for i, request in enumerate(bearer_requests[:5]):  # Show first 5
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

    # Find the best available tokens
    best_tokens = find_best_tokens(oauth2_responses, bearer_requests)

    if best_tokens:
        print("\n✅ Selected Best Available Tokens:")
        if best_tokens.get("source") == "oauth2_token_exchange":
            print("   Source: OAuth2 Token Exchange")
            print(f"   URL: {best_tokens['url']}")
            print(f"   Status: {best_tokens['response_status']}")
            print(f"   Access Token: {best_tokens['access_token'][:30]}...")
            print(f"   Refresh Token: {best_tokens['refresh_token'][:30]}...")
            print(f"   Expires: {best_tokens['expires_in']} seconds")
            print("   ✅ Tokens can be refreshed automatically!")
        else:
            print("   Source: Request Header")
            print(f"   URL: {best_tokens['url']}")
            print(f"   Status: {best_tokens.get('status_code', 'Unknown')}")
            print(f"   Token: {best_tokens['bearer_token'][:30]}...")
            print("   ⚠️ No refresh token - tokens cannot be refreshed automatically")
        print(f"   Timestamp: {best_tokens['timestamp']}")

        # Save the tokens to the config directory
        save_tokens(best_tokens)

        # Provide guidance
        if best_tokens.get("source") == "oauth2_token_exchange":
            print("\n🎉 Perfect! You now have tokens with refresh capability.")
            print("   These tokens can be refreshed automatically when they expire.")
        else:
            print("\n⚠️ Note: These tokens cannot be refreshed automatically.")
            print(
                "   To get refreshable tokens, you need to capture an OAuth2 token exchange."
            )
            print(
                "   Try logging in to the Meijer app again and capture the authentication flow."
            )

    else:
        print("\n❌ No tokens found in the log")

    # Show Meijer API call patterns
    if meijer_auth_calls:
        print("\n📊 Recent Meijer API Calls with Auth (newest first):")
        for i, call in enumerate(meijer_auth_calls[:5]):  # Show first 5
            status = f" ({call.get('status_code')})" if call.get("status_code") else ""
            print(
                f"   {i + 1}. {call['method']} {call['host']}{call['path'][:60]}...{status}"
            )
            print(f"      Auth: {call['auth_type']}")

    # Save detailed analysis
    analysis_data = {
        "total_flows": len(flows),
        "oauth2_responses": oauth2_responses,
        "bearer_requests": bearer_requests,
        "meijer_api_calls": meijer_calls,
        "selected_tokens": best_tokens,
    }

    with open("token_analysis.json", "w") as f:
        json.dump(analysis_data, f, indent=2)

    print("\n📄 Detailed analysis saved to: token_analysis.json")


if __name__ == "__main__":
    main()
