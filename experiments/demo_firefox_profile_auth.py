#!/usr/bin/env python3
"""
Demo: Firefox Profile-Based Authentication

This script demonstrates how to use Firefox profiles for persistent authentication
sessions that can be shared between Selenium automation and regular Firefox.

Features:
1. Creates and manages Firefox profiles
2. Performs authentication using Selenium
3. Launches regular Firefox with the same profile
4. Demonstrates persistent login sessions

Author: Claude Sonnet 4 (claude-3-5-sonnet-20241022)
Generated via Cursor IDE (cursor.sh) with AI assistance
Model: Anthropic Claude 3.5 Sonnet
Generation timestamp: 2024-12-19
Context: Demo script for Firefox profile-based authentication
"""

import os
import sys
import time
import logging
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

# Configure logging
logging.basicConfig(
    level=logging.INFO,
    format='%(asctime)s - %(name)s - %(levelname)s - %(message)s'
)
logger = logging.getLogger(__name__)


def demo_profile_management():
    """Demonstrate Firefox profile management capabilities."""
    print("=" * 60)
    print("🔥 FIREFOX PROFILE MANAGEMENT DEMO")
    print("=" * 60)
    
    try:
        from meijer.firefox_profile_manager import FirefoxProfileManager
        
        # Create a profile manager
        profile_manager = FirefoxProfileManager("demo_profile")
        
        # Show profile information
        print(f"📁 Profile Name: {profile_manager.profile_name}")
        print(f"📂 Profile Path: {profile_manager.get_profile_path()}")
        print(f"🔍 Profile Exists: {profile_manager.profile_exists()}")
        
        # Create profile if it doesn't exist
        if not profile_manager.profile_exists():
            print("🆕 Creating new Firefox profile...")
            profile_manager.create_profile()
        else:
            print("✅ Profile already exists")
        
        # Get detailed profile info
        profile_info = profile_manager.get_profile_info()
        print(f"📊 Profile Size: {profile_info.get('size_mb', 0)} MB")
        print(f"🍪 Has Cookies: {profile_info.get('has_cookies.sqlite', False)}")
        print(f"🔐 Has Logins: {profile_info.get('has_logins.json', False)}")
        
        return profile_manager
        
    except ImportError as e:
        print(f"❌ Failed to import Firefox profile manager: {e}")
        return None


def demo_authentication_with_profile():
    """Demonstrate authentication using Firefox profiles."""
    print("\n" + "=" * 60)
    print("🔐 AUTHENTICATION WITH FIREFOX PROFILE DEMO")
    print("=" * 60)
    
    try:
        from meijer.enhanced_headless_auth import authenticate_with_profile
        
        # Check if credentials file exists
        credentials_file = Path.home() / ".config" / "meijer" / "login.txt"
        if not credentials_file.exists():
            print(f"❌ Credentials file not found: {credentials_file}")
            print("Please create this file with your Meijer credentials:")
            print("Line 1: username/email")
            print("Line 2: password")
            return None
        
        # Read credentials
        with open(credentials_file, 'r') as f:
            lines = f.readlines()
            if len(lines) < 2:
                print("❌ Credentials file must contain username and password on separate lines")
                return None
            
            username = lines[0].strip()
            password = lines[1].strip()
        
        print(f"👤 Username: {username}")
        print(f"🔑 Password: {'*' * len(password)}")
        print(f"🌐 Profile: meijer_automation")
        
        # Perform authentication with profile
        print("\n🚀 Starting authentication with Firefox profile...")
        result = authenticate_with_profile(
            username=username,
            password=password,
            profile_name="meijer_automation",
            headless=False,  # Visible browser for demo
            proxy_host="127.0.0.1",
            proxy_port=8080
        )
        
        # Display results
        print(f"\n📊 Authentication Result:")
        print(f"✅ Success: {result['success']}")
        print(f"💬 Message: {result['message']}")
        print(f"📁 Profile Path: {result['profile_path']}")
        
        if result['success']:
            print(f"🌐 Current URL: {result.get('current_url', 'N/A')}")
            print(f"📄 Page Title: {result.get('page_title', 'N/A')}")
        
        return result
        
    except ImportError as e:
        print(f"❌ Failed to import enhanced auth module: {e}")
        return None
    except Exception as e:
        print(f"❌ Authentication failed: {e}")
        return None


