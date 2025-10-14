# Makefile Logging Documentation

This document provides comprehensive documentation for using the Makefile commands to capture and analyze Meijer API traffic logs.

## Overview

The Meijer API Client project includes sophisticated logging capabilities through mitmproxy (mitmweb) that allow you to capture, analyze, and extract authentication tokens from Meijer mobile app traffic.

## Prerequisites

Before using the logging functionality, ensure you have:

1. **mitmproxy installed**: The project uses mitmweb for traffic capture
2. **Virtual environment activated**: All commands should be run within the project's virtual environment
3. **Network access**: Your development machine and mobile device must be on the same network

## Core Logging Commands

### Starting Traffic Capture

```bash
make log
```

**What it does:**
- Starts mitmweb with multiple proxy modes
- Creates timestamped log files in the `logs/` directory
- Provides web interface for real-time traffic monitoring
- Enables SOCKS5 and HTTP proxy modes

**Configuration:**
- **Web Interface**: http://localhost:8081
- **SOCKS5 Proxy**: 0.0.0.0:1080
- **HTTP Proxy**: 0.0.0.0:8080
- **Log Format**: `logs/meijer_mitm_YYYYMMDD_HHMMSS.log`
- **Script**: Uses `tools/shop_n_scan_faker.py` for enhanced functionality

**Example Output:**
```
🚀 Starting mitmweb...
📱 Use the Meijer app while this is running
🌐 Web interface available at http://localhost:8081
🔌 SOCKS5 proxy available on 0.0.0.0:1080
🌍 HTTP proxy available on 0.0.0.0:8080
⏹️  Press Ctrl+C when done
🔑 After stopping, run 'make auth' to extract authentication tokens

📁 Logs will be stored in logs/ directory
```

### Viewing Available Logs

```bash
make logs
```

**What it does:**
- Lists all available log files in the `logs/` directory
- Shows file details including timestamps and sizes
- Provides guidance on next steps

**Example Output:**
```
📁 Available log files:
-rw-r--r-- 1 user user 2.3M Jan 18 14:03 logs/meijer_mitm_20250118_140357.log
-rw-r--r-- 1 user user 1.8M Jan 15 11:40 logs/meijer_mitm_20250115_114031.log
-rw-r--r-- 1 user user 2.1M Jan 13 22:12 logs/meijer_mitm_20250113_221221.log

💡 Use 'make auth' to extract tokens from the most recent log file
💡 Or specify a specific file: 'make auth FILE=logs/meijer_mitm_20250117_191500.log'
```

### Extracting Authentication Tokens

```bash
make auth
```

**What it does:**
- Extracts authentication tokens from the most recent log file
- Parses mitmproxy logs to find Meijer API authentication data
- Outputs tokens in a format suitable for API client configuration

**Using Specific Log Files:**
```bash
make auth FILE=logs/meijer_mitm_20250118_140357.log
```

## Portable Logging Script

The project also includes a portable logging script (`mitmlog.sh`) that provides the same functionality without requiring Make:

### Using the Portable Script

```bash
# Start logging
./mitmlog.sh

# Or with explicit command
./mitmlog.sh log

# List available logs
./mitmlog.sh logs

# Show help
./mitmlog.sh help
```

### Installing as System Command

You can install the script as a system-wide command:

```bash
# Copy to local bin directory
cp mitmlog.sh ~/.local/bin/mitmlog.sh
chmod +x ~/.local/bin/mitmlog.sh

# Create alias
echo 'alias mitmlog=~/.local/bin/mitmlog.sh' >> ~/.bashrc
source ~/.bashrc

# Now you can use it anywhere
mitmlog
mitmlog logs
```

## Log File Structure

### File Naming Convention

Log files follow the pattern: `meijer_mitm_YYYYMMDD_HHMMSS.log`

Examples:
- `meijer_mitm_20250118_140357.log` - January 18, 2025 at 2:03:57 PM
- `meijer_mitm_20250115_114031.log` - January 15, 2025 at 11:40:31 AM

