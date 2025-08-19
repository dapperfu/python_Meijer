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
 * - Dependencies: click, meijer package, tabulate, sys, os
 */

Meijer CLI Tool
===============

A comprehensive command-line interface for managing Meijer shopping lists.
"""

import click

from .commands import (
    ad_command,
    auth_command,
    cart_group,
    coupons_group,
    gas_command,
    list_group,
    settings_group,
    status_command,
)


@click.group()
@click.version_option(version="1.0.0", prog_name="meijer")
def cli():
    """
    🛒 Meijer Shopping List CLI Tool

    Manage your Meijer shopping lists, coupons, cart, and account from the command line.

    Available commands:
    • list - Manage shopping list operations
    • coupons - Manage coupons and offers
    • cart - Manage shopping cart and fulfillment
    • settings - Manage account settings and preferences
    • auth - Extract authentication tokens
    • status - Show authentication status
    • ads - Browse weekly ad items
    • gas - Show gas station information
    """
    pass


# Add command groups with cleaner names
cli.add_command(list_group, name="list")
cli.add_command(coupons_group, name="coupons")
cli.add_command(cart_group, name="cart")
cli.add_command(settings_group, name="settings")

# Add individual commands with cleaner names
cli.add_command(auth_command, name="auth")
cli.add_command(status_command, name="status")
cli.add_command(ad_command, name="ads")
cli.add_command(gas_command, name="gas")


if __name__ == "__main__":
    cli()
