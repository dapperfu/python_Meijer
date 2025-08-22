#!/usr/bin/env python3
"""
Enhanced Header Spoofing for Meijer App

This module provides comprehensive header spoofing based on actual workflow analysis
from mitmproxy logs to make requests appear 100% like the Meijer mobile app.

Based on analysis of:
- Complete logout events
- Complete login events  
- Cart operations (pickup/delivery vs shop'n'scan)
- Shop'n'scan workflow creation
- Item operations (PLU 384, eggs scanning, quantity increments)
"""

import random
import time
from dataclasses import dataclass
from typing import Dict, List, Optional, Any
from datetime import datetime

import requests


@dataclass
class MeijerAppProfile:
    """Complete Meijer app profile for header spoofing."""
    
    # Core app identifiers
    app_version: str = "102800000"
    app_name: str = "Meijer"
    platform: str = "android"
    android_version: str = "10"
    device_model: str = "One Build/QQ3A.200705.002"
    
    # HTTP client details
    http_client: str = "okhttp/5.1.0"
    dalvik_version: str = "Dalvik/2.1.0"
    
    # WebView details (for embedded web content)
    webview_user_agent: str = "Mozilla/5.0 (Linux; Android 10; One Build/QQ3A.200705.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/81.0.4044.138 Mobile Safari/537.36"
    
    # Google Play Services (for ads and analytics)
    gms_user_agent: str = "com.google.android.gms/253133009 (Linux; U; Android 10; en_US; One; Build/QQ3A.200705.002; Cronet/140.0.7259.0) grpc-java-cronet/1.75.0-SNAPSHOT"


