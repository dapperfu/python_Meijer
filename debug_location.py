#!/usr/bin/env python3
"""
Debug script to understand the actual location data structure from the API.
"""

import re

def test_location_extraction():
    """Test the location extraction patterns with sample data."""
    
    # Sample text that might appear in the API response
    test_cases = [
        "Located in Aisle B | 16 Section: 35 for easy shopping",
        "Find this item in Aisle A | Section 12",
        "Product is located in Aisle C",
        "Aisle B | 16 Section: 35",
        "B | 16 Section: 35",  # Alternative format
        "B16 Section 23",       # Direct format
        "Aisle B16 Section 23", # Another possible format
        "No location information available"
    ]
    
    print("🧪 Testing Updated Location Extraction Patterns")
    print("=" * 50)
    
    # Test the NEW regex patterns from the updated client
    patterns = [
        (r"([A-Z])(\d+)\s+Section\s+(\d+)", "Pattern 1: B16 Section 23 (direct format)"),
        (r"Aisle\s+([A-Z0-9]+)\s*\|\s*(\d+)\s*Section:\s*(\d+)", "Pattern 2: Aisle B | 16 Section: 35 (API format)"),
        (r"([A-Z0-9]+)\s*\|\s*(\d+)\s*Section:\s*(\d+)", "Pattern 3: B | 16 Section: 35 (alt API format)"),
        (r"Aisle\s+([A-Z0-9]+)\s*\|\s*Section\s+(\d+)", "Pattern 4: Aisle B | Section 16 (simplified)"),
        (r"Aisle\s+([A-Z0-9]+)", "Pattern 5: Aisle B (basic format)"),
    ]
    
    for pattern, description in patterns:
        print(f"\n🔍 {description}")
        print(f"   Regex: {pattern}")
        
        for text in test_cases:
            match = re.search(pattern, text, re.IGNORECASE)
            if match:
                groups = match.groups()
                print(f"   ✅ '{text[:40]}...' -> Groups: {groups}")
            else:
                print(f"   ❌ '{text[:40]}...' -> No match")
    
    print("\n" + "=" * 50)
    print("💡 Updated Analysis:")
    print("The new patterns now support multiple formats:")
    print("✅ B16 Section 23 (direct format)")
    print("✅ Aisle B | 16 Section: 35 (API format)")
    print("✅ B | 16 Section: 35 (alternative API format)")
    print("✅ Aisle B | Section 16 (simplified)")
    print("✅ Aisle B (basic)")
    print("\nThis should handle the different nomenclatures between")
    print("API responses and user interface displays.")

if __name__ == "__main__":
    test_location_extraction()
