from flask import render_template, flash, redirect, url_for
from . import bp

from ...models.mock_models import MockMeijerClient


@bp.route("/")
def coupons():
    """Coupons management page."""
    try:
        client = MockMeijerClient()
        coupons_list = client.coupons.get()
        return render_template("coupons.html", coupons=coupons_list)
    except Exception as e:
        flash(f"Error loading coupons: {str(e)}", "error")
        return render_template("coupons.html", coupons=[])


@bp.route("/clip/<coupon_id>", methods=["POST"])
def clip_coupon(coupon_id: str):
    """Clip a coupon."""
    try:
        client = MockMeijerClient()
        if client.coupons:
            success = client.coupons.clip_coupon(coupon_id)
            if success:
                flash("Coupon clipped successfully", "success")
            else:
                flash("Failed to clip coupon", "error")
        else:
            flash("Coupons functionality not available", "error")

    except Exception as e:
        flash(f"Error clipping coupon: {str(e)}", "error")

    return redirect(url_for("coupons.coupons"))
