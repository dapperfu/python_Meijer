#!/usr/bin/env python3
"""
Comprehensive Shop'n'Scan endpoint analysis and comparison with Python implementation.
"""

import json
import re
from typing import List, Dict, Any, Set
from pathlib import Path


def extract_all_shop_scan_endpoints(log_file_path: str) -> Dict[str, Any]:
    """
    Extract all Shop'n'Scan related endpoints and their usage patterns from the log.
    """
    results = {
        'endpoints': {},
        'request_types': {},
        'response_patterns': {},
        'headers': {},
        'json_payloads': {},
        'session_flows': [],
        'cart_operations': [],
        'barcode_operations': []
    }
    
    with open(log_file_path, 'rb') as f:
        content = f.read()
    
    print("Analyzing all Shop'n'Scan related endpoints...")
    
    # Look for all HTTP requests to shop'n'scan related URLs
    shop_scan_url_patterns = [
        rb'shopandscan',
        rb'NextGenPOSBasket',
        rb'isShopAndScanEnabled',
        rb'ShopAndScan',
        rb'shop.*scan',
        rb'scan.*shop'
    ]
    
    # Find all HTTP request patterns
    http_request_pattern = rb'(POST|GET|PUT|DELETE|PATCH)\s+([^\s]+)'
    http_requests = re.findall(http_request_pattern, content)
    
    for method, url in http_requests:
        method_str = method.decode('utf-8')
        url_str = url.decode('utf-8')
        
        # Check if this is a shop'n'scan related request
        is_shop_scan = any(pattern.decode('utf-8').lower() in url_str.lower() for pattern in shop_scan_url_patterns)
        
        if is_shop_scan:
            # Extract context around this request
            url_bytes = url
            start = 0
            while True:
                pos = content.find(url_bytes, start)
                if pos == -1:
                    break
                
                # Extract context around the request
                context_start = max(0, pos - 3000)
                context_end = min(len(content), pos + 3000)
                context = content[context_start:context_end]
                
                try:
                    context_text = context.decode('utf-8', errors='ignore')
                    
                    # Look for JSON payloads
                    json_matches = re.findall(r'\{[^{}]*\}', context_text)
                    
                    # Look for headers
                    headers = {}
                    header_matches = re.findall(r'([^:\s]+):\s*([^\r\n]+)', context_text)
                    for key, value in header_matches:
                        if key.lower() in ['authorization', 'content-type', 'user-agent', 'ocp-apim-subscription-key']:
                            headers[key] = value.strip()
                    
                    # Look for response patterns
                    response_patterns = []
                    if 'HTTP/' in context_text:
                        response_matches = re.findall(r'HTTP/[^\s]+\s+(\d+)\s+([^\r\n]+)', context_text)
                        for status, reason in response_matches:
                            response_patterns.append(f"{status}: {reason}")
                    
                    # Categorize the endpoint
                    endpoint_key = url_str
                    if endpoint_key not in results['endpoints']:
                        results['endpoints'][endpoint_key] = {
                            'method': method_str,
                            'count': 0,
                            'contexts': [],
                            'json_payloads': [],
                            'headers': [],
                            'responses': []
                        }
                    
                    results['endpoints'][endpoint_key]['count'] += 1
                    results['endpoints'][endpoint_key]['contexts'].append({
                        'position': pos,
                        'context': context_text[:500] + '...' if len(context_text) > 500 else context_text
                    })
                    
                    if json_matches:
                        results['endpoints'][endpoint_key]['json_payloads'].extend(json_matches)
                    
                    if headers:
                        results['endpoints'][endpoint_key]['headers'].append(headers)
                    
                    if response_patterns:
                        results['endpoints'][endpoint_key]['responses'].extend(response_patterns)
                    
                except Exception as e:
                    pass
                
                start = pos + 1
    
    # Extract specific operation types
    print("Extracting operation types...")
    
    # Look for specific operation types in JSON payloads
    operation_patterns = [
        rb'"type":"([^"]+)"',
        rb'"operation":"([^"]+)"',
        rb'"action":"([^"]+)"'
    ]
    
    for pattern in operation_patterns:
        matches = re.findall(pattern, content)
        for match in matches:
            operation = match.decode('utf-8')
            if operation not in results['request_types']:
                results['request_types'][operation] = 0
            results['request_types'][operation] += 1
    
    # Extract session flow patterns
    print("Extracting session flow patterns...")
    
    session_patterns = [
        rb'START_TRANSACTION',
        rb'END_TRANSACTION',
        rb'BARCODE_SCANNED',
        rb'ADD_ITEM',
        rb'UPDATE_ITEM',
        rb'REMOVE_ITEM',
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
                
                # Look for HTTP request patterns
                http_patterns = re.findall(r'(POST|GET|PUT|DELETE|PATCH)\s+([^\s]+)', context_text)
                
                results['session_flows'].append({
                    'operation': pattern.decode('utf-8'),
                    'position': pos,
                    'context': context_text,
                    'http_requests': http_patterns
                })
                
            except Exception as e:
                pass
            
            start = pos + 1
    
    return results


def analyze_python_implementation() -> Dict[str, Any]:
    """
    Analyze the existing Python Shop'n'Scan implementation.
    """
    shop_scan_file = Path("meijer/shop_scan.py")
    
    if not shop_scan_file.exists():
        return {"error": "shop_scan.py not found"}
    
    with open(shop_scan_file, 'r') as f:
        content = f.read()
    
    analysis = {
        'endpoints': {},
        'methods': {},
        'session_management': {},
        'cart_operations': {},
        'barcode_operations': {}
    }
    
    # Extract endpoints
    endpoint_pattern = r'self\.endpoints\["([^"]+)"\]:\s*"([^"]+)"'
    endpoints = re.findall(endpoint_pattern, content)
    
    for name, path in endpoints:
        analysis['endpoints'][name] = path
    
    # Extract method names
    method_pattern = r'def\s+([a-zA-Z_][a-zA-Z0-9_]*)\s*\('
    methods = re.findall(method_pattern, content)
    
    for method in methods:
        if 'shop' in method.lower() or 'scan' in method.lower() or 'cart' in method.lower():
            analysis['methods'][method] = True
    
    # Extract session management
    session_patterns = [
        r'start_shop_n_scan_session',
        r'_ensure_session',
        r'is_session_active',
        r'end_session'
    ]
    
    for pattern in session_patterns:
        if pattern in content:
            analysis['session_management'][pattern] = True
    
    # Extract cart operations
    cart_patterns = [
        r'add_to_cart',
        r'remove_from_cart',
        r'get_cart',
        r'clear_cart'
    ]
    
    for pattern in cart_patterns:
        if pattern in content:
            analysis['cart_operations'][pattern] = True
    
    # Extract barcode operations
    barcode_patterns = [
        r'lookup_barcode_price',
        r'scan_item',
        r'barcode'
    ]
    
    for pattern in barcode_patterns:
        if pattern in content:
            analysis['barcode_operations'][pattern] = True
    
    return analysis


def compare_implementations(log_analysis: Dict[str, Any], python_analysis: Dict[str, Any]) -> Dict[str, Any]:
    """
    Compare the log analysis with the Python implementation.
    """
    comparison = {
        'missing_endpoints': [],
        'missing_operations': [],
        'implementation_gaps': [],
        'recommendations': []
    }
    
    # Compare endpoints
    log_endpoints = set(log_analysis['endpoints'].keys())
    python_endpoints = set(python_analysis['endpoints'].values())
    
    # Find endpoints in logs that aren't implemented
    for log_endpoint in log_endpoints:
        if not any(log_endpoint.endswith(py_endpoint) for py_endpoint in python_endpoints):
            comparison['missing_endpoints'].append(log_endpoint)
    
    # Compare operations
    log_operations = set(log_analysis['request_types'].keys())
    python_operations = set()
    
    # Map Python methods to operations
    method_to_operation = {
        'add_to_cart': 'ADD_ITEM',
        'remove_from_cart': 'REMOVE_ITEM',
        'start_shop_n_scan_session': 'START_TRANSACTION',
        'lookup_barcode_price': 'BARCODE_SCANNED'
    }
    
    for method, operation in method_to_operation.items():
        if method in python_analysis['methods']:
            python_operations.add(operation)
    
    # Find missing operations
    for log_operation in log_operations:
        if log_operation not in python_operations:
            comparison['missing_operations'].append(log_operation)
    
    # Generate recommendations
    if comparison['missing_endpoints']:
        comparison['recommendations'].append(
            f"Implement missing endpoints: {', '.join(comparison['missing_endpoints'])}"
        )
    
    if comparison['missing_operations']:
        comparison['recommendations'].append(
            f"Implement missing operations: {', '.join(comparison['missing_operations'])}"
        )
    
    # Check for implementation gaps
    if not python_analysis.get('session_management'):
        comparison['implementation_gaps'].append("Session management not fully implemented")
    
    if not python_analysis.get('cart_operations'):
        comparison['implementation_gaps'].append("Cart operations not fully implemented")
    
    return comparison


def main():
    """Main analysis function."""
    log_file = "logs/meijer_mitm_20250822_2130.log"
    
    print(f"Comprehensive Shop'n'Scan analysis for: {log_file}")
    
    # Analyze log file
    log_analysis = extract_all_shop_scan_endpoints(log_file)
    
    # Analyze Python implementation
    python_analysis = analyze_python_implementation()
    
    # Compare implementations
    comparison = compare_implementations(log_analysis, python_analysis)
    
    # Print results
    print(f"\n=== LOG ANALYSIS RESULTS ===")
    print(f"Endpoints found: {len(log_analysis['endpoints'])}")
    print(f"Request types found: {len(log_analysis['request_types'])}")
    print(f"Session flows found: {len(log_analysis['session_flows'])}")
    
    print(f"\n=== PYTHON IMPLEMENTATION ANALYSIS ===")
    print(f"Endpoints implemented: {len(python_analysis['endpoints'])}")
    print(f"Methods implemented: {len(python_analysis['methods'])}")
    print(f"Session management: {bool(python_analysis.get('session_management'))}")
    print(f"Cart operations: {bool(python_analysis.get('cart_operations'))}")
    
    print(f"\n=== COMPARISON RESULTS ===")
    print(f"Missing endpoints: {len(comparison['missing_endpoints'])}")
    print(f"Missing operations: {len(comparison['missing_operations'])}")
    print(f"Implementation gaps: {len(comparison['implementation_gaps'])}")
    
    if comparison['missing_endpoints']:
        print(f"\nMissing endpoints:")
        for endpoint in comparison['missing_endpoints']:
            print(f"  - {endpoint}")
    
    if comparison['missing_operations']:
        print(f"\nMissing operations:")
        for operation in comparison['missing_operations']:
            print(f"  - {operation}")
    
    if comparison['recommendations']:
        print(f"\nRecommendations:")
        for rec in comparison['recommendations']:
            print(f"  - {rec}")
    
    # Save detailed results
    detailed_results = {
        'log_analysis': log_analysis,
        'python_analysis': python_analysis,
        'comparison': comparison
    }
    
    with open('logs/comprehensive_shop_scan_analysis.json', 'w') as f:
        json.dump(detailed_results, f, indent=2)
    
    print(f"\nDetailed results saved to: logs/comprehensive_shop_scan_analysis.json")


if __name__ == '__main__':
    main()
