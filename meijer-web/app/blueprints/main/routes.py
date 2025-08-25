#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create main blueprint routes
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: Flask
 */

Main Blueprint Routes
====================

Routes for the main blueprint (home page, etc.).
"""

from flask import render_template, jsonify
from . import bp

from ...models.mock_models import MockMeijerClient


@bp.route("/")
def index():
    """Home page with overview of available features."""
    return render_template("index.html")


@bp.route("/api/cart/items")
def api_cart_items():
    """API endpoint to get cart items as JSON."""
    try:
        client = MockMeijerClient()
        cart_items = client.cart.items

        # Convert cart items to serializable format
        items_data = []
        for item in cart_items:
            items_data.append(
                {
                    "name": getattr(item, "name", "Unknown Item"),
                    "quantity": getattr(
                        item, "current_quantity", getattr(item, "quantity", 1)
                    ),
                    "price": getattr(item, "price", 0.0),
                    "available": getattr(item, "available", True),
                    "entry_number": getattr(item, "entry_number", None),
                }
            )

        return jsonify(
            {
                "success": True,
                "items": items_data,
                "total_items": client.cart.total_quantity,
                "unique_items": client.cart.unique_item_count,
            }
        )

    except Exception as e:
        return jsonify({"success": False, "error": str(e)}), 500


@bp.route("/api/list/items")
def api_list_items():
    """API endpoint to get shopping list items as JSON."""
    try:
        client = MockMeijerClient()
        items = client.list.get()

        # Convert items to serializable format
        items_data = []
        for item in items:
            items_data.append(
                {
                    "id": getattr(item, "id", ""),
                    "description": getattr(item, "description", ""),
                    "quantity": getattr(item, "quantity", 1),
                    "checked": getattr(item, "checked", False),
                    "notes": getattr(item, "notes", ""),
                }
            )

        return jsonify(
            {
                "success": True,
                "items": items_data,
                "total_items": len(items_data),
                "completed_items": len(
                    [item for item in items_data if item["checked"]]
                ),
                "pending_items": len(
                    [item for item in items_data if not item["checked"]]
                ),
            }
        )

    except Exception as e:
        return jsonify({"success": False, "error": str(e)}), 500
