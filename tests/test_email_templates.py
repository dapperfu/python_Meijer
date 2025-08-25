"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create tests for email templates in Meijer price watch system
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: pytest, datetime, decimal
 */

Tests for Email Templates

This module contains tests for the Jinja2 email templates.
"""

import pytest
from datetime import datetime
from decimal import Decimal

from meijer.price_watch.templates.email_templates import template_manager


class TestEmailTemplates:
    """Test email template functionality."""
    
    def test_price_alert_email_rendering(self):
        """Test rendering of price alert email templates."""
        # Sample alert data
        alerts = [
            {
                'product_name': 'Test Cereal',
                'product_identifier': '012345678905',
                'id_type': 'UPC',
                'store_name': 'Test Store',
                'reason': 'price_drop',
                'delta_amount': Decimal('-1.50'),
                'new_price': Decimal('8.99'),
                'previous_price': Decimal('10.49'),
                'price_type': 'sale',
                'observed_at': datetime(2025, 1, 1, 12, 0, 0),
                'source': 'search'
            }
        ]
        
        generated_at = "2025-01-01 12:00:00 UTC"
        
        # Render templates
        result = template_manager.render_price_alert_email(alerts, generated_at)
        
        # Check that both HTML and plain text were generated
        assert 'html' in result
        assert 'plain_text' in result
        
        # Check HTML content
        html_content = result['html']
        assert 'Test Cereal' in html_content
        assert '012345678905' in html_content
        assert 'Test Store' in html_content
        assert '$8.99' in html_content
        assert '$1.50' in html_content
        assert 'price_drop' in html_content
        
        # Check plain text content
        plain_text = result['plain_text']
        assert 'Test Cereal' in plain_text
        assert '012345678905' in plain_text
        assert 'Test Store' in plain_text
        assert '$8.99' in plain_text
        assert '$1.50' in plain_text
        assert 'price_drop' in plain_text
    
    def test_test_email_rendering(self):
        """Test rendering of test email templates."""
        product_name = "Test Product"
        product_identifier = "123456789012"
        store_name = "Test Store"
        current_price = 9.99
        test_time = "2025-01-01 12:00:00 UTC"
        
        # Render templates
        result = template_manager.render_test_email(
            product_name=product_name,
            product_identifier=product_identifier,
            store_name=store_name,
            current_price=current_price,
            test_time=test_time
        )
        
        # Check that both HTML and plain text were generated
        assert 'html' in result
        assert 'plain_text' in result
        
        # Check HTML content
        html_content = result['html']
        assert 'Test Product' in html_content
        assert '123456789012' in html_content
        assert 'Test Store' in html_content
        assert '$9.99' in html_content
        assert 'Test Email' in html_content
        
        # Check plain text content
        plain_text = result['plain_text']
        assert 'Test Product' in plain_text
        assert '123456789012' in plain_text
        assert 'Test Store' in plain_text
        assert '$9.99' in plain_text
        assert 'Test Email' in plain_text
    
    def test_multiple_alerts_rendering(self):
        """Test rendering with multiple alerts."""
        alerts = [
            {
                'product_name': 'Product 1',
                'product_identifier': '111111111111',
                'id_type': 'UPC',
                'store_name': 'Store A',
                'reason': 'price_drop',
                'delta_amount': Decimal('-0.50'),
                'new_price': Decimal('4.99'),
                'previous_price': Decimal('5.49'),
                'price_type': 'regular',
                'observed_at': datetime(2025, 1, 1, 12, 0, 0),
                'source': 'search'
            },
            {
                'product_name': 'Product 2',
                'product_identifier': '222222222222',
                'id_type': 'UPC',
                'store_name': 'Store B',
                'reason': 'sale_detected',
                'delta_amount': Decimal('-2.00'),
                'new_price': Decimal('7.99'),
                'previous_price': Decimal('9.99'),
                'price_type': 'sale',
                'observed_at': datetime(2025, 1, 1, 12, 0, 0),
                'source': 'cart'
            }
        ]
        
        generated_at = "2025-01-01 12:00:00 UTC"
        
        # Render templates
        result = template_manager.render_price_alert_email(alerts, generated_at)
        
        # Check content
        html_content = result['html']
        plain_text = result['plain_text']
        
        # Should show 2 items
        assert '2 item(s) updated' in html_content
        assert '2 item(s) updated' in plain_text
        
        # Should contain both products
        assert 'Product 1' in html_content
        assert 'Product 2' in html_content
        assert 'Product 1' in plain_text
        assert 'Product 2' in plain_text
    
    def test_template_manager_instance(self):
        """Test that template manager is properly initialized."""
        assert template_manager is not None
        assert hasattr(template_manager, 'html_template')
        assert hasattr(template_manager, 'plain_text_template')
        assert hasattr(template_manager, 'test_html_template')
        assert hasattr(template_manager, 'test_plain_text_template')
        assert hasattr(template_manager, 'render_price_alert_email')
        assert hasattr(template_manager, 'render_test_email')


if __name__ == "__main__":
    pytest.main([__file__])
