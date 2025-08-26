#!/usr/bin/env python3
"""
Analyze account-related flows from mitmproxy log files.
"""

import json
from mitmproxy import http


class AccountFlowAnalyzer:
    def __init__(self):
        self.account_flows = []
        self.account_endpoints = set()

    def request(self, flow: http.HTTPFlow) -> None:
        """Analyze incoming requests for account-related endpoints."""
        url = flow.request.pretty_url

        # Look for account-related endpoints
        if any(
            keyword in url.lower()
            for keyword in ["account", "profile", "user", "receipt", "order", "savings"]
        ):
            flow_data = {
                "method": flow.request.method,
                "url": url,
                "endpoint": self._extract_endpoint(url),
                "headers": dict(flow.request.headers),
                "query_params": dict(flow.request.query),
                "timestamp": flow.request.timestamp_start,
                "request_body": None,
            }

            # Extract request body if present
            if flow.request.content:
                try:
                    flow_data["request_body"] = json.loads(
                        flow.request.content.decode("utf-8")
                    )
                except:
                    flow_data["request_body"] = flow.request.content.decode(
                        "utf-8", errors="ignore"
                    )

            self.account_flows.append(flow_data)
            self.account_endpoints.add(self._extract_endpoint(url))

    def response(self, flow: http.HTTPFlow) -> None:
        """Analyze responses for account-related endpoints."""
        url = flow.request.pretty_url

        if any(
            keyword in url.lower()
            for keyword in ["account", "profile", "user", "receipt", "order", "savings"]
        ):
            # Find matching request
            for flow_data in self.account_flows:
                if flow_data["url"] == url:
                    flow_data["response_status"] = flow.response.status_code
                    flow_data["response_headers"] = dict(flow.response.headers)

                    # Extract response body if present
                    if flow.response.content:
                        try:
                            flow_data["response_body"] = json.loads(
                                flow.response.content.decode("utf-8")
                            )
                        except:
                            flow_data["response_body"] = flow.response.content.decode(
                                "utf-8", errors="ignore"
                            )
                    break

    def _extract_endpoint(self, url: str) -> str:
        """Extract the endpoint path from URL."""
        if "meijer.com" in url:
            # Extract path after meijer.com
            parts = url.split("meijer.com")
            if len(parts) > 1:
                return parts[1].split("?")[0]
        return url

    def done(self):
        """Called when analysis is complete."""
        # Group flows by endpoint
        endpoint_groups = {}
        for flow in self.account_flows:
            endpoint = flow["endpoint"]
            if endpoint not in endpoint_groups:
                endpoint_groups[endpoint] = []
            endpoint_groups[endpoint].append(flow)

        # Print summary
        print(
            f"Found {len(self.account_flows)} account-related flows across {len(self.account_endpoints)} endpoints"
        )
        print("\nAccount Endpoints Found:")
        for endpoint in sorted(self.account_endpoints):
            count = len([f for f in self.account_flows if f["endpoint"] == endpoint])
            print(f"  {endpoint}: {count} flows")

        # Save detailed analysis
        analysis = {
            "total_flows": len(self.account_flows),
            "endpoints": list(self.account_endpoints),
            "endpoint_groups": endpoint_groups,
            "flows": self.account_flows,
        }

        with open("account_flows_analysis.json", "w") as f:
            json.dump(analysis, f, indent=2, default=str)

        print("\nDetailed analysis saved to: account_flows_analysis.json")


addons = [AccountFlowAnalyzer()]
