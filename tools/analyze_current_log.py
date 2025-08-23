#!/usr/bin/env python3
"""
Analyze the current binary mitmproxy log file for login events and 2FA flows.
This tool is designed to handle the specific binary format of the current logs.
"""

import json
import re
from pathlib import Path
from typing import Dict, List, Any, Optional
from collections import defaultdict


def analyze_current_log():
    """Analyze the current log file for login events and 2FA flows."""
    
    # Find the current log file
    log_dir = Path("logs")
    log_files = list(log_dir.glob("*.log"))
    log_files.sort(key=lambda x: x.stat().st_mtime, reverse=True)
    
    if not log_files:
        print("❌ No log files found")
        return
    
    current_log = log_files[0]
    print(f"🔍 Analyzing current log file: {current_log}")
    print(f"📊 File size: {current_log.stat().st_size / (1024*1024):.1f} MB")
    
    try:
        # Read the binary log file
        with open(current_log, 'rb') as f:
            content = f.read()
        
        print(f"📖 Read {len(content)} bytes")
        
        # Try to decode as text with error handling
        try:
            decoded_content = content.decode('utf-8', errors='ignore')
            print(f"✅ Successfully decoded as UTF-8")
        except UnicodeDecodeError:
            try:
                decoded_content = content.decode('latin-1', errors='ignore')
                print(f"✅ Successfully decoded as Latin-1")
            except:
                print(f"❌ Failed to decode content")
                return
        
        # Search for login-related patterns
        results = search_login_patterns(decoded_content)
        
        # Display results
        display_results(results)
        
        # Save detailed analysis
        save_analysis(results, current_log)
        
    except Exception as e:
        print(f"❌ Error analyzing log file: {e}")
        import traceback
        traceback.print_exc()


def search_login_patterns(content: str) -> Dict[str, Any]:
    """Search for login-related patterns in the decoded content."""
    
    results = {
        'login_events': [],
        '2fa_events': [],
        'okta_endpoints': [],
        'meijer_domains': [],
        'cookies_found': [],
        'headers_found': [],
        'total_patterns': 0
    }
    
    # Login-related patterns
    login_patterns = [
        r'login',
        r'signin',
        r'authenticate',
        r'auth',
        r'password',
        r'username',
        r'email',
        r'2fa',
        r'verification',
        r'challenge'
    ]
    
    # Okta-specific patterns
    okta_patterns = [
        r'okta',
        r'id\.meijer\.com',
        r'oauth2',
        r'authorize',
        r'token',
        r'stateToken',
        r'stateHandle'
    ]
    
    # Meijer domain patterns
    meijer_patterns = [
        r'meijer\.com',
        r'www\.meijer\.com',
        r'id\.meijer\.com'
    ]
    
    # Cookie patterns
    cookie_patterns = [
        r'set-cookie',
        r'cookie:',
        r'JSESSIONID',
        r'_abck',
        r'bm_s',
        r'bm_so',
        r'bm_sz',
        r'bm_sv',
        r'ak_bmsc'
    ]
    
    # Header patterns
    header_patterns = [
        r'user-agent:',
        r'authorization:',
        r'content-type:',
        r'accept:',
        r'referer:',
        r'origin:'
    ]
    
    # Search for all patterns
    all_patterns = login_patterns + okta_patterns + meijer_patterns + cookie_patterns + header_patterns
    
    for pattern in all_patterns:
        matches = re.finditer(pattern, content, re.IGNORECASE)
        for match in matches:
            # Extract context around the match
            start = max(0, match.start() - 200)
            end = min(len(content), match.end() + 200)
            context = content[start:end]
            
            # Clean up context
            context = re.sub(r'\s+', ' ', context).strip()
            
            # Categorize the match
            if pattern in login_patterns:
                results['login_events'].append({
                    'pattern': pattern,
                    'position': match.start(),
                    'context': context
                })
            elif pattern in okta_patterns:
                results['okta_endpoints'].append({
                    'pattern': pattern,
                    'position': match.start(),
                    'context': context
                })
            elif pattern in meijer_patterns:
                results['meijer_domains'].append({
                    'pattern': pattern,
                    'position': match.start(),
                    'context': context
                })
            elif pattern in cookie_patterns:
                results['cookies_found'].append({
                    'pattern': pattern,
                    'position': match.start(),
                    'context': context
                })
            elif pattern in header_patterns:
                results['headers_found'].append({
                    'pattern': pattern,
                    'position': match.start(),
                    'context': context
                })
            
            results['total_patterns'] += 1
    
    return results


def display_results(results: Dict[str, Any]) -> None:
    """Display the analysis results."""
    
    print("\n" + "="*80)
    print("🔍 LOGIN AND 2FA ANALYSIS RESULTS")
    print("="*80)
    
    print(f"\n📊 Total patterns found: {results['total_patterns']}")
    
    print(f"\n🔑 Login Events: {len(results['login_events'])}")
    for event in results['login_events'][:5]:  # Show first 5
        print(f"   • {event['pattern']}: {event['context'][:100]}...")
    
    print(f"\n🔐 Okta Endpoints: {len(results['okta_endpoints'])}")
    for endpoint in results['okta_endpoints'][:5]:  # Show first 5
        print(f"   • {endpoint['pattern']}: {endpoint['context'][:100]}...")
    
    print(f"\n🏪 Meijer Domains: {len(results['meijer_domains'])}")
    for domain in results['meijer_domains'][:5]:  # Show first 5
        print(f"   • {domain['pattern']}: {domain['context'][:100]}...")
    
    print(f"\n🍪 Cookies Found: {len(results['cookies_found'])}")
    for cookie in results['cookies_found'][:5]:  # Show first 5
        print(f"   • {cookie['pattern']}: {cookie['context'][:100]}...")
    
    print(f"\n📋 Headers Found: {len(results['headers_found'])}")
    for header in results['headers_found'][:5]:  # Show first 5
        print(f"   • {header['pattern']}: {header['context'][:100]}...")
    
    # Look for 2FA specific patterns
    twofa_patterns = ['2fa', 'verification', 'challenge', 'email', 'sms']
    twofa_events = []
    
    for event in results['login_events']:
        if any(pattern in event['context'].lower() for pattern in twofa_patterns):
            twofa_events.append(event)
    
    print(f"\n📱 2FA Events: {len(twofa_events)}")
    for event in twofa_events[:5]:  # Show first 5
        print(f"   • {event['pattern']}: {event['context'][:100]}...")


def save_analysis(results: Dict[str, Any], log_file: Path) -> None:
    """Save the detailed analysis to a JSON file."""
    
    output_file = f"current_log_analysis_{log_file.stem}.json"
    
    # Convert any non-serializable objects
    serializable_results = {}
    for key, value in results.items():
        if isinstance(value, list):
            serializable_results[key] = value
        else:
            serializable_results[key] = str(value)
    
    with open(output_file, 'w') as f:
        json.dump(serializable_results, f, indent=2)
    
    print(f"\n💾 Detailed analysis saved to: {output_file}")


if __name__ == "__main__":
    analyze_current_log()
