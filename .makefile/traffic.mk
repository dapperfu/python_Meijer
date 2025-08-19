# Traffic Capture Sub-Makefile
# Contains targets for mitmweb traffic capture and authentication

.PHONY: log
log:
	@echo "🚀 Starting mitmweb with multiple listeners..."
	@echo "📱 Use the Meijer app while this is running"
	@echo "🌐 Web interface available at http://localhost:8081"
	@echo "🔌 SOCKS5 proxy available on 0.0.0.0:1080"
	@echo "🌍 HTTP proxy available on 0.0.0.0:8080"
	@echo "⏹️  Press Ctrl+C when done"
	@echo "🔑 After stopping, run 'make auth' to extract authentication tokens"
	@echo ""
	@LOG_FILE="meijer_mitm_$$(date +%Y%m%d_%H%M%S).log" && \
	echo "📝 Log file: $$LOG_FILE" && \
	mitmweb \
		--mode wireguard \
		--mode regular@0.0.0.0:8080 \
		--mode socks5@0.0.0.0:1080 \
		--web-port 8081 \
		--web-host 0.0.0.0 \
		-w "$$LOG_FILE" \
		-s shop_n_scan_faker.py \
		--set block_global=false

.PHONY: logs
logs:
	@echo "📁 Available log files:"
	@ls -la meijer_mitm_*.log 2>/dev/null | head -10 || echo "❌ No log files found"
	@echo ""
	@echo "💡 Use 'make auth' to extract tokens from the most recent log file"
	@echo "💡 Or specify a specific file: 'make auth FILE=meijer_mitm_20250117_191500.log'"

.PHONY: auth
auth:
	@echo "🔄 Extracting authentication tokens..."
	@venv/bin/meijer auth
