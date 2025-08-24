#!/usr/bin/env python3
"""
Extract Bearer tokens and OAuth2 tokens from meijer mitmproxy logs.
Enhanced to find both request headers and OAuth2 token exchange responses.
Now includes authentication flow detection and complete flow capture.
"""

import json
import base64
from typing import Any, Dict, List, Optional
from urllib.parse import urlparse, parse_qs

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


def detect_authentication_flow(flows: List[HTTPFlow]) -> Dict[str, Any]:
    """
    Detect the type of authentication flow that occurred.
    
    Returns:
        Dict with flow type and key endpoints found
    """
    flow_analysis = {
        "flow_type": "unknown",
        "has_full_login": False,
        "has_quick_token": False,
        "key_endpoints": [],
        "cookies_tracked": {},
        "flow_sequence": []
    }
    
    # Key endpoints to look for
    device_fingerprint_endpoints = []
    login_redirect_endpoints = []
    logout_endpoints = []
    token_endpoints = []
    api_calls = []
    
    for flow in flows:
        url = flow.request.pretty_url
        method = flow.request.method
        timestamp = flow.timestamp_start
        
        # Track device fingerprint (start of login flow)
        if "id.meijer.com/auth/services/devicefingerprint" in url:
            device_fingerprint_endpoints.append({
                "timestamp": timestamp,
                "url": url,
                "method": method,
                "cookies": dict(flow.request.cookies) if flow.request.cookies else {},
                "response_cookies": dict(flow.response.cookies) if flow.response and flow.response.cookies else {}
            })
            flow_analysis["flow_sequence"].append({
                "step": "device_fingerprint",
                "timestamp": timestamp,
                "url": url,
                "cookies_set": dict(flow.response.cookies) if flow.response and flow.response.cookies else {}
            })
        
        # Track login redirect (key authentication step)
        elif "id.meijer.com/login/token/redirect" in url:
            login_redirect_endpoints.append({
                "timestamp": timestamp,
                "url": url,
                "method": method,
                "query_params": parse_qs(urlparse(url).query),
                "cookies": dict(flow.request.cookies) if flow.request.cookies else {},
                "response_cookies": dict(flow.response.cookies) if flow.response and flow.response.cookies else {}
            })
            flow_analysis["flow_sequence"].append({
                "step": "login_redirect",
                "timestamp": timestamp,
                "url": url,
                "state_token": parse_qs(urlparse(url).query).get("stateToken", [None])[0]
            })
        
        # Track logout (indicates full authentication was completed)
        elif "id.meijer.com/oauth2/default/v1/logout" in url:
            logout_endpoints.append({
                "timestamp": timestamp,
                "url": url,
                "method": method,
                "cookies": dict(flow.request.cookies) if flow.request.cookies else {},
                "response_cookies": dict(flow.response.cookies) if flow.response and flow.response.cookies else {}
            })
            flow_analysis["flow_sequence"].append({
                "step": "logout",
                "timestamp": timestamp,
                "url": url
            })
        
        # Track OAuth2 token endpoints
        elif "id.meijer.com/oauth2/default/v1/token" in url:
            token_endpoints.append({
                "timestamp": timestamp,
                "url": url,
                "method": method,
                "cookies": dict(flow.request.cookies) if flow.request.cookies else {},
                "response_cookies": dict(flow.response.cookies) if flow.response and flow.response.cookies else {}
            })
            flow_analysis["flow_sequence"].append({
                "step": "token_exchange",
                "timestamp": timestamp,
                "url": url
            })
        
        # Track API calls to api.meijer.com (for bearer token extraction)
        elif "api.meijer.com" in url:
            api_calls.append({
                "timestamp": timestamp,
                "url": url,
                "method": method,
                "has_auth": "authorization" in [h.lower() for h in flow.request.headers.keys()],
                "cookies": dict(flow.request.cookies) if flow.request.cookies else {}
            })
    
    # Determine flow type based on endpoints found
    if device_fingerprint_endpoints and login_redirect_endpoints:
        flow_analysis["flow_type"] = "full_oauth2_login"
        flow_analysis["has_full_login"] = True
        flow_analysis["key_endpoints"].extend([
            "device_fingerprint",
            "login_redirect"
        ])
        
        if logout_endpoints:
            flow_analysis["key_endpoints"].append("logout")
            flow_analysis["flow_sequence"].append({
                "step": "flow_complete",
                "timestamp": logout_endpoints[-1]["timestamp"],
                "note": "Full OAuth2 flow completed with logout"
            })
    
    elif api_calls and any(call["has_auth"] for call in api_calls):
        flow_analysis["flow_type"] = "api_token_usage"
        flow_analysis["has_quick_token"] = True
        flow_analysis["key_endpoints"].append("api_calls_with_auth")
    
    # Track cookie evolution throughout the flow
    for step in flow_analysis["flow_sequence"]:
        if "cookies_set" in step:
            for cookie_name, cookie_value in step["cookies_set"].items():
                if cookie_name not in flow_analysis["cookies_tracked"]:
                    flow_analysis["cookies_tracked"][cookie_name] = []
                flow_analysis["cookies_tracked"][cookie_name].append({
                    "step": step["step"],
                    "timestamp": step["timestamp"],
                    "value": cookie_value
                })
    
    return flow_analysis


