# Git Pre-commit Hook Setup

This project includes a git pre-commit hook that prevents files longer than 1024 lines from being committed.

## What the Hook Does

The pre-commit hook checks:
1. **File size**: Blocks files larger than 1MB
2. **Line count**: Blocks files with more than 1024 lines (using `wc -l`)
3. **File types**: Blocks sensitive/binary file types

## Setup Instructions

### Automatic Setup (Recommended)
The hook is already installed in `.git/hooks/pre-commit` and will run automatically on every commit.

### Manual Setup
If you need to reinstall the hook:

1. Copy the hook script to your git hooks directory:
   ```bash
   cp .git/hooks/pre-commit .git/hooks/pre-commit.backup
   ```

2. Make sure the hook is executable:
   ```bash
   chmod +x .git/hooks/pre-commit
   ```

## How It Works

The hook uses the `wc -l` command to count lines in text files:
- Only checks files that are staged for commit
- Skips binary files (detected using the `file` command)
- Provides clear error messages when files exceed limits

## Example Output

When a file exceeds the line limit:
```
🔍 Checking file sizes and line counts...
❌ ERROR: File 'large_file.py' is too long: 1500 lines (> 1024 lines)
   This file cannot be committed. Please split it or reduce its size.

🚨 COMMIT BLOCKED: Large, long, or sensitive files detected
   Please fix the issues above before committing
```

## Configuration

You can modify the limits by editing `.git/hooks/pre-commit`:
- `MAX_SIZE`: Maximum file size in bytes (default: 1048576 = 1MB)
- `MAX_LINES`: Maximum line count (default: 1024)

## Troubleshooting

- **Hook not running**: Ensure the file is executable (`chmod +x .git/hooks/pre-commit`)
- **False positives**: The hook only checks text files, not binary files
- **Performance**: The hook only runs on staged files, so it's fast

## Files Affected

The following files in this project currently exceed the 1024 line limit:
- `request_headers.json` (5360 lines) - API response data
- `weekly_ad_analysis.json` (1266 lines) - Analysis results

These files should be:
1. Added to `.gitignore` if they contain sensitive data
2. Split into smaller files if they need to be version controlled
3. Generated programmatically rather than stored as static files
