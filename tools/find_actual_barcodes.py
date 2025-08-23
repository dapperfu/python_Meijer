#!/usr/bin/env python3
"""
Find actual barcode scanning patterns in shop'n'scan flows.
"""

import json
import re
from typing import List, Dict, Any


def find_actual_barcode_scans(log_file_path: str) -> Dict[str, Any]:
    """
    Find actual barcode scanning patterns in shop'n'scan flows.
    """
    results = {
        'barcode_scans': [],
        'shop_scan_flows': [],
        'device_id_transitions': [],
        'session_sequence': []
    }
    
    with open(log_file_path, 'rb') as f:
        content = f.read()
    
    # Look for actual barcode scanning patterns in shop'n'scan context
    print("Searching for actual barcode scanning patterns...")
    
    # Look for patterns that indicate actual barcode scanning
    barcode_patterns = [
        rb'"barcode":"[0-9]+"',
        rb'"upc":"[0-9]+"',
        rb'"code":"[0-9]+"',
        rb'"scanCode":"[0-9]+"',
        rb'"itemCode":"[0-9]+"'
    ]
    
    for pattern in barcode_patterns:
        start = 0
        while True:
            pos = content.find(pattern, start)
            if pos == -1:
                break
            
            # Extract context around the barcode
            context_start = max(0, pos - 1000)
            context_end = min(len(content), pos + 1000)
            context = content[context_start:context_end]
            
            try:
                context_text = context.decode('utf-8', errors='ignore')
                
                # Check if this is in a shop'n'scan related context
                if any(keyword in context_text.lower() for keyword in ['shop', 'scan', 'basket', 'pos', 'transaction']):
                    # Extract the barcode value
                    barcode_match = re.search(r'"barcode":"([0-9]+)"', context_text)
                    if barcode_match:
                        barcode = barcode_match.group(1)
                        
                        # Check if it starts with the patterns we're looking for
                        if barcode.startswith(('629', '0461', '99999')):
                            results['barcode_scans'].append({
                                'barcode': barcode,
                                'position': pos,
                                'context': context_text,
                                'type': 'barcode_scan'
                            })
                
            except Exception as e:
                pass
            
            start = pos + 1
    
    # Look for shop'n'scan specific flows
    print("Searching for shop'n'scan specific flows...")
    shop_scan_patterns = [
        b'isShopAndScanEnabled',
        b'NextGenPOSBasket',
        b'START_TRANSACTION',
        b'ADD_ITEM',
        b'UPDATE_ITEM',
        b'REMOVE_ITEM',
        b'END_TRANSACTION'
    ]
    
    for pattern in shop_scan_patterns:
        start = 0
        while True:
            pos = content.find(pattern, start)
            if pos == -1:
                break
            
            # Extract context around the match
            context_start = max(0, pos - 2000)
            context_end = min(len(content), pos + 2000)
            context = content[context_start:context_end]
            
            try:
                context_text = context.decode('utf-8', errors='ignore')
                
                # Look for HTTP request/response patterns
                http_patterns = re.findall(r'(POST|GET|PUT|DELETE|PATCH)\s+([^\s]+)', context_text)
                
                # Look for JSON payloads
                json_payloads = []
                json_matches = re.findall(r'\{[^{}]*\}', context_text)
                for json_str in json_matches:
                    try:
                        json_data = json.loads(json_str)
                        json_payloads.append(json_data)
                    except:
                        pass
                
                results['shop_scan_flows'].append({
                    'pattern': pattern.decode('utf-8'),
                    'position': pos,
                    'context': context_text,
                    'http_requests': http_patterns,
                    'json_payloads': json_payloads
                })
                
            except Exception as e:
                pass
            
            start = pos + 1
    
    # Look for device ID transitions in shop'n'scan context
    print("Searching for device ID transitions...")
    device_id_pattern = rb'"deviceId":"([^"]+)"'
    device_matches = re.findall(device_id_pattern, content)
    
    for device_id in device_matches:
        device_id_str = device_id.decode('utf-8')
        
        # Find positions where this device ID appears
        start = 0
        while True:
            pos = content.find(device_id, start)
            if pos == -1:
                break
            
            # Extract context around device ID
            context_start = max(0, pos - 500)
            context_end = min(len(content), pos + 500)
            context = content[context_start:context_end]
            
            try:
                context_text = context.decode('utf-8', errors='ignore')
                
                # Check if this is in shop'n'scan context
                if any(keyword in context_text.lower() for keyword in ['shop', 'scan', 'basket', 'pos', 'transaction']):
                    results['device_id_transitions'].append({
                        'device_id': device_id_str,
                        'position': pos,
                        'context': context_text
                    })
                
            except Exception as e:
                pass
            
            start = pos + 1
    
    return results


