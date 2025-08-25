# Traffic capture functionality for Meijer API Client
# mitmweb, log management, and crash analysis

.PHONY: log
log:
	@echo "🚀 Starting mitmweb with automatic log rotation every hour..."
	@echo "📱 Use the Meijer app while this is running"
	@echo "🌐 Web interface available at http://localhost:8081"
	@echo "🔌 SOCKS5 proxy available on 0.0.0.0:1080"
	@echo "🌍 HTTP proxy available on 0.0.0.0:8080"
	@echo "⏹️  Press Ctrl+C when done"
	@echo "🔑 After stopping, run 'make auth' to extract authentication tokens"
	@echo "🔄 Logs automatically rotate at :00 of each hour (24 files per day)"
	@echo ""
	@mkdir -p logs
	@echo "📁 Logs will be stored in logs/ directory"
	@echo ""
	@bash -c 'set -eu; trap "echo; echo \"🔄 Stopping mitmweb and rotation...\"; exit 0" INT TERM; while true; do current_hour=$$(date +%H); ts=$$(date +%Y%m%d_$${current_hour})00; LOG_FILE="logs/meijer_mitm_$${ts}.log"; echo "📝 Starting capture session at $$(date)"; echo "📝 Log file: $$LOG_FILE"; next_hour=$$(($$current_hour + 1)); printf "⏰ Next rotation at: %02d:00:00\n" $$next_hour; echo ""; echo "🚀 Starting mitmweb..."; mitmweb --mode wireguard --mode regular@0.0.0.0:8080 --mode socks5@0.0.0.0:1080 --web-port 8081 --web-host 0.0.0.0 -w "$$LOG_FILE" -s tools/shop_n_scan_faker.py --set block_global=false; EXIT_CODE=$$?; echo "⚠️  mitmweb exited with code $$EXIT_CODE at $$(date)"; if [ $$EXIT_CODE -eq 0 ]; then echo "✅ mitmweb exited normally"; else echo "❌ mitmweb crashed or was killed (exit code: $$EXIT_CODE)"; fi; echo "🔄 Rotating log and restarting in 5 seconds..."; sleep 5; echo ""; done'

.PHONY: log-debug
log-debug:
	@echo "🐛 Starting mitmweb with enhanced debugging and crash detection..."
	@echo "📱 Use the Meijer app while this is running"
	@echo "🌐 Web interface available at http://localhost:8081"
	@echo "🔌 SOCKS5 proxy available on 0.0.0.0:1080"
	@echo "🌍 HTTP proxy available on 0.0.0.0:8080"
	@echo "⏹️  Press Ctrl+C when done"
	@echo "🔑 After stopping, run 'make auth' to extract authentication tokens"
	@echo "🔄 Logs automatically rotate at :00 of each hour (24 files per day)"
	@echo "🐛 Enhanced crash detection and logging enabled"
	@echo ""
	@mkdir -p logs
	@echo "📁 Logs will be stored in logs/ directory"
	@echo ""
	@bash -c 'set -eu; trap "echo; echo \"🔄 Stopping mitmweb and rotation...\"; exit 0" INT TERM; while true; do current_hour=$$(date +%H); ts=$$(date +%Y%m%d_$${current_hour})00; LOG_FILE="logs/meijer_mitm_$${ts}.log"; DEBUG_LOG="logs/mitmweb_debug_$$(date +%Y%m%d_%H%M%S).log"; echo "📝 Starting capture session at $$(date)"; echo "📝 Log file: $$LOG_FILE"; echo "🐛 Debug log: $$DEBUG_LOG"; next_hour=$$(($$current_hour + 1)); printf "⏰ Next rotation at: %02d:00:00\n" $$next_hour; echo ""; echo "🚀 Starting mitmweb with debug output..."; (mitmweb --mode wireguard --mode regular@0.0.0.0:8080 --mode socks5@0.0.0.0:1080 --web-port 8081 --web-host 0.0.0.0 -w "$$LOG_FILE" -s tools/shop_n_scan_faker.py --set block_global=false 2>&1 | tee "$$DEBUG_LOG") & MITMWEB_PID=$$!; echo "📱 mitmweb started with PID: $$MITMWEB_PID"; wait $$MITMWEB_PID; EXIT_CODE=$$?; echo "⚠️  mitmweb exited with code $$EXIT_CODE at $$(date)"; if [ $$EXIT_CODE -eq 0 ]; then echo "✅ mitmweb exited normally"; else echo "❌ mitmweb crashed or was killed (exit code: $$EXIT_CODE)"; echo "🐛 Check debug log: $$DEBUG_LOG"; fi; echo "🔄 Rotating log and restarting in 5 seconds..."; sleep 5; echo ""; done'

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

