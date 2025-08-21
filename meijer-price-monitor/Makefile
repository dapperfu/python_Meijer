# Makefile for Meijer Price Monitor
# This Makefile provides targets for setting up and managing the price monitoring system

.PHONY: help setup install-deps test clean cron-setup cron-remove cron-status run-monitors

# Default target
help:
	@echo "Meijer Price Monitor - Available targets:"
	@echo ""
	@echo "Setup targets:"
	@echo "  setup          - Set up the price monitoring system"
	@echo "  install-deps   - Install required Python dependencies"
	@echo "  test           - Run tests to verify setup"
	@echo ""
	@echo "Monitoring targets:"
	@echo "  run-monitors   - Run all configured price monitors"
	@echo "  init-monitor   - Initialize a new price monitor (interactive)"
	@echo ""
	@echo "Cron management:"
	@echo "  cron-setup     - Set up cron job for automated monitoring"
	@echo "  cron-remove    - Remove cron job for automated monitoring"
	@echo "  cron-status    - Show current cron configuration"
	@echo ""
	@echo "Maintenance:"
	@echo "  clean          - Clean up temporary files and logs"
	@echo "  logs           - Show recent monitoring logs"

# Check if virtual environment exists
venv:
	@if [ ! -d "venv" ]; then \
		echo "Creating virtual environment..."; \
		python3 -m venv venv; \
		echo "Virtual environment created. Activate it with: source venv/bin/activate"; \
	fi

# Install dependencies
install-deps: venv
	@echo "Installing Python dependencies..."
	@venv/bin/pip install --upgrade pip
	@venv/bin/pip install -r requirements.txt
	@echo "Dependencies installed successfully!"

# Setup the price monitoring system
setup: install-deps
	@echo "Setting up price monitoring system..."
	@mkdir -p price_data/{results,history,config,logs,executions}
	@echo "Price monitoring system setup complete!"
	@echo ""
	@echo "Next steps:"
	@echo "1. Run 'make init-monitor' to create your first price monitor"
	@echo "2. Run 'make cron-setup' to set up automated monitoring"
	@echo "3. Use 'venv/bin/python -m price_monitor.cli --help' for more commands"

# Initialize a new price monitor
init-monitor: venv
	@echo "Initializing new price monitor..."
	@venv/bin/python -m price_monitor.cli init

# Run all configured monitors
run-monitors: venv
	@echo "Running all configured price monitors..."
	@venv/bin/python scripts/run_price_monitors.py

analyze: venv
	@echo "Analyzing price drops across all monitors..."
	@venv/bin/python -m price_monitor.cli analyze

analyze-drops: venv
	@echo "Analyzing price drops with custom threshold..."
	@venv/bin/python -m price_monitor.cli analyze --min-drop 10.0

verify-price: venv
	@echo "Verifying price with Shop'n'Scan (test UPC: 713733252843, store: 71)..."
	@venv/bin/python -m price_monitor.cli verify 713733252843 71

verify-price-custom: venv
	@echo "Usage: make verify-price-custom UPC=<upc> STORE=<store_id> [EXPECTED=<price>]"
	@if [ -n "$(UPC)" ] && [ -n "$(STORE)" ]; then \
		if [ -n "$(EXPECTED)" ]; then \
			venv/bin/python -m price_monitor.cli verify $(UPC) $(STORE) --expected-price $(EXPECTED); \
		else \
			venv/bin/python -m price_monitor.cli verify $(UPC) $(STORE); \
		fi; \
	else \
		echo "Please provide UPC and STORE parameters"; \
		echo "Example: make verify-price-custom UPC=713733252843 STORE=71 EXPECTED=24.99"; \
	fi

history: venv
	@echo "Showing price history for monitors..."
	@venv/bin/python -m price_monitor.cli list
	@echo ""
	@echo "Use 'make history-show MONITOR=<name>' to see detailed history for a specific monitor"

history-show: venv
	@if [ -n "$(MONITOR)" ]; then \
		venv/bin/python -m price_monitor.cli history $(MONITOR); \
	else \
		echo "Please provide MONITOR parameter"; \
		echo "Example: make history-show MONITOR=LEGO_Jurassic"; \
	fi

# Set up cron job for automated monitoring
cron-setup: venv
	@echo "Setting up cron job for automated price monitoring..."
	@echo "This will add a cron job to run every 6 hours (4 times per day)"
	@echo ""
	@read -p "Press Enter to continue or Ctrl+C to cancel..."
	@echo ""
	@echo "Current cron jobs:"
	@crontab -l 2>/dev/null || echo "No cron jobs configured"
	@echo ""
	@echo "Adding price monitoring cron job..."
	@(crontab -l 2>/dev/null; echo "0 */6 * * * cd $(PWD) && $(PWD)/venv/bin/python $(PWD)/scripts/run_price_monitors.py >> $(PWD)/price_data/logs/cron.log 2>&1") | crontab -
	@echo "Cron job added successfully!"
	@echo "The price monitors will now run automatically every 6 hours"
	@echo "Logs will be saved to price_data/logs/cron.log"

# Remove cron job for automated monitoring
cron-remove:
	@echo "Removing price monitoring cron job..."
	@crontab -l 2>/dev/null | grep -v "run_price_monitors.py" | crontab -
	@echo "Cron job removed successfully!"

