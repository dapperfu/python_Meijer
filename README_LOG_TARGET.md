# Log Target Usage Guide

## 🎯 Purpose

The `make log` target provides a complete workflow for:
1. **Capturing network traffic** from the Meijer mobile app
2. **Extracting authentication tokens** when done
3. **Automatic cleanup** of sensitive log files
4. **Multiple proxy endpoints** for different use cases

## 🚀 Usage

```bash
make log
```

## 📱 Workflow

### 1. Start Capture
```bash
🚀 Starting mitmweb with multiple listeners...
📱 Use the Meijer app while this is running
🌐 Web interface available at http://localhost:8081
🔌 SOCKS5 proxy available on 0.0.0.0:1080
🌍 HTTP proxy available on 0.0.0.0:8080
⏹️  Press Ctrl+C when done to extract auth and cleanup
```

### 2. Use the App
- Open the Meijer mobile app
- Configure proxy settings:
  - **HTTP Proxy**: `0.0.0.0:8080`
  - **SOCKS5 Proxy**: `0.0.0.0:1080`
- Perform actions that require authentication
- **Web interface**: Monitor traffic at http://localhost:8081
- **Location spoofing is enabled** via `shop_n_scan_faker.py`

### 3. Stop and Extract
- Press **Ctrl+C** to stop mitmweb
- The system automatically:
  - Extracts authentication tokens
  - Updates `~/.config/meijer.txt`
  - Deletes the log file
  - Cleans up temporary files

## 🔧 Technical Details

### Mitmweb Configuration
- **Mode**: `wireguard` (for mobile app proxy)
- **HTTP Proxy**: `0.0.0.0:8080` (all interfaces)
- **SOCKS5 Proxy**: `0.0.0.0:1080` (all interfaces)
- **Web Interface**: `http://localhost:8081` (traffic monitoring)
- **Log file**: `meijer_mitm.log`
- **Script**: `shop_n_scan_faker.py` (location spoofing)
- **Global blocking**: Disabled for proper operation

### Multiple Listeners
The configuration provides multiple access points:
- **0.0.0.0:8080**: HTTP proxy for most apps
- **0.0.0.0:1080**: SOCKS5 proxy for apps requiring SOCKS
- **localhost:8081**: Web interface for traffic inspection
- **Wireguard interface**: For apps using wireguard mode

### Location Spoofing
The `shop_n_scan_faker.py` script intercepts store location requests and fakes:
- **Latitude**: 43.0080700
- **Longitude**: -85.6916800
- **Radius**: 2000 miles
- **Results**: Up to 250 stores

### Error Handling
The target uses proper error handling:
- If mitmweb exits normally: No action
- If mitmweb is interrupted (Ctrl+C): Extract auth and cleanup
- Always ensures log files are removed

## 🛡️ Security Features

- **Automatic cleanup**: Log files are deleted after use
- **Size limits**: Pre-commit hook prevents large files
- **Sensitive patterns**: .gitignore blocks log files
- **No persistence**: Authentication data goes to `~/.config/` only
- **Multiple interfaces**: Allows flexible proxy configuration

## 📋 Prerequisites

1. **mitmweb installed**: Available in virtual environment
2. **shop_n_scan_faker.py**: Location spoofing script
3. **meijer_cli.py**: Authentication extraction tool
4. **Mobile app**: Meijer app with network proxy configured
5. **Network access**: Ports 8080, 1080, 8081 available

## 🔍 Troubleshooting

### Common Issues
- **Permission denied**: Ensure mitmweb is executable
- **Port conflicts**: Check if ports 8080, 1080, 8081 are available
- **Script not found**: Verify `shop_n_scan_faker.py` exists
- **Auth extraction fails**: Check log file exists before cleanup
- **Proxy not working**: Verify app is configured for correct proxy type

### Port Configuration
- **HTTP Proxy**: Configure app to use `0.0.0.0:8080`
- **SOCKS5 Proxy**: Configure app to use `0.0.0.0:1080`
- **Web Interface**: Open browser to `http://localhost:8081`
- **Wireguard**: For apps that support wireguard proxy mode

### Manual Override
If automatic cleanup fails:
```bash
# Manual auth extraction
python meijer_cli.py auth meijer_mitm.log

# Manual cleanup
rm -f meijer_mitm.log
```

## 📚 Related Files

- **Makefile**: Contains the log target
- **shop_n_scan_faker.py**: Location spoofing script
- **meijer_cli.py**: Authentication extraction
- **SECURITY.md**: Security guidelines
- **.gitignore**: Prevents log file commits 