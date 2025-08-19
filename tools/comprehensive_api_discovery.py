#!/usr/bin/env python3
"""
Comprehensive Meijer API Discovery Tool

This tool analyzes ALL mitmproxy log files to discover every possible API endpoint,
HTTP method, header pattern, and request/response structure that exists in the Meijer app.

The goal is to ensure 100% API coverage by finding every endpoint that was ever called.
"""

import json
import os
from collections import Counter, defaultdict
from datetime import datetime
from typing import Any, Dict, List
from urllib.parse import parse_qs, urlparse

from mitmproxy import io
from mitmproxy.http import HTTPFlow


class ComprehensiveAPIDiscovery:
    """Comprehensive API endpoint discovery from all log files."""

    def __init__(self):
        self.endpoints = defaultdict(
            lambda: {
                "methods": set(),
                "headers": defaultdict(set),
                "query_params": defaultdict(set),
                "request_bodies": [],
                "response_bodies": [],
                "status_codes": set(),
                "content_types": set(),
                "sample_urls": set(),
                "last_seen": None,
            }
        )

        self.hosts = defaultdict(set)
        self.auth_patterns = defaultdict(set)
        self.content_type_patterns = defaultdict(set)
        self.error_patterns = defaultdict(set)

    def analyze_log_file(self, log_file_path: str) -> Dict[str, Any]:
        """Analyze a single mitmproxy log file."""
        print(f"Analyzing: {log_file_path}")

        if not os.path.exists(log_file_path):
            print(f"  ❌ File not found: {log_file_path}")
            return {}

        try:
            with open(log_file_path, "rb") as f:
                flows = io.FlowReader(f).stream()

                for flow in flows:
                    if isinstance(flow, HTTPFlow):
                        self._analyze_flow(flow, log_file_path)

        except Exception as e:
            print(f"  ❌ Error reading {log_file_path}: {e}")
            return {}

        print(f"  ✅ Completed analysis of {log_file_path}")
        return {}

    def _analyze_flow(self, flow: HTTPFlow, source_file: str):
        """Analyze a single HTTP flow."""
        try:
            # Extract basic request info
            url = flow.request.pretty_url
            method = flow.request.method
            host = flow.request.pretty_host
            path = flow.request.path
            status_code = flow.response.status_code if flow.response else None

            # Parse URL components
            parsed_url = urlparse(url)
            base_path = parsed_url.path
            query_params = parse_qs(parsed_url.query)

            # Extract headers
            headers = dict(flow.request.headers)

            # Extract content types
            content_type = headers.get("content-type", "")
            accept = headers.get("accept", "")

            # Extract request body
            request_body = None
            if flow.request.content:
                try:
                    if "json" in content_type:
                        request_body = json.loads(flow.request.content.decode("utf-8"))
                    else:
                        request_body = flow.request.content.decode(
                            "utf-8", errors="ignore"
                        )
                except:
                    request_body = str(flow.request.content)

            # Extract response body
            response_body = None
            if flow.response and flow.response.content:
                try:
                    if "json" in flow.response.headers.get("content-type", ""):
                        response_body = json.loads(
                            flow.response.content.decode("utf-8")
                        )
                    else:
                        response_body = flow.response.content.decode(
                            "utf-8", errors="ignore"
                        )
                except:
                    response_body = str(flow.response.content)

            # Store endpoint information
            endpoint_key = f"{method} {base_path}"

            self.endpoints[endpoint_key]["methods"].add(method)
            self.endpoints[endpoint_key]["status_codes"].add(status_code)
            self.endpoints[endpoint_key]["content_types"].add(content_type)
            self.endpoints[endpoint_key]["sample_urls"].add(url)

            # Store headers
            for header_name, header_value in headers.items():
                self.endpoints[endpoint_key]["headers"][header_name.lower()].add(
                    header_value
                )

            # Store query parameters
            for param_name, param_values in query_params.items():
                self.endpoints[endpoint_key]["query_params"][param_name].update(
                    param_values
                )

            # Store sample request/response bodies (limit to avoid memory issues)
            if request_body and len(self.endpoints[endpoint_key]["request_bodies"]) < 3:
                self.endpoints[endpoint_key]["request_bodies"].append(
                    {
                        "content_type": content_type,
                        "body": request_body,
                        "source": source_file,
                    }
                )

            if (
                response_body
                and len(self.endpoints[endpoint_key]["response_bodies"]) < 3
            ):
                self.endpoints[endpoint_key]["response_bodies"].append(
                    {
                        "content_type": flow.response.headers.get("content-type", ""),
                        "body": response_body,
                        "source": source_file,
                    }
                )

            # Track hosts
            self.hosts[host].add(base_path)

            # Track authentication patterns
            if "authorization" in headers:
                auth_header = headers["authorization"]
                if auth_header.startswith("Bearer "):
                    self.auth_patterns["bearer_tokens"].add(auth_header[:50] + "...")
                else:
                    self.auth_patterns["other_auth"].add(auth_header[:50] + "...")

            if "ocp-apim-subscription-key" in headers:
                self.auth_patterns["subscription_keys"].add(
                    headers["ocp-apim-subscription-key"]
                )

            # Track content type patterns
            if content_type:
                self.content_type_patterns["request_content_types"].add(content_type)
            if accept:
                self.content_type_patterns["accept_headers"].add(accept)
            if flow.response:
                response_content_type = flow.response.headers.get("content-type", "")
                if response_content_type:
                    self.content_type_patterns["response_content_types"].add(
                        response_content_type
                    )

            # Track error patterns
            if status_code and status_code >= 400:
                self.error_patterns[f"{status_code}_errors"].add(
                    f"{method} {base_path}"
                )

            # Update last seen timestamp
            self.endpoints[endpoint_key]["last_seen"] = datetime.now().isoformat()

        except Exception as e:
            print(f"  ⚠️ Error analyzing flow: {e}")

    def generate_report(self) -> Dict[str, Any]:
        """Generate comprehensive API discovery report."""
        report = {
            "summary": {
                "total_endpoints": len(self.endpoints),
                "total_hosts": len(self.hosts),
                "analysis_timestamp": datetime.now().isoformat(),
                "endpoints_by_method": Counter(),
                "endpoints_by_host": defaultdict(int),
                "status_code_distribution": Counter(),
                "content_type_distribution": Counter(),
            },
            "endpoints": {},
            "hosts": {},
            "auth_patterns": {},
            "content_type_patterns": {},
            "error_patterns": {},
            "recommendations": [],
        }

        # Process endpoints
        for endpoint, data in self.endpoints.items():
            report["endpoints"][endpoint] = {
                "methods": list(data["methods"]),
                "headers": {k: list(v) for k, v in data["headers"].items()},
                "query_params": {k: list(v) for k, v in data["query_params"].items()},
                "request_bodies": data["request_bodies"],
                "response_bodies": data["response_bodies"],
                "status_codes": list(data["status_codes"]),
                "content_types": list(data["content_types"]),
                "sample_urls": list(data["sample_urls"]),
                "last_seen": data["last_seen"],
            }

            # Update counters
            for method in data["methods"]:
                report["summary"]["endpoints_by_method"][method] += 1

            for status in data["status_codes"]:
                if status:
                    report["summary"]["status_code_distribution"][status] += 1

            for content_type in data["content_types"]:
                if content_type:
                    report["summary"]["content_type_distribution"][content_type] += 1

        # Process hosts
        for host, paths in self.hosts.items():
            report["hosts"][host] = {"paths": list(paths), "path_count": len(paths)}
            report["summary"]["endpoints_by_host"][host] = len(paths)

        # Process patterns
        report["auth_patterns"] = {k: list(v) for k, v in self.auth_patterns.items()}
        report["content_type_patterns"] = {
            k: list(v) for k, v in self.content_type_patterns.items()
        }
        report["error_patterns"] = {k: list(v) for k, v in self.error_patterns.items()}

        # Generate recommendations
        report["recommendations"] = self._generate_recommendations()

        return report

    def _generate_recommendations(self) -> List[str]:
        """Generate recommendations based on discovered patterns."""
        recommendations = []

        # Authentication recommendations
        if self.auth_patterns["bearer_tokens"]:
            recommendations.append(
                "Bearer token authentication is supported and should be prioritized"
            )
        if self.auth_patterns["subscription_keys"]:
            recommendations.append(
                "Subscription key authentication is available as fallback"
            )

        # Content type recommendations
        json_endpoints = [
            ep
            for ep, data in self.endpoints.items()
            if any("json" in ct.lower() for ct in data["content_types"])
        ]
        if json_endpoints:
            recommendations.append(
                f"JSON endpoints found: {len(json_endpoints)} - ensure proper JSON handling"
            )

        # Error handling recommendations
        error_endpoints = [
            ep
            for ep, data in self.endpoints.items()
            if any(status and status >= 400 for status in data["status_codes"])
        ]
        if error_endpoints:
            recommendations.append(
                f"Error responses found: {len(error_endpoints)} - implement proper error handling"
            )

        # Host recommendations
        if len(self.hosts) > 1:
            recommendations.append(
                f"Multiple API hosts detected: {list(self.hosts.keys())} - ensure proper host routing"
            )

        return recommendations

    def save_report(self, report: Dict[str, Any], output_file: str):
        """Save the comprehensive report to a file."""
        try:
            with open(output_file, "w") as f:
                json.dump(report, f, indent=2, default=str)
            print(f"✅ Report saved to: {output_file}")
        except Exception as e:
            print(f"❌ Error saving report: {e}")