# Show current cron configuration
cron-status:
	@echo "Current cron jobs:"
	@crontab -l 2>/dev/null || echo "No cron jobs configured"
	@echo ""
	@echo "Price monitoring cron jobs:"
	@crontab -l 2>/dev/null | grep "run_price_monitors.py" || echo "No price monitoring cron jobs found"

# Show recent monitoring logs
logs:
	@echo "Recent price monitoring logs:"
	@if [ -d "price_data/logs" ]; then \
		echo "=== Latest execution log ==="; \
		ls -t price_data/logs/execution_summary_*.json 2>/dev/null | head -1 | xargs cat 2>/dev/null || echo "No execution logs found"; \
		echo ""; \
		echo "=== Latest daily log ==="; \
		ls -t price_data/logs/price_monitor_*.log 2>/dev/null | head -1 | xargs tail -20 2>/dev/null || echo "No daily logs found"; \
	else \
		echo "No logs directory found. Run 'make setup' first."; \
	fi

# Clean up temporary files and logs
clean:
	@echo "Cleaning up temporary files and logs..."
	@rm -rf __pycache__/
	@rm -rf .pytest_cache/
	@rm -rf htmlcov/
	@rm -rf .coverage
	@find . -name "*.pyc" -delete
	@find . -name "__pycache__" -type d -exec rm -rf {} + 2>/dev/null || true
	@echo "Cleanup complete!"

# Run tests
test: venv
	@echo "Running tests..."
	@venv/bin/python -m pytest tests/ -v

# Show system status
status: venv
	@echo "Price Monitoring System Status"
	@echo "=============================="
	@echo ""
	@echo "Virtual Environment: $(shell [ -d "venv" ] && echo "✅ Active" || echo "❌ Not found")"
	@echo "Price Data Directory: $(shell [ -d "price_data" ] && echo "✅ Exists" || echo "❌ Not found")"
	@echo ""
	@if [ -d "price_data/config" ]; then \
		echo "Configured Monitors:"; \
		if [ -f "price_data/config/monitors.json" ]; then \
			venv/bin/python -c "import json; data=json.load(open('price_data/config/monitors.json')); print(f'  • {len(data)} monitors configured'); [print(f'    - {m[\"name\"]} ({m[\"search_query\"]})') for m in data.values()]"; \
		else \
			echo "  • No monitors configured"; \
		fi; \
	else \
		echo "No configuration directory found"; \
	fi
	@echo ""
	@echo "Cron Status:"
	@crontab -l 2>/dev/null | grep "run_price_monitors.py" >/dev/null && echo "  ✅ Cron job active" || echo "  ❌ No cron job configured"
	@echo ""
	@echo "Recent Activity:"
	@if [ -d "price_data/logs" ]; then \
		echo "  • Logs directory: $(shell ls -1 price_data/logs/*.log 2>/dev/null | wc -l) log files"; \
		echo "  • Results: $(shell ls -1 price_data/results/*.json 2>/dev/null | wc -l) result files"; \
		echo "  • Executions: $(shell ls -1 price_data/executions/*.json 2>/dev/null | wc -l) execution summaries"; \
	else \
		echo "  • No logs directory found"; \
	fi

# Quick start guide
quickstart: venv
	@echo "🚀 Quick Start Guide for Meijer Price Monitor"
	@echo ""
	@echo "1. 📋 List current monitors:"
	@echo "   make list"
	@echo ""
	@echo "2. 🔍 Create a new monitor:"
	@echo "   make init-monitor"
	@echo ""
	@echo "3. 📊 Run all monitors:"
	@echo "   make run-monitors"
	@echo ""
	@echo "4. 📈 Analyze price drops:"
	@echo "   make analyze"
	@echo "   make analyze-drops  # Show drops ≥10%"
	@echo ""
	@echo "5. ✅ Verify prices with Shop'n'Scan:"
	@echo "   make verify-price  # Test with UPC 713733252843 at store 71"
	@echo "   make verify-price-custom UPC=123456789012 STORE=45"
	@echo ""
	@echo "6. 📚 View price history:"
	@echo "   make history"
	@echo "   make history-show MONITOR=LEGO_Jurassic"
	@echo ""
	@echo "7. ⚙️  Set up automated monitoring:"
	@echo "   make cron-setup"
	@echo ""
	@echo "8. 📊 View system status:"
	@echo "   make status"
	@echo ""
	@echo "🎯 Example workflow:"
	@echo "   make init-monitor          # Create LEGO monitor"
	@echo "   make run-monitors          # Run initial scan"
	@echo "   # ... wait a few days ..."
	@echo "   make run-monitors          # Run follow-up scan"
	@echo "   make analyze               # See what dropped in price!"
	@echo "   make verify-price          # Verify a specific item"

# Install the package in development mode
install-dev: venv
	@echo "Installing package in development mode..."
	@venv/bin/pip install -e .
	@echo "Package installed successfully!"

# Build the package
build: venv
	@echo "Building package..."
	@venv/bin/python setup.py sdist bdist_wheel
	@echo "Package built successfully!"

# Install the built package
install: build
	@echo "Installing built package..."
	@venv/bin/pip install dist/*.whl
	@echo "Package installed successfully!"
