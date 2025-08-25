# Makefile for meijer-wx
# wxPython GUI for python_Meijer v2

# Variables
PYTHON := python3
VENV := venv
VENV_BIN := ${VENV}/bin
PIP := ${VENV_BIN}/pip
PYTHON_VENV := ${VENV_BIN}/python
RUFF := ${VENV_BIN}/ruff
MYPY := ${VENV_BIN}/mypy
PYTEST := ${VENV_BIN}/pytest
PYINSTALLER := ${VENV_BIN}/pyinstaller

# Application name and version
APP_NAME := meijer-wx
APP_VERSION := 1.0.0

# Source directories
SRC_DIR := .
UI_DIR := ${SRC_DIR}/ui
SERVICES_DIR := ${SRC_DIR}/services
MODELS_DIR := ${SRC_DIR}/models
CONTROLLERS_DIR := ${SRC_DIR}/controllers
ASSETS_DIR := ${SRC_DIR}/assets
TESTS_DIR := ${SRC_DIR}/tests

# Python source files
PYTHON_FILES := $(shell find ${SRC_DIR} -name "*.py" -not -path "${VENV}/*")
UI_FILES := $(shell find ${UI_DIR} -name "*.py" -not -path "${VENV}/*")
SERVICES_FILES := $(shell find ${SERVICES_DIR} -name "*.py" -not -path "${VENV}/*")
MODELS_FILES := $(shell find ${MODELS_DIR} -name "*.py" -not -path "${VENV}/*")
CONTROLLERS_FILES := $(shell find ${CONTROLLERS_DIR} -name "*.py" -not -path "${VENV}/*")

# Build directories
BUILD_DIR := build
DIST_DIR := dist
SPEC_DIR := specs

# Default target
.PHONY: all
all: venv install lint format test build

# Virtual environment setup
.PHONY: venv
venv: ${VENV}

${VENV}:
	${PYTHON} -m venv ${VENV}
	${PIP} install --upgrade pip setuptools wheel

# Install dependencies
.PHONY: install
install: ${VENV} requirements.txt
	${PIP} install -r requirements.txt

# Install development dependencies
.PHONY: install-dev
install-dev: ${VENV} requirements-dev.txt
	${PIP} install -r requirements-dev.txt

# Lint code with ruff
.PHONY: lint
lint: ${VENV}
	${RUFF} check ${PYTHON_FILES}

# Format code with ruff
.PHONY: format
format: ${VENV}
	${RUFF} format ${PYTHON_FILES}

# Type checking with mypy
.PHONY: typecheck
typecheck: ${VENV}
	${MYPY} ${PYTHON_FILES}

# Run tests
.PHONY: test
test: ${VENV}
	${PYTEST} ${TESTS_DIR} -v --cov=${SRC_DIR} --cov-report=html --cov-report=term

# Run tests with coverage report
.PHONY: test-cov
test-cov: ${VENV}
	${PYTEST} ${TESTS_DIR} -v --cov=${SRC_DIR} --cov-report=html --cov-report=term --cov-report=xml

# Clean build artifacts
.PHONY: clean
clean:
	rm -rf ${BUILD_DIR}
	rm -rf ${DIST_DIR}
	rm -rf ${SPEC_DIR}
	rm -rf *.spec
	find . -type d -name "__pycache__" -exec rm -rf {} +
	find . -type f -name "*.pyc" -delete
	find . -type f -name "*.pyo" -delete
	find . -type f -name "*.pyd" -delete
	find . -type f -name ".coverage" -delete
	rm -rf htmlcov
	rm -rf .pytest_cache
	rm -rf .ruff_cache
	rm -rf .mypy_cache

# Clean virtual environment
.PHONY: clean-venv
clean-venv:
	rm -rf ${VENV}

# Full clean
.PHONY: clean-all
clean-all: clean clean-venv

# Build executable with PyInstaller
.PHONY: build
build: ${VENV} ${PYTHON_FILES}
	${PYINSTALLER} --onefile --windowed --name=${APP_NAME} ${SRC_DIR}/app.py

# Build executable for specific platform
.PHONY: build-linux
build-linux: ${VENV} ${PYTHON_FILES}
	${PYINSTALLER} --onefile --windowed --name=${APP_NAME}-linux ${SRC_DIR}/app.py

