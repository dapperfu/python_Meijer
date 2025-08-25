# Core functionality for Meijer API Client
# Virtual environment management and authentication

.PHONY: venv
venv: ${VENV}

${VENV}:
	@python3 -mvenv ${@}
	@${VENV}/bin/pip install --upgrade pip setuptools wheel
	@${VENV}/bin/pip install --upgrade --requirement requirements.txt

.PHONY: auth
auth:
	@if [ -n "$(FILE)" ]; then \
		LOG_FILE="$(FILE)"; \
		echo "📋 Using specified log file: $$LOG_FILE"; \
	else \
		echo "🔍 Finding most recent log file..."; \
		LATEST_LOG=$$(ls -t logs/meijer_mitm_*.log 2>/dev/null | head -1); \
		if [ -n "$$LATEST_LOG" ]; then \
			LOG_FILE="$$LATEST_LOG"; \
			echo "📋 Using most recent log: $$LATEST_LOG"; \
		else \
			echo "❌ No log files found in logs/ directory. Run 'make log' first to capture traffic."; \
			exit 1; \
		fi; \
	fi; \
	echo "🔄 Extracting authentication tokens from $$LOG_FILE..."; \
	venv/bin/python -m meijer.cli auth --log-file "$$LOG_FILE" && \
	echo "✅ Authentication updated successfully from $$LOG_FILE"

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
