#!/usr/bin/env python3
"""
Comprehensive analysis of mitmproxy logs for shop and scan endpoints.

This script analyzes all *.log files using direct binary reading and regex
to find all shop and scan related endpoints, methods, and JSON responses.
"""

import json
import re
import sys
from pathlib import Path
from typing import Dict, List, Set, Any, Optional
from collections import defaultdict


class ComprehensiveShopScanAnalyzer:
    """Comprehensive analyzer for shop and scan endpoints in mitmproxy logs."""
    
    def __init__(self):
        self.shop_endpoints = defaultdict(set)
        self.scan_endpoints = defaultdict(set)
        self.all_endpoints = set()
        self.methods = set()
        self.status_codes = set()
        self.json_responses = defaultdict(list)
        self.endpoint_details = defaultdict(list)
        
    def analyze_log_file(self, log_file: Path) -> Dict[str, Any]:
        """Analyze a single mitmproxy log file."""
        print(f"🔍 Analyzing {log_file.name}...")
        
        try:
            # Read the binary log file
            with open(log_file, "rb") as f:
                content = f.read()
            
            # Decode with error handling
            decoded_content = content.decode("utf-8", errors="ignore")
            
            results = {
                'log_file': str(log_file),
                'file_size_mb': len(content) / (1024 * 1024),
                'shop_endpoints': defaultdict(set),
                'scan_endpoints': defaultdict(set),
                'all_endpoints': set(),
                'methods': set(),
                'status_codes': set(),
                'json_responses': defaultdict(list),
                'endpoint_details': defaultdict(list)
            }
            
            # Extract HTTP methods and paths
            self._extract_http_endpoints(decoded_content, results)
            
            # Extract JSON responses
            self._extract_json_responses(decoded_content, results)
            
            # Extract status codes
            self._extract_status_codes(decoded_content, results)
            
            # Convert sets to lists for JSON serialization
            for key in ['shop_endpoints', 'scan_endpoints', 'all_endpoints', 'methods', 'status_codes']:
                if key in ['shop_endpoints', 'scan_endpoints']:
                    results[key] = {url: list(methods) for url, methods in results[key].items()}
                else:
                    results[key] = list(results[key])
            
            print(f"   📊 Found {len(results['all_endpoints'])} unique endpoints")
            print(f"   🏪 Found {len(results['shop_endpoints'])} shop-related endpoints")
            print(f"   📱 Found {len(results['scan_endpoints'])} scan-related endpoints")
            
            return results
            
        except Exception as e:
            print(f"   ❌ Error analyzing {log_file}: {e}")
            return {}
    
    def _extract_http_endpoints(self, content: str, results: Dict[str, Any]) -> None:
        """Extract HTTP endpoints from log content."""
        # Pattern: look for HTTP methods followed by paths
        http_pattern = r'(GET|POST|PUT|DELETE|PATCH)\s+([^\s]+)'
        matches = re.finditer(http_pattern, content)
        
        for match in matches:
            method = match.group(1)
            path = match.group(2)
            
            # Filter for relevant endpoints
            if self._is_relevant_endpoint(path):
                # Clean up the path
                clean_path = self._clean_path(path)
                if clean_path:
                    results['methods'].add(method)
                    results['all_endpoints'].add(clean_path)
                    
                    # Categorize endpoints
                    if self._is_shop_endpoint(clean_path):
                        results['shop_endpoints'][clean_path].add(method)
                    if self._is_scan_endpoint(clean_path):
                        results['scan_endpoints'][clean_path].add(method)
                    
                    # Store endpoint details
                    results['endpoint_details'][clean_path].append({
                        'method': method,
                        'full_path': path,
                        'context': self._get_context(content, match.start(), 100)
                    })
        
        # Also look for paths in quoted strings
        quoted_pattern = r'"([^"]*api\.meijer\.com[^"]*)"'
        quoted_matches = re.finditer(quoted_pattern, content)
        
        for match in quoted_matches:
            quoted_path = match.group(1)
            if self._is_relevant_endpoint(quoted_path):
                clean_path = self._clean_path(quoted_path)
                if clean_path:
                    results['all_endpoints'].add(clean_path)
                    
                    if self._is_shop_endpoint(clean_path):
                        results['shop_endpoints'][clean_path].add('UNKNOWN')
                    if self._is_scan_endpoint(clean_path):
                        results['scan_endpoints'][clean_path].add('UNKNOWN')
    
    def _extract_json_responses(self, content: str, results: Dict[str, Any]) -> None:
        """Extract JSON responses from log content."""
        # Look for JSON-like content in responses
        json_pattern = r'(\{[^{}]*(?:\{[^{}]*\}[^{}]*)*\})'
        matches = re.finditer(json_pattern, content)
        
        for match in matches:
            try:
                json_str = match.group(1)
                # Try to parse as JSON
                json_data = json.loads(json_str)
                
                # Check if this JSON contains shop/scan related data
                if self._is_relevant_json(json_data):
                    # Try to find the associated endpoint
                    context_before = content[max(0, match.start() - 200):match.start()]
                    endpoint_match = re.search(r'api\.meijer\.com([^?\s]+)', context_before)
                    if endpoint_match:
                        endpoint = endpoint_match.group(1)
                        results['json_responses'][endpoint].append({
                            'data': json_data,
                            'context': self._get_context(content, match.start(), 100)
                        })
            except json.JSONDecodeError:
                continue
    
    def _extract_status_codes(self, content: str, results: Dict[str, Any]) -> None:
        """Extract HTTP status codes from log content."""
        status_pattern = r'HTTP/[0-9.]+ (\d{3})'
        matches = re.finditer(status_pattern, content)
        
        for match in matches:
            status_code = int(match.group(1))
            results['status_codes'].add(status_code)
    
    def _is_relevant_endpoint(self, path: str) -> bool:
        """Check if endpoint is relevant (Meijer API)."""
        return 'api.meijer.com' in path or path.startswith('/digital/')
    
    def _is_shop_endpoint(self, path: str) -> bool:
        """Check if endpoint is shop-related."""
        path_lower = path.lower()
        shop_keywords = [
            'shop', 'store', 'cart', 'item', 'product', 'barcode', 'upc',
            'fulfillment', 'reservation', 'order', 'checkout', 'payment',
            'inventory', 'catalog', 'search', 'category', 'department'
        ]
        return any(keyword in path_lower for keyword in shop_keywords)
    
    def _is_scan_endpoint(self, path: str) -> bool:
        """Check if endpoint is scan-related."""
        path_lower = path.lower()
        scan_keywords = [
            'scan', 'barcode', 'upc', 'qr', 'camera', 'shopnscan',
            'image', 'photo', 'recognition', 'ocr'
        ]
        return any(keyword in path_lower for keyword in scan_keywords)
    
    def _is_relevant_json(self, json_data: Any) -> bool:
        """Check if JSON data is relevant to shop/scan functionality."""
        if isinstance(json_data, dict):
            # Look for relevant keys
            relevant_keys = [
                'items', 'products', 'cart', 'order', 'barcode', 'upc',
                'price', 'quantity', 'store', 'location', 'scan', 'image'
            ]
            return any(key in str(json_data).lower() for key in relevant_keys)
        return False
    
    def _clean_path(self, path: str) -> Optional[str]:
        """Clean and normalize API path."""
        if path.startswith('http'):
            # Extract just the path part
            path_match = re.search(r'api\.meijer\.com([^?\s]+)', path)
            if path_match:
                return path_match.group(1)
            return None
        elif path.startswith('/'):
            return path
        else:
            return None
    
    def _get_context(self, content: str, position: int, context_size: int) -> str:
        """Get context around a position in the content."""
        start = max(0, position - context_size)
        end = min(len(content), position + context_size)
        return content[start:end].replace('\n', ' ').strip()