.PHONY: build-windows
build-windows: ${VENV} ${PYTHON_FILES}
	${PYINSTALLER} --onefile --windowed --name=${APP_NAME}-windows ${SRC_DIR}/app.py

.PHONY: build-macos
build-macos: ${VENV} ${PYTHON_FILES}
	${PYINSTALLER} --onefile --windowed --name=${APP_NAME}-macos ${SRC_DIR}/app.py

# Build one-folder distribution
.PHONY: build-folder
build-folder: ${VENV} ${PYTHON_FILES}
	${PYINSTALLER} --onedir --windowed --name=${APP_NAME}-folder ${SRC_DIR}/app.py

# Run the application
.PHONY: run
run: ${VENV}
	${PYTHON_VENV} ${SRC_DIR}/app.py

# Run with development mode
.PHONY: run-dev
run-dev: ${VENV}
	${PYTHON_VENV} -m wxmeijer.app

# Run tests in watch mode
.PHONY: test-watch
test-watch: ${VENV}
	${PYTEST} ${TESTS_DIR} -f --cov=${SRC_DIR}

# Check code quality
.PHONY: check
check: lint typecheck

# Fix code issues automatically
.PHONY: fix
fix: format
	${RUFF} check --fix ${PYTHON_FILES}

# Generate requirements from current environment
.PHONY: freeze
freeze: ${VENV}
	${PIP} freeze > requirements-frozen.txt

# Install pre-commit hooks
.PHONY: pre-commit
pre-commit: ${VENV}
	${VENV_BIN}/pre-commit install

# Run pre-commit on all files
.PHONY: pre-commit-all
pre-commit-all: ${VENV}
	${VENV_BIN}/pre-commit run --all-files

# Package for distribution
.PHONY: package
package: clean build
	mkdir -p ${DIST_DIR}
	cp -r ${BUILD_DIR}/* ${DIST_DIR}/
	tar -czf ${APP_NAME}-${APP_VERSION}.tar.gz ${DIST_DIR}

# Help target
.PHONY: help
help:
	@echo "Available targets:"
	@echo "  all              - Run full development cycle (venv, install, lint, format, test, build)"
	@echo "  venv             - Create virtual environment"
	@echo "  install          - Install dependencies"
	@echo "  install-dev      - Install development dependencies"
	@echo "  lint             - Run ruff linter"
	@echo "  format           - Format code with ruff"
	@echo "  typecheck        - Run mypy type checking"
	@echo "  test             - Run tests with coverage"
	@echo "  test-cov         - Run tests with detailed coverage report"
	@echo "  test-watch       - Run tests in watch mode"
	@echo "  check            - Run lint and typecheck"
	@echo "  fix              - Auto-fix code issues"
	@echo "  build            - Build executable with PyInstaller"
	@echo "  build-folder     - Build one-folder distribution"
	@echo "  build-linux      - Build for Linux"
	@echo "  build-windows    - Build for Windows"
	@echo "  build-macos      - Build for macOS"
	@echo "  run              - Run the application"
	@echo "  run-dev          - Run in development mode"
	@echo "  package          - Create distribution package"
	@echo "  pre-commit       - Install pre-commit hooks"
	@echo "  pre-commit-all   - Run pre-commit on all files"
	@echo "  freeze           - Generate requirements from current environment"
	@echo "  clean            - Clean build artifacts"
	@echo "  clean-venv       - Clean virtual environment"
	@echo "  clean-all        - Clean everything"
	@echo "  help             - Show this help message"

# Development workflow targets
.PHONY: dev-setup
dev-setup: venv install install-dev pre-commit

.PHONY: dev-cycle
dev-cycle: lint format typecheck test

.PHONY: release
release: clean-all dev-setup dev-cycle build package

# Dependencies
${PYTHON_FILES}: ${VENV}

# Ensure virtual environment exists for pip commands
${PIP}: ${VENV}

# Ensure virtual environment exists for python commands
${PYTHON_VENV}: ${VENV}

# Ensure virtual environment exists for tools
${RUFF}: ${VENV}
${MYPY}: ${VENV}
${PYTEST}: ${VENV}
${PYINSTALLER}: ${VENV}

# Default target
.DEFAULT_GOAL := help
