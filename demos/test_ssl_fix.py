#!/usr/bin/env python3
"""
Test script for SSL configuration fix.

This script tests the SSL verification settings in the Meijer client.
"""

import sys
from pathlib import Path

# Add the meijer package to the path
sys.path.insert(0, str(Path(__file__).parent.parent))

from meijer.client import Meijer


def test_ssl_configuration():
    """Test SSL configuration options."""
    print("🧪 Testing SSL Configuration")
    print("=" * 60)

    # Test 1: Default SSL configuration
    print("📤 Test 1: Default SSL configuration")
    print("-" * 40)
    try:
        client = Meijer()
        print("✅ Client created with default SSL settings")
        print(f"   SSL verify: {client.ssl_verify}")
        print(f"   SSL cert path: {client.ssl_cert_path}")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Test 2: Disable SSL verification
    print("📤 Test 2: Disable SSL verification")
    print("-" * 40)
    try:
        client = Meijer()
        client.configure_ssl(verify=False)
        print("✅ SSL verification disabled")
        print(f"   SSL verify: {client.ssl_verify}")
        print(f"   SSL cert path: {client.ssl_cert_path}")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Test 3: Custom certificate path
    print("📤 Test 3: Custom certificate path")
    print("-" * 40)
    try:
        client = Meijer()
        # Try to find a certificate file
        cert_paths = [
            "/etc/ssl/certs/ca-certificates.crt",
            "/usr/local/share/ca-certificates/ca-certificates.crt",
            "/tmp/meijer_cert.pem",
        ]

        cert_found = None
        for cert_path in cert_paths:
            if Path(cert_path).exists():
                cert_found = cert_path
                break

        if cert_found:
            client.configure_ssl(verify=True, cert_path=cert_found)
            print(f"✅ SSL configured with certificate: {cert_found}")
            print(f"   SSL verify: {client.ssl_verify}")
            print(f"   SSL cert path: {client.ssl_cert_path}")
        else:
            print("ℹ️ No certificate files found for testing")
            print("   Creating a dummy certificate for testing...")

            # Create a dummy certificate file
            dummy_cert = "/tmp/meijer_cert.pem"
            with open(dummy_cert, "w") as f:
                f.write(
                    "-----BEGIN CERTIFICATE-----\nDUMMY\n-----END CERTIFICATE-----\n"
                )

            client.configure_ssl(verify=True, cert_path=dummy_cert)
            print(f"✅ SSL configured with dummy certificate: {dummy_cert}")

    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Test 4: Test API call with SSL configuration
    print("📤 Test 4: Test API call with SSL configuration")
    print("-" * 40)
    try:
        client = Meijer()

        # Try to make a simple API call to test SSL
        print("🌐 Testing API call with current SSL settings...")

        # This will likely fail due to authentication, but we can test SSL
        try:
            response = client._make_request(
                "GET", "https://api.meijer.com/loyalty/shoppinglist/GetList"
            )
            print(f"✅ API call successful: {response.status_code}")
        except Exception as api_error:
            if "SSL" in str(api_error) or "certificate" in str(api_error).lower():
                print(f"❌ SSL error: {api_error}")
                print("💡 This indicates SSL configuration issue")
            elif "401" in str(api_error) or "authentication" in str(api_error).lower():
                print(f"✅ SSL working, but authentication required: {api_error}")
            else:
                print(f"ℹ️ Other error (not SSL): {api_error}")

    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()
    print("=" * 60)
    print("📋 SSL Configuration Options:")
    print("1. Default: SSL verification enabled with system certificates")
    print("2. Disable: client.configure_ssl(verify=False)")
    print("3. Custom: client.configure_ssl(verify=True, cert_path='/path/to/cert.pem')")
    print("4. Environment: Set MEIJER_SSL_CERT=/path/to/cert.pem")


def main():
    """Main function."""
    print("🚀 SSL Configuration Test Tool")
    print("=" * 60)
    print("🔒 This tool tests SSL verification settings in the Meijer client")
    print("📄 Helps diagnose SSL certificate verification issues")
    print()

    # Run the tests
    test_ssl_configuration()

    print("\n💡 Next steps:")
    print("1. Check if your certificate is properly installed")
    print("2. Try disabling SSL verification temporarily")
    print("3. Use a custom certificate path if available")


if __name__ == "__main__":
    main()
