#!/usr/bin/env python3
"""
Demo: Dual-Path Firefox Browser Launcher

This script demonstrates the dual-path Firefox launcher that can:
1. Launch regular Firefox with a profile and proxy settings
2. Launch Firefox with Selenium using the same profile
3. Launch both methods simultaneously

Both methods use the same profile, so authentication state is shared.

Author: Claude Sonnet 4 (claude-3-5-sonnet-20241022)
Generated via Cursor IDE (cursor.sh) with AI assistance
Model: Anthropic Claude 3.5 Sonnet
Generation timestamp: 2024-12-19
Context: Demo script for dual-path Firefox launcher
"""

import os
import sys
import time
import logging
from pathlib import Path

# Add the tools directory to the path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

# Configure logging
logging.basicConfig(
    level=logging.INFO,
    format='%(asctime)s - %(name)s - %(levelname)s - %(message)s'
)
logger = logging.getLogger(__name__)


def demo_regular_firefox():
    """Demonstrate launching regular Firefox."""
    print("=" * 60)
    print("🌐 REGULAR FIREFOX LAUNCH DEMO")
    print("=" * 60)
    
    try:
        from tools.launch_firefox_browser import launch_regular_firefox
        
        print("🚀 Launching regular Firefox with profile and proxy...")
        success = launch_regular_firefox(
            profile_name="meijer_automation",
            proxy_host="127.0.0.1",
            proxy_port=8080
        )
        
        if success:
            print("✅ Regular Firefox launched successfully!")
            print("💡 You can now use regular Firefox with your profile")
            print("💡 Close the browser when done testing")
        else:
            print("❌ Failed to launch regular Firefox")
        
        return success
        
    except Exception as e:
        print(f"❌ Error in regular Firefox demo: {e}")
        return False


def demo_selenium_firefox():
    """Demonstrate launching Firefox with Selenium."""
    print("\n" + "=" * 60)
    print("🤖 SELENIUM FIREFOX LAUNCH DEMO")
    print("=" * 60)
    
    try:
        from tools.launch_firefox_browser import launch_with_selenium
        
        print("🚀 Launching Firefox with Selenium...")
        success = launch_with_selenium(
            profile_name="meijer_automation",
            proxy_host="127.0.0.1",
            proxy_port=8080,
            headless=False  # Visible for demo
        )
        
        if success:
            print("✅ Selenium Firefox launched successfully!")
            print("💡 Browser is controlled by Selenium but visible for interaction")
            print("💡 Close the browser when done testing")
        else:
            print("❌ Failed to launch Selenium Firefox")
        
        return success
        
    except Exception as e:
        print(f"❌ Error in Selenium Firefox demo: {e}")
        return False


def demo_dual_path():
    """Demonstrate launching both methods."""
    print("\n" + "=" * 60)
    print("🔄 DUAL-PATH LAUNCH DEMO")
    print("=" * 60)
    
    try:
        from tools.launch_firefox_browser import launch_dual_path
        
        print("🚀 Launching both regular and Selenium Firefox...")
        success = launch_dual_path(
            profile_name="meijer_automation",
            proxy_host="127.0.0.1",
            proxy_port=8080,
            method="both"
        )
        
        if success:
            print("✅ Dual-path launch completed!")
            print("💡 You now have both regular and Selenium Firefox running")
            print("💡 Both use the same profile - authentication state is shared")
        else:
            print("❌ Dual-path launch failed")
        
        return success
        
    except Exception as e:
        print(f"❌ Error in dual-path demo: {e}")
        return False


def demo_profile_sharing():
    """Demonstrate that both methods share the same profile."""
    print("\n" + "=" * 60)
    print("📁 PROFILE SHARING DEMO")
    print("=" * 60)
    
    try:
        from meijer.firefox_profile_manager import create_meijer_profile
        
        # Create profile manager
        profile_manager = create_meijer_profile("meijer_automation")
        
        print("📊 Profile Information:")
        profile_info = profile_manager.get_profile_info()
        for key, value in profile_info.items():
            print(f"  {key}: {value}")
        
        print(f"\n💡 Both regular Firefox and Selenium will use this profile:")
        print(f"   {profile_manager.get_profile_path()}")
        print("\n🔑 This means:")
        print("  • Login sessions are shared between both methods")
        print("  • Cookies and storage are persistent")
        print("  • You can authenticate once and use both browsers")
        
        return True
        
    except Exception as e:
        print(f"❌ Error in profile sharing demo: {e}")
        return False


def demo_command_line_usage():
    """Demonstrate command-line usage."""
    print("\n" + "=" * 60)
    print("💻 COMMAND-LINE USAGE DEMO")
    print("=" * 60)
    
    print("🔧 Available commands:")
    print("\n1. Launch both methods (default):")
    print("   python tools/launch_firefox_browser.py")
    
    print("\n2. Launch only regular Firefox:")
    print("   python tools/launch_firefox_browser.py --method regular")
    
    print("\n3. Launch only Selenium Firefox:")
    print("   python tools/launch_firefox_browser.py --method selenium")
    
    print("\n4. Use specific profile:")
    print("   python tools/launch_firefox_browser.py --profile my_profile")
    
    print("\n5. Use custom proxy:")
    print("   python tools/launch_firefox_browser.py --proxy 192.168.1.100:3128")
    
    print("\n6. List available profiles:")
    print("   python tools/launch_firefox_browser.py --list")
    
    print("\n7. Simple alias script:")
    print("   ./tools/launch_browser                    # Both methods")
    print("   ./tools/launch_browser regular            # Regular only")
    print("   ./tools/launch_browser selenium           # Selenium only")
    print("   ./tools/launch_browser both my_profile    # Both with custom profile")
    
    return True


def main():
    """Main demo function."""
    print("🚀 DUAL-PATH FIREFOX BROWSER LAUNCHER DEMO")
    print("This demo shows how to launch Firefox using two different methods")
    print("Both methods use the same profile for shared authentication state")
    print("=" * 60)
    
    # Demo 1: Profile Sharing
    demo_profile_sharing()
    
    # Demo 2: Command Line Usage
    demo_command_line_usage()
    
    print("\n" + "=" * 60)
    print("🎯 CHOOSE YOUR LAUNCH METHOD")
    print("=" * 60)
    
    while True:
        print("\nSelect a demo option:")
        print("1. Launch Regular Firefox")
        print("2. Launch Selenium Firefox")
        print("3. Launch Both Methods")
        print("4. Exit")
        
        choice = input("\nEnter your choice (1-4): ").strip()
        
        if choice == "1":
            demo_regular_firefox()
        elif choice == "2":
            demo_selenium_firefox()
        elif choice == "3":
            demo_dual_path()
        elif choice == "4":
            break
        else:
            print("❌ Invalid choice. Please enter 1-4.")
        
        if choice in ["1", "2", "3"]:
            input("\nPress Enter to continue...")
    
    print("\n" + "=" * 60)
    print("🎉 DEMO COMPLETED!")
    print("=" * 60)
    print("💡 Key Benefits of Dual-Path Launcher:")
    print("  • Regular Firefox: Manual testing and demonstration")
    print("  • Selenium Firefox: Automation and development")
    print("  • Shared Profile: Authentication state is maintained")
    print("  • Proxy Support: Built-in mitmproxy configuration")
    print("  • Flexible Usage: Choose the method that fits your needs")
    print("\n🔧 Quick Start:")
    print("  • Regular testing: ./tools/launch_browser regular")
    print("  • Automation: ./tools/launch_browser selenium")
    print("  • Both: ./tools/launch_browser both")


if __name__ == "__main__":
    main()
