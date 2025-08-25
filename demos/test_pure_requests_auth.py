#!/usr/bin/env python3
"""
Focused test script for the pure requests authentication method.
This script tests the exact flow replication from the captured logs.
"""

import sys
import logging
import time
import json
from pathlib import Path

# Add the parent directory to the path so we can import the meijer module
sys.path.insert(0, str(Path(__file__).parent.parent))

from meijer.headless_auth_client import create_headless_client

# Configure detailed logging
logging.basicConfig(
    level=logging.DEBUG,
    format='%(asctime)s - %(name)s - %(levelname)s - %(message)s'
)

def test_pure_requests_step_by_step():
    """Test the pure requests authentication method step by step."""
    print("\n" + "="*80)
    print("🔍 TESTING PURE REQUESTS AUTHENTICATION - STEP BY STEP")
    print("="*80)
    
    try:
        # Create client with requests method
        client = create_headless_client(method="requests")
        
        # Get credentials from ~/.config/meijer/login.txt
        login_file = Path.home() / ".config" / "meijer" / "login.txt"
        
        if not login_file.exists():
            print(f"❌ Login file not found: {login_file}")
            return False
        
        try:
            with open(login_file, 'r') as f:
                lines = f.readlines()
                if len(lines) >= 2:
                    username = lines[0].strip()
                    password = lines[1].strip()
                else:
                    print("❌ login.txt must contain username and password on separate lines")
                    return False
        except Exception as e:
            print(f"❌ Error reading {login_file}: {e}")
            return False
        
        print(f"👤 Username: {username}")
        print(f"🔑 Password: {'*' * len(password)}")
        print()
        
        # Test each step individually
        print("🚀 Testing individual authentication steps...")
        print()
        
        # Step 1: OAuth2 Authorization
        print("📋 Step 1: OAuth2 Authorization")
        print("-" * 40)
        if client._step1_oauth_authorize():
            print("✅ Step 1 completed successfully")
            print(f"   State token: {client.state_token[:50]}..." if client.state_token else "   No state token")
        else:
            print("❌ Step 1 failed")
            return False
        print()
        
        # Step 2: Device Fingerprinting
        print("📋 Step 2: Device Fingerprinting")
        print("-" * 40)
        if client._step2_device_fingerprint():
            print("✅ Step 2 completed successfully")
            print(f"   Device nonce: {client.device_nonce[:50]}..." if client.device_nonce else "   No device nonce")
        else:
            print("❌ Step 2 failed")
            return False
        print()
        
        # Step 4: Web Login Identify
        print("📋 Step 4: Web Login Identify")
        print("-" * 40)
        if client._step4_web_login_identify(username):
            print("✅ Step 4 completed successfully")
            print(f"   State handle: {client.state_handle[:50]}..." if client.state_handle else "   No state handle")
        else:
            print("❌ Step 4 failed")
            return False
        print()
        
        # Step 5: Challenge Answer (Password)
        print("📋 Step 5: Challenge Answer (Password)")
        print("-" * 40)
        if client._step5_challenge_answer(password):
            print("✅ Step 5 completed successfully")
        else:
            print("❌ Step 5 failed")
            return False
        print()
        
        print("🎉 All individual steps completed successfully!")
        print(f"🔐 Final authentication status: {client.is_authenticated()}")
        
        # Test the session
        try:
            session = client.get_session()
            print(f"📡 Session created: {type(session)}")
            print(f"🍪 Total cookies: {len(session.cookies)}")
            
            # Show all cookies
            print("\n🍪 Session Cookies:")
            for cookie in session.cookies:
                print(f"   {cookie.name}: {cookie.value[:100]}...")
            
            # Show headers
            print(f"\n📋 Session Headers: {len(session.headers)}")
            for name, value in session.headers.items():
                if name.lower() in ['user-agent', 'authorization', 'cookie']:
                    print(f"   {name}: {value[:100]}...")
            
        except Exception as e:
            print(f"❌ Error testing session: {e}")
        
        return True
        
    except Exception as e:
        print(f"💥 Error in step-by-step test: {e}")
        import traceback
        traceback.print_exc()
        return False

def test_pure_requests_full_flow():
    """Test the complete pure requests authentication flow."""
    print("\n" + "="*80)
    print("🚀 TESTING PURE REQUESTS AUTHENTICATION - FULL FLOW")
    print("="*80)
    
    try:
        # Create client with requests method
        client = create_headless_client(method="requests")
        
        # Get credentials from ~/.config/meijer/login.txt
        login_file = Path.home() / ".config" / "meijer" / "login.txt"
        
        if not login_file.exists():
            print(f"❌ Login file not found: {login_file}")
            return False
        
        try:
            with open(login_file, 'r') as f:
                lines = f.readlines()
                if len(lines) >= 2:
                    username = lines[0].strip()
                    password = lines[1].strip()
                else:
                    print("❌ login.txt must contain username and password on separate lines")
                    return False
        except Exception as e:
            print(f"❌ Error reading {login_file}: {e}")
            return False
        
        print(f"👤 Username: {username}")
        print(f"🔑 Password: {'*' * len(password)}")
        print()
        
        # Start the complete flow
        print("🚀 Starting complete pure requests authentication flow...")
        start_time = time.time()
        
        success = client.login(username, password)
        
        end_time = time.time()
        duration = end_time - start_time
        
        if success:
            print(f"✅ Full flow completed successfully in {duration:.2f} seconds!")
            print(f"🔐 Authenticated: {client.is_authenticated()}")
            
            # Check if auth.json was created
            if Path('auth.json').exists():
                print("💾 auth.json file created")
                try:
                    with open('auth.json', 'r') as f:
                        auth_data = json.load(f)
                    print(f"   Access token: {auth_data.get('access_token', 'N/A')[:50]}...")
                    print(f"   Token type: {auth_data.get('token_type', 'N/A')}")
                    print(f"   Expires in: {auth_data.get('expires_in', 'N/A')}")
                except Exception as e:
                    print(f"   Error reading auth.json: {e}")
            else:
                print("⚠️  auth.json file not created")
            
            return True
        else:
            print(f"❌ Full flow failed after {duration:.2f} seconds")
            return False
            
    except Exception as e:
        print(f"💥 Error in full flow test: {e}")
        import traceback
        traceback.print_exc()
        return False

