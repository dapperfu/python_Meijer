#!/usr/bin/env python3
"""
Analyze mitmproxy log file to find mPerks history flows.

This script uses mitmproxy's built-in tools to analyze the log file
and extract information about mPerks history API calls.
"""

import json
import sys
from pathlib import Path

# Add the project root to the path
project_root = Path(__file__).parent.parent
sys.path.insert(0, str(project_root))

from mitmproxy import http
from mitmproxy import ctx


class MPerksHistoryAnalyzer:
    """Analyzer for mPerks history flows in mitmproxy logs."""

    def __init__(self):
        self.mperks_history_flows = []
        self.mperks_endpoints = []

    def request(self, flow: http.HTTPFlow) -> None:
        """Process each request in the flow."""
        if "mperks" in flow.request.pretty_url.lower():
            # Check if this might be a history-related endpoint
            if any(
                keyword in flow.request.pretty_url.lower()
                for keyword in [
                    "history",
                    "transaction",
                    "activity",
                    "points",
                    "earn",
                    "redeem",
                ]
            ):
                flow_info = {
                    "url": flow.request.pretty_url,
                    "method": flow.request.method,
                    "headers": dict(flow.request.headers),
                    "timestamp": flow.request.timestamp_start,
                    "flow_id": flow.id,
                }

                self.mperks_history_flows.append(flow_info)
                ctx.log.info(f"Found mPerks history flow: {flow.request.pretty_url}")

    def response(self, flow: http.HTTPFlow) -> None:
        """Process each response in the flow."""
        if "mperks" in flow.request.pretty_url.lower():
            # Find the corresponding request info
            for flow_info in self.mperks_history_flows:
                if flow_info["flow_id"] == flow.id:
                    # Add response information
                    flow_info["response_status"] = flow.response.status_code
                    flow_info["response_headers"] = dict(flow.response.headers)

                    # Try to parse response content
                    try:
                        if "application/json" in flow.response.headers.get(
                            "content-type", ""
                        ):
                            flow_info["response_data"] = json.loads(
                                flow.response.content.decode("utf-8")
                            )
                        else:
                            flow_info["response_data"] = flow.response.content.decode(
                                "utf-8", errors="ignore"
                            )[:500]
                    except Exception as e:
                        flow_info["response_data"] = f"Error parsing response: {e}"

                    break

    def done(self):
        """Called when all flows have been processed."""
        ctx.log.info(
            f"Analysis complete. Found {len(self.mperks_history_flows)} mPerks history flows."
        )

        # Print summary
        for i, flow in enumerate(self.mperks_history_flows):
            print(f"\n=== Flow {i + 1} ===")
            print(f"URL: {flow['url']}")
            print(f"Method: {flow['method']}")
            print(f"Status: {flow.get('response_status', 'N/A')}")

            if "response_data" in flow:
                if isinstance(flow["response_data"], dict):
                    print("Response keys:", list(flow["response_data"].keys()))
                    # Look for specific fields that might indicate history data
                    if "transactions" in flow["response_data"]:
                        print("Found transactions data!")
                    if "history" in flow["response_data"]:
                        print("Found history data!")
                    if "points" in flow["response_data"]:
                        print("Found points data!")
                else:
                    print("Response preview:", str(flow["response_data"])[:200])


# Create analyzer instance
analyzer = MPerksHistoryAnalyzer()


# Hook functions for mitmproxy
def request(flow: http.HTTPFlow) -> None:
    analyzer.request(flow)


def response(flow: http.HTTPFlow) -> None:
    analyzer.response(flow)


def done() -> None:
    analyzer.done()
