#!/usr/bin/env python3
"""
Multi-Log Coupon Analyzer for Meijer mitmproxy logs

This script analyzes multiple log files to find specific coupon patterns:
- 421 total interactions
- 3 Deli
- 68 Dry Grocery
- 50 clipped rewards/coupons
- 1 clipped coupon in Baby for $15.00 off Cottonelle
"""

import json
import re
from collections import defaultdict
from pathlib import Path
from typing import Dict, Any


class MultiLogCouponAnalyzer:
    """Analyzer for multiple log files to find coupon patterns."""
    
    def __init__(self):
        self.total_interactions = 0
        self.department_counts = defaultdict(int)
        self.clipped_rewards = []
        self.cottonelle_items = []
        self.endpoint_counts = defaultdict(int)
        self.log_file_results = {}
        
    def analyze_all_logs(self) -> None:
        """Analyze all available log files."""
        log_dir = Path("logs")
        
        # Get all mitmproxy log files
        log_files = sorted(log_dir.glob("meijer_mitm_*.log"))
        
        print(f"Found {len(log_files)} log files to analyze")
        
        for log_file in log_files:
            print(f"\nAnalyzing: {log_file.name}")
            self._analyze_single_log(log_file)
        
        # Also check existing analysis files
        self._analyze_existing_analysis_files()
        
        # Generate comprehensive report
        self.generate_comprehensive_report()
    
    def _analyze_single_log(self, log_file: Path) -> None:
        """Analyze a single log file."""
        try:
            with open(log_file, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
            
            file_results = {
                'size_mb': len(content) / (1024 * 1024),
                'interactions': 0,
                'departments': defaultdict(int),
                'cottonelle_found': 0,
                'clipped_found': 0
            }
            
            # Search for specific patterns
            self._search_patterns_in_content(content, file_results)
            
            # Store results
            self.log_file_results[log_file.name] = file_results
            
            # Update global counts
            self.total_interactions += file_results['interactions']
            for dept, count in file_results['departments'].items():
                self.department_counts[dept] += count
            
            print(f"  Size: {file_results['size_mb']:.1f}MB")
            print(f"  Interactions: {file_results['interactions']}")
            print(f"  Departments found: {dict(file_results['departments'])}")
            print(f"  Cottonelle items: {file_results['cottonelle_found']}")
            print(f"  Clipped items: {file_results['clipped_found']}")
            
        except Exception as e:
            print(f"  Error reading {log_file.name}: {e}")
    
    def _search_patterns_in_content(self, content: str, file_results: Dict[str, Any]) -> None:
        """Search for specific patterns in log content."""
        # Search for department patterns
        dept_patterns = {
            'Deli': r'[Dd]eli',
            'Dry Grocery': r'[Dd]ry\s*[Gg]rocery',
            'Baby': r'[Bb]aby'
        }
        
        for dept_name, pattern in dept_patterns.items():
            matches = re.findall(pattern, content, re.IGNORECASE)
            count = len(matches)
            if count > 0:
                file_results['departments'][dept_name] += count
                file_results['interactions'] += count
        
        # Search for Cottonelle
        cottonelle_matches = re.findall(r'[Cc]ottonelle', content, re.IGNORECASE)
        file_results['cottonelle_found'] = len(cottonelle_matches)
        file_results['interactions'] += len(cottonelle_matches)
        
        # Search for $15.00 off patterns
        dollar_off_matches = re.findall(r'\$15\.00.*[Oo]ff|[Oo]ff.*\$15\.00', content, re.IGNORECASE)
        file_results['interactions'] += len(dollar_off_matches)
        
        # Search for clipped patterns
        clipped_patterns = [
            r'[Cc]lippedOffers',
            r'[Cc]lipped.*[Oo]ffers',
            r'[Ii]sClipped.*true',
            r'[Cc]lipped.*[Rr]ewards',
            r'[Cc]lipped.*[Cc]oupons'
        ]
        
        for pattern in clipped_patterns:
            matches = re.findall(pattern, content, re.IGNORECASE)
            count = len(matches)
            if count > 0:
                file_results['clipped_found'] += count
                file_results['interactions'] += count
        
        # Search for endpoint patterns
        endpoint_patterns = [
            r'ads',
            r'coupons',
            r'rewards',
            r'offers',
            r'promotions'
        ]
        
        for pattern in endpoint_patterns:
            matches = re.findall(pattern, content, re.IGNORECASE)
            self.endpoint_counts[pattern] += len(matches)
            file_results['interactions'] += len(matches)
    
    def _analyze_existing_analysis_files(self) -> None:
        """Analyze existing JSON analysis files."""
        log_dir = Path("logs")
        
        analysis_files = [
            "comprehensive_log_analysis.json",
            "latest_log_checkout_analysis.json",
            "complete_shop_scan_flow_analysis.json"
        ]
        
        for filename in analysis_files:
            file_path = log_dir / filename
            if file_path.exists():
                print(f"\nAnalyzing existing analysis file: {filename}")
                try:
                    with open(file_path, 'r') as f:
                        data = json.load(f)
                    self._extract_from_json_analysis(data, filename)
                except Exception as e:
                    print(f"  Error reading {filename}: {e}")
    
    def _extract_from_json_analysis(self, data: Any, filename: str) -> None:
        """Extract coupon data from JSON analysis files."""
        if isinstance(data, dict):
            # Look for department information
            if 'categoryName' in data:
                category = data['categoryName']
                if category:
                    self.department_counts[category] += 1
                    self.total_interactions += 1
            
            # Look for coupon information
            if 'isClipped' in data and data['isClipped'] is True:
                self.clipped_rewards.append(data)
            
            # Look for Cottonelle
            text_fields = ['name', 'title', 'description', 'productName', 'itemName']
            for field in text_fields:
                if field in data and data[field]:
                    text = str(data[field]).lower()
                    if 'cottonelle' in text:
                        self.cottonelle_items.append(data)
                        break
            
            # Recursively search nested structures
            for key, value in data.items():
                if isinstance(value, dict):
                    self._extract_from_json_analysis(value, filename)
                elif isinstance(value, list):
                    for item in value:
                        if isinstance(item, dict):
                            self._extract_from_json_analysis(item, filename)
    
    def generate_comprehensive_report(self) -> None:
        """Generate a comprehensive summary report."""
        print("\n" + "="*80)
        print("MULTI-LOG COUPON ANALYSIS RESULTS")
        print("="*80)
        
        print(f"\nTotal Interactions Found: {self.total_interactions}")
        
        print("\nDepartment/Category Breakdown:")
        for dept, count in sorted(self.department_counts.items()):
            print(f"  {dept}: {count}")
        
        print("\nEndpoint Breakdown:")
        for endpoint, count in sorted(self.endpoint_counts.items()):
            print(f"  {endpoint}: {count}")
        
        print(f"\nClipped Rewards/Coupons Found: {len(self.clipped_rewards)}")
        print(f"Cottonelle Items Found: {len(self.cottonelle_items)}")
        
        # Show sample Cottonelle items
        if self.cottonelle_items:
            print("\nSample Cottonelle items:")
            for item in self.cottonelle_items[:3]:
                if isinstance(item, dict):
                    name = item.get('name', 'N/A')
                    description = item.get('description', 'N/A')
                    category = item.get('categoryName', 'N/A')
                    print(f"  - Name: {name}")
                    print(f"    Category: {category}")
                    print(f"    Description: {description[:100] if description else 'N/A'}...")
                    print()
        
        # Check against expected values
        print("\n" + "="*50)
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
            'Clipped Rewards/Coupons': len(self.clipped_rewards),
            'Cottonelle $15.00 off': len(self.cottonelle_items)
        }
        
        for key in expected:
            expected_val = expected[key]
            found_val = found.get(key, 0)
            status = "✓" if found_val >= expected_val else "✗"
            print(f"  {key}: Expected {expected_val}, Found {found_val} {status}")
        
        # Show log file summary
        print("\n" + "="*50)
        print("LOG FILE ANALYSIS SUMMARY")
        print("="*50)
        
        for filename, results in self.log_file_results.items():
            print(f"\n{filename}:")
            print(f"  Size: {results['size_mb']:.1f}MB")
            print(f"  Interactions: {results['interactions']}")
            print(f"  Departments: {dict(results['departments'])}")
            print(f"  Cottonelle: {results['cottonelle_found']}")
            print(f"  Clipped: {results['clipped_found']}")
        
        # Save detailed results
        self._save_multi_log_results()
    
    def _save_multi_log_results(self) -> None:
        """Save multi-log analysis results to JSON file."""
        results = {
            'summary': {
                'total_interactions': self.total_interactions,
                'department_counts': dict(self.department_counts),
                'endpoint_counts': dict(self.endpoint_counts),
                'clipped_rewards_count': len(self.clipped_rewards),
                'cottonelle_items_count': len(self.cottonelle_items)
            },
            'log_file_results': self.log_file_results,
            'department_details': dict(self.department_counts),
            'endpoint_details': dict(self.endpoint_counts),
            'cottonelle_items': self.cottonelle_items,
            'clipped_rewards': self.clipped_rewards[:10]  # Limit for readability
        }
        
        output_file = 'multi_log_coupon_analysis_results.json'
        with open(output_file, 'w') as f:
            json.dump(results, f, indent=2, default=str)
        
        print(f"\nDetailed results saved to: {output_file}")


def main():
    """Main function to run the multi-log analysis."""
    analyzer = MultiLogCouponAnalyzer()
    analyzer.analyze_all_logs()


if __name__ == "__main__":
    main()
