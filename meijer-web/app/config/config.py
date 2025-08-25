#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create configuration file for Flask application
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: Flask, os
 */

Configuration for Meijer Web Application
=======================================

Configuration classes and environment variable handling.
"""

import os
from typing import Optional


class Config:
    """Base configuration class."""

    # Flask configuration
    SECRET_KEY = os.environ.get("SECRET_KEY") or "dev-secret-key-change-in-production"
    FLASK_ENV = os.environ.get("FLASK_ENV", "development")
    DEBUG = os.environ.get("FLASK_DEBUG", "1").lower() in ("true", "1", "on")

    # Bootstrap configuration
    BOOTSTRAP_BOOTSWATCH_THEME = "cosmo"

    # Application configuration
    APP_NAME = "Meijer Web"
    APP_VERSION = "1.0.0"

    # Pagination
    ITEMS_PER_PAGE = 20

    # Session configuration
    PERMANENT_SESSION_LIFETIME = 3600  # 1 hour

    # Logging
    LOG_LEVEL = os.environ.get("LOG_LEVEL", "INFO")
    LOG_FILE = "logs/meijer_web.log"

    # API configuration
    API_TIMEOUT = 30  # seconds
    MAX_RETRIES = 3

    # Security
    SESSION_COOKIE_SECURE = False  # Set to True in production with HTTPS
    SESSION_COOKIE_HTTPONLY = True
    SESSION_COOKIE_SAMESITE = "Lax"

    # Database (if needed in future)
    DATABASE_URL = os.environ.get("DATABASE_URL")

    # External services
    MEIJER_API_BASE_URL = os.environ.get(
        "MEIJER_API_BASE_URL", "https://api.meijer.com"
    )

    # Feature flags
    ENABLE_ANALYTICS = os.environ.get("ENABLE_ANALYTICS", "false").lower() == "true"
    ENABLE_DEBUG_TOOLBAR = DEBUG


class DevelopmentConfig(Config):
    """Development configuration."""

    DEBUG = True
    TESTING = False

    # Development-specific settings
    SESSION_COOKIE_SECURE = False
    LOG_LEVEL = "DEBUG"

    # Enable debug toolbar in development
    ENABLE_DEBUG_TOOLBAR = True


class TestingConfig(Config):
    """Testing configuration."""

    TESTING = True
    DEBUG = False

    # Use test secret key
    SECRET_KEY = "test-secret-key"

    # Disable CSRF protection in tests
    WTF_CSRF_ENABLED = False

    # Use in-memory database for tests
    DATABASE_URL = "sqlite:///:memory:"


class ProductionConfig(Config):
    """Production configuration."""

    DEBUG = False
    TESTING = False

    # Production security settings
    SESSION_COOKIE_SECURE = True
    SESSION_COOKIE_HTTPONLY = True
    SESSION_COOKIE_SAMESITE = "Strict"

    # Production logging
    LOG_LEVEL = "WARNING"

    # Disable debug features
    ENABLE_DEBUG_TOOLBAR = False
    ENABLE_ANALYTICS = True


# Configuration mapping
config = {
    "development": DevelopmentConfig,
    "testing": TestingConfig,
    "production": ProductionConfig,
    "default": DevelopmentConfig,
}


def get_config(config_name: Optional[str] = None) -> type:
    """
    Get configuration class by name.

    Args:
        config_name: Name of configuration to load

    Returns:
        Configuration class
    """
    if config_name is None:
        config_name = os.environ.get("FLASK_ENV", "development")

    return config.get(config_name, config["default"])