.PHONY: analyze-crashes
analyze-crashes:
	@echo "🔍 Analyzing mitmweb crash logs and debug files..."
	@echo "=================================================="
	@if [ -d "logs" ]; then \
		echo "📁 Checking for debug logs..."; \
		DEBUG_LOGS=$$(ls -t logs/mitmweb_debug_*.log 2>/dev/null | head -5); \
		if [ -n "$$DEBUG_LOGS" ]; then \
			echo "🐛 Found debug logs:"; \
			echo "$$DEBUG_LOGS" | while read log; do echo "  $$log"; done; \
			echo ""; \
			echo "📊 Latest debug log analysis:"; \
			LATEST_DEBUG=$$(ls -t logs/mitmweb_debug_*.log 2>/dev/null | head -1); \
			if [ -n "$$LATEST_DEBUG" ]; then \
				echo "🔍 Analyzing $$LATEST_DEBUG..."; \
				echo "📝 Last 20 lines:"; \
				tail -20 "$$LATEST_DEBUG" 2>/dev/null || echo "❌ Could not read debug log"; \
				echo ""; \
				echo "⚠️  Error lines (last 10):"; \
				grep -i "error\|exception\|traceback\|crash\|segfault\|killed" "$$LATEST_DEBUG" 2>/dev/null | tail -10 || echo "❌ No error patterns found"; \
			fi; \
		else \
			echo "❌ No debug logs found. Use 'make log-debug' to capture debug output."; \
		fi; \
		echo ""; \
		echo "📊 Recent log file sizes (potential crashes):"; \
		ls -la logs/meijer_mitm_*.log 2>/dev/null | grep -E "\.log$$" | sort -k5 -n | tail -10 | while read line; do echo "  $$line"; done || echo "❌ No log files found"; \
		echo ""; \
		echo "💡 Small log files (< 1KB) may indicate crashes"; \
		echo "💡 Use 'make log-debug' for enhanced crash detection"; \
	else \
		echo "❌ No logs/ directory found"; \
	fi

.PHONY: check-system
check-system:
	@echo "🔍 Checking system resources and potential crash causes..."
	@echo "========================================================"
	@echo "💾 Memory usage:"; \
	free -h | grep -E "Mem|Swap" | while read line; do echo "  $$line"; done; \
	echo ""; \
	echo "💾 Disk space:"; \
	df -h . | while read line; do echo "  $$line"; done; \
	echo ""; \
	echo "📊 Process limits:"; \
	echo "  File descriptors: $$(ulimit -n)"; \
	echo "  Max processes: $$(ulimit -u)"; \
	echo "  Max memory: $$(ulimit -v)"; \
	echo ""; \
	echo "🐛 Python/mitmweb processes:"; \
	ps aux | grep -E "(mitmweb|python)" | grep -v grep | head -5 | while read line; do echo "  $$line"; done || echo "  No mitmweb/python processes found"; \
	echo ""; \
	echo "💡 High memory usage or low disk space can cause crashes"; \
	echo "💡 Check for zombie processes or resource exhaustion"

.PHONY: monitor-logs
monitor-logs:
	@echo "📊 Real-time log monitoring for mitmweb crashes..."
	@echo "================================================"
	@if [ -d "logs" ]; then \
		echo "🔍 Monitoring logs directory for changes..."; \
		echo "💡 Press Ctrl+C to stop monitoring"; \
		echo ""; \
		inotifywait -m -e modify,create,delete logs/ 2>/dev/null | while read path action file; do \
			if [[ "$$file" == *.log ]]; then \
				echo "📝 [$$(date '+%H:%M:%S')] $$action: $$file"; \
				if [[ "$$action" == "MODIFY" && "$$file" == meijer_mitm_*.log ]]; then \
					SIZE=$$(stat -c%s "logs/$$file" 2>/dev/null || echo "0"); \
					if [ "$$SIZE" -lt 1024 ]; then \
						echo "⚠️  WARNING: $$file is very small ($$SIZE bytes) - possible crash!"; \
					fi; \
				fi; \
			fi; \
		done || 		echo "❌ inotifywait not available. Install inotify-tools for real-time monitoring."; \
	else \
		echo "❌ No logs/ directory found"; \
	fi

