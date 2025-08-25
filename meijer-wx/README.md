# meijer-wx

A cross-platform wxPython desktop application providing full feature parity with the `python_Meijer` v2 CLI.

## Features

- 🖥️ **Cross-platform GUI**: Windows, macOS, and Linux support
- 🛒 **Full CLI Parity**: Every CLI command and option has an equivalent GUI action
- 🔐 **Authentication Management**: Complete OAuth2 flows with log analysis
- 📧 **Email 2FA**: Automated verification code handling
- 🏪 **Store Operations**: Search, browse, and manage store information
- 🎫 **Coupon Management**: Browse, clip, and manage available offers
- 📊 **Data Export**: Multiple formats (CSV, Excel, JSON, Text)
- 🎯 **Cost Estimation**: Smart pricing with multiple methodologies
- ⚙️ **Settings Management**: Global proxy, backend, and export defaults

## Requirements

- **Python**: 3.11 or later
- **OS**: Windows 10+, macOS 12+, Ubuntu 22.04+
- **GUI Toolkit**: wxPython 4.2+

## Quick Start

### 1. Setup Development Environment

```bash
# Clone the repository
git clone https://github.com/dapperfu/python_Meijer.git
cd python_Meijer/meijer-wx

# Create virtual environment and install dependencies
make dev-setup

# Run the application
make run
```

### 2. Using the Makefile

The project includes a comprehensive Makefile for all development tasks:

```bash
# Show all available commands
make help

# Full development cycle
make all

# Just run the application
make run

# Build executable
make build

# Run tests
make test

# Code quality checks
make check
```

## Installation

### From Source

```bash
# Clone and setup
git clone https://github.com/dapperfu/python_Meijer.git
cd python_Meijer/meijer-wx

# Create virtual environment
make venv

# Install dependencies
make install

# Run the application
make run
```

### Development Installation

```bash
# Install with development dependencies
make install-dev

# Setup pre-commit hooks
make pre-commit

# Run full development cycle
make dev-cycle
```

## Building Executables

### Cross-platform Builds

```bash
# Build for current platform
make build

# Build for specific platforms
make build-linux
make build-windows
make build-macos

# Build one-folder distribution
make build-folder
```

### PyInstaller Configuration

The application uses PyInstaller for creating standalone executables:

- **One-file**: Single executable with all dependencies
- **Windowed**: No console window on Windows/macOS
- **Cross-platform**: Separate builds for each OS

## Project Structure

```
meijer-wx/
├── app.py                 # Main application entry point
├── ui/                    # GUI panels and dialogs
│   ├── main_frame.py     # Main application frame
│   ├── dashboard.py      # Dashboard panel
│   ├── list_panel.py     # Shopping list management
│   ├── coupons_panel.py  # Coupon management
│   ├── stores_panel.py   # Store operations
│   ├── cart_panel.py     # Cart management
│   ├── auth_panel.py     # Authentication
│   ├── email2fa_panel.py # Email 2FA setup
│   ├── settings_dialog.py # Settings dialog
│   └── log_panel.py      # Logging panel
├── services/              # Business logic services
│   ├── client.py         # Meijer API client
│   ├── settings.py       # Configuration management
│   └── export.py         # Data export services
├── controllers/           # UI controllers
├── models/                # Data models
├── assets/                # Icons and resources
├── tests/                 # Test suite
├── requirements.txt       # Runtime dependencies
├── requirements-dev.txt   # Development dependencies
├── pyproject.toml        # Project configuration
├── Makefile              # Build and development tasks
└── README.md             # This file
```

## Configuration

### Settings File

The application stores configuration in platform-appropriate directories:

- **Windows**: `%APPDATA%\meijer-wx\config.toml`
- **macOS**: `~/Library/Application Support/meijer-wx/config.toml`
- **Linux**: `~/.config/meijer-wx/config.toml`

### Key Settings

```toml
[proxy]
host = "127.0.0.1"
port = 8080

[backend]
local_url = "http://127.0.0.1:5000"

[export]
default_format = "csv"
default_path = "~/Documents/meijer-exports"

[logging]
level = "INFO"
show_panel = false
```

## Development

### Code Quality

The project enforces strict code quality standards:

```bash
# Run all quality checks
make check

# Auto-fix issues
make fix

# Type checking
make typecheck
```

### Testing

```bash
# Run tests
make test

# Run with coverage
make test-cov

# Watch mode for development
make test-watch
```

### Pre-commit Hooks

```bash
# Install hooks
make pre-commit

# Run on all files
make pre-commit-all
```

## CLI Parity

Every CLI command from `python_Meijer` v2 has a GUI equivalent:

| CLI Command | GUI Location | Features |
|-------------|--------------|----------|
| `meijer list *` | Shopping List Panel | Add, remove, estimate, defrag, import/export |
| `meijer coupons *` | Coupons Panel | Browse, clip, filter |
| `meijer stores *` | Stores Panel | Search, nearby, gas prices |
| `meijer cart *` | Cart Panel | Show, add, remove, slots, checkout |
| `meijer auth *` | Auth Panel | Login, logout, log analysis, status |
| `meijer email-2fa *` | Email 2FA Panel | Setup, test, wait for codes |
| `meijer settings` | Settings Dialog | Global proxy, backend, defaults |

## Architecture

### Design Principles

- **Separation of Concerns**: UI, business logic, and data access are separate
- **Non-blocking Operations**: All long-running tasks use worker threads
- **Configuration Driven**: Settings are externalized and hot-reloadable
- **Error Handling**: Comprehensive error handling with user-friendly messages

### Concurrency Model

- **Main Thread**: UI updates and user interaction
- **Worker Threads**: Network operations and data processing
- **Event Queue**: Thread-safe communication between layers
- **wx.CallAfter**: Safe UI updates from worker threads

## Troubleshooting

### Common Issues

1. **wxPython Installation**
   ```bash
   # On Ubuntu/Debian
   sudo apt-get install python3-wxgtk4.0
   
   # On macOS
   brew install wxpython
   ```

2. **Virtual Environment Issues**
   ```bash
   # Clean and recreate
   make clean-venv
   make venv
   make install
   ```

3. **Import Errors**
   ```bash
   # Ensure meijer package is installed
   pip install -e ../
   ```

### Debug Mode

```bash
# Run with verbose logging
make run-dev

# Show log panel
# View → Show Log Panel
```

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Run quality checks: `make check`
5. Run tests: `make test`
6. Submit a pull request

### Development Workflow

```bash
# Setup development environment
make dev-setup

# Make changes and test
make dev-cycle

# Run full release cycle
make release
```

## License

MIT License - see [LICENSE](../LICENSE) file for details.

## Support

- **Issues**: [GitHub Issues](https://github.com/dapperfu/python_Meijer/issues)
- **Documentation**: [GitHub Wiki](https://github.com/dapperfu/python_Meijer/wiki)
- **Discussions**: [GitHub Discussions](https://github.com/dapperfu/python_Meijer/discussions)

## Acknowledgments

- Built with [wxPython](https://wxpython.org/)
- Based on [python_Meijer](https://github.com/dapperfu/python_Meijer) v2
- Developed with [Cursor](https://cursor.sh) and AI assistance
