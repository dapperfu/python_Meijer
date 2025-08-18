#!/usr/bin/env python3
"""
Extract headers specifically from reservationslots endpoint requests.
"""

import re
from pathlib import Path

def extract_reservationslots_headers():
    """Extract headers from reservationslots endpoint requests."""
    print("Extracting headers from reservationslots endpoint requests...")
    
    # Find the most recent log file
    log_files = list(Path('.').rglob('*.log'))
    if not log_files:
        print("No log files found!")
        return
    
    latest_log = sorted(log_files, key=lambda x: x.stat().st_mtime, reverse=True)[0]
    print(f"Using latest log: {latest_log}")
    
    try:
        with open(latest_log, 'rb') as f:
            content = f.read()
        
        # Try to decode
        try:
            decoded_content = content.decode('utf-8', errors='ignore')
        except UnicodeDecodeError:
            decoded_content = content.decode('latin-1', errors='ignore')
        
        # Look specifically for reservationslots requests
        # The pattern shows: 4:path;47:/digital/hybris/v3/fulfillment/reservationslots
        path_pattern = r'4:path;47:/digital/hybris/v3/fulfillment/reservationslots'
        path_matches = re.finditer(path_pattern, decoded_content)
        
        print(f"Looking for reservationslots requests...")
        
        for i, path_match in enumerate(path_matches):
            print(f"\n=== Reservationslots Request {i+1} ===")
            
            # Get context around this path match
            start_pos = max(0, path_match.start() - 2000)
            end_pos = min(len(decoded_content), path_match.end() + 2000)
            context = decoded_content[start_pos:end_pos]
            
            print(f"Position: {path_match.start()}")
            
            # Look for the request section
            request_section = re.search(r'7:request;([^}]+)', context)
            if request_section:
                request_content = request_section.group(1)
                print(f"Request section found")
                
                # Look for method
                method_match = re.search(r'6:method;(\d+):([^,]+)', request_content)
                if method_match:
                    method_length = int(method_match.group(1))
                    method_value = method_match.group(2)
                    if len(method_value) >= method_length:
                        actual_method = method_value[:method_length]
                        print(f"  Method: {actual_method}")
                
                # Look for path
                path_match = re.search(r'4:path;(\d+):([^,]+)', request_content)
                if path_match:
                    path_length = int(path_match.group(1))
                    path_value = path_match.group(2)
                    if len(path_value) >= path_length:
                        actual_path = path_value[:path_length]
                        print(f"  Path: {actual_path}")
                
                # Look for headers section
                headers_section = re.search(r'7:headers;([^}]+)', context)
                if headers_section:
                    header_content = headers_section.group(1)
                    print(f"  Headers section found")
                    
                    # Parse the header format: key_length:key,value_length:value
                    header_pairs = re.findall(r'(\d+):([^,]+),(\d+):([^,]+)', header_content)
                    
                    print(f"  Parsed headers:")
                    for key_len, key, value_len, value in header_pairs:
                        try:
                            key_len = int(key_len)
                            value_len = int(value_len)
                            
                            if len(key) >= key_len and len(value) >= value_len:
                                actual_key = key[:key_len]
                                actual_value = value[:value_len]
                                
                                if actual_key and actual_value and not actual_key.isdigit() and not actual_value.isdigit():
                                    print(f"    {actual_key}: {actual_value}")
                        except (ValueError, IndexError):
                            continue
                else:
                    print("  No headers section found")
                
                # Look for content section
                content_section = re.search(r'7:content;(\d+):(\{[^}]+\})', context)
                if content_section:
                    content_length = content_section.group(1)
                    content_value = content_section.group(2)
                    print(f"  Content length: {content_length}")
                    print(f"  Content: {content_value[:200]}...")
                
                # Look for the response section
                response_section = re.search(r'7:response;([^}]+)', context)
                if response_section:
                    response_content = response_section.group(1)
                    print(f"  Response section found")
                    
                    # Look for status code
                    status_match = re.search(r'HTTP/[0-9.]+ (\d+)', response_content)
                    if status_match:
                        status_code = status_match.group(1)
                        print(f"    Status: {status_code}")
            else:
                print("  No request section found")
            
            # Limit to first 3 matches to avoid overwhelming output
            if i >= 2:
                break
    
    except Exception as e:
        print(f"Error processing log: {e}")
        import traceback
        traceback.print_exc()

if __name__ == '__main__':
    extract_reservationslots_headers()
