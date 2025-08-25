from flask import render_template, flash, redirect, url_for, request, jsonify, current_app
from . import bp

from ...models.meijer_integration import meijer_client


@bp.route('/')
def coupons():
    """Coupons management page."""
    try:
        client = meijer_client
        coupons_list = client.coupons.get()
        
        # Get filter parameters
        category = request.args.get('category', '')
        min_savings = request.args.get('min_savings', '')
        max_savings = request.args.get('max_savings', '')
        sort_by = request.args.get('sort_by', 'title')
        sort_order = request.args.get('sort_order', 'asc')
        
        # Apply filters
        filtered_coupons = coupons_list
        if category:
            filtered_coupons = [c for c in filtered_coupons if category.lower() in getattr(c, 'description', '').lower()]
        
        if min_savings:
            try:
                min_val = float(min_savings)
                filtered_coupons = [c for c in filtered_coupons if getattr(c, 'savings', 0) >= min_val]
            except ValueError:
                pass
        
        if max_savings:
            try:
                max_val = float(max_savings)
                filtered_coupons = [c for c in filtered_coupons if getattr(c, 'savings', 0) <= max_val]
            except ValueError:
                pass
        
        # Apply sorting
        if sort_by == 'savings':
            filtered_coupons.sort(key=lambda x: getattr(x, 'savings', 0), reverse=(sort_order == 'desc'))
        elif sort_by == 'expires':
            filtered_coupons.sort(key=lambda x: getattr(x, 'expires', ''), reverse=(sort_order == 'desc'))
        else:  # title
            filtered_coupons.sort(key=lambda x: getattr(x, 'title', '').lower(), reverse=(sort_order == 'desc'))
        
        return render_template('coupons.html', 
                             coupons=filtered_coupons,
                             category=category,
                             min_savings=min_savings,
                             max_savings=max_savings,
                             sort_by=sort_by,
                             sort_order=sort_order)
    except Exception as e:
        flash(f'Error loading coupons: {str(e)}', 'error')
        return render_template('coupons.html', coupons=[])


@bp.route('/clip/<coupon_id>', methods=['POST'])
def clip_coupon(coupon_id: str):
    """Clip a coupon."""
    try:
        client = meijer_client
        if client.coupons:
            success = client.coupons.clip_coupon(coupon_id)
            if success:
                flash('Coupon clipped successfully', 'success')
            else:
                flash('Failed to clip coupon', 'error')
        else:
            flash('Coupons functionality not available', 'error')
            
    except Exception as e:
        flash(f'Error clipping coupon: {str(e)}', 'error')
    
    return redirect(url_for('coupons.coupons'))


@bp.route('/bulk-clip', methods=['POST'])
def bulk_clip():
    """Clip multiple coupons at once."""
    try:
        selected_coupons = request.form.getlist('selected_coupons')
        
        if not selected_coupons:
            flash('No coupons selected for clipping', 'error')
            return redirect(url_for('coupons.coupons'))
        
        client = meijer_client
        if not client.coupons:
            flash('Coupons functionality not available', 'error')
            return redirect(url_for('coupons.coupons'))
        
        success_count = 0
        for coupon_id in selected_coupons:
            try:
                success = client.coupons.clip_coupon(coupon_id)
                if success:
                    success_count += 1
            except Exception as e:
                current_app.logger.warning(f"Failed to clip coupon {coupon_id}: {e}")
        
        if success_count > 0:
            flash(f'Successfully clipped {success_count} coupons', 'success')
        else:
            flash('Failed to clip any coupons', 'error')
            
    except Exception as e:
        flash(f'Error performing bulk clip: {str(e)}', 'error')
    
    return redirect(url_for('coupons.coupons'))


@bp.route('/search', methods=['POST'])
def search_coupons():
    """Search for coupons."""
    try:
        search_term = request.form.get('search_term', '').strip()
        
        if not search_term:
            flash('Please enter a search term', 'error')
            return redirect(url_for('coupons.coupons'))
        
        client = meijer_client
        if client.coupons:
            coupons_list = client.coupons.get()
            
            # Filter coupons by search term
            filtered_coupons = []
            for coupon in coupons_list:
                title = getattr(coupon, 'title', '').lower()
                description = getattr(coupon, 'description', '').lower()
                
                if search_term.lower() in title or search_term.lower() in description:
                    filtered_coupons.append(coupon)
            
            if filtered_coupons:
                flash(f'Found {len(filtered_coupons)} coupons matching "{search_term}"', 'success')
                return render_template('coupons.html', coupons=filtered_coupons, search_term=search_term)
            else:
                flash(f'No coupons found matching "{search_term}"', 'info')
                return redirect(url_for('coupons.coupons'))
        else:
            flash('Coupons functionality not available', 'error')
            
    except Exception as e:
        flash(f'Error searching coupons: {str(e)}', 'error')
    
    return redirect(url_for('coupons.coupons'))


@bp.route('/categories')
def get_categories():
    """Get available coupon categories."""
    try:
        client = meijer_client
        if client.coupons:
            coupons_list = client.coupons.get()
            
            # Extract categories from coupon descriptions
            categories = set()
            for coupon in coupons_list:
                description = getattr(coupon, 'description', '')
                # Simple category extraction - in real implementation, this would be more sophisticated
                if 'milk' in description.lower():
                    categories.add('Dairy')
                elif 'bread' in description.lower():
                    categories.add('Bakery')
                elif 'eggs' in description.lower():
                    categories.add('Dairy')
                else:
                    categories.add('General')
            
            return jsonify({
                "success": True,
                "categories": list(categories)
            })
        else:
            return jsonify({
                "success": False,
                "error": "Coupons functionality not available"
            }), 500
            
    except Exception as e:
        return jsonify({
            "success": False,
            "error": str(e)
        }), 500
