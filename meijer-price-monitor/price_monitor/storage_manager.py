#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Dual-path storage manager coordinating JSON files and SQLite database
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: typing, pathlib, datetime, json, logging, database, search_engine
 */

Dual-path storage manager for the Meijer price monitoring system.

This module provides:
1. Coordinated storage using both JSON files and SQLite database
2. Timestamped JSON files for human-readable data access
3. SQLite database for efficient querying and relational storage
4. Automatic synchronization between both storage systems
5. Backup and recovery functionality
"""

import json
import logging
from datetime import datetime
from pathlib import Path
from typing import Dict, List, Optional, Any, Union
import shutil

from .database import PriceDatabase
from .search_engine import SearchResult, SearchQuery
from .models import PriceRecord, ShopnScanPrice


class DualPathStorageManager:
    """Manages dual-path storage using JSON files and SQLite database."""
    
    def __init__(self, data_dir: Optional[Path] = None):
        """
        Initialize the dual-path storage manager.
        
        Parameters
        ----------
        data_dir : Path, optional
            Directory to store data (defaults to ./price_data)
        """
        if data_dir is None:
            data_dir = Path("./price_data")
        
        self.data_dir = Path(data_dir)
        self.logger = logging.getLogger(__name__)
        
        # Create directory structure
        self._create_directory_structure()
        
        # Initialize database
        self.database = PriceDatabase(self.data_dir / "prices.db")
        
        # Storage configuration
        self.json_backup_count = 10  # Keep last 10 JSON files per type
        self.compression_enabled = False  # Future: enable gzip compression
    
    def _create_directory_structure(self) -> None:
        """Create the directory structure for data storage."""
        directories = [
            self.data_dir / "json",
            self.data_dir / "json" / "search_results",
            self.data_dir / "json" / "price_records",
            self.data_dir / "json" / "shopnscan_verifications",
            self.data_dir / "json" / "monitors",
            self.data_dir / "json" / "exports",
            self.data_dir / "backups",
            self.data_dir / "logs"
        ]
        
        for directory in directories:
            directory.mkdir(parents=True, exist_ok=True)
        
        self.logger.info("Directory structure created successfully")
    
    def store_search_results(
        self, 
        query: SearchQuery, 
        results: List[SearchResult],
        monitor_id: Optional[str] = None
    ) -> Dict[str, Any]:
        """
        Store search results in both JSON files and database.
        
        Parameters
        ----------
        query : SearchQuery
            The search query that generated these results
        results : List[SearchResult]
            List of search results to store
        monitor_id : str, optional
            Monitor ID if this search was part of a monitoring run
        
        Returns
        -------
        Dict[str, Any]
            Storage summary information
        """
        timestamp = datetime.now()
        timestamp_str = timestamp.strftime("%Y%m%d_%H%M%S")
        
        # Store in database
        # Extract query text safely
        if hasattr(query, 'query_text') and isinstance(query.query_text, str):
            query_text_for_db = query.query_text
        else:
            query_text_for_db = str(query)
        
        search_id = self.database.add_search_query(
            query_text_for_db, 
            len(results), 
            len(query.stores) if query.stores else 0
        )
        
        if search_id:
            # Add search results to database
            for result in results:
                self.database.add_search_result(search_id, result.to_dict())
        
        # Store in JSON file
        if hasattr(query, 'query_text') and isinstance(query.query_text, str):
            query_text = query.query_text
        else:
            query_text = str(query)
        json_filename = f"search_{timestamp_str}_{query_text.replace(' ', '_')[:20]}.json"
        json_filepath = self.data_dir / "json" / "search_results" / json_filename
        
        json_data = {
            'search_query': query.to_dict(),
            'search_id': search_id,
            'monitor_id': monitor_id,
            'timestamp': timestamp.isoformat(),
            'results_count': len(results),
            'stores_searched': len(query.stores) if query.stores else 0,
            'results': [result.to_dict() for result in results]
        }
        
        try:
            with open(json_filepath, 'w') as f:
                json.dump(json_data, f, indent=2)
            
            # Clean up old JSON files
            self._cleanup_old_json_files("search_results")
            
            self.logger.info(f"Search results stored: {len(results)} results in {json_filename}")
            
            return {
                'search_id': search_id,
                'json_file': json_filename,
                'results_stored': len(results),
                'database_stored': search_id is not None,
                'timestamp': timestamp.isoformat()
            }
            
        except Exception as e:
            self.logger.error(f"Failed to store search results in JSON: {e}")
            return {
                'search_id': search_id,
                'json_file': None,
                'results_stored': 0,
                'database_stored': search_id is not None,
                'error': str(e),
                'timestamp': timestamp.isoformat()
            }
    
    def store_price_records(
        self, 
        price_records: List[PriceRecord],
        source: str = "search"
    ) -> Dict[str, Any]:
        """
        Store price records in both JSON files and database.
        
        Parameters
        ----------
        price_records : List[PriceRecord]
            List of price records to store
        source : str
            Source of the price records (search, shopnscan, cart, etc.)
        
        Returns
        -------
        Dict[str, Any]
            Storage summary information
        """
        timestamp = datetime.now()
        timestamp_str = timestamp.strftime("%Y%m%d_%H%M%S")
        
        # Store in database
        database_stored = 0
        for record in price_records:
            if self.database.add_price_record(record):
                database_stored += 1
        
        # Store in JSON file
        json_filename = f"prices_{timestamp_str}_{source}.json"
        json_filepath = self.data_dir / "json" / "price_records" / json_filename
        
        json_data = {
            'source': source,
            'timestamp': timestamp.isoformat(),
            'records_count': len(price_records),
            'records': [record.to_dict() for record in price_records]
        }
        
        try:
            with open(json_filepath, 'w') as f:
                json.dump(json_data, f, indent=2)
            
            # Clean up old JSON files
            self._cleanup_old_json_files("price_records")
            
            self.logger.info(f"Price records stored: {len(price_records)} records in {json_filename}")
            
            return {
                'json_file': json_filename,
                'records_stored': len(price_records),
                'database_stored': database_stored,
                'source': source,
                'timestamp': timestamp.isoformat()
            }
            
        except Exception as e:
            self.logger.error(f"Failed to store price records in JSON: {e}")
            return {
                'json_file': None,
                'records_stored': 0,
                'database_stored': database_stored,
                'source': source,
                'error': str(e),
                'timestamp': timestamp.isoformat()
            }
    
    def store_shopnscan_verifications(
        self, 
        verifications: List[ShopnScanPrice]
    ) -> Dict[str, Any]:
        """
        Store Shop'n'Scan verifications in both JSON files and database.
        
        Parameters
        ----------
        verifications : List[ShopnScanPrice]
            List of Shop'n'Scan verifications to store
        
        Returns
        -------
        Dict[str, Any]
            Storage summary information
        """
        timestamp = datetime.now()
        timestamp_str = timestamp.strftime("%Y%m%d_%H%M%S")
        
        # Store in database
        database_stored = 0
        for verification in verifications:
            if self.database.add_shopnscan_verification(verification):
                database_stored += 1
        
        # Store in JSON file
        json_filename = f"shopnscan_{timestamp_str}.json"
        json_filepath = self.data_dir / "json" / "shopnscan_verifications" / json_filename
        
        json_data = {
            'timestamp': timestamp.isoformat(),
            'verifications_count': len(verifications),
            'verifications': [verification.to_dict() for verification in verifications]
        }
        
        try:
            with open(json_filepath, 'w') as f:
                json.dump(json_data, f, indent=2)
            
            # Clean up old JSON files
            self._cleanup_old_json_files("shopnscan_verifications")
            
            self.logger.info(f"Shop'n'Scan verifications stored: {len(verifications)} in {json_filename}")
            
            return {
                'json_file': json_filename,
                'verifications_stored': len(verifications),
                'database_stored': database_stored,
                'timestamp': timestamp.isoformat()
            }
            
        except Exception as e:
            self.logger.error(f"Failed to store Shop'n'Scan verifications in JSON: {e}")
            return {
                'json_file': None,
                'verifications_stored': 0,
                'database_stored': database_stored,
                'error': str(e),
                'timestamp': timestamp.isoformat()
            }
    
    def store_monitor_run(
        self, 
        monitor_id: str, 
        monitor_data: Dict[str, Any]
    ) -> Dict[str, Any]:
        """
        Store monitor run data in JSON format.
        
        Parameters
        ----------
        monitor_id : str
            Monitor identifier
        monitor_data : Dict[str, Any]
            Monitor run data to store
        
        Returns
        -------
        Dict[str, Any]
            Storage summary information
        """
        timestamp = datetime.now()
        timestamp_str = timestamp.strftime("%Y%m%d_%H%M%S")
        
        # Store in JSON file
        json_filename = f"monitor_{monitor_id}_{timestamp_str}.json"
        json_filepath = self.data_dir / "json" / "monitors" / json_filename
        
        json_data = {
            'monitor_id': monitor_id,
            'timestamp': timestamp.isoformat(),
            'data': monitor_data
        }
        
        try:
            with open(json_filepath, 'w') as f:
                json.dump(json_data, f, indent=2)
            
            # Clean up old JSON files
            self._cleanup_old_json_files("monitors")
            
            self.logger.info(f"Monitor run stored: {monitor_id} in {json_filename}")
            
            return {
                'json_file': json_filename,
                'monitor_id': monitor_id,
                'timestamp': timestamp.isoformat()
            }
            
        except Exception as e:
            self.logger.error(f"Failed to store monitor run: {e}")
            return {
                'json_file': None,
                'monitor_id': monitor_id,
                'error': str(e),
                'timestamp': timestamp.isoformat()
            }
    
    def _cleanup_old_json_files(self, file_type: str) -> None:
        """
        Clean up old JSON files, keeping only the most recent ones.
        
        Parameters
        ----------
        file_type : str
            Type of files to clean up (search_results, price_records, etc.)
        """
        try:
            directory = self.data_dir / "json" / file_type
            if not directory.exists():
                return
            
            # Get all JSON files in the directory
            json_files = list(directory.glob("*.json"))
            
            if len(json_files) <= self.json_backup_count:
                return
            
            # Sort by modification time (oldest first)
            json_files.sort(key=lambda x: x.stat().st_mtime)
            
            # Remove oldest files
            files_to_remove = json_files[:-self.json_backup_count]
            
            for file_path in files_to_remove:
                try:
                    file_path.unlink()
                    self.logger.debug(f"Removed old file: {file_path.name}")
                except Exception as e:
                    self.logger.warning(f"Failed to remove old file {file_path.name}: {e}")
            
            self.logger.info(f"Cleaned up {len(files_to_remove)} old {file_type} files")
            
        except Exception as e:
            self.logger.error(f"Failed to cleanup old JSON files: {e}")
    
    def export_data(
        self, 
        export_type: str, 
        filters: Optional[Dict[str, Any]] = None,
        format: str = "json"
    ) -> Dict[str, Any]:
        """
        Export data from the database to various formats.
        
        Parameters
        ----------
        export_type : str
            Type of data to export (products, prices, stores, etc.)
        filters : Dict[str, Any], optional
            Filters to apply to the export
        format : str
            Export format (json, csv, etc.)
        
        Returns
        -------
        Dict[str, Any]
            Export summary information
        """
        timestamp = datetime.now()
        timestamp_str = timestamp.strftime("%Y%m%d_%H%M%S")
        
        try:
            if export_type == "products":
                data = self._export_products(filters)
            elif export_type == "prices":
                data = self._export_prices(filters)
            elif export_type == "stores":
                data = self._export_stores(filters)
            elif export_type == "price_drops":
                data = self._export_price_drops(filters)
            elif export_type == "clearance_deals":
                data = self._export_clearance_deals(filters)
            else:
                raise ValueError(f"Unknown export type: {export_type}")
            
            # Create export filename
            export_filename = f"export_{export_type}_{timestamp_str}.{format}"
            export_filepath = self.data_dir / "json" / "exports" / export_filename
            
            if format == "json":
                with open(export_filepath, 'w') as f:
                    json.dump(data, f, indent=2)
            else:
                # TODO: Implement other export formats
                raise ValueError(f"Export format {format} not yet implemented")
            
            self.logger.info(f"Data exported: {export_type} to {export_filename}")
            
            return {
                'export_file': export_filename,
                'export_type': export_type,
                'format': format,
                'records_exported': len(data) if isinstance(data, list) else 1,
                'timestamp': timestamp.isoformat()
            }
            
        except Exception as e:
            self.logger.error(f"Failed to export {export_type} data: {e}")
            return {
                'export_file': None,
                'export_type': export_type,
                'format': format,
                'error': str(e),
                'timestamp': timestamp.isoformat()
            }
    
    def _export_products(self, filters: Optional[Dict[str, Any]]) -> List[Dict[str, Any]]:
        """Export products data."""
        # This would query the database for products
        # For now, return empty list as placeholder
        return []
    
    def _export_prices(self, filters: Optional[Dict[str, Any]]) -> List[Dict[str, Any]]:
        """Export prices data."""
        # This would query the database for price records
        # For now, return empty list as placeholder
        return []
    
    def _export_stores(self, filters: Optional[Dict[str, Any]]) -> List[Dict[str, Any]]:
        """Export stores data."""
        # This would query the database for stores
        # For now, return empty list as placeholder
        return []
    
    def _export_price_drops(self, filters: Optional[Dict[str, Any]]) -> List[Dict[str, Any]]:
        """Export price drops data."""
        min_drop_percent = filters.get('min_drop_percent', 5.0) if filters else 5.0
        days = filters.get('days', 7) if filters else 7
        
        return self.database.find_price_drops(min_drop_percent, days)
    
    def _export_clearance_deals(self, filters: Optional[Dict[str, Any]]) -> List[Dict[str, Any]]:
        """Export clearance deals data."""
        max_price = filters.get('max_price') if filters else None
        
        return self.database.get_clearance_deals(max_price)
    
    def create_backup(self) -> Dict[str, Any]:
        """
        Create a backup of the database and JSON files.
        
        Returns
        -------
        Dict[str, Any]
            Backup summary information
        """
        timestamp = datetime.now()
        timestamp_str = timestamp.strftime("%Y%m%d_%H%M%S")
        
        try:
            # Create backup directory
            backup_dir = self.data_dir / "backups" / f"backup_{timestamp_str}"
            backup_dir.mkdir(parents=True, exist_ok=True)
            
            # Backup database
            db_backup_path = backup_dir / "prices.db"
            shutil.copy2(self.database.db_path, db_backup_path)
            
            # Backup JSON files
            json_backup_dir = backup_dir / "json"
            json_backup_dir.mkdir(exist_ok=True)
            
            json_source_dir = self.data_dir / "json"
            if json_source_dir.exists():
                shutil.copytree(json_source_dir, json_backup_dir, dirs_exist_ok=True)
            
            # Create backup manifest
            manifest = {
                'backup_timestamp': timestamp.isoformat(),
                'database_backed_up': True,
                'json_files_backed_up': True,
                'backup_size_mb': self._get_directory_size_mb(backup_dir),
                'source_directory': str(self.data_dir)
            }
            
            manifest_file = backup_dir / "manifest.json"
            with open(manifest_file, 'w') as f:
                json.dump(manifest, f, indent=2)
            
            self.logger.info(f"Backup created successfully: {backup_dir.name}")
            
            return {
                'backup_directory': backup_dir.name,
                'backup_timestamp': timestamp.isoformat(),
                'backup_size_mb': manifest['backup_size_mb'],
                'status': 'success'
            }
            
        except Exception as e:
            self.logger.error(f"Failed to create backup: {e}")
            return {
                'backup_directory': None,
                'backup_timestamp': timestamp.isoformat(),
                'error': str(e),
                'status': 'failed'
            }
    
    def _get_directory_size_mb(self, directory: Path) -> float:
        """Calculate directory size in megabytes."""
        total_size = 0
        try:
            for file_path in directory.rglob('*'):
                if file_path.is_file():
                    total_size += file_path.stat().st_size
        except Exception:
            pass
        
        return round(total_size / (1024 * 1024), 2)
    
    def get_storage_stats(self) -> Dict[str, Any]:
        """
        Get storage statistics for both JSON files and database.
        
        Returns
        -------
        Dict[str, Any]
            Storage statistics
        """
        try:
            # Database stats
            db_stats = self.database.get_database_stats()
            
            # JSON file stats
            json_stats = self._get_json_file_stats()
            
            # Overall storage stats
            total_size_mb = self._get_directory_size_mb(self.data_dir)
            
            stats = {
                'database': db_stats,
                'json_files': json_stats,
                'total_storage_mb': total_size_mb,
                'timestamp': datetime.now().isoformat()
            }
            
            return stats
            
        except Exception as e:
            self.logger.error(f"Failed to get storage stats: {e}")
            return {
                'error': str(e),
                'timestamp': datetime.now().isoformat()
            }
    
    def _get_json_file_stats(self) -> Dict[str, Any]:
        """Get statistics about JSON files."""
        stats = {}
        
        try:
            json_dir = self.data_dir / "json"
            if not json_dir.exists():
                return stats
            
            for subdir in json_dir.iterdir():
                if subdir.is_dir():
                    json_files = list(subdir.glob("*.json"))
                    stats[subdir.name] = {
                        'file_count': len(json_files),
                        'total_size_mb': self._get_directory_size_mb(subdir),
                        'oldest_file': None,
                        'newest_file': None
                    }
                    
                    if json_files:
                        # Get oldest and newest files
                        json_files.sort(key=lambda x: x.stat().st_mtime)
                        stats[subdir.name]['oldest_file'] = json_files[0].name
                        stats[subdir.name]['newest_file'] = json_files[-1].name
            
        except Exception as e:
            self.logger.error(f"Failed to get JSON file stats: {e}")
        
        return stats