def analyze_jwt_token(token: str) -> Dict[str, Any]:
    """
    Analyze a JWT token to extract its components and verify it's not generated from other responses.
    
    Args:
        token: The JWT token string
        
    Returns:
        Dict with JWT analysis
    """
    try:
        # Split JWT into parts
        parts = token.split('.')
        if len(parts) != 3:
            return {"error": "Invalid JWT format - expected 3 parts"}
        
        header_b64, payload_b64, signature_b64 = parts
        
        # Decode header and payload
        header = json.loads(base64.urlsafe_b64decode(header_b64 + '=' * (-len(header_b64) % 4)).decode('utf-8'))
        payload = json.loads(base64.urlsafe_b64decode(payload_b64 + '=' * (-len(payload_b64) % 4)).decode('utf-8'))
        
        # Analyze the JWT
        analysis = {
            "header": header,
            "payload": payload,
            "signature_length": len(signature_b64),
            "algorithm": header.get("alg"),
            "key_id": header.get("kid"),
            "issuer": payload.get("iss"),
            "audience": payload.get("aud"),
            "subject": payload.get("sub"),
            "issued_at": payload.get("iat"),
            "expires_at": payload.get("exp"),
            "client_id": payload.get("cid"),
            "user_id": payload.get("uid"),
            "scopes": payload.get("scp", []),
            "roles": payload.get("roles", []),
            "has_mpunks": payload.get("has_mpunks"),
            "mpunks_shopper_id": payload.get("mpunks_shopper_id"),
            "digital_id": payload.get("digital_id"),
            "auth_time": payload.get("auth_time"),
            "is_authentic": True
        }
        
        # Check if this looks like a legitimate Meijer JWT
        if (payload.get("iss") == "https://id.meijer.com/oauth2/default" and
            payload.get("aud") == "api://default" and
            "offline_access" in payload.get("scp", [])):
            analysis["source"] = "legitimate_meijer_oauth2"
        else:
            analysis["source"] = "unknown_source"
            analysis["is_authentic"] = False
        
        return analysis
        
    except Exception as e:
        return {"error": f"Failed to analyze JWT: {e}", "is_authentic": False}


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
                    # Analyze the access token JWT
                    jwt_analysis = analyze_jwt_token(response_data["access_token"])
                    
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
                        "jwt_analysis": jwt_analysis,
                        "cookies": dict(flow.request.cookies) if flow.request.cookies else {},
                        "response_cookies": dict(flow.response.cookies) if flow.response.cookies else {},
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
                
                # Analyze the JWT token
                jwt_analysis = analyze_jwt_token(bearer_token)

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
                    "jwt_analysis": jwt_analysis,
                    "cookies": dict(flow.request.cookies) if flow.request.cookies else {},
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

    # Detect authentication flow
    flow_analysis = detect_authentication_flow(flows)
    print("\n🔍 Authentication Flow Analysis:")
    print(f"   Flow Type: {flow_analysis['flow_type']}")
    print(f"   Full Login Flow: {flow_analysis['has_full_login']}")
    print(f"   Quick Token Usage: {flow_analysis['has_quick_token']}")
    print(f"   Key Endpoints Found: {flow_analysis['key_endpoints']}")
    print(f"   Total Flow Steps: {len(flow_analysis['flow_sequence'])}")
    
    # Show detailed flow sequence
    if flow_analysis['flow_sequence']:
        print("\n📋 Authentication Flow Sequence:")
        for i, step in enumerate(flow_analysis['flow_sequence']):
            timestamp_str = f" at {step['timestamp']}" if 'timestamp' in step else ""
            print(f"   {i+1}. {step['step'].upper()}{timestamp_str}")
            if 'state_token' in step and step['state_token']:
                print(f"      State Token: {step['state_token'][:30]}...")
            if 'note' in step:
                print(f"      Note: {step['note']}")
    
    # Show cookie tracking
    if flow_analysis['cookies_tracked']:
        print("\n🍪 Cookie Evolution Throughout Flow:")
        for cookie_name, cookie_history in flow_analysis['cookies_tracked'].items():
            print(f"   {cookie_name}:")
            for entry in cookie_history:
                print(f"     {entry['step']}: {entry['value'][:50]}...")

    # Extract OAuth2 token responses (preferred)
    oauth2_responses = extract_oauth2_tokens(flows)
    print(f"\n🎯 Found {len(oauth2_responses)} OAuth2 token exchange responses")

    # Extract Bearer tokens from request headers
    bearer_requests = extract_bearer_tokens(flows)
    print(f"🎯 Found {len(bearer_requests)} requests with Bearer tokens")

    # Extract Meijer API calls for context
    meijer_calls = extract_meijer_api_calls(flows)
    meijer_auth_calls = [call for call in meijer_calls if call["has_auth"]]
    print(
        f"🏪 Found {len(meijer_calls)} Meijer API calls ({len(meijer_auth_calls)} with auth)"
    )

    # Show OAuth2 token responses with JWT analysis
    if oauth2_responses:
        print("\n🔑 OAuth2 Token Responses (newest first):")
        for i, response in enumerate(oauth2_responses[:5]):  # Show first 5
            print(f"   {i + 1}. {response['method']} {response['url'][:60]}...")
            print(f"      Status: {response['response_status']}")
            print(f"      Access Token: {response['access_token'][:30]}...")
            print(f"      Refresh Token: {response['refresh_token'][:30]}...")
            print(f"      Expires: {response['expires_in']} seconds")
            print(f"      Time: {response['timestamp']}")
            
            # Show JWT analysis
            if 'jwt_analysis' in response and response['jwt_analysis'].get('is_authentic'):
                jwt = response['jwt_analysis']
                print(f"      JWT Analysis:")
                print(f"        Algorithm: {jwt.get('algorithm')}")
                print(f"        Issuer: {jwt.get('issuer')}")
                print(f"        Audience: {jwt.get('audience')}")
                print(f"        Subject: {jwt.get('subject')}")
                print(f"        Scopes: {', '.join(jwt.get('scopes', []))}")
                print(f"        Has MPunks: {jwt.get('has_mpunks')}")
                print(f"        Digital ID: {jwt.get('digital_id')}")
                print(f"        Source: {jwt.get('source')}")

    # Show Bearer tokens with JWT analysis
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
            
            # Show JWT analysis
            if 'jwt_analysis' in request and request['jwt_analysis'].get('is_authentic'):
                jwt = request['jwt_analysis']
                print(f"      JWT Analysis:")
                print(f"        Algorithm: {jwt.get('algorithm')}")
                print(f"        Issuer: {jwt.get('issuer')}")
                print(f"        Audience: {jwt.get('audience')}")
                print(f"        Subject: {jwt.get('subject')}")
                print(f"        Scopes: {', '.join(jwt.get('scopes', []))}")
                print(f"        Has MPunks: {jwt.get('has_mpunks')}")
                print(f"        MPunks Shopper ID: {jwt.get('mpunks_shopper_id')}")
                print(f"        Digital ID: {jwt.get('digital_id')}")
                print(f"        Auth Time: {jwt.get('auth_time')}")
                print(f"        Source: {jwt.get('source')}")
                
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
                
                # Show JWT analysis for OAuth2 tokens
                if 'jwt_analysis' in best_tokens and best_tokens['jwt_analysis'].get('is_authentic'):
                    jwt = best_tokens['jwt_analysis']
                    print(f"   JWT Details:")
                    print(f"     Algorithm: {jwt.get('algorithm')}")
                    print(f"     Key ID: {jwt.get('key_id')}")
                    print(f"     Issuer: {jwt.get('issuer')}")
                    print(f"     Audience: {jwt.get('audience')}")
                    print(f"     Subject: {jwt.get('subject')}")
                    print(f"     Scopes: {', '.join(jwt.get('scopes', []))}")
                    print(f"     Has MPunks: {jwt.get('has_mpunks')}")
                    print(f"     MPunks Shopper ID: {jwt.get('mpunks_shopper_id')}")
                    print(f"     Digital ID: {jwt.get('digital_id')}")
                    print(f"     Auth Time: {jwt.get('auth_time')}")
                    print(f"     Source: {jwt.get('source')}")
                    
            else:
                print("   Source: Request Header")
                print(f"   URL: {best_tokens['url']}")
                print(f"   Status: {best_tokens.get('status_code', 'Unknown')}")
                print(f"   Token: {best_tokens['bearer_token'][:30]}...")
                print("   ⚠️ No refresh token - tokens cannot be refreshed automatically")
                
                # Show JWT analysis for bearer tokens
                if 'jwt_analysis' in best_tokens and best_tokens['jwt_analysis'].get('is_authentic'):
                    jwt = best_tokens['jwt_analysis']
                    print(f"   JWT Details:")
                    print(f"     Algorithm: {jwt.get('algorithm')}")
                    print(f"     Key ID: {jwt.get('key_id')}")
                    print(f"     Issuer: {jwt.get('issuer')}")
                    print(f"     Audience: {jwt.get('audience')}")
                    print(f"     Subject: {jwt.get('subject')}")
                    print(f"     Scopes: {', '.join(jwt.get('scopes', []))}")
                    print(f"     Has MPunks: {jwt.get('has_mpunks')}")
                    print(f"     MPunks Shopper ID: {jwt.get('mpunks_shopper_id')}")
                    print(f"     Digital ID: {jwt.get('digital_id')}")
                    print(f"     Auth Time: {jwt.get('auth_time')}")
                    print(f"     Source: {jwt.get('source')}")
                    
            print(f"   Timestamp: {best_tokens['timestamp']}")

            # Save the tokens to the config directory
            save_tokens(best_tokens)

        # Provide flow-specific guidance
        if flow_analysis['flow_type'] == 'full_oauth2_login':
            print("\n🎉 EXCELLENT! Full OAuth2 authentication flow captured!")
            print("   ✅ Complete login sequence with device fingerprint")
            print("   ✅ Login redirect with state token")
            print("   ✅ OAuth2 token exchange with refresh capability")
            print("   ✅ Tokens can be refreshed automatically")
            print("   ✅ No need to re-authenticate when tokens expire")
            
        elif flow_analysis['flow_type'] == 'api_token_usage':
            print("\n⚠️ PARTIAL: Only API token usage captured")
            print("   ✅ Current bearer token is working")
            print("   ❌ No OAuth2 flow captured - cannot refresh tokens")
            print("   💡 Token will work until it expires")
            print("\n💡 To get refreshable tokens:")
            print("   1. Clear current tokens: meijer auth logout")
            print("   2. Log out of Meijer app")
            print("   3. Start mitmproxy capture")
            print("   4. Log back into Meijer app (complete login flow)")
            print("   5. Run 'meijer auth log --mode full' again")
            
        else:
            print("\n❓ UNKNOWN: Could not determine authentication flow type")
            print("   Check the flow analysis above for details")

    else:
        print("\n❌ No tokens found in the log")
        print("\n💡 Troubleshooting:")
        print("   • Make sure mitmproxy is capturing traffic")
        print("   • Try using the Meijer app to generate some API calls")
        print("   • For full authentication, log out and log back in")
        print("   • Check that the log file contains recent traffic")

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
        "flow_analysis": flow_analysis,
    }

    with open("token_analysis.json", "w") as f:
        json.dump(analysis_data, f, indent=2)

    print("\n📄 Detailed analysis saved to: token_analysis.json")
    
    # Provide final summary and recommendations
    print("\n🎯 AUTHENTICATION FLOW SUMMARY:")
    if flow_analysis['flow_type'] == 'full_oauth2_login':
        print("   🎉 FULL OAuth2 LOGIN FLOW DETECTED")
        print("   ✅ You have complete authentication with refresh capability")
        print("   ✅ Tokens will be automatically refreshable")
        print("   ✅ No need to re-authenticate when tokens expire")
        
    elif flow_analysis['flow_type'] == 'api_token_usage':
        print("   ⚠️ API TOKEN USAGE ONLY")
        print("   ✅ You have working bearer tokens for immediate API access")
        print("   ❌ Tokens cannot be refreshed automatically")
        print("   💡 Re-run when tokens expire or use 'meijer auth full-login'")
        
    else:
        print("   ❓ UNKNOWN FLOW TYPE")
        print("   💡 Check the detailed analysis above")
        print("   💡 Consider running 'meijer auth full-login' for complete authentication")


