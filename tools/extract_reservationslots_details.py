#!/usr/bin/env python3
"""
Extract complete request details from reservationslots API calls.
"""

import re
import json
from pathlib import Path

def extract_reservationslots_details(log_file: Path) -> list:
    """Extract complete request details from reservationslots calls."""
    print(f"Extracting reservationslots details from {log_file}...")
    
    results = []
    
    try:
        with open(log_file, 'rb') as f:
            content = f.read()
        
        # Try to decode
        try:
            decoded_content = content.decode('utf-8', errors='ignore')
        except UnicodeDecodeError:
            decoded_content = content.decode('latin-1', errors='ignore')
        
        # Look for the specific pattern that contains the request details
        # The pattern shows: 7:headers;... followed by request details
        pattern = r'7:headers;[^}]+}7:request;[^}]+}7:content;(\d+):(\{[^}]+\})'
        matches = re.finditer(pattern, decoded_content)
        
        for match in matches:
            content_length = match.group(1)
            json_content = match.group(2)
            
            # Look for the headers section before this
            start_pos = max(0, match.start() - 2000)
            context_before = decoded_content[start_pos:match.start()]
            
            # Extract headers from the context
            headers = {}
            header_section = re.search(r'7:headers;([^}]+)', context_before)
            if header_section:
                header_content = header_section.group(1)
                # Parse the header format: key;value,key;value
                header_pairs = re.findall(r'(\d+):([^,]+)', header_content)
                for key_len, value in header_pairs:
                    try:
                        key_len = int(key_len)
                        if len(value) >= key_len:
                            key = value[:key_len]
                            # Look for the value after the key
                            value_start = match.start() - 2000 + context_before.find(value) + key_len
                            if value_start < len(decoded_content):
                                value_end = min(len(decoded_content), value_start + 200)
                                value_section = decoded_content[value_start:value_end]
                                # Try to extract the actual header value
                                value_match = re.search(r'([^,\]]+)$', value_section)
                                if value_match:
                                    header_value = value_match.group(1).strip()
                                    if header_value and not header_value.isdigit():
                                        headers[key] = header_value
                    except (ValueError, IndexError):
                        continue
            
            # Try to parse the JSON content
            try:
                parsed_json = json.loads(json_content)
            except json.JSONDecodeError:
                parsed_json = {"raw": json_content}
            
            result = {
                'content_length': content_length,
                'request_body': parsed_json,
                'headers': headers,
                'raw_json': json_content
            }
            
            results.append(result)
            
            print(f"  Found request with {content_length} bytes")
            print(f"    Headers: {dict(headers)}")
            print(f"    Body: {parsed_json}")
            print()
    
    except Exception as e:
        print(f"Error processing {log_file}: {e}")
    
    return results

def main():
    """Main extraction function."""
    print("Extracting reservationslots API call details...")
    
    # Find the most recent log file
    log_files = list(Path('.').rglob('*.log'))
    if not log_files:
        print("No log files found!")
        return
    
    # Use the most recent log file
    latest_log = sorted(log_files, key=lambda x: x.stat().st_mtime, reverse=True)[0]
    print(f"Using latest log: {latest_log}")
    
    results = extract_reservationslots_details(latest_log)
    
    if results:
        print(f"\nExtracted {len(results)} reservationslots calls")
        
        # Save the results
        output_file = 'reservationslots_details.json'
        with open(output_file, 'w') as f:
            json.dump(results, f, indent=2)
        
        print(f"Details saved to {output_file}")
        
        # Show a summary of the request structure
        print("\n=== REQUEST STRUCTURE SUMMARY ===")
        for i, result in enumerate(results[:3]):  # Show first 3
            print(f"\nRequest {i+1}:")
            print(f"  Content-Length: {result['content_length']}")
            print(f"  Headers: {dict(result['headers'])}")
            print(f"  Body: {result['request_body']}")
    else:
        print("No reservationslots calls found!")

if __name__ == '__main__':
    main()
