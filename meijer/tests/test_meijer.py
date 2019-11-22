import os

from meijer import __version__
from meijer import Meijer


def test_version():
    assert __version__ == "0.0.2"


def test_meijer_instance():
    meijer_email, meijer_pass, = os.environ["MEIJER_API_KEY"].strip().split("|")
    m = Meijer(meijer_email, meijer_pass)

def test_meijer_login():
    meijer_email, meijer_pass, = os.environ["MEIJER_API_KEY"].strip().split("|")
    m = Meijer(meijer_email, meijer_pass)
    m.login()

def test_meijer_store_count():
    meijer_email, meijer_pass, = os.environ["MEIJER_API_KEY"].strip().split("|")
    m = Meijer(meijer_email, meijer_pass)
    m.login()
    assert len(m.stores)==248