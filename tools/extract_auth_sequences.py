#!/usr/bin/env python3
"""
Extract Authentication Sequences from Binary Log

This tool extracts actual authentication sequences from mitmproxy binary logs
by analyzing the patterns we found and reconstructing the flows.
"""

import re
import json
import sys
from pathlib import Path
from typing import Dict, List, Any, Optional
from collections import defaultdict, Counter

def extract_auth_sequences(log_file_path: str) -> List[Dict[str, Any]]:
    """
    Extract authentication sequences from binary log.
    """
    print(f"🔍 Extracting authentication sequences from: {log_file_path}")
    
    sequences = []
    
    try:
        with open(log_file_path, 'rb') as f:
            content = f.read()
        
        print(f"   📁 File size: {len(content) / (1024*1024):.1f} MB")
        
        # Look for OAuth2 authorization sequences
        print("\n🔍 Looking for OAuth2 authorization sequences...")
        oauth2_pattern = rb'oauth2/default/v1/authorize'
        oauth2_matches = find_pattern_matches(content, oauth2_pattern)
        
        for match in oauth2_matches:
            sequence = extract_oauth2_sequence(content, match['position'])
            if sequence:
                sequences.append(sequence)
        
        # Look for IDP identify sequences
        print("\n🔍 Looking for IDP identify sequences...")
        idp_identify_pattern = rb'idp/idx/identify'
        idp_identify_matches = find_pattern_matches(content, idp_identify_pattern)
        
        for match in idp_identify_matches:
            sequence = extract_idp_sequence(content, match['position'])
            if sequence:
                sequences.append(sequence)
        
        # Look for device fingerprint sequences
        print("\n🔍 Looking for device fingerprint sequences...")
        device_fp_pattern = rb'auth/services/devicefingerprint'
        device_fp_matches = find_pattern_matches(content, device_fp_pattern)
        
        for match in device_fp_matches:
            sequence = extract_device_fingerprint_sequence(content, match['position'])
            if sequence:
                sequences.append(sequence)
        
        # Look for token exchange sequences
        print("\n🔍 Looking for token exchange sequences...")
        token_pattern = rb'oauth2/default/v1/token'
        token_matches = find_pattern_matches(content, token_pattern)
        
        for match in token_matches:
            sequence = extract_token_sequence(content, match['position'])
            if sequence:
                sequences.append(sequence)
        
        print(f"\n✅ Found {len(sequences)} authentication sequences")
        return sequences
        
    except Exception as e:
        print(f"❌ Error reading log file: {e}")
        return []

def find_pattern_matches(content: bytes, pattern: bytes) -> List[Dict[str, Any]]:
    """Find all matches of a pattern in the content."""
    matches = []
    start = 0
    
    while True:
        pos = content.find(pattern, start)
        if pos == -1:
            break
        
        matches.append({
            'position': pos,
            'pattern': pattern.decode('utf-8')
        })
        
        start = pos + 1
    
    return matches

def extract_oauth2_sequence(content: bytes, position: int) -> Optional[Dict[str, Any]]:
    """Extract OAuth2 authorization sequence."""
    # Extract context around the OAuth2 request
    context_start = max(0, position - 2000)
    context_end = min(len(content), position + 3000)
    context = content[context_start:context_end]
    
    try:
        context_text = context.decode('utf-8', errors='ignore')
        
        # Look for HTTP request line
        request_match = re.search(r'(GET|POST)\s+([^\s]+)\s+HTTP', context_text)
        if not request_match:
            return None
        
        method = request_match.group(1)
        url = request_match.group(2)
        
        # Extract headers
        headers = extract_headers_from_context(context_text)
        
        # Extract query parameters
        query_params = {}
        if '?' in url:
            query_part = url.split('?')[1]
            for param in query_part.split('&'):
                if '=' in param:
                    key, value = param.split('=', 1)
                    query_params[key] = value
        
        sequence = {
            'type': 'oauth2_authorize',
            'method': method,
            'url': url,
            'headers': headers,
            'query_params': query_params,
            'position': position,
            'context': context_text[:500] + '...' if len(context_text) > 500 else context_text
        }
        
        return sequence
        
    except Exception as e:
        return None

