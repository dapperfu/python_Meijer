# Traffic capture functionality for Meijer API Client
# Simple mitmweb with hourly log rotation

.PHONY: log
log:
	@echo "🚀 Starting mitmweb with automatic log rotation every hour..."
	@echo "📱 Use the Meijer app while this is running"
	@echo "🌐 Web interface available at http://localhost:8081"
	@echo "🔌 SOCKS5 proxy available on 0.0.0.0:1080"
	@echo "🌍 HTTP proxy available on 0.0.0.0:8080"
	@echo "⏹️  Press Ctrl+C when done"
	@echo "🔑 After stopping, run 'make auth' to extract authentication tokens"
	@echo "🔄 Logs automatically rotate at :00 of each hour"
	@echo ""
	@mkdir -p logs
	@echo "📁 Logs will be stored in logs/ directory"
	@echo ""
	@bash -c 'set -eu; trap "echo; echo \"🔄 Stopping mitmweb and rotation...\"; exit 0" INT TERM; while true; do current_hour=$$(date +%H); ts=$$(date +%Y%m%d_$${current_hour})00; LOG_FILE="logs/meijer_mitm_$${ts}.log"; echo "📝 Starting capture session at $$(date)"; echo "📝 Log file: $$LOG_FILE"; next_hour=$$(($$current_hour + 1)); printf "⏰ Next rotation at: %02d:00:00\n" $$next_hour; echo ""; echo "🚀 Starting mitmweb..."; mitmweb --mode wireguard --mode regular@0.0.0.0:8080 --mode socks5@0.0.0.0:1080 --web-port 8081 --web-host 0.0.0.0 -w "$$LOG_FILE" -s tools/shop_n_scan_faker.py --set block_global=false; echo "🔄 Rotating log and restarting in 5 seconds..."; sleep 5; echo ""; done'

.PHONY: logs
logs:
	@echo "📁 Available log files:"
	@if [ -d "logs" ]; then \
		ls -la logs/meijer_mitm_*.log 2>/dev/null | head -10 || echo "❌ No log files found in logs/ directory"; \
	else \
		echo "❌ No logs/ directory found"; \
	fi
	@echo ""
	@echo "💡 Use 'make auth' to extract tokens from the most recent log file"
	@echo "💡 Or specify a specific file: 'make auth FILE=logs/meijer_mitm_20250117_191500.log'"

.PHONY: rotate-logs
rotate-logs:
	@echo "🔄 Manually rotating current log file..."
	@if [ -d "logs" ]; then \
		CURRENT_LOG=$$(ls -t logs/meijer_mitm_*.log 2>/dev/null | head -1) && \
		if [ -n "$$CURRENT_LOG" ]; then \
			ROTATED_LOG="logs/meijer_mitm_$$(date +%Y%m%d_%H%M%S).log" && \
			echo "📝 Rotating $$CURRENT_LOG to $$ROTATED_LOG" && \
			mv "$$CURRENT_LOG" "$$ROTATED_LOG" && \
			echo "✅ Log rotated successfully" && \
			echo "📁 New current log: $$ROTATED_LOG"; \
		else \
			echo "❌ No log files found to rotate"; \
		fi; \
	else \
		echo "❌ No logs/ directory found"; \
	fi
