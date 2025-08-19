"""
Meijer CLI Tool

A comprehensive command-line interface for managing Meijer shopping lists.
"""

from .main import cli
from .utils import display_items_table, get_meijer_client

__all__ = ["cli", "display_items_table", "get_meijer_client"]
