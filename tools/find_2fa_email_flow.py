#!/usr/bin/env python3
"""
Find the specific 2FA email verification flow from the current log file.
This tool focuses on finding the email-based 2FA authentication sequence.
"""

import json
import re
from pathlib import Path
from typing import Dict, List, Any, Optional


def find_2fa_email_flow():
    """Find the specific 2FA email verification flow."""
    
    # Find the current log file
    log_dir = Path("logs")
    log_files = list(log_dir.glob("*.log"))
    log_files.sort(key=lambda x: x.stat().st_mtime, reverse=True)
    
    if not log_files:
        print("❌ No log files found")
        return
    
    current_log = log_files[0]
    print(f"🔍 Finding 2FA email verification flow in: {current_log}")
    
    try:
        # Read the binary log file
        with open(current_log, 'rb') as f:
            content = f.read()
        
        # Decode content
        decoded_content = content.decode('utf-8', errors='ignore')
        
        # Find the 2FA email flow
        twofa_flow = find_email_2fa_sequence(decoded_content)
        
        # Display the flow
        display_2fa_flow(twofa_flow)
        
        # Save the flow
        save_2fa_flow(twofa_flow, current_log)
        
    except Exception as e:
        print(f"❌ Error: {e}")
        import traceback
        traceback.print_exc()


def find_email_2fa_sequence(content: str) -> Dict[str, Any]:
    """Find the email-based 2FA sequence."""
    
    twofa_flow = {
        'email_challenge': [],
        'verification_code': [],
        'factor_challenge': [],
        'factor_verification': [],
        'email_verification': [],
        'challenge_answer': [],
        'success_response': [],
        'cookies_during_2fa': [],
        'headers_during_2fa': []
    }
    
    print("🔍 Looking for email-based 2FA patterns...")
    
    # 1. Email challenge patterns
    email_patterns = [
        r'email.*challenge',
        r'challenge.*email',
        r'email.*verification',
        r'verification.*email',
        r'factor.*email',
        r'email.*factor'
    ]
    
    for pattern in email_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 600)
            if 'email' in context.lower():
                twofa_flow['email_challenge'].append({
                    'pattern': pattern,
                    'position': match.start(),
                    'context': context
                })
    
    # 2. Verification code patterns
    code_patterns = [
        r'verification.*code',
        r'code.*verification',
        r'email.*code',
        r'code.*email',
        r'challenge.*code',
        r'code.*challenge'
    ]
    
    for pattern in code_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 600)
            if any(word in context.lower() for word in ['verification', 'code', 'challenge']):
                twofa_flow['verification_code'].append({
                    'pattern': pattern,
                    'position': match.start(),
                    'context': context
                })
    
    # 3. Factor challenge patterns
    factor_patterns = [
        r'factor.*challenge',
        r'challenge.*factor',
        r'factor.*verification',
        r'verification.*factor'
    ]
    
    for pattern in factor_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 600)
            if 'factor' in context.lower():
                twofa_flow['factor_challenge'].append({
                    'pattern': pattern,
                    'position': match.start(),
                    'context': context
                })
    
    # 4. Factor verification patterns
    factor_verification_patterns = [
        r'POST.*challenge.*answer.*factor',
        r'factor.*answer.*challenge',
        r'challenge.*answer.*factor'
    ]
    
    for pattern in factor_verification_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 600)
            if 'challenge' in context.lower() and 'answer' in context.lower():
                twofa_flow['factor_verification'].append({
                    'pattern': pattern,
                    'position': match.start(),
                    'context': context
                })
    
    # 5. Email verification patterns
    email_verification_patterns = [
        r'email.*verification.*challenge',
        r'challenge.*email.*verification',
        r'verification.*challenge.*email'
    ]
    
    for pattern in email_verification_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 600)
            if 'email' in context.lower() and 'verification' in context.lower():
                twofa_flow['email_verification'].append({
                    'pattern': pattern,
                    'position': match.start(),
                    'context': context
                })
    
    # 6. Challenge answer patterns
    challenge_answer_patterns = [
        r'POST.*challenge.*answer',
        r'challenge.*answer.*POST',
        r'answer.*challenge.*POST'
    ]
    
    for pattern in challenge_answer_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 600)
            if 'challenge' in context.lower() and 'answer' in context.lower():
                twofa_flow['challenge_answer'].append({
                    'pattern': pattern,
                    'position': match.start(),
                    'context': context
                })
    
    # 7. Success response patterns
    success_patterns = [
        r'success.*true',
        r'status.*200.*OK',
        r'factor.*verified',
        r'verification.*successful',
        r'challenge.*completed'
    ]
    
    for pattern in success_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 600)
            if any(word in context.lower() for word in ['success', '200', 'verified', 'completed']):
                twofa_flow['success_response'].append({
                    'pattern': pattern,
                    'position': match.start(),
                    'context': context
                })
    
    # 8. Cookies set during 2FA
    print("🔍 Looking for cookies set during 2FA...")
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
            context = extract_context(content, match.start(), 400)
            if 'set-cookie' in context.lower():
                twofa_flow['cookies_during_2fa'].append({
                    'pattern': pattern,
                    'position': match.start(),
                    'context': context
                })
    
    # 9. Headers used during 2FA
    print("🔍 Looking for headers used during 2FA...")
    header_patterns = [
        r'user-agent.*firefox',
        r'content-type.*application/json',
        r'accept.*application/json',
        r'origin.*id\.meijer\.com',
        r'referer.*id\.meijer\.com',
        r'authorization.*bearer'
    ]
    
    for pattern in header_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            context = extract_context(content, match.start(), 400)
            if any(word in context.lower() for word in ['user-agent', 'content-type', 'accept', 'origin', 'referer', 'authorization']):
                twofa_flow['headers_during_2fa'].append({
                    'pattern': pattern,
                    'position': match.start(),
                    'context': context
                })
    
    return twofa_flow


