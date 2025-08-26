#!/usr/bin/env python3
"""
Simple Binary Log Analyzer for Meijer Authentication Flows

This tool analyzes mitmproxy binary log files to extract authentication patterns
without requiring the mitmproxy module.
"""

import json
from pathlib import Path
from typing import Dict, List, Any, Optional
from collections import defaultdict, Counter


def extract_auth_patterns_from_binary(log_file_path: str) -> Dict[str, Any]:
    """
    Extract authentication patterns from binary mitmproxy log.
    """
    print(f"🔍 Analyzing binary log: {log_file_path}")

    patterns = {
        "oauth2_authorize": rb"oauth2/default/v1/authorize",
        "idp_identify": rb"idp/idx/identify",
        "idp_challenge": rb"idp/idx/challenge",
        "device_fingerprint": rb"auth/services/devicefingerprint",
        "device_nonce": rb"api/v1/internal/device/nonce",
        "token_exchange": rb"oauth2/default/v1/token",
        "login_hint": rb"login_hint",
        "state_token": rb"stateToken",
        "state_handle": rb"stateHandle",
        "device_fingerprint_header": rb"X-Device-Fingerprint",
        "okta_user_agent": rb"X-Okta-User-Agent-Extended",
        "user_agent": rb"User-Agent",
        "authorization": rb"Authorization",
        "content_type": rb"Content-Type",
        "accept": rb"Accept",
        "origin": rb"Origin",
        "referer": rb"Referer",
        "id_meijer_com": rb"id\.meijer\.com",
        "meijer_com": rb"meijer\.com",
    }

    results = {}

    try:
        with open(log_file_path, "rb") as f:
            content = f.read()

        print(f"   📁 File size: {len(content) / (1024 * 1024):.1f} MB")

        for pattern_name, pattern in patterns.items():
            matches = []
            start = 0

            while True:
                pos = content.find(pattern, start)
                if pos == -1:
                    break

                # Extract context around the match
                context_start = max(0, pos - 500)
                context_end = min(len(content), pos + 500)
                context = content[context_start:context_end]

                # Try to decode as text
                try:
                    context_text = context.decode("utf-8", errors="ignore")
                    matches.append({"position": pos, "context": context_text})
                except:
                    pass

                start = pos + 1

            results[pattern_name] = matches
            print(f"   🔍 {pattern_name}: {len(matches)} matches")

        return results

    except Exception as e:
        print(f"❌ Error reading log file: {e}")
        return {}


def extract_http_flows_from_binary(log_file_path: str) -> List[Dict[str, Any]]:
    """
    Extract HTTP flows from binary log by looking for HTTP request/response patterns.
    """
    print("\n🔍 Extracting HTTP flows...")

    flows = []

    try:
        with open(log_file_path, "rb") as f:
            content = f.read()

        # Look for HTTP request patterns
        http_patterns = [rb"POST ", rb"GET ", rb"PUT ", rb"DELETE ", rb"PATCH "]

        for pattern in http_patterns:
            start = 0
            while True:
                pos = content.find(pattern, start)
                if pos == -1:
                    break

                # Extract the flow starting from this position
                flow_start = pos
                flow_end = min(len(content), pos + 3000)  # Look ahead 3000 bytes

                flow_content = content[flow_start:flow_end]

                try:
                    flow_text = flow_content.decode("utf-8", errors="ignore")

                    # Parse the flow
                    flow = parse_flow_content(flow_text)
                    if flow and is_auth_flow(flow):
                        flows.append(flow)

                except Exception:
                    pass

                start = pos + 1

        print(f"   📊 Found {len(flows)} authentication flows")
        return flows

    except Exception as e:
        print(f"❌ Error extracting flows: {e}")
        return []


