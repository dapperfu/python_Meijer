#!/usr/bin/env python3
"""
Comprehensive Coupon Analyzer for Meijer API Analysis Files

This script analyzes existing JSON analysis files to extract coupon-related information
including department counts, clipped offers, and specific items like Cottonelle.
"""

import json
import re
from collections import defaultdict, Counter
from pathlib import Path
from typing import Dict, List, Any, Optional


class ComprehensiveCouponAnalyzer:
    """Comprehensive analyzer for coupon data in existing analysis files."""
    
    def __init__(self):
        self.department_counts = defaultdict(int)
        self.coupon_items = []
        self.clipped_offers = []
        self.cottonelle_items = []
        self.total_interactions = 0
        self.endpoint_counts = defaultdict(int)
        
    def analyze_comprehensive_log(self, file_path: str) -> None:
        """Analyze the comprehensive log analysis file."""
        print(f"Analyzing comprehensive log analysis: {file_path}")
        
        try:
            with open(file_path, 'r') as f:
                data = json.load(f)
            
            self._extract_coupon_data(data)
            
        except Exception as e:
            print(f"Error reading file: {e}")
            return
    
    def _extract_coupon_data(self, data: Any) -> None:
        """Extract coupon data from the analysis file."""
        if isinstance(data, dict):
            # Look for department information
            self._extract_departments(data)
            
            # Look for coupon information
            self._extract_coupons(data)
            
            # Look for specific items
            self._extract_specific_items(data)
            
            # Recursively search nested structures
            for key, value in data.items():
                if isinstance(value, dict):
                    self._extract_coupon_data(value)
                elif isinstance(value, list):
                    for item in value:
                        if isinstance(item, dict):
                            self._extract_coupon_data(item)
    
    def _extract_departments(self, data: Dict[str, Any]) -> None:
        """Extract department information."""
        if 'categoryName' in data:
            category = data['categoryName']
            if category:
                self.department_counts[category] += 1
                self.total_interactions += 1
        
        if 'department' in data:
            dept = data['department']
            if dept:
                self.department_counts[dept] += 1
                self.total_interactions += 1
    
    def _extract_coupons(self, data: Dict[str, Any]) -> None:
        """Extract coupon and offer information."""
        # Look for coupon-related fields
        coupon_fields = ['isClipped', 'isAutoClipped', 'manufacturerCoupon', 'couponId']
        
        for field in coupon_fields:
            if field in data:
                if field == 'isClipped' and data[field] is True:
                    self.clipped_offers.append(data)
                elif field == 'manufacturerCoupon' and data[field] is True:
                    self.coupon_items.append(data)
        
        # Look for redeem amount (coupon value)
        if 'redeemAmount' in data:
            amount = data['redeemAmount']
            if amount and amount > 0:
                coupon_info = {
                    'amount': amount,
                    'data': data
                }
                self.coupon_items.append(coupon_info)
    
    def _extract_specific_items(self, data: Dict[str, Any]) -> None:
        """Extract specific items like Cottonelle."""
        # Look for product names and descriptions
        text_fields = ['name', 'title', 'description', 'productName', 'itemName']
        
        for field in text_fields:
            if field in data and data[field]:
                text = str(data[field]).lower()
                if 'cottonelle' in text:
                    self.cottonelle_items.append(data)
                    break
        
        # Look for $15.00 off patterns
        if 'description' in data and data['description']:
            desc = str(data['description'])
            if re.search(r'\$15\.00.*off|off.*\$15\.00', desc, re.IGNORECASE):
                if 'cottonelle' in desc.lower():
                    self.cottonelle_items.append(data)
    
    def analyze_other_files(self) -> None:
        """Analyze other relevant analysis files."""
        log_dir = Path("logs")
        
        # Look for other analysis files that might contain coupon data
        analysis_files = [
            "latest_log_checkout_analysis.json",
            "complete_shop_scan_flow_analysis.json",
            "targeted_shop_scan_analysis.json"
        ]
        
        for filename in analysis_files:
            file_path = log_dir / filename
            if file_path.exists():
                print(f"\nAnalyzing additional file: {filename}")
                try:
                    with open(file_path, 'r') as f:
                        data = json.load(f)
                    self._extract_coupon_data(data)
                except Exception as e:
                    print(f"Error reading {filename}: {e}")
    
    def generate_comprehensive_report(self) -> None:
        """Generate a comprehensive summary report."""
        print("\n" + "="*80)
        print("COMPREHENSIVE COUPON ANALYSIS RESULTS")
        print("="*80)
        
        print(f"\nTotal Interactions Found: {self.total_interactions}")
        
        print(f"\nDepartment/Category Breakdown:")
        for dept, count in sorted(self.department_counts.items()):
            print(f"  {dept}: {count}")
        
        print(f"\nCoupon Items Found: {len(self.coupon_items)}")
        print(f"Clipped Offers Found: {len(self.clipped_offers)}")
        print(f"Cottonelle Items Found: {len(self.cottonelle_items)}")
        
        # Show sample Cottonelle items
        if self.cottonelle_items:
            print(f"\nSample Cottonelle items:")
            for item in self.cottonelle_items[:3]:
                if isinstance(item, dict):
                    # Extract relevant information
                    name = item.get('name', 'N/A')
                    description = item.get('description', 'N/A')
                    category = item.get('categoryName', 'N/A')
                    print(f"  - Name: {name}")
                    print(f"    Category: {category}")
                    print(f"    Description: {description[:100]}...")
                    print()
        
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
            'Clipped Rewards/Coupons': len(self.clipped_offers),
            'Cottonelle $15.00 off': len(self.cottonelle_items)
        }
        
        for key in expected:
            expected_val = expected[key]
            found_val = found.get(key, 0)
            status = "✓" if found_val >= expected_val else "✗"
            print(f"  {key}: Expected {expected_val}, Found {found_val} {status}")
        
        # Save detailed results
        self._save_comprehensive_results()
    
    def _save_comprehensive_results(self) -> None:
        """Save comprehensive analysis results to JSON file."""
        results = {
            'summary': {
                'total_interactions': self.total_interactions,
                'department_counts': dict(self.department_counts),
                'coupon_items_count': len(self.coupon_items),
                'clipped_offers_count': len(self.clipped_offers),
                'cottonelle_items_count': len(self.cottonelle_items)
            },
            'department_details': dict(self.department_counts),
            'coupon_items': self.coupon_items[:10],  # Limit to first 10 for readability
            'clipped_offers': self.clipped_offers[:10],
            'cottonelle_items': self.cottonelle_items
        }
        
        output_file = 'comprehensive_coupon_analysis_results.json'
        with open(output_file, 'w') as f:
            json.dump(results, f, indent=2, default=str)
        
        print(f"\nDetailed results saved to: {output_file}")


def main():
    """Main function to run the comprehensive analysis."""
    analyzer = ComprehensiveCouponAnalyzer()
    
    # Analyze the comprehensive log analysis file
    comprehensive_file = "logs/comprehensive_log_analysis.json"
    
    if Path(comprehensive_file).exists():
        analyzer.analyze_comprehensive_log(comprehensive_file)
        
        # Also analyze other relevant files
        analyzer.analyze_other_files()
        
        # Generate the report
        analyzer.generate_comprehensive_report()
    else:
        print(f"Comprehensive log analysis file not found: {comprehensive_file}")


if __name__ == "__main__":
    main()
