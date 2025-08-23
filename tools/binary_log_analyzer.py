#!/usr/bin/env python3
"""
Binary mitmproxy log analyzer for shop'n'scan flows.
"""

import json
import re
import struct
from typing import List, Dict, Any, Optional


def search_binary_log_for_patterns(log_file_path: str) -> Dict[str, Any]:
    """
    Search binary mitmproxy log for specific patterns.
    """
    patterns = {
        'is_shop_scan_enabled': rb'isShopAndScanEnabled',
        'next_gen_pos_basket': rb'NextGenPOSBasket',
        'start_transaction': rb'START_TRANSACTION',
        'device_id': rb'deviceId',
        'store_id': rb'storeId',
        'upc_629': rb'629',
        'upc_0461': rb'0461',
        'mperks_barcode': rb'99999604317088389844',
        'bearer_token': rb'Bearer ',
        'authorization': rb'authorization',
        'content_type': rb'content-type',
        'user_agent': rb'user-agent'
    }
    
    results = {}
    
    with open(log_file_path, 'rb') as f:
        content = f.read()
    
    for pattern_name, pattern in patterns.items():
        matches = []
        start = 0
        while True:
            pos = content.find(pattern, start)
            if pos == -1:
                break
            
            # Extract context around the match
            context_start = max(0, pos - 200)
            context_end = min(len(content), pos + 200)
            context = content[context_start:context_end]
            
            # Try to decode as text
            try:
                context_text = context.decode('utf-8', errors='ignore')
                matches.append({
                    'position': pos,
                    'context': context_text
                })
            except:
                pass
            
            start = pos + 1
        
        results[pattern_name] = matches
    
    return results


def extract_http_flows_from_binary(log_file_path: str) -> List[Dict[str, Any]]:
    """
    Extract HTTP flows from binary mitmproxy log.
    """
    flows = []
    
    with open(log_file_path, 'rb') as f:
        content = f.read()
    
    # Look for HTTP request patterns
    http_patterns = [
        rb'POST ',
        rb'GET ',
        rb'PUT ',
        rb'DELETE ',
        rb'PATCH '
    ]
    
    for pattern in http_patterns:
        start = 0
        while True:
            pos = content.find(pattern, start)
            if pos == -1:
                break
            
            # Extract the flow starting from this position
            flow_start = pos
            flow_end = min(len(content), pos + 2000)  # Look ahead 2000 bytes
            
            flow_content = content[flow_start:flow_end]
            
            try:
                flow_text = flow_content.decode('utf-8', errors='ignore')
                
                # Parse the flow
                flow = parse_flow_content(flow_text)
                if flow:
                    flows.append(flow)
                    
            except Exception as e:
                pass
            
            start = pos + 1
    
    return flows


def parse_flow_content(content: str) -> Optional[Dict[str, Any]]:
    """
    Parse flow content to extract HTTP request/response details.
    """
    flow = {
        'method': None,
        'url': None,
        'headers': {},
        'body': None,
        'response_status': None
    }
    
    lines = content.split('\n')
    
    for i, line in enumerate(lines):
        line = line.strip()
        
        # Parse request line
        if line.startswith(('POST ', 'GET ', 'PUT ', 'DELETE ', 'PATCH ')):
            parts = line.split(' ')
            if len(parts) >= 2:
                flow['method'] = parts[0]
                flow['url'] = parts[1]
        
        # Parse headers
        elif ':' in line and not line.startswith('{'):
            if ':' in line:
                key, value = line.split(':', 1)
                flow['headers'][key.strip()] = value.strip()
        
        # Parse JSON body
        elif line.startswith('{') and line.endswith('}'):
            try:
                flow['body'] = json.loads(line)
            except:
                pass
        
        # Parse response status
        elif line.startswith('HTTP/'):
            parts = line.split(' ')
            if len(parts) >= 2:
                flow['response_status'] = parts[1]
    
    return flow if flow['method'] else None


def analyze_shop_scan_session(log_file_path: str) -> Dict[str, Any]:
    """
    Analyze shop'n'scan session from binary log.
    """
    print("Searching for patterns in binary log...")
    patterns = search_binary_log_for_patterns(log_file_path)
    
    print("Extracting HTTP flows...")
    flows = extract_http_flows_from_binary(log_file_path)
    
    # Filter shop'n'scan related flows
    shop_scan_flows = []
    for flow in flows:
        if flow['url'] and any(keyword in flow['url'].lower() for keyword in ['shop', 'scan', 'basket', 'pos']):
            shop_scan_flows.append(flow)
    
    # Extract device ID from patterns
    device_ids = []
    if patterns['device_id']:
        for match in patterns['device_id']:
            context = match['context']
            # Look for device ID pattern in context
            device_match = re.search(r'"deviceId":"([^"]+)"', context)
            if device_match:
                device_ids.append(device_match.group(1))
    
    # Extract store ID
    store_id = None
    if patterns['store_id']:
        for match in patterns['store_id']:
            context = match['context']
            store_match = re.search(r'"storeId":(\d+)', context)
            if store_match:
                store_id = int(store_match.group(1))
                break
    
    # Generate session template
    device_id = device_ids[0] if device_ids else "50dbc7dc-e839-46d9-9bfd-292c0d4f831e"
    
    session_template = {
        "type": "START_TRANSACTION",
        "header": {
            "transactionDateTime": "2025-08-22T21:47:52",
            "transactionDateTimeUTC": "2025-08-22T21:47:52-04:00",
            "storeId": store_id or 20,
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
    
    return {
        'patterns_found': {k: len(v) for k, v in patterns.items()},
        'shop_scan_flows': shop_scan_flows,
        'device_ids': device_ids,
        'store_id': store_id,
        'session_template': session_template
    }


def main():
    """Main analysis function."""
    log_file = "logs/meijer_mitm_20250822_2130.log"
    
    print(f"Analyzing binary mitmproxy log: {log_file}")
    
    # Analyze the log
    analysis = analyze_shop_scan_session(log_file)
    
    # Print results
    print(f"\n=== PATTERN ANALYSIS ===")
    for pattern, count in analysis['patterns_found'].items():
        print(f"{pattern}: {count} matches")
    
    print(f"\n=== SHOP'N'SCAN FLOWS ===")
    print(f"Found {len(analysis['shop_scan_flows'])} shop'n'scan related flows")
    
    for i, flow in enumerate(analysis['shop_scan_flows'][:5]):  # Show first 5
        print(f"\nFlow {i+1}:")
        print(f"  Method: {flow['method']}")
        print(f"  URL: {flow['url']}")
        print(f"  Headers: {len(flow['headers'])}")
        if flow['body']:
            print(f"  Body: {type(flow['body'])}")
    
    print(f"\n=== EXTRACTED INFORMATION ===")
    print(f"Device IDs: {analysis['device_ids']}")
    print(f"Store ID: {analysis['store_id']}")
    
    print(f"\n=== SESSION TEMPLATE ===")
    print(json.dumps(analysis['session_template'], indent=2))
    
    # Save results
    with open('logs/binary_shop_scan_analysis.json', 'w') as f:
        json.dump(analysis, f, indent=2)
    
    print(f"\nResults saved to: logs/binary_shop_scan_analysis.json")


if __name__ == '__main__':
    main()
