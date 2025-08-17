#!/usr/bin/env python3
"""
Analyze Meijer mitmproxy log file using proper mitmproxy tooling.

This script loads the log file and analyzes each request/response as
proper objects instead of parsing text with strings.
"""

import json
import logging
from pathlib import Path
from typing import Dict, List, Any, Optional
from collections import defaultdict, Counter

# Import mitmproxy modules
try:
    from mitmproxy import flow
    from mitmproxy import http
    from mitmproxy.io import FlowReader
except ImportError as e:
    print(f"Error importing mitmproxy modules: {e}")
    print("Make sure you're in the virtual environment: source venv/bin/activate")
    exit(1)


class MeijerLogAnalyzer:
    """
    Analyzes Meijer mitmproxy log files using proper mitmproxy tooling.
    
    This gives us access to structured request/response objects instead
    of parsing text with strings.
    """
    
    def __init__(self, log_file_path: str):
        self.log_file_path = Path(log_file_path)
        self.flows = []
        self.analysis_results = {
            'total_flows': 0,
            'meijer_flows': 0,
            'oauth_flows': 0,
            'api_endpoints': defaultdict(int),
            'http_methods': Counter(),
            'status_codes': Counter(),
            'content_types': Counter(),
            'headers': defaultdict(Counter),
            'authentication_flows': [],
            'api_calls': [],
            'errors': []
        }
        
        # Setup logging
        logging.basicConfig(level=logging.INFO)
        self.logger = logging.getLogger(__name__)
    
    def load_flows(self) -> bool:
        """Load flows from the mitmproxy log file."""
        try:
            if not self.log_file_path.exists():
                self.logger.error(f"Log file not found: {self.log_file_path}")
                return False
            
            self.logger.info(f"Loading flows from: {self.log_file_path}")
            
            with open(self.log_file_path, 'rb') as f:
                reader = FlowReader(f)
                
                flow_count = 0
                for flow_obj in reader.stream():
                    self.flows.append(flow_obj)
                    flow_count += 1
                    
                    if flow_count % 1000 == 0:
                        self.logger.info(f"Loaded {flow_count} flows...")
                
                self.logger.info(f"Successfully loaded {len(self.flows)} flows")
                return True
                
        except Exception as e:
            self.logger.error(f"Error loading flows: {e}")
            return False
    
    def analyze_flows(self) -> None:
        """Analyze all loaded flows."""
        self.logger.info("Starting flow analysis...")
        
        for i, flow_obj in enumerate(self.flows):
            try:
                self._analyze_single_flow(flow_obj, i)
                
                if (i + 1) % 1000 == 0:
                    self.logger.info(f"Analyzed {i + 1}/{len(self.flows)} flows...")
                    
            except Exception as e:
                self.logger.error(f"Error analyzing flow {i}: {e}")
                self.analysis_results['errors'].append({
                    'flow_index': i,
                    'error': str(e)
                })
        
        self.logger.info("Flow analysis completed")
    
    def _analyze_single_flow(self, flow_obj: flow.Flow, index: int) -> None:
        """Analyze a single flow object."""
        self.analysis_results['total_flows'] += 1
        
        # Check if this is an HTTP flow
        if not isinstance(flow_obj, http.HTTPFlow):
            return
        
        # Basic flow information
        request = flow_obj.request
        response = flow_obj.response
        
        # HTTP method
        if request.method:
            self.analysis_results['http_methods'][request.method] += 1
        
        # Status code
        if response and response.status_code:
            self.analysis_results['status_codes'][response.status_code] += 1
        
        # URL analysis
        if hasattr(request, 'pretty_url') and request.pretty_url:
            url_str = request.pretty_url
        elif hasattr(request, 'url') and request.url:
            url_str = request.url
        else:
            return
            
        # Check if this is a Meijer-related flow
        if self._is_meijer_flow(url_str):
            self.analysis_results['meijer_flows'] += 1
            self._analyze_meijer_flow(flow_obj, url_str)
        
        # Check if this is an OAuth flow
        if self._is_oauth_flow(url_str):
            self.analysis_results['oauth_flows'] += 1
            self._analyze_oauth_flow(flow_obj, url_str)
        
        # Track API endpoints
        endpoint = self._extract_endpoint(url_str)
        if endpoint:
            self.analysis_results['api_endpoints'][endpoint] += 1
        
        # Content type analysis
        if response and hasattr(response, 'headers') and response.headers:
            content_type = response.headers.get('content-type', '')
            if content_type:
                self.analysis_results['content_types'][content_type] += 1
        
        # Header analysis
        if hasattr(request, 'headers') and request.headers:
            for header_name, header_value in request.headers.items():
                self.analysis_results['headers'][header_name.lower()][header_value] += 1
    
    def _is_meijer_flow(self, url_str: str) -> bool:
        """Check if a URL is Meijer-related."""
        meijer_domains = [
            'meijer.com',
            'api.meijer.com',
            'id.meijer.com',
            'www.meijer.com'
        ]
        
        return any(domain in url_str.lower() for domain in meijer_domains)
    
    def _is_oauth_flow(self, url_str: str) -> bool:
        """Check if a URL is part of an OAuth flow."""
        oauth_indicators = [
            'oauth2',
            'authorize',
            'token',
            'callback',
            'login'
        ]
        
        return any(indicator in url_str.lower() for indicator in oauth_indicators)
    
    def _extract_endpoint(self, url_str: str) -> Optional[str]:
        """Extract the API endpoint from a URL."""
        try:
            # Simple path extraction
            if '/' in url_str:
                # Find the path part after the domain
                if '://' in url_str:
                    path_part = url_str.split('/', 3)
                    if len(path_part) > 3:
                        return '/' + path_part[3]
                    else:
                        return '/'
                else:
                    # Already a path
                    return url_str if url_str.startswith('/') else '/' + url_str
        except:
            pass
        return None
    
    def _analyze_meijer_flow(self, flow_obj: http.HTTPFlow, url_str: str) -> None:
        """Analyze a Meijer-specific flow."""
        request = flow_obj.request
        response = flow_obj.response
        
        flow_info = {
            'url': url_str,
            'method': request.method,
            'status_code': response.status_code if response else None,
            'request_headers': dict(request.headers) if hasattr(request, 'headers') else {},
            'response_headers': dict(response.headers) if response and hasattr(response, 'headers') else {},
            'request_body': self._extract_body(request),
            'response_body': self._extract_body(response) if response else None,
            'timestamp': getattr(flow_obj, 'timestamp_start', None)
        }
        
        self.analysis_results['api_calls'].append(flow_info)
    
    def _analyze_oauth_flow(self, flow_obj: http.HTTPFlow, url_str: str) -> None:
        """Analyze an OAuth flow."""
        request = flow_obj.request
        response = flow_obj.response
        
        oauth_info = {
            'url': url_str,
            'method': request.method,
            'status_code': response.status_code if response else None,
            'request_headers': dict(request.headers) if hasattr(request, 'headers') else {},
            'response_headers': dict(response.headers) if response and hasattr(response, 'headers') else {},
            'request_body': self._extract_body(request),
            'response_body': self._extract_body(response) if response else None,
            'timestamp': getattr(flow_obj, 'timestamp_start', None)
        }
        
        self.analysis_results['authentication_flows'].append(oauth_info)
    
    def _extract_body(self, http_obj) -> Optional[str]:
        """Extract and decode HTTP body content."""
        try:
            if hasattr(http_obj, 'content') and http_obj.content:
                # Try to decode as text
                try:
                    return http_obj.content.decode('utf-8')
                except UnicodeDecodeError:
                    # If it's binary, return hex representation
                    return http_obj.content.hex()[:200] + "..." if len(http_obj.content) > 200 else http_obj.content.hex()
        except:
            pass
        return None
    
    def generate_report(self) -> Dict[str, Any]:
        """Generate a comprehensive analysis report."""
        report = {
            'summary': {
                'total_flows': self.analysis_results['total_flows'],
                'meijer_flows': self.analysis_results['meijer_flows'],
                'oauth_flows': self.analysis_results['oauth_flows'],
                'unique_endpoints': len(self.analysis_results['api_endpoints']),
                'unique_headers': len(self.analysis_results['headers'])
            },
            'http_methods': dict(self.analysis_results['http_methods']),
            'status_codes': dict(self.analysis_results['status_codes']),
            'top_content_types': dict(self.analysis_results['content_types'].most_common(10)),
            'top_endpoints': dict(sorted(
                self.analysis_results['api_endpoints'].items(),
                key=lambda x: x[1],
                reverse=True
            )[:20]),
            'authentication_flows': self.analysis_results['authentication_flows'],
            'api_calls': self.analysis_results['api_calls'][:50],  # Limit to first 50
            'errors': self.analysis_results['errors']
        }
        
        return report
    
    def save_report(self, output_file: str = "meijer_analysis_report.json") -> None:
        """Save the analysis report to a JSON file."""
        try:
            report = self.generate_report()
            
            with open(output_file, 'w') as f:
                json.dump(report, f, indent=2, default=str)
            
            self.logger.info(f"Analysis report saved to: {output_file}")
            
        except Exception as e:
            self.logger.error(f"Error saving report: {e}")
    
    def print_summary(self) -> None:
        """Print a summary of the analysis."""
        report = self.generate_report()
        summary = report['summary']
        
        print("\n" + "="*80)
        print("🔍 MEIJER LOG ANALYSIS SUMMARY")
        print("="*80)
        
        print(f"📊 Total Flows Analyzed: {summary['total_flows']:,}")
        print(f"🏪 Meijer-Related Flows: {summary['meijer_flows']:,}")
        print(f"🔐 OAuth Flows: {summary['oauth_flows']:,}")
        print(f"🌐 Unique API Endpoints: {summary['unique_endpoints']:,}")
        print(f"📋 Unique Headers: {summary['unique_headers']:,}")
        
        print("\n📈 Top HTTP Methods:")
        for method, count in report['http_methods'].items():
            print(f"   {method}: {count:,}")
        
        print("\n🌐 Top API Endpoints:")
        for endpoint, count in list(report['top_endpoints'].items())[:10]:
            print(f"   {endpoint}: {count:,}")
        
        print("\n🔐 Authentication Flows Found:")
        for flow in report['authentication_flows'][:5]:  # Show first 5
            print(f"   {flow['method']} {flow['url']} -> {flow['status_code']}")
        
        if report['errors']:
            print(f"\n⚠️  Errors Encountered: {len(report['errors'])}")
        
        print("\n" + "="*80)


def main():
    """Main function to analyze the Meijer log file."""
    print("🚀 Meijer Log Analyzer using mitmproxy tooling")
    print("=" * 60)
    
    # Initialize analyzer
    analyzer = MeijerLogAnalyzer("outfile.log")
    
    # Load flows
    print("📂 Loading flows from log file...")
    if not analyzer.load_flows():
        print("❌ Failed to load flows. Exiting.")
        return
    
    # Analyze flows
    print("🔍 Analyzing flows...")
    analyzer.analyze_flows()
    
    # Generate and display report
    print("📊 Generating analysis report...")
    analyzer.print_summary()
    
    # Save detailed report
    print("💾 Saving detailed report...")
    analyzer.save_report()
    
    print("\n✅ Analysis completed successfully!")
    print("📄 Check 'meijer_analysis_report.json' for detailed results")


if __name__ == "__main__":
    main() 