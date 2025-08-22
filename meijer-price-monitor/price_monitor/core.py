#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Core price monitoring logic for standalone project
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: typing, dataclasses, datetime, pathlib, json, logging, meijer package
 */

Core price monitoring system for Meijer products.

This module provides the core functionality for:
1. Searching products across multiple stores
2. Tracking price changes over time
3. Storing results in organized JSON files
4. Supporting cron-based automation
"""

import json
import logging
import sys
from dataclasses import dataclass, field, asdict
from datetime import datetime, timedelta
from pathlib import Path
from typing import Dict, List, Optional, Any, Set
import time

# Try to import from the core Meijer API
try:
    # First try to import from the parent directory (if this is a subproject)
    sys.path.insert(0, str(Path(__file__).parent.parent.parent))
    from meijer.client import Meijer
    from meijer.search import Search
    from meijer.stores import MeijerStore
    MEIJER_AVAILABLE = True
except ImportError:
    # Fallback: create mock classes for development/testing
    MEIJER_AVAILABLE = False
    logging.warning("Core Meijer API not available. Using mock classes for development.")

# Import local modules
from .database import PriceDatabase
from .search_engine import EnhancedSearchEngine, SearchQuery, SearchResult
from .storage_manager import DualPathStorageManager


@dataclass
class PriceRecord:
    """Represents a single price record for a product at a specific store."""
    
    product_id: str
    """Unique product identifier"""
    
    product_name: str
    """Product name"""
    
    store_id: str
    """Store identifier"""
    
    store_name: str
    """Store name"""
    
    price: float
    """Current price"""
    
    original_price: Optional[float] = None
    """Original/regular price if available"""
    
    is_clearance: bool = False
    """Whether the item is on clearance"""
    
    is_on_sale: bool = False
    """Whether the item is on sale"""
    
    timestamp: datetime = field(default_factory=datetime.now)
    """When this price was recorded"""
    
    availability: str = "unknown"
    """Product availability status"""
    
    search_query: str = ""
    """The search query that found this product"""
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for JSON serialization."""
        data = asdict(self)
        data['timestamp'] = self.timestamp.isoformat()
        return data


@dataclass
class PriceHistory:
    """Represents price history for a product at a specific store."""
    
    product_id: str
    """Unique product identifier"""
    
    store_id: str
    """Store identifier"""
    
    price_records: List[PriceRecord] = field(default_factory=list)
    """List of price records over time"""
    
    def add_price(self, price_record: PriceRecord) -> None:
        """Add a new price record."""
        self.price_records.append(price_record)
        # Sort by timestamp (newest first)
        self.price_records.sort(key=lambda x: x.timestamp, reverse=True)
    
    def get_latest_price(self) -> Optional[PriceRecord]:
        """Get the most recent price record."""
        return self.price_records[0] if self.price_records else None
    
    def get_price_change(self) -> Optional[float]:
        """Calculate price change from oldest to newest record."""
        if len(self.price_records) < 2:
            return None
        oldest = self.price_records[-1].price
        newest = self.price_records[0].price
        return newest - oldest
    
    def get_lowest_price(self) -> Optional[PriceRecord]:
        """Get the record with the lowest price."""
        if not self.price_records:
            return None
        return min(self.price_records, key=lambda x: x.price)
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for JSON serialization."""
        return {
            'product_id': self.product_id,
            'store_id': self.store_id,
            'price_records': [record.to_dict() for record in self.price_records]
        }


@dataclass
class PriceDropAnalysis:
    """Represents a price drop analysis between two price records."""
    
    product_id: str
    """Unique product identifier"""
    
    product_name: str
    """Product name"""
    
    store_id: str
    """Store identifier"""
    
    store_name: str
    """Store name"""
    
    previous_price: float
    """Previous price"""
    
    current_price: float
    """Current price"""
    
    price_drop: float
    """Amount of price drop"""
    
    price_drop_percent: float
    """Percentage of price drop"""
    
    previous_timestamp: datetime
    """When previous price was recorded"""
    
    current_timestamp: datetime
    """When current price was recorded"""
    
    days_since_last_check: int
    """Days between price checks"""
    
    is_clearance: bool
    """Whether current item is on clearance"""
    
    is_on_sale: bool
    """Whether current item is on sale"""
    
    search_query: str
    """The search query that found this product"""
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for JSON serialization."""
        data = asdict(self)
        data['previous_timestamp'] = self.previous_timestamp.isoformat()
        data['current_timestamp'] = self.current_timestamp.isoformat()
        return data


