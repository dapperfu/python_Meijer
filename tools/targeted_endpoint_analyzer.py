#!/usr/bin/env python3
"""
Targeted Endpoint Analyzer

This tool analyzes the latest log file for specific API endpoints:
- digital/tax/v1
- oms/v2/address-qualification
"""

import json
import os
import re
from collections import defaultdict
from datetime import datetime
from typing import Dict, List, Any, Optional
from urllib.parse import urlparse, parse_qs

from mitmproxy import io
from mitmproxy.http import HTTPFlow


class TargetedEndpointAnalyzer:
    """Analyzer for specific API endpoints."""
    
    def __init__(self):
        self.target_endpoints = {
            'digital/tax/v1': {
                'endpoints': [],
                'methods': set(),
                'hosts': set(),
                'sample_requests': [],
                'sample_responses': []
            },
            'oms/v2/address-qualification': {
                'endpoints': [],
                'methods': set(),
                'hosts': set(),
                'sample_requests': [],
                'sample_responses': []
            }
        }
        
        self.related_endpoints = defaultdict(lambda: {
            'count': 0,
            'methods': set(),
            'hosts': set(),
            'sample_urls': set(),
            'request_bodies': [],
            'response_bodies': []
        })
        
    def analyze_log_file(self, log_file_path: str) -> Dict[str, Any]:
        """Analyze a single mitmproxy log file for target endpoints."""
        print(f"🔍 Analyzing for target endpoints: {log_file_path}")
        
        if not os.path.exists(log_file_path):
            print(f"  ❌ File not found: {log_file_path}")
            return {}
        
        try:
            with open(log_file_path, 'rb') as f:
                flows = io.FlowReader(f).stream()
                
                for flow in flows:
                    if isinstance(flow, HTTPFlow):
                        self._analyze_flow_for_targets(flow, log_file_path)
                        
        except Exception as e:
            print(f"  ❌ Error reading {log_file_path}: {e}")
            return {}
        
        print(f"  ✅ Completed target endpoint analysis of {log_file_path}")
        return {}
    
    def _analyze_flow_for_targets(self, flow: HTTPFlow, source_file: str):
        """Analyze a single HTTP flow for target endpoints."""
        try:
            # Extract basic request info
            url = flow.request.pretty_url
            method = flow.request.method
            host = flow.request.pretty_host
            path = flow.request.path
            status_code = flow.response.status_code if flow.response else None
            
            # Check if this is one of our target endpoints
            if self._is_target_endpoint(path):
                self._process_target_endpoint(flow, method, path, host, url, source_file)
            
            # Check for related endpoints (tax, address, oms, etc.)
            if self._is_related_endpoint(path):
                self._process_related_endpoint(flow, method, path, host, url, source_file)
            
        except Exception as e:
            print(f"  ⚠️ Error analyzing target flow: {e}")
    
    def _is_target_endpoint(self, path: str) -> bool:
        """Check if path contains target endpoints."""
        target_patterns = [
            r'/digital/tax/v1',
            r'/oms/v2/address-qualification'
        ]
        
        for pattern in target_patterns:
            if re.search(pattern, path, re.IGNORECASE):
                return True
        return False
    
    def _is_related_endpoint(self, path: str) -> bool:
        """Check if path is related to our targets."""
        related_patterns = [
            r'/tax',
            r'/address',
            r'/oms',
            r'/digital',
            r'/qualification',
            r'/shipping',
            r'/delivery',
            r'/location',
            r'/geocode',
            r'/zipcode',
            r'/postal'
        ]
        
        for pattern in related_patterns:
            if re.search(pattern, path, re.IGNORECASE):
                return True
        return False
    
    def _process_target_endpoint(self, flow: HTTPFlow, method: str, path: str, host: str, url: str, source_file: str):
        """Process a target endpoint flow."""
        # Determine which target this is
        if '/digital/tax/v1' in path:
            target_key = 'digital/tax/v1'
        elif '/oms/v2/address-qualification' in path:
            target_key = 'oms/v2/address-qualification'
        else:
            return
        
        # Extract request/response data
        request_body = self._extract_request_body(flow)
        response_body = self._extract_response_body(flow)
        
        # Store endpoint information
        endpoint_info = {
            'method': method,
            'path': path,
            'host': host,
            'url': url,
            'status_code': status_code if flow.response else None,
            'request_body': request_body,
            'response_body': response_body,
            'headers': dict(flow.request.headers),
            'query_params': self._extract_query_params(url),
            'source_file': source_file,
            'timestamp': datetime.now().isoformat()
        }
        
        self.target_endpoints[target_key]['endpoints'].append(endpoint_info)
        self.target_endpoints[target_key]['methods'].add(method)
        self.target_endpoints[target_key]['hosts'].add(host)
        
        # Store sample request/response
        if request_body and len(self.target_endpoints[target_key]['sample_requests']) < 3:
            self.target_endpoints[target_key]['sample_requests'].append(request_body)
        
        if response_body and len(self.target_endpoints[target_key]['sample_responses']) < 3:
            self.target_endpoints[target_key]['sample_responses'].append(response_body)
    
    def _process_related_endpoint(self, flow: HTTPFlow, method: str, path: str, host: str, url: str, source_file: str):
        """Process a related endpoint flow."""
        # Extract request/response data
        request_body = self._extract_request_body(flow)
        response_body = self._extract_response_body(flow)
        
        # Store related endpoint information
        self.related_endpoints[path]['count'] += 1
        self.related_endpoints[path]['methods'].add(method)
        self.related_endpoints[path]['hosts'].add(host)
        self.related_endpoints[path]['sample_urls'].add(url)
        
        if request_body and len(self.related_endpoints[path]['request_bodies']) < 2:
            self.related_endpoints[path]['request_bodies'].append(request_body)
        
        if response_body and len(self.related_endpoints[path]['response_bodies']) < 2:
            self.related_endpoints[path]['response_bodies'].append(response_body)
    
    def _extract_request_body(self, flow: HTTPFlow) -> Optional[Any]:
        """Extract request body from flow."""
        if not flow.request.content:
            return None
        
        try:
            content_type = flow.request.headers.get('content-type', '')
            if 'json' in content_type:
                return json.loads(flow.request.content.decode('utf-8'))
            else:
                return flow.request.content.decode('utf-8', errors='ignore')
        except:
            return str(flow.request.content)
    
    def _extract_response_body(self, flow: HTTPFlow) -> Optional[Any]:
        """Extract response body from flow."""
        if not flow.response or not flow.response.content:
            return None
        
        try:
            content_type = flow.response.headers.get('content-type', '')
            if 'json' in content_type:
                return json.loads(flow.response.content.decode('utf-8'))
            else:
                return flow.response.content.decode('utf-8', errors='ignore')
        except:
            return str(flow.response.content)
    
    def _extract_query_params(self, url: str) -> Dict[str, List[str]]:
        """Extract query parameters from URL."""
        try:
            parsed = urlparse(url)
            return parse_qs(parsed.query)
        except:
            return {}
    
    def generate_target_report(self) -> Dict[str, Any]:
        """Generate report for target endpoints."""
        report = {
            'analysis_timestamp': datetime.now().isoformat(),
            'target_endpoints': {},
            'related_endpoints': {},
            'summary': {
                'digital_tax_v1_found': len(self.target_endpoints['digital/tax/v1']['endpoints']),
                'oms_address_qualification_found': len(self.target_endpoints['oms/v2/address-qualification']['endpoints']),
                'total_related_endpoints': len(self.related_endpoints)
            },
            'implementation_recommendations': []
        }
        
        # Process target endpoints
        for target_key, data in self.target_endpoints.items():
            report['target_endpoints'][target_key] = {
                'endpoints': data['endpoints'],
                'methods': list(data['methods']),
                'hosts': list(data['hosts']),
                'sample_requests': data['sample_requests'],
                'sample_responses': data['sample_responses']
            }
        
        # Process related endpoints
        for path, data in self.related_endpoints.items():
            report['related_endpoints'][path] = {
                'count': data['count'],
                'methods': list(data['methods']),
                'hosts': list(data['hosts']),
                'sample_urls': list(data['sample_urls']),
                'request_bodies': data['request_bodies'],
                'response_bodies': data['response_bodies']
            }
        
        # Generate implementation recommendations
        report['implementation_recommendations'] = self._generate_recommendations()
        
        return report
    
    def _generate_recommendations(self) -> List[str]:
        """Generate implementation recommendations."""
        recommendations = []
        
        # Digital Tax API recommendations
        if self.target_endpoints['digital/tax/v1']['endpoints']:
            recommendations.append("Implement digital/tax/v1 API client for tax calculations")
            recommendations.append("Add tax calculation methods based on discovered endpoints")
        
        # OMS Address Qualification recommendations
        if self.target_endpoints['oms/v2/address-qualification']['endpoints']:
            recommendations.append("Implement oms/v2/address-qualification API client for shipping validation")
            recommendations.append("Add address validation and qualification methods")
        
        # Related endpoints recommendations
        if self.related_endpoints:
            recommendations.append(f"Found {len(self.related_endpoints)} related endpoints - consider implementing tax and address services")
        
        # General recommendations
        if any(self.target_endpoints.values()):
            recommendations.append("Create dedicated modules for tax and address qualification services")
            recommendations.append("Integrate with existing Meijer client for seamless API access")
        
        return recommendations
    
    def save_target_report(self, report: Dict[str, Any], output_file: str):
        """Save the target endpoint report to a file."""
        try:
            with open(output_file, 'w') as f:
                json.dump(report, f, indent=2, default=str)
            print(f"✅ Target endpoint report saved to: {output_file}")
        except Exception as e:
            print(f"❌ Error saving target report: {e}")


