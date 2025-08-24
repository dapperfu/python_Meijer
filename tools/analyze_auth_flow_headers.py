#!/usr/bin/env python3
"""
Comprehensive Authentication Flow Header Analysis Tool

This tool analyzes the mitmproxy logs to extract the exact headers, cookies, and flow patterns
needed for successful authentication. It focuses on identifying the key differences between
successful and failed authentication attempts.
"""

import json
import os
import sys
from pathlib import Path
from typing import Dict, List, Any, Optional, Set
from collections import defaultdict, Counter
import re

def find_latest_log():
    """Find the latest mitmproxy log file."""
    log_dir = Path("logs")
    if not log_dir.exists():
        print("❌ No logs directory found")
        return None
    
    log_files = list(log_dir.glob("*.log"))
    if not log_files:
        print("❌ No log files found")
        return None
    
    # Sort by modification time, newest first
    log_files.sort(key=lambda x: x.stat().st_mtime, reverse=True)
    latest_log = log_files[0]
    
    print(f"📁 Found latest log: {latest_log}")
    print(f"   Size: {latest_log.stat().st_size / (1024*1024):.1f} MB")
    print(f"   Modified: {latest_log.stat().st_mtime}")
    
    return latest_log

def extract_auth_flows(log_file: Path) -> List[Dict[str, Any]]:
    """Extract authentication-related flows from the log file."""
    print(f"🔍 Extracting authentication flows from {log_file.name}...")
    
    auth_flows = []
    total_flows = 0
    
    try:
        with open(log_file, 'r', encoding='utf-8', errors='ignore') as f:
            for line_num, line in enumerate(f):
                line = line.strip()
                if line and line.startswith('{'):
                    try:
                        flow_data = json.loads(line)
                        total_flows += 1
                        
                        # Check if this is an authentication-related flow
                        if is_auth_flow(flow_data):
                            auth_flows.append(flow_data)
                        
                        # Progress indicator
                        if total_flows % 1000 == 0:
                            print(f"   Processed {total_flows} flows, found {len(auth_flows)} auth flows")
                            
                    except json.JSONDecodeError:
                        continue
        
        print(f"✅ Extracted {len(auth_flows)} authentication flows from {total_flows} total flows")
        return auth_flows
        
    except Exception as e:
        print(f"❌ Error reading log file: {e}")
        return []

def is_auth_flow(flow: Dict[str, Any]) -> bool:
    """Check if a flow is authentication-related."""
    url = flow.get('url', '').lower()
    host = flow.get('host', '').lower()
    path = flow.get('path', '').lower()
    
    # Authentication endpoints
    auth_endpoints = [
        'oauth2', 'idp/idx', 'login', 'auth', 'signin', 'authenticate',
        'token', 'authorize', 'challenge', 'identify', 'devicefingerprint'
    ]
    
    # Check URL for auth endpoints
    if any(endpoint in url for endpoint in auth_endpoints):
        return True
    
    # Check for auth hosts
    if any(auth_host in host for auth_host in ['id.meijer.com', 'auth.meijer.com']):
        return True
    
    # Check for auth headers
    if 'authorization' in flow.get('headers', {}):
        return True
    
    # Check for login-related content
    if flow.get('method') == 'POST' and any(key in url for key in ['login', 'auth', 'signin']):
        return True
    
    return False

def analyze_auth_flow_patterns(auth_flows: List[Dict[str, Any]]) -> Dict[str, Any]:
    """Analyze patterns in authentication flows."""
    print("\n🔍 Analyzing authentication flow patterns...")
    
    analysis = {
        'endpoints': Counter(),
        'methods': Counter(),
        'status_codes': Counter(),
        'hosts': Counter(),
        'user_agents': Counter(),
        'header_patterns': defaultdict(list),
        'cookie_patterns': defaultdict(list),
        'successful_flows': [],
        'failed_flows': [],
        'flow_sequences': []
    }
    
    for flow in auth_flows:
        # Basic flow info
        analysis['endpoints'][flow.get('path', 'unknown')] += 1
        analysis['methods'][flow.get('method', 'unknown')] += 1
        analysis['status_codes'][flow.get('status_code', 'unknown')] += 1
        analysis['hosts'][flow.get('host', 'unknown')] += 1
        
        # Headers analysis
        headers = flow.get('headers', {})
        for header_name, header_value in headers.items():
            analysis['header_patterns'][header_name.lower()].append(header_value)
        
        # User agent analysis
        user_agent = headers.get('User-Agent', 'unknown')
        analysis['user_agents'][user_agent] += 1
        
        # Cookie analysis
        cookies = flow.get('cookies', {})
        for cookie_name, cookie_value in cookies.items():
            analysis['cookie_patterns'][cookie_name].append(cookie_value)
        
        # Success/failure classification
        if flow.get('status_code') == 200:
            analysis['successful_flows'].append(flow)
        else:
            analysis['failed_flows'].append(flow)
    
    print(f"   📊 Found {len(analysis['successful_flows'])} successful flows")
    print(f"   📊 Found {len(analysis['failed_flows'])} failed flows")
    print(f"   📊 Found {len(analysis['endpoints'])} unique endpoints")
    print(f"   📊 Found {len(analysis['user_agents'])} unique user agents")
    
    return analysis

