#!/usr/bin/env python3
"""
Simple demo showing MeijerStore class functionality.

This demonstrates the comprehensive MeijerStore class generated from
storeInfo API analysis with real store data structures.
"""

import sys

from meijer import MeijerStore


def demo_store_creation():
    """Demo creating MeijerStore objects from API data."""
    print("📋 Demo 1: Creating MeijerStore from API Data")
    print("-" * 50)

    # Sample store data based on real API analysis
    store_data = {
        "UnitId": 217,
        "Name": "Stadium Dr",
        "Address": "5540 Stadium Dr",
        "City": "Kalamazoo",
        "State": "MI",
        "Zip": "49009",
        "PhoneNumber": "2693448400",
        "Latitude": 42.25123,
        "Longitude": -85.58975,
        "Distance": 12.45,
        "UnitType": "Supercenter",
        "TimeZone": "EST",
        "Store24HrsFlag": True,
        "PharmPhone": "2693448401",
        "DriveThru": True,
        "Clinic": True,
        "IsMobileShoppingEnabled": True,
        "CurbsideAllow": "Y",
        "DlvryOrderServiceAllow": "Y",
        "IsAlcoholPickupable": True,
        "MfuelFlag": True,
    }

    # Create MeijerStore object
    store = MeijerStore.from_store_info_response(store_data)

    print(f"✅ Created store: {store}")
    print(f"   Store ID: {store.store_id}")
    print(f"   Display Name: {store.display_name}")
    print(f"   Full Address: {store.full_address}")
    print(f"   Distance: {store.distance_miles} miles")
    print()


def demo_store_services():
    """Demo checking store services."""
    print("📋 Demo 2: Store Services")
    print("-" * 50)

    # Create store with various services
    store_data = {
        "UnitId": 217,
        "Name": "Full Service Store",
        "Address": "123 Main St",
        "City": "Grand Rapids",
        "State": "MI",
        "Zip": "49503",
        "PhoneNumber": "6161234567",
        "Latitude": 42.9634,
        "Longitude": -85.6681,
        "PharmPhone": "6161234568",
        "MfuelFlag": True,
        "CurbsideAllow": "Y",
        "DlvryOrderServiceAllow": "Y",
        "PreOrderServiceAllow": "Y",
        "DeliOrderServiceAllow": "Y",
        "IsAlcoholPickupable": True,
        "IsAlcoholDeliverable": True,
        "Store24HrsFlag": True,
        "DriveThru": True,
        "Clinic": True,
    }

    store = MeijerStore.from_store_info_response(store_data)

    print(f"🏪 {store.display_name} Services:")

    # Check individual services
    service_checks = [
        ("Pharmacy", store.has_pharmacy()),
        ("Gas Station", store.has_gas_station()),
        ("24 Hours", store.is_24_hours()),
        ("Curbside Pickup", store.has_curbside_pickup()),
        ("Home Delivery", store.has_delivery()),
        ("Alcohol Sales", store.has_alcohol_sales()),
    ]

    for service, available in service_checks:
        status = "✓ Available" if available else "✗ Not available"
        print(f"   {service}: {status}")

    print(f"\n📋 All Services: {', '.join(store.get_store_services())}")
    print()


def demo_contact_and_hours():
    """Demo accessing contact info and hours."""
    print("📋 Demo 3: Contact Info and Hours")
    print("-" * 50)

    store_data = {
        "UnitId": 152,
        "Name": "Alpine Ave",
        "Address": "3825 Alpine Ave NW",
        "City": "Grand Rapids",
        "State": "MI",
        "Zip": "49544",
        "PhoneNumber": "6163632950",
        "Latitude": 42.9987,
        "Longitude": -85.6681,
        "StoreWeekdayOpen": "06:00",
        "StoreWeekdayClose": "24:00",
        "StoreSatOpen": "06:00",
        "StoreSatClose": "24:00",
        "StoreSunOpen": "07:00",
        "StoreSunClose": "23:00",
        "PharmDailyOpen": "09:00",
        "PharmDailyClose": "21:00",
        "PharmPhone": "6163632951",
        "CurbsidePhone": "6163632952",
        "DlvryOrderPhone": "6163632953",
    }

    store = MeijerStore.from_store_info_response(store_data)

    print(f"🏪 {store.display_name}")

    print("\n📞 Contact Information:")
    contact = store.get_contact_info()
    for contact_type, info in contact.items():
        print(f"   {contact_type.replace('_', ' ').title()}: {info}")

    print("\n⏰ Store Hours:")
    hours = store.get_hours_summary()
    for period, time in hours.items():
        print(f"   {period.title()}: {time}")

    print()


