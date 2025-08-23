#!/usr/bin/env python3
"""
Simple Coupon Workflow Analyzer for Meijer mitmproxy logs

This script directly parses log files to extract coupon-related interactions,
including ClippedOffers, ads, and other coupon endpoints.
"""

import json
import re
from collections import defaultdict, Counter
from pathlib import Path
from typing import Dict, List, Any, Optional


class SimpleCouponAnalyzer:
    """Simple analyzer for coupon workflows in Meijer API interactions."""
    
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
        
    def analyze_log_file(self, log_file_path: str) -> None:
        """Analyze a mitmproxy log file for coupon-related interactions."""
        print(f"Analyzing log file: {log_file_path}")
        
        try:
            with open(log_file_path, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
            
            # Split content into lines for easier processing
            lines = content.split('\n')
            
            for line_num, line in enumerate(lines):
                self._process_line(line, line_num)
                
        except Exception as e:
            print(f"Error reading log file: {e}")
            return
    
    def _process_line(self, line: str, line_num: int) -> None:
        """Process a single line of the log file."""
        # Look for coupon-related endpoints
        if any(re.search(pattern, line, re.IGNORECASE) for pattern in self.coupon_patterns):
            self.total_interactions += 1
            
            # Extract URL if present
            url_match = re.search(r'https?://[^\s]+', line)
            if url_match:
                url = url_match.group(0)
                self._categorize_endpoint(url, line, line_num)
            
            # Look for JSON data in the line
            self._extract_json_data(line, line_num)
    
    def _categorize_endpoint(self, url: str, line: str, line_num: int) -> None:
        """Categorize the endpoint and store relevant information."""
        endpoint_data = {
            'url': url,
            'line': line_num,
            'full_line': line
        }
        
        if 'ClippedOffers' in url:
            self.clipped_offers.append(endpoint_data)
        elif 'ads' in url.lower():
            self.ads_data.append(endpoint_data)
        else:
            # Extract the path for other endpoints
            path_match = re.search(r'https?://[^/]+(/[^\s?]+)', url)
            if path_match:
                endpoint = path_match.group(1)
                self.coupon_endpoints[endpoint].append(endpoint_data)
    
    def _extract_json_data(self, line: str, line_num: int) -> None:
        """Extract JSON data from log lines to analyze coupon content."""
        # Look for JSON patterns
        json_patterns = [
            r'\{[^{}]*"department"[^{}]*\}',
            r'\{[^{}]*"category"[^{}]*\}',
            r'\{[^{}]*"dept"[^{}]*\}',
            r'\{[^{}]*"Cottonelle"[^{}]*\}',
            r'\{[^{}]*"clippedOffers"[^{}]*\}',
            r'\{[^{}]*"rewards"[^{}]*\}',
            r'\{[^{}]*"coupons"[^{}]*\}',
            r'\{[^{}]*"offers"[^{}]*\}'
        ]
        
        for pattern in json_patterns:
            matches = re.findall(pattern, line, re.IGNORECASE)
            for match in matches:
                try:
                    # Try to parse as JSON
                    data = json.loads(match)
                    self._analyze_json_data(data, line_num)
                except json.JSONDecodeError:
                    # If not valid JSON, try to extract department info with regex
                    self._extract_department_regex(match, line_num)
    
    def _analyze_json_data(self, data: Dict[str, Any], line_num: int) -> None:
        """Analyze JSON data to extract department and coupon information."""
        if isinstance(data, dict):
            # Look for department information
            dept = self._extract_department_from_dict(data)
            if dept:
                self.category_counts[dept] += 1
            
            # Look for reward/coupon information
            self._extract_rewards_from_dict(data, line_num)
    
    def _extract_department_from_dict(self, data: Dict[str, Any]) -> Optional[str]:
        """Extract department information from a dictionary."""
        dept_fields = ['department', 'category', 'dept', 'categoryName', 'departmentName']
        
        for field in dept_fields:
            if field in data and data[field]:
                return str(data[field])
        
        return None
    
    def _extract_rewards_from_dict(self, data: Dict[str, Any], line_num: int) -> None:
        """Extract reward and coupon information from a dictionary."""
        reward_fields = ['rewards', 'coupons', 'offers', 'clippedOffers', 'ads']
        
        for field in reward_fields:
            if field in data and isinstance(data[field], list):
                for item in data[field]:
                    if isinstance(item, dict):
                        reward_info = {
                            'line': line_num,
                            'data': item,
                            'field': field
                        }
                        self.reward_coupons.append(reward_info)
    
    def _extract_department_regex(self, text: str, line_num: int) -> None:
        """Extract department information using regex patterns."""
        # Look for common department patterns
        dept_patterns = [
            r'"department"\s*:\s*"([^"]+)"',
            r'"category"\s*:\s*"([^"]+)"',
            r'"dept"\s*:\s*"([^"]+)"',
            r'"categoryName"\s*:\s*"([^"]+)"',
            r'"departmentName"\s*:\s*"([^"]+)"'
        ]
        
        for pattern in dept_patterns:
            match = re.search(pattern, text, re.IGNORECASE)
            if match:
                dept = match.group(1)
                self.category_counts[dept] += 1
                break
    
    def generate_report(self) -> None:
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


def main():
    """Main function to run the analysis."""
    analyzer = SimpleCouponAnalyzer()
    
    # Analyze the latest log file
    log_file = "logs/meijer_mitm_20250823_0000.log"
    
    if Path(log_file).exists():
        analyzer.analyze_log_file(log_file)
        analyzer.generate_report()
    else:
        print(f"Log file not found: {log_file}")


if __name__ == "__main__":
    main()
