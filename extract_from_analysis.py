#!/usr/bin/env python3
"""
Extract OAuth Tokens from Analysis File
=======================================

Extract OAuth tokens directly from the existing meijer_analysis_report.json
that we know contains the complete OAuth response with refresh tokens.
"""

import json
import re
from typing import Optional, Dict, Any

def extract_oauth_from_analysis(analysis_file: str = "meijer_analysis_report.json") -> Optional[Dict[str, Any]]:
    """Extract OAuth tokens from the analysis file."""
    try:
        with open(analysis_file, 'r') as f:
            analysis_data = json.load(f)
        
        # Look through all flows for OAuth token responses
        # The flows are in the root level of the JSON, starting after the summary sections
        all_flows = []
        for key, value in analysis_data.items():
            if isinstance(value, list):
                # This is likely a flows section
                all_flows.extend(value)
            elif isinstance(value, dict) and 'url' in value:
                # This is a single flow
                all_flows.append(value)
        
        # If that doesn't work, try a different approach - iterate through all values
        if not all_flows:
            def find_flows(obj):
                flows = []
                if isinstance(obj, dict):
                    if 'url' in obj and 'response_body' in obj:
                        flows.append(obj)
                    for value in obj.values():
                        flows.extend(find_flows(value))
                elif isinstance(obj, list):
                    for item in obj:
                        flows.extend(find_flows(item))
                return flows
            
            all_flows = find_flows(analysis_data)
        
        for flow in all_flows:
            # Check if this flow has a response body with OAuth tokens
            response_body = flow.get('response_body', '')
            
            if not response_body:
                continue
            
            # Look for JSON response with token fields
            try:
                # Try to parse as JSON
                if response_body.startswith('{') and ('access_token' in response_body or 'refresh_token' in response_body):
                    token_data = json.loads(response_body)
                    
                    if isinstance(token_data, dict) and 'access_token' in token_data:
                        # Found OAuth response!
                        oauth_response = {
                            'source': 'meijer_analysis_report.json',
                            'url': flow.get('url', ''),
                            'method': flow.get('method', ''),
                            'status_code': flow.get('status_code', 0),
                            'timestamp': flow.get('timestamp', 0),
                        }
                        
                        # Extract tokens
                        oauth_response['access_token'] = token_data['access_token']
                        oauth_response['access_token_preview'] = token_data['access_token'][:30] + '...' + token_data['access_token'][-15:]
                        
                        if 'refresh_token' in token_data:
                            oauth_response['refresh_token'] = token_data['refresh_token']
                            oauth_response['refresh_token_preview'] = token_data['refresh_token'][:20] + '...' + token_data['refresh_token'][-10:]
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
                            oauth_response['full_id_token'] = token_data['id_token']
                        
                        # Determine grant type from URL or context
                        if '/oauth2/default/v1/token' in oauth_response['url']:
                            oauth_response['grant_type'] = 'authorization_code'  # Most likely
                        else:
                            oauth_response['grant_type'] = 'unknown'
                        
                        return oauth_response
                        
            except json.JSONDecodeError:
                continue
                
        return None
        
    except Exception as e:
        print(f"Error reading analysis file: {e}")
        return None

def save_oauth_tokens(oauth_response: Dict[str, Any]) -> bool:
    """Save OAuth tokens to files."""
    try:
        # Save to auth.txt format
        with open("auth.txt", "w") as f:
            f.write(f"# OAuth tokens extracted from analysis file\n")
            f.write(f"# Source: {oauth_response.get('source', 'unknown')}\n")
            f.write(f"# URL: {oauth_response.get('url', 'unknown')}\n")
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
    """Extract OAuth tokens from analysis file."""
    print("🔍 Extracting OAuth Tokens from Analysis File")
    print("=" * 50)
    
    # Extract from analysis
    oauth_response = extract_oauth_from_analysis()
    
    if not oauth_response:
        print("❌ No OAuth tokens found in analysis file")
        return
    
    print(f"✅ Found OAuth Response:")
    print(f"   Source: {oauth_response.get('source')}")
    print(f"   URL: {oauth_response.get('url')}")
    print(f"   Method: {oauth_response.get('method')}")
    print(f"   Status: {oauth_response.get('status_code')}")
    print(f"   Grant Type: {oauth_response.get('grant_type')}")
    print(f"   Has Refresh Token: {oauth_response.get('has_refresh_token')}")
    print(f"   Access Token: {oauth_response.get('access_token_preview')}")
    if oauth_response.get('refresh_token_preview'):
        print(f"   Refresh Token: {oauth_response.get('refresh_token_preview')}")
    if oauth_response.get('expires_in'):
        print(f"   Expires In: {oauth_response.get('expires_in')} seconds")
    if oauth_response.get('scope'):
        print(f"   Scope: {oauth_response.get('scope')}")
    
    # Save tokens
    if save_oauth_tokens(oauth_response):
        print(f"\n🎉 Complete OAuth tokens extracted and saved!")
        print(f"💡 These tokens include refresh capability for automatic renewal")
        
        if oauth_response.get('has_refresh_token'):
            print(f"✅ Refresh token available - automatic refresh enabled!")
        else:
            print(f"⚠️  No refresh token found")
    else:
        print(f"\n❌ Failed to save OAuth tokens")

if __name__ == "__main__":
    main() 