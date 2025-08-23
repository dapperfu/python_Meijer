#!/usr/bin/env python3
"""
Multi-UPC Demo Notebook Generator

This script generates a Jupyter notebook that demonstrates the new multi-UPC
functionality for efficient bulk UPC lookup.
"""

import nbformat as nbf
from nbformat.v4 import new_notebook, new_markdown_cell, new_code_cell


def generate_multi_upc_notebook():
    """Generate the multi-UPC demo notebook."""
    
    # Create a new notebook
    nb = new_notebook()
    
    # Add title and description
    nb.cells.append(new_markdown_cell("""# Multi-UPC Functionality Demo

This notebook demonstrates the new **multi-UPC endpoint integration** that allows efficient bulk UPC lookup for up to 20 products in a single API call.

## Overview

The multi-UPC endpoint (`POST /digital/multi-upc/v1/upcs`) provides:
- **Efficiency**: Batch lookup of up to 20 UPCs in one API call
- **Rich Data**: Comprehensive product information including pricing, availability, descriptions
- **Store-Specific**: Optional store ID for location-specific pricing and availability
- **Performance**: Significant speedup compared to individual UPC searches

## Key Benefits

1. **20x Reduction in API Calls** for bulk UPC lookups
2. **Faster Product Information Retrieval** for shopping lists and inventory
3. **Consistent Data Quality** from official Meijer API
4. **Better Scalability** for large UPC lists

## What You'll Learn

- How to use the new `search_multiple_products_by_upc()` method
- Performance comparison between bulk and individual searches
- Store-specific UPC lookups
- Error handling and fallback mechanisms
- Real-world use cases and examples
"""))

    # Add setup section
    nb.cells.append(new_markdown_cell("""## Setup

First, let's import the necessary modules and initialize the Meijer client."""))
    
    nb.cells.append(new_code_cell("""# Import required modules
import time
from typing import List, Optional

from meijer import Meijer
from meijer.models import MeijerItem

print("✅ Modules imported successfully")"""))

    nb.cells.append(new_markdown_cell("""## Initialize Meijer Client

Initialize the client and check authentication status."""))
    
    nb.cells.append(new_code_cell("""# Initialize the Meijer client
client = Meijer()

# Check authentication status
if hasattr(client, 'auth') and client.auth.is_authenticated():
    print("✅ Client authenticated successfully")
else:
    print("⚠️  Client not authenticated. Please authenticate first.")
    print("   You can use client.auth.login() or load tokens from a file.")
    print("   For demo purposes, we'll continue but some operations may fail.")"""))

    # Add test UPCs section
    nb.cells.append(new_markdown_cell("""## Test UPCs

We'll use the UPCs from the analyzed flow endpoint for demonstration."""))
    
    nb.cells.append(new_code_cell("""# UPCs from the analyzed flow endpoint
test_upcs = [
    "1189600014", "1780016746", "1114110614", "1838527823", "1780014927",
    "1200000170", "1780001260", "1780010033", "1901461206", "1200001711",
    "1410005470", "1996900122", "1780014939", "1114110112", "1657195021",
    "1901480334", "1780010065", "1780017966", "1780043119", "1600016710"
]

print(f"📋 Testing with {len(test_upcs)} UPCs")
print(f"Sample UPCs: {', '.join(test_upcs[:5])}... (and {len(test_upcs)-5} more)")"""))

    # Add Demo 1: Multi-UPC Search
    nb.cells.append(new_markdown_cell("""## Demo 1: Multi-UPC Search (Bulk Lookup)

This demonstrates the new multi-UPC endpoint that can process up to 20 UPCs in a single API call."""))
    
    nb.cells.append(new_code_cell("""# Demo 1: Multi-UPC Search (Bulk Lookup)
print("🎯 Demo 1: Multi-UPC Search (Bulk Lookup)")
print("-" * 40)

start_time = time.time()

try:
    # Use the new multi-UPC method
    products = client.search_multiple_products_by_upc(test_upcs)
    multi_upc_time = time.time() - start_time
    
    print(f"✅ Multi-UPC search completed in {multi_upc_time:.2f} seconds")
    print(f"📦 Found {len(products)} products out of {len(test_upcs)} UPCs")
    
    # Display first few results
    print("\\n📋 Sample Results:")
    for i, product in enumerate(products[:5]):
        print(f"  {i+1}. {product.title}")
        print(f"     UPC: {product.upc}")
        print(f"     Price: ${product.price or 'N/A'}")
        print(f"     Sale: ${product.sale_price or 'N/A'}" if product.sale_price else "     Sale: No")
        print(f"     Available: {'Yes' if product.is_available else 'No'}")
        print()
    
    if len(products) > 5:
        print(f"  ... and {len(products) - 5} more products")
        print()
        
except Exception as e:
    print(f"❌ Multi-UPC search failed: {e}")
    print("   This might be due to authentication or endpoint availability")
    multi_upc_time = 0
    products = []"""))

    # Add Demo 2: Individual UPC Searches
    nb.cells.append(new_markdown_cell("""## Demo 2: Individual UPC Searches (Comparison)

This demonstrates the traditional approach of searching for each UPC individually, for performance comparison."""))
    
    nb.cells.append(new_code_cell("""# Demo 2: Individual UPC Searches (Comparison)
print("🔍 Demo 2: Individual UPC Searches (Comparison)")
print("-" * 40)

# Test with a smaller subset for performance comparison
subset_upcs = test_upcs[:5]
print(f"📋 Testing with subset of {len(subset_upcs)} UPCs for comparison")

start_time = time.time()
individual_products = []

for upc in subset_upcs:
    try:
        # Use the individual UPC search method
        product = client.search_product_by_upc(upc)
        if product:
            individual_products.append(product)
    except Exception as e:
        print(f"   ⚠️  Failed to search UPC {upc}: {e}")

individual_time = time.time() - start_time

print(f"✅ Individual searches completed in {individual_time:.2f} seconds")
print(f"📦 Found {len(individual_products)} products out of {len(subset_upcs)} UPCs")"""))

    # Add Performance Comparison
    nb.cells.append(new_markdown_cell("""## Performance Comparison

Let's compare the performance between multi-UPC and individual searches."""))
    
    nb.cells.append(new_code_cell("""# Performance comparison
if multi_upc_time > 0 and individual_time > 0:
    speedup = individual_time / multi_upc_time
    print(f"\\n⚡ Performance Comparison:")
    print(f"   Multi-UPC (20 UPCs): {multi_upc_time:.2f}s")
    print(f"   Individual (5 UPCs): {individual_time:.2f}s")
    print(f"   Speedup: {speedup:.1f}x faster with multi-UPC")
    print(f"   Estimated individual time for 20 UPCs: {individual_time * 4:.2f}s")
    
    # Calculate efficiency improvement
    efficiency_gain = ((individual_time * 4) - multi_upc_time) / (individual_time * 4) * 100
    print(f"   Efficiency improvement: {efficiency_gain:.1f}%")
else:
    print("\\n⚠️  Cannot perform performance comparison due to failed searches")"""))

    # Add Demo 3: Store-Specific Search
    nb.cells.append(new_markdown_cell("""## Demo 3: Store-Specific Multi-UPC Search

This demonstrates how to use the multi-UPC endpoint with a specific store ID for location-specific pricing and availability."""))
    
    nb.cells.append(new_code_cell("""# Demo 3: Store-Specific Multi-UPC Search
print("\\n🏪 Demo 3: Store-Specific Multi-UPC Search")
print("-" * 40)

# Use store ID 19 from the analyzed flow
store_id = "19"
print(f"🏪 Searching with store ID: {store_id}")

try:
    store_products = client.search_multiple_products_by_upc(
        test_upcs[:10],  # Use first 10 UPCs
        store_id=store_id
    )
    
    print(f"✅ Store-specific search completed")
    print(f"📦 Found {len(store_products)} products for store {store_id}")
    
    # Check for store-specific data
    if store_products:
        first_product = store_products[0]
        print(f"\\n📋 Sample store-specific result:")
        print(f"   Product: {first_product.title}")
        print(f"   UPC: {first_product.upc}")
        print(f"   Price: ${first_product.price or 'N/A'}")
        print(f"   Store ID: {getattr(first_product, 'store_id', 'N/A')}")
        
except Exception as e:
    print(f"❌ Store-specific search failed: {e}")"""))

    # Add Demo 4: Error Handling
    nb.cells.append(new_markdown_cell("""## Demo 4: Error Handling and Validation

This demonstrates the robust error handling and validation built into the multi-UPC functionality."""))
    
    nb.cells.append(new_code_cell("""# Demo 4: Error Handling and Validation
print("\\n⚠️  Demo 4: Error Handling and Validation")
print("-" * 40)

# Test with too many UPCs
too_many_upcs = [str(i) for i in range(25)]  # 25 UPCs (over limit)
print(f"📋 Testing with {len(too_many_upcs)} UPCs (over 20 limit)")

try:
    result = client.search_multiple_products_by_upc(too_many_upcs)
    print("❌ Expected error but got result (this shouldn't happen)")
except ValueError as e:
    print(f"✅ Correctly caught error: {e}")
except Exception as e:
    print(f"⚠️  Unexpected error: {e}")

# Test with empty list
print(f"\\n📋 Testing with empty UPC list")
try:
    result = client.search_multiple_products_by_upc([])
    print(f"✅ Empty list handled correctly: {len(result)} results")
except Exception as e:
    print(f"❌ Error with empty list: {e}")"""))

    # Add Product Details Section
    nb.cells.append(new_markdown_cell("""## Detailed Product Information

Let's examine the rich product data returned by the multi-UPC endpoint."""))
    
    nb.cells.append(new_code_cell("""# Show detailed information about found products
if products:
    print("\\n🔍 Detailed Product Information")
    print("=" * 50)
    
    for i, product in enumerate(products[:3]):  # Show first 3 in detail
        print(f"\\n📦 Product {i+1}: {product.title}")
        print(f"   UPC: {product.upc}")
        print(f"   ID: {product.id}")
        print(f"   Price: ${product.price or 'N/A'}")
        print(f"   Sale Price: ${product.sale_price or 'N/A'}")
        print(f"   Unit: {product.unit_price or 'N/A'}")
        print(f"   Available: {'Yes' if product.is_available else 'No'}")
        print(f"   Weighted: {'Yes' if product.is_weighted else 'No'}")
        
        if product.description:
            desc = product.description[:100] + "..." if len(product.description) > 100 else product.description
            print(f"   Description: {desc}")
        
        if hasattr(product, 'raw_data') and product.raw_data:
            raw = product.raw_data
            print(f"   Stock Status: {raw.get('stockLevelStatus', 'N/A')}")
            print(f"   Pickup Available: {raw.get('pickupAvailableFlag', 'N/A')}")
            print(f"   Has mPerks: {raw.get('hasMPerks', 'N/A')}")
            print(f"   Sale: {raw.get('sale', 'N/A')}")
            print(f"   EBT Eligible: {raw.get('ebtFoodstampable', 'N/A')}")
            print(f"   Age Restricted: {raw.get('isAgeRestricted', 'N/A')}")
        
        if product.image_url:
            print(f"   Image: {product.image_url}")
else:
    print("\\n⚠️  No products found to display details")"""))

    # Add Use Cases Section
    nb.cells.append(new_markdown_cell("""## Real-World Use Cases

The multi-UPC functionality is ideal for several practical scenarios:"""))
    
    nb.cells.append(new_code_cell("""# Use Cases Examples
print("🎯 Real-World Use Cases")
print("=" * 50)

use_cases = [
    "🛒 Shopping List Processing: Bulk lookup of all items in a shopping list",
    "📊 Inventory Management: Quick product information for multiple SKUs",
    "💰 Price Comparison: Compare prices across multiple products efficiently",
    "🏪 Store Planning: Check availability of multiple items at specific stores",
    "📱 Mobile App Performance: Faster product loading for better user experience",
    "🔍 Batch Product Research: Research multiple products for analysis"
]

for use_case in use_cases:
    print(f"  {use_case}")

print("\\n💡 The multi-UPC endpoint reduces API calls from N to 1, significantly")
print("   improving performance and reducing server load.")"""))

    # Add Advanced Features Section
    nb.cells.append(new_markdown_cell("""## Advanced Features

Explore additional capabilities of the multi-UPC functionality."""))
    
    nb.cells.append(new_code_cell("""# Advanced Features Demo
print("\\n🚀 Advanced Features")
print("=" * 50)

# Feature 1: Batch processing with chunking for large UPC lists
def process_large_upc_list(upcs: List[str], chunk_size: int = 20):
    """Process a large list of UPCs in chunks."""
    results = []
    
    for i in range(0, len(upcs), chunk_size):
        chunk = upcs[i:i + chunk_size]
        print(f"Processing chunk {i//chunk_size + 1}: {len(chunk)} UPCs")
        
        try:
            chunk_results = client.search_multiple_products_by_upc(chunk)
            results.extend(chunk_results)
            print(f"  ✅ Found {len(chunk_results)} products")
        except Exception as e:
            print(f"  ❌ Chunk failed: {e}")
    
    return results

# Example: Process a larger list (if we had more UPCs)
print("📋 Example: Batch processing with chunking")
print("   This feature allows processing of UPC lists larger than 20 items")
print("   by automatically splitting them into chunks and processing each chunk.")

# Feature 2: Fallback mechanism demonstration
print("\\n🔄 Fallback Mechanism")
print("   The multi-UPC endpoint automatically falls back to individual")
print("   searches if the bulk endpoint fails, ensuring reliability.")

# Feature 3: Store-specific pricing
print("\\n🏪 Store-Specific Pricing")
print("   Use the store_id parameter to get location-specific pricing")
print("   and availability information.")"""))

    # Add Summary Section
    nb.cells.append(new_markdown_cell("""## Summary

The multi-UPC functionality represents a significant upgrade to the Meijer module's UPC capabilities:

### Key Benefits
- **🚀 Performance**: 20x reduction in API calls for bulk operations
- **📊 Efficiency**: Single request for up to 20 products
- **🏪 Store Integration**: Location-specific pricing and availability
- **🔄 Reliability**: Automatic fallback to individual searches
- **📱 Rich Data**: Comprehensive product information in one response

### Methods Available
- `client.search_multiple_products_by_upc(upcs, store_id)` - Bulk UPC lookup
- `client.search_product_by_upc(upc, store_id)` - Single UPC lookup
- `client.search.search_multiple_upcs(upcs, store_id)` - Direct search access

### Best Practices
1. **Batch Size**: Keep UPC lists under 20 items for optimal performance
2. **Store ID**: Use store-specific lookups when location matters
3. **Error Handling**: The system automatically handles failures gracefully
4. **Performance**: Use bulk operations for shopping lists and inventory

This enhancement makes the Meijer module much more efficient for bulk operations while maintaining backward compatibility with existing single-UPC workflows."""))
    
    nb.cells.append(new_code_cell("""# Final summary
print("🎉 Multi-UPC Demo Completed!")
print("=" * 50)
print("✅ All demonstrations completed successfully")
print("📚 Check the documentation for more details")
print("🔧 The multi-UPC functionality is now available in your Meijer client")"""))

    return nb


def main():
    """Generate and save the multi-UPC demo notebook."""
    print("Generating multi-UPC demo notebook...")
    
    nb = generate_multi_upc_notebook()
    
    # Save the notebook
    output_file = "multi_upc_demo.ipynb"
    with open(output_file, 'w', encoding='utf-8') as f:
        nbf.write(nb, f)
    
    print(f"✅ Notebook generated successfully: {output_file}")
    print(f"📊 Total cells: {len(nb.cells)}")
    print(f"📝 Markdown cells: {len([c for c in nb.cells if c.cell_type == 'markdown'])}")
    print(f"💻 Code cells: {len([c for c in nb.cells if c.cell_type == 'code'])}")


if __name__ == "__main__":
    main()
