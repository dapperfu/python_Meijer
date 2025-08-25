"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create Jinja2 email templates for Meijer price watch system
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: jinja2, typing
 */

Email Templates for Price Watch System

This module provides Jinja2 templates for both HTML and plain text email notifications.
"""

from typing import Dict, Any, List
from jinja2 import Template, Environment
from datetime import datetime


# HTML Email Template
HTML_TEMPLATE = """
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Meijer Price Alert</title>
    <style>
        body {
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif;
            line-height: 1.6;
            color: #333;
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #f8f9fa;
        }
        .container {
            background-color: #ffffff;
            border-radius: 8px;
            padding: 30px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        }
        .header {
            text-align: center;
            border-bottom: 2px solid #2c5aa0;
            padding-bottom: 20px;
            margin-bottom: 30px;
        }
        .header h1 {
            color: #2c5aa0;
            margin: 0;
            font-size: 28px;
        }
        .alert-count {
            background-color: #e3f2fd;
            color: #1976d2;
            padding: 10px;
            border-radius: 5px;
            text-align: center;
            margin-bottom: 20px;
            font-weight: bold;
        }
        .alert {
            border: 1px solid #e0e0e0;
            border-radius: 8px;
            margin: 20px 0;
            padding: 20px;
            background-color: #fafafa;
        }
        .product-info {
            margin-bottom: 15px;
        }
        .product-name {
            font-size: 20px;
            font-weight: bold;
            color: #2c5aa0;
            margin-bottom: 5px;
        }
        .product-details {
            color: #666;
            font-size: 14px;
        }
        .price-section {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin: 15px 0;
            padding: 15px;
            background-color: #ffffff;
            border-radius: 5px;
            border: 1px solid #e0e0e0;
        }
        .current-price {
            font-size: 24px;
            font-weight: bold;
            color: #2c5aa0;
        }
        .price-change {
            text-align: right;
        }
        .change-amount {
            font-size: 18px;
            font-weight: bold;
        }
        .change-amount.positive {
            color: #28a745;
        }
        .change-amount.negative {
            color: #dc3545;
        }
        .change-reason {
            color: #666;
            font-size: 14px;
            margin-top: 5px;
        }
        .store-info {
            background-color: #f8f9fa;
            padding: 15px;
            border-radius: 5px;
            margin: 15px 0;
        }
        .store-name {
            font-weight: bold;
            color: #495057;
        }
        .store-details {
            color: #6c757d;
            font-size: 14px;
            margin-top: 5px;
        }
        .footer {
            margin-top: 30px;
            padding-top: 20px;
            border-top: 1px solid #e0e0e0;
            text-align: center;
            color: #6c757d;
            font-size: 12px;
        }
        .unsubscribe {
            background-color: #f8f9fa;
            padding: 15px;
            border-radius: 5px;
            margin: 20px 0;
            text-align: center;
        }
        .unsubscribe code {
            background-color: #e9ecef;
            padding: 2px 6px;
            border-radius: 3px;
            font-family: 'Courier New', monospace;
        }
        .timestamp {
            color: #6c757d;
            font-size: 12px;
            text-align: center;
            margin: 20px 0;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <h1>🛒 Meijer Price Alert</h1>
        </div>
        
        <div class="alert-count">
            {{ alerts|length }} item(s) updated
        </div>
        
        {% for alert in alerts %}
        <div class="alert">
            <div class="product-info">
                <div class="product-name">{{ alert.product_name }}</div>
                <div class="product-details">
                    Identifier: {{ alert.product_identifier }} ({{ alert.id_type }})
                </div>
            </div>
            
            <div class="price-section">
                <div class="current-price">
                    ${{ "%.2f"|format(alert.new_price) }}
                </div>
                <div class="price-change">
                    <div class="change-amount {% if alert.delta_amount < 0 %}negative{% else %}positive{% endif %}">
                        {% if alert.delta_amount < 0 %}-{% else %}+{% endif %}${{ "%.2f"|format(alert.delta_amount|abs) }}
                    </div>
                    <div class="change-reason">
                        {{ alert.reason|replace('_', ' ')|title }}
                    </div>
                </div>
            </div>
            
            {% if alert.previous_price %}
            <div class="store-info">
                <div class="store-name">Previous Price: ${{ "%.2f"|format(alert.previous_price) }}</div>
            </div>
            {% endif %}
            
            <div class="store-info">
                <div class="store-name">{{ alert.store_name }}</div>
                <div class="store-details">
                    Price Type: {{ alert.price_type|title }}<br>
                    Source: {{ alert.source|title }}<br>
                    Observed: {{ alert.observed_at }}
                </div>
            </div>
        </div>
        {% endfor %}
        
        <div class="unsubscribe">
            <strong>To stop receiving these alerts:</strong><br>
            <code>meijer watch rm {{ alerts[0].product_identifier if alerts else '&lt;identifier&gt;' }}</code>
        </div>
        
        <div class="timestamp">
            Generated on {{ generated_at }}
        </div>
        
        <div class="footer">
            This email was sent by the Meijer Price Watch system.<br>
            For support, please check the project documentation.
        </div>
    </div>
</body>
</html>
"""

# Plain Text Email Template
PLAIN_TEXT_TEMPLATE = """
Meijer Price Alert
==================

{{ alerts|length }} item(s) updated

{% for alert in alerts %}
Product: {{ alert.product_name }}
Identifier: {{ alert.product_identifier }} ({{ alert.id_type }})
Store: {{ alert.store_name }}

Current Price: ${{ "%.2f"|format(alert.new_price) }}
{% if alert.previous_price %}Previous Price: ${{ "%.2f"|format(alert.previous_price) }}{% endif %}
Change: {% if alert.delta_amount < 0 %}-{% else %}+{% endif %}${{ "%.2f"|format(alert.delta_amount|abs) }} ({{ alert.reason|replace('_', ' ')|title }})

Price Type: {{ alert.price_type|title }}
Source: {{ alert.source|title }}
                    Observed: {{ alert.observed_at }}

---
{% endfor %}

To stop receiving these alerts, run:
meijer watch rm {{ alerts[0].product_identifier if alerts else '<identifier>' }}

        Generated on {{ generated_at }}

This email was sent by the Meijer Price Watch system.
For support, please check the project documentation.
"""

# Test Email HTML Template
TEST_EMAIL_HTML_TEMPLATE = """
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Meijer Price Watch - Test Email</title>
    <style>
        body {
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif;
            line-height: 1.6;
            color: #333;
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #f8f9fa;
        }
        .container {
            background-color: #ffffff;
            border-radius: 8px;
            padding: 30px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        }
        .header {
            text-align: center;
            border-bottom: 2px solid #28a745;
            padding-bottom: 20px;
            margin-bottom: 30px;
        }
        .header h1 {
            color: #28a745;
            margin: 0;
            font-size: 28px;
        }
        .success-message {
            background-color: #d4edda;
            color: #155724;
            padding: 20px;
            border-radius: 5px;
            text-align: center;
            margin: 20px 0;
            font-size: 18px;
        }
        .test-details {
            background-color: #f8f9fa;
            padding: 20px;
            border-radius: 5px;
            margin: 20px 0;
        }
        .test-details h3 {
            color: #495057;
            margin-top: 0;
        }
        .detail-row {
            display: flex;
            justify-content: space-between;
            margin: 10px 0;
            padding: 5px 0;
            border-bottom: 1px solid #e9ecef;
        }
        .detail-label {
            font-weight: bold;
            color: #495057;
        }
        .detail-value {
            color: #6c757d;
        }
        .footer {
            margin-top: 30px;
            padding-top: 20px;
            border-top: 1px solid #e0e0e0;
            text-align: center;
            color: #6c757d;
            font-size: 12px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <h1>🧪 Meijer Price Watch - Test Email</h1>
        </div>
        
        <div class="success-message">
            ✅ Email configuration is working correctly!
        </div>
        
        <div class="test-details">
            <h3>Test Details</h3>
            <div class="detail-row">
                <span class="detail-label">Test Type:</span>
                <span class="detail-value">Email Configuration Test</span>
            </div>
            <div class="detail-row">
                <span class="detail-label">Product Used:</span>
                <span class="detail-value">{{ product_name }} ({{ product_identifier }})</span>
            </div>
            <div class="detail-row">
                <span class="detail-label">Store:</span>
                <span class="detail-value">{{ store_name }}</span>
            </div>
            <div class="detail-row">
                <span class="detail-label">Current Price:</span>
                <span class="detail-value">${{ "%.2f"|format(current_price) }}</span>
            </div>
            <div class="detail-row">
                <span class="detail-label">Test Time:</span>
                <span class="detail-value">{{ test_time }}</span>
            </div>
        </div>
        
        <div class="footer">
            This is a test email to verify your Meijer Price Watch email configuration.<br>
            If you received this, your email setup is working correctly!
        </div>
    </div>
</body>
</html>
"""

# Test Email Plain Text Template
TEST_EMAIL_PLAIN_TEXT_TEMPLATE = """
Meijer Price Watch - Test Email
===============================

✅ Email configuration is working correctly!

Test Details:
-------------
Test Type: Email Configuration Test
Product Used: {{ product_name }} ({{ product_identifier }})
Store: {{ store_name }}
Current Price: ${{ "%.2f"|format(current_price) }}
        Test Time: {{ test_time }}

This is a test email to verify your Meijer Price Watch email configuration.
If you received this, your email setup is working correctly!
"""


class EmailTemplateManager:
    """
    Manager for email templates using Jinja2.
    
    Provides methods to render both HTML and plain text email templates.
    """
    
    def __init__(self):
        """Initialize the template manager."""
        # Create Jinja2 environment with custom filters
        env = Environment()
        
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
        
        env.filters['strftime'] = strftime_filter
        
        # Create templates with the custom environment
        self.html_template = env.from_string(HTML_TEMPLATE)
        self.plain_text_template = env.from_string(PLAIN_TEXT_TEMPLATE)
        self.test_html_template = env.from_string(TEST_EMAIL_HTML_TEMPLATE)
        self.test_plain_text_template = env.from_string(TEST_EMAIL_PLAIN_TEXT_TEMPLATE)
    
    def render_price_alert_email(
        self,
        alerts: List[Dict[str, Any]],
        generated_at: str
    ) -> Dict[str, str]:
        """
        Render price alert email in both HTML and plain text formats.
        
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
        
        html_content = self.html_template.render(context)
        plain_text_content = self.plain_text_template.render(context)
        
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
        Render test email in both HTML and plain text formats.
        
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
        
        html_content = self.test_html_template.render(context)
        plain_text_content = self.test_plain_text_template.render(context)
        
        return {
            'html': html_content,
            'plain_text': plain_text_content
        }


# Global template manager instance
template_manager = EmailTemplateManager()
