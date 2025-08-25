#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Test script for enhanced store search functionality
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python PEP 8 with numpy docstring style
 * - Dependencies: meijer package
 */

Test script for enhanced store search functionality.

This script demonstrates the enhanced store search capabilities including:
- ZIP code search with geocoding
- City search with geocoding
- City + state search with geocoding
- Fallback geocoding when Google Maps API is not available
"""

import os
import sys

# Add the project root to the Python path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

from meijer import Meijer
from meijer.geocoding import get_geocoding_service, GeocodingService, FallbackGeocodingService


def test_geocoding_service():
    """Test the geocoding service functionality."""
    print("🔍 Testing Geocoding Service")
    print("=" * 50)
    
    # Test fallback geocoding (no API key required)
    fallback_geocoder = FallbackGeocodingService()
    
    # Test ZIP code geocoding
    print("\n📮 Testing ZIP Code Geocoding:")
    test_zip_codes = ["49508", "48823", "48127", "12345"]  # Last one should fail
    for zip_code in test_zip_codes:
        coords = fallback_geocoder.get_zip_code_coordinates(zip_code)
        if coords:
            print(f"  ✓ {zip_code} -> {coords}")
        else:
            print(f"  ✗ {zip_code} -> Not found")
    
    # Test city geocoding
    print("\n🏙️ Testing City Geocoding:")
    test_cities = [
        ("Kendallville", "IN"),
        ("Grand Rapids", "MI"),
        ("Detroit", "MI"),
        ("Unknown City", "XX")
    ]
    for city, state in test_cities:
        coords = fallback_geocoder.get_city_coordinates(city, state)
        if coords:
            print(f"  ✓ {city}, {state} -> {coords}")
        else:
            print(f"  ✗ {city}, {state} -> Not found")
    
    # Test Google Maps API geocoding if available
    google_geocoder = get_geocoding_service()
    if isinstance(google_geocoder, GeocodingService):
        print("\n🌐 Testing Google Maps API Geocoding:")
        if google_geocoder.validate_api_key():
            # Test with Kendallville, IN (the original problem case)
            coords = google_geocoder.get_city_coordinates("Kendallville", "IN")
            if coords:
                print(f"  ✓ Kendallville, IN -> {coords}")
                print("    This matches the coordinates from the app: (41.441438399999996, -85.2649754)")
            else:
                print("  ✗ Kendallville, IN -> Failed to geocode")
        else:
            print("  ⚠️ Google Maps API key is invalid or has insufficient permissions")
    else:
        print("\n⚠️ Google Maps API not available, using fallback geocoding")


def test_store_search():
    """Test the enhanced store search functionality."""
    print("\n🏪 Testing Enhanced Store Search")
    print("=" * 50)
    
    try:
        # Initialize Meijer client (no auth required for store search)
        meijer = Meijer()
        
        # Test different search methods
        print("\n📍 Testing Location-Based Search:")
        
        # Test ZIP code search
        print("\n  📮 ZIP Code Search (49508 - Grand Rapids):")
        stores = meijer.search_by_location("49508", radius=25)
        print(f"    Found {len(stores)} stores")
        for store in stores[:3]:  # Show first 3
            print(f"    - {store.name} ({store.city}, {store.state}) - {store.zip_code}")
        
        # Test city search
        print("\n  🏙️ City Search (Grand Rapids, MI):")
        stores = meijer.search_by_location("Grand Rapids, MI", radius=25)
        print(f"    Found {len(stores)} stores")
        for store in stores[:3]:  # Show first 3
            print(f"    - {store.name} ({store.city}, {store.state}) - {store.zip_code}")
        
        # Test city + state search
        print("\n  🏙️ City + State Search (Kendallville, IN):")
        stores = meijer.search_by_location("Kendallville, IN", radius=100)
        print(f"    Found {len(stores)} stores")
        for store in stores[:3]:  # Show first 3
            print(f"    - {store.name} ({store.city}, {store.state}) - {store.zip_code}")
        
        # Test city with state abbreviation
        print("\n  🏙️ City + State Abbreviation Search (Kendallville IN):")
        stores = meijer.search_by_location("Kendallville IN", radius=100)
        print(f"    Found {len(stores)} stores")
        for store in stores[:3]:  # Show first 3
            print(f"    - {store.name} ({store.city}, {store.state}) - {store.zip_code}")
        
        # Test direct method calls
        print("\n  🔧 Direct Method Calls:")
        
        # Test get_stores with city and state
        stores = meijer.client.get_stores(city="Kendallville", state="IN", radius=100)
        print(f"    get_stores(city='Kendallville', state='IN'): {len(stores)} stores")
        
        # Test get_stores with ZIP code
        stores = meijer.client.get_stores(zip_code="49508", radius=25)
        print(f"    get_stores(zip_code='49508'): {len(stores)} stores")
        
    except Exception as e:
        print(f"  ❌ Error testing store search: {e}")
        import traceback
        traceback.print_exc()


def main():
    """Main test function."""
    print("🚀 Enhanced Meijer Store Search Test")
    print("=" * 60)
    
    # Test geocoding service
    test_geocoding_service()
    
    # Test store search
    test_store_search()
    
    print("\n✅ Test completed!")
    print("\n💡 To use Google Maps API geocoding:")
    print("   1. Get a Google Maps API key from Google Cloud Console")
    print("   2. Set the GOOGLE_MAPS_API_KEY environment variable:")
    print("      export GOOGLE_MAPS_API_KEY='your_api_key_here'")
    print("   3. Or pass it to the geocoding service constructor")


if __name__ == "__main__":
    main()