def main():
    """Main function to analyze latest log file for target endpoints."""
    print("🎯 Targeted Endpoint Analyzer")
    print("=" * 40)
    print("Searching for: digital/tax/v1 and oms/v2/address-qualification")
    print("")
    
    # Find the latest log file
    import glob
    log_files = glob.glob("meijer_mitm_*.log")
    if not log_files:
        print("❌ No log files found. Run 'make log' first to capture traffic.")
        return
    
    # Sort by modification time and get the latest
    latest_log = max(log_files, key=os.path.getmtime)
    print(f"📁 Using latest log file: {latest_log}")
    
    # Initialize analyzer
    analyzer = TargetedEndpointAnalyzer()
    
    # Analyze the latest log file
    print("\n🚀 Starting targeted endpoint analysis...")
    analyzer.analyze_log_file(latest_log)
    
    # Generate comprehensive report
    print("\n📊 Generating targeted endpoint report...")
    report = analyzer.generate_target_report()
    
    # Display summary
    print("\n📈 Target Endpoint Analysis Summary:")
    print(f"  Digital Tax v1 endpoints: {report['summary']['digital_tax_v1_found']}")
    print(f"  OMS Address Qualification endpoints: {report['summary']['oms_address_qualification_found']}")
    print(f"  Related endpoints: {report['summary']['total_related_endpoints']}")
    
    # Display target endpoints found
    print("\n🎯 Target Endpoints Found:")
    for target_key, data in report['target_endpoints'].items():
        if data['endpoints']:
            print(f"  ✅ {target_key}: {len(data['endpoints'])} endpoints")
            print(f"     Methods: {', '.join(data['methods'])}")
            print(f"     Hosts: {', '.join(data['hosts'])}")
        else:
            print(f"  ❌ {target_key}: No endpoints found")
    
    # Display related endpoints
    if report['related_endpoints']:
        print("\n🔗 Related Endpoints Found:")
        for path, data in list(report['related_endpoints'].items())[:10]:  # Show first 10
            print(f"  {path}: {data['count']} requests")
    
    # Save detailed report
    output_file = "targeted_endpoints_report.json"
    analyzer.save_target_report(report, output_file)
    
    # Display recommendations
    print("\n💡 Implementation Recommendations:")
    for recommendation in report['implementation_recommendations']:
        print(f"  • {recommendation}")
    
    print("\n✅ Targeted endpoint analysis complete!")
    print(f"📄 Detailed report saved to: {output_file}")


if __name__ == "__main__":
    main() 