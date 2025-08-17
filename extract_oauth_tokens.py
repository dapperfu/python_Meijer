#!/usr/bin/env python3
"""
Extract Complete OAuth Tokens
=============================

Extract both access and refresh tokens from OAuth flows in mitmproxy logs.
This provides the complete token pair needed for automatic refresh.
"""

import json
import base64
from typing import List, Dict, Any, Optional, Tuple
from mitmproxy.io import FlowReader
from mitmproxy import http
from datetime import datetime, timedelta

def decode_jwt_payload(token: str) -> Optional[Dict[str, Any]]:
    """Decode JWT payload without verification."""
    try:
        parts = token.split('.')
        if len(parts) != 3:
            return None
        
        payload = parts[1]
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

def extract_oauth_token_responses(flows: List[http.HTTPFlow]) -> List[Dict[str, Any]]:
    """Extract OAuth token responses with both access and refresh tokens."""
    oauth_responses = []
    
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
            'id.meijer.com' in request.pretty_url
        )
        
        if not is_token_endpoint or not response or not response.content:
            continue
        
        try:
            # Try to get response text with encoding handling
            response_text = None
            try:
                response_text = response.text
            except (ValueError, UnicodeDecodeError):
                try:
                    response_text = response.content.decode('utf-8', errors='ignore')
                except:
                    continue
            
            if not response_text:
                continue
            
            # Parse JSON response
            try:
                token_data = json.loads(response_text)
            except json.JSONDecodeError:
                continue
            
            # Check if this is a token response
            if not isinstance(token_data, dict):
                continue
            
            # Look for any response that has tokens (access_token, refresh_token, etc.)
            has_tokens = any(key in token_data for key in ['access_token', 'refresh_token', 'id_token'])
            if not has_tokens:
                continue
            
            # Extract token information
            oauth_response = {
                'timestamp': flow.request.timestamp_start,
                'url': request.pretty_url,
                'method': request.method,
                'status_code': response.status_code,
                'request_headers': dict(request.headers),
                'response_headers': dict(response.headers),
            }
            
            # Parse request body for grant type
            grant_type = 'unknown'
            if request.text:
                if 'grant_type=authorization_code' in request.text:
                    grant_type = 'authorization_code'
                elif 'grant_type=refresh_token' in request.text:
                    grant_type = 'refresh_token'
            
            oauth_response['grant_type'] = grant_type
            
            # Extract tokens
            access_token = token_data['access_token']
            oauth_response['access_token'] = access_token
            oauth_response['access_token_preview'] = access_token[:30] + '...' + access_token[-15:]
            
            if 'refresh_token' in token_data:
                refresh_token = token_data['refresh_token']
                oauth_response['refresh_token'] = refresh_token
                oauth_response['refresh_token_preview'] = refresh_token[:20] + '...' + refresh_token[-10:]
                oauth_response['has_refresh_token'] = True
            else:
                oauth_response['has_refresh_token'] = False
            
            if 'expires_in' in token_data:
                oauth_response['expires_in'] = token_data['expires_in']
            
            if 'token_type' in token_data:
                oauth_response['token_type'] = token_data['token_type']
            
            if 'scope' in token_data:
                oauth_response['scope'] = token_data['scope']
            
            if 'id_token' in token_data:
                oauth_response['id_token'] = token_data['id_token'][:30] + '...'
            
            # Decode JWT to get more info
            jwt_payload = decode_jwt_payload(access_token)
            if jwt_payload:
                oauth_response['jwt_payload'] = {
                    'iss': jwt_payload.get('iss'),
                    'aud': jwt_payload.get('aud'),
                    'exp': jwt_payload.get('exp'),
                    'iat': jwt_payload.get('iat'),
                    'scope': jwt_payload.get('scope', jwt_payload.get('scp', [])),
                    'client_id': jwt_payload.get('cid'),
                    'sub': jwt_payload.get('sub')
                }
                
                # Calculate expiration time
                if 'exp' in jwt_payload:
                    exp_time = datetime.fromtimestamp(jwt_payload['exp'])
                    oauth_response['expires_at'] = exp_time.isoformat()
            
            oauth_responses.append(oauth_response)
            
        except Exception as e:
            print(f"Error processing flow: {e}")
            continue
    
    return oauth_responses

