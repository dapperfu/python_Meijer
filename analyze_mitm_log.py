#!/usr/bin/env python3
"""
Robust mitmproxy log analyzer for id.meijer.com login flow.
"""

import json
import re
from pathlib import Path
from typing import Dict, List, Optional, Any
from urllib.parse import urlparse, parse_qs


def extract_flows_from_log(log_path: Path) -> List[Dict[str, Any]]:
    """Extract flow information from mitmproxy log file."""
    
    flows = []
    
    try:
        with open(log_path, 'rb') as f:
            content = f.read()
            
        # Split content into potential flow blocks
        # Look for patterns that indicate flow boundaries
        flow_blocks = re.split(rb'(?=\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2})', content)
        
        for block in flow_blocks:
            if not block.strip():
                continue
                
            try:
                block_str = block.decode('utf-8', errors='ignore')
                
                # Look for id.meijer.com requests
                if 'id.meijer.com' in block_str:
                    flow_info = extract_flow_info(block_str)
                    if flow_info:
                        flows.append(flow_info)
                        
            except Exception:
                continue
                
    except Exception as e:
        print(f"Error reading log file: {e}")
        
    return flows


def extract_flow_info(block_str: str) -> Optional[Dict[str, Any]]:
    """Extract flow information from a block of text."""
    
    # Extract URL
    url_match = re.search(r'https?://[^\s\n]+', block_str)
    if not url_match:
        return None
        
    url = url_match.group(0)
    parsed_url = urlparse(url)
    
    # Extract timestamp
    timestamp_match = re.search(r'(\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2})', block_str)
    timestamp = timestamp_match.group(1) if timestamp_match else None
    
    # Extract HTTP method
    method_match = re.search(r'(GET|POST|PUT|DELETE|PATCH)', block_str)
    method = method_match.group(1) if method_match else None
    
    # Extract response code
    response_match = re.search(r'(\d{3})', block_str)
    response_code = response_match.group(1) if response_match else None
    
    # Extract query parameters
    query_params = {}
    if parsed_url.query:
        query_params = parse_qs(parsed_url.query)
    
    # Look for tokens in the block
    tokens = extract_tokens_from_block(block_str)
    
    return {
        'url': url,
        'path': parsed_url.path,
        'query': parsed_url.query,
        'query_params': query_params,
        'timestamp': timestamp,
        'method': method,
        'response_code': response_code,
        'tokens': tokens,
        'raw_block': block_str[:500]  # First 500 chars for context
    }


def extract_tokens_from_block(block_str: str) -> Dict[str, str]:
    """Extract tokens from a block of text."""
    
    tokens = {}
    
    # Common token patterns
    token_patterns = {
        'refresh_token': r'refresh_token["\']?\s*[:=]\s*["\']([^"\']+)["\']',
        'access_token': r'access_token["\']?\s*[:=]\s*["\']([^"\']+)["\']',
        'id_token': r'id_token["\']?\s*[:=]\s*["\']([^"\']+)["\']',
        'stateToken': r'stateToken=([^&\s]+)',
        'code': r'code=([^&\s]+)',
        'token': r'token["\']?\s*[:=]\s*["\']([^"\']+)["\']',
        'serversidesignal': r'serversidesignal["\']?\s*[:=]\s*["\']([^"\']+)["\']'
    }
    
    for token_name, pattern in token_patterns.items():
        matches = re.findall(pattern, block_str, re.IGNORECASE)
        if matches:
            # Take the first match that looks like a real token
            for match in matches:
                if len(match) > 10:  # Likely a real token
                    tokens[token_name] = match
                    break
    
    return tokens


