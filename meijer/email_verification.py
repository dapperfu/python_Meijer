#!/usr/bin/env python3
"""
Email Verification Module for Meijer 2FA

This module provides a simple interface for retrieving verification codes
from email for Meijer's 2FA authentication.

Author: Claude Sonnet 4 (claude-3-5-sonnet-20241022)
Generated via Cursor IDE (cursor.sh) with AI assistance
"""

import imaplib
import os
import re
import time
from typing import Dict, Optional


class EmailVerificationError(Exception):
    """Exception raised when email verification fails."""
    pass


class EmailVerification:
    """Simple email verification code retrieval."""

    def __init__(self, config_path: Optional[str] = None):
        """Initialize email verification with optional config path."""
        self.config_path = config_path or os.path.expanduser("~/.config/meijer/email.txt")
        self.config = None

    def get_code(self, timeout: int = 300, check_interval: int = 10) -> Optional[str]:
        """
        Get verification code from email.
        
        Args:
            timeout: Maximum time to wait for code (seconds)
            check_interval: How often to check email (seconds)
            
        Returns:
            6-digit verification code or None if not found
            
        Raises:
            EmailVerificationError: If email configuration or connection fails
        """
        try:
            print("📧 Getting verification code from email...")
            
            # Load configuration
            self.config = self._load_config()
            if not self.config:
                raise EmailVerificationError("Failed to load email configuration")
            
            # Connect to IMAP
            mail = self._connect_imap()
            
            # Poll for verification code
            code = self._poll_for_code(mail, timeout, check_interval)
            
            # Cleanup
            mail.close()
            mail.logout()
            
            return code
            
        except Exception as e:
            raise EmailVerificationError(f"Failed to get verification code: {e}")

    def _load_config(self) -> Optional[Dict[str, str]]:
        """Load email configuration from file."""
        try:
            if not os.path.exists(self.config_path):
                print(f"❌ Email config file not found: {self.config_path}")
                print("💡 Run 'meijer auth imap' to set up email configuration")
                return None
            
            config = {}
            with open(self.config_path, 'r') as f:
                lines = f.readlines()
                
            # Parse configuration (simple key=value format)
            for line in lines:
                line = line.strip()
                if line and not line.startswith('#') and '=' in line:
                    key, value = line.split('=', 1)
                    config[key.strip()] = value.strip()
            
            # Validate required fields
            required_fields = ['server', 'port', 'username', 'password']
            for field in required_fields:
                if field not in config:
                    print(f"❌ Missing required email config field: {field}")
                    return None
            
            # Convert port to int
            try:
                config['port'] = int(config['port'])
            except ValueError:
                print(f"❌ Invalid port number: {config['port']}")
                return None
            
            # Set SSL flag
            config['use_ssl'] = config.get('use_ssl', 'true').lower() == 'true'
            
            print(f"✅ Email configuration loaded: {config['username']}")
            return config
            
        except Exception as e:
            print(f"❌ Error reading email config: {e}")
            return None

    def _connect_imap(self) -> imaplib.IMAP4:
        """Connect to IMAP server."""
        try:
            print(f"📧 Connecting to {self.config['server']}:{self.config['port']}")
            
            # Connect to IMAP server with timeout
            if self.config['use_ssl']:
                mail = imaplib.IMAP4_SSL(self.config['server'], self.config['port'])
            else:
                mail = imaplib.IMAP4(self.config['server'], self.config['port'])
            
            # Set socket timeout
            mail.sock.settimeout(30)  # 30 second timeout
            
            # Login
            mail.login(self.config['username'], self.config['password'])
            print("✅ Connected to email server")
            
            # Select inbox
            mail.select('INBOX')
            
            return mail
            
        except Exception as e:
            raise EmailVerificationError(f"Failed to connect to email server: {e}")

    def _poll_for_code(self, mail: imaplib.IMAP4, timeout: int, check_interval: int) -> Optional[str]:
        """Poll email for verification code."""
        print(f"⏳ Polling for verification code (timeout: {timeout}s)...")
        
        elapsed_time = 0
        while elapsed_time < timeout:
            try:
                print(f"   Checking email... (elapsed: {elapsed_time}s)")
                
                # Search for recent verification emails from Meijer (more specific search)
                search_criteria = '(FROM "meijer" SUBJECT "verification" SINCE "1 day ago")'
                _, message_numbers = mail.search(None, search_criteria)
                
                if message_numbers[0]:
                    # Get the most recent verification email
                    email_nums = message_numbers[0].split()
                    if email_nums:
                        latest_email_num = email_nums[-1]  # Last (most recent) email
                        print(f"📧 Found {len(email_nums)} verification emails, using latest")
                        
                        _, msg_data = mail.fetch(latest_email_num, '(RFC822)')
                        email_body = msg_data[0][1].decode('utf-8', errors='ignore')
                        
                        # Extract verification code using multiple patterns
                        code = self._extract_code(email_body)
                        if code:
                            print(f"✅ Found verification code: {code}")
                            return code
                        else:
                            print("⚠️ Email found but no verification code extracted")
                else:
                    print("   No verification emails found yet...")
                
                # Wait before next check
                time.sleep(check_interval)
                elapsed_time += check_interval
                
            except Exception as e:
                print(f"⚠️ Error checking email: {e}")
                time.sleep(check_interval)
                elapsed_time += check_interval
        
        print("❌ Timeout waiting for verification code")
        return None

    def _extract_code(self, email_body: str) -> Optional[str]:
        """Extract verification code from email body."""
        # Look for various patterns
        patterns = [
            r'Code:\s*\*?(\d{6})\*?',           # "Code: *123456*" or "Code: 123456"
            r'code[:\s]+\*?(\d{6})\*?',         # "code: 123456" or "code *123456*"
            r'verification code[:\s]+(\d{6})',   # "verification code: 123456"
            r'enter[:\s]+(\d{6})',              # "enter: 123456"
            r'(\d{6})',                         # Any 6-digit number (last resort)
        ]
        
        for pattern in patterns:
            matches = re.findall(pattern, email_body, re.IGNORECASE)
            if matches:
                # Return the first match that looks like a verification code
                return matches[0]
        
        return None

    def test_connection(self) -> bool:
        """Test email connection without polling for codes."""
        try:
            print("📧 Testing email connection...")
            
            # Load configuration
            self.config = self._load_config()
            if not self.config:
                return False
            
            # Connect to IMAP
            mail = self._connect_imap()
            
            # Get inbox stats
            _, messages = mail.status('INBOX', '(MESSAGES)')
            message_count = messages[0].decode().split()[-1]
            print(f"📊 Inbox contains {message_count} messages")
            
            # Look for existing Meijer emails
            _, message_numbers = mail.search(None, 'FROM "meijer"')
            if message_numbers[0]:
                meijer_count = len(message_numbers[0].split())
                print(f"✅ Found {meijer_count} emails from Meijer")
                
                # Test code extraction on the latest Meijer email
                if meijer_count > 0:
                    latest_email_num = message_numbers[0].split()[-1]
                    _, msg_data = mail.fetch(latest_email_num, '(RFC822)')
                    email_body = msg_data[0][1].decode('utf-8', errors='ignore')
                    
                    # Test code extraction
                    code = self._extract_code(email_body)
                    if code:
                        print(f"✅ Test code extraction successful: {code}")
                    else:
                        print("⚠️ Test code extraction failed - no code found in latest email")
            else:
                print("ℹ️ No emails from Meijer found")
            
            # Cleanup
            mail.close()
            mail.logout()
            
            print("✅ Email connection test successful!")
            return True
            
        except Exception as e:
            print(f"❌ Email connection test failed: {e}")
            return False

    def test_code_extraction(self) -> Optional[str]:
        """Test code extraction on the latest Meijer email."""
        try:
            print("🧪 Testing code extraction...")
            
            # Load configuration
            self.config = self._load_config()
            if not self.config:
                return None
            
            # Connect to IMAP
            mail = self._connect_imap()
            
            # Look for Meijer emails
            _, message_numbers = mail.search(None, 'FROM "meijer"')
            if message_numbers[0]:
                email_nums = message_numbers[0].split()
                if email_nums:
                    latest_email_num = email_nums[-1]
                    print(f"📧 Testing extraction on latest of {len(email_nums)} Meijer emails")
                    
                    _, msg_data = mail.fetch(latest_email_num, '(RFC822)')
                    email_body = msg_data[0][1].decode('utf-8', errors='ignore')
                    
                    # Extract verification code
                    code = self._extract_code(email_body)
                    
                    # Cleanup
                    mail.close()
                    mail.logout()
                    
                    if code:
                        print(f"✅ Code extraction successful: {code}")
                        return code
                    else:
                        print("❌ Code extraction failed - no code found")
                        return None
                else:
                    print("❌ No Meijer emails found")
                    mail.close()
                    mail.logout()
                    return None
            else:
                print("❌ No Meijer emails found")
                mail.close()
                mail.logout()
                return None
                
        except Exception as e:
            print(f"❌ Error testing code extraction: {e}")
            return None


# Simple convenience function
def get_code(timeout: int = 300) -> Optional[str]:
    """
    Simple function to get verification code from email.
    
    Args:
        timeout: Maximum time to wait for code (seconds)
        
    Returns:
        6-digit verification code or None if not found
    """
    verifier = EmailVerification()
    return verifier.get_code(timeout)


# Test the module
if __name__ == "__main__":
    verifier = EmailVerification()
    if verifier.test_connection():
        code = verifier.get_code(timeout=60)
        if code:
            print(f"🎉 Got verification code: {code}")
        else:
            print("❌ No verification code found")
