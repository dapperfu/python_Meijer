#!/usr/bin/env python3
"""
Debug Coupon API - Troubleshoot Offers Endpoint
===============================================

Analyzes the offers API request/response to understand why we're getting 0 coupons.
Tests different request structures and validates the API interaction.
"""

import json

from meijer import Meijer


def debug_offers_api():
    """Debug the offers API to understand response structure."""
    print("🔍 DEBUGGING OFFERS API")
    print("=" * 50)
    
    client = Meijer()
    
    if not client._ensure_authenticated():
        print("❌ Not authenticated")
        return
    
    # Test 1: Basic offers request
    print("1️⃣  Testing basic offers request...")
    
    url = f"{client.api_base_url}/loyalty/mPerks/api/offers"
    headers = client._get_api_headers()
    headers.update({
        "Accept": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
        "Content-Type": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
    })
    
    # Minimal request
    request_body = {
        "sortType": "BySuggested",
        "pageSize": 50,
        "currentPage": 1,
        "offerClass": 1,
        "searchCriteria": "",
        "storeId": 0,
        "ceilingCount": 0,
        "ceilingDuration": 0,
        "rewardCouponId": 0,
        "tagId": "",
        "getOfferCountPerDepartment": True,
        "upcList": [],
        "showClippedCoupons": True,
        "showOnlySpecialOffers": False,
        "showRedeemedOffers": False,
        "offerIds": [],
        "displayReasonFilters": []
    }
    
    try:
        print(f"   • URL: {url}")
        print(f"   • Headers: {headers}")
        print(f"   • Request body: {json.dumps(request_body, indent=2)}")
        
        response = client._make_request("POST", url, headers=headers, json=request_body)
        
        print(f"   • Status code: {response.status_code}")
        print(f"   • Response headers: {dict(response.headers)}")
        
        if response.status_code == 200:
            try:
                data = response.json()
                print("   • Response structure:")
                print(f"     - Type: {type(data)}")
                print(f"     - Keys: {list(data.keys()) if isinstance(data, dict) else 'Not a dict'}")
                
                if isinstance(data, dict):
                    for key, value in data.items():
                        if isinstance(value, list):
                            print(f"     - {key}: List with {len(value)} items")
                        elif isinstance(value, dict):
                            print(f"     - {key}: Dict with keys: {list(value.keys())}")
                        else:
                            print(f"     - {key}: {type(value).__name__} = {value}")
                
                # Look for offers in different possible locations
                offers = []
                if isinstance(data, dict):
                    # Try common offer field names
                    for field in ['offers', 'coupons', 'data', 'results', 'items', 'offerCollection']:
                        if field in data:
                            potential_offers = data[field]
                            if isinstance(potential_offers, list):
                                offers = potential_offers
                                print(f"   ✅ Found offers in '{field}': {len(offers)} items")
                                break
                            elif isinstance(potential_offers, dict) and 'offers' in potential_offers:
                                offers = potential_offers['offers']
                                print(f"   ✅ Found offers in '{field}.offers': {len(offers)} items")
                                break
                
                if offers:
                    print("\n   📋 Sample offer structure:")
                    sample_offer = offers[0]
                    if isinstance(sample_offer, dict):
                        for key, value in sample_offer.items():
                            print(f"     - {key}: {type(value).__name__}")
                else:
                    print("   ⚠️  No offers found in response")
                    
            except Exception as e:
                print(f"   ❌ Error parsing JSON: {e}")
                print(f"   Raw response: {response.text[:500]}...")
        else:
            print(f"   ❌ Failed with status {response.status_code}")
            print(f"   Response: {response.text[:500]}...")
            
    except Exception as e:
        print(f"   ❌ Request failed: {e}")
    
    # Test 2: Try different parameters
    print("\n2️⃣  Testing with different parameters...")
    
    test_variants = [
        {"showClippedCoupons": False, "name": "Available only"},
        {"showOnlySpecialOffers": True, "name": "Special offers only"},
        {"pageSize": 10, "name": "Smaller page size"},
        {"offerClass": 0, "name": "Different offer class"},
    ]
    
    for variant in test_variants:
        variant_body = request_body.copy()
        variant_body.update({k: v for k, v in variant.items() if k != "name"})
        
        try:
            print(f"   • Testing: {variant['name']}")
            response = client._make_request("POST", url, headers=headers, json=variant_body)
            
            if response.status_code == 200:
                data = response.json()
                offer_count = 0
                
                if isinstance(data, dict):
                    for field in ['offers', 'coupons', 'data', 'results', 'items', 'offerCollection']:
                        if field in data and isinstance(data[field], list):
                            offer_count = len(data[field])
                            break
                        elif field in data and isinstance(data[field], dict) and 'offers' in data[field]:
                            offer_count = len(data[field]['offers'])
                            break
                
                print(f"     Result: {offer_count} offers found")
            else:
                print(f"     Result: {response.status_code} error")
                
        except Exception as e:
            print(f"     Result: Error - {e}")


