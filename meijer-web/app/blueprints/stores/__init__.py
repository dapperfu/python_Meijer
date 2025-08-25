from flask import Blueprint

bp = Blueprint("stores", __name__)

from . import routes
