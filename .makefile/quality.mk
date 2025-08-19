# Code Quality Sub-Makefile
# Contains targets for code formatting, linting, and cleaning

.PHONY: clean
clean:
	@echo "🧹 Cleaning up build artifacts..."
	@rm -rf build/
	@rm -rf dist/
	@rm -rf *.egg-info/
	@rm -rf __pycache__/
	@rm -rf .pytest_cache/
	@rm -rf htmlcov/
	@rm -rf .coverage
	@echo "✅ Build artifacts cleaned up"

.PHONY: ruff-format
ruff-format:
	@echo "🎨 Formatting Python code with ruff..."
	@${VENV}/bin/ruff format meijer/ tools/ *.py
	@echo "✅ Code formatting completed"

.PHONY: ruff-check
ruff-check:
	@echo "🔍 Checking Python code with ruff..."
	@${VENV}/bin/ruff check meijer/ tools/ *.py
	@echo "✅ Code checking completed"

.PHONY: ruff-lint
ruff-lint:
	@echo "🧹 Linting Python code with ruff..."
	@${VENV}/bin/ruff check --fix meijer/ tools/ *.py
	@echo "✅ Code linting completed"

.PHONY: ruff-all
ruff-all: ruff-format ruff-check ruff-lint
	@echo "🚀 All ruff operations completed!"
