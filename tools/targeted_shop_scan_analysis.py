#!/usr/bin/env python3
"""
Targeted Shop'n'Scan analysis focusing on specific operations and endpoints found in logs.
"""

import json
import re
from typing import List, Dict, Any, Set
from pathlib import Path


def analyze_specific_shop_scan_operations(log_file_path: str) -> Dict[str, Any]:
    """
    Analyze specific Shop'n'Scan operations found in the logs.
    """
    results = {
        'endpoints': {},
        'operations': {},
        'session_flows': [],
        'cart_items': [],
        'headers': {},
        'implementation_gaps': []
    }
    
    with open(log_file_path, 'rb') as f:
        content = f.read()
    
    print("Analyzing specific Shop'n'Scan operations...")
    
    # Look for the specific endpoints we know exist
    known_endpoints = [
        rb'/retail/shopandscan/api/v1/NextGenPOSBasket',
        rb'/dgtlmma/accounts/isShopAndScanEnabled'
    ]
    
    for endpoint in known_endpoints:
        start = 0
        while True:
            pos = content.find(endpoint, start)
            if pos == -1:
                break
            
            # Extract context around the endpoint
            context_start = max(0, pos - 4000)
            context_end = min(len(content), pos + 4000)
            context = content[context_start:context_end]
            
            try:
                context_text = context.decode('utf-8', errors='ignore')
                
                # Look for HTTP method
                method_match = re.search(r'(POST|GET|PUT|DELETE|PATCH)', context_text)
                method = method_match.group(1) if method_match else "UNKNOWN"
                
                # Look for JSON payloads
                json_matches = re.findall(r'\{[^{}]*\}', context_text)
                
                # Look for operation type
                operation_match = re.search(r'"type":"([^"]+)"', context_text)
                operation = operation_match.group(1) if operation_match else "UNKNOWN"
                
                # Look for headers
                headers = {}
                header_matches = re.findall(r'([^:\s]+):\s*([^\r\n]+)', context_text)
                for key, value in header_matches:
                    if key.lower() in ['authorization', 'content-type', 'user-agent', 'ocp-apim-subscription-key', 'cookie']:
                        headers[key] = value.strip()
                
                # Look for response status
                status_match = re.search(r'HTTP/[^\s]+\s+(\d+)\s+([^\r\n]+)', context_text)
                status = f"{status_match.group(1)}: {status_match.group(2)}" if status_match else "UNKNOWN"
                
                # Categorize by endpoint
                endpoint_str = endpoint.decode('utf-8')
                if endpoint_str not in results['endpoints']:
                    results['endpoints'][endpoint_str] = {
                        'method': method,
                        'count': 0,
                        'operations': {},
                        'contexts': []
                    }
                
                results['endpoints'][endpoint_str]['count'] += 1
                
                if operation not in results['endpoints'][endpoint_str]['operations']:
                    results['endpoints'][endpoint_str]['operations'][operation] = 0
                results['endpoints'][endpoint_str]['operations'][operation] += 1
                
                # Store context
                results['endpoints'][endpoint_str]['contexts'].append({
                    'position': pos,
                    'operation': operation,
                    'method': method,
                    'status': status,
                    'headers': headers,
                    'json_payloads': json_matches[:3],  # Limit to first 3
                    'context_preview': context_text[:300] + '...' if len(context_text) > 300 else context_text
                })
                
                # Track operations globally
                if operation not in results['operations']:
                    results['operations'][operation] = {
                        'count': 0,
                        'endpoints': [],
                        'examples': []
                    }
                
                results['operations'][operation]['count'] += 1
                if endpoint_str not in results['operations'][operation]['endpoints']:
                    results['operations'][operation]['endpoints'].append(endpoint_str)
                
                if len(results['operations'][operation]['examples']) < 3:
                    results['operations'][operation]['examples'].append({
                        'endpoint': endpoint_str,
                        'method': method,
                        'status': status,
                        'context': context_text[:500] + '...' if len(context_text) > 500 else context_text
                    })
                
            except Exception as e:
                pass
            
            start = pos + 1
    
    # Analyze specific operation types
    print("Analyzing operation-specific patterns...")
    
    # Look for cart item details
    cart_item_pattern = rb'"cartItems":\s*\[([^\]]+)\]'
    cart_matches = re.findall(cart_item_pattern, content)
    
    for match in cart_matches:
        try:
            cart_text = match.decode('utf-8', errors='ignore')
            # Extract UPC and quantity info
            upc_match = re.search(r'"upc":"([^"]+)"', cart_text)
            scanned_upc_match = re.search(r'"scannedUpc":"([^"]+)"', cart_text)
            quantity_match = re.search(r'"quantityWeight":([^,]+)', cart_text)
            desc_match = re.search(r'"itemDesc":"([^"]+)"', cart_text)
            
            if upc_match or scanned_upc_match:
                results['cart_items'].append({
                    'upc': upc_match.group(1) if upc_match else None,
                    'scanned_upc': scanned_upc_match.group(1) if scanned_upc_match else None,
                    'quantity': quantity_match.group(1) if quantity_match else None,
                    'description': desc_match.group(1) if desc_match else None
                })
        except Exception as e:
            pass
    
    # Look for session management patterns
    session_patterns = [
        rb'START_TRANSACTION',
        rb'END_TRANSACTION',
        rb'BARCODE_SCANNED',
        rb'UPDATE_QUANTITY'
    ]
    
    for pattern in session_patterns:
        start = 0
        while True:
            pos = content.find(pattern, start)
            if pos == -1:
                break
            
            # Extract context around the pattern
            context_start = max(0, pos - 2000)
            context_end = min(len(content), pos + 2000)
            context = content[context_start:context_end]
            
            try:
                context_text = context.decode('utf-8', errors='ignore')
                
                # Look for associated endpoint
                endpoint_match = re.search(r'(/retail/shopandscan/[^\s]+)', context_text)
                endpoint = endpoint_match.group(1) if endpoint_match else "UNKNOWN"
                
                # Look for device ID
                device_id_match = re.search(r'"deviceId":"([^"]+)"', context_text)
                device_id = device_id_match.group(1) if device_id_match else "UNKNOWN"
                
                # Look for transaction ID
                transaction_id_match = re.search(r'"transactionId":"([^"]+)"', context_text)
                transaction_id = transaction_id_match.group(1) if transaction_id_match else "UNKNOWN"
                
                results['session_flows'].append({
                    'operation': pattern.decode('utf-8'),
                    'endpoint': endpoint,
                    'device_id': device_id,
                    'transaction_id': transaction_id,
                    'position': pos,
                    'context_preview': context_text[:400] + '...' if len(context_text) > 400 else context_text
                })
                
            except Exception as e:
                pass
            
            start = pos + 1
    
    return results


