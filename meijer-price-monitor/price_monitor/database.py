#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: SQLite database module for dual-path price storage system
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: sqlite3, typing, pathlib, datetime, logging
 */

SQLite database module for the Meijer price monitoring system.

This module provides:
1. Database initialization and schema management
2. CRUD operations for products, stores, and price records
3. UPC-based product tracking as primary key
4. Relational storage for all Meijer API data
5. Efficient querying for price analysis and history
"""

import sqlite3
import logging
from datetime import datetime
from pathlib import Path
from typing import Dict, List, Optional, Any, Tuple, Union
from contextlib import contextmanager
import json

from .core import PriceRecord, PriceHistory, ShopnScanPrice


class PriceDatabase:
    """SQLite database for storing price monitoring data."""
    
    def __init__(self, db_path: Optional[Path] = None):
        """
        Initialize the price database.
        
        Parameters
        ----------
        db_path : Path, optional
            Path to the SQLite database file (defaults to ./price_data/prices.db)
        """
        if db_path is None:
            db_path = Path("./price_data/prices.db")
        
        self.db_path = Path(db_path)
        self.db_path.parent.mkdir(parents=True, exist_ok=True)
        
        self.logger = logging.getLogger(__name__)
        
        # Initialize database schema
        self._init_database()
    
    def _init_database(self) -> None:
        """Initialize the database schema."""
        with self._get_connection() as conn:
            cursor = conn.cursor()
            
            # Create tables
            cursor.executescript("""
                -- Stores table
                CREATE TABLE IF NOT EXISTS stores (
                    store_id TEXT PRIMARY KEY,
                    store_name TEXT NOT NULL,
                    address TEXT,
                    city TEXT,
                    state TEXT,
                    zip_code TEXT,
                    latitude REAL,
                    longitude REAL,
                    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                );
                
                -- Products table (UPC as primary key)
                CREATE TABLE IF NOT EXISTS products (
                    upc TEXT PRIMARY KEY,
                    product_name TEXT NOT NULL,
                    brand TEXT,
                    category TEXT,
                    subcategory TEXT,
                    description TEXT,
                    image_url TEXT,
                    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                );
                
                -- Price records table
                CREATE TABLE IF NOT EXISTS price_records (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    upc TEXT NOT NULL,
                    store_id TEXT NOT NULL,
                    price REAL NOT NULL,
                    original_price REAL,
                    sale_price REAL,
                    is_clearance BOOLEAN DEFAULT FALSE,
                    is_on_sale BOOLEAN DEFAULT FALSE,
                    availability TEXT DEFAULT 'unknown',
                    search_query TEXT,
                    verification_method TEXT DEFAULT 'search',
                    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                    FOREIGN KEY (upc) REFERENCES products (upc),
                    FOREIGN KEY (store_id) REFERENCES stores (store_id),
                    UNIQUE(upc, store_id, timestamp)
                );
                
                -- Search queries table
                CREATE TABLE IF NOT EXISTS search_queries (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    query_text TEXT NOT NULL,
                    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                    results_count INTEGER DEFAULT 0,
                    stores_searched INTEGER DEFAULT 0
                );
                
                -- Product search results table
                CREATE TABLE IF NOT EXISTS search_results (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    search_id INTEGER NOT NULL,
                    upc TEXT NOT NULL,
                    store_id TEXT NOT NULL,
                    product_name TEXT NOT NULL,
                    price REAL NOT NULL,
                    original_price REAL,
                    is_clearance BOOLEAN DEFAULT FALSE,
                    is_on_sale BOOLEAN DEFAULT FALSE,
                    availability TEXT DEFAULT 'unknown',
                    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                    FOREIGN KEY (search_id) REFERENCES search_queries (id),
                    FOREIGN KEY (upc) REFERENCES products (upc),
                    FOREIGN KEY (store_id) REFERENCES stores (store_id)
                );
                
                -- Shop'n'Scan verifications table
                CREATE TABLE IF NOT EXISTS shopnscan_verifications (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    upc TEXT NOT NULL,
                    store_id TEXT NOT NULL,
                    verified_price REAL NOT NULL,
                    sale_price REAL,
                    original_price REAL,
                    is_clearance BOOLEAN DEFAULT FALSE,
                    is_on_sale BOOLEAN DEFAULT FALSE,
                    verification_status TEXT DEFAULT 'verified',
                    verification_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                    FOREIGN KEY (upc) REFERENCES products (upc),
                    FOREIGN KEY (store_id) REFERENCES stores (store_id)
                );
                
                -- Create indexes for better performance
                CREATE INDEX IF NOT EXISTS idx_price_records_upc ON price_records (upc);
                CREATE INDEX IF NOT EXISTS idx_price_records_store ON price_records (store_id);
                CREATE INDEX IF NOT EXISTS idx_price_records_timestamp ON price_records (timestamp);
                CREATE INDEX IF NOT EXISTS idx_search_results_upc ON search_results (upc);
                CREATE INDEX IF NOT EXISTS idx_search_results_store ON search_results (store_id);
                CREATE INDEX IF NOT EXISTS idx_shopnscan_upc ON shopnscan_verifications (upc);
                CREATE INDEX IF NOT EXISTS idx_shopnscan_store ON shopnscan_verifications (store_id);
            """)
            
            conn.commit()
            self.logger.info("Database schema initialized successfully")
    
    @contextmanager
    def _get_connection(self):
        """Context manager for database connections."""
        conn = sqlite3.connect(str(self.db_path))
        conn.row_factory = sqlite3.Row  # Enable dict-like access to rows
        try:
            yield conn
        finally:
            conn.close()
    
    def add_store(self, store_data: Dict[str, Any]) -> bool:
        """
        Add or update a store in the database.
        
        Parameters
        ----------
        store_data : Dict[str, Any]
            Store information including store_id, store_name, address, etc.
        
        Returns
        -------
        bool
            True if successful, False otherwise
        """
        try:
            with self._get_connection() as conn:
                cursor = conn.cursor()
                
                cursor.execute("""
                    INSERT OR REPLACE INTO stores 
                    (store_id, store_name, address, city, state, zip_code, latitude, longitude, updated_at)
                    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
                """, (
                    store_data['store_id'],
                    store_data['store_name'],
                    store_data.get('address'),
                    store_data.get('city'),
                    store_data.get('state'),
                    store_data.get('zip_code'),
                    store_data.get('latitude'),
                    store_data.get('longitude'),
                    datetime.now()
                ))
                
                conn.commit()
                self.logger.debug(f"Store {store_data['store_id']} added/updated successfully")
                return True
                
        except Exception as e:
            self.logger.error(f"Failed to add store {store_data.get('store_id', 'unknown')}: {e}")
            return False
    
    def add_product(self, product_data: Dict[str, Any]) -> bool:
        """
        Add or update a product in the database.
        
        Parameters
        ----------
        product_data : Dict[str, Any]
            Product information including upc, product_name, brand, etc.
        
        Returns
        -------
        bool
            True if successful, False otherwise
        """
        try:
            with self._get_connection() as conn:
                cursor = conn.cursor()
                
                cursor.execute("""
                    INSERT OR REPLACE INTO products 
                    (upc, product_name, brand, category, subcategory, description, image_url, updated_at)
                    VALUES (?, ?, ?, ?, ?, ?, ?, ?)
                """, (
                    product_data['upc'],
                    product_data['product_name'],
                    product_data.get('brand'),
                    product_data.get('category'),
                    product_data.get('subcategory'),
                    product_data.get('description'),
                    product_data.get('image_url'),
                    datetime.now()
                ))
                
                conn.commit()
                self.logger.debug(f"Product {product_data['upc']} added/updated successfully")
                return True
                
        except Exception as e:
            self.logger.error(f"Failed to add product {product_data.get('upc', 'unknown')}: {e}")
            return False
    
    def add_price_record(self, price_record: PriceRecord) -> bool:
        """
        Add a price record to the database.
        
        Parameters
        ----------
        price_record : PriceRecord
            Price record to add
        
        Returns
        -------
        bool
            True if successful, False otherwise
        """
        try:
            with self._get_connection() as conn:
                cursor = conn.cursor()
                
                # Ensure product exists
                self.add_product({
                    'upc': price_record.product_id,  # Assuming product_id is UPC
                    'product_name': price_record.product_name,
                    'brand': None,
                    'category': None,
                    'subcategory': None,
                    'description': None,
                    'image_url': None
                })
                
                # Ensure store exists
                self.add_store({
                    'store_id': price_record.store_id,
                    'store_name': price_record.store_name,
                    'address': None,
                    'city': None,
                    'state': None,
                    'zip_code': None,
                    'latitude': None,
                    'longitude': None
                })
                
                # Add price record
                cursor.execute("""
                    INSERT INTO price_records 
                    (upc, store_id, price, original_price, sale_price, is_clearance, 
                     is_on_sale, availability, search_query, verification_method, timestamp)
                    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                """, (
                    price_record.product_id,
                    price_record.store_id,
                    price_record.price,
                    price_record.original_price,
                    price_record.price if price_record.is_on_sale else None,
                    price_record.is_clearance,
                    price_record.is_on_sale,
                    price_record.availability,
                    price_record.search_query,
                    'search',
                    price_record.timestamp
                ))
                
                conn.commit()
                self.logger.debug(f"Price record added for {price_record.product_id} at {price_record.store_id}")
                return True
                
        except Exception as e:
            self.logger.error(f"Failed to add price record: {e}")
            return False
    
    def add_search_query(self, query_text: str, results_count: int = 0, stores_searched: int = 0) -> Optional[int]:
        """
        Add a search query to the database.
        
        Parameters
        ----------
        query_text : str
            The search query text
        results_count : int
            Number of results found
        stores_searched : int
            Number of stores searched
        
        Returns
        -------
        Optional[int]
            Search query ID if successful, None otherwise
        """
        try:
            with self._get_connection() as conn:
                cursor = conn.cursor()
                
                cursor.execute("""
                    INSERT INTO search_queries (query_text, results_count, stores_searched)
                    VALUES (?, ?, ?)
                """, (query_text, results_count, stores_searched))
                
                search_id = cursor.lastrowid
                conn.commit()
                
                self.logger.debug(f"Search query '{query_text}' added with ID {search_id}")
                return search_id
                
        except Exception as e:
            self.logger.error(f"Failed to add search query: {e}")
            return None
    
    def add_search_result(self, search_id: int, result_data: Dict[str, Any]) -> bool:
        """
        Add a search result to the database.
        
        Parameters
        ----------
        search_id : int
            ID of the search query
        result_data : Dict[str, Any]
            Search result data
        
        Returns
        -------
        bool
            True if successful, False otherwise
        """
        try:
            with self._get_connection() as conn:
                cursor = conn.cursor()
                
                # Ensure product exists
                self.add_product({
                    'upc': result_data['upc'],
                    'product_name': result_data['product_name'],
                    'brand': result_data.get('brand'),
                    'category': result_data.get('category'),
                    'subcategory': result_data.get('subcategory'),
                    'description': result_data.get('description'),
                    'image_url': result_data.get('image_url')
                })
                
                # Add search result
                cursor.execute("""
                    INSERT INTO search_results 
                    (search_id, upc, store_id, product_name, price, original_price, 
                     is_clearance, is_on_sale, availability, timestamp)
                    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                """, (
                    search_id,
                    result_data['upc'],
                    result_data['store_id'],
                    result_data['product_name'],
                    result_data['price'],
                    result_data.get('original_price'),
                    result_data.get('is_clearance', False),
                    result_data.get('is_on_sale', False),
                    result_data.get('availability', 'unknown'),
                    datetime.now()
                ))
                
                conn.commit()
                return True
                
        except Exception as e:
            self.logger.error(f"Failed to add search result: {e}")
            return False
    
    def add_shopnscan_verification(self, verification: ShopnScanPrice) -> bool:
        """
        Add a Shop'n'Scan verification to the database.
        
        Parameters
        ----------
        verification : ShopnScanPrice
            Shop'n'Scan verification data
        
        Returns
        -------
        bool
            True if successful, False otherwise
        """
        try:
            with self._get_connection() as conn:
                cursor = conn.cursor()
                
                cursor.execute("""
                    INSERT OR REPLACE INTO shopnscan_verifications 
                    (upc, store_id, verified_price, sale_price, original_price, 
                     is_clearance, is_on_sale, verification_status, verification_timestamp)
                    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
                """, (
                    verification.upc,
                    verification.store_id,
                    verification.current_price,
                    verification.sale_price,
                    verification.original_price,
                    verification.is_clearance,
                    verification.is_on_sale,
                    verification.verification_status,
                    verification.timestamp
                ))
                
                conn.commit()
                self.logger.debug(f"Shop'n'Scan verification added for {verification.upc} at {verification.store_id}")
                return True
                
        except Exception as e:
            self.logger.error(f"Failed to add Shop'n'Scan verification: {e}")
            return False
    
    def search_products_by_query(self, query: str, limit: int = 100) -> List[Dict[str, Any]]:
        """
        Search for products by query text.
        
        Parameters
        ----------
        query : str
            Search query text
        limit : int
            Maximum number of results to return
        
        Returns
        -------
        List[Dict[str, Any]]
            List of matching products with UPCs
        """
        try:
            with self._get_connection() as conn:
                cursor = conn.cursor()
                
                # Search in products table
                cursor.execute("""
                    SELECT DISTINCT p.upc, p.product_name, p.brand, p.category, p.subcategory
                    FROM products p
                    WHERE p.product_name LIKE ? OR p.brand LIKE ? OR p.category LIKE ?
                    ORDER BY p.product_name
                    LIMIT ?
                """, (f'%{query}%', f'%{query}%', f'%{query}%', limit))
                
                results = []
                for row in cursor.fetchall():
                    results.append({
                        'upc': row['upc'],
                        'product_name': row['product_name'],
                        'brand': row['brand'],
                        'category': row['category'],
                        'subcategory': row['subcategory']
                    })
                
                return results
                
        except Exception as e:
            self.logger.error(f"Failed to search products: {e}")
            return []
    
    def get_product_prices_by_upc(self, upc: str) -> List[Dict[str, Any]]:
        """
        Get all price records for a specific UPC across all stores.
        
        Parameters
        ----------
        upc : str
            Product UPC code
        
        Returns
        -------
        List[Dict[str, Any]]
            List of price records for the UPC
        """
        try:
            with self._get_connection() as conn:
                cursor = conn.cursor()
                
                cursor.execute("""
                    SELECT pr.*, s.store_name, p.product_name
                    FROM price_records pr
                    JOIN stores s ON pr.store_id = s.store_id
                    JOIN products p ON pr.upc = p.upc
                    WHERE pr.upc = ?
                    ORDER BY pr.timestamp DESC
                """, (upc,))
                
                results = []
                for row in cursor.fetchall():
                    results.append({
                        'id': row['id'],
                        'upc': row['upc'],
                        'store_id': row['store_id'],
                        'store_name': row['store_name'],
                        'product_name': row['product_name'],
                        'price': row['price'],
                        'original_price': row['original_price'],
                        'sale_price': row['sale_price'],
                        'is_clearance': bool(row['is_clearance']),
                        'is_on_sale': bool(row['is_on_sale']),
                        'availability': row['availability'],
                        'search_query': row['search_query'],
                        'verification_method': row['verification_method'],
                        'timestamp': row['timestamp']
                    })
                
                return results
                
        except Exception as e:
            self.logger.error(f"Failed to get product prices for UPC {upc}: {e}")
            return []
    
    def get_price_history(self, upc: str, store_id: str, days: int = 30) -> List[Dict[str, Any]]:
        """
        Get price history for a specific product at a specific store.
        
        Parameters
        ----------
        upc : str
            Product UPC code
        store_id : str
            Store identifier
        days : int
            Number of days of history to retrieve
        
        Returns
        -------
        List[Dict[str, Any]]
            List of price records over time
        """
        try:
            with self._get_connection() as conn:
                cursor = conn.cursor()
                
                cursor.execute("""
                    SELECT pr.*, s.store_name, p.product_name
                    FROM price_records pr
                    JOIN stores s ON pr.store_id = s.store_id
                    JOIN products p ON pr.upc = p.upc
                    WHERE pr.upc = ? AND pr.store_id = ?
                    AND pr.timestamp >= datetime('now', '-{} days')
                    ORDER BY pr.timestamp DESC
                """.format(days), (upc, store_id))
                
                results = []
                for row in cursor.fetchall():
                    results.append({
                        'id': row['id'],
                        'upc': row['upc'],
                        'store_id': row['store_id'],
                        'store_name': row['store_name'],
                        'product_name': row['product_name'],
                        'price': row['price'],
                        'original_price': row['original_price'],
                        'sale_price': row['sale_price'],
                        'is_clearance': bool(row['is_clearance']),
                        'is_on_sale': bool(row['is_on_sale']),
                        'availability': row['availability'],
                        'search_query': row['search_query'],
                        'verification_method': row['verification_method'],
                        'timestamp': row['timestamp']
                    })
                
                return results
                
        except Exception as e:
            self.logger.error(f"Failed to get price history: {e}")
            return []
    
    def find_price_drops(self, min_drop_percent: float = 5.0, days: int = 7) -> List[Dict[str, Any]]:
        """
        Find products with significant price drops.
        
        Parameters
        ----------
        min_drop_percent : float
            Minimum price drop percentage to consider
        days : int
            Number of days to look back for price changes
        
        Returns
        -------
        List[Dict[str, Any]]
            List of products with price drops
        """
        try:
            with self._get_connection() as conn:
                cursor = conn.cursor()
                
                cursor.execute("""
                    WITH price_changes AS (
                        SELECT 
                            pr1.upc,
                            pr1.store_id,
                            pr1.price as current_price,
                            pr1.timestamp as current_timestamp,
                            pr2.price as previous_price,
                            pr2.timestamp as previous_timestamp,
                            ((pr2.price - pr1.price) / pr2.price * 100) as drop_percent,
                            (pr2.price - pr1.price) as price_drop
                        FROM price_records pr1
                        JOIN price_records pr2 ON pr1.upc = pr2.upc 
                            AND pr1.store_id = pr2.store_id
                        WHERE pr1.timestamp >= datetime('now', '-{} days')
                        AND pr2.timestamp < pr1.timestamp
                        AND pr2.timestamp >= datetime('now', '-{} days')
                        AND pr1.price < pr2.price
                    )
                    SELECT 
                        pc.*,
                        p.product_name,
                        s.store_name
                    FROM price_changes pc
                    JOIN products p ON pc.upc = p.upc
                    JOIN stores s ON pc.store_id = s.store_id
                    WHERE pc.drop_percent >= ?
                    ORDER BY pc.drop_percent DESC
                """.format(days, days), (min_drop_percent,))
                
                results = []
                for row in cursor.fetchall():
                    results.append({
                        'upc': row['upc'],
                        'store_id': row['store_id'],
                        'product_name': row['product_name'],
                        'store_name': row['store_name'],
                        'current_price': row['current_price'],
                        'previous_price': row['previous_price'],
                        'price_drop': row['price_drop'],
                        'drop_percent': row['drop_percent'],
                        'current_timestamp': row['current_timestamp'],
                        'previous_timestamp': row['previous_timestamp']
                    })
                
                return results
                
        except Exception as e:
            self.logger.error(f"Failed to find price drops: {e}")
            return []
    
    def get_clearance_deals(self, max_price: Optional[float] = None) -> List[Dict[str, Any]]:
        """
        Find products on clearance.
        
        Parameters
        ----------
        max_price : float, optional
            Maximum price to consider for clearance items
        
        Returns
        -------
        List[Dict[str, Any]]
            List of clearance deals
        """
        try:
            with self._get_connection() as conn:
                cursor = conn.cursor()
                
                query = """
                    SELECT 
                        pr.upc,
                        pr.store_id,
                        pr.price,
                        pr.original_price,
                        pr.sale_price,
                        pr.timestamp,
                        p.product_name,
                        s.store_name
                    FROM price_records pr
                    JOIN products p ON pr.upc = p.upc
                    JOIN stores s ON pr.store_id = s.store_id
                    WHERE pr.is_clearance = 1
                """
                
                params = []
                if max_price is not None:
                    query += " AND pr.price <= ?"
                    params.append(max_price)
                
                query += " ORDER BY pr.timestamp DESC"
                
                cursor.execute(query, params)
                
                results = []
                for row in cursor.fetchall():
                    results.append({
                        'upc': row['upc'],
                        'store_id': row['store_id'],
                        'product_name': row['product_name'],
                        'store_name': row['store_name'],
                        'price': row['price'],
                        'original_price': row['original_price'],
                        'sale_price': row['sale_price'],
                        'timestamp': row['timestamp']
                    })
                
                return results
                
        except Exception as e:
            self.logger.error(f"Failed to get clearance deals: {e}")
            return []
    
    def get_database_stats(self) -> Dict[str, Any]:
        """
        Get database statistics.
        
        Returns
        -------
        Dict[str, Any]
            Database statistics
        """
        try:
            with self._get_connection() as conn:
                cursor = conn.cursor()
                
                stats = {}
                
                # Count records in each table
                tables = ['stores', 'products', 'price_records', 'search_queries', 'search_results', 'shopnscan_verifications']
                for table in tables:
                    cursor.execute(f"SELECT COUNT(*) FROM {table}")
                    stats[f'{table}_count'] = cursor.fetchone()[0]
                
                # Get date range of price records
                cursor.execute("""
                    SELECT 
                        MIN(timestamp) as earliest,
                        MAX(timestamp) as latest
                    FROM price_records
                """)
                date_range = cursor.fetchone()
                if date_range and date_range[0]:
                    stats['earliest_price_record'] = date_range[0]
                    stats['latest_price_record'] = date_range[1]
                
                return stats
                
        except Exception as e:
            self.logger.error(f"Failed to get database stats: {e}")
            return {}
