#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create cart blueprint routes
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: Flask
 */

Cart Blueprint Routes
====================

Routes for cart management functionality.
"""

from flask import render_template, flash, redirect, url_for, request
from . import bp

from ...models.meijer_integration import meijer_client


@bp.route("/")
def cart():
    """Cart management page."""
    try:
        client = MockMeijerClient()
        cart_items = client.cart.items
        cart_info = {
            "total_items": client.cart.total_quantity,
            "unique_items": client.cart.unique_item_count,
            "cart_id": client.cart.cart_id,
        }
        return render_template("cart.html", cart_items=cart_items, cart_info=cart_info)
    except Exception as e:
        flash(f"Error loading cart: {str(e)}", "error")
        return render_template("cart.html", cart_items=[], cart_info={})


@bp.route("/add", methods=["POST"])
def cart_add():
    """Add item to cart."""
    try:
        upc = request.form.get("upc")
        quantity = int(request.form.get("quantity", 1))
        store = request.form.get("store", "217")

        if not upc:
            flash("UPC is required", "error")
            return redirect(url_for("cart.cart"))

        client = meijer_client
        if client.cart:
            client.cart.store_id = store
            success = client.cart.add_item_by_upc(upc, quantity)
            if success:
                flash(f"Successfully added {quantity}x item with UPC {upc}", "success")
            else:
                flash(f"Failed to add item with UPC {upc}", "error")
        else:
            flash("Cart functionality not available", "error")

    except Exception as e:
        flash(f"Error adding item to cart: {str(e)}", "error")

    return redirect(url_for("cart.cart"))


@bp.route("/remove/<int:item_index>", methods=["POST"])
def cart_remove(item_index: int):
    """Remove item from cart."""
    try:
        client = meijer_client
        if client.cart and client.cart.items:
            if 1 <= item_index <= len(client.cart.items):
                item = client.cart.items[item_index - 1]
                entry_number = getattr(item, "entry_number", None)
                if entry_number:
                    success = client.cart.remove_item(entry_number)
                    if success:
                        flash("Successfully removed item from cart", "success")
                    else:
                        flash("Failed to remove item from cart", "error")
                else:
                    flash("Cannot remove item - no entry number available", "error")
            else:
                flash("Invalid item index", "error")
        else:
            flash("Cart is empty or not available", "error")

    except Exception as e:
        flash(f"Error removing item from cart: {str(e)}", "error")

    return redirect(url_for("cart.cart"))


@bp.route("/clear", methods=["POST"])
def cart_clear():
    """Clear all items from cart."""
    try:
        client = meijer_client
        if client.cart:
            # Remove all items one by one
            items_to_remove = list(client.cart.items)
            for item in items_to_remove:
                entry_number = getattr(item, "entry_number", None)
                if entry_number:
                    client.cart.remove_item(entry_number)
            flash("Cart cleared successfully", "success")
        else:
            flash("Cart functionality not available", "error")

    except Exception as e:
        flash(f"Error clearing cart: {str(e)}", "error")

    return redirect(url_for("cart.cart"))


@bp.route("/defrag", methods=["POST"])
def cart_defrag():
    """Defragment cart by removing duplicates and consolidating items."""
    try:
        client = meijer_client
        if client.cart and client.cart.items:
            # Get current cart items
            items = client.cart.items
            
            # Create a dictionary to consolidate items by name
            consolidated = {}
            removed_count = 0
            
            for item in items:
                name = getattr(item, "name", "Unknown Item")
                price = getattr(item, "price", 0.0)
                entry_number = getattr(item, "entry_number", None)
                
                if name in consolidated:
                    # Item already exists, consolidate quantities
                    existing_item = consolidated[name]
                    existing_quantity = getattr(existing_item, "current_quantity", 1)
                    new_quantity = getattr(item, "current_quantity", 1)
                    
                    # Update the existing item's quantity
                    setattr(existing_item, "current_quantity", existing_quantity + new_quantity)
                    
                    # Remove the duplicate item
                    if entry_number:
                        client.cart.remove_item(entry_number)
                        removed_count += 1
                else:
                    # First occurrence of this item, keep it
                    consolidated[name] = item
            
            if removed_count > 0:
                flash(f"Cart defragmented successfully! Removed {removed_count} duplicate items.", "success")
            else:
                flash("Cart is already optimized - no duplicates found.", "info")
        else:
            flash("Cart is empty or not available", "error")

    except Exception as e:
        flash(f"Error defragmenting cart: {str(e)}", "error")

    return redirect(url_for("cart.cart"))
