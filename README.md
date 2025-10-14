# Meijer CLI Tool

A comprehensive command-line interface for managing Meijer shopping lists, coupons, cart, and account from the command line.

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

## Commands

### `meijer list`

Manage shopping list operations.

#### `meijer list show`
Display shopping list items with filtering options.

```bash
meijer list show [OPTIONS]

Options:
  --completed           Show only completed items
  --pending            Show only pending items
```

#### `meijer list add`
Add items to shopping list.

```bash
meijer list add [ITEM] [OPTIONS]

Options:
  --quantity, -q INTEGER    Quantity to add (default: 1)
  --notes, -n TEXT         Additional notes for the item
  --file, -f PATH          Read items from file

Examples:
  meijer list add "Milk"                    # Add single item
  meijer list add "123456789012"            # Add by UPC
  meijer list add --file shopping.txt       # Add from file
  echo "Bread" | meijer list add            # Add from stdin
```

#### `meijer list estimate`
Estimate cost of shopping list items with product matching.

```bash
meijer list estimate [OPTIONS]

Options:
  --store-id, -s TEXT      Store ID for location lookup
  --output, -o PATH        Output file path (CSV or Excel)
  --include-location       Include location information
  --include-matched        Include matched product information
  --methods, -m TEXT       Preferred estimation methods (cart, shop_scan, search, keywords)

Examples:
  meijer list estimate
  meijer list estimate --output estimate.csv
  meijer list estimate --methods cart search
```

#### `meijer list favorites`
Show favorite items.

```bash
meijer list favorites
```

#### `meijer list clear`
Clear completed items from shopping list.

```bash
meijer list clear
```

#### `meijer list clearall`
Clear all items from shopping list (with confirmation).

```bash
meijer list clearall
```

#### `meijer list defrag`
Organize shopping list by aisle for efficient shopping.

```bash
meijer list defrag [OPTIONS]

Options:
  --store-id TEXT          Store ID for location lookup
  -r, --reverse            Sort items in reverse order
  -z, --zig                Alternate B aisle sorting
  -s, --show               Show list before and after defrag
```

#### `meijer list dedup`
Remove duplicate items from shopping list by consolidating quantities.

```bash
meijer list dedup [OPTIONS]

Options:
  -s, --show               Show list before and after dedup
```

This command identifies items with the same name (case-insensitive) and consolidates them into single entries with summed quantities. Useful for cleaning up accidentally duplicated items or consolidating lists from multiple sources.

Examples:
  meijer list dedup                    # Run dedup
  meijer list dedup --show             # Show before/after comparison

#### `meijer list export`
Export shopping list to various formats.

```bash
meijer list export [FILENAME]

Examples:
  meijer list export shopping_list.txt      # Text format
  meijer list export shopping_list.csv      # CSV format
  meijer list export shopping_list.xlsx     # Excel format
  meijer list export shopping_list.json     # JSON format
```

#### `meijer list export-defragmented`
Export defragmented shopping list with organized aisle groups.

```bash
meijer list export-defragmented [OPTIONS]

Options:
  --store-id, -s TEXT      Store ID for location lookup
  --output, -o PATH        Output file path
```

#### `meijer list import`
Import shopping list from various formats.

```bash
meijer list import FILENAME [OPTIONS]

Options:
  --clear, -c              Clear existing list before import
  --format, -f TEXT        Import format (auto, text, csv, json)

Examples:
  meijer list import shopping_list.txt
  meijer list import shopping_list.csv --clear
```

#### `meijer list interactive`
Interactive shopping list management mode.

```bash
meijer list interactive
```

### `meijer coupons`

Manage coupons and offers.

#### `meijer coupons list`
List available coupons with filtering.

```bash
meijer coupons list [OPTIONS]

Options:
  --clipped               Show only clipped coupons
  --available             Show only available coupons
```

### `meijer stores`

Manage store information and search.

#### `meijer stores search`
Search for Meijer stores with various filters.

```bash
meijer stores search [OPTIONS]

Options:
  --city, -c TEXT         Search for stores in a specific city
  --zip, -z TEXT          Search for stores near a ZIP code
  --near TEXT             Search for stores near coordinates (lat,lng)
  --radius, -r INTEGER    Search radius in miles (default: 50)
  --services, -s TEXT     Filter by services (curbside, delivery, pharmacy, gas)
  --limit, -l INTEGER     Maximum number of stores to return (default: 20)
  --format, -f TEXT       Output format (table, json, csv)

Examples:
  meijer stores search --city "Ann Arbor"
  meijer stores search --near "42.2808,-83.7430" --radius 25
  meijer stores search --services curbside delivery
```

#### `meijer stores show`
Show detailed information for a specific store.

```bash
meijer stores show STORE_ID

Example:
  meijer stores show 217
```

#### `meijer stores nearby`
Find stores near specific coordinates.

```bash
meijer stores nearby [OPTIONS]

Options:
  --latitude, -lat FLOAT    Latitude coordinate (required)
  --longitude, -lng FLOAT   Longitude coordinate (required)
  --radius, -r INTEGER      Search radius in miles (default: 25)
  --limit, -l INTEGER       Maximum number of stores (default: 10)
  --sort, -s TEXT           Sort order (distance, name)

Example:
  meijer stores nearby --latitude 42.2808 --longitude -83.7430
```