def parse_flow_content(content: str) -> Optional[Dict[str, Any]]:
    """
    Parse flow content to extract HTTP request/response details.
    """
    flow = {
        "method": None,
        "url": None,
        "path": None,
        "host": None,
        "headers": {},
        "body": None,
        "response_status": None,
        "timestamp": None,
    }

    lines = content.split("\n")

    for i, line in enumerate(lines):
        line = line.strip()

        # Parse request line
        if line.startswith(("POST ", "GET ", "PUT ", "DELETE ", "PATCH ")):
            parts = line.split(" ")
            if len(parts) >= 2:
                flow["method"] = parts[0]
                flow["url"] = parts[1]

                # Extract host and path
                if flow["url"].startswith("http"):
                    from urllib.parse import urlparse

                    parsed = urlparse(flow["url"])
                    flow["host"] = parsed.netloc
                    flow["path"] = parsed.path
                else:
                    flow["path"] = flow["url"]

        # Parse headers
        elif ":" in line and not line.startswith("{") and not line.startswith("HTTP/"):
            if ":" in line:
                key, value = line.split(":", 1)
                flow["headers"][key.strip()] = value.strip()

        # Parse JSON body
        elif line.startswith("{") and line.endswith("}"):
            try:
                flow["body"] = json.loads(line)
            except:
                pass

        # Parse response status
        elif line.startswith("HTTP/"):
            parts = line.split(" ")
            if len(parts) >= 2:
                flow["response_status"] = parts[1]

    return flow if flow["method"] else None


def is_auth_flow(flow: Dict[str, Any]) -> bool:
    """Check if a flow is authentication-related."""
    if not flow.get("path"):
        return False

    path = flow["path"].lower()
    host = flow.get("host", "").lower()

    # Authentication endpoints
    auth_endpoints = [
        "oauth2",
        "idp/idx",
        "login",
        "auth",
        "signin",
        "authenticate",
        "token",
        "authorize",
        "challenge",
        "identify",
        "devicefingerprint",
    ]

    # Check URL for auth endpoints
    if any(endpoint in path for endpoint in auth_endpoints):
        return True

    # Check for auth hosts
    if any(auth_host in host for auth_host in ["id.meijer.com", "auth.meijer.com"]):
        return True

    # Check for auth headers
    if any(
        header.lower() in ["authorization", "cookie"]
        for header in flow.get("headers", {})
    ):
        return True

    return False


def analyze_auth_flows(flows: List[Dict[str, Any]]) -> Dict[str, Any]:
    """
    Analyze authentication flows to extract patterns.
    """
    print("\n🔍 Analyzing authentication flows...")

    analysis = {
        "endpoints": Counter(),
        "methods": Counter(),
        "hosts": Counter(),
        "status_codes": Counter(),
        "headers": defaultdict(list),
        "user_agents": Counter(),
        "flow_sequences": [],
    }

    for flow in flows:
        # Basic flow info
        analysis["endpoints"][flow.get("path", "unknown")] += 1
        analysis["methods"][flow.get("method", "unknown")] += 1
        analysis["hosts"][flow.get("host", "unknown")] += 1
        analysis["status_codes"][flow.get("response_status", "unknown")] += 1

        # Headers analysis
        headers = flow.get("headers", {})
        for header_name, header_value in headers.items():
            analysis["headers"][header_name.lower()].append(header_value)

        # User agent analysis
        user_agent = headers.get("User-Agent", "unknown")
        analysis["user_agents"][user_agent] += 1

    # Find flow sequences
    flows_by_host = defaultdict(list)
    for flow in flows:
        host = flow.get("host", "unknown")
        flows_by_host[host].append(flow)

    # Look for sequences in id.meijer.com
    if "id.meijer.com" in flows_by_host:
        id_meijer_flows = flows_by_host["id.meijer.com"]
        id_meijer_flows.sort(key=lambda x: x.get("path", ""))

        # Group by similar paths
        path_groups = defaultdict(list)
        for flow in id_meijer_flows:
            path = flow.get("path", "")
            if "oauth2" in path:
                path_groups["oauth2"].append(flow)
            elif "idp/idx" in path:
                path_groups["idp_idx"].append(flow)
            elif "auth/services" in path:
                path_groups["auth_services"].append(flow)
            elif "api/v1/internal" in path:
                path_groups["api_internal"].append(flow)

        analysis["flow_sequences"] = dict(path_groups)

    return analysis


