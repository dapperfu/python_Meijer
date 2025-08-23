#!/usr/bin/env python3
"""
Targeted analysis of the specific checkout flow with PDF417 barcode.
"""

import json
import re
from typing import List, Dict, Any
from pathlib import Path


def find_specific_checkout_flow(log_file_path: str) -> Dict[str, Any]:
    """
    Find the specific checkout flow with PDF417 barcode and completion details.
    """
    results = {
        'pdf417_barcode': None,
        'checkout_endpoints': [],
        'checkout_flow': [],
        'session_resumption': None,
        'transfer_flow': None,
        'checkout_completion': None
    }
    
    with open(log_file_path, 'rb') as f:
        content = f.read()
    
    print(f"Searching for specific checkout flow in: {log_file_path}")
    
    # Look for the specific PDF417 barcode mentioned
    specific_barcode = b"SS00020f060433e-f36b-1410-8809-0003faebed644001"
    barcode_pos = content.find(specific_barcode)
    
    if barcode_pos != -1:
        print(f"Found specific PDF417 barcode at position: {barcode_pos}")
        
        # Extract context around the barcode
        context_start = max(0, barcode_pos - 5000)
        context_end = min(len(content), barcode_pos + 5000)
        context = content[context_start:context_end]
        
        try:
            context_text = context.decode('utf-8', errors='ignore')
            results['pdf417_barcode'] = {
                'barcode': specific_barcode.decode('utf-8'),
                'position': barcode_pos,
                'context': context_text
            }
            
            # Look for checkout-related patterns in this context
            checkout_patterns = [
                r'checkout',
                r'CheckOut',
                r'Begin.*Checkout',
                r'transfer',
                r'complete',
                r'finish',
                r'payment',
                r'receipt',
                r'item.*total',
                r'estimated.*tax',
                r'subtotal',
                r'total.*savings',
                r'estimated.*total'
            ]
            
            for pattern in checkout_patterns:
                matches = re.findall(pattern, context_text, re.IGNORECASE)
                if matches:
                    results['checkout_flow'].append({
                        'pattern': pattern,
                        'matches': matches,
                        'context': context_text
                    })
            
        except Exception as e:
            print(f"Error processing barcode context: {e}")
    
    # Look for session resumption patterns
    resumption_patterns = [
        rb'trip.*resumed',
        rb'session.*resume',
        rb'resume.*session',
        rb'recovery',
        rb'resumed'
    ]
    
    for pattern in resumption_patterns:
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
                
                # Look for device ID and transaction ID
                device_id_match = re.search(r'"deviceId":"([^"]+)"', context_text)
                device_id = device_id_match.group(1) if device_id_match else "UNKNOWN"
                
                transaction_id_match = re.search(r'"transactionId":"([^"]+)"', context_text)
                transaction_id = transaction_id_match.group(1) if transaction_id_match else "UNKNOWN"
                
                # Check if this matches our transaction
                if transaction_id == "f060433e-f36b-1410-8809-0003faebed64":
                    results['session_resumption'] = {
                        'pattern': pattern.decode('utf-8'),
                        'device_id': device_id,
                        'transaction_id': transaction_id,
                        'position': pos,
                        'context': context_text
                    }
                    break
                
            except Exception as e:
                pass
            
            start = pos + 1
        
        if results['session_resumption']:
            break
    
    # Look for transfer flow patterns
    transfer_patterns = [
        rb'Begin.*Transfer',
        rb'transfer.*began',
        rb'Check.*Out',
        rb'checkout.*page'
    ]
    
    for pattern in transfer_patterns:
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
                
                # Look for device ID and transaction ID
                device_id_match = re.search(r'"deviceId":"([^"]+)"', context_text)
                device_id = device_id_match.group(1) if device_id_match else "UNKNOWN"
                
                transaction_id_match = re.search(r'"transactionId":"([^"]+)"', context_text)
                transaction_id = transaction_id_match.group(1) if transaction_id_match else "UNKNOWN"
                
                # Check if this matches our transaction
                if transaction_id == "f060433e-f36b-1410-8809-0003faebed64":
                    results['transfer_flow'] = {
                        'pattern': pattern.decode('utf-8'),
                        'device_id': device_id,
                        'transaction_id': transaction_id,
                        'position': pos,
                        'context': context_text
                    }
                    break
                
            except Exception as e:
                pass
            
            start = pos + 1
        
        if results['transfer_flow']:
            break
    
    # Look for checkout completion patterns
    completion_patterns = [
        rb'checkout.*complete',
        rb'shop.*scan.*checkout.*complete',
        rb'checkout.*finished',
        rb'transaction.*complete'
    ]
    
    for pattern in completion_patterns:
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
                
                # Look for device ID and transaction ID
                device_id_match = re.search(r'"deviceId":"([^"]+)"', context_text)
                device_id = device_id_match.group(1) if device_id_match else "UNKNOWN"
                
                transaction_id_match = re.search(r'"transactionId":"([^"]+)"', context_text)
                transaction_id = transaction_id_match.group(1) if transaction_id_match else "UNKNOWN"
                
                # Check if this matches our transaction
                if transaction_id == "f060433e-f36b-1410-8809-0003faebed64":
                    results['checkout_completion'] = {
                        'pattern': pattern.decode('utf-8'),
                        'device_id': device_id,
                        'transaction_id': transaction_id,
                        'position': pos,
                        'context': context_text
                    }
                    break
                
            except Exception as e:
                pass
            
            start = pos + 1
        
        if results['checkout_completion']:
            break
    
    # Look for HTTP endpoints in the checkout flow
    if results['pdf417_barcode']:
        context_text = results['pdf417_barcode']['context']
        
        # Look for HTTP requests
        http_matches = re.findall(r'(POST|GET|PUT|DELETE|PATCH)\s+([^\s]+)', context_text)
        for method, url in http_matches:
            results['checkout_endpoints'].append({
                'method': method,
                'url': url,
                'context': context_text
            })
    
    return results


