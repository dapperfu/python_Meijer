#!/usr/bin/env python3
"""
Demo script showing usage of MeijerStore class with storeInfo endpoints.

This demonstrates how to search for stores and access store information
using the comprehensive MeijerStore class generated from API analysis.

Usage:
    python demo_meijer_stores.py
"""

import sys
import json
from typing import List, Dict, Any

from meijer_store_final import MeijerStore, create_meijer_stores_from_response
# from meijer_comprehensive import MeijerComprehensiveClient


class MeijerStoreDemo:
    """
    Demo class showing MeijerStore functionality.
    
    Demonstrates store search, details access, and store information
    using the comprehensive store data from storeInfo API analysis.
    """
    
    def __init__(self):
        # Initialize demo without external dependencies
        self.base_url = "https://api.meijer.com/digital"
        
        print("🏪 Meijer Store Demo - StoreInfo API")
        print("=" * 60)
        print(f"🔧 Configuration:")
        print(f"   API Base: {self.base_url}")
        print(f"   Data Variant: 2")
        print()
    
    def demo_store_proximity_search(self):
        """Demonstrate proximity store search."""
        print("📋 Demo 1: Store Proximity Search")
        print("-" * 40)
        
        # Use coordinates from analysis (Michigan area)
        latitude = 42.82893
        longitude = -86.09048
        
        print(f"🔍 Searching for stores near ({latitude}, {longitude})...")
        
        # Simulate search results with real data structure
        stores = self._simulate_proximity_search(latitude, longitude)
        
        print(f"✅ Found {len(stores)} stores within 50 miles:")
        for i, store in enumerate(stores[:5], 1):  # Show first 5
            print(f"   {i}. {store}")
            print(f"      Address: {store.full_address}")
            print(f"      Distance: {store.distance_miles:.1f} miles")
            print(f"      Services: {', '.join(store.get_store_services()[:3])}")
            print()
    
    def demo_specific_store_details(self):
        """Demonstrate getting specific store details."""
        print("📋 Demo 2: Specific Store Details")
        print("-" * 40)
        
        # Use store ID discovered from analysis
        store_id = "217"
        print(f"🏪 Getting details for store {store_id}...")
        
        # Simulate store details with comprehensive data
        store = self._simulate_store_details(store_id)
        
        if store:
            print(f"✅ Store Details:")
            print(f"   Store ID: {store.store_id}")
            print(f"   Name: {store.display_name}")
            print(f"   Address: {store.full_address}")
            print(f"   Phone: {store.phone_number}")
            print(f"   Coordinates: {store.coordinates}")
            
            print(f"\n📋 Services Available:")
            for service in store.get_store_services():
                print(f"   ✓ {service}")
            
            print(f"\n⏰ Store Hours:")
            hours = store.get_hours_summary()
            for period, time in hours.items():
                print(f"   {period.title()}: {time}")
            
            print(f"\n📞 Contact Information:")
            contact = store.get_contact_info()
            for contact_type, info in contact.items():
                print(f"   {contact_type.replace('_', ' ').title()}: {info}")
        
        print()
    
    def demo_store_services_analysis(self):
        """Demonstrate analyzing store services."""
        print("📋 Demo 3: Store Services Analysis")
        print("-" * 40)
        
        # Create sample stores with different services
        stores = self._create_sample_stores()
        
        print("🔍 Analyzing services across stores:")
        
        # Count services
        service_counts = {}
        for store in stores:
            for service in store.get_store_services():
                service_counts[service] = service_counts.get(service, 0) + 1
        
        print(f"📊 Service availability across {len(stores)} stores:")
        for service, count in sorted(service_counts.items(), key=lambda x: x[1], reverse=True):
            percentage = (count / len(stores)) * 100
            print(f"   {service}: {count}/{len(stores)} stores ({percentage:.1f}%)")
        
        print(f"\n🏪 Store Details:")
        for store in stores:
            print(f"   {store.display_name}:")
            print(f"     Services: {', '.join(store.get_store_services())}")
            print(f"     Specialty: {self._get_store_specialty(store)}")
        
        print()
    
    def demo_distance_calculations(self):
        """Demonstrate distance calculations."""
        print("📋 Demo 4: Distance Calculations")
        print("-" * 40)
        
        # Create stores at known locations
        stores = self._create_sample_stores()
        
        # Calculate distances to a specific point
        target_lat = 43.0
        target_lng = -86.0
        
        print(f"📍 Calculating distances to ({target_lat}, {target_lng}):")
        
        # Calculate and sort by distance
        store_distances = []
        for store in stores:
            distance = store.calculate_distance_to(target_lat, target_lng)
            store_distances.append((store, distance))
        
        store_distances.sort(key=lambda x: x[1])
        
        print(f"🚗 Stores sorted by distance:")
        for i, (store, distance) in enumerate(store_distances, 1):
            print(f"   {i}. {store.display_name}: {distance:.1f} miles")
            print(f"      Location: {store.city}, {store.state}")
        
        print()
    
    def demo_store_filtering(self):
        """Demonstrate filtering stores by services."""
        print("📋 Demo 5: Store Filtering by Services")
        print("-" * 40)
        
        stores = self._create_sample_stores()
        
        # Filter examples
        filter_examples = [
            ("Pharmacy", lambda s: s.has_pharmacy()),
            ("Gas Station", lambda s: s.has_gas_station()),
            ("24 Hours", lambda s: s.is_24_hours()),
            ("Curbside Pickup", lambda s: s.has_curbside_pickup()),
            ("Alcohol Sales", lambda s: s.has_alcohol_sales()),
            ("Home Delivery", lambda s: s.has_delivery())
        ]
        
        print(f"🔍 Filtering {len(stores)} stores by services:")
        
        for service_name, filter_func in filter_examples:
            filtered_stores = [s for s in stores if filter_func(s)]
            print(f"   {service_name}: {len(filtered_stores)} stores")
            
            if filtered_stores:
                for store in filtered_stores[:2]:  # Show first 2
                    print(f"     - {store.display_name} ({store.city})")
        
        print()
    
    def demo_comprehensive_store_info(self):
        """Demonstrate comprehensive store information access."""
        print("📋 Demo 6: Comprehensive Store Information")
        print("-" * 40)
        
        # Create a store with comprehensive data
        store = self._create_comprehensive_store()
        
        print(f"🏪 Comprehensive Store Information:")
        print(f"   Store: {store}")
        print(f"   Full Details: {store.__repr__()}")
        
        print(f"\n📋 Core Information:")
        print(f"   ID: {store.store_id}")
        print(f"   Name: {store.display_name}")
        print(f"   Type: {store.unit_type or 'Standard Store'}")
        print(f"   Opened: {store.open_date or 'Date not available'}")
        print(f"   Phone: {store.phone_number}")
        
        print(f"\n📍 Location:")
        print(f"   Address: {store.full_address}")
        print(f"   Coordinates: {store.latitude}, {store.longitude}")
        print(f"   Timezone: {store.timezone or 'Not specified'}")
        
        print(f"\n🛍️ Shopping Services:")
        shopping_services = [
            ("Mobile Shopping", store.is_mobile_shopping_enabled),
            ("Mobile Payment", store.is_mobile_payment_enabled),
            ("Curbside Pickup", store.curbside_allow),
            ("Pre-Orders", store.pre_order_service_allow),
            ("Home Delivery", store.dlvry_order_service_allow),
        ]
        
        for service, available in shopping_services:
            status = "✓ Available" if available else "✗ Not available"
            print(f"   {service}: {status}")
        
        print(f"\n🍷 Alcohol Services:")
        alcohol_services = [
            ("Pickup Available", store.is_alcohol_pickupable),
            ("Delivery Available", store.is_alcohol_deliverable),
            ("Sales Restricted", store.are_alcohol_sales_restricted),
        ]
        
        for service, status in alcohol_services:
            if status is not None:
                status_str = "Yes" if status else "No"
                print(f"   {service}: {status_str}")
        
        print(f"\n⛽ Gas Station:")
        if store.has_gas_station():
            print(f"   Gas Station: Available")
            if store.fuel_prices:
                print(f"   Fuel Prices: Available")
        else:
            print(f"   Gas Station: Not available")
        
        print(f"\n👨‍⚕️ Pharmacy:")
        if store.has_pharmacy():
            print(f"   Pharmacy: Available")
            print(f"   Pharmacy Phone: {store.pharm_phone or 'Same as store'}")
            print(f"   Drive-Thru: {'Yes' if store.drive_thru else 'No'}")
            if store.clinic:
                print(f"   Clinic: Available")
        else:
            print(f"   Pharmacy: Not available")
        
        print()
    
    def _simulate_proximity_search(self, latitude: float, longitude: float) -> List[MeijerStore]:
        """Simulate proximity search with realistic data."""
        # Create mock stores based on analysis data
        mock_stores = [
            {
                'UnitId': 71,
                'Name': 'Holton Rd',
                'Address': '1800 Holton Rd',
                'City': 'North Muskegon',
                'State': 'MI',
                'Zip': '49445',
                'PhoneNumber': '2317447441',
                'Latitude': 43.28345,
                'Longitude': -86.22025,
                'Distance': 4.77,
                'IsMobileShoppingEnabled': True,
                'CurbsideAllow': 'Y',
                'PharmPhone': '2317447441',
                'MfuelFlag': True
            },
            {
                'UnitId': 217,
                'Name': 'Stadium Dr',
                'Address': '5540 Stadium Dr',
                'City': 'Kalamazoo',
                'State': 'MI',
                'Zip': '49009',
                'PhoneNumber': '2693448400',
                'Latitude': 42.25123,
                'Longitude': -85.58975,
                'Distance': 12.45,
                'IsMobileShoppingEnabled': True,
                'CurbsideAllow': 'Y',
                'DlvryOrderServiceAllow': 'Y',
                'PharmPhone': '2693448401',
                'Store24HrsFlag': True
            },
            {
                'UnitId': 152,
                'Name': 'Alpine Ave',
                'Address': '3825 Alpine Ave NW',
                'City': 'Grand Rapids',
                'State': 'MI',
                'Zip': '49544',
                'PhoneNumber': '6163632950',
                'Latitude': 42.9987,
                'Longitude': -85.6681,
                'Distance': 25.33,
                'IsMobileShoppingEnabled': True,
                'PreOrderServiceAllow': 'Y',
                'PharmPhone': '6163632951'
            }
        ]
        
        stores = []
        for store_data in mock_stores:
            store = MeijerStore.from_store_info_response(store_data)
            stores.append(store)
        
        return stores
    
    def _simulate_store_details(self, store_id: str) -> MeijerStore:
        """Simulate getting detailed store information."""
        # Comprehensive store data based on analysis
        store_data = {
            'UnitId': int(store_id),
            'Name': 'Stadium Dr',
            'Address': '5540 Stadium Dr',
            'City': 'Kalamazoo',
            'State': 'MI',
            'Zip': '49009',
            'PhoneNumber': '2693448400',
            'Latitude': 42.25123,
            'Longitude': -85.58975,
            'UnitType': 'Supercenter',
            'OpenDate': '1995-03-15',
            'TimeZone': 'EST',
            'Store24HrsFlag': True,
            'StoreWeekdayOpen': '06:00',
            'StoreWeekdayClose': '00:00',
            'StoreSatOpen': '06:00',
            'StoreSatClose': '00:00',
            'StoreSunOpen': '06:00',
            'StoreSunClose': '00:00',
            'PharmDailyOpen': '09:00',
            'PharmDailyClose': '21:00',
            'PharmSatOpen': '09:00',
            'PharmSatClose': '18:00',
            'PharmSunOpen': '10:00',
            'PharmSunClose': '18:00',
            'PharmPhone': '2693448401',
            'PharmAddress': '5540 Stadium Dr',
            'DriveThru': True,
            'Clinic': True,
            'IsMobileShoppingEnabled': True,
            'IsMobilePaymentEnabled': True,
            'CurbsideAllow': 'Y',
            'CurbsidePhone': '2693448402',
            'PreOrderServiceAllow': 'Y',
            'PreOrderPhone': '2693448403',
            'DlvryOrderServiceAllow': 'Y',
            'DlvryOrderPhone': '2693448404',
            'DeliOrderServiceAllow': 'Y',
            'DeliOrderPhone': '2693448405',
            'IsAlcoholPickupable': True,
            'IsAlcoholDeliverable': True,
            'AreAlcoholSalesRestricted': False,
            'MfuelFlag': True,
            'StoreDirName': 'John Smith',
            'StoreDirEmpId': 'JS12345'
        }
        
        return MeijerStore.from_store_info_response(store_data)
    
    def _create_sample_stores(self) -> List[MeijerStore]:
        """Create sample stores with different service combinations."""
        stores_data = [
            {
                'UnitId': 100, 'Name': 'Downtown', 'City': 'Grand Rapids', 'State': 'MI',
                'Address': '123 Main St', 'Zip': '49503', 'PhoneNumber': '6161234567',
                'Latitude': 42.9634, 'Longitude': -85.6681,
                'PharmPhone': '6161234568', 'MfuelFlag': True,
                'CurbsideAllow': 'Y', 'DlvryOrderServiceAllow': 'Y'
            },
            {
                'UnitId': 200, 'Name': 'Southside', 'City': 'Kalamazoo', 'State': 'MI',
                'Address': '456 Oak Ave', 'Zip': '49001', 'PhoneNumber': '2691234567',
                'Latitude': 42.2917, 'Longitude': -85.5872,
                'Store24HrsFlag': True, 'PreOrderServiceAllow': 'Y',
                'IsAlcoholPickupable': True
            },
            {
                'UnitId': 300, 'Name': 'Westfield', 'City': 'Lansing', 'State': 'MI',
                'Address': '789 Pine Rd', 'Zip': '48933', 'PhoneNumber': '5171234567',
                'Latitude': 42.3314, 'Longitude': -84.5467,
                'PharmPhone': '5171234568', 'Clinic': True,
                'CurbsideAllow': 'Y'
            }
        ]
        
        return [MeijerStore.from_store_info_response(data) for data in stores_data]
    
    def _create_comprehensive_store(self) -> MeijerStore:
        """Create a store with comprehensive service data."""
        return MeijerStore.from_store_info_response({
            'UnitId': 999,
            'Name': 'Flagship Store',
            'Address': '1000 Premium Blvd',
            'City': 'Ann Arbor',
            'State': 'MI',
            'Zip': '48104',
            'PhoneNumber': '7341234567',
            'Latitude': 42.2808,
            'Longitude': -83.7430,
            'UnitType': 'Supercenter Plus',
            'OpenDate': '2020-01-01',
            'TimeZone': 'EST',
            'Store24HrsFlag': False,
            'StoreWeekdayOpen': '06:00',
            'StoreWeekdayClose': '24:00',
            'PharmPhone': '7341234568',
            'DriveThru': True,
            'Clinic': True,
            'IsMobileShoppingEnabled': True,
            'IsMobilePaymentEnabled': True,
            'CurbsideAllow': 'Y',
            'PreOrderServiceAllow': 'Y',
            'DlvryOrderServiceAllow': 'Y',
            'DeliOrderServiceAllow': 'Y',
            'IsAlcoholPickupable': True,
            'IsAlcoholDeliverable': False,
            'AreAlcoholSalesRestricted': True,
            'MfuelFlag': True,
            'StoreDirName': 'Jane Doe',
            'StoreDirEmpId': 'JD67890'
        })
    
    def _get_store_specialty(self, store: MeijerStore) -> str:
        """Get store specialty based on services."""
        specialties = []
        
        if store.is_24_hours():
            specialties.append("24-Hour")
        if store.has_pharmacy() and store.clinic:
            specialties.append("Full Healthcare")
        elif store.has_pharmacy():
            specialties.append("Pharmacy")
        if store.has_gas_station():
            specialties.append("Fuel Center")
        if store.has_delivery():
            specialties.append("Home Delivery")
        
        return ", ".join(specialties) if specialties else "Standard Store"


