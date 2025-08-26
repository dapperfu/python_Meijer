#!/usr/bin/env python3
"""
Proper Shop & Scan Endpoint Extractor using Mitmdump

This script uses mitmdump's Python API to properly extract shop and scan
endpoints from mitmproxy log files.
"""

import json
import subprocess
from pathlib import Path
from typing import Dict, Any


def create_mitmdump_script() -> str:
    """Create a temporary mitmdump script for extracting shop and scan endpoints."""
    script_content = '''#!/usr/bin/env python3
"""
Mitmdump script to extract shop and scan endpoints.
"""

import json
import sys
from mitmproxy import http
from mitmproxy import ctx

class ShopScanExtractor:
    def __init__(self):
        self.shop_scan_endpoints = defaultdict(list)
        self.all_endpoints = set()
        self.methods = set()
        self.status_codes = set()
        
    def request(self, flow: http.HTTPFlow) -> None:
        """Process each request."""
        url = flow.request.pretty_url
        method = flow.request.method
        
        # Check if this is a shop or scan related endpoint
        if self._is_shop_scan_endpoint(url):
            endpoint_info = {
                'method': method,
                'url': url,
                'headers': dict(flow.request.headers),
                'query_params': dict(flow.request.query),
                'timestamp': getattr(flow, 'timestamp_start', None)
            }
            
            self.shop_scan_endpoints[url].append(endpoint_info)
            self.all_endpoints.add(url)
            self.methods.add(method)
            
    def response(self, flow: http.HTTPFlow) -> None:
        """Process each response."""
        url = flow.request.pretty_url
        status_code = flow.response.status_code
        self.status_codes.add(status_code)
        
        if self._is_shop_scan_endpoint(url) and status_code == 200:
            try:
                # Try to parse JSON response
                content_type = flow.response.headers.get('content-type', '')
                if 'application/json' in content_type:
                    response_data = json.loads(flow.response.content.decode('utf-8'))
                    
                    # Find the corresponding request info
                    for endpoint_info in self.shop_scan_endpoints.get(url, []):
                        if endpoint_info['method'] == flow.request.method:
                            endpoint_info['response_data'] = response_data
                            endpoint_info['status_code'] = status_code
                            break
                            
            except (json.JSONDecodeError, UnicodeDecodeError):
                pass
                
    def _is_shop_scan_endpoint(self, url: str) -> bool:
        """Check if URL is related to shop or scan functionality."""
        url_lower = url.lower()
        shop_keywords = [
            'shop', 'store', 'cart', 'item', 'product', 'barcode', 'upc',
            'fulfillment', 'reservation', 'order', 'checkout', 'payment',
            'inventory', 'catalog', 'search', 'category', 'department'
        ]
        scan_keywords = [
            'scan', 'barcode', 'upc', 'qr', 'camera', 'shopnscan',
            'image', 'photo', 'recognition', 'ocr'
        ]
        
        # Check for shop-related endpoints
        if any(keyword in url_lower for keyword in shop_keywords):
            return True
            
        # Check for scan-related endpoints
        if any(keyword in url_lower for keyword in scan_keywords):
            return True
            
        # Check for Meijer-specific endpoints
        if 'meijer.com' in url_lower and any(keyword in url_lower for keyword in shop_keywords + scan_keywords):
            return True
            
        return False
        
    def done(self) -> None:
        """Called when all flows have been processed."""
        # Save results to a temporary file
        results = {
            'summary': {
                'total_shop_scan_endpoints': len(self.shop_scan_endpoints),
                'total_unique_endpoints': len(self.all_endpoints),
                'methods_found': list(self.methods),
                'status_codes_found': list(self.status_codes)
            },
            'shop_scan_endpoints': {
                url: endpoints for url, endpoints in self.shop_scan_endpoints.items()
            }
        }
        
        with open('/tmp/shop_scan_results.json', 'w') as f:
            json.dump(results, f, indent=2, default=str)
        
        print(f"Analysis complete. Found {len(self.all_endpoints)} shop/scan endpoints.")

# Create extractor instance
extractor = ShopScanExtractor()

def request(flow):
    extractor.request(flow)
    
def response(flow):
    extractor.response(flow)
    
def done():
    extractor.done()
'''
    return script_content


