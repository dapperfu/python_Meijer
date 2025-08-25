"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create email configuration manager for Meijer price watch system
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: toml, pathlib, os, logging, typing, smtplib, email
 */

Email Configuration Manager for Price Watch System

This module provides email configuration management for sending price alerts
via SMTP, with support for TOML configuration files.
"""

import logging
import os
import smtplib
from pathlib import Path
from typing import Dict, Any, Optional, List
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart
from email.mime.base import MIMEBase
from email import encoders

import toml


class EmailConfig:
    """
    Email configuration manager for the price watch system.
    
    Handles loading and validation of email configuration from TOML files.
    """
    
    def __init__(self, config_path: Optional[str] = None):
        """
        Initialize the email configuration manager.
        
        Parameters
        ----------
        config_path : str, optional
            Path to the email configuration file. If None, uses default location.
        """
        self.logger = logging.getLogger(__name__)
        
        if config_path is None:
            config_path = self._get_default_config_path()
        
        self.config_path = Path(config_path)
        self.config: Dict[str, Any] = {}
        
        # Load configuration if file exists
        if self.config_path.exists():
            self.load_config()
    
    def _get_default_config_path(self) -> str:
        """
        Get the default email configuration path.
        
        Returns
        -------
        str
            Default configuration path
        """
        # Check for XDG_CONFIG_HOME environment variable
        xdg_config_home = os.environ.get('XDG_CONFIG_HOME')
        if xdg_config_home:
            config_dir = Path(xdg_config_home)
        else:
            # Default to ~/.config
            config_dir = Path.home() / ".config"
        
        return str(config_dir / "meijer" / "email.toml")
    
    def load_config(self) -> None:
        """Load email configuration from the TOML file."""
        try:
            if not self.config_path.exists():
                self.logger.warning(f"Email configuration file not found: {self.config_path}")
                return
            
            with open(self.config_path, 'r', encoding='utf-8') as f:
                self.config = toml.load(f)
            
            self.logger.debug(f"Loaded email configuration from: {self.config_path}")
            
        except Exception as e:
            self.logger.error(f"Failed to load email configuration: {e}")
            self.config = {}
    
    def save_config(self) -> None:
        """Save email configuration to the TOML file."""
        try:
            # Ensure directory exists
            self.config_path.parent.mkdir(parents=True, exist_ok=True)
            
            with open(self.config_path, 'w', encoding='utf-8') as f:
                toml.dump(self.config, f)
            
            # Set secure file permissions (0600)
            self._set_config_permissions()
            
            self.logger.debug(f"Saved email configuration to: {self.config_path}")
            
        except Exception as e:
            self.logger.error(f"Failed to save email configuration: {e}")
            raise
    
    def _set_config_permissions(self) -> None:
        """Set secure file permissions on the configuration file."""
        try:
            # Set 0600 permissions (owner read/write only)
            os.chmod(self.config_path, 0o600)
            self.logger.debug(f"Set config permissions to 0600: {self.config_path}")
        except Exception as e:
            self.logger.warning(f"Could not set config permissions: {e}")
    
    def create_template(self, force: bool = False) -> None:
        """
        Create a template email configuration file.
        
        Parameters
        ----------
        force : bool, optional
            Whether to overwrite existing file, by default False
        """
        if self.config_path.exists() and not force:
            self.logger.info(f"Email configuration file already exists: {self.config_path}")
            return
        
        # Create template configuration
        template_config = {
            'smtp': {
                'host': 'smtp.gmail.com',
                'port': 587,
                'username': 'your_email@gmail.com',
                'password': 'your_app_password',
                'use_tls': True,
                'from': 'your_email@gmail.com',
                'to': 'your_email@gmail.com'
            },
            'imap': {
                'host': 'imap.gmail.com',
                'port': 993,
                'username': 'your_email@gmail.com',
                'password': 'your_app_password',
                'use_ssl': True
            },
            'email': {
                'subject_prefix': 'Meijer price alert:',
                'unsubscribe_hint': True
            }
        }
        
        # Try to load existing email auth if available
        try:
            from meijer.auth import get_meijer_config_path
            email_auth_path = Path(get_meijer_config_path("email.txt"))
            if email_auth_path.exists():
                # Read the email.txt file and parse it manually
                with open(email_auth_path, 'r') as f:
                    content = f.read()
                
                # Extract username and password from the file
                username = None
                password = None
                
                for line in content.split('\n'):
                    line = line.strip()
                    if line.startswith('username='):
                        username = line.split('=', 1)[1]
                    elif line.startswith('password='):
                        password = line.split('=', 1)[1]
                
                if username and password:
                    # Update template with existing credentials
                    template_config['smtp']['username'] = username
                    template_config['smtp']['password'] = password
                    template_config['smtp']['from'] = username
                    template_config['smtp']['to'] = username
                    template_config['imap']['username'] = username
                    template_config['imap']['password'] = password
                    
                    # Also update SMTP and IMAP hosts if it's DreamHost
                    if 'dreamhost' in username.lower() or 'eabi.xyz' in username.lower():
                        template_config['smtp']['host'] = 'smtp.dreamhost.com'
                        template_config['smtp']['port'] = 587
                        template_config['smtp']['use_tls'] = True
                        template_config['imap']['host'] = 'imap.dreamhost.com'
                        template_config['imap']['port'] = 993
                        template_config['imap']['use_ssl'] = True
                    
                    self.logger.info("Loaded existing email credentials from email.txt")
        except Exception as e:
            self.logger.debug(f"Could not load existing email auth: {e}")
        
        self.config = template_config
        self.save_config()
        
        self.logger.info(f"Created email configuration template: {self.config_path}")
    
    def validate_config(self) -> bool:
        """
        Validate the email configuration.
        
        Returns
        -------
        bool
            True if configuration is valid, False otherwise
        """
        required_smtp_keys = ['host', 'port', 'username', 'password', 'from', 'to']
        
        if 'smtp' not in self.config:
            self.logger.error("Missing SMTP configuration section")
            return False
        
        smtp_config = self.config['smtp']
        missing_keys = [key for key in required_smtp_keys if key not in smtp_config]
        
        if missing_keys:
            self.logger.error(f"Missing required SMTP configuration keys: {missing_keys}")
            return False
        
        # Validate port is a number
        try:
            port = int(smtp_config['port'])
            if port <= 0 or port > 65535:
                self.logger.error(f"Invalid SMTP port: {port}")
                return False
        except (ValueError, TypeError):
            self.logger.error(f"Invalid SMTP port: {smtp_config['port']}")
            return False
        
        self.logger.debug("Email configuration validation passed")
        return True
    
    def get_smtp_config(self) -> Dict[str, Any]:
        """
        Get SMTP configuration.
        
        Returns
        -------
        Dict[str, Any]
            SMTP configuration dictionary
        """
        return self.config.get('smtp', {})
    
    def get_imap_config(self) -> Dict[str, Any]:
        """
        Get IMAP configuration.
        
        Returns
        -------
        Dict[str, Any]
            IMAP configuration dictionary
        """
        return self.config.get('imap', {})
    
    def get_email_config(self) -> Dict[str, Any]:
        """
        Get general email configuration.
        
        Returns
        -------
        Dict[str, Any]
            Email configuration dictionary
        """
        return self.config.get('email', {})


class EmailSender:
    """
    Email sender for price alerts using SMTP.
    """
    
    def __init__(self, config: EmailConfig):
        """
        Initialize the email sender.
        
        Parameters
        ----------
        config : EmailConfig
            Email configuration instance
        """
        self.config = config
        self.logger = logging.getLogger(__name__)
    
    def send_price_alert(
        self,
        to_email: str,
        subject: str,
        html_body: str,
        plain_text_body: str,
        from_email: Optional[str] = None
    ) -> Optional[str]:
        """
        Send a price alert email with both HTML and plain text versions.
        
        Parameters
        ----------
        to_email : str
            Recipient email address
        subject : str
            Email subject
        html_body : str
            Email body (HTML)
        plain_text_body : str
            Email body (plain text)
        from_email : str, optional
            Sender email address. If None, uses config default.
        
        Returns
        -------
        str, optional
            Message ID if successful, None otherwise
        """
        if not self.config.validate_config():
            self.logger.error("Invalid email configuration")
            return None
        
        smtp_config = self.config.get_smtp_config()
        
        try:
            # Create message with both HTML and plain text
            msg = MIMEMultipart('alternative')
            msg['Subject'] = subject
            msg['From'] = from_email or smtp_config['from']
            msg['To'] = to_email
            
            # Add plain text body first (fallback)
            text_part = MIMEText(plain_text_body, 'plain', 'utf-8')
            msg.attach(text_part)
            
            # Add HTML body
            html_part = MIMEText(html_body, 'html', 'utf-8')
            msg.attach(html_part)
            
            # Connect to SMTP server
            if smtp_config.get('use_tls', False):
                server = smtplib.SMTP(smtp_config['host'], smtp_config['port'])
                server.starttls()
            else:
                server = smtplib.SMTP_SSL(smtp_config['host'], smtp_config['port'])
            
            # Login
            server.login(smtp_config['username'], smtp_config['password'])
            
            # Send email
            text = msg.as_string()
            server.sendmail(smtp_config['from'], to_email, text)
            server.quit()
            
            self.logger.info(f"Price alert email sent successfully to: {to_email}")
            return msg['Message-ID'] if 'Message-ID' in msg else None
            
        except Exception as e:
            self.logger.error(f"Failed to send price alert email: {e}")
            return None
    
    def send_consolidated_alerts(
        self,
        alerts: List[Dict[str, Any]],
        to_email: Optional[str] = None
    ) -> Optional[str]:
        """
        Send a consolidated email with multiple price alerts using Jinja2 templates.
        
        Parameters
        ----------
        alerts : List[Dict[str, Any]]
            List of alert dictionaries
        to_email : str, optional
            Recipient email address. If None, uses config default.
        
        Returns
        -------
        str, optional
            Message ID if successful, None otherwise
        """
        if not alerts:
            self.logger.warning("No alerts to send")
            return None
        
        smtp_config = self.config.get_smtp_config()
        to_email = to_email or smtp_config['to']
        
        # Create consolidated subject
        if len(alerts) == 1:
            alert = alerts[0]
            subject = f"Meijer price alert: {alert.get('product_name', 'Unknown')} at ${alert.get('new_price', '0.00')}"
        else:
            subject = f"Meijer price alerts: {len(alerts)} items updated"
        
        # Use Jinja2 templates
        try:
            from .templates.email_templates import template_manager
            from datetime import datetime
            
            # Render email using templates
            email_content = template_manager.render_price_alert_email(
                alerts=alerts,
                generated_at=datetime.utcnow().strftime('%Y-%m-%d %H:%M:%S UTC')
            )
            
            return self.send_price_alert(
                to_email=to_email,
                subject=subject,
                html_body=email_content['html'],
                plain_text_body=email_content['plain_text']
            )
            
        except ImportError:
            # Fallback to old method if templates not available
            self.logger.warning("Jinja2 templates not available, using fallback method")
            body = self._create_consolidated_body(alerts)
            return self.send_price_alert(to_email, subject, body, body)
    
    def _create_consolidated_body(self, alerts: List[Dict[str, Any]]) -> str:
        """
        Create HTML body for consolidated alerts.
        
        Parameters
        ----------
        alerts : List[Dict[str, Any]]
            List of alert dictionaries
        
        Returns
        -------
        str
            HTML body content
        """
        html_parts = [
            "<!DOCTYPE html>",
            "<html>",
            "<head>",
            "<meta charset='utf-8'>",
            "<style>",
            "body { font-family: Arial, sans-serif; margin: 20px; }",
            ".alert { border: 1px solid #ddd; margin: 10px 0; padding: 15px; border-radius: 5px; }",
            ".price { font-size: 18px; font-weight: bold; color: #2c5aa0; }",
            ".delta { font-weight: bold; }",
            ".delta.positive { color: #28a745; }",
            ".delta.negative { color: #dc3545; }",
            ".product-info { margin: 10px 0; }",
            ".store-info { color: #666; font-size: 14px; }",
            ".footer { margin-top: 20px; padding-top: 20px; border-top: 1px solid #ddd; font-size: 12px; color: #666; }",
            "</style>",
            "</head>",
            "<body>",
            f"<h2>Meijer Price Alerts - {len(alerts)} item(s) updated</h2>"
        ]
        
        for alert in alerts:
            delta_class = "positive" if alert.get('delta_amount', 0) > 0 else "negative"
            delta_sign = "+" if alert.get('delta_amount', 0) > 0 else ""
            
            html_parts.extend([
                "<div class='alert'>",
                f"<div class='product-info'>",
                f"<strong>{alert.get('product_name', 'Unknown Product')}</strong>",
                f"<br>Identifier: {alert.get('identifier', 'Unknown')} ({alert.get('id_type', 'Unknown')})",
                "</div>",
                f"<div class='price'>",
                f"New Price: ${alert.get('new_price', '0.00')}",
                "</div>",
                f"<div class='delta {delta_class}'>",
                f"Change: {delta_sign}${alert.get('delta_amount', '0.00')}",
                f" ({alert.get('reason', 'Unknown')})",
                "</div>",
                f"<div class='store-info'>",
                f"Store: {alert.get('store_name', 'Unknown')}",
                f"<br>Observed: {alert.get('observed_at', 'Unknown')}",
                f"<br>Source: {alert.get('source', 'Unknown')}",
                "</div>",
                "</div>"
            ])
        
        # Add footer with unsubscribe information
        html_parts.extend([
            "<div class='footer'>",
            "<p>To stop receiving these alerts, run: <code>meijer watch rm &lt;identifier&gt;</code></p>",
            "<p>This email was sent by the Meijer Price Watch system.</p>",
            "</div>",
            "</body>",
            "</html>"
        ])
        
        return "\n".join(html_parts)
    
    def send_test_email(
        self,
        to_email: Optional[str] = None,
        product_info: Optional[Dict[str, Any]] = None
    ) -> Optional[str]:
        """
        Send a test email to verify email configuration.
        
        Parameters
        ----------
        to_email : str, optional
            Recipient email address. If None, uses config default.
        product_info : Dict[str, Any], optional
            Product information for the test email. If None, uses default test data.
        
        Returns
        -------
        str, optional
            Message ID if successful, None otherwise
        """
        if not self.config.validate_config():
            self.logger.error("Invalid email configuration")
            return None
        
        smtp_config = self.config.get_smtp_config()
        to_email = to_email or smtp_config['to']
        
        # Use provided product info or default test data
        if product_info is None:
            product_info = {
                'product_name': 'Test Product',
                'product_identifier': '123456789012',
                'store_name': 'Test Store',
                'current_price': 9.99
            }
        
        subject = "Meijer Price Watch - Test Email"
        
        try:
            from .templates.email_templates import template_manager
            from datetime import datetime
            
            # Render test email using templates
            email_content = template_manager.render_test_email(
                product_name=product_info['product_name'],
                product_identifier=product_info['product_identifier'],
                store_name=product_info['store_name'],
                current_price=product_info['current_price'],
                test_time=datetime.utcnow().strftime('%Y-%m-%d %H:%M:%S UTC')
            )
            
            return self.send_price_alert(
                to_email=to_email,
                subject=subject,
                html_body=email_content['html'],
                plain_text_body=email_content['plain_text']
            )
            
        except ImportError:
            # Fallback to simple test email if templates not available
            self.logger.warning("Jinja2 templates not available, using fallback test email")
            
            html_body = f"""
            <html>
            <body>
                <h1>Meijer Price Watch - Test Email</h1>
                <p>✅ Email configuration is working correctly!</p>
                <p>This is a test email to verify your email setup.</p>
                <p>Product: {product_info['product_name']} (${product_info['current_price']})</p>
                <p>Store: {product_info['store_name']}</p>
            </body>
            </html>
            """
            
            plain_text_body = f"""
            Meijer Price Watch - Test Email
            ===============================
            
            ✅ Email configuration is working correctly!
            
            This is a test email to verify your email setup.
            Product: {product_info['product_name']} (${product_info['current_price']})
            Store: {product_info['store_name']}
            """
            
            return self.send_price_alert(
                to_email=to_email,
                subject=subject,
                html_body=html_body,
                plain_text_body=plain_text_body
            )


def create_email_config_template(config_path: Optional[str] = None, force: bool = False) -> None:
    """
    Create a template email configuration file.
    
    Parameters
    ----------
    config_path : str, optional
        Path where to create the template. If None, uses default location.
    force : bool, optional
        Whether to overwrite existing file, by default False
    """
    config = EmailConfig(config_path)
    config.create_template(force=force)


def get_email_config(config_path: Optional[str] = None) -> EmailConfig:
    """
    Get an email configuration instance.
    
    Parameters
    ----------
    config_path : str, optional
        Path to the configuration file. If None, uses default location.
    
    Returns
    -------
    EmailConfig
        Email configuration instance
    """
    return EmailConfig(config_path)
