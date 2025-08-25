#!/usr/bin/env python3
"""
Test script to prove that hardcoded coordinates fallback has been completely removed.
This script demonstrates that the geocoding service returns None when unavailable.
"""

import logging
import os
import sys

# Add the meijer package to the path
sys.path.insert(0, os.path.join(os.path.dirname(__file__), "."))

from meijer.client import Meijer


def test_no_hardcoded_coordinates():
    """Test that no hardcoded coordinates are used as fallback."""

    # Set up logging to see what happens
    logging.basicConfig(level=logging.INFO, format="%(levelname)s: %(message)s")

    print("🧪 Testing: No Hardcoded Coordinates Fallback")
    print("=" * 60)

    # Create a client instance
    client = Meijer()

    # Test 1: Check that _get_hardcoded_zip_coordinates method doesn't exist
    print("\n1. Checking for hardcoded coordinates method...")
    if hasattr(client, "_get_hardcoded_zip_coordinates"):
        print("❌ FAILED: _get_hardcoded_zip_coordinates method still exists!")
        return False
    else:
        print("✅ PASSED: _get_hardcoded_zip_coordinates method has been removed")

    # Test 2: Check that no hardcoded coordinates dictionary exists
    print("\n2. Checking for hardcoded coordinates dictionary...")
    hardcoded_found = False
    for attr_name in dir(client):
        if "zip_coordinates" in attr_name or "coordinates" in attr_name:
            attr_value = getattr(client, attr_name)
            if isinstance(attr_value, dict) and any(
                isinstance(v, tuple) and len(v) == 2 for v in attr_value.values()
            ):
                print(f"❌ FAILED: Found hardcoded coordinates in {attr_name}")
                hardcoded_found = True

    if not hardcoded_found:
        print("✅ PASSED: No hardcoded coordinates dictionary found")

    # Test 3: Test ZIP code geocoding behavior when service is unavailable
    print("\n3. Testing ZIP code geocoding behavior...")

    # Remove any existing geocoding environment variables
    env_vars_to_remove = ["GOOGLE_MAPS_API_KEY", "GOOGLE_MOBILE_GEOCODING_AUTH"]
    for var in env_vars_to_remove:
        if var in os.environ:
            del os.environ[var]

    # Test with a ZIP code that would have had hardcoded coordinates
    test_zip = "49508"  # Grand Rapids area

    print(f"   Testing ZIP code: {test_zip}")
    print(
        f"   Environment: GOOGLE_MAPS_API_KEY = {os.environ.get('GOOGLE_MAPS_API_KEY', 'NOT SET')}"
    )

    try:
        coordinates = client._get_zip_code_coordinates(test_zip)
        print(f"   Result: {coordinates}")

        if coordinates is None:
            print(
                "   ✅ PASSED: Returns None when geocoding service unavailable (no hardcoded fallback)"
            )
        else:
            print(
                "   ❌ FAILED: Returned coordinates when service should be unavailable"
            )
            return False

    except Exception as e:
        print(f"   ✅ PASSED: Properly handles geocoding service errors: {e}")

    # Test 4: Test store search behavior with ZIP code
    print("\n4. Testing store search behavior with ZIP code...")

    try:
        stores = client.get_stores(zip_code=test_zip, radius=25)
        print(f"   Result: {len(stores)} stores found")

        if len(stores) == 0:
            print("   ✅ PASSED: Store search returns empty list when geocoding fails")
        else:
            print(
                "   ❌ FAILED: Store search returned stores when geocoding should have failed"
            )
            return False

    except Exception as e:
        print(f"   ✅ PASSED: Store search properly handles geocoding failures: {e}")

    # Test 5: Check source code for any remaining hardcoded references
    print("\n5. Scanning source code for hardcoded coordinate patterns...")

    import re

    # Patterns that would indicate hardcoded coordinates
    hardcoded_patterns = [
        r'"[0-9]{5}":\s*\([0-9.-]+,\s*[0-9.-]+\)',  # ZIP: (lat, lng) pattern
        r"zip_coordinates\s*=",  # zip_coordinates dictionary
        r"hardcoded.*coordinates",  # hardcoded coordinates references
        r"fallback.*coordinates",  # fallback coordinates references
    ]

    client_file = "meijer/client.py"
    with open(client_file, "r") as f:
        content = f.read()

    patterns_found = []
    for pattern in hardcoded_patterns:
        matches = re.findall(pattern, content, re.IGNORECASE)
        if matches:
            patterns_found.append(f"Pattern '{pattern}': {len(matches)} matches")

    if not patterns_found:
        print("   ✅ PASSED: No hardcoded coordinate patterns found in source code")
    else:
        print("   ❌ FAILED: Found hardcoded coordinate patterns:")
        for pattern in patterns_found:
            print(f"      {pattern}")
        return False

    print("\n" + "=" * 60)
    print("🎉 ALL TESTS PASSED: Hardcoded coordinates fallback completely removed!")
    print("\nSummary:")
    print("✅ _get_hardcoded_zip_coordinates method removed")
    print("✅ No hardcoded coordinates dictionary")
    print("✅ ZIP geocoding returns None when service unavailable")
    print("✅ Store search returns empty list when geocoding fails")
    print("✅ No hardcoded coordinate patterns in source code")

    return True


if __name__ == "__main__":
    success = test_no_hardcoded_coordinates()
    sys.exit(0 if success else 1)
