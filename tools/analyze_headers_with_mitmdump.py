#!/usr/bin/env python3
"""
Analyze Headers using Mitmdump Python API

This script uses mitmdump's Python API to read the log file and analyze
headers from authentication flows.
"""

import json
import sys
from collections import defaultdict

from mitmproxy import http, options
from mitmproxy.tools.dump import DumpMaster


class HeaderAnalyzer:
    """Analyze headers from HTTP flows."""

    def __init__(self):
        self.flows = []
        self.auth_flows = []
        self.header_stats = defaultdict(list)

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

    def request(self, flow: http.HTTPFlow) -> None:
        """Process each request."""
        # Store the flow
        self.flows.append(flow)

        # Check if this is an authentication-related request
        if self._is_auth_request(flow):
            self.auth_flows.append(flow)
            self._analyze_headers(flow)

    def _is_auth_request(self, flow: http.HTTPFlow) -> bool:
        """Check if a request is authentication-related."""
        url = flow.request.pretty_url.lower()

        # Check URL for auth endpoints
        if any(endpoint in url for endpoint in self.auth_endpoints):
            return True

        # Check for auth headers
        if "authorization" in flow.request.headers or "cookie" in flow.request.headers:
            return True

        # Check for login-related content
        if flow.request.method == "POST" and any(
            key in url for key in ["login", "auth", "signin"]
        ):
            return True

        return False

    def _analyze_headers(self, flow: http.HTTPFlow) -> None:
        """Analyze headers from a flow."""
        headers = flow.request.headers

        for header_name, header_value in headers.items():
            self.header_stats[header_name.lower()].append(header_value)

    def done(self) -> None:
        """Called when all flows have been processed."""
        self._print_report()
        self._save_report()

    def _print_report(self) -> None:
        """Print the analysis report."""
        print("\n📊 HEADER ANALYSIS REPORT")
        print("=" * 60)
        print(f"Total HTTP Flows: {len(self.flows)}")
        print(f"Authentication Flows: {len(self.auth_flows)}")

        print("\n🔑 HEADER STATISTICS")
        print("-" * 40)
        for header_name, values in self.header_stats.items():
            if values:
                # Get unique values and their counts
                value_counts = defaultdict(int)
                for value in values:
                    value_counts[value] += 1

                # Sort by frequency
                sorted_values = sorted(
                    value_counts.items(), key=lambda x: x[1], reverse=True
                )
                print(f"\n{header_name.upper()}:")
                for value, count in sorted_values[:3]:  # Top 3 values
                    print(f"  {value} (used {count} times)")

        print("\n🔐 AUTHENTICATION FLOW DETAILS")
        print("-" * 40)
        for i, flow in enumerate(self.auth_flows[:5]):  # First 5 auth flows
            print(f"\nAuth Flow {i+1}:")
            print(f"  URL: {flow.request.pretty_url}")
            print(f"  Method: {flow.request.method}")
            print(f"  Status: {flow.response.status_code if flow.response else 'N/A'}")
            print(f"  Request Headers: {len(flow.request.headers)} headers")

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
                if header_name in flow.request.headers:
                    value = flow.request.headers[header_name]
                    print(
                        f"    {header_name}: {value[:100]}{'...' if len(value) > 100 else ''}"
                    )

    def _save_report(self) -> None:
        """Save detailed report to JSON."""
        report = {
            "total_flows": len(self.flows),
            "auth_flows": len(self.auth_flows),
            "header_stats": dict(self.header_stats),
            "auth_flow_details": [],
        }

        # Add auth flow details
        for flow in self.auth_flows[:10]:  # First 10 auth flows
            auth_detail = {
                "url": flow.request.pretty_url,
                "method": flow.request.method,
                "request_headers": dict(flow.request.headers),
                "request_content": flow.request.content.decode("utf-8", errors="ignore")
                if flow.request.content
                else "",
                "response_status": flow.response.status_code if flow.response else 0,
                "response_headers": dict(flow.response.headers)
                if flow.response
                else {},
                "response_content": flow.response.content.decode(
                    "utf-8", errors="ignore"
                )
                if flow.response and flow.response.content
                else "",
            }
            report["auth_flow_details"].append(auth_detail)

        # Save to file
        output_file = f"mitmdump_headers_analysis_{len(self.flows)}_flows.json"
        with open(output_file, "w") as f:
            json.dump(report, f, indent=2, default=str)

        print(f"\n💾 Detailed report saved to: {output_file}")


def main():
    """Main function to run the header analyzer."""
    # Create options
    opts = options.Options()
    opts.add_option("body_size_limit", int, 0, "")

    # Create the master
    master = DumpMaster(opts)

    # Add our addon
    analyzer = HeaderAnalyzer()
    master.addons.add(analyzer)

    # Read the log file
    log_file = "meijer_mitm_20250820_194153.log"

    try:
        # Load flows from file
        master.commands.call("replay.client", [log_file])

        # Process all flows
        analyzer.done()

    except Exception as e:
        print(f"❌ Error processing log file: {e}")
        sys.exit(1)


if __name__ == "__main__":
    main()
