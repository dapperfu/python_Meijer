#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Package initialization for standalone price monitoring project
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package
 */
"""

"""
Meijer Price Monitor Package

A standalone price monitoring system for Meijer products that can leverage
the core Meijer Python API when available.
"""

__version__ = "1.0.0"
__author__ = "Meijer Price Monitor Team"

from .core import PriceMonitor, PriceRecord, PriceHistory, PriceDropAnalysis, ShopnScanPrice

__all__ = ["PriceMonitor", "PriceRecord", "PriceHistory", "PriceDropAnalysis", "ShopnScanPrice"]
