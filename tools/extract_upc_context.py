#!/usr/bin/env python3
"""
Extract UPC context and shop'n'scan flow details from binary mitmproxy log.
"""

import json
import re
from typing import List, Dict, Any


def extract_upc_context(log_file_path: str) -> Dict[str, Any]:
    """
    Extract context around UPC patterns and shop'n'scan flows.
    """
    results = {
        'upc_629_contexts': [],
        'upc_0461_contexts': [],
        'shop_scan_flows': [],
        'device_id_usage': {},
        'session_sequence': []
    }
    
    with open(log_file_path, 'rb') as f:
        content = f.read()
    
    # Extract context around UPC 629 patterns
    print("Extracting UPC 629 contexts...")
    start = 0
    while True:
        pos = content.find(b'629', start)
        if pos == -1:
            break
        
        # Extract context around the match
        context_start = max(0, pos - 500)
        context_end = min(len(content), pos + 500)
        context = content[context_start:context_end]
        
        try:
            context_text = context.decode('utf-8', errors='ignore')
            
            # Look for JSON patterns that might contain UPC information
            json_matches = re.findall(r'\{[^{}]*"barcode"[^{}]*\}', context_text)
            
            results['upc_629_contexts'].append({
                'position': pos,
                'context': context_text,
                'json_matches': json_matches
            })
            
        except Exception as e:
            pass
        
        start = pos + 1
    
    # Extract context around UPC 0461 patterns
    print("Extracting UPC 0461 contexts...")
    start = 0
    while True:
        pos = content.find(b'0461', start)
        if pos == -1:
            break
        
        # Extract context around the match
        context_start = max(0, pos - 500)
        context_end = min(len(content), pos + 500)
        context = content[context_start:context_end]
        
        try:
            context_text = context.decode('utf-8', errors='ignore')
            
            # Look for JSON patterns that might contain UPC information
            json_matches = re.findall(r'\{[^{}]*"barcode"[^{}]*\}', context_text)
            
            results['upc_0461_contexts'].append({
                'position': pos,
                'context': context_text,
                'json_matches': json_matches
            })
            
        except Exception as e:
            pass
        
        start = pos + 1
    
    # Extract shop'n'scan related flows
    print("Extracting shop'n'scan flows...")
    shop_scan_patterns = [
        b'isShopAndScanEnabled',
        b'NextGenPOSBasket',
        b'START_TRANSACTION',
        b'ADD_ITEM',
        b'UPDATE_ITEM',
        b'REMOVE_ITEM'
    ]
    
    for pattern in shop_scan_patterns:
        start = 0
        while True:
            pos = content.find(pattern, start)
            if pos == -1:
                break
            
            # Extract context around the match
            context_start = max(0, pos - 1000)
            context_end = min(len(content), pos + 1000)
            context = content[context_start:context_end]
            
            try:
                context_text = context.decode('utf-8', errors='ignore')
                
                # Look for HTTP request/response patterns
                http_patterns = re.findall(r'(POST|GET|PUT|DELETE|PATCH)\s+([^\s]+)', context_text)
                
                results['shop_scan_flows'].append({
                    'pattern': pattern.decode('utf-8'),
                    'position': pos,
                    'context': context_text,
                    'http_requests': http_patterns
                })
                
            except Exception as e:
                pass
            
            start = pos + 1
    
    # Extract device ID usage patterns
    print("Extracting device ID usage...")
    device_id_pattern = rb'"deviceId":"([^"]+)"'
    device_matches = re.findall(device_id_pattern, content)
    
    for device_id in device_matches:
        device_id_str = device_id.decode('utf-8')
        if device_id_str not in results['device_id_usage']:
            results['device_id_usage'][device_id_str] = 0
        results['device_id_usage'][device_id_str] += 1
    
    return results


