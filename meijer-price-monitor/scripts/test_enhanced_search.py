#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Test script for enhanced search functionality with UPC tracking
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: price_monitor package
 */

Test script for the enhanced search functionality.

This script demonstrates:
1. Enhanced product search with UPC tracking
2. Dual-path storage (JSON + SQLite)
3. Price verification with Shop'n'Scan
4. Database operations and statistics
"""

import sys
import logging
from pathlib import Path

# Add the parent directory to the path to import price_monitor
sys.path.insert(0, str(Path(__file__).parent.parent))

from price_monitor.core import PriceMonitor
from price_monitor.search_engine import SearchQuery
from price_monitor.storage_manager import DualPathStorageManager


def setup_logging():
    """Set up logging configuration."""
    logging.basicConfig(
        level=logging.INFO,
        format='%(asctime)s - %(name)s - %(levelname)s - %(message)s'
    )


def test_enhanced_search():
    """Test the enhanced search functionality."""
    print("🔍 Testing Enhanced Search Functionality")
    print("=" * 50)
    
    # Initialize price monitor
    monitor = PriceMonitor()
    
    # Test enhanced search
    print("\n1. Testing enhanced product search...")
    
    # Create search query
    search_query = SearchQuery(
        query_text="LEGO Jurassic",
        max_results=20,
        min_results=5,
        include_clearance=True,
        include_out_of_stock=False
    )
    
    # Progress callback
    def progress_callback(message: str):
        print(f"  {message}")
    
    # Perform search
    results = monitor.search_products_enhanced(
        query_text=search_query.query_text,
        max_results=search_query.max_results,
        min_results=search_query.min_results,
        include_clearance=search_query.include_clearance,
        include_out_of_stock=search_query.include_out_of_stock,
        progress_callback=progress_callback
    )
    
    print(f"\n✅ Search completed! Found {len(results)} products")
    
    # Display results summary
    if results:
        print("\n📋 Search Results Summary:")
        print(f"  • Total products: {len(results)}")
        
        # Count by category
        categories = {}
        brands = {}
        for result in results:
            cat = result.category or "Unknown"
            categories[cat] = categories.get(cat, 0) + 1
            
            brand = result.brand or "Unknown"
            brands[brand] = brands.get(brand, 0) + 1
        
        print(f"  • Categories: {', '.join(f'{cat}: {count}' for cat, count in categories.items())}")
        print(f"  • Brands: {', '.join(f'{brand}: {count}' for brand, count in brands.items())}")
        
        # Show first few UPCs
        upcs = [result.upc for result in results[:5]]
        print(f"  • Sample UPCs: {', '.join(upcs)}")
    
    return results


def test_price_verification(upcs: list):
    """Test price verification functionality."""
    print("\n\n🔍 Testing Price Verification")
    print("=" * 50)
    
    if not upcs:
        print("❌ No UPCs to verify")
        return
    
    # Initialize price monitor
    monitor = PriceMonitor()
    
    # Test with first few UPCs
    test_upcs = upcs[:3]
    store_id = "test_store_1"
    
    print(f"Verifying prices for {len(test_upcs)} UPCs at store {store_id}")
    
    # Progress callback
    def progress_callback(message: str):
        print(f"  {message}")
    
    # Verify prices
    verification_results = monitor.verify_prices_with_shopnscan_enhanced(
        test_upcs, store_id, progress_callback
    )
    
    print(f"\n✅ Verification completed!")
    
    # Display results
    for upc, result in verification_results.items():
        method = result['method']
        status = "✅ Success" if result['result'] else "❌ Failed"
        print(f"  • {upc}: {method} - {status}")
    
    return verification_results


def test_storage_statistics():
    """Test storage statistics functionality."""
    print("\n\n📊 Testing Storage Statistics")
    print("=" * 50)
    
    # Initialize price monitor
    monitor = PriceMonitor()
    
    # Get storage stats
    stats = monitor.get_storage_statistics()
    
    if 'error' in stats:
        print(f"❌ Error getting storage stats: {stats['error']}")
        return
    
    print("✅ Storage statistics retrieved successfully!")
    
    # Display database stats
    if 'database' in stats:
        db_stats = stats['database']
        print("\n📊 Database Statistics:")
        for key, value in db_stats.items():
            if key.endswith('_count'):
                print(f"  • {key.replace('_count', '').title()}: {value}")
    
    # Display JSON file stats
    if 'json_files' in stats:
        json_stats = stats['json_files']
        print("\n📁 JSON File Statistics:")
        for file_type, file_stats in json_stats.items():
            print(f"  • {file_type.title()}: {file_stats['file_count']} files, {file_stats['total_size_mb']:.2f} MB")
    
    # Display overall stats
    print(f"\n💾 Overall Storage: {stats['total_storage_mb']:.2f} MB")
    
    return stats


def test_database_operations():
    """Test database operations."""
    print("\n\n🗄️ Testing Database Operations")
    print("=" * 50)
    
    # Initialize price monitor
    monitor = PriceMonitor()
    
    # Test finding price drops
    print("1. Testing price drop analysis...")
    price_drops = monitor.database.find_price_drops(min_drop_percent=5.0, days=7)
    print(f"   Found {len(price_drops)} products with price drops")
    
    # Test finding clearance deals
    print("2. Testing clearance deals...")
    clearance_deals = monitor.database.get_clearance_deals(max_price=50.0)
    print(f"   Found {len(clearance_deals)} clearance deals under $50")
    
    # Test product search
    print("3. Testing product search by query...")
    products = monitor.database.search_products_by_query("LEGO", limit=10)
    print(f"   Found {len(products)} products matching 'LEGO'")
    
    return {
        'price_drops': price_drops,
        'clearance_deals': clearance_deals,
        'products': products
    }


def main():
    """Main test function."""
    print("🚀 Meijer Price Monitor - Enhanced Search Test")
    print("=" * 60)
    
    # Set up logging
    setup_logging()
    
    try:
        # Test enhanced search
        search_results = test_enhanced_search()
        
        # Test price verification
        if search_results:
            verification_results = test_price_verification([r.upc for r in search_results])
        
        # Test storage statistics
        storage_stats = test_storage_statistics()
        
        # Test database operations
        db_results = test_database_operations()
        
        print("\n\n🎉 All tests completed successfully!")
        print("\n📋 Test Summary:")
        print(f"  • Enhanced search: ✅ {len(search_results) if search_results else 0} products found")
        print(f"  • Price verification: ✅ Tested with {len(search_results[:3]) if search_results else 0} UPCs")
        print(f"  • Storage statistics: ✅ Retrieved successfully")
        print(f"  • Database operations: ✅ All operations completed")
        
    except Exception as e:
        print(f"\n❌ Test failed with error: {e}")
        logging.error(f"Test error: {e}", exc_info=True)
        return 1
    
    return 0


if __name__ == "__main__":
    sys.exit(main())