def analyze_log_file(log_file: str) -> Dict[str, Any]:
    """Analyze a single log file using mitmdump."""
    print(f"🔍 Analyzing {log_file}...")

    # Create temporary script
    temp_script = "/tmp/shop_scan_extractor.py"
    script_content = create_mitmdump_script()

    with open(temp_script, "w") as f:
        f.write(script_content)

    try:
        # Run mitmdump with the script
        cmd = f"venv/bin/mitmdump -q -s {temp_script} -- {log_file}"
        result = subprocess.run(cmd, shell=True, capture_output=True, text=True)

        if result.returncode != 0:
            print(f"   ❌ Error running mitmdump: {result.stderr}")
            return {}

        # Read results from temporary file
        try:
            with open("/tmp/shop_scan_results.json", "r") as f:
                results = json.load(f)
            results["log_file"] = log_file
            return results
        except FileNotFoundError:
            print("   ❌ No results file generated")
            return {}

    except Exception as e:
        print(f"   ❌ Error: {e}")
        return {}
    finally:
        # Clean up
        Path(temp_script).unlink(missing_ok=True)
        Path("/tmp/shop_scan_results.json").unlink(missing_ok=True)


def main():
    """Main function to extract shop and scan endpoints."""
    print("🛒 Proper Shop & Scan Endpoint Extractor")
    print("=" * 50)

    # Find all log files
    log_files = list(Path(".").glob("*.log"))
    print(f"Found {len(log_files)} log files to analyze")

    all_results = {}

    for log_file in log_files:
        print(f"\n📁 Analyzing {log_file.name}...")
        results = analyze_log_file(str(log_file))
        if results:
            all_results[log_file.name] = results
            print(
                f"   ✅ Found {results.get('summary', {}).get('total_unique_endpoints', 0)} endpoints"
            )
        else:
            print("   ❌ Failed to analyze")

    # Generate comprehensive report
    print("\n📊 Generating comprehensive report...")

    comprehensive_report = {
        "analysis_summary": {
            "total_log_files": len(log_files),
            "successfully_analyzed": len(all_results),
            "total_unique_endpoints": set(),
            "total_shop_scan_endpoints": 0,
            "all_methods": set(),
            "all_status_codes": set(),
        },
        "endpoint_analysis": {},
        "implementation_gaps": [],
    }

    # Aggregate results
    for log_name, results in all_results.items():
        comprehensive_report["endpoint_analysis"][log_name] = results

        if "summary" in results:
            comprehensive_report["analysis_summary"]["total_unique_endpoints"].update(
                results.get("shop_scan_endpoints", {}).keys()
            )
            comprehensive_report["analysis_summary"]["total_shop_scan_endpoints"] += (
                results.get("summary", {}).get("total_shop_scan_endpoints", 0)
            )
            comprehensive_report["analysis_summary"]["all_methods"].update(
                results.get("summary", {}).get("methods_found", [])
            )
            comprehensive_report["analysis_summary"]["all_status_codes"].update(
                results.get("summary", {}).get("status_codes_found", [])
            )

    # Convert sets to lists for JSON serialization
    for key in ["total_unique_endpoints", "all_methods", "all_status_codes"]:
        comprehensive_report["analysis_summary"][key] = list(
            comprehensive_report["analysis_summary"][key]
        )

    # Save comprehensive report
    with open("proper_shop_scan_analysis.json", "w") as f:
        json.dump(comprehensive_report, f, indent=2, default=str)

    print("\n✅ Analysis complete!")
    print("📄 Comprehensive report saved to: proper_shop_scan_analysis.json")
    print(
        f"🔍 Found {len(comprehensive_report['analysis_summary']['total_unique_endpoints'])} unique endpoints"
    )
    print(
        f"🏪 Found {comprehensive_report['analysis_summary']['total_shop_scan_endpoints']} total shop/scan endpoint calls"
    )

    return comprehensive_report


if __name__ == "__main__":
    main()