def extract_context(content: str, position: int, context_size: int) -> str:
    """Extract context around a position in the content."""
    start = max(0, position - context_size)
    end = min(len(content), position + context_size)
    context = content[start:end]
    
    # Clean up the context
    context = re.sub(r'\s+', ' ', context).strip()
    return context


def display_2fa_flow(twofa_flow: Dict[str, Any]) -> None:
    """Display the found 2FA flow."""
    
    print("\n" + "="*80)
    print("📱 2FA EMAIL VERIFICATION FLOW ANALYSIS")
    print("="*80)
    
    total_events = sum(len(events) for events in twofa_flow.values())
    print(f"\n📊 Total 2FA-related events found: {total_events}")
    
    for flow_stage, events in twofa_flow.items():
        if events:
            print(f"\n🔑 {flow_stage.replace('_', ' ').title()}: {len(events)} events")
            
            # Show first 3 events for each stage
            for i, event in enumerate(events[:3]):
                print(f"   {i+1}. {event['pattern']}")
                print(f"      Context: {event['context'][:200]}...")
                print(f"      Position: {event['position']}")
            
            if len(events) > 3:
                print(f"   ... and {len(events) - 3} more events")
    
    # Look for the complete 2FA sequence
    print("\n" + "="*80)
    print("🔄 2FA SEQUENCE TIMELINE")
    print("="*80)
    
    # Try to reconstruct the flow based on positions
    all_events = []
    for stage, events in twofa_flow.items():
        for event in events:
            all_events.append({
                'stage': stage,
                'position': event['position'],
                'pattern': event['pattern'],
                'context': event['context']
            })
    
    # Sort by position to get chronological order
    all_events.sort(key=lambda x: x['position'])
    
    if all_events:
        print(f"\n📅 Chronological sequence of {len(all_events)} 2FA events:")
        for i, event in enumerate(all_events[:30]):  # Show first 30
            print(f"   {i+1:2d}. [{event['stage']:25s}] {event['pattern']}")
            print(f"       Context: {event['context'][:150]}...")
            print(f"       Position: {event['position']}")
            print()
        
        if len(all_events) > 30:
            print(f"   ... and {len(all_events) - 30} more events")
    else:
        print("\n❌ No 2FA events found!")
    
    # Look for specific email verification patterns
    print("\n" + "="*80)
    print("📧 EMAIL VERIFICATION SPECIFIC ANALYSIS")
    print("="*80)
    
    email_events = []
    for stage, events in twofa_flow.items():
        for event in events:
            if 'email' in event['context'].lower():
                email_events.append(event)
    
    if email_events:
        print(f"✅ Found {len(email_events)} email-related 2FA events:")
        for i, event in enumerate(email_events[:5]):  # Show first 5
            print(f"   {i+1}. {event['pattern']}")
            print(f"      Context: {event['context'][:300]}...")
            print(f"      Position: {event['position']}")
            print()
    else:
        print("❌ No email-related 2FA events found!")
    
    # Check for successful 2FA completion
    if twofa_flow['success_response']:
        print("✅ 2FA completion indicators found:")
        for event in twofa_flow['success_response'][:3]:
            print(f"   • {event['pattern']}: {event['context'][:200]}...")


def save_2fa_flow(twofa_flow: Dict[str, Any], log_file: Path) -> None:
    """Save the 2FA flow to a JSON file."""
    
    output_file = f"2fa_email_flow_{log_file.stem}.json"
    
    # Convert any non-serializable objects
    serializable_flow = {}
    for stage, events in twofa_flow.items():
        serializable_flow[stage] = []
        for event in events:
            serializable_flow[stage].append({
                'pattern': event['pattern'],
                'context': event['context'][:500],  # Limit context size
                'position': event['position']
            })
    
    with open(output_file, 'w') as f:
        json.dump(serializable_flow, f, indent=2)
    
    print(f"\n💾 2FA flow saved to: {output_file}")


if __name__ == "__main__":
    find_2fa_email_flow()
