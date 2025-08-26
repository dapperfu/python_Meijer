#!/usr/bin/env python3
"""
Search for specific endpoints mentioned in the user query to find refresh tokens.
"""

import re
from pathlib import Path


def search_specific_endpoints(log_path: Path) -> None:
    """Search for specific endpoints mentioned in the user query."""
    
    print(f"🔍 Searching for specific endpoints in: {log_path}")
    print("=" * 80)
    
    # The specific endpoints mentioned in the query
    target_endpoints = [
        '/auth/services/devicefingerprint',
        '/login/token/redirect',
        '/_bm/get_params'
    ]
    
    # Search patterns for tokens
    token_patterns = [
        r'refresh_token["\']?\s*[:=]\s*["\']([^"\']+)["\']',
        r'access_token["\']?\s*[:=]\s*["\']([^"\']+)["\']',
        r'id_token["\']?\s*[:=]\s*["\']([^"\']+)["\']',
        r'token["\']?\s*[:=]\s*["\']([^"\']+)["\']',
        r'stateToken=([^&\s]+)',
        r'code=([^&\s]+)',
        r'serversidesignal["\']?\s*[:=]\s*["\']([^"\']+)["\']'
    ]
    
    found_endpoints = {endpoint: [] for endpoint in target_endpoints}
    all_tokens = {}
    
    try:
        with open(log_path, 'rb') as f:
            for line_num, line in enumerate(f, 1):
                try:
                    line_str = line.decode('utf-8', errors='ignore')
                    
                    # Check for target endpoints
                    for endpoint in target_endpoints:
                        if endpoint in line_str:
                            # Extract the full URL
                            url_match = re.search(r'https?://[^\s\n]+', line_str)
                            if url_match:
                                url = url_match.group(0)
                                found_endpoints[endpoint].append({
                                    'line': line_num,
                                    'url': url,
                                    'context': line_str.strip()[:300]
                                })
                                
                                print(f"🎯 Found {endpoint} at line {line_num}")
                                print(f"   URL: {url}")
                                
                                # Check for tokens in this line
                                tokens_in_line = extract_tokens_from_line(line_str, token_patterns)
                                if tokens_in_line:
                                    print(f"   Tokens found: {tokens_in_line}")
                                    all_tokens.update(tokens_in_line)
                                
                                print()
                    
                    # Also search for any id.meijer.com URLs that might contain tokens
                    if 'id.meijer.com' in line_str and any(token_type in line_str.lower() for token_type in ['refresh', 'token', 'code']):
                        # Extract tokens from this line
                        tokens_in_line = extract_tokens_from_line(line_str, token_patterns)
                        if tokens_in_line:
                            print(f"🔑 Line {line_num}: Found tokens in id.meijer.com request")
                            print(f"   Context: {line_str.strip()[:200]}...")
                            print(f"   Tokens: {tokens_in_line}")
                            print()
                            all_tokens.update(tokens_in_line)
                            
                except Exception:
                    continue
                    
                # Limit search to first 10000 lines to avoid excessive processing
                if line_num > 10000:
                    print("Reached line limit for search")
                    break
                    
    except Exception as e:
        print(f"Error during search: {e}")
    
    # Summary of findings
    print("\n📊 SEARCH SUMMARY:")
    print("=" * 80)
    
    for endpoint, findings in found_endpoints.items():
        print(f"\n{endpoint}:")
        if findings:
            for finding in findings:
                print(f"  Line {finding['line']}: {finding['url']}")
        else:
            print("  ❌ Not found")
    
    if all_tokens:
        print(f"\n🎯 ALL TOKENS FOUND ({len(all_tokens)}):")
        for token_name, token_value in all_tokens.items():
            print(f"  {token_name}: {token_value[:100]}...")
    else:
        print("\n❌ No tokens found")


def extract_tokens_from_line(line_str: str, patterns: list) -> dict:
    """Extract tokens from a line using the given patterns."""
    
    tokens = {}
    
    for pattern in patterns:
        matches = re.findall(pattern, line_str, re.IGNORECASE)
        if matches:
            # Take the first match that looks like a real token
            for match in matches:
                if len(match) > 10:  # Likely a real token
                    # Extract the token type from the pattern
                    if 'refresh_token' in pattern:
                        tokens['refresh_token'] = match
                    elif 'access_token' in pattern:
                        tokens['access_token'] = match
                    elif 'id_token' in pattern:
                        tokens['id_token'] = match
                    elif 'stateToken' in pattern:
                        tokens['stateToken'] = match
                    elif 'code' in pattern:
                        tokens['code'] = match
                    elif 'serversidesignal' in pattern:
                        tokens['serversidesignal'] = match
                    elif 'token' in pattern:
                        tokens['token'] = match
                    break
    
    return tokens


def search_for_refresh_token_specifically(log_path: Path) -> None:
    """Specifically search for refresh tokens."""
    
    print(f"\n🔍 SPECIFICALLY SEARCHING FOR REFRESH TOKENS...")
    print("=" * 80)
    
    refresh_token_patterns = [
        r'refresh_token["\']?\s*[:=]\s*["\']([^"\']+)["\']',
        r'refresh["\']?\s*[:=]\s*["\']([^"\']+)["\']',
        r'"refresh":\s*"([^"]+)"',
        r"'refresh':\s*'([^']+)'",
        r'refresh[_-]?token["\']?\s*[:=]\s*["\']([^"\']+)["\']'
    ]
    
    found_refresh_tokens = []
    
    try:
        with open(log_path, 'rb') as f:
            for line_num, line in enumerate(f, 1):
                try:
                    line_str = line.decode('utf-8', errors='ignore')
                    
                    # Look for refresh token patterns
                    for pattern in refresh_token_patterns:
                        matches = re.findall(pattern, line_str, re.IGNORECASE)
                        for match in matches:
                            if len(match) > 20:  # Likely a real refresh token
                                found_refresh_tokens.append({
                                    'line': line_num,
                                    'token': match,
                                    'pattern': pattern,
                                    'context': line_str.strip()[:300]
                                })
                                
                                print(f"🎯 REFRESH TOKEN FOUND at line {line_num}!")
                                print(f"   Pattern: {pattern}")
                                print(f"   Token: {match[:100]}...")
                                print(f"   Context: {line_str.strip()[:200]}...")
                                print()
                                
                except Exception:
                    continue
                    
                # Limit search to first 15000 lines
                if line_num > 15000:
                    print("Reached line limit for refresh token search")
                    break
                    
    except Exception as e:
        print(f"Error during refresh token search: {e}")
    
    if not found_refresh_tokens:
        print("❌ No refresh tokens found in the specific search")
    else:
        print(f"✅ Found {len(found_refresh_tokens)} refresh token(s)")


def main():
    """Main search function."""
    
    log_file = Path("logs/meijer_mitm_20250826_114803.log")
    
    if not log_file.exists():
        print(f"Log file not found: {log_file}")
        return
    
    # Search for specific endpoints
    search_specific_endpoints(log_file)
    
    # Specifically search for refresh tokens
    search_for_refresh_token_specifically(log_file)


if __name__ == "__main__":
    main()