def analyze_login_flow(flows: List[Dict[str, Any]]) -> None:
    """Analyze the login flow sequence."""
    
    print(f"📊 Found {len(flows)} id.meijer.com requests")
    print("=" * 80)
    
    # Group flows by endpoint type
    device_fingerprint = []
    login_flows = []
    token_redirects = []
    bm_params = []
    other_flows = []
    
    for flow in flows:
        path = flow['path']
        
        if '/auth/services/devicefingerprint' in path:
            device_fingerprint.append(flow)
        elif '/login/token/redirect' in path:
            token_redirects.append(flow)
        elif '/_bm/get_params' in path:
            bm_params.append(flow)
        elif 'login' in path.lower() or 'auth' in path.lower():
            login_flows.append(flow)
        else:
            other_flows.append(flow)
    
    # Display device fingerprint flows
    if device_fingerprint:
        print("\n🔐 DEVICE FINGERPRINT FLOWS:")
        for flow in device_fingerprint:
            print(f"  {flow['method']} {flow['path']}")
            if flow['query_params']:
                print(f"    Query: {flow['query_params']}")
            if flow['tokens']:
                print(f"    Tokens: {flow['tokens']}")
    
    # Display token redirect flows
    if token_redirects:
        print("\n🔄 TOKEN REDIRECT FLOWS:")
        for flow in token_redirects:
            print(f"  {flow['method']} {flow['path']}")
            if flow['query_params']:
                print(f"    Query: {flow['query_params']}")
            if flow['tokens']:
                print(f"    Tokens: {flow['tokens']}")
    
    # Display bm params flows
    if bm_params:
        print("\n📱 BM PARAMS FLOWS:")
        for flow in bm_params:
            print(f"  {flow['method']} {flow['path']}")
            if flow['query_params']:
                print(f"    Query: {flow['query_params']}")
            if flow['tokens']:
                print(f"    Tokens: {flow['tokens']}")
    
    # Display other login flows
    if login_flows:
        print("\n🔑 OTHER LOGIN FLOWS:")
        for flow in login_flows:
            print(f"  {flow['method']} {flow['path']}")
            if flow['query_params']:
                print(f"    Query: {flow['query_params']}")
            if flow['tokens']:
                print(f"    Tokens: {flow['tokens']}")
    
    # Display other flows
    if other_flows:
        print("\n📋 OTHER FLOWS:")
        for flow in other_flows[:5]:  # Show first 5
            print(f"  {flow['method']} {flow['path']}")
            if flow['tokens']:
                print(f"    Tokens: {flow['tokens']}")
    
    # Summary of tokens found
    all_tokens = {}
    for flow in flows:
        all_tokens.update(flow['tokens'])
    
    if all_tokens:
        print(f"\n🎯 TOKENS FOUND ({len(all_tokens)}):")
        for token_name, token_value in all_tokens.items():
            print(f"  {token_name}: {token_value[:50]}...")
    else:
        print("\n❌ No tokens found in the flows")


def main():
    """Main analysis function."""
    
    log_file = Path("logs/meijer_mitm_20250826_114803.log")
    
    if not log_file.exists():
        print(f"Log file not found: {log_file}")
        return
    
    print(f"Analyzing log file: {log_file}")
    print(f"File size: {log_file.stat().st_size / (1024*1024):.2f} MB")
    print("=" * 80)
    
    # Extract flows
    flows = extract_flows_from_log(log_file)
    
    if not flows:
        print("No flows found. Trying alternative parsing method...")
        # Try to find any id.meijer.com references
        search_for_simple_patterns(log_file)
        return
    
    # Analyze the flows
    analyze_login_flow(flows)


def search_for_simple_patterns(log_path: Path) -> None:
    """Search for simple patterns in the log file."""
    
    print("\n🔍 Searching for simple patterns...")
    
    try:
        with open(log_path, 'rb') as f:
            for line_num, line in enumerate(f, 1):
                try:
                    line_str = line.decode('utf-8', errors='ignore')
                    
                    if 'id.meijer.com' in line_str:
                        # Look for URLs
                        urls = re.findall(r'https?://[^\s\n]+', line_str)
                        for url in urls:
                            if 'id.meijer.com' in url:
                                print(f"Line {line_num}: {url}")
                                
                                # Check for specific endpoints
                                if any(endpoint in url for endpoint in [
                                    '/auth/services/devicefingerprint',
                                    '/login/token/redirect',
                                    '/_bm/get_params'
                                ]):
                                    print(f"  🎯 KEY ENDPOINT FOUND!")
                                
                                # Check for tokens in URL
                                if 'token=' in url or 'stateToken=' in url:
                                    print(f"  🔑 TOKEN IN URL!")
                                
                except Exception:
                    continue
                    
                # Limit search to first 5000 lines
                if line_num > 5000:
                    print("Reached line limit for simple search")
                    break
                    
    except Exception as e:
        print(f"Error during simple search: {e}")


if __name__ == "__main__":
    main()
