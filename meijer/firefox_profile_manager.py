#!/usr/bin/env python3
"""
Firefox Profile Manager for Selenium Authentication

This module provides Firefox profile management capabilities that allow:
1. Creating and managing persistent Firefox profiles
2. Sharing profiles between Selenium automation and regular Firefox
3. Maintaining login sessions and cookies across browser sessions
4. Configuring proxy settings and other preferences

Author: Claude Sonnet 4 (claude-3-5-sonnet-20241022)
Generated via Cursor IDE (cursor.sh) with AI assistance
Model: Anthropic Claude 3.5 Sonnet
Generation timestamp: 2024-12-19
Context: Firefox profile management for persistent authentication sessions
"""

import os
import shutil
import logging
from pathlib import Path
from typing import Optional, Dict, Any
from selenium.webdriver.firefox.options import Options
from selenium.webdriver.firefox.firefox_profile import FirefoxProfile

logger = logging.getLogger(__name__)


class FirefoxProfileManager:
    """
    Manages Firefox profiles for persistent authentication sessions.
    
    This class handles creating, configuring, and managing Firefox profiles
    that can be shared between Selenium automation and regular Firefox browser.
    """
    
    def __init__(self, profile_name: str = "meijer_automation", base_dir: Optional[str] = None):
        """
        Initialize the Firefox profile manager.
        
        Args:
            profile_name: Name of the profile directory
            base_dir: Base directory for profiles (defaults to ~/.mozilla/firefox/profiles)
        """
        self.profile_name = profile_name
        
        # Determine base directory for profiles
        if base_dir:
            self.base_dir = Path(base_dir)
        else:
            # Use standard Firefox profile location
            home_dir = Path.home()
            self.base_dir = home_dir / ".mozilla" / "firefox" / "profiles"
        
        # Profile directory path
        self.profile_dir = self.base_dir / profile_name
        
        # Ensure base directory exists
        self.base_dir.mkdir(parents=True, exist_ok=True)
        
        logger.info(f"Firefox Profile Manager initialized for profile: {self.profile_name}")
        logger.info(f"Profile directory: {self.profile_dir}")
    
    def create_profile(self, force: bool = False) -> bool:
        """
        Create a new Firefox profile directory.
        
        Args:
            force: If True, overwrite existing profile
            
        Returns:
            True if profile was created successfully
        """
        try:
            if self.profile_dir.exists():
                if force:
                    logger.info(f"Removing existing profile: {self.profile_dir}")
                    shutil.rmtree(self.profile_dir)
                else:
                    logger.info(f"Profile already exists: {self.profile_dir}")
                    return True
            
            # Create profile directory
            self.profile_dir.mkdir(parents=True, exist_ok=True)
            
            # Create essential subdirectories
            (self.profile_dir / "extensions").mkdir(exist_ok=True)
            (self.profile_dir / "chrome").mkdir(exist_ok=True)
            (self.profile_dir / "storage").mkdir(exist_ok=True)
            (self.profile_dir / "cookies.sqlite").touch()
            
            logger.info(f"Firefox profile created successfully: {self.profile_dir}")
            return True
            
        except Exception as e:
            logger.error(f"Failed to create Firefox profile: {e}")
            return False
    
    def get_profile_path(self) -> str:
        """Get the absolute path to the profile directory."""
        return str(self.profile_dir.absolute())
    
    def profile_exists(self) -> bool:
        """Check if the profile directory exists."""
        return self.profile_dir.exists()
    
    def get_profile_size(self) -> int:
        """Get the size of the profile directory in bytes."""
        if not self.profile_dir.exists():
            return 0
        
        total_size = 0
        for dirpath, dirnames, filenames in os.walk(self.profile_dir):
            for filename in filenames:
                filepath = os.path.join(dirpath, filename)
                if os.path.exists(filepath):
                    total_size += os.path.getsize(filepath)
        return total_size
    
    def configure_selenium_options(self, options: Options, proxy_host: Optional[str] = None, 
                                 proxy_port: Optional[int] = None) -> Options:
        """
        Configure Selenium Firefox options to use this profile.
        
        Args:
            options: Firefox Options object to configure
            proxy_host: Proxy host for mitmproxy
            proxy_port: Proxy port for mitmproxy
            
        Returns:
            Configured Options object
        """
        # Set profile directory
        options.set_preference("profile", self.get_profile_path())
        
        # Essential preferences for automation
        options.set_preference("dom.webdriver.enabled", False)
        options.set_preference("useAutomationExtension", False)
        options.set_preference("general.useragent.override", 
                             "Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0")
        
        # Performance optimizations
        options.set_preference("permissions.default.image", 2)  # Disable images
        options.set_preference("permissions.default.stylesheet", 2)  # Disable CSS
        options.set_preference("javascript.enabled", True)
        
        # Disable unnecessary features
        options.set_preference("browser.download.folderList", 2)
        options.set_preference("browser.download.manager.showWhenStarting", False)
        options.set_preference("browser.helperApps.neverAsk.saveToDisk", "application/pdf")
        
        # Configure proxy if specified
        if proxy_host and proxy_port:
            logger.info(f"Configuring proxy: {proxy_host}:{proxy_port}")
            options.set_preference("network.proxy.type", 1)  # Manual proxy
            options.set_preference("network.proxy.http", proxy_host)
            options.set_preference("network.proxy.http_port", proxy_port)
            options.set_preference("network.proxy.ssl", proxy_host)
            options.set_preference("network.proxy.ssl_port", proxy_port)
            options.set_preference("network.proxy.share_proxy_settings", True)
            
            # Handle mitmproxy certificate issues
            options.set_preference("security.cert_verification.enabled", False)
            options.set_preference("security.enterprise_roots.enabled", True)
        
        # Additional preferences for better automation
        options.set_preference("browser.cache.disk.enable", False)
        options.set_preference("browser.cache.memory.enable", False)
        options.set_preference("browser.cache.offline.enable", False)
        options.set_preference("network.http.use-cache", False)
        
        logger.info("Firefox options configured for profile-based automation")
        return options
    
    def create_firefox_profile_object(self, proxy_host: Optional[str] = None, 
                                    proxy_port: Optional[int] = None) -> FirefoxProfile:
        """
        Create a FirefoxProfile object configured for this profile directory.
        
        Args:
            proxy_host: Proxy host for mitmproxy
            proxy_port: Proxy port for mitmproxy
            
        Returns:
            Configured FirefoxProfile object
        """
        profile = FirefoxProfile(self.get_profile_path())
        
        # Set proxy preferences if specified
        if proxy_host and proxy_port:
            profile.set_preference("network.proxy.type", 1)
            profile.set_preference("network.proxy.http", proxy_host)
            profile.set_preference("network.proxy.http_port", proxy_port)
            profile.set_preference("network.proxy.ssl", proxy_host)
            profile.set_preference("network.proxy.ssl_port", proxy_port)
            profile.set_preference("network.proxy.share_proxy_settings", True)
            
            # Handle mitmproxy certificate issues
            profile.set_preference("security.cert_verification.enabled", False)
            profile.set_preference("security.enterprise_roots.enabled", True)
        
        # Set other essential preferences
        profile.set_preference("dom.webdriver.enabled", False)
        profile.set_preference("useAutomationExtension", False)
        
        logger.info("FirefoxProfile object created and configured")
        return profile
    
    def backup_profile(self, backup_name: Optional[str] = None) -> Optional[str]:
        """
        Create a backup of the current profile.
        
        Args:
            backup_name: Name for the backup (defaults to profile_name_timestamp)
            
        Returns:
            Path to backup directory if successful, None otherwise
        """
        if not self.profile_exists():
            logger.warning("Cannot backup non-existent profile")
            return None
        
        try:
            if not backup_name:
                import time
                timestamp = int(time.time())
                backup_name = f"{self.profile_name}_backup_{timestamp}"
            
            backup_dir = self.base_dir / backup_name
            
            if backup_dir.exists():
                shutil.rmtree(backup_dir)
            
            shutil.copytree(self.profile_dir, backup_dir)
            logger.info(f"Profile backed up to: {backup_dir}")
            return str(backup_dir)
            
        except Exception as e:
            logger.error(f"Failed to backup profile: {e}")
            return None
    
    def restore_profile(self, backup_path: str) -> bool:
        """
        Restore profile from a backup.
        
        Args:
            backup_path: Path to backup directory
            
        Returns:
            True if restore was successful
        """
        try:
            backup_dir = Path(backup_path)
            if not backup_dir.exists():
                logger.error(f"Backup directory does not exist: {backup_path}")
                return False
            
            # Remove existing profile if it exists
            if self.profile_dir.exists():
                shutil.rmtree(self.profile_dir)
            
            # Restore from backup
            shutil.copytree(backup_dir, self.profile_dir)
            logger.info(f"Profile restored from backup: {backup_path}")
            return True
            
        except Exception as e:
            logger.error(f"Failed to restore profile: {e}")
            return False
    
    def clean_profile(self) -> bool:
        """
        Clean the profile by removing temporary files and caches.
        
        Returns:
            True if cleaning was successful
        """
        try:
            if not self.profile_exists():
                return True
            
            # Files and directories to remove
            items_to_remove = [
                "Cache", "cache2", "startupCache", "thumbnails",
                "crashes", "minidumps", "sessionstore-backups"
            ]
            
            for item in items_to_remove:
                item_path = self.profile_dir / item
                if item_path.exists():
                    if item_path.is_file():
                        item_path.unlink()
                    else:
                        shutil.rmtree(item_path)
            
            logger.info("Profile cleaned successfully")
            return True
            
        except Exception as e:
            logger.error(f"Failed to clean profile: {e}")
            return False
    
    def get_profile_info(self) -> Dict[str, Any]:
        """
        Get information about the profile.
        
        Returns:
            Dictionary containing profile information
        """
        info = {
            "profile_name": self.profile_name,
            "profile_path": str(self.profile_dir),
            "exists": self.profile_exists(),
            "size_bytes": self.get_profile_size(),
            "base_directory": str(self.base_dir)
        }
        
        if self.profile_exists():
            info["size_mb"] = round(self.get_profile_size() / (1024 * 1024), 2)
            
            # Check for key files
            key_files = ["cookies.sqlite", "places.sqlite", "logins.json"]
            for file_name in key_files:
                file_path = self.profile_dir / file_name
                info[f"has_{file_name}"] = file_path.exists()
        
        return info
    
    def launch_regular_firefox(self) -> bool:
        """
        Launch regular Firefox using this profile.
        
        Returns:
            True if Firefox was launched successfully
        """
        try:
            import subprocess
            
            # Firefox command with profile
            firefox_cmd = [
                "firefox",
                "--profile", self.get_profile_path(),
                "--new-window"
            ]
            
            # Launch Firefox in background
            subprocess.Popen(firefox_cmd, start_new_session=True)
            logger.info(f"Regular Firefox launched with profile: {self.profile_name}")
            return True
            
        except Exception as e:
            logger.error(f"Failed to launch regular Firefox: {e}")
            return False


def create_meijer_profile(profile_name: str = "meijer_automation", 
                         proxy_host: str = "127.0.0.1", 
                         proxy_port: int = 8080) -> FirefoxProfileManager:
    """
    Convenience function to create a Meijer-specific Firefox profile.
    
    Args:
        profile_name: Name for the profile
        proxy_host: Proxy host for mitmproxy
        proxy_port: Proxy port for mitmproxy
        
    Returns:
        Configured FirefoxProfileManager instance
    """
    manager = FirefoxProfileManager(profile_name)
    
    # Create profile if it doesn't exist
    if not manager.profile_exists():
        manager.create_profile()
    
    logger.info(f"Meijer Firefox profile ready: {profile_name}")
    return manager
