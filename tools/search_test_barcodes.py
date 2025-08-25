#!/usr/bin/env python3
"""
Search for specific test barcodes in shop'n'scan flows.
"""

import json
import re
from typing import Dict, Any


def search_test_barcodes(log_file_path: str) -> Dict[str, Any]:
    """
    Search for the specific test barcodes in the log file.
    """
    # Test barcodes from user
    test_barcodes = [
        "629307040245",
        "842595131277", 
        "822279082910",
        "070896523112",
        "713733252843",
        "016000275263",
        "046100001899"
    ]
    
    results = {
        'barcode_matches': [],
        'shop_scan_contexts': [],
        'cart_operations': [],
        'session_flows': []
    }
    
    with open(log_file_path, 'rb') as f:
        content = f.read()
    
    print("Searching for test barcodes in the log...")
    
    # Search for each test barcode
    for barcode in test_barcodes:
        print(f"Searching for barcode: {barcode}")
        
        start = 0
        while True:
            pos = content.find(barcode.encode('utf-8'), start)
            if pos == -1:
                break
            
            # Extract context around the barcode
            context_start = max(0, pos - 2000)
            context_end = min(len(content), pos + 2000)
            context = content[context_start:context_end]
            
            try:
                context_text = context.decode('utf-8', errors='ignore')
                
                # Check if this is in a shop'n'scan related context
                is_shop_scan = any(keyword in context_text.lower() for keyword in [
                    'shop', 'scan', 'basket', 'pos', 'transaction', 'cart', 'item'
                ])
                
                # Look for JSON patterns that might contain the barcode
                json_matches = re.findall(r'\{[^{}]*\}', context_text)
                
                # Look for HTTP request/response patterns
                http_patterns = re.findall(r'(POST|GET|PUT|DELETE|PATCH)\s+([^\s]+)', context_text)
                
                barcode_match = {
                    'barcode': barcode,
                    'position': pos,
                    'context': context_text,
                    'is_shop_scan_context': is_shop_scan,
                    'json_matches': json_matches,
                    'http_patterns': http_patterns
                }
                
                results['barcode_matches'].append(barcode_match)
                
                # If it's in shop'n'scan context, add to relevant results
                if is_shop_scan:
                    results['shop_scan_contexts'].append(barcode_match)
                    
                    # Look for cart operation patterns
                    if any(pattern in context_text for pattern in ['ADD_ITEM', 'UPDATE_ITEM', 'REMOVE_ITEM', 'SCAN_ITEM']):
                        results['cart_operations'].append(barcode_match)
                    
                    # Look for session flow patterns
                    if any(pattern in context_text for pattern in ['START_TRANSACTION', 'NextGenPOSBasket', 'isShopAndScanEnabled']):
                        results['session_flows'].append(barcode_match)
                
            except Exception:
                pass
            
            start = pos + 1
    
    return results


def analyze_barcode_usage(results: Dict[str, Any]) -> Dict[str, Any]:
    """
    Analyze how the test barcodes are used.
    """
    analysis = {
        'barcode_frequency': {},
        'context_types': {},
        'shop_scan_usage': {},
        'cart_operations': {},
        'session_flows': {}
    }
    
    # Count barcode frequency
    for match in results['barcode_matches']:
        barcode = match['barcode']
        if barcode not in analysis['barcode_frequency']:
            analysis['barcode_frequency'][barcode] = 0
        analysis['barcode_frequency'][barcode] += 1
    
    # Analyze context types
    for match in results['barcode_matches']:
        barcode = match['barcode']
        context_type = 'shop_scan' if match['is_shop_scan_context'] else 'other'
        
        if barcode not in analysis['context_types']:
            analysis['context_types'][barcode] = {'shop_scan': 0, 'other': 0}
        analysis['context_types'][barcode][context_type] += 1
    
    # Analyze shop'n'scan usage
    for match in results['shop_scan_contexts']:
        barcode = match['barcode']
        if barcode not in analysis['shop_scan_usage']:
            analysis['shop_scan_usage'][barcode] = []
        analysis['shop_scan_usage'][barcode].append({
            'position': match['position'],
            'http_patterns': match['http_patterns'],
            'json_matches': len(match['json_matches'])
        })
    
    # Analyze cart operations
    for match in results['cart_operations']:
        barcode = match['barcode']
        if barcode not in analysis['cart_operations']:
            analysis['cart_operations'][barcode] = []
        analysis['cart_operations'][barcode].append({
            'position': match['position'],
            'context_preview': match['context'][:300] + '...' if len(match['context']) > 300 else match['context']
        })
    
    # Analyze session flows
    for match in results['session_flows']:
        barcode = match['barcode']
        if barcode not in analysis['session_flows']:
            analysis['session_flows'][barcode] = []
        analysis['session_flows'][barcode].append({
            'position': match['position'],
            'context_preview': match['context'][:300] + '...' if len(match['context']) > 300 else match['context']
        })
    
    return analysis


