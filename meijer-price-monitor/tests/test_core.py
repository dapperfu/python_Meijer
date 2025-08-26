#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Basic tests for core price monitoring functionality
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: pytest, price_monitor package
 */

Basic tests for the core price monitoring functionality.
"""

import pytest
import tempfile
from pathlib import Path
from datetime import datetime

from price_monitor.core import PriceMonitor, PriceRecord, PriceHistory


class TestPriceRecord:
    """Test PriceRecord dataclass."""

    def test_price_record_creation(self):
        """Test creating a PriceRecord."""
        record = PriceRecord(
            product_id="test_product",
            product_name="Test Product",
            store_id="test_store",
            store_name="Test Store",
            price=10.99,
        )

        assert record.product_id == "test_product"
        assert record.product_name == "Test Product"
        assert record.store_id == "test_store"
        assert record.store_name == "Test Store"
        assert record.price == 10.99
        assert record.timestamp is not None

    def test_price_record_to_dict(self):
        """Test converting PriceRecord to dictionary."""
        record = PriceRecord(
            product_id="test_product",
            product_name="Test Product",
            store_id="test_store",
            store_name="Test Store",
            price=10.99,
        )

        data = record.to_dict()
        assert data["product_id"] == "test_product"
        assert data["price"] == 10.99
        assert "timestamp" in data


class TestPriceHistory:
    """Test PriceHistory class."""

    def test_price_history_creation(self):
        """Test creating a PriceHistory."""
        history = PriceHistory(product_id="test_product", store_id="test_store")

        assert history.product_id == "test_product"
        assert history.store_id == "test_store"
        assert len(history.price_records) == 0

    def test_add_price_record(self):
        """Test adding a price record to history."""
        history = PriceHistory("test_product", "test_store")
        record = PriceRecord(
            product_id="test_product",
            product_name="Test Product",
            store_id="test_store",
            store_name="Test Store",
            price=10.99,
        )

        history.add_price(record)
        assert len(history.price_records) == 1
        assert history.price_records[0] == record

    def test_get_latest_price(self):
        """Test getting the latest price record."""
        history = PriceHistory("test_product", "test_store")

        # Add two records with different timestamps
        record1 = PriceRecord(
            product_id="test_product",
            product_name="Test Product",
            store_id="test_store",
            store_name="Test Store",
            price=10.99,
            timestamp=datetime(2024, 1, 1, 12, 0, 0),
        )
        record2 = PriceRecord(
            product_id="test_product",
            product_name="Test Product",
            store_id="test_store",
            store_name="Test Store",
            price=9.99,
            timestamp=datetime(2024, 1, 2, 12, 0, 0),
        )

        history.add_price(record1)
        history.add_price(record2)

        latest = history.get_latest_price()
        assert latest == record2  # Should be the most recent
        assert latest.price == 9.99


class TestPriceMonitor:
    """Test PriceMonitor class."""

    @pytest.fixture
    def temp_data_dir(self):
        """Create a temporary directory for test data."""
        with tempfile.TemporaryDirectory() as temp_dir:
            yield Path(temp_dir)

    def test_price_monitor_creation(self, temp_data_dir):
        """Test creating a PriceMonitor."""
        monitor = PriceMonitor(data_dir=temp_data_dir)

        assert monitor.data_dir == temp_data_dir
        assert monitor.results_dir == temp_data_dir / "results"
        assert monitor.history_dir == temp_data_dir / "history"
        assert monitor.config_dir == temp_data_dir / "config"

        # Check that directories were created
        assert monitor.results_dir.exists()
        assert monitor.history_dir.exists()
        assert monitor.config_dir.exists()

    def test_create_monitor(self, temp_data_dir):
        """Test creating a monitoring configuration."""
        monitor = PriceMonitor(data_dir=temp_data_dir)

        monitor_id = monitor.create_monitor(
            name="Test Monitor", search_query="LEGO", location="46755", radius=50
        )

        assert monitor_id is not None
        assert monitor_id in monitor.configs

        config = monitor.configs[monitor_id]
        assert config["name"] == "Test Monitor"
        assert config["search_query"] == "LEGO"
        assert config["location"] == "46755"
        assert config["radius"] == 50

    def test_list_monitors(self, temp_data_dir):
        """Test listing configured monitors."""
        monitor = PriceMonitor(data_dir=temp_data_dir)

        # Initially no monitors
        monitors = monitor.list_monitors()
        assert len(monitors) == 0

        # Create a monitor
        monitor_id = monitor.create_monitor(
            name="Test Monitor", search_query="LEGO", location="46755", radius=50
        )

        # Now should have one monitor
        monitors = monitor.list_monitors()
        assert len(monitors) == 1
        assert monitor_id in monitors

    def test_delete_monitor(self, temp_data_dir):
        """Test deleting a monitor."""
        monitor = PriceMonitor(data_dir=temp_data_dir)

        # Create a monitor
        monitor_id = monitor.create_monitor(
            name="Test Monitor", search_query="LEGO", location="46755", radius=50
        )

        # Verify it exists
        assert monitor_id in monitor.configs

        # Delete it
        result = monitor.delete_monitor(monitor_id)
        assert result is True

        # Verify it's gone
        assert monitor_id not in monitor.configs


if __name__ == "__main__":
    pytest.main([__file__])
