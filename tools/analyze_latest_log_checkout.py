#!/usr/bin/env python3
"""
Analyze the latest log file for checkout flows.
This script reads the binary log file properly without using grep.
"""

import json
import re
from pathlib import Path
from typing import Dict, Any

def analyze_latest_log_for_checkout(log_file_path: str) -> Dict[str, Any]:
    """
    Analyze the latest log file for checkout-related flows.
    
    Args:
        log_file_path: Path to the log file to analyze
        
    Returns:
        Dictionary containing analysis results
    """
    results = {
        'log_file': log_file_path,
        'checkout_flows': [],
        'checkout_endpoints': [],
        'checkout_operations': [],
        'pdf417_barcodes': [],
        'cart_summaries': [],
        'analysis_summary': {}
    }
    
    print(f"Analyzing latest log file: {log_file_path}")
    
    try:
        # Read the log file in binary mode
        with open(log_file_path, 'rb') as f:
            content = f.read()
        
        # Decode with error handling for binary content
        try:
            text_content = content.decode('utf-8', errors='ignore')
        except UnicodeDecodeError:
            text_content = content.decode('latin-1', errors='ignore')
        
        print(f"Log file size: {len(content)} bytes")
        print(f"Decoded content length: {len(text_content)} characters")
        
        # Look for checkout-related patterns
        checkout_patterns = [
            r'checkout',
            r'CheckOut', 
            r'check out',
            r'transfer',
            r'complete',
            r'finish',
            r'PDF417',
            r'SS\d+',
            r'Begin Checkout',
            r'Begin Transfer'
        ]
        
        # Look for cart summary patterns
        cart_summary_patterns = [
            r'item total',
            r'estimated taxes', 
            r'subtotal',
            r'total savings',
            r'estimated total',
            r'cart.*total',
            r'tax.*total'
        ]
        
        # Search for patterns
        for pattern in checkout_patterns:
            matches = re.finditer(pattern, text_content, re.IGNORECASE)
            for match in matches:
                # Get context around the match
                start = max(0, match.start() - 200)
                end = min(len(text_content), match.end() + 200)
                context = text_content[start:end]
                
                results['checkout_flows'].append({
                    'pattern': pattern,
                    'match': match.group(),
                    'position': match.start(),
                    'context': context.strip()
                })
        
        # Search for cart summary patterns
        for pattern in cart_summary_patterns:
            matches = re.finditer(pattern, text_content, re.IGNORECASE)
            for match in matches:
                start = max(0, match.start() - 200)
                end = min(len(text_content), match.end() + 200)
                context = text_content[start:end]
                
                results['cart_summaries'].append({
                    'pattern': pattern,
                    'match': match.group(),
                    'position': match.start(),
                    'context': context.strip()
                })
        
        # Look for PDF417 barcode patterns
        pdf417_pattern = r'SS[0-9a-fA-F\-]+'
        pdf417_matches = re.finditer(pdf417_pattern, text_content)
        for match in pdf417_matches:
            results['pdf417_barcodes'].append({
                'barcode': match.group(),
                'position': match.start(),
                'context': text_content[max(0, match.start()-100):min(len(text_content), match.end()+100)].strip()
            })
        
        # Look for potential checkout endpoints
        endpoint_pattern = r'https?://[^\s]+/checkout[^\s]*|https?://[^\s]+/transfer[^\s]*|https?://[^\s]+/complete[^\s]*'
        endpoint_matches = re.finditer(endpoint_pattern, text_content)
        for match in endpoint_matches:
            results['checkout_endpoints'].append({
                'endpoint': match.group(),
                'position': match.start(),
                'context': text_content[max(0, match.start()-100):min(len(text_content), match.end()+100)].strip()
            })
        
        # Summary statistics
        results['analysis_summary'] = {
            'total_checkout_flows': len(results['checkout_flows']),
            'total_cart_summaries': len(results['cart_summaries']),
            'total_pdf417_barcodes': len(results['pdf417_barcodes']),
            'total_checkout_endpoints': len(results['checkout_endpoints']),
            'log_file_size_bytes': len(content),
            'decoded_content_length': len(text_content)
        }
        
        print(f"Found {len(results['checkout_flows'])} checkout-related flows")
        print(f"Found {len(results['cart_summaries'])} cart summary patterns")
        print(f"Found {len(results['pdf417_barcodes'])} PDF417 barcodes")
        print(f"Found {len(results['checkout_endpoints'])} checkout endpoints")
        
    except Exception as e:
        print(f"Error analyzing log file: {e}")
        results['error'] = str(e)
    
    return results

def main():
    """Main function to analyze the latest log file."""
    # Find the latest log file
    logs_dir = Path('logs')
    log_files = list(logs_dir.glob('meijer_mitm_*.log'))
    
    if not log_files:
        print("No log files found in logs/ directory")
        return
    
    # Sort by modification time to get the latest
    latest_log = max(log_files, key=lambda x: x.stat().st_mtime)
    print(f"Latest log file: {latest_log}")
    
    # Analyze the latest log file
    results = analyze_latest_log_for_checkout(str(latest_log))
    
    # Save results
    output_file = "logs/latest_log_checkout_analysis.json"
    with open(output_file, 'w') as f:
        json.dump(results, f, indent=2)
    
    print(f"\nResults saved to: {output_file}")
    
    # Print summary
    print("\n=== CHECKOUT ANALYSIS SUMMARY ===")
    print(f"Log file: {results['log_file']}")
    print(f"Checkout flows found: {results['analysis_summary']['total_checkout_flows']}")
    print(f"Cart summaries found: {results['analysis_summary']['total_cart_summaries']}")
    print(f"PDF417 barcodes found: {results['analysis_summary']['total_pdf417_barcodes']}")
    print(f"Checkout endpoints found: {results['analysis_summary']['total_checkout_endpoints']}")
    
    # Show PDF417 barcodes if found
    if results['pdf417_barcodes']:
        print("\n=== PDF417 BARCODES FOUND ===")
        for barcode_info in results['pdf417_barcodes']:
            print(f"Barcode: {barcode_info['barcode']}")
            print(f"Context: {barcode_info['context'][:100]}...")
            print()
    
    # Show checkout flows if found
    if results['checkout_flows']:
        print("\n=== CHECKOUT FLOWS FOUND ===")
        for flow in results['checkout_flows'][:5]:  # Show first 5
            print(f"Pattern: {flow['pattern']}")
            print(f"Match: {flow['match']}")
            print(f"Context: {flow['context'][:100]}...")
            print()

if __name__ == '__main__':
    main()
