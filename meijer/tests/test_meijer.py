import os

import pytest

from meijer import __version__
from meijer import Meijer


def test_version():
    assert __version__ == "0.0.2"


def test_meijer_instance():
    meijer_api_key = os.environ["MEIJER_API_KEY"]
    m = Meijer(meijer_api_key)


def test_meijer_login():
    meijer_api_key = os.environ["MEIJER_API_KEY"]
    m = Meijer(meijer_api_key)
    m.login()


def test_meijer_store_count():
    meijer_api_key = os.environ["MEIJER_API_KEY"]
    m = Meijer(meijer_api_key)
    m.login()
    assert len(m.stores()) == 248


@pytest.fixture(scope="function")
def meijer():
    meijer_api_key, = os.environ["MEIJER_API_KEY"]
    m = Meijer(meijer_api_key)