@dataclass
class ShopnScanPrice:
    """Represents a price from Shop'n'Scan verification."""
    
    upc: str
    """Product UPC code"""
    
    product_name: str
    """Product name from Shop'n'Scan"""
    
    store_id: str
    """Store identifier"""
    
    current_price: float
    """Current price from Shop'n'Scan"""
    
    sale_price: Optional[float] = None
    """Sale price if available"""
    
    original_price: Optional[float] = None
    """Original/regular price if available"""
    
    is_clearance: bool = False
    """Whether the item is on clearance"""
    
    is_on_sale: bool = False
    """Whether the item is on sale"""
    
    timestamp: datetime = field(default_factory=datetime.now)
    """When this price was verified"""
    
    verification_status: str = "verified"
    """Status of price verification"""
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for JSON serialization."""
        data = asdict(self)
        data['timestamp'] = self.timestamp.isoformat()
        return data


class PriceMonitor:
    """Main price monitoring system for Meijer products."""
    
    def __init__(self, meijer_client: Optional[Any] = None, data_dir: Optional[Path] = None):
        """
        Initialize the price monitor.
        
        Parameters
        ----------
        meijer_client : Any, optional
            Authenticated Meijer client instance (can be None for testing)
        data_dir : Path, optional
            Directory to store price data (defaults to ./price_data)
        """
        self.meijer = meijer_client
        self.logger = logging.getLogger(__name__)
        
        # Set up data directory
        if data_dir is None:
            data_dir = Path("./price_data")
        self.data_dir = Path(data_dir)
        
        # Initialize dual-path storage manager
        self.storage_manager = DualPathStorageManager(data_dir)
        
        # Initialize enhanced search engine
        self.search_engine = EnhancedSearchEngine(meijer_client)
        
        # Initialize database directly for backward compatibility
        self.database = self.storage_manager.database
        
        # Create legacy subdirectories for backward compatibility
        self.results_dir = self.data_dir / "results"
        self.history_dir = self.data_dir / "history"
        self.config_dir = self.data_dir / "config"
        
        for directory in [self.results_dir, self.history_dir, self.config_dir]:
            directory.mkdir(exist_ok=True)
        
        # Load existing configurations
        self.configs = self._load_configs()
        
        # Initialize legacy search and stores if Meijer API is available
        if MEIJER_AVAILABLE and meijer_client:
            self.search = Search(meijer_client)
            self.stores = meijer_client.stores
        else:
            self.search = None
            self.stores = None
            self.logger.warning("Meijer API not available. Some functionality will be limited.")
    
    def _load_configs(self) -> Dict[str, Dict[str, Any]]:
        """Load existing monitoring configurations."""
        configs = {}
        config_file = self.config_dir / "monitors.json"
        
        if config_file.exists():
            try:
                with open(config_file, 'r') as f:
                    configs = json.load(f)
                self.logger.info(f"Loaded {len(configs)} existing monitoring configurations")
            except Exception as e:
                self.logger.error(f"Failed to load configurations: {e}")
        
        return configs
    
    def _save_configs(self) -> None:
        """Save monitoring configurations to file."""
        config_file = self.config_dir / "monitors.json"
        try:
            with open(config_file, 'w') as f:
                json.dump(self.configs, f, indent=2)
        except Exception as e:
            self.logger.error(f"Failed to save configurations: {e}")
    
    def create_monitor(
        self,
        name: str,
        search_query: str,
        location: str,
        radius: int = 50,
        stores: Optional[List[str]] = None
    ) -> str:
        """
        Create a new price monitoring configuration.
        
        Parameters
        ----------
        name : str
            Unique name for this monitor
        search_query : str
            Search query for products
        location : str
            City or ZIP code for store search
        radius : int
            Search radius in miles (default: 50)
        stores : List[str], optional
            Specific store IDs to monitor (if None, finds stores automatically)
        
        Returns
        -------
        str
            Monitor ID for future reference
        """
        monitor_id = f"{name}_{int(time.time())}"
        
        # Find stores if not specified
        if stores is None and self.stores:
            stores = self._find_stores_near_location(location, radius)
        elif stores is None:
            # Mock stores for testing
            stores = [f"store_{i}" for i in range(3)]
            self.logger.warning("Using mock stores for testing")
        
        config = {
            'name': name,
            'search_query': search_query,
            'location': location,
            'radius': radius,
            'stores': stores,
            'created_at': datetime.now().isoformat(),
            'last_run': None,
            'enabled': True
        }
        
        self.configs[monitor_id] = config
        self._save_configs()
        
        self.logger.info(f"Created monitor '{name}' (ID: {monitor_id}) for {len(stores)} stores")
        return monitor_id
    
    def _find_stores_near_location(self, location: str, radius: int) -> List[str]:
        """Find stores near the specified location."""
        if not self.stores:
            self.logger.warning("Store search not available")
            return []
        
        try:
            # Search for stores near the location
            nearby_stores = self.stores.search_stores(location, radius=radius)
            store_ids = [store.store_id for store in nearby_stores]
            self.logger.info(f"Found {len(store_ids)} stores near {location}")
            return store_ids
        except Exception as e:
            self.logger.error(f"Failed to find stores near {location}: {e}")
            return []
    
    def run_monitor(self, monitor_id: str) -> Dict[str, Any]:
        """
        Run a price monitoring scan for the specified monitor.
        
        Parameters
        ----------
        monitor_id : str
            ID of the monitor to run
        
        Returns
        -------
        Dict[str, Any]
            Results summary
        """
        if monitor_id not in self.configs:
            raise ValueError(f"Monitor {monitor_id} not found")
        
        config = self.configs[monitor_id]
        self.logger.info(f"Running monitor '{config['name']}' for query: {config['search_query']}")
        
        results = {
            'monitor_id': monitor_id,
            'timestamp': datetime.now().isoformat(),
            'search_query': config['search_query'],
            'stores_scanned': len(config['stores']),
            'products_found': 0,
            'price_records': [],
            'errors': []
        }
        
        # Search for products at each store
        for store_id in config['stores']:
            try:
                store_results = self._search_store_products(
                    config['search_query'], 
                    store_id,
                    config['name']
                )
                results['price_records'].extend(store_results)
                results['products_found'] += len(store_results)
                
            except Exception as e:
                error_msg = f"Store {store_id}: {str(e)}"
                results['errors'].append(error_msg)
                self.logger.error(error_msg)
        
        # Save results
        self._save_results(monitor_id, results)
        
        # Update price history
        self._update_price_history(results['price_records'])
        
        # Update monitor config
        config['last_run'] = datetime.now().isoformat()
        self._save_configs()
        
        self.logger.info(f"Monitor '{config['name']}' completed: {results['products_found']} products found")
        return results
    
    def _search_store_products(
        self, 
        query: str, 
        store_id: str, 
        monitor_name: str
    ) -> List[PriceRecord]:
        """Search for products at a specific store."""
        if not self.search:
            # Mock search results for testing
            self.logger.warning("Using mock search results for testing")
            return [
                PriceRecord(
                    product_id=f"mock_product_{i}",
                    product_name=f"Mock {query} Product {i}",
                    store_id=store_id,
                    store_name=f"Mock Store {store_id}",
                    price=10.0 + i * 5.0,
                    original_price=15.0 + i * 5.0,
                    is_clearance=i % 2 == 0,
                    is_on_sale=i % 3 == 0,
                    availability="in_stock",
                    search_query=query
                )
                for i in range(3)
            ]
        
        try:
            # Search for products
            search_results = self.search.search(query, store_id=store_id, results_per_page=100)
            
            price_records = []
            for item in search_results.results:
                # Create price record
                record = PriceRecord(
                    product_id=item.product_id,
                    product_name=item.name,
                    store_id=store_id,
                    store_name=item.store_name or "Unknown Store",
                    price=item.price,
                    original_price=item.original_price,
                    is_clearance=item.is_clearance,
                    is_on_sale=item.is_on_sale,
                    availability=item.availability,
                    search_query=query
                )
                price_records.append(record)
            
            return price_records
            
        except Exception as e:
            self.logger.error(f"Failed to search store {store_id}: {e}")
            return []
    
    def _save_results(self, monitor_id: str, results: Dict[str, Any]) -> None:
        """Save monitoring results to file."""
        timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
        filename = f"{monitor_id}_{timestamp}.json"
        filepath = self.results_dir / filename
        
        try:
            # Convert PriceRecord objects to dictionaries for JSON serialization
            serializable_results = results.copy()
            serializable_results['price_records'] = [
                record.to_dict() if hasattr(record, 'to_dict') else record
                for record in results['price_records']
            ]
            
            with open(filepath, 'w') as f:
                json.dump(serializable_results, f, indent=2)
            self.logger.debug(f"Saved results to {filepath}")
        except Exception as e:
            self.logger.error(f"Failed to save results: {e}")
    
    def _update_price_history(self, price_records: List[PriceRecord]) -> None:
        """Update price history with new records."""
        for record in price_records:
            history_key = f"{record.product_id}_{record.store_id}"
            history_file = self.history_dir / f"{history_key}.json"
            
            # Load existing history or create new
            if history_file.exists():
                try:
                    with open(history_file, 'r') as f:
                        history_data = json.load(f)
                    history = PriceHistory(
                        product_id=history_data['product_id'],
                        store_id=history_data['store_id'],
                        price_records=[]
                    )
                    # Reconstruct PriceRecord objects
                    for rec_data in history_data['price_records']:
                        rec_data['timestamp'] = datetime.fromisoformat(rec_data['timestamp'])
                        history.price_records.append(PriceRecord(**rec_data))
                except Exception as e:
                    self.logger.error(f"Failed to load history for {history_key}: {e}")
                    history = PriceHistory(record.product_id, record.store_id)
            else:
                history = PriceHistory(record.product_id, record.store_id)
            
            # Add new record
            history.add_price(record)
            
            # Save updated history
            try:
                # Use the to_dict method for proper serialization
                history_dict = history.to_dict()
                with open(history_file, 'w') as f:
                    json.dump(history_dict, f, indent=2)
            except Exception as e:
                self.logger.error(f"Failed to save history for {history_key}: {e}")
    
    def list_monitors(self) -> Dict[str, Dict[str, Any]]:
        """List all configured monitors."""
        return self.configs
    
    def delete_monitor(self, monitor_id: str) -> bool:
        """Delete a monitoring configuration."""
        if monitor_id in self.configs:
            del self.configs[monitor_id]
            self._save_configs()
            self.logger.info(f"Deleted monitor {monitor_id}")
            return True
        return False
    
    def get_price_history(
        self, 
        product_id: str, 
        store_id: str
    ) -> Optional[PriceHistory]:
        """Get price history for a specific product at a specific store."""
        history_key = f"{product_id}_{store_id}"
        history_file = self.history_dir / f"{history_key}.json"
        
        if not history_file.exists():
            return None
        
        try:
            with open(history_file, 'r') as f:
                history_data = json.load(f)
            
            history = PriceHistory(
                product_id=history_data['product_id'],
                store_id=history_data['store_id'],
                price_records=[]
            )
            
            for rec_data in history_data['price_records']:
                rec_data['timestamp'] = datetime.fromisoformat(rec_data['timestamp'])
                history.price_records.append(PriceRecord(**rec_data))
            
            return history
        except Exception as e:
            self.logger.error(f"Failed to load price history: {e}")
            return None
    
    def find_clearance_deals(
        self, 
        min_discount_percent: float = 20.0,
        max_price: Optional[float] = None
    ) -> List[Dict[str, Any]]:
        """
        Find products with significant price drops.
        
        Parameters
        ----------
        min_discount_percent : float
            Minimum discount percentage to consider
        max_price : float, optional
            Maximum price to consider
        
        Returns
        -------
        List[Dict[str, Any]]
            List of clearance deals
        """
        deals = []
        
        # Scan all history files
        for history_file in self.history_dir.glob("*.json"):
            try:
                with open(history_file, 'r') as f:
                    history_data = json.load(f)
                
                if len(history_data['price_records']) < 2:
                    continue
                
                # Calculate price change
                oldest_price = history_data['price_records'][-1]['price']
                newest_price = history_data['price_records'][0]['price']
                
                if newest_price >= oldest_price:
                    continue
                
                discount_percent = ((oldest_price - newest_price) / oldest_price) * 100
                
                if discount_percent >= min_discount_percent:
                    if max_price is None or newest_price <= max_price:
                        deal = {
                            'product_id': history_data['product_id'],
                            'store_id': history_data['store_id'],
                            'oldest_price': oldest_price,
                            'current_price': newest_price,
                            'discount_percent': discount_percent,
                            'price_drop': oldest_price - newest_price,
                            'last_updated': history_data['price_records'][0]['timestamp']
                        }
                        deals.append(deal)
            
            except Exception as e:
                self.logger.error(f"Failed to process history file {history_file}: {e}")
        
        # Sort by discount percentage (highest first)
        deals.sort(key=lambda x: x['discount_percent'], reverse=True)
        return deals
    
    def analyze_price_drops(self, min_drop_percent: float = 5.0) -> List[PriceDropAnalysis]:
        """
        Analyze price drops between monitoring runs.
        
        Parameters
        ----------
        min_drop_percent : float
            Minimum price drop percentage to include in analysis
        
        Returns
        -------
        List[PriceDropAnalysis]
            List of price drop analyses
        """
        price_drops = []
        
        # Scan all history files
        for history_file in self.history_dir.glob("*.json"):
            try:
                history = self.get_price_history(
                    history_file.stem.split('_')[0],  # product_id
                    history_file.stem.split('_')[1]   # store_id
                )
                
                if not history or len(history.price_records) < 2:
                    continue
                
                # Get the two most recent price records
                current_record = history.price_records[0]
                previous_record = history.price_records[1]
                
                # Calculate price drop
                price_drop = previous_record.price - current_record.price
                price_drop_percent = (price_drop / previous_record.price) * 100
                
                if price_drop_percent >= min_drop_percent:
                    days_since_last = (current_record.timestamp - previous_record.timestamp).days
                    
                    analysis = PriceDropAnalysis(
                        product_id=current_record.product_id,
                        product_name=current_record.product_name,
                        store_id=current_record.store_id,
                        store_name=current_record.store_name,
                        previous_price=previous_record.price,
                        current_price=current_record.price,
                        price_drop=price_drop,
                        price_drop_percent=price_drop_percent,
                        previous_timestamp=previous_record.timestamp,
                        current_timestamp=current_record.timestamp,
                        days_since_last_check=days_since_last,
                        is_clearance=current_record.is_clearance,
                        is_on_sale=current_record.is_on_sale,
                        search_query=current_record.search_query
                    )
                    price_drops.append(analysis)
            
            except Exception as e:
                self.logger.error(f"Failed to analyze price drops for {history_file}: {e}")
        
        # Sort by price drop percentage (highest first)
        price_drops.sort(key=lambda x: x.price_drop_percent, reverse=True)
        return price_drops
    
    def verify_price_with_shopnscan(
        self, 
        upc: str, 
        store_id: str,
        expected_price: Optional[float] = None
    ) -> Optional[ShopnScanPrice]:
        """
        Verify a product's price using Shop'n'Scan.
        
        Parameters
        ----------
        upc : str
            Product UPC code
        store_id : str
            Store identifier
        expected_price : float, optional
            Expected price to compare against
        
        Returns
        -------
        Optional[ShopnScanPrice]
            Shop'n'Scan price verification result
        """
        try:
            if not MEIJER_AVAILABLE:
                # Mock Shop'n'Scan verification for testing
                self.logger.warning("Using mock Shop'n'Scan verification for testing")
                
                # Generate mock data based on the test UPC you mentioned
                if upc == "713733252843" and store_id == "71":
                    return ShopnScanPrice(
                        upc=upc,
                        product_name="Mock LEGO Product (Clearance)",
                        store_id=store_id,
                        current_price=12.99,
                        sale_price=12.99,
                        original_price=24.99,
                        is_clearance=True,
                        is_on_sale=True,
                        verification_status="verified"
                    )
                else:
                    return ShopnScanPrice(
                        upc=upc,
                        product_name=f"Mock Product {upc}",
                        store_id=store_id,
                        current_price=15.99,
                        sale_price=None,
                        original_price=19.99,
                        is_clearance=False,
                        is_on_sale=False,
                        verification_status="verified"
                    )
            
            # TODO: Implement actual Shop'n'Scan integration
            # This would involve calling the Meijer API to get Shop'n'Scan data
            # For now, we'll use mock data
            self.logger.info(f"Shop'n'Scan verification not yet implemented for UPC {upc}")
            return None
            
        except Exception as e:
            self.logger.error(f"Failed to verify price with Shop'n'Scan: {e}")
            return None
    
    def get_latest_price_records(self, monitor_id: str) -> List[PriceRecord]:
        """
        Get the latest price records for a specific monitor.
        
        Parameters
        ----------
        monitor_id : str
            Monitor identifier
        
        Returns
        -------
        List[PriceRecord]
            Latest price records for the monitor
        """
        if monitor_id not in self.configs:
            return []
        
        # Find the most recent results file for this monitor
        monitor_prefix = monitor_id
        results_files = list(self.results_dir.glob(f"{monitor_prefix}_*.json"))
        
        if not results_files:
            return []
        
        # Sort by timestamp and get the most recent
        latest_file = max(results_files, key=lambda x: x.stat().st_mtime)
        
        try:
            with open(latest_file, 'r') as f:
                results_data = json.load(f)
            
            # Convert back to PriceRecord objects
            price_records = []
            for record_data in results_data['price_records']:
                record_data['timestamp'] = datetime.fromisoformat(record_data['timestamp'])
                price_records.append(PriceRecord(**record_data))
            
            return price_records
            
        except Exception as e:
            self.logger.error(f"Failed to load latest price records: {e}")
            return []
    
    def search_products_enhanced(
        self, 
        query_text: str, 
        max_results: int = 100,
        min_results: int = 5,
        stores: Optional[List[str]] = None,
        include_clearance: bool = True,
        include_out_of_stock: bool = False,
        price_min: Optional[float] = None,
        price_max: Optional[float] = None,
        progress_callback: Optional[callable] = None
    ) -> List[SearchResult]:
        """
        Enhanced product search with pagination and UPC tracking.
        
        Parameters
        ----------
        query_text : str
            Search query text
        max_results : int
            Maximum number of results to retrieve
        min_results : int
            Minimum number of results to retrieve before stopping
        stores : List[str], optional
            Specific stores to search
        include_clearance : bool
            Whether to include clearance items
        include_out_of_stock : bool
            Whether to include out-of-stock items
        price_min : float, optional
            Minimum price filter
        price_max : float, optional
            Maximum price filter
        progress_callback : callable, optional
            Callback function for progress updates
        
        Returns
        -------
        List[SearchResult]
            List of search results with UPC information
        """
        # Create search query
        search_query = SearchQuery(
            query_text=query_text,
            max_results=max_results,
            min_results=min_results,
            stores=stores,
            include_clearance=include_clearance,
            include_out_of_stock=include_out_of_stock,
            price_min=price_min,
            price_max=price_max
        )
        
        # Perform search
        results = self.search_engine.search_products(search_query, progress_callback)
        
        # Store results using dual-path storage
        storage_summary = self.storage_manager.store_search_results(
            search_query, results
        )
        
        self.logger.info(f"Enhanced search completed: {len(results)} results found and stored")
        return results
    
    def verify_prices_with_shopnscan_enhanced(
        self, 
        upcs: List[str], 
        store_id: str,
        progress_callback: Optional[callable] = None
    ) -> Dict[str, Any]:
        """
        Enhanced price verification using Shop'n'Scan with cart fallback.
        
        Parameters
        ----------
        upcs : List[str]
            List of UPC codes to verify
        store_id : str
            Store identifier
        progress_callback : callable, optional
            Callback function for progress updates
        
        Returns
        -------
        Dict[str, Any]
            Dictionary mapping UPCs to verification results
        """
        # Use enhanced search engine for verification
        verification_results = self.search_engine.verify_prices_with_shopnscan(
            upcs, store_id, progress_callback
        )
        
        # Convert verification results to ShopnScanPrice objects
        verifications = []
        for upc, result in verification_results.items():
            if result['method'] in ['shopnscan', 'cart'] and result['result']:
                # Create ShopnScanPrice object from verification result
                verification = ShopnScanPrice(
                    upc=upc,
                    product_name=result['result'].get('product_name', f'Product {upc}'),
                    store_id=store_id,
                    current_price=result['result'].get('verified_price', result['result'].get('cart_price', 0.0)),
                    sale_price=result['result'].get('sale_price'),
                    original_price=result['result'].get('original_price'),
                    is_clearance=result['result'].get('is_clearance', False),
                    is_on_sale=result['result'].get('is_on_sale', False),
                    verification_status=result['result'].get('verification_status', 'verified')
                )
                verifications.append(verification)
        
        # Store verifications using dual-path storage
        if verifications:
            storage_summary = self.storage_manager.store_shopnscan_verifications(verifications)
            self.logger.info(f"Price verifications stored: {len(verifications)} verifications")
        
        return verification_results
    
    def get_storage_statistics(self) -> Dict[str, Any]:
        """
        Get comprehensive storage statistics.
        
        Returns
        -------
        Dict[str, Any]
            Storage statistics for both JSON files and database
        """
        return self.storage_manager.get_storage_stats()
    
    def create_backup(self) -> Dict[str, Any]:
        """
        Create a backup of all data.
        
        Returns
        -------
        Dict[str, Any]
            Backup summary information
        """
        return self.storage_manager.create_backup()
    
    def export_data(
        self, 
        export_type: str, 
        filters: Optional[Dict[str, Any]] = None,
        format: str = "json"
    ) -> Dict[str, Any]:
        """
        Export data in various formats.
        
        Parameters
        ----------
        export_type : str
            Type of data to export
        filters : Dict[str, Any], optional
            Filters to apply
        format : str
            Export format
        
        Returns
        -------
        Dict[str, Any]
            Export summary information
        """
        return self.storage_manager.export_data(export_type, filters, format)