def generate_auth_template(analysis: Dict[str, Any]) -> str:
    """
    Generate an authentication template based on the analysis.
    """
    print("\n🔍 Generating authentication template...")

    template = """# Meijer Authentication Template
# Generated from binary log analysis

# Base URLs
BASE_URLS = {
    'id_meijer': 'https://id.meijer.com',
    'meijer': 'https://www.meijer.com'
}

# Authentication endpoints
AUTH_ENDPOINTS = {
"""

    # Add endpoints
    for endpoint, count in analysis["endpoints"].most_common(10):
        template += f"    '{endpoint}': {count},  # Used {count} times\n"

    template += """}

# Common headers
COMMON_HEADERS = {
"""

    # Add most common headers
    for header_name, values in analysis["headers"].items():
        if len(values) > 1:
            # Get most common value
            value_counts = Counter(values)
            most_common_value = value_counts.most_common(1)[0][0]
            template += f"    '{header_name}': '{most_common_value}',\n"

    template += """}

# User agents
USER_AGENTS = [
"""

    # Add user agents
    for user_agent, count in analysis["user_agents"].most_common(5):
        template += f"    '{user_agent}',  # Used {count} times\n"

    template += """]

# Flow sequence
FLOW_SEQUENCE = [
"""

    # Add flow sequence
    if analysis["flow_sequences"]:
        for group_name, flows in analysis["flow_sequences"].items():
            template += f"    '{group_name}',  # {len(flows)} flows\n"

    template += """]
"""

    return template


def save_analysis_results(
    analysis: Dict[str, Any], output_file: str = "binary_auth_analysis.json"
):
    """Save analysis results to a JSON file."""
    print(f"\n💾 Saving analysis results to {output_file}...")

    try:
        # Convert defaultdict to regular dict for JSON serialization
        serializable_analysis = {}
        for key, value in analysis.items():
            if isinstance(value, defaultdict):
                serializable_analysis[key] = dict(value)
            elif isinstance(value, Counter):
                serializable_analysis[key] = dict(value)
            else:
                serializable_analysis[key] = value

        with open(output_file, "w") as f:
            json.dump(serializable_analysis, f, indent=2, default=str)

        print(f"   ✅ Analysis saved to {output_file}")

    except Exception as e:
        print(f"   ❌ Error saving analysis: {e}")


def main():
    """Main function to run the binary log analysis."""
    print("🚀 MEIJER BINARY LOG AUTHENTICATION ANALYSIS")
    print("=" * 80)
    print(
        "This tool analyzes mitmproxy binary logs to extract authentication patterns."
    )
    print()

    # Find the latest log file
    log_dir = Path("logs")
    log_files = list(log_dir.glob("*.log"))

    if not log_files:
        print("❌ No log files found")
        return

    # Sort by modification time, newest first
    log_files.sort(key=lambda x: x.stat().st_mtime, reverse=True)
    latest_log = log_files[0]

    print(f"📁 Found latest log: {latest_log}")
    print(f"   Size: {latest_log.stat().st_size / (1024 * 1024):.1f} MB")
    print()

    # Extract authentication patterns
    patterns = extract_auth_patterns_from_binary(str(latest_log))

    # Extract HTTP flows
    flows = extract_http_flows_from_binary(str(latest_log))

    if not flows:
        print("❌ No authentication flows found")
        return

    # Analyze the flows
    analysis = analyze_auth_flows(flows)

    # Generate authentication template
    template = generate_auth_template(analysis)

    # Save template
    with open("auth_template.py", "w") as f:
        f.write(template)
    print("   💾 Authentication template saved to auth_template.py")

    # Save detailed analysis
    save_analysis_results(analysis, "binary_auth_analysis.json")

    # Print summary
    print("\n📊 ANALYSIS SUMMARY")
    print("=" * 40)
    print(f"Total authentication flows: {len(flows)}")
    print(f"Unique endpoints: {len(analysis['endpoints'])}")
    print(f"Unique hosts: {len(analysis['hosts'])}")
    print(f"Unique user agents: {len(analysis['user_agents'])}")

    if analysis["flow_sequences"]:
        print(f"Flow sequence groups: {len(analysis['flow_sequences'])}")
        for group_name, group_flows in analysis["flow_sequences"].items():
            print(f"  {group_name}: {len(group_flows)} flows")

    print("\n🎯 Next steps:")
    print("1. Review auth_template.py for authentication patterns")
    print("2. Review binary_auth_analysis.json for detailed analysis")
    print("3. Update authentication client with extracted patterns")
    print("4. Test with the new configuration")


if __name__ == "__main__":
    main()
