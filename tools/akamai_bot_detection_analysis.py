#!/usr/bin/env python3
"""
Akamai Bot Detection Analysis Tool
Analyzes potential reasons why requests fail even with correct headers
"""

import requests
import json
import time
import random
import base64
import hashlib
import secrets
from urllib.parse import urlencode
from typing import Dict, Any, List, Optional
import logging
from datetime import datetime, timedelta

# Configure logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger(__name__)

class AkamaiBotDetectionAnalysis:
    def __init__(self):
        self.session = requests.Session()
        self.session.proxies = {
            'http': 'http://127.0.0.1:8080',
            'https': 'http://127.0.0.1:8080'
        }
        self.session.verify = False
        
        # Base URLs
        self.base_url = "https://id.meijer.com"
        self.oauth_url = f"{self.base_url}/oauth2/default/v1"
        
        # OAuth parameters
        self.client_id = "0oa1o8g9njWsUvwsx697"
        self.redirect_uri = "com.meijer.mobile.meijer:/login"
        self.scope = "openid profile offline_access"
        
        # Session state
        self.state = None
        self.nonce = None
        self.code_verifier = None
        self.code_challenge = None
        self.device_nonce = None
        self.state_token = None
        
        # Headers based on successful flow
        self.default_headers = {
            'User-Agent': 'Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.0.0 Mobile Safari/537.36',
            'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
            'Accept-Language': 'en-US,en;q=0.9',
            'Accept-Encoding': 'gzip, deflate, br, zstd',
            'Sec-Fetch-Site': 'none',
            'Sec-Fetch-Mode': 'navigate',
            'Sec-Fetch-User': '?1',
            'Sec-Fetch-Dest': 'document',
            'Upgrade-Insecure-Requests': '1'
        }
        
        self.session.headers.update(self.default_headers)
        
        # Load credentials
        self.username, self.password = self.load_credentials()
        
        # Analysis data
        self.request_timings = []
        self.cookie_evolution = []
        self.session_context = {}
        
    def load_credentials(self) -> tuple[str, str]:
        """Load credentials from login.txt file."""
        login_file = "/keg/cursor/.config/meijer/login.txt"
        try:
            with open(login_file, 'r') as f:
                lines = f.readlines()
                if len(lines) >= 2:
                    username = lines[0].strip()
                    password = lines[1].strip()
                    logger.info(f"✅ Credentials loaded: {username}")
                    return username, password
                else:
                    raise ValueError("login.txt must contain username and password on separate lines")
        except Exception as e:
            logger.error(f"❌ Error loading credentials: {e}")
            raise
    
    def generate_pkce_params(self) -> tuple[str, str]:
        """Generate PKCE code verifier and challenge."""
        self.code_verifier = secrets.token_urlsafe(32)
        self.code_challenge = base64.urlsafe_b64encode(
            hashlib.sha256(self.code_verifier.encode()).digest()
        ).decode().rstrip('=')
        return self.code_verifier, self.code_challenge
    
    def generate_state_nonce(self) -> tuple[str, str]:
        """Generate state and nonce parameters."""
        self.state = secrets.token_urlsafe(32)
        self.nonce = secrets.token_urlsafe(32)
        return self.state, self.nonce
    
    def record_request_timing(self, step: str, start_time: float, end_time: float):
        """Record timing information for behavioral analysis."""
        duration = end_time - start_time
        self.request_timings.append({
            'step': step,
            'start_time': start_time,
            'end_time': end_time,
            'duration': duration,
            'timestamp': datetime.now().isoformat()
        })
    
    def record_cookie_evolution(self, step: str, cookies: Dict[str, str]):
        """Record cookie changes for session context analysis."""
        self.cookie_evolution.append({
            'step': step,
            'cookies': cookies.copy(),
            'timestamp': datetime.now().isoformat(),
            'cookie_count': len(cookies)
        })
    
    def analyze_timing_patterns(self) -> Dict[str, Any]:
        """Analyze request timing patterns for bot detection."""
        if len(self.request_timings) < 2:
            return {"error": "Insufficient timing data"}
        
        analysis = {
            'total_requests': len(self.request_timings),
            'total_duration': sum(r['duration'] for r in self.request_timings),
            'average_duration': sum(r['duration'] for r in self.request_timings) / len(self.request_timings),
            'timing_patterns': []
        }
        
        # Analyze intervals between requests
        for i in range(1, len(self.request_timings)):
            interval = self.request_timings[i]['start_time'] - self.request_timings[i-1]['end_time']
            analysis['timing_patterns'].append({
                'step_transition': f"{self.request_timings[i-1]['step']} -> {self.request_timings[i]['step']}",
                'interval': interval,
                'is_regular': abs(interval - 2.0) < 0.5  # Check if intervals are too regular
            })
        
        # Check for suspicious patterns
        regular_intervals = sum(1 for p in analysis['timing_patterns'] if p['is_regular'])
        analysis['suspicious_patterns'] = {
            'too_regular_intervals': regular_intervals,
            'total_transitions': len(analysis['timing_patterns']),
            'regularity_percentage': (regular_intervals / len(analysis['timing_patterns'])) * 100
        }
        
        return analysis
    
    def analyze_cookie_evolution(self) -> Dict[str, Any]:
        """Analyze cookie evolution patterns."""
        if len(self.cookie_evolution) < 2:
            return {"error": "Insufficient cookie data"}
        
        analysis = {
            'total_cookie_changes': len(self.cookie_evolution),
            'cookie_growth_pattern': [],
            'new_cookies_per_step': [],
            'cookie_persistence': {}
        }
        
        # Analyze cookie growth
        for i in range(1, len(self.cookie_evolution)):
            prev_cookies = set(self.cookie_evolution[i-1]['cookies'].keys())
            curr_cookies = set(self.cookie_evolution[i]['cookies'].keys())
            
            new_cookies = curr_cookies - prev_cookies
            removed_cookies = prev_cookies - curr_cookies
            
            analysis['cookie_growth_pattern'].append({
                'step': self.cookie_evolution[i]['step'],
                'new_cookies': list(new_cookies),
                'removed_cookies': list(removed_cookies),
                'net_change': len(new_cookies) - len(removed_cookies)
            })
            
            analysis['new_cookies_per_step'].append(len(new_cookies))
        
        # Analyze cookie persistence
        all_cookies = set()
        for cookie_data in self.cookie_evolution:
            all_cookies.update(cookie_data['cookies'].keys())
        
        for cookie_name in all_cookies:
            persistence = []
            for cookie_data in self.cookie_evolution:
                persistence.append(cookie_name in cookie_data['cookies'])
            analysis['cookie_persistence'][cookie_name] = persistence
        
        return analysis
    
    def analyze_session_context(self) -> Dict[str, Any]:
        """Analyze overall session context and risk factors."""
        analysis = {
            'session_duration': 0,
            'request_frequency': 0,
            'risk_factors': [],
            'recommendations': []
        }
        
        if self.request_timings:
            session_start = self.request_timings[0]['start_time']
            session_end = self.request_timings[-1]['end_time']
            analysis['session_duration'] = session_end - session_start
            analysis['request_frequency'] = len(self.request_timings) / analysis['session_duration']
        
        # Identify risk factors
        if analysis['request_frequency'] > 2.0:  # More than 2 requests per second
            analysis['risk_factors'].append('High request frequency')
            analysis['recommendations'].append('Add longer delays between requests')
        
        if analysis['session_duration'] < 10.0:  # Less than 10 seconds total
            analysis['risk_factors'].append('Session too fast')
            analysis['recommendations'].append('Slow down overall session pace')
        
        # Check for Akamai-specific patterns
        akamai_cookies = ['_abck', 'ak_bmsc', 'bm_sz', 'bm_mi', 'bm_sv']
        if self.cookie_evolution:
            final_cookies = self.cookie_evolution[-1]['cookies']
            missing_akamai = [c for c in akamai_cookies if c not in final_cookies]
            if missing_akamai:
                analysis['risk_factors'].append(f'Missing Akamai cookies: {missing_akamai}')
                analysis['recommendations'].append('Ensure all Akamai cookies are properly set')
        
        return analysis
    
    def step1_oauth_authorize(self) -> Dict[str, Any]:
        """Step 1: OAuth2 authorization with timing analysis."""
        logger.info("🔐 STEP 1: OAuth2 Authorization Request")
        logger.info("=" * 50)
        
        start_time = time.time()
        
        # Generate PKCE and state parameters
        self.generate_pkce_params()
        self.generate_state_nonce()
        
        # Build authorization URL
        params = {
            'login_hint': '',
            'code_challenge': self.code_challenge,
            'code_challenge_method': 'S256',
            'client_id': self.client_id,
            'scope': self.scope,
            'redirect_uri': self.redirect_uri,
            'response_type': 'code',
            'state': self.state,
            'nonce': self.nonce
        }
        
        auth_url = f"{self.oauth_url}/authorize?{urlencode(params)}"
        logger.info(f"🔗 Authorization URL: {auth_url}")
        
        # Make request
        response = self.session.get(auth_url, allow_redirects=True)
        end_time = time.time()
        
        # Record timing and cookies
        self.record_request_timing('oauth_authorize', start_time, end_time)
        self.record_cookie_evolution('oauth_authorize', dict(self.session.cookies))
        
        # Analyze response
        analysis = {
            'step': 'oauth_authorize',
            'url': auth_url,
            'method': 'GET',
            'status_code': response.status_code,
            'response_headers': dict(response.headers),
            'cookies': dict(self.session.cookies),
            'final_url': response.url,
            'content_length': len(response.content),
            'content_type': response.headers.get('content-type', ''),
            'success': response.status_code == 200,
            'timing': {
                'start': start_time,
                'end': end_time,
                'duration': end_time - start_time
            }
        }
        
        logger.info(f"📊 Response Analysis:")
        logger.info(f"   Status: {response.status_code}")
        logger.info(f"   Duration: {end_time - start_time:.3f}s")
        logger.info(f"   Cookies: {len(self.session.cookies)}")
        
        return analysis
    
    def step2_device_fingerprint(self) -> Dict[str, Any]:
        """Step 2: Device fingerprinting with timing analysis."""
        logger.info("🔍 STEP 2: Device Fingerprinting")
        logger.info("=" * 50)
        
        start_time = time.time()
        
        fingerprint_url = f"{self.base_url}/auth/services/devicefingerprint"
        logger.info(f"🔗 Fingerprint URL: {fingerprint_url}")
        
        # Make request
        response = self.session.get(fingerprint_url)
        end_time = time.time()
        
        # Record timing and cookies
        self.record_request_timing('device_fingerprint', start_time, end_time)
        self.record_cookie_evolution('device_fingerprint', dict(self.session.cookies))
        
        # Analyze response
        analysis = {
            'step': 'device_fingerprint',
            'url': fingerprint_url,
            'method': 'GET',
            'status_code': response.status_code,
            'response_headers': dict(response.headers),
            'cookies': dict(self.session.cookies),
            'content_length': len(response.content),
            'content_type': response.headers.get('content-type', ''),
            'success': response.status_code == 200,
            'timing': {
                'start': start_time,
                'end': end_time,
                'duration': end_time - start_time
            }
        }
        
        logger.info(f"📊 Response Analysis:")
        logger.info(f"   Status: {response.status_code}")
        logger.info(f"   Duration: {end_time - start_time:.3f}s")
        logger.info(f"   Cookies: {len(self.session.cookies)}")
        
        # Add variable delay to simulate JavaScript execution
        delay = random.uniform(2.0, 4.0)  # Longer, more variable delays
        logger.info(f"⏸️ Adding {delay:.1f}s delay to simulate JavaScript execution...")
        time.sleep(delay)
        
        return analysis
    
    def step3_device_nonce(self) -> Dict[str, Any]:
        """Step 3: Get device nonce with timing analysis."""
        logger.info("🔑 STEP 3: Device Nonce Request")
        logger.info("=" * 50)
        
        start_time = time.time()
        
        nonce_url = f"{self.base_url}/api/v1/internal/device/nonce"
        logger.info(f"🔗 Nonce URL: {nonce_url}")
        
        # Headers from successful flow
        headers = {
            'X-Requested-With': 'XMLHttpRequest',
            'Origin': self.base_url,
            'Referer': f"{self.base_url}/auth/services/devicefingerprint"
        }
        
        # Make request
        response = self.session.post(nonce_url, headers=headers)
        end_time = time.time()
        
        # Record timing and cookies
        self.record_request_timing('device_nonce', start_time, end_time)
        self.record_cookie_evolution('device_nonce', dict(self.session.cookies))
        
        # Analyze response
        analysis = {
            'step': 'device_nonce',
            'url': nonce_url,
            'method': 'POST',
            'status_code': response.status_code,
            'request_headers': headers,
            'response_headers': dict(response.headers),
            'cookies': dict(self.session.cookies),
            'content_length': len(response.content),
            'content_type': response.headers.get('content-type', ''),
            'success': response.status_code == 200,
            'timing': {
                'start': start_time,
                'end': end_time,
                'duration': end_time - start_time
            }
        }
        
        if response.status_code == 200:
            try:
                nonce_data = response.json()
                self.device_nonce = nonce_data.get('nonce')
                logger.info(f"✅ Device nonce received: {self.device_nonce[:20]}...")
                analysis['nonce'] = self.device_nonce
            except:
                logger.warning("⚠️ Could not parse nonce response as JSON")
        else:
            logger.error(f"❌ Nonce request failed: {response.status_code}")
            analysis['error_response'] = response.text[:500]
        
        logger.info(f"📊 Response Analysis:")
        logger.info(f"   Status: {response.status_code}")
        logger.info(f"   Duration: {end_time - start_time:.3f}s")
        logger.info(f"   Content Length: {len(response.content)}")
        
        return analysis
    
    def step4_web_login_identify(self) -> Dict[str, Any]:
        """Step 4: Web login identify with timing analysis."""
        logger.info("👤 STEP 4: Web Login Identify")
        logger.info("=" * 50)
        
        start_time = time.time()
        
        identify_url = f"{self.base_url}/idp/idx/identify"
        logger.info(f"🔗 Identify URL: {identify_url}")
        
        # Headers from successful flow
        headers = {
            'X-Requested-With': 'XMLHttpRequest',
            'Origin': self.base_url,
            'Referer': f"{self.base_url}/auth/services/devicefingerprint",
            'Content-Type': 'application/json'
        }
        
        # Payload
        payload = {
            "identifier": self.username,
            "rememberMe": False,
            "stateToken": None
        }
        
        logger.info(f"📤 Request Payload: {json.dumps(payload, indent=2)}")
        
        # Make request
        response = self.session.post(identify_url, headers=headers, json=payload)
        end_time = time.time()
        
        # Record timing and cookies
        self.record_request_timing('web_login_identify', start_time, end_time)
        self.record_cookie_evolution('web_login_identify', dict(self.session.cookies))
        
        # Analyze response
        analysis = {
            'step': 'web_login_identify',
            'url': identify_url,
            'method': 'POST',
            'status_code': response.status_code,
            'request_headers': headers,
            'request_payload': payload,
            'response_headers': dict(response.headers),
            'cookies': dict(self.session.cookies),
            'content_length': len(response.content),
            'content_type': response.headers.get('content-type', ''),
            'success': response.status_code == 200,
            'timing': {
                'start': start_time,
                'end': end_time,
                'duration': end_time - start_time
            }
        }
        
        logger.info(f"📊 Response Analysis:")
        logger.info(f"   Status: {response.status_code}")
        logger.info(f"   Duration: {end_time - start_time:.3f}s")
        logger.info(f"   Content Length: {len(response.content)}")
        
        if response.status_code == 200:
            try:
                identify_data = response.json()
                self.state_token = identify_data.get('stateToken')
                logger.info(f"✅ Identify successful, state token: {self.state_token[:20] if self.state_token else 'None'}...")
                analysis['state_token'] = self.state_token
            except:
                logger.warning("⚠️ Could not parse identify response as JSON")
        else:
            logger.error(f"❌ Identify failed: {response.status_code}")
            analysis['error_response'] = response.text[:500]
        
        return analysis
    
    def run_comprehensive_analysis(self) -> Dict[str, Any]:
        """Run comprehensive analysis with all steps and bot detection analysis."""
        logger.info("🚀 Starting Comprehensive Akamai Bot Detection Analysis")
        logger.info("=" * 70)
        
        analysis_results = {}
        
        try:
            # Step 1: OAuth2 Authorization
            analysis_results['step1'] = self.step1_oauth_authorize()
            time.sleep(random.uniform(3.0, 6.0))  # Longer, more variable delays
            
            # Step 2: Device Fingerprinting
            analysis_results['step2'] = self.step2_device_fingerprint()
            time.sleep(random.uniform(3.0, 6.0))  # Longer, more variable delays
            
            # Step 3: Device Nonce
            analysis_results['step3'] = self.step3_device_nonce()
            time.sleep(random.uniform(3.0, 6.0))  # Longer, more variable delays
            
            # Step 4: Web Login Identify
            analysis_results['step4'] = self.step4_web_login_identify()
            
            # Comprehensive bot detection analysis
            logger.info("\n🔍 ANALYZING BOT DETECTION PATTERNS")
            logger.info("=" * 50)
            
            analysis_results['bot_detection_analysis'] = {
                'timing_patterns': self.analyze_timing_patterns(),
                'cookie_evolution': self.analyze_cookie_evolution(),
                'session_context': self.analyze_session_context()
            }
            
            # Overall analysis
            analysis_results['summary'] = {
                'total_steps': 4,
                'successful_steps': sum(1 for step in analysis_results.values() if isinstance(step, dict) and step.get('success', False)),
                'failed_steps': sum(1 for step in analysis_results.values() if isinstance(step, dict) and not step.get('success', False)),
                'final_status': 'success' if analysis_results['step4'].get('success', False) else 'failed',
                'timestamp': time.time()
            }
            
            logger.info("📊 Analysis Complete!")
            logger.info(f"   Total Steps: {analysis_results['summary']['total_steps']}")
            logger.info(f"   Successful: {analysis_results['summary']['successful_steps']}")
            logger.info(f"   Failed: {analysis_results['summary']['failed_steps']}")
            logger.info(f"   Final Status: {analysis_results['summary']['final_status']}")
            
            # Print bot detection insights
            self.print_bot_detection_insights(analysis_results['bot_detection_analysis'])
            
        except Exception as e:
            logger.error(f"❌ Analysis failed: {e}")
            analysis_results['error'] = str(e)
        
        return analysis_results
    
    def print_bot_detection_insights(self, bot_analysis: Dict[str, Any]):
        """Print insights about potential bot detection issues."""
        logger.info("\n🎯 BOT DETECTION INSIGHTS")
        logger.info("=" * 40)
        
        # Timing analysis
        timing = bot_analysis.get('timing_patterns', {})
        if 'suspicious_patterns' in timing:
            sp = timing['suspicious_patterns']
            logger.info(f"⏱️ Timing Analysis:")
            logger.info(f"   Regular intervals: {sp.get('too_regular_intervals', 0)}/{sp.get('total_transitions', 0)}")
            logger.info(f"   Regularity: {sp.get('regularity_percentage', 0):.1f}%")
            if sp.get('regularity_percentage', 0) > 50:
                logger.warning("   ⚠️ HIGH RISK: Too many regular intervals detected")
        
        # Session context
        session = bot_analysis.get('session_context', {})
        if 'risk_factors' in session:
            logger.info(f"🚨 Risk Factors:")
            for risk in session.get('risk_factors', []):
                logger.warning(f"   ⚠️ {risk}")
        
        if 'recommendations' in session:
            logger.info(f"💡 Recommendations:")
            for rec in session.get('recommendations', []):
                logger.info(f"   💡 {rec}")
    
    def save_analysis(self, analysis: Dict[str, Any], filename: str = None) -> str:
        """Save analysis results to JSON file."""
        if filename is None:
            timestamp = int(time.time())
            filename = f"akamai_bot_detection_analysis_{timestamp}.json"
        
        try:
            with open(filename, 'w') as f:
                json.dump(analysis, f, indent=2)
            logger.info(f"💾 Analysis saved to {filename}")
            return filename
        except Exception as e:
            logger.error(f"❌ Error saving analysis: {e}")
            return None

def main():
    """Main function to run the comprehensive bot detection analysis."""
    try:
        # Create analyzer
        analyzer = AkamaiBotDetectionAnalysis()
        
        # Run comprehensive analysis
        analysis = analyzer.run_comprehensive_analysis()
        
        # Save results
        filename = analyzer.save_analysis(analysis)
        
        if filename:
            print(f"\n🎯 Analysis complete! Results saved to: {filename}")
            print("📊 Check the mitmproxy logs for detailed HTTP flow analysis")
            print("🔍 Bot detection patterns have been analyzed and recommendations provided")
        else:
            print("\n❌ Analysis failed to save")
            
    except Exception as e:
        print(f"❌ Analysis failed: {e}")

if __name__ == "__main__":
    main()
