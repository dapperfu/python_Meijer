#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Migration script from SQLite to Pony ORM database
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: sqlite3, pathlib, sys, logging
 */

Migration script to transfer data from SQLite database to Pony ORM database.

This script reads data from the existing SQLite database and migrates it
to the new Pony ORM database structure.
"""

import sqlite3
import sys
from pathlib import Path
import logging
from typing import Dict

# Add the parent directory to the path to import price_monitor modules
sys.path.insert(0, str(Path(__file__).parent.parent))

from price_monitor.pony_database import PonyPriceDatabase

# Configure logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger(__name__)


def migrate_stores(old_db_path: Path, new_db: PonyPriceDatabase) -> int:
    """
    Migrate stores from old SQLite database to Pony ORM database.
    
    Parameters
    ----------
    old_db_path : Path
        Path to the old SQLite database
    new_db : PonyPriceDatabase
        New Pony ORM database instance
    
    Returns
    -------
    int
        Number of stores migrated
    """
    logger.info("Migrating stores...")
    
    try:
        with sqlite3.connect(str(old_db_path)) as conn:
            conn.row_factory = sqlite3.Row
            cursor = conn.cursor()
            
            cursor.execute("SELECT * FROM stores")
            stores = cursor.fetchall()
            
            migrated_count = 0
            for store_row in stores:
                store_data = {
                    'store_id': store_row['store_id'],
                    'name': store_row['store_name'],
                    'address': store_row['address'],
                    'city': store_row['city'],
                    'state': store_row['state'],
                    'zip_code': store_row['zip_code'],
                    'latitude': store_row['latitude'],
                    'longitude': store_row['longitude']
                }
                
                if new_db.add_store(store_data):
                    migrated_count += 1
                    logger.debug(f"Migrated store: {store_data['store_id']}")
                else:
                    logger.warning(f"Failed to migrate store: {store_data['store_id']}")
            
            logger.info(f"Successfully migrated {migrated_count} stores")
            return migrated_count
            
    except Exception as e:
        logger.error(f"Error migrating stores: {e}")
        return 0


def migrate_products(old_db_path: Path, new_db: PonyPriceDatabase) -> int:
    """
    Migrate products from old SQLite database to Pony ORM database.
    
    Parameters
    ----------
    old_db_path : Path
        Path to the old SQLite database
    new_db : PonyPriceDatabase
        New Pony ORM database instance
    
    Returns
    -------
    int
        Number of products migrated
    """
    logger.info("Migrating products...")
    
    try:
        with sqlite3.connect(str(old_db_path)) as conn:
            conn.row_factory = sqlite3.Row
            cursor = conn.cursor()
            
            cursor.execute("SELECT * FROM products")
            products = cursor.fetchall()
            
            migrated_count = 0
            for product_row in products:
                product_data = {
                    'upc': product_row['upc'],
                    'name': product_row['product_name'],
                    'brand': product_row['brand'],
                    'category': product_row['category'],
                    'subcategory': product_row['subcategory'],
                    'description': product_row['description'],
                    'image_url': product_row['image_url']
                }
                
                if new_db.add_product(product_data):
                    migrated_count += 1
                    logger.debug(f"Migrated product: {product_data['upc']}")
                else:
                    logger.warning(f"Failed to migrate product: {product_data['upc']}")
            
            logger.info(f"Successfully migrated {migrated_count} products")
            return migrated_count
            
    except Exception as e:
        logger.error(f"Error migrating products: {e}")
        return 0


def migrate_search_queries(old_db_path: Path, new_db: PonyPriceDatabase) -> Dict[int, int]:
    """
    Migrate search queries from old SQLite database to Pony ORM database.
    
    Parameters
    ----------
    old_db_path : Path
        Path to the old SQLite database
    new_db : PonyPriceDatabase
        New Pony ORM database instance
    
    Returns
    -------
    Dict[int, int]
        Mapping of old search query IDs to new search query IDs
    """
    logger.info("Migrating search queries...")
    
    try:
        with sqlite3.connect(str(old_db_path)) as conn:
            conn.row_factory = sqlite3.Row
            cursor = conn.cursor()
            
            cursor.execute("SELECT * FROM search_queries ORDER BY id")
            queries = cursor.fetchall()
            
            id_mapping = {}
            migrated_count = 0
            
            for query_row in queries:
                old_id = query_row['id']
                new_id = new_db.add_search_query(
                    query_text=query_row['query_text'],
                    results_count=query_row['results_count'],
                    stores_searched=query_row['stores_searched']
                )
                
                if new_id:
                    id_mapping[old_id] = new_id
                    migrated_count += 1
                    logger.debug(f"Migrated search query: {old_id} -> {new_id}")
                else:
                    logger.warning(f"Failed to migrate search query: {old_id}")
            
            logger.info(f"Successfully migrated {migrated_count} search queries")
            return id_mapping
            
    except Exception as e:
        logger.error(f"Error migrating search queries: {e}")
        return {}


def migrate_search_results(old_db_path: Path, new_db: PonyPriceDatabase, id_mapping: Dict[int, int]) -> int:
    """
    Migrate search results from old SQLite database to Pony ORM database.
    
    Parameters
    ----------
    old_db_path : Path
        Path to the old SQLite database
    new_db : PonyPriceDatabase
        New Pony ORM database instance
    id_mapping : Dict[int, int]
        Mapping of old search query IDs to new search query IDs
    
    Returns
    -------
    int
        Number of search results migrated
    """
    logger.info("Migrating search results...")
    
    try:
        with sqlite3.connect(str(old_db_path)) as conn:
            conn.row_factory = sqlite3.Row
            cursor = conn.cursor()
            
            cursor.execute("SELECT * FROM search_results")
            results = cursor.fetchall()
            
            migrated_count = 0
            for result_row in results:
                old_search_id = result_row['search_id']
                new_search_id = id_mapping.get(old_search_id)
                
                if new_search_id is None:
                    logger.warning(f"Skipping search result with unknown search_id: {old_search_id}")
                    continue
                
                result_data = {
                    'upc': result_row['upc'],
                    'store_id': result_row['store_id'],
                    'product_name': result_row['product_name'],
                    'price': result_row['price'],
                    'original_price': result_row['original_price'],
                    'is_clearance': bool(result_row['is_clearance']),
                    'is_on_sale': bool(result_row['is_on_sale']),
                    'availability': result_row['availability']
                }
                
                if new_db.add_search_result(new_search_id, result_data):
                    migrated_count += 1
                    logger.debug(f"Migrated search result: {result_row['id']}")
                else:
                    logger.warning(f"Failed to migrate search result: {result_row['id']}")
            
            logger.info(f"Successfully migrated {migrated_count} search results")
            return migrated_count
            
    except Exception as e:
        logger.error(f"Error migrating search results: {e}")
        return 0


def migrate_shopnscan_verifications(old_db_path: Path, new_db: PonyPriceDatabase) -> int:
    """
    Migrate Shop'n'Scan verifications from old SQLite database to Pony ORM database.
    
    Parameters
    ----------
    old_db_path : Path
        Path to the old SQLite database
    new_db : PonyPriceDatabase
        New Pony ORM database instance
    
    Returns
    -------
    int
        Number of verifications migrated
    """
    logger.info("Migrating Shop'n'Scan verifications...")
    
    try:
        with sqlite3.connect(str(old_db_path)) as conn:
            conn.row_factory = sqlite3.Row
            cursor = conn.cursor()
            
            cursor.execute("SELECT * FROM shopnscan_verifications")
            verifications = cursor.fetchall()
            
            migrated_count = 0
            for verification_row in verifications:
                # Create a ShopnScanPrice object for compatibility
                from price_monitor.models import ShopnScanPrice
                
                verification = ShopnScanPrice(
                    upc=verification_row['upc'],
                    product_name="",  # Will be filled from product table
                    store_id=verification_row['store_id'],
                    current_price=verification_row['verified_price'],
                    sale_price=verification_row['sale_price'],
                    original_price=verification_row['original_price'],
                    is_clearance=bool(verification_row['is_clearance']),
                    is_on_sale=bool(verification_row['is_on_sale']),
                    verification_status=verification_row['verification_status']
                )
                
                if new_db.add_shopnscan_verification(verification):
                    migrated_count += 1
                    logger.debug(f"Migrated verification: {verification_row['id']}")
                else:
                    logger.warning(f"Failed to migrate verification: {verification_row['id']}")
            
            logger.info(f"Successfully migrated {migrated_count} Shop'n'Scan verifications")
            return migrated_count
            
    except Exception as e:
        logger.error(f"Error migrating Shop'n'Scan verifications: {e}")
        return 0


def main():
    """Main migration function."""
    logger.info("Starting migration from SQLite to Pony ORM database...")
    
    # Paths
    old_db_path = Path("./price_data/prices.db")
    new_db_path = Path("./price_data/prices_pony.db")
    
    # Check if old database exists
    if not old_db_path.exists():
        logger.error(f"Old database not found: {old_db_path}")
        sys.exit(1)
    
    # Check if new database already exists
    if new_db_path.exists():
        logger.warning(f"New database already exists: {new_db_path}")
        response = input("Do you want to overwrite it? (y/N): ")
        if response.lower() != 'y':
            logger.info("Migration cancelled")
            sys.exit(0)
    
    try:
        # Initialize new Pony ORM database
        logger.info("Initializing new Pony ORM database...")
        new_db = PonyPriceDatabase(new_db_path)
        
        # Perform migration
        stores_migrated = migrate_stores(old_db_path, new_db)
        products_migrated = migrate_products(old_db_path, new_db)
        
        # Search queries and results need to be migrated together due to foreign key relationships
        id_mapping = migrate_search_queries(old_db_path, new_db)
        search_results_migrated = migrate_search_results(old_db_path, new_db, id_mapping)
        
        verifications_migrated = migrate_shopnscan_verifications(old_db_path, new_db)
        
        # Summary
        logger.info("Migration completed successfully!")
        logger.info(f"Stores migrated: {stores_migrated}")
        logger.info(f"Products migrated: {products_migrated}")
        logger.info(f"Search queries migrated: {len(id_mapping)}")
        logger.info(f"Search results migrated: {search_results_migrated}")
        logger.info(f"Shop'n'Scan verifications migrated: {verifications_migrated}")
        
        # Close database
        new_db.close()
        
    except Exception as e:
        logger.error(f"Migration failed: {e}")
        sys.exit(1)


if __name__ == "__main__":
    main()
