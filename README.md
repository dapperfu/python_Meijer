# Meijer CLI Tool

A comprehensive command-line interface for managing Meijer shopping lists, coupons, cart, and account from the command line.

## ⚠️ Important Disclaimer

**Authentication Limitation**: The login method currently does not work due to security measures implemented by Meijer. **Capturing a login token with a MITM (Man-in-the-Middle) proxy is the only way to authenticate.** If you are unable to set up MITM proxy capture, unfortunately this project won't work for you.

## Features

- 🛒 **Shopping List Management**: Add, remove, organize, and estimate costs
- 🎫 **Coupon Management**: Browse, clip, and manage available offers
- 🛍️ **Cart Operations**: Add items, view contents, and manage fulfillment
- 🏪 **Store Information**: Search stores, view details, and find nearby locations
- ⛽ **Gas Station Data**: Check fuel prices and station information
- 🔐 **Authentication**: Multiple login methods with token management
- 📧 **Email 2FA**: Automated verification code handling
- 📊 **Data Export**: Multiple formats (CSV, Excel, JSON, Text)
- 🎯 **Cost Estimation**: Smart pricing with multiple methodologies

## 🌟 Featured Functionality: Smart Shopping List Defragmentation

One of the most powerful features is the **defrag** command, which organizes your shopping list by aisle for efficient store navigation:

### Before Defrag (Random Order):
```
1. Milk
2. Chips  
3. Bread
4. Ground Turkey
5. Bananas
6. Cookies
7. Eggs
8. Apples
9. Yogurt
10. Cheese
```

### After Defrag (Organized by Aisle):
```
1. Milk (Aisle: Dairy)
2. Eggs (Aisle: Dairy) 
3. Yogurt (Aisle: Dairy)
4. Cheese (Aisle: Dairy)
5. Bread (Aisle: Bakery)
6. Ground Turkey (Aisle: Meat)
7. Bananas (Aisle: Produce)
8. Apples (Aisle: Produce)
9. Chips (Aisle: Snacks)
10. Cookies (Aisle: Snacks)
```

**⚠️ App Version Limitation**: Defragging requires an **old version of the Meijer app** since newer versions have removed the second line of text that contains aisle location information, making defragging useless in current app versions.

```bash
# Organize your shopping list by aisle
meijer list defrag --show

# Use specific store for accurate locations
meijer list defrag --store-id 217 --show
```

## Installation

```bash
# Clone the repository
git clone https://github.com/dapperfu/python_Meijer.git
cd python_Meijer

# Create virtual environment
python -m venv venv
source venv/bin/activate  # On Windows: venv\Scripts\activate

# Install the package
pip install -e .
```

## Usage

The Meijer CLI provides a comprehensive set of commands organized into logical groups. Use `meijer --help` to see all available commands.

### Quick Start

```bash
# Get help for all commands
meijer --help

# Authenticate using MITM proxy logs (required)
meijer auth log --mode full

# Add items to your shopping list
meijer list add "Milk" "Bread" "Eggs"

# Organize your list by aisle (requires old app version)
meijer list defrag --show

# View your organized list
meijer list show
```

### Global Options

```bash
meijer [OPTIONS] COMMAND [ARGS]...

Options:
  --verbose, -v          Increase verbosity (-v, -vv, -vvv)
  --proxy TEXT          Proxy server address (e.g., 127.0.0.1:8080)
  --local TEXT          Local Flask API backend URL
  --version             Show version and exit
  --help                Show help message
```

## 📚 Complete Documentation

This project uses **automated documentation generation** powered by Sphinx and Click. All command documentation is automatically generated from the CLI definitions.

### Quick Access
- **Interactive Help**: `meijer --help` for general help
- **Command Groups**: `meijer list --help`, `meijer auth --help`, `meijer cart --help`
- **Generate Full Docs**: `make docs` (requires dev dependencies)

### Comprehensive Documentation
- **Installation Guide**: Step-by-step setup instructions
- **Quick Start**: Get up and running in minutes
- **Command Reference**: Complete CLI documentation with examples
- **Authentication Guide**: MITM proxy setup and token extraction
- **Examples**: Real-world usage scenarios
- **Troubleshooting**: Common issues and solutions
- **Development**: Contributing and development setup

