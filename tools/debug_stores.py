#!/usr/bin/env python3
"""
Debug script to test stores API directly.
"""

import sys
import os
import requests
import json

# Add the project root to the path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

def debug_stores_api():
    """Debug the stores API directly."""
    try:
        print("Debugging stores API directly...")
        
        # Test the exact endpoint from the curl command
        url = "https://api.meijer.com/digital/storeInfo/v2/stores/proximity"
        
        # Use the parameters from the curl command
        params = {
            "latitude": 43.2705751,
            "longitude": -86.3130919,
            "miles": 50,
            "numToReturn": 10,
            "dataVariant": 2
        }
        
        # Use the headers from the curl command
        headers = {
            "accept": "application/json",
            "version": "9",
            "content-type": "application/json",
            "ocp-apim-subscription-key": "a10bc58ac484478d9b3958b1742c3a03",
            "user-agent": "Meijer/102800000 okhttp/5.1.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)"
        }
        
        print(f"Making request to: {url}")
        print(f"Parameters: {params}")
        print(f"Headers: {headers}")
        
        response = requests.get(url, params=params, headers=headers, timeout=30)
        
        print(f"Response status: {response.status_code}")
        print(f"Response headers: {dict(response.headers)}")
        
        if response.status_code == 200:
            data = response.json()
            print(f"Response data: {json.dumps(data, indent=2)}")
            
            if "stores" in data:
                print(f"Found {len(data['stores'])} stores")
                for i, store in enumerate(data['stores'][:3]):  # Show first 3
                    print(f"Store {i+1}: {store.get('UnitId', 'No ID')} - {store.get('Name', 'No Name')}")
            else:
                print("No 'stores' key in response")
                print(f"Available keys: {list(data.keys())}")
        else:
            print(f"Error response: {response.text}")
        
        return True
        
    except Exception as e:
        print(f"❌ Debug failed: {e}")
        import traceback
        traceback.print_exc()
        return False

if __name__ == "__main__":
    success = debug_stores_api()
    sys.exit(0 if success else 1)