def extract_idp_sequence(content: bytes, position: int) -> Optional[Dict[str, Any]]:
    """Extract IDP identify/challenge sequence."""
    # Extract context around the IDP request
    context_start = max(0, position - 2000)
    context_end = min(len(content), position + 3000)
    context = content[context_start:context_end]
    
    try:
        context_text = context.decode('utf-8', errors='ignore')
        
        # Look for HTTP request line
        request_match = re.search(r'(GET|POST)\s+([^\s]+)\s+HTTP', context_text)
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
        
        sequence = {
            'type': 'idp_request',
            'method': method,
            'url': url,
            'headers': headers,
            'request_body': request_body,
            'position': position,
            'context': context_text[:500] + '...' if len(context_text) > 500 else context_text
        }
        
        return sequence
        
    except Exception as e:
        return None

def extract_device_fingerprint_sequence(content: bytes, position: int) -> Optional[Dict[str, Any]]:
    """Extract device fingerprint sequence."""
    # Extract context around the device fingerprint request
    context_start = max(0, position - 2000)
    context_end = min(len(content), position + 3000)
    context = content[context_start:context_end]
    
    try:
        context_text = context.decode('utf-8', errors='ignore')
        
        # Look for HTTP request line
        request_match = re.search(r'(GET|POST)\s+([^\s]+)\s+HTTP', context_text)
        if not request_match:
            return None
        
        method = request_match.group(1)
        url = request_match.group(2)
        
        # Extract headers
        headers = extract_headers_from_context(context_text)
        
        sequence = {
            'type': 'device_fingerprint',
            'method': method,
            'url': url,
            'headers': headers,
            'position': position,
            'context': context_text[:500] + '...' if len(context_text) > 500 else context_text
        }
        
        return sequence
        
    except Exception as e:
        return None

def extract_token_sequence(content: bytes, position: int) -> Optional[Dict[str, Any]]:
    """Extract token exchange sequence."""
    # Extract context around the token request
    context_start = max(0, position - 2000)
    context_end = min(len(content), position + 3000)
    context = content[context_start:context_end]
    
    try:
        context_text = context.decode('utf-8', errors='ignore')
        
        # Look for HTTP request line
        request_match = re.search(r'(GET|POST)\s+([^\s]+)\s+HTTP', context_text)
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
        
        sequence = {
            'type': 'token_exchange',
            'method': method,
            'url': url,
            'headers': headers,
            'request_body': request_body,
            'position': position,
            'context': context_text[:500] + '...' if len(context_text) > 500 else context_text
        }
        
        return sequence
        
    except Exception as e:
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

def analyze_sequences(sequences: List[Dict[str, Any]]) -> Dict[str, Any]:
    """Analyze the extracted sequences to find patterns."""
    print("\n🔍 Analyzing authentication sequences...")
    
    analysis = {
        'sequence_types': Counter(),
        'methods': Counter(),
        'urls': Counter(),
        'headers': defaultdict(list),
        'query_params': defaultdict(list),
        'user_agents': Counter(),
        'content_types': Counter(),
        'accept_headers': Counter()
    }
    
    for sequence in sequences:
        # Sequence type
        analysis['sequence_types'][sequence['type']] += 1
        
        # Method
        analysis['methods'][sequence['method']] += 1
        
        # URL
        analysis['urls'][sequence['url']] += 1
        
        # Headers
        headers = sequence.get('headers', {})
        for header_name, header_value in headers.items():
            analysis['headers'][header_name.lower()].append(header_value)
            
            # Track specific headers
            if header_name.lower() == 'user-agent':
                analysis['user_agents'][header_value] += 1
            elif header_name.lower() == 'content-type':
                analysis['content_types'][header_value] += 1
            elif header_name.lower() == 'accept':
                analysis['accept_headers'][header_value] += 1
        
        # Query parameters
        query_params = sequence.get('query_params', {})
        for param_name, param_value in query_params.items():
            analysis['query_params'][param_name].append(param_value)
    
    return analysis

