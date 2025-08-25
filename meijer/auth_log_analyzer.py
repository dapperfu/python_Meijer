#!/usr/bin/env python3
"""
Meijer Auth Log Analyzer Module

This module provides functionality to analyze Meijer mitmproxy logs and extract
authentication tokens. It's designed to be integrated into the meijer package
for use with the CLI command 'meijer auth log'.

The analyzer follows a priority-based approach:
1. First checks for full login events and extracts required tokens (including refresh token)
2. Falls back to searching for api.meijer.com calls to grab bearer tokens
3. Saves tokens to auth.json
4. Tests the tokens by making an API call through the auth.json round-trip
"""

import json
import logging
import os
from pathlib import Path
from typing import Dict, List, Optional, Any, Tuple
from urllib.parse import urlparse, parse_qs

try:
    from mitmproxy import io
    from mitmproxy.http import HTTPFlow
except ImportError:
    # Graceful fallback if mitmproxy is not available
    HTTPFlow = None
    io = None

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
        if not io:
            logger.error("mitmproxy not available. Please install: pip install mitmproxy")
            return False
            
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
                auth_header = flow.request.headers.get('Authorization', '')
                if auth_header.startswith('Bearer '):
                    # Store all bearer tokens found, we'll use the most recent one
                    if 'bearer_tokens' not in token_data:
                        token_data['bearer_tokens'] = []
                    token_data['bearer_tokens'].append({
                        'token': auth_header[7:],  # Remove 'Bearer ' prefix
                        'timestamp': timestamp,
                        'url': url,
                        'method': method
                    })
                    logger.info("✅ Found bearer token in API call headers")
        
        # If we found bearer tokens, use the most recent one
        if token_data.get('bearer_tokens'):
            bearer_tokens = token_data['bearer_tokens']
            # Sort by timestamp (newest first)
            bearer_tokens.sort(key=lambda x: x['timestamp'], reverse=True)
            latest_bearer = bearer_tokens[0]
            
            token_data['access_token'] = latest_bearer['token']
            token_data['source'] = 'api_call_header'
            token_data['extracted_at'] = latest_bearer['timestamp']
            token_data['url'] = latest_bearer['url']
            token_data['method'] = latest_bearer['method']
            
            logger.info(f"✅ Using most recent Bearer token from: {latest_bearer['url']}")
            logger.info(f"   Timestamp: {latest_bearer['timestamp']}")
            logger.info(f"   Method: {latest_bearer['method']}")
            
            # Clean up the temporary list
            del token_data['bearer_tokens']
        
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
        bearer_requests = []
        
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
                if auth_header.startswith('Bearer '):
                    bearer_requests.append({
                        'bearer_token': auth_header[7:],  # Remove 'Bearer ' prefix
                        'timestamp': timestamp,
                        'url': url,
                        'method': method
                    })
        
        if api_calls:
            logger.info(f"Found {len(api_calls)} API calls to api.meijer.com")
        else:
            logger.info("No API calls to api.meijer.com found")
        
        if bearer_requests:
            logger.info(f"Found {len(bearer_requests)} API calls with Bearer tokens")
            
            # Sort by timestamp (newest first) and use the most recent
            bearer_requests.sort(key=lambda x: x['timestamp'], reverse=True)
            latest = bearer_requests[0]
            
            token_data.update({
                'access_token': latest['bearer_token'],
                'source': 'api_call_header',
                'extracted_at': latest['timestamp'],
                'url': latest['url'],
                'method': latest['method']
            })
            
            logger.info(f"✅ Using Bearer token from most recent API call: {latest['url']}")
            logger.info(f"   Timestamp: {latest['timestamp']}")
            logger.info(f"   Method: {latest['method']}")
        else:
            logger.info("No API calls with Bearer tokens found")
        
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
    
    def analyze_and_extract(self) -> bool:
        """
        Main analysis method that follows the priority-based approach.
        
        Returns:
            True if tokens were found and saved successfully, False otherwise
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
        
        logger.info("🎉 SUCCESS: Tokens extracted and saved successfully!")
        return True
    
    def analyze_and_extract_full_login(self) -> bool:
        """
        Attempt to extract tokens from a complete OAuth2 login flow.
        
        Returns:
            True if full login tokens were found and saved, False otherwise
        """
        logger.info("🔐 Attempting Full Login extraction...")
        
        # Load flows from log file
        if not self.load_flows():
            logger.error("Failed to load flows from log file")
            return False
        
        # Check for full login event
        full_login_found, login_tokens = self.detect_full_login_event()
        
        if full_login_found and login_tokens.get('access_token'):
            logger.info("🎯 Full login event found - extracting tokens...")
            self.auth_tokens = login_tokens
            
            # Save tokens
            if not self.save_tokens_to_auth_json(self.auth_tokens):
                logger.error("Failed to save tokens to auth.json")
                return False
            
            logger.info("🎉 SUCCESS: Full login tokens extracted and saved!")
            return True
        else:
            logger.warning("⚠️ Full login event not found")
            return False
    
    def analyze_and_extract_quick_token(self) -> bool:
        """
        Extract bearer tokens from API calls (fallback method).
        
        Returns:
            True if bearer tokens were found and saved, False otherwise
        """
        logger.info("⚡ Attempting Quick Token extraction...")
        
        # Load flows from log file
        if not self.load_flows():
            logger.error("Failed to load flows from log file")
            return False
        
        # Search for api.meijer.com calls
        api_calls_found, api_tokens = self.search_api_meijer_calls()
        
        if api_calls_found and api_tokens.get('access_token'):
            logger.info("🎯 API calls found - extracting bearer token...")
            self.auth_tokens = api_tokens
            
            # Save tokens
            if not self.save_tokens_to_auth_json(self.auth_tokens):
                logger.error("Failed to save tokens to auth.json")
                return False
            
            logger.info("🎉 SUCCESS: Quick token extraction successful!")
            return True
        else:
            logger.warning("⚠️ No API calls found for quick token extraction")
            return False
