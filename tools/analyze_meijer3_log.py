#!/usr/bin/env python3
"""
Analyze meijer3.log using mitmproxy's flow reading capabilities.
Focus on mPerks earned rewards and related endpoints.
"""

import json
import sys
from typing import Dict, Any
from collections import defaultdict

try:
    from mitmproxy import flow
    from mitmproxy import http
    from mitmproxy.io import tnetstring

    print("Successfully imported mitmproxy modules")
except ImportError as e:
    print(f"Error importing mitmproxy: {e}")
    print("Please ensure mitmproxy is installed: pip install mitmproxy")
    sys.exit(1)


class Meijer3LogAnalyzer:
    """Analyze meijer3.log for mPerks and other Meijer API endpoints."""

    def __init__(self):
        self.flows = []
        self.meijer_flows = []
        self.mperks_flows = []
        self.earned_rewards_flows = []
        self.api_endpoints = defaultdict(list)
        self.content_types = defaultdict(list)
        self.auth_headers = []

    def analyze_flow_file(self, flow_file: str) -> Dict[str, Any]:
        """Analyze a mitmproxy flow file."""
        print(f"Analyzing flow file: {flow_file}")

        try:
            with open(flow_file, "rb") as f:
                # Read flows using mitmproxy's tnetstring format
                flows = []
                while True:
                    try:
                        flow_data = tnetstring.load(f)
                        flows.append(flow_data)
                    except EOFError:
                        break
                    except Exception as e:
                        print(f"Error reading flow: {e}")
                        break

                print(f"Successfully read {len(flows)} flows")
                self.flows = flows

                # Analyze each flow
                self._analyze_flows()

                # Generate report
                return self._generate_report()

        except Exception as e:
            print(f"Error analyzing flow file: {e}")
            return {"error": str(e)}

    def _analyze_flows(self):
        """Analyze all flows for Meijer-related content."""
        print("Analyzing flows...")

        # Show first few flows for debugging
        print("\nExamining first 5 flows for structure:")
        for i, flow_data in enumerate(self.flows[:5]):
            try:
                print(f"\nFlow {i}:")
                print(f"  Type: {type(flow_data)}")
                print(f"  Keys: {list(flow_data.keys())}")

                # Show first few key-value pairs
                for j, (key, value) in enumerate(flow_data.items()):
                    if j < 5:  # Show first 5 keys
                        if isinstance(value, str) and len(value) > 100:
                            print(f"  {key}: {value[:100]}...")
                        else:
                            print(f"  {key}: {value}")
                    else:
                        print(f"  ... and {len(flow_data) - 5} more keys")
                        break

            except Exception as e:
                print(f"  Error examining flow {i}: {e}")
                import traceback

                traceback.print_exc()

        for i, flow_data in enumerate(self.flows):
            try:
                # Check if this is a Meijer-related flow
                if self._is_meijer_flow(flow_data):
                    self.meijer_flows.append(flow_data)

                    # Check for mPerks specific flows
                    if self._is_mperks_flow(flow_data):
                        self.mperks_flows.append(flow_data)

                    # Check for earned rewards flows
                    if self._is_earned_rewards_flow(flow_data):
                        self.earned_rewards_flows.append(flow_data)

                    # Extract API endpoint info
                    self._extract_endpoint_info(flow_data)

                    # Extract content type info
                    self._extract_content_type_info(flow_data)

                    # Extract auth headers
                    self._extract_auth_info(flow_data)

            except Exception as e:
                print(f"Error analyzing flow {i}: {e}")
                continue

    def _is_meijer_flow(self, flow_data) -> bool:
        """Check if a flow is Meijer-related."""
        try:
            # Check if this is a dictionary flow
            if isinstance(flow_data, dict):
                # Check request URL
                if "request" in flow_data and isinstance(flow_data["request"], dict):
                    request = flow_data["request"]
                    if "host" in request:
                        host = request["host"].lower()
                        if "meijer" in host or "api.meijer.com" in host:
                            return True

                    if "path" in request:
                        path = request["path"].lower()
                        if "meijer" in path or "mperks" in path or "loyalty" in path:
                            return True

                # Check response headers for Meijer content types
                if "response" in flow_data and isinstance(flow_data["response"], dict):
                    response = flow_data["response"]
                    if "headers" in response:
                        headers = response["headers"]
                        for header in headers:
                            if len(header) >= 2:
                                header_name, header_value = header[0], header[1]
                                if b"content-type" in header_name.lower():
                                    content_type = header_value.decode(
                                        "utf-8", errors="ignore"
                                    ).lower()
                                    if (
                                        "meijer" in content_type
                                        or "mperks" in content_type
                                    ):
                                        return True

            return False
        except Exception as e:
            print(f"Error in _is_meijer_flow: {e}")
            return False

    def _is_mperks_flow(self, flow_data) -> bool:
        """Check if a flow is mPerks-related."""
        try:
            if isinstance(flow_data, dict):
                # Check request path/host
                if "request" in flow_data and isinstance(flow_data["request"], dict):
                    request = flow_data["request"]
                    if "path" in request:
                        path = request["path"].lower()
                        if "mperks" in path or "loyalty" in path:
                            return True

                    if "host" in request:
                        host = request["host"].lower()
                        if "mperks" in host:
                            return True

                # Check response headers for mPerks content types
                if "response" in flow_data and isinstance(flow_data["response"], dict):
                    response = flow_data["response"]
                    if "headers" in response:
                        headers = response["headers"]
                        for header in headers:
                            if len(header) >= 2:
                                header_name, header_value = header[0], header[1]
                                if b"content-type" in header_name.lower():
                                    content_type = header_value.decode(
                                        "utf-8", errors="ignore"
                                    ).lower()
                                    if "mperks" in content_type:
                                        return True

            return False
        except Exception as e:
            print(f"Error in _is_mperks_flow: {e}")
            return False

    def _is_earned_rewards_flow(self, flow_data) -> bool:
        """Check if a flow is related to earned rewards."""
        try:
            if isinstance(flow_data, dict):
                # Check request path
                if "request" in flow_data and isinstance(flow_data["request"], dict):
                    request = flow_data["request"]
                    if "path" in request:
                        path = request["path"].lower()
                        if (
                            "earned" in path
                            or "rewards" in path
                            or "digitalmperks" in path
                        ):
                            return True

                # Check response headers for earned rewards content type
                if "response" in flow_data and isinstance(flow_data["response"], dict):
                    response = flow_data["response"]
                    if "headers" in response:
                        headers = response["headers"]
                        for header in headers:
                            if len(header) >= 2:
                                header_name, header_value = header[0], header[1]
                                if b"content-type" in header_name.lower():
                                    content_type = header_value.decode(
                                        "utf-8", errors="ignore"
                                    ).lower()
                                    if (
                                        "application/vnd.meijer.digitalmperks.earnedrewards"
                                        in content_type
                                    ):
                                        return True

            return False
        except Exception as e:
            print(f"Error in _is_earned_rewards_flow: {e}")
            return False

    def _extract_endpoint_info(self, flow_data):
        """Extract API endpoint information."""
        try:
            if isinstance(flow_data, dict) and "request" in flow_data:
                request = flow_data["request"]
                method = request.get("method", "unknown")
                host = request.get("host", "unknown")
                path = request.get("path", "unknown")

                # Get status from response
                status = "unknown"
                if "response" in flow_data and isinstance(flow_data["response"], dict):
                    response = flow_data["response"]
                    # Look for status in headers or other response fields
                    if "http_version" in response:
                        # This might be a response object
                        pass

                # Construct endpoint key
                if host and path:
                    endpoint_key = f"{host}{path}"
                    self.api_endpoints[endpoint_key].append(
                        {"method": method, "status": status, "host": host, "path": path}
                    )
        except Exception as e:
            print(f"Error extracting endpoint info: {e}")

    def _extract_content_type_info(self, flow_data):
        """Extract content type information."""
        try:
            if isinstance(flow_data, dict) and "response" in flow_data:
                response = flow_data["response"]
                if "headers" in response:
                    headers = response["headers"]
                    for header in headers:
                        if len(header) >= 2:
                            header_name, header_value = header[0], header[1]
                            if b"content-type" in header_name.lower():
                                try:
                                    content_type = header_value.decode(
                                        "utf-8", errors="ignore"
                                    )
                                    if content_type:
                                        # Get request info for context
                                        request_info = {}
                                        if "request" in flow_data:
                                            req = flow_data["request"]
                                            request_info["host"] = req.get(
                                                "host", "unknown"
                                            )
                                            request_info["path"] = req.get(
                                                "path", "unknown"
                                            )
                                            request_info["method"] = req.get(
                                                "method", "unknown"
                                            )

                                        self.content_types[content_type].append(
                                            request_info
                                        )
                                except Exception as e:
                                    print(f"Error decoding content type: {e}")
        except Exception as e:
            print(f"Error extracting content type info: {e}")

    def _extract_auth_info(self, flow_data):
        """Extract authentication information."""
        try:
            if isinstance(flow_data, dict) and "request" in flow_data:
                request = flow_data["request"]
                if "headers" in request:
                    headers = request["headers"]
                    for header in headers:
                        if len(header) >= 2:
                            header_name, header_value = header[0], header[1]
                            if b"authorization" in header_name.lower():
                                try:
                                    auth_value = header_value.decode(
                                        "utf-8", errors="ignore"
                                    )
                                    if auth_value:
                                        request_info = {
                                            "host": request.get("host", "unknown"),
                                            "path": request.get("path", "unknown"),
                                            "auth_type": auth_value.split(" ")[0]
                                            if " " in auth_value
                                            else "unknown",
                                            "auth_value": auth_value[:50] + "..."
                                            if len(auth_value) > 50
                                            else auth_value,
                                        }
                                        self.auth_headers.append(request_info)
                                except Exception as e:
                                    print(f"Error decoding auth header: {e}")
        except Exception as e:
            print(f"Error extracting auth info: {e}")

    def _generate_report(self) -> Dict[str, Any]:
        """Generate analysis report."""
        report = {
            "total_flows": len(self.flows),
            "meijer_flows": len(self.meijer_flows),
            "mperks_flows": len(self.mperks_flows),
            "earned_rewards_flows": len(self.earned_rewards_flows),
            "api_endpoints": dict(self.api_endpoints),
            "content_types": dict(self.content_types),
            "auth_headers": self.auth_headers,
            "sample_mperks_flows": [],
            "sample_earned_rewards_flows": [],
        }

        # Add sample flows for detailed analysis
        for flow in self.mperks_flows[:3]:
            try:
                sample = {
                    "url": getattr(flow.request, "url", "unknown"),
                    "method": getattr(flow.request, "method", "unknown"),
                    "status": getattr(flow.response, "status_code", "unknown")
                    if hasattr(flow, "response")
                    else "unknown",
                    "content_type": getattr(flow.response, "headers", {}).get(
                        "content-type", "unknown"
                    )
                    if hasattr(flow, "response")
                    else "unknown",
                }
                report["sample_mperks_flows"].append(sample)
            except:
                continue

        for flow in self.earned_rewards_flows[:3]:
            try:
                sample = {
                    "url": getattr(flow.request, "url", "unknown"),
                    "method": getattr(flow.request, "method", "unknown"),
                    "status": getattr(flow.response, "status_code", "unknown")
                    if hasattr(flow, "response")
                    else "unknown",
                    "content_type": getattr(flow.response, "headers", {}).get(
                        "content-type", "unknown"
                    )
                    if hasattr(flow, "response")
                    else "unknown",
                }
                report["sample_earned_rewards_flows"].append(sample)
            except:
                continue

        return report