#### `meijer stores gas`
Show gas station information and prices.

```bash
meijer stores gas [OPTIONS]

Options:
  --city, -c TEXT         Show gas prices for stores in a specific city
  --zip, -z TEXT          Show gas prices for stores near a ZIP code
  --radius, -r INTEGER    Search radius in miles (default: 25)
```

### `meijer cart`

Manage shopping cart and fulfillment.

#### `meijer cart show`
Show current shopping cart contents.

```bash
meijer cart show
```

#### `meijer cart add`
Add an item to the cart by UPC code.

```bash
meijer cart add UPC [OPTIONS]

Options:
  --quantity, -q INTEGER    Quantity to add (default: 1)
  --store, -s TEXT         Store ID (default: 217)

Example:
  meijer cart add 123456789012 --quantity 2
```

#### `meijer cart remove`
Remove an item from the cart by index number.

```bash
meijer cart remove ITEM_INDEX [OPTIONS]

Options:
  --quantity, -q INTEGER    Quantity to remove (default: remove all)

Example:
  meijer cart remove 1 --quantity 2
```

#### `meijer cart clear`
Clear all items from the shopping cart.

```bash
meijer cart clear [OPTIONS]

Options:
  --confirm, -y            Skip confirmation prompt
```

#### `meijer cart info`
Show detailed cart information and statistics.

```bash
meijer cart info
```

#### `meijer cart slots`
Show available pickup or delivery time slots.

```bash
meijer cart slots [OPTIONS]

Options:
  --date, -d TEXT         Preferred date (YYYY-MM-DD format)
  --delivery              Show delivery slots instead of pickup

Example:
  meijer cart slots --date 2025-08-25
```

#### `meijer cart set-store`
Set the store for cart operations.

```bash
meijer cart set-store STORE_ID

Example:
  meijer cart set-store 217
```

#### `meijer cart checkout`
Proceed to checkout with current cart.

```bash
meijer cart checkout [OPTIONS]

Options:
  --method, -m TEXT       Fulfillment method (pickup, delivery)
```

### `meijer settings`

Manage account settings and preferences.

```bash
meijer settings
```

### `meijer email-2fa`

Manage email 2FA configuration and testing.

#### `meijer email-2fa setup`
Create email configuration template for 2FA.

```bash
meijer email-2fa setup [OPTIONS]

Options:
  --force, -f              Overwrite existing configuration
```

#### `meijer email-2fa test`
Test email 2FA connection and authentication.

```bash
meijer email-2fa test
```

#### `meijer email-2fa wait`
Wait for a verification code to arrive via email.

```bash
meijer email-2fa wait [OPTIONS]

Options:
  --timeout, -t INTEGER    Timeout in seconds (default: 300)
```

### `meijer auth`

Manage Meijer authentication and tokens.

#### `meijer auth log`
Authenticate by extracting tokens from mitmproxy logs.

```bash
meijer auth log [OPTIONS]

Options:
  --mode, -m TEXT         Authentication mode (auto, full, quick)
  --log-file, -f PATH     Specific mitmproxy log file to analyze
  --output, -o PATH       Output file for tokens (default: auth.json)

Examples:
  meijer auth log --mode full              # Complete OAuth2 flow
  meijer auth log --mode quick             # Bearer token only
  meijer auth log --log-file custom.log    # Use specific log file
```

#### `meijer auth imap`
Set up email configuration for 2FA verification codes.

```bash
meijer auth imap
```

#### `meijer auth login`
Login using various authentication methods.

```bash
meijer auth login [OPTIONS]

Options:
  --method, -m TEXT       Authentication method (selenium, headless, requests, hybrid)
  --keep-open, -k         Keep browser open for debugging

Examples:
  meijer auth login --method requests      # Headless HTTP requests
  meijer auth login --method selenium      # Full browser automation
  meijer auth login --method hybrid        # Minimal browser + HTTP
```

#### `meijer auth logout`
Logout and clear stored tokens.

```bash
meijer auth logout
```

#### `meijer auth config`
Show and manage authentication configuration.

```bash
meijer auth config [OPTIONS]

Options:
  --show-headers, -h      Show detailed header configuration
  --show-timing, -t       Show timing configuration
  --edit, -e TEXT         Edit configuration value (key.path=value)

Examples:
  meijer auth config --show-headers
  meijer auth config --edit oauth2.client_id=new_id
```

#### `meijer auth status`
Show current authentication status and token information.

```bash
meijer auth status
```

#### `meijer auth quick-token`
Quick capture of bearer token from recent Meijer app usage.

```bash
meijer auth quick-token
```

#### `meijer auth full-login`
Complete OAuth2 authentication flow for persistent access.

```bash
meijer auth full-login
```

### `meijer status`

Show authentication status.

```bash
meijer status
```

### `meijer ads`

Browse weekly ad items and add them to your shopping list.

```bash
meijer ads
```

### `meijer gas`

Show gas station information.

```bash
meijer gas
```



## Authentication Methods

### 1. **Log Analysis** (Recommended)
- **Command**: `meijer auth log --mode full`
- **Description**: Extract complete OAuth2 flow from mitmproxy logs
- **Use Case**: Persistent authentication with auto-refresh
- **Requirements**: mitmproxy logs, complete login flow

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
