# API Meijer Endpoint Extraction & Flask Server Update Tools

This directory contains specialized tools for extracting `api.meijer.com` endpoints from mitmproxy logs and automatically updating the Meijer Flask API server with the latest discovered endpoints.

## 🎯 Overview

These tools provide a complete workflow to:
1. **Extract** all `api.meijer.com` endpoints from mitmproxy logs
2. **Analyze** endpoint patterns, methods, and usage
3. **Update** the Flask API server with new endpoints
4. **Generate** comprehensive reports and updated code

## 🛠️ Tools Included

### 1. `extract_api_meijer_endpoints.py`
**Purpose**: Extracts `api.meijer.com` endpoints from mitmproxy logs
**Features**:
- Analyzes mitmproxy binary logs or fallback text analysis
- Extracts HTTP methods, headers, and response patterns
- Categorizes endpoints by functionality
- Generates Flask route code automatically
- Creates comprehensive JSON reports

**Usage**:
```bash
python extract_api_meijer_endpoints.py <log_file> [output_dir]
```

**Example**:
```bash
python extract_api_meijer_endpoints.py meijer.log output/
```

### 2. `update_flask_api_server.py`
**Purpose**: Updates existing Flask API server with new endpoints
**Features**:
- Loads existing Flask app.py file
- Identifies new endpoints not already implemented
- Generates Flask route code for new endpoints
- Maintains existing functionality
- Creates update reports

**Usage**:
```bash
python update_flask_api_server.py <flask_app.py> <endpoints_data.json> [output_dir]
```

**Example**:
```bash
python update_flask_api_server.py meijer-api-flask/app.py api_meijer_endpoints_20241219_143022.json output/
```

### 3. `update_meijer_flask_workflow.py`
**Purpose**: Complete automated workflow combining both tools
**Features**:
- Runs endpoint extraction and Flask update in sequence
- Generates comprehensive workflow reports
- Provides summary of all changes
- Automates the entire update process

**Usage**:
```bash
python update_meijer_flask_workflow.py <log_file> <flask_app.py> [output_dir]
```

**Example**:
```bash
python update_meijer_flask_workflow.py meijer.log meijer-api-flask/app.py output/
```

## 🚀 Quick Start

### Prerequisites
- Python 3.7+
- Virtual environment activated (`source venv/bin/activate`)
- mitmproxy logs containing `api.meijer.com` calls
- Existing Meijer Flask API server

### Step 1: Extract Endpoints
```bash
cd tools/
python extract_api_meijer_endpoints.py ../meijer.log output/
```

This will generate:
- `api_meijer_endpoints_YYYYMMDD_HHMMSS.json` - Comprehensive endpoint data
- `flask_routes_YYYYMMDD_HHMMSS.py` - Generated Flask routes

### Step 2: Update Flask Server
```bash
python update_flask_api_server.py ../meijer-api-flask/app.py output/api_meijer_endpoints_YYYYMMDD_HHMMSS.json output/
```

This will generate:
- `app_updated_YYYYMMDD_HHMMSS.py` - Updated Flask app with new endpoints
- `flask_update_report_YYYYMMDD_HHMMSS.json` - Update operation report

### Step 3: Or Use Complete Workflow
```bash
python update_meijer_flask_workflow.py ../meijer.log ../meijer-api-flask/app.py output/
```

This automates both steps and provides a comprehensive summary.

## 📊 Output Files

### Endpoint Extraction Output
- **JSON Report**: Complete endpoint data with methods, headers, and samples
- **Flask Routes**: Python code for all discovered endpoints
- **Categories**: Endpoints organized by functionality

### Flask Update Output
- **Updated App**: Flask app.py with new endpoints added
- **Update Report**: Summary of what was added/changed
- **Workflow Report**: Complete workflow summary (if using workflow tool)

## 🔍 Endpoint Categories

The tools automatically categorize endpoints into:

- **Authentication**: Login, tokens, OAuth flows
- **Cart & Shopping**: Cart operations, checkout, shopping lists
- **Products & Search**: Product lookup, UPC search, recommendations
- **mPerks & Loyalty**: Rewards, points, loyalty programs
- **Stores & Locations**: Store information, location services
- **Fulfillment**: Pickup, delivery, reservation slots
- **User Profile**: Customer accounts, profiles, preferences
- **Other**: Miscellaneous endpoints

