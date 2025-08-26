#!/usr/bin/env python3
"""
Direct analysis of mitmproxy log files for shop and scan endpoints.

This script directly reads mitmproxy log files to find:
- All shop and scan related endpoints
- HTTP methods used
- JSON responses and their structure
- Missing features that need implementation
"""

import json
from pathlib import Path
from typing import Dict, List, Any
from collections import defaultdict
import gzip
import pickle


class DirectLogAnalyzer:
    """Directly analyzes mitmproxy log files without starting a proxy."""

    def __init__(self):
        self.shop_endpoints = defaultdict(set)
        self.scan_endpoints = defaultdict(set)
        self.json_responses = defaultdict(list)
        self.all_endpoints = set()
        self.methods = set()
        self.status_codes = set()
        self.flow_count = 0

    def analyze_log_file(self, log_file: str) -> Dict[str, Any]:
        """Analyze a single mitmproxy log file."""
        print(f"🔍 Analyzing {log_file}...")

        try:
            # Try to load as pickle first
            with open(log_file, "rb") as f:
                flows = pickle.load(f)
                print(f"   📊 Loaded {len(flows)} flows from pickle format")
                return self._analyze_flows(flows, log_file)
        except (pickle.UnpicklingError, UnicodeDecodeError):
            pass

        try:
            # Try to load as gzipped pickle
            with gzip.open(log_file, "rb") as f:
                flows = pickle.load(f)
                print(f"   📊 Loaded {len(flows)} flows from gzipped pickle format")
                return self._analyze_flows(flows, log_file)
        except (pickle.UnpicklingError, UnicodeDecodeError, OSError):
            pass

        print(f"   ❌ Could not load {log_file} as pickle or gzipped pickle")
        return {}

    def _analyze_flows(self, flows: List[Any], log_file: str) -> Dict[str, Any]:
        """Analyze a list of flows."""
        results = {
            "log_file": log_file,
            "total_flows": len(flows),
            "shop_endpoints": defaultdict(set),
            "scan_endpoints": defaultdict(set),
            "all_endpoints": set(),
            "methods": set(),
            "status_codes": set(),
            "json_responses": defaultdict(list),
        }

        for i, flow in enumerate(flows):
            if i % 1000 == 0:
                print(f"   📝 Processing flow {i}/{len(flows)}...")

            try:
                # Extract request information
                if hasattr(flow, "request") and hasattr(flow.request, "url"):
                    url = flow.request.url
                    method = getattr(flow.request, "method", "UNKNOWN")

                    # Check if this is a shop or scan related endpoint
                    if self._is_shop_scan_endpoint(url):
                        results["shop_endpoints"][url].add(method)
                        results["all_endpoints"].add(url)
                        results["methods"].add(method)

                        # Check for scan-related endpoints
                        if any(
                            keyword in url.lower()
                            for keyword in ["scan", "barcode", "upc", "qr", "camera"]
                        ):
                            results["scan_endpoints"][url].add(method)

                # Extract response information
                if hasattr(flow, "response") and hasattr(flow.response, "status_code"):
                    status_code = flow.response.status_code
                    results["status_codes"].add(status_code)

                    # Try to extract JSON responses
                    if status_code == 200 and hasattr(flow.response, "content"):
                        try:
                            content = flow.response.content
                            if isinstance(content, bytes):
                                content = content.decode("utf-8")

                            # Check if it's JSON
                            if self._looks_like_json(content):
                                json_data = json.loads(content)
                                if hasattr(flow.request, "url"):
                                    results["json_responses"][flow.request.url].append(
                                        {
                                            "method": getattr(
                                                flow.request, "method", "UNKNOWN"
                                            ),
                                            "status_code": status_code,
                                            "data": json_data,
                                        }
                                    )
                        except (
                            json.JSONDecodeError,
                            UnicodeDecodeError,
                            AttributeError,
                        ):
                            pass

            except Exception as e:
                if i < 10:  # Only show first few errors
                    print(f"   ⚠️ Error processing flow {i}: {e}")
                continue

        # Convert sets to lists for JSON serialization
        for key in [
            "shop_endpoints",
            "scan_endpoints",
            "all_endpoints",
            "methods",
            "status_codes",
        ]:
            if key in ["shop_endpoints", "scan_endpoints"]:
                results[key] = {
                    url: list(methods) for url, methods in results[key].items()
                }
            else:
                results[key] = list(results[key])

        return results

    def _is_shop_scan_endpoint(self, url: str) -> bool:
        """Check if URL is related to shop or scan functionality."""
        if not url:
            return False

        url_lower = url.lower()
        shop_keywords = [
            "shop",
            "store",
            "cart",
            "item",
            "product",
            "barcode",
            "upc",
            "fulfillment",
            "reservation",
        ]
        scan_keywords = ["scan", "barcode", "upc", "qr", "camera", "shopnscan"]

        # Check for shop-related endpoints
        if any(keyword in url_lower for keyword in shop_keywords):
            return True

        # Check for scan-related endpoints
        if any(keyword in url_lower for keyword in scan_keywords):
            return True

        # Check for Meijer-specific endpoints
        if "meijer.com" in url_lower and any(
            keyword in url_lower for keyword in shop_keywords + scan_keywords
        ):
            return True

        return False

    def _looks_like_json(self, content: str) -> bool:
        """Check if content looks like JSON."""
        if not content:
            return False

        content = content.strip()
        return (content.startswith("{") and content.endswith("}")) or (
            content.startswith("[") and content.endswith("]")
        )