class EnhancedMeijerHeaderSpoofer:
    """Enhanced header spoofing for Meijer app workflows."""
    
    def __init__(self):
        self.app_profile = MeijerAppProfile()
        self.session_headers = {}
        self.workflow_context = {}
        self.request_count = 0
        self.session_start_time = time.time()
        
        # Initialize session headers
        self._initialize_session_headers()
        
    def _initialize_session_headers(self):
        """Initialize the base session headers."""
        self.session_headers = {
            # Core Meijer app headers
            "User-Agent": f"{self.app_profile.app_name}/{self.app_profile.app_version} {self.app_profile.http_client} {self.app_profile.dalvik_version} (Linux; U; Android {self.app_profile.android_version}; {self.app_profile.device_model})",
            
            # Standard mobile app headers
            "Accept": "application/json",
            "Accept-Language": "en-US,en;q=0.9",
            "Accept-Encoding": "gzip, deflate, br",
            "Content-Type": "application/json",
            
            # Mobile-specific headers
            "X-Requested-With": "com.meijer.mobile.meijer",
            "X-Meijer-App-Version": self.app_profile.app_version,
            "X-Meijer-Platform": self.app_profile.platform,
            "X-Meijer-Client": "mobile-app",
            
            # Connection headers
            "Connection": "keep-alive",
            "Keep-Alive": "timeout=5, max=1000",
            
            # Security headers
            "DNT": "1",
            "Upgrade-Insecure-Requests": "1",
        }
        
    def get_headers_for_workflow(self, workflow_type: str, **kwargs) -> Dict[str, str]:
        """
        Get headers optimized for a specific workflow type.
        
        Args:
            workflow_type: Type of workflow (login, logout, cart, shop_scan, item_operation)
            **kwargs: Additional context (store_id, item_id, etc.)
            
        Returns:
            Dictionary of headers optimized for the workflow
        """
        headers = self.session_headers.copy()
        
        # Workflow-specific header customizations
        if workflow_type == "login":
            headers.update(self._get_login_headers(**kwargs))
        elif workflow_type == "logout":
            headers.update(self._get_logout_headers(**kwargs))
        elif workflow_type == "cart_operation":
            headers.update(self._get_cart_headers(**kwargs))
        elif workflow_type == "shop_scan":
            headers.update(self._get_shop_scan_headers(**kwargs))
        elif workflow_type == "item_operation":
            headers.update(self._get_item_operation_headers(**kwargs))
        elif workflow_type == "fulfillment":
            headers.update(self._get_fulfillment_headers(**kwargs))
            
        # Add dynamic headers
        self._add_dynamic_headers(headers, workflow_type, **kwargs)
        
        # Update request count
        self.request_count += 1
        
        return headers
        
    def _get_login_headers(self, **kwargs) -> Dict[str, str]:
        """Get headers optimized for login workflows."""
        return {
            "Content-Type": "application/x-www-form-urlencoded",
            "Accept": "application/json, text/plain, */*",
            "X-ACF-Sensor-Data": self._generate_sensor_data(),
            "Origin": "https://id.meijer.com",
            "Referer": "https://id.meijer.com/",
        }
        
    def _get_logout_headers(self, **kwargs) -> Dict[str, str]:
        """Get headers optimized for logout workflows."""
        return {
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "Content-Type": "application/x-www-form-urlencoded",
            "Origin": "https://id.meijer.com",
            "Referer": "https://id.meijer.com/",
        }
        
    def _get_cart_headers(self, **kwargs) -> Dict[str, str]:
        """Get headers optimized for cart operations."""
        store_id = kwargs.get("store_id", "20")  # Default store ID
        
        return {
            "Accept": "application/json",
            "Content-Type": "application/json",
            "X-Meijer-Store": store_id,
            "Origin": "https://www.meijer.com",
            "Referer": f"https://www.meijer.com/shopping/cart",
        }
        
    def _get_shop_scan_headers(self, **kwargs) -> Dict[str, str]:
        """Get headers optimized for shop & scan workflows."""
        store_id = kwargs.get("store_id", "20")
        
        return {
            "Accept": "application/json",
            "Content-Type": "application/json",
            "X-Meijer-Store": store_id,
            "X-Meijer-Workflow": "shop_scan",
            "Origin": "https://www.meijer.com",
            "Referer": f"https://www.meijer.com/shop-and-scan",
        }
        
    def _get_item_operation_headers(self, **kwargs) -> Dict[str, str]:
        """Get headers optimized for item operations."""
        store_id = kwargs.get("store_id", "20")
        item_type = kwargs.get("item_type", "product")
        
        return {
            "Accept": "application/json",
            "Content-Type": "application/json",
            "X-Meijer-Store": store_id,
            "X-Meijer-Item-Type": item_type,
            "Origin": "https://www.meijer.com",
            "Referer": f"https://www.meijer.com/products",
        }
        
    def _get_fulfillment_headers(self, **kwargs) -> Dict[str, str]:
        """Get headers optimized for fulfillment operations."""
        store_id = kwargs.get("store_id", "20")
        fulfillment_type = kwargs.get("fulfillment_type", "pickup")
        
        return {
            "Accept": "application/json",
            "Content-Type": "application/json",
            "X-Meijer-Store": store_id,
            "X-Meijer-Fulfillment": fulfillment_type,
            "Origin": "https://www.meijer.com",
            "Referer": f"https://www.meijer.com/fulfillment/{fulfillment_type}",
        }
        
    def _add_dynamic_headers(self, headers: Dict[str, str], workflow_type: str, **kwargs):
        """Add dynamic headers based on context."""
        # Add timestamp-based headers
        current_time = int(time.time() * 1000)
        headers["X-Meijer-Timestamp"] = str(current_time)
        headers["X-Meijer-Request-ID"] = f"{current_time}_{self.request_count}"
        
        # Add session-based headers
        if hasattr(self, 'session_id'):
            headers["X-Meijer-Session"] = self.session_id
            
        # Add location headers if available
        if kwargs.get("latitude") and kwargs.get("longitude"):
            headers["X-Meijer-Location"] = f"{kwargs['latitude']},{kwargs['longitude']}"
            
        # Add device-specific headers
        headers["X-Meijer-Device-Model"] = self.app_profile.device_model
        headers["X-Meijer-Android-Version"] = self.app_profile.android_version
        
        # Add workflow sequence headers
        if workflow_type in self.workflow_context:
            sequence_number = self.workflow_context[workflow_type].get("sequence", 0) + 1
            self.workflow_context[workflow_type]["sequence"] = sequence_number
            headers["X-Meijer-Sequence"] = str(sequence_number)
        else:
            self.workflow_context[workflow_type] = {"sequence": 1}
            headers["X-Meijer-Sequence"] = "1"
            
    def _generate_sensor_data(self) -> str:
        """Generate realistic sensor data for Akamai bypass."""
        # This is a placeholder - in real usage, you'd extract actual sensor data
        # from successful requests in the logs
        return "3,a,Ma3MHa89I03VOihlCLFGOv7CuasvECcxBJIeSIu5ho9Fh03mo9mdZNPENDaL/Via7TBVMIdIH8zzSYEg/pPJMBE3o2CkmRReIiL0J59RXxonEuF4zsKpc0tA4ctIB0SkBn2HtXnTXooUscYQDmMvbY1SCqyJfPpeLEX4jCugzgQ="
        
    def create_workflow_session(self, workflow_type: str, **kwargs) -> requests.Session:
        """
        Create a requests session optimized for a specific workflow.
        
        Args:
            workflow_type: Type of workflow
            **kwargs: Additional context parameters
            
        Returns:
            Configured requests.Session
        """
        session = requests.Session()
        
        # Apply workflow-specific headers
        headers = self.get_headers_for_workflow(workflow_type, **kwargs)
        session.headers.update(headers)
        
        # Add session-level configurations
        session.timeout = 30
        session.verify = True
        
        return session
        
    def update_workflow_context(self, workflow_type: str, **kwargs):
        """Update the context for a specific workflow."""
        if workflow_type not in self.workflow_context:
            self.workflow_context[workflow_type] = {}
            
        self.workflow_context[workflow_type].update(kwargs)
        
    def get_webview_headers(self, **kwargs) -> Dict[str, str]:
        """Get headers for embedded web content (WebView)."""
        return {
            "User-Agent": self.app_profile.webview_user_agent,
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
            "Accept-Language": "en-US,en;q=0.9",
            "Accept-Encoding": "gzip, deflate, br",
            "DNT": "1",
            "Upgrade-Insecure-Requests": "1",
            "X-Requested-With": "com.meijer.mobile.meijer",
        }
        
    def get_gms_headers(self, **kwargs) -> Dict[str, str]:
        """Get headers for Google Play Services integration."""
        return {
            "User-Agent": self.app_profile.gms_user_agent,
            "Accept": "application/grpc",
            "Content-Type": "application/grpc",
            "X-Goog-Api-Key": kwargs.get("api_key", ""),
            "X-Goog-Client-Info": f"platform=android;version={self.app_profile.app_version}",
        }
        
    def rotate_user_agent(self):
        """Rotate between different user agent patterns."""
        user_agents = [
            self.session_headers["User-Agent"],  # Main app
            self.app_profile.webview_user_agent,  # WebView
            self.app_profile.gms_user_agent,  # Google Play Services
        ]
        
        self.session_headers["User-Agent"] = random.choice(user_agents)
        
    def get_session_summary(self) -> Dict[str, Any]:
        """Get a summary of the current session state."""
        return {
            "app_profile": {
                "app_version": self.app_profile.app_version,
                "platform": self.app_profile.platform,
                "device_model": self.app_profile.device_model,
                "android_version": self.app_profile.android_version,
            },
            "session_stats": {
                "request_count": self.request_count,
                "session_duration": time.time() - self.session_start_time,
                "active_workflows": list(self.workflow_context.keys()),
            },
            "workflow_context": self.workflow_context,
            "current_headers": self.session_headers.copy(),
        }


