import uuid

from pytest import fixture


@fixture(scope="session")
def session_uuid():
    yield uuid.uuid4()


@fixture(scope="module")
def module_uuid():
    yield uuid.uuid4()


@fixture(scope="class")
def class_uuid():
    yield uuid.uuid4()


@fixture(scope="function")
def function_uuid():
    yield uuid.uuid4()
