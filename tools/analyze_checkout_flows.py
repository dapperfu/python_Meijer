#!/usr/bin/env python3
"""
Analyze Shop'n'Scan checkout flows from the latest log file.
"""

import json
import re
from typing import Dict, Any
from pathlib import Path


def analyze_checkout_flows(log_file_path: str) -> Dict[str, Any]:
    """
    Analyze checkout-related flows in the log file.
    """
    results = {
        'checkout_endpoints': {},
        'checkout_operations': {},
        'pdf417_barcodes': [],
        'checkout_summaries': [],
        'session_resumption': [],
        'transfer_flows': [],
        'complete_flows': []
    }
    
    with open(log_file_path, 'rb') as f:
        content = f.read()
    
    print(f"Analyzing checkout flows in: {log_file_path}")
    
    # Look for checkout-related endpoints
    checkout_endpoints = [
        rb'checkout',
        rb'CheckOut',
        rb'Begin.*Checkout',
        rb'transfer',
        rb'complete',
        rb'finish',
        rb'payment',
        rb'receipt'
    ]
    
    # Look for checkout-related operations
    checkout_operations = [
        rb'CHECKOUT',
        rb'TRANSFER',
        rb'COMPLETE',
        rb'FINISH',
        rb'PAYMENT',
        rb'RECEIPT'
    ]
    
    # Look for PDF417 barcode patterns
    pdf417_patterns = [
        rb'SS\d+[a-f0-9-]+',
        rb'PDF_417',
        rb'checkout.*barcode',
        rb'barcode.*checkout'
    ]
    
    # Look for checkout summary patterns
    summary_patterns = [
        rb'item.*total',
        rb'estimated.*tax',
        rb'subtotal',
        rb'total.*savings',
        rb'estimated.*total',
        rb'checkout.*complete'
    ]
    
    # Look for session resumption patterns
    resumption_patterns = [
        rb'trip.*resumed',
        rb'session.*resume',
        rb'resume.*session',
        rb'recovery'
    ]
    
    # Analyze checkout endpoints
    print("Analyzing checkout endpoints...")
    for pattern in checkout_endpoints:
        start = 0
        while True:
            pos = content.find(pattern, start)
            if pos == -1:
                break
            
            # Extract context around the pattern
            context_start = max(0, pos - 3000)
            context_end = min(len(content), pos + 3000)
            context = content[context_start:context_end]
            
            try:
                context_text = context.decode('utf-8', errors='ignore')
                
                # Look for HTTP requests
                http_match = re.search(r'(POST|GET|PUT|DELETE|PATCH)\s+([^\s]+)', context_text)
                if http_match:
                    method = http_match.group(1)
                    url = http_match.group(2)
                    
                    # Look for operation type
                    operation_match = re.search(r'"type":"([^"]+)"', context_text)
                    operation = operation_match.group(1) if operation_match else "UNKNOWN"
                    
                    # Look for response status
                    status_match = re.search(r'HTTP/[^\s]+\s+(\d+)\s+([^\r\n]+)', context_text)
                    status = f"{status_match.group(1)}: {status_match.group(2)}" if status_match else "UNKNOWN"
                    
                    # Categorize by endpoint
                    endpoint_key = url
                    if endpoint_key not in results['checkout_endpoints']:
                        results['checkout_endpoints'][endpoint_key] = {
                            'method': method,
                            'count': 0,
                            'operations': {},
                            'contexts': []
                        }
                    
                    results['checkout_endpoints'][endpoint_key]['count'] += 1
                    
                    if operation not in results['checkout_endpoints'][endpoint_key]['operations']:
                        results['checkout_endpoints'][endpoint_key]['operations'][operation] = 0
                    results['checkout_endpoints'][endpoint_key]['operations'][operation] += 1
                    
                    # Store context
                    results['checkout_endpoints'][endpoint_key]['contexts'].append({
                        'position': pos,
                        'operation': operation,
                        'method': method,
                        'status': status,
                        'context_preview': context_text[:400] + '...' if len(context_text) > 400 else context_text
                    })
                
            except Exception:
                pass
            
            start = pos + 1
    
    # Analyze checkout operations
    print("Analyzing checkout operations...")
    for pattern in checkout_operations:
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
                endpoint_match = re.search(r'(/[^\s]+)', context_text)
                endpoint = endpoint_match.group(1) if endpoint_match else "UNKNOWN"
                
                # Look for device ID and transaction ID
                device_id_match = re.search(r'"deviceId":"([^"]+)"', context_text)
                device_id = device_id_match.group(1) if device_id_match else "UNKNOWN"
                
                transaction_id_match = re.search(r'"transactionId":"([^"]+)"', context_text)
                transaction_id = transaction_id_match.group(1) if transaction_id_match else "UNKNOWN"
                
                results['checkout_operations'][pattern.decode('utf-8')] = {
                    'count': results['checkout_operations'].get(pattern.decode('utf-8'), {}).get('count', 0) + 1,
                    'endpoint': endpoint,
                    'device_id': device_id,
                    'transaction_id': transaction_id,
                    'position': pos,
                    'context_preview': context_text[:500] + '...' if len(context_text) > 500 else context_text
                }
                
            except Exception:
                pass
            
            start = pos + 1
    
    # Analyze PDF417 barcodes
    print("Analyzing PDF417 barcodes...")
    for pattern in pdf417_patterns:
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
                
                # Look for the actual barcode value
                barcode_match = re.search(r'SS\d+[a-f0-9-]+', context_text)
                barcode = barcode_match.group(0) if barcode_match else "UNKNOWN"
                
                # Look for checkout context
                checkout_context = "checkout" if any(word in context_text.lower() for word in ['checkout', 'transfer', 'complete']) else "other"
                
                results['pdf417_barcodes'].append({
                    'barcode': barcode,
                    'context': checkout_context,
                    'position': pos,
                    'context_preview': context_text[:400] + '...' if len(context_text) > 400 else context_text
                })
                
            except Exception:
                pass
            
            start = pos + 1
    
    # Analyze checkout summaries
    print("Analyzing checkout summaries...")
    for pattern in summary_patterns:
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
                
                # Look for numerical values
                price_matches = re.findall(r'\$?(\d+\.?\d*)', context_text)
                prices = [float(p) for p in price_matches if p.replace('.', '').isdigit()]
                
                # Look for checkout context
                checkout_context = "checkout" if any(word in context_text.lower() for word in ['checkout', 'transfer', 'complete']) else "other"
                
                results['checkout_summaries'].append({
                    'pattern': pattern.decode('utf-8'),
                    'prices': prices,
                    'context': checkout_context,
                    'position': pos,
                    'context_preview': context_text[:400] + '...' if len(context_text) > 400 else context_text
                })
                
            except Exception:
                pass
            
            start = pos + 1
    
    # Analyze session resumption
    print("Analyzing session resumption...")
    for pattern in resumption_patterns:
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
                
                # Look for device ID and transaction ID
                device_id_match = re.search(r'"deviceId":"([^"]+)"', context_text)
                device_id = device_id_match.group(1) if device_id_match else "UNKNOWN"
                
                transaction_id_match = re.search(r'"transactionId":"([^"]+)"', context_text)
                transaction_id = transaction_id_match.group(1) if transaction_id_match else "UNKNOWN"
                
                results['session_resumption'].append({
                    'pattern': pattern.decode('utf-8'),
                    'device_id': device_id,
                    'transaction_id': transaction_id,
                    'position': pos,
                    'context_preview': context_text[:400] + '...' if len(context_text) > 400 else context_text
                })
                
            except Exception:
                pass
            
            start = pos + 1
    
    return results


