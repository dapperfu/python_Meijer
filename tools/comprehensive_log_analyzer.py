#!/usr/bin/env python3
"""
Comprehensive analysis of mitmproxy logs for Meijer API endpoints.

This script analyzes all *.log files to extract:
- API endpoints and their HTTP methods
- Request/response JSON data
- Headers and authentication patterns
- Response structures for implementation
"""

import json
import re
from pathlib import Path
from typing import Dict, Any
from collections import defaultdict
import logging

# Configure logging
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)


class MitmproxyLogAnalyzer:
    """Comprehensive analyzer for mitmproxy binary logs."""

    def __init__(self):
        self.endpoints = defaultdict(
            lambda: {
                "count": 0,
                "methods": set(),
                "status_codes": set(),
                "request_headers": defaultdict(int),
                "response_headers": defaultdict(int),
                "sample_requests": [],
                "sample_responses": [],
                "json_responses": [],
                "error_responses": [],
            }
        )

        self.domains = defaultdict(
            lambda: {
                "count": 0,
                "endpoints": set(),
                "methods": set(),
                "status_codes": set(),
            }
        )

        self.auth_patterns = defaultdict(int)
        self.content_types = defaultdict(int)
        self.user_agents = defaultdict(int)

    def analyze_log_file(self, log_file: Path) -> Dict[str, Any]:
        """Analyze a single mitmproxy log file."""
        logger.info(f"🔍 Analyzing: {log_file}")

        try:
            # Read the binary log file
            with open(log_file, "rb") as f:
                content = f.read()

            # Try to decode as text first
            try:
                decoded_content = content.decode("utf-8", errors="ignore")
            except UnicodeDecodeError:
                # If that fails, try other encodings
                decoded_content = content.decode("latin-1", errors="ignore")

            # Extract HTTP requests and responses
            self._extract_http_flows(decoded_content)

            # Extract JSON responses
            self._extract_json_responses(decoded_content)

            # Extract authentication patterns
            self._extract_auth_patterns(decoded_content)

            # Extract headers and metadata
            self._extract_metadata(decoded_content)

            return {
                "file": str(log_file),
                "size_bytes": len(content),
                "endpoints_found": len(self.endpoints),
                "domains_found": len(self.domains),
            }

        except Exception as e:
            logger.error(f"❌ Error analyzing {log_file}: {e}")
            return {"file": str(log_file), "error": str(e)}

    def _extract_http_flows(self, content: str):
        """Extract HTTP request/response flows from log content."""
        # Look for HTTP method patterns
        http_patterns = [
            r"(GET|POST|PUT|DELETE|PATCH|HEAD|OPTIONS)\s+([^\s]+)\s+HTTP/[0-9.]+",
            r"([A-Z]+)\s+([^\s]+)\s+HTTP/[0-9.]+",
            r"([A-Z]+)\s+([^\s]+)",
        ]

        for pattern in http_patterns:
            matches = re.finditer(pattern, content)
            for match in matches:
                method = match.group(1)
                path = match.group(2)

                # Clean up the path
                if path.startswith("http"):
                    # Extract just the path part
                    path_match = re.search(r"https?://[^/]+([^?\s]+)", path)
                    if path_match:
                        clean_path = path_match.group(1)
                    else:
                        continue
                else:
                    clean_path = path

                # Skip if it's just a slash or empty
                if clean_path in ["/", "", "\\"]:
                    continue

                # Extract domain from path if present
                domain_match = re.search(r"https?://([^/]+)", path)
                if domain_match:
                    domain = domain_match.group(1)
                    self.domains[domain]["count"] += 1
                    self.domains[domain]["endpoints"].add(clean_path)
                    self.domains[domain]["methods"].add(method)

                # Update endpoint info
                self.endpoints[clean_path]["count"] += 1
                self.endpoints[clean_path]["methods"].add(method)

    def _extract_json_responses(self, content: str):
        """Extract JSON responses from log content."""
        # Look for JSON content in responses
        json_patterns = [
            r"Content-Type:\s*application/json[^}]*}([^}]*})",
            r"Content-Type:\s*application/vnd\.[^}]*}[^}]*}([^}]*})",
            r'\{[^{}]*"[^"]*"[^}]*\}',  # Simple JSON object
            r"\[[^\[\]]*\{[^}]*\}[^\[\]]*\]",  # JSON array
        ]

        for pattern in json_patterns:
            matches = re.finditer(pattern, content)
            for match in matches:
                try:
                    json_str = match.group(0) if match.groups() else match.group(0)
                    # Clean up the JSON string
                    json_str = re.sub(
                        r"[^\x20-\x7E]", "", json_str
                    )  # Remove non-printable chars

                    # Try to parse as JSON
                    parsed = json.loads(json_str)

                    # Find which endpoint this belongs to
                    for endpoint in self.endpoints:
                        if endpoint in content[: match.start()]:
                            self.endpoints[endpoint]["json_responses"].append(
                                {"json": parsed, "size": len(json_str)}
                            )
                            break

                except (json.JSONDecodeError, IndexError):
                    continue

    def _extract_auth_patterns(self, content: str):
        """Extract authentication patterns from log content."""
        # Look for authorization headers
        auth_patterns = [
            r"Authorization:\s*(Bearer\s+[^\s]+)",
            r"authorization:\s*(Bearer\s+[^\s]+)",
            r"Bearer\s+([A-Za-z0-9\-._~+/]+=*)",
        ]

        for pattern in auth_patterns:
            matches = re.finditer(pattern, content, re.IGNORECASE)
            for match in matches:
                auth_value = match.group(1) if match.groups() else match.group(0)
                self.auth_patterns[auth_value[:50] + "..."] += 1

    def _extract_metadata(self, content: str):
        """Extract metadata like headers, content types, etc."""
        # Extract content types
        content_type_pattern = r"Content-Type:\s*([^\s]+)"
        for match in re.finditer(content_type_pattern, content, re.IGNORECASE):
            content_type = match.group(1)
            self.content_types[content_type] += 1

        # Extract user agents
        user_agent_pattern = r"User-Agent:\s*([^\n]+)"
        for match in re.finditer(user_agent_pattern, content, re.IGNORECASE):
            user_agent = match.group(1)
            self.user_agents[user_agent[:100]] += 1

    def _extract_status_codes(self, content: str):
        """Extract HTTP status codes from responses."""
        status_pattern = r"HTTP/[0-9.]+\s+(\d{3})"
        for match in re.finditer(status_pattern, content):
            status_code = match.group(1)
            # Find which endpoint this belongs to
            for endpoint in self.endpoints:
                if endpoint in content[: match.start()]:
                    self.endpoints[endpoint]["status_codes"].add(status_code)
                    break

    def generate_report(self) -> Dict[str, Any]:
        """Generate comprehensive analysis report."""
        # Convert sets to lists for JSON serialization
        report = {
            "summary": {
                "total_endpoints": len(self.endpoints),
                "total_domains": len(self.domains),
                "total_auth_patterns": len(self.auth_patterns),
                "total_content_types": len(self.content_types),
                "total_user_agents": len(self.user_agents),
            },
            "endpoints": {},
            "domains": {},
            "auth_patterns": dict(self.auth_patterns),
            "content_types": dict(self.content_types),
            "user_agents": dict(self.user_agents),
        }

        # Process endpoints
        for endpoint, data in self.endpoints.items():
            report["endpoints"][endpoint] = {
                "count": data["count"],
                "methods": list(data["methods"]),
                "status_codes": list(data["status_codes"]),
                "request_headers": dict(data["request_headers"]),
                "response_headers": dict(data["response_headers"]),
                "sample_requests": data["sample_requests"][:5],  # Limit samples
                "sample_responses": data["sample_responses"][:5],
                "json_responses": data["json_responses"][:10],  # Limit JSON samples
                "error_responses": data["error_responses"][:5],
            }

        # Process domains
        for domain, data in self.domains.items():
            report["domains"][domain] = {
                "count": data["count"],
                "endpoints": list(data["endpoints"]),
                "methods": list(data["methods"]),
                "status_codes": list(data["status_codes"]),
            }

        return report

    def save_report(self, report: Dict[str, Any], output_file: str):
        """Save the analysis report to a file."""
        try:
            with open(output_file, "w") as f:
                json.dump(report, f, indent=2, default=str)
            logger.info(f"💾 Report saved to: {output_file}")
        except Exception as e:
            logger.error(f"❌ Error saving report: {e}")


