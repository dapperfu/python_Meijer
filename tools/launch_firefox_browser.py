#!/usr/bin/env python3
"""
Firefox Browser Launcher Utility

Dual-path launcher that can launch Firefox either:
1. As regular Firefox with profile and proxy settings
2. With Selenium automation using the same profile

Both methods use the same profile, so authentication state is shared.

Author: Claude Sonnet 4 (claude-3-5-sonnet-20241022)
Generated via Cursor IDE (cursor.sh) with AI assistance
Model: Anthropic Claude 3.5 Sonnet
Generation timestamp: 2024-12-19
Context: Dual-path Firefox launcher with regular and Selenium options
"""

import argparse
import sys
import os
import subprocess
import time
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from meijer.firefox_profile_manager import FirefoxProfileManager, create_meijer_profile
from meijer.enhanced_headless_auth import EnhancedHeadlessAuthClient


def launch_regular_firefox(profile_name: str = "meijer_automation", 
                          base_dir: str = None,
                          proxy_host: str = "127.0.0.1",
                          proxy_port: int = 8080,
                          new_window: bool = True,
                          private: bool = False,
                          headless: bool = False) -> bool:
    """
    Launch regular Firefox with a specific profile and proxy settings.
    
    Args:
        profile_name: Name of the Firefox profile to use
        base_dir: Base directory for profiles
        proxy_host: Proxy host (default: 127.0.0.1)
        proxy_port: Proxy port (default: 8080)
        new_window: Whether to open in a new window
        private: Whether to open in private browsing mode
        headless: Whether to run in headless mode
        
    Returns:
        True if Firefox was launched successfully
    """
    try:
        # Create or get profile manager
        profile_manager = FirefoxProfileManager(profile_name, base_dir)
        
        if not profile_manager.profile_exists():
            print(f"⚠️ Profile '{profile_name}' does not exist, creating it...")
            profile_manager.create_profile()
        
        profile_path = profile_manager.get_profile_path()
        print(f"📁 Using profile: {profile_name}")
        print(f"📂 Profile path: {profile_path}")
        print(f"🌐 Proxy: {proxy_host}:{proxy_port}")
        print("🚀 Launching REGULAR Firefox...")
        
        # Build Firefox command
        firefox_cmd = ["firefox"]
        
        # Add profile
        firefox_cmd.extend(["--profile", profile_path])
        
        # Add new window flag
        if new_window:
            firefox_cmd.extend(["--new-window"])
        
        # Add private browsing flag
        if private:
            firefox_cmd.extend(["--private-window"])
        
        # Add headless flag
        if headless:
            firefox_cmd.extend(["--headless"])
        
        # Add proxy preferences
        # Note: Firefox command-line doesn't support proxy directly, so we'll use preferences
        firefox_cmd.extend([
            "--pref", f"network.proxy.type=1",
            "--pref", f"network.proxy.http={proxy_host}",
            "--pref", f"network.proxy.http_port={proxy_port}",
            "--pref", f"network.proxy.ssl={proxy_host}",
            "--pref", f"network.proxy.ssl_port={proxy_port}",
            "--pref", "network.proxy.share_proxy_settings=true",
            "--pref", "security.cert_verification.enabled=false",
            "--pref", "security.enterprise_roots.enabled=true"
        ])
        
        # Add some useful preferences for automation
        firefox_cmd.extend([
            "--pref", "dom.webdriver.enabled=false",
            "--pref", "useAutomationExtension=false",
            "--pref", "browser.cache.disk.enable=false",
            "--pref", "browser.cache.memory.enable=false"
        ])
        
        print(f"🔧 Command: {' '.join(firefox_cmd)}")
        
        # Launch Firefox
        process = subprocess.Popen(
            firefox_cmd,
            start_new_session=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE
        )
        
        # Wait a moment to see if it starts successfully
        time.sleep(2)
        
        if process.poll() is None:
            print("✅ Regular Firefox launched successfully!")
            print(f"📊 Process ID: {process.pid}")
            return True
        else:
            print("❌ Regular Firefox failed to start")
            stdout, stderr = process.communicate()
            if stdout:
                print(f"STDOUT: {stdout.decode()}")
            if stderr:
                print(f"STDERR: {stderr.decode()}")
            return False
            
    except Exception as e:
        print(f"❌ Error launching regular Firefox: {e}")
        return False


