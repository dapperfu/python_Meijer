
# Python Bits
VENV?=venv

.PHONY: help
help:
	@echo "🚀 Meijer API Client - Available Commands"
	@echo "=========================================="
	@echo ""
	@echo "📱 Traffic Capture:"
	@echo "  make log          - Start mitmweb with automatic log rotation (at :00/:30)"
	@echo "  make logs         - Show available log files"
	@echo "  make rotate-logs  - Manually rotate current log file"
	@echo ""
	@echo "🔑 Authentication:"
	@echo "  make auth         - Extract tokens from most recent log file"
	@echo "  make auth FILE=logfile.log - Extract from specific log file"
	@echo ""
	@echo "🛠️  Development:"
	@echo "  make venv         - Create/update virtual environment"
	@echo "  make notebook     - Start Jupyter notebook"
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
	@echo "  1. make log       - Start capturing traffic (auto-rotates at :00/:30)"
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
	@echo "🚀 Starting mitmweb with automatic log rotation every 30 minutes..."
	@echo "📱 Use the Meijer app while this is running"
	@echo "🌐 Web interface available at http://localhost:8081"
	@echo "🔌 SOCKS5 proxy available on 0.0.0.0:1080"
	@echo "🌍 HTTP proxy available on 0.0.0.0:8080"
	@echo "⏹️  Press Ctrl+C when done"
	@echo "🔑 After stopping, run 'make auth' to extract authentication tokens"
	@echo "🔄 Logs automatically rotate at :00 and :30 of each hour"
	@echo ""
	@mkdir -p logs
	@echo "📁 Logs will be stored in logs/ directory"
	@echo ""
	@bash -c 'set -eu; trap "echo; echo \"🔄 Stopping mitmweb and rotation...\"; exit 0" INT TERM; while true; do minute=$$(date +%M); rounded=$$(printf "%02d" $$(( (10#$$minute/30)*30 ))); ts=$$(date +%Y%m%d_%H)$${rounded}; LOG_FILE="logs/meijer_mitm_$${ts}.log"; echo "📝 Starting capture session at $$(date)"; echo "📝 Log file: $$LOG_FILE"; next_hour=$$(($$(date +%H) + ($$minute >= 30 ? 1 : 0))); next_min=$$(($$minute >= 30 ? 0 : 30)); printf "⏰ Next rotation at: %02d:%02d\n" $$next_hour $$next_min; echo ""; timeout --foreground -k 5s 30m mitmweb --mode wireguard --mode regular@0.0.0.0:8080 --mode socks5@0.0.0.0:1080 --web-port 8081 --web-host 0.0.0.0 -w "$$LOG_FILE" -s tools/shop_n_scan_faker.py --set block_global=false || (echo "⚠️  mitmweb exited, restarting in 5 seconds..."; sleep 5); echo "🔄 Rotated at $$(date)"; echo ""; done'



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
	@echo "        opts=\"help venv notebook regenerate-notebooks execute-notebooks notebook-workflow demos log logs rotate-logs auth clean completion completion-bash completion-install\""
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
