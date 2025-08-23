# Meijer Tools Directory

This directory contains all tools and scripts for the Meijer Python project, unified from the previous `scripts/` and `tools/` directories.

## 🎯 Directory Purpose

The `tools/` directory serves two main purposes:

1. **Production Scripts** - Executable scripts for production use and automation
2. **Analysis Tools** - Development utilities for API analysis and understanding

## 📁 Directory Structure

### Production Scripts
- **`run_price_monitors.py`** - Automated price monitoring for cron execution
- **`find_working_upcs.py`** - Find working UPCs for testing
- **`test_upc_edge_cases.py`** - Test UPC edge cases
- **`shop_n_scan_faker.py`** - Shop & scan testing
- **`deploy_docs.sh`** - Documentation deployment

### Analysis Tools
- **`comprehensive_log_analyzer.py`** - Analyze mitmproxy logs
- **`analyze_auth_flows.py`** - Analyze authentication patterns
- **`extract_api_meijer_endpoints.py`** - Extract API endpoints
- **`constructor_search_analyzer.py`** - Analyze search functionality
- **`analyze_complex_promotions.py`** - Analyze promotions endpoint

## 🚀 Quick Start

### For Production Use
```bash
# Run price monitors (for cron jobs)
python tools/run_price_monitors.py

# Find working UPCs for testing
python tools/find_working_upcs.py

# Test specific UPC edge cases
python tools/test_upc_edge_cases.py <upc_code>
```

### For Analysis & Development
```bash
# Analyze mitmproxy logs
python tools/comprehensive_log_analyzer.py

# Extract API endpoints
python tools/extract_api_meijer_endpoints.py <log_file>

# Analyze authentication flows
python tools/analyze_auth_flows.py <log_file>
```

## 📚 Documentation

- **`TOOLS.md`** - Comprehensive documentation for all tools
- **`README_API_MEIJER_TOOLS.md`** - API endpoint extraction tools
- **`README.md`** - This overview file

## 🔧 Development

All tools are designed to work with the Meijer Python client and can be run from the project root:

```bash
cd /projects/python_Meijer
source venv/bin/activate
python tools/<tool_name>.py
```

## 📝 Adding New Tools

When adding new tools:

1. **Production Scripts** - Place in root of `tools/` directory
2. **Analysis Tools** - Place in root of `tools/` directory
3. **Update `TOOLS.md`** - Add documentation for new tools
4. **Follow naming convention** - Use descriptive names with `.py` extension

## 🎉 Benefits of Unified Structure

- **Single location** for all tools and scripts
- **Clear categorization** between production and analysis tools
- **Easier maintenance** and discovery
- **Consistent documentation** and usage patterns
- **Simplified project structure**
