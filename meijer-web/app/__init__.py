#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create Flask application factory with blueprints
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: Flask, Flask-Bootstrap
 */

Meijer Web Application Factory
=============================

Flask application factory that creates and configures the application instance.
"""

import logging
import os

from typing import Optional

from flask import Flask
from flask_bootstrap import Bootstrap

from .config.config import Config


def create_app(config_class: Optional[type] = None) -> Flask:
    """
    Create and configure the Flask application.

    Args:
        config_class: Configuration class to use (defaults to Config)

    Returns:
        Configured Flask application instance
    """
    # Create Flask app instance
    app = Flask(__name__, template_folder="../templates", static_folder="../static")

    # Load configuration
    if config_class is None:
        config_class = Config

    app.config.from_object(config_class)

    # Configure logging
    setup_logging(app)

    # Initialize extensions
    Bootstrap(app)

    # Register blueprints
    register_blueprints(app)

    # Register error handlers
    register_error_handlers(app)

    # Register context processors
    register_context_processors(app)

    return app


def setup_logging(app: Flask) -> None:
    """Set up logging configuration for the application."""
    if not app.debug and not app.testing:
        # Production logging
        if not os.path.exists("logs"):
            os.mkdir("logs")

        file_handler = logging.FileHandler("logs/meijer_web.log")
        file_handler.setFormatter(
            logging.Formatter(
                "%(asctime)s %(levelname)s: %(message)s [in %(pathname)s:%(lineno)d]"
            )
        )
        file_handler.setLevel(logging.INFO)
        app.logger.addHandler(file_handler)

        app.logger.setLevel(logging.INFO)
        app.logger.info("Meijer Web startup")


def register_blueprints(app: Flask) -> None:
    """Register all application blueprints."""
    from .blueprints.main import bp as main_bp
    from .blueprints.cart import bp as cart_bp
    from .blueprints.shopping_list import bp as shopping_list_bp
    from .blueprints.coupons import bp as coupons_bp
    from .blueprints.stores import bp as stores_bp
    from .blueprints.settings import bp as settings_bp
    from .blueprints.auth import bp as auth_bp

    app.register_blueprint(main_bp)
    app.register_blueprint(cart_bp, url_prefix="/cart")
    app.register_blueprint(shopping_list_bp, url_prefix="/list")
    app.register_blueprint(coupons_bp, url_prefix="/coupons")
    app.register_blueprint(stores_bp, url_prefix="/stores")
    app.register_blueprint(settings_bp, url_prefix="/settings")
    app.register_blueprint(auth_bp, url_prefix="/auth")


def register_error_handlers(app: Flask) -> None:
    """Register error handlers for the application."""
    from .blueprints.main.errors import errors as main_errors

    # Register error handlers from main blueprint
    for error_code, handler in main_errors.items():
        app.register_error_handler(error_code, handler)


def register_context_processors(app: Flask) -> None:
    """Register context processors for the application."""

    @app.context_processor
    def inject_common_data():
        """Inject common data into all templates."""
        return {"app_name": "Meijer Web", "app_version": "1.0.0"}
