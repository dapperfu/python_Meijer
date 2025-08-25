#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create error handlers for main blueprint
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: Flask
 */

Error Handlers for Main Blueprint
================================

Error handlers for common HTTP error codes.
"""

from flask import render_template
from . import bp


@bp.app_errorhandler(404)
def not_found(error):
    """Handle 404 errors."""
    return render_template("errors/404.html"), 404


@bp.app_errorhandler(500)
def internal_error(error):
    """Handle 500 errors."""
    return render_template("errors/500.html"), 500


@bp.app_errorhandler(403)
def forbidden(error):
    """Handle 403 errors."""
    return render_template("errors/403.html"), 403


@bp.app_errorhandler(401)
def unauthorized(error):
    """Handle 401 errors."""
    return render_template("errors/401.html"), 401


# Export error handlers for registration
errors = {404: not_found, 500: internal_error, 403: forbidden, 401: unauthorized}
