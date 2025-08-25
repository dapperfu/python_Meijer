from flask import render_template, flash
from . import bp

from ...models.mock_models import MockMeijerClient


@bp.route("/")
def settings():
    """Account settings page."""
    try:
        client = MockMeijerClient()
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
