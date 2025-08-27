#!/usr/bin/env python3
"""
Search backwards through mitmproxy log to find the most recent login events.
This helps identify if there are multiple login events and we're missing the latest ones.
"""

import mitmproxy.io
from typing import List, Dict, Any
import json
from datetime import datetime


def search_entire_log_for_login_events(log_file: str) -> List[Dict[str, Any]]:
    """
    Search through the entire log file for all login events.
    
    Args:
        log_file: Path to mitmproxy log file
        
    Returns:
        List of login events found, ordered from newest to oldest
    """
    print(f"🔍 Searching entire log file {log_file} for login events...")
    
    # Load all flows
    flows = []
    with open(log_file, 'rb') as f:
        reader = mitmproxy.io.FlowReader(f)
        for flow in reader.stream():
            flows.append(flow)
    
    print(f"📊 Total flows in log: {len(flows)}")
    
    # Search through all flows
    login_events = []
    
    for i, flow in enumerate(flows):
        if not hasattr(flow, 'request') or not hasattr(flow.request, 'pretty_url'):
            continue
            
        url = flow.request.pretty_url
        method = flow.request.method
        timestamp = flow.timestamp_start
        
        # Convert timestamp to readable format
        try:
            dt = datetime.fromtimestamp(timestamp)
            time_str = dt.strftime("%Y-%m-%d %H:%M:%S")
        except:
            time_str = str(timestamp)
        
        # Check for login-related endpoints with more detailed logging
        is_login_event = False
        event_type = None
        
        # Debug: Log all URLs to see what we're actually getting
        if i < 10 or "oauth2" in url.lower() or "id.meijer" in url.lower():
            print(f"DEBUG Flow {i}: {method} {url}")
        
        if "id.meijer.com/auth/services/devicefingerprint" in url:
            is_login_event = True
            event_type = "device_fingerprint"
        elif "id.meijer.com/oauth2/default/v1/authorize" in url:
            is_login_event = True
            event_type = "oauth2_authorize"
            print(f"🎯 FOUND OAUTH2 AUTHORIZE at flow {i}: {url}")
        elif "id.meijer.com/idp/idx/introspect" in url and method == "POST":
            is_login_event = True
            event_type = "idx_introspect"
        elif "id.meijer.com/idp/idx/identify" in url and method == "POST":
            is_login_event = True
            event_type = "idx_identify"
        elif "id.meijer.com/idp/idx/challenge/answer" in url and method == "POST":
            is_login_event = True
            event_type = "idx_challenge"
        elif "id.meijer.com/oauth2/default/v1/token" in url and method == "POST":
            is_login_event = True
            event_type = "oauth2_token_exchange"
            print(f"🎯 FOUND TOKEN EXCHANGE at flow {i}: {url}")
        elif "id.meijer.com/oauth2/default/v1/logout" in url:
            is_login_event = True
            event_type = "logout"
        elif "api.meijer.com" in url and method in ["GET", "POST"]:
            # Check if this has authorization header
            auth_header = flow.request.headers.get("Authorization", "")
            if auth_header.startswith("Bearer "):
                is_login_event = True
                event_type = "api_call_with_bearer"
        
        if is_login_event:
            event_data = {
                "flow_index": i,
                "timestamp": timestamp,
                "time_str": time_str,
                "event_type": event_type,
                "url": url,
                "method": method,
                "status_code": flow.response.status_code if flow.response else None
            }
            
            # Add additional context for certain event types
            if event_type == "oauth2_authorize":
                # Extract OAuth2 parameters from URL
                try:
                    from urllib.parse import parse_qs, urlparse
                    parsed = urlparse(url)
                    params = parse_qs(parsed.query)
                    event_data["oauth2_params"] = {
                        "client_id": params.get("client_id", [None])[0],
                        "scope": params.get("scope", [None])[0],
                        "response_type": params.get("response_type", [None])[0],
                        "code_challenge": params.get("code_challenge", [None])[0],
                        "state": params.get("state", [None])[0]
                    }
                    print(f"   OAuth2 params: client_id={event_data['oauth2_params']['client_id']}, scope={event_data['oauth2_params']['scope']}")
                except Exception as e:
                    print(f"   Error parsing OAuth2 params: {e}")
                    
            elif event_type == "oauth2_token_exchange":
                # Extract token response data
                try:
                    if flow.response and flow.response.content:
                        response_data = json.loads(flow.response.content.decode("utf-8"))
                        event_data["token_response"] = {
                            "has_access_token": "access_token" in response_data,
                            "has_refresh_token": "refresh_token" in response_data,
                            "expires_in": response_data.get("expires_in"),
                            "token_type": response_data.get("token_type")
                        }
                        print(f"🎯 TOKEN EXCHANGE FOUND! Access: {response_data.get('access_token', 'None')[:30]}... Refresh: {'Yes' if 'refresh_token' in response_data else 'No'}")
                except Exception as e:
                    print(f"   Error parsing token response: {e}")
                    
            elif event_type == "api_call_with_bearer":
                # Extract bearer token info
                auth_header = flow.request.headers.get("Authorization", "")
                subscription_key = flow.request.headers.get("ocp-apim-subscription-key", "")
                event_data["auth_info"] = {
                    "bearer_token": auth_header[7:30] + "..." if auth_header else None,
                    "subscription_key": subscription_key[:20] + "..." if subscription_key else None
                }
            
            login_events.append(event_data)
            print(f"🎯 Found {event_type} at flow {i} ({time_str})")
    
    # Sort by timestamp (newest first)
    login_events.sort(key=lambda x: x["timestamp"], reverse=True)
    
    print(f"\n📋 Found {len(login_events)} login-related events")
    return login_events


