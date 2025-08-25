# Traffic capture functionality for Meijer API Client
# Simple mitmweb without log rotation

.PHONY: log
log:
	@echo "🚀 Starting mitmweb..."
	@echo "📱 Use the Meijer app while this is running"
	@echo "🌐 Web interface available at http://localhost:8081"
	@echo "🔌 SOCKS5 proxy available on 0.0.0.0:1080"
	@echo "🌍 HTTP proxy available on 0.0.0.0:8080"
	@echo "⏹️  Press Ctrl+C when done"
	@echo "🔑 After stopping, run 'make auth' to extract authentication tokens"
	@echo ""
	@mkdir -p logs
	@echo "📁 Logs will be stored in logs/ directory"
	@echo ""
	@mitmweb --mode wireguard --mode regular@0.0.0.0:8080 --mode socks5@0.0.0.0:1080 --web-port 8081 --web-host 0.0.0.0 -w "logs/meijer_mitm_$(shell date +%Y%m%d_%H%M%S).log" -s tools/shop_n_scan_faker.py --set block_global=false

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
