#!/usr/bin/env python3
"""
Focused Authentication Flow Analysis

This script analyzes the latest Okta login workflow to understand the complete
authentication flow from device fingerprinting to token acquisition.
"""

import json
import re
from typing import Any, Dict, List
from datetime import datetime

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


def find_auth_flows(flows: List[HTTPFlow]) -> List[Dict[str, Any]]:
    """Find authentication-related flows focusing on OKTA endpoints."""
    auth_flows = []

    for flow in flows:
        if not flow.request or not flow.response:
            continue

        # Focus on OKTA and Meijer authentication endpoints
        path = flow.request.path.lower()
        host = flow.request.pretty_host.lower()

        # Check if this is a relevant domain
        if not any(domain in host for domain in ["id.meijer.com", "www.meijer.com", "okta.com", "meijer.okta.com"]):
            continue

        # Look for auth-related paths
        if any(
            keyword in path
            for keyword in [
                "oauth2",
                "login",
                "auth",
                "signin",
                "challenge",
                "idx",
                "logout",
                "fingerprint",
                "device",
                "token",
                "refresh",
                "authorize",
                "callback",
                "session",
                "profile",
                "userinfo",
                "introspect"
            ]
        ):
            flow_data = {
                "timestamp": flow.timestamp_start,
                "url": flow.request.pretty_url,
                "method": flow.request.method,
                "host": flow.request.pretty_host,
                "path": flow.request.path,
                "status_code": flow.response.status_code,
                "request_headers": dict(flow.request.headers)
                if flow.request.headers
                else {},
                "response_headers": dict(flow.response.headers)
                if flow.response.headers
                else {},
                "request_body": None,
                "response_body": None,
                "cookies": {},
                "set_cookies": [],
            }

            # Extract cookies from request
            if flow.request.headers:
                cookie_header = flow.request.headers.get("cookie", "")
                if cookie_header:
                    # Parse cookies
                    cookies = {}
                    for cookie in cookie_header.split("; "):
                        if "=" in cookie:
                            name, value = cookie.split("=", 1)
                            cookies[name] = value
                    flow_data["cookies"] = cookies

            # Extract Set-Cookie headers from response
            if flow.response.headers:
                set_cookies = []
                for header_name, header_value in flow.response.headers.items():
                    if header_name.lower() == "set-cookie":
                        set_cookies.append(header_value)
                flow_data["set_cookies"] = set_cookies

            # Extract request body
            if flow.request.content:
                try:
                    content_type = flow.request.headers.get("content-type", "")
                    if "application/json" in content_type:
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
            if flow.response.content:
                try:
                    content_type = flow.response.headers.get("content-type", "")
                    if "application/json" in content_type:
                        flow_data["response_body"] = json.loads(
                            flow.response.content.decode("utf-8", errors="ignore")
                        )
                    else:
                        flow_data["response_body"] = flow.response.content.decode(
                            "utf-8", errors="ignore"
                        )
                except:
                    flow_data["response_body"] = flow.response.content.decode(
                        "utf-8", errors="ignore"
                    )

            auth_flows.append(flow_data)

    return auth_flows


