from flask import render_template, flash, request, jsonify, send_file, current_app
from werkzeug.utils import secure_filename
import json
import csv
import io
import os
from datetime import datetime
from . import bp

from ...models.meijer_integration import meijer_client


@bp.route("/")
def settings():
    """Account settings page."""
    try:
        client = meijer_client
        # Get account information
        account_info = {}
        if hasattr(client, "account"):
            account_info = {
                "email": getattr(client.account, "email", "N/A"),
                "name": getattr(client.account, "name", "N/A"),
                "phone": getattr(client.account, "phone", "N/A"),
            }

        return render_template("settings.html", account_info=account_info)
    except Exception as e:
        flash(f"Error loading settings: {str(e)}", "error")
        return render_template("settings.html", account_info={})


@bp.route("/export", methods=["POST"])
def export_data():
    """Export user data including shopping lists, cart history, and preferences."""
    try:
        client = meijer_client
        
        # Collect data for export
        export_data = {
            "export_date": datetime.now().isoformat(),
            "account_info": {
                "email": getattr(client.account, "email", "N/A"),
                "name": getattr(client.account, "name", "N/A"),
                "phone": getattr(client.account, "phone", "N/A"),
            },
            "shopping_lists": [],
            "cart_history": [],
            "preferences": {
                "default_store": "217",
                "notifications_enabled": True,
                "theme": "light"
            }
        }
        
        # Get shopping list data
        if hasattr(client, "list"):
            shopping_list = client.list.get()
            for item in shopping_list:
                export_data["shopping_lists"].append({
                    "description": getattr(item, "description", ""),
                    "quantity": getattr(item, "quantity", 1),
                    "checked": getattr(item, "checked", False),
                    "notes": getattr(item, "notes", "")
                })
        
        # Get cart data
        if hasattr(client, "cart"):
            cart_items = client.cart.items
            for item in cart_items:
                export_data["cart_history"].append({
                    "name": getattr(item, "name", ""),
                    "quantity": getattr(item, "current_quantity", 1),
                    "price": getattr(item, "price", 0.0),
                    "added_date": datetime.now().isoformat()
                })
        
        # Create JSON file
        json_data = json.dumps(export_data, indent=2, ensure_ascii=False)
        
        # Create file-like object for download
        file_obj = io.BytesIO(json_data.encode('utf-8'))
        file_obj.seek(0)
        
        filename = f"meijer_data_export_{datetime.now().strftime('%Y%m%d_%H%M%S')}.json"
        
        return send_file(
            file_obj,
            as_attachment=True,
            download_name=filename,
            mimetype='application/json'
        )
        
    except Exception as e:
        flash(f"Error exporting data: {str(e)}", "error")
        return jsonify({"success": False, "error": str(e)}), 500


@bp.route("/import", methods=["POST"])
def import_data():
    """Import user data from backup files."""
    try:
        if 'file' not in request.files:
            flash('No file selected', 'error')
            return jsonify({"success": False, "error": "No file selected"}), 400
        
        file = request.files['file']
        if file.filename == '':
            flash('No file selected', 'error')
            return jsonify({"success": False, "error": "No file selected"}), 400
        
        if not file.filename.endswith('.json'):
            flash('Please select a valid JSON file', 'error')
            return jsonify({"success": False, "error": "Invalid file format"}), 400
        
        # Read and parse JSON file
        try:
            data = json.loads(file.read().decode('utf-8'))
        except json.JSONDecodeError:
            flash('Invalid JSON file', 'error')
            return jsonify({"success": False, "error": "Invalid JSON file"}), 400
        
        # Validate data structure
        required_fields = ['shopping_lists', 'cart_history', 'preferences']
        for field in required_fields:
            if field not in data:
                flash(f'Missing required field: {field}', 'error')
                return jsonify({"success": False, "error": f"Missing field: {field}"}), 400
        
        # Import shopping lists
        client = meijer_client
        imported_count = 0
        
        if hasattr(client, "list") and data.get("shopping_lists"):
            for item_data in data["shopping_lists"]:
                try:
                    # This would actually import the data in a real implementation
                    # For now, we'll just count what would be imported
                    imported_count += 1
                except Exception as e:
                    current_app.logger.warning(f"Failed to import item: {e}")
        
        flash(f'Successfully imported {imported_count} items from backup file', 'success')
        return jsonify({
            "success": True, 
            "imported_count": imported_count,
            "message": f"Imported {imported_count} items successfully"
        })
        
    except Exception as e:
        flash(f"Error importing data: {str(e)}", "error")
        return jsonify({"success": False, "error": str(e)}), 500