def test_jwt_analysis():
    """Test JWT analysis with the example token from the user."""
    test_token = "eyJraWQiOiJXMmxQc0g5Sy1lTWRoSExaeUZwSm9KTHFEamdMaFk4bEJjN21jd1A1UnZZIiwiYWxnIjoiUlMyNTYifQ.eyJ2ZXIiOjEsImp0aSI6IkFULjA3elBmX3c4ZjdkRGxTcDEyN002OU91RG5SY01nOHdoMG1sQWpZbmRSLVUub2FyMzB6bDBhZk1Ucmp4dEw2OTciLCJpc3MiOiJodHRwczovL2lkLm1laWplci5jb20vb2F1dGgyL2RlZmF1bHQiLCJhdWQiOiJhcGk6Ly9kZWZhdWx0IiwiaWF0IjoxNzU1OTk0MjQ3LCJleHAiOjE3NTYwMjMwNDcsImNpZCI6IjBvYTFvOGc5bmpXc1V2d3N4Njk3IiwidWlkIjoiMDB1NTl2M2dwdm5tYlJ1cUQ2OTciLCJzY3AiOlsib2ZmbGluZV9hY2Nlc3MiLCJvcGVuaWQiLCJwcm9maWxlIl0sImF1dGhfdGltZSI6MTc1NTk5NDE0OCwiaGFzX2RpZ2l0YWwiOiIxIiwiZWd1ZXN0X2lkIjoiMCIsInN1YiI6IjEzMjY2NTk2IiwiZGlnaXRhbF9pZCI6IjEzMjY2NTk2Iiwic2NvcGUiOlsib2ZmbGluZV9hY2Nlc3MiLCJvcGVuaWQiLCJwcm9maWxlIl0sInJvbGVzIjpbImRpZ2l0YWw6YWNjb3VudHM6YWNjb3VudC5vd25lciJdLCJoYXNfbXBlcmtzIjoiMSIsIm1wZXJrc19zaG9wcGVyX2lkIjoiNDY4MDI2NzUzMzEiLCJtcGVya3NfZXh0X3Nob3BwZXJfaWQiOiI2MzYxYWViZS1jNWM1LTRlMGEtYmRjYi02ZGFiNGE1ZDkyZGQiLCJjbGllbnRfaWQiOiJva3RhIn0.SLLExn_3jNcOG_QoJ6mWfQb0wxGtznFZDwJnoF2FaoYfzEtSQqIb4DVq85s6Kg7kbzZIhi3Xc7KzYiXAHtBvXGJRMDBy5nZKq4vuHDLH-6r53HDEPtG4qCV-bRVecyjWVMdWJAs6V--1omi0g7XVpIarME5YB5xyh3S0VFF9i6uZuLWWjxkhKg451zymyxoyMefVd5cs0wYvo__JqCSSz9GSgIMQyoquJvnpXYXWmhkeatWi-KBzLrBPSxw43ePAqNjJLjyZxMYfTJyLJMirKpB4leHT00-x8AWBXRnKfwaT02QGV4o4bB9gAYoieQOc0dVcPGaf763chgKXb6jq0w"
    
    print("🧪 Testing JWT Analysis with Example Token")
    print("=" * 50)
    
    analysis = analyze_jwt_token(test_token)
    
    if analysis.get("error"):
        print(f"❌ JWT Analysis failed: {analysis['error']}")
        return
    
    print("✅ JWT Analysis successful!")
    print(f"   Algorithm: {analysis.get('algorithm')}")
    print(f"   Key ID: {analysis.get('key_id')}")
    print(f"   Issuer: {analysis.get('issuer')}")
    print(f"   Audience: {analysis.get('audience')}")
    print(f"   Subject: {analysis.get('subject')}")
    print(f"   Digital ID: {analysis.get('digital_id')}")
    print(f"   Scopes: {', '.join(analysis.get('scopes', []))}")
    print(f"   Has MPunks: {analysis.get('has_mpunks')}")
    print(f"   MPunks Shopper ID: {analysis.get('mpunks_shopper_id')}")
    print(f"   Client ID: {analysis.get('client_id')}")
    print(f"   User ID: {analysis.get('user_id')}")
    print(f"   Issued At: {analysis.get('issued_at')}")
    print(f"   Expires At: {analysis.get('expires_at')}")
    print(f"   Auth Time: {analysis.get('auth_time')}")
    print(f"   Roles: {', '.join(analysis.get('roles', []))}")
    print(f"   Source: {analysis.get('source')}")
    print(f"   Is Authentic: {analysis.get('is_authentic')}")
    
    # Show the decoded payload for verification
    print(f"\n📋 Decoded JWT Payload:")
    payload = analysis.get('payload', {})
    for key, value in payload.items():
        if isinstance(value, list):
            print(f"   {key}: {', '.join(map(str, value))}")
        else:
            print(f"   {key}: {value}")


if __name__ == "__main__":
    # If run with --test-jwt flag, test JWT analysis
    import sys
    if len(sys.argv) > 1 and sys.argv[1] == "--test-jwt":
        test_jwt_analysis()
    else:
        main()
