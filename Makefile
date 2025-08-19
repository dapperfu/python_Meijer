# Meijer API Client - Main Makefile
# This Makefile includes modular sub-makefiles for different functionality areas

# Configuration
VENV?=venv

# Include all sub-makefiles
include .makefile/*.mk

# Default target
.PHONY: help
help:
	@echo "🚀 Meijer API Client - Available Commands"
	@echo "=========================================="
	@echo ""
	@echo "📱 Traffic Capture:"
	@echo "  make log          - Start mitmweb to capture Meijer app traffic"
	@echo "  make logs         - Show available log files"
	@echo ""
	@echo "🔑 Authentication:"
	@echo "  make auth         - Extract tokens from most recent log file"
	@echo "  make auth FILE=logfile.log - Extract from specific log file"
	@echo ""
	@echo "🛠️  Development:"
	@echo "  make venv         - Create/update virtual environment"
	@echo "  make notebook     - Start Jupyter notebook"
	@echo "  make notebooks-gen - Generate all notebooks from Python generators"
	@echo "  make notebooks-execute - Execute all notebooks in-place"
	@echo "  make notebooks-gen-execute - Generate and execute all notebooks"
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
	@echo "  1. make log       - Start capturing traffic"
	@echo "  2. Use Meijer app - Generate traffic to capture"
	@echo "  3. Ctrl+C         - Stop mitmweb"
	@echo "  4. make auth      - Extract authentication tokens"
	@echo ""
	@echo "📚 For more info, see README.md"