## 🎛️ Configuration Options

### Extraction Options
- **Log File Format**: Supports mitmproxy binary logs and text logs
- **Fallback Analysis**: Works even without mitmproxy libraries
- **Output Directory**: Customizable output location
- **Sample Limits**: Configurable number of request/response samples

### Update Options
- **Flask App Path**: Path to existing Flask app.py
- **Endpoint Data**: JSON file from extraction step
- **Output Location**: Where to save updated files
- **Function Naming**: Automatic generation of unique function names

## 🔧 Advanced Usage

### Custom Endpoint Filtering
Modify the `_is_api_meijer_endpoint()` method in `extract_api_meijer_endpoints.py` to filter specific endpoints:

```python
def _is_api_meijer_endpoint(self, url: str) -> bool:
    """Custom filtering logic."""
    if 'api.meijer.com' not in url.lower():
        return False
    
    # Add custom filters
    if '/internal/' in url.lower():
        return False  # Skip internal endpoints
    
    return True
```

### Custom Flask Route Generation
Modify the `generate_flask_routes()` method to customize route generation:

```python
def generate_flask_routes(self) -> str:
    """Custom route generation logic."""
    # Add custom headers, rate limiting, or caching
    # Modify TTL values, add authentication checks, etc.
```

### Batch Processing
Process multiple log files:

```bash
for log_file in logs/*.log; do
    python extract_api_meijer_endpoints.py "$log_file" "output/$(basename "$log_file" .log)/"
done
```

## 📈 Monitoring & Maintenance

### Regular Updates
- Run extraction weekly to discover new endpoints
- Update Flask server monthly with new endpoints
- Monitor for deprecated or changed endpoints

### Quality Assurance
- Review generated routes before deployment
- Test new endpoints with sample requests
- Validate response handling and error cases

### Performance Considerations
- Large log files may take time to process
- Consider log rotation and archiving
- Monitor memory usage during extraction

## 🐛 Troubleshooting

### Common Issues

**"mitmproxy not available" warning**
- Install mitmproxy: `pip install mitmproxy`
- Or use fallback text analysis mode

**"No new endpoints found"**
- Check if log file contains api.meijer.com calls
- Verify log file format and encoding
- Ensure endpoints are not already implemented

**"Function name conflict"**
- Tools automatically generate unique function names
- Check for duplicate route definitions
- Review existing Flask app structure

### Debug Mode
Enable detailed logging:

```python
logging.basicConfig(level=logging.DEBUG)
```

### Validation
Verify extracted endpoints:

```bash
# Check JSON report structure
python -m json.tool output/api_meijer_endpoints_*.json | head -50

# Validate Flask routes syntax
python -m py_compile output/flask_routes_*.py
```

## 🔗 Integration with Existing Tools

These tools integrate with the existing Meijer analysis ecosystem:

- **TOOLS.md**: Comprehensive documentation of all tools
- **Existing Extractors**: Builds on patterns from other endpoint extractors
- **Flask Server**: Updates the existing meijer-api-flask server
- **Reports**: Generates compatible JSON reports for further analysis

## 📝 Contributing

To extend these tools:

1. **Add New Categories**: Modify `categorize_endpoints()` method
2. **Custom Headers**: Extend header extraction logic
3. **Flask Templates**: Customize route generation templates
4. **Validation**: Add endpoint validation rules
5. **Testing**: Create test cases for new functionality

## 📚 Related Documentation

- [TOOLS.md](../TOOLS.md) - Complete tools documentation
- [meijer-api-flask README](../meijer-api-flask/README.md) - Flask server documentation
- [API Implementation Plan](../ENDPOINT_IMPLEMENTATION_PLAN.md) - Overall API strategy

## 🎉 Success Metrics

These tools help achieve:

- **Faster Development**: Automatic endpoint discovery and implementation
- **Better Coverage**: Comprehensive API endpoint coverage
- **Reduced Errors**: Automated code generation reduces manual errors
- **Consistent Patterns**: Standardized Flask route implementation
- **Documentation**: Automatic generation of endpoint documentation

---

**Last Updated**: December 19, 2024  
**Tools Version**: 1.0.0  
**Compatibility**: Python 3.7+, Flask 2.0+, mitmproxy 8.0+
