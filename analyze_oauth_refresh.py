#!/usr/bin/env python3
"""
OAuth Refresh Token Analysis
============================

Analyze mitmproxy logs to understand OAuth token refresh patterns,
including refresh token availability and usage patterns.
"""

import json
from typing import List, Dict, Any, Optional
from mitmproxy.io import FlowReader
from mitmproxy import http
import base64

def decode_jwt_payload(token: str) -> Optional[Dict[str, Any]]:
    """Decode JWT payload without verification."""
    try:
        # JWT tokens have 3 parts separated by dots
        parts = token.split('.')
        if len(parts) != 3:
            return None
        
        # Decode the payload (middle part)
        payload = parts[1]
        # Add padding if needed
        padding = len(payload) % 4
        if padding:
            payload += '=' * (4 - padding)
        
        decoded = base64.urlsafe_b64decode(payload)
        return json.loads(decoded)
    except Exception:
        return None

def load_flows(log_file: str) -> List[http.HTTPFlow]:
    """Load flows from mitmproxy log file."""
    flows = []
    try:
        with open(log_file, 'rb') as f:
            flow_reader = FlowReader(f)
            for flow in flow_reader.stream():
                if isinstance(flow, http.HTTPFlow):
                    flows.append(flow)
    except Exception as e:
        print(f"Error loading flows: {e}")
    return flows

def find_oauth_token_flows(flows: List[http.HTTPFlow]) -> List[Dict[str, Any]]:
    """Find OAuth token-related flows."""
    oauth_flows = []
    
    for flow in flows:
        if not hasattr(flow, 'request') or not hasattr(flow, 'response'):
            continue
            
        request = flow.request
        response = flow.response
        
        # Look for OAuth token endpoints
        is_token_endpoint = (
            '/oauth2/default/v1/token' in request.pretty_url or
            '/token' in request.path or
            'grant_type=' in (request.text or '') or
            'refresh_token=' in (request.text or '')
        )
        
        # Look for responses containing tokens
        has_token_response = False
        token_data = {}
        
        if response and response.content:
            try:
                # Try to get text, but handle encoding errors
                response_text = None
                try:
                    response_text = response.text
                except (ValueError, UnicodeDecodeError):
                    # Try to decode as UTF-8 with error handling
                    try:
                        response_text = response.content.decode('utf-8', errors='ignore')
                    except:
                        continue
                
                if response_text:
                    response_json = json.loads(response_text)
                    if isinstance(response_json, dict) and any(key in response_json for key in ['access_token', 'refresh_token', 'id_token']):
                        has_token_response = True
                        token_data = response_json
            except json.JSONDecodeError:
                pass
        
        if is_token_endpoint or has_token_response:
            flow_info = {
                'timestamp': flow.request.timestamp_start,
                'method': request.method,
                'url': request.pretty_url,
                'status_code': response.status_code if response else None,
                'is_token_endpoint': is_token_endpoint,
                'has_token_response': has_token_response,
                'request_content_type': request.headers.get('content-type', ''),
                'response_content_type': response.headers.get('content-type', '') if response else '',
            }
            
            # Parse request body for grant type
            if request.text:
                if 'grant_type=authorization_code' in request.text:
                    flow_info['grant_type'] = 'authorization_code'
                elif 'grant_type=refresh_token' in request.text:
                    flow_info['grant_type'] = 'refresh_token'
                elif 'grant_type=' in request.text:
                    # Extract the actual grant type
                    import re
                    match = re.search(r'grant_type=([^&]+)', request.text)
                    if match:
                        flow_info['grant_type'] = match.group(1)
            
            # Include token data if found
            if token_data:
                flow_info['tokens'] = {}
                if 'access_token' in token_data:
                    access_token = token_data['access_token']
                    flow_info['tokens']['access_token'] = access_token[:30] + '...' + access_token[-15:]
                    # Decode JWT to get expiration
                    jwt_payload = decode_jwt_payload(access_token)
                    if jwt_payload:
                        flow_info['tokens']['access_token_payload'] = {
                            'exp': jwt_payload.get('exp'),
                            'iat': jwt_payload.get('iat'),
                            'scope': jwt_payload.get('scope'),
                            'client_id': jwt_payload.get('cid')
                        }
                
                if 'refresh_token' in token_data:
                    refresh_token = token_data['refresh_token']
                    flow_info['tokens']['refresh_token'] = refresh_token[:20] + '...' + refresh_token[-10:]
                    flow_info['tokens']['refresh_token_available'] = True
                
                if 'expires_in' in token_data:
                    flow_info['tokens']['expires_in'] = token_data['expires_in']
                
                if 'id_token' in token_data:
                    id_token = token_data['id_token']
                    flow_info['tokens']['id_token'] = id_token[:30] + '...' + id_token[-15:]
            
            oauth_flows.append(flow_info)
    
    return oauth_flows

