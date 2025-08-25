#!/usr/bin/env python3
"""
Debug script to test geocoding service
"""

import sys
import os
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

from meijer.geocoding import get_geocoding_service, FallbackGeocodingService

def test_geocoding():
    print("🔍 Testing Geocoding Service")
    print("=" * 50)
    
    # Test fallback service directly
    print("\n📋 Testing Fallback Geocoding Service:")
    fallback = FallbackGeocodingService()
    
    # Test Kendallville, IN specifically
    print("\n🏙️ Testing Kendallville, IN:")
    coords = fallback.get_city_coordinates("Kendallville", "IN")
    print(f"  Kendallville, IN -> {coords}")
    
    # Test other cities
    print("\n🏙️ Testing other cities:")
    test_cities = [
        ("Kendallville", "IN"),
        ("Grand Rapids", "MI"),
        ("Detroit", "MI"),
        ("Fort Wayne", "IN")
    ]
    
    for city, state in test_cities:
        coords = fallback.get_city_coordinates(city, state)
        print(f"  {city}, {state} -> {coords}")
    
    # Test the service factory
    print("\n🏭 Testing Service Factory:")
    geocoder = get_geocoding_service()
    print(f"  Service type: {type(geocoder).__name__}")
    
    # Test Kendallville through the factory
    print("\n🏙️ Testing Kendallville through factory:")
    coords = geocoder.get_city_coordinates("Kendallville", "IN")
    print(f"  Kendallville, IN -> {coords}")
    
    # Test ZIP codes
    print("\n📮 Testing ZIP codes:")
    test_zips = ["46755", "49508", "48823"]
    for zip_code in test_zips:
        coords = geocoder.get_zip_code_coordinates(zip_code)
        print(f"  {zip_code} -> {coords}")

if __name__ == "__main__":
    test_geocoding()
