# Meijer API Client

A comprehensive Python client for the Meijer API, providing access to shopping lists, coupons, store information, gas prices, and more.

## 🚀 Features

- **Authentication**: OAuth2 Bearer token authentication with automatic refresh
- **Shopping Lists**: Create, manage, and sync shopping lists
- **Coupons**: Browse, clip, and manage digital coupons
- **Store Information**: Find stores, get hours, and check gas prices
- **Product Search**: Search products with barcode lookup support
- **Shop & Scan**: Add items to cart and manage shopping trips
- **mPerks**: Access loyalty rewards and earned points
- **CLI Interface**: Command-line tools for quick operations

## 📁 Project Structure

```
meijer/
├── meijer/           # Core API client library
├── notebooks/        # Jupyter notebooks and generators
├── tests/           # Test suite
├── tools/           # Analysis and utility tools
├── demos/           # Example scripts and demonstrations
├── meijer_cli.py    # Command-line interface
├── Makefile         # Development workflow automation
└── requirements.txt # Python dependencies
```

## 🛠️ Installation

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd python_Meijer
   ```

2. **Create virtual environment:**
   ```bash
   python3 -m venv venv
   source venv/bin/activate  # On Windows: venv\Scripts\activate
   ```

3. **Install dependencies:**
   ```bash
   pip install -r requirements.txt
   pip install -r requirements-test.txt  # For testing
   ```

4. **Install in development mode:**
   ```bash
   pip install -e .
   ```

## 🔐 Authentication

The client uses OAuth2 Bearer token authentication. Tokens are automatically loaded from `~/.config/meijer.txt`.

### Setting up authentication:

1. **Capture traffic** using mitmproxy:
   ```bash
   make log
   ```

2. **Extract authentication tokens:**
   ```bash
   make auth
   ```

3. **Verify authentication:**
   ```bash
   python -c "from meijer.client import Meijer; client = Meijer(); print('Auth status:', 'OK' if client._access_token else 'Failed')"
   ```

## 📖 Usage

### Basic Client Usage

```python
from meijer.client import Meijer

# Initialize client (automatically loads auth from ~/.config/meijer.txt)
client = Meijer()

# Get shopping list
shopping_list = client.list.get()

# Search for products
results = client.search.search("milk")

# Get store information
stores = client.get_stores(zip_code="48105")

# Check gas prices
gas_info = client.gas.get_gas_prices(store_id="217")
```

### Command Line Interface

```bash
# Add item to shopping list
python meijer_cli.py list add "Milk, 2%" -q 2

# View shopping list
python meijer_cli.py list show

# Search for products
python meijer_cli.py search "organic bananas"

# Get store information
python meijer_cli.py stores --zip 48105
```

## 🧪 Testing

Run the test suite:

```bash
# Run all tests
make test

# Run specific test categories
pytest tests/test_shopping_list.py
pytest tests/test_coupons.py

# Run with coverage
make coverage
```

## 🔧 Development

### Makefile Targets

- `make test` - Run test suite
- `make coverage` - Run tests with coverage report
- `make log` - Start mitmproxy traffic capture
- `make auth` - Extract authentication tokens from logs
- `make clean` - Clean up temporary files

### Code Quality

- **Type Hints**: Full mypy typing support
- **Documentation**: NumPy-style docstrings
- **Testing**: Comprehensive pytest test suite
- **Linting**: Ruff for code quality

## 📚 API Coverage

The client provides access to:

- **Shopping Lists**: Create, read, update, delete items
- **Coupons**: Browse, clip, unclip digital offers
- **Stores**: Location search, hours, gas prices
- **Products**: Search, barcode lookup, pricing
- **mPerks**: Loyalty rewards and points
- **Shop & Scan**: Cart management and barcode scanning

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes with proper typing and documentation
4. Add tests for new functionality
5. Run the test suite
6. Submit a pull request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## ⚠️ Security

- **Never commit authentication tokens** to version control
- **Use environment variables** for sensitive configuration
- **Keep dependencies updated** for security patches
- **Report security issues** via the [SECURITY.md](SECURITY.md) process

## 🔗 Related

- [API Discovery Summary](API_DISCOVERY_SUMMARY.md) - Comprehensive API endpoint analysis
- [Security Policy](SECURITY.md) - Security reporting and guidelines
- [Test Reports](htmlcov/) - Code coverage and test results
