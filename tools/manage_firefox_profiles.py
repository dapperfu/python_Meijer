#!/usr/bin/env python3
"""
Firefox Profile Management Utility

Command-line utility for managing Firefox profiles used with Selenium automation.
Provides commands for creating, backing up, restoring, and cleaning profiles.

Author: Claude Sonnet 4 (claude-3-5-sonnet-20241022)
Generated via Cursor IDE (cursor.sh) with AI assistance
Model: Anthropic Claude 3.5 Sonnet
Generation timestamp: 2024-12-19
Context: Command-line utility for Firefox profile management
"""

import argparse
import sys
import os
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from meijer.firefox_profile_manager import FirefoxProfileManager


def list_profiles(base_dir: str = None):
    """List all available Firefox profiles."""
    if base_dir:
        base_path = Path(base_dir)
    else:
        home_dir = Path.home()
        base_path = home_dir / ".mozilla" / "firefox" / "profiles"
    
    if not base_path.exists():
        print(f"No profiles directory found: {base_path}")
        return
    
    print(f"Firefox profiles in: {base_path}")
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
    
    for profile in profiles:
        print(f"📁 {profile['profile_name']}")
        print(f"   Path: {profile['profile_path']}")
        print(f"   Size: {profile.get('size_mb', 0)} MB")
        print(f"   Cookies: {profile.get('has_cookies.sqlite', False)}")
        print(f"   Logins: {profile.get('has_logins.json', False)}")
        print()


def create_profile(profile_name: str, base_dir: str = None, force: bool = False):
    """Create a new Firefox profile."""
    try:
        profile_manager = FirefoxProfileManager(profile_name, base_dir)
        
        if profile_manager.profile_exists() and not force:
            print(f"Profile '{profile_name}' already exists. Use --force to overwrite.")
            return False
        
        success = profile_manager.create_profile(force=force)
        if success:
            print(f"✅ Profile '{profile_name}' created successfully")
            print(f"📁 Location: {profile_manager.get_profile_path()}")
            return True
        else:
            print(f"❌ Failed to create profile '{profile_name}'")
            return False
            
    except Exception as e:
        print(f"❌ Error creating profile: {e}")
        return False


def backup_profile(profile_name: str, backup_name: str = None, base_dir: str = None):
    """Backup a Firefox profile."""
    try:
        profile_manager = FirefoxProfileManager(profile_name, base_dir)
        
        if not profile_manager.profile_exists():
            print(f"Profile '{profile_name}' does not exist")
            return False
        
        backup_path = profile_manager.backup_profile(backup_name)
        if backup_path:
            print(f"✅ Profile '{profile_name}' backed up to: {backup_path}")
            return True
        else:
            print(f"❌ Failed to backup profile '{profile_name}'")
            return False
            
    except Exception as e:
        print(f"❌ Error backing up profile: {e}")
        return False


def restore_profile(profile_name: str, backup_path: str, base_dir: str = None):
    """Restore a Firefox profile from backup."""
    try:
        profile_manager = FirefoxProfileManager(profile_name, base_dir)
        
        success = profile_manager.restore_profile(backup_path)
        if success:
            print(f"✅ Profile '{profile_name}' restored from: {backup_path}")
            return True
        else:
            print(f"❌ Failed to restore profile '{profile_name}'")
            return False
            
    except Exception as e:
        print(f"❌ Error restoring profile: {e}")
        return False


def clean_profile(profile_name: str, base_dir: str = None):
    """Clean a Firefox profile by removing temporary files."""
    try:
        profile_manager = FirefoxProfileManager(profile_name, base_dir)
        
        if not profile_manager.profile_exists():
            print(f"Profile '{profile_name}' does not exist")
            return False
        
        success = profile_manager.clean_profile()
        if success:
            print(f"✅ Profile '{profile_name}' cleaned successfully")
            return True
        else:
            print(f"❌ Failed to clean profile '{profile_name}'")
            return False
            
    except Exception as e:
        print(f"❌ Error cleaning profile: {e}")
        return False