def analyze_barcode_scanning_sequence(results: Dict[str, Any]) -> Dict[str, Any]:
    """
    Analyze the barcode scanning sequence.
    """
    analysis = {
        'scanning_sequence': [],
        'session_phases': [],
        'device_usage_pattern': {}
    }
    
    # Sort barcode scans by position
    barcode_scans = sorted(results['barcode_scans'], key=lambda x: x['position'])
    analysis['scanning_sequence'] = barcode_scans
    
    # Sort shop'n'scan flows by position
    shop_scan_flows = sorted(results['shop_scan_flows'], key=lambda x: x['position'])
    analysis['session_phases'] = shop_scan_flows
    
    # Analyze device ID usage pattern
    device_counts = {}
    for transition in results['device_id_transitions']:
        device_id = transition['device_id']
        if device_id not in device_counts:
            device_counts[device_id] = 0
        device_counts[device_id] += 1
    
    analysis['device_usage_pattern'] = device_counts
    
    return analysis


def generate_complete_session_flow(results: Dict[str, Any], analysis: Dict[str, Any]) -> Dict[str, Any]:
    """
    Generate a complete session flow description.
    """
    # Get the most frequently used device ID
    device_id = max(analysis['device_usage_pattern'].items(), key=lambda x: x[1])[0]
    
    # Extract store ID from shop'n'scan flows
    store_id = 20  # Default
    
    for flow in analysis['session_phases']:
        for payload in flow['json_payloads']:
            if isinstance(payload, dict) and 'header' in payload:
                header = payload['header']
                if 'storeId' in header:
                    store_id = header['storeId']
                    break
    
    # Create session flow description
    session_flow = {
        'device_id': device_id,
        'store_id': store_id,
        'session_sequence': [],
        'barcode_scans': [],
        'session_template': {
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
    }
    
    # Add session sequence
    for flow in analysis['session_phases']:
        session_flow['session_sequence'].append({
            'phase': flow['pattern'],
            'position': flow['position']
        })
    
    # Add barcode scans
    for scan in analysis['scanning_sequence']:
        session_flow['barcode_scans'].append({
            'barcode': scan['barcode'],
            'position': scan['position']
        })
    
    return session_flow


def main():
    """Main analysis function."""
    log_file = "logs/meijer_mitm_20250822_2130.log"
    
    print(f"Finding actual barcode scanning patterns in: {log_file}")
    
    # Find actual barcode scans
    results = find_actual_barcode_scans(log_file)
    
    # Analyze the sequence
    analysis = analyze_barcode_scanning_sequence(results)
    
    # Generate complete session flow
    session_flow = generate_complete_session_flow(results, analysis)
    
    # Print results
    print(f"\n=== ACTUAL BARCODE SCANNING ANALYSIS ===")
    print(f"Barcode scans found: {len(results['barcode_scans'])}")
    print(f"Shop'n'scan flows found: {len(results['shop_scan_flows'])}")
    print(f"Device ID transitions found: {len(results['device_id_transitions'])}")
    
    print(f"\n=== BARCODE SCANNING SEQUENCE ===")
    for i, scan in enumerate(analysis['scanning_sequence'][:10]):  # Show first 10
        print(f"{i+1:2d}. Barcode {scan['barcode']} at position {scan['position']}")
    
    print(f"\n=== SESSION PHASES ===")
    for i, flow in enumerate(analysis['session_phases'][:10]):  # Show first 10
        print(f"{i+1:2d}. {flow['pattern']} at position {flow['position']}")
    
    print(f"\n=== DEVICE USAGE PATTERN ===")
    for device_id, count in analysis['device_usage_pattern'].items():
        print(f"Device ID: {device_id} (used {count} times)")
    
    print(f"\n=== COMPLETE SESSION FLOW ===")
    print(json.dumps(session_flow, indent=2))
    
    # Save detailed results
    detailed_results = {
        'results': results,
        'analysis': analysis,
        'session_flow': session_flow
    }
    
    with open('logs/actual_barcode_analysis.json', 'w') as f:
        json.dump(detailed_results, f, indent=2)
    
    print(f"\nDetailed results saved to: logs/actual_barcode_analysis.json")


if __name__ == '__main__':
    main()
