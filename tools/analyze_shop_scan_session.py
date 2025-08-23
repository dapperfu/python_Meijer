#!/usr/bin/env python3
"""
Analyze shop'n'scan session flows from mitmproxy logs.

This script analyzes the shop'n'scan session flows starting from the
isShopAndScanEnabled endpoint, including session initialization,
UPC scanning, cart updates, and session resumption after crashes.
"""

import json
import re
from datetime import datetime
from pathlib import Path
from typing import Dict, List, Any, Optional
import argparse


def parse_mitmproxy_log(log_file_path: str) -> List[Dict[str, Any]]:
    """
    Parse mitmproxy log file and extract HTTP flows.
    
    Args:
        log_file_path: Path to the mitmproxy log file
        
    Returns:
        List of parsed flow dictionaries
    """
    flows = []
    current_flow = {}
    
    with open(log_file_path, 'r', encoding='utf-8', errors='ignore') as f:
        for line_num, line in enumerate(f, 1):
            line = line.strip()
            
            # Start of new flow
            if line.startswith('>>'):
                if current_flow:
                    flows.append(current_flow)
                current_flow = {
                    'line_start': line_num,
                    'request': {},
                    'response': {},
                    'raw_lines': []
                }
            
            current_flow['raw_lines'].append(line)
            
            # Parse request line
            if line.startswith('>>') and 'HTTP' in line:
                parts = line.split(' ')
                if len(parts) >= 3:
                    current_flow['request']['method'] = parts[0][2:]  # Remove >>
                    current_flow['request']['url'] = parts[1]
                    current_flow['request']['http_version'] = parts[2]
            
            # Parse headers
            elif line.startswith('>>') and ':' in line:
                if 'headers' not in current_flow['request']:
                    current_flow['request']['headers'] = {}
                if ':' in line[2:]:
                    key, value = line[2:].split(':', 1)
                    current_flow['request']['headers'][key.strip()] = value.strip()
            
            # Parse response line
            elif line.startswith('<<') and 'HTTP' in line:
                parts = line.split(' ')
                if len(parts) >= 2:
                    current_flow['response']['http_version'] = parts[0][2:]  # Remove <<
                    current_flow['response']['status_code'] = parts[1]
                    current_flow['response']['status_text'] = ' '.join(parts[2:])
            
            # Parse response headers
            elif line.startswith('<<') and ':' in line:
                if 'headers' not in current_flow['response']:
                    current_flow['response']['headers'] = {}
                if ':' in line[2:]:
                    key, value = line[2:].split(':', 1)
                    current_flow['response']['headers'][key.strip()] = value.strip()
            
            # Parse JSON body (look for lines that might contain JSON)
            elif line.startswith('{') and line.endswith('}'):
                try:
                    json_data = json.loads(line)
                    if 'request' in current_flow and 'body' not in current_flow['request']:
                        current_flow['request']['body'] = json_data
                    elif 'response' in current_flow and 'body' not in current_flow['response']:
                        current_flow['response']['body'] = json_data
                except json.JSONDecodeError:
                    pass
    
    # Add the last flow
    if current_flow:
        flows.append(current_flow)
    
    return flows


def analyze_shop_scan_flows(flows: List[Dict[str, Any]]) -> Dict[str, Any]:
    """
    Analyze shop'n'scan related flows.
    
    Args:
        flows: List of parsed HTTP flows
        
    Returns:
        Analysis results
    """
    shop_scan_flows = []
    is_shop_scan_enabled_calls = []
    next_gen_pos_basket_calls = []
    upc_scans = []
    
    for flow in flows:
        url = flow.get('request', {}).get('url', '')
        
        # Find isShopAndScanEnabled calls
        if 'isShopAndScanEnabled' in url:
            is_shop_scan_enabled_calls.append(flow)
        
        # Find NextGenPOSBasket calls
        elif 'NextGenPOSBasket' in url:
            next_gen_pos_basket_calls.append(flow)
        
        # Look for UPC scanning patterns
        elif any(pattern in url for pattern in ['barcode', 'scan', 'item', 'cart']):
            upc_scans.append(flow)
        
        # Add to shop scan flows if related
        if any(keyword in url.lower() for keyword in ['shop', 'scan', 'basket', 'pos']):
            shop_scan_flows.append(flow)
    
    return {
        'is_shop_scan_enabled_calls': is_shop_scan_enabled_calls,
        'next_gen_pos_basket_calls': next_gen_pos_basket_calls,
        'upc_scans': upc_scans,
        'all_shop_scan_flows': shop_scan_flows
    }