def main():
    """Main analysis function."""
    print("🔍 Comprehensive Mitmproxy Log Analysis")
    print("=" * 50)

    # Find all log files
    log_files = list(Path(".").glob("*.log"))

    if not log_files:
        print("❌ No log files found")
        return

    print(f"📁 Found {len(log_files)} log files")

    # Initialize analyzer
    analyzer = MitmproxyLogAnalyzer()

    # Analyze each log file
    results = []
    for log_file in log_files:
        print(f"\n{'=' * 60}")
        result = analyzer.analyze_log_file(log_file)
        results.append(result)

        if "error" not in result:
            print(f"✅ {log_file.name}: {result.get('endpoints_found', 0)} endpoints")
        else:
            print(f"❌ {log_file.name}: {result['error']}")

    # Generate comprehensive report
    print("\n📊 Generating comprehensive report...")
    report = analyzer.generate_report()

    # Save detailed report
    output_file = "comprehensive_log_analysis.json"
    analyzer.save_report(report, output_file)

    # Print summary
    print("\n📋 Analysis Summary:")
    print(f"  Total endpoints found: {report['summary']['total_endpoints']}")
    print(f"  Total domains found: {report['summary']['total_domains']}")
    print(f"  Total auth patterns: {report['summary']['total_auth_patterns']}")
    print(f"  Total content types: {report['summary']['total_content_types']}")

    # Show top endpoints
    print("\n🏆 Top 10 endpoints by frequency:")
    sorted_endpoints = sorted(
        report["endpoints"].items(), key=lambda x: x[1]["count"], reverse=True
    )

    for i, (endpoint, data) in enumerate(sorted_endpoints[:10]):
        methods = ", ".join(data["methods"]) if data["methods"] else "UNKNOWN"
        print(f"  {i + 1:2d}. {endpoint} ({data['count']} calls, {methods})")

    # Show domains
    print("\n🌐 Domains found:")
    for domain, data in report["domains"].items():
        print(f"  {domain}: {data['count']} calls, {len(data['endpoints'])} endpoints")

    print(f"\n💾 Detailed report saved to: {output_file}")
    print("✨ Analysis completed!")


if __name__ == "__main__":
    main()
