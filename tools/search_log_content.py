#!/usr/bin/env python3
"""
Search for specific content in mitmproxy log files.
"""

import sys
import json
from mitmproxy import io
from mitmproxy import http
from mitmproxy import ctx


def search_log_for_content(log_file_path: str, search_terms: list):
    """Search for specific content in a mitmproxy log file."""
    
    print(f"🔍 Searching for: {', '.join(search_terms)}")
    print(f"📁 Log file: {log_file_path}")
    print("=" * 80)
    
    found_matches = []
    
    try:
        with open(log_file_path, 'rb') as f:
            reader = io.FlowReader(f)
            
            for flow in reader.stream():
                if not isinstance(flow, http.HTTPFlow):
                    continue
                
                # Search in request
                if flow.request:
                    request_text = f"{flow.request.method} {flow.request.url}"
                    if flow.request.content:
                        request_text += f"\nRequest Body: {flow.request.content.decode('utf-8', errors='ignore')}"
                    
                    for term in search_terms:
                        if term.lower() in request_text.lower():
                            found_matches.append({
                                'type': 'request',
                                'method': flow.request.method,
                                'url': flow.request.url,
                                'content': request_text,
                                'term': term
                            })
                
                # Search in response
                if flow.response and flow.response.content:
                    response_text = f"{flow.request.method} {flow.request.url} -> {flow.response.status_code}"
                    try:
                        response_body = flow.response.content.decode('utf-8', errors='ignore')
                        response_text += f"\nResponse Body: {response_body}"
                    except:
                        response_text += f"\nResponse Body: [binary content]"
                    
                    for term in search_terms:
                        if term.lower() in response_text.lower():
                            found_matches.append({
                                'type': 'response',
                                'method': flow.request.method,
                                'url': flow.request.url,
                                'status': flow.response.status_code,
                                'content': response_text,
                                'term': term
                            })
    
    except Exception as e:
        print(f"❌ Error reading log file: {e}")
        return
    
    if not found_matches:
        print("❌ No matches found for any search terms.")
        return
    
    print(f"✅ Found {len(found_matches)} matches:")
    print()
    
    for i, match in enumerate(found_matches, 1):
        print(f"Match {i}:")
        print(f"  Type: {match['type']}")
        print(f"  Term: {match['term']}")
        print(f"  Method: {match['method']}")
        print(f"  URL: {match['url']}")
        if 'status' in match:
            print(f"  Status: {match['status']}")
        print(f"  Content: {match['content'][:500]}...")
        print("-" * 80)


if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python search_log_content.py <log_file> [search_term1] [search_term2] ...")
        print("Example: python search_log_content.py meijer_mitm.log totp feedback register")
        sys.exit(1)
    
    log_file = sys.argv[1]
    search_terms = sys.argv[2:] if len(sys.argv) > 2 else ['totp', 'feedback', 'register', 'signup', 'create']
    
    search_log_for_content(log_file, search_terms) 