#!/usr/bin/env python3
"""
Implementation Comparison Script

This script compares our Meijer API implementation with what the actual
Meijer app is doing based on log analysis.
"""

import json
from pathlib import Path
from typing import Dict, List, Any, Set

def load_log_analysis() -> Dict[str, Any]:
    """Load the log analysis results."""
    try:
        with open("log_analysis_results.json", 'r') as f:
            return json.load(f)
    except FileNotFoundError:
        print("❌ log_analysis_results.json not found. Run analyze_logs.py first.")
        return {}

def analyze_store_endpoints(api_calls: List[Dict]) -> Dict[str, Any]:
    """Analyze store-related API endpoints."""
    store_endpoints = {}
    
    for call in api_calls:
        url = call["url"]
        if "store" in url.lower():
            # Extract the endpoint path
            path = url.split("api.meijer.com")[1] if "api.meijer.com" in url else url
            if path not in store_endpoints:
                store_endpoints[path] = []
            store_endpoints[path].append(call)
    
    return store_endpoints

def analyze_auth_patterns(auth_calls: List[Dict]) -> Dict[str, Any]:
    """Analyze authentication patterns."""
    auth_patterns = {}
    
    for call in auth_calls:
        url = call["url"]
        if "id.meijer.com" in url:
            # Extract the endpoint path
            path = url.split("id.meijer.com")[1] if "id.meijer.com" in url else url
            if path not in auth_patterns:
                auth_patterns[path] = []
            auth_patterns[path].append(call)
    
    return auth_patterns

def compare_with_our_implementation() -> Dict[str, Any]:
    """Compare our implementation with the actual app behavior."""
    
    # Our implemented endpoints
    our_endpoints = {
        "stores": [
            "/digital/storeInfo/v2/stores/proximity",  # We use this
            "/digital/storeInfo/stores/{id}",          # We use this
        ],
        "auth": [
            "/oauth2/authorize",                       # We use this
            "/oauth2/token",                          # We use this
        ],
        "cart": [
            "/digital/occ/v3/carts/current",          # We use this
        ],
        "mperks": [
            "/loyalty/mPerks/api/offers",             # We use this
            "/loyalty/mPerks/api/customer/EmailVerificationSpiffs",  # We use this
        ]
    }
    
    # Load log analysis
    analysis = load_log_analysis()
    if not analysis:
        return {}
    
    api_calls = analysis.get("sample_api_calls", [])
    auth_calls = analysis.get("sample_auth_calls", [])
    
    # Analyze what the app actually uses
    app_store_endpoints = analyze_store_endpoints(api_calls)
    app_auth_patterns = analyze_auth_patterns(auth_calls)
    
    # Compare implementations
    comparison = {
        "our_implementation": our_endpoints,
        "app_actual_usage": {
            "store_endpoints": app_store_endpoints,
            "auth_patterns": app_auth_patterns,
            "top_api_endpoints": analysis.get("api_analysis", {}).get("endpoints", {})
        },
        "differences": {},
        "recommendations": []
    }
    
    # Find differences
    app_store_paths = set(app_store_endpoints.keys())
    our_store_paths = set(our_endpoints["stores"])
    
    missing_in_ours = app_store_paths - our_store_paths
    missing_in_app = our_store_paths - app_store_paths
    
    comparison["differences"]["stores"] = {
        "missing_in_ours": list(missing_in_ours),
        "missing_in_app": list(missing_in_app),
        "common": list(app_store_paths & our_store_paths)
    }
    
    # Generate recommendations
    if missing_in_ours:
        comparison["recommendations"].append(
            f"Consider implementing these store endpoints: {list(missing_in_ours)}"
        )
    
    if missing_in_app:
        comparison["recommendations"].append(
            f"These endpoints we implement but app doesn't use: {list(missing_in_app)}"
        )
    
    return comparison

def print_comparison_report(comparison: Dict[str, Any]):
    """Print a formatted comparison report."""
    
    print("\n" + "="*80)
    print("IMPLEMENTATION COMPARISON REPORT")
    print("="*80)
    
    print(f"\n🔍 OUR IMPLEMENTATION:")
    for category, endpoints in comparison["our_implementation"].items():
        print(f"   {category.upper()}:")
        for endpoint in endpoints:
            print(f"     • {endpoint}")
    
    print(f"\n📱 APP ACTUAL USAGE:")
    
    print(f"   STORE ENDPOINTS:")
    for endpoint, calls in comparison["app_actual_usage"]["store_endpoints"].items():
        print(f"     • {endpoint}: {len(calls)} calls")
    
    print(f"\n   AUTH PATTERNS:")
    for pattern, calls in comparison["app_actual_usage"]["auth_patterns"].items():
        print(f"     • {pattern}: {len(calls)} calls")
    
    print(f"\n   TOP API ENDPOINTS:")
    for endpoint, count in list(comparison["app_actual_usage"]["top_api_endpoints"].items())[:10]:
        print(f"     • {endpoint}: {count} calls")
    
    print(f"\n⚠️  DIFFERENCES:")
    stores_diff = comparison["differences"]["stores"]
    
    if stores_diff["missing_in_ours"]:
        print(f"   Missing in our implementation:")
        for endpoint in stores_diff["missing_in_ours"]:
            print(f"     • {endpoint}")
    
    if stores_diff["missing_in_app"]:
        print(f"   We implement but app doesn't use:")
        for endpoint in stores_diff["missing_in_app"]:
            print(f"     • {endpoint}")
    
    if stores_diff["common"]:
        print(f"   Common endpoints:")
        for endpoint in stores_diff["common"]:
            print(f"     • {endpoint}")
    
    print(f"\n💡 RECOMMENDATIONS:")
    for rec in comparison["recommendations"]:
        print(f"   • {rec}")
    
    # Additional insights
    print(f"\n🔍 KEY INSIGHTS:")
    
    # Check if we're using the right store search endpoint
    if "/digital/storeInfo/v2/stores/proximity" in stores_diff["common"]:
        print(f"   ✅ We correctly use the proximity search endpoint")
    
    # Check auth patterns
    if "id.meijer.com" in str(comparison["app_actual_usage"]["auth_patterns"]):
        print(f"   ✅ App uses id.meijer.com for authentication (we should too)")
    
    # Check for any POST endpoints we might be missing
    post_endpoints = [call for call in comparison["app_actual_usage"].get("sample_api_calls", []) 
                     if call.get("method") == "POST"]
    if post_endpoints:
        print(f"   📝 App uses POST for some endpoints: {len(post_endpoints)} calls")
    
    print("="*80)

def main():
    """Main comparison function."""
    print("🔍 Comparing our Meijer API implementation with actual app usage...")
    
    comparison = compare_with_our_implementation()
    if not comparison:
        return
    
    print_comparison_report(comparison)
    
    # Save detailed comparison
    output_file = "implementation_comparison.json"
    with open(output_file, 'w') as f:
        json.dump(comparison, f, indent=2, default=str)
    
    print(f"\n💾 Detailed comparison saved to: {output_file}")

if __name__ == "__main__":
    main()
