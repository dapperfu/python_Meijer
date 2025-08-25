#!/usr/bin/env python3
"""
Simple Authentication Pattern Extractor

This tool directly searches for known authentication patterns in the binary log
and extracts the surrounding context to understand the exact flow.
"""

import re
from pathlib import Path
from typing import Dict, List

def extract_auth_context(log_file_path: str):
    """
    Extract authentication context from binary log by searching for known patterns.
    """
    print(f"🔍 Extracting authentication context from: {log_file_path}")
    
    try:
        with open(log_file_path, 'rb') as f:
            content = f.read()
        
        print(f"   📁 File size: {len(content) / (1024*1024):.1f} MB")
        
        # Search for OAuth2 authorization
        print("\n🔍 Searching for OAuth2 authorization...")
        oauth2_pattern = rb'oauth2/default/v1/authorize'
        oauth2_positions = find_all_positions(content, oauth2_pattern)
        
        for i, pos in enumerate(oauth2_positions):
            print(f"   OAuth2 #{i+1} at position {pos}")
            context = extract_context_at_position(content, pos, 3000)
            if context:
                print(f"      Context: {context[:200]}...")
                
                # Look for HTTP request line
                request_match = re.search(r'(GET|POST)\s+([^\s]+)', context)
                if request_match:
                    method = request_match.group(1)
                    url = request_match.group(2)
                    print(f"      Method: {method}")
                    print(f"      URL: {url}")
                
                # Look for headers
                headers = extract_headers_from_context(context)
                if headers:
                    print(f"      Headers: {len(headers)} found")
                    for key, value in list(headers.items())[:3]:  # Show first 3
                        print(f"        {key}: {value[:50]}...")
        
        # Search for IDP identify
        print("\n🔍 Searching for IDP identify...")
        idp_pattern = rb'idp/idx/identify'
        idp_positions = find_all_positions(content, idp_pattern)
        
        for i, pos in enumerate(idp_positions):
            print(f"   IDP Identify #{i+1} at position {pos}")
            context = extract_context_at_position(content, pos, 3000)
            if context:
                print(f"      Context: {context[:200]}...")
                
                # Look for HTTP request line
                request_match = re.search(r'(GET|POST)\s+([^\s]+)', context)
                if request_match:
                    method = request_match.group(1)
                    url = request_match.group(2)
                    print(f"      Method: {method}")
                    print(f"      URL: {url}")
                
                # Look for headers
                headers = extract_headers_from_context(context)
                if headers:
                    print(f"      Headers: {len(headers)} found")
                    for key, value in list(headers.items())[:3]:  # Show first 3
                        print(f"        {key}: {value[:50]}...")
        
        # Search for device fingerprint
        print("\n🔍 Searching for device fingerprint...")
        device_fp_pattern = rb'auth/services/devicefingerprint'
        device_fp_positions = find_all_positions(content, device_fp_pattern)
        
        for i, pos in enumerate(device_fp_positions):
            print(f"   Device Fingerprint #{i+1} at position {pos}")
            context = extract_context_at_position(content, pos, 3000)
            if context:
                print(f"      Context: {context[:200]}...")
                
                # Look for HTTP request line
                request_match = re.search(r'(GET|POST)\s+([^\s]+)', context)
                if request_match:
                    method = request_match.group(1)
                    url = request_match.group(2)
                    print(f"      Method: {method}")
                    print(f"      URL: {url}")
                
                # Look for headers
                headers = extract_headers_from_context(context)
                if headers:
                    print(f"      Headers: {len(headers)} found")
                    for key, value in list(headers.items())[:3]:  # Show first 3
                        print(f"        {key}: {value[:50]}...")
        
        # Search for device nonce
        print("\n🔍 Searching for device nonce...")
        device_nonce_pattern = rb'api/v1/internal/device/nonce'
        device_nonce_positions = find_all_positions(content, device_nonce_pattern)
        
        for i, pos in enumerate(device_nonce_positions):
            print(f"   Device Nonce #{i+1} at position {pos}")
            context = extract_context_at_position(content, pos, 3000)
            if context:
                print(f"      Context: {context[:200]}...")
                
                # Look for HTTP request line
                request_match = re.search(r'(GET|POST)\s+([^\s]+)', context)
                if request_match:
                    method = request_match.group(1)
                    url = request_match.group(2)
                    print(f"      Method: {method}")
                    print(f"      URL: {url}")
                
                # Look for headers
                headers = extract_headers_from_context(context)
                if headers:
                    print(f"      Headers: {len(headers)} found")
                    for key, value in list(headers.items())[:3]:  # Show first 3
                        print(f"        {key}: {value[:50]}...")
        
        # Search for token exchange
        print("\n🔍 Searching for token exchange...")
        token_pattern = rb'oauth2/default/v1/token'
        token_positions = find_all_positions(content, token_pattern)
        
        for i, pos in enumerate(token_positions):
            print(f"   Token Exchange #{i+1} at position {pos}")
            context = extract_context_at_position(content, pos, 3000)
            if context:
                print(f"      Context: {context[:200]}...")
                
                # Look for HTTP request line
                request_match = re.search(r'(GET|POST)\s+([^\s]+)', context)
                if request_match:
                    method = request_match.group(1)
                    url = request_match.group(2)
                    print(f"      Method: {method}")
                    print(f"      URL: {url}")
                
                # Look for headers
                headers = extract_headers_from_context(context)
                if headers:
                    print(f"      Headers: {len(headers)} found")
                    for key, value in list(headers.items())[:3]:  # Show first 3
                        print(f"        {key}: {value[:50]}...")
        
        # Search for state tokens
        print("\n🔍 Searching for state tokens...")
        state_token_pattern = rb'stateToken'
        state_token_positions = find_all_positions(content, state_token_pattern)
        
        print(f"   Found {len(state_token_positions)} state token references")
        for i, pos in enumerate(state_token_positions[:3]):  # Show first 3
            context = extract_context_at_position(content, pos, 1000)
            if context:
                # Look for state token value
                token_match = re.search(r'stateToken["\']?\s*:\s*["\']([^"\']+)["\']', context)
                if token_match:
                    token_value = token_match.group(1)
                    print(f"      State Token #{i+1}: {token_value[:50]}...")
        
        # Search for state handles
        print("\n🔍 Searching for state handles...")
        state_handle_pattern = rb'stateHandle'
        state_handle_positions = find_all_positions(content, state_handle_pattern)
        
        print(f"   Found {len(state_handle_positions)} state handle references")
        for i, pos in enumerate(state_handle_positions[:3]):  # Show first 3
            context = extract_context_at_position(content, pos, 1000)
            if context:
                # Look for state handle value
                handle_match = re.search(r'stateHandle["\']?\s*:\s*["\']([^"\']+)["\']', context)
                if handle_match:
                    handle_value = handle_match.group(1)
                    print(f"      State Handle #{i+1}: {handle_value[:50]}...")
        
        # Search for user agents
        print("\n🔍 Searching for user agents...")
        user_agent_pattern = rb'User-Agent'
        user_agent_positions = find_all_positions(content, user_agent_pattern)
        
        print(f"   Found {len(user_agent_positions)} user agent references")
        for i, pos in enumerate(user_agent_positions[:3]):  # Show first 3
            context = extract_context_at_position(content, pos, 500)
            if context:
                # Look for user agent value
                ua_match = re.search(r'User-Agent:\s*([^\r\n]+)', context)
                if ua_match:
                    ua_value = ua_match.group(1).strip()
                    print(f"      User Agent #{i+1}: {ua_value[:100]}...")
        
        # Search for device fingerprint headers
        print("\n🔍 Searching for device fingerprint headers...")
        device_fp_header_pattern = rb'X-Device-Fingerprint'
        device_fp_header_positions = find_all_positions(content, device_fp_header_pattern)
        
        print(f"   Found {len(device_fp_header_positions)} device fingerprint header references")
        for i, pos in enumerate(device_fp_header_positions[:3]):  # Show first 3
            context = extract_context_at_position(content, pos, 500)
            if context:
                # Look for device fingerprint value
                fp_match = re.search(r'X-Device-Fingerprint:\s*([^\r\n]+)', context)
                if fp_match:
                    fp_value = fp_match.group(1).strip()
                    print(f"      Device Fingerprint #{i+1}: {fp_value[:100]}...")
        
        # Search for Okta user agent headers
        print("\n🔍 Searching for Okta user agent headers...")
        okta_ua_pattern = rb'X-Okta-User-Agent-Extended'
        okta_ua_positions = find_all_positions(content, okta_ua_pattern)
        
        print(f"   Found {len(okta_ua_positions)} Okta user agent header references")
        for i, pos in enumerate(okta_ua_positions[:3]):  # Show first 3
            context = extract_context_at_position(content, pos, 500)
            if context:
                # Look for Okta user agent value
                okta_match = re.search(r'X-Okta-User-Agent-Extended:\s*([^\r\n]+)', context)
                if okta_match:
                    okta_value = okta_match.group(1).strip()
                    print(f"      Okta User Agent #{i+1}: {okta_value[:100]}...")
        
        return True
        
    except Exception as e:
        print(f"❌ Error reading log file: {e}")
        return False