def main():
    """Main analysis function."""
    log_file = "logs/meijer_mitm_20250822_2200.log"
    
    if not Path(log_file).exists():
        print(f"Log file not found: {log_file}")
        return
    
    print(f"Targeted Checkout Flow Analysis for: {log_file}")
    
    # Find specific checkout flow
    results = find_specific_checkout_flow(log_file)
    
    # Print results
    if results['pdf417_barcode']:
        print(f"\n=== PDF417 BARCODE FOUND ===")
        print(f"Barcode: {results['pdf417_barcode']['barcode']}")
        print(f"Position: {results['pdf417_barcode']['position']}")
        print(f"Context Preview: {results['pdf417_barcode']['context'][:500]}...")
    
    if results['session_resumption']:
        print(f"\n=== SESSION RESUMPTION ===")
        print(f"Pattern: {results['session_resumption']['pattern']}")
        print(f"Device ID: {results['session_resumption']['device_id']}")
        print(f"Transaction ID: {results['session_resumption']['transaction_id']}")
        print(f"Context Preview: {results['session_resumption']['context'][:500]}...")
    
    if results['transfer_flow']:
        print(f"\n=== TRANSFER FLOW ===")
        print(f"Pattern: {results['transfer_flow']['pattern']}")
        print(f"Device ID: {results['transfer_flow']['device_id']}")
        print(f"Transaction ID: {results['transfer_flow']['transaction_id']}")
        print(f"Context Preview: {results['transfer_flow']['context'][:500]}...")
    
    if results['checkout_completion']:
        print(f"\n=== CHECKOUT COMPLETION ===")
        print(f"Pattern: {results['checkout_completion']['pattern']}")
        print(f"Device ID: {results['checkout_completion']['device_id']}")
        print(f"Transaction ID: {results['checkout_completion']['transaction_id']}")
        print(f"Context Preview: {results['checkout_completion']['context'][:500]}...")
    
    if results['checkout_endpoints']:
        print(f"\n=== CHECKOUT ENDPOINTS ===")
        for endpoint in results['checkout_endpoints']:
            print(f"\n{endpoint['method']} {endpoint['url']}")
    
    if results['checkout_flow']:
        print(f"\n=== CHECKOUT FLOW PATTERNS ===")
        for flow in results['checkout_flow']:
            print(f"\nPattern: {flow['pattern']}")
            print(f"Matches: {flow['matches']}")
    
    # Save detailed results
    with open('logs/targeted_checkout_analysis.json', 'w') as f:
        json.dump(results, f, indent=2)
    
    print(f"\nDetailed results saved to: logs/targeted_checkout_analysis.json")


if __name__ == '__main__':
    main()
