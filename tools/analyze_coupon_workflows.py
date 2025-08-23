#!/usr/bin/env python3
"""
Coupon Workflow Analyzer for Meijer mitmproxy logs

This script analyzes mitmproxy log files to extract coupon-related interactions,
including ClippedOffers, ads, and other coupon endpoints.
"""

import json
import re
from collections import defaultdict, Counter
from typing import Dict, List, Any, Optional
from urllib.parse import urlparse, parse_qs
import mitmproxy.ctx
from mitmproxy import http


class CouponWorkflowAnalyzer:
    """Analyzes coupon workflows in Meijer API interactions."""
    
    def __init__(self):
        self.coupon_endpoints = defaultdict(list)
        self.clipped_offers = []
        self.ads_data = []
        self.category_counts = defaultdict(int)
        self.reward_coupons = []
        self.total_interactions = 0
        self.coupon_patterns = [
            r'ClippedOffers',
            r'ads',
            r'coupons',
            r'rewards',
            r'offers',
            r'promotions'
        ]
        
    def request(self, flow: http.HTTPFlow) -> None:
        """Process each HTTP request to identify coupon-related endpoints."""
        url = flow.request.pretty_url
        method = flow.request.method
        
        # Check if this is a coupon-related endpoint
        if any(re.search(pattern, url, re.IGNORECASE) for pattern in self.coupon_patterns):
            self.total_interactions += 1
            
            parsed_url = urlparse(url)
            endpoint = parsed_url.path
            
            # Extract query parameters
            query_params = parse_qs(parsed_url.query)
            
            # Store request details
            request_data = {
                'url': url,
                'method': method,
                'endpoint': endpoint,
                'query_params': query_params,
                'headers': dict(flow.request.headers),
                'timestamp': flow.request.timestamp_start
            }
            
            # Categorize by endpoint type
            if 'ClippedOffers' in endpoint:
                self.clipped_offers.append(request_data)
            elif 'ads' in endpoint.lower():
                self.ads_data.append(request_data)
            else:
                self.coupon_endpoints[endpoint].append(request_data)
    
    def response(self, flow: http.HTTPFlow) -> None:
        """Process responses to extract coupon data and categorize by department."""
        url = flow.request.pretty_url
        
        if any(re.search(pattern, url, re.IGNORECASE) for pattern in self.coupon_patterns):
            try:
                if flow.response and flow.response.content:
                    content_type = flow.response.headers.get('content-type', '')
                    
                    if 'application/json' in content_type:
                        try:
                            data = json.loads(flow.response.content.decode('utf-8'))
                            self._analyze_coupon_response(data, url)
                        except json.JSONDecodeError:
                            pass
            except Exception as e:
                mitmproxy.ctx.log.error(f"Error processing response: {e}")
    
    def _analyze_coupon_response(self, data: Any, url: str) -> None:
        """Analyze coupon response data to extract department and value information."""
        if isinstance(data, dict):
            # Look for department information
            department = self._extract_department(data)
            if department:
                self.category_counts[department] += 1
            
            # Look for reward/coupon information
            self._extract_reward_coupons(data, url)
    
    def _extract_department(self, data: Any) -> Optional[str]:
        """Extract department information from response data."""
        if isinstance(data, dict):
            # Common department fields
            dept_fields = ['department', 'category', 'dept', 'categoryName', 'departmentName']
            
            for field in dept_fields:
                if field in data and data[field]:
                    return str(data[field])
            
            # Look deeper in nested structures
            for key, value in data.items():
                if isinstance(value, dict):
                    dept = self._extract_department(value)
                    if dept:
                        return dept
                elif isinstance(value, list):
                    for item in value:
                        if isinstance(item, dict):
                            dept = self._extract_department(item)
                            if dept:
                                return dept
        
        return None
    
    def _extract_reward_coupons(self, data: Any, url: str) -> None:
        """Extract reward and coupon information from response data."""
        if isinstance(data, dict):
            # Look for reward/coupon fields
            reward_fields = ['rewards', 'coupons', 'offers', 'clippedOffers', 'ads']
            
            for field in reward_fields:
                if field in data and isinstance(data[field], list):
                    for item in data[field]:
                        if isinstance(item, dict):
                            reward_info = {
                                'url': url,
                                'data': item,
                                'field': field
                            }
                            self.reward_coupons.append(reward_info)
            
            # Look deeper in nested structures
            for key, value in data.items():
                if isinstance(value, dict):
                    self._extract_reward_coupons(value, url)
                elif isinstance(value, list):
                    for item in value:
                        if isinstance(item, dict):
                            self._extract_reward_coupons(item, url)
    
    def done(self) -> None:
        """Called when all flows have been processed."""
        self._generate_summary_report()
    
    def _generate_summary_report(self) -> None:
        """Generate a comprehensive summary report."""
        print("\n" + "="*80)
        print("COUPON WORKFLOW ANALYSIS SUMMARY")
        print("="*80)
        
        print(f"\nTotal Coupon-Related Interactions: {self.total_interactions}")
        
        print(f"\nClippedOffers Endpoint Calls: {len(self.clipped_offers)}")
        print(f"Ads Endpoint Calls: {len(self.ads_data)}")
        
        print(f"\nOther Coupon Endpoints:")
        for endpoint, calls in self.coupon_endpoints.items():
            print(f"  {endpoint}: {len(calls)} calls")
        
        print(f"\nDepartment/Category Breakdown:")
        for dept, count in sorted(self.category_counts.items()):
            print(f"  {dept}: {count}")
        
        print(f"\nTotal Reward/Coupon Items Found: {len(self.reward_coupons)}")
        
        # Look for specific items mentioned
        cottonelle_items = []
        for reward in self.reward_coupons:
            reward_data = reward['data']
            if isinstance(reward_data, dict):
                # Look for product names, descriptions, etc.
                text_fields = ['name', 'title', 'description', 'productName', 'itemName']
                for field in text_fields:
                    if field in reward_data and reward_data[field]:
                        text = str(reward_data[field]).lower()
                        if 'cottonelle' in text:
                            cottonelle_items.append(reward_data)
                            break
        
        if cottonelle_items:
            print(f"\nCottonelle Items Found: {len(cottonelle_items)}")
            for item in cottonelle_items:
                print(f"  - {item}")
        
        # Save detailed analysis to file
        self._save_detailed_analysis()
    
    def _save_detailed_analysis(self) -> None:
        """Save detailed analysis to JSON file."""
        analysis_data = {
            'summary': {
                'total_interactions': self.total_interactions,
                'clipped_offers_count': len(self.clipped_offers),
                'ads_count': len(self.ads_data),
                'total_reward_coupons': len(self.reward_coupons),
                'department_counts': dict(self.category_counts)
            },
            'clipped_offers': self.clipped_offers,
            'ads_data': self.ads_data,
            'coupon_endpoints': dict(self.coupon_endpoints),
            'reward_coupons': self.reward_coupons
        }
        
        output_file = 'coupon_workflow_analysis.json'
        with open(output_file, 'w') as f:
            json.dump(analysis_data, f, indent=2, default=str)
        
        print(f"\nDetailed analysis saved to: {output_file}")


# Create analyzer instance
analyzer = CouponWorkflowAnalyzer()

# Hook functions for mitmproxy
def request(flow: http.HTTPFlow) -> None:
    analyzer.request(flow)

def response(flow: http.HTTPFlow) -> None:
    analyzer.response(flow)

def done() -> None:
    analyzer.done()