def find_successful_login_sequence(auth_flows: List[Dict[str, Any]]) -> Optional[List[Dict[str, Any]]]:
    """Find a complete successful login sequence."""
    print("\n🔍 Looking for successful login sequences...")
    
    # Look for flows that contain successful authentication indicators
    successful_indicators = [
        'oauth2/default/v1/authorize',
        'idp/idx/identify',
        'idp/idx/challenge/answer',
        'oauth2/default/v1/token'
    ]
    
    # Group flows by timestamp to find sequences
    flows_by_time = {}
    for flow in auth_flows:
        timestamp = flow.get('timestamp', 0)
        if timestamp not in flows_by_time:
            flows_by_time[timestamp] = []
        flows_by_time[timestamp].append(flow)
    
    # Sort by timestamp
    sorted_times = sorted(flows_by_time.keys())
    
    # Look for sequences that contain all indicators
    for i, timestamp in enumerate(sorted_times):
        sequence = []
        current_time = timestamp
        
        # Collect flows within a reasonable time window (e.g., 5 minutes)
        for t in sorted_times[i:]:
            if t - current_time <= 300:  # 5 minutes
                sequence.extend(flows_by_time[t])
                current_time = t
            else:
                break
        
        # Check if this sequence contains all indicators
        paths = [flow.get('path', '') for flow in sequence]
        if all(any(indicator in path for path in paths) for indicator in successful_indicators):
            print(f"   ✅ Found successful login sequence at {timestamp}")
            print(f"   📋 Sequence contains {len(sequence)} flows")
            return sequence
    
    print("   ❌ No complete successful login sequence found")
    return None

def analyze_successful_sequence(sequence: List[Dict[str, Any]]) -> Dict[str, Any]:
    """Analyze a successful login sequence in detail."""
    print("\n🔍 Analyzing successful login sequence...")
    
    analysis = {
        'steps': [],
        'headers_evolution': [],
        'cookies_evolution': [],
        'timing': [],
        'key_values': {}
    }
    
    # Sort sequence by timestamp
    sequence.sort(key=lambda x: x.get('timestamp', 0))
    
    for i, flow in enumerate(sequence):
        step_info = {
            'step': i + 1,
            'timestamp': flow.get('timestamp', 0),
            'method': flow.get('method', 'unknown'),
            'path': flow.get('path', 'unknown'),
            'status_code': flow.get('status_code', 'unknown'),
            'headers': flow.get('headers', {}),
            'cookies': flow.get('cookies', {}),
            'request_body': flow.get('request_body', ''),
            'response_body': flow.get('response_body', '')
        }
        
        analysis['steps'].append(step_info)
        
        # Track headers evolution
        analysis['headers_evolution'].append({
            'step': i + 1,
            'headers': flow.get('headers', {})
        })
        
        # Track cookies evolution
        analysis['cookies_evolution'].append({
            'step': i + 1,
            'cookies': flow.get('cookies', {})
        })
        
        # Track timing
        if i > 0:
            prev_timestamp = sequence[i-1].get('timestamp', 0)
            current_timestamp = flow.get('timestamp', 0)
            time_diff = current_timestamp - prev_timestamp
            analysis['timing'].append({
                'step': i + 1,
                'time_diff': time_diff
            })
        
        # Extract key values (state tokens, handles, etc.)
        if 'stateToken' in str(flow.get('response_body', '')):
            match = re.search(r'stateToken["\']?\s*:\s*["\']([^"\']+)["\']', str(flow.get('response_body', '')))
            if match:
                analysis['key_values']['stateToken'] = match.group(1)
        
        if 'stateHandle' in str(flow.get('response_body', '')):
            try:
                response_data = json.loads(flow.get('response_body', '{}'))
                if 'stateHandle' in response_data:
                    analysis['key_values']['stateHandle'] = response_data['stateHandle']
            except:
                pass
    
    print(f"   📋 Sequence has {len(analysis['steps'])} steps")
    print(f"   ⏱️  Total duration: {analysis['timing'][-1]['time_diff'] if analysis['timing'] else 'unknown'} seconds")
    
    # Show key values found
    if analysis['key_values']:
        print("   🔑 Key values found:")
        for key, value in analysis['key_values'].items():
            print(f"      {key}: {value[:50]}...")
    
    return analysis

