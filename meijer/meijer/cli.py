#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
.. currentmodule:: meijer2.cli

This is the entry point for the command-line interface (CLI) application.  It
can be used as a handy facility for running the task from a command line.

.. note::

    To learn more about Click visit the
    `project website <http://click.pocoo.org/5/>`_.  There is also a very
    helpful `tutorial video <https://www.youtube.com/watch?v=kNke39OZ2k0>`_.

    To learn more about running Luigi, visit the Luigi project's
    `Read-The-Docs <http://luigi.readthedocs.io/en/stable/>`_ page.
"""
import logging

import click

from .__init__ import __version__
from meijer import Meijer

LOGGING_LEVELS = {
    0: logging.NOTSET,
    1: logging.ERROR,
    2: logging.WARN,
    3: logging.INFO,
    4: logging.DEBUG,
}  #: a mapping of `verbose` option counts to logging levels


class Info:
    """
    An information object to pass data between CLI functions.
    """

    def __init__(self):  # Note: This object must have an empty constructor.
        self.verbose: int = 0
        self.meijer: Meijer = None


# pass_info is a decorator for functions that pass 'Info' objects.
#: pylint: disable=invalid-name
pass_info = click.make_pass_decorator(Info, ensure=True)


# Change the options to below to suit the actual options for your task (or
# tasks).
@click.group()
@click.option("--verbose", "-v", count=True, help="Enable verbose output.")
@pass_info
def cli(info: Info, verbose: int):
    """
    Run meijer.
    """
    # Use the verbosity count to determine the logging level...
    if verbose > 0:
        logging.basicConfig(
            level=LOGGING_LEVELS[verbose]
            if verbose in LOGGING_LEVELS
            else logging.DEBUG
        )
        click.echo(
            click.style(
                f"Verbose logging is enabled. "
                f"(LEVEL={logging.getLogger().getEffectiveLevel()})",
                fg="yellow",
            )
        )
    info.verbose = verbose


@cli.command()
@pass_info
def hello(_: Info):
    """
    Say 'hello' to the nice people.
    """
    click.echo(f"meijer2 says 'hello'")


@cli.command()
@pass_info
def version():
    """
    Get the library version.
    """
    click.echo(click.style(f"{__version__}", bold=True))


@cli.group()
@click.option(
    "--prompt", "-p", is_flag=True, help="Prompt for mPerks username & password"
)
@pass_info
def list(info: Info, prompt: bool):
    """
    Meijer list manipulation.
    """
    if prompt:
        import getpass

        user = input("mPerks login (e-mail, phone): ")
        passwd = getpass.getpass()
        info.meijer = Meijer(f"{user}|{passwd}")
    else:
        info.meijer = Meijer()


@list.command()
@pass_info
def show(info: Info):
    """
    Show current shopping list.
    """
    for item in info.meijer.list.items:
        if item["isComplete"]:
            print(f"[✓] {item['itemDescription']}")
        else:
            print(f"[ ] {item['itemDescription']}")


@list.command()
@pass_info
def add(info: Info):
    """
    Add items to shopping list.
    """
    print("Enter your shopping list. Complete with a blank line.")
    while True:
        item = input("- ")
        if len(item) == 0:
            break
        info.meijer.list.add(item)


@list.command()
@pass_info
def clear(info: Info):
    """
    Clear current shopping list.
    """
    info.meijer.list.clear()