def extract_device_id_info(flows: List[Dict[str, Any]]) -> List[Dict[str, Any]]:
    """
    Extract device ID information from flows.
    
    Args:
        flows: List of parsed HTTP flows
        
    Returns:
        List of device ID related information
    """
    device_info = []
    
    for flow in flows:
        # Check request body for deviceId
        request_body = flow.get('request', {}).get('body', {})
        if isinstance(request_body, dict) and 'header' in request_body:
            header = request_body['header']
            if 'deviceId' in header:
                device_info.append({
                    'url': flow.get('request', {}).get('url', ''),
                    'method': flow.get('request', {}).get('method', ''),
                    'device_id': header['deviceId'],
                    'device_os': header.get('deviceOS', ''),
                    'device_app_version': header.get('deviceAppVersion', ''),
                    'device_os_version': header.get('deviceOSVersion', ''),
                    'timestamp': header.get('transactionDateTime', ''),
                    'store_id': header.get('storeId', ''),
                    'line_start': flow.get('line_start', 0)
                })
        
        # Check headers for device-related info
        headers = flow.get('request', {}).get('headers', {})
        if 'user-agent' in headers:
            user_agent = headers['user-agent']
            if 'deviceId' in user_agent or 'Android' in user_agent:
                device_info.append({
                    'url': flow.get('request', {}).get('url', ''),
                    'method': flow.get('request', {}).get('method', ''),
                    'user_agent': user_agent,
                    'line_start': flow.get('line_start', 0)
                })
    
    return device_info


def generate_session_start_json() -> Dict[str, Any]:
    """
    Generate the JSON payload for starting a shop'n'scan session.
    
    Returns:
        JSON payload structure for START_TRANSACTION
    """
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
        }
    }


def main():
    """Main analysis function."""
    parser = argparse.ArgumentParser(description='Analyze shop\'n\'scan session flows')
    parser.add_argument('log_file', help='Path to mitmproxy log file')
    parser.add_argument('--output', '-o', help='Output file for results')
    args = parser.parse_args()
    
    print(f"Analyzing log file: {args.log_file}")
    
    # Parse the log file
    flows = parse_mitmproxy_log(args.log_file)
    print(f"Parsed {len(flows)} flows")
    
    # Analyze shop scan flows
    analysis = analyze_shop_scan_flows(flows)
    
    # Extract device ID information
    device_info = extract_device_id_info(flows)
    
    # Print summary
    print(f"\n=== SHOP'N'SCAN FLOW ANALYSIS ===")
    print(f"isShopAndScanEnabled calls: {len(analysis['is_shop_scan_enabled_calls'])}")
    print(f"NextGenPOSBasket calls: {len(analysis['next_gen_pos_basket_calls'])}")
    print(f"UPC scan related calls: {len(analysis['upc_scans'])}")
    print(f"Total shop scan flows: {len(analysis['all_shop_scan_flows'])}")
    print(f"Device ID information found: {len(device_info)}")
    
    # Show device ID details
    if device_info:
        print(f"\n=== DEVICE ID INFORMATION ===")
        for info in device_info[:5]:  # Show first 5
            print(f"URL: {info['url']}")
            print(f"Method: {info['method']}")
            if 'device_id' in info:
                print(f"Device ID: {info['device_id']}")
                print(f"Device OS: {info['device_os']}")
                print(f"App Version: {info['device_app_version']}")
            if 'user_agent' in info:
                print(f"User Agent: {info['user_agent']}")
            print(f"Line: {info['line_start']}")
            print("-" * 50)
    
    # Show session start JSON template
    print(f"\n=== SESSION START JSON TEMPLATE ===")
    session_json = generate_session_start_json()
    print(json.dumps(session_json, indent=2))
    
    # Save results if output file specified
    if args.output:
        results = {
            'analysis': analysis,
            'device_info': device_info,
            'session_start_template': session_json,
            'total_flows': len(flows)
        }
        
        with open(args.output, 'w') as f:
            json.dump(results, f, indent=2)
        print(f"\nResults saved to: {args.output}")


if __name__ == '__main__':
    main()
