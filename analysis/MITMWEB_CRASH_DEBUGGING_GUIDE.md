# Mitmweb Crash Debugging Guide

## Overview

This guide explains the fixes implemented for mitmweb crashing issues and the new debugging tools available to diagnose and prevent future crashes.

## Problem Analysis

### Original Issues
- **mitmweb was crashing before the 30-minute rotation time**
- **Logs were only capturing 10-15 minutes of traffic**
- **No visibility into why mitmweb was exiting**
- **30-minute rotation was creating too many log files (48 per day)**

### Root Causes Identified
1. **Timeout-based rotation**: The original setup used `timeout --foreground -k 5s 30m` which could kill mitmweb unexpectedly
2. **Lack of crash detection**: No logging of exit codes or crash reasons
3. **Resource monitoring**: No visibility into system resources that could cause crashes
4. **Debug output**: No capture of stderr/stderr for error analysis

## Solutions Implemented

### 1. Fixed Log Rotation
- **Changed from 30-minute to 1-hour rotation**
- **Rotation now occurs at XX:00:00 of each hour**
- **Results in 24 log files per day instead of 48**
- **More stable and predictable rotation schedule**

### 2. Enhanced Crash Detection
- **Removed timeout-based killing**
- **Added exit code capture and logging**
- **Enhanced error reporting with timestamps**
- **Automatic restart after crashes with 5-second delay**

### 3. New Debugging Targets

#### `make log-debug`
Enhanced version of `make log` with:
- Debug output capture to separate files
- Process ID tracking
- Enhanced crash reporting
- Better error visibility

#### `make analyze-crashes`
Analyzes existing crash logs:
- Examines debug log files
- Identifies error patterns
- Reports log file sizes (small files indicate crashes)
- Provides crash analysis summary

#### `make check-system`
Checks system resources:
- Memory usage (RAM and swap)
- Disk space availability
- Process limits (file descriptors, max processes)
- Running mitmweb/python processes
- Identifies resource exhaustion issues

#### `make monitor-logs`
Real-time log monitoring:
- Watches logs directory for changes
- Alerts on small log files (potential crashes)
- Provides real-time crash detection
- Requires `inotify-tools` package

#### `make test-mitmweb`
Tests mitmweb configuration:
- Verifies mitmweb installation
- Checks script file availability
- Tests startup process (5-second test)
- Identifies configuration issues

#### `make diagnose-crashes`
Comprehensive crash analysis:
- Runs system checks and log analysis
- Provides actionable recommendations
- Lists common crash causes
- Suggests next steps

#### `make clean-crash-logs`
Maintenance and cleanup:
- Removes old log files (>7 days)
- Cleans up debug log files
- Reports disk usage
- Prevents log directory bloat

## Usage Examples

### Basic Crash Detection
```bash
# Start with enhanced debugging
make log-debug

# In another terminal, monitor for crashes
make monitor-logs

# Check system resources
make check-system
```

### Crash Analysis
```bash
# Analyze existing crashes
make analyze-crashes

# Comprehensive diagnosis
make diagnose-crashes

# Test configuration
make test-mitmweb
```

### Maintenance
```bash
# Clean up old files
make clean-crash-logs

# Check available logs
make logs
```

## Common Crash Causes and Solutions

### 1. Memory Exhaustion
**Symptoms**: Large log files, high memory usage
**Solution**: Check with `make check-system`, monitor memory usage

### 2. Disk Space Issues
**Symptoms**: Write errors, small log files
**Solution**: Check disk space, clean old logs with `make clean-crash-logs`

### 3. Script Errors
**Symptoms**: mitmweb exits immediately, error messages in debug logs
**Solution**: Check `tools/shop_n_scan_faker.py` for syntax errors

### 4. Network Configuration
**Symptoms**: Binding errors, port conflicts
**Solution**: Verify ports 8080, 8081, 1080 are available

### 5. Python Environment Issues
**Symptoms**: Import errors, missing dependencies
**Solution**: Check virtual environment, reinstall dependencies

## Debug Workflow

### When Crashes Occur
1. **Immediate**: Use `make log-debug` for enhanced crash detection
2. **Analysis**: Run `make diagnose-crashes` for comprehensive analysis
3. **Monitoring**: Use `make monitor-logs` for real-time detection
4. **Testing**: Use `make test-mitmweb` to verify configuration

### Prevention
1. **Regular monitoring**: Use `make check-system` periodically
2. **Log cleanup**: Run `make clean-crash-logs` weekly
3. **Resource monitoring**: Watch memory and disk usage
4. **Configuration testing**: Test changes with `make test-mitmweb`

## Technical Details

### Log Rotation Logic
```bash
# New 1-hour rotation
current_hour=$(date +%H)
ts=$(date +%Y%m%d_${current_hour})00
LOG_FILE="logs/meijer_mitm_${ts}.log"
```

### Crash Detection
```bash
# Enhanced exit code handling
mitmweb [options]
EXIT_CODE=$?
echo "⚠️  mitmweb exited with code $EXIT_CODE at $(date)"
if [ $EXIT_CODE -eq 0 ]; then
    echo "✅ mitmweb exited normally"
else
    echo "❌ mitmweb crashed or was killed (exit code: $EXIT_CODE)"
fi
```

### Debug Logging
```bash
# Capture both stdout and stderr
(mitmweb [options] 2>&1 | tee "$DEBUG_LOG") &
MITMWEB_PID=$!
wait $MITMWEB_PID
```

## Benefits of New System

1. **Stability**: 1-hour rotation is more stable than 30-minute
2. **Visibility**: Exit codes and crash reasons are now logged
3. **Debugging**: Comprehensive tools for crash analysis
4. **Maintenance**: Automated cleanup and monitoring
5. **Prevention**: Early detection of resource issues
6. **Documentation**: Clear workflow for crash resolution

## Troubleshooting

### If mitmweb Still Crashes
1. Check system resources: `make check-system`
2. Analyze crash logs: `make analyze-crashes`
3. Test configuration: `make test-mitmweb`
4. Monitor in real-time: `make monitor-logs`
5. Use enhanced debugging: `make log-debug`

### If Debug Tools Don't Work
1. Verify bash version (4.0+ required)
2. Check for required packages (`inotify-tools`)
3. Ensure proper file permissions
4. Check Makefile syntax

## Conclusion

The new system provides comprehensive crash detection, debugging, and prevention tools. The 1-hour rotation schedule is more stable and manageable, while the enhanced debugging capabilities make it much easier to identify and resolve crash issues.

For ongoing monitoring, use `make log-debug` instead of `make log`, and run `make diagnose-crashes` periodically to ensure system health.