def analyze_session_flow(results: Dict[str, Any]) -> Dict[str, Any]:
    """
    Analyze the session flow based on extracted contexts.
    """
    analysis = {
        'session_phases': [],
        'upc_scanning_sequence': [],
        'device_id_transitions': [],
        'cart_operations': []
    }
    
    # Analyze UPC scanning sequence
    upc_629_positions = [ctx['position'] for ctx in results['upc_629_contexts']]
    upc_0461_positions = [ctx['position'] for ctx in results['upc_0461_contexts']]
    
    # Sort all UPC scans by position to understand sequence
    all_upc_scans = []
    for pos in upc_629_positions:
        all_upc_scans.append(('629', pos))
    for pos in upc_0461_positions:
        all_upc_scans.append(('0461', pos))
    
    all_upc_scans.sort(key=lambda x: x[1])
    analysis['upc_scanning_sequence'] = all_upc_scans
    
    # Analyze shop'n'scan flow sequence
    shop_scan_positions = []
    for flow in results['shop_scan_flows']:
        shop_scan_positions.append((flow['pattern'], flow['position']))
    
    shop_scan_positions.sort(key=lambda x: x[1])
    analysis['session_phases'] = shop_scan_positions
    
    # Analyze device ID transitions
    device_positions = []
    for device_id, count in results['device_id_usage'].items():
        # Find positions where this device ID appears
        with open('logs/meijer_mitm_20250822_2130.log', 'rb') as f:
            content = f.read()
        
        start = 0
        while True:
            pos = content.find(device_id.encode('utf-8'), start)
            if pos == -1:
                break
            device_positions.append((device_id, pos))
            start = pos + 1
    
    device_positions.sort(key=lambda x: x[1])
    analysis['device_id_transitions'] = device_positions
    
    return analysis


def generate_complete_session_template(results: Dict[str, Any], analysis: Dict[str, Any]) -> Dict[str, Any]:
    """
    Generate a complete session template based on the analysis.
    """
    # Get the most frequently used device ID
    device_id = max(results['device_id_usage'].items(), key=lambda x: x[1])[0]
    
    # Extract store ID from shop'n'scan flows
    store_id = 19  # Default from previous analysis
    
    # Look for store ID in shop'n'scan flows
    for flow in results['shop_scan_flows']:
        store_match = re.search(r'"storeId":(\d+)', flow['context'])
        if store_match:
            store_id = int(store_match.group(1))
            break
    
    return {
        "type": "START_TRANSACTION",
        "header": {
            "transactionDateTime": "2025-08-22T21:47:52",
            "transactionDateTimeUTC": "2025-08-22T21:47:52-04:00",
            "storeId": store_id,
            "eventTimeStamp": "2025-08-22T21:47:52",
            "eventTimeStampUTC": "2025-08-22T21:47:52-04:00",
            "deviceId": device_id,
            "deviceOS": "Android",
            "deviceAppVersion": "10.28.0",
            "deviceOSVersion": "10"
        },
        "eventData": {
            "barcodeType": "PDF_417",
            "mPerksBarcode": "99999604317088389844",
            "selectedHighValueOnly": True,
            "rollDepositsInPrimary": True
        }
    }


def main():
    """Main analysis function."""
    log_file = "logs/meijer_mitm_20250822_2130.log"
    
    print(f"Extracting UPC context from: {log_file}")
    
    # Extract UPC contexts and shop'n'scan flows
    results = extract_upc_context(log_file)
    
    # Analyze session flow
    analysis = analyze_session_flow(results)
    
    # Generate session template
    session_template = generate_complete_session_template(results, analysis)
    
    # Print results
    print(f"\n=== UPC CONTEXT ANALYSIS ===")
    print(f"UPC 629 contexts found: {len(results['upc_629_contexts'])}")
    print(f"UPC 0461 contexts found: {len(results['upc_0461_contexts'])}")
    print(f"Shop'n'scan flows found: {len(results['shop_scan_flows'])}")
    
    print(f"\n=== UPC SCANNING SEQUENCE ===")
    for i, (upc, pos) in enumerate(analysis['upc_scanning_sequence'][:20]):  # Show first 20
        print(f"{i+1:2d}. UPC {upc} at position {pos}")
    
    print(f"\n=== SESSION PHASES ===")
    for i, (phase, pos) in enumerate(analysis['session_phases'][:10]):  # Show first 10
        print(f"{i+1:2d}. {phase} at position {pos}")
    
    print(f"\n=== DEVICE ID USAGE ===")
    for device_id, count in results['device_id_usage'].items():
        print(f"Device ID: {device_id} (used {count} times)")
    
    print(f"\n=== COMPLETE SESSION TEMPLATE ===")
    print(json.dumps(session_template, indent=2))
    
    # Save detailed results
    detailed_results = {
        'results': results,
        'analysis': analysis,
        'session_template': session_template
    }
    
    with open('logs/upc_context_analysis.json', 'w') as f:
        json.dump(detailed_results, f, indent=2)
    
    print(f"\nDetailed results saved to: logs/upc_context_analysis.json")


if __name__ == '__main__':
    main()
