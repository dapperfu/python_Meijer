#!/usr/bin/env python3
"""
Extract Shop & Scan specific endpoints from API endpoints analysis.

This script filters the existing API endpoints analysis to find
all shop and scan related endpoints and their details.
"""

import json
from pathlib import Path
from typing import Dict, List, Any
from collections import defaultdict


def load_api_endpoints_analysis(file_path: str = "api_endpoints_analysis.json") -> Dict[str, Any]:
    """Load the API endpoints analysis file."""
    try:
        with open(file_path, "r") as f:
            return json.load(f)
    except Exception as e:
        print(f"❌ Error loading {file_path}: {e}")
        return {}


def is_shop_scan_endpoint(endpoint: str) -> bool:
    """Check if an endpoint is related to shop and scan functionality."""
    endpoint_lower = endpoint.lower()
    
    # Shop & Scan specific keywords
    shop_scan_keywords = [
        'shop', 'scan', 'barcode', 'upc', 'qr', 'camera',
        'shopandscan', 'shopnscan', 'shop_scan', 'shop-scan',
        'fulfillment', 'reservation', 'cart', 'item', 'product'
    ]
    
    # Check if any keyword is in the endpoint
    return any(keyword in endpoint_lower for keyword in shop_scan_keywords)


def extract_shop_scan_endpoints(api_analysis: Dict[str, Any]) -> Dict[str, Any]:
    """Extract shop and scan related endpoints from API analysis."""
    shop_scan_endpoints = defaultdict(list)
    all_shop_scan_endpoints = []
    
    print("🔍 Analyzing API endpoints for shop and scan functionality...")
    
    for log_file, log_data in api_analysis.items():
        if log_file == "summary":
            continue
            
        print(f"📁 Processing {log_file}...")
        
        # Extract endpoints from this log file
        endpoints = log_data.get("endpoint_counts", {})
        api_calls = log_data.get("api_calls", [])
        
        for endpoint, count in endpoints.items():
            if is_shop_scan_endpoint(endpoint):
                # Find the corresponding API call details
                call_details = None
                for call in api_calls:
                    if call.get("endpoint") == endpoint:
                        call_details = call
                        break
                
                endpoint_info = {
                    "endpoint": endpoint,
                    "count": count,
                    "log_file": log_file,
                    "method": call_details.get("method", "UNKNOWN") if call_details else "UNKNOWN",
                    "status": call_details.get("status", "UNKNOWN") if call_details else "UNKNOWN",
                    "context": call_details.get("context", "") if call_details else ""
                }
                
                shop_scan_endpoints[log_file].append(endpoint_info)
                all_shop_scan_endpoints.append(endpoint_info)
    
    return {
        "summary": {
            "total_log_files": len(api_analysis) - 1,  # Exclude summary
            "total_shop_scan_endpoints": len(all_shop_scan_endpoints),
            "unique_endpoints": len(set(endpoint["endpoint"] for endpoint in all_shop_scan_endpoints))
        },
        "by_log_file": dict(shop_scan_endpoints),
        "all_endpoints": all_shop_scan_endpoints
    }


def categorize_shop_scan_endpoints(endpoints: List[Dict[str, Any]]) -> Dict[str, List[Dict[str, Any]]]:
    """Categorize shop and scan endpoints by functionality."""
    categories = {
        "barcode_lookup": [],
        "cart_operations": [],
        "fulfillment": [],
        "reservation": [],
        "product_search": [],
        "other": []
    }
    
    for endpoint_info in endpoints:
        endpoint = endpoint_info["endpoint"].lower()
        
        if any(keyword in endpoint for keyword in ["barcode", "upc", "scan", "lookup"]):
            categories["barcode_lookup"].append(endpoint_info)
        elif any(keyword in endpoint for keyword in ["cart", "add", "remove", "clear"]):
            categories["cart_operations"].append(endpoint_info)
        elif any(keyword in endpoint for keyword in ["fulfillment", "delivery", "pickup"]):
            categories["fulfillment"].append(endpoint_info)
        elif any(keyword in endpoint for keyword in ["reservation", "slot", "time"]):
            categories["reservation"].append(endpoint_info)
        elif any(keyword in endpoint for keyword in ["search", "product", "item"]):
            categories["product_search"].append(endpoint_info)
        else:
            categories["other"].append(endpoint_info)
    
    return categories


def display_shop_scan_summary(shop_scan_data: Dict[str, Any]):
    """Display a summary of shop and scan endpoints."""
    print("\n🛒 Shop & Scan Endpoints Summary")
    print("=" * 50)
    
    summary = shop_scan_data["summary"]
    print(f"Total log files analyzed: {summary['total_log_files']}")
    print(f"Total shop & scan endpoints found: {summary['total_shop_scan_endpoints']}")
    print(f"Unique endpoints: {summary['unique_endpoints']}")
    
    # Show endpoints by log file
    print("\n📊 Endpoints by Log File:")
    for log_file, endpoints in shop_scan_data["by_log_file"].items():
        if endpoints:
            print(f"  {log_file}: {len(endpoints)} endpoints")
    
    # Categorize and show endpoints
    all_endpoints = shop_scan_data["all_endpoints"]
    categories = categorize_shop_scan_endpoints(all_endpoints)
    
    print("\n📋 Endpoints by Category:")
    for category, category_endpoints in categories.items():
        if category_endpoints:
            print(f"  {category.replace('_', ' ').title()}: {len(category_endpoints)} endpoints")
            for endpoint_info in category_endpoints[:3]:  # Show first 3
                print(f"    - {endpoint_info['endpoint']} ({endpoint_info['method']})")
            if len(category_endpoints) > 3:
                print(f"    ... and {len(category_endpoints) - 3} more")


def save_shop_scan_endpoints(shop_scan_data: Dict[str, Any], output_file: str):
    """Save shop and scan endpoints to a file."""
    try:
        with open(output_file, "w") as f:
            json.dump(shop_scan_data, f, indent=2, default=str)
        print(f"✅ Shop & scan endpoints saved to: {output_file}")
    except Exception as e:
        print(f"❌ Error saving shop & scan endpoints: {e}")


def main():
    """Main function to extract shop and scan endpoints."""
    print("🛒 Shop & Scan Endpoints Extractor")
    print("=" * 50)
    
    # Check if API endpoints analysis exists
    api_file = "api_endpoints_analysis.json"
    if not Path(api_file).exists():
        print(f"❌ {api_file} not found. Please run extract_api_calls.py first.")
        return
    
    # Load API endpoints analysis
    print(f"📁 Loading {api_file}...")
    api_analysis = load_api_endpoints_analysis(api_file)
    if not api_analysis:
        print("❌ Failed to load API endpoints analysis")
        return
    
    # Extract shop and scan endpoints
    shop_scan_data = extract_shop_scan_endpoints(api_analysis)
    
    # Display summary
    display_shop_scan_summary(shop_scan_data)
    
    # Save results
    output_file = "shop_scan_endpoints_analysis.json"
    save_shop_scan_endpoints(shop_scan_data, output_file)
    
    print("\n✅ Shop & scan endpoint extraction complete!")
    print(f"📄 Results saved to: {output_file}")


if __name__ == "__main__":
    main()
