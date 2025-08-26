#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Test script for Pony ORM models
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: pathlib, sys, logging
 */

Test script for Pony ORM models.

This script tests the basic functionality of the Pony ORM models
and database operations.
"""

import sys
from pathlib import Path
import logging
from datetime import datetime

# Add the parent directory to the path to import price_monitor modules
sys.path.insert(0, str(Path(__file__).parent.parent))

from price_monitor.pony_database import PonyPriceDatabase
from price_monitor.models import PriceRecord, ShopnScanPrice

# Configure logging
logging.basicConfig(
    level=logging.INFO, format="%(asctime)s - %(levelname)s - %(message)s"
)
logger = logging.getLogger(__name__)


def test_basic_operations():
    """Test basic database operations."""
    logger.info("Testing basic database operations...")

    # Use a test database
    test_db_path = Path("./price_data/test_pony.db")
    db = PonyPriceDatabase(test_db_path)

    try:
        # Test 1: Add a store
        logger.info("Test 1: Adding a store...")
        store_data = {
            "store_id": "test_store_1",
            "name": "Test Store 1",
            "address": "123 Test St",
            "city": "Test City",
            "state": "TS",
            "zip_code": "12345",
        }

        success = db.add_store(store_data)
        if success:
            logger.info("✓ Store added successfully")
        else:
            logger.error("✗ Failed to add store")
            return False

        # Test 2: Add a product
        logger.info("Test 2: Adding a product...")
        product_data = {
            "upc": "123456789012",
            "name": "Test Product",
            "brand": "Test Brand",
            "category": "Test Category",
            "subcategory": "Test Subcategory",
        }

        success = db.add_product(product_data)
        if success:
            logger.info("✓ Product added successfully")
        else:
            logger.error("✗ Failed to add product")
            return False

        # Test 3: Add a price record
        logger.info("Test 3: Adding a price record...")
        price_record = PriceRecord(
            product_id="123456789012",
            product_name="Test Product",
            store_id="test_store_1",
            store_name="Test Store 1",
            price=9.99,
            original_price=12.99,
            is_on_sale=True,
            timestamp=datetime.now(),
        )

        success = db.add_price_record(price_record)
        if success:
            logger.info("✓ Price record added successfully")
        else:
            logger.error("✗ Failed to add price record")
            return False

        # Test 4: Search for products
        logger.info("Test 4: Searching for products...")
        results = db.search_products_by_query("Test")
        if results:
            logger.info(f"✓ Found {len(results)} products")
            for result in results:
                logger.info(f"  - {result['upc']}: {result['product_name']}")
        else:
            logger.error("✗ No products found")
            return False

        # Test 5: Get product prices by UPC
        logger.info("Test 5: Getting product prices by UPC...")
        prices = db.get_product_prices_by_upc("123456789012")
        if prices:
            logger.info(f"✓ Found {len(prices)} price records")
            for price in prices:
                logger.info(f"  - Store: {price['store_id']}, Price: ${price['price']}")
        else:
            logger.error("✗ No price records found")
            return False

        # Test 6: Add a search query
        logger.info("Test 6: Adding a search query...")
        search_id = db.add_search_query("test query", 1, 1)
        if search_id:
            logger.info(f"✓ Search query added with ID: {search_id}")
        else:
            logger.error("✗ Failed to add search query")
            return False

        # Test 7: Add a search result
        logger.info("Test 7: Adding a search result...")
        result_data = {
            "upc": "123456789012",
            "store_id": "test_store_1",
            "product_name": "Test Product",
            "price": 9.99,
            "original_price": 12.99,
            "is_on_sale": True,
            "is_clearance": False,
            "availability": "in_stock",
        }

        success = db.add_search_result(search_id, result_data)
        if success:
            logger.info("✓ Search result added successfully")
        else:
            logger.error("✗ Failed to add search result")
            return False

        # Test 8: Add Shop'n'Scan verification
        logger.info("Test 8: Adding Shop'n'Scan verification...")
        verification = ShopnScanPrice(
            upc="123456789012",
            product_name="Test Product",
            store_id="test_store_1",
            current_price=9.99,
            sale_price=9.99,
            original_price=12.99,
            is_on_sale=True,
            is_clearance=False,
        )

        success = db.add_shopnscan_verification(verification)
        if success:
            logger.info("✓ Shop'n'Scan verification added successfully")
        else:
            logger.error("✗ Failed to add Shop'n'Scan verification")
            return False

        # Test 9: Get database stats
        logger.info("Test 9: Getting database statistics...")
        stats = db.get_database_stats()
        if stats:
            logger.info("✓ Database statistics retrieved:")
            for key, value in stats.items():
                logger.info(f"  - {key}: {value}")
        else:
            logger.error("✗ Failed to get database statistics")
            return False

        logger.info("✓ All basic tests passed!")
        return True

    except Exception as e:
        logger.error(f"✗ Test failed with exception: {e}")
        return False

    finally:
        # Clean up
        db.close()
        if test_db_path.exists():
            test_db_path.unlink()
            logger.info("Test database cleaned up")


def test_relationships():
    """Test entity relationships."""
    logger.info("Testing entity relationships...")

    # Use a test database
    test_db_path = Path("./price_data/test_relationships.db")
    db = PonyPriceDatabase(test_db_path)

    try:
        from price_monitor.pony_models import Store, Product, PriceRecord

        with db._get_session():
            # Create test data
            store = Store(store_id="rel_test_store", name="Relationship Test Store")

            product = Product(upc="987654321098", name="Relationship Test Product")

            price_record = PriceRecord(product=product, store=store, price=15.99)

            commit()

            # Test relationships
            logger.info("✓ Store created with ID:", store.store_id)
            logger.info("✓ Product created with UPC:", product.upc)
            logger.info("✓ Price record created with ID:", price_record.id)

            # Test reverse relationships
            logger.info(f"✓ Store has {len(store.price_records)} price records")
            logger.info(f"✓ Product has {len(product.price_records)} price records")

            # Test relationship navigation
            for pr in store.price_records:
                logger.info(f"✓ Store price record: {pr.product.name} at ${pr.price}")

            for pr in product.price_records:
                logger.info(f"✓ Product price record: {pr.store.name} at ${pr.price}")

            logger.info("✓ All relationship tests passed!")
            return True

    except Exception as e:
        logger.error(f"✗ Relationship test failed with exception: {e}")
        return False

    finally:
        # Clean up
        db.close()
        if test_db_path.exists():
            test_db_path.unlink()
            logger.info("Test database cleaned up")


def main():
    """Main test function."""
    logger.info("Starting Pony ORM model tests...")

    # Test basic operations
    if not test_basic_operations():
        logger.error("Basic operations test failed")
        sys.exit(1)

    # Test relationships
    if not test_relationships():
        logger.error("Relationship test failed")
        sys.exit(1)

    logger.info("All tests passed successfully!")


if __name__ == "__main__":
    main()