# Convenience functions
def create_meijer_session(workflow_type: str, **kwargs) -> requests.Session:
    """Create a Meijer app session for a specific workflow."""
    spoofer = EnhancedMeijerHeaderSpoofer()
    return spoofer.create_workflow_session(workflow_type, **kwargs)


def get_meijer_headers(workflow_type: str, **kwargs) -> Dict[str, str]:
    """Get Meijer app headers for a specific workflow."""
    spoofer = EnhancedMeijerHeaderSpoofer()
    return spoofer.get_headers_for_workflow(workflow_type, **kwargs)


def create_workflow_spoofer() -> EnhancedMeijerHeaderSpoofer:
    """Create a new Meijer header spoofer instance."""
    return EnhancedMeijerHeaderSpoofer()


# Example usage
if __name__ == "__main__":
    print("🔧 Enhanced Meijer Header Spoofer")
    print("=" * 50)
    
    # Create a spoofer instance
    spoofer = create_workflow_spoofer()
    
    # Example: Get headers for different workflows
    workflows = ["login", "cart_operation", "shop_scan", "item_operation"]
    
    for workflow in workflows:
        print(f"\n📱 {workflow.upper()} Headers:")
        headers = spoofer.get_headers_for_workflow(workflow, store_id="20")
        
        for key, value in list(headers.items())[:5]:  # Show first 5 headers
            print(f"  {key}: {value[:60]}{'...' if len(value) > 60 else ''}")
            
    # Show session summary
    print(f"\n📊 Session Summary:")
    summary = spoofer.get_session_summary()
    print(f"  Requests: {summary['session_stats']['request_count']}")
    print(f"  Active Workflows: {', '.join(summary['session_stats']['active_workflows'])}")
    print(f"  App Version: {summary['app_profile']['app_version']}")
    print(f"  Platform: {summary['app_profile']['platform']}")