def analyze_refresh_patterns(oauth_flows: List[Dict[str, Any]]) -> Dict[str, Any]:
    """Analyze refresh token patterns."""
    analysis = {
        'total_oauth_flows': len(oauth_flows),
        'flows_with_refresh_tokens': 0,
        'authorization_code_flows': 0,
        'refresh_token_flows': 0,
        'token_lifetimes': [],
        'refresh_token_usage': False,
        'has_offline_access': False
    }
    
    for flow in oauth_flows:
        # Count flows with refresh tokens
        if flow.get('tokens', {}).get('refresh_token_available'):
            analysis['flows_with_refresh_tokens'] += 1
        
        # Count grant types
        grant_type = flow.get('grant_type', '')
        if grant_type == 'authorization_code':
            analysis['authorization_code_flows'] += 1
        elif grant_type == 'refresh_token':
            analysis['refresh_token_flows'] += 1
            analysis['refresh_token_usage'] = True
        
        # Analyze token lifetimes
        if 'tokens' in flow and 'expires_in' in flow['tokens']:
            analysis['token_lifetimes'].append(flow['tokens']['expires_in'])
        
        # Check for offline access scope
        if 'tokens' in flow and 'access_token_payload' in flow['tokens']:
            scope = flow['tokens']['access_token_payload'].get('scope', [])
            if isinstance(scope, list) and 'offline_access' in scope:
                analysis['has_offline_access'] = True
    
    return analysis

def main():
    """Analyze OAuth refresh patterns in meijer2.log."""
    print("🔍 Analyzing OAuth Refresh Patterns in meijer2.log")
    print("=" * 55)
    
    # Load flows
    flows = load_flows("meijer2.log")
    print(f"📊 Loaded {len(flows)} flows")
    
    # Find OAuth flows
    oauth_flows = find_oauth_token_flows(flows)
    print(f"🎯 Found {len(oauth_flows)} OAuth-related flows")
    
    if not oauth_flows:
        print("❌ No OAuth flows found")
        return
    
    # Analyze patterns
    analysis = analyze_refresh_patterns(oauth_flows)
    
    print(f"\n📋 OAuth Flow Analysis:")
    print(f"   Total OAuth flows: {analysis['total_oauth_flows']}")
    print(f"   Flows with refresh tokens: {analysis['flows_with_refresh_tokens']}")
    print(f"   Authorization code flows: {analysis['authorization_code_flows']}")
    print(f"   Refresh token flows: {analysis['refresh_token_flows']}")
    print(f"   Refresh token usage detected: {analysis['refresh_token_usage']}")
    print(f"   Has offline_access scope: {analysis['has_offline_access']}")
    
    if analysis['token_lifetimes']:
        avg_lifetime = sum(analysis['token_lifetimes']) / len(analysis['token_lifetimes'])
        print(f"   Average token lifetime: {avg_lifetime:.0f} seconds ({avg_lifetime/3600:.1f} hours)")
    
    # Show detailed flow information
    print(f"\n📊 OAuth Flow Details (newest first):")
    oauth_flows_sorted = sorted(oauth_flows, key=lambda x: x['timestamp'], reverse=True)
    
    for i, flow in enumerate(oauth_flows_sorted[:10]):  # Show first 10
        print(f"\n   {i+1}. {flow['method']} {flow['url']}")
        print(f"      Status: {flow.get('status_code', 'Unknown')}")
        print(f"      Grant Type: {flow.get('grant_type', 'Unknown')}")
        
        if 'tokens' in flow:
            tokens = flow['tokens']
            if 'access_token' in tokens:
                print(f"      Access Token: {tokens['access_token']}")
            if 'refresh_token_available' in tokens:
                print(f"      Refresh Token: Available")
            if 'expires_in' in tokens:
                print(f"      Expires In: {tokens['expires_in']} seconds")
            if 'access_token_payload' in tokens:
                payload = tokens['access_token_payload']
                if payload.get('scope'):
                    print(f"      Scope: {payload['scope']}")
    
    # Save detailed analysis
    detailed_analysis = {
        'summary': analysis,
        'oauth_flows': oauth_flows_sorted
    }
    
    with open("oauth_refresh_analysis.json", "w") as f:
        json.dump(detailed_analysis, f, indent=2)
    
    print(f"\n💾 Detailed analysis saved to: oauth_refresh_analysis.json")
    
    # Conclusions
    print(f"\n🎯 Key Findings:")
    if analysis['refresh_token_usage']:
        print("   ✅ Refresh tokens ARE being used in the app")
        print("   ✅ The app supports token refresh")
    else:
        print("   ⚠️  No refresh token usage detected in this log")
        print("   ℹ️  This could mean:")
        print("      - Tokens haven't expired during capture")
        print("      - App was restarted instead of refreshing")
        print("      - Longer capture period needed")
    
    if analysis['has_offline_access']:
        print("   ✅ offline_access scope detected - supports refresh")
    
    if analysis['flows_with_refresh_tokens'] > 0:
        print("   ✅ Refresh tokens are provided by the OAuth server")
        print("   💡 Our client CAN be updated to support refresh")
    else:
        print("   ❌ No refresh tokens found in captured flows")

if __name__ == "__main__":
    main() 