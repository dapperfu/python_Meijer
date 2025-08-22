#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create comprehensive CLI tool with Click for Meijer shopping list management
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: click, meijer package, rich, sys, os
 */

Meijer CLI Tool
===============

A comprehensive command-line interface for managing Meijer shopping lists.
"""

import logging

import click

from .commands import (
    ad_command,
    auth_group,
    cart_group,
    coupons_group,
    email_2fa_group,
    gas_command,
    list_group,
    login_command,
    settings_group,
    status_command,
    stores_group,
)


def setup_logging(verbosity: int) -> None:
    """
    Set up logging configuration based on verbosity level.

    Args:
        verbosity: Number of -v flags (0, 1, 2, 3+)
    """
    if verbosity == 0:
        # Default: Only show warnings and errors
        logging.basicConfig(level=logging.WARNING, format="%(levelname)s: %(message)s")
    elif verbosity == 1:
        # -v: Show info, warnings, and errors
        logging.basicConfig(level=logging.INFO, format="%(levelname)s: %(message)s")
    elif verbosity == 2:
        # -vv: Show debug, info, warnings, and errors
        logging.basicConfig(level=logging.DEBUG, format="%(levelname)s: %(message)s")
    else:
        # -vvv+: Show all levels with more detailed format
        logging.basicConfig(
            level=logging.DEBUG,
            format="%(asctime)s - %(name)s - %(levelname)s - %(funcName)s:%(lineno)d - %(message)s",
        )

    # Set specific logger levels for external libraries if needed
    if verbosity >= 2:
        logging.getLogger("urllib3").setLevel(logging.INFO)
        logging.getLogger("requests").setLevel(logging.INFO)
    else:
        logging.getLogger("urllib3").setLevel(logging.WARNING)
        logging.getLogger("requests").setLevel(logging.WARNING)


@click.group()
@click.option(
    "--verbose",
    "-v",
    count=True,
    help="Increase verbosity. Use -v for info, -vv for debug, -vvv for detailed debug",
)
@click.version_option(version="1.0.0", prog_name="meijer")
def cli(verbose: int):
    """
    🛒 Meijer Shopping List CLI Tool

    Manage your Meijer shopping lists, coupons, cart, and account from the command line.

    Available commands:
    • list - Manage shopping list operations
    • coupons - Manage coupons and offers
    • cart - Manage shopping cart and fulfillment
    • stores - Manage store information and search
    • settings - Manage account settings and preferences
    • email-2fa - Manage email 2FA configuration and testing
    • login - Login with username/password (enhanced or Selenium methods, Selenium defaults to visible browser)
    • auth - Manage authentication (login, logout, status, log extraction, email setup)
    • status - Show authentication status
    • ads - Browse weekly ad items
    • gas - Show gas station information
    """
    # Set up logging based on verbosity
    setup_logging(verbose)

    # Log CLI invocation for debugging
    logger = logging.getLogger(__name__)
    logger.debug(f"CLI invoked with verbosity level: {verbose}")
    logger.debug("Setting up Meijer CLI environment")


# Add command groups with cleaner names
cli.add_command(list_group, name="list")
cli.add_command(coupons_group, name="coupons")
cli.add_command(cart_group, name="cart")
cli.add_command(stores_group, name="stores")
cli.add_command(settings_group, name="settings")
cli.add_command(email_2fa_group, name="email-2fa")

# Add individual commands with cleaner names
cli.add_command(auth_group, name="auth")
cli.add_command(status_command, name="status")
cli.add_command(ad_command, name="ads")
cli.add_command(gas_command, name="gas")
cli.add_command(login_command, name="login")


if __name__ == "__main__":
    cli()