def main():
    """Main analysis function."""
    log_file = "logs/meijer_mitm_20250822_2200.log"
    
    if not Path(log_file).exists():
        print(f"Log file not found: {log_file}")
        return
    
    print(f"Checkout Flow Analysis for: {log_file}")
    
    # Analyze checkout flows
    results = analyze_checkout_flows(log_file)
    
    # Print results
    print("\n=== CHECKOUT ENDPOINTS ===")
    for endpoint, data in results.get('checkout_endpoints', {}).items():
        print(f"\n{endpoint}")
        print(f"  Method: {data['method']}")
        print(f"  Count: {data['count']}")
        print(f"  Operations: {list(data['operations'].keys())}")
    
    print("\n=== CHECKOUT OPERATIONS ===")
    for operation, data in results.get('checkout_operations', {}).items():
        print(f"\n{operation}")
        print(f"  Count: {data['count']}")
        print(f"  Endpoint: {data['endpoint']}")
        print(f"  Device ID: {data['device_id']}")
        print(f"  Transaction ID: {data['transaction_id']}")
    
    print("\n=== PDF417 BARCODES ===")
    for barcode in results.get('pdf417_barcodes', [])[:5]:  # Show first 5
        print(f"\nBarcode: {barcode['barcode']}")
        print(f"  Context: {barcode['context']}")
        print(f"  Position: {barcode['position']}")
    
    print("\n=== CHECKOUT SUMMARIES ===")
    for summary in results.get('checkout_summaries', [])[:5]:  # Show first 5
        print(f"\nPattern: {summary['pattern']}")
        print(f"  Prices: {summary['prices']}")
        print(f"  Context: {summary['context']}")
    
    print("\n=== SESSION RESUMPTION ===")
    for resumption in results.get('session_resumption', [])[:5]:  # Show first 5
        print(f"\nPattern: {resumption['pattern']}")
        print(f"  Device ID: {resumption['device_id']}")
        print(f"  Transaction ID: {resumption['transaction_id']}")
    
    # Save detailed results
    with open('logs/checkout_flow_analysis.json', 'w') as f:
        json.dump(results, f, indent=2)
    
    print("\nDetailed results saved to: logs/checkout_flow_analysis.json")


if __name__ == '__main__':
    main()
