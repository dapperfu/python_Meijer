#!/usr/bin/env python3
"""
Email 2FA Handler for Meijer Authentication

This module handles 2FA authentication via email by connecting to IMAP servers
and parsing verification codes from emails.
"""

import imaplib
import logging
import re
import ssl
import time
from pathlib import Path
from typing import Dict, List, Optional

from .auth import get_meijer_config_path


class Email2FAHandler:
    """
    Handles 2FA authentication via email verification codes.

    Connects to IMAP servers, searches for verification emails, and extracts
    the N-digit verification codes needed for authentication.
    """

    def __init__(self, email_config_file: Optional[str] = None):
        """
        Initialize the email 2FA handler.

        Args:
            email_config_file: Path to email configuration file. If None, uses
                              default location ~/.config/meijer/email.txt
        """
        if email_config_file is None:
            email_config_file = get_meijer_config_path("email.txt")

        self.email_config_file = email_config_file
        self.logger = logging.getLogger(__name__)
        self.email_config = self._load_email_config()

    def _load_email_config(self) -> Dict[str, str]:
        """
        Load email configuration from the config file.

        Returns:
            Dictionary containing email server configuration

        Raises:
            FileNotFoundError: If email config file doesn't exist
            ValueError: If email config is malformed
        """
        if not Path(self.email_config_file).exists():
            raise FileNotFoundError(
                f"Email configuration file not found: {self.email_config_file}\n"
                f"Please create this file with the following format:\n"
                f"server=imap.gmail.com\n"
                f"port=993\n"
                f"username=your_email@gmail.com\n"
                f"password=your_app_password\n"
                f"use_ssl=true\n"
                f"search_subject=verification\n"
                f"search_sender=meijer\n"
                f"code_pattern=\\b\\d{{6}}\\b"
            )

        config = {}
        try:
            with open(self.email_config_file, "r", encoding="utf-8") as f:
                for line in f:
                    line = line.strip()
                    if line and not line.startswith("#"):
                        if "=" in line:
                            key, value = line.split("=", 1)
                            config[key.strip()] = value.strip()
        except Exception as e:
            raise ValueError(f"Failed to parse email config file: {e}")

        # Validate required fields
        required_fields = ["server", "username", "password"]
        missing_fields = [field for field in required_fields if field not in config]
        if missing_fields:
            raise ValueError(f"Missing required email config fields: {missing_fields}")

        # Set defaults for optional fields
        config.setdefault("port", "993")
        config.setdefault("use_ssl", "true")
        config.setdefault("search_subject", "verification")
        config.setdefault("search_sender", "meijer")
        config.setdefault("code_pattern", r"\b\d{6}\b")
        config.setdefault("max_wait_time", "300")  # 5 minutes
        config.setdefault("check_interval", "10")  # 10 seconds

        return config

    def _create_imap_connection(self) -> imaplib.IMAP4_SSL:
        """
        Create and return an IMAP connection with SSL.

        Returns:
            IMAP4_SSL connection object

        Raises:
            ConnectionError: If connection fails
        """
        try:
            # Create SSL context that accepts all certificates
            ssl_context = ssl.create_default_context()
            ssl_context.check_hostname = False
            ssl_context.verify_mode = ssl.CERT_NONE

            # Parse port
            port = int(self.email_config["port"])
            use_ssl = self.email_config["use_ssl"].lower() == "true"

            if use_ssl:
                # Connect with SSL
                connection: imaplib.IMAP4_SSL = imaplib.IMAP4_SSL(
                    self.email_config["server"], port, ssl_context=ssl_context
                )
            else:
                # Connect without SSL (not recommended)
                temp_connection = imaplib.IMAP4(self.email_config["server"], port)
                temp_connection.starttls(ssl_context=ssl_context)
                connection = temp_connection  # type: ignore

            self.logger.info(
                f"✅ Connected to IMAP server: {self.email_config['server']}:{port}"
            )
            return connection

        except Exception as e:
            raise ConnectionError(f"Failed to connect to IMAP server: {e}")

    def _login_to_imap(self, connection: imaplib.IMAP4_SSL) -> bool:
        """
        Login to the IMAP server.

        Args:
            connection: IMAP connection object

        Returns:
            True if login successful, False otherwise
        """
        try:
            username = self.email_config["username"]
            password = self.email_config["password"]

            connection.login(username, password)
            self.logger.info(f"✅ Logged in to IMAP server as {username}")
            return True

        except Exception as e:
            self.logger.error(f"❌ Failed to login to IMAP server: {e}")
            return False

    def _search_for_verification_emails(
        self, connection: imaplib.IMAP4_SSL
    ) -> List[str]:
        """
        Search for verification emails in the inbox.

        Args:
            connection: IMAP connection object

        Returns:
            List of email UIDs that match the search criteria
        """
        try:
            # Select inbox
            connection.select("INBOX")

            # Build search criteria
            search_criteria = []

            # Search by subject
            if self.email_config["search_subject"]:
                search_criteria.append(
                    f'SUBJECT "{self.email_config["search_subject"]}"'
                )

            # Search by sender
            if self.email_config["search_sender"]:
                search_criteria.append(f'FROM "{self.email_config["search_sender"]}"')

            # Search for recent emails (last 1 hour)
            search_criteria.append('SINCE "1 hour ago"')

            # Combine search criteria
            search_string = " ".join(search_criteria)
            self.logger.info(f"🔍 Searching emails with criteria: {search_string}")

            # Perform search
            status, data = connection.search(None, search_string)
            if status != "OK":
                self.logger.error(f"❌ Email search failed: {status}")
                return []

            # Parse UIDs
            if isinstance(data[0], bytes):
                uids = data[0].decode().split()
            elif isinstance(data[0], int):
                uids = str(data[0]).split()
            else:
                uids = str(data[0]).split()
            self.logger.info(f"📧 Found {len(uids)} matching emails")
            return uids

        except Exception as e:
            self.logger.error(f"❌ Error searching for verification emails: {e}")
            return []

    def _extract_verification_code(self, email_content: str) -> Optional[str]:
        """
        Extract verification code from email content using regex pattern.

        Args:
            email_content: Raw email content

        Returns:
            Verification code if found, None otherwise
        """
        try:
            pattern = self.email_config["code_pattern"]
            matches = re.findall(pattern, email_content)

            if matches:
                # Return the first match
                code = matches[0]
                self.logger.info(f"✅ Found verification code: {code}")
                return code
            else:
                self.logger.debug("No verification code found in email content")
                return None

        except Exception as e:
            self.logger.error(f"❌ Error extracting verification code: {e}")
            return None

    def _get_email_content(
        self, connection: imaplib.IMAP4_SSL, uid: str
    ) -> Optional[str]:
        """
        Get the content of a specific email by UID.

        Args:
            connection: IMAP connection object
            uid: Email UID

        Returns:
            Email content if successful, None otherwise
        """
        try:
            # Fetch email content
            status, data = connection.fetch(uid, "(RFC822)")
            if status != "OK":
                self.logger.error(f"❌ Failed to fetch email {uid}: {status}")
                return None

            # Parse email content
            email_content = data[0][1].decode("utf-8", errors="ignore")
            return email_content

        except Exception as e:
            self.logger.error(f"❌ Error getting email content for {uid}: {e}")
            return None

    def wait_for_verification_code(
        self, timeout_seconds: Optional[int] = None
    ) -> Optional[str]:
        """
        Wait for a verification code to arrive via email.

        Args:
            timeout_seconds: Maximum time to wait in seconds. If None, uses
                           max_wait_time from config.

        Returns:
            Verification code if found within timeout, None otherwise
        """
        if timeout_seconds is None:
            timeout_seconds = int(self.email_config["max_wait_time"])

        check_interval = int(self.email_config["check_interval"])

        self.logger.info(
            f"⏳ Waiting for verification code (timeout: {timeout_seconds}s, check every: {check_interval}s)"
        )

        start_time = time.time()

        while time.time() - start_time < timeout_seconds:
            try:
                # Create connection
                connection = self._create_imap_connection()

                # Login
                if not self._login_to_imap(connection):
                    connection.logout()
                    time.sleep(check_interval)
                    continue

                # Search for verification emails
                uids = self._search_for_verification_emails(connection)

                # Check each email for verification code
                for uid in uids:
                    email_content = self._get_email_content(connection, uid)
                    if email_content:
                        code = self._extract_verification_code(email_content)
                        if code:
                            connection.logout()
                            return code

                # Close connection
                connection.logout()

                # Wait before next check
                self.logger.debug(
                    f"⏸️ No verification code found, waiting {check_interval}s..."
                )
                time.sleep(check_interval)

            except Exception as e:
                self.logger.error(f"❌ Error during verification code check: {e}")
                time.sleep(check_interval)

        self.logger.warning(
            f"⏰ Timeout reached ({timeout_seconds}s) - no verification code found"
        )
        return None

    def get_latest_verification_code(self) -> Optional[str]:
        """
        Get the most recent verification code without waiting.

        Returns:
            Latest verification code if found, None otherwise
        """
        try:
            # Create connection
            connection = self._create_imap_connection()

            # Login
            if not self._login_to_imap(connection):
                connection.logout()
                return None

            # Search for verification emails
            uids = self._search_for_verification_emails(connection)

            if not uids:
                connection.logout()
                return None

            # Get the most recent email (last UID)
            latest_uid = uids[-1]
            email_content = self._get_email_content(connection, latest_uid)

            # Close connection
            connection.logout()

            if email_content:
                return self._extract_verification_code(email_content)

            return None

        except Exception as e:
            self.logger.error(f"❌ Error getting latest verification code: {e}")
            return None

    def test_connection(self) -> bool:
        """
        Test the IMAP connection and authentication.

        Returns:
            True if connection and login successful, False otherwise
        """
        try:
            self.logger.info("🧪 Testing IMAP connection...")

            # Create connection
            connection = self._create_imap_connection()

            # Test login
            if not self._login_to_imap(connection):
                connection.logout()
                return False

            # Test basic operations
            connection.select("INBOX")
            status, data = connection.list()

            # Close connection
            connection.logout()

            if status == "OK":
                self.logger.info("✅ IMAP connection test successful")
                return True
            else:
                self.logger.error(f"❌ IMAP connection test failed: {status}")
                return False

        except Exception as e:
            self.logger.error(f"❌ IMAP connection test failed: {e}")
            return False


