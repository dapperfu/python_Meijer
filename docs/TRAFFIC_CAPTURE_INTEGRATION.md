# Complete Traffic Capture Integration Guide

This guide provides a comprehensive walkthrough for setting up the complete Meijer API traffic capture system, integrating the Makefile logging commands with Android WiFi proxy configuration.

## Overview

This integration guide combines:
- **Makefile logging commands** for capturing traffic on your development machine
- **Android WiFi proxy setup** for routing mobile app traffic through the proxy
- **Authentication token extraction** for API client configuration
- **Complete workflow** from setup to analysis

## Quick Start Workflow

### 1. Start Proxy Server
```bash
make log
```

### 2. Configure Android Device
- Set WiFi proxy to your development machine's IP:8080
- Install mitmproxy certificate from `mitm.it`

### 3. Capture Traffic
- Use Meijer app on Android device
- Perform actions (login, browse, add to cart)

### 4. Extract Authentication
```bash
make auth
```

### 5. Analyze Results
```bash
make logs
```

## Detailed Integration Steps

### Phase 1: Development Machine Setup

#### 1.1 Verify Prerequisites

```bash
# Check if mitmproxy is installed
which mitmweb

# Check if virtual environment is active
which python
# Should show: /projects/python_Meijer/venv/bin/python

# Verify project structure
ls -la logs/
```

#### 1.2 Start Traffic Capture

```bash
# Start mitmweb with full configuration
make log
```

**Expected Output:**
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

#### 1.3 Verify Proxy is Running

```bash
# In another terminal, check if proxy is listening
netstat -tlnp | grep :8080
netstat -tlnp | grep :1080
netstat -tlnp | grep :8081
```

**Expected Output:**
```
tcp6  0  0  :::8080  :::*  LISTEN  [PID]/mitmweb
tcp6  0  0  :::1080  :::*  LISTEN  [PID]/mitmweb
tcp6  0  0  :::8081  :::*  LISTEN  [PID]/mitmweb
```

#### 1.4 Get Development Machine IP

```bash
# Get local IP address
ip route get 1.1.1.1 | awk '{print $7}' | head -1
```

**Example Output:** `192.168.1.100`

### Phase 2: Android Device Configuration

#### 2.1 Configure WiFi Proxy

1. **Open Settings** → **Wi-Fi**
2. **Long-press** your WiFi network
3. **Modify network** → **Advanced options**
4. **Proxy**: Manual
5. **Server**: `192.168.1.100` (your dev machine IP)
6. **Port**: `8080`
7. **Save**

#### 2.2 Install mitmproxy Certificate

1. **Open Browser** on Android
2. **Navigate to**: `mitm.it`
3. **Download** Android certificate
4. **Install Certificate**:
   - Settings → Security → Encryption & credentials
   - Install a certificate → CA certificate
   - Select downloaded file
   - Name: "mitmproxy"

#### 2.3 Verify Proxy Configuration

1. **Open Browser** on Android
2. **Visit**: `http://mitm.it`
3. **Expected**: Certificate download page (not error)

### Phase 3: Traffic Capture Session

#### 3.1 Start Capture Session

```bash
# On development machine - mitmweb should still be running
# If not, restart with: make log
```

#### 3.2 Generate Traffic

On Android device:
1. **Open Meijer App**
2. **Login** with your credentials
3. **Browse Products** in different categories
4. **Add Items** to cart
5. **View Cart** and modify quantities
6. **Check Promotions** and coupons
7. **Search** for specific products

#### 3.3 Monitor Traffic

On development machine:
1. **Open Browser**: `http://localhost:8081`
2. **Verify Traffic**: Should see HTTP/HTTPS requests from Meijer app
3. **Check Logs**: Traffic should be written to timestamped log file

#### 3.4 Stop Capture

```bash
# Press Ctrl+C in the terminal running mitmweb
# Log file will be automatically saved
```

### Phase 4: Authentication Extraction

#### 4.1 Extract Authentication Tokens

```bash
# Extract from most recent log
make auth
```

**Expected Output:**
```
🔑 Extracting authentication tokens...
📁 Processing log file: logs/meijer_mitm_20250118_140357.log
✅ Found authentication tokens:
   - Access Token: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...
   - Refresh Token: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...
   - Session ID: abc123def456...
```

#### 4.2 Extract from Specific Log File

```bash
# If you have multiple log files
make auth FILE=logs/meijer_mitm_20250118_140357.log
```

#### 4.3 View Available Logs

```bash
make logs
```

### Phase 5: Analysis and Integration

#### 5.1 Analyze Captured Traffic

```bash
# View log file contents
head -50 logs/meijer_mitm_20250118_140357.log

# Search for specific API endpoints
grep -i "api.meijer.com" logs/meijer_mitm_20250118_140357.log

# Find authentication requests
grep -i "auth\|login\|token" logs/meijer_mitm_20250118_140357.log
```

#### 5.2 Use Extracted Tokens

The extracted tokens can be used in your API client:

```python
# Example usage in Python
import requests

headers = {
    'Authorization': f'Bearer {access_token}',
    'X-Session-ID': session_id,
    'User-Agent': 'MeijerMobile/1.0'
}

response = requests.get('https://api.meijer.com/products', headers=headers)
```

## Complete Workflow Example

### Scenario: Capturing Login and Product Search Traffic

```bash
# 1. Start proxy server
make log

# 2. Configure Android (manual steps - see Android guide)
# - Set WiFi proxy to 192.168.1.100:8080
# - Install certificate from mitm.it

# 3. Use Meijer app on Android
# - Login with credentials
# - Search for "milk"
# - Add items to cart
# - Check promotions

# 4. Stop proxy (Ctrl+C)

# 5. Extract authentication
make auth

# 6. View captured logs
make logs

# 7. Analyze specific traffic
grep -i "search\|milk" logs/meijer_mitm_*.log
```