def main():
    """Main analysis function."""
    print("🔍 Direct Log Analysis for Shop & Scan Endpoints")
    print("=" * 60)

    # Find all log files
    log_files = list(Path(".").glob("*.log"))
    print(f"Found {len(log_files)} log files to analyze")

    analyzer = DirectLogAnalyzer()
    all_results = {}

    for log_file in log_files:
        print(f"\n📁 Analyzing {log_file.name}...")
        results = analyzer.analyze_log_file(str(log_file))
        if results:
            all_results[log_file.name] = results

    # Generate comprehensive report
    print("\n📊 Generating comprehensive report...")

    comprehensive_report = {
        "analysis_summary": {
            "total_log_files": len(log_files),
            "successfully_analyzed": len(all_results),
            "total_unique_endpoints": set(),
            "total_shop_endpoints": set(),
            "total_scan_endpoints": set(),
            "all_methods": set(),
            "all_status_codes": set(),
            "total_flows_analyzed": 0,
        },
        "endpoint_analysis": {},
        "json_response_analysis": {},
        "implementation_gaps": [],
    }

    # Aggregate results
    for log_name, results in all_results.items():
        comprehensive_report["endpoint_analysis"][log_name] = results

        if "all_endpoints" in results:
            comprehensive_report["analysis_summary"]["total_unique_endpoints"].update(
                results["all_endpoints"]
            )
        if "shop_endpoints" in results:
            comprehensive_report["analysis_summary"]["total_shop_endpoints"].update(
                results["shop_endpoints"].keys()
            )
        if "scan_endpoints" in results:
            comprehensive_report["analysis_summary"]["total_scan_endpoints"].update(
                results["scan_endpoints"].keys()
            )
        if "methods" in results:
            comprehensive_report["analysis_summary"]["all_methods"].update(
                results["methods"]
            )
        if "status_codes" in results:
            comprehensive_report["analysis_summary"]["total_status_codes"].update(
                results["status_codes"]
            )
        if "total_flows" in results:
            comprehensive_report["analysis_summary"]["total_flows_analyzed"] += results[
                "total_flows"
            ]

    # Convert sets to lists for JSON serialization
    for key in [
        "total_unique_endpoints",
        "total_shop_endpoints",
        "total_scan_endpoints",
        "all_methods",
        "all_status_codes",
    ]:
        comprehensive_report["analysis_summary"][key] = list(
            comprehensive_report["analysis_summary"][key]
        )

    # Save comprehensive report
    with open("shop_scan_analysis_direct.json", "w") as f:
        json.dump(comprehensive_report, f, indent=2, default=str)

    print("\n✅ Analysis complete!")
    print("📄 Comprehensive report saved to: shop_scan_analysis_direct.json")
    print(
        f"🔍 Found {len(comprehensive_report['analysis_summary']['total_unique_endpoints'])} unique endpoints"
    )
    print(
        f"🏪 Found {len(comprehensive_report['analysis_summary']['total_shop_endpoints'])} shop-related endpoints"
    )
    print(
        f"📱 Found {len(comprehensive_report['analysis_summary']['total_scan_endpoints'])} scan-related endpoints"
    )
    print(
        f"📊 Analyzed {comprehensive_report['analysis_summary']['total_flows_analyzed']} total flows"
    )

    return comprehensive_report


if __name__ == "__main__":
    main()
