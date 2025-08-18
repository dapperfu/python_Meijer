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

import sys
import os
from typing import List, Optional, TextIO
from pathlib import Path
from datetime import datetime

import click

try:
    from tabulate import tabulate

    TABULATE_AVAILABLE = True
except ImportError:
    TABULATE_AVAILABLE = False

try:
    from ..client import Meijer

    MEIJER_AVAILABLE = True
except ImportError:
    MEIJER_AVAILABLE = False
    click.echo(
        "❌ Meijer package not available. Install with: pip install -e .", err=True
    )
    sys.exit(1)

from .utils import get_meijer_client, display_items_table
from .commands import list_group, coupons_group, cart_group, settings_group
from .commands import auth_command, status_command, ad_command, gas_command


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
    • ad - Browse weekly ad items
    • gas - Show gas station information
    """
    pass


# Add command groups
cli.add_command(list_group)
cli.add_command(coupons_group)
cli.add_command(cart_group)
cli.add_command(settings_group)

# Add individual commands
cli.add_command(auth_command)
cli.add_command(status_command)
cli.add_command(ad_command)
cli.add_command(gas_command)


if __name__ == "__main__":
    cli()
