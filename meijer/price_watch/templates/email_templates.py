"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Update email template manager to load from separate template files
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: jinja2, pathlib, typing
 */

Email Template Manager for Price Watch System

This module provides a template manager that loads Jinja2 templates from separate files.
"""

from typing import Dict, Any, List
from pathlib import Path
from jinja2 import Environment, FileSystemLoader
from datetime import datetime


class EmailTemplateManager:
    """
    Manager for email templates using Jinja2.
    
    Loads templates from separate files and provides methods to render them.
    """
    
    def __init__(self):
        """Initialize the template manager."""
        # Get the directory containing this file
        template_dir = Path(__file__).parent
        
        # Create Jinja2 environment with file system loader
        self.env = Environment(loader=FileSystemLoader(template_dir))
        
        # Add custom strftime filter
        def strftime_filter(value, format_string):
            """Custom filter to format datetime objects using strftime."""
            if hasattr(value, 'strftime'):
                return value.strftime(format_string)
            elif isinstance(value, str):
                # If it's already a string, try to parse it as datetime
                try:
                    dt = datetime.fromisoformat(value.replace('Z', '+00:00'))
                    return dt.strftime(format_string)
                except ValueError:
                    return value
            return str(value)
        
        self.env.filters['strftime'] = strftime_filter
    
    def render_price_alert_email(
        self,
        alerts: List[Dict[str, Any]],
        generated_at: str
    ) -> Dict[str, str]:
        """
        Render price alert email using separate template files.
        
        Parameters
        ----------
        alerts : List[Dict[str, Any]]
            List of alert dictionaries
        generated_at : str
            Timestamp when the email was generated
        
        Returns
        -------
        Dict[str, str]
            Dictionary with 'html' and 'plain_text' keys
        """
        context = {
            'alerts': alerts,
            'generated_at': generated_at
        }
        
        # Load and render templates
        html_template = self.env.get_template('price_alert.html')
        text_template = self.env.get_template('price_alert.txt')
        
        html_content = html_template.render(context)
        plain_text_content = text_template.render(context)
        
        return {
            'html': html_content,
            'plain_text': plain_text_content
        }
    
    def render_test_email(
        self,
        product_name: str,
        product_identifier: str,
        store_name: str,
        current_price: float,
        test_time: str
    ) -> Dict[str, str]:
        """
        Render test email using separate template files.
        
        Parameters
        ----------
        product_name : str
            Name of the product used for testing
        product_identifier : str
            Product identifier (UPC/PLU)
        store_name : str
            Name of the store
        current_price : float
            Current price of the product
        test_time : str
            Timestamp of the test
        
        Returns
        -------
        Dict[str, str]
            Dictionary with 'html' and 'plain_text' keys
        """
        context = {
            'product_name': product_name,
            'product_identifier': product_identifier,
            'store_name': store_name,
            'current_price': current_price,
            'test_time': test_time
        }
        
        # Load and render templates
        html_template = self.env.get_template('test_email.html')
        text_template = self.env.get_template('test_email.txt')
        
        html_content = html_template.render(context)
        plain_text_content = text_template.render(context)
        
        return {
            'html': html_content,
            'plain_text': plain_text_content
        }


# Global template manager instance
template_manager = EmailTemplateManager()
