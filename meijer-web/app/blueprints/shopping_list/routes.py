#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create shopping list blueprint routes
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: Flask
 */

Shopping List Blueprint Routes
=============================

Routes for shopping list management functionality.
"""

from flask import render_template, flash, redirect, url_for, request
from . import bp

from ...models.mock_models import MockMeijerClient


@bp.route("/")
def shopping_list():
    """Shopping list management page."""
    try:
        client = MockMeijerClient()
        items = client.list.get()
        return render_template("shopping_list.html", items=items)
    except Exception as e:
        flash(f"Error loading shopping list: {str(e)}", "error")
        return render_template("shopping_list.html", items=[])


@bp.route("/add", methods=["POST"])
def list_add():
    """Add item to shopping list."""
    try:
        item = request.form.get("item")
        quantity = int(request.form.get("quantity", 1))
        notes = request.form.get("notes", "")

        if not item:
            flash("Item description is required", "error")
            return redirect(url_for("shopping_list.shopping_list"))

        client = MockMeijerClient()
        if client.list:
            if item.isdigit() and len(item) >= 8:
                # Treat as UPC
                success = client.list.add_item(upc=item, quantity=quantity)
            else:
                # Treat as description
                success = client.list.add_item_with_details(
                    upc=f"ITEM_{hash(item) % 10000}",
                    description=item,
                    quantity=quantity,
                    notes=notes,
                )

            if success:
                flash(f"Successfully added {item} to shopping list", "success")
            else:
                flash(f"Failed to add {item} to shopping list", "error")
        else:
            flash("Shopping list functionality not available", "error")

    except Exception as e:
        flash(f"Error adding item to shopping list: {str(e)}", "error")

    return redirect(url_for("shopping_list.shopping_list"))


@bp.route("/remove/<int:item_index>", methods=["POST"])
def list_remove(item_index: int):
    """Remove item from shopping list."""
    try:
        client = MockMeijerClient()
        if client.list:
            items = client.list.get()
            if 1 <= item_index <= len(items):
                item = items[item_index - 1]
                success = client.list.remove_item(item.id)
                if success:
                    flash("Successfully removed item from shopping list", "success")
                else:
                    flash("Failed to remove item from shopping list", "error")
            else:
                flash("Invalid item index", "error")
        else:
            flash("Shopping list functionality not available", "error")

    except Exception as e:
        flash(f"Error removing item from shopping list: {str(e)}", "error")

    return redirect(url_for("shopping_list.shopping_list"))


@bp.route("/toggle/<int:item_index>", methods=["POST"])
def list_toggle(item_index: int):
    """Toggle item completion status in shopping list."""
    try:
        client = MockMeijerClient()
        if client.list:
            items = client.list.get()
            if 1 <= item_index <= len(items):
                item = items[item_index - 1]
                new_status = not item.checked
                success = client.list.update_item_status(item.id, new_status)
                if success:
                    status_text = "completed" if new_status else "pending"
                    flash(f"Item marked as {status_text}", "success")
                else:
                    flash("Failed to update item status", "error")
            else:
                flash("Invalid item index", "error")
        else:
            flash("Shopping list functionality not available", "error")

    except Exception as e:
        flash(f"Error updating item status: {str(e)}", "error")

    return redirect(url_for("shopping_list.shopping_list"))
