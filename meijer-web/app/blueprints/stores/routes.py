from flask import render_template, flash, redirect, url_for, request
from . import bp

from ...models.meijer_integration import meijer_client


@bp.route("/")
def stores():
    """Stores management page."""
    try:
        client = meijer_client
        stores_list = client.get_stores()
        return render_template("stores.html", stores=stores_list)
    except Exception as e:
        flash(f"Error loading stores: {str(e)}", "error")
        return render_template("stores.html", stores=[])


@bp.route("/search", methods=["POST"])
def stores_search():
    """Search for stores."""
    try:
        city = request.form.get("city", "")
        zip_code = request.form.get("zip_code", "")
        # radius = int(request.form.get("radius", 50))  # TODO: Implement radius filtering

        client = meijer_client
        if city:
            stores_list = client.get_stores(city=city)
        elif zip_code:
            stores_list = client.get_stores(zip_code=zip_code)
        else:
            stores_list = client.get_stores()

        return render_template("stores.html", stores=stores_list)

    except Exception as e:
        flash(f"Error searching stores: {str(e)}", "error")
        return redirect(url_for("stores.stores"))