### Building Documentation
```bash
# Install development dependencies
pip install -e ".[dev]"

# Generate documentation
make docs

# Serve documentation locally
make docs-serve

# Live documentation updates
make docs-autobuild
```

## Command Groups

The CLI is organized into logical command groups. Each group has comprehensive help:

- **Shopping Lists**: `meijer list --help` - Add, organize, estimate, and manage shopping lists
- **Authentication**: `meijer auth --help` - Login, token management, and MITM proxy integration  
- **Cart Management**: `meijer cart --help` - Add items, checkout, and fulfillment
- **Store Search**: `meijer stores --help` - Find stores, check gas prices, get store details
- **Coupons**: `meijer coupons --help` - Browse and manage available offers
- **Settings**: `meijer settings --help` - Account preferences and configuration

For detailed command documentation with examples, run:
```bash
meijer [COMMAND] --help
```



## Authentication Methods

**⚠️ IMPORTANT**: Due to Meijer's security measures, traditional login methods no longer work. **MITM proxy capture is the only reliable authentication method.**

### 1. **MITM Proxy Log Analysis** (Required)
- **Command**: `meijer auth log --mode full`
- **Description**: Extract complete OAuth2 flow from mitmproxy logs
- **Use Case**: Persistent authentication with auto-refresh
- **Requirements**: 
  - mitmproxy running on your network
  - Android device configured to use proxy
  - Complete login flow captured in logs
  - **Old version of Meijer app** (newer versions removed location data)

### 2. **Quick Token Capture**
- **Command**: `meijer auth log --mode quick`
- **Description**: Extract bearer tokens from recent app usage
- **Use Case**: Fast API access without full login
- **Requirements**: mitmproxy logs, recent app activity

### 3. **Auto-Detection**
- **Command**: `meijer auth log --mode auto`
- **Description**: Automatically detect best available authentication
- **Use Case**: Smart fallback between full and quick modes
- **Requirements**: mitmproxy logs, any app activity

## Configuration

### Email 2FA Setup

1. **Create configuration**:
   ```bash
   meijer email-2fa setup
   ```

2. **Edit email.txt** with your server details:
   ```ini
   server=imap.gmail.com
   port=993
   username=your.email@gmail.com
   password=your-app-password
   use_ssl=true
   ```

3. **Test connection**:
   ```bash
   meijer email-2fa test
   ```

### Credentials Storage

Store credentials in `~/.config/meijer/login.txt`:
```txt
your.username@email.com
your_password
```

### Proxy Configuration

Use `--proxy` flag for mitmproxy integration:
```bash
meijer --proxy 127.0.0.1:8080 list show
```

## Examples

### Basic Shopping List Management

```bash
# Add items to list
meijer list add "Milk"
meijer list add "Bread" --quantity 2
echo "Eggs" | meijer list add

# View list
meijer list show
meijer list show --pending

# Estimate costs
meijer list estimate --output estimate.csv

# Organize by aisle
meijer list defrag --show

# Remove duplicates
meijer list dedup --show
```

### Store Operations

```bash
# Find stores near you
meijer stores search --city "Ann Arbor"
meijer stores nearby --latitude 42.2808 --longitude -83.7430

# Check gas prices
meijer stores gas --city "Ann Arbor"
meijer gas
```

### Cart Management

```bash
# Add items to cart
meijer cart add 123456789012 --quantity 2

# View cart
meijer cart show
meijer cart info

# Check available slots
meijer cart slots --date 2025-08-25
```

### Authentication

```bash
# Extract tokens from logs (recommended)
meijer auth log --mode full

# Quick token capture
meijer auth log --mode quick

# Check status
meijer status
```

## Troubleshooting

### Common Issues

1. **Authentication Failed**
   - Use `meijer auth log --mode full` for complete OAuth2 flow
   - Use `meijer auth log --mode quick` for immediate token capture
   - Check mitmproxy logs and network connectivity
   - Ensure complete login flow in Meijer app

2. **Proxy Issues**
   - Ensure mitmproxy is running on specified port
   - Check firewall settings
   - Verify proxy host/port configuration

3. **Email 2FA Problems**
   - Verify IMAP server settings
   - Check app password for Gmail
   - Test connection with `meijer email-2fa test`

