#!/bin/bash

# Run all Python demos in the demos directory
# This script will execute all .py files and report any errors or warnings

set -e  # Exit on any error

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_ROOT="$(dirname "$SCRIPT_DIR")"
VENV_PYTHON="${PROJECT_ROOT}/venv/bin/python"

echo "🚀 Running all demos in demos/ directory..."
echo "=============================================="
echo ""

# Check if virtual environment exists
if [ ! -f "$VENV_PYTHON" ]; then
    echo "❌ Virtual environment not found. Please run 'make venv' first."
    exit 1
fi

# Find all Python files (excluding __init__.py and notebook generators)
PYTHON_FILES=$(find "$SCRIPT_DIR" -name "*.py" -type f | grep -v "__init__.py" | grep -v "_notebook_gen.py" | sort)

if [ -z "$PYTHON_FILES" ]; then
    echo "❌ No Python demo files found in demos/ directory"
    exit 1
fi

echo "📁 Found $(echo "$PYTHON_FILES" | wc -l) Python demo files:"
echo "$PYTHON_FILES" | sed 's/^/  /'
echo ""

# Track results
TOTAL_FILES=0
SUCCESS_FILES=0
ERROR_FILES=0
WARNING_FILES=0

# Run each demo file
for demo_file in $PYTHON_FILES; do
    filename=$(basename "$demo_file")
    echo "🔄 Running: $filename"
    echo "----------------------------------------"

    TOTAL_FILES=$((TOTAL_FILES + 1))

    # Run the demo and capture output and errors
    if output=$("$VENV_PYTHON" "$demo_file" 2>&1); then
        echo "✅ SUCCESS: $filename completed without errors"
        SUCCESS_FILES=$((SUCCESS_FILES + 1))

        # Check for warnings in output
        if echo "$output" | grep -qi "warning\|deprecation\|deprecated"; then
            echo "⚠️  WARNINGS detected in $filename:"
            echo "$output" | grep -i "warning\|deprecation\|deprecated" | sed 's/^/    /'
            WARNING_FILES=$((WARNING_FILES + 1))
        fi

        # Show any output (but limit length to avoid spam)
        if [ -n "$output" ]; then
            echo "📤 Output (first 10 lines):"
            echo "$output" | head -10 | sed 's/^/    /'
            if [ "$(echo "$output" | wc -l)" -gt 10 ]; then
                echo "    ... (truncated)"
            fi
        fi
    else
        echo "❌ ERROR: $filename failed with exit code $?"
        ERROR_FILES=$((ERROR_FILES + 1))

        # Show error output
        if [ -n "$output" ]; then
            echo "📤 Error output:"
            echo "$output" | sed 's/^/    /'
        fi
    fi

    echo ""
done

# Summary
echo "=============================================="
echo "📊 DEMO EXECUTION SUMMARY"
echo "=============================================="
echo "Total files processed: $TOTAL_FILES"
echo "✅ Successful: $SUCCESS_FILES"
echo "❌ Failed: $ERROR_FILES"
echo "⚠️  With warnings: $WARNING_FILES"
echo ""

if [ $ERROR_FILES -eq 0 ]; then
    echo "🎉 All demos completed successfully!"
    exit 0
else
    echo "💥 Some demos failed. Please check the errors above."
    exit 1
fi
