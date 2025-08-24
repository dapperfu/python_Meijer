#!/usr/bin/env python3
"""
Test accessing the IDX endpoint directly without OAuth2.
"""

import requests
import json
from pathlib import Path

def test_direct_idx_access():
    """Test accessing the IDX endpoint directly."""
    
    # Load configuration
    config_path = Path.home() / ".config" / "meijer" / "auth_config.json"
    with open(config_path, 'r') as f:
        config = json.load(f)
    
    # Create session
    session = requests.Session()
    
    # Set headers EXACTLY as in working flow
    session.headers.update({
        'User-Agent': 'Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36',
        'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
        'Accept-Language': 'en-US,en;q=0.9',
        'Accept-Encoding': 'gzip, deflate',
        'Sec-Fetch-Site': 'none',
        'Sec-Fetch-Mode': 'navigate',
        'Sec-Fetch-User': '?1',
        'Sec-Fetch-Dest': 'document',
        'Upgrade-Insecure-Requests': '1'
    })
    
    # First, visit Meijer homepage to establish session and cookies
    print("🏠 Step 1: Visiting Meijer homepage to establish session...")
    meijer_response = session.get(config['base_urls']['meijer'])
    print(f"   Meijer homepage status: {meijer_response.status_code}")
    print(f"   Cookies established: {len(session.cookies)}")
    
    print()
    
    # Try different IDX endpoints directly
    print("🔐 Step 2: Testing direct IDX access...")
    
    idx_endpoints = [
        "/idp/idx",
        "/idp/idx/identify",
        "/login",
        "/signin",
        "/auth",
        "/oauth2/default/v1/authorize"
    ]
    
    for endpoint in idx_endpoints:
        print(f"\n   🔍 Testing endpoint: {endpoint}")
        
        url = f"{config['base_urls']['okta']}{endpoint}"
        
        try:
            response = session.get(url)
            print(f"      Status: {response.status_code}")
            print(f"      Response size: {len(response.content)} bytes")
            
            if response.status_code == 200:
                print("      ✅ SUCCESS! Got 200 response")
                if 'login' in response.text.lower() or 'signin' in response.text.lower():
                    print("      🎯 This looks like a login page!")
                    
                    # Look for state tokens in the response
                    import re
                    content = response.text
                    
                    # Look for different types of state tokens
                    state_patterns = [
                        r'"stateToken":"([^"]+)"',
                        r'"stateHandle":"([^"]+)"',
                        r'stateToken["\']?\s*:\s*["\']([^"\']+)["\']',
                        r'stateHandle["\']?\s*:\s*["\']([^"\']+)["\']',
                        r'data-state["\']?\s*=\s*["\']([^"\']+)["\']',
                        r'data-statehandle["\']?\s*=\s*["\']([^"\']+)["\']'
                    ]
                    
                    found_tokens = []
                    for pattern in state_patterns:
                        matches = re.findall(pattern, content, re.IGNORECASE)
                        for match in matches:
                            if match and match not in found_tokens:
                                found_tokens.append(match)
                                print(f"      ✅ Found token: {match[:50]}...")
                    
                    if found_tokens:
                        print(f"      🎯 Found {len(found_tokens)} state tokens!")
                        break
                    else:
                        print("      ❌ No state tokens found")
                        
            elif response.status_code == 302:
                print("      🔄 Got redirect - this might be working!")
                print(f"      Location: {response.headers.get('Location', 'None')}")
                break
            elif response.status_code == 403:
                print("      ❌ Access Denied")
            elif response.status_code == 404:
                print("      ❌ Not Found")
            else:
                print(f"      ⚠️  Got status {response.status_code}")
                
        except Exception as e:
            print(f"      ❌ Error: {e}")
    
    print("\n🔍 Step 3: Checking if we need to go through a different path...")
    
    # Try to access the main Okta domain to see what's available
    try:
        response = session.get(config['base_urls']['okta'])
        print(f"   Main Okta domain status: {response.status_code}")
        
        if response.status_code == 200:
            print("   ✅ Main Okta domain accessible")
            
            # Look for any login or authentication links
            import re
            content = response.text
            
            # Look for links to login or auth pages
            auth_links = re.findall(r'href=["\']([^"\']*(?:login|signin|auth)[^"\']*)["\']', content, re.IGNORECASE)
            if auth_links:
                print(f"   🔗 Found {len(auth_links)} auth-related links:")
                for link in auth_links[:5]:  # Show first 5
                    print(f"      {link}")
            else:
                print("   ❌ No auth-related links found")
                
        else:
            print(f"   ❌ Main Okta domain failed: {response.status_code}")
            
    except Exception as e:
        print(f"   ❌ Error accessing main Okta domain: {e}")

if __name__ == "__main__":
    test_direct_idx_access()
