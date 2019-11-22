import pytest

import uuid


@pytest.fixture(scope="session")
def session_uuid():
    yield uuid.uuid4()

@pytest.fixture(scope="module")
def module_uuid():
    yield uuid.uuid4()

@pytest.fixture(scope="class")
def class_uuid():
    yield uuid.uuid4()

@pytest.fixture(scope="function")
def function_uuid():
    yield uuid.uuid4()