def demo_regular_firefox_launch():
    """Demonstrate launching regular Firefox with the profile."""
    print("\n" + "=" * 60)
    print("🌐 REGULAR FIREFOX LAUNCH DEMO")
    print("=" * 60)
    
    try:
        from meijer.firefox_profile_manager import create_meijer_profile
        
        # Create profile manager
        profile_manager = create_meijer_profile("meijer_automation")
        
        print(f"📁 Using profile: {profile_manager.profile_name}")
        print(f"📂 Profile path: {profile_manager.get_profile_path()}")
        
        # Launch regular Firefox
        print("\n🚀 Launching regular Firefox with profile...")
        success = profile_manager.launch_regular_firefox()
        
        if success:
            print("✅ Regular Firefox launched successfully!")
            print("🌐 You can now use regular Firefox with your saved login session")
            print("💡 Try navigating to https://www.meijer.com to see if you're logged in")
        else:
            print("❌ Failed to launch regular Firefox")
        
        return success
        
    except Exception as e:
        print(f"❌ Failed to launch regular Firefox: {e}")
        return False


def demo_profile_operations():
    """Demonstrate various profile operations."""
    print("\n" + "=" * 60)
    print("🔧 PROFILE OPERATIONS DEMO")
    print("=" * 60)
    
    try:
        from meijer.firefox_profile_manager import create_meijer_profile
        
        # Create profile manager
        profile_manager = create_meijer_profile("meijer_automation")
        
        # Show profile info
        print("📊 Current Profile Information:")
        profile_info = profile_manager.get_profile_info()
        for key, value in profile_info.items():
            print(f"  {key}: {value}")
        
        # Create backup
        print("\n💾 Creating profile backup...")
        backup_path = profile_manager.backup_profile()
        if backup_path:
            print(f"✅ Backup created: {backup_path}")
        else:
            print("❌ Backup failed")
        
        # Clean profile
        print("\n🧹 Cleaning profile...")
        if profile_manager.clean_profile():
            print("✅ Profile cleaned successfully")
        else:
            print("❌ Profile cleaning failed")
        
        # Show updated info
        print("\n📊 Updated Profile Information:")
        updated_info = profile_manager.get_profile_info()
        for key, value in updated_info.items():
            print(f"  {key}: {value}")
        
        return True
        
    except Exception as e:
        print(f"❌ Profile operations failed: {e}")
        return False


def main():
    """Main demo function."""
    print("🚀 FIREFOX PROFILE AUTHENTICATION DEMO")
    print("This demo shows how to use Firefox profiles for persistent login sessions")
    print("=" * 60)
    
    # Demo 1: Profile Management
    profile_manager = demo_profile_management()
    if not profile_manager:
        print("❌ Profile management demo failed - exiting")
        return
    
    # Demo 2: Authentication with Profile
    auth_result = demo_authentication_with_profile()
    if not auth_result:
        print("❌ Authentication demo failed - exiting")
        return
    
    # Demo 3: Regular Firefox Launch
    if auth_result['success']:
        print("\n⏳ Waiting 5 seconds before launching regular Firefox...")
        time.sleep(5)
        
        demo_regular_firefox_launch()
    else:
        print("⚠️ Skipping regular Firefox launch due to authentication failure")
    
    # Demo 4: Profile Operations
    demo_profile_operations()
    
    print("\n" + "=" * 60)
    print("🎉 DEMO COMPLETED!")
    print("=" * 60)
    print("💡 Key Benefits of Firefox Profiles:")
    print("  • Persistent login sessions across browser restarts")
    print("  • Share authentication state between automation and manual testing")
    print("  • No need to re-authenticate for each session")
    print("  • Easy backup and restore of authentication state")
    print("\n🔧 To use regular Firefox with your profile:")
    print(f"  firefox --profile {profile_manager.get_profile_path()}")
    print("\n📁 Profile location:")
    print(f"  {profile_manager.get_profile_path()}")


if __name__ == "__main__":
    main()