def generate_header_template(analysis: Dict[str, Any]) -> str:
    """Generate a header template based on successful flows."""
    print("\n🔍 Generating header template...")
    
    template = """# Header Template for Meijer Authentication
# Generated from successful login sequence analysis

# Base headers for all requests
BASE_HEADERS = {
"""
    
    # Find the most common headers across successful flows
    header_counts = Counter()
    for step in analysis['steps']:
        for header_name, header_value in step['headers'].items():
            header_counts[header_name] += 1
    
    # Include headers that appear in most steps
    threshold = len(analysis['steps']) * 0.5  # 50% of steps
    for header_name, count in header_counts.most_common():
        if count >= threshold:
            # Find the most common value for this header
            values = [step['headers'].get(header_name, '') for step in analysis['steps'] if header_name in step['headers']]
            if values:
                most_common_value = Counter(values).most_common(1)[0][0]
                template += f"    '{header_name}': '{most_common_value}',\n"
    
    template += """}

# Step-specific headers
STEP_HEADERS = {
"""
    
    for step in analysis['steps']:
        template += f"    {step['step']}: {{\n"
        for header_name, header_value in step['headers'].items():
            template += f"        '{header_name}': '{header_value}',\n"
        template += "    },\n"
    
    template += """}

# Cookie patterns
COOKIE_PATTERNS = {
"""
    
    # Find cookies that appear in multiple steps
    cookie_counts = Counter()
    for step in analysis['steps']:
        for cookie_name in step['cookies'].keys():
            cookie_counts[cookie_name] += 1
    
    for cookie_name, count in cookie_counts.most_common():
        if count > 1:
            template += f"    '{cookie_name}': 'REQUIRED',  # Appears in {count} steps\n"
    
    template += """}
"""
    
    return template

def save_analysis_results(analysis: Dict[str, Any], output_file: str = "auth_flow_analysis.json"):
    """Save analysis results to a JSON file."""
    print(f"\n💾 Saving analysis results to {output_file}...")
    
    try:
        # Convert defaultdict to regular dict for JSON serialization
        serializable_analysis = {}
        for key, value in analysis.items():
            if isinstance(value, defaultdict):
                serializable_analysis[key] = dict(value)
            elif isinstance(value, Counter):
                serializable_analysis[key] = dict(value)
            else:
                serializable_analysis[key] = value
        
        with open(output_file, 'w') as f:
            json.dump(serializable_analysis, f, indent=2)
        
        print(f"   ✅ Analysis saved to {output_file}")
        
    except Exception as e:
        print(f"   ❌ Error saving analysis: {e}")

def main():
    """Main function to run the authentication flow analysis."""
    print("🚀 MEIJER AUTHENTICATION FLOW HEADER ANALYSIS")
    print("=" * 80)
    print("This tool analyzes mitmproxy logs to extract exact authentication patterns.")
    print()
    
    # Find the latest log file
    log_file = find_latest_log()
    if not log_file:
        return
    
    # Extract authentication flows
    auth_flows = extract_auth_flows(log_file)
    if not auth_flows:
        print("❌ No authentication flows found")
        return
    
    # Analyze flow patterns
    analysis = analyze_auth_flow_patterns(auth_flows)
    
    # Find successful login sequence
    successful_sequence = find_successful_login_sequence(auth_flows)
    if successful_sequence:
        # Analyze the successful sequence
        sequence_analysis = analyze_successful_sequence(successful_sequence)
        
        # Generate header template
        header_template = generate_header_template(sequence_analysis)
        
        # Save header template
        with open("auth_headers_template.py", "w") as f:
            f.write(header_template)
        print("   💾 Header template saved to auth_headers_template.py")
        
        # Save detailed analysis
        save_analysis_results(sequence_analysis, "successful_login_analysis.json")
        
        # Print summary
        print("\n📊 ANALYSIS SUMMARY")
        print("=" * 40)
        print(f"Total auth flows: {len(auth_flows)}")
        print(f"Successful flows: {len(analysis['successful_flows'])}")
        print(f"Failed flows: {len(analysis['failed_flows'])}")
        print(f"Successful sequence steps: {len(sequence_analysis['steps'])}")
        
        if sequence_analysis['key_values']:
            print(f"Key values extracted: {len(sequence_analysis['key_values'])}")
        
        print("\n🎯 Next steps:")
        print("1. Review auth_headers_template.py for header patterns")
        print("2. Review successful_login_analysis.json for detailed flow")
        print("3. Update authentication client with extracted patterns")
        print("4. Test with the new header configuration")
        
    else:
        print("\n⚠️  No successful login sequence found")
        print("This could mean:")
        print("- No successful logins in the current log")
        print("- The authentication flow has changed")
        print("- The log doesn't contain the complete flow")
        
        # Save general analysis anyway
        save_analysis_results(analysis, "general_auth_analysis.json")

if __name__ == "__main__":
    main()
