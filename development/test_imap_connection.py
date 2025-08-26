w  #!/usr/bin/env python3
"""
Test IMAP Connection for Meijer 2FA

This script tests the IMAP connection to verify email configuration
and look for any existing emails from Meijer.
"""

import imaplib
import re
import os
from typing import Optional, Dict


def read_email_config() -> Optional[Dict[str, str]]:
    """Read email configuration from ~/.config/meijer/email.txt."""
    try:
        email_config_path = os.path.expanduser("~/.config/meijer/email.txt")

        if not os.path.exists(email_config_path):
            print(f"❌ Email config file not found: {email_config_path}")
            return None

        config = {}
        with open(email_config_path, "r") as f:
            lines = f.readlines()

        # Parse configuration (simple key=value format)
        for line in lines:
            line = line.strip()
            if line and not line.startswith("#") and "=" in line:
                key, value = line.split("=", 1)
                config[key.strip()] = value.strip()

        # Validate required fields
        required_fields = ["server", "port", "username", "password"]
        for field in required_fields:
            if field not in config:
                print(f"❌ Missing required email config field: {field}")
                return None

        # Convert port to int
        try:
            config["port"] = int(config["port"])
        except ValueError:
            print(f"❌ Invalid port number: {config['port']}")
            return None

        # Set SSL flag
        config["use_ssl"] = config.get("use_ssl", "true").lower() == "true"

        print(
            f"✅ Email configuration loaded: {config['username']}@{config['server']}:{config['port']}"
        )
        return config

    except Exception as e:
        print(f"❌ Error reading email config: {e}")
        return None


