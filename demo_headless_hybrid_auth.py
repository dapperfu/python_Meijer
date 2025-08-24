#!/usr/bin/env python3
"""
Demo script for Headless Hybrid Authentication

This script demonstrates how to use the headless hybrid authentication module
with different configurations and options.
"""

import sys
import os
import logging
from typing import Dict, Any

# Add the current directory to Python path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

def read_credentials() -> tuple[str, str]:
    """Read credentials from login.txt file."""
    login_file = "/keg/cursor/.config/meijer/login.txt"
    
    try:
        with open(login_file, 'r') as f:
            lines = f.readlines()
            if len(lines) >= 2:
                username = lines[0].strip()
                password = lines[1].strip()
                return username, password
            else:
                raise ValueError("login.txt must contain username and password on separate lines")
    except Exception as e:
        print(f"❌ Error reading {login_file}: {e}")
        sys.exit(1)

def demo_basic_headless_auth():
    """Demo basic headless authentication."""
    print("🚀 Demo 1: Basic Headless Authentication")
    print("=" * 50)
    
    try:
        from meijer.headless_hybrid_auth import authenticate_headless
        
        # Read credentials
        username, password = read_credentials()
        print(f"🔐 Using credentials:")
        print(f"   Username: {username}")
        print(f"   Password: {'*' * len(password)}")
        print()
        
        # Perform headless authentication
        print("🔄 Performing headless hybrid authentication...")
        result = authenticate_headless(
            username=username,
            password=password,
            headless=True,  # Run in headless mode
            verbose=True     # Enable verbose logging
        )
        
        # Display results
        print("\n📊 Authentication Results:")
        print(f"   Success: {result.success}")
        print(f"   Cookies: {len(result.cookies)}")
        print(f"   State Token: {'✅' if result.state_token else '❌'}")
        print(f"   State Handle: {'✅' if result.state_handle else '❌'}")
        
        if result.error_message:
            print(f"   Error: {result.error_message}")
        
        if result.success:
            print("\n🎉 Headless authentication successful!")
            print("💡 This proves the hybrid approach works in production!")
        else:
            print("\n❌ Headless authentication failed")
            print("💡 Check the error message for details")
        
        return result
        
    except ImportError as e:
        print(f"❌ Could not import headless hybrid auth module: {e}")
        return None
    except Exception as e:
        print(f"❌ Error in basic demo: {e}")
        import traceback
        traceback.print_exc()
        return None

def demo_visible_mode_auth():
    """Demo authentication with visible browser (for debugging)."""
    print("\n🚀 Demo 2: Visible Mode Authentication (Debug)")
    print("=" * 50)
    
    try:
        from meijer.headless_hybrid_auth import authenticate_headless
        
        # Read credentials
        username, password = read_credentials()
        
        # Perform authentication with visible browser
        print("🔄 Performing authentication with visible browser...")
        result = authenticate_headless(
            username=username,
            password=password,
            headless=False,  # Show browser window
            verbose=True,     # Enable verbose logging
            timeout=45        # Longer timeout for visible mode
        )
        
        # Display results
        print("\n📊 Authentication Results:")
        print(f"   Success: {result.success}")
        print(f"   Cookies: {len(result.cookies)}")
        print(f"   State Token: {'✅' if result.state_token else '❌'}")
        print(f"   State Handle: {'✅' if result.state_handle else '❌'}")
        
        if result.error_message:
            print(f"   Error: {result.error_message}")
        
        return result
        
    except Exception as e:
        print(f"❌ Error in visible mode demo: {e}")
        import traceback
        traceback.print_exc()
        return None

def demo_custom_proxy_auth():
    """Demo authentication with custom proxy settings."""
    print("\n🚀 Demo 3: Custom Proxy Configuration")
    print("=" * 50)
    
    try:
        from meijer.headless_hybrid_auth import authenticate_headless
        
        # Read credentials
        username, password = read_credentials()
        
        # Custom proxy configuration
        custom_proxy_host = "127.0.0.1"
        custom_proxy_port = 8080
        
        print(f"🌐 Using custom proxy: {custom_proxy_host}:{custom_proxy_port}")
        
        # Perform authentication with custom proxy
        print("🔄 Performing authentication with custom proxy...")
        result = authenticate_headless(
            username=username,
            password=password,
            headless=True,
            proxy_host=custom_proxy_host,
            proxy_port=custom_proxy_port,
            verbose=True
        )
        
        # Display results
        print("\n📊 Authentication Results:")
        print(f"   Success: {result.success}")
        print(f"   Cookies: {len(result.cookies)}")
        print(f"   State Token: {'✅' if result.state_token else '❌'}")
        print(f"   State Handle: {'✅' if result.state_handle else '❌'}")
        
        if result.error_message:
            print(f"   Error: {result.error_message}")
        
        return result
        
    except Exception as e:
        print(f"❌ Error in custom proxy demo: {e}")
        import traceback
        traceback.print_exc()
        return None

