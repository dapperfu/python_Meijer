#!/usr/bin/env python3
"""
Parse Headers from Mitmproxy Binary Logs

This tool parses the actual mitmproxy binary log format to extract
real request headers and analyze authentication flows.
"""

import json
import re
import time
from collections import defaultdict
from pathlib import Path
from typing import Any, Dict, List


class MitmproxyHeaderParser:
    """Parse headers from mitmproxy binary logs."""

    def __init__(self, log_file: Path):
        self.log_file = log_file
        self.flows = []
        self.auth_flows = []

        # Authentication endpoints to focus on
        self.auth_endpoints = [
            "oauth2",
            "idp/idx",
            "login",
            "auth",
            "signin",
            "authenticate",
            "token",
            "authorize",
        ]

    def analyze_log(self) -> Dict[str, Any]:
        """Analyze the mitmproxy log for headers."""
        print(f"🔍 Analyzing mitmproxy log: {self.log_file}")
        print("=" * 60)

        try:
            with open(self.log_file, "rb") as f:
                content = f.read()

            # Decode content
            decoded_content = content.decode("utf-8", errors="ignore")

            # Extract flows using actual mitmproxy format
            self._extract_flows(decoded_content)

            # Analyze authentication flows
            self._analyze_auth_flows()

            # Generate report
            report = self._generate_report()

            return report

        except Exception as e:
            print(f"❌ Error analyzing log: {e}")
            return {"error": str(e)}

    def _extract_flows(self, content: str):
        """Extract HTTP flows from mitmproxy content."""
        print("📡 Extracting HTTP flows...")

        # Look for flow patterns in actual mitmproxy format
        # Pattern: flow_id:type;data
        flow_pattern = r"(\d+):(\w+);([^}]+)"
        matches = re.finditer(flow_pattern, content)

        current_flow = {}
        for match in matches:
            flow_id = match.group(1)
            flow_type = match.group(2)
            flow_data = match.group(3)

            if flow_type == "request":
                if current_flow:
                    self.flows.append(current_flow)
                current_flow = {"id": flow_id, "request": {}, "response": {}}
                current_flow["request"] = self._parse_request(flow_data)
            elif flow_type == "response" and current_flow:
                current_flow["response"] = self._parse_response(flow_data)

        # Add the last flow
        if current_flow:
            self.flows.append(current_flow)

        print(f"📊 Found {len(self.flows)} HTTP flows")

    def _parse_request(self, data: str) -> Dict[str, Any]:
        """Parse request data from mitmproxy format."""
        request = {}

        # Extract URL/path - look for 4:path;length:path
        path_match = re.search(r"4:path;(\d+):([^,]+)", data)
        if path_match:
            path_len = int(path_match.group(1))
            path = path_match.group(2)[:path_len]
            request["path"] = path

        # Extract method - look for method;length:method
        method_match = re.search(r"method;(\d+):([A-Z]+)", data)
        if method_match:
            method_len = int(method_match.group(1))
            method = method_match.group(2)[:method_len]
            request["method"] = method

        # Extract headers - look for 7:headers;length:header_data
        headers = self._extract_headers_from_data(data)
        request["headers"] = headers

        # Extract content if present
        content_match = re.search(r"7:content;(\d+):(\{[^}]*\})", data)
        if content_match:
            content_len = int(content_match.group(1))
            content = content_match.group(2)[:content_len]
            try:
                request["content"] = json.loads(content)
            except json.JSONDecodeError:
                request["content"] = content

        return request

    def _parse_response(self, data: str) -> Dict[str, Any]:
        """Parse response data from mitmproxy format."""
        response = {}

        # Extract status code - look for status_code;length:status
        status_match = re.search(r"status_code;(\d+):(\d+)", data)
        if status_match:
            status_len = int(status_match.group(1))
            status = status_match.group(2)[:status_len]
            response["status"] = int(status)

        # Extract headers
        headers = self._extract_headers_from_data(data)
        response["headers"] = headers

        # Extract content if present
        content_match = re.search(r"7:content;(\d+):(\{[^}]*\})", data)
        if content_match:
            content_len = int(content_match.group(1))
            content = content_match.group(2)[:content_len]
            try:
                response["content"] = json.loads(content)
            except json.JSONDecodeError:
                response["content"] = content

        return response

    def _extract_headers_from_data(self, data: str) -> Dict[str, str]:
        """Extract headers from mitmproxy data format."""
        headers = {}

        # Look for the headers section: 7:headers;length:header_data
        headers_match = re.search(r"7:headers;(\d+):([^}]+)", data)
        if not headers_match:
            return headers

        headers_length = int(headers_match.group(1))
        headers_data = headers_match.group(2)[:headers_length]

        # Parse header format: key_length:key,value_length:value
        # Pattern: 40:4:date,29:Wed, 20 Aug 2025 22:53:59 GMT
        # This means: total_length:key_length:key,value_length:value

        # Split by commas to get header pairs
        header_parts = headers_data.split(",")

        for part in header_parts:
            # Look for pattern: key_length:key,value_length:value
            # But handle the case where there might be commas in values
            header_match = re.search(r"(\d+):([^:]+),(\d+):(.+)", part)
            if header_match:
                key_len = int(header_match.group(1))
                key = header_match.group(2)[:key_len]
                value_len = int(header_match.group(3))
                value = header_match.group(4)[:value_len]

                if key and value and not key.isdigit() and not value.isdigit():
                    headers[key.lower()] = value

        return headers

    def _analyze_auth_flows(self):
        """Analyze flows for authentication patterns."""
        print("🔐 Analyzing authentication flows...")

        for flow in self.flows:
            request = flow.get("request", {})
            path = request.get("path", "")

            # Check if this is an authentication-related request
            if any(endpoint in path.lower() for endpoint in self.auth_endpoints):
                self.auth_flows.append(flow)

        print(f"🔑 Found {len(self.auth_flows)} authentication flows")

    def _generate_report(self) -> Dict[str, Any]:
        """Generate analysis report."""
        report = {
            "total_flows": len(self.flows),
            "auth_flows": len(self.auth_flows),
            "header_analysis": self._analyze_headers(),
            "auth_flow_details": self._get_auth_flow_details(),
            "sample_flows": self.flows[:5],  # First 5 flows
        }

        return report

    def _analyze_headers(self) -> Dict[str, Any]:
        """Analyze header patterns across all flows."""
        header_analysis = defaultdict(list)

        for flow in self.flows:
            request = flow.get("request", {})
            headers = request.get("headers", {})

            for header_name, header_value in headers.items():
                header_analysis[header_name].append(header_value)

        # Get most common values for each header
        header_summary = {}
        for header_name, values in header_analysis.items():
            if values:
                # Get unique values and their counts
                value_counts = defaultdict(int)
                for value in values:
                    value_counts[value] += 1

                # Sort by frequency
                sorted_values = sorted(
                    value_counts.items(), key=lambda x: x[1], reverse=True
                )
                header_summary[header_name] = sorted_values[:3]  # Top 3 values

        return header_summary

    def _get_auth_flow_details(self) -> List[Dict[str, Any]]:
        """Get detailed information about authentication flows."""
        auth_details = []

        for flow in self.auth_flows[:10]:  # First 10 auth flows
            request = flow.get("request", {})
            response = flow.get("response", {})

            auth_detail = {
                "path": request.get("path", ""),
                "method": request.get("method", ""),
                "request_headers": request.get("headers", {}),
                "request_content": request.get("content", ""),
                "response_status": response.get("status", 0),
                "response_headers": response.get("headers", {}),
                "response_content": response.get("content", ""),
            }

            auth_details.append(auth_detail)

        return auth_details

    def print_report(self, report: Dict[str, Any]):
        """Print the analysis report."""
        print("\n📊 MITMPROXY HEADER ANALYSIS REPORT")
        print("=" * 60)
        print(f"Total HTTP Flows: {report['total_flows']}")
        print(f"Authentication Flows: {report['auth_flows']}")

        print("\n🔑 HEADER ANALYSIS")
        print("-" * 40)
        for header_name, values in report["header_analysis"].items():
            print(f"\n{header_name.upper()}:")
            for value, count in values:
                print(f"  {value} (used {count} times)")

        print("\n🔐 AUTHENTICATION FLOW DETAILS")
        print("-" * 40)
        for i, flow in enumerate(report["auth_flow_details"][:5]):
            print(f"\nAuth Flow {i+1}:")
            print(f"  Path: {flow['path']}")
            print(f"  Method: {flow['method']}")
            print(f"  Status: {flow['response_status']}")
            print(f"  Request Headers: {len(flow['request_headers'])} headers")

            # Show important headers
            important_headers = [
                "authorization",
                "user-agent",
                "accept",
                "content-type",
                "origin",
                "referer",
            ]
            for header_name in important_headers:
                if header_name in flow["request_headers"]:
                    value = flow["request_headers"][header_name]
                    print(
                        f"    {header_name}: {value[:100]}{'...' if len(value) > 100 else ''}"
                    )

        print("\n📝 SAMPLE FLOWS")
        print("-" * 40)
        for i, flow in enumerate(report["sample_flows"][:3]):
            request = flow.get("request", {})
            print(f"\nFlow {i+1}:")
            print(f"  Path: {request.get('path', 'N/A')}")
            print(f"  Method: {request.get('method', 'N/A')}")
            print(f"  Headers: {len(request.get('headers', {}))} headers")


def main():
    """Main function to analyze mitmproxy headers."""
    # Find the most recent log file
    log_files = list(Path(".").rglob("*.log"))
    if not log_files:
        print("❌ No log files found!")
        return

    # Use the most recent log file
    latest_log = sorted(log_files, key=lambda x: x.stat().st_mtime, reverse=True)[0]
    print(f"📁 Using log file: {latest_log}")

    # Analyze the log
    analyzer = MitmproxyHeaderParser(latest_log)
    report = analyzer.analyze_log()

    # Print the report
    analyzer.print_report(report)

    # Save detailed report to JSON
    output_file = f"mitmproxy_headers_parsed_{int(time.time())}.json"
    with open(output_file, "w") as f:
        json.dump(report, f, indent=2, default=str)

    print(f"\n💾 Detailed report saved to: {output_file}")


if __name__ == "__main__":
    main()
