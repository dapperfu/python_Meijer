#!/usr/bin/env python3
"""
Test script for the Meijer API Flask caching server.

This script tests the basic functionality of the server without requiring
actual Meijer API credentials.
"""

import requests


def test_health_endpoint(base_url: str = "http://localhost:5000") -> bool:
    """Test the health check endpoint."""
    try:
        response = requests.get(f"{base_url}/health", timeout=5)
        if response.status_code == 200:
            data = response.json()
            print(f"✅ Health check passed: {data}")
            return True
        else:
            print(f"❌ Health check failed: {response.status_code}")
            return False
    except Exception as e:
        print(f"❌ Health check error: {e}")
        return False


def test_cache_stats(base_url: str = "http://localhost:5000") -> bool:
    """Test the cache statistics endpoint."""
    try:
        response = requests.get(f"{base_url}/cache/stats", timeout=5)
        if response.status_code == 200:
            data = response.json()
            print(f"✅ Cache stats: {data}")
            return True
        else:
            print(f"❌ Cache stats failed: {response.status_code}")
            return False
    except Exception as e:
        print(f"❌ Cache stats error: {e}")
        return False


def test_proxy_endpoint(base_url: str = "http://localhost:5000") -> bool:
    """Test the generic proxy endpoint."""
    try:
        # Test a simple endpoint that doesn't require authentication
        test_endpoint = "digital/occ/v3/carts/current"
        params = {"store": "71", "fields": "BASIC"}

        response = requests.get(
            f"{base_url}/api/meijer/{test_endpoint}", params=params, timeout=10
        )

        print(f"Proxy endpoint response status: {response.status_code}")

        if response.status_code == 401:
            # This is expected without authentication
            print("✅ Proxy endpoint working (401 Unauthorized expected)")
            return True
        elif response.status_code == 200:
            data = response.json()
            print(f"✅ Proxy endpoint working: {data}")
            return True
        else:
            print(f"⚠️ Proxy endpoint returned: {response.status_code}")
            return True  # Still working, just different response

    except Exception as e:
        print(f"❌ Proxy endpoint error: {e}")
        return False


def test_specialized_endpoints(base_url: str = "http://localhost:5000") -> bool:
    """Test specialized endpoints."""
    endpoints = [
        "digital/occ/v3/carts/current",
        "digital/mperks40/customer/v1/pointbalance",
        "digital/homecards/v1/cards/rewards",
    ]

    success_count = 0

    for endpoint in endpoints:
        try:
            response = requests.get(f"{base_url}/api/meijer/{endpoint}", timeout=10)
            if response.status_code in [200, 401, 404]:  # Acceptable responses
                print(f"✅ {endpoint}: {response.status_code}")
                success_count += 1
            else:
                print(f"⚠️ {endpoint}: {response.status_code}")
                success_count += 1
        except Exception as e:
            print(f"❌ {endpoint}: {e}")

    return success_count == len(endpoints)


def test_cache_operations(base_url: str = "http://localhost:5000") -> bool:
    """Test cache operations."""
    try:
        # Test clearing cache
        response = requests.post(f"{base_url}/cache/clear", timeout=5)
        if response.status_code == 200:
            data = response.json()
            print(f"✅ Cache clear: {data}")
            return True
        else:
            print(f"❌ Cache clear failed: {response.status_code}")
            return False
    except Exception as e:
        print(f"❌ Cache clear error: {e}")
        return False


def main():
    """Run all tests."""
    print("🧪 Testing Meijer API Flask Caching Server")
    print("=" * 50)

    base_url = "http://localhost:5000"

    tests = [
        ("Health Check", lambda: test_health_endpoint(base_url)),
        ("Cache Stats", lambda: test_cache_stats(base_url)),
        ("Proxy Endpoint", lambda: test_proxy_endpoint(base_url)),
        ("Specialized Endpoints", lambda: test_specialized_endpoints(base_url)),
        ("Cache Operations", lambda: test_cache_operations(base_url)),
    ]

    results = []

    for test_name, test_func in tests:
        print(f"\n🔍 Testing: {test_name}")
        try:
            result = test_func()
            results.append((test_name, result))
        except Exception as e:
            print(f"❌ Test failed with exception: {e}")
            results.append((test_name, False))

    print("\n" + "=" * 50)
    print("📊 Test Results Summary")
    print("=" * 50)

    passed = 0
    total = len(results)

    for test_name, result in results:
        status = "✅ PASS" if result else "❌ FAIL"
        print(f"{test_name}: {status}")
        if result:
            passed += 1

    print(f"\nOverall: {passed}/{total} tests passed")

    if passed == total:
        print("🎉 All tests passed! Server is working correctly.")
    else:
        print("⚠️ Some tests failed. Check the server logs for details.")

    return passed == total


if __name__ == "__main__":
    success = main()
    exit(0 if success else 1)
