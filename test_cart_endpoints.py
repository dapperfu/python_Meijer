#!/usr/bin/env python3
"""Test script to check cart-related API endpoints."""

import os
import sys

# Add the meijer package to the path
sys.path.insert(0, os.path.join(os.path.dirname(__file__), "meijer"))

try:
    from meijer.client import Meijer

    print("🚀 Testing cart endpoints...")

    # Initialize client
    client = Meijer()
    print(f"✅ Client initialized, auth status: {client.auth_status.name}")

    if client.auth_status.name != "AUTHENTICATED":
        print("❌ Client not authenticated, cannot test endpoints")
        sys.exit(1)

    # Test basic cart endpoint
    print("\n🛒 Testing basic cart endpoint...")
    try:
        response = client._make_request(
            "GET",
            f"{client.api_base_url}/digital/occ/v3/carts/current",
            params={"store": "217", "fields": "FULL"},
        )
        print(f"✅ Cart endpoint response: {response.status_code}")
        if response.status_code == 200:
            cart_data = response.json()
            print(f"   Cart items: {len(cart_data.get('entries', []))}")
        else:
            print(f"   Error response: {response.text[:200]}")
    except Exception as e:
        print(f"❌ Cart endpoint failed: {e}")

    # Test fulfillment endpoint
    print("\n🕐 Testing fulfillment endpoint...")
    try:
        response = client._make_request(
            "POST",
            f"{client.api_base_url}/digital/hybris/v3/fulfillment/reservationslots",
            json_data={
                "store": "217",
                "deliveryPartner": "SHIPT",
                "fulfillmentType": "pickup",
                "fulfillmentEligibility": "NORMAL",
                "curbsidePartner": "MI9",
                "date": "2025-08-19",
            },
            headers=client._get_api_headers(),
        )
        print(f"✅ Fulfillment endpoint response: {response.status_code}")
        if response.status_code == 200:
            slots_data = response.json()
            print(f"   Slots data: {slots_data}")
        else:
            print(f"   Error response: {response.text[:200]}")
    except Exception as e:
        print(f"❌ Fulfillment endpoint failed: {e}")

    # Test alternative fulfillment endpoint
    print("\n🔄 Testing alternative fulfillment endpoint...")
    try:
        response = client._make_request(
            "GET",
            f"{client.api_base_url}/digital/occ/v3/fulfillment/slots",
            params={"store": "217", "type": "pickup"},
        )
        print(f"✅ Alternative fulfillment endpoint response: {response.status_code}")
        if response.status_code == 200:
            slots_data = response.json()
            print(f"   Slots data: {slots_data}")
        else:
            print(f"   Error response: {response.text[:200]}")
    except Exception as e:
        print(f"❌ Alternative fulfillment endpoint failed: {e}")

    # Test orders endpoint
    print("\n📋 Testing orders endpoint...")
    try:
        response = client._make_request(
            "GET",
            f"{client.api_base_url}/digital/occ/v3/orders",
            params={"currentPage": 0, "pageSize": 5, "fields": "FULL"},
        )
        print(f"✅ Orders endpoint response: {response.status_code}")
        if response.status_code == 200:
            orders_data = response.json()
            print(f"   Orders count: {len(orders_data.get('orders', []))}")
        else:
            print(f"   Error response: {response.text[:200]}")
    except Exception as e:
        print(f"❌ Orders endpoint failed: {e}")

    print("\n🏁 Testing completed!")

except Exception as e:
    print(f"❌ Test failed: {e}")
    import traceback

    traceback.print_exc()
