
# Python Bits
VENV?=venv

.PHONY: help
help:
	@echo "🚀 Meijer API Client - Available Commands"
	@echo "=========================================="
	@echo ""
	@echo "📱 Traffic Capture:"
	@echo "  make log          - Start mitmweb with automatic log rotation (at :00)"
	@echo "  make log-debug    - Start mitmweb with enhanced crash detection and debugging"
	@echo "  make logs         - Show available log files"
	@echo "  make analyze-crashes - Analyze mitmweb crash logs and debug files"
	@echo "  make check-system - Check system resources and potential crash causes"
	@echo "  make monitor-logs - Real-time monitoring of log files for crashes"
	@echo "  make test-mitmweb - Test mitmweb startup and configuration"
	@echo "  make diagnose-crashes - Comprehensive crash diagnosis and analysis"
	@echo "  make clean-crash-logs - Clean up old crash logs and debug files"
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

.PHONY: venv
venv: ${VENV}

${VENV}:
	@python3 -mvenv ${@}
	@${VENV}/bin/pip install --upgrade pip setuptools wheel
	@${VENV}/bin/pip install --upgrade --requirement requirements.txt

.PHONY: notebook
notebook:
	@${VENV}/bin/jupyter-notebook

.PHONY: regenerate-notebooks
regenerate-notebooks: ${VENV}
	@echo "🔄 Regenerating all Jupyter notebooks from generation scripts..."
	@echo "================================================================"
	@echo "💡 This will run all *_notebook_gen.py scripts to create fresh notebooks"
	@echo ""
	@cd notebooks && ../venv/bin/python regenerate_all_notebooks.py

.PHONY: execute-notebooks
execute-notebooks: ${VENV}
	@echo "🚀 Executing all Jupyter notebooks to demonstrate functionality..."
	@echo "================================================================="
	@echo "💡 This will run all notebooks and show execution outputs"
	@echo ""
	@cd notebooks && ../venv/bin/python execute_notebooks.py

.PHONY: notebook-workflow
notebook-workflow: regenerate-notebooks execute-notebooks
	@echo "🎉 Complete notebook workflow finished!"
	@echo "📚 Notebooks regenerated and executed successfully"

.PHONY: demos
demos: ${VENV}
	@echo "🚀 Running all demos in demos/ directory..."
	@echo "=============================================="
	@echo "💡 This will execute all Python demo scripts and report any errors or warnings"
	@echo ""
	@./demos/run_all_demos.sh

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
			echo "📋 Using most recent log: $$LOG_FILE"; \
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

# Documentation targets
.PHONY: docs
docs:
	@echo "📚 Generating documentation with pdoc..."
	@${VENV}/bin/pdoc -o docs meijer/
	@echo "✅ Documentation generated in docs/ directory"

.PHONY: docs-serve
docs-serve:
	@echo "🌐 Serving documentation locally..."
	@echo "📖 Open http://localhost:9999 in your browser"
	@echo "⏹️  Press Ctrl+C to stop"
	@${VENV}/bin/pdoc -p 9999 meijer/

.PHONY: docs-deploy
docs-deploy:
	@echo "🚀 Deploying documentation to GitHub Pages..."
	@./tools/deploy_docs.sh

.PHONY: docs-validate
docs-validate:
	@echo "🔍 Validating documentation standards..."
	@${VENV}/bin/python tools/doc_validator.py --verbose

# Bash Completion Support
.PHONY: completion
completion:
	@echo "🔧 Installing bash completion for make targets..."
	@echo ""
	@echo "📝 Add this to your ~/.bashrc or ~/.bash_profile:"
	@echo "  source <(make completion-bash)"
	@echo ""
	@echo "💡 Or run this command to install it:"
	@echo "  make completion-install"