def analyze_auth_patterns(auth_flows: List[Dict[str, Any]]) -> Dict[str, Any]:
    """Analyze authentication flow patterns."""
    analysis = {
        "total_auth_flows": len(auth_flows),
        "endpoints": {},
        "cookie_progression": {},
        "flow_sequences": [],
        "key_findings": [],
        "device_fingerprinting": [],
        "token_acquisition": [],
        "oauth2_flow": [],
        "authentication_steps": []
    }

    # Group flows by endpoint
    for flow in auth_flows:
        endpoint = flow["path"]
        if endpoint not in analysis["endpoints"]:
            analysis["endpoints"][endpoint] = {
                "count": 0,
                "methods": set(),
                "status_codes": set(),
                "flows": [],
            }

        analysis["endpoints"][endpoint]["count"] += 1
        analysis["endpoints"][endpoint]["methods"].add(flow["method"])
        analysis["endpoints"][endpoint]["status_codes"].add(flow["status_code"])
        analysis["endpoints"][endpoint]["flows"].append(flow)

    # Convert sets to lists for JSON serialization
    for endpoint_data in analysis["endpoints"].values():
        endpoint_data["methods"] = list(endpoint_data["methods"])
        endpoint_data["status_codes"] = list(endpoint_data["status_codes"])

    # Analyze cookie progression
    cookie_names = set()
    for flow in auth_flows:
        cookie_names.update(flow["cookies"].keys())
        for set_cookie in flow["set_cookies"]:
            # Extract cookie name from Set-Cookie header
            if "=" in set_cookie:
                cookie_name = set_cookie.split("=")[0]
                cookie_names.add(cookie_name)

    analysis["cookie_progression"]["all_cookies"] = list(cookie_names)

    # Look for specific authentication patterns
    oauth2_flows = [f for f in auth_flows if "oauth2" in f["path"]]
    login_flows = [f for f in auth_flows if "login" in f["path"]]
    logout_flows = [f for f in auth_flows if "logout" in f["path"]]
    fingerprint_flows = [f for f in auth_flows if "fingerprint" in f["path"] or "device" in f["path"]]
    token_flows = [f for f in auth_flows if "token" in f["path"]]
    authorize_flows = [f for f in auth_flows if "authorize" in f["path"]]
    callback_flows = [f for f in auth_flows if "callback" in f["path"]]

    analysis["key_findings"].extend(
        [
            f"Found {len(oauth2_flows)} OAuth2 flows",
            f"Found {len(login_flows)} login flows",
            f"Found {len(logout_flows)} logout flows",
            f"Found {len(fingerprint_flows)} device fingerprinting flows",
            f"Found {len(token_flows)} token flows",
            f"Found {len(authorize_flows)} authorize flows",
            f"Found {len(callback_flows)} callback flows",
        ]
    )

    # Look for authorization codes
    auth_codes = []
    for flow in auth_flows:
        if flow["response_body"] and isinstance(flow["response_body"], str):
            # Look for authorization codes in response
            code_matches = re.findall(r"code=([^&\s]+)", flow["response_body"])
            auth_codes.extend(code_matches)

    if auth_codes:
        analysis["key_findings"].append(f"Found {len(auth_codes)} authorization codes")

    # Look for state tokens
    state_tokens = []
    for flow in auth_flows:
        if flow["response_body"] and isinstance(flow["response_body"], str):
            # Look for state tokens
            state_matches = re.findall(
                r'stateToken["\']?\s*:\s*["\']([^"\']+)["\']', flow["response_body"]
            )
            state_tokens.extend(state_matches)

    if state_tokens:
        analysis["key_findings"].append(f"Found {len(state_tokens)} state tokens")

    # Look for access tokens and refresh tokens
    access_tokens = []
    refresh_tokens = []
    for flow in auth_flows:
        if flow["response_body"] and isinstance(flow["response_body"], dict):
            response = flow["response_body"]
            if "access_token" in response:
                access_tokens.append(response["access_token"])
            if "refresh_token" in response:
                refresh_tokens.append(response["refresh_token"])
        elif flow["response_body"] and isinstance(flow["response_body"], str):
            # Look for tokens in string responses
            access_matches = re.findall(r'"access_token"\s*:\s*"([^"]+)"', flow["response_body"])
            refresh_matches = re.findall(r'"refresh_token"\s*:\s*"([^"]+)"', flow["response_body"])
            access_tokens.extend(access_matches)
            refresh_tokens.extend(refresh_matches)

    if access_tokens:
        analysis["key_findings"].append(f"Found {len(access_tokens)} access tokens")
    if refresh_tokens:
        analysis["key_findings"].append(f"Found {len(refresh_tokens)} refresh tokens")

    # Analyze the complete workflow sequence
    sorted_flows = sorted(auth_flows, key=lambda x: x["timestamp"])
    
    # Look for device fingerprinting
    for flow in sorted_flows:
        if any(keyword in flow["path"].lower() for keyword in ["fingerprint", "device", "browser", "platform"]):
            analysis["device_fingerprinting"].append({
                "timestamp": flow["timestamp"],
                "url": flow["url"],
                "method": flow["method"],
                "request_body": flow["request_body"],
                "response_body": flow["response_body"]
            })
    
    # Look for token acquisition
    for flow in sorted_flows:
        if any(keyword in flow["path"].lower() for keyword in ["token", "authorize", "callback"]):
            analysis["token_acquisition"].append({
                "timestamp": flow["timestamp"],
                "url": flow["url"],
                "method": flow["method"],
                "request_body": flow["request_body"],
                "response_body": flow["response_body"]
            })
    
    # Look for OAuth2 flow
    for flow in sorted_flows:
        if "oauth2" in flow["path"].lower():
            analysis["oauth2_flow"].append({
                "timestamp": flow["timestamp"],
                "url": flow["url"],
                "method": flow["method"],
                "request_body": flow["request_body"],
                "response_body": flow["response_body"]
            })

    return analysis


