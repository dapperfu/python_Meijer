# Development Directory

This directory contains all development and testing files that are not part of the main test suite.

## Contents

- **Test Files**: Various test scripts for authentication, OAuth flows, Selenium testing, and debugging
- **Debug Scripts**: Scripts used for troubleshooting and development purposes
- **Experimental Tests**: Test files that explore different approaches or are work-in-progress

## Purpose

These files are kept separate from the main `tests/` directory because they are:
- Development-specific tests
- Debugging utilities
- Experimental approaches
- Not part of the core test suite

## Usage

Run these files individually for specific testing or debugging purposes. They are not included in the main test runner.

## Organization

- `test_selenium_*.py` - Selenium-based authentication tests
- `test_oauth2_*.py` - OAuth2 flow testing
- `test_hybrid_*.py` - Hybrid authentication approaches
- `test_idx_*.py` - IDX-specific testing
- `test_*_debug.py` - Debug-specific test files