def analyze_python_implementation_gaps(operations_found: Dict[str, Any]) -> List[str]:
    """
    Analyze gaps between found operations and Python implementation.
    """
    gaps = []
    
    # Check for missing operations
    implemented_operations = {
        'START_TRANSACTION': 'start_shop_n_scan_session',
        'BARCODE_SCANNED': 'add_to_cart (needs update)',
        'UPDATE_QUANTITY': 'Missing - needs implementation',
        'END_TRANSACTION': 'Missing - needs implementation'
    }
    
    for operation, implementation in implemented_operations.items():
        if operation in operations_found:
            if implementation.startswith('Missing'):
                gaps.append(f"Missing implementation for {operation}")
            elif 'needs update' in implementation:
                gaps.append(f"Needs update: {operation} - {implementation}")
    
    # Check for missing endpoint handling
    if '/dgtlmma/accounts/isShopAndScanEnabled' in operations_found.get('endpoints', {}):
        gaps.append("Missing endpoint: /dgtlmma/accounts/isShopAndScanEnabled")
    
    return gaps


def generate_implementation_recommendations(analysis: Dict[str, Any]) -> Dict[str, Any]:
    """
    Generate specific implementation recommendations based on analysis.
    """
    recommendations = {
        'missing_methods': [],
        'endpoint_updates': [],
        'operation_implementations': [],
        'session_management': [],
        'cart_operations': []
    }
    
    # Check for missing methods
    if 'UPDATE_QUANTITY' in analysis.get('operations', {}):
        recommendations['missing_methods'].append({
            'method': 'update_item_quantity',
            'operation': 'UPDATE_QUANTITY',
            'description': 'Update quantity of existing cart item',
            'example': analysis['operations']['UPDATE_QUANTITY']['examples'][0] if analysis['operations']['UPDATE_QUANTITY']['examples'] else None
        })
    
    if 'END_TRANSACTION' in analysis.get('operations', {}):
        recommendations['missing_methods'].append({
            'method': 'end_transaction',
            'operation': 'END_TRANSACTION',
            'description': 'Complete and end the current transaction',
            'example': analysis['operations']['END_TRANSACTION']['examples'][0] if analysis['operations']['END_TRANSACTION']['examples'] else None
        })
    
    # Check for endpoint updates
    for endpoint, data in analysis.get('endpoints', {}).items():
        if endpoint not in ['/retail/shopandscan/api/v1/NextGenPOSBasket']:
            recommendations['endpoint_updates'].append({
                'endpoint': endpoint,
                'current_handling': 'Not implemented',
                'suggested_method': f'handle_{endpoint.split("/")[-1].lower()}',
                'operations': list(data.get('operations', {}).keys())
            })
    
    # Check for operation implementation updates
    for operation, data in analysis.get('operations', {}).items():
        if operation in ['BARCODE_SCANNED', 'UPDATE_QUANTITY']:
            recommendations['operation_implementations'].append({
                'operation': operation,
                'current_implementation': 'Partial or needs update',
                'required_updates': [
                    'Update JSON payload structure',
                    'Handle response parsing',
                    'Add error handling'
                ],
                'examples': data.get('examples', [])
            })
    
    return recommendations


