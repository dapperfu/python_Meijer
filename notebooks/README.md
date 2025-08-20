# Meijer API Jupyter Notebooks

This directory contains comprehensive Jupyter notebooks demonstrating the Meijer API client functionality.

## Notebooks Overview

### Core Functionality
- **`basic_usage.ipynb`** - Client initialization and authentication
- **`shopping_list.ipynb`** - Shopping list management operations
- **`search.ipynb`** - Product search functionality
- **`stores.ipynb`** - Store operations and location services
- **`coupons.ipynb`** - Coupon and offer management
- **`mperks.ipynb`** - mPerks rewards and loyalty program

### Advanced Features
- **`gas.ipynb`** - Gas station information and fuel prices
- **`cart.ipynb`** - Shopping cart management and operations
- **`shop_scan.ipynb`** - Shop & Scan barcode functionality
- **`feedback.ipynb`** - Feedback submission system
- **`settings.ipynb`** - Account settings and preferences
- **`ad_browser.ipynb`** - Ad browsing and promotions
- **`product_operations.ipynb`** - Product operations and management
- **`coupon_operations.ipynb`** - Advanced coupon operations

### Reference and Utilities
- **`enums.ipynb`** - API enumeration values and constants
- **`exceptions.ipynb`** - Error handling and exception classes
- **`auth.ipynb`** - Authentication methods and token management

## Features

✅ **Executed Notebooks** - All notebooks contain execution outputs demonstrating real functionality
✅ **GitHub Compatible** - Ready for nbviewer.org and GitHub rendering
✅ **Modular Design** - Each notebook focuses on a specific area of functionality
✅ **Error Handling** - Shows real API responses and error handling
✅ **Best Practices** - Demonstrates proper usage patterns and examples
✅ **Comprehensive Coverage** - Covers all major Meijer API functionality

## Functionality Coverage

### 🛒 Shopping & Lists
- Shopping list management
- Shopping cart operations
- Product search and discovery
- Shop & Scan barcode functionality

### 🏪 Store Services
- Store locations and information
- Gas station services and prices
- Store amenities and hours
- Location-based services

### 🎫 Rewards & Savings
- mPerks loyalty program
- Coupon management
- Advanced coupon operations
- Reward tracking

### 🔧 Account & Settings
- Authentication methods
- Account settings
- User preferences
- Feedback submission

### 📱 Additional Features
- Ad browsing
- Product operations
- Error handling
- API enumerations

## Viewing Notebooks

- **GitHub**: Notebooks render directly in GitHub repositories
- **nbviewer.org**: Use `https://nbviewer.org/github/USERNAME/REPO/blob/main/notebooks/notebook.ipynb`
- **Local**: Open with Jupyter Notebook, JupyterLab, or VS Code

## Regeneration

These notebooks are generated from Python scripts in the `notebooks/` directory:
- `client_notebook_gen_core.py` - Main orchestrator
- `client_notebook_gen_sections.py` - Individual notebook generators

To regenerate all notebooks:
```bash
cd notebooks
python client_notebook_gen_core.py
```

## Requirements

- Python 3.8+
- meijer package
- Jupyter environment (for local execution)

## Status

All 17 notebooks are currently working and ready for GitHub/nbviewer deployment.

## Notebook Details

### Core Notebooks (6)
These notebooks cover the essential Meijer API functionality:
- **basic_usage.ipynb** - Start here to learn client setup and authentication
- **shopping_list.ipynb** - Manage your shopping lists and favorites
- **search.ipynb** - Find products and get pricing information
- **stores.ipynb** - Locate stores and get store information
- **coupons.ipynb** - Browse and manage available coupons
- **mperks.ipynb** - Track rewards and loyalty benefits

### Advanced Feature Notebooks (8)
These notebooks cover specialized functionality:
- **gas.ipynb** - Gas station locations, prices, and amenities
- **cart.ipynb** - Shopping cart management and operations
- **shop_scan.ipynb** - Barcode scanning and Shop & Scan features
- **feedback.ipynb** - Submit feedback about your experience
- **settings.ipynb** - Account settings and preferences
- **ad_browser.ipynb** - Browse current ads and promotions
- **product_operations.ipynb** - Advanced product management
- **coupon_operations.ipynb** - Advanced coupon operations

### Reference Notebooks (3)
These notebooks provide reference information:
- **enums.ipynb** - API constants and enumeration values
- **exceptions.ipynb** - Error handling and exception types
- **auth.ipynb** - Authentication methods and token management

## Getting Started

1. **Start with `basic_usage.ipynb`** to set up your client
2. **Explore core functionality** with shopping, search, and store notebooks
3. **Discover advanced features** like gas stations and Shop & Scan
4. **Reference utilities** for error handling and API constants

Each notebook is self-contained and demonstrates real API functionality with proper error handling and examples.
