import pytest

from meijer import __version__
from meijer import Meijer


@pytest.fixture(scope="session")
def meijer():
    with Meijer() as m:
        m.login()
        yield m


def test_meijer_store_count3(meijer):
    """ Count the number of Meijer stores returned by the API."""
    assert len(meijer.stores()) == 248


def test_meijer_coupons(meijer):
    """ Count the number of Meijer stores returned by the API."""
    meijer.coupons


@pytest.fixture(scope="session")
def coupons(meijer):
    return meijer.coupons


def test_clip_coupons(meijer, coupons):
    for coupon in coupons[:5]:
        meijer.clip(coupon)


@pytest.fixture(scope="session")
def stores(meijer):
    return meijer.stores()


def test_get_store(meijer, stores):
    for store in stores[:1]:
        meijer.get_store(store["unitid"])