def main():
    """Main analysis function."""
    log_file = "logs/meijer_mitm_20250822_2130.log"
    
    print(f"Targeted Shop'n'Scan analysis for: {log_file}")
    
    # Analyze specific operations
    analysis = analyze_specific_shop_scan_operations(log_file)
    
    # Analyze implementation gaps
    gaps = analyze_python_implementation_gaps(analysis)
    
    # Generate recommendations
    recommendations = generate_implementation_recommendations(analysis)
    
    # Print results
    print(f"\n=== ENDPOINT ANALYSIS ===")
    for endpoint, data in analysis.get('endpoints', {}).items():
        print(f"\n{endpoint}")
        print(f"  Method: {data['method']}")
        print(f"  Count: {data['count']}")
        print(f"  Operations: {list(data['operations'].keys())}")
    
    print(f"\n=== OPERATION ANALYSIS ===")
    for operation, data in analysis.get('operations', {}).items():
        print(f"\n{operation}")
        print(f"  Count: {data['count']}")
        print(f"  Endpoints: {list(data['endpoints'])}")
    
    print(f"\n=== SESSION FLOWS ===")
    for flow in analysis.get('session_flows', [])[:5]:  # Show first 5
        print(f"\n{flow['operation']}")
        print(f"  Endpoint: {flow['endpoint']}")
        print(f"  Device ID: {flow['device_id']}")
        print(f"  Transaction ID: {flow['transaction_id']}")
    
    print(f"\n=== CART ITEMS ===")
    for item in analysis.get('cart_items', [])[:5]:  # Show first 5
        print(f"\nUPC: {item['upc']}")
        print(f"  Scanned: {item['scanned_upc']}")
        print(f"  Quantity: {item['quantity']}")
        print(f"  Description: {item['description']}")
    
    print(f"\n=== IMPLEMENTATION GAPS ===")
    for gap in gaps:
        print(f"  - {gap}")
    
    print(f"\n=== RECOMMENDATIONS ===")
    for category, items in recommendations.items():
        if items:
            print(f"\n{category.upper()}:")
            for item in items:
                if isinstance(item, dict):
                    if 'method' in item:
                        print(f"  - {item['method']}: {item['description']}")
                    elif 'endpoint' in item:
                        print(f"  - {item['endpoint']}: {item['suggested_method']}")
                    elif 'operation' in item:
                        print(f"  - {item['operation']}: {item['current_implementation']}")
                else:
                    print(f"  - {item}")
    
    # Save detailed results
    detailed_results = {
        'analysis': analysis,
        'gaps': gaps,
        'recommendations': recommendations
    }
    
    with open('logs/targeted_shop_scan_analysis.json', 'w') as f:
        json.dump(detailed_results, f, indent=2)
    
    print(f"\nDetailed results saved to: logs/targeted_shop_scan_analysis.json")


if __name__ == '__main__':
    main()
