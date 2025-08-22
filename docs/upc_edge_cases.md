# UPC Edge Case Testing Framework

This framework provides comprehensive testing for specific UPCs that demonstrate different pricing scenarios in Meijer's Shop & Scan functionality.

## Overview

The UPC edge case testing framework is designed to test specific products that exhibit different pricing behaviors:

- **Clearance items** without special UPC handling
- **Buy One Get X% Off** deals (BOGO)
- **Percentage-based clearance** discounts
- **Quantity-based pricing** with threshold discounts

## Test UPCs

### 1. 713733252843 - Clearance Item
- **Description**: Clearance item without special clearance UPC specific to store 71
- **Expected Behavior**: Should show clearance pricing but no special UPC handling
- **Test Scenarios**: Basic lookup, cart addition, pricing analysis

### 2. 719812800516 - Buy One Get 40% Off
- **Description**: Buy one get 40% off - second item costs 60% of first
- **Expected Behavior**: BOGO deal where second item gets 40% discount
- **Test Scenarios**: Single item, two items, pricing calculation, deal validation

### 3. 070896523112 - 50% Off Clearance
- **Description**: 50% off clearance item
- **Expected Behavior**: Should show up in JSON reply when adding to cart with 50% discount
- **Test Scenarios**: Clearance pricing, cart JSON analysis, discount validation

### 4. 629307040245 - Buy 5 Get $5 Off
- **Description**: Buy 5 and get $5 off total (normally $3.99, becomes $2.99 each when 5+ in cart)
- **Expected Behavior**: Quantity-based pricing with threshold discount
- **Test Scenarios**: Single item, four items, five items, six items, pricing threshold

## Usage

### Prerequisites

1. **Authentication**: You must be authenticated with Meijer API
   ```bash
   python -m meijer.cli.main auth
   # or
   python demos/auth_demo.py
   ```

2. **Check Status**: Verify authentication before running tests
   ```bash
   python scripts/test_upc_edge_cases.py --status
   ```

### Running Tests

#### Interactive Mode
```bash
python scripts/test_upc_edge_cases.py
```
This will present a menu where you can choose which UPC to test.

#### Test Specific UPC
```bash
python scripts/test_upc_edge_cases.py 713733252843
```

#### Test All UPCs
```bash
python scripts/test_upc_edge_cases.py --all
```

#### Demo Script
```bash
python demos/upc_edge_case_demo.py
```

### Running Tests with pytest

```bash
# Run all UPC edge case tests
pytest tests/test_upc_edge_cases.py -v

# Run specific test
pytest tests/test_upc_edge_cases.py::TestUPCEdgeCases::test_clearance_item_no_special_upc -v

# Run with live endpoints (if authenticated)
pytest tests/test_upc_edge_cases.py -v --tb=short
```

## Test Behavior

### Live vs Mock Testing

The framework automatically detects whether to use live endpoints or mocks:

- **Live Endpoints**: Used when authenticated and not in CI/CD environment
- **Mock Testing**: Used when unauthenticated or in CI/CD environment

### Test Output

Each test provides detailed output including:

- Product information (name, brand, category, pricing)
- Cart operations (add, remove, clear)
- Pricing analysis and edge case detection
- Error handling and logging

## Edge Case Detection

### BOGO Deals
The framework detects BOGO patterns by:
- Adding multiple items to cart
- Analyzing price variations
- Calculating discount percentages

### Quantity Discounts
For quantity-based pricing:
- Tests various quantities (1-10)
- Identifies pricing thresholds
- Calculates total savings

### Clearance Items
Detects clearance pricing by:
- Comparing regular vs sale prices
- Analyzing tags and metadata
- Calculating discount percentages

## Example Output

```
============================================================
 Testing UPC: 719812800516
============================================================

UPC: 719812800516
Description: Buy one get 40% off - second item costs 60% of first
Expected Behavior: BOGO deal where second item gets 40% discount
Test Scenarios: single_item, two_items, pricing_calculation, deal_validation

--- Testing Basic Lookup for UPC 719812800516 ---
✓ Product found: BOGO Test Product
  Brand: Test Brand
  Category: Promotions
  Regular Price: $10.00
  Sale Price: $10.00
  Tags: bogo, 40-percent-off

--- Testing Cart Operations for UPC 719812800516 ---
Clearing cart...
✓ Cart cleared successfully

Testing quantity: 1
Adding 1 item(s) to cart...
✓ Successfully added 1 item(s)
Cart now contains 1 item(s)
  Pricing Analysis for 1 item(s):
    Total Price: $10.00
    Average Price per Item: $10.00

Testing quantity: 2
Adding 2 item(s) to cart...
✓ Successfully added 2 item(s)
Cart now contains 2 item(s)
  Pricing Analysis for 2 item(s):
    Total Price: $16.00
    Average Price per Item: $8.00
    ⚠️  Price variations detected: {10.0, 6.0}
    This might indicate BOGO deals or quantity discounts
    🎯 Potential BOGO deal: 40.0% discount on second item
```

## Troubleshooting

### Authentication Issues
```bash
# Check status
python scripts/test_upc_edge_cases.py --status

# Re-authenticate if needed
python -m meijer.cli.main auth
```

### Product Not Found
If a UPC is not found:
- Verify the UPC is correct
- Check if the product is available in your region
- Try different store IDs if applicable

### Cart Operation Failures
- Ensure you have a valid session
- Check if the product is available for Shop & Scan
- Verify store selection if required

## Contributing

To add new UPC edge cases:

1. Add the UPC to `self.test_upcs` in the demo class
2. Create appropriate test methods
3. Update this documentation
4. Test with live endpoints when possible

## Notes

- **Live Testing**: Always preferred when authenticated for real-world validation
- **Mock Testing**: Ensures tests can run in CI/CD environments
- **Error Handling**: Tests gracefully handle API failures and missing products
- **Logging**: Comprehensive logging for debugging and analysis
