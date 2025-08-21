# Email 2FA for Meijer Authentication

This document explains how to set up and use email-based 2FA (Two-Factor Authentication) for the Meijer API client.

## Overview

When logging into Meijer, you may encounter 2FA requirements. This system handles 2FA via email verification codes by:

1. Connecting to your email server via IMAP
2. Monitoring for verification emails from Meijer
3. Automatically extracting the N-digit verification codes
4. Providing the codes for authentication

## Features

- **Secure IMAP Connection**: Supports SSL/TLS with certificate validation bypass
- **Flexible Email Search**: Configurable search criteria for verification emails
- **Pattern Matching**: Customizable regex patterns for code extraction
- **Timeout Handling**: Configurable wait times and check intervals
- **CLI Integration**: Built-in commands for setup and testing
- **Cross-Platform**: Works on Windows, macOS, and Linux

## Prerequisites

- Python 3.7+
- Access to an email account with IMAP support
- For Gmail: App Password (not your regular password)

## Installation

The email 2FA functionality is included with the Meijer client. Ensure you have the required dependencies:

```bash
pip install imaplib2
```

## Quick Setup

### 1. Create Email Configuration

Use the CLI command to create a configuration template:

```bash
meijer email-2fa setup
```

This creates `~/.config/meijer/email.txt` with default settings.

### 2. Edit Configuration

Edit the `email.txt` file with your email server details:

```ini
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
code_pattern=\b\d{6}\b

# Timing settings (in seconds)
max_wait_time=300
check_interval=10
```

### 3. Test Connection

Verify your configuration works:

```bash
meijer email-2fa test
```

## Configuration Options

### Required Fields

- `server`: IMAP server hostname (e.g., `imap.gmail.com`)
- `username`: Your email address
- `password`: Your email password or app password

### Optional Fields

- `port`: IMAP port (default: 993)
- `use_ssl`: Use SSL/TLS (default: true)
- `search_subject`: Subject line keywords to search for (default: "verification")
- `search_sender`: Sender email keywords (default: "meijer")
- `code_pattern`: Regex pattern for code extraction (default: 6 digits)
- `max_wait_time`: Maximum time to wait for codes (default: 300 seconds)
- `check_interval`: How often to check for new emails (default: 10 seconds)

## Email Server Examples

### Gmail

```ini
server=imap.gmail.com
port=993
username=your_email@gmail.com
password=your_app_password
use_ssl=true
```

**Important**: For Gmail, you must use an "App Password" instead of your regular password. To generate one:
1. Go to Google Account settings
2. Security → 2-Step Verification → App passwords
3. Generate a password for "Mail"

### Outlook/Hotmail

```ini
server=outlook.office365.com
port=993
username=your_email@outlook.com
password=your_password
use_ssl=true
```

### Yahoo

```ini
server=imap.mail.yahoo.com
port=993
username=your_email@yahoo.com
password=your_app_password
use_ssl=true
```

## Usage

### CLI Commands

#### Setup Configuration
```bash
meijer email-2fa setup
```

#### Test Connection
```bash
meijer email-2fa test
```

#### Wait for Code
```bash
meijer email-2fa wait --timeout 300
```

### Python API

```python
from meijer.email_2fa import Email2FAHandler

# Initialize handler
email_handler = Email2FAHandler()

# Test connection
if email_handler.test_connection():
    print("✅ Email connection successful")

    # Wait for verification code
    code = email_handler.wait_for_verification_code(timeout_seconds=300)
    if code:
        print(f"📧 Verification code: {code}")

    # Or get latest code without waiting
    latest_code = email_handler.get_latest_verification_code()
```

### Integration with Authentication

The email 2FA is automatically integrated with the OKTA authentication flow. When 2FA is required, the system will:

1. Detect MFA requirement
2. Initialize email handler
3. Wait for verification code
4. Return the code for authentication

## Troubleshooting

### Common Issues

#### Connection Failed
- Verify server hostname and port
- Check username and password
- Ensure IMAP is enabled on your email account
- For Gmail, use App Password, not regular password

#### No Emails Found
- Adjust `search_subject` and `search_sender` values
- Check if verification emails are being sent
- Verify email is going to the correct account

#### Code Extraction Failed
- Review `code_pattern` regex
- Check email format and content
- Test with `meijer email-2fa test` command

#### SSL Certificate Errors
- The system automatically bypasses certificate validation
- If issues persist, try setting `use_ssl=false`

### Debug Mode

Enable verbose logging to see detailed information:

```bash
meijer -vv email-2fa test
```

### Manual Testing

Use the test script to verify functionality:

```bash
python test_email_2fa.py
```

## Security Considerations

- **App Passwords**: Use app-specific passwords when available
- **SSL/TLS**: Always use encrypted connections
- **Local Storage**: Configuration is stored locally in `~/.config/meijer/`
- **No Code Storage**: Verification codes are not persisted
- **Timeout Limits**: Built-in timeouts prevent indefinite waiting

## Advanced Configuration

### Custom Code Patterns

For different verification code formats:

```ini
# 4-digit codes
code_pattern=\b\d{4}\b

# 8-character alphanumeric
code_pattern=\b[A-Za-z0-9]{8}\b

# Codes with dashes (e.g., 123-456)
code_pattern=\b\d{3}-\d{3}\b
```

### Multiple Email Accounts

You can use different configuration files:

```python
from meijer.email_2fa import Email2FAHandler

# Use custom config file
email_handler = Email2FAHandler("/path/to/custom_email.txt")
```

### Custom Search Criteria

Modify search parameters for specific email patterns:

```ini
# Search for emails from multiple senders
search_sender=meijer|noreply@meijer.com

# Search for specific subjects
search_subject=verification|security|code
```

## Support

If you encounter issues:

1. Check the troubleshooting section above
2. Verify your email configuration
3. Test with the CLI commands
4. Review the logs for error details
5. Ensure your email provider supports IMAP

## Examples

### Complete Gmail Setup

1. **Generate App Password**:
   - Go to Google Account → Security → 2-Step Verification → App passwords
   - Generate password for "Mail"

2. **Create Configuration**:
   ```bash
   meijer email-2fa setup
   ```

3. **Edit Configuration**:
   ```ini
   server=imap.gmail.com
   port=993
   username=your_email@gmail.com
   password=abcd efgh ijkl mnop
   use_ssl=true
   search_subject=verification
   search_sender=meijer
   code_pattern=\b\d{6}\b
   max_wait_time=300
   check_interval=10
   ```

4. **Test Connection**:
   ```bash
   meijer email-2fa test
   ```

5. **Use in Authentication**:
   The system will automatically use email 2FA when required during login.

This email 2FA system provides a robust, secure way to handle Meijer's 2FA requirements without manual intervention.
