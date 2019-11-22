import os

import pytest

from meijer import __version__
from meijer import Meijer


def test_version():
    assert __version__ == "0.1.0"


def test_meijer_instance():
    """ Test making a Meijer Instance."""
    meijer_api_key = os.environ["MEIJER_API_KEY"]
    m = Meijer(meijer_api_key)


def test_meijer_login():
    """ Test logging in to Meijer's API."""
    meijer_api_key = os.environ["MEIJER_API_KEY"]
    m = Meijer(meijer_api_key)
    m.login()


def test_meijer_login2():
    """ Test logging in to Meijer's, test reading API_KEY automatically."""
    m = Meijer()
    m.login()


def test_meijer_store_count():
    """ Count the number of Meijer stores returned by the API."""
    meijer_api_key = os.environ["MEIJER_API_KEY"]
    m = Meijer(meijer_api_key)
    m.login()
    assert len(m.stores()) == 248


def test_meijer_store_count_location():
    """ Count the number of Meijer stores returned by the API."""
    meijer_api_key = os.environ["MEIJER_API_KEY"]
    m = Meijer(meijer_api_key)
    m.login()
    stores = m.stores(location=(43.016570, -85.726290))
    assert len(stores) == 248


def test_meijer_store_count_distance():
    """ Count the number of Meijer stores returned by the API."""
    meijer_api_key = os.environ["MEIJER_API_KEY"]
    m = Meijer(meijer_api_key)
    m.login()
    # Search to a distance of 1 mile.
    stores = m.stores(location=(43.016570, -85.726290), distance=1)
    # One Store.
    assert len(stores) == 1