.PHONY: test-mitmweb
test-mitmweb:
	@echo "🧪 Testing mitmweb startup and configuration..."
	@echo "============================================="
	@echo "🔍 Checking mitmweb installation..."
	@if command -v mitmweb >/dev/null 2>&1; then \
		echo "✅ mitmweb found: $$(which mitmweb)"; \
		echo "📋 Version: $$(mitmweb --version 2>&1 | head -1)"; \
	else \
		echo "❌ mitmweb not found in PATH"; \
		exit 1; \
	fi; \
	echo ""; \
	echo "🔍 Checking script file..."
	if [ -f "tools/shop_n_scan_faker.py" ]; then \
		echo "✅ Script file found: tools/shop_n_scan_faker.py"; \
	else \
		echo "❌ Script file not found: tools/shop_n_scan_faker.py"; \
		exit 1; \
	fi; \
	echo ""; \
	echo "🧪 Testing mitmweb startup (5 seconds)..."; \
	echo "💡 This will start mitmweb briefly to test configuration"; \
	timeout 5s mitmweb --mode regular@127.0.0.1:8080 --web-port 8081 --web-host 127.0.0.1 -s tools/shop_n_scan_faker.py --set block_global=false 2>&1 | head -20 || echo "⚠️  mitmweb startup test completed (timeout or exit)"; \
	echo ""; \
	echo "✅ mitmweb configuration test completed"

.PHONY: diagnose-crashes
diagnose-crashes: check-system analyze-crashes
	@echo "🔍 Comprehensive crash diagnosis completed!"
	@echo "=========================================="
	@echo "💡 Summary of findings:"; \
	echo "  - System resources checked"; \
	echo "  - Crash logs analyzed"; \
	echo "  - Debug files examined"; \
	echo ""; \
	echo "🚀 Next steps:"; \
	echo "  1. Use 'make test-mitmweb' to test configuration"; \
	echo "  2. Use 'make log-debug' for enhanced crash detection"; \
	echo "  3. Use 'make monitor-logs' for real-time monitoring"; \
	echo "  4. Check system resources if crashes persist"; \
	echo ""; \
	echo "📚 Common crash causes:"; \
	echo "  - Memory exhaustion (check with 'make check-system')"; \
	echo "  - Disk space issues"; \
	echo "  - Script errors in shop_n_scan_faker.py"; \
	echo "  - Network configuration problems"; \
	echo "  - Python environment issues"

.PHONY: clean-crash-logs
clean-crash-logs:
	@echo "🧹 Cleaning up old crash logs and debug files..."
	@echo "================================================"
	@if [ -d "logs" ]; then \
		echo "📁 Found logs directory"; \
		echo "🔍 Checking for old files to clean..."; \
		OLD_LOGS=$$(find logs/ -name "*.log" -mtime +7 2>/dev/null | wc -l); \
		DEBUG_LOGS=$$(find logs/ -name "mitmweb_debug_*.log" 2>/dev/null | wc -l); \
		echo "📊 Found $$OLD_LOGS old log files (>7 days)"; \
		echo "🐛 Found $$DEBUG_LOGS debug log files"; \
		echo ""; \
		if [ "$$OLD_LOGS" -gt 0 ]; then \
			echo "🗑️  Removing old log files (>7 days)..."; \
			find logs/ -name "*.log" -mtime +7 -delete 2>/dev/null; \
			echo "✅ Old log files cleaned up"; \
		else \
			echo "✅ No old log files to clean"; \
		fi; \
		if [ "$$DEBUG_LOGS" -gt 0 ]; then \
			echo "🗑️  Removing debug log files..."; \
			rm -f logs/mitmweb_debug_*.log 2>/dev/null; \
			echo "✅ Debug log files cleaned up"; \
		else \
			echo "✅ No debug log files to clean"; \
		fi; \
		echo ""; \
		echo "💾 Current disk usage:"; \
		du -sh logs/ 2>/dev/null || echo "❌ Could not check disk usage"; \
	else \
		echo "❌ No logs/ directory found"; \
	fi

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
