#!/usr/bin/env python3
"""
Execute Jupyter notebooks and save output in place.

This script is used as a pre-commit hook to ensure all notebooks have their
cell outputs saved, so they can be properly displayed on GitHub.
"""

import argparse
import json
import subprocess
import sys
from pathlib import Path
from typing import List, Optional


def execute_notebook(notebook_path: Path, allow_errors: bool = True) -> bool:
    """
    Execute a Jupyter notebook and save the output in place.
    
    Args:
        notebook_path: Path to the notebook file
        allow_errors: Whether to allow execution errors
        
    Returns:
        True if successful, False otherwise
    """
    try:
        # Use jupyter nbconvert to execute the notebook
        cmd = [
            sys.executable, "-m", "jupyter", "nbconvert",
            "--execute",
            "--inplace",
            str(notebook_path)
        ]
        
        if allow_errors:
            cmd.append("--allow-errors")
            
        result = subprocess.run(cmd, capture_output=True, text=True, cwd=notebook_path.parent)
        
        if result.returncode != 0:
            print(f"Error executing {notebook_path}: {result.stderr}")
            return False
            
        print(f"Successfully executed {notebook_path}")
        return True
        
    except Exception as e:
        print(f"Exception executing {notebook_path}: {e}")
        return False


def find_notebooks(directory: Path) -> List[Path]:
    """
    Find all Jupyter notebook files in the given directory.
    
    Args:
        directory: Directory to search for notebooks
        
    Returns:
        List of notebook file paths
    """
    return list(directory.glob("*.ipynb"))


def main():
    """Main function to execute notebooks."""
    parser = argparse.ArgumentParser(description="Execute Jupyter notebooks")
    parser.add_argument("--directory", "-d", default="notebooks", 
                       help="Directory containing notebooks (default: notebooks)")
    parser.add_argument("--allow-errors", "-e", action="store_true", default=True,
                       help="Allow execution errors (default: True)")
    parser.add_argument("--files", nargs="*", help="Specific notebook files to execute")
    
    args = parser.parse_args()
    
    directory = Path(args.directory)
    
    if not directory.exists():
        print(f"Directory {directory} does not exist")
        sys.exit(1)
    
    if args.files:
        # Execute specific files
        notebook_paths = [Path(f) for f in args.files if f.endswith('.ipynb')]
    else:
        # Execute all notebooks in directory
        notebook_paths = find_notebooks(directory)
    
    if not notebook_paths:
        print(f"No notebooks found in {directory}")
        return
    
    print(f"Found {len(notebook_paths)} notebooks to execute")
    
    success_count = 0
    for notebook_path in notebook_paths:
        if execute_notebook(notebook_path, args.allow_errors):
            success_count += 1
    
    print(f"Successfully executed {success_count}/{len(notebook_paths)} notebooks")
    
    if success_count < len(notebook_paths):
        sys.exit(1)


if __name__ == "__main__":
    main()
