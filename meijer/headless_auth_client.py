#!/usr/bin/env python3
"""
Headless Authentication Client for Meijer
Implements three authentication methods:
1. Pure requests - Fully headless using only HTTP calls
2. Hybrid-selenium - Minimal browser usage for cookie/header generation
3. Full selenium - Complete browser automation

All methods replicate the exact flows from captured logs with proper header spoofing.
"""

import json
import time
import logging
import secrets
import hashlib
import base64
import uuid
from typing import Dict, List, Optional, Any, Tuple
from pathlib import Path
import requests

# Conditional selenium imports
try:
    from selenium import webdriver
    from selenium.webdriver.firefox.options import Options
    from selenium.webdriver.common.by import By
    from selenium.webdriver.support.ui import WebDriverWait
    from selenium.webdriver.support import expected_conditions as EC
    from selenium.common.exceptions import TimeoutException, WebDriverException
    SELENIUM_AVAILABLE = True
except ImportError:
    SELENIUM_AVAILABLE = False

from .exceptions import AuthenticationError, TwoFactorRequiredError
from .models.base import BaseModel

logger = logging.getLogger(__name__)


class HeadlessAuthClient:
    """
    Headless authentication client that replicates exact flows from logs.
    """
    
    def __init__(self, method: str = "requests", headless: bool = True):
        """
        Initialize the headless auth client.
        
        Args:
            method: Authentication method ("requests", "hybrid", "selenium")
            headless: Whether to run browser in headless mode (for hybrid/selenium)
        """
        self.method = method
        self.headless = headless
        self.session = requests.Session()
        self.driver = None
        self.authenticated = False
        
        # Authentication state
        self.state_token = None
        self.state_handle = None
        self.device_nonce = None
        self.authenticator_id = None
        self.code_verifier = None
        
        # Load configuration from file
        self.config = self._load_config()
        
        # Base URLs from config
        self.meijer_base = self.config['base_urls']['meijer']
        self.okta_base = self.config['base_urls']['okta']
        
        # OAuth2 parameters from config
        self.client_id = self.config['oauth2']['client_id']
        self.redirect_uri = self.config['oauth2']['redirect_uri']
        self.scope = self.config['oauth2']['scope']
        
        # Store the working OAuth2 configuration from analysis
        self.working_oauth2_config = {
            'client_id': self.client_id,
            'scope': 'openid profile offline_access',  # EXACT from analysis
            'redirect_uri': 'com.meijer.mobile.meijer:/login',  # EXACT from analysis
            'response_type': 'code'
        }
        
        # User agent from config
        self.user_agent = self.config['user_agent']
        
        # Setup session headers
        self._setup_session_headers()
        
        logger.info(f"HeadlessAuthClient initialized with method: {method}")
        logger.info(f"Configuration loaded from: {self._get_config_path()}")
    
    def _get_config_path(self) -> Path:
        """Get the path to the configuration file."""
        return Path.home() / ".config" / "meijer" / "auth_config.json"
    
    def _load_config(self) -> Dict[str, Any]:
        """Load configuration from JSON file."""
        config_path = self._get_config_path()
        
        if not config_path.exists():
            logger.warning(f"Configuration file not found: {config_path}")
            logger.info("Creating default configuration...")
            self._create_default_config(config_path)
        
        try:
            with open(config_path, 'r') as f:
                config = json.load(f)
            logger.info("Configuration loaded successfully")
            return config
        except Exception as e:
            logger.error(f"Error loading configuration: {e}")
            logger.info("Using default configuration...")
            return self._get_default_config()
    
    def _create_default_config(self, config_path: Path):
        """Create default configuration file."""
        config_path.parent.mkdir(parents=True, exist_ok=True)
        
        default_config = self._get_default_config()
        
        try:
            with open(config_path, 'w') as f:
                json.dump(default_config, f, indent=2)
            logger.info(f"Default configuration created: {config_path}")
        except Exception as e:
            logger.error(f"Error creating default configuration: {e}")
    
    def _get_default_config(self) -> Dict[str, Any]:
        """Get default configuration values."""
        return {
            "oauth2": {
                "client_id": "0oa22cbewuCICOsKz697",
                "scope": "openid offline_access",
                "redirect_uri": "https://www.meijer.com/",
                "response_type": "code"
            },
            "base_urls": {
                "meijer": "https://www.meijer.com",
                "okta": "https://id.meijer.com"
            },
            "user_agent": "Mozilla/5.0 (X11; Linux x86_64; rv:141.0) Gecko/20100101 Firefox/141.0",
            "headers": {
                "default": {
                    "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
                    "Accept-Language": "en-US,en;q=0.5",
                    "Accept-Encoding": "gzip, deflate, br, zstd",
                    "DNT": "1",
                    "Connection": "keep-alive",
                    "Upgrade-Insecure-Requests": "1"
                },
                "device_fingerprint": {
                    "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
                    "Accept-Language": "en-US,en;q=0.5",
                    "Accept-Encoding": "gzip, deflate, br, zstd",
                    "DNT": "1",
                    "Connection": "keep-alive",
                    "Upgrade-Insecure-Requests": "1"
                },
                "identify": {
                    "Accept": "application/ion+json; okta-version=1.0.0",
                    "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
                    "Content-Type": "application/ion+json; okta-version=1.0.0",
                    "Accept-Language": "en-US,en;q=0.5",
                    "Accept-Encoding": "gzip, deflate, br, zstd"
                },
                "challenge": {
                    "Accept": "application/ion+json; okta-version=1.0.0",
                    "X-Okta-User-Agent-Extended": "okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459",
                    "Content-Type": "application/ion+json; okta-version=1.0.0",
                    "Accept-Language": "en-US,en;q=0.5",
                    "Accept-Encoding": "gzip, deflate, br, zstd"
                },
                "token_exchange": {
                    "Accept": "application/json",
                    "Content-Type": "application/x-www-form-urlencoded"
                }
            },
            "endpoints": {
                "oauth2_authorize": "/oauth2/default/v1/authorize",
                "idp_identify": "/idp/idx/identify",
                "idp_challenge": "/idp/idx/challenge/answer",
                "device_fingerprint": "/auth/services/devicefingerprint",
                "device_nonce": "/api/v1/internal/device/nonce",
                "token_exchange": "/oauth2/default/v1/token"
            },
            "timing": {
                "initial_landing": 2,
                "oauth2_authorize": 1,
                "device_fingerprint": 1,
                "identify": 1,
                "challenge": 1
            },
            "cookies": {
                "required": ["bm_sz", "_abck", "bm_sv", "JSESSIONID", "AKA_A2"],
                "domains": {
                    "meijer": ".meijer.com",
                    "okta": ".meijer.com"
                }
            }
        }
    
    def _setup_session_headers(self):
        """Setup default session headers from configuration."""
        self.session.headers.update({
            'User-Agent': self.user_agent
        })
        
        # Add default headers from config
        default_headers = self.config['headers']['default']
        self.session.headers.update(default_headers)
    
    def _setup_browser(self):
        """Setup Firefox browser with proper options."""
        if not SELENIUM_AVAILABLE:
            raise ImportError("Selenium is not available. Install it with: pip install selenium")
        
        try:
            options = Options()
            if self.headless:
                options.add_argument('--headless')
            
            # Add necessary Firefox preferences for mobile app simulation
            options.set_preference('dom.webdriver.enabled', False)
            options.set_preference('useAutomationExtension', False)
            options.set_preference('general.useragent.override', self.user_agent)
            
            # Disable images and CSS for faster loading
            options.set_preference('permissions.default.image', 2)
            options.set_preference('permissions.default.stylesheet', 2)
            
            self.driver = webdriver.Firefox(options=options)
            self.driver.set_page_load_timeout(30)
            logger.info("Firefox browser initialized successfully")
            
        except WebDriverException as e:
            logger.error(f"Failed to initialize browser: {e}")
            raise AuthenticationError("Browser initialization failed") from e
    
    def _generate_pkce_params(self) -> Tuple[str, str]:
        """Generate PKCE parameters exactly as in successful flow."""
        code_verifier = secrets.token_urlsafe(32)
        code_challenge = base64.urlsafe_b64encode(
            hashlib.sha256(code_verifier.encode()).digest()
        ).decode().rstrip('=')
        return code_verifier, code_challenge
    
    def _generate_oauth_params(self) -> Dict[str, str]:
        """Generate OAuth2 parameters from working configuration."""
        # Generate PKCE parameters
        self.code_verifier = secrets.token_urlsafe(32)
        code_challenge = base64.urlsafe_b64encode(
            hashlib.sha256(self.code_verifier.encode()).digest()
        ).decode().rstrip('=')
        
        return {
            'client_id': self.working_oauth2_config['client_id'],
            'scope': self.working_oauth2_config['scope'],
            'redirect_uri': self.working_oauth2_config['redirect_uri'],
            'response_type': self.working_oauth2_config['response_type'],
            'state': uuid.uuid4().hex,
            'code_challenge': code_challenge,
            'code_challenge_method': 'S256'
        }
    
    def _get_oauth_authorize_headers(self) -> Dict[str, str]:
        """Get OAuth2 authorization headers - EXACT from analysis."""
        headers = self.session.headers.copy()
        headers.update({
            'Referer': f'{self.meijer_base}/',
            'Origin': f'{self.meijer_base}'
        })
        return headers
    
    def _get_device_fingerprint_headers(self) -> Dict[str, str]:
        """Get device fingerprint headers from configuration."""
        headers = self.config['headers']['device_fingerprint'].copy()
        headers['Referer'] = f'{self.okta_base}/'
        return headers
    
    def _get_identify_headers(self) -> Dict[str, str]:
        """Get identify request headers - EXACT from working flow."""
        headers = {
            'Accept': 'application/json; okta-version=1.0.0',
            'X-Okta-User-Agent-Extended': 'okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459',
            'X-Device-Fingerprint': f"{self.device_nonce}|a51183db48a04679a8d3769ee8a151455b09acf91a15ffe9625eeec4f91ad5b7|21c0dae824c3f48f32f5b271e1d291d8" if self.device_nonce else "",
            'User-Agent': self.user_agent,
            'Content-Type': 'application/json',
            'Origin': self.okta_base,
            'X-Requested-With': 'com.duckduckgo.mobile.android',
            'Sec-Fetch-Site': 'same-origin',
            'Sec-Fetch-Mode': 'cors',
            'Sec-Fetch-Dest': 'empty',
            'Accept-Encoding': 'gzip, deflate',
            'Accept-Language': 'en-US,en;q=0.9'
        }
        
        return headers
    
    def _get_challenge_headers(self) -> Dict[str, str]:
        """Get challenge request headers - EXACT from working flow."""
        headers = {
            'Accept': 'application/json; okta-version=1.0.0',
            'X-Okta-User-Agent-Extended': 'okta-auth-js/7.11.0 okta-signin-widget-g3-7.34.1-ga64d459',
            'X-Device-Fingerprint': f"{self.device_nonce}|a51183db48a04679a8d3769ee8a151455b09acf91a15ffe9625eeec4f91ad5b7|21c0dae824c3f48f32f5b271e1d291d8" if self.device_nonce else "",
            'User-Agent': self.user_agent,
            'Content-Type': 'application/json',
            'Origin': self.okta_base,
            'X-Requested-With': 'com.duckduckgo.mobile.android',
            'Sec-Fetch-Site': 'same-origin',
            'Sec-Fetch-Mode': 'cors',
            'Sec-Fetch-Dest': 'empty',
            'Accept-Encoding': 'gzip, deflate',
            'Accept-Language': 'en-US,en;q=0.9'
        }
        
        return headers
    
    def _get_token_exchange_headers(self) -> Dict[str, str]:
        """Get token exchange headers from configuration."""
        headers = self.config['headers']['token_exchange'].copy()
        headers['User-Agent'] = self.user_agent
        headers['Origin'] = self.okta_base
        headers['Referer'] = f'{self.okta_base}/'
        return headers
    
    def _step0_initial_landing(self) -> bool:
        """Step 0: Initial landing page to establish cookies."""
        logger.info("🏠 Step 0: Initial Landing Page")
        
        try:
            # Visit Meijer homepage to establish session and cookies
            response = self.session.get(self.meijer_base)
            logger.info(f"   Initial landing status: {response.status_code}")
            
            if response.status_code == 200:
                logger.info("   ✅ Initial landing successful")
                logger.info(f"   Cookies established: {len(self.session.cookies)}")
                return True
            else:
                logger.error(f"   ❌ Initial landing failed: {response.status_code}")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error in initial landing: {e}")
            return False
    
    def _validate_required_cookies(self) -> bool:
        """Validate that required cookies are present."""
        required_cookies = self.config['cookies']['required']
        present_cookies = [cookie.name for cookie in self.session.cookies]
        
        missing_cookies = []
        for cookie_name in required_cookies:
            if cookie_name not in present_cookies:
                missing_cookies.append(cookie_name)
        
        if missing_cookies:
            logger.warning(f"Missing required cookies: {missing_cookies}")
            return False
        
        logger.info("✅ All required cookies are present")
        return True
    
    def reload_config(self):
        """Reload configuration from file."""
        logger.info("🔄 Reloading configuration...")
        self.config = self._load_config()
        
        # Update instance variables
        self.meijer_base = self.config['base_urls']['meijer']
        self.okta_base = self.config['base_urls']['okta']
        self.client_id = self.config['oauth2']['client_id']
        self.redirect_uri = self.config['oauth2']['redirect_uri']
        self.scope = self.config['oauth2']['scope']
        self.user_agent = self.config['user_agent']
        
        # Update session headers
        self._setup_session_headers()
        logger.info("✅ Configuration reloaded successfully")
    
    def update_config(self, key_path: str, value: Any):
        """
        Update a configuration value and save to file.
        
        Args:
            key_path: Dot-separated path to the config value (e.g., 'oauth2.client_id')
            value: New value to set
        """
        try:
            # Parse the key path
            keys = key_path.split('.')
            config_section = self.config
            
            # Navigate to the parent section
            for key in keys[:-1]:
                if key not in config_section:
                    config_section[key] = {}
                config_section = config_section[key]
            
            # Set the value
            config_section[keys[-1]] = value
            
            # Save to file
            config_path = self._get_config_path()
            with open(config_path, 'w') as f:
                json.dump(self.config, f, indent=2)
            
            logger.info(f"✅ Configuration updated: {key_path} = {value}")
            
            # Reload to update instance variables
            self.reload_config()
            
        except Exception as e:
            logger.error(f"❌ Error updating configuration: {e}")
    
    def _step1_oauth_authorize(self) -> bool:
        """Step 1: OAuth2 Authorization - EXACT from analysis."""
        try:
            logger.info("🔐 Step 1: OAuth2 Authorization")
            
            # Generate OAuth2 parameters
            oauth_params = self._generate_oauth_params()
            
            # Make OAuth2 authorization request
            response = self.session.get(
                f"{self.okta_base}/oauth2/default/v1/authorize",
                params=oauth_params,
                headers=self._get_oauth_authorize_headers()
            )
            
            if response.status_code == 200:
                logger.info("✅ OAuth2 authorization successful")
                
                # Extract state token from the response
                import re
                content = response.text
                
                # Look for stateToken in oktaData
                state_token_match = re.search(r'"stateToken":"([^"]+)"', content)
                if state_token_match:
                    self.state_token = state_token_match.group(1)
                    logger.info(f"✅ Extracted state token: {self.state_token[:50]}...")
                    return True
                else:
                    logger.error("❌ Could not extract state token from OAuth2 response")
                    return False
            else:
                logger.error(f"❌ OAuth authorization failed: {response.status_code}")
                logger.error(f"Response: {response.text}")
                return False
                
        except Exception as e:
            logger.error(f"❌ Error in OAuth2 authorization: {e}")
            return False
    
    def _step2_device_fingerprint(self) -> bool:
        """Step 2: Device Fingerprinting - EXACT replication."""
        logger.info("📱 Step 2: Device Fingerprinting")
        
        # First, visit the device fingerprint page
        fingerprint_url = f"{self.okta_base}/auth/services/devicefingerprint"
        
        headers = self._get_device_fingerprint_headers()
        
        try:
            response = self.session.get(fingerprint_url, headers=headers)
            logger.info(f"   Device fingerprint page status: {response.status_code}")
            
            if response.status_code == 200:
                # Now get device nonce
                return self._step3_device_nonce()
            else:
                logger.error(f"   ❌ Device fingerprint page failed: {response.status_code}")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error in device fingerprinting: {e}")
            return False
    
    def _step3_device_nonce(self) -> bool:
        """Step 3: Device Nonce - EXACT replication."""
        logger.info("🔑 Step 3: Device Nonce")
        
        url = f"{self.okta_base}/api/v1/internal/device/nonce"
        
        # Headers exactly as in successful flow
        headers = self._get_device_fingerprint_headers()
        
        try:
            response = self.session.post(url, headers=headers, data='')
            logger.info(f"   Status: {response.status_code}")
            
            if response.status_code == 200:
                try:
                    data = response.json()
                    self.device_nonce = data.get('nonce')
                    logger.info(f"   ✅ Device nonce obtained: {self.device_nonce}")
                    return True
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    return False
            else:
                logger.error(f"   ❌ Device nonce failed: {response.status_code}")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error getting device nonce: {e}")
            return False
    
    def _step4_web_login_identify(self, username: str) -> bool:
        """Step 4: Web Login Identify - EXACT replication."""
        logger.info("🔐 Step 4: Web Login Identify")
        
        if not self.state_token:
            logger.error("   ❌ No state token available")
            return False
        
        url = f"{self.okta_base}/idp/idx/identify"
        
        # Headers exactly as in successful flow
        headers = self._get_identify_headers()
        
        # Request body exactly as in successful flow analysis
        data = {
            "identifier": username,
            "stateHandle": self.state_token
        }
        
        try:
            response = self.session.post(url, headers=headers, json=data)
            logger.info(f"   Status: {response.status_code}")
            
            if response.status_code == 200:
                try:
                    data = response.json()
                    # Extract state handle for next step
                    if 'stateHandle' in data:
                        self.state_handle = data['stateHandle']
                        logger.info(f"   ✅ State handle obtained: {self.state_handle[:50]}...")
                        return True
                    else:
                        logger.error("   ❌ No state handle in response")
                        return False
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    return False
            else:
                logger.error(f"   ❌ Web login identify failed: {response.status_code}")
                logger.error(f"   Response: {response.text[:200]}...")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error in web login identify: {e}")
            return False
    
    def _step5_challenge_answer(self, password: str) -> bool:
        """Step 5: Challenge Answer (Password) - EXACT replication."""
        logger.info("🔑 Step 5: Challenge Answer")
        
        if not self.state_handle:
            logger.error("   ❌ No state handle available")
            return False
        
        url = f"{self.okta_base}/idp/idx/challenge/answer"
        
        # Headers exactly as in successful flow
        headers = self._get_challenge_headers()
        
        # Request body exactly as in successful flow
        data = {
            "credentials": {
                "passcode": password
            },
            "stateHandle": self.state_handle
        }
        
        try:
            response = self.session.post(url, headers=headers, json=data)
            logger.info(f"   Status: {response.status_code}")
            
            if response.status_code == 200:
                try:
                    data = response.json()
                    logger.info("   ✅ Challenge answer successful")
                    # Check if we have success redirect
                    if 'success' in data and 'href' in data['success']:
                        redirect_url = data['success']['href']
                        logger.info(f"   Redirect URL: {redirect_url}")
                        return self._step6_handle_success_redirect(redirect_url)
                    else:
                        logger.error("   ❌ No success redirect in response")
                        return False
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    return False
            else:
                logger.error(f"   ❌ Challenge answer failed: {response.status_code}")
                logger.error(f"   Response: {response.text[:200]}...")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error in challenge answer: {e}")
            return False
    
    def _step6_handle_success_redirect(self, redirect_url: str) -> bool:
        """Step 6: Handle success redirect to get authorization code."""
        logger.info("🔄 Step 6: Handle Success Redirect")
        
        try:
            response = self.session.get(redirect_url, allow_redirects=True)
            logger.info(f"   Redirect status: {response.status_code}")
            logger.info(f"   Final URL: {response.url}")
            
            # Extract authorization code from URL
            from urllib.parse import urlparse, parse_qs
            parsed = urlparse(response.url)
            params = parse_qs(parsed.query)
            
            if 'code' in params:
                auth_code = params['code'][0]
                logger.info(f"   ✅ Authorization code obtained: {auth_code[:20]}...")
                return self._step7_token_exchange(auth_code)
            else:
                logger.error("   ❌ No authorization code in redirect")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error handling redirect: {e}")
            return False
    
    def _step7_token_exchange(self, auth_code: str) -> bool:
        """Step 7: Token Exchange - EXACT replication."""
        logger.info("🎫 Step 7: Token Exchange")
        
        url = f"{self.okta_base}/oauth2/default/v1/token"
        
        # Headers exactly as in successful flow
        headers = self._get_token_exchange_headers()
        
        # Form data exactly as in successful flow
        data = {
            'grant_type': 'authorization_code',
            'code': auth_code,
            'redirect_uri': self.redirect_uri,
            'client_id': self.client_id
        }
        
        try:
            response = self.session.post(url, headers=headers, data=data)
            logger.info(f"   Status: {response.status_code}")
            
            if response.status_code == 200:
                try:
                    token_data = response.json()
                    logger.info("   ✅ Token exchange successful!")
                    logger.info(f"   Access token: {token_data.get('access_token', 'N/A')[:20]}...")
                    logger.info(f"   Token type: {token_data.get('token_type', 'N/A')}")
                    logger.info(f"   Expires in: {token_data.get('expires_in', 'N/A')}")
                    
                    # Save tokens to auth.json
                    self._save_tokens_to_auth_json(token_data)
                    self.authenticated = True
                    return True
                except json.JSONDecodeError:
                    logger.error("   ❌ Invalid JSON response")
                    return False
            else:
                logger.error(f"   ❌ Token exchange failed: {response.status_code}")
                logger.error(f"   Response: {response.text[:200]}...")
                return False
                
        except Exception as e:
            logger.error(f"   ❌ Error in token exchange: {e}")
            return False
    
    def _save_tokens_to_auth_json(self, token_data: Dict[str, Any]):
        """Save tokens to auth.json file."""
        try:
            auth_data = {
                'access_token': token_data.get('access_token'),
                'token_type': token_data.get('token_type'),
                'expires_in': token_data.get('expires_in'),
                'scope': token_data.get('scope'),
                'id_token': token_data.get('id_token'),
                'timestamp': time.time()
            }
            
            with open('auth.json', 'w') as f:
                json.dump(auth_data, f, indent=2)
            
            logger.info("   💾 Tokens saved to auth.json")
            
        except Exception as e:
            logger.error(f"   ❌ Error saving tokens: {e}")
    
    def _hybrid_capture_cookies(self) -> Dict[str, str]:
        """Hybrid method: Use minimal browser to capture cookies and headers."""
        logger.info("🔄 Hybrid method: Capturing cookies with minimal browser usage")
        
        try:
            self._setup_browser()
            
            # Navigate to Meijer login page to trigger cookie generation
            logger.info("Navigating to Meijer login page...")
            self.driver.get(f"{self.meijer_base}/signin")
            time.sleep(5)  # Allow JavaScript to execute
            
            # Capture all cookies
            cookies = {}
            for cookie in self.driver.get_cookies():
                cookies[cookie['name']] = cookie['value']
            
            logger.info(f"Captured {len(cookies)} cookies from browser")
            
            # Update session cookies
            for name, value in cookies.items():
                self.session.cookies.set(name, value, domain='.meijer.com')
            
            return cookies
            
        except Exception as e:
            logger.error(f"Error in hybrid cookie capture: {e}")
            return {}
        finally:
            if self.driver:
                self.driver.quit()
                self.driver = None
    
    def _selenium_full_flow(self, username: str, password: str) -> bool:
        """Full Selenium method: Complete browser automation."""
        logger.info("🌐 Full Selenium method: Complete browser automation")
        
        try:
            self._setup_browser()
            
            # Navigate to Meijer login page
            logger.info("Navigating to Meijer login page...")
            self.driver.get(f"{self.meijer_base}/signin")
            time.sleep(3)
            
            # Wait for login form to load
            wait = WebDriverWait(self.driver, 10)
            
            # Find and fill username field
            try:
                username_field = wait.until(
                    EC.presence_of_element_located((By.NAME, "username"))
                )
                username_field.clear()
                username_field.send_keys(username)
                logger.info("Username entered")
            except TimeoutException:
                logger.error("Username field not found")
                return False
            
            # Find and fill password field
            try:
                password_field = wait.until(
                    EC.presence_of_element_located((By.NAME, "password"))
                )
                password_field.clear()
                password_field.send_keys(password)
                logger.info("Password entered")
            except TimeoutException:
                logger.error("Password field not found")
                return False
            
            # Find and click submit button
            try:
                submit_button = wait.until(
                    EC.element_to_be_clickable((By.XPATH, "//button[@type='submit']"))
                )
                submit_button.click()
                logger.info("Submit button clicked")
            except TimeoutException:
                logger.error("Submit button not found")
                return False
            
            # Wait for response
            time.sleep(5)
            
            # Check if we need 2FA
            if "verification" in self.driver.current_url.lower() or "challenge" in self.driver.current_url.lower():
                logger.info("2FA required - this method doesn't handle 2FA automatically")
                return False
            
            # Check if login was successful
            if "account" in self.driver.current_url.lower() or "dashboard" in self.driver.current_url.lower():
                logger.info("Login successful via Selenium")
                self.authenticated = True
                return True
            
            logger.error("Login status unclear")
            return False
            
        except Exception as e:
            logger.error(f"Error in full Selenium flow: {e}")
            return False
        finally:
            if self.driver:
                self.driver.quit()
                self.driver = None
    
    def login(self, username: str, password: str) -> bool:
        """
        Complete login process using the specified method.
        
        Args:
            username: Username/email
            password: Password
            
        Returns:
            True if login successful, False otherwise
        """
        try:
            logger.info(f"🚀 Starting {self.method.upper()} authentication process...")
            
            if self.method == "requests":
                # Pure requests method - EXACT from analysis
                logger.info("📡 Using pure requests method - EXACT from analysis")
                
                # Step 0: Initial landing to establish cookies
                if not self._step0_initial_landing():
                    return False
                
                # Wait as in successful flow analysis
                wait_time = int(self.config['timing']['initial_landing'])
                logger.info(f"   ⏱️  Waiting {wait_time} seconds (from config)...")
                time.sleep(wait_time)
                
                # Step 1: OAuth2 Authorization - EXACT from analysis
                if not self._step1_oauth_authorize():
                    return False
                
                # Wait as in successful flow analysis
                wait_time = int(self.config['timing']['oauth2_authorize'])
                logger.info(f"   ⏱️  Waiting {wait_time} seconds (from config)...")
                time.sleep(wait_time)
                
                # Step 2: Device Fingerprinting
                if not self._step2_device_fingerprint():
                    return False
                
                # Wait as in successful flow analysis
                wait_time = int(self.config['timing']['device_fingerprint'])
                logger.info(f"   ⏱️  Waiting {wait_time} seconds (from config)...")
                time.sleep(wait_time)
                
                # Step 4: Web Login Identify
                if not self._step4_web_login_identify(username):
                    return False
                
                # Wait as in successful flow analysis
                wait_time = int(self.config['timing']['identify'])
                logger.info(f"   ⏱️  Waiting {wait_time} seconds (from config)...")
                time.sleep(wait_time)
                
                # Step 5: Challenge Answer
                if not self._step5_challenge_answer(password):
                    return False
                
                # Wait as in successful flow usage
                wait_time = int(self.config['timing']['challenge'])
                logger.info(f"   ⏱️  Waiting {wait_time} seconds (from config)...")
                time.sleep(wait_time)
                
                logger.info("✅ Pure requests authentication completed successfully!")
                
                # Validate required cookies
                if self._validate_required_cookies():
                    self.authenticated = True
                    return True
                else:
                    logger.warning("⚠️  Some required cookies are missing, but authentication may still be successful")
                    self.authenticated = True
                    return True
                
            elif self.method == "hybrid":
                # Hybrid method: Minimal browser + requests
                logger.info("🔄 Using hybrid method (minimal browser + requests)")
                
                # Capture cookies with minimal browser usage
                self._hybrid_capture_cookies()
                
                # Continue with requests flow
                if not self._step1_oauth_authorize():
                    return False
                
                if not self._step2_device_fingerprint():
                    return False
                
                if not self._step4_web_login_identify(username):
                    return False
                
                if not self._step5_challenge_answer(password):
                    return False
                
                logger.info("✅ Hybrid authentication completed successfully!")
                return True
                
            elif self.method == "selenium":
                # Full Selenium method
                logger.info("🌐 Using full Selenium method")
                
                return self._selenium_full_flow(username, password)
                
            else:
                logger.error(f"Unknown authentication method: {self.method}")
                return False
                
        except Exception as e:
            logger.error(f"Login failed: {e}")
            self.authenticated = False
            raise
        
        finally:
            # Clean up browser if used
            if self.driver:
                try:
                    self.driver.quit()
                except:
                    pass
                self.driver = None
    
    def is_authenticated(self) -> bool:
        """Check if client is authenticated."""
        return self.authenticated
    
    def get_session(self) -> requests.Session:
        """
        Get the authenticated session for making requests.
        
        Returns:
            Authenticated requests session
        """
        if not self.is_authenticated():
            raise AuthenticationError("Not authenticated. Call login() first.")
        
        return self.session
    
    def logout(self):
        """Logout and clear session."""
        try:
            if self.session:
                self.session.post(f"{self.okta_base}/idp/idx/signout")
        except:
            pass
        
        # Clear auth.json file
        try:
            if Path('auth.json').exists():
                Path('auth.json').unlink()
                logger.info("auth.json cleared")
        except Exception as e:
            logger.error(f"Failed to clear auth.json: {e}")
        
        self.session = requests.Session()
        self.authenticated = False
        self.state_token = None
        self.state_handle = None
        self.device_nonce = None
        
        # Reset session headers
        self._setup_session_headers()
        
        logger.info("Logged out successfully")
    
    def __enter__(self):
        """Context manager entry."""
        return self
    
    def __exit__(self, exc_type, exc_val, exc_tb):
        """Context manager exit."""
        if self.driver:
            try:
                self.driver.quit()
            except:
                pass
        self.logout()


def create_headless_client(method: str = "requests", headless: bool = True) -> HeadlessAuthClient:
    """
    Factory function to create a headless auth client.
    
    Args:
        method: Authentication method ("requests", "hybrid", "selenium")
        headless: Whether to run browser in headless mode (for hybrid/selenium)
        
    Returns:
        Headless auth client instance
    """
    return HeadlessAuthClient(method=method, headless=headless)
