#!/usr/bin/env python3
"""
Extract the specific login and 2FA flow sequence from the current log file.
This tool focuses on finding the complete authentication workflow.
"""

import json
import re
from pathlib import Path
from typing import Dict, List, Any, Optional
from collections import defaultdict


def extract_login_2fa_flow():
    """Extract the complete login and 2FA flow from the current log."""
    
    # Find the current log file
    log_dir = Path("logs")
    log_files = list(log_dir.glob("*.log"))
    log_files.sort(key=lambda x: x.stat().st_mtime, reverse=True)
    
    if not log_files:
        print("❌ No log files found")
        return
    
    current_log = log_files[0]
    print(f"🔍 Extracting login/2FA flow from: {current_log}")
    
    try:
        # Read the binary log file
        with open(current_log, 'rb') as f:
            content = f.read()
        
        # Decode content
        decoded_content = content.decode('utf-8', errors='ignore')
        
        # Extract the authentication flow
        auth_flow = extract_auth_sequence(decoded_content)
        
        # Display the flow
        display_auth_flow(auth_flow)
        
        # Save the flow
        save_auth_flow(auth_flow, current_log)
        
    except Exception as e:
        print(f"❌ Error: {e}")
        import traceback
        traceback.print_exc()


def extract_auth_sequence(content: str) -> Dict[str, Any]:
    """Extract the authentication sequence from the log content."""
    
    auth_flow = {
        'landing_page': [],
        'login_form': [],
        'password_submission': [],
        '2fa_challenge': [],
        '2fa_verification': [],
        'oauth_authorization': [],
        'successful_login': [],
        'cookies_set': [],
        'headers_used': []
    }
    
    # Look for specific authentication flow patterns
    
    # 1. Landing page and initial load
    landing_patterns = [
        r'GET.*meijer\.com.*HTTP',
        r'GET.*id\.meijer\.com.*HTTP',
        r'Host.*meijer\.com',
        r'Host.*id\.meijer\.com'
    ]
    
    for pattern in landing_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 300)
            auth_flow['landing_page'].append({
                'pattern': pattern,
                'context': context,
                'position': match.start()
            })
    
    # 2. Login form submission
    login_patterns = [
        r'POST.*id\.meijer\.com.*identify',
        r'POST.*id\.meijer\.com.*login',
        r'username.*password',
        r'login_hint',
        r'stateToken'
    ]
    
    for pattern in login_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 400)
            auth_flow['login_form'].append({
                'pattern': pattern,
                'context': context,
                'position': match.start()
            })
    
    # 3. Password submission
    password_patterns = [
        r'POST.*id\.meijer\.com.*challenge.*answer',
        r'password.*challenge',
        r'challenge.*answer',
        r'credentials'
    ]
    
    for pattern in password_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 400)
            auth_flow['password_submission'].append({
                'pattern': pattern,
                'context': context,
                'position': match.start()
            })
    
    # 4. 2FA challenge
    twofa_patterns = [
        r'2fa',
        r'verification',
        r'challenge.*email',
        r'challenge.*sms',
        r'email.*verification',
        r'factor.*challenge'
    ]
    
    for pattern in twofa_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 400)
            auth_flow['2fa_challenge'].append({
                'pattern': pattern,
                'context': context,
                'position': match.start()
            })
    
    # 5. 2FA verification
    verification_patterns = [
        r'POST.*challenge.*answer.*verification',
        r'verification.*code',
        r'email.*code',
        r'sms.*code',
        r'factor.*verification'
    ]
    
    for pattern in verification_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 400)
            auth_flow['2fa_verification'].append({
                'pattern': pattern,
                'context': context,
                'position': match.start()
            })
    
    # 6. OAuth authorization
    oauth_patterns = [
        r'oauth2.*authorize',
        r'authorization.*code',
        r'redirect.*uri',
        r'state.*parameter',
        r'code.*verifier'
    ]
    
    for pattern in oauth_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 400)
            auth_flow['oauth_authorization'].append({
                'pattern': pattern,
                'context': context,
                'position': match.start()
            })
    
    # 7. Successful login indicators
    success_patterns = [
        r'200.*OK',
        r'success.*true',
        r'access.*token',
        r'id.*token',
        r'redirect.*meijer\.com'
    ]
    
    for pattern in success_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 300)
            auth_flow['successful_login'].append({
                'pattern': pattern,
                'context': context,
                'position': match.start()
            })
    
    # 8. Cookies set during authentication
    cookie_patterns = [
        r'set-cookie.*JSESSIONID',
        r'set-cookie.*_abck',
        r'set-cookie.*bm_s',
        r'set-cookie.*bm_so',
        r'set-cookie.*bm_sz',
        r'set-cookie.*bm_sv',
        r'set-cookie.*ak_bmsc'
    ]
    
    for pattern in cookie_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 300)
            auth_flow['cookies_set'].append({
                'pattern': pattern,
                'context': context,
                'position': match.start()
            })
    
    # 9. Headers used in authentication
    header_patterns = [
        r'user-agent.*firefox',
        r'user-agent.*chrome',
        r'user-agent.*safari',
        r'authorization.*bearer',
        r'content-type.*application/json',
        r'accept.*application/json',
        r'origin.*id\.meijer\.com',
        r'referer.*id\.meijer\.com'
    ]
    
    for pattern in header_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 300)
            auth_flow['headers_used'].append({
                'pattern': pattern,
                'context': context,
                'position': match.start()
            })
    
    return auth_flow


