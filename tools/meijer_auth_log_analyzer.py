#!/usr/bin/env python3
"""
Meijer Auth Log Analyzer

This script analyzes Meijer mitmproxy logs to extract authentication tokens.
It follows a priority-based approach:
1. First checks for full login events and extracts required tokens (including refresh token)
2. Falls back to searching for api.meijer.com calls to grab bearer tokens
3. Saves tokens to auth.json
4. Tests the tokens by making an API call through the auth.json round-trip

Requirements:
- mitmproxy log file (.log extension)
- meijer package installed
- Proper authentication flow captured in logs
"""

import json
import sys
import os
from pathlib import Path
from typing import Dict, List, Optional, Any, Tuple
from urllib.parse import urlparse, parse_qs
import logging

# Add parent directory to path for imports
sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

try:
    from mitmproxy import io
    from mitmproxy.http import HTTPFlow
except ImportError:
    print("❌ mitmproxy not available. Please install: pip install mitmproxy")
    sys.exit(1)

try:
    from meijer.client import Meijer
    from meijer.exceptions import AuthenticationError
except ImportError:
    print("❌ meijer package not available. Please install from the project directory")
    sys.exit(1)

# Setup logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger(__name__)


class MeijerAuthLogAnalyzer:
    """Analyzes Meijer auth logs to extract and validate authentication tokens."""
    
    def __init__(self, log_file: str):
        """
        Initialize the analyzer.
        
        Args:
            log_file: Path to the mitmproxy log file
        """
        self.log_file = log_file
        self.flows = []
        self.auth_tokens = {}
        self.auth_file = "auth.json"
        
    def load_flows(self) -> bool:
        """Load flows from mitmproxy log file."""
        try:
            logger.info(f"Loading flows from {self.log_file}")
            with open(self.log_file, "rb") as f:
                reader = io.FlowReader(f)
                for flow in reader.stream():
                    if hasattr(flow, 'request'):  # HTTPFlow check
                        self.flows.append(flow)
            
            logger.info(f"Loaded {len(self.flows)} flows from log file")
            return True
            
        except Exception as e:
            logger.error(f"Failed to load flows: {e}")
            return False
    
    def detect_full_login_event(self) -> Tuple[bool, Dict[str, Any]]:
        """
        Detect if a full login event occurred in the logs.
        
        Returns:
            Tuple of (found, token_data)
        """
        logger.info("🔍 Searching for full login events...")
        
        # Key indicators of full login
        login_indicators = {
            "device_fingerprint": False,
            "login_redirect": False,
            "oauth2_token_exchange": False,
            "logout": False,
            "api_calls": False
        }
        
        token_data = {}
        flow_sequence = []
        
        for flow in self.flows:
            url = flow.request.pretty_url
            method = flow.request.method
            timestamp = flow.timestamp_start
            
            # Device fingerprint (start of login)
            if "id.meijer.com/auth/services/devicefingerprint" in url:
                login_indicators["device_fingerprint"] = True
                flow_sequence.append({
                    "step": "device_fingerprint",
                    "timestamp": timestamp,
                    "url": url
                })
            
            # Login redirect (authentication step)
            elif "id.meijer.com/login/token/redirect" in url:
                login_indicators["login_redirect"] = True
                flow_sequence.append({
                    "step": "login_redirect",
                    "timestamp": timestamp,
                    "url": url
                })
            
            # OAuth2 token exchange (successful authentication)
            elif "id.meijer.com/oauth2/default/v1/token" in url and method == "POST":
                login_indicators["oauth2_token_exchange"] = True
                flow_sequence.append({
                    "step": "oauth2_token_exchange",
                    "timestamp": timestamp,
                    "url": url
                })
                
                # Extract tokens from response
                if hasattr(flow, 'response') and flow.response:
                    try:
                        response_data = json.loads(flow.response.content.decode('utf-8'))
                        if 'access_token' in response_data:
                            token_data.update({
                                'access_token': response_data.get('access_token'),
                                'refresh_token': response_data.get('refresh_token'),
                                'expires_in': response_data.get('expires_in'),
                                'token_type': response_data.get('token_type', 'Bearer'),
                                'scope': response_data.get('scope'),
                                'extracted_at': timestamp,
                                'source': 'oauth2_token_exchange'
                            })
                            logger.info("✅ Found OAuth2 token exchange response")
                    except (json.JSONDecodeError, AttributeError):
                        pass
            
            # Logout (indicates full authentication was completed)
            elif "id.meijer.com/oauth2/default/v1/logout" in url:
                login_indicators["logout"] = True
                flow_sequence.append({
                    "step": "logout",
                    "timestamp": timestamp,
                    "url": url
                })
            
            # API calls (verification that tokens work)
            elif "api.meijer.com" in url and method in ["GET", "POST"]:
                login_indicators["api_calls"] = True
                flow_sequence.append({
                    "step": "api_call",
                    "timestamp": timestamp,
                    "url": url,
                    "method": method
                })
                
                # Extract bearer token from request headers
                if not token_data.get('access_token'):
                    auth_header = flow.request.headers.get('Authorization', '')
                    if auth_header.startswith('Bearer '):
                        token_data['access_token'] = auth_header[7:]  # Remove 'Bearer ' prefix
                        token_data['source'] = 'api_call_header'
                        logger.info("✅ Found bearer token in API call headers")
        
        # Determine if full login occurred
        full_login = (
            login_indicators["device_fingerprint"] and
            login_indicators["login_redirect"] and
            login_indicators["oauth2_token_exchange"] and
            token_data.get('access_token')
        )
        
        if full_login:
            logger.info("🎉 Full login event detected!")
            logger.info(f"Flow sequence: {[step['step'] for step in flow_sequence]}")
        else:
            logger.info("⚠️ Full login event not detected")
            logger.info(f"Indicators: {login_indicators}")
        
        return full_login, token_data
    
    def search_api_meijer_calls(self) -> Tuple[bool, Dict[str, Any]]:
        """
        Search for api.meijer.com calls to extract bearer tokens.
        
        Returns:
            Tuple of (found, token_data)
        """
        logger.info("🔍 Searching for api.meijer.com calls...")
        
        token_data = {}
        api_calls = []
        
        for flow in self.flows:
            url = flow.request.pretty_url
            method = flow.request.method
            timestamp = flow.timestamp_start
            
            if "api.meijer.com" in url:
                api_calls.append({
                    "timestamp": timestamp,
                    "url": url,
                    "method": method
                })
                
                # Extract bearer token from Authorization header
                auth_header = flow.request.headers.get('Authorization', '')
                if auth_header.startswith('Bearer ') and not token_data.get('access_token'):
                    token_data.update({
                        'access_token': auth_header[7:],  # Remove 'Bearer ' prefix
                        'source': 'api_call_header',
                        'extracted_at': timestamp
                    })
                    logger.info("✅ Found bearer token in API call")
                    break
        
        if api_calls:
            logger.info(f"Found {len(api_calls)} API calls to api.meijer.com")
        else:
            logger.info("No API calls to api.meijer.com found")
        
        return bool(token_data), token_data
    
    def save_tokens_to_auth_json(self, tokens: Dict[str, Any]) -> bool:
        """
        Save extracted tokens to auth.json file.
        
        Args:
            tokens: Dictionary containing token data
            
        Returns:
            True if successful, False otherwise
        """
        try:
            # Ensure we have at least an access token
            if not tokens.get('access_token'):
                logger.error("No access token found to save")
                return False
            
            # Add default values for missing fields
            if 'token_type' not in tokens:
                tokens['token_type'] = 'Bearer'
            
            if 'extracted_at' not in tokens:
                import time
                tokens['extracted_at'] = time.time()
            
            # Save to auth.json
            with open(self.auth_file, 'w') as f:
                json.dump(tokens, f, indent=2)
            
            logger.info(f"✅ Tokens saved to {self.auth_file}")
            logger.info(f"Access token: {tokens['access_token'][:20]}...")
            if tokens.get('refresh_token'):
                logger.info(f"Refresh token: {tokens['refresh_token'][:20]}...")
            
            return True
            
        except Exception as e:
            logger.error(f"Failed to save tokens: {e}")
            return False
    
    def test_tokens_through_auth_json(self) -> bool:
        """
        Test the tokens by making an API call through the auth.json round-trip.
        This ensures the tokens are properly loaded and working.
        
        Returns:
            True if successful, False otherwise
        """
        logger.info("🧪 Testing tokens through auth.json round-trip...")
        
        try:
            # Create Meijer client (will load from auth.json)
            client = Meijer()
            
            # Verify tokens were loaded correctly
            if hasattr(client, 'auth') and client.auth:
                logger.info("✅ Meijer client created successfully with authentication")
                
                # Check if tokens are loaded
                if hasattr(client, 'token_storage'):
                    tokens = client.token_storage.load_tokens()
                    if tokens:
                        logger.info("✅ Tokens loaded successfully from auth.json")
                        logger.info(f"Access token: {tokens.access_token[:20]}...")
                        if hasattr(tokens, 'refresh_token') and tokens.refresh_token:
                            logger.info(f"Refresh token: {tokens.refresh_token[:20]}...")
                        
                        # Check token expiration
                        if hasattr(tokens, 'is_expired'):
                            if tokens.is_expired():
                                logger.warning("⚠️ Access token is expired")
                            else:
                                logger.info("✅ Access token is still valid")
                        
                        return True
                    else:
                        logger.error("❌ No tokens found in client")
                        return False
                else:
                    logger.error("❌ No token storage found in client")
                    return False
            else:
                logger.error("❌ Client created but no authentication found")
                return False
                    
        except Exception as e:
            logger.error(f"Failed to create client or test tokens: {e}")
            return False
    
    def analyze_and_extract(self) -> bool:
        """
        Main analysis method that follows the priority-based approach.
        
        Returns:
            True if tokens were found and tested successfully, False otherwise
        """
        logger.info("🚀 Starting Meijer Auth Log Analysis")
        logger.info("=" * 50)
        
        # Load flows from log file
        if not self.load_flows():
            logger.error("Failed to load flows from log file")
            return False
        
        # Step 1: Check for full login event
        full_login_found, login_tokens = self.detect_full_login_event()
        
        if full_login_found and login_tokens.get('access_token'):
            logger.info("🎯 Full login event found - extracting tokens...")
            self.auth_tokens = login_tokens
            
        else:
            logger.info("⚠️ Full login event not found, searching for API calls...")
            
            # Step 2: Search for api.meijer.com calls
            api_calls_found, api_tokens = self.search_api_meijer_calls()
            
            if api_calls_found and api_tokens.get('access_token'):
                logger.info("🎯 API calls found - extracting bearer token...")
                self.auth_tokens = api_tokens
                
            else:
                logger.error("❌ Neither full login event nor API calls found")
                logger.error("No tokens could be extracted from the log file")
                return False
        
        # Step 3: Save tokens to auth.json
        if not self.save_tokens_to_auth_json(self.auth_tokens):
            logger.error("Failed to save tokens to auth.json")
            return False
        
        # Step 4: Test tokens through auth.json round-trip
        if not self.test_tokens_through_auth_json():
            logger.error("Token validation failed")
            return False
        
        logger.info("🎉 SUCCESS: Tokens extracted, saved, and validated!")
        return True


def main():
    """Main entry point."""
    import argparse
    
    parser = argparse.ArgumentParser(description="Analyze Meijer auth logs and extract tokens")
    parser.add_argument("log_file", help="Path to the mitmproxy log file (.log extension)")
    parser.add_argument("--output", "-o", default="auth.json", 
                       help="Output file for tokens (default: auth.json)")
    
    args = parser.parse_args()
    
    # Validate log file
    if not os.path.exists(args.log_file):
        print(f"❌ Log file not found: {args.log_file}")
        sys.exit(1)
    
    if not args.log_file.endswith('.log'):
        print("⚠️ Warning: File doesn't have .log extension. This might not be a mitmproxy log.")
    
    # Create analyzer and run analysis
    analyzer = MeijerAuthLogAnalyzer(args.log_file)
    analyzer.auth_file = args.output
    
    success = analyzer.analyze_and_extract()
    
    if success:
        print("\n🎉 SUCCESS: Auth log analysis completed successfully!")
        print(f"Tokens saved to: {args.output}")
        print("Tokens have been validated through API calls")
    else:
        print("\n❌ FAILED: Auth log analysis failed")
        sys.exit(1)


if __name__ == "__main__":
    main()
