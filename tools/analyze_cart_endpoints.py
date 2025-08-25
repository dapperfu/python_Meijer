#!/usr/bin/env python3
"""
Mitmdump script to analyze cart endpoints and methods from Meijer API logs.

This script extracts all cart-related API calls, their methods, endpoints,
and response data to ensure complete implementation coverage.
"""

import json
import re
from typing import Dict, Any, Optional
from urllib.parse import urlparse, parse_qs
from mitmproxy import ctx


class CartEndpointAnalyzer:
    """Analyzes cart endpoints and methods from mitmproxy flows."""
    
    def __init__(self):
        self.cart_endpoints = []
        self.cart_methods = []
        self.cart_responses = []
        self.cart_requests = []
        self.all_endpoints = set()
        self.all_methods = set()
        
        # Cart-related keywords to look for
        self.cart_keywords = [
            'cart', 'basket', 'shopping', 'item', 'product', 'order',
            'checkout', 'purchase', 'add', 'remove', 'update', 'quantity',
            'scan', 'shopandscan', 'bogo', 'deal', 'promotion'
        ]
        
        # Common cart endpoints patterns
        self.cart_endpoint_patterns = [
            r'/cart',
            r'/basket',
            r'/shopping',
            r'/items',
            r'/products',
            r'/orders',
            r'/checkout',
            r'/scan',
            r'/shopandscan',
            r'/bogo',
            r'/deals',
            r'/promotions'
        ]
    
    def is_cart_related(self, url: str, method: str, request_data: str, response_data: str) -> bool:
        """Determine if a request/response is cart-related."""
        url_lower = url.lower()
        method_lower = method.lower()
        request_lower = request_data.lower()
        response_lower = response_data.lower()
        
        # Check URL patterns
        for pattern in self.cart_endpoint_patterns:
            if re.search(pattern, url_lower):
                return True
        
        # Check for cart keywords in URL
        for keyword in self.cart_keywords:
            if keyword in url_lower:
                return True
        
        # Check for cart keywords in request/response data
        for keyword in self.cart_keywords:
            if keyword in request_lower or keyword in response_lower:
                return True
        
        # Check for specific cart indicators in response
        cart_indicators = [
            'cartNowTotal', 'cartWasTotal', 'cartSavingsTotal',
            'cartItems', 'shoppingCart', 'basketItems',
            'itemQuantity', 'productQuantity', 'scanQuantity'
        ]
        
        for indicator in cart_indicators:
            if indicator in response_lower:
                return True
        
        return False
    
    def extract_cart_data(self, flow) -> Optional[Dict[str, Any]]:
        """Extract cart-related data from a flow."""
        try:
            request = flow.request
            response = flow.response
            
            if not response:
                return None
            
            # Parse URL
            parsed_url = urlparse(request.pretty_url)
            path = parsed_url.path
            query_params = parse_qs(parsed_url.query)
            
            # Get request data
            request_data = ""
            if request.content:
                try:
                    request_data = request.content.decode('utf-8', errors='ignore')
                except:
                    request_data = str(request.content)
            
            # Get response data
            response_data = ""
            if response.content:
                try:
                    response_data = response.content.decode('utf-8', errors='ignore')
                except:
                    response_data = str(response.content)
            
            # Check if this is cart-related
            if not self.is_cart_related(path, request.method, request_data, response_data):
                return None
            
            # Extract cart-specific information
            cart_info = {
                'method': request.method,
                'endpoint': path,
                'full_url': request.pretty_url,
                'query_params': query_params,
                'request_headers': dict(request.headers),
                'response_headers': dict(response.headers),
                'status_code': response.status_code,
                'request_data': request_data,
                'response_data': response_data,
                'timestamp': flow.timestamp_start,
                'flow_id': flow.id
            }
            
            # Try to parse JSON response for cart data
            try:
                if response_data:
                    json_data = json.loads(response_data)
                    cart_info['parsed_response'] = json_data
                    
                    # Extract specific cart fields
                    cart_info['cart_fields'] = self.extract_cart_fields(json_data)
            except (json.JSONDecodeError, TypeError):
                cart_info['parsed_response'] = None
                cart_info['cart_fields'] = {}
            
            return cart_info
            
        except Exception as e:
            ctx.log.error(f"Error extracting cart data: {e}")
            return None
    
    def extract_cart_fields(self, data: Any, path: str = "") -> Dict[str, Any]:
        """Recursively extract cart-related fields from JSON data."""
        cart_fields = {}
        
        if isinstance(data, dict):
            for key, value in data.items():
                current_path = f"{path}.{key}" if path else key
                
                # Look for cart-related keys
                if any(keyword in key.lower() for keyword in self.cart_keywords):
                    cart_fields[current_path] = value
                
                # Recursively search nested structures
                if isinstance(value, (dict, list)):
                    nested_fields = self.extract_cart_fields(value, current_path)
                    cart_fields.update(nested_fields)
                    
        elif isinstance(data, list):
            for i, item in enumerate(data):
                current_path = f"{path}[{i}]"
                if isinstance(item, (dict, list)):
                    nested_fields = self.extract_cart_fields(item, current_path)
                    cart_fields.update(nested_fields)
        
        return cart_fields
    
    def process_flow(self, flow):
        """Process a single flow to extract cart information."""
        cart_data = self.extract_cart_data(flow)
        
        if cart_data:
            self.cart_endpoints.append(cart_data)
            
            # Track unique endpoints and methods
            self.all_endpoints.add(cart_data['endpoint'])
            self.all_methods.add(cart_data['method'])
            
            # Categorize by method
            if cart_data['method'] not in self.cart_methods:
                self.cart_methods.append(cart_data['method'])
            
            # Store request and response data
            self.cart_requests.append({
                'method': cart_data['method'],
                'endpoint': cart_data['endpoint'],
                'url': cart_data['full_url'],
                'data': cart_data['request_data']
            })
            
            self.cart_responses.append({
                'method': cart_data['method'],
                'endpoint': cart_data['endpoint'],
                'status_code': cart_data['status_code'],
                'data': cart_data['response_data'],
                'cart_fields': cart_data.get('cart_fields', {})
            })
    
    def generate_report(self) -> Dict[str, Any]:
        """Generate a comprehensive report of cart endpoints and methods."""
        report = {
            'summary': {
                'total_cart_flows': len(self.cart_endpoints),
                'unique_endpoints': len(self.all_endpoints),
                'unique_methods': len(self.all_methods),
                'methods_used': list(self.all_methods),
                'endpoints_found': list(self.all_endpoints)
            },
            'cart_endpoints': self.cart_endpoints,
            'cart_requests': self.cart_requests,
            'cart_responses': self.cart_responses,
            'endpoint_analysis': {},
            'method_analysis': {}
        }
        
        # Analyze endpoints by frequency
        endpoint_counts = {}
        for endpoint in [e['endpoint'] for e in self.cart_endpoints]:
            endpoint_counts[endpoint] = endpoint_counts.get(endpoint, 0) + 1
        
        report['endpoint_analysis'] = {
            'endpoint_frequency': endpoint_counts,
            'most_used_endpoints': sorted(endpoint_counts.items(), key=lambda x: x[1], reverse=True)
        }
        
        # Analyze methods by frequency
        method_counts = {}
        for method in [e['method'] for e in self.cart_endpoints]:
            method_counts[method] = method_counts.get(method, 0) + 1
        
        report['method_analysis'] = {
            'method_frequency': method_counts,
            'most_used_methods': sorted(method_counts.items(), key=lambda x: x[1], reverse=True)
        }
        
        return report