def generate_auth_template(analysis: Dict[str, Any]) -> str:
    """Generate authentication template from analysis."""
    print("\n🔍 Generating authentication template...")
    
    template = """# Meijer Authentication Template
# Generated from binary log sequence analysis

# Sequence types found
SEQUENCE_TYPES = {
"""
    
    for seq_type, count in analysis['sequence_types'].most_common():
        template += f"    '{seq_type}': {count},  # Found {count} times\n"
    
    template += """}

# HTTP methods used
HTTP_METHODS = {
"""
    
    for method, count in analysis['methods'].most_common():
        template += f"    '{method}': {count},  # Used {count} times\n"
    
    template += """}

# Authentication URLs
AUTH_URLS = {
"""
    
    for url, count in analysis['urls'].most_common(10):
        template += f"    '{url}': {count},  # Used {count} times\n"
    
    template += """}

# Common headers
COMMON_HEADERS = {
"""
    
    # Add most common headers
    for header_name, values in analysis['headers'].items():
        if len(values) > 1:
            # Get most common value
            value_counts = Counter(values)
            most_common_value = value_counts.most_common(1)[0][0]
            template += f"    '{header_name}': '{most_common_value}',\n"
    
    template += """}

# User agents
USER_AGENTS = [
"""
    
    # Add user agents
    for user_agent, count in analysis['user_agents'].most_common(5):
        template += f"    '{user_agent}',  # Used {count} times\n"
    
    template += """]

# Content types
CONTENT_TYPES = [
"""
    
    # Add content types
    for content_type, count in analysis['content_types'].most_common(5):
        template += f"    '{content_type}',  # Used {count} times\n"
    
    template += """]

# Accept headers
ACCEPT_HEADERS = [
"""
    
    # Add accept headers
    for accept_header, count in analysis['accept_headers'].most_common(5):
        template += f"    '{accept_header}',  # Used {count} times\n"
    
    template += """]

# Query parameters
QUERY_PARAMS = {
"""
    
    # Add query parameters
    for param_name, values in analysis['query_params'].items():
        if len(values) > 1:
            # Get most common value
            value_counts = Counter(values)
            most_common_value = value_counts.most_common(1)[0][0]
            template += f"    '{param_name}': '{most_common_value}',\n"
    
    template += """}
"""
    
    return template

def save_analysis_results(analysis: Dict[str, Any], output_file: str = "auth_sequence_analysis.json"):
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
            json.dump(serializable_analysis, f, indent=2, default=str)
        
        print(f"   ✅ Analysis saved to {output_file}")
        
    except Exception as e:
        print(f"   ❌ Error saving analysis: {e}")

def main():
    """Main function to extract and analyze authentication sequences."""
    print("🚀 MEIJER AUTHENTICATION SEQUENCE EXTRACTION")
    print("=" * 80)
    print("This tool extracts actual authentication sequences from mitmproxy binary logs.")
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
    
    # Extract authentication sequences
    sequences = extract_auth_sequences(str(latest_log))
    
    if not sequences:
        print("❌ No authentication sequences found")
        return
    
    # Analyze the sequences
    analysis = analyze_sequences(sequences)
    
    # Generate authentication template
    template = generate_auth_template(analysis)
    
    # Save template
    with open("auth_sequence_template.py", "w") as f:
        f.write(template)
    print("   💾 Authentication sequence template saved to auth_sequence_template.py")
    
    # Save detailed analysis
    save_analysis_results(analysis, "auth_sequence_analysis.json")
    
    # Print summary
    print("\n📊 SEQUENCE ANALYSIS SUMMARY")
    print("=" * 40)
    print(f"Total sequences: {len(sequences)}")
    
    for seq_type, count in analysis['sequence_types'].most_common():
        print(f"  {seq_type}: {count} sequences")
    
    print(f"Unique URLs: {len(analysis['urls'])}")
    print(f"Unique user agents: {len(analysis['user_agents'])}")
    print(f"Unique content types: {len(analysis['content_types'])}")
    
    print("\n🎯 Next steps:")
    print("1. Review auth_sequence_template.py for authentication patterns")
    print("2. Review auth_sequence_analysis.json for detailed analysis")
    print("3. Update authentication client with extracted patterns")
    print("4. Test with the new configuration")

if __name__ == "__main__":
    main()