def demo_distance_calculation():
    """Demo distance calculations."""
    print("📋 Demo 4: Distance Calculations")
    print("-" * 50)

    # Create stores at different locations
    stores_data = [
        {
            "UnitId": 100,
            "Name": "North Store",
            "City": "Grand Rapids",
            "State": "MI",
            "Address": "1000 North Ave",
            "Zip": "49503",
            "PhoneNumber": "6161111111",
            "Latitude": 43.0,
            "Longitude": -85.5,
        },
        {
            "UnitId": 200,
            "Name": "South Store",
            "City": "Kalamazoo",
            "State": "MI",
            "Address": "2000 South Ave",
            "Zip": "49001",
            "PhoneNumber": "2692222222",
            "Latitude": 42.2,
            "Longitude": -85.6,
        },
        {
            "UnitId": 300,
            "Name": "East Store",
            "City": "Lansing",
            "State": "MI",
            "Address": "3000 East Ave",
            "Zip": "48933",
            "PhoneNumber": "5173333333",
            "Latitude": 42.3,
            "Longitude": -84.5,
        },
    ]

    stores = [MeijerStore.from_store_info_response(data) for data in stores_data]

    # Calculate distances from a central point
    center_lat, center_lng = 42.5, -85.0
    print(f"📍 Calculating distances from ({center_lat}, {center_lng}):")

    store_distances = []
    for store in stores:
        distance = store.calculate_distance_to(center_lat, center_lng)
        store_distances.append((store, distance))

    # Sort by distance
    store_distances.sort(key=lambda x: x[1])

    print("🚗 Stores by distance:")
    for i, (store, distance) in enumerate(store_distances, 1):
        print(f"   {i}. {store.display_name}: {distance:.1f} miles")
        print(f"      Location: {store.coordinates}")

    print()


def demo_proximity_search():
    """Demo creating stores from proximity search response."""
    print("📋 Demo 5: Proximity Search Response")
    print("-" * 50)

    # Simulate API response with multiple stores
    api_response = {
        "store": [
            {
                "UnitId": 71,
                "Name": "Holton Rd",
                "Address": "1800 Holton Rd",
                "City": "North Muskegon",
                "State": "MI",
                "Zip": "49445",
                "PhoneNumber": "2317447441",
                "Latitude": 43.28345,
                "Longitude": -86.22025,
                "Distance": 4.77,
                "MfuelFlag": True,
                "CurbsideAllow": "Y",
            },
            {
                "UnitId": 217,
                "Name": "Stadium Dr",
                "Address": "5540 Stadium Dr",
                "City": "Kalamazoo",
                "State": "MI",
                "Zip": "49009",
                "PhoneNumber": "2693448400",
                "Latitude": 42.25123,
                "Longitude": -85.58975,
                "Distance": 12.45,
                "Store24HrsFlag": True,
                "PharmPhone": "2693448401",
                "DlvryOrderServiceAllow": "Y",
            },
            {
                "UnitId": 152,
                "Name": "Alpine Ave",
                "Address": "3825 Alpine Ave NW",
                "City": "Grand Rapids",
                "State": "MI",
                "Zip": "49544",
                "PhoneNumber": "6163632950",
                "Latitude": 42.9987,
                "Longitude": -85.6681,
                "Distance": 25.33,
                "PharmPhone": "6163632951",
                "PreOrderServiceAllow": "Y",
            },
        ]
    }

    # Create stores from API response
    stores = create_meijer_stores_from_response(api_response)

    print(f"🔍 Found {len(stores)} stores from proximity search:")

    for i, store in enumerate(stores, 1):
        print(f"\n   {i}. {store}")
        print(f"      Address: {store.full_address}")
        print(f"      Distance: {store.distance_miles:.1f} miles")
        print(f"      Services: {', '.join(store.get_store_services())}")

    print()


