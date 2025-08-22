# Meijer API Jupyter Notebooks

This directory contains comprehensive Jupyter notebooks demonstrating the Meijer API client functionality, organized by complexity and learning progression.

## Notebooks Overview

### 🚀 **00-09: Basic/Introductory** (Start Here!)
- **`01_basic_usage.ipynb`** - Very basic Meijer() demo and client initialization
- **`02_client.ipynb`** - Basic client setup and usage patterns
- **`03_auth.ipynb`** - Basic authentication and token management
- **`04_enums.ipynb`** - API enumeration values and constants
- **`05_exceptions.ipynb`** - Error handling and exception classes

### 🔧 **10-19: Core Functionality**
- **`10_stores.ipynb`** - Store operations and location services
- **`11_search.ipynb`** - Product search functionality
- **`12_cart.ipynb** - Shopping cart management and operations
- **`13_coupons.ipynb`** - Coupon and offer management
- **`14_mperks.ipynb`** - mPerks rewards and loyalty program basics
- **`15_shopping_list.ipynb`** - Shopping list management operations
- **`16_settings.ipynb`** - Account settings and preferences

### ⚡ **20-29: Advanced Features**
- **`20_shop_scan.ipynb`** - Shop & Scan barcode functionality
- **`21_gas.ipynb`** - Gas station information and fuel prices
- **`22_feedback.ipynb`** - Feedback submission system
- **`23_product_operations.ipynb`** - Product operations and management
- **`24_coupon_operations.ipynb`** - Advanced coupon operations
- **`25_price_monitor.ipynb`** - Price monitoring and tracking
- **`26_email_2fa.ipynb`** - Email-based two-factor authentication

### 🎯 **30-39: Complex Demos & Examples**
- **`30_demo_mperks_earn.ipynb`** - mPerks earning demonstrations
- **`31_demo_mperks_reward_coupons.ipynb`** - mPerks reward coupons examples
- **`32_store_functionality_demo.ipynb`** - Store functionality demonstrations
- **`33_barcode_lookup_demo.ipynb`** - Barcode lookup and price checking
- **`34_mperks_demo.ipynb`** - mPerks point balance and fuel coupons

### 🔌 **40-49: API & Integration**
- **`40_api_client.ipynb`** - API client examples and integration
- **`41_ad_browser.ipynb`** - Ad browsing and promotions

### 🛠️ **80+: Scripts & Tooling**
- **`regenerate_all_notebooks.py`** - Regenerate all notebooks from generators
- **`execute_notebooks.py`** - Execute all notebooks and embed outputs
- **`evaluate_notebooks.py`** - Evaluate notebook execution status
- **`*_notebook_gen.py`** - Individual notebook generators

## Learning Path

### **Beginner Path** (01-05)
Start with basic usage and work through authentication and fundamentals.

### **Core Skills** (10-16)
Learn essential shopping, search, and store operations.

### **Advanced Features** (20-26)
Explore specialized functionality like Shop & Scan and price monitoring.

### **Real Examples** (30-34)
See complex, real-world usage patterns and demonstrations.

### **Integration** (40-41)
Learn how to integrate the API client into larger applications.

## Features

✅ **Executed Notebooks** - All notebooks contain execution outputs demonstrating real functionality
✅ **GitHub Compatible** - Ready for nbviewer.org and GitHub rendering
✅ **Modular Design** - Each notebook focuses on a specific area of functionality
✅ **Error Handling** - Shows real API responses and error handling
✅ **Best Practices** - Demonstrates proper usage patterns and examples
✅ **Comprehensive Coverage** - Covers all major Meijer API functionality
✅ **Progressive Learning** - Numbered system guides learning progression

## Functionality Coverage

### 🛒 Shopping & Lists
- Shopping list management (15)
- Shopping cart operations (12)
- Product search and discovery (11)
- Shop & Scan barcode functionality (20)

### 🏪 Store Services
- Store locations and information (10)
- Gas station services and prices (21)
- Store amenities and hours (10)
- Location-based services (10)

### 🎫 Rewards & Savings
- mPerks loyalty program (14, 30, 31, 34)
- Coupon management (13, 24)
- Advanced coupon operations (24)
- Reward tracking (14, 30, 31, 34)

### 🔧 Account & Settings
- Authentication methods (03)
- Account settings (16)
- User preferences (16)
- Feedback submission (22)

### 📱 Additional Features
- Ad browsing (41)
- Product operations (23)
- Error handling (05)
- API enumerations (04)
- Price monitoring (25)
- Email 2FA (26)

## Viewing Notebooks

- **GitHub**: Notebooks render directly in GitHub repositories
- **nbviewer.org**: Use `https://nbviewer.org/github/USERNAME/REPO/blob/main/notebooks/notebook.ipynb`
- **Local**: Open with Jupyter Notebook, JupyterLab, or VS Code

## Regeneration

These notebooks are generated from Python scripts in the `notebooks/` directory:
- `regenerate_all_notebooks.py` - Main orchestrator for all notebooks
- `*_notebook_gen.py` - Individual notebook generators

To regenerate all notebooks:
```bash
cd notebooks
python regenerate_all_notebooks.py
```

## Requirements

- Python 3.8+
- meijer package
- Jupyter environment (for local execution)

## Status

All 26 notebooks are currently working and ready for GitHub/nbviewer deployment.

## Getting Started

1. **Start with `01_basic_usage.ipynb`** to set up your client
2. **Learn core functionality** with notebooks 10-16 (stores, search, cart)
3. **Explore advanced features** with notebooks 20-26 (Shop & Scan, gas, price monitoring)
4. **See real examples** with notebooks 30-34 (complex demos)
5. **Learn integration** with notebooks 40-41 (API client examples)

Each notebook is self-contained and demonstrates real API functionality with proper error handling and examples. The numbering system makes it easy to follow a logical learning progression from basic concepts to advanced features.
