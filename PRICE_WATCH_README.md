# Meijer Price Watch System

A comprehensive price monitoring and alert system for Meijer products, integrated into the existing Meijer CLI tool.

## Overview

The Price Watch system allows you to:
- Track product prices by UPC or PLU identifiers
- Monitor price changes across different stores
- Receive email alerts when prices drop or sales are detected
- Maintain a complete price history database
- Export and import watch configurations

## Features

### Core Functionality
- **Product Watching**: Track any Meijer product by UPC (12 digits) or PLU (4-5 digits)
- **Store Scoping**: Watch products at specific stores or across all stores
- **Price History**: Maintain complete price observation history with timestamps
- **Change Detection**: Automatically detect price drops, sales, and clearance events
- **Email Alerts**: Receive consolidated email notifications for price changes
- **Jinja2 Templating**: Professional email templates with both HTML and plain text versions
- **Flexible Conditions**: Configure when alerts should trigger (any drop, sales only, etc.)

### Data Management
- **SQLite Database**: Persistent storage using PonyORM with automatic schema management
- **Import/Export**: CSV-based watch configuration management
- **Reporting**: Generate reports of price changes and current best prices
- **Audit Trail**: Complete logging of all operations and price observations

### Security & Configuration
- **Secure Storage**: Database and config files use 0600 permissions
- **XDG Compliance**: Respects XDG environment variables for config locations
- **Email Configuration**: TOML-based email setup with SMTP/IMAP support
- **Environment Variables**: Configurable paths and settings

## Installation

The Price Watch system is integrated into the main Meijer CLI. Ensure you have the required dependencies:

```bash
# Install from source
pip install -e .

# Or install dependencies manually
pip install pony toml jinja2
```

## Quick Start

### 1. Setup Email Configuration

First, set up email notifications:

```bash
meijer watch setup
```

This creates a template email configuration file at `~/.config/meijer/email.toml`. Edit it with your SMTP server details.

**Note:** The system will automatically try to load existing email credentials from `~/.config/meijer/email.txt` if available.

### 2. Add Your First Watch

```bash
# Watch a product by UPC
meijer watch add 012345678905

# Watch a product by PLU (produce)
meijer watch add 4011 --type PLU

# Watch with target price
meijer watch add 012345678905 --desired-price 7.99

# Watch at specific store
meijer watch add 012345678905 -s 217 --desired-price 7.99
```

### 3. Check Your Watches

```bash
# List all active watches
meijer watch ls

# List with current prices
meijer watch ls --format table

# Export to CSV
meijer watch ls --format csv
```

### 4. Refresh Prices

```bash
# Refresh all watches
meijer watch refresh

# Refresh specific store
meijer watch refresh --store-id 217

# Test with limited items
meijer watch refresh --limit 5
```

### 5. Generate Reports

```bash
# Recent changes
meijer watch report

# Changes since specific date
meijer watch report --since 2025-01-01

# Export report
meijer watch report --format csv
```

### 6. Test Email Configuration

```bash
# Send a test email to verify your setup
meijer watch test-email

# Test with specific product
meijer watch test-email -i 012345678905

# Test to specific email address
meijer watch test-email -t test@example.com
```

### 7. Send Notifications

```bash
# Dry run (see what would be sent)
meijer watch notify --dry-run

# Send actual notifications
meijer watch notify
```

## Command Reference

### `meijer watch add <IDENTIFIER> [OPTIONS]`

Add a new product watch.

**Options:**
- `--type [UPC|PLU]`: Override identifier type detection
- `--store-id, -s TEXT`: Bind watch to specific store
- `--desired-price DECIMAL`: Target price for alerts
- `--only-when CHOICE`: Alert condition (any_drop, sale_or_clearance, clearance_only, below_desired_price)
- `--note TEXT`: Optional note about the watch

**Examples:**
```bash
meijer watch add 012345678905
meijer watch add 4011 --type PLU
meijer watch add 012345678905 -s 217 --desired-price 7.99
meijer watch add 012345678905 --only-when sale_or_clearance --note "Weekly special"
```

### `meijer watch rm <IDENTIFIER> [OPTIONS]`

Remove (deactivate) a product watch.

**Options:**
- `--store-id, -s TEXT`: Remove from specific store only

**Examples:**
```bash
meijer watch rm 012345678905
meijer watch rm 4011 --store-id 217
```

