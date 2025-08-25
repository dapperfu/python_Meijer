#!/usr/bin/env python3
"""
Extract HTTP Requests from Binary Log

This tool extracts actual HTTP requests and responses from mitmproxy binary logs
by looking for HTTP request patterns and extracting the surrounding context.
"""

import re
import json
from pathlib import Path
from typing import Dict, List, Any, Optional

def extract_http_requests(log_file_path: str):
    """
    Extract HTTP requests from binary log by looking for HTTP request patterns.
    """
    print(f"🔍 Extracting HTTP requests from: {log_file_path}")
    
    try:
        with open(log_file_path, 'rb') as f:
            content = f.read()
        
        print(f"   📁 File size: {len(content) / (1024*1024):.1f} MB")
        
        # Look for HTTP request patterns
        print("\n🔍 Looking for HTTP request patterns...")
        
        # Pattern 1: HTTP request line (GET/POST with URL)
        http_request_pattern = rb'(GET|POST|PUT|DELETE|PATCH)\s+([^\s\r\n]+)\s+HTTP/[0-9.]+'
        http_requests = find_http_requests(content, http_request_pattern)
        
        print(f"   Found {len(http_requests)} HTTP requests")
        
        # Filter for authentication-related requests
        auth_requests = []
        for req in http_requests:
            if is_auth_request(req):
                auth_requests.append(req)
        
        print(f"   Found {len(auth_requests)} authentication-related requests")
        
        # Analyze the authentication requests
        if auth_requests:
            analyze_auth_requests(auth_requests)
        
        # Look for specific authentication endpoints
        print("\n🔍 Looking for specific authentication endpoints...")
        
        # OAuth2 authorize
        oauth2_requests = find_requests_by_url_pattern(content, rb'oauth2/default/v1/authorize')
        if oauth2_requests:
            print(f"   OAuth2 authorize: {len(oauth2_requests)} requests")
            for i, req in enumerate(oauth2_requests[:2]):  # Show first 2
                print(f"      OAuth2 #{i+1}: {req['method']} {req['url']}")
        
        # IDP identify
        idp_requests = find_requests_by_url_pattern(content, rb'idp/idx/identify')
        if idp_requests:
            print(f"   IDP identify: {len(idp_requests)} requests")
            for i, req in enumerate(idp_requests[:2]):  # Show first 2
                print(f"      IDP #{i+1}: {req['method']} {req['url']}")
        
        # Device fingerprint
        device_fp_requests = find_requests_by_url_pattern(content, rb'auth/services/devicefingerprint')
        if device_fp_requests:
            print(f"   Device fingerprint: {len(device_fp_requests)} requests")
            for i, req in enumerate(device_fp_requests[:2]):  # Show first 2
                print(f"      Device FP #{i+1}: {req['method']} {req['url']}")
        
        # Device nonce
        device_nonce_requests = find_requests_by_url_pattern(content, rb'api/v1/internal/device/nonce')
        if device_nonce_requests:
            print(f"   Device nonce: {len(device_nonce_requests)} requests")
            for i, req in enumerate(device_nonce_requests[:2]):  # Show first 2
                print(f"      Device nonce #{i+1}: {req['method']} {req['url']}")
        
        # Token exchange
        token_requests = find_requests_by_url_pattern(content, rb'oauth2/default/v1/token')
        if token_requests:
            print(f"   Token exchange: {len(token_requests)} requests")
            for i, req in enumerate(token_requests[:2]):  # Show first 2
                print(f"      Token #{i+1}: {req['method']} {req['url']}")
        
        return True
        
    except Exception as e:
        print(f"❌ Error reading log file: {e}")
        return False

def find_http_requests(content: bytes, pattern: bytes) -> List[Dict[str, Any]]:
    """Find all HTTP requests matching the pattern."""
    requests = []
    start = 0
    
    while True:
        pos = content.find(pattern, start)
        if pos == -1:
            break
        
        # Extract context around the request
        context_start = max(0, pos - 1000)
        context_end = min(len(content), pos + 2000)
        context = content[context_start:context_end]
        
        try:
            context_text = context.decode('utf-8', errors='ignore')
            
            # Parse the HTTP request
            request = parse_http_request(context_text, pos - context_start)
            if request:
                requests.append(request)
            
        except Exception:
            pass
        
        start = pos + 1
    
    return requests

