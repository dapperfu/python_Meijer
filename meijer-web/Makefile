# Meijer Web Application Makefile
# ===============================

# Configuration - can be overridden with environment variables
FLASK_HOST ?= 127.0.0.1
FLASK_PORT ?= 5000
FLASK_ENV ?= development
FLASK_DEBUG ?= 1

# Python and virtual environment
PYTHON = python
VENV = venv
VENV_BIN = $(VENV)/bin

# Application files
APP_DIR = app
RUN_FILE = run.py
REQUIREMENTS = requirements.txt

# Development tools
RUFF = ruff
FORMAT = ruff format
LINT = ruff check

# Default target
.DEFAULT_GOAL := help

.PHONY: help install dev run kill format lint clean test

help: ## Show this help message
	@echo "Meijer Web Application - Available Commands:"
	@echo ""
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "  \033[36m%-15s\033[0m %s\n", $$1, $$2}'
	@echo ""
	@echo "Environment Variables:"
	@echo "  FLASK_HOST    Server host (default: 127.0.0.1)"
	@echo "  FLASK_PORT    Server port (default: 5000)"
	@echo "  FLASK_ENV     Environment (default: development)"
	@echo "  FLASK_DEBUG   Debug mode (default: 1)"

install: ## Install dependencies in virtual environment
	@echo "🔧 Installing dependencies..."
	@if [ ! -d "$(VENV)" ]; then \
		echo "📦 Creating virtual environment..."; \
		$(PYTHON) -m venv $(VENV); \
	fi
	@echo "📥 Installing packages from $(REQUIREMENTS)..."
	@$(VENV_BIN)/pip install -r $(REQUIREMENTS)
	@echo "✅ Dependencies installed successfully!"

dev: ## Start development server with auto-reload
	@echo "🚀 Starting development server..."
	@echo "📍 Host: $(FLASK_HOST)"
	@echo "🔌 Port: $(FLASK_PORT)"
	@echo "🐛 Debug: $(FLASK_DEBUG)"
	@echo "🌐 URL: http://$(FLASK_HOST):$(FLASK_PORT)"
	@echo "Press Ctrl+C to stop"
	@FLASK_HOST=$(FLASK_HOST) FLASK_PORT=$(FLASK_PORT) FLASK_ENV=$(FLASK_ENV) FLASK_DEBUG=$(FLASK_DEBUG) $(VENV_BIN)/python $(RUN_FILE)

run: ## Start production server in background
	@echo "🚀 Starting production server in background..."
	@echo "📍 Host: $(FLASK_HOST)"
	@echo "🔌 Port: $(FLASK_PORT)"
	@echo "🌐 URL: http://$(FLASK_HOST):$(FLASK_PORT)"
	@nohup FLASK_HOST=$(FLASK_HOST) FLASK_PORT=$(FLASK_PORT) FLASK_ENV=production FLASK_DEBUG=0 $(VENV_BIN)/python $(RUN_FILE) > logs/app.log 2>&1 &
	@echo "✅ Server started in background. Check logs/app.log for output."
	@echo "💡 Use 'make kill' to stop the server"

kill: ## Stop the running web server
	@echo "🛑 Stopping web server..."
	@-pkill -f "python $(RUN_FILE)" || echo "No server process found"
	@-pkill -f "flask run" || echo "No Flask process found"
	@echo "✅ Server stopped"

format: ## Format code using ruff
	@echo "🎨 Formatting code with ruff..."
	@$(VENV_BIN)/$(FORMAT) $(APP_DIR) $(RUN_FILE)
	@echo "✅ Code formatted successfully!"

lint: ## Lint code using ruff
	@echo "🔍 Linting code with ruff..."
	@$(VENV_BIN)/$(LINT) $(APP_DIR) $(RUN_FILE)
	@echo "✅ Code linted successfully!"

format-lint: format lint ## Format and lint code

clean: ## Clean up temporary files and logs
	@echo "🧹 Cleaning up..."
	@rm -rf __pycache__/
	@rm -rf $(APP_DIR)/**/__pycache__/
	@rm -rf .pytest_cache/
	@rm -rf logs/*.log
	@rm -rf .ruff_cache/
	@echo "✅ Cleanup completed!"

test: ## Run tests
	@echo "🧪 Running tests..."
	@$(VENV_BIN)/python -m pytest tests/ -v

logs: ## Show recent application logs
	@echo "📋 Recent application logs:"
	@tail -f logs/app.log

status: ## Check if server is running
	@echo "🔍 Checking server status..."
	@if pgrep -f "python $(RUN_FILE)" > /dev/null; then \
		echo "✅ Server is running"; \
		ps aux | grep "python $(RUN_FILE)" | grep -v grep; \
	else \
		echo "❌ Server is not running"; \
	fi

restart: kill run ## Restart the server

# Development helpers
setup: install format-lint ## Complete development setup
	@echo "🎉 Development environment is ready!"
	@echo "💡 Use 'make dev' to start the development server"

# Production helpers
deploy: clean install format-lint test ## Prepare for production deployment
	@echo "🚀 Application ready for deployment!"

# Show current configuration
config: ## Show current configuration
	@echo "⚙️  Current Configuration:"
	@echo "  FLASK_HOST: $(FLASK_HOST)"
	@echo "  FLASK_PORT: $(FLASK_PORT)"
	@echo "  FLASK_ENV: $(FLASK_ENV)"
	@echo "  FLASK_DEBUG: $(FLASK_DEBUG)"
	@echo "  PYTHON: $(PYTHON)"
	@echo "  VENV: $(VENV)"