def search_specific_for_token_exchange(log_file: str) -> List[Dict[str, Any]]:
    """
    Specifically search for OAuth2 token exchange endpoints throughout the entire log.
    
    Args:
        log_file: Path to mitmproxy log file
        
    Returns:
        List of token exchange events found
    """
    print(f"\n🔍 Specifically searching for OAuth2 token exchange endpoints...")
    
    flows = []
    with open(log_file, 'rb') as f:
        reader = mitmproxy.io.FlowReader(f)
        for flow in reader.stream():
            flows.append(flow)
    
    token_exchanges = []
    
    for i, flow in enumerate(flows):
        if not hasattr(flow, 'request') or not hasattr(flow.request, 'pretty_url'):
            continue
            
        url = flow.request.pretty_url
        method = flow.request.method
        timestamp = flow.timestamp_start
        
        if "id.meijer.com/oauth2/default/v1/token" in url and method == "POST":
            try:
                dt = datetime.fromtimestamp(timestamp)
                time_str = dt.strftime("%Y-%m-%d %H:%M:%S")
            except:
                time_str = str(timestamp)
                
            # Extract token response data
            token_data = {
                "flow_index": i,
                "timestamp": timestamp,
                "time_str": time_str,
                "url": url,
                "method": method
            }
            
            try:
                if flow.response and flow.response.content:
                    response_data = json.loads(flow.response.content.decode("utf-8"))
                    token_data["response"] = {
                        "has_access_token": "access_token" in response_data,
                        "has_refresh_token": "refresh_token" in response_data,
                        "expires_in": response_data.get("expires_in"),
                        "token_type": response_data.get("token_type"),
                        "scope": response_data.get("scope")
                    }
                    
                    # Also check request body for grant type
                    if flow.request and flow.request.content:
                        try:
                            request_data = json.loads(flow.request.content.decode("utf-8"))
                            token_data["request"] = {
                                "grant_type": request_data.get("grant_type"),
                                "has_code": "code" in request_data,
                                "has_refresh_token": "refresh_token" in request_data
                            }
                        except:
                            pass
                            
                    print(f"🎯 TOKEN EXCHANGE at flow {i} ({time_str}):")
                    print(f"   Access token: {'✅' if token_data['response']['has_access_token'] else '❌'}")
                    print(f"   Refresh token: {'✅' if token_data['response']['has_refresh_token'] else '❌'}")
                    print(f"   Grant type: {token_data.get('request', {}).get('grant_type', 'Unknown')}")
                    print(f"   Expires in: {token_data['response']['expires_in']} seconds")
                    
            except Exception as e:
                print(f"   Error parsing response: {e}")
                
            token_exchanges.append(token_data)
    
    return token_exchanges


def search_for_specific_oauth2_patterns(log_file: str) -> None:
    """
    Search for specific OAuth2 patterns that the user mentioned.
    """
    print(f"\n🔍 Searching for specific OAuth2 patterns...")
    
    flows = []
    with open(log_file, 'rb') as f:
        reader = mitmproxy.io.FlowReader(f)
        for flow in reader.stream():
            flows.append(flows)
    
    print(f"📊 Total flows loaded: {len(flows)}")
    
    # Search for the specific patterns
    patterns_to_find = [
        "oauth2/default/v1/authorize",
        "login_hint",
        "code_challenge",
        "client_id=0oa1o8g9njWsUvwsx697",
        "scope=openid profile offline_access"
    ]
    
    for i, flow in enumerate(flows):
        if not hasattr(flow, 'request') or not hasattr(flow.request, 'pretty_url'):
            continue
            
        url = flow.request.pretty_url
        
        for pattern in patterns_to_find:
            if pattern in url:
                print(f"🎯 Found pattern '{pattern}' at flow {i}: {url}")
                break