def show_profile_info(profile_name: str, base_dir: str = None):
    """Show detailed information about a Firefox profile."""
    try:
        profile_manager = FirefoxProfileManager(profile_name, base_dir)
        
        if not profile_manager.profile_exists():
            print(f"Profile '{profile_name}' does not exist")
            return False
        
        profile_info = profile_manager.get_profile_info()
        
        print(f"📊 Profile Information: {profile_name}")
        print("-" * 60)
        for key, value in profile_info.items():
            print(f"{key}: {value}")
        
        return True
        
    except Exception as e:
        print(f"❌ Error getting profile info: {e}")
        return False


def launch_firefox(profile_name: str, base_dir: str = None):
    """Launch regular Firefox with a specific profile."""
    try:
        profile_manager = FirefoxProfileManager(profile_name, base_dir)
        
        if not profile_manager.profile_exists():
            print(f"Profile '{profile_name}' does not exist")
            return False
        
        print(f"🚀 Launching Firefox with profile: {profile_name}")
        success = profile_manager.launch_regular_firefox()
        
        if success:
            print(f"✅ Firefox launched successfully with profile: {profile_name}")
            return True
        else:
            print(f"❌ Failed to launch Firefox with profile: {profile_name}")
            return False
            
    except Exception as e:
        print(f"❌ Error launching Firefox: {e}")
        return False


def main():
    """Main function for the command-line interface."""
    parser = argparse.ArgumentParser(
        description="Firefox Profile Management Utility",
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
Examples:
  %(prog)s list                                    # List all profiles
  %(prog)s create meijer_profile                  # Create new profile
  %(prog)s backup meijer_profile                  # Backup profile
  %(prog)s restore meijer_profile /path/to/backup # Restore profile
  %(prog)s clean meijer_profile                   # Clean profile
  %(prog)s info meijer_profile                    # Show profile info
  %(prog)s launch meijer_profile                  # Launch Firefox with profile
        """
    )
    
    parser.add_argument(
        'command',
        choices=['list', 'create', 'backup', 'restore', 'clean', 'info', 'launch'],
        help='Command to execute'
    )
    
    parser.add_argument(
        'profile_name',
        nargs='?',
        help='Name of the profile (required for most commands)'
    )
    
    parser.add_argument(
        '--base-dir',
        help='Base directory for profiles (defaults to ~/.mozilla/firefox/profiles)'
    )
    
    parser.add_argument(
        '--force',
        action='store_true',
        help='Force overwrite when creating profiles'
    )
    
    parser.add_argument(
        '--backup-name',
        help='Name for backup (for backup command)'
    )
    
    parser.add_argument(
        '--backup-path',
        help='Path to backup for restore command'
    )
    
    args = parser.parse_args()
    
    # Execute command
    if args.command == 'list':
        list_profiles(args.base_dir)
    
    elif args.command == 'create':
        if not args.profile_name:
            print("❌ Profile name is required for create command")
            sys.exit(1)
        success = create_profile(args.profile_name, args.base_dir, args.force)
        sys.exit(0 if success else 1)
    
    elif args.command == 'backup':
        if not args.profile_name:
            print("❌ Profile name is required for backup command")
            sys.exit(1)
        success = backup_profile(args.profile_name, args.backup_name, args.base_dir)
        sys.exit(0 if success else 1)
    
    elif args.command == 'restore':
        if not args.profile_name:
            print("❌ Profile name is required for restore command")
            sys.exit(1)
        if not args.backup_path:
            print("❌ Backup path is required for restore command")
            sys.exit(1)
        success = restore_profile(args.profile_name, args.backup_path, args.base_dir)
        sys.exit(0 if success else 1)
    
    elif args.command == 'clean':
        if not args.profile_name:
            print("❌ Profile name is required for clean command")
            sys.exit(1)
        success = clean_profile(args.profile_name, args.base_dir)
        sys.exit(0 if success else 1)
    
    elif args.command == 'info':
        if not args.profile_name:
            print("❌ Profile name is required for info command")
            sys.exit(1)
        success = show_profile_info(args.profile_name, args.base_dir)
        sys.exit(0 if success else 1)
    
    elif args.command == 'launch':
        if not args.profile_name:
            print("❌ Profile name is required for launch command")
            sys.exit(1)
        success = launch_firefox(args.profile_name, args.base_dir)
        sys.exit(0 if success else 1)


if __name__ == "__main__":
    main()