def main():
    """Run the comprehensive MeijerStore demo."""
    demo = MeijerStoreDemo()
    
    try:
        # Run all store demos
        demo.demo_store_proximity_search()
        demo.demo_specific_store_details()
        demo.demo_store_services_analysis()
        demo.demo_distance_calculations()
        demo.demo_store_filtering()
        demo.demo_comprehensive_store_info()
        
        print("🎯 Store Demo Summary")
        print("=" * 60)
        print("✅ Proximity Search: Find stores near coordinates")
        print("✅ Store Details: Get comprehensive store information")
        print("✅ Service Analysis: Analyze services across stores")
        print("✅ Distance Calculation: Calculate distances to stores")
        print("✅ Store Filtering: Filter stores by available services")
        print("✅ Comprehensive Info: Access all store data fields")
        
        print("\n📚 Usage Examples:")
        print("""
# Basic store search
search = MeijerStoreSearch()
stores = search.find_stores_nearby(42.8289, -86.0905, radius_miles=50)

# Get specific store
store = search.get_store_details("217")
print(f"Store: {store.display_name}")
print(f"Services: {store.get_store_services()}")

# Filter stores
pharmacy_stores = [s for s in stores if s.has_pharmacy()]
gas_stations = [s for s in stores if s.has_gas_station()]

# Calculate distance
distance = store.calculate_distance_to(42.0, -86.0)
        """)
        
        print("\n🏪 MeijerStore Class Features:")
        print("- 634 stores analyzed with 190 unique fields")
        print("- Core identification: UnitId (store ID)")
        print("- Comprehensive services: Pharmacy, Gas, Curbside, Delivery")
        print("- Location data: Address, coordinates, distance calculations")
        print("- Hours and contact info: Store, pharmacy, service hours")
        print("- Boolean service checks: has_pharmacy(), has_gas_station(), etc.")
        print("- Rich data access: get_store_services(), get_contact_info()")
        
    except Exception as e:
        print(f"❌ Demo error: {e}")
        return 1
    
    return 0


if __name__ == "__main__":
    exit_code = main()
    sys.exit(exit_code) 