## Troubleshooting Integration Issues

### Common Integration Problems

#### 1. No Traffic Captured

**Symptoms**: mitmweb running but no requests visible

**Diagnosis Steps**:
```bash
# Check if proxy is accessible
curl -x http://192.168.1.100:8080 http://httpbin.org/ip

# Check Android proxy configuration
# Verify IP address and port are correct

# Check mitmweb web interface
# Visit http://localhost:8081
```

**Solutions**:
- Verify Android proxy settings
- Check network connectivity
- Ensure certificate is installed
- Try different proxy port (1080 for SOCKS5)

#### 2. Certificate Errors

**Symptoms**: HTTPS requests fail, certificate warnings

**Solutions**:
- Reinstall mitmproxy certificate
- Clear browser cache on Android
- Check certificate installation location
- Verify certificate is in CA certificates section

#### 3. Authentication Extraction Fails

**Symptoms**: `make auth` returns no tokens

**Diagnosis**:
```bash
# Check if log file exists and has content
ls -la logs/
wc -l logs/meijer_mitm_*.log

# Check for authentication requests in logs
grep -i "auth\|login\|token" logs/meijer_mitm_*.log
```

**Solutions**:
- Ensure Meijer app login was performed
- Check log file contains API traffic
- Verify log file format is correct
- Try different log file if multiple exist

### Advanced Integration Scenarios

#### Scenario 1: Multiple Device Capture

```bash
# Start proxy with multiple interfaces
mitmweb --mode regular@0.0.0.0:8080 --mode socks5@0.0.0.0:1080 --web-port 8081 -w "logs/multi_device_$(date +%Y%m%d_%H%M%S).log"
```

#### Scenario 2: Automated Token Refresh

```bash
# Create script for automated token extraction
#!/bin/bash
# auto_auth.sh

LATEST_LOG=$(ls -t logs/meijer_mitm_*.log | head -1)
echo "Processing: $LATEST_LOG"
make auth FILE="$LATEST_LOG"
```

#### Scenario 3: Continuous Monitoring

```bash
# Start continuous monitoring
while true; do
    make log &
    PROXY_PID=$!
    
    # Wait for user to stop
    read -p "Press Enter to stop capture..."
    
    kill $PROXY_PID
    make auth
    sleep 5
done
```

## Integration with Development Tools

### IDE Integration

#### VS Code Integration

Create `.vscode/tasks.json`:

```json
{
    "version": "2.0.0",
    "tasks": [
        {
            "label": "Start Traffic Capture",
            "type": "shell",
            "command": "make",
            "args": ["log"],
            "group": "build",
            "presentation": {
                "echo": true,
                "reveal": "always",
                "panel": "new"
            }
        },
        {
            "label": "Extract Authentication",
            "type": "shell",
            "command": "make",
            "args": ["auth"],
            "group": "build"
        }
    ]
}
```

### Script Integration

#### Automated Setup Script

```bash
#!/bin/bash
# setup_capture.sh

echo "🚀 Setting up Meijer API traffic capture..."

# Get IP address
DEVICE_IP=$(ip route get 1.1.1.1 | awk '{print $7}' | head -1)
echo "📱 Development machine IP: $DEVICE_IP"

# Start proxy
echo "🌐 Starting mitmweb..."
make log &
PROXY_PID=$!

# Wait for proxy to start
sleep 5

# Show configuration instructions
echo ""
echo "📋 Android Configuration:"
echo "  1. WiFi Settings → Modify Network → Advanced"
echo "  2. Proxy: Manual"
echo "  3. Server: $DEVICE_IP"
echo "  4. Port: 8080"
echo "  5. Install certificate from: http://mitm.it"
echo ""
echo "⏹️  Press Ctrl+C to stop capture and extract tokens"

# Wait for user to stop
trap "kill $PROXY_PID; make auth; exit" INT
wait
```

## Best Practices

### Security Best Practices

1. **Network Isolation**: Use on trusted networks only
2. **Certificate Management**: Regularly update mitmproxy certificates
3. **Log Security**: Secure storage and deletion of captured logs
4. **Access Control**: Limit access to development machine

### Performance Best Practices

1. **Resource Management**: Monitor system resources during capture
2. **Log Rotation**: Implement log rotation for long-running captures
3. **Network Optimization**: Use wired connections when possible
4. **Selective Capture**: Filter unnecessary traffic to reduce log size

### Development Best Practices

1. **Version Control**: Don't commit captured logs to version control
2. **Documentation**: Document capture sessions and findings
3. **Testing**: Test authentication extraction regularly
4. **Backup**: Backup important authentication tokens securely

## Related Documentation

- [Makefile Logging Documentation](MAKEFILE_LOGGING.md)
- [Android WiFi Proxy Setup Guide](ANDROID_PROXY_SETUP.md)
- [API Authentication Guide](API_AUTHENTICATION.md)
- [Development Workflow](DEVELOPMENT_WORKFLOW.md)
- [Troubleshooting Guide](TROUBLESHOOTING.md)

## Support and Maintenance

### Regular Maintenance Tasks

1. **Update mitmproxy**: Keep mitmproxy updated for security
2. **Clean Logs**: Regularly clean old log files
3. **Test Setup**: Periodically test the complete workflow
4. **Update Documentation**: Keep documentation current with changes

### Getting Help

1. **Check Documentation**: Review all related guides
2. **Troubleshooting**: Use the troubleshooting sections
3. **Community**: Check project GitHub issues
4. **Logs**: Provide relevant log files when seeking help

This integration guide provides everything needed to successfully capture and analyze Meijer API traffic using the project's Makefile commands and Android proxy configuration.
