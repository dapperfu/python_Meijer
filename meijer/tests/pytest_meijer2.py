import pytest

from meijer import __version__
from meijer import Meijer


@pytest.fixture(scope="function")
def meijer():
    with Meijer() as m:
        m.login()
        yield m

def test_meijer_store_count_fixture(meijer):
    """ Count the number of Meijer stores returned by the API."""
    assert len(meijer.stores()) == 248