def find_all_positions(content: bytes, pattern: bytes) -> List[int]:
    """Find all positions of a pattern in the content."""
    positions = []
    start = 0
    
    while True:
        pos = content.find(pattern, start)
        if pos == -1:
            break
        
        positions.append(pos)
        start = pos + 1
    
    return positions

def extract_context_at_position(content: bytes, position: int, context_size: int) -> str:
    """Extract context around a specific position."""
    context_start = max(0, position - context_size // 2)
    context_end = min(len(content), position + context_size // 2)
    context = content[context_start:context_end]
    
    try:
        return context.decode('utf-8', errors='ignore')
    except:
        return ""

def extract_headers_from_context(context_text: str) -> Dict[str, str]:
    """Extract HTTP headers from context text."""
    headers = {}
    
    # Look for header lines (key: value format)
    header_pattern = r'^([^:]+):\s*(.+)$'
    
    for line in context_text.split('\n'):
        line = line.strip()
        match = re.match(header_pattern, line)
        if match:
            key = match.group(1).strip()
            value = match.group(2).strip()
            headers[key] = value
    
    return headers

def main():
    """Main function to extract authentication context."""
    print("🚀 MEIJER AUTHENTICATION CONTEXT EXTRACTION")
    print("=" * 80)
    print("This tool extracts authentication context from mitmproxy binary logs.")
    print()
    
    # Find the latest log file
    log_dir = Path("logs")
    log_files = list(log_dir.glob("*.log"))
    
    if not log_files:
        print("❌ No log files found")
        return
    
    # Sort by modification time, newest first
    log_files.sort(key=lambda x: x.stat().st_mtime, reverse=True)
    latest_log = log_files[0]
    
    print(f"📁 Found latest log: {latest_log}")
    print(f"   Size: {latest_log.stat().st_size / (1024*1024):.1f} MB")
    print()
    
    # Extract authentication context
    success = extract_auth_context(str(latest_log))
    
    if success:
        print("\n✅ Authentication context extraction completed")
        print("\n🎯 Next steps:")
        print("1. Review the extracted context above")
        print("2. Identify the exact authentication flow patterns")
        print("3. Update authentication client with extracted patterns")
        print("4. Test with the new configuration")
    else:
        print("\n❌ Authentication context extraction failed")

if __name__ == "__main__":
    main()