### Log Content

The logs contain:
- **HTTP/HTTPS requests** from the Meijer mobile app
- **Response data** including API responses
- **Headers and authentication tokens**
- **Request/response timing information**
- **Error messages and status codes**

## Workflow Example

Here's a typical workflow for capturing and analyzing Meijer API traffic:

### 1. Start Logging
```bash
make log
```

### 2. Configure Mobile Device
- Set up Android device to use your development machine as a proxy
- See [Android WiFi Proxy Setup Guide](ANDROID_PROXY_SETUP.md) for detailed instructions

### 3. Generate Traffic
- Use the Meijer mobile app while the proxy is running
- Perform various actions (login, browse products, add to cart, etc.)
- The proxy will capture all API calls

### 4. Stop Logging
- Press `Ctrl+C` to stop mitmweb
- Log file will be automatically saved

### 5. Extract Authentication Data
```bash
make auth
```

### 6. Analyze Logs
```bash
make logs
```

## Advanced Configuration

### Custom Log Directory

You can modify the Makefile to use a different log directory:

```makefile
# In .makefile/traffic.mk
LOG_DIR?=custom_logs
```

### Custom Proxy Ports

To use different proxy ports, modify the mitmweb command:

```bash
mitmweb --mode regular@0.0.0.0:8080 --mode socks5@0.0.0.0:1080 --web-port 8081
```

### Additional Scripts

The logging system uses `tools/shop_n_scan_faker.py` for enhanced functionality. You can modify this script or create additional scripts for specific use cases.

## Troubleshooting

### Common Issues

**1. Permission Denied**
```bash
# Ensure logs directory is writable
chmod 755 logs/
```

**2. Port Already in Use**
```bash
# Check what's using the port
lsof -i :8080
lsof -i :8081
lsof -i :1080

# Kill the process or use different ports
```

**3. No Logs Generated**
- Verify mitmweb is running without errors
- Check that mobile device is properly configured
- Ensure both devices are on the same network

**4. Authentication Extraction Fails**
- Verify log file contains Meijer API traffic
- Check that the log file is not corrupted
- Ensure the log file format is correct

### Debug Mode

For debugging, you can run mitmweb with verbose output:

```bash
mitmweb --mode regular@0.0.0.0:8080 --web-port 8081 -v
```

## Integration with Development

### Automated Testing

The logging system integrates with the project's testing framework:

```bash
# Run tests with logging
make test LOGGING=true

# Analyze test logs
make auth FILE=logs/test_session.log
```

### Continuous Integration

For CI/CD pipelines, you can use the portable script:

```bash
# In CI pipeline
./mitmlog.sh log &
# Run tests
# Stop logging
pkill mitmweb
# Extract results
make auth
```

## Security Considerations

### Network Security

- **Local Network Only**: The proxy binds to `0.0.0.0` which makes it accessible from any device on your local network
- **HTTPS Interception**: mitmproxy generates certificates for HTTPS interception
- **Sensitive Data**: Logs may contain authentication tokens and personal information

### Best Practices

1. **Use on Trusted Networks**: Only run the proxy on networks you trust
2. **Secure Log Files**: Store log files securely and delete them when no longer needed
3. **Certificate Management**: Be aware that mitmproxy certificates may need to be installed on mobile devices
4. **Data Privacy**: Ensure compliance with data protection regulations when capturing user traffic

## Related Documentation

- [Android WiFi Proxy Setup Guide](ANDROID_PROXY_SETUP.md)
- [API Authentication Guide](API_AUTHENTICATION.md)
- [Development Workflow](DEVELOPMENT_WORKFLOW.md)
- [Troubleshooting Guide](TROUBLESHOOTING.md)

## Support

For issues or questions about the logging functionality:

1. Check the troubleshooting section above
2. Review the project's GitHub issues
3. Consult the mitmproxy documentation
4. Check the project's README.md for additional information
