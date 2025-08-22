#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Endpoint frequency analyzer to identify most hit endpoints not yet implemented
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: mitmproxy, collections, json, pathlib, typing
 */

Endpoint Frequency Analyzer for Meijer API

This tool analyzes mitmproxy log files to identify the most frequently hit API endpoints
and compares them against our current implementation to find gaps.
"""

import json
import os
from collections import Counter, defaultdict
from pathlib import Path
from typing import Dict, List, Set, Tuple, Any
from urllib.parse import urlparse

from mitmproxy import io
from mitmproxy.http import HTTPFlow


class EndpointFrequencyAnalyzer:
    """Analyzes endpoint frequency and identifies implementation gaps."""

    def __init__(self):
        self.endpoint_counts = Counter()
        self.endpoint_details = defaultdict(lambda: {
            "count": 0,
            "methods": set(),
            "status_codes": set(),
            "content_types": set(),
            "sample_urls": set(),
            "hosts": set(),
            "auth_required": False,
            "last_seen": None
        })
        
        # Currently implemented endpoints from our codebase
        self.implemented_endpoints = self._get_implemented_endpoints()
        
        # Endpoint categories for better organization
        self.endpoint_categories = {
            "shopping_list": ["shoppinglist", "list"],
            "cart": ["cart", "basket", "shopandscan"],
            "search": ["search", "product", "item"],
            "stores": ["store", "location"],
            "coupons": ["coupon", "offer", "deal"],
            "mperks": ["mperks", "loyalty", "reward"],
            "auth": ["auth", "oauth", "login", "token"],
            "user": ["user", "profile", "account"],
            "feedback": ["feedback", "survey"],
            "gas": ["gas", "fuel"],
            "other": []
        }

    def _get_implemented_endpoints(self) -> Set[str]:
        """Get list of currently implemented endpoints from our codebase."""
        implemented = set()
        
        # Core endpoints from our implementation
        core_endpoints = [
            # Shopping lists
            "/loyalty/shoppinglist/GetList",
            "/loyalty/shoppinglist/AddItem",
            "/loyalty/shoppinglist/RemoveItem",
            "/loyalty/shoppinglist/UpdateItem",
            "/loyalty/shoppinglist/ClearList",
            
            # Cart operations
            "/loyalty/shopandscan/lookupitem",
            "/loyalty/shopandscan/addtocart",
            "/loyalty/shopandscan/removefromcart",
            "/loyalty/shopandscan/getcart",
            "/loyalty/shopandscan/clearcart",
            "/retail/shopandscan/api/v1/NextGenPOSBasket",
            
            # Search
            "/search",
            "/products",
            "/items",
            
            # Stores
            "/stores",
            "/locations",
            
            # Coupons
            "/coupons",
            "/offers",
            
            # mPerks
            "/mperks",
            "/loyalty",
            
            # Auth
            "/oauth2",
            "/auth",
            
            # Feedback
            "/feedback",
            
            # Gas
            "/gas",
            "/fuel"
        ]
        
        for endpoint in core_endpoints:
            implemented.add(endpoint.lower())
            
        return implemented

    def analyze_log_file(self, log_file_path: str) -> None:
        """Analyze a single mitmproxy log file."""
        print(f"📁 Analyzing: {log_file_path}")
        
        if not os.path.exists(log_file_path):
            print(f"  ❌ File not found: {log_file_path}")
            return
            
        try:
            with open(log_file_path, "rb") as f:
                flows = io.FlowReader(f).stream()
                
                for flow in flows:
                    if isinstance(flow, HTTPFlow):
                        self._analyze_flow(flow, log_file_path)
                        
        except Exception as e:
            print(f"  ❌ Error reading {log_file_path}: {e}")
            return
            
        print(f"  ✅ Completed analysis of {log_file_path}")

    def _analyze_flow(self, flow: HTTPFlow, source_file: str) -> None:
        """Analyze a single HTTP flow."""
        try:
            # Extract request info
            url = flow.request.pretty_url
            method = flow.request.method
            host = flow.request.pretty_host
            path = flow.request.path
            status_code = flow.response.status_code if flow.response else None
            
            # Parse URL
            parsed_url = urlparse(url)
            base_path = parsed_url.path
            
            # Skip non-API calls
            if not self._is_api_endpoint(base_path, host):
                return
                
            # Create endpoint key
            endpoint_key = f"{method} {base_path}"
            
            # Update counters
            self.endpoint_counts[endpoint_key] += 1
            self.endpoint_details[endpoint_key]["count"] += 1
            self.endpoint_details[endpoint_key]["methods"].add(method)
            self.endpoint_details[endpoint_key]["hosts"].add(host)
            self.endpoint_details[endpoint_key]["sample_urls"].add(url)
            
            # Track status codes
            if status_code:
                self.endpoint_details[endpoint_key]["status_codes"].add(status_code)
                
            # Track content types
            content_type = flow.request.headers.get("content-type", "")
            if content_type:
                self.endpoint_details[endpoint_key]["content_types"].add(content_type)
                
            # Check if auth is required
            if "authorization" in flow.request.headers:
                self.endpoint_details[endpoint_key]["auth_required"] = True
                
        except Exception as e:
            print(f"  ⚠️ Error analyzing flow: {e}")

    def _is_api_endpoint(self, path: str, host: str) -> bool:
        """Determine if a path is an API endpoint we care about."""
        # Skip non-API hosts
        api_hosts = ["api.meijer.com", "id.meijer.com", "meijer.md-apis.medallia.com"]
        if not any(api_host in host for api_host in api_hosts):
            return False
            
        # Skip static assets
        static_extensions = [".js", ".css", ".png", ".jpg", ".gif", ".ico", ".woff", ".ttf"]
        if any(path.endswith(ext) for ext in static_extensions):
            return False
            
        # Skip common non-API paths
        skip_paths = ["/favicon.ico", "/robots.txt", "/sitemap.xml"]
        if path in skip_paths:
            return False
            
        return True

    def categorize_endpoint(self, endpoint: str) -> str:
        """Categorize an endpoint based on its path."""
        endpoint_lower = endpoint.lower()
        
        for category, keywords in self.endpoint_categories.items():
            if any(keyword in endpoint_lower for keyword in keywords):
                return category
                
        return "other"

    def generate_implementation_gaps_report(self) -> Dict[str, Any]:
        """Generate report of endpoints that need implementation."""
        report = {
            "summary": {
                "total_endpoints_found": len(self.endpoint_counts),
                "total_implemented": len(self.implemented_endpoints),
                "total_missing": 0,
                "analysis_timestamp": str(Path().cwd() / "endpoint_gaps_report.json")
            },
            "missing_endpoints_by_frequency": [],
            "missing_endpoints_by_category": defaultdict(list),
            "implementation_priority": [],
            "recommendations": []
        }
        
        # Find missing endpoints
        missing_endpoints = []
        for endpoint, count in self.endpoint_counts.most_common():
            # Extract just the path from "METHOD /path"
            method, path = endpoint.split(" ", 1)
            path_lower = path.lower()
            
            # Check if we have this endpoint implemented
            is_implemented = any(impl in path_lower for impl in self.implemented_endpoints)
            
            if not is_implemented:
                missing_endpoints.append({
                    "endpoint": endpoint,
                    "path": path,
                    "method": method,
                    "count": count,
                    "category": self.categorize_endpoint(path),
                    "details": dict(self.endpoint_details[endpoint])
                })
                
        report["summary"]["total_missing"] = len(missing_endpoints)
        
        # Sort by frequency (most hit first)
        missing_endpoints.sort(key=lambda x: x["count"], reverse=True)
        report["missing_endpoints_by_frequency"] = missing_endpoints
        
        # Group by category
        for endpoint_data in missing_endpoints:
            category = endpoint_data["category"]
            report["missing_endpoints_by_category"][category].append(endpoint_data)
            
        # Generate implementation priority list
        priority_endpoints = []
        for endpoint_data in missing_endpoints[:50]:  # Top 50 most hit
            priority_score = self._calculate_priority_score(endpoint_data)
            priority_endpoints.append({
                **endpoint_data,
                "priority_score": priority_score
            })
            
        # Sort by priority score
        priority_endpoints.sort(key=lambda x: x["priority_score"], reverse=True)
        report["implementation_priority"] = priority_endpoints
        
        # Generate recommendations
        report["recommendations"] = self._generate_recommendations(report)
        
        return report

    def _calculate_priority_score(self, endpoint_data: Dict[str, Any]) -> float:
        """Calculate priority score for implementation."""
        score = 0.0
        
        # Frequency weight (40%)
        score += (endpoint_data["count"] / max(self.endpoint_counts.values())) * 40
        
        # Category weight (30%)
        high_priority_categories = ["shopping_list", "cart", "search", "auth"]
        if endpoint_data["category"] in high_priority_categories:
            score += 30
            
        # Method weight (20%)
        if endpoint_data["method"] in ["GET", "POST"]:
            score += 20
            
        # Auth requirement weight (10%)
        if endpoint_data["details"]["auth_required"]:
            score += 10
            
        return score

    def _generate_recommendations(self, report: Dict[str, Any]) -> List[str]:
        """Generate implementation recommendations."""
        recommendations = []
        
        # Top missing endpoints
        top_missing = report["missing_endpoints_by_frequency"][:10]
        recommendations.append(f"Top 10 most frequently hit missing endpoints: {len(top_missing)}")
        
        # Category breakdown
        for category, endpoints in report["missing_endpoints_by_category"].items():
            if endpoints:
                recommendations.append(f"Category '{category}': {len(endpoints)} missing endpoints")
                
        # High priority recommendations
        high_priority = [ep for ep in report["implementation_priority"] if ep["priority_score"] > 50]
        recommendations.append(f"High priority endpoints (score > 50): {len(high_priority)}")
        
        # Implementation strategy
        recommendations.append("Implementation strategy: Focus on high-frequency endpoints in core categories first")
        
        return recommendations

    def save_report(self, report: Dict[str, Any], output_file: str) -> None:
        """Save the report to a file."""
        try:
            with open(output_file, "w") as f:
                json.dump(report, f, indent=2, default=str)
            print(f"✅ Report saved to: {output_file}")
        except Exception as e:
            print(f"❌ Error saving report: {e}")

    def print_summary(self, report: Dict[str, Any]) -> None:
        """Print a summary of the findings."""
        print("\n" + "="*80)
        print("🔍 ENDPOINT IMPLEMENTATION GAPS ANALYSIS")
        print("="*80)
        
        print(f"\n📊 Summary:")
        print(f"  Total endpoints found: {report['summary']['total_endpoints_found']}")
        print(f"  Currently implemented: {report['summary']['total_implemented']}")
        print(f"  Missing implementation: {report['summary']['total_missing']}")
        
        print(f"\n🏆 Top 10 Most Frequently Hit Missing Endpoints:")
        for i, endpoint_data in enumerate(report["missing_endpoints_by_frequency"][:10], 1):
            print(f"  {i:2d}. {endpoint_data['endpoint']} (hit {endpoint_data['count']} times)")
            
        print(f"\n📂 Missing Endpoints by Category:")
        for category, endpoints in report["missing_endpoints_by_category"].items():
            if endpoints:
                print(f"  {category:15s}: {len(endpoints):3d} endpoints")
                
        print(f"\n🎯 Top 5 High Priority Implementation Targets:")
        for i, endpoint_data in enumerate(report["implementation_priority"][:5], 1):
            print(f"  {i}. {endpoint_data['endpoint']} (priority: {endpoint_data['priority_score']:.1f})")


def main():
    """Main function to analyze all log files."""
    print("🔍 Meijer API Endpoint Frequency Analyzer")
    print("=" * 50)
    
    # Find all log files
    log_files = [
        "./meijer_mitm_20250821_070447.log",
        "./meijer_mitm_20250821_184926.log", 
        "./meijer_mitm_20250821_221036.log",
        "./meijer_mitm_20250821_221329.log",
        "./meijer_mitm_20250821_233419.log",
        "./meijer_mitm_20250822_012412.log"
    ]
    
    # Filter to existing files
    existing_logs = [f for f in log_files if os.path.exists(f)]
    
    if not existing_logs:
        print("❌ No log files found!")
        return
        
    print(f"\n📁 Found {len(existing_logs)} log files to analyze:")
    for log_file in existing_logs:
        print(f"  - {log_file}")
        
    # Initialize analyzer
    analyzer = EndpointFrequencyAnalyzer()
    
    # Analyze each log file
    print("\n🚀 Starting endpoint frequency analysis...")
    for log_file in existing_logs:
        analyzer.analyze_log_file(log_file)
        
    # Generate implementation gaps report
    print("\n📊 Generating implementation gaps report...")
    report = analyzer.generate_implementation_gaps_report()
    
    # Print summary
    analyzer.print_summary(report)
    
    # Save detailed report
    output_file = "endpoint_gaps_report.json"
    analyzer.save_report(report, output_file)
    
    print(f"\n✅ Analysis complete! Detailed report saved to: {output_file}")


if __name__ == "__main__":
    main()
