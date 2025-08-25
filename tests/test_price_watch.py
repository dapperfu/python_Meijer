"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create tests for Meijer price watch system
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: pytest, unittest.mock, tempfile, pathlib
 */

Tests for Price Watch System

This module contains tests for the price watch functionality.
"""

import pytest
import tempfile
import os
from pathlib import Path
from unittest.mock import Mock, patch
from decimal import Decimal

from meijer.price_watch.database import PriceWatchDatabase
from meijer.price_watch.manager import PriceWatchManager
from meijer.price_watch.email_config import EmailConfig, EmailSender


class TestPriceWatchDatabase:
    """Test database functionality."""
    
    def test_database_initialization(self):
        """Test database initialization with temporary file."""
        with tempfile.NamedTemporaryFile(suffix='.db', delete=False) as tmp:
            db_path = tmp.name
        
        try:
            # Initialize database
            db_manager = PriceWatchDatabase(db_path)
            
            # Check that database file was created
            assert Path(db_path).exists()
            
            # Check that database can be accessed
            db = db_manager.get_db()
            assert db is not None
            
            # Clean up
            db_manager.close()
            
        finally:
            # Clean up temporary file
            if os.path.exists(db_path):
                os.unlink(db_path)
    
    def test_default_db_path(self):
        """Test default database path generation."""
        db_manager = PriceWatchDatabase()
        
        # Check that path is reasonable
        db_path = db_manager.db_path
        assert 'meijer' in str(db_path)
        assert db_path.suffix == '.db'
        
        # Clean up
        db_manager.close()


class TestPriceWatchManager:
    """Test price watch manager functionality."""
    
    def setup_method(self):
        """Set up test fixtures."""
        # Create temporary database
        self.tmp_dir = tempfile.mkdtemp()
        self.db_path = Path(self.tmp_dir) / "test_prices.db"
        
        self.db_manager = PriceWatchDatabase(str(self.db_path))
        self.manager = PriceWatchManager(self.db_manager)
    
    def teardown_method(self):
        """Clean up test fixtures."""
        self.db_manager.close()
        
        # Remove temporary files
        if self.db_path.exists():
            self.db_path.unlink()
        if self.tmp_dir and os.path.exists(self.tmp_dir):
            os.rmdir(self.tmp_dir)
    
    def test_add_watch(self):
        """Test adding a new watch."""
        # Add a watch
        watch = self.manager.add_watch(
            identifier="012345678905",
            id_type="UPC",
            note="Test watch"
        )
        
        # Check that watch was created
        assert watch is not None
        assert watch.product.identifier == "012345678905"
        assert watch.product.id_type == "UPC"
        assert watch.note == "Test watch"
        assert watch.active is True
    
    def test_add_watch_auto_detect_type(self):
        """Test automatic identifier type detection."""
        # Add UPC watch
        upc_watch = self.manager.add_watch(identifier="012345678905")
        assert upc_watch.product.id_type == "UPC"
        
        # Add PLU watch
        plu_watch = self.manager.add_watch(identifier="4011")
        assert plu_watch.product.id_type == "PLU"
    
    def test_remove_watch(self):
        """Test removing a watch."""
        # Add a watch first
        watch = self.manager.add_watch(identifier="012345678905")
        
        # Remove it
        removed = self.manager.remove_watch("012345678905")
        assert removed is True
        
        # Check that it's no longer active
        watches = self.manager.list_watches(active_only=True)
        assert len(watches) == 0
    
    def test_list_watches(self):
        """Test listing watches."""
        # Add a few watches
        self.manager.add_watch(identifier="012345678905", note="Watch 1")
        self.manager.add_watch(identifier="4011", note="Watch 2")
        
        # List all watches
        watches = self.manager.list_watches()
        assert len(watches) == 2
        
        # Check watch details
        watch1 = next(w for w in watches if w['identifier'] == "012345678905")
        assert watch1['note'] == "Watch 1"
        assert watch1['id_type'] == "UPC"
        
        watch2 = next(w for w in watches if w['identifier'] == "4011")
        assert watch2['note'] == "Watch 2"
        assert watch2['id_type'] == "PLU"
    
    def test_validate_identifier(self):
        """Test identifier validation."""
        # Valid UPC
        assert self.manager._validate_identifier("012345678905", "UPC") is True
        
        # Invalid UPC (wrong length)
        assert self.manager._validate_identifier("12345", "UPC") is False
        
        # Valid PLU
        assert self.manager._validate_identifier("4011", "PLU") is True
        
        # Invalid PLU (too short)
        assert self.manager._validate_identifier("123", "PLU") is False


class TestEmailConfig:
    """Test email configuration functionality."""
    
    def setup_method(self):
        """Set up test fixtures."""
        self.tmp_dir = tempfile.mkdtemp()
        self.config_path = Path(self.tmp_dir) / "test_email.toml"
    
    def teardown_method(self):
        """Clean up test fixtures."""
        if self.config_path.exists():
            self.config_path.unlink()
        if self.tmp_dir and os.path.exists(self.tmp_dir):
            os.rmdir(self.tmp_dir)
    
    def test_create_template(self):
        """Test email configuration template creation."""
        config = EmailConfig(str(self.config_path))
        config.create_template()
        
        # Check that file was created
        assert self.config_path.exists()
        
        # Check file permissions (should be 0600)
        stat = self.config_path.stat()
        assert oct(stat.st_mode)[-3:] == '600'
    
    def test_validate_config(self):
        """Test configuration validation."""
        config = EmailConfig(str(self.config_path))
        
        # Empty config should be invalid
        assert config.validate_config() is False
        
        # Create valid config
        config.config = {
            'smtp': {
                'host': 'smtp.gmail.com',
                'port': 587,
                'username': 'test@example.com',
                'password': 'password',
                'from': 'test@example.com',
                'to': 'test@example.com'
            }
        }
        
        # Valid config should pass validation
        assert config.validate_config() is True


class TestEmailSender:
    """Test email sender functionality."""
    
    def setup_method(self):
        """Set up test fixtures."""
        self.tmp_dir = tempfile.mkdtemp()
        self.config_path = Path(self.tmp_dir) / "test_email.toml"
        
        # Create valid config
        self.config = EmailConfig(str(self.config_path))
        self.config.config = {
            'smtp': {
                'host': 'smtp.gmail.com',
                'port': 587,
                'username': 'test@example.com',
                'password': 'password',
                'from': 'test@example.com',
                'to': 'test@example.com'
            }
        }
        
        self.sender = EmailSender(self.config)
    
    def teardown_method(self):
        """Clean up test fixtures."""
        if self.config_path.exists():
            self.config_path.unlink()
        if self.tmp_dir and os.path.exists(self.tmp_dir):
            os.rmdir(self.tmp_dir)
    
    @patch('smtplib.SMTP')
    def test_send_price_alert(self, mock_smtp):
        """Test sending a price alert email."""
        # Mock SMTP server
        mock_server = Mock()
        mock_smtp.return_value = mock_server
        
        # Send email
        message_id = self.sender.send_price_alert(
            to_email="recipient@example.com",
            subject="Test Alert",
            body="<p>Test body</p>"
        )
        
        # Check that SMTP was called
        mock_smtp.assert_called_once_with('smtp.gmail.com', 587)
        mock_server.starttls.assert_called_once()
        mock_server.login.assert_called_once_with('test@example.com', 'password')
        mock_server.sendmail.assert_called_once()
        mock_server.quit.assert_called_once()
        
        # Should return a message ID
        assert message_id is not None
    
    def test_send_consolidated_alerts(self):
        """Test sending consolidated alerts."""
        alerts = [
            {
                'product_name': 'Test Product',
                'new_price': Decimal('9.99'),
                'delta_amount': Decimal('-1.00'),
                'reason': 'drop',
                'price_type': 'sale',
                'observed_at': '2025-01-01 12:00:00',
                'source': 'search'
            }
        ]
        
        with patch.object(self.sender, 'send_price_alert') as mock_send:
            mock_send.return_value = "test-message-id"
            
            message_id = self.sender.send_consolidated_alerts(alerts)
            
            # Should call send_price_alert
            mock_send.assert_called_once()
            
            # Should return message ID
            assert message_id == "test-message-id"


if __name__ == "__main__":
    pytest.main([__file__])
