#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create specialized tool for analyzing feedback endpoints from mitmproxy logs
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: mitmproxy, json, logging
 */

Feedback Endpoint Analyzer for Meijer API

This tool analyzes mitmproxy logs to find and categorize different types of feedback
submissions, helping understand the complete feedback API structure.
"""

import json
import logging
from pathlib import Path
from typing import Dict, List, Any, Optional
from collections import Counter
from dataclasses import dataclass, asdict

# Import mitmproxy modules
try:
    from mitmproxy import flow
    from mitmproxy import http
    from mitmproxy.io import FlowReader
except ImportError as e:
    print(f"Error importing mitmproxy modules: {e}")
    print("Make sure you're in the virtual environment: source venv/bin/activate")
    exit(1)


@dataclass
class FeedbackAnalysis:
    """Analysis results for a feedback submission."""

    url: str
    method: str
    status_code: int
    timestamp: Optional[float]
    feedback_type: str
    form_id: int
    trigger_type: str
    form_language: str
    components: List[Dict[str, Any]]
    custom_params: List[Dict[str, str]]
    device_data: Dict[str, Any]
    payload_size: int
    response_uuid: Optional[str]
    raw_payload: Dict[str, Any]


class FeedbackEndpointAnalyzer:
    """
    Analyzes feedback endpoints from Meijer mitmproxy logs.

    This tool specifically looks for feedback submissions to understand:
    - Different feedback types (App, Shop & Scan, etc.)
    - Payload structures and component variations
    - Device data patterns
    - Custom parameters and their values
    """

    def __init__(self, log_file_path: str):
        self.log_file_path = Path(log_file_path)
        self.flows = []
        self.feedback_flows = []
        self.analysis_results = {
            "total_feedback_flows": 0,
            "feedback_types": Counter(),
            "form_ids": Counter(),
            "trigger_types": Counter(),
            "form_languages": Counter(),
            "device_models": Counter(),
            "app_versions": Counter(),
            "os_versions": Counter(),
            "component_types": Counter(),
            "custom_params": Counter(),
            "payload_sizes": [],
            "response_statuses": Counter(),
            "detailed_flows": [],
        }

        # Setup logging
        logging.basicConfig(level=logging.INFO)
        self.logger = logging.getLogger(__name__)

    def load_flows(self) -> bool:
        """Load flows from the mitmproxy log file."""
        try:
            if not self.log_file_path.exists():
                self.logger.error(f"Log file not found: {self.log_file_path}")
                return False

            self.logger.info(f"Loading flows from: {self.log_file_path}")

            with open(self.log_file_path, "rb") as f:
                reader = FlowReader(f)

                flow_count = 0
                for flow_obj in reader.stream():
                    self.flows.append(flow_obj)
                    flow_count += 1

                    if flow_count % 1000 == 0:
                        self.logger.info(f"Loaded {flow_count} flows...")

                self.logger.info(f"Successfully loaded {len(self.flows)} flows")
                return True

        except Exception as e:
            self.logger.error(f"Error loading flows: {e}")
            return False

    def analyze_feedback_endpoints(self) -> None:
        """Analyze all flows to find feedback endpoints."""
        self.logger.info("Starting feedback endpoint analysis...")

        for i, flow_obj in enumerate(self.flows):
            try:
                if self._is_feedback_flow(flow_obj):
                    self._analyze_feedback_flow(flow_obj, i)

                if (i + 1) % 1000 == 0:
                    self.logger.info(f"Analyzed {i + 1}/{len(self.flows)} flows...")

            except Exception as e:
                self.logger.error(f"Error analyzing flow {i}: {e}")

        self.logger.info(
            f"Feedback analysis completed. Found {len(self.feedback_flows)} feedback flows."
        )

    def _is_feedback_flow(self, flow_obj: flow.Flow) -> bool:
        """Check if a flow is a feedback submission."""
        if not isinstance(flow_obj, http.HTTPFlow):
            return False

        request = flow_obj.request
        if not request or not request.method:
            return False

        # Check if this is a feedback endpoint
        url_str = getattr(request, "pretty_url", "") or getattr(request, "url", "")
        return "feedback" in url_str.lower() and request.method == "POST"

    def _analyze_feedback_flow(self, flow_obj: http.HTTPFlow, index: int) -> None:
        """Analyze a single feedback flow."""
        request = flow_obj.request
        response = flow_obj.response

        try:
            # Extract request body
            request_body = self._extract_body(request)
            if not request_body:
                return

            # Parse JSON payload
            try:
                payload = json.loads(request_body)
            except json.JSONDecodeError:
                self.logger.warning(f"Invalid JSON in feedback flow {index}")
                return

            # Extract response body
            response_body = self._extract_body(response) if response else None
            response_data = None
            if response_body:
                try:
                    response_data = json.loads(response_body)
                except json.JSONDecodeError:
                    pass

            # Analyze the feedback flow
            analysis = self._create_feedback_analysis(
                flow_obj, payload, response_data, request_body
            )

            if analysis:
                self.feedback_flows.append(analysis)
                self._update_statistics(analysis)
                self.analysis_results["detailed_flows"].append(asdict(analysis))

        except Exception as e:
            self.logger.error(f"Error analyzing feedback flow {index}: {e}")

    def _create_feedback_analysis(
        self,
        flow_obj: http.HTTPFlow,
        payload: Dict[str, Any],
        response_data: Optional[Dict[str, Any]],
        raw_request: str,
    ) -> Optional[FeedbackAnalysis]:
        """Create a FeedbackAnalysis object from flow data."""
        try:
            request = flow_obj.request
            response = flow_obj.response

            # Determine feedback type based on payload
            feedback_type = self._determine_feedback_type(payload)

            # Extract components and custom params
            components = []
            custom_params = []

            if "dynamicData" in payload:
                dynamic_data = payload["dynamicData"]
                if "pages" in dynamic_data and dynamic_data["pages"]:
                    for page in dynamic_data["pages"]:
                        if "components" in page:
                            components.extend(page["components"])

                if "customParams" in dynamic_data:
                    custom_params = dynamic_data["customParams"]

            # Extract device data
            device_data = payload.get("mobileDeviceData", {})

            # Extract response UUID
            response_uuid = None
            if response_data and "uuid" in response_data:
                response_uuid = response_data["uuid"]

            return FeedbackAnalysis(
                url=getattr(request, "pretty_url", "") or getattr(request, "url", ""),
                method=request.method,
                status_code=response.status_code if response else 0,
                timestamp=getattr(flow_obj, "timestamp_start", None),
                feedback_type=feedback_type,
                form_id=payload.get("formId", 0),
                trigger_type=payload.get("triggerType", ""),
                form_language=payload.get("formLanguage", ""),
                components=components,
                custom_params=custom_params,
                device_data=device_data,
                payload_size=len(raw_request),
                response_uuid=response_uuid,
                raw_payload=payload,
            )

        except Exception as e:
            self.logger.error(f"Error creating feedback analysis: {e}")
            return None

    def _determine_feedback_type(self, payload: Dict[str, Any]) -> str:
        """Determine the type of feedback based on payload content."""
        try:
            # Check for Shop & Scan specific indicators
            if "dynamicData" in payload:
                dynamic_data = payload["dynamicData"]
                if "pages" in dynamic_data and dynamic_data["pages"]:
                    for page in dynamic_data["pages"]:
                        if "components" in page:
                            for component in page["components"]:
                                if component.get(
                                    "unique_name"
                                ) == "S&S_APP_FEEDBACK" and component.get("value"):
                                    return "Shop & Scan"
                                if (
                                    component.get("unique_name") == "FEEDBACK_TOPICAPP"
                                    and component.get("value") == "C"
                                ):
                                    return "Shop & Scan"
                                if (
                                    component.get("unique_name") == "FEEDBACK_TOPICAPP"
                                    and component.get("value") == "A"
                                ):
                                    return "App Feedback"

            # Default to general feedback
            return "General"
        except:
            return "Unknown"

    def _update_statistics(self, analysis: FeedbackAnalysis) -> None:
        """Update analysis statistics with feedback flow data."""
        self.analysis_results["total_feedback_flows"] += 1
        self.analysis_results["feedback_types"][analysis.feedback_type] += 1
        self.analysis_results["form_ids"][analysis.form_id] += 1
        self.analysis_results["trigger_types"][analysis.trigger_type] += 1
        self.analysis_results["form_languages"][analysis.form_language] += 1
        self.analysis_results["response_statuses"][analysis.status_code] += 1
        self.analysis_results["payload_sizes"].append(analysis.payload_size)

        # Device data statistics
        if analysis.device_data:
            device_model = analysis.device_data.get("deviceModel", "Unknown")
            app_version = analysis.device_data.get("appVersion", "Unknown")
            os_version = analysis.device_data.get("osVersion", "Unknown")

            self.analysis_results["device_models"][device_model] += 1
            self.analysis_results["app_versions"][app_version] += 1
            self.analysis_results["os_versions"][os_version] += 1

        # Component type statistics
        for component in analysis.components:
            component_type = component.get("type", "Unknown")
            self.analysis_results["component_types"][component_type] += 1

        # Custom parameter statistics
        for param in analysis.custom_params:
            param_name = param.get("unique_name", "Unknown")
            self.analysis_results["custom_params"][param_name] += 1

    def _extract_body(self, http_obj) -> Optional[str]:
        """Extract and decode HTTP body content."""
        try:
            if hasattr(http_obj, "content") and http_obj.content:
                # Try to decode as text
                try:
                    return http_obj.content.decode("utf-8")
                except UnicodeDecodeError:
                    # If it's binary, return hex representation
                    return (
                        http_obj.content.hex()[:200] + "..."
                        if len(http_obj.content) > 200
                        else http_obj.content.hex()
                    )
        except:
            pass
        return None

    def generate_report(self) -> Dict[str, Any]:
        """Generate a comprehensive feedback analysis report."""
        report = {
            "summary": {
                "total_feedback_flows": self.analysis_results["total_feedback_flows"],
                "unique_feedback_types": len(self.analysis_results["feedback_types"]),
                "unique_form_ids": len(self.analysis_results["form_ids"]),
                "unique_device_models": len(self.analysis_results["device_models"]),
                "unique_app_versions": len(self.analysis_results["app_versions"]),
            },
            "feedback_types": dict(self.analysis_results["feedback_types"]),
            "form_ids": dict(self.analysis_results["form_ids"]),
            "trigger_types": dict(self.analysis_results["trigger_types"]),
            "form_languages": dict(self.analysis_results["form_languages"]),
            "device_models": dict(self.analysis_results["device_models"]),
            "app_versions": dict(self.analysis_results["app_versions"]),
            "os_versions": dict(self.analysis_results["os_versions"]),
            "component_types": dict(self.analysis_results["component_types"]),
            "custom_params": dict(self.analysis_results["custom_params"]),
            "response_statuses": dict(self.analysis_results["response_statuses"]),
            "payload_size_stats": {
                "min": min(self.analysis_results["payload_sizes"])
                if self.analysis_results["payload_sizes"]
                else 0,
                "max": max(self.analysis_results["payload_sizes"])
                if self.analysis_results["payload_sizes"]
                else 0,
                "avg": sum(self.analysis_results["payload_sizes"])
                / len(self.analysis_results["payload_sizes"])
                if self.analysis_results["payload_sizes"]
                else 0,
            },
            "detailed_flows": self.analysis_results["detailed_flows"][
                :20
            ],  # Limit to first 20
        }

        return report

    def save_report(self, output_file: str = "feedback_analysis_report.json") -> None:
        """Save the feedback analysis report to a JSON file."""
        try:
            report = self.generate_report()

            with open(output_file, "w") as f:
                json.dump(report, f, indent=2, default=str)

            self.logger.info(f"Feedback analysis report saved to: {output_file}")

        except Exception as e:
            self.logger.error(f"Error saving report: {e}")

    def print_summary(self) -> None:
        """Print a summary of the feedback analysis."""
        report = self.generate_report()
        summary = report["summary"]

        print("\n" + "=" * 80)
        print("🔍 MEIJER FEEDBACK ENDPOINT ANALYSIS SUMMARY")
        print("=" * 80)

        print(f"📊 Total Feedback Flows: {summary['total_feedback_flows']:,}")
        print(f"🎯 Unique Feedback Types: {summary['unique_feedback_types']:,}")
        print(f"📝 Unique Form IDs: {summary['unique_form_ids']:,}")
        print(f"📱 Unique Device Models: {summary['unique_device_models']:,}")
        print(f"🔧 Unique App Versions: {summary['unique_app_versions']:,}")

        print("\n🎯 Feedback Types Found:")
        for feedback_type, count in report["feedback_types"].items():
            print(f"   {feedback_type}: {count:,}")

        print("\n📝 Form IDs Found:")
        for form_id, count in report["form_ids"].items():
            print(f"   {form_id}: {count:,}")

        print("\n📱 Device Models:")
        for device_model, count in report["device_models"].items():
            print(f"   {device_model}: {count:,}")

        print("\n🔧 App Versions:")
        for app_version, count in report["app_versions"].items():
            print(f"   {app_version}: {count:,}")

        print("\n📊 Payload Size Statistics:")
        payload_stats = report["payload_size_stats"]
        print(f"   Min: {payload_stats['min']:,} bytes")
        print(f"   Max: {payload_stats['max']:,} bytes")
        print(f"   Avg: {payload_stats['avg']:.0f} bytes")

        print("\n🌐 Response Statuses:")
        for status, count in report["response_statuses"].items():
            print(f"   {status}: {count:,}")

        print("\n" + "=" * 80)


def main():
    """Main function to analyze feedback endpoints from the Meijer log file."""
    import sys

    print("🚀 Meijer Feedback Endpoint Analyzer")
    print("=" * 60)

    # Get log file path from command line or use default
    if len(sys.argv) > 1:
        log_file = sys.argv[1]
    else:
        log_file = "outfile.log"
        print(f"⚠️  No log file specified, using default: {log_file}")
        print("   Usage: python feedback_endpoint_analyzer.py <log_file_path>")

    # Initialize analyzer
    analyzer = FeedbackEndpointAnalyzer(log_file)

    # Load flows
    print(f"📂 Loading flows from log file: {log_file}")
    if not analyzer.load_flows():
        print("❌ Failed to load flows. Exiting.")
        return

    # Analyze feedback endpoints
    print("🔍 Analyzing feedback endpoints...")
    analyzer.analyze_feedback_endpoints()

    # Generate and display report
    print("📊 Generating feedback analysis report...")
    analyzer.print_summary()

    # Save detailed report
    print("💾 Saving detailed report...")
    analyzer.save_report()

    print("\n✅ Feedback analysis completed successfully!")
    print("📄 Check 'feedback_analysis_report.json' for detailed results")


if __name__ == "__main__":
    main()