def main():
    """Main function to analyze all log files."""
    print("🔍 Comprehensive Meijer API Discovery Tool")
    print("=" * 50)

    # Find all log files
    log_files = [
        "./meijer_mitm_20250817_171338.log",
        "./meijer_mitm_20250817_174652.log",
        "./meijer_mitm_20250817_155550.log",
        "./outfile.log",
        "./meijer_mitm_20250817_174257.log",
        "./meijer_mitm.log",
    ]

    # Initialize analyzer
    analyzer = ComprehensiveAPIDiscovery()

    # Analyze each log file
    print(f"\n📁 Found {len(log_files)} log files to analyze:")
    for log_file in log_files:
        print(f"  - {log_file}")

    print("\n🚀 Starting comprehensive analysis...")
    for log_file in log_files:
        analyzer.analyze_log_file(log_file)

    # Generate comprehensive report
    print("\n📊 Generating comprehensive API discovery report...")
    report = analyzer.generate_report()

    # Display summary
    print("\n📈 Analysis Summary:")
    print(f"  Total endpoints discovered: {report['summary']['total_endpoints']}")
    print(f"  Total hosts: {report['summary']['total_hosts']}")
    print(f"  Endpoints by method: {dict(report['summary']['endpoints_by_method'])}")
    print(f"  Hosts: {list(report['summary']['endpoints_by_host'].keys())}")

    # Save detailed report
    output_file = "comprehensive_api_discovery_report.json"
    analyzer.save_report(report, output_file)

    # Display key findings
    print("\n🔑 Key Findings:")
    for recommendation in report["recommendations"]:
        print(f"  • {recommendation}")

    print("\n✅ Comprehensive API discovery complete!")
    print(f"📄 Detailed report saved to: {output_file}")


if __name__ == "__main__":
    main()
