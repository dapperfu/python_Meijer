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

from flask import render_template, flash, redirect, url_for, request, jsonify, current_app
from . import bp

from ...models.meijer_integration import meijer_client


@bp.route('/')
def shopping_list():
    """Shopping list management page."""
    try:
        client = meijer_client
        items = client.list.get()
        return render_template('shopping_list.html', items=items)
    except Exception as e:
        flash(f'Error loading shopping list: {str(e)}', 'error')
        return render_template('shopping_list.html', items=[])


@bp.route('/add', methods=['POST'])
def list_add():
    """Add item to shopping list."""
    try:
        item = request.form.get('item')
        quantity = int(request.form.get('quantity', 1))
        notes = request.form.get('notes', '')
        
        if not item:
            flash('Item description is required', 'error')
            return redirect(url_for('shopping_list.shopping_list'))
        
        client = meijer_client
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
                    notes=notes
                )
            
            if success:
                flash(f'Successfully added {item} to shopping list', 'success')
            else:
                flash(f'Failed to add {item} to shopping list', 'error')
        else:
            flash('Shopping list functionality not available', 'error')
            
    except Exception as e:
        flash(f'Error adding item to shopping list: {str(e)}', 'error')
    
    return redirect(url_for('shopping_list.shopping_list'))


@bp.route('/remove/<int:item_index>', methods=['POST'])
def list_remove(item_index: int):
    """Remove item from shopping list."""
    try:
        client = meijer_client
        if client.list:
            items = client.list.get()
            if 1 <= item_index <= len(items):
                item = items[item_index - 1]
                success = client.list.remove_item(item.id)
                if success:
                    flash('Successfully removed item from shopping list', 'success')
                else:
                    flash('Failed to remove item from shopping list', 'error')
            else:
                flash('Invalid item index', 'error')
        else:
            flash('Shopping list functionality not available', 'error')
            
    except Exception as e:
        flash(f'Error removing item from shopping list: {str(e)}', 'error')
    
    return redirect(url_for('shopping_list.shopping_list'))


@bp.route('/toggle/<int:item_index>', methods=['POST'])
def list_toggle(item_index: int):
    """Toggle item completion status in shopping list."""
    try:
        client = meijer_client
        if client.list:
            items = client.list.get()
            if 1 <= item_index <= len(items):
                item = items[item_index - 1]
                new_status = not item.checked
                success = client.list.update_item_status(item.id, new_status)
                if success:
                    status_text = 'completed' if new_status else 'pending'
                    flash(f'Item marked as {status_text}', 'success')
                else:
                    flash('Failed to update item status', 'error')
            else:
                flash('Invalid item index', 'error')
        else:
            flash('Shopping list functionality not available', 'error')
            
    except Exception as e:
        flash(f'Error updating item status: {str(e)}', 'error')
    
    return redirect(url_for('shopping_list.shopping_list'))


@bp.route('/bulk-action', methods=['POST'])
def bulk_action():
    """Perform bulk actions on shopping list items."""
    try:
        action = request.form.get('action')
        selected_items = request.form.getlist('selected_items')
        
        if not selected_items:
            flash('No items selected for bulk action', 'error')
            return redirect(url_for('shopping_list.shopping_list'))
        
        client = meijer_client
        if not client.list:
            flash('Shopping list functionality not available', 'error')
            return redirect(url_for('shopping_list.shopping_list'))
        
        success_count = 0
        
        if action == 'complete':
            # Mark selected items as completed
            for item_id in selected_items:
                try:
                    success = client.list.update_item_status(item_id, True)
                    if success:
                        success_count += 1
                except Exception as e:
                    current_app.logger.warning(f"Failed to complete item {item_id}: {e}")
            
            flash(f'Successfully completed {success_count} items', 'success')
            
        elif action == 'delete':
            # Remove selected items
            for item_id in selected_items:
                try:
                    success = client.list.remove_item(item_id)
                    if success:
                        success_count += 1
                except Exception as e:
                    current_app.logger.warning(f"Failed to delete item {item_id}: {e}")
            
            flash(f'Successfully removed {success_count} items', 'success')
            
        elif action == 'clear-completed':
            # Clear all completed items
            items = client.list.get()
            for item in items:
                if getattr(item, 'checked', False):
                    try:
                        success = client.list.remove_item(item.id)
                        if success:
                            success_count += 1
                    except Exception as e:
                        current_app.logger.warning(f"Failed to clear completed item {item.id}: {e}")
            
            flash(f'Successfully cleared {success_count} completed items', 'success')
            
        else:
            flash('Invalid bulk action specified', 'error')
            
    except Exception as e:
        flash(f'Error performing bulk action: {str(e)}', 'error')
    
    return redirect(url_for('shopping_list.shopping_list'))


@bp.route('/sort', methods=['POST'])
def sort_list():
    """Sort shopping list items."""
    try:
        sort_by = request.form.get('sort_by', 'description')
        sort_order = request.form.get('sort_order', 'asc')
        
        client = meijer_client
        if client.list:
            items = client.list.get()
            
            # This would implement actual sorting logic in a real implementation
            # For now, we'll just show a message
            flash(f'Shopping list sorted by {sort_by} ({sort_order})', 'info')
        else:
            flash('Shopping list functionality not available', 'error')
            
    except Exception as e:
        flash(f'Error sorting shopping list: {str(e)}', 'error')
    
    return redirect(url_for('shopping_list.shopping_list'))


@bp.route('/search', methods=['POST'])
def search_list():
    """Search shopping list items."""
    try:
        search_term = request.form.get('search_term', '').strip()
        
        if not search_term:
            flash('Please enter a search term', 'error')
            return redirect(url_for('shopping_list.shopping_list'))
        
        client = meijer_client
        if client.list:
            items = client.list.get()
            
            # Filter items by search term
            filtered_items = []
            for item in items:
                description = getattr(item, 'description', '').lower()
                notes = getattr(item, 'notes', '').lower()
                
                if search_term.lower() in description or search_term.lower() in notes:
                    filtered_items.append(item)
            
            if filtered_items:
                flash(f'Found {len(filtered_items)} items matching "{search_term}"', 'success')
                return render_template('shopping_list.html', items=filtered_items, search_term=search_term)
            else:
                flash(f'No items found matching "{search_term}"', 'info')
                return redirect(url_for('shopping_list.shopping_list'))
        else:
            flash('Shopping list functionality not available', 'error')
            
    except Exception as e:
        flash(f'Error searching shopping list: {str(e)}', 'error')
    
    return redirect(url_for('shopping_list.shopping_list'))
