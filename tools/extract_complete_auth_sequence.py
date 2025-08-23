#!/usr/bin/env python3
"""
Extract the complete authentication sequence by looking for patterns before and after the 2FA challenge.
This tool finds the username/password submissions and completes the full authentication flow.
"""

import json
import re
from pathlib import Path
from typing import Dict, List, Any, Optional

def extract_complete_auth_sequence():
    """Extract the complete authentication sequence including username/password submissions."""
    
    # Find the current log file
    log_dir = Path("logs")
    log_files = list(log_dir.glob("*.log"))
    log_files.sort(key=lambda x: x.stat().st_mtime, reverse=True)
    
    if not log_files:
        print("❌ No log files found")
        return
    
    current_log = log_files[0]
    print(f"🔍 Extracting complete authentication sequence from: {current_log}")
    
    try:
        # Read the binary log file
        with open(current_log, 'rb') as f:
            content = f.read()
        
        print(f"📊 Log file size: {len(content):,} bytes")
        
        # Convert to string for pattern matching
        content_str = content.decode('utf-8', errors='ignore')
        
        # Find the 2FA challenge point
        print("\n🔍 Searching for 2FA challenge point...")
        
        challenge_pattern = r'challenge.*email'
        challenge_matches = list(re.finditer(challenge_pattern, content_str))
        
        if not challenge_matches:
            print("❌ No 2FA challenge found")
            return
        
        challenge_pos = challenge_matches[0].start()
        print(f"✅ Found 2FA challenge at position: {challenge_pos:,}")
        
        # Now search for the complete authentication sequence
        print(f"\n🔍 Searching for complete authentication sequence...")
        
        # Look for username submission patterns
        # The log format seems to use compressed headers, so we need to look for the actual content
        username_patterns = [
            r'username.*password',  # Look for forms that have both
            r'POST.*/idp/idx/identify',  # Okta identify endpoint
            r'identify.*username',  # Identify with username
            r'credentials.*username'  # Credentials with username
        ]
        
        password_patterns = [
            r'password.*challenge',  # Password followed by challenge
            r'POST.*/idp/idx/challenge',  # Okta challenge endpoint
            r'challenge.*email'  # Challenge with email method
        ]
        
        # Search in a larger range around the 2FA challenge
        search_start = max(0, challenge_pos - 50000)
        search_end = challenge_pos + 10000
        
        search_content = content_str[search_start:search_end]
        
        print(f"🔍 Searching range: positions {search_start:,} to {search_end:,}")
        
        # Find all potential authentication events
        auth_events = []
        
        # Look for Okta endpoints
        okta_endpoints = re.finditer(r'/idp/idx/[a-zA-Z]+', search_content)
        for match in okta_endpoints:
            endpoint = match.group()
            pos = search_start + match.start()
            context_start = max(0, pos - 1000)
            context_end = min(len(content_str), pos + 1000)
            context = content_str[context_start:context_end]
            
            auth_events.append({
                'type': f'okta_endpoint_{endpoint.split("/")[-1]}',
                'position': pos,
                'endpoint': endpoint,
                'context': context
            })
        
        # Look for POST requests
        post_requests = re.finditer(r'POST.*HTTP', search_content)
        for match in post_requests:
            pos = search_start + match.start()
            context_start = max(0, pos - 1000)
            context_end = min(len(content_str), pos + 1000)
            context = content_str[context_start:context_end]
            
            # Determine the type based on context
            if 'username' in context.lower():
                event_type = 'username_submission'
            elif 'password' in context.lower():
                event_type = 'password_submission'
            elif 'challenge' in context.lower():
                event_type = 'challenge_submission'
            else:
                event_type = 'post_request'
            
            auth_events.append({
                'type': event_type,
                'position': pos,
                'context': context
            })
        
        # Look for specific authentication patterns
        for pattern in username_patterns:
            matches = re.finditer(pattern, search_content, re.IGNORECASE)
            for match in matches:
                pos = search_start + match.start()
                context_start = max(0, pos - 1000)
                context_end = min(len(content_str), pos + 1000)
                context = content_str[context_start:context_end]
                
                auth_events.append({
                    'type': 'username_pattern_match',
                    'position': pos,
                    'pattern': pattern,
                    'context': context
                })
        
        # Sort events by position
        auth_events.sort(key=lambda x: x['position'])
        
        # Add the 2FA challenge
        auth_events.append({
            'type': '2fa_challenge',
            'position': challenge_pos,
            'context': content_str[max(0, challenge_pos - 1000):challenge_pos + 1000]
        })
        
        # Sort again
        auth_events.sort(key=lambda x: x['position'])
        
        print(f"\n✅ Found {len(auth_events)} authentication events")
        
        # Extract cookies and headers from all events
        all_cookies = set()
        all_headers = set()
        
        for event in auth_events:
            # Extract cookies from the compressed format
            # Look for patterns like: 6:cookie,8:AKA_A2=A
            cookie_matches = re.findall(r'cookie,(\d+):([^,]+)', event['context'])
            for cookie_length, cookie_value in cookie_matches:
                if len(cookie_value) == int(cookie_length):
                    all_cookies.add(cookie_value)
            
            # Extract headers from the compressed format
            # Look for patterns like: 88:10:user-agent,70:Mozilla/5.0
            header_matches = re.findall(r'(\d+):(\d+):([^,]+),(\d+):([^,]+)', event['context'])
            for match in header_matches:
                if len(match) == 5:
                    header_name_length, header_name, header_value_length, header_value = match[0], match[1], match[3], match[4]
                    if len(header_name) == int(header_name_length) and len(header_value) == int(header_value_length):
                        all_headers.add(f"{header_name}: {header_value}")
        
        # Save detailed analysis
        analysis_file = "complete_auth_sequence.json"
        with open(analysis_file, 'w') as f:
            json.dump({
                'log_file': str(current_log),
                '2fa_challenge_position': challenge_pos,
                'total_events': len(auth_events),
                'authentication_events': auth_events,
                'all_cookies': list(all_cookies),
                'all_headers': list(all_headers)
            }, f, indent=2)
        
        print(f"\n📁 Complete authentication analysis saved to: {analysis_file}")
        
        # Print summary
        print(f"\n📋 Authentication Events Summary:")
        for i, event in enumerate(auth_events):
            print(f"  {i+1}. {event['type']} (pos: {event['position']:,})")
            if 'endpoint' in event:
                print(f"      Endpoint: {event['endpoint']}")
            if 'pattern' in event:
                print(f"      Pattern: {event['pattern']}")
        
        print(f"\n🍪 Cookies Found: {len(all_cookies)}")
        for cookie in sorted(all_cookies):
            print(f"  - {cookie}")
        
        print(f"\n📋 Headers Found: {len(all_headers)}")
        for header in sorted(all_headers):
            print(f"  - {header}")
        
    except Exception as e:
        print(f"❌ Error analyzing log file: {e}")
        import traceback
        traceback.print_exc()

if __name__ == "__main__":
    extract_complete_auth_sequence()
