#!/usr/bin/env python3
"""
Find the specific login event with 2FA flow from the current log file.
This tool filters out all other traffic to focus on just the authentication sequence.
"""

import json
import re
from pathlib import Path
from typing import Dict, Any


def find_specific_login_event():
    """Find the specific login event with 2FA flow."""

    # Find the current log file
    log_dir = Path("logs")
    log_files = list(log_dir.glob("*.log"))
    log_files.sort(key=lambda x: x.stat().st_mtime, reverse=True)

    if not log_files:
        print("❌ No log files found")
        return

    current_log = log_files[0]
    print(f"🔍 Finding specific login event in: {current_log}")

    try:
        # Read the binary log file
        with open(current_log, "rb") as f:
            content = f.read()

        # Decode content
        decoded_content = content.decode("utf-8", errors="ignore")

        # Find the specific login sequence
        login_sequence = find_login_sequence(decoded_content)

        # Display the sequence
        display_login_sequence(login_sequence)

        # Save the sequence
        save_login_sequence(login_sequence, current_log)

    except Exception as e:
        print(f"❌ Error: {e}")
        import traceback

        traceback.print_exc()


def find_login_sequence(content: str) -> Dict[str, Any]:
    """Find the specific login sequence with 2FA."""

    login_sequence = {
        "initial_landing": None,
        "login_form_load": None,
        "username_submission": None,
        "password_challenge": None,
        "2fa_challenge": None,
        "2fa_verification": None,
        "oauth_redirect": None,
        "final_landing": None,
        "cookies_set": [],
        "headers_used": [],
    }

    # Look for the specific login flow sequence

    # 1. Initial landing on Meijer.com
    print("🔍 Looking for initial landing on Meijer.com...")
    landing_matches = re.finditer(r"GET.*meijer\.com.*HTTP", content, re.IGNORECASE)
    for match in landing_matches:
        context = extract_context(content, match.start(), 500)
        if "meijer.com" in context and "GET" in context:
            login_sequence["initial_landing"] = {
                "position": match.start(),
                "context": context,
                "type": "GET request to meijer.com",
            }
            break

    # 2. Redirect to Okta login
    print("🔍 Looking for redirect to Okta login...")
    okta_matches = re.finditer(
        r"id\.meijer\.com.*oauth2.*authorize", content, re.IGNORECASE
    )
    for match in okta_matches:
        context = extract_context(content, match.start(), 500)
        if "oauth2" in context and "authorize" in context:
            login_sequence["login_form_load"] = {
                "position": match.start(),
                "context": context,
                "type": "OAuth2 authorize request to id.meijer.com",
            }
            break

    # 3. Username submission
    print("🔍 Looking for username submission...")
    username_matches = re.finditer(
        r"POST.*id\.meijer\.com.*identify", content, re.IGNORECASE
    )
    for match in username_matches:
        context = extract_context(content, match.start(), 500)
        if "identify" in context and "POST" in context:
            login_sequence["username_submission"] = {
                "position": match.start(),
                "context": context,
                "type": "Username submission to identify endpoint",
            }
            break

    # 4. Password challenge
    print("🔍 Looking for password challenge...")
    password_matches = re.finditer(
        r"POST.*id\.meijer\.com.*challenge.*answer", content, re.IGNORECASE
    )
    for match in password_matches:
        context = extract_context(content, match.start(), 500)
        if "challenge" in context and "answer" in context:
            login_sequence["password_challenge"] = {
                "position": match.start(),
                "context": context,
                "type": "Password challenge answer",
            }
            break

    # 5. 2FA challenge (email verification)
    print("🔍 Looking for 2FA challenge...")
    twofa_matches = re.finditer(
        r"challenge.*email.*verification", content, re.IGNORECASE
    )
    for match in twofa_matches:
        context = extract_context(content, match.start(), 500)
        if "email" in context and "verification" in context:
            login_sequence["2fa_challenge"] = {
                "position": match.start(),
                "context": context,
                "type": "Email verification challenge",
            }
            break

    # 6. 2FA verification code submission
    print("🔍 Looking for 2FA verification...")
    verification_matches = re.finditer(
        r"POST.*challenge.*answer.*verification", content, re.IGNORECASE
    )
    for match in verification_matches:
        context = extract_context(content, match.start(), 500)
        if "verification" in context and "challenge" in context:
            login_sequence["2fa_verification"] = {
                "position": match.start(),
                "context": context,
                "type": "2FA verification code submission",
            }
            break

    # 7. OAuth redirect back to Meijer
    print("🔍 Looking for OAuth redirect...")
    redirect_matches = re.finditer(r"redirect.*meijer\.com", content, re.IGNORECASE)
    for match in redirect_matches:
        context = extract_context(content, match.start(), 500)
        if "meijer.com" in context and "redirect" in context:
            login_sequence["oauth_redirect"] = {
                "position": match.start(),
                "context": context,
                "type": "OAuth redirect back to Meijer",
            }
            break

    # 8. Final landing on Meijer.com (authenticated)
    print("🔍 Looking for final authenticated landing...")
    final_matches = re.finditer(r"GET.*meijer\.com.*HTTP.*200", content, re.IGNORECASE)
    for match in final_matches:
        context = extract_context(content, match.start(), 500)
        if "200" in context and "meijer.com" in context:
            login_sequence["final_landing"] = {
                "position": match.start(),
                "context": context,
                "type": "Final authenticated landing on Meijer.com",
            }
            break

    # 9. Cookies set during the login process
    print("🔍 Looking for cookies set during login...")
    cookie_matches = re.finditer(r"set-cookie.*JSESSIONID", content, re.IGNORECASE)
    for match in cookie_matches:
        context = extract_context(content, match.start(), 300)
        if "JSESSIONID" in context:
            login_sequence["cookies_set"].append(
                {
                    "position": match.start(),
                    "context": context,
                    "type": "JSESSIONID cookie",
                }
            )

    # 10. Headers used during login
    print("🔍 Looking for headers used during login...")
    header_matches = re.finditer(r"user-agent.*firefox", content, re.IGNORECASE)
    for match in header_matches:
        context = extract_context(content, match.start(), 300)
        if "firefox" in context:
            login_sequence["headers_used"].append(
                {
                    "position": match.start(),
                    "context": context,
                    "type": "Firefox User-Agent",
                }
            )

    return login_sequence


