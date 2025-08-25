from flask import Blueprint

bp = Blueprint("coupons", __name__)

from . import routes
