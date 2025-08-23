#!/usr/bin/env python3
"""
Detailed shop'n'scan flow analyzer for mitmproxy logs.
Focuses on the specific flows mentioned in the user query.
"""

import json
import re
from typing import List, Dict, Any


def extract_specific_flows(log_file_path: str) -> Dict[str, Any]:
    """
    Extract the specific shop'n'scan flows mentioned in the user query.
    """
    flows = {
        'is_shop_scan_enabled': [],
        'next_gen_pos_basket': [],
        'device_ids': [],
        'upc_scans': [],
        'session_starts': [],
        'cart_updates': [],
        'headers': []
    }
    
    with open(log_file_path, 'r', encoding='utf-8', errors='ignore') as f:
        content = f.read()
    
    # Split into flows (each flow starts with >>)
    flow_sections = re.split(r'(?=^>>)', content, flags=re.MULTILINE)
    
    for i, section in enumerate(flow_sections):
        if not section.strip():
            continue
        
        # Check for isShopAndScanEnabled endpoint
        if 'isShopAndScanEnabled' in section:
            flows['is_shop_scan_enabled'].append({
                'index': i,
                'content': section,
                'url': re.search(r'>> ([^\s]+)', section).group(1) if re.search(r'>> ([^\s]+)', section) else 'Unknown'
            })
        
        # Check for NextGenPOSBasket endpoint
        if 'NextGenPOSBasket' in section:
            flows['next_gen_pos_basket'].append({
                'index': i,
                'content': section,
                'url': re.search(r'>> ([^\s]+)', section).group(1) if re.search(r'>> ([^\s]+)', section) else 'Unknown'
            })
        
        # Look for device IDs
        device_id_match = re.search(r'"deviceId":"([^"]+)"', section)
        if device_id_match:
            flows['device_ids'].append({
                'device_id': device_id_match.group(1),
                'index': i,
                'section_preview': section[:300] + '...' if len(section) > 300 else section
            })
        
        # Look for UPC scans (barcodes starting with 629, 0461, etc.)
        upc_match = re.search(r'"barcode":"([0-9]+)"', section)
        if upc_match:
            barcode = upc_match.group(1)
            if barcode.startswith(('629', '0461', '99999')):
                flows['upc_scans'].append({
                    'barcode': barcode,
                    'index': i,
                    'section_preview': section[:300] + '...' if len(section) > 300 else section
                })
        
        # Look for session start patterns
        if 'START_TRANSACTION' in section:
            flows['session_starts'].append({
                'index': i,
                'content': section,
                'type': 'START_TRANSACTION'
            })
        
        # Look for cart update patterns
        if any(pattern in section for pattern in ['ADD_ITEM', 'UPDATE_ITEM', 'REMOVE_ITEM']):
            flows['cart_updates'].append({
                'index': i,
                'content': section,
                'type': re.search(r'"type":"([^"]+)"', section).group(1) if re.search(r'"type":"([^"]+)"', section) else 'Unknown'
            })
        
        # Extract headers from shop'n'scan related flows
        if any(keyword in section.lower() for keyword in ['shop', 'scan', 'basket', 'pos']):
            headers = {}
            for line in section.split('\n'):
                if line.startswith('>>') and ':' in line:
                    key, value = line[2:].split(':', 1)
                    headers[key.strip()] = value.strip()
            
            if headers:
                flows['headers'].append({
                    'index': i,
                    'headers': headers,
                    'url': re.search(r'>> ([^\s]+)', section).group(1) if re.search(r'>> ([^\s]+)', section) else 'Unknown'
                })
    
    return flows