def extract_context(content: str, position: int, context_size: int) -> str:
    """Extract context around a position in the content."""
    start = max(0, position - context_size)
    end = min(len(content), position + context_size)
    context = content[start:end]

    # Clean up the context
    context = re.sub(r"\s+", " ", context).strip()
    return context


def display_login_sequence(login_sequence: Dict[str, Any]) -> None:
    """Display the found login sequence."""

    print("\n" + "=" * 80)
    print("🔐 SPECIFIC LOGIN EVENT WITH 2FA FLOW")
    print("=" * 80)

    # Check if we found the complete sequence
    found_stages = []
    for stage, data in login_sequence.items():
        if data is not None and data != []:
            if isinstance(data, list):
                found_stages.append(f"{stage}: {len(data)} items")
            else:
                found_stages.append(f"{stage}: found")
        else:
            found_stages.append(f"{stage}: NOT FOUND")

    print("\n📊 Login sequence status:")
    for stage in found_stages:
        print(f"   • {stage}")

    # Display the sequence in chronological order
    print("\n" + "=" * 80)
    print("🔄 LOGIN SEQUENCE TIMELINE")
    print("=" * 80)

    # Sort stages by position to get chronological order
    timeline = []
    for stage, data in login_sequence.items():
        if data is not None and data != []:
            if isinstance(data, list):
                for item in data:
                    timeline.append(
                        {
                            "stage": stage,
                            "position": item["position"],
                            "type": item["type"],
                            "context": item["context"][:200],
                        }
                    )
            else:
                timeline.append(
                    {
                        "stage": stage,
                        "position": data["position"],
                        "type": data["type"],
                        "context": data["context"][:200],
                    }
                )

    # Sort by position
    timeline.sort(key=lambda x: x["position"])

    if timeline:
        print(f"\n📅 Chronological sequence of {len(timeline)} events:")
        for i, event in enumerate(timeline):
            print(f"   {i + 1:2d}. [{event['stage']:20s}] {event['type']}")
            print(f"       Context: {event['context']}...")
            print(f"       Position: {event['position']}")
            print()
    else:
        print("\n❌ No login sequence found!")

    # Look for specific 2FA patterns
    print("\n" + "=" * 80)
    print("📱 2FA SPECIFIC ANALYSIS")
    print("=" * 80)

    if login_sequence["2fa_challenge"]:
        print("✅ 2FA Challenge found:")
        print(f"   Type: {login_sequence['2fa_challenge']['type']}")
        print(f"   Context: {login_sequence['2fa_challenge']['context'][:300]}...")

    if login_sequence["2fa_verification"]:
        print("✅ 2FA Verification found:")
        print(f"   Type: {login_sequence['2fa_verification']['type']}")
        print(f"   Context: {login_sequence['2fa_verification']['context'][:300]}...")

    # Check for email verification specifically
    if (
        login_sequence["2fa_challenge"]
        and "email" in login_sequence["2fa_challenge"]["context"].lower()
    ):
        print("✅ Email-based 2FA confirmed!")

    # Check for successful authentication
    if login_sequence["final_landing"]:
        print("✅ Successful authentication confirmed!")
        print(
            f"   Final landing: {login_sequence['final_landing']['context'][:200]}..."
        )


def save_login_sequence(login_sequence: Dict[str, Any], log_file: Path) -> None:
    """Save the login sequence to a JSON file."""

    output_file = f"specific_login_event_{log_file.stem}.json"

    # Convert any non-serializable objects
    serializable_sequence = {}
    for stage, data in login_sequence.items():
        if isinstance(data, list):
            serializable_sequence[stage] = []
            for item in data:
                serializable_sequence[stage].append(
                    {
                        "position": item["position"],
                        "type": item["type"],
                        "context": item["context"][:500],
                    }
                )
        elif data is not None:
            serializable_sequence[stage] = {
                "position": data["position"],
                "type": data["type"],
                "context": data["context"][:500],
            }
        else:
            serializable_sequence[stage] = None

    with open(output_file, "w") as f:
        json.dump(serializable_sequence, f, indent=2)

    print(f"\n💾 Login sequence saved to: {output_file}")


if __name__ == "__main__":
    find_specific_login_event()
