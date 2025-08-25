#!/usr/bin/env python3
"""
Analyze the OAuth2 response to extract state information for the IDX flow.
"""

import requests
import json
import secrets
import base64
import hashlib
import uuid
import re
from pathlib import Path

def analyze_oauth2_response():
    """Analyze the OAuth2 response to understand the flow."""
    
    # Load configuration
    config_path = Path.home() / ".config" / "meijer" / "auth_config.json"
    with open(config_path, 'r') as f:
        config = json.load(f)
    
    # Create session
    session = requests.Session()
    
    # Set headers
    session.headers.update({
        'User-Agent': config['user_agent']
    })
    
    # Add default headers
    default_headers = config['headers']['default']
    session.headers.update(default_headers)
    
    # First, visit Meijer homepage to establish session and cookies
    print("🏠 Step 1: Visiting Meijer homepage to establish session...")
    meijer_response = session.get(config['base_urls']['meijer'])
    print(f"   Meijer homepage status: {meijer_response.status_code}")
    print(f"   Cookies established: {len(session.cookies)}")
    
    print()
    
    # Make OAuth2 request
    print("🔐 Step 2: Making OAuth2 authorization request...")
    
    # Generate PKCE parameters
    code_verifier = secrets.token_urlsafe(32)
    code_challenge = base64.urlsafe_b64encode(
        hashlib.sha256(code_verifier.encode()).digest()
    ).decode().rstrip('=')
    
    oauth_params = {
        'client_id': '0oa1o8g9njWsUvwsx697',
        'scope': 'openid',
        'redirect_uri': 'com.meijer.mobile.meijer:/login',
        'response_type': 'code',
        'state': uuid.uuid4().hex,
        'code_challenge': code_challenge,
        'code_challenge_method': 'S256'
    }
    
    oauth_response = session.get(f"{config['base_urls']['okta']}/oauth2/default/v1/authorize", params=oauth_params)
    print(f"   OAuth2 status: {oauth_response.status_code}")
    print(f"   OAuth2 response size: {len(oauth_response.content)} bytes")
    
    if oauth_response.status_code == 200:
        print("   ✅ OAuth2 request successful!")
        
        # Analyze the response content
        content = oauth_response.text
        
        # Look for state tokens, state handles, or other session identifiers
        print("\n🔍 Analyzing OAuth2 response for state information...")
        
        # Look for common patterns
        patterns = [
            r'stateToken["\']?\s*:\s*["\']([^"\']+)["\']',
            r'stateHandle["\']?\s*:\s*["\']([^"\']+)["\']',
            r'state["\']?\s*:\s*["\']([^"\']+)["\']',
            r'data-state["\']?\s*=\s*["\']([^"\']+)["\']',
            r'data-statehandle["\']?\s*=\s*["\']([^"\']+)["\']',
            r'window\._stateToken\s*=\s*["\']([^"\']+)["\']',
            r'window\._stateHandle\s*=\s*["\']([^"\']+)["\']',
            r'window\.stateToken\s*=\s*["\']([^"\']+)["\']',
            r'window\.stateHandle\s*=\s*["\']([^"\']+)["\']',
            r'var\s+stateToken\s*=\s*["\']([^"\']+)["\']',
            r'var\s+stateHandle\s*=\s*["\']([^"\']+)["\']',
        ]
        
        found_tokens = []
        for pattern in patterns:
            matches = re.findall(pattern, content, re.IGNORECASE)
            for match in matches:
                if match and match not in found_tokens:
                    found_tokens.append(match)
                    print(f"   ✅ Found token: {match[:50]}...")
        
        if not found_tokens:
            print("   ❌ No state tokens found in response")
            
            # Look for any JavaScript variables or data attributes
            print("\n🔍 Looking for other potential state information...")
            
            # Check for any JavaScript variables
            js_vars = re.findall(r'var\s+(\w+)\s*=\s*["\']([^"\']+)["\']', content)
            for var_name, var_value in js_vars:
                if 'state' in var_name.lower() or 'token' in var_name.lower():
                    print(f"   📝 JavaScript variable: {var_name} = {var_value[:50]}...")
            
            # Check for data attributes
            data_attrs = re.findall(r'data-(\w+)["\']?\s*=\s*["\']([^"\']+)["\']', content)
            for attr_name, attr_value in data_attrs:
                if 'state' in attr_name.lower() or 'token' in attr_name.lower():
                    print(f"   📝 Data attribute: {attr_name} = {attr_value[:50]}...")
            
            # Check for hidden form fields
            hidden_fields = re.findall(r'<input[^>]*type=["\']hidden["\'][^>]*name=["\']([^"\']+)["\'][^>]*value=["\']([^"\']+)["\']', content)
            for field_name, field_value in hidden_fields:
                if 'state' in field_name.lower() or 'token' in field_name.lower():
                    print(f"   📝 Hidden field: {field_name} = {field_value[:50]}...")
        
        # Check if this is a login page
        if 'login' in content.lower() or 'signin' in content.lower():
            print("\n🎯 This appears to be a login page!")
            
            # Look for form action URLs
            form_actions = re.findall(r'<form[^>]*action=["\']([^"\']+)["\']', content)
            for action in form_actions:
                print(f"   📝 Form action: {action}")
            
            # Look for any URLs that might be the next step
            urls = re.findall(r'https?://[^\s"\'<>]+', content)
            for url in urls:
                if 'idx' in url or 'identify' in url:
                    print(f"   🔗 Potential IDX URL: {url}")
        
        # Save the response for manual inspection
        with open('oauth2_response.html', 'w') as f:
            f.write(content)
        print("\n💾 OAuth2 response saved to oauth2_response.html for manual inspection")
        
    else:
        print(f"   ❌ OAuth2 request failed: {oauth_response.status_code}")
        print(f"   Response: {oauth_response.text[:500]}...")

if __name__ == "__main__":
    analyze_oauth2_response()