def create_email_config_template(config_path: Optional[str] = None) -> None:
    """
    Create a template email configuration file.

    Args:
        config_path: Path where to create the template. If None, uses default location.
    """
    if config_path is None:
        config_path = get_meijer_config_path("email.txt")

    template_content = """# Email Configuration for Meijer 2FA
# This file contains the configuration for connecting to your email server
# to retrieve 2FA verification codes.

# Email server settings
server=imap.gmail.com
port=993
username=your_email@gmail.com
password=your_app_password

# Security settings
use_ssl=true

# Search settings for verification emails
search_subject=verification
search_sender=meijer
code_pattern=\\b\\d{6}\\b

# Timing settings (in seconds)
max_wait_time=300
check_interval=10

# Notes:
# - For Gmail, you'll need to generate an "App Password" in your Google Account settings
# - The code_pattern should match the format of your verification codes (default: 6 digits)
# - search_subject and search_sender help filter relevant emails
# - max_wait_time is how long to wait for a code to arrive
# - check_interval is how often to check for new emails
"""

    # Ensure directory exists
    config_dir = Path(config_path).parent
    config_dir.mkdir(parents=True, exist_ok=True)

    # Write template
    with open(config_path, "w", encoding="utf-8") as f:
        f.write(template_content)

    print(f"✅ Email configuration template created: {config_path}")
    print("📝 Please edit this file with your actual email server details")