def main():
    """Main analysis function."""
    print("🔍 Comprehensive Shop & Scan Endpoint Analysis")
    print("=" * 60)
    
    # Find all log files
    log_files = list(Path(".").glob("*.log"))
    print(f"Found {len(log_files)} log files to analyze")
    
    analyzer = ComprehensiveShopScanAnalyzer()
    all_results = {}
    
    for log_file in log_files:
        print(f"\n📁 Analyzing {log_file.name}...")
        results = analyzer.analyze_log_file(log_file)
        if results:
            all_results[log_file.name] = results
    
    # Generate comprehensive report
    print("\n📊 Generating comprehensive report...")
    
    comprehensive_report = {
        'analysis_summary': {
            'total_log_files': len(log_files),
            'successfully_analyzed': len(all_results),
            'total_unique_endpoints': set(),
            'total_shop_endpoints': set(),
            'total_scan_endpoints': set(),
            'all_methods': set(),
            'all_status_codes': set(),
            'total_file_size_mb': 0
        },
        'endpoint_analysis': {},
        'json_response_analysis': {},
        'implementation_gaps': []
    }
    
    # Aggregate results
    for log_name, results in all_results.items():
        comprehensive_report['endpoint_analysis'][log_name] = results
        
        if 'all_endpoints' in results:
            comprehensive_report['analysis_summary']['total_unique_endpoints'].update(results['all_endpoints'])
        if 'shop_endpoints' in results:
            comprehensive_report['analysis_summary']['total_shop_endpoints'].update(results['shop_endpoints'].keys())
        if 'scan_endpoints' in results:
            comprehensive_report['analysis_summary']['total_scan_endpoints'].update(results['scan_endpoints'].keys())
        if 'methods' in results:
            comprehensive_report['analysis_summary']['all_methods'].update(results['methods'])
        if 'status_codes' in results:
            comprehensive_report['analysis_summary']['all_status_codes'].update(results['status_codes'])
        if 'file_size_mb' in results:
            comprehensive_report['analysis_summary']['total_file_size_mb'] += results['file_size_mb']
    
    # Convert sets to lists for JSON serialization
    for key in ['total_unique_endpoints', 'total_shop_endpoints', 'total_scan_endpoints', 'all_methods', 'all_status_codes']:
        comprehensive_report['analysis_summary'][key] = list(comprehensive_report['analysis_summary'][key])
    
    # Save comprehensive report
    with open("comprehensive_shop_scan_analysis.json", "w") as f:
        json.dump(comprehensive_report, f, indent=2, default=str)
    
    print(f"\n✅ Analysis complete!")
    print(f"📄 Comprehensive report saved to: comprehensive_shop_scan_analysis.json")
    print(f"🔍 Found {len(comprehensive_report['analysis_summary']['total_unique_endpoints'])} unique endpoints")
    print(f"🏪 Found {len(comprehensive_report['analysis_summary']['total_shop_endpoints'])} shop-related endpoints")
    print(f"📱 Found {len(comprehensive_report['analysis_summary']['total_scan_endpoints'])} scan-related endpoints")
    print(f"📊 Analyzed {comprehensive_report['analysis_summary']['total_file_size_mb']:.1f} MB of log data")
    
    return comprehensive_report


if __name__ == "__main__":
    main()