.PHONY: completion-bash
completion-bash:
	@echo "# Meijer API Client Makefile Bash Completion"
	@echo "# Generated by 'make completion-bash'"
	@echo ""
	@echo "_meijer_make_completion() {"
	@echo "    local cur prev opts"
	@echo "    COMPREPLY=()"
	@echo "    cur=\"\$${COMP_WORDS[COMP_CWORD]}\""
	@echo "    prev=\"\$${COMP_WORDS[COMP_CWORD-1]}\""
	@echo ""
	@echo "    # Main make targets"
	@echo "    if [ \$${COMP_CWORD} -eq 1 ]; then"
	@echo "        opts=\"help venv notebook regenerate-notebooks execute-notebooks notebook-workflow demos log logs rotate-logs auth clean completion completion-bash completion-install version version-bump version-sync\""
	@echo "        COMPREPLY=( \$$(compgen -W \"\$$opts\" -- \$$cur) )"
	@echo "        return 0"
	@echo "    fi"
	@echo ""
	@echo "    # Handle FILE= parameter for auth target"
	@echo "    if [ \"\$$prev\" = \"auth\" ] || [ \"\$$prev\" = \"FILE=\" ]; then"
	@echo "        # Complete log files"
	@echo "        local log_files=\$$(ls logs/meijer_mitm_*.log 2>/dev/null | sed 's/^/FILE=/' 2>/dev/null || echo \"\")"
	@echo "        if [ -n \"\$$log_files\" ]; then"
	@echo "            COMPREPLY=( \$$(compgen -W \"\$$log_files\" -- \$$cur) )"
	@echo "        fi"
	@echo "        return 0"
	@echo "    fi"
	@echo ""
	@echo "    # Handle VENV= parameter for venv target"
	@echo "    if [ \"\$$prev\" = \"venv\" ] || [ \"\$$prev\" = \"VENV=\" ]; then"
	@echo "        COMPREPLY=( \$$(compgen -W \"venv venv2 venv3\" -- \$$cur) )"
	@echo "        return 0"
	@echo "    fi"
	@echo "}"
	@echo ""
	@echo "complete -F _meijer_make_completion make"

.PHONY: completion-install
completion-install:
	@echo "🔧 Installing bash completion for Meijer API Client..."
	@if [ -f ~/.bashrc ]; then \
		echo "" >> ~/.bashrc; \
		echo "# Meijer API Client bash completion" >> ~/.bashrc; \
		echo "source <(cd /projects/python_Meijer && make completion-bash)" >> ~/.bashrc; \
		echo "✅ Added to ~/.bashrc"; \
		echo "🔄 Run 'source ~/.bashrc' or start a new terminal to activate"; \
	elif [ -f ~/.bash_profile ]; then \
		echo "" >> ~/.bash_profile; \
		echo "# Meijer API Client bash completion" >> ~/.bash_profile; \
		echo "source <(cd /projects/python_Meijer && make completion-bash)" >> ~/.bash_profile; \
		echo "✅ Added to ~/.bash_profile"; \
		echo "🔄 Run 'source ~/.bash_profile' or start a new terminal to activate"; \
	else \
		echo "❌ No ~/.bashrc or ~/.bash_profile found"; \
		echo "💡 Create one of these files or manually add the completion source"; \
	fi

.PHONY: completion-test
completion-test:
	@echo "🧪 Testing bash completion..."
	@echo "💡 In a new terminal, try:"
	@echo "   make <TAB>                    # Should show all targets"
	@echo "   make auth FILE=<TAB>          # Should complete log files"
	@echo "   make venv VENV=<TAB>          # Should complete venv names"
	@echo ""
	@echo "🔧 If completion doesn't work, run:"
	@echo "   make completion-install"
	@echo "   source ~/.bashrc"

# Version Management with Hatch
.PHONY: version
version:
	@echo "📋 Current version information:"
	@echo "================================="
	@echo "meijer/__init__.py: $(shell grep '__version__' meijer/__init__.py | sed 's/__version__ = //' | tr -d '"')"
	@echo "pyproject.toml: dynamic (managed by Hatch)"
	@echo "hatch.toml: not set"
	@echo ""
	@echo "💡 Use 'make version-bump TYPE=patch|minor|major' to bump version"

.PHONY: version-bump
version-bump:
	@if [ -z "$(TYPE)" ]; then \
		echo "❌ Error: TYPE parameter required"; \
		echo "💡 Usage: make version-bump TYPE=patch|minor|major"; \
		echo "   patch: 3.2.0 → 3.2.1 (bug fixes)"; \
		echo "   minor: 3.2.0 → 3.3.0 (new features)"; \
		echo "   major: 3.2.0 → 4.0.0 (breaking changes)"; \
		exit 1; \
	fi; \
	echo "🚀 Bumping version $(TYPE)..."; \
	${VENV}/bin/python version_bump.py $(TYPE); \
	echo "✅ Version bumped successfully!"; \
	echo "📋 New version information:"; \
	$(MAKE) version

.PHONY: version-sync
version-sync:
	@echo "🔄 Synchronizing versions across all configuration files..."
	@${VENV}/bin/python hatch_build_hook.py
	@echo "✅ Version synchronization complete!"
	@$(MAKE) version
