#!/bin/bash

# LEGO Price Collection Cron Job Script
# Automatically collects LEGO prices from Meijer API

# Configuration
SCRIPT_DIR="/projects/python_Meijer/meijer-price-monitor"
LOG_DIR="/projects/python_Meijer/logs/cron"
LOG_FILE="$LOG_DIR/lego_price_collection_$(date +%Y%m%d).log"
VENV_PATH="$SCRIPT_DIR/venv"
PYTHON_SCRIPT="$SCRIPT_DIR/real_price_monitor.py"

# Create log directory if it doesn't exist
mkdir -p "$LOG_DIR"

# Function to log with timestamp
log() {
    echo "[$(date '+%Y-%m-%d %H:%M:%S')] $1" | tee -a "$LOG_FILE"
}

# Function to send notification (optional)
notify() {
    local message="$1"
    local status="$2"
    
    # Log the notification
    log "NOTIFICATION: $message"
    
    # You can add email, Slack, or other notification methods here
    # Example: echo "$message" | mail -s "LEGO Price Collection $status" your-email@example.com
}

# Start collection
log "🚀 Starting automated LEGO price collection..."
log "📁 Script directory: $SCRIPT_DIR"
log "🐍 Virtual environment: $VENV_PATH"
log "📊 Log file: $LOG_FILE"

# Check if virtual environment exists
if [ ! -d "$VENV_PATH" ]; then
    log "❌ ERROR: Virtual environment not found at $VENV_PATH"
    notify "LEGO price collection failed: Virtual environment not found" "FAILED"
    exit 1
fi

# Check if Python script exists
if [ ! -f "$PYTHON_SCRIPT" ]; then
    log "❌ ERROR: Python script not found at $PYTHON_SCRIPT"
    notify "LEGO price collection failed: Python script not found" "FAILED"
    exit 1
fi

# Change to script directory
cd "$SCRIPT_DIR" || {
    log "❌ ERROR: Cannot change to directory $SCRIPT_DIR"
    notify "LEGO price collection failed: Cannot access script directory" "FAILED"
    exit 1
}

# Activate virtual environment and run script
log "🔄 Activating virtual environment and running price collection..."

# Run the price collection script
if "$VENV_PATH/bin/python" "$PYTHON_SCRIPT" >> "$LOG_FILE" 2>&1; then
    log "✅ LEGO price collection completed successfully"
    
    # Get collection stats from the log
    COLLECTED=$(grep "Collected:" "$LOG_FILE" | tail -1 | grep -o '[0-9]\+' | head -1)
    FAILED=$(grep "Failed:" "$LOG_FILE" | tail -1 | grep -o '[0-9]\+' | head -1)
    TOTAL=$(grep "Total:" "$LOG_FILE" | tail -1 | grep -o '[0-9]\+' | head -1)
    
    if [ -n "$COLLECTED" ] && [ -n "$TOTAL" ]; then
        log "📊 Collection Summary: $COLLECTED collected, $FAILED failed, $TOTAL total"
        
        # Send success notification
        notify "LEGO price collection successful: $COLLECTED/$TOTAL products collected" "SUCCESS"
    else
        log "⚠️  Could not parse collection statistics"
        notify "LEGO price collection completed but stats unclear" "WARNING"
    fi
else
    log "❌ ERROR: LEGO price collection failed"
    notify "LEGO price collection failed: Check logs for details" "FAILED"
    exit 1
fi

# Check for price drops
log "🔍 Checking for significant price drops..."
if "$VENV_PATH/bin/python" "$SCRIPT_DIR/check_price_drops.py" >> "$LOG_FILE" 2>&1; then
    log "✅ Price drop analysis completed"
else
    log "⚠️  Price drop analysis had issues"
fi

log "🏁 Automated LEGO price collection session completed"
log "📄 Full log available at: $LOG_FILE"

exit 0