def find_requests_by_url_pattern(content: bytes, url_pattern: bytes) -> List[Dict[str, Any]]:
    """Find requests by URL pattern."""
    requests = []
    start = 0
    
    while True:
        pos = content.find(url_pattern, start)
        if pos == -1:
            break
        
        # Look backwards for HTTP request line
        search_start = max(0, pos - 2000)
        search_end = pos + 1000
        search_context = content[search_start:search_end]
        
        try:
            context_text = search_context.decode('utf-8', errors='ignore')
            
            # Look for HTTP request line
            request_match = re.search(r'(GET|POST|PUT|DELETE|PATCH)\s+([^\s\r\n]+)\s+HTTP/[0-9.]+', context_text)
            if request_match:
                method = request_match.group(1)
                url = request_match.group(2)
                
                # Extract more context around this request
                full_context = extract_context_at_position(content, pos, 3000)
                if full_context:
                    request = {
                        'method': method,
                        'url': url,
                        'position': pos,
                        'context': full_context[:500] + '...' if len(full_context) > 500 else full_context
                    }
                    requests.append(request)
            
        except Exception:
            pass
        
        start = pos + 1
    
    return requests

def extract_context_at_position(content: bytes, position: int, context_size: int) -> str:
    """Extract context around a specific position."""
    context_start = max(0, position - context_size // 2)
    context_end = min(len(content), position + context_size // 2)
    context = content[context_start:context_end]
    
    try:
        return context.decode('utf-8', errors='ignore')
    except:
        return ""

def parse_http_request(context_text: str, pattern_offset: int) -> Optional[Dict[str, Any]]:
    """Parse HTTP request from context text."""
    try:
        # Look for HTTP request line
        request_match = re.search(r'(GET|POST|PUT|DELETE|PATCH)\s+([^\s\r\n]+)\s+HTTP/[0-9.]+', context_text)
        if not request_match:
            return None
        
        method = request_match.group(1)
        url = request_match.group(2)
        
        # Extract headers
        headers = extract_headers_from_context(context_text)
        
        # Extract request body if POST
        request_body = None
        if method == 'POST':
            body_match = re.search(r'\r\n\r\n(.*?)(?=\r\n|$)', context_text, re.DOTALL)
            if body_match:
                try:
                    request_body = json.loads(body_match.group(1))
                except:
                    request_body = body_match.group(1)
        
        request = {
            'method': method,
            'url': url,
            'headers': headers,
            'request_body': request_body,
            'context': context_text[:500] + '...' if len(context_text) > 500 else context_text
        }
        
        return request
        
    except Exception:
        return None

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

def is_auth_request(request: Dict[str, Any]) -> bool:
    """Check if a request is authentication-related."""
    url = request.get('url', '').lower()
    
    # Authentication endpoints
    auth_endpoints = [
        'oauth2', 'idp/idx', 'login', 'auth', 'signin', 'authenticate',
        'token', 'authorize', 'challenge', 'identify', 'devicefingerprint'
    ]
    
    # Check URL for auth endpoints
    if any(endpoint in url for endpoint in auth_endpoints):
        return True
    
    # Check for auth headers
    headers = request.get('headers', {})
    if any(header.lower() in ['authorization', 'cookie'] for header in headers):
        return True
    
    return False

def analyze_auth_requests(auth_requests: List[Dict[str, Any]]):
    """Analyze authentication requests to find patterns."""
    print("\n🔍 Analyzing authentication requests...")
    
    # Group by method
    methods = {}
    for req in auth_requests:
        method = req['method']
        if method not in methods:
            methods[method] = []
        methods[method].append(req)
    
    print("   HTTP Methods:")
    for method, requests in methods.items():
        print(f"      {method}: {len(requests)} requests")
    
    # Group by URL pattern
    url_patterns = {}
    for req in auth_requests:
        url = req['url']
        if url.startswith('/'):
            path = url
        else:
            # Try to extract path from full URL
            try:
                from urllib.parse import urlparse
                parsed = urlparse(url)
                path = parsed.path
            except:
                path = url
        
        if path not in url_patterns:
            url_patterns[path] = []
        url_patterns[path].append(req)
    
    print("   URL Patterns:")
    for path, requests in url_patterns.items():
        print(f"      {path}: {len(requests)} requests")
    
    # Analyze headers
    all_headers = {}
    for req in auth_requests:
        headers = req.get('headers', {})
        for header_name, header_value in headers.items():
            if header_name not in all_headers:
                all_headers[header_name] = []
            all_headers[header_name].append(header_value)
    
    print("   Common Headers:")
    for header_name, values in all_headers.items():
        if len(values) > 1:
            print(f"      {header_name}: {len(values)} values")
            # Show first value
            if values:
                print(f"        Example: {values[0][:50]}...")

def main():
    """Main function to extract HTTP requests."""
    print("🚀 MEIJER HTTP REQUEST EXTRACTION")
    print("=" * 80)
    print("This tool extracts HTTP requests from mitmproxy binary logs.")
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
    
    # Extract HTTP requests
    success = extract_http_requests(str(latest_log))
    
    if success:
        print("\n✅ HTTP request extraction completed")
        print("\n🎯 Next steps:")
        print("1. Review the extracted HTTP requests above")
        print("2. Identify the exact authentication flow patterns")
        print("3. Update authentication client with extracted patterns")
        print("4. Test with the new configuration")
    else:
        print("\n❌ HTTP request extraction failed")

if __name__ == "__main__":
    main()
