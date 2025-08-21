# Meijer Price Monitor

A standalone price monitoring system for tracking product prices across Meijer stores. This project leverages the core Meijer Python API to provide automated price tracking, clearance deal detection, and cron-based automation.

## Features

- **Automated Price Monitoring**: Track product prices across multiple stores over time
- **Clearance Deal Detection**: Automatically identify products with significant price drops
- **Flexible Search**: Monitor specific product categories (e.g., LEGO, toys, electronics)
- **Store Coverage**: Automatically find and monitor stores within specified radius
- **Cron Integration**: Run automated scans multiple times per day
- **Rich CLI Interface**: Interactive setup and management commands
- **Data Persistence**: Store price history and results in organized JSON files

## Quick Start

### 1. Setup

```bash
# Clone the repository
git clone <repository-url>
cd meijer-price-monitor

# Run setup
make setup
```

### 2. Authentication

```bash
# Login to Meijer (required for API access)
venv/bin/python -m meijer.cli.main login
```

### 3. Create Your First Monitor

```bash
# Interactive setup
make init-monitor

# Or manually
venv/bin/python -m meijer.cli.main pricedrop init
```

### 4. Automated Monitoring (Optional)

```bash
# Set up cron job to run every 6 hours
make cron-setup

# Check cron status
make cron-status
```

## Usage Examples

### Interactive Setup

```bash
meijer pricedrop init

> What would you like to search for? "Jurassic LEGO"
> What city or ZIP? 46755
> What radius? 50
> What should we call this monitor? LEGO_Jurassic
```

### Run Monitors

```bash
# Run all configured monitors
meijer pricedrop run "LEGO_Jurassic"

# Or use the make target
make run-monitors
```

### Find Deals

```bash
# Find products with 20%+ discount
meijer pricedrop deals --min-discount 20

# Find deals under $50
meijer pricedrop deals --min-discount 30 --max-price 50
```

### Manage Monitors

```bash
# List all monitors
meijer pricedrop list

# Delete a monitor
meijer pricedrop delete "LEGO_Jurassic"
```

## Project Structure

```
meijer-price-monitor/
├── meijer/                    # Core Meijer API (symlink/submodule)
├── price_monitor/            # Price monitoring logic
├── scripts/                  # Automation scripts
├── price_data/              # Data storage (created during setup)
│   ├── config/              # Monitor configurations
│   ├── results/             # Scan results
│   ├── history/             # Price history
│   ├── logs/                # Execution logs
│   └── executions/          # Execution summaries
├── Makefile                 # Build and automation targets
├── requirements.txt          # Python dependencies
└── README.md               # This file
```

## Configuration

### Monitor Configuration

Monitors are stored in `price_data/config/monitors.json` and include:

- **Name**: Human-readable monitor identifier
- **Search Query**: Product search terms
- **Location**: City or ZIP code for store search
- **Radius**: Search radius in miles
- **Stores**: List of store IDs to monitor
- **Schedule**: When to run (if using cron)

### Data Storage

- **Results**: Individual scan results with timestamps
- **History**: Price change tracking per product/store
- **Logs**: Execution logs for debugging and monitoring
- **Executions**: Summary reports for each automated run

## Automation

### Cron Setup

The system can be configured to run automatically via cron:

```bash
# Set up cron job (runs every 6 hours)
make cron-setup

# Remove cron job
make cron-remove

# Check cron status
make cron-status
```

### Manual Execution

```bash
# Run all monitors manually
make run-monitors

# Or use the script directly
venv/bin/python scripts/run_price_monitors.py
```

## Dependencies

### Core Dependencies

- **Python 3.8+**: Modern Python with type hints support
- **Meijer API**: Core API client for store and product data
- **Click**: CLI framework for command-line interface
- **Rich**: Rich text and formatting for CLI output

### Optional Dependencies

- **Cron**: For automated execution (system-level)
- **Pushover/IMAP/Signal**: For notifications (future enhancement)

## Development

### Setup Development Environment

```bash
# Create virtual environment
make venv

# Install dependencies
make install-deps

# Run tests
make test
```

### Project Structure

The project is designed to be modular and extensible:

- **Price Monitor Core**: Core monitoring logic and data structures
- **CLI Commands**: User interface for setup and management
- **Automation Scripts**: Cron-friendly execution scripts
- **Data Management**: JSON-based storage and retrieval

## Future Enhancements

- **Notification System**: Pushover, email, or Signal notifications for deals
- **Web Dashboard**: Web interface for monitoring and analysis
- **Price Alerts**: Customizable price drop thresholds
- **Store Comparison**: Compare prices across different store locations
- **Export Options**: CSV, Excel, or API export of price data

## Troubleshooting

### Common Issues

1. **Authentication Errors**: Ensure you're logged in with `meijer login`
2. **Store Not Found**: Check location and radius settings
3. **No Products Found**: Verify search query and store availability
4. **Cron Issues**: Check cron status with `make cron-status`

### Logs and Debugging

```bash
# View recent logs
make logs

# Check system status
make status

# Run with verbose output
venv/bin/python -m meijer.cli.main pricedrop --verbose run "MonitorName"
```

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests if applicable
5. Submit a pull request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Support

For issues and questions:

1. Check the troubleshooting section
2. Review logs with `make logs`
3. Open an issue on GitHub
4. Check the core Meijer API documentation

---

**Happy Price Hunting! 🛒💰**