def find_best_oauth_response(oauth_responses: List[Dict[str, Any]]) -> Optional[Dict[str, Any]]:
    """Find the best OAuth response with refresh token."""
    # Sort by timestamp (newest first)
    sorted_responses = sorted(oauth_responses, key=lambda x: x['timestamp'], reverse=True)
    
    # Prefer authorization_code grants with refresh tokens
    for response in sorted_responses:
        if (response.get('grant_type') == 'authorization_code' and 
            response.get('has_refresh_token') and
            response.get('status_code') == 200):
            return response
    
    # Fall back to any response with refresh token
    for response in sorted_responses:
        if response.get('has_refresh_token') and response.get('status_code') == 200:
            return response
    
    # Last resort: any successful token response
    for response in sorted_responses:
        if response.get('status_code') == 200:
            return response
    
    return None

def save_oauth_tokens(oauth_response: Dict[str, Any]) -> bool:
    """Save OAuth tokens to files."""
    try:
        # Save to auth.txt format
        with open("auth.txt", "w") as f:
            f.write(f"# OAuth tokens extracted from meijer2.log\n")
            f.write(f"# Timestamp: {oauth_response['timestamp']}\n")
            f.write(f"# Grant Type: {oauth_response.get('grant_type', 'unknown')}\n")
            f.write(f"bearer={oauth_response['access_token']}\n")
            if oauth_response.get('refresh_token'):
                f.write(f"refresh_token={oauth_response['refresh_token']}\n")
            f.write(f"user_agent=Meijer/101200000 okhttp/4.12.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)\n")
            if oauth_response.get('expires_in'):
                f.write(f"expires_in={oauth_response['expires_in']}\n")
            if oauth_response.get('scope'):
                f.write(f"scope={oauth_response['scope']}\n")
        
        # Save to JSON format
        with open("oauth_tokens.json", "w") as f:
            json.dump(oauth_response, f, indent=2)
        
        print(f"✅ OAuth tokens saved to:")
        print(f"   - auth.txt (key=value format)")
        print(f"   - oauth_tokens.json (complete data)")
        
        return True
        
    except Exception as e:
        print(f"❌ Failed to save OAuth tokens: {e}")
        return False

def main():
    """Extract OAuth tokens from meijer2.log."""
    print("🔍 Extracting Complete OAuth Tokens from meijer2.log")
    print("=" * 55)
    
    # Load flows
    flows = load_flows("meijer2.log")
    print(f"📊 Loaded {len(flows)} flows")
    
    # Extract OAuth responses
    oauth_responses = extract_oauth_token_responses(flows)
    print(f"🎯 Found {len(oauth_responses)} OAuth token responses")
    
    if not oauth_responses:
        print("❌ No OAuth token responses found")
        return
    
    # Show summary
    print(f"\n📋 OAuth Response Summary:")
    for i, response in enumerate(oauth_responses[:5]):  # Show first 5
        grant_type = response.get('grant_type', 'unknown')
        has_refresh = "✅" if response.get('has_refresh_token') else "❌"
        status = response.get('status_code', 'Unknown')
        
        print(f"   {i+1}. {grant_type} - Status: {status} - Refresh: {has_refresh}")
        if response.get('access_token_preview'):
            print(f"      Access: {response['access_token_preview']}")
        if response.get('refresh_token_preview'):
            print(f"      Refresh: {response['refresh_token_preview']}")
        if response.get('expires_in'):
            print(f"      Expires: {response['expires_in']} seconds")
    
    # Find the best response
    best_response = find_best_oauth_response(oauth_responses)
    
    if not best_response:
        print("\n❌ No suitable OAuth response found")
        return
    
    print(f"\n✅ Selected Best OAuth Response:")
    print(f"   Grant Type: {best_response.get('grant_type', 'unknown')}")
    print(f"   Status: {best_response.get('status_code')}")
    print(f"   Has Refresh Token: {best_response.get('has_refresh_token')}")
    print(f"   Access Token: {best_response.get('access_token_preview')}")
    if best_response.get('refresh_token_preview'):
        print(f"   Refresh Token: {best_response.get('refresh_token_preview')}")
    if best_response.get('expires_in'):
        print(f"   Expires In: {best_response.get('expires_in')} seconds")
    if best_response.get('scope'):
        print(f"   Scope: {best_response.get('scope')}")
    
    # Save tokens
    if save_oauth_tokens(best_response):
        print(f"\n🎉 Complete OAuth tokens extracted and saved!")
        print(f"💡 These tokens include refresh capability for automatic renewal")
    else:
        print(f"\n❌ Failed to save OAuth tokens")

if __name__ == "__main__":
    main() 