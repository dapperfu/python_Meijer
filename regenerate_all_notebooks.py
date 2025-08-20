#!/usr/bin/env python3
"""
Regenerate all Jupyter notebooks from their Python generation scripts

This script runs all the notebook generation scripts to create fresh notebooks
with proper execution outputs.
"""

import os
import subprocess
import sys


def run_generation_script(script_path):
    """Run a notebook generation script and return success status"""
    try:
        print(f"Running {script_path}...")
        result = subprocess.run(
            [sys.executable, script_path],
            capture_output=True,
            text=True,
            cwd="notebooks",
        )

        if result.returncode == 0:
            print(f"✅ {script_path} completed successfully")
            if result.stdout:
                print(f"   Output: {result.stdout.strip()}")
            return True
        else:
            print(f"❌ {script_path} failed with return code {result.returncode}")
            if result.stderr:
                print(f"   Error: {result.stderr.strip()}")
            return False

    except Exception as e:
        print(f"❌ Error running {script_path}: {e}")
        return False


def main():
    """Regenerate all notebooks"""

    print("🔄 Regenerating all Jupyter notebooks...")
    print("=" * 50)

    # Get all notebook generation files
    notebook_dir = "notebooks"
    generation_scripts = []

    for filename in os.listdir(notebook_dir):
        if filename.endswith("_notebook_gen.py"):
            generation_scripts.append(filename)

    print(f"Found {len(generation_scripts)} generation scripts:")
    for script in generation_scripts:
        print(f"  - {script}")

    print("\n" + "=" * 50)

    # Run each generation script
    successful = 0
    failed = 0

    for script in sorted(generation_scripts):
        script_path = script
        if run_generation_script(script_path):
            successful += 1
        else:
            failed += 1
        print()

    # Summary
    print("=" * 50)
    print("📊 Regeneration Summary:")
    print(f"   ✅ Successful: {successful}")
    print(f"   ❌ Failed: {failed}")
    print(f"   📁 Total: {len(generation_scripts)}")

    if failed == 0:
        print("\n🎉 All notebooks regenerated successfully!")
    else:
        print(f"\n⚠️  {failed} notebooks failed to regenerate. Check the errors above.")

    return failed == 0


if __name__ == "__main__":
    success = main()
    sys.exit(0 if success else 1)