def demo_class_based_auth():
    """Demo using the HeadlessHybridAuthenticator class directly."""
    print("\n🚀 Demo 4: Class-Based Authentication")
    print("=" * 50)
    
    try:
        from meijer.headless_hybrid_auth import HeadlessHybridAuthenticator
        
        # Read credentials
        username, password = read_credentials()
        
        # Create authenticator instance
        print("🔧 Creating HeadlessHybridAuthenticator instance...")
        authenticator = HeadlessHybridAuthenticator(
            username=username,
            password=password,
            headless=True,
            verbose=True,
            timeout=30
        )
        
        # Perform authentication
        print("🔄 Performing authentication...")
        result = authenticator.authenticate()
        
        # Display results
        print("\n📊 Authentication Results:")
        print(f"   Success: {result.success}")
        print(f"   Cookies: {len(result.cookies)}")
        print(f"   State Token: {'✅' if result.state_token else '❌'}")
        print(f"   State Handle: {'✅' if result.state_handle else '❌'}")
        
        if result.error_message:
            print(f"   Error: {result.error_message}")
        
        if result.success and result.session_data:
            print(f"\n📄 Session Data:")
            print(f"   Page Source Length: {result.session_data.get('page_source_length', 'N/A')}")
            print(f"   Page Title: {result.session_data.get('page_title', 'N/A')}")
            print(f"   Current URL: {result.session_data.get('current_url', 'N/A')}")
        
        return result
        
    except Exception as e:
        print(f"❌ Error in class-based demo: {e}")
        import traceback
        traceback.print_exc()
        return None

def demo_error_handling():
    """Demo error handling and edge cases."""
    print("\n🚀 Demo 5: Error Handling and Edge Cases")
    print("=" * 50)
    
    try:
        from meijer.headless_hybrid_auth import authenticate_headless
        
        # Test with invalid credentials
        print("🧪 Testing with invalid credentials...")
        result = authenticate_headless(
            username="invalid@example.com",
            password="wrongpassword",
            headless=True,
            verbose=True
        )
        
        print("\n📊 Error Handling Results:")
        print(f"   Success: {result.success}")
        print(f"   Error Message: {result.error_message or 'None'}")
        
        # Test with invalid proxy
        print("\n🧪 Testing with invalid proxy...")
        try:
            result = authenticate_headless(
                username="test@example.com",
                password="testpass",
                headless=True,
                proxy_host="invalid.proxy",
                proxy_port=9999,
                timeout=10,  # Short timeout for quick failure
                verbose=True
            )
            
            print(f"   Success: {result.success}")
            print(f"   Error Message: {result.error_message or 'None'}")
            
        except Exception as e:
            print(f"   Exception caught: {e}")
        
        return True
        
    except Exception as e:
        print(f"❌ Error in error handling demo: {e}")
        import traceback
        traceback.print_exc()
        return None

def main():
    """Run all demos."""
    print("🎯 Headless Hybrid Authentication Demos")
    print("=" * 60)
    print("This script demonstrates the headless hybrid authentication module")
    print("with different configurations and use cases.")
    print()
    
    # Configure logging
    logging.basicConfig(
        level=logging.INFO,
        format='%(asctime)s - %(name)s - %(levelname)s - %(message)s'
    )
    
    results = []
    
    try:
        # Demo 1: Basic headless authentication
        result1 = demo_basic_headless_auth()
        results.append(("Basic Headless", result1))
        
        # Demo 2: Visible mode authentication
        result2 = demo_visible_mode_auth()
        results.append(("Visible Mode", result2))
        
        # Demo 3: Custom proxy configuration
        result3 = demo_custom_proxy_auth()
        results.append(("Custom Proxy", result3))
        
        # Demo 4: Class-based authentication
        result4 = demo_class_based_auth()
        results.append(("Class-Based", result4))
        
        # Demo 5: Error handling
        result5 = demo_error_handling()
        results.append(("Error Handling", result5))
        
        # Summary
        print("\n" + "=" * 60)
        print("📊 Demo Summary")
        print("=" * 60)
        
        successful_demos = 0
        for demo_name, result in results:
            if result and hasattr(result, 'success') and result.success:
                status = "✅ SUCCESS"
                successful_demos += 1
            elif result and hasattr(result, 'success'):
                status = "❌ FAILED"
            else:
                status = "⚠️ ERROR"
            
            print(f"   {demo_name:<20}: {status}")
        
        print(f"\n🎯 Overall: {successful_demos}/{len(results)} demos successful")
        
        if successful_demos == len(results):
            print("🎉 All demos completed successfully!")
            print("💡 The headless hybrid authentication module is working perfectly!")
        elif successful_demos > 0:
            print("⚠️ Some demos failed, but the core functionality works!")
        else:
            print("❌ All demos failed. Check the error messages above.")
        
        return successful_demos > 0
        
    except KeyboardInterrupt:
        print("\n👋 Demos interrupted by user")
        return False
    except Exception as e:
        print(f"\n❌ Unexpected error in main: {e}")
        import traceback
        traceback.print_exc()
        return False

if __name__ == "__main__":
    main()