def test_imap_connection():
    """Test IMAP connection and look for Meijer emails."""
    try:
        print("📧 Testing IMAP Connection")
        print("=" * 50)

        # Read email configuration
        email_config = read_email_config()
        if not email_config:
            return False

        print(
            f"📧 Connecting to IMAP server: {email_config['server']}:{email_config['port']}"
        )

        # Connect to IMAP server
        if email_config["use_ssl"]:
            print("🔒 Using SSL connection...")
            mail = imaplib.IMAP4_SSL(email_config["server"], email_config["port"])
        else:
            print("🔓 Using non-SSL connection...")
            mail = imaplib.IMAP4(email_config["server"], email_config["port"])

        # Login
        print(f"🔑 Logging in as: {email_config['username']}")
        mail.login(email_config["username"], email_config["password"])
        print("✅ Connected to email server successfully!")

        # List available mailboxes
        print("\n📁 Available mailboxes:")
        _, mailboxes = mail.list()
        for mailbox in mailboxes[:10]:  # Show first 10
            print(f"   {mailbox.decode()}")

        # Select inbox
        print("\n📥 Selecting INBOX...")
        mail.select("INBOX")

        # Get inbox stats
        _, messages = mail.status("INBOX", "(MESSAGES)")
        print(f"📊 Inbox contains {messages[0].decode().split()[-1]} messages")

        # Search for recent emails from Meijer
        print("\n🔍 Searching for recent emails from Meijer...")
        try:
            # Try a simpler search first
            _, message_numbers = mail.search(None, 'FROM "meijer"')

            if message_numbers[0]:
                meijer_emails = message_numbers[0].split()
                print(f"✅ Found {len(meijer_emails)} emails from Meijer")

                # Show details of the most recent email
                latest_email_num = meijer_emails[-1]
                print(f"\n📧 Most recent Meijer email (ID: {latest_email_num}):")

                _, msg_data = mail.fetch(latest_email_num, "(RFC822)")
                email_body = msg_data[0][1].decode("utf-8", errors="ignore")

                # Look for verification codes with multiple patterns
                print("🔍 Looking for verification codes...")

                # First, try to find the actual email body content (not headers)
                email_lines = email_body.split("\n")

                # Look for content after the headers (usually after a blank line)
                body_start = 0
                for i, line in enumerate(email_lines):
                    if line.strip() == "":
                        body_start = i + 1
                        break

                # Extract just the email body content
                email_body_content = "\n".join(email_lines[body_start:])
                print(f"📄 Email body starts at line {body_start + 1}")

                # Look for verification codes in the body content only
                patterns = [
                    r"verification code[:\s]*(\d{6})",  # "verification code 123456"
                    r"code[:\s]*(\d{6})",  # "code 123456"
                    r"(\d{6})",  # Any 6-digit number in body
                ]

                found_codes = []
                for pattern in patterns:
                    matches = re.findall(pattern, email_body_content, re.IGNORECASE)
                    if matches:
                        found_codes.extend(matches)

                if found_codes:
                    print(f"🔑 Found verification codes in body: {found_codes}")
                else:
                    print("❌ No verification codes found in email body")

                # Show the email body content
                print("\n📄 Email body content (first 30 lines):")
                body_lines = email_lines[body_start : body_start + 30]
                for i, line in enumerate(body_lines):
                    if line.strip():
                        print(f"   {body_start + i + 1:2d}: {line}")

                # Look for any lines that might contain the verification code
                print("\n🔍 Looking for lines that might contain verification code:")
                verification_keywords = [
                    "verification",
                    "code",
                    "enter",
                    "verify",
                    "confirm",
                ]
                relevant_lines = []
                for line in body_lines:
                    if any(
                        keyword in line.lower() for keyword in verification_keywords
                    ):
                        relevant_lines.append(line)

                for line in relevant_lines:
                    print(f"   {line}")

                # Show more email content to debug
                print("\n📄 Full email content (first 20 lines):")
                lines = email_body.split("\n")
                for i, line in enumerate(lines[:20]):
                    if line.strip():
                        print(f"   {i + 1:2d}: {line}")

                # Look for any lines containing numbers
                print("\n🔍 Lines containing numbers:")
                number_lines = [line for line in lines if re.search(r"\d", line)]
                for i, line in enumerate(number_lines[:10]):
                    print(f"   {line}")

                # Show email subject and first few lines
                lines = email_body.split("\n")
                subject_line = next(
                    (line for line in lines if line.startswith("Subject:")),
                    "Subject: Not found",
                )
                print(f"📝 {subject_line}")

                # Show first few content lines
                content_lines = [
                    line
                    for line in lines
                    if line.strip()
                    and not line.startswith(("From:", "To:", "Subject:", "Date:", "-"))
                ]
                print("📄 Email content preview:")
                for i, line in enumerate(content_lines[:5]):
                    print(f"   {line[:100]}{'...' if len(line) > 100 else ''}")
                    if i >= 4:
                        break
            else:
                print("❌ No emails from Meijer found")
        except Exception as e:
            print(f"⚠️ Search error: {e}")
            print("🔍 Trying to list all emails...")

            # Try to get all emails
            _, message_numbers = mail.search(None, "ALL")
            if message_numbers[0]:
                all_emails = message_numbers[0].split()
                print(f"📊 Total emails in inbox: {len(all_emails)}")

                if len(all_emails) > 0:
                    # Show the most recent email
                    latest_email_num = all_emails[-1]
                    print(f"\n📧 Most recent email (ID: {latest_email_num}):")

                    _, msg_data = mail.fetch(latest_email_num, "(RFC822)")
                    email_body = msg_data[0][1].decode("utf-8", errors="ignore")

                    # Show email subject
                    lines = email_body.split("\n")
                    subject_line = next(
                        (line for line in lines if line.startswith("Subject:")),
                        "Subject: Not found",
                    )
                    from_line = next(
                        (line for line in lines if line.startswith("From:")),
                        "From: Not found",
                    )
                    print(f"📝 {subject_line}")
                    print(f"👤 {from_line}")

        # Test search for verification emails specifically
        print("\n🔍 Searching for verification emails...")
        try:
            _, verification_messages = mail.search(
                None, 'FROM "meijer" SUBJECT "verification"'
            )

            if verification_messages[0]:
                verification_emails = verification_messages[0].split()
                print(
                    f"✅ Found {len(verification_emails)} verification emails from Meijer"
                )
            else:
                print("❌ No verification emails found")
        except Exception as e:
            print(f"⚠️ Verification search error: {e}")

        # Close connection
        mail.close()
        mail.logout()
        print("\n✅ IMAP connection test completed successfully!")
        return True

    except Exception as e:
        print(f"❌ Error testing IMAP connection: {e}")
        return False


if __name__ == "__main__":
    test_imap_connection()
