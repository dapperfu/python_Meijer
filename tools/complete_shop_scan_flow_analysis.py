#!/usr/bin/env python3
"""
Complete Shop'n'Scan flow analysis including checkout and completion.
"""

import json
import re
from typing import List, Dict, Any
from pathlib import Path


def analyze_complete_shop_scan_flow(log_file_path: str) -> Dict[str, Any]:
    """
    Analyze the complete Shop'n'Scan flow including checkout and completion.
    """
    results = {
        'session_flow': [],
        'checkout_flow': [],
        'missing_operations': [],
        'implementation_gaps': [],
        'recommendations': []
    }
    
    with open(log_file_path, 'rb') as f:
        content = f.read()
    
    print(f"Analyzing complete Shop'n'Scan flow in: {log_file_path}")
    
    # Look for the specific transaction ID from the user's description
    transaction_id = b"f060433e-f36b-1410-8809-0003faebed64"
    
    # Find all occurrences of this transaction
    start = 0
    transaction_flows = []
    
    while True:
        pos = content.find(transaction_id, start)
        if pos == -1:
            break
        
        # Extract context around the transaction
        context_start = max(0, pos - 3000)
        context_end = min(len(content), pos + 3000)
        context = content[context_start:context_end]
        
        try:
            context_text = context.decode('utf-8', errors='ignore')
            
            # Look for operation type
            operation_match = re.search(r'"type":"([^"]+)"', context_text)
            operation = operation_match.group(1) if operation_match else "UNKNOWN"
            
            # Look for endpoint
            endpoint_match = re.search(r'(/[^\s]+)', context_text)
            endpoint = endpoint_match.group(1) if endpoint_match else "UNKNOWN"
            
            # Look for timestamp
            timestamp_match = re.search(r'"eventTimeStamp":"([^"]+)"', context_text)
            timestamp = timestamp_match.group(1) if timestamp_match else "UNKNOWN"
            
            # Look for cart totals
            cart_totals = {}
            total_match = re.search(r'"cartTotals":\s*\{([^}]+)\}', context_text)
            if total_match:
                totals_text = total_match.group(1)
                # Extract individual totals
                for total_type in ['cartWasTotal', 'cartNowTotal', 'cartSavingsTotal', 'cartRewardTotal', 'basketTotalWithTax']:
                    value_match = re.search(f'"{total_type}":\s*([^,]+)', totals_text)
                    if value_match:
                        cart_totals[total_type] = value_match.group(1)
            
            # Look for cart items
            cart_items = []
            items_match = re.search(r'"cartItems":\s*\[([^\]]+)\]', context_text)
            if items_match:
                items_text = items_match.group(1)
                # Extract item details
                item_matches = re.findall(r'\{([^}]+)\}', items_text)
                for item_text in item_matches:
                    item = {}
                    for field in ['lineNumber', 'upc', 'scannedUpc', 'quantityWeight', 'itemDesc', 'nowPrice', 'savings']:
                        field_match = re.search(f'"{field}":"([^"]+)"', item_text)
                        if field_match:
                            item[field] = field_match.group(1)
                    if item:
                        cart_items.append(item)
            
            transaction_flows.append({
                'operation': operation,
                'endpoint': endpoint,
                'timestamp': timestamp,
                'cart_totals': cart_totals,
                'cart_items': cart_items,
                'position': pos,
                'context_preview': context_text[:400] + '...' if len(context_text) > 400 else context_text
            })
            
        except Exception as e:
            pass
        
        start = pos + 1
    
    # Organize flows by sequence
    if transaction_flows:
        # Sort by timestamp if available
        sorted_flows = sorted(transaction_flows, key=lambda x: x.get('timestamp', ''))
        
        # Categorize flows
        for flow in sorted_flows:
            if flow['operation'] in ['START_TRANSACTION']:
                results['session_flow'].append({
                    'step': 'Session Start',
                    'operation': flow['operation'],
                    'endpoint': flow['endpoint'],
                    'timestamp': flow['timestamp'],
                    'details': flow
                })
            elif flow['operation'] in ['BARCODE_SCANNED']:
                results['session_flow'].append({
                    'step': 'Barcode Scan',
                    'operation': flow['operation'],
                    'endpoint': flow['endpoint'],
                    'timestamp': flow['timestamp'],
                    'details': flow
                })
            elif flow['operation'] in ['UPDATE_QUANTITY']:
                results['session_flow'].append({
                    'step': 'Quantity Update',
                    'operation': flow['operation'],
                    'endpoint': flow['endpoint'],
                    'timestamp': flow['timestamp'],
                    'details': flow
                })
            elif flow['operation'] in ['UNKNOWN']:
                # Check if this might be a checkout operation
                if any(word in flow['context_preview'].lower() for word in ['checkout', 'transfer', 'complete', 'finish']):
                    results['checkout_flow'].append({
                        'step': 'Checkout Operation',
                        'operation': flow['operation'],
                        'endpoint': flow['endpoint'],
                        'timestamp': flow['timestamp'],
                        'details': flow
                    })
                else:
                    results['session_flow'].append({
                        'step': 'Other Operation',
                        'operation': flow['operation'],
                        'endpoint': flow['endpoint'],
                        'timestamp': flow['timestamp'],
                        'details': flow
                    })
    
    # Based on user description, add the missing checkout flow
    user_described_checkout = {
        'step': 'Checkout Complete',
        'description': 'User described checkout flow',
        'pdf417_barcode': 'SS00020f060433e-f36b-1410-8809-0003faebed644001',
        'flow': [
            'Trip resumed',
            'Clicked Check Out',
            'Began Transfer',
            'Taken to "Begin Checkout" page',
            'PDF417 barcode generated',
            'Checkout complete'
        ],
        'endpoints_needed': [
            '/retail/shopandscan/api/v1/NextGenPOSBasket/checkout',
            '/retail/shopandscan/api/v1/NextGenPOSBasket/transfer',
            '/retail/shopandscan/api/v1/NextGenPOSBasket/complete'
        ],
        'operations_needed': [
            'CHECKOUT',
            'TRANSFER',
            'COMPLETE',
            'GENERATE_PDF417'
        ]
    }
    
    results['checkout_flow'].append(user_described_checkout)
    
    # Analyze implementation gaps
    current_implementation = {
        'START_TRANSACTION': 'Implemented',
        'BARCODE_SCANNED': 'Partially implemented',
        'UPDATE_QUANTITY': 'Not implemented',
        'CHECKOUT': 'Not implemented',
        'TRANSFER': 'Not implemented',
        'COMPLETE': 'Not implemented',
        'GENERATE_PDF417': 'Not implemented'
    }
    
    for operation, status in current_implementation.items():
        if status != 'Implemented':
            results['implementation_gaps'].append({
                'operation': operation,
                'status': status,
                'priority': 'High' if operation in ['UPDATE_QUANTITY', 'CHECKOUT'] else 'Medium'
            })
    
    # Generate recommendations
    if results['implementation_gaps']:
        results['recommendations'].append({
            'category': 'Missing Operations',
            'items': results['implementation_gaps'],
            'priority': 'High'
        })
    
    # Add specific checkout recommendations
    results['recommendations'].append({
        'category': 'Checkout Flow',
        'items': [
            'Implement checkout endpoint handling',
            'Implement transfer operation',
            'Implement completion operation',
            'Add PDF417 barcode generation',
            'Add checkout summary display'
        ],
        'priority': 'High'
    })
    
    return results


