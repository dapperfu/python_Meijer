#!/usr/bin/env python3
"""
Extract api.meijer.com endpoints from mitmproxy logs.

This tool analyzes mitmproxy logs to extract all api.meijer.com endpoints,
their HTTP methods, request/response structures, and generates updated
Flask API server code with the latest endpoints.
"""

import json
import logging
import os
import re
import sys
from collections import defaultdict
from datetime import datetime
from pathlib import Path
from typing import Any, Dict, List, Optional, Set, Tuple
from urllib.parse import urlparse, parse_qs

# Add the parent directory to the path to import meijer modules
sys.path.append(str(Path(__file__).parent.parent))

try:
    from mitmproxy import io
    from mitmproxy.http import HTTPFlow
    MITMPROXY_AVAILABLE = True
except ImportError:
    MITMPROXY_AVAILABLE = False
    print("Warning: mitmproxy not available, using fallback analysis")


class ApiMeijerEndpointExtractor:
    """Extracts api.meijer.com endpoints from mitmproxy logs."""
    
    def __init__(self, log_file_path: str):
        self.log_file_path = Path(log_file_path)
        self.logger = self._setup_logging()
        
        # Store extracted endpoints
        self.endpoints = defaultdict(lambda: {
            'methods': set(),
            'request_headers': defaultdict(int),
            'response_headers': defaultdict(int),
            'request_params': defaultdict(int),
            'response_codes': defaultdict(int),
            'sample_requests': [],
            'sample_responses': [],
            'usage_count': 0
        })
        
        # Track unique patterns
        self.unique_paths = set()
        self.unique_methods = set()
        self.unique_status_codes = set()
        
        # API base URL
        self.api_base = "https://api.meijer.com"
        
    def _setup_logging(self) -> logging.Logger:
        """Setup logging configuration."""
        logging.basicConfig(
            level=logging.INFO,
            format='%(asctime)s - %(levelname)s - %(message)s'
        )
        return logging.getLogger(__name__)
    
    def extract_endpoints(self) -> bool:
        """Extract endpoints from the log file."""
        if not self.log_file_path.exists():
            self.logger.error(f"Log file not found: {self.log_file_path}")
            return False
        
        self.logger.info(f"Extracting endpoints from: {self.log_file_path}")
        
        if MITMPROXY_AVAILABLE:
            return self._extract_with_mitmproxy()
        else:
            return self._extract_with_fallback()
    
    def _extract_with_mitmproxy(self) -> bool:
        """Extract endpoints using mitmproxy libraries."""
        try:
            with open(self.log_file_path, "rb") as f:
                reader = io.FlowReader(f)
                
                flow_count = 0
                api_meijer_count = 0
                
                for flow in reader.stream():
                    flow_count += 1
                    
                    if isinstance(flow, HTTPFlow) and flow.request:
                        if self._is_api_meijer_endpoint(flow.request.pretty_url):
                            api_meijer_count += 1
                            self._process_flow(flow)
                    
                    if flow_count % 1000 == 0:
                        self.logger.info(f"Processed {flow_count} flows, found {api_meijer_count} api.meijer.com calls")
                
                self.logger.info(f"Completed: {flow_count} total flows, {api_meijer_count} api.meijer.com calls")
                return True
                
        except Exception as e:
            self.logger.error(f"Error extracting with mitmproxy: {e}")
            return False
    
    def _extract_with_fallback(self) -> bool:
        """Extract endpoints using fallback text analysis."""
        try:
            with open(self.log_file_path, 'rb') as f:
                content = f.read()
            
            # Try to decode as text
            try:
                decoded_content = content.decode('utf-8', errors='ignore')
            except UnicodeDecodeError:
                decoded_content = content.decode('latin-1', errors='ignore')
            
            # Extract API calls using regex patterns
            self._extract_with_regex(decoded_content)
            return True
            
        except Exception as e:
            self.logger.error(f"Error extracting with fallback: {e}")
            return False
    
    def _extract_with_regex(self, content: str) -> None:
        """Extract endpoints using regex patterns."""
        # Look for api.meijer.com URLs
        api_patterns = [
            r'https://api\.meijer\.com([^\s"\']+)',
            r'api\.meijer\.com([^\s"\']+)',
            r'GET\s+([^\s]+api\.meijer\.com[^\s]+)',
            r'POST\s+([^\s]+api\.meijer\.com[^\s]+)',
            r'PUT\s+([^\s]+api\.meijer\.com[^\s]+)',
            r'DELETE\s+([^\s]+api\.meijer\.com[^\s]+)'
        ]
        
        for pattern in api_patterns:
            matches = re.findall(pattern, content, re.IGNORECASE)
            for match in matches:
                if 'api.meijer.com' in match:
                    self._process_url_match(match)
    
    def _is_api_meijer_endpoint(self, url: str) -> bool:
        """Check if URL is an api.meijer.com endpoint."""
        return 'api.meijer.com' in url.lower()
    
    def _process_flow(self, flow: HTTPFlow) -> None:
        """Process a single HTTP flow."""
        if not flow.request or not flow.response:
            return
        
        url = flow.request.pretty_url
        method = flow.request.method
        path = urlparse(url).path
        
        # Extract endpoint info
        endpoint_info = self.endpoints[path]
        endpoint_info['methods'].add(method)
        endpoint_info['usage_count'] += 1
        
        # Track unique patterns
        self.unique_paths.add(path)
        self.unique_methods.add(method)
        self.unique_status_codes.add(flow.response.status_code)
        
        # Extract headers
        if flow.request.headers:
            for name, value in flow.request.headers.items():
                endpoint_info['request_headers'][f"{name}: {value}"] += 1
        
        if flow.response.headers:
            for name, value in flow.response.headers.items():
                endpoint_info['response_headers'][f"{name}: {value}"] += 1
        
        # Extract query parameters
        if flow.request.query:
            for name, value in flow.request.query.items():
                endpoint_info['request_params'][f"{name}={value}"] += 1
        
        # Track response codes
        endpoint_info['response_codes'][str(flow.response.status_code)] += 1
        
        # Store sample request/response
        if len(endpoint_info['sample_requests']) < 3:
            sample_request = {
                'method': method,
                'url': url,
                'headers': dict(flow.request.headers),
                'query': dict(flow.request.query),
                'body': flow.request.content.decode('utf-8', errors='ignore') if flow.request.content else None
            }
            endpoint_info['sample_requests'].append(sample_request)
        
        if len(endpoint_info['sample_responses']) < 3:
            try:
                response_body = flow.response.content.decode('utf-8', errors='ignore')
                sample_response = {
                    'status_code': flow.response.status_code,
                    'headers': dict(flow.response.headers),
                    'body': response_body,
                    'is_json': 'application/json' in flow.response.headers.get('content-type', '')
                }
                endpoint_info['sample_responses'].append(sample_response)
            except Exception as e:
                self.logger.debug(f"Could not decode response body: {e}")
    
    def _process_url_match(self, url_match: str) -> None:
        """Process a URL match from regex extraction."""
        if 'api.meijer.com' not in url_match:
            return
        
        # Clean up the URL
        if url_match.startswith('http'):
            parsed = urlparse(url_match)
            path = parsed.path
        else:
            # Extract path from partial match
            path_match = re.search(r'api\.meijer\.com([^\s"\']*)', url_match)
            if path_match:
                path = path_match.group(1)
            else:
                return
        
        if not path:
            path = '/'
        
        # Update endpoint info
        self.unique_paths.add(path)
        self.endpoints[path]['usage_count'] += 1
    
    def categorize_endpoints(self) -> Dict[str, List[str]]:
        """Categorize endpoints by functionality."""
        categories = {
            'Authentication': [],
            'Cart & Shopping': [],
            'Products & Search': [],
            'mPerks & Loyalty': [],
            'Stores & Locations': [],
            'Fulfillment': [],
            'User Profile': [],
            'Other': []
        }
        
        for path in self.unique_paths:
            path_lower = path.lower()
            
            if any(x in path_lower for x in ['/auth', '/oauth', '/login', '/token']):
                categories['Authentication'].append(path)
            elif any(x in path_lower for x in ['/cart', '/basket', '/shopping', '/checkout']):
                categories['Cart & Shopping'].append(path)
            elif any(x in path_lower for x in ['/product', '/search', '/upc', '/barcode']):
                categories['Products & Search'].append(path)
            elif any(x in path_lower for x in ['/mperks', '/loyalty', '/rewards', '/points']):
                categories['mPerks & Loyalty'].append(path)
            elif any(x in path_lower for x in ['/store', '/location', '/fulfillment']):
                categories['Stores & Locations'].append(path)
            elif any(x in path_lower for x in ['/fulfillment', '/reservation', '/pickup', '/delivery']):
                categories['Fulfillment'].append(path)
            elif any(x in path_lower for x in ['/user', '/profile', '/customer', '/account']):
                categories['User Profile'].append(path)
            else:
                categories['Other'].append(path)
        
        return categories
    
    def generate_flask_routes(self) -> str:
        """Generate Flask route definitions for the extracted endpoints."""
        routes = []
        
        for path, info in self.endpoints.items():
            if not path or path == '/':
                continue
            
            # Determine supported methods
            methods = list(info['methods']) if info['methods'] else ['GET']
            if not methods:
                methods = ['GET']
            
            # Generate route decorator
            methods_str = ', '.join(f"'{m}'" for m in methods)
            route_path = f"/api/meijer{path}"
            
            # Generate function name
            func_name = self._generate_function_name(path)
            
            # Generate route code
            route_code = f"""@app.route('{route_path}', methods=[{methods_str}])
@limiter.limit("100 per minute")
def {func_name}():
    \"\"\"
    {path} endpoint.
    
    Methods: {', '.join(methods)}
    Usage count: {info['usage_count']}
    \"\"\"
    method = request.method
    params = dict(request.args)
    headers = dict(request.headers)
    
    # Remove Flask-specific headers
    for header in ['Host', 'Content-Length', 'Content-Type']:
        headers.pop(header, None)
    
    # Get request body for POST/PUT requests
    data = None
    if method in ['POST', 'PUT'] and request.is_json:
        data = request.get_json()
    
    # Generate cache key
    cache_key = get_cache_key('{path}', params)
    
    # Check cache for GET requests
    if method == 'GET':
        cached = get_cached_response(cache_key)
        if cached:
            logger.info(f"Serving cached response for {path}")
            return jsonify(cached)
    
    # Forward request to Meijer API
    logger.info(f"Forwarding {{method}} request to {path}")
    response_data = forward_request_to_meijer('{path}', method, params, headers, data)
    
    # Cache successful GET responses
    if method == 'GET' and 'error' not in response_data:
        cache_response(cache_key, response_data, ttl=300)  # Cache for 5 minutes
    
    return jsonify(response_data)

"""
            routes.append(route_code)
        
        return '\n'.join(routes)
    
    def _generate_function_name(self, path: str) -> str:
        """Generate a valid Python function name from the path."""
        # Remove leading slash and replace slashes with underscores
        clean_path = path.lstrip('/').replace('/', '_')
        
        # Replace hyphens and other special chars with underscores
        clean_path = re.sub(r'[^a-zA-Z0-9_]', '_', clean_path)
        
        # Remove multiple underscores and trailing underscores
        clean_path = re.sub(r'_+', '_', clean_path).rstrip('_')
        
        # Ensure it starts with a letter
        if clean_path and not clean_path[0].isalpha():
            clean_path = 'endpoint_' + clean_path
        
        # Limit length
        if len(clean_path) > 50:
            clean_path = clean_path[:50]
        
        return clean_path
    
    def generate_report(self) -> Dict[str, Any]:
        """Generate a comprehensive report of extracted endpoints."""
        categories = self.categorize_endpoints()
        
        report = {
            'extraction_timestamp': datetime.now().isoformat(),
            'log_file': str(self.log_file_path),
            'total_endpoints': len(self.unique_paths),
            'total_methods': len(self.unique_methods),
            'total_status_codes': len(self.unique_status_codes),
            'categories': categories,
            'endpoints': dict(self.endpoints),
            'flask_routes': self.generate_flask_routes()
        }
        
        return report
    
    def save_report(self, output_file: str) -> None:
        """Save the extraction report to a file."""
        report = self.generate_report()
        
        with open(output_file, 'w') as f:
            json.dump(report, f, indent=2, default=str)
        
        self.logger.info(f"Report saved to: {output_file}")
    
    def save_flask_routes(self, output_file: str) -> None:
        """Save just the Flask routes to a file."""
        routes = self.generate_flask_routes()
        
        with open(output_file, 'w') as f:
            f.write("# Generated Flask routes for api.meijer.com endpoints\n")
            f.write(f"# Generated from: {self.log_file_path}\n")
            f.write(f"# Generated at: {datetime.now().isoformat()}\n\n")
            f.write(routes)
        
        self.logger.info(f"Flask routes saved to: {output_file}")


