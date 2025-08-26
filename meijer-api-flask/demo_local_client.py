#!/usr/bin/env python3
"""
Demo script showing how to use the updated Meijer client with local endpoints.

This script demonstrates how to configure the Meijer client to use the local
Flask caching server instead of the real Meijer API.
"""

import sys
from pathlib import Path

# Add the parent directory to the path so we can import the meijer module
sys.path.insert(0, str(Path(__file__).parent.parent))

from meijer import Meijer


def demo_local_endpoints():
    """Demonstrate using the Meijer client with local endpoints."""
    print("🚀 Meijer Client Local Endpoints Demo")
    print("=" * 50)

    # Create Meijer client with local base URL
    print("📡 Creating Meijer client with local endpoints...")
    meijer = Meijer(base_url="http://127.0.0.1:5000")

    print("\n✅ Client created successfully!")
    print(f"   API Base URL: {meijer.api_base_url}")
    print(f"   ID Base URL: {meijer.id_base_url}")
    print(f"   Digital Base URL: {meijer.digital_base_url}")
    print(f"   Loyalty Base URL: {meijer.loyalty_base_url}")
    print(f"   WWW Base URL: {meijer.www_base_url}")
    print(f"   Constructor Base URL: {meijer.constructor_base_url}")
    print(f"   Feedback Base URL: {meijer.feedback_base_url}")

    # Test some endpoints
    print("\n🧪 Testing local endpoints...")

    try:
        # Test health check
        import requests

        response = requests.get("http://127.0.0.1:5000/health", timeout=5)
        if response.status_code == 200:
            print("✅ Local Flask server is running")
        else:
            print(f"⚠️ Local Flask server returned: {response.status_code}")
    except Exception as e:
        print(f"❌ Could not connect to local Flask server: {e}")
        print("   Make sure the Flask server is running with: make run")
        return

    # Test API endpoint construction
    print("\n🔗 Testing API endpoint construction...")

    # Test cart endpoint
    cart_url = meijer._get_api_url("digital/occ/v3/carts/current")
    print(f"   Cart endpoint: {cart_url}")

    # Test store endpoint
    store_url = meijer._get_api_url("digital/storeInfo/v2/stores/proximity")
    print(f"   Store endpoint: {store_url}")

    # Test MPerks endpoint
    mperks_url = meijer._get_api_url("digital/mperks40/customer/v1/pointbalance")
    print(f"   MPerks endpoint: {mperks_url}")

    print("\n🎯 All endpoints are now pointing to the local Flask server!")
    print(
        "   You can now test the Meijer API locally without hitting the real endpoints."
    )

    # Show how to reset to default URLs
    print("\n🔄 To reset to default Meijer endpoints:")
    print("   meijer = Meijer()  # Without base_url parameter")

    # Show how to change base URL after creation
    print("\n🔧 To change base URL after client creation:")
    print("   meijer._setup_local_endpoints('http://localhost:8000')")

    print("\n✨ Demo completed successfully!")


def demo_submodule_endpoints():
    """Demonstrate how submodules also support local endpoints."""
    print("\n🔧 Submodule Local Endpoints Demo")
    print("=" * 40)

    meijer = Meijer(base_url="http://127.0.0.1:5000")

    # Test search module
    print("🔍 Testing Search module...")
    search_url = meijer.search.constructor_base_url
    print(f"   Constructor base URL: {search_url}")

    # Test shop_scan module
    print("📱 Testing Shop & Scan module...")
    lookup_endpoint = meijer.shop_scan.endpoints.get("lookup_item", "N/A")
    print(f"   Lookup item endpoint: {lookup_endpoint}")

    # Test feedback module
    print("💬 Testing Feedback module...")
    feedback_url = meijer.feedback.base_url
    print(f"   Feedback base URL: {feedback_url}")

    print("\n✅ All submodules are using local endpoints!")


if __name__ == "__main__":
    try:
        demo_local_endpoints()
        demo_submodule_endpoints()
    except KeyboardInterrupt:
        print("\n\n⏹️ Demo interrupted by user")
    except Exception as e:
        print(f"\n❌ Demo failed: {e}")
        import traceback

        traceback.print_exc()