def launch_with_selenium(profile_name: str = "meijer_automation",
                        base_dir: str = None,
                        proxy_host: str = "127.0.0.1",
                        proxy_port: int = 8080,
                        headless: bool = False,
                        username: str = None,
                        password: str = None) -> bool:
    """
    Launch Firefox using Selenium with the same profile configuration.
    
    Args:
        profile_name: Name of the Firefox profile to use
        base_dir: Base directory for profiles
        proxy_host: Proxy host
        proxy_port: Proxy port
        headless: Whether to run in headless mode
        username: Username for authentication (optional)
        password: Password for authentication (optional)
        
    Returns:
        True if Firefox was launched successfully with Selenium
    """
    try:
        print(f"📁 Using Selenium with profile: {profile_name}")
        print(f"🌐 Proxy: {proxy_host}:{proxy_port}")
        print("🚀 Launching Firefox with SELENIUM...")
        
        # Create Selenium client with profile
        client = EnhancedHeadlessAuthClient(
            username=username or "dummy_user",  # Use dummy if not provided
            password=password or "dummy_pass",
            profile_name=profile_name,
            headless=headless,
            proxy_host=proxy_host,
            proxy_port=proxy_port
        )
        
        # Setup browser (this launches Firefox with Selenium)
        client._setup_browser()
        
        if client.driver:
            print("✅ Firefox launched successfully with Selenium!")
            print(f"📊 Driver: {type(client.driver).__name__}")
            print(f"🌐 Current URL: {client.driver.current_url}")
            
            # Keep browser open for user interaction
            print("💡 Browser will remain open for manual interaction")
            print("💡 Close the browser window when done")
            
            return True
        else:
            print("❌ Failed to launch Firefox with Selenium")
            return False
            
    except Exception as e:
        print(f"❌ Error launching Firefox with Selenium: {e}")
        return False


def launch_dual_path(profile_name: str = "meijer_automation",
                    base_dir: str = None,
                    proxy_host: str = "127.0.0.1",
                    proxy_port: int = 8080,
                    method: str = "both") -> bool:
    """
    Launch Firefox using the specified method(s).
    
    Args:
        profile_name: Name of the Firefox profile to use
        base_dir: Base directory for profiles
        proxy_host: Proxy host
        proxy_port: Proxy port
        method: Launch method - "regular", "selenium", or "both"
        
    Returns:
        True if at least one method succeeded
    """
    print("🚀 Firefox Browser Launcher - Dual Path")
    print("=" * 50)
    print(f"📁 Profile: {profile_name}")
    print(f"🌐 Proxy: {proxy_host}:{proxy_port}")
    print(f"🔧 Method: {method.upper()}")
    print()
    
    success = False
    
    if method in ["regular", "both"]:
        print("🔄 Method 1: Regular Firefox")
        print("-" * 30)
        if launch_regular_firefox(profile_name, base_dir, proxy_host, proxy_port):
            success = True
        print()
    
    if method in ["selenium", "both"]:
        print("🔄 Method 2: Selenium Firefox")
        print("-" * 30)
        if launch_with_selenium(profile_name, base_dir, proxy_host, proxy_port):
            success = True
        print()
    
    return success