def analyze_session_flow(flows: Dict[str, Any]) -> Dict[str, Any]:
    """
    Analyze the session flow based on the extracted data.
    """
    analysis = {
        'session_sequence': [],
        'device_id_usage': {},
        'store_id': None,
        'app_version': None,
        'os_info': None
    }
    
    # Sort flows by index to understand sequence
    all_flows = []
    for flow_type, flow_list in flows.items():
        if flow_type != 'headers':  # Skip headers for sequence analysis
            for flow in flow_list:
                all_flows.append({
                    'type': flow_type,
                    'index': flow['index'],
                    'data': flow
                })
    
    all_flows.sort(key=lambda x: x['index'])
    analysis['session_sequence'] = all_flows
    
    # Analyze device ID usage
    for device_data in flows['device_ids']:
        device_id = device_data['device_id']
        if device_id not in analysis['device_id_usage']:
            analysis['device_id_usage'][device_id] = []
        analysis['device_id_usage'][device_id].append(device_data)
    
    # Extract store ID, app version, and OS info from NextGenPOSBasket calls
    for basket_call in flows['next_gen_pos_basket']:
        content = basket_call['content']
        
        # Store ID
        store_match = re.search(r'"storeId":(\d+)', content)
        if store_match and not analysis['store_id']:
            analysis['store_id'] = int(store_match.group(1))
        
        # App version
        app_match = re.search(r'"deviceAppVersion":"([^"]+)"', content)
        if app_match and not analysis['app_version']:
            analysis['app_version'] = app_match.group(1)
        
        # OS info
        os_match = re.search(r'"deviceOS":"([^"]+)"', content)
        if os_match and not analysis['os_info']:
            analysis['os_info'] = os_match.group(1)
    
    return analysis


def generate_complete_session_template(analysis: Dict[str, Any]) -> Dict[str, Any]:
    """
    Generate a complete session template based on the analysis.
    """
    # Get the first device ID found
    device_id = list(analysis['device_id_usage'].keys())[0] if analysis['device_id_usage'] else "50dbc7dc-e839-46d9-9bfd-292c0d4f831e"
    
    return {
        "type": "START_TRANSACTION",
        "header": {
            "transactionDateTime": "2025-08-22T21:47:52",
            "transactionDateTimeUTC": "2025-08-22T21:47:52-04:00",
            "storeId": analysis['store_id'] or 20,
            "eventTimeStamp": "2025-08-22T21:47:52",
            "eventTimeStampUTC": "2025-08-22T21:47:52-04:00",
            "deviceId": device_id,
            "deviceOS": analysis['os_info'] or "Android",
            "deviceAppVersion": analysis['app_version'] or "10.28.0",
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
    
    print(f"Analyzing detailed shop'n'scan flows from: {log_file}")
    
    # Extract flows
    flows = extract_specific_flows(log_file)
    
    # Analyze session flow
    analysis = analyze_session_flow(flows)
    
    # Generate session template
    session_template = generate_complete_session_template(analysis)
    
    # Print detailed results
    print(f"\n=== DETAILED SHOP'N'SCAN FLOW ANALYSIS ===")
    print(f"isShopAndScanEnabled calls: {len(flows['is_shop_scan_enabled'])}")
    print(f"NextGenPOSBasket calls: {len(flows['next_gen_pos_basket'])}")
    print(f"Device IDs found: {len(flows['device_ids'])}")
    print(f"UPC scans found: {len(flows['upc_scans'])}")
    print(f"Session starts found: {len(flows['session_starts'])}")
    print(f"Cart updates found: {len(flows['cart_updates'])}")
    print(f"Header sets found: {len(flows['headers'])}")
    
    print(f"\n=== SESSION SEQUENCE ===")
    for flow in analysis['session_sequence'][:10]:  # Show first 10
        print(f"Index {flow['index']}: {flow['type']}")
    
    print(f"\n=== DEVICE ID USAGE ===")
    for device_id, usage in analysis['device_id_usage'].items():
        print(f"Device ID: {device_id}")
        print(f"  Used in {len(usage)} flows")
    
    print(f"\n=== EXTRACTED INFORMATION ===")
    print(f"Store ID: {analysis['store_id']}")
    print(f"App Version: {analysis['app_version']}")
    print(f"OS Info: {analysis['os_info']}")
    
    print(f"\n=== UPC SCAN DETAILS ===")
    for scan in flows['upc_scans']:
        print(f"Barcode: {scan['barcode']} (Index: {scan['index']})")
    
    print(f"\n=== COMPLETE SESSION TEMPLATE ===")
    print(json.dumps(session_template, indent=2))
    
    # Save detailed results
    results = {
        'flows': flows,
        'analysis': analysis,
        'session_template': session_template
    }
    
    with open('logs/detailed_shop_scan_analysis.json', 'w') as f:
        json.dump(results, f, indent=2)
    
    print(f"\nDetailed results saved to: logs/detailed_shop_scan_analysis.json")


if __name__ == '__main__':
    main()
