#!/usr/bin/env python3
"""
Targeted search for fulfillment API calls in mitmproxy logs.
"""

import json
import re
from pathlib import Path
from typing import Any, Dict, List


def search_log_file(log_file: Path, search_terms: List[str]) -> Dict[str, Any]:
    """Search a log file for specific terms and extract context."""
    print(f"Searching {log_file} for: {', '.join(search_terms)}")

    results = {"file": str(log_file), "matches": []}

    try:
        with open(log_file, "rb") as f:
            content = f.read()

        # Try different encodings
        decoded_content = None
        for encoding in ["utf-8", "latin-1", "cp1252"]:
            try:
                decoded_content = content.decode(encoding, errors="ignore")
                break
            except UnicodeDecodeError:
                continue

        if decoded_content is None:
            print(f"  Could not decode {log_file}")
            return results

        # Search for each term
        for term in search_terms:
            pattern = re.compile(re.escape(term), re.IGNORECASE)
            matches = pattern.finditer(decoded_content)

            for match in matches:
                # Get context around the match
                start = max(0, match.start() - 500)
                end = min(len(decoded_content), match.end() + 500)
                context = decoded_content[start:end]

                # Look for HTTP request/response patterns
                http_info = extract_http_info(context, term)

                match_info = {
                    "term": term,
                    "position": match.start(),
                    "context": context.strip(),
                    "http_info": http_info,
                }

                results["matches"].append(match_info)

        print(f"  Found {len(results['matches'])} matches")

    except Exception as e:
        print(f"  Error processing {log_file}: {e}")
        results["error"] = str(e)

    return results


def extract_http_info(context: str, search_term: str) -> Dict[str, Any]:
    """Extract HTTP request/response information from context."""
    http_info = {
        "method": None,
        "url": None,
        "status_code": None,
        "headers": {},
        "body": None,
    }

    # Look for HTTP method and URL
    method_url_match = re.search(r"(GET|POST|PATCH|DELETE|PUT)\s+([^\s\r\n]+)", context)
    if method_url_match:
        http_info["method"] = method_url_match.group(1)
        http_info["url"] = method_url_match.group(2)

    # Look for HTTP status code
    status_match = re.search(r"HTTP/[0-9.]+ (\d+)", context)
    if status_match:
        http_info["status_code"] = status_match.group(1)

    # Look for headers
    header_pattern = r"([A-Za-z0-9\-]+):\s*([^\r\n]+)"
    header_matches = re.findall(header_pattern, context)
    for header_name, header_value in header_matches:
        http_info["headers"][header_name] = header_value.strip()

    # Look for JSON body
    json_match = re.search(r'\{[^{}]*"', context)
    if json_match:
        # Try to extract the full JSON
        start = json_match.start()
        brace_count = 0
        for i, char in enumerate(context[start:], start):
            if char == "{":
                brace_count += 1
            elif char == "}":
                brace_count -= 1
                if brace_count == 0:
                    try:
                        json_str = context[start : i + 1]
                        json.loads(json_str)  # Validate JSON
                        http_info["body"] = json_str
                    except json.JSONDecodeError:
                        pass
                    break

    return http_info


def main():
    """Main search function."""
    print("Targeted search for fulfillment API calls in mitmproxy logs...")

    # Search terms based on what we know exists
    search_terms = [
        "reservationslots",
        "fulfillment",
        "pickup",
        "delivery",
        "slot",
        "time",
        "reservation",
    ]

    # Find log files
    log_files = list(Path(".").rglob("*.log")) + list(Path(".").rglob("*.flow"))
    log_files = sorted(log_files, key=lambda x: x.stat().st_mtime, reverse=True)

    if not log_files:
        print("No log files found!")
        return

    print(f"Found {len(log_files)} log files")

    all_results = []

    # Search the most recent log file first
    for log_file in log_files[:2]:  # Limit to 2 most recent
        results = search_log_file(log_file, search_terms)
        all_results.append(results)

        if results["matches"]:
            print(f"\n=== MATCHES IN {log_file.name} ===")
            for match in results["matches"][:5]:  # Show first 5 matches
                print(f"\nTerm: {match['term']}")
                print(f"Position: {match['position']}")

                if match["http_info"]["method"]:
                    print(
                        f"HTTP: {match['http_info']['method']} {match['http_info']['url']}"
                    )

                if match["http_info"]["status_code"]:
                    print(f"Status: {match['http_info']['status_code']}")

                if match["http_info"]["headers"]:
                    print(f"Headers: {dict(match['http_info']['headers'])}")

                if match["http_info"]["body"]:
                    print(f"Body: {match['http_info']['body'][:200]}...")

                print(f"Context: {match['context'][:300]}...")

    # Save results
    output_file = "targeted_fulfillment_search.json"
    with open(output_file, "w") as f:
        json.dump(all_results, f, indent=2)

    print(f"\nDetailed results saved to {output_file}")


if __name__ == "__main__":
    main()
