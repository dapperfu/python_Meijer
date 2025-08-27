#!/bin/bash

# Meijer API Client - Portable Logging Script
# This script provides the same functionality as "make log" but is portable
# Usage: ./mitmlog.sh or alias mitmlog=~/.local/bin/mitmlog.sh

# Function to start mitmweb logging
start_logging() {
    echo "🚀 Starting mitmweb..."
    echo "📱 Use the Meijer app while this is running"
    echo "🌐 Web interface available at http://localhost:8081"
    echo "🔌 SOCKS5 proxy available on 0.0.0.0:1080"
    echo "🌍 HTTP proxy available on 0.0.0.0:8080"
    echo "⏹️  Press Ctrl+C when done"
    echo "🔑 After stopping, extract authentication tokens as needed"
    echo ""
    mkdir -p logs
    echo "📁 Logs will be stored in logs/ directory"
    echo ""
    mitmweb --mode wireguard --mode regular@0.0.0.0:8080 --mode socks5@0.0.0.0:1080 --web-port 8081 --web-host 0.0.0.0 -w "logs/meijer_mitm_$(date +%Y%m%d_%H%M%S).log" -s tools/shop_n_scan_faker.py --set block_global=false
}

# Function to show available logs
show_logs() {
    echo "📁 Available log files:"
    if [ -d "logs" ]; then
        ls -la logs/meijer_mitm_*.log 2>/dev/null | head -10 || echo "❌ No log files found in logs/ directory"
    else
        echo "❌ No logs/ directory found"
    fi
    echo ""
    echo "💡 Extract authentication tokens from log files as needed for your project"
}

# Main script logic
case "${1:-log}" in
    "log"|"start")
        start_logging
        ;;
    "logs"|"list")
        show_logs
        ;;
    "help"|"-h"|"--help")
        echo "🚀 Meijer API Client - Portable Logging Script"
        echo "=============================================="
        echo ""
        echo "Usage: $0 [command]"
        echo ""
        echo "Commands:"
        echo "  log, start    - Start mitmweb logging (default)"
        echo "  logs, list    - Show available log files"
        echo "  help, -h      - Show this help message"
        echo ""
        echo "Examples:"
        echo "  $0              - Start logging (same as 'make log')"
        echo "  $0 logs         - Show logs (same as 'make logs')"
        echo "  $0 help         - Show this help"
        echo ""
        echo "💡 This script provides the same functionality as 'make log'"
        echo "💡 Use as alias: alias mitmlog=~/.local/bin/mitmlog.sh"
        ;;
    *)
        echo "❌ Unknown command: $1"
        echo "💡 Use '$0 help' for usage information"
        exit 1
        ;;
esac
