# Android WiFi Proxy Setup Guide

This guide provides step-by-step instructions for configuring an Android device to use a proxy server for capturing Meijer API traffic with mitmproxy.

## Overview

To capture mobile app traffic from the Meijer app, you need to configure your Android device to route its network traffic through your development machine running mitmproxy. This guide covers the complete setup process.

## Prerequisites

Before starting, ensure you have:

1. **Development Machine**: Running mitmproxy (via `make log`)
2. **Android Device**: With Meijer app installed
3. **Network Access**: Both devices on the same WiFi network
4. **Root Access**: Not required, but helpful for some advanced configurations

## Step-by-Step Setup

### 1. Start the Proxy Server

On your development machine, start mitmproxy:

```bash
make log
```

This will start mitmweb with:
- **HTTP Proxy**: `0.0.0.0:8080`
- **SOCKS5 Proxy**: `0.0.0.0:1080`
- **Web Interface**: `http://localhost:8081`

### 2. Find Your Development Machine's IP Address

On your development machine, find the local IP address:

```bash
# Linux/macOS
ip route get 1.1.1.1 | awk '{print $7}' | head -1

# Or use ifconfig
ifconfig | grep "inet " | grep -v 127.0.0.1

# Windows
ipconfig | findstr "IPv4"
```

Example output: `192.168.1.100`

### 3. Configure Android WiFi Proxy

#### Method 1: Standard Android Settings (Recommended)

1. **Open Settings**
   - Open the **Settings** app on your Android device
   - Navigate to **Wi-Fi** or **Network & Internet** → **Wi-Fi**

2. **Modify Network Connection**
   - Long-press on your current WiFi network
   - Select **Modify network** or **Edit** (varies by Android version)

3. **Access Advanced Options**
   - Tap **Advanced options** or **Show advanced options**
   - This reveals additional network configuration options

4. **Configure Proxy Settings**
   - Under **Proxy**, change from **None** to **Manual**
   - **Proxy hostname**: Enter your development machine's IP (e.g., `192.168.1.100`)
   - **Proxy port**: Enter `8080` (HTTP proxy port)
   - Leave **Bypass proxy for** empty unless you have specific exclusions

5. **Save Configuration**
   - Tap **Save** or **Apply**
   - The device will reconnect to WiFi with proxy settings

#### Method 2: Android 10+ (Alternative)

For newer Android versions:

1. **Settings** → **Network & Internet** → **Wi-Fi**
2. **Long-press** your WiFi network
3. **Modify** → **Advanced options**
4. **Proxy**: Select **Manual**
5. **Server**: `192.168.1.100` (your dev machine IP)
6. **Port**: `8080`
7. **Save**

### 4. Install mitmproxy Certificate (Required for HTTPS)

Android requires installing the mitmproxy certificate to intercept HTTPS traffic:

#### Option A: Via Web Browser (Easiest)

1. **Open Browser** on your Android device
2. **Navigate to**: `mitm.it`
3. **Download Certificate** for Android
4. **Install Certificate**:
   - Go to **Settings** → **Security** → **Encryption & credentials**
   - Tap **Install a certificate** → **CA certificate**
   - Select the downloaded certificate file
   - Give it a name (e.g., "mitmproxy")
   - Tap **OK**

#### Option B: Via ADB (Advanced)

```bash
# On development machine
adb push ~/.mitmproxy/mitmproxy-ca-cert.pem /sdcard/
# Then install via Settings on device
```

### 5. Verify Proxy Configuration

#### Check Proxy Status

1. **Open Browser** on Android device
2. **Visit**: `http://mitm.it`
3. **Expected Result**: You should see the mitmproxy certificate page
4. **If Error**: Check IP address and port configuration

#### Test Traffic Capture

1. **Open Meijer App** on Android device
2. **Perform Actions**: Login, browse products, add items to cart
3. **Check mitmweb**: Visit `http://localhost:8081` on development machine
4. **Verify Traffic**: You should see HTTP/HTTPS requests from the Meijer app

## Troubleshooting

### Common Issues and Solutions

#### 1. "No Internet Connection" Error

**Symptoms**: Android device shows no internet connection after proxy setup

**Solutions**:
- Verify development machine IP address is correct
- Ensure mitmproxy is running (`make log`)
- Check firewall settings on development machine
- Try different proxy port (8080 vs 1080)

#### 2. Certificate Installation Issues

**Symptoms**: HTTPS traffic not intercepted, certificate errors

