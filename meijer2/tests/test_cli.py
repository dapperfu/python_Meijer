#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
.. currentmodule:: test_cli
.. moduleauthor:: Jed <jed@bored>

This is the test module for the project's command-line interface (CLI)
module.
"""
# fmt: off
from click.testing import CliRunner
from click.testing import Result

import meijer2.cli as cli
from meijer2 import __version__
# fmt: on


# To learn more about testing Click applications, visit the link below.
# http://click.pocoo.org/5/testing/


def test_version_displays_library_version():
    """
    Arrange/Act: Run the `version` subcommand.
    Assert: The output matches the library version.
    """
    runner: CliRunner = CliRunner()
    result: Result = runner.invoke(cli.cli, ["version"])
    assert (
        __version__ in result.output.strip()
    ), "Version number should match library version."


def test_verbose_output():
    """
    Arrange/Act: Run the `version` subcommand with the '-v' flag.
    Assert: The output indicates verbose logging is enabled.
    """
    runner: CliRunner = CliRunner()
    result: Result = runner.invoke(cli.cli, ["-v", "version"])
    assert (
        "Verbose" in result.output.strip()
    ), "Verbose logging should be indicated in output."


def test_hello_displays_expected_message():
    """
    Arrange/Act: Run the `version` subcommand.
    Assert:  The output matches the library version.
    """
    runner: CliRunner = CliRunner()
    result: Result = runner.invoke(cli.cli, ["hello"])
    # fmt: off
    assert 'meijer2' in result.output.strip(), \
        "'Hello' messages should contain the CLI name."
    # fmt: on