def list_available_profiles(base_dir: str = None):
    """List all available Firefox profiles."""
    try:
        if base_dir:
            base_path = Path(base_dir)
        else:
            home_dir = Path.home()
            base_path = home_dir / ".mozilla" / "firefox" / "profiles"
        
        if not base_path.exists():
            print(f"No profiles directory found: {base_path}")
            return
        
        print(f"Available Firefox profiles in: {base_path}")
        print("-" * 60)
        
        profiles = []
        for item in base_path.iterdir():
            if item.is_dir():
                profile_manager = FirefoxProfileManager(item.name, str(base_path))
                profile_info = profile_manager.get_profile_info()
                profiles.append(profile_info)
        
        if not profiles:
            print("No profiles found")
            return
        
        # Sort profiles by size
        profiles.sort(key=lambda x: x.get('size_bytes', 0), reverse=True)
        
        for i, profile in enumerate(profiles, 1):
            print(f"{i}. 📁 {profile['profile_name']}")
            print(f"   📂 Path: {profile['profile_path']}")
            print(f"   📊 Size: {profile.get('size_mb', 0)} MB")
            print(f"   🍪 Cookies: {profile.get('has_cookies.sqlite', False)}")
            print(f"   🔐 Logins: {profile.get('has_logins.json', False)}")
            print()
        
        return profiles
        
    except Exception as e:
        print(f"❌ Error listing profiles: {e}")
        return None


def main():
    """Main function for the command-line interface."""
    parser = argparse.ArgumentParser(
        description="Firefox Browser Launcher - Dual Path (Regular & Selenium)",
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
Examples:
  %(prog)s                                    # Launch both methods with default profile
  %(prog)s --method regular                   # Launch only regular Firefox
  %(prog)s --method selenium                  # Launch only with Selenium
  %(prog)s --method both                      # Launch both methods (default)
  %(prog)s --profile my_profile               # Use specific profile
  %(prog)s --proxy 192.168.1.100:3128        # Use custom proxy
  %(prog)s --list                             # List available profiles
  %(prog)s --headless                         # Run Selenium in headless mode
        """
    )
    
    parser.add_argument(
        '--method', '-m',
        choices=['regular', 'selenium', 'both'],
        default='both',
        help='Launch method: regular Firefox, Selenium, or both (default: both)'
    )
    
    parser.add_argument(
        '--profile', '-p',
        default='meijer_automation',
        help='Firefox profile name to use (default: meijer_automation)'
    )
    
    parser.add_argument(
        '--base-dir',
        help='Base directory for profiles (defaults to ~/.mozilla/firefox/profiles)'
    )
    
    parser.add_argument(
        '--proxy',
        default='127.0.0.1:8080',
        help='Proxy in format host:port (default: 127.0.0.1:8080)'
    )
    
    parser.add_argument(
        '--list', '-l',
        action='store_true',
        help='List available profiles and exit'
    )
    
    parser.add_argument(
        '--headless',
        action='store_true',
        help='Run Selenium in headless mode'
    )
    
    parser.add_argument(
        '--username',
        help='Username for Selenium authentication (optional)'
    )
    
    parser.add_argument(
        '--password',
        help='Password for Selenium authentication (optional)'
    )
    
    args = parser.parse_args()
    
    # Parse proxy settings
    try:
        proxy_host, proxy_port_str = args.proxy.split(':')
        proxy_port = int(proxy_port_str)
    except ValueError:
        print(f"❌ Invalid proxy format: {args.proxy}. Use host:port format.")
        sys.exit(1)
    
    # List profiles if requested
    if args.list:
        list_available_profiles(args.base_dir)
        return
    
    # Launch Firefox using dual path
    success = launch_dual_path(
        profile_name=args.profile,
        base_dir=args.base_dir,
        proxy_host=proxy_host,
        proxy_port=proxy_port,
        method=args.method
    )
    
    if success:
        print("\n✅ Browser launch completed!")
        print("\n💡 Key Benefits:")
        print("  • Both methods use the SAME profile - authentication state is shared")
        print("  • Regular Firefox: Manual testing and demonstration")
        print("  • Selenium Firefox: Automation and development")
        print("  • Proxy settings: 127.0.0.1:8080 for mitmproxy debugging")
        print("\n🔧 Usage Tips:")
        print("  • Use --method regular for quick manual testing")
        print("  • Use --method selenium for automation development")
        print("  • Use --method both to compare both approaches")
        print("  • Use --list to see available profiles")
    else:
        print("\n❌ Browser launch failed")
        sys.exit(1)


if __name__ == "__main__":
    main()
