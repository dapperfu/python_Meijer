
# Python Bits
VENV?=venv

.PHONY: venv
venv: ${VENV}

${VENV}:
	@python3 -mvenv ${@}
	@${VENV}/bin/pip install --upgrade pip setuptools wheel
	@${VENV}/bin/pip install --upgrade --requirement requirements.txt

.PHONY: notebook
notebook:
	@${VENV}/bin/jupyter-notebook

.PHONY: log
log:
	@echo "🚀 Starting mitmweb with multiple listeners..."
	@echo "📱 Use the Meijer app while this is running"
	@echo "🌐 Web interface available at http://localhost:8081"
	@echo "🔌 SOCKS5 proxy available on 0.0.0.0:1080"
	@echo "🌍 HTTP proxy available on 0.0.0.0:8080"
	@echo "⏹️  Press Ctrl+C when done to extract auth and cleanup"
	@echo ""
	@LOG_FILE="meijer_mitm_$$(date +%Y%m%d_%H%M%S).log" && \
	mitmweb \
		--mode wireguard \
		--listen-host 0.0.0.0 \
		--listen-port 8080 \
		--socks5-listen-port 1080 \
		--socks5-listen-host 0.0.0.0 \
		-w "$$LOG_FILE" \
		-s shop_n_scan_faker.py \
		--set block_global=false || \
	(echo "" && \
	 echo "🔄 Extracting authentication tokens from $$LOG_FILE..." && \
	 python meijer_cli.py auth "$$LOG_FILE" && \
	 echo "✅ Authentication updated successfully!")
	@echo "📁 Log file preserved: $$LOG_FILE"
	@echo "💡 Use 'make auth' to extract tokens from any log file"

.PHONY: auth
auth:
	@echo "🔍 Finding most recent log file..."
	@LATEST_LOG=$$(ls -t meijer_mitm_*.log 2>/dev/null | head -1) && \
	if [ -n "$$LATEST_LOG" ]; then \
		echo "📋 Using most recent log: $$LATEST_LOG" && \
		python meijer_cli.py auth "$$LATEST_LOG" && \
		echo "✅ Authentication updated from $$LATEST_LOG"; \
	else \
		echo "❌ No log files found. Run 'make log' first to capture traffic."; \
		exit 1; \
	fi

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