def main():
    """Main analysis function."""
    log_file = "logs/meijer_mitm_20250822_2130.log"
    
    if not Path(log_file).exists():
        print(f"Log file not found: {log_file}")
        return
    
    print(f"Complete Shop'n'Scan Flow Analysis for: {log_file}")
    
    # Analyze complete flow
    results = analyze_complete_shop_scan_flow(log_file)
    
    # Print results
    print(f"\n=== SESSION FLOW ===")
    for flow in results.get('session_flow', []):
        print(f"\n{flow['step']}")
        print(f"  Operation: {flow['operation']}")
        print(f"  Endpoint: {flow['endpoint']}")
        print(f"  Timestamp: {flow['timestamp']}")
        if flow['details'].get('cart_totals'):
            print(f"  Cart Totals: {flow['details']['cart_totals']}")
        if flow['details'].get('cart_items'):
            print(f"  Cart Items: {len(flow['details']['cart_items'])}")
    
    print(f"\n=== CHECKOUT FLOW ===")
    for flow in results.get('checkout_flow', []):
        if 'description' in flow:
            print(f"\n{flow['step']}")
            print(f"  Description: {flow['description']}")
            print(f"  PDF417 Barcode: {flow['pdf417_barcode']}")
            print(f"  Flow Steps: {flow['flow']}")
            print(f"  Endpoints Needed: {flow['endpoints_needed']}")
            print(f"  Operations Needed: {flow['operations_needed']}")
        else:
            print(f"\n{flow['step']}")
            print(f"  Operation: {flow['operation']}")
            print(f"  Endpoint: {flow['endpoint']}")
            print(f"  Timestamp: {flow['timestamp']}")
    
    print(f"\n=== IMPLEMENTATION GAPS ===")
    for gap in results.get('implementation_gaps', []):
        print(f"  - {gap['operation']}: {gap['status']} (Priority: {gap['priority']})")
    
    print(f"\n=== RECOMMENDATIONS ===")
    for category in results.get('recommendations', []):
        print(f"\n{category['category']} ({category['priority']} Priority):")
        for item in category['items']:
            if isinstance(item, dict):
                print(f"  - {item['operation']}: {item['status']}")
            else:
                print(f"  - {item}")
    
    # Save detailed results
    with open('logs/complete_shop_scan_flow_analysis.json', 'w') as f:
        json.dump(results, f, indent=2)
    
    print(f"\nDetailed results saved to: logs/complete_shop_scan_flow_analysis.json")


if __name__ == '__main__':
    main()