def test_clipped_offers_endpoint():
    """Test the ClippedOffers endpoint specifically."""
    print("\n3️⃣  Testing ClippedOffers endpoint...")
    
    client = Meijer()
    
    if not client._ensure_authenticated():
        print("❌ Not authenticated")
        return
    
    url = f"{client.api_base_url}/loyalty/mPerks/api/offers/ClippedOffers"
    headers = client._get_api_headers()
    headers.update({
        "Accept": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
        "Content-Type": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
    })
    
    request_body = {
        "sortType": "BySuggested",
        "pageSize": 50,
        "currentPage": 1,
        "offerClass": 1,
        "searchCriteria": "",
        "storeId": 0,
        "ceilingCount": 0,
        "ceilingDuration": 0,
        "rewardCouponId": 0,
        "tagId": "",
        "getOfferCountPerDepartment": True,
        "upcList": [],
        "showClippedCoupons": True,
        "showOnlySpecialOffers": False,
        "showRedeemedOffers": False,
        "offerIds": [],
        "displayReasonFilters": []
    }
    
    try:
        response = client._make_request("POST", url, headers=headers, json=request_body)
        print(f"   • Status: {response.status_code}")
        
        if response.status_code == 200:
            data = response.json()
            print(f"   • Response keys: {list(data.keys()) if isinstance(data, dict) else 'Not dict'}")
            
            # Look for clipped offers
            clipped_count = 0
            if isinstance(data, dict):
                for field in ['offers', 'coupons', 'data', 'results', 'items']:
                    if field in data and isinstance(data[field], list):
                        clipped_count = len(data[field])
                        break
            
            print(f"   • Clipped offers found: {clipped_count}")
        else:
            print(f"   • Error: {response.text[:200]}...")
            
    except Exception as e:
        print(f"   • Exception: {e}")


def analyze_response_structure():
    """Analyze the actual response structure from mitmproxy logs."""
    print("\n4️⃣  Analyzing response from mitmproxy logs...")
    
    try:
        with open('meijer_analysis_report.json', 'r') as f:
            content = f.read()
        
        # Look for offers response structure
        if '"couponCount":' in content:
            print("   ✅ Found couponCount in logs")
            
            # Extract coupon count
            import re
            match = re.search(r'"couponCount":(\d+)', content)
            if match:
                coupon_count = match.group(1)
                print(f"   • Log shows couponCount: {coupon_count}")
            
            # Look for response structure
            if '"offerCollection":[' in content:
                print("   ✅ Found offerCollection in logs")
                print("   • Response should have 'offerCollection' field")
            
            if '"availableCouponCount":' in content:
                match = re.search(r'"availableCouponCount":(\d+)', content)
                if match:
                    available_count = match.group(1)
                    print(f"   • Available coupons in log: {available_count}")
        else:
            print("   ⚠️  No coupon data found in logs")
            
    except Exception as e:
        print(f"   ❌ Error reading logs: {e}")


def main():
    """Main debug function."""
    print("🐛 COUPON API DEBUG SESSION")
    print("=" * 60)
    print("Analyzing why offers API returns 0 coupons")
    print()
    
    # Run all debug tests
    debug_offers_api()
    test_clipped_offers_endpoint()
    analyze_response_structure()
    
    print("\n" + "=" * 60)
    print("🎯 DEBUG COMPLETE")
    print("Check the output above to understand the API response structure")


if __name__ == "__main__":
    main() 