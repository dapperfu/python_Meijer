# Log Target Usage Guide

## 🎯 Purpose

The `make log` target provides a complete workflow for:
1. **Capturing network traffic** from the Meijer mobile app
2. **Extracting authentication tokens** when done
3. **Log preservation** for historical analysis
4. **Multiple proxy endpoints** for different use cases
5. **Automatic latest log detection** for auth extraction

## 🚀 Usage

```bash
# Start a new capture session
make log

# Extract auth from most recent log (without starting capture)
make auth
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
  - **Preserves the log file** for future analysis
  - Shows the filename for reference

### 4. Subsequent Auth Updates
- Use `make auth` to extract tokens from the most recent log
- Automatically finds the latest log file by timestamp
- No need to specify log filename manually

## 🔧 Technical Details

### Mitmweb Configuration
- **Mode**: `wireguard` (for mobile app proxy)
- **HTTP Proxy**: `0.0.0.0:8080` (all interfaces)
- **SOCKS5 Proxy**: `0.0.0.0:1080` (all interfaces)
- **Web Interface**: `http://localhost:8081` (traffic monitoring)
- **Log file**: `meijer_mitm_YYYYMMDD_HHMMSS.log` (timestamped)
- **Script**: `shop_n_scan_faker.py` (location spoofing)
- **Global blocking**: Disabled for proper operation

### Timestamped Log Files
Each session creates a unique log file:
- **Format**: `meijer_mitm_YYYYMMDD_HHMMSS.log`
- **Example**: `meijer_mitm_20250117_143052.log`
- **Benefits**: 
  - Multiple sessions can be captured
  - Historical analysis is possible
  - No log file conflicts
  - Easy identification of session timing
  - **All logs are preserved indefinitely**

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
- If mitmweb is interrupted (Ctrl+C): Extract auth and preserve log
- **Log files are never automatically deleted**
- Previous logs remain for analysis

## 🛡️ Security Features

- **Log preservation**: All logs are kept for analysis and debugging
- **Size limits**: Pre-commit hook prevents large files
- **Sensitive patterns**: .gitignore blocks log files
- **No persistence**: Authentication data goes to `~/.config/` only
- **Multiple interfaces**: Allows flexible proxy configuration
- **Automatic latest detection**: Always uses most recent log for auth

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

### Log Management
- **All sessions**: Preserved indefinitely for analysis
- **File naming**: Timestamped for easy identification
- **Storage**: Logs remain in project directory
- **Automatic detection**: `make auth` finds most recent log
- **Manual override**: Can specify specific log files if needed

### Manual Override
If you need to use a specific log file:
```bash
# Manual auth extraction from specific log
python meijer_cli.py auth meijer_mitm_20250117_143052.log

# List all available logs
ls -la meijer_mitm_*.log

# Use make auth to automatically find latest
make auth
```

## 📚 Related Files

- **Makefile**: Contains the log and auth targets
- **shop_n_scan_faker.py**: Location spoofing script
- **meijer_cli.py**: Authentication extraction
- **SECURITY.md**: Security guidelines
- **.gitignore**: Prevents log file commits
- **Log files**: `meijer_mitm_YYYYMMDD_HHMMSS.log` (timestamped, preserved) 