### `meijer watch ls [OPTIONS]`

List all watches with current price information.

**Options:**
- `--active/--all`: Show only active watches or all watches
- `--format CHOICE`: Output format (table, json, csv)
- `--store-id, -s TEXT`: Filter by store ID

**Examples:**
```bash
meijer watch ls
meijer watch ls --all
meijer watch ls --format json
meijer watch ls -s 217
```

### `meijer watch refresh [OPTIONS]`

Fetch current prices for watched items and update price history.

**Options:**
- `--store-id, -s TEXT`: Refresh specific store only
- `--limit, -l N`: Maximum number of products to refresh
- `--method CHOICE`: Price fetching method (cart, shop_scan, search, keywords)

**Examples:**
```bash
meijer watch refresh
meijer watch refresh --store-id 217
meijer watch refresh --limit 10 --method cart
```

### `meijer watch report [OPTIONS]`

Show price changes and current best prices for all watches.

**Options:**
- `--since DATE`: Show changes since this date (YYYY-MM-DD or YYYY-MM-DD HH:MM:SS)
- `--format CHOICE`: Output format (table, json, csv)

**Examples:**
```bash
meijer watch report
meijer watch report --since 2025-01-01
meijer watch report --format csv
```

### `meijer watch notify [OPTIONS]`

Send email notifications for price alerts.

**Options:**
- `--dry-run`: Show what would be emailed without sending
- `--since DATE`: Process changes since this date
- `--channel CHOICE`: Notification channel (email)

**Examples:**
```bash
meijer watch notify
meijer watch notify --dry-run
meijer watch notify --since 2025-01-01
```

### `meijer watch import FILE`

Import watches from a CSV file.

**Expected CSV columns:** identifier, id_type, store_id, desired_price, only_when, note

**Example:**
```bash
meijer watch import watches.csv
```

### `meijer watch export FILE`

Export watches to a CSV file.

**Options:**
- `--active-only`: Export only active watches (default)

**Examples:**
```bash
meijer watch export watches.csv
meijer watch export all_watches.csv --no-active-only
```

### `meijer watch setup [OPTIONS]`

Create email configuration template for price alerts.

**Options:**
- `--force, -f`: Overwrite existing configuration

**Examples:**
```bash
meijer watch setup
meijer watch setup --force
```

### `meijer watch test-email [OPTIONS]`

Send a test email to verify email configuration.

**Options:**
- `--identifier, -i TEXT`: Use specific product identifier for test (UPC or PLU)
- `--store-id, -s TEXT`: Use specific store for test
- `--to, -t TEXT`: Send test email to specific address (overrides config)

**Examples:**
```bash
meijer watch test-email
meijer watch test-email -i 012345678905
meijer watch test-email -s 217
meijer watch test-email -t test@example.com
```

### `meijer watch price <IDENTIFIER> [OPTIONS]`

Get current price for a product without affecting watches.

**Options:**
- `--store-id, -s TEXT`: Get price for specific store
- `--method CHOICE`: Price fetching method (cart, shop_scan, search, keywords)
- `--no-store`: Don't store the price in history

**Examples:**
```bash
meijer watch price 012345678905
meijer watch price 4011 --type PLU --method cart
meijer watch price 012345678905 -s 217 --no-store
```

## Configuration

### Email Configuration

The system uses TOML configuration files for email settings. The default location is `~/.config/meijer/email.toml`.

**Example Configuration:**
```toml
[smtp]
host = "smtp.gmail.com"
port = 587
username = "your_email@gmail.com"
password = "your_app_password"
use_tls = true
from = "your_email@gmail.com"
to = "your_email@gmail.com"

[imap]
host = "imap.gmail.com"
port = 993
username = "your_email@gmail.com"
password = "your_app_password"
use_ssl = true

[email]
subject_prefix = "Meijer price alert:"
unsubscribe_hint = true
```

**Gmail Setup:**
1. Enable 2-factor authentication
2. Generate an "App Password" in Google Account settings
3. Use the app password instead of your regular password

### Database Location

The SQLite database is stored at `~/.local/share/meijer/prices.db` by default, but respects the `XDG_DATA_HOME` environment variable.

### File Permissions

- Database file: 0600 (owner read/write only)
- Email config: 0600 (owner read/write only)

