#!/usr/bin/env python3
"""
Pre-commit hook to check file line count using wc command.
Blocks commits of files longer than 1024 lines.
"""

import subprocess
import sys
from pathlib import Path


def check_file_length(file_path: str, max_lines: int = 1024) -> bool:
    """
    Check if a file exceeds the maximum line count using wc -l.
    
    Args:
        file_path: Path to the file to check
        max_lines: Maximum allowed lines (default: 1024)
        
    Returns:
        True if file is within limit, False if it exceeds limit
    """
    try:
        # Use wc -l to count lines
        result = subprocess.run(
            ['wc', '-l', file_path],
            capture_output=True,
            text=True,
            check=True
        )
        
        # Parse the output: wc -l returns "line_count filename"
        line_count = int(result.stdout.strip().split()[0])
        
        if line_count > max_lines:
            print(f"❌ {file_path}: {line_count} lines (exceeds {max_lines} line limit)")
            return False
        else:
            print(f"✅ {file_path}: {line_count} lines (within {max_lines} line limit)")
            return True
            
    except subprocess.CalledProcessError as e:
        print(f"⚠️  Error checking {file_path}: {e}")
        return True  # Allow commit if we can't check the file
    except (ValueError, IndexError) as e:
        print(f"⚠️  Error parsing wc output for {file_path}: {e}")
        return True  # Allow commit if we can't parse the output


def main():
    """Main function to check all staged files."""
    # Get list of files from command line arguments
    if len(sys.argv) < 2:
        print("Usage: check_file_length.py <file1> [file2] ...")
        sys.exit(1)
    
    files_to_check = sys.argv[1:]
    failed_files = []
    
    print("🔍 Checking file line counts...")
    print(f"📏 Maximum allowed lines: 1024")
    print("-" * 50)
    
    for file_path in files_to_check:
        if Path(file_path).exists():
            if not check_file_length(file_path):
                failed_files.append(file_path)
        else:
            print(f"⚠️  File not found: {file_path}")
    
    print("-" * 50)
    
    if failed_files:
        print(f"❌ {len(failed_files)} file(s) exceed the 1024 line limit:")
        for file_path in failed_files:
            print(f"   - {file_path}")
        print("\n💡 Please split these files or reduce their size before committing.")
        sys.exit(1)
    else:
        print("✅ All files are within the line limit!")
        sys.exit(0)


if __name__ == "__main__":
    main()