def generate_test_session_template(analysis: Dict[str, Any]) -> Dict[str, Any]:
    """
    Generate a test session template based on the analysis.
    """
    # Get the most frequently used barcode in shop'n'scan context
    shop_scan_barcodes = list(analysis['shop_scan_usage'].keys())
    test_barcode = shop_scan_barcodes[0] if shop_scan_barcodes else "629307040245"
    
    return {
        "type": "START_TRANSACTION",
        "header": {
            "transactionDateTime": "2025-08-22T21:47:52",
            "transactionDateTimeUTC": "2025-08-22T21:47:52-04:00",
            "storeId": 20,
            "eventTimeStamp": "2025-08-22T21:47:52",
            "eventTimeStampUTC": "2025-08-22T21:47:52-04:00",
            "deviceId": "50dbc7dc-e839-46d9-9bfd-292c0d4f831e",
            "deviceOS": "Android",
            "deviceAppVersion": "10.28.0",
            "deviceOSVersion": "10"
        },
        "eventData": {
            "barcodeType": "PDF_417",
            "mPerksBarcode": "99999604317088389844",
            "selectedHighValueOnly": True,
            "rollDepositsInPrimary": True
        },
        "test_barcodes": [
            "629307040245",
            "842595131277", 
            "822279082910",
            "070896523112",
            "713733252843",
            "016000275263",
            "046100001899"
        ]
    }


def main():
    """Main analysis function."""
    log_file = "logs/meijer_mitm_20250822_2130.log"
    
    print(f"Searching for test barcodes in: {log_file}")
    
    # Search for test barcodes
    results = search_test_barcodes(log_file)
    
    # Analyze usage patterns
    analysis = analyze_barcode_usage(results)
    
    # Generate test session template
    session_template = generate_test_session_template(analysis)
    
    # Print results
    print("\n=== TEST BARCODE SEARCH RESULTS ===")
    print(f"Total barcode matches found: {len(results['barcode_matches'])}")
    print(f"Shop'n'scan contexts: {len(results['shop_scan_contexts'])}")
    print(f"Cart operations: {len(results['cart_operations'])}")
    print(f"Session flows: {len(results['session_flows'])}")
    
    print("\n=== BARCODE FREQUENCY ===")
    for barcode, count in analysis['barcode_frequency'].items():
        print(f"{barcode}: {count} matches")
    
    print("\n=== SHOP'N'SCAN USAGE ===")
    for barcode, usage in analysis['shop_scan_usage'].items():
        print(f"{barcode}: {len(usage)} shop'n'scan contexts")
        for i, usage_info in enumerate(usage[:3]):  # Show first 3
            print(f"  {i+1}. Position: {usage_info['position']}, HTTP patterns: {usage_info['http_patterns']}")
    
    print("\n=== CART OPERATIONS ===")
    for barcode, operations in analysis['cart_operations'].items():
        print(f"{barcode}: {len(operations)} cart operations")
    
    print("\n=== SESSION FLOWS ===")
    for barcode, flows in analysis['session_flows'].items():
        print(f"{barcode}: {len(flows)} session flows")
    
    print("\n=== TEST SESSION TEMPLATE ===")
    print(json.dumps(session_template, indent=2))
    
    # Save detailed results
    detailed_results = {
        'results': results,
        'analysis': analysis,
        'session_template': session_template
    }
    
    with open('logs/test_barcode_analysis.json', 'w') as f:
        json.dump(detailed_results, f, indent=2)
    
    print("\nDetailed results saved to: logs/test_barcode_analysis.json")


if __name__ == '__main__':
    main()
