#!/usr/bin/env python3
"""
Update Flask API server with latest api.meijer.com endpoints.

This tool takes extracted endpoint data and updates the meijer-api-flask
server with the latest endpoints, maintaining existing functionality
while adding new discovered endpoints.
"""

import json
import logging
import os
import re
import sys
from datetime import datetime
from pathlib import Path
from typing import Any, Dict, List, Optional, Set
from urllib.parse import urlparse


class FlaskApiServerUpdater:
    """Updates the Flask API server with latest endpoints."""
    
    def __init__(self, flask_app_path: str, endpoints_data_path: str):
        self.flask_app_path = Path(flask_app_path)
        self.endpoints_data_path = Path(endpoints_data_path)
        self.logger = self._setup_logging()
        
        # Load existing Flask app
        self.existing_app_content = ""
        self.existing_routes = set()
        self.existing_functions = set()
        
        # Load endpoints data
        self.endpoints_data = {}
        self.new_endpoints = set()
        
    def _setup_logging(self) -> logging.Logger:
        """Setup logging configuration."""
        logging.basicConfig(
            level=logging.INFO,
            format='%(asctime)s - %(levelname)s - %(message)s'
        )
        return logging.getLogger(__name__)
    
    def load_existing_app(self) -> bool:
        """Load and parse the existing Flask app.py file."""
        if not self.flask_app_path.exists():
            self.logger.error(f"Flask app file not found: {self.flask_app_path}")
            return False
        
        try:
            with open(self.flask_app_path, 'r') as f:
                self.existing_app_content = f.read()
            
            # Extract existing routes
            self._extract_existing_routes()
            
            self.logger.info(f"Loaded existing Flask app with {len(self.existing_routes)} routes")
            return True
            
        except Exception as e:
            self.logger.error(f"Error loading Flask app: {e}")
            return False
    
    def _extract_existing_routes(self) -> None:
        """Extract existing routes and function names from the Flask app."""
        # Find route decorators
        route_pattern = r"@app\.route\('([^']+)'"
        routes = re.findall(route_pattern, self.existing_app_content)
        self.existing_routes = set(routes)
        
        # Find function definitions
        func_pattern = r"def\s+([a-zA-Z_][a-zA-Z0-9_]*)\s*\("
        functions = re.findall(func_pattern, self.existing_app_content)
        self.existing_functions = set(functions)
        
        self.logger.info(f"Found {len(self.existing_routes)} existing routes and {len(self.existing_functions)} functions")
    
    def load_endpoints_data(self) -> bool:
        """Load the extracted endpoints data."""
        if not self.endpoints_data_path.exists():
            self.logger.error(f"Endpoints data file not found: {self.endpoints_data_path}")
            return False
        
        try:
            with open(self.endpoints_data_path, 'r') as f:
                self.endpoints_data = json.load(f)
            
            # Extract new endpoints
            if 'endpoints' in self.endpoints_data:
                for path in self.endpoints_data['endpoints'].keys():
                    if path and path != '/':
                        # Convert to Flask route format
                        flask_route = f"/api/meijer{path}"
                        if flask_route not in self.existing_routes:
                            self.new_endpoints.add(path)
            
            self.logger.info(f"Loaded {len(self.endpoints_data.get('endpoints', {}))} endpoints, {len(self.new_endpoints)} are new")
            return True
            
        except Exception as e:
            self.logger.error(f"Error loading endpoints data: {e}")
            return False
    
    def generate_new_routes(self) -> str:
        """Generate Flask route code for new endpoints."""
        if not self.new_endpoints:
            return ""
        
        routes = []
        
        for path in sorted(self.new_endpoints):
            endpoint_info = self.endpoints_data['endpoints'].get(path, {})
            
            # Determine supported methods
            methods = list(endpoint_info.get('methods', set())) if endpoint_info.get('methods') else ['GET']
            if not methods:
                methods = ['GET']
            
            # Generate route decorator
            methods_str = ', '.join(f"'{m}'" for m in methods)
            route_path = f"/api/meijer{path}"
            
            # Generate function name
            func_name = self._generate_function_name(path)
            
            # Ensure unique function name
            original_func_name = func_name
            counter = 1
            while func_name in self.existing_functions:
                func_name = f"{original_func_name}_{counter}"
                counter += 1
            
            # Generate route code
            route_code = f"""@app.route('{route_path}', methods=[{methods_str}])
@limiter.limit("100 per minute")
def {func_name}():
    \"\"\"
    {path} endpoint.
    
    Methods: {', '.join(methods)}
    Usage count: {endpoint_info.get('usage_count', 0)}
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
    
    def update_flask_app(self) -> str:
        """Update the Flask app with new endpoints."""
        if not self.new_endpoints:
            return self.existing_app_content
        
        # Find the insertion point (before the main block)
        main_pattern = r"if __name__ == '__main__':"
        main_match = re.search(main_pattern, self.existing_app_content)
        
        if not main_match:
            self.logger.warning("Could not find main block, appending routes at end")
            # Append at the end
            new_content = self.existing_app_content + "\n\n" + self.generate_new_routes()
        else:
            # Insert before main block
            main_start = main_match.start()
            before_main = self.existing_app_content[:main_start]
            after_main = self.existing_app_content[main_start:]
            
            # Add new routes before main
            new_routes = self.generate_new_routes()
            new_content = before_main + "\n\n# Auto-generated routes from endpoint extraction\n" + new_routes + "\n" + after_main
        
        return new_content
    
    def save_updated_app(self, output_path: str) -> None:
        """Save the updated Flask app to a file."""
        updated_content = self.update_flask_app()
        
        with open(output_path, 'w') as f:
            f.write(updated_content)
        
        self.logger.info(f"Updated Flask app saved to: {output_path}")
    
    def generate_update_report(self) -> Dict[str, Any]:
        """Generate a report of the update operation."""
        return {
            'update_timestamp': datetime.now().isoformat(),
            'original_app': str(self.flask_app_path),
            'endpoints_data': str(self.endpoints_data_path),
            'total_existing_routes': len(self.existing_routes),
            'total_existing_functions': len(self.existing_functions),
            'total_endpoints_found': len(self.endpoints_data.get('endpoints', {})),
            'new_endpoints_added': len(self.new_endpoints),
            'new_endpoints': list(sorted(self.new_endpoints)),
            'categories': self.endpoints_data.get('categories', {})
        }
    
    def save_update_report(self, output_file: str) -> None:
        """Save the update report to a file."""
        report = self.generate_update_report()
        
        with open(output_file, 'w') as f:
            json.dump(report, f, indent=2, default=str)
        
        self.logger.info(f"Update report saved to: {output_file}")


def main():
    """Main function to run the Flask API server updater."""
    if len(sys.argv) < 3:
        print("Usage: python update_flask_api_server.py <flask_app.py> <endpoints_data.json> [output_dir]")
        sys.exit(1)
    
    flask_app = sys.argv[1]
    endpoints_data = sys.argv[2]
    output_dir = sys.argv[3] if len(sys.argv) > 3 else "."
    
    # Create output directory if it doesn't exist
    Path(output_dir).mkdir(parents=True, exist_ok=True)
    
    # Initialize updater
    updater = FlaskApiServerUpdater(flask_app, endpoints_data)
    
    # Load existing app
    if not updater.load_existing_app():
        print("❌ Failed to load existing Flask app!")
        sys.exit(1)
    
    # Load endpoints data
    if not updater.load_endpoints_data():
        print("❌ Failed to load endpoints data!")
        sys.exit(1)
    
    # Check if there are new endpoints
    if not updater.new_endpoints:
        print("✅ No new endpoints to add - Flask app is already up to date!")
        return
    
    # Generate timestamp for output files
    timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
    
    # Save updated Flask app
    updated_app_file = Path(output_dir) / f"app_updated_{timestamp}.py"
    updater.save_updated_app(str(updated_app_file))
    
    # Save update report
    report_file = Path(output_dir) / f"flask_update_report_{timestamp}.json"
    updater.save_update_report(str(report_file))
    
    # Print summary
    print(f"\n✅ Flask API server updated successfully!")
    print(f"📊 New endpoints added: {len(updater.new_endpoints)}")
    print(f"🐍 Updated app saved to: {updated_app_file}")
    print(f"📁 Update report saved to: {report_file}")
    
    # Print new endpoints
    print(f"\n🆕 New Endpoints Added:")
    for endpoint in sorted(updater.new_endpoints):
        endpoint_info = updater.endpoints_data['endpoints'].get(endpoint, {})
        methods = list(endpoint_info.get('methods', set())) if endpoint_info.get('methods') else ['GET']
        print(f"  {endpoint} ({', '.join(methods)})")
    
    # Print categories
    categories = updater.endpoints_data.get('categories', {})
    print(f"\n📂 Endpoint Categories:")
    for category, endpoints in categories.items():
        if endpoints:
            print(f"  {category}: {len(endpoints)} endpoints")


if __name__ == "__main__":
    main()