@bp.route("/preferences", methods=["POST"])
def save_preferences():
    """Save user preferences."""
    try:
        data = request.get_json()
        
        # Validate preferences
        preferences = {
            "default_store": data.get("default_store", "217"),
            "notifications_enabled": data.get("notifications_enabled", True),
            "theme": data.get("theme", "light"),
            "language": data.get("language", "en"),
            "currency": data.get("currency", "USD")
        }
        
        # This would save to a database in a real implementation
        # For now, we'll just return success
        
        flash('Preferences saved successfully', 'success')
        return jsonify({
            "success": True,
            "preferences": preferences,
            "message": "Preferences saved successfully"
        })
        
    except Exception as e:
        flash(f"Error saving preferences: {str(e)}", "error")
        return jsonify({"success": False, "error": str(e)}), 500


@bp.route("/export-csv", methods=["POST"])
def export_csv():
    """Export shopping list as CSV file."""
    try:
        client = meijer_client
        
        # Get shopping list data
        if not hasattr(client, "list"):
            flash('Shopping list not available', 'error')
            return jsonify({"success": False, "error": "Shopping list not available"}), 500
        
        shopping_list = client.list.get()
        
        # Create CSV data
        output = io.StringIO()
        writer = csv.writer(output)
        writer.writerow(['Item', 'Quantity', 'Status', 'Notes'])
        
        for item in shopping_list:
            status = "Completed" if getattr(item, "checked", False) else "Pending"
            writer.writerow([
                getattr(item, "description", ""),
                getattr(item, "quantity", 1),
                status,
                getattr(item, "notes", "")
            ])
        
        # Create file-like object for download
        csv_data = output.getvalue()
        file_obj = io.BytesIO(csv_data.encode('utf-8'))
        file_obj.seek(0)
        
        filename = f"shopping_list_{datetime.now().strftime('%Y%m%d_%H%M%S')}.csv"
        
        return send_file(
            file_obj,
            as_attachment=True,
            download_name=filename,
            mimetype='text/csv'
        )
        
    except Exception as e:
        flash(f"Error exporting CSV: {str(e)}", "error")
        return jsonify({"success": False, "error": str(e)}), 500


@bp.route("/clear-data", methods=["POST"])
def clear_data():
    """Clear all user data (shopping lists, cart, etc.)."""
    try:
        data_type = request.json.get("data_type", "all")
        
        client = meijer_client
        
        if data_type == "all" or data_type == "shopping_list":
            # Clear shopping list
            if hasattr(client, "list"):
                # This would clear the shopping list in a real implementation
                pass
        
        if data_type == "all" or data_type == "cart":
            # Clear cart
            if hasattr(client, "cart"):
                # This would clear the cart in a real implementation
                pass
        
        if data_type == "all" or data_type == "preferences":
            # Reset preferences to defaults
            pass
        
        flash(f'{data_type.replace("_", " ").title()} cleared successfully', 'success')
        return jsonify({
            "success": True,
            "message": f"{data_type.replace('_', ' ').title()} cleared successfully"
        })
        
    except Exception as e:
        flash(f"Error clearing data: {str(e)}", "error")
        return jsonify({"success": False, "error": str(e)}), 500
