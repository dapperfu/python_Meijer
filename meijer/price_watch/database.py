"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create database manager for Meijer price watch system with PonyORM
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: pony, pathlib, os, logging, typing
 */

Database Manager for Price Watch System

This module provides database initialization, migration, and connection management
for the Meijer price watch system using PonyORM.
"""

import logging
import os
from pathlib import Path
from typing import Optional

from pony.orm import Database, db_session, commit, rollback

from ..models.price_watch import (
    Product, Store, PriceHistory, Watch, AlertEvent, 
    Notification, RunLog, SchemaVersion
)


class PriceWatchDatabase:
    """
    Database manager for the price watch system.
    
    Handles database initialization, migration, and connection management.
    """
    
    def __init__(self, db_path: Optional[str] = None):
        """
        Initialize the database manager.
        
        Parameters
        ----------
        db_path : str, optional
            Path to the SQLite database file. If None, uses default location.
        """
        self.logger = logging.getLogger(__name__)
        
        if db_path is None:
            db_path = self._get_default_db_path()
        
        self.db_path = Path(db_path)
        self.db = Database()
        
        # Ensure directory exists
        self.db_path.parent.mkdir(parents=True, exist_ok=True)
        
        # Bind entities to database
        self._bind_entities()
        
        # Initialize database if needed
        self._init_database()
    
    def _get_default_db_path(self) -> str:
        """
        Get the default database path based on XDG standards.
        
        Returns
        -------
        str
            Default database path
        """
        # Check for XDG_DATA_HOME environment variable
        xdg_data_home = os.environ.get('XDG_DATA_HOME')
        if xdg_data_home:
            data_dir = Path(xdg_data_home)
        else:
            # Default to ~/.local/share
            data_dir = Path.home() / ".local" / "share"
        
        return str(data_dir / "meijer" / "prices.db")
    
    def _bind_entities(self) -> None:
        """Bind all entity classes to the database."""
        self.db.bind(
            provider='sqlite',
            filename=str(self.db_path),
            create_db=True
        )
        
        # Generate mapping
        self.db.generate_mapping(create_tables=True)
    
    def _init_database(self) -> None:
        """Initialize the database with schema version tracking."""
        try:
            with db_session:
                # Check if schema version table exists and has content
                schema_version = SchemaVersion.select().first()
                
                if schema_version is None:
                    # First time setup
                    self.logger.info("Initializing price watch database...")
                    
                    # Create initial schema version
                    SchemaVersion(
                        version=1,
                        description="Initial schema for price watch system"
                    )
                    
                    # Set proper file permissions (0600)
                    self._set_db_permissions()
                    
                    commit()
                    self.logger.info("Database initialized successfully")
                else:
                    self.logger.debug(f"Database already initialized (version {schema_version.version})")
                    
        except Exception as e:
            self.logger.error(f"Failed to initialize database: {e}")
            rollback()
            raise
    
    def _set_db_permissions(self) -> None:
        """Set secure file permissions on the database file."""
        try:
            # Set 0600 permissions (owner read/write only)
            os.chmod(self.db_path, 0o600)
            self.logger.debug(f"Set database permissions to 0600: {self.db_path}")
        except Exception as e:
            self.logger.warning(f"Could not set database permissions: {e}")
    
    def get_db(self) -> Database:
        """
        Get the database instance.
        
        Returns
        -------
        Database
            PonyORM database instance
        """
        return self.db
    
    def close(self) -> None:
        """Close the database connection."""
        if hasattr(self.db, 'disconnect'):
            self.db.disconnect()
    
    def __enter__(self):
        """Context manager entry."""
        return self
    
    def __exit__(self, exc_type, exc_val, exc_tb):
        """Context manager exit."""
        self.close()


def get_price_watch_db(db_path: Optional[str] = None) -> PriceWatchDatabase:
    """
    Get a price watch database instance.
    
    Parameters
    ----------
    db_path : str, optional
        Path to the database file. If None, uses default location.
    
    Returns
    -------
    PriceWatchDatabase
        Database manager instance
    """
    return PriceWatchDatabase(db_path)


def ensure_database_exists(db_path: Optional[str] = None) -> PriceWatchDatabase:
    """
    Ensure the price watch database exists and is properly initialized.
    
    Parameters
    ----------
    db_path : str, optional
        Path to the database file. If None, uses default location.
    
    Returns
    -------
    PriceWatchDatabase
        Database manager instance
    
    Raises
    ------
    Exception
        If database initialization fails
    """
    try:
        db_manager = get_price_watch_db(db_path)
        return db_manager
    except Exception as e:
        logging.error(f"Failed to initialize price watch database: {e}")
        raise