### Verbose Logging

Use `-v` flags for detailed debugging:
```bash
meijer -v list show          # Info level
meijer -vv list show         # Debug level
meijer -vvv list show        # Detailed debug
```

## Development

### Project Structure

```
meijer/
├── cli/                   # Command-line interface
│   ├── commands.py        # All CLI commands
│   ├── main.py           # CLI entry point
│   └── utils.py          # CLI utilities
├── models/                # Data models
├── auth.py               # Authentication core
├── client.py             # Main API client
└── ...
```

### Running Tests

```bash
# Install development dependencies
pip install -e ".[dev]"

# Run tests
pytest

# Run with coverage
pytest --cov=meijer
```

### Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests for new functionality
5. Submit a pull request

## Development Tools

### Modern Development Setup

This project uses modern development tools for network analysis and testing:

#### Hardware Setup
- **Device**: Google Pixel 4a
- **OS**: LineageOS 22 (Android 14)
- **Root**: Required for certificate installation

#### Software Tools

1. **mitmproxy** - Network traffic analysis
   - **Website**: https://mitmproxy.org/
   - **GitHub**: https://github.com/mitmproxy/mitmproxy
   - **Installation**: `pip install mitmproxy`
   - **Usage**: `mitmproxy -p 8080` for traffic capture

2. **LineageOS** - Custom Android ROM
   - **Website**: https://lineageos.org/
   - **GitHub**: https://github.com/LineageOS
   - **Features**: "Always Trust User Certificates" option enabled

3. **Cert Fixer** - Certificate management
   - **Purpose**: Automatically installs and manages SSL certificates
   - **Compatibility**: Works with LineageOS and mitmproxy
   - **GitHub**: https://github.com/LineageOS/lineageos_android_packages_apps_CertFixer
   - **Setup**: Install from [F-Droid](https://f-droid.org/) or GitHub releases

#### Development Workflow

1. **Network Analysis**:
   ```bash
   # Start mitmproxy
   mitmproxy -p 8080
   
   # Configure device to use proxy
   # IP: Your computer's IP
   # Port: 8080
   ```

2. **Certificate Installation**:
   - Enable "Always Trust User Certificates" in LineageOS settings
   - Install mitmproxy certificate using Cert Fixer
   - Verify certificate is trusted in system settings

3. **Log Analysis**:
   ```bash
   # Analyze captured traffic
   meijer auth log --mode full --log-file /path/to/logfile
   
   # Quick token extraction
   meijer auth log --mode quick
   ```

#### Legacy Tools (Deprecated)

The following tools are no longer recommended for development:
- ~~Old Android devices with outdated security~~
- ~~Manual certificate installation methods~~
- ~~Outdated proxy tools~~

## License

MIT License - see LICENSE file for details.

## Documentation

### Traffic Capture and Analysis

Comprehensive guides for capturing and analyzing Meijer API traffic:

- **[Makefile Logging Documentation](docs/MAKEFILE_LOGGING.md)** - Complete guide to using Makefile commands for traffic capture and analysis
- **[Android WiFi Proxy Setup Guide](docs/ANDROID_PROXY_SETUP.md)** - Step-by-step instructions for configuring Android devices to use proxy servers
- **[Traffic Capture Integration Guide](docs/TRAFFIC_CAPTURE_INTEGRATION.md)** - Complete workflow combining Makefile logging with Android proxy configuration

### Quick Start for Traffic Capture

1. **Start Proxy Server**:
   ```bash
   make log
   ```

2. **Configure Android Device**:
   - Set WiFi proxy to your development machine's IP:8080
   - Install mitmproxy certificate from `mitm.it`

3. **Capture Traffic**:
   - Use Meijer app on Android device
   - Perform actions (login, browse, add to cart)

4. **Extract Authentication**:
   ```bash
   make auth
   ```

### Additional Documentation

- **[Documentation Overview](docs/README.md)** - Complete documentation index and navigation guide

## Support

- **Issues**: [GitHub Issues](https://github.com/dapperfu/python_Meijer/issues)
- **Documentation**: [GitHub Wiki](https://github.com/dapperfu/python_Meijer/wiki)
- **Discussions**: [GitHub Discussions](https://github.com/dapperfu/python_Meijer/discussions)
