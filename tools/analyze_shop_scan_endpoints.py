#!/usr/bin/env python3
"""
Comprehensive analysis of mitmproxy logs for shop and scan endpoints.

This script analyzes all *.log files to find:
- All shop and scan related endpoints
- HTTP methods used
- JSON responses and their structure
- Missing features that need implementation
"""

import json
import os
import sys
from pathlib import Path
from typing import Dict, Any
from collections import defaultdict

# Add the project root to the path
project_root = Path(__file__).parent.parent
sys.path.insert(0, str(project_root))

from mitmproxy import http


class ShopScanAnalyzer:
    """Analyzes mitmproxy logs for shop and scan endpoints."""

    def __init__(self):
        self.shop_endpoints = defaultdict(set)
        self.scan_endpoints = defaultdict(set)
        self.json_responses = defaultdict(list)
        self.all_endpoints = set()
        self.methods = set()
        self.status_codes = set()

    def load(self, loader):
        """Load the addon."""
        pass

    def request(self, flow: http.HTTPFlow) -> None:
        """Process each request."""
        url = flow.request.pretty_url
        method = flow.request.method
        self.methods.add(method)

        # Check if this is a shop or scan related endpoint
        if self._is_shop_scan_endpoint(url):
            endpoint_info = {
                "method": method,
                "url": url,
                "headers": dict(flow.request.headers),
                "query_params": dict(flow.request.query),
                "timestamp": getattr(flow, "timestamp_start", None),
            }

            if "shop" in url.lower():
                self.shop_endpoints[url].add(method)
            if "scan" in url.lower():
                self.scan_endpoints[url].add(method)

            self.all_endpoints.add(url)

    def response(self, flow: http.HTTPFlow) -> None:
        """Process each response."""
        url = flow.request.pretty_url
        status_code = flow.response.status_code
        self.status_codes.add(status_code)

        if self._is_shop_scan_endpoint(url) and status_code == 200:
            try:
                # Try to parse JSON response
                content_type = flow.response.headers.get("content-type", "")
                if "application/json" in content_type:
                    response_data = json.loads(flow.response.content.decode("utf-8"))
                    self.json_responses[url].append(
                        {
                            "method": flow.request.method,
                            "status_code": status_code,
                            "data": response_data,
                            "timestamp": getattr(flow, "timestamp_start", None),
                        }
                    )
            except (json.JSONDecodeError, UnicodeDecodeError):
                pass

    def _is_shop_scan_endpoint(self, url: str) -> bool:
        """Check if URL is related to shop or scan functionality."""
        url_lower = url.lower()
        shop_keywords = ["shop", "store", "cart", "item", "product", "barcode", "upc"]
        scan_keywords = ["scan", "barcode", "upc", "qr", "camera"]

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

    def generate_report(self) -> Dict[str, Any]:
        """Generate comprehensive analysis report."""
        report = {
            "summary": {
                "total_shop_endpoints": len(self.shop_endpoints),
                "total_scan_endpoints": len(self.scan_endpoints),
                "total_endpoints": len(self.all_endpoints),
                "methods_found": list(self.methods),
                "status_codes_found": list(self.status_codes),
            },
            "shop_endpoints": {
                url: list(methods) for url, methods in self.shop_endpoints.items()
            },
            "scan_endpoints": {
                url: list(methods) for url, methods in self.scan_endpoints.items()
            },
            "all_endpoints": list(self.all_endpoints),
            "json_responses": {
                url: responses for url, responses in self.json_responses.items()
            },
        }
        return report


def analyze_log_file(log_file: str) -> Dict[str, Any]:
    """Analyze a single log file using mitmdump."""
    print(f"Analyzing {log_file}...")

    # Create a temporary script for this analysis
    temp_script = f"/tmp/analyze_{Path(log_file).stem}.py"

    script_content = """#!/usr/bin/env python3
import json
import sys
from pathlib import Path

# Add the project root to the path
project_root = Path(__file__).parent.parent
sys.path.insert(0, str(project_root))

from tools.analyze_shop_scan_endpoints import ShopScanAnalyzer

analyzer = ShopScanAnalyzer()

def load(loader):
    loader.add_option("flow_detail", int, 0, "")
    
def request(flow):
    analyzer.request(flow)
    
def response(flow):
    analyzer.response(flow)
    
def done():
    report = analyzer.generate_report()
    with open("/tmp/analysis_result.json", "w") as f:
        json.dump(report, f, indent=2, default=str)
    print("Analysis complete. Results saved to /tmp/analysis_result.json")
"""

    with open(temp_script, "w") as f:
        f.write(script_content)

    # Run the analysis in offline mode without starting proxy servers
    os.system(
        f"mitmdump -s {temp_script} --set flow_detail=0 --mode offline --no-ssl-insecure {log_file}"
    )

    # Read results
    try:
        with open("/tmp/analysis_result.json", "r") as f:
            results = json.load(f)
        os.remove("/tmp/analysis_result.json")
        os.remove(temp_script)
        return results
    except FileNotFoundError:
        print(f"Failed to analyze {log_file}")
        return {}


def main():
    """Main analysis function."""
    print("🔍 Comprehensive Shop & Scan Endpoint Analysis")
    print("=" * 60)

    # Find all log files
    log_files = list(Path(".").glob("*.log"))
    print(f"Found {len(log_files)} log files to analyze")

    all_results = {}

    for log_file in log_files:
        print(f"\n📁 Analyzing {log_file.name}...")
        results = analyze_log_file(str(log_file))
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
        },
        "endpoint_analysis": {},
        "json_response_analysis": {},
        "implementation_gaps": [],
    }

    # Aggregate results
    for log_name, results in all_results.items():
        if "summary" in results:
            comprehensive_report["analysis_summary"]["total_unique_endpoints"].update(
                results.get("all_endpoints", [])
            )
            comprehensive_report["analysis_summary"]["total_shop_endpoints"].update(
                results.get("shop_endpoints", {}).keys()
            )
            comprehensive_report["analysis_summary"]["total_scan_endpoints"].update(
                results.get("scan_endpoints", {}).keys()
            )
            comprehensive_report["analysis_summary"]["all_methods"].update(
                results.get("methods_found", [])
            )
            comprehensive_report["analysis_summary"]["total_status_codes"].update(
                results.get("status_codes_found", [])
            )

        comprehensive_report["endpoint_analysis"][log_name] = results

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
    with open("shop_scan_analysis_comprehensive.json", "w") as f:
        json.dump(comprehensive_report, f, indent=2, default=str)

    print("\n✅ Analysis complete!")
    print("📄 Comprehensive report saved to: shop_scan_analysis_comprehensive.json")
    print(
        f"🔍 Found {len(comprehensive_report['analysis_summary']['total_unique_endpoints'])} unique endpoints"
    )
    print(
        f"🏪 Found {len(comprehensive_report['analysis_summary']['total_shop_endpoints'])} shop-related endpoints"
    )
    print(
        f"📱 Found {len(comprehensive_report['analysis_summary']['total_scan_endpoints'])} scan-related endpoints"
    )

    return comprehensive_report


if __name__ == "__main__":
    main()