def main():
    """Main function."""
    if len(sys.argv) != 2:
        print("Usage: python analyze_meijer3_log.py <flow_file>")
        print("Example: python analyze_meijer3_log.py meijer3.log")
        sys.exit(1)

    flow_file = sys.argv[1]

    analyzer = Meijer3LogAnalyzer()
    report = analyzer.analyze_flow_file(flow_file)

    if "error" in report:
        print(f"Analysis failed: {report['error']}")
        sys.exit(1)

    # Print summary
    print("\n=== Meijer3.log Analysis Summary ===")
    print(f"Total flows: {report['total_flows']}")
    print(f"Meijer flows: {report['meijer_flows']}")
    print(f"mPerks flows: {report['mperks_flows']}")
    print(f"Earned rewards flows: {report['earned_rewards_flows']}")

    print(f"\nAPI Endpoints found: {len(report['api_endpoints'])}")
    for endpoint, flows in list(report["api_endpoints"].items())[:10]:
        print(f"  {endpoint}: {len(flows)} flows")

    print(f"\nContent Types found: {len(report['content_types'])}")
    for content_type, flows in list(report["content_types"].items())[:10]:
        print(f"  {content_type}: {len(flows)} flows")

    if report["mperks_flows"]:
        print("\nSample mPerks flows:")
        for flow in report["sample_mperks_flows"]:
            print(
                f"  {flow['method']} {flow['url']} -> {flow['status']} ({flow['content_type']})"
            )

    if report["earned_rewards_flows"]:
        print("\nSample earned rewards flows:")
        for flow in report["sample_earned_rewards_flows"]:
            print(
                f"  {flow['method']} {flow['url']} -> {flow['status']} ({flow['content_type']})"
            )

    # Save detailed report
    output_file = "meijer3_analysis_report.json"
    with open(output_file, "w") as f:
        json.dump(report, f, indent=2, default=str)

    print(f"\nDetailed report saved to: {output_file}")


if __name__ == "__main__":
    main()