**Solutions**:
- Ensure certificate is installed in **CA certificates** section
- Try downloading certificate directly from `mitm.it`
- Check Android security settings allow certificate installation
- For Android 7+, may need to configure network security config

#### 3. Proxy Not Working for Specific Apps

**Symptoms**: Some apps bypass proxy settings

**Solutions**:
- Some apps ignore system proxy settings
- Try using SOCKS5 proxy instead (port 1080)
- Use VPN-based solutions for app-specific routing
- Check if app has built-in proxy settings

#### 4. Connection Timeouts

**Symptoms**: Requests timeout, slow response times

**Solutions**:
- Check network latency between devices
- Ensure development machine has sufficient resources
- Try reducing mitmproxy verbosity
- Check for network congestion

### Advanced Troubleshooting

#### Debug Network Configuration

```bash
# On development machine - check if proxy is listening
netstat -tlnp | grep :8080
netstat -tlnp | grep :1080

# Check firewall rules
sudo ufw status
# Or for iptables
sudo iptables -L
```

#### Test Proxy Connectivity

```bash
# Test HTTP proxy
curl -x http://192.168.1.100:8080 http://httpbin.org/ip

# Test SOCKS5 proxy
curl --socks5 192.168.1.100:1080 http://httpbin.org/ip
```

#### Android Network Diagnostics

1. **Settings** → **Developer Options** → **Network**
2. **Enable**: "Stay awake" and "USB debugging"
3. **Check**: Network statistics and connection details

## Alternative Methods

### Method 1: VPN-Based Proxy

For apps that ignore system proxy settings:

1. **Install VPN App**: Use apps like "ProxyDroid" or "ProxyCap"
2. **Configure**: Point to your development machine's proxy
3. **Route**: All traffic through VPN proxy

### Method 2: Root-Based Solutions

For rooted devices:

1. **Install**: ProxyDroid or similar root proxy app
2. **Configure**: Global proxy settings
3. **Advantage**: Works with all apps, including system apps

### Method 3: Router-Level Proxy

For network-wide proxy:

1. **Configure Router**: Set up proxy at router level
2. **Route Traffic**: All devices automatically use proxy
3. **Advantage**: No per-device configuration needed

## Security Considerations

### Network Security

- **Local Network Only**: Proxy should only be accessible on trusted networks
- **Certificate Management**: mitmproxy certificates should be properly managed
- **Data Privacy**: Be aware that all traffic is being intercepted and logged

### Best Practices

1. **Use Trusted Networks**: Only configure proxy on networks you control
2. **Secure Development Machine**: Ensure your development machine is secure
3. **Certificate Rotation**: Regularly update mitmproxy certificates
4. **Log Management**: Securely store and delete captured logs when done

## Device-Specific Notes

### Samsung Devices

- May require additional steps for certificate installation
- Some Samsung apps may bypass proxy settings
- Check Samsung-specific network settings

### Google Pixel Devices

- Generally works well with standard proxy configuration
- May require enabling "Developer options" for some settings
- Certificate installation usually straightforward

### OnePlus Devices

- May have additional security settings that block proxy
- Check "Network & Internet" → "Private DNS" settings
- Some OnePlus apps may ignore proxy settings

## Integration with Development Workflow

### Automated Setup Script

Create a script to automate proxy configuration:

```bash
#!/bin/bash
# auto_proxy_setup.sh

DEVICE_IP=$(ip route get 1.1.1.1 | awk '{print $7}' | head -1)
echo "Development machine IP: $DEVICE_IP"
echo "Configure Android proxy:"
echo "  Host: $DEVICE_IP"
echo "  Port: 8080"
echo "  Certificate: http://mitm.it"
```

### Testing Checklist

Before starting development:

- [ ] mitmproxy running (`make log`)
- [ ] Android proxy configured
- [ ] Certificate installed
- [ ] Test connection (`mitm.it` loads)
- [ ] Meijer app traffic visible in mitmweb
- [ ] Authentication tokens extractable (`make auth`)

## Related Documentation

- [Makefile Logging Documentation](MAKEFILE_LOGGING.md)
- [API Authentication Guide](API_AUTHENTICATION.md)
- [Development Workflow](DEVELOPMENT_WORKFLOW.md)
- [Troubleshooting Guide](TROUBLESHOOTING.md)

## Support

For issues with Android proxy setup:

1. Check the troubleshooting section above
2. Verify network connectivity between devices
3. Ensure mitmproxy is running correctly
4. Check Android version compatibility
5. Consult mitmproxy documentation for advanced scenarios
