#!/usr/bin/env python3
"""
Execute Jupyter notebooks to demonstrate their functionality

This script runs the notebooks to show actual execution outputs and results.
"""

import os
import sys

import nbformat
from nbconvert.preprocessors import ExecutePreprocessor


def execute_notebook(notebook_path):
    """Execute a notebook and return success status"""
    try:
        print(f"Executing {notebook_path}...")

        # Load the notebook
        with open(notebook_path, "r", encoding="utf-8") as f:
            nb = nbformat.read(f, as_version=4)

        # Execute the notebook
        ep = ExecutePreprocessor(timeout=600, kernel_name="python3")
        ep.preprocess(nb, {"metadata": {"path": "notebooks/"}})

        # Save the executed notebook
        with open(notebook_path, "w", encoding="utf-8") as f:
            nbformat.write(nb, f)

        print(f"✅ {notebook_path} executed successfully")
        return True

    except Exception as e:
        print(f"❌ Error executing {notebook_path}: {e}")
        return False


def main():
    """Execute all notebooks"""

    print("🚀 Executing Jupyter notebooks to demonstrate functionality...")
    print("=" * 60)

    # Get all notebook files
    notebook_dir = "notebooks"
    notebook_files = []

    for filename in os.listdir(notebook_dir):
        if filename.endswith(".ipynb"):
            notebook_files.append(filename)

    print(f"Found {len(notebook_files)} notebooks:")
    for notebook in notebook_files:
        print(f"  - {notebook}")

    print("\n" + "=" * 60)

    # Execute each notebook
    successful = 0
    failed = 0

    for notebook in sorted(notebook_files):
        notebook_path = os.path.join(notebook_dir, notebook)
        if execute_notebook(notebook_path):
            successful += 1
        else:
            failed += 1
        print()

    # Summary
    print("=" * 60)
    print("📊 Execution Summary:")
    print(f"   ✅ Successful: {successful}")
    print(f"   ❌ Failed: {failed}")
    print(f"   📁 Total: {len(notebook_files)}")

    if failed == 0:
        print("\n🎉 All notebooks executed successfully!")
        print(
            "The notebooks now contain execution outputs and demonstrate their functionality."
        )
    else:
        print(f"\n⚠️  {failed} notebooks failed to execute. Check the errors above.")

    return failed == 0


if __name__ == "__main__":
    success = main()
    sys.exit(0 if success else 1)
