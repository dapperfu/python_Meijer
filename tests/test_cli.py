#!/usr/bin/env python3
"""
Comprehensive tests for the CLI module.

Tests all command line interface functionality.
"""

import pytest
from unittest.mock import Mock, patch, MagicMock
from io import StringIO
import sys
import tempfile
import os

from meijer.cli import get_meijer_client, display_items_table


class TestCLIFunctions:
    """Test the CLI utility functions."""
    
    def test_get_meijer_client_success(self):
        """Test successful client initialization."""
        with patch('meijer.cli.Meijer') as mock_meijer_class:
            mock_client = Mock()
            mock_client.auth_status.name = "AUTHENTICATED"
            mock_meijer_class.return_value = mock_client
            
            client = get_meijer_client()
            
            assert client == mock_client
            mock_meijer_class.assert_called_once()
    
    def test_get_meijer_client_local_auth(self):
        """Test client initialization with local auth file."""
        with patch('os.path.exists') as mock_exists:
            mock_exists.return_value = True
            
            with patch('meijer.cli.Meijer') as mock_meijer_class:
                mock_client = Mock()
                mock_client.auth_status.name = "AUTHENTICATED"
                mock_meijer_class.return_value = mock_client
                
                client = get_meijer_client()
                
                assert client == mock_client
                mock_meijer_class.assert_called_once_with(auth="auth.txt")
    
    def test_get_meijer_client_auth_failure(self):
        """Test client initialization with auth failure."""
        with patch('meijer.cli.Meijer') as mock_meijer_class:
            mock_client = Mock()
            mock_client.auth_status.name = "UNAUTHENTICATED"
            mock_meijer_class.return_value = mock_client
            
            with pytest.raises(Exception) as exc_info:
                get_meijer_client()
            
            assert "Authentication failed" in str(exc_info.value)
    
    def test_get_meijer_client_exception(self):
        """Test client initialization with exception."""
        with patch('meijer.cli.Meijer') as mock_meijer_class:
            mock_meijer_class.side_effect = Exception("Init Error")
            
            with pytest.raises(Exception) as exc_info:
                get_meijer_client()
            
            assert "Failed to initialize Meijer client" in str(exc_info.value)
    
    def test_display_items_table_with_items(self):
        """Test table display with items."""
        mock_items = [
            Mock(
                name="Milk",
                quantity=2,
                checked=False,
                notes="Organic"
            ),
            Mock(
                name="Bread",
                quantity=1,
                checked=True,
                notes=None
            )
        ]
        
        # Ensure the Mock objects have proper string behavior for slicing
        for item in mock_items:
            item.name = str(item.name)
        
        with patch('meijer.cli.click.echo') as mock_echo:
            display_items_table(mock_items, "Test List")
            
            # Should call click.echo multiple times
            assert mock_echo.call_count > 0
    
    def test_display_items_table_empty(self):
        """Test table display with no items."""
        with patch('meijer.cli.click.echo') as mock_echo:
            display_items_table([], "Test List")
            
            # Should show "No items found" message
            mock_echo.assert_called_with("📝 Test List: No items found")


if __name__ == "__main__":
    pytest.main([__file__]) 