def analyze_login_sequence(login_events: List[Dict[str, Any]]) -> Dict[str, Any]:
    """
    Analyze the login events to identify complete login sequences.
    
    Args:
        login_events: List of login events found
        
    Returns:
        Analysis of login sequences
    """
    if not login_events:
        return {"error": "No login events found"}
    
    print("\n🔍 Analyzing login sequences...")
    
    # Group events by time proximity (within 5 minutes)
    sequences = []
    current_sequence = []
    
    for i, event in enumerate(login_events):
        if not current_sequence:
            current_sequence = [event]
        else:
            # Check if this event is within 5 minutes of the last event in current sequence
            time_diff = abs(event["timestamp"] - current_sequence[-1]["timestamp"])
            if time_diff <= 300:  # 5 minutes = 300 seconds
                current_sequence.append(event)
            else:
                # Start a new sequence
                if current_sequence:
                    sequences.append(current_sequence)
                current_sequence = [event]
    
    # Add the last sequence
    if current_sequence:
        sequences.append(current_sequence)
    
    print(f"📊 Identified {len(sequences)} potential login sequences")
    
    # Analyze each sequence
    for i, sequence in enumerate(sequences):
        print(f"\n🔍 Sequence {i + 1} ({len(sequence)} events):")
        
        # Check if this looks like a complete login flow
        event_types = [e["event_type"] for e in sequence]
        
        has_device_fingerprint = "device_fingerprint" in event_types
        has_oauth2_authorize = "oauth2_authorize" in event_types
        has_idx_flow = any(t in event_types for t in ["idx_introspect", "idx_identify", "idx_challenge"])
        has_token_exchange = "oauth2_token_exchange" in event_types
        has_api_calls = "api_call_with_bearer" in event_types
        
        print(f"   Device fingerprint: {'✅' if has_device_fingerprint else '❌'}")
        print(f"   OAuth2 authorize: {'✅' if has_oauth2_authorize else '❌'}")
        print(f"   IDX flow: {'✅' if has_idx_flow else '❌'}")
        print(f"   Token exchange: {'✅' if has_token_exchange else '❌'}")
        print(f"   API calls with bearer: {'✅' if has_api_calls else '❌'}")
        
        # Determine completeness
        if has_device_fingerprint and has_oauth2_authorize and has_idx_flow:
            if has_token_exchange:
                print("   🎉 COMPLETE LOGIN FLOW WITH TOKEN EXCHANGE")
            elif has_api_calls:
                print("   ✅ COMPLETE LOGIN FLOW WITH API CALLS")
            else:
                print("   ⚠️ PARTIAL LOGIN FLOW")
        else:
            print("   ❌ INCOMPLETE LOGIN FLOW")
        
        # Show timeline
        for event in sequence:
            print(f"      {event['time_str']} - {event['event_type']}")
    
    return {
        "total_sequences": len(sequences),
        "sequences": sequences,
        "login_events": login_events
    }


def main():
    """Main function to search backwards for login events."""
    log_file = "logs/meijer_mitm_20250826_170520.log"
    
    try:
        # Search entire log for login events
        login_events = search_entire_log_for_login_events(log_file)
        
        if not login_events:
            print("❌ No login events found in the log file")
            return
        
        # Analyze the login sequences
        analysis = analyze_login_sequence(login_events)
        
        # Show summary
        print(f"\n📊 SUMMARY:")
        print(f"   Total flows in log: 720")
        print(f"   Login events found: {len(login_events)}")
        print(f"   Login sequences identified: {analysis['total_sequences']}")
        
        # Show all events chronologically
        print(f"\n🕒 All login events (chronological order):")
        for i, event in enumerate(login_events):
            print(f"   {i+1:2d}. {event['time_str']} - {event['event_type']:20s} (flow {event['flow_index']:3d})")
        
        # Specifically search for token exchange endpoints
        token_exchanges = search_specific_for_token_exchange(log_file)
        
        print(f"\n🎯 Token Exchange Summary:")
        print(f"   Total token exchange endpoints found: {len(token_exchanges)}")
        
        if token_exchanges:
            print(f"   Token exchanges with refresh tokens: {sum(1 for t in token_exchanges if t.get('response', {}).get('has_refresh_token'))}")
            print(f"   Token exchanges with access tokens: {sum(1 for t in token_exchanges if t.get('response', {}).get('has_access_token'))}")
        
    except Exception as e:
        print(f"❌ Error: {e}")
        import traceback
        traceback.print_exc()


if __name__ == "__main__":
    main()
