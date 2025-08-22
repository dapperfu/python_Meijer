# Meijer API Analysis Tools Documentation

This document provides comprehensive documentation for all Python analysis tools in the `tools/` directory. These tools are designed to analyze mitmproxy logs, extract API endpoints, and understand the Meijer mobile application's behavior.

## Table of Contents

1. [Core Analysis Tools](#core-analysis-tools)
2. [Authentication & Authorization Tools](#authentication--authorization-tools)
3. [Cart & Shopping Tools](#cart--shopping-tools)
4. [Shop & Scan Tools](#shop--scan-tools)
5. [Coupon & mPerks Tools](#coupon--mperks-tools)
6. [API Discovery & Endpoint Tools](#api-discovery--endpoint-tools)
7. [Utility & Helper Tools](#utility--helper-tools)
8. [Data Analysis & Reporting Tools](#data-analysis--reporting-tools)

---

## Core Analysis Tools

### `analyze_workflow_endpoints.py`
**Purpose**: Analyzes mitmproxy logs for specific workflow endpoints and validates them against known patterns.
**Key Features**:
- Identifies logout, login, cart operations, shop'n'scan workflows
- Validates endpoints against existing suspected patterns
- Provides insights for header spoofing improvements
- Tracks workflow sequences and patterns

**Usage**: `python analyze_workflow_endpoints.py <log_file>`

### `comprehensive_log_analyzer.py`
**Purpose**: Comprehensive analysis of all mitmproxy log files to extract API endpoints, HTTP methods, and response structures.
**Key Features**:
- Analyzes all `*.log` files in directory
- Extracts HTTP requests/responses, JSON data, headers
- Identifies authentication patterns and metadata
- Provides domain-level analysis

**Usage**: `python comprehensive_log_analyzer.py`

### `direct_log_analyzer.py`
**Purpose**: Direct analysis of mitmproxy binary logs without using mitmproxy libraries.
**Key Features**:
- Reads binary log files directly
- Extracts HTTP flows and JSON responses
- Analyzes headers and authentication patterns
- Fallback when mitmproxy libraries unavailable

**Usage**: `python direct_log_analyzer.py <log_file>`

---

## Authentication & Authorization Tools

### `analyze_auth_flows.py`
**Purpose**: Focused analysis of Okta login workflows from device fingerprinting to token acquisition.
**Key Features**:
- Analyzes complete authentication flow
- Extracts cookies, headers, and token patterns
- Focuses on OKTA and Meijer authentication endpoints
- Provides detailed flow sequence analysis

**Usage**: `python analyze_auth_flows.py <log_file>`

### `analyze_login_headers.py`
**Purpose**: Analyzes login request headers to understand authentication patterns.
**Key Features**:
- Extracts authentication headers and patterns
- Analyzes device fingerprinting data
- Identifies required headers for successful login
- Provides header spoofing insights

**Usage**: `python analyze_login_headers.py <log_file>`

### `analyze_mitmproxy_headers.py`
**Purpose**: Comprehensive header analysis across all mitmproxy flows.
**Key Features**:
- Analyzes request and response headers
- Identifies authentication and session patterns
- Extracts user agent and device information
- Provides header correlation analysis

**Usage**: `python analyze_mitmproxy_headers.py <log_file>`

### `analyze_meijer_auth.py`
**Purpose**: Specialized analysis of Meijer-specific authentication patterns.
**Key Features**:
- Focuses on Meijer authentication endpoints
- Analyzes token refresh and session management
- Identifies authentication workflow patterns
- Provides Meijer-specific insights

**Usage**: `python analyze_meijer_auth.py <log_file>`

### `extract_bearer_token.py`
**Purpose**: Extracts and analyzes bearer tokens from authentication flows.
**Key Features**:
- Identifies bearer token patterns
- Analyzes token structure and expiration
- Extracts token from various authentication endpoints
- Provides token validation insights

**Usage**: `python extract_bearer_token.py <log_file>`

### `parse_mitmproxy_headers.py`
**Purpose**: Parses and analyzes mitmproxy header structures.
**Key Features**:
- Parses binary mitmproxy header data
- Extracts header key-value pairs
- Analyzes header patterns and correlations
- Provides structured header analysis

**Usage**: `python parse_mitmproxy_headers.py <log_file>`

---

## Cart & Shopping Tools

### `analyze_cart_endpoints.py`
**Purpose**: Analyzes cart-related API endpoints and methods from Meijer API logs.
**Key Features**:
- Identifies cart-related API calls
- Extracts cart methods and endpoints
- Analyzes cart response structures
- Provides cart operation coverage analysis

**Usage**: `python analyze_cart_endpoints.py <log_file>`

### `analyze_cart_bogo.py` (Multiple files)
**Purpose**: Analyzes Buy One Get One (BOGO) deals and cart operations.
**Files**:
- `analyze_existing_cart_bogo.py`: Analyzes existing cart BOGO patterns
- `analyze_json_cart_bogo.py`: Analyzes JSON cart BOGO structures
- `analyze_bogo40_patterns.py`: Analyzes specific BOGO 40% patterns
- `analyze_dual_cart_progression.py`: Analyzes dual cart progression

**Key Features**:
- Identifies BOGO deal patterns
- Analyzes cart progression with BOGO items
- Extracts pricing and discount structures
- Provides BOGO implementation insights

**Usage**: `python analyze_<type>_cart_bogo.py <log_file>`

### `cart_operations_finder.py`
**Purpose**: Finds and analyzes cart operation patterns in API logs.
**Key Features**:
- Identifies cart operation sequences
- Analyzes cart state changes
- Extracts cart operation parameters
- Provides cart workflow insights

**Usage**: `python cart_operations_finder.py <log_file>`

### `cart_operation_analyzer.py`
**Purpose**: Analyzes individual cart operations and their effects.
**Key Features**:
- Analyzes cart operation details
- Extracts operation parameters and responses
- Identifies cart state transitions
- Provides operation validation insights

**Usage**: `python cart_operation_analyzer.py <log_file>`

---

## Shop & Scan Tools

### `analyze_shop_scan_endpoints.py`
**Purpose**: Comprehensive analysis of shop and scan related endpoints.
**Key Features**:
- Identifies shop and scan endpoints
- Analyzes HTTP methods and responses
- Extracts JSON response structures
- Identifies missing features for implementation

**Usage**: `python analyze_shop_scan_endpoints.py <log_file>`

### `extract_shop_scan_endpoints.py`
**Purpose**: Extracts shop and scan endpoints from API logs.
**Key Features**:
- Filters shop and scan related API calls
- Extracts endpoint patterns and methods
- Analyzes response structures
- Provides endpoint categorization

**Usage**: `python extract_shop_scan_endpoints.py <log_file>`

### `proper_shop_scan_extractor.py`
**Purpose**: Enhanced shop and scan endpoint extraction with validation.
**Key Features**:
- Validates shop and scan endpoints
- Extracts complete endpoint information
- Analyzes endpoint relationships
- Provides implementation guidance

**Usage**: `python proper_shop_scan_extractor.py <log_file>`

### `comprehensive_shop_scan_analyzer.py`
**Purpose**: Comprehensive analysis of all shop and scan functionality.
**Key Features**:
- Analyzes complete shop and scan workflows
- Identifies endpoint dependencies
- Extracts workflow patterns
- Provides comprehensive implementation insights

**Usage**: `python comprehensive_shop_scan_analyzer.py <log_file>`

---

## Coupon & mPerks Tools

### `coupon_analyzer.py`
**Purpose**: Specialized analyzer for Meijer mPerks/api/offers endpoints.
**Key Features**:
- Analyzes coupon-related API calls
- Correlates with APK structures
- Extracts offer structures and patterns
- Provides MeijerCoupon class requirements

**Usage**: `python coupon_analyzer.py <log_file>`

### `coupon_endpoint_analyzer.py`
**Purpose**: Analyzes coupon endpoint patterns and structures.
**Key Features**:
- Identifies coupon endpoint patterns
- Analyzes request and response structures
- Extracts coupon validation logic
- Provides endpoint implementation insights

**Usage**: `python coupon_endpoint_analyzer.py <log_file>`

---

## API Discovery & Endpoint Tools

### `meijer_endpoint_extractor.py`
**Purpose**: Extracts and organizes Meijer-specific API endpoints from comprehensive reports.
**Key Features**:
- Filters Meijer-specific endpoints
- Categorizes endpoints by functionality
- Provides endpoint organization
- Excludes third-party services

**Usage**: `python meijer_endpoint_extractor.py <report_file>`

### `extract_api_endpoints.py`
**Purpose**: Extracts API endpoints from various log sources.
**Key Features**:
- Identifies API endpoint patterns
- Extracts endpoint metadata
- Analyzes endpoint relationships
- Provides endpoint discovery

**Usage**: `python extract_api_endpoints.py <log_file>`

### `extract_api_calls.py`
**Purpose**: Extracts API call patterns and sequences.
**Key Features**:
- Identifies API call patterns
- Extracts call sequences
- Analyzes call dependencies
- Provides API workflow insights

**Usage**: `python extract_api_calls.py <log_file>`

### `comprehensive_api_discovery.py`
**Purpose**: Comprehensive API discovery and analysis.
**Key Features**:
- Discovers all API endpoints
- Analyzes endpoint relationships
- Provides comprehensive API mapping
- Generates discovery reports

**Usage**: `python comprehensive_api_discovery.py <log_file>`

---

## Utility & Helper Tools

### `fix_unicode.py`
**Purpose**: Fixes Unicode encoding issues in log files and data.
**Key Features**:
- Handles Unicode encoding problems
- Fixes character encoding issues
- Provides data cleanup utilities
- Ensures data integrity

**Usage**: `python fix_unicode.py <input_file> <output_file>`

### `manage_config.py`
**Purpose**: Manages configuration files and settings.
**Key Features**:
- Manages tool configurations
- Provides configuration validation
- Handles configuration updates
- Ensures consistent settings

**Usage**: `python manage_config.py <command> [options]`

### `doc_validator.py`
**Purpose**: Validates documentation and configuration files.
**Key Features**:
- Validates file formats
- Checks configuration integrity
- Provides validation reports
- Ensures documentation quality

**Usage**: `python doc_validator.py <file_path>`

---

## Data Analysis & Reporting Tools

### `endpoint_frequency_analyzer.py`
**Purpose**: Analyzes endpoint usage frequency and patterns.
**Key Features**:
- Counts endpoint usage frequency
- Identifies popular endpoints
- Analyzes usage patterns
- Provides frequency reports

**Usage**: `python endpoint_frequency_analyzer.py <log_file>`

### `create_endpoint_histogram.py`
**Purpose**: Creates histograms of endpoint usage patterns.
**Key Features**:
- Generates endpoint usage histograms
- Visualizes usage patterns
- Provides statistical analysis
- Creates visual reports

**Usage**: `python create_endpoint_histogram.py <log_file>`

### `show_top_endpoints.py`
**Purpose**: Shows the most frequently used endpoints.
**Key Features**:
- Lists top endpoints by usage
- Provides usage statistics
- Identifies popular API calls
- Generates summary reports

**Usage**: `python show_top_endpoints.py <log_file>`

### `endpoint_summary.py`
**Purpose**: Provides summary of endpoint analysis results.
**Key Features**:
- Summarizes endpoint analysis
- Provides key insights
- Generates summary reports
- Identifies important findings

**Usage**: `python endpoint_summary.py <analysis_file>`

---

## Specialized Analysis Tools

### `analyze_aug22_flows.py`
**Purpose**: Analyzes specific flows from August 22nd logs.
**Key Features**:
- Focuses on specific date flows
- Analyzes temporal patterns
- Extracts date-specific insights
- Provides historical analysis

**Usage**: `python analyze_aug22_flows.py <log_file>`

### `analyze_meijer3_log.py`
**Purpose**: Analyzes specific Meijer3 log files.
**Key Features**:
- Focuses on Meijer3 log analysis
- Extracts Meijer3-specific patterns
- Provides Meijer3 insights
- Analyzes specific log format

**Usage**: `python analyze_meijer3_log.py <log_file>`

### `analyze_pricing_tiers.py`
**Purpose**: Analyzes pricing tier structures and patterns.
**Key Features**:
- Identifies pricing tier patterns
- Analyzes price structures
- Extracts pricing logic
- Provides pricing insights

**Usage**: `python analyze_pricing_tiers.py <log_file>`

### `analyze_price_per_item.py`
**Purpose**: Analyzes price per item calculations and patterns.
**Key Features**:
- Analyzes item pricing
- Extracts price calculation logic
- Identifies pricing patterns
- Provides pricing validation

**Usage**: `python analyze_price_per_item.py <log_file>`

---

## Search & Lookup Tools

### `search_specific_upc.py`
**Purpose**: Searches for specific UPC codes in log files.
**Key Features**:
- Searches for specific UPC patterns
- Extracts UPC-related flows
- Analyzes UPC search patterns
- Provides UPC-specific insights

**Usage**: `python search_specific_upc.py <log_file> <upc>`

### `simple_upc_search.py`
**Purpose**: Simple UPC search functionality.
**Key Features**:
- Basic UPC search
- Extracts UPC-related data
- Provides simple search results
- Lightweight UPC analysis

**Usage**: `python simple_upc_search.py <log_file> <upc>`

### `search_log_content.py`
**Purpose**: Searches log content for specific patterns.
**Key Features**:
- Searches log content
- Extracts matching patterns
- Provides search results
- Supports pattern matching

**Usage**: `python search_log_content.py <log_file> <pattern>`

---

## Debug & Testing Tools

### `debug_stores.py`
**Purpose**: Debug store-related functionality and endpoints.
**Key Features**:
- Debugs store operations
- Tests store endpoints
- Provides debugging information
- Identifies store issues

**Usage**: `python debug_stores.py [options]`

### `debug_coupon_api.py`
**Purpose**: Debugs coupon API functionality.
**Key Features**:
- Debugs coupon operations
- Tests coupon endpoints
- Provides debugging information
- Identifies coupon issues

**Usage**: `python debug_coupon_api.py [options]`

### `meijer_login.py`
**Purpose**: Tests Meijer login functionality.
**Key Features**:
- Tests login workflows
- Validates authentication
- Provides login debugging
- Identifies login issues

**Usage**: `python meijer_login.py [options]`

---

## Data Extraction Tools

### `extract_workflow_endpoints.py`
**Purpose**: Extracts workflow-specific endpoints from logs.
**Key Features**:
- Extracts workflow endpoints
- Identifies workflow patterns
- Analyzes workflow sequences
- Provides workflow insights

**Usage**: `python extract_workflow_endpoints.py <log_file>`

### `extract_upc_flows.py`
**Purpose**: Extracts UPC-related flows from logs.
**Key Features**:
- Extracts UPC flows
- Analyzes UPC patterns
- Identifies UPC workflows
- Provides UPC insights

**Usage**: `python extract_upc_flows.py <log_file>`

### `extract_reservationslots_details.py`
**Purpose**: Extracts reservation slot details from logs.
**Key Features**:
- Extracts reservation data
- Analyzes slot patterns
- Identifies reservation logic
- Provides slot insights

**Usage**: `python extract_reservationslots_details.py <log_file>`

### `extract_reservationslots_headers.py`
**Purpose**: Extracts reservation slot headers from logs.
**Key Features**:
- Extracts header patterns
- Analyzes header structures
- Identifies header requirements
- Provides header insights

**Usage**: `python extract_reservationslots_headers.py <log_file>`

### `extract_working_headers.py`
**Purpose**: Extracts working header patterns from logs.
**Key Features**:
- Extracts successful headers
- Analyzes header patterns
- Identifies working combinations
- Provides header guidance

**Usage**: `python extract_working_headers.py <log_file>`

---

## Analysis & Reporting Tools

### `targeted_endpoint_analyzer.py`
**Purpose**: Performs targeted analysis of specific endpoints.
**Key Features**:
- Targets specific endpoints
- Provides detailed analysis
- Generates focused reports
- Identifies specific issues

**Usage**: `python targeted_endpoint_analyzer.py <log_file> <endpoint>`

### `targeted_cart_search.py`
**Purpose**: Performs targeted search for cart-related operations.
**Key Features**:
- Targets cart operations
- Provides focused search
- Generates cart reports
- Identifies cart patterns

**Usage**: `python targeted_cart_search.py <log_file> [options]`

### `targeted_fulfillment_search.py`
**Purpose**: Performs targeted search for fulfillment operations.
**Key Features**:
- Targets fulfillment operations
- Provides focused search
- Generates fulfillment reports
- Identifies fulfillment patterns

**Usage**: `python targeted_fulfillment_search.py <log_file> [options]`

### `flow_file_analyzer.py`
**Purpose**: Analyzes flow files for patterns and insights.
**Key Features**:
- Analyzes flow files
- Identifies flow patterns
- Extracts flow insights
- Provides flow analysis

**Usage**: `python flow_file_analyzer.py <flow_file>`

---

## Specialized Finders

### `find_meijer_tokens.py`
**Purpose**: Finds Meijer authentication tokens in logs.
**Key Features**:
- Searches for tokens
- Extracts token patterns
- Analyzes token structures
- Provides token insights

**Usage**: `python find_meijer_tokens.py <log_file>`

### `find_successful_fulfillment.py`
**Purpose**: Finds successful fulfillment operations in logs.
**Key Features**:
- Identifies successful fulfillment
- Extracts success patterns
- Analyzes fulfillment logic
- Provides success insights

**Usage**: `python find_successful_fulfillment.py <log_file>`

### `find_successful_reservationslots.py`
**Purpose**: Finds successful reservation slot operations.
**Key Features**:
- Identifies successful reservations
- Extracts success patterns
- Analyzes reservation logic
- Provides success insights

**Usage**: `python find_successful_reservationslots.py <log_file>`

### `find_actual_fulfillment.py`
**Purpose**: Finds actual fulfillment operations in logs.
**Key Features**:
- Identifies actual fulfillment
- Extracts fulfillment patterns
- Analyzes fulfillment logic
- Provides fulfillment insights

**Usage**: `python find_actual_fulfillment.py <log_file>`

---

## Constructor & Search Analysis

### `constructor_search_analyzer.py`
**Purpose**: Analyzes constructor search patterns and logic.
**Key Features**:
- Analyzes constructor searches
- Extracts search patterns
- Identifies search logic
- Provides search insights

**Usage**: `python constructor_search_analyzer.py <log_file>`

---

## Photo & Media Analysis

### `meijer_photo_analyzer.py`
**Purpose**: Analyzes Meijer photo and media endpoints.
**Key Features**:
- Analyzes photo endpoints
- Extracts media patterns
- Identifies media logic
- Provides media insights

**Usage**: `python meijer_photo_analyzer.py <log_file>`

---

## Feedback Analysis

### `feedback_endpoint_analyzer.py`
**Purpose**: Analyzes feedback-related endpoints and operations.
**Key Features**:
- Analyzes feedback endpoints
- Extracts feedback patterns
- Identifies feedback logic
- Provides feedback insights

**Usage**: `python feedback_endpoint_analyzer.py <log_file>`

---

## Checkout & Payment Analysis

### `checkout_operations_finder.py`
**Purpose**: Finds and analyzes checkout operations in logs.
**Key Features**:
- Identifies checkout operations
- Extracts checkout patterns
- Analyzes checkout logic
- Provides checkout insights

**Usage**: `python checkout_operations_finder.py <log_file>`

### `credit_card_operations_finder.py`
**Purpose**: Finds and analyzes credit card operations in logs.
**Key Features**:
- Identifies credit card operations
- Extracts payment patterns
- Analyzes payment logic
- Provides payment insights

**Usage**: `python credit_card_operations_finder.py <log_file>`

---

## HTTP Status Analysis

### `check_http_statuses.py`
**Purpose**: Checks HTTP status codes across API calls.
**Key Features**:
- Analyzes HTTP status codes
- Identifies error patterns
- Extracts status information
- Provides status insights

**Usage**: `python check_http_statuses.py <log_file>`

---

## Final Cleanup

### `final_cleanup.py`
**Purpose**: Performs final cleanup operations on analysis data.
**Key Features**:
- Cleans up analysis data
- Removes temporary files
- Organizes results
- Provides cleanup reports

**Usage**: `python final_cleanup.py [options]`

---

## Usage Guidelines

### Prerequisites
- Python 3.7+
- Virtual environment activated (`source venv/bin/activate`)
- Required dependencies installed (`pip install -r requirements.txt`)
- mitmproxy logs available for analysis

### Common Patterns
Most tools follow these common patterns:
1. **Log File Input**: Most tools accept a log file path as input
2. **JSON Output**: Many tools generate JSON reports for further analysis
3. **Pattern Matching**: Tools use regex patterns to identify relevant data
4. **Flow Analysis**: Tools analyze HTTP flows from mitmproxy logs
5. **Endpoint Extraction**: Tools extract and categorize API endpoints

### Output Formats
- **JSON Reports**: Structured data for further processing
- **Console Output**: Human-readable analysis results
- **Log Files**: Detailed logging of analysis process
- **Summary Reports**: High-level insights and findings

### Error Handling
- Tools include comprehensive error handling
- Log files are created for debugging
- Graceful fallbacks when mitmproxy libraries unavailable
- Clear error messages for troubleshooting

---

## Integration Notes

These tools are designed to work together to provide comprehensive analysis:
1. **Start with comprehensive tools** for broad analysis
2. **Use specialized tools** for specific functionality
3. **Combine results** for complete understanding
4. **Generate reports** for implementation guidance

The tools provide the foundation for understanding Meijer's API structure and implementing client functionality without reinventing existing analysis capabilities.
