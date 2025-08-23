#!/usr/bin/env python3
"""
Targeted Coupon Search for Meijer mitmproxy logs

This script searches for specific coupon patterns mentioned by the user:
- 421 total interactions
- 3 Deli
- 68 Dry Grocery
- 50 clipped rewards/coupons
- 1 clipped coupon in Baby for $15.00 off Cottonelle
"""

import json
import re
from collections import defaultdict, Counter
from pathlib import Path
from typing import Dict, List, Any, Optional


class TargetedCouponSearch:
    """Targeted search for specific coupon patterns."""
    
    def __init__(self):
        self.total_interactions = 0
        self.department_counts = defaultdict(int)
        self.clipped_rewards = []
        self.cottonelle_items = []
        self.endpoint_counts = defaultdict(int)
        
    def search_log_file(self, log_file_path: str) -> None:
        """Search the log file for specific coupon patterns."""
        print(f"Searching log file: {log_file_path}")
        
        try:
            with open(log_file_path, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
            
            # Search for specific patterns
            self._search_clipped_offers(content)
            self._search_department_patterns(content)
            self._search_cottonelle_patterns(content)
            self._search_endpoint_patterns(content)
            
        except Exception as e:
            print(f"Error reading log file: {e}")
            return
    
    def _search_clipped_offers(self, content: str) -> None:
        """Search for ClippedOffers patterns."""
        print("\nSearching for ClippedOffers patterns...")
        
        # Look for ClippedOffers in URLs
        clipped_urls = re.findall(r'https?://[^"\s]+ClippedOffers[^"\s]*', content, re.IGNORECASE)
        print(f"Found {len(clipped_urls)} ClippedOffers URLs")
        
        # Look for ClippedOffers in JSON data
        clipped_json = re.findall(r'\{[^{}]*"clippedOffers"[^{}]*\}', content, re.IGNORECASE)
        print(f"Found {len(clipped_json)} ClippedOffers JSON objects")
        
        # Look for clipped rewards/coupons
        clipped_rewards = re.findall(r'\{[^{}]*"clipped"[^{}]*"true"[^{}]*\}', content, re.IGNORECASE)
        print(f"Found {len(clipped_rewards)} clipped reward objects")
        
        self.total_interactions += len(clipped_urls) + len(clipped_json) + len(clipped_rewards)
    
    def _search_department_patterns(self, content: str) -> None:
        """Search for department/category patterns."""
        print("\nSearching for department patterns...")
        
        # Look for specific departments mentioned
        dept_patterns = {
            'Deli': r'\{[^{}]*"department"[^{}]*"[^"]*[Dd]eli[^"]*"[^{}]*\}',
            'Dry Grocery': r'\{[^{}]*"department"[^{}]*"[^"]*[Dd]ry[^"]*[Gg]rocery[^"]*"[^{}]*\}',
            'Baby': r'\{[^{}]*"department"[^{}]*"[^"]*[Bb]aby[^"]*"[^{}]*\}'
        }
        
        for dept_name, pattern in dept_patterns.items():
            matches = re.findall(pattern, content, re.IGNORECASE)
            self.department_counts[dept_name] = len(matches)
            print(f"Found {len(matches)} {dept_name} department references")
        
        # Also look for category patterns
        category_patterns = {
            'Deli': r'\{[^{}]*"category"[^{}]*"[^"]*[Dd]eli[^"]*"[^{}]*\}',
            'Dry Grocery': r'\{[^{}]*"category"[^{}]*"[^"]*[Dd]ry[^"]*[Gg]rocery[^"]*"[^{}]*\}',
            'Baby': r'\{[^{}]*"category"[^{}]*"[^"]*[Bb]aby[^"]*"[^{}]*\}'
        }
        
        for dept_name, pattern in category_patterns.items():
            matches = re.findall(pattern, content, re.IGNORECASE)
            self.department_counts[dept_name] += len(matches)
            print(f"Found {len(matches)} {dept_name} category references")
    
    def _search_cottonelle_patterns(self, content: str) -> None:
        """Search for Cottonelle and $15.00 off patterns."""
        print("\nSearching for Cottonelle patterns...")
        
        # Look for Cottonelle mentions
        cottonelle_matches = re.findall(r'\{[^{}]*"[^"]*[Cc]ottonelle[^"]*"[^{}]*\}', content)
        print(f"Found {len(cottonelle_matches)} Cottonelle references")
        
        # Look for $15.00 off patterns
        dollar_off_matches = re.findall(r'\{[^{}]*"[^"]*\$15\.00[^"]*[Oo]ff[^"]*"[^{}]*\}', content)
        print(f"Found {len(dollar_off_matches)} $15.00 off references")
        
        # Look for combination of both
        cottonelle_15_off = re.findall(r'\{[^{}]*"[^"]*[Cc]ottonelle[^"]*"[^{}]*"[^"]*\$15\.00[^"]*"[^{}]*\}', content)
        print(f"Found {len(cottonelle_15_off)} Cottonelle + $15.00 off combinations")
        
        # Store found items
        for match in cottonelle_matches:
            self.cottonelle_items.append(match)
    
    def _search_endpoint_patterns(self, content: str) -> None:
        """Search for specific endpoint patterns."""
        print("\nSearching for endpoint patterns...")
        
        # Look for ads endpoints
        ads_pattern = r'https?://[^"\s]+ads[^"\s]*'
        ads_matches = re.findall(ads_pattern, content, re.IGNORECASE)
        self.endpoint_counts['ads'] = len(ads_matches)
        print(f"Found {len(ads_matches)} ads endpoint calls")
        
        # Look for other coupon-related endpoints
        coupon_endpoints = [
            'coupons', 'rewards', 'offers', 'promotions', 'clippedOffers'
        ]
        
        for endpoint in coupon_endpoints:
            pattern = rf'https?://[^"\s]+{endpoint}[^"\s]*'
            matches = re.findall(pattern, content, re.IGNORECASE)
            self.endpoint_counts[endpoint] = len(matches)
            print(f"Found {len(matches)} {endpoint} endpoint calls")
    
    def generate_targeted_report(self) -> None:
        """Generate a targeted summary report."""
        print("\n" + "="*80)
        print("TARGETED COUPON SEARCH RESULTS")
        print("="*80)
        
        print(f"\nTotal Coupon-Related Interactions Found: {self.total_interactions}")
        
        print(f"\nDepartment/Category Breakdown:")
        for dept, count in sorted(self.department_counts.items()):
            print(f"  {dept}: {count}")
        
        print(f"\nEndpoint Breakdown:")
        for endpoint, count in sorted(self.endpoint_counts.items()):
            print(f"  {endpoint}: {count}")
        
        print(f"\nCottonelle Items Found: {len(self.cottonelle_items)}")
        if self.cottonelle_items:
            print("Sample Cottonelle items:")
            for item in self.cottonelle_items[:3]:  # Show first 3
                print(f"  - {item[:200]}...")  # Truncate for readability
        
        # Check against expected values
        print(f"\n" + "="*50)
        print("EXPECTED vs FOUND COMPARISON")
        print("="*50)
        
        expected = {
            'Total Interactions': 421,
            'Deli': 3,
            'Dry Grocery': 68,
            'Clipped Rewards/Coupons': 50,
            'Cottonelle $15.00 off': 1
        }
        
        found = {
            'Total Interactions': self.total_interactions,
            'Deli': self.department_counts.get('Deli', 0),
            'Dry Grocery': self.department_counts.get('Dry Grocery', 0),
            'Clipped Rewards/Coupons': len([k for k, v in self.endpoint_counts.items() if 'clipped' in k.lower()]),
            'Cottonelle $15.00 off': len(self.cottonelle_items)
        }
        
        for key in expected:
            expected_val = expected[key]
            found_val = found.get(key, 0)
            status = "✓" if found_val >= expected_val else "✗"
            print(f"  {key}: Expected {expected_val}, Found {found_val} {status}")
        
        # Save detailed results
        self._save_targeted_results()
    
    def _save_targeted_results(self) -> None:
        """Save targeted search results to JSON file."""
        results = {
            'summary': {
                'total_interactions': self.total_interactions,
                'department_counts': dict(self.department_counts),
                'endpoint_counts': dict(self.endpoint_counts),
                'cottonelle_items_count': len(self.cottonelle_items)
            },
            'cottonelle_items': self.cottonelle_items,
            'department_details': dict(self.department_counts),
            'endpoint_details': dict(self.endpoint_counts)
        }
        
        output_file = 'targeted_coupon_search_results.json'
        with open(output_file, 'w') as f:
            json.dump(results, f, indent=2, default=str)
        
        print(f"\nDetailed results saved to: {output_file}")


def main():
    """Main function to run the targeted search."""
    searcher = TargetedCouponSearch()
    
    # Search the latest log file
    log_file = "logs/meijer_mitm_20250823_0000.log"
    
    if Path(log_file).exists():
        searcher.search_log_file(log_file)
        searcher.generate_targeted_report()
    else:
        print(f"Log file not found: {log_file}")


if __name__ == "__main__":
    main()