def main():
    """Main analysis function."""
    log_file = "meijer_mitm_20250821_233419.log"

    print(f"🔍 Analyzing Okta authentication flows from: {log_file}")
    print("=" * 60)

    try:
        # Load flows
        print("📥 Loading mitmproxy flows...")
        flows = load_flows(log_file)
        print(f"✅ Loaded {len(flows)} total flows")

        # Find auth flows
        print("🔍 Finding authentication flows...")
        auth_flows = find_auth_flows(flows)
        print(f"✅ Found {len(auth_flows)} authentication flows")

        # Analyze patterns
        print("🔍 Analyzing authentication patterns...")
        analysis = analyze_auth_patterns(auth_flows)

        # Save detailed analysis
        timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
        output_file = f"okta_auth_flow_analysis_{timestamp}.json"
        with open(output_file, "w") as f:
            json.dump(analysis, f, indent=2)
        print(f"💾 Saved detailed analysis to: {output_file}")

        # Save raw auth flows
        raw_file = f"okta_auth_flows_raw_{timestamp}.json"
        with open(raw_file, "w") as f:
            json.dump(auth_flows, f, indent=2)
        print(f"💾 Saved raw auth flows to: {raw_file}")

        # Print summary
        print("\n📊 OKTA AUTHENTICATION FLOW ANALYSIS SUMMARY")
        print("=" * 50)
        print(f"Total authentication flows: {analysis['total_auth_flows']}")
        print(f"Unique endpoints: {len(analysis['endpoints'])}")
        print(
            f"Total cookies observed: {len(analysis['cookie_progression']['all_cookies'])}"
        )

        print("\n🔑 KEY ENDPOINTS:")
        for endpoint, data in analysis["endpoints"].items():
            print(f"  {endpoint}: {data['count']} requests")

        print("\n🍪 COOKIES OBSERVED:")
        for cookie in sorted(analysis["cookie_progression"]["all_cookies"]):
            print(f"  {cookie}")

        print("\n💡 KEY FINDINGS:")
        for finding in analysis["key_findings"]:
            print(f"  {finding}")

        # Show device fingerprinting details
        if analysis["device_fingerprinting"]:
            print(f"\n🔍 DEVICE FINGERPRINTING FLOWS ({len(analysis['device_fingerprinting'])}):")
            for i, flow in enumerate(analysis["device_fingerprinting"][:5]):
                print(f"  {i+1}. {flow['url']} ({flow['method']})")
                if flow["request_body"]:
                    print(f"     Request: {str(flow['request_body'])[:100]}...")

        # Show token acquisition details
        if analysis["token_acquisition"]:
            print(f"\n🔑 TOKEN ACQUISITION FLOWS ({len(analysis['token_acquisition'])}):")
            for i, flow in enumerate(analysis["token_acquisition"][:5]):
                print(f"  {i+1}. {flow['url']} ({flow['method']})")
                if flow["response_body"]:
                    print(f"     Response: {str(flow['response_body'])[:100]}...")

        # Show OAuth2 flow details
        if analysis["oauth2_flow"]:
            print(f"\n🔄 OAUTH2 FLOW ({len(analysis['oauth2_flow'])}):")
            for i, flow in enumerate(analysis["oauth2_flow"][:5]):
                print(f"  {i+1}. {flow['url']} ({flow['method']})")

        # Look for specific patterns in the flows
        print("\n🔍 DETAILED FLOW ANALYSIS:")
        for i, flow in enumerate(auth_flows[:10]):  # Show first 10 flows
            print(f"\nFlow {i+1}:")
            print(f"  URL: {flow['url']}")
            print(f"  Method: {flow['method']}")
            print(f"  Status: {flow['status_code']}")
            print(f"  Cookies: {len(flow['cookies'])}")
            print(f"  Set-Cookies: {len(flow['set_cookies'])}")

            # Look for interesting content
            if flow["response_body"] and isinstance(flow["response_body"], str):
                content = flow["response_body"]
                if "stateToken" in content:
                    print("    🔑 Contains stateToken")
                if "code=" in content:
                    print("    🔑 Contains authorization code")
                if "login" in content.lower():
                    print("    🔑 Contains login form")
                if "access_token" in content:
                    print("    🔑 Contains access token")
                if "refresh_token" in content:
                    print("    🔑 Contains refresh token")

        if len(auth_flows) > 10:
            print(f"\n... and {len(auth_flows) - 10} more flows")

    except Exception as e:
        print(f"❌ Error during analysis: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    main()
