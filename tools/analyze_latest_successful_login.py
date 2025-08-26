#!/usr/bin/env python3
"""
Analyze the latest mitmproxy log file for successful login and logout events.
This script will extract the complete workflow including all headers, cookies, and parameters.
"""

import json
from pathlib import Path


def analyze_latest_log():
    """Analyze the latest log file for successful login/logout events."""

    # Find the latest log file
    log_dir = Path("logs")
    log_files = list(log_dir.glob("*.log"))
    log_files.sort(key=lambda x: x.stat().st_mtime, reverse=True)

    if not log_files:
        print("❌ No log files found")
        return

    latest_log = log_files[0]
    print(f"🔍 Analyzing latest log file: {latest_log}")

    try:
        # Read the log file line by line to find the events
        flows = []
        with open(latest_log, "r", encoding="utf-8", errors="ignore") as f:
            for line_num, line in enumerate(f):
                line = line.strip()
                if line and line.startswith("{"):
                    try:
                        flow_data = json.loads(line)
                        flows.append(flow_data)
                    except json.JSONDecodeError:
                        continue

        print(f"✅ Loaded {len(flows)} flows from {latest_log}")

        # Find successful login and logout events
        successful_events = []

        for i, flow in enumerate(flows):
            # Look for successful login events
            if (
                flow.get("host") == "id.meijer.com"
                and flow.get("path", "").startswith("/oauth2/default/v1/authorize")
                and "login_hint" in flow.get("url", "")
                and flow.get("status_code") == 200
            ):
                print(f"🎯 Found successful login event at flow {i}")
                successful_events.append(
                    {"type": "login_authorize", "flow_index": i, "flow": flow}
                )

            # Look for logout events
            elif (
                flow.get("host") == "id.meijer.com"
                and flow.get("path") == "/oauth2/default/v1/logout"
                and flow.get("status_code") == 200
            ):
                print(f"🎯 Found successful logout event at flow {i}")
                successful_events.append(
                    {"type": "logout", "flow_index": i, "flow": flow}
                )

            # Look for device nonce requests
            elif (
                flow.get("host") == "id.meijer.com"
                and flow.get("path") == "/api/v1/internal/device/nonce"
                and flow.get("method") == "POST"
                and flow.get("status_code") == 200
            ):
                print(f"🎯 Found device nonce request at flow {i}")
                successful_events.append(
                    {"type": "device_nonce", "flow_index": i, "flow": flow}
                )

            # Look for challenge answer (password submission)
            elif (
                flow.get("host") == "id.meijer.com"
                and flow.get("path") == "/idp/idx/challenge/answer"
                and flow.get("method") == "POST"
                and flow.get("status_code") == 200
            ):
                print(f"🎯 Found challenge answer (password) at flow {i}")
                successful_events.append(
                    {"type": "challenge_answer", "flow_index": i, "flow": flow}
                )

            # Look for OAuth keys request
            elif (
                flow.get("host") == "id.meijer.com"
                and flow.get("path", "").startswith("/oauth2/default/v1/keys")
                and flow.get("status_code") == 200
            ):
                print(f"🎯 Found OAuth keys request at flow {i}")
                successful_events.append(
                    {"type": "oauth_keys", "flow_index": i, "flow": flow}
                )

            # Look for token exchange
            elif (
                flow.get("host") == "id.meijer.com"
                and flow.get("path") == "/oauth2/default/v1/token"
                and flow.get("method") == "POST"
                and flow.get("status_code") == 200
            ):
                print(f"🎯 Found token exchange at flow {i}")
                successful_events.append(
                    {"type": "token_exchange", "flow_index": i, "flow": flow}
                )

        # Analyze the events in chronological order
        successful_events.sort(key=lambda x: x["flow_index"])

        print(f"\n📊 Found {len(successful_events)} successful events:")
        for event in successful_events:
            print(f"  - {event['type']} (flow {event['flow_index']})")

        # Extract complete workflow details
        workflow_details = []
        for event in successful_events:
            flow = event["flow"]
            details = {
                "type": event["type"],
                "flow_index": event["flow_index"],
                "url": flow.get("url"),
                "method": flow.get("method"),
                "status_code": flow.get("status_code"),
                "request_headers": flow.get("request_headers", {}),
                "response_headers": flow.get("response_headers", {}),
                "cookies": flow.get("cookies", {}),
                "request_body": flow.get("request_body"),
                "response_body": flow.get("response_body"),
            }
            workflow_details.append(details)

        # Save detailed analysis
        output_file = "latest_successful_login_analysis.json"
        with open(output_file, "w") as f:
            json.dump(workflow_details, f, indent=2)

        print(f"\n💾 Complete workflow analysis saved to: {output_file}")

        # Print summary of key findings
        print("\n" + "=" * 80)
        print("🔑 KEY WORKFLOW FINDINGS")
        print("=" * 80)

        for event in workflow_details:
            print(f"\n📋 {event['type'].upper()}:")
            print(f"  URL: {event['url']}")
            print(f"  Method: {event['method']}")
            print(f"  Status: {event['status_code']}")

            if event["cookies"]:
                print(f"  Cookies: {len(event['cookies'])} cookies")

            if event["request_body"]:
                print(f"  Request Body: {len(str(event['request_body']))} chars")

            if event["response_body"]:
                print(f"  Response Body: {len(str(event['response_body']))} chars")

        return workflow_details

    except Exception as e:
        print(f"❌ Error analyzing log file: {e}")
        import traceback

        traceback.print_exc()
        return None


if __name__ == "__main__":
    analyze_latest_log()
