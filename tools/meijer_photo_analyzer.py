#!/usr/bin/env python3
"""
Meijer Photo Endpoint Analyzer

This tool specifically analyzes all mitmproxy log files for meijerphoto.com
URL endpoints and related functionality.
"""

import json
import os
import re
from collections import Counter, defaultdict
from datetime import datetime
from typing import Any, Dict, List
from urllib.parse import parse_qs, urlparse

from mitmproxy import io
from mitmproxy.http import HTTPFlow


class MeijerPhotoAnalyzer:
    """Specialized analyzer for meijerphoto.com endpoints."""

    def __init__(self):
        self.photo_endpoints = defaultdict(
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
                "host": None,
            }
        )

        self.photo_hosts = set()
        self.photo_content_types = set()
        self.photo_auth_patterns = set()

    def analyze_log_file(self, log_file_path: str) -> Dict[str, Any]:
        """Analyze a single mitmproxy log file for photo endpoints."""
        print(f"🔍 Analyzing for photo endpoints: {log_file_path}")

        if not os.path.exists(log_file_path):
            print(f"  ❌ File not found: {log_file_path}")
            return {}

        try:
            with open(log_file_path, "rb") as f:
                flows = io.FlowReader(f).stream()

                for flow in flows:
                    if isinstance(flow, HTTPFlow):
                        self._analyze_flow_for_photos(flow, log_file_path)

        except Exception as e:
            print(f"  ❌ Error reading {log_file_path}: {e}")
            return {}

        print(f"  ✅ Completed photo analysis of {log_file_path}")
        return {}

    def _analyze_flow_for_photos(self, flow: HTTPFlow, source_file: str):
        """Analyze a single HTTP flow for photo-related content."""
        try:
            # Extract basic request info
            url = flow.request.pretty_url
            method = flow.request.method
            host = flow.request.pretty_host
            path = flow.request.path
            status_code = flow.response.status_code if flow.response else None

            # Check if this is photo-related
            if not self._is_photo_related(url, host, path):
                return

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

            self.photo_endpoints[endpoint_key]["methods"].add(method)
            self.photo_endpoints[endpoint_key]["status_codes"].add(status_code)
            self.photo_endpoints[endpoint_key]["content_types"].add(content_type)
            self.photo_endpoints[endpoint_key]["sample_urls"].add(url)
            self.photo_endpoints[endpoint_key]["host"] = host

            # Store headers
            for header_name, header_value in headers.items():
                self.photo_endpoints[endpoint_key]["headers"][header_name.lower()].add(
                    header_value
                )

            # Store query parameters
            for param_name, param_values in query_params.items():
                self.photo_endpoints[endpoint_key]["query_params"][param_name].update(
                    param_values
                )

            # Store sample request/response bodies (limit to avoid memory issues)
            if (
                request_body
                and len(self.photo_endpoints[endpoint_key]["request_bodies"]) < 3
            ):
                self.photo_endpoints[endpoint_key]["request_bodies"].append(
                    {
                        "content_type": content_type,
                        "body": request_body,
                        "source": source_file,
                    }
                )

            if (
                response_body
                and len(self.photo_endpoints[endpoint_key]["response_bodies"]) < 3
            ):
                self.photo_endpoints[endpoint_key]["response_bodies"].append(
                    {
                        "content_type": flow.response.headers.get("content-type", ""),
                        "body": response_body,
                        "source": source_file,
                    }
                )

            # Track photo-specific patterns
            self.photo_hosts.add(host)

            if content_type:
                self.photo_content_types.add(content_type)
            if accept:
                self.photo_content_types.add(accept)
            if flow.response:
                response_content_type = flow.response.headers.get("content-type", "")
                if response_content_type:
                    self.photo_content_types.add(response_content_type)

            # Track authentication patterns for photo services
            if "authorization" in headers:
                auth_header = headers["authorization"]
                if auth_header.startswith("Bearer "):
                    self.photo_auth_patterns.add("Bearer Token")
                else:
                    self.photo_auth_patterns.add("Other Auth")

            if "ocp-apim-subscription-key" in headers:
                self.photo_auth_patterns.add("Subscription Key")

            # Update last seen timestamp
            self.photo_endpoints[endpoint_key]["last_seen"] = datetime.now().isoformat()

        except Exception as e:
            print(f"  ⚠️ Error analyzing photo flow: {e}")

    def _is_photo_related(self, url: str, host: str, path: str) -> bool:
        """Determine if a request is photo-related."""
        # Check for meijerphoto.com
        if "meijerphoto.com" in url or "meijerphoto.com" in host:
            return True

        # Check for photo-related paths
        photo_patterns = [
            r"/photo",
            r"/image",
            r"/print",
            r"/upload",
            r"/gallery",
            r"/album",
            r"/picture",
            r"/snapshot",
            r"/capture",
            r"/photobook",
            r"/canvas",
            r"/poster",
            r"/calendar",
            r"/card",
            r"/enlargement",
            r"/retouching",
            r"/editing",
            r"/filter",
            r"/effect",
            r"/enhancement",
        ]

        for pattern in photo_patterns:
            if re.search(pattern, path.lower()):
                return True

        # Check for photo-related file extensions
        photo_extensions = [
            ".jpg",
            ".jpeg",
            ".png",
            ".gif",
            ".bmp",
            ".tiff",
            ".webp",
            ".raw",
            ".cr2",
            ".nef",
            ".arw",
            ".dng",
            ".psd",
            ".ai",
        ]

        for ext in photo_extensions:
            if ext in path.lower():
                return True

        # Check for photo-related query parameters
        photo_params = ["photo", "image", "print", "upload", "gallery", "album"]
        if any(param in url.lower() for param in photo_params):
            return True

        return False

    def generate_photo_report(self) -> Dict[str, Any]:
        """Generate comprehensive photo endpoint report."""
        report = {
            "summary": {
                "total_photo_endpoints": len(self.photo_endpoints),
                "total_photo_hosts": len(self.photo_hosts),
                "analysis_timestamp": datetime.now().isoformat(),
                "endpoints_by_method": Counter(),
                "endpoints_by_host": defaultdict(int),
                "status_code_distribution": Counter(),
                "content_type_distribution": Counter(),
                "auth_patterns": list(self.photo_auth_patterns),
            },
            "photo_endpoints": {},
            "photo_hosts": list(self.photo_hosts),
            "photo_content_types": list(self.photo_content_types),
            "photo_categories": self._categorize_photo_endpoints(),
            "recommendations": [],
        }

        # Process endpoints
        for endpoint, data in self.photo_endpoints.items():
            report["photo_endpoints"][endpoint] = {
                "methods": list(data["methods"]),
                "headers": {k: list(v) for k, v in data["headers"].items()},
                "query_params": {k: list(v) for k, v in data["query_params"].items()},
                "request_bodies": data["request_bodies"],
                "response_bodies": data["response_bodies"],
                "status_codes": list(data["status_codes"]),
                "content_types": list(data["content_types"]),
                "sample_urls": list(data["sample_urls"]),
                "last_seen": data["last_seen"],
                "host": data["host"],
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

            if data["host"]:
                report["summary"]["endpoints_by_host"][data["host"]] += 1

        # Generate recommendations
        report["recommendations"] = self._generate_photo_recommendations()

        return report

    def _categorize_photo_endpoints(self) -> Dict[str, List[str]]:
        """Categorize photo endpoints by functionality."""
        categories = {
            "Photo Upload": [],
            "Photo Storage": [],
            "Photo Printing": [],
            "Photo Editing": [],
            "Photo Sharing": [],
            "Photo Products": [],
            "Photo Management": [],
            "Other Photo": [],
        }

        for endpoint in self.photo_endpoints.keys():
            path = endpoint.split(" ", 1)[1] if " " in endpoint else endpoint

            if any(x in path.lower() for x in ["/upload", "/post", "/create"]):
                categories["Photo Upload"].append(endpoint)
            elif any(x in path.lower() for x in ["/store", "/save", "/backup"]):
                categories["Photo Storage"].append(endpoint)
            elif any(x in path.lower() for x in ["/print", "/order", "/purchase"]):
                categories["Photo Printing"].append(endpoint)
            elif any(x in path.lower() for x in ["/edit", "/filter", "/enhance"]):
                categories["Photo Editing"].append(endpoint)
            elif any(x in path.lower() for x in ["/share", "/send", "/email"]):
                categories["Photo Sharing"].append(endpoint)
            elif any(x in path.lower() for x in ["/product", "/item", "/service"]):
                categories["Photo Products"].append(endpoint)
            elif any(x in path.lower() for x in ["/manage", "/organize", "/album"]):
                categories["Photo Management"].append(endpoint)
            else:
                categories["Other Photo"].append(endpoint)

        return categories

    def _generate_photo_recommendations(self) -> List[str]:
        """Generate recommendations based on photo endpoint analysis."""
        recommendations = []

        if self.photo_endpoints:
            recommendations.append(
                f"Found {len(self.photo_endpoints)} photo-related endpoints - implement photo service integration"
            )

        if "meijerphoto.com" in self.photo_hosts:
            recommendations.append(
                "meijerphoto.com endpoints discovered - implement dedicated photo service client"
            )

        if any("image/" in ct for ct in self.photo_content_types):
            recommendations.append(
                "Image content types found - implement image processing and handling"
            )

        if any("multipart/" in ct for ct in self.photo_content_types):
            recommendations.append(
                "Multipart content types found - implement file upload functionality"
            )

        if self.photo_auth_patterns:
            recommendations.append(
                f"Photo service authentication patterns: {', '.join(self.photo_auth_patterns)}"
            )

        return recommendations

    def save_photo_report(self, report: Dict[str, Any], output_file: str):
        """Save the photo endpoint report to a file."""
        try:
            with open(output_file, "w") as f:
                json.dump(report, f, indent=2, default=str)
            print(f"✅ Photo report saved to: {output_file}")
        except Exception as e:
            print(f"❌ Error saving photo report: {e}")


def main():
    """Main function to analyze all log files for photo endpoints."""
    print("📸 Meijer Photo Endpoint Analyzer")
    print("=" * 40)

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
    analyzer = MeijerPhotoAnalyzer()

    # Analyze each log file
    print(f"\n📁 Found {len(log_files)} log files to analyze for photo endpoints:")
    for log_file in log_files:
        print(f"  - {log_file}")

    print("\n🚀 Starting photo endpoint analysis...")
    for log_file in log_files:
        analyzer.analyze_log_file(log_file)

    # Generate comprehensive report
    print("\n📊 Generating photo endpoint report...")
    report = analyzer.generate_photo_report()

    # Display summary
    print("\n📈 Photo Endpoint Analysis Summary:")
    print(
        f"  Total photo endpoints discovered: {report['summary']['total_photo_endpoints']}"
    )
    print(f"  Total photo hosts: {report['summary']['total_photo_hosts']}")
    print(f"  Endpoints by method: {dict(report['summary']['endpoints_by_method'])}")
    print(f"  Photo hosts: {report['summary']['endpoints_by_host']}")
    print(f"  Auth patterns: {report['summary']['auth_patterns']}")

    # Display categories
    print("\n📂 Photo Endpoints by Category:")
    for category, endpoints in report["photo_categories"].items():
        if endpoints:
            print(f"  {category}: {len(endpoints)} endpoints")

    # Save detailed report
    output_file = "meijer_photo_endpoints_report.json"
    analyzer.save_photo_report(report, output_file)

    # Display key findings
    print("\n🔑 Key Photo Service Findings:")
    for recommendation in report["recommendations"]:
        print(f"  • {recommendation}")

    print("\n✅ Photo endpoint analysis complete!")
    print(f"📄 Detailed report saved to: {output_file}")


if __name__ == "__main__":
    main()
