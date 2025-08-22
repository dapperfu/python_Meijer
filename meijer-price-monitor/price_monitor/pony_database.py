#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Pony ORM database manager for Meijer price monitoring system
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: pony.orm, typing, pathlib, datetime, logging
 */

Pony ORM database manager for the Meijer price monitoring system.

This module provides a Pony ORM-based database manager that replaces the
SQLite database module while maintaining the same interface.
"""

import logging
from datetime import datetime, timedelta
from pathlib import Path
from typing import Dict, List, Optional, Any, Union
from contextlib import contextmanager

from pony.orm import *
from .pony_models import db, Store, Product, PriceRecord, SearchQuery, SearchResult, ShopnScanVerification, PriceMonitor, PriceAlert, ExportJob
from .models import PriceRecord as PriceRecordModel, ShopnScanPrice


class PonyPriceDatabase:
    """Pony ORM database manager for price monitoring data."""
    
    def __init__(self, db_path: Optional[Path] = None):
        """
        Initialize the Pony ORM price database.
        
        Parameters
        ----------
        db_path : Path, optional
            Path to the SQLite database file (defaults to ./price_data/prices_pony.db)
        """
        if db_path is None:
            db_path = Path("./price_data/prices_pony.db")
        
        self.db_path = Path(db_path)
        self.db_path.parent.mkdir(parents=True, exist_ok=True)
        
        self.logger = logging.getLogger(__name__)
        
        # Bind database to SQLite
        db.bind(provider='sqlite', filename=str(self.db_path), create_db=True)
        
        # Generate mapping and create tables
        db.generate_mapping(create_tables=True)
        
        self.logger.info(f"Pony ORM database initialized at {self.db_path}")
    
    @contextmanager
    def _get_session(self):
        """Context manager for database sessions."""
        with db_session:
            try:
                yield
            except Exception as e:
                self.logger.error(f"Database session error: {e}")
                rollback()
                raise
    
    def add_store(self, store_data: Dict[str, Any]) -> bool:
        """
        Add or update a store in the database.
        
        Parameters
        ----------
        store_data : Dict[str, Any]
            Store information including store_id, name, address, etc.
        
        Returns
        -------
        bool
            True if successful, False otherwise
        """
        try:
            with self._get_session():
                store = Store.get(store_id=store_data['store_id'])
                if store:
                    # Update existing store
                    store.name = store_data['name']
                    store.address = store_data.get('address')
                    store.city = store_data.get('city')
                    store.state = store_data.get('state')
                    store.zip_code = store_data.get('zip_code')
                    store.latitude = store_data.get('latitude')
                    store.longitude = store_data.get('longitude')
                    store.updated_at = datetime.now()
                else:
                    # Create new store
                    store = Store(
                        store_id=store_data['store_id'],
                        name=store_data['name'],
                        address=store_data.get('address'),
                        city=store_data.get('city'),
                        state=store_data.get('state'),
                        zip_code=store_data.get('zip_code'),
                        latitude=store_data.get('latitude'),
                        longitude=store_data.get('longitude')
                    )
                
                commit()
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
            Product information including upc, name, brand, etc.
        
        Returns
        -------
        bool
            True if successful, False otherwise
        """
        try:
            with self._get_session():
                product = Product.get(upc=product_data['upc'])
                if product:
                    # Update existing product
                    product.name = product_data['name']
                    product.brand = product_data.get('brand')
                    product.category = product_data.get('category')
                    product.subcategory = product_data.get('subcategory')
                    product.description = product_data.get('description')
                    product.image_url = product_data.get('image_url')
                    product.updated_at = datetime.now()
                else:
                    # Create new product
                    product = Product(
                        upc=product_data['upc'],
                        name=product_data['name'],
                        brand=product_data.get('brand'),
                        category=product_data.get('category'),
                        subcategory=product_data.get('subcategory'),
                        description=product_data.get('description'),
                        image_url=product_data.get('image_url')
                    )
                
                commit()
                self.logger.debug(f"Product {product_data['upc']} added/updated successfully")
                return True
                
        except Exception as e:
            self.logger.error(f"Failed to add product {product_data.get('upc', 'unknown')}: {e}")
            return False
    
    def add_price_record(self, price_record: PriceRecordModel) -> bool:
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
            with self._get_session():
                # Ensure product exists
                self.add_product({
                    'upc': price_record.product_id,  # Assuming product_id is UPC
                    'name': price_record.product_name,
                    'brand': None,
                    'category': None,
                    'subcategory': None,
                    'description': None,
                    'image_url': None
                })
                
                # Ensure store exists
                self.add_store({
                    'store_id': price_record.store_id,
                    'name': price_record.store_name,
                    'address': None,
                    'city': None,
                    'state': None,
                    'zip_code': None,
                    'latitude': None,
                    'longitude': None
                })
                
                # Get product and store entities
                product = Product.get(upc=price_record.product_id)
                store = Store.get(store_id=price_record.store_id)
                
                if not product or not store:
                    self.logger.error("Product or store not found")
                    return False
                
                # Create price record
                PriceRecord(
                    product=product,
                    store=store,
                    price=price_record.price,
                    original_price=price_record.original_price,
                    sale_price=price_record.price if price_record.is_on_sale else None,
                    is_clearance=price_record.is_clearance,
                    is_on_sale=price_record.is_on_sale,
                    availability=price_record.availability,
                    search_query=price_record.search_query,
                    verification_method='search',
                    timestamp=price_record.timestamp
                )
                
                commit()
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
            with self._get_session():
                search_query = SearchQuery(
                    query_text=query_text,
                    results_count=results_count,
                    stores_searched=stores_searched
                )
                
                commit()
                search_id = search_query.id
                
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
            with self._get_session():
                # Ensure product exists
                self.add_product({
                    'upc': result_data['upc'],
                    'name': result_data['product_name'],
                    'brand': result_data.get('brand'),
                    'category': result_data.get('category'),
                    'subcategory': result_data.get('subcategory'),
                    'description': result_data.get('description'),
                    'image_url': result_data.get('image_url')
                })
                
                # Get entities
                search_query = SearchQuery.get(id=search_id)
                product = Product.get(upc=result_data['upc'])
                store = Store.get(store_id=result_data['store_id'])
                
                if not search_query or not product or not store:
                    self.logger.error("Search query, product, or store not found")
                    return False
                
                # Create search result
                SearchResult(
                    search_query=search_query,
                    product=product,
                    store=store,
                    product_name=result_data['product_name'],
                    price=result_data['price'],
                    original_price=result_data.get('original_price'),
                    is_clearance=result_data.get('is_clearance', False),
                    is_on_sale=result_data.get('is_on_sale', False),
                    availability=result_data.get('availability', 'unknown')
                )
                
                commit()
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
            with self._get_session():
                # Get product and store entities
                product = Product.get(upc=verification.upc)
                store = Store.get(store_id=verification.store_id)
                
                if not product or not store:
                    self.logger.error("Product or store not found")
                    return False
                
                # Create verification
                ShopnScanVerification(
                    product=product,
                    store=store,
                    verified_price=verification.current_price,
                    sale_price=verification.sale_price,
                    original_price=verification.original_price,
                    is_clearance=verification.is_clearance,
                    is_on_sale=verification.is_on_sale,
                    verification_status=verification.verification_status
                )
                
                commit()
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
            with self._get_session():
                products = select(p for p in Product 
                               if query.lower() in p.name.lower() or 
                                  (p.brand and query.lower() in p.brand.lower()) or
                                  (p.category and query.lower() in p.category.lower()))[:limit]
                
                results = []
                for product in products:
                    results.append({
                        'upc': product.upc,
                        'product_name': product.name,
                        'brand': product.brand,
                        'category': product.category,
                        'subcategory': product.subcategory
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
            with self._get_session():
                price_records = select(pr for pr in PriceRecord 
                                    if pr.product.upc == upc).order_by(desc(PriceRecord.timestamp))
                
                results = []
                for pr in price_records:
                    results.append(pr.to_dict())
                
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
            with self._get_session():
                cutoff_date = datetime.now() - timedelta(days=days)
                price_records = select(pr for pr in PriceRecord 
                                    if pr.product.upc == upc and 
                                       pr.store.store_id == store_id and
                                       pr.timestamp >= cutoff_date).order_by(desc(PriceRecord.timestamp))
                
                results = []
                for pr in price_records:
                    results.append(pr.to_dict())
                
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
            with self._get_session():
                cutoff_date = datetime.now() - timedelta(days=days)
                
                # This is a simplified version - in practice, you might want to use raw SQL
                # for complex analytical queries like this
                price_records = select(pr for pr in PriceRecord 
                                    if pr.timestamp >= cutoff_date).order_by(desc(PriceRecord.timestamp))
                
                # Group by product and store to find price changes
                price_changes = {}
                for pr in price_records:
                    key = (pr.product.upc, pr.store.store_id)
                    if key not in price_changes:
                        price_changes[key] = []
                    price_changes[key].append(pr)
                
                results = []
                for (upc, store_id), records in price_changes.items():
                    if len(records) >= 2:
                        # Sort by timestamp
                        records.sort(key=lambda x: x.timestamp)
                        current_price = records[-1].price
                        previous_price = records[0].price
                        
                        if current_price < previous_price:
                            drop_percent = ((previous_price - current_price) / previous_price) * 100
                            if drop_percent >= min_drop_percent:
                                results.append({
                                    'upc': upc,
                                    'store_id': store_id,
                                    'product_name': records[-1].product.name,
                                    'store_name': records[-1].store.name,
                                    'current_price': current_price,
                                    'previous_price': previous_price,
                                    'price_drop': previous_price - current_price,
                                    'drop_percent': drop_percent,
                                    'current_timestamp': records[-1].timestamp.isoformat(),
                                    'previous_timestamp': records[0].timestamp.isoformat()
                                })
                
                # Sort by drop percentage
                results.sort(key=lambda x: x['drop_percent'], reverse=True)
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
            with self._get_session():
                query = select(pr for pr in PriceRecord if pr.is_clearance)
                if max_price is not None:
                    query = query.filter(lambda pr: pr.price <= max_price)
                
                price_records = query.order_by(desc(PriceRecord.timestamp))
                
                results = []
                for pr in price_records:
                    results.append({
                        'upc': pr.product.upc,
                        'store_id': pr.store.store_id,
                        'product_name': pr.product.name,
                        'store_name': pr.store.name,
                        'price': pr.price,
                        'original_price': pr.original_price,
                        'sale_price': pr.sale_price,
                        'timestamp': pr.timestamp.isoformat()
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
            with self._get_session():
                stats = {}
                
                # Count records in each table
                stats['stores_count'] = count(s for s in Store)
                stats['products_count'] = count(p for p in Product)
                stats['price_records_count'] = count(pr for pr in PriceRecord)
                stats['search_queries_count'] = count(sq for sq in SearchQuery)
                stats['search_results_count'] = count(sr for sr in SearchResult)
                stats['shopnscan_verifications_count'] = count(sv for sv in ShopnScanVerification)
                stats['price_monitors_count'] = count(pm for pm in PriceMonitor)
                stats['price_alerts_count'] = count(pa for pa in PriceAlert)
                stats['export_jobs_count'] = count(ej for ej in ExportJob)
                
                # Get date range of price records
                price_records = select(pr for pr in PriceRecord)
                if price_records:
                    timestamps = [pr.timestamp for pr in price_records]
                    stats['earliest_price_record'] = min(timestamps).isoformat()
                    stats['latest_price_record'] = max(timestamps).isoformat()
                
                return stats
                
        except Exception as e:
            self.logger.error(f"Failed to get database stats: {e}")
            return {}
    
    def close(self) -> None:
        """Close the database connection."""
        db.disconnect()
        self.logger.info("Database connection closed")
