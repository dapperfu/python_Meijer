#!/usr/bin/env python3
"""
Debug Constructor.io API Response
================================

This script tests the Constructor.io API directly to see what the response structure looks like.
"""

import requests
import json

def test_constructor_api():
    """Test Constructor.io API directly."""
    
    # API key from APK analysis
    api_key = "key_GdYuTcnduTUtsZd6"
    
    # Test barcode
    barcode = "049000050103"  # Coca-Cola Classic 12oz
    
    # Constructor.io search endpoint
    url = f"https://ac.cnstrc.com/search/{barcode}"
    
    # Try different parameter combinations
    test_params = [
        {
            "key": api_key,
            "num_results_per_page": 10,
            "page": 1,
        },
        {
            "key": api_key,
            "results_per_page": 10,  # Try original parameter name
            "page": 1,
        },
        {
            "key": api_key,
            "page": 1,
        },
        {
            "key": api_key,
        }
    ]
    
    print(f"🔍 Testing Constructor.io API for barcode: {barcode}")
    print(f"🌐 URL: {url}")
    print("=" * 60)
    
    for i, params in enumerate(test_params, 1):
        print(f"\n📋 Test {i}: Parameters: {params}")
        
        try:
            response = requests.get(url, params=params, timeout=10)
            
            print(f"   Status: {response.status_code}")
            print(f"   Headers: {dict(response.headers)}")
            
            if response.status_code == 200:
                try:
                    data = response.json()
                    print(f"   ✅ Success! Response structure:")
                    print(f"      Type: {type(data)}")
                    print(f"      Keys: {list(data.keys()) if isinstance(data, dict) else 'Not a dict'}")
                    
                    if isinstance(data, dict):
                        for key, value in data.items():
                            if isinstance(value, list):
                                print(f"      {key}: List with {len(value)} items")
                                if value and len(value) > 0:
                                    print(f"        First item type: {type(value[0])}")
                                    if isinstance(value[0], dict):
                                        print(f"        First item keys: {list(value[0].keys())}")
                            elif isinstance(value, dict):
                                print(f"      {key}: Dict with keys: {list(value.keys())}")
                            else:
                                print(f"      {key}: {type(value).__name__} = {value}")
                    
                    # Pretty print the first part of the response
                    print(f"\n   📄 Response Preview:")
                    print(json.dumps(data, indent=2)[:1000] + "..." if len(json.dumps(data, indent=2)) > 1000 else json.dumps(data, indent=2))
                    
                except json.JSONDecodeError as e:
                    print(f"   ❌ Failed to parse JSON: {e}")
                    print(f"   Raw response: {response.text[:500]}...")
                    
            else:
                print(f"   ❌ HTTP Error: {response.text}")
                
        except Exception as e:
            print(f"   ❌ Request failed: {e}")
        
        print("-" * 40)

    # Test generic product search
    print(f"\n🔍 Testing generic product search: 'coca cola'")
    generic_url = "https://ac.cnstrc.com/search/coca%20cola"
    
    try:
        response = requests.get(generic_url, params={"key": api_key}, timeout=10)
        
        print(f"   Status: {response.status_code}")
        
        if response.status_code == 200:
            try:
                data = response.json()
                print(f"   ✅ Success! Response structure:")
                print(f"      Type: {type(data)}")
                print(f"      Keys: {list(data.keys()) if isinstance(data, dict) else 'Not a dict'}")
                
                if isinstance(data, dict) and "response" in data:
                    response_data = data["response"]
                    results = response_data.get("results", [])
                    total_results = response_data.get("total_num_results", 0)
                    
                    print(f"      Total results: {total_results}")
                    print(f"      Results count: {len(results)}")
                    
                    if results and len(results) > 0:
                        first_result = results[0]
                        print(f"      First result type: {type(first_result)}")
                        if isinstance(first_result, dict):
                            print(f"      First result keys: {list(first_result.keys())}")
                            
                            # Look for product data
                            if "data" in first_result:
                                product_data = first_result["data"]
                                print(f"      Product data keys: {list(product_data.keys())}")
                                
                                # Check for UPC/barcode fields
                                upc_fields = [k for k in product_data.keys() if "upc" in k.lower() or "barcode" in k.lower() or "sku" in k.lower()]
                                print(f"      UPC/Barcode fields: {upc_fields}")
                                
                                for field in upc_fields:
                                    print(f"        {field}: {product_data.get(field)}")
                    
                    # Show a sample of the results
                    print(f"\n   📄 Sample Results Preview:")
                    if results:
                        print(json.dumps(results[0] if results else {}, indent=2)[:800] + "..." if len(json.dumps(results[0] if results else {}, indent=2)) > 800 else json.dumps(results[0] if results else {}, indent=2))
                    else:
                        print("No results found")
                        
            except json.JSONDecodeError as e:
                print(f"   ❌ Failed to parse JSON: {e}")
                print(f"   Raw response: {response.text[:500]}...")
                
        else:
            print(f"   ❌ HTTP Error: {response.text}")
            
    except Exception as e:
        print(f"   ❌ Request failed: {e}")
    
    print("=" * 60)

if __name__ == "__main__":
    test_constructor_api() 