def extract_context(content: str, position: int, context_size: int) -> str:
    """Extract context around a position in the content."""
    start = max(0, position - context_size)
    end = min(len(content), position + context_size)
    context = content[start:end]
    
    # Clean up the context
    context = re.sub(r'\s+', ' ', context).strip()
    return context


def display_auth_flow(auth_flow: Dict[str, Any]) -> None:
    """Display the extracted authentication flow."""
    
    print("\n" + "="*80)
    print("🔐 AUTHENTICATION FLOW EXTRACTION RESULTS")
    print("="*80)
    
    total_events = sum(len(events) for events in auth_flow.values())
    print(f"\n📊 Total authentication events found: {total_events}")
    
    for flow_stage, events in auth_flow.items():
        if events:
            print(f"\n🔑 {flow_stage.replace('_', ' ').title()}: {len(events)} events")
            
            # Show first 3 events for each stage
            for i, event in enumerate(events[:3]):
                print(f"   {i+1}. {event['pattern']}")
                print(f"      Context: {event['context'][:150]}...")
                print(f"      Position: {event['position']}")
            
            if len(events) > 3:
                print(f"   ... and {len(events) - 3} more events")
    
    # Look for the complete flow sequence
    print("\n" + "="*80)
    print("🔄 COMPLETE AUTHENTICATION SEQUENCE")
    print("="*80)
    
    # Try to reconstruct the flow based on positions
    all_events = []
    for stage, events in auth_flow.items():
        for event in events:
            all_events.append({
                'stage': stage,
                'position': event['position'],
                'pattern': event['pattern'],
                'context': event['context']
            })
    
    # Sort by position to get chronological order
    all_events.sort(key=lambda x: x['position'])
    
    print(f"\n📅 Chronological sequence of {len(all_events)} events:")
    for i, event in enumerate(all_events[:20]):  # Show first 20
        print(f"   {i+1:2d}. [{event['stage']:20s}] {event['pattern']}")
    
    if len(all_events) > 20:
        print(f"   ... and {len(all_events) - 20} more events")


def save_auth_flow(auth_flow: Dict[str, Any], log_file: Path) -> None:
    """Save the authentication flow to a JSON file."""
    
    output_file = f"login_2fa_flow_{log_file.stem}.json"
    
    # Convert any non-serializable objects
    serializable_flow = {}
    for stage, events in auth_flow.items():
        serializable_flow[stage] = []
        for event in events:
            serializable_flow[stage].append({
                'pattern': event['pattern'],
                'context': event['context'][:500],  # Limit context size
                'position': event['position']
            })
    
    with open(output_file, 'w') as f:
        json.dump(serializable_flow, f, indent=2)
    
    print(f"\n💾 Authentication flow saved to: {output_file}")


if __name__ == "__main__":
    extract_login_2fa_flow()