## Database Schema

The system uses PonyORM with the following entities:

- **Product**: Product information (UPC/PLU, name, brand, etc.)
- **Store**: Store locations and information
- **PriceHistory**: Price observations with timestamps
- **Watch**: User watch configurations
- **AlertEvent**: Detected price changes and conditions
- **Notification**: Email notification tracking
- **RunLog**: Command execution logging
- **SchemaVersion**: Database migration tracking

## Integration with Existing CLI

The Price Watch system integrates seamlessly with the existing Meijer CLI:

- **Authentication**: Uses existing authentication system
- **Store Information**: Integrates with `meijer stores` commands
- **Product Search**: Leverages existing search and product lookup methods
- **Consistent Style**: Follows existing CLI patterns and help formatting

## Usage Examples

### Basic Price Monitoring

```bash
# Setup email configuration
meijer watch setup

# Add watches for products you're interested in
meijer watch add 012345678905 --note "Favorite cereal"
meijer watch add 4011 --type PLU --note "Bananas"
meijer watch add 012345678905 -s 217 --desired-price 5.99

# Check your watches
meijer watch ls

# Refresh prices (run this regularly, e.g., via cron)
meijer watch refresh

# Check for changes
meijer watch report

# Send notifications
meijer watch notify
```

### Advanced Usage

```bash
# Import watches from CSV
meijer watch import product_watches.csv

# Monitor specific store
meijer watch refresh --store-id 217 --method cart

# Generate detailed report
meijer watch report --since 2025-01-01 --format json

# Export current watches
meijer watch export current_watches.csv

# Test email configuration
meijer watch notify --dry-run
```

### Cron Job Example

Add to your crontab to run price refreshes automatically:

```bash
# Refresh prices every 6 hours
0 */6 * * * /path/to/venv/bin/meijer watch refresh

# Send notifications daily at 9 AM
0 9 * * * /path/to/venv/bin/meijer watch notify
```

## Troubleshooting

### Common Issues

**Email Configuration Invalid**
```bash
# Check email configuration
meijer watch setup --force
# Edit ~/.config/meijer/email.toml with correct SMTP settings
```

**Database Errors**
```bash
# Check database permissions
ls -la ~/.local/share/meijer/prices.db
# Should show 0600 permissions

# Recreate database if needed
rm ~/.local/share/meijer/prices.db
meijer watch ls  # This will recreate the database
```

**No Price Data**
```bash
# Check if watches exist
meijer watch ls

# Manually refresh prices
meijer watch refresh --limit 5

# Check for errors in output
```

### Debug Mode

Use verbose logging to troubleshoot issues:

```bash
meijer -vv watch refresh
meijer -vvv watch notify
```

## Development

### Project Structure

```
meijer/price_watch/
├── __init__.py          # Package initialization
├── database.py          # Database management
├── manager.py           # Core business logic
├── email_config.py      # Email configuration
└── models/
    └── price_watch.py   # PonyORM entities

meijer/cli/
├── price_watch_commands.py  # CLI commands
└── main.py                  # Main CLI integration

tests/
└── test_price_watch.py      # Test suite
```

### Running Tests

```bash
# Run all price watch tests
pytest tests/test_price_watch.py -v

# Run specific test class
pytest tests/test_price_watch.py::TestPriceWatchManager -v

# Run with coverage
pytest tests/test_price_watch.py --cov=meijer.price_watch
```

### Adding New Features

1. **Database Changes**: Update models in `meijer/models/price_watch.py`
2. **Business Logic**: Extend `PriceWatchManager` class
3. **CLI Commands**: Add new commands to `price_watch_commands.py`
4. **Tests**: Add corresponding tests in `test_price_watch.py`

## Contributing

When contributing to the Price Watch system:

1. Follow the existing code style and patterns
2. Add comprehensive tests for new functionality
3. Update documentation for new features
4. Ensure database migrations are handled properly
5. Test with both development and production configurations

## License

This project is licensed under the MIT License. See the main project LICENSE file for details.

## Support

For issues and questions:

1. Check the troubleshooting section above
2. Review the test suite for usage examples
3. Check existing GitHub issues
4. Create a new issue with detailed error information

---

**Note**: The Price Watch system is designed for personal use and should be used responsibly. Respect Meijer's terms of service and implement appropriate rate limiting when refreshing prices.
