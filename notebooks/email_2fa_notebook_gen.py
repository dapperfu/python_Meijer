#!/usr/bin/env python3
"""
Generate Jupyter notebook for Meijer email_2fa.py

This script creates a comprehensive notebook demonstrating the email-based
two-factor authentication functionality available in the Meijer API client.
"""

import nbformat as nbf

def create_email_2fa_notebook():
    """Create the email 2FA notebook"""
    
    # Create notebook
    nb = nbf.v4.new_notebook()
    
    # Title and description
    title_cell = nbf.v4.new_markdown_cell("""# [MAIL] Meijer Email 2FA Authentication

This notebook demonstrates the email-based two-factor authentication (2FA)
functionality implemented in the Meijer API client.

## Features Demonstrated

- **Email 2FA setup** and configuration
- **Authentication flow** management
- **Code verification** and validation
- **Session management** and security
- **Error handling** and recovery
- **Integration** with main authentication system

## What You'll Learn

1. How to set up email 2FA authentication
2. How to handle the 2FA verification flow
3. How to manage authentication sessions securely
4. How to handle common 2FA errors and issues
5. Best practices for implementing 2FA in your applications

---

*Generated on: 2025-08-21 22:50:00*""")
    
    # Setup cell
    setup_cell = nbf.v4.new_code_cell("""# Install required packages if not already installed
# !pip install requests beautifulsoup4 imaplib email

# Import required libraries
import logging
import json
import time
import re
from typing import Dict, List, Optional, Union
from datetime import datetime, timedelta
import email
import imaplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart

# Configure logging for better visibility
logging.basicConfig(
    level=logging.INFO,
    format='%(asctime)s - %(levelname)s - %(message)s'
)

print("[OK] Dependencies imported successfully")""")
    
    # Client initialization cell
    client_cell = nbf.v4.new_code_cell("""## [LOCK] Initialize Meijer Client

Set up the Meijer API client with authentication for email 2FA operations.

# Import the Meijer client and email 2FA module
from meijer import Meijer
from meijer.email_2fa import Email2FA

# Initialize the client
try:
    client = Meijer()
    print("[OK] Meijer client initialized successfully")
    
    # Check authentication status
    if client._ensure_authenticated():
        print("[OK] Client is authenticated and ready for 2FA operations")
    else:
        print("[WARN] Client is not authenticated - 2FA may not work")
        
except Exception as e:
    print(f"[X] Failed to initialize Meijer client: {e}")
    print("\\nTo fix this, ensure you have valid authentication credentials")
    raise""")
    
    # Email 2FA setup cell
    setup_2fa_cell = nbf.v4.new_code_cell("""## [MAIL] Email 2FA Setup

Set up email-based two-factor authentication for enhanced security.

# Example 1: Set up email 2FA
print("[MAIL] Setting up email 2FA authentication...")
print("=" * 60)

# Initialize email 2FA handler
try:
    email_2fa = Email2FA()
    print("[OK] Email 2FA handler initialized")
    
    # Configure email settings (example configuration)
    email_config = {
        'email': 'user@example.com',
        'password': 'app_password',  # Use app-specific password
        'imap_server': 'imap.gmail.com',
        'imap_port': 993,
        'smtp_server': 'smtp.gmail.com',
        'smtp_port': 587
    }
    
    print("\\n[CONFIG] Email Configuration:")
    print(f"  Email: {email_config['email']}")
    print(f"  IMAP Server: {email_config['imap_server']}:{email_config['imap_port']}")
    print(f"  SMTP Server: {email_config['smtp_server']}:{email_config['smtp_port']}")
    
    # Note: In real usage, you would configure these settings
    print("\\n[NOTE] This is a demonstration configuration.")
    print("In production, use secure credential management.")
    
except Exception as e:
    print(f"[X] Failed to initialize Email 2FA: {e}")
    raise""")
    
    # Authentication flow cell
    auth_flow_cell = nbf.v4.new_code_cell("""## [FLOW] 2FA Authentication Flow

Demonstrate the complete 2FA authentication flow from login to verification.

# Example 2: Complete 2FA authentication flow
print("[FLOW] Demonstrating 2FA authentication flow...")
print("=" * 60)

# Simulate the authentication flow
print("1. [LOGIN] User attempts to log in with username/password")
print("2. [2FA] System detects 2FA is enabled for the account")
print("3. [CODE] System sends verification code via email")
print("4. [INPUT] User enters the verification code")
print("5. [VERIFY] System validates the code")
print("6. [SESSION] If valid, user is authenticated and session created")

print("\\n[FLOW] Detailed Flow Steps:")

# Step 1: Login attempt
print("\\n[STEP 1] Login Attempt:")
print("  - Username: user@example.com")
print("  - Password: ********")
print("  - 2FA Required: Yes")

# Step 2: 2FA trigger
print("\\n[STEP 2] 2FA Trigger:")
print("  - System detects 2FA requirement")
print("  - Generates unique verification code")
print("  - Sends code via email to registered address")
print("  - Code expires in 10 minutes")

# Step 3: Code delivery
print("\\n[STEP 3] Code Delivery:")
print("  - Email sent to: user@example.com")
print("  - Subject: 'Meijer Verification Code'")
print("  - Body contains: 6-digit verification code")
print("  - Sent from: noreply@meijer.com")

# Step 4: User input
print("\\n[STEP 4] User Input:")
print("  - User checks email for verification code")
print("  - Enters code in 2FA prompt")
print("  - Submits for validation")

# Step 5: Verification
print("\\n[STEP 5] Code Verification:")
print("  - System validates entered code")
print("  - Checks code expiration")
print("  - Verifies code matches sent code")
print("  - Determines authentication success/failure")

# Step 6: Session creation
print("\\n[STEP 6] Session Creation:")
print("  - If valid: Create authenticated session")
print("  - If invalid: Show error and retry")
print("  - Session includes 2FA verification timestamp")
print("  - User can now access protected resources")""")
    
    # Code verification cell
    code_verification_cell = nbf.v4.new_code_cell("""## [VERIFY] Code Verification and Validation

Demonstrate how to verify and validate 2FA verification codes.

# Example 3: Code verification process
print("[VERIFY] Code verification and validation...")
print("=" * 60)

# Simulate verification code handling
class MockVerificationCode:
    def __init__(self, code: str, expires_at: datetime):
        self.code = code
        self.expires_at = expires_at
        self.attempts = 0
        self.max_attempts = 3
    
    def is_expired(self) -> bool:
        """Check if the verification code has expired"""
        return datetime.now() > self.expires_at
    
    def verify(self, input_code: str) -> Dict[str, any]:
        """Verify the input code against the stored code"""
        self.attempts += 1
        
        if self.attempts > self.max_attempts:
            return {
                'valid': False,
                'error': 'Too many attempts. Please request a new code.',
                'locked': True
            }
        
        if self.is_expired():
            return {
                'valid': False,
                'error': 'Verification code has expired.',
                'expired': True
            }
        
        if input_code == self.code:
            return {
                'valid': True,
                'message': 'Code verified successfully!',
                'attempts': self.attempts
            }
        else:
            remaining_attempts = self.max_attempts - self.attempts
            return {
                'valid': False,
                'error': f'Invalid code. {remaining_attempts} attempts remaining.',
                'attempts': self.attempts
            }

# Create a mock verification code
verification_code = MockVerificationCode(
    code="123456",
    expires_at=datetime.now() + timedelta(minutes=10)
)

print(f"Verification Code Generated: {verification_code.code}")
print(f"Expires At: {verification_code.expires_at.strftime('%Y-%m-%d %H:%M:%S')}")
print(f"Max Attempts: {verification_code.max_attempts}")

# Test various verification scenarios
test_codes = ["123456", "654321", "123456", "111111"]

print("\\n[TEST] Testing Code Verification:")
for i, test_code in enumerate(test_codes, 1):
    print(f"\\nTest {i}: Entering code '{test_code}'")
    result = verification_code.verify(test_code)
    
    if result['valid']:
        print(f"  [OK] {result['message']}")
        print(f"  Attempts used: {result['attempts']}")
        break
    else:
        print(f"  [X] {result['error']}")
        if result.get('locked'):
            print("  [LOCKED] Account temporarily locked")
            break
        elif result.get('expired'):
            print("  [EXPIRED] Code has expired")
            break""")
    
    # Email integration cell
    email_integration_cell = nbf.v4.new_code_cell("""## [INTEGRATION] Email Integration

Demonstrate how to integrate with email systems for 2FA code delivery.

# Example 4: Email integration for 2FA
print("[INTEGRATION] Email integration for 2FA...")
print("=" * 60)

# Simulate email operations
class MockEmailHandler:
    def __init__(self, email_config: Dict[str, str]):
        self.email = email_config['email']
        self.imap_server = email_config['imap_server']
        self.imap_port = email_config['imap_port']
        self.smtp_server = email_config['smtp_server']
        self.smtp_port = email_config['smtp_port']
    
    def send_verification_email(self, to_email: str, code: str) -> bool:
        """Send verification code via email"""
        try:
            print(f"[SEND] Sending verification code to {to_email}")
            print(f"  Code: {code}")
            print(f"  From: {self.email}")
            print(f"  Subject: 'Meijer Verification Code'")
            
            # Simulate email sending
            print("  [SMTP] Connecting to SMTP server...")
            print(f"  [SMTP] Server: {self.smtp_server}:{self.smtp_port}")
            print("  [SMTP] Authenticating...")
            print("  [SMTP] Sending email...")
            print("  [SMTP] Email sent successfully!")
            
            return True
            
        except Exception as e:
            print(f"  [X] Failed to send email: {e}")
            return False
    
    def check_for_verification_email(self, expected_from: str = "noreply@meijer.com") -> Optional[str]:
        """Check for verification email and extract code"""
        try:
            print(f"[CHECK] Checking for verification email from {expected_from}")
            print("  [IMAP] Connecting to IMAP server...")
            print(f"  [IMAP] Server: {self.imap_server}:{self.imap_port}")
            print("  [IMAP] Authenticating...")
            print("  [IMAP] Searching for verification emails...")
            
            # Simulate finding verification email
            print("  [IMAP] Found verification email!")
            print("  [IMAP] Extracting verification code...")
            
            # Simulate code extraction
            extracted_code = "123456"
            print(f"  [IMAP] Code extracted: {extracted_code}")
            
            return extracted_code
            
        except Exception as e:
            print(f"  [X] Failed to check email: {e}")
            return None

# Create email handler
email_config = {
    'email': 'user@example.com',
    'imap_server': 'imap.gmail.com',
    'imap_port': 993,
    'smtp_server': 'smtp.gmail.com',
    'smtp_port': 587
}

email_handler = MockEmailHandler(email_config)

# Test email operations
print("\\n[TEST] Testing Email Operations:")

# Send verification email
verification_code = "789012"
send_success = email_handler.send_verification_email("user@example.com", verification_code)

if send_success:
    print("\\n[OK] Verification email sent successfully")
    
    # Check for verification email
    print("\\n[CHECK] Checking for verification email...")
    extracted_code = email_handler.check_for_verification_email()
    
    if extracted_code:
        print(f"\\n[OK] Verification code extracted: {extracted_code}")
        if extracted_code == verification_code:
            print("[MATCH] Code matches sent code!")
        else:
            print("[MISMATCH] Code does not match sent code")
    else:
        print("\\n[X] Failed to extract verification code")
else:
    print("\\n[X] Failed to send verification email")""")
    
    # Security features cell
    security_features_cell = nbf.v4.new_code_cell("""## [SECURITY] Security Features and Best Practices

Explore security features and best practices for implementing email 2FA.

# Example 5: Security features and best practices
print("[SECURITY] Security features and best practices...")
print("=" * 60)

# Security features demonstration
print("1. **Code Generation Security:**")
print("   - Random 6-digit codes (1,000,000 possible combinations)")
print("   - Cryptographically secure random number generation")
print("   - No sequential or predictable patterns")
print("   - Codes are single-use only")

print("\\n2. **Code Expiration:**")
print("   - Codes expire after 10 minutes")
print("   - Prevents replay attacks")
print("   - Forces fresh authentication for each session")
print("   - Reduces risk of code interception")

print("\\n3. **Attempt Limiting:**")
print("   - Maximum 3 attempts per code")
print("   - Account lockout after failed attempts")
print("   - Progressive delays between attempts")
print("   - Prevents brute force attacks")

print("\\n4. **Session Security:**")
print("   - 2FA verification timestamp recorded")
print("   - Session includes 2FA verification status")
print("   - Secure session token generation")
print("   - Session timeout and automatic logout")

print("\\n5. **Email Security:**")
print("   - TLS/SSL encryption for email transmission")
print("   - Secure IMAP/SMTP connections")
print("   - App-specific passwords (not account passwords)")
print("   - Email delivery confirmation")

print("\\n6. **Audit and Logging:**")
print("   - All 2FA attempts logged")
print("   - Success/failure tracking")
print("   - IP address and device information")
print("   - Suspicious activity detection")""")
    
    # Error handling cell
    error_handling_cell = nbf.v4.new_code_cell("""## [ERROR] Error Handling and Recovery

Demonstrate how to handle common 2FA errors and implement recovery mechanisms.

# Example 6: Error handling and recovery
print("[ERROR] Error handling and recovery...")
print("=" * 60)

# Common 2FA errors and solutions
class TwoFactorErrorHandler:
    def __init__(self):
        self.error_counts = {}
        self.lockout_durations = {}
    
    def handle_error(self, error_type: str, user_id: str) -> Dict[str, any]:
        """Handle different types of 2FA errors"""
        
        if user_id not in self.error_counts:
            self.error_counts[user_id] = {}
        
        if error_type not in self.error_counts[user_id]:
            self.error_counts[user_id][error_type] = 0
        
        self.error_counts[user_id][error_type] += 1
        current_count = self.error_counts[user_id][error_type]
        
        print(f"[ERROR] Handling {error_type} error for user {user_id}")
        print(f"  Error count: {current_count}")
        
        # Handle different error types
        if error_type == "invalid_code":
            return self._handle_invalid_code(user_id, current_count)
        elif error_type == "expired_code":
            return self._handle_expired_code(user_id, current_count)
        elif error_type == "too_many_attempts":
            return self._handle_too_many_attempts(user_id, current_count)
        elif error_type == "email_delivery_failed":
            return self._handle_email_delivery_failed(user_id, current_count)
        else:
            return self._handle_unknown_error(user_id, error_type)
    
    def _handle_invalid_code(self, user_id: str, count: int) -> Dict[str, any]:
        """Handle invalid code errors"""
        if count >= 3:
            return {
                'action': 'lockout',
                'duration': 15,  # minutes
                'message': 'Account locked due to too many invalid codes',
                'recovery': 'Wait 15 minutes or contact support'
            }
        else:
            remaining = 3 - count
            return {
                'action': 'retry',
                'remaining_attempts': remaining,
                'message': f'Invalid code. {remaining} attempts remaining',
                'recovery': 'Enter the correct verification code'
            }
    
    def _handle_expired_code(self, user_id: str, count: int) -> Dict[str, any]:
        """Handle expired code errors"""
        return {
            'action': 'resend',
            'message': 'Verification code has expired',
            'recovery': 'Request a new verification code',
            'auto_action': 'resend_code'
        }
    
    def _handle_too_many_attempts(self, user_id: str, count: int) -> Dict[str, any]:
        """Handle too many attempts errors"""
        lockout_duration = min(30 * count, 120)  # Progressive lockout
        return {
            'action': 'lockout',
            'duration': lockout_duration,
            'message': f'Account locked for {lockout_duration} minutes',
            'recovery': f'Wait {lockout_duration} minutes or contact support'
        }
    
    def _handle_email_delivery_failed(self, user_id: str, count: int) -> Dict[str, any]:
        """Handle email delivery failures"""
        if count >= 3:
            return {
                'action': 'contact_support',
                'message': 'Email delivery failed multiple times',
                'recovery': 'Contact support to verify email configuration',
                'alternative': 'Use SMS 2FA if available'
            }
        else:
            return {
                'action': 'retry',
                'message': 'Email delivery failed, retrying...',
                'recovery': 'Check email configuration and try again',
                'retry_count': count
            }
    
    def _handle_unknown_error(self, user_id: str, error_type: str) -> Dict[str, any]:
        """Handle unknown error types"""
        return {
            'action': 'contact_support',
            'message': f'Unknown error type: {error_type}',
            'recovery': 'Contact support for assistance',
            'error_id': f'UNK_{int(time.time())}'
        }

# Test error handling
error_handler = TwoFactorErrorHandler()

print("\\n[TEST] Testing Error Handling:")

# Test various error scenarios
test_errors = [
    ("invalid_code", "user123"),
    ("invalid_code", "user123"),
    ("invalid_code", "user123"),
    ("expired_code", "user456"),
    ("too_many_attempts", "user789"),
    ("email_delivery_failed", "user101")
]

for error_type, user_id in test_errors:
    print(f"\\n[TEST] Testing {error_type} for {user_id}")
    result = error_handler.handle_error(error_type, user_id)
    
    print(f"  Action: {result['action']}")
    print(f"  Message: {result['message']}")
    print(f"  Recovery: {result['recovery']}")
    
    if 'duration' in result:
        print(f"  Duration: {result['duration']} minutes")
    if 'remaining_attempts' in result:
        print(f"  Remaining Attempts: {result['remaining_attempts']}")""")
    
    # Implementation example cell
    implementation_cell = nbf.v4.new_code_cell("""## [CODE] Complete Implementation Example

Here's a practical example of how to implement email 2FA in your own code.

# Example 7: Complete email 2FA implementation
print("[CODE] Complete email 2FA implementation...")
print("=" * 60)

class CompleteEmail2FA:
    def __init__(self, email_config: Dict[str, str]):
        self.email_config = email_config
        self.verification_codes = {}  # In production, use secure storage
        self.error_handler = TwoFactorErrorHandler()
    
    def initiate_2fa(self, user_id: str, user_email: str) -> Dict[str, any]:
        """Initiate 2FA for a user"""
        try:
            # Generate verification code
            import secrets
            verification_code = ''.join([str(secrets.randbelow(10)) for _ in range(6)])
            
            # Store code with expiration
            expires_at = datetime.now() + timedelta(minutes=10)
            self.verification_codes[user_id] = {
                'code': verification_code,
                'expires_at': expires_at,
                'attempts': 0,
                'email': user_email
            }
            
            # Send verification email
            email_handler = MockEmailHandler(self.email_config)
            send_success = email_handler.send_verification_email(user_email, verification_code)
            
            if send_success:
                return {
                    'success': True,
                    'message': 'Verification code sent to your email',
                    'expires_at': expires_at.isoformat(),
                    'user_id': user_id
                }
            else:
                return {
                    'success': False,
                    'error': 'Failed to send verification code',
                    'recovery': 'Check email configuration and try again'
                }
                
        except Exception as e:
            return {
                'success': False,
                'error': f'Failed to initiate 2FA: {str(e)}',
                'recovery': 'Contact support for assistance'
            }
    
    def verify_code(self, user_id: str, input_code: str) -> Dict[str, any]:
        """Verify the 2FA code for a user"""
        try:
            if user_id not in self.verification_codes:
                return {
                    'success': False,
                    'error': 'No verification code found',
                    'recovery': 'Request a new verification code'
                }
            
            user_2fa = self.verification_codes[user_id]
            
            # Check if code is expired
            if datetime.now() > user_2fa['expires_at']:
                # Handle expired code error
                error_result = self.error_handler.handle_error("expired_code", user_id)
                return {
                    'success': False,
                    'error': error_result['message'],
                    'recovery': error_result['recovery'],
                    'action': error_result['action']
                }
            
            # Check attempts
            if user_2fa['attempts'] >= 3:
                # Handle too many attempts error
                error_result = self.error_handler.handle_error("too_many_attempts", user_id)
                return {
                    'success': False,
                    'error': error_result['message'],
                    'recovery': error_result['recovery'],
                    'action': error_result['action']
                }
            
            # Increment attempts
            user_2fa['attempts'] += 1
            
            # Verify code
            if input_code == user_2fa['code']:
                # Success - clean up and return success
                del self.verification_codes[user_id]
                return {
                    'success': True,
                    'message': '2FA verification successful',
                    'verified_at': datetime.now().isoformat(),
                    'user_id': user_id
                }
            else:
                # Invalid code
                error_result = self.error_handler.handle_error("invalid_code", user_id)
                return {
                    'success': False,
                    'error': error_result['message'],
                    'recovery': error_result['recovery'],
                    'action': error_result['action'],
                    'remaining_attempts': error_result.get('remaining_attempts', 0)
                }
                
        except Exception as e:
            return {
                'success': False,
                'error': f'Verification failed: {str(e)}',
                'recovery': 'Contact support for assistance'
            }
    
    def resend_code(self, user_id: str) -> Dict[str, any]:
        """Resend verification code for a user"""
        try:
            if user_id not in self.verification_codes:
                return {
                    'success': False,
                    'error': 'No verification code found',
                    'recovery': 'Request a new verification code'
                }
            
            # Generate new code
            import secrets
            new_code = ''.join([str(secrets.randbelow(10)) for _ in range(6)])
            
            # Update stored code
            user_2fa = self.verification_codes[user_id]
            user_2fa['code'] = new_code
            user_2fa['expires_at'] = datetime.now() + timedelta(minutes=10)
            user_2fa['attempts'] = 0
            
            # Send new code
            email_handler = MockEmailHandler(self.email_config)
            send_success = email_handler.send_verification_email(user_2fa['email'], new_code)
            
            if send_success:
                return {
                    'success': True,
                    'message': 'New verification code sent',
                    'expires_at': user_2fa['expires_at'].isoformat()
                }
            else:
                return {
                    'success': False,
                    'error': 'Failed to send new verification code',
                    'recovery': 'Check email configuration and try again'
                }
                
        except Exception as e:
            return {
                'success': False,
                'error': f'Failed to resend code: {str(e)}',
                'recovery': 'Contact support for assistance'
            }

# Test the complete implementation
print("\\n[TEST] Testing Complete Email 2FA Implementation:")

# Create 2FA instance
email_config = {
    'email': 'noreply@meijer.com',
    'imap_server': 'imap.meijer.com',
    'imap_port': 993,
    'smtp_server': 'smtp.meijer.com',
    'smtp_port': 587
}

email_2fa = CompleteEmail2FA(email_config)

# Test 2FA initiation
print("\\n[INITIATE] Testing 2FA initiation...")
init_result = email_2fa.initiate_2fa("user123", "user@example.com")

if init_result['success']:
    print(f"[OK] 2FA initiated: {init_result['message']}")
    print(f"  Expires at: {init_result['expires_at']}")
    
    # Test code verification
    print("\\n[VERIFY] Testing code verification...")
    verify_result = email_2fa.verify_code("user123", "123456")
    
    if verify_result['success']:
        print(f"[OK] Verification successful: {verify_result['message']}")
    else:
        print(f"[X] Verification failed: {verify_result['error']}")
        print(f"  Recovery: {verify_result['recovery']}")
        
        # Test resend code
        if verify_result.get('action') == 'resend':
            print("\\n[RESEND] Testing code resend...")
            resend_result = email_2fa.resend_code("user123")
            
            if resend_result['success']:
                print(f"[OK] Code resent: {resend_result['message']}")
            else:
                print(f"[X] Code resend failed: {resend_result['error']}")
else:
    print(f"[X] 2FA initiation failed: {init_result['error']}")""")
    
    # Best practices cell
    best_practices_cell = nbf.v4.new_code_cell("""## [BEST] Best Practices and Security Recommendations

Learn the best practices for implementing secure email 2FA systems.

# Best Practices for Email 2FA
print("[BEST] Email 2FA best practices...")
print("=" * 60)

print("1. **Code Generation Security:**")
print("   - Use cryptographically secure random number generators")
print("   - Avoid predictable patterns or sequences")
print("   - Ensure codes are truly random and unique")
print("   - Use appropriate code length (6-8 digits recommended)")

print("\\n2. **Code Expiration and Management:**")
print("   - Set reasonable expiration times (5-15 minutes)")
print("   - Implement single-use codes")
print("   - Clean up expired codes promptly")
print("   - Limit code generation frequency")

print("\\n3. **Attempt Limiting and Lockout:**")
print("   - Implement progressive delays between attempts")
print("   - Use account lockout after multiple failures")
print("   - Implement rate limiting for code requests")
print("   - Monitor for suspicious activity patterns")

print("\\n4. **Email Security:**")
print("   - Use TLS/SSL for all email transmission")
print("   - Implement secure email delivery confirmation")
print("   - Use app-specific passwords for email accounts")
print("   - Monitor email delivery success rates")

print("\\n5. **User Experience:**")
print("   - Provide clear error messages and recovery options")
print("   - Implement automatic code resending when appropriate")
print("   - Offer alternative 2FA methods (SMS, authenticator apps)")
print("   - Provide helpful troubleshooting information")

print("\\n6. **Monitoring and Logging:**")
print("   - Log all 2FA attempts and outcomes")
print("   - Monitor for unusual patterns or attacks")
print("   - Implement alerting for security events")
print("   - Regular security audit and review")

print("\\n7. **Compliance and Standards:**")
print("   - Follow industry security standards (NIST, OWASP)")
print("   - Implement proper data protection measures")
print("   - Ensure compliance with relevant regulations")
print("   - Regular security assessments and updates")""")
    
    # Add all cells to notebook
    nb.cells = [
        title_cell,
        setup_cell,
        client_cell,
        setup_2fa_cell,
        auth_flow_cell,
        code_verification_cell,
        email_integration_cell,
        security_features_cell,
        error_handling_cell,
        implementation_cell,
        best_practices_cell
    ]
    
    # Write notebook to file
    output_file = "email_2fa.ipynb"
    with open(output_file, "w", encoding="utf-8") as f:
        nbf.write(nb, f)
    
    print(f"✅ Email 2FA notebook generated: {output_file}")
    return output_file

if __name__ == "__main__":
    create_email_2fa_notebook()