def main():
    """Main function to run the endpoint extractor."""
    if len(sys.argv) < 2:
        print("Usage: python extract_api_meijer_endpoints.py <log_file> [output_dir]")
        sys.exit(1)
    
    log_file = sys.argv[1]
    output_dir = sys.argv[2] if len(sys.argv) > 2 else "."
    
    # Create output directory if it doesn't exist
    Path(output_dir).mkdir(parents=True, exist_ok=True)
    
    # Initialize extractor
    extractor = ApiMeijerEndpointExtractor(log_file)
    
    # Extract endpoints
    if extractor.extract_endpoints():
        # Generate timestamp for output files
        timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
        
        # Save comprehensive report
        report_file = Path(output_dir) / f"api_meijer_endpoints_{timestamp}.json"
        extractor.save_report(str(report_file))
        
        # Save Flask routes
        routes_file = Path(output_dir) / f"flask_routes_{timestamp}.py"
        extractor.save_flask_routes(str(routes_file))
        
        # Print summary
        print(f"\n✅ Extraction completed successfully!")
        print(f"📊 Total endpoints found: {len(extractor.unique_paths)}")
        print(f"📁 Report saved to: {report_file}")
        print(f"🐍 Flask routes saved to: {routes_file}")
        
        # Print categories
        categories = extractor.categorize_endpoints()
        print(f"\n📂 Endpoint Categories:")
        for category, endpoints in categories.items():
            if endpoints:
                print(f"  {category}: {len(endpoints)} endpoints")
        
    else:
        print("❌ Extraction failed!")
        sys.exit(1)


if __name__ == "__main__":
    main()
