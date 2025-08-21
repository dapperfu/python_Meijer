#!/usr/bin/env python3
"""
Practical Example: Akamai Bypass using Real Headers from Logs

This example demonstrates how to use the header spoofing tools
with the actual headers found in successful authentication flows.
"""

import sys
import os
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))

from meijer.header_spoofing import HeaderSpoofer, create_spoofed_session
from meijer.akamai_bypass_client import AkamaiBypassClient
import requests
import json


def demonstrate_real_headers():
    """Demonstrate using the real headers found in the logs."""
    
    print("🔍 AKAMAI BYPASS USING REAL HEADERS FROM LOGS")
    print("=" * 60)
    
    # The real headers we found from successful authentication:
    real_headers = {
        "User-Agent": "Meijer/102800000 okhttp/5.1.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)",
        "Accept": "application/json",
        "Content-Type": "application/x-www-form-urlencoded",
        "Accept-Encoding": "gzip",
        "X-ACF-Sensor-Data": "3,a,Ma3MHa89I03VOihlCLFGOv7CuasvECcxBJIeSIu5ho9Fh03mo9mdZNPENDaL/Via7TBVMIdIH8zzSYEg/pPJMBE3o2CkmRReIiL0J59RXxonEuF4zsKpc0tA4ctIB0SkBn2HtXnTXooUscYQDmMvbY1SCqyJfPpeLEX4jCugzgQ="
    }
    
    print("📱 REAL HEADERS FROM SUCCESSFUL AUTHENTICATION:")
    for header, value in real_headers.items():
        print(f"  {header}: {value[:80]}{'...' if len(value) > 80 else ''}")
    
    print(f"\n💡 KEY INSIGHTS:")
    print("  • User-Agent: Exact Meijer mobile app signature")
    print("  • X-ACF-Sensor-Data: Akamai client fingerprinting")
    print("  • Simple headers: No complex browser fingerprinting needed")
    print("  • Mobile app approach: Mimics the actual working client")
    
    return real_headers


def create_mobile_app_session():
    """Create a session that mimics the Meijer mobile app."""
    
    print(f"\n🔧 CREATING MOBILE APP SESSION")
    print("-" * 40)
    
    # Create a session with the exact mobile app headers
    session = requests.Session()
    
    # Apply the real headers we found
    real_headers = demonstrate_real_headers()
    session.headers.update(real_headers)
    
    print(f"✅ Session created with {len(real_headers)} headers")
    print(f"📱 User-Agent: {session.headers.get('User-Agent', 'N/A')[:60]}...")
    
    return session


def test_akamai_bypass():
    """Test the Akamai bypass with real headers."""
    
    print(f"\n🧪 TESTING AKAMAI BYPASS")
    print("-" * 40)
    
    # Create the bypass client
    bypass_client = AkamaiBypassClient()
    
    # Test endpoints that might be protected
    test_endpoints = [
        "/oauth2/default/v1/keys",
        "/oauth2/default/v1/token",
        "/api/stores",
        "/api/products/search"
    ]
    
    for endpoint in test_endpoints:
        try:
            print(f"📡 Testing {endpoint}...")
            
            # Use the bypass client
            response = bypass_client.get(endpoint)
            
            if response.status_code == 200:
                print(f"✅ {endpoint} - Success (Status: {response.status_code})")
            elif response.status_code == 401:
                print(f"🔐 {endpoint} - Authentication required (Status: {response.status_code})")
            elif response.status_code == 403:
                print(f"🚫 {endpoint} - Access denied (Status: {response.status_code})")
            else:
                print(f"⚠️ {endpoint} - Unexpected status: {response.status_code}")
                
        except Exception as e:
            print(f"❌ {endpoint} - Error: {e}")
        
        print()  # Empty line for readability


def demonstrate_header_rotation():
    """Demonstrate header rotation strategies."""
    
    print(f"\n🔄 HEADER ROTATION STRATEGIES")
    print("-" * 40)
    
    # Create header spoofer
    spoofer = HeaderSpoofer()
    
    print("📱 Available browser profiles:")
    for i, profile in enumerate(spoofer.browser_profiles):
        browser_name = "Chrome" if "Chrome" in profile.user_agent else "Firefox" if "Firefox" in profile.user_agent else "Safari"
        platform = "Mobile" if "Mobile" in profile.user_agent else "Desktop"
        print(f"  {i+1}. {browser_name} ({platform}) - {profile.user_agent[:60]}...")
    
    print(f"\n💡 Rotation Strategy:")
    print("  • Rotate every 10-20 requests")
    print("  • Maintain session consistency")
    print("  • Use mobile app headers for auth endpoints")
    print("  • Fall back to browser headers for general requests")


def main():
    """Main function to demonstrate Akamai bypass."""
    
    print("🚀 AKAMAI BYPASS DEMONSTRATION")
    print("=" * 60)
    
    try:
        # Show real headers from logs
        demonstrate_real_headers()
        
        # Create mobile app session
        session = create_mobile_app_session()
        
        # Test bypass functionality
        test_akamai_bypass()
        
        # Show header rotation strategies
        demonstrate_header_rotation()
        
        print(f"\n🎯 RECOMMENDATIONS FOR AKAMAI BYPASS:")
        print("=" * 60)
        print("1. Use exact mobile app User-Agent for authentication")
        print("2. Include X-ACF-Sensor-Data header when available")
        print("3. Keep headers simple and consistent")
        print("4. Rotate headers periodically to avoid detection")
        print("5. Use realistic request timing")
        print("6. Maintain session state across requests")
        print("7. Monitor for blocking indicators and adapt")
        
        print(f"\n💾 Example session headers saved to: example_session_headers.json")
        
        # Save example headers to file
        with open("example_session_headers.json", "w") as f:
            json.dump(dict(session.headers), f, indent=2)
        
    except Exception as e:
        print(f"❌ Error in demonstration: {e}")
        return 1
    
    return 0


if __name__ == "__main__":
    sys.exit(main())
