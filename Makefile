# Meijer API Client - Main Makefile
# This Makefile provides a modular structure for different functionality groups

# Configuration
VENV?=venv

# Include all modular makefile components
include .makefile/core.mk
include .makefile/development.mk
include .makefile/traffic.mk
include .makefile/quality.mk
include .makefile/documentation.mk
include .makefile/completion.mk
include .makefile/version.mk

# Default target
.PHONY: help
help:
	@echo "🚀 Meijer API Client - Available Commands"
	@echo "=========================================="
	@echo ""
	@echo "📱 Traffic Capture:"
	@echo "  make log          - Start mitmweb with automatic log rotation (at :00)"
	@echo "  make logs         - Show available log files"
	@echo "  make rotate-logs  - Manually rotate current log file"
	@echo ""
	@echo "🔑 Authentication:"
	@echo "  make auth         - Extract tokens from most recent log file"
	@echo "  make auth FILE=logfile.log - Extract from specific log file"
	@echo ""
	@echo "🛠️  Development:"
	@echo "  make venv         - Create/update virtual environment"
	@echo "  make notebook     - Start Jupyter notebook"
	@echo "  make version      - Show current version"
	@echo "  make version-bump - Bump version (patch/minor/major)"
	@echo "  make version-sync - Synchronize versions across all files"
	@echo "  make regenerate-notebooks - Regenerate all notebooks from generation scripts"
	@echo "  make execute-notebooks   - Execute all notebooks to show outputs"
	@echo "  make notebook-workflow   - Complete notebook regeneration and execution"
	@echo "  make demos        - Run all demo scripts in demos/ directory"
	@echo "  make clean        - Clean build artifacts"
	@echo ""
	@echo "🎨 Code Quality:"
	@echo "  make ruff-format  - Format Python code with ruff"
	@echo "  make ruff-check   - Check Python code with ruff"
	@echo "  make ruff-lint    - Lint and fix Python code with ruff"
	@echo "  make ruff-all     - Run all ruff operations"
	@echo ""
	@echo "📚 Documentation:"
	@echo "  make docs         - Generate documentation with pdoc"
	@echo "  make docs-serve   - Serve documentation locally"
	@echo "  make docs-deploy  - Deploy documentation to GitHub Pages"
	@echo "  make docs-validate - Validate documentation standards"
	@echo ""
	@echo "⌨️  Bash Completion:"
	@echo "  make completion   - Show completion installation instructions"
	@echo "  make completion-install - Install completion in ~/.bashrc"
	@echo "  make completion-test    - Test completion functionality"
	@echo ""
	@echo "💡 Workflow:"
	@echo "  1. make log       - Start capturing traffic (auto-rotates at :00)"
	@echo "  2. Use Meijer app - Generate traffic to capture"
	@echo "  3. Ctrl+C         - Stop mitmweb and rotation"
	@echo "  4. make auth      - Extract authentication tokens"
	@echo "  💡 Logs stored in logs/ directory and rotate automatically"
	@echo ""
	@echo "📚 For more info, see README.md"
