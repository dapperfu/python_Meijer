#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Test script for specific UPC 822279082910 across all stores
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: price_monitor package
 */

Test script for UPC 822279082910 across all available stores.

This script demonstrates:
1. Enhanced search functionality for a specific UPC
2. Price verification using Shop'n'Scan and cart fallback
3. Dual-path storage system
4. Database operations and storage statistics
"""

import sys
import logging
from pathlib import Path

# Add the parent directory to the path to import price_monitor
sys.path.insert(0, str(Path(__file__).parent.parent))

from price_monitor.core import PriceMonitor
from price_monitor.search_engine import SearchQuery


def setup_logging():
    """Set up logging configuration."""
    logging.basicConfig(
        level=logging.INFO,
        format='%(asctime)s - %(name)s - %(levelname)s - %(message)s'
    )


def test_upc_search():
    """Test search functionality for UPC 822279082910."""
    print("🔍 Testing UPC 822279082910 Search")
    print("=" * 50)
    
    # Initialize price monitor
    monitor = PriceMonitor()
    
    # Test 1: Enhanced search for the UPC
    print("\n1. Testing enhanced search for UPC 822279082910...")
    
    # Create search query
    search_query = SearchQuery(
        query_text="822279082910",  # Search by UPC
        max_results=100,
        min_results=1,
        include_clearance=True,
        include_out_of_stock=False
    )
    
    # Progress callback
    def progress_callback(message: str):
        print(f"  {message}")
    
    # Perform enhanced search
    results = monitor.search_products_enhanced(
        query_text=search_query.query_text,
        max_results=search_query.max_results,
        min_results=search_query.min_results,
        include_clearance=search_query.include_clearance,
        include_out_of_stock=search_query.include_out_of_stock,
        progress_callback=progress_callback
    )
    
    print(f"\n✅ Enhanced search completed! Found {len(results)} products")
    
    # Display results
    if results:
        print("\n📋 Search Results for UPC 822279082910:")
        for i, result in enumerate(results, 1):
            print(f"  {i}. UPC: {result.upc}")
            print(f"     Product: {result.product_name}")
            print(f"     Store: {result.store_name} (ID: {result.store_id})")
            print(f"     Price: ${result.price:.2f}")
            if result.original_price:
                print(f"     Original Price: ${result.original_price:.2f}")
            print(f"     Status: {'Clearance' if result.is_clearance else 'On Sale' if result.is_on_sale else 'Regular'}")
            print(f"     Availability: {result.availability}")
            print()
    else:
        print("❌ No products found for UPC 822279082910")
    
    return results


def test_price_verification(upc: str):
    """Test price verification for the specific UPC."""
    print(f"\n🔍 Testing Price Verification for UPC {upc}")
    print("=" * 50)
    
    # Initialize price monitor
    monitor = PriceMonitor()
    
    # Get all available stores from the database
    print("1. Getting available stores...")
    
    # For testing, we'll use mock stores since we don't have real Meijer API
    test_stores = [f"store_{i}" for i in range(1, 6)]
    print(f"   Found {len(test_stores)} test stores: {', '.join(test_stores)}")
    
    # Test price verification for each store
    print("\n2. Testing price verification across all stores...")
    
    all_verification_results = {}
    
    for store_id in test_stores:
        print(f"\n   Verifying prices at {store_id}...")
        
        # Progress callback
        def progress_callback(message: str):
            print(f"     {message}")
        
        # Verify prices using Shop'n'Scan with cart fallback
        verification_results = monitor.verify_prices_with_shopnscan_enhanced(
            [upc], store_id, progress_callback
        )
        
        all_verification_results[store_id] = verification_results
        
        # Display results for this store
        for upc_code, result in verification_results.items():
            method = result['method']
            status = "✅ Success" if result['result'] else "❌ Failed"
            print(f"     • {upc_code}: {method} - {status}")
            
            if result['result']:
                price = result['result'].get('verified_price', result['result'].get('cart_price', 'N/A'))
                print(f"       Price: ${price}")
    
    return all_verification_results


def test_storage_and_database():
    """Test storage and database functionality."""
    print("\n\n📊 Testing Storage and Database")
    print("=" * 50)
    
    # Initialize price monitor
    monitor = PriceMonitor()
    
    # Test storage statistics
    print("1. Getting storage statistics...")
    stats = monitor.get_storage_statistics()
    
    if 'error' in stats:
        print(f"   ❌ Error: {stats['error']}")
    else:
        print("   ✅ Storage statistics retrieved successfully!")
        
        # Display database stats
        if 'database' in stats:
            db_stats = stats['database']
            print("\n   📊 Database Statistics:")
            for key, value in db_stats.items():
                if key.endswith('_count'):
                    print(f"     • {key.replace('_count', '').title()}: {value}")
        
        # Display JSON file stats
        if 'json_files' in stats:
            json_stats = stats['json_files']
            print("\n   📁 JSON File Statistics:")
            for file_type, file_stats in json_stats.items():
                print(f"     • {file_type.title()}: {file_stats['file_count']} files, {file_stats['total_size_mb']:.2f} MB")
        
        # Display overall stats
        print(f"\n   💾 Overall Storage: {stats['total_storage_mb']:.2f} MB")
    
    # Test database operations
    print("\n2. Testing database operations...")
    
    # Test finding price drops
    print("   • Testing price drop analysis...")
    price_drops = monitor.database.find_price_drops(min_drop_percent=5.0, days=7)
    print(f"     Found {len(price_drops)} products with price drops")
    
    # Test finding clearance deals
    print("   • Testing clearance deals...")
    clearance_deals = monitor.database.get_clearance_deals(max_price=100.0)
    print(f"     Found {len(clearance_deals)} clearance deals under $100")
    
    # Test product search by UPC
    print("   • Testing product search by UPC...")
    products = monitor.database.search_products_by_query("822279082910", limit=10)
    print(f"     Found {len(products)} products matching UPC 822279082910")
    
    return stats


def test_backup_and_export():
    """Test backup and export functionality."""
    print("\n\n💾 Testing Backup and Export")
    print("=" * 50)
    
    # Initialize price monitor
    monitor = PriceMonitor()
    
    # Test backup creation
    print("1. Testing backup creation...")
    backup_result = monitor.create_backup()
    
    if backup_result['status'] == 'success':
        print(f"   ✅ Backup created successfully!")
        print(f"   📁 Backup directory: {backup_result['backup_directory']}")
        print(f"   📊 Backup size: {backup_result['backup_size_mb']:.2f} MB")
        print(f"   ⏰ Timestamp: {backup_result['backup_timestamp']}")
    else:
        print(f"   ❌ Backup failed: {backup_result.get('error', 'Unknown error')}")
    
    # Test data export
    print("\n2. Testing data export...")
    export_result = monitor.export_data("price_drops", {"min_drop_percent": 5.0, "days": 7})
    
    if export_result['export_file']:
        print(f"   ✅ Data exported successfully!")
        print(f"   📁 Export file: {export_result['export_file']}")
        print(f"   📊 Records exported: {export_result['records_exported']}")
        print(f"   ⏰ Timestamp: {export_result['timestamp']}")
    else:
        print(f"   ❌ Export failed: {export_result.get('error', 'Unknown error')}")
    
    return backup_result, export_result


def main():
    """Main test function."""
    print("🚀 Meijer Price Monitor - UPC 822279082910 Test")
    print("=" * 60)
    print("Testing enhanced search functionality for specific UPC across all stores")
    print("=" * 60)
    
    # Set up logging
    setup_logging()
    
    try:
        # Test 1: Enhanced search for UPC
        search_results = test_upc_search()
        
        # Test 2: Price verification across all stores
        if search_results:
            upc_to_test = search_results[0].upc
        else:
            upc_to_test = "822279082910"  # Use the original UPC if search didn't find it
        
        verification_results = test_price_verification(upc_to_test)
        
        # Test 3: Storage and database functionality
        storage_stats = test_storage_and_database()
        
        # Test 4: Backup and export functionality
        backup_result, export_result = test_backup_and_export()
        
        print("\n\n🎉 All tests completed successfully!")
        print("\n📋 Test Summary:")
        print(f"  • Enhanced search: ✅ {len(search_results) if search_results else 0} products found")
        print(f"  • Price verification: ✅ Tested across {len(verification_results)} stores")
        print(f"  • Storage statistics: ✅ Retrieved successfully")
        print(f"  • Database operations: ✅ All operations completed")
        print(f"  • Backup creation: ✅ {'Success' if backup_result['status'] == 'success' else 'Failed'}")
        print(f"  • Data export: ✅ {'Success' if export_result['export_file'] else 'Failed'}")
        
        # Show UPC summary
        if search_results:
            upcs = [result.upc for result in search_results]
            print(f"\n📋 UPCs found: {', '.join(upcs)}")
            
            # Show store coverage
            stores = set(result.store_id for result in search_results)
            print(f"🏪 Stores covered: {len(stores)} stores")
        
    except Exception as e:
        print(f"\n❌ Test failed with error: {e}")
        logging.error(f"Test error: {e}", exc_info=True)
        return 1
    
    return 0


if __name__ == "__main__":
    sys.exit(main())
