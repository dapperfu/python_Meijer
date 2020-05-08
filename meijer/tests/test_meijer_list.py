import pytest

from meijer import __version__
from meijer import Meijer


@pytest.fixture(scope="session")
def meijer():
    with Meijer() as m:
        m.login()
        yield m


@pytest.fixture(scope="session")
def shopping_list(meijer):
    shopping_list = meijer.list
    shopping_list.clear()
    yield shopping_list
    shopping_list.clear()


def test_empty_list(shopping_list):
    assert shopping_list.count == 0


def test_list_add(shopping_list, session_uuid):
    for i in range(10):
        shopping_list.add(f"pytest {str(i)} {session_uuid}")
    assert shopping_list.count == 10


def test_list_complete(shopping_list):
    for item in shopping_list.items:
        if not item["isComplete"]:
            shopping_list.complete(item)


def test_list_uncomplete(shopping_list):
    for item in shopping_list.items:
        if item["isComplete"]:
            shopping_list.uncomplete(item)


def test_list_complete2(shopping_list):
    for item in shopping_list.items:
        if not item["isComplete"]:
            shopping_list.complete(item)