def demo_comprehensive_store():
    """Demo comprehensive store with all features."""
    print("📋 Demo 6: Comprehensive Store Information")
    print("-" * 50)

    # Create store with extensive data
    comprehensive_data = {
        "UnitId": 999,
        "Name": "Flagship Store",
        "Address": "1000 Premium Blvd",
        "City": "Ann Arbor",
        "State": "MI",
        "Zip": "48104",
        "PhoneNumber": "7341234567",
        "Latitude": 42.2808,
        "Longitude": -83.7430,
        "UnitType": "Supercenter Plus",
        "OpenDate": "2020-01-01",
        "TimeZone": "EST",
        "Store24HrsFlag": False,
        "StoreWeekdayOpen": "06:00",
        "StoreWeekdayClose": "24:00",
        "StoreSatOpen": "06:00",
        "StoreSatClose": "24:00",
        "StoreSunOpen": "07:00",
        "StoreSunClose": "23:00",
        "PharmDailyOpen": "09:00",
        "PharmDailyClose": "21:00",
        "PharmPhone": "7341234568",
        "PharmAddress": "1000 Premium Blvd",
        "DriveThru": True,
        "Clinic": True,
        "IsMobileShoppingEnabled": True,
        "IsMobilePaymentEnabled": True,
        "CurbsideAllow": "Y",
        "CurbsidePhone": "7341234570",
        "PreOrderServiceAllow": "Y",
        "PreOrderPhone": "7341234571",
        "DlvryOrderServiceAllow": "Y",
        "DlvryOrderPhone": "7341234572",
        "DeliOrderServiceAllow": "Y",
        "DeliOrderPhone": "7341234573",
        "IsAlcoholPickupable": True,
        "IsAlcoholDeliverable": False,
        "AreAlcoholSalesRestricted": True,
        "AlcoholSaleRestrictedSunStart": "12:00",
        "AlcoholSaleRestrictedSunEnd": "20:00",
        "MfuelFlag": True,
        "StoreDirName": "Jane Doe",
        "StoreDirEmpId": "JD67890",
    }

    store = MeijerStore.from_store_info_response(comprehensive_data)

    print(f"🏪 {store.display_name}")
    print(f"   String representation: {store}")
    print(f"   Object representation: {store.__repr__()}")

    print("\n📋 Core Information:")
    print(f"   Store ID: {store.store_id}")
    print(f"   Type: {store.unit_type}")
    print(f"   Opened: {store.open_date}")
    print(f"   Timezone: {store.timezone}")
    print(f"   Director: {store.store_dir_name}")

    print("\n📍 Location Details:")
    print(f"   Full Address: {store.full_address}")
    print(f"   Coordinates: {store.coordinates}")

    print("\n🛍️ Shopping Services:")
    shopping_features = [
        ("Mobile Shopping", store.is_mobile_shopping_enabled),
        ("Mobile Payment", store.is_mobile_payment_enabled),
        ("Curbside Pickup", store.curbside_allow),
        ("Pre-Orders", store.pre_order_service_allow),
        ("Home Delivery", store.dlvry_order_service_allow),
        ("Deli Orders", store.deli_order_service_allow),
    ]

    for feature, enabled in shopping_features:
        status = "✓ Yes" if enabled else "✗ No"
        print(f"   {feature}: {status}")

    print("\n👨‍⚕️ Healthcare Services:")
    healthcare_features = [
        ("Pharmacy", store.has_pharmacy()),
        ("Drive-Thru", store.drive_thru),
        ("Clinic", store.clinic),
    ]

    for feature, available in healthcare_features:
        status = "✓ Available" if available else "✗ Not available"
        print(f"   {feature}: {status}")

    print("\n🍷 Alcohol Services:")
    print(f"   Pickup: {'✓ Yes' if store.is_alcohol_pickupable else '✗ No'}")
    print(f"   Delivery: {'✓ Yes' if store.is_alcohol_deliverable else '✗ No'}")
    print(f"   Restricted: {'Yes' if store.are_alcohol_sales_restricted else 'No'}")
    if store.alcohol_sale_restricted_sun_start:
        print(
            f"   Sunday Hours: {store.alcohol_sale_restricted_sun_start} - {store.alcohol_sale_restricted_sun_end}"
        )

    print("\n⛽ Additional Services:")
    print(
        f"   Gas Station: {'✓ Available' if store.has_gas_station() else '✗ Not available'}"
    )
    print(f"   24 Hours: {'✓ Yes' if store.is_24_hours() else '✗ No'}")

    print(f"\n📋 All Services: {', '.join(store.get_store_services())}")

    print()


def main():
    """Run all MeijerStore demos."""
    print("🏪 Meijer Store Class Demo")
    print("=" * 70)
    print("Generated from storeInfo API analysis:")
    print("- 634 stores analyzed")
    print("- 190 unique fields discovered")
    print("- Comprehensive service detection")
    print()

    try:
        demo_store_creation()
        demo_store_services()
        demo_contact_and_hours()
        demo_distance_calculation()
        demo_proximity_search()
        demo_comprehensive_store()

        print("🎯 Demo Summary")
        print("=" * 70)
        print("✅ Store Creation: MeijerStore.from_store_info_response()")
        print("✅ Service Detection: has_pharmacy(), has_gas_station(), etc.")
        print("✅ Contact Info: get_contact_info(), get_hours_summary()")
        print("✅ Distance Calc: calculate_distance_to(lat, lng)")
        print("✅ Bulk Creation: create_meijer_stores_from_response()")
        print("✅ Rich Data Access: All 190 discovered fields available")

        print("\n📚 Key Usage Patterns:")
        print("""
# Create store from API data
store = MeijerStore.from_store_info_response(api_data)

# Check services
if store.has_pharmacy():
    print(f"Pharmacy phone: {store.pharm_phone}")

# Get store info
print(f"Store: {store.display_name}")
print(f"Address: {store.full_address}")
print(f"Services: {store.get_store_services()}")

# Calculate distance
distance = store.calculate_distance_to(42.0, -86.0)

# Create multiple stores
stores = create_meijer_stores_from_response(api_response)
        """)

        print("\n🏪 MeijerStore Features:")
        print("- Core ID: unit_id (UnitId from API)")
        print("- Rich services: Pharmacy, Gas, Curbside, Delivery, Alcohol")
        print("- Location data: Full address, coordinates, distance calculation")
        print("- Contact info: Multiple phone numbers for different services")
        print("- Hours: Store, pharmacy, and service-specific hours")
        print("- Boolean checks: Intuitive service availability methods")
        print("- String representations: Human-readable store descriptions")

    except Exception as e:
        print(f"❌ Demo error: {e}")
        return 1

    return 0


if __name__ == "__main__":
    exit_code = main()
    sys.exit(exit_code)