def analyze_session_details():
    """Analyze the authenticated session in detail."""
    print("\n" + "="*80)
    print("🔍 ANALYZING AUTHENTICATED SESSION")
    print("="*80)
    
    try:
        # Check if auth.json exists
        if not Path('auth.json').exists():
            print("❌ No auth.json file found. Please authenticate first.")
            return
        
        # Load auth data
        with open('auth.json', 'r') as f:
            auth_data = json.load(f)
        
        print("📊 Authentication Data:")
        print(f"   Timestamp: {auth_data.get('timestamp', 'N/A')}")
        print(f"   Access Token: {auth_data.get('access_token', 'N/A')[:50]}...")
        print(f"   Token Type: {auth_data.get('token_type', 'N/A')}")
        print(f"   Expires In: {auth_data.get('expires_in', 'N/A')}")
        print(f"   Scope: {auth_data.get('scope', 'N/A')}")
        print(f"   ID Token: {auth_data.get('id_token', 'N/A')[:50] if auth_data.get('id_token') else 'N/A'}...")
        
        # Create a client and test the session
        client = create_headless_client(method="requests")
        
        # Try to load the session
        if client._load_auth_tokens():
            print("\n✅ Successfully loaded authentication tokens")
            
            # Test the session
            try:
                session = client.get_session()
                print(f"📡 Session type: {type(session)}")
                print(f"🍪 Cookie count: {len(session.cookies)}")
                
                # Test a simple request
                print("\n🧪 Testing session with a simple request...")
                response = session.get("https://www.meijer.com/account", timeout=10)
                print(f"   Account page status: {response.status_code}")
                print(f"   Response size: {len(response.content)} bytes")
                
                if response.status_code == 200:
                    print("   ✅ Session is working!")
                else:
                    print(f"   ⚠️  Session returned status {response.status_code}")
                
            except Exception as e:
                print(f"❌ Error testing session: {e}")
        else:
            print("❌ Failed to load authentication tokens")
        
    except Exception as e:
        print(f"💥 Error analyzing session: {e}")
        import traceback
        traceback.print_exc()

def main():
    """Main function to run all tests."""
    print("🚀 MEIJER PURE REQUESTS AUTHENTICATION TEST")
    print("="*80)
    print("This script tests the pure requests authentication method")
    print("which replicates the exact flow from captured logs.")
    print()
    
    # Check if credentials are available
    login_file = Path.home() / ".config" / "meijer" / "login.txt"
    
    if not login_file.exists():
        print("❌ Login file not found!")
        print(f"Please create: {login_file}")
        print("With the following format:")
        print("   your_email@example.com")
        print("   your_password")
        print()
        return
    
    try:
        with open(login_file, 'r') as f:
            lines = f.readlines()
            if len(lines) >= 2:
                username = lines[0].strip()
                password = lines[1].strip()
            else:
                print("❌ login.txt must contain username and password on separate lines")
                return
    except Exception as e:
        print(f"❌ Error reading {login_file}: {e}")
        return
    
    print(f"✅ Credentials found: {username}")
    print()
    
    # Test results
    results = {}
    
    # Test 1: Step by step
    print("🔍 Test 1: Step-by-Step Authentication")
    results['step_by_step'] = test_pure_requests_step_by_step()
    
    # Test 2: Full flow
    print("\n🔍 Test 2: Full Flow Authentication")
    results['full_flow'] = test_pure_requests_full_flow()
    
    # Analyze session
    print("\n🔍 Test 3: Session Analysis")
    analyze_session_details()
    
    # Summary
    print("\n" + "="*80)
    print("📊 TEST RESULTS SUMMARY")
    print("="*80)
    
    for test, success in results.items():
        status = "✅ SUCCESS" if success else "❌ FAILED"
        print(f"{test.replace('_', ' ').title():20}: {status}")
    
    print()
    
    # Recommendations
    print("💡 RECOMMENDATIONS:")
    if results['step_by_step'] and results['full_flow']:
        print("   • Pure requests method is working perfectly!")
        print("   • Use this method for production applications")
        print("   • All steps are replicating the captured flow correctly")
    elif results['step_by_step']:
        print("   • Individual steps work but full flow has issues")
        print("   • Check timing and state management between steps")
    elif results['full_flow']:
        print("   • Full flow works but individual steps have issues")
        print("   • This suggests the flow is correct but step isolation needs work")
    else:
        print("   • All tests failed - check credentials and network connectivity")
        print("   • Verify the captured flow data is still valid")
    
    print()
    print("🎯 Next steps:")
    print("   • Check auth.json for saved tokens")
    print("   • Use the working method in your application")
    print("   • Monitor for any rate limiting or bot detection")
    print("   • Consider implementing retry logic for failed steps")

if __name__ == "__main__":
    main()
