# Log Target Usage Guide

## 🎯 Purpose

The `make log` target provides a complete workflow for:
1. **Capturing network traffic** from the Meijer mobile app
2. **Extracting authentication tokens** when done
3. **Automatic cleanup** of sensitive log files

## 🚀 Usage

```bash
make log
```

## 📱 Workflow

### 1. Start Capture
```bash
🚀 Starting mitmdump in wireguard mode...
📱 Use the Meijer app while this is running
⏹️  Press Ctrl+C when done to extract auth and cleanup
```

### 2. Use the App
- Open the Meijer mobile app
- Perform actions that require authentication
- The app will use the mitmproxy for network requests
- **Location spoofing is enabled** via `shop_n_scan_faker.py`

### 3. Stop and Extract
- Press **Ctrl+C** to stop mitmdump
- The system automatically:
  - Extracts authentication tokens
  - Updates `~/.config/meijer.txt`
  - Deletes the log file
  - Cleans up temporary files

## 🔧 Technical Details

### Mitmdump Configuration
- **Mode**: `wireguard` (for mobile app proxy)
- **Log file**: `meijer_mitm.log`
- **Script**: `shop_n_scan_faker.py` (location spoofing)
- **Global blocking**: Disabled for proper operation

### Location Spoofing
The `shop_n_scan_faker.py` script intercepts store location requests and fakes:
- **Latitude**: 43.0080700
- **Longitude**: -85.6916800
- **Radius**: 2000 miles
- **Results**: Up to 250 stores

### Error Handling
The target uses proper error handling:
- If mitmdump exits normally: No action
- If mitmdump is interrupted (Ctrl+C): Extract auth and cleanup
- Always ensures log files are removed

## 🛡️ Security Features

- **Automatic cleanup**: Log files are deleted after use
- **Size limits**: Pre-commit hook prevents large files
- **Sensitive patterns**: .gitignore blocks log files
- **No persistence**: Authentication data goes to `~/.config/` only

## 📋 Prerequisites

1. **mitmdump installed**: Available in virtual environment
2. **shop_n_scan_faker.py**: Location spoofing script
3. **meijer_cli.py**: Authentication extraction tool
4. **Mobile app**: Meijer app with network proxy configured

## 🔍 Troubleshooting

### Common Issues
- **Permission denied**: Ensure mitmdump is executable
- **Port conflicts**: Check if 8080 is available
- **Script not found**: Verify `shop_n_scan_faker.py` exists
- **Auth extraction fails**: Check log file exists before cleanup

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