#!/usr/bin/env python3
"""
Search all mitmproxy log files for successful login events.
This script will analyze all logs to find complete, successful authentication flows.
"""

import json
from pathlib import Path
from typing import List, Dict, Any


def load_mitmproxy_flows(log_file: str) -> List[Dict[str, Any]]:
    """Load flows from a mitmproxy log file."""
    try:
        with open(log_file, "r", encoding="utf-8") as f:
            flows = []
            for line in f:
                line = line.strip()
                if line:
                    try:
                        flow = json.loads(line)
                        flows.append(flow)
                    except json.JSONDecodeError:
                        continue
            return flows
    except Exception as e:
        print(f"⚠️ Error loading {log_file}: {e}")
        return []


def find_successful_login_flows(flows: List[Dict[str, Any]]) -> List[Dict[str, Any]]:
    """Find flows that contain successful login patterns."""
    successful_flows = []

    for i, flow in enumerate(flows):
        # Look for successful identify endpoint (200 status)
        if flow.get("path") == "/idp/idx/identify" and flow.get("status_code") == 200:
            print(f"🎯 Found successful identify flow in flow {i}")
            successful_flows.append(flow)

        # Look for successful token exchange or callback
        elif (
            flow.get("path") == "/oauth2/default/v1/token"
            and flow.get("status_code") == 200
        ):
            print(f"🎯 Found successful token exchange in flow {i}")
            successful_flows.append(flow)

        # Look for successful callback with authorization code
        elif (
            "/bin/meijer/signin/v3/callback" in flow.get("path", "")
            and flow.get("status_code") == 200
        ):
            print(f"🎯 Found successful callback in flow {i}")
            successful_flows.append(flow)

    return successful_flows


def analyze_log_file(log_file: str) -> Dict[str, Any]:
    """Analyze a single log file for successful login flows."""
    print(f"\n🔍 Analyzing: {log_file}")

    flows = load_mitmproxy_flows(log_file)
    if not flows:
        print(f"❌ No flows found in {log_file}")
        return {}

    print(f"✅ Loaded {len(flows)} flows")

    # Find successful login flows
    successful_flows = find_successful_login_flows(flows)

    # Count different status codes for identify endpoint
    identify_statuses = {}
    for flow in flows:
        if flow.get("path") == "/idp/idx/identify":
            status = flow.get("status_code")
            identify_statuses[status] = identify_statuses.get(status, 0) + 1

    if identify_statuses:
        print(f"📊 Identify endpoint status codes: {identify_statuses}")

    return {
        "log_file": log_file,
        "total_flows": len(flows),
        "successful_flows": len(successful_flows),
        "identify_statuses": identify_statuses,
        "flows": flows,
    }


def main():
    """Main function to search all log files."""
    print("🔍 Searching ALL log files for successful login events...")

    # Find all log files
    log_dir = Path("logs")
    log_files = list(log_dir.glob("*.log"))

    print(f"📁 Found {len(log_files)} log files:")
    for log_file in log_files:
        print(f"  - {log_file}")

    # Analyze each log file
    results = []
    for log_file in sorted(log_files):
        if log_file.stat().st_size > 0:  # Skip empty files
            result = analyze_log_file(str(log_file))
            if result:
                results.append(result)

    # Summary
    print("\n" + "=" * 80)
    print("📊 SEARCH SUMMARY")
    print("=" * 80)

    total_successful = sum(r["successful_flows"] for r in results)
    total_flows = sum(r["total_flows"] for r in results)

    print(f"Total log files analyzed: {len(results)}")
    print(f"Total flows analyzed: {total_flows}")
    print(f"Total successful login flows found: {total_successful}")

    if total_successful > 0:
        print("\n🎉 SUCCESS! Found successful login flows!")
        print("Check the individual log analysis above for details.")
    else:
        print("\n❌ No successful login flows found in any logs.")
        print("All identify endpoints are returning 403 errors.")

    # Save detailed results
    output_file = "all_logs_login_search_results.json"
    with open(output_file, "w") as f:
        json.dump(results, f, indent=2)
    print(f"\n💾 Detailed results saved to: {output_file}")


if __name__ == "__main__":
    main()