# Global analyzer instance
analyzer = CartEndpointAnalyzer()


def load(loader):
    """Called when the script is loaded."""
    ctx.log.info("Cart Endpoint Analyzer loaded")


def request(flow):
    """Called for each request."""
    pass


def response(flow):
    """Called for each response."""
    analyzer.process_flow(flow)


def done():
    """Called when all flows have been processed."""
    ctx.log.info("Analysis complete. Generating report...")
    
    report = analyzer.generate_report()
    
    # Save detailed report
    with open('cart_endpoints_analysis.json', 'w') as f:
        json.dump(report, f, indent=2, default=str)
    
    # Save summary
    summary = {
        'summary': report['summary'],
        'endpoint_analysis': report['endpoint_analysis'],
        'method_analysis': report['method_analysis']
    }
    
    with open('cart_endpoints_summary.json', 'w') as f:
        json.dump(summary, f, indent=2, default=str)
    
    # Print summary to console
    print("\n" + "="*80)
    print("CART ENDPOINTS ANALYSIS COMPLETE")
    print("="*80)
    print(f"Total cart flows analyzed: {report['summary']['total_cart_flows']}")
    print(f"Unique endpoints found: {report['summary']['unique_endpoints']}")
    print(f"HTTP methods used: {', '.join(report['summary']['methods_used'])}")
    print("Most used endpoints:")
    for endpoint, count in report['endpoint_analysis']['most_used_endpoints'][:10]:
        print(f"  {endpoint}: {count} calls")
    print("\nDetailed report saved to: cart_endpoints_analysis.json")
    print("Summary saved to: cart_endpoints_summary.json")
    print("="*80)
