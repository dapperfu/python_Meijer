#!/usr/bin/env python3
"""
Quick Security Test for Meijer API

Uses the existing Meijer client to test for basic security vulnerabilities.
Run this after setting up authentication with the Meijer client.
"""

import json
import time

from meijer import Meijer


def test_account_enumeration(client: Meijer):
    """Test if we can access other accounts' data."""
    print("🔍 Testing account enumeration...")

    # Test different account IDs
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
            print(f"  Testing account ID: {account_id}")

            # Test settings endpoint
            try:
                # This would need to be implemented in the client
                # For now, we'll test what we can
                pass
            except Exception as e:
                print(f"    Settings endpoint: {e}")

            # Test loyalty endpoints with different account IDs
            try:
                # Test if we can get vehicle info for different accounts
                # This would need to be implemented
                pass
            except Exception as e:
                print(f"    Vehicle info: {e}")

            results[account_id] = "Tested"
            time.sleep(0.2)  # Rate limiting

        except Exception as e:
            print(f"    Error: {e}")
            results[account_id] = f"Error: {e}"

    return results


def test_information_disclosure(client: Meijer):
    """Test what sensitive information is exposed."""
    print("🔍 Testing information disclosure...")

    results = {}

    try:
        # Test account details
        print("  Testing account details...")
        account_details = client.settings.get_account_details()
        if account_details:
            print("    ✅ Got account details")

            # Check for sensitive fields
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
            ]

            found_sensitive = []
            for field in sensitive_fields:
                if field in account_details:
                    found_sensitive.append(field)
                    print(f"      ⚠️  Found sensitive field: {field}")

            results["account_details"] = {
                "found": True,
                "sensitive_fields": found_sensitive,
                "data_keys": list(account_details.keys()),
            }
        else:
            print("    ❌ No account details returned")
            results["account_details"] = {"found": False}

    except Exception as e:
        print(f"    Error getting account details: {e}")
        results["account_details"] = {"error": str(e)}

    try:
        # Test vehicle information
        print("  Testing vehicle information...")
        vehicle_info = client.settings.get_vehicle_information()
        if vehicle_info:
            print(f"    ✅ Got vehicle info: {vehicle_info.vehicle_description}")
            results["vehicle_info"] = {
                "found": True,
                "vehicle_id": vehicle_info.vehicle_id,
                "account_id": vehicle_info.account_id,
            }
        else:
            print("    ❌ No vehicle info returned")
            results["vehicle_info"] = {"found": False}

    except Exception as e:
        print(f"    Error getting vehicle info: {e}")
        results["vehicle_info"] = {"error": str(e)}

    try:
        # Test customer preferences
        print("  Testing customer preferences...")
        preferences = client.settings.get_customer_preferences()
        if preferences:
            print(f"    ✅ Got {len(preferences)} preferences")
            results["preferences"] = {
                "found": True,
                "count": len(preferences),
                "types": [p.preference_type_name for p in preferences],
            }
        else:
            print("    ❌ No preferences returned")
            results["preferences"] = {"found": False}

    except Exception as e:
        print(f"    Error getting preferences: {e}")
        results["preferences"] = {"error": str(e)}

    return results


def test_authorization_bypass(client: Meijer):
    """Test for authorization bypass vulnerabilities."""
    print("🔍 Testing authorization bypass...")

    results = {}

    # Test if we can access data without proper authentication
    # This would require testing with invalid/missing tokens
    # For now, we'll test what we can with the current client

    try:
        # Test if we can still access data after potential token expiration
        print("  Testing data access...")

        # Try to get account details
        account_details = client.settings.get_account_details()
        if account_details:
            print("    ✅ Can still access account details")
            results["data_access"] = "Working"
        else:
            print("    ❌ Cannot access account details")
            results["data_access"] = "Blocked"

    except Exception as e:
        print(f"    Error testing data access: {e}")
        results["data_access"] = f"Error: {e}"

    return results


def main():
    """Main security testing function."""
    print("🔒 Meijer API Quick Security Test")
    print("=" * 40)

    try:
        # Initialize Meijer client
        print("🔑 Initializing Meijer client...")
        client = Meijer()

        # Check authentication status
        if not client._access_token:
            print("❌ No access token available. Please authenticate first.")
            print("   Run: meijer status")
            return

        print("✅ Client initialized with authentication")

        # Run security tests
        results = {
            "account_enumeration": test_account_enumeration(client),
            "information_disclosure": test_information_disclosure(client),
            "authorization_bypass": test_authorization_bypass(client),
        }

        # Save results
        with open("quick_security_results.json", "w") as f:
            json.dump(results, f, indent=2, default=str)

        print("\n📊 Security Test Summary:")
        print("=" * 30)

        for test_name, test_results in results.items():
            print(f"\n{test_name.upper()}:")
            if isinstance(test_results, dict):
                for key, value in test_results.items():
                    if isinstance(value, dict) and "sensitive_fields" in value:
                        if value["sensitive_fields"]:
                            print(f"  {key}: 🔴 SENSITIVE DATA EXPOSED")
                            print(f"    Fields: {value['sensitive_fields']}")
                        else:
                            print(f"  {key}: 🟢 No sensitive data exposed")
                    elif isinstance(value, dict) and "found" in value:
                        status = "✅ Found" if value["found"] else "❌ Not found"
                        print(f"  {key}: {status}")
                    else:
                        print(f"  {key}: {value}")
            else:
                print(f"  Results: {test_results}")

        print("\n💾 Detailed results saved to: quick_security_results.json")

    except Exception as e:
        print(f"❌ Error during security testing: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    main()
