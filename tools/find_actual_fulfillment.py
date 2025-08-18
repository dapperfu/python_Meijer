#!/usr/bin/env python3
"""
Find the actual fulfillment endpoint calls in the logs.
"""

import re
from pathlib import Path

def find_actual_fulfillment():
    """Find the actual fulfillment endpoint calls."""
    print("Looking for actual fulfillment endpoint calls...")
    
    # Find the most recent log file
    log_files = list(Path('.').rglob('*.log'))
    if not log_files:
        print("No log files found!")
        return
    
    latest_log = sorted(log_files, key=lambda x: x.stat().st_mtime, reverse=True)[0]
    print(f"Using log: {latest_log}")
    
    try:
        with open(latest_log, 'rb') as f:
            content = f.read()
        
        try:
            decoded_content = content.decode('utf-8', errors='ignore')
        except UnicodeDecodeError:
            decoded_content = content.decode('latin-1', errors='ignore')
        
        # Look specifically for the actual fulfillment endpoint path
        # The pattern shows: 4:path;47:/digital/hybris/v3/fulfillment/reservationslots
        path_pattern = r'4:path;47:/digital/hybris/v3/fulfillment/reservationslots'
        path_matches = list(re.finditer(path_pattern, decoded_content))
        
        print(f"Found {len(path_matches)} actual fulfillment endpoint calls")
        
        if path_matches:
            for i, path_match in enumerate(path_matches):
                print(f"\n=== Fulfillment Endpoint Call {i+1} ===")
                print(f"Position: {path_match.start()}")
                
                # Get context around this path match
                start_pos = max(0, path_match.start() - 3000)
                end_pos = min(len(decoded_content), path_match.end() + 3000)
                context = decoded_content[start_pos:end_pos]
                
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
                    print(f"  Raw headers: {header_content[:300]}...")
                    
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
                    print(f"  No headers section found")
                
                # Look for content section
                content_section = re.search(r'7:content;(\d+):(\{[^}]+\})', context)
                if content_section:
                    content_length = content_section.group(1)
                    content_value = content_section.group(2)
                    print(f"  Content length: {content_length}")
                    print(f"  Content: {content_value}")
                else:
                    print(f"  No content section found")
                
                # Look for the response section and status code
                response_section = re.search(r'7:response;([^}]+)', context)
                if response_section:
                    response_content = response_section.group(1)
                    print(f"  Response section found")
                    
                    # Look for status code in the response
                    status_match = re.search(r'11:status_code;(\d+):(\d+)', context)
                    if status_match:
                        status_code = status_match.group(2)
                        print(f"    Status: {status_code}")
                    else:
                        print(f"    Status: Not found")
                else:
                    print(f"  No response section found")
                
                # Look for status code in the broader context
                status_match = re.search(r'11:status_code;(\d+):(\d+)', context)
                if status_match:
                    status_code = status_match.group(2)
                    print(f"  Overall Status: {status_code}")
                else:
                    print(f"  Overall Status: Not found")
                
                # Limit to first few to avoid overwhelming output
                if i >= 2:
                    break
        else:
            print("No actual fulfillment endpoint calls found")
            
            # Look for any mentions of the endpoint
            endpoint_pattern = r'/digital/hybris/v3/fulfillment/reservationslots'
            endpoint_matches = list(re.finditer(endpoint_pattern, decoded_content))
            print(f"Total endpoint mentions: {len(endpoint_matches)}")
            
            if endpoint_matches:
                print("Looking at endpoint mentions...")
                for i, match in enumerate(endpoint_matches[:3]):
                    start_pos = max(0, match.start() - 1000)
                    end_pos = min(len(decoded_content), match.end() + 1000)
                    context = decoded_content[start_pos:end_pos]
                    print(f"  Mention {i+1}: {context[:200]}...")
    
    except Exception as e:
        print(f"Error processing log: {e}")
        import traceback
        traceback.print_exc()

if __name__ == '__main__':
    find_actual_fulfillment()
