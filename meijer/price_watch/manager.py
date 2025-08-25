"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create price watch manager for Meijer price watch system with core business logic
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: pony, datetime, decimal, logging, typing, pathlib
 */

Price Watch Manager

This module provides the core business logic for the price watch system,
including product watching, price change detection, and alert generation.
"""

import logging
import re
import time
from datetime import datetime, timedelta
from decimal import Decimal
from typing import Dict, List, Optional, Any

from pony.orm import db_session, commit

from ..models.price_watch import (
    Product, Store, PriceHistory, Watch, AlertEvent, 
    Notification, RunLog, PriceType, 
    OnlyWhenType, AlertReason, NotificationStatus
)
from .database import PriceWatchDatabase


class PriceWatchManager:
    """
    Manager for the price watch system.
    
    Handles product watching, price monitoring, change detection, and alert generation.
    """
    
    def __init__(self, db_manager: PriceWatchDatabase):
        """
        Initialize the price watch manager.
        
        Parameters
        ----------
        db_manager : PriceWatchDatabase
            Database manager instance
        """
        self.db_manager = db_manager
        self.logger = logging.getLogger(__name__)
    
    @db_session
    def add_watch(
        self,
        identifier: str,
        id_type: Optional[str] = None,
        store_id: Optional[str] = None,
        desired_price: Optional[Decimal] = None,
        only_when: str = OnlyWhenType.ANY_DROP,
        note: Optional[str] = None
    ) -> Watch:
        """
        Add a new product watch.
        
        Parameters
        ----------
        identifier : str
            Product identifier (UPC or PLU)
        id_type : str, optional
            Identifier type (UPC or PLU). If None, auto-detected.
        store_id : str, optional
            Store ID to bind the watch to. If None, applies to any store.
        desired_price : Decimal, optional
            Target price for alerts
        only_when : str
            Condition for triggering alerts
        note : str, optional
            Optional note about the watch
        
        Returns
        -------
        Watch
            Created watch instance
        
        Raises
        ------
        ValueError
            If identifier is invalid or watch already exists
        """
        # Auto-detect identifier type if not provided
        if id_type is None:
            id_type = self._detect_identifier_type(identifier)
        
        # Validate identifier
        if not self._validate_identifier(identifier, id_type):
            raise ValueError(f"Invalid {id_type} identifier: {identifier}")
        
        # Get or create product
        product = self._get_or_create_product(identifier, id_type)
        
        # Get store if specified
        store = None
        if store_id:
            store = Store.get(store_code=store_id)
            if not store:
                raise ValueError(f"Store not found: {store_id}")
        
        # Check if watch already exists
        existing_watch = Watch.get(
            product=product,
            store=store,
            active=True
        )
        
        if existing_watch:
            # Update existing watch
            existing_watch.desired_price = desired_price
            existing_watch.only_when = only_when
            existing_watch.note = note
            existing_watch.active = True
            commit()
            
            self.logger.info(f"Updated existing watch for {identifier}")
            return existing_watch
        
        # Create new watch
        watch = Watch(
            product=product,
            store=store,
            desired_price=desired_price,
            only_when=only_when,
            note=note,
            active=True
        )
        
        commit()
        
        self.logger.info(f"Created new watch for {identifier} ({id_type})")
        return watch
    
    @db_session
    def remove_watch(self, identifier: str, store_id: Optional[str] = None) -> bool:
        """
        Remove (deactivate) a product watch.
        
        Parameters
        ----------
        identifier : str
            Product identifier
        store_id : str, optional
            Store ID. If None, removes from all stores.
        
        Returns
        -------
        bool
            True if watch was removed, False otherwise
        """
        # Find product
        product = Product.get(identifier=identifier)
        if not product:
            self.logger.warning(f"Product not found: {identifier}")
            return False
        
        # Find watches
        if store_id:
            store = Store.get(store_code=store_id)
            if not store:
                self.logger.warning(f"Store not found: {store_id}")
                return False
            
            watches = Watch.select(
                lambda w: w.product == product and w.store == store and w.active
            )
        else:
            watches = Watch.select(
                lambda w: w.product == product and w.active
            )
        
        removed_count = 0
        for watch in watches:
            watch.active = False
            removed_count += 1
        
        if removed_count > 0:
            commit()
            self.logger.info(f"Removed {removed_count} watch(es) for {identifier}")
            return True
        else:
            self.logger.warning(f"No active watches found for {identifier}")
            return False
    
    @db_session
    def list_watches(
        self,
        active_only: bool = True,
        store_id: Optional[str] = None
    ) -> List[Dict[str, Any]]:
        """
        List all watches with current price information.
        
        Parameters
        ----------
        active_only : bool
            Whether to show only active watches
        store_id : str, optional
            Filter by store ID
        
        Returns
        -------
        List[Dict[str, Any]]
            List of watch information dictionaries
        """
        watches = []
        
        # Build query
        query = Watch.select()
        if active_only:
            query = query.filter(lambda w: w.active)
        if store_id:
            store = Store.get(store_code=store_id)
            if store:
                query = query.filter(lambda w: w.store == store)
        
        for watch in query:
            # Get current price information
            current_price = self._get_current_price(watch.product, watch.store)
            
            watch_info = {
                'id': watch.id,
                'identifier': watch.product.identifier,
                'id_type': watch.product.id_type,
                'product_name': watch.product.name or 'Unknown',
                'brand': watch.product.brand,
                'store_id': watch.store.store_code if watch.store else None,
                'store_name': watch.store.name if watch.store else 'Any Store',
                'desired_price': watch.desired_price,
                'only_when': watch.only_when,
                'note': watch.note,
                'created_at': watch.created_at,
                'current_price': current_price.get('price') if current_price else None,
                'current_price_type': current_price.get('price_type') if current_price else None,
                'last_observed': current_price.get('observed_at') if current_price else None
            }
            
            watches.append(watch_info)
        
        return watches
    
    @db_session
    def refresh_prices(
        self,
        store_id: Optional[str] = None,
        limit: Optional[int] = None,
        method: str = "search"
    ) -> Dict[str, Any]:
        """
        Refresh prices for watched products.
        
        Parameters
        ----------
        store_id : str, optional
            Store ID to refresh. If None, refreshes all stores.
        limit : int, optional
            Maximum number of products to refresh
        method : str
            Method to use for price fetching (search, cart, shop_scan, keywords)
        
        Returns
        -------
        Dict[str, Any]
            Summary of refresh operation
        """
        start_time = datetime.utcnow()
        
        # Log the refresh operation
        run_log = RunLog(
            command=f"refresh_prices method={method} store={store_id or 'all'}",
            started_at=start_time
        )
        
        try:
            # Get watches to refresh
            query = Watch.select(lambda w: w.active)
            if store_id:
                store = Store.get(store_code=store_id)
                if store:
                    query = query.filter(lambda w: w.store == store)
            
            if limit:
                query = query.limit(limit)
            
            watches = list(query)
            
            if not watches:
                self.logger.info("No watches to refresh")
                run_log.ok = True
                run_log.finished_at = datetime.utcnow()
                commit()
                return {'refreshed': 0, 'errors': 0, 'warnings': []}
            
            self.logger.info(f"Refreshing prices for {len(watches)} watches using {method}")
            
            refreshed_count = 0
            error_count = 0
            warnings = []
            
            # Process watches in batches to avoid overwhelming the API
            batch_size = 5
            for i in range(0, len(watches), batch_size):
                batch = watches[i:i + batch_size]
                
                for watch in batch:
                    try:
                        # Fetch current price
                        price_info = self._fetch_current_price(
                            watch.product.identifier,
                            watch.product.id_type,
                            watch.store,
                            method
                        )
                        
                        if price_info:
                            # Record price history
                            self._record_price_history(
                                watch.product,
                                watch.store or self._get_default_store(),
                                price_info,
                                method
                            )
                            refreshed_count += 1
                        else:
                            warnings.append(f"Could not fetch price for {watch.product.identifier}")
                    
                    except Exception as e:
                        error_count += 1
                        warnings.append(f"Error refreshing {watch.product.identifier}: {e}")
                        self.logger.error(f"Error refreshing {watch.product.identifier}: {e}")
                
                # Rate limiting between batches
                if i + batch_size < len(watches):
                    time.sleep(1)  # 1 second delay between batches
            
            # Update run log
            run_log.ok = error_count == 0
            run_log.finished_at = datetime.utcnow()
            if error_count > 0:
                run_log.error = f"{error_count} errors occurred during refresh"
            
            commit()
            
            self.logger.info(f"Price refresh completed: {refreshed_count} refreshed, {error_count} errors")
            
            return {
                'refreshed': refreshed_count,
                'errors': error_count,
                'warnings': warnings,
                'method': method,
                'duration': (datetime.utcnow() - start_time).total_seconds()
            }
            
        except Exception as e:
            self.logger.error(f"Price refresh failed: {e}")
            run_log.ok = False
            run_log.finished_at = datetime.utcnow()
            run_log.error = str(e)
            commit()
            raise
    
    @db_session
    def generate_alerts(self, since: Optional[datetime] = None) -> List[Dict[str, Any]]:
        """
        Generate alerts for price changes and conditions.
        
        Parameters
        ----------
        since : datetime, optional
            Only process changes since this time. If None, uses last run.
        
        Returns
        -------
        List[Dict[str, Any]]
            List of generated alerts
        """
        if since is None:
            # Get last successful run
            last_run = RunLog.select(
                lambda r: r.command.startswith("refresh_prices") and r.ok
            ).order_by(RunLog.finished_at.desc()).first()
            
            if last_run:
                since = last_run.finished_at
            else:
                # Default to 24 hours ago
                since = datetime.utcnow() - timedelta(hours=24)
        
        self.logger.info(f"Generating alerts for changes since {since}")
        
        alerts = []
        
        # Get all active watches
        watches = Watch.select(lambda w: w.active)
        
        for watch in watches:
            # Get recent price history
            recent_prices = PriceHistory.select(
                lambda ph: ph.product == watch.product and 
                          (watch.store is None or ph.store == watch.store) and
                          ph.observed_at >= since
            ).order_by(PriceHistory.observed_at.desc())
            
            if not recent_prices:
                continue
            
            # Get previous price for comparison
            previous_price = PriceHistory.select(
                lambda ph: ph.product == watch.product and 
                          (watch.store is None or ph.store == watch.store) and
                          ph.observed_at < since
            ).order_by(PriceHistory.observed_at.desc()).first()
            
            for current_price in recent_prices:
                # Check if we already have an alert for this price history
                existing_alert = AlertEvent.get(
                    watch=watch,
                    price_history=current_price
                )
                
                if existing_alert:
                    continue  # Already alerted for this change
                
                # Generate alerts based on conditions
                new_alerts = self._check_alert_conditions(
                    watch, current_price, previous_price
                )
                
                for alert_info in new_alerts:
                    # Create alert event
                    alert_event = AlertEvent(
                        watch=watch,
                        price_history=current_price,
                        reason=alert_info['reason'],
                        delta_amount=alert_info['delta_amount']
                    )
                    
                    # Create notification
                    notification = Notification(
                        alert_event=alert_event,
                        channel='email',
                        status=NotificationStatus.PENDING
                    )
                    
                    alerts.append({
                        'watch_id': watch.id,
                        'product_identifier': watch.product.identifier,
                        'product_name': watch.product.name or 'Unknown',
                        'store_name': watch.store.name if watch.store else 'Any Store',
                        'reason': alert_info['reason'],
                        'delta_amount': alert_info['delta_amount'],
                        'new_price': current_price.price,
                        'previous_price': previous_price.price if previous_price else None,
                        'price_type': current_price.price_type,
                        'observed_at': current_price.observed_at,
                        'source': current_price.source
                    })
        
        if alerts:
            commit()
            self.logger.info(f"Generated {len(alerts)} new alerts")
        else:
            self.logger.info("No new alerts generated")
        
        return alerts
    
    def _detect_identifier_type(self, identifier: str) -> str:
        """
        Auto-detect identifier type based on format.
        
        Parameters
        ----------
        identifier : str
            Product identifier
        
        Returns
        -------
        str
            Detected type (UPC or PLU)
        """
        # UPC: 12 digits
        if re.match(r'^\d{12}$', identifier):
            return 'UPC'
        
        # PLU: 4-5 digits
        if re.match(r'^\d{4,5}$', identifier):
            return 'PLU'
        
        # Default to UPC for longer numbers
        if len(identifier) >= 8:
            return 'UPC'
        else:
            return 'PLU'
    
    def _validate_identifier(self, identifier: str, id_type: str) -> bool:
        """
        Validate identifier format.
        
        Parameters
        ----------
        identifier : str
            Product identifier
        id_type : str
            Expected identifier type
        
        Returns
        -------
        bool
            True if valid, False otherwise
        """
        if id_type == 'UPC':
            return bool(re.match(r'^\d{12}$', identifier))
        elif id_type == 'PLU':
            return bool(re.match(r'^\d{4,5}$', identifier))
        else:
            return False
    
    @db_session
    def _get_or_create_product(self, identifier: str, id_type: str) -> Product:
        """
        Get existing product or create new one.
        
        Parameters
        ----------
        identifier : str
            Product identifier
        id_type : str
            Identifier type
        
        Returns
        -------
        Product
            Product instance
        """
        product = Product.get(identifier=identifier, id_type=id_type)
        
        if not product:
            product = Product(
                identifier=identifier,
                id_type=id_type,
                created_at=datetime.utcnow(),
                updated_at=datetime.utcnow()
            )
            commit()
        
        return product
    
    @db_session
    def _get_default_store(self) -> Store:
        """
        Get or create a default store for system operations.
        
        Returns
        -------
        Store
            Default store instance
        """
        # Try to get the first available store
        store = Store.select().first()
        
        if not store:
            # Create a default store
            store = Store(
                store_code='default',
                name='Default Store',
                created_at=datetime.utcnow(),
                updated_at=datetime.utcnow()
            )
            commit()
        
        return store
    
    def _get_current_price(
        self,
        product: Product,
        store: Optional[Store]
    ) -> Optional[Dict[str, Any]]:
        """
        Get the most recent price for a product at a store.
        
        Parameters
        ----------
        product : Product
            Product instance
        store : Store, optional
            Store instance. If None, gets from any store.
        
        Returns
        -------
        Dict[str, Any], optional
            Price information dictionary
        """
        with db_session:
            query = PriceHistory.select(lambda ph: ph.product == product)
            
            if store:
                query = query.filter(lambda ph: ph.store == store)
            
            latest = query.order_by(PriceHistory.observed_at.desc()).first()
            
            if latest:
                return {
                    'price': latest.price,
                    'price_type': latest.price_type,
                    'observed_at': latest.observed_at,
                    'source': latest.source
                }
        
        return None
    
    def _fetch_current_price(
        self,
        identifier: str,
        id_type: str,
        store: Optional[Store],
        method: str
    ) -> Optional[Dict[str, Any]]:
        """
        Fetch current price from Meijer API.
        
        This is a placeholder implementation. In practice, this would
        integrate with the existing Meijer client methods.
        
        Parameters
        ----------
        identifier : str
            Product identifier
        id_type : str
            Identifier type
        store : Store, optional
            Store instance
        method : str
            Method to use for price fetching
        
        Returns
        -------
        Dict[str, Any], optional
            Price information dictionary
        """
        # TODO: Integrate with existing Meijer client methods
        # For now, return mock data for testing
        
        self.logger.debug(f"Fetching price for {identifier} ({id_type}) using {method}")
        
        # Mock implementation - replace with actual API calls
        
        # Simulate API delay
        time.sleep(0.1)
        
        # Return mock price data
        return {
            'price': Decimal('9.99'),
            'price_type': PriceType.REGULAR,
            'unit_price': Decimal('0.50'),
            'regular_price': Decimal('12.99'),
            'in_stock': True,
            'source': method
        }
    
    @db_session
    def _record_price_history(
        self,
        product: Product,
        store: Store,
        price_info: Dict[str, Any],
        source: str
    ) -> PriceHistory:
        """
        Record a new price history entry.
        
        Parameters
        ----------
        product : Product
            Product instance
        store : Store
            Store instance
        price_info : Dict[str, Any]
            Price information from API
        source : str
            Source method used
        
        Returns
        -------
        PriceHistory
            Created price history entry
        """
        # Check for duplicate entry
        existing = PriceHistory.select(
            lambda ph: ph.product == product and
                      ph.store == store and
                      ph.price == price_info['price'] and
                      ph.price_type == price_info['price_type']
        ).first()
        
        if existing:
            # Update existing entry timestamp
            existing.observed_at = datetime.utcnow()
            commit()
            return existing
        
        # Create new entry
        price_history = PriceHistory(
            product=product,
            store=store,
            observed_at=datetime.utcnow(),
            price=price_info['price'],
            unit_price=price_info.get('unit_price'),
            price_type=price_info['price_type'],
            regular_price=price_info.get('regular_price'),
            in_stock=price_info.get('in_stock'),
            source=source
        )
        
        commit()
        return price_history
    
    def _check_alert_conditions(
        self,
        watch: Watch,
        current_price: PriceHistory,
        previous_price: Optional[PriceHistory]
    ) -> List[Dict[str, Any]]:
        """
        Check if alert conditions are met for a watch.
        
        Parameters
        ----------
        watch : Watch
            Watch instance
        current_price : PriceHistory
            Current price observation
        previous_price : PriceHistory, optional
            Previous price observation
        
        Returns
        -------
        List[Dict[str, Any]]
            List of alert conditions that were met
        """
        alerts = []
        
        if not previous_price:
            # First observation, no alerts
            return alerts
        
        # Check for price drops
        if current_price.price < previous_price.price:
            delta = current_price.price - previous_price.price
            
            if watch.only_when in [OnlyWhenType.ANY_DROP, OnlyWhenType.SALE_OR_CLEARANCE]:
                alerts.append({
                    'reason': AlertReason.DROP,
                    'delta_amount': delta
                })
        
        # Check for desired price
        if watch.desired_price and current_price.price <= watch.desired_price:
            delta = current_price.price - previous_price.price
            alerts.append({
                'reason': AlertReason.HIT_DESIRED_PRICE,
                'delta_amount': delta
            })
        
        # Check for sale detection
        if (current_price.price_type == PriceType.SALE and
            previous_price.price_type in [PriceType.REGULAR, PriceType.UNKNOWN]):
            
            if watch.only_when in [OnlyWhenType.SALE_OR_CLEARANCE]:
                delta = current_price.price - previous_price.price
                alerts.append({
                    'reason': AlertReason.SALE_DETECTED,
                    'delta_amount': delta
                })
        
        # Check for clearance detection
        if (current_price.price_type == PriceType.CLEARANCE and
            previous_price.price_type != PriceType.CLEARANCE):
            
            if watch.only_when in [OnlyWhenType.SALE_OR_CLEARANCE, OnlyWhenType.CLEARANCE_ONLY]:
                delta = current_price.price - previous_price.price
                alerts.append({
                    'reason': AlertReason.CLEARANCE_DETECTED,
                    'delta_amount': delta
                })
        
        return alerts
