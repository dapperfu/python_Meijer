#!/usr/bin/env python3
"""
Analyze Login Headers from Meijer Authentication Flows

This tool extracts and analyzes headers from login events in mitmproxy logs,
focusing on authentication flows and successful login patterns.
"""

import json
import re
import time
from collections import defaultdict
from pathlib import Path
from typing import Any, Dict, List


class LoginHeaderAnalyzer:
    """Analyze headers from login events in mitmproxy logs."""

    def __init__(self, log_file: Path):
        self.log_file = log_file
        self.login_events = []
        self.header_patterns = {}
        self.successful_logins = []

        # Authentication-related endpoints to look for
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

        # Headers that are particularly important for authentication
        self.important_headers = [
            "authorization",
            "cookie",
            "user-agent",
            "accept",
            "accept-language",
            "accept-encoding",
            "content-type",
            "origin",
            "referer",
            "x-requested-with",
            "x-csrf-token",
            "x-xsrf-token",
            "sec-fetch-dest",
            "sec-fetch-mode",
            "sec-fetch-site",
            "sec-fetch-user",
            "sec-ch-ua",
            "sec-ch-ua-mobile",
            "sec-ch-ua-platform",
            "dnt",
            "upgrade-insecure-requests",
        ]

    def analyze_log(self) -> Dict[str, Any]:
        """Analyze the log file for login events and headers."""
        print(f"🔍 Analyzing login headers from {self.log_file}")
        print("=" * 60)

        try:
            with open(self.log_file, "rb") as f:
                content = f.read()

            # Try different encodings
            decoded_content = self._decode_content(content)

            # Extract all HTTP flows
            flows = self._extract_http_flows(decoded_content)

            # Analyze each flow for authentication patterns
            for flow in flows:
                self._analyze_flow(flow)

            # Generate analysis report
            report = self._generate_report()

            return report

        except Exception as e:
            print(f"❌ Error analyzing log: {e}")
            return {"error": str(e)}

    def _decode_content(self, content: bytes) -> str:
        """Decode content with fallback encodings."""
        encodings = ["utf-8", "latin-1", "cp1252"]

        for encoding in encodings:
            try:
                return content.decode(encoding, errors="ignore")
            except UnicodeDecodeError:
                continue

        # Fallback to latin-1
        return content.decode("latin-1", errors="ignore")

    def _extract_http_flows(self, content: str) -> List[Dict[str, Any]]:
        """Extract HTTP flows from the log content."""
        flows = []

        # Look for flow patterns in mitmproxy format
        # Pattern: flow start, request, response, flow end
        flow_pattern = r"(\d+):(\w+);([^}]+)"
        matches = re.finditer(flow_pattern, content)

        current_flow = {}
        for match in matches:
            flow_id = match.group(1)
            flow_type = match.group(2)
            flow_data = match.group(3)

            if flow_type == "request":
                if current_flow:
                    flows.append(current_flow)
                current_flow = {"id": flow_id, "request": {}, "response": {}}
                current_flow["request"] = self._parse_request_data(flow_data)
            elif flow_type == "response" and current_flow:
                current_flow["response"] = self._parse_response_data(flow_data)

        # Add the last flow
        if current_flow:
            flows.append(current_flow)

        return flows

    def _parse_request_data(self, data: str) -> Dict[str, Any]:
        """Parse request data from flow."""
        request = {}

        # Extract URL
        url_match = re.search(r"(\d+):([^,]+)", data)
        if url_match:
            url_len = int(url_match.group(1))
            url = url_match.group(2)[:url_len]
            request["url"] = url

        # Extract method
        method_match = re.search(r"(\d+):([A-Z]+)", data)
        if method_match:
            method_len = int(method_match.group(1))
            method = method_match.group(2)[:method_len]
            request["method"] = method

        # Extract headers
        headers = self._extract_headers_from_data(data)
        request["headers"] = headers

        # Extract content
        content_match = re.search(r"(\d+):(\{[^}]+\})", data)
        if content_match:
            content_len = int(content_match.group(1))
            content = content_match.group(2)[:content_len]
            try:
                request["content"] = json.loads(content)
            except json.JSONDecodeError:
                request["content"] = content

        return request

    def _parse_response_data(self, data: str) -> Dict[str, Any]:
        """Parse response data from flow."""
        response = {}

        # Extract status code
        status_match = re.search(r"(\d+):(\d+)", data)
        if status_match:
            status_len = int(status_match.group(1))
            status = status_match.group(2)[:status_len]
            response["status"] = int(status)

        # Extract headers
        headers = self._extract_headers_from_data(data)
        response["headers"] = headers

        # Extract content
        content_match = re.search(r"(\d+):(\{[^}]+\})", data)
        if content_match:
            content_len = int(content_match.group(1))
            content = content_match.group(2)[:content_len]
            try:
                response["content"] = json.loads(content)
            except json.JSONDecodeError:
                response["content"] = content

        return response

    def _extract_headers_from_data(self, data: str) -> Dict[str, str]:
        """Extract headers from flow data."""
        headers = {}

        # Look for header patterns: key_length:key,value_length:value
        header_pattern = r"(\d+):([^,]+),(\d+):([^,]+)"
        header_matches = re.findall(header_pattern, data)

        for key_len, key_part, value_len, value_part in header_matches:
            try:
                key_len = int(key_len)
                value_len = int(value_len)

                if len(key_part) >= key_len and len(value_part) >= value_len:
                    key = key_part[:key_len].lower()
                    value = value_part[:value_len]

                    if key and value and not key.isdigit() and not value.isdigit():
                        headers[key] = value
            except (ValueError, IndexError):
                continue

        return headers

    def _analyze_flow(self, flow: Dict[str, Any]):
        """Analyze a single HTTP flow for authentication patterns."""
        request = flow.get("request", {})
        response = flow.get("response", {})

        url = request.get("url", "")
        method = request.get("method", "")
        headers = request.get("headers", {})

        # Check if this is an authentication-related request
        if self._is_auth_request(url, method, headers):
            self._process_auth_flow(flow)

    def _is_auth_request(self, url: str, method: str, headers: Dict[str, str]) -> bool:
        """Check if a request is authentication-related."""
        # Check URL for auth endpoints
        url_lower = url.lower()
        if any(endpoint in url_lower for endpoint in self.auth_endpoints):
            return True

        # Check for auth headers
        if "authorization" in headers or "cookie" in headers:
            return True

        # Check for login-related content
        if method == "POST" and any(
            key in url_lower for key in ["login", "auth", "signin"]
        ):
            return True

        return False

    def _process_auth_flow(self, flow: Dict[str, Any]):
        """Process an authentication flow."""
        request = flow.get("request", {})
        response = flow.get("response", {})

        auth_event = {
            "url": request.get("url", ""),
            "method": request.get("method", ""),
            "request_headers": request.get("headers", {}),
            "request_content": request.get("content", ""),
            "response_status": response.get("status", 0),
            "response_headers": response.get("headers", {}),
            "response_content": response.get("content", ""),
            "timestamp": time.time(),
        }

        self.login_events.append(auth_event)

        # Check if this was a successful login
        if self._is_successful_login(response):
            self.successful_logins.append(auth_event)

    def _is_successful_login(self, response: Dict[str, Any]) -> bool:
        """Check if a response indicates successful login."""
        status = response.get("status", 0)
        content = response.get("content", "")

        # Success status codes
        if status in [200, 201, 302]:
            return True

        # Check content for success indicators
        if isinstance(content, dict):
            content_str = json.dumps(content).lower()
        else:
            content_str = str(content).lower()

        success_indicators = [
            "success",
            "authenticated",
            "logged in",
            "token",
            "access_token",
            "refresh_token",
            "authorization_code",
        ]

        return any(indicator in content_str for indicator in success_indicators)

    def _generate_report(self) -> Dict[str, Any]:
        """Generate analysis report."""
        report = {
            "total_login_events": len(self.login_events),
            "successful_logins": len(self.successful_logins),
            "header_analysis": self._analyze_headers(),
            "login_events": self.login_events[:10],  # First 10 events
            "successful_login_details": self.successful_logins[
                :5
            ],  # First 5 successful
        }

        return report

    def _analyze_headers(self) -> Dict[str, Any]:
        """Analyze header patterns across all login events."""
        header_analysis = defaultdict(list)

        for event in self.login_events:
            headers = event.get("request_headers", {})
            for header_name, header_value in headers.items():
                if header_name in self.important_headers:
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

    def print_report(self, report: Dict[str, Any]):
        """Print the analysis report."""
        print("\n📊 LOGIN HEADER ANALYSIS REPORT")
        print("=" * 60)
        print(f"Total Login Events: {report['total_login_events']}")
        print(f"Successful Logins: {report['successful_logins']}")

        print("\n🔑 HEADER ANALYSIS")
        print("-" * 40)
        for header_name, values in report["header_analysis"].items():
            print(f"\n{header_name.upper()}:")
            for value, count in values:
                print(f"  {value} (used {count} times)")

        print("\n📝 SAMPLE LOGIN EVENTS")
        print("-" * 40)
        for i, event in enumerate(report["login_events"][:3]):
            print(f"\nEvent {i + 1}:")
            print(f"  URL: {event['url']}")
            print(f"  Method: {event['method']}")
            print(f"  Status: {event['response_status']}")
            print(f"  Headers: {len(event['request_headers'])} headers")

        if report["successful_login_details"]:
            print("\n✅ SUCCESSFUL LOGIN DETAILS")
            print("-" * 40)
            for i, event in enumerate(report["successful_login_details"][:2]):
                print(f"\nSuccessful Login {i + 1}:")
                print(f"  URL: {event['url']}")
                print(f"  Method: {event['method']}")
                print(f"  Status: {event['response_status']}")
                print("  Request Headers:")
                for name, value in event["request_headers"].items():
                    if name in self.important_headers:
                        print(f"    {name}: {value}")


def main():
    """Main function to analyze login headers."""
    # Find the most recent log file
    log_files = list(Path(".").rglob("*.log"))
    if not log_files:
        print("❌ No log files found!")
        return

    # Use the most recent log file
    latest_log = sorted(log_files, key=lambda x: x.stat().st_mtime, reverse=True)[0]
    print(f"📁 Using log file: {latest_log}")

    # Analyze the log
    analyzer = LoginHeaderAnalyzer(latest_log)
    report = analyzer.analyze_log()

    # Print the report
    analyzer.print_report(report)

    # Save detailed report to JSON
    output_file = f"login_headers_analysis_{int(time.time())}.json"
    with open(output_file, "w") as f:
        json.dump(report, f, indent=2, default=str)

    print(f"\n💾 Detailed report saved to: {output_file}")


if __name__ == "__main__":